package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wctbllhipro_impl extends GXWebComponent
{
   public wctbllhipro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wctbllhipro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctbllhipro_impl.class ));
   }

   public wctbllhipro_impl( int remoteHandle ,
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
               AV10Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
               AV8MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqcodIni", AV8MaqcodIni);
               AV7MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqcodFin", AV7MaqcodFin);
               AV6FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FInicio", localUtil.ttoc( AV6FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV5FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5FFin", localUtil.ttoc( AV5FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV9TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdttbllhipros") == 0 )
            {
               gxnrgridsdttbllhipros_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdttbllhipros") == 0 )
            {
               gxgrgridsdttbllhipros_refresh_invoke( ) ;
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

   public void gxnrgridsdttbllhipros_newrow_invoke( )
   {
      nRC_GXsfl_25 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_25"))) ;
      nGXsfl_25_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_25_idx"))) ;
      sGXsfl_25_idx = httpContext.GetPar( "sGXsfl_25_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdttbllhipros_newrow( ) ;
      /* End function gxnrGridsdttbllhipros_newrow_invoke */
   }

   public void gxgrgridsdttbllhipros_refresh_invoke( )
   {
      subGridsdttbllhipros_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdttbllhipros_Rows"))) ;
      AV10Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
      AV7MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
      AV6FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
      AV5FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
      AV9TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdttbllhipros_refresh( subGridsdttbllhipros_Rows, AV10Emprcod, AV8MaqcodIni, AV7MaqcodFin, AV6FInicio, AV5FFin, AV9TipoProduccion, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdttbllhipros_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paDR2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCtbl Lhipro", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wctbllhipro", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV8MaqcodIni)),GXutil.URLEncode(GXutil.rtrim(AV7MaqcodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6FInicio)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV5FFin)),GXutil.URLEncode(GXutil.ltrimstr(AV9TipoProduccion,1,0))}, new String[] {"Emprcod","MaqcodIni","MaqcodFin","FInicio","FFin","TipoProduccion"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdttbllhipros", AV11SDTtblLhipros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdttbllhipros", AV11SDTtblLhipros);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_25", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_25, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTTBLLHIPROSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV14GridSDTtblLhiprosCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTTBLLHIPROSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV15GridSDTtblLhiprosPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Emprcod", GXutil.rtrim( wcpOAV10Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqcodIni", GXutil.rtrim( wcpOAV8MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7MaqcodFin", GXutil.rtrim( wcpOAV7MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6FInicio", localUtil.ttoc( wcpOAV6FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5FFin", localUtil.ttoc( wcpOAV5FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9TipoProduccion", GXutil.ltrim( localUtil.ntoc( wcpOAV9TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV10Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV8MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV7MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFINICIO", localUtil.ttoc( AV6FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFFIN", localUtil.ttoc( AV5FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV9TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTTBLLHIPROS", AV11SDTtblLhipros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTTBLLHIPROS", AV11SDTtblLhipros);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Class", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdttbllhiprospaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdttbllhiprospaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdttbllhiprospaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdttbllhiprospaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdttbllhiprospaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdttbllhiprospaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Next", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdttbllhiprospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormDR2( )
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
      return "WCtblLhipro" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCtbl Lhipro", "") ;
   }

   public void wbDR0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wctbllhipro");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         wb_table1_17_DR2( true) ;
      }
      else
      {
         wb_table1_17_DR2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_DR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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
      }
      if ( wbEnd == 25 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV18GXV1 = nGXsfl_25_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridsdttbllhiprosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdttbllhipros", GridsdttbllhiprosContainer, subGridsdttbllhipros_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdttbllhiprosContainerData", GridsdttbllhiprosContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdttbllhiprosContainerData"+"V", GridsdttbllhiprosContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdttbllhiprosContainerData"+"V"+"\" value='"+GridsdttbllhiprosContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startDR2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCtbl Lhipro", ""), (short)(0)) ;
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
            strupDR0( ) ;
         }
      }
   }

   public void wsDR2( )
   {
      startDR2( ) ;
      evtDR2( ) ;
   }

   public void evtDR2( )
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
                              strupDR0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTTBLLHIPROSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11DR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTTBLLHIPROSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12DR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDR0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "GRIDSDTTBLLHIPROS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDR0( ) ;
                           }
                           nGXsfl_25_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_252( ) ;
                           AV18GXV1 = (int)(nGXsfl_25_idx+GRIDSDTTBLLHIPROS_nFirstRecordOnPage) ;
                           if ( ( AV11SDTtblLhipros.size() >= AV18GXV1 ) && ( AV18GXV1 > 0 ) )
                           {
                              AV11SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)) );
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
                                       e13DR2 ();
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
                                       e14DR2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTTBLLHIPROS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e15DR2 ();
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
                                    strupDR0( ) ;
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

   public void weDR2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormDR2( ) ;
         }
      }
   }

   public void paDR2( )
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

   public void gxnrgridsdttbllhipros_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_252( ) ;
      while ( nGXsfl_25_idx <= nRC_GXsfl_25 )
      {
         sendrow_252( ) ;
         nGXsfl_25_idx = ((subGridsdttbllhipros_Islastpage==1)&&(nGXsfl_25_idx+1>subgridsdttbllhipros_fnc_recordsperpage( )) ? 1 : nGXsfl_25_idx+1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdttbllhiprosContainer)) ;
      /* End function gxnrGridsdttbllhipros_newrow */
   }

   public void gxgrgridsdttbllhipros_refresh( int subGridsdttbllhipros_Rows ,
                                              String AV10Emprcod ,
                                              String AV8MaqcodIni ,
                                              String AV7MaqcodFin ,
                                              java.util.Date AV6FInicio ,
                                              java.util.Date AV5FFin ,
                                              byte AV9TipoProduccion ,
                                              String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14DR2 ();
      GRIDSDTTBLLHIPROS_nCurrentRecord = 0 ;
      rfDR2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdttbllhipros_refresh */
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
      rfDR2( ) ;
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
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Enabled), 5, 0), !bGXsfl_25_Refreshing);
   }

   public void rfDR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdttbllhiprosContainer.ClearRows();
      }
      wbStart = (short)(25) ;
      /* Execute user event: Refresh */
      e14DR2 ();
      nGXsfl_25_idx = 1 ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_252( ) ;
      bGXsfl_25_Refreshing = true ;
      GridsdttbllhiprosContainer.AddObjectProperty("GridName", "Gridsdttbllhipros");
      GridsdttbllhiprosContainer.AddObjectProperty("CmpContext", sPrefix);
      GridsdttbllhiprosContainer.AddObjectProperty("InMasterPage", "false");
      GridsdttbllhiprosContainer.AddObjectProperty("Class", "GridWithPaginationBar GridWithBorderColor WorkWith");
      GridsdttbllhiprosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdttbllhiprosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdttbllhiprosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdttbllhiprosContainer.setPageSize( subgridsdttbllhipros_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_252( ) ;
         e15DR2 ();
         if ( ( GRIDSDTTBLLHIPROS_nCurrentRecord > 0 ) && ( GRIDSDTTBLLHIPROS_nGridOutOfScope == 0 ) && ( nGXsfl_25_idx == 1 ) )
         {
            GRIDSDTTBLLHIPROS_nCurrentRecord = 0 ;
            GRIDSDTTBLLHIPROS_nGridOutOfScope = 1 ;
            subgridsdttbllhipros_firstpage( ) ;
            e15DR2 ();
         }
         wbEnd = (short)(25) ;
         wbDR0( ) ;
      }
      bGXsfl_25_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDR2( )
   {
   }

   public int subgridsdttbllhipros_fnc_pagecount( )
   {
      GRIDSDTTBLLHIPROS_nRecordCount = subgridsdttbllhipros_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTTBLLHIPROS_nRecordCount) % (subgridsdttbllhipros_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTTBLLHIPROS_nRecordCount/ (double) (subgridsdttbllhipros_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTTBLLHIPROS_nRecordCount/ (double) (subgridsdttbllhipros_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdttbllhipros_fnc_recordcount( )
   {
      return AV11SDTtblLhipros.size() ;
   }

   public int subgridsdttbllhipros_fnc_recordsperpage( )
   {
      if ( subGridsdttbllhipros_Rows > 0 )
      {
         return subGridsdttbllhipros_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdttbllhipros_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTTBLLHIPROS_nFirstRecordOnPage/ (double) (subgridsdttbllhipros_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdttbllhipros_firstpage( )
   {
      GRIDSDTTBLLHIPROS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdttbllhipros_refresh( subGridsdttbllhipros_Rows, AV10Emprcod, AV8MaqcodIni, AV7MaqcodFin, AV6FInicio, AV5FFin, AV9TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdttbllhipros_nextpage( )
   {
      GRIDSDTTBLLHIPROS_nRecordCount = subgridsdttbllhipros_fnc_recordcount( ) ;
      if ( ( GRIDSDTTBLLHIPROS_nRecordCount >= subgridsdttbllhipros_fnc_recordsperpage( ) ) && ( GRIDSDTTBLLHIPROS_nEOF == 0 ) )
      {
         GRIDSDTTBLLHIPROS_nFirstRecordOnPage = (long)(GRIDSDTTBLLHIPROS_nFirstRecordOnPage+subgridsdttbllhipros_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdttbllhiprosContainer.AddObjectProperty("GRIDSDTTBLLHIPROS_nFirstRecordOnPage", GRIDSDTTBLLHIPROS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdttbllhipros_refresh( subGridsdttbllhipros_Rows, AV10Emprcod, AV8MaqcodIni, AV7MaqcodFin, AV6FInicio, AV5FFin, AV9TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTTBLLHIPROS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdttbllhipros_previouspage( )
   {
      if ( GRIDSDTTBLLHIPROS_nFirstRecordOnPage >= subgridsdttbllhipros_fnc_recordsperpage( ) )
      {
         GRIDSDTTBLLHIPROS_nFirstRecordOnPage = (long)(GRIDSDTTBLLHIPROS_nFirstRecordOnPage-subgridsdttbllhipros_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdttbllhipros_refresh( subGridsdttbllhipros_Rows, AV10Emprcod, AV8MaqcodIni, AV7MaqcodFin, AV6FInicio, AV5FFin, AV9TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdttbllhipros_lastpage( )
   {
      GRIDSDTTBLLHIPROS_nRecordCount = subgridsdttbllhipros_fnc_recordcount( ) ;
      if ( GRIDSDTTBLLHIPROS_nRecordCount > subgridsdttbllhipros_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTTBLLHIPROS_nRecordCount) % (subgridsdttbllhipros_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTTBLLHIPROS_nFirstRecordOnPage = (long)(GRIDSDTTBLLHIPROS_nRecordCount-subgridsdttbllhipros_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTTBLLHIPROS_nFirstRecordOnPage = (long)(GRIDSDTTBLLHIPROS_nRecordCount-((int)((GRIDSDTTBLLHIPROS_nRecordCount) % (subgridsdttbllhipros_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTTBLLHIPROS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdttbllhipros_refresh( subGridsdttbllhipros_Rows, AV10Emprcod, AV8MaqcodIni, AV7MaqcodFin, AV6FInicio, AV5FFin, AV9TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdttbllhipros_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTTBLLHIPROS_nFirstRecordOnPage = (long)(subgridsdttbllhipros_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTTBLLHIPROS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdttbllhipros_refresh( subGridsdttbllhipros_Rows, AV10Emprcod, AV8MaqcodIni, AV7MaqcodFin, AV6FInicio, AV5FFin, AV9TipoProduccion, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupDR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13DR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdttbllhipros"), AV11SDTtblLhipros);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTTBLLHIPROS"), AV11SDTtblLhipros);
         /* Read saved values. */
         nRC_GXsfl_25 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_25"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV14GridSDTtblLhiprosCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTTBLLHIPROSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV15GridSDTtblLhiprosPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTTBLLHIPROSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV10Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV10Emprcod") ;
         wcpOAV8MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV8MaqcodIni") ;
         wcpOAV7MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV7MaqcodFin") ;
         wcpOAV6FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6FInicio"), 0) ;
         wcpOAV5FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV5FFin"), 0) ;
         wcpOAV9TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDSDTTBLLHIPROS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTTBLLHIPROS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdttbllhipros_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridsdttbllhiprospaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Class") ;
         Gridsdttbllhiprospaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Showfirst")) ;
         Gridsdttbllhiprospaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Showprevious")) ;
         Gridsdttbllhiprospaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Shownext")) ;
         Gridsdttbllhiprospaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Showlast")) ;
         Gridsdttbllhiprospaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdttbllhiprospaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdttbllhiprospaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdttbllhiprospaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Emptygridclass") ;
         Gridsdttbllhiprospaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdttbllhiprospaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdttbllhiprospaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Previous") ;
         Gridsdttbllhiprospaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Next") ;
         Gridsdttbllhiprospaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Caption") ;
         Gridsdttbllhiprospaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Emptygridcaption") ;
         Gridsdttbllhiprospaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Gridsdttbllhiprospaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Selectedpage") ;
         Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_25 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_25"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_25_fel_idx = 0 ;
         while ( nGXsfl_25_fel_idx < nRC_GXsfl_25 )
         {
            nGXsfl_25_fel_idx = ((subGridsdttbllhipros_Islastpage==1)&&(nGXsfl_25_fel_idx+1>subgridsdttbllhipros_fnc_recordsperpage( )) ? 1 : nGXsfl_25_fel_idx+1) ;
            sGXsfl_25_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_252( ) ;
            AV18GXV1 = (int)(nGXsfl_25_fel_idx+GRIDSDTTBLLHIPROS_nFirstRecordOnPage) ;
            if ( ( AV11SDTtblLhipros.size() >= AV18GXV1 ) && ( AV18GXV1 > 0 ) )
            {
               AV11SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)) );
            }
         }
         if ( nGXsfl_25_fel_idx == 0 )
         {
            nGXsfl_25_idx = 1 ;
            sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_252( ) ;
         }
         nGXsfl_25_fel_idx = 1 ;
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
      e13DR2 ();
      if (returnInSub) return;
   }

   public void e13DR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      subGridsdttbllhipros_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue = subGridsdttbllhipros_Rows ;
      ucGridsdttbllhiprospaginationbar.sendProperty(context, sPrefix, false, Gridsdttbllhiprospaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e14DR2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTtblLhipro1 = AV11SDTtblLhipros ;
      GXv_objcol_SdtSDTtblLhipro2[0] = GXt_objcol_SdtSDTtblLhipro1 ;
      new app.dptbllhipro(remoteHandle, context).execute( AV10Emprcod, AV8MaqcodIni, AV7MaqcodFin, AV6FInicio, AV5FFin, AV9TipoProduccion, GXv_objcol_SdtSDTtblLhipro2) ;
      GXt_objcol_SdtSDTtblLhipro1 = GXv_objcol_SdtSDTtblLhipro2[0] ;
      AV11SDTtblLhipros = GXt_objcol_SdtSDTtblLhipro1 ;
      gx_BV25 = true ;
      AV14GridSDTtblLhiprosCurrentPage = subgridsdttbllhipros_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14GridSDTtblLhiprosCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14GridSDTtblLhiprosCurrentPage), 10, 0));
      AV15GridSDTtblLhiprosPageCount = subgridsdttbllhipros_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GridSDTtblLhiprosPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridSDTtblLhiprosPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11SDTtblLhipros", AV11SDTtblLhipros);
   }

   private void e15DR2( )
   {
      /* Gridsdttbllhipros_Load Routine */
      returnInSub = false ;
      AV18GXV1 = 1 ;
      while ( AV18GXV1 <= AV11SDTtblLhipros.size() )
      {
         AV11SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(25) ;
         }
         if ( ( subGridsdttbllhipros_Islastpage == 1 ) || ( subGridsdttbllhipros_Rows == 0 ) || ( ( GRIDSDTTBLLHIPROS_nCurrentRecord >= GRIDSDTTBLLHIPROS_nFirstRecordOnPage ) && ( GRIDSDTTBLLHIPROS_nCurrentRecord < GRIDSDTTBLLHIPROS_nFirstRecordOnPage + subgridsdttbllhipros_fnc_recordsperpage( ) ) ) )
         {
            sendrow_252( ) ;
            GRIDSDTTBLLHIPROS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTTBLLHIPROS_nCurrentRecord + 1 >= subgridsdttbllhipros_fnc_recordcount( ) )
            {
               GRIDSDTTBLLHIPROS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTTBLLHIPROS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTTBLLHIPROS_nCurrentRecord = (long)(GRIDSDTTBLLHIPROS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_25_Refreshing )
         {
            httpContext.doAjaxLoad(25, GridsdttbllhiprosRow);
         }
         AV18GXV1 = (int)(AV18GXV1+1) ;
      }
   }

   public void e11DR2( )
   {
      /* Gridsdttbllhiprospaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdttbllhiprospaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdttbllhipros_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdttbllhiprospaginationbar_Selectedpage, "Next") == 0 )
      {
         AV13PageToGo = subgridsdttbllhipros_fnc_currentpage( ) ;
         AV13PageToGo = (int)(AV13PageToGo+1) ;
         subgridsdttbllhipros_gotopage( AV13PageToGo) ;
      }
      else
      {
         AV13PageToGo = (int)(GXutil.lval( Gridsdttbllhiprospaginationbar_Selectedpage)) ;
         subgridsdttbllhipros_gotopage( AV13PageToGo) ;
      }
   }

   public void e12DR2( )
   {
      /* Gridsdttbllhiprospaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdttbllhipros_Rows = Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTTBLLHIPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdttbllhipros_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void wb_table1_17_DR2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdttbllhiprostablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdttbllhiprosContainer.SetWrapped(nGXWrapped);
         startgridcontrol25( ) ;
      }
      if ( wbEnd == 25 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_25 = (int)(nGXsfl_25_idx-1) ;
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV18GXV1 = nGXsfl_25_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridsdttbllhiprosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdttbllhipros", GridsdttbllhiprosContainer, subGridsdttbllhipros_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdttbllhiprosContainerData", GridsdttbllhiprosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdttbllhiprosContainerData"+"V", GridsdttbllhiprosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdttbllhiprosContainerData"+"V"+"\" value='"+GridsdttbllhiprosContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdttbllhiprospaginationbar.setProperty("Class", Gridsdttbllhiprospaginationbar_Class);
         ucGridsdttbllhiprospaginationbar.setProperty("ShowFirst", Gridsdttbllhiprospaginationbar_Showfirst);
         ucGridsdttbllhiprospaginationbar.setProperty("ShowPrevious", Gridsdttbllhiprospaginationbar_Showprevious);
         ucGridsdttbllhiprospaginationbar.setProperty("ShowNext", Gridsdttbllhiprospaginationbar_Shownext);
         ucGridsdttbllhiprospaginationbar.setProperty("ShowLast", Gridsdttbllhiprospaginationbar_Showlast);
         ucGridsdttbllhiprospaginationbar.setProperty("PagesToShow", Gridsdttbllhiprospaginationbar_Pagestoshow);
         ucGridsdttbllhiprospaginationbar.setProperty("PagingButtonsPosition", Gridsdttbllhiprospaginationbar_Pagingbuttonsposition);
         ucGridsdttbllhiprospaginationbar.setProperty("PagingCaptionPosition", Gridsdttbllhiprospaginationbar_Pagingcaptionposition);
         ucGridsdttbllhiprospaginationbar.setProperty("EmptyGridClass", Gridsdttbllhiprospaginationbar_Emptygridclass);
         ucGridsdttbllhiprospaginationbar.setProperty("RowsPerPageSelector", Gridsdttbllhiprospaginationbar_Rowsperpageselector);
         ucGridsdttbllhiprospaginationbar.setProperty("RowsPerPageOptions", Gridsdttbllhiprospaginationbar_Rowsperpageoptions);
         ucGridsdttbllhiprospaginationbar.setProperty("Previous", Gridsdttbllhiprospaginationbar_Previous);
         ucGridsdttbllhiprospaginationbar.setProperty("Next", Gridsdttbllhiprospaginationbar_Next);
         ucGridsdttbllhiprospaginationbar.setProperty("Caption", Gridsdttbllhiprospaginationbar_Caption);
         ucGridsdttbllhiprospaginationbar.setProperty("EmptyGridCaption", Gridsdttbllhiprospaginationbar_Emptygridcaption);
         ucGridsdttbllhiprospaginationbar.setProperty("RowsPerPageCaption", Gridsdttbllhiprospaginationbar_Rowsperpagecaption);
         ucGridsdttbllhiprospaginationbar.setProperty("CurrentPage", AV14GridSDTtblLhiprosCurrentPage);
         ucGridsdttbllhiprospaginationbar.setProperty("PageCount", AV15GridSDTtblLhiprosPageCount);
         ucGridsdttbllhiprospaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdttbllhiprospaginationbar_Internalname, sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_DR2e( true) ;
      }
      else
      {
         wb_table1_17_DR2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV10Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
      AV8MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqcodIni", AV8MaqcodIni);
      AV7MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqcodFin", AV7MaqcodFin);
      AV6FInicio = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FInicio", localUtil.ttoc( AV6FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV5FFin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5FFin", localUtil.ttoc( AV5FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV9TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
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
      paDR2( ) ;
      wsDR2( ) ;
      weDR2( ) ;
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
      sCtrlAV10Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV6FInicio = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV5FFin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV9TipoProduccion = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paDR2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wctbllhipro", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paDR2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV10Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
         AV8MaqcodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqcodIni", AV8MaqcodIni);
         AV7MaqcodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqcodFin", AV7MaqcodFin);
         AV6FInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FInicio", localUtil.ttoc( AV6FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV5FFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5FFin", localUtil.ttoc( AV5FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV9TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
      }
      wcpOAV10Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV10Emprcod") ;
      wcpOAV8MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV8MaqcodIni") ;
      wcpOAV7MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV7MaqcodFin") ;
      wcpOAV6FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6FInicio"), 0) ;
      wcpOAV5FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV5FFin"), 0) ;
      wcpOAV9TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV10Emprcod, wcpOAV10Emprcod) != 0 ) || ( GXutil.strcmp(AV8MaqcodIni, wcpOAV8MaqcodIni) != 0 ) || ( GXutil.strcmp(AV7MaqcodFin, wcpOAV7MaqcodFin) != 0 ) || !( GXutil.dateCompare(AV6FInicio, wcpOAV6FInicio) ) || !( GXutil.dateCompare(AV5FFin, wcpOAV5FFin) ) || ( AV9TipoProduccion != wcpOAV9TipoProduccion ) ) )
      {
         setjustcreated();
      }
      wcpOAV10Emprcod = AV10Emprcod ;
      wcpOAV8MaqcodIni = AV8MaqcodIni ;
      wcpOAV7MaqcodFin = AV7MaqcodFin ;
      wcpOAV6FInicio = AV6FInicio ;
      wcpOAV5FFin = AV5FFin ;
      wcpOAV9TipoProduccion = AV9TipoProduccion ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV10Emprcod = httpContext.cgiGet( sPrefix+"AV10Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV10Emprcod) > 0 )
      {
         AV10Emprcod = httpContext.cgiGet( sCtrlAV10Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
      }
      else
      {
         AV10Emprcod = httpContext.cgiGet( sPrefix+"AV10Emprcod_PARM") ;
      }
      sCtrlAV8MaqcodIni = httpContext.cgiGet( sPrefix+"AV8MaqcodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqcodIni) > 0 )
      {
         AV8MaqcodIni = httpContext.cgiGet( sCtrlAV8MaqcodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqcodIni", AV8MaqcodIni);
      }
      else
      {
         AV8MaqcodIni = httpContext.cgiGet( sPrefix+"AV8MaqcodIni_PARM") ;
      }
      sCtrlAV7MaqcodFin = httpContext.cgiGet( sPrefix+"AV7MaqcodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV7MaqcodFin) > 0 )
      {
         AV7MaqcodFin = httpContext.cgiGet( sCtrlAV7MaqcodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqcodFin", AV7MaqcodFin);
      }
      else
      {
         AV7MaqcodFin = httpContext.cgiGet( sPrefix+"AV7MaqcodFin_PARM") ;
      }
      sCtrlAV6FInicio = httpContext.cgiGet( sPrefix+"AV6FInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV6FInicio) > 0 )
      {
         AV6FInicio = localUtil.ctot( httpContext.cgiGet( sCtrlAV6FInicio), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FInicio", localUtil.ttoc( AV6FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV6FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV6FInicio_PARM"), 0) ;
      }
      sCtrlAV5FFin = httpContext.cgiGet( sPrefix+"AV5FFin_CTRL") ;
      if ( GXutil.len( sCtrlAV5FFin) > 0 )
      {
         AV5FFin = localUtil.ctot( httpContext.cgiGet( sCtrlAV5FFin), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5FFin", localUtil.ttoc( AV5FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV5FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV5FFin_PARM"), 0) ;
      }
      sCtrlAV9TipoProduccion = httpContext.cgiGet( sPrefix+"AV9TipoProduccion_CTRL") ;
      if ( GXutil.len( sCtrlAV9TipoProduccion) > 0 )
      {
         AV9TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9TipoProduccion), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
      }
      else
      {
         AV9TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9TipoProduccion_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paDR2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsDR2( ) ;
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
      wsDR2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Emprcod_PARM", GXutil.rtrim( AV10Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Emprcod_CTRL", GXutil.rtrim( sCtrlAV10Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqcodIni_PARM", GXutil.rtrim( AV8MaqcodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqcodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqcodIni_CTRL", GXutil.rtrim( sCtrlAV8MaqcodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqcodFin_PARM", GXutil.rtrim( AV7MaqcodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7MaqcodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqcodFin_CTRL", GXutil.rtrim( sCtrlAV7MaqcodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6FInicio_PARM", localUtil.ttoc( AV6FInicio, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6FInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6FInicio_CTRL", GXutil.rtrim( sCtrlAV6FInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5FFin_PARM", localUtil.ttoc( AV5FFin, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5FFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5FFin_CTRL", GXutil.rtrim( sCtrlAV5FFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9TipoProduccion_PARM", GXutil.ltrim( localUtil.ntoc( AV9TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9TipoProduccion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9TipoProduccion_CTRL", GXutil.rtrim( sCtrlAV9TipoProduccion));
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
      weDR2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026519934872", true, true);
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
         httpContext.AddJavascriptSource("wctbllhipro.js", "?2026519934872", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_252( )
   {
      edtavSdttbllhipros__maqcod_Internalname = sPrefix+"SDTTBLLHIPROS__MAQCOD_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__maqdsc_Internalname = sPrefix+"SDTTBLLHIPROS__MAQDSC_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprodti_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTI_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprodtf_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTF_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprof_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROF_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprokgr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROKGR_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hispromtr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROMTR_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__barnhdr_Internalname = sPrefix+"SDTTBLLHIPROS__BARNHDR_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprolot_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROLOT_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprotur_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTUR_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__fase_Internalname = sPrefix+"SDTTBLLHIPROS__FASE_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__fasdsc_Internalname = sPrefix+"SDTTBLLHIPROS__FASDSC_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprotr2_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTR2_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__parcod_Internalname = sPrefix+"SDTTBLLHIPROS__PARCOD_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__parcodnom_Internalname = sPrefix+"SDTTBLLHIPROS__PARCODNOM_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__barser_Internalname = sPrefix+"SDTTBLLHIPROS__BARSER_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__barserdsc_Internalname = sPrefix+"SDTTBLLHIPROS__BARSERDSC_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__hisprotip_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTIP_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__tipartdsc_Internalname = sPrefix+"SDTTBLLHIPROS__TIPARTDSC_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__barcolnom_Internalname = sPrefix+"SDTTBLLHIPROS__BARCOLNOM_"+sGXsfl_25_idx ;
      edtavSdttbllhipros__barnomcli_Internalname = sPrefix+"SDTTBLLHIPROS__BARNOMCLI_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_252( )
   {
      edtavSdttbllhipros__maqcod_Internalname = sPrefix+"SDTTBLLHIPROS__MAQCOD_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__maqdsc_Internalname = sPrefix+"SDTTBLLHIPROS__MAQDSC_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprodti_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTI_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprodtf_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTF_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprof_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROF_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprokgr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROKGR_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hispromtr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROMTR_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__barnhdr_Internalname = sPrefix+"SDTTBLLHIPROS__BARNHDR_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprolot_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROLOT_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprotur_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTUR_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__fase_Internalname = sPrefix+"SDTTBLLHIPROS__FASE_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__fasdsc_Internalname = sPrefix+"SDTTBLLHIPROS__FASDSC_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprotr2_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTR2_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__parcod_Internalname = sPrefix+"SDTTBLLHIPROS__PARCOD_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__parcodnom_Internalname = sPrefix+"SDTTBLLHIPROS__PARCODNOM_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__barser_Internalname = sPrefix+"SDTTBLLHIPROS__BARSER_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__barserdsc_Internalname = sPrefix+"SDTTBLLHIPROS__BARSERDSC_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__hisprotip_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTIP_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__tipartdsc_Internalname = sPrefix+"SDTTBLLHIPROS__TIPARTDSC_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__barcolnom_Internalname = sPrefix+"SDTTBLLHIPROS__BARCOLNOM_"+sGXsfl_25_fel_idx ;
      edtavSdttbllhipros__barnomcli_Internalname = sPrefix+"SDTTBLLHIPROS__BARNOMCLI_"+sGXsfl_25_fel_idx ;
   }

   public void sendrow_252( )
   {
      subsflControlProps_252( ) ;
      wbDR0( ) ;
      if ( ( subGridsdttbllhipros_Rows * 1 == 0 ) || ( nGXsfl_25_idx <= subgridsdttbllhipros_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdttbllhiprosRow = GXWebRow.GetNew(context,GridsdttbllhiprosContainer) ;
         if ( subGridsdttbllhipros_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdttbllhipros_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdttbllhipros_Class, "") != 0 )
            {
               subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"Odd" ;
            }
         }
         else if ( subGridsdttbllhipros_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdttbllhipros_Backstyle = (byte)(0) ;
            subGridsdttbllhipros_Backcolor = subGridsdttbllhipros_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdttbllhipros_Class, "") != 0 )
            {
               subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"Uniform" ;
            }
         }
         else if ( subGridsdttbllhipros_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdttbllhipros_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdttbllhipros_Class, "") != 0 )
            {
               subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"Odd" ;
            }
            subGridsdttbllhipros_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdttbllhipros_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdttbllhipros_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_25_idx) % (2))) == 0 )
            {
               subGridsdttbllhipros_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdttbllhipros_Class, "") != 0 )
               {
                  subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"Even" ;
               }
            }
            else
            {
               subGridsdttbllhipros_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdttbllhipros_Class, "") != 0 )
               {
                  subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"Odd" ;
               }
            }
         }
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridWithBorderColor WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_25_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__maqcod_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__maqdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprodti_Internalname,localUtil.ttoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodti(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodti(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprodti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprodti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprodtf_Internalname,localUtil.ttoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodtf(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprof_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprof()),GXutil.rtrim( localUtil.format( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprof(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprof_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprof_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprokgr_Enabled!=0) ? localUtil.format( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hispromtr_Enabled!=0) ? localUtil.format( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barnhdr_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Barnhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprolot_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprolot()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprolot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprolot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotur_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprotur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__fase_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Fase()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__fase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__fase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__fasdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotr2_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotr2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprotr2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__parcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Parcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__parcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Parcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Parcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__parcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__parcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__parcodnom_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Parcodnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__parcodnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__parcodnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barser_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barserdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Barserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotip_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__hisprotip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__tipartdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Tipartdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barcolnom_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdttbllhiprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barnomcli_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV11SDTtblLhipros.elementAt(-1+AV18GXV1)).getgxTv_SdtSDTtblLhipro_Barnomcli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdttbllhipros__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesDR2( ) ;
         GridsdttbllhiprosContainer.AddRow(GridsdttbllhiprosRow);
         nGXsfl_25_idx = ((subGridsdttbllhipros_Islastpage==1)&&(nGXsfl_25_idx+1>subgridsdttbllhipros_fnc_recordsperpage( )) ? 1 : nGXsfl_25_idx+1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      /* End function sendrow_252 */
   }

   public void startgridcontrol25( )
   {
      if ( GridsdttbllhiprosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridsdttbllhiprosContainer"+"DivS\" data-gxgridid=\"25\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdttbllhipros_Internalname, subGridsdttbllhipros_Internalname, "", "GridWithPaginationBar GridWithBorderColor WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdttbllhipros_Backcolorstyle == 0 )
         {
            subGridsdttbllhipros_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdttbllhipros_Class) > 0 )
            {
               subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"Title" ;
            }
         }
         else
         {
            subGridsdttbllhipros_Titlebackstyle = (byte)(1) ;
            if ( subGridsdttbllhipros_Backcolorstyle == 1 )
            {
               subGridsdttbllhipros_Titlebackcolor = subGridsdttbllhipros_Allbackcolor ;
               if ( GXutil.len( subGridsdttbllhipros_Class) > 0 )
               {
                  subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdttbllhipros_Class) > 0 )
               {
                  subGridsdttbllhipros_Linesclass = subGridsdttbllhipros_Class+"Title" ;
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
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo(m)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdttbllhiprosContainer.AddObjectProperty("GridName", "Gridsdttbllhipros");
      }
      else
      {
         GridsdttbllhiprosContainer.AddObjectProperty("GridName", "Gridsdttbllhipros");
         GridsdttbllhiprosContainer.AddObjectProperty("Header", subGridsdttbllhipros_Header);
         GridsdttbllhiprosContainer.AddObjectProperty("Class", "GridWithPaginationBar GridWithBorderColor WorkWith");
         GridsdttbllhiprosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("CmpContext", sPrefix);
         GridsdttbllhiprosContainer.AddObjectProperty("InMasterPage", "false");
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprof_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprolot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotur_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotr2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcodnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotip_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdttbllhiprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddColumnProperties(GridsdttbllhiprosColumn);
         GridsdttbllhiprosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdttbllhiprosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdttbllhipros_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavSdttbllhipros__maqcod_Internalname = sPrefix+"SDTTBLLHIPROS__MAQCOD" ;
      edtavSdttbllhipros__maqdsc_Internalname = sPrefix+"SDTTBLLHIPROS__MAQDSC" ;
      edtavSdttbllhipros__hisprodti_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTI" ;
      edtavSdttbllhipros__hisprodtf_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTF" ;
      edtavSdttbllhipros__hisprof_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROF" ;
      edtavSdttbllhipros__hisprokgr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROKGR" ;
      edtavSdttbllhipros__hispromtr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROMTR" ;
      edtavSdttbllhipros__barnhdr_Internalname = sPrefix+"SDTTBLLHIPROS__BARNHDR" ;
      edtavSdttbllhipros__hisprolot_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROLOT" ;
      edtavSdttbllhipros__hisprotur_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTUR" ;
      edtavSdttbllhipros__fase_Internalname = sPrefix+"SDTTBLLHIPROS__FASE" ;
      edtavSdttbllhipros__fasdsc_Internalname = sPrefix+"SDTTBLLHIPROS__FASDSC" ;
      edtavSdttbllhipros__hisprotr2_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTR2" ;
      edtavSdttbllhipros__parcod_Internalname = sPrefix+"SDTTBLLHIPROS__PARCOD" ;
      edtavSdttbllhipros__parcodnom_Internalname = sPrefix+"SDTTBLLHIPROS__PARCODNOM" ;
      edtavSdttbllhipros__barser_Internalname = sPrefix+"SDTTBLLHIPROS__BARSER" ;
      edtavSdttbllhipros__barserdsc_Internalname = sPrefix+"SDTTBLLHIPROS__BARSERDSC" ;
      edtavSdttbllhipros__hisprotip_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTIP" ;
      edtavSdttbllhipros__tipartdsc_Internalname = sPrefix+"SDTTBLLHIPROS__TIPARTDSC" ;
      edtavSdttbllhipros__barcolnom_Internalname = sPrefix+"SDTTBLLHIPROS__BARCOLNOM" ;
      edtavSdttbllhipros__barnomcli_Internalname = sPrefix+"SDTTBLLHIPROS__BARNOMCLI" ;
      Gridsdttbllhiprospaginationbar_Internalname = sPrefix+"GRIDSDTTBLLHIPROSPAGINATIONBAR" ;
      divGridsdttbllhiprostablewithpaginationbar_Internalname = sPrefix+"GRIDSDTTBLLHIPROSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      tblUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridsdttbllhipros_Internalname = sPrefix+"GRIDSDTTBLLHIPROS" ;
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
      subGridsdttbllhipros_Allowcollapsing = (byte)(0) ;
      subGridsdttbllhipros_Allowselection = (byte)(0) ;
      subGridsdttbllhipros_Header = "" ;
      edtavSdttbllhipros__barnomcli_Jsonclick = "" ;
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      edtavSdttbllhipros__barcolnom_Jsonclick = "" ;
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      edtavSdttbllhipros__tipartdsc_Jsonclick = "" ;
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      edtavSdttbllhipros__hisprotip_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      edtavSdttbllhipros__barserdsc_Jsonclick = "" ;
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      edtavSdttbllhipros__barser_Jsonclick = "" ;
      edtavSdttbllhipros__barser_Enabled = 0 ;
      edtavSdttbllhipros__parcodnom_Jsonclick = "" ;
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      edtavSdttbllhipros__parcod_Jsonclick = "" ;
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      edtavSdttbllhipros__hisprotr2_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      edtavSdttbllhipros__fasdsc_Jsonclick = "" ;
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      edtavSdttbllhipros__fase_Jsonclick = "" ;
      edtavSdttbllhipros__fase_Enabled = 0 ;
      edtavSdttbllhipros__hisprotur_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      edtavSdttbllhipros__hisprolot_Jsonclick = "" ;
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      edtavSdttbllhipros__barnhdr_Jsonclick = "" ;
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      edtavSdttbllhipros__hispromtr_Jsonclick = "" ;
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      edtavSdttbllhipros__hisprokgr_Jsonclick = "" ;
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      edtavSdttbllhipros__hisprof_Jsonclick = "" ;
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      edtavSdttbllhipros__hisprodtf_Jsonclick = "" ;
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      edtavSdttbllhipros__hisprodti_Jsonclick = "" ;
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      edtavSdttbllhipros__maqdsc_Jsonclick = "" ;
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      edtavSdttbllhipros__maqcod_Jsonclick = "" ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      subGridsdttbllhipros_Class = "GridWithPaginationBar GridWithBorderColor WorkWith" ;
      subGridsdttbllhipros_Backcolorstyle = (byte)(0) ;
      edtavSdttbllhipros__barnomcli_Enabled = -1 ;
      edtavSdttbllhipros__barcolnom_Enabled = -1 ;
      edtavSdttbllhipros__tipartdsc_Enabled = -1 ;
      edtavSdttbllhipros__hisprotip_Enabled = -1 ;
      edtavSdttbllhipros__barserdsc_Enabled = -1 ;
      edtavSdttbllhipros__barser_Enabled = -1 ;
      edtavSdttbllhipros__parcodnom_Enabled = -1 ;
      edtavSdttbllhipros__parcod_Enabled = -1 ;
      edtavSdttbllhipros__hisprotr2_Enabled = -1 ;
      edtavSdttbllhipros__fasdsc_Enabled = -1 ;
      edtavSdttbllhipros__fase_Enabled = -1 ;
      edtavSdttbllhipros__hisprotur_Enabled = -1 ;
      edtavSdttbllhipros__hisprolot_Enabled = -1 ;
      edtavSdttbllhipros__barnhdr_Enabled = -1 ;
      edtavSdttbllhipros__hispromtr_Enabled = -1 ;
      edtavSdttbllhipros__hisprokgr_Enabled = -1 ;
      edtavSdttbllhipros__hisprof_Enabled = -1 ;
      edtavSdttbllhipros__hisprodtf_Enabled = -1 ;
      edtavSdttbllhipros__hisprodti_Enabled = -1 ;
      edtavSdttbllhipros__maqdsc_Enabled = -1 ;
      edtavSdttbllhipros__maqcod_Enabled = -1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelWithBorder_BaseColor" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Gridsdttbllhiprospaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdttbllhiprospaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdttbllhiprospaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdttbllhiprospaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdttbllhiprospaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdttbllhiprospaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdttbllhiprospaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdttbllhiprospaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdttbllhiprospaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdttbllhiprospaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdttbllhiprospaginationbar_Pagestoshow = 5 ;
      Gridsdttbllhiprospaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdttbllhiprospaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdttbllhiprospaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdttbllhiprospaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdttbllhiprospaginationbar_Class = "PaginationBar" ;
      subGridsdttbllhipros_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTTBLLHIPROS_nFirstRecordOnPage'},{av:'GRIDSDTTBLLHIPROS_nEOF'},{av:'AV11SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:25,pic:''},{av:'nGXsfl_25_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:25},{av:'nRC_GXsfl_25',ctrl:'GRIDSDTTBLLHIPROS',prop:'GridRC',grid:25},{av:'subGridsdttbllhipros_Rows',ctrl:'GRIDSDTTBLLHIPROS',prop:'Rows'},{av:'sPrefix'},{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV7MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV6FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV5FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV9TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV11SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:25,pic:''},{av:'nGXsfl_25_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:25},{av:'GRIDSDTTBLLHIPROS_nFirstRecordOnPage'},{av:'nRC_GXsfl_25',ctrl:'GRIDSDTTBLLHIPROS',prop:'GridRC',grid:25},{av:'AV14GridSDTtblLhiprosCurrentPage',fld:'vGRIDSDTTBLLHIPROSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridSDTtblLhiprosPageCount',fld:'vGRIDSDTTBLLHIPROSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDTTBLLHIPROS.LOAD","{handler:'e15DR2',iparms:[]");
      setEventMetadata("GRIDSDTTBLLHIPROS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTTBLLHIPROSPAGINATIONBAR.CHANGEPAGE","{handler:'e11DR2',iparms:[{av:'GRIDSDTTBLLHIPROS_nFirstRecordOnPage'},{av:'GRIDSDTTBLLHIPROS_nEOF'},{av:'AV11SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:25,pic:''},{av:'nGXsfl_25_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:25},{av:'nRC_GXsfl_25',ctrl:'GRIDSDTTBLLHIPROS',prop:'GridRC',grid:25},{av:'subGridsdttbllhipros_Rows',ctrl:'GRIDSDTTBLLHIPROS',prop:'Rows'},{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV7MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV6FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV5FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV9TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'sPrefix'},{av:'Gridsdttbllhiprospaginationbar_Selectedpage',ctrl:'GRIDSDTTBLLHIPROSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTTBLLHIPROSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTTBLLHIPROSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12DR2',iparms:[{av:'GRIDSDTTBLLHIPROS_nFirstRecordOnPage'},{av:'GRIDSDTTBLLHIPROS_nEOF'},{av:'AV11SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:25,pic:''},{av:'nGXsfl_25_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:25},{av:'nRC_GXsfl_25',ctrl:'GRIDSDTTBLLHIPROS',prop:'GridRC',grid:25},{av:'subGridsdttbllhipros_Rows',ctrl:'GRIDSDTTBLLHIPROS',prop:'Rows'},{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV7MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV6FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV5FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV9TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'sPrefix'},{av:'Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTTBLLHIPROSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTTBLLHIPROSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdttbllhipros_Rows',ctrl:'GRIDSDTTBLLHIPROS',prop:'Rows'}]}");
      setEventMetadata("VALIDV_GXV6","{handler:'validv_Gxv6',iparms:[]");
      setEventMetadata("VALIDV_GXV6",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv22',iparms:[]");
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
      wcpOAV10Emprcod = "" ;
      wcpOAV8MaqcodIni = "" ;
      wcpOAV7MaqcodFin = "" ;
      wcpOAV6FInicio = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV5FFin = GXutil.resetTime( GXutil.nullDate() );
      Gridsdttbllhiprospaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV10Emprcod = "" ;
      AV8MaqcodIni = "" ;
      AV7MaqcodFin = "" ;
      AV6FInicio = GXutil.resetTime( GXutil.nullDate() );
      AV5FFin = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV11SDTtblLhipros = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      GridsdttbllhiprosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      ucGridsdttbllhiprospaginationbar = new com.genexus.webpanels.GXUserControl();
      GXt_objcol_SdtSDTtblLhipro1 = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTtblLhipro2 = new GXBaseCollection[1] ;
      GridsdttbllhiprosRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV10Emprcod = "" ;
      sCtrlAV8MaqcodIni = "" ;
      sCtrlAV7MaqcodFin = "" ;
      sCtrlAV6FInicio = "" ;
      sCtrlAV5FFin = "" ;
      sCtrlAV9TipoProduccion = "" ;
      subGridsdttbllhipros_Linesclass = "" ;
      ROClassString = "" ;
      GridsdttbllhiprosColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      edtavSdttbllhipros__fase_Enabled = 0 ;
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      edtavSdttbllhipros__barser_Enabled = 0 ;
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
   }

   private byte wcpOAV9TipoProduccion ;
   private byte GRIDSDTTBLLHIPROS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV9TipoProduccion ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridsdttbllhipros_Backcolorstyle ;
   private byte subGridsdttbllhipros_Backstyle ;
   private byte subGridsdttbllhipros_Titlebackstyle ;
   private byte subGridsdttbllhipros_Allowselection ;
   private byte subGridsdttbllhipros_Allowhovering ;
   private byte subGridsdttbllhipros_Allowcollapsing ;
   private byte subGridsdttbllhipros_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridsdttbllhiprospaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_25 ;
   private int subGridsdttbllhipros_Rows ;
   private int nGXsfl_25_idx=1 ;
   private int Gridsdttbllhiprospaginationbar_Pagestoshow ;
   private int AV18GXV1 ;
   private int subGridsdttbllhipros_Islastpage ;
   private int edtavSdttbllhipros__maqcod_Enabled ;
   private int edtavSdttbllhipros__maqdsc_Enabled ;
   private int edtavSdttbllhipros__hisprodti_Enabled ;
   private int edtavSdttbllhipros__hisprodtf_Enabled ;
   private int edtavSdttbllhipros__hisprof_Enabled ;
   private int edtavSdttbllhipros__hisprokgr_Enabled ;
   private int edtavSdttbllhipros__hispromtr_Enabled ;
   private int edtavSdttbllhipros__barnhdr_Enabled ;
   private int edtavSdttbllhipros__hisprolot_Enabled ;
   private int edtavSdttbllhipros__hisprotur_Enabled ;
   private int edtavSdttbllhipros__fase_Enabled ;
   private int edtavSdttbllhipros__fasdsc_Enabled ;
   private int edtavSdttbllhipros__hisprotr2_Enabled ;
   private int edtavSdttbllhipros__parcod_Enabled ;
   private int edtavSdttbllhipros__parcodnom_Enabled ;
   private int edtavSdttbllhipros__barser_Enabled ;
   private int edtavSdttbllhipros__barserdsc_Enabled ;
   private int edtavSdttbllhipros__hisprotip_Enabled ;
   private int edtavSdttbllhipros__tipartdsc_Enabled ;
   private int edtavSdttbllhipros__barcolnom_Enabled ;
   private int edtavSdttbllhipros__barnomcli_Enabled ;
   private int GRIDSDTTBLLHIPROS_nGridOutOfScope ;
   private int nGXsfl_25_fel_idx=1 ;
   private int AV13PageToGo ;
   private int idxLst ;
   private int subGridsdttbllhipros_Backcolor ;
   private int subGridsdttbllhipros_Allbackcolor ;
   private int subGridsdttbllhipros_Titlebackcolor ;
   private int subGridsdttbllhipros_Selectedindex ;
   private int subGridsdttbllhipros_Selectioncolor ;
   private int subGridsdttbllhipros_Hoveringcolor ;
   private long GRIDSDTTBLLHIPROS_nFirstRecordOnPage ;
   private long AV14GridSDTtblLhiprosCurrentPage ;
   private long AV15GridSDTtblLhiprosPageCount ;
   private long GRIDSDTTBLLHIPROS_nCurrentRecord ;
   private long GRIDSDTTBLLHIPROS_nRecordCount ;
   private String wcpOAV10Emprcod ;
   private String wcpOAV8MaqcodIni ;
   private String wcpOAV7MaqcodFin ;
   private String Gridsdttbllhiprospaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV10Emprcod ;
   private String AV8MaqcodIni ;
   private String AV7MaqcodFin ;
   private String sGXsfl_25_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridsdttbllhiprospaginationbar_Class ;
   private String Gridsdttbllhiprospaginationbar_Pagingbuttonsposition ;
   private String Gridsdttbllhiprospaginationbar_Pagingcaptionposition ;
   private String Gridsdttbllhiprospaginationbar_Emptygridclass ;
   private String Gridsdttbllhiprospaginationbar_Rowsperpageoptions ;
   private String Gridsdttbllhiprospaginationbar_Previous ;
   private String Gridsdttbllhiprospaginationbar_Next ;
   private String Gridsdttbllhiprospaginationbar_Caption ;
   private String Gridsdttbllhiprospaginationbar_Emptygridcaption ;
   private String Gridsdttbllhiprospaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sStyleString ;
   private String subGridsdttbllhipros_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdttbllhipros__maqcod_Internalname ;
   private String edtavSdttbllhipros__maqdsc_Internalname ;
   private String edtavSdttbllhipros__hisprodti_Internalname ;
   private String edtavSdttbllhipros__hisprodtf_Internalname ;
   private String edtavSdttbllhipros__hisprof_Internalname ;
   private String edtavSdttbllhipros__hisprokgr_Internalname ;
   private String edtavSdttbllhipros__hispromtr_Internalname ;
   private String edtavSdttbllhipros__barnhdr_Internalname ;
   private String edtavSdttbllhipros__hisprolot_Internalname ;
   private String edtavSdttbllhipros__hisprotur_Internalname ;
   private String edtavSdttbllhipros__fase_Internalname ;
   private String edtavSdttbllhipros__fasdsc_Internalname ;
   private String edtavSdttbllhipros__hisprotr2_Internalname ;
   private String edtavSdttbllhipros__parcod_Internalname ;
   private String edtavSdttbllhipros__parcodnom_Internalname ;
   private String edtavSdttbllhipros__barser_Internalname ;
   private String edtavSdttbllhipros__barserdsc_Internalname ;
   private String edtavSdttbllhipros__hisprotip_Internalname ;
   private String edtavSdttbllhipros__tipartdsc_Internalname ;
   private String edtavSdttbllhipros__barcolnom_Internalname ;
   private String edtavSdttbllhipros__barnomcli_Internalname ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String Gridsdttbllhiprospaginationbar_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGridsdttbllhiprostablewithpaginationbar_Internalname ;
   private String sCtrlAV10Emprcod ;
   private String sCtrlAV8MaqcodIni ;
   private String sCtrlAV7MaqcodFin ;
   private String sCtrlAV6FInicio ;
   private String sCtrlAV5FFin ;
   private String sCtrlAV9TipoProduccion ;
   private String subGridsdttbllhipros_Class ;
   private String subGridsdttbllhipros_Linesclass ;
   private String ROClassString ;
   private String edtavSdttbllhipros__maqcod_Jsonclick ;
   private String edtavSdttbllhipros__maqdsc_Jsonclick ;
   private String edtavSdttbllhipros__hisprodti_Jsonclick ;
   private String edtavSdttbllhipros__hisprodtf_Jsonclick ;
   private String edtavSdttbllhipros__hisprof_Jsonclick ;
   private String edtavSdttbllhipros__hisprokgr_Jsonclick ;
   private String edtavSdttbllhipros__hispromtr_Jsonclick ;
   private String edtavSdttbllhipros__barnhdr_Jsonclick ;
   private String edtavSdttbllhipros__hisprolot_Jsonclick ;
   private String edtavSdttbllhipros__hisprotur_Jsonclick ;
   private String edtavSdttbllhipros__fase_Jsonclick ;
   private String edtavSdttbllhipros__fasdsc_Jsonclick ;
   private String edtavSdttbllhipros__hisprotr2_Jsonclick ;
   private String edtavSdttbllhipros__parcod_Jsonclick ;
   private String edtavSdttbllhipros__parcodnom_Jsonclick ;
   private String edtavSdttbllhipros__barser_Jsonclick ;
   private String edtavSdttbllhipros__barserdsc_Jsonclick ;
   private String edtavSdttbllhipros__hisprotip_Jsonclick ;
   private String edtavSdttbllhipros__tipartdsc_Jsonclick ;
   private String edtavSdttbllhipros__barcolnom_Jsonclick ;
   private String edtavSdttbllhipros__barnomcli_Jsonclick ;
   private String subGridsdttbllhipros_Header ;
   private java.util.Date wcpOAV6FInicio ;
   private java.util.Date wcpOAV5FFin ;
   private java.util.Date AV6FInicio ;
   private java.util.Date AV5FFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gridsdttbllhiprospaginationbar_Showfirst ;
   private boolean Gridsdttbllhiprospaginationbar_Showprevious ;
   private boolean Gridsdttbllhiprospaginationbar_Shownext ;
   private boolean Gridsdttbllhiprospaginationbar_Showlast ;
   private boolean Gridsdttbllhiprospaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV25 ;
   private com.genexus.webpanels.GXWebGrid GridsdttbllhiprosContainer ;
   private com.genexus.webpanels.GXWebRow GridsdttbllhiprosRow ;
   private com.genexus.webpanels.GXWebColumn GridsdttbllhiprosColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridsdttbllhiprospaginationbar ;
   private GXBaseCollection<app.SdtSDTtblLhipro> AV11SDTtblLhipros ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXt_objcol_SdtSDTtblLhipro1 ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXv_objcol_SdtSDTtblLhipro2[] ;
}

