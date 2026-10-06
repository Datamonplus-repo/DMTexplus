package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_alertadetalle_impl extends GXWebComponent
{
   public mrec_alertadetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_alertadetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertadetalle_impl.class ));
   }

   public mrec_alertadetalle_impl( int remoteHandle ,
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
               AV9EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
               AV6ContCod = httpContext.GetPar( "ContCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ContCod", AV6ContCod);
               AV26Segundos = (int)(GXutil.lval( httpContext.GetPar( "Segundos"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0));
               AV21MaqCodJson = httpContext.GetPar( "MaqCodJson") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodJson", AV21MaqCodJson);
               AV11FasCodJSon = httpContext.GetPar( "FasCodJSon") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FasCodJSon", AV11FasCodJSon);
               AV17HdrJSON = httpContext.GetPar( "HdrJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HdrJSON", AV17HdrJSON);
               AV25ParFasCodJSon = httpContext.GetPar( "ParFasCodJSon") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ParFasCodJSon", AV25ParFasCodJSon);
               AV12FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FueraRango", AV12FueraRango);
               AV8Desde = localUtil.parseDTimeParm( httpContext.GetPar( "Desde")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Desde", localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV15Hasta = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Hasta", localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV27UsurCod = httpContext.GetPar( "UsurCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27UsurCod", AV27UsurCod);
               AV19Ip = httpContext.GetPar( "Ip") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Ip", AV19Ip);
               AV22Now = localUtil.parseDTimeParm( httpContext.GetPar( "Now")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Now", localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV40MTkn = httpContext.GetPar( "MTkn") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MTkn", AV40MTkn);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV9EmprCod,AV6ContCod,Integer.valueOf(AV26Segundos),AV21MaqCodJson,AV11FasCodJSon,AV17HdrJSON,AV25ParFasCodJSon,Boolean.valueOf(AV12FueraRango),AV8Desde,AV15Hasta,AV27UsurCod,AV19Ip,AV22Now,AV40MTkn});
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

   public void gxnrgridmrec_alertasdts_newrow_invoke( )
   {
      nRC_GXsfl_33 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_33"))) ;
      nGXsfl_33_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_33_idx"))) ;
      sGXsfl_33_idx = httpContext.GetPar( "sGXsfl_33_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7Datos);
      AV67Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV7Datos, AV67Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmrec_alertasdts_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DY2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_alertadetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6ContCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26Segundos,6,0)),GXutil.URLEncode(GXutil.rtrim(AV21MaqCodJson)),GXutil.URLEncode(GXutil.rtrim(AV11FasCodJSon)),GXutil.URLEncode(GXutil.rtrim(AV17HdrJSON)),GXutil.URLEncode(GXutil.rtrim(AV25ParFasCodJSon)),GXutil.URLEncode(GXutil.booltostr(AV12FueraRango)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV8Desde)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV15Hasta)),GXutil.URLEncode(GXutil.rtrim(AV27UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV19Ip)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV22Now)),GXutil.URLEncode(GXutil.rtrim(AV40MTkn))}, new String[] {"EmprCod","ContCod","Segundos","MaqCodJson","FasCodJSon","HdrJSON","ParFasCodJSon","FueraRango","Desde","Hasta","UsurCod","Ip","Now","MTkn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDATOS", getSecureSignedToken( sPrefix, AV7Datos));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaDetalle");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertadetalle:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Datos", AV7Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Datos", AV7Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Datos", getSecureSignedToken( sPrefix, AV7Datos));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_33, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV28Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV28Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV29Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV29Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV30ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV30ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV31ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV31ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV32DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV32DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV33FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV33FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV34ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV34ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV35ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV35ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_ALERTASDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV13GridMRec_AlertaSDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_ALERTASDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV14GridMRec_AlertaSDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9EmprCod", GXutil.rtrim( wcpOAV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6ContCod", GXutil.rtrim( wcpOAV6ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Segundos", GXutil.ltrim( localUtil.ntoc( wcpOAV26Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21MaqCodJson", wcpOAV21MaqCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11FasCodJSon", wcpOAV11FasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17HdrJSON", wcpOAV17HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25ParFasCodJSon", wcpOAV25ParFasCodJSon);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV12FueraRango", wcpOAV12FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Desde", localUtil.ttoc( wcpOAV8Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15Hasta", localUtil.ttoc( wcpOAV15Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27UsurCod", GXutil.rtrim( wcpOAV27UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Ip", wcpOAV19Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22Now", localUtil.ttoc( wcpOAV22Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40MTkn", wcpOAV40MTkn);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDATOS", AV7Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDATOS", AV7Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDATOS", getSecureSignedToken( sPrefix, AV7Datos));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTCOD", GXutil.rtrim( AV6ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSEGUNDOS", GXutil.ltrim( localUtil.ntoc( AV26Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODJSON", AV21MaqCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODJSON", AV11FasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHDRJSON", AV17HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARFASCODJSON", AV25ParFasCodJSon);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vFUERARANGO", AV12FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDESDE", localUtil.ttoc( AV8Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASTA", localUtil.ttoc( AV15Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV27UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIP", AV19Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOW", localUtil.ttoc( AV22Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV40MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Width", GXutil.rtrim( Dvpanel_panelfiltros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Autowidth", GXutil.booltostr( Dvpanel_panelfiltros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Autoheight", GXutil.booltostr( Dvpanel_panelfiltros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Cls", GXutil.rtrim( Dvpanel_panelfiltros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Title", GXutil.rtrim( Dvpanel_panelfiltros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Collapsible", GXutil.booltostr( Dvpanel_panelfiltros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Collapsed", GXutil.booltostr( Dvpanel_panelfiltros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelfiltros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Iconposition", GXutil.rtrim( Dvpanel_panelfiltros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELFILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panelfiltros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVGRAFICA_Objectcall", GXutil.rtrim( Qvgrafica_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVGRAFICA_Objectcall", GXutil.rtrim( Qvgrafica_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVGRAFICA_Type", GXutil.rtrim( Qvgrafica_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVGRAFICA_Charttype", GXutil.rtrim( Qvgrafica_Charttype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridmrec_alertasdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2DY2( )
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
      return "Ingenieria.MRec_AlertaDetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Alertas", "") ;
   }

   public void wb2DY0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.mrec_alertadetalle");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
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
         ucDvpanel_panelfiltros.setProperty("Width", Dvpanel_panelfiltros_Width);
         ucDvpanel_panelfiltros.setProperty("AutoWidth", Dvpanel_panelfiltros_Autowidth);
         ucDvpanel_panelfiltros.setProperty("AutoHeight", Dvpanel_panelfiltros_Autoheight);
         ucDvpanel_panelfiltros.setProperty("Cls", Dvpanel_panelfiltros_Cls);
         ucDvpanel_panelfiltros.setProperty("Title", Dvpanel_panelfiltros_Title);
         ucDvpanel_panelfiltros.setProperty("Collapsible", Dvpanel_panelfiltros_Collapsible);
         ucDvpanel_panelfiltros.setProperty("Collapsed", Dvpanel_panelfiltros_Collapsed);
         ucDvpanel_panelfiltros.setProperty("ShowCollapseIcon", Dvpanel_panelfiltros_Showcollapseicon);
         ucDvpanel_panelfiltros.setProperty("IconPosition", Dvpanel_panelfiltros_Iconposition);
         ucDvpanel_panelfiltros.setProperty("AutoScroll", Dvpanel_panelfiltros_Autoscroll);
         ucDvpanel_panelfiltros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelfiltros_Internalname, sPrefix+"DVPANEL_PANELFILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_PANELFILTROSContainer"+"PanelFiltros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelfiltros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTitulo_Internalname, lblTitulo_Caption, "", "", lblTitulo_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AlertaDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* User Defined Control */
         ucQvgrafica.setProperty("Elements", AV28Elements);
         ucQvgrafica.setProperty("Parameters", AV29Parameters);
         ucQvgrafica.setProperty("Type", Qvgrafica_Type);
         ucQvgrafica.setProperty("Title", Qvgrafica_Title);
         ucQvgrafica.setProperty("ChartType", Qvgrafica_Charttype);
         ucQvgrafica.setProperty("ItemClickData", AV30ItemClickData);
         ucQvgrafica.setProperty("ItemDoubleClickData", AV31ItemDoubleClickData);
         ucQvgrafica.setProperty("DragAndDropData", AV32DragAndDropData);
         ucQvgrafica.setProperty("FilterChangedData", AV33FilterChangedData);
         ucQvgrafica.setProperty("ItemExpandData", AV34ItemExpandData);
         ucQvgrafica.setProperty("ItemCollapseData", AV35ItemCollapseData);
         ucQvgrafica.render(context, "queryviewer", Qvgrafica_Internalname, sPrefix+"QVGRAFICAContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridmrec_alertasdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridmrec_alertasdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol33( ) ;
      }
      if ( wbEnd == 33 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_33 = (int)(nGXsfl_33_idx-1) ;
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV48GXV1 = nGXsfl_33_idx ;
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
         ucGridmrec_alertasdtspaginationbar.setProperty("CurrentPage", AV13GridMRec_AlertaSDTsCurrentPage);
         ucGridmrec_alertasdtspaginationbar.setProperty("PageCount", AV14GridMRec_AlertaSDTsPageCount);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemasdetalles_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_AlertaDetalle.htm");
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
         /* User Defined Control */
         ucGridmrec_alertasdts_empowerer.render(context, "wwp.gridempowerer", Gridmrec_alertasdts_empowerer_Internalname, sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 33 )
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
               AV48GXV1 = nGXsfl_33_idx ;
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

   public void start2DY2( )
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
            strup2DY0( ) ;
         }
      }
   }

   public void ws2DY2( )
   {
      start2DY2( ) ;
      evt2DY2( ) ;
   }

   public void evt2DY2( )
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
                              strup2DY0( ) ;
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
                              strup2DY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DY0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 24), "GRIDMREC_ALERTASDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DY0( ) ;
                           }
                           nGXsfl_33_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_332( ) ;
                           AV48GXV1 = (int)(nGXsfl_33_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
                           if ( ( AV7Datos.size() >= AV48GXV1 ) && ( AV48GXV1 > 0 ) )
                           {
                              AV7Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)) );
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
                                       e132DY2 ();
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
                                       e142DY2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e152DY2 ();
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
                                    strup2DY0( ) ;
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

   public void we2DY2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DY2( ) ;
         }
      }
   }

   public void pa2DY2( )
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

   public void gxnrgridmrec_alertasdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_332( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         sendrow_332( ) ;
         nGXsfl_33_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_33_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmrec_alertasdtsContainer)) ;
      /* End function gxnrGridmrec_alertasdts_newrow */
   }

   public void gxgrgridmrec_alertasdts_refresh( int subGridmrec_alertasdts_Rows ,
                                                GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV7Datos ,
                                                String AV67Pgmname ,
                                                String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e142DY2 ();
      GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
      rf2DY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaDetalle");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertadetalle:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "Ingenieria.MRec_AlertaDetalle" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_33_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridmrec_alertasdtsContainer.ClearRows();
      }
      wbStart = (short)(33) ;
      /* Execute user event: Refresh */
      e142DY2 ();
      nGXsfl_33_idx = 1 ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      bGXsfl_33_Refreshing = true ;
      Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
      Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", sPrefix);
      Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.setPageSize( subgridmrec_alertasdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_332( ) ;
         e152DY2 ();
         if ( ( GRIDMREC_ALERTASDTS_nCurrentRecord > 0 ) && ( GRIDMREC_ALERTASDTS_nGridOutOfScope == 0 ) && ( nGXsfl_33_idx == 1 ) )
         {
            GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
            GRIDMREC_ALERTASDTS_nGridOutOfScope = 1 ;
            subgridmrec_alertasdts_firstpage( ) ;
            e152DY2 ();
         }
         wbEnd = (short)(33) ;
         wb2DY0( ) ;
      }
      bGXsfl_33_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DY2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDATOS", AV7Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDATOS", AV7Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDATOS", getSecureSignedToken( sPrefix, AV7Datos));
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
      return AV7Datos.size() ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV7Datos, AV67Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV7Datos, AV67Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV7Datos, AV67Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV7Datos, AV67Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV7Datos, AV67Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "Ingenieria.MRec_AlertaDetalle" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_33_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132DY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Datos"), AV7Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV28Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV29Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV30ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV31ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV32DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV33FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV34ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV35ItemCollapseData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDATOS"), AV7Datos);
         /* Read saved values. */
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV13GridMRec_AlertaSDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_ALERTASDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV14GridMRec_AlertaSDTsPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_ALERTASDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV9EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV9EmprCod") ;
         wcpOAV6ContCod = httpContext.cgiGet( sPrefix+"wcpOAV6ContCod") ;
         wcpOAV26Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26Segundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV21MaqCodJson = httpContext.cgiGet( sPrefix+"wcpOAV21MaqCodJson") ;
         wcpOAV11FasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV11FasCodJSon") ;
         wcpOAV17HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV17HdrJSON") ;
         wcpOAV25ParFasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV25ParFasCodJSon") ;
         wcpOAV12FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV12FueraRango")) ;
         wcpOAV8Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV8Desde"), 0) ;
         wcpOAV15Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV15Hasta"), 0) ;
         wcpOAV27UsurCod = httpContext.cgiGet( sPrefix+"wcpOAV27UsurCod") ;
         wcpOAV19Ip = httpContext.cgiGet( sPrefix+"wcpOAV19Ip") ;
         wcpOAV22Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV22Now"), 0) ;
         wcpOAV40MTkn = httpContext.cgiGet( sPrefix+"wcpOAV40MTkn") ;
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDMREC_ALERTASDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridmrec_alertasdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_panelfiltros_Width = httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Width") ;
         Dvpanel_panelfiltros_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Autowidth")) ;
         Dvpanel_panelfiltros_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Autoheight")) ;
         Dvpanel_panelfiltros_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Cls") ;
         Dvpanel_panelfiltros_Title = httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Title") ;
         Dvpanel_panelfiltros_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Collapsible")) ;
         Dvpanel_panelfiltros_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Collapsed")) ;
         Dvpanel_panelfiltros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Showcollapseicon")) ;
         Dvpanel_panelfiltros_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Iconposition") ;
         Dvpanel_panelfiltros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELFILTROS_Autoscroll")) ;
         Qvgrafica_Objectcall = httpContext.cgiGet( sPrefix+"QVGRAFICA_Objectcall") ;
         Qvgrafica_Objectcall = httpContext.cgiGet( sPrefix+"QVGRAFICA_Objectcall") ;
         Qvgrafica_Type = httpContext.cgiGet( sPrefix+"QVGRAFICA_Type") ;
         Qvgrafica_Charttype = httpContext.cgiGet( sPrefix+"QVGRAFICA_Charttype") ;
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
         Gridmrec_alertasdts_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname") ;
         Gridmrec_alertasdtspaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_33_fel_idx = 0 ;
         while ( nGXsfl_33_fel_idx < nRC_GXsfl_33 )
         {
            nGXsfl_33_fel_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_33_fel_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_33_fel_idx+1) ;
            sGXsfl_33_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_332( ) ;
            AV48GXV1 = (int)(nGXsfl_33_fel_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
            if ( ( AV7Datos.size() >= AV48GXV1 ) && ( AV48GXV1 > 0 ) )
            {
               AV7Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)) );
            }
         }
         if ( nGXsfl_33_fel_idx == 0 )
         {
            nGXsfl_33_idx = 1 ;
            sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_332( ) ;
         }
         nGXsfl_33_fel_idx = 1 ;
         /* Read variables values. */
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaDetalle");
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_alertadetalle:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e132DY2 ();
      if (returnInSub) return;
   }

   public void e132DY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV20MaqCod.fromJSonString(AV21MaqCodJson, null);
      AV10FasCod.fromJSonString(AV11FasCodJSon, null);
      AV16Hdr.fromJSonString(AV17HdrJSON, null);
      AV24ParFasCod.fromJSonString(AV25ParFasCodJSon, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "PASO 1: Inicia alerta Detalle:EmprCod:%1, ContCod:%2, Intervalo:%3, Maquinas:%4, Fases;%5, &HDR:%6, Parametro:%7, Error:%8, %9.", ""), AV9EmprCod, AV6ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0), AV20MaqCod.toJSonString(false), AV10FasCod.toJSonString(false), AV16Hdr.toJSonString(false), AV24ParFasCod.toJSonString(false), GXutil.booltostr( AV12FueraRango), GXutil.format( httpContext.getMessage( "Fechas:%1-%2, Usuario:%3, Ip:%4, Now:%5, Token:%6.", ""), localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV27UsurCod, AV19Ip, localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV40MTkn, "", "", "")), AV67Pgmname) ;
      lblTitulo_Caption = GXutil.format( httpContext.getMessage( "%7Intervalo:%1, Maquinas:%2, Fases:%3, Hdrs:%4, Parametro:%5, Error:%6.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0), AV21MaqCodJson, AV11FasCodJSon, AV17HdrJSON, AV25ParFasCodJSon, GXutil.booltostr( AV12FueraRango), httpContext.getMessage( "<i class='fa fa-search' style='color:red; '></i>", ""), "", "") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTitulo_Internalname, "Caption", lblTitulo_Caption, true);
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S112 ();
      if (returnInSub) return;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "PASO 3: Inicia alerta Detalle:EmprCod:%1, ContCod:%2, Intervalo:%3, Maquinas:%4, Fases;%5, &HDR:%6, Parametro:%7, Error:%8, %9.", ""), AV9EmprCod, AV6ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0), AV20MaqCod.toJSonString(false), AV10FasCod.toJSonString(false), AV16Hdr.toJSonString(false), AV24ParFasCod.toJSonString(false), GXutil.booltostr( AV12FueraRango), GXutil.format( httpContext.getMessage( "Fechas:%1-%2, Usuario:%3, Ip:%4, Now:%5, Token:%6.", ""), localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV27UsurCod, AV19Ip, localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV40MTkn, "", "", "")), AV67Pgmname) ;
      GXt_objcol_SdtMRec_AlertaSDT_Item1 = AV7Datos ;
      GXv_objcol_SdtMRec_AlertaSDT_Item2[0] = GXt_objcol_SdtMRec_AlertaSDT_Item1 ;
      new app.ingenieria.mrec_alertapr(remoteHandle, context).execute( AV9EmprCod, AV6ContCod, AV26Segundos, AV20MaqCod, AV10FasCod, AV16Hdr, AV24ParFasCod, AV12FueraRango, AV8Desde, AV15Hasta, AV27UsurCod, AV19Ip, AV22Now, AV40MTkn, GXv_objcol_SdtMRec_AlertaSDT_Item2) ;
      GXt_objcol_SdtMRec_AlertaSDT_Item1 = GXv_objcol_SdtMRec_AlertaSDT_Item2[0] ;
      AV7Datos = GXt_objcol_SdtMRec_AlertaSDT_Item1 ;
      gx_BV33 = true ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Datos alerta Detalle: %1.", ""), AV7Datos.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      GXt_char3 = AV43Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      mrec_alertadetalle_impl.this.GXt_char3 = GXv_char4[0] ;
      AV43Station = GXt_char3 ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_char5[0] = AV44EmprNom ;
      GXv_char6[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char4, GXv_char5, GXv_char6) ;
      mrec_alertadetalle_impl.this.AV9EmprCod = GXv_char4[0] ;
      mrec_alertadetalle_impl.this.AV44EmprNom = GXv_char5[0] ;
      mrec_alertadetalle_impl.this.AV27UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27UsurCod", AV27UsurCod);
      Gridmrec_alertasdts_empowerer_Gridinternalname = subGridmrec_alertasdts_Internalname ;
      ucGridmrec_alertasdts_empowerer.sendProperty(context, sPrefix, false, Gridmrec_alertasdts_empowerer_Internalname, "GridInternalName", Gridmrec_alertasdts_empowerer_Gridinternalname);
      subGridmrec_alertasdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_alertasdts_Rows ;
      ucGridmrec_alertasdtspaginationbar.sendProperty(context, sPrefix, false, Gridmrec_alertasdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      subGridmrec_alertasdts_Rows = 5 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void e142DY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV13GridMRec_AlertaSDTsCurrentPage = subgridmrec_alertasdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GridMRec_AlertaSDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridMRec_AlertaSDTsCurrentPage), 10, 0));
      AV14GridMRec_AlertaSDTsPageCount = subgridmrec_alertasdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14GridMRec_AlertaSDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14GridMRec_AlertaSDTsPageCount), 10, 0));
      edtavDatos__parfascod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Columnheaderclass", edtavDatos__parfascod_Columnheaderclass, !bGXsfl_33_Refreshing);
      edtavDatos__parfasdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Columnheaderclass", edtavDatos__parfasdsc_Columnheaderclass, !bGXsfl_33_Refreshing);
      edtavDatos__mprecvalmn_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Columnheaderclass", edtavDatos__mprecvalmn_Columnheaderclass, !bGXsfl_33_Refreshing);
      edtavDatos__mprecval_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Columnheaderclass", edtavDatos__mprecval_Columnheaderclass, !bGXsfl_33_Refreshing);
      edtavDatos__mprecvalmx_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Columnheaderclass", edtavDatos__mprecvalmx_Columnheaderclass, !bGXsfl_33_Refreshing);
      chkavDatos__mprecer.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Columnheaderclass", chkavDatos__mprecer.getColumnHeaderClass(), !bGXsfl_33_Refreshing);
      /*  Sending Event outputs  */
   }

   private void e152DY2( )
   {
      /* Gridmrec_alertasdts_Load Routine */
      returnInSub = false ;
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV7Datos.size() )
      {
         AV7Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)) );
         edtavDatos__parfascod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV7Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWColumn") ;
         edtavDatos__parfasdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV7Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmn_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV7Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecval_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV7Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmx_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV7Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         chkavDatos__mprecer.setColumnClass( ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV7Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(33) ;
         }
         if ( ( subGridmrec_alertasdts_Islastpage == 1 ) || ( subGridmrec_alertasdts_Rows == 0 ) || ( ( GRIDMREC_ALERTASDTS_nCurrentRecord >= GRIDMREC_ALERTASDTS_nFirstRecordOnPage ) && ( GRIDMREC_ALERTASDTS_nCurrentRecord < GRIDMREC_ALERTASDTS_nFirstRecordOnPage + subgridmrec_alertasdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_332( ) ;
            GRIDMREC_ALERTASDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDMREC_ALERTASDTS_nCurrentRecord + 1 >= subgridmrec_alertasdts_fnc_recordcount( ) )
            {
               GRIDMREC_ALERTASDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDMREC_ALERTASDTS_nCurrentRecord = (long)(GRIDMREC_ALERTASDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_33_Refreshing )
         {
            httpContext.doAjaxLoad(33, Gridmrec_alertasdtsRow);
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e112DY2( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridmrec_alertasdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV23PageToGo = subgridmrec_alertasdts_fnc_currentpage( ) ;
         AV23PageToGo = (int)(AV23PageToGo+1) ;
         subgridmrec_alertasdts_gotopage( AV23PageToGo) ;
      }
      else
      {
         AV23PageToGo = (int)(GXutil.lval( Gridmrec_alertasdtspaginationbar_Selectedpage)) ;
         subgridmrec_alertasdts_gotopage( AV23PageToGo) ;
      }
   }

   public void e122DY2( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridmrec_alertasdts_Rows = Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridmrec_alertasdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      AV28Elements.clear();
      AV37Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Name( "GraficaFecha" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Registro", "") );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV37Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV37Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Picture( httpContext.getMessage( "YYYY-MM-DD HH24:MI", "") );
      AV28Elements.add(AV37Element, 0);
      GXt_boolean7 = AV42existeRegistro ;
      GXv_char6[0] = AV45MRParPrPLC ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new app.ingenieria.mrparprodscget(remoteHandle, context).execute( AV9EmprCod, AV20MaqCod, AV10FasCod, AV16Hdr, AV24ParFasCod, AV27UsurCod, AV19Ip, AV22Now, AV40MTkn, GXv_char6, GXv_boolean8) ;
      mrec_alertadetalle_impl.this.AV45MRParPrPLC = GXv_char6[0] ;
      mrec_alertadetalle_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      AV42existeRegistro = GXt_boolean7 ;
      AV37Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Name( "MPRecPLC_1" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Title( (AV42existeRegistro ? AV45MRParPrPLC : httpContext.getMessage( "Parametro", "")) );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV37Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV28Elements.add(AV37Element, 0);
      AV37Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Name( "MPRecPLC_2" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Maximo", "") );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV37Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV28Elements.add(AV37Element, 0);
      AV37Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Name( "MPRecPLC_3" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Minimo", "") );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV37Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV37Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV28Elements.add(AV37Element, 0);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "PASO 2: Datos a graficar     :EmprCod:%1, ContCod:%2, Intervalo:%3, Maquinas:%4, Fases;%5, &HDR:%6, Parametro:%7, Error:%8, %9.", ""), AV9EmprCod, AV6ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0), AV20MaqCod.toJSonString(false), AV10FasCod.toJSonString(false), AV16Hdr.toJSonString(false), AV24ParFasCod.toJSonString(false), GXutil.booltostr( AV12FueraRango), GXutil.format( httpContext.getMessage( "Fechas:%1-%2, Usuario:%3, Ip:%4, Now:%5, Token:%6.", ""), localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV27UsurCod, AV19Ip, localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV40MTkn, "", "", "")), AV67Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Datos a graficar desde MRec_AlertaGraficaDP...  MRec_AlertaGraficaSDTCollection:%1", ""), AV39MRec_AlertaGraficaSDTCollection.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      Qvgrafica_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "Ingenieria\\MRec_AlertaDP")+"\", \""+GXutil.encodeJSON( AV9EmprCod)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV20MaqCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV10FasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV16Hdr.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV24ParFasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( GXutil.booltostr( AV12FueraRango))+"\", \""+GXutil.encodeJSON( AV27UsurCod)+"\", \""+GXutil.encodeJSON( AV19Ip)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV40MTkn)+"\" ]" ;
      ucQvgrafica.sendProperty(context, sPrefix, false, Qvgrafica_Internalname, "Object", Qvgrafica_Objectcall);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV9EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
      AV6ContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ContCod", AV6ContCod);
      AV26Segundos = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0));
      AV21MaqCodJson = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodJson", AV21MaqCodJson);
      AV11FasCodJSon = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FasCodJSon", AV11FasCodJSon);
      AV17HdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HdrJSON", AV17HdrJSON);
      AV25ParFasCodJSon = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ParFasCodJSon", AV25ParFasCodJSon);
      AV12FueraRango = ((Boolean) getParm(obj,7,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FueraRango", AV12FueraRango);
      AV8Desde = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Desde", localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV15Hasta = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Hasta", localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV27UsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27UsurCod", AV27UsurCod);
      AV19Ip = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Ip", AV19Ip);
      AV22Now = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Now", localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV40MTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MTkn", AV40MTkn);
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
      pa2DY2( ) ;
      ws2DY2( ) ;
      we2DY2( ) ;
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
      sCtrlAV9EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6ContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV26Segundos = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV21MaqCodJson = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11FasCodJSon = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV17HdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV25ParFasCodJSon = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV12FueraRango = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV8Desde = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV15Hasta = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV27UsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV19Ip = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV22Now = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV40MTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DY2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\mrec_alertadetalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DY2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV9EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
         AV6ContCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ContCod", AV6ContCod);
         AV26Segundos = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0));
         AV21MaqCodJson = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodJson", AV21MaqCodJson);
         AV11FasCodJSon = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FasCodJSon", AV11FasCodJSon);
         AV17HdrJSON = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HdrJSON", AV17HdrJSON);
         AV25ParFasCodJSon = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ParFasCodJSon", AV25ParFasCodJSon);
         AV12FueraRango = ((Boolean) getParm(obj,9,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FueraRango", AV12FueraRango);
         AV8Desde = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Desde", localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV15Hasta = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Hasta", localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV27UsurCod = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27UsurCod", AV27UsurCod);
         AV19Ip = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Ip", AV19Ip);
         AV22Now = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Now", localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV40MTkn = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MTkn", AV40MTkn);
      }
      wcpOAV9EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV9EmprCod") ;
      wcpOAV6ContCod = httpContext.cgiGet( sPrefix+"wcpOAV6ContCod") ;
      wcpOAV26Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26Segundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV21MaqCodJson = httpContext.cgiGet( sPrefix+"wcpOAV21MaqCodJson") ;
      wcpOAV11FasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV11FasCodJSon") ;
      wcpOAV17HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV17HdrJSON") ;
      wcpOAV25ParFasCodJSon = httpContext.cgiGet( sPrefix+"wcpOAV25ParFasCodJSon") ;
      wcpOAV12FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV12FueraRango")) ;
      wcpOAV8Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV8Desde"), 0) ;
      wcpOAV15Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV15Hasta"), 0) ;
      wcpOAV27UsurCod = httpContext.cgiGet( sPrefix+"wcpOAV27UsurCod") ;
      wcpOAV19Ip = httpContext.cgiGet( sPrefix+"wcpOAV19Ip") ;
      wcpOAV22Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV22Now"), 0) ;
      wcpOAV40MTkn = httpContext.cgiGet( sPrefix+"wcpOAV40MTkn") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV9EmprCod, wcpOAV9EmprCod) != 0 ) || ( GXutil.strcmp(AV6ContCod, wcpOAV6ContCod) != 0 ) || ( AV26Segundos != wcpOAV26Segundos ) || ( GXutil.strcmp(AV21MaqCodJson, wcpOAV21MaqCodJson) != 0 ) || ( GXutil.strcmp(AV11FasCodJSon, wcpOAV11FasCodJSon) != 0 ) || ( GXutil.strcmp(AV17HdrJSON, wcpOAV17HdrJSON) != 0 ) || ( GXutil.strcmp(AV25ParFasCodJSon, wcpOAV25ParFasCodJSon) != 0 ) || ( AV12FueraRango != wcpOAV12FueraRango ) || !( GXutil.dateCompare(AV8Desde, wcpOAV8Desde) ) || !( GXutil.dateCompare(AV15Hasta, wcpOAV15Hasta) ) || ( GXutil.strcmp(AV27UsurCod, wcpOAV27UsurCod) != 0 ) || ( GXutil.strcmp(AV19Ip, wcpOAV19Ip) != 0 ) || !( GXutil.dateCompare(AV22Now, wcpOAV22Now) ) || ( GXutil.strcmp(AV40MTkn, wcpOAV40MTkn) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV9EmprCod = AV9EmprCod ;
      wcpOAV6ContCod = AV6ContCod ;
      wcpOAV26Segundos = AV26Segundos ;
      wcpOAV21MaqCodJson = AV21MaqCodJson ;
      wcpOAV11FasCodJSon = AV11FasCodJSon ;
      wcpOAV17HdrJSON = AV17HdrJSON ;
      wcpOAV25ParFasCodJSon = AV25ParFasCodJSon ;
      wcpOAV12FueraRango = AV12FueraRango ;
      wcpOAV8Desde = AV8Desde ;
      wcpOAV15Hasta = AV15Hasta ;
      wcpOAV27UsurCod = AV27UsurCod ;
      wcpOAV19Ip = AV19Ip ;
      wcpOAV22Now = AV22Now ;
      wcpOAV40MTkn = AV40MTkn ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV9EmprCod = httpContext.cgiGet( sPrefix+"AV9EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV9EmprCod) > 0 )
      {
         AV9EmprCod = httpContext.cgiGet( sCtrlAV9EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
      }
      else
      {
         AV9EmprCod = httpContext.cgiGet( sPrefix+"AV9EmprCod_PARM") ;
      }
      sCtrlAV6ContCod = httpContext.cgiGet( sPrefix+"AV6ContCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6ContCod) > 0 )
      {
         AV6ContCod = httpContext.cgiGet( sCtrlAV6ContCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ContCod", AV6ContCod);
      }
      else
      {
         AV6ContCod = httpContext.cgiGet( sPrefix+"AV6ContCod_PARM") ;
      }
      sCtrlAV26Segundos = httpContext.cgiGet( sPrefix+"AV26Segundos_CTRL") ;
      if ( GXutil.len( sCtrlAV26Segundos) > 0 )
      {
         AV26Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV26Segundos), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0));
      }
      else
      {
         AV26Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV26Segundos_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV21MaqCodJson = httpContext.cgiGet( sPrefix+"AV21MaqCodJson_CTRL") ;
      if ( GXutil.len( sCtrlAV21MaqCodJson) > 0 )
      {
         AV21MaqCodJson = httpContext.cgiGet( sCtrlAV21MaqCodJson) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodJson", AV21MaqCodJson);
      }
      else
      {
         AV21MaqCodJson = httpContext.cgiGet( sPrefix+"AV21MaqCodJson_PARM") ;
      }
      sCtrlAV11FasCodJSon = httpContext.cgiGet( sPrefix+"AV11FasCodJSon_CTRL") ;
      if ( GXutil.len( sCtrlAV11FasCodJSon) > 0 )
      {
         AV11FasCodJSon = httpContext.cgiGet( sCtrlAV11FasCodJSon) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FasCodJSon", AV11FasCodJSon);
      }
      else
      {
         AV11FasCodJSon = httpContext.cgiGet( sPrefix+"AV11FasCodJSon_PARM") ;
      }
      sCtrlAV17HdrJSON = httpContext.cgiGet( sPrefix+"AV17HdrJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV17HdrJSON) > 0 )
      {
         AV17HdrJSON = httpContext.cgiGet( sCtrlAV17HdrJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HdrJSON", AV17HdrJSON);
      }
      else
      {
         AV17HdrJSON = httpContext.cgiGet( sPrefix+"AV17HdrJSON_PARM") ;
      }
      sCtrlAV25ParFasCodJSon = httpContext.cgiGet( sPrefix+"AV25ParFasCodJSon_CTRL") ;
      if ( GXutil.len( sCtrlAV25ParFasCodJSon) > 0 )
      {
         AV25ParFasCodJSon = httpContext.cgiGet( sCtrlAV25ParFasCodJSon) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ParFasCodJSon", AV25ParFasCodJSon);
      }
      else
      {
         AV25ParFasCodJSon = httpContext.cgiGet( sPrefix+"AV25ParFasCodJSon_PARM") ;
      }
      sCtrlAV12FueraRango = httpContext.cgiGet( sPrefix+"AV12FueraRango_CTRL") ;
      if ( GXutil.len( sCtrlAV12FueraRango) > 0 )
      {
         AV12FueraRango = GXutil.strtobool( httpContext.cgiGet( sCtrlAV12FueraRango)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FueraRango", AV12FueraRango);
      }
      else
      {
         AV12FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV12FueraRango_PARM")) ;
      }
      sCtrlAV8Desde = httpContext.cgiGet( sPrefix+"AV8Desde_CTRL") ;
      if ( GXutil.len( sCtrlAV8Desde) > 0 )
      {
         AV8Desde = localUtil.ctot( httpContext.cgiGet( sCtrlAV8Desde), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Desde", localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV8Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV8Desde_PARM"), 0) ;
      }
      sCtrlAV15Hasta = httpContext.cgiGet( sPrefix+"AV15Hasta_CTRL") ;
      if ( GXutil.len( sCtrlAV15Hasta) > 0 )
      {
         AV15Hasta = localUtil.ctot( httpContext.cgiGet( sCtrlAV15Hasta), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Hasta", localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV15Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV15Hasta_PARM"), 0) ;
      }
      sCtrlAV27UsurCod = httpContext.cgiGet( sPrefix+"AV27UsurCod_CTRL") ;
      if ( GXutil.len( sCtrlAV27UsurCod) > 0 )
      {
         AV27UsurCod = httpContext.cgiGet( sCtrlAV27UsurCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27UsurCod", AV27UsurCod);
      }
      else
      {
         AV27UsurCod = httpContext.cgiGet( sPrefix+"AV27UsurCod_PARM") ;
      }
      sCtrlAV19Ip = httpContext.cgiGet( sPrefix+"AV19Ip_CTRL") ;
      if ( GXutil.len( sCtrlAV19Ip) > 0 )
      {
         AV19Ip = httpContext.cgiGet( sCtrlAV19Ip) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Ip", AV19Ip);
      }
      else
      {
         AV19Ip = httpContext.cgiGet( sPrefix+"AV19Ip_PARM") ;
      }
      sCtrlAV22Now = httpContext.cgiGet( sPrefix+"AV22Now_CTRL") ;
      if ( GXutil.len( sCtrlAV22Now) > 0 )
      {
         AV22Now = localUtil.ctot( httpContext.cgiGet( sCtrlAV22Now), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Now", localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV22Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV22Now_PARM"), 0) ;
      }
      sCtrlAV40MTkn = httpContext.cgiGet( sPrefix+"AV40MTkn_CTRL") ;
      if ( GXutil.len( sCtrlAV40MTkn) > 0 )
      {
         AV40MTkn = httpContext.cgiGet( sCtrlAV40MTkn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MTkn", AV40MTkn);
      }
      else
      {
         AV40MTkn = httpContext.cgiGet( sPrefix+"AV40MTkn_PARM") ;
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
      pa2DY2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DY2( ) ;
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
      ws2DY2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9EmprCod_PARM", GXutil.rtrim( AV9EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9EmprCod_CTRL", GXutil.rtrim( sCtrlAV9EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ContCod_PARM", GXutil.rtrim( AV6ContCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6ContCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ContCod_CTRL", GXutil.rtrim( sCtrlAV6ContCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Segundos_PARM", GXutil.ltrim( localUtil.ntoc( AV26Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Segundos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Segundos_CTRL", GXutil.rtrim( sCtrlAV26Segundos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21MaqCodJson_PARM", AV21MaqCodJson);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21MaqCodJson)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21MaqCodJson_CTRL", GXutil.rtrim( sCtrlAV21MaqCodJson));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FasCodJSon_PARM", AV11FasCodJSon);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11FasCodJSon)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FasCodJSon_CTRL", GXutil.rtrim( sCtrlAV11FasCodJSon));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17HdrJSON_PARM", AV17HdrJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17HdrJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17HdrJSON_CTRL", GXutil.rtrim( sCtrlAV17HdrJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25ParFasCodJSon_PARM", AV25ParFasCodJSon);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25ParFasCodJSon)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25ParFasCodJSon_CTRL", GXutil.rtrim( sCtrlAV25ParFasCodJSon));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12FueraRango_PARM", GXutil.booltostr( AV12FueraRango));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12FueraRango)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12FueraRango_CTRL", GXutil.rtrim( sCtrlAV12FueraRango));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Desde_PARM", localUtil.ttoc( AV8Desde, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Desde)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Desde_CTRL", GXutil.rtrim( sCtrlAV8Desde));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Hasta_PARM", localUtil.ttoc( AV15Hasta, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15Hasta)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Hasta_CTRL", GXutil.rtrim( sCtrlAV15Hasta));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27UsurCod_PARM", GXutil.rtrim( AV27UsurCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27UsurCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27UsurCod_CTRL", GXutil.rtrim( sCtrlAV27UsurCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Ip_PARM", AV19Ip);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Ip)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Ip_CTRL", GXutil.rtrim( sCtrlAV19Ip));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Now_PARM", localUtil.ttoc( AV22Now, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22Now)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Now_CTRL", GXutil.rtrim( sCtrlAV22Now));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40MTkn_PARM", AV40MTkn);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40MTkn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40MTkn_CTRL", GXutil.rtrim( sCtrlAV40MTkn));
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
      we2DY2( ) ;
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
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671010484977", true, true);
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
         httpContext.AddJavascriptSource("ingenieria/mrec_alertadetalle.js", "?202671010484978", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_332( )
   {
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD_"+sGXsfl_33_idx ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD_"+sGXsfl_33_idx ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN_"+sGXsfl_33_idx ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC_"+sGXsfl_33_idx ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD_"+sGXsfl_33_idx ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO_"+sGXsfl_33_idx ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR_"+sGXsfl_33_idx ;
      edtavDatos__maqcod_Internalname = sPrefix+"DATOS__MAQCOD_"+sGXsfl_33_idx ;
      edtavDatos__maqdsc_Internalname = sPrefix+"DATOS__MAQDSC_"+sGXsfl_33_idx ;
      edtavDatos__mprecplc_Internalname = sPrefix+"DATOS__MPRECPLC_"+sGXsfl_33_idx ;
      edtavDatos__fascod_Internalname = sPrefix+"DATOS__FASCOD_"+sGXsfl_33_idx ;
      edtavDatos__fasdsc_Internalname = sPrefix+"DATOS__FASDSC_"+sGXsfl_33_idx ;
      edtavDatos__parfascod_Internalname = sPrefix+"DATOS__PARFASCOD_"+sGXsfl_33_idx ;
      edtavDatos__parfasdsc_Internalname = sPrefix+"DATOS__PARFASDSC_"+sGXsfl_33_idx ;
      edtavDatos__mprecvalmn_Internalname = sPrefix+"DATOS__MPRECVALMN_"+sGXsfl_33_idx ;
      edtavDatos__mprecval_Internalname = sPrefix+"DATOS__MPRECVAL_"+sGXsfl_33_idx ;
      edtavDatos__mprecvalmx_Internalname = sPrefix+"DATOS__MPRECVALMX_"+sGXsfl_33_idx ;
      chkavDatos__mprecer.setInternalname( sPrefix+"DATOS__MPRECER_"+sGXsfl_33_idx );
   }

   public void subsflControlProps_fel_332( )
   {
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD_"+sGXsfl_33_fel_idx ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD_"+sGXsfl_33_fel_idx ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN_"+sGXsfl_33_fel_idx ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC_"+sGXsfl_33_fel_idx ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD_"+sGXsfl_33_fel_idx ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO_"+sGXsfl_33_fel_idx ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR_"+sGXsfl_33_fel_idx ;
      edtavDatos__maqcod_Internalname = sPrefix+"DATOS__MAQCOD_"+sGXsfl_33_fel_idx ;
      edtavDatos__maqdsc_Internalname = sPrefix+"DATOS__MAQDSC_"+sGXsfl_33_fel_idx ;
      edtavDatos__mprecplc_Internalname = sPrefix+"DATOS__MPRECPLC_"+sGXsfl_33_fel_idx ;
      edtavDatos__fascod_Internalname = sPrefix+"DATOS__FASCOD_"+sGXsfl_33_fel_idx ;
      edtavDatos__fasdsc_Internalname = sPrefix+"DATOS__FASDSC_"+sGXsfl_33_fel_idx ;
      edtavDatos__parfascod_Internalname = sPrefix+"DATOS__PARFASCOD_"+sGXsfl_33_fel_idx ;
      edtavDatos__parfasdsc_Internalname = sPrefix+"DATOS__PARFASDSC_"+sGXsfl_33_fel_idx ;
      edtavDatos__mprecvalmn_Internalname = sPrefix+"DATOS__MPRECVALMN_"+sGXsfl_33_fel_idx ;
      edtavDatos__mprecval_Internalname = sPrefix+"DATOS__MPRECVAL_"+sGXsfl_33_fel_idx ;
      edtavDatos__mprecvalmx_Internalname = sPrefix+"DATOS__MPRECVALMX_"+sGXsfl_33_fel_idx ;
      chkavDatos__mprecer.setInternalname( sPrefix+"DATOS__MPRECER_"+sGXsfl_33_fel_idx );
   }

   public void sendrow_332( )
   {
      subsflControlProps_332( ) ;
      wb2DY0( ) ;
      if ( ( subGridmrec_alertasdts_Rows * 1 == 0 ) || ( nGXsfl_33_idx <= subgridmrec_alertasdts_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_33_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_33_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__emprcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__menvord_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__menvord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__menvord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__menvord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mreclin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mreclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mreclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mreclin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecfec_Internalname,localUtil.ttoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), "99/99/99 99:99:99.999"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mprecfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecplc_Internalname,((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecplc(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecplc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mprecplc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fascod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfascod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__parfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfascod_Columnclass,edtavDatos__parfascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfasdsc_Columnclass,edtavDatos__parfasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmn_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmn_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmn_Columnclass,edtavDatos__mprecvalmn_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecval_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecval_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecval_Columnclass,edtavDatos__mprecval_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmx_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmx_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmx_Columnclass,edtavDatos__mprecvalmx_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DATOS__MPRECER_" + sGXsfl_33_idx ;
         chkavDatos__mprecer.setName( GXCCtl );
         chkavDatos__mprecer.setWebtags( "" );
         chkavDatos__mprecer.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_33_Refreshing);
         chkavDatos__mprecer.setCheckedValue( "false" );
         Gridmrec_alertasdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavDatos__mprecer.getInternalname(),GXutil.booltostr( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV7Datos.elementAt(-1+AV48GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()),"","",Integer.valueOf(-1),Integer.valueOf(chkavDatos__mprecer.getEnabled()),"true","",StyleString,ClassString,chkavDatos__mprecer.getColumnClass(),chkavDatos__mprecer.getColumnHeaderClass(),""});
         send_integrity_lvl_hashes2DY2( ) ;
         Gridmrec_alertasdtsContainer.AddRow(Gridmrec_alertasdtsRow);
         nGXsfl_33_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_33_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      /* End function sendrow_332 */
   }

   public void startgridcontrol33( )
   {
      if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_alertasdtsContainer"+"DivS\" data-gxgridid=\"33\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmrec_alertasdts_Internalname, subGridmrec_alertasdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Línea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Máq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PLC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", sPrefix);
         Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
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
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecplc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
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
      lblTitulo_Internalname = sPrefix+"TITULO" ;
      divPanelfiltros_Internalname = sPrefix+"PANELFILTROS" ;
      Dvpanel_panelfiltros_Internalname = sPrefix+"DVPANEL_PANELFILTROS" ;
      Qvgrafica_Internalname = sPrefix+"QVGRAFICA" ;
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
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablemasdetalles_Internalname = sPrefix+"TABLEMASDETALLES" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamon_Internalname = sPrefix+"DATAMON" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Gridmrec_alertasdts_empowerer_Internalname = sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
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
      subGridmrec_alertasdts_Allowselection = (byte)(0) ;
      subGridmrec_alertasdts_Header = "" ;
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
      edtavDatos__fasdsc_Enabled = 0 ;
      edtavDatos__fascod_Jsonclick = "" ;
      edtavDatos__fascod_Enabled = 0 ;
      edtavDatos__mprecplc_Jsonclick = "" ;
      edtavDatos__mprecplc_Enabled = 0 ;
      edtavDatos__maqdsc_Jsonclick = "" ;
      edtavDatos__maqdsc_Enabled = 0 ;
      edtavDatos__maqcod_Jsonclick = "" ;
      edtavDatos__maqcod_Enabled = 0 ;
      edtavDatos__barcodpar_Jsonclick = "" ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__barcodreo_Jsonclick = "" ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcod_Jsonclick = "" ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__mprecfec_Jsonclick = "" ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__mreclin_Jsonclick = "" ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__menvord_Jsonclick = "" ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__emprcod_Jsonclick = "" ;
      edtavDatos__emprcod_Enabled = 0 ;
      subGridmrec_alertasdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridmrec_alertasdts_Backcolorstyle = (byte)(0) ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Qvgrafica_Title = "" ;
      lblTitulo_Caption = " " ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Recepción datos de máquinas", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Qvgrafica_Charttype = "SmoothTimeline" ;
      Qvgrafica_Type = "Chart" ;
      Qvgrafica_Objectcall = "" ;
      Dvpanel_panelfiltros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Iconposition = "Right" ;
      Dvpanel_panelfiltros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Title = "" ;
      Dvpanel_panelfiltros_Cls = "PanelNoHeader" ;
      Dvpanel_panelfiltros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Width = "100%" ;
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
      GXCCtl = "DATOS__MPRECER_" + sGXsfl_33_idx ;
      chkavDatos__mprecer.setName( GXCCtl );
      chkavDatos__mprecer.setWebtags( "" );
      chkavDatos__mprecer.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_33_Refreshing);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'sPrefix'},{av:'AV7Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:33},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV13GridMRec_AlertaSDTsCurrentPage',fld:'vGRIDMREC_ALERTASDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV14GridMRec_AlertaSDTsPageCount',fld:'vGRIDMREC_ALERTASDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'DATOS__PARFASCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECER',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD","{handler:'e152DY2',iparms:[{av:'AV7Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:33}]");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD",",oparms:[{ctrl:'DATOS__PARFASCOD',prop:'Columnclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnclass'},{ctrl:'DATOS__MPRECER',prop:'Columnclass'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e112DY2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV7Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:33},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_alertasdtspaginationbar_Selectedpage',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122DY2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV7Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:33},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv19',iparms:[]");
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
      wcpOAV9EmprCod = "" ;
      wcpOAV6ContCod = "" ;
      wcpOAV21MaqCodJson = "" ;
      wcpOAV11FasCodJSon = "" ;
      wcpOAV17HdrJSON = "" ;
      wcpOAV25ParFasCodJSon = "" ;
      wcpOAV8Desde = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV15Hasta = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV27UsurCod = "" ;
      wcpOAV19Ip = "" ;
      wcpOAV22Now = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV40MTkn = "" ;
      Gridmrec_alertasdtspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV9EmprCod = "" ;
      AV6ContCod = "" ;
      AV21MaqCodJson = "" ;
      AV11FasCodJSon = "" ;
      AV17HdrJSON = "" ;
      AV25ParFasCodJSon = "" ;
      AV8Desde = GXutil.resetTime( GXutil.nullDate() );
      AV15Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV27UsurCod = "" ;
      AV19Ip = "" ;
      AV22Now = GXutil.resetTime( GXutil.nullDate() );
      AV40MTkn = "" ;
      AV7Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV67Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV28Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV29Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV30ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV31ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV32DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV33FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV34ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV35ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      Gridmrec_alertasdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelfiltros = new com.genexus.webpanels.GXUserControl();
      lblTitulo_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucQvgrafica = new com.genexus.webpanels.GXUserControl();
      Gridmrec_alertasdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridmrec_alertasdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucGridmrec_alertasdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV20MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV10FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      GXt_objcol_SdtMRec_AlertaSDT_Item1 = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AlertaSDT_Item2 = new GXBaseCollection[1] ;
      AV43Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV44EmprNom = "" ;
      GXv_char5 = new String[1] ;
      Gridmrec_alertasdtsRow = new com.genexus.webpanels.GXWebRow();
      AV37Element = new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV45MRParPrPLC = "" ;
      GXv_char6 = new String[1] ;
      GXv_boolean8 = new boolean[1] ;
      AV39MRec_AlertaGraficaSDTCollection = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>(app.ingenieria.SdtMRec_AlertaGraficaSDT.class, "MRec_AlertaGraficaSDT", "TexplusNET", remoteHandle);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV9EmprCod = "" ;
      sCtrlAV6ContCod = "" ;
      sCtrlAV26Segundos = "" ;
      sCtrlAV21MaqCodJson = "" ;
      sCtrlAV11FasCodJSon = "" ;
      sCtrlAV17HdrJSON = "" ;
      sCtrlAV25ParFasCodJSon = "" ;
      sCtrlAV12FueraRango = "" ;
      sCtrlAV8Desde = "" ;
      sCtrlAV15Hasta = "" ;
      sCtrlAV27UsurCod = "" ;
      sCtrlAV19Ip = "" ;
      sCtrlAV22Now = "" ;
      sCtrlAV40MTkn = "" ;
      subGridmrec_alertasdts_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      Gridmrec_alertasdtsColumn = new com.genexus.webpanels.GXWebColumn();
      AV67Pgmname = "Ingenieria.MRec_AlertaDetalle" ;
      /* GeneXus formulas. */
      AV67Pgmname = "Ingenieria.MRec_AlertaDetalle" ;
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
   }

   private byte GRIDMREC_ALERTASDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridmrec_alertasdts_Backcolorstyle ;
   private byte subGridmrec_alertasdts_Backstyle ;
   private byte subGridmrec_alertasdts_Titlebackstyle ;
   private byte subGridmrec_alertasdts_Allowselection ;
   private byte subGridmrec_alertasdts_Allowhovering ;
   private byte subGridmrec_alertasdts_Allowcollapsing ;
   private byte subGridmrec_alertasdts_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV26Segundos ;
   private int Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_33 ;
   private int AV26Segundos ;
   private int subGridmrec_alertasdts_Rows ;
   private int nGXsfl_33_idx=1 ;
   private int Gridmrec_alertasdtspaginationbar_Pagestoshow ;
   private int AV48GXV1 ;
   private int edtavPgmname_Enabled ;
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
   private int nGXsfl_33_fel_idx=1 ;
   private int AV23PageToGo ;
   private int idxLst ;
   private int subGridmrec_alertasdts_Backcolor ;
   private int subGridmrec_alertasdts_Allbackcolor ;
   private int subGridmrec_alertasdts_Titlebackcolor ;
   private int subGridmrec_alertasdts_Selectedindex ;
   private int subGridmrec_alertasdts_Selectioncolor ;
   private int subGridmrec_alertasdts_Hoveringcolor ;
   private long GRIDMREC_ALERTASDTS_nFirstRecordOnPage ;
   private long AV13GridMRec_AlertaSDTsCurrentPage ;
   private long AV14GridMRec_AlertaSDTsPageCount ;
   private long GRIDMREC_ALERTASDTS_nCurrentRecord ;
   private long GRIDMREC_ALERTASDTS_nRecordCount ;
   private String wcpOAV9EmprCod ;
   private String wcpOAV6ContCod ;
   private String wcpOAV27UsurCod ;
   private String Gridmrec_alertasdtspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV9EmprCod ;
   private String AV6ContCod ;
   private String AV27UsurCod ;
   private String sGXsfl_33_idx="0001" ;
   private String AV67Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_panelfiltros_Width ;
   private String Dvpanel_panelfiltros_Cls ;
   private String Dvpanel_panelfiltros_Title ;
   private String Dvpanel_panelfiltros_Iconposition ;
   private String Qvgrafica_Objectcall ;
   private String Qvgrafica_Type ;
   private String Qvgrafica_Charttype ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Gridmrec_alertasdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelfiltros_Internalname ;
   private String divPanelfiltros_Internalname ;
   private String lblTitulo_Internalname ;
   private String lblTitulo_Caption ;
   private String lblTitulo_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Qvgrafica_Title ;
   private String Qvgrafica_Internalname ;
   private String divGridmrec_alertasdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridmrec_alertasdts_Internalname ;
   private String Gridmrec_alertasdtspaginationbar_Internalname ;
   private String divTablemasdetalles_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamon_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridmrec_alertasdts_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
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
   private String sGXsfl_33_fel_idx="0001" ;
   private String hsh ;
   private String AV43Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV44EmprNom ;
   private String GXv_char5[] ;
   private String edtavDatos__parfascod_Columnheaderclass ;
   private String edtavDatos__parfasdsc_Columnheaderclass ;
   private String edtavDatos__mprecvalmn_Columnheaderclass ;
   private String edtavDatos__mprecval_Columnheaderclass ;
   private String edtavDatos__mprecvalmx_Columnheaderclass ;
   private String edtavDatos__parfascod_Columnclass ;
   private String edtavDatos__parfasdsc_Columnclass ;
   private String edtavDatos__mprecvalmn_Columnclass ;
   private String edtavDatos__mprecval_Columnclass ;
   private String edtavDatos__mprecvalmx_Columnclass ;
   private String GXv_char6[] ;
   private String sCtrlAV9EmprCod ;
   private String sCtrlAV6ContCod ;
   private String sCtrlAV26Segundos ;
   private String sCtrlAV21MaqCodJson ;
   private String sCtrlAV11FasCodJSon ;
   private String sCtrlAV17HdrJSON ;
   private String sCtrlAV25ParFasCodJSon ;
   private String sCtrlAV12FueraRango ;
   private String sCtrlAV8Desde ;
   private String sCtrlAV15Hasta ;
   private String sCtrlAV27UsurCod ;
   private String sCtrlAV19Ip ;
   private String sCtrlAV22Now ;
   private String sCtrlAV40MTkn ;
   private String subGridmrec_alertasdts_Class ;
   private String subGridmrec_alertasdts_Linesclass ;
   private String ROClassString ;
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
   private String GXCCtl ;
   private String subGridmrec_alertasdts_Header ;
   private java.util.Date wcpOAV8Desde ;
   private java.util.Date wcpOAV15Hasta ;
   private java.util.Date wcpOAV22Now ;
   private java.util.Date AV8Desde ;
   private java.util.Date AV15Hasta ;
   private java.util.Date AV22Now ;
   private boolean wcpOAV12FueraRango ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12FueraRango ;
   private boolean Dvpanel_panelfiltros_Autowidth ;
   private boolean Dvpanel_panelfiltros_Autoheight ;
   private boolean Dvpanel_panelfiltros_Collapsible ;
   private boolean Dvpanel_panelfiltros_Collapsed ;
   private boolean Dvpanel_panelfiltros_Showcollapseicon ;
   private boolean Dvpanel_panelfiltros_Autoscroll ;
   private boolean Gridmrec_alertasdtspaginationbar_Showfirst ;
   private boolean Gridmrec_alertasdtspaginationbar_Showprevious ;
   private boolean Gridmrec_alertasdtspaginationbar_Shownext ;
   private boolean Gridmrec_alertasdtspaginationbar_Showlast ;
   private boolean Gridmrec_alertasdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_33_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV33 ;
   private boolean gx_refresh_fired ;
   private boolean AV42existeRegistro ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String wcpOAV21MaqCodJson ;
   private String wcpOAV11FasCodJSon ;
   private String wcpOAV17HdrJSON ;
   private String wcpOAV25ParFasCodJSon ;
   private String wcpOAV19Ip ;
   private String wcpOAV40MTkn ;
   private String AV21MaqCodJson ;
   private String AV11FasCodJSon ;
   private String AV17HdrJSON ;
   private String AV25ParFasCodJSon ;
   private String AV19Ip ;
   private String AV40MTkn ;
   private String AV45MRParPrPLC ;
   private GXSimpleCollection<Short> AV24ParFasCod ;
   private com.genexus.webpanels.GXWebGrid Gridmrec_alertasdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridmrec_alertasdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridmrec_alertasdtsColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfiltros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucQvgrafica ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdts_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT> AV39MRec_AlertaGraficaSDTCollection ;
   private ICheckbox chkavDatos__mprecer ;
   private GXSimpleCollection<String> AV20MaqCod ;
   private GXSimpleCollection<String> AV10FasCod ;
   private GXSimpleCollection<String> AV16Hdr ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV7Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXt_objcol_SdtMRec_AlertaSDT_Item1 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXv_objcol_SdtMRec_AlertaSDT_Item2[] ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV28Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV29Parameters ;
   private app.SdtQueryViewerElements_Element AV37Element ;
   private app.SdtQueryViewerItemClickData AV30ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV31ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV32DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV33FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV34ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV35ItemCollapseData ;
}

