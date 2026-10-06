package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcmermasresumencliente_impl extends GXWebComponent
{
   public wcmermasresumencliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcmermasresumencliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcmermasresumencliente_impl.class ));
   }

   public wcmermasresumencliente_impl( int remoteHandle ,
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
               AV23Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
               AV17BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarFecSal", localUtil.format(AV17BarFecSal, "99/99/99"));
               AV18BarFecSal_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_To")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecSal_To", localUtil.format(AV18BarFecSal_To, "99/99/99"));
               AV15BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNom", AV15BarColNom);
               AV16BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarColNom_To", AV16BarColNom_To);
               AV19BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarSer", AV19BarSer);
               AV20BarSer_To = httpContext.GetPar( "BarSer_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarSer_To", AV20BarSer_To);
               AV21CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCod), 6, 0));
               AV22CliCod_To = (int)(GXutil.lval( httpContext.GetPar( "CliCod_To"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod_To), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV23Emprcod,AV17BarFecSal,AV18BarFecSal_To,AV15BarColNom,AV16BarColNom_To,AV19BarSer,AV20BarSer_To,Integer.valueOf(AV21CliCod),Integer.valueOf(AV22CliCod_To)});
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
         paMW2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCMermas Resumen Cliente", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcmermasresumencliente", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV17BarFecSal)),GXutil.URLEncode(GXutil.formatDateParm(AV18BarFecSal_To)),GXutil.URLEncode(GXutil.rtrim(AV15BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV16BarColNom_To)),GXutil.URLEncode(GXutil.rtrim(AV19BarSer)),GXutil.URLEncode(GXutil.rtrim(AV20BarSer_To)),GXutil.URLEncode(GXutil.ltrimstr(AV21CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22CliCod_To,6,0))}, new String[] {"Emprcod","BarFecSal","BarFecSal_To","BarColNom","BarColNom_To","BarSer","BarSer_To","CliCod","CliCod_To"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV24Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV24Elements);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Emprcod", GXutil.rtrim( wcpOAV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17BarFecSal", localUtil.dtoc( wcpOAV17BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18BarFecSal_To", localUtil.dtoc( wcpOAV18BarFecSal_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15BarColNom", GXutil.rtrim( wcpOAV15BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16BarColNom_To", GXutil.rtrim( wcpOAV16BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19BarSer", GXutil.rtrim( wcpOAV19BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20BarSer_To", GXutil.rtrim( wcpOAV20BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV21CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22CliCod_To", GXutil.ltrim( localUtil.ntoc( wcpOAV22CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL", localUtil.dtoc( AV17BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL_TO", localUtil.dtoc( AV18BarFecSal_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV15BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM_TO", GXutil.rtrim( AV16BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV19BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER_TO", GXutil.rtrim( AV20BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV21CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV22CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEMERMASRESUMENCLIENTE_Exporttoxml", GXutil.booltostr( Informemermasresumencliente_Exporttoxml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEMERMASRESUMENCLIENTE_Exporttohtml", GXutil.booltostr( Informemermasresumencliente_Exporttohtml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEMERMASRESUMENCLIENTE_Type", GXutil.rtrim( Informemermasresumencliente_Type));
   }

   public void renderHtmlCloseFormMW2( )
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
      return "WCMermasResumenCliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCMermas Resumen Cliente", "") ;
   }

   public void wbMW0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcmermasresumencliente");
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
         ucInformemermasresumencliente.setProperty("Elements", AV24Elements);
         ucInformemermasresumencliente.setProperty("Parameters", AV6Parameters);
         ucInformemermasresumencliente.setProperty("ExportToXML", Informemermasresumencliente_Exporttoxml);
         ucInformemermasresumencliente.setProperty("ExportToHTML", Informemermasresumencliente_Exporttohtml);
         ucInformemermasresumencliente.setProperty("Type", Informemermasresumencliente_Type);
         ucInformemermasresumencliente.setProperty("Title", Informemermasresumencliente_Title);
         ucInformemermasresumencliente.setProperty("ItemClickData", AV7ItemClickData);
         ucInformemermasresumencliente.setProperty("ItemDoubleClickData", AV8ItemDoubleClickData);
         ucInformemermasresumencliente.setProperty("DragAndDropData", AV9DragAndDropData);
         ucInformemermasresumencliente.setProperty("FilterChangedData", AV10FilterChangedData);
         ucInformemermasresumencliente.setProperty("ItemExpandData", AV11ItemExpandData);
         ucInformemermasresumencliente.setProperty("ItemCollapseData", AV12ItemCollapseData);
         ucInformemermasresumencliente.render(context, "queryviewer", Informemermasresumencliente_Internalname, sPrefix+"INFORMEMERMASRESUMENCLIENTEContainer");
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

   public void startMW2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCMermas Resumen Cliente", ""), (short)(0)) ;
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
            strupMW0( ) ;
         }
      }
   }

   public void wsMW2( )
   {
      startMW2( ) ;
      evtMW2( ) ;
   }

   public void evtMW2( )
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
                              strupMW0( ) ;
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
                              strupMW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11MW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e12MW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMW0( ) ;
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
                              strupMW0( ) ;
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

   public void weMW2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormMW2( ) ;
         }
      }
   }

   public void paMW2( )
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
      rfMW2( ) ;
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

   public void rfMW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e12MW2 ();
         wbMW0( ) ;
      }
   }

   public void send_integrity_lvl_hashesMW2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupMW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11MW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV24Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV6Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV7ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV8ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV9DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV10FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV11ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV12ItemCollapseData);
         /* Read saved values. */
         wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
         wcpOAV17BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV17BarFecSal"), 0) ;
         wcpOAV18BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18BarFecSal_To"), 0) ;
         wcpOAV15BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV15BarColNom") ;
         wcpOAV16BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV16BarColNom_To") ;
         wcpOAV19BarSer = httpContext.cgiGet( sPrefix+"wcpOAV19BarSer") ;
         wcpOAV20BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV20BarSer_To") ;
         wcpOAV21CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV22CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22CliCod_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Informemermasresumencliente_Exporttoxml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"INFORMEMERMASRESUMENCLIENTE_Exporttoxml")) ;
         Informemermasresumencliente_Exporttohtml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"INFORMEMERMASRESUMENCLIENTE_Exporttohtml")) ;
         Informemermasresumencliente_Type = httpContext.cgiGet( sPrefix+"INFORMEMERMASRESUMENCLIENTE_Type") ;
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
      e11MW2 ();
      if (returnInSub) return;
   }

   public void e11MW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcmermasresumencliente_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      GXv_char2[0] = AV23Emprcod ;
      GXv_char3[0] = AV29Emprnom ;
      GXv_char4[0] = AV30Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcmermasresumencliente_impl.this.AV23Emprcod = GXv_char2[0] ;
      wcmermasresumencliente_impl.this.AV29Emprnom = GXv_char3[0] ;
      wcmermasresumencliente_impl.this.AV30Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
   }

   protected void nextLoad( )
   {
   }

   protected void e12MW2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      AV17BarFecSal = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarFecSal", localUtil.format(AV17BarFecSal, "99/99/99"));
      AV18BarFecSal_To = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecSal_To", localUtil.format(AV18BarFecSal_To, "99/99/99"));
      AV15BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNom", AV15BarColNom);
      AV16BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarColNom_To", AV16BarColNom_To);
      AV19BarSer = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarSer", AV19BarSer);
      AV20BarSer_To = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarSer_To", AV20BarSer_To);
      AV21CliCod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCod), 6, 0));
      AV22CliCod_To = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod_To), 6, 0));
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
      paMW2( ) ;
      wsMW2( ) ;
      weMW2( ) ;
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
      sCtrlAV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV17BarFecSal = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV18BarFecSal_To = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV15BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV16BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV19BarSer = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV20BarSer_To = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV21CliCod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV22CliCod_To = (String)getParm(obj,8,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paMW2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcmermasresumencliente", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paMW2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV23Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         AV17BarFecSal = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarFecSal", localUtil.format(AV17BarFecSal, "99/99/99"));
         AV18BarFecSal_To = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecSal_To", localUtil.format(AV18BarFecSal_To, "99/99/99"));
         AV15BarColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNom", AV15BarColNom);
         AV16BarColNom_To = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarColNom_To", AV16BarColNom_To);
         AV19BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarSer", AV19BarSer);
         AV20BarSer_To = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarSer_To", AV20BarSer_To);
         AV21CliCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCod), 6, 0));
         AV22CliCod_To = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod_To), 6, 0));
      }
      wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
      wcpOAV17BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV17BarFecSal"), 0) ;
      wcpOAV18BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18BarFecSal_To"), 0) ;
      wcpOAV15BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV15BarColNom") ;
      wcpOAV16BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV16BarColNom_To") ;
      wcpOAV19BarSer = httpContext.cgiGet( sPrefix+"wcpOAV19BarSer") ;
      wcpOAV20BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV20BarSer_To") ;
      wcpOAV21CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV22CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22CliCod_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV23Emprcod, wcpOAV23Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV17BarFecSal), GXutil.resetTime(wcpOAV17BarFecSal)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV18BarFecSal_To), GXutil.resetTime(wcpOAV18BarFecSal_To)) ) || ( GXutil.strcmp(AV15BarColNom, wcpOAV15BarColNom) != 0 ) || ( GXutil.strcmp(AV16BarColNom_To, wcpOAV16BarColNom_To) != 0 ) || ( GXutil.strcmp(AV19BarSer, wcpOAV19BarSer) != 0 ) || ( GXutil.strcmp(AV20BarSer_To, wcpOAV20BarSer_To) != 0 ) || ( AV21CliCod != wcpOAV21CliCod ) || ( AV22CliCod_To != wcpOAV22CliCod_To ) ) )
      {
         setjustcreated();
      }
      wcpOAV23Emprcod = AV23Emprcod ;
      wcpOAV17BarFecSal = AV17BarFecSal ;
      wcpOAV18BarFecSal_To = AV18BarFecSal_To ;
      wcpOAV15BarColNom = AV15BarColNom ;
      wcpOAV16BarColNom_To = AV16BarColNom_To ;
      wcpOAV19BarSer = AV19BarSer ;
      wcpOAV20BarSer_To = AV20BarSer_To ;
      wcpOAV21CliCod = AV21CliCod ;
      wcpOAV22CliCod_To = AV22CliCod_To ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV23Emprcod) > 0 )
      {
         AV23Emprcod = httpContext.cgiGet( sCtrlAV23Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      }
      else
      {
         AV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_PARM") ;
      }
      sCtrlAV17BarFecSal = httpContext.cgiGet( sPrefix+"AV17BarFecSal_CTRL") ;
      if ( GXutil.len( sCtrlAV17BarFecSal) > 0 )
      {
         AV17BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV17BarFecSal), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarFecSal", localUtil.format(AV17BarFecSal, "99/99/99"));
      }
      else
      {
         AV17BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV17BarFecSal_PARM"), 0) ;
      }
      sCtrlAV18BarFecSal_To = httpContext.cgiGet( sPrefix+"AV18BarFecSal_To_CTRL") ;
      if ( GXutil.len( sCtrlAV18BarFecSal_To) > 0 )
      {
         AV18BarFecSal_To = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV18BarFecSal_To), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecSal_To", localUtil.format(AV18BarFecSal_To, "99/99/99"));
      }
      else
      {
         AV18BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV18BarFecSal_To_PARM"), 0) ;
      }
      sCtrlAV15BarColNom = httpContext.cgiGet( sPrefix+"AV15BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV15BarColNom) > 0 )
      {
         AV15BarColNom = httpContext.cgiGet( sCtrlAV15BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNom", AV15BarColNom);
      }
      else
      {
         AV15BarColNom = httpContext.cgiGet( sPrefix+"AV15BarColNom_PARM") ;
      }
      sCtrlAV16BarColNom_To = httpContext.cgiGet( sPrefix+"AV16BarColNom_To_CTRL") ;
      if ( GXutil.len( sCtrlAV16BarColNom_To) > 0 )
      {
         AV16BarColNom_To = httpContext.cgiGet( sCtrlAV16BarColNom_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarColNom_To", AV16BarColNom_To);
      }
      else
      {
         AV16BarColNom_To = httpContext.cgiGet( sPrefix+"AV16BarColNom_To_PARM") ;
      }
      sCtrlAV19BarSer = httpContext.cgiGet( sPrefix+"AV19BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV19BarSer) > 0 )
      {
         AV19BarSer = httpContext.cgiGet( sCtrlAV19BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarSer", AV19BarSer);
      }
      else
      {
         AV19BarSer = httpContext.cgiGet( sPrefix+"AV19BarSer_PARM") ;
      }
      sCtrlAV20BarSer_To = httpContext.cgiGet( sPrefix+"AV20BarSer_To_CTRL") ;
      if ( GXutil.len( sCtrlAV20BarSer_To) > 0 )
      {
         AV20BarSer_To = httpContext.cgiGet( sCtrlAV20BarSer_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarSer_To", AV20BarSer_To);
      }
      else
      {
         AV20BarSer_To = httpContext.cgiGet( sPrefix+"AV20BarSer_To_PARM") ;
      }
      sCtrlAV21CliCod = httpContext.cgiGet( sPrefix+"AV21CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV21CliCod) > 0 )
      {
         AV21CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCod), 6, 0));
      }
      else
      {
         AV21CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV22CliCod_To = httpContext.cgiGet( sPrefix+"AV22CliCod_To_CTRL") ;
      if ( GXutil.len( sCtrlAV22CliCod_To) > 0 )
      {
         AV22CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22CliCod_To), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod_To), 6, 0));
      }
      else
      {
         AV22CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22CliCod_To_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paMW2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsMW2( ) ;
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
      wsMW2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_PARM", GXutil.rtrim( AV23Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_CTRL", GXutil.rtrim( sCtrlAV23Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarFecSal_PARM", localUtil.dtoc( AV17BarFecSal, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17BarFecSal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarFecSal_CTRL", GXutil.rtrim( sCtrlAV17BarFecSal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18BarFecSal_To_PARM", localUtil.dtoc( AV18BarFecSal_To, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18BarFecSal_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18BarFecSal_To_CTRL", GXutil.rtrim( sCtrlAV18BarFecSal_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarColNom_PARM", GXutil.rtrim( AV15BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarColNom_CTRL", GXutil.rtrim( sCtrlAV15BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarColNom_To_PARM", GXutil.rtrim( AV16BarColNom_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16BarColNom_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarColNom_To_CTRL", GXutil.rtrim( sCtrlAV16BarColNom_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarSer_PARM", GXutil.rtrim( AV19BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarSer_CTRL", GXutil.rtrim( sCtrlAV19BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarSer_To_PARM", GXutil.rtrim( AV20BarSer_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20BarSer_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarSer_To_CTRL", GXutil.rtrim( sCtrlAV20BarSer_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV21CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21CliCod_CTRL", GXutil.rtrim( sCtrlAV21CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22CliCod_To_PARM", GXutil.ltrim( localUtil.ntoc( AV22CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22CliCod_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22CliCod_To_CTRL", GXutil.rtrim( sCtrlAV22CliCod_To));
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
      weMW2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015563220", true, true);
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
         httpContext.AddJavascriptSource("wcmermasresumencliente.js", "?202661015563221", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Informemermasresumencliente_Internalname = sPrefix+"INFORMEMERMASRESUMENCLIENTE" ;
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
      Informemermasresumencliente_Title = "" ;
      Informemermasresumencliente_Type = "Table" ;
      Informemermasresumencliente_Exporttohtml = GXutil.toBoolean( 0) ;
      Informemermasresumencliente_Exporttoxml = GXutil.toBoolean( 0) ;
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
      wcpOAV23Emprcod = "" ;
      wcpOAV17BarFecSal = GXutil.nullDate() ;
      wcpOAV18BarFecSal_To = GXutil.nullDate() ;
      wcpOAV15BarColNom = "" ;
      wcpOAV16BarColNom_To = "" ;
      wcpOAV19BarSer = "" ;
      wcpOAV20BarSer_To = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV23Emprcod = "" ;
      AV17BarFecSal = GXutil.nullDate() ;
      AV18BarFecSal_To = GXutil.nullDate() ;
      AV15BarColNom = "" ;
      AV16BarColNom_To = "" ;
      AV19BarSer = "" ;
      AV20BarSer_To = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV24Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
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
      ucInformemermasresumencliente = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV28Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV29Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV30Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV23Emprcod = "" ;
      sCtrlAV17BarFecSal = "" ;
      sCtrlAV18BarFecSal_To = "" ;
      sCtrlAV15BarColNom = "" ;
      sCtrlAV16BarColNom_To = "" ;
      sCtrlAV19BarSer = "" ;
      sCtrlAV20BarSer_To = "" ;
      sCtrlAV21CliCod = "" ;
      sCtrlAV22CliCod_To = "" ;
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
   private int wcpOAV21CliCod ;
   private int wcpOAV22CliCod_To ;
   private int AV21CliCod ;
   private int AV22CliCod_To ;
   private int idxLst ;
   private String wcpOAV23Emprcod ;
   private String wcpOAV15BarColNom ;
   private String wcpOAV16BarColNom_To ;
   private String wcpOAV19BarSer ;
   private String wcpOAV20BarSer_To ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV23Emprcod ;
   private String AV15BarColNom ;
   private String AV16BarColNom_To ;
   private String AV19BarSer ;
   private String AV20BarSer_To ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informemermasresumencliente_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Informemermasresumencliente_Title ;
   private String Informemermasresumencliente_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV28Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV29Emprnom ;
   private String GXv_char3[] ;
   private String AV30Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV23Emprcod ;
   private String sCtrlAV17BarFecSal ;
   private String sCtrlAV18BarFecSal_To ;
   private String sCtrlAV15BarColNom ;
   private String sCtrlAV16BarColNom_To ;
   private String sCtrlAV19BarSer ;
   private String sCtrlAV20BarSer_To ;
   private String sCtrlAV21CliCod ;
   private String sCtrlAV22CliCod_To ;
   private java.util.Date wcpOAV17BarFecSal ;
   private java.util.Date wcpOAV18BarFecSal_To ;
   private java.util.Date AV17BarFecSal ;
   private java.util.Date AV18BarFecSal_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Informemermasresumencliente_Exporttoxml ;
   private boolean Informemermasresumencliente_Exporttohtml ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucInformemermasresumencliente ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV24Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV6Parameters ;
   private app.SdtQueryViewerDragAndDropData AV9DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV10FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV7ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV12ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV8ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV11ItemExpandData ;
}

