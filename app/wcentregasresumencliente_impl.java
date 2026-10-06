package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcentregasresumencliente_impl extends GXWebComponent
{
   public wcentregasresumencliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcentregasresumencliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcentregasresumencliente_impl.class ));
   }

   public wcentregasresumencliente_impl( int remoteHandle ,
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
               AV14Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
               AV15AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15AlbProFch", localUtil.format(AV15AlbProFch, "99/99/99"));
               AV5AlbProFch_To = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch_To")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbProFch_To", localUtil.format(AV5AlbProFch_To, "99/99/99"));
               AV6BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarColNom", AV6BarColNom);
               AV7BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom_To", AV7BarColNom_To);
               AV8BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
               AV9BarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_To"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarColNum_To), 6, 0));
               AV10BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarSer", AV10BarSer);
               AV11BarSer_To = httpContext.GetPar( "BarSer_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSer_To", AV11BarSer_To);
               AV12GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GuiRemCli), 6, 0));
               AV13GuiRemCli_To = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli_To"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GuiRemCli_To), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV14Emprcod,AV15AlbProFch,AV5AlbProFch_To,AV6BarColNom,AV7BarColNom_To,Integer.valueOf(AV8BarColNum),Integer.valueOf(AV9BarColNum_To),AV10BarSer,AV11BarSer_To,Integer.valueOf(AV12GuiRemCli),Integer.valueOf(AV13GuiRemCli_To)});
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
         paMX2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCEntregas Resumen Cliente", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcentregasresumencliente", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV15AlbProFch)),GXutil.URLEncode(GXutil.formatDateParm(AV5AlbProFch_To)),GXutil.URLEncode(GXutil.rtrim(AV6BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV7BarColNom_To)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarColNum_To,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarSer)),GXutil.URLEncode(GXutil.rtrim(AV11BarSer_To)),GXutil.URLEncode(GXutil.ltrimstr(AV12GuiRemCli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13GuiRemCli_To,6,0))}, new String[] {"Emprcod","AlbProFch","AlbProFch_To","BarColNom","BarColNom_To","BarColNum","BarColNum_To","BarSer","BarSer_To","GuiRemCli","GuiRemCli_To"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV26Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV26Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV17Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV17Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV18ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV18ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV19ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV19ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV20DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV20DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV21FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV21FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV22ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV22ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV23ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV23ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14Emprcod", GXutil.rtrim( wcpOAV14Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15AlbProFch", localUtil.dtoc( wcpOAV15AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5AlbProFch_To", localUtil.dtoc( wcpOAV5AlbProFch_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarColNom", GXutil.rtrim( wcpOAV6BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarColNom_To", GXutil.rtrim( wcpOAV7BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV8BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarColNum_To", GXutil.ltrim( localUtil.ntoc( wcpOAV9BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarSer", GXutil.rtrim( wcpOAV10BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarSer_To", GXutil.rtrim( wcpOAV11BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12GuiRemCli", GXutil.ltrim( localUtil.ntoc( wcpOAV12GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13GuiRemCli_To", GXutil.ltrim( localUtil.ntoc( wcpOAV13GuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV14Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH", localUtil.dtoc( AV15AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH_TO", localUtil.dtoc( AV5AlbProFch_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV6BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM_TO", GXutil.rtrim( AV7BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV8BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV9BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV10BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER_TO", GXutil.rtrim( AV11BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV12GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGUIREMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV13GuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEENTREGASRESUMENCLIENTE_Exporttoxml", GXutil.booltostr( Informeentregasresumencliente_Exporttoxml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEENTREGASRESUMENCLIENTE_Exporttohtml", GXutil.booltostr( Informeentregasresumencliente_Exporttohtml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEENTREGASRESUMENCLIENTE_Type", GXutil.rtrim( Informeentregasresumencliente_Type));
   }

   public void renderHtmlCloseFormMX2( )
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
      return "WCEntregasResumenCliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCEntregas Resumen Cliente", "") ;
   }

   public void wbMX0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcentregasresumencliente");
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
         ucInformeentregasresumencliente.setProperty("Elements", AV26Elements);
         ucInformeentregasresumencliente.setProperty("Parameters", AV17Parameters);
         ucInformeentregasresumencliente.setProperty("ExportToXML", Informeentregasresumencliente_Exporttoxml);
         ucInformeentregasresumencliente.setProperty("ExportToHTML", Informeentregasresumencliente_Exporttohtml);
         ucInformeentregasresumencliente.setProperty("Type", Informeentregasresumencliente_Type);
         ucInformeentregasresumencliente.setProperty("Title", Informeentregasresumencliente_Title);
         ucInformeentregasresumencliente.setProperty("ItemClickData", AV18ItemClickData);
         ucInformeentregasresumencliente.setProperty("ItemDoubleClickData", AV19ItemDoubleClickData);
         ucInformeentregasresumencliente.setProperty("DragAndDropData", AV20DragAndDropData);
         ucInformeentregasresumencliente.setProperty("FilterChangedData", AV21FilterChangedData);
         ucInformeentregasresumencliente.setProperty("ItemExpandData", AV22ItemExpandData);
         ucInformeentregasresumencliente.setProperty("ItemCollapseData", AV23ItemCollapseData);
         ucInformeentregasresumencliente.render(context, "queryviewer", Informeentregasresumencliente_Internalname, sPrefix+"INFORMEENTREGASRESUMENCLIENTEContainer");
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

   public void startMX2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCEntregas Resumen Cliente", ""), (short)(0)) ;
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
            strupMX0( ) ;
         }
      }
   }

   public void wsMX2( )
   {
      startMX2( ) ;
      evtMX2( ) ;
   }

   public void evtMX2( )
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
                              strupMX0( ) ;
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
                              strupMX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11MX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e12MX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMX0( ) ;
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
                              strupMX0( ) ;
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

   public void weMX2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormMX2( ) ;
         }
      }
   }

   public void paMX2( )
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
      rfMX2( ) ;
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

   public void rfMX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e12MX2 ();
         wbMX0( ) ;
      }
   }

   public void send_integrity_lvl_hashesMX2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupMX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11MX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV26Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV17Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV18ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV19ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV20DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV21FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV22ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV23ItemCollapseData);
         /* Read saved values. */
         wcpOAV14Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV14Emprcod") ;
         wcpOAV15AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV15AlbProFch"), 0) ;
         wcpOAV5AlbProFch_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV5AlbProFch_To"), 0) ;
         wcpOAV6BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV6BarColNom") ;
         wcpOAV7BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV7BarColNom_To") ;
         wcpOAV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarColNum_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10BarSer = httpContext.cgiGet( sPrefix+"wcpOAV10BarSer") ;
         wcpOAV11BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV11BarSer_To") ;
         wcpOAV12GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13GuiRemCli_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13GuiRemCli_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Informeentregasresumencliente_Exporttoxml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"INFORMEENTREGASRESUMENCLIENTE_Exporttoxml")) ;
         Informeentregasresumencliente_Exporttohtml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"INFORMEENTREGASRESUMENCLIENTE_Exporttohtml")) ;
         Informeentregasresumencliente_Type = httpContext.cgiGet( sPrefix+"INFORMEENTREGASRESUMENCLIENTE_Type") ;
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
      e11MX2 ();
      if (returnInSub) return;
   }

   public void e11MX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV30Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcentregasresumencliente_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV31Emprnom ;
      GXv_char4[0] = AV32Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcentregasresumencliente_impl.this.AV14Emprcod = GXv_char2[0] ;
      wcentregasresumencliente_impl.this.AV31Emprnom = GXv_char3[0] ;
      wcentregasresumencliente_impl.this.AV32Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
   }

   protected void nextLoad( )
   {
   }

   protected void e12MX2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV14Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
      AV15AlbProFch = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15AlbProFch", localUtil.format(AV15AlbProFch, "99/99/99"));
      AV5AlbProFch_To = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbProFch_To", localUtil.format(AV5AlbProFch_To, "99/99/99"));
      AV6BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarColNom", AV6BarColNom);
      AV7BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom_To", AV7BarColNom_To);
      AV8BarColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
      AV9BarColNum_To = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarColNum_To), 6, 0));
      AV10BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarSer", AV10BarSer);
      AV11BarSer_To = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSer_To", AV11BarSer_To);
      AV12GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GuiRemCli), 6, 0));
      AV13GuiRemCli_To = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GuiRemCli_To), 6, 0));
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
      paMX2( ) ;
      wsMX2( ) ;
      weMX2( ) ;
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
      sCtrlAV14Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV15AlbProFch = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV5AlbProFch_To = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV6BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV7BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV8BarColNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV9BarColNum_To = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV10BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV11BarSer_To = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV12GuiRemCli = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV13GuiRemCli_To = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paMX2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcentregasresumencliente", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paMX2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV14Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
         AV15AlbProFch = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15AlbProFch", localUtil.format(AV15AlbProFch, "99/99/99"));
         AV5AlbProFch_To = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbProFch_To", localUtil.format(AV5AlbProFch_To, "99/99/99"));
         AV6BarColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarColNom", AV6BarColNom);
         AV7BarColNom_To = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom_To", AV7BarColNom_To);
         AV8BarColNum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
         AV9BarColNum_To = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarColNum_To), 6, 0));
         AV10BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarSer", AV10BarSer);
         AV11BarSer_To = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSer_To", AV11BarSer_To);
         AV12GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GuiRemCli), 6, 0));
         AV13GuiRemCli_To = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GuiRemCli_To), 6, 0));
      }
      wcpOAV14Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV14Emprcod") ;
      wcpOAV15AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV15AlbProFch"), 0) ;
      wcpOAV5AlbProFch_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV5AlbProFch_To"), 0) ;
      wcpOAV6BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV6BarColNom") ;
      wcpOAV7BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV7BarColNom_To") ;
      wcpOAV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarColNum_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10BarSer = httpContext.cgiGet( sPrefix+"wcpOAV10BarSer") ;
      wcpOAV11BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV11BarSer_To") ;
      wcpOAV12GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV13GuiRemCli_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13GuiRemCli_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV14Emprcod, wcpOAV14Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV15AlbProFch), GXutil.resetTime(wcpOAV15AlbProFch)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV5AlbProFch_To), GXutil.resetTime(wcpOAV5AlbProFch_To)) ) || ( GXutil.strcmp(AV6BarColNom, wcpOAV6BarColNom) != 0 ) || ( GXutil.strcmp(AV7BarColNom_To, wcpOAV7BarColNom_To) != 0 ) || ( AV8BarColNum != wcpOAV8BarColNum ) || ( AV9BarColNum_To != wcpOAV9BarColNum_To ) || ( GXutil.strcmp(AV10BarSer, wcpOAV10BarSer) != 0 ) || ( GXutil.strcmp(AV11BarSer_To, wcpOAV11BarSer_To) != 0 ) || ( AV12GuiRemCli != wcpOAV12GuiRemCli ) || ( AV13GuiRemCli_To != wcpOAV13GuiRemCli_To ) ) )
      {
         setjustcreated();
      }
      wcpOAV14Emprcod = AV14Emprcod ;
      wcpOAV15AlbProFch = AV15AlbProFch ;
      wcpOAV5AlbProFch_To = AV5AlbProFch_To ;
      wcpOAV6BarColNom = AV6BarColNom ;
      wcpOAV7BarColNom_To = AV7BarColNom_To ;
      wcpOAV8BarColNum = AV8BarColNum ;
      wcpOAV9BarColNum_To = AV9BarColNum_To ;
      wcpOAV10BarSer = AV10BarSer ;
      wcpOAV11BarSer_To = AV11BarSer_To ;
      wcpOAV12GuiRemCli = AV12GuiRemCli ;
      wcpOAV13GuiRemCli_To = AV13GuiRemCli_To ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV14Emprcod = httpContext.cgiGet( sPrefix+"AV14Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV14Emprcod) > 0 )
      {
         AV14Emprcod = httpContext.cgiGet( sCtrlAV14Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
      }
      else
      {
         AV14Emprcod = httpContext.cgiGet( sPrefix+"AV14Emprcod_PARM") ;
      }
      sCtrlAV15AlbProFch = httpContext.cgiGet( sPrefix+"AV15AlbProFch_CTRL") ;
      if ( GXutil.len( sCtrlAV15AlbProFch) > 0 )
      {
         AV15AlbProFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV15AlbProFch), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15AlbProFch", localUtil.format(AV15AlbProFch, "99/99/99"));
      }
      else
      {
         AV15AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV15AlbProFch_PARM"), 0) ;
      }
      sCtrlAV5AlbProFch_To = httpContext.cgiGet( sPrefix+"AV5AlbProFch_To_CTRL") ;
      if ( GXutil.len( sCtrlAV5AlbProFch_To) > 0 )
      {
         AV5AlbProFch_To = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV5AlbProFch_To), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbProFch_To", localUtil.format(AV5AlbProFch_To, "99/99/99"));
      }
      else
      {
         AV5AlbProFch_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV5AlbProFch_To_PARM"), 0) ;
      }
      sCtrlAV6BarColNom = httpContext.cgiGet( sPrefix+"AV6BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarColNom) > 0 )
      {
         AV6BarColNom = httpContext.cgiGet( sCtrlAV6BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarColNom", AV6BarColNom);
      }
      else
      {
         AV6BarColNom = httpContext.cgiGet( sPrefix+"AV6BarColNom_PARM") ;
      }
      sCtrlAV7BarColNom_To = httpContext.cgiGet( sPrefix+"AV7BarColNom_To_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarColNom_To) > 0 )
      {
         AV7BarColNom_To = httpContext.cgiGet( sCtrlAV7BarColNom_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom_To", AV7BarColNom_To);
      }
      else
      {
         AV7BarColNom_To = httpContext.cgiGet( sPrefix+"AV7BarColNom_To_PARM") ;
      }
      sCtrlAV8BarColNum = httpContext.cgiGet( sPrefix+"AV8BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarColNum) > 0 )
      {
         AV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
      }
      else
      {
         AV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9BarColNum_To = httpContext.cgiGet( sPrefix+"AV9BarColNum_To_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarColNum_To) > 0 )
      {
         AV9BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9BarColNum_To), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarColNum_To), 6, 0));
      }
      else
      {
         AV9BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9BarColNum_To_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10BarSer = httpContext.cgiGet( sPrefix+"AV10BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarSer) > 0 )
      {
         AV10BarSer = httpContext.cgiGet( sCtrlAV10BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarSer", AV10BarSer);
      }
      else
      {
         AV10BarSer = httpContext.cgiGet( sPrefix+"AV10BarSer_PARM") ;
      }
      sCtrlAV11BarSer_To = httpContext.cgiGet( sPrefix+"AV11BarSer_To_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarSer_To) > 0 )
      {
         AV11BarSer_To = httpContext.cgiGet( sCtrlAV11BarSer_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSer_To", AV11BarSer_To);
      }
      else
      {
         AV11BarSer_To = httpContext.cgiGet( sPrefix+"AV11BarSer_To_PARM") ;
      }
      sCtrlAV12GuiRemCli = httpContext.cgiGet( sPrefix+"AV12GuiRemCli_CTRL") ;
      if ( GXutil.len( sCtrlAV12GuiRemCli) > 0 )
      {
         AV12GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV12GuiRemCli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GuiRemCli), 6, 0));
      }
      else
      {
         AV12GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV12GuiRemCli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV13GuiRemCli_To = httpContext.cgiGet( sPrefix+"AV13GuiRemCli_To_CTRL") ;
      if ( GXutil.len( sCtrlAV13GuiRemCli_To) > 0 )
      {
         AV13GuiRemCli_To = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13GuiRemCli_To), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GuiRemCli_To), 6, 0));
      }
      else
      {
         AV13GuiRemCli_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13GuiRemCli_To_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paMX2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsMX2( ) ;
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
      wsMX2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Emprcod_PARM", GXutil.rtrim( AV14Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Emprcod_CTRL", GXutil.rtrim( sCtrlAV14Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15AlbProFch_PARM", localUtil.dtoc( AV15AlbProFch, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15AlbProFch)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15AlbProFch_CTRL", GXutil.rtrim( sCtrlAV15AlbProFch));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbProFch_To_PARM", localUtil.dtoc( AV5AlbProFch_To, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5AlbProFch_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbProFch_To_CTRL", GXutil.rtrim( sCtrlAV5AlbProFch_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarColNom_PARM", GXutil.rtrim( AV6BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarColNom_CTRL", GXutil.rtrim( sCtrlAV6BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarColNom_To_PARM", GXutil.rtrim( AV7BarColNom_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarColNom_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarColNom_To_CTRL", GXutil.rtrim( sCtrlAV7BarColNom_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV8BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNum_CTRL", GXutil.rtrim( sCtrlAV8BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarColNum_To_PARM", GXutil.ltrim( localUtil.ntoc( AV9BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarColNum_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarColNum_To_CTRL", GXutil.rtrim( sCtrlAV9BarColNum_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarSer_PARM", GXutil.rtrim( AV10BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarSer_CTRL", GXutil.rtrim( sCtrlAV10BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarSer_To_PARM", GXutil.rtrim( AV11BarSer_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarSer_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarSer_To_CTRL", GXutil.rtrim( sCtrlAV11BarSer_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12GuiRemCli_PARM", GXutil.ltrim( localUtil.ntoc( AV12GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12GuiRemCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12GuiRemCli_CTRL", GXutil.rtrim( sCtrlAV12GuiRemCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13GuiRemCli_To_PARM", GXutil.ltrim( localUtil.ntoc( AV13GuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13GuiRemCli_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13GuiRemCli_To_CTRL", GXutil.rtrim( sCtrlAV13GuiRemCli_To));
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
      weMX2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015563191", true, true);
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
         httpContext.AddJavascriptSource("wcentregasresumencliente.js", "?202661015563191", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Informeentregasresumencliente_Internalname = sPrefix+"INFORMEENTREGASRESUMENCLIENTE" ;
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
      Informeentregasresumencliente_Title = "" ;
      Informeentregasresumencliente_Type = "Table" ;
      Informeentregasresumencliente_Exporttohtml = GXutil.toBoolean( 0) ;
      Informeentregasresumencliente_Exporttoxml = GXutil.toBoolean( 0) ;
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
      wcpOAV14Emprcod = "" ;
      wcpOAV15AlbProFch = GXutil.nullDate() ;
      wcpOAV5AlbProFch_To = GXutil.nullDate() ;
      wcpOAV6BarColNom = "" ;
      wcpOAV7BarColNom_To = "" ;
      wcpOAV10BarSer = "" ;
      wcpOAV11BarSer_To = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV14Emprcod = "" ;
      AV15AlbProFch = GXutil.nullDate() ;
      AV5AlbProFch_To = GXutil.nullDate() ;
      AV6BarColNom = "" ;
      AV7BarColNom_To = "" ;
      AV10BarSer = "" ;
      AV11BarSer_To = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV26Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV17Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV18ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV19ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV20DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV21FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV22ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV23ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucInformeentregasresumencliente = new com.genexus.webpanels.GXUserControl();
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
      sCtrlAV14Emprcod = "" ;
      sCtrlAV15AlbProFch = "" ;
      sCtrlAV5AlbProFch_To = "" ;
      sCtrlAV6BarColNom = "" ;
      sCtrlAV7BarColNom_To = "" ;
      sCtrlAV8BarColNum = "" ;
      sCtrlAV9BarColNum_To = "" ;
      sCtrlAV10BarSer = "" ;
      sCtrlAV11BarSer_To = "" ;
      sCtrlAV12GuiRemCli = "" ;
      sCtrlAV13GuiRemCli_To = "" ;
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
   private int wcpOAV8BarColNum ;
   private int wcpOAV9BarColNum_To ;
   private int wcpOAV12GuiRemCli ;
   private int wcpOAV13GuiRemCli_To ;
   private int AV8BarColNum ;
   private int AV9BarColNum_To ;
   private int AV12GuiRemCli ;
   private int AV13GuiRemCli_To ;
   private int idxLst ;
   private String wcpOAV14Emprcod ;
   private String wcpOAV6BarColNom ;
   private String wcpOAV7BarColNom_To ;
   private String wcpOAV10BarSer ;
   private String wcpOAV11BarSer_To ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV14Emprcod ;
   private String AV6BarColNom ;
   private String AV7BarColNom_To ;
   private String AV10BarSer ;
   private String AV11BarSer_To ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informeentregasresumencliente_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Informeentregasresumencliente_Title ;
   private String Informeentregasresumencliente_Internalname ;
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
   private String sCtrlAV14Emprcod ;
   private String sCtrlAV15AlbProFch ;
   private String sCtrlAV5AlbProFch_To ;
   private String sCtrlAV6BarColNom ;
   private String sCtrlAV7BarColNom_To ;
   private String sCtrlAV8BarColNum ;
   private String sCtrlAV9BarColNum_To ;
   private String sCtrlAV10BarSer ;
   private String sCtrlAV11BarSer_To ;
   private String sCtrlAV12GuiRemCli ;
   private String sCtrlAV13GuiRemCli_To ;
   private java.util.Date wcpOAV15AlbProFch ;
   private java.util.Date wcpOAV5AlbProFch_To ;
   private java.util.Date AV15AlbProFch ;
   private java.util.Date AV5AlbProFch_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Informeentregasresumencliente_Exporttoxml ;
   private boolean Informeentregasresumencliente_Exporttohtml ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucInformeentregasresumencliente ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV26Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV17Parameters ;
   private app.SdtQueryViewerItemClickData AV18ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV19ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV20DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV21FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV22ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV23ItemCollapseData ;
}

