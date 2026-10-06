package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumentipoarticulodp_wc_impl extends GXWebComponent
{
   public informeproduccionresumentipoarticulodp_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumentipoarticulodp_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumentipoarticulodp_wc_impl.class ));
   }

   public informeproduccionresumentipoarticulodp_wc_impl( int remoteHandle ,
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
               AV8Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Emprcod", AV8Emprcod);
               AV70HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70HisEstReo", GXutil.str( AV70HisEstReo, 1, 0));
               AV34Maqcod1 = httpContext.GetPar( "Maqcod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
               AV35Maqcod2 = httpContext.GetPar( "Maqcod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
               AV22Hisprofec1 = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprofec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Hisprofec1", localUtil.ttoc( AV22Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV23Hisprofec2 = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprofec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Hisprofec2", localUtil.ttoc( AV23Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV92OperarioFrom = (short)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92OperarioFrom), 4, 0));
               AV93OperarioTo = (short)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93OperarioTo), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV8Emprcod,Byte.valueOf(AV70HisEstReo),AV34Maqcod1,AV35Maqcod2,AV22Hisprofec1,AV23Hisprofec2,Short.valueOf(AV92OperarioFrom),Short.valueOf(AV93OperarioTo)});
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV50SDTInformeProduccionResumenTipoArticulo);
      AV86TotGrid_HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TotGrid_HisProKgr"), ".") ;
      AV87TotGrid_HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotGrid_HisProMtr"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV50SDTInformeProduccionResumenTipoArticulo, AV86TotGrid_HisProKgr, AV87TotGrid_HisProMtr, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa22I2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Produccion Resumen Tipo Articulo", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumentipoarticulodp_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV70HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34Maqcod1)),GXutil.URLEncode(GXutil.rtrim(AV35Maqcod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV22Hisprofec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV23Hisprofec2)),GXutil.URLEncode(GXutil.ltrimstr(AV92OperarioFrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV93OperarioTo,4,0))}, new String[] {"Emprcod","HisEstReo","Maqcod1","Maqcod2","Hisprofec1","Hisprofec2","OperarioFrom","OperarioTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO", getSecureSignedToken( sPrefix, AV50SDTInformeProduccionResumenTipoArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotGrid_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV87TotGrid_HisProMtr, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtinformeproduccionresumentipoarticulo", AV50SDTInformeProduccionResumenTipoArticulo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtinformeproduccionresumentipoarticulo", AV50SDTInformeProduccionResumenTipoArticulo);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Sdtinformeproduccionresumentipoarticulo", getSecureSignedToken( sPrefix, AV50SDTInformeProduccionResumenTipoArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Emprcod", GXutil.rtrim( wcpOAV8Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV70HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Maqcod1", GXutil.rtrim( wcpOAV34Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Maqcod2", GXutil.rtrim( wcpOAV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22Hisprofec1", localUtil.ttoc( wcpOAV22Hisprofec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Hisprofec2", localUtil.ttoc( wcpOAV23Hisprofec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV92OperarioFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV92OperarioFrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV93OperarioTo", GXutil.ltrim( localUtil.ntoc( wcpOAV93OperarioTo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO", AV50SDTInformeProduccionResumenTipoArticulo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO", AV50SDTInformeProduccionResumenTipoArticulo);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO", getSecureSignedToken( sPrefix, AV50SDTInformeProduccionResumenTipoArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRID_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV86TotGrid_HisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotGrid_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRID_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV87TotGrid_HisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV87TotGrid_HisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV8Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV70HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV34Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.ttoc( AV22Hisprofec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.ttoc( AV23Hisprofec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOFROM", GXutil.ltrim( localUtil.ntoc( AV92OperarioFrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOTO", GXutil.ltrim( localUtil.ntoc( AV93OperarioTo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm22I2( )
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
      return "Produccion.InformeProduccionResumenTipoArticuloDP_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen Tipo Articulo", "") ;
   }

   public void wb22I0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumentipoarticulodp_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuaexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnuaexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUAEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_22_22I2( true) ;
      }
      else
      {
         wb_table1_22_22I2( false) ;
      }
      return  ;
   }

   public void wb_table1_22_22I2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
            AV96GXV1 = nGXsfl_39_idx ;
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
         wb_table2_53_22I2( true) ;
      }
      else
      {
         wb_table2_53_22I2( false) ;
      }
      return  ;
   }

   public void wb_table2_53_22I2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV15GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV16GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV108Pgmname), GXutil.rtrim( localUtil.format( AV108Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotalkilo_Internalname, GXutil.ltrim( localUtil.ntoc( AV56TotalKilo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV56TotalKilo, "ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotalkilo_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotalkilo_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotalmetro_Internalname, GXutil.ltrim( localUtil.ntoc( AV57TotalMetro, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV57TotalMetro, "ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotalmetro_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotalmetro_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavLongvarchar_Internalname, AV90Longvarchar, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", (short)(0), edtavLongvarchar_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_kg_Internalname, GXutil.ltrim( localUtil.ntoc( AV54TOTAL_KG, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV54TOTAL_KG, "Z,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_kg_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotal_kg_Visible, 1, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_mt_Internalname, GXutil.ltrim( localUtil.ntoc( AV55TOTAL_MT, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV55TOTAL_MT, "Z,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_mt_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotal_mt_Visible, 1, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         /* User Defined Control */
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
               AV96GXV1 = nGXsfl_39_idx ;
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

   public void start22I2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen Tipo Articulo", ""), (short)(0)) ;
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
            strup22I0( ) ;
         }
      }
   }

   public void ws22I2( )
   {
      start22I2( ) ;
      evt22I2( ) ;
   }

   public void evt22I2( )
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
                              strup22I0( ) ;
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
                              strup22I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1122I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1222I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUAEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DouaExcel' */
                                 e1322I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluegrid_hisprokgr_Internalname ;
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
                              strup22I0( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           AV96GXV1 = (int)(nGXsfl_39_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().size() >= AV96GXV1 ) && ( AV96GXV1 > 0 ) )
                           {
                              AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)) );
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
                                       GX_FocusControl = edtavTotvaluegrid_hisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1422I2 ();
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
                                       GX_FocusControl = edtavTotvaluegrid_hisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1522I2 ();
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
                                       GX_FocusControl = edtavTotvaluegrid_hisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1622I2 ();
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
                                    strup22I0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluegrid_hisprokgr_Internalname ;
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

   public void we22I2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm22I2( ) ;
         }
      }
   }

   public void pa22I2( )
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
            GX_FocusControl = edtavTotvaluegrid_hisprokgr_Internalname ;
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
                                 app.produccion.SdtSDTInformeProduccionResumenTipoArticulo AV50SDTInformeProduccionResumenTipoArticulo ,
                                 java.math.BigDecimal AV86TotGrid_HisProKgr ,
                                 java.math.BigDecimal AV87TotGrid_HisProMtr ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1522I2 ();
      GRID_nCurrentRecord = 0 ;
      rf22I2( ) ;
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
      rf22I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV108Pgmname = "Produccion.InformeProduccionResumenTipoArticuloDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Pgmname", AV108Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluegrid_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegrid_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegrid_hisprokgr_Enabled), 5, 0), true);
      edtavTotvaluegrid_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegrid_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegrid_hispromtr_Enabled), 5, 0), true);
   }

   public void rf22I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e1522I2 ();
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
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_392( ) ;
         e1622I2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_39_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1622I2 ();
         }
         wbEnd = (short)(39) ;
         wb22I0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22I2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO", AV50SDTInformeProduccionResumenTipoArticulo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO", AV50SDTInformeProduccionResumenTipoArticulo);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO", getSecureSignedToken( sPrefix, AV50SDTInformeProduccionResumenTipoArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRID_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV86TotGrid_HisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotGrid_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRID_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV87TotGrid_HisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV87TotGrid_HisProMtr, "ZZZZZ9.99")));
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
      return AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50SDTInformeProduccionResumenTipoArticulo, AV86TotGrid_HisProKgr, AV87TotGrid_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50SDTInformeProduccionResumenTipoArticulo, AV86TotGrid_HisProKgr, AV87TotGrid_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50SDTInformeProduccionResumenTipoArticulo, AV86TotGrid_HisProKgr, AV87TotGrid_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50SDTInformeProduccionResumenTipoArticulo, AV86TotGrid_HisProKgr, AV87TotGrid_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50SDTInformeProduccionResumenTipoArticulo, AV86TotGrid_HisProKgr, AV87TotGrid_HisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV108Pgmname = "Produccion.InformeProduccionResumenTipoArticuloDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Pgmname", AV108Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluegrid_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegrid_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegrid_hisprokgr_Enabled), 5, 0), true);
      edtavTotvaluegrid_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegrid_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegrid_hispromtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup22I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1422I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtinformeproduccionresumentipoarticulo"), AV50SDTInformeProduccionResumenTipoArticulo);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO"), AV50SDTInformeProduccionResumenTipoArticulo);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV8Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV8Emprcod") ;
         wcpOAV70HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34Maqcod1 = httpContext.cgiGet( sPrefix+"wcpOAV34Maqcod1") ;
         wcpOAV35Maqcod2 = httpContext.cgiGet( sPrefix+"wcpOAV35Maqcod2") ;
         wcpOAV22Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV22Hisprofec1"), 0) ;
         wcpOAV23Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV23Hisprofec2"), 0) ;
         wcpOAV92OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV92OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV93OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV93OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_39_fel_idx = 0 ;
         while ( nGXsfl_39_fel_idx < nRC_GXsfl_39 )
         {
            nGXsfl_39_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_fel_idx+1) ;
            sGXsfl_39_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_392( ) ;
            AV96GXV1 = (int)(nGXsfl_39_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().size() >= AV96GXV1 ) && ( AV96GXV1 > 0 ) )
            {
               AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)) );
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
         AV88TotValueGrid_HisProKgr = httpContext.cgiGet( edtavTotvaluegrid_hisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueGrid_HisProKgr", AV88TotValueGrid_HisProKgr);
         AV89TotValueGrid_HisProMtr = httpContext.cgiGet( edtavTotvaluegrid_hispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotValueGrid_HisProMtr", AV89TotValueGrid_HisProMtr);
         AV108Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Pgmname", AV108Pgmname);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotalkilo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotalkilo_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTALKILO");
            GX_FocusControl = edtavTotalkilo_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56TotalKilo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotalKilo", GXutil.ltrimstr( AV56TotalKilo, 6, 2));
         }
         else
         {
            AV56TotalKilo = localUtil.ctond( httpContext.cgiGet( edtavTotalkilo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotalKilo", GXutil.ltrimstr( AV56TotalKilo, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotalmetro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotalmetro_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTALMETRO");
            GX_FocusControl = edtavTotalmetro_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57TotalMetro = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotalMetro", GXutil.ltrimstr( AV57TotalMetro, 6, 2));
         }
         else
         {
            AV57TotalMetro = localUtil.ctond( httpContext.cgiGet( edtavTotalmetro_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotalMetro", GXutil.ltrimstr( AV57TotalMetro, 6, 2));
         }
         AV90Longvarchar = httpContext.cgiGet( edtavLongvarchar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Longvarchar", AV90Longvarchar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_KG");
            GX_FocusControl = edtavTotal_kg_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54TOTAL_KG = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TOTAL_KG", GXutil.ltrimstr( AV54TOTAL_KG, 10, 2));
         }
         else
         {
            AV54TOTAL_KG = localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TOTAL_KG", GXutil.ltrimstr( AV54TOTAL_KG, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_MT");
            GX_FocusControl = edtavTotal_mt_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55TOTAL_MT = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TOTAL_MT", GXutil.ltrimstr( AV55TOTAL_MT, 10, 2));
         }
         else
         {
            AV55TOTAL_MT = localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TOTAL_MT", GXutil.ltrimstr( AV55TOTAL_MT, 10, 2));
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
      e1422I2 ();
      if (returnInSub) return;
   }

   public void e1422I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV81Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumentipoarticulodp_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV81Station = GXt_char1 ;
      GXv_char2[0] = AV8Emprcod ;
      GXv_char3[0] = AV82EmprNom ;
      GXv_char4[0] = AV83UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV81Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumentipoarticulodp_wc_impl.this.AV8Emprcod = GXv_char2[0] ;
      informeproduccionresumentipoarticulodp_wc_impl.this.AV82EmprNom = GXv_char3[0] ;
      informeproduccionresumentipoarticulodp_wc_impl.this.AV83UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Emprcod", AV8Emprcod);
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      edtavTotalkilo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotalkilo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotalkilo_Visible), 5, 0), true);
      edtavTotalmetro_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotalmetro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotalmetro_Visible), 5, 0), true);
      edtavLongvarchar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLongvarchar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLongvarchar_Visible), 5, 0), true);
      edtavTotal_kg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_kg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_kg_Visible), 5, 0), true);
      edtavTotal_mt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_mt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_mt_Visible), 5, 0), true);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_SdtSDTInformeProduccionResumenTipoArticulo5 = AV50SDTInformeProduccionResumenTipoArticulo;
      GXv_SdtSDTInformeProduccionResumenTipoArticulo6[0] = GXt_SdtSDTInformeProduccionResumenTipoArticulo5;
      new app.produccion.dpinformeproduccionresumentipoarticulo(remoteHandle, context).execute( AV8Emprcod, AV70HisEstReo, AV34Maqcod1, AV35Maqcod2, AV22Hisprofec1, AV23Hisprofec2, AV92OperarioFrom, AV93OperarioTo, GXv_SdtSDTInformeProduccionResumenTipoArticulo6) ;
      GXt_SdtSDTInformeProduccionResumenTipoArticulo5 = GXv_SdtSDTInformeProduccionResumenTipoArticulo6[0] ;
      AV50SDTInformeProduccionResumenTipoArticulo = GXt_SdtSDTInformeProduccionResumenTipoArticulo5;
      gx_BV39 = true ;
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "ProgressBar", new Object[] {Integer.valueOf(1),Integer.valueOf(100),Boolean.valueOf(false),httpContext.getMessage( "Iniciando Informe Produccion Resumen Tipo Articulo...", ""),httpContext.getMessage( "GXProgressBarDanger", "")}, true);
      GXv_decimal7[0] = AV84TTotk ;
      GXv_decimal8[0] = AV85TTotMt ;
      new app.produccion.informeproduccionresumentipoarticulototales_pr(remoteHandle, context).execute( AV8Emprcod, AV70HisEstReo, AV34Maqcod1, AV35Maqcod2, AV22Hisprofec1, AV23Hisprofec2, GXv_decimal7, GXv_decimal8) ;
      informeproduccionresumentipoarticulodp_wc_impl.this.AV84TTotk = GXv_decimal7[0] ;
      informeproduccionresumentipoarticulodp_wc_impl.this.AV85TTotMt = GXv_decimal8[0] ;
      AV109GXV13 = 1 ;
      while ( AV109GXV13 <= AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().size() )
      {
         AV72SDTInformeProduccionResumenTipoArticulo_Articulo = (app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV109GXV13));
         if ( AV72SDTInformeProduccionResumenTipoArticulo_Articulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr().doubleValue() > 0 )
         {
            AV24HisProKgr = AV72SDTInformeProduccionResumenTipoArticulo_Articulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr() ;
            AV72SDTInformeProduccionResumenTipoArticulo_Articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo( ((AV84TTotk.doubleValue()>0) ? (AV24HisProKgr.divide(AV84TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         }
         if ( AV72SDTInformeProduccionResumenTipoArticulo_Articulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr().doubleValue() > 0 )
         {
            AV73HisProMtr = AV72SDTInformeProduccionResumenTipoArticulo_Articulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr() ;
            AV72SDTInformeProduccionResumenTipoArticulo_Articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro( ((AV85TTotMt.doubleValue()>0) ? (AV73HisProMtr.divide(AV85TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         }
         AV109GXV13 = (int)(AV109GXV13+1) ;
      }
      AV90Longvarchar = AV50SDTInformeProduccionResumenTipoArticulo.toJSonString(true, true) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Longvarchar", AV90Longvarchar);
   }

   public void e1522I2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'INITIALIZETOTALIZERSGRID' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERSGRID' */
      S122 ();
      if (returnInSub) return;
      AV15GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      AV16GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e1622I2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().size() )
      {
         AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)) );
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
         AV96GXV1 = (int)(AV96GXV1+1) ;
      }
   }

   public void e1122I2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV41PageToGo = subgrid_fnc_currentpage( ) ;
         AV41PageToGo = (int)(AV41PageToGo+1) ;
         subgrid_gotopage( AV41PageToGo) ;
      }
      else
      {
         AV41PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV41PageToGo) ;
      }
   }

   public void e1222I2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1322I2( )
   {
      /* 'DouaExcel' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV79ExcelFilename ;
      GXv_char3[0] = AV80ErrorMessage ;
      new app.produccion.informeproduccionresumentipoarticulodp_wcexcel(remoteHandle, context).execute( AV90Longvarchar, GXv_char4, GXv_char3) ;
      informeproduccionresumentipoarticulodp_wc_impl.this.AV79ExcelFilename = GXv_char4[0] ;
      informeproduccionresumentipoarticulodp_wc_impl.this.AV80ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV79ExcelFilename, "") != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Exportado a Excel", ""));
         callWebObject(formatLink(AV79ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80ErrorMessage);
      }
   }

   public void S112( )
   {
      /* 'INITIALIZETOTALIZERSGRID' Routine */
      returnInSub = false ;
      AV86TotGrid_HisProKgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotGrid_HisProKgr", GXutil.ltrimstr( AV86TotGrid_HisProKgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotGrid_HisProKgr, "ZZZZZ9.99")));
      AV87TotGrid_HisProMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotGrid_HisProMtr", GXutil.ltrimstr( AV87TotGrid_HisProMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV87TotGrid_HisProMtr, "ZZZZZ9.99")));
   }

   public void S122( )
   {
      /* 'CALCULATETOTALIZERSGRID' Routine */
      returnInSub = false ;
      AV110GXV14 = 1 ;
      while ( AV110GXV14 <= AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().size() )
      {
         AV74SDTInformeProduccionResumenTipoArticulo_ArticuloItem = (app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV110GXV14));
         AV86TotGrid_HisProKgr = AV86TotGrid_HisProKgr.add((AV74SDTInformeProduccionResumenTipoArticulo_ArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotGrid_HisProKgr", GXutil.ltrimstr( AV86TotGrid_HisProKgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotGrid_HisProKgr, "ZZZZZ9.99")));
         AV87TotGrid_HisProMtr = AV87TotGrid_HisProMtr.add((AV74SDTInformeProduccionResumenTipoArticulo_ArticuloItem.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotGrid_HisProMtr", GXutil.ltrimstr( AV87TotGrid_HisProMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRID_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV87TotGrid_HisProMtr, "ZZZZZ9.99")));
         AV110GXV14 = (int)(AV110GXV14+1) ;
      }
      AV88TotValueGrid_HisProKgr = localUtil.format( AV86TotGrid_HisProKgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueGrid_HisProKgr", AV88TotValueGrid_HisProKgr);
      AV89TotValueGrid_HisProMtr = localUtil.format( AV87TotGrid_HisProMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotValueGrid_HisProMtr", AV89TotValueGrid_HisProMtr);
   }

   public void wb_table2_53_22I2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegrid_hisprokgr_Internalname, httpContext.getMessage( "Tot Value Grid_His Pro Kgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegrid_hisprokgr_Internalname, AV88TotValueGrid_HisProKgr, GXutil.rtrim( localUtil.format( AV88TotValueGrid_HisProKgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegrid_hisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegrid_hisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegrid_hispromtr_Internalname, httpContext.getMessage( "Tot Value Grid_His Pro Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegrid_hispromtr_Internalname, AV89TotValueGrid_HisProMtr, GXutil.rtrim( localUtil.format( AV89TotValueGrid_HisProMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegrid_hispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegrid_hispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_53_22I2e( true) ;
      }
      else
      {
         wb_table2_53_22I2e( false) ;
      }
   }

   public void wb_table1_22_22I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='TextBlockTitleCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_tipoarticulo_Internalname, httpContext.getMessage( "Datos por Tipo Artículo", ""), "", "", lblTextblock_tipoarticulo_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenTipoArticuloDP_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_22_22I2e( true) ;
      }
      else
      {
         wb_table1_22_22I2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV8Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Emprcod", AV8Emprcod);
      AV70HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70HisEstReo", GXutil.str( AV70HisEstReo, 1, 0));
      AV34Maqcod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
      AV35Maqcod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
      AV22Hisprofec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Hisprofec1", localUtil.ttoc( AV22Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV23Hisprofec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Hisprofec2", localUtil.ttoc( AV23Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV92OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92OperarioFrom), 4, 0));
      AV93OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93OperarioTo), 4, 0));
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
      pa22I2( ) ;
      ws22I2( ) ;
      we22I2( ) ;
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
      sCtrlAV8Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV70HisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV34Maqcod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV35Maqcod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV22Hisprofec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV23Hisprofec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV92OperarioFrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV93OperarioTo = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa22I2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumentipoarticulodp_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa22I2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV8Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Emprcod", AV8Emprcod);
         AV70HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70HisEstReo", GXutil.str( AV70HisEstReo, 1, 0));
         AV34Maqcod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
         AV35Maqcod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
         AV22Hisprofec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Hisprofec1", localUtil.ttoc( AV22Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV23Hisprofec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Hisprofec2", localUtil.ttoc( AV23Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV92OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92OperarioFrom), 4, 0));
         AV93OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93OperarioTo), 4, 0));
      }
      wcpOAV8Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV8Emprcod") ;
      wcpOAV70HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34Maqcod1 = httpContext.cgiGet( sPrefix+"wcpOAV34Maqcod1") ;
      wcpOAV35Maqcod2 = httpContext.cgiGet( sPrefix+"wcpOAV35Maqcod2") ;
      wcpOAV22Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV22Hisprofec1"), 0) ;
      wcpOAV23Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV23Hisprofec2"), 0) ;
      wcpOAV92OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV92OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV93OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV93OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV8Emprcod, wcpOAV8Emprcod) != 0 ) || ( AV70HisEstReo != wcpOAV70HisEstReo ) || ( GXutil.strcmp(AV34Maqcod1, wcpOAV34Maqcod1) != 0 ) || ( GXutil.strcmp(AV35Maqcod2, wcpOAV35Maqcod2) != 0 ) || !( GXutil.dateCompare(AV22Hisprofec1, wcpOAV22Hisprofec1) ) || !( GXutil.dateCompare(AV23Hisprofec2, wcpOAV23Hisprofec2) ) || ( AV92OperarioFrom != wcpOAV92OperarioFrom ) || ( AV93OperarioTo != wcpOAV93OperarioTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV8Emprcod = AV8Emprcod ;
      wcpOAV70HisEstReo = AV70HisEstReo ;
      wcpOAV34Maqcod1 = AV34Maqcod1 ;
      wcpOAV35Maqcod2 = AV35Maqcod2 ;
      wcpOAV22Hisprofec1 = AV22Hisprofec1 ;
      wcpOAV23Hisprofec2 = AV23Hisprofec2 ;
      wcpOAV92OperarioFrom = AV92OperarioFrom ;
      wcpOAV93OperarioTo = AV93OperarioTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV8Emprcod = httpContext.cgiGet( sPrefix+"AV8Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV8Emprcod) > 0 )
      {
         AV8Emprcod = httpContext.cgiGet( sCtrlAV8Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Emprcod", AV8Emprcod);
      }
      else
      {
         AV8Emprcod = httpContext.cgiGet( sPrefix+"AV8Emprcod_PARM") ;
      }
      sCtrlAV70HisEstReo = httpContext.cgiGet( sPrefix+"AV70HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV70HisEstReo) > 0 )
      {
         AV70HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV70HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70HisEstReo", GXutil.str( AV70HisEstReo, 1, 0));
      }
      else
      {
         AV70HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV70HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      sCtrlAV22Hisprofec1 = httpContext.cgiGet( sPrefix+"AV22Hisprofec1_CTRL") ;
      if ( GXutil.len( sCtrlAV22Hisprofec1) > 0 )
      {
         AV22Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV22Hisprofec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Hisprofec1", localUtil.ttoc( AV22Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV22Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV22Hisprofec1_PARM"), 0) ;
      }
      sCtrlAV23Hisprofec2 = httpContext.cgiGet( sPrefix+"AV23Hisprofec2_CTRL") ;
      if ( GXutil.len( sCtrlAV23Hisprofec2) > 0 )
      {
         AV23Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV23Hisprofec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Hisprofec2", localUtil.ttoc( AV23Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV23Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV23Hisprofec2_PARM"), 0) ;
      }
      sCtrlAV92OperarioFrom = httpContext.cgiGet( sPrefix+"AV92OperarioFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV92OperarioFrom) > 0 )
      {
         AV92OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV92OperarioFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92OperarioFrom), 4, 0));
      }
      else
      {
         AV92OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV92OperarioFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV93OperarioTo = httpContext.cgiGet( sPrefix+"AV93OperarioTo_CTRL") ;
      if ( GXutil.len( sCtrlAV93OperarioTo) > 0 )
      {
         AV93OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV93OperarioTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93OperarioTo), 4, 0));
      }
      else
      {
         AV93OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV93OperarioTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa22I2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws22I2( ) ;
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
      ws22I2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Emprcod_PARM", GXutil.rtrim( AV8Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Emprcod_CTRL", GXutil.rtrim( sCtrlAV8Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV70HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70HisEstReo_CTRL", GXutil.rtrim( sCtrlAV70HisEstReo));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Hisprofec1_PARM", localUtil.ttoc( AV22Hisprofec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22Hisprofec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Hisprofec1_CTRL", GXutil.rtrim( sCtrlAV22Hisprofec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Hisprofec2_PARM", localUtil.ttoc( AV23Hisprofec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Hisprofec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Hisprofec2_CTRL", GXutil.rtrim( sCtrlAV23Hisprofec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92OperarioFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV92OperarioFrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV92OperarioFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92OperarioFrom_CTRL", GXutil.rtrim( sCtrlAV92OperarioFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV93OperarioTo_PARM", GXutil.ltrim( localUtil.ntoc( AV93OperarioTo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV93OperarioTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV93OperarioTo_CTRL", GXutil.rtrim( sCtrlAV93OperarioTo));
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
      we22I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553277", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumentipoarticulodp_wc.js", "?202682115553278", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_392( )
   {
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROTIP_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__MAQCOD_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__TIPARTDSC_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__EMPRCOD_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPRODTF_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PARCOD_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROREO_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROKGR_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PORKILO_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROMTR_"+sGXsfl_39_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PORMETRO_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROTIP_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__MAQCOD_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__TIPARTDSC_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__EMPRCOD_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPRODTF_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PARCOD_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROREO_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROKGR_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PORKILO_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROMTR_"+sGXsfl_39_fel_idx ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PORMETRO_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb22I0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod()),GXutil.rtrim( localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Internalname,localUtil.ttoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo(), "ZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro(), "ZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)AV50SDTInformeProduccionResumenTipoArticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().elementAt(-1+AV96GXV1)).getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes22I2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnuaexcel_Internalname = sPrefix+"BTNUAEXCEL" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      lblTextblock_tipoarticulo_Internalname = sPrefix+"TEXTBLOCK_TIPOARTICULO" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROTIP" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__MAQCOD" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__TIPARTDSC" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__EMPRCOD" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPRODTF" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PARCOD" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROREO" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROKGR" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PORKILO" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__HISPROMTR" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENTIPOARTICULO_ARTICULO__PORMETRO" ;
      edtavTotvaluegrid_hisprokgr_Internalname = sPrefix+"vTOTVALUEGRID_HISPROKGR" ;
      edtavTotvaluegrid_hispromtr_Internalname = sPrefix+"vTOTVALUEGRID_HISPROMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtavTotalkilo_Internalname = sPrefix+"vTOTALKILO" ;
      edtavTotalmetro_Internalname = sPrefix+"vTOTALMETRO" ;
      edtavLongvarchar_Internalname = sPrefix+"vLONGVARCHAR" ;
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
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Jsonclick = "" ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluegrid_hispromtr_Jsonclick = "" ;
      edtavTotvaluegrid_hispromtr_Enabled = 1 ;
      edtavTotvaluegrid_hisprokgr_Jsonclick = "" ;
      edtavTotvaluegrid_hisprokgr_Enabled = 1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled = -1 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled = -1 ;
      edtavTotal_mt_Jsonclick = "" ;
      edtavTotal_mt_Visible = 1 ;
      edtavTotal_kg_Jsonclick = "" ;
      edtavTotal_kg_Visible = 1 ;
      edtavLongvarchar_Visible = 1 ;
      edtavTotalmetro_Jsonclick = "" ;
      edtavTotalmetro_Visible = 1 ;
      edtavTotalkilo_Jsonclick = "" ;
      edtavTotalkilo_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV50SDTInformeProduccionResumenTipoArticulo',fld:'vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO',pic:'',hsh:true},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV86TotGrid_HisProKgr',fld:'vTOTGRID_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotGrid_HisProMtr',fld:'vTOTGRID_HISPROMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV86TotGrid_HisProKgr',fld:'vTOTGRID_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotGrid_HisProMtr',fld:'vTOTGRID_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV88TotValueGrid_HisProKgr',fld:'vTOTVALUEGRID_HISPROKGR',pic:''},{av:'AV89TotValueGrid_HisProMtr',fld:'vTOTVALUEGRID_HISPROMTR',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1622I2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1122I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50SDTInformeProduccionResumenTipoArticulo',fld:'vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO',pic:'',hsh:true},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV86TotGrid_HisProKgr',fld:'vTOTGRID_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotGrid_HisProMtr',fld:'vTOTGRID_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1222I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50SDTInformeProduccionResumenTipoArticulo',fld:'vSDTINFORMEPRODUCCIONRESUMENTIPOARTICULO',pic:'',hsh:true},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV86TotGrid_HisProKgr',fld:'vTOTGRID_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotGrid_HisProMtr',fld:'vTOTGRID_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("'DOUAEXCEL'","{handler:'e1322I2',iparms:[{av:'AV90Longvarchar',fld:'vLONGVARCHAR',pic:''}]");
      setEventMetadata("'DOUAEXCEL'",",oparms:[]}");
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
      wcpOAV8Emprcod = "" ;
      wcpOAV34Maqcod1 = "" ;
      wcpOAV35Maqcod2 = "" ;
      wcpOAV22Hisprofec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV23Hisprofec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV8Emprcod = "" ;
      AV34Maqcod1 = "" ;
      AV35Maqcod2 = "" ;
      AV22Hisprofec1 = GXutil.resetTime( GXutil.nullDate() );
      AV23Hisprofec2 = GXutil.resetTime( GXutil.nullDate() );
      AV50SDTInformeProduccionResumenTipoArticulo = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo(remoteHandle, context);
      AV86TotGrid_HisProKgr = DecimalUtil.ZERO ;
      AV87TotGrid_HisProMtr = DecimalUtil.ZERO ;
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
      bttBtnuaexcel_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV108Pgmname = "" ;
      AV56TotalKilo = DecimalUtil.ZERO ;
      AV57TotalMetro = DecimalUtil.ZERO ;
      AV90Longvarchar = "" ;
      AV54TOTAL_KG = DecimalUtil.ZERO ;
      AV55TOTAL_MT = DecimalUtil.ZERO ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV88TotValueGrid_HisProKgr = "" ;
      AV89TotValueGrid_HisProMtr = "" ;
      AV81Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV82EmprNom = "" ;
      AV83UsurCod = "" ;
      GXt_SdtSDTInformeProduccionResumenTipoArticulo5 = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo(remoteHandle, context);
      GXv_SdtSDTInformeProduccionResumenTipoArticulo6 = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo[1] ;
      AV84TTotk = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV85TTotMt = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV72SDTInformeProduccionResumenTipoArticulo_Articulo = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem(remoteHandle, context);
      AV24HisProKgr = DecimalUtil.ZERO ;
      AV73HisProMtr = DecimalUtil.ZERO ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV79ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      AV80ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV74SDTInformeProduccionResumenTipoArticulo_ArticuloItem = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem(remoteHandle, context);
      lblTextblock_tipoarticulo_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV8Emprcod = "" ;
      sCtrlAV70HisEstReo = "" ;
      sCtrlAV34Maqcod1 = "" ;
      sCtrlAV35Maqcod2 = "" ;
      sCtrlAV22Hisprofec1 = "" ;
      sCtrlAV23Hisprofec2 = "" ;
      sCtrlAV92OperarioFrom = "" ;
      sCtrlAV93OperarioTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV108Pgmname = "Produccion.InformeProduccionResumenTipoArticuloDP_WC" ;
      /* GeneXus formulas. */
      AV108Pgmname = "Produccion.InformeProduccionResumenTipoArticuloDP_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled = 0 ;
      edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled = 0 ;
      edtavTotvaluegrid_hisprokgr_Enabled = 0 ;
      edtavTotvaluegrid_hispromtr_Enabled = 0 ;
   }

   private byte wcpOAV70HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV70HisEstReo ;
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
   private short wcpOAV92OperarioFrom ;
   private short wcpOAV93OperarioTo ;
   private short AV92OperarioFrom ;
   private short AV93OperarioTo ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int subGrid_Rows ;
   private int nGXsfl_39_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV96GXV1 ;
   private int edtavPgmname_Visible ;
   private int edtavTotalkilo_Visible ;
   private int edtavTotalmetro_Visible ;
   private int edtavLongvarchar_Visible ;
   private int edtavTotal_kg_Visible ;
   private int edtavTotal_mt_Visible ;
   private int subGrid_Islastpage ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Enabled ;
   private int edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Enabled ;
   private int edtavTotvaluegrid_hisprokgr_Enabled ;
   private int edtavTotvaluegrid_hispromtr_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_39_fel_idx=1 ;
   private int AV109GXV13 ;
   private int AV41PageToGo ;
   private int AV110GXV14 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV15GridCurrentPage ;
   private long AV16GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV86TotGrid_HisProKgr ;
   private java.math.BigDecimal AV87TotGrid_HisProMtr ;
   private java.math.BigDecimal AV56TotalKilo ;
   private java.math.BigDecimal AV57TotalMetro ;
   private java.math.BigDecimal AV54TOTAL_KG ;
   private java.math.BigDecimal AV55TOTAL_MT ;
   private java.math.BigDecimal AV84TTotk ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV85TTotMt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV24HisProKgr ;
   private java.math.BigDecimal AV73HisProMtr ;
   private String wcpOAV8Emprcod ;
   private String wcpOAV34Maqcod1 ;
   private String wcpOAV35Maqcod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV8Emprcod ;
   private String AV34Maqcod1 ;
   private String AV35Maqcod2 ;
   private String sGXsfl_39_idx="0001" ;
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
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnuaexcel_Internalname ;
   private String bttBtnuaexcel_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV108Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String edtavTotalkilo_Internalname ;
   private String edtavTotalkilo_Jsonclick ;
   private String edtavTotalmetro_Internalname ;
   private String edtavTotalmetro_Jsonclick ;
   private String edtavLongvarchar_Internalname ;
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
   private String edtavTotvaluegrid_hisprokgr_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Internalname ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Internalname ;
   private String edtavTotvaluegrid_hispromtr_Internalname ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String AV81Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV82EmprNom ;
   private String AV83UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluegrid_hisprokgr_Jsonclick ;
   private String edtavTotvaluegrid_hispromtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String lblTextblock_tipoarticulo_Internalname ;
   private String lblTextblock_tipoarticulo_Jsonclick ;
   private String sCtrlAV8Emprcod ;
   private String sCtrlAV70HisEstReo ;
   private String sCtrlAV34Maqcod1 ;
   private String sCtrlAV35Maqcod2 ;
   private String sCtrlAV22Hisprofec1 ;
   private String sCtrlAV23Hisprofec2 ;
   private String sCtrlAV92OperarioFrom ;
   private String sCtrlAV93OperarioTo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprotip_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__maqcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__tipartdsc_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__emprcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprodtf_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__parcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisproreo_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hisprokgr_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__porkilo_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__hispromtr_Jsonclick ;
   private String edtavSdtinformeproduccionresumentipoarticulo_articulo__pormetro_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV22Hisprofec1 ;
   private java.util.Date wcpOAV23Hisprofec2 ;
   private java.util.Date AV22Hisprofec1 ;
   private java.util.Date AV23Hisprofec2 ;
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
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV39 ;
   private boolean gx_refresh_fired ;
   private String AV90Longvarchar ;
   private String AV88TotValueGrid_HisProKgr ;
   private String AV89TotValueGrid_HisProMtr ;
   private String AV79ExcelFilename ;
   private String AV80ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo AV50SDTInformeProduccionResumenTipoArticulo ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo GXt_SdtSDTInformeProduccionResumenTipoArticulo5 ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo GXv_SdtSDTInformeProduccionResumenTipoArticulo6[] ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem AV72SDTInformeProduccionResumenTipoArticulo_Articulo ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem AV74SDTInformeProduccionResumenTipoArticulo_ArticuloItem ;
}

