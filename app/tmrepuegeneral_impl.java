package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmrepuegeneral_impl extends GXWebComponent
{
   public tmrepuegeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmrepuegeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrepuegeneral_impl.class ));
   }

   public tmrepuegeneral_impl( int remoteHandle ,
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
      chkMRActivo = UIFactory.getCheckbox(this);
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
               A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A9492MRCod)});
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
         paI72( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TMRepue General", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmrepuegeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9492MRCod,8,0))}, new String[] {"EmprCod","MRCod"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TMRepueGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV14Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmrepuegeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA9492MRCod", GXutil.ltrim( localUtil.ntoc( wcpOA9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_transactiondetail_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABS_Class", GXutil.rtrim( Gxuitabspanel_transactiondetail_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_transactiondetail_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Width", GXutil.rtrim( Dvpanel_transactiondetail_opciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_opciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_opciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Cls", GXutil.rtrim( Dvpanel_transactiondetail_opciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Title", GXutil.rtrim( Dvpanel_transactiondetail_opciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_opciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_opciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_opciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_opciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_opciones_Autoscroll));
   }

   public void renderHtmlCloseFormI72( )
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
      return "TMRepueGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TMRepue General", "") ;
   }

   public void wbI70( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tmrepuegeneral");
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_opciones.setProperty("Width", Dvpanel_transactiondetail_opciones_Width);
         ucDvpanel_transactiondetail_opciones.setProperty("AutoWidth", Dvpanel_transactiondetail_opciones_Autowidth);
         ucDvpanel_transactiondetail_opciones.setProperty("AutoHeight", Dvpanel_transactiondetail_opciones_Autoheight);
         ucDvpanel_transactiondetail_opciones.setProperty("Cls", Dvpanel_transactiondetail_opciones_Cls);
         ucDvpanel_transactiondetail_opciones.setProperty("Title", Dvpanel_transactiondetail_opciones_Title);
         ucDvpanel_transactiondetail_opciones.setProperty("Collapsible", Dvpanel_transactiondetail_opciones_Collapsible);
         ucDvpanel_transactiondetail_opciones.setProperty("Collapsed", Dvpanel_transactiondetail_opciones_Collapsed);
         ucDvpanel_transactiondetail_opciones.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_opciones_Showcollapseicon);
         ucDvpanel_transactiondetail_opciones.setProperty("IconPosition", Dvpanel_transactiondetail_opciones_Iconposition);
         ucDvpanel_transactiondetail_opciones.setProperty("AutoScroll", Dvpanel_transactiondetail_opciones_Autoscroll);
         ucDvpanel_transactiondetail_opciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_opciones_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONESContainer"+"TransactionDetail_Opciones"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_opciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_transactiondetail_tabs.setProperty("PageCount", Gxuitabspanel_transactiondetail_tabs_Pagecount);
         ucGxuitabspanel_transactiondetail_tabs.setProperty("Class", Gxuitabspanel_transactiondetail_tabs_Class);
         ucGxuitabspanel_transactiondetail_tabs.setProperty("HistoryManagement", Gxuitabspanel_transactiondetail_tabs_Historymanagement);
         ucGxuitabspanel_transactiondetail_tabs.render(context, "tab", Gxuitabspanel_transactiondetail_tabs_Internalname, sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabgeneral_title_Internalname, httpContext.getMessage( "WWP_TemplateDataPanelTitle", ""), "", "", lblTabgeneral_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMRepueGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "tabGeneral") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRCod_Internalname, httpContext.getMessage( "Repuesto", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRNom_Internalname, httpContext.getMessage( "Nombre del Repuesto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRNom_Internalname, GXutil.rtrim( A9493MRNom), GXutil.rtrim( localUtil.format( A9493MRNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRNom_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkMRActivo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkMRActivo.getInternalname(), " ", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkMRActivo.getInternalname(), A12850MRActivo, "", " ", 1, chkMRActivo.getEnabled(), "S", httpContext.getMessage( "Activo?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCodExt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRCodExt_Internalname, httpContext.getMessage( "Cod Externo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRCodExt_Internalname, GXutil.rtrim( A9494MRCodExt), GXutil.rtrim( localUtil.format( A9494MRCodExt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCodExt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRCodExt_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCodPrv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRCodPrv_Internalname, httpContext.getMessage( "Proveedor", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRCodPrv_Internalname, GXutil.rtrim( A11458MRCodPrv), GXutil.rtrim( localUtil.format( A11458MRCodPrv, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCodPrv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRCodPrv_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRLote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRLote_Internalname, GXutil.rtrim( A14491MRLote), GXutil.rtrim( localUtil.format( A14491MRLote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkPre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRStkPre_Internalname, httpContext.getMessage( "Precio", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkPre_Enabled!=0) ? localUtil.format( A9499MRStkPre, "ZZZZZZ9.999") : localUtil.format( A9499MRStkPre, "ZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Stocks", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TMRepueGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_grupostocks_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRStkMin_Internalname, httpContext.getMessage( "Mínimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkMin_Internalname, GXutil.ltrim( localUtil.ntoc( A9497MRStkMin, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkMin_Enabled!=0) ? localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkMin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkCri_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRStkCri_Internalname, httpContext.getMessage( "Crítico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkCri_Internalname, GXutil.ltrim( localUtil.ntoc( A9498MRStkCri, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkCri_Enabled!=0) ? localUtil.format( A9498MRStkCri, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9498MRStkCri, "Z,ZZZ,ZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkCri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkCri_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkAct_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRStkAct_Internalname, httpContext.getMessage( "Actual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkAct_Internalname, GXutil.ltrim( localUtil.ntoc( A9495MRStkAct, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkAct_Enabled!=0) ? localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkAct_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkRes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMRStkRes_Internalname, httpContext.getMessage( "Reservado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9496MRStkRes, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkRes_Enabled!=0) ? localUtil.format( A9496MRStkRes, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9496MRStkRes, "Z,ZZZ,ZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkRes_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTablevel_prv_title_Internalname, httpContext.getMessage( "Proveedores", ""), "", "", lblTablevel_prv_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMRepueGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabLevel_Prv") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tabtablelevel_prv_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_prv_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTablevel_level1_title_Internalname, httpContext.getMessage( "Movimientos", ""), "", "", lblTablevel_level1_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMRepueGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabLevel_Level1") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tabtablelevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTablevel_level2_title_Internalname, httpContext.getMessage( "Reservas", ""), "", "", lblTablevel_level2_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMRepueGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabLevel_Level2") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tabtablelevel_level2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_level2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV14Pgmname), GXutil.rtrim( localUtil.format( AV14Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11i71_client"+"'", TempTags, "", 2, "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12i71_client"+"'", TempTags, "", 2, "HLP_TMRepueGeneral.htm");
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
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV14Pgmname), GXutil.rtrim( localUtil.format( AV14Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRUltMov_Internalname, GXutil.ltrim( localUtil.ntoc( A9500MRUltMov, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9500MRUltMov), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRUltMov_Jsonclick, 0, "Attribute", "", "", "", "", edtMRUltMov_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRUltRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9501MRUltRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9501MRUltRes), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRUltRes_Jsonclick, 0, "Attribute", "", "", "", "", edtMRUltRes_Visible, 0, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRepueGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRepueGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startI72( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TMRepue General", ""), (short)(0)) ;
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
            strupI70( ) ;
         }
      }
   }

   public void wsI72( )
   {
      startI72( ) ;
      evtI72( ) ;
   }

   public void evtI72( )
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
                              strupI70( ) ;
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
                              strupI70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13I72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupI70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14I72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupI70( ) ;
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
                              strupI70( ) ;
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

   public void weI72( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormI72( ) ;
         }
      }
   }

   public void paI72( )
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
      A12850MRActivo = ((GXutil.strcmp(GXutil.rtrim( A12850MRActivo), "S")==0) ? "S" : "N") ;
      n12850MRActivo = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12850MRActivo", A12850MRActivo);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfI72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "TMRepueGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfI72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00I72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9501MRUltRes = H00I72_A9501MRUltRes[0] ;
            n9501MRUltRes = H00I72_n9501MRUltRes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
            A9500MRUltMov = H00I72_A9500MRUltMov[0] ;
            n9500MRUltMov = H00I72_n9500MRUltMov[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
            A9496MRStkRes = H00I72_A9496MRStkRes[0] ;
            n9496MRStkRes = H00I72_n9496MRStkRes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
            A9495MRStkAct = H00I72_A9495MRStkAct[0] ;
            n9495MRStkAct = H00I72_n9495MRStkAct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
            A9498MRStkCri = H00I72_A9498MRStkCri[0] ;
            n9498MRStkCri = H00I72_n9498MRStkCri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9498MRStkCri", GXutil.ltrimstr( A9498MRStkCri, 12, 3));
            A9497MRStkMin = H00I72_A9497MRStkMin[0] ;
            n9497MRStkMin = H00I72_n9497MRStkMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9497MRStkMin", GXutil.ltrimstr( A9497MRStkMin, 12, 3));
            A9499MRStkPre = H00I72_A9499MRStkPre[0] ;
            n9499MRStkPre = H00I72_n9499MRStkPre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
            A14491MRLote = H00I72_A14491MRLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14491MRLote", A14491MRLote);
            A11458MRCodPrv = H00I72_A11458MRCodPrv[0] ;
            n11458MRCodPrv = H00I72_n11458MRCodPrv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11458MRCodPrv", A11458MRCodPrv);
            A9494MRCodExt = H00I72_A9494MRCodExt[0] ;
            n9494MRCodExt = H00I72_n9494MRCodExt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9494MRCodExt", A9494MRCodExt);
            A12850MRActivo = H00I72_A12850MRActivo[0] ;
            n12850MRActivo = H00I72_n12850MRActivo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12850MRActivo", A12850MRActivo);
            A9493MRNom = H00I72_A9493MRNom[0] ;
            n9493MRNom = H00I72_n9493MRNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9493MRNom", A9493MRNom);
            /* Execute user event: Load */
            e14I72 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbI70( ) ;
      }
   }

   public void send_integrity_lvl_hashesI72( )
   {
   }

   public void before_start_formulas( )
   {
      AV14Pgmname = "TMRepueGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H00I73 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      A407EmprNom = H00I73_A407EmprNom[0] ;
      n407EmprNom = H00I73_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(1);
      pr_default.close(1);
      fix_multi_value_controls( ) ;
   }

   public void strupI70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13I72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9492MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_transactiondetail_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_transactiondetail_tabs_Class = httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABS_Class") ;
         Gxuitabspanel_transactiondetail_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABS_Historymanagement")) ;
         Dvpanel_transactiondetail_opciones_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Width") ;
         Dvpanel_transactiondetail_opciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Autowidth")) ;
         Dvpanel_transactiondetail_opciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Autoheight")) ;
         Dvpanel_transactiondetail_opciones_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Cls") ;
         Dvpanel_transactiondetail_opciones_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Title") ;
         Dvpanel_transactiondetail_opciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Collapsible")) ;
         Dvpanel_transactiondetail_opciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Collapsed")) ;
         Dvpanel_transactiondetail_opciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Showcollapseicon")) ;
         Dvpanel_transactiondetail_opciones_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Iconposition") ;
         Dvpanel_transactiondetail_opciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES_Autoscroll")) ;
         /* Read variables values. */
         A9493MRNom = httpContext.cgiGet( edtMRNom_Internalname) ;
         n9493MRNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9493MRNom", A9493MRNom);
         A12850MRActivo = ((GXutil.strcmp(httpContext.cgiGet( chkMRActivo.getInternalname()), "S")==0) ? "S" : "N") ;
         n12850MRActivo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12850MRActivo", A12850MRActivo);
         A9494MRCodExt = httpContext.cgiGet( edtMRCodExt_Internalname) ;
         n9494MRCodExt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9494MRCodExt", A9494MRCodExt);
         A11458MRCodPrv = httpContext.cgiGet( edtMRCodPrv_Internalname) ;
         n11458MRCodPrv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11458MRCodPrv", A11458MRCodPrv);
         A14491MRLote = httpContext.cgiGet( edtMRLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14491MRLote", A14491MRLote);
         A9499MRStkPre = localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)) ;
         n9499MRStkPre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
         A9497MRStkMin = localUtil.ctond( httpContext.cgiGet( edtMRStkMin_Internalname)) ;
         n9497MRStkMin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9497MRStkMin", GXutil.ltrimstr( A9497MRStkMin, 12, 3));
         A9498MRStkCri = localUtil.ctond( httpContext.cgiGet( edtMRStkCri_Internalname)) ;
         n9498MRStkCri = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9498MRStkCri", GXutil.ltrimstr( A9498MRStkCri, 12, 3));
         A9495MRStkAct = localUtil.ctond( httpContext.cgiGet( edtMRStkAct_Internalname)) ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9496MRStkRes = localUtil.ctond( httpContext.cgiGet( edtMRStkRes_Internalname)) ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         AV14Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
         AV14Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
         A9500MRUltMov = (int)(localUtil.ctol( httpContext.cgiGet( edtMRUltMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         A9501MRUltRes = localUtil.ctol( httpContext.cgiGet( edtMRUltRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TMRepueGeneral");
         AV14Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV14Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tmrepuegeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e13I72 ();
      if (returnInSub) return;
   }

   public void e13I72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmrepuegeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      GXv_char2[0] = AV16Emprcod ;
      GXv_char3[0] = AV17Emprnom ;
      GXv_char4[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmrepuegeneral_impl.this.AV16Emprcod = GXv_char2[0] ;
      tmrepuegeneral_impl.this.AV17Emprnom = GXv_char3[0] ;
      tmrepuegeneral_impl.this.AV18Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14I72( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtMRUltMov_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRUltMov_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltMov_Visible), 5, 0), true);
      edtMRUltRes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRUltRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltRes_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DSP", "")) == 0 ) ) )
      {
         this.executeUsercontrolMethod(sPrefix, false, "GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(4)});
      }
      else
      {
         this.executeUsercontrolMethod(sPrefix, false, "GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer", "ShowTab", "", new Object[] {Integer.valueOf(4)});
      }
      if ( ! ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DSP", "")) == 0 ) ) )
      {
         this.executeUsercontrolMethod(sPrefix, false, "GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(3)});
      }
      else
      {
         this.executeUsercontrolMethod(sPrefix, false, "GXUITABSPANEL_TRANSACTIONDETAIL_TABSContainer", "ShowTab", "", new Object[] {Integer.valueOf(3)});
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV14Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMRepue" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A9492MRCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
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
      paI72( ) ;
      wsI72( ) ;
      weI72( ) ;
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
      sCtrlA9492MRCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paI72( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tmrepuegeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paI72( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A9492MRCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9492MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A9492MRCod != wcpOA9492MRCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA9492MRCod = A9492MRCod ;
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
      sCtrlA9492MRCod = httpContext.cgiGet( sPrefix+"A9492MRCod_CTRL") ;
      if ( GXutil.len( sCtrlA9492MRCod) > 0 )
      {
         A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA9492MRCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
      else
      {
         A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A9492MRCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paI72( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsI72( ) ;
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
      wsI72( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9492MRCod_PARM", GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA9492MRCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9492MRCod_CTRL", GXutil.rtrim( sCtrlA9492MRCod));
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
      weI72( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623134137", true, true);
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
      httpContext.AddJavascriptSource("tmrepuegeneral.js", "?20263623134137", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTabgeneral_title_Internalname = sPrefix+"TABGENERAL_TITLE" ;
      edtMRCod_Internalname = sPrefix+"MRCOD" ;
      edtMRNom_Internalname = sPrefix+"MRNOM" ;
      chkMRActivo.setInternalname( sPrefix+"MRACTIVO" );
      edtMRCodExt_Internalname = sPrefix+"MRCODEXT" ;
      edtMRCodPrv_Internalname = sPrefix+"MRCODPRV" ;
      edtMRLote_Internalname = sPrefix+"MRLOTE" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtMRStkPre_Internalname = sPrefix+"MRSTKPRE" ;
      edtMRStkMin_Internalname = sPrefix+"MRSTKMIN" ;
      edtMRStkCri_Internalname = sPrefix+"MRSTKCRI" ;
      edtMRStkAct_Internalname = sPrefix+"MRSTKACT" ;
      edtMRStkRes_Internalname = sPrefix+"MRSTKRES" ;
      divTransactiondetail_grupostocks_Internalname = sPrefix+"TRANSACTIONDETAIL_GRUPOSTOCKS" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      lblTablevel_prv_title_Internalname = sPrefix+"TABLEVEL_PRV_TITLE" ;
      divTransactiondetail_tableleaflevel_prv_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_PRV" ;
      divTransactiondetail_tabtablelevel_prv_Internalname = sPrefix+"TRANSACTIONDETAIL_TABTABLELEVEL_PRV" ;
      lblTablevel_level1_title_Internalname = sPrefix+"TABLEVEL_LEVEL1_TITLE" ;
      divTransactiondetail_tableleaflevel_level1_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_LEVEL1" ;
      divTransactiondetail_tabtablelevel_level1_Internalname = sPrefix+"TRANSACTIONDETAIL_TABTABLELEVEL_LEVEL1" ;
      lblTablevel_level2_title_Internalname = sPrefix+"TABLEVEL_LEVEL2_TITLE" ;
      divTransactiondetail_tableleaflevel_level2_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_LEVEL2" ;
      divTransactiondetail_tabtablelevel_level2_Internalname = sPrefix+"TRANSACTIONDETAIL_TABTABLELEVEL_LEVEL2" ;
      Gxuitabspanel_transactiondetail_tabs_Internalname = sPrefix+"GXUITABSPANEL_TRANSACTIONDETAIL_TABS" ;
      divTransactiondetail_opciones_Internalname = sPrefix+"TRANSACTIONDETAIL_OPCIONES" ;
      Dvpanel_transactiondetail_opciones_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_OPCIONES" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtMRUltMov_Internalname = sPrefix+"MRULTMOV" ;
      edtMRUltRes_Internalname = sPrefix+"MRULTRES" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
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
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtMRUltRes_Jsonclick = "" ;
      edtMRUltRes_Visible = 1 ;
      edtMRUltMov_Jsonclick = "" ;
      edtMRUltMov_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtMRStkRes_Jsonclick = "" ;
      edtMRStkRes_Enabled = 0 ;
      edtMRStkAct_Jsonclick = "" ;
      edtMRStkAct_Enabled = 0 ;
      edtMRStkCri_Jsonclick = "" ;
      edtMRStkCri_Enabled = 0 ;
      edtMRStkMin_Jsonclick = "" ;
      edtMRStkMin_Enabled = 0 ;
      edtMRStkPre_Jsonclick = "" ;
      edtMRStkPre_Enabled = 0 ;
      edtMRLote_Jsonclick = "" ;
      edtMRLote_Enabled = 0 ;
      edtMRCodPrv_Jsonclick = "" ;
      edtMRCodPrv_Enabled = 0 ;
      edtMRCodExt_Jsonclick = "" ;
      edtMRCodExt_Enabled = 0 ;
      chkMRActivo.setEnabled( 0 );
      edtMRNom_Jsonclick = "" ;
      edtMRNom_Enabled = 0 ;
      edtMRCod_Jsonclick = "" ;
      edtMRCod_Enabled = 0 ;
      Dvpanel_transactiondetail_opciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_opciones_Iconposition = "Right" ;
      Dvpanel_transactiondetail_opciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_opciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_opciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_opciones_Title = "" ;
      Dvpanel_transactiondetail_opciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_opciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_opciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_opciones_Width = "100%" ;
      Gxuitabspanel_transactiondetail_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_transactiondetail_tabs_Class = "" ;
      Gxuitabspanel_transactiondetail_tabs_Pagecount = 4 ;
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
      chkMRActivo.setName( "MRACTIVO" );
      chkMRActivo.setWebtags( "" );
      chkMRActivo.setCaption( httpContext.getMessage( "Activo?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkMRActivo.getInternalname(), "TitleCaption", chkMRActivo.getCaption(), true);
      chkMRActivo.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''},{av:'AV14Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11I71',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12I71',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[]");
      setEventMetadata("VALID_MRCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV14Pgmname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_opciones = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_transactiondetail_tabs = new com.genexus.webpanels.GXUserControl();
      lblTabgeneral_title_Jsonclick = "" ;
      A9493MRNom = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A12850MRActivo = "" ;
      A9494MRCodExt = "" ;
      A11458MRCodPrv = "" ;
      A14491MRLote = "" ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      lblTablevel_prv_title_Jsonclick = "" ;
      lblTablevel_level1_title_Jsonclick = "" ;
      lblTablevel_level2_title_Jsonclick = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A407EmprNom = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00I72_A396EmprCod = new String[] {""} ;
      H00I72_A9492MRCod = new int[1] ;
      H00I72_A407EmprNom = new String[] {""} ;
      H00I72_n407EmprNom = new boolean[] {false} ;
      H00I72_A9501MRUltRes = new long[1] ;
      H00I72_n9501MRUltRes = new boolean[] {false} ;
      H00I72_A9500MRUltMov = new int[1] ;
      H00I72_n9500MRUltMov = new boolean[] {false} ;
      H00I72_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I72_n9496MRStkRes = new boolean[] {false} ;
      H00I72_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I72_n9495MRStkAct = new boolean[] {false} ;
      H00I72_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I72_n9498MRStkCri = new boolean[] {false} ;
      H00I72_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I72_n9497MRStkMin = new boolean[] {false} ;
      H00I72_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I72_n9499MRStkPre = new boolean[] {false} ;
      H00I72_A14491MRLote = new String[] {""} ;
      H00I72_A11458MRCodPrv = new String[] {""} ;
      H00I72_n11458MRCodPrv = new boolean[] {false} ;
      H00I72_A9494MRCodExt = new String[] {""} ;
      H00I72_n9494MRCodExt = new boolean[] {false} ;
      H00I72_A12850MRActivo = new String[] {""} ;
      H00I72_n12850MRActivo = new boolean[] {false} ;
      H00I72_A9493MRNom = new String[] {""} ;
      H00I72_n9493MRNom = new boolean[] {false} ;
      H00I73_A407EmprNom = new String[] {""} ;
      H00I73_n407EmprNom = new boolean[] {false} ;
      hsh = "" ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      AV16Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV17Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV18Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      Gx_mode = "" ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA9492MRCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmrepuegeneral__default(),
         new Object[] {
             new Object[] {
            H00I72_A396EmprCod, H00I72_A9492MRCod, H00I72_A407EmprNom, H00I72_n407EmprNom, H00I72_A9501MRUltRes, H00I72_n9501MRUltRes, H00I72_A9500MRUltMov, H00I72_n9500MRUltMov, H00I72_A9496MRStkRes, H00I72_n9496MRStkRes,
            H00I72_A9495MRStkAct, H00I72_n9495MRStkAct, H00I72_A9498MRStkCri, H00I72_n9498MRStkCri, H00I72_A9497MRStkMin, H00I72_n9497MRStkMin, H00I72_A9499MRStkPre, H00I72_n9499MRStkPre, H00I72_A14491MRLote, H00I72_A11458MRCodPrv,
            H00I72_n11458MRCodPrv, H00I72_A9494MRCodExt, H00I72_n9494MRCodExt, H00I72_A12850MRActivo, H00I72_n12850MRActivo, H00I72_A9493MRNom, H00I72_n9493MRNom
            }
            , new Object[] {
            H00I73_A407EmprNom, H00I73_n407EmprNom
            }
         }
      );
      AV14Pgmname = "TMRepueGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "TMRepueGeneral" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA9492MRCod ;
   private int A9492MRCod ;
   private int Gxuitabspanel_transactiondetail_tabs_Pagecount ;
   private int edtMRCod_Enabled ;
   private int edtMRNom_Enabled ;
   private int edtMRCodExt_Enabled ;
   private int edtMRCodPrv_Enabled ;
   private int edtMRLote_Enabled ;
   private int edtMRStkPre_Enabled ;
   private int edtMRStkMin_Enabled ;
   private int edtMRStkCri_Enabled ;
   private int edtMRStkAct_Enabled ;
   private int edtMRStkRes_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A9500MRUltMov ;
   private int edtMRUltMov_Visible ;
   private int edtMRUltRes_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int idxLst ;
   private long A9501MRUltRes ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV14Pgmname ;
   private String Gxuitabspanel_transactiondetail_tabs_Class ;
   private String Dvpanel_transactiondetail_opciones_Width ;
   private String Dvpanel_transactiondetail_opciones_Cls ;
   private String Dvpanel_transactiondetail_opciones_Title ;
   private String Dvpanel_transactiondetail_opciones_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String Dvpanel_transactiondetail_opciones_Internalname ;
   private String divTransactiondetail_opciones_Internalname ;
   private String Gxuitabspanel_transactiondetail_tabs_Internalname ;
   private String lblTabgeneral_title_Internalname ;
   private String lblTabgeneral_title_Jsonclick ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtMRCod_Internalname ;
   private String edtMRCod_Jsonclick ;
   private String edtMRNom_Internalname ;
   private String A9493MRNom ;
   private String edtMRNom_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String A12850MRActivo ;
   private String edtMRCodExt_Internalname ;
   private String A9494MRCodExt ;
   private String edtMRCodExt_Jsonclick ;
   private String edtMRCodPrv_Internalname ;
   private String A11458MRCodPrv ;
   private String edtMRCodPrv_Jsonclick ;
   private String edtMRLote_Internalname ;
   private String A14491MRLote ;
   private String edtMRLote_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtMRStkPre_Internalname ;
   private String edtMRStkPre_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String divTransactiondetail_grupostocks_Internalname ;
   private String edtMRStkMin_Internalname ;
   private String edtMRStkMin_Jsonclick ;
   private String edtMRStkCri_Internalname ;
   private String edtMRStkCri_Jsonclick ;
   private String edtMRStkAct_Internalname ;
   private String edtMRStkAct_Jsonclick ;
   private String edtMRStkRes_Internalname ;
   private String edtMRStkRes_Jsonclick ;
   private String lblTablevel_prv_title_Internalname ;
   private String lblTablevel_prv_title_Jsonclick ;
   private String divTransactiondetail_tabtablelevel_prv_Internalname ;
   private String divTransactiondetail_tableleaflevel_prv_Internalname ;
   private String lblTablevel_level1_title_Internalname ;
   private String lblTablevel_level1_title_Jsonclick ;
   private String divTransactiondetail_tabtablelevel_level1_Internalname ;
   private String divTransactiondetail_tableleaflevel_level1_Internalname ;
   private String lblTablevel_level2_title_Internalname ;
   private String lblTablevel_level2_title_Jsonclick ;
   private String divTransactiondetail_tabtablelevel_level2_Internalname ;
   private String divTransactiondetail_tableleaflevel_level2_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtMRUltMov_Internalname ;
   private String edtMRUltMov_Jsonclick ;
   private String edtMRUltRes_Internalname ;
   private String edtMRUltRes_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String hsh ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String AV16Emprcod ;
   private String GXv_char2[] ;
   private String AV17Emprnom ;
   private String GXv_char3[] ;
   private String AV18Usurcod ;
   private String GXv_char4[] ;
   private String Gx_mode ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA9492MRCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gxuitabspanel_transactiondetail_tabs_Historymanagement ;
   private boolean Dvpanel_transactiondetail_opciones_Autowidth ;
   private boolean Dvpanel_transactiondetail_opciones_Autoheight ;
   private boolean Dvpanel_transactiondetail_opciones_Collapsible ;
   private boolean Dvpanel_transactiondetail_opciones_Collapsed ;
   private boolean Dvpanel_transactiondetail_opciones_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_opciones_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n12850MRActivo ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n9501MRUltRes ;
   private boolean n9500MRUltMov ;
   private boolean n9496MRStkRes ;
   private boolean n9495MRStkAct ;
   private boolean n9498MRStkCri ;
   private boolean n9497MRStkMin ;
   private boolean n9499MRStkPre ;
   private boolean n11458MRCodPrv ;
   private boolean n9494MRCodExt ;
   private boolean n9493MRNom ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_opciones ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_transactiondetail_tabs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkMRActivo ;
   private IDataStoreProvider pr_default ;
   private String[] H00I72_A396EmprCod ;
   private int[] H00I72_A9492MRCod ;
   private String[] H00I72_A407EmprNom ;
   private boolean[] H00I72_n407EmprNom ;
   private long[] H00I72_A9501MRUltRes ;
   private boolean[] H00I72_n9501MRUltRes ;
   private int[] H00I72_A9500MRUltMov ;
   private boolean[] H00I72_n9500MRUltMov ;
   private java.math.BigDecimal[] H00I72_A9496MRStkRes ;
   private boolean[] H00I72_n9496MRStkRes ;
   private java.math.BigDecimal[] H00I72_A9495MRStkAct ;
   private boolean[] H00I72_n9495MRStkAct ;
   private java.math.BigDecimal[] H00I72_A9498MRStkCri ;
   private boolean[] H00I72_n9498MRStkCri ;
   private java.math.BigDecimal[] H00I72_A9497MRStkMin ;
   private boolean[] H00I72_n9497MRStkMin ;
   private java.math.BigDecimal[] H00I72_A9499MRStkPre ;
   private boolean[] H00I72_n9499MRStkPre ;
   private String[] H00I72_A14491MRLote ;
   private String[] H00I72_A11458MRCodPrv ;
   private boolean[] H00I72_n11458MRCodPrv ;
   private String[] H00I72_A9494MRCodExt ;
   private boolean[] H00I72_n9494MRCodExt ;
   private String[] H00I72_A12850MRActivo ;
   private boolean[] H00I72_n12850MRActivo ;
   private String[] H00I72_A9493MRNom ;
   private boolean[] H00I72_n9493MRNom ;
   private String[] H00I73_A407EmprNom ;
   private boolean[] H00I73_n407EmprNom ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tmrepuegeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00I72", "SELECT T1.EmprCod, T1.MRCod, T2.EmprNom, T1.MRUltRes, T1.MRUltMov, T1.MRStkRes, T1.MRStkAct, T1.MRStkCri, T1.MRStkMin, T1.MRStkPre, T1.MRLote, T1.MRCodPrv, T1.MRCodExt, T1.MRActivo, T1.MRNom FROM (TXPMREPUE T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.MRCod = ? ORDER BY T1.EmprCod, T1.MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00I73", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 20);
               ((String[]) buf[19])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 100);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

