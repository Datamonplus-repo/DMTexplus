package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wctbllhiprolist_impl extends GXWebComponent
{
   public wctbllhiprolist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wctbllhiprolist_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctbllhiprolist_impl.class ));
   }

   public wctbllhiprolist_impl( int remoteHandle ,
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
      cmbavGridactions = new HTMLChoice();
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
               AV34Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
               AV32MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32MaqcodIni", AV32MaqcodIni);
               AV31MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqcodFin", AV31MaqcodFin);
               AV30FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FInicio", localUtil.ttoc( AV30FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV29FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FFin", localUtil.ttoc( AV29FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV33TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TipoProduccion", GXutil.str( AV33TipoProduccion, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV34Emprcod,AV32MaqcodIni,AV31MaqcodFin,AV30FInicio,AV29FFin,Byte.valueOf(AV33TipoProduccion)});
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
      nRC_GXsfl_30 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_30"))) ;
      nGXsfl_30_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_30_idx"))) ;
      sGXsfl_30_idx = httpContext.GetPar( "sGXsfl_30_idx") ;
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
      AV34Emprcod = httpContext.GetPar( "Emprcod") ;
      AV32MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
      AV31MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
      AV30FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
      AV29FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
      AV33TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV17ColumnsSelector);
      AV63Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, AV17ColumnsSelector, AV63Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paDS2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCtbl Lhipro List", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wctbllhiprolist", new String[] {GXutil.URLEncode(GXutil.rtrim(AV34Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV32MaqcodIni)),GXutil.URLEncode(GXutil.rtrim(AV31MaqcodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV30FInicio)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV29FFin)),GXutil.URLEncode(GXutil.ltrimstr(AV33TipoProduccion,1,0))}, new String[] {"Emprcod","MaqcodIni","MaqcodFin","FInicio","FFin","TipoProduccion"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdttbllhipros", AV12SDTtblLhipros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdttbllhipros", AV12SDTtblLhipros);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_30", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_30, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Emprcod", GXutil.rtrim( wcpOAV34Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32MaqcodIni", GXutil.rtrim( wcpOAV32MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31MaqcodFin", GXutil.rtrim( wcpOAV31MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30FInicio", localUtil.ttoc( wcpOAV30FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29FFin", localUtil.ttoc( wcpOAV29FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33TipoProduccion", GXutil.ltrim( localUtil.ntoc( wcpOAV33TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV34Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV32MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV31MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFINICIO", localUtil.ttoc( AV30FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFFIN", localUtil.ttoc( AV29FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV33TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV63Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63Pgmname, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTTBLLHIPROS", AV12SDTtblLhipros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTTBLLHIPROS", AV12SDTtblLhipros);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseFormDS2( )
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
      return "WCtblLhiproList" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCtbl Lhipro List", "") ;
   }

   public void wbDS0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wctbllhiprolist");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWFiltersCell", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCtblLhiproList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCtblLhiproList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCtblLhiproList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol30( ) ;
      }
      if ( wbEnd == 30 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_30 = (int)(nGXsfl_30_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV38GXV1 = nGXsfl_30_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV17ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 30 )
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
               AV38GXV1 = nGXsfl_30_idx ;
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

   public void startDS2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCtbl Lhipro List", ""), (short)(0)) ;
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
            strupDS0( ) ;
         }
      }
   }

   public void wsDS2( )
   {
      startDS2( ) ;
      evtDS2( ) ;
   }

   public void evtDS2( )
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
                              strupDS0( ) ;
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
                              strupDS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11DS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12DS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13DS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e14DS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e15DS2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDS0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
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
                              strupDS0( ) ;
                           }
                           nGXsfl_30_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_302( ) ;
                           AV38GXV1 = (int)(nGXsfl_30_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12SDTtblLhipros.size() >= AV38GXV1 ) && ( AV38GXV1 > 0 ) )
                           {
                              AV12SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)) );
                              cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                              cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                              AV35GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridActions), 4, 0));
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e16DS2 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e17DS2 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e18DS2 ();
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
                                    strupDS0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
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

   public void weDS2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormDS2( ) ;
         }
      }
   }

   public void paDS2( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_302( ) ;
      while ( nGXsfl_30_idx <= nRC_GXsfl_30 )
      {
         sendrow_302( ) ;
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV34Emprcod ,
                                 String AV32MaqcodIni ,
                                 String AV31MaqcodFin ,
                                 java.util.Date AV30FInicio ,
                                 java.util.Date AV29FFin ,
                                 byte AV33TipoProduccion ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ,
                                 String AV63Pgmname ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e17DS2 ();
      GRID_nCurrentRecord = 0 ;
      rfDS2( ) ;
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
      rfDS2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV63Pgmname = "WCtblLhiproList" ;
      Gx_err = (short)(0) ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Enabled), 5, 0), !bGXsfl_30_Refreshing);
   }

   public void rfDS2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(30) ;
      /* Execute user event: Refresh */
      e17DS2 ();
      nGXsfl_30_idx = 1 ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_302( ) ;
      bGXsfl_30_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_302( ) ;
         e18DS2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_30_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e18DS2 ();
         }
         wbEnd = (short)(30) ;
         wbDS0( ) ;
      }
      bGXsfl_30_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDS2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV63Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63Pgmname, ""))));
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
      return AV12SDTtblLhipros.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, AV17ColumnsSelector, AV63Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, AV17ColumnsSelector, AV63Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, AV17ColumnsSelector, AV63Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, AV17ColumnsSelector, AV63Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, AV17ColumnsSelector, AV63Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV63Pgmname = "WCtblLhiproList" ;
      Gx_err = (short)(0) ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupDS0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16DS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdttbllhipros"), AV12SDTtblLhipros);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV17ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTTBLLHIPROS"), AV12SDTtblLhipros);
         /* Read saved values. */
         nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV34Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV34Emprcod") ;
         wcpOAV32MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV32MaqcodIni") ;
         wcpOAV31MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV31MaqcodFin") ;
         wcpOAV30FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30FInicio"), 0) ;
         wcpOAV29FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV29FFin"), 0) ;
         wcpOAV33TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_30_fel_idx = 0 ;
         while ( nGXsfl_30_fel_idx < nRC_GXsfl_30 )
         {
            nGXsfl_30_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_fel_idx+1) ;
            sGXsfl_30_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_302( ) ;
            AV38GXV1 = (int)(nGXsfl_30_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12SDTtblLhipros.size() >= AV38GXV1 ) && ( AV38GXV1 > 0 ) )
            {
               AV12SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)) );
               cmbavGridactions.setName( cmbavGridactions.getInternalname() );
               cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
               AV35GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            }
         }
         if ( nGXsfl_30_fel_idx == 0 )
         {
            nGXsfl_30_idx = 1 ;
            sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_302( ) ;
         }
         nGXsfl_30_fel_idx = 1 ;
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
      e16DS2 ();
      if (returnInSub) return;
   }

   public void e16DS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV60Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wctbllhiprolist_impl.this.GXt_char1 = GXv_char2[0] ;
      AV60Station = GXt_char1 ;
      GXv_char2[0] = AV34Emprcod ;
      GXv_char3[0] = AV61Emprnom ;
      GXv_char4[0] = AV62Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV60Station, GXv_char2, GXv_char3, GXv_char4) ;
      wctbllhiprolist_impl.this.AV34Emprcod = GXv_char2[0] ;
      wctbllhiprolist_impl.this.AV61Emprnom = GXv_char3[0] ;
      wctbllhiprolist_impl.this.AV62Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e17DS2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTtblLhipro7 = AV12SDTtblLhipros ;
      GXv_objcol_SdtSDTtblLhipro8[0] = GXt_objcol_SdtSDTtblLhipro7 ;
      new app.dptbllhipro(remoteHandle, context).execute( AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, GXv_objcol_SdtSDTtblLhipro8) ;
      GXt_objcol_SdtSDTtblLhipro7 = GXv_objcol_SdtSDTtblLhipro8[0] ;
      AV12SDTtblLhipros = GXt_objcol_SdtSDTtblLhipro7 ;
      gx_BV30 = true ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV19Session.getValue("WCtblLhiproListColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV19Session.getValue("WCtblLhiproListColumnsSelector") ;
         AV17ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      edtavSdttbllhipros__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__maqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__maqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprodti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprodtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprodtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprof_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprof_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprokgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprokgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hispromtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hispromtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprolot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprolot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__fase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__fasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__fasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotr2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__parcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__parcodnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__parcodnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__hisprotip_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__hisprotip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__tipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__tipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavSdttbllhipros__barnomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdttbllhipros__barnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Visible), 5, 0), !bGXsfl_30_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12SDTtblLhipros", AV12SDTtblLhipros);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e11DS2( )
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
         AV24PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV24PageToGo) ;
      }
   }

   public void e12DS2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e18DS2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV12SDTtblLhipros.size() )
      {
         AV12SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)) );
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(30) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_302( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_30_Refreshing )
         {
            httpContext.doAjaxLoad(30, GridRow);
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV35GridActions, 4, 0)) );
   }

   public void e13DS2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV17ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCtblLhiproListColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV17ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
      if ( gx_BV30 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12SDTtblLhipros", AV12SDTtblLhipros);
         nGXsfl_30_bak_idx = nGXsfl_30_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32MaqcodIni, AV31MaqcodFin, AV30FInicio, AV29FFin, AV33TipoProduccion, AV17ColumnsSelector, AV63Pgmname, sPrefix) ;
         nGXsfl_30_idx = nGXsfl_30_bak_idx ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
   }

   public void e14DS2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXv_char4[0] = AV13ExcelFilename ;
      GXv_char3[0] = AV14ErrorMessage ;
      new app.wctbllhiprolistexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wctbllhiprolist_impl.this.AV13ExcelFilename = GXv_char4[0] ;
      wctbllhiprolist_impl.this.AV14ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV13ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV13ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV14ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e15DS2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.wctbllhiprolistexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV17ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Maqcod", "", "Maquina", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__MaqDsc", "", "Descripcion ", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprodti", "", "Inicio", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprodtf", "", "Fin", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProf", "", "Fin?", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProKgr", "", "Kilos", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProMtr", "", "Metros", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarNhdr", "", "N Hdr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprolot", "", "Lote", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprotur", "", "Turno", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Fase", "", "Fase", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__FasDsc", "", "Descripcion ", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprotr2", "", "Tiempo(m)", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Parcod", "", "Paro", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Parcodnom", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Barser", "", "Articulo", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarSerdsc", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProTip", "", "Tipo Articulo", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__TipArtDsc", "", "Descripción", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarColNom", "", "Color", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarNomCli", "", "Color Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV16UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCtblLhiproListColumnsSelector", GXv_char4) ;
      wctbllhiprolist_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV16UserCustomValue)==0) ) )
      {
         AV18ColumnsSelectorAux.fromxml(AV16UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV18ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S152( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
   }

   public void S162( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV63Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV63Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV63Pgmname+"GridState"), null, null);
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
      AV10GridState.fromxml(AV19Session.getValue(AV63Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV63Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV34Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
      AV32MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32MaqcodIni", AV32MaqcodIni);
      AV31MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqcodFin", AV31MaqcodFin);
      AV30FInicio = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FInicio", localUtil.ttoc( AV30FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV29FFin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FFin", localUtil.ttoc( AV29FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV33TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TipoProduccion", GXutil.str( AV33TipoProduccion, 1, 0));
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
      paDS2( ) ;
      wsDS2( ) ;
      weDS2( ) ;
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
      sCtrlAV34Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV32MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV31MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV30FInicio = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV29FFin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33TipoProduccion = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paDS2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wctbllhiprolist", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paDS2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV34Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
         AV32MaqcodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32MaqcodIni", AV32MaqcodIni);
         AV31MaqcodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqcodFin", AV31MaqcodFin);
         AV30FInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FInicio", localUtil.ttoc( AV30FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV29FFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FFin", localUtil.ttoc( AV29FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV33TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TipoProduccion", GXutil.str( AV33TipoProduccion, 1, 0));
      }
      wcpOAV34Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV34Emprcod") ;
      wcpOAV32MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV32MaqcodIni") ;
      wcpOAV31MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV31MaqcodFin") ;
      wcpOAV30FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30FInicio"), 0) ;
      wcpOAV29FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV29FFin"), 0) ;
      wcpOAV33TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV34Emprcod, wcpOAV34Emprcod) != 0 ) || ( GXutil.strcmp(AV32MaqcodIni, wcpOAV32MaqcodIni) != 0 ) || ( GXutil.strcmp(AV31MaqcodFin, wcpOAV31MaqcodFin) != 0 ) || !( GXutil.dateCompare(AV30FInicio, wcpOAV30FInicio) ) || !( GXutil.dateCompare(AV29FFin, wcpOAV29FFin) ) || ( AV33TipoProduccion != wcpOAV33TipoProduccion ) ) )
      {
         setjustcreated();
      }
      wcpOAV34Emprcod = AV34Emprcod ;
      wcpOAV32MaqcodIni = AV32MaqcodIni ;
      wcpOAV31MaqcodFin = AV31MaqcodFin ;
      wcpOAV30FInicio = AV30FInicio ;
      wcpOAV29FFin = AV29FFin ;
      wcpOAV33TipoProduccion = AV33TipoProduccion ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV34Emprcod = httpContext.cgiGet( sPrefix+"AV34Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV34Emprcod) > 0 )
      {
         AV34Emprcod = httpContext.cgiGet( sCtrlAV34Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
      }
      else
      {
         AV34Emprcod = httpContext.cgiGet( sPrefix+"AV34Emprcod_PARM") ;
      }
      sCtrlAV32MaqcodIni = httpContext.cgiGet( sPrefix+"AV32MaqcodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV32MaqcodIni) > 0 )
      {
         AV32MaqcodIni = httpContext.cgiGet( sCtrlAV32MaqcodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32MaqcodIni", AV32MaqcodIni);
      }
      else
      {
         AV32MaqcodIni = httpContext.cgiGet( sPrefix+"AV32MaqcodIni_PARM") ;
      }
      sCtrlAV31MaqcodFin = httpContext.cgiGet( sPrefix+"AV31MaqcodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV31MaqcodFin) > 0 )
      {
         AV31MaqcodFin = httpContext.cgiGet( sCtrlAV31MaqcodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqcodFin", AV31MaqcodFin);
      }
      else
      {
         AV31MaqcodFin = httpContext.cgiGet( sPrefix+"AV31MaqcodFin_PARM") ;
      }
      sCtrlAV30FInicio = httpContext.cgiGet( sPrefix+"AV30FInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV30FInicio) > 0 )
      {
         AV30FInicio = localUtil.ctot( httpContext.cgiGet( sCtrlAV30FInicio), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FInicio", localUtil.ttoc( AV30FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV30FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV30FInicio_PARM"), 0) ;
      }
      sCtrlAV29FFin = httpContext.cgiGet( sPrefix+"AV29FFin_CTRL") ;
      if ( GXutil.len( sCtrlAV29FFin) > 0 )
      {
         AV29FFin = localUtil.ctot( httpContext.cgiGet( sCtrlAV29FFin), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FFin", localUtil.ttoc( AV29FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV29FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV29FFin_PARM"), 0) ;
      }
      sCtrlAV33TipoProduccion = httpContext.cgiGet( sPrefix+"AV33TipoProduccion_CTRL") ;
      if ( GXutil.len( sCtrlAV33TipoProduccion) > 0 )
      {
         AV33TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33TipoProduccion), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TipoProduccion", GXutil.str( AV33TipoProduccion, 1, 0));
      }
      else
      {
         AV33TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33TipoProduccion_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paDS2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsDS2( ) ;
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
      wsDS2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Emprcod_PARM", GXutil.rtrim( AV34Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Emprcod_CTRL", GXutil.rtrim( sCtrlAV34Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32MaqcodIni_PARM", GXutil.rtrim( AV32MaqcodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32MaqcodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32MaqcodIni_CTRL", GXutil.rtrim( sCtrlAV32MaqcodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31MaqcodFin_PARM", GXutil.rtrim( AV31MaqcodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31MaqcodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31MaqcodFin_CTRL", GXutil.rtrim( sCtrlAV31MaqcodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30FInicio_PARM", localUtil.ttoc( AV30FInicio, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30FInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30FInicio_CTRL", GXutil.rtrim( sCtrlAV30FInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29FFin_PARM", localUtil.ttoc( AV29FFin, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29FFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29FFin_CTRL", GXutil.rtrim( sCtrlAV29FFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33TipoProduccion_PARM", GXutil.ltrim( localUtil.ntoc( AV33TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33TipoProduccion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33TipoProduccion_CTRL", GXutil.rtrim( sCtrlAV33TipoProduccion));
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
      weDS2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556580", true, true);
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
      httpContext.AddJavascriptSource("wctbllhiprolist.js", "?20268211556580", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_302( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_30_idx );
      edtavSdttbllhipros__maqcod_Internalname = sPrefix+"SDTTBLLHIPROS__MAQCOD_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__maqdsc_Internalname = sPrefix+"SDTTBLLHIPROS__MAQDSC_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprodti_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTI_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprodtf_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTF_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprof_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROF_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprokgr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROKGR_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hispromtr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROMTR_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__barnhdr_Internalname = sPrefix+"SDTTBLLHIPROS__BARNHDR_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprolot_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROLOT_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprotur_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTUR_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__fase_Internalname = sPrefix+"SDTTBLLHIPROS__FASE_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__fasdsc_Internalname = sPrefix+"SDTTBLLHIPROS__FASDSC_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprotr2_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTR2_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__parcod_Internalname = sPrefix+"SDTTBLLHIPROS__PARCOD_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__parcodnom_Internalname = sPrefix+"SDTTBLLHIPROS__PARCODNOM_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__barser_Internalname = sPrefix+"SDTTBLLHIPROS__BARSER_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__barserdsc_Internalname = sPrefix+"SDTTBLLHIPROS__BARSERDSC_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__hisprotip_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTIP_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__tipartdsc_Internalname = sPrefix+"SDTTBLLHIPROS__TIPARTDSC_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__barcolnom_Internalname = sPrefix+"SDTTBLLHIPROS__BARCOLNOM_"+sGXsfl_30_idx ;
      edtavSdttbllhipros__barnomcli_Internalname = sPrefix+"SDTTBLLHIPROS__BARNOMCLI_"+sGXsfl_30_idx ;
   }

   public void subsflControlProps_fel_302( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_30_fel_idx );
      edtavSdttbllhipros__maqcod_Internalname = sPrefix+"SDTTBLLHIPROS__MAQCOD_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__maqdsc_Internalname = sPrefix+"SDTTBLLHIPROS__MAQDSC_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprodti_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTI_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprodtf_Internalname = sPrefix+"SDTTBLLHIPROS__HISPRODTF_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprof_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROF_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprokgr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROKGR_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hispromtr_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROMTR_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__barnhdr_Internalname = sPrefix+"SDTTBLLHIPROS__BARNHDR_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprolot_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROLOT_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprotur_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTUR_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__fase_Internalname = sPrefix+"SDTTBLLHIPROS__FASE_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__fasdsc_Internalname = sPrefix+"SDTTBLLHIPROS__FASDSC_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprotr2_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTR2_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__parcod_Internalname = sPrefix+"SDTTBLLHIPROS__PARCOD_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__parcodnom_Internalname = sPrefix+"SDTTBLLHIPROS__PARCODNOM_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__barser_Internalname = sPrefix+"SDTTBLLHIPROS__BARSER_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__barserdsc_Internalname = sPrefix+"SDTTBLLHIPROS__BARSERDSC_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__hisprotip_Internalname = sPrefix+"SDTTBLLHIPROS__HISPROTIP_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__tipartdsc_Internalname = sPrefix+"SDTTBLLHIPROS__TIPARTDSC_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__barcolnom_Internalname = sPrefix+"SDTTBLLHIPROS__BARCOLNOM_"+sGXsfl_30_fel_idx ;
      edtavSdttbllhipros__barnomcli_Internalname = sPrefix+"SDTTBLLHIPROS__BARNOMCLI_"+sGXsfl_30_fel_idx ;
   }

   public void sendrow_302( )
   {
      subsflControlProps_302( ) ;
      wbDS0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_30_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_30_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_30_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 31,'"+sPrefix+"',false,'"+sGXsfl_30_idx+"',30)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_30_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               if ( ( AV38GXV1 > 0 ) && ( AV12SDTtblLhipros.size() >= AV38GXV1 ) && (0==AV35GridActions) )
               {
                  AV35GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV35GridActions, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridActions), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV35GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e19ds2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,31);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV35GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_30_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__maqcod_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__maqcod_Visible),Integer.valueOf(edtavSdttbllhipros__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__maqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__maqdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__maqdsc_Visible),Integer.valueOf(edtavSdttbllhipros__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprodti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprodti_Internalname,localUtil.ttoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodti(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodti(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprodti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprodti_Visible),Integer.valueOf(edtavSdttbllhipros__hisprodti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprodtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprodtf_Internalname,localUtil.ttoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodtf(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprodtf_Visible),Integer.valueOf(edtavSdttbllhipros__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__hisprof_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprof_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprof()),GXutil.rtrim( localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprof(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprof_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprof_Visible),Integer.valueOf(edtavSdttbllhipros__hisprof_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprokgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprokgr_Enabled!=0) ? localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprokgr_Visible),Integer.valueOf(edtavSdttbllhipros__hisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hispromtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hispromtr_Enabled!=0) ? localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hispromtr_Visible),Integer.valueOf(edtavSdttbllhipros__hispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barnhdr_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Barnhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barnhdr_Visible),Integer.valueOf(edtavSdttbllhipros__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__hisprolot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprolot_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprolot()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprolot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprolot_Visible),Integer.valueOf(edtavSdttbllhipros__hisprolot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprotur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotur_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprotur_Visible),Integer.valueOf(edtavSdttbllhipros__hisprotur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__fase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__fase_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Fase()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__fase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__fase_Visible),Integer.valueOf(edtavSdttbllhipros__fase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__fasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__fasdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__fasdsc_Visible),Integer.valueOf(edtavSdttbllhipros__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprotr2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotr2_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotr2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprotr2_Visible),Integer.valueOf(edtavSdttbllhipros__hisprotr2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__parcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__parcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Parcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__parcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Parcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Parcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__parcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__parcod_Visible),Integer.valueOf(edtavSdttbllhipros__parcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__parcodnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__parcodnom_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Parcodnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__parcodnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__parcodnom_Visible),Integer.valueOf(edtavSdttbllhipros__parcodnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barser_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barser_Visible),Integer.valueOf(edtavSdttbllhipros__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barserdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Barserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barserdsc_Visible),Integer.valueOf(edtavSdttbllhipros__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprotip_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotip_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprotip_Visible),Integer.valueOf(edtavSdttbllhipros__hisprotip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__tipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__tipartdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Tipartdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__tipartdsc_Visible),Integer.valueOf(edtavSdttbllhipros__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barcolnom_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barcolnom_Visible),Integer.valueOf(edtavSdttbllhipros__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barnomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barnomcli_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV38GXV1)).getgxTv_SdtSDTtblLhipro_Barnomcli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barnomcli_Visible),Integer.valueOf(edtavSdttbllhipros__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesDS2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      /* End function sendrow_302 */
   }

   public void startgridcontrol30( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"30\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__maqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprodti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprodtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprof_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprokgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hispromtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprolot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprotur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__fase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__fasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprotr2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo(m)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__parcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__parcodnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprotip_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__tipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barnomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV35GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprof_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprof_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprokgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hispromtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprolot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprolot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotur_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotr2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotr2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcodnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcodnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotip_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotip_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__tipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnomcli_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
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
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtavSdttbllhipros__barnomcli_Jsonclick = "" ;
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      edtavSdttbllhipros__barnomcli_Visible = -1 ;
      edtavSdttbllhipros__barcolnom_Jsonclick = "" ;
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      edtavSdttbllhipros__barcolnom_Visible = -1 ;
      edtavSdttbllhipros__tipartdsc_Jsonclick = "" ;
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      edtavSdttbllhipros__tipartdsc_Visible = -1 ;
      edtavSdttbllhipros__hisprotip_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      edtavSdttbllhipros__hisprotip_Visible = -1 ;
      edtavSdttbllhipros__barserdsc_Jsonclick = "" ;
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      edtavSdttbllhipros__barserdsc_Visible = -1 ;
      edtavSdttbllhipros__barser_Jsonclick = "" ;
      edtavSdttbllhipros__barser_Enabled = 0 ;
      edtavSdttbllhipros__barser_Visible = -1 ;
      edtavSdttbllhipros__parcodnom_Jsonclick = "" ;
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      edtavSdttbllhipros__parcodnom_Visible = -1 ;
      edtavSdttbllhipros__parcod_Jsonclick = "" ;
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      edtavSdttbllhipros__parcod_Visible = -1 ;
      edtavSdttbllhipros__hisprotr2_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      edtavSdttbllhipros__hisprotr2_Visible = -1 ;
      edtavSdttbllhipros__fasdsc_Jsonclick = "" ;
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      edtavSdttbllhipros__fasdsc_Visible = -1 ;
      edtavSdttbllhipros__fase_Jsonclick = "" ;
      edtavSdttbllhipros__fase_Enabled = 0 ;
      edtavSdttbllhipros__fase_Visible = -1 ;
      edtavSdttbllhipros__hisprotur_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      edtavSdttbllhipros__hisprotur_Visible = -1 ;
      edtavSdttbllhipros__hisprolot_Jsonclick = "" ;
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      edtavSdttbllhipros__hisprolot_Visible = -1 ;
      edtavSdttbllhipros__barnhdr_Jsonclick = "" ;
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      edtavSdttbllhipros__barnhdr_Visible = -1 ;
      edtavSdttbllhipros__hispromtr_Jsonclick = "" ;
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      edtavSdttbllhipros__hispromtr_Visible = -1 ;
      edtavSdttbllhipros__hisprokgr_Jsonclick = "" ;
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      edtavSdttbllhipros__hisprokgr_Visible = -1 ;
      edtavSdttbllhipros__hisprof_Jsonclick = "" ;
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      edtavSdttbllhipros__hisprof_Visible = -1 ;
      edtavSdttbllhipros__hisprodtf_Jsonclick = "" ;
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      edtavSdttbllhipros__hisprodtf_Visible = -1 ;
      edtavSdttbllhipros__hisprodti_Jsonclick = "" ;
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      edtavSdttbllhipros__hisprodti_Visible = -1 ;
      edtavSdttbllhipros__maqdsc_Jsonclick = "" ;
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      edtavSdttbllhipros__maqdsc_Visible = -1 ;
      edtavSdttbllhipros__maqcod_Jsonclick = "" ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      edtavSdttbllhipros__maqcod_Visible = -1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavSdttbllhipros__barnomcli_Visible = -1 ;
      edtavSdttbllhipros__barcolnom_Visible = -1 ;
      edtavSdttbllhipros__tipartdsc_Visible = -1 ;
      edtavSdttbllhipros__hisprotip_Visible = -1 ;
      edtavSdttbllhipros__barserdsc_Visible = -1 ;
      edtavSdttbllhipros__barser_Visible = -1 ;
      edtavSdttbllhipros__parcodnom_Visible = -1 ;
      edtavSdttbllhipros__parcod_Visible = -1 ;
      edtavSdttbllhipros__hisprotr2_Visible = -1 ;
      edtavSdttbllhipros__fasdsc_Visible = -1 ;
      edtavSdttbllhipros__fase_Visible = -1 ;
      edtavSdttbllhipros__hisprotur_Visible = -1 ;
      edtavSdttbllhipros__hisprolot_Visible = -1 ;
      edtavSdttbllhipros__barnhdr_Visible = -1 ;
      edtavSdttbllhipros__hispromtr_Visible = -1 ;
      edtavSdttbllhipros__hisprokgr_Visible = -1 ;
      edtavSdttbllhipros__hisprof_Visible = -1 ;
      edtavSdttbllhipros__hisprodtf_Visible = -1 ;
      edtavSdttbllhipros__hisprodti_Visible = -1 ;
      edtavSdttbllhipros__maqdsc_Visible = -1 ;
      edtavSdttbllhipros__maqcod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
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
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:SDTtblLhipros__Maqcod|2:SDTtblLhipros__MaqDsc|3:SDTtblLhipros__Hisprodti|4:SDTtblLhipros__Hisprodtf|5:SDTtblLhipros__HisProf|6:SDTtblLhipros__HisProKgr|7:SDTtblLhipros__HisProMtr|8:SDTtblLhipros__BarNhdr|9:SDTtblLhipros__Hisprolot|10:SDTtblLhipros__Hisprotur|11:SDTtblLhipros__Fase|12:SDTtblLhipros__FasDsc|13:SDTtblLhipros__Hisprotr2|14:SDTtblLhipros__Parcod|15:SDTtblLhipros__Parcodnom|16:SDTtblLhipros__Barser|17:SDTtblLhipros__BarSerdsc|18:SDTtblLhipros__HisProTip|19:SDTtblLhipros__TipArtDsc|20:SDTtblLhipros__BarColNom|21:SDTtblLhipros__BarNomCli" ;
      Ddo_grid_Gridinternalname = "" ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_30_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         if ( ( AV38GXV1 > 0 ) && ( AV12SDTtblLhipros.size() >= AV38GXV1 ) && (0==AV35GridActions) )
         {
         }
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'sPrefix'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV31MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV30FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV29FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV33TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTTBLLHIPROS__MAQCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__MAQDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTI',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROKGR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROMTR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNHDR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROLOT',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTUR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASE',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTR2',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCODNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSER',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSERDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTIP',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNOMCLI',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11DS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV31MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV30FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV29FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV33TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12DS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV31MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV30FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV29FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV33TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e18DS2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV35GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e13DS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV31MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV30FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV29FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV33TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{ctrl:'SDTTBLLHIPROS__MAQCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__MAQDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTI',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROKGR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROMTR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNHDR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROLOT',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTUR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASE',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTR2',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCODNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSER',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSERDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTIP',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNOMCLI',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e19DS2',iparms:[{av:'cmbavGridactions'},{av:'AV35GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV35GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e14DS2',iparms:[{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV31MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV30FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV29FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV33TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e15DS2',iparms:[{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:30,pic:''},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV31MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV30FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV29FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV33TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'}]}");
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
      wcpOAV34Emprcod = "" ;
      wcpOAV32MaqcodIni = "" ;
      wcpOAV31MaqcodFin = "" ;
      wcpOAV30FInicio = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV29FFin = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV34Emprcod = "" ;
      AV32MaqcodIni = "" ;
      AV31MaqcodFin = "" ;
      AV30FInicio = GXutil.resetTime( GXutil.nullDate() );
      AV29FFin = GXutil.resetTime( GXutil.nullDate() );
      AV17ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV63Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV12SDTtblLhipros = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV60Station = "" ;
      GXv_char2 = new String[1] ;
      AV61Emprnom = "" ;
      AV62Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtSDTtblLhipro7 = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTtblLhipro8 = new GXBaseCollection[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV13ExcelFilename = "" ;
      AV14ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV16UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV18ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV34Emprcod = "" ;
      sCtrlAV32MaqcodIni = "" ;
      sCtrlAV31MaqcodFin = "" ;
      sCtrlAV30FInicio = "" ;
      sCtrlAV29FFin = "" ;
      sCtrlAV33TipoProduccion = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV63Pgmname = "WCtblLhiproList" ;
      /* GeneXus formulas. */
      AV63Pgmname = "WCtblLhiproList" ;
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

   private byte wcpOAV33TipoProduccion ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV33TipoProduccion ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short AV35GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_30 ;
   private int nGXsfl_30_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV38GXV1 ;
   private int subGrid_Islastpage ;
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
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_30_fel_idx=1 ;
   private int edtavSdttbllhipros__maqcod_Visible ;
   private int edtavSdttbllhipros__maqdsc_Visible ;
   private int edtavSdttbllhipros__hisprodti_Visible ;
   private int edtavSdttbllhipros__hisprodtf_Visible ;
   private int edtavSdttbllhipros__hisprof_Visible ;
   private int edtavSdttbllhipros__hisprokgr_Visible ;
   private int edtavSdttbllhipros__hispromtr_Visible ;
   private int edtavSdttbllhipros__barnhdr_Visible ;
   private int edtavSdttbllhipros__hisprolot_Visible ;
   private int edtavSdttbllhipros__hisprotur_Visible ;
   private int edtavSdttbllhipros__fase_Visible ;
   private int edtavSdttbllhipros__fasdsc_Visible ;
   private int edtavSdttbllhipros__hisprotr2_Visible ;
   private int edtavSdttbllhipros__parcod_Visible ;
   private int edtavSdttbllhipros__parcodnom_Visible ;
   private int edtavSdttbllhipros__barser_Visible ;
   private int edtavSdttbllhipros__barserdsc_Visible ;
   private int edtavSdttbllhipros__hisprotip_Visible ;
   private int edtavSdttbllhipros__tipartdsc_Visible ;
   private int edtavSdttbllhipros__barcolnom_Visible ;
   private int edtavSdttbllhipros__barnomcli_Visible ;
   private int AV24PageToGo ;
   private int nGXsfl_30_bak_idx=1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV34Emprcod ;
   private String wcpOAV32MaqcodIni ;
   private String wcpOAV31MaqcodFin ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV34Emprcod ;
   private String AV32MaqcodIni ;
   private String AV31MaqcodFin ;
   private String sGXsfl_30_idx="0001" ;
   private String AV63Pgmname ;
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
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
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
   private String sGXsfl_30_fel_idx="0001" ;
   private String AV60Station ;
   private String GXv_char2[] ;
   private String AV61Emprnom ;
   private String AV62Usurcod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sCtrlAV34Emprcod ;
   private String sCtrlAV32MaqcodIni ;
   private String sCtrlAV31MaqcodFin ;
   private String sCtrlAV30FInicio ;
   private String sCtrlAV29FFin ;
   private String sCtrlAV33TipoProduccion ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
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
   private String subGrid_Header ;
   private java.util.Date wcpOAV30FInicio ;
   private java.util.Date wcpOAV29FFin ;
   private java.util.Date AV30FInicio ;
   private java.util.Date AV29FFin ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_30_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV30 ;
   private String AV15ColumnsSelectorXML ;
   private String AV16UserCustomValue ;
   private String AV13ExcelFilename ;
   private String AV14ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbavGridactions ;
   private GXBaseCollection<app.SdtSDTtblLhipro> AV12SDTtblLhipros ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXt_objcol_SdtSDTtblLhipro7 ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXv_objcol_SdtSDTtblLhipro8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

