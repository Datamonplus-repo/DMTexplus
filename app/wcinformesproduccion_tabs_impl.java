package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcinformesproduccion_tabs_impl extends GXWebComponent
{
   public wcinformesproduccion_tabs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcinformesproduccion_tabs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcinformesproduccion_tabs_impl.class ));
   }

   public wcinformesproduccion_tabs_impl( int remoteHandle ,
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
               AV6MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MaqCodInicial", AV6MaqCodInicial);
               AV7MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFinal", AV7MaqCodFinal);
               AV8Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hisprodti", localUtil.ttoc( AV8Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV9HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProdtf", localUtil.ttoc( AV9HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf});
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
         pa1512( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informes de Produccion (TABS)", "")) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcinformesproduccion_tabs", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV7MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV8Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV9HisProdtf))}, new String[] {"Emprcod","MaqCodInicial","MaqCodFinal","Hisprodti","HisProdtf"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6MaqCodInicial", GXutil.rtrim( wcpOAV6MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7MaqCodFinal", GXutil.rtrim( wcpOAV7MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Hisprodti", localUtil.ttoc( wcpOAV8Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HisProdtf", localUtil.ttoc( wcpOAV9HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV6MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV7MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV8Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV9HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
   }

   public void renderHtmlCloseForm1512( )
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
         httpContext.writeTextNL( "</form>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         include_jscripts( ) ;
         if ( ! ( WebComp_Wcwciformedetalladohdrsproduccion == null ) )
         {
            WebComp_Wcwciformedetalladohdrsproduccion.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcproduccionmaquinas == null ) )
         {
            WebComp_Wcwcproduccionmaquinas.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcproduccionoperarios == null ) )
         {
            WebComp_Wcwcproduccionoperarios.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcproduccionmaquinasturnos == null ) )
         {
            WebComp_Wcwcproduccionmaquinasturnos.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcproduccionmaquinafase == null ) )
         {
            WebComp_Wcwcproduccionmaquinafase.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcproduccionparos_detalle == null ) )
         {
            WebComp_Wcwcproduccionparos_detalle.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcproduccionparosresumen == null ) )
         {
            WebComp_Wcwcproduccionparosresumen.componentjscripts();
         }
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
      return "WCInformesProduccion_tabs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informes de Produccion (TABS)", "") ;
   }

   public void wb1510( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcinformesproduccion_tabs");
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
            httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, sPrefix+"GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs1_title_Internalname, httpContext.getMessage( "Informe Produccion Detallado", ""), "", "", lblTabs1_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccion_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs1") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0023"+"", GXutil.rtrim( WebComp_Wcwciformedetalladohdrsproduccion_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0023"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwciformedetalladohdrsproduccion_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwciformedetalladohdrsproduccion), GXutil.lower( WebComp_Wcwciformedetalladohdrsproduccion_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0023"+"");
               }
               WebComp_Wcwciformedetalladohdrsproduccion.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwciformedetalladohdrsproduccion), GXutil.lower( WebComp_Wcwciformedetalladohdrsproduccion_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs2_title_Internalname, httpContext.getMessage( "Informe Produccion p/Maquinas", ""), "", "", lblTabs2_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccion_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs2") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0031"+"", GXutil.rtrim( WebComp_Wcwcproduccionmaquinas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0031"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionmaquinas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionmaquinas), GXutil.lower( WebComp_Wcwcproduccionmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0031"+"");
               }
               WebComp_Wcwcproduccionmaquinas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionmaquinas), GXutil.lower( WebComp_Wcwcproduccionmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs3_title_Internalname, httpContext.getMessage( "Informe Produccion p/Operarios", ""), "", "", lblTabs3_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccion_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs3") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0039"+"", GXutil.rtrim( WebComp_Wcwcproduccionoperarios_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0039"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionoperarios_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionoperarios), GXutil.lower( WebComp_Wcwcproduccionoperarios_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0039"+"");
               }
               WebComp_Wcwcproduccionoperarios.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionoperarios), GXutil.lower( WebComp_Wcwcproduccionoperarios_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs4_title_Internalname, httpContext.getMessage( "Informe Produccion Maquina-Turno", ""), "", "", lblTabs4_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccion_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs4") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0047"+"", GXutil.rtrim( WebComp_Wcwcproduccionmaquinasturnos_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0047"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionmaquinasturnos_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionmaquinasturnos), GXutil.lower( WebComp_Wcwcproduccionmaquinasturnos_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0047"+"");
               }
               WebComp_Wcwcproduccionmaquinasturnos.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionmaquinasturnos), GXutil.lower( WebComp_Wcwcproduccionmaquinasturnos_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title5"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs5_title_Internalname, httpContext.getMessage( "Informe Produccion Maquina-Fase", ""), "", "", lblTabs5_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccion_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs5") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0055"+"", GXutil.rtrim( WebComp_Wcwcproduccionmaquinafase_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0055"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionmaquinafase_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionmaquinafase), GXutil.lower( WebComp_Wcwcproduccionmaquinafase_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0055"+"");
               }
               WebComp_Wcwcproduccionmaquinafase.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionmaquinafase), GXutil.lower( WebComp_Wcwcproduccionmaquinafase_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title6"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab6_title_Internalname, httpContext.getMessage( "Informe Produccion Paros (detalle)", ""), "", "", lblTab6_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccion_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab6") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0063"+"", GXutil.rtrim( WebComp_Wcwcproduccionparos_detalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0063"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionparos_detalle_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionparos_detalle), GXutil.lower( WebComp_Wcwcproduccionparos_detalle_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0063"+"");
               }
               WebComp_Wcwcproduccionparos_detalle.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionparos_detalle), GXutil.lower( WebComp_Wcwcproduccionparos_detalle_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title7"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs7_title_Internalname, httpContext.getMessage( "Informe Produccion Paros (Resumen)", ""), "", "", lblTabs7_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccion_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs7") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0071"+"", GXutil.rtrim( WebComp_Wcwcproduccionparosresumen_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0071"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionparosresumen_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionparosresumen), GXutil.lower( WebComp_Wcwcproduccionparosresumen_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0071"+"");
               }
               WebComp_Wcwcproduccionparosresumen.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionparosresumen), GXutil.lower( WebComp_Wcwcproduccionparosresumen_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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

   public void start1512( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informes de Produccion (TABS)", ""), (short)(0)) ;
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
            strup1510( ) ;
         }
      }
   }

   public void ws1512( )
   {
      start1512( ) ;
      evt1512( ) ;
   }

   public void evt1512( )
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
                              strup1510( ) ;
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
                              strup1510( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111512 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1510( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e121512 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1510( ) ;
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
                              strup1510( ) ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 23 )
                     {
                        OldWcwciformedetalladohdrsproduccion = httpContext.cgiGet( sPrefix+"W0023") ;
                        if ( ( GXutil.len( OldWcwciformedetalladohdrsproduccion) == 0 ) || ( GXutil.strcmp(OldWcwciformedetalladohdrsproduccion, WebComp_Wcwciformedetalladohdrsproduccion_Component) != 0 ) )
                        {
                           WebComp_Wcwciformedetalladohdrsproduccion = WebUtils.getWebComponent(getClass(), "app." + OldWcwciformedetalladohdrsproduccion + "_impl", remoteHandle, context);
                           WebComp_Wcwciformedetalladohdrsproduccion_Component = OldWcwciformedetalladohdrsproduccion ;
                        }
                        if ( GXutil.len( WebComp_Wcwciformedetalladohdrsproduccion_Component) != 0 )
                        {
                           WebComp_Wcwciformedetalladohdrsproduccion.componentprocess(sPrefix+"W0023", "", sEvt);
                        }
                        WebComp_Wcwciformedetalladohdrsproduccion_Component = OldWcwciformedetalladohdrsproduccion ;
                     }
                     else if ( nCmpId == 31 )
                     {
                        OldWcwcproduccionmaquinas = httpContext.cgiGet( sPrefix+"W0031") ;
                        if ( ( GXutil.len( OldWcwcproduccionmaquinas) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionmaquinas, WebComp_Wcwcproduccionmaquinas_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionmaquinas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionmaquinas + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionmaquinas_Component = OldWcwcproduccionmaquinas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionmaquinas_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionmaquinas.componentprocess(sPrefix+"W0031", "", sEvt);
                        }
                        WebComp_Wcwcproduccionmaquinas_Component = OldWcwcproduccionmaquinas ;
                     }
                     else if ( nCmpId == 39 )
                     {
                        OldWcwcproduccionoperarios = httpContext.cgiGet( sPrefix+"W0039") ;
                        if ( ( GXutil.len( OldWcwcproduccionoperarios) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionoperarios, WebComp_Wcwcproduccionoperarios_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionoperarios = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionoperarios + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionoperarios_Component = OldWcwcproduccionoperarios ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionoperarios_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionoperarios.componentprocess(sPrefix+"W0039", "", sEvt);
                        }
                        WebComp_Wcwcproduccionoperarios_Component = OldWcwcproduccionoperarios ;
                     }
                     else if ( nCmpId == 47 )
                     {
                        OldWcwcproduccionmaquinasturnos = httpContext.cgiGet( sPrefix+"W0047") ;
                        if ( ( GXutil.len( OldWcwcproduccionmaquinasturnos) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionmaquinasturnos, WebComp_Wcwcproduccionmaquinasturnos_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionmaquinasturnos = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionmaquinasturnos + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionmaquinasturnos_Component = OldWcwcproduccionmaquinasturnos ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionmaquinasturnos_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionmaquinasturnos.componentprocess(sPrefix+"W0047", "", sEvt);
                        }
                        WebComp_Wcwcproduccionmaquinasturnos_Component = OldWcwcproduccionmaquinasturnos ;
                     }
                     else if ( nCmpId == 55 )
                     {
                        OldWcwcproduccionmaquinafase = httpContext.cgiGet( sPrefix+"W0055") ;
                        if ( ( GXutil.len( OldWcwcproduccionmaquinafase) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionmaquinafase, WebComp_Wcwcproduccionmaquinafase_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionmaquinafase = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionmaquinafase + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionmaquinafase_Component = OldWcwcproduccionmaquinafase ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionmaquinafase_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionmaquinafase.componentprocess(sPrefix+"W0055", "", sEvt);
                        }
                        WebComp_Wcwcproduccionmaquinafase_Component = OldWcwcproduccionmaquinafase ;
                     }
                     else if ( nCmpId == 63 )
                     {
                        OldWcwcproduccionparos_detalle = httpContext.cgiGet( sPrefix+"W0063") ;
                        if ( ( GXutil.len( OldWcwcproduccionparos_detalle) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionparos_detalle, WebComp_Wcwcproduccionparos_detalle_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionparos_detalle = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionparos_detalle + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionparos_detalle_Component = OldWcwcproduccionparos_detalle ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionparos_detalle_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionparos_detalle.componentprocess(sPrefix+"W0063", "", sEvt);
                        }
                        WebComp_Wcwcproduccionparos_detalle_Component = OldWcwcproduccionparos_detalle ;
                     }
                     else if ( nCmpId == 71 )
                     {
                        OldWcwcproduccionparosresumen = httpContext.cgiGet( sPrefix+"W0071") ;
                        if ( ( GXutil.len( OldWcwcproduccionparosresumen) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionparosresumen, WebComp_Wcwcproduccionparosresumen_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionparosresumen = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionparosresumen + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionparosresumen_Component = OldWcwcproduccionparosresumen ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionparosresumen_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionparosresumen.componentprocess(sPrefix+"W0071", "", sEvt);
                        }
                        WebComp_Wcwcproduccionparosresumen_Component = OldWcwcproduccionparosresumen ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1512( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1512( ) ;
         }
      }
   }

   public void pa1512( )
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
      rf1512( ) ;
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

   public void rf1512( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwciformedetalladohdrsproduccion_Component) != 0 )
            {
               WebComp_Wcwciformedetalladohdrsproduccion.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionmaquinas_Component) != 0 )
            {
               WebComp_Wcwcproduccionmaquinas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionoperarios_Component) != 0 )
            {
               WebComp_Wcwcproduccionoperarios.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionmaquinasturnos_Component) != 0 )
            {
               WebComp_Wcwcproduccionmaquinasturnos.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionmaquinafase_Component) != 0 )
            {
               WebComp_Wcwcproduccionmaquinafase.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionparos_detalle_Component) != 0 )
            {
               WebComp_Wcwcproduccionparos_detalle.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionparosresumen_Component) != 0 )
            {
               WebComp_Wcwcproduccionparosresumen.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e121512 ();
         wb1510( ) ;
      }
   }

   public void send_integrity_lvl_hashes1512( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1510( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111512 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV6MaqCodInicial") ;
         wcpOAV7MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodFinal") ;
         wcpOAV8Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV8Hisprodti"), 0) ;
         wcpOAV9HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV9HisProdtf"), 0) ;
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Historymanagement")) ;
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
      e111512 ();
      if (returnInSub) return;
   }

   public void e111512( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV10HisProReo = (byte)(9) ;
      AV11ParCod = (short)(-1) ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcinformesproduccion_tabs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcinformesproduccion_tabs_impl.this.AV5Emprcod = GXv_char2[0] ;
      wcinformesproduccion_tabs_impl.this.AV15Emprnom = GXv_char3[0] ;
      wcinformesproduccion_tabs_impl.this.AV16Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcproduccionparosresumen = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionparosresumen_Component), GXutil.lower( "WCProduccionParosResumen")) != 0 )
      {
         WebComp_Wcwcproduccionparosresumen = WebUtils.getWebComponent(getClass(), "app.wcproduccionparosresumen_impl", remoteHandle, context);
         WebComp_Wcwcproduccionparosresumen_Component = "WCProduccionParosResumen" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionparosresumen_Component) != 0 )
      {
         WebComp_Wcwcproduccionparosresumen.setjustcreated();
         WebComp_Wcwcproduccionparosresumen.componentprepare(new Object[] {sPrefix+"W0071","",AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf});
         WebComp_Wcwcproduccionparosresumen.componentbind(new Object[] {"","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcproduccionparos_detalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionparos_detalle_Component), GXutil.lower( "WCProduccionParos_Detalle")) != 0 )
      {
         WebComp_Wcwcproduccionparos_detalle = WebUtils.getWebComponent(getClass(), "app.wcproduccionparos_detalle_impl", remoteHandle, context);
         WebComp_Wcwcproduccionparos_detalle_Component = "WCProduccionParos_Detalle" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionparos_detalle_Component) != 0 )
      {
         WebComp_Wcwcproduccionparos_detalle.setjustcreated();
         WebComp_Wcwcproduccionparos_detalle.componentprepare(new Object[] {sPrefix+"W0063","",AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf});
         WebComp_Wcwcproduccionparos_detalle.componentbind(new Object[] {"","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcproduccionmaquinafase = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionmaquinafase_Component), GXutil.lower( "WCProduccionMaquinaFase")) != 0 )
      {
         WebComp_Wcwcproduccionmaquinafase = WebUtils.getWebComponent(getClass(), "app.wcproduccionmaquinafase_impl", remoteHandle, context);
         WebComp_Wcwcproduccionmaquinafase_Component = "WCProduccionMaquinaFase" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionmaquinafase_Component) != 0 )
      {
         WebComp_Wcwcproduccionmaquinafase.setjustcreated();
         WebComp_Wcwcproduccionmaquinafase.componentprepare(new Object[] {sPrefix+"W0055","",AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf});
         WebComp_Wcwcproduccionmaquinafase.componentbind(new Object[] {"","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcproduccionmaquinasturnos = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionmaquinasturnos_Component), GXutil.lower( "WCProduccionMaquinasTurnos")) != 0 )
      {
         WebComp_Wcwcproduccionmaquinasturnos = WebUtils.getWebComponent(getClass(), "app.wcproduccionmaquinasturnos_impl", remoteHandle, context);
         WebComp_Wcwcproduccionmaquinasturnos_Component = "WCProduccionMaquinasTurnos" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionmaquinasturnos_Component) != 0 )
      {
         WebComp_Wcwcproduccionmaquinasturnos.setjustcreated();
         WebComp_Wcwcproduccionmaquinasturnos.componentprepare(new Object[] {sPrefix+"W0047","",AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf});
         WebComp_Wcwcproduccionmaquinasturnos.componentbind(new Object[] {"","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcproduccionoperarios = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionoperarios_Component), GXutil.lower( "WCProduccionOperarios")) != 0 )
      {
         WebComp_Wcwcproduccionoperarios = WebUtils.getWebComponent(getClass(), "app.wcproduccionoperarios_impl", remoteHandle, context);
         WebComp_Wcwcproduccionoperarios_Component = "WCProduccionOperarios" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionoperarios_Component) != 0 )
      {
         WebComp_Wcwcproduccionoperarios.setjustcreated();
         WebComp_Wcwcproduccionoperarios.componentprepare(new Object[] {sPrefix+"W0039","",AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf});
         WebComp_Wcwcproduccionoperarios.componentbind(new Object[] {"","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcproduccionmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionmaquinas_Component), GXutil.lower( "WCProduccionMaquinas")) != 0 )
      {
         WebComp_Wcwcproduccionmaquinas = WebUtils.getWebComponent(getClass(), "app.wcproduccionmaquinas_impl", remoteHandle, context);
         WebComp_Wcwcproduccionmaquinas_Component = "WCProduccionMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionmaquinas_Component) != 0 )
      {
         WebComp_Wcwcproduccionmaquinas.setjustcreated();
         WebComp_Wcwcproduccionmaquinas.componentprepare(new Object[] {sPrefix+"W0031","",AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf});
         WebComp_Wcwcproduccionmaquinas.componentbind(new Object[] {"","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwciformedetalladohdrsproduccion = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwciformedetalladohdrsproduccion_Component), GXutil.lower( "WCIformedetalladoHdrsProduccion")) != 0 )
      {
         WebComp_Wcwciformedetalladohdrsproduccion = WebUtils.getWebComponent(getClass(), "app.wciformedetalladohdrsproduccion_impl", remoteHandle, context);
         WebComp_Wcwciformedetalladohdrsproduccion_Component = "WCIformedetalladoHdrsProduccion" ;
      }
      if ( GXutil.len( WebComp_Wcwciformedetalladohdrsproduccion_Component) != 0 )
      {
         WebComp_Wcwciformedetalladohdrsproduccion.setjustcreated();
         WebComp_Wcwciformedetalladohdrsproduccion.componentprepare(new Object[] {sPrefix+"W0023","",AV5Emprcod,AV6MaqCodInicial,AV7MaqCodFinal,AV8Hisprodti,AV9HisProdtf,Byte.valueOf(AV10HisProReo),Short.valueOf(AV11ParCod)});
         WebComp_Wcwciformedetalladohdrsproduccion.componentbind(new Object[] {"","","","","","",""});
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e121512( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MaqCodInicial", AV6MaqCodInicial);
      AV7MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFinal", AV7MaqCodFinal);
      AV8Hisprodti = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hisprodti", localUtil.ttoc( AV8Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV9HisProdtf = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProdtf", localUtil.ttoc( AV9HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa1512( ) ;
      ws1512( ) ;
      we1512( ) ;
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
      sCtrlAV6MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8Hisprodti = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9HisProdtf = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1512( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcinformesproduccion_tabs", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1512( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6MaqCodInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MaqCodInicial", AV6MaqCodInicial);
         AV7MaqCodFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFinal", AV7MaqCodFinal);
         AV8Hisprodti = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hisprodti", localUtil.ttoc( AV8Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV9HisProdtf = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProdtf", localUtil.ttoc( AV9HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV6MaqCodInicial") ;
      wcpOAV7MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV7MaqCodFinal") ;
      wcpOAV8Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV8Hisprodti"), 0) ;
      wcpOAV9HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV9HisProdtf"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV6MaqCodInicial, wcpOAV6MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV7MaqCodFinal, wcpOAV7MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV8Hisprodti, wcpOAV8Hisprodti) ) || !( GXutil.dateCompare(AV9HisProdtf, wcpOAV9HisProdtf) ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6MaqCodInicial = AV6MaqCodInicial ;
      wcpOAV7MaqCodFinal = AV7MaqCodFinal ;
      wcpOAV8Hisprodti = AV8Hisprodti ;
      wcpOAV9HisProdtf = AV9HisProdtf ;
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
      sCtrlAV6MaqCodInicial = httpContext.cgiGet( sPrefix+"AV6MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV6MaqCodInicial) > 0 )
      {
         AV6MaqCodInicial = httpContext.cgiGet( sCtrlAV6MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MaqCodInicial", AV6MaqCodInicial);
      }
      else
      {
         AV6MaqCodInicial = httpContext.cgiGet( sPrefix+"AV6MaqCodInicial_PARM") ;
      }
      sCtrlAV7MaqCodFinal = httpContext.cgiGet( sPrefix+"AV7MaqCodFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV7MaqCodFinal) > 0 )
      {
         AV7MaqCodFinal = httpContext.cgiGet( sCtrlAV7MaqCodFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCodFinal", AV7MaqCodFinal);
      }
      else
      {
         AV7MaqCodFinal = httpContext.cgiGet( sPrefix+"AV7MaqCodFinal_PARM") ;
      }
      sCtrlAV8Hisprodti = httpContext.cgiGet( sPrefix+"AV8Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV8Hisprodti) > 0 )
      {
         AV8Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV8Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hisprodti", localUtil.ttoc( AV8Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV8Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV8Hisprodti_PARM"), 0) ;
      }
      sCtrlAV9HisProdtf = httpContext.cgiGet( sPrefix+"AV9HisProdtf_CTRL") ;
      if ( GXutil.len( sCtrlAV9HisProdtf) > 0 )
      {
         AV9HisProdtf = localUtil.ctot( httpContext.cgiGet( sCtrlAV9HisProdtf), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProdtf", localUtil.ttoc( AV9HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV9HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV9HisProdtf_PARM"), 0) ;
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
      pa1512( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1512( ) ;
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
      ws1512( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6MaqCodInicial_PARM", GXutil.rtrim( AV6MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV6MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodFinal_PARM", GXutil.rtrim( AV7MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV7MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Hisprodti_PARM", localUtil.ttoc( AV8Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Hisprodti_CTRL", GXutil.rtrim( sCtrlAV8Hisprodti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProdtf_PARM", localUtil.ttoc( AV9HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HisProdtf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProdtf_CTRL", GXutil.rtrim( sCtrlAV9HisProdtf));
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
      we1512( ) ;
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
      if ( ! ( WebComp_Wcwciformedetalladohdrsproduccion == null ) )
      {
         WebComp_Wcwciformedetalladohdrsproduccion.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionmaquinas == null ) )
      {
         WebComp_Wcwcproduccionmaquinas.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionoperarios == null ) )
      {
         WebComp_Wcwcproduccionoperarios.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionmaquinasturnos == null ) )
      {
         WebComp_Wcwcproduccionmaquinasturnos.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionmaquinafase == null ) )
      {
         WebComp_Wcwcproduccionmaquinafase.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionparos_detalle == null ) )
      {
         WebComp_Wcwcproduccionparos_detalle.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionparosresumen == null ) )
      {
         WebComp_Wcwcproduccionparosresumen.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwciformedetalladohdrsproduccion == null ) )
      {
         if ( GXutil.len( WebComp_Wcwciformedetalladohdrsproduccion_Component) != 0 )
         {
            WebComp_Wcwciformedetalladohdrsproduccion.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionmaquinas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionmaquinas_Component) != 0 )
         {
            WebComp_Wcwcproduccionmaquinas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionoperarios == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionoperarios_Component) != 0 )
         {
            WebComp_Wcwcproduccionoperarios.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionmaquinasturnos == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionmaquinasturnos_Component) != 0 )
         {
            WebComp_Wcwcproduccionmaquinasturnos.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionmaquinafase == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionmaquinafase_Component) != 0 )
         {
            WebComp_Wcwcproduccionmaquinafase.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionparos_detalle == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionparos_detalle_Component) != 0 )
         {
            WebComp_Wcwcproduccionparos_detalle.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionparosresumen == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionparosresumen_Component) != 0 )
         {
            WebComp_Wcwcproduccionparosresumen.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015562285", true, true);
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
      httpContext.AddJavascriptSource("wcinformesproduccion_tabs.js", "?202661015562285", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTabs1_title_Internalname = sPrefix+"TABS1_TITLE" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      lblTabs2_title_Internalname = sPrefix+"TABS2_TITLE" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      lblTabs3_title_Internalname = sPrefix+"TABS3_TITLE" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      lblTabs4_title_Internalname = sPrefix+"TABS4_TITLE" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      lblTabs5_title_Internalname = sPrefix+"TABS5_TITLE" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      lblTab6_title_Internalname = sPrefix+"TAB6_TITLE" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      lblTabs7_title_Internalname = sPrefix+"TABS7_TITLE" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Gxuitabspanel_tabs_Internalname = sPrefix+"GXUITABSPANEL_TABS" ;
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
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 7 ;
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
      wcpOAV5Emprcod = "" ;
      wcpOAV6MaqCodInicial = "" ;
      wcpOAV7MaqCodFinal = "" ;
      wcpOAV8Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV9HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV6MaqCodInicial = "" ;
      AV7MaqCodFinal = "" ;
      AV8Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV9HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTabs1_title_Jsonclick = "" ;
      WebComp_Wcwciformedetalladohdrsproduccion_Component = "" ;
      OldWcwciformedetalladohdrsproduccion = "" ;
      lblTabs2_title_Jsonclick = "" ;
      WebComp_Wcwcproduccionmaquinas_Component = "" ;
      OldWcwcproduccionmaquinas = "" ;
      lblTabs3_title_Jsonclick = "" ;
      WebComp_Wcwcproduccionoperarios_Component = "" ;
      OldWcwcproduccionoperarios = "" ;
      lblTabs4_title_Jsonclick = "" ;
      WebComp_Wcwcproduccionmaquinasturnos_Component = "" ;
      OldWcwcproduccionmaquinasturnos = "" ;
      lblTabs5_title_Jsonclick = "" ;
      WebComp_Wcwcproduccionmaquinafase_Component = "" ;
      OldWcwcproduccionmaquinafase = "" ;
      lblTab6_title_Jsonclick = "" ;
      WebComp_Wcwcproduccionparos_detalle_Component = "" ;
      OldWcwcproduccionparos_detalle = "" ;
      lblTabs7_title_Jsonclick = "" ;
      WebComp_Wcwcproduccionparosresumen_Component = "" ;
      OldWcwcproduccionparosresumen = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV15Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6MaqCodInicial = "" ;
      sCtrlAV7MaqCodFinal = "" ;
      sCtrlAV8Hisprodti = "" ;
      sCtrlAV9HisProdtf = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwciformedetalladohdrsproduccion = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionmaquinas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionoperarios = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionmaquinasturnos = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionmaquinafase = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionparos_detalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionparosresumen = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte AV10HisProReo ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV11ParCod ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int idxLst ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6MaqCodInicial ;
   private String wcpOAV7MaqCodFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV6MaqCodInicial ;
   private String AV7MaqCodFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gxuitabspanel_tabs_Class ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTabs1_title_Internalname ;
   private String lblTabs1_title_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String WebComp_Wcwciformedetalladohdrsproduccion_Component ;
   private String OldWcwciformedetalladohdrsproduccion ;
   private String lblTabs2_title_Internalname ;
   private String lblTabs2_title_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String WebComp_Wcwcproduccionmaquinas_Component ;
   private String OldWcwcproduccionmaquinas ;
   private String lblTabs3_title_Internalname ;
   private String lblTabs3_title_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String WebComp_Wcwcproduccionoperarios_Component ;
   private String OldWcwcproduccionoperarios ;
   private String lblTabs4_title_Internalname ;
   private String lblTabs4_title_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String WebComp_Wcwcproduccionmaquinasturnos_Component ;
   private String OldWcwcproduccionmaquinasturnos ;
   private String lblTabs5_title_Internalname ;
   private String lblTabs5_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String WebComp_Wcwcproduccionmaquinafase_Component ;
   private String OldWcwcproduccionmaquinafase ;
   private String lblTab6_title_Internalname ;
   private String lblTab6_title_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcwcproduccionparos_detalle_Component ;
   private String OldWcwcproduccionparos_detalle ;
   private String lblTabs7_title_Internalname ;
   private String lblTabs7_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwcproduccionparosresumen_Component ;
   private String OldWcwcproduccionparosresumen ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6MaqCodInicial ;
   private String sCtrlAV7MaqCodFinal ;
   private String sCtrlAV8Hisprodti ;
   private String sCtrlAV9HisProdtf ;
   private java.util.Date wcpOAV8Hisprodti ;
   private java.util.Date wcpOAV9HisProdtf ;
   private java.util.Date AV8Hisprodti ;
   private java.util.Date AV9HisProdtf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcproduccionparosresumen ;
   private boolean bDynCreated_Wcwcproduccionparos_detalle ;
   private boolean bDynCreated_Wcwcproduccionmaquinafase ;
   private boolean bDynCreated_Wcwcproduccionmaquinasturnos ;
   private boolean bDynCreated_Wcwcproduccionoperarios ;
   private boolean bDynCreated_Wcwcproduccionmaquinas ;
   private boolean bDynCreated_Wcwciformedetalladohdrsproduccion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwciformedetalladohdrsproduccion ;
   private GXWebComponent WebComp_Wcwcproduccionmaquinas ;
   private GXWebComponent WebComp_Wcwcproduccionoperarios ;
   private GXWebComponent WebComp_Wcwcproduccionmaquinasturnos ;
   private GXWebComponent WebComp_Wcwcproduccionmaquinafase ;
   private GXWebComponent WebComp_Wcwcproduccionparos_detalle ;
   private GXWebComponent WebComp_Wcwcproduccionparosresumen ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
}

