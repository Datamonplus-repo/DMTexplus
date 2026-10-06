package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoreoperadosresumencliente_impl extends GXWebComponent
{
   public historicoreoperadosresumencliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public historicoreoperadosresumencliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoreoperadosresumencliente_impl.class ));
   }

   public historicoreoperadosresumencliente_impl( int remoteHandle ,
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
               AV22Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Emprcod", AV22Emprcod);
               AV21Cliente = (int)(GXutil.lval( httpContext.GetPar( "Cliente"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Cliente), 6, 0));
               AV20Cliente_to = (int)(GXutil.lval( httpContext.GetPar( "Cliente_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Cliente_to), 6, 0));
               AV19HisreoFec = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19HisreoFec", localUtil.format(AV19HisreoFec, "99/99/99"));
               AV18HisreoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisreoFec_to", localUtil.format(AV18HisreoFec_to, "99/99/99"));
               AV23Tipdefcod = (short)(GXutil.lval( httpContext.GetPar( "Tipdefcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Tipdefcod), 4, 0));
               AV24TipDefcod_to = (short)(GXutil.lval( httpContext.GetPar( "TipDefcod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefcod_to), 4, 0));
               AV25Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Maqcod", AV25Maqcod);
               AV27MaqCod_to = httpContext.GetPar( "MaqCod_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod_to", AV27MaqCod_to);
               AV28TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod), 4, 0));
               AV29TipArtCod_to = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCod_to), 4, 0));
               AV17Hisestreo = (byte)(GXutil.lval( httpContext.GetPar( "Hisestreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisestreo", GXutil.str( AV17Hisestreo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV22Emprcod,Integer.valueOf(AV21Cliente),Integer.valueOf(AV20Cliente_to),AV19HisreoFec,AV18HisreoFec_to,Short.valueOf(AV23Tipdefcod),Short.valueOf(AV24TipDefcod_to),AV25Maqcod,AV27MaqCod_to,Short.valueOf(AV28TipArtCod),Short.valueOf(AV29TipArtCod_to),Byte.valueOf(AV17Hisestreo)});
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
         pa15O2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico Reoperados Resumen Cliente", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.historicoreoperadosresumencliente", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV21Cliente,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Cliente_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV19HisreoFec)),GXutil.URLEncode(GXutil.formatDateParm(AV18HisreoFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV23Tipdefcod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24TipDefcod_to,4,0)),GXutil.URLEncode(GXutil.rtrim(AV25Maqcod)),GXutil.URLEncode(GXutil.rtrim(AV27MaqCod_to)),GXutil.URLEncode(GXutil.ltrimstr(AV28TipArtCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29TipArtCod_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17Hisestreo,1,0))}, new String[] {"Emprcod","Cliente","Cliente_to","HisreoFec","HisreoFec_to","Tipdefcod","TipDefcod_to","Maqcod","MaqCod_to","TipArtCod","TipArtCod_to","Hisestreo"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV7Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV7Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV8Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV8Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV9ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV9ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV10ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV10ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV11DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV11DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV13ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV13ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV14ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV14ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22Emprcod", GXutil.rtrim( wcpOAV22Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21Cliente", GXutil.ltrim( localUtil.ntoc( wcpOAV21Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20Cliente_to", GXutil.ltrim( localUtil.ntoc( wcpOAV20Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19HisreoFec", localUtil.dtoc( wcpOAV19HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18HisreoFec_to", localUtil.dtoc( wcpOAV18HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Tipdefcod", GXutil.ltrim( localUtil.ntoc( wcpOAV23Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24TipDefcod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV24TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Maqcod", GXutil.rtrim( wcpOAV25Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27MaqCod_to", GXutil.rtrim( wcpOAV27MaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28TipArtCod", GXutil.ltrim( localUtil.ntoc( wcpOAV28TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29TipArtCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV29TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Hisestreo", GXutil.ltrim( localUtil.ntoc( wcpOAV17Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV22Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTE", GXutil.ltrim( localUtil.ntoc( AV21Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTE_TO", GXutil.ltrim( localUtil.ntoc( AV20Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC", localUtil.dtoc( AV19HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC_TO", localUtil.dtoc( AV18HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDEFCOD", GXutil.ltrim( localUtil.ntoc( AV23Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDEFCOD_TO", GXutil.ltrim( localUtil.ntoc( AV24TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV25Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD_TO", GXutil.rtrim( AV27MaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV28TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV17Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Objectcall", GXutil.rtrim( Informehistoricoreoperadosresumencliente_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Objectcall", GXutil.rtrim( Informehistoricoreoperadosresumencliente_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Type", GXutil.rtrim( Informehistoricoreoperadosresumencliente_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Charttype", GXutil.rtrim( Informehistoricoreoperadosresumencliente_Charttype));
   }

   public void renderHtmlCloseForm15O2( )
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
      return "HistoricoReoperadosResumenCliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico Reoperados Resumen Cliente", "") ;
   }

   public void wb15O0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.historicoreoperadosresumencliente");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryvieweroutputtype, cmbavQueryvieweroutputtype.getInternalname(), GXutil.rtrim( AV5QueryViewerOutputType), 1, cmbavQueryvieweroutputtype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryvieweroutputtype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,17);\"", "", false, (byte)(0), "HLP_HistoricoReoperadosResumenCliente.htm");
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV5QueryViewerOutputType) );
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryviewercharttype, cmbavQueryviewercharttype.getInternalname(), GXutil.rtrim( AV6QueryViewerChartType), 1, cmbavQueryviewercharttype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryviewercharttype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,21);\"", "", false, (byte)(0), "HLP_HistoricoReoperadosResumenCliente.htm");
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV6QueryViewerChartType) );
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
         ucInformehistoricoreoperadosresumencliente.setProperty("Elements", AV7Elements);
         ucInformehistoricoreoperadosresumencliente.setProperty("Parameters", AV8Parameters);
         ucInformehistoricoreoperadosresumencliente.setProperty("Title", Informehistoricoreoperadosresumencliente_Title);
         ucInformehistoricoreoperadosresumencliente.setProperty("ItemClickData", AV9ItemClickData);
         ucInformehistoricoreoperadosresumencliente.setProperty("ItemDoubleClickData", AV10ItemDoubleClickData);
         ucInformehistoricoreoperadosresumencliente.setProperty("DragAndDropData", AV11DragAndDropData);
         ucInformehistoricoreoperadosresumencliente.setProperty("FilterChangedData", AV12FilterChangedData);
         ucInformehistoricoreoperadosresumencliente.setProperty("ItemExpandData", AV13ItemExpandData);
         ucInformehistoricoreoperadosresumencliente.setProperty("ItemCollapseData", AV14ItemCollapseData);
         ucInformehistoricoreoperadosresumencliente.render(context, "queryviewer", Informehistoricoreoperadosresumencliente_Internalname, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTEContainer");
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

   public void start15O2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico Reoperados Resumen Cliente", ""), (short)(0)) ;
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
            strup15O0( ) ;
         }
      }
   }

   public void ws15O2( )
   {
      start15O2( ) ;
      evt15O2( ) ;
   }

   public void evt15O2( )
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
                              strup15O0( ) ;
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
                              strup15O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1115O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1215O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1315O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1415O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1515O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15O0( ) ;
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
                              strup15O0( ) ;
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

   public void we15O2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm15O2( ) ;
         }
      }
   }

   public void pa15O2( )
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
         AV5QueryViewerOutputType = cmbavQueryvieweroutputtype.getValidValue(AV5QueryViewerOutputType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5QueryViewerOutputType", AV5QueryViewerOutputType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV5QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
      }
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
         AV6QueryViewerChartType = cmbavQueryviewercharttype.getValidValue(AV6QueryViewerChartType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6QueryViewerChartType", AV6QueryViewerChartType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV6QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf15O2( ) ;
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

   public void rf15O2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1415O2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1515O2 ();
         wb15O0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15O2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup15O0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1115O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV7Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV8Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV9ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV10ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV11DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV12FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV13ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV14ItemCollapseData);
         /* Read saved values. */
         wcpOAV22Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV22Emprcod") ;
         wcpOAV21Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21Cliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV20Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20Cliente_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19HisreoFec"), 0) ;
         wcpOAV18HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18HisreoFec_to"), 0) ;
         wcpOAV23Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Tipdefcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24TipDefcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV25Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV25Maqcod") ;
         wcpOAV27MaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV27MaqCod_to") ;
         wcpOAV28TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Informehistoricoreoperadosresumencliente_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Objectcall") ;
         Informehistoricoreoperadosresumencliente_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Objectcall") ;
         Informehistoricoreoperadosresumencliente_Type = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Type") ;
         Informehistoricoreoperadosresumencliente_Charttype = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE_Charttype") ;
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
      e1115O2 ();
      if (returnInSub) return;
   }

   public void e1115O2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5QueryViewerOutputType = "Table" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5QueryViewerOutputType", AV5QueryViewerOutputType);
      AV6QueryViewerChartType = "Bar" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6QueryViewerChartType", AV6QueryViewerChartType);
      GXt_char1 = AV32Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      historicoreoperadosresumencliente_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Station = GXt_char1 ;
      GXv_char2[0] = AV22Emprcod ;
      GXv_char3[0] = AV33Emprnom ;
      GXv_char4[0] = AV34Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV32Station, GXv_char2, GXv_char3, GXv_char4) ;
      historicoreoperadosresumencliente_impl.this.AV22Emprcod = GXv_char2[0] ;
      historicoreoperadosresumencliente_impl.this.AV33Emprnom = GXv_char3[0] ;
      historicoreoperadosresumencliente_impl.this.AV34Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Emprcod", AV22Emprcod);
   }

   public void e1215O2( )
   {
      /* Queryviewercharttype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e1315O2( )
   {
      /* Queryvieweroutputtype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e1415O2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Informehistoricoreoperadosresumencliente_Type = AV5QueryViewerOutputType ;
      ucInformehistoricoreoperadosresumencliente.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumencliente_Internalname, "Type", Informehistoricoreoperadosresumencliente_Type);
      Informehistoricoreoperadosresumencliente_Charttype = AV6QueryViewerChartType ;
      ucInformehistoricoreoperadosresumencliente.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumencliente_Internalname, "ChartType", Informehistoricoreoperadosresumencliente_Charttype);
      Informehistoricoreoperadosresumencliente_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPHistoricoReoperadosResumenCliente")+"\", \""+GXutil.encodeJSON( AV22Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV21Cliente, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV20Cliente_to, 6, 0))+"\", \""+GXutil.encodeJSON( localUtil.format(AV19HisreoFec, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV18HisreoFec_to, "99/99/99"))+"\", \""+GXutil.encodeJSON( GXutil.str( AV23Tipdefcod, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV24TipDefcod_to, 4, 0))+"\", \""+GXutil.encodeJSON( AV25Maqcod)+"\", \""+GXutil.encodeJSON( AV27MaqCod_to)+"\", \""+GXutil.encodeJSON( GXutil.str( AV28TipArtCod, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV29TipArtCod_to, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV17Hisestreo, 1, 0))+"\" ]" ;
      ucInformehistoricoreoperadosresumencliente.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumencliente_Internalname, "Object", Informehistoricoreoperadosresumencliente_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1515O2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV22Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Emprcod", AV22Emprcod);
      AV21Cliente = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Cliente), 6, 0));
      AV20Cliente_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Cliente_to), 6, 0));
      AV19HisreoFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19HisreoFec", localUtil.format(AV19HisreoFec, "99/99/99"));
      AV18HisreoFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisreoFec_to", localUtil.format(AV18HisreoFec_to, "99/99/99"));
      AV23Tipdefcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Tipdefcod), 4, 0));
      AV24TipDefcod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefcod_to), 4, 0));
      AV25Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Maqcod", AV25Maqcod);
      AV27MaqCod_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod_to", AV27MaqCod_to);
      AV28TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod), 4, 0));
      AV29TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCod_to), 4, 0));
      AV17Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisestreo", GXutil.str( AV17Hisestreo, 1, 0));
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
      pa15O2( ) ;
      ws15O2( ) ;
      we15O2( ) ;
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
      sCtrlAV22Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV21Cliente = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV20Cliente_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV19HisreoFec = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV18HisreoFec_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV23Tipdefcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV24TipDefcod_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV25Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV27MaqCod_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV28TipArtCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV29TipArtCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV17Hisestreo = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa15O2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "historicoreoperadosresumencliente", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa15O2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV22Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Emprcod", AV22Emprcod);
         AV21Cliente = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Cliente), 6, 0));
         AV20Cliente_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Cliente_to), 6, 0));
         AV19HisreoFec = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19HisreoFec", localUtil.format(AV19HisreoFec, "99/99/99"));
         AV18HisreoFec_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisreoFec_to", localUtil.format(AV18HisreoFec_to, "99/99/99"));
         AV23Tipdefcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Tipdefcod), 4, 0));
         AV24TipDefcod_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefcod_to), 4, 0));
         AV25Maqcod = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Maqcod", AV25Maqcod);
         AV27MaqCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod_to", AV27MaqCod_to);
         AV28TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod), 4, 0));
         AV29TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCod_to), 4, 0));
         AV17Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisestreo", GXutil.str( AV17Hisestreo, 1, 0));
      }
      wcpOAV22Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV22Emprcod") ;
      wcpOAV21Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21Cliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV20Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20Cliente_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19HisreoFec"), 0) ;
      wcpOAV18HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18HisreoFec_to"), 0) ;
      wcpOAV23Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Tipdefcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24TipDefcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV25Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV25Maqcod") ;
      wcpOAV27MaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV27MaqCod_to") ;
      wcpOAV28TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV22Emprcod, wcpOAV22Emprcod) != 0 ) || ( AV21Cliente != wcpOAV21Cliente ) || ( AV20Cliente_to != wcpOAV20Cliente_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV19HisreoFec), GXutil.resetTime(wcpOAV19HisreoFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV18HisreoFec_to), GXutil.resetTime(wcpOAV18HisreoFec_to)) ) || ( AV23Tipdefcod != wcpOAV23Tipdefcod ) || ( AV24TipDefcod_to != wcpOAV24TipDefcod_to ) || ( GXutil.strcmp(AV25Maqcod, wcpOAV25Maqcod) != 0 ) || ( GXutil.strcmp(AV27MaqCod_to, wcpOAV27MaqCod_to) != 0 ) || ( AV28TipArtCod != wcpOAV28TipArtCod ) || ( AV29TipArtCod_to != wcpOAV29TipArtCod_to ) || ( AV17Hisestreo != wcpOAV17Hisestreo ) ) )
      {
         setjustcreated();
      }
      wcpOAV22Emprcod = AV22Emprcod ;
      wcpOAV21Cliente = AV21Cliente ;
      wcpOAV20Cliente_to = AV20Cliente_to ;
      wcpOAV19HisreoFec = AV19HisreoFec ;
      wcpOAV18HisreoFec_to = AV18HisreoFec_to ;
      wcpOAV23Tipdefcod = AV23Tipdefcod ;
      wcpOAV24TipDefcod_to = AV24TipDefcod_to ;
      wcpOAV25Maqcod = AV25Maqcod ;
      wcpOAV27MaqCod_to = AV27MaqCod_to ;
      wcpOAV28TipArtCod = AV28TipArtCod ;
      wcpOAV29TipArtCod_to = AV29TipArtCod_to ;
      wcpOAV17Hisestreo = AV17Hisestreo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV22Emprcod = httpContext.cgiGet( sPrefix+"AV22Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV22Emprcod) > 0 )
      {
         AV22Emprcod = httpContext.cgiGet( sCtrlAV22Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Emprcod", AV22Emprcod);
      }
      else
      {
         AV22Emprcod = httpContext.cgiGet( sPrefix+"AV22Emprcod_PARM") ;
      }
      sCtrlAV21Cliente = httpContext.cgiGet( sPrefix+"AV21Cliente_CTRL") ;
      if ( GXutil.len( sCtrlAV21Cliente) > 0 )
      {
         AV21Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21Cliente), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Cliente), 6, 0));
      }
      else
      {
         AV21Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21Cliente_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV20Cliente_to = httpContext.cgiGet( sPrefix+"AV20Cliente_to_CTRL") ;
      if ( GXutil.len( sCtrlAV20Cliente_to) > 0 )
      {
         AV20Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV20Cliente_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Cliente_to), 6, 0));
      }
      else
      {
         AV20Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV20Cliente_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19HisreoFec = httpContext.cgiGet( sPrefix+"AV19HisreoFec_CTRL") ;
      if ( GXutil.len( sCtrlAV19HisreoFec) > 0 )
      {
         AV19HisreoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV19HisreoFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19HisreoFec", localUtil.format(AV19HisreoFec, "99/99/99"));
      }
      else
      {
         AV19HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV19HisreoFec_PARM"), 0) ;
      }
      sCtrlAV18HisreoFec_to = httpContext.cgiGet( sPrefix+"AV18HisreoFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV18HisreoFec_to) > 0 )
      {
         AV18HisreoFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV18HisreoFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisreoFec_to", localUtil.format(AV18HisreoFec_to, "99/99/99"));
      }
      else
      {
         AV18HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV18HisreoFec_to_PARM"), 0) ;
      }
      sCtrlAV23Tipdefcod = httpContext.cgiGet( sPrefix+"AV23Tipdefcod_CTRL") ;
      if ( GXutil.len( sCtrlAV23Tipdefcod) > 0 )
      {
         AV23Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV23Tipdefcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Tipdefcod), 4, 0));
      }
      else
      {
         AV23Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV23Tipdefcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24TipDefcod_to = httpContext.cgiGet( sPrefix+"AV24TipDefcod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV24TipDefcod_to) > 0 )
      {
         AV24TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV24TipDefcod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefcod_to), 4, 0));
      }
      else
      {
         AV24TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV24TipDefcod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV25Maqcod = httpContext.cgiGet( sPrefix+"AV25Maqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV25Maqcod) > 0 )
      {
         AV25Maqcod = httpContext.cgiGet( sCtrlAV25Maqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Maqcod", AV25Maqcod);
      }
      else
      {
         AV25Maqcod = httpContext.cgiGet( sPrefix+"AV25Maqcod_PARM") ;
      }
      sCtrlAV27MaqCod_to = httpContext.cgiGet( sPrefix+"AV27MaqCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV27MaqCod_to) > 0 )
      {
         AV27MaqCod_to = httpContext.cgiGet( sCtrlAV27MaqCod_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod_to", AV27MaqCod_to);
      }
      else
      {
         AV27MaqCod_to = httpContext.cgiGet( sPrefix+"AV27MaqCod_to_PARM") ;
      }
      sCtrlAV28TipArtCod = httpContext.cgiGet( sPrefix+"AV28TipArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV28TipArtCod) > 0 )
      {
         AV28TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28TipArtCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod), 4, 0));
      }
      else
      {
         AV28TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28TipArtCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29TipArtCod_to = httpContext.cgiGet( sPrefix+"AV29TipArtCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV29TipArtCod_to) > 0 )
      {
         AV29TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29TipArtCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCod_to), 4, 0));
      }
      else
      {
         AV29TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29TipArtCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17Hisestreo = httpContext.cgiGet( sPrefix+"AV17Hisestreo_CTRL") ;
      if ( GXutil.len( sCtrlAV17Hisestreo) > 0 )
      {
         AV17Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV17Hisestreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisestreo", GXutil.str( AV17Hisestreo, 1, 0));
      }
      else
      {
         AV17Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV17Hisestreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa15O2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws15O2( ) ;
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
      ws15O2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Emprcod_PARM", GXutil.rtrim( AV22Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Emprcod_CTRL", GXutil.rtrim( sCtrlAV22Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Cliente_PARM", GXutil.ltrim( localUtil.ntoc( AV21Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21Cliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Cliente_CTRL", GXutil.rtrim( sCtrlAV21Cliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Cliente_to_PARM", GXutil.ltrim( localUtil.ntoc( AV20Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20Cliente_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Cliente_to_CTRL", GXutil.rtrim( sCtrlAV20Cliente_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19HisreoFec_PARM", localUtil.dtoc( AV19HisreoFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19HisreoFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19HisreoFec_CTRL", GXutil.rtrim( sCtrlAV19HisreoFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18HisreoFec_to_PARM", localUtil.dtoc( AV18HisreoFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18HisreoFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18HisreoFec_to_CTRL", GXutil.rtrim( sCtrlAV18HisreoFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Tipdefcod_PARM", GXutil.ltrim( localUtil.ntoc( AV23Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Tipdefcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Tipdefcod_CTRL", GXutil.rtrim( sCtrlAV23Tipdefcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24TipDefcod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV24TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24TipDefcod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24TipDefcod_to_CTRL", GXutil.rtrim( sCtrlAV24TipDefcod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Maqcod_PARM", GXutil.rtrim( AV25Maqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Maqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Maqcod_CTRL", GXutil.rtrim( sCtrlAV25Maqcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27MaqCod_to_PARM", GXutil.rtrim( AV27MaqCod_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27MaqCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27MaqCod_to_CTRL", GXutil.rtrim( sCtrlAV27MaqCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28TipArtCod_PARM", GXutil.ltrim( localUtil.ntoc( AV28TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28TipArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28TipArtCod_CTRL", GXutil.rtrim( sCtrlAV28TipArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29TipArtCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV29TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29TipArtCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29TipArtCod_to_CTRL", GXutil.rtrim( sCtrlAV29TipArtCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Hisestreo_PARM", GXutil.ltrim( localUtil.ntoc( AV17Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Hisestreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Hisestreo_CTRL", GXutil.rtrim( sCtrlAV17Hisestreo));
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
      we15O2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015562186", true, true);
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
      httpContext.AddJavascriptSource("historicoreoperadosresumencliente.js", "?202661015562187", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavQueryvieweroutputtype.setInternalname( sPrefix+"vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryviewercharttype.setInternalname( sPrefix+"vQUERYVIEWERCHARTTYPE" );
      Informehistoricoreoperadosresumencliente_Internalname = sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENCLIENTE" ;
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
      Informehistoricoreoperadosresumencliente_Title = "" ;
      cmbavQueryviewercharttype.setJsonclick( "" );
      cmbavQueryviewercharttype.setEnabled( 1 );
      cmbavQueryvieweroutputtype.setJsonclick( "" );
      cmbavQueryvieweroutputtype.setEnabled( 1 );
      Informehistoricoreoperadosresumencliente_Charttype = "Column" ;
      Informehistoricoreoperadosresumencliente_Type = "Default" ;
      Informehistoricoreoperadosresumencliente_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavQueryvieweroutputtype'},{av:'AV5QueryViewerOutputType',fld:'vQUERYVIEWEROUTPUTTYPE',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV6QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV22Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21Cliente',fld:'vCLIENTE',pic:'ZZZZZ9'},{av:'AV20Cliente_to',fld:'vCLIENTE_TO',pic:'ZZZZZ9'},{av:'AV19HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV18HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV23Tipdefcod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV24TipDefcod_to',fld:'vTIPDEFCOD_TO',pic:'ZZZ9'},{av:'AV25Maqcod',fld:'vMAQCOD',pic:''},{av:'AV27MaqCod_to',fld:'vMAQCOD_TO',pic:''},{av:'AV28TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV29TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV17Hisestreo',fld:'vHISESTREO',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'Informehistoricoreoperadosresumencliente_Type',ctrl:'INFORMEHISTORICOREOPERADOSRESUMENCLIENTE',prop:'Type'},{av:'Informehistoricoreoperadosresumencliente_Charttype',ctrl:'INFORMEHISTORICOREOPERADOSRESUMENCLIENTE',prop:'ChartType'},{ctrl:'INFORMEHISTORICOREOPERADOSRESUMENCLIENTE'}]}");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED","{handler:'e1215O2',iparms:[]");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED","{handler:'e1315O2',iparms:[]");
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
      wcpOAV22Emprcod = "" ;
      wcpOAV19HisreoFec = GXutil.nullDate() ;
      wcpOAV18HisreoFec_to = GXutil.nullDate() ;
      wcpOAV25Maqcod = "" ;
      wcpOAV27MaqCod_to = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV22Emprcod = "" ;
      AV19HisreoFec = GXutil.nullDate() ;
      AV18HisreoFec_to = GXutil.nullDate() ;
      AV25Maqcod = "" ;
      AV27MaqCod_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV7Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV8Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV9ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV10ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV11DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV12FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV13ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV14ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV5QueryViewerOutputType = "" ;
      AV6QueryViewerChartType = "" ;
      ucInformehistoricoreoperadosresumencliente = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV32Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV33Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV34Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV22Emprcod = "" ;
      sCtrlAV21Cliente = "" ;
      sCtrlAV20Cliente_to = "" ;
      sCtrlAV19HisreoFec = "" ;
      sCtrlAV18HisreoFec_to = "" ;
      sCtrlAV23Tipdefcod = "" ;
      sCtrlAV24TipDefcod_to = "" ;
      sCtrlAV25Maqcod = "" ;
      sCtrlAV27MaqCod_to = "" ;
      sCtrlAV28TipArtCod = "" ;
      sCtrlAV29TipArtCod_to = "" ;
      sCtrlAV17Hisestreo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV17Hisestreo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV17Hisestreo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOAV23Tipdefcod ;
   private short wcpOAV24TipDefcod_to ;
   private short wcpOAV28TipArtCod ;
   private short wcpOAV29TipArtCod_to ;
   private short AV23Tipdefcod ;
   private short AV24TipDefcod_to ;
   private short AV28TipArtCod ;
   private short AV29TipArtCod_to ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV21Cliente ;
   private int wcpOAV20Cliente_to ;
   private int AV21Cliente ;
   private int AV20Cliente_to ;
   private int idxLst ;
   private String wcpOAV22Emprcod ;
   private String wcpOAV25Maqcod ;
   private String wcpOAV27MaqCod_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV22Emprcod ;
   private String AV25Maqcod ;
   private String AV27MaqCod_to ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informehistoricoreoperadosresumencliente_Objectcall ;
   private String Informehistoricoreoperadosresumencliente_Type ;
   private String Informehistoricoreoperadosresumencliente_Charttype ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String TempTags ;
   private String AV5QueryViewerOutputType ;
   private String AV6QueryViewerChartType ;
   private String Informehistoricoreoperadosresumencliente_Title ;
   private String Informehistoricoreoperadosresumencliente_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV32Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV33Emprnom ;
   private String GXv_char3[] ;
   private String AV34Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV22Emprcod ;
   private String sCtrlAV21Cliente ;
   private String sCtrlAV20Cliente_to ;
   private String sCtrlAV19HisreoFec ;
   private String sCtrlAV18HisreoFec_to ;
   private String sCtrlAV23Tipdefcod ;
   private String sCtrlAV24TipDefcod_to ;
   private String sCtrlAV25Maqcod ;
   private String sCtrlAV27MaqCod_to ;
   private String sCtrlAV28TipArtCod ;
   private String sCtrlAV29TipArtCod_to ;
   private String sCtrlAV17Hisestreo ;
   private java.util.Date wcpOAV19HisreoFec ;
   private java.util.Date wcpOAV18HisreoFec_to ;
   private java.util.Date AV19HisreoFec ;
   private java.util.Date AV18HisreoFec_to ;
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
   private com.genexus.webpanels.GXUserControl ucInformehistoricoreoperadosresumencliente ;
   private HTMLChoice cmbavQueryvieweroutputtype ;
   private HTMLChoice cmbavQueryviewercharttype ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV7Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV8Parameters ;
   private app.SdtQueryViewerDragAndDropData AV11DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV12FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV9ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV14ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV10ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV13ItemExpandData ;
}

