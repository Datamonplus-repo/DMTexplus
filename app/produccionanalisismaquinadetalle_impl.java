package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class produccionanalisismaquinadetalle_impl extends GXWebComponent
{
   public produccionanalisismaquinadetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public produccionanalisismaquinadetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produccionanalisismaquinadetalle_impl.class ));
   }

   public produccionanalisismaquinadetalle_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "MaqCodIni") ;
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
               AV7MaqCodIni = httpContext.GetPar( "MaqCodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
               AV8MaqCodFin = httpContext.GetPar( "MaqCodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
               AV9HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV10HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7MaqCodIni,AV8MaqCodFin,AV9HisProDTI,AV10HisProDTF});
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
               gxfirstwebparm = httpContext.GetFirstPar( "MaqCodIni") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "MaqCodIni") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtproduccionmaquinadetalles") == 0 )
            {
               gxnrgridsdtproduccionmaquinadetalles_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtproduccionmaquinadetalles") == 0 )
            {
               gxgrgridsdtproduccionmaquinadetalles_refresh_invoke( ) ;
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

   public void gxnrgridsdtproduccionmaquinadetalles_newrow_invoke( )
   {
      nRC_GXsfl_18 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_18"))) ;
      nGXsfl_18_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_18_idx"))) ;
      sGXsfl_18_idx = httpContext.GetPar( "sGXsfl_18_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtproduccionmaquinadetalles_newrow( ) ;
      /* End function gxnrGridsdtproduccionmaquinadetalles_newrow_invoke */
   }

   public void gxgrgridsdtproduccionmaquinadetalles_refresh_invoke( )
   {
      subGridsdtproduccionmaquinadetalles_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtproduccionmaquinadetalles_Rows"))) ;
      AV7MaqCodIni = httpContext.GetPar( "MaqCodIni") ;
      AV8MaqCodFin = httpContext.GetPar( "MaqCodFin") ;
      AV9HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
      AV10HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtproduccionmaquinadetalles_refresh( subGridsdtproduccionmaquinadetalles_Rows, AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtproduccionmaquinadetalles_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paD32( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Produccion Analisis Maquina Detalle", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccionanalisismaquinadetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7MaqCodIni)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV9HisProDTI)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV10HisProDTF))}, new String[] {"MaqCodIni","MaqCodFin","HisProDTI","HisProDTF"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtproduccionmaquinadetalles", AV15sdtProduccionMaquinaDetalles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtproduccionmaquinadetalles", AV15sdtProduccionMaquinaDetalles);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_18", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_18, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTPRODUCCIONMAQUINADETALLESCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV18GridsdtProduccionMaquinaDetallesCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTPRODUCCIONMAQUINADETALLESPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV19GridsdtProduccionMaquinaDetallesPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7MaqCodIni", GXutil.rtrim( wcpOAV7MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqCodFin", GXutil.rtrim( wcpOAV8MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HisProDTI", localUtil.ttoc( wcpOAV9HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10HisProDTF", localUtil.ttoc( wcpOAV10HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV7MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV8MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV9HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV10HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTPRODUCCIONMAQUINADETALLES", AV15sdtProduccionMaquinaDetalles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTPRODUCCIONMAQUINADETALLES", AV15sdtProduccionMaquinaDetalles);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtproduccionmaquinadetallespaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtproduccionmaquinadetallespaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtproduccionmaquinadetallespaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtproduccionmaquinadetallespaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtproduccionmaquinadetallespaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtproduccionmaquinadetalles_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormD32( )
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
      return "ProduccionAnalisisMaquinaDetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Produccion Analisis Maquina Detalle", "") ;
   }

   public void wbD30( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccionanalisismaquinadetalle");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdtproduccionmaquinadetallestablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtproduccionmaquinadetallesContainer.SetWrapped(nGXWrapped);
         startgridcontrol18( ) ;
      }
      if ( wbEnd == 18 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_18 = (int)(nGXsfl_18_idx-1) ;
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV23GXV1 = nGXsfl_18_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridsdtproduccionmaquinadetallesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtproduccionmaquinadetalles", GridsdtproduccionmaquinadetallesContainer, subGridsdtproduccionmaquinadetalles_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtproduccionmaquinadetallesContainerData", GridsdtproduccionmaquinadetallesContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtproduccionmaquinadetallesContainerData"+"V", GridsdtproduccionmaquinadetallesContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtproduccionmaquinadetallesContainerData"+"V"+"\" value='"+GridsdtproduccionmaquinadetallesContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("Class", Gridsdtproduccionmaquinadetallespaginationbar_Class);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("ShowFirst", Gridsdtproduccionmaquinadetallespaginationbar_Showfirst);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("ShowPrevious", Gridsdtproduccionmaquinadetallespaginationbar_Showprevious);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("ShowNext", Gridsdtproduccionmaquinadetallespaginationbar_Shownext);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("ShowLast", Gridsdtproduccionmaquinadetallespaginationbar_Showlast);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("PagesToShow", Gridsdtproduccionmaquinadetallespaginationbar_Pagestoshow);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("PagingButtonsPosition", Gridsdtproduccionmaquinadetallespaginationbar_Pagingbuttonsposition);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("PagingCaptionPosition", Gridsdtproduccionmaquinadetallespaginationbar_Pagingcaptionposition);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("EmptyGridClass", Gridsdtproduccionmaquinadetallespaginationbar_Emptygridclass);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("RowsPerPageSelector", Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselector);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("RowsPerPageOptions", Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageoptions);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("Previous", Gridsdtproduccionmaquinadetallespaginationbar_Previous);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("Next", Gridsdtproduccionmaquinadetallespaginationbar_Next);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("Caption", Gridsdtproduccionmaquinadetallespaginationbar_Caption);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("EmptyGridCaption", Gridsdtproduccionmaquinadetallespaginationbar_Emptygridcaption);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("RowsPerPageCaption", Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpagecaption);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("CurrentPage", AV18GridsdtProduccionMaquinaDetallesCurrentPage);
         ucGridsdtproduccionmaquinadetallespaginationbar.setProperty("PageCount", AV19GridsdtProduccionMaquinaDetallesPageCount);
         ucGridsdtproduccionmaquinadetallespaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtproduccionmaquinadetallespaginationbar_Internalname, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtproduccionmaquinadetalles_empowerer.render(context, "wwp.gridempowerer", Gridsdtproduccionmaquinadetalles_empowerer_Internalname, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 18 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV23GXV1 = nGXsfl_18_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridsdtproduccionmaquinadetallesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtproduccionmaquinadetalles", GridsdtproduccionmaquinadetallesContainer, subGridsdtproduccionmaquinadetalles_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtproduccionmaquinadetallesContainerData", GridsdtproduccionmaquinadetallesContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtproduccionmaquinadetallesContainerData"+"V", GridsdtproduccionmaquinadetallesContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtproduccionmaquinadetallesContainerData"+"V"+"\" value='"+GridsdtproduccionmaquinadetallesContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startD32( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Produccion Analisis Maquina Detalle", ""), (short)(0)) ;
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
            strupD30( ) ;
         }
      }
   }

   public void wsD32( )
   {
      startD32( ) ;
      evtD32( ) ;
   }

   public void evtD32( )
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
                              strupD30( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD30( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 37), "GRIDSDTPRODUCCIONMAQUINADETALLES.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD30( ) ;
                           }
                           nGXsfl_18_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_182( ) ;
                           AV23GXV1 = (int)(nGXsfl_18_idx+GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage) ;
                           if ( ( AV15sdtProduccionMaquinaDetalles.size() >= AV23GXV1 ) && ( AV23GXV1 > 0 ) )
                           {
                              AV15sdtProduccionMaquinaDetalles.currentItem( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)) );
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
                                       e13D32 ();
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
                                       e14D32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTPRODUCCIONMAQUINADETALLES.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e15D32 ();
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
                                    strupD30( ) ;
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

   public void weD32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormD32( ) ;
         }
      }
   }

   public void paD32( )
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

   public void gxnrgridsdtproduccionmaquinadetalles_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_182( ) ;
      while ( nGXsfl_18_idx <= nRC_GXsfl_18 )
      {
         sendrow_182( ) ;
         nGXsfl_18_idx = ((subGridsdtproduccionmaquinadetalles_Islastpage==1)&&(nGXsfl_18_idx+1>subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtproduccionmaquinadetallesContainer)) ;
      /* End function gxnrGridsdtproduccionmaquinadetalles_newrow */
   }

   public void gxgrgridsdtproduccionmaquinadetalles_refresh( int subGridsdtproduccionmaquinadetalles_Rows ,
                                                             String AV7MaqCodIni ,
                                                             String AV8MaqCodFin ,
                                                             java.util.Date AV9HisProDTI ,
                                                             java.util.Date AV10HisProDTF ,
                                                             String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14D32 ();
      GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord = 0 ;
      rfD32( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtproduccionmaquinadetalles_refresh */
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
      rfD32( ) ;
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
      edtavSdtproduccionmaquinadetalles__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__maqcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__maqdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__barhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__barhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__barhdr_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__hisprodti_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__kilos_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__metros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__metros_Enabled), 5, 0), !bGXsfl_18_Refreshing);
   }

   public void rfD32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtproduccionmaquinadetallesContainer.ClearRows();
      }
      wbStart = (short)(18) ;
      /* Execute user event: Refresh */
      e14D32 ();
      nGXsfl_18_idx = 1 ;
      sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_182( ) ;
      bGXsfl_18_Refreshing = true ;
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("GridName", "Gridsdtproduccionmaquinadetalles");
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("CmpContext", sPrefix);
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtproduccionmaquinadetallesContainer.setPageSize( subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_182( ) ;
         e15D32 ();
         if ( ( GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord > 0 ) && ( GRIDSDTPRODUCCIONMAQUINADETALLES_nGridOutOfScope == 0 ) && ( nGXsfl_18_idx == 1 ) )
         {
            GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord = 0 ;
            GRIDSDTPRODUCCIONMAQUINADETALLES_nGridOutOfScope = 1 ;
            subgridsdtproduccionmaquinadetalles_firstpage( ) ;
            e15D32 ();
         }
         wbEnd = (short)(18) ;
         wbD30( ) ;
      }
      bGXsfl_18_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesD32( )
   {
   }

   public int subgridsdtproduccionmaquinadetalles_fnc_pagecount( )
   {
      GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount = subgridsdtproduccionmaquinadetalles_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount) % (subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount/ (double) (subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount/ (double) (subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtproduccionmaquinadetalles_fnc_recordcount( )
   {
      return AV15sdtProduccionMaquinaDetalles.size() ;
   }

   public int subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )
   {
      if ( subGridsdtproduccionmaquinadetalles_Rows > 0 )
      {
         return subGridsdtproduccionmaquinadetalles_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtproduccionmaquinadetalles_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage/ (double) (subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtproduccionmaquinadetalles_firstpage( )
   {
      GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtproduccionmaquinadetalles_refresh( subGridsdtproduccionmaquinadetalles_Rows, AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtproduccionmaquinadetalles_nextpage( )
   {
      GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount = subgridsdtproduccionmaquinadetalles_fnc_recordcount( ) ;
      if ( ( GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount >= subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( ) ) && ( GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF == 0 ) )
      {
         GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = (long)(GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage+subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage", GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtproduccionmaquinadetalles_refresh( subGridsdtproduccionmaquinadetalles_Rows, AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtproduccionmaquinadetalles_previouspage( )
   {
      if ( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage >= subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( ) )
      {
         GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = (long)(GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage-subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtproduccionmaquinadetalles_refresh( subGridsdtproduccionmaquinadetalles_Rows, AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtproduccionmaquinadetalles_lastpage( )
   {
      GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount = subgridsdtproduccionmaquinadetalles_fnc_recordcount( ) ;
      if ( GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount > subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount) % (subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = (long)(GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount-subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = (long)(GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount-((int)((GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount) % (subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtproduccionmaquinadetalles_refresh( subGridsdtproduccionmaquinadetalles_Rows, AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtproduccionmaquinadetalles_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = (long)(subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtproduccionmaquinadetalles_refresh( subGridsdtproduccionmaquinadetalles_Rows, AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSdtproduccionmaquinadetalles__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__maqcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__maqdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__barhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__barhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__barhdr_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__hisprodti_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__kilos_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtproduccionmaquinadetalles__metros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionmaquinadetalles__metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionmaquinadetalles__metros_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupD30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13D32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtproduccionmaquinadetalles"), AV15sdtProduccionMaquinaDetalles);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTPRODUCCIONMAQUINADETALLES"), AV15sdtProduccionMaquinaDetalles);
         /* Read saved values. */
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18GridsdtProduccionMaquinaDetallesCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTPRODUCCIONMAQUINADETALLESCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV19GridsdtProduccionMaquinaDetallesPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTPRODUCCIONMAQUINADETALLESPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodIni") ;
         wcpOAV8MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFin") ;
         wcpOAV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV9HisProDTI"), 0) ;
         wcpOAV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV10HisProDTF"), 0) ;
         GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtproduccionmaquinadetalles_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridsdtproduccionmaquinadetallespaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Class") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Showfirst")) ;
         Gridsdtproduccionmaquinadetallespaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Showprevious")) ;
         Gridsdtproduccionmaquinadetallespaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Shownext")) ;
         Gridsdtproduccionmaquinadetallespaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Showlast")) ;
         Gridsdtproduccionmaquinadetallespaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtproduccionmaquinadetallespaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Emptygridclass") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Previous") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Next") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Caption") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpagecaption") ;
         Gridsdtproduccionmaquinadetalles_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_EMPOWERER_Gridinternalname") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Selectedpage") ;
         Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_18_fel_idx = 0 ;
         while ( nGXsfl_18_fel_idx < nRC_GXsfl_18 )
         {
            nGXsfl_18_fel_idx = ((subGridsdtproduccionmaquinadetalles_Islastpage==1)&&(nGXsfl_18_fel_idx+1>subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )) ? 1 : nGXsfl_18_fel_idx+1) ;
            sGXsfl_18_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_182( ) ;
            AV23GXV1 = (int)(nGXsfl_18_fel_idx+GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage) ;
            if ( ( AV15sdtProduccionMaquinaDetalles.size() >= AV23GXV1 ) && ( AV23GXV1 > 0 ) )
            {
               AV15sdtProduccionMaquinaDetalles.currentItem( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)) );
            }
         }
         if ( nGXsfl_18_fel_idx == 0 )
         {
            nGXsfl_18_idx = 1 ;
            sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_182( ) ;
         }
         nGXsfl_18_fel_idx = 1 ;
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
      e13D32 ();
      if (returnInSub) return;
   }

   public void e13D32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      produccionanalisismaquinadetalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      GXv_char2[0] = AV32Emprcod ;
      GXv_char3[0] = AV33Emprnom ;
      GXv_char4[0] = AV34Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      produccionanalisismaquinadetalle_impl.this.AV32Emprcod = GXv_char2[0] ;
      produccionanalisismaquinadetalle_impl.this.AV33Emprnom = GXv_char3[0] ;
      produccionanalisismaquinadetalle_impl.this.AV34Usurcod = GXv_char4[0] ;
      Gridsdtproduccionmaquinadetalles_empowerer_Gridinternalname = subGridsdtproduccionmaquinadetalles_Internalname ;
      ucGridsdtproduccionmaquinadetalles_empowerer.sendProperty(context, sPrefix, false, Gridsdtproduccionmaquinadetalles_empowerer_Internalname, "GridInternalName", Gridsdtproduccionmaquinadetalles_empowerer_Gridinternalname);
      subGridsdtproduccionmaquinadetalles_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue = subGridsdtproduccionmaquinadetalles_Rows ;
      ucGridsdtproduccionmaquinadetallespaginationbar.sendProperty(context, sPrefix, false, Gridsdtproduccionmaquinadetallespaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e14D32( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtsdtProduccionMaquinaDetalle5 = AV15sdtProduccionMaquinaDetalles ;
      GXv_objcol_SdtsdtProduccionMaquinaDetalle6[0] = GXt_objcol_SdtsdtProduccionMaquinaDetalle5 ;
      new app.dpproduccionmaquinadetalle(remoteHandle, context).execute( AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, GXv_objcol_SdtsdtProduccionMaquinaDetalle6) ;
      GXt_objcol_SdtsdtProduccionMaquinaDetalle5 = GXv_objcol_SdtsdtProduccionMaquinaDetalle6[0] ;
      AV15sdtProduccionMaquinaDetalles = GXt_objcol_SdtsdtProduccionMaquinaDetalle5 ;
      gx_BV18 = true ;
      AV18GridsdtProduccionMaquinaDetallesCurrentPage = subgridsdtproduccionmaquinadetalles_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18GridsdtProduccionMaquinaDetallesCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridsdtProduccionMaquinaDetallesCurrentPage), 10, 0));
      AV19GridsdtProduccionMaquinaDetallesPageCount = subgridsdtproduccionmaquinadetalles_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridsdtProduccionMaquinaDetallesPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridsdtProduccionMaquinaDetallesPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15sdtProduccionMaquinaDetalles", AV15sdtProduccionMaquinaDetalles);
   }

   private void e15D32( )
   {
      /* Gridsdtproduccionmaquinadetalles_Load Routine */
      returnInSub = false ;
      AV23GXV1 = 1 ;
      while ( AV23GXV1 <= AV15sdtProduccionMaquinaDetalles.size() )
      {
         AV15sdtProduccionMaquinaDetalles.currentItem( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(18) ;
         }
         if ( ( subGridsdtproduccionmaquinadetalles_Islastpage == 1 ) || ( subGridsdtproduccionmaquinadetalles_Rows == 0 ) || ( ( GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord >= GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage ) && ( GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord < GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage + subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( ) ) ) )
         {
            sendrow_182( ) ;
            GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord + 1 >= subgridsdtproduccionmaquinadetalles_fnc_recordcount( ) )
            {
               GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord = (long)(GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_18_Refreshing )
         {
            httpContext.doAjaxLoad(18, GridsdtproduccionmaquinadetallesRow);
         }
         AV23GXV1 = (int)(AV23GXV1+1) ;
      }
   }

   public void e11D32( )
   {
      /* Gridsdtproduccionmaquinadetallespaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtproduccionmaquinadetalles_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage, "Next") == 0 )
      {
         AV17PageToGo = subgridsdtproduccionmaquinadetalles_fnc_currentpage( ) ;
         AV17PageToGo = (int)(AV17PageToGo+1) ;
         subgridsdtproduccionmaquinadetalles_gotopage( AV17PageToGo) ;
      }
      else
      {
         AV17PageToGo = (int)(GXutil.lval( Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage)) ;
         subgridsdtproduccionmaquinadetalles_gotopage( AV17PageToGo) ;
      }
   }

   public void e12D32( )
   {
      /* Gridsdtproduccionmaquinadetallespaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtproduccionmaquinadetalles_Rows = Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtproduccionmaquinadetalles_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7MaqCodIni = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
      AV8MaqCodFin = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
      AV9HisProDTI = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV10HisProDTF = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      paD32( ) ;
      wsD32( ) ;
      weD32( ) ;
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
      sCtrlAV7MaqCodIni = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8MaqCodFin = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9HisProDTI = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10HisProDTF = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paD32( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccionanalisismaquinadetalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paD32( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7MaqCodIni = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
         AV8MaqCodFin = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
         AV9HisProDTI = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV10HisProDTF = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV7MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodIni") ;
      wcpOAV8MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFin") ;
      wcpOAV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV9HisProDTI"), 0) ;
      wcpOAV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV10HisProDTF"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7MaqCodIni, wcpOAV7MaqCodIni) != 0 ) || ( GXutil.strcmp(AV8MaqCodFin, wcpOAV8MaqCodFin) != 0 ) || !( GXutil.dateCompare(AV9HisProDTI, wcpOAV9HisProDTI) ) || !( GXutil.dateCompare(AV10HisProDTF, wcpOAV10HisProDTF) ) ) )
      {
         setjustcreated();
      }
      wcpOAV7MaqCodIni = AV7MaqCodIni ;
      wcpOAV8MaqCodFin = AV8MaqCodFin ;
      wcpOAV9HisProDTI = AV9HisProDTI ;
      wcpOAV10HisProDTF = AV10HisProDTF ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7MaqCodIni = httpContext.cgiGet( sPrefix+"AV7MaqCodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV7MaqCodIni) > 0 )
      {
         AV7MaqCodIni = httpContext.cgiGet( sCtrlAV7MaqCodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
      }
      else
      {
         AV7MaqCodIni = httpContext.cgiGet( sPrefix+"AV7MaqCodIni_PARM") ;
      }
      sCtrlAV8MaqCodFin = httpContext.cgiGet( sPrefix+"AV8MaqCodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqCodFin) > 0 )
      {
         AV8MaqCodFin = httpContext.cgiGet( sCtrlAV8MaqCodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
      }
      else
      {
         AV8MaqCodFin = httpContext.cgiGet( sPrefix+"AV8MaqCodFin_PARM") ;
      }
      sCtrlAV9HisProDTI = httpContext.cgiGet( sPrefix+"AV9HisProDTI_CTRL") ;
      if ( GXutil.len( sCtrlAV9HisProDTI) > 0 )
      {
         AV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sCtrlAV9HisProDTI), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV9HisProDTI_PARM"), 0) ;
      }
      sCtrlAV10HisProDTF = httpContext.cgiGet( sPrefix+"AV10HisProDTF_CTRL") ;
      if ( GXutil.len( sCtrlAV10HisProDTF) > 0 )
      {
         AV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sCtrlAV10HisProDTF), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV10HisProDTF_PARM"), 0) ;
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
      paD32( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsD32( ) ;
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
      wsD32( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodIni_PARM", GXutil.rtrim( AV7MaqCodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7MaqCodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodIni_CTRL", GXutil.rtrim( sCtrlAV7MaqCodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFin_PARM", GXutil.rtrim( AV8MaqCodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqCodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFin_CTRL", GXutil.rtrim( sCtrlAV8MaqCodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProDTI_PARM", localUtil.ttoc( AV9HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HisProDTI)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProDTI_CTRL", GXutil.rtrim( sCtrlAV9HisProDTI));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HisProDTF_PARM", localUtil.ttoc( AV10HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10HisProDTF)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HisProDTF_CTRL", GXutil.rtrim( sCtrlAV10HisProDTF));
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
      weD32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564918", true, true);
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
         httpContext.AddJavascriptSource("produccionanalisismaquinadetalle.js", "?202661015564918", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_182( )
   {
      edtavSdtproduccionmaquinadetalles__maqcod_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__MAQCOD_"+sGXsfl_18_idx ;
      edtavSdtproduccionmaquinadetalles__maqdsc_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__MAQDSC_"+sGXsfl_18_idx ;
      edtavSdtproduccionmaquinadetalles__barhdr_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__BARHDR_"+sGXsfl_18_idx ;
      edtavSdtproduccionmaquinadetalles__hisprodti_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__HISPRODTI_"+sGXsfl_18_idx ;
      edtavSdtproduccionmaquinadetalles__hisprodtf_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__HISPRODTF_"+sGXsfl_18_idx ;
      edtavSdtproduccionmaquinadetalles__kilos_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__KILOS_"+sGXsfl_18_idx ;
      edtavSdtproduccionmaquinadetalles__metros_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__METROS_"+sGXsfl_18_idx ;
   }

   public void subsflControlProps_fel_182( )
   {
      edtavSdtproduccionmaquinadetalles__maqcod_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__MAQCOD_"+sGXsfl_18_fel_idx ;
      edtavSdtproduccionmaquinadetalles__maqdsc_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__MAQDSC_"+sGXsfl_18_fel_idx ;
      edtavSdtproduccionmaquinadetalles__barhdr_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__BARHDR_"+sGXsfl_18_fel_idx ;
      edtavSdtproduccionmaquinadetalles__hisprodti_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__HISPRODTI_"+sGXsfl_18_fel_idx ;
      edtavSdtproduccionmaquinadetalles__hisprodtf_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__HISPRODTF_"+sGXsfl_18_fel_idx ;
      edtavSdtproduccionmaquinadetalles__kilos_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__KILOS_"+sGXsfl_18_fel_idx ;
      edtavSdtproduccionmaquinadetalles__metros_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__METROS_"+sGXsfl_18_fel_idx ;
   }

   public void sendrow_182( )
   {
      subsflControlProps_182( ) ;
      wbD30( ) ;
      if ( ( subGridsdtproduccionmaquinadetalles_Rows * 1 == 0 ) || ( nGXsfl_18_idx <= subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtproduccionmaquinadetallesRow = GXWebRow.GetNew(context,GridsdtproduccionmaquinadetallesContainer) ;
         if ( subGridsdtproduccionmaquinadetalles_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtproduccionmaquinadetalles_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtproduccionmaquinadetalles_Class, "") != 0 )
            {
               subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"Odd" ;
            }
         }
         else if ( subGridsdtproduccionmaquinadetalles_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtproduccionmaquinadetalles_Backstyle = (byte)(0) ;
            subGridsdtproduccionmaquinadetalles_Backcolor = subGridsdtproduccionmaquinadetalles_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtproduccionmaquinadetalles_Class, "") != 0 )
            {
               subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtproduccionmaquinadetalles_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtproduccionmaquinadetalles_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtproduccionmaquinadetalles_Class, "") != 0 )
            {
               subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"Odd" ;
            }
            subGridsdtproduccionmaquinadetalles_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtproduccionmaquinadetalles_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtproduccionmaquinadetalles_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_18_idx) % (2))) == 0 )
            {
               subGridsdtproduccionmaquinadetalles_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtproduccionmaquinadetalles_Class, "") != 0 )
               {
                  subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtproduccionmaquinadetalles_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtproduccionmaquinadetalles_Class, "") != 0 )
               {
                  subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_18_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtproduccionmaquinadetallesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionmaquinadetalles__maqcod_Internalname,GXutil.rtrim( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionmaquinadetalles__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionmaquinadetalles__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtproduccionmaquinadetallesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionmaquinadetalles__maqdsc_Internalname,GXutil.rtrim( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionmaquinadetalles__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionmaquinadetalles__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtproduccionmaquinadetallesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionmaquinadetalles__barhdr_Internalname,GXutil.rtrim( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Barhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionmaquinadetalles__barhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionmaquinadetalles__barhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtproduccionmaquinadetallesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionmaquinadetalles__hisprodti_Internalname,localUtil.ttoc( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionmaquinadetalles__hisprodti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionmaquinadetalles__hisprodti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtproduccionmaquinadetallesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionmaquinadetalles__hisprodtf_Internalname,localUtil.ttoc( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionmaquinadetalles__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtproduccionmaquinadetallesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionmaquinadetalles__kilos_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Kilos(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtproduccionmaquinadetalles__kilos_Enabled!=0) ? localUtil.format( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Kilos(), "ZZZZZ9.99") : localUtil.format( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Kilos(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionmaquinadetalles__kilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionmaquinadetalles__kilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtproduccionmaquinadetallesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionmaquinadetalles__metros_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Metros(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtproduccionmaquinadetalles__metros_Enabled!=0) ? localUtil.format( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Metros(), "ZZZZZ9.99") : localUtil.format( ((app.SdtsdtProduccionMaquinaDetalle)AV15sdtProduccionMaquinaDetalles.elementAt(-1+AV23GXV1)).getgxTv_SdtsdtProduccionMaquinaDetalle_Metros(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionmaquinadetalles__metros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionmaquinadetalles__metros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesD32( ) ;
         GridsdtproduccionmaquinadetallesContainer.AddRow(GridsdtproduccionmaquinadetallesRow);
         nGXsfl_18_idx = ((subGridsdtproduccionmaquinadetalles_Islastpage==1)&&(nGXsfl_18_idx+1>subgridsdtproduccionmaquinadetalles_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      /* End function sendrow_182 */
   }

   public void startgridcontrol18( )
   {
      if ( GridsdtproduccionmaquinadetallesContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridsdtproduccionmaquinadetallesContainer"+"DivS\" data-gxgridid=\"18\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtproduccionmaquinadetalles_Internalname, subGridsdtproduccionmaquinadetalles_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtproduccionmaquinadetalles_Backcolorstyle == 0 )
         {
            subGridsdtproduccionmaquinadetalles_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtproduccionmaquinadetalles_Class) > 0 )
            {
               subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtproduccionmaquinadetalles_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtproduccionmaquinadetalles_Backcolorstyle == 1 )
            {
               subGridsdtproduccionmaquinadetalles_Titlebackcolor = subGridsdtproduccionmaquinadetalles_Allbackcolor ;
               if ( GXutil.len( subGridsdtproduccionmaquinadetalles_Class) > 0 )
               {
                  subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtproduccionmaquinadetalles_Class) > 0 )
               {
                  subGridsdtproduccionmaquinadetalles_Linesclass = subGridsdtproduccionmaquinadetalles_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("GridName", "Gridsdtproduccionmaquinadetalles");
      }
      else
      {
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("GridName", "Gridsdtproduccionmaquinadetalles");
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Header", subGridsdtproduccionmaquinadetalles_Header);
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("CmpContext", sPrefix);
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtproduccionmaquinadetallesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtproduccionmaquinadetallesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionmaquinadetalles__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddColumnProperties(GridsdtproduccionmaquinadetallesColumn);
         GridsdtproduccionmaquinadetallesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtproduccionmaquinadetallesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionmaquinadetalles__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddColumnProperties(GridsdtproduccionmaquinadetallesColumn);
         GridsdtproduccionmaquinadetallesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtproduccionmaquinadetallesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionmaquinadetalles__barhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddColumnProperties(GridsdtproduccionmaquinadetallesColumn);
         GridsdtproduccionmaquinadetallesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtproduccionmaquinadetallesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionmaquinadetalles__hisprodti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddColumnProperties(GridsdtproduccionmaquinadetallesColumn);
         GridsdtproduccionmaquinadetallesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtproduccionmaquinadetallesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddColumnProperties(GridsdtproduccionmaquinadetallesColumn);
         GridsdtproduccionmaquinadetallesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtproduccionmaquinadetallesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionmaquinadetalles__kilos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddColumnProperties(GridsdtproduccionmaquinadetallesColumn);
         GridsdtproduccionmaquinadetallesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtproduccionmaquinadetallesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionmaquinadetalles__metros_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddColumnProperties(GridsdtproduccionmaquinadetallesColumn);
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtproduccionmaquinadetallesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtproduccionmaquinadetalles_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavSdtproduccionmaquinadetalles__maqcod_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__MAQCOD" ;
      edtavSdtproduccionmaquinadetalles__maqdsc_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__MAQDSC" ;
      edtavSdtproduccionmaquinadetalles__barhdr_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__BARHDR" ;
      edtavSdtproduccionmaquinadetalles__hisprodti_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__HISPRODTI" ;
      edtavSdtproduccionmaquinadetalles__hisprodtf_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__HISPRODTF" ;
      edtavSdtproduccionmaquinadetalles__kilos_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__KILOS" ;
      edtavSdtproduccionmaquinadetalles__metros_Internalname = sPrefix+"SDTPRODUCCIONMAQUINADETALLES__METROS" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Internalname = sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR" ;
      divGridsdtproduccionmaquinadetallestablewithpaginationbar_Internalname = sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLESTABLEWITHPAGINATIONBAR" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Gridsdtproduccionmaquinadetalles_empowerer_Internalname = sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridsdtproduccionmaquinadetalles_Internalname = sPrefix+"GRIDSDTPRODUCCIONMAQUINADETALLES" ;
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
      subGridsdtproduccionmaquinadetalles_Allowcollapsing = (byte)(0) ;
      subGridsdtproduccionmaquinadetalles_Allowselection = (byte)(0) ;
      subGridsdtproduccionmaquinadetalles_Header = "" ;
      edtavSdtproduccionmaquinadetalles__metros_Jsonclick = "" ;
      edtavSdtproduccionmaquinadetalles__metros_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__kilos_Jsonclick = "" ;
      edtavSdtproduccionmaquinadetalles__kilos_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__hisprodtf_Jsonclick = "" ;
      edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__hisprodti_Jsonclick = "" ;
      edtavSdtproduccionmaquinadetalles__hisprodti_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__barhdr_Jsonclick = "" ;
      edtavSdtproduccionmaquinadetalles__barhdr_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__maqdsc_Jsonclick = "" ;
      edtavSdtproduccionmaquinadetalles__maqdsc_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__maqcod_Jsonclick = "" ;
      edtavSdtproduccionmaquinadetalles__maqcod_Enabled = 0 ;
      subGridsdtproduccionmaquinadetalles_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtproduccionmaquinadetalles_Backcolorstyle = (byte)(0) ;
      edtavSdtproduccionmaquinadetalles__metros_Enabled = -1 ;
      edtavSdtproduccionmaquinadetalles__kilos_Enabled = -1 ;
      edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled = -1 ;
      edtavSdtproduccionmaquinadetalles__hisprodti_Enabled = -1 ;
      edtavSdtproduccionmaquinadetalles__barhdr_Enabled = -1 ;
      edtavSdtproduccionmaquinadetalles__maqdsc_Enabled = -1 ;
      edtavSdtproduccionmaquinadetalles__maqcod_Enabled = -1 ;
      Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtproduccionmaquinadetallespaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtproduccionmaquinadetallespaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtproduccionmaquinadetallespaginationbar_Pagestoshow = 5 ;
      Gridsdtproduccionmaquinadetallespaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtproduccionmaquinadetallespaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtproduccionmaquinadetallespaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtproduccionmaquinadetallespaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtproduccionmaquinadetallespaginationbar_Class = "PaginationBar" ;
      subGridsdtproduccionmaquinadetalles_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage'},{av:'GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF'},{av:'AV15sdtProduccionMaquinaDetalles',fld:'vSDTPRODUCCIONMAQUINADETALLES',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'GridRC',grid:18},{av:'subGridsdtproduccionmaquinadetalles_Rows',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'Rows'},{av:'sPrefix'},{av:'AV7MaqCodIni',fld:'vMAQCODINI',pic:''},{av:'AV8MaqCodFin',fld:'vMAQCODFIN',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15sdtProduccionMaquinaDetalles',fld:'vSDTPRODUCCIONMAQUINADETALLES',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage'},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'GridRC',grid:18},{av:'AV18GridsdtProduccionMaquinaDetallesCurrentPage',fld:'vGRIDSDTPRODUCCIONMAQUINADETALLESCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridsdtProduccionMaquinaDetallesPageCount',fld:'vGRIDSDTPRODUCCIONMAQUINADETALLESPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDTPRODUCCIONMAQUINADETALLES.LOAD","{handler:'e15D32',iparms:[]");
      setEventMetadata("GRIDSDTPRODUCCIONMAQUINADETALLES.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR.CHANGEPAGE","{handler:'e11D32',iparms:[{av:'GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage'},{av:'GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF'},{av:'AV15sdtProduccionMaquinaDetalles',fld:'vSDTPRODUCCIONMAQUINADETALLES',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'GridRC',grid:18},{av:'subGridsdtproduccionmaquinadetalles_Rows',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'Rows'},{av:'AV7MaqCodIni',fld:'vMAQCODINI',pic:''},{av:'AV8MaqCodFin',fld:'vMAQCODFIN',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12D32',iparms:[{av:'GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage'},{av:'GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF'},{av:'AV15sdtProduccionMaquinaDetalles',fld:'vSDTPRODUCCIONMAQUINADETALLES',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'GridRC',grid:18},{av:'subGridsdtproduccionmaquinadetalles_Rows',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'Rows'},{av:'AV7MaqCodIni',fld:'vMAQCODINI',pic:''},{av:'AV8MaqCodFin',fld:'vMAQCODFIN',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTPRODUCCIONMAQUINADETALLESPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtproduccionmaquinadetalles_Rows',ctrl:'GRIDSDTPRODUCCIONMAQUINADETALLES',prop:'Rows'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv8',iparms:[]");
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
      wcpOAV7MaqCodIni = "" ;
      wcpOAV8MaqCodFin = "" ;
      wcpOAV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV10HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7MaqCodIni = "" ;
      AV8MaqCodFin = "" ;
      AV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV10HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV15sdtProduccionMaquinaDetalles = new GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle>(app.SdtsdtProduccionMaquinaDetalle.class, "sdtProduccionMaquinaDetalle", "TexplusNET", remoteHandle);
      Gridsdtproduccionmaquinadetalles_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridsdtproduccionmaquinadetallesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtproduccionmaquinadetallespaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGridsdtproduccionmaquinadetalles_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV31Station = "" ;
      GXt_char1 = "" ;
      AV32Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV33Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV34Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_objcol_SdtsdtProduccionMaquinaDetalle5 = new GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle>(app.SdtsdtProduccionMaquinaDetalle.class, "sdtProduccionMaquinaDetalle", "TexplusNET", remoteHandle);
      GXv_objcol_SdtsdtProduccionMaquinaDetalle6 = new GXBaseCollection[1] ;
      GridsdtproduccionmaquinadetallesRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7MaqCodIni = "" ;
      sCtrlAV8MaqCodFin = "" ;
      sCtrlAV9HisProDTI = "" ;
      sCtrlAV10HisProDTF = "" ;
      subGridsdtproduccionmaquinadetalles_Linesclass = "" ;
      ROClassString = "" ;
      GridsdtproduccionmaquinadetallesColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdtproduccionmaquinadetalles__maqcod_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__maqdsc_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__barhdr_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__hisprodti_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__kilos_Enabled = 0 ;
      edtavSdtproduccionmaquinadetalles__metros_Enabled = 0 ;
   }

   private byte GRIDSDTPRODUCCIONMAQUINADETALLES_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridsdtproduccionmaquinadetalles_Backcolorstyle ;
   private byte subGridsdtproduccionmaquinadetalles_Backstyle ;
   private byte subGridsdtproduccionmaquinadetalles_Titlebackstyle ;
   private byte subGridsdtproduccionmaquinadetalles_Allowselection ;
   private byte subGridsdtproduccionmaquinadetalles_Allowhovering ;
   private byte subGridsdtproduccionmaquinadetalles_Allowcollapsing ;
   private byte subGridsdtproduccionmaquinadetalles_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_18 ;
   private int subGridsdtproduccionmaquinadetalles_Rows ;
   private int nGXsfl_18_idx=1 ;
   private int Gridsdtproduccionmaquinadetallespaginationbar_Pagestoshow ;
   private int AV23GXV1 ;
   private int subGridsdtproduccionmaquinadetalles_Islastpage ;
   private int edtavSdtproduccionmaquinadetalles__maqcod_Enabled ;
   private int edtavSdtproduccionmaquinadetalles__maqdsc_Enabled ;
   private int edtavSdtproduccionmaquinadetalles__barhdr_Enabled ;
   private int edtavSdtproduccionmaquinadetalles__hisprodti_Enabled ;
   private int edtavSdtproduccionmaquinadetalles__hisprodtf_Enabled ;
   private int edtavSdtproduccionmaquinadetalles__kilos_Enabled ;
   private int edtavSdtproduccionmaquinadetalles__metros_Enabled ;
   private int GRIDSDTPRODUCCIONMAQUINADETALLES_nGridOutOfScope ;
   private int nGXsfl_18_fel_idx=1 ;
   private int AV17PageToGo ;
   private int idxLst ;
   private int subGridsdtproduccionmaquinadetalles_Backcolor ;
   private int subGridsdtproduccionmaquinadetalles_Allbackcolor ;
   private int subGridsdtproduccionmaquinadetalles_Titlebackcolor ;
   private int subGridsdtproduccionmaquinadetalles_Selectedindex ;
   private int subGridsdtproduccionmaquinadetalles_Selectioncolor ;
   private int subGridsdtproduccionmaquinadetalles_Hoveringcolor ;
   private long GRIDSDTPRODUCCIONMAQUINADETALLES_nFirstRecordOnPage ;
   private long AV18GridsdtProduccionMaquinaDetallesCurrentPage ;
   private long AV19GridsdtProduccionMaquinaDetallesPageCount ;
   private long GRIDSDTPRODUCCIONMAQUINADETALLES_nCurrentRecord ;
   private long GRIDSDTPRODUCCIONMAQUINADETALLES_nRecordCount ;
   private String wcpOAV7MaqCodIni ;
   private String wcpOAV8MaqCodFin ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7MaqCodIni ;
   private String AV8MaqCodFin ;
   private String sGXsfl_18_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Class ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Pagingbuttonsposition ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Pagingcaptionposition ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Emptygridclass ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageoptions ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Previous ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Next ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Caption ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Emptygridcaption ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpagecaption ;
   private String Gridsdtproduccionmaquinadetalles_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divGridsdtproduccionmaquinadetallestablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdtproduccionmaquinadetalles_Internalname ;
   private String Gridsdtproduccionmaquinadetallespaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsdtproduccionmaquinadetalles_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtproduccionmaquinadetalles__maqcod_Internalname ;
   private String edtavSdtproduccionmaquinadetalles__maqdsc_Internalname ;
   private String edtavSdtproduccionmaquinadetalles__barhdr_Internalname ;
   private String edtavSdtproduccionmaquinadetalles__hisprodti_Internalname ;
   private String edtavSdtproduccionmaquinadetalles__hisprodtf_Internalname ;
   private String edtavSdtproduccionmaquinadetalles__kilos_Internalname ;
   private String edtavSdtproduccionmaquinadetalles__metros_Internalname ;
   private String sGXsfl_18_fel_idx="0001" ;
   private String AV31Station ;
   private String GXt_char1 ;
   private String AV32Emprcod ;
   private String GXv_char2[] ;
   private String AV33Emprnom ;
   private String GXv_char3[] ;
   private String AV34Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV7MaqCodIni ;
   private String sCtrlAV8MaqCodFin ;
   private String sCtrlAV9HisProDTI ;
   private String sCtrlAV10HisProDTF ;
   private String subGridsdtproduccionmaquinadetalles_Class ;
   private String subGridsdtproduccionmaquinadetalles_Linesclass ;
   private String ROClassString ;
   private String edtavSdtproduccionmaquinadetalles__maqcod_Jsonclick ;
   private String edtavSdtproduccionmaquinadetalles__maqdsc_Jsonclick ;
   private String edtavSdtproduccionmaquinadetalles__barhdr_Jsonclick ;
   private String edtavSdtproduccionmaquinadetalles__hisprodti_Jsonclick ;
   private String edtavSdtproduccionmaquinadetalles__hisprodtf_Jsonclick ;
   private String edtavSdtproduccionmaquinadetalles__kilos_Jsonclick ;
   private String edtavSdtproduccionmaquinadetalles__metros_Jsonclick ;
   private String subGridsdtproduccionmaquinadetalles_Header ;
   private java.util.Date wcpOAV9HisProDTI ;
   private java.util.Date wcpOAV10HisProDTF ;
   private java.util.Date AV9HisProDTI ;
   private java.util.Date AV10HisProDTF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gridsdtproduccionmaquinadetallespaginationbar_Showfirst ;
   private boolean Gridsdtproduccionmaquinadetallespaginationbar_Showprevious ;
   private boolean Gridsdtproduccionmaquinadetallespaginationbar_Shownext ;
   private boolean Gridsdtproduccionmaquinadetallespaginationbar_Showlast ;
   private boolean Gridsdtproduccionmaquinadetallespaginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_18_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV18 ;
   private com.genexus.webpanels.GXWebGrid GridsdtproduccionmaquinadetallesContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtproduccionmaquinadetallesRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtproduccionmaquinadetallesColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridsdtproduccionmaquinadetallespaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridsdtproduccionmaquinadetalles_empowerer ;
   private GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle> AV15sdtProduccionMaquinaDetalles ;
   private GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle> GXt_objcol_SdtsdtProduccionMaquinaDetalle5 ;
   private GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle> GXv_objcol_SdtsdtProduccionMaquinaDetalle6[] ;
}

