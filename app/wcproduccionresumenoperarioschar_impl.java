package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionresumenoperarioschar_impl extends GXWebComponent
{
   public wcproduccionresumenoperarioschar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionresumenoperarioschar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionresumenoperarioschar_impl.class ));
   }

   public wcproduccionresumenoperarioschar_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV14MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqcodIni", AV14MaqcodIni);
               AV13MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodFin", AV13MaqcodFin);
               AV12FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FInicio", localUtil.ttoc( AV12FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV11FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FFin", localUtil.ttoc( AV11FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV15TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipoProduccion", GXutil.str( AV15TipoProduccion, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV14MaqcodIni,AV13MaqcodFin,AV12FInicio,AV11FFin,Byte.valueOf(AV15TipoProduccion)});
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
         paDO2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Resumen Operarios Char", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionresumenoperarioschar", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV14MaqcodIni)),GXutil.URLEncode(GXutil.rtrim(AV13MaqcodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV12FInicio)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV11FFin)),GXutil.URLEncode(GXutil.ltrimstr(AV15TipoProduccion,1,0))}, new String[] {"Emprcod","MaqcodIni","MaqcodFin","FInicio","FFin","TipoProduccion"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGOOGLECHARTDATA", AV7GoogleChartData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGOOGLECHARTDATA", AV7GoogleChartData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14MaqcodIni", GXutil.rtrim( wcpOAV14MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13MaqcodFin", GXutil.rtrim( wcpOAV13MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12FInicio", localUtil.ttoc( wcpOAV12FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11FFin", localUtil.ttoc( wcpOAV11FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15TipoProduccion", GXutil.ltrim( localUtil.ntoc( wcpOAV15TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV14MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV13MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFINICIO", localUtil.ttoc( AV12FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFFIN", localUtil.ttoc( AV11FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV15TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Width", GXutil.rtrim( Graf_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Height", GXutil.rtrim( Graf_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Xtitle", GXutil.rtrim( Graf_Xtitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Ytitle", GXutil.rtrim( Graf_Ytitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAF_Title", GXutil.rtrim( Graf_Title));
   }

   public void renderHtmlCloseFormDO2( )
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
      return "WCProduccionResumenOperariosChar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Resumen Operarios Char", "") ;
   }

   public void wbDO0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionresumenoperarioschar");
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
         ucGraf.setProperty("Data", AV7GoogleChartData);
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

   public void startDO2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Resumen Operarios Char", ""), (short)(0)) ;
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
            strupDO0( ) ;
         }
      }
   }

   public void wsDO2( )
   {
      startDO2( ) ;
      evtDO2( ) ;
   }

   public void evtDO2( )
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
                              strupDO0( ) ;
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
                              strupDO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11DO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12DO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13DO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupDO0( ) ;
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
                              strupDO0( ) ;
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

   public void weDO2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormDO2( ) ;
         }
      }
   }

   public void paDO2( )
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
      rfDO2( ) ;
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

   public void rfDO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12DO2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13DO2 ();
         wbDO0( ) ;
      }
   }

   public void send_integrity_lvl_hashesDO2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupDO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11DO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vGOOGLECHARTDATA"), AV7GoogleChartData);
         /* Read saved values. */
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV14MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV14MaqcodIni") ;
         wcpOAV13MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV13MaqcodFin") ;
         wcpOAV12FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV12FInicio"), 0) ;
         wcpOAV11FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV11FFin"), 0) ;
         wcpOAV15TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      e11DO2 ();
      if (returnInSub) return;
   }

   public void e11DO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Graf_Width = "1200px" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Width", Graf_Width);
      Graf_Height = "400px" ;
      ucGraf.sendProperty(context, sPrefix, false, Graf_Internalname, "Height", Graf_Height);
      GXt_char1 = AV21Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionresumenoperarioschar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV22Emprnom ;
      GXv_char4[0] = AV23Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionresumenoperarioschar_impl.this.AV5Emprcod = GXv_char2[0] ;
      wcproduccionresumenoperarioschar_impl.this.AV22Emprnom = GXv_char3[0] ;
      wcproduccionresumenoperarioschar_impl.this.AV23Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
   }

   public void e12DO2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTOperarios5 = AV18sdtOperariosCollection ;
      GXv_objcol_SdtSDTOperarios6[0] = GXt_objcol_SdtSDTOperarios5 ;
      new app.dpoperarios(remoteHandle, context).execute( AV5Emprcod, AV14MaqcodIni, AV13MaqcodFin, AV12FInicio, AV11FFin, AV15TipoProduccion, GXv_objcol_SdtSDTOperarios6) ;
      GXt_objcol_SdtSDTOperarios5 = GXv_objcol_SdtSDTOperarios6[0] ;
      AV18sdtOperariosCollection = GXt_objcol_SdtSDTOperarios5 ;
      AV9Kilos = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV9Kilos.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Kilos", "") );
      AV10Metros = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV10Metros.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Metros", "") );
      AV24GXV1 = 1 ;
      while ( AV24GXV1 <= AV18sdtOperariosCollection.size() )
      {
         AV16sdtOperarios = (app.SdtSDTOperarios)((app.SdtSDTOperarios)AV18sdtOperariosCollection.elementAt(-1+AV24GXV1));
         AV7GoogleChartData.getgxTv_SdtGoogleChart_Categories().add(AV16sdtOperarios.getgxTv_SdtSDTOperarios_Openom(), 0);
         AV9Kilos.getgxTv_SdtGoogleChart_Series_Values().add(AV16sdtOperarios.getgxTv_SdtSDTOperarios_Kilosproduccion(), 0);
         AV10Metros.getgxTv_SdtGoogleChart_Series_Values().add(AV16sdtOperarios.getgxTv_SdtSDTOperarios_Metrosproduccion(), 0);
         AV24GXV1 = (int)(AV24GXV1+1) ;
      }
      AV7GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV9Kilos, 0);
      AV7GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV10Metros, 0);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV7GoogleChartData", AV7GoogleChartData);
   }

   protected void nextLoad( )
   {
   }

   protected void e13DO2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV14MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqcodIni", AV14MaqcodIni);
      AV13MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodFin", AV13MaqcodFin);
      AV12FInicio = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FInicio", localUtil.ttoc( AV12FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV11FFin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FFin", localUtil.ttoc( AV11FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV15TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipoProduccion", GXutil.str( AV15TipoProduccion, 1, 0));
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
      paDO2( ) ;
      wsDO2( ) ;
      weDO2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV14MaqcodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV13MaqcodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV12FInicio = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11FFin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV15TipoProduccion = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paDO2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionresumenoperarioschar", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paDO2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV14MaqcodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqcodIni", AV14MaqcodIni);
         AV13MaqcodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodFin", AV13MaqcodFin);
         AV12FInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FInicio", localUtil.ttoc( AV12FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV11FFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FFin", localUtil.ttoc( AV11FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV15TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipoProduccion", GXutil.str( AV15TipoProduccion, 1, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV14MaqcodIni = httpContext.cgiGet( sPrefix+"wcpOAV14MaqcodIni") ;
      wcpOAV13MaqcodFin = httpContext.cgiGet( sPrefix+"wcpOAV13MaqcodFin") ;
      wcpOAV12FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV12FInicio"), 0) ;
      wcpOAV11FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV11FFin"), 0) ;
      wcpOAV15TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15TipoProduccion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV14MaqcodIni, wcpOAV14MaqcodIni) != 0 ) || ( GXutil.strcmp(AV13MaqcodFin, wcpOAV13MaqcodFin) != 0 ) || !( GXutil.dateCompare(AV12FInicio, wcpOAV12FInicio) ) || !( GXutil.dateCompare(AV11FFin, wcpOAV11FFin) ) || ( AV15TipoProduccion != wcpOAV15TipoProduccion ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV14MaqcodIni = AV14MaqcodIni ;
      wcpOAV13MaqcodFin = AV13MaqcodFin ;
      wcpOAV12FInicio = AV12FInicio ;
      wcpOAV11FFin = AV11FFin ;
      wcpOAV15TipoProduccion = AV15TipoProduccion ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV14MaqcodIni = httpContext.cgiGet( sPrefix+"AV14MaqcodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV14MaqcodIni) > 0 )
      {
         AV14MaqcodIni = httpContext.cgiGet( sCtrlAV14MaqcodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqcodIni", AV14MaqcodIni);
      }
      else
      {
         AV14MaqcodIni = httpContext.cgiGet( sPrefix+"AV14MaqcodIni_PARM") ;
      }
      sCtrlAV13MaqcodFin = httpContext.cgiGet( sPrefix+"AV13MaqcodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV13MaqcodFin) > 0 )
      {
         AV13MaqcodFin = httpContext.cgiGet( sCtrlAV13MaqcodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqcodFin", AV13MaqcodFin);
      }
      else
      {
         AV13MaqcodFin = httpContext.cgiGet( sPrefix+"AV13MaqcodFin_PARM") ;
      }
      sCtrlAV12FInicio = httpContext.cgiGet( sPrefix+"AV12FInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV12FInicio) > 0 )
      {
         AV12FInicio = localUtil.ctot( httpContext.cgiGet( sCtrlAV12FInicio), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FInicio", localUtil.ttoc( AV12FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV12FInicio = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV12FInicio_PARM"), 0) ;
      }
      sCtrlAV11FFin = httpContext.cgiGet( sPrefix+"AV11FFin_CTRL") ;
      if ( GXutil.len( sCtrlAV11FFin) > 0 )
      {
         AV11FFin = localUtil.ctot( httpContext.cgiGet( sCtrlAV11FFin), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FFin", localUtil.ttoc( AV11FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV11FFin = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV11FFin_PARM"), 0) ;
      }
      sCtrlAV15TipoProduccion = httpContext.cgiGet( sPrefix+"AV15TipoProduccion_CTRL") ;
      if ( GXutil.len( sCtrlAV15TipoProduccion) > 0 )
      {
         AV15TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15TipoProduccion), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TipoProduccion", GXutil.str( AV15TipoProduccion, 1, 0));
      }
      else
      {
         AV15TipoProduccion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15TipoProduccion_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paDO2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsDO2( ) ;
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
      wsDO2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14MaqcodIni_PARM", GXutil.rtrim( AV14MaqcodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14MaqcodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14MaqcodIni_CTRL", GXutil.rtrim( sCtrlAV14MaqcodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13MaqcodFin_PARM", GXutil.rtrim( AV13MaqcodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13MaqcodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13MaqcodFin_CTRL", GXutil.rtrim( sCtrlAV13MaqcodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12FInicio_PARM", localUtil.ttoc( AV12FInicio, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12FInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12FInicio_CTRL", GXutil.rtrim( sCtrlAV12FInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FFin_PARM", localUtil.ttoc( AV11FFin, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11FFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FFin_CTRL", GXutil.rtrim( sCtrlAV11FFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15TipoProduccion_PARM", GXutil.ltrim( localUtil.ntoc( AV15TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15TipoProduccion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15TipoProduccion_CTRL", GXutil.rtrim( sCtrlAV15TipoProduccion));
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
      weDO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564741", true, true);
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
         httpContext.AddJavascriptSource("wcproduccionresumenoperarioschar.js", "?202661015564741", false, true);
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
      Graf_Title = httpContext.getMessage( "Produccion Operarios", "") ;
      Graf_Ytitle = "Kilos" ;
      Graf_Xtitle = "Operarios" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV13MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV12FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV11FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'AV15TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV7GoogleChartData',fld:'vGOOGLECHARTDATA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV7GoogleChartData',fld:'vGOOGLECHARTDATA',pic:''}]}");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV14MaqcodIni = "" ;
      wcpOAV13MaqcodFin = "" ;
      wcpOAV12FInicio = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV11FFin = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV14MaqcodIni = "" ;
      AV13MaqcodFin = "" ;
      AV12FInicio = GXutil.resetTime( GXutil.nullDate() );
      AV11FFin = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV7GoogleChartData = new app.SdtGoogleChart(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucGraf = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV22Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV23Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV18sdtOperariosCollection = new GXBaseCollection<app.SdtSDTOperarios>(app.SdtSDTOperarios.class, "SDTOperarios", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTOperarios5 = new GXBaseCollection<app.SdtSDTOperarios>(app.SdtSDTOperarios.class, "SDTOperarios", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTOperarios6 = new GXBaseCollection[1] ;
      AV9Kilos = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV10Metros = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV16sdtOperarios = new app.SdtSDTOperarios(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV14MaqcodIni = "" ;
      sCtrlAV13MaqcodFin = "" ;
      sCtrlAV12FInicio = "" ;
      sCtrlAV11FFin = "" ;
      sCtrlAV15TipoProduccion = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV15TipoProduccion ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV15TipoProduccion ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV24GXV1 ;
   private int idxLst ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV14MaqcodIni ;
   private String wcpOAV13MaqcodFin ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV14MaqcodIni ;
   private String AV13MaqcodFin ;
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
   private String AV21Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV22Emprnom ;
   private String GXv_char3[] ;
   private String AV23Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV14MaqcodIni ;
   private String sCtrlAV13MaqcodFin ;
   private String sCtrlAV12FInicio ;
   private String sCtrlAV11FFin ;
   private String sCtrlAV15TipoProduccion ;
   private java.util.Date wcpOAV12FInicio ;
   private java.util.Date wcpOAV11FFin ;
   private java.util.Date AV12FInicio ;
   private java.util.Date AV11FFin ;
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
   private GXBaseCollection<app.SdtSDTOperarios> AV18sdtOperariosCollection ;
   private GXBaseCollection<app.SdtSDTOperarios> GXt_objcol_SdtSDTOperarios5 ;
   private GXBaseCollection<app.SdtSDTOperarios> GXv_objcol_SdtSDTOperarios6[] ;
   private app.SdtSDTOperarios AV16sdtOperarios ;
   private app.SdtGoogleChart AV7GoogleChartData ;
   private app.SdtGoogleChart_Series AV9Kilos ;
   private app.SdtGoogleChart_Series AV10Metros ;
}

