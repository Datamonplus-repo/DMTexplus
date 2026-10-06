package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_alertamaquinawc_impl extends GXWebComponent
{
   public mrec_alertamaquinawc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_alertamaquinawc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertamaquinawc_impl.class ));
   }

   public mrec_alertamaquinawc_impl( int remoteHandle ,
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
               AV11EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
               AV12ContCod = httpContext.GetPar( "ContCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ContCod", AV12ContCod);
               AV15Segundos = (short)(GXutil.lval( httpContext.GetPar( "Segundos"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Segundos), 4, 0));
               AV20MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodJSON", AV20MaqCodJSON);
               AV21FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FasCodJSON", AV21FasCodJSON);
               AV22HdrJSON = httpContext.GetPar( "HdrJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HdrJSON", AV22HdrJSON);
               AV23ParFasCodJSON = httpContext.GetPar( "ParFasCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ParFasCodJSON", AV23ParFasCodJSON);
               AV16FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FueraRango", AV16FueraRango);
               AV24Desde = localUtil.parseDTimeParm( httpContext.GetPar( "Desde")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Desde", localUtil.ttoc( AV24Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV25Hasta = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Hasta", localUtil.ttoc( AV25Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV26UsurCod = httpContext.GetPar( "UsurCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26UsurCod", AV26UsurCod);
               AV27Ip = httpContext.GetPar( "Ip") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Ip", AV27Ip);
               AV28Now = localUtil.parseDTimeParm( httpContext.GetPar( "Now")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Now", localUtil.ttoc( AV28Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV29MTkn = httpContext.GetPar( "MTkn") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29MTkn", AV29MTkn);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV11EmprCod,AV12ContCod,Short.valueOf(AV15Segundos),AV20MaqCodJSON,AV21FasCodJSON,AV22HdrJSON,AV23ParFasCodJSON,Boolean.valueOf(AV16FueraRango),AV24Desde,AV25Hasta,AV26UsurCod,AV27Ip,AV28Now,AV29MTkn});
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
      gxnrgridmrec_alertasdts_newrow( ) ;
      /* End function gxnrGridmrec_alertasdts_newrow_invoke */
   }

   public void gxgrgridmrec_alertasdts_refresh_invoke( )
   {
      subGridmrec_alertasdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmrec_alertasdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5Datos);
      AV53Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV5Datos, AV53Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmrec_alertasdts_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1WD2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Aletas máquina", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_alertamaquinawc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV12ContCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15Segundos,4,0)),GXutil.URLEncode(GXutil.rtrim(AV20MaqCodJSON)),GXutil.URLEncode(GXutil.rtrim(AV21FasCodJSON)),GXutil.URLEncode(GXutil.rtrim(AV22HdrJSON)),GXutil.URLEncode(GXutil.rtrim(AV23ParFasCodJSON)),GXutil.URLEncode(GXutil.booltostr(AV16FueraRango)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV24Desde)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV25Hasta)),GXutil.URLEncode(GXutil.rtrim(AV26UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV27Ip)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV28Now)),GXutil.URLEncode(GXutil.rtrim(AV29MTkn))}, new String[] {"EmprCod","ContCod","Segundos","MaqCodJSON","FasCodJSON","HdrJSON","ParFasCodJSON","FueraRango","Desde","Hasta","UsurCod","Ip","Now","MTkn"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaMaquinaWC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertamaquinawc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_18", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_18, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_ALERTASDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV8GridMRec_AlertaSDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDMREC_ALERTASDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV9GridMRec_AlertaSDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11EmprCod", GXutil.rtrim( wcpOAV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12ContCod", GXutil.rtrim( wcpOAV12ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15Segundos", GXutil.ltrim( localUtil.ntoc( wcpOAV15Segundos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20MaqCodJSON", wcpOAV20MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21FasCodJSON", wcpOAV21FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22HdrJSON", wcpOAV22HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23ParFasCodJSON", wcpOAV23ParFasCodJSON);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV16FueraRango", wcpOAV16FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24Desde", localUtil.ttoc( wcpOAV24Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Hasta", localUtil.ttoc( wcpOAV25Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26UsurCod", GXutil.rtrim( wcpOAV26UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27Ip", wcpOAV27Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Now", localUtil.ttoc( wcpOAV28Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29MTkn", wcpOAV29MTkn);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDATOS", AV5Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDATOS", AV5Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDATOS", getSecureSignedToken( sPrefix, AV5Datos));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTCOD", GXutil.rtrim( AV12ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSEGUNDOS", GXutil.ltrim( localUtil.ntoc( AV15Segundos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODJSON", AV20MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODJSON", AV21FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHDRJSON", AV22HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARFASCODJSON", AV23ParFasCodJSON);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vFUERARANGO", AV16FueraRango);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDESDE", localUtil.ttoc( AV24Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASTA", localUtil.ttoc( AV25Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV26UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIP", AV27Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOW", localUtil.ttoc( AV28Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV29MTkn);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridmrec_alertasdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1WD2( )
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
      return "Ingenieria.MRec_AlertaMaquinaWC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Aletas máquina", "") ;
   }

   public void wb1WD0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.mrec_alertamaquinawc");
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
         app.GxWebStd.gx_div_start( httpContext, divGridmrec_alertasdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridmrec_alertasdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol18( ) ;
      }
      if ( wbEnd == 18 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_18 = (int)(nGXsfl_18_idx-1) ;
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV34GXV1 = nGXsfl_18_idx ;
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
         ucGridmrec_alertasdtspaginationbar.setProperty("CurrentPage", AV8GridMRec_AlertaSDTsCurrentPage);
         ucGridmrec_alertasdtspaginationbar.setProperty("PageCount", AV9GridMRec_AlertaSDTsPageCount);
         ucGridmrec_alertasdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridmrec_alertasdtspaginationbar_Internalname, sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV53Pgmname), GXutil.rtrim( localUtil.format( AV53Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_AlertaMaquinaWC.htm");
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
         ucGridmrec_alertasdts_empowerer.render(context, "wwp.gridempowerer", Gridmrec_alertasdts_empowerer_Internalname, sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERERContainer");
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
            if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV34GXV1 = nGXsfl_18_idx ;
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

   public void start1WD2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Aletas máquina", ""), (short)(0)) ;
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
            strup1WD0( ) ;
         }
      }
   }

   public void ws1WD2( )
   {
      start1WD2( ) ;
      evt1WD2( ) ;
   }

   public void evt1WD2( )
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
                              strup1WD0( ) ;
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
                              strup1WD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111WD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1WD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121WD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1WD0( ) ;
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
                              strup1WD0( ) ;
                           }
                           nGXsfl_18_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_182( ) ;
                           AV34GXV1 = (int)(nGXsfl_18_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
                           if ( ( AV5Datos.size() >= AV34GXV1 ) && ( AV34GXV1 > 0 ) )
                           {
                              AV5Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)) );
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
                                       e131WD2 ();
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
                                       e141WD2 ();
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
                                       e151WD2 ();
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
                                    strup1WD0( ) ;
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

   public void we1WD2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1WD2( ) ;
         }
      }
   }

   public void pa1WD2( )
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
      subsflControlProps_182( ) ;
      while ( nGXsfl_18_idx <= nRC_GXsfl_18 )
      {
         sendrow_182( ) ;
         nGXsfl_18_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_18_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmrec_alertasdtsContainer)) ;
      /* End function gxnrGridmrec_alertasdts_newrow */
   }

   public void gxgrgridmrec_alertasdts_refresh( int subGridmrec_alertasdts_Rows ,
                                                GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV5Datos ,
                                                String AV53Pgmname ,
                                                String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e141WD2 ();
      GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
      rf1WD2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaMaquinaWC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertamaquinawc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1WD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV53Pgmname = "Ingenieria.MRec_AlertaMaquinaWC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_18_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridmrec_alertasdtsContainer.ClearRows();
      }
      wbStart = (short)(18) ;
      /* Execute user event: Refresh */
      e141WD2 ();
      nGXsfl_18_idx = 1 ;
      sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_182( ) ;
      bGXsfl_18_Refreshing = true ;
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
         subsflControlProps_182( ) ;
         e151WD2 ();
         if ( ( GRIDMREC_ALERTASDTS_nCurrentRecord > 0 ) && ( GRIDMREC_ALERTASDTS_nGridOutOfScope == 0 ) && ( nGXsfl_18_idx == 1 ) )
         {
            GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
            GRIDMREC_ALERTASDTS_nGridOutOfScope = 1 ;
            subgridmrec_alertasdts_firstpage( ) ;
            e151WD2 ();
         }
         wbEnd = (short)(18) ;
         wb1WD0( ) ;
      }
      bGXsfl_18_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WD2( )
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
      return AV5Datos.size() ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV5Datos, AV53Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV5Datos, AV53Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV5Datos, AV53Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV5Datos, AV53Pgmname, sPrefix) ;
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
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV5Datos, AV53Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV53Pgmname = "Ingenieria.MRec_AlertaMaquinaWC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_18_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131WD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Datos"), AV5Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDATOS"), AV5Datos);
         /* Read saved values. */
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV8GridMRec_AlertaSDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_ALERTASDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV9GridMRec_AlertaSDTsPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDMREC_ALERTASDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
         wcpOAV12ContCod = httpContext.cgiGet( sPrefix+"wcpOAV12ContCod") ;
         wcpOAV15Segundos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15Segundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV20MaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodJSON") ;
         wcpOAV21FasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV21FasCodJSON") ;
         wcpOAV22HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV22HdrJSON") ;
         wcpOAV23ParFasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV23ParFasCodJSON") ;
         wcpOAV16FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV16FueraRango")) ;
         wcpOAV24Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV24Desde"), 0) ;
         wcpOAV25Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV25Hasta"), 0) ;
         wcpOAV26UsurCod = httpContext.cgiGet( sPrefix+"wcpOAV26UsurCod") ;
         wcpOAV27Ip = httpContext.cgiGet( sPrefix+"wcpOAV27Ip") ;
         wcpOAV28Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV28Now"), 0) ;
         wcpOAV29MTkn = httpContext.cgiGet( sPrefix+"wcpOAV29MTkn") ;
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
         Gridmrec_alertasdts_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname") ;
         Gridmrec_alertasdtspaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_18_fel_idx = 0 ;
         while ( nGXsfl_18_fel_idx < nRC_GXsfl_18 )
         {
            nGXsfl_18_fel_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_18_fel_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_18_fel_idx+1) ;
            sGXsfl_18_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_182( ) ;
            AV34GXV1 = (int)(nGXsfl_18_fel_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
            if ( ( AV5Datos.size() >= AV34GXV1 ) && ( AV34GXV1 > 0 ) )
            {
               AV5Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)) );
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
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Pgmname", AV53Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AlertaMaquinaWC");
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Pgmname", AV53Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_alertamaquinawc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131WD2 ();
      if (returnInSub) return;
   }

   public void e131WD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV13MaqCod.fromJSonString(AV20MaqCodJSON, null);
      AV10FasCod.fromJSonString(AV21FasCodJSON, null);
      AV17Hdr.fromJSonString(AV22HdrJSON, null);
      AV14ParFasCod.fromJSonString(AV23ParFasCodJSON, null);
      GXt_char1 = AV30Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mrec_alertamaquinawc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Station = GXt_char1 ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char4[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      mrec_alertamaquinawc_impl.this.AV11EmprCod = GXv_char2[0] ;
      mrec_alertamaquinawc_impl.this.AV31EmprNom = GXv_char3[0] ;
      mrec_alertamaquinawc_impl.this.AV26UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26UsurCod", AV26UsurCod);
      Gridmrec_alertasdts_empowerer_Gridinternalname = subGridmrec_alertasdts_Internalname ;
      ucGridmrec_alertasdts_empowerer.sendProperty(context, sPrefix, false, Gridmrec_alertasdts_empowerer_Internalname, "GridInternalName", Gridmrec_alertasdts_empowerer_Gridinternalname);
      subGridmrec_alertasdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_alertasdts_Rows ;
      ucGridmrec_alertasdtspaginationbar.sendProperty(context, sPrefix, false, Gridmrec_alertasdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S112 ();
      if (returnInSub) return;
   }

   public void e141WD2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV8GridMRec_AlertaSDTsCurrentPage = subgridmrec_alertasdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8GridMRec_AlertaSDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridMRec_AlertaSDTsCurrentPage), 10, 0));
      AV9GridMRec_AlertaSDTsPageCount = subgridmrec_alertasdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9GridMRec_AlertaSDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9GridMRec_AlertaSDTsPageCount), 10, 0));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "pasa evento refresh %1.", ""), AV5Datos.toJSonString(false), "", "", "", "", "", "", "", ""), AV53Pgmname) ;
      /*  Sending Event outputs  */
   }

   private void e151WD2( )
   {
      /* Gridmrec_alertasdts_Load Routine */
      returnInSub = false ;
      AV34GXV1 = 1 ;
      while ( AV34GXV1 <= AV5Datos.size() )
      {
         AV5Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(18) ;
         }
         if ( ( subGridmrec_alertasdts_Islastpage == 1 ) || ( subGridmrec_alertasdts_Rows == 0 ) || ( ( GRIDMREC_ALERTASDTS_nCurrentRecord >= GRIDMREC_ALERTASDTS_nFirstRecordOnPage ) && ( GRIDMREC_ALERTASDTS_nCurrentRecord < GRIDMREC_ALERTASDTS_nFirstRecordOnPage + subgridmrec_alertasdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_182( ) ;
            GRIDMREC_ALERTASDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDMREC_ALERTASDTS_nCurrentRecord + 1 >= subgridmrec_alertasdts_fnc_recordcount( ) )
            {
               GRIDMREC_ALERTASDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDMREC_ALERTASDTS_nCurrentRecord = (long)(GRIDMREC_ALERTASDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_18_Refreshing )
         {
            httpContext.doAjaxLoad(18, Gridmrec_alertasdtsRow);
         }
         AV34GXV1 = (int)(AV34GXV1+1) ;
      }
   }

   public void e111WD2( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridmrec_alertasdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV7PageToGo = subgridmrec_alertasdts_fnc_currentpage( ) ;
         AV7PageToGo = (int)(AV7PageToGo+1) ;
         subgridmrec_alertasdts_gotopage( AV7PageToGo) ;
      }
      else
      {
         AV7PageToGo = (int)(GXutil.lval( Gridmrec_alertasdtspaginationbar_Selectedpage)) ;
         subgridmrec_alertasdts_gotopage( AV7PageToGo) ;
      }
   }

   public void e121WD2( )
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
      GXt_objcol_SdtMRec_AlertaSDT_Item5 = AV5Datos ;
      GXv_objcol_SdtMRec_AlertaSDT_Item6[0] = GXt_objcol_SdtMRec_AlertaSDT_Item5 ;
      new app.ingenieria.mrec_alertapr(remoteHandle, context).execute( AV11EmprCod, AV12ContCod, AV15Segundos, AV13MaqCod, AV10FasCod, AV17Hdr, AV14ParFasCod, AV16FueraRango, AV24Desde, AV25Hasta, AV26UsurCod, AV27Ip, AV28Now, AV29MTkn, GXv_objcol_SdtMRec_AlertaSDT_Item6) ;
      GXt_objcol_SdtMRec_AlertaSDT_Item5 = GXv_objcol_SdtMRec_AlertaSDT_Item6[0] ;
      AV5Datos = GXt_objcol_SdtMRec_AlertaSDT_Item5 ;
      gx_BV18 = true ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "MRec_AlertaMaquinaWC Trae Datos  :%1", ""), AV5Datos.toJSonString(false), "", "", "", "", "", "", "", ""), AV53Pgmname) ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      AV12ContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ContCod", AV12ContCod);
      AV15Segundos = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Segundos), 4, 0));
      AV20MaqCodJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodJSON", AV20MaqCodJSON);
      AV21FasCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FasCodJSON", AV21FasCodJSON);
      AV22HdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HdrJSON", AV22HdrJSON);
      AV23ParFasCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ParFasCodJSON", AV23ParFasCodJSON);
      AV16FueraRango = ((Boolean) getParm(obj,7,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FueraRango", AV16FueraRango);
      AV24Desde = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Desde", localUtil.ttoc( AV24Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV25Hasta = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Hasta", localUtil.ttoc( AV25Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV26UsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26UsurCod", AV26UsurCod);
      AV27Ip = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Ip", AV27Ip);
      AV28Now = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Now", localUtil.ttoc( AV28Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV29MTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29MTkn", AV29MTkn);
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
      pa1WD2( ) ;
      ws1WD2( ) ;
      we1WD2( ) ;
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
      sCtrlAV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV12ContCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV15Segundos = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV20MaqCodJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV21FasCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV22HdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV23ParFasCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV16FueraRango = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV24Desde = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV25Hasta = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV26UsurCod = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV27Ip = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV28Now = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV29MTkn = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1WD2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\mrec_alertamaquinawc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1WD2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV11EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
         AV12ContCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ContCod", AV12ContCod);
         AV15Segundos = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Segundos), 4, 0));
         AV20MaqCodJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodJSON", AV20MaqCodJSON);
         AV21FasCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FasCodJSON", AV21FasCodJSON);
         AV22HdrJSON = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HdrJSON", AV22HdrJSON);
         AV23ParFasCodJSON = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ParFasCodJSON", AV23ParFasCodJSON);
         AV16FueraRango = ((Boolean) getParm(obj,9,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FueraRango", AV16FueraRango);
         AV24Desde = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Desde", localUtil.ttoc( AV24Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV25Hasta = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Hasta", localUtil.ttoc( AV25Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV26UsurCod = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26UsurCod", AV26UsurCod);
         AV27Ip = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Ip", AV27Ip);
         AV28Now = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Now", localUtil.ttoc( AV28Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV29MTkn = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29MTkn", AV29MTkn);
      }
      wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
      wcpOAV12ContCod = httpContext.cgiGet( sPrefix+"wcpOAV12ContCod") ;
      wcpOAV15Segundos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15Segundos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV20MaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodJSON") ;
      wcpOAV21FasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV21FasCodJSON") ;
      wcpOAV22HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV22HdrJSON") ;
      wcpOAV23ParFasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV23ParFasCodJSON") ;
      wcpOAV16FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV16FueraRango")) ;
      wcpOAV24Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV24Desde"), 0) ;
      wcpOAV25Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV25Hasta"), 0) ;
      wcpOAV26UsurCod = httpContext.cgiGet( sPrefix+"wcpOAV26UsurCod") ;
      wcpOAV27Ip = httpContext.cgiGet( sPrefix+"wcpOAV27Ip") ;
      wcpOAV28Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV28Now"), 0) ;
      wcpOAV29MTkn = httpContext.cgiGet( sPrefix+"wcpOAV29MTkn") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV11EmprCod, wcpOAV11EmprCod) != 0 ) || ( GXutil.strcmp(AV12ContCod, wcpOAV12ContCod) != 0 ) || ( AV15Segundos != wcpOAV15Segundos ) || ( GXutil.strcmp(AV20MaqCodJSON, wcpOAV20MaqCodJSON) != 0 ) || ( GXutil.strcmp(AV21FasCodJSON, wcpOAV21FasCodJSON) != 0 ) || ( GXutil.strcmp(AV22HdrJSON, wcpOAV22HdrJSON) != 0 ) || ( GXutil.strcmp(AV23ParFasCodJSON, wcpOAV23ParFasCodJSON) != 0 ) || ( AV16FueraRango != wcpOAV16FueraRango ) || !( GXutil.dateCompare(AV24Desde, wcpOAV24Desde) ) || !( GXutil.dateCompare(AV25Hasta, wcpOAV25Hasta) ) || ( GXutil.strcmp(AV26UsurCod, wcpOAV26UsurCod) != 0 ) || ( GXutil.strcmp(AV27Ip, wcpOAV27Ip) != 0 ) || !( GXutil.dateCompare(AV28Now, wcpOAV28Now) ) || ( GXutil.strcmp(AV29MTkn, wcpOAV29MTkn) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV11EmprCod = AV11EmprCod ;
      wcpOAV12ContCod = AV12ContCod ;
      wcpOAV15Segundos = AV15Segundos ;
      wcpOAV20MaqCodJSON = AV20MaqCodJSON ;
      wcpOAV21FasCodJSON = AV21FasCodJSON ;
      wcpOAV22HdrJSON = AV22HdrJSON ;
      wcpOAV23ParFasCodJSON = AV23ParFasCodJSON ;
      wcpOAV16FueraRango = AV16FueraRango ;
      wcpOAV24Desde = AV24Desde ;
      wcpOAV25Hasta = AV25Hasta ;
      wcpOAV26UsurCod = AV26UsurCod ;
      wcpOAV27Ip = AV27Ip ;
      wcpOAV28Now = AV28Now ;
      wcpOAV29MTkn = AV29MTkn ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV11EmprCod) > 0 )
      {
         AV11EmprCod = httpContext.cgiGet( sCtrlAV11EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      }
      else
      {
         AV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_PARM") ;
      }
      sCtrlAV12ContCod = httpContext.cgiGet( sPrefix+"AV12ContCod_CTRL") ;
      if ( GXutil.len( sCtrlAV12ContCod) > 0 )
      {
         AV12ContCod = httpContext.cgiGet( sCtrlAV12ContCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ContCod", AV12ContCod);
      }
      else
      {
         AV12ContCod = httpContext.cgiGet( sPrefix+"AV12ContCod_PARM") ;
      }
      sCtrlAV15Segundos = httpContext.cgiGet( sPrefix+"AV15Segundos_CTRL") ;
      if ( GXutil.len( sCtrlAV15Segundos) > 0 )
      {
         AV15Segundos = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15Segundos), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Segundos), 4, 0));
      }
      else
      {
         AV15Segundos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15Segundos_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV20MaqCodJSON = httpContext.cgiGet( sPrefix+"AV20MaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV20MaqCodJSON) > 0 )
      {
         AV20MaqCodJSON = httpContext.cgiGet( sCtrlAV20MaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodJSON", AV20MaqCodJSON);
      }
      else
      {
         AV20MaqCodJSON = httpContext.cgiGet( sPrefix+"AV20MaqCodJSON_PARM") ;
      }
      sCtrlAV21FasCodJSON = httpContext.cgiGet( sPrefix+"AV21FasCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV21FasCodJSON) > 0 )
      {
         AV21FasCodJSON = httpContext.cgiGet( sCtrlAV21FasCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FasCodJSON", AV21FasCodJSON);
      }
      else
      {
         AV21FasCodJSON = httpContext.cgiGet( sPrefix+"AV21FasCodJSON_PARM") ;
      }
      sCtrlAV22HdrJSON = httpContext.cgiGet( sPrefix+"AV22HdrJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV22HdrJSON) > 0 )
      {
         AV22HdrJSON = httpContext.cgiGet( sCtrlAV22HdrJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HdrJSON", AV22HdrJSON);
      }
      else
      {
         AV22HdrJSON = httpContext.cgiGet( sPrefix+"AV22HdrJSON_PARM") ;
      }
      sCtrlAV23ParFasCodJSON = httpContext.cgiGet( sPrefix+"AV23ParFasCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV23ParFasCodJSON) > 0 )
      {
         AV23ParFasCodJSON = httpContext.cgiGet( sCtrlAV23ParFasCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ParFasCodJSON", AV23ParFasCodJSON);
      }
      else
      {
         AV23ParFasCodJSON = httpContext.cgiGet( sPrefix+"AV23ParFasCodJSON_PARM") ;
      }
      sCtrlAV16FueraRango = httpContext.cgiGet( sPrefix+"AV16FueraRango_CTRL") ;
      if ( GXutil.len( sCtrlAV16FueraRango) > 0 )
      {
         AV16FueraRango = GXutil.strtobool( httpContext.cgiGet( sCtrlAV16FueraRango)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FueraRango", AV16FueraRango);
      }
      else
      {
         AV16FueraRango = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV16FueraRango_PARM")) ;
      }
      sCtrlAV24Desde = httpContext.cgiGet( sPrefix+"AV24Desde_CTRL") ;
      if ( GXutil.len( sCtrlAV24Desde) > 0 )
      {
         AV24Desde = localUtil.ctot( httpContext.cgiGet( sCtrlAV24Desde), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Desde", localUtil.ttoc( AV24Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV24Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV24Desde_PARM"), 0) ;
      }
      sCtrlAV25Hasta = httpContext.cgiGet( sPrefix+"AV25Hasta_CTRL") ;
      if ( GXutil.len( sCtrlAV25Hasta) > 0 )
      {
         AV25Hasta = localUtil.ctot( httpContext.cgiGet( sCtrlAV25Hasta), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Hasta", localUtil.ttoc( AV25Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV25Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV25Hasta_PARM"), 0) ;
      }
      sCtrlAV26UsurCod = httpContext.cgiGet( sPrefix+"AV26UsurCod_CTRL") ;
      if ( GXutil.len( sCtrlAV26UsurCod) > 0 )
      {
         AV26UsurCod = httpContext.cgiGet( sCtrlAV26UsurCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26UsurCod", AV26UsurCod);
      }
      else
      {
         AV26UsurCod = httpContext.cgiGet( sPrefix+"AV26UsurCod_PARM") ;
      }
      sCtrlAV27Ip = httpContext.cgiGet( sPrefix+"AV27Ip_CTRL") ;
      if ( GXutil.len( sCtrlAV27Ip) > 0 )
      {
         AV27Ip = httpContext.cgiGet( sCtrlAV27Ip) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Ip", AV27Ip);
      }
      else
      {
         AV27Ip = httpContext.cgiGet( sPrefix+"AV27Ip_PARM") ;
      }
      sCtrlAV28Now = httpContext.cgiGet( sPrefix+"AV28Now_CTRL") ;
      if ( GXutil.len( sCtrlAV28Now) > 0 )
      {
         AV28Now = localUtil.ctot( httpContext.cgiGet( sCtrlAV28Now), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Now", localUtil.ttoc( AV28Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV28Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV28Now_PARM"), 0) ;
      }
      sCtrlAV29MTkn = httpContext.cgiGet( sPrefix+"AV29MTkn_CTRL") ;
      if ( GXutil.len( sCtrlAV29MTkn) > 0 )
      {
         AV29MTkn = httpContext.cgiGet( sCtrlAV29MTkn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29MTkn", AV29MTkn);
      }
      else
      {
         AV29MTkn = httpContext.cgiGet( sPrefix+"AV29MTkn_PARM") ;
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
      pa1WD2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1WD2( ) ;
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
      ws1WD2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_PARM", GXutil.rtrim( AV11EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_CTRL", GXutil.rtrim( sCtrlAV11EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12ContCod_PARM", GXutil.rtrim( AV12ContCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12ContCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12ContCod_CTRL", GXutil.rtrim( sCtrlAV12ContCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Segundos_PARM", GXutil.ltrim( localUtil.ntoc( AV15Segundos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15Segundos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Segundos_CTRL", GXutil.rtrim( sCtrlAV15Segundos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodJSON_PARM", AV20MaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20MaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV20MaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21FasCodJSON_PARM", AV21FasCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21FasCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21FasCodJSON_CTRL", GXutil.rtrim( sCtrlAV21FasCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22HdrJSON_PARM", AV22HdrJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22HdrJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22HdrJSON_CTRL", GXutil.rtrim( sCtrlAV22HdrJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23ParFasCodJSON_PARM", AV23ParFasCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23ParFasCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23ParFasCodJSON_CTRL", GXutil.rtrim( sCtrlAV23ParFasCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16FueraRango_PARM", GXutil.booltostr( AV16FueraRango));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16FueraRango)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16FueraRango_CTRL", GXutil.rtrim( sCtrlAV16FueraRango));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Desde_PARM", localUtil.ttoc( AV24Desde, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24Desde)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Desde_CTRL", GXutil.rtrim( sCtrlAV24Desde));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Hasta_PARM", localUtil.ttoc( AV25Hasta, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Hasta)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Hasta_CTRL", GXutil.rtrim( sCtrlAV25Hasta));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26UsurCod_PARM", GXutil.rtrim( AV26UsurCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26UsurCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26UsurCod_CTRL", GXutil.rtrim( sCtrlAV26UsurCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Ip_PARM", AV27Ip);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27Ip)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Ip_CTRL", GXutil.rtrim( sCtrlAV27Ip));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Now_PARM", localUtil.ttoc( AV28Now, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Now)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Now_CTRL", GXutil.rtrim( sCtrlAV28Now));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29MTkn_PARM", AV29MTkn);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29MTkn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29MTkn_CTRL", GXutil.rtrim( sCtrlAV29MTkn));
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
      we1WD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671010485263", true, true);
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
         httpContext.AddJavascriptSource("ingenieria/mrec_alertamaquinawc.js", "?202671010485264", false, true);
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
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD_"+sGXsfl_18_idx ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD_"+sGXsfl_18_idx ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN_"+sGXsfl_18_idx ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD_"+sGXsfl_18_idx ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO_"+sGXsfl_18_idx ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR_"+sGXsfl_18_idx ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC_"+sGXsfl_18_idx ;
      edtavDatos__maqcod_Internalname = sPrefix+"DATOS__MAQCOD_"+sGXsfl_18_idx ;
      edtavDatos__maqdsc_Internalname = sPrefix+"DATOS__MAQDSC_"+sGXsfl_18_idx ;
      edtavDatos__mprecplc_Internalname = sPrefix+"DATOS__MPRECPLC_"+sGXsfl_18_idx ;
      edtavDatos__fascod_Internalname = sPrefix+"DATOS__FASCOD_"+sGXsfl_18_idx ;
      edtavDatos__fasdsc_Internalname = sPrefix+"DATOS__FASDSC_"+sGXsfl_18_idx ;
      edtavDatos__parfascod_Internalname = sPrefix+"DATOS__PARFASCOD_"+sGXsfl_18_idx ;
      edtavDatos__parfasdsc_Internalname = sPrefix+"DATOS__PARFASDSC_"+sGXsfl_18_idx ;
      edtavDatos__mprecvalmn_Internalname = sPrefix+"DATOS__MPRECVALMN_"+sGXsfl_18_idx ;
      edtavDatos__mprecval_Internalname = sPrefix+"DATOS__MPRECVAL_"+sGXsfl_18_idx ;
      edtavDatos__mprecvalmx_Internalname = sPrefix+"DATOS__MPRECVALMX_"+sGXsfl_18_idx ;
      chkavDatos__mprecer.setInternalname( sPrefix+"DATOS__MPRECER_"+sGXsfl_18_idx );
   }

   public void subsflControlProps_fel_182( )
   {
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD_"+sGXsfl_18_fel_idx ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD_"+sGXsfl_18_fel_idx ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN_"+sGXsfl_18_fel_idx ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD_"+sGXsfl_18_fel_idx ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO_"+sGXsfl_18_fel_idx ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR_"+sGXsfl_18_fel_idx ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC_"+sGXsfl_18_fel_idx ;
      edtavDatos__maqcod_Internalname = sPrefix+"DATOS__MAQCOD_"+sGXsfl_18_fel_idx ;
      edtavDatos__maqdsc_Internalname = sPrefix+"DATOS__MAQDSC_"+sGXsfl_18_fel_idx ;
      edtavDatos__mprecplc_Internalname = sPrefix+"DATOS__MPRECPLC_"+sGXsfl_18_fel_idx ;
      edtavDatos__fascod_Internalname = sPrefix+"DATOS__FASCOD_"+sGXsfl_18_fel_idx ;
      edtavDatos__fasdsc_Internalname = sPrefix+"DATOS__FASDSC_"+sGXsfl_18_fel_idx ;
      edtavDatos__parfascod_Internalname = sPrefix+"DATOS__PARFASCOD_"+sGXsfl_18_fel_idx ;
      edtavDatos__parfasdsc_Internalname = sPrefix+"DATOS__PARFASDSC_"+sGXsfl_18_fel_idx ;
      edtavDatos__mprecvalmn_Internalname = sPrefix+"DATOS__MPRECVALMN_"+sGXsfl_18_fel_idx ;
      edtavDatos__mprecval_Internalname = sPrefix+"DATOS__MPRECVAL_"+sGXsfl_18_fel_idx ;
      edtavDatos__mprecvalmx_Internalname = sPrefix+"DATOS__MPRECVALMX_"+sGXsfl_18_fel_idx ;
      chkavDatos__mprecer.setInternalname( sPrefix+"DATOS__MPRECER_"+sGXsfl_18_fel_idx );
   }

   public void sendrow_182( )
   {
      subsflControlProps_182( ) ;
      wb1WD0( ) ;
      if ( ( subGridmrec_alertasdts_Rows * 1 == 0 ) || ( nGXsfl_18_idx <= subgridmrec_alertasdts_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_18_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_18_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__emprcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__menvord_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__menvord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__menvord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__menvord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mreclin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mreclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mreclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mreclin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecfec_Internalname,localUtil.ttoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), "99/99/99 99:99:99.999"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecplc_Internalname,((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecplc(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecplc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecplc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fascod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfascod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__parfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmn_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmn_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecval_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecval_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmx_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmx_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DATOS__MPRECER_" + sGXsfl_18_idx ;
         chkavDatos__mprecer.setName( GXCCtl );
         chkavDatos__mprecer.setWebtags( "" );
         chkavDatos__mprecer.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_18_Refreshing);
         chkavDatos__mprecer.setCheckedValue( "false" );
         Gridmrec_alertasdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavDatos__mprecer.getInternalname(),GXutil.booltostr( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV5Datos.elementAt(-1+AV34GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()),"","",Integer.valueOf(-1),Integer.valueOf(chkavDatos__mprecer.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         send_integrity_lvl_hashes1WD2( ) ;
         Gridmrec_alertasdtsContainer.AddRow(Gridmrec_alertasdtsRow);
         nGXsfl_18_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_18_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      /* End function sendrow_182 */
   }

   public void startgridcontrol18( )
   {
      if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Gridmrec_alertasdtsContainer"+"DivS\" data-gxgridid=\"18\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
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
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecfec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmn_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmx_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
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
      edtavDatos__emprcod_Internalname = sPrefix+"DATOS__EMPRCOD" ;
      edtavDatos__menvord_Internalname = sPrefix+"DATOS__MENVORD" ;
      edtavDatos__mreclin_Internalname = sPrefix+"DATOS__MRECLIN" ;
      edtavDatos__barcod_Internalname = sPrefix+"DATOS__BARCOD" ;
      edtavDatos__barcodreo_Internalname = sPrefix+"DATOS__BARCODREO" ;
      edtavDatos__barcodpar_Internalname = sPrefix+"DATOS__BARCODPAR" ;
      edtavDatos__mprecfec_Internalname = sPrefix+"DATOS__MPRECFEC" ;
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
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      chkavDatos__mprecer.setEnabled( 0 );
      edtavDatos__mprecvalmx_Jsonclick = "" ;
      edtavDatos__mprecvalmx_Enabled = 0 ;
      edtavDatos__mprecval_Jsonclick = "" ;
      edtavDatos__mprecval_Enabled = 0 ;
      edtavDatos__mprecvalmn_Jsonclick = "" ;
      edtavDatos__mprecvalmn_Enabled = 0 ;
      edtavDatos__parfasdsc_Jsonclick = "" ;
      edtavDatos__parfasdsc_Enabled = 0 ;
      edtavDatos__parfascod_Jsonclick = "" ;
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
      edtavDatos__mprecfec_Jsonclick = "" ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__barcodpar_Jsonclick = "" ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__barcodreo_Jsonclick = "" ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcod_Jsonclick = "" ;
      edtavDatos__barcod_Enabled = 0 ;
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
      edtavDatos__mprecfec_Enabled = -1 ;
      edtavDatos__barcodpar_Enabled = -1 ;
      edtavDatos__barcodreo_Enabled = -1 ;
      edtavDatos__barcod_Enabled = -1 ;
      edtavDatos__mreclin_Enabled = -1 ;
      edtavDatos__menvord_Enabled = -1 ;
      edtavDatos__emprcod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      GXCCtl = "DATOS__MPRECER_" + sGXsfl_18_idx ;
      chkavDatos__mprecer.setName( GXCCtl );
      chkavDatos__mprecer.setWebtags( "" );
      chkavDatos__mprecer.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_18_Refreshing);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'sPrefix'},{av:'AV5Datos',fld:'vDATOS',grid:18,pic:'',hsh:true},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:18},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV8GridMRec_AlertaSDTsCurrentPage',fld:'vGRIDMREC_ALERTASDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV9GridMRec_AlertaSDTsPageCount',fld:'vGRIDMREC_ALERTASDTSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD","{handler:'e151WD2',iparms:[]");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e111WD2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV5Datos',fld:'vDATOS',grid:18,pic:'',hsh:true},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:18},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_alertasdtspaginationbar_Selectedpage',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121WD2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV5Datos',fld:'vDATOS',grid:18,pic:'',hsh:true},{av:'nGXsfl_18_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:18},{av:'nRC_GXsfl_18',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:18},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
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
      wcpOAV11EmprCod = "" ;
      wcpOAV12ContCod = "" ;
      wcpOAV20MaqCodJSON = "" ;
      wcpOAV21FasCodJSON = "" ;
      wcpOAV22HdrJSON = "" ;
      wcpOAV23ParFasCodJSON = "" ;
      wcpOAV24Desde = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV25Hasta = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV26UsurCod = "" ;
      wcpOAV27Ip = "" ;
      wcpOAV28Now = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV29MTkn = "" ;
      Gridmrec_alertasdtspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV11EmprCod = "" ;
      AV12ContCod = "" ;
      AV20MaqCodJSON = "" ;
      AV21FasCodJSON = "" ;
      AV22HdrJSON = "" ;
      AV23ParFasCodJSON = "" ;
      AV24Desde = GXutil.resetTime( GXutil.nullDate() );
      AV25Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV26UsurCod = "" ;
      AV27Ip = "" ;
      AV28Now = GXutil.resetTime( GXutil.nullDate() );
      AV29MTkn = "" ;
      AV5Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV53Pgmname = "" ;
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
      Gridmrec_alertasdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridmrec_alertasdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGridmrec_alertasdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV13MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV10FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV14ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV30Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV31EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Gridmrec_alertasdtsRow = new com.genexus.webpanels.GXWebRow();
      GXt_objcol_SdtMRec_AlertaSDT_Item5 = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AlertaSDT_Item6 = new GXBaseCollection[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV11EmprCod = "" ;
      sCtrlAV12ContCod = "" ;
      sCtrlAV15Segundos = "" ;
      sCtrlAV20MaqCodJSON = "" ;
      sCtrlAV21FasCodJSON = "" ;
      sCtrlAV22HdrJSON = "" ;
      sCtrlAV23ParFasCodJSON = "" ;
      sCtrlAV16FueraRango = "" ;
      sCtrlAV24Desde = "" ;
      sCtrlAV25Hasta = "" ;
      sCtrlAV26UsurCod = "" ;
      sCtrlAV27Ip = "" ;
      sCtrlAV28Now = "" ;
      sCtrlAV29MTkn = "" ;
      subGridmrec_alertasdts_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      Gridmrec_alertasdtsColumn = new com.genexus.webpanels.GXWebColumn();
      AV53Pgmname = "Ingenieria.MRec_AlertaMaquinaWC" ;
      /* GeneXus formulas. */
      AV53Pgmname = "Ingenieria.MRec_AlertaMaquinaWC" ;
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__mprecfec_Enabled = 0 ;
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
   private short wcpOAV15Segundos ;
   private short AV15Segundos ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_18 ;
   private int subGridmrec_alertasdts_Rows ;
   private int nGXsfl_18_idx=1 ;
   private int Gridmrec_alertasdtspaginationbar_Pagestoshow ;
   private int AV34GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridmrec_alertasdts_Islastpage ;
   private int edtavDatos__emprcod_Enabled ;
   private int edtavDatos__menvord_Enabled ;
   private int edtavDatos__mreclin_Enabled ;
   private int edtavDatos__barcod_Enabled ;
   private int edtavDatos__barcodreo_Enabled ;
   private int edtavDatos__barcodpar_Enabled ;
   private int edtavDatos__mprecfec_Enabled ;
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
   private int nGXsfl_18_fel_idx=1 ;
   private int AV7PageToGo ;
   private int idxLst ;
   private int subGridmrec_alertasdts_Backcolor ;
   private int subGridmrec_alertasdts_Allbackcolor ;
   private int subGridmrec_alertasdts_Titlebackcolor ;
   private int subGridmrec_alertasdts_Selectedindex ;
   private int subGridmrec_alertasdts_Selectioncolor ;
   private int subGridmrec_alertasdts_Hoveringcolor ;
   private long GRIDMREC_ALERTASDTS_nFirstRecordOnPage ;
   private long AV8GridMRec_AlertaSDTsCurrentPage ;
   private long AV9GridMRec_AlertaSDTsPageCount ;
   private long GRIDMREC_ALERTASDTS_nCurrentRecord ;
   private long GRIDMREC_ALERTASDTS_nRecordCount ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV12ContCod ;
   private String wcpOAV26UsurCod ;
   private String Gridmrec_alertasdtspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV11EmprCod ;
   private String AV12ContCod ;
   private String AV26UsurCod ;
   private String sGXsfl_18_idx="0001" ;
   private String AV53Pgmname ;
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
   private String Gridmrec_alertasdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divGridmrec_alertasdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridmrec_alertasdts_Internalname ;
   private String Gridmrec_alertasdtspaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
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
   private String edtavDatos__barcod_Internalname ;
   private String edtavDatos__barcodreo_Internalname ;
   private String edtavDatos__barcodpar_Internalname ;
   private String edtavDatos__mprecfec_Internalname ;
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
   private String sGXsfl_18_fel_idx="0001" ;
   private String hsh ;
   private String AV30Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV31EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String sCtrlAV11EmprCod ;
   private String sCtrlAV12ContCod ;
   private String sCtrlAV15Segundos ;
   private String sCtrlAV20MaqCodJSON ;
   private String sCtrlAV21FasCodJSON ;
   private String sCtrlAV22HdrJSON ;
   private String sCtrlAV23ParFasCodJSON ;
   private String sCtrlAV16FueraRango ;
   private String sCtrlAV24Desde ;
   private String sCtrlAV25Hasta ;
   private String sCtrlAV26UsurCod ;
   private String sCtrlAV27Ip ;
   private String sCtrlAV28Now ;
   private String sCtrlAV29MTkn ;
   private String subGridmrec_alertasdts_Class ;
   private String subGridmrec_alertasdts_Linesclass ;
   private String ROClassString ;
   private String edtavDatos__emprcod_Jsonclick ;
   private String edtavDatos__menvord_Jsonclick ;
   private String edtavDatos__mreclin_Jsonclick ;
   private String edtavDatos__barcod_Jsonclick ;
   private String edtavDatos__barcodreo_Jsonclick ;
   private String edtavDatos__barcodpar_Jsonclick ;
   private String edtavDatos__mprecfec_Jsonclick ;
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
   private java.util.Date wcpOAV24Desde ;
   private java.util.Date wcpOAV25Hasta ;
   private java.util.Date wcpOAV28Now ;
   private java.util.Date AV24Desde ;
   private java.util.Date AV25Hasta ;
   private java.util.Date AV28Now ;
   private boolean wcpOAV16FueraRango ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV16FueraRango ;
   private boolean Gridmrec_alertasdtspaginationbar_Showfirst ;
   private boolean Gridmrec_alertasdtspaginationbar_Showprevious ;
   private boolean Gridmrec_alertasdtspaginationbar_Shownext ;
   private boolean Gridmrec_alertasdtspaginationbar_Showlast ;
   private boolean Gridmrec_alertasdtspaginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_18_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV18 ;
   private String wcpOAV20MaqCodJSON ;
   private String wcpOAV21FasCodJSON ;
   private String wcpOAV22HdrJSON ;
   private String wcpOAV23ParFasCodJSON ;
   private String wcpOAV27Ip ;
   private String wcpOAV29MTkn ;
   private String AV20MaqCodJSON ;
   private String AV21FasCodJSON ;
   private String AV22HdrJSON ;
   private String AV23ParFasCodJSON ;
   private String AV27Ip ;
   private String AV29MTkn ;
   private GXSimpleCollection<Short> AV14ParFasCod ;
   private com.genexus.webpanels.GXWebGrid Gridmrec_alertasdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridmrec_alertasdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridmrec_alertasdtsColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdts_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavDatos__mprecer ;
   private GXSimpleCollection<String> AV13MaqCod ;
   private GXSimpleCollection<String> AV10FasCod ;
   private GXSimpleCollection<String> AV17Hdr ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV5Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXt_objcol_SdtMRec_AlertaSDT_Item5 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXv_objcol_SdtMRec_AlertaSDT_Item6[] ;
}

