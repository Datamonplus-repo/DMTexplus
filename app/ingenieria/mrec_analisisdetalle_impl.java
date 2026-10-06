package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_analisisdetalle_impl extends GXWebComponent
{
   public mrec_analisisdetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_analisisdetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_analisisdetalle_impl.class ));
   }

   public mrec_analisisdetalle_impl( int remoteHandle ,
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
               AV20EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20EmprCod", AV20EmprCod);
               AV21ContCod = httpContext.GetPar( "ContCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ContCod", AV21ContCod);
               AV39Segundos = (int)(GXutil.lval( httpContext.GetPar( "Segundos"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Segundos), 6, 0));
               AV24MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCodJSON", AV24MaqCodJSON);
               AV25FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FasCodJSON", AV25FasCodJSON);
               AV26HdrJSON = httpContext.GetPar( "HdrJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HdrJSON", AV26HdrJSON);
               AV27ParFasCodJSON = httpContext.GetPar( "ParFasCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ParFasCodJSON", AV27ParFasCodJSON);
               AV28FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28FueraRango", AV28FueraRango);
               AV29Desde = localUtil.parseDTimeParm( httpContext.GetPar( "Desde")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Desde", localUtil.ttoc( AV29Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV30Hasta = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Hasta", localUtil.ttoc( AV30Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV22UsurCod = httpContext.GetPar( "UsurCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22UsurCod", AV22UsurCod);
               AV31Ip = httpContext.GetPar( "Ip") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Ip", AV31Ip);
               AV32Now = localUtil.parseDTimeParm( httpContext.GetPar( "Now")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Now", localUtil.ttoc( AV32Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV23MTkn = httpContext.GetPar( "MTkn") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MTkn", AV23MTkn);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV20EmprCod,AV21ContCod,Integer.valueOf(AV39Segundos),AV24MaqCodJSON,AV25FasCodJSON,AV26HdrJSON,AV27ParFasCodJSON,Boolean.valueOf(AV28FueraRango),AV29Desde,AV30Hasta,AV22UsurCod,AV31Ip,AV32Now,AV23MTkn});
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmrec_sdts") == 0 )
            {
               gxnrgridmrec_sdts_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmrec_sdts") == 0 )
            {
               gxgrgridmrec_sdts_refresh_invoke( ) ;
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

   public void gxnrgridmrec_sdts_newrow_invoke( )
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
      gxnrgridmrec_sdts_newrow( ) ;
      /* End function gxnrGridmrec_sdts_newrow_invoke */
   }

   public void gxgrgridmrec_sdts_refresh_invoke( )
   {
      subGridmrec_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmrec_sdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5Datos);
      AV64Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmrec_sdts_refresh( subGridmrec_sdts_Rows, AV5Datos, AV64Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmrec_sdts_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DZ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "MRec_Analisis Detalle", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_analisisdetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV21ContCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39Segundos,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24MaqCodJSON)),GXutil.URLEncode(GXutil.rtrim(AV25FasCodJSON)),GXutil.URLEncode(GXutil.rtrim(AV26HdrJSON)),GXutil.URLEncode(GXutil.rtrim(AV27ParFasCodJSON)),GXutil.URLEncode(GXutil.booltostr(AV28FueraRango)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV29Desde)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV30Hasta)),GXutil.URLEncode(GXutil.rtrim(AV22UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV31Ip)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV32Now)),GXutil.URLEncode(GXutil.rtrim(AV23MTkn))}, new String[] {"EmprCod","ContCod","Segundos","MaqCodJSON","FasCodJSON","HdrJSON","ParFasCodJSON","FueraRango","Desde","Hasta","UsurCod","Ip","Now","MTkn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDATOS", getSecureSignedToken( sPrefix, AV5Datos));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AnalisisDetalle");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_analisisdetalle:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Datos", AV5Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Datos", AV5Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Datos", getSecureSignedToken( sPrefix, AV5Datos));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_33, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV6Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV6Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV7Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV7Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV8ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV8ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV9ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV9ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV10DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV10DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV11FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV11FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV12ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV12ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV13ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV13ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_SDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV18GridMRec_SDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_SDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV19GridMRec_SDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20EmprCod", GXutil.rtrim( wcpOAV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21ContCod", GXutil.rtrim( wcpOAV21ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39Segundos", GXutil.ltrim( localUtil.ntoc( wcpOAV39Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24MaqCodJSON", wcpOAV24MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25FasCodJSON", wcpOAV25FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26HdrJSON", wcpOAV26HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27ParFasCodJSON", wcpOAV27ParFasCodJSON);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV28FueraRango", wcpOAV28FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Desde", localUtil.ttoc( wcpOAV29Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Hasta", localUtil.ttoc( wcpOAV30Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22UsurCod", GXutil.rtrim( wcpOAV22UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31Ip", wcpOAV31Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Now", localUtil.ttoc( wcpOAV32Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23MTkn", wcpOAV23MTkn);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDATOS", AV5Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDATOS", AV5Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDATOS", getSecureSignedToken( sPrefix, AV5Datos));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTCOD", GXutil.rtrim( AV21ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSEGUNDOS", GXutil.ltrim( localUtil.ntoc( AV39Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODJSON", AV24MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODJSON", AV25FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHDRJSON", AV26HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARFASCODJSON", AV27ParFasCodJSON);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vFUERARANGO", AV28FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDESDE", localUtil.ttoc( AV29Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASTA", localUtil.ttoc( AV30Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV22UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIP", AV31Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOW", localUtil.ttoc( AV32Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV23MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridmrec_sdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridmrec_sdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridmrec_sdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridmrec_sdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridmrec_sdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridmrec_sdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridmrec_sdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridmrec_sdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridmrec_sdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridmrec_sdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridmrec_sdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridmrec_sdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridmrec_sdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridmrec_sdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridmrec_sdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridmrec_sdtspaginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridmrec_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2DZ2( )
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
      return "Ingenieria.MRec_AnalisisDetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MRec_Analisis Detalle", "") ;
   }

   public void wb2DZ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.mrec_analisisdetalle");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTitulo_Internalname, lblTitulo_Caption, "", "", lblTitulo_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AnalisisDetalle.htm");
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
         ucQvgrafica.setProperty("Elements", AV6Elements);
         ucQvgrafica.setProperty("Parameters", AV7Parameters);
         ucQvgrafica.setProperty("Type", Qvgrafica_Type);
         ucQvgrafica.setProperty("Title", Qvgrafica_Title);
         ucQvgrafica.setProperty("ChartType", Qvgrafica_Charttype);
         ucQvgrafica.setProperty("ItemClickData", AV8ItemClickData);
         ucQvgrafica.setProperty("ItemDoubleClickData", AV9ItemDoubleClickData);
         ucQvgrafica.setProperty("DragAndDropData", AV10DragAndDropData);
         ucQvgrafica.setProperty("FilterChangedData", AV11FilterChangedData);
         ucQvgrafica.setProperty("ItemExpandData", AV12ItemExpandData);
         ucQvgrafica.setProperty("ItemCollapseData", AV13ItemCollapseData);
         ucQvgrafica.render(context, "queryviewer", Qvgrafica_Internalname, sPrefix+"QVGRAFICAContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridmrec_sdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridmrec_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol33( ) ;
      }
      if ( wbEnd == 33 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_33 = (int)(nGXsfl_33_idx-1) ;
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV45GXV1 = nGXsfl_33_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmrec_sdts", Gridmrec_sdtsContainer, subGridmrec_sdts_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_sdtsContainerData", Gridmrec_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_sdtsContainerData"+"V", Gridmrec_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridmrec_sdtsContainerData"+"V"+"\" value='"+Gridmrec_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridmrec_sdtspaginationbar.setProperty("Class", Gridmrec_sdtspaginationbar_Class);
         ucGridmrec_sdtspaginationbar.setProperty("ShowFirst", Gridmrec_sdtspaginationbar_Showfirst);
         ucGridmrec_sdtspaginationbar.setProperty("ShowPrevious", Gridmrec_sdtspaginationbar_Showprevious);
         ucGridmrec_sdtspaginationbar.setProperty("ShowNext", Gridmrec_sdtspaginationbar_Shownext);
         ucGridmrec_sdtspaginationbar.setProperty("ShowLast", Gridmrec_sdtspaginationbar_Showlast);
         ucGridmrec_sdtspaginationbar.setProperty("PagesToShow", Gridmrec_sdtspaginationbar_Pagestoshow);
         ucGridmrec_sdtspaginationbar.setProperty("PagingButtonsPosition", Gridmrec_sdtspaginationbar_Pagingbuttonsposition);
         ucGridmrec_sdtspaginationbar.setProperty("PagingCaptionPosition", Gridmrec_sdtspaginationbar_Pagingcaptionposition);
         ucGridmrec_sdtspaginationbar.setProperty("EmptyGridClass", Gridmrec_sdtspaginationbar_Emptygridclass);
         ucGridmrec_sdtspaginationbar.setProperty("RowsPerPageSelector", Gridmrec_sdtspaginationbar_Rowsperpageselector);
         ucGridmrec_sdtspaginationbar.setProperty("RowsPerPageOptions", Gridmrec_sdtspaginationbar_Rowsperpageoptions);
         ucGridmrec_sdtspaginationbar.setProperty("Previous", Gridmrec_sdtspaginationbar_Previous);
         ucGridmrec_sdtspaginationbar.setProperty("Next", Gridmrec_sdtspaginationbar_Next);
         ucGridmrec_sdtspaginationbar.setProperty("Caption", Gridmrec_sdtspaginationbar_Caption);
         ucGridmrec_sdtspaginationbar.setProperty("EmptyGridCaption", Gridmrec_sdtspaginationbar_Emptygridcaption);
         ucGridmrec_sdtspaginationbar.setProperty("RowsPerPageCaption", Gridmrec_sdtspaginationbar_Rowsperpagecaption);
         ucGridmrec_sdtspaginationbar.setProperty("CurrentPage", AV18GridMRec_SDTsCurrentPage);
         ucGridmrec_sdtspaginationbar.setProperty("PageCount", AV19GridMRec_SDTsPageCount);
         ucGridmrec_sdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridmrec_sdtspaginationbar_Internalname, sPrefix+"GRIDMREC_SDTSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV64Pgmname), GXutil.rtrim( localUtil.format( AV64Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_AnalisisDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucGridmrec_sdts_empowerer.render(context, "wwp.gridempowerer", Gridmrec_sdts_empowerer_Internalname, sPrefix+"GRIDMREC_SDTS_EMPOWERERContainer");
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
            if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV45GXV1 = nGXsfl_33_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmrec_sdts", Gridmrec_sdtsContainer, subGridmrec_sdts_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_sdtsContainerData", Gridmrec_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridmrec_sdtsContainerData"+"V", Gridmrec_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridmrec_sdtsContainerData"+"V"+"\" value='"+Gridmrec_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2DZ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "MRec_Analisis Detalle", ""), (short)(0)) ;
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
            strup2DZ0( ) ;
         }
      }
   }

   public void ws2DZ2( )
   {
      start2DZ2( ) ;
      evt2DZ2( ) ;
   }

   public void evt2DZ2( )
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
                              strup2DZ0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_SDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DZ0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "GRIDMREC_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DZ0( ) ;
                           }
                           nGXsfl_33_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_332( ) ;
                           AV45GXV1 = (int)(nGXsfl_33_idx+GRIDMREC_SDTS_nFirstRecordOnPage) ;
                           if ( ( AV5Datos.size() >= AV45GXV1 ) && ( AV45GXV1 > 0 ) )
                           {
                              AV5Datos.currentItem( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)) );
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
                                       e132DZ2 ();
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
                                       e142DZ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMREC_SDTS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e152DZ2 ();
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
                                    strup2DZ0( ) ;
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

   public void we2DZ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DZ2( ) ;
         }
      }
   }

   public void pa2DZ2( )
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

   public void gxnrgridmrec_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_332( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         sendrow_332( ) ;
         nGXsfl_33_idx = ((subGridmrec_sdts_Islastpage==1)&&(nGXsfl_33_idx+1>subgridmrec_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmrec_sdtsContainer)) ;
      /* End function gxnrGridmrec_sdts_newrow */
   }

   public void gxgrgridmrec_sdts_refresh( int subGridmrec_sdts_Rows ,
                                          GXBaseCollection<app.ingenieria.SdtMRec_AnalisisDetalleSDT> AV5Datos ,
                                          String AV64Pgmname ,
                                          String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e142DZ2 ();
      GRIDMREC_SDTS_nCurrentRecord = 0 ;
      rf2DZ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AnalisisDetalle");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_analisisdetalle:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridmrec_sdts_refresh */
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
      rf2DZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV64Pgmname = "Ingenieria.MRec_AnalisisDetalle" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
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

   public void rf2DZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridmrec_sdtsContainer.ClearRows();
      }
      wbStart = (short)(33) ;
      /* Execute user event: Refresh */
      e142DZ2 ();
      nGXsfl_33_idx = 1 ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      bGXsfl_33_Refreshing = true ;
      Gridmrec_sdtsContainer.AddObjectProperty("GridName", "Gridmrec_sdts");
      Gridmrec_sdtsContainer.AddObjectProperty("CmpContext", sPrefix);
      Gridmrec_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridmrec_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridmrec_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_sdtsContainer.setPageSize( subgridmrec_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_332( ) ;
         e152DZ2 ();
         if ( ( GRIDMREC_SDTS_nCurrentRecord > 0 ) && ( GRIDMREC_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_33_idx == 1 ) )
         {
            GRIDMREC_SDTS_nCurrentRecord = 0 ;
            GRIDMREC_SDTS_nGridOutOfScope = 1 ;
            subgridmrec_sdts_firstpage( ) ;
            e152DZ2 ();
         }
         wbEnd = (short)(33) ;
         wb2DZ0( ) ;
      }
      bGXsfl_33_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DZ2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDATOS", AV5Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDATOS", AV5Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDATOS", getSecureSignedToken( sPrefix, AV5Datos));
   }

   public int subgridmrec_sdts_fnc_pagecount( )
   {
      GRIDMREC_SDTS_nRecordCount = subgridmrec_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDMREC_SDTS_nRecordCount) % (subgridmrec_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDMREC_SDTS_nRecordCount/ (double) (subgridmrec_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDMREC_SDTS_nRecordCount/ (double) (subgridmrec_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridmrec_sdts_fnc_recordcount( )
   {
      return AV5Datos.size() ;
   }

   public int subgridmrec_sdts_fnc_recordsperpage( )
   {
      if ( subGridmrec_sdts_Rows > 0 )
      {
         return subGridmrec_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridmrec_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDMREC_SDTS_nFirstRecordOnPage/ (double) (subgridmrec_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridmrec_sdts_firstpage( )
   {
      GRIDMREC_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_sdts_refresh( subGridmrec_sdts_Rows, AV5Datos, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_sdts_nextpage( )
   {
      GRIDMREC_SDTS_nRecordCount = subgridmrec_sdts_fnc_recordcount( ) ;
      if ( ( GRIDMREC_SDTS_nRecordCount >= subgridmrec_sdts_fnc_recordsperpage( ) ) && ( GRIDMREC_SDTS_nEOF == 0 ) )
      {
         GRIDMREC_SDTS_nFirstRecordOnPage = (long)(GRIDMREC_SDTS_nFirstRecordOnPage+subgridmrec_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridmrec_sdtsContainer.AddObjectProperty("GRIDMREC_SDTS_nFirstRecordOnPage", GRIDMREC_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_sdts_refresh( subGridmrec_sdts_Rows, AV5Datos, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDMREC_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridmrec_sdts_previouspage( )
   {
      if ( GRIDMREC_SDTS_nFirstRecordOnPage >= subgridmrec_sdts_fnc_recordsperpage( ) )
      {
         GRIDMREC_SDTS_nFirstRecordOnPage = (long)(GRIDMREC_SDTS_nFirstRecordOnPage-subgridmrec_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_sdts_refresh( subGridmrec_sdts_Rows, AV5Datos, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_sdts_lastpage( )
   {
      GRIDMREC_SDTS_nRecordCount = subgridmrec_sdts_fnc_recordcount( ) ;
      if ( GRIDMREC_SDTS_nRecordCount > subgridmrec_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDMREC_SDTS_nRecordCount) % (subgridmrec_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDMREC_SDTS_nFirstRecordOnPage = (long)(GRIDMREC_SDTS_nRecordCount-subgridmrec_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDMREC_SDTS_nFirstRecordOnPage = (long)(GRIDMREC_SDTS_nRecordCount-((int)((GRIDMREC_SDTS_nRecordCount) % (subgridmrec_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDMREC_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_sdts_refresh( subGridmrec_sdts_Rows, AV5Datos, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridmrec_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDMREC_SDTS_nFirstRecordOnPage = (long)(subgridmrec_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDMREC_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_sdts_refresh( subGridmrec_sdts_Rows, AV5Datos, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV64Pgmname = "Ingenieria.MRec_AnalisisDetalle" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
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

   public void strup2DZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132DZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Datos"), AV5Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV6Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV7Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV8ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV9ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV10DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV11FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV12ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV13ItemCollapseData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDATOS"), AV5Datos);
         /* Read saved values. */
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18GridMRec_SDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_SDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV19GridMRec_SDTsPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_SDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV20EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV20EmprCod") ;
         wcpOAV21ContCod = httpContext.cgiGet( sPrefix+"wcpOAV21ContCod") ;
         wcpOAV39Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39Segundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24MaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV24MaqCodJSON") ;
         wcpOAV25FasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV25FasCodJSON") ;
         wcpOAV26HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV26HdrJSON") ;
         wcpOAV27ParFasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV27ParFasCodJSON") ;
         wcpOAV28FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV28FueraRango")) ;
         wcpOAV29Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV29Desde"), 0) ;
         wcpOAV30Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30Hasta"), 0) ;
         wcpOAV22UsurCod = httpContext.cgiGet( sPrefix+"wcpOAV22UsurCod") ;
         wcpOAV31Ip = httpContext.cgiGet( sPrefix+"wcpOAV31Ip") ;
         wcpOAV32Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV32Now"), 0) ;
         wcpOAV23MTkn = httpContext.cgiGet( sPrefix+"wcpOAV23MTkn") ;
         GRIDMREC_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDMREC_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridmrec_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Gridmrec_sdtspaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Class") ;
         Gridmrec_sdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Showfirst")) ;
         Gridmrec_sdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Showprevious")) ;
         Gridmrec_sdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Shownext")) ;
         Gridmrec_sdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Showlast")) ;
         Gridmrec_sdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_sdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridmrec_sdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridmrec_sdtspaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Emptygridclass") ;
         Gridmrec_sdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_sdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridmrec_sdtspaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Previous") ;
         Gridmrec_sdtspaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Next") ;
         Gridmrec_sdtspaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Caption") ;
         Gridmrec_sdtspaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridmrec_sdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpagecaption") ;
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
         Gridmrec_sdts_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTS_EMPOWERER_Gridinternalname") ;
         Gridmrec_sdtspaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Selectedpage") ;
         Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_33_fel_idx = 0 ;
         while ( nGXsfl_33_fel_idx < nRC_GXsfl_33 )
         {
            nGXsfl_33_fel_idx = ((subGridmrec_sdts_Islastpage==1)&&(nGXsfl_33_fel_idx+1>subgridmrec_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_33_fel_idx+1) ;
            sGXsfl_33_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_332( ) ;
            AV45GXV1 = (int)(nGXsfl_33_fel_idx+GRIDMREC_SDTS_nFirstRecordOnPage) ;
            if ( ( AV5Datos.size() >= AV45GXV1 ) && ( AV45GXV1 > 0 ) )
            {
               AV5Datos.currentItem( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)) );
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
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AnalisisDetalle");
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_analisisdetalle:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e132DZ2 ();
      if (returnInSub) return;
   }

   public void e132DZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV33MaqCod.fromJSonString(AV24MaqCodJSON, null);
      AV34FasCod.fromJSonString(AV25FasCodJSON, null);
      AV35Hdr.fromJSonString(AV26HdrJSON, null);
      AV36ParFasCod.fromJSonString(AV27ParFasCodJSON, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Inicia Analisis Detalle:EmprCod:%1, ContCod:%2, Intervalo:%3, Maquinas:%4, Fases;%5, &HDR:%6, Parametro:%7, Error:%8, %9.", ""), AV20EmprCod, AV21ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Segundos), 6, 0), AV33MaqCod.toJSonString(false), AV34FasCod.toJSonString(false), AV35Hdr.toJSonString(false), AV36ParFasCod.toJSonString(false), GXutil.booltostr( AV28FueraRango), GXutil.format( httpContext.getMessage( "Fechas:%1-%2, Usuario:%3, Ip:%4, Now:%5, Token:%6.", ""), localUtil.ttoc( AV29Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV30Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV22UsurCod, AV31Ip, localUtil.ttoc( AV32Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV23MTkn, "", "", "")), AV64Pgmname) ;
      lblTitulo_Caption = GXutil.format( httpContext.getMessage( "%8Intervalo:%1 hasta %2, Maquinas:%3, Fases:%4, Hdrs:%5, Parametro:%6, Error:%7.", ""), localUtil.ttoc( AV29Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV30Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV24MaqCodJSON, AV25FasCodJSON, AV26HdrJSON, AV27ParFasCodJSON, GXutil.booltostr( AV28FueraRango), httpContext.getMessage( "<i class='fa fa-search' style='color:red; '></i>", ""), "") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTitulo_Internalname, "Caption", lblTitulo_Caption, true);
      if ( 1 == 0 )
      {
         GXt_char1 = AV37Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         mrec_analisisdetalle_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Station = GXt_char1 ;
         GXv_char2[0] = AV20EmprCod ;
         GXv_char3[0] = AV38EmprNom ;
         GXv_char4[0] = AV22UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
         mrec_analisisdetalle_impl.this.AV20EmprCod = GXv_char2[0] ;
         mrec_analisisdetalle_impl.this.AV38EmprNom = GXv_char3[0] ;
         mrec_analisisdetalle_impl.this.AV22UsurCod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20EmprCod", AV20EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22UsurCod", AV22UsurCod);
         Gridmrec_sdts_empowerer_Gridinternalname = subGridmrec_sdts_Internalname ;
         ucGridmrec_sdts_empowerer.sendProperty(context, sPrefix, false, Gridmrec_sdts_empowerer_Internalname, "GridInternalName", Gridmrec_sdts_empowerer_Gridinternalname);
         subGridmrec_sdts_Rows = 10 ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_sdts_Rows ;
         ucGridmrec_sdtspaginationbar.sendProperty(context, sPrefix, false, Gridmrec_sdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      }
      subGridmrec_sdts_Rows = 7 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridmrec_sdts_empowerer_Gridinternalname = subGridmrec_sdts_Internalname ;
      ucGridmrec_sdts_empowerer.sendProperty(context, sPrefix, false, Gridmrec_sdts_empowerer_Internalname, "GridInternalName", Gridmrec_sdts_empowerer_Gridinternalname);
      Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_sdts_Rows ;
      ucGridmrec_sdtspaginationbar.sendProperty(context, sPrefix, false, Gridmrec_sdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S112 ();
      if (returnInSub) return;
      GXt_objcol_SdtMRec_AnalisisDetalleSDT5 = AV5Datos ;
      GXv_objcol_SdtMRec_AnalisisDetalleSDT6[0] = GXt_objcol_SdtMRec_AnalisisDetalleSDT5 ;
      new app.ingenieria.mrec_analisisdetalledp(remoteHandle, context).execute( AV20EmprCod, AV29Desde, AV30Hasta, AV33MaqCod, AV34FasCod, AV35Hdr, AV36ParFasCod, AV28FueraRango, AV22UsurCod, AV31Ip, AV32Now, AV23MTkn, (byte)(2), GXv_objcol_SdtMRec_AnalisisDetalleSDT6) ;
      GXt_objcol_SdtMRec_AnalisisDetalleSDT5 = GXv_objcol_SdtMRec_AnalisisDetalleSDT6[0] ;
      AV5Datos = GXt_objcol_SdtMRec_AnalisisDetalleSDT5 ;
      gx_BV33 = true ;
   }

   public void e142DZ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV18GridMRec_SDTsCurrentPage = subgridmrec_sdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18GridMRec_SDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridMRec_SDTsCurrentPage), 10, 0));
      AV19GridMRec_SDTsPageCount = subgridmrec_sdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridMRec_SDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridMRec_SDTsPageCount), 10, 0));
      edtavDatos__mprecfec_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Columnheaderclass", edtavDatos__mprecfec_Columnheaderclass, !bGXsfl_33_Refreshing);
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

   private void e152DZ2( )
   {
      /* Gridmrec_sdts_Load Routine */
      returnInSub = false ;
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV5Datos.size() )
      {
         AV5Datos.currentItem( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)) );
         edtavDatos__mprecfec_Columnclass = ((((app.ingenieria.SdtMRec_AnalisisDetalleSDT)(AV5Datos.currentItem())).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()) ? "WWColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWColumn") ;
         edtavDatos__parfascod_Columnclass = ((((app.ingenieria.SdtMRec_AnalisisDetalleSDT)(AV5Datos.currentItem())).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__parfasdsc_Columnclass = ((((app.ingenieria.SdtMRec_AnalisisDetalleSDT)(AV5Datos.currentItem())).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmn_Columnclass = ((((app.ingenieria.SdtMRec_AnalisisDetalleSDT)(AV5Datos.currentItem())).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecval_Columnclass = ((((app.ingenieria.SdtMRec_AnalisisDetalleSDT)(AV5Datos.currentItem())).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmx_Columnclass = ((((app.ingenieria.SdtMRec_AnalisisDetalleSDT)(AV5Datos.currentItem())).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         chkavDatos__mprecer.setColumnClass( ((((app.ingenieria.SdtMRec_AnalisisDetalleSDT)(AV5Datos.currentItem())).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(33) ;
         }
         if ( ( subGridmrec_sdts_Islastpage == 1 ) || ( subGridmrec_sdts_Rows == 0 ) || ( ( GRIDMREC_SDTS_nCurrentRecord >= GRIDMREC_SDTS_nFirstRecordOnPage ) && ( GRIDMREC_SDTS_nCurrentRecord < GRIDMREC_SDTS_nFirstRecordOnPage + subgridmrec_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_332( ) ;
            GRIDMREC_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDMREC_SDTS_nCurrentRecord + 1 >= subgridmrec_sdts_fnc_recordcount( ) )
            {
               GRIDMREC_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDMREC_SDTS_nCurrentRecord = (long)(GRIDMREC_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_33_Refreshing )
         {
            httpContext.doAjaxLoad(33, Gridmrec_sdtsRow);
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e112DZ2( )
   {
      /* Gridmrec_sdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridmrec_sdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridmrec_sdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridmrec_sdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV17PageToGo = subgridmrec_sdts_fnc_currentpage( ) ;
         AV17PageToGo = (int)(AV17PageToGo+1) ;
         subgridmrec_sdts_gotopage( AV17PageToGo) ;
      }
      else
      {
         AV17PageToGo = (int)(GXutil.lval( Gridmrec_sdtspaginationbar_Selectedpage)) ;
         subgridmrec_sdts_gotopage( AV17PageToGo) ;
      }
   }

   public void e122DZ2( )
   {
      /* Gridmrec_sdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridmrec_sdts_Rows = Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridmrec_sdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      AV6Elements.clear();
      AV15Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Name( "GraficaFecha" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Registro", "") );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV15Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV15Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Picture( httpContext.getMessage( "YYYY-MM-DD HH24:MI", "") );
      AV6Elements.add(AV15Element, 0);
      GXt_boolean7 = AV65Existeregistro ;
      GXv_char4[0] = AV40MRParPrPLC ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new app.ingenieria.mrparprodscget(remoteHandle, context).execute( AV20EmprCod, AV33MaqCod, AV34FasCod, AV35Hdr, AV36ParFasCod, AV22UsurCod, AV31Ip, AV32Now, AV23MTkn, GXv_char4, GXv_boolean8) ;
      mrec_analisisdetalle_impl.this.AV40MRParPrPLC = GXv_char4[0] ;
      mrec_analisisdetalle_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      AV65Existeregistro = GXt_boolean7 ;
      AV15Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Name( "MPRecPLC_1" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Title( (AV65Existeregistro ? AV40MRParPrPLC : httpContext.getMessage( "Parametro", "")) );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV15Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV6Elements.add(AV15Element, 0);
      AV15Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Name( "MPRecPLC_2" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Maximo", "") );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV15Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV6Elements.add(AV15Element, 0);
      AV15Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Name( "MPRecPLC_3" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Minimo", "") );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV15Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV15Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV6Elements.add(AV15Element, 0);
      Qvgrafica_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "Ingenieria\\MRec_AnalisisDetalleGraficaDP")+"\", \""+GXutil.encodeJSON( AV20EmprCod)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV29Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV30Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV33MaqCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV34FasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV35Hdr.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV36ParFasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( GXutil.booltostr( AV28FueraRango))+"\", \""+GXutil.encodeJSON( AV22UsurCod)+"\", \""+GXutil.encodeJSON( AV31Ip)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV32Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV23MTkn)+"\" ]" ;
      ucQvgrafica.sendProperty(context, sPrefix, false, Qvgrafica_Internalname, "Object", Qvgrafica_Objectcall);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV20EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20EmprCod", AV20EmprCod);
      AV21ContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ContCod", AV21ContCod);
      AV39Segundos = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Segundos), 6, 0));
      AV24MaqCodJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCodJSON", AV24MaqCodJSON);
      AV25FasCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FasCodJSON", AV25FasCodJSON);
      AV26HdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HdrJSON", AV26HdrJSON);
      AV27ParFasCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ParFasCodJSON", AV27ParFasCodJSON);
      AV28FueraRango = ((Boolean) getParm(obj,7,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28FueraRango", AV28FueraRango);
      AV29Desde = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Desde", localUtil.ttoc( AV29Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV30Hasta = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Hasta", localUtil.ttoc( AV30Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV22UsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22UsurCod", AV22UsurCod);
      AV31Ip = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Ip", AV31Ip);
      AV32Now = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Now", localUtil.ttoc( AV32Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV23MTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MTkn", AV23MTkn);
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
      pa2DZ2( ) ;
      ws2DZ2( ) ;
      we2DZ2( ) ;
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
      sCtrlAV20EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV21ContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV39Segundos = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV24MaqCodJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV25FasCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV26HdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV27ParFasCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV28FueraRango = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV29Desde = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV30Hasta = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV22UsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV31Ip = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV32Now = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV23MTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DZ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\mrec_analisisdetalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DZ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV20EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20EmprCod", AV20EmprCod);
         AV21ContCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ContCod", AV21ContCod);
         AV39Segundos = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Segundos), 6, 0));
         AV24MaqCodJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCodJSON", AV24MaqCodJSON);
         AV25FasCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FasCodJSON", AV25FasCodJSON);
         AV26HdrJSON = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HdrJSON", AV26HdrJSON);
         AV27ParFasCodJSON = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ParFasCodJSON", AV27ParFasCodJSON);
         AV28FueraRango = ((Boolean) getParm(obj,9,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28FueraRango", AV28FueraRango);
         AV29Desde = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Desde", localUtil.ttoc( AV29Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV30Hasta = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Hasta", localUtil.ttoc( AV30Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV22UsurCod = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22UsurCod", AV22UsurCod);
         AV31Ip = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Ip", AV31Ip);
         AV32Now = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Now", localUtil.ttoc( AV32Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV23MTkn = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MTkn", AV23MTkn);
      }
      wcpOAV20EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV20EmprCod") ;
      wcpOAV21ContCod = httpContext.cgiGet( sPrefix+"wcpOAV21ContCod") ;
      wcpOAV39Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39Segundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24MaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV24MaqCodJSON") ;
      wcpOAV25FasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV25FasCodJSON") ;
      wcpOAV26HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV26HdrJSON") ;
      wcpOAV27ParFasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV27ParFasCodJSON") ;
      wcpOAV28FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV28FueraRango")) ;
      wcpOAV29Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV29Desde"), 0) ;
      wcpOAV30Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30Hasta"), 0) ;
      wcpOAV22UsurCod = httpContext.cgiGet( sPrefix+"wcpOAV22UsurCod") ;
      wcpOAV31Ip = httpContext.cgiGet( sPrefix+"wcpOAV31Ip") ;
      wcpOAV32Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV32Now"), 0) ;
      wcpOAV23MTkn = httpContext.cgiGet( sPrefix+"wcpOAV23MTkn") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV20EmprCod, wcpOAV20EmprCod) != 0 ) || ( GXutil.strcmp(AV21ContCod, wcpOAV21ContCod) != 0 ) || ( AV39Segundos != wcpOAV39Segundos ) || ( GXutil.strcmp(AV24MaqCodJSON, wcpOAV24MaqCodJSON) != 0 ) || ( GXutil.strcmp(AV25FasCodJSON, wcpOAV25FasCodJSON) != 0 ) || ( GXutil.strcmp(AV26HdrJSON, wcpOAV26HdrJSON) != 0 ) || ( GXutil.strcmp(AV27ParFasCodJSON, wcpOAV27ParFasCodJSON) != 0 ) || ( AV28FueraRango != wcpOAV28FueraRango ) || !( GXutil.dateCompare(AV29Desde, wcpOAV29Desde) ) || !( GXutil.dateCompare(AV30Hasta, wcpOAV30Hasta) ) || ( GXutil.strcmp(AV22UsurCod, wcpOAV22UsurCod) != 0 ) || ( GXutil.strcmp(AV31Ip, wcpOAV31Ip) != 0 ) || !( GXutil.dateCompare(AV32Now, wcpOAV32Now) ) || ( GXutil.strcmp(AV23MTkn, wcpOAV23MTkn) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV20EmprCod = AV20EmprCod ;
      wcpOAV21ContCod = AV21ContCod ;
      wcpOAV39Segundos = AV39Segundos ;
      wcpOAV24MaqCodJSON = AV24MaqCodJSON ;
      wcpOAV25FasCodJSON = AV25FasCodJSON ;
      wcpOAV26HdrJSON = AV26HdrJSON ;
      wcpOAV27ParFasCodJSON = AV27ParFasCodJSON ;
      wcpOAV28FueraRango = AV28FueraRango ;
      wcpOAV29Desde = AV29Desde ;
      wcpOAV30Hasta = AV30Hasta ;
      wcpOAV22UsurCod = AV22UsurCod ;
      wcpOAV31Ip = AV31Ip ;
      wcpOAV32Now = AV32Now ;
      wcpOAV23MTkn = AV23MTkn ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV20EmprCod = httpContext.cgiGet( sPrefix+"AV20EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV20EmprCod) > 0 )
      {
         AV20EmprCod = httpContext.cgiGet( sCtrlAV20EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20EmprCod", AV20EmprCod);
      }
      else
      {
         AV20EmprCod = httpContext.cgiGet( sPrefix+"AV20EmprCod_PARM") ;
      }
      sCtrlAV21ContCod = httpContext.cgiGet( sPrefix+"AV21ContCod_CTRL") ;
      if ( GXutil.len( sCtrlAV21ContCod) > 0 )
      {
         AV21ContCod = httpContext.cgiGet( sCtrlAV21ContCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ContCod", AV21ContCod);
      }
      else
      {
         AV21ContCod = httpContext.cgiGet( sPrefix+"AV21ContCod_PARM") ;
      }
      sCtrlAV39Segundos = httpContext.cgiGet( sPrefix+"AV39Segundos_CTRL") ;
      if ( GXutil.len( sCtrlAV39Segundos) > 0 )
      {
         AV39Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV39Segundos), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Segundos), 6, 0));
      }
      else
      {
         AV39Segundos = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV39Segundos_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24MaqCodJSON = httpContext.cgiGet( sPrefix+"AV24MaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV24MaqCodJSON) > 0 )
      {
         AV24MaqCodJSON = httpContext.cgiGet( sCtrlAV24MaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCodJSON", AV24MaqCodJSON);
      }
      else
      {
         AV24MaqCodJSON = httpContext.cgiGet( sPrefix+"AV24MaqCodJSON_PARM") ;
      }
      sCtrlAV25FasCodJSON = httpContext.cgiGet( sPrefix+"AV25FasCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV25FasCodJSON) > 0 )
      {
         AV25FasCodJSON = httpContext.cgiGet( sCtrlAV25FasCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FasCodJSON", AV25FasCodJSON);
      }
      else
      {
         AV25FasCodJSON = httpContext.cgiGet( sPrefix+"AV25FasCodJSON_PARM") ;
      }
      sCtrlAV26HdrJSON = httpContext.cgiGet( sPrefix+"AV26HdrJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV26HdrJSON) > 0 )
      {
         AV26HdrJSON = httpContext.cgiGet( sCtrlAV26HdrJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HdrJSON", AV26HdrJSON);
      }
      else
      {
         AV26HdrJSON = httpContext.cgiGet( sPrefix+"AV26HdrJSON_PARM") ;
      }
      sCtrlAV27ParFasCodJSON = httpContext.cgiGet( sPrefix+"AV27ParFasCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV27ParFasCodJSON) > 0 )
      {
         AV27ParFasCodJSON = httpContext.cgiGet( sCtrlAV27ParFasCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ParFasCodJSON", AV27ParFasCodJSON);
      }
      else
      {
         AV27ParFasCodJSON = httpContext.cgiGet( sPrefix+"AV27ParFasCodJSON_PARM") ;
      }
      sCtrlAV28FueraRango = httpContext.cgiGet( sPrefix+"AV28FueraRango_CTRL") ;
      if ( GXutil.len( sCtrlAV28FueraRango) > 0 )
      {
         AV28FueraRango = GXutil.strtobool( httpContext.cgiGet( sCtrlAV28FueraRango)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28FueraRango", AV28FueraRango);
      }
      else
      {
         AV28FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV28FueraRango_PARM")) ;
      }
      sCtrlAV29Desde = httpContext.cgiGet( sPrefix+"AV29Desde_CTRL") ;
      if ( GXutil.len( sCtrlAV29Desde) > 0 )
      {
         AV29Desde = localUtil.ctot( httpContext.cgiGet( sCtrlAV29Desde), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Desde", localUtil.ttoc( AV29Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV29Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV29Desde_PARM"), 0) ;
      }
      sCtrlAV30Hasta = httpContext.cgiGet( sPrefix+"AV30Hasta_CTRL") ;
      if ( GXutil.len( sCtrlAV30Hasta) > 0 )
      {
         AV30Hasta = localUtil.ctot( httpContext.cgiGet( sCtrlAV30Hasta), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Hasta", localUtil.ttoc( AV30Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV30Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV30Hasta_PARM"), 0) ;
      }
      sCtrlAV22UsurCod = httpContext.cgiGet( sPrefix+"AV22UsurCod_CTRL") ;
      if ( GXutil.len( sCtrlAV22UsurCod) > 0 )
      {
         AV22UsurCod = httpContext.cgiGet( sCtrlAV22UsurCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22UsurCod", AV22UsurCod);
      }
      else
      {
         AV22UsurCod = httpContext.cgiGet( sPrefix+"AV22UsurCod_PARM") ;
      }
      sCtrlAV31Ip = httpContext.cgiGet( sPrefix+"AV31Ip_CTRL") ;
      if ( GXutil.len( sCtrlAV31Ip) > 0 )
      {
         AV31Ip = httpContext.cgiGet( sCtrlAV31Ip) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Ip", AV31Ip);
      }
      else
      {
         AV31Ip = httpContext.cgiGet( sPrefix+"AV31Ip_PARM") ;
      }
      sCtrlAV32Now = httpContext.cgiGet( sPrefix+"AV32Now_CTRL") ;
      if ( GXutil.len( sCtrlAV32Now) > 0 )
      {
         AV32Now = localUtil.ctot( httpContext.cgiGet( sCtrlAV32Now), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Now", localUtil.ttoc( AV32Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV32Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV32Now_PARM"), 0) ;
      }
      sCtrlAV23MTkn = httpContext.cgiGet( sPrefix+"AV23MTkn_CTRL") ;
      if ( GXutil.len( sCtrlAV23MTkn) > 0 )
      {
         AV23MTkn = httpContext.cgiGet( sCtrlAV23MTkn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MTkn", AV23MTkn);
      }
      else
      {
         AV23MTkn = httpContext.cgiGet( sPrefix+"AV23MTkn_PARM") ;
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
      pa2DZ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DZ2( ) ;
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
      ws2DZ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20EmprCod_PARM", GXutil.rtrim( AV20EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20EmprCod_CTRL", GXutil.rtrim( sCtrlAV20EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21ContCod_PARM", GXutil.rtrim( AV21ContCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21ContCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21ContCod_CTRL", GXutil.rtrim( sCtrlAV21ContCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Segundos_PARM", GXutil.ltrim( localUtil.ntoc( AV39Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39Segundos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Segundos_CTRL", GXutil.rtrim( sCtrlAV39Segundos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24MaqCodJSON_PARM", AV24MaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24MaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24MaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV24MaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25FasCodJSON_PARM", AV25FasCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25FasCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25FasCodJSON_CTRL", GXutil.rtrim( sCtrlAV25FasCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26HdrJSON_PARM", AV26HdrJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26HdrJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26HdrJSON_CTRL", GXutil.rtrim( sCtrlAV26HdrJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27ParFasCodJSON_PARM", AV27ParFasCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27ParFasCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27ParFasCodJSON_CTRL", GXutil.rtrim( sCtrlAV27ParFasCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28FueraRango_PARM", GXutil.booltostr( AV28FueraRango));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28FueraRango)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28FueraRango_CTRL", GXutil.rtrim( sCtrlAV28FueraRango));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Desde_PARM", localUtil.ttoc( AV29Desde, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Desde)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Desde_CTRL", GXutil.rtrim( sCtrlAV29Desde));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Hasta_PARM", localUtil.ttoc( AV30Hasta, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Hasta)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Hasta_CTRL", GXutil.rtrim( sCtrlAV30Hasta));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22UsurCod_PARM", GXutil.rtrim( AV22UsurCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22UsurCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22UsurCod_CTRL", GXutil.rtrim( sCtrlAV22UsurCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Ip_PARM", AV31Ip);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31Ip)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Ip_CTRL", GXutil.rtrim( sCtrlAV31Ip));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Now_PARM", localUtil.ttoc( AV32Now, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Now)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Now_CTRL", GXutil.rtrim( sCtrlAV32Now));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MTkn_PARM", AV23MTkn);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23MTkn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MTkn_CTRL", GXutil.rtrim( sCtrlAV23MTkn));
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
      we2DZ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671010475134", true, true);
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
         httpContext.AddJavascriptSource("ingenieria/mrec_analisisdetalle.js", "?202671010475134", false, true);
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
      wb2DZ0( ) ;
      if ( ( subGridmrec_sdts_Rows * 1 == 0 ) || ( nGXsfl_33_idx <= subgridmrec_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridmrec_sdtsRow = GXWebRow.GetNew(context,Gridmrec_sdtsContainer) ;
         if ( subGridmrec_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridmrec_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridmrec_sdts_Class, "") != 0 )
            {
               subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridmrec_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridmrec_sdts_Backstyle = (byte)(0) ;
            subGridmrec_sdts_Backcolor = subGridmrec_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridmrec_sdts_Class, "") != 0 )
            {
               subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridmrec_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridmrec_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridmrec_sdts_Class, "") != 0 )
            {
               subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"Odd" ;
            }
            subGridmrec_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridmrec_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridmrec_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_33_idx) % (2))) == 0 )
            {
               subGridmrec_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_sdts_Class, "") != 0 )
               {
                  subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridmrec_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_sdts_Class, "") != 0 )
               {
                  subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_33_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__emprcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Emprcod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Emprcod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__menvord_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Menvord(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__menvord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Menvord()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Menvord()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__menvord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__menvord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mreclin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mreclin(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mreclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mreclin()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mreclin()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mreclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mreclin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecfec_Internalname,localUtil.ttoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec(), 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec(), "99/99/99 99:99:99.999"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecfec_Columnclass,edtavDatos__mprecfec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecplc_Internalname,((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecplc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mprecplc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fascod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Fascod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfascod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Parfascod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__parfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Parfascod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Parfascod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfascod_Columnclass,edtavDatos__parfascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfasdsc_Columnclass,edtavDatos__parfasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmn_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmn_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmn_Columnclass,edtavDatos__mprecvalmn_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecval_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecval(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecval_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecval(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecval(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecval_Columnclass,edtavDatos__mprecval_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmx_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmx_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmx_Columnclass,edtavDatos__mprecvalmx_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
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
         Gridmrec_sdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavDatos__mprecer.getInternalname(),GXutil.booltostr( ((app.ingenieria.SdtMRec_AnalisisDetalleSDT)AV5Datos.elementAt(-1+AV45GXV1)).getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer()),"","",Integer.valueOf(-1),Integer.valueOf(chkavDatos__mprecer.getEnabled()),"true","",StyleString,ClassString,chkavDatos__mprecer.getColumnClass(),chkavDatos__mprecer.getColumnHeaderClass(),""});
         send_integrity_lvl_hashes2DZ2( ) ;
         Gridmrec_sdtsContainer.AddRow(Gridmrec_sdtsRow);
         nGXsfl_33_idx = ((subGridmrec_sdts_Islastpage==1)&&(nGXsfl_33_idx+1>subgridmrec_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      /* End function sendrow_332 */
   }

   public void startgridcontrol33( )
   {
      if ( Gridmrec_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_sdtsContainer"+"DivS\" data-gxgridid=\"33\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmrec_sdts_Internalname, subGridmrec_sdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridmrec_sdts_Backcolorstyle == 0 )
         {
            subGridmrec_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridmrec_sdts_Class) > 0 )
            {
               subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridmrec_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridmrec_sdts_Backcolorstyle == 1 )
            {
               subGridmrec_sdts_Titlebackcolor = subGridmrec_sdts_Allbackcolor ;
               if ( GXutil.len( subGridmrec_sdts_Class) > 0 )
               {
                  subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridmrec_sdts_Class) > 0 )
               {
                  subGridmrec_sdts_Linesclass = subGridmrec_sdts_Class+"Title" ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
         Gridmrec_sdtsContainer.AddObjectProperty("GridName", "Gridmrec_sdts");
      }
      else
      {
         Gridmrec_sdtsContainer.AddObjectProperty("GridName", "Gridmrec_sdts");
         Gridmrec_sdtsContainer.AddObjectProperty("Header", subGridmrec_sdts_Header);
         Gridmrec_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridmrec_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("CmpContext", sPrefix);
         Gridmrec_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__menvord_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mreclin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecfec_Columnclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecfec_Columnheaderclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecplc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfascod_Columnclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfascod_Columnheaderclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnheaderclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnheaderclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmn_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecval_Columnclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecval_Columnheaderclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnheaderclass));
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmx_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_sdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavDatos__mprecer.getColumnClass()));
         Gridmrec_sdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavDatos__mprecer.getColumnHeaderClass()));
         Gridmrec_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavDatos__mprecer.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddColumnProperties(Gridmrec_sdtsColumn);
         Gridmrec_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmrec_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      Gridmrec_sdtspaginationbar_Internalname = sPrefix+"GRIDMREC_SDTSPAGINATIONBAR" ;
      divGridmrec_sdtstablewithpaginationbar_Internalname = sPrefix+"GRIDMREC_SDTSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Gridmrec_sdts_empowerer_Internalname = sPrefix+"GRIDMREC_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridmrec_sdts_Internalname = sPrefix+"GRIDMREC_SDTS" ;
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
      subGridmrec_sdts_Allowcollapsing = (byte)(0) ;
      subGridmrec_sdts_Allowselection = (byte)(0) ;
      subGridmrec_sdts_Header = "" ;
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
      edtavDatos__mprecfec_Columnheaderclass = "" ;
      edtavDatos__mprecfec_Columnclass = "WWColumn" ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__mreclin_Jsonclick = "" ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__menvord_Jsonclick = "" ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__emprcod_Jsonclick = "" ;
      edtavDatos__emprcod_Enabled = 0 ;
      subGridmrec_sdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridmrec_sdts_Backcolorstyle = (byte)(0) ;
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
      Gridmrec_sdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridmrec_sdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridmrec_sdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridmrec_sdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridmrec_sdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridmrec_sdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridmrec_sdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridmrec_sdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridmrec_sdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridmrec_sdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridmrec_sdtspaginationbar_Pagestoshow = 5 ;
      Gridmrec_sdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridmrec_sdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridmrec_sdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridmrec_sdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridmrec_sdtspaginationbar_Class = "PaginationBar" ;
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
      subGridmrec_sdts_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMREC_SDTS_nFirstRecordOnPage'},{av:'GRIDMREC_SDTS_nEOF'},{av:'subGridmrec_sdts_Rows',ctrl:'GRIDMREC_SDTS',prop:'Rows'},{av:'sPrefix'},{av:'AV5Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_SDTS',prop:'GridRC',grid:33},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV18GridMRec_SDTsCurrentPage',fld:'vGRIDMREC_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridMRec_SDTsPageCount',fld:'vGRIDMREC_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'DATOS__MPRECFEC',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECER',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDMREC_SDTS.LOAD","{handler:'e152DZ2',iparms:[{av:'AV5Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'GRIDMREC_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_SDTS',prop:'GridRC',grid:33}]");
      setEventMetadata("GRIDMREC_SDTS.LOAD",",oparms:[{ctrl:'DATOS__MPRECFEC',prop:'Columnclass'},{ctrl:'DATOS__PARFASCOD',prop:'Columnclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnclass'},{ctrl:'DATOS__MPRECER',prop:'Columnclass'}]}");
      setEventMetadata("GRIDMREC_SDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e112DZ2',iparms:[{av:'GRIDMREC_SDTS_nFirstRecordOnPage'},{av:'GRIDMREC_SDTS_nEOF'},{av:'subGridmrec_sdts_Rows',ctrl:'GRIDMREC_SDTS',prop:'Rows'},{av:'AV5Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_SDTS',prop:'GridRC',grid:33},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_sdtspaginationbar_Selectedpage',ctrl:'GRIDMREC_SDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDMREC_SDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDMREC_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122DZ2',iparms:[{av:'GRIDMREC_SDTS_nFirstRecordOnPage'},{av:'GRIDMREC_SDTS_nEOF'},{av:'subGridmrec_sdts_Rows',ctrl:'GRIDMREC_SDTS',prop:'Rows'},{av:'AV5Datos',fld:'vDATOS',grid:33,pic:'',hsh:true},{av:'nGXsfl_33_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:33},{av:'nRC_GXsfl_33',ctrl:'GRIDMREC_SDTS',prop:'GridRC',grid:33},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDMREC_SDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDMREC_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridmrec_sdts_Rows',ctrl:'GRIDMREC_SDTS',prop:'Rows'}]}");
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
      wcpOAV20EmprCod = "" ;
      wcpOAV21ContCod = "" ;
      wcpOAV24MaqCodJSON = "" ;
      wcpOAV25FasCodJSON = "" ;
      wcpOAV26HdrJSON = "" ;
      wcpOAV27ParFasCodJSON = "" ;
      wcpOAV29Desde = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV30Hasta = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV22UsurCod = "" ;
      wcpOAV31Ip = "" ;
      wcpOAV32Now = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV23MTkn = "" ;
      Gridmrec_sdtspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV20EmprCod = "" ;
      AV21ContCod = "" ;
      AV24MaqCodJSON = "" ;
      AV25FasCodJSON = "" ;
      AV26HdrJSON = "" ;
      AV27ParFasCodJSON = "" ;
      AV29Desde = GXutil.resetTime( GXutil.nullDate() );
      AV30Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV22UsurCod = "" ;
      AV31Ip = "" ;
      AV32Now = GXutil.resetTime( GXutil.nullDate() );
      AV23MTkn = "" ;
      AV5Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisDetalleSDT>(app.ingenieria.SdtMRec_AnalisisDetalleSDT.class, "MRec_AnalisisDetalleSDT", "TexplusNET", remoteHandle);
      AV64Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV6Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV7Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV8ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV9ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV10DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV11FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV12ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV13ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      Gridmrec_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelfiltros = new com.genexus.webpanels.GXUserControl();
      lblTitulo_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucQvgrafica = new com.genexus.webpanels.GXUserControl();
      Gridmrec_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridmrec_sdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGridmrec_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV33MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV37Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV38EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXt_objcol_SdtMRec_AnalisisDetalleSDT5 = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisDetalleSDT>(app.ingenieria.SdtMRec_AnalisisDetalleSDT.class, "MRec_AnalisisDetalleSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AnalisisDetalleSDT6 = new GXBaseCollection[1] ;
      Gridmrec_sdtsRow = new com.genexus.webpanels.GXWebRow();
      AV15Element = new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV40MRParPrPLC = "" ;
      GXv_char4 = new String[1] ;
      GXv_boolean8 = new boolean[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV20EmprCod = "" ;
      sCtrlAV21ContCod = "" ;
      sCtrlAV39Segundos = "" ;
      sCtrlAV24MaqCodJSON = "" ;
      sCtrlAV25FasCodJSON = "" ;
      sCtrlAV26HdrJSON = "" ;
      sCtrlAV27ParFasCodJSON = "" ;
      sCtrlAV28FueraRango = "" ;
      sCtrlAV29Desde = "" ;
      sCtrlAV30Hasta = "" ;
      sCtrlAV22UsurCod = "" ;
      sCtrlAV31Ip = "" ;
      sCtrlAV32Now = "" ;
      sCtrlAV23MTkn = "" ;
      subGridmrec_sdts_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      Gridmrec_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      AV64Pgmname = "Ingenieria.MRec_AnalisisDetalle" ;
      /* GeneXus formulas. */
      AV64Pgmname = "Ingenieria.MRec_AnalisisDetalle" ;
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

   private byte GRIDMREC_SDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridmrec_sdts_Backcolorstyle ;
   private byte subGridmrec_sdts_Backstyle ;
   private byte subGridmrec_sdts_Titlebackstyle ;
   private byte subGridmrec_sdts_Allowselection ;
   private byte subGridmrec_sdts_Allowhovering ;
   private byte subGridmrec_sdts_Allowcollapsing ;
   private byte subGridmrec_sdts_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV39Segundos ;
   private int Gridmrec_sdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_33 ;
   private int AV39Segundos ;
   private int subGridmrec_sdts_Rows ;
   private int nGXsfl_33_idx=1 ;
   private int Gridmrec_sdtspaginationbar_Pagestoshow ;
   private int AV45GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridmrec_sdts_Islastpage ;
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
   private int GRIDMREC_SDTS_nGridOutOfScope ;
   private int nGXsfl_33_fel_idx=1 ;
   private int AV17PageToGo ;
   private int idxLst ;
   private int subGridmrec_sdts_Backcolor ;
   private int subGridmrec_sdts_Allbackcolor ;
   private int subGridmrec_sdts_Titlebackcolor ;
   private int subGridmrec_sdts_Selectedindex ;
   private int subGridmrec_sdts_Selectioncolor ;
   private int subGridmrec_sdts_Hoveringcolor ;
   private long GRIDMREC_SDTS_nFirstRecordOnPage ;
   private long AV18GridMRec_SDTsCurrentPage ;
   private long AV19GridMRec_SDTsPageCount ;
   private long GRIDMREC_SDTS_nCurrentRecord ;
   private long GRIDMREC_SDTS_nRecordCount ;
   private String wcpOAV20EmprCod ;
   private String wcpOAV21ContCod ;
   private String wcpOAV22UsurCod ;
   private String Gridmrec_sdtspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV20EmprCod ;
   private String AV21ContCod ;
   private String AV22UsurCod ;
   private String sGXsfl_33_idx="0001" ;
   private String AV64Pgmname ;
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
   private String Gridmrec_sdtspaginationbar_Class ;
   private String Gridmrec_sdtspaginationbar_Pagingbuttonsposition ;
   private String Gridmrec_sdtspaginationbar_Pagingcaptionposition ;
   private String Gridmrec_sdtspaginationbar_Emptygridclass ;
   private String Gridmrec_sdtspaginationbar_Rowsperpageoptions ;
   private String Gridmrec_sdtspaginationbar_Previous ;
   private String Gridmrec_sdtspaginationbar_Next ;
   private String Gridmrec_sdtspaginationbar_Caption ;
   private String Gridmrec_sdtspaginationbar_Emptygridcaption ;
   private String Gridmrec_sdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Gridmrec_sdts_empowerer_Gridinternalname ;
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
   private String divGridmrec_sdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridmrec_sdts_Internalname ;
   private String Gridmrec_sdtspaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridmrec_sdts_empowerer_Internalname ;
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
   private String AV37Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV38EmprNom ;
   private String GXv_char3[] ;
   private String edtavDatos__mprecfec_Columnheaderclass ;
   private String edtavDatos__parfascod_Columnheaderclass ;
   private String edtavDatos__parfasdsc_Columnheaderclass ;
   private String edtavDatos__mprecvalmn_Columnheaderclass ;
   private String edtavDatos__mprecval_Columnheaderclass ;
   private String edtavDatos__mprecvalmx_Columnheaderclass ;
   private String edtavDatos__mprecfec_Columnclass ;
   private String edtavDatos__parfascod_Columnclass ;
   private String edtavDatos__parfasdsc_Columnclass ;
   private String edtavDatos__mprecvalmn_Columnclass ;
   private String edtavDatos__mprecval_Columnclass ;
   private String edtavDatos__mprecvalmx_Columnclass ;
   private String GXv_char4[] ;
   private String sCtrlAV20EmprCod ;
   private String sCtrlAV21ContCod ;
   private String sCtrlAV39Segundos ;
   private String sCtrlAV24MaqCodJSON ;
   private String sCtrlAV25FasCodJSON ;
   private String sCtrlAV26HdrJSON ;
   private String sCtrlAV27ParFasCodJSON ;
   private String sCtrlAV28FueraRango ;
   private String sCtrlAV29Desde ;
   private String sCtrlAV30Hasta ;
   private String sCtrlAV22UsurCod ;
   private String sCtrlAV31Ip ;
   private String sCtrlAV32Now ;
   private String sCtrlAV23MTkn ;
   private String subGridmrec_sdts_Class ;
   private String subGridmrec_sdts_Linesclass ;
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
   private String subGridmrec_sdts_Header ;
   private java.util.Date wcpOAV29Desde ;
   private java.util.Date wcpOAV30Hasta ;
   private java.util.Date wcpOAV32Now ;
   private java.util.Date AV29Desde ;
   private java.util.Date AV30Hasta ;
   private java.util.Date AV32Now ;
   private boolean wcpOAV28FueraRango ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV28FueraRango ;
   private boolean Dvpanel_panelfiltros_Autowidth ;
   private boolean Dvpanel_panelfiltros_Autoheight ;
   private boolean Dvpanel_panelfiltros_Collapsible ;
   private boolean Dvpanel_panelfiltros_Collapsed ;
   private boolean Dvpanel_panelfiltros_Showcollapseicon ;
   private boolean Dvpanel_panelfiltros_Autoscroll ;
   private boolean Gridmrec_sdtspaginationbar_Showfirst ;
   private boolean Gridmrec_sdtspaginationbar_Showprevious ;
   private boolean Gridmrec_sdtspaginationbar_Shownext ;
   private boolean Gridmrec_sdtspaginationbar_Showlast ;
   private boolean Gridmrec_sdtspaginationbar_Rowsperpageselector ;
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
   private boolean AV65Existeregistro ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String wcpOAV24MaqCodJSON ;
   private String wcpOAV25FasCodJSON ;
   private String wcpOAV26HdrJSON ;
   private String wcpOAV27ParFasCodJSON ;
   private String wcpOAV31Ip ;
   private String wcpOAV23MTkn ;
   private String AV24MaqCodJSON ;
   private String AV25FasCodJSON ;
   private String AV26HdrJSON ;
   private String AV27ParFasCodJSON ;
   private String AV31Ip ;
   private String AV23MTkn ;
   private String AV40MRParPrPLC ;
   private GXSimpleCollection<Short> AV36ParFasCod ;
   private com.genexus.webpanels.GXWebGrid Gridmrec_sdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridmrec_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridmrec_sdtsColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfiltros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucQvgrafica ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_sdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_sdts_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavDatos__mprecer ;
   private GXSimpleCollection<String> AV33MaqCod ;
   private GXSimpleCollection<String> AV34FasCod ;
   private GXSimpleCollection<String> AV35Hdr ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisDetalleSDT> AV5Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisDetalleSDT> GXt_objcol_SdtMRec_AnalisisDetalleSDT5 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisDetalleSDT> GXv_objcol_SdtMRec_AnalisisDetalleSDT6[] ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV6Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV7Parameters ;
   private app.SdtQueryViewerElements_Element AV15Element ;
   private app.SdtQueryViewerItemClickData AV8ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV9ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV10DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV11FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV12ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV13ItemCollapseData ;
}

