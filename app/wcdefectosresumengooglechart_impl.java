package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcdefectosresumengooglechart_impl extends GXWebComponent
{
   public wcdefectosresumengooglechart_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcdefectosresumengooglechart_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdefectosresumengooglechart_impl.class ));
   }

   public wcdefectosresumengooglechart_impl( int remoteHandle ,
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
               AV11Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
               AV10FechaIni = localUtil.parseDateParm( httpContext.GetPar( "FechaIni")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FechaIni", localUtil.format(AV10FechaIni, "99/99/99"));
               AV9FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9FechaFin", localUtil.format(AV9FechaFin, "99/99/99"));
               AV8ClicodIni = (int)(GXutil.lval( httpContext.GetPar( "ClicodIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClicodIni), 6, 0));
               AV7ClicodFin = (int)(GXutil.lval( httpContext.GetPar( "ClicodFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ClicodFin), 6, 0));
               AV13HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV11Emprcod,AV10FechaIni,AV9FechaFin,Integer.valueOf(AV8ClicodIni),Integer.valueOf(AV7ClicodFin),Byte.valueOf(AV13HisEstReo)});
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
         paE42( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCDefectos Resumen Google Chart", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcdefectosresumengooglechart", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV10FechaIni)),GXutil.URLEncode(GXutil.formatDateParm(AV9FechaFin)),GXutil.URLEncode(GXutil.ltrimstr(AV8ClicodIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7ClicodFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13HisEstReo,1,0))}, new String[] {"Emprcod","FechaIni","FechaFin","ClicodIni","ClicodFin","HisEstReo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11Emprcod", GXutil.rtrim( wcpOAV11Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10FechaIni", localUtil.dtoc( wcpOAV10FechaIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9FechaFin", localUtil.dtoc( wcpOAV9FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8ClicodIni", GXutil.ltrim( localUtil.ntoc( wcpOAV8ClicodIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7ClicodFin", GXutil.ltrim( localUtil.ntoc( wcpOAV7ClicodFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV13HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV11Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINI", localUtil.dtoc( AV10FechaIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFIN", localUtil.dtoc( AV9FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODINI", GXutil.ltrim( localUtil.ntoc( AV8ClicodIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFIN", GXutil.ltrim( localUtil.ntoc( AV7ClicodFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV13HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Width", GXutil.rtrim( Graf_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Height", GXutil.rtrim( Graf_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Xtitle", GXutil.rtrim( Graf_Xtitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Ytitle", GXutil.rtrim( Graf_Ytitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Title", GXutil.rtrim( Graf_Title));
   }

   public void renderHtmlCloseFormE42( )
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
      return "WCDefectosResumenGoogleChart" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCDefectos Resumen Google Chart", "") ;
   }

   public void wbE40( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcdefectosresumengooglechart");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
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
      }
      wbLoad = true ;
   }

   public void startE42( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCDefectos Resumen Google Chart", ""), (short)(0)) ;
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
            strupE40( ) ;
         }
      }
   }

   public void wsE42( )
   {
      startE42( ) ;
      evtE42( ) ;
   }

   public void evtE42( )
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
                              strupE40( ) ;
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
                              strupE40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11E42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12E42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE40( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13E42 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE40( ) ;
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
                              strupE40( ) ;
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

   public void weE42( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormE42( ) ;
         }
      }
   }

   public void paE42( )
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
      rfE42( ) ;
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

   public void rfE42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12E42 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13E42 ();
         wbE40( ) ;
      }
   }

   public void send_integrity_lvl_hashesE42( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupE40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11E42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vGOOGLECHARTDATA"), AV5GoogleChartData);
         /* Read saved values. */
         wcpOAV11Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV11Emprcod") ;
         wcpOAV10FechaIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10FechaIni"), 0) ;
         wcpOAV9FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9FechaFin"), 0) ;
         wcpOAV8ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8ClicodIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7ClicodFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      e11E42 ();
      if (returnInSub) return;
   }

   public void e11E42( )
   {
      /* Start Routine */
      returnInSub = false ;
      Graf_Width = "1200px" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Width", Graf_Width);
      Graf_Height = "400px" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Height", Graf_Height);
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcdefectosresumengooglechart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = AV11Emprcod ;
      GXv_char3[0] = AV21Emprnom ;
      GXv_char4[0] = AV22Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcdefectosresumengooglechart_impl.this.AV11Emprcod = GXv_char2[0] ;
      wcdefectosresumengooglechart_impl.this.AV21Emprnom = GXv_char3[0] ;
      wcdefectosresumengooglechart_impl.this.AV22Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
   }

   public void e12E42( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTDefectos5 = AV12sdtDefectosCollection ;
      GXv_objcol_SdtSDTDefectos6[0] = GXt_objcol_SdtSDTDefectos5 ;
      new app.dpdefectos(remoteHandle, context).execute( AV11Emprcod, AV10FechaIni, AV9FechaFin, AV8ClicodIni, AV7ClicodFin, AV13HisEstReo, GXv_objcol_SdtSDTDefectos6) ;
      GXt_objcol_SdtSDTDefectos5 = GXv_objcol_SdtSDTDefectos6[0] ;
      AV12sdtDefectosCollection = GXt_objcol_SdtSDTDefectos5 ;
      AV15cantidad = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV15cantidad.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Cantidad", "") );
      AV14Kilos = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV14Kilos.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Kilos", "") );
      AV16Metros = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV16Metros.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Metros", "") );
      AV23GXV1 = 1 ;
      while ( AV23GXV1 <= AV12sdtDefectosCollection.size() )
      {
         AV17sdtDefectos = (app.SdtSDTDefectos)((app.SdtSDTDefectos)AV12sdtDefectosCollection.elementAt(-1+AV23GXV1));
         AV5GoogleChartData.getgxTv_SdtGoogleChart_Categories().add(AV17sdtDefectos.getgxTv_SdtSDTDefectos_Tipdefdsc(), 0);
         AV15cantidad.getgxTv_SdtGoogleChart_Series_Values().add(AV17sdtDefectos.getgxTv_SdtSDTDefectos_Numerodefectos(), 0);
         AV14Kilos.getgxTv_SdtGoogleChart_Series_Values().add(AV17sdtDefectos.getgxTv_SdtSDTDefectos_Kilosdefectos(), 0);
         AV16Metros.getgxTv_SdtGoogleChart_Series_Values().add(AV17sdtDefectos.getgxTv_SdtSDTDefectos_Metrosdefectos(), 0);
         AV23GXV1 = (int)(AV23GXV1+1) ;
      }
      AV5GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV15cantidad, 0);
      AV5GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV14Kilos, 0);
      AV5GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV16Metros, 0);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5GoogleChartData", AV5GoogleChartData);
   }

   protected void nextLoad( )
   {
   }

   protected void e13E42( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
      AV10FechaIni = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FechaIni", localUtil.format(AV10FechaIni, "99/99/99"));
      AV9FechaFin = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9FechaFin", localUtil.format(AV9FechaFin, "99/99/99"));
      AV8ClicodIni = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClicodIni), 6, 0));
      AV7ClicodFin = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ClicodFin), 6, 0));
      AV13HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
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
      paE42( ) ;
      wsE42( ) ;
      weE42( ) ;
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
      sCtrlAV11Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV10FechaIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9FechaFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8ClicodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV7ClicodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV13HisEstReo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paE42( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcdefectosresumengooglechart", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paE42( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV11Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
         AV10FechaIni = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FechaIni", localUtil.format(AV10FechaIni, "99/99/99"));
         AV9FechaFin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9FechaFin", localUtil.format(AV9FechaFin, "99/99/99"));
         AV8ClicodIni = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClicodIni), 6, 0));
         AV7ClicodFin = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ClicodFin), 6, 0));
         AV13HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
      }
      wcpOAV11Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV11Emprcod") ;
      wcpOAV10FechaIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10FechaIni"), 0) ;
      wcpOAV9FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9FechaFin"), 0) ;
      wcpOAV8ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8ClicodIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7ClicodFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV11Emprcod, wcpOAV11Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV10FechaIni), GXutil.resetTime(wcpOAV10FechaIni)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV9FechaFin), GXutil.resetTime(wcpOAV9FechaFin)) ) || ( AV8ClicodIni != wcpOAV8ClicodIni ) || ( AV7ClicodFin != wcpOAV7ClicodFin ) || ( AV13HisEstReo != wcpOAV13HisEstReo ) ) )
      {
         setjustcreated();
      }
      wcpOAV11Emprcod = AV11Emprcod ;
      wcpOAV10FechaIni = AV10FechaIni ;
      wcpOAV9FechaFin = AV9FechaFin ;
      wcpOAV8ClicodIni = AV8ClicodIni ;
      wcpOAV7ClicodFin = AV7ClicodFin ;
      wcpOAV13HisEstReo = AV13HisEstReo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV11Emprcod = httpContext.cgiGet( sPrefix+"AV11Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV11Emprcod) > 0 )
      {
         AV11Emprcod = httpContext.cgiGet( sCtrlAV11Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Emprcod", AV11Emprcod);
      }
      else
      {
         AV11Emprcod = httpContext.cgiGet( sPrefix+"AV11Emprcod_PARM") ;
      }
      sCtrlAV10FechaIni = httpContext.cgiGet( sPrefix+"AV10FechaIni_CTRL") ;
      if ( GXutil.len( sCtrlAV10FechaIni) > 0 )
      {
         AV10FechaIni = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV10FechaIni), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FechaIni", localUtil.format(AV10FechaIni, "99/99/99"));
      }
      else
      {
         AV10FechaIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV10FechaIni_PARM"), 0) ;
      }
      sCtrlAV9FechaFin = httpContext.cgiGet( sPrefix+"AV9FechaFin_CTRL") ;
      if ( GXutil.len( sCtrlAV9FechaFin) > 0 )
      {
         AV9FechaFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9FechaFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9FechaFin", localUtil.format(AV9FechaFin, "99/99/99"));
      }
      else
      {
         AV9FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9FechaFin_PARM"), 0) ;
      }
      sCtrlAV8ClicodIni = httpContext.cgiGet( sPrefix+"AV8ClicodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV8ClicodIni) > 0 )
      {
         AV8ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8ClicodIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClicodIni), 6, 0));
      }
      else
      {
         AV8ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8ClicodIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7ClicodFin = httpContext.cgiGet( sPrefix+"AV7ClicodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV7ClicodFin) > 0 )
      {
         AV7ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7ClicodFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ClicodFin), 6, 0));
      }
      else
      {
         AV7ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7ClicodFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV13HisEstReo = httpContext.cgiGet( sPrefix+"AV13HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV13HisEstReo) > 0 )
      {
         AV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
      }
      else
      {
         AV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paE42( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsE42( ) ;
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
      wsE42( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Emprcod_PARM", GXutil.rtrim( AV11Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Emprcod_CTRL", GXutil.rtrim( sCtrlAV11Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FechaIni_PARM", localUtil.dtoc( AV10FechaIni, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10FechaIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FechaIni_CTRL", GXutil.rtrim( sCtrlAV10FechaIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9FechaFin_PARM", localUtil.dtoc( AV9FechaFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9FechaFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9FechaFin_CTRL", GXutil.rtrim( sCtrlAV9FechaFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ClicodIni_PARM", GXutil.ltrim( localUtil.ntoc( AV8ClicodIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8ClicodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ClicodIni_CTRL", GXutil.rtrim( sCtrlAV8ClicodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7ClicodFin_PARM", GXutil.ltrim( localUtil.ntoc( AV7ClicodFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7ClicodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7ClicodFin_CTRL", GXutil.rtrim( sCtrlAV7ClicodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV13HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13HisEstReo_CTRL", GXutil.rtrim( sCtrlAV13HisEstReo));
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
      weE42( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564667", true, true);
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
         httpContext.AddJavascriptSource("wcdefectosresumengooglechart.js", "?202661015564667", false, true);
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
      Graf_Title = httpContext.getMessage( "Analisis Defectos", "") ;
      Graf_Ytitle = "Cantidad" ;
      Graf_Xtitle = "Defectos" ;
      Graf_Height = "400" ;
      Graf_Width = "1200" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV11Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10FechaIni',fld:'vFECHAINI',pic:''},{av:'AV9FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV8ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV7ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV13HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV5GoogleChartData',fld:'vGOOGLECHARTDATA',pic:''}]");
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
      wcpOAV11Emprcod = "" ;
      wcpOAV10FechaIni = GXutil.nullDate() ;
      wcpOAV9FechaFin = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV11Emprcod = "" ;
      AV10FechaIni = GXutil.nullDate() ;
      AV9FechaFin = GXutil.nullDate() ;
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
      AV20Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV22Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV12sdtDefectosCollection = new GXBaseCollection<app.SdtSDTDefectos>(app.SdtSDTDefectos.class, "SDTDefectos", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTDefectos5 = new GXBaseCollection<app.SdtSDTDefectos>(app.SdtSDTDefectos.class, "SDTDefectos", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTDefectos6 = new GXBaseCollection[1] ;
      AV15cantidad = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV14Kilos = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV16Metros = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV17sdtDefectos = new app.SdtSDTDefectos(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV11Emprcod = "" ;
      sCtrlAV10FechaIni = "" ;
      sCtrlAV9FechaFin = "" ;
      sCtrlAV8ClicodIni = "" ;
      sCtrlAV7ClicodFin = "" ;
      sCtrlAV13HisEstReo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV13HisEstReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV13HisEstReo ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8ClicodIni ;
   private int wcpOAV7ClicodFin ;
   private int AV8ClicodIni ;
   private int AV7ClicodFin ;
   private int AV23GXV1 ;
   private int idxLst ;
   private String wcpOAV11Emprcod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV11Emprcod ;
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
   private String AV20Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21Emprnom ;
   private String GXv_char3[] ;
   private String AV22Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV11Emprcod ;
   private String sCtrlAV10FechaIni ;
   private String sCtrlAV9FechaFin ;
   private String sCtrlAV8ClicodIni ;
   private String sCtrlAV7ClicodFin ;
   private String sCtrlAV13HisEstReo ;
   private java.util.Date wcpOAV10FechaIni ;
   private java.util.Date wcpOAV9FechaFin ;
   private java.util.Date AV10FechaIni ;
   private java.util.Date AV9FechaFin ;
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
   private GXBaseCollection<app.SdtSDTDefectos> AV12sdtDefectosCollection ;
   private GXBaseCollection<app.SdtSDTDefectos> GXt_objcol_SdtSDTDefectos5 ;
   private GXBaseCollection<app.SdtSDTDefectos> GXv_objcol_SdtSDTDefectos6[] ;
   private app.SdtGoogleChart AV5GoogleChartData ;
   private app.SdtGoogleChart_Series AV15cantidad ;
   private app.SdtGoogleChart_Series AV14Kilos ;
   private app.SdtGoogleChart_Series AV16Metros ;
   private app.SdtSDTDefectos AV17sdtDefectos ;
}

