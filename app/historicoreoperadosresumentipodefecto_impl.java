package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoreoperadosresumentipodefecto_impl extends GXWebComponent
{
   public historicoreoperadosresumentipodefecto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public historicoreoperadosresumentipodefecto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoreoperadosresumentipodefecto_impl.class ));
   }

   public historicoreoperadosresumentipodefecto_impl( int remoteHandle ,
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
               AV28Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
               AV17Cliente = (int)(GXutil.lval( httpContext.GetPar( "Cliente"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Cliente), 6, 0));
               AV18Cliente_to = (int)(GXutil.lval( httpContext.GetPar( "Cliente_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Cliente_to), 6, 0));
               AV20HisreoFec = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HisreoFec", localUtil.format(AV20HisreoFec, "99/99/99"));
               AV21HisreoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisreoFec_to", localUtil.format(AV21HisreoFec_to, "99/99/99"));
               AV26Tipdefcod = (short)(GXutil.lval( httpContext.GetPar( "Tipdefcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tipdefcod), 4, 0));
               AV27TipDefcod_to = (short)(GXutil.lval( httpContext.GetPar( "TipDefcod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipDefcod_to), 4, 0));
               AV22Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Maqcod", AV22Maqcod);
               AV23MaqCod_to = httpContext.GetPar( "MaqCod_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod_to", AV23MaqCod_to);
               AV24TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipArtCod), 4, 0));
               AV25TipArtCod_to = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TipArtCod_to), 4, 0));
               AV19Hisestreo = (byte)(GXutil.lval( httpContext.GetPar( "Hisestreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisestreo", GXutil.str( AV19Hisestreo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,Integer.valueOf(AV17Cliente),Integer.valueOf(AV18Cliente_to),AV20HisreoFec,AV21HisreoFec_to,Short.valueOf(AV26Tipdefcod),Short.valueOf(AV27TipDefcod_to),AV22Maqcod,AV23MaqCod_to,Short.valueOf(AV24TipArtCod),Short.valueOf(AV25TipArtCod_to),Byte.valueOf(AV19Hisestreo)});
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
         pa15Q2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico Reoperados Resumen Tipo Defecto", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.historicoreoperadosresumentipodefecto", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV17Cliente,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18Cliente_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV20HisreoFec)),GXutil.URLEncode(GXutil.formatDateParm(AV21HisreoFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV26Tipdefcod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27TipDefcod_to,4,0)),GXutil.URLEncode(GXutil.rtrim(AV22Maqcod)),GXutil.URLEncode(GXutil.rtrim(AV23MaqCod_to)),GXutil.URLEncode(GXutil.ltrimstr(AV24TipArtCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25TipArtCod_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19Hisestreo,1,0))}, new String[] {"Emprcod","Cliente","Cliente_to","HisreoFec","HisreoFec_to","Tipdefcod","TipDefcod_to","Maqcod","MaqCod_to","TipArtCod","TipArtCod_to","Hisestreo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Emprcod", GXutil.rtrim( wcpOAV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Cliente", GXutil.ltrim( localUtil.ntoc( wcpOAV17Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18Cliente_to", GXutil.ltrim( localUtil.ntoc( wcpOAV18Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20HisreoFec", localUtil.dtoc( wcpOAV20HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21HisreoFec_to", localUtil.dtoc( wcpOAV21HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Tipdefcod", GXutil.ltrim( localUtil.ntoc( wcpOAV26Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27TipDefcod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV27TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22Maqcod", GXutil.rtrim( wcpOAV22Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23MaqCod_to", GXutil.rtrim( wcpOAV23MaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24TipArtCod", GXutil.ltrim( localUtil.ntoc( wcpOAV24TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25TipArtCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV25TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Hisestreo", GXutil.ltrim( localUtil.ntoc( wcpOAV19Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTE", GXutil.ltrim( localUtil.ntoc( AV17Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTE_TO", GXutil.ltrim( localUtil.ntoc( AV18Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC", localUtil.dtoc( AV20HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC_TO", localUtil.dtoc( AV21HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDEFCOD", GXutil.ltrim( localUtil.ntoc( AV26Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDEFCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV22Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD_TO", GXutil.rtrim( AV23MaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV24TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV25TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV19Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Objectcall", GXutil.rtrim( Informehistoricoreoperadosresumentipodefecto_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Objectcall", GXutil.rtrim( Informehistoricoreoperadosresumentipodefecto_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Type", GXutil.rtrim( Informehistoricoreoperadosresumentipodefecto_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Charttype", GXutil.rtrim( Informehistoricoreoperadosresumentipodefecto_Charttype));
   }

   public void renderHtmlCloseForm15Q2( )
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
      return "HistoricoReoperadosResumenTipoDefecto" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico Reoperados Resumen Tipo Defecto", "") ;
   }

   public void wb15Q0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.historicoreoperadosresumentipodefecto");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryvieweroutputtype, cmbavQueryvieweroutputtype.getInternalname(), GXutil.rtrim( AV5QueryViewerOutputType), 1, cmbavQueryvieweroutputtype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryvieweroutputtype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,17);\"", "", false, (byte)(0), "HLP_HistoricoReoperadosResumenTipoDefecto.htm");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryviewercharttype, cmbavQueryviewercharttype.getInternalname(), GXutil.rtrim( AV6QueryViewerChartType), 1, cmbavQueryviewercharttype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryviewercharttype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,21);\"", "", false, (byte)(0), "HLP_HistoricoReoperadosResumenTipoDefecto.htm");
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
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("Elements", AV7Elements);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("Parameters", AV8Parameters);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("Title", Informehistoricoreoperadosresumentipodefecto_Title);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("ItemClickData", AV9ItemClickData);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("ItemDoubleClickData", AV10ItemDoubleClickData);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("DragAndDropData", AV11DragAndDropData);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("FilterChangedData", AV12FilterChangedData);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("ItemExpandData", AV13ItemExpandData);
         ucInformehistoricoreoperadosresumentipodefecto.setProperty("ItemCollapseData", AV14ItemCollapseData);
         ucInformehistoricoreoperadosresumentipodefecto.render(context, "queryviewer", Informehistoricoreoperadosresumentipodefecto_Internalname, sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTOContainer");
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

   public void start15Q2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico Reoperados Resumen Tipo Defecto", ""), (short)(0)) ;
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
            strup15Q0( ) ;
         }
      }
   }

   public void ws15Q2( )
   {
      start15Q2( ) ;
      evt15Q2( ) ;
   }

   public void evt15Q2( )
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
                              strup15Q0( ) ;
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
                              strup15Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1115Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1215Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1315Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1415Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1515Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Q0( ) ;
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
                              strup15Q0( ) ;
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

   public void we15Q2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm15Q2( ) ;
         }
      }
   }

   public void pa15Q2( )
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
      rf15Q2( ) ;
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

   public void rf15Q2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1415Q2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1515Q2 ();
         wb15Q0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15Q2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup15Q0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1115Q2 ();
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
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV17Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17Cliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV18Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18Cliente_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV20HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20HisreoFec"), 0) ;
         wcpOAV21HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21HisreoFec_to"), 0) ;
         wcpOAV26Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26Tipdefcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV27TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27TipDefcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV22Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV22Maqcod") ;
         wcpOAV23MaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCod_to") ;
         wcpOAV24TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV25TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Informehistoricoreoperadosresumentipodefecto_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Objectcall") ;
         Informehistoricoreoperadosresumentipodefecto_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Objectcall") ;
         Informehistoricoreoperadosresumentipodefecto_Type = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Type") ;
         Informehistoricoreoperadosresumentipodefecto_Charttype = httpContext.cgiGet( sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO_Charttype") ;
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
      e1115Q2 ();
      if (returnInSub) return;
   }

   public void e1115Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5QueryViewerOutputType = "PivotTable" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5QueryViewerOutputType", AV5QueryViewerOutputType);
      AV6QueryViewerChartType = "Bar" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6QueryViewerChartType", AV6QueryViewerChartType);
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      historicoreoperadosresumentipodefecto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV32Emprnom ;
      GXv_char4[0] = AV33Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      historicoreoperadosresumentipodefecto_impl.this.AV28Emprcod = GXv_char2[0] ;
      historicoreoperadosresumentipodefecto_impl.this.AV32Emprnom = GXv_char3[0] ;
      historicoreoperadosresumentipodefecto_impl.this.AV33Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
   }

   public void e1215Q2( )
   {
      /* Queryviewercharttype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e1315Q2( )
   {
      /* Queryvieweroutputtype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e1415Q2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Informehistoricoreoperadosresumentipodefecto_Type = AV5QueryViewerOutputType ;
      ucInformehistoricoreoperadosresumentipodefecto.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumentipodefecto_Internalname, "Type", Informehistoricoreoperadosresumentipodefecto_Type);
      Informehistoricoreoperadosresumentipodefecto_Charttype = AV6QueryViewerChartType ;
      ucInformehistoricoreoperadosresumentipodefecto.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumentipodefecto_Internalname, "ChartType", Informehistoricoreoperadosresumentipodefecto_Charttype);
      Informehistoricoreoperadosresumentipodefecto_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPHistoricoReoperadosResumenTipoDefecto")+"\", \""+GXutil.encodeJSON( AV28Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV17Cliente, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV18Cliente_to, 6, 0))+"\", \""+GXutil.encodeJSON( localUtil.format(AV20HisreoFec, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV21HisreoFec_to, "99/99/99"))+"\", \""+GXutil.encodeJSON( GXutil.str( AV26Tipdefcod, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV27TipDefcod_to, 4, 0))+"\", \""+GXutil.encodeJSON( AV22Maqcod)+"\", \""+GXutil.encodeJSON( AV23MaqCod_to)+"\", \""+GXutil.encodeJSON( GXutil.str( AV24TipArtCod, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV25TipArtCod_to, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV19Hisestreo, 1, 0))+"\" ]" ;
      ucInformehistoricoreoperadosresumentipodefecto.sendProperty(context, sPrefix, false, Informehistoricoreoperadosresumentipodefecto_Internalname, "Object", Informehistoricoreoperadosresumentipodefecto_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1515Q2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV17Cliente = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Cliente), 6, 0));
      AV18Cliente_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Cliente_to), 6, 0));
      AV20HisreoFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HisreoFec", localUtil.format(AV20HisreoFec, "99/99/99"));
      AV21HisreoFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisreoFec_to", localUtil.format(AV21HisreoFec_to, "99/99/99"));
      AV26Tipdefcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tipdefcod), 4, 0));
      AV27TipDefcod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipDefcod_to), 4, 0));
      AV22Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Maqcod", AV22Maqcod);
      AV23MaqCod_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod_to", AV23MaqCod_to);
      AV24TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipArtCod), 4, 0));
      AV25TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TipArtCod_to), 4, 0));
      AV19Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisestreo", GXutil.str( AV19Hisestreo, 1, 0));
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
      pa15Q2( ) ;
      ws15Q2( ) ;
      we15Q2( ) ;
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
      sCtrlAV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV17Cliente = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV18Cliente_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV20HisreoFec = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV21HisreoFec_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV26Tipdefcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV27TipDefcod_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV22Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV23MaqCod_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV24TipArtCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV25TipArtCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV19Hisestreo = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa15Q2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "historicoreoperadosresumentipodefecto", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa15Q2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV17Cliente = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Cliente), 6, 0));
         AV18Cliente_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Cliente_to), 6, 0));
         AV20HisreoFec = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HisreoFec", localUtil.format(AV20HisreoFec, "99/99/99"));
         AV21HisreoFec_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisreoFec_to", localUtil.format(AV21HisreoFec_to, "99/99/99"));
         AV26Tipdefcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tipdefcod), 4, 0));
         AV27TipDefcod_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipDefcod_to), 4, 0));
         AV22Maqcod = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Maqcod", AV22Maqcod);
         AV23MaqCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod_to", AV23MaqCod_to);
         AV24TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipArtCod), 4, 0));
         AV25TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TipArtCod_to), 4, 0));
         AV19Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisestreo", GXutil.str( AV19Hisestreo, 1, 0));
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV17Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17Cliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV18Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18Cliente_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV20HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20HisreoFec"), 0) ;
      wcpOAV21HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21HisreoFec_to"), 0) ;
      wcpOAV26Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26Tipdefcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV27TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27TipDefcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV22Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV22Maqcod") ;
      wcpOAV23MaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCod_to") ;
      wcpOAV24TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV25TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || ( AV17Cliente != wcpOAV17Cliente ) || ( AV18Cliente_to != wcpOAV18Cliente_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV20HisreoFec), GXutil.resetTime(wcpOAV20HisreoFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV21HisreoFec_to), GXutil.resetTime(wcpOAV21HisreoFec_to)) ) || ( AV26Tipdefcod != wcpOAV26Tipdefcod ) || ( AV27TipDefcod_to != wcpOAV27TipDefcod_to ) || ( GXutil.strcmp(AV22Maqcod, wcpOAV22Maqcod) != 0 ) || ( GXutil.strcmp(AV23MaqCod_to, wcpOAV23MaqCod_to) != 0 ) || ( AV24TipArtCod != wcpOAV24TipArtCod ) || ( AV25TipArtCod_to != wcpOAV25TipArtCod_to ) || ( AV19Hisestreo != wcpOAV19Hisestreo ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV17Cliente = AV17Cliente ;
      wcpOAV18Cliente_to = AV18Cliente_to ;
      wcpOAV20HisreoFec = AV20HisreoFec ;
      wcpOAV21HisreoFec_to = AV21HisreoFec_to ;
      wcpOAV26Tipdefcod = AV26Tipdefcod ;
      wcpOAV27TipDefcod_to = AV27TipDefcod_to ;
      wcpOAV22Maqcod = AV22Maqcod ;
      wcpOAV23MaqCod_to = AV23MaqCod_to ;
      wcpOAV24TipArtCod = AV24TipArtCod ;
      wcpOAV25TipArtCod_to = AV25TipArtCod_to ;
      wcpOAV19Hisestreo = AV19Hisestreo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV28Emprcod) > 0 )
      {
         AV28Emprcod = httpContext.cgiGet( sCtrlAV28Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      }
      else
      {
         AV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_PARM") ;
      }
      sCtrlAV17Cliente = httpContext.cgiGet( sPrefix+"AV17Cliente_CTRL") ;
      if ( GXutil.len( sCtrlAV17Cliente) > 0 )
      {
         AV17Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV17Cliente), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Cliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Cliente), 6, 0));
      }
      else
      {
         AV17Cliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV17Cliente_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV18Cliente_to = httpContext.cgiGet( sPrefix+"AV18Cliente_to_CTRL") ;
      if ( GXutil.len( sCtrlAV18Cliente_to) > 0 )
      {
         AV18Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV18Cliente_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Cliente_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Cliente_to), 6, 0));
      }
      else
      {
         AV18Cliente_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV18Cliente_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV20HisreoFec = httpContext.cgiGet( sPrefix+"AV20HisreoFec_CTRL") ;
      if ( GXutil.len( sCtrlAV20HisreoFec) > 0 )
      {
         AV20HisreoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV20HisreoFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HisreoFec", localUtil.format(AV20HisreoFec, "99/99/99"));
      }
      else
      {
         AV20HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV20HisreoFec_PARM"), 0) ;
      }
      sCtrlAV21HisreoFec_to = httpContext.cgiGet( sPrefix+"AV21HisreoFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV21HisreoFec_to) > 0 )
      {
         AV21HisreoFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV21HisreoFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisreoFec_to", localUtil.format(AV21HisreoFec_to, "99/99/99"));
      }
      else
      {
         AV21HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV21HisreoFec_to_PARM"), 0) ;
      }
      sCtrlAV26Tipdefcod = httpContext.cgiGet( sPrefix+"AV26Tipdefcod_CTRL") ;
      if ( GXutil.len( sCtrlAV26Tipdefcod) > 0 )
      {
         AV26Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV26Tipdefcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Tipdefcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tipdefcod), 4, 0));
      }
      else
      {
         AV26Tipdefcod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV26Tipdefcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV27TipDefcod_to = httpContext.cgiGet( sPrefix+"AV27TipDefcod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV27TipDefcod_to) > 0 )
      {
         AV27TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV27TipDefcod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipDefcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipDefcod_to), 4, 0));
      }
      else
      {
         AV27TipDefcod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV27TipDefcod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV22Maqcod = httpContext.cgiGet( sPrefix+"AV22Maqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV22Maqcod) > 0 )
      {
         AV22Maqcod = httpContext.cgiGet( sCtrlAV22Maqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Maqcod", AV22Maqcod);
      }
      else
      {
         AV22Maqcod = httpContext.cgiGet( sPrefix+"AV22Maqcod_PARM") ;
      }
      sCtrlAV23MaqCod_to = httpContext.cgiGet( sPrefix+"AV23MaqCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV23MaqCod_to) > 0 )
      {
         AV23MaqCod_to = httpContext.cgiGet( sCtrlAV23MaqCod_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod_to", AV23MaqCod_to);
      }
      else
      {
         AV23MaqCod_to = httpContext.cgiGet( sPrefix+"AV23MaqCod_to_PARM") ;
      }
      sCtrlAV24TipArtCod = httpContext.cgiGet( sPrefix+"AV24TipArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV24TipArtCod) > 0 )
      {
         AV24TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV24TipArtCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipArtCod), 4, 0));
      }
      else
      {
         AV24TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV24TipArtCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV25TipArtCod_to = httpContext.cgiGet( sPrefix+"AV25TipArtCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV25TipArtCod_to) > 0 )
      {
         AV25TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV25TipArtCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TipArtCod_to), 4, 0));
      }
      else
      {
         AV25TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV25TipArtCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19Hisestreo = httpContext.cgiGet( sPrefix+"AV19Hisestreo_CTRL") ;
      if ( GXutil.len( sCtrlAV19Hisestreo) > 0 )
      {
         AV19Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV19Hisestreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisestreo", GXutil.str( AV19Hisestreo, 1, 0));
      }
      else
      {
         AV19Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV19Hisestreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa15Q2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws15Q2( ) ;
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
      ws15Q2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_PARM", GXutil.rtrim( AV28Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_CTRL", GXutil.rtrim( sCtrlAV28Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Cliente_PARM", GXutil.ltrim( localUtil.ntoc( AV17Cliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Cliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Cliente_CTRL", GXutil.rtrim( sCtrlAV17Cliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Cliente_to_PARM", GXutil.ltrim( localUtil.ntoc( AV18Cliente_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18Cliente_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Cliente_to_CTRL", GXutil.rtrim( sCtrlAV18Cliente_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20HisreoFec_PARM", localUtil.dtoc( AV20HisreoFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20HisreoFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20HisreoFec_CTRL", GXutil.rtrim( sCtrlAV20HisreoFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HisreoFec_to_PARM", localUtil.dtoc( AV21HisreoFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21HisreoFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HisreoFec_to_CTRL", GXutil.rtrim( sCtrlAV21HisreoFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Tipdefcod_PARM", GXutil.ltrim( localUtil.ntoc( AV26Tipdefcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Tipdefcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Tipdefcod_CTRL", GXutil.rtrim( sCtrlAV26Tipdefcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27TipDefcod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV27TipDefcod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27TipDefcod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27TipDefcod_to_CTRL", GXutil.rtrim( sCtrlAV27TipDefcod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Maqcod_PARM", GXutil.rtrim( AV22Maqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22Maqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Maqcod_CTRL", GXutil.rtrim( sCtrlAV22Maqcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCod_to_PARM", GXutil.rtrim( AV23MaqCod_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23MaqCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCod_to_CTRL", GXutil.rtrim( sCtrlAV23MaqCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24TipArtCod_PARM", GXutil.ltrim( localUtil.ntoc( AV24TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24TipArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24TipArtCod_CTRL", GXutil.rtrim( sCtrlAV24TipArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25TipArtCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV25TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25TipArtCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25TipArtCod_to_CTRL", GXutil.rtrim( sCtrlAV25TipArtCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Hisestreo_PARM", GXutil.ltrim( localUtil.ntoc( AV19Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Hisestreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Hisestreo_CTRL", GXutil.rtrim( sCtrlAV19Hisestreo));
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
      we15Q2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015562220", true, true);
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
      httpContext.AddJavascriptSource("historicoreoperadosresumentipodefecto.js", "?202661015562220", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavQueryvieweroutputtype.setInternalname( sPrefix+"vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryviewercharttype.setInternalname( sPrefix+"vQUERYVIEWERCHARTTYPE" );
      Informehistoricoreoperadosresumentipodefecto_Internalname = sPrefix+"INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO" ;
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
      Informehistoricoreoperadosresumentipodefecto_Title = "" ;
      cmbavQueryviewercharttype.setJsonclick( "" );
      cmbavQueryviewercharttype.setEnabled( 1 );
      cmbavQueryvieweroutputtype.setJsonclick( "" );
      cmbavQueryvieweroutputtype.setEnabled( 1 );
      Informehistoricoreoperadosresumentipodefecto_Charttype = "Column" ;
      Informehistoricoreoperadosresumentipodefecto_Type = "Default" ;
      Informehistoricoreoperadosresumentipodefecto_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavQueryvieweroutputtype'},{av:'AV5QueryViewerOutputType',fld:'vQUERYVIEWEROUTPUTTYPE',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV6QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17Cliente',fld:'vCLIENTE',pic:'ZZZZZ9'},{av:'AV18Cliente_to',fld:'vCLIENTE_TO',pic:'ZZZZZ9'},{av:'AV20HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV21HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV26Tipdefcod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV27TipDefcod_to',fld:'vTIPDEFCOD_TO',pic:'ZZZ9'},{av:'AV22Maqcod',fld:'vMAQCOD',pic:''},{av:'AV23MaqCod_to',fld:'vMAQCOD_TO',pic:''},{av:'AV24TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV25TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV19Hisestreo',fld:'vHISESTREO',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'Informehistoricoreoperadosresumentipodefecto_Type',ctrl:'INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO',prop:'Type'},{av:'Informehistoricoreoperadosresumentipodefecto_Charttype',ctrl:'INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO',prop:'ChartType'},{ctrl:'INFORMEHISTORICOREOPERADOSRESUMENTIPODEFECTO'}]}");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED","{handler:'e1215Q2',iparms:[]");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED","{handler:'e1315Q2',iparms:[]");
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
      wcpOAV28Emprcod = "" ;
      wcpOAV20HisreoFec = GXutil.nullDate() ;
      wcpOAV21HisreoFec_to = GXutil.nullDate() ;
      wcpOAV22Maqcod = "" ;
      wcpOAV23MaqCod_to = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV20HisreoFec = GXutil.nullDate() ;
      AV21HisreoFec_to = GXutil.nullDate() ;
      AV22Maqcod = "" ;
      AV23MaqCod_to = "" ;
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
      ucInformehistoricoreoperadosresumentipodefecto = new com.genexus.webpanels.GXUserControl();
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
      sCtrlAV28Emprcod = "" ;
      sCtrlAV17Cliente = "" ;
      sCtrlAV18Cliente_to = "" ;
      sCtrlAV20HisreoFec = "" ;
      sCtrlAV21HisreoFec_to = "" ;
      sCtrlAV26Tipdefcod = "" ;
      sCtrlAV27TipDefcod_to = "" ;
      sCtrlAV22Maqcod = "" ;
      sCtrlAV23MaqCod_to = "" ;
      sCtrlAV24TipArtCod = "" ;
      sCtrlAV25TipArtCod_to = "" ;
      sCtrlAV19Hisestreo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV19Hisestreo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV19Hisestreo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOAV26Tipdefcod ;
   private short wcpOAV27TipDefcod_to ;
   private short wcpOAV24TipArtCod ;
   private short wcpOAV25TipArtCod_to ;
   private short AV26Tipdefcod ;
   private short AV27TipDefcod_to ;
   private short AV24TipArtCod ;
   private short AV25TipArtCod_to ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV17Cliente ;
   private int wcpOAV18Cliente_to ;
   private int AV17Cliente ;
   private int AV18Cliente_to ;
   private int idxLst ;
   private String wcpOAV28Emprcod ;
   private String wcpOAV22Maqcod ;
   private String wcpOAV23MaqCod_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV22Maqcod ;
   private String AV23MaqCod_to ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informehistoricoreoperadosresumentipodefecto_Objectcall ;
   private String Informehistoricoreoperadosresumentipodefecto_Type ;
   private String Informehistoricoreoperadosresumentipodefecto_Charttype ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String TempTags ;
   private String AV5QueryViewerOutputType ;
   private String AV6QueryViewerChartType ;
   private String Informehistoricoreoperadosresumentipodefecto_Title ;
   private String Informehistoricoreoperadosresumentipodefecto_Internalname ;
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
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV17Cliente ;
   private String sCtrlAV18Cliente_to ;
   private String sCtrlAV20HisreoFec ;
   private String sCtrlAV21HisreoFec_to ;
   private String sCtrlAV26Tipdefcod ;
   private String sCtrlAV27TipDefcod_to ;
   private String sCtrlAV22Maqcod ;
   private String sCtrlAV23MaqCod_to ;
   private String sCtrlAV24TipArtCod ;
   private String sCtrlAV25TipArtCod_to ;
   private String sCtrlAV19Hisestreo ;
   private java.util.Date wcpOAV20HisreoFec ;
   private java.util.Date wcpOAV21HisreoFec_to ;
   private java.util.Date AV20HisreoFec ;
   private java.util.Date AV21HisreoFec_to ;
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
   private com.genexus.webpanels.GXUserControl ucInformehistoricoreoperadosresumentipodefecto ;
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

