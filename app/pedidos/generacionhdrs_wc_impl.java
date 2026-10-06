package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class generacionhdrs_wc_impl extends GXWebComponent
{
   public generacionhdrs_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public generacionhdrs_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generacionhdrs_wc_impl.class ));
   }

   public generacionhdrs_wc_impl( int remoteHandle ,
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
      chkavGeneracionhdrs_sdt__seleccionar = UIFactory.getCheckbox(this);
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
               AV30EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
               AV33DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DisEst", GXutil.str( AV33DisEst, 1, 0));
               AV34BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarNHdr", AV34BarNHdr);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV30EmprCod,Byte.valueOf(AV33DisEst),AV34BarNHdr});
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
      nRC_GXsfl_69 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_69"))) ;
      nGXsfl_69_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_69_idx"))) ;
      sGXsfl_69_idx = httpContext.GetPar( "sGXsfl_69_idx") ;
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
      AV30EmprCod = httpContext.GetPar( "EmprCod") ;
      AV92Pgmname = httpContext.GetPar( "Pgmname") ;
      AV38Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV37Testrtm = (short)(GXutil.lval( httpContext.GetPar( "Testrtm"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2372( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Generacion HDRs", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.generacionhdrs_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV30EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33DisEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34BarNHdr))}, new String[] {"EmprCod","DisEst","BarNHdr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV38Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV37Testrtm), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Generacionhdrs_sdt", AV13GeneracionHDRs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Generacionhdrs_sdt", AV13GeneracionHDRs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30EmprCod", GXutil.rtrim( wcpOAV30EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33DisEst", GXutil.ltrim( localUtil.ntoc( wcpOAV33DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34BarNHdr", GXutil.rtrim( wcpOAV34BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV30EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGENERACIONHDRS_SDT", AV13GeneracionHDRs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGENERACIONHDRS_SDT", AV13GeneracionHDRs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODP", GXutil.ltrim( localUtil.ntoc( AV59BarCodP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV38Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV38Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTESTRTM", GXutil.ltrim( localUtil.ntoc( AV37Testrtm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV37Testrtm), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV32UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV29Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISEST", GXutil.ltrim( localUtil.ntoc( AV33DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVAR_SELECCIONAR", AV41Var_seleccionar);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MACCOD", GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MACDISCOD", GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISCOD", GXutil.ltrim( localUtil.ntoc( AV52discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMACCOD", GXutil.ltrim( localUtil.ntoc( AV54MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Title", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Result", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Result", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Result));
   }

   public void renderHtmlCloseForm2372( )
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
      return "Pedidos.GeneracionHDRs_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Generacion HDRs", "") ;
   }

   public void wb2370( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidos.generacionhdrs_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Accesorios", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         wb_table1_18_2372( true) ;
      }
      else
      {
         wb_table1_18_2372( false) ;
      }
      return  ;
   }

   public void wb_table1_18_2372e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Crear Hdr", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarhdr_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Hdr", ""), bttBtngenerarhdr_Jsonclick, 7, httpContext.getMessage( "Generar Hdr", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112371_client"+"'", TempTags, "", 2, "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop50", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Ultima HDR Creada", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV34BarNHdr), GXutil.rtrim( localUtil.format( AV34BarNHdr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol69( ) ;
      }
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_69 = (int)(nGXsfl_69_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV72GXV1 = nGXsfl_69_idx ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV92Pgmname), GXutil.rtrim( localUtil.format( AV92Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionHDRs_WC.htm");
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
         wb_table2_102_2372( true) ;
      }
      else
      {
         wb_table2_102_2372( false) ;
      }
      return  ;
   }

   public void wb_table2_102_2372e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_107_2372( true) ;
      }
      else
      {
         wb_table3_107_2372( false) ;
      }
      return  ;
   }

   public void wb_table3_107_2372e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_112_2372( true) ;
      }
      else
      {
         wb_table4_112_2372( false) ;
      }
      return  ;
   }

   public void wb_table4_112_2372e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 69 )
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
               AV72GXV1 = nGXsfl_69_idx ;
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

   public void start2372( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Generacion HDRs", ""), (short)(0)) ;
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
            strup2370( ) ;
         }
      }
   }

   public void ws2372( )
   {
      start2372( ) ;
      evt2372( ) ;
   }

   public void evt2372( )
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
                              strup2370( ) ;
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
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e162372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e172372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodas' */
                                 e182372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodas' */
                                 e192372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINCLUIRACCESORIOS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoIncluirAccesorios' */
                                 e202372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARACCESORIOS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoEliminarAccesorios' */
                                 e212372 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2370( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavIncluir_maccod_Internalname ;
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
                              strup2370( ) ;
                           }
                           nGXsfl_69_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_692( ) ;
                           AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) && ( AV72GXV1 > 0 ) )
                           {
                              AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
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
                                       GX_FocusControl = edtavIncluir_maccod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e222372 ();
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
                                       GX_FocusControl = edtavIncluir_maccod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e232372 ();
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
                                       GX_FocusControl = edtavIncluir_maccod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e242372 ();
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
                                    strup2370( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavIncluir_maccod_Internalname ;
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

   public void we2372( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2372( ) ;
         }
      }
   }

   public void pa2372( )
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
            GX_FocusControl = edtavIncluir_maccod_Internalname ;
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
      subsflControlProps_692( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         sendrow_692( ) ;
         nGXsfl_69_idx = ((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV30EmprCod ,
                                 String AV92Pgmname ,
                                 short AV38Moda21 ,
                                 short AV37Testrtm ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e232372 ();
      GRID_nCurrentRecord = 0 ;
      rf2372( ) ;
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
      rf2372( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV92Pgmname = "Pedidos.GeneracionHDRs_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disfec_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__maccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maccod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clicod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clinom_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disenccli_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispart_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartcod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartdsc_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__discolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnom_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__discolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnum_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__distipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__distipcol_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disnomcli_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disunimed_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiepie_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiekgm_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiemtr_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__maqcoddis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maqcoddis_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2372( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(69) ;
      /* Execute user event: Refresh */
      e232372 ();
      nGXsfl_69_idx = 1 ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
      bGXsfl_69_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_692( ) ;
         e242372 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_69_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e242372 ();
         }
         wbEnd = (short)(69) ;
         wb2370( ) ;
      }
      bGXsfl_69_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2372( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV38Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV38Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTESTRTM", GXutil.ltrim( localUtil.ntoc( AV37Testrtm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV37Testrtm), "ZZZ9")));
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
      return AV13GeneracionHDRs_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV92Pgmname = "Pedidos.GeneracionHDRs_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disfec_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__maccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maccod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clicod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clinom_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disenccli_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispart_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartcod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartdsc_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__discolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnom_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__discolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnum_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__distipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__distipcol_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disnomcli_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__disunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disunimed_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiepie_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiekgm_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__dispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiemtr_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGeneracionhdrs_sdt__maqcoddis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maqcoddis_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2370( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e222372 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Generacionhdrs_sdt"), AV13GeneracionHDRs_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vGENERACIONHDRS_SDT"), AV13GeneracionHDRs_SDT);
         /* Read saved values. */
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV30EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV30EmprCod") ;
         wcpOAV33DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34BarNHdr = httpContext.cgiGet( sPrefix+"wcpOAV34BarNHdr") ;
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
         Dvelop_confirmpanel_generarhdr_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Title") ;
         Dvelop_confirmpanel_generarhdr_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmationtext") ;
         Dvelop_confirmpanel_generarhdr_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Nobuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttonposition") ;
         Dvelop_confirmpanel_generarhdr_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmtype") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Title") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmtype") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Title") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_generarhdr_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Result") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result") ;
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_69_fel_idx = 0 ;
         while ( nGXsfl_69_fel_idx < nRC_GXsfl_69 )
         {
            nGXsfl_69_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_69_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_69_fel_idx+1) ;
            sGXsfl_69_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_692( ) ;
            AV72GXV1 = (int)(nGXsfl_69_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) && ( AV72GXV1 > 0 ) )
            {
               AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
            }
         }
         if ( nGXsfl_69_fel_idx == 0 )
         {
            nGXsfl_69_idx = 1 ;
            sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_692( ) ;
         }
         nGXsfl_69_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCLUIR_MACCOD");
            GX_FocusControl = edtavIncluir_maccod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35Incluir_Maccod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Incluir_Maccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Incluir_Maccod), 8, 0));
         }
         else
         {
            AV35Incluir_Maccod = (int)(localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Incluir_Maccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Incluir_Maccod), 8, 0));
         }
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_69_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
         AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_69_idx > 0 )
         {
            AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) && ( AV72GXV1 > 0 ) )
            {
               AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
            }
            if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
            {
               AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
            }
         }
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
      e222372 ();
      if (returnInSub) return;
   }

   public void e222372( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV13GeneracionHDRs_SDT ;
      GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      new app.generacionhdrs_dp(remoteHandle, context).execute( AV30EmprCod, AV33DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
      AV13GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      gx_BV69 = true ;
      AV13GeneracionHDRs_SDT.sort("DisCod");
      gx_BV69 = true ;
      AV68Var_json = AV13GeneracionHDRs_SDT.toJSonString(false) ;
      GXt_char3 = AV29Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      generacionhdrs_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV29Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Station", AV29Station);
      GXv_char4[0] = AV30EmprCod ;
      GXv_char5[0] = AV31EmprNom ;
      GXv_char6[0] = AV32UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char5, GXv_char6) ;
      generacionhdrs_wc_impl.this.AV30EmprCod = GXv_char4[0] ;
      generacionhdrs_wc_impl.this.AV31EmprNom = GXv_char5[0] ;
      generacionhdrs_wc_impl.this.AV32UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32UsurCod", AV32UsurCod);
      GXt_int7 = (byte)(AV36Carvitin) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int8) ;
      generacionhdrs_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV36Carvitin = GXt_int7 ;
      GXt_int7 = (byte)(AV37Testrtm) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "RTMTES", ""), GXv_int8) ;
      generacionhdrs_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV37Testrtm = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Testrtm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Testrtm), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV37Testrtm), "ZZZ9")));
      GXt_int7 = (byte)(AV38Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      generacionhdrs_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV38Moda21), "ZZZ9")));
      GXt_char3 = AV29Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      generacionhdrs_wc_impl.this.GXt_char3 = GXv_char6[0] ;
      AV29Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Station", AV29Station);
      GXv_char6[0] = AV30EmprCod ;
      GXv_char5[0] = AV31EmprNom ;
      GXv_char4[0] = AV32UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char6, GXv_char5, GXv_char4) ;
      generacionhdrs_wc_impl.this.AV30EmprCod = GXv_char6[0] ;
      generacionhdrs_wc_impl.this.AV31EmprNom = GXv_char5[0] ;
      generacionhdrs_wc_impl.this.AV32UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32UsurCod", AV32UsurCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e232372( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_char3 = AV34BarNHdr ;
      GXv_char6[0] = GXt_char3 ;
      new app.pedidos.ultimahdrcreada(remoteHandle, context).execute( AV30EmprCod, GXv_char6) ;
      generacionhdrs_wc_impl.this.GXt_char3 = GXv_char6[0] ;
      AV34BarNHdr = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarNHdr", AV34BarNHdr);
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e122372( )
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

   public void e132372( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e242372( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV13GeneracionHDRs_SDT.size() )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(69) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_692( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
         {
            httpContext.doAjaxLoad(69, GridRow);
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void e172372( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e142372( )
   {
      AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
      }
      /* Dvelop_confirmpanel_generarhdr_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_generarhdr_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION GENERARHDR' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV42ProgressIndicator", AV42ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GeneracionHDRs_SDT", AV13GeneracionHDRs_SDT);
      nGXsfl_69_bak_idx = nGXsfl_69_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
      nGXsfl_69_idx = nGXsfl_69_bak_idx ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
   }

   public void e182372( )
   {
      AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
      }
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      AV41Var_seleccionar = true ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Var_seleccionar", AV41Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S152 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GeneracionHDRs_SDT", AV13GeneracionHDRs_SDT);
      nGXsfl_69_bak_idx = nGXsfl_69_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
      nGXsfl_69_idx = nGXsfl_69_bak_idx ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
   }

   public void e192372( )
   {
      AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
      }
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV41Var_seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Var_seleccionar", AV41Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S152 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GeneracionHDRs_SDT", AV13GeneracionHDRs_SDT);
      nGXsfl_69_bak_idx = nGXsfl_69_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
      nGXsfl_69_idx = nGXsfl_69_bak_idx ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
   }

   public void e202372( )
   {
      AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
      }
      /* 'DoIncluirAccesorios' Routine */
      returnInSub = false ;
      if ( (0==AV35Incluir_Maccod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta el Nº de Macro", ""));
         GX_FocusControl = edtavIncluir_maccod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV65FlagMac = (short)(0) ;
         /* Using cursor H02372 */
         pr_default.execute(0, new Object[] {AV30EmprCod, Integer.valueOf(AV35Incluir_Maccod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1199MacCod = H02372_A1199MacCod[0] ;
            A396EmprCod = H02372_A396EmprCod[0] ;
            AV65FlagMac = (short)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV66FlagDis = (short)(0) ;
         AV52discod = ((app.SdtGeneracionHDRs_SDT_Item)(AV13GeneracionHDRs_SDT.currentItem())).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52discod), 8, 0));
         /* Using cursor H02373 */
         pr_default.execute(1, new Object[] {AV30EmprCod, Integer.valueOf(AV52discod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1202MacDisCod = H02373_A1202MacDisCod[0] ;
            A396EmprCod = H02373_A396EmprCod[0] ;
            A1199MacCod = H02373_A1199MacCod[0] ;
            AV67MacCod2 = A1199MacCod ;
            AV66FlagDis = (short)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( (0==AV65FlagMac) || ( AV66FlagDis == 1 ) )
         {
            if ( (0==AV65FlagMac) )
            {
               Gx_msg = httpContext.getMessage( "No existe el Nº Macro ", "") + GXutil.trim( GXutil.str( AV35Incluir_Maccod, 8, 0)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            if ( AV66FlagDis == 1 )
            {
               Gx_msg = httpContext.getMessage( "El N Disposicion ", "") + GXutil.trim( GXutil.str( AV52discod, 8, 0)) + httpContext.getMessage( ", ya esta incluida en el Nº Macro ", "") + GXutil.trim( GXutil.str( AV67MacCod2, 8, 0)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
         }
         else
         {
            Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = httpContext.getMessage( "Desea incluir el Nº Disp. Int. ", "")+GXutil.trim( GXutil.str( AV52discod, 8, 0))+GXutil.newLine( ) ;
            ucDvelop_confirmpanel_btnincluiraccesorios.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_btnincluiraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
            Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext+httpContext.getMessage( "En el Nº accesorio ", "")+GXutil.trim( GXutil.str( AV35Incluir_Maccod, 8, 0))+" ?" ;
            ucDvelop_confirmpanel_btnincluiraccesorios.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_btnincluiraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e152372( )
   {
      AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
      }
      /* Dvelop_confirmpanel_btnincluiraccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnincluiraccesorios_Result, "Yes") == 0 )
      {
         new app.pgenmac(remoteHandle, context).execute( AV30EmprCod, AV52discod, AV35Incluir_Maccod) ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Disposicion incluida en macro", ""));
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV13GeneracionHDRs_SDT ;
         GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         new app.generacionhdrs_dp(remoteHandle, context).execute( AV30EmprCod, AV33DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
         AV13GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         gx_BV69 = true ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      if ( gx_BV69 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GeneracionHDRs_SDT", AV13GeneracionHDRs_SDT);
         nGXsfl_69_bak_idx = nGXsfl_69_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
         nGXsfl_69_idx = nGXsfl_69_bak_idx ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
   }

   public void e212372( )
   {
      AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
      }
      /* 'DoEliminarAccesorios' Routine */
      returnInSub = false ;
      AV54MacCod = ((app.SdtGeneracionHDRs_SDT_Item)(AV13GeneracionHDRs_SDT.currentItem())).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54MacCod), 8, 0));
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = httpContext.getMessage( "¿Desea eliminar el Nº de Accesorio ", "")+GXutil.trim( GXutil.str( AV54MacCod, 8, 0))+"?" ;
      ucDvelop_confirmpanel_btneliminaraccesorios.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_btneliminaraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext);
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer", "Confirm", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e162372( )
   {
      AV72GXV1 = (int)(nGXsfl_69_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV72GXV1 > 0 ) && ( AV13GeneracionHDRs_SDT.size() >= AV72GXV1 ) )
      {
         AV13GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)) );
      }
      /* Dvelop_confirmpanel_btneliminaraccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminaraccesorios_Result, "Yes") == 0 )
      {
         callSubmit( 1 , new Object[]{ AV30EmprCod,Integer.valueOf(AV54MacCod) });
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV13GeneracionHDRs_SDT ;
         GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         new app.generacionhdrs_dp(remoteHandle, context).execute( AV30EmprCod, AV33DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
         AV13GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         gx_BV69 = true ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      if ( gx_BV69 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GeneracionHDRs_SDT", AV13GeneracionHDRs_SDT);
         nGXsfl_69_bak_idx = nGXsfl_69_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV30EmprCod, AV92Pgmname, AV38Moda21, AV37Testrtm, sPrefix) ;
         nGXsfl_69_idx = nGXsfl_69_bak_idx ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'DO ACTION GENERARHDR' Routine */
      returnInSub = false ;
      AV42ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV42ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV42ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV42ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV42ProgressIndicator.show();
      AV42ProgressIndicator.setgxTv_SdtProgress_Value( 33 );
      AV42ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando PGENBARM", ""));
      AV40i = GXutil.sleep( 1) ;
      AV43lineas = (short)(1) ;
      AV44t = (short)(1) ;
      AV48TablaHdrs_SDT.clear();
      AV40i = (short)(1) ;
      while ( AV40i <= AV13GeneracionHDRs_SDT.size() )
      {
         AV63seleccionar = ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV40i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar() ;
         if ( AV63seleccionar )
         {
            AV52discod = ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV40i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52discod), 8, 0));
            AV54MacCod = ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV40i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54MacCod), 8, 0));
            AV53MaqCod = ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV40i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis() ;
            AV42ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Nº Disp Int ", "")+GXutil.trim( GXutil.str( AV52discod, 8, 0)) );
            GXv_int10[0] = AV59BarCodP ;
            new app.pgenbarm(remoteHandle, context).execute( AV30EmprCod, AV52discod, AV53MaqCod, GXv_int10) ;
            generacionhdrs_wc_impl.this.AV59BarCodP = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarCodP), 8, 0));
            new app.pmtsrdt(remoteHandle, context).execute( AV30EmprCod, AV59BarCodP, (byte)(0), " ", DecimalUtil.doubleToDec(0)) ;
            if ( ! (0==AV54MacCod) )
            {
               GXv_char6[0] = AV30EmprCod ;
               GXv_int10[0] = AV52discod ;
               GXv_int11[0] = AV59BarCodP ;
               new app.pmodmac(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int11) ;
               generacionhdrs_wc_impl.this.AV30EmprCod = GXv_char6[0] ;
               generacionhdrs_wc_impl.this.AV52discod = GXv_int10[0] ;
               generacionhdrs_wc_impl.this.AV59BarCodP = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52discod), 8, 0));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarCodP), 8, 0));
            }
            if ( AV43lineas < 1000 )
            {
               AV46TabHdr[AV43lineas-1] = GXutil.str( AV59BarCodP, 8, 0) + "0" + " " ;
               AV43lineas = (short)(AV43lineas+1) ;
            }
            if ( AV38Moda21 == 1 )
            {
               if ( AV37Testrtm == 1 )
               {
                  GXv_char6[0] = AV30EmprCod ;
                  GXv_int11[0] = AV59BarCodP ;
                  GXv_int8[0] = (byte)(0) ;
                  GXv_char5[0] = " " ;
                  new app.ptestrtm(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_int8, GXv_char5) ;
                  generacionhdrs_wc_impl.this.AV30EmprCod = GXv_char6[0] ;
                  generacionhdrs_wc_impl.this.AV59BarCodP = GXv_int11[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarCodP), 8, 0));
               }
               AV47TabladeHdrs_SDTItem = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
               AV47TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod( AV59BarCodP );
               AV47TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo( (byte)(0) );
               AV47TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar( " " );
               AV48TablaHdrs_SDT.add(AV47TabladeHdrs_SDTItem, 0);
            }
            AV44t = (short)(AV44t+1) ;
         }
         AV40i = (short)(AV40i+1) ;
      }
      AV42ProgressIndicator.setgxTv_SdtProgress_Value( 66 );
      AV42ProgressIndicator.setgxTv_SdtProgress_Description( "" );
      AV42ProgressIndicator.showwithtitle(httpContext.getMessage( "Fin Procesando PGENBARM", ""));
      AV60Inc_obs1 = "" ;
      if ( AV43lineas > 1 )
      {
         AV43lineas = (short)(AV43lineas-1) ;
         AV60Inc_obs1 = httpContext.getMessage( "Proceso Generacion Hdrs,creadas ", "") + GXutil.trim( GXutil.str( AV43lineas, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV92Pgmname, AV32UsurCod, AV29Station, AV60Inc_obs1, 22, (byte)(0), "") ;
      }
      AV61MacSav = 0 ;
      AV43lineas = (short)(0) ;
      AV42ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
      AV42ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando ACCESORIOS", ""));
      AV40i = GXutil.sleep( 1) ;
      AV40i = (short)(1) ;
      while ( AV40i <= AV13GeneracionHDRs_SDT.size() )
      {
         AV63seleccionar = ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV40i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar() ;
         if ( AV63seleccionar )
         {
            AV62Maccoditem = ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV40i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod() ;
            if ( ! (0==AV62Maccoditem) && ( AV62Maccoditem != AV61MacSav ) )
            {
               AV42ProgressIndicator.setgxTv_SdtProgress_Value( 80 );
               AV42ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Nº Macro ", "")+GXutil.trim( GXutil.str( AV62Maccoditem, 8, 0)) );
               GXv_char6[0] = AV30EmprCod ;
               GXv_int11[0] = AV62Maccoditem ;
               new app.pagrmac(remoteHandle, context).execute( GXv_char6, GXv_int11) ;
               generacionhdrs_wc_impl.this.AV30EmprCod = GXv_char6[0] ;
               generacionhdrs_wc_impl.this.AV62Maccoditem = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
               AV61MacSav = AV62Maccoditem ;
               AV43lineas = (short)(AV43lineas+1) ;
            }
         }
         AV40i = (short)(AV40i+1) ;
      }
      AV64Inc_obs2 = "" ;
      if ( AV43lineas > 1 )
      {
         AV64Inc_obs2 = httpContext.getMessage( "Proceso Accesorios,creados ", "") + GXutil.trim( GXutil.str( AV43lineas, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV92Pgmname, AV32UsurCod, AV29Station, AV64Inc_obs2, 11, (byte)(0), "") ;
      }
      AV64Inc_obs2 = httpContext.getMessage( "Proceso Generacion HDRs, finalizado", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV92Pgmname, AV32UsurCod, AV29Station, AV64Inc_obs2, 10, (byte)(0), "") ;
      AV42ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso Finalizado", ""));
      AV42ProgressIndicator.setgxTv_SdtProgress_Description( "" );
      AV42ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV40i = GXutil.sleep( 1) ;
      AV42ProgressIndicator.hide();
      if ( ( AV38Moda21 == 1 ) && ( AV48TablaHdrs_SDT.size() > 0 ) )
      {
         AV49TablaHdrs_SDTJson = AV48TablaHdrs_SDT.toJSonString(false) ;
         httpContext.popup(formatLink("app.pctrosc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV30EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV49TablaHdrs_SDTJson))}, new String[] {"EmprCod","TablaHdrs_SDTJson"}) , new Object[] {"AV30EmprCod","AV49TablaHdrs_SDTJson"});
         GXv_char6[0] = AV30EmprCod ;
         GXv_char5[0] = AV49TablaHdrs_SDTJson ;
         GXv_char4[0] = AV32UsurCod ;
         GXv_char12[0] = AV29Station ;
         GXv_char13[0] = AV92Pgmname ;
         new app.lecturadehdrs(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char12, GXv_char13) ;
         generacionhdrs_wc_impl.this.AV30EmprCod = GXv_char6[0] ;
         generacionhdrs_wc_impl.this.AV49TablaHdrs_SDTJson = GXv_char5[0] ;
         generacionhdrs_wc_impl.this.AV32UsurCod = GXv_char4[0] ;
         generacionhdrs_wc_impl.this.AV29Station = GXv_char12[0] ;
         generacionhdrs_wc_impl.this.AV92Pgmname = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32UsurCod", AV32UsurCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Station", AV29Station);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      }
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV13GeneracionHDRs_SDT ;
      GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      new app.generacionhdrs_dp(remoteHandle, context).execute( AV30EmprCod, AV33DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
      AV13GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      gx_BV69 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV92Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV92Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV92Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV92Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV40i = (short)(1) ;
      while ( AV40i <= AV13GeneracionHDRs_SDT.size() )
      {
         ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV40i)).setgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar( AV41Var_seleccionar );
         AV40i = (short)(AV40i+1) ;
      }
   }

   public void wb_table4_112_2372( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname, tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("Title", Dvelop_confirmpanel_btneliminaraccesorios_Title);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype);
         ucDvelop_confirmpanel_btneliminaraccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminaraccesorios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_112_2372e( true) ;
      }
      else
      {
         wb_table4_112_2372e( false) ;
      }
   }

   public void wb_table3_107_2372( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname, tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("Title", Dvelop_confirmpanel_btnincluiraccesorios_Title);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype);
         ucDvelop_confirmpanel_btnincluiraccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnincluiraccesorios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_107_2372e( true) ;
      }
      else
      {
         wb_table3_107_2372e( false) ;
      }
   }

   public void wb_table2_102_2372( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_generarhdr_Internalname, tblTabledvelop_confirmpanel_generarhdr_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_generarhdr.setProperty("Title", Dvelop_confirmpanel_generarhdr_Title);
         ucDvelop_confirmpanel_generarhdr.setProperty("ConfirmationText", Dvelop_confirmpanel_generarhdr_Confirmationtext);
         ucDvelop_confirmpanel_generarhdr.setProperty("YesButtonCaption", Dvelop_confirmpanel_generarhdr_Yesbuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("NoButtonCaption", Dvelop_confirmpanel_generarhdr_Nobuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("CancelButtonCaption", Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("YesButtonPosition", Dvelop_confirmpanel_generarhdr_Yesbuttonposition);
         ucDvelop_confirmpanel_generarhdr.setProperty("ConfirmType", Dvelop_confirmpanel_generarhdr_Confirmtype);
         ucDvelop_confirmpanel_generarhdr.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_generarhdr_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDRContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDRContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_102_2372e( true) ;
      }
      else
      {
         wb_table2_102_2372e( false) ;
      }
   }

   public void wb_table1_18_2372( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnincluiraccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "Incluir", ""), bttBtnincluiraccesorios_Jsonclick, 5, httpContext.getMessage( "Incluir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINCLUIRACCESORIOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableincluir_maccod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockincluir_maccod_Internalname, httpContext.getMessage( "Nº Macro", ""), "", "", lblTextblockincluir_maccod_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIncluir_maccod_Internalname, httpContext.getMessage( "Incluir_Maccod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIncluir_maccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV35Incluir_Maccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIncluir_maccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35Incluir_Maccod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35Incluir_Maccod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIncluir_maccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIncluir_maccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaraccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminaraccesorios_Jsonclick, 5, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOELIMINARACCESORIOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_18_2372e( true) ;
      }
      else
      {
         wb_table1_18_2372e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV30EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
      AV33DisEst = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DisEst", GXutil.str( AV33DisEst, 1, 0));
      AV34BarNHdr = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarNHdr", AV34BarNHdr);
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
      pa2372( ) ;
      ws2372( ) ;
      we2372( ) ;
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
      sCtrlAV30EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV33DisEst = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV34BarNHdr = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2372( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidos\\generacionhdrs_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2372( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV30EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
         AV33DisEst = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DisEst", GXutil.str( AV33DisEst, 1, 0));
         AV34BarNHdr = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarNHdr", AV34BarNHdr);
      }
      wcpOAV30EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV30EmprCod") ;
      wcpOAV33DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34BarNHdr = httpContext.cgiGet( sPrefix+"wcpOAV34BarNHdr") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV30EmprCod, wcpOAV30EmprCod) != 0 ) || ( AV33DisEst != wcpOAV33DisEst ) || ( GXutil.strcmp(AV34BarNHdr, wcpOAV34BarNHdr) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV30EmprCod = AV30EmprCod ;
      wcpOAV33DisEst = AV33DisEst ;
      wcpOAV34BarNHdr = AV34BarNHdr ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV30EmprCod = httpContext.cgiGet( sPrefix+"AV30EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV30EmprCod) > 0 )
      {
         AV30EmprCod = httpContext.cgiGet( sCtrlAV30EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30EmprCod", AV30EmprCod);
      }
      else
      {
         AV30EmprCod = httpContext.cgiGet( sPrefix+"AV30EmprCod_PARM") ;
      }
      sCtrlAV33DisEst = httpContext.cgiGet( sPrefix+"AV33DisEst_CTRL") ;
      if ( GXutil.len( sCtrlAV33DisEst) > 0 )
      {
         AV33DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33DisEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DisEst", GXutil.str( AV33DisEst, 1, 0));
      }
      else
      {
         AV33DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33DisEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34BarNHdr = httpContext.cgiGet( sPrefix+"AV34BarNHdr_CTRL") ;
      if ( GXutil.len( sCtrlAV34BarNHdr) > 0 )
      {
         AV34BarNHdr = httpContext.cgiGet( sCtrlAV34BarNHdr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarNHdr", AV34BarNHdr);
      }
      else
      {
         AV34BarNHdr = httpContext.cgiGet( sPrefix+"AV34BarNHdr_PARM") ;
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
      pa2372( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2372( ) ;
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
      ws2372( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30EmprCod_PARM", GXutil.rtrim( AV30EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30EmprCod_CTRL", GXutil.rtrim( sCtrlAV30EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33DisEst_PARM", GXutil.ltrim( localUtil.ntoc( AV33DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33DisEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33DisEst_CTRL", GXutil.rtrim( sCtrlAV33DisEst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarNHdr_PARM", GXutil.rtrim( AV34BarNHdr));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34BarNHdr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarNHdr_CTRL", GXutil.rtrim( sCtrlAV34BarNHdr));
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
      we2372( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553414", true, true);
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
      httpContext.AddJavascriptSource("pedidos/generacionhdrs_wc.js", "?202682115553415", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_692( )
   {
      chkavGeneracionhdrs_sdt__seleccionar.setInternalname( sPrefix+"GENERACIONHDRS_SDT__SELECCIONAR_"+sGXsfl_69_idx );
      edtavGeneracionhdrs_sdt__discod_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOD_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__disfec_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISFEC_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__maccod_Internalname = sPrefix+"GENERACIONHDRS_SDT__MACCOD_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__clicod_Internalname = sPrefix+"GENERACIONHDRS_SDT__CLICOD_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__clinom_Internalname = sPrefix+"GENERACIONHDRS_SDT__CLINOM_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__disenccli_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISENCCLI_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__dispart_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPART_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__disartcod_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISARTCOD_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__disartdsc_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISARTDSC_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__discolnom_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOLNOM_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__discolnum_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOLNUM_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__distipcol_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISTIPCOL_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__disnomcli_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISNOMCLI_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__disunimed_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISUNIMED_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__dispiepie_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEPIE_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__dispiekgm_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEKGM_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__dispiemtr_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEMTR_"+sGXsfl_69_idx ;
      edtavGeneracionhdrs_sdt__maqcoddis_Internalname = sPrefix+"GENERACIONHDRS_SDT__MAQCODDIS_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_692( )
   {
      chkavGeneracionhdrs_sdt__seleccionar.setInternalname( sPrefix+"GENERACIONHDRS_SDT__SELECCIONAR_"+sGXsfl_69_fel_idx );
      edtavGeneracionhdrs_sdt__discod_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOD_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__disfec_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISFEC_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__maccod_Internalname = sPrefix+"GENERACIONHDRS_SDT__MACCOD_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__clicod_Internalname = sPrefix+"GENERACIONHDRS_SDT__CLICOD_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__clinom_Internalname = sPrefix+"GENERACIONHDRS_SDT__CLINOM_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__disenccli_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISENCCLI_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__dispart_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPART_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__disartcod_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISARTCOD_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__disartdsc_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISARTDSC_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__discolnom_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOLNOM_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__discolnum_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOLNUM_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__distipcol_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISTIPCOL_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__disnomcli_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISNOMCLI_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__disunimed_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISUNIMED_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__dispiepie_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEPIE_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__dispiekgm_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEKGM_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__dispiemtr_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEMTR_"+sGXsfl_69_fel_idx ;
      edtavGeneracionhdrs_sdt__maqcoddis_Internalname = sPrefix+"GENERACIONHDRS_SDT__MAQCODDIS_"+sGXsfl_69_fel_idx ;
   }

   public void sendrow_692( )
   {
      subsflControlProps_692( ) ;
      wb2370( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_69_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_69_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavGeneracionhdrs_sdt__seleccionar.getEnabled()!=0)&&(chkavGeneracionhdrs_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_69_idx+"',69)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "GENERACIONHDRS_SDT__SELECCIONAR_" + sGXsfl_69_idx ;
         chkavGeneracionhdrs_sdt__seleccionar.setName( GXCCtl );
         chkavGeneracionhdrs_sdt__seleccionar.setWebtags( "" );
         chkavGeneracionhdrs_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavGeneracionhdrs_sdt__seleccionar.getInternalname(), "TitleCaption", chkavGeneracionhdrs_sdt__seleccionar.getCaption(), !bGXsfl_69_Refreshing);
         chkavGeneracionhdrs_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavGeneracionhdrs_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(70, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavGeneracionhdrs_sdt__seleccionar.getEnabled()!=0)&&(chkavGeneracionhdrs_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__discod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__discod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__discod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disfec_Internalname,localUtil.format(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disfec(), "99/99/99"),localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disfec(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__maccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__maccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__maccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__maccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__clinom_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disenccli_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disenccli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disartcod_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disartcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disartcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disartcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disartdsc_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__discolnom_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__discolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__discolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__discolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__discolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__discolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__discolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__distipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__distipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__distipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__distipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disnomcli_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disunimed_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed()),GXutil.rtrim( localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispiepie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispiepie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispiepie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispiekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispiekgm_Enabled!=0) ? localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispiekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispiekgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispiemtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispiemtr_Enabled!=0) ? localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispiemtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispiemtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__maqcoddis_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV13GeneracionHDRs_SDT.elementAt(-1+AV72GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__maqcoddis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__maqcoddis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2372( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_69_idx = ((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      /* End function sendrow_692 */
   }

   public void startgridcontrol69( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"69\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Seleccionar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Disp. Int.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Accesorio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido del Cliente ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Partida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__discod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__maccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disartcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__discolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__discolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__distipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispiepie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispiekgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispiemtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__maqcoddis_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnincluiraccesorios_Internalname = sPrefix+"BTNINCLUIRACCESORIOS" ;
      lblTextblockincluir_maccod_Internalname = sPrefix+"TEXTBLOCKINCLUIR_MACCOD" ;
      edtavIncluir_maccod_Internalname = sPrefix+"vINCLUIR_MACCOD" ;
      divUnnamedtableincluir_maccod_Internalname = sPrefix+"UNNAMEDTABLEINCLUIR_MACCOD" ;
      bttBtneliminaraccesorios_Internalname = sPrefix+"BTNELIMINARACCESORIOS" ;
      tblUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      bttBtngenerarhdr_Internalname = sPrefix+"BTNGENERARHDR" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      chkavGeneracionhdrs_sdt__seleccionar.setInternalname( sPrefix+"GENERACIONHDRS_SDT__SELECCIONAR" );
      edtavGeneracionhdrs_sdt__discod_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOD" ;
      edtavGeneracionhdrs_sdt__disfec_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISFEC" ;
      edtavGeneracionhdrs_sdt__maccod_Internalname = sPrefix+"GENERACIONHDRS_SDT__MACCOD" ;
      edtavGeneracionhdrs_sdt__clicod_Internalname = sPrefix+"GENERACIONHDRS_SDT__CLICOD" ;
      edtavGeneracionhdrs_sdt__clinom_Internalname = sPrefix+"GENERACIONHDRS_SDT__CLINOM" ;
      edtavGeneracionhdrs_sdt__disenccli_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISENCCLI" ;
      edtavGeneracionhdrs_sdt__dispart_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPART" ;
      edtavGeneracionhdrs_sdt__disartcod_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISARTCOD" ;
      edtavGeneracionhdrs_sdt__disartdsc_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISARTDSC" ;
      edtavGeneracionhdrs_sdt__discolnom_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOLNOM" ;
      edtavGeneracionhdrs_sdt__discolnum_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISCOLNUM" ;
      edtavGeneracionhdrs_sdt__distipcol_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISTIPCOL" ;
      edtavGeneracionhdrs_sdt__disnomcli_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISNOMCLI" ;
      edtavGeneracionhdrs_sdt__disunimed_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISUNIMED" ;
      edtavGeneracionhdrs_sdt__dispiepie_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEPIE" ;
      edtavGeneracionhdrs_sdt__dispiekgm_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEKGM" ;
      edtavGeneracionhdrs_sdt__dispiemtr_Internalname = sPrefix+"GENERACIONHDRS_SDT__DISPIEMTR" ;
      edtavGeneracionhdrs_sdt__maqcoddis_Internalname = sPrefix+"GENERACIONHDRS_SDT__MAQCODDIS" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Dvelop_confirmpanel_generarhdr_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR" ;
      tblTabledvelop_confirmpanel_generarhdr_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_GENERARHDR" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS" ;
      tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS" ;
      tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavGeneracionhdrs_sdt__maqcoddis_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiemtr_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiekgm_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiepie_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disunimed_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disnomcli_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__distipcol_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnum_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnom_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartdsc_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartcod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispart_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disenccli_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clinom_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clicod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__maccod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disfec_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      chkavGeneracionhdrs_sdt__seleccionar.setCaption( "" );
      chkavGeneracionhdrs_sdt__seleccionar.setVisible( -1 );
      chkavGeneracionhdrs_sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavIncluir_maccod_Jsonclick = "" ;
      edtavIncluir_maccod_Enabled = 1 ;
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disunimed_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__distipcol_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__discolnum_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__discolnom_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disartcod_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispart_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disenccli_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__clinom_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__clicod_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__maccod_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disfec_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__discod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = "¿Desea eliminar el accesorio?" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Title = "" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = "¿Desea añadir el Nº Ped. Int.  al accesorio?" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Title = "" ;
      Dvelop_confirmpanel_generarhdr_Confirmtype = "1" ;
      Dvelop_confirmpanel_generarhdr_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_generarhdr_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_generarhdr_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_generarhdr_Confirmationtext = "¿Desea Generar HDR?" ;
      Dvelop_confirmpanel_generarhdr_Title = "" ;
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
      GXCCtl = "GENERACIONHDRS_SDT__SELECCIONAR_" + sGXsfl_69_idx ;
      chkavGeneracionhdrs_sdt__seleccionar.setName( GXCCtl );
      chkavGeneracionhdrs_sdt__seleccionar.setWebtags( "" );
      chkavGeneracionhdrs_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavGeneracionhdrs_sdt__seleccionar.getInternalname(), "TitleCaption", chkavGeneracionhdrs_sdt__seleccionar.getCaption(), !bGXsfl_69_Refreshing);
      chkavGeneracionhdrs_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'sPrefix'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV34BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122372',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132372',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e242372',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e172372',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOGENERARHDR'","{handler:'e112371',iparms:[]");
      setEventMetadata("'DOGENERARHDR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE","{handler:'e142372',iparms:[{av:'Dvelop_confirmpanel_generarhdr_Result',ctrl:'DVELOP_CONFIRMPANEL_GENERARHDR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV59BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV32UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV29Station',fld:'vSTATION',pic:''},{av:'AV33DisEst',fld:'vDISEST',pic:'9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE",",oparms:[{av:'AV52discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV54MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV59BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29Station',fld:'vSTATION',pic:''},{av:'AV32UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'AV34BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e182372',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV41Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV41Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'AV34BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e192372',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV41Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV41Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'AV34BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINCLUIRACCESORIOS'","{handler:'e202372',iparms:[{av:'AV35Incluir_Maccod',fld:'vINCLUIR_MACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINCLUIRACCESORIOS'",",oparms:[{av:'AV52discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE","{handler:'e152372',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btnincluiraccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS',prop:'Result'},{av:'AV52discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV35Incluir_Maccod',fld:'vINCLUIR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV33DisEst',fld:'vDISEST',pic:'9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE",",oparms:[{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'AV34BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOELIMINARACCESORIOS'","{handler:'e212372',iparms:[{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69}]");
      setEventMetadata("'DOELIMINARACCESORIOS'",",oparms:[{av:'AV54MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE","{handler:'e162372',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV37Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btneliminaraccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS',prop:'Result'},{av:'AV54MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV33DisEst',fld:'vDISEST',pic:'9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE",",oparms:[{av:'AV54MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRID',prop:'GridRC',grid:69},{av:'AV34BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_INCLUIR_MACCOD","{handler:'validv_Incluir_maccod',iparms:[]");
      setEventMetadata("VALIDV_INCLUIR_MACCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv20',iparms:[]");
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
   public void submit( int submitId ,
                       Object [] submitParms ,
                       ModelContext submitContext )
   {
      UserInformation submitUI = (UserInformation) GXObjectHelper.getUserInformation(context, -1);
      int remoteHandle = submitUI.getHandle();
      try
      {
         switch ( submitId )
         {
               case 1 :
                  GXv_int11[0] = ((Number) submitParms[1]).intValue() ;
                  new app.pelimac(remoteHandle, submitContext).execute( (String)submitParms[0], GXv_int11) ;
                  try { Application.getConnectionManager().disconnect(remoteHandle); } catch(Exception submitExc) { ; }
                  break;
         }
      }
      catch ( Exception e )
      {
         Application.cleanupConnection(remoteHandle);
         e.printStackTrace();
      }
   }

   public void initialize( )
   {
      wcpOAV30EmprCod = "" ;
      wcpOAV34BarNHdr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_generarhdr_Result = "" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Result = "" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV30EmprCod = "" ;
      AV34BarNHdr = "" ;
      AV92Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV13GeneracionHDRs_SDT = new GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>(app.SdtGeneracionHDRs_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV32UsurCod = "" ;
      AV29Station = "" ;
      A396EmprCod = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtngenerarhdr_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
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
      AV68Var_json = "" ;
      AV31EmprNom = "" ;
      GXt_char3 = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV42ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H02372_A1199MacCod = new int[1] ;
      H02372_A396EmprCod = new String[] {""} ;
      H02373_A1201MacLin = new short[1] ;
      H02373_A1202MacDisCod = new int[1] ;
      H02373_A396EmprCod = new String[] {""} ;
      H02373_A1199MacCod = new int[1] ;
      Gx_msg = "" ;
      ucDvelop_confirmpanel_btnincluiraccesorios = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btneliminaraccesorios = new com.genexus.webpanels.GXUserControl();
      AV48TablaHdrs_SDT = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      AV53MaqCod = "" ;
      GXv_int10 = new int[1] ;
      AV46TabHdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV46TabHdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int8 = new byte[1] ;
      AV47TabladeHdrs_SDTItem = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV60Inc_obs1 = "" ;
      AV64Inc_obs2 = "" ;
      AV49TablaHdrs_SDTJson = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = new GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>(app.SdtGeneracionHDRs_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtGeneracionHDRs_SDT_Item2 = new GXBaseCollection[1] ;
      AV20Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      ucDvelop_confirmpanel_generarhdr = new com.genexus.webpanels.GXUserControl();
      bttBtnincluiraccesorios_Jsonclick = "" ;
      lblTextblockincluir_maccod_Jsonclick = "" ;
      bttBtneliminaraccesorios_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV30EmprCod = "" ;
      sCtrlAV33DisEst = "" ;
      sCtrlAV34BarNHdr = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int11 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.generacionhdrs_wc__default(),
         new Object[] {
             new Object[] {
            H02372_A1199MacCod, H02372_A396EmprCod
            }
            , new Object[] {
            H02373_A1201MacLin, H02373_A1202MacDisCod, H02373_A396EmprCod, H02373_A1199MacCod
            }
         }
      );
      AV92Pgmname = "Pedidos.GeneracionHDRs_WC" ;
      /* GeneXus formulas. */
      AV92Pgmname = "Pedidos.GeneracionHDRs_WC" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV33DisEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV33DisEst ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
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
   private short AV38Moda21 ;
   private short AV37Testrtm ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV36Carvitin ;
   private short AV65FlagMac ;
   private short AV66FlagDis ;
   private short AV40i ;
   private short AV43lineas ;
   private short AV44t ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_69 ;
   private int nGXsfl_69_idx=1 ;
   private int AV59BarCodP ;
   private int A1199MacCod ;
   private int A1202MacDisCod ;
   private int AV52discod ;
   private int AV54MacCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int AV72GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavGeneracionhdrs_sdt__discod_Enabled ;
   private int edtavGeneracionhdrs_sdt__disfec_Enabled ;
   private int edtavGeneracionhdrs_sdt__maccod_Enabled ;
   private int edtavGeneracionhdrs_sdt__clicod_Enabled ;
   private int edtavGeneracionhdrs_sdt__clinom_Enabled ;
   private int edtavGeneracionhdrs_sdt__disenccli_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispart_Enabled ;
   private int edtavGeneracionhdrs_sdt__disartcod_Enabled ;
   private int edtavGeneracionhdrs_sdt__disartdsc_Enabled ;
   private int edtavGeneracionhdrs_sdt__discolnom_Enabled ;
   private int edtavGeneracionhdrs_sdt__discolnum_Enabled ;
   private int edtavGeneracionhdrs_sdt__distipcol_Enabled ;
   private int edtavGeneracionhdrs_sdt__disnomcli_Enabled ;
   private int edtavGeneracionhdrs_sdt__disunimed_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispiepie_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispiekgm_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispiemtr_Enabled ;
   private int edtavGeneracionhdrs_sdt__maqcoddis_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_69_fel_idx=1 ;
   private int AV35Incluir_Maccod ;
   private int AV25PageToGo ;
   private int nGXsfl_69_bak_idx=1 ;
   private int AV67MacCod2 ;
   private int GXv_int10[] ;
   private int AV61MacSav ;
   private int AV62Maccoditem ;
   private int edtavIncluir_maccod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int GXv_int11[] ;
   private int GX_I ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV30EmprCod ;
   private String wcpOAV34BarNHdr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_generarhdr_Result ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Result ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV30EmprCod ;
   private String AV34BarNHdr ;
   private String sGXsfl_69_idx="0001" ;
   private String AV92Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV32UsurCod ;
   private String AV29Station ;
   private String A396EmprCod ;
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
   private String Dvelop_confirmpanel_generarhdr_Title ;
   private String Dvelop_confirmpanel_generarhdr_Confirmationtext ;
   private String Dvelop_confirmpanel_generarhdr_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Nobuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Yesbuttonposition ;
   private String Dvelop_confirmpanel_generarhdr_Confirmtype ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Title ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Title ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtngenerarhdr_Internalname ;
   private String bttBtngenerarhdr_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavIncluir_maccod_Internalname ;
   private String edtavGeneracionhdrs_sdt__discod_Internalname ;
   private String edtavGeneracionhdrs_sdt__disfec_Internalname ;
   private String edtavGeneracionhdrs_sdt__maccod_Internalname ;
   private String edtavGeneracionhdrs_sdt__clicod_Internalname ;
   private String edtavGeneracionhdrs_sdt__clinom_Internalname ;
   private String edtavGeneracionhdrs_sdt__disenccli_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispart_Internalname ;
   private String edtavGeneracionhdrs_sdt__disartcod_Internalname ;
   private String edtavGeneracionhdrs_sdt__disartdsc_Internalname ;
   private String edtavGeneracionhdrs_sdt__discolnom_Internalname ;
   private String edtavGeneracionhdrs_sdt__discolnum_Internalname ;
   private String edtavGeneracionhdrs_sdt__distipcol_Internalname ;
   private String edtavGeneracionhdrs_sdt__disnomcli_Internalname ;
   private String edtavGeneracionhdrs_sdt__disunimed_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispiepie_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispiekgm_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispiemtr_Internalname ;
   private String edtavGeneracionhdrs_sdt__maqcoddis_Internalname ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String AV31EmprNom ;
   private String GXt_char3 ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Internalname ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Internalname ;
   private String AV53MaqCod ;
   private String AV46TabHdr[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname ;
   private String tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname ;
   private String tblTabledvelop_confirmpanel_generarhdr_Internalname ;
   private String Dvelop_confirmpanel_generarhdr_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String bttBtnincluiraccesorios_Internalname ;
   private String bttBtnincluiraccesorios_Jsonclick ;
   private String divUnnamedtableincluir_maccod_Internalname ;
   private String lblTextblockincluir_maccod_Internalname ;
   private String lblTextblockincluir_maccod_Jsonclick ;
   private String edtavIncluir_maccod_Jsonclick ;
   private String bttBtneliminaraccesorios_Internalname ;
   private String bttBtneliminaraccesorios_Jsonclick ;
   private String sCtrlAV30EmprCod ;
   private String sCtrlAV33DisEst ;
   private String sCtrlAV34BarNHdr ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavGeneracionhdrs_sdt__discod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disfec_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__maccod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__clicod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__clinom_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disenccli_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispart_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disartcod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disartdsc_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__discolnom_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__discolnum_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__distipcol_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disnomcli_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disunimed_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispiepie_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispiekgm_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispiemtr_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__maqcoddis_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV41Var_seleccionar ;
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
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV69 ;
   private boolean gx_refresh_fired ;
   private boolean AV63seleccionar ;
   private String AV68Var_json ;
   private String AV60Inc_obs1 ;
   private String AV64Inc_obs2 ;
   private String AV49TablaHdrs_SDTJson ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnincluiraccesorios ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminaraccesorios ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_generarhdr ;
   private ICheckbox chkavGeneracionhdrs_sdt__seleccionar ;
   private IDataStoreProvider pr_default ;
   private int[] H02372_A1199MacCod ;
   private String[] H02372_A396EmprCod ;
   private short[] H02373_A1201MacLin ;
   private int[] H02373_A1202MacDisCod ;
   private String[] H02373_A396EmprCod ;
   private int[] H02373_A1199MacCod ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> AV13GeneracionHDRs_SDT ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> GXv_objcol_SdtGeneracionHDRs_SDT_Item2[] ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV48TablaHdrs_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV42ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV47TabladeHdrs_SDTItem ;
}

final  class generacionhdrs_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02372", "SELECT MacCod, EmprCod FROM TXPCMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02373", "SELECT * FROM (SELECT MacLin, MacDisCod, EmprCod, MacCod FROM TXPLMACRO WHERE EmprCod = ? and MacDisCod = ? ORDER BY EmprCod, MacDisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

