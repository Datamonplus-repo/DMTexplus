package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_alertadata_impl extends GXWebComponent
{
   public mrec_alertadata_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_alertadata_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertadata_impl.class ));
   }

   public mrec_alertadata_impl( int remoteHandle ,
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
      chkavDatos__mprecer = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "inEmprCod") ;
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
               AV121inEmprCod = httpContext.GetPar( "inEmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121inEmprCod", AV121inEmprCod);
               AV122inContCod = httpContext.GetPar( "inContCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122inContCod", AV122inContCod);
               AV125inSegundos = (int)(GXutil.lval( httpContext.GetPar( "inSegundos"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125inSegundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125inSegundos), 6, 0));
               AV117inMaqCodJSON = httpContext.GetPar( "inMaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117inMaqCodJSON", AV117inMaqCodJSON);
               AV118inFasCodJSon = httpContext.GetPar( "inFasCodJSon") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118inFasCodJSon", AV118inFasCodJSon);
               AV119inHdrJSON = httpContext.GetPar( "inHdrJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119inHdrJSON", AV119inHdrJSON);
               AV120inParFasCodJSon = httpContext.GetPar( "inParFasCodJSon") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120inParFasCodJSon", AV120inParFasCodJSon);
               AV126inFueraRango = GXutil.strtobool( httpContext.GetPar( "inFueraRango")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126inFueraRango", AV126inFueraRango);
               AV127inDesde = localUtil.parseDTimeParm( httpContext.GetPar( "inDesde")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127inDesde", localUtil.ttoc( AV127inDesde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV128inHasta = localUtil.parseDTimeParm( httpContext.GetPar( "inHasta")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128inHasta", localUtil.ttoc( AV128inHasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV123inUsurCod = httpContext.GetPar( "inUsurCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123inUsurCod", AV123inUsurCod);
               AV124inIp = httpContext.GetPar( "inIp") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124inIp", AV124inIp);
               AV129inNow = localUtil.parseDTimeParm( httpContext.GetPar( "inNow")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129inNow", localUtil.ttoc( AV129inNow, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV108InFilTkn = httpContext.GetPar( "InFilTkn") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108InFilTkn", AV108InFilTkn);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV121inEmprCod,AV122inContCod,Integer.valueOf(AV125inSegundos),AV117inMaqCodJSON,AV118inFasCodJSon,AV119inHdrJSON,AV120inParFasCodJSon,Boolean.valueOf(AV126inFueraRango),AV127inDesde,AV128inHasta,AV123inUsurCod,AV124inIp,AV129inNow,AV108InFilTkn});
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
               gxfirstwebparm = httpContext.GetFirstPar( "inEmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "inEmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Fsgrid1") == 0 )
            {
               gxnrfsgrid1_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Fsgrid1") == 0 )
            {
               gxgrfsgrid1_refresh_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmrec_alertasdts") == 0 )
            {
               gxnrgridmrec_alertasdts_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmrec_alertasdts") == 0 )
            {
               gxgrgridmrec_alertasdts_refresh_invoke( ) ;
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

   public void gxnrfsgrid1_newrow_invoke( )
   {
      nRC_GXsfl_26 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_26"))) ;
      nGXsfl_26_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_26_idx"))) ;
      sGXsfl_26_idx = httpContext.GetPar( "sGXsfl_26_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrfsgrid1_newrow( ) ;
      /* End function gxnrFsgrid1_newrow_invoke */
   }

   public void gxgrfsgrid1_refresh_invoke( )
   {
      subGridmrec_alertasdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmrec_alertasdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV75MaqCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26FasCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59Hdr);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV87ParFasCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV79Maquinas);
      AV25EmprCod = httpContext.GetPar( "EmprCod") ;
      AV12ContCod = httpContext.GetPar( "ContCod") ;
      AV93Segundos = (int)(GXutil.lval( httpContext.GetPar( "Segundos"))) ;
      AV77MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
      AV5FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
      AV6HdrJSON = httpContext.GetPar( "HdrJSON") ;
      AV7ParFasCodJSON = httpContext.GetPar( "ParFasCodJSON") ;
      AV19Desde = localUtil.parseDTimeParm( httpContext.GetPar( "Desde")) ;
      AV57Hasta = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta")) ;
      AV102UsurCod = httpContext.GetPar( "UsurCod") ;
      AV64Ip = httpContext.GetPar( "Ip") ;
      AV105Now = localUtil.parseDTimeParm( httpContext.GetPar( "Now")) ;
      AV29FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
      AV112MTkn = httpContext.GetPar( "MTkn") ;
      AV153Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrfsgrid1_refresh( subGridmrec_alertasdts_Rows, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV79Maquinas, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrFsgrid1_refresh_invoke */
   }

   public void gxnrgridmrec_alertasdts_newrow_invoke( )
   {
      nRC_GXsfl_62 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_62"))) ;
      nGXsfl_62_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_62_idx"))) ;
      sGXsfl_62_idx = httpContext.GetPar( "sGXsfl_62_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmrec_alertasdts_newrow( ) ;
      /* End function gxnrGridmrec_alertasdts_newrow_invoke */
   }

   public void gxgrgridmrec_alertasdts_refresh_invoke( )
   {
      subGridmrec_alertasdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmrec_alertasdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV16Datos);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV75MaqCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26FasCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59Hdr);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV87ParFasCod);
      AV25EmprCod = httpContext.GetPar( "EmprCod") ;
      AV12ContCod = httpContext.GetPar( "ContCod") ;
      AV93Segundos = (int)(GXutil.lval( httpContext.GetPar( "Segundos"))) ;
      AV77MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
      AV5FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
      AV6HdrJSON = httpContext.GetPar( "HdrJSON") ;
      AV7ParFasCodJSON = httpContext.GetPar( "ParFasCodJSON") ;
      AV19Desde = localUtil.parseDTimeParm( httpContext.GetPar( "Desde")) ;
      AV57Hasta = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta")) ;
      AV102UsurCod = httpContext.GetPar( "UsurCod") ;
      AV64Ip = httpContext.GetPar( "Ip") ;
      AV105Now = localUtil.parseDTimeParm( httpContext.GetPar( "Now")) ;
      AV29FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
      AV112MTkn = httpContext.GetPar( "MTkn") ;
      AV153Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV16Datos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmrec_alertasdts_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2E22( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Alertas", "")) ;
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
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_alertadata", new String[] {GXutil.URLEncode(GXutil.rtrim(AV121inEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV122inContCod)),GXutil.URLEncode(GXutil.ltrimstr(AV125inSegundos,6,0)),GXutil.URLEncode(GXutil.rtrim(AV117inMaqCodJSON)),GXutil.URLEncode(GXutil.rtrim(AV118inFasCodJSon)),GXutil.URLEncode(GXutil.rtrim(AV119inHdrJSON)),GXutil.URLEncode(GXutil.rtrim(AV120inParFasCodJSon)),GXutil.URLEncode(GXutil.booltostr(AV126inFueraRango)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV127inDesde)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV128inHasta)),GXutil.URLEncode(GXutil.rtrim(AV123inUsurCod)),GXutil.URLEncode(GXutil.rtrim(AV124inIp)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV129inNow)),GXutil.URLEncode(GXutil.rtrim(AV108InFilTkn))}, new String[] {"inEmprCod","inContCod","inSegundos","inMaqCodJSON","inFasCodJSon","inHdrJSON","inParFasCodJSon","inFueraRango","inDesde","inHasta","inUsurCod","inIp","inNow","InFilTkn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCOD", getSecureSignedToken( sPrefix, AV75MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, AV26FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDR", getSecureSignedToken( sPrefix, AV59Hdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARFASCOD", getSecureSignedToken( sPrefix, AV87ParFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSEGUNDOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Segundos), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77MaqCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5FasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDRJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6HdrJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7ParFasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDESDE", getSecureSignedToken( sPrefix, localUtil.format( AV19Desde, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHASTA", getSecureSignedToken( sPrefix, localUtil.format( AV57Hasta, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNOW", getSecureSignedToken( sPrefix, localUtil.format( AV105Now, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFUERARANGO", getSecureSignedToken( sPrefix, AV29FueraRango));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTKN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112MTkn, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaData");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV153Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertadata:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Maquinas", AV79Maquinas);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Maquinas", AV79Maquinas);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Datos", AV16Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Datos", AV16Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_26", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_26, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_62", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_62, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_ALERTASDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV55GridMRec_AlertaSDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_ALERTASDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV56GridMRec_AlertaSDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV121inEmprCod", GXutil.rtrim( wcpOAV121inEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV122inContCod", GXutil.rtrim( wcpOAV122inContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV125inSegundos", GXutil.ltrim( localUtil.ntoc( wcpOAV125inSegundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV117inMaqCodJSON", wcpOAV117inMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV118inFasCodJSon", wcpOAV118inFasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV119inHdrJSON", wcpOAV119inHdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV120inParFasCodJSon", wcpOAV120inParFasCodJSon);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV126inFueraRango", wcpOAV126inFueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV127inDesde", localUtil.ttoc( wcpOAV127inDesde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV128inHasta", localUtil.ttoc( wcpOAV128inHasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV123inUsurCod", GXutil.rtrim( wcpOAV123inUsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV124inIp", wcpOAV124inIp);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV129inNow", localUtil.ttoc( wcpOAV129inNow, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV108InFilTkn", wcpOAV108InFilTkn);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDATOS", AV16Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDATOS", AV16Datos);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMAQCOD", AV75MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMAQCOD", AV75MaqCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCOD", getSecureSignedToken( sPrefix, AV75MaqCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFASCOD", AV26FasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFASCOD", AV26FasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, AV26FasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vHDR", AV59Hdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vHDR", AV59Hdr);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDR", getSecureSignedToken( sPrefix, AV59Hdr));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARFASCOD", AV87ParFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARFASCOD", AV87ParFasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARFASCOD", getSecureSignedToken( sPrefix, AV87ParFasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMAQUINAS", AV79Maquinas);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMAQUINAS", AV79Maquinas);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTCOD", GXutil.rtrim( AV12ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSEGUNDOS", GXutil.ltrim( localUtil.ntoc( AV93Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSEGUNDOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Segundos), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODJSON", AV77MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77MaqCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODJSON", AV5FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5FasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHDRJSON", AV6HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDRJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6HdrJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARFASCODJSON", AV7ParFasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7ParFasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDESDE", localUtil.ttoc( AV19Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDESDE", getSecureSignedToken( sPrefix, localUtil.format( AV19Desde, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASTA", localUtil.ttoc( AV57Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHASTA", getSecureSignedToken( sPrefix, localUtil.format( AV57Hasta, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV102UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIP", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOW", localUtil.ttoc( AV105Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNOW", getSecureSignedToken( sPrefix, localUtil.format( AV105Now, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFILTKN", AV108InFilTkn);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vFUERARANGO", AV29FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFUERARANGO", getSecureSignedToken( sPrefix, AV29FueraRango));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV112MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTKN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112MTkn, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINEMPRCOD", GXutil.rtrim( AV121inEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINCONTCOD", GXutil.rtrim( AV122inContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINSEGUNDOS", GXutil.ltrim( localUtil.ntoc( AV125inSegundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINMAQCODJSON", AV117inMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFASCODJSON", AV118inFasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHDRJSON", AV119inHdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINPARFASCODJSON", AV120inParFasCodJSon);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vINFUERARANGO", AV126inFueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINDESDE", localUtil.ttoc( AV127inDesde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHASTA", localUtil.ttoc( AV128inHasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINUSURCOD", GXutil.rtrim( AV123inUsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINIP", AV124inIp);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINNOW", localUtil.ttoc( AV129inNow, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Width", GXutil.rtrim( Dvpanel_panelgeneral_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Autowidth", GXutil.booltostr( Dvpanel_panelgeneral_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Autoheight", GXutil.booltostr( Dvpanel_panelgeneral_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Cls", GXutil.rtrim( Dvpanel_panelgeneral_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Title", GXutil.rtrim( Dvpanel_panelgeneral_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Collapsible", GXutil.booltostr( Dvpanel_panelgeneral_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Collapsed", GXutil.booltostr( Dvpanel_panelgeneral_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Showcollapseicon", GXutil.booltostr( Dvpanel_panelgeneral_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Iconposition", GXutil.rtrim( Dvpanel_panelgeneral_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELGENERAL_Autoscroll", GXutil.booltostr( Dvpanel_panelgeneral_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VERERRRORMAQUINA_MODAL_Width", GXutil.rtrim( Vererrrormaquina_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VERERRRORMAQUINA_MODAL_Title", GXutil.rtrim( Vererrrormaquina_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VERERRRORMAQUINA_MODAL_Confirmtype", GXutil.rtrim( Vererrrormaquina_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VERERRRORMAQUINA_MODAL_Bodytype", GXutil.rtrim( Vererrrormaquina_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridmrec_alertasdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FSGRID1_Class", GXutil.rtrim( subFsgrid1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FSGRID1_Paged", GXutil.rtrim( subFsgrid1_Paged));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FSGRID1_Showpagecontroller", GXutil.rtrim( subFsgrid1_Showpagecontroller));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FSGRID1_Showarrows", GXutil.rtrim( subFsgrid1_Showarrows));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2E22( )
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
         if ( ! ( WebComp_Wwpaux_wc == null ) )
         {
            WebComp_Wwpaux_wc.componentjscripts();
         }
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
      return "Ingenieria.MRec_AlertaData" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Alertas", "") ;
   }

   public void wb2E20( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.mrec_alertadata");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
            httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelgeneral.setProperty("Width", Dvpanel_panelgeneral_Width);
         ucDvpanel_panelgeneral.setProperty("AutoWidth", Dvpanel_panelgeneral_Autowidth);
         ucDvpanel_panelgeneral.setProperty("AutoHeight", Dvpanel_panelgeneral_Autoheight);
         ucDvpanel_panelgeneral.setProperty("Cls", Dvpanel_panelgeneral_Cls);
         ucDvpanel_panelgeneral.setProperty("Title", Dvpanel_panelgeneral_Title);
         ucDvpanel_panelgeneral.setProperty("Collapsible", Dvpanel_panelgeneral_Collapsible);
         ucDvpanel_panelgeneral.setProperty("Collapsed", Dvpanel_panelgeneral_Collapsed);
         ucDvpanel_panelgeneral.setProperty("ShowCollapseIcon", Dvpanel_panelgeneral_Showcollapseicon);
         ucDvpanel_panelgeneral.setProperty("IconPosition", Dvpanel_panelgeneral_Iconposition);
         ucDvpanel_panelgeneral.setProperty("AutoScroll", Dvpanel_panelgeneral_Autoscroll);
         ucDvpanel_panelgeneral.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelgeneral_Internalname, sPrefix+"DVPANEL_PANELGENERALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_PANELGENERALContainer"+"PanelGeneral"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelgeneral_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTitulogeneral_Internalname, lblTitulogeneral_Caption, "", "", lblTitulogeneral_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AlertaData.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemaquinas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Fsgrid1Container.SetIsFreestyle(true);
         Fsgrid1Container.SetWrapped(nGXWrapped);
         startgridcontrol26( ) ;
      }
      if ( wbEnd == 26 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_26 = (int)(nGXsfl_26_idx-1) ;
         if ( Fsgrid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV132GXV1 = nGXsfl_26_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Fsgrid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Fsgrid1", Fsgrid1Container, subFsgrid1_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Fsgrid1ContainerData", Fsgrid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Fsgrid1ContainerData"+"V", Fsgrid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Fsgrid1ContainerData"+"V"+"\" value='"+Fsgrid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridmrec_alertasdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridmrec_alertasdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol62( ) ;
      }
      if ( wbEnd == 62 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_62 = (int)(nGXsfl_62_idx-1) ;
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV134GXV3 = nGXsfl_62_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_alertasdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmrec_alertasdts", Gridmrec_alertasdtsContainer, subGridmrec_alertasdts_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_alertasdtsContainerData", Gridmrec_alertasdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_alertasdtsContainerData"+"V", Gridmrec_alertasdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridmrec_alertasdtsContainerData"+"V"+"\" value='"+Gridmrec_alertasdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridmrec_alertasdtspaginationbar.setProperty("Class", Gridmrec_alertasdtspaginationbar_Class);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowFirst", Gridmrec_alertasdtspaginationbar_Showfirst);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowPrevious", Gridmrec_alertasdtspaginationbar_Showprevious);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowNext", Gridmrec_alertasdtspaginationbar_Shownext);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowLast", Gridmrec_alertasdtspaginationbar_Showlast);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagesToShow", Gridmrec_alertasdtspaginationbar_Pagestoshow);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagingButtonsPosition", Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagingCaptionPosition", Gridmrec_alertasdtspaginationbar_Pagingcaptionposition);
         ucGridmrec_alertasdtspaginationbar.setProperty("EmptyGridClass", Gridmrec_alertasdtspaginationbar_Emptygridclass);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageSelector", Gridmrec_alertasdtspaginationbar_Rowsperpageselector);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageOptions", Gridmrec_alertasdtspaginationbar_Rowsperpageoptions);
         ucGridmrec_alertasdtspaginationbar.setProperty("Previous", Gridmrec_alertasdtspaginationbar_Previous);
         ucGridmrec_alertasdtspaginationbar.setProperty("Next", Gridmrec_alertasdtspaginationbar_Next);
         ucGridmrec_alertasdtspaginationbar.setProperty("Caption", Gridmrec_alertasdtspaginationbar_Caption);
         ucGridmrec_alertasdtspaginationbar.setProperty("EmptyGridCaption", Gridmrec_alertasdtspaginationbar_Emptygridcaption);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageCaption", Gridmrec_alertasdtspaginationbar_Rowsperpagecaption);
         ucGridmrec_alertasdtspaginationbar.setProperty("CurrentPage", AV55GridMRec_AlertaSDTsCurrentPage);
         ucGridmrec_alertasdtspaginationbar.setProperty("PageCount", AV56GridMRec_AlertaSDTsPageCount);
         ucGridmrec_alertasdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridmrec_alertasdtspaginationbar_Internalname, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV153Pgmname), GXutil.rtrim( localUtil.format( AV153Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_AlertaData.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, sPrefix+"DATAMONContainer");
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
         wb_table1_95_2E22( true) ;
      }
      else
      {
         wb_table1_95_2E22( false) ;
      }
      return  ;
   }

   public void wb_table1_95_2E22e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridmrec_alertasdts_empowerer.render(context, "wwp.gridempowerer", Gridmrec_alertasdts_empowerer_Internalname, sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0102"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0102"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_26_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0102"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 26 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Fsgrid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV132GXV1 = nGXsfl_26_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Fsgrid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Fsgrid1", Fsgrid1Container, subFsgrid1_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Fsgrid1ContainerData", Fsgrid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Fsgrid1ContainerData"+"V", Fsgrid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Fsgrid1ContainerData"+"V"+"\" value='"+Fsgrid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 62 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV134GXV3 = nGXsfl_62_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_alertasdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmrec_alertasdts", Gridmrec_alertasdtsContainer, subGridmrec_alertasdts_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_alertasdtsContainerData", Gridmrec_alertasdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_alertasdtsContainerData"+"V", Gridmrec_alertasdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridmrec_alertasdtsContainerData"+"V"+"\" value='"+Gridmrec_alertasdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2E22( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Alertas", ""), (short)(0)) ;
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
            strup2E20( ) ;
         }
      }
   }

   public void ws2E22( )
   {
      start2E22( ) ;
      evt2E22( ) ;
   }

   public void evt2E22( )
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
                              strup2E20( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavMaquinas__maqcod_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'DOACTUALIZAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E20( ) ;
                           }
                           nGXsfl_26_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_262( ) ;
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_26_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, sPrefix, false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           AV132GXV1 = nGXsfl_26_idx ;
                           if ( ( AV79Maquinas.size() >= AV132GXV1 ) && ( AV132GXV1 > 0 ) )
                           {
                              AV79Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+AV132GXV1)) );
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
                                       GX_FocusControl = edtavMaquinas__maqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e132E22 ();
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
                                       GX_FocusControl = edtavMaquinas__maqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e142E22 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaquinas__maqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e152E22 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOACTUALIZAR'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaquinas__maqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoActualizar' */
                                       e162E22 ();
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
                                    strup2E20( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaquinas__maqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 24), "GRIDMREC_ALERTASDTS.LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E20( ) ;
                           }
                           nGXsfl_62_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_623( ) ;
                           AV134GXV3 = (int)(nGXsfl_62_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
                           if ( ( AV16Datos.size() >= AV134GXV3 ) && ( AV134GXV3 > 0 ) )
                           {
                              AV16Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)) );
                              AV21DetalleLinea = httpContext.cgiGet( edtavDetallelinea_Internalname) ;
                              httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetallelinea_Internalname, "Bitmap", ((GXutil.strcmp("", AV21DetalleLinea)==0) ? AV154Detallelinea_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV21DetalleLinea))), !bGXsfl_62_Refreshing);
                              httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetallelinea_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV21DetalleLinea), true);
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDatos__emprcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e172E23 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup2E20( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaquinas__maqcod_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 102 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0102") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0102", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2E22( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2E22( ) ;
         }
      }
   }

   public void pa2E22( )
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

   public void gxnrfsgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_262( ) ;
      while ( nGXsfl_26_idx <= nRC_GXsfl_26 )
      {
         sendrow_262( ) ;
         nGXsfl_26_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_26_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_26_idx+1) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Fsgrid1Container)) ;
      /* End function gxnrFsgrid1_newrow */
   }

   public void gxnrgridmrec_alertasdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_623( ) ;
      while ( nGXsfl_62_idx <= nRC_GXsfl_62 )
      {
         sendrow_623( ) ;
         nGXsfl_62_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_62_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_623( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmrec_alertasdtsContainer)) ;
      /* End function gxnrGridmrec_alertasdts_newrow */
   }

   public void gxgrfsgrid1_refresh( int subGridmrec_alertasdts_Rows ,
                                    GXSimpleCollection<String> AV75MaqCod ,
                                    GXSimpleCollection<String> AV26FasCod ,
                                    GXSimpleCollection<String> AV59Hdr ,
                                    GXSimpleCollection<Short> AV87ParFasCod ,
                                    GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item> AV79Maquinas ,
                                    String AV25EmprCod ,
                                    String AV12ContCod ,
                                    int AV93Segundos ,
                                    String AV77MaqCodJSON ,
                                    String AV5FasCodJSON ,
                                    String AV6HdrJSON ,
                                    String AV7ParFasCodJSON ,
                                    java.util.Date AV19Desde ,
                                    java.util.Date AV57Hasta ,
                                    String AV102UsurCod ,
                                    String AV64Ip ,
                                    java.util.Date AV105Now ,
                                    boolean AV29FueraRango ,
                                    String AV112MTkn ,
                                    String AV153Pgmname ,
                                    String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e142E22 ();
      FSGRID1_nCurrentRecord = 0 ;
      rf2E22( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaData");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV153Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertadata:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrFsgrid1_refresh */
   }

   public void gxgrgridmrec_alertasdts_refresh( int subGridmrec_alertasdts_Rows ,
                                                GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV16Datos ,
                                                GXSimpleCollection<String> AV75MaqCod ,
                                                GXSimpleCollection<String> AV26FasCod ,
                                                GXSimpleCollection<String> AV59Hdr ,
                                                GXSimpleCollection<Short> AV87ParFasCod ,
                                                String AV25EmprCod ,
                                                String AV12ContCod ,
                                                int AV93Segundos ,
                                                String AV77MaqCodJSON ,
                                                String AV5FasCodJSON ,
                                                String AV6HdrJSON ,
                                                String AV7ParFasCodJSON ,
                                                java.util.Date AV19Desde ,
                                                java.util.Date AV57Hasta ,
                                                String AV102UsurCod ,
                                                String AV64Ip ,
                                                java.util.Date AV105Now ,
                                                boolean AV29FueraRango ,
                                                String AV112MTkn ,
                                                String AV153Pgmname ,
                                                String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e142E22 ();
      GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
      rf2E23( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaData");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV153Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertadata:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridmrec_alertasdts_refresh */
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
      rf2E22( ) ;
      rf2E23( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV153Pgmname = "Ingenieria.MRec_AlertaData" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Pgmname", AV153Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_62_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2E22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Fsgrid1Container.ClearRows();
      }
      wbStart = (short)(26) ;
      /* Execute user event: Refresh */
      e142E22 ();
      nGXsfl_26_idx = 1 ;
      sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_262( ) ;
      bGXsfl_26_Refreshing = true ;
      Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
      Fsgrid1Container.AddObjectProperty("CmpContext", sPrefix);
      Fsgrid1Container.AddObjectProperty("InMasterPage", "false");
      Fsgrid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      Fsgrid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Fsgrid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Fsgrid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Fsgrid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Fsgrid1Container.setPageSize( subfsgrid1_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_262( ) ;
         e152E22 ();
         wbEnd = (short)(26) ;
         wb2E20( ) ;
      }
      bGXsfl_26_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2E22( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMAQCOD", AV75MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMAQCOD", AV75MaqCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCOD", getSecureSignedToken( sPrefix, AV75MaqCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFASCOD", AV26FasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFASCOD", AV26FasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, AV26FasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vHDR", AV59Hdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vHDR", AV59Hdr);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDR", getSecureSignedToken( sPrefix, AV59Hdr));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARFASCOD", AV87ParFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARFASCOD", AV87ParFasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARFASCOD", getSecureSignedToken( sPrefix, AV87ParFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTCOD", GXutil.rtrim( AV12ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSEGUNDOS", GXutil.ltrim( localUtil.ntoc( AV93Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSEGUNDOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Segundos), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODJSON", AV77MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77MaqCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODJSON", AV5FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5FasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHDRJSON", AV6HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDRJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6HdrJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARFASCODJSON", AV7ParFasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7ParFasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDESDE", localUtil.ttoc( AV19Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDESDE", getSecureSignedToken( sPrefix, localUtil.format( AV19Desde, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASTA", localUtil.ttoc( AV57Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHASTA", getSecureSignedToken( sPrefix, localUtil.format( AV57Hasta, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV102UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIP", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOW", localUtil.ttoc( AV105Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNOW", getSecureSignedToken( sPrefix, localUtil.format( AV105Now, "99/99/99 99:99:99.999")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vFUERARANGO", AV29FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFUERARANGO", getSecureSignedToken( sPrefix, AV29FueraRango));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV112MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTKN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112MTkn, ""))));
   }

   public void rf2E23( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridmrec_alertasdtsContainer.ClearRows();
      }
      wbStart = (short)(62) ;
      nGXsfl_62_idx = 1 ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_623( ) ;
      bGXsfl_62_Refreshing = true ;
      Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
      Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", sPrefix);
      Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.setPageSize( subgridmrec_alertasdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_623( ) ;
         e172E23 ();
         if ( ( GRIDMREC_ALERTASDTS_nCurrentRecord > 0 ) && ( GRIDMREC_ALERTASDTS_nGridOutOfScope == 0 ) && ( nGXsfl_62_idx == 1 ) )
         {
            GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
            GRIDMREC_ALERTASDTS_nGridOutOfScope = 1 ;
            subgridmrec_alertasdts_firstpage( ) ;
            e172E23 ();
         }
         wbEnd = (short)(62) ;
         wb2E20( ) ;
      }
      bGXsfl_62_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2E23( )
   {
   }

   public int subfsgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subgridmrec_alertasdts_fnc_pagecount( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nRecordCount/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nRecordCount/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridmrec_alertasdts_fnc_recordcount( )
   {
      return AV16Datos.size() ;
   }

   public int subgridmrec_alertasdts_fnc_recordsperpage( )
   {
      if ( subGridmrec_alertasdts_Rows > 0 )
      {
         return subGridmrec_alertasdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridmrec_alertasdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nFirstRecordOnPage/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridmrec_alertasdts_firstpage( )
   {
      GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV16Datos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_alertasdts_nextpage( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( ( GRIDMREC_ALERTASDTS_nRecordCount >= subgridmrec_alertasdts_fnc_recordsperpage( ) ) && ( GRIDMREC_ALERTASDTS_nEOF == 0 ) )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nFirstRecordOnPage+subgridmrec_alertasdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GRIDMREC_ALERTASDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV16Datos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDMREC_ALERTASDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridmrec_alertasdts_previouspage( )
   {
      if ( GRIDMREC_ALERTASDTS_nFirstRecordOnPage >= subgridmrec_alertasdts_fnc_recordsperpage( ) )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nFirstRecordOnPage-subgridmrec_alertasdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV16Datos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_alertasdts_lastpage( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( GRIDMREC_ALERTASDTS_nRecordCount > subgridmrec_alertasdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nRecordCount-subgridmrec_alertasdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nRecordCount-((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV16Datos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridmrec_alertasdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(subgridmrec_alertasdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV16Datos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV153Pgmname = "Ingenieria.MRec_AlertaData" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Pgmname", AV153Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_62_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2E20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132E22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Maquinas"), AV79Maquinas);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Datos"), AV16Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDATOS"), AV16Datos);
         /* Read saved values. */
         nRC_GXsfl_26 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_26"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV55GridMRec_AlertaSDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_ALERTASDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV56GridMRec_AlertaSDTsPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_ALERTASDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV121inEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV121inEmprCod") ;
         wcpOAV122inContCod = httpContext.cgiGet( sPrefix+"wcpOAV122inContCod") ;
         wcpOAV125inSegundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125inSegundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV117inMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV117inMaqCodJSON") ;
         wcpOAV118inFasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV118inFasCodJSon") ;
         wcpOAV119inHdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV119inHdrJSON") ;
         wcpOAV120inParFasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV120inParFasCodJSon") ;
         wcpOAV126inFueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV126inFueraRango")) ;
         wcpOAV127inDesde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV127inDesde"), 0) ;
         wcpOAV128inHasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV128inHasta"), 0) ;
         wcpOAV123inUsurCod = httpContext.cgiGet( sPrefix+"wcpOAV123inUsurCod") ;
         wcpOAV124inIp = httpContext.cgiGet( sPrefix+"wcpOAV124inIp") ;
         wcpOAV129inNow = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV129inNow"), 0) ;
         wcpOAV108InFilTkn = httpContext.cgiGet( sPrefix+"wcpOAV108InFilTkn") ;
         AV108InFilTkn = httpContext.cgiGet( sPrefix+"vINFILTKN") ;
         AV105Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"vNOW"), 0) ;
         AV64Ip = httpContext.cgiGet( sPrefix+"vIP") ;
         AV102UsurCod = httpContext.cgiGet( sPrefix+"vUSURCOD") ;
         AV57Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"vHASTA"), 0) ;
         AV19Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"vDESDE"), 0) ;
         AV7ParFasCodJSON = httpContext.cgiGet( sPrefix+"vPARFASCODJSON") ;
         AV6HdrJSON = httpContext.cgiGet( sPrefix+"vHDRJSON") ;
         AV5FasCodJSON = httpContext.cgiGet( sPrefix+"vFASCODJSON") ;
         AV77MaqCodJSON = httpContext.cgiGet( sPrefix+"vMAQCODJSON") ;
         AV93Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vSEGUNDOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV12ContCod = httpContext.cgiGet( sPrefix+"vCONTCOD") ;
         AV25EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDMREC_ALERTASDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridmrec_alertasdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridmrec_alertasdtspaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Class") ;
         Gridmrec_alertasdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Showfirst")) ;
         Gridmrec_alertasdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Showprevious")) ;
         Gridmrec_alertasdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Shownext")) ;
         Gridmrec_alertasdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Showlast")) ;
         Gridmrec_alertasdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridmrec_alertasdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridmrec_alertasdtspaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridclass") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridmrec_alertasdtspaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Previous") ;
         Gridmrec_alertasdtspaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Next") ;
         Gridmrec_alertasdtspaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Caption") ;
         Gridmrec_alertasdtspaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_panelgeneral_Width = httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Width") ;
         Dvpanel_panelgeneral_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Autowidth")) ;
         Dvpanel_panelgeneral_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Autoheight")) ;
         Dvpanel_panelgeneral_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Cls") ;
         Dvpanel_panelgeneral_Title = httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Title") ;
         Dvpanel_panelgeneral_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Collapsible")) ;
         Dvpanel_panelgeneral_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Collapsed")) ;
         Dvpanel_panelgeneral_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Showcollapseicon")) ;
         Dvpanel_panelgeneral_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Iconposition") ;
         Dvpanel_panelgeneral_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELGENERAL_Autoscroll")) ;
         Vererrrormaquina_modal_Width = httpContext.cgiGet( sPrefix+"VERERRRORMAQUINA_MODAL_Width") ;
         Vererrrormaquina_modal_Title = httpContext.cgiGet( sPrefix+"VERERRRORMAQUINA_MODAL_Title") ;
         Vererrrormaquina_modal_Confirmtype = httpContext.cgiGet( sPrefix+"VERERRRORMAQUINA_MODAL_Confirmtype") ;
         Vererrrormaquina_modal_Bodytype = httpContext.cgiGet( sPrefix+"VERERRRORMAQUINA_MODAL_Bodytype") ;
         Gridmrec_alertasdts_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname") ;
         subFsgrid1_Class = httpContext.cgiGet( sPrefix+"FSGRID1_Class") ;
         subFsgrid1_Paged = httpContext.cgiGet( sPrefix+"FSGRID1_Paged") ;
         subFsgrid1_Showpagecontroller = httpContext.cgiGet( sPrefix+"FSGRID1_Showpagecontroller") ;
         subFsgrid1_Showarrows = httpContext.cgiGet( sPrefix+"FSGRID1_Showarrows") ;
         Gridmrec_alertasdtspaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_26 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_26"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_26_fel_idx = 0 ;
         while ( nGXsfl_26_fel_idx < nRC_GXsfl_26 )
         {
            nGXsfl_26_fel_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_26_fel_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_26_fel_idx+1) ;
            sGXsfl_26_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_262( ) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_26_fel_idx ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+GXCCtl)) ;
            AV132GXV1 = nGXsfl_26_fel_idx ;
            if ( ( AV79Maquinas.size() >= AV132GXV1 ) && ( AV132GXV1 > 0 ) )
            {
               AV79Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+AV132GXV1)) );
            }
         }
         if ( nGXsfl_26_fel_idx == 0 )
         {
            nGXsfl_26_idx = 1 ;
            sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_262( ) ;
         }
         nGXsfl_26_fel_idx = 1 ;
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_62_fel_idx = 0 ;
         while ( nGXsfl_62_fel_idx < nRC_GXsfl_62 )
         {
            nGXsfl_62_fel_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_62_fel_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_62_fel_idx+1) ;
            sGXsfl_62_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_623( ) ;
            AV134GXV3 = (int)(nGXsfl_62_fel_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
            if ( ( AV16Datos.size() >= AV134GXV3 ) && ( AV134GXV3 > 0 ) )
            {
               AV16Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)) );
               AV21DetalleLinea = httpContext.cgiGet( edtavDetallelinea_Internalname) ;
            }
         }
         if ( nGXsfl_62_fel_idx == 0 )
         {
            nGXsfl_62_idx = 1 ;
            sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_623( ) ;
         }
         nGXsfl_62_fel_idx = 1 ;
         /* Read variables values. */
         AV153Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Pgmname", AV153Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_62_idx = (int)(localUtil.cton( httpContext.cgiGet( subGridmrec_alertasdts_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_623( ) ;
         AV134GXV3 = (int)(nGXsfl_62_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
         if ( nGXsfl_62_idx > 0 )
         {
            AV134GXV3 = (int)(nGXsfl_62_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
            if ( ( AV16Datos.size() >= AV134GXV3 ) && ( AV134GXV3 > 0 ) )
            {
               AV16Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)) );
               AV21DetalleLinea = httpContext.cgiGet( edtavDetallelinea_Internalname) ;
            }
            if ( ( AV134GXV3 > 0 ) && ( AV16Datos.size() >= AV134GXV3 ) )
            {
               AV16Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaData");
         AV153Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Pgmname", AV153Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV153Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_alertadata:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e132E22 ();
      if (returnInSub) return;
   }

   public void e132E22( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV25EmprCod = AV121inEmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      AV12ContCod = AV122inContCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ContCod", AV12ContCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12ContCod, "@!"))));
      AV93Segundos = AV125inSegundos ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSEGUNDOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Segundos), "ZZZZZ9")));
      AV75MaqCod.fromJSonString(AV117inMaqCodJSON, null);
      AV26FasCod.fromJSonString(AV118inFasCodJSon, null);
      AV59Hdr.fromJSonString(AV119inHdrJSON, null);
      AV87ParFasCod.fromJSonString(AV120inParFasCodJSon, null);
      AV29FueraRango = AV126inFueraRango ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FueraRango", AV29FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFUERARANGO", getSecureSignedToken( sPrefix, AV29FueraRango));
      AV19Desde = AV127inDesde ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Desde", localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDESDE", getSecureSignedToken( sPrefix, localUtil.format( AV19Desde, "99/99/99 99:99:99.999")));
      AV57Hasta = AV128inHasta ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Hasta", localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHASTA", getSecureSignedToken( sPrefix, localUtil.format( AV57Hasta, "99/99/99 99:99:99.999")));
      AV102UsurCod = AV123inUsurCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102UsurCod", AV102UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      AV64Ip = AV124inIp ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Ip", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIP", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      AV105Now = AV129inNow ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105Now", localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNOW", getSecureSignedToken( sPrefix, localUtil.format( AV105Now, "99/99/99 99:99:99.999")));
      AV112MTkn = AV108InFilTkn ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112MTkn", AV112MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTKN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112MTkn, ""))));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Inicia alerta DATA:EmprCod:%1, ContCod:%2, Intervalo:%3, Maquinas:%4, Fases;%5, &HDR:%6, Parametro:%7, Error:%8, %9.", ""), AV25EmprCod, AV12ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), AV75MaqCod.toJSonString(false), AV26FasCod.toJSonString(false), AV59Hdr.toJSonString(false), AV87ParFasCod.toJSonString(false), GXutil.booltostr( AV29FueraRango), GXutil.format( httpContext.getMessage( "Fechas:%1-%2, Usuario:%3, Ip:%4, Now:%5, Token:%6.", ""), localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV102UsurCod, AV64Ip, localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV112MTkn, "", "", "")), AV153Pgmname) ;
      GXt_char1 = AV113Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mrec_alertadata_impl.this.GXt_char1 = GXv_char2[0] ;
      AV113Station = GXt_char1 ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV114EmprNom ;
      GXv_char4[0] = AV102UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV113Station, GXv_char2, GXv_char3, GXv_char4) ;
      mrec_alertadata_impl.this.AV25EmprCod = GXv_char2[0] ;
      mrec_alertadata_impl.this.AV114EmprNom = GXv_char3[0] ;
      mrec_alertadata_impl.this.AV102UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102UsurCod", AV102UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      Gridmrec_alertasdts_empowerer_Gridinternalname = subGridmrec_alertasdts_Internalname ;
      ucGridmrec_alertasdts_empowerer.sendProperty(context, sPrefix, false, Gridmrec_alertasdts_empowerer_Internalname, "GridInternalName", Gridmrec_alertasdts_empowerer_Gridinternalname);
      subGridmrec_alertasdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      edtavMaquinas__maqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaquinas__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaquinas__maqcod_Visible), 5, 0), !bGXsfl_26_Refreshing);
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_alertasdts_Rows ;
      ucGridmrec_alertasdtspaginationbar.sendProperty(context, sPrefix, false, Gridmrec_alertasdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      subGridmrec_alertasdts_Rows = 5 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S112 ();
      if (returnInSub) return;
   }

   public void e142E22( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV55GridMRec_AlertaSDTsCurrentPage = subgridmrec_alertasdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GridMRec_AlertaSDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridMRec_AlertaSDTsCurrentPage), 10, 0));
      AV56GridMRec_AlertaSDTsPageCount = subgridmrec_alertasdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56GridMRec_AlertaSDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridMRec_AlertaSDTsPageCount), 10, 0));
      edtavDetallelinea_Columnheaderclass = "WWActionColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetallelinea_Internalname, "Columnheaderclass", edtavDetallelinea_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__mprecfec_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Columnheaderclass", edtavDatos__mprecfec_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__barcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcod_Internalname, "Columnheaderclass", edtavDatos__barcod_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__barcodreo_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodreo_Internalname, "Columnheaderclass", edtavDatos__barcodreo_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__barcodpar_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodpar_Internalname, "Columnheaderclass", edtavDatos__barcodpar_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__maqcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqcod_Internalname, "Columnheaderclass", edtavDatos__maqcod_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__maqdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqdsc_Internalname, "Columnheaderclass", edtavDatos__maqdsc_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__mprecplc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecplc_Internalname, "Columnheaderclass", edtavDatos__mprecplc_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__fascod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fascod_Internalname, "Columnheaderclass", edtavDatos__fascod_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__fasdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fasdsc_Internalname, "Columnheaderclass", edtavDatos__fasdsc_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__parfascod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Columnheaderclass", edtavDatos__parfascod_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__parfasdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Columnheaderclass", edtavDatos__parfasdsc_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__mprecvalmn_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Columnheaderclass", edtavDatos__mprecvalmn_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__mprecval_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Columnheaderclass", edtavDatos__mprecval_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavDatos__mprecvalmx_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Columnheaderclass", edtavDatos__mprecvalmx_Columnheaderclass, !bGXsfl_62_Refreshing);
      chkavDatos__mprecer.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Columnheaderclass", chkavDatos__mprecer.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      /*  Sending Event outputs  */
   }

   private void e152E22( )
   {
      /* Fsgrid1_Load Routine */
      returnInSub = false ;
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV79Maquinas.size() )
      {
         AV79Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+AV132GXV1)) );
         AV77MaqCodJSON = AV75MaqCod.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77MaqCodJSON", AV77MaqCodJSON);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77MaqCodJSON, ""))));
         AV5FasCodJSON = AV26FasCod.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5FasCodJSON", AV5FasCodJSON);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5FasCodJSON, ""))));
         AV6HdrJSON = AV59Hdr.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HdrJSON", AV6HdrJSON);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHDRJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6HdrJSON, ""))));
         AV7ParFasCodJSON = AV87ParFasCod.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ParFasCodJSON", AV7ParFasCodJSON);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARFASCODJSON", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV7ParFasCodJSON, ""))));
         lblTbmaquina_Caption = ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)(AV79Maquinas.currentItem())).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod() ;
         if ( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)(AV79Maquinas.currentItem())).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr().doubleValue() == 0 )
         {
            lblImgcircle_Caption = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:green; '></i>", "") ;
         }
         else
         {
            lblImgcircle_Caption = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:red; '></i>", "") ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(26) ;
         }
         sendrow_262( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_26_Refreshing )
         {
            httpContext.doAjaxLoad(26, Fsgrid1Row);
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e112E22( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridmrec_alertasdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV84PageToGo = subgridmrec_alertasdts_fnc_currentpage( ) ;
         AV84PageToGo = (int)(AV84PageToGo+1) ;
         subgridmrec_alertasdts_gotopage( AV84PageToGo) ;
      }
      else
      {
         AV84PageToGo = (int)(GXutil.lval( Gridmrec_alertasdtspaginationbar_Selectedpage)) ;
         subgridmrec_alertasdts_gotopage( AV84PageToGo) ;
      }
   }

   public void e122E22( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridmrec_alertasdts_Rows = Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridmrec_alertasdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e162E22( )
   {
      AV134GXV3 = (int)(nGXsfl_62_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
      if ( ( AV134GXV3 > 0 ) && ( AV16Datos.size() >= AV134GXV3 ) )
      {
         AV16Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)) );
      }
      AV132GXV1 = nGXsfl_26_idx ;
      if ( ( AV132GXV1 > 0 ) && ( AV79Maquinas.size() >= AV132GXV1 ) )
      {
         AV79Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+AV132GXV1)) );
      }
      /* 'DoActualizar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      if ( gx_BV62 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16Datos", AV16Datos);
         nGXsfl_62_bak_idx = nGXsfl_62_idx ;
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV16Datos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
         nGXsfl_62_idx = nGXsfl_62_bak_idx ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_623( ) ;
      }
      if ( gx_BV26 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV79Maquinas", AV79Maquinas);
         nGXsfl_26_bak_idx = nGXsfl_26_idx ;
         gxgrfsgrid1_refresh( subGridmrec_alertasdts_Rows, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV79Maquinas, AV25EmprCod, AV12ContCod, AV93Segundos, AV77MaqCodJSON, AV5FasCodJSON, AV6HdrJSON, AV7ParFasCodJSON, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV29FueraRango, AV112MTkn, AV153Pgmname, sPrefix) ;
         nGXsfl_26_idx = nGXsfl_26_bak_idx ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
   }

   public void S112( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      lblTitulogeneral_Caption = GXutil.format( httpContext.getMessage( "%7Actualizando", ""), httpContext.getMessage( "<i class='fa fa-search' style='color:red; '></i>", ""), "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTitulogeneral_Internalname, "Caption", lblTitulogeneral_Caption, true);
      GXt_objcol_SdtMRec_AlertaSDT_Item5 = AV16Datos ;
      GXv_objcol_SdtMRec_AlertaSDT_Item6[0] = GXt_objcol_SdtMRec_AlertaSDT_Item5 ;
      new app.ingenieria.mrec_alertapr(remoteHandle, context).execute( AV25EmprCod, AV12ContCod, AV93Segundos, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV29FueraRango, AV19Desde, AV57Hasta, AV102UsurCod, AV64Ip, AV105Now, AV112MTkn, GXv_objcol_SdtMRec_AlertaSDT_Item6) ;
      GXt_objcol_SdtMRec_AlertaSDT_Item5 = GXv_objcol_SdtMRec_AlertaSDT_Item6[0] ;
      AV16Datos = GXt_objcol_SdtMRec_AlertaSDT_Item5 ;
      gx_BV62 = true ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Trae Datos:%1", ""), AV16Datos.toJSonString(false), "", "", "", "", "", "", "", ""), AV153Pgmname) ;
      AV17DatosClone.clear();
      AV17DatosClone = AV16Datos.Clone() ;
      AV17DatosClone.sort(httpContext.getMessage( "MaqCod", ""));
      AV79Maquinas.clear();
      gx_BV26 = true ;
      AV155GXV22 = 1 ;
      while ( AV155GXV22 <= AV17DatosClone.size() )
      {
         AV15Dato = (app.ingenieria.SdtMRec_AlertaSDT_Item)((app.ingenieria.SdtMRec_AlertaSDT_Item)AV17DatosClone.elementAt(-1+AV155GXV22));
         AV63Index = (short)(0) ;
         AV62i = 1 ;
         while ( AV62i <= AV79Maquinas.size() )
         {
            if ( GXutil.strcmp(((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+(int)(AV62i))).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(), AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqcod()) == 0 )
            {
               AV63Index = (short)(AV62i) ;
               if (true) break;
            }
            AV62i = (long)(AV62i+1) ;
         }
         if ( AV63Index == 0 )
         {
            AV78Maquina = (app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)new app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item(remoteHandle, context);
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Emprcod() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Barcod() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Menvord() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Mreclin() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqcod() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqdsc() );
            AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr( DecimalUtil.doubleToDec(0) );
            AV79Maquinas.add(AV78Maquina, 0);
            gx_BV26 = true ;
         }
         AV155GXV22 = (int)(AV155GXV22+1) ;
      }
      AV62i = 1 ;
      while ( AV62i <= AV79Maquinas.size() )
      {
         AV156GXV23 = 1 ;
         while ( AV156GXV23 <= AV17DatosClone.size() )
         {
            AV15Dato = (app.ingenieria.SdtMRec_AlertaSDT_Item)((app.ingenieria.SdtMRec_AlertaSDT_Item)AV17DatosClone.elementAt(-1+AV156GXV23));
            if ( ( AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Mprecer() ) && ( GXutil.strcmp(AV15Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqcod(), ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+(int)(AV62i))).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod()) == 0 ) )
            {
               ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+(int)(AV62i))).setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr( DecimalUtil.doubleToDec(1) );
               if (true) break;
            }
            AV156GXV23 = (int)(AV156GXV23+1) ;
         }
         AV62i = (long)(AV62i+1) ;
      }
      AV17DatosClone.clear();
      lblTitulogeneral_Caption = GXutil.format( httpContext.getMessage( "%7Actualizado a:%8, con el Intervalo:%1, Maquinas:%2, Fases:%3, Hdrs:%4, Parametro:%5, Error:%6.", ""), GXutil.format( " %1 (%2-%3) ", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", ""), AV75MaqCod.toJSonString(false), AV26FasCod.toJSonString(false), AV59Hdr.toJSonString(false), AV87ParFasCod.toJSonString(false), GXutil.booltostr( AV29FueraRango), httpContext.getMessage( "<i class='fa fa-search' style='color:green; '></i>", ""), localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTitulogeneral_Internalname, "Caption", lblTitulogeneral_Caption, true);
   }

   private void e172E23( )
   {
      /* Gridmrec_alertasdts_Load Routine */
      returnInSub = false ;
      AV134GXV3 = 1 ;
      while ( AV134GXV3 <= AV16Datos.size() )
      {
         AV16Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)) );
         edtavDetallelinea_gximage = "ActionDisplay" ;
         AV21DetalleLinea = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetallelinea_Internalname, AV21DetalleLinea);
         AV154Detallelinea_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavDetallelinea_Tooltiptext = "" ;
         edtavDetallelinea_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWActionColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionColumn") ;
         edtavDatos__mprecfec_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__barcod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__barcodreo_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__barcodpar_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__maqcod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__maqdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecplc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__fascod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__fasdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__parfascod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__parfasdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmn_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecval_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmx_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         chkavDatos__mprecer.setColumnClass( ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV16Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(62) ;
         }
         if ( ( subGridmrec_alertasdts_Islastpage == 1 ) || ( subGridmrec_alertasdts_Rows == 0 ) || ( ( GRIDMREC_ALERTASDTS_nCurrentRecord >= GRIDMREC_ALERTASDTS_nFirstRecordOnPage ) && ( GRIDMREC_ALERTASDTS_nCurrentRecord < GRIDMREC_ALERTASDTS_nFirstRecordOnPage + subgridmrec_alertasdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_623( ) ;
            GRIDMREC_ALERTASDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDMREC_ALERTASDTS_nCurrentRecord + 1 >= subgridmrec_alertasdts_fnc_recordcount( ) )
            {
               GRIDMREC_ALERTASDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDMREC_ALERTASDTS_nCurrentRecord = (long)(GRIDMREC_ALERTASDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_62_Refreshing )
         {
            httpContext.doAjaxLoad(62, Gridmrec_alertasdtsRow);
         }
         AV134GXV3 = (int)(AV134GXV3+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_95_2E22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablevererrrormaquina_modal_Internalname, tblTablevererrrormaquina_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucVererrrormaquina_modal.setProperty("Width", Vererrrormaquina_modal_Width);
         ucVererrrormaquina_modal.setProperty("Title", Vererrrormaquina_modal_Title);
         ucVererrrormaquina_modal.setProperty("ConfirmType", Vererrrormaquina_modal_Confirmtype);
         ucVererrrormaquina_modal.setProperty("BodyType", Vererrrormaquina_modal_Bodytype);
         ucVererrrormaquina_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Vererrrormaquina_modal_Internalname, sPrefix+"VERERRRORMAQUINA_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"VERERRRORMAQUINA_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_95_2E22e( true) ;
      }
      else
      {
         wb_table1_95_2E22e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV121inEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121inEmprCod", AV121inEmprCod);
      AV122inContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122inContCod", AV122inContCod);
      AV125inSegundos = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125inSegundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125inSegundos), 6, 0));
      AV117inMaqCodJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117inMaqCodJSON", AV117inMaqCodJSON);
      AV118inFasCodJSon = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118inFasCodJSon", AV118inFasCodJSon);
      AV119inHdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119inHdrJSON", AV119inHdrJSON);
      AV120inParFasCodJSon = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120inParFasCodJSon", AV120inParFasCodJSon);
      AV126inFueraRango = ((Boolean) getParm(obj,7,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126inFueraRango", AV126inFueraRango);
      AV127inDesde = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127inDesde", localUtil.ttoc( AV127inDesde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV128inHasta = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128inHasta", localUtil.ttoc( AV128inHasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV123inUsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123inUsurCod", AV123inUsurCod);
      AV124inIp = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124inIp", AV124inIp);
      AV129inNow = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129inNow", localUtil.ttoc( AV129inNow, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV108InFilTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108InFilTkn", AV108InFilTkn);
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
      pa2E22( ) ;
      ws2E22( ) ;
      we2E22( ) ;
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
      sCtrlAV121inEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV122inContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV125inSegundos = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV117inMaqCodJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV118inFasCodJSon = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV119inHdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV120inParFasCodJSon = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV126inFueraRango = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV127inDesde = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV128inHasta = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV123inUsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV124inIp = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV129inNow = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV108InFilTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2E22( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\mrec_alertadata", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2E22( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV121inEmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121inEmprCod", AV121inEmprCod);
         AV122inContCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122inContCod", AV122inContCod);
         AV125inSegundos = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125inSegundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125inSegundos), 6, 0));
         AV117inMaqCodJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117inMaqCodJSON", AV117inMaqCodJSON);
         AV118inFasCodJSon = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118inFasCodJSon", AV118inFasCodJSon);
         AV119inHdrJSON = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119inHdrJSON", AV119inHdrJSON);
         AV120inParFasCodJSon = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120inParFasCodJSon", AV120inParFasCodJSon);
         AV126inFueraRango = ((Boolean) getParm(obj,9,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126inFueraRango", AV126inFueraRango);
         AV127inDesde = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127inDesde", localUtil.ttoc( AV127inDesde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV128inHasta = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128inHasta", localUtil.ttoc( AV128inHasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV123inUsurCod = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123inUsurCod", AV123inUsurCod);
         AV124inIp = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124inIp", AV124inIp);
         AV129inNow = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129inNow", localUtil.ttoc( AV129inNow, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV108InFilTkn = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108InFilTkn", AV108InFilTkn);
      }
      wcpOAV121inEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV121inEmprCod") ;
      wcpOAV122inContCod = httpContext.cgiGet( sPrefix+"wcpOAV122inContCod") ;
      wcpOAV125inSegundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125inSegundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV117inMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV117inMaqCodJSON") ;
      wcpOAV118inFasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV118inFasCodJSon") ;
      wcpOAV119inHdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV119inHdrJSON") ;
      wcpOAV120inParFasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV120inParFasCodJSon") ;
      wcpOAV126inFueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV126inFueraRango")) ;
      wcpOAV127inDesde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV127inDesde"), 0) ;
      wcpOAV128inHasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV128inHasta"), 0) ;
      wcpOAV123inUsurCod = httpContext.cgiGet( sPrefix+"wcpOAV123inUsurCod") ;
      wcpOAV124inIp = httpContext.cgiGet( sPrefix+"wcpOAV124inIp") ;
      wcpOAV129inNow = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV129inNow"), 0) ;
      wcpOAV108InFilTkn = httpContext.cgiGet( sPrefix+"wcpOAV108InFilTkn") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV121inEmprCod, wcpOAV121inEmprCod) != 0 ) || ( GXutil.strcmp(AV122inContCod, wcpOAV122inContCod) != 0 ) || ( AV125inSegundos != wcpOAV125inSegundos ) || ( GXutil.strcmp(AV117inMaqCodJSON, wcpOAV117inMaqCodJSON) != 0 ) || ( GXutil.strcmp(AV118inFasCodJSon, wcpOAV118inFasCodJSon) != 0 ) || ( GXutil.strcmp(AV119inHdrJSON, wcpOAV119inHdrJSON) != 0 ) || ( GXutil.strcmp(AV120inParFasCodJSon, wcpOAV120inParFasCodJSon) != 0 ) || ( AV126inFueraRango != wcpOAV126inFueraRango ) || !( GXutil.dateCompare(AV127inDesde, wcpOAV127inDesde) ) || !( GXutil.dateCompare(AV128inHasta, wcpOAV128inHasta) ) || ( GXutil.strcmp(AV123inUsurCod, wcpOAV123inUsurCod) != 0 ) || ( GXutil.strcmp(AV124inIp, wcpOAV124inIp) != 0 ) || !( GXutil.dateCompare(AV129inNow, wcpOAV129inNow) ) || ( GXutil.strcmp(AV108InFilTkn, wcpOAV108InFilTkn) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV121inEmprCod = AV121inEmprCod ;
      wcpOAV122inContCod = AV122inContCod ;
      wcpOAV125inSegundos = AV125inSegundos ;
      wcpOAV117inMaqCodJSON = AV117inMaqCodJSON ;
      wcpOAV118inFasCodJSon = AV118inFasCodJSon ;
      wcpOAV119inHdrJSON = AV119inHdrJSON ;
      wcpOAV120inParFasCodJSon = AV120inParFasCodJSon ;
      wcpOAV126inFueraRango = AV126inFueraRango ;
      wcpOAV127inDesde = AV127inDesde ;
      wcpOAV128inHasta = AV128inHasta ;
      wcpOAV123inUsurCod = AV123inUsurCod ;
      wcpOAV124inIp = AV124inIp ;
      wcpOAV129inNow = AV129inNow ;
      wcpOAV108InFilTkn = AV108InFilTkn ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV121inEmprCod = httpContext.cgiGet( sPrefix+"AV121inEmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV121inEmprCod) > 0 )
      {
         AV121inEmprCod = httpContext.cgiGet( sCtrlAV121inEmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121inEmprCod", AV121inEmprCod);
      }
      else
      {
         AV121inEmprCod = httpContext.cgiGet( sPrefix+"AV121inEmprCod_PARM") ;
      }
      sCtrlAV122inContCod = httpContext.cgiGet( sPrefix+"AV122inContCod_CTRL") ;
      if ( GXutil.len( sCtrlAV122inContCod) > 0 )
      {
         AV122inContCod = httpContext.cgiGet( sCtrlAV122inContCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122inContCod", AV122inContCod);
      }
      else
      {
         AV122inContCod = httpContext.cgiGet( sPrefix+"AV122inContCod_PARM") ;
      }
      sCtrlAV125inSegundos = httpContext.cgiGet( sPrefix+"AV125inSegundos_CTRL") ;
      if ( GXutil.len( sCtrlAV125inSegundos) > 0 )
      {
         AV125inSegundos = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV125inSegundos), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125inSegundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125inSegundos), 6, 0));
      }
      else
      {
         AV125inSegundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV125inSegundos_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV117inMaqCodJSON = httpContext.cgiGet( sPrefix+"AV117inMaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV117inMaqCodJSON) > 0 )
      {
         AV117inMaqCodJSON = httpContext.cgiGet( sCtrlAV117inMaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117inMaqCodJSON", AV117inMaqCodJSON);
      }
      else
      {
         AV117inMaqCodJSON = httpContext.cgiGet( sPrefix+"AV117inMaqCodJSON_PARM") ;
      }
      sCtrlAV118inFasCodJSon = httpContext.cgiGet( sPrefix+"AV118inFasCodJSon_CTRL") ;
      if ( GXutil.len( sCtrlAV118inFasCodJSon) > 0 )
      {
         AV118inFasCodJSon = httpContext.cgiGet( sCtrlAV118inFasCodJSon) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118inFasCodJSon", AV118inFasCodJSon);
      }
      else
      {
         AV118inFasCodJSon = httpContext.cgiGet( sPrefix+"AV118inFasCodJSon_PARM") ;
      }
      sCtrlAV119inHdrJSON = httpContext.cgiGet( sPrefix+"AV119inHdrJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV119inHdrJSON) > 0 )
      {
         AV119inHdrJSON = httpContext.cgiGet( sCtrlAV119inHdrJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119inHdrJSON", AV119inHdrJSON);
      }
      else
      {
         AV119inHdrJSON = httpContext.cgiGet( sPrefix+"AV119inHdrJSON_PARM") ;
      }
      sCtrlAV120inParFasCodJSon = httpContext.cgiGet( sPrefix+"AV120inParFasCodJSon_CTRL") ;
      if ( GXutil.len( sCtrlAV120inParFasCodJSon) > 0 )
      {
         AV120inParFasCodJSon = httpContext.cgiGet( sCtrlAV120inParFasCodJSon) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120inParFasCodJSon", AV120inParFasCodJSon);
      }
      else
      {
         AV120inParFasCodJSon = httpContext.cgiGet( sPrefix+"AV120inParFasCodJSon_PARM") ;
      }
      sCtrlAV126inFueraRango = httpContext.cgiGet( sPrefix+"AV126inFueraRango_CTRL") ;
      if ( GXutil.len( sCtrlAV126inFueraRango) > 0 )
      {
         AV126inFueraRango = GXutil.strtobool( httpContext.cgiGet( sCtrlAV126inFueraRango)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126inFueraRango", AV126inFueraRango);
      }
      else
      {
         AV126inFueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV126inFueraRango_PARM")) ;
      }
      sCtrlAV127inDesde = httpContext.cgiGet( sPrefix+"AV127inDesde_CTRL") ;
      if ( GXutil.len( sCtrlAV127inDesde) > 0 )
      {
         AV127inDesde = localUtil.ctot( httpContext.cgiGet( sCtrlAV127inDesde), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127inDesde", localUtil.ttoc( AV127inDesde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV127inDesde = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV127inDesde_PARM"), 0) ;
      }
      sCtrlAV128inHasta = httpContext.cgiGet( sPrefix+"AV128inHasta_CTRL") ;
      if ( GXutil.len( sCtrlAV128inHasta) > 0 )
      {
         AV128inHasta = localUtil.ctot( httpContext.cgiGet( sCtrlAV128inHasta), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128inHasta", localUtil.ttoc( AV128inHasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV128inHasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV128inHasta_PARM"), 0) ;
      }
      sCtrlAV123inUsurCod = httpContext.cgiGet( sPrefix+"AV123inUsurCod_CTRL") ;
      if ( GXutil.len( sCtrlAV123inUsurCod) > 0 )
      {
         AV123inUsurCod = httpContext.cgiGet( sCtrlAV123inUsurCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123inUsurCod", AV123inUsurCod);
      }
      else
      {
         AV123inUsurCod = httpContext.cgiGet( sPrefix+"AV123inUsurCod_PARM") ;
      }
      sCtrlAV124inIp = httpContext.cgiGet( sPrefix+"AV124inIp_CTRL") ;
      if ( GXutil.len( sCtrlAV124inIp) > 0 )
      {
         AV124inIp = httpContext.cgiGet( sCtrlAV124inIp) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124inIp", AV124inIp);
      }
      else
      {
         AV124inIp = httpContext.cgiGet( sPrefix+"AV124inIp_PARM") ;
      }
      sCtrlAV129inNow = httpContext.cgiGet( sPrefix+"AV129inNow_CTRL") ;
      if ( GXutil.len( sCtrlAV129inNow) > 0 )
      {
         AV129inNow = localUtil.ctot( httpContext.cgiGet( sCtrlAV129inNow), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129inNow", localUtil.ttoc( AV129inNow, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV129inNow = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV129inNow_PARM"), 0) ;
      }
      sCtrlAV108InFilTkn = httpContext.cgiGet( sPrefix+"AV108InFilTkn_CTRL") ;
      if ( GXutil.len( sCtrlAV108InFilTkn) > 0 )
      {
         AV108InFilTkn = httpContext.cgiGet( sCtrlAV108InFilTkn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108InFilTkn", AV108InFilTkn);
      }
      else
      {
         AV108InFilTkn = httpContext.cgiGet( sPrefix+"AV108InFilTkn_PARM") ;
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
      pa2E22( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2E22( ) ;
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
      ws2E22( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121inEmprCod_PARM", GXutil.rtrim( AV121inEmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV121inEmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121inEmprCod_CTRL", GXutil.rtrim( sCtrlAV121inEmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV122inContCod_PARM", GXutil.rtrim( AV122inContCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV122inContCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV122inContCod_CTRL", GXutil.rtrim( sCtrlAV122inContCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125inSegundos_PARM", GXutil.ltrim( localUtil.ntoc( AV125inSegundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV125inSegundos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125inSegundos_CTRL", GXutil.rtrim( sCtrlAV125inSegundos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117inMaqCodJSON_PARM", AV117inMaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV117inMaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117inMaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV117inMaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118inFasCodJSon_PARM", AV118inFasCodJSon);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV118inFasCodJSon)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118inFasCodJSon_CTRL", GXutil.rtrim( sCtrlAV118inFasCodJSon));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119inHdrJSON_PARM", AV119inHdrJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV119inHdrJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119inHdrJSON_CTRL", GXutil.rtrim( sCtrlAV119inHdrJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120inParFasCodJSon_PARM", AV120inParFasCodJSon);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV120inParFasCodJSon)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120inParFasCodJSon_CTRL", GXutil.rtrim( sCtrlAV120inParFasCodJSon));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126inFueraRango_PARM", GXutil.booltostr( AV126inFueraRango));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV126inFueraRango)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126inFueraRango_CTRL", GXutil.rtrim( sCtrlAV126inFueraRango));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127inDesde_PARM", localUtil.ttoc( AV127inDesde, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV127inDesde)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127inDesde_CTRL", GXutil.rtrim( sCtrlAV127inDesde));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128inHasta_PARM", localUtil.ttoc( AV128inHasta, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV128inHasta)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128inHasta_CTRL", GXutil.rtrim( sCtrlAV128inHasta));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV123inUsurCod_PARM", GXutil.rtrim( AV123inUsurCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV123inUsurCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV123inUsurCod_CTRL", GXutil.rtrim( sCtrlAV123inUsurCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV124inIp_PARM", AV124inIp);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV124inIp)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV124inIp_CTRL", GXutil.rtrim( sCtrlAV124inIp));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV129inNow_PARM", localUtil.ttoc( AV129inNow, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV129inNow)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV129inNow_CTRL", GXutil.rtrim( sCtrlAV129inNow));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108InFilTkn_PARM", AV108InFilTkn);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV108InFilTkn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108InFilTkn_CTRL", GXutil.rtrim( sCtrlAV108InFilTkn));
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
      we2E22( ) ;
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("HorizontalGrid/horizontalgrid.min.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("HorizontalGrid/horizontalgrid.min.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714145653", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrec_alertadata.js", "?202681714145654", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_262( )
   {
      lblTbmaquina_Internalname = sPrefix+"TBMAQUINA_"+sGXsfl_26_idx ;
      lblVererrrormaquina_Internalname = sPrefix+"VERERRRORMAQUINA_"+sGXsfl_26_idx ;
      lblImgcircle_Internalname = sPrefix+"IMGCIRCLE_"+sGXsfl_26_idx ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1_"+sGXsfl_26_idx ;
      edtavMaquinas__maqcod_Internalname = sPrefix+"MAQUINAS__MAQCOD_"+sGXsfl_26_idx ;
   }

   public void subsflControlProps_fel_262( )
   {
      lblTbmaquina_Internalname = sPrefix+"TBMAQUINA_"+sGXsfl_26_fel_idx ;
      lblVererrrormaquina_Internalname = sPrefix+"VERERRRORMAQUINA_"+sGXsfl_26_fel_idx ;
      lblImgcircle_Internalname = sPrefix+"IMGCIRCLE_"+sGXsfl_26_fel_idx ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1_"+sGXsfl_26_fel_idx ;
      edtavMaquinas__maqcod_Internalname = sPrefix+"MAQUINAS__MAQCOD_"+sGXsfl_26_fel_idx ;
   }

   public void sendrow_262( )
   {
      subsflControlProps_262( ) ;
      wb2E20( ) ;
      Fsgrid1Row = GXWebRow.GetNew(context,Fsgrid1Container) ;
      if ( subFsgrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
         }
      }
      else if ( subFsgrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(0) ;
         subFsgrid1_Backcolor = subFsgrid1_Allbackcolor ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Uniform" ;
         }
      }
      else if ( subFsgrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
         }
         subFsgrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subFsgrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_26_idx) % (2))) == 0 )
         {
            subFsgrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
            {
               subFsgrid1_Linesclass = subFsgrid1_Class+"Even" ;
            }
         }
         else
         {
            subFsgrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
            {
               subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subFsgrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_26_idx+"\">") ;
      }
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divFsgrid1layouttable_Internalname+"_"+sGXsfl_26_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 CellMarginLeft CellMarginBottom","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* User Defined Control */
      Fsgrid1Row.AddColumnProperties("usercontrol", -1, isAjaxCallMode( ), new Object[] {sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"_"+sGXsfl_26_idx,Integer.valueOf(-1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("usercontrolcontainer", -1, isAjaxCallMode( ), new Object[] {sPrefix+"DVPANEL_UNNAMEDTABLE1Container","UnnamedTable1"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable1_Internalname+"_"+sGXsfl_26_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","Center","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Table start */
      Fsgrid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTablemergedtbmaquina_Internalname+"_"+sGXsfl_26_idx,Integer.valueOf(1),"TableMerged","","","","","","",Integer.valueOf(0),Integer.valueOf(0),"","","","px","px",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","","MergeDataCell"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTbmaquina_Internalname,lblTbmaquina_Caption,"","",lblTbmaquina_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("cell");
      }
      Fsgrid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblVererrrormaquina_Internalname,httpContext.getMessage( "<i class=\"fas fa-chevron-down\"></i>", ""),"","",lblVererrrormaquina_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+"e182e22_client"+"'","","TextBlock",Integer.valueOf(7),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("cell");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("row");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("table");
      }
      /* End of table */
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"Center","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","Center","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable2_Internalname+"_"+sGXsfl_26_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","Center","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblImgcircle_Internalname,lblImgcircle_Caption,"","",lblImgcircle_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(2)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"Center","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"Center","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable3_Internalname+"_"+sGXsfl_26_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 Invisible","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Table start */
      Fsgrid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablecontentfsfsgrid1_Internalname+"_"+sGXsfl_26_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Attribute/Variable Label */
      Fsgrid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavMaquinas__maqcod_Internalname,httpContext.getMessage( "Código Máquina", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Single line edit */
      TempTags = " " + ((edtavMaquinas__maqcod_Enabled!=0)&&(edtavMaquinas__maqcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_26_idx+"',26)\"" : " ") ;
      ROClassString = "Attribute" ;
      Fsgrid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaquinas__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+AV132GXV1)).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaquinas__maqcod_Enabled!=0)&&(edtavMaquinas__maqcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaquinas__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavMaquinas__maqcod_Visible),Integer.valueOf(edtavMaquinas__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("cell");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("row");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("table");
      }
      /* End of table */
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      send_integrity_lvl_hashes2E22( ) ;
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_26_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      /* End of Columns property logic. */
      Fsgrid1Container.AddRow(Fsgrid1Row);
      nGXsfl_26_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_26_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_26_idx+1) ;
      sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_262( ) ;
      /* End function sendrow_262 */
   }

   public void subsflControlProps_623( )
   {
      edtavDetallelinea_Internalname = sPrefix+"vDETALLELINEA_"+sGXsfl_62_idx ;
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD_"+sGXsfl_62_idx ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD_"+sGXsfl_62_idx ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN_"+sGXsfl_62_idx ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC_"+sGXsfl_62_idx ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD_"+sGXsfl_62_idx ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO_"+sGXsfl_62_idx ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR_"+sGXsfl_62_idx ;
      edtavDatos__maqcod_Internalname = sPrefix+"DATOS__MAQCOD_"+sGXsfl_62_idx ;
      edtavDatos__maqdsc_Internalname = sPrefix+"DATOS__MAQDSC_"+sGXsfl_62_idx ;
      edtavDatos__mprecplc_Internalname = sPrefix+"DATOS__MPRECPLC_"+sGXsfl_62_idx ;
      edtavDatos__fascod_Internalname = sPrefix+"DATOS__FASCOD_"+sGXsfl_62_idx ;
      edtavDatos__fasdsc_Internalname = sPrefix+"DATOS__FASDSC_"+sGXsfl_62_idx ;
      edtavDatos__parfascod_Internalname = sPrefix+"DATOS__PARFASCOD_"+sGXsfl_62_idx ;
      edtavDatos__parfasdsc_Internalname = sPrefix+"DATOS__PARFASDSC_"+sGXsfl_62_idx ;
      edtavDatos__mprecvalmn_Internalname = sPrefix+"DATOS__MPRECVALMN_"+sGXsfl_62_idx ;
      edtavDatos__mprecval_Internalname = sPrefix+"DATOS__MPRECVAL_"+sGXsfl_62_idx ;
      edtavDatos__mprecvalmx_Internalname = sPrefix+"DATOS__MPRECVALMX_"+sGXsfl_62_idx ;
      chkavDatos__mprecer.setInternalname( sPrefix+"DATOS__MPRECER_"+sGXsfl_62_idx );
   }

   public void subsflControlProps_fel_623( )
   {
      edtavDetallelinea_Internalname = sPrefix+"vDETALLELINEA_"+sGXsfl_62_fel_idx ;
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD_"+sGXsfl_62_fel_idx ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD_"+sGXsfl_62_fel_idx ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN_"+sGXsfl_62_fel_idx ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC_"+sGXsfl_62_fel_idx ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD_"+sGXsfl_62_fel_idx ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO_"+sGXsfl_62_fel_idx ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR_"+sGXsfl_62_fel_idx ;
      edtavDatos__maqcod_Internalname = sPrefix+"DATOS__MAQCOD_"+sGXsfl_62_fel_idx ;
      edtavDatos__maqdsc_Internalname = sPrefix+"DATOS__MAQDSC_"+sGXsfl_62_fel_idx ;
      edtavDatos__mprecplc_Internalname = sPrefix+"DATOS__MPRECPLC_"+sGXsfl_62_fel_idx ;
      edtavDatos__fascod_Internalname = sPrefix+"DATOS__FASCOD_"+sGXsfl_62_fel_idx ;
      edtavDatos__fasdsc_Internalname = sPrefix+"DATOS__FASDSC_"+sGXsfl_62_fel_idx ;
      edtavDatos__parfascod_Internalname = sPrefix+"DATOS__PARFASCOD_"+sGXsfl_62_fel_idx ;
      edtavDatos__parfasdsc_Internalname = sPrefix+"DATOS__PARFASDSC_"+sGXsfl_62_fel_idx ;
      edtavDatos__mprecvalmn_Internalname = sPrefix+"DATOS__MPRECVALMN_"+sGXsfl_62_fel_idx ;
      edtavDatos__mprecval_Internalname = sPrefix+"DATOS__MPRECVAL_"+sGXsfl_62_fel_idx ;
      edtavDatos__mprecvalmx_Internalname = sPrefix+"DATOS__MPRECVALMX_"+sGXsfl_62_fel_idx ;
      chkavDatos__mprecer.setInternalname( sPrefix+"DATOS__MPRECER_"+sGXsfl_62_fel_idx );
   }

   public void sendrow_623( )
   {
      subsflControlProps_623( ) ;
      wb2E20( ) ;
      if ( ( subGridmrec_alertasdts_Rows * 1 == 0 ) || ( nGXsfl_62_idx <= subgridmrec_alertasdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridmrec_alertasdtsRow = GXWebRow.GetNew(context,Gridmrec_alertasdtsContainer) ;
         if ( subGridmrec_alertasdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
            }
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(0) ;
            subGridmrec_alertasdts_Backcolor = subGridmrec_alertasdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Uniform" ;
            }
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
            }
            subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_62_idx) % (2))) == 0 )
            {
               subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Even" ;
               }
            }
            else
            {
               subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_62_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavDetallelinea_Enabled!=0)&&(edtavDetallelinea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'',62)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavDetallelinea_gximage, "")==0) ? "" : "GX_Image_"+edtavDetallelinea_gximage+"_Class") ;
         StyleString = "" ;
         AV21DetalleLinea_IsBlob = (boolean)(((GXutil.strcmp("", AV21DetalleLinea)==0)&&(GXutil.strcmp("", AV154Detallelinea_GXI)==0))||!(GXutil.strcmp("", AV21DetalleLinea)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV21DetalleLinea)==0) ? AV154Detallelinea_GXI : httpContext.getResourceRelative(AV21DetalleLinea)) ;
         Gridmrec_alertasdtsRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDetallelinea_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"",edtavDetallelinea_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(7),edtavDetallelinea_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+"e192e23_client"+"'",StyleString,ClassString,edtavDetallelinea_Columnclass,edtavDetallelinea_Columnheaderclass,"","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV21DetalleLinea_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__emprcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__menvord_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__menvord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__menvord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__menvord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mreclin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mreclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mreclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mreclin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecfec_Internalname,localUtil.ttoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), "99/99/99 99:99:99.999"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecfec_Columnclass,edtavDatos__mprecfec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__barcod_Columnclass,edtavDatos__barcod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__barcodreo_Columnclass,edtavDatos__barcodreo_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__barcodpar_Columnclass,edtavDatos__barcodpar_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__maqcod_Columnclass,edtavDatos__maqcod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__maqdsc_Columnclass,edtavDatos__maqdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecplc_Internalname,((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecplc(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecplc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecplc_Columnclass,edtavDatos__mprecplc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecplc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fascod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__fascod_Columnclass,edtavDatos__fascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__fasdsc_Columnclass,edtavDatos__fasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfascod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__parfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfascod_Columnclass,edtavDatos__parfascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfasdsc_Columnclass,edtavDatos__parfasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmn_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmn_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmn_Columnclass,edtavDatos__mprecvalmn_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecval_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecval_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecval_Columnclass,edtavDatos__mprecval_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmx_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmx_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmx_Columnclass,edtavDatos__mprecvalmx_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DATOS__MPRECER_" + sGXsfl_62_idx ;
         chkavDatos__mprecer.setName( GXCCtl );
         chkavDatos__mprecer.setWebtags( "" );
         chkavDatos__mprecer.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_62_Refreshing);
         chkavDatos__mprecer.setCheckedValue( "false" );
         Gridmrec_alertasdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavDatos__mprecer.getInternalname(),GXutil.booltostr( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV16Datos.elementAt(-1+AV134GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()),"","",Integer.valueOf(-1),Integer.valueOf(chkavDatos__mprecer.getEnabled()),"true","",StyleString,ClassString,chkavDatos__mprecer.getColumnClass(),chkavDatos__mprecer.getColumnHeaderClass(),""});
         send_integrity_lvl_hashes2E23( ) ;
         Gridmrec_alertasdtsContainer.AddRow(Gridmrec_alertasdtsRow);
         nGXsfl_62_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_62_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_623( ) ;
      }
      /* End function sendrow_623 */
   }

   public void startgridcontrol26( )
   {
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Fsgrid1Container"+"DivS\" data-gxgridid=\"26\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subFsgrid1_Internalname, subFsgrid1_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
      }
      else
      {
         Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
         Fsgrid1Container.AddObjectProperty("Header", subFsgrid1_Header);
         Fsgrid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         Fsgrid1Container.AddObjectProperty("Class", "FreeStyleGrid");
         Fsgrid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("CmpContext", sPrefix);
         Fsgrid1Container.AddObjectProperty("InMasterPage", "false");
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaquinas__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Fsgrid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaquinas__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol62( )
   {
      if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_alertasdtsContainer"+"DivS\" data-gxgridid=\"62\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmrec_alertasdts_Internalname, subGridmrec_alertasdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridmrec_alertasdts_Backcolorstyle == 0 )
         {
            subGridmrec_alertasdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Title" ;
            }
         }
         else
         {
            subGridmrec_alertasdts_Titlebackstyle = (byte)(1) ;
            if ( subGridmrec_alertasdts_Backcolorstyle == 1 )
            {
               subGridmrec_alertasdts_Titlebackcolor = subGridmrec_alertasdts_Allbackcolor ;
               if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavDetallelinea_gximage, "")==0) ? "" : "GX_Image_"+edtavDetallelinea_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Línea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Máq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PLC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Par.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Parámetro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mínimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máximo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
      }
      else
      {
         Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
         Gridmrec_alertasdtsContainer.AddObjectProperty("Header", subGridmrec_alertasdts_Header);
         Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", sPrefix);
         Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Value", httpContext.convertURL( AV21DetalleLinea));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDetallelinea_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDetallelinea_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavDetallelinea_Tooltiptext));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__menvord_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mreclin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecfec_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecfec_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__barcod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__barcod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__barcodreo_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__barcodreo_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__barcodpar_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__barcodpar_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__maqcod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__maqcod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__maqdsc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__maqdsc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecplc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecplc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecplc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__fascod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__fascod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__fasdsc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__fasdsc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfascod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfascod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmn_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecval_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecval_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmx_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavDatos__mprecer.getColumnClass()));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavDatos__mprecer.getColumnHeaderClass()));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavDatos__mprecer.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTitulogeneral_Internalname = sPrefix+"TITULOGENERAL" ;
      lblTbmaquina_Internalname = sPrefix+"TBMAQUINA" ;
      lblVererrrormaquina_Internalname = sPrefix+"VERERRRORMAQUINA" ;
      tblTablemergedtbmaquina_Internalname = sPrefix+"TABLEMERGEDTBMAQUINA" ;
      lblImgcircle_Internalname = sPrefix+"IMGCIRCLE" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtavMaquinas__maqcod_Internalname = sPrefix+"MAQUINAS__MAQCOD" ;
      tblUnnamedtablecontentfsfsgrid1_Internalname = sPrefix+"UNNAMEDTABLECONTENTFSFSGRID1" ;
      divFsgrid1layouttable_Internalname = sPrefix+"FSGRID1LAYOUTTABLE" ;
      divTablemaquinas_Internalname = sPrefix+"TABLEMAQUINAS" ;
      edtavDetallelinea_Internalname = sPrefix+"vDETALLELINEA" ;
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD" ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD" ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN" ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC" ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD" ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO" ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR" ;
      edtavDatos__maqcod_Internalname = sPrefix+"DATOS__MAQCOD" ;
      edtavDatos__maqdsc_Internalname = sPrefix+"DATOS__MAQDSC" ;
      edtavDatos__mprecplc_Internalname = sPrefix+"DATOS__MPRECPLC" ;
      edtavDatos__fascod_Internalname = sPrefix+"DATOS__FASCOD" ;
      edtavDatos__fasdsc_Internalname = sPrefix+"DATOS__FASDSC" ;
      edtavDatos__parfascod_Internalname = sPrefix+"DATOS__PARFASCOD" ;
      edtavDatos__parfasdsc_Internalname = sPrefix+"DATOS__PARFASDSC" ;
      edtavDatos__mprecvalmn_Internalname = sPrefix+"DATOS__MPRECVALMN" ;
      edtavDatos__mprecval_Internalname = sPrefix+"DATOS__MPRECVAL" ;
      edtavDatos__mprecvalmx_Internalname = sPrefix+"DATOS__MPRECVALMX" ;
      chkavDatos__mprecer.setInternalname( sPrefix+"DATOS__MPRECER" );
      Gridmrec_alertasdtspaginationbar_Internalname = sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR" ;
      divGridmrec_alertasdtstablewithpaginationbar_Internalname = sPrefix+"GRIDMREC_ALERTASDTSTABLEWITHPAGINATIONBAR" ;
      divPanelgeneral_Internalname = sPrefix+"PANELGENERAL" ;
      Dvpanel_panelgeneral_Internalname = sPrefix+"DVPANEL_PANELGENERAL" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamon_Internalname = sPrefix+"DATAMON" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Vererrrormaquina_modal_Internalname = sPrefix+"VERERRRORMAQUINA_MODAL" ;
      tblTablevererrrormaquina_modal_Internalname = sPrefix+"TABLEVERERRRORMAQUINA_MODAL" ;
      Gridmrec_alertasdts_empowerer_Internalname = sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subFsgrid1_Internalname = sPrefix+"FSGRID1" ;
      subGridmrec_alertasdts_Internalname = sPrefix+"GRIDMREC_ALERTASDTS" ;
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
      subGridmrec_alertasdts_Allowcollapsing = (byte)(0) ;
      subGridmrec_alertasdts_Allowhovering = (byte)(-1) ;
      subGridmrec_alertasdts_Allowselection = (byte)(1) ;
      subGridmrec_alertasdts_Header = "" ;
      subFsgrid1_Allowcollapsing = (byte)(0) ;
      chkavDatos__mprecer.setCaption( "" );
      chkavDatos__mprecer.setColumnHeaderClass( "" );
      chkavDatos__mprecer.setColumnClass( "WWColumn" );
      chkavDatos__mprecer.setEnabled( 0 );
      edtavDatos__mprecvalmx_Jsonclick = "" ;
      edtavDatos__mprecvalmx_Columnheaderclass = "" ;
      edtavDatos__mprecvalmx_Columnclass = "WWColumn" ;
      edtavDatos__mprecvalmx_Enabled = 0 ;
      edtavDatos__mprecval_Jsonclick = "" ;
      edtavDatos__mprecval_Columnheaderclass = "" ;
      edtavDatos__mprecval_Columnclass = "WWColumn" ;
      edtavDatos__mprecval_Enabled = 0 ;
      edtavDatos__mprecvalmn_Jsonclick = "" ;
      edtavDatos__mprecvalmn_Columnheaderclass = "" ;
      edtavDatos__mprecvalmn_Columnclass = "WWColumn" ;
      edtavDatos__mprecvalmn_Enabled = 0 ;
      edtavDatos__parfasdsc_Jsonclick = "" ;
      edtavDatos__parfasdsc_Columnheaderclass = "" ;
      edtavDatos__parfasdsc_Columnclass = "WWColumn" ;
      edtavDatos__parfasdsc_Enabled = 0 ;
      edtavDatos__parfascod_Jsonclick = "" ;
      edtavDatos__parfascod_Columnheaderclass = "" ;
      edtavDatos__parfascod_Columnclass = "WWColumn" ;
      edtavDatos__parfascod_Enabled = 0 ;
      edtavDatos__fasdsc_Jsonclick = "" ;
      edtavDatos__fasdsc_Columnheaderclass = "" ;
      edtavDatos__fasdsc_Columnclass = "WWColumn" ;
      edtavDatos__fasdsc_Enabled = 0 ;
      edtavDatos__fascod_Jsonclick = "" ;
      edtavDatos__fascod_Columnheaderclass = "" ;
      edtavDatos__fascod_Columnclass = "WWColumn" ;
      edtavDatos__fascod_Enabled = 0 ;
      edtavDatos__mprecplc_Jsonclick = "" ;
      edtavDatos__mprecplc_Columnheaderclass = "" ;
      edtavDatos__mprecplc_Columnclass = "WWColumn" ;
      edtavDatos__mprecplc_Enabled = 0 ;
      edtavDatos__maqdsc_Jsonclick = "" ;
      edtavDatos__maqdsc_Columnheaderclass = "" ;
      edtavDatos__maqdsc_Columnclass = "WWColumn" ;
      edtavDatos__maqdsc_Enabled = 0 ;
      edtavDatos__maqcod_Jsonclick = "" ;
      edtavDatos__maqcod_Columnheaderclass = "" ;
      edtavDatos__maqcod_Columnclass = "WWColumn" ;
      edtavDatos__maqcod_Enabled = 0 ;
      edtavDatos__barcodpar_Jsonclick = "" ;
      edtavDatos__barcodpar_Columnheaderclass = "" ;
      edtavDatos__barcodpar_Columnclass = "WWColumn" ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__barcodreo_Jsonclick = "" ;
      edtavDatos__barcodreo_Columnheaderclass = "" ;
      edtavDatos__barcodreo_Columnclass = "WWColumn" ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcod_Jsonclick = "" ;
      edtavDatos__barcod_Columnheaderclass = "" ;
      edtavDatos__barcod_Columnclass = "WWColumn" ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__mprecfec_Jsonclick = "" ;
      edtavDatos__mprecfec_Columnheaderclass = "" ;
      edtavDatos__mprecfec_Columnclass = "WWColumn" ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__mreclin_Jsonclick = "" ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__menvord_Jsonclick = "" ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__emprcod_Jsonclick = "" ;
      edtavDatos__emprcod_Enabled = 0 ;
      edtavDetallelinea_Jsonclick = "" ;
      edtavDetallelinea_Columnclass = "WWActionColumn" ;
      edtavDetallelinea_gximage = "" ;
      edtavDetallelinea_Visible = -1 ;
      edtavDetallelinea_Enabled = 1 ;
      edtavDetallelinea_Tooltiptext = "" ;
      subGridmrec_alertasdts_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGridmrec_alertasdts_Backcolorstyle = (byte)(0) ;
      edtavMaquinas__maqcod_Jsonclick = "" ;
      edtavMaquinas__maqcod_Enabled = 1 ;
      edtavMaquinas__maqcod_Visible = 1 ;
      lblImgcircle_Caption = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px'></i>", "") ;
      lblTbmaquina_Caption = httpContext.getMessage( "MaquinaNombre", "") ;
      edtavDetallelinea_Columnheaderclass = "" ;
      subFsgrid1_Backcolorstyle = (byte)(0) ;
      chkavDatos__mprecer.setEnabled( -1 );
      edtavDatos__mprecvalmx_Enabled = -1 ;
      edtavDatos__mprecval_Enabled = -1 ;
      edtavDatos__mprecvalmn_Enabled = -1 ;
      edtavDatos__parfasdsc_Enabled = -1 ;
      edtavDatos__parfascod_Enabled = -1 ;
      edtavDatos__fasdsc_Enabled = -1 ;
      edtavDatos__fascod_Enabled = -1 ;
      edtavDatos__mprecplc_Enabled = -1 ;
      edtavDatos__maqdsc_Enabled = -1 ;
      edtavDatos__maqcod_Enabled = -1 ;
      edtavDatos__barcodpar_Enabled = -1 ;
      edtavDatos__barcodreo_Enabled = -1 ;
      edtavDatos__barcod_Enabled = -1 ;
      edtavDatos__mprecfec_Enabled = -1 ;
      edtavDatos__mreclin_Enabled = -1 ;
      edtavDatos__menvord_Enabled = -1 ;
      edtavDatos__emprcod_Enabled = -1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTitulogeneral_Caption = httpContext.getMessage( " Titulo", "") ;
      subFsgrid1_Showarrows = GXutil.ltrimstr( DecimalUtil.doubleToDec(-1), 9, 0) ;
      subFsgrid1_Showpagecontroller = GXutil.ltrimstr( DecimalUtil.doubleToDec(0), 9, 0) ;
      subFsgrid1_Paged = GXutil.ltrimstr( DecimalUtil.doubleToDec(-1), 9, 0) ;
      subFsgrid1_Class = "FreeStyleGrid" ;
      Vererrrormaquina_modal_Bodytype = "WebComponent" ;
      Vererrrormaquina_modal_Confirmtype = "" ;
      Vererrrormaquina_modal_Title = httpContext.getMessage( "Aletas máquina", "") ;
      Vererrrormaquina_modal_Width = "1100" ;
      Dvpanel_panelgeneral_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Iconposition = "Right" ;
      Dvpanel_panelgeneral_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelgeneral_Title = "" ;
      Dvpanel_panelgeneral_Cls = "PanelNoHeader" ;
      Dvpanel_panelgeneral_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelgeneral_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Width = "100%" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridmrec_alertasdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridmrec_alertasdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridmrec_alertasdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridmrec_alertasdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridmrec_alertasdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridmrec_alertasdtspaginationbar_Pagestoshow = 5 ;
      Gridmrec_alertasdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridmrec_alertasdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridmrec_alertasdtspaginationbar_Class = "PaginationBar" ;
      subGridmrec_alertasdts_Rows = 0 ;
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
      GXCCtl = "DATOS__MPRECER_" + sGXsfl_62_idx ;
      chkavDatos__mprecer.setName( GXCCtl );
      chkavDatos__mprecer.setWebtags( "" );
      chkavDatos__mprecer.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_62_Refreshing);
      chkavDatos__mprecer.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'FSGRID1_nFirstRecordOnPage'},{av:'FSGRID1_nEOF'},{av:'AV79Maquinas',fld:'vMAQUINAS',grid:26,pic:''},{av:'nGXsfl_26_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:26},{av:'nRC_GXsfl_26',ctrl:'FSGRID1',prop:'GridRC',grid:26},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV16Datos',fld:'vDATOS',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:62},{av:'sPrefix'},{av:'AV75MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV26FasCod',fld:'vFASCOD',pic:'',hsh:true},{av:'AV59Hdr',fld:'vHDR',pic:'',hsh:true},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9',hsh:true},{av:'AV77MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV5FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV6HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV7ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV29FueraRango',fld:'vFUERARANGO',pic:'',hsh:true},{av:'AV112MTkn',fld:'vMTKN',pic:'',hsh:true},{av:'AV153Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV55GridMRec_AlertaSDTsCurrentPage',fld:'vGRIDMREC_ALERTASDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV56GridMRec_AlertaSDTsPageCount',fld:'vGRIDMREC_ALERTASDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetallelinea_Columnheaderclass',ctrl:'vDETALLELINEA',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECFEC',prop:'Columnheaderclass'},{ctrl:'DATOS__BARCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__BARCODREO',prop:'Columnheaderclass'},{ctrl:'DATOS__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'DATOS__MAQCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__MAQDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECPLC',prop:'Columnheaderclass'},{ctrl:'DATOS__FASCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__FASDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECER',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD","{handler:'e172E23',iparms:[{av:'AV16Datos',fld:'vDATOS',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:62}]");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD",",oparms:[{av:'AV21DetalleLinea',fld:'vDETALLELINEA',pic:''},{av:'edtavDetallelinea_Tooltiptext',ctrl:'vDETALLELINEA',prop:'Tooltiptext'},{av:'edtavDetallelinea_Columnclass',ctrl:'vDETALLELINEA',prop:'Columnclass'},{ctrl:'DATOS__MPRECFEC',prop:'Columnclass'},{ctrl:'DATOS__BARCOD',prop:'Columnclass'},{ctrl:'DATOS__BARCODREO',prop:'Columnclass'},{ctrl:'DATOS__BARCODPAR',prop:'Columnclass'},{ctrl:'DATOS__MAQCOD',prop:'Columnclass'},{ctrl:'DATOS__MAQDSC',prop:'Columnclass'},{ctrl:'DATOS__MPRECPLC',prop:'Columnclass'},{ctrl:'DATOS__FASCOD',prop:'Columnclass'},{ctrl:'DATOS__FASDSC',prop:'Columnclass'},{ctrl:'DATOS__PARFASCOD',prop:'Columnclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnclass'},{ctrl:'DATOS__MPRECER',prop:'Columnclass'}]}");
      setEventMetadata("FSGRID1.LOAD","{handler:'e152E22',iparms:[{av:'AV75MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV26FasCod',fld:'vFASCOD',pic:'',hsh:true},{av:'AV59Hdr',fld:'vHDR',pic:'',hsh:true},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:'',hsh:true},{av:'AV79Maquinas',fld:'vMAQUINAS',grid:26,pic:''},{av:'nGXsfl_26_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:26},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_26',ctrl:'FSGRID1',prop:'GridRC',grid:26}]");
      setEventMetadata("FSGRID1.LOAD",",oparms:[{av:'AV77MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV5FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV6HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV7ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'lblTbmaquina_Caption',ctrl:'TBMAQUINA',prop:'Caption'},{av:'lblImgcircle_Caption',ctrl:'IMGCIRCLE',prop:'Caption'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e112E22',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV16Datos',fld:'vDATOS',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:62},{av:'AV75MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV26FasCod',fld:'vFASCOD',pic:'',hsh:true},{av:'AV59Hdr',fld:'vHDR',pic:'',hsh:true},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9',hsh:true},{av:'AV77MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV5FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV6HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV7ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV29FueraRango',fld:'vFUERARANGO',pic:'',hsh:true},{av:'AV112MTkn',fld:'vMTKN',pic:'',hsh:true},{av:'AV153Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_alertasdtspaginationbar_Selectedpage',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122E22',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV16Datos',fld:'vDATOS',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:62},{av:'AV75MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV26FasCod',fld:'vFASCOD',pic:'',hsh:true},{av:'AV59Hdr',fld:'vHDR',pic:'',hsh:true},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9',hsh:true},{av:'AV77MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV5FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV6HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV7ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV29FueraRango',fld:'vFUERARANGO',pic:'',hsh:true},{av:'AV112MTkn',fld:'vMTKN',pic:'',hsh:true},{av:'AV153Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'}]}");
      setEventMetadata("'DOVERERRRORMAQUINA'","{handler:'e182E22',iparms:[]");
      setEventMetadata("'DOVERERRRORMAQUINA'",",oparms:[]}");
      setEventMetadata("'DOACTUALIZAR'","{handler:'e162E22',iparms:[{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9',hsh:true},{av:'AV75MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV26FasCod',fld:'vFASCOD',pic:'',hsh:true},{av:'AV59Hdr',fld:'vHDR',pic:'',hsh:true},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:'',hsh:true},{av:'AV29FueraRango',fld:'vFUERARANGO',pic:'',hsh:true},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999',hsh:true},{av:'AV112MTkn',fld:'vMTKN',pic:'',hsh:true},{av:'AV153Pgmname',fld:'vPGMNAME',pic:''},{av:'AV79Maquinas',fld:'vMAQUINAS',grid:26,pic:''},{av:'nGXsfl_26_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:26},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_26',ctrl:'FSGRID1',prop:'GridRC',grid:26},{av:'FSGRID1_nEOF'},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV16Datos',fld:'vDATOS',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:62},{av:'sPrefix'},{av:'AV77MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV5FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV6HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV7ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOACTUALIZAR'",",oparms:[{av:'lblTitulogeneral_Caption',ctrl:'TITULOGENERAL',prop:'Caption'},{av:'AV16Datos',fld:'vDATOS',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:62},{av:'AV79Maquinas',fld:'vMAQUINAS',grid:26,pic:''},{av:'nGXsfl_26_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:26},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_26',ctrl:'FSGRID1',prop:'GridRC',grid:26}]}");
      setEventMetadata("VDETALLELINEA.CLICK","{handler:'e192E23',iparms:[]");
      setEventMetadata("VDETALLELINEA.CLICK",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv2',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv21',iparms:[]");
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
      wcpOAV121inEmprCod = "" ;
      wcpOAV122inContCod = "" ;
      wcpOAV117inMaqCodJSON = "" ;
      wcpOAV118inFasCodJSon = "" ;
      wcpOAV119inHdrJSON = "" ;
      wcpOAV120inParFasCodJSon = "" ;
      wcpOAV127inDesde = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV128inHasta = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV123inUsurCod = "" ;
      wcpOAV124inIp = "" ;
      wcpOAV129inNow = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV108InFilTkn = "" ;
      Gridmrec_alertasdtspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV121inEmprCod = "" ;
      AV122inContCod = "" ;
      AV117inMaqCodJSON = "" ;
      AV118inFasCodJSon = "" ;
      AV119inHdrJSON = "" ;
      AV120inParFasCodJSon = "" ;
      AV127inDesde = GXutil.resetTime( GXutil.nullDate() );
      AV128inHasta = GXutil.resetTime( GXutil.nullDate() );
      AV123inUsurCod = "" ;
      AV124inIp = "" ;
      AV129inNow = GXutil.resetTime( GXutil.nullDate() );
      AV108InFilTkn = "" ;
      AV75MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV87ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV79Maquinas = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item>(app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV25EmprCod = "" ;
      AV12ContCod = "" ;
      AV77MaqCodJSON = "" ;
      AV5FasCodJSON = "" ;
      AV6HdrJSON = "" ;
      AV7ParFasCodJSON = "" ;
      AV19Desde = GXutil.resetTime( GXutil.nullDate() );
      AV57Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV102UsurCod = "" ;
      AV64Ip = "" ;
      AV105Now = GXutil.resetTime( GXutil.nullDate() );
      AV112MTkn = "" ;
      AV153Pgmname = "" ;
      AV16Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      Gridmrec_alertasdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelgeneral = new com.genexus.webpanels.GXUserControl();
      lblTitulogeneral_Jsonclick = "" ;
      Fsgrid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      Gridmrec_alertasdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      ucGridmrec_alertasdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucGridmrec_alertasdts_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV21DetalleLinea = "" ;
      AV154Detallelinea_GXI = "" ;
      hsh = "" ;
      AV113Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV114EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Fsgrid1Row = new com.genexus.webpanels.GXWebRow();
      GXt_objcol_SdtMRec_AlertaSDT_Item5 = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AlertaSDT_Item6 = new GXBaseCollection[1] ;
      AV17DatosClone = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV15Dato = new app.ingenieria.SdtMRec_AlertaSDT_Item(remoteHandle, context);
      AV78Maquina = new app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item(remoteHandle, context);
      Gridmrec_alertasdtsRow = new com.genexus.webpanels.GXWebRow();
      ucVererrrormaquina_modal = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV121inEmprCod = "" ;
      sCtrlAV122inContCod = "" ;
      sCtrlAV125inSegundos = "" ;
      sCtrlAV117inMaqCodJSON = "" ;
      sCtrlAV118inFasCodJSon = "" ;
      sCtrlAV119inHdrJSON = "" ;
      sCtrlAV120inParFasCodJSon = "" ;
      sCtrlAV126inFueraRango = "" ;
      sCtrlAV127inDesde = "" ;
      sCtrlAV128inHasta = "" ;
      sCtrlAV123inUsurCod = "" ;
      sCtrlAV124inIp = "" ;
      sCtrlAV129inNow = "" ;
      sCtrlAV108InFilTkn = "" ;
      subFsgrid1_Linesclass = "" ;
      Fsgrid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTbmaquina_Jsonclick = "" ;
      lblVererrrormaquina_Jsonclick = "" ;
      lblImgcircle_Jsonclick = "" ;
      TempTags = "" ;
      ROClassString = "" ;
      subGridmrec_alertasdts_Linesclass = "" ;
      sImgUrl = "" ;
      subFsgrid1_Header = "" ;
      Gridmrec_alertasdtsColumn = new com.genexus.webpanels.GXWebColumn();
      AV153Pgmname = "Ingenieria.MRec_AlertaData" ;
      /* GeneXus formulas. */
      AV153Pgmname = "Ingenieria.MRec_AlertaData" ;
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__maqcod_Enabled = 0 ;
      edtavDatos__maqdsc_Enabled = 0 ;
      edtavDatos__mprecplc_Enabled = 0 ;
      edtavDatos__fascod_Enabled = 0 ;
      edtavDatos__fasdsc_Enabled = 0 ;
      edtavDatos__parfascod_Enabled = 0 ;
      edtavDatos__parfasdsc_Enabled = 0 ;
      edtavDatos__mprecvalmn_Enabled = 0 ;
      edtavDatos__mprecval_Enabled = 0 ;
      edtavDatos__mprecvalmx_Enabled = 0 ;
      chkavDatos__mprecer.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRIDMREC_ALERTASDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subFsgrid1_Backcolorstyle ;
   private byte subGridmrec_alertasdts_Backcolorstyle ;
   private byte FSGRID1_nEOF ;
   private byte nGXWrapped ;
   private byte subFsgrid1_Backstyle ;
   private byte subGridmrec_alertasdts_Backstyle ;
   private byte subFsgrid1_Allowselection ;
   private byte subFsgrid1_Allowhovering ;
   private byte subFsgrid1_Allowcollapsing ;
   private byte subFsgrid1_Collapsed ;
   private byte subGridmrec_alertasdts_Titlebackstyle ;
   private byte subGridmrec_alertasdts_Allowselection ;
   private byte subGridmrec_alertasdts_Allowhovering ;
   private byte subGridmrec_alertasdts_Allowcollapsing ;
   private byte subGridmrec_alertasdts_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV63Index ;
   private int wcpOAV125inSegundos ;
   private int Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_26 ;
   private int nRC_GXsfl_62 ;
   private int AV125inSegundos ;
   private int subGridmrec_alertasdts_Rows ;
   private int nGXsfl_26_idx=1 ;
   private int AV93Segundos ;
   private int nGXsfl_62_idx=1 ;
   private int Gridmrec_alertasdtspaginationbar_Pagestoshow ;
   private int AV132GXV1 ;
   private int AV134GXV3 ;
   private int edtavPgmname_Enabled ;
   private int subFsgrid1_Islastpage ;
   private int subGridmrec_alertasdts_Islastpage ;
   private int edtavDatos__emprcod_Enabled ;
   private int edtavDatos__menvord_Enabled ;
   private int edtavDatos__mreclin_Enabled ;
   private int edtavDatos__mprecfec_Enabled ;
   private int edtavDatos__barcod_Enabled ;
   private int edtavDatos__barcodreo_Enabled ;
   private int edtavDatos__barcodpar_Enabled ;
   private int edtavDatos__maqcod_Enabled ;
   private int edtavDatos__maqdsc_Enabled ;
   private int edtavDatos__mprecplc_Enabled ;
   private int edtavDatos__fascod_Enabled ;
   private int edtavDatos__fasdsc_Enabled ;
   private int edtavDatos__parfascod_Enabled ;
   private int edtavDatos__parfasdsc_Enabled ;
   private int edtavDatos__mprecvalmn_Enabled ;
   private int edtavDatos__mprecval_Enabled ;
   private int edtavDatos__mprecvalmx_Enabled ;
   private int GRIDMREC_ALERTASDTS_nGridOutOfScope ;
   private int nGXsfl_26_fel_idx=1 ;
   private int nGXsfl_62_fel_idx=1 ;
   private int edtavMaquinas__maqcod_Visible ;
   private int AV84PageToGo ;
   private int nGXsfl_62_bak_idx=1 ;
   private int nGXsfl_26_bak_idx=1 ;
   private int AV155GXV22 ;
   private int AV156GXV23 ;
   private int idxLst ;
   private int subFsgrid1_Backcolor ;
   private int subFsgrid1_Allbackcolor ;
   private int edtavMaquinas__maqcod_Enabled ;
   private int subGridmrec_alertasdts_Backcolor ;
   private int subGridmrec_alertasdts_Allbackcolor ;
   private int edtavDetallelinea_Enabled ;
   private int edtavDetallelinea_Visible ;
   private int subFsgrid1_Selectedindex ;
   private int subFsgrid1_Selectioncolor ;
   private int subFsgrid1_Hoveringcolor ;
   private int subGridmrec_alertasdts_Titlebackcolor ;
   private int subGridmrec_alertasdts_Selectedindex ;
   private int subGridmrec_alertasdts_Selectioncolor ;
   private int subGridmrec_alertasdts_Hoveringcolor ;
   private long GRIDMREC_ALERTASDTS_nFirstRecordOnPage ;
   private long AV55GridMRec_AlertaSDTsCurrentPage ;
   private long AV56GridMRec_AlertaSDTsPageCount ;
   private long FSGRID1_nCurrentRecord ;
   private long GRIDMREC_ALERTASDTS_nCurrentRecord ;
   private long GRIDMREC_ALERTASDTS_nRecordCount ;
   private long FSGRID1_nFirstRecordOnPage ;
   private long AV62i ;
   private String wcpOAV121inEmprCod ;
   private String wcpOAV122inContCod ;
   private String wcpOAV123inUsurCod ;
   private String Gridmrec_alertasdtspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV121inEmprCod ;
   private String AV122inContCod ;
   private String AV123inUsurCod ;
   private String sGXsfl_26_idx="0001" ;
   private String AV25EmprCod ;
   private String AV12ContCod ;
   private String AV102UsurCod ;
   private String AV153Pgmname ;
   private String sGXsfl_62_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridmrec_alertasdtspaginationbar_Class ;
   private String Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition ;
   private String Gridmrec_alertasdtspaginationbar_Pagingcaptionposition ;
   private String Gridmrec_alertasdtspaginationbar_Emptygridclass ;
   private String Gridmrec_alertasdtspaginationbar_Rowsperpageoptions ;
   private String Gridmrec_alertasdtspaginationbar_Previous ;
   private String Gridmrec_alertasdtspaginationbar_Next ;
   private String Gridmrec_alertasdtspaginationbar_Caption ;
   private String Gridmrec_alertasdtspaginationbar_Emptygridcaption ;
   private String Gridmrec_alertasdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_panelgeneral_Width ;
   private String Dvpanel_panelgeneral_Cls ;
   private String Dvpanel_panelgeneral_Title ;
   private String Dvpanel_panelgeneral_Iconposition ;
   private String Vererrrormaquina_modal_Width ;
   private String Vererrrormaquina_modal_Title ;
   private String Vererrrormaquina_modal_Confirmtype ;
   private String Vererrrormaquina_modal_Bodytype ;
   private String Gridmrec_alertasdts_empowerer_Gridinternalname ;
   private String subFsgrid1_Class ;
   private String subFsgrid1_Paged ;
   private String subFsgrid1_Showpagecontroller ;
   private String subFsgrid1_Showarrows ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelgeneral_Internalname ;
   private String divPanelgeneral_Internalname ;
   private String lblTitulogeneral_Internalname ;
   private String lblTitulogeneral_Caption ;
   private String lblTitulogeneral_Jsonclick ;
   private String divTablemaquinas_Internalname ;
   private String sStyleString ;
   private String subFsgrid1_Internalname ;
   private String divGridmrec_alertasdtstablewithpaginationbar_Internalname ;
   private String subGridmrec_alertasdts_Internalname ;
   private String Gridmrec_alertasdtspaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamon_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridmrec_alertasdts_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavMaquinas__maqcod_Internalname ;
   private String GXCCtl ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String edtavDetallelinea_Internalname ;
   private String edtavDatos__emprcod_Internalname ;
   private String edtavDatos__menvord_Internalname ;
   private String edtavDatos__mreclin_Internalname ;
   private String edtavDatos__mprecfec_Internalname ;
   private String edtavDatos__barcod_Internalname ;
   private String edtavDatos__barcodreo_Internalname ;
   private String edtavDatos__barcodpar_Internalname ;
   private String edtavDatos__maqcod_Internalname ;
   private String edtavDatos__maqdsc_Internalname ;
   private String edtavDatos__mprecplc_Internalname ;
   private String edtavDatos__fascod_Internalname ;
   private String edtavDatos__fasdsc_Internalname ;
   private String edtavDatos__parfascod_Internalname ;
   private String edtavDatos__parfasdsc_Internalname ;
   private String edtavDatos__mprecvalmn_Internalname ;
   private String edtavDatos__mprecval_Internalname ;
   private String edtavDatos__mprecvalmx_Internalname ;
   private String sGXsfl_26_fel_idx="0001" ;
   private String sGXsfl_62_fel_idx="0001" ;
   private String hsh ;
   private String AV113Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV114EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String edtavDetallelinea_Columnheaderclass ;
   private String edtavDatos__mprecfec_Columnheaderclass ;
   private String edtavDatos__barcod_Columnheaderclass ;
   private String edtavDatos__barcodreo_Columnheaderclass ;
   private String edtavDatos__barcodpar_Columnheaderclass ;
   private String edtavDatos__maqcod_Columnheaderclass ;
   private String edtavDatos__maqdsc_Columnheaderclass ;
   private String edtavDatos__mprecplc_Columnheaderclass ;
   private String edtavDatos__fascod_Columnheaderclass ;
   private String edtavDatos__fasdsc_Columnheaderclass ;
   private String edtavDatos__parfascod_Columnheaderclass ;
   private String edtavDatos__parfasdsc_Columnheaderclass ;
   private String edtavDatos__mprecvalmn_Columnheaderclass ;
   private String edtavDatos__mprecval_Columnheaderclass ;
   private String edtavDatos__mprecvalmx_Columnheaderclass ;
   private String lblTbmaquina_Caption ;
   private String lblImgcircle_Caption ;
   private String edtavDetallelinea_gximage ;
   private String edtavDetallelinea_Tooltiptext ;
   private String edtavDetallelinea_Columnclass ;
   private String edtavDatos__mprecfec_Columnclass ;
   private String edtavDatos__barcod_Columnclass ;
   private String edtavDatos__barcodreo_Columnclass ;
   private String edtavDatos__barcodpar_Columnclass ;
   private String edtavDatos__maqcod_Columnclass ;
   private String edtavDatos__maqdsc_Columnclass ;
   private String edtavDatos__mprecplc_Columnclass ;
   private String edtavDatos__fascod_Columnclass ;
   private String edtavDatos__fasdsc_Columnclass ;
   private String edtavDatos__parfascod_Columnclass ;
   private String edtavDatos__parfasdsc_Columnclass ;
   private String edtavDatos__mprecvalmn_Columnclass ;
   private String edtavDatos__mprecval_Columnclass ;
   private String edtavDatos__mprecvalmx_Columnclass ;
   private String tblTablevererrrormaquina_modal_Internalname ;
   private String Vererrrormaquina_modal_Internalname ;
   private String sCtrlAV121inEmprCod ;
   private String sCtrlAV122inContCod ;
   private String sCtrlAV125inSegundos ;
   private String sCtrlAV117inMaqCodJSON ;
   private String sCtrlAV118inFasCodJSon ;
   private String sCtrlAV119inHdrJSON ;
   private String sCtrlAV120inParFasCodJSon ;
   private String sCtrlAV126inFueraRango ;
   private String sCtrlAV127inDesde ;
   private String sCtrlAV128inHasta ;
   private String sCtrlAV123inUsurCod ;
   private String sCtrlAV124inIp ;
   private String sCtrlAV129inNow ;
   private String sCtrlAV108InFilTkn ;
   private String lblTbmaquina_Internalname ;
   private String lblVererrrormaquina_Internalname ;
   private String lblImgcircle_Internalname ;
   private String subFsgrid1_Linesclass ;
   private String divFsgrid1layouttable_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String tblTablemergedtbmaquina_Internalname ;
   private String lblTbmaquina_Jsonclick ;
   private String lblVererrrormaquina_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String lblImgcircle_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String tblUnnamedtablecontentfsfsgrid1_Internalname ;
   private String TempTags ;
   private String ROClassString ;
   private String edtavMaquinas__maqcod_Jsonclick ;
   private String subGridmrec_alertasdts_Class ;
   private String subGridmrec_alertasdts_Linesclass ;
   private String sImgUrl ;
   private String edtavDetallelinea_Jsonclick ;
   private String edtavDatos__emprcod_Jsonclick ;
   private String edtavDatos__menvord_Jsonclick ;
   private String edtavDatos__mreclin_Jsonclick ;
   private String edtavDatos__mprecfec_Jsonclick ;
   private String edtavDatos__barcod_Jsonclick ;
   private String edtavDatos__barcodreo_Jsonclick ;
   private String edtavDatos__barcodpar_Jsonclick ;
   private String edtavDatos__maqcod_Jsonclick ;
   private String edtavDatos__maqdsc_Jsonclick ;
   private String edtavDatos__mprecplc_Jsonclick ;
   private String edtavDatos__fascod_Jsonclick ;
   private String edtavDatos__fasdsc_Jsonclick ;
   private String edtavDatos__parfascod_Jsonclick ;
   private String edtavDatos__parfasdsc_Jsonclick ;
   private String edtavDatos__mprecvalmn_Jsonclick ;
   private String edtavDatos__mprecval_Jsonclick ;
   private String edtavDatos__mprecvalmx_Jsonclick ;
   private String subFsgrid1_Header ;
   private String subGridmrec_alertasdts_Header ;
   private java.util.Date wcpOAV127inDesde ;
   private java.util.Date wcpOAV128inHasta ;
   private java.util.Date wcpOAV129inNow ;
   private java.util.Date AV127inDesde ;
   private java.util.Date AV128inHasta ;
   private java.util.Date AV129inNow ;
   private java.util.Date AV19Desde ;
   private java.util.Date AV57Hasta ;
   private java.util.Date AV105Now ;
   private boolean wcpOAV126inFueraRango ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV126inFueraRango ;
   private boolean AV29FueraRango ;
   private boolean Gridmrec_alertasdtspaginationbar_Showfirst ;
   private boolean Gridmrec_alertasdtspaginationbar_Showprevious ;
   private boolean Gridmrec_alertasdtspaginationbar_Shownext ;
   private boolean Gridmrec_alertasdtspaginationbar_Showlast ;
   private boolean Gridmrec_alertasdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panelgeneral_Autowidth ;
   private boolean Dvpanel_panelgeneral_Autoheight ;
   private boolean Dvpanel_panelgeneral_Collapsible ;
   private boolean Dvpanel_panelgeneral_Collapsed ;
   private boolean Dvpanel_panelgeneral_Showcollapseicon ;
   private boolean Dvpanel_panelgeneral_Autoscroll ;
   private boolean wbLoad ;
   private boolean bGXsfl_26_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean bGXsfl_62_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV62 ;
   private boolean gx_BV26 ;
   private boolean AV21DetalleLinea_IsBlob ;
   private String wcpOAV117inMaqCodJSON ;
   private String wcpOAV118inFasCodJSon ;
   private String wcpOAV119inHdrJSON ;
   private String wcpOAV120inParFasCodJSon ;
   private String wcpOAV124inIp ;
   private String wcpOAV108InFilTkn ;
   private String AV117inMaqCodJSON ;
   private String AV118inFasCodJSon ;
   private String AV119inHdrJSON ;
   private String AV120inParFasCodJSon ;
   private String AV124inIp ;
   private String AV108InFilTkn ;
   private String AV77MaqCodJSON ;
   private String AV5FasCodJSON ;
   private String AV6HdrJSON ;
   private String AV7ParFasCodJSON ;
   private String AV64Ip ;
   private String AV112MTkn ;
   private String AV154Detallelinea_GXI ;
   private String AV21DetalleLinea ;
   private GXSimpleCollection<Short> AV87ParFasCod ;
   private com.genexus.webpanels.GXWebGrid Fsgrid1Container ;
   private com.genexus.webpanels.GXWebGrid Gridmrec_alertasdtsContainer ;
   private com.genexus.webpanels.GXWebRow Fsgrid1Row ;
   private com.genexus.webpanels.GXWebRow Gridmrec_alertasdtsRow ;
   private com.genexus.webpanels.GXWebColumn Fsgrid1Column ;
   private com.genexus.webpanels.GXWebColumn Gridmrec_alertasdtsColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelgeneral ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdts_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucVererrrormaquina_modal ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavDatos__mprecer ;
   private GXSimpleCollection<String> AV75MaqCod ;
   private GXSimpleCollection<String> AV26FasCod ;
   private GXSimpleCollection<String> AV59Hdr ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV16Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXt_objcol_SdtMRec_AlertaSDT_Item5 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXv_objcol_SdtMRec_AlertaSDT_Item6[] ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV17DatosClone ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item> AV79Maquinas ;
   private app.ingenieria.SdtMRec_AlertaSDT_Item AV15Dato ;
   private app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item AV78Maquina ;
}

