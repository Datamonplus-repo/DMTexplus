package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mant_cliente_impl extends GXWebComponent
{
   public mant_cliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mant_cliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_cliente_impl.class ));
   }

   public mant_cliente_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "MADetEmprCod") ;
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
               AV15MADetEmprCod = httpContext.GetPar( "MADetEmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MADetEmprCod", AV15MADetEmprCod);
               AV16CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
               AV17ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ArtCod", AV17ArtCod);
               AV18ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
               AV19TipMaqCodJSON = httpContext.GetPar( "TipMaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipMaqCodJSON", AV19TipMaqCodJSON);
               AV23FechaInicio = localUtil.parseDateParm( httpContext.GetPar( "FechaInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FechaInicio", localUtil.format(AV23FechaInicio, "99/99/99"));
               AV24FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24FechaFin", localUtil.format(AV24FechaFin, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV15MADetEmprCod,Integer.valueOf(AV16CliCod),AV17ArtCod,Integer.valueOf(AV18ForColNum),AV19TipMaqCodJSON,AV23FechaInicio,AV24FechaFin});
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
               gxfirstwebparm = httpContext.GetFirstPar( "MADetEmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "MADetEmprCod") ;
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
         pa2DV2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "MAnt_Cliente", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mant_cliente", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15MADetEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV19TipMaqCodJSON)),GXutil.URLEncode(GXutil.formatDateParm(AV23FechaInicio)),GXutil.URLEncode(GXutil.formatDateParm(AV24FechaFin))}, new String[] {"MADetEmprCod","CliCod","ArtCod","ForColNum","TipMaqCodJSON","FechaInicio","FechaFin"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Cliente");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV27Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant_cliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV5Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV5Elements);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15MADetEmprCod", GXutil.rtrim( wcpOAV15MADetEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17ArtCod", GXutil.rtrim( wcpOAV17ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV18ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19TipMaqCodJSON", wcpOAV19TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23FechaInicio", localUtil.dtoc( wcpOAV23FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24FechaFin", localUtil.dtoc( wcpOAV24FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMADETEMPRCOD", GXutil.rtrim( AV15MADetEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD", GXutil.rtrim( AV17ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV18ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMAQCODJSON", AV19TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINICIO", localUtil.dtoc( AV23FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFIN", localUtil.dtoc( AV24FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLIENTE_QUERY_Allowselection", GXutil.booltostr( Cliente_query_Allowselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLIENTE_QUERY_Type", GXutil.rtrim( Cliente_query_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLIENTE_QUERY_Pagesize", GXutil.ltrim( localUtil.ntoc( Cliente_query_Pagesize, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2DV2( )
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
      return "AnticipacionErrores.MAnt_Cliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAnt_Cliente", "") ;
   }

   public void wb2DV0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.anticipacionerrores.mant_cliente");
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
         ucCliente_query.setProperty("Elements", AV5Elements);
         ucCliente_query.setProperty("Parameters", AV6Parameters);
         ucCliente_query.setProperty("AllowSelection", Cliente_query_Allowselection);
         ucCliente_query.setProperty("Type", Cliente_query_Type);
         ucCliente_query.setProperty("Title", Cliente_query_Title);
         ucCliente_query.setProperty("PageSize", Cliente_query_Pagesize);
         ucCliente_query.setProperty("ItemClickData", AV7ItemClickData);
         ucCliente_query.setProperty("ItemDoubleClickData", AV8ItemDoubleClickData);
         ucCliente_query.setProperty("DragAndDropData", AV9DragAndDropData);
         ucCliente_query.setProperty("FilterChangedData", AV10FilterChangedData);
         ucCliente_query.setProperty("ItemExpandData", AV11ItemExpandData);
         ucCliente_query.setProperty("ItemCollapseData", AV12ItemCollapseData);
         ucCliente_query.render(context, "queryviewer", Cliente_query_Internalname, sPrefix+"CLIENTE_QUERYContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Cliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2DV2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "MAnt_Cliente", ""), (short)(0)) ;
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
            strup2DV0( ) ;
         }
      }
   }

   public void ws2DV2( )
   {
      start2DV2( ) ;
      evt2DV2( ) ;
   }

   public void evt2DV2( )
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
                              strup2DV0( ) ;
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
                              strup2DV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e112DV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e122DV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DV0( ) ;
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
                              strup2DV0( ) ;
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

   public void we2DV2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DV2( ) ;
         }
      }
   }

   public void pa2DV2( )
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
      rf2DV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV27Pgmname = "AnticipacionErrores.MAnt_Cliente" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Pgmname", AV27Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e122DV2 ();
         wb2DV0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2DV2( )
   {
   }

   public void before_start_formulas( )
   {
      AV27Pgmname = "AnticipacionErrores.MAnt_Cliente" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Pgmname", AV27Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112DV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV5Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV6Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV7ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV8ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV9DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV10FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV11ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV12ItemCollapseData);
         /* Read saved values. */
         wcpOAV15MADetEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV15MADetEmprCod") ;
         wcpOAV16CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV17ArtCod") ;
         wcpOAV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV19TipMaqCodJSON") ;
         wcpOAV23FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23FechaInicio"), 0) ;
         wcpOAV24FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24FechaFin"), 0) ;
         Cliente_query_Allowselection = GXutil.strtobool( httpContext.cgiGet( sPrefix+"CLIENTE_QUERY_Allowselection")) ;
         Cliente_query_Type = httpContext.cgiGet( sPrefix+"CLIENTE_QUERY_Type") ;
         Cliente_query_Pagesize = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"CLIENTE_QUERY_Pagesize"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Cliente");
         AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Pgmname", AV27Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV27Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("anticipacionerrores\\mant_cliente:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e112DV2 ();
      if (returnInSub) return;
   }

   public void e112DV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV20TipMaqCodCollection.fromJSonString(AV19TipMaqCodJSON, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Ingresando con filtros Detalle para Empresa=%1, Cliente=%2, Articulo:%3, Color=%4, Tipo Maquinas:%5, Fechas:%6-%7.", ""), AV15MADetEmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0), AV17ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0), AV20TipMaqCodCollection.toJSonString(false), localUtil.dtoc( AV23FechaInicio, 0, "-"), localUtil.dtoc( AV24FechaFin, 0, "-"), "", ""), AV27Pgmname) ;
      AV22sdtMTok.fromJSonString(AV21WebSession.getValue("TexplusNET_Token"), null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Detalle .. Web Session token>%1", ""), AV22sdtMTok.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV27Pgmname) ;
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mant_cliente_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      GXv_char2[0] = AV29Emprcod ;
      GXv_char3[0] = AV30Emprnom ;
      GXv_char4[0] = AV31Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      mant_cliente_impl.this.AV29Emprcod = GXv_char2[0] ;
      mant_cliente_impl.this.AV30Emprnom = GXv_char3[0] ;
      mant_cliente_impl.this.AV31Usurcod = GXv_char4[0] ;
   }

   protected void nextLoad( )
   {
   }

   protected void e122DV2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV15MADetEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MADetEmprCod", AV15MADetEmprCod);
      AV16CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      AV17ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ArtCod", AV17ArtCod);
      AV18ForColNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
      AV19TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipMaqCodJSON", AV19TipMaqCodJSON);
      AV23FechaInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FechaInicio", localUtil.format(AV23FechaInicio, "99/99/99"));
      AV24FechaFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24FechaFin", localUtil.format(AV24FechaFin, "99/99/99"));
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
      pa2DV2( ) ;
      ws2DV2( ) ;
      we2DV2( ) ;
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
      sCtrlAV15MADetEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV16CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV17ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV18ForColNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV19TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV23FechaInicio = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV24FechaFin = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DV2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "anticipacionerrores\\mant_cliente", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DV2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV15MADetEmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MADetEmprCod", AV15MADetEmprCod);
         AV16CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
         AV17ArtCod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ArtCod", AV17ArtCod);
         AV18ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
         AV19TipMaqCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipMaqCodJSON", AV19TipMaqCodJSON);
         AV23FechaInicio = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FechaInicio", localUtil.format(AV23FechaInicio, "99/99/99"));
         AV24FechaFin = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24FechaFin", localUtil.format(AV24FechaFin, "99/99/99"));
      }
      wcpOAV15MADetEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV15MADetEmprCod") ;
      wcpOAV16CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV17ArtCod") ;
      wcpOAV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV19TipMaqCodJSON") ;
      wcpOAV23FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23FechaInicio"), 0) ;
      wcpOAV24FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24FechaFin"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV15MADetEmprCod, wcpOAV15MADetEmprCod) != 0 ) || ( AV16CliCod != wcpOAV16CliCod ) || ( GXutil.strcmp(AV17ArtCod, wcpOAV17ArtCod) != 0 ) || ( AV18ForColNum != wcpOAV18ForColNum ) || ( GXutil.strcmp(AV19TipMaqCodJSON, wcpOAV19TipMaqCodJSON) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV23FechaInicio), GXutil.resetTime(wcpOAV23FechaInicio)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV24FechaFin), GXutil.resetTime(wcpOAV24FechaFin)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV15MADetEmprCod = AV15MADetEmprCod ;
      wcpOAV16CliCod = AV16CliCod ;
      wcpOAV17ArtCod = AV17ArtCod ;
      wcpOAV18ForColNum = AV18ForColNum ;
      wcpOAV19TipMaqCodJSON = AV19TipMaqCodJSON ;
      wcpOAV23FechaInicio = AV23FechaInicio ;
      wcpOAV24FechaFin = AV24FechaFin ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV15MADetEmprCod = httpContext.cgiGet( sPrefix+"AV15MADetEmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV15MADetEmprCod) > 0 )
      {
         AV15MADetEmprCod = httpContext.cgiGet( sCtrlAV15MADetEmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MADetEmprCod", AV15MADetEmprCod);
      }
      else
      {
         AV15MADetEmprCod = httpContext.cgiGet( sPrefix+"AV15MADetEmprCod_PARM") ;
      }
      sCtrlAV16CliCod = httpContext.cgiGet( sPrefix+"AV16CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV16CliCod) > 0 )
      {
         AV16CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV16CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      }
      else
      {
         AV16CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV16CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17ArtCod = httpContext.cgiGet( sPrefix+"AV17ArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV17ArtCod) > 0 )
      {
         AV17ArtCod = httpContext.cgiGet( sCtrlAV17ArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ArtCod", AV17ArtCod);
      }
      else
      {
         AV17ArtCod = httpContext.cgiGet( sPrefix+"AV17ArtCod_PARM") ;
      }
      sCtrlAV18ForColNum = httpContext.cgiGet( sPrefix+"AV18ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV18ForColNum) > 0 )
      {
         AV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV18ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
      }
      else
      {
         AV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV18ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV19TipMaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV19TipMaqCodJSON) > 0 )
      {
         AV19TipMaqCodJSON = httpContext.cgiGet( sCtrlAV19TipMaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipMaqCodJSON", AV19TipMaqCodJSON);
      }
      else
      {
         AV19TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV19TipMaqCodJSON_PARM") ;
      }
      sCtrlAV23FechaInicio = httpContext.cgiGet( sPrefix+"AV23FechaInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV23FechaInicio) > 0 )
      {
         AV23FechaInicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV23FechaInicio), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FechaInicio", localUtil.format(AV23FechaInicio, "99/99/99"));
      }
      else
      {
         AV23FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV23FechaInicio_PARM"), 0) ;
      }
      sCtrlAV24FechaFin = httpContext.cgiGet( sPrefix+"AV24FechaFin_CTRL") ;
      if ( GXutil.len( sCtrlAV24FechaFin) > 0 )
      {
         AV24FechaFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV24FechaFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24FechaFin", localUtil.format(AV24FechaFin, "99/99/99"));
      }
      else
      {
         AV24FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV24FechaFin_PARM"), 0) ;
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
      pa2DV2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DV2( ) ;
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
      ws2DV2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15MADetEmprCod_PARM", GXutil.rtrim( AV15MADetEmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15MADetEmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15MADetEmprCod_CTRL", GXutil.rtrim( sCtrlAV15MADetEmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16CliCod_CTRL", GXutil.rtrim( sCtrlAV16CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17ArtCod_PARM", GXutil.rtrim( AV17ArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17ArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17ArtCod_CTRL", GXutil.rtrim( sCtrlAV17ArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV18ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ForColNum_CTRL", GXutil.rtrim( sCtrlAV18ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19TipMaqCodJSON_PARM", AV19TipMaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19TipMaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19TipMaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV19TipMaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23FechaInicio_PARM", localUtil.dtoc( AV23FechaInicio, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23FechaInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23FechaInicio_CTRL", GXutil.rtrim( sCtrlAV23FechaInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24FechaFin_PARM", localUtil.dtoc( AV24FechaFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24FechaFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24FechaFin_CTRL", GXutil.rtrim( sCtrlAV24FechaFin));
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
      we2DV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202679858814", true, true);
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
         httpContext.AddJavascriptSource("anticipacionerrores/mant_cliente.js", "?202679858815", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Cliente_query_Internalname = sPrefix+"CLIENTE_QUERY" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Cliente_query_Title = "" ;
      Cliente_query_Pagesize = 20 ;
      Cliente_query_Type = "PivotTable" ;
      Cliente_query_Allowselection = GXutil.toBoolean( 1) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV27Pgmname',fld:'vPGMNAME',pic:''}]");
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
      wcpOAV15MADetEmprCod = "" ;
      wcpOAV17ArtCod = "" ;
      wcpOAV19TipMaqCodJSON = "" ;
      wcpOAV23FechaInicio = GXutil.nullDate() ;
      wcpOAV24FechaFin = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV15MADetEmprCod = "" ;
      AV17ArtCod = "" ;
      AV19TipMaqCodJSON = "" ;
      AV23FechaInicio = GXutil.nullDate() ;
      AV24FechaFin = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27Pgmname = "" ;
      AV5Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
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
      ucCliente_query = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV20TipMaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV21WebSession = httpContext.getWebSession();
      AV28Station = "" ;
      GXt_char1 = "" ;
      AV29Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV30Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV31Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV15MADetEmprCod = "" ;
      sCtrlAV16CliCod = "" ;
      sCtrlAV17ArtCod = "" ;
      sCtrlAV18ForColNum = "" ;
      sCtrlAV19TipMaqCodJSON = "" ;
      sCtrlAV23FechaInicio = "" ;
      sCtrlAV24FechaFin = "" ;
      AV27Pgmname = "AnticipacionErrores.MAnt_Cliente" ;
      /* GeneXus formulas. */
      AV27Pgmname = "AnticipacionErrores.MAnt_Cliente" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
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
   private int wcpOAV16CliCod ;
   private int wcpOAV18ForColNum ;
   private int AV16CliCod ;
   private int AV18ForColNum ;
   private int Cliente_query_Pagesize ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private String wcpOAV15MADetEmprCod ;
   private String wcpOAV17ArtCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV15MADetEmprCod ;
   private String AV17ArtCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV27Pgmname ;
   private String Cliente_query_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Cliente_query_Title ;
   private String Cliente_query_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV28Station ;
   private String GXt_char1 ;
   private String AV29Emprcod ;
   private String GXv_char2[] ;
   private String AV30Emprnom ;
   private String GXv_char3[] ;
   private String AV31Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV15MADetEmprCod ;
   private String sCtrlAV16CliCod ;
   private String sCtrlAV17ArtCod ;
   private String sCtrlAV18ForColNum ;
   private String sCtrlAV19TipMaqCodJSON ;
   private String sCtrlAV23FechaInicio ;
   private String sCtrlAV24FechaFin ;
   private java.util.Date wcpOAV23FechaInicio ;
   private java.util.Date wcpOAV24FechaFin ;
   private java.util.Date AV23FechaInicio ;
   private java.util.Date AV24FechaFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Cliente_query_Allowselection ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String wcpOAV19TipMaqCodJSON ;
   private String AV19TipMaqCodJSON ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV21WebSession ;
   private com.genexus.webpanels.GXUserControl ucCliente_query ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV20TipMaqCodCollection ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV5Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV6Parameters ;
   private app.SdtQueryViewerItemClickData AV7ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV8ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV9DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV10FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV11ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV12ItemCollapseData ;
   private app.anticipacionerrores.SdtsdtMTok AV22sdtMTok ;
}

