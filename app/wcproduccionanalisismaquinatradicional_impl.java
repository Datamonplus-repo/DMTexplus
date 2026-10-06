package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionanalisismaquinatradicional_impl extends GXWebComponent
{
   public wcproduccionanalisismaquinatradicional_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionanalisismaquinatradicional_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionanalisismaquinatradicional_impl.class ));
   }

   public wcproduccionanalisismaquinatradicional_impl( int remoteHandle ,
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               AV14MaqCodIni = httpContext.GetPar( "MaqCodIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqCodIni", AV14MaqCodIni);
               AV13MaqCodFin = httpContext.GetPar( "MaqCodFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqCodFin", AV13MaqCodFin);
               AV12HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12HisProDTI", localUtil.ttoc( AV12HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV11HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV21HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,AV14MaqCodIni,AV13MaqCodFin,AV12HisProDTI,AV11HisProDTF,Byte.valueOf(AV21HisEstReo)});
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
         paD52( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Analisis Maquina Tradicional", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionanalisismaquinatradicional", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV14MaqCodIni)),GXutil.URLEncode(GXutil.rtrim(AV13MaqCodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV12HisProDTI)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV11HisProDTF)),GXutil.URLEncode(GXutil.ltrimstr(AV21HisEstReo,1,0))}, new String[] {"EmprCod","MaqCodIni","MaqCodFin","HisProDTI","HisProDTF","HisEstReo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV19TTotk, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV20TTotmt, "ZZZZZ9.99")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14MaqCodIni", GXutil.rtrim( wcpOAV14MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13MaqCodFin", GXutil.rtrim( wcpOAV13MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12HisProDTI", localUtil.ttoc( wcpOAV12HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11HisProDTF", localUtil.ttoc( wcpOAV11HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV21HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINI", GXutil.rtrim( AV14MaqCodIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFIN", GXutil.rtrim( AV13MaqCodFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTF", localUtil.ttoc( A4441HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV12HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV11HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROREO", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV21HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROKGR", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROMTR", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTK", GXutil.ltrim( localUtil.ntoc( AV19TTotk, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV19TTotk, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV20TTotmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV20TTotmt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAFICA_Width", GXutil.rtrim( Grafica_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAFICA_Height", GXutil.rtrim( Grafica_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAFICA_Xtitle", GXutil.rtrim( Grafica_Xtitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAFICA_Ytitle", GXutil.rtrim( Grafica_Ytitle));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRAFICA_Title", GXutil.rtrim( Grafica_Title));
   }

   public void renderHtmlCloseFormD52( )
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
      return "WCProduccionAnalisisMaquinaTradicional" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Analisis Maquina Tradicional", "") ;
   }

   public void wbD50( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionanalisismaquinatradicional");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         wb_table1_11_D52( true) ;
      }
      else
      {
         wb_table1_11_D52( false) ;
      }
      return  ;
   }

   public void wb_table1_11_D52e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucGrafica.setProperty("Width", Grafica_Width);
         ucGrafica.setProperty("Height", Grafica_Height);
         ucGrafica.setProperty("Data", AV5GoogleChartData);
         ucGrafica.setProperty("XTitle", Grafica_Xtitle);
         ucGrafica.setProperty("YTitle", Grafica_Ytitle);
         ucGrafica.setProperty("Title", Grafica_Title);
         ucGrafica.render(context, "googlecharts", Grafica_Internalname, sPrefix+"GRAFICAContainer");
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

   public void startD52( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Analisis Maquina Tradicional", ""), (short)(0)) ;
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
            strupD50( ) ;
         }
      }
   }

   public void wsD52( )
   {
      startD52( ) ;
      evtD52( ) ;
   }

   public void evtD52( )
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
                              strupD50( ) ;
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
                              strupD50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11D52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12D52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13D52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupD50( ) ;
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
                              strupD50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTipoproduccion_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void weD52( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormD52( ) ;
         }
      }
   }

   public void paD52( )
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
            GX_FocusControl = edtavTipoproduccion_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      rfD52( ) ;
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
      edtavTipoproduccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipoproduccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipoproduccion_Enabled), 5, 0), true);
   }

   public void rfD52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12D52 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13D52 ();
         wbD50( ) ;
      }
   }

   public void send_integrity_lvl_hashesD52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTK", GXutil.ltrim( localUtil.ntoc( AV19TTotk, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV19TTotk, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV20TTotmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV20TTotmt, "ZZZZZ9.99")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavTipoproduccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipoproduccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipoproduccion_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupD50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11D52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vGOOGLECHARTDATA"), AV5GoogleChartData);
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOAV14MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV14MaqCodIni") ;
         wcpOAV13MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV13MaqCodFin") ;
         wcpOAV12HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV12HisProDTI"), 0) ;
         wcpOAV11HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV11HisProDTF"), 0) ;
         wcpOAV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Grafica_Width = httpContext.cgiGet( sPrefix+"GRAFICA_Width") ;
         Grafica_Height = httpContext.cgiGet( sPrefix+"GRAFICA_Height") ;
         Grafica_Xtitle = httpContext.cgiGet( sPrefix+"GRAFICA_Xtitle") ;
         Grafica_Ytitle = httpContext.cgiGet( sPrefix+"GRAFICA_Ytitle") ;
         Grafica_Title = httpContext.cgiGet( sPrefix+"GRAFICA_Title") ;
         /* Read variables values. */
         AV22TipoProduccion = httpContext.cgiGet( edtavTipoproduccion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TipoProduccion", AV22TipoProduccion);
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
      e11D52 ();
      if (returnInSub) return;
   }

   public void e11D52( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV22TipoProduccion = ((AV21HisEstReo==0) ? httpContext.getMessage( "Produccion General", "") : ((AV21HisEstReo==1) ? httpContext.getMessage( "Produccion Reoperado Interno", "") : httpContext.getMessage( "Produccion Reoperado Externo", ""))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TipoProduccion", AV22TipoProduccion);
      Grafica_Width = "1200px" ;
      ucGrafica.sendProperty(context, sPrefix, false, Grafica_Internalname, "Width", Grafica_Width);
      Grafica_Height = "400px" ;
      ucGrafica.sendProperty(context, sPrefix, false, Grafica_Internalname, "Height", Grafica_Height);
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionanalisismaquinatradicional_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionanalisismaquinatradicional_impl.this.AV23EmprCod = GXv_char2[0] ;
      wcproduccionanalisismaquinatradicional_impl.this.AV24EmprNom = GXv_char3[0] ;
      wcproduccionanalisismaquinatradicional_impl.this.AV25UsurCod = GXv_char4[0] ;
   }

   public void e12D52( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      AV7Kilos = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV7Kilos.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Kilos", "") );
      AV8Metros = (app.SdtGoogleChart_Series)new app.SdtGoogleChart_Series(remoteHandle, context);
      AV8Metros.setgxTv_SdtGoogleChart_Series_Name( httpContext.getMessage( "Metros", "") );
      /* Using cursor H00D52 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV14MaqCodIni, AV12HisProDTI, AV11HisProDTF, Byte.valueOf(AV21HisEstReo), Byte.valueOf(AV21HisEstReo), AV13MaqCodFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkD53 = false ;
         A602MaqCod = H00D52_A602MaqCod[0] ;
         A1525HisProKgr = H00D52_A1525HisProKgr[0] ;
         A1526HisProMtr = H00D52_A1526HisProMtr[0] ;
         A3612HisProReo = H00D52_A3612HisProReo[0] ;
         A656ParCod = H00D52_A656ParCod[0] ;
         n656ParCod = H00D52_n656ParCod[0] ;
         A4441HisProDTF = H00D52_A4441HisProDTF[0] ;
         n4441HisProDTF = H00D52_n4441HisProDTF[0] ;
         A606MaqDsc = H00D52_A606MaqDsc[0] ;
         n606MaqDsc = H00D52_n606MaqDsc[0] ;
         A606MaqDsc = H00D52_A606MaqDsc[0] ;
         n606MaqDsc = H00D52_n606MaqDsc[0] ;
         AV15HisProMtr = DecimalUtil.doubleToDec(0) ;
         AV16HisProKgr = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H00D52_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(H00D52_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brkD53 = false ;
            A1525HisProKgr = H00D52_A1525HisProKgr[0] ;
            A1526HisProMtr = H00D52_A1526HisProMtr[0] ;
            A3612HisProReo = H00D52_A3612HisProReo[0] ;
            A656ParCod = H00D52_A656ParCod[0] ;
            n656ParCod = H00D52_n656ParCod[0] ;
            A4441HisProDTF = H00D52_A4441HisProDTF[0] ;
            n4441HisProDTF = H00D52_n4441HisProDTF[0] ;
            AV16HisProKgr = AV16HisProKgr.add(A1525HisProKgr) ;
            AV15HisProMtr = AV15HisProMtr.add(A1526HisProMtr) ;
            brkD53 = true ;
            pr_default.readNext(0);
         }
         AV17Por1k = ((AV19TTotk.doubleValue()>0) ? (AV16HisProKgr.divide(AV19TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV18Por1m = ((AV20TTotmt.doubleValue()>0) ? (AV15HisProMtr.divide(AV20TTotmt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV5GoogleChartData.getgxTv_SdtGoogleChart_Categories().add(GXutil.trim( A606MaqDsc), 0);
         AV7Kilos.getgxTv_SdtGoogleChart_Series_Values().add(AV16HisProKgr, 0);
         AV8Metros.getgxTv_SdtGoogleChart_Series_Values().add(AV15HisProMtr, 0);
         if ( ! brkD53 )
         {
            brkD53 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV5GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV7Kilos, 0);
      AV5GoogleChartData.getgxTv_SdtGoogleChart_Series().add(AV8Metros, 0);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5GoogleChartData", AV5GoogleChartData);
   }

   protected void nextLoad( )
   {
   }

   protected void e13D52( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_11_D52( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletipoproduccion_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipoproduccion_Internalname, "", "", "", lblTextblocktipoproduccion_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WCProduccionAnalisisMaquinaTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipoproduccion_Internalname, httpContext.getMessage( "Tipo Produccion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipoproduccion_Internalname, GXutil.rtrim( AV22TipoProduccion), GXutil.rtrim( localUtil.format( AV22TipoProduccion, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipoproduccion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipoproduccion_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCProduccionAnalisisMaquinaTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_11_D52e( true) ;
      }
      else
      {
         wb_table1_11_D52e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      AV14MaqCodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqCodIni", AV14MaqCodIni);
      AV13MaqCodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqCodFin", AV13MaqCodFin);
      AV12HisProDTI = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12HisProDTI", localUtil.ttoc( AV12HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV11HisProDTF = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV21HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
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
      paD52( ) ;
      wsD52( ) ;
      weD52( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV14MaqCodIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV13MaqCodFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV12HisProDTI = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11HisProDTF = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV21HisEstReo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paD52( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionanalisismaquinatradicional", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paD52( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         AV14MaqCodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqCodIni", AV14MaqCodIni);
         AV13MaqCodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqCodFin", AV13MaqCodFin);
         AV12HisProDTI = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12HisProDTI", localUtil.ttoc( AV12HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV11HisProDTF = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV21HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOAV14MaqCodIni = httpContext.cgiGet( sPrefix+"wcpOAV14MaqCodIni") ;
      wcpOAV13MaqCodFin = httpContext.cgiGet( sPrefix+"wcpOAV13MaqCodFin") ;
      wcpOAV12HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV12HisProDTI"), 0) ;
      wcpOAV11HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV11HisProDTF"), 0) ;
      wcpOAV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(AV14MaqCodIni, wcpOAV14MaqCodIni) != 0 ) || ( GXutil.strcmp(AV13MaqCodFin, wcpOAV13MaqCodFin) != 0 ) || !( GXutil.dateCompare(AV12HisProDTI, wcpOAV12HisProDTI) ) || !( GXutil.dateCompare(AV11HisProDTF, wcpOAV11HisProDTF) ) || ( AV21HisEstReo != wcpOAV21HisEstReo ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOAV14MaqCodIni = AV14MaqCodIni ;
      wcpOAV13MaqCodFin = AV13MaqCodFin ;
      wcpOAV12HisProDTI = AV12HisProDTI ;
      wcpOAV11HisProDTF = AV11HisProDTF ;
      wcpOAV21HisEstReo = AV21HisEstReo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlAV14MaqCodIni = httpContext.cgiGet( sPrefix+"AV14MaqCodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV14MaqCodIni) > 0 )
      {
         AV14MaqCodIni = httpContext.cgiGet( sCtrlAV14MaqCodIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14MaqCodIni", AV14MaqCodIni);
      }
      else
      {
         AV14MaqCodIni = httpContext.cgiGet( sPrefix+"AV14MaqCodIni_PARM") ;
      }
      sCtrlAV13MaqCodFin = httpContext.cgiGet( sPrefix+"AV13MaqCodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV13MaqCodFin) > 0 )
      {
         AV13MaqCodFin = httpContext.cgiGet( sCtrlAV13MaqCodFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13MaqCodFin", AV13MaqCodFin);
      }
      else
      {
         AV13MaqCodFin = httpContext.cgiGet( sPrefix+"AV13MaqCodFin_PARM") ;
      }
      sCtrlAV12HisProDTI = httpContext.cgiGet( sPrefix+"AV12HisProDTI_CTRL") ;
      if ( GXutil.len( sCtrlAV12HisProDTI) > 0 )
      {
         AV12HisProDTI = localUtil.ctot( httpContext.cgiGet( sCtrlAV12HisProDTI), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12HisProDTI", localUtil.ttoc( AV12HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV12HisProDTI = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV12HisProDTI_PARM"), 0) ;
      }
      sCtrlAV11HisProDTF = httpContext.cgiGet( sPrefix+"AV11HisProDTF_CTRL") ;
      if ( GXutil.len( sCtrlAV11HisProDTF) > 0 )
      {
         AV11HisProDTF = localUtil.ctot( httpContext.cgiGet( sCtrlAV11HisProDTF), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProDTF", localUtil.ttoc( AV11HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV11HisProDTF = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV11HisProDTF_PARM"), 0) ;
      }
      sCtrlAV21HisEstReo = httpContext.cgiGet( sPrefix+"AV21HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV21HisEstReo) > 0 )
      {
         AV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
      }
      else
      {
         AV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paD52( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsD52( ) ;
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
      wsD52( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14MaqCodIni_PARM", GXutil.rtrim( AV14MaqCodIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14MaqCodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14MaqCodIni_CTRL", GXutil.rtrim( sCtrlAV14MaqCodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13MaqCodFin_PARM", GXutil.rtrim( AV13MaqCodFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13MaqCodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13MaqCodFin_CTRL", GXutil.rtrim( sCtrlAV13MaqCodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12HisProDTI_PARM", localUtil.ttoc( AV12HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12HisProDTI)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12HisProDTI_CTRL", GXutil.rtrim( sCtrlAV12HisProDTI));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HisProDTF_PARM", localUtil.ttoc( AV11HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11HisProDTF)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HisProDTF_CTRL", GXutil.rtrim( sCtrlAV11HisProDTF));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV21HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HisEstReo_CTRL", GXutil.rtrim( sCtrlAV21HisEstReo));
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
      weD52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015565124", true, true);
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
         httpContext.AddJavascriptSource("wcproduccionanalisismaquinatradicional.js", "?202661015565124", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("//www.gstatic.com/charts/loader.js", "", false, true);
         httpContext.AddJavascriptSource("GXGoogleVisualizationLibrary/GoogleCharts/GoogleChartsRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblocktipoproduccion_Internalname = sPrefix+"TEXTBLOCKTIPOPRODUCCION" ;
      edtavTipoproduccion_Internalname = sPrefix+"vTIPOPRODUCCION" ;
      divUnnamedtabletipoproduccion_Internalname = sPrefix+"UNNAMEDTABLETIPOPRODUCCION" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      tblUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      Grafica_Internalname = sPrefix+"GRAFICA" ;
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
      edtavTipoproduccion_Jsonclick = "" ;
      edtavTipoproduccion_Enabled = 1 ;
      Grafica_Title = httpContext.getMessage( "Produccion Maquina", "") ;
      Grafica_Ytitle = "KIlos" ;
      Grafica_Xtitle = "Maquina" ;
      Grafica_Height = "600" ;
      Grafica_Width = "800" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV14MaqCodIni',fld:'vMAQCODINI',pic:''},{av:'AV13MaqCodFin',fld:'vMAQCODFIN',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV12HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV11HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV21HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV5GoogleChartData',fld:'vGOOGLECHARTDATA',pic:''},{av:'AV19TTotk',fld:'vTTOTK',pic:'ZZZZZ9.99',hsh:true},{av:'AV20TTotmt',fld:'vTTOTMT',pic:'ZZZZZ9.99',hsh:true}]");
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
      wcpOA396EmprCod = "" ;
      wcpOAV14MaqCodIni = "" ;
      wcpOAV13MaqCodFin = "" ;
      wcpOAV12HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV11HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      AV14MaqCodIni = "" ;
      AV13MaqCodFin = "" ;
      AV12HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV11HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV19TTotk = DecimalUtil.ZERO ;
      AV20TTotmt = DecimalUtil.ZERO ;
      GXKey = "" ;
      AV5GoogleChartData = new app.SdtGoogleChart(remoteHandle, context);
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucGrafica = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV22TipoProduccion = "" ;
      AV9Station = "" ;
      GXt_char1 = "" ;
      AV23EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV24EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV25UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV7Kilos = new app.SdtGoogleChart_Series(remoteHandle, context);
      AV8Metros = new app.SdtGoogleChart_Series(remoteHandle, context);
      scmdbuf = "" ;
      H00D52_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00D52_A561HisProLin = new int[1] ;
      H00D52_A396EmprCod = new String[] {""} ;
      H00D52_A602MaqCod = new String[] {""} ;
      H00D52_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00D52_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00D52_A3612HisProReo = new byte[1] ;
      H00D52_A656ParCod = new short[1] ;
      H00D52_n656ParCod = new boolean[] {false} ;
      H00D52_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00D52_n4441HisProDTF = new boolean[] {false} ;
      H00D52_A606MaqDsc = new String[] {""} ;
      H00D52_n606MaqDsc = new boolean[] {false} ;
      AV15HisProMtr = DecimalUtil.ZERO ;
      AV16HisProKgr = DecimalUtil.ZERO ;
      AV17Por1k = DecimalUtil.ZERO ;
      AV18Por1m = DecimalUtil.ZERO ;
      sStyleString = "" ;
      lblTextblocktipoproduccion_Jsonclick = "" ;
      TempTags = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlAV14MaqCodIni = "" ;
      sCtrlAV13MaqCodFin = "" ;
      sCtrlAV12HisProDTI = "" ;
      sCtrlAV11HisProDTF = "" ;
      sCtrlAV21HisEstReo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcproduccionanalisismaquinatradicional__default(),
         new Object[] {
             new Object[] {
            H00D52_A558HisProFec, H00D52_A561HisProLin, H00D52_A396EmprCod, H00D52_A602MaqCod, H00D52_A1525HisProKgr, H00D52_A1526HisProMtr, H00D52_A3612HisProReo, H00D52_A656ParCod, H00D52_n656ParCod, H00D52_A4441HisProDTF,
            H00D52_n4441HisProDTF, H00D52_A606MaqDsc, H00D52_n606MaqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTipoproduccion_Enabled = 0 ;
   }

   private byte wcpOAV21HisEstReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV21HisEstReo ;
   private byte nGXWrapped ;
   private byte A3612HisProReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short A656ParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavTipoproduccion_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal AV19TTotk ;
   private java.math.BigDecimal AV20TTotmt ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV15HisProMtr ;
   private java.math.BigDecimal AV16HisProKgr ;
   private java.math.BigDecimal AV17Por1k ;
   private java.math.BigDecimal AV18Por1m ;
   private String wcpOA396EmprCod ;
   private String wcpOAV14MaqCodIni ;
   private String wcpOAV13MaqCodFin ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String AV14MaqCodIni ;
   private String AV13MaqCodFin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Grafica_Width ;
   private String Grafica_Height ;
   private String Grafica_Xtitle ;
   private String Grafica_Ytitle ;
   private String Grafica_Title ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Grafica_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTipoproduccion_Internalname ;
   private String AV22TipoProduccion ;
   private String GXt_char1 ;
   private String AV23EmprCod ;
   private String GXv_char2[] ;
   private String AV24EmprNom ;
   private String GXv_char3[] ;
   private String AV25UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtabletipoproduccion_Internalname ;
   private String lblTextblocktipoproduccion_Internalname ;
   private String lblTextblocktipoproduccion_Jsonclick ;
   private String TempTags ;
   private String edtavTipoproduccion_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlAV14MaqCodIni ;
   private String sCtrlAV13MaqCodFin ;
   private String sCtrlAV12HisProDTI ;
   private String sCtrlAV11HisProDTF ;
   private String sCtrlAV21HisEstReo ;
   private java.util.Date wcpOAV12HisProDTI ;
   private java.util.Date wcpOAV11HisProDTF ;
   private java.util.Date AV12HisProDTI ;
   private java.util.Date AV11HisProDTF ;
   private java.util.Date A4441HisProDTF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean brkD53 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private String AV9Station ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGrafica ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00D52_A558HisProFec ;
   private int[] H00D52_A561HisProLin ;
   private String[] H00D52_A396EmprCod ;
   private String[] H00D52_A602MaqCod ;
   private java.math.BigDecimal[] H00D52_A1525HisProKgr ;
   private java.math.BigDecimal[] H00D52_A1526HisProMtr ;
   private byte[] H00D52_A3612HisProReo ;
   private short[] H00D52_A656ParCod ;
   private boolean[] H00D52_n656ParCod ;
   private java.util.Date[] H00D52_A4441HisProDTF ;
   private boolean[] H00D52_n4441HisProDTF ;
   private String[] H00D52_A606MaqDsc ;
   private boolean[] H00D52_n606MaqDsc ;
   private app.SdtGoogleChart AV5GoogleChartData ;
   private app.SdtGoogleChart_Series AV7Kilos ;
   private app.SdtGoogleChart_Series AV8Metros ;
}

final  class wcproduccionanalisismaquinatradicional__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00D52", "SELECT T1.HisProFec, T1.HisProLin, T1.EmprCod, T1.MaqCod, T1.HisProKgr, T1.HisProMtr, T1.HisProReo, T1.ParCod, T1.HisProDTF, T2.MaqDsc FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.HisProReo = ? or ? = 9) AND (T1.ParCod = 0) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

