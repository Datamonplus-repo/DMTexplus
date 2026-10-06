package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcincidenciaslist_impl extends GXWebComponent
{
   public wcincidenciaslist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcincidenciaslist_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcincidenciaslist_impl.class ));
   }

   public wcincidenciaslist_impl( int remoteHandle ,
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
               AV11Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
               AV9Inc_diainicio = localUtil.parseDateParm( httpContext.GetPar( "Inc_diainicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Inc_diainicio", localUtil.format(AV9Inc_diainicio, "99/99/99"));
               AV8Inc_diaFin = localUtil.parseDateParm( httpContext.GetPar( "Inc_diaFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Inc_diaFin", localUtil.format(AV8Inc_diaFin, "99/99/99"));
               AV10Inc_prog = httpContext.GetPar( "Inc_prog") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Inc_prog", AV10Inc_prog);
               AV5Inc_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Inc_Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Inc_Barcod), 8, 0));
               AV7Inc_Barreo = (byte)(GXutil.lval( httpContext.GetPar( "Inc_Barreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Inc_Barreo", GXutil.str( AV7Inc_Barreo, 1, 0));
               AV6Inc_barpar = httpContext.GetPar( "Inc_barpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Inc_barpar", AV6Inc_barpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV11Emprcod,AV9Inc_diainicio,AV8Inc_diaFin,AV10Inc_prog,Integer.valueOf(AV5Inc_Barcod),Byte.valueOf(AV7Inc_Barreo),AV6Inc_barpar});
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtincidenciass") == 0 )
            {
               gxnrgridsdtincidenciass_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtincidenciass") == 0 )
            {
               gxgrgridsdtincidenciass_refresh_invoke( ) ;
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

   public void gxnrgridsdtincidenciass_newrow_invoke( )
   {
      nRC_GXsfl_15 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_15"))) ;
      nGXsfl_15_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_15_idx"))) ;
      sGXsfl_15_idx = httpContext.GetPar( "sGXsfl_15_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtincidenciass_newrow( ) ;
      /* End function gxnrGridsdtincidenciass_newrow_invoke */
   }

   public void gxgrgridsdtincidenciass_refresh_invoke( )
   {
      subGridsdtincidenciass_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtincidenciass_Rows"))) ;
      AV11Emprcod = httpContext.GetPar( "Emprcod") ;
      AV9Inc_diainicio = localUtil.parseDateParm( httpContext.GetPar( "Inc_diainicio")) ;
      AV8Inc_diaFin = localUtil.parseDateParm( httpContext.GetPar( "Inc_diaFin")) ;
      AV10Inc_prog = httpContext.GetPar( "Inc_prog") ;
      AV5Inc_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Inc_Barcod"))) ;
      AV7Inc_Barreo = (byte)(GXutil.lval( httpContext.GetPar( "Inc_Barreo"))) ;
      AV6Inc_barpar = httpContext.GetPar( "Inc_barpar") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtincidenciass_refresh( subGridsdtincidenciass_Rows, AV11Emprcod, AV9Inc_diainicio, AV8Inc_diaFin, AV10Inc_prog, AV5Inc_Barcod, AV7Inc_Barreo, AV6Inc_barpar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtincidenciass_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paFK2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Incidencias (List)", "")) ;
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
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcincidenciaslist", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV9Inc_diainicio)),GXutil.URLEncode(GXutil.formatDateParm(AV8Inc_diaFin)),GXutil.URLEncode(GXutil.rtrim(AV10Inc_prog)),GXutil.URLEncode(GXutil.ltrimstr(AV5Inc_Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Inc_Barreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6Inc_barpar))}, new String[] {"Emprcod","Inc_diainicio","Inc_diaFin","Inc_prog","Inc_Barcod","Inc_Barreo","Inc_barpar"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtincidenciass", AV12SDTIncidenciass);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtincidenciass", AV12SDTIncidenciass);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_15", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_15, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTINCIDENCIASSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridSDTIncidenciassCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTINCIDENCIASSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridSDTIncidenciassPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11Emprcod", GXutil.rtrim( wcpOAV11Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Inc_diainicio", localUtil.dtoc( wcpOAV9Inc_diainicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Inc_diaFin", localUtil.dtoc( wcpOAV8Inc_diaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Inc_prog", GXutil.rtrim( wcpOAV10Inc_prog));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Inc_Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV5Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Inc_Barreo", GXutil.ltrim( localUtil.ntoc( wcpOAV7Inc_Barreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Inc_barpar", GXutil.rtrim( wcpOAV6Inc_barpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV11Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_DIAINICIO", localUtil.dtoc( AV9Inc_diainicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_DIAFIN", localUtil.dtoc( AV8Inc_diaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_PROG", GXutil.rtrim( AV10Inc_prog));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_BARCOD", GXutil.ltrim( localUtil.ntoc( AV5Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_BARREO", GXutil.ltrim( localUtil.ntoc( AV7Inc_Barreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_BARPAR", GXutil.rtrim( AV6Inc_barpar));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTINCIDENCIASS", AV12SDTIncidenciass);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTINCIDENCIASS", AV12SDTIncidenciass);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtincidenciasspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtincidenciasspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtincidenciasspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtincidenciasspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtincidenciasspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtincidenciasspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtincidenciass_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtincidenciasspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormFK2( )
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
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
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
      return "WCIncidenciasList" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Incidencias (List)", "") ;
   }

   public void wbFK0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcincidenciaslist");
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
         app.GxWebStd.gx_div_start( httpContext, divGridsdtincidenciasstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtincidenciassContainer.SetWrapped(nGXWrapped);
         startgridcontrol15( ) ;
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_15 = (int)(nGXsfl_15_idx-1) ;
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV19GXV1 = nGXsfl_15_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridsdtincidenciassContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtincidenciass", GridsdtincidenciassContainer, subGridsdtincidenciass_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtincidenciassContainerData", GridsdtincidenciassContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtincidenciassContainerData"+"V", GridsdtincidenciassContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtincidenciassContainerData"+"V"+"\" value='"+GridsdtincidenciassContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtincidenciasspaginationbar.setProperty("Class", Gridsdtincidenciasspaginationbar_Class);
         ucGridsdtincidenciasspaginationbar.setProperty("ShowFirst", Gridsdtincidenciasspaginationbar_Showfirst);
         ucGridsdtincidenciasspaginationbar.setProperty("ShowPrevious", Gridsdtincidenciasspaginationbar_Showprevious);
         ucGridsdtincidenciasspaginationbar.setProperty("ShowNext", Gridsdtincidenciasspaginationbar_Shownext);
         ucGridsdtincidenciasspaginationbar.setProperty("ShowLast", Gridsdtincidenciasspaginationbar_Showlast);
         ucGridsdtincidenciasspaginationbar.setProperty("PagesToShow", Gridsdtincidenciasspaginationbar_Pagestoshow);
         ucGridsdtincidenciasspaginationbar.setProperty("PagingButtonsPosition", Gridsdtincidenciasspaginationbar_Pagingbuttonsposition);
         ucGridsdtincidenciasspaginationbar.setProperty("PagingCaptionPosition", Gridsdtincidenciasspaginationbar_Pagingcaptionposition);
         ucGridsdtincidenciasspaginationbar.setProperty("EmptyGridClass", Gridsdtincidenciasspaginationbar_Emptygridclass);
         ucGridsdtincidenciasspaginationbar.setProperty("RowsPerPageSelector", Gridsdtincidenciasspaginationbar_Rowsperpageselector);
         ucGridsdtincidenciasspaginationbar.setProperty("RowsPerPageOptions", Gridsdtincidenciasspaginationbar_Rowsperpageoptions);
         ucGridsdtincidenciasspaginationbar.setProperty("Previous", Gridsdtincidenciasspaginationbar_Previous);
         ucGridsdtincidenciasspaginationbar.setProperty("Next", Gridsdtincidenciasspaginationbar_Next);
         ucGridsdtincidenciasspaginationbar.setProperty("Caption", Gridsdtincidenciasspaginationbar_Caption);
         ucGridsdtincidenciasspaginationbar.setProperty("EmptyGridCaption", Gridsdtincidenciasspaginationbar_Emptygridcaption);
         ucGridsdtincidenciasspaginationbar.setProperty("RowsPerPageCaption", Gridsdtincidenciasspaginationbar_Rowsperpagecaption);
         ucGridsdtincidenciasspaginationbar.setProperty("CurrentPage", AV15GridSDTIncidenciassCurrentPage);
         ucGridsdtincidenciasspaginationbar.setProperty("PageCount", AV16GridSDTIncidenciassPageCount);
         ucGridsdtincidenciasspaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtincidenciasspaginationbar_Internalname, sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBARContainer");
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
         /* User Defined Control */
         ucGridsdtincidenciass_empowerer.render(context, "wwp.gridempowerer", Gridsdtincidenciass_empowerer_Internalname, sPrefix+"GRIDSDTINCIDENCIASS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV19GXV1 = nGXsfl_15_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridsdtincidenciassContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtincidenciass", GridsdtincidenciassContainer, subGridsdtincidenciass_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtincidenciassContainerData", GridsdtincidenciassContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtincidenciassContainerData"+"V", GridsdtincidenciassContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtincidenciassContainerData"+"V"+"\" value='"+GridsdtincidenciassContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startFK2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Incidencias (List)", ""), (short)(0)) ;
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
            strupFK0( ) ;
         }
      }
   }

   public void wsFK2( )
   {
      startFK2( ) ;
      evtFK2( ) ;
   }

   public void evtFK2( )
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
                              strupFK0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTINCIDENCIASSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupFK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11FK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTINCIDENCIASSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupFK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12FK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupFK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 24), "GRIDSDTINCIDENCIASS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupFK0( ) ;
                           }
                           nGXsfl_15_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_152( ) ;
                           AV19GXV1 = (int)(nGXsfl_15_idx+GRIDSDTINCIDENCIASS_nFirstRecordOnPage) ;
                           if ( ( AV12SDTIncidenciass.size() >= AV19GXV1 ) && ( AV19GXV1 > 0 ) )
                           {
                              AV12SDTIncidenciass.currentItem( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)) );
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
                                       /* Execute user event: Start */
                                       e13FK2 ();
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
                                       /* Execute user event: Refresh */
                                       e14FK2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTINCIDENCIASS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e15FK2 ();
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
                                    strupFK0( ) ;
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

   public void weFK2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormFK2( ) ;
         }
      }
   }

   public void paFK2( )
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
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsdtincidenciass_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_152( ) ;
      while ( nGXsfl_15_idx <= nRC_GXsfl_15 )
      {
         sendrow_152( ) ;
         nGXsfl_15_idx = ((subGridsdtincidenciass_Islastpage==1)&&(nGXsfl_15_idx+1>subgridsdtincidenciass_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtincidenciassContainer)) ;
      /* End function gxnrGridsdtincidenciass_newrow */
   }

   public void gxgrgridsdtincidenciass_refresh( int subGridsdtincidenciass_Rows ,
                                                String AV11Emprcod ,
                                                java.util.Date AV9Inc_diainicio ,
                                                java.util.Date AV8Inc_diaFin ,
                                                String AV10Inc_prog ,
                                                int AV5Inc_Barcod ,
                                                byte AV7Inc_Barreo ,
                                                String AV6Inc_barpar ,
                                                String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14FK2 ();
      GRIDSDTINCIDENCIASS_nCurrentRecord = 0 ;
      rfFK2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtincidenciass_refresh */
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
      rfFK2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdtincidenciass__inc_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_dia_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_linea_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_hora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_hora_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_usuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_usuario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_usuario_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_terminal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_terminal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_terminal_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_prog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_prog_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_obstxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_obstxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_obstxt_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_barcod_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_barreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_barreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_barreo_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_barpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_barpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_barpar_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_hdr_Enabled), 5, 0), !bGXsfl_15_Refreshing);
   }

   public void rfFK2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtincidenciassContainer.ClearRows();
      }
      wbStart = (short)(15) ;
      /* Execute user event: Refresh */
      e14FK2 ();
      nGXsfl_15_idx = 1 ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      bGXsfl_15_Refreshing = true ;
      GridsdtincidenciassContainer.AddObjectProperty("GridName", "Gridsdtincidenciass");
      GridsdtincidenciassContainer.AddObjectProperty("CmpContext", sPrefix);
      GridsdtincidenciassContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtincidenciassContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtincidenciassContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtincidenciassContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtincidenciassContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtincidenciassContainer.setPageSize( subgridsdtincidenciass_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_152( ) ;
         e15FK2 ();
         if ( ( GRIDSDTINCIDENCIASS_nCurrentRecord > 0 ) && ( GRIDSDTINCIDENCIASS_nGridOutOfScope == 0 ) && ( nGXsfl_15_idx == 1 ) )
         {
            GRIDSDTINCIDENCIASS_nCurrentRecord = 0 ;
            GRIDSDTINCIDENCIASS_nGridOutOfScope = 1 ;
            subgridsdtincidenciass_firstpage( ) ;
            e15FK2 ();
         }
         wbEnd = (short)(15) ;
         wbFK0( ) ;
      }
      bGXsfl_15_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesFK2( )
   {
   }

   public int subgridsdtincidenciass_fnc_pagecount( )
   {
      GRIDSDTINCIDENCIASS_nRecordCount = subgridsdtincidenciass_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTINCIDENCIASS_nRecordCount) % (subgridsdtincidenciass_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTINCIDENCIASS_nRecordCount/ (double) (subgridsdtincidenciass_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTINCIDENCIASS_nRecordCount/ (double) (subgridsdtincidenciass_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtincidenciass_fnc_recordcount( )
   {
      return AV12SDTIncidenciass.size() ;
   }

   public int subgridsdtincidenciass_fnc_recordsperpage( )
   {
      if ( subGridsdtincidenciass_Rows > 0 )
      {
         return subGridsdtincidenciass_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtincidenciass_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTINCIDENCIASS_nFirstRecordOnPage/ (double) (subgridsdtincidenciass_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtincidenciass_firstpage( )
   {
      GRIDSDTINCIDENCIASS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtincidenciass_refresh( subGridsdtincidenciass_Rows, AV11Emprcod, AV9Inc_diainicio, AV8Inc_diaFin, AV10Inc_prog, AV5Inc_Barcod, AV7Inc_Barreo, AV6Inc_barpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtincidenciass_nextpage( )
   {
      GRIDSDTINCIDENCIASS_nRecordCount = subgridsdtincidenciass_fnc_recordcount( ) ;
      if ( ( GRIDSDTINCIDENCIASS_nRecordCount >= subgridsdtincidenciass_fnc_recordsperpage( ) ) && ( GRIDSDTINCIDENCIASS_nEOF == 0 ) )
      {
         GRIDSDTINCIDENCIASS_nFirstRecordOnPage = (long)(GRIDSDTINCIDENCIASS_nFirstRecordOnPage+subgridsdtincidenciass_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtincidenciassContainer.AddObjectProperty("GRIDSDTINCIDENCIASS_nFirstRecordOnPage", GRIDSDTINCIDENCIASS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtincidenciass_refresh( subGridsdtincidenciass_Rows, AV11Emprcod, AV9Inc_diainicio, AV8Inc_diaFin, AV10Inc_prog, AV5Inc_Barcod, AV7Inc_Barreo, AV6Inc_barpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTINCIDENCIASS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtincidenciass_previouspage( )
   {
      if ( GRIDSDTINCIDENCIASS_nFirstRecordOnPage >= subgridsdtincidenciass_fnc_recordsperpage( ) )
      {
         GRIDSDTINCIDENCIASS_nFirstRecordOnPage = (long)(GRIDSDTINCIDENCIASS_nFirstRecordOnPage-subgridsdtincidenciass_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtincidenciass_refresh( subGridsdtincidenciass_Rows, AV11Emprcod, AV9Inc_diainicio, AV8Inc_diaFin, AV10Inc_prog, AV5Inc_Barcod, AV7Inc_Barreo, AV6Inc_barpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtincidenciass_lastpage( )
   {
      GRIDSDTINCIDENCIASS_nRecordCount = subgridsdtincidenciass_fnc_recordcount( ) ;
      if ( GRIDSDTINCIDENCIASS_nRecordCount > subgridsdtincidenciass_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTINCIDENCIASS_nRecordCount) % (subgridsdtincidenciass_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTINCIDENCIASS_nFirstRecordOnPage = (long)(GRIDSDTINCIDENCIASS_nRecordCount-subgridsdtincidenciass_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTINCIDENCIASS_nFirstRecordOnPage = (long)(GRIDSDTINCIDENCIASS_nRecordCount-((int)((GRIDSDTINCIDENCIASS_nRecordCount) % (subgridsdtincidenciass_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTINCIDENCIASS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtincidenciass_refresh( subGridsdtincidenciass_Rows, AV11Emprcod, AV9Inc_diainicio, AV8Inc_diaFin, AV10Inc_prog, AV5Inc_Barcod, AV7Inc_Barreo, AV6Inc_barpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtincidenciass_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTINCIDENCIASS_nFirstRecordOnPage = (long)(subgridsdtincidenciass_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTINCIDENCIASS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtincidenciass_refresh( subGridsdtincidenciass_Rows, AV11Emprcod, AV9Inc_diainicio, AV8Inc_diaFin, AV10Inc_prog, AV5Inc_Barcod, AV7Inc_Barreo, AV6Inc_barpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSdtincidenciass__inc_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_dia_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_linea_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_hora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_hora_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_usuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_usuario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_usuario_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_terminal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_terminal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_terminal_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_prog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_prog_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_obstxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_obstxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_obstxt_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_barcod_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_barreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_barreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_barreo_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_barpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_barpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_barpar_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      edtavSdtincidenciass__inc_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtincidenciass__inc_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtincidenciass__inc_hdr_Enabled), 5, 0), !bGXsfl_15_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupFK0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13FK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtincidenciass"), AV12SDTIncidenciass);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTINCIDENCIASS"), AV12SDTIncidenciass);
         /* Read saved values. */
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15GridSDTIncidenciassCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTINCIDENCIASSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridSDTIncidenciassPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTINCIDENCIASSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV11Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV11Emprcod") ;
         wcpOAV9Inc_diainicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9Inc_diainicio"), 0) ;
         wcpOAV8Inc_diaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8Inc_diaFin"), 0) ;
         wcpOAV10Inc_prog = httpContext.cgiGet( sPrefix+"wcpOAV10Inc_prog") ;
         wcpOAV5Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Inc_Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Inc_Barreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Inc_Barreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6Inc_barpar = httpContext.cgiGet( sPrefix+"wcpOAV6Inc_barpar") ;
         GRIDSDTINCIDENCIASS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTINCIDENCIASS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtincidenciass_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridsdtincidenciasspaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Class") ;
         Gridsdtincidenciasspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Showfirst")) ;
         Gridsdtincidenciasspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Showprevious")) ;
         Gridsdtincidenciasspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Shownext")) ;
         Gridsdtincidenciasspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Showlast")) ;
         Gridsdtincidenciasspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtincidenciasspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtincidenciasspaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtincidenciasspaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Emptygridclass") ;
         Gridsdtincidenciasspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtincidenciasspaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtincidenciasspaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Previous") ;
         Gridsdtincidenciasspaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Next") ;
         Gridsdtincidenciasspaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Caption") ;
         Gridsdtincidenciasspaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtincidenciasspaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpagecaption") ;
         Gridsdtincidenciass_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASS_EMPOWERER_Gridinternalname") ;
         Gridsdtincidenciasspaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Selectedpage") ;
         Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_15_fel_idx = 0 ;
         while ( nGXsfl_15_fel_idx < nRC_GXsfl_15 )
         {
            nGXsfl_15_fel_idx = ((subGridsdtincidenciass_Islastpage==1)&&(nGXsfl_15_fel_idx+1>subgridsdtincidenciass_fnc_recordsperpage( )) ? 1 : nGXsfl_15_fel_idx+1) ;
            sGXsfl_15_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_152( ) ;
            AV19GXV1 = (int)(nGXsfl_15_fel_idx+GRIDSDTINCIDENCIASS_nFirstRecordOnPage) ;
            if ( ( AV12SDTIncidenciass.size() >= AV19GXV1 ) && ( AV19GXV1 > 0 ) )
            {
               AV12SDTIncidenciass.currentItem( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)) );
            }
         }
         if ( nGXsfl_15_fel_idx == 0 )
         {
            nGXsfl_15_idx = 1 ;
            sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_152( ) ;
         }
         nGXsfl_15_fel_idx = 1 ;
         /* Read variables values. */
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
      e13FK2 ();
      if (returnInSub) return;
   }

   public void e13FK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcincidenciaslist_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      GXv_char2[0] = AV11Emprcod ;
      GXv_char3[0] = AV32Emprnom ;
      GXv_char4[0] = AV33Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcincidenciaslist_impl.this.AV11Emprcod = GXv_char2[0] ;
      wcincidenciaslist_impl.this.AV32Emprnom = GXv_char3[0] ;
      wcincidenciaslist_impl.this.AV33Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
      Gridsdtincidenciass_empowerer_Gridinternalname = subGridsdtincidenciass_Internalname ;
      ucGridsdtincidenciass_empowerer.sendProperty(context, sPrefix, false, Gridsdtincidenciass_empowerer_Internalname, "GridInternalName", Gridsdtincidenciass_empowerer_Gridinternalname);
      subGridsdtincidenciass_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue = subGridsdtincidenciass_Rows ;
      ucGridsdtincidenciasspaginationbar.sendProperty(context, sPrefix, false, Gridsdtincidenciasspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e14FK2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTIncidencias5 = AV12SDTIncidenciass ;
      GXv_objcol_SdtSDTIncidencias6[0] = GXt_objcol_SdtSDTIncidencias5 ;
      new app.dpincidencias(remoteHandle, context).execute( AV11Emprcod, AV9Inc_diainicio, AV8Inc_diaFin, AV10Inc_prog, AV5Inc_Barcod, AV7Inc_Barreo, AV6Inc_barpar, GXv_objcol_SdtSDTIncidencias6) ;
      GXt_objcol_SdtSDTIncidencias5 = GXv_objcol_SdtSDTIncidencias6[0] ;
      AV12SDTIncidenciass = GXt_objcol_SdtSDTIncidencias5 ;
      gx_BV15 = true ;
      AV15GridSDTIncidenciassCurrentPage = subgridsdtincidenciass_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GridSDTIncidenciassCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridSDTIncidenciassCurrentPage), 10, 0));
      AV16GridSDTIncidenciassPageCount = subgridsdtincidenciass_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16GridSDTIncidenciassPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridSDTIncidenciassPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12SDTIncidenciass", AV12SDTIncidenciass);
   }

   private void e15FK2( )
   {
      /* Gridsdtincidenciass_Load Routine */
      returnInSub = false ;
      AV19GXV1 = 1 ;
      while ( AV19GXV1 <= AV12SDTIncidenciass.size() )
      {
         AV12SDTIncidenciass.currentItem( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(15) ;
         }
         if ( ( subGridsdtincidenciass_Islastpage == 1 ) || ( subGridsdtincidenciass_Rows == 0 ) || ( ( GRIDSDTINCIDENCIASS_nCurrentRecord >= GRIDSDTINCIDENCIASS_nFirstRecordOnPage ) && ( GRIDSDTINCIDENCIASS_nCurrentRecord < GRIDSDTINCIDENCIASS_nFirstRecordOnPage + subgridsdtincidenciass_fnc_recordsperpage( ) ) ) )
         {
            sendrow_152( ) ;
            GRIDSDTINCIDENCIASS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTINCIDENCIASS_nCurrentRecord + 1 >= subgridsdtincidenciass_fnc_recordcount( ) )
            {
               GRIDSDTINCIDENCIASS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTINCIDENCIASS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTINCIDENCIASS_nCurrentRecord = (long)(GRIDSDTINCIDENCIASS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_15_Refreshing )
         {
            httpContext.doAjaxLoad(15, GridsdtincidenciassRow);
         }
         AV19GXV1 = (int)(AV19GXV1+1) ;
      }
   }

   public void e11FK2( )
   {
      /* Gridsdtincidenciasspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtincidenciasspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtincidenciass_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtincidenciasspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV14PageToGo = subgridsdtincidenciass_fnc_currentpage( ) ;
         AV14PageToGo = (int)(AV14PageToGo+1) ;
         subgridsdtincidenciass_gotopage( AV14PageToGo) ;
      }
      else
      {
         AV14PageToGo = (int)(GXutil.lval( Gridsdtincidenciasspaginationbar_Selectedpage)) ;
         subgridsdtincidenciass_gotopage( AV14PageToGo) ;
      }
   }

   public void e12FK2( )
   {
      /* Gridsdtincidenciasspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtincidenciass_Rows = Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTINCIDENCIASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtincidenciass_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
      AV9Inc_diainicio = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Inc_diainicio", localUtil.format(AV9Inc_diainicio, "99/99/99"));
      AV8Inc_diaFin = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Inc_diaFin", localUtil.format(AV8Inc_diaFin, "99/99/99"));
      AV10Inc_prog = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Inc_prog", AV10Inc_prog);
      AV5Inc_Barcod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Inc_Barcod), 8, 0));
      AV7Inc_Barreo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Inc_Barreo", GXutil.str( AV7Inc_Barreo, 1, 0));
      AV6Inc_barpar = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Inc_barpar", AV6Inc_barpar);
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
      paFK2( ) ;
      wsFK2( ) ;
      weFK2( ) ;
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
      sCtrlAV11Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV9Inc_diainicio = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8Inc_diaFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10Inc_prog = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV5Inc_Barcod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV7Inc_Barreo = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV6Inc_barpar = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paFK2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcincidenciaslist", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paFK2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV11Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
         AV9Inc_diainicio = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Inc_diainicio", localUtil.format(AV9Inc_diainicio, "99/99/99"));
         AV8Inc_diaFin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Inc_diaFin", localUtil.format(AV8Inc_diaFin, "99/99/99"));
         AV10Inc_prog = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Inc_prog", AV10Inc_prog);
         AV5Inc_Barcod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Inc_Barcod), 8, 0));
         AV7Inc_Barreo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Inc_Barreo", GXutil.str( AV7Inc_Barreo, 1, 0));
         AV6Inc_barpar = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Inc_barpar", AV6Inc_barpar);
      }
      wcpOAV11Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV11Emprcod") ;
      wcpOAV9Inc_diainicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9Inc_diainicio"), 0) ;
      wcpOAV8Inc_diaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8Inc_diaFin"), 0) ;
      wcpOAV10Inc_prog = httpContext.cgiGet( sPrefix+"wcpOAV10Inc_prog") ;
      wcpOAV5Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Inc_Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7Inc_Barreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Inc_Barreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6Inc_barpar = httpContext.cgiGet( sPrefix+"wcpOAV6Inc_barpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV11Emprcod, wcpOAV11Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV9Inc_diainicio), GXutil.resetTime(wcpOAV9Inc_diainicio)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV8Inc_diaFin), GXutil.resetTime(wcpOAV8Inc_diaFin)) ) || ( GXutil.strcmp(AV10Inc_prog, wcpOAV10Inc_prog) != 0 ) || ( AV5Inc_Barcod != wcpOAV5Inc_Barcod ) || ( AV7Inc_Barreo != wcpOAV7Inc_Barreo ) || ( GXutil.strcmp(AV6Inc_barpar, wcpOAV6Inc_barpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV11Emprcod = AV11Emprcod ;
      wcpOAV9Inc_diainicio = AV9Inc_diainicio ;
      wcpOAV8Inc_diaFin = AV8Inc_diaFin ;
      wcpOAV10Inc_prog = AV10Inc_prog ;
      wcpOAV5Inc_Barcod = AV5Inc_Barcod ;
      wcpOAV7Inc_Barreo = AV7Inc_Barreo ;
      wcpOAV6Inc_barpar = AV6Inc_barpar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV11Emprcod = httpContext.cgiGet( sPrefix+"AV11Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV11Emprcod) > 0 )
      {
         AV11Emprcod = httpContext.cgiGet( sCtrlAV11Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
      }
      else
      {
         AV11Emprcod = httpContext.cgiGet( sPrefix+"AV11Emprcod_PARM") ;
      }
      sCtrlAV9Inc_diainicio = httpContext.cgiGet( sPrefix+"AV9Inc_diainicio_CTRL") ;
      if ( GXutil.len( sCtrlAV9Inc_diainicio) > 0 )
      {
         AV9Inc_diainicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9Inc_diainicio), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Inc_diainicio", localUtil.format(AV9Inc_diainicio, "99/99/99"));
      }
      else
      {
         AV9Inc_diainicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9Inc_diainicio_PARM"), 0) ;
      }
      sCtrlAV8Inc_diaFin = httpContext.cgiGet( sPrefix+"AV8Inc_diaFin_CTRL") ;
      if ( GXutil.len( sCtrlAV8Inc_diaFin) > 0 )
      {
         AV8Inc_diaFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8Inc_diaFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Inc_diaFin", localUtil.format(AV8Inc_diaFin, "99/99/99"));
      }
      else
      {
         AV8Inc_diaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8Inc_diaFin_PARM"), 0) ;
      }
      sCtrlAV10Inc_prog = httpContext.cgiGet( sPrefix+"AV10Inc_prog_CTRL") ;
      if ( GXutil.len( sCtrlAV10Inc_prog) > 0 )
      {
         AV10Inc_prog = httpContext.cgiGet( sCtrlAV10Inc_prog) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Inc_prog", AV10Inc_prog);
      }
      else
      {
         AV10Inc_prog = httpContext.cgiGet( sPrefix+"AV10Inc_prog_PARM") ;
      }
      sCtrlAV5Inc_Barcod = httpContext.cgiGet( sPrefix+"AV5Inc_Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Inc_Barcod) > 0 )
      {
         AV5Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Inc_Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Inc_Barcod), 8, 0));
      }
      else
      {
         AV5Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Inc_Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7Inc_Barreo = httpContext.cgiGet( sPrefix+"AV7Inc_Barreo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Inc_Barreo) > 0 )
      {
         AV7Inc_Barreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7Inc_Barreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Inc_Barreo", GXutil.str( AV7Inc_Barreo, 1, 0));
      }
      else
      {
         AV7Inc_Barreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Inc_Barreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6Inc_barpar = httpContext.cgiGet( sPrefix+"AV6Inc_barpar_CTRL") ;
      if ( GXutil.len( sCtrlAV6Inc_barpar) > 0 )
      {
         AV6Inc_barpar = httpContext.cgiGet( sCtrlAV6Inc_barpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Inc_barpar", AV6Inc_barpar);
      }
      else
      {
         AV6Inc_barpar = httpContext.cgiGet( sPrefix+"AV6Inc_barpar_PARM") ;
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
      paFK2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsFK2( ) ;
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
      wsFK2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Emprcod_PARM", GXutil.rtrim( AV11Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Emprcod_CTRL", GXutil.rtrim( sCtrlAV11Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Inc_diainicio_PARM", localUtil.dtoc( AV9Inc_diainicio, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Inc_diainicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Inc_diainicio_CTRL", GXutil.rtrim( sCtrlAV9Inc_diainicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Inc_diaFin_PARM", localUtil.dtoc( AV8Inc_diaFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Inc_diaFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Inc_diaFin_CTRL", GXutil.rtrim( sCtrlAV8Inc_diaFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Inc_prog_PARM", GXutil.rtrim( AV10Inc_prog));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Inc_prog)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Inc_prog_CTRL", GXutil.rtrim( sCtrlAV10Inc_prog));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Inc_Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV5Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Inc_Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Inc_Barcod_CTRL", GXutil.rtrim( sCtrlAV5Inc_Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Inc_Barreo_PARM", GXutil.ltrim( localUtil.ntoc( AV7Inc_Barreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Inc_Barreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Inc_Barreo_CTRL", GXutil.rtrim( sCtrlAV7Inc_Barreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Inc_barpar_PARM", GXutil.rtrim( AV6Inc_barpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Inc_barpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Inc_barpar_CTRL", GXutil.rtrim( sCtrlAV6Inc_barpar));
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
      weFK2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564462", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("wcincidenciaslist.js", "?202661015564462", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_152( )
   {
      edtavSdtincidenciass__inc_dia_Internalname = sPrefix+"SDTINCIDENCIASS__INC_DIA_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_linea_Internalname = sPrefix+"SDTINCIDENCIASS__INC_LINEA_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_hora_Internalname = sPrefix+"SDTINCIDENCIASS__INC_HORA_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_usuario_Internalname = sPrefix+"SDTINCIDENCIASS__INC_USUARIO_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_terminal_Internalname = sPrefix+"SDTINCIDENCIASS__INC_TERMINAL_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_prog_Internalname = sPrefix+"SDTINCIDENCIASS__INC_PROG_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_obstxt_Internalname = sPrefix+"SDTINCIDENCIASS__INC_OBSTXT_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_barcod_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARCOD_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_barreo_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARREO_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_barpar_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARPAR_"+sGXsfl_15_idx ;
      edtavSdtincidenciass__inc_hdr_Internalname = sPrefix+"SDTINCIDENCIASS__INC_HDR_"+sGXsfl_15_idx ;
   }

   public void subsflControlProps_fel_152( )
   {
      edtavSdtincidenciass__inc_dia_Internalname = sPrefix+"SDTINCIDENCIASS__INC_DIA_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_linea_Internalname = sPrefix+"SDTINCIDENCIASS__INC_LINEA_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_hora_Internalname = sPrefix+"SDTINCIDENCIASS__INC_HORA_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_usuario_Internalname = sPrefix+"SDTINCIDENCIASS__INC_USUARIO_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_terminal_Internalname = sPrefix+"SDTINCIDENCIASS__INC_TERMINAL_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_prog_Internalname = sPrefix+"SDTINCIDENCIASS__INC_PROG_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_obstxt_Internalname = sPrefix+"SDTINCIDENCIASS__INC_OBSTXT_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_barcod_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARCOD_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_barreo_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARREO_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_barpar_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARPAR_"+sGXsfl_15_fel_idx ;
      edtavSdtincidenciass__inc_hdr_Internalname = sPrefix+"SDTINCIDENCIASS__INC_HDR_"+sGXsfl_15_fel_idx ;
   }

   public void sendrow_152( )
   {
      subsflControlProps_152( ) ;
      wbFK0( ) ;
      if ( ( subGridsdtincidenciass_Rows * 1 == 0 ) || ( nGXsfl_15_idx <= subgridsdtincidenciass_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtincidenciassRow = GXWebRow.GetNew(context,GridsdtincidenciassContainer) ;
         if ( subGridsdtincidenciass_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtincidenciass_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtincidenciass_Class, "") != 0 )
            {
               subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"Odd" ;
            }
         }
         else if ( subGridsdtincidenciass_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtincidenciass_Backstyle = (byte)(0) ;
            subGridsdtincidenciass_Backcolor = subGridsdtincidenciass_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtincidenciass_Class, "") != 0 )
            {
               subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtincidenciass_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtincidenciass_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtincidenciass_Class, "") != 0 )
            {
               subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"Odd" ;
            }
            subGridsdtincidenciass_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtincidenciass_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtincidenciass_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_15_idx) % (2))) == 0 )
            {
               subGridsdtincidenciass_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtincidenciass_Class, "") != 0 )
               {
                  subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtincidenciass_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtincidenciass_Class, "") != 0 )
               {
                  subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_15_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_dia_Internalname,localUtil.format(((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_dia(), "99/99/99"),localUtil.format( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_dia(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_dia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_linea_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_linea(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtincidenciass__inc_linea_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_linea()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_linea()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_linea_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_hora_Internalname,localUtil.ttoc( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_hora(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_hora(), "99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_hora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_hora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_usuario_Internalname,GXutil.rtrim( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_usuario()),GXutil.rtrim( localUtil.format( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_usuario(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_usuario_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_usuario_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_terminal_Internalname,GXutil.rtrim( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_terminal()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_terminal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_terminal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_prog_Internalname,GXutil.rtrim( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_prog()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_prog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_prog_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_obstxt_Internalname,((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_obstxt(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_obstxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_obstxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtincidenciass__inc_barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtincidenciass__inc_barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_barreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_barreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtincidenciass__inc_barreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_barreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_barreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_barreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtincidenciass__inc_barreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_barpar_Internalname,GXutil.rtrim( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_barpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_barpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtincidenciass__inc_barpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtincidenciassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtincidenciass__inc_hdr_Internalname,GXutil.rtrim( ((app.SdtSDTIncidencias)AV12SDTIncidenciass.elementAt(-1+AV19GXV1)).getgxTv_SdtSDTIncidencias_Inc_hdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtincidenciass__inc_hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtincidenciass__inc_hdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesFK2( ) ;
         GridsdtincidenciassContainer.AddRow(GridsdtincidenciassRow);
         nGXsfl_15_idx = ((subGridsdtincidenciass_Islastpage==1)&&(nGXsfl_15_idx+1>subgridsdtincidenciass_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      /* End function sendrow_152 */
   }

   public void startgridcontrol15( )
   {
      if ( GridsdtincidenciassContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridsdtincidenciassContainer"+"DivS\" data-gxgridid=\"15\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtincidenciass_Internalname, subGridsdtincidenciass_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtincidenciass_Backcolorstyle == 0 )
         {
            subGridsdtincidenciass_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtincidenciass_Class) > 0 )
            {
               subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtincidenciass_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtincidenciass_Backcolorstyle == 1 )
            {
               subGridsdtincidenciass_Titlebackcolor = subGridsdtincidenciass_Allbackcolor ;
               if ( GXutil.len( subGridsdtincidenciass_Class) > 0 )
               {
                  subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtincidenciass_Class) > 0 )
               {
                  subGridsdtincidenciass_Linesclass = subGridsdtincidenciass_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia Incidencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora Incidencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Programa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Texto Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hoja de Ruta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reoperado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Particion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtincidenciassContainer.AddObjectProperty("GridName", "Gridsdtincidenciass");
      }
      else
      {
         GridsdtincidenciassContainer.AddObjectProperty("GridName", "Gridsdtincidenciass");
         GridsdtincidenciassContainer.AddObjectProperty("Header", subGridsdtincidenciass_Header);
         GridsdtincidenciassContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtincidenciassContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("CmpContext", sPrefix);
         GridsdtincidenciassContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_dia_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_hora_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_usuario_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_terminal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_prog_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_obstxt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_barreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_barpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtincidenciassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtincidenciass__inc_hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddColumnProperties(GridsdtincidenciassColumn);
         GridsdtincidenciassContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtincidenciassContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtincidenciass_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavSdtincidenciass__inc_dia_Internalname = sPrefix+"SDTINCIDENCIASS__INC_DIA" ;
      edtavSdtincidenciass__inc_linea_Internalname = sPrefix+"SDTINCIDENCIASS__INC_LINEA" ;
      edtavSdtincidenciass__inc_hora_Internalname = sPrefix+"SDTINCIDENCIASS__INC_HORA" ;
      edtavSdtincidenciass__inc_usuario_Internalname = sPrefix+"SDTINCIDENCIASS__INC_USUARIO" ;
      edtavSdtincidenciass__inc_terminal_Internalname = sPrefix+"SDTINCIDENCIASS__INC_TERMINAL" ;
      edtavSdtincidenciass__inc_prog_Internalname = sPrefix+"SDTINCIDENCIASS__INC_PROG" ;
      edtavSdtincidenciass__inc_obstxt_Internalname = sPrefix+"SDTINCIDENCIASS__INC_OBSTXT" ;
      edtavSdtincidenciass__inc_barcod_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARCOD" ;
      edtavSdtincidenciass__inc_barreo_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARREO" ;
      edtavSdtincidenciass__inc_barpar_Internalname = sPrefix+"SDTINCIDENCIASS__INC_BARPAR" ;
      edtavSdtincidenciass__inc_hdr_Internalname = sPrefix+"SDTINCIDENCIASS__INC_HDR" ;
      Gridsdtincidenciasspaginationbar_Internalname = sPrefix+"GRIDSDTINCIDENCIASSPAGINATIONBAR" ;
      divGridsdtincidenciasstablewithpaginationbar_Internalname = sPrefix+"GRIDSDTINCIDENCIASSTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Gridsdtincidenciass_empowerer_Internalname = sPrefix+"GRIDSDTINCIDENCIASS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridsdtincidenciass_Internalname = sPrefix+"GRIDSDTINCIDENCIASS" ;
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
      subGridsdtincidenciass_Allowcollapsing = (byte)(0) ;
      subGridsdtincidenciass_Allowselection = (byte)(0) ;
      subGridsdtincidenciass_Header = "" ;
      edtavSdtincidenciass__inc_hdr_Jsonclick = "" ;
      edtavSdtincidenciass__inc_hdr_Enabled = 0 ;
      edtavSdtincidenciass__inc_barpar_Jsonclick = "" ;
      edtavSdtincidenciass__inc_barpar_Enabled = 0 ;
      edtavSdtincidenciass__inc_barreo_Jsonclick = "" ;
      edtavSdtincidenciass__inc_barreo_Enabled = 0 ;
      edtavSdtincidenciass__inc_barcod_Jsonclick = "" ;
      edtavSdtincidenciass__inc_barcod_Enabled = 0 ;
      edtavSdtincidenciass__inc_obstxt_Jsonclick = "" ;
      edtavSdtincidenciass__inc_obstxt_Enabled = 0 ;
      edtavSdtincidenciass__inc_prog_Jsonclick = "" ;
      edtavSdtincidenciass__inc_prog_Enabled = 0 ;
      edtavSdtincidenciass__inc_terminal_Jsonclick = "" ;
      edtavSdtincidenciass__inc_terminal_Enabled = 0 ;
      edtavSdtincidenciass__inc_usuario_Jsonclick = "" ;
      edtavSdtincidenciass__inc_usuario_Enabled = 0 ;
      edtavSdtincidenciass__inc_hora_Jsonclick = "" ;
      edtavSdtincidenciass__inc_hora_Enabled = 0 ;
      edtavSdtincidenciass__inc_linea_Jsonclick = "" ;
      edtavSdtincidenciass__inc_linea_Enabled = 0 ;
      edtavSdtincidenciass__inc_dia_Jsonclick = "" ;
      edtavSdtincidenciass__inc_dia_Enabled = 0 ;
      subGridsdtincidenciass_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtincidenciass_Backcolorstyle = (byte)(0) ;
      edtavSdtincidenciass__inc_hdr_Enabled = -1 ;
      edtavSdtincidenciass__inc_barpar_Enabled = -1 ;
      edtavSdtincidenciass__inc_barreo_Enabled = -1 ;
      edtavSdtincidenciass__inc_barcod_Enabled = -1 ;
      edtavSdtincidenciass__inc_obstxt_Enabled = -1 ;
      edtavSdtincidenciass__inc_prog_Enabled = -1 ;
      edtavSdtincidenciass__inc_terminal_Enabled = -1 ;
      edtavSdtincidenciass__inc_usuario_Enabled = -1 ;
      edtavSdtincidenciass__inc_hora_Enabled = -1 ;
      edtavSdtincidenciass__inc_linea_Enabled = -1 ;
      edtavSdtincidenciass__inc_dia_Enabled = -1 ;
      Gridsdtincidenciasspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtincidenciasspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtincidenciasspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtincidenciasspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtincidenciasspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtincidenciasspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtincidenciasspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtincidenciasspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtincidenciasspaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtincidenciasspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtincidenciasspaginationbar_Pagestoshow = 5 ;
      Gridsdtincidenciasspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtincidenciasspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtincidenciasspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtincidenciasspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtincidenciasspaginationbar_Class = "PaginationBar" ;
      subGridsdtincidenciass_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTINCIDENCIASS_nFirstRecordOnPage'},{av:'GRIDSDTINCIDENCIASS_nEOF'},{av:'AV12SDTIncidenciass',fld:'vSDTINCIDENCIASS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTINCIDENCIASS',prop:'GridRC',grid:15},{av:'subGridsdtincidenciass_Rows',ctrl:'GRIDSDTINCIDENCIASS',prop:'Rows'},{av:'sPrefix'},{av:'AV11Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Inc_diainicio',fld:'vINC_DIAINICIO',pic:''},{av:'AV8Inc_diaFin',fld:'vINC_DIAFIN',pic:''},{av:'AV10Inc_prog',fld:'vINC_PROG',pic:''},{av:'AV5Inc_Barcod',fld:'vINC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV7Inc_Barreo',fld:'vINC_BARREO',pic:'9'},{av:'AV6Inc_barpar',fld:'vINC_BARPAR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV12SDTIncidenciass',fld:'vSDTINCIDENCIASS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'GRIDSDTINCIDENCIASS_nFirstRecordOnPage'},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTINCIDENCIASS',prop:'GridRC',grid:15},{av:'AV15GridSDTIncidenciassCurrentPage',fld:'vGRIDSDTINCIDENCIASSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridSDTIncidenciassPageCount',fld:'vGRIDSDTINCIDENCIASSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDTINCIDENCIASS.LOAD","{handler:'e15FK2',iparms:[]");
      setEventMetadata("GRIDSDTINCIDENCIASS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTINCIDENCIASSPAGINATIONBAR.CHANGEPAGE","{handler:'e11FK2',iparms:[{av:'GRIDSDTINCIDENCIASS_nFirstRecordOnPage'},{av:'GRIDSDTINCIDENCIASS_nEOF'},{av:'AV12SDTIncidenciass',fld:'vSDTINCIDENCIASS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTINCIDENCIASS',prop:'GridRC',grid:15},{av:'subGridsdtincidenciass_Rows',ctrl:'GRIDSDTINCIDENCIASS',prop:'Rows'},{av:'AV11Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Inc_diainicio',fld:'vINC_DIAINICIO',pic:''},{av:'AV8Inc_diaFin',fld:'vINC_DIAFIN',pic:''},{av:'AV10Inc_prog',fld:'vINC_PROG',pic:''},{av:'AV5Inc_Barcod',fld:'vINC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV7Inc_Barreo',fld:'vINC_BARREO',pic:'9'},{av:'AV6Inc_barpar',fld:'vINC_BARPAR',pic:''},{av:'sPrefix'},{av:'Gridsdtincidenciasspaginationbar_Selectedpage',ctrl:'GRIDSDTINCIDENCIASSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTINCIDENCIASSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTINCIDENCIASSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12FK2',iparms:[{av:'GRIDSDTINCIDENCIASS_nFirstRecordOnPage'},{av:'GRIDSDTINCIDENCIASS_nEOF'},{av:'AV12SDTIncidenciass',fld:'vSDTINCIDENCIASS',grid:15,pic:''},{av:'nGXsfl_15_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:15},{av:'nRC_GXsfl_15',ctrl:'GRIDSDTINCIDENCIASS',prop:'GridRC',grid:15},{av:'subGridsdtincidenciass_Rows',ctrl:'GRIDSDTINCIDENCIASS',prop:'Rows'},{av:'AV11Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Inc_diainicio',fld:'vINC_DIAINICIO',pic:''},{av:'AV8Inc_diaFin',fld:'vINC_DIAFIN',pic:''},{av:'AV10Inc_prog',fld:'vINC_PROG',pic:''},{av:'AV5Inc_Barcod',fld:'vINC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV7Inc_Barreo',fld:'vINC_BARREO',pic:'9'},{av:'AV6Inc_barpar',fld:'vINC_BARPAR',pic:''},{av:'sPrefix'},{av:'Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTINCIDENCIASSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTINCIDENCIASSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtincidenciass_Rows',ctrl:'GRIDSDTINCIDENCIASS',prop:'Rows'}]}");
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
      wcpOAV11Emprcod = "" ;
      wcpOAV9Inc_diainicio = GXutil.nullDate() ;
      wcpOAV8Inc_diaFin = GXutil.nullDate() ;
      wcpOAV10Inc_prog = "" ;
      wcpOAV6Inc_barpar = "" ;
      Gridsdtincidenciasspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV11Emprcod = "" ;
      AV9Inc_diainicio = GXutil.nullDate() ;
      AV8Inc_diaFin = GXutil.nullDate() ;
      AV10Inc_prog = "" ;
      AV6Inc_barpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV12SDTIncidenciass = new GXBaseCollection<app.SdtSDTIncidencias>(app.SdtSDTIncidencias.class, "SDTIncidencias", "TexplusNET", remoteHandle);
      Gridsdtincidenciass_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridsdtincidenciassContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtincidenciasspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGridsdtincidenciass_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV31Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV32Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV33Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_objcol_SdtSDTIncidencias5 = new GXBaseCollection<app.SdtSDTIncidencias>(app.SdtSDTIncidencias.class, "SDTIncidencias", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTIncidencias6 = new GXBaseCollection[1] ;
      GridsdtincidenciassRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV11Emprcod = "" ;
      sCtrlAV9Inc_diainicio = "" ;
      sCtrlAV8Inc_diaFin = "" ;
      sCtrlAV10Inc_prog = "" ;
      sCtrlAV5Inc_Barcod = "" ;
      sCtrlAV7Inc_Barreo = "" ;
      sCtrlAV6Inc_barpar = "" ;
      subGridsdtincidenciass_Linesclass = "" ;
      ROClassString = "" ;
      GridsdtincidenciassColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdtincidenciass__inc_dia_Enabled = 0 ;
      edtavSdtincidenciass__inc_linea_Enabled = 0 ;
      edtavSdtincidenciass__inc_hora_Enabled = 0 ;
      edtavSdtincidenciass__inc_usuario_Enabled = 0 ;
      edtavSdtincidenciass__inc_terminal_Enabled = 0 ;
      edtavSdtincidenciass__inc_prog_Enabled = 0 ;
      edtavSdtincidenciass__inc_obstxt_Enabled = 0 ;
      edtavSdtincidenciass__inc_barcod_Enabled = 0 ;
      edtavSdtincidenciass__inc_barreo_Enabled = 0 ;
      edtavSdtincidenciass__inc_barpar_Enabled = 0 ;
      edtavSdtincidenciass__inc_hdr_Enabled = 0 ;
   }

   private byte wcpOAV7Inc_Barreo ;
   private byte GRIDSDTINCIDENCIASS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7Inc_Barreo ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridsdtincidenciass_Backcolorstyle ;
   private byte subGridsdtincidenciass_Backstyle ;
   private byte subGridsdtincidenciass_Titlebackstyle ;
   private byte subGridsdtincidenciass_Allowselection ;
   private byte subGridsdtincidenciass_Allowhovering ;
   private byte subGridsdtincidenciass_Allowcollapsing ;
   private byte subGridsdtincidenciass_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV5Inc_Barcod ;
   private int Gridsdtincidenciasspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_15 ;
   private int AV5Inc_Barcod ;
   private int subGridsdtincidenciass_Rows ;
   private int nGXsfl_15_idx=1 ;
   private int Gridsdtincidenciasspaginationbar_Pagestoshow ;
   private int AV19GXV1 ;
   private int subGridsdtincidenciass_Islastpage ;
   private int edtavSdtincidenciass__inc_dia_Enabled ;
   private int edtavSdtincidenciass__inc_linea_Enabled ;
   private int edtavSdtincidenciass__inc_hora_Enabled ;
   private int edtavSdtincidenciass__inc_usuario_Enabled ;
   private int edtavSdtincidenciass__inc_terminal_Enabled ;
   private int edtavSdtincidenciass__inc_prog_Enabled ;
   private int edtavSdtincidenciass__inc_obstxt_Enabled ;
   private int edtavSdtincidenciass__inc_barcod_Enabled ;
   private int edtavSdtincidenciass__inc_barreo_Enabled ;
   private int edtavSdtincidenciass__inc_barpar_Enabled ;
   private int edtavSdtincidenciass__inc_hdr_Enabled ;
   private int GRIDSDTINCIDENCIASS_nGridOutOfScope ;
   private int nGXsfl_15_fel_idx=1 ;
   private int AV14PageToGo ;
   private int idxLst ;
   private int subGridsdtincidenciass_Backcolor ;
   private int subGridsdtincidenciass_Allbackcolor ;
   private int subGridsdtincidenciass_Titlebackcolor ;
   private int subGridsdtincidenciass_Selectedindex ;
   private int subGridsdtincidenciass_Selectioncolor ;
   private int subGridsdtincidenciass_Hoveringcolor ;
   private long GRIDSDTINCIDENCIASS_nFirstRecordOnPage ;
   private long AV15GridSDTIncidenciassCurrentPage ;
   private long AV16GridSDTIncidenciassPageCount ;
   private long GRIDSDTINCIDENCIASS_nCurrentRecord ;
   private long GRIDSDTINCIDENCIASS_nRecordCount ;
   private String wcpOAV11Emprcod ;
   private String wcpOAV10Inc_prog ;
   private String wcpOAV6Inc_barpar ;
   private String Gridsdtincidenciasspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV11Emprcod ;
   private String AV10Inc_prog ;
   private String AV6Inc_barpar ;
   private String sGXsfl_15_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridsdtincidenciasspaginationbar_Class ;
   private String Gridsdtincidenciasspaginationbar_Pagingbuttonsposition ;
   private String Gridsdtincidenciasspaginationbar_Pagingcaptionposition ;
   private String Gridsdtincidenciasspaginationbar_Emptygridclass ;
   private String Gridsdtincidenciasspaginationbar_Rowsperpageoptions ;
   private String Gridsdtincidenciasspaginationbar_Previous ;
   private String Gridsdtincidenciasspaginationbar_Next ;
   private String Gridsdtincidenciasspaginationbar_Caption ;
   private String Gridsdtincidenciasspaginationbar_Emptygridcaption ;
   private String Gridsdtincidenciasspaginationbar_Rowsperpagecaption ;
   private String Gridsdtincidenciass_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridsdtincidenciasstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdtincidenciass_Internalname ;
   private String Gridsdtincidenciasspaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsdtincidenciass_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtincidenciass__inc_dia_Internalname ;
   private String edtavSdtincidenciass__inc_linea_Internalname ;
   private String edtavSdtincidenciass__inc_hora_Internalname ;
   private String edtavSdtincidenciass__inc_usuario_Internalname ;
   private String edtavSdtincidenciass__inc_terminal_Internalname ;
   private String edtavSdtincidenciass__inc_prog_Internalname ;
   private String edtavSdtincidenciass__inc_obstxt_Internalname ;
   private String edtavSdtincidenciass__inc_barcod_Internalname ;
   private String edtavSdtincidenciass__inc_barreo_Internalname ;
   private String edtavSdtincidenciass__inc_barpar_Internalname ;
   private String edtavSdtincidenciass__inc_hdr_Internalname ;
   private String sGXsfl_15_fel_idx="0001" ;
   private String AV31Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV32Emprnom ;
   private String GXv_char3[] ;
   private String AV33Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV11Emprcod ;
   private String sCtrlAV9Inc_diainicio ;
   private String sCtrlAV8Inc_diaFin ;
   private String sCtrlAV10Inc_prog ;
   private String sCtrlAV5Inc_Barcod ;
   private String sCtrlAV7Inc_Barreo ;
   private String sCtrlAV6Inc_barpar ;
   private String subGridsdtincidenciass_Class ;
   private String subGridsdtincidenciass_Linesclass ;
   private String ROClassString ;
   private String edtavSdtincidenciass__inc_dia_Jsonclick ;
   private String edtavSdtincidenciass__inc_linea_Jsonclick ;
   private String edtavSdtincidenciass__inc_hora_Jsonclick ;
   private String edtavSdtincidenciass__inc_usuario_Jsonclick ;
   private String edtavSdtincidenciass__inc_terminal_Jsonclick ;
   private String edtavSdtincidenciass__inc_prog_Jsonclick ;
   private String edtavSdtincidenciass__inc_obstxt_Jsonclick ;
   private String edtavSdtincidenciass__inc_barcod_Jsonclick ;
   private String edtavSdtincidenciass__inc_barreo_Jsonclick ;
   private String edtavSdtincidenciass__inc_barpar_Jsonclick ;
   private String edtavSdtincidenciass__inc_hdr_Jsonclick ;
   private String subGridsdtincidenciass_Header ;
   private java.util.Date wcpOAV9Inc_diainicio ;
   private java.util.Date wcpOAV8Inc_diaFin ;
   private java.util.Date AV9Inc_diainicio ;
   private java.util.Date AV8Inc_diaFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gridsdtincidenciasspaginationbar_Showfirst ;
   private boolean Gridsdtincidenciasspaginationbar_Showprevious ;
   private boolean Gridsdtincidenciasspaginationbar_Shownext ;
   private boolean Gridsdtincidenciasspaginationbar_Showlast ;
   private boolean Gridsdtincidenciasspaginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_15_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV15 ;
   private com.genexus.webpanels.GXWebGrid GridsdtincidenciassContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtincidenciassRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtincidenciassColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridsdtincidenciasspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridsdtincidenciass_empowerer ;
   private GXBaseCollection<app.SdtSDTIncidencias> AV12SDTIncidenciass ;
   private GXBaseCollection<app.SdtSDTIncidencias> GXt_objcol_SdtSDTIncidencias5 ;
   private GXBaseCollection<app.SdtSDTIncidencias> GXv_objcol_SdtSDTIncidencias6[] ;
}

