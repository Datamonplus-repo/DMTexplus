package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoreoperadosresumenmaquina_impl extends GXWebComponent
{
   public historicoreoperadosresumenmaquina_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public historicoreoperadosresumenmaquina_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoreoperadosresumenmaquina_impl.class ));
   }

   public historicoreoperadosresumenmaquina_impl( int remoteHandle ,
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
      cmbavQueryvieweroutputtype = new HTMLChoice();
      cmbavQueryviewercharttype = new HTMLChoice();
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
               AV16Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
               AV5Cliente = (int)(GXutil.lval( httpContext.GetPar( "Cliente"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Cliente), 6, 0));
               AV6Cliente_to = (int)(GXutil.lval( httpContext.GetPar( "Cliente_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Cliente_to), 6, 0));
               AV8HisreoFec = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec", localUtil.format(AV8HisreoFec, "99/99/99"));
               AV9HisreoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisreoFec_to", localUtil.format(AV9HisreoFec_to, "99/99/99"));
               AV14Tipdefcod = (short)(GXutil.lval( httpContext.GetPar( "Tipdefcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Tipdefcod), 4, 0));
               AV15TipDefcod_to = (short)(GXutil.lval( httpContext.GetPar( "TipDefcod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipDefcod_to), 4, 0));
               AV10Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Maqcod", AV10Maqcod);
               AV11MaqCod_to = httpContext.GetPar( "MaqCod_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11MaqCod_to", AV11MaqCod_to);
               AV12TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipArtCod), 4, 0));
               AV13TipArtCod_to = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipArtCod_to), 4, 0));
               AV7Hisestreo = (byte)(GXutil.lval( httpContext.GetPar( "Hisestreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisestreo", GXutil.str( AV7Hisestreo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV16Emprcod,Integer.valueOf(AV5Cliente),Integer.valueOf(AV6Cliente_to),AV8HisreoFec,AV9HisreoFec_to,Short.valueOf(AV14Tipdefcod),Short.valueOf(AV15TipDefcod_to),AV10Maqcod,AV11MaqCod_to,Short.valueOf(AV12TipArtCod),Short.valueOf(AV13TipArtCod_to),Byte.valueOf(AV7Hisestreo)});
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
         pa15P2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico Reoperados Resumen Maquina", "")) ;
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
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.historicoreoperadosresumenmaquina", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5Cliente,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6Cliente_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV8HisreoFec)),GXutil.URLEncode(GXutil.formatDateParm(AV9HisreoFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV14Tipdefcod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15TipDefcod_to,4,0)),GXutil.URLEncode(GXutil.rtrim(AV10Maqcod)),GXutil.URLEncode(GXutil.rtrim(AV11MaqCod_to)),GXutil.URLEncode(GXutil.ltrimstr(AV12TipArtCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13TipArtCod_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Hisestreo,1,0))}, new String[] {"Emprcod","Cliente","Cliente_to","HisreoFec","HisreoFec_to","Tipdefcod","TipDefcod_to","Maqcod","MaqCod_to","TipArtCod","TipArtCod_to","Hisestreo"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV19Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV19Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV20Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV20Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV21ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV21ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV22ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV22ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV23DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV23DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV24FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV24FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV25ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV25ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV26ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV26ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16Emprcod", GXutil.rtrim( wcpOAV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Cliente", GXutil.ltrim( localUtil.ntoc( wcpOAV5Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Cliente_to", GXutil.ltrim( localUtil.ntoc( wcpOAV6Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HisreoFec", localUtil.dtoc( wcpOAV8HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HisreoFec_to", localUtil.dtoc( wcpOAV9HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14Tipdefcod", GXutil.ltrim( localUtil.ntoc( wcpOAV14Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15TipDefcod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV15TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Maqcod", GXutil.rtrim( wcpOAV10Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11MaqCod_to", GXutil.rtrim( wcpOAV11MaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12TipArtCod", GXutil.ltrim( localUtil.ntoc( wcpOAV12TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13TipArtCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV13TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Hisestreo", GXutil.ltrim( localUtil.ntoc( wcpOAV7Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTE", GXutil.ltrim( localUtil.ntoc( AV5Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTE_TO", GXutil.ltrim( localUtil.ntoc( AV6Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC", localUtil.dtoc( AV8HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC_TO", localUtil.dtoc( AV9HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDEFCOD", GXutil.ltrim( localUtil.ntoc( AV14Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDEFCOD_TO", GXutil.ltrim( localUtil.ntoc( AV15TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV10Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD_TO", GXutil.rtrim( AV11MaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV12TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV13TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV7Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Objectcall", GXutil.rtrim( Informehistoricoreoperadosresumenmaquina_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Objectcall", GXutil.rtrim( Informehistoricoreoperadosresumenmaquina_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Type", GXutil.rtrim( Informehistoricoreoperadosresumenmaquina_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Charttype", GXutil.rtrim( Informehistoricoreoperadosresumenmaquina_Charttype));
   }

   public void renderHtmlCloseForm15P2( )
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
      return "HistoricoReoperadosResumenMaquina" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico Reoperados Resumen Maquina", "") ;
   }

   public void wb15P0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.historicoreoperadosresumenmaquina");
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavQueryvieweroutputtype.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavQueryvieweroutputtype.getInternalname(), httpContext.getMessage( "Tipo de Query", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryvieweroutputtype, cmbavQueryvieweroutputtype.getInternalname(), GXutil.rtrim( AV17QueryViewerOutputType), 1, cmbavQueryvieweroutputtype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryvieweroutputtype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,17);\"", "", false, (byte)(0), "HLP_HistoricoReoperadosResumenMaquina.htm");
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV17QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavQueryviewercharttype.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavQueryviewercharttype.getInternalname(), httpContext.getMessage( "Tipo de Grafica", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryviewercharttype, cmbavQueryviewercharttype.getInternalname(), GXutil.rtrim( AV18QueryViewerChartType), 1, cmbavQueryviewercharttype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryviewercharttype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,21);\"", "", false, (byte)(0), "HLP_HistoricoReoperadosResumenMaquina.htm");
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV18QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucInformehistoricoreoperadosresumenmaquina.setProperty("Elements", AV19Elements);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("Parameters", AV20Parameters);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("Title", Informehistoricoreoperadosresumenmaquina_Title);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("ItemClickData", AV21ItemClickData);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("ItemDoubleClickData", AV22ItemDoubleClickData);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("DragAndDropData", AV23DragAndDropData);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("FilterChangedData", AV24FilterChangedData);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("ItemExpandData", AV25ItemExpandData);
         ucInformehistoricoreoperadosresumenmaquina.setProperty("ItemCollapseData", AV26ItemCollapseData);
         ucInformehistoricoreoperadosresumenmaquina.render(context, "queryviewer", Informehistoricoreoperadosresumenmaquina_Internalname, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINAContainer");
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
      wbLoad = true ;
   }

   public void start15P2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico Reoperados Resumen Maquina", ""), (short)(0)) ;
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
            strup15P0( ) ;
         }
      }
   }

   public void ws15P2( )
   {
      start15P2( ) ;
      evt15P2( ) ;
   }

   public void evt15P2( )
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
                              strup15P0( ) ;
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
                              strup15P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1115P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1215P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1315P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1415P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1515P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15P0( ) ;
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
                              strup15P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavQueryvieweroutputtype.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void we15P2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm15P2( ) ;
         }
      }
   }

   public void pa15P2( )
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
            GX_FocusControl = cmbavQueryvieweroutputtype.getInternalname() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      if ( cmbavQueryvieweroutputtype.getItemCount() > 0 )
      {
         AV17QueryViewerOutputType = cmbavQueryvieweroutputtype.getValidValue(AV17QueryViewerOutputType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17QueryViewerOutputType", AV17QueryViewerOutputType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV17QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
      }
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
         AV18QueryViewerChartType = cmbavQueryviewercharttype.getValidValue(AV18QueryViewerChartType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18QueryViewerChartType", AV18QueryViewerChartType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV18QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf15P2( ) ;
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
   }

   public void rf15P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1415P2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1515P2 ();
         wb15P0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15P2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup15P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1115P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV19Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV20Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV21ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV22ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV23DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV24FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV25ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV26ItemCollapseData);
         /* Read saved values. */
         wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
         wcpOAV5Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Cliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Cliente_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8HisreoFec"), 0) ;
         wcpOAV9HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9HisreoFec_to"), 0) ;
         wcpOAV14Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14Tipdefcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15TipDefcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV10Maqcod") ;
         wcpOAV11MaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV11MaqCod_to") ;
         wcpOAV12TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Informehistoricoreoperadosresumenmaquina_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Objectcall") ;
         Informehistoricoreoperadosresumenmaquina_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Objectcall") ;
         Informehistoricoreoperadosresumenmaquina_Type = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Type") ;
         Informehistoricoreoperadosresumenmaquina_Charttype = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA_Charttype") ;
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
      e1115P2 ();
      if (returnInSub) return;
   }

   public void e1115P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV17QueryViewerOutputType = "PivotTable" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17QueryViewerOutputType", AV17QueryViewerOutputType);
      AV18QueryViewerChartType = "Bar" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18QueryViewerChartType", AV18QueryViewerChartType);
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      historicoreoperadosresumenmaquina_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      GXv_char2[0] = AV16Emprcod ;
      GXv_char3[0] = AV32Emprnom ;
      GXv_char4[0] = AV33Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      historicoreoperadosresumenmaquina_impl.this.AV16Emprcod = GXv_char2[0] ;
      historicoreoperadosresumenmaquina_impl.this.AV32Emprnom = GXv_char3[0] ;
      historicoreoperadosresumenmaquina_impl.this.AV33Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
   }

   public void e1215P2( )
   {
      /* Queryviewercharttype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e1315P2( )
   {
      /* Queryvieweroutputtype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e1415P2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Informehistoricoreoperadosresumenmaquina_Type = AV17QueryViewerOutputType ;
      ucInformehistoricoreoperadosresumenmaquina.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumenmaquina_Internalname, "Type", Informehistoricoreoperadosresumenmaquina_Type);
      Informehistoricoreoperadosresumenmaquina_Charttype = AV18QueryViewerChartType ;
      ucInformehistoricoreoperadosresumenmaquina.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumenmaquina_Internalname, "ChartType", Informehistoricoreoperadosresumenmaquina_Charttype);
      Informehistoricoreoperadosresumenmaquina_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPHistoricoReoperadosResumenMaquina")+"\", \""+GXutil.encodeJSON( AV16Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV5Cliente, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV6Cliente_to, 6, 0))+"\", \""+GXutil.encodeJSON( localUtil.format(AV8HisreoFec, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV9HisreoFec_to, "99/99/99"))+"\", \""+GXutil.encodeJSON( GXutil.str( AV14Tipdefcod, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV15TipDefcod_to, 4, 0))+"\", \""+GXutil.encodeJSON( AV10Maqcod)+"\", \""+GXutil.encodeJSON( AV11MaqCod_to)+"\", \""+GXutil.encodeJSON( GXutil.str( AV12TipArtCod, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV13TipArtCod_to, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV7Hisestreo, 1, 0))+"\" ]" ;
      ucInformehistoricoreoperadosresumenmaquina.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumenmaquina_Internalname, "Object", Informehistoricoreoperadosresumenmaquina_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1515P2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV16Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
      AV5Cliente = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Cliente), 6, 0));
      AV6Cliente_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Cliente_to), 6, 0));
      AV8HisreoFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec", localUtil.format(AV8HisreoFec, "99/99/99"));
      AV9HisreoFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisreoFec_to", localUtil.format(AV9HisreoFec_to, "99/99/99"));
      AV14Tipdefcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Tipdefcod), 4, 0));
      AV15TipDefcod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipDefcod_to), 4, 0));
      AV10Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Maqcod", AV10Maqcod);
      AV11MaqCod_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11MaqCod_to", AV11MaqCod_to);
      AV12TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipArtCod), 4, 0));
      AV13TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipArtCod_to), 4, 0));
      AV7Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisestreo", GXutil.str( AV7Hisestreo, 1, 0));
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
      pa15P2( ) ;
      ws15P2( ) ;
      we15P2( ) ;
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
      sCtrlAV16Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV5Cliente = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV6Cliente_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8HisreoFec = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9HisreoFec_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV14Tipdefcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV15TipDefcod_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV10Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV11MaqCod_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV12TipArtCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV13TipArtCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV7Hisestreo = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa15P2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "historicoreoperadosresumenmaquina", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa15P2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV16Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
         AV5Cliente = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Cliente), 6, 0));
         AV6Cliente_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Cliente_to), 6, 0));
         AV8HisreoFec = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec", localUtil.format(AV8HisreoFec, "99/99/99"));
         AV9HisreoFec_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisreoFec_to", localUtil.format(AV9HisreoFec_to, "99/99/99"));
         AV14Tipdefcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Tipdefcod), 4, 0));
         AV15TipDefcod_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipDefcod_to), 4, 0));
         AV10Maqcod = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Maqcod", AV10Maqcod);
         AV11MaqCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11MaqCod_to", AV11MaqCod_to);
         AV12TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipArtCod), 4, 0));
         AV13TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipArtCod_to), 4, 0));
         AV7Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisestreo", GXutil.str( AV7Hisestreo, 1, 0));
      }
      wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
      wcpOAV5Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Cliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Cliente_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8HisreoFec"), 0) ;
      wcpOAV9HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9HisreoFec_to"), 0) ;
      wcpOAV14Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14Tipdefcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15TipDefcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV10Maqcod") ;
      wcpOAV11MaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV11MaqCod_to") ;
      wcpOAV12TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV13TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV16Emprcod, wcpOAV16Emprcod) != 0 ) || ( AV5Cliente != wcpOAV5Cliente ) || ( AV6Cliente_to != wcpOAV6Cliente_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV8HisreoFec), GXutil.resetTime(wcpOAV8HisreoFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV9HisreoFec_to), GXutil.resetTime(wcpOAV9HisreoFec_to)) ) || ( AV14Tipdefcod != wcpOAV14Tipdefcod ) || ( AV15TipDefcod_to != wcpOAV15TipDefcod_to ) || ( GXutil.strcmp(AV10Maqcod, wcpOAV10Maqcod) != 0 ) || ( GXutil.strcmp(AV11MaqCod_to, wcpOAV11MaqCod_to) != 0 ) || ( AV12TipArtCod != wcpOAV12TipArtCod ) || ( AV13TipArtCod_to != wcpOAV13TipArtCod_to ) || ( AV7Hisestreo != wcpOAV7Hisestreo ) ) )
      {
         setjustcreated();
      }
      wcpOAV16Emprcod = AV16Emprcod ;
      wcpOAV5Cliente = AV5Cliente ;
      wcpOAV6Cliente_to = AV6Cliente_to ;
      wcpOAV8HisreoFec = AV8HisreoFec ;
      wcpOAV9HisreoFec_to = AV9HisreoFec_to ;
      wcpOAV14Tipdefcod = AV14Tipdefcod ;
      wcpOAV15TipDefcod_to = AV15TipDefcod_to ;
      wcpOAV10Maqcod = AV10Maqcod ;
      wcpOAV11MaqCod_to = AV11MaqCod_to ;
      wcpOAV12TipArtCod = AV12TipArtCod ;
      wcpOAV13TipArtCod_to = AV13TipArtCod_to ;
      wcpOAV7Hisestreo = AV7Hisestreo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV16Emprcod = httpContext.cgiGet( sPrefix+"AV16Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV16Emprcod) > 0 )
      {
         AV16Emprcod = httpContext.cgiGet( sCtrlAV16Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
      }
      else
      {
         AV16Emprcod = httpContext.cgiGet( sPrefix+"AV16Emprcod_PARM") ;
      }
      sCtrlAV5Cliente = httpContext.cgiGet( sPrefix+"AV5Cliente_CTRL") ;
      if ( GXutil.len( sCtrlAV5Cliente) > 0 )
      {
         AV5Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Cliente), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Cliente), 6, 0));
      }
      else
      {
         AV5Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Cliente_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6Cliente_to = httpContext.cgiGet( sPrefix+"AV6Cliente_to_CTRL") ;
      if ( GXutil.len( sCtrlAV6Cliente_to) > 0 )
      {
         AV6Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Cliente_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Cliente_to), 6, 0));
      }
      else
      {
         AV6Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Cliente_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8HisreoFec = httpContext.cgiGet( sPrefix+"AV8HisreoFec_CTRL") ;
      if ( GXutil.len( sCtrlAV8HisreoFec) > 0 )
      {
         AV8HisreoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8HisreoFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec", localUtil.format(AV8HisreoFec, "99/99/99"));
      }
      else
      {
         AV8HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8HisreoFec_PARM"), 0) ;
      }
      sCtrlAV9HisreoFec_to = httpContext.cgiGet( sPrefix+"AV9HisreoFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV9HisreoFec_to) > 0 )
      {
         AV9HisreoFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9HisreoFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisreoFec_to", localUtil.format(AV9HisreoFec_to, "99/99/99"));
      }
      else
      {
         AV9HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9HisreoFec_to_PARM"), 0) ;
      }
      sCtrlAV14Tipdefcod = httpContext.cgiGet( sPrefix+"AV14Tipdefcod_CTRL") ;
      if ( GXutil.len( sCtrlAV14Tipdefcod) > 0 )
      {
         AV14Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14Tipdefcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Tipdefcod), 4, 0));
      }
      else
      {
         AV14Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14Tipdefcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15TipDefcod_to = httpContext.cgiGet( sPrefix+"AV15TipDefcod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV15TipDefcod_to) > 0 )
      {
         AV15TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15TipDefcod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipDefcod_to), 4, 0));
      }
      else
      {
         AV15TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15TipDefcod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10Maqcod = httpContext.cgiGet( sPrefix+"AV10Maqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV10Maqcod) > 0 )
      {
         AV10Maqcod = httpContext.cgiGet( sCtrlAV10Maqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Maqcod", AV10Maqcod);
      }
      else
      {
         AV10Maqcod = httpContext.cgiGet( sPrefix+"AV10Maqcod_PARM") ;
      }
      sCtrlAV11MaqCod_to = httpContext.cgiGet( sPrefix+"AV11MaqCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV11MaqCod_to) > 0 )
      {
         AV11MaqCod_to = httpContext.cgiGet( sCtrlAV11MaqCod_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11MaqCod_to", AV11MaqCod_to);
      }
      else
      {
         AV11MaqCod_to = httpContext.cgiGet( sPrefix+"AV11MaqCod_to_PARM") ;
      }
      sCtrlAV12TipArtCod = httpContext.cgiGet( sPrefix+"AV12TipArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV12TipArtCod) > 0 )
      {
         AV12TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV12TipArtCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipArtCod), 4, 0));
      }
      else
      {
         AV12TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV12TipArtCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV13TipArtCod_to = httpContext.cgiGet( sPrefix+"AV13TipArtCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV13TipArtCod_to) > 0 )
      {
         AV13TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13TipArtCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TipArtCod_to), 4, 0));
      }
      else
      {
         AV13TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13TipArtCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7Hisestreo = httpContext.cgiGet( sPrefix+"AV7Hisestreo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Hisestreo) > 0 )
      {
         AV7Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7Hisestreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisestreo", GXutil.str( AV7Hisestreo, 1, 0));
      }
      else
      {
         AV7Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Hisestreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa15P2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws15P2( ) ;
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
      ws15P2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16Emprcod_PARM", GXutil.rtrim( AV16Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16Emprcod_CTRL", GXutil.rtrim( sCtrlAV16Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Cliente_PARM", GXutil.ltrim( localUtil.ntoc( AV5Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Cliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Cliente_CTRL", GXutil.rtrim( sCtrlAV5Cliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Cliente_to_PARM", GXutil.ltrim( localUtil.ntoc( AV6Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Cliente_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Cliente_to_CTRL", GXutil.rtrim( sCtrlAV6Cliente_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HisreoFec_PARM", localUtil.dtoc( AV8HisreoFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8HisreoFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HisreoFec_CTRL", GXutil.rtrim( sCtrlAV8HisreoFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisreoFec_to_PARM", localUtil.dtoc( AV9HisreoFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HisreoFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisreoFec_to_CTRL", GXutil.rtrim( sCtrlAV9HisreoFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Tipdefcod_PARM", GXutil.ltrim( localUtil.ntoc( AV14Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14Tipdefcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Tipdefcod_CTRL", GXutil.rtrim( sCtrlAV14Tipdefcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15TipDefcod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV15TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15TipDefcod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15TipDefcod_to_CTRL", GXutil.rtrim( sCtrlAV15TipDefcod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Maqcod_PARM", GXutil.rtrim( AV10Maqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Maqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Maqcod_CTRL", GXutil.rtrim( sCtrlAV10Maqcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11MaqCod_to_PARM", GXutil.rtrim( AV11MaqCod_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11MaqCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11MaqCod_to_CTRL", GXutil.rtrim( sCtrlAV11MaqCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12TipArtCod_PARM", GXutil.ltrim( localUtil.ntoc( AV12TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12TipArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12TipArtCod_CTRL", GXutil.rtrim( sCtrlAV12TipArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13TipArtCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV13TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13TipArtCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13TipArtCod_to_CTRL", GXutil.rtrim( sCtrlAV13TipArtCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisestreo_PARM", GXutil.ltrim( localUtil.ntoc( AV7Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Hisestreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisestreo_CTRL", GXutil.rtrim( sCtrlAV7Hisestreo));
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
      we15P2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015562183", true, true);
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
      httpContext.AddJavascriptSource("historicoreoperadosresumenmaquina.js", "?202661015562183", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavQueryvieweroutputtype.setInternalname( sPrefix+"vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryviewercharttype.setInternalname( sPrefix+"vQUERYVIEWERCHARTTYPE" );
      Informehistoricoreoperadosresumenmaquina_Internalname = sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENMAQUINA" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
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
      Informehistoricoreoperadosresumenmaquina_Title = "" ;
      cmbavQueryviewercharttype.setJsonclick( "" );
      cmbavQueryviewercharttype.setEnabled( 1 );
      cmbavQueryvieweroutputtype.setJsonclick( "" );
      cmbavQueryvieweroutputtype.setEnabled( 1 );
      Informehistoricoreoperadosresumenmaquina_Charttype = "Column" ;
      Informehistoricoreoperadosresumenmaquina_Type = "Default" ;
      Informehistoricoreoperadosresumenmaquina_Objectcall = "" ;
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
      cmbavQueryvieweroutputtype.setName( "vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryvieweroutputtype.setWebtags( "" );
      cmbavQueryvieweroutputtype.addItem("Default", httpContext.getMessage( "Default", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Card", httpContext.getMessage( "Card", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Chart", httpContext.getMessage( "Chart", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Map", httpContext.getMessage( "Map", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("PivotTable", httpContext.getMessage( "PivotTable", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Table", httpContext.getMessage( "Table", ""), (short)(0));
      if ( cmbavQueryvieweroutputtype.getItemCount() > 0 )
      {
      }
      cmbavQueryviewercharttype.setName( "vQUERYVIEWERCHARTTYPE" );
      cmbavQueryviewercharttype.setWebtags( "" );
      cmbavQueryviewercharttype.addItem("Column", httpContext.getMessage( "Column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Column3D", httpContext.getMessage( "Column 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn", httpContext.getMessage( "Stacked column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn3D", httpContext.getMessage( "Stacked column 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn100", httpContext.getMessage( "100% stacked column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Bar", httpContext.getMessage( "Bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedBar", httpContext.getMessage( "Stacked bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedBar100", httpContext.getMessage( "100% stacked bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Area", httpContext.getMessage( "Area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedArea", httpContext.getMessage( "Stacked area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedArea100", httpContext.getMessage( "100% stacked area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothArea", httpContext.getMessage( "Smooth area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepArea", httpContext.getMessage( "Step area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Line", httpContext.getMessage( "Line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedLine", httpContext.getMessage( "Stacked line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedLine100", httpContext.getMessage( "100% stacked line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothLine", httpContext.getMessage( "Smooth line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepLine", httpContext.getMessage( "Step line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pie", httpContext.getMessage( "Pie", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pie3D", httpContext.getMessage( "Pie 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Doughnut", httpContext.getMessage( "Doughnut", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Doughnut3D", httpContext.getMessage( "Doughnut 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("LinearGauge", httpContext.getMessage( "Linear gauge", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("CircularGauge", httpContext.getMessage( "Circular gauge", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Radar", httpContext.getMessage( "Radar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("FilledRadar", httpContext.getMessage( "Filled radar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("PolarArea", httpContext.getMessage( "Polar area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Funnel", httpContext.getMessage( "Funnel", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pyramid", httpContext.getMessage( "Pyramid", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("ColumnLine", httpContext.getMessage( "Column & line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Column3DLine", httpContext.getMessage( "Column 3D & line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Timeline", httpContext.getMessage( "Timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothTimeline", httpContext.getMessage( "Smooth timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepTimeline", httpContext.getMessage( "Step timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Sparkline", httpContext.getMessage( "Sparkline", ""), (short)(0));
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavQueryvieweroutputtype'},{av:'AV17QueryViewerOutputType',fld:'vQUERYVIEWEROUTPUTTYPE',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV18QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Cliente',fld:'vCLIENTE',pic:'ZZZZZ9'},{av:'AV6Cliente_to',fld:'vCLIENTE_TO',pic:'ZZZZZ9'},{av:'AV8HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV9HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV14Tipdefcod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV15TipDefcod_to',fld:'vTIPDEFCOD_TO',pic:'ZZZ9'},{av:'AV10Maqcod',fld:'vMAQCOD',pic:''},{av:'AV11MaqCod_to',fld:'vMAQCOD_TO',pic:''},{av:'AV12TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV13TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV7Hisestreo',fld:'vHISESTREO',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'Informehistoricoreoperadosresumenmaquina_Type',ctrl:'INFORMEHISTORICOREOPERADOSRESUMENMAQUINA',prop:'Type'},{av:'Informehistoricoreoperadosresumenmaquina_Charttype',ctrl:'INFORMEHISTORICOREOPERADOSRESUMENMAQUINA',prop:'ChartType'},{ctrl:'INFORMEHISTORICOREOPERADOSRESUMENMAQUINA'}]}");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED","{handler:'e1215P2',iparms:[]");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED","{handler:'e1315P2',iparms:[]");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VALIDV_QUERYVIEWEROUTPUTTYPE","{handler:'validv_Queryvieweroutputtype',iparms:[]");
      setEventMetadata("VALIDV_QUERYVIEWEROUTPUTTYPE",",oparms:[]}");
      setEventMetadata("VALIDV_QUERYVIEWERCHARTTYPE","{handler:'validv_Queryviewercharttype',iparms:[]");
      setEventMetadata("VALIDV_QUERYVIEWERCHARTTYPE",",oparms:[]}");
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
      wcpOAV16Emprcod = "" ;
      wcpOAV8HisreoFec = GXutil.nullDate() ;
      wcpOAV9HisreoFec_to = GXutil.nullDate() ;
      wcpOAV10Maqcod = "" ;
      wcpOAV11MaqCod_to = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV16Emprcod = "" ;
      AV8HisreoFec = GXutil.nullDate() ;
      AV9HisreoFec_to = GXutil.nullDate() ;
      AV10Maqcod = "" ;
      AV11MaqCod_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV19Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV20Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV21ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV22ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV23DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV24FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV25ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV26ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV17QueryViewerOutputType = "" ;
      AV18QueryViewerChartType = "" ;
      ucInformehistoricoreoperadosresumenmaquina = new com.genexus.webpanels.GXUserControl();
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
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV16Emprcod = "" ;
      sCtrlAV5Cliente = "" ;
      sCtrlAV6Cliente_to = "" ;
      sCtrlAV8HisreoFec = "" ;
      sCtrlAV9HisreoFec_to = "" ;
      sCtrlAV14Tipdefcod = "" ;
      sCtrlAV15TipDefcod_to = "" ;
      sCtrlAV10Maqcod = "" ;
      sCtrlAV11MaqCod_to = "" ;
      sCtrlAV12TipArtCod = "" ;
      sCtrlAV13TipArtCod_to = "" ;
      sCtrlAV7Hisestreo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV7Hisestreo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7Hisestreo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOAV14Tipdefcod ;
   private short wcpOAV15TipDefcod_to ;
   private short wcpOAV12TipArtCod ;
   private short wcpOAV13TipArtCod_to ;
   private short AV14Tipdefcod ;
   private short AV15TipDefcod_to ;
   private short AV12TipArtCod ;
   private short AV13TipArtCod_to ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV5Cliente ;
   private int wcpOAV6Cliente_to ;
   private int AV5Cliente ;
   private int AV6Cliente_to ;
   private int idxLst ;
   private String wcpOAV16Emprcod ;
   private String wcpOAV10Maqcod ;
   private String wcpOAV11MaqCod_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV16Emprcod ;
   private String AV10Maqcod ;
   private String AV11MaqCod_to ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informehistoricoreoperadosresumenmaquina_Objectcall ;
   private String Informehistoricoreoperadosresumenmaquina_Type ;
   private String Informehistoricoreoperadosresumenmaquina_Charttype ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String TempTags ;
   private String AV17QueryViewerOutputType ;
   private String AV18QueryViewerChartType ;
   private String Informehistoricoreoperadosresumenmaquina_Title ;
   private String Informehistoricoreoperadosresumenmaquina_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV31Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV32Emprnom ;
   private String GXv_char3[] ;
   private String AV33Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV16Emprcod ;
   private String sCtrlAV5Cliente ;
   private String sCtrlAV6Cliente_to ;
   private String sCtrlAV8HisreoFec ;
   private String sCtrlAV9HisreoFec_to ;
   private String sCtrlAV14Tipdefcod ;
   private String sCtrlAV15TipDefcod_to ;
   private String sCtrlAV10Maqcod ;
   private String sCtrlAV11MaqCod_to ;
   private String sCtrlAV12TipArtCod ;
   private String sCtrlAV13TipArtCod_to ;
   private String sCtrlAV7Hisestreo ;
   private java.util.Date wcpOAV8HisreoFec ;
   private java.util.Date wcpOAV9HisreoFec_to ;
   private java.util.Date AV8HisreoFec ;
   private java.util.Date AV9HisreoFec_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucInformehistoricoreoperadosresumenmaquina ;
   private HTMLChoice cmbavQueryvieweroutputtype ;
   private HTMLChoice cmbavQueryviewercharttype ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV19Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV20Parameters ;
   private app.SdtQueryViewerItemClickData AV21ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV22ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV23DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV24FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV25ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV26ItemCollapseData ;
}

