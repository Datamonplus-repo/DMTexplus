package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmmovstgeneral_impl extends GXWebComponent
{
   public tmmovstgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmmovstgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmmovstgeneral_impl.class ));
   }

   public tmmovstgeneral_impl( int remoteHandle ,
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
      cmbMMSTpo = new HTMLChoice();
      cmbMMSEst = new HTMLChoice();
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
               A9412MMSCod = (int)(GXutil.lval( httpContext.GetPar( "MMSCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A9412MMSCod)});
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
         paJF2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TMMov St General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmmovstgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9412MMSCod,8,0))}, new String[] {"EmprCod","MMSCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA9412MMSCod", GXutil.ltrim( localUtil.ntoc( wcpOA9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autoscroll));
   }

   public void renderHtmlCloseFormJF2( )
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
      return "TMMovStGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TMMov St General", "") ;
   }

   public void wbJF0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tmmovstgeneral");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_tableattributes.setProperty("Width", Dvpanel_transactiondetail_tableattributes_Width);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoWidth", Dvpanel_transactiondetail_tableattributes_Autowidth);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoHeight", Dvpanel_transactiondetail_tableattributes_Autoheight);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Cls", Dvpanel_transactiondetail_tableattributes_Cls);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Title", Dvpanel_transactiondetail_tableattributes_Title);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Collapsible", Dvpanel_transactiondetail_tableattributes_Collapsible);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Collapsed", Dvpanel_transactiondetail_tableattributes_Collapsed);
         ucDvpanel_transactiondetail_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tableattributes_Showcollapseicon);
         ucDvpanel_transactiondetail_tableattributes.setProperty("IconPosition", Dvpanel_transactiondetail_tableattributes_Iconposition);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoScroll", Dvpanel_transactiondetail_tableattributes_Autoscroll);
         ucDvpanel_transactiondetail_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tableattributes_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTESContainer"+"TransactionDetail_TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSCod_Internalname, httpContext.getMessage( "Mov Stock", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMMSTpo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbMMSTpo.getInternalname(), httpContext.getMessage( "Tipo de Mov de Stock", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMMSTpo, cmbMMSTpo.getInternalname(), GXutil.rtrim( A9413MMSTpo), 1, cmbMMSTpo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMMSTpo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMMovStGeneral.htm");
         cmbMMSTpo.setValue( GXutil.rtrim( A9413MMSTpo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMMSTpo.getInternalname(), "Values", cmbMMSTpo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSFch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtMMSFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSFch_Internalname, localUtil.format(A9416MMSFch, "99/99/99"), localUtil.format( A9416MMSFch, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtMMSFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMSFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMMovStGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMMSEst.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbMMSEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMMSEst, cmbMMSEst.getInternalname(), GXutil.rtrim( A9420MMSEst), 1, cmbMMSEst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMMSEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMMovStGeneral.htm");
         cmbMMSEst.setValue( GXutil.rtrim( A9420MMSEst) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMMSEst.getInternalname(), "Values", cmbMMSEst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSPrvNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSPrvNum_Internalname, httpContext.getMessage( "Proveedor", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A9414MMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9414MMSPrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9414MMSPrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSDto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSDto_Internalname, httpContext.getMessage( "% Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSDto_Internalname, GXutil.ltrim( localUtil.ntoc( A11509MMSDto, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSDto_Enabled!=0) ? localUtil.format( A11509MMSDto, "ZZ9.99%") : localUtil.format( A11509MMSDto, "ZZ9.99%"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSDto_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSNroExt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSNroExt_Internalname, httpContext.getMessage( "Nro Externo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSNroExt_Internalname, GXutil.rtrim( A9419MMSNroExt), GXutil.rtrim( localUtil.format( A9419MMSNroExt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSNroExt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSNroExt_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSUsuCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSUsuCre_Internalname, httpContext.getMessage( "Usuario que crea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSUsuCre_Internalname, GXutil.rtrim( A9417MMSUsuCre), GXutil.rtrim( localUtil.format( A9417MMSUsuCre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSUsuCre_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSFchCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSFchCre_Internalname, httpContext.getMessage( "Fecha de Creación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtMMSFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSFchCre_Internalname, localUtil.ttoc( A9418MMSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9418MMSFchCre, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtMMSFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMSFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMMovStGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSFchApl_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMMSFchApl_Internalname, httpContext.getMessage( "Fecha de Aplicación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtMMSFchApl_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSFchApl_Internalname, localUtil.ttoc( A11304MMSFchApl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11304MMSFchApl, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSFchApl_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSFchApl_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtMMSFchApl_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMSFchApl_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMMovStGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11jf1_client"+"'", TempTags, "", 2, "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12jf1_client"+"'", TempTags, "", 2, "HLP_TMMovStGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMMovStGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMMovStGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMMSPrvNom_Internalname, GXutil.rtrim( A9415MMSPrvNom), GXutil.rtrim( localUtil.format( A9415MMSPrvNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSPrvNom_Jsonclick, 0, "Attribute", "", "", "", "", edtMMSPrvNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMMovStGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startJF2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TMMov St General", ""), (short)(0)) ;
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
            strupJF0( ) ;
         }
      }
   }

   public void wsJF2( )
   {
      startJF2( ) ;
      evtJF2( ) ;
   }

   public void evtJF2( )
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
                              strupJF0( ) ;
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
                              strupJF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13JF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14JF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJF0( ) ;
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
                              strupJF0( ) ;
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

   public void weJF2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormJF2( ) ;
         }
      }
   }

   public void paJF2( )
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
      if ( cmbMMSTpo.getItemCount() > 0 )
      {
         A9413MMSTpo = cmbMMSTpo.getValidValue(A9413MMSTpo) ;
         n9413MMSTpo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9413MMSTpo", A9413MMSTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMMSTpo.setValue( GXutil.rtrim( A9413MMSTpo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMMSTpo.getInternalname(), "Values", cmbMMSTpo.ToJavascriptSource(), true);
      }
      if ( cmbMMSEst.getItemCount() > 0 )
      {
         A9420MMSEst = cmbMMSEst.getValidValue(A9420MMSEst) ;
         n9420MMSEst = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9420MMSEst", A9420MMSEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMMSEst.setValue( GXutil.rtrim( A9420MMSEst) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMMSEst.getInternalname(), "Values", cmbMMSEst.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfJF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "TMMovStGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rfJF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00JF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9415MMSPrvNom = H00JF2_A9415MMSPrvNom[0] ;
            n9415MMSPrvNom = H00JF2_n9415MMSPrvNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9415MMSPrvNom", A9415MMSPrvNom);
            A11304MMSFchApl = H00JF2_A11304MMSFchApl[0] ;
            n11304MMSFchApl = H00JF2_n11304MMSFchApl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11304MMSFchApl", localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A9418MMSFchCre = H00JF2_A9418MMSFchCre[0] ;
            n9418MMSFchCre = H00JF2_n9418MMSFchCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A9417MMSUsuCre = H00JF2_A9417MMSUsuCre[0] ;
            n9417MMSUsuCre = H00JF2_n9417MMSUsuCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9417MMSUsuCre", A9417MMSUsuCre);
            A9419MMSNroExt = H00JF2_A9419MMSNroExt[0] ;
            n9419MMSNroExt = H00JF2_n9419MMSNroExt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9419MMSNroExt", A9419MMSNroExt);
            A11509MMSDto = H00JF2_A11509MMSDto[0] ;
            n11509MMSDto = H00JF2_n11509MMSDto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11509MMSDto", GXutil.ltrimstr( A11509MMSDto, 6, 2));
            A9414MMSPrvNum = H00JF2_A9414MMSPrvNum[0] ;
            n9414MMSPrvNum = H00JF2_n9414MMSPrvNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
            A9420MMSEst = H00JF2_A9420MMSEst[0] ;
            n9420MMSEst = H00JF2_n9420MMSEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9420MMSEst", A9420MMSEst);
            A9416MMSFch = H00JF2_A9416MMSFch[0] ;
            n9416MMSFch = H00JF2_n9416MMSFch[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
            A9413MMSTpo = H00JF2_A9413MMSTpo[0] ;
            n9413MMSTpo = H00JF2_n9413MMSTpo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9413MMSTpo", A9413MMSTpo);
            A9415MMSPrvNom = H00JF2_A9415MMSPrvNom[0] ;
            n9415MMSPrvNom = H00JF2_n9415MMSPrvNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9415MMSPrvNom", A9415MMSPrvNom);
            /* Execute user event: Load */
            e14JF2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbJF0( ) ;
      }
   }

   public void send_integrity_lvl_hashesJF2( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "TMMovStGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00JF3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      A407EmprNom = H00JF3_A407EmprNom[0] ;
      n407EmprNom = H00JF3_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(1);
      pr_default.close(1);
      fix_multi_value_controls( ) ;
   }

   public void strupJF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13JF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9412MMSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_transactiondetail_tableattributes_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Width") ;
         Dvpanel_transactiondetail_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_transactiondetail_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_transactiondetail_tableattributes_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_transactiondetail_tableattributes_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Title") ;
         Dvpanel_transactiondetail_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_transactiondetail_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_transactiondetail_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tableattributes_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_transactiondetail_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoscroll")) ;
         /* Read variables values. */
         cmbMMSTpo.setValue( httpContext.cgiGet( cmbMMSTpo.getInternalname()) );
         A9413MMSTpo = httpContext.cgiGet( cmbMMSTpo.getInternalname()) ;
         n9413MMSTpo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9413MMSTpo", A9413MMSTpo);
         A9416MMSFch = localUtil.ctod( httpContext.cgiGet( edtMMSFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n9416MMSFch = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
         cmbMMSEst.setValue( httpContext.cgiGet( cmbMMSEst.getInternalname()) );
         A9420MMSEst = httpContext.cgiGet( cmbMMSEst.getInternalname()) ;
         n9420MMSEst = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9420MMSEst", A9420MMSEst);
         A9414MMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9414MMSPrvNum = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
         A11509MMSDto = localUtil.ctond( httpContext.cgiGet( edtMMSDto_Internalname)) ;
         n11509MMSDto = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11509MMSDto", GXutil.ltrimstr( A11509MMSDto, 6, 2));
         A9419MMSNroExt = httpContext.cgiGet( edtMMSNroExt_Internalname) ;
         n9419MMSNroExt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9419MMSNroExt", A9419MMSNroExt);
         A9417MMSUsuCre = httpContext.cgiGet( edtMMSUsuCre_Internalname) ;
         n9417MMSUsuCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9417MMSUsuCre", A9417MMSUsuCre);
         A9418MMSFchCre = localUtil.ctot( httpContext.cgiGet( edtMMSFchCre_Internalname)) ;
         n9418MMSFchCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11304MMSFchApl = localUtil.ctot( httpContext.cgiGet( edtMMSFchApl_Internalname)) ;
         n11304MMSFchApl = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11304MMSFchApl", localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A9415MMSPrvNom = httpContext.cgiGet( edtMMSPrvNom_Internalname) ;
         n9415MMSPrvNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9415MMSPrvNom", A9415MMSPrvNom);
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
      e13JF2 ();
      if (returnInSub) return;
   }

   public void e13JF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmmovstgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmmovstgeneral_impl.this.AV14Emprcod = GXv_char2[0] ;
      tmmovstgeneral_impl.this.AV15Emprnom = GXv_char3[0] ;
      tmmovstgeneral_impl.this.AV16Usurcod = GXv_char4[0] ;
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

   protected void e14JF2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtMMSPrvNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMMSPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNom_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV17Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMMovSt" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A9412MMSCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
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
      paJF2( ) ;
      wsJF2( ) ;
      weJF2( ) ;
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
      sCtrlA9412MMSCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paJF2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tmmovstgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paJF2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9412MMSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A9412MMSCod != wcpOA9412MMSCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA9412MMSCod = A9412MMSCod ;
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
      sCtrlA9412MMSCod = httpContext.cgiGet( sPrefix+"A9412MMSCod_CTRL") ;
      if ( GXutil.len( sCtrlA9412MMSCod) > 0 )
      {
         A9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA9412MMSCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
      else
      {
         A9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A9412MMSCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paJF2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsJF2( ) ;
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
      wsJF2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9412MMSCod_PARM", GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA9412MMSCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9412MMSCod_CTRL", GXutil.rtrim( sCtrlA9412MMSCod));
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
      weJF2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623133863", true, true);
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
      httpContext.AddJavascriptSource("tmmovstgeneral.js", "?20263623133863", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtMMSCod_Internalname = sPrefix+"MMSCOD" ;
      cmbMMSTpo.setInternalname( sPrefix+"MMSTPO" );
      edtMMSFch_Internalname = sPrefix+"MMSFCH" ;
      cmbMMSEst.setInternalname( sPrefix+"MMSEST" );
      edtMMSPrvNum_Internalname = sPrefix+"MMSPRVNUM" ;
      edtMMSDto_Internalname = sPrefix+"MMSDTO" ;
      edtMMSNroExt_Internalname = sPrefix+"MMSNROEXT" ;
      edtMMSUsuCre_Internalname = sPrefix+"MMSUSUCRE" ;
      edtMMSFchCre_Internalname = sPrefix+"MMSFCHCRE" ;
      edtMMSFchApl_Internalname = sPrefix+"MMSFCHAPL" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTransactiondetail_tableleaflevel_level1_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_LEVEL1" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtMMSPrvNom_Internalname = sPrefix+"MMSPRVNOM" ;
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
      edtMMSPrvNom_Jsonclick = "" ;
      edtMMSPrvNom_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtMMSFchApl_Jsonclick = "" ;
      edtMMSFchApl_Enabled = 0 ;
      edtMMSFchCre_Jsonclick = "" ;
      edtMMSFchCre_Enabled = 0 ;
      edtMMSUsuCre_Jsonclick = "" ;
      edtMMSUsuCre_Enabled = 0 ;
      edtMMSNroExt_Jsonclick = "" ;
      edtMMSNroExt_Enabled = 0 ;
      edtMMSDto_Jsonclick = "" ;
      edtMMSDto_Enabled = 0 ;
      edtMMSPrvNum_Jsonclick = "" ;
      edtMMSPrvNum_Enabled = 0 ;
      cmbMMSEst.setJsonclick( "" );
      cmbMMSEst.setEnabled( 0 );
      edtMMSFch_Jsonclick = "" ;
      edtMMSFch_Enabled = 0 ;
      cmbMMSTpo.setJsonclick( "" );
      cmbMMSTpo.setEnabled( 0 );
      edtMMSCod_Jsonclick = "" ;
      edtMMSCod_Enabled = 0 ;
      Dvpanel_transactiondetail_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_transactiondetail_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Width = "100%" ;
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
      cmbMMSTpo.setName( "MMSTPO" );
      cmbMMSTpo.setWebtags( "" );
      cmbMMSTpo.addItem("E", httpContext.getMessage( "Entrada", ""), (short)(0));
      cmbMMSTpo.addItem("S", httpContext.getMessage( "Salida", ""), (short)(0));
      if ( cmbMMSTpo.getItemCount() > 0 )
      {
      }
      cmbMMSEst.setName( "MMSEST" );
      cmbMMSEst.setWebtags( "" );
      cmbMMSEst.addItem("E", httpContext.getMessage( "En ingreso", ""), (short)(0));
      cmbMMSEst.addItem("A", httpContext.getMessage( "Aplicado", ""), (short)(0));
      cmbMMSEst.addItem("C", httpContext.getMessage( "Cancelado", ""), (short)(0));
      if ( cmbMMSEst.getItemCount() > 0 )
      {
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11JF1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12JF1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_MMSCOD","{handler:'valid_Mmscod',iparms:[]");
      setEventMetadata("VALID_MMSCOD",",oparms:[]}");
      setEventMetadata("VALID_MMSPRVNUM","{handler:'valid_Mmsprvnum',iparms:[]");
      setEventMetadata("VALID_MMSPRVNUM",",oparms:[]}");
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
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A9413MMSTpo = "" ;
      A9416MMSFch = GXutil.nullDate() ;
      A9420MMSEst = "" ;
      A11509MMSDto = DecimalUtil.ZERO ;
      A9419MMSNroExt = "" ;
      A9417MMSUsuCre = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A9415MMSPrvNom = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Pgmname = "" ;
      scmdbuf = "" ;
      H00JF2_A396EmprCod = new String[] {""} ;
      H00JF2_A9412MMSCod = new int[1] ;
      H00JF2_A9415MMSPrvNom = new String[] {""} ;
      H00JF2_n9415MMSPrvNom = new boolean[] {false} ;
      H00JF2_A407EmprNom = new String[] {""} ;
      H00JF2_n407EmprNom = new boolean[] {false} ;
      H00JF2_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      H00JF2_n11304MMSFchApl = new boolean[] {false} ;
      H00JF2_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00JF2_n9418MMSFchCre = new boolean[] {false} ;
      H00JF2_A9417MMSUsuCre = new String[] {""} ;
      H00JF2_n9417MMSUsuCre = new boolean[] {false} ;
      H00JF2_A9419MMSNroExt = new String[] {""} ;
      H00JF2_n9419MMSNroExt = new boolean[] {false} ;
      H00JF2_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00JF2_n11509MMSDto = new boolean[] {false} ;
      H00JF2_A9414MMSPrvNum = new int[1] ;
      H00JF2_n9414MMSPrvNum = new boolean[] {false} ;
      H00JF2_A9420MMSEst = new String[] {""} ;
      H00JF2_n9420MMSEst = new boolean[] {false} ;
      H00JF2_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00JF2_n9416MMSFch = new boolean[] {false} ;
      H00JF2_A9413MMSTpo = new String[] {""} ;
      H00JF2_n9413MMSTpo = new boolean[] {false} ;
      H00JF3_A407EmprNom = new String[] {""} ;
      H00JF3_n407EmprNom = new boolean[] {false} ;
      AV13Station = "" ;
      GXt_char1 = "" ;
      AV14Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV15Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA9412MMSCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmmovstgeneral__default(),
         new Object[] {
             new Object[] {
            H00JF2_A396EmprCod, H00JF2_A9412MMSCod, H00JF2_A9415MMSPrvNom, H00JF2_n9415MMSPrvNom, H00JF2_A407EmprNom, H00JF2_n407EmprNom, H00JF2_A11304MMSFchApl, H00JF2_n11304MMSFchApl, H00JF2_A9418MMSFchCre, H00JF2_n9418MMSFchCre,
            H00JF2_A9417MMSUsuCre, H00JF2_n9417MMSUsuCre, H00JF2_A9419MMSNroExt, H00JF2_n9419MMSNroExt, H00JF2_A11509MMSDto, H00JF2_n11509MMSDto, H00JF2_A9414MMSPrvNum, H00JF2_n9414MMSPrvNum, H00JF2_A9420MMSEst, H00JF2_n9420MMSEst,
            H00JF2_A9416MMSFch, H00JF2_n9416MMSFch, H00JF2_A9413MMSTpo, H00JF2_n9413MMSTpo
            }
            , new Object[] {
            H00JF3_A407EmprNom, H00JF3_n407EmprNom
            }
         }
      );
      AV17Pgmname = "TMMovStGeneral" ;
      /* GeneXus formulas. */
      AV17Pgmname = "TMMovStGeneral" ;
      Gx_err = (short)(0) ;
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
   private int wcpOA9412MMSCod ;
   private int A9412MMSCod ;
   private int edtMMSCod_Enabled ;
   private int edtMMSFch_Enabled ;
   private int A9414MMSPrvNum ;
   private int edtMMSPrvNum_Enabled ;
   private int edtMMSDto_Enabled ;
   private int edtMMSNroExt_Enabled ;
   private int edtMMSUsuCre_Enabled ;
   private int edtMMSFchCre_Enabled ;
   private int edtMMSFchApl_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int edtMMSPrvNom_Visible ;
   private int idxLst ;
   private java.math.BigDecimal A11509MMSDto ;
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
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String edtMMSCod_Internalname ;
   private String edtMMSCod_Jsonclick ;
   private String A9413MMSTpo ;
   private String edtMMSFch_Internalname ;
   private String edtMMSFch_Jsonclick ;
   private String A9420MMSEst ;
   private String edtMMSPrvNum_Internalname ;
   private String edtMMSPrvNum_Jsonclick ;
   private String edtMMSDto_Internalname ;
   private String edtMMSDto_Jsonclick ;
   private String edtMMSNroExt_Internalname ;
   private String A9419MMSNroExt ;
   private String edtMMSNroExt_Jsonclick ;
   private String edtMMSUsuCre_Internalname ;
   private String A9417MMSUsuCre ;
   private String edtMMSUsuCre_Jsonclick ;
   private String edtMMSFchCre_Internalname ;
   private String edtMMSFchCre_Jsonclick ;
   private String edtMMSFchApl_Internalname ;
   private String edtMMSFchApl_Jsonclick ;
   private String divTransactiondetail_tableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtMMSPrvNom_Internalname ;
   private String A9415MMSPrvNom ;
   private String edtMMSPrvNom_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV14Emprcod ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA9412MMSCod ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date A9416MMSFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n9413MMSTpo ;
   private boolean n9420MMSEst ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n9415MMSPrvNom ;
   private boolean n11304MMSFchApl ;
   private boolean n9418MMSFchCre ;
   private boolean n9417MMSUsuCre ;
   private boolean n9419MMSNroExt ;
   private boolean n11509MMSDto ;
   private boolean n9414MMSPrvNum ;
   private boolean n9416MMSFch ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private HTMLChoice cmbMMSTpo ;
   private HTMLChoice cmbMMSEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00JF2_A396EmprCod ;
   private int[] H00JF2_A9412MMSCod ;
   private String[] H00JF2_A9415MMSPrvNom ;
   private boolean[] H00JF2_n9415MMSPrvNom ;
   private String[] H00JF2_A407EmprNom ;
   private boolean[] H00JF2_n407EmprNom ;
   private java.util.Date[] H00JF2_A11304MMSFchApl ;
   private boolean[] H00JF2_n11304MMSFchApl ;
   private java.util.Date[] H00JF2_A9418MMSFchCre ;
   private boolean[] H00JF2_n9418MMSFchCre ;
   private String[] H00JF2_A9417MMSUsuCre ;
   private boolean[] H00JF2_n9417MMSUsuCre ;
   private String[] H00JF2_A9419MMSNroExt ;
   private boolean[] H00JF2_n9419MMSNroExt ;
   private java.math.BigDecimal[] H00JF2_A11509MMSDto ;
   private boolean[] H00JF2_n11509MMSDto ;
   private int[] H00JF2_A9414MMSPrvNum ;
   private boolean[] H00JF2_n9414MMSPrvNum ;
   private String[] H00JF2_A9420MMSEst ;
   private boolean[] H00JF2_n9420MMSEst ;
   private java.util.Date[] H00JF2_A9416MMSFch ;
   private boolean[] H00JF2_n9416MMSFch ;
   private String[] H00JF2_A9413MMSTpo ;
   private boolean[] H00JF2_n9413MMSTpo ;
   private String[] H00JF3_A407EmprNom ;
   private boolean[] H00JF3_n407EmprNom ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tmmovstgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00JF2", "SELECT T1.EmprCod, T1.MMSCod, T3.PrvNom AS MMSPrvNom, T2.EmprNom, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T1.MMSEst, T1.MMSFch, T1.MMSTpo FROM ((TXPMMoStk T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.MMSPrvNum) WHERE T1.EmprCod = ? and T1.MMSCod = ? ORDER BY T1.EmprCod, T1.MMSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00JF3", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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

