package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tiempomedioentrega_lab_wc_impl extends GXWebComponent
{
   public tiempomedioentrega_lab_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tiempomedioentrega_lab_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiempomedioentrega_lab_wc_impl.class ));
   }

   public tiempomedioentrega_lab_wc_impl( int remoteHandle ,
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
               AV27Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Emprcod", AV27Emprcod);
               AV17Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
               AV18CLicod_to = (int)(GXutil.lval( httpContext.GetPar( "CLicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18CLicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CLicod_to), 6, 0));
               AV19Lb_Artcod = httpContext.GetPar( "Lb_Artcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Lb_Artcod", AV19Lb_Artcod);
               AV20Lb_Artcod_to = httpContext.GetPar( "Lb_Artcod_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Lb_Artcod_to", AV20Lb_Artcod_to);
               AV21Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Lb_Cartaz", AV21Lb_Cartaz);
               AV22Lb_Cartaz_to = httpContext.GetPar( "Lb_Cartaz_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Lb_Cartaz_to", AV22Lb_Cartaz_to);
               AV23Lb_FechaE = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaE")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_FechaE", localUtil.format(AV23Lb_FechaE, "99/99/99"));
               AV24Lb_FechaE_to = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaE_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_FechaE_to", localUtil.format(AV24Lb_FechaE_to, "99/99/99"));
               AV25Lb_FechaEninout = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEninout")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Lb_FechaEninout", localUtil.format(AV25Lb_FechaEninout, "99/99/99"));
               AV26Lb_FechaEninout_to = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEninout_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_FechaEninout_to", localUtil.format(AV26Lb_FechaEninout_to, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV27Emprcod,Integer.valueOf(AV17Clicod),Integer.valueOf(AV18CLicod_to),AV19Lb_Artcod,AV20Lb_Artcod_to,AV21Lb_Cartaz,AV22Lb_Cartaz_to,AV23Lb_FechaE,AV24Lb_FechaE_to,AV25Lb_FechaEninout,AV26Lb_FechaEninout_to});
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
         pa1CK2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Tiempo Medio Entrega", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.tiempomedioentrega_lab_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV17Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18CLicod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV19Lb_Artcod)),GXutil.URLEncode(GXutil.rtrim(AV20Lb_Artcod_to)),GXutil.URLEncode(GXutil.rtrim(AV21Lb_Cartaz)),GXutil.URLEncode(GXutil.rtrim(AV22Lb_Cartaz_to)),GXutil.URLEncode(GXutil.formatDateParm(AV23Lb_FechaE)),GXutil.URLEncode(GXutil.formatDateParm(AV24Lb_FechaE_to)),GXutil.URLEncode(GXutil.formatDateParm(AV25Lb_FechaEninout)),GXutil.URLEncode(GXutil.formatDateParm(AV26Lb_FechaEninout_to))}, new String[] {"Emprcod","Clicod","CLicod_to","Lb_Artcod","Lb_Artcod_to","Lb_Cartaz","Lb_Cartaz_to","Lb_FechaE","Lb_FechaE_to","Lb_FechaEninout","Lb_FechaEninout_to"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27Emprcod", GXutil.rtrim( wcpOAV27Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV17Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18CLicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV18CLicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Lb_Artcod", GXutil.rtrim( wcpOAV19Lb_Artcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20Lb_Artcod_to", GXutil.rtrim( wcpOAV20Lb_Artcod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21Lb_Cartaz", GXutil.rtrim( wcpOAV21Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22Lb_Cartaz_to", GXutil.rtrim( wcpOAV22Lb_Cartaz_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Lb_FechaE", localUtil.dtoc( wcpOAV23Lb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24Lb_FechaE_to", localUtil.dtoc( wcpOAV24Lb_FechaE_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Lb_FechaEninout", localUtil.dtoc( wcpOAV25Lb_FechaEninout, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Lb_FechaEninout_to", localUtil.dtoc( wcpOAV26Lb_FechaEninout_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV27Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV17Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV18CLicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ARTCOD", GXutil.rtrim( AV19Lb_Artcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ARTCOD_TO", GXutil.rtrim( AV20Lb_Artcod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZ", GXutil.rtrim( AV21Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZ_TO", GXutil.rtrim( AV22Lb_Cartaz_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAE", localUtil.dtoc( AV23Lb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAE_TO", localUtil.dtoc( AV24Lb_FechaE_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAENINOUT", localUtil.dtoc( AV25Lb_FechaEninout, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAENINOUT_TO", localUtil.dtoc( AV26Lb_FechaEninout_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIEMPOMEDIOENTREGA_LAB_Objectcall", GXutil.rtrim( Tiempomedioentrega_lab_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIEMPOMEDIOENTREGA_LAB_Objectcall", GXutil.rtrim( Tiempomedioentrega_lab_Objectcall));
   }

   public void renderHtmlCloseForm1CK2( )
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
      return "GestionLaboratorio.TiempoMedioEntrega_LAB_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tiempo Medio Entrega", "") ;
   }

   public void wb1CK0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.tiempomedioentrega_lab_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucTiempomedioentrega_lab.setProperty("Elements", AV7Elements);
         ucTiempomedioentrega_lab.setProperty("Parameters", AV8Parameters);
         ucTiempomedioentrega_lab.setProperty("Title", Tiempomedioentrega_lab_Title);
         ucTiempomedioentrega_lab.setProperty("ItemClickData", AV9ItemClickData);
         ucTiempomedioentrega_lab.setProperty("ItemDoubleClickData", AV10ItemDoubleClickData);
         ucTiempomedioentrega_lab.setProperty("DragAndDropData", AV11DragAndDropData);
         ucTiempomedioentrega_lab.setProperty("FilterChangedData", AV12FilterChangedData);
         ucTiempomedioentrega_lab.setProperty("ItemExpandData", AV13ItemExpandData);
         ucTiempomedioentrega_lab.setProperty("ItemCollapseData", AV14ItemCollapseData);
         ucTiempomedioentrega_lab.render(context, "queryviewer", Tiempomedioentrega_lab_Internalname, sPrefix+"TIEMPOMEDIOENTREGA_LABContainer");
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

   public void start1CK2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Tiempo Medio Entrega", ""), (short)(0)) ;
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
            strup1CK0( ) ;
         }
      }
   }

   public void ws1CK2( )
   {
      start1CK2( ) ;
      evt1CK2( ) ;
   }

   public void evt1CK2( )
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
                              strup1CK0( ) ;
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
                              strup1CK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111CK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1CK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e121CK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1CK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e131CK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1CK0( ) ;
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
                              strup1CK0( ) ;
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

   public void we1CK2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1CK2( ) ;
         }
      }
   }

   public void pa1CK2( )
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
      rf1CK2( ) ;
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

   public void rf1CK2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e121CK2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131CK2 ();
         wb1CK0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1CK2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1CK0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111CK2 ();
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
         wcpOAV27Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV27Emprcod") ;
         wcpOAV17Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV18CLicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18CLicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19Lb_Artcod = httpContext.cgiGet( sPrefix+"wcpOAV19Lb_Artcod") ;
         wcpOAV20Lb_Artcod_to = httpContext.cgiGet( sPrefix+"wcpOAV20Lb_Artcod_to") ;
         wcpOAV21Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV21Lb_Cartaz") ;
         wcpOAV22Lb_Cartaz_to = httpContext.cgiGet( sPrefix+"wcpOAV22Lb_Cartaz_to") ;
         wcpOAV23Lb_FechaE = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23Lb_FechaE"), 0) ;
         wcpOAV24Lb_FechaE_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24Lb_FechaE_to"), 0) ;
         wcpOAV25Lb_FechaEninout = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV25Lb_FechaEninout"), 0) ;
         wcpOAV26Lb_FechaEninout_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26Lb_FechaEninout_to"), 0) ;
         Tiempomedioentrega_lab_Objectcall = httpContext.cgiGet( sPrefix+"TIEMPOMEDIOENTREGA_LAB_Objectcall") ;
         Tiempomedioentrega_lab_Objectcall = httpContext.cgiGet( sPrefix+"TIEMPOMEDIOENTREGA_LAB_Objectcall") ;
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
      e111CK2 ();
      if (returnInSub) return;
   }

   public void e111CK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV30Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tiempomedioentrega_lab_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Station = GXt_char1 ;
      GXv_char2[0] = AV27Emprcod ;
      GXv_char3[0] = AV31Emprnom ;
      GXv_char4[0] = AV32Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      tiempomedioentrega_lab_wc_impl.this.AV27Emprcod = GXv_char2[0] ;
      tiempomedioentrega_lab_wc_impl.this.AV31Emprnom = GXv_char3[0] ;
      tiempomedioentrega_lab_wc_impl.this.AV32Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Emprcod", AV27Emprcod);
   }

   public void e121CK2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Tiempomedioentrega_lab_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "GestionLaboratorio\\TiempoMedioEntrega_LAB_DP")+"\", \""+GXutil.encodeJSON( AV27Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV17Clicod, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV18CLicod_to, 6, 0))+"\", \""+GXutil.encodeJSON( AV19Lb_Artcod)+"\", \""+GXutil.encodeJSON( AV20Lb_Artcod_to)+"\", \""+GXutil.encodeJSON( AV21Lb_Cartaz)+"\", \""+GXutil.encodeJSON( AV22Lb_Cartaz_to)+"\", \""+GXutil.encodeJSON( localUtil.format(AV23Lb_FechaE, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV24Lb_FechaE_to, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV25Lb_FechaEninout, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV26Lb_FechaEninout_to, "99/99/99"))+"\" ]" ;
      ucTiempomedioentrega_lab.sendProperty(context, sPrefix, false, Tiempomedioentrega_lab_Internalname, "Object", Tiempomedioentrega_lab_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131CK2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV27Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Emprcod", AV27Emprcod);
      AV17Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
      AV18CLicod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18CLicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CLicod_to), 6, 0));
      AV19Lb_Artcod = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Lb_Artcod", AV19Lb_Artcod);
      AV20Lb_Artcod_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Lb_Artcod_to", AV20Lb_Artcod_to);
      AV21Lb_Cartaz = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Lb_Cartaz", AV21Lb_Cartaz);
      AV22Lb_Cartaz_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Lb_Cartaz_to", AV22Lb_Cartaz_to);
      AV23Lb_FechaE = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_FechaE", localUtil.format(AV23Lb_FechaE, "99/99/99"));
      AV24Lb_FechaE_to = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_FechaE_to", localUtil.format(AV24Lb_FechaE_to, "99/99/99"));
      AV25Lb_FechaEninout = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Lb_FechaEninout", localUtil.format(AV25Lb_FechaEninout, "99/99/99"));
      AV26Lb_FechaEninout_to = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_FechaEninout_to", localUtil.format(AV26Lb_FechaEninout_to, "99/99/99"));
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
      pa1CK2( ) ;
      ws1CK2( ) ;
      we1CK2( ) ;
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
      sCtrlAV27Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV17Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV18CLicod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV19Lb_Artcod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV20Lb_Artcod_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV21Lb_Cartaz = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV22Lb_Cartaz_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV23Lb_FechaE = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV24Lb_FechaE_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV25Lb_FechaEninout = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV26Lb_FechaEninout_to = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1CK2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\tiempomedioentrega_lab_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1CK2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV27Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Emprcod", AV27Emprcod);
         AV17Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
         AV18CLicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18CLicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CLicod_to), 6, 0));
         AV19Lb_Artcod = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Lb_Artcod", AV19Lb_Artcod);
         AV20Lb_Artcod_to = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Lb_Artcod_to", AV20Lb_Artcod_to);
         AV21Lb_Cartaz = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Lb_Cartaz", AV21Lb_Cartaz);
         AV22Lb_Cartaz_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Lb_Cartaz_to", AV22Lb_Cartaz_to);
         AV23Lb_FechaE = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_FechaE", localUtil.format(AV23Lb_FechaE, "99/99/99"));
         AV24Lb_FechaE_to = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_FechaE_to", localUtil.format(AV24Lb_FechaE_to, "99/99/99"));
         AV25Lb_FechaEninout = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Lb_FechaEninout", localUtil.format(AV25Lb_FechaEninout, "99/99/99"));
         AV26Lb_FechaEninout_to = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_FechaEninout_to", localUtil.format(AV26Lb_FechaEninout_to, "99/99/99"));
      }
      wcpOAV27Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV27Emprcod") ;
      wcpOAV17Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV18CLicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18CLicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19Lb_Artcod = httpContext.cgiGet( sPrefix+"wcpOAV19Lb_Artcod") ;
      wcpOAV20Lb_Artcod_to = httpContext.cgiGet( sPrefix+"wcpOAV20Lb_Artcod_to") ;
      wcpOAV21Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV21Lb_Cartaz") ;
      wcpOAV22Lb_Cartaz_to = httpContext.cgiGet( sPrefix+"wcpOAV22Lb_Cartaz_to") ;
      wcpOAV23Lb_FechaE = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23Lb_FechaE"), 0) ;
      wcpOAV24Lb_FechaE_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24Lb_FechaE_to"), 0) ;
      wcpOAV25Lb_FechaEninout = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV25Lb_FechaEninout"), 0) ;
      wcpOAV26Lb_FechaEninout_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26Lb_FechaEninout_to"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV27Emprcod, wcpOAV27Emprcod) != 0 ) || ( AV17Clicod != wcpOAV17Clicod ) || ( AV18CLicod_to != wcpOAV18CLicod_to ) || ( GXutil.strcmp(AV19Lb_Artcod, wcpOAV19Lb_Artcod) != 0 ) || ( GXutil.strcmp(AV20Lb_Artcod_to, wcpOAV20Lb_Artcod_to) != 0 ) || ( GXutil.strcmp(AV21Lb_Cartaz, wcpOAV21Lb_Cartaz) != 0 ) || ( GXutil.strcmp(AV22Lb_Cartaz_to, wcpOAV22Lb_Cartaz_to) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV23Lb_FechaE), GXutil.resetTime(wcpOAV23Lb_FechaE)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV24Lb_FechaE_to), GXutil.resetTime(wcpOAV24Lb_FechaE_to)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV25Lb_FechaEninout), GXutil.resetTime(wcpOAV25Lb_FechaEninout)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV26Lb_FechaEninout_to), GXutil.resetTime(wcpOAV26Lb_FechaEninout_to)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV27Emprcod = AV27Emprcod ;
      wcpOAV17Clicod = AV17Clicod ;
      wcpOAV18CLicod_to = AV18CLicod_to ;
      wcpOAV19Lb_Artcod = AV19Lb_Artcod ;
      wcpOAV20Lb_Artcod_to = AV20Lb_Artcod_to ;
      wcpOAV21Lb_Cartaz = AV21Lb_Cartaz ;
      wcpOAV22Lb_Cartaz_to = AV22Lb_Cartaz_to ;
      wcpOAV23Lb_FechaE = AV23Lb_FechaE ;
      wcpOAV24Lb_FechaE_to = AV24Lb_FechaE_to ;
      wcpOAV25Lb_FechaEninout = AV25Lb_FechaEninout ;
      wcpOAV26Lb_FechaEninout_to = AV26Lb_FechaEninout_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV27Emprcod = httpContext.cgiGet( sPrefix+"AV27Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV27Emprcod) > 0 )
      {
         AV27Emprcod = httpContext.cgiGet( sCtrlAV27Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Emprcod", AV27Emprcod);
      }
      else
      {
         AV27Emprcod = httpContext.cgiGet( sPrefix+"AV27Emprcod_PARM") ;
      }
      sCtrlAV17Clicod = httpContext.cgiGet( sPrefix+"AV17Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV17Clicod) > 0 )
      {
         AV17Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV17Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
      }
      else
      {
         AV17Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV17Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV18CLicod_to = httpContext.cgiGet( sPrefix+"AV18CLicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV18CLicod_to) > 0 )
      {
         AV18CLicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV18CLicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18CLicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CLicod_to), 6, 0));
      }
      else
      {
         AV18CLicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV18CLicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19Lb_Artcod = httpContext.cgiGet( sPrefix+"AV19Lb_Artcod_CTRL") ;
      if ( GXutil.len( sCtrlAV19Lb_Artcod) > 0 )
      {
         AV19Lb_Artcod = httpContext.cgiGet( sCtrlAV19Lb_Artcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Lb_Artcod", AV19Lb_Artcod);
      }
      else
      {
         AV19Lb_Artcod = httpContext.cgiGet( sPrefix+"AV19Lb_Artcod_PARM") ;
      }
      sCtrlAV20Lb_Artcod_to = httpContext.cgiGet( sPrefix+"AV20Lb_Artcod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV20Lb_Artcod_to) > 0 )
      {
         AV20Lb_Artcod_to = httpContext.cgiGet( sCtrlAV20Lb_Artcod_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Lb_Artcod_to", AV20Lb_Artcod_to);
      }
      else
      {
         AV20Lb_Artcod_to = httpContext.cgiGet( sPrefix+"AV20Lb_Artcod_to_PARM") ;
      }
      sCtrlAV21Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV21Lb_Cartaz_CTRL") ;
      if ( GXutil.len( sCtrlAV21Lb_Cartaz) > 0 )
      {
         AV21Lb_Cartaz = httpContext.cgiGet( sCtrlAV21Lb_Cartaz) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Lb_Cartaz", AV21Lb_Cartaz);
      }
      else
      {
         AV21Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV21Lb_Cartaz_PARM") ;
      }
      sCtrlAV22Lb_Cartaz_to = httpContext.cgiGet( sPrefix+"AV22Lb_Cartaz_to_CTRL") ;
      if ( GXutil.len( sCtrlAV22Lb_Cartaz_to) > 0 )
      {
         AV22Lb_Cartaz_to = httpContext.cgiGet( sCtrlAV22Lb_Cartaz_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Lb_Cartaz_to", AV22Lb_Cartaz_to);
      }
      else
      {
         AV22Lb_Cartaz_to = httpContext.cgiGet( sPrefix+"AV22Lb_Cartaz_to_PARM") ;
      }
      sCtrlAV23Lb_FechaE = httpContext.cgiGet( sPrefix+"AV23Lb_FechaE_CTRL") ;
      if ( GXutil.len( sCtrlAV23Lb_FechaE) > 0 )
      {
         AV23Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV23Lb_FechaE), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_FechaE", localUtil.format(AV23Lb_FechaE, "99/99/99"));
      }
      else
      {
         AV23Lb_FechaE = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV23Lb_FechaE_PARM"), 0) ;
      }
      sCtrlAV24Lb_FechaE_to = httpContext.cgiGet( sPrefix+"AV24Lb_FechaE_to_CTRL") ;
      if ( GXutil.len( sCtrlAV24Lb_FechaE_to) > 0 )
      {
         AV24Lb_FechaE_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV24Lb_FechaE_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_FechaE_to", localUtil.format(AV24Lb_FechaE_to, "99/99/99"));
      }
      else
      {
         AV24Lb_FechaE_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV24Lb_FechaE_to_PARM"), 0) ;
      }
      sCtrlAV25Lb_FechaEninout = httpContext.cgiGet( sPrefix+"AV25Lb_FechaEninout_CTRL") ;
      if ( GXutil.len( sCtrlAV25Lb_FechaEninout) > 0 )
      {
         AV25Lb_FechaEninout = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV25Lb_FechaEninout), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Lb_FechaEninout", localUtil.format(AV25Lb_FechaEninout, "99/99/99"));
      }
      else
      {
         AV25Lb_FechaEninout = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV25Lb_FechaEninout_PARM"), 0) ;
      }
      sCtrlAV26Lb_FechaEninout_to = httpContext.cgiGet( sPrefix+"AV26Lb_FechaEninout_to_CTRL") ;
      if ( GXutil.len( sCtrlAV26Lb_FechaEninout_to) > 0 )
      {
         AV26Lb_FechaEninout_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV26Lb_FechaEninout_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_FechaEninout_to", localUtil.format(AV26Lb_FechaEninout_to, "99/99/99"));
      }
      else
      {
         AV26Lb_FechaEninout_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV26Lb_FechaEninout_to_PARM"), 0) ;
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
      pa1CK2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1CK2( ) ;
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
      ws1CK2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Emprcod_PARM", GXutil.rtrim( AV27Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Emprcod_CTRL", GXutil.rtrim( sCtrlAV27Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV17Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Clicod_CTRL", GXutil.rtrim( sCtrlAV17Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18CLicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV18CLicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18CLicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18CLicod_to_CTRL", GXutil.rtrim( sCtrlAV18CLicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Lb_Artcod_PARM", GXutil.rtrim( AV19Lb_Artcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Lb_Artcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Lb_Artcod_CTRL", GXutil.rtrim( sCtrlAV19Lb_Artcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Lb_Artcod_to_PARM", GXutil.rtrim( AV20Lb_Artcod_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20Lb_Artcod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Lb_Artcod_to_CTRL", GXutil.rtrim( sCtrlAV20Lb_Artcod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Lb_Cartaz_PARM", GXutil.rtrim( AV21Lb_Cartaz));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21Lb_Cartaz)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Lb_Cartaz_CTRL", GXutil.rtrim( sCtrlAV21Lb_Cartaz));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Lb_Cartaz_to_PARM", GXutil.rtrim( AV22Lb_Cartaz_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22Lb_Cartaz_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Lb_Cartaz_to_CTRL", GXutil.rtrim( sCtrlAV22Lb_Cartaz_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Lb_FechaE_PARM", localUtil.dtoc( AV23Lb_FechaE, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Lb_FechaE)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Lb_FechaE_CTRL", GXutil.rtrim( sCtrlAV23Lb_FechaE));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Lb_FechaE_to_PARM", localUtil.dtoc( AV24Lb_FechaE_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24Lb_FechaE_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Lb_FechaE_to_CTRL", GXutil.rtrim( sCtrlAV24Lb_FechaE_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Lb_FechaEninout_PARM", localUtil.dtoc( AV25Lb_FechaEninout, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Lb_FechaEninout)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Lb_FechaEninout_CTRL", GXutil.rtrim( sCtrlAV25Lb_FechaEninout));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Lb_FechaEninout_to_PARM", localUtil.dtoc( AV26Lb_FechaEninout_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Lb_FechaEninout_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Lb_FechaEninout_to_CTRL", GXutil.rtrim( sCtrlAV26Lb_FechaEninout_to));
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
      we1CK2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015561949", true, true);
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
         httpContext.AddJavascriptSource("gestionlaboratorio/tiempomedioentrega_lab_wc.js", "?202661015561950", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Tiempomedioentrega_lab_Internalname = sPrefix+"TIEMPOMEDIOENTREGA_LAB" ;
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
      Tiempomedioentrega_lab_Title = "" ;
      Tiempomedioentrega_lab_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV18CLicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV19Lb_Artcod',fld:'vLB_ARTCOD',pic:''},{av:'AV20Lb_Artcod_to',fld:'vLB_ARTCOD_TO',pic:''},{av:'AV21Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV22Lb_Cartaz_to',fld:'vLB_CARTAZ_TO',pic:''},{av:'AV23Lb_FechaE',fld:'vLB_FECHAE',pic:''},{av:'AV24Lb_FechaE_to',fld:'vLB_FECHAE_TO',pic:''},{av:'AV25Lb_FechaEninout',fld:'vLB_FECHAENINOUT',pic:''},{av:'AV26Lb_FechaEninout_to',fld:'vLB_FECHAENINOUT_TO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'TIEMPOMEDIOENTREGA_LAB'}]}");
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
      wcpOAV27Emprcod = "" ;
      wcpOAV19Lb_Artcod = "" ;
      wcpOAV20Lb_Artcod_to = "" ;
      wcpOAV21Lb_Cartaz = "" ;
      wcpOAV22Lb_Cartaz_to = "" ;
      wcpOAV23Lb_FechaE = GXutil.nullDate() ;
      wcpOAV24Lb_FechaE_to = GXutil.nullDate() ;
      wcpOAV25Lb_FechaEninout = GXutil.nullDate() ;
      wcpOAV26Lb_FechaEninout_to = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV27Emprcod = "" ;
      AV19Lb_Artcod = "" ;
      AV20Lb_Artcod_to = "" ;
      AV21Lb_Cartaz = "" ;
      AV22Lb_Cartaz_to = "" ;
      AV23Lb_FechaE = GXutil.nullDate() ;
      AV24Lb_FechaE_to = GXutil.nullDate() ;
      AV25Lb_FechaEninout = GXutil.nullDate() ;
      AV26Lb_FechaEninout_to = GXutil.nullDate() ;
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
      ucTiempomedioentrega_lab = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV30Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV31Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV32Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV27Emprcod = "" ;
      sCtrlAV17Clicod = "" ;
      sCtrlAV18CLicod_to = "" ;
      sCtrlAV19Lb_Artcod = "" ;
      sCtrlAV20Lb_Artcod_to = "" ;
      sCtrlAV21Lb_Cartaz = "" ;
      sCtrlAV22Lb_Cartaz_to = "" ;
      sCtrlAV23Lb_FechaE = "" ;
      sCtrlAV24Lb_FechaE_to = "" ;
      sCtrlAV25Lb_FechaEninout = "" ;
      sCtrlAV26Lb_FechaEninout_to = "" ;
      /* GeneXus formulas. */
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
   private int wcpOAV17Clicod ;
   private int wcpOAV18CLicod_to ;
   private int AV17Clicod ;
   private int AV18CLicod_to ;
   private int idxLst ;
   private String wcpOAV27Emprcod ;
   private String wcpOAV19Lb_Artcod ;
   private String wcpOAV20Lb_Artcod_to ;
   private String wcpOAV21Lb_Cartaz ;
   private String wcpOAV22Lb_Cartaz_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV27Emprcod ;
   private String AV19Lb_Artcod ;
   private String AV20Lb_Artcod_to ;
   private String AV21Lb_Cartaz ;
   private String AV22Lb_Cartaz_to ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Tiempomedioentrega_lab_Objectcall ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Tiempomedioentrega_lab_Title ;
   private String Tiempomedioentrega_lab_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV30Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV31Emprnom ;
   private String GXv_char3[] ;
   private String AV32Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV27Emprcod ;
   private String sCtrlAV17Clicod ;
   private String sCtrlAV18CLicod_to ;
   private String sCtrlAV19Lb_Artcod ;
   private String sCtrlAV20Lb_Artcod_to ;
   private String sCtrlAV21Lb_Cartaz ;
   private String sCtrlAV22Lb_Cartaz_to ;
   private String sCtrlAV23Lb_FechaE ;
   private String sCtrlAV24Lb_FechaE_to ;
   private String sCtrlAV25Lb_FechaEninout ;
   private String sCtrlAV26Lb_FechaEninout_to ;
   private java.util.Date wcpOAV23Lb_FechaE ;
   private java.util.Date wcpOAV24Lb_FechaE_to ;
   private java.util.Date wcpOAV25Lb_FechaEninout ;
   private java.util.Date wcpOAV26Lb_FechaEninout_to ;
   private java.util.Date AV23Lb_FechaE ;
   private java.util.Date AV24Lb_FechaE_to ;
   private java.util.Date AV25Lb_FechaEninout ;
   private java.util.Date AV26Lb_FechaEninout_to ;
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
   private com.genexus.webpanels.GXUserControl ucTiempomedioentrega_lab ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV7Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV8Parameters ;
   private app.SdtQueryViewerDragAndDropData AV11DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV12FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV9ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV14ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV10ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV13ItemExpandData ;
}

