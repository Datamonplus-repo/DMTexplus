package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionresumenmaquinas_impl extends GXWebComponent
{
   public wcproduccionresumenmaquinas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionresumenmaquinas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionresumenmaquinas_impl.class ));
   }

   public wcproduccionresumenmaquinas_impl( int remoteHandle ,
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
               AV15Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
               AV13MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodIni", AV13MaqcodIni);
               AV12MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MaqcodFin", AV12MaqcodFin);
               AV11FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FInicio", localUtil.ttoc( AV11FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV10FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FFin", localUtil.ttoc( AV10FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV14TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipoProduccion", GXutil.str( AV14TipoProduccion, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV15Emprcod,AV13MaqcodIni,AV12MaqcodFin,AV11FInicio,AV10FFin,Byte.valueOf(AV14TipoProduccion)});
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtmaquinass") == 0 )
            {
               gxnrgridsdtmaquinass_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtmaquinass") == 0 )
            {
               gxgrgridsdtmaquinass_refresh_invoke( ) ;
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

   public void gxnrgridsdtmaquinass_newrow_invoke( )
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
      gxnrgridsdtmaquinass_newrow( ) ;
      /* End function gxnrGridsdtmaquinass_newrow_invoke */
   }

   public void gxgrgridsdtmaquinass_refresh_invoke( )
   {
      subGridsdtmaquinass_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtmaquinass_Rows"))) ;
      AV15Emprcod = httpContext.GetPar( "Emprcod") ;
      AV13MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
      AV12MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
      AV11FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
      AV10FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
      AV14TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtmaquinass_refresh( subGridsdtmaquinass_Rows, AV15Emprcod, AV13MaqcodIni, AV12MaqcodFin, AV11FInicio, AV10FFin, AV14TipoProduccion, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtmaquinass_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paDJ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Resumen Maquinas", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionresumenmaquinas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV13MaqcodIni)),GXutil.URLEncode(GXutil.rtrim(AV12MaqcodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV11FInicio)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV10FFin)),GXutil.URLEncode(GXutil.ltrimstr(AV14TipoProduccion,1,0))}, new String[] {"Emprcod","MaqcodIni","MaqcodFin","FInicio","FFin","TipoProduccion"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtmaquinass", AV5SDTMaquinass);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtmaquinass", AV5SDTMaquinass);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_18", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_18, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTMAQUINASSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV8GridSDTMaquinassCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTMAQUINASSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV9GridSDTMaquinassPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15Emprcod", GXutil.rtrim( wcpOAV15Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13MaqcodIni", GXutil.rtrim( wcpOAV13MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12MaqcodFin", GXutil.rtrim( wcpOAV12MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11FInicio", localUtil.ttoc( wcpOAV11FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10FFin", localUtil.ttoc( wcpOAV10FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14TipoProduccion", GXutil.ltrim( localUtil.ntoc( wcpOAV14TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV15Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV13MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV12MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFINICIO", localUtil.ttoc( AV11FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFFIN", localUtil.ttoc( AV10FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV14TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMAQUINASS", AV5SDTMaquinass);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMAQUINASS", AV5SDTMaquinass);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtmaquinasspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtmaquinasspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtmaquinasspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtmaquinasspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtmaquinasspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtmaquinasspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtmaquinass_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtmaquinasspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormDJ2( )
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
      return "WCProduccionResumenMaquinas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Resumen Maquinas", "") ;
   }

   public void wbDJ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionresumenmaquinas");
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
         app.GxWebStd.gx_div_start( httpContext, divGridsdtmaquinasstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtmaquinassContainer.SetWrapped(nGXWrapped);
         startgridcontrol18( ) ;
      }
      if ( wbEnd == 18 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_18 = (int)(nGXsfl_18_idx-1) ;
         if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV18GXV1 = nGXsfl_18_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridsdtmaquinassContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtmaquinass", GridsdtmaquinassContainer, subGridsdtmaquinass_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtmaquinassContainerData", GridsdtmaquinassContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtmaquinassContainerData"+"V", GridsdtmaquinassContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtmaquinassContainerData"+"V"+"\" value='"+GridsdtmaquinassContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtmaquinasspaginationbar.setProperty("Class", Gridsdtmaquinasspaginationbar_Class);
         ucGridsdtmaquinasspaginationbar.setProperty("ShowFirst", Gridsdtmaquinasspaginationbar_Showfirst);
         ucGridsdtmaquinasspaginationbar.setProperty("ShowPrevious", Gridsdtmaquinasspaginationbar_Showprevious);
         ucGridsdtmaquinasspaginationbar.setProperty("ShowNext", Gridsdtmaquinasspaginationbar_Shownext);
         ucGridsdtmaquinasspaginationbar.setProperty("ShowLast", Gridsdtmaquinasspaginationbar_Showlast);
         ucGridsdtmaquinasspaginationbar.setProperty("PagesToShow", Gridsdtmaquinasspaginationbar_Pagestoshow);
         ucGridsdtmaquinasspaginationbar.setProperty("PagingButtonsPosition", Gridsdtmaquinasspaginationbar_Pagingbuttonsposition);
         ucGridsdtmaquinasspaginationbar.setProperty("PagingCaptionPosition", Gridsdtmaquinasspaginationbar_Pagingcaptionposition);
         ucGridsdtmaquinasspaginationbar.setProperty("EmptyGridClass", Gridsdtmaquinasspaginationbar_Emptygridclass);
         ucGridsdtmaquinasspaginationbar.setProperty("RowsPerPageSelector", Gridsdtmaquinasspaginationbar_Rowsperpageselector);
         ucGridsdtmaquinasspaginationbar.setProperty("RowsPerPageOptions", Gridsdtmaquinasspaginationbar_Rowsperpageoptions);
         ucGridsdtmaquinasspaginationbar.setProperty("Previous", Gridsdtmaquinasspaginationbar_Previous);
         ucGridsdtmaquinasspaginationbar.setProperty("Next", Gridsdtmaquinasspaginationbar_Next);
         ucGridsdtmaquinasspaginationbar.setProperty("Caption", Gridsdtmaquinasspaginationbar_Caption);
         ucGridsdtmaquinasspaginationbar.setProperty("EmptyGridCaption", Gridsdtmaquinasspaginationbar_Emptygridcaption);
         ucGridsdtmaquinasspaginationbar.setProperty("RowsPerPageCaption", Gridsdtmaquinasspaginationbar_Rowsperpagecaption);
         ucGridsdtmaquinasspaginationbar.setProperty("CurrentPage", AV8GridSDTMaquinassCurrentPage);
         ucGridsdtmaquinasspaginationbar.setProperty("PageCount", AV9GridSDTMaquinassPageCount);
         ucGridsdtmaquinasspaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtmaquinasspaginationbar_Internalname, sPrefix+"GRIDSDTMAQUINASSPAGINATIONBARContainer");
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
         ucGridsdtmaquinass_empowerer.render(context, "wwp.gridempowerer", Gridsdtmaquinass_empowerer_Internalname, sPrefix+"GRIDSDTMAQUINASS_EMPOWERERContainer");
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
            if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV18GXV1 = nGXsfl_18_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridsdtmaquinassContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtmaquinass", GridsdtmaquinassContainer, subGridsdtmaquinass_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtmaquinassContainerData", GridsdtmaquinassContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtmaquinassContainerData"+"V", GridsdtmaquinassContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtmaquinassContainerData"+"V"+"\" value='"+GridsdtmaquinassContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startDJ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Resumen Maquinas", ""), (short)(0)) ;
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
            strupDJ0( ) ;
         }
      }
   }

   public void wsDJ2( )
   {
      startDJ2( ) ;
      evtDJ2( ) ;
   }

   public void evtDJ2( )
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
                              strupDJ0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTMAQUINASSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11DJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTMAQUINASSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12DJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDJ0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 21), "GRIDSDTMAQUINASS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDJ0( ) ;
                           }
                           nGXsfl_18_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_182( ) ;
                           AV18GXV1 = (int)(nGXsfl_18_idx+GRIDSDTMAQUINASS_nFirstRecordOnPage) ;
                           if ( ( AV5SDTMaquinass.size() >= AV18GXV1 ) && ( AV18GXV1 > 0 ) )
                           {
                              AV5SDTMaquinass.currentItem( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)) );
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
                                       e13DJ2 ();
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
                                       e14DJ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTMAQUINASS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e15DJ2 ();
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
                                    strupDJ0( ) ;
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

   public void weDJ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormDJ2( ) ;
         }
      }
   }

   public void paDJ2( )
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

   public void gxnrgridsdtmaquinass_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_182( ) ;
      while ( nGXsfl_18_idx <= nRC_GXsfl_18 )
      {
         sendrow_182( ) ;
         nGXsfl_18_idx = ((subGridsdtmaquinass_Islastpage==1)&&(nGXsfl_18_idx+1>subgridsdtmaquinass_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtmaquinassContainer)) ;
      /* End function gxnrGridsdtmaquinass_newrow */
   }

   public void gxgrgridsdtmaquinass_refresh( int subGridsdtmaquinass_Rows ,
                                             String AV15Emprcod ,
                                             String AV13MaqcodIni ,
                                             String AV12MaqcodFin ,
                                             java.util.Date AV11FInicio ,
                                             java.util.Date AV10FFin ,
                                             byte AV14TipoProduccion ,
                                             String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14DJ2 ();
      GRIDSDTMAQUINASS_nCurrentRecord = 0 ;
      rfDJ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtmaquinass_refresh */
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
      rfDJ2( ) ;
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
      edtavSdtmaquinass__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__maqcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtmaquinass__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__maqdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtmaquinass__kilosproduccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__kilosproduccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__kilosproduccion_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtmaquinass__metrosproduccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__metrosproduccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__metrosproduccion_Enabled), 5, 0), !bGXsfl_18_Refreshing);
   }

   public void rfDJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtmaquinassContainer.ClearRows();
      }
      wbStart = (short)(18) ;
      /* Execute user event: Refresh */
      e14DJ2 ();
      nGXsfl_18_idx = 1 ;
      sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_182( ) ;
      bGXsfl_18_Refreshing = true ;
      GridsdtmaquinassContainer.AddObjectProperty("GridName", "Gridsdtmaquinass");
      GridsdtmaquinassContainer.AddObjectProperty("CmpContext", sPrefix);
      GridsdtmaquinassContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtmaquinassContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtmaquinassContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtmaquinassContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtmaquinassContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtmaquinassContainer.setPageSize( subgridsdtmaquinass_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_182( ) ;
         e15DJ2 ();
         if ( ( GRIDSDTMAQUINASS_nCurrentRecord > 0 ) && ( GRIDSDTMAQUINASS_nGridOutOfScope == 0 ) && ( nGXsfl_18_idx == 1 ) )
         {
            GRIDSDTMAQUINASS_nCurrentRecord = 0 ;
            GRIDSDTMAQUINASS_nGridOutOfScope = 1 ;
            subgridsdtmaquinass_firstpage( ) ;
            e15DJ2 ();
         }
         wbEnd = (short)(18) ;
         wbDJ0( ) ;
      }
      bGXsfl_18_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDJ2( )
   {
   }

   public int subgridsdtmaquinass_fnc_pagecount( )
   {
      GRIDSDTMAQUINASS_nRecordCount = subgridsdtmaquinass_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTMAQUINASS_nRecordCount) % (subgridsdtmaquinass_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTMAQUINASS_nRecordCount/ (double) (subgridsdtmaquinass_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTMAQUINASS_nRecordCount/ (double) (subgridsdtmaquinass_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtmaquinass_fnc_recordcount( )
   {
      return AV5SDTMaquinass.size() ;
   }

   public int subgridsdtmaquinass_fnc_recordsperpage( )
   {
      if ( subGridsdtmaquinass_Rows > 0 )
      {
         return subGridsdtmaquinass_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtmaquinass_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTMAQUINASS_nFirstRecordOnPage/ (double) (subgridsdtmaquinass_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtmaquinass_firstpage( )
   {
      GRIDSDTMAQUINASS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtmaquinass_refresh( subGridsdtmaquinass_Rows, AV15Emprcod, AV13MaqcodIni, AV12MaqcodFin, AV11FInicio, AV10FFin, AV14TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtmaquinass_nextpage( )
   {
      GRIDSDTMAQUINASS_nRecordCount = subgridsdtmaquinass_fnc_recordcount( ) ;
      if ( ( GRIDSDTMAQUINASS_nRecordCount >= subgridsdtmaquinass_fnc_recordsperpage( ) ) && ( GRIDSDTMAQUINASS_nEOF == 0 ) )
      {
         GRIDSDTMAQUINASS_nFirstRecordOnPage = (long)(GRIDSDTMAQUINASS_nFirstRecordOnPage+subgridsdtmaquinass_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtmaquinassContainer.AddObjectProperty("GRIDSDTMAQUINASS_nFirstRecordOnPage", GRIDSDTMAQUINASS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtmaquinass_refresh( subGridsdtmaquinass_Rows, AV15Emprcod, AV13MaqcodIni, AV12MaqcodFin, AV11FInicio, AV10FFin, AV14TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTMAQUINASS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtmaquinass_previouspage( )
   {
      if ( GRIDSDTMAQUINASS_nFirstRecordOnPage >= subgridsdtmaquinass_fnc_recordsperpage( ) )
      {
         GRIDSDTMAQUINASS_nFirstRecordOnPage = (long)(GRIDSDTMAQUINASS_nFirstRecordOnPage-subgridsdtmaquinass_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtmaquinass_refresh( subGridsdtmaquinass_Rows, AV15Emprcod, AV13MaqcodIni, AV12MaqcodFin, AV11FInicio, AV10FFin, AV14TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtmaquinass_lastpage( )
   {
      GRIDSDTMAQUINASS_nRecordCount = subgridsdtmaquinass_fnc_recordcount( ) ;
      if ( GRIDSDTMAQUINASS_nRecordCount > subgridsdtmaquinass_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTMAQUINASS_nRecordCount) % (subgridsdtmaquinass_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTMAQUINASS_nFirstRecordOnPage = (long)(GRIDSDTMAQUINASS_nRecordCount-subgridsdtmaquinass_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTMAQUINASS_nFirstRecordOnPage = (long)(GRIDSDTMAQUINASS_nRecordCount-((int)((GRIDSDTMAQUINASS_nRecordCount) % (subgridsdtmaquinass_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTMAQUINASS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtmaquinass_refresh( subGridsdtmaquinass_Rows, AV15Emprcod, AV13MaqcodIni, AV12MaqcodFin, AV11FInicio, AV10FFin, AV14TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtmaquinass_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTMAQUINASS_nFirstRecordOnPage = (long)(subgridsdtmaquinass_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTMAQUINASS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtmaquinass_refresh( subGridsdtmaquinass_Rows, AV15Emprcod, AV13MaqcodIni, AV12MaqcodFin, AV11FInicio, AV10FFin, AV14TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSdtmaquinass__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__maqcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtmaquinass__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__maqdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtmaquinass__kilosproduccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__kilosproduccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__kilosproduccion_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavSdtmaquinass__metrosproduccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquinass__metrosproduccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquinass__metrosproduccion_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupDJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13DJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtmaquinass"), AV5SDTMaquinass);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTMAQUINASS"), AV5SDTMaquinass);
         /* Read saved values. */
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV8GridSDTMaquinassCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTMAQUINASSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV9GridSDTMaquinassPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTMAQUINASSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV15Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV15Emprcod") ;
         wcpOAV13MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV13MaqcodIni") ;
         wcpOAV12MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV12MaqcodFin") ;
         wcpOAV11FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV11FInicio"), 0) ;
         wcpOAV10FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV10FFin"), 0) ;
         wcpOAV14TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDSDTMAQUINASS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTMAQUINASS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtmaquinass_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridsdtmaquinasspaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Class") ;
         Gridsdtmaquinasspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Showfirst")) ;
         Gridsdtmaquinasspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Showprevious")) ;
         Gridsdtmaquinasspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Shownext")) ;
         Gridsdtmaquinasspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Showlast")) ;
         Gridsdtmaquinasspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtmaquinasspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtmaquinasspaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtmaquinasspaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Emptygridclass") ;
         Gridsdtmaquinasspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtmaquinasspaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtmaquinasspaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Previous") ;
         Gridsdtmaquinasspaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Next") ;
         Gridsdtmaquinasspaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Caption") ;
         Gridsdtmaquinasspaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtmaquinasspaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpagecaption") ;
         Gridsdtmaquinass_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASS_EMPOWERER_Gridinternalname") ;
         Gridsdtmaquinasspaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Selectedpage") ;
         Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_18_fel_idx = 0 ;
         while ( nGXsfl_18_fel_idx < nRC_GXsfl_18 )
         {
            nGXsfl_18_fel_idx = ((subGridsdtmaquinass_Islastpage==1)&&(nGXsfl_18_fel_idx+1>subgridsdtmaquinass_fnc_recordsperpage( )) ? 1 : nGXsfl_18_fel_idx+1) ;
            sGXsfl_18_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_182( ) ;
            AV18GXV1 = (int)(nGXsfl_18_fel_idx+GRIDSDTMAQUINASS_nFirstRecordOnPage) ;
            if ( ( AV5SDTMaquinass.size() >= AV18GXV1 ) && ( AV18GXV1 > 0 ) )
            {
               AV5SDTMaquinass.currentItem( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)) );
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
      e13DJ2 ();
      if (returnInSub) return;
   }

   public void e13DJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionresumenmaquinas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV24Emprnom ;
      GXv_char4[0] = AV25Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionresumenmaquinas_impl.this.AV15Emprcod = GXv_char2[0] ;
      wcproduccionresumenmaquinas_impl.this.AV24Emprnom = GXv_char3[0] ;
      wcproduccionresumenmaquinas_impl.this.AV25Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
      Gridsdtmaquinass_empowerer_Gridinternalname = subGridsdtmaquinass_Internalname ;
      ucGridsdtmaquinass_empowerer.sendProperty(context, sPrefix, false, Gridsdtmaquinass_empowerer_Internalname, "GridInternalName", Gridsdtmaquinass_empowerer_Gridinternalname);
      subGridsdtmaquinass_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue = subGridsdtmaquinass_Rows ;
      ucGridsdtmaquinasspaginationbar.sendProperty(context, sPrefix, false, Gridsdtmaquinasspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e14DJ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTMaquinas5 = AV5SDTMaquinass ;
      GXv_objcol_SdtSDTMaquinas6[0] = GXt_objcol_SdtSDTMaquinas5 ;
      new app.dpmaquinas(remoteHandle, context).execute( AV15Emprcod, AV13MaqcodIni, AV12MaqcodFin, AV11FInicio, AV10FFin, AV14TipoProduccion, GXv_objcol_SdtSDTMaquinas6) ;
      GXt_objcol_SdtSDTMaquinas5 = GXv_objcol_SdtSDTMaquinas6[0] ;
      AV5SDTMaquinass = GXt_objcol_SdtSDTMaquinas5 ;
      gx_BV18 = true ;
      AV8GridSDTMaquinassCurrentPage = subgridsdtmaquinass_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8GridSDTMaquinassCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridSDTMaquinassCurrentPage), 10, 0));
      AV9GridSDTMaquinassPageCount = subgridsdtmaquinass_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9GridSDTMaquinassPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9GridSDTMaquinassPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5SDTMaquinass", AV5SDTMaquinass);
   }

   private void e15DJ2( )
   {
      /* Gridsdtmaquinass_Load Routine */
      returnInSub = false ;
      AV18GXV1 = 1 ;
      while ( AV18GXV1 <= AV5SDTMaquinass.size() )
      {
         AV5SDTMaquinass.currentItem( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(18) ;
         }
         if ( ( subGridsdtmaquinass_Islastpage == 1 ) || ( subGridsdtmaquinass_Rows == 0 ) || ( ( GRIDSDTMAQUINASS_nCurrentRecord >= GRIDSDTMAQUINASS_nFirstRecordOnPage ) && ( GRIDSDTMAQUINASS_nCurrentRecord < GRIDSDTMAQUINASS_nFirstRecordOnPage + subgridsdtmaquinass_fnc_recordsperpage( ) ) ) )
         {
            sendrow_182( ) ;
            GRIDSDTMAQUINASS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTMAQUINASS_nCurrentRecord + 1 >= subgridsdtmaquinass_fnc_recordcount( ) )
            {
               GRIDSDTMAQUINASS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTMAQUINASS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTMAQUINASS_nCurrentRecord = (long)(GRIDSDTMAQUINASS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_18_Refreshing )
         {
            httpContext.doAjaxLoad(18, GridsdtmaquinassRow);
         }
         AV18GXV1 = (int)(AV18GXV1+1) ;
      }
   }

   public void e11DJ2( )
   {
      /* Gridsdtmaquinasspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtmaquinasspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtmaquinass_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtmaquinasspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV7PageToGo = subgridsdtmaquinass_fnc_currentpage( ) ;
         AV7PageToGo = (int)(AV7PageToGo+1) ;
         subgridsdtmaquinass_gotopage( AV7PageToGo) ;
      }
      else
      {
         AV7PageToGo = (int)(GXutil.lval( Gridsdtmaquinasspaginationbar_Selectedpage)) ;
         subgridsdtmaquinass_gotopage( AV7PageToGo) ;
      }
   }

   public void e12DJ2( )
   {
      /* Gridsdtmaquinasspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtmaquinass_Rows = Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTMAQUINASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtmaquinass_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV15Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
      AV13MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodIni", AV13MaqcodIni);
      AV12MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MaqcodFin", AV12MaqcodFin);
      AV11FInicio = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FInicio", localUtil.ttoc( AV11FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV10FFin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FFin", localUtil.ttoc( AV10FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV14TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipoProduccion", GXutil.str( AV14TipoProduccion, 1, 0));
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
      paDJ2( ) ;
      wsDJ2( ) ;
      weDJ2( ) ;
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
      sCtrlAV15Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV13MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV12MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV11FInicio = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV10FFin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV14TipoProduccion = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paDJ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionresumenmaquinas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paDJ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV15Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
         AV13MaqcodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodIni", AV13MaqcodIni);
         AV12MaqcodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MaqcodFin", AV12MaqcodFin);
         AV11FInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FInicio", localUtil.ttoc( AV11FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV10FFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FFin", localUtil.ttoc( AV10FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV14TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipoProduccion", GXutil.str( AV14TipoProduccion, 1, 0));
      }
      wcpOAV15Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV15Emprcod") ;
      wcpOAV13MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV13MaqcodIni") ;
      wcpOAV12MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV12MaqcodFin") ;
      wcpOAV11FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV11FInicio"), 0) ;
      wcpOAV10FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV10FFin"), 0) ;
      wcpOAV14TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV15Emprcod, wcpOAV15Emprcod) != 0 ) || ( GXutil.strcmp(AV13MaqcodIni, wcpOAV13MaqcodIni) != 0 ) || ( GXutil.strcmp(AV12MaqcodFin, wcpOAV12MaqcodFin) != 0 ) || !( GXutil.dateCompare(AV11FInicio, wcpOAV11FInicio) ) || !( GXutil.dateCompare(AV10FFin, wcpOAV10FFin) ) || ( AV14TipoProduccion != wcpOAV14TipoProduccion ) ) )
      {
         setjustcreated();
      }
      wcpOAV15Emprcod = AV15Emprcod ;
      wcpOAV13MaqcodIni = AV13MaqcodIni ;
      wcpOAV12MaqcodFin = AV12MaqcodFin ;
      wcpOAV11FInicio = AV11FInicio ;
      wcpOAV10FFin = AV10FFin ;
      wcpOAV14TipoProduccion = AV14TipoProduccion ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV15Emprcod = httpContext.cgiGet( sPrefix+"AV15Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV15Emprcod) > 0 )
      {
         AV15Emprcod = httpContext.cgiGet( sCtrlAV15Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
      }
      else
      {
         AV15Emprcod = httpContext.cgiGet( sPrefix+"AV15Emprcod_PARM") ;
      }
      sCtrlAV13MaqcodIni = httpContext.cgiGet( sPrefix+"AV13MaqcodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV13MaqcodIni) > 0 )
      {
         AV13MaqcodIni = httpContext.cgiGet( sCtrlAV13MaqcodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodIni", AV13MaqcodIni);
      }
      else
      {
         AV13MaqcodIni = httpContext.cgiGet( sPrefix+"AV13MaqcodIni_PARM") ;
      }
      sCtrlAV12MaqcodFin = httpContext.cgiGet( sPrefix+"AV12MaqcodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV12MaqcodFin) > 0 )
      {
         AV12MaqcodFin = httpContext.cgiGet( sCtrlAV12MaqcodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MaqcodFin", AV12MaqcodFin);
      }
      else
      {
         AV12MaqcodFin = httpContext.cgiGet( sPrefix+"AV12MaqcodFin_PARM") ;
      }
      sCtrlAV11FInicio = httpContext.cgiGet( sPrefix+"AV11FInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV11FInicio) > 0 )
      {
         AV11FInicio = localUtil.ctot( httpContext.cgiGet( sCtrlAV11FInicio), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FInicio", localUtil.ttoc( AV11FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV11FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV11FInicio_PARM"), 0) ;
      }
      sCtrlAV10FFin = httpContext.cgiGet( sPrefix+"AV10FFin_CTRL") ;
      if ( GXutil.len( sCtrlAV10FFin) > 0 )
      {
         AV10FFin = localUtil.ctot( httpContext.cgiGet( sCtrlAV10FFin), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FFin", localUtil.ttoc( AV10FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV10FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV10FFin_PARM"), 0) ;
      }
      sCtrlAV14TipoProduccion = httpContext.cgiGet( sPrefix+"AV14TipoProduccion_CTRL") ;
      if ( GXutil.len( sCtrlAV14TipoProduccion) > 0 )
      {
         AV14TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14TipoProduccion), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14TipoProduccion", GXutil.str( AV14TipoProduccion, 1, 0));
      }
      else
      {
         AV14TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14TipoProduccion_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paDJ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsDJ2( ) ;
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
      wsDJ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Emprcod_PARM", GXutil.rtrim( AV15Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Emprcod_CTRL", GXutil.rtrim( sCtrlAV15Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13MaqcodIni_PARM", GXutil.rtrim( AV13MaqcodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13MaqcodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13MaqcodIni_CTRL", GXutil.rtrim( sCtrlAV13MaqcodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12MaqcodFin_PARM", GXutil.rtrim( AV12MaqcodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12MaqcodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12MaqcodFin_CTRL", GXutil.rtrim( sCtrlAV12MaqcodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FInicio_PARM", localUtil.ttoc( AV11FInicio, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11FInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FInicio_CTRL", GXutil.rtrim( sCtrlAV11FInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FFin_PARM", localUtil.ttoc( AV10FFin, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10FFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FFin_CTRL", GXutil.rtrim( sCtrlAV10FFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14TipoProduccion_PARM", GXutil.ltrim( localUtil.ntoc( AV14TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14TipoProduccion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14TipoProduccion_CTRL", GXutil.rtrim( sCtrlAV14TipoProduccion));
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
      weDJ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564854", true, true);
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
         httpContext.AddJavascriptSource("wcproduccionresumenmaquinas.js", "?202661015564855", false, true);
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
      edtavSdtmaquinass__maqcod_Internalname = sPrefix+"SDTMAQUINASS__MAQCOD_"+sGXsfl_18_idx ;
      edtavSdtmaquinass__maqdsc_Internalname = sPrefix+"SDTMAQUINASS__MAQDSC_"+sGXsfl_18_idx ;
      edtavSdtmaquinass__kilosproduccion_Internalname = sPrefix+"SDTMAQUINASS__KILOSPRODUCCION_"+sGXsfl_18_idx ;
      edtavSdtmaquinass__metrosproduccion_Internalname = sPrefix+"SDTMAQUINASS__METROSPRODUCCION_"+sGXsfl_18_idx ;
   }

   public void subsflControlProps_fel_182( )
   {
      edtavSdtmaquinass__maqcod_Internalname = sPrefix+"SDTMAQUINASS__MAQCOD_"+sGXsfl_18_fel_idx ;
      edtavSdtmaquinass__maqdsc_Internalname = sPrefix+"SDTMAQUINASS__MAQDSC_"+sGXsfl_18_fel_idx ;
      edtavSdtmaquinass__kilosproduccion_Internalname = sPrefix+"SDTMAQUINASS__KILOSPRODUCCION_"+sGXsfl_18_fel_idx ;
      edtavSdtmaquinass__metrosproduccion_Internalname = sPrefix+"SDTMAQUINASS__METROSPRODUCCION_"+sGXsfl_18_fel_idx ;
   }

   public void sendrow_182( )
   {
      subsflControlProps_182( ) ;
      wbDJ0( ) ;
      if ( ( subGridsdtmaquinass_Rows * 1 == 0 ) || ( nGXsfl_18_idx <= subgridsdtmaquinass_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtmaquinassRow = GXWebRow.GetNew(context,GridsdtmaquinassContainer) ;
         if ( subGridsdtmaquinass_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtmaquinass_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtmaquinass_Class, "") != 0 )
            {
               subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"Odd" ;
            }
         }
         else if ( subGridsdtmaquinass_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtmaquinass_Backstyle = (byte)(0) ;
            subGridsdtmaquinass_Backcolor = subGridsdtmaquinass_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtmaquinass_Class, "") != 0 )
            {
               subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtmaquinass_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtmaquinass_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtmaquinass_Class, "") != 0 )
            {
               subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"Odd" ;
            }
            subGridsdtmaquinass_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtmaquinass_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtmaquinass_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_18_idx) % (2))) == 0 )
            {
               subGridsdtmaquinass_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtmaquinass_Class, "") != 0 )
               {
                  subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtmaquinass_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtmaquinass_Class, "") != 0 )
               {
                  subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_18_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtmaquinassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmaquinass__maqcod_Internalname,GXutil.rtrim( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtmaquinass__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtmaquinass__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtmaquinassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmaquinass__maqdsc_Internalname,GXutil.rtrim( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtmaquinass__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtmaquinass__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtmaquinassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmaquinass__kilosproduccion_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Kilosproduccion(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtmaquinass__kilosproduccion_Enabled!=0) ? localUtil.format( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Kilosproduccion(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Kilosproduccion(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtmaquinass__kilosproduccion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtmaquinass__kilosproduccion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtmaquinassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmaquinass__metrosproduccion_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Metrosproduccion(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtmaquinass__metrosproduccion_Enabled!=0) ? localUtil.format( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Metrosproduccion(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTMaquinas)AV5SDTMaquinass.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTMaquinas_Metrosproduccion(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtmaquinass__metrosproduccion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtmaquinass__metrosproduccion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesDJ2( ) ;
         GridsdtmaquinassContainer.AddRow(GridsdtmaquinassRow);
         nGXsfl_18_idx = ((subGridsdtmaquinass_Islastpage==1)&&(nGXsfl_18_idx+1>subgridsdtmaquinass_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      /* End function sendrow_182 */
   }

   public void startgridcontrol18( )
   {
      if ( GridsdtmaquinassContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridsdtmaquinassContainer"+"DivS\" data-gxgridid=\"18\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtmaquinass_Internalname, subGridsdtmaquinass_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtmaquinass_Backcolorstyle == 0 )
         {
            subGridsdtmaquinass_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtmaquinass_Class) > 0 )
            {
               subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtmaquinass_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtmaquinass_Backcolorstyle == 1 )
            {
               subGridsdtmaquinass_Titlebackcolor = subGridsdtmaquinass_Allbackcolor ;
               if ( GXutil.len( subGridsdtmaquinass_Class) > 0 )
               {
                  subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtmaquinass_Class) > 0 )
               {
                  subGridsdtmaquinass_Linesclass = subGridsdtmaquinass_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtmaquinassContainer.AddObjectProperty("GridName", "Gridsdtmaquinass");
      }
      else
      {
         GridsdtmaquinassContainer.AddObjectProperty("GridName", "Gridsdtmaquinass");
         GridsdtmaquinassContainer.AddObjectProperty("Header", subGridsdtmaquinass_Header);
         GridsdtmaquinassContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtmaquinassContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("CmpContext", sPrefix);
         GridsdtmaquinassContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtmaquinassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtmaquinassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmaquinass__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddColumnProperties(GridsdtmaquinassColumn);
         GridsdtmaquinassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtmaquinassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmaquinass__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddColumnProperties(GridsdtmaquinassColumn);
         GridsdtmaquinassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtmaquinassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmaquinass__kilosproduccion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddColumnProperties(GridsdtmaquinassColumn);
         GridsdtmaquinassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtmaquinassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmaquinass__metrosproduccion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddColumnProperties(GridsdtmaquinassColumn);
         GridsdtmaquinassContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtmaquinassContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtmaquinass_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavSdtmaquinass__maqcod_Internalname = sPrefix+"SDTMAQUINASS__MAQCOD" ;
      edtavSdtmaquinass__maqdsc_Internalname = sPrefix+"SDTMAQUINASS__MAQDSC" ;
      edtavSdtmaquinass__kilosproduccion_Internalname = sPrefix+"SDTMAQUINASS__KILOSPRODUCCION" ;
      edtavSdtmaquinass__metrosproduccion_Internalname = sPrefix+"SDTMAQUINASS__METROSPRODUCCION" ;
      Gridsdtmaquinasspaginationbar_Internalname = sPrefix+"GRIDSDTMAQUINASSPAGINATIONBAR" ;
      divGridsdtmaquinasstablewithpaginationbar_Internalname = sPrefix+"GRIDSDTMAQUINASSTABLEWITHPAGINATIONBAR" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Gridsdtmaquinass_empowerer_Internalname = sPrefix+"GRIDSDTMAQUINASS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridsdtmaquinass_Internalname = sPrefix+"GRIDSDTMAQUINASS" ;
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
      subGridsdtmaquinass_Allowcollapsing = (byte)(0) ;
      subGridsdtmaquinass_Allowselection = (byte)(0) ;
      subGridsdtmaquinass_Header = "" ;
      edtavSdtmaquinass__metrosproduccion_Jsonclick = "" ;
      edtavSdtmaquinass__metrosproduccion_Enabled = 0 ;
      edtavSdtmaquinass__kilosproduccion_Jsonclick = "" ;
      edtavSdtmaquinass__kilosproduccion_Enabled = 0 ;
      edtavSdtmaquinass__maqdsc_Jsonclick = "" ;
      edtavSdtmaquinass__maqdsc_Enabled = 0 ;
      edtavSdtmaquinass__maqcod_Jsonclick = "" ;
      edtavSdtmaquinass__maqcod_Enabled = 0 ;
      subGridsdtmaquinass_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtmaquinass_Backcolorstyle = (byte)(0) ;
      edtavSdtmaquinass__metrosproduccion_Enabled = -1 ;
      edtavSdtmaquinass__kilosproduccion_Enabled = -1 ;
      edtavSdtmaquinass__maqdsc_Enabled = -1 ;
      edtavSdtmaquinass__maqcod_Enabled = -1 ;
      Gridsdtmaquinasspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtmaquinasspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtmaquinasspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtmaquinasspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtmaquinasspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtmaquinasspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtmaquinasspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtmaquinasspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtmaquinasspaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtmaquinasspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtmaquinasspaginationbar_Pagestoshow = 5 ;
      Gridsdtmaquinasspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtmaquinasspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtmaquinasspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtmaquinasspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtmaquinasspaginationbar_Class = "PaginationBar" ;
      subGridsdtmaquinass_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTMAQUINASS_nFirstRecordOnPage'},{av:'GRIDSDTMAQUINASS_nEOF'},{av:'AV5SDTMaquinass',fld:'vSDTMAQUINASS',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTMAQUINASS',prop:'GridRC',grid:18},{av:'subGridsdtmaquinass_Rows',ctrl:'GRIDSDTMAQUINASS',prop:'Rows'},{av:'sPrefix'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV12MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV11FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV10FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV14TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV5SDTMaquinass',fld:'vSDTMAQUINASS',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'GRIDSDTMAQUINASS_nFirstRecordOnPage'},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTMAQUINASS',prop:'GridRC',grid:18},{av:'AV8GridSDTMaquinassCurrentPage',fld:'vGRIDSDTMAQUINASSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV9GridSDTMaquinassPageCount',fld:'vGRIDSDTMAQUINASSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDTMAQUINASS.LOAD","{handler:'e15DJ2',iparms:[]");
      setEventMetadata("GRIDSDTMAQUINASS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTMAQUINASSPAGINATIONBAR.CHANGEPAGE","{handler:'e11DJ2',iparms:[{av:'GRIDSDTMAQUINASS_nFirstRecordOnPage'},{av:'GRIDSDTMAQUINASS_nEOF'},{av:'AV5SDTMaquinass',fld:'vSDTMAQUINASS',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTMAQUINASS',prop:'GridRC',grid:18},{av:'subGridsdtmaquinass_Rows',ctrl:'GRIDSDTMAQUINASS',prop:'Rows'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV12MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV11FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV10FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV14TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'sPrefix'},{av:'Gridsdtmaquinasspaginationbar_Selectedpage',ctrl:'GRIDSDTMAQUINASSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTMAQUINASSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTMAQUINASSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12DJ2',iparms:[{av:'GRIDSDTMAQUINASS_nFirstRecordOnPage'},{av:'GRIDSDTMAQUINASS_nEOF'},{av:'AV5SDTMaquinass',fld:'vSDTMAQUINASS',grid:18,pic:''},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDSDTMAQUINASS',prop:'GridRC',grid:18},{av:'subGridsdtmaquinass_Rows',ctrl:'GRIDSDTMAQUINASS',prop:'Rows'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV12MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV11FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV10FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV14TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'sPrefix'},{av:'Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTMAQUINASSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTMAQUINASSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtmaquinass_Rows',ctrl:'GRIDSDTMAQUINASS',prop:'Rows'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv5',iparms:[]");
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
      wcpOAV15Emprcod = "" ;
      wcpOAV13MaqcodIni = "" ;
      wcpOAV12MaqcodFin = "" ;
      wcpOAV11FInicio = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV10FFin = GXutil.resetTime( GXutil.nullDate() );
      Gridsdtmaquinasspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV15Emprcod = "" ;
      AV13MaqcodIni = "" ;
      AV12MaqcodFin = "" ;
      AV11FInicio = GXutil.resetTime( GXutil.nullDate() );
      AV10FFin = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV5SDTMaquinass = new GXBaseCollection<app.SdtSDTMaquinas>(app.SdtSDTMaquinas.class, "SDTMaquinas", "TexplusNET", remoteHandle);
      Gridsdtmaquinass_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridsdtmaquinassContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtmaquinasspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGridsdtmaquinass_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV24Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV25Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_objcol_SdtSDTMaquinas5 = new GXBaseCollection<app.SdtSDTMaquinas>(app.SdtSDTMaquinas.class, "SDTMaquinas", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMaquinas6 = new GXBaseCollection[1] ;
      GridsdtmaquinassRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV15Emprcod = "" ;
      sCtrlAV13MaqcodIni = "" ;
      sCtrlAV12MaqcodFin = "" ;
      sCtrlAV11FInicio = "" ;
      sCtrlAV10FFin = "" ;
      sCtrlAV14TipoProduccion = "" ;
      subGridsdtmaquinass_Linesclass = "" ;
      ROClassString = "" ;
      GridsdtmaquinassColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdtmaquinass__maqcod_Enabled = 0 ;
      edtavSdtmaquinass__maqdsc_Enabled = 0 ;
      edtavSdtmaquinass__kilosproduccion_Enabled = 0 ;
      edtavSdtmaquinass__metrosproduccion_Enabled = 0 ;
   }

   private byte wcpOAV14TipoProduccion ;
   private byte GRIDSDTMAQUINASS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV14TipoProduccion ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridsdtmaquinass_Backcolorstyle ;
   private byte subGridsdtmaquinass_Backstyle ;
   private byte subGridsdtmaquinass_Titlebackstyle ;
   private byte subGridsdtmaquinass_Allowselection ;
   private byte subGridsdtmaquinass_Allowhovering ;
   private byte subGridsdtmaquinass_Allowcollapsing ;
   private byte subGridsdtmaquinass_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridsdtmaquinasspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_18 ;
   private int subGridsdtmaquinass_Rows ;
   private int nGXsfl_18_idx=1 ;
   private int Gridsdtmaquinasspaginationbar_Pagestoshow ;
   private int AV18GXV1 ;
   private int subGridsdtmaquinass_Islastpage ;
   private int edtavSdtmaquinass__maqcod_Enabled ;
   private int edtavSdtmaquinass__maqdsc_Enabled ;
   private int edtavSdtmaquinass__kilosproduccion_Enabled ;
   private int edtavSdtmaquinass__metrosproduccion_Enabled ;
   private int GRIDSDTMAQUINASS_nGridOutOfScope ;
   private int nGXsfl_18_fel_idx=1 ;
   private int AV7PageToGo ;
   private int idxLst ;
   private int subGridsdtmaquinass_Backcolor ;
   private int subGridsdtmaquinass_Allbackcolor ;
   private int subGridsdtmaquinass_Titlebackcolor ;
   private int subGridsdtmaquinass_Selectedindex ;
   private int subGridsdtmaquinass_Selectioncolor ;
   private int subGridsdtmaquinass_Hoveringcolor ;
   private long GRIDSDTMAQUINASS_nFirstRecordOnPage ;
   private long AV8GridSDTMaquinassCurrentPage ;
   private long AV9GridSDTMaquinassPageCount ;
   private long GRIDSDTMAQUINASS_nCurrentRecord ;
   private long GRIDSDTMAQUINASS_nRecordCount ;
   private String wcpOAV15Emprcod ;
   private String wcpOAV13MaqcodIni ;
   private String wcpOAV12MaqcodFin ;
   private String Gridsdtmaquinasspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV15Emprcod ;
   private String AV13MaqcodIni ;
   private String AV12MaqcodFin ;
   private String sGXsfl_18_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridsdtmaquinasspaginationbar_Class ;
   private String Gridsdtmaquinasspaginationbar_Pagingbuttonsposition ;
   private String Gridsdtmaquinasspaginationbar_Pagingcaptionposition ;
   private String Gridsdtmaquinasspaginationbar_Emptygridclass ;
   private String Gridsdtmaquinasspaginationbar_Rowsperpageoptions ;
   private String Gridsdtmaquinasspaginationbar_Previous ;
   private String Gridsdtmaquinasspaginationbar_Next ;
   private String Gridsdtmaquinasspaginationbar_Caption ;
   private String Gridsdtmaquinasspaginationbar_Emptygridcaption ;
   private String Gridsdtmaquinasspaginationbar_Rowsperpagecaption ;
   private String Gridsdtmaquinass_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divGridsdtmaquinasstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdtmaquinass_Internalname ;
   private String Gridsdtmaquinasspaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsdtmaquinass_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtmaquinass__maqcod_Internalname ;
   private String edtavSdtmaquinass__maqdsc_Internalname ;
   private String edtavSdtmaquinass__kilosproduccion_Internalname ;
   private String edtavSdtmaquinass__metrosproduccion_Internalname ;
   private String sGXsfl_18_fel_idx="0001" ;
   private String AV23Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV24Emprnom ;
   private String GXv_char3[] ;
   private String AV25Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV15Emprcod ;
   private String sCtrlAV13MaqcodIni ;
   private String sCtrlAV12MaqcodFin ;
   private String sCtrlAV11FInicio ;
   private String sCtrlAV10FFin ;
   private String sCtrlAV14TipoProduccion ;
   private String subGridsdtmaquinass_Class ;
   private String subGridsdtmaquinass_Linesclass ;
   private String ROClassString ;
   private String edtavSdtmaquinass__maqcod_Jsonclick ;
   private String edtavSdtmaquinass__maqdsc_Jsonclick ;
   private String edtavSdtmaquinass__kilosproduccion_Jsonclick ;
   private String edtavSdtmaquinass__metrosproduccion_Jsonclick ;
   private String subGridsdtmaquinass_Header ;
   private java.util.Date wcpOAV11FInicio ;
   private java.util.Date wcpOAV10FFin ;
   private java.util.Date AV11FInicio ;
   private java.util.Date AV10FFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gridsdtmaquinasspaginationbar_Showfirst ;
   private boolean Gridsdtmaquinasspaginationbar_Showprevious ;
   private boolean Gridsdtmaquinasspaginationbar_Shownext ;
   private boolean Gridsdtmaquinasspaginationbar_Showlast ;
   private boolean Gridsdtmaquinasspaginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_18_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV18 ;
   private com.genexus.webpanels.GXWebGrid GridsdtmaquinassContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtmaquinassRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtmaquinassColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridsdtmaquinasspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridsdtmaquinass_empowerer ;
   private GXBaseCollection<app.SdtSDTMaquinas> AV5SDTMaquinass ;
   private GXBaseCollection<app.SdtSDTMaquinas> GXt_objcol_SdtSDTMaquinas5 ;
   private GXBaseCollection<app.SdtSDTMaquinas> GXv_objcol_SdtSDTMaquinas6[] ;
}

