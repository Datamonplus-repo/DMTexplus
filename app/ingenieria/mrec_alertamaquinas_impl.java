package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_alertamaquinas_impl extends GXWebComponent
{
   public mrec_alertamaquinas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_alertamaquinas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertamaquinas_impl.class ));
   }

   public mrec_alertamaquinas_impl( int remoteHandle ,
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
               AV54MRec_AnalisisLineaSDTJson = httpContext.GetPar( "MRec_AnalisisLineaSDTJson") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54MRec_AnalisisLineaSDTJson", AV54MRec_AnalisisLineaSDTJson);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV9EmprCod,AV6ContCod,Integer.valueOf(AV26Segundos),AV21MaqCodJson,AV11FasCodJSon,AV17HdrJSON,AV25ParFasCodJSon,Boolean.valueOf(AV12FueraRango),AV8Desde,AV15Hasta,AV27UsurCod,AV19Ip,AV22Now,AV40MTkn,AV54MRec_AnalisisLineaSDTJson});
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

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2E52( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Ingenieria.GraficaAlertaUCRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_alertamaquinas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6ContCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26Segundos,6,0)),GXutil.URLEncode(GXutil.rtrim(AV21MaqCodJson)),GXutil.URLEncode(GXutil.rtrim(AV11FasCodJSon)),GXutil.URLEncode(GXutil.rtrim(AV17HdrJSON)),GXutil.URLEncode(GXutil.rtrim(AV25ParFasCodJSon)),GXutil.URLEncode(GXutil.booltostr(AV12FueraRango)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV8Desde)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV15Hasta)),GXutil.URLEncode(GXutil.rtrim(AV27UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV19Ip)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV22Now)),GXutil.URLEncode(GXutil.rtrim(AV40MTkn)),GXutil.URLEncode(GXutil.rtrim(AV54MRec_AnalisisLineaSDTJson))}, new String[] {"EmprCod","ContCod","Segundos","MaqCodJson","FasCodJSon","HdrJSON","ParFasCodJSon","FueraRango","Desde","Hasta","UsurCod","Ip","Now","MTkn","MRec_AnalisisLineaSDTJson"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54MRec_AnalisisLineaSDTJson", wcpOAV54MRec_AnalisisLineaSDTJson);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMREC_ANALISISLINEASDTJSON", AV54MRec_AnalisisLineaSDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAFICA_Datasource", GXutil.rtrim( Grafica_Datasource));
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
   }

   public void renderHtmlCloseForm2E52( )
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
      return "Ingenieria.MRec_AlertaMaquinas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Alertas", "") ;
   }

   public void wb2E50( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.mrec_alertamaquinas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/Ingenieria.GraficaAlertaUCRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTitulo_Internalname, lblTitulo_Caption, "", "", lblTitulo_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AlertaMaquinas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGrafica.render(context, "ingenieria.graficaalertauc", Grafica_Internalname, sPrefix+"GRAFICAContainer");
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
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV57Pgmname), GXutil.rtrim( localUtil.format( AV57Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Ingenieria\\MRec_AlertaMaquinas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2E52( )
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
            strup2E50( ) ;
         }
      }
   }

   public void ws2E52( )
   {
      start2E52( ) ;
      evt2E52( ) ;
   }

   public void evt2E52( )
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
                              strup2E50( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e112E52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e122E52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2E50( ) ;
                           }
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
                              strup2E50( ) ;
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2E52( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2E52( ) ;
         }
      }
   }

   public void pa2E52( )
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
      rf2E52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV57Pgmname = "Ingenieria.MRec_AlertaMaquinas" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Pgmname", AV57Pgmname);
      Gx_err = (short)(0) ;
   }

   public void rf2E52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e122E52 ();
         wb2E50( ) ;
      }
   }

   public void send_integrity_lvl_hashes2E52( )
   {
   }

   public void before_start_formulas( )
   {
      AV57Pgmname = "Ingenieria.MRec_AlertaMaquinas" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Pgmname", AV57Pgmname);
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup2E50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112E52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         wcpOAV54MRec_AnalisisLineaSDTJson = httpContext.cgiGet( sPrefix+"wcpOAV54MRec_AnalisisLineaSDTJson") ;
         Grafica_Datasource = httpContext.cgiGet( sPrefix+"GRAFICA_Datasource") ;
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
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e112E52 ();
      if (returnInSub) return;
   }

   public void e112E52( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV20MaqCod.fromJSonString(AV21MaqCodJson, null);
      AV10FasCod.fromJSonString(AV11FasCodJSon, null);
      AV16Hdr.fromJSonString(AV17HdrJSON, null);
      AV24ParFasCod.fromJSonString(AV25ParFasCodJSon, null);
      AV51MRec_AnalisisLineaSDT.fromJSonString(AV54MRec_AnalisisLineaSDTJson, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Inicia alerta Maquinas para Maquina:%4, con EmprCod:%1, ContCod:%2, Intervalo:%3, Fases;%5, &HDR:%6, Parametro:%7, Error:%8, %9.", ""), AV9EmprCod, AV6ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0), AV20MaqCod.toJSonString(false), AV10FasCod.toJSonString(false), AV16Hdr.toJSonString(false), AV24ParFasCod.toJSonString(false), GXutil.booltostr( AV12FueraRango), GXutil.format( httpContext.getMessage( "Fechas:%1-%2, Usuario:%3, Ip:%4, Now:%5, Token:%6.", ""), localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV27UsurCod, AV19Ip, localUtil.ttoc( AV22Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV40MTkn, "", "", "")), AV57Pgmname) ;
      lblTitulo_Caption = GXutil.format( httpContext.getMessage( "%7Intervalo:%1(%8 - %9), Maquinas:%2, Fases:%3, Hdrs:%4, Parametro:%5, Error:%6.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Segundos), 6, 0), AV21MaqCodJson, AV11FasCodJSon, AV17HdrJSON, AV25ParFasCodJSon, GXutil.booltostr( AV12FueraRango), httpContext.getMessage( "<i class='fa fa-search' style='color:red; '></i>", ""), localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTitulo_Internalname, "Caption", lblTitulo_Caption, true);
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S112 ();
      if (returnInSub) return;
      if ( 1 == 0 )
      {
         GXt_char1 = AV43Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         mrec_alertamaquinas_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Station = GXt_char1 ;
         GXv_char2[0] = AV9EmprCod ;
         GXv_char3[0] = AV44EmprNom ;
         GXv_char4[0] = AV27UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
         mrec_alertamaquinas_impl.this.AV9EmprCod = GXv_char2[0] ;
         mrec_alertamaquinas_impl.this.AV44EmprNom = GXv_char3[0] ;
         mrec_alertamaquinas_impl.this.AV27UsurCod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27UsurCod", AV27UsurCod);
         edtavPgmname_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      }
      AV52Titulo = GXutil.format( httpContext.getMessage( "Actualizando Intervalo:%1--%2, Maquinas:%3, Fases:%4, HDRs:%5, Parametros:%6.", ""), localUtil.ttoc( AV8Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV15Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV20MaqCod.toJSonString(false), AV10FasCod.toJSonString(false), AV16Hdr.toJSonString(false), AV24ParFasCod.toJSonString(false), "", "", "") ;
   }

   public void S112( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      Grafica_Datasource = AV51MRec_AnalisisLineaSDT.toJSonString(false) ;
      ucGrafica.sendProperty(context, sPrefix, false, Grafica_Internalname, "DataSource", Grafica_Datasource);
   }

   protected void nextLoad( )
   {
   }

   protected void e122E52( )
   {
      /* Load Routine */
      returnInSub = false ;
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
      AV54MRec_AnalisisLineaSDTJson = (String)getParm(obj,14,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54MRec_AnalisisLineaSDTJson", AV54MRec_AnalisisLineaSDTJson);
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
      pa2E52( ) ;
      ws2E52( ) ;
      we2E52( ) ;
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
      sCtrlAV54MRec_AnalisisLineaSDTJson = (String)getParm(obj,14,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2E52( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\mrec_alertamaquinas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2E52( ) ;
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
         AV54MRec_AnalisisLineaSDTJson = (String)getParm(obj,16,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54MRec_AnalisisLineaSDTJson", AV54MRec_AnalisisLineaSDTJson);
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
      wcpOAV54MRec_AnalisisLineaSDTJson = httpContext.cgiGet( sPrefix+"wcpOAV54MRec_AnalisisLineaSDTJson") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV9EmprCod, wcpOAV9EmprCod) != 0 ) || ( GXutil.strcmp(AV6ContCod, wcpOAV6ContCod) != 0 ) || ( AV26Segundos != wcpOAV26Segundos ) || ( GXutil.strcmp(AV21MaqCodJson, wcpOAV21MaqCodJson) != 0 ) || ( GXutil.strcmp(AV11FasCodJSon, wcpOAV11FasCodJSon) != 0 ) || ( GXutil.strcmp(AV17HdrJSON, wcpOAV17HdrJSON) != 0 ) || ( GXutil.strcmp(AV25ParFasCodJSon, wcpOAV25ParFasCodJSon) != 0 ) || ( AV12FueraRango != wcpOAV12FueraRango ) || !( GXutil.dateCompare(AV8Desde, wcpOAV8Desde) ) || !( GXutil.dateCompare(AV15Hasta, wcpOAV15Hasta) ) || ( GXutil.strcmp(AV27UsurCod, wcpOAV27UsurCod) != 0 ) || ( GXutil.strcmp(AV19Ip, wcpOAV19Ip) != 0 ) || !( GXutil.dateCompare(AV22Now, wcpOAV22Now) ) || ( GXutil.strcmp(AV40MTkn, wcpOAV40MTkn) != 0 ) || ( GXutil.strcmp(AV54MRec_AnalisisLineaSDTJson, wcpOAV54MRec_AnalisisLineaSDTJson) != 0 ) ) )
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
      wcpOAV54MRec_AnalisisLineaSDTJson = AV54MRec_AnalisisLineaSDTJson ;
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
      sCtrlAV54MRec_AnalisisLineaSDTJson = httpContext.cgiGet( sPrefix+"AV54MRec_AnalisisLineaSDTJson_CTRL") ;
      if ( GXutil.len( sCtrlAV54MRec_AnalisisLineaSDTJson) > 0 )
      {
         AV54MRec_AnalisisLineaSDTJson = httpContext.cgiGet( sCtrlAV54MRec_AnalisisLineaSDTJson) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54MRec_AnalisisLineaSDTJson", AV54MRec_AnalisisLineaSDTJson);
      }
      else
      {
         AV54MRec_AnalisisLineaSDTJson = httpContext.cgiGet( sPrefix+"AV54MRec_AnalisisLineaSDTJson_PARM") ;
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
      pa2E52( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2E52( ) ;
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
      ws2E52( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54MRec_AnalisisLineaSDTJson_PARM", AV54MRec_AnalisisLineaSDTJson);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54MRec_AnalisisLineaSDTJson)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54MRec_AnalisisLineaSDTJson_CTRL", GXutil.rtrim( sCtrlAV54MRec_AnalisisLineaSDTJson));
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
      we2E52( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268178173518", true, true);
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
         httpContext.AddJavascriptSource("ingenieria/mrec_alertamaquinas.js", "?20268178173519", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/Ingenieria.GraficaAlertaUCRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitulo_Internalname = sPrefix+"TITULO" ;
      Grafica_Internalname = sPrefix+"GRAFICA" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      Datamon_Internalname = sPrefix+"DATAMON" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Visible = 1 ;
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
      Grafica_Datasource = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
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
      wcpOAV54MRec_AnalisisLineaSDTJson = "" ;
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
      AV54MRec_AnalisisLineaSDTJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTitulo_Jsonclick = "" ;
      ucGrafica = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV57Pgmname = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV10FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV51MRec_AnalisisLineaSDT = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      AV43Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV44EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV52Titulo = "" ;
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
      sCtrlAV54MRec_AnalisisLineaSDTJson = "" ;
      AV57Pgmname = "Ingenieria.MRec_AlertaMaquinas" ;
      /* GeneXus formulas. */
      AV57Pgmname = "Ingenieria.MRec_AlertaMaquinas" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV26Segundos ;
   private int AV26Segundos ;
   private int edtavPgmname_Visible ;
   private int idxLst ;
   private String wcpOAV9EmprCod ;
   private String wcpOAV6ContCod ;
   private String wcpOAV27UsurCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV9EmprCod ;
   private String AV6ContCod ;
   private String AV27UsurCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Grafica_Datasource ;
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
   private String divUnnamedtable1_Internalname ;
   private String lblTitulo_Internalname ;
   private String lblTitulo_Caption ;
   private String lblTitulo_Jsonclick ;
   private String Grafica_Internalname ;
   private String Datamon_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV57Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV43Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV44EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
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
   private String sCtrlAV54MRec_AnalisisLineaSDTJson ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String wcpOAV21MaqCodJson ;
   private String wcpOAV11FasCodJSon ;
   private String wcpOAV17HdrJSON ;
   private String wcpOAV25ParFasCodJSon ;
   private String wcpOAV19Ip ;
   private String wcpOAV40MTkn ;
   private String wcpOAV54MRec_AnalisisLineaSDTJson ;
   private String AV21MaqCodJson ;
   private String AV11FasCodJSon ;
   private String AV17HdrJSON ;
   private String AV25ParFasCodJSon ;
   private String AV19Ip ;
   private String AV40MTkn ;
   private String AV54MRec_AnalisisLineaSDTJson ;
   private String AV52Titulo ;
   private GXSimpleCollection<Short> AV24ParFasCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGrafica ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private GXSimpleCollection<String> AV20MaqCod ;
   private GXSimpleCollection<String> AV10FasCod ;
   private GXSimpleCollection<String> AV16Hdr ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> AV51MRec_AnalisisLineaSDT ;
}

