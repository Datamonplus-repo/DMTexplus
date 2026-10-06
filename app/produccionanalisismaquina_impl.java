package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class produccionanalisismaquina_impl extends GXWebComponent
{
   public produccionanalisismaquina_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public produccionanalisismaquina_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produccionanalisismaquina_impl.class ));
   }

   public produccionanalisismaquina_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "MaqCodIni") ;
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
               AV7MaqCodIni = httpContext.GetPar( "MaqCodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
               AV8MaqCodFin = httpContext.GetPar( "MaqCodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
               AV9HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV10HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7MaqCodIni,AV8MaqCodFin,AV9HisProDTI,AV10HisProDTF});
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
               gxfirstwebparm = httpContext.GetFirstPar( "MaqCodIni") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "MaqCodIni") ;
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
         paD22( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Produccion Analisis Maquina", "")) ;
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
      httpContext.AddJavascriptSource("//www.gstatic.com/charts/loader.js", "", false, true);
      httpContext.AddJavascriptSource("GXGoogleVisualizationLibrary/GoogleCharts/GoogleChartsRender.js", "", false, true);
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccionanalisismaquina", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7MaqCodIni)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV9HisProDTI)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV10HisProDTF))}, new String[] {"MaqCodIni","MaqCodFin","HisProDTI","HisProDTF"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGOOGLECHARTDATA", AV5GoogleChartData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGOOGLECHARTDATA", AV5GoogleChartData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7MaqCodIni", GXutil.rtrim( wcpOAV7MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqCodFin", GXutil.rtrim( wcpOAV8MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HisProDTI", localUtil.ttoc( wcpOAV9HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10HisProDTF", localUtil.ttoc( wcpOAV10HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV7MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV8MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV9HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV10HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Width", GXutil.rtrim( Graf_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Height", GXutil.rtrim( Graf_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Xtitle", GXutil.rtrim( Graf_Xtitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Ytitle", GXutil.rtrim( Graf_Ytitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Title", GXutil.rtrim( Graf_Title));
   }

   public void renderHtmlCloseFormD22( )
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
      return "ProduccionAnalisisMaquina" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Produccion Analisis Maquina", "") ;
   }

   public void wbD20( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccionanalisismaquina");
            httpContext.AddJavascriptSource("//www.gstatic.com/charts/loader.js", "", false, true);
            httpContext.AddJavascriptSource("GXGoogleVisualizationLibrary/GoogleCharts/GoogleChartsRender.js", "", false, true);
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
         ucGraf.setProperty("Width", Graf_Width);
         ucGraf.setProperty("Height", Graf_Height);
         ucGraf.setProperty("Data", AV5GoogleChartData);
         ucGraf.setProperty("XTitle", Graf_Xtitle);
         ucGraf.setProperty("YTitle", Graf_Ytitle);
         ucGraf.setProperty("Title", Graf_Title);
         ucGraf.render(context, "googlecharts", Graf_Internalname, sPrefix+"GRAFContainer");
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

   public void startD22( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Produccion Analisis Maquina", ""), (short)(0)) ;
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
            strupD20( ) ;
         }
      }
   }

   public void wsD22( )
   {
      startD22( ) ;
      evtD22( ) ;
   }

   public void evtD22( )
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
                              strupD20( ) ;
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
                              strupD20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11D22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12D22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13D22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD20( ) ;
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
                              strupD20( ) ;
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

   public void weD22( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormD22( ) ;
         }
      }
   }

   public void paD22( )
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
      rfD22( ) ;
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

   public void rfD22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12D22 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13D22 ();
         wbD20( ) ;
      }
   }

   public void send_integrity_lvl_hashesD22( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupD20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11D22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vGOOGLECHARTDATA"), AV5GoogleChartData);
         /* Read saved values. */
         wcpOAV7MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodIni") ;
         wcpOAV8MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFin") ;
         wcpOAV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV9HisProDTI"), 0) ;
         wcpOAV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV10HisProDTF"), 0) ;
         Graf_Width = httpContext.cgiGet( sPrefix+"GRAF_Width") ;
         Graf_Height = httpContext.cgiGet( sPrefix+"GRAF_Height") ;
         Graf_Xtitle = httpContext.cgiGet( sPrefix+"GRAF_Xtitle") ;
         Graf_Ytitle = httpContext.cgiGet( sPrefix+"GRAF_Ytitle") ;
         Graf_Title = httpContext.cgiGet( sPrefix+"GRAF_Title") ;
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
      e11D22 ();
      if (returnInSub) return;
   }

   public void e11D22( )
   {
      /* Start Routine */
      returnInSub = false ;
      Graf_Width = "1200px" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Width", Graf_Width);
      Graf_Height = "400px" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Height", Graf_Height);
      GXt_char1 = AV17Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      produccionanalisismaquina_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Station = GXt_char1 ;
      GXv_char2[0] = AV18Emprcod ;
      GXv_char3[0] = AV19Emprnom ;
      GXv_char4[0] = AV20Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char2, GXv_char3, GXv_char4) ;
      produccionanalisismaquina_impl.this.AV18Emprcod = GXv_char2[0] ;
      produccionanalisismaquina_impl.this.AV19Emprnom = GXv_char3[0] ;
      produccionanalisismaquina_impl.this.AV20Usurcod = GXv_char4[0] ;
   }

   public void e12D22( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtsdtProduccionMaquina5 = AV11sdtProduccionMaquinaCollection ;
      GXv_objcol_SdtsdtProduccionMaquina6[0] = GXt_objcol_SdtsdtProduccionMaquina5 ;
      new app.dpproduccionmaquina(remoteHandle, context).execute( AV7MaqCodIni, AV8MaqCodFin, AV9HisProDTI, AV10HisProDTF, GXv_objcol_SdtsdtProduccionMaquina6) ;
      GXt_objcol_SdtsdtProduccionMaquina5 = GXv_objcol_SdtsdtProduccionMaquina6[0] ;
      AV11sdtProduccionMaquinaCollection = GXt_objcol_SdtsdtProduccionMaquina5 ;
      AV13Kilos = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV13Kilos.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Kilos", "") );
      AV14Metros = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV14Metros.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Metros", "") );
      AV21GXV1 = 1 ;
      while ( AV21GXV1 <= AV11sdtProduccionMaquinaCollection.size() )
      {
         AV12sdtProduccionMaquina = (app.SdtsdtProduccionMaquina)((app.SdtsdtProduccionMaquina)AV11sdtProduccionMaquinaCollection.elementAt(-1+AV21GXV1));
         AV5GoogleChartData.getgxTv_SdtGoogleChart_Categories().add(GXutil.trim( AV12sdtProduccionMaquina.getgxTv_SdtsdtProduccionMaquina_Maqdsc()), 0);
         AV13Kilos.getgxTv_SdtGoogleChart_Series_Values().add(AV12sdtProduccionMaquina.getgxTv_SdtsdtProduccionMaquina_Kilos(), 0);
         AV14Metros.getgxTv_SdtGoogleChart_Series_Values().add(AV12sdtProduccionMaquina.getgxTv_SdtsdtProduccionMaquina_Metros(), 0);
         AV21GXV1 = (int)(AV21GXV1+1) ;
      }
      AV5GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV13Kilos, 0);
      AV5GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV14Metros, 0);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5GoogleChartData", AV5GoogleChartData);
   }

   protected void nextLoad( )
   {
   }

   protected void e13D22( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7MaqCodIni = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
      AV8MaqCodFin = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
      AV9HisProDTI = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV10HisProDTF = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      paD22( ) ;
      wsD22( ) ;
      weD22( ) ;
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
      sCtrlAV7MaqCodIni = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8MaqCodFin = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9HisProDTI = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10HisProDTF = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paD22( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccionanalisismaquina", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paD22( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7MaqCodIni = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
         AV8MaqCodFin = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
         AV9HisProDTI = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV10HisProDTF = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV7MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodIni") ;
      wcpOAV8MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFin") ;
      wcpOAV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV9HisProDTI"), 0) ;
      wcpOAV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV10HisProDTF"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7MaqCodIni, wcpOAV7MaqCodIni) != 0 ) || ( GXutil.strcmp(AV8MaqCodFin, wcpOAV8MaqCodFin) != 0 ) || !( GXutil.dateCompare(AV9HisProDTI, wcpOAV9HisProDTI) ) || !( GXutil.dateCompare(AV10HisProDTF, wcpOAV10HisProDTF) ) ) )
      {
         setjustcreated();
      }
      wcpOAV7MaqCodIni = AV7MaqCodIni ;
      wcpOAV8MaqCodFin = AV8MaqCodFin ;
      wcpOAV9HisProDTI = AV9HisProDTI ;
      wcpOAV10HisProDTF = AV10HisProDTF ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7MaqCodIni = httpContext.cgiGet( sPrefix+"AV7MaqCodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV7MaqCodIni) > 0 )
      {
         AV7MaqCodIni = httpContext.cgiGet( sCtrlAV7MaqCodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodIni", AV7MaqCodIni);
      }
      else
      {
         AV7MaqCodIni = httpContext.cgiGet( sPrefix+"AV7MaqCodIni_PARM") ;
      }
      sCtrlAV8MaqCodFin = httpContext.cgiGet( sPrefix+"AV8MaqCodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqCodFin) > 0 )
      {
         AV8MaqCodFin = httpContext.cgiGet( sCtrlAV8MaqCodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFin", AV8MaqCodFin);
      }
      else
      {
         AV8MaqCodFin = httpContext.cgiGet( sPrefix+"AV8MaqCodFin_PARM") ;
      }
      sCtrlAV9HisProDTI = httpContext.cgiGet( sPrefix+"AV9HisProDTI_CTRL") ;
      if ( GXutil.len( sCtrlAV9HisProDTI) > 0 )
      {
         AV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sCtrlAV9HisProDTI), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV9HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV9HisProDTI_PARM"), 0) ;
      }
      sCtrlAV10HisProDTF = httpContext.cgiGet( sPrefix+"AV10HisProDTF_CTRL") ;
      if ( GXutil.len( sCtrlAV10HisProDTF) > 0 )
      {
         AV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sCtrlAV10HisProDTF), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV10HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV10HisProDTF_PARM"), 0) ;
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
      paD22( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsD22( ) ;
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
      wsD22( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodIni_PARM", GXutil.rtrim( AV7MaqCodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7MaqCodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodIni_CTRL", GXutil.rtrim( sCtrlAV7MaqCodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFin_PARM", GXutil.rtrim( AV8MaqCodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqCodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFin_CTRL", GXutil.rtrim( sCtrlAV8MaqCodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProDTI_PARM", localUtil.ttoc( AV9HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HisProDTI)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProDTI_CTRL", GXutil.rtrim( sCtrlAV9HisProDTI));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HisProDTF_PARM", localUtil.ttoc( AV10HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10HisProDTF)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HisProDTF_CTRL", GXutil.rtrim( sCtrlAV10HisProDTF));
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
      weD22( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101556499", true, true);
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
         httpContext.AddJavascriptSource("produccionanalisismaquina.js", "?202661015564910", false, true);
         httpContext.AddJavascriptSource("//www.gstatic.com/charts/loader.js", "", false, true);
         httpContext.AddJavascriptSource("GXGoogleVisualizationLibrary/GoogleCharts/GoogleChartsRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Graf_Internalname = sPrefix+"GRAF" ;
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
      Graf_Title = httpContext.getMessage( "Produccion por máquinas", "") ;
      Graf_Ytitle = "Kilos" ;
      Graf_Xtitle = "Máquina" ;
      Graf_Height = "600" ;
      Graf_Width = "800" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV7MaqCodIni',fld:'vMAQCODINI',pic:''},{av:'AV8MaqCodFin',fld:'vMAQCODFIN',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV5GoogleChartData',fld:'vGOOGLECHARTDATA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV5GoogleChartData',fld:'vGOOGLECHARTDATA',pic:''}]}");
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
      wcpOAV7MaqCodIni = "" ;
      wcpOAV8MaqCodFin = "" ;
      wcpOAV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV10HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7MaqCodIni = "" ;
      AV8MaqCodFin = "" ;
      AV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV10HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV5GoogleChartData = new app.SdtGoogleChart(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucGraf = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Station = "" ;
      GXt_char1 = "" ;
      AV18Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV19Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV20Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV11sdtProduccionMaquinaCollection = new GXBaseCollection<app.SdtsdtProduccionMaquina>(app.SdtsdtProduccionMaquina.class, "sdtProduccionMaquina", "TexplusNET", remoteHandle);
      GXt_objcol_SdtsdtProduccionMaquina5 = new GXBaseCollection<app.SdtsdtProduccionMaquina>(app.SdtsdtProduccionMaquina.class, "sdtProduccionMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtsdtProduccionMaquina6 = new GXBaseCollection[1] ;
      AV13Kilos = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV14Metros = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV12sdtProduccionMaquina = new app.SdtsdtProduccionMaquina(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7MaqCodIni = "" ;
      sCtrlAV8MaqCodFin = "" ;
      sCtrlAV9HisProDTI = "" ;
      sCtrlAV10HisProDTF = "" ;
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
   private int AV21GXV1 ;
   private int idxLst ;
   private String wcpOAV7MaqCodIni ;
   private String wcpOAV8MaqCodFin ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7MaqCodIni ;
   private String AV8MaqCodFin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Graf_Width ;
   private String Graf_Height ;
   private String Graf_Xtitle ;
   private String Graf_Ytitle ;
   private String Graf_Title ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Graf_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV17Station ;
   private String GXt_char1 ;
   private String AV18Emprcod ;
   private String GXv_char2[] ;
   private String AV19Emprnom ;
   private String GXv_char3[] ;
   private String AV20Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV7MaqCodIni ;
   private String sCtrlAV8MaqCodFin ;
   private String sCtrlAV9HisProDTI ;
   private String sCtrlAV10HisProDTF ;
   private java.util.Date wcpOAV9HisProDTI ;
   private java.util.Date wcpOAV10HisProDTF ;
   private java.util.Date AV9HisProDTI ;
   private java.util.Date AV10HisProDTF ;
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
   private com.genexus.webpanels.GXUserControl ucGraf ;
   private GXBaseCollection<app.SdtsdtProduccionMaquina> AV11sdtProduccionMaquinaCollection ;
   private GXBaseCollection<app.SdtsdtProduccionMaquina> GXt_objcol_SdtsdtProduccionMaquina5 ;
   private GXBaseCollection<app.SdtsdtProduccionMaquina> GXv_objcol_SdtsdtProduccionMaquina6[] ;
   private app.SdtGoogleChart AV5GoogleChartData ;
   private app.SdtGoogleChart_Series AV13Kilos ;
   private app.SdtGoogleChart_Series AV14Metros ;
   private app.SdtsdtProduccionMaquina AV12sdtProduccionMaquina ;
}

