package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultamaquinasqueryviewer_impl extends GXWebPanel
{
   public consultamaquinasqueryviewer_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultamaquinasqueryviewer_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultamaquinasqueryviewer_impl.class ));
   }

   public consultamaquinasqueryviewer_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa942( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws942( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we942( ) ;
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
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultamaquinasqueryviewer", new String[] {}, new String[] {}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_GxRefreshTimeout", "{\"Type\":\"always\",\"Time\":\"60\"}");
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vAXES", AV8Axes);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vAXES", AV8Axes);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCLICKDATA", AV61ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCLICKDATA", AV61ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMDOUBLECLICKDATA", AV63ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMDOUBLECLICKDATA", AV63ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDRAGANDDROPDATA", AV16DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDRAGANDDROPDATA", AV16DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERCHANGEDDATA", AV24FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERCHANGEDDATA", AV24FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMEXPANDDATA", AV64ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMEXPANDDATA", AV64ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCOLLAPSEDATA", AV62ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCOLLAPSEDATA", AV62ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Objectname", GXutil.rtrim( Queryviewer1_Objectname));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Autoresize", GXutil.booltostr( Queryviewer1_Autoresize));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Visible", GXutil.booltostr( Queryviewer1_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER2_Objectname", GXutil.rtrim( Queryviewer2_Objectname));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER2_Width", GXutil.rtrim( Queryviewer2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER2_Height", GXutil.rtrim( Queryviewer2_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER2_Xaxislabels", GXutil.rtrim( Queryviewer2_Xaxislabels));
   }

   public void renderHtmlCloseForm942( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "ConsultaMaquinasQueryViewer" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Maquinas Query Viewer", "") ;
   }

   public void wb940( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
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
         wb_table1_9_942( true) ;
      }
      else
      {
         wb_table1_9_942( false) ;
      }
      return  ;
   }

   public void wb_table1_9_942e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucQueryviewer1.setProperty("Elements", AV8Axes);
         ucQueryviewer1.setProperty("Parameters", AV17EmprCod);
         ucQueryviewer1.setProperty("ObjectName", Queryviewer1_Objectname);
         ucQueryviewer1.setProperty("AutoResize", Queryviewer1_Autoresize);
         ucQueryviewer1.setProperty("Title", Queryviewer1_Title);
         ucQueryviewer1.setProperty("ItemClickData", AV61ItemClickData);
         ucQueryviewer1.setProperty("ItemDoubleClickData", AV63ItemDoubleClickData);
         ucQueryviewer1.setProperty("DragAndDropData", AV16DragAndDropData);
         ucQueryviewer1.setProperty("FilterChangedData", AV24FilterChangedData);
         ucQueryviewer1.setProperty("ItemExpandData", AV64ItemExpandData);
         ucQueryviewer1.setProperty("ItemCollapseData", AV62ItemCollapseData);
         ucQueryviewer1.render(context, "queryviewer", Queryviewer1_Internalname, "QUERYVIEWER1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucQueryviewer2.setProperty("Elements", AV8Axes);
         ucQueryviewer2.setProperty("Parameters", AV17EmprCod);
         ucQueryviewer2.setProperty("ObjectName", Queryviewer2_Objectname);
         ucQueryviewer2.setProperty("Width", Queryviewer2_Width);
         ucQueryviewer2.setProperty("Height", Queryviewer2_Height);
         ucQueryviewer2.setProperty("Title", Queryviewer2_Title);
         ucQueryviewer2.setProperty("XAxisLabels", Queryviewer2_Xaxislabels);
         ucQueryviewer2.setProperty("ItemClickData", AV61ItemClickData);
         ucQueryviewer2.setProperty("ItemDoubleClickData", AV63ItemDoubleClickData);
         ucQueryviewer2.setProperty("DragAndDropData", AV16DragAndDropData);
         ucQueryviewer2.setProperty("FilterChangedData", AV24FilterChangedData);
         ucQueryviewer2.setProperty("ItemExpandData", AV64ItemExpandData);
         ucQueryviewer2.setProperty("ItemCollapseData", AV62ItemCollapseData);
         ucQueryviewer2.render(context, "queryviewer", Queryviewer2_Internalname, "QUERYVIEWER2Container");
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

   public void start942( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Maquinas Query Viewer", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup940( ) ;
   }

   public void ws942( )
   {
      start942( ) ;
      evt942( ) ;
   }

   public void evt942( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
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
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11942 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e12942 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! wbErr )
                        {
                           Rfr0gs = false ;
                           if ( ! Rfr0gs )
                           {
                           }
                           dynload_actions( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
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

   public void we942( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm942( ) ;
         }
      }
   }

   public void pa942( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavEmprcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      rf942( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV184Pgmname = "ConsultaMaquinasQueryViewer" ;
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavEmprnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Enabled), 5, 0), true);
      edtavFechahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechahora_Enabled), 5, 0), true);
   }

   public void rf942( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e12942 ();
         wb940( ) ;
      }
   }

   public void send_integrity_lvl_hashes942( )
   {
   }

   public void before_start_formulas( )
   {
      AV184Pgmname = "ConsultaMaquinasQueryViewer" ;
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavEmprnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Enabled), 5, 0), true);
      edtavFechahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechahora_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup940( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11942 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vAXES"), AV8Axes);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCLICKDATA"), AV61ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMDOUBLECLICKDATA"), AV63ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDRAGANDDROPDATA"), AV16DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILTERCHANGEDDATA"), AV24FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMEXPANDDATA"), AV64ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCOLLAPSEDATA"), AV62ItemCollapseData);
         /* Read saved values. */
         Queryviewer1_Objectname = httpContext.cgiGet( "QUERYVIEWER1_Objectname") ;
         Queryviewer1_Autoresize = GXutil.strtobool( httpContext.cgiGet( "QUERYVIEWER1_Autoresize")) ;
         Queryviewer1_Visible = GXutil.strtobool( httpContext.cgiGet( "QUERYVIEWER1_Visible")) ;
         Queryviewer2_Objectname = httpContext.cgiGet( "QUERYVIEWER2_Objectname") ;
         Queryviewer2_Width = httpContext.cgiGet( "QUERYVIEWER2_Width") ;
         Queryviewer2_Height = httpContext.cgiGet( "QUERYVIEWER2_Height") ;
         Queryviewer2_Xaxislabels = httpContext.cgiGet( "QUERYVIEWER2_Xaxislabels") ;
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
      e11942 ();
      if (returnInSub) return;
   }

   public void e11942( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV181KeyAutenticacion = "TexplusNET_Autentication" ;
      AV10CadenaAutenticacion = AV7WebSession.getValue(AV181KeyAutenticacion) ;
      AV5SdtAutenticacion.fromJSonString(AV10CadenaAutenticacion, null);
      AV6UsurCod = httpContext.decrypt64( AV5SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03(), AV5SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
      AV15DiaCreacion = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV179Version = GXutil.trim( GXutil.str( GXutil.year( AV15DiaCreacion), 10, 0)) ;
      AV179Version += GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV15DiaCreacion), 10, 0)), (short)(2), "0") ;
      AV179Version += GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV15DiaCreacion), 10, 0)), (short)(2), "0") ;
      AV179Version += "." + GXutil.padl( GXutil.trim( GXutil.str( GXutil.hour( AV15DiaCreacion), 10, 0)), (short)(2), "0") ;
      AV179Version += GXutil.padl( GXutil.trim( GXutil.str( GXutil.minute( AV15DiaCreacion), 10, 0)), (short)(2), "0") ;
      Form.setCaption( httpContext.getMessage( " [build GX16 16.0.140712 U9 Java MSSQL ", "")+AV179Version+"]" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      GXt_char1 = AV95Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      consultamaquinasqueryviewer_impl.this.GXt_char1 = GXv_char2[0] ;
      AV95Lit0 = GXt_char1 ;
      GXt_char1 = AV97Litfe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      consultamaquinasqueryviewer_impl.this.GXt_char1 = GXv_char2[0] ;
      AV97Litfe = GXt_char1 ;
      GXt_char1 = AV96Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV184Pgmname, (byte)(99), GXv_char2) ;
      consultamaquinasqueryviewer_impl.this.GXt_char1 = GXv_char2[0] ;
      AV96Lit2 = GXt_char1 ;
      AV165Station = "NE" + GXutil.trim( AV6UsurCod) ;
      GXv_char2[0] = AV17EmprCod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char4[0] = AV6UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV165Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultamaquinasqueryviewer_impl.this.AV17EmprCod = GXv_char2[0] ;
      consultamaquinasqueryviewer_impl.this.AV18EmprNom = GXv_char3[0] ;
      consultamaquinasqueryviewer_impl.this.AV6UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprNom", AV18EmprNom);
      if ( (GXutil.strcmp("", AV17EmprCod)==0) || (GXutil.strcmp("", AV6UsurCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error en Conexión, por favor contactar a Datamonplus", ""));
      }
      AV21fechahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21fechahora", localUtil.ttoc( AV21fechahora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Queryviewer1_Visible = (boolean)((!(GXutil.strcmp("", AV5SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03())==0))) ;
      ucQueryviewer1.sendProperty(context, "", false, Queryviewer1_Internalname, "Visible", GXutil.booltostr( Queryviewer1_Visible));
      tblTablemergedemprcod_Backcolor = GXutil.getColor( 140, 43, 44) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTablemergedemprcod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTablemergedemprcod_Backcolor), 9, 0), true);
      edtavEmprcod_Fontsize = lblLogodsc_Fontsize ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Fontsize), 9, 0), true);
      edtavEmprcod_Forecolor = GXutil.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Forecolor), 9, 0), true);
      edtavEmprnom_Fontsize = lblLogodsc_Fontsize ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Fontsize), 9, 0), true);
      edtavEmprnom_Forecolor = GXutil.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Forecolor), 9, 0), true);
      edtavFechahora_Fontsize = lblLogodsc_Fontsize ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechahora_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechahora_Fontsize), 9, 0), true);
      edtavFechahora_Backcolor = GXutil.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechahora_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechahora_Backcolor), 9, 0), true);
      edtavFechahora_Forecolor = GXutil.getColor( 140, 43, 44) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechahora_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechahora_Forecolor), 9, 0), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e12942( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_9_942( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString += "background-color: " + WebUtils.getHTMLColor( tblTablemergedemprcod_Backcolor) + ";" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedemprcod_Internalname, tblTablemergedemprcod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "ImageTopHeader" + " " + ((GXutil.strcmp(imgHeader_gximage, "")==0) ? "GX_Image_LogoIcon_Class" : "GX_Image_"+imgHeader_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "71cec38d-9a7e-40bc-ac60-7fcee0b329b2", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgHeader_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ConsultaMaquinasQueryViewer.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblLogodsc_Internalname, httpContext.getMessage( "TEXPLUS", ""), "", "", lblLogodsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockLogo", 0, "", 1, 1, 0, (short)(0), "HLP_ConsultaMaquinasQueryViewer.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprcod_Internalname, httpContext.getMessage( "Código Empresa", ""), "gx-form-item TextBlockLogoLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV17EmprCod), GXutil.rtrim( localUtil.format( AV17EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,17);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "TextBlockLogo", "font-size:"+GXutil.str( edtavEmprcod_Fontsize, 3, 0)+"pt;"+"color:"+WebUtils.getHTMLColor( edtavEmprcod_Forecolor)+";", "", "", "", 1, edtavEmprcod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_ConsultaMaquinasQueryViewer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprnom_Internalname, httpContext.getMessage( "Nombre", ""), "gx-form-item TextBlockLogoLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom_Internalname, GXutil.rtrim( AV18EmprNom), GXutil.rtrim( localUtil.format( AV18EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom_Jsonclick, 0, "TextBlockLogo", "font-size:"+GXutil.str( edtavEmprnom_Fontsize, 3, 0)+"pt;"+"color:"+WebUtils.getHTMLColor( edtavEmprnom_Forecolor)+";", "", "", "", 1, edtavEmprnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_ConsultaMaquinasQueryViewer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechahora_Internalname, httpContext.getMessage( "fechahora", ""), "gx-form-item TextBlockLogoLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechahora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechahora_Internalname, localUtil.ttoc( AV21fechahora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV21fechahora, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechahora_Jsonclick, 0, "TextBlockLogo", "font-size:"+GXutil.str( edtavFechahora_Fontsize, 3, 0)+"pt;"+"color:"+WebUtils.getHTMLColor( edtavFechahora_Forecolor)+";"+((edtavFechahora_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavFechahora_Backcolor)+";"), "", "", "", 1, edtavFechahora_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_ConsultaMaquinasQueryViewer.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechahora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechahora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultaMaquinasQueryViewer.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_9_942e( true) ;
      }
      else
      {
         wb_table1_9_942e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa942( ) ;
      ws942( ) ;
      we942( ) ;
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116112588", true, true);
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
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("consultamaquinasqueryviewer.js", "?202682116112589", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgHeader_Internalname = "HEADER" ;
      lblLogodsc_Internalname = "LOGODSC" ;
      edtavEmprcod_Internalname = "vEMPRCOD" ;
      edtavEmprnom_Internalname = "vEMPRNOM" ;
      edtavFechahora_Internalname = "vFECHAHORA" ;
      tblTablemergedemprcod_Internalname = "TABLEMERGEDEMPRCOD" ;
      Queryviewer1_Internalname = "QUERYVIEWER1" ;
      Queryviewer2_Internalname = "QUERYVIEWER2" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavFechahora_Jsonclick = "" ;
      edtavFechahora_Backstyle = (byte)(-1) ;
      edtavFechahora_Enabled = 1 ;
      edtavEmprnom_Jsonclick = "" ;
      edtavEmprnom_Enabled = 1 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 1 ;
      edtavFechahora_Forecolor = (int)(0xFFFF00) ;
      edtavFechahora_Backcolor = (int)(0x00FF00) ;
      edtavFechahora_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      edtavEmprnom_Forecolor = (int)(0x000000) ;
      edtavEmprnom_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      edtavEmprcod_Forecolor = (int)(0x000000) ;
      edtavEmprcod_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      lblLogodsc_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      tblTablemergedemprcod_Backcolor = (int)(0x000000) ;
      Queryviewer2_Title = "" ;
      Queryviewer1_Title = "" ;
      Queryviewer2_Xaxislabels = "Vertically" ;
      Queryviewer2_Height = "50%" ;
      Queryviewer2_Width = "50%" ;
      Queryviewer2_Objectname = "QVConsultaMaquinasChart" ;
      Queryviewer1_Visible = GXutil.toBoolean( -1) ;
      Queryviewer1_Autoresize = GXutil.toBoolean( -1) ;
      Queryviewer1_Objectname = "QVConsultaMaquinas" ;
      Form.setCaption( httpContext.getMessage( "Consulta Maquinas Query Viewer", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV8Axes = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV61ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV63ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV16DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV24FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV64ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV62ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucQueryviewer1 = new com.genexus.webpanels.GXUserControl();
      AV17EmprCod = "" ;
      ucQueryviewer2 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV184Pgmname = "" ;
      AV181KeyAutenticacion = "" ;
      AV10CadenaAutenticacion = "" ;
      AV7WebSession = httpContext.getWebSession();
      AV5SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV6UsurCod = "" ;
      AV15DiaCreacion = GXutil.resetTime( GXutil.nullDate() );
      AV179Version = "" ;
      AV95Lit0 = "" ;
      AV97Litfe = "" ;
      AV96Lit2 = "" ;
      GXt_char1 = "" ;
      AV165Station = "" ;
      GXv_char2 = new String[1] ;
      AV18EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV21fechahora = GXutil.resetTime( GXutil.nullDate() );
      sStyleString = "" ;
      imgHeader_gximage = "" ;
      sImgUrl = "" ;
      lblLogodsc_Jsonclick = "" ;
      TempTags = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultamaquinasqueryviewer__default(),
         new Object[] {
         }
      );
      AV184Pgmname = "ConsultaMaquinasQueryViewer" ;
      /* GeneXus formulas. */
      AV184Pgmname = "ConsultaMaquinasQueryViewer" ;
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      edtavEmprnom_Enabled = 0 ;
      edtavFechahora_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte edtavFechahora_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavEmprcod_Enabled ;
   private int edtavEmprnom_Enabled ;
   private int edtavFechahora_Enabled ;
   private int tblTablemergedemprcod_Backcolor ;
   private int edtavEmprcod_Fontsize ;
   private int lblLogodsc_Fontsize ;
   private int edtavEmprcod_Forecolor ;
   private int edtavEmprnom_Fontsize ;
   private int edtavEmprnom_Forecolor ;
   private int edtavFechahora_Fontsize ;
   private int edtavFechahora_Backcolor ;
   private int edtavFechahora_Forecolor ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Queryviewer1_Objectname ;
   private String Queryviewer2_Objectname ;
   private String Queryviewer2_Width ;
   private String Queryviewer2_Height ;
   private String Queryviewer2_Xaxislabels ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String AV17EmprCod ;
   private String Queryviewer1_Title ;
   private String Queryviewer1_Internalname ;
   private String Queryviewer2_Title ;
   private String Queryviewer2_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavEmprcod_Internalname ;
   private String AV184Pgmname ;
   private String edtavEmprnom_Internalname ;
   private String edtavFechahora_Internalname ;
   private String AV6UsurCod ;
   private String GXt_char1 ;
   private String AV165Station ;
   private String GXv_char2[] ;
   private String AV18EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String tblTablemergedemprcod_Internalname ;
   private String sStyleString ;
   private String imgHeader_gximage ;
   private String sImgUrl ;
   private String imgHeader_Internalname ;
   private String lblLogodsc_Internalname ;
   private String lblLogodsc_Jsonclick ;
   private String TempTags ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavEmprnom_Jsonclick ;
   private String edtavFechahora_Jsonclick ;
   private java.util.Date AV15DiaCreacion ;
   private java.util.Date AV21fechahora ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Queryviewer1_Autoresize ;
   private boolean Queryviewer1_Visible ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV181KeyAutenticacion ;
   private String AV10CadenaAutenticacion ;
   private String AV179Version ;
   private String AV95Lit0 ;
   private String AV97Litfe ;
   private String AV96Lit2 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV7WebSession ;
   private com.genexus.webpanels.GXUserControl ucQueryviewer1 ;
   private com.genexus.webpanels.GXUserControl ucQueryviewer2 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV8Axes ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV5SdtAutenticacion ;
   private app.SdtQueryViewerDragAndDropData AV16DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV24FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV61ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV62ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV63ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV64ItemExpandData ;
}

final  class consultamaquinasqueryviewer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

