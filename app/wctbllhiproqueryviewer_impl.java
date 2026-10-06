package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wctbllhiproqueryviewer_impl extends GXWebComponent
{
   public wctbllhiproqueryviewer_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wctbllhiproqueryviewer_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctbllhiproqueryviewer_impl.class ));
   }

   public wctbllhiproqueryviewer_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               AV10EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
               AV8MaqCodIni = httpContext.GetPar( "MaqCodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodIni", AV8MaqCodIni);
               AV7MaqCodFin = httpContext.GetPar( "MaqCodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFin", AV7MaqCodFin);
               AV6HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProDTI", localUtil.ttoc( AV6HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV5HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5HisProDTF", localUtil.ttoc( AV5HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV11Hisestreo = (byte)(GXutil.lval( httpContext.GetPar( "Hisestreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hisestreo", GXutil.str( AV11Hisestreo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV10EmprCod,AV8MaqCodIni,AV7MaqCodFin,AV6HisProDTI,AV5HisProDTF,Byte.valueOf(AV11Hisestreo)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         paDT2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCtbl Lhipro Query Viewer", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wctbllhiproqueryviewer", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCodIni)),GXutil.URLEncode(GXutil.rtrim(AV7MaqCodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6HisProDTI)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV5HisProDTF)),GXutil.URLEncode(GXutil.ltrimstr(AV11Hisestreo,1,0))}, new String[] {"EmprCod","MaqCodIni","MaqCodFin","HisProDTI","HisProDTF","Hisestreo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPOPRODUCCION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV9TipoProduccion), "ZZZ9")));
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV13Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV13Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV14ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV14ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV15ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV15ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV16DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV16DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV17FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV17FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV18ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV18ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV19ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV19ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10EmprCod", GXutil.rtrim( wcpOAV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqCodIni", GXutil.rtrim( wcpOAV8MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7MaqCodFin", GXutil.rtrim( wcpOAV7MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6HisProDTI", localUtil.ttoc( wcpOAV6HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5HisProDTF", localUtil.ttoc( wcpOAV5HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11Hisestreo", GXutil.ltrim( localUtil.ntoc( wcpOAV11Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV8MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV7MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV6HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV5HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV9TipoProduccion, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPOPRODUCCION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV9TipoProduccion), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV11Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Objectcall", GXutil.rtrim( Graf_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Objectcall", GXutil.rtrim( Graf_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Exporttoxml", GXutil.booltostr( Graf_Exporttoxml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Exporttohtml", GXutil.booltostr( Graf_Exporttohtml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Exporttopdf", GXutil.booltostr( Graf_Exporttopdf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Type", GXutil.rtrim( Graf_Type));
   }

   public void renderHtmlCloseFormDT2( )
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
      return "WCtblLhiproQueryViewer" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCtbl Lhipro Query Viewer", "") ;
   }

   public void wbDT0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wctbllhiproqueryviewer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucGraf.setProperty("Elements", AV22Elements);
         ucGraf.setProperty("Parameters", AV13Parameters);
         ucGraf.setProperty("ExportToXML", Graf_Exporttoxml);
         ucGraf.setProperty("ExportToHTML", Graf_Exporttohtml);
         ucGraf.setProperty("ExportToPDF", Graf_Exporttopdf);
         ucGraf.setProperty("Type", Graf_Type);
         ucGraf.setProperty("Title", Graf_Title);
         ucGraf.setProperty("ItemClickData", AV14ItemClickData);
         ucGraf.setProperty("ItemDoubleClickData", AV15ItemDoubleClickData);
         ucGraf.setProperty("DragAndDropData", AV16DragAndDropData);
         ucGraf.setProperty("FilterChangedData", AV17FilterChangedData);
         ucGraf.setProperty("ItemExpandData", AV18ItemExpandData);
         ucGraf.setProperty("ItemCollapseData", AV19ItemCollapseData);
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

   public void startDT2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCtbl Lhipro Query Viewer", ""), (short)(0)) ;
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
            strupDT0( ) ;
         }
      }
   }

   public void wsDT2( )
   {
      startDT2( ) ;
      evtDT2( ) ;
   }

   public void evtDT2( )
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
                              strupDT0( ) ;
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
                              strupDT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11DT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12DT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13DT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDT0( ) ;
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
                              strupDT0( ) ;
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

   public void weDT2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormDT2( ) ;
         }
      }
   }

   public void paDT2( )
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
      rfDT2( ) ;
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

   public void rfDT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12DT2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13DT2 ();
         wbDT0( ) ;
      }
   }

   public void send_integrity_lvl_hashesDT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV9TipoProduccion, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPOPRODUCCION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV9TipoProduccion), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupDT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11DT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV22Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV13Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV14ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV15ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV16DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV17FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV18ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV19ItemCollapseData);
         /* Read saved values. */
         wcpOAV10EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV10EmprCod") ;
         wcpOAV8MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodIni") ;
         wcpOAV7MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodFin") ;
         wcpOAV6HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProDTI"), 0) ;
         wcpOAV5HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV5HisProDTF"), 0) ;
         wcpOAV11Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Graf_Objectcall = httpContext.cgiGet( sPrefix+"GRAF_Objectcall") ;
         Graf_Objectcall = httpContext.cgiGet( sPrefix+"GRAF_Objectcall") ;
         Graf_Exporttoxml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRAF_Exporttoxml")) ;
         Graf_Exporttohtml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRAF_Exporttohtml")) ;
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
      e11DT2 ();
      if (returnInSub) return;
   }

   public void e11DT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Graf_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPtblLhipro")+"\", \""+GXutil.encodeJSON( AV10EmprCod)+"\", \""+GXutil.encodeJSON( AV8MaqCodIni)+"\", \""+GXutil.encodeJSON( AV7MaqCodFin)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV6HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV5HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( GXutil.str( AV9TipoProduccion, 4, 0))+"\" ]" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Object", Graf_Objectcall);
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wctbllhiproqueryviewer_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV27Emprnom ;
      GXv_char4[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      wctbllhiproqueryviewer_impl.this.AV10EmprCod = GXv_char2[0] ;
      wctbllhiproqueryviewer_impl.this.AV27Emprnom = GXv_char3[0] ;
      wctbllhiproqueryviewer_impl.this.AV28Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
   }

   public void e12DT2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Graf_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPtblLhipro")+"\", \""+GXutil.encodeJSON( AV10EmprCod)+"\", \""+GXutil.encodeJSON( AV8MaqCodIni)+"\", \""+GXutil.encodeJSON( AV7MaqCodFin)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV6HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV5HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( GXutil.str( AV9TipoProduccion, 4, 0))+"\" ]" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Object", Graf_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13DT2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV10EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
      AV8MaqCodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodIni", AV8MaqCodIni);
      AV7MaqCodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFin", AV7MaqCodFin);
      AV6HisProDTI = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProDTI", localUtil.ttoc( AV6HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV5HisProDTF = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5HisProDTF", localUtil.ttoc( AV5HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV11Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hisestreo", GXutil.str( AV11Hisestreo, 1, 0));
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
      paDT2( ) ;
      wsDT2( ) ;
      weDT2( ) ;
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
      sCtrlAV10EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8MaqCodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7MaqCodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV6HisProDTI = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV5HisProDTF = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV11Hisestreo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paDT2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wctbllhiproqueryviewer", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paDT2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV10EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
         AV8MaqCodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodIni", AV8MaqCodIni);
         AV7MaqCodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFin", AV7MaqCodFin);
         AV6HisProDTI = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProDTI", localUtil.ttoc( AV6HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV5HisProDTF = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5HisProDTF", localUtil.ttoc( AV5HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV11Hisestreo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hisestreo", GXutil.str( AV11Hisestreo, 1, 0));
      }
      wcpOAV10EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV10EmprCod") ;
      wcpOAV8MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodIni") ;
      wcpOAV7MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodFin") ;
      wcpOAV6HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProDTI"), 0) ;
      wcpOAV5HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV5HisProDTF"), 0) ;
      wcpOAV11Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11Hisestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV10EmprCod, wcpOAV10EmprCod) != 0 ) || ( GXutil.strcmp(AV8MaqCodIni, wcpOAV8MaqCodIni) != 0 ) || ( GXutil.strcmp(AV7MaqCodFin, wcpOAV7MaqCodFin) != 0 ) || !( GXutil.dateCompare(AV6HisProDTI, wcpOAV6HisProDTI) ) || !( GXutil.dateCompare(AV5HisProDTF, wcpOAV5HisProDTF) ) || ( AV11Hisestreo != wcpOAV11Hisestreo ) ) )
      {
         setjustcreated();
      }
      wcpOAV10EmprCod = AV10EmprCod ;
      wcpOAV8MaqCodIni = AV8MaqCodIni ;
      wcpOAV7MaqCodFin = AV7MaqCodFin ;
      wcpOAV6HisProDTI = AV6HisProDTI ;
      wcpOAV5HisProDTF = AV5HisProDTF ;
      wcpOAV11Hisestreo = AV11Hisestreo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV10EmprCod = httpContext.cgiGet( sPrefix+"AV10EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV10EmprCod) > 0 )
      {
         AV10EmprCod = httpContext.cgiGet( sCtrlAV10EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
      }
      else
      {
         AV10EmprCod = httpContext.cgiGet( sPrefix+"AV10EmprCod_PARM") ;
      }
      sCtrlAV8MaqCodIni = httpContext.cgiGet( sPrefix+"AV8MaqCodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqCodIni) > 0 )
      {
         AV8MaqCodIni = httpContext.cgiGet( sCtrlAV8MaqCodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodIni", AV8MaqCodIni);
      }
      else
      {
         AV8MaqCodIni = httpContext.cgiGet( sPrefix+"AV8MaqCodIni_PARM") ;
      }
      sCtrlAV7MaqCodFin = httpContext.cgiGet( sPrefix+"AV7MaqCodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV7MaqCodFin) > 0 )
      {
         AV7MaqCodFin = httpContext.cgiGet( sCtrlAV7MaqCodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFin", AV7MaqCodFin);
      }
      else
      {
         AV7MaqCodFin = httpContext.cgiGet( sPrefix+"AV7MaqCodFin_PARM") ;
      }
      sCtrlAV6HisProDTI = httpContext.cgiGet( sPrefix+"AV6HisProDTI_CTRL") ;
      if ( GXutil.len( sCtrlAV6HisProDTI) > 0 )
      {
         AV6HisProDTI = localUtil.ctot( httpContext.cgiGet( sCtrlAV6HisProDTI), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProDTI", localUtil.ttoc( AV6HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV6HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV6HisProDTI_PARM"), 0) ;
      }
      sCtrlAV5HisProDTF = httpContext.cgiGet( sPrefix+"AV5HisProDTF_CTRL") ;
      if ( GXutil.len( sCtrlAV5HisProDTF) > 0 )
      {
         AV5HisProDTF = localUtil.ctot( httpContext.cgiGet( sCtrlAV5HisProDTF), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5HisProDTF", localUtil.ttoc( AV5HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV5HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV5HisProDTF_PARM"), 0) ;
      }
      sCtrlAV11Hisestreo = httpContext.cgiGet( sPrefix+"AV11Hisestreo_CTRL") ;
      if ( GXutil.len( sCtrlAV11Hisestreo) > 0 )
      {
         AV11Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11Hisestreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hisestreo", GXutil.str( AV11Hisestreo, 1, 0));
      }
      else
      {
         AV11Hisestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11Hisestreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paDT2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsDT2( ) ;
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
      wsDT2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10EmprCod_PARM", GXutil.rtrim( AV10EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10EmprCod_CTRL", GXutil.rtrim( sCtrlAV10EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodIni_PARM", GXutil.rtrim( AV8MaqCodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqCodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodIni_CTRL", GXutil.rtrim( sCtrlAV8MaqCodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodFin_PARM", GXutil.rtrim( AV7MaqCodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7MaqCodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodFin_CTRL", GXutil.rtrim( sCtrlAV7MaqCodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProDTI_PARM", localUtil.ttoc( AV6HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6HisProDTI)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProDTI_CTRL", GXutil.rtrim( sCtrlAV6HisProDTI));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5HisProDTF_PARM", localUtil.ttoc( AV5HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5HisProDTF)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5HisProDTF_CTRL", GXutil.rtrim( sCtrlAV5HisProDTF));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Hisestreo_PARM", GXutil.ltrim( localUtil.ntoc( AV11Hisestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11Hisestreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Hisestreo_CTRL", GXutil.rtrim( sCtrlAV11Hisestreo));
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
      weDT2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202651993456", true, true);
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
         httpContext.AddJavascriptSource("wctbllhiproqueryviewer.js", "?202651993457", false, true);
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
      Graf_Exporttohtml = GXutil.toBoolean( 0) ;
      Graf_Exporttoxml = GXutil.toBoolean( 0) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCodIni',fld:'vMAQCODINI',pic:''},{av:'AV7MaqCodFin',fld:'vMAQCODFIN',pic:''},{av:'AV6HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV5HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV9TipoProduccion',fld:'vTIPOPRODUCCION',pic:'ZZZ9',hsh:true}]");
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
      wcpOAV10EmprCod = "" ;
      wcpOAV8MaqCodIni = "" ;
      wcpOAV7MaqCodFin = "" ;
      wcpOAV6HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV5HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV10EmprCod = "" ;
      AV8MaqCodIni = "" ;
      AV7MaqCodFin = "" ;
      AV6HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV5HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV13Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV14ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV15ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV16DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV17FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV18ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV19ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
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
      sCtrlAV10EmprCod = "" ;
      sCtrlAV8MaqCodIni = "" ;
      sCtrlAV7MaqCodFin = "" ;
      sCtrlAV6HisProDTI = "" ;
      sCtrlAV5HisProDTF = "" ;
      sCtrlAV11Hisestreo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV11Hisestreo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV11Hisestreo ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short AV9TipoProduccion ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int idxLst ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV8MaqCodIni ;
   private String wcpOAV7MaqCodFin ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV10EmprCod ;
   private String AV8MaqCodIni ;
   private String AV7MaqCodFin ;
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
   private String sCtrlAV10EmprCod ;
   private String sCtrlAV8MaqCodIni ;
   private String sCtrlAV7MaqCodFin ;
   private String sCtrlAV6HisProDTI ;
   private String sCtrlAV5HisProDTF ;
   private String sCtrlAV11Hisestreo ;
   private java.util.Date wcpOAV6HisProDTI ;
   private java.util.Date wcpOAV5HisProDTF ;
   private java.util.Date AV6HisProDTI ;
   private java.util.Date AV5HisProDTF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Graf_Exporttoxml ;
   private boolean Graf_Exporttohtml ;
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
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV13Parameters ;
   private app.SdtQueryViewerItemClickData AV14ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV15ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV16DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV17FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV18ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV19ItemCollapseData ;
}

