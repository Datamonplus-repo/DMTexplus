package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcdistribuciondeunidades_impl extends GXWebComponent
{
   public wcdistribuciondeunidades_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcdistribuciondeunidades_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdistribuciondeunidades_impl.class ));
   }

   public wcdistribuciondeunidades_impl( int remoteHandle ,
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
               AV10Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
               AV9ClienteInicial = (int)(GXutil.lval( httpContext.GetPar( "ClienteInicial"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ClienteInicial), 6, 0));
               AV8ClienteFinal = (int)(GXutil.lval( httpContext.GetPar( "ClienteFinal"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClienteFinal), 6, 0));
               AV12FechaInicial = localUtil.parseDateParm( httpContext.GetPar( "FechaInicial")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FechaInicial", localUtil.format(AV12FechaInicial, "99/99/99"));
               AV11FechaFinal = localUtil.parseDateParm( httpContext.GetPar( "FechaFinal")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FechaFinal", localUtil.format(AV11FechaFinal, "99/99/99"));
               AV7ArticuloInicial = httpContext.GetPar( "ArticuloInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ArticuloInicial", AV7ArticuloInicial);
               AV6ArticuloFinal = httpContext.GetPar( "ArticuloFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArticuloFinal", AV6ArticuloFinal);
               AV5Albrest = (byte)(GXutil.lval( httpContext.GetPar( "Albrest"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Albrest", GXutil.str( AV5Albrest, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV10Emprcod,Integer.valueOf(AV9ClienteInicial),Integer.valueOf(AV8ClienteFinal),AV12FechaInicial,AV11FechaFinal,AV7ArticuloInicial,AV6ArticuloFinal,Byte.valueOf(AV5Albrest)});
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
         paGF2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCDistribucionde Unidades", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcdistribuciondeunidades", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9ClienteInicial,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8ClienteFinal,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV12FechaInicial)),GXutil.URLEncode(GXutil.formatDateParm(AV11FechaFinal)),GXutil.URLEncode(GXutil.rtrim(AV7ArticuloInicial)),GXutil.URLEncode(GXutil.rtrim(AV6ArticuloFinal)),GXutil.URLEncode(GXutil.ltrimstr(AV5Albrest,1,0))}, new String[] {"Emprcod","ClienteInicial","ClienteFinal","FechaInicial","FechaFinal","ArticuloInicial","ArticuloFinal","Albrest"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV23Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV23Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV14Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV14Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV15ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV15ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV16ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV16ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV17DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV17DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV18FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV18FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV19ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV19ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV20ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV20ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Emprcod", GXutil.rtrim( wcpOAV10Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9ClienteInicial", GXutil.ltrim( localUtil.ntoc( wcpOAV9ClienteInicial, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8ClienteFinal", GXutil.ltrim( localUtil.ntoc( wcpOAV8ClienteFinal, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12FechaInicial", localUtil.dtoc( wcpOAV12FechaInicial, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11FechaFinal", localUtil.dtoc( wcpOAV11FechaFinal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7ArticuloInicial", GXutil.rtrim( wcpOAV7ArticuloInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6ArticuloFinal", GXutil.rtrim( wcpOAV6ArticuloFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Albrest", GXutil.ltrim( localUtil.ntoc( wcpOAV5Albrest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV10Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEINICIAL", GXutil.ltrim( localUtil.ntoc( AV9ClienteInicial, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEFINAL", GXutil.ltrim( localUtil.ntoc( AV8ClienteFinal, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINICIAL", localUtil.dtoc( AV12FechaInicial, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFINAL", localUtil.dtoc( AV11FechaFinal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTICULOINICIAL", GXutil.rtrim( AV7ArticuloInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTICULOFINAL", GXutil.rtrim( AV6ArticuloFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREST", GXutil.ltrim( localUtil.ntoc( AV5Albrest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISTRIBUCIONDEUNIDADES_Objectcall", GXutil.rtrim( Distribuciondeunidades_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISTRIBUCIONDEUNIDADES_Objectcall", GXutil.rtrim( Distribuciondeunidades_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISTRIBUCIONDEUNIDADES_Exporttoxml", GXutil.booltostr( Distribuciondeunidades_Exporttoxml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISTRIBUCIONDEUNIDADES_Exporttohtml", GXutil.booltostr( Distribuciondeunidades_Exporttohtml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISTRIBUCIONDEUNIDADES_Type", GXutil.rtrim( Distribuciondeunidades_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISTRIBUCIONDEUNIDADES_Title", GXutil.rtrim( Distribuciondeunidades_Title));
   }

   public void renderHtmlCloseFormGF2( )
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
      return "WCDistribuciondeUnidades" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCDistribucionde Unidades", "") ;
   }

   public void wbGF0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcdistribuciondeunidades");
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
         ucDistribuciondeunidades.setProperty("Elements", AV23Elements);
         ucDistribuciondeunidades.setProperty("Parameters", AV14Parameters);
         ucDistribuciondeunidades.setProperty("ExportToXML", Distribuciondeunidades_Exporttoxml);
         ucDistribuciondeunidades.setProperty("ExportToHTML", Distribuciondeunidades_Exporttohtml);
         ucDistribuciondeunidades.setProperty("Type", Distribuciondeunidades_Type);
         ucDistribuciondeunidades.setProperty("Title", Distribuciondeunidades_Title);
         ucDistribuciondeunidades.setProperty("ItemClickData", AV15ItemClickData);
         ucDistribuciondeunidades.setProperty("ItemDoubleClickData", AV16ItemDoubleClickData);
         ucDistribuciondeunidades.setProperty("DragAndDropData", AV17DragAndDropData);
         ucDistribuciondeunidades.setProperty("FilterChangedData", AV18FilterChangedData);
         ucDistribuciondeunidades.setProperty("ItemExpandData", AV19ItemExpandData);
         ucDistribuciondeunidades.setProperty("ItemCollapseData", AV20ItemCollapseData);
         ucDistribuciondeunidades.render(context, "queryviewer", Distribuciondeunidades_Internalname, sPrefix+"DISTRIBUCIONDEUNIDADESContainer");
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

   public void startGF2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCDistribucionde Unidades", ""), (short)(0)) ;
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
            strupGF0( ) ;
         }
      }
   }

   public void wsGF2( )
   {
      startGF2( ) ;
      evtGF2( ) ;
   }

   public void evtGF2( )
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
                              strupGF0( ) ;
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
                              strupGF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11GF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12GF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13GF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGF0( ) ;
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
                              strupGF0( ) ;
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

   public void weGF2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormGF2( ) ;
         }
      }
   }

   public void paGF2( )
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
      rfGF2( ) ;
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

   public void rfGF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12GF2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13GF2 ();
         wbGF0( ) ;
      }
   }

   public void send_integrity_lvl_hashesGF2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupGF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11GF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV23Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV14Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV15ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV16ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV17DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV18FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV19ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV20ItemCollapseData);
         /* Read saved values. */
         wcpOAV10Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV10Emprcod") ;
         wcpOAV9ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9ClienteInicial"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8ClienteFinal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12FechaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV12FechaInicial"), 0) ;
         wcpOAV11FechaFinal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11FechaFinal"), 0) ;
         wcpOAV7ArticuloInicial = httpContext.cgiGet( sPrefix+"wcpOAV7ArticuloInicial") ;
         wcpOAV6ArticuloFinal = httpContext.cgiGet( sPrefix+"wcpOAV6ArticuloFinal") ;
         wcpOAV5Albrest = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Albrest"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Distribuciondeunidades_Objectcall = httpContext.cgiGet( sPrefix+"DISTRIBUCIONDEUNIDADES_Objectcall") ;
         Distribuciondeunidades_Objectcall = httpContext.cgiGet( sPrefix+"DISTRIBUCIONDEUNIDADES_Objectcall") ;
         Distribuciondeunidades_Exporttoxml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DISTRIBUCIONDEUNIDADES_Exporttoxml")) ;
         Distribuciondeunidades_Exporttohtml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DISTRIBUCIONDEUNIDADES_Exporttohtml")) ;
         Distribuciondeunidades_Type = httpContext.cgiGet( sPrefix+"DISTRIBUCIONDEUNIDADES_Type") ;
         Distribuciondeunidades_Title = httpContext.cgiGet( sPrefix+"DISTRIBUCIONDEUNIDADES_Title") ;
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
      e11GF2 ();
      if (returnInSub) return;
   }

   public void e11GF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Distribuciondeunidades_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPDistribuciondeUnidades")+"\", \""+GXutil.encodeJSON( AV10Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV9ClienteInicial, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV8ClienteFinal, 6, 0))+"\", \""+GXutil.encodeJSON( localUtil.format(AV12FechaInicial, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV11FechaFinal, "99/99/99"))+"\", \""+GXutil.encodeJSON( AV7ArticuloInicial)+"\", \""+GXutil.encodeJSON( AV6ArticuloFinal)+"\", \""+GXutil.encodeJSON( GXutil.str( AV5Albrest, 1, 0))+"\" ]" ;
      ucDistribuciondeunidades.sendProperty(context, sPrefix, false, Distribuciondeunidades_Internalname, "Object", Distribuciondeunidades_Objectcall);
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcdistribuciondeunidades_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV10Emprcod ;
      GXv_char3[0] = AV28Emprnom ;
      GXv_char4[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcdistribuciondeunidades_impl.this.AV10Emprcod = GXv_char2[0] ;
      wcdistribuciondeunidades_impl.this.AV28Emprnom = GXv_char3[0] ;
      wcdistribuciondeunidades_impl.this.AV29Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
   }

   public void e12GF2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Distribuciondeunidades_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPDistribuciondeUnidades")+"\", \""+GXutil.encodeJSON( AV10Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV9ClienteInicial, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV8ClienteFinal, 6, 0))+"\", \""+GXutil.encodeJSON( localUtil.format(AV12FechaInicial, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV11FechaFinal, "99/99/99"))+"\", \""+GXutil.encodeJSON( AV7ArticuloInicial)+"\", \""+GXutil.encodeJSON( AV6ArticuloFinal)+"\", \""+GXutil.encodeJSON( GXutil.str( AV5Albrest, 1, 0))+"\" ]" ;
      ucDistribuciondeunidades.sendProperty(context, sPrefix, false, Distribuciondeunidades_Internalname, "Object", Distribuciondeunidades_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13GF2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV10Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
      AV9ClienteInicial = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ClienteInicial), 6, 0));
      AV8ClienteFinal = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClienteFinal), 6, 0));
      AV12FechaInicial = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FechaInicial", localUtil.format(AV12FechaInicial, "99/99/99"));
      AV11FechaFinal = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FechaFinal", localUtil.format(AV11FechaFinal, "99/99/99"));
      AV7ArticuloInicial = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ArticuloInicial", AV7ArticuloInicial);
      AV6ArticuloFinal = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArticuloFinal", AV6ArticuloFinal);
      AV5Albrest = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Albrest", GXutil.str( AV5Albrest, 1, 0));
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
      paGF2( ) ;
      wsGF2( ) ;
      weGF2( ) ;
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
      sCtrlAV10Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV9ClienteInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8ClienteFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV12FechaInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11FechaFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV7ArticuloInicial = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV6ArticuloFinal = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV5Albrest = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paGF2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcdistribuciondeunidades", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paGF2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV10Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
         AV9ClienteInicial = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ClienteInicial), 6, 0));
         AV8ClienteFinal = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClienteFinal), 6, 0));
         AV12FechaInicial = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FechaInicial", localUtil.format(AV12FechaInicial, "99/99/99"));
         AV11FechaFinal = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FechaFinal", localUtil.format(AV11FechaFinal, "99/99/99"));
         AV7ArticuloInicial = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ArticuloInicial", AV7ArticuloInicial);
         AV6ArticuloFinal = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArticuloFinal", AV6ArticuloFinal);
         AV5Albrest = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Albrest", GXutil.str( AV5Albrest, 1, 0));
      }
      wcpOAV10Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV10Emprcod") ;
      wcpOAV9ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9ClienteInicial"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8ClienteFinal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12FechaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV12FechaInicial"), 0) ;
      wcpOAV11FechaFinal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11FechaFinal"), 0) ;
      wcpOAV7ArticuloInicial = httpContext.cgiGet( sPrefix+"wcpOAV7ArticuloInicial") ;
      wcpOAV6ArticuloFinal = httpContext.cgiGet( sPrefix+"wcpOAV6ArticuloFinal") ;
      wcpOAV5Albrest = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Albrest"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV10Emprcod, wcpOAV10Emprcod) != 0 ) || ( AV9ClienteInicial != wcpOAV9ClienteInicial ) || ( AV8ClienteFinal != wcpOAV8ClienteFinal ) || !( GXutil.dateCompare(GXutil.resetTime(AV12FechaInicial), GXutil.resetTime(wcpOAV12FechaInicial)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV11FechaFinal), GXutil.resetTime(wcpOAV11FechaFinal)) ) || ( GXutil.strcmp(AV7ArticuloInicial, wcpOAV7ArticuloInicial) != 0 ) || ( GXutil.strcmp(AV6ArticuloFinal, wcpOAV6ArticuloFinal) != 0 ) || ( AV5Albrest != wcpOAV5Albrest ) ) )
      {
         setjustcreated();
      }
      wcpOAV10Emprcod = AV10Emprcod ;
      wcpOAV9ClienteInicial = AV9ClienteInicial ;
      wcpOAV8ClienteFinal = AV8ClienteFinal ;
      wcpOAV12FechaInicial = AV12FechaInicial ;
      wcpOAV11FechaFinal = AV11FechaFinal ;
      wcpOAV7ArticuloInicial = AV7ArticuloInicial ;
      wcpOAV6ArticuloFinal = AV6ArticuloFinal ;
      wcpOAV5Albrest = AV5Albrest ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV10Emprcod = httpContext.cgiGet( sPrefix+"AV10Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV10Emprcod) > 0 )
      {
         AV10Emprcod = httpContext.cgiGet( sCtrlAV10Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Emprcod", AV10Emprcod);
      }
      else
      {
         AV10Emprcod = httpContext.cgiGet( sPrefix+"AV10Emprcod_PARM") ;
      }
      sCtrlAV9ClienteInicial = httpContext.cgiGet( sPrefix+"AV9ClienteInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV9ClienteInicial) > 0 )
      {
         AV9ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9ClienteInicial), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ClienteInicial), 6, 0));
      }
      else
      {
         AV9ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9ClienteInicial_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8ClienteFinal = httpContext.cgiGet( sPrefix+"AV8ClienteFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV8ClienteFinal) > 0 )
      {
         AV8ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8ClienteFinal), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClienteFinal), 6, 0));
      }
      else
      {
         AV8ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8ClienteFinal_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV12FechaInicial = httpContext.cgiGet( sPrefix+"AV12FechaInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV12FechaInicial) > 0 )
      {
         AV12FechaInicial = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV12FechaInicial), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FechaInicial", localUtil.format(AV12FechaInicial, "99/99/99"));
      }
      else
      {
         AV12FechaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV12FechaInicial_PARM"), 0) ;
      }
      sCtrlAV11FechaFinal = httpContext.cgiGet( sPrefix+"AV11FechaFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV11FechaFinal) > 0 )
      {
         AV11FechaFinal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV11FechaFinal), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FechaFinal", localUtil.format(AV11FechaFinal, "99/99/99"));
      }
      else
      {
         AV11FechaFinal = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV11FechaFinal_PARM"), 0) ;
      }
      sCtrlAV7ArticuloInicial = httpContext.cgiGet( sPrefix+"AV7ArticuloInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV7ArticuloInicial) > 0 )
      {
         AV7ArticuloInicial = httpContext.cgiGet( sCtrlAV7ArticuloInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ArticuloInicial", AV7ArticuloInicial);
      }
      else
      {
         AV7ArticuloInicial = httpContext.cgiGet( sPrefix+"AV7ArticuloInicial_PARM") ;
      }
      sCtrlAV6ArticuloFinal = httpContext.cgiGet( sPrefix+"AV6ArticuloFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV6ArticuloFinal) > 0 )
      {
         AV6ArticuloFinal = httpContext.cgiGet( sCtrlAV6ArticuloFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArticuloFinal", AV6ArticuloFinal);
      }
      else
      {
         AV6ArticuloFinal = httpContext.cgiGet( sPrefix+"AV6ArticuloFinal_PARM") ;
      }
      sCtrlAV5Albrest = httpContext.cgiGet( sPrefix+"AV5Albrest_CTRL") ;
      if ( GXutil.len( sCtrlAV5Albrest) > 0 )
      {
         AV5Albrest = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Albrest), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Albrest", GXutil.str( AV5Albrest, 1, 0));
      }
      else
      {
         AV5Albrest = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Albrest_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paGF2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsGF2( ) ;
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
      wsGF2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Emprcod_PARM", GXutil.rtrim( AV10Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Emprcod_CTRL", GXutil.rtrim( sCtrlAV10Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9ClienteInicial_PARM", GXutil.ltrim( localUtil.ntoc( AV9ClienteInicial, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9ClienteInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9ClienteInicial_CTRL", GXutil.rtrim( sCtrlAV9ClienteInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ClienteFinal_PARM", GXutil.ltrim( localUtil.ntoc( AV8ClienteFinal, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8ClienteFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ClienteFinal_CTRL", GXutil.rtrim( sCtrlAV8ClienteFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12FechaInicial_PARM", localUtil.dtoc( AV12FechaInicial, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12FechaInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12FechaInicial_CTRL", GXutil.rtrim( sCtrlAV12FechaInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FechaFinal_PARM", localUtil.dtoc( AV11FechaFinal, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11FechaFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FechaFinal_CTRL", GXutil.rtrim( sCtrlAV11FechaFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7ArticuloInicial_PARM", GXutil.rtrim( AV7ArticuloInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7ArticuloInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7ArticuloInicial_CTRL", GXutil.rtrim( sCtrlAV7ArticuloInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ArticuloFinal_PARM", GXutil.rtrim( AV6ArticuloFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6ArticuloFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ArticuloFinal_CTRL", GXutil.rtrim( sCtrlAV6ArticuloFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Albrest_PARM", GXutil.ltrim( localUtil.ntoc( AV5Albrest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Albrest)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Albrest_CTRL", GXutil.rtrim( sCtrlAV5Albrest));
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
      weGF2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101556438", true, true);
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
         httpContext.AddJavascriptSource("wcdistribuciondeunidades.js", "?20266101556438", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Distribuciondeunidades_Internalname = sPrefix+"DISTRIBUCIONDEUNIDADES" ;
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
      Distribuciondeunidades_Title = httpContext.getMessage( "Distribucion de Unidades", "") ;
      Distribuciondeunidades_Type = "Table" ;
      Distribuciondeunidades_Exporttohtml = GXutil.toBoolean( 0) ;
      Distribuciondeunidades_Exporttoxml = GXutil.toBoolean( 0) ;
      Distribuciondeunidades_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9ClienteInicial',fld:'vCLIENTEINICIAL',pic:'ZZZZZ9'},{av:'AV8ClienteFinal',fld:'vCLIENTEFINAL',pic:'ZZZZZ9'},{av:'AV12FechaInicial',fld:'vFECHAINICIAL',pic:''},{av:'AV11FechaFinal',fld:'vFECHAFINAL',pic:''},{av:'AV7ArticuloInicial',fld:'vARTICULOINICIAL',pic:''},{av:'AV6ArticuloFinal',fld:'vARTICULOFINAL',pic:''},{av:'AV5Albrest',fld:'vALBREST',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'DISTRIBUCIONDEUNIDADES'}]}");
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
      wcpOAV10Emprcod = "" ;
      wcpOAV12FechaInicial = GXutil.nullDate() ;
      wcpOAV11FechaFinal = GXutil.nullDate() ;
      wcpOAV7ArticuloInicial = "" ;
      wcpOAV6ArticuloFinal = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV10Emprcod = "" ;
      AV12FechaInicial = GXutil.nullDate() ;
      AV11FechaFinal = GXutil.nullDate() ;
      AV7ArticuloInicial = "" ;
      AV6ArticuloFinal = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV14Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV15ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV16ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV17DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV18FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV19ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV20ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDistribuciondeunidades = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV27Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV28Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV29Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV10Emprcod = "" ;
      sCtrlAV9ClienteInicial = "" ;
      sCtrlAV8ClienteFinal = "" ;
      sCtrlAV12FechaInicial = "" ;
      sCtrlAV11FechaFinal = "" ;
      sCtrlAV7ArticuloInicial = "" ;
      sCtrlAV6ArticuloFinal = "" ;
      sCtrlAV5Albrest = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV5Albrest ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV5Albrest ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV9ClienteInicial ;
   private int wcpOAV8ClienteFinal ;
   private int AV9ClienteInicial ;
   private int AV8ClienteFinal ;
   private int idxLst ;
   private String wcpOAV10Emprcod ;
   private String wcpOAV7ArticuloInicial ;
   private String wcpOAV6ArticuloFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV10Emprcod ;
   private String AV7ArticuloInicial ;
   private String AV6ArticuloFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Distribuciondeunidades_Objectcall ;
   private String Distribuciondeunidades_Type ;
   private String Distribuciondeunidades_Title ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Distribuciondeunidades_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV28Emprnom ;
   private String GXv_char3[] ;
   private String AV29Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV10Emprcod ;
   private String sCtrlAV9ClienteInicial ;
   private String sCtrlAV8ClienteFinal ;
   private String sCtrlAV12FechaInicial ;
   private String sCtrlAV11FechaFinal ;
   private String sCtrlAV7ArticuloInicial ;
   private String sCtrlAV6ArticuloFinal ;
   private String sCtrlAV5Albrest ;
   private java.util.Date wcpOAV12FechaInicial ;
   private java.util.Date wcpOAV11FechaFinal ;
   private java.util.Date AV12FechaInicial ;
   private java.util.Date AV11FechaFinal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Distribuciondeunidades_Exporttoxml ;
   private boolean Distribuciondeunidades_Exporttohtml ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDistribuciondeunidades ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV23Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV14Parameters ;
   private app.SdtQueryViewerItemClickData AV15ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV16ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV17DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV18FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV19ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV20ItemCollapseData ;
}

