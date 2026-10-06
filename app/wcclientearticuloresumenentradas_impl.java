package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcclientearticuloresumenentradas_impl extends GXWebComponent
{
   public wcclientearticuloresumenentradas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcclientearticuloresumenentradas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcclientearticuloresumenentradas_impl.class ));
   }

   public wcclientearticuloresumenentradas_impl( int remoteHandle ,
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
               AV19Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
               AV18ClienteInicial = (int)(GXutil.lval( httpContext.GetPar( "ClienteInicial"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ClienteInicial), 6, 0));
               AV17ClienteFinal = (int)(GXutil.lval( httpContext.GetPar( "ClienteFinal"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ClienteFinal), 6, 0));
               AV21FechaInicial = localUtil.parseDateParm( httpContext.GetPar( "FechaInicial")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FechaInicial", localUtil.format(AV21FechaInicial, "99/99/99"));
               AV20FechaFinal = localUtil.parseDateParm( httpContext.GetPar( "FechaFinal")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FechaFinal", localUtil.format(AV20FechaFinal, "99/99/99"));
               AV16ArticuloInicial = httpContext.GetPar( "ArticuloInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ArticuloInicial", AV16ArticuloInicial);
               AV15ArticuloFinal = httpContext.GetPar( "ArticuloFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ArticuloFinal", AV15ArticuloFinal);
               AV22AlbrEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbrEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbrEst", GXutil.str( AV22AlbrEst, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV19Emprcod,Integer.valueOf(AV18ClienteInicial),Integer.valueOf(AV17ClienteFinal),AV21FechaInicial,AV20FechaFinal,AV16ArticuloInicial,AV15ArticuloFinal,Byte.valueOf(AV22AlbrEst)});
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
         paGB2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCCliente Articulo Resumen Entradas", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcclientearticuloresumenentradas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV18ClienteInicial,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17ClienteFinal,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV21FechaInicial)),GXutil.URLEncode(GXutil.formatDateParm(AV20FechaFinal)),GXutil.URLEncode(GXutil.rtrim(AV16ArticuloInicial)),GXutil.URLEncode(GXutil.rtrim(AV15ArticuloFinal)),GXutil.URLEncode(GXutil.ltrimstr(AV22AlbrEst,1,0))}, new String[] {"Emprcod","ClienteInicial","ClienteFinal","FechaInicial","FechaFinal","ArticuloInicial","ArticuloFinal","AlbrEst"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV6Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV6Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV7ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV7ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV8ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV8ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV10FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV10FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV11ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV11ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV12ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV12ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Emprcod", GXutil.rtrim( wcpOAV19Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18ClienteInicial", GXutil.ltrim( localUtil.ntoc( wcpOAV18ClienteInicial, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17ClienteFinal", GXutil.ltrim( localUtil.ntoc( wcpOAV17ClienteFinal, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21FechaInicial", localUtil.dtoc( wcpOAV21FechaInicial, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20FechaFinal", localUtil.dtoc( wcpOAV20FechaFinal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16ArticuloInicial", GXutil.rtrim( wcpOAV16ArticuloInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15ArticuloFinal", GXutil.rtrim( wcpOAV15ArticuloFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22AlbrEst", GXutil.ltrim( localUtil.ntoc( wcpOAV22AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV19Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEINICIAL", GXutil.ltrim( localUtil.ntoc( AV18ClienteInicial, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEFINAL", GXutil.ltrim( localUtil.ntoc( AV17ClienteFinal, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINICIAL", localUtil.dtoc( AV21FechaInicial, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFINAL", localUtil.dtoc( AV20FechaFinal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTICULOINICIAL", GXutil.rtrim( AV16ArticuloInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTICULOFINAL", GXutil.rtrim( AV15ArticuloFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREST", GXutil.ltrim( localUtil.ntoc( AV22AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Objectcall", GXutil.rtrim( Resumenentradasclientearticulo_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Objectcall", GXutil.rtrim( Resumenentradasclientearticulo_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Exporttoxml", GXutil.booltostr( Resumenentradasclientearticulo_Exporttoxml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Exporttohtml", GXutil.booltostr( Resumenentradasclientearticulo_Exporttohtml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Type", GXutil.rtrim( Resumenentradasclientearticulo_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Title", GXutil.rtrim( Resumenentradasclientearticulo_Title));
   }

   public void renderHtmlCloseFormGB2( )
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
      return "WCClienteArticuloResumenEntradas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCCliente Articulo Resumen Entradas", "") ;
   }

   public void wbGB0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcclientearticuloresumenentradas");
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
         ucResumenentradasclientearticulo.setProperty("Elements", AV23Elements);
         ucResumenentradasclientearticulo.setProperty("Parameters", AV6Parameters);
         ucResumenentradasclientearticulo.setProperty("ExportToXML", Resumenentradasclientearticulo_Exporttoxml);
         ucResumenentradasclientearticulo.setProperty("ExportToHTML", Resumenentradasclientearticulo_Exporttohtml);
         ucResumenentradasclientearticulo.setProperty("Type", Resumenentradasclientearticulo_Type);
         ucResumenentradasclientearticulo.setProperty("Title", Resumenentradasclientearticulo_Title);
         ucResumenentradasclientearticulo.setProperty("ItemClickData", AV7ItemClickData);
         ucResumenentradasclientearticulo.setProperty("ItemDoubleClickData", AV8ItemDoubleClickData);
         ucResumenentradasclientearticulo.setProperty("DragAndDropData", AV9DragAndDropData);
         ucResumenentradasclientearticulo.setProperty("FilterChangedData", AV10FilterChangedData);
         ucResumenentradasclientearticulo.setProperty("ItemExpandData", AV11ItemExpandData);
         ucResumenentradasclientearticulo.setProperty("ItemCollapseData", AV12ItemCollapseData);
         ucResumenentradasclientearticulo.render(context, "queryviewer", Resumenentradasclientearticulo_Internalname, sPrefix+"RESUMENENTRADASCLIENTEARTICULOContainer");
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

   public void startGB2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCCliente Articulo Resumen Entradas", ""), (short)(0)) ;
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
            strupGB0( ) ;
         }
      }
   }

   public void wsGB2( )
   {
      startGB2( ) ;
      evtGB2( ) ;
   }

   public void evtGB2( )
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
                              strupGB0( ) ;
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
                              strupGB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11GB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12GB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13GB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGB0( ) ;
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
                              strupGB0( ) ;
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

   public void weGB2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormGB2( ) ;
         }
      }
   }

   public void paGB2( )
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
      rfGB2( ) ;
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

   public void rfGB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12GB2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13GB2 ();
         wbGB0( ) ;
      }
   }

   public void send_integrity_lvl_hashesGB2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupGB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11GB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV23Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV6Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV7ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV8ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV9DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV10FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV11ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV12ItemCollapseData);
         /* Read saved values. */
         wcpOAV19Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV19Emprcod") ;
         wcpOAV18ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18ClienteInicial"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17ClienteFinal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV21FechaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21FechaInicial"), 0) ;
         wcpOAV20FechaFinal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20FechaFinal"), 0) ;
         wcpOAV16ArticuloInicial = httpContext.cgiGet( sPrefix+"wcpOAV16ArticuloInicial") ;
         wcpOAV15ArticuloFinal = httpContext.cgiGet( sPrefix+"wcpOAV15ArticuloFinal") ;
         wcpOAV22AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Resumenentradasclientearticulo_Objectcall = httpContext.cgiGet( sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Objectcall") ;
         Resumenentradasclientearticulo_Objectcall = httpContext.cgiGet( sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Objectcall") ;
         Resumenentradasclientearticulo_Exporttoxml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Exporttoxml")) ;
         Resumenentradasclientearticulo_Exporttohtml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Exporttohtml")) ;
         Resumenentradasclientearticulo_Type = httpContext.cgiGet( sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Type") ;
         Resumenentradasclientearticulo_Title = httpContext.cgiGet( sPrefix+"RESUMENENTRADASCLIENTEARTICULO_Title") ;
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
      e11GB2 ();
      if (returnInSub) return;
   }

   public void e11GB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Resumenentradasclientearticulo_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPClienteArticuloResumenEntradas")+"\", \""+GXutil.encodeJSON( AV19Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV18ClienteInicial, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV17ClienteFinal, 6, 0))+"\", \""+GXutil.encodeJSON( localUtil.format(AV21FechaInicial, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV20FechaFinal, "99/99/99"))+"\", \""+GXutil.encodeJSON( AV16ArticuloInicial)+"\", \""+GXutil.encodeJSON( AV15ArticuloFinal)+"\", \""+GXutil.encodeJSON( GXutil.str( AV22AlbrEst, 1, 0))+"\" ]" ;
      ucResumenentradasclientearticulo.sendProperty(context, sPrefix, false, Resumenentradasclientearticulo_Internalname, "Object", Resumenentradasclientearticulo_Objectcall);
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcclientearticuloresumenentradas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV19Emprcod ;
      GXv_char3[0] = AV28Emprnom ;
      GXv_char4[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcclientearticuloresumenentradas_impl.this.AV19Emprcod = GXv_char2[0] ;
      wcclientearticuloresumenentradas_impl.this.AV28Emprnom = GXv_char3[0] ;
      wcclientearticuloresumenentradas_impl.this.AV29Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
   }

   public void e12GB2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Resumenentradasclientearticulo_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPClienteArticuloResumenEntradas")+"\", \""+GXutil.encodeJSON( AV19Emprcod)+"\", \""+GXutil.encodeJSON( GXutil.str( AV18ClienteInicial, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV17ClienteFinal, 6, 0))+"\", \""+GXutil.encodeJSON( localUtil.format(AV21FechaInicial, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV20FechaFinal, "99/99/99"))+"\", \""+GXutil.encodeJSON( AV16ArticuloInicial)+"\", \""+GXutil.encodeJSON( AV15ArticuloFinal)+"\", \""+GXutil.encodeJSON( GXutil.str( AV22AlbrEst, 1, 0))+"\" ]" ;
      ucResumenentradasclientearticulo.sendProperty(context, sPrefix, false, Resumenentradasclientearticulo_Internalname, "Object", Resumenentradasclientearticulo_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13GB2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV19Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      AV18ClienteInicial = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ClienteInicial), 6, 0));
      AV17ClienteFinal = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ClienteFinal), 6, 0));
      AV21FechaInicial = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FechaInicial", localUtil.format(AV21FechaInicial, "99/99/99"));
      AV20FechaFinal = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FechaFinal", localUtil.format(AV20FechaFinal, "99/99/99"));
      AV16ArticuloInicial = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ArticuloInicial", AV16ArticuloInicial);
      AV15ArticuloFinal = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ArticuloFinal", AV15ArticuloFinal);
      AV22AlbrEst = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbrEst", GXutil.str( AV22AlbrEst, 1, 0));
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
      paGB2( ) ;
      wsGB2( ) ;
      weGB2( ) ;
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
      sCtrlAV19Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV18ClienteInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV17ClienteFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV21FechaInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV20FechaFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV16ArticuloInicial = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV15ArticuloFinal = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV22AlbrEst = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paGB2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcclientearticuloresumenentradas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paGB2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV19Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         AV18ClienteInicial = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ClienteInicial), 6, 0));
         AV17ClienteFinal = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ClienteFinal), 6, 0));
         AV21FechaInicial = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FechaInicial", localUtil.format(AV21FechaInicial, "99/99/99"));
         AV20FechaFinal = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FechaFinal", localUtil.format(AV20FechaFinal, "99/99/99"));
         AV16ArticuloInicial = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ArticuloInicial", AV16ArticuloInicial);
         AV15ArticuloFinal = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ArticuloFinal", AV15ArticuloFinal);
         AV22AlbrEst = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbrEst", GXutil.str( AV22AlbrEst, 1, 0));
      }
      wcpOAV19Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV19Emprcod") ;
      wcpOAV18ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18ClienteInicial"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17ClienteFinal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV21FechaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21FechaInicial"), 0) ;
      wcpOAV20FechaFinal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20FechaFinal"), 0) ;
      wcpOAV16ArticuloInicial = httpContext.cgiGet( sPrefix+"wcpOAV16ArticuloInicial") ;
      wcpOAV15ArticuloFinal = httpContext.cgiGet( sPrefix+"wcpOAV15ArticuloFinal") ;
      wcpOAV22AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV19Emprcod, wcpOAV19Emprcod) != 0 ) || ( AV18ClienteInicial != wcpOAV18ClienteInicial ) || ( AV17ClienteFinal != wcpOAV17ClienteFinal ) || !( GXutil.dateCompare(GXutil.resetTime(AV21FechaInicial), GXutil.resetTime(wcpOAV21FechaInicial)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV20FechaFinal), GXutil.resetTime(wcpOAV20FechaFinal)) ) || ( GXutil.strcmp(AV16ArticuloInicial, wcpOAV16ArticuloInicial) != 0 ) || ( GXutil.strcmp(AV15ArticuloFinal, wcpOAV15ArticuloFinal) != 0 ) || ( AV22AlbrEst != wcpOAV22AlbrEst ) ) )
      {
         setjustcreated();
      }
      wcpOAV19Emprcod = AV19Emprcod ;
      wcpOAV18ClienteInicial = AV18ClienteInicial ;
      wcpOAV17ClienteFinal = AV17ClienteFinal ;
      wcpOAV21FechaInicial = AV21FechaInicial ;
      wcpOAV20FechaFinal = AV20FechaFinal ;
      wcpOAV16ArticuloInicial = AV16ArticuloInicial ;
      wcpOAV15ArticuloFinal = AV15ArticuloFinal ;
      wcpOAV22AlbrEst = AV22AlbrEst ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV19Emprcod = httpContext.cgiGet( sPrefix+"AV19Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV19Emprcod) > 0 )
      {
         AV19Emprcod = httpContext.cgiGet( sCtrlAV19Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      }
      else
      {
         AV19Emprcod = httpContext.cgiGet( sPrefix+"AV19Emprcod_PARM") ;
      }
      sCtrlAV18ClienteInicial = httpContext.cgiGet( sPrefix+"AV18ClienteInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV18ClienteInicial) > 0 )
      {
         AV18ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV18ClienteInicial), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ClienteInicial), 6, 0));
      }
      else
      {
         AV18ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV18ClienteInicial_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17ClienteFinal = httpContext.cgiGet( sPrefix+"AV17ClienteFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV17ClienteFinal) > 0 )
      {
         AV17ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV17ClienteFinal), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ClienteFinal), 6, 0));
      }
      else
      {
         AV17ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV17ClienteFinal_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV21FechaInicial = httpContext.cgiGet( sPrefix+"AV21FechaInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV21FechaInicial) > 0 )
      {
         AV21FechaInicial = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV21FechaInicial), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FechaInicial", localUtil.format(AV21FechaInicial, "99/99/99"));
      }
      else
      {
         AV21FechaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV21FechaInicial_PARM"), 0) ;
      }
      sCtrlAV20FechaFinal = httpContext.cgiGet( sPrefix+"AV20FechaFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV20FechaFinal) > 0 )
      {
         AV20FechaFinal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV20FechaFinal), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FechaFinal", localUtil.format(AV20FechaFinal, "99/99/99"));
      }
      else
      {
         AV20FechaFinal = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV20FechaFinal_PARM"), 0) ;
      }
      sCtrlAV16ArticuloInicial = httpContext.cgiGet( sPrefix+"AV16ArticuloInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV16ArticuloInicial) > 0 )
      {
         AV16ArticuloInicial = httpContext.cgiGet( sCtrlAV16ArticuloInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ArticuloInicial", AV16ArticuloInicial);
      }
      else
      {
         AV16ArticuloInicial = httpContext.cgiGet( sPrefix+"AV16ArticuloInicial_PARM") ;
      }
      sCtrlAV15ArticuloFinal = httpContext.cgiGet( sPrefix+"AV15ArticuloFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV15ArticuloFinal) > 0 )
      {
         AV15ArticuloFinal = httpContext.cgiGet( sCtrlAV15ArticuloFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ArticuloFinal", AV15ArticuloFinal);
      }
      else
      {
         AV15ArticuloFinal = httpContext.cgiGet( sPrefix+"AV15ArticuloFinal_PARM") ;
      }
      sCtrlAV22AlbrEst = httpContext.cgiGet( sPrefix+"AV22AlbrEst_CTRL") ;
      if ( GXutil.len( sCtrlAV22AlbrEst) > 0 )
      {
         AV22AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22AlbrEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbrEst", GXutil.str( AV22AlbrEst, 1, 0));
      }
      else
      {
         AV22AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22AlbrEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paGB2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsGB2( ) ;
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
      wsGB2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Emprcod_PARM", GXutil.rtrim( AV19Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Emprcod_CTRL", GXutil.rtrim( sCtrlAV19Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ClienteInicial_PARM", GXutil.ltrim( localUtil.ntoc( AV18ClienteInicial, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18ClienteInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ClienteInicial_CTRL", GXutil.rtrim( sCtrlAV18ClienteInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17ClienteFinal_PARM", GXutil.ltrim( localUtil.ntoc( AV17ClienteFinal, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17ClienteFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17ClienteFinal_CTRL", GXutil.rtrim( sCtrlAV17ClienteFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21FechaInicial_PARM", localUtil.dtoc( AV21FechaInicial, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21FechaInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21FechaInicial_CTRL", GXutil.rtrim( sCtrlAV21FechaInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20FechaFinal_PARM", localUtil.dtoc( AV20FechaFinal, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20FechaFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20FechaFinal_CTRL", GXutil.rtrim( sCtrlAV20FechaFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16ArticuloInicial_PARM", GXutil.rtrim( AV16ArticuloInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16ArticuloInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16ArticuloInicial_CTRL", GXutil.rtrim( sCtrlAV16ArticuloInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15ArticuloFinal_PARM", GXutil.rtrim( AV15ArticuloFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15ArticuloFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15ArticuloFinal_CTRL", GXutil.rtrim( sCtrlAV15ArticuloFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22AlbrEst_PARM", GXutil.ltrim( localUtil.ntoc( AV22AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22AlbrEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22AlbrEst_CTRL", GXutil.rtrim( sCtrlAV22AlbrEst));
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
      weGB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564350", true, true);
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
         httpContext.AddJavascriptSource("wcclientearticuloresumenentradas.js", "?202661015564350", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Resumenentradasclientearticulo_Internalname = sPrefix+"RESUMENENTRADASCLIENTEARTICULO" ;
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
      Resumenentradasclientearticulo_Title = httpContext.getMessage( "ResumenEntradasClienteArticulo", "") ;
      Resumenentradasclientearticulo_Type = "Table" ;
      Resumenentradasclientearticulo_Exporttohtml = GXutil.toBoolean( 0) ;
      Resumenentradasclientearticulo_Exporttoxml = GXutil.toBoolean( 0) ;
      Resumenentradasclientearticulo_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18ClienteInicial',fld:'vCLIENTEINICIAL',pic:'ZZZZZ9'},{av:'AV17ClienteFinal',fld:'vCLIENTEFINAL',pic:'ZZZZZ9'},{av:'AV21FechaInicial',fld:'vFECHAINICIAL',pic:''},{av:'AV20FechaFinal',fld:'vFECHAFINAL',pic:''},{av:'AV16ArticuloInicial',fld:'vARTICULOINICIAL',pic:''},{av:'AV15ArticuloFinal',fld:'vARTICULOFINAL',pic:''},{av:'AV22AlbrEst',fld:'vALBREST',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'RESUMENENTRADASCLIENTEARTICULO'}]}");
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
      wcpOAV19Emprcod = "" ;
      wcpOAV21FechaInicial = GXutil.nullDate() ;
      wcpOAV20FechaFinal = GXutil.nullDate() ;
      wcpOAV16ArticuloInicial = "" ;
      wcpOAV15ArticuloFinal = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV19Emprcod = "" ;
      AV21FechaInicial = GXutil.nullDate() ;
      AV20FechaFinal = GXutil.nullDate() ;
      AV16ArticuloInicial = "" ;
      AV15ArticuloFinal = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV6Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV7ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV8ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV9DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV10FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV11ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV12ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucResumenentradasclientearticulo = new com.genexus.webpanels.GXUserControl();
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
      sCtrlAV19Emprcod = "" ;
      sCtrlAV18ClienteInicial = "" ;
      sCtrlAV17ClienteFinal = "" ;
      sCtrlAV21FechaInicial = "" ;
      sCtrlAV20FechaFinal = "" ;
      sCtrlAV16ArticuloInicial = "" ;
      sCtrlAV15ArticuloFinal = "" ;
      sCtrlAV22AlbrEst = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV22AlbrEst ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV22AlbrEst ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV18ClienteInicial ;
   private int wcpOAV17ClienteFinal ;
   private int AV18ClienteInicial ;
   private int AV17ClienteFinal ;
   private int idxLst ;
   private String wcpOAV19Emprcod ;
   private String wcpOAV16ArticuloInicial ;
   private String wcpOAV15ArticuloFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV19Emprcod ;
   private String AV16ArticuloInicial ;
   private String AV15ArticuloFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Resumenentradasclientearticulo_Objectcall ;
   private String Resumenentradasclientearticulo_Type ;
   private String Resumenentradasclientearticulo_Title ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Resumenentradasclientearticulo_Internalname ;
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
   private String sCtrlAV19Emprcod ;
   private String sCtrlAV18ClienteInicial ;
   private String sCtrlAV17ClienteFinal ;
   private String sCtrlAV21FechaInicial ;
   private String sCtrlAV20FechaFinal ;
   private String sCtrlAV16ArticuloInicial ;
   private String sCtrlAV15ArticuloFinal ;
   private String sCtrlAV22AlbrEst ;
   private java.util.Date wcpOAV21FechaInicial ;
   private java.util.Date wcpOAV20FechaFinal ;
   private java.util.Date AV21FechaInicial ;
   private java.util.Date AV20FechaFinal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Resumenentradasclientearticulo_Exporttoxml ;
   private boolean Resumenentradasclientearticulo_Exporttohtml ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucResumenentradasclientearticulo ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV23Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV6Parameters ;
   private app.SdtQueryViewerDragAndDropData AV9DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV10FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV7ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV12ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV8ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV11ItemExpandData ;
}

