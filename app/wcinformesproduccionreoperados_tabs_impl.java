package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcinformesproduccionreoperados_tabs_impl extends GXWebComponent
{
   public wcinformesproduccionreoperados_tabs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcinformesproduccionreoperados_tabs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcinformesproduccionreoperados_tabs_impl.class ));
   }

   public wcinformesproduccionreoperados_tabs_impl( int remoteHandle ,
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV9MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
               AV8MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
               AV7Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV6HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV11HisProReo = (byte)(GXutil.lval( httpContext.GetPar( "HisProReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProReo", GXutil.str( AV11HisProReo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
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
         pa1542( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCInformes Produccion Reoperados_tabs", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcinformesproduccionreoperados_tabs", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV7Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6HisProdtf)),GXutil.URLEncode(GXutil.ltrimstr(AV11HisProReo,1,0))}, new String[] {"EmprCod","MaqCodInicial","MaqCodFinal","Hisprodti","HisProdtf","HisProReo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV12ParCod), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9MaqCodInicial", GXutil.rtrim( wcpOAV9MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqCodFinal", GXutil.rtrim( wcpOAV8MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Hisprodti", localUtil.ttoc( wcpOAV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6HisProdtf", localUtil.ttoc( wcpOAV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11HisProReo", GXutil.ltrim( localUtil.ntoc( wcpOAV11HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV9MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV8MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROREO", GXutil.ltrim( localUtil.ntoc( AV11HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARCOD", GXutil.ltrim( localUtil.ntoc( AV12ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV12ParCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMEROORDENAMIENTODATOS", GXutil.ltrim( localUtil.ntoc( AV10NumeroOrdenamientoDatos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Activepagecontrolname", GXutil.rtrim( Gxuitabspanel_tabs_Activepagecontrolname));
   }

   public void renderHtmlCloseForm1542( )
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
         if ( ! ( WebComp_Wcdpproduccionreoperadosmaquinas == null ) )
         {
            WebComp_Wcdpproduccionreoperadosmaquinas.componentjscripts();
         }
         if ( ! ( WebComp_Wcdpproduccionreoperadostipoarticulos == null ) )
         {
            WebComp_Wcdpproduccionreoperadostipoarticulos.componentjscripts();
         }
         if ( ! ( WebComp_Wcdpproduccionreoperadosgrupooperarios == null ) )
         {
            WebComp_Wcdpproduccionreoperadosgrupooperarios.componentjscripts();
         }
         if ( ! ( WebComp_Wcdpproduccionreoperadostipocolorantes == null ) )
         {
            WebComp_Wcdpproduccionreoperadostipocolorantes.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcproduccionreoperadoshdr == null ) )
         {
            WebComp_Wcwcproduccionreoperadoshdr.componentjscripts();
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
      return "WCInformesProduccionReoperados_tabs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCInformes Produccion Reoperados_tabs", "") ;
   }

   public void wb1540( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcinformesproduccionreoperados_tabs");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs1_title_Internalname, httpContext.getMessage( "Datos p/Maquinas", ""), "", "", lblTabs1_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccionReoperados_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs1") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0023"+"", GXutil.rtrim( WebComp_Wcdpproduccionreoperadosmaquinas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0023"+""+"\""+((WebComp_Wcdpproduccionreoperadosmaquinas_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadosmaquinas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadosmaquinas), GXutil.lower( WebComp_Wcdpproduccionreoperadosmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0023"+"");
               }
               WebComp_Wcdpproduccionreoperadosmaquinas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadosmaquinas), GXutil.lower( WebComp_Wcdpproduccionreoperadosmaquinas_Component)) != 0 )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs2_title_Internalname, httpContext.getMessage( "Datos p/Tipo Artículo", ""), "", "", lblTabs2_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccionReoperados_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs2") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0031"+"", GXutil.rtrim( WebComp_Wcdpproduccionreoperadostipoarticulos_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0031"+""+"\""+((WebComp_Wcdpproduccionreoperadostipoarticulos_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipoarticulos_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadostipoarticulos), GXutil.lower( WebComp_Wcdpproduccionreoperadostipoarticulos_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0031"+"");
               }
               WebComp_Wcdpproduccionreoperadostipoarticulos.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadostipoarticulos), GXutil.lower( WebComp_Wcdpproduccionreoperadostipoarticulos_Component)) != 0 )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs3_title_Internalname, httpContext.getMessage( "Datos p/Operarios", ""), "", "", lblTabs3_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccionReoperados_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs3") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0039"+"", GXutil.rtrim( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0039"+""+"\""+((WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadosgrupooperarios), GXutil.lower( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0039"+"");
               }
               WebComp_Wcdpproduccionreoperadosgrupooperarios.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadosgrupooperarios), GXutil.lower( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component)) != 0 )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs4_title_Internalname, httpContext.getMessage( "Datos p/Tipo Colorante", ""), "", "", lblTabs4_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccionReoperados_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs4") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0047"+"", GXutil.rtrim( WebComp_Wcdpproduccionreoperadostipocolorantes_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0047"+""+"\""+((WebComp_Wcdpproduccionreoperadostipocolorantes_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipocolorantes_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadostipocolorantes), GXutil.lower( WebComp_Wcdpproduccionreoperadostipocolorantes_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0047"+"");
               }
               WebComp_Wcdpproduccionreoperadostipocolorantes.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcdpproduccionreoperadostipocolorantes), GXutil.lower( WebComp_Wcdpproduccionreoperadostipocolorantes_Component)) != 0 )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabs5_title_Internalname, httpContext.getMessage( "Datos p/HDR", ""), "", "", lblTabs5_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCInformesProduccionReoperados_tabs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tabs5") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0055"+"", GXutil.rtrim( WebComp_Wcwcproduccionreoperadoshdr_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0055"+""+"\""+((WebComp_Wcwcproduccionreoperadoshdr_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionreoperadoshdr_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionreoperadoshdr), GXutil.lower( WebComp_Wcwcproduccionreoperadoshdr_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0055"+"");
               }
               WebComp_Wcwcproduccionreoperadoshdr.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionreoperadoshdr), GXutil.lower( WebComp_Wcwcproduccionreoperadoshdr_Component)) != 0 )
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

   public void start1542( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCInformes Produccion Reoperados_tabs", ""), (short)(0)) ;
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
            strup1540( ) ;
         }
      }
   }

   public void ws1542( )
   {
      start1542( ) ;
      evt1542( ) ;
   }

   public void evt1542( )
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
                              strup1540( ) ;
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
                              strup1540( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111542 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1540( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e121542 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1540( ) ;
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
                              strup1540( ) ;
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
                        OldWcdpproduccionreoperadosmaquinas = httpContext.cgiGet( sPrefix+"W0023") ;
                        if ( ( GXutil.len( OldWcdpproduccionreoperadosmaquinas) == 0 ) || ( GXutil.strcmp(OldWcdpproduccionreoperadosmaquinas, WebComp_Wcdpproduccionreoperadosmaquinas_Component) != 0 ) )
                        {
                           WebComp_Wcdpproduccionreoperadosmaquinas = WebUtils.getWebComponent(getClass(), "app." + OldWcdpproduccionreoperadosmaquinas + "_impl", remoteHandle, context);
                           WebComp_Wcdpproduccionreoperadosmaquinas_Component = OldWcdpproduccionreoperadosmaquinas ;
                        }
                        if ( GXutil.len( WebComp_Wcdpproduccionreoperadosmaquinas_Component) != 0 )
                        {
                           WebComp_Wcdpproduccionreoperadosmaquinas.componentprocess(sPrefix+"W0023", "", sEvt);
                        }
                        WebComp_Wcdpproduccionreoperadosmaquinas_Component = OldWcdpproduccionreoperadosmaquinas ;
                     }
                     else if ( nCmpId == 31 )
                     {
                        OldWcdpproduccionreoperadostipoarticulos = httpContext.cgiGet( sPrefix+"W0031") ;
                        if ( ( GXutil.len( OldWcdpproduccionreoperadostipoarticulos) == 0 ) || ( GXutil.strcmp(OldWcdpproduccionreoperadostipoarticulos, WebComp_Wcdpproduccionreoperadostipoarticulos_Component) != 0 ) )
                        {
                           WebComp_Wcdpproduccionreoperadostipoarticulos = WebUtils.getWebComponent(getClass(), "app." + OldWcdpproduccionreoperadostipoarticulos + "_impl", remoteHandle, context);
                           WebComp_Wcdpproduccionreoperadostipoarticulos_Component = OldWcdpproduccionreoperadostipoarticulos ;
                        }
                        if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipoarticulos_Component) != 0 )
                        {
                           WebComp_Wcdpproduccionreoperadostipoarticulos.componentprocess(sPrefix+"W0031", "", sEvt);
                        }
                        WebComp_Wcdpproduccionreoperadostipoarticulos_Component = OldWcdpproduccionreoperadostipoarticulos ;
                     }
                     else if ( nCmpId == 39 )
                     {
                        OldWcdpproduccionreoperadosgrupooperarios = httpContext.cgiGet( sPrefix+"W0039") ;
                        if ( ( GXutil.len( OldWcdpproduccionreoperadosgrupooperarios) == 0 ) || ( GXutil.strcmp(OldWcdpproduccionreoperadosgrupooperarios, WebComp_Wcdpproduccionreoperadosgrupooperarios_Component) != 0 ) )
                        {
                           WebComp_Wcdpproduccionreoperadosgrupooperarios = WebUtils.getWebComponent(getClass(), "app." + OldWcdpproduccionreoperadosgrupooperarios + "_impl", remoteHandle, context);
                           WebComp_Wcdpproduccionreoperadosgrupooperarios_Component = OldWcdpproduccionreoperadosgrupooperarios ;
                        }
                        if ( GXutil.len( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component) != 0 )
                        {
                           WebComp_Wcdpproduccionreoperadosgrupooperarios.componentprocess(sPrefix+"W0039", "", sEvt);
                        }
                        WebComp_Wcdpproduccionreoperadosgrupooperarios_Component = OldWcdpproduccionreoperadosgrupooperarios ;
                     }
                     else if ( nCmpId == 47 )
                     {
                        OldWcdpproduccionreoperadostipocolorantes = httpContext.cgiGet( sPrefix+"W0047") ;
                        if ( ( GXutil.len( OldWcdpproduccionreoperadostipocolorantes) == 0 ) || ( GXutil.strcmp(OldWcdpproduccionreoperadostipocolorantes, WebComp_Wcdpproduccionreoperadostipocolorantes_Component) != 0 ) )
                        {
                           WebComp_Wcdpproduccionreoperadostipocolorantes = WebUtils.getWebComponent(getClass(), "app." + OldWcdpproduccionreoperadostipocolorantes + "_impl", remoteHandle, context);
                           WebComp_Wcdpproduccionreoperadostipocolorantes_Component = OldWcdpproduccionreoperadostipocolorantes ;
                        }
                        if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipocolorantes_Component) != 0 )
                        {
                           WebComp_Wcdpproduccionreoperadostipocolorantes.componentprocess(sPrefix+"W0047", "", sEvt);
                        }
                        WebComp_Wcdpproduccionreoperadostipocolorantes_Component = OldWcdpproduccionreoperadostipocolorantes ;
                     }
                     else if ( nCmpId == 55 )
                     {
                        OldWcwcproduccionreoperadoshdr = httpContext.cgiGet( sPrefix+"W0055") ;
                        if ( ( GXutil.len( OldWcwcproduccionreoperadoshdr) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionreoperadoshdr, WebComp_Wcwcproduccionreoperadoshdr_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionreoperadoshdr = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionreoperadoshdr + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionreoperadoshdr_Component = OldWcwcproduccionreoperadoshdr ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionreoperadoshdr_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionreoperadoshdr.componentprocess(sPrefix+"W0055", "", sEvt);
                        }
                        WebComp_Wcwcproduccionreoperadoshdr_Component = OldWcwcproduccionreoperadoshdr ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1542( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1542( ) ;
         }
      }
   }

   public void pa1542( )
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
      rf1542( ) ;
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

   public void rf1542( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcdpproduccionreoperadosmaquinas_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadosmaquinas_Component) != 0 )
            {
               WebComp_Wcdpproduccionreoperadosmaquinas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcdpproduccionreoperadostipoarticulos_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipoarticulos_Component) != 0 )
            {
               WebComp_Wcdpproduccionreoperadostipoarticulos.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component) != 0 )
            {
               WebComp_Wcdpproduccionreoperadosgrupooperarios.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcdpproduccionreoperadostipocolorantes_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipocolorantes_Component) != 0 )
            {
               WebComp_Wcdpproduccionreoperadostipocolorantes.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcwcproduccionreoperadoshdr_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionreoperadoshdr_Component) != 0 )
            {
               WebComp_Wcwcproduccionreoperadoshdr.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e121542 ();
         wb1540( ) ;
      }
   }

   public void send_integrity_lvl_hashes1542( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARCOD", GXutil.ltrim( localUtil.ntoc( AV12ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV12ParCod), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1540( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111542 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV9MaqCodInicial") ;
         wcpOAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFinal") ;
         wcpOAV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV7Hisprodti"), 0) ;
         wcpOAV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProdtf"), 0) ;
         wcpOAV11HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10NumeroOrdenamientoDatos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vNUMEROORDENAMIENTODATOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV5EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         AV9MaqCodInicial = httpContext.cgiGet( sPrefix+"vMAQCODINICIAL") ;
         AV8MaqCodFinal = httpContext.cgiGet( sPrefix+"vMAQCODFINAL") ;
         AV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"vHISPRODTI"), 0) ;
         AV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"vHISPRODTF"), 0) ;
         AV11HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vHISPROREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV12ParCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vPARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      e111542 ();
      if (returnInSub) return;
   }

   public void e111542( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV12ParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12ParCod), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV12ParCod), "ZZZ9")));
      AV10NumeroOrdenamientoDatos = (short)(1) ;
      this.executeUsercontrolMethod(sPrefix, false, "GXUITABSPANEL_TABSContainer", "SelectTab", "", new Object[] {Integer.valueOf(1)});
      this.executeUsercontrolMethod(sPrefix, false, "GXUITABSPANEL_TABSContainer", "ShowTab", "", new Object[] {Integer.valueOf(1)});
      if ( 0 > 1 )
      {
         GXt_char1 = AV15Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         wcinformesproduccionreoperados_tabs_impl.this.GXt_char1 = GXv_char2[0] ;
         AV15Station = GXt_char1 ;
         GXv_char2[0] = AV5EmprCod ;
         GXv_char3[0] = AV16Emprnom ;
         GXv_char4[0] = AV17Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
         wcinformesproduccionreoperados_tabs_impl.this.AV5EmprCod = GXv_char2[0] ;
         wcinformesproduccionreoperados_tabs_impl.this.AV16Emprnom = GXv_char3[0] ;
         wcinformesproduccionreoperados_tabs_impl.this.AV17Usurcod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcwcproduccionreoperadoshdr = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionreoperadoshdr_Component), GXutil.lower( "WCIformedetalladoHdrsProduccion")) != 0 )
         {
            WebComp_Wcwcproduccionreoperadoshdr = WebUtils.getWebComponent(getClass(), "app.wciformedetalladohdrsproduccion_impl", remoteHandle, context);
            WebComp_Wcwcproduccionreoperadoshdr_Component = "WCIformedetalladoHdrsProduccion" ;
         }
         if ( GXutil.len( WebComp_Wcwcproduccionreoperadoshdr_Component) != 0 )
         {
            WebComp_Wcwcproduccionreoperadoshdr.setjustcreated();
            WebComp_Wcwcproduccionreoperadoshdr.componentprepare(new Object[] {sPrefix+"W0055","",AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo),Short.valueOf(AV12ParCod)});
            WebComp_Wcwcproduccionreoperadoshdr.componentbind(new Object[] {"","","","","","",""});
         }
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadostipocolorantes = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadostipocolorantes_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipocolorantes = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadostipocolorantes_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipocolorantes_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipocolorantes.setjustcreated();
            WebComp_Wcdpproduccionreoperadostipocolorantes.componentprepare(new Object[] {sPrefix+"W0047","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadostipocolorantes.componentbind(new Object[] {"","","","","","",""});
         }
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadosgrupooperarios = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosgrupooperarios = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadosgrupooperarios_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosgrupooperarios.setjustcreated();
            WebComp_Wcdpproduccionreoperadosgrupooperarios.componentprepare(new Object[] {sPrefix+"W0039","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadosgrupooperarios.componentbind(new Object[] {"","","","","","",""});
         }
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadostipoarticulos = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadostipoarticulos_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipoarticulos = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadostipoarticulos_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipoarticulos_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipoarticulos.setjustcreated();
            WebComp_Wcdpproduccionreoperadostipoarticulos.componentprepare(new Object[] {sPrefix+"W0031","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadostipoarticulos.componentbind(new Object[] {"","","","","","",""});
         }
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadosmaquinas = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadosmaquinas_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosmaquinas = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadosmaquinas_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadosmaquinas_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosmaquinas.setjustcreated();
            WebComp_Wcdpproduccionreoperadosmaquinas.componentprepare(new Object[] {sPrefix+"W0023","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadosmaquinas.componentbind(new Object[] {"","","","","","",""});
         }
      }
      /* Execute user subroutine: 'REFRESCAR' */
      S112 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'REFRESCAR' Routine */
      returnInSub = false ;
      WebComp_Wcdpproduccionreoperadosmaquinas_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0023"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadosmaquinas_Visible), 5, 0), true);
      WebComp_Wcdpproduccionreoperadostipoarticulos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0031"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadostipoarticulos_Visible), 5, 0), true);
      WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0039"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible), 5, 0), true);
      WebComp_Wcdpproduccionreoperadostipocolorantes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0047"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadostipocolorantes_Visible), 5, 0), true);
      WebComp_Wcwcproduccionreoperadoshdr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0055"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcwcproduccionreoperadoshdr_Visible), 5, 0), true);
      if ( ( GXutil.strcmp(Gxuitabspanel_tabs_Activepagecontrolname, "Tabs1") == 0 ) || ( GXutil.strcmp(Gxuitabspanel_tabs_Activepagecontrolname, "") == 0 ) )
      {
         AV10NumeroOrdenamientoDatos = (short)(1) ;
         this.executeUsercontrolMethod(sPrefix, false, "GXUITABSPANEL_TABSContainer", "SelectTab", "", new Object[] {Short.valueOf(AV10NumeroOrdenamientoDatos)});
         WebComp_Wcdpproduccionreoperadosmaquinas_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0023"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadosmaquinas_Visible), 5, 0), true);
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadosmaquinas = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadosmaquinas_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosmaquinas = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadosmaquinas_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadosmaquinas_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosmaquinas.setjustcreated();
            WebComp_Wcdpproduccionreoperadosmaquinas.componentprepare(new Object[] {sPrefix+"W0023","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadosmaquinas.componentbind(new Object[] {"","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcdpproduccionreoperadosmaquinas )
         {
            httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0023"+"");
            WebComp_Wcdpproduccionreoperadosmaquinas.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else if ( GXutil.strcmp(Gxuitabspanel_tabs_Activepagecontrolname, "Tabs2") == 0 )
      {
         AV10NumeroOrdenamientoDatos = (short)(2) ;
         WebComp_Wcdpproduccionreoperadostipoarticulos_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0031"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadostipoarticulos_Visible), 5, 0), true);
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadostipoarticulos = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadostipoarticulos_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipoarticulos = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadostipoarticulos_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipoarticulos_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipoarticulos.setjustcreated();
            WebComp_Wcdpproduccionreoperadostipoarticulos.componentprepare(new Object[] {sPrefix+"W0031","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadostipoarticulos.componentbind(new Object[] {"","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcdpproduccionreoperadostipoarticulos )
         {
            httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0031"+"");
            WebComp_Wcdpproduccionreoperadostipoarticulos.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else if ( GXutil.strcmp(Gxuitabspanel_tabs_Activepagecontrolname, "Tabs3") == 0 )
      {
         AV10NumeroOrdenamientoDatos = (short)(3) ;
         WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0039"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible), 5, 0), true);
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadosgrupooperarios = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosgrupooperarios = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadosgrupooperarios_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosgrupooperarios.setjustcreated();
            WebComp_Wcdpproduccionreoperadosgrupooperarios.componentprepare(new Object[] {sPrefix+"W0039","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadosgrupooperarios.componentbind(new Object[] {"","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcdpproduccionreoperadosgrupooperarios )
         {
            httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0039"+"");
            WebComp_Wcdpproduccionreoperadosgrupooperarios.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else if ( GXutil.strcmp(Gxuitabspanel_tabs_Activepagecontrolname, "Tabs4") == 0 )
      {
         AV10NumeroOrdenamientoDatos = (short)(4) ;
         WebComp_Wcdpproduccionreoperadostipocolorantes_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0047"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadostipocolorantes_Visible), 5, 0), true);
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcdpproduccionreoperadostipocolorantes = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdpproduccionreoperadostipocolorantes_Component), GXutil.lower( "WCProduccionReoperados")) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipocolorantes = WebUtils.getWebComponent(getClass(), "app.wcproduccionreoperados_impl", remoteHandle, context);
            WebComp_Wcdpproduccionreoperadostipocolorantes_Component = "WCProduccionReoperados" ;
         }
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipocolorantes_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipocolorantes.setjustcreated();
            WebComp_Wcdpproduccionreoperadostipocolorantes.componentprepare(new Object[] {sPrefix+"W0047","",Short.valueOf(AV10NumeroOrdenamientoDatos),AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo)});
            WebComp_Wcdpproduccionreoperadostipocolorantes.componentbind(new Object[] {"","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcdpproduccionreoperadostipocolorantes )
         {
            httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0047"+"");
            WebComp_Wcdpproduccionreoperadostipocolorantes.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else if ( GXutil.strcmp(Gxuitabspanel_tabs_Activepagecontrolname, "Tabs5") == 0 )
      {
         AV10NumeroOrdenamientoDatos = (short)(5) ;
         WebComp_Wcwcproduccionreoperadoshdr_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0055"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcwcproduccionreoperadoshdr_Visible), 5, 0), true);
         /* Object Property */
         if ( GXutil.len( sPrefix) == 0 )
         {
            bDynCreated_Wcwcproduccionreoperadoshdr = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionreoperadoshdr_Component), GXutil.lower( "WCIformedetalladoHdrsProduccion")) != 0 )
         {
            WebComp_Wcwcproduccionreoperadoshdr = WebUtils.getWebComponent(getClass(), "app.wciformedetalladohdrsproduccion_impl", remoteHandle, context);
            WebComp_Wcwcproduccionreoperadoshdr_Component = "WCIformedetalladoHdrsProduccion" ;
         }
         if ( GXutil.len( WebComp_Wcwcproduccionreoperadoshdr_Component) != 0 )
         {
            WebComp_Wcwcproduccionreoperadoshdr.setjustcreated();
            WebComp_Wcwcproduccionreoperadoshdr.componentprepare(new Object[] {sPrefix+"W0055","",AV5EmprCod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV11HisProReo),Short.valueOf(AV12ParCod)});
            WebComp_Wcwcproduccionreoperadoshdr.componentbind(new Object[] {"","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionreoperadoshdr )
         {
            httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0055"+"");
            WebComp_Wcwcproduccionreoperadoshdr.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Sin configurar ", "")+Gxuitabspanel_tabs_Activepagecontrolname);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e121542( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV9MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
      AV8MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
      AV7Hisprodti = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV6HisProdtf = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV11HisProReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProReo", GXutil.str( AV11HisProReo, 1, 0));
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
      pa1542( ) ;
      ws1542( ) ;
      we1542( ) ;
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
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV9MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7Hisprodti = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV6HisProdtf = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV11HisProReo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1542( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcinformesproduccionreoperados_tabs", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1542( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV9MaqCodInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
         AV8MaqCodFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
         AV7Hisprodti = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV6HisProdtf = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV11HisProReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProReo", GXutil.str( AV11HisProReo, 1, 0));
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV9MaqCodInicial") ;
      wcpOAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFinal") ;
      wcpOAV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV7Hisprodti"), 0) ;
      wcpOAV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProdtf"), 0) ;
      wcpOAV11HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( GXutil.strcmp(AV9MaqCodInicial, wcpOAV9MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV8MaqCodFinal, wcpOAV8MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV7Hisprodti, wcpOAV7Hisprodti) ) || !( GXutil.dateCompare(AV6HisProdtf, wcpOAV6HisProdtf) ) || ( AV11HisProReo != wcpOAV11HisProReo ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV9MaqCodInicial = AV9MaqCodInicial ;
      wcpOAV8MaqCodFinal = AV8MaqCodFinal ;
      wcpOAV7Hisprodti = AV7Hisprodti ;
      wcpOAV6HisProdtf = AV6HisProdtf ;
      wcpOAV11HisProReo = AV11HisProReo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"AV9MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV9MaqCodInicial) > 0 )
      {
         AV9MaqCodInicial = httpContext.cgiGet( sCtrlAV9MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
      }
      else
      {
         AV9MaqCodInicial = httpContext.cgiGet( sPrefix+"AV9MaqCodInicial_PARM") ;
      }
      sCtrlAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"AV8MaqCodFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqCodFinal) > 0 )
      {
         AV8MaqCodFinal = httpContext.cgiGet( sCtrlAV8MaqCodFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
      }
      else
      {
         AV8MaqCodFinal = httpContext.cgiGet( sPrefix+"AV8MaqCodFinal_PARM") ;
      }
      sCtrlAV7Hisprodti = httpContext.cgiGet( sPrefix+"AV7Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV7Hisprodti) > 0 )
      {
         AV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV7Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV7Hisprodti_PARM"), 0) ;
      }
      sCtrlAV6HisProdtf = httpContext.cgiGet( sPrefix+"AV6HisProdtf_CTRL") ;
      if ( GXutil.len( sCtrlAV6HisProdtf) > 0 )
      {
         AV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sCtrlAV6HisProdtf), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV6HisProdtf_PARM"), 0) ;
      }
      sCtrlAV11HisProReo = httpContext.cgiGet( sPrefix+"AV11HisProReo_CTRL") ;
      if ( GXutil.len( sCtrlAV11HisProReo) > 0 )
      {
         AV11HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11HisProReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HisProReo", GXutil.str( AV11HisProReo, 1, 0));
      }
      else
      {
         AV11HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11HisProReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1542( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1542( ) ;
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
      ws1542( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9MaqCodInicial_PARM", GXutil.rtrim( AV9MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV9MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFinal_PARM", GXutil.rtrim( AV8MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV8MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisprodti_PARM", localUtil.ttoc( AV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisprodti_CTRL", GXutil.rtrim( sCtrlAV7Hisprodti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProdtf_PARM", localUtil.ttoc( AV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6HisProdtf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProdtf_CTRL", GXutil.rtrim( sCtrlAV6HisProdtf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HisProReo_PARM", GXutil.ltrim( localUtil.ntoc( AV11HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11HisProReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HisProReo_CTRL", GXutil.rtrim( sCtrlAV11HisProReo));
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
      we1542( ) ;
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
      if ( ! ( WebComp_Wcdpproduccionreoperadosmaquinas == null ) )
      {
         WebComp_Wcdpproduccionreoperadosmaquinas.componentjscripts();
      }
      if ( ! ( WebComp_Wcdpproduccionreoperadostipoarticulos == null ) )
      {
         WebComp_Wcdpproduccionreoperadostipoarticulos.componentjscripts();
      }
      if ( ! ( WebComp_Wcdpproduccionreoperadosgrupooperarios == null ) )
      {
         WebComp_Wcdpproduccionreoperadosgrupooperarios.componentjscripts();
      }
      if ( ! ( WebComp_Wcdpproduccionreoperadostipocolorantes == null ) )
      {
         WebComp_Wcdpproduccionreoperadostipocolorantes.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionreoperadoshdr == null ) )
      {
         WebComp_Wcwcproduccionreoperadoshdr.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcdpproduccionreoperadosmaquinas == null ) )
      {
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadosmaquinas_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosmaquinas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcdpproduccionreoperadostipoarticulos == null ) )
      {
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipoarticulos_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipoarticulos.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcdpproduccionreoperadosgrupooperarios == null ) )
      {
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadosgrupooperarios_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadosgrupooperarios.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcdpproduccionreoperadostipocolorantes == null ) )
      {
         if ( GXutil.len( WebComp_Wcdpproduccionreoperadostipocolorantes_Component) != 0 )
         {
            WebComp_Wcdpproduccionreoperadostipocolorantes.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionreoperadoshdr == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionreoperadoshdr_Component) != 0 )
         {
            WebComp_Wcwcproduccionreoperadoshdr.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015562254", true, true);
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
      httpContext.AddJavascriptSource("wcinformesproduccionreoperados_tabs.js", "?202661015562254", false, true);
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
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      lblTabs2_title_Internalname = sPrefix+"TABS2_TITLE" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      lblTabs3_title_Internalname = sPrefix+"TABS3_TITLE" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      lblTabs4_title_Internalname = sPrefix+"TABS4_TITLE" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      lblTabs5_title_Internalname = sPrefix+"TABS5_TITLE" ;
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
      WebComp_Wcwcproduccionreoperadoshdr_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0055"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcwcproduccionreoperadoshdr_Visible), 5, 0), true);
      WebComp_Wcdpproduccionreoperadostipocolorantes_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0047"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadostipocolorantes_Visible), 5, 0), true);
      WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0039"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible), 5, 0), true);
      WebComp_Wcdpproduccionreoperadostipoarticulos_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0031"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadostipoarticulos_Visible), 5, 0), true);
      WebComp_Wcdpproduccionreoperadosmaquinas_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0023"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdpproduccionreoperadosmaquinas_Visible), 5, 0), true);
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 5 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV12ParCod',fld:'vPARCOD',pic:'ZZZ9',hsh:true}]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV9MaqCodInicial = "" ;
      wcpOAV8MaqCodFinal = "" ;
      wcpOAV7Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV6HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      Gxuitabspanel_tabs_Activepagecontrolname = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV9MaqCodInicial = "" ;
      AV8MaqCodFinal = "" ;
      AV7Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV6HisProdtf = GXutil.resetTime( GXutil.nullDate() );
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
      WebComp_Wcdpproduccionreoperadosmaquinas_Component = "" ;
      OldWcdpproduccionreoperadosmaquinas = "" ;
      lblTabs2_title_Jsonclick = "" ;
      WebComp_Wcdpproduccionreoperadostipoarticulos_Component = "" ;
      OldWcdpproduccionreoperadostipoarticulos = "" ;
      lblTabs3_title_Jsonclick = "" ;
      WebComp_Wcdpproduccionreoperadosgrupooperarios_Component = "" ;
      OldWcdpproduccionreoperadosgrupooperarios = "" ;
      lblTabs4_title_Jsonclick = "" ;
      WebComp_Wcdpproduccionreoperadostipocolorantes_Component = "" ;
      OldWcdpproduccionreoperadostipocolorantes = "" ;
      lblTabs5_title_Jsonclick = "" ;
      WebComp_Wcwcproduccionreoperadoshdr_Component = "" ;
      OldWcwcproduccionreoperadoshdr = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV17Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV9MaqCodInicial = "" ;
      sCtrlAV8MaqCodFinal = "" ;
      sCtrlAV7Hisprodti = "" ;
      sCtrlAV6HisProdtf = "" ;
      sCtrlAV11HisProReo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcdpproduccionreoperadosmaquinas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcdpproduccionreoperadostipoarticulos = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcdpproduccionreoperadosgrupooperarios = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcdpproduccionreoperadostipocolorantes = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionreoperadoshdr = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV11HisProReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV11HisProReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short AV12ParCod ;
   private short AV10NumeroOrdenamientoDatos ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int WebComp_Wcdpproduccionreoperadosmaquinas_Visible ;
   private int WebComp_Wcdpproduccionreoperadostipoarticulos_Visible ;
   private int WebComp_Wcdpproduccionreoperadosgrupooperarios_Visible ;
   private int WebComp_Wcdpproduccionreoperadostipocolorantes_Visible ;
   private int WebComp_Wcwcproduccionreoperadoshdr_Visible ;
   private int idxLst ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV9MaqCodInicial ;
   private String wcpOAV8MaqCodFinal ;
   private String Gxuitabspanel_tabs_Activepagecontrolname ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV9MaqCodInicial ;
   private String AV8MaqCodFinal ;
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
   private String divUnnamedtable5_Internalname ;
   private String WebComp_Wcdpproduccionreoperadosmaquinas_Component ;
   private String OldWcdpproduccionreoperadosmaquinas ;
   private String lblTabs2_title_Internalname ;
   private String lblTabs2_title_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String WebComp_Wcdpproduccionreoperadostipoarticulos_Component ;
   private String OldWcdpproduccionreoperadostipoarticulos ;
   private String lblTabs3_title_Internalname ;
   private String lblTabs3_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String WebComp_Wcdpproduccionreoperadosgrupooperarios_Component ;
   private String OldWcdpproduccionreoperadosgrupooperarios ;
   private String lblTabs4_title_Internalname ;
   private String lblTabs4_title_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcdpproduccionreoperadostipocolorantes_Component ;
   private String OldWcdpproduccionreoperadostipocolorantes ;
   private String lblTabs5_title_Internalname ;
   private String lblTabs5_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwcproduccionreoperadoshdr_Component ;
   private String OldWcwcproduccionreoperadoshdr ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV9MaqCodInicial ;
   private String sCtrlAV8MaqCodFinal ;
   private String sCtrlAV7Hisprodti ;
   private String sCtrlAV6HisProdtf ;
   private String sCtrlAV11HisProReo ;
   private java.util.Date wcpOAV7Hisprodti ;
   private java.util.Date wcpOAV6HisProdtf ;
   private java.util.Date AV7Hisprodti ;
   private java.util.Date AV6HisProdtf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcproduccionreoperadoshdr ;
   private boolean bDynCreated_Wcdpproduccionreoperadostipocolorantes ;
   private boolean bDynCreated_Wcdpproduccionreoperadosgrupooperarios ;
   private boolean bDynCreated_Wcdpproduccionreoperadostipoarticulos ;
   private boolean bDynCreated_Wcdpproduccionreoperadosmaquinas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcdpproduccionreoperadosmaquinas ;
   private GXWebComponent WebComp_Wcdpproduccionreoperadostipoarticulos ;
   private GXWebComponent WebComp_Wcdpproduccionreoperadosgrupooperarios ;
   private GXWebComponent WebComp_Wcdpproduccionreoperadostipocolorantes ;
   private GXWebComponent WebComp_Wcwcproduccionreoperadoshdr ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
}

