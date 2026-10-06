package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class in_alertasanalisis_barser_wc_impl extends GXWebComponent
{
   public in_alertasanalisis_barser_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public in_alertasanalisis_barser_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( in_alertasanalisis_barser_wc_impl.class ));
   }

   public in_alertasanalisis_barser_wc_impl( int remoteHandle ,
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
      chkArtCorOri = UIFactory.getCheckbox(this);
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
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65ArtCod", A65ArtCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,A65ArtCod});
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
         pa1TK2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Datos del artículo", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.in_alertasanalisis_barser_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","ArtCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA65ArtCod", GXutil.rtrim( wcpOA65ArtCod));
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

   public void renderHtmlCloseForm1TK2( )
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
      return "Ingenieria.In_AlertasAnalisis_BarSer_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Datos del artículo", "") ;
   }

   public void wb1TK0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.in_alertasanalisis_barser_wc");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "General", ""), "", "", lblTab01_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCodExt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtCodExt_Internalname, httpContext.getMessage( "Cod Externo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtCodExt_Internalname, GXutil.rtrim( A5335ArtCodExt), GXutil.rtrim( localUtil.format( A5335ArtCodExt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCodExt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCodExt_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtMat_Internalname, GXutil.rtrim( A87ArtMat), GXutil.rtrim( localUtil.format( A87ArtMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipArtCod_Internalname, httpContext.getMessage( "Código Tipo Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtCod_Internalname, GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipArtCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipArtDsc_Internalname, httpContext.getMessage( "Descripción Tipo Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtDsc_Internalname, GXutil.rtrim( A830TipArtDsc), GXutil.rtrim( localUtil.format( A830TipArtDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipArtDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtPml_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtPml_Internalname, GXutil.ltrim( localUtil.ntoc( A1148ArtPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtGraCru_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtGraCru_Internalname, httpContext.getMessage( "Gramaje Crudo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtGraCru_Internalname, GXutil.ltrim( localUtil.ntoc( A78ArtGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtGraCru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A78ArtGraCru), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A78ArtGraCru), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtGraCru_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtGraCru_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCruMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtCruMin_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtCruMin_Internalname, GXutil.ltrim( localUtil.ntoc( A68ArtCruMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtCruMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A68ArtCruMin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A68ArtCruMin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCruMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCruMin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCruMax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtCruMax_Internalname, httpContext.getMessage( "Ancho Crudo Max", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtCruMax_Internalname, GXutil.ltrim( localUtil.ntoc( A67ArtCruMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtCruMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A67ArtCruMax), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A67ArtCruMax), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCruMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCruMax_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtAcaMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtAcaMin_Internalname, httpContext.getMessage( "Ancho Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtAcaMin_Internalname, GXutil.ltrim( localUtil.ntoc( A63ArtAcaMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAcaMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAcaMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtAcaMin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtRen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtRen_Internalname, httpContext.getMessage( "Rendimiento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtRen_Internalname, GXutil.ltrim( localUtil.ntoc( A95ArtRen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtRen_Enabled!=0) ? localUtil.format( A95ArtRen, "ZZ9.99") : localUtil.format( A95ArtRen, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtRen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtRen_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtAcaMax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtAcaMax_Internalname, httpContext.getMessage( "Ancho Acabado Max", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtAcaMax_Internalname, GXutil.ltrim( localUtil.ntoc( A62ArtAcaMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAcaMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A62ArtAcaMax), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A62ArtAcaMax), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAcaMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtAcaMax_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTipPle_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTipPle_Internalname, httpContext.getMessage( "Tipo Plegado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTipPle_Internalname, GXutil.rtrim( A101ArtTipPle), GXutil.rtrim( localUtil.format( A101ArtTipPle, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTipPle_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTipPle_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTipLar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTipLar_Internalname, httpContext.getMessage( "Tipo Largos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTipLar_Internalname, GXutil.rtrim( A100ArtTipLar), GXutil.rtrim( localUtil.format( A100ArtTipLar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTipLar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTipLar_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkArtCorOri.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkArtCorOri.getInternalname(), httpContext.getMessage( "Cortar Orillos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkArtCorOri.getInternalname(), A66ArtCorOri, "", httpContext.getMessage( "Cortar Orillos", ""), 1, chkArtCorOri.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtSua_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtSua_Internalname, httpContext.getMessage( "Suavizado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtSua_Internalname, GXutil.rtrim( A96ArtSua), GXutil.rtrim( localUtil.format( A96ArtSua, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtSua_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtSua_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtAcaQui_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtAcaQui_Internalname, httpContext.getMessage( "Acabado Quimico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtAcaQui_Internalname, GXutil.rtrim( A64ArtAcaQui), GXutil.rtrim( localUtil.format( A64ArtAcaQui, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAcaQui_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtAcaQui_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliEti_Internalname, httpContext.getMessage( "Etiqueta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliEti_Internalname, GXutil.rtrim( A272CliEti), GXutil.rtrim( localUtil.format( A272CliEti, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEti_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtMer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtMer_Internalname, httpContext.getMessage( "% Merma", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtMer_Internalname, GXutil.ltrim( localUtil.ntoc( A88ArtMer, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtMer_Enabled!=0) ? localUtil.format( A88ArtMer, "Z9.99") : localUtil.format( A88ArtMer, "Z9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtMer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtMer_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTra1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTra1_Internalname, httpContext.getMessage( "Trama1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra1_Internalname, GXutil.rtrim( A105ArtTra1), GXutil.rtrim( localUtil.format( A105ArtTra1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTra1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTraP1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTraP1_Internalname, httpContext.getMessage( "% Trama1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP1_Internalname, GXutil.ltrim( localUtil.ntoc( A108ArtTraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A108ArtTraP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A108ArtTraP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTraP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTra2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTra2_Internalname, httpContext.getMessage( "Trama2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra2_Internalname, GXutil.rtrim( A106ArtTra2), GXutil.rtrim( localUtil.format( A106ArtTra2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTra2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTraP2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTraP2_Internalname, httpContext.getMessage( "%Trama2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP2_Internalname, GXutil.ltrim( localUtil.ntoc( A109ArtTraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A109ArtTraP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A109ArtTraP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTraP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTra3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTra3_Internalname, httpContext.getMessage( "Trama3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra3_Internalname, GXutil.rtrim( A107ArtTra3), GXutil.rtrim( localUtil.format( A107ArtTra3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTra3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTraP3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtTraP3_Internalname, httpContext.getMessage( "% Trama3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP3_Internalname, GXutil.ltrim( localUtil.ntoc( A110ArtTraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A110ArtTraP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A110ArtTraP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtTraP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrd1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtUrd1_Internalname, httpContext.getMessage( "Urdido1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd1_Internalname, GXutil.rtrim( A111ArtUrd1), GXutil.rtrim( localUtil.format( A111ArtUrd1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtUrd1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrdP1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtUrdP1_Internalname, httpContext.getMessage( "% Urdido1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP1_Internalname, GXutil.ltrim( localUtil.ntoc( A114ArtUrdP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A114ArtUrdP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A114ArtUrdP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtUrdP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrd2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtUrd2_Internalname, httpContext.getMessage( "Urdido2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd2_Internalname, GXutil.rtrim( A112ArtUrd2), GXutil.rtrim( localUtil.format( A112ArtUrd2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtUrd2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrdP2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtUrdP2_Internalname, httpContext.getMessage( "% Urdido2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP2_Internalname, GXutil.ltrim( localUtil.ntoc( A115ArtUrdP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A115ArtUrdP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A115ArtUrdP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtUrdP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrd3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtUrd3_Internalname, httpContext.getMessage( "Urdido3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd3_Internalname, GXutil.rtrim( A113ArtUrd3), GXutil.rtrim( localUtil.format( A113ArtUrd3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtUrd3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrdP3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtArtUrdP3_Internalname, httpContext.getMessage( "% Urdido3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP3_Internalname, GXutil.ltrim( localUtil.ntoc( A116ArtUrdP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A116ArtUrdP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A116ArtUrdP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtUrdP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Estadísticas", ""), "", "", lblTab02_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_resultado3_Internalname, httpContext.getMessage( "Consultar que Graficos / reportes  mostrar", ""), "", "", lblTextblock_resultado3_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImage31_Internalname, httpContext.getMessage( "<i class='fas fa-table' style='font-size: 50px'></i>", ""), "", "", lblImage31_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImage32_Internalname, httpContext.getMessage( "<i class='fas fa-chart-line' style='font-size: 50px'></i>", ""), "", "", lblImage32_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImage33_Internalname, httpContext.getMessage( "<i class='far fa-file-alt' style='font-size: 50px'></i>", ""), "", "", lblImage33_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV4Pgmname), GXutil.rtrim( localUtil.format( AV4Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_BarSer_WC.htm");
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

   public void start1TK2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Datos del artículo", ""), (short)(0)) ;
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
            strup1TK0( ) ;
         }
      }
   }

   public void ws1TK2( )
   {
      start1TK2( ) ;
      evt1TK2( ) ;
   }

   public void evt1TK2( )
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
                              strup1TK0( ) ;
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
                              strup1TK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111TK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e121TK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TK0( ) ;
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
                              strup1TK0( ) ;
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

   public void we1TK2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1TK2( ) ;
         }
      }
   }

   public void pa1TK2( )
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
      A66ArtCorOri = ((GXutil.strcmp(GXutil.rtrim( A66ArtCorOri), "S")==0) ? "S" : "N") ;
      n66ArtCorOri = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66ArtCorOri", A66ArtCorOri);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1TK2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV4Pgmname = "Ingenieria.In_AlertasAnalisis_BarSer_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV4Pgmname", AV4Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1TK2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01TK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A65ArtCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = H01TK2_A252CliCod[0] ;
            A116ArtUrdP3 = H01TK2_A116ArtUrdP3[0] ;
            n116ArtUrdP3 = H01TK2_n116ArtUrdP3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
            A113ArtUrd3 = H01TK2_A113ArtUrd3[0] ;
            n113ArtUrd3 = H01TK2_n113ArtUrd3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A113ArtUrd3", A113ArtUrd3);
            A115ArtUrdP2 = H01TK2_A115ArtUrdP2[0] ;
            n115ArtUrdP2 = H01TK2_n115ArtUrdP2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
            A112ArtUrd2 = H01TK2_A112ArtUrd2[0] ;
            n112ArtUrd2 = H01TK2_n112ArtUrd2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A112ArtUrd2", A112ArtUrd2);
            A114ArtUrdP1 = H01TK2_A114ArtUrdP1[0] ;
            n114ArtUrdP1 = H01TK2_n114ArtUrdP1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
            A111ArtUrd1 = H01TK2_A111ArtUrd1[0] ;
            n111ArtUrd1 = H01TK2_n111ArtUrd1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A111ArtUrd1", A111ArtUrd1);
            A110ArtTraP3 = H01TK2_A110ArtTraP3[0] ;
            n110ArtTraP3 = H01TK2_n110ArtTraP3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
            A107ArtTra3 = H01TK2_A107ArtTra3[0] ;
            n107ArtTra3 = H01TK2_n107ArtTra3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A107ArtTra3", A107ArtTra3);
            A109ArtTraP2 = H01TK2_A109ArtTraP2[0] ;
            n109ArtTraP2 = H01TK2_n109ArtTraP2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
            A106ArtTra2 = H01TK2_A106ArtTra2[0] ;
            n106ArtTra2 = H01TK2_n106ArtTra2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A106ArtTra2", A106ArtTra2);
            A108ArtTraP1 = H01TK2_A108ArtTraP1[0] ;
            n108ArtTraP1 = H01TK2_n108ArtTraP1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
            A105ArtTra1 = H01TK2_A105ArtTra1[0] ;
            n105ArtTra1 = H01TK2_n105ArtTra1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A105ArtTra1", A105ArtTra1);
            A88ArtMer = H01TK2_A88ArtMer[0] ;
            n88ArtMer = H01TK2_n88ArtMer[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88ArtMer", GXutil.ltrimstr( A88ArtMer, 5, 2));
            A272CliEti = H01TK2_A272CliEti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272CliEti", A272CliEti);
            A64ArtAcaQui = H01TK2_A64ArtAcaQui[0] ;
            n64ArtAcaQui = H01TK2_n64ArtAcaQui[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A64ArtAcaQui", A64ArtAcaQui);
            A96ArtSua = H01TK2_A96ArtSua[0] ;
            n96ArtSua = H01TK2_n96ArtSua[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A96ArtSua", A96ArtSua);
            A66ArtCorOri = H01TK2_A66ArtCorOri[0] ;
            n66ArtCorOri = H01TK2_n66ArtCorOri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66ArtCorOri", A66ArtCorOri);
            A100ArtTipLar = H01TK2_A100ArtTipLar[0] ;
            n100ArtTipLar = H01TK2_n100ArtTipLar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A100ArtTipLar", A100ArtTipLar);
            A101ArtTipPle = H01TK2_A101ArtTipPle[0] ;
            n101ArtTipPle = H01TK2_n101ArtTipPle[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A101ArtTipPle", A101ArtTipPle);
            A62ArtAcaMax = H01TK2_A62ArtAcaMax[0] ;
            n62ArtAcaMax = H01TK2_n62ArtAcaMax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A62ArtAcaMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A62ArtAcaMax), 3, 0));
            A95ArtRen = H01TK2_A95ArtRen[0] ;
            n95ArtRen = H01TK2_n95ArtRen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A95ArtRen", GXutil.ltrimstr( A95ArtRen, 6, 2));
            A63ArtAcaMin = H01TK2_A63ArtAcaMin[0] ;
            n63ArtAcaMin = H01TK2_n63ArtAcaMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A63ArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A63ArtAcaMin), 3, 0));
            A67ArtCruMax = H01TK2_A67ArtCruMax[0] ;
            n67ArtCruMax = H01TK2_n67ArtCruMax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A67ArtCruMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ArtCruMax), 3, 0));
            A68ArtCruMin = H01TK2_A68ArtCruMin[0] ;
            n68ArtCruMin = H01TK2_n68ArtCruMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A68ArtCruMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ArtCruMin), 3, 0));
            A78ArtGraCru = H01TK2_A78ArtGraCru[0] ;
            n78ArtGraCru = H01TK2_n78ArtGraCru[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A78ArtGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A78ArtGraCru), 4, 0));
            A1148ArtPml = H01TK2_A1148ArtPml[0] ;
            n1148ArtPml = H01TK2_n1148ArtPml[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1148ArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1148ArtPml), 4, 0));
            A830TipArtDsc = H01TK2_A830TipArtDsc[0] ;
            n830TipArtDsc = H01TK2_n830TipArtDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A830TipArtDsc", A830TipArtDsc);
            A829TipArtCod = H01TK2_A829TipArtCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
            A87ArtMat = H01TK2_A87ArtMat[0] ;
            n87ArtMat = H01TK2_n87ArtMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87ArtMat", A87ArtMat);
            A5335ArtCodExt = H01TK2_A5335ArtCodExt[0] ;
            n5335ArtCodExt = H01TK2_n5335ArtCodExt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5335ArtCodExt", A5335ArtCodExt);
            A69ArtDsc = H01TK2_A69ArtDsc[0] ;
            n69ArtDsc = H01TK2_n69ArtDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A69ArtDsc", A69ArtDsc);
            A272CliEti = H01TK2_A272CliEti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272CliEti", A272CliEti);
            A830TipArtDsc = H01TK2_A830TipArtDsc[0] ;
            n830TipArtDsc = H01TK2_n830TipArtDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A830TipArtDsc", A830TipArtDsc);
            /* Execute user event: Load */
            e121TK2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb1TK0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1TK2( )
   {
   }

   public void before_start_formulas( )
   {
      AV4Pgmname = "Ingenieria.In_AlertasAnalisis_BarSer_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV4Pgmname", AV4Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1TK0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111TK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA65ArtCod = httpContext.cgiGet( sPrefix+"wcpOA65ArtCod") ;
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
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A69ArtDsc", A69ArtDsc);
         A5335ArtCodExt = httpContext.cgiGet( edtArtCodExt_Internalname) ;
         n5335ArtCodExt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5335ArtCodExt", A5335ArtCodExt);
         A87ArtMat = httpContext.cgiGet( edtArtMat_Internalname) ;
         n87ArtMat = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87ArtMat", A87ArtMat);
         A829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         A830TipArtDsc = httpContext.cgiGet( edtTipArtDsc_Internalname) ;
         n830TipArtDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A830TipArtDsc", A830TipArtDsc);
         A1148ArtPml = (short)(localUtil.ctol( httpContext.cgiGet( edtArtPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1148ArtPml = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1148ArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1148ArtPml), 4, 0));
         A78ArtGraCru = (short)(localUtil.ctol( httpContext.cgiGet( edtArtGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n78ArtGraCru = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A78ArtGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A78ArtGraCru), 4, 0));
         A68ArtCruMin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtCruMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n68ArtCruMin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A68ArtCruMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ArtCruMin), 3, 0));
         A67ArtCruMax = (short)(localUtil.ctol( httpContext.cgiGet( edtArtCruMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n67ArtCruMax = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A67ArtCruMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ArtCruMax), 3, 0));
         A63ArtAcaMin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAcaMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n63ArtAcaMin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A63ArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A63ArtAcaMin), 3, 0));
         A95ArtRen = localUtil.ctond( httpContext.cgiGet( edtArtRen_Internalname)) ;
         n95ArtRen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A95ArtRen", GXutil.ltrimstr( A95ArtRen, 6, 2));
         A62ArtAcaMax = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAcaMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n62ArtAcaMax = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A62ArtAcaMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A62ArtAcaMax), 3, 0));
         A101ArtTipPle = httpContext.cgiGet( edtArtTipPle_Internalname) ;
         n101ArtTipPle = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A101ArtTipPle", A101ArtTipPle);
         A100ArtTipLar = httpContext.cgiGet( edtArtTipLar_Internalname) ;
         n100ArtTipLar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A100ArtTipLar", A100ArtTipLar);
         A66ArtCorOri = ((GXutil.strcmp(httpContext.cgiGet( chkArtCorOri.getInternalname()), "S")==0) ? "S" : "N") ;
         n66ArtCorOri = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66ArtCorOri", A66ArtCorOri);
         A96ArtSua = httpContext.cgiGet( edtArtSua_Internalname) ;
         n96ArtSua = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A96ArtSua", A96ArtSua);
         A64ArtAcaQui = httpContext.cgiGet( edtArtAcaQui_Internalname) ;
         n64ArtAcaQui = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A64ArtAcaQui", A64ArtAcaQui);
         A272CliEti = GXutil.upper( httpContext.cgiGet( edtCliEti_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272CliEti", A272CliEti);
         A88ArtMer = localUtil.ctond( httpContext.cgiGet( edtArtMer_Internalname)) ;
         n88ArtMer = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A88ArtMer", GXutil.ltrimstr( A88ArtMer, 5, 2));
         A105ArtTra1 = httpContext.cgiGet( edtArtTra1_Internalname) ;
         n105ArtTra1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A105ArtTra1", A105ArtTra1);
         A108ArtTraP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n108ArtTraP1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         A106ArtTra2 = httpContext.cgiGet( edtArtTra2_Internalname) ;
         n106ArtTra2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A106ArtTra2", A106ArtTra2);
         A109ArtTraP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n109ArtTraP2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         A107ArtTra3 = httpContext.cgiGet( edtArtTra3_Internalname) ;
         n107ArtTra3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A107ArtTra3", A107ArtTra3);
         A110ArtTraP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n110ArtTraP3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         A111ArtUrd1 = httpContext.cgiGet( edtArtUrd1_Internalname) ;
         n111ArtUrd1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A111ArtUrd1", A111ArtUrd1);
         A114ArtUrdP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n114ArtUrdP1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         A112ArtUrd2 = httpContext.cgiGet( edtArtUrd2_Internalname) ;
         n112ArtUrd2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A112ArtUrd2", A112ArtUrd2);
         A115ArtUrdP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n115ArtUrdP2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         A113ArtUrd3 = httpContext.cgiGet( edtArtUrd3_Internalname) ;
         n113ArtUrd3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A113ArtUrd3", A113ArtUrd3);
         A116ArtUrdP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n116ArtUrdP3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         AV4Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV4Pgmname", AV4Pgmname);
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
      e111TK2 ();
      if (returnInSub) return;
   }

   public void e111TK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      in_alertasanalisis_barser_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = AV6Emprcod ;
      GXv_char3[0] = AV7Emprnom ;
      GXv_char4[0] = AV8Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      in_alertasanalisis_barser_wc_impl.this.AV6Emprcod = GXv_char2[0] ;
      in_alertasanalisis_barser_wc_impl.this.AV7Emprnom = GXv_char3[0] ;
      in_alertasanalisis_barser_wc_impl.this.AV8Usurcod = GXv_char4[0] ;
      divTableresultado3_Height = 350 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTableresultado3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado3_Height), 9, 0), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e121TK2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A65ArtCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65ArtCod", A65ArtCod);
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
      pa1TK2( ) ;
      ws1TK2( ) ;
      we1TK2( ) ;
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
      sCtrlA65ArtCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1TK2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\in_alertasanalisis_barser_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1TK2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A65ArtCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65ArtCod", A65ArtCod);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA65ArtCod = httpContext.cgiGet( sPrefix+"wcpOA65ArtCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, wcpOA65ArtCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA65ArtCod = A65ArtCod ;
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
      sCtrlA65ArtCod = httpContext.cgiGet( sPrefix+"A65ArtCod_CTRL") ;
      if ( GXutil.len( sCtrlA65ArtCod) > 0 )
      {
         A65ArtCod = httpContext.cgiGet( sCtrlA65ArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65ArtCod", A65ArtCod);
      }
      else
      {
         A65ArtCod = httpContext.cgiGet( sPrefix+"A65ArtCod_PARM") ;
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
      pa1TK2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1TK2( ) ;
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
      ws1TK2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A65ArtCod_PARM", GXutil.rtrim( A65ArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA65ArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A65ArtCod_CTRL", GXutil.rtrim( sCtrlA65ArtCod));
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
      we1TK2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015555827", true, true);
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
         httpContext.AddJavascriptSource("ingenieria/in_alertasanalisis_barser_wc.js", "?202661015555828", false, true);
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
      edtArtCod_Internalname = sPrefix+"ARTCOD" ;
      edtArtDsc_Internalname = sPrefix+"ARTDSC" ;
      edtArtCodExt_Internalname = sPrefix+"ARTCODEXT" ;
      edtArtMat_Internalname = sPrefix+"ARTMAT" ;
      edtTipArtCod_Internalname = sPrefix+"TIPARTCOD" ;
      edtTipArtDsc_Internalname = sPrefix+"TIPARTDSC" ;
      edtArtPml_Internalname = sPrefix+"ARTPML" ;
      edtArtGraCru_Internalname = sPrefix+"ARTGRACRU" ;
      edtArtCruMin_Internalname = sPrefix+"ARTCRUMIN" ;
      edtArtCruMax_Internalname = sPrefix+"ARTCRUMAX" ;
      edtArtAcaMin_Internalname = sPrefix+"ARTACAMIN" ;
      edtArtRen_Internalname = sPrefix+"ARTREN" ;
      edtArtAcaMax_Internalname = sPrefix+"ARTACAMAX" ;
      edtArtTipPle_Internalname = sPrefix+"ARTTIPPLE" ;
      edtArtTipLar_Internalname = sPrefix+"ARTTIPLAR" ;
      chkArtCorOri.setInternalname( sPrefix+"ARTCORORI" );
      edtArtSua_Internalname = sPrefix+"ARTSUA" ;
      edtArtAcaQui_Internalname = sPrefix+"ARTACAQUI" ;
      edtCliEti_Internalname = sPrefix+"CLIETI" ;
      edtArtMer_Internalname = sPrefix+"ARTMER" ;
      edtArtTra1_Internalname = sPrefix+"ARTTRA1" ;
      edtArtTraP1_Internalname = sPrefix+"ARTTRAP1" ;
      edtArtTra2_Internalname = sPrefix+"ARTTRA2" ;
      edtArtTraP2_Internalname = sPrefix+"ARTTRAP2" ;
      edtArtTra3_Internalname = sPrefix+"ARTTRA3" ;
      edtArtTraP3_Internalname = sPrefix+"ARTTRAP3" ;
      edtArtUrd1_Internalname = sPrefix+"ARTURD1" ;
      edtArtUrdP1_Internalname = sPrefix+"ARTURDP1" ;
      edtArtUrd2_Internalname = sPrefix+"ARTURD2" ;
      edtArtUrdP2_Internalname = sPrefix+"ARTURDP2" ;
      edtArtUrd3_Internalname = sPrefix+"ARTURD3" ;
      edtArtUrdP3_Internalname = sPrefix+"ARTURDP3" ;
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
      edtArtUrdP3_Jsonclick = "" ;
      edtArtUrdP3_Enabled = 0 ;
      edtArtUrd3_Jsonclick = "" ;
      edtArtUrd3_Enabled = 0 ;
      edtArtUrdP2_Jsonclick = "" ;
      edtArtUrdP2_Enabled = 0 ;
      edtArtUrd2_Jsonclick = "" ;
      edtArtUrd2_Enabled = 0 ;
      edtArtUrdP1_Jsonclick = "" ;
      edtArtUrdP1_Enabled = 0 ;
      edtArtUrd1_Jsonclick = "" ;
      edtArtUrd1_Enabled = 0 ;
      edtArtTraP3_Jsonclick = "" ;
      edtArtTraP3_Enabled = 0 ;
      edtArtTra3_Jsonclick = "" ;
      edtArtTra3_Enabled = 0 ;
      edtArtTraP2_Jsonclick = "" ;
      edtArtTraP2_Enabled = 0 ;
      edtArtTra2_Jsonclick = "" ;
      edtArtTra2_Enabled = 0 ;
      edtArtTraP1_Jsonclick = "" ;
      edtArtTraP1_Enabled = 0 ;
      edtArtTra1_Jsonclick = "" ;
      edtArtTra1_Enabled = 0 ;
      edtArtMer_Jsonclick = "" ;
      edtArtMer_Enabled = 0 ;
      edtCliEti_Jsonclick = "" ;
      edtCliEti_Enabled = 0 ;
      edtArtAcaQui_Jsonclick = "" ;
      edtArtAcaQui_Enabled = 0 ;
      edtArtSua_Jsonclick = "" ;
      edtArtSua_Enabled = 0 ;
      chkArtCorOri.setEnabled( 0 );
      edtArtTipLar_Jsonclick = "" ;
      edtArtTipLar_Enabled = 0 ;
      edtArtTipPle_Jsonclick = "" ;
      edtArtTipPle_Enabled = 0 ;
      edtArtAcaMax_Jsonclick = "" ;
      edtArtAcaMax_Enabled = 0 ;
      edtArtRen_Jsonclick = "" ;
      edtArtRen_Enabled = 0 ;
      edtArtAcaMin_Jsonclick = "" ;
      edtArtAcaMin_Enabled = 0 ;
      edtArtCruMax_Jsonclick = "" ;
      edtArtCruMax_Enabled = 0 ;
      edtArtCruMin_Jsonclick = "" ;
      edtArtCruMin_Enabled = 0 ;
      edtArtGraCru_Jsonclick = "" ;
      edtArtGraCru_Enabled = 0 ;
      edtArtPml_Jsonclick = "" ;
      edtArtPml_Enabled = 0 ;
      edtTipArtDsc_Jsonclick = "" ;
      edtTipArtDsc_Enabled = 0 ;
      edtTipArtCod_Jsonclick = "" ;
      edtTipArtCod_Enabled = 0 ;
      edtArtMat_Jsonclick = "" ;
      edtArtMat_Enabled = 0 ;
      edtArtCodExt_Jsonclick = "" ;
      edtArtCodExt_Enabled = 0 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 0 ;
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
      chkArtCorOri.setName( "ARTCORORI" );
      chkArtCorOri.setWebtags( "" );
      chkArtCorOri.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkArtCorOri.getInternalname(), "TitleCaption", chkArtCorOri.getCaption(), true);
      chkArtCorOri.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_TIPARTCOD","{handler:'valid_Tipartcod',iparms:[]");
      setEventMetadata("VALID_TIPARTCOD",",oparms:[]}");
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
      wcpOA65ArtCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
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
      A69ArtDsc = "" ;
      A5335ArtCodExt = "" ;
      A87ArtMat = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A101ArtTipPle = "" ;
      A100ArtTipLar = "" ;
      A66ArtCorOri = "" ;
      A96ArtSua = "" ;
      A64ArtAcaQui = "" ;
      A272CliEti = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      lblTab02_title_Jsonclick = "" ;
      lblTextblock_resultado3_Jsonclick = "" ;
      lblImage31_Jsonclick = "" ;
      lblImage32_Jsonclick = "" ;
      lblImage33_Jsonclick = "" ;
      AV4Pgmname = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01TK2_A252CliCod = new int[1] ;
      H01TK2_A396EmprCod = new String[] {""} ;
      H01TK2_A65ArtCod = new String[] {""} ;
      H01TK2_A116ArtUrdP3 = new short[1] ;
      H01TK2_n116ArtUrdP3 = new boolean[] {false} ;
      H01TK2_A113ArtUrd3 = new String[] {""} ;
      H01TK2_n113ArtUrd3 = new boolean[] {false} ;
      H01TK2_A115ArtUrdP2 = new short[1] ;
      H01TK2_n115ArtUrdP2 = new boolean[] {false} ;
      H01TK2_A112ArtUrd2 = new String[] {""} ;
      H01TK2_n112ArtUrd2 = new boolean[] {false} ;
      H01TK2_A114ArtUrdP1 = new short[1] ;
      H01TK2_n114ArtUrdP1 = new boolean[] {false} ;
      H01TK2_A111ArtUrd1 = new String[] {""} ;
      H01TK2_n111ArtUrd1 = new boolean[] {false} ;
      H01TK2_A110ArtTraP3 = new short[1] ;
      H01TK2_n110ArtTraP3 = new boolean[] {false} ;
      H01TK2_A107ArtTra3 = new String[] {""} ;
      H01TK2_n107ArtTra3 = new boolean[] {false} ;
      H01TK2_A109ArtTraP2 = new short[1] ;
      H01TK2_n109ArtTraP2 = new boolean[] {false} ;
      H01TK2_A106ArtTra2 = new String[] {""} ;
      H01TK2_n106ArtTra2 = new boolean[] {false} ;
      H01TK2_A108ArtTraP1 = new short[1] ;
      H01TK2_n108ArtTraP1 = new boolean[] {false} ;
      H01TK2_A105ArtTra1 = new String[] {""} ;
      H01TK2_n105ArtTra1 = new boolean[] {false} ;
      H01TK2_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TK2_n88ArtMer = new boolean[] {false} ;
      H01TK2_A272CliEti = new String[] {""} ;
      H01TK2_A64ArtAcaQui = new String[] {""} ;
      H01TK2_n64ArtAcaQui = new boolean[] {false} ;
      H01TK2_A96ArtSua = new String[] {""} ;
      H01TK2_n96ArtSua = new boolean[] {false} ;
      H01TK2_A66ArtCorOri = new String[] {""} ;
      H01TK2_n66ArtCorOri = new boolean[] {false} ;
      H01TK2_A100ArtTipLar = new String[] {""} ;
      H01TK2_n100ArtTipLar = new boolean[] {false} ;
      H01TK2_A101ArtTipPle = new String[] {""} ;
      H01TK2_n101ArtTipPle = new boolean[] {false} ;
      H01TK2_A62ArtAcaMax = new short[1] ;
      H01TK2_n62ArtAcaMax = new boolean[] {false} ;
      H01TK2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TK2_n95ArtRen = new boolean[] {false} ;
      H01TK2_A63ArtAcaMin = new short[1] ;
      H01TK2_n63ArtAcaMin = new boolean[] {false} ;
      H01TK2_A67ArtCruMax = new short[1] ;
      H01TK2_n67ArtCruMax = new boolean[] {false} ;
      H01TK2_A68ArtCruMin = new short[1] ;
      H01TK2_n68ArtCruMin = new boolean[] {false} ;
      H01TK2_A78ArtGraCru = new short[1] ;
      H01TK2_n78ArtGraCru = new boolean[] {false} ;
      H01TK2_A1148ArtPml = new short[1] ;
      H01TK2_n1148ArtPml = new boolean[] {false} ;
      H01TK2_A830TipArtDsc = new String[] {""} ;
      H01TK2_n830TipArtDsc = new boolean[] {false} ;
      H01TK2_A829TipArtCod = new short[1] ;
      H01TK2_A87ArtMat = new String[] {""} ;
      H01TK2_n87ArtMat = new boolean[] {false} ;
      H01TK2_A5335ArtCodExt = new String[] {""} ;
      H01TK2_n5335ArtCodExt = new boolean[] {false} ;
      H01TK2_A69ArtDsc = new String[] {""} ;
      H01TK2_n69ArtDsc = new boolean[] {false} ;
      AV5Station = "" ;
      GXt_char1 = "" ;
      AV6Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV7Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV8Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.in_alertasanalisis_barser_wc__default(),
         new Object[] {
             new Object[] {
            H01TK2_A252CliCod, H01TK2_A396EmprCod, H01TK2_A65ArtCod, H01TK2_A116ArtUrdP3, H01TK2_n116ArtUrdP3, H01TK2_A113ArtUrd3, H01TK2_n113ArtUrd3, H01TK2_A115ArtUrdP2, H01TK2_n115ArtUrdP2, H01TK2_A112ArtUrd2,
            H01TK2_n112ArtUrd2, H01TK2_A114ArtUrdP1, H01TK2_n114ArtUrdP1, H01TK2_A111ArtUrd1, H01TK2_n111ArtUrd1, H01TK2_A110ArtTraP3, H01TK2_n110ArtTraP3, H01TK2_A107ArtTra3, H01TK2_n107ArtTra3, H01TK2_A109ArtTraP2,
            H01TK2_n109ArtTraP2, H01TK2_A106ArtTra2, H01TK2_n106ArtTra2, H01TK2_A108ArtTraP1, H01TK2_n108ArtTraP1, H01TK2_A105ArtTra1, H01TK2_n105ArtTra1, H01TK2_A88ArtMer, H01TK2_n88ArtMer, H01TK2_A272CliEti,
            H01TK2_A64ArtAcaQui, H01TK2_n64ArtAcaQui, H01TK2_A96ArtSua, H01TK2_n96ArtSua, H01TK2_A66ArtCorOri, H01TK2_n66ArtCorOri, H01TK2_A100ArtTipLar, H01TK2_n100ArtTipLar, H01TK2_A101ArtTipPle, H01TK2_n101ArtTipPle,
            H01TK2_A62ArtAcaMax, H01TK2_n62ArtAcaMax, H01TK2_A95ArtRen, H01TK2_n95ArtRen, H01TK2_A63ArtAcaMin, H01TK2_n63ArtAcaMin, H01TK2_A67ArtCruMax, H01TK2_n67ArtCruMax, H01TK2_A68ArtCruMin, H01TK2_n68ArtCruMin,
            H01TK2_A78ArtGraCru, H01TK2_n78ArtGraCru, H01TK2_A1148ArtPml, H01TK2_n1148ArtPml, H01TK2_A830TipArtDsc, H01TK2_n830TipArtDsc, H01TK2_A829TipArtCod, H01TK2_A87ArtMat, H01TK2_n87ArtMat, H01TK2_A5335ArtCodExt,
            H01TK2_n5335ArtCodExt, H01TK2_A69ArtDsc, H01TK2_n69ArtDsc
            }
         }
      );
      AV4Pgmname = "Ingenieria.In_AlertasAnalisis_BarSer_WC" ;
      /* GeneXus formulas. */
      AV4Pgmname = "Ingenieria.In_AlertasAnalisis_BarSer_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
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
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A78ArtGraCru ;
   private short A68ArtCruMin ;
   private short A67ArtCruMax ;
   private short A63ArtAcaMin ;
   private short A62ArtAcaMax ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtArtCodExt_Enabled ;
   private int edtArtMat_Enabled ;
   private int edtTipArtCod_Enabled ;
   private int edtTipArtDsc_Enabled ;
   private int edtArtPml_Enabled ;
   private int edtArtGraCru_Enabled ;
   private int edtArtCruMin_Enabled ;
   private int edtArtCruMax_Enabled ;
   private int edtArtAcaMin_Enabled ;
   private int edtArtRen_Enabled ;
   private int edtArtAcaMax_Enabled ;
   private int edtArtTipPle_Enabled ;
   private int edtArtTipLar_Enabled ;
   private int edtArtSua_Enabled ;
   private int edtArtAcaQui_Enabled ;
   private int edtCliEti_Enabled ;
   private int edtArtMer_Enabled ;
   private int edtArtTra1_Enabled ;
   private int edtArtTraP1_Enabled ;
   private int edtArtTra2_Enabled ;
   private int edtArtTraP2_Enabled ;
   private int edtArtTra3_Enabled ;
   private int edtArtTraP3_Enabled ;
   private int edtArtUrd1_Enabled ;
   private int edtArtUrdP1_Enabled ;
   private int edtArtUrd2_Enabled ;
   private int edtArtUrdP2_Enabled ;
   private int edtArtUrd3_Enabled ;
   private int edtArtUrdP3_Enabled ;
   private int divTableresultado3_Height ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int idxLst ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A88ArtMer ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A65ArtCod ;
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
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String edtArtCodExt_Internalname ;
   private String A5335ArtCodExt ;
   private String edtArtCodExt_Jsonclick ;
   private String edtArtMat_Internalname ;
   private String A87ArtMat ;
   private String edtArtMat_Jsonclick ;
   private String edtTipArtCod_Internalname ;
   private String edtTipArtCod_Jsonclick ;
   private String edtTipArtDsc_Internalname ;
   private String A830TipArtDsc ;
   private String edtTipArtDsc_Jsonclick ;
   private String edtArtPml_Internalname ;
   private String edtArtPml_Jsonclick ;
   private String edtArtGraCru_Internalname ;
   private String edtArtGraCru_Jsonclick ;
   private String edtArtCruMin_Internalname ;
   private String edtArtCruMin_Jsonclick ;
   private String edtArtCruMax_Internalname ;
   private String edtArtCruMax_Jsonclick ;
   private String edtArtAcaMin_Internalname ;
   private String edtArtAcaMin_Jsonclick ;
   private String edtArtRen_Internalname ;
   private String edtArtRen_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtArtAcaMax_Internalname ;
   private String edtArtAcaMax_Jsonclick ;
   private String edtArtTipPle_Internalname ;
   private String A101ArtTipPle ;
   private String edtArtTipPle_Jsonclick ;
   private String edtArtTipLar_Internalname ;
   private String A100ArtTipLar ;
   private String edtArtTipLar_Jsonclick ;
   private String A66ArtCorOri ;
   private String edtArtSua_Internalname ;
   private String A96ArtSua ;
   private String edtArtSua_Jsonclick ;
   private String edtArtAcaQui_Internalname ;
   private String A64ArtAcaQui ;
   private String edtArtAcaQui_Jsonclick ;
   private String edtCliEti_Internalname ;
   private String A272CliEti ;
   private String edtCliEti_Jsonclick ;
   private String edtArtMer_Internalname ;
   private String edtArtMer_Jsonclick ;
   private String edtArtTra1_Internalname ;
   private String A105ArtTra1 ;
   private String edtArtTra1_Jsonclick ;
   private String edtArtTraP1_Internalname ;
   private String edtArtTraP1_Jsonclick ;
   private String edtArtTra2_Internalname ;
   private String A106ArtTra2 ;
   private String edtArtTra2_Jsonclick ;
   private String edtArtTraP2_Internalname ;
   private String edtArtTraP2_Jsonclick ;
   private String edtArtTra3_Internalname ;
   private String A107ArtTra3 ;
   private String edtArtTra3_Jsonclick ;
   private String edtArtTraP3_Internalname ;
   private String edtArtTraP3_Jsonclick ;
   private String edtArtUrd1_Internalname ;
   private String A111ArtUrd1 ;
   private String edtArtUrd1_Jsonclick ;
   private String edtArtUrdP1_Internalname ;
   private String edtArtUrdP1_Jsonclick ;
   private String edtArtUrd2_Internalname ;
   private String A112ArtUrd2 ;
   private String edtArtUrd2_Jsonclick ;
   private String edtArtUrdP2_Internalname ;
   private String edtArtUrdP2_Jsonclick ;
   private String edtArtUrd3_Internalname ;
   private String A113ArtUrd3 ;
   private String edtArtUrd3_Jsonclick ;
   private String edtArtUrdP3_Internalname ;
   private String edtArtUrdP3_Jsonclick ;
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
   private String AV4Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV5Station ;
   private String GXt_char1 ;
   private String AV6Emprcod ;
   private String GXv_char2[] ;
   private String AV7Emprnom ;
   private String GXv_char3[] ;
   private String AV8Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA65ArtCod ;
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
   private boolean n66ArtCorOri ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n116ArtUrdP3 ;
   private boolean n113ArtUrd3 ;
   private boolean n115ArtUrdP2 ;
   private boolean n112ArtUrd2 ;
   private boolean n114ArtUrdP1 ;
   private boolean n111ArtUrd1 ;
   private boolean n110ArtTraP3 ;
   private boolean n107ArtTra3 ;
   private boolean n109ArtTraP2 ;
   private boolean n106ArtTra2 ;
   private boolean n108ArtTraP1 ;
   private boolean n105ArtTra1 ;
   private boolean n88ArtMer ;
   private boolean n64ArtAcaQui ;
   private boolean n96ArtSua ;
   private boolean n100ArtTipLar ;
   private boolean n101ArtTipPle ;
   private boolean n62ArtAcaMax ;
   private boolean n95ArtRen ;
   private boolean n63ArtAcaMin ;
   private boolean n67ArtCruMax ;
   private boolean n68ArtCruMin ;
   private boolean n78ArtGraCru ;
   private boolean n1148ArtPml ;
   private boolean n830TipArtDsc ;
   private boolean n87ArtMat ;
   private boolean n5335ArtCodExt ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private ICheckbox chkArtCorOri ;
   private IDataStoreProvider pr_default ;
   private int[] H01TK2_A252CliCod ;
   private String[] H01TK2_A396EmprCod ;
   private String[] H01TK2_A65ArtCod ;
   private short[] H01TK2_A116ArtUrdP3 ;
   private boolean[] H01TK2_n116ArtUrdP3 ;
   private String[] H01TK2_A113ArtUrd3 ;
   private boolean[] H01TK2_n113ArtUrd3 ;
   private short[] H01TK2_A115ArtUrdP2 ;
   private boolean[] H01TK2_n115ArtUrdP2 ;
   private String[] H01TK2_A112ArtUrd2 ;
   private boolean[] H01TK2_n112ArtUrd2 ;
   private short[] H01TK2_A114ArtUrdP1 ;
   private boolean[] H01TK2_n114ArtUrdP1 ;
   private String[] H01TK2_A111ArtUrd1 ;
   private boolean[] H01TK2_n111ArtUrd1 ;
   private short[] H01TK2_A110ArtTraP3 ;
   private boolean[] H01TK2_n110ArtTraP3 ;
   private String[] H01TK2_A107ArtTra3 ;
   private boolean[] H01TK2_n107ArtTra3 ;
   private short[] H01TK2_A109ArtTraP2 ;
   private boolean[] H01TK2_n109ArtTraP2 ;
   private String[] H01TK2_A106ArtTra2 ;
   private boolean[] H01TK2_n106ArtTra2 ;
   private short[] H01TK2_A108ArtTraP1 ;
   private boolean[] H01TK2_n108ArtTraP1 ;
   private String[] H01TK2_A105ArtTra1 ;
   private boolean[] H01TK2_n105ArtTra1 ;
   private java.math.BigDecimal[] H01TK2_A88ArtMer ;
   private boolean[] H01TK2_n88ArtMer ;
   private String[] H01TK2_A272CliEti ;
   private String[] H01TK2_A64ArtAcaQui ;
   private boolean[] H01TK2_n64ArtAcaQui ;
   private String[] H01TK2_A96ArtSua ;
   private boolean[] H01TK2_n96ArtSua ;
   private String[] H01TK2_A66ArtCorOri ;
   private boolean[] H01TK2_n66ArtCorOri ;
   private String[] H01TK2_A100ArtTipLar ;
   private boolean[] H01TK2_n100ArtTipLar ;
   private String[] H01TK2_A101ArtTipPle ;
   private boolean[] H01TK2_n101ArtTipPle ;
   private short[] H01TK2_A62ArtAcaMax ;
   private boolean[] H01TK2_n62ArtAcaMax ;
   private java.math.BigDecimal[] H01TK2_A95ArtRen ;
   private boolean[] H01TK2_n95ArtRen ;
   private short[] H01TK2_A63ArtAcaMin ;
   private boolean[] H01TK2_n63ArtAcaMin ;
   private short[] H01TK2_A67ArtCruMax ;
   private boolean[] H01TK2_n67ArtCruMax ;
   private short[] H01TK2_A68ArtCruMin ;
   private boolean[] H01TK2_n68ArtCruMin ;
   private short[] H01TK2_A78ArtGraCru ;
   private boolean[] H01TK2_n78ArtGraCru ;
   private short[] H01TK2_A1148ArtPml ;
   private boolean[] H01TK2_n1148ArtPml ;
   private String[] H01TK2_A830TipArtDsc ;
   private boolean[] H01TK2_n830TipArtDsc ;
   private short[] H01TK2_A829TipArtCod ;
   private String[] H01TK2_A87ArtMat ;
   private boolean[] H01TK2_n87ArtMat ;
   private String[] H01TK2_A5335ArtCodExt ;
   private boolean[] H01TK2_n5335ArtCodExt ;
   private String[] H01TK2_A69ArtDsc ;
   private boolean[] H01TK2_n69ArtDsc ;
}

final  class in_alertasanalisis_barser_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01TK2", "SELECT T1.CliCod, T1.EmprCod, T1.ArtCod, T1.ArtUrdP3, T1.ArtUrd3, T1.ArtUrdP2, T1.ArtUrd2, T1.ArtUrdP1, T1.ArtUrd1, T1.ArtTraP3, T1.ArtTra3, T1.ArtTraP2, T1.ArtTra2, T1.ArtTraP1, T1.ArtTra1, T1.ArtMer, T2.CliEti, T1.ArtAcaQui, T1.ArtSua, T1.ArtCorOri, T1.ArtTipLar, T1.ArtTipPle, T1.ArtAcaMax, T1.ArtRen, T1.ArtAcaMin, T1.ArtCruMax, T1.ArtCruMin, T1.ArtGraCru, T1.ArtPml, T3.TipArtDsc, T1.TipArtCod, T1.ArtMat, T1.ArtCodExt, T1.ArtDsc FROM ((TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.TipArtCod) WHERE (T1.EmprCod = ?) AND (T1.ArtCod = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 1);
               ((String[]) buf[30])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(31);
               ((String[]) buf[57])[0] = rslt.getString(32, 16);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(33, 3);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(34, 26);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               return;
      }
   }

}

