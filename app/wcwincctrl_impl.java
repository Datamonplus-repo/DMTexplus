package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwincctrl_impl extends GXWebComponent
{
   public wcwincctrl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwincctrl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwincctrl_impl.class ));
   }

   public wcwincctrl_impl( int remoteHandle ,
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
               AV16Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
               AV17Inc_Diainicio = localUtil.parseDateParm( httpContext.GetPar( "Inc_Diainicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Inc_Diainicio", localUtil.format(AV17Inc_Diainicio, "99/99/99"));
               AV18Inc_Diafin = localUtil.parseDateParm( httpContext.GetPar( "Inc_Diafin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Inc_Diafin", localUtil.format(AV18Inc_Diafin, "99/99/99"));
               AV15Inc_prog = httpContext.GetPar( "Inc_prog") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Inc_prog", AV15Inc_prog);
               AV19Inc_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Inc_Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Inc_Barcod), 8, 0));
               AV20Inc_BarReo = (byte)(GXutil.lval( httpContext.GetPar( "Inc_BarReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Inc_BarReo", GXutil.str( AV20Inc_BarReo, 1, 0));
               AV21Inc_Barpar = httpContext.GetPar( "Inc_Barpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Inc_Barpar", AV21Inc_Barpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV16Emprcod,AV17Inc_Diainicio,AV18Inc_Diafin,AV15Inc_prog,Integer.valueOf(AV19Inc_Barcod),Byte.valueOf(AV20Inc_BarReo),AV21Inc_Barpar});
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
         paEX2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Incidencias", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwincctrl", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV17Inc_Diainicio)),GXutil.URLEncode(GXutil.formatDateParm(AV18Inc_Diafin)),GXutil.URLEncode(GXutil.rtrim(AV15Inc_prog)),GXutil.URLEncode(GXutil.ltrimstr(AV19Inc_Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Inc_BarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21Inc_Barpar))}, new String[] {"Emprcod","Inc_Diainicio","Inc_Diafin","Inc_prog","Inc_Barcod","Inc_BarReo","Inc_Barpar"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV22Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV22Elements);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16Emprcod", GXutil.rtrim( wcpOAV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Inc_Diainicio", localUtil.dtoc( wcpOAV17Inc_Diainicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18Inc_Diafin", localUtil.dtoc( wcpOAV18Inc_Diafin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15Inc_prog", GXutil.rtrim( wcpOAV15Inc_prog));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Inc_Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV19Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20Inc_BarReo", GXutil.ltrim( localUtil.ntoc( wcpOAV20Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21Inc_Barpar", GXutil.rtrim( wcpOAV21Inc_Barpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_DIAINICIO", localUtil.dtoc( AV17Inc_Diainicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_DIAFIN", localUtil.dtoc( AV18Inc_Diafin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_PROG", GXutil.rtrim( AV15Inc_prog));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_BARCOD", GXutil.ltrim( localUtil.ntoc( AV19Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_BARREO", GXutil.ltrim( localUtil.ntoc( AV20Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINC_BARPAR", GXutil.rtrim( AV21Inc_Barpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Objectcall", GXutil.rtrim( Graf_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Objectcall", GXutil.rtrim( Graf_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Exporttopdf", GXutil.booltostr( Graf_Exporttopdf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Type", GXutil.rtrim( Graf_Type));
   }

   public void renderHtmlCloseFormEX2( )
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
      return "WCWIncCtrl" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Incidencias", "") ;
   }

   public void wbEX0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwincctrl");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucGraf.setProperty("Elements", AV22Elements);
         ucGraf.setProperty("Parameters", AV6Parameters);
         ucGraf.setProperty("ExportToPDF", Graf_Exporttopdf);
         ucGraf.setProperty("Type", Graf_Type);
         ucGraf.setProperty("Title", Graf_Title);
         ucGraf.setProperty("ItemClickData", AV7ItemClickData);
         ucGraf.setProperty("ItemDoubleClickData", AV8ItemDoubleClickData);
         ucGraf.setProperty("DragAndDropData", AV9DragAndDropData);
         ucGraf.setProperty("FilterChangedData", AV10FilterChangedData);
         ucGraf.setProperty("ItemExpandData", AV11ItemExpandData);
         ucGraf.setProperty("ItemCollapseData", AV12ItemCollapseData);
         ucGraf.render(context, "queryviewer", Graf_Internalname, sPrefix+"GRAFContainer");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startEX2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Incidencias", ""), (short)(0)) ;
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
            strupEX0( ) ;
         }
      }
   }

   public void wsEX2( )
   {
      startEX2( ) ;
      evtEX2( ) ;
   }

   public void evtEX2( )
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
                              strupEX0( ) ;
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
                              strupEX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11EX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupEX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12EX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupEX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13EX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupEX0( ) ;
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
                              strupEX0( ) ;
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

   public void weEX2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormEX2( ) ;
         }
      }
   }

   public void paEX2( )
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
      rfEX2( ) ;
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

   public void rfEX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12EX2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13EX2 ();
         wbEX0( ) ;
      }
   }

   public void send_integrity_lvl_hashesEX2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupEX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11EX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV22Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV6Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV7ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV8ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV9DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV10FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV11ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV12ItemCollapseData);
         /* Read saved values. */
         wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
         wcpOAV17Inc_Diainicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV17Inc_Diainicio"), 0) ;
         wcpOAV18Inc_Diafin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18Inc_Diafin"), 0) ;
         wcpOAV15Inc_prog = httpContext.cgiGet( sPrefix+"wcpOAV15Inc_prog") ;
         wcpOAV19Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19Inc_Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV20Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20Inc_BarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV21Inc_Barpar = httpContext.cgiGet( sPrefix+"wcpOAV21Inc_Barpar") ;
         Graf_Objectcall = httpContext.cgiGet( sPrefix+"GRAF_Objectcall") ;
         Graf_Objectcall = httpContext.cgiGet( sPrefix+"GRAF_Objectcall") ;
         Graf_Exporttopdf = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRAF_Exporttopdf")) ;
         Graf_Type = httpContext.cgiGet( sPrefix+"GRAF_Type") ;
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
      e11EX2 ();
      if (returnInSub) return;
   }

   public void e11EX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Graf_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPIncidencias")+"\", \""+GXutil.encodeJSON( AV16Emprcod)+"\", \""+GXutil.encodeJSON( localUtil.format(AV17Inc_Diainicio, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV18Inc_Diafin, "99/99/99"))+"\", \""+GXutil.encodeJSON( AV15Inc_prog)+"\", \""+GXutil.encodeJSON( GXutil.str( AV19Inc_Barcod, 8, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV20Inc_BarReo, 1, 0))+"\", \""+GXutil.encodeJSON( AV21Inc_Barpar)+"\" ]" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Object", Graf_Objectcall);
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcwincctrl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      GXv_char2[0] = AV16Emprcod ;
      GXv_char3[0] = AV27Emprnom ;
      GXv_char4[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcwincctrl_impl.this.AV16Emprcod = GXv_char2[0] ;
      wcwincctrl_impl.this.AV27Emprnom = GXv_char3[0] ;
      wcwincctrl_impl.this.AV28Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
   }

   public void e12EX2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Graf_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPIncidencias")+"\", \""+GXutil.encodeJSON( AV16Emprcod)+"\", \""+GXutil.encodeJSON( localUtil.format(AV17Inc_Diainicio, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV18Inc_Diafin, "99/99/99"))+"\", \""+GXutil.encodeJSON( AV15Inc_prog)+"\", \""+GXutil.encodeJSON( GXutil.str( AV19Inc_Barcod, 8, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV20Inc_BarReo, 1, 0))+"\", \""+GXutil.encodeJSON( AV21Inc_Barpar)+"\" ]" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Object", Graf_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13EX2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV16Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
      AV17Inc_Diainicio = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Inc_Diainicio", localUtil.format(AV17Inc_Diainicio, "99/99/99"));
      AV18Inc_Diafin = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Inc_Diafin", localUtil.format(AV18Inc_Diafin, "99/99/99"));
      AV15Inc_prog = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Inc_prog", AV15Inc_prog);
      AV19Inc_Barcod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Inc_Barcod), 8, 0));
      AV20Inc_BarReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Inc_BarReo", GXutil.str( AV20Inc_BarReo, 1, 0));
      AV21Inc_Barpar = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Inc_Barpar", AV21Inc_Barpar);
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
      paEX2( ) ;
      wsEX2( ) ;
      weEX2( ) ;
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
      sCtrlAV17Inc_Diainicio = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV18Inc_Diafin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV15Inc_prog = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV19Inc_Barcod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV20Inc_BarReo = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV21Inc_Barpar = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paEX2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwincctrl", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paEX2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV16Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
         AV17Inc_Diainicio = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Inc_Diainicio", localUtil.format(AV17Inc_Diainicio, "99/99/99"));
         AV18Inc_Diafin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Inc_Diafin", localUtil.format(AV18Inc_Diafin, "99/99/99"));
         AV15Inc_prog = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Inc_prog", AV15Inc_prog);
         AV19Inc_Barcod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Inc_Barcod), 8, 0));
         AV20Inc_BarReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Inc_BarReo", GXutil.str( AV20Inc_BarReo, 1, 0));
         AV21Inc_Barpar = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Inc_Barpar", AV21Inc_Barpar);
      }
      wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
      wcpOAV17Inc_Diainicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV17Inc_Diainicio"), 0) ;
      wcpOAV18Inc_Diafin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18Inc_Diafin"), 0) ;
      wcpOAV15Inc_prog = httpContext.cgiGet( sPrefix+"wcpOAV15Inc_prog") ;
      wcpOAV19Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19Inc_Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV20Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20Inc_BarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV21Inc_Barpar = httpContext.cgiGet( sPrefix+"wcpOAV21Inc_Barpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV16Emprcod, wcpOAV16Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV17Inc_Diainicio), GXutil.resetTime(wcpOAV17Inc_Diainicio)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV18Inc_Diafin), GXutil.resetTime(wcpOAV18Inc_Diafin)) ) || ( GXutil.strcmp(AV15Inc_prog, wcpOAV15Inc_prog) != 0 ) || ( AV19Inc_Barcod != wcpOAV19Inc_Barcod ) || ( AV20Inc_BarReo != wcpOAV20Inc_BarReo ) || ( GXutil.strcmp(AV21Inc_Barpar, wcpOAV21Inc_Barpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV16Emprcod = AV16Emprcod ;
      wcpOAV17Inc_Diainicio = AV17Inc_Diainicio ;
      wcpOAV18Inc_Diafin = AV18Inc_Diafin ;
      wcpOAV15Inc_prog = AV15Inc_prog ;
      wcpOAV19Inc_Barcod = AV19Inc_Barcod ;
      wcpOAV20Inc_BarReo = AV20Inc_BarReo ;
      wcpOAV21Inc_Barpar = AV21Inc_Barpar ;
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
      sCtrlAV17Inc_Diainicio = httpContext.cgiGet( sPrefix+"AV17Inc_Diainicio_CTRL") ;
      if ( GXutil.len( sCtrlAV17Inc_Diainicio) > 0 )
      {
         AV17Inc_Diainicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV17Inc_Diainicio), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Inc_Diainicio", localUtil.format(AV17Inc_Diainicio, "99/99/99"));
      }
      else
      {
         AV17Inc_Diainicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV17Inc_Diainicio_PARM"), 0) ;
      }
      sCtrlAV18Inc_Diafin = httpContext.cgiGet( sPrefix+"AV18Inc_Diafin_CTRL") ;
      if ( GXutil.len( sCtrlAV18Inc_Diafin) > 0 )
      {
         AV18Inc_Diafin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV18Inc_Diafin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Inc_Diafin", localUtil.format(AV18Inc_Diafin, "99/99/99"));
      }
      else
      {
         AV18Inc_Diafin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV18Inc_Diafin_PARM"), 0) ;
      }
      sCtrlAV15Inc_prog = httpContext.cgiGet( sPrefix+"AV15Inc_prog_CTRL") ;
      if ( GXutil.len( sCtrlAV15Inc_prog) > 0 )
      {
         AV15Inc_prog = httpContext.cgiGet( sCtrlAV15Inc_prog) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Inc_prog", AV15Inc_prog);
      }
      else
      {
         AV15Inc_prog = httpContext.cgiGet( sPrefix+"AV15Inc_prog_PARM") ;
      }
      sCtrlAV19Inc_Barcod = httpContext.cgiGet( sPrefix+"AV19Inc_Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV19Inc_Barcod) > 0 )
      {
         AV19Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV19Inc_Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Inc_Barcod), 8, 0));
      }
      else
      {
         AV19Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV19Inc_Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV20Inc_BarReo = httpContext.cgiGet( sPrefix+"AV20Inc_BarReo_CTRL") ;
      if ( GXutil.len( sCtrlAV20Inc_BarReo) > 0 )
      {
         AV20Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV20Inc_BarReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Inc_BarReo", GXutil.str( AV20Inc_BarReo, 1, 0));
      }
      else
      {
         AV20Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV20Inc_BarReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV21Inc_Barpar = httpContext.cgiGet( sPrefix+"AV21Inc_Barpar_CTRL") ;
      if ( GXutil.len( sCtrlAV21Inc_Barpar) > 0 )
      {
         AV21Inc_Barpar = httpContext.cgiGet( sCtrlAV21Inc_Barpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Inc_Barpar", AV21Inc_Barpar);
      }
      else
      {
         AV21Inc_Barpar = httpContext.cgiGet( sPrefix+"AV21Inc_Barpar_PARM") ;
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
      paEX2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsEX2( ) ;
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
      wsEX2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Inc_Diainicio_PARM", localUtil.dtoc( AV17Inc_Diainicio, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Inc_Diainicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Inc_Diainicio_CTRL", GXutil.rtrim( sCtrlAV17Inc_Diainicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Inc_Diafin_PARM", localUtil.dtoc( AV18Inc_Diafin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18Inc_Diafin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Inc_Diafin_CTRL", GXutil.rtrim( sCtrlAV18Inc_Diafin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Inc_prog_PARM", GXutil.rtrim( AV15Inc_prog));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15Inc_prog)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Inc_prog_CTRL", GXutil.rtrim( sCtrlAV15Inc_prog));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Inc_Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV19Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Inc_Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Inc_Barcod_CTRL", GXutil.rtrim( sCtrlAV19Inc_Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Inc_BarReo_PARM", GXutil.ltrim( localUtil.ntoc( AV20Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20Inc_BarReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Inc_BarReo_CTRL", GXutil.rtrim( sCtrlAV20Inc_BarReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Inc_Barpar_PARM", GXutil.rtrim( AV21Inc_Barpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21Inc_Barpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Inc_Barpar_CTRL", GXutil.rtrim( sCtrlAV21Inc_Barpar));
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
      weEX2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564445", true, true);
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
         httpContext.AddJavascriptSource("wcwincctrl.js", "?202661015564446", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Graf_Internalname = sPrefix+"GRAF" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
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
      Graf_Title = "" ;
      Graf_Type = "Table" ;
      Graf_Exporttopdf = GXutil.toBoolean( 0) ;
      Graf_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17Inc_Diainicio',fld:'vINC_DIAINICIO',pic:''},{av:'AV18Inc_Diafin',fld:'vINC_DIAFIN',pic:''},{av:'AV15Inc_prog',fld:'vINC_PROG',pic:''},{av:'AV19Inc_Barcod',fld:'vINC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20Inc_BarReo',fld:'vINC_BARREO',pic:'9'},{av:'AV21Inc_Barpar',fld:'vINC_BARPAR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'GRAF'}]}");
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
      wcpOAV17Inc_Diainicio = GXutil.nullDate() ;
      wcpOAV18Inc_Diafin = GXutil.nullDate() ;
      wcpOAV15Inc_prog = "" ;
      wcpOAV21Inc_Barpar = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV16Emprcod = "" ;
      AV17Inc_Diainicio = GXutil.nullDate() ;
      AV18Inc_Diafin = GXutil.nullDate() ;
      AV15Inc_prog = "" ;
      AV21Inc_Barpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
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
      ucGraf = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV26Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV27Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV28Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV16Emprcod = "" ;
      sCtrlAV17Inc_Diainicio = "" ;
      sCtrlAV18Inc_Diafin = "" ;
      sCtrlAV15Inc_prog = "" ;
      sCtrlAV19Inc_Barcod = "" ;
      sCtrlAV20Inc_BarReo = "" ;
      sCtrlAV21Inc_Barpar = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV20Inc_BarReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV20Inc_BarReo ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV19Inc_Barcod ;
   private int AV19Inc_Barcod ;
   private int idxLst ;
   private String wcpOAV16Emprcod ;
   private String wcpOAV15Inc_prog ;
   private String wcpOAV21Inc_Barpar ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV16Emprcod ;
   private String AV15Inc_prog ;
   private String AV21Inc_Barpar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Graf_Objectcall ;
   private String Graf_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Graf_Title ;
   private String Graf_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV26Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV27Emprnom ;
   private String GXv_char3[] ;
   private String AV28Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV16Emprcod ;
   private String sCtrlAV17Inc_Diainicio ;
   private String sCtrlAV18Inc_Diafin ;
   private String sCtrlAV15Inc_prog ;
   private String sCtrlAV19Inc_Barcod ;
   private String sCtrlAV20Inc_BarReo ;
   private String sCtrlAV21Inc_Barpar ;
   private java.util.Date wcpOAV17Inc_Diainicio ;
   private java.util.Date wcpOAV18Inc_Diafin ;
   private java.util.Date AV17Inc_Diainicio ;
   private java.util.Date AV18Inc_Diafin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Graf_Exporttopdf ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGraf ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV22Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV6Parameters ;
   private app.SdtQueryViewerItemClickData AV7ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV8ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV9DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV10FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV11ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV12ItemCollapseData ;
}

