package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class in_alertasanalisis_maqcod_wc_impl extends GXWebComponent
{
   public in_alertasanalisis_maqcod_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public in_alertasanalisis_maqcod_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( in_alertasanalisis_maqcod_wc_impl.class ));
   }

   public in_alertasanalisis_maqcod_wc_impl( int remoteHandle ,
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,A602MaqCod});
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
         pa1TH2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Datos de la maquina", "")) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.in_alertasanalisis_maqcod_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod))}, new String[] {"EmprCod","MaqCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA602MaqCod", GXutil.rtrim( wcpOA602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
   }

   public void renderHtmlCloseForm1TH2( )
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
      return "Ingenieria.In_AlertasAnalisis_MaqCod_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Datos de la maquina", "") ;
   }

   public void wb1TH0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.in_alertasanalisis_maqcod_wc");
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
            httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "General", ""), "", "", lblTab01_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab01") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqDsc_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtMaqDsc_Link, "", "", "", edtMaqDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTip_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqTip_Internalname, httpContext.getMessage( "Tipo Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTip_Internalname, GXutil.rtrim( A620MaqTip), GXutil.rtrim( localUtil.format( A620MaqTip, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipMaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqTipMaq_Internalname, httpContext.getMessage( "Tipo Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipMaq_Internalname, GXutil.rtrim( A3601MaqTipMaq), GXutil.rtrim( localUtil.format( A3601MaqTipMaq, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipMaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqTipMaq_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCap_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqCap_Internalname, httpContext.getMessage( "Capacidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCap_Internalname, GXutil.ltrim( localUtil.ntoc( A600MaqCap, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCap_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A600MaqCap), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A600MaqCap), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCap_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCap_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqEst_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqEst_Internalname, httpContext.getMessage( "Estado Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqEst_Internalname, GXutil.rtrim( A607MaqEst), GXutil.rtrim( localUtil.format( A607MaqEst, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqEst_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDTGarIn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqDTGarIn_Internalname, httpContext.getMessage( "Inicio Garantía", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtMaqDTGarIn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDTGarIn_Internalname, localUtil.format(A11504MaqDTGarIn, "99/99/99"), localUtil.format( A11504MaqDTGarIn, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDTGarIn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqDTGarIn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtMaqDTGarIn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMaqDTGarIn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDTGarFi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqDTGarFi_Internalname, httpContext.getMessage( "Fin Garantía", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtMaqDTGarFi_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDTGarFi_Internalname, localUtil.format(A11505MaqDTGarFi, "99/99/99"), localUtil.format( A11505MaqDTGarFi, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDTGarFi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqDTGarFi_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtMaqDTGarFi_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMaqDTGarFi_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCosMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqCosMin_Internalname, httpContext.getMessage( "Coste Minuto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCosMin_Internalname, GXutil.ltrim( localUtil.ntoc( A605MaqCosMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqCosMin_Enabled!=0) ? localUtil.format( A605MaqCosMin, "ZZZZ9.9999") : localUtil.format( A605MaqCosMin, "ZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCosMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCosMin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqHorPro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqHorPro_Internalname, httpContext.getMessage( "Horas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHorPro_Internalname, GXutil.ltrim( localUtil.ntoc( A612MaqHorPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqHorPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A612MaqHorPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A612MaqHorPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHorPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqHorPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqMinPro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqMinPro_Internalname, httpContext.getMessage( "Minutos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A615MaqMinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A615MaqMinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A615MaqMinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMinPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqMinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqUltFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqUltFec_Internalname, httpContext.getMessage( "Ultima Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqUltFec_Internalname, GXutil.rtrim( A621MaqUltFec), GXutil.rtrim( localUtil.format( A621MaqUltFec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqUltFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqUltFec_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqResDia_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqResDia_Internalname, httpContext.getMessage( "Horas no usadas de un dia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqResDia_Internalname, GXutil.ltrim( localUtil.ntoc( A617MaqResDia, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqResDia_Enabled!=0) ? localUtil.format( A617MaqResDia, "Z9.99") : localUtil.format( A617MaqResDia, "Z9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqResDia_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqResDia_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqHorAsi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqHorAsi_Internalname, httpContext.getMessage( "Horas totales asignadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHorAsi_Internalname, GXutil.ltrim( localUtil.ntoc( A611MaqHorAsi, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqHorAsi_Enabled!=0) ? localUtil.format( A611MaqHorAsi, "ZZZ9.99") : localUtil.format( A611MaqHorAsi, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHorAsi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqHorAsi_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqKgsMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqKgsMin_Internalname, httpContext.getMessage( "Kilos Minimos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMin_Internalname, GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMin_Enabled!=0) ? localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99") : localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqKgsMin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqKgsMed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqKgsMed_Internalname, httpContext.getMessage( "Kilos Medios", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMed_Internalname, GXutil.ltrim( localUtil.ntoc( A4284MaqKgsMed, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMed_Enabled!=0) ? localUtil.format( A4284MaqKgsMed, "ZZZZZ9.99") : localUtil.format( A4284MaqKgsMed, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqKgsMed_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqKgsMax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqKgsMax_Internalname, httpContext.getMessage( "Kilos Maximos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMax_Internalname, GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMax_Enabled!=0) ? localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99") : localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqKgsMax_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqPrdMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqPrdMin_Internalname, httpContext.getMessage( "Numero Min. Prendas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPrdMin_Internalname, GXutil.ltrim( localUtil.ntoc( A4319MaqPrdMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqPrdMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4319MaqPrdMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4319MaqPrdMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPrdMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqPrdMin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqPrdMed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqPrdMed_Internalname, httpContext.getMessage( "Numero Medio Prendas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPrdMed_Internalname, GXutil.ltrim( localUtil.ntoc( A4320MaqPrdMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqPrdMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4320MaqPrdMed), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4320MaqPrdMed), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPrdMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqPrdMed_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqPrdMax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqPrdMax_Internalname, httpContext.getMessage( "Numero Max. Prendas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPrdMax_Internalname, GXutil.ltrim( localUtil.ntoc( A4321MaqPrdMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqPrdMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4321MaqPrdMax), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4321MaqPrdMax), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPrdMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqPrdMax_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolMax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqVolMax_Internalname, httpContext.getMessage( "Volumen Maximo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMax_Internalname, GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolMax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqVolMin_Internalname, httpContext.getMessage( "Volumen Minimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMin_Internalname, GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolMin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolMed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqVolMed_Internalname, httpContext.getMessage( "Volumen Medio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMed_Internalname, GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolMed_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqVolRes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqVolRes_Internalname, httpContext.getMessage( "Volumen Residual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolRes_Internalname, GXutil.ltrim( localUtil.ntoc( A2801MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolRes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2801MaqVolRes), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2801MaqVolRes), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqVolRes_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Estadísticas", ""), "", "", lblTab02_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab02") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado3_Internalname, 1, 0, "px", divTableresultado3_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_resultado3_Internalname, httpContext.getMessage( "Consultar que Graficos / reportes  mostrar", ""), "", "", lblTextblock_resultado3_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImage31_Internalname, httpContext.getMessage( "<i class='fas fa-table' style='font-size: 50px'></i>", ""), "", "", lblImage31_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImage32_Internalname, httpContext.getMessage( "<i class='fas fa-chart-line' style='font-size: 50px'></i>", ""), "", "", lblImage32_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImage33_Internalname, httpContext.getMessage( "<i class='far fa-file-alt' style='font-size: 50px'></i>", ""), "", "", lblImage33_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV17Pgmname), GXutil.rtrim( localUtil.format( AV17Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_MaqCod_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1TH2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Datos de la maquina", ""), (short)(0)) ;
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
            strup1TH0( ) ;
         }
      }
   }

   public void ws1TH2( )
   {
      start1TH2( ) ;
      evt1TH2( ) ;
   }

   public void evt1TH2( )
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
                              strup1TH0( ) ;
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
                              strup1TH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111TH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e121TH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TH0( ) ;
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
                              strup1TH0( ) ;
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

   public void we1TH2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1TH2( ) ;
         }
      }
   }

   public void pa1TH2( )
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
      rf1TH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "Ingenieria.In_AlertasAnalisis_MaqCod_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Pgmname", AV17Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1TH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01TH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A2801MaqVolRes = H01TH2_A2801MaqVolRes[0] ;
            n2801MaqVolRes = H01TH2_n2801MaqVolRes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2801MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2801MaqVolRes), 5, 0));
            A624MaqVolMed = H01TH2_A624MaqVolMed[0] ;
            n624MaqVolMed = H01TH2_n624MaqVolMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
            A625MaqVolMin = H01TH2_A625MaqVolMin[0] ;
            n625MaqVolMin = H01TH2_n625MaqVolMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
            A623MaqVolMax = H01TH2_A623MaqVolMax[0] ;
            n623MaqVolMax = H01TH2_n623MaqVolMax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
            A4321MaqPrdMax = H01TH2_A4321MaqPrdMax[0] ;
            n4321MaqPrdMax = H01TH2_n4321MaqPrdMax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4321MaqPrdMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4321MaqPrdMax), 4, 0));
            A4320MaqPrdMed = H01TH2_A4320MaqPrdMed[0] ;
            n4320MaqPrdMed = H01TH2_n4320MaqPrdMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4320MaqPrdMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4320MaqPrdMed), 4, 0));
            A4319MaqPrdMin = H01TH2_A4319MaqPrdMin[0] ;
            n4319MaqPrdMin = H01TH2_n4319MaqPrdMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4319MaqPrdMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4319MaqPrdMin), 4, 0));
            A4285MaqKgsMax = H01TH2_A4285MaqKgsMax[0] ;
            n4285MaqKgsMax = H01TH2_n4285MaqKgsMax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
            A4284MaqKgsMed = H01TH2_A4284MaqKgsMed[0] ;
            n4284MaqKgsMed = H01TH2_n4284MaqKgsMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4284MaqKgsMed", GXutil.ltrimstr( A4284MaqKgsMed, 9, 2));
            A4283MaqKgsMin = H01TH2_A4283MaqKgsMin[0] ;
            n4283MaqKgsMin = H01TH2_n4283MaqKgsMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
            A611MaqHorAsi = H01TH2_A611MaqHorAsi[0] ;
            n611MaqHorAsi = H01TH2_n611MaqHorAsi[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A611MaqHorAsi", GXutil.ltrimstr( A611MaqHorAsi, 7, 2));
            A617MaqResDia = H01TH2_A617MaqResDia[0] ;
            n617MaqResDia = H01TH2_n617MaqResDia[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A617MaqResDia", GXutil.ltrimstr( A617MaqResDia, 5, 2));
            A621MaqUltFec = H01TH2_A621MaqUltFec[0] ;
            n621MaqUltFec = H01TH2_n621MaqUltFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A621MaqUltFec", A621MaqUltFec);
            A615MaqMinPro = H01TH2_A615MaqMinPro[0] ;
            n615MaqMinPro = H01TH2_n615MaqMinPro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A615MaqMinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A615MaqMinPro), 2, 0));
            A612MaqHorPro = H01TH2_A612MaqHorPro[0] ;
            n612MaqHorPro = H01TH2_n612MaqHorPro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A612MaqHorPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A612MaqHorPro), 2, 0));
            A605MaqCosMin = H01TH2_A605MaqCosMin[0] ;
            n605MaqCosMin = H01TH2_n605MaqCosMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A605MaqCosMin", GXutil.ltrimstr( A605MaqCosMin, 10, 4));
            A11505MaqDTGarFi = H01TH2_A11505MaqDTGarFi[0] ;
            n11505MaqDTGarFi = H01TH2_n11505MaqDTGarFi[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11505MaqDTGarFi", localUtil.format(A11505MaqDTGarFi, "99/99/99"));
            A11504MaqDTGarIn = H01TH2_A11504MaqDTGarIn[0] ;
            n11504MaqDTGarIn = H01TH2_n11504MaqDTGarIn[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11504MaqDTGarIn", localUtil.format(A11504MaqDTGarIn, "99/99/99"));
            A607MaqEst = H01TH2_A607MaqEst[0] ;
            n607MaqEst = H01TH2_n607MaqEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A607MaqEst", A607MaqEst);
            A600MaqCap = H01TH2_A600MaqCap[0] ;
            n600MaqCap = H01TH2_n600MaqCap[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A600MaqCap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A600MaqCap), 6, 0));
            A3601MaqTipMaq = H01TH2_A3601MaqTipMaq[0] ;
            n3601MaqTipMaq = H01TH2_n3601MaqTipMaq[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3601MaqTipMaq", A3601MaqTipMaq);
            A620MaqTip = H01TH2_A620MaqTip[0] ;
            n620MaqTip = H01TH2_n620MaqTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A620MaqTip", A620MaqTip);
            A606MaqDsc = H01TH2_A606MaqDsc[0] ;
            n606MaqDsc = H01TH2_n606MaqDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A606MaqDsc", A606MaqDsc);
            /* Execute user event: Load */
            e121TH2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1TH0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1TH2( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "Ingenieria.In_AlertasAnalisis_MaqCod_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Pgmname", AV17Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1TH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111TH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA602MaqCod = httpContext.cgiGet( sPrefix+"wcpOA602MaqCod") ;
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Historymanagement")) ;
         /* Read variables values. */
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A606MaqDsc", A606MaqDsc);
         A620MaqTip = GXutil.upper( httpContext.cgiGet( edtMaqTip_Internalname)) ;
         n620MaqTip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A620MaqTip", A620MaqTip);
         A3601MaqTipMaq = GXutil.upper( httpContext.cgiGet( edtMaqTipMaq_Internalname)) ;
         n3601MaqTipMaq = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3601MaqTipMaq", A3601MaqTipMaq);
         A600MaqCap = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n600MaqCap = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A600MaqCap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A600MaqCap), 6, 0));
         A607MaqEst = GXutil.upper( httpContext.cgiGet( edtMaqEst_Internalname)) ;
         n607MaqEst = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A607MaqEst", A607MaqEst);
         A11504MaqDTGarIn = localUtil.ctod( httpContext.cgiGet( edtMaqDTGarIn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n11504MaqDTGarIn = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11504MaqDTGarIn", localUtil.format(A11504MaqDTGarIn, "99/99/99"));
         A11505MaqDTGarFi = localUtil.ctod( httpContext.cgiGet( edtMaqDTGarFi_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n11505MaqDTGarFi = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11505MaqDTGarFi", localUtil.format(A11505MaqDTGarFi, "99/99/99"));
         A605MaqCosMin = localUtil.ctond( httpContext.cgiGet( edtMaqCosMin_Internalname)) ;
         n605MaqCosMin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A605MaqCosMin", GXutil.ltrimstr( A605MaqCosMin, 10, 4));
         A612MaqHorPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqHorPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n612MaqHorPro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A612MaqHorPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A612MaqHorPro), 2, 0));
         A615MaqMinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n615MaqMinPro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A615MaqMinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A615MaqMinPro), 2, 0));
         A621MaqUltFec = httpContext.cgiGet( edtMaqUltFec_Internalname) ;
         n621MaqUltFec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A621MaqUltFec", A621MaqUltFec);
         A617MaqResDia = localUtil.ctond( httpContext.cgiGet( edtMaqResDia_Internalname)) ;
         n617MaqResDia = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A617MaqResDia", GXutil.ltrimstr( A617MaqResDia, 5, 2));
         A611MaqHorAsi = localUtil.ctond( httpContext.cgiGet( edtMaqHorAsi_Internalname)) ;
         n611MaqHorAsi = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A611MaqHorAsi", GXutil.ltrimstr( A611MaqHorAsi, 7, 2));
         A4283MaqKgsMin = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)) ;
         n4283MaqKgsMin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
         A4284MaqKgsMed = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMed_Internalname)) ;
         n4284MaqKgsMed = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4284MaqKgsMed", GXutil.ltrimstr( A4284MaqKgsMed, 9, 2));
         A4285MaqKgsMax = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)) ;
         n4285MaqKgsMax = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
         A4319MaqPrdMin = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPrdMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4319MaqPrdMin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4319MaqPrdMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4319MaqPrdMin), 4, 0));
         A4320MaqPrdMed = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPrdMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4320MaqPrdMed = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4320MaqPrdMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4320MaqPrdMed), 4, 0));
         A4321MaqPrdMax = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPrdMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4321MaqPrdMax = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4321MaqPrdMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4321MaqPrdMax), 4, 0));
         A623MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n623MaqVolMax = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
         A625MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n625MaqVolMin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
         A624MaqVolMed = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n624MaqVolMed = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
         A2801MaqVolRes = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2801MaqVolRes = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2801MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2801MaqVolRes), 5, 0));
         AV17Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Pgmname", AV17Pgmname);
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
      e111TH2 ();
      if (returnInSub) return;
   }

   public void e111TH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      in_alertasanalisis_maqcod_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = AV19Emprcod ;
      GXv_char3[0] = AV20Emprnom ;
      GXv_char4[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      in_alertasanalisis_maqcod_wc_impl.this.AV19Emprcod = GXv_char2[0] ;
      in_alertasanalisis_maqcod_wc_impl.this.AV20Emprnom = GXv_char3[0] ;
      in_alertasanalisis_maqcod_wc_impl.this.AV21Usurcod = GXv_char4[0] ;
      divTableresultado3_Height = 350 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTableresultado3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado3_Height), 9, 0), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e121TH2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtMaqDsc_Link = formatLink("app.tmaqfasview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MaqCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqDsc_Internalname, "Link", edtMaqDsc_Link, true);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A602MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
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
      pa1TH2( ) ;
      ws1TH2( ) ;
      we1TH2( ) ;
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
      sCtrlA602MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1TH2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\in_alertasanalisis_maqcod_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1TH2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A602MaqCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA602MaqCod = httpContext.cgiGet( sPrefix+"wcpOA602MaqCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, wcpOA602MaqCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA602MaqCod = A602MaqCod ;
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
      sCtrlA602MaqCod = httpContext.cgiGet( sPrefix+"A602MaqCod_CTRL") ;
      if ( GXutil.len( sCtrlA602MaqCod) > 0 )
      {
         A602MaqCod = httpContext.cgiGet( sCtrlA602MaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
      }
      else
      {
         A602MaqCod = httpContext.cgiGet( sPrefix+"A602MaqCod_PARM") ;
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
      pa1TH2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1TH2( ) ;
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
      ws1TH2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A602MaqCod_PARM", GXutil.rtrim( A602MaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA602MaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A602MaqCod_CTRL", GXutil.rtrim( sCtrlA602MaqCod));
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
      we1TH2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015555872", true, true);
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
         httpContext.AddJavascriptSource("ingenieria/in_alertasanalisis_maqcod_wc.js", "?202661015555873", false, true);
         httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
         httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
         httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
         httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
         httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTab01_title_Internalname = sPrefix+"TAB01_TITLE" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC" ;
      edtMaqTip_Internalname = sPrefix+"MAQTIP" ;
      edtMaqTipMaq_Internalname = sPrefix+"MAQTIPMAQ" ;
      edtMaqCap_Internalname = sPrefix+"MAQCAP" ;
      edtMaqEst_Internalname = sPrefix+"MAQEST" ;
      edtMaqDTGarIn_Internalname = sPrefix+"MAQDTGARIN" ;
      edtMaqDTGarFi_Internalname = sPrefix+"MAQDTGARFI" ;
      edtMaqCosMin_Internalname = sPrefix+"MAQCOSMIN" ;
      edtMaqHorPro_Internalname = sPrefix+"MAQHORPRO" ;
      edtMaqMinPro_Internalname = sPrefix+"MAQMINPRO" ;
      edtMaqUltFec_Internalname = sPrefix+"MAQULTFEC" ;
      edtMaqResDia_Internalname = sPrefix+"MAQRESDIA" ;
      edtMaqHorAsi_Internalname = sPrefix+"MAQHORASI" ;
      edtMaqKgsMin_Internalname = sPrefix+"MAQKGSMIN" ;
      edtMaqKgsMed_Internalname = sPrefix+"MAQKGSMED" ;
      edtMaqKgsMax_Internalname = sPrefix+"MAQKGSMAX" ;
      edtMaqPrdMin_Internalname = sPrefix+"MAQPRDMIN" ;
      edtMaqPrdMed_Internalname = sPrefix+"MAQPRDMED" ;
      edtMaqPrdMax_Internalname = sPrefix+"MAQPRDMAX" ;
      edtMaqVolMax_Internalname = sPrefix+"MAQVOLMAX" ;
      edtMaqVolMin_Internalname = sPrefix+"MAQVOLMIN" ;
      edtMaqVolMed_Internalname = sPrefix+"MAQVOLMED" ;
      edtMaqVolRes_Internalname = sPrefix+"MAQVOLRES" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      lblTab02_title_Internalname = sPrefix+"TAB02_TITLE" ;
      lblTextblock_resultado3_Internalname = sPrefix+"TEXTBLOCK_RESULTADO3" ;
      lblImage31_Internalname = sPrefix+"IMAGE31" ;
      lblImage32_Internalname = sPrefix+"IMAGE32" ;
      lblImage33_Internalname = sPrefix+"IMAGE33" ;
      divTableresultado3_Internalname = sPrefix+"TABLERESULTADO3" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Gxuitabspanel_tabs_Internalname = sPrefix+"GXUITABSPANEL_TABS" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divTableresultado3_Height = 0 ;
      edtMaqVolRes_Jsonclick = "" ;
      edtMaqVolRes_Enabled = 0 ;
      edtMaqVolMed_Jsonclick = "" ;
      edtMaqVolMed_Enabled = 0 ;
      edtMaqVolMin_Jsonclick = "" ;
      edtMaqVolMin_Enabled = 0 ;
      edtMaqVolMax_Jsonclick = "" ;
      edtMaqVolMax_Enabled = 0 ;
      edtMaqPrdMax_Jsonclick = "" ;
      edtMaqPrdMax_Enabled = 0 ;
      edtMaqPrdMed_Jsonclick = "" ;
      edtMaqPrdMed_Enabled = 0 ;
      edtMaqPrdMin_Jsonclick = "" ;
      edtMaqPrdMin_Enabled = 0 ;
      edtMaqKgsMax_Jsonclick = "" ;
      edtMaqKgsMax_Enabled = 0 ;
      edtMaqKgsMed_Jsonclick = "" ;
      edtMaqKgsMed_Enabled = 0 ;
      edtMaqKgsMin_Jsonclick = "" ;
      edtMaqKgsMin_Enabled = 0 ;
      edtMaqHorAsi_Jsonclick = "" ;
      edtMaqHorAsi_Enabled = 0 ;
      edtMaqResDia_Jsonclick = "" ;
      edtMaqResDia_Enabled = 0 ;
      edtMaqUltFec_Jsonclick = "" ;
      edtMaqUltFec_Enabled = 0 ;
      edtMaqMinPro_Jsonclick = "" ;
      edtMaqMinPro_Enabled = 0 ;
      edtMaqHorPro_Jsonclick = "" ;
      edtMaqHorPro_Enabled = 0 ;
      edtMaqCosMin_Jsonclick = "" ;
      edtMaqCosMin_Enabled = 0 ;
      edtMaqDTGarFi_Jsonclick = "" ;
      edtMaqDTGarFi_Enabled = 0 ;
      edtMaqDTGarIn_Jsonclick = "" ;
      edtMaqDTGarIn_Enabled = 0 ;
      edtMaqEst_Jsonclick = "" ;
      edtMaqEst_Enabled = 0 ;
      edtMaqCap_Jsonclick = "" ;
      edtMaqCap_Enabled = 0 ;
      edtMaqTipMaq_Jsonclick = "" ;
      edtMaqTipMaq_Enabled = 0 ;
      edtMaqTip_Jsonclick = "" ;
      edtMaqTip_Enabled = 0 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Link = "" ;
      edtMaqDsc_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 0 ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 2 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Otros datos", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
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
      wcpOA602MaqCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      A606MaqDsc = "" ;
      A620MaqTip = "" ;
      A3601MaqTipMaq = "" ;
      A607MaqEst = "" ;
      A11504MaqDTGarIn = GXutil.nullDate() ;
      A11505MaqDTGarFi = GXutil.nullDate() ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A605MaqCosMin = DecimalUtil.ZERO ;
      A621MaqUltFec = "" ;
      A617MaqResDia = DecimalUtil.ZERO ;
      A611MaqHorAsi = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      lblTab02_title_Jsonclick = "" ;
      lblTextblock_resultado3_Jsonclick = "" ;
      lblImage31_Jsonclick = "" ;
      lblImage32_Jsonclick = "" ;
      lblImage33_Jsonclick = "" ;
      AV17Pgmname = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01TH2_A396EmprCod = new String[] {""} ;
      H01TH2_A602MaqCod = new String[] {""} ;
      H01TH2_A2801MaqVolRes = new int[1] ;
      H01TH2_n2801MaqVolRes = new boolean[] {false} ;
      H01TH2_A624MaqVolMed = new int[1] ;
      H01TH2_n624MaqVolMed = new boolean[] {false} ;
      H01TH2_A625MaqVolMin = new int[1] ;
      H01TH2_n625MaqVolMin = new boolean[] {false} ;
      H01TH2_A623MaqVolMax = new int[1] ;
      H01TH2_n623MaqVolMax = new boolean[] {false} ;
      H01TH2_A4321MaqPrdMax = new short[1] ;
      H01TH2_n4321MaqPrdMax = new boolean[] {false} ;
      H01TH2_A4320MaqPrdMed = new short[1] ;
      H01TH2_n4320MaqPrdMed = new boolean[] {false} ;
      H01TH2_A4319MaqPrdMin = new short[1] ;
      H01TH2_n4319MaqPrdMin = new boolean[] {false} ;
      H01TH2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TH2_n4285MaqKgsMax = new boolean[] {false} ;
      H01TH2_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TH2_n4284MaqKgsMed = new boolean[] {false} ;
      H01TH2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TH2_n4283MaqKgsMin = new boolean[] {false} ;
      H01TH2_A611MaqHorAsi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TH2_n611MaqHorAsi = new boolean[] {false} ;
      H01TH2_A617MaqResDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TH2_n617MaqResDia = new boolean[] {false} ;
      H01TH2_A621MaqUltFec = new String[] {""} ;
      H01TH2_n621MaqUltFec = new boolean[] {false} ;
      H01TH2_A615MaqMinPro = new byte[1] ;
      H01TH2_n615MaqMinPro = new boolean[] {false} ;
      H01TH2_A612MaqHorPro = new byte[1] ;
      H01TH2_n612MaqHorPro = new boolean[] {false} ;
      H01TH2_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TH2_n605MaqCosMin = new boolean[] {false} ;
      H01TH2_A11505MaqDTGarFi = new java.util.Date[] {GXutil.nullDate()} ;
      H01TH2_n11505MaqDTGarFi = new boolean[] {false} ;
      H01TH2_A11504MaqDTGarIn = new java.util.Date[] {GXutil.nullDate()} ;
      H01TH2_n11504MaqDTGarIn = new boolean[] {false} ;
      H01TH2_A607MaqEst = new String[] {""} ;
      H01TH2_n607MaqEst = new boolean[] {false} ;
      H01TH2_A600MaqCap = new int[1] ;
      H01TH2_n600MaqCap = new boolean[] {false} ;
      H01TH2_A3601MaqTipMaq = new String[] {""} ;
      H01TH2_n3601MaqTipMaq = new boolean[] {false} ;
      H01TH2_A620MaqTip = new String[] {""} ;
      H01TH2_n620MaqTip = new boolean[] {false} ;
      H01TH2_A606MaqDsc = new String[] {""} ;
      H01TH2_n606MaqDsc = new boolean[] {false} ;
      AV18Station = "" ;
      GXt_char1 = "" ;
      AV19Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV21Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.in_alertasanalisis_maqcod_wc__default(),
         new Object[] {
             new Object[] {
            H01TH2_A396EmprCod, H01TH2_A602MaqCod, H01TH2_A2801MaqVolRes, H01TH2_n2801MaqVolRes, H01TH2_A624MaqVolMed, H01TH2_n624MaqVolMed, H01TH2_A625MaqVolMin, H01TH2_n625MaqVolMin, H01TH2_A623MaqVolMax, H01TH2_n623MaqVolMax,
            H01TH2_A4321MaqPrdMax, H01TH2_n4321MaqPrdMax, H01TH2_A4320MaqPrdMed, H01TH2_n4320MaqPrdMed, H01TH2_A4319MaqPrdMin, H01TH2_n4319MaqPrdMin, H01TH2_A4285MaqKgsMax, H01TH2_n4285MaqKgsMax, H01TH2_A4284MaqKgsMed, H01TH2_n4284MaqKgsMed,
            H01TH2_A4283MaqKgsMin, H01TH2_n4283MaqKgsMin, H01TH2_A611MaqHorAsi, H01TH2_n611MaqHorAsi, H01TH2_A617MaqResDia, H01TH2_n617MaqResDia, H01TH2_A621MaqUltFec, H01TH2_n621MaqUltFec, H01TH2_A615MaqMinPro, H01TH2_n615MaqMinPro,
            H01TH2_A612MaqHorPro, H01TH2_n612MaqHorPro, H01TH2_A605MaqCosMin, H01TH2_n605MaqCosMin, H01TH2_A11505MaqDTGarFi, H01TH2_n11505MaqDTGarFi, H01TH2_A11504MaqDTGarIn, H01TH2_n11504MaqDTGarIn, H01TH2_A607MaqEst, H01TH2_n607MaqEst,
            H01TH2_A600MaqCap, H01TH2_n600MaqCap, H01TH2_A3601MaqTipMaq, H01TH2_n3601MaqTipMaq, H01TH2_A620MaqTip, H01TH2_n620MaqTip, H01TH2_A606MaqDsc, H01TH2_n606MaqDsc
            }
         }
      );
      AV17Pgmname = "Ingenieria.In_AlertasAnalisis_MaqCod_WC" ;
      /* GeneXus formulas. */
      AV17Pgmname = "Ingenieria.In_AlertasAnalisis_MaqCod_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte A612MaqHorPro ;
   private byte A615MaqMinPro ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short A4319MaqPrdMin ;
   private short A4320MaqPrdMed ;
   private short A4321MaqPrdMax ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqTip_Enabled ;
   private int edtMaqTipMaq_Enabled ;
   private int A600MaqCap ;
   private int edtMaqCap_Enabled ;
   private int edtMaqEst_Enabled ;
   private int edtMaqDTGarIn_Enabled ;
   private int edtMaqDTGarFi_Enabled ;
   private int edtMaqCosMin_Enabled ;
   private int edtMaqHorPro_Enabled ;
   private int edtMaqMinPro_Enabled ;
   private int edtMaqUltFec_Enabled ;
   private int edtMaqResDia_Enabled ;
   private int edtMaqHorAsi_Enabled ;
   private int edtMaqKgsMin_Enabled ;
   private int edtMaqKgsMed_Enabled ;
   private int edtMaqKgsMax_Enabled ;
   private int edtMaqPrdMin_Enabled ;
   private int edtMaqPrdMed_Enabled ;
   private int edtMaqPrdMax_Enabled ;
   private int A623MaqVolMax ;
   private int edtMaqVolMax_Enabled ;
   private int A625MaqVolMin ;
   private int edtMaqVolMin_Enabled ;
   private int A624MaqVolMed ;
   private int edtMaqVolMed_Enabled ;
   private int A2801MaqVolRes ;
   private int edtMaqVolRes_Enabled ;
   private int divTableresultado3_Height ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A617MaqResDia ;
   private java.math.BigDecimal A611MaqHorAsi ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Gxuitabspanel_tabs_Class ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Link ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqTip_Internalname ;
   private String A620MaqTip ;
   private String edtMaqTip_Jsonclick ;
   private String edtMaqTipMaq_Internalname ;
   private String A3601MaqTipMaq ;
   private String edtMaqTipMaq_Jsonclick ;
   private String edtMaqCap_Internalname ;
   private String edtMaqCap_Jsonclick ;
   private String edtMaqEst_Internalname ;
   private String A607MaqEst ;
   private String edtMaqEst_Jsonclick ;
   private String edtMaqDTGarIn_Internalname ;
   private String edtMaqDTGarIn_Jsonclick ;
   private String edtMaqDTGarFi_Internalname ;
   private String edtMaqDTGarFi_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtMaqCosMin_Internalname ;
   private String edtMaqCosMin_Jsonclick ;
   private String edtMaqHorPro_Internalname ;
   private String edtMaqHorPro_Jsonclick ;
   private String edtMaqMinPro_Internalname ;
   private String edtMaqMinPro_Jsonclick ;
   private String edtMaqUltFec_Internalname ;
   private String A621MaqUltFec ;
   private String edtMaqUltFec_Jsonclick ;
   private String edtMaqResDia_Internalname ;
   private String edtMaqResDia_Jsonclick ;
   private String edtMaqHorAsi_Internalname ;
   private String edtMaqHorAsi_Jsonclick ;
   private String edtMaqKgsMin_Internalname ;
   private String edtMaqKgsMin_Jsonclick ;
   private String edtMaqKgsMed_Internalname ;
   private String edtMaqKgsMed_Jsonclick ;
   private String edtMaqKgsMax_Internalname ;
   private String edtMaqKgsMax_Jsonclick ;
   private String edtMaqPrdMin_Internalname ;
   private String edtMaqPrdMin_Jsonclick ;
   private String edtMaqPrdMed_Internalname ;
   private String edtMaqPrdMed_Jsonclick ;
   private String edtMaqPrdMax_Internalname ;
   private String edtMaqPrdMax_Jsonclick ;
   private String edtMaqVolMax_Internalname ;
   private String edtMaqVolMax_Jsonclick ;
   private String edtMaqVolMin_Internalname ;
   private String edtMaqVolMin_Jsonclick ;
   private String edtMaqVolMed_Internalname ;
   private String edtMaqVolMed_Jsonclick ;
   private String edtMaqVolRes_Internalname ;
   private String edtMaqVolRes_Jsonclick ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTableresultado3_Internalname ;
   private String lblTextblock_resultado3_Internalname ;
   private String lblTextblock_resultado3_Jsonclick ;
   private String lblImage31_Internalname ;
   private String lblImage31_Jsonclick ;
   private String lblImage32_Internalname ;
   private String lblImage32_Jsonclick ;
   private String lblImage33_Internalname ;
   private String lblImage33_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV17Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String AV19Emprcod ;
   private String GXv_char2[] ;
   private String AV20Emprnom ;
   private String GXv_char3[] ;
   private String AV21Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA602MaqCod ;
   private java.util.Date A11504MaqDTGarIn ;
   private java.util.Date A11505MaqDTGarFi ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n2801MaqVolRes ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private boolean n623MaqVolMax ;
   private boolean n4321MaqPrdMax ;
   private boolean n4320MaqPrdMed ;
   private boolean n4319MaqPrdMin ;
   private boolean n4285MaqKgsMax ;
   private boolean n4284MaqKgsMed ;
   private boolean n4283MaqKgsMin ;
   private boolean n611MaqHorAsi ;
   private boolean n617MaqResDia ;
   private boolean n621MaqUltFec ;
   private boolean n615MaqMinPro ;
   private boolean n612MaqHorPro ;
   private boolean n605MaqCosMin ;
   private boolean n11505MaqDTGarFi ;
   private boolean n11504MaqDTGarIn ;
   private boolean n607MaqEst ;
   private boolean n600MaqCap ;
   private boolean n3601MaqTipMaq ;
   private boolean n620MaqTip ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private IDataStoreProvider pr_default ;
   private String[] H01TH2_A396EmprCod ;
   private String[] H01TH2_A602MaqCod ;
   private int[] H01TH2_A2801MaqVolRes ;
   private boolean[] H01TH2_n2801MaqVolRes ;
   private int[] H01TH2_A624MaqVolMed ;
   private boolean[] H01TH2_n624MaqVolMed ;
   private int[] H01TH2_A625MaqVolMin ;
   private boolean[] H01TH2_n625MaqVolMin ;
   private int[] H01TH2_A623MaqVolMax ;
   private boolean[] H01TH2_n623MaqVolMax ;
   private short[] H01TH2_A4321MaqPrdMax ;
   private boolean[] H01TH2_n4321MaqPrdMax ;
   private short[] H01TH2_A4320MaqPrdMed ;
   private boolean[] H01TH2_n4320MaqPrdMed ;
   private short[] H01TH2_A4319MaqPrdMin ;
   private boolean[] H01TH2_n4319MaqPrdMin ;
   private java.math.BigDecimal[] H01TH2_A4285MaqKgsMax ;
   private boolean[] H01TH2_n4285MaqKgsMax ;
   private java.math.BigDecimal[] H01TH2_A4284MaqKgsMed ;
   private boolean[] H01TH2_n4284MaqKgsMed ;
   private java.math.BigDecimal[] H01TH2_A4283MaqKgsMin ;
   private boolean[] H01TH2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] H01TH2_A611MaqHorAsi ;
   private boolean[] H01TH2_n611MaqHorAsi ;
   private java.math.BigDecimal[] H01TH2_A617MaqResDia ;
   private boolean[] H01TH2_n617MaqResDia ;
   private String[] H01TH2_A621MaqUltFec ;
   private boolean[] H01TH2_n621MaqUltFec ;
   private byte[] H01TH2_A615MaqMinPro ;
   private boolean[] H01TH2_n615MaqMinPro ;
   private byte[] H01TH2_A612MaqHorPro ;
   private boolean[] H01TH2_n612MaqHorPro ;
   private java.math.BigDecimal[] H01TH2_A605MaqCosMin ;
   private boolean[] H01TH2_n605MaqCosMin ;
   private java.util.Date[] H01TH2_A11505MaqDTGarFi ;
   private boolean[] H01TH2_n11505MaqDTGarFi ;
   private java.util.Date[] H01TH2_A11504MaqDTGarIn ;
   private boolean[] H01TH2_n11504MaqDTGarIn ;
   private String[] H01TH2_A607MaqEst ;
   private boolean[] H01TH2_n607MaqEst ;
   private int[] H01TH2_A600MaqCap ;
   private boolean[] H01TH2_n600MaqCap ;
   private String[] H01TH2_A3601MaqTipMaq ;
   private boolean[] H01TH2_n3601MaqTipMaq ;
   private String[] H01TH2_A620MaqTip ;
   private boolean[] H01TH2_n620MaqTip ;
   private String[] H01TH2_A606MaqDsc ;
   private boolean[] H01TH2_n606MaqDsc ;
}

final  class in_alertasanalisis_maqcod_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01TH2", "SELECT EmprCod, MaqCod, MaqVolRes, MaqVolMed, MaqVolMin, MaqVolMax, MaqPrdMax, MaqPrdMed, MaqPrdMin, MaqKgsMax, MaqKgsMed, MaqKgsMin, MaqHorAsi, MaqResDia, MaqUltFec, MaqMinPro, MaqHorPro, MaqCosMin, MaqDTGarFi, MaqDTGarIn, MaqEst, MaqCap, MaqTipMaq, MaqTip, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,4);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
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
               return;
      }
   }

}

