package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordmrtmordenconsumo_impl extends GXWebComponent
{
   public tmordmrtmordenconsumo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordmrtmordenconsumo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordmrtmordenconsumo_impl.class ));
   }

   public tmordmrtmordenconsumo_impl( int remoteHandle ,
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
      cmbOMEst = new HTMLChoice();
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
               A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A9425OMCod)});
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
         pa12P2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TMOrd MRTMOrden Consumo", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmordmrtmordenconsumo", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0))}, new String[] {"EmprCod","OMCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vACCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV15Accion, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TMOrdMRTMOrdenConsumo");
      forbiddenHiddens.add("OMMaqCod", GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmordmrtmordenconsumo:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA9425OMCod", GXutil.ltrim( localUtil.ntoc( wcpOA9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vACCION", GXutil.rtrim( AV15Accion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vACCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV15Accion, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Width", GXutil.rtrim( Dvpanel_transactiondetail_tabletextonota_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tabletextonota_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tabletextonota_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tabletextonota_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Title", GXutil.rtrim( Dvpanel_transactiondetail_tabletextonota_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tabletextonota_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tabletextonota_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tabletextonota_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tabletextonota_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tabletextonota_Autoscroll));
   }

   public void renderHtmlCloseForm12P2( )
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
      return "TMOrdMRTMOrdenConsumo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TMOrd MRTMOrden Consumo", "") ;
   }

   public void wb12P0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tmordmrtmordenconsumo");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMCod_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMaqDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMMaqDsc_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtOMMaqDsc_Link, "", "", "", edtOMMaqDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchPre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMFchPre_Internalname, httpContext.getMessage( "Fecha Prevista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtOMFchPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchPre_Internalname, localUtil.format(A9438OMFchPre, "99/99/99"), localUtil.format( A9438OMFchPre, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtOMFchPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbOMEst.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbOMEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMOrdMRTMOrdenConsumo.htm");
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMFchCre_Internalname, httpContext.getMessage( "Fecha de Creación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtOMFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCre_Internalname, localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9436OMFchCre, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtOMFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMUsuCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMUsuCre_Internalname, httpContext.getMessage( "Usuario que Crea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMUsuCre_Internalname, GXutil.rtrim( A9437OMUsuCre), GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMUsuCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMFchCer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMFchCer_Internalname, httpContext.getMessage( "Cerrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtOMFchCer_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCer_Internalname, localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9439OMFchCer, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMFchCer_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtOMFchCer_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCer_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSMCod_Internalname, httpContext.getMessage( "Solicitud", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMCod_Internalname, httpContext.getMessage( "Preventivo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_tabletextonota.setProperty("Width", Dvpanel_transactiondetail_tabletextonota_Width);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("AutoWidth", Dvpanel_transactiondetail_tabletextonota_Autowidth);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("AutoHeight", Dvpanel_transactiondetail_tabletextonota_Autoheight);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("Cls", Dvpanel_transactiondetail_tabletextonota_Cls);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("Title", Dvpanel_transactiondetail_tabletextonota_Title);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("Collapsible", Dvpanel_transactiondetail_tabletextonota_Collapsible);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("Collapsed", Dvpanel_transactiondetail_tabletextonota_Collapsed);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tabletextonota_Showcollapseicon);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("IconPosition", Dvpanel_transactiondetail_tabletextonota_Iconposition);
         ucDvpanel_transactiondetail_tabletextonota.setProperty("AutoScroll", Dvpanel_transactiondetail_tabletextonota_Autoscroll);
         ucDvpanel_transactiondetail_tabletextonota.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tabletextonota_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTAContainer"+"TransactionDetail_TableTextoNota"+"\" style=\"display:none;\">") ;
         wb_table1_63_12P2( true) ;
      }
      else
      {
         wb_table1_63_12P2( false) ;
      }
      return  ;
   }

   public void wb_table1_63_12P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tblequipotarea_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_equipos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_tareas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tblrepuestooperador_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_repuesto_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableleaflevel_operador_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1112p1_client"+"'", TempTags, "", 2, "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1212p1_client"+"'", TempTags, "", 2, "HLP_TMOrdMRTMOrdenConsumo.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqCod_Visible, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCodFo_Internalname, GXutil.rtrim( A13679OMMaqCodFo), GXutil.rtrim( localUtil.format( A13679OMMaqCodFo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCodFo_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMaqCodFo_Visible, 0, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMDscMqPla_Internalname, GXutil.rtrim( A13678OMDscMqPla), GXutil.rtrim( localUtil.format( A13678OMDscMqPla, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMDscMqPla_Jsonclick, 0, "Attribute", "", "", "", "", edtOMDscMqPla_Visible, 0, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMDuracion_Internalname, A13680OMDuracion, GXutil.rtrim( localUtil.format( A13680OMDuracion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMDuracion_Jsonclick, 0, "Attribute", "", "", "", "", edtOMDuracion_Visible, 0, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMCosRea_Internalname, GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCosRea_Jsonclick, 0, "Attribute", "", "", "", "", edtOMCosRea_Visible, 0, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMRRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRRCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMRRCosT_Visible, 0, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMRCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRCCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMRCCosT_Visible, 0, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMMRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMRCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMRCosT_Visible, 0, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCCosT_Jsonclick, 0, "Attribute", "", "", "", "", edtOMMCCosT_Visible, 0, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start12P2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TMOrd MRTMOrden Consumo", ""), (short)(0)) ;
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
            strup12P0( ) ;
         }
      }
   }

   public void ws12P2( )
   {
      start12P2( ) ;
      evt12P2( ) ;
   }

   public void evt12P2( )
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
                              strup12P0( ) ;
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
                              strup12P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1312P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup12P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1412P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup12P0( ) ;
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
                              strup12P0( ) ;
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

   public void we12P2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm12P2( ) ;
         }
      }
   }

   public void pa12P2( )
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
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9445OMEst", A9445OMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf12P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV22Pgmname = "TMOrdMRTMOrdenConsumo" ;
      Gx_err = (short)(0) ;
   }

   public void rf12P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H012P5 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9426OMMaqCod = H012P5_A9426OMMaqCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9426OMMaqCod", A9426OMMaqCod);
            A9464OMNot = H012P5_A9464OMNot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9464OMNot", A9464OMNot);
            A9433OMTxt = H012P5_A9433OMTxt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9433OMTxt", A9433OMTxt);
            A9429PMCod = H012P5_A9429PMCod[0] ;
            n9429PMCod = H012P5_n9429PMCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            A9428SMCod = H012P5_A9428SMCod[0] ;
            n9428SMCod = H012P5_n9428SMCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            A9439OMFchCer = H012P5_A9439OMFchCer[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A9437OMUsuCre = H012P5_A9437OMUsuCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9437OMUsuCre", A9437OMUsuCre);
            A9436OMFchCre = H012P5_A9436OMFchCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A9438OMFchPre = H012P5_A9438OMFchPre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
            A13679OMMaqCodFo = H012P5_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = H012P5_n13679OMMaqCodFo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
            A9427OMMaqDsc = H012P5_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = H012P5_n9427OMMaqDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9427OMMaqDsc", A9427OMMaqDsc);
            A9441OMMCCosT = H012P5_A9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            A9443OMRCCosT = H012P5_A9443OMRCCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            A9445OMEst = H012P5_A9445OMEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9445OMEst", A9445OMEst);
            A9442OMMRCosT = H012P5_A9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9444OMRRCosT = H012P5_A9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A9427OMMaqDsc = H012P5_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = H012P5_n9427OMMaqDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9427OMMaqDsc", A9427OMMaqDsc);
            A9441OMMCCosT = H012P5_A9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            A9442OMMRCosT = H012P5_A9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9443OMRCCosT = H012P5_A9443OMRCCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            A9444OMRRCosT = H012P5_A9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            A13679OMMaqCodFo = H012P5_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = H012P5_n13679OMMaqCodFo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
            if ( (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
            {
               A13678OMDscMqPla = A9427OMMaqDsc ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13678OMDscMqPla", A13678OMDscMqPla);
            }
            else
            {
               A13678OMDscMqPla = A13679OMMaqCodFo ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13678OMDscMqPla", A13678OMDscMqPla);
            }
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
            {
               A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
            else
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
               {
                  A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               }
               else
               {
                  A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               }
            }
            /* Execute user event: Load */
            e1412P2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb12P0( ) ;
      }
   }

   public void send_integrity_lvl_hashes12P2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vACCION", GXutil.rtrim( AV15Accion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vACCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV15Accion, ""))));
   }

   public void before_start_formulas( )
   {
      AV22Pgmname = "TMOrdMRTMOrdenConsumo" ;
      Gx_err = (short)(0) ;
      A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13680OMDuracion", A13680OMDuracion);
      /* Using cursor H012P6 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      A407EmprNom = H012P6_A407EmprNom[0] ;
      n407EmprNom = H012P6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(1);
      /* Using cursor H012P8 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A9441OMMCCosT = H012P8_A9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = H012P8_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      pr_default.close(2);
      /* Using cursor H012P10 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A9443OMRCCosT = H012P10_A9443OMRCCosT[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = H012P10_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      pr_default.close(3);
      /* Using cursor H012P12 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A13679OMMaqCodFo = H012P12_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = H012P12_n13679OMMaqCodFo[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      else
      {
         A13679OMMaqCodFo = "" ;
         n13679OMMaqCodFo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
      }
      pr_default.close(4);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      fix_multi_value_controls( ) ;
   }

   public void strup12P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1312P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15Accion = httpContext.cgiGet( sPrefix+"vACCION") ;
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
         Dvpanel_transactiondetail_tabletextonota_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Width") ;
         Dvpanel_transactiondetail_tabletextonota_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Autowidth")) ;
         Dvpanel_transactiondetail_tabletextonota_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Autoheight")) ;
         Dvpanel_transactiondetail_tabletextonota_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Cls") ;
         Dvpanel_transactiondetail_tabletextonota_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Title") ;
         Dvpanel_transactiondetail_tabletextonota_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Collapsible")) ;
         Dvpanel_transactiondetail_tabletextonota_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Collapsed")) ;
         Dvpanel_transactiondetail_tabletextonota_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tabletextonota_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Iconposition") ;
         Dvpanel_transactiondetail_tabletextonota_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA_Autoscroll")) ;
         /* Read variables values. */
         A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
         n9427OMMaqDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9427OMMaqDsc", A9427OMMaqDsc);
         A9438OMFchPre = localUtil.ctod( httpContext.cgiGet( edtOMFchPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
         cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
         A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9445OMEst", A9445OMEst);
         A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9437OMUsuCre", A9437OMUsuCre);
         A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9433OMTxt", A9433OMTxt);
         A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9464OMNot", A9464OMNot);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9426OMMaqCod", A9426OMMaqCod);
         A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
         n13679OMMaqCodFo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13679OMMaqCodFo", A13679OMMaqCodFo);
         A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13678OMDscMqPla", A13678OMDscMqPla);
         A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13680OMDuracion", A13680OMDuracion);
         A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TMOrdMRTMOrdenConsumo");
         A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9426OMMaqCod", A9426OMMaqCod);
         forbiddenHiddens.add("OMMaqCod", GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tmordmrtmordenconsumo:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1312P2 ();
      if (returnInSub) return;
   }

   public void e1312P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmordmrtmordenconsumo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = AV19Emprcod ;
      GXv_char3[0] = AV20Emprnom ;
      GXv_char4[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordmrtmordenconsumo_impl.this.AV19Emprcod = GXv_char2[0] ;
      tmordmrtmordenconsumo_impl.this.AV20Emprnom = GXv_char3[0] ;
      tmordmrtmordenconsumo_impl.this.AV21Usurcod = GXv_char4[0] ;
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

   protected void e1412P2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtOMMaqDsc_Link = formatLink("app.tmaqfasview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MaqCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMMaqDsc_Internalname, "Link", edtOMMaqDsc_Link, true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtOMMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Visible), 5, 0), true);
      edtOMMaqCodFo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMMaqCodFo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCodFo_Visible), 5, 0), true);
      edtOMDscMqPla_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMDscMqPla_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDscMqPla_Visible), 5, 0), true);
      edtOMDuracion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMDuracion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDuracion_Visible), 5, 0), true);
      edtOMCosRea_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMCosRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCosRea_Visible), 5, 0), true);
      edtOMRRCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMRRCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCosT_Visible), 5, 0), true);
      edtOMRCCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMRCCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCosT_Visible), 5, 0), true);
      edtOMMRCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMMRCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCosT_Visible), 5, 0), true);
      edtOMMCCosT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOMMCCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV22Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMOrdenConsumo" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_63_12P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTransactiondetail_tabletextonota_Internalname, tblTransactiondetail_tabletextonota_Internalname, "", "TableData", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableomtxt_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockomtxt_Internalname, httpContext.getMessage( "Texto", ""), "", "", lblTextblockomtxt_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMTxt_Internalname, httpContext.getMessage( "Desc del Trabajo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtOMTxt_Internalname, A9433OMTxt, "", "", (short)(0), 1, edtOMTxt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableomnot_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockomnot_Internalname, httpContext.getMessage( "Nota", ""), "", "", lblTextblockomnot_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtOMNot_Internalname, httpContext.getMessage( "Nota", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtOMNot_Internalname, A9464OMNot, "", "", (short)(0), 1, edtOMNot_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TMOrdMRTMOrdenConsumo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_63_12P2e( true) ;
      }
      else
      {
         wb_table1_63_12P2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A9425OMCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
      pa12P2( ) ;
      ws12P2( ) ;
      we12P2( ) ;
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
      sCtrlA9425OMCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa12P2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tmordmrtmordenconsumo", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa12P2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A9425OMCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A9425OMCod != wcpOA9425OMCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA9425OMCod = A9425OMCod ;
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
      sCtrlA9425OMCod = httpContext.cgiGet( sPrefix+"A9425OMCod_CTRL") ;
      if ( GXutil.len( sCtrlA9425OMCod) > 0 )
      {
         A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA9425OMCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      else
      {
         A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A9425OMCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa12P2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws12P2( ) ;
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
      ws12P2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9425OMCod_PARM", GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA9425OMCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9425OMCod_CTRL", GXutil.rtrim( sCtrlA9425OMCod));
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
      we12P2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202636228833", true, true);
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
      httpContext.AddJavascriptSource("tmordmrtmordenconsumo.js", "?202636228833", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtOMCod_Internalname = sPrefix+"OMCOD" ;
      edtOMMaqDsc_Internalname = sPrefix+"OMMAQDSC" ;
      edtOMFchPre_Internalname = sPrefix+"OMFCHPRE" ;
      cmbOMEst.setInternalname( sPrefix+"OMEST" );
      edtOMFchCre_Internalname = sPrefix+"OMFCHCRE" ;
      edtOMUsuCre_Internalname = sPrefix+"OMUSUCRE" ;
      edtOMFchCer_Internalname = sPrefix+"OMFCHCER" ;
      edtSMCod_Internalname = sPrefix+"SMCOD" ;
      edtPMCod_Internalname = sPrefix+"PMCOD" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      lblTextblockomtxt_Internalname = sPrefix+"TEXTBLOCKOMTXT" ;
      edtOMTxt_Internalname = sPrefix+"OMTXT" ;
      divUnnamedtableomtxt_Internalname = sPrefix+"UNNAMEDTABLEOMTXT" ;
      lblTextblockomnot_Internalname = sPrefix+"TEXTBLOCKOMNOT" ;
      edtOMNot_Internalname = sPrefix+"OMNOT" ;
      divUnnamedtableomnot_Internalname = sPrefix+"UNNAMEDTABLEOMNOT" ;
      tblTransactiondetail_tabletextonota_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLETEXTONOTA" ;
      Dvpanel_transactiondetail_tabletextonota_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTONOTA" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTransactiondetail_tableleaflevel_equipos_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_EQUIPOS" ;
      divTransactiondetail_tableleaflevel_tareas_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_TAREAS" ;
      divTransactiondetail_tblequipotarea_Internalname = sPrefix+"TRANSACTIONDETAIL_TBLEQUIPOTAREA" ;
      divTransactiondetail_tableleaflevel_repuesto_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_REPUESTO" ;
      divTransactiondetail_tableleaflevel_operador_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_OPERADOR" ;
      divTransactiondetail_tblrepuestooperador_Internalname = sPrefix+"TRANSACTIONDETAIL_TBLREPUESTOOPERADOR" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtOMMaqCod_Internalname = sPrefix+"OMMAQCOD" ;
      edtOMMaqCodFo_Internalname = sPrefix+"OMMAQCODFO" ;
      edtOMDscMqPla_Internalname = sPrefix+"OMDSCMQPLA" ;
      edtOMDuracion_Internalname = sPrefix+"OMDURACION" ;
      edtOMCosRea_Internalname = sPrefix+"OMCOSREA" ;
      edtOMRRCosT_Internalname = sPrefix+"OMRRCOST" ;
      edtOMRCCosT_Internalname = sPrefix+"OMRCCOST" ;
      edtOMMRCosT_Internalname = sPrefix+"OMMRCOST" ;
      edtOMMCCosT_Internalname = sPrefix+"OMMCCOST" ;
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
      edtOMNot_Enabled = 0 ;
      edtOMTxt_Enabled = 0 ;
      edtOMMCCosT_Jsonclick = "" ;
      edtOMMCCosT_Visible = 1 ;
      edtOMMRCosT_Jsonclick = "" ;
      edtOMMRCosT_Visible = 1 ;
      edtOMRCCosT_Jsonclick = "" ;
      edtOMRCCosT_Visible = 1 ;
      edtOMRRCosT_Jsonclick = "" ;
      edtOMRRCosT_Visible = 1 ;
      edtOMCosRea_Jsonclick = "" ;
      edtOMCosRea_Visible = 1 ;
      edtOMDuracion_Jsonclick = "" ;
      edtOMDuracion_Visible = 1 ;
      edtOMDscMqPla_Jsonclick = "" ;
      edtOMDscMqPla_Visible = 1 ;
      edtOMMaqCodFo_Jsonclick = "" ;
      edtOMMaqCodFo_Visible = 1 ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMMaqCod_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtPMCod_Jsonclick = "" ;
      edtPMCod_Enabled = 0 ;
      edtSMCod_Jsonclick = "" ;
      edtSMCod_Enabled = 0 ;
      edtOMFchCer_Jsonclick = "" ;
      edtOMFchCer_Enabled = 0 ;
      edtOMUsuCre_Jsonclick = "" ;
      edtOMUsuCre_Enabled = 0 ;
      edtOMFchCre_Jsonclick = "" ;
      edtOMFchCre_Enabled = 0 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 0 );
      edtOMFchPre_Jsonclick = "" ;
      edtOMFchPre_Enabled = 0 ;
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqDsc_Link = "" ;
      edtOMMaqDsc_Enabled = 0 ;
      edtOMCod_Jsonclick = "" ;
      edtOMCod_Enabled = 0 ;
      Dvpanel_transactiondetail_tabletextonota_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletextonota_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tabletextonota_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletextonota_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletextonota_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tabletextonota_Title = httpContext.getMessage( "Texto", "") ;
      Dvpanel_transactiondetail_tabletextonota_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tabletextonota_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tabletextonota_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletextonota_Width = "100%" ;
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
      cmbOMEst.setName( "OMEST" );
      cmbOMEst.setWebtags( "" );
      cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbOMEst.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV15Accion',fld:'vACCION',pic:'',hsh:true},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e1112P1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV15Accion',fld:'vACCION',pic:'',hsh:true}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e1212P1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV15Accion',fld:'vACCION',pic:'',hsh:true}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[]");
      setEventMetadata("VALID_OMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQDSC","{handler:'valid_Ommaqdsc',iparms:[]");
      setEventMetadata("VALID_OMMAQDSC",",oparms:[]}");
      setEventMetadata("VALID_OMEST","{handler:'valid_Omest',iparms:[]");
      setEventMetadata("VALID_OMEST",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCODFO","{handler:'valid_Ommaqcodfo',iparms:[]");
      setEventMetadata("VALID_OMMAQCODFO",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOST","{handler:'valid_Omrrcost',iparms:[]");
      setEventMetadata("VALID_OMRRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMRCCOST","{handler:'valid_Omrccost',iparms:[]");
      setEventMetadata("VALID_OMRCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOST","{handler:'valid_Ommrcost',iparms:[]");
      setEventMetadata("VALID_OMMRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMCCOST","{handler:'valid_Ommccost',iparms:[]");
      setEventMetadata("VALID_OMMCCOST",",oparms:[]}");
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
      AV15Accion = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      A9426OMMaqCod = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A9427OMMaqDsc = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9445OMEst = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9437OMUsuCre = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_transactiondetail_tabletextonota = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A13679OMMaqCodFo = "" ;
      A13678OMDscMqPla = "" ;
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV22Pgmname = "" ;
      scmdbuf = "" ;
      H012P5_A396EmprCod = new String[] {""} ;
      H012P5_A9425OMCod = new int[1] ;
      H012P5_A9426OMMaqCod = new String[] {""} ;
      H012P5_A407EmprNom = new String[] {""} ;
      H012P5_n407EmprNom = new boolean[] {false} ;
      H012P5_A9464OMNot = new String[] {""} ;
      H012P5_A9433OMTxt = new String[] {""} ;
      H012P5_A9429PMCod = new int[1] ;
      H012P5_n9429PMCod = new boolean[] {false} ;
      H012P5_A9428SMCod = new int[1] ;
      H012P5_n9428SMCod = new boolean[] {false} ;
      H012P5_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      H012P5_A9437OMUsuCre = new String[] {""} ;
      H012P5_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H012P5_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      H012P5_A13679OMMaqCodFo = new String[] {""} ;
      H012P5_n13679OMMaqCodFo = new boolean[] {false} ;
      H012P5_A9427OMMaqDsc = new String[] {""} ;
      H012P5_n9427OMMaqDsc = new boolean[] {false} ;
      H012P5_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H012P5_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H012P5_A9445OMEst = new String[] {""} ;
      H012P5_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H012P5_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9464OMNot = "" ;
      A9433OMTxt = "" ;
      H012P6_A407EmprNom = new String[] {""} ;
      H012P6_n407EmprNom = new boolean[] {false} ;
      H012P8_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H012P8_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H012P10_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H012P10_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H012P12_A13679OMMaqCodFo = new String[] {""} ;
      H012P12_n13679OMMaqCodFo = new boolean[] {false} ;
      hsh = "" ;
      AV18Station = "" ;
      GXt_char1 = "" ;
      AV19Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV21Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      sStyleString = "" ;
      lblTextblockomtxt_Jsonclick = "" ;
      lblTextblockomnot_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA9425OMCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordmrtmordenconsumo__default(),
         new Object[] {
             new Object[] {
            H012P5_A396EmprCod, H012P5_A9425OMCod, H012P5_A9426OMMaqCod, H012P5_A407EmprNom, H012P5_n407EmprNom, H012P5_A9464OMNot, H012P5_A9433OMTxt, H012P5_A9429PMCod, H012P5_n9429PMCod, H012P5_A9428SMCod,
            H012P5_n9428SMCod, H012P5_A9439OMFchCer, H012P5_A9437OMUsuCre, H012P5_A9436OMFchCre, H012P5_A9438OMFchPre, H012P5_A13679OMMaqCodFo, H012P5_n13679OMMaqCodFo, H012P5_A9427OMMaqDsc, H012P5_n9427OMMaqDsc, H012P5_A9441OMMCCosT,
            H012P5_A9443OMRCCosT, H012P5_A9445OMEst, H012P5_A9442OMMRCosT, H012P5_A9444OMRRCosT
            }
            , new Object[] {
            H012P6_A407EmprNom, H012P6_n407EmprNom
            }
            , new Object[] {
            H012P8_A9441OMMCCosT, H012P8_A9442OMMRCosT
            }
            , new Object[] {
            H012P10_A9443OMRCCosT, H012P10_A9444OMRRCosT
            }
            , new Object[] {
            H012P12_A13679OMMaqCodFo, H012P12_n13679OMMaqCodFo
            }
         }
      );
      AV22Pgmname = "TMOrdMRTMOrdenConsumo" ;
      /* GeneXus formulas. */
      AV22Pgmname = "TMOrdMRTMOrdenConsumo" ;
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
   private int wcpOA9425OMCod ;
   private int A9425OMCod ;
   private int edtOMCod_Enabled ;
   private int edtOMMaqDsc_Enabled ;
   private int edtOMFchPre_Enabled ;
   private int edtOMFchCre_Enabled ;
   private int edtOMUsuCre_Enabled ;
   private int edtOMFchCer_Enabled ;
   private int A9428SMCod ;
   private int edtSMCod_Enabled ;
   private int A9429PMCod ;
   private int edtPMCod_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int edtOMMaqCod_Visible ;
   private int edtOMMaqCodFo_Visible ;
   private int edtOMDscMqPla_Visible ;
   private int edtOMDuracion_Visible ;
   private int edtOMCosRea_Visible ;
   private int edtOMRRCosT_Visible ;
   private int edtOMRCCosT_Visible ;
   private int edtOMMRCosT_Visible ;
   private int edtOMMCCosT_Visible ;
   private int edtOMTxt_Enabled ;
   private int edtOMNot_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A9440OMCosRea ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
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
   private String AV15Accion ;
   private String GXKey ;
   private String A9426OMMaqCod ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String Dvpanel_transactiondetail_tabletextonota_Width ;
   private String Dvpanel_transactiondetail_tabletextonota_Cls ;
   private String Dvpanel_transactiondetail_tabletextonota_Title ;
   private String Dvpanel_transactiondetail_tabletextonota_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String edtOMCod_Internalname ;
   private String edtOMCod_Jsonclick ;
   private String edtOMMaqDsc_Internalname ;
   private String A9427OMMaqDsc ;
   private String edtOMMaqDsc_Link ;
   private String edtOMMaqDsc_Jsonclick ;
   private String edtOMFchPre_Internalname ;
   private String edtOMFchPre_Jsonclick ;
   private String A9445OMEst ;
   private String edtOMFchCre_Internalname ;
   private String edtOMFchCre_Jsonclick ;
   private String edtOMUsuCre_Internalname ;
   private String A9437OMUsuCre ;
   private String edtOMUsuCre_Jsonclick ;
   private String edtOMFchCer_Internalname ;
   private String edtOMFchCer_Jsonclick ;
   private String edtSMCod_Internalname ;
   private String edtSMCod_Jsonclick ;
   private String edtPMCod_Internalname ;
   private String edtPMCod_Jsonclick ;
   private String Dvpanel_transactiondetail_tabletextonota_Internalname ;
   private String divTransactiondetail_tblequipotarea_Internalname ;
   private String divTransactiondetail_tableleaflevel_equipos_Internalname ;
   private String divTransactiondetail_tableleaflevel_tareas_Internalname ;
   private String divTransactiondetail_tblrepuestooperador_Internalname ;
   private String divTransactiondetail_tableleaflevel_repuesto_Internalname ;
   private String divTransactiondetail_tableleaflevel_operador_Internalname ;
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
   private String edtOMMaqCod_Internalname ;
   private String edtOMMaqCod_Jsonclick ;
   private String edtOMMaqCodFo_Internalname ;
   private String A13679OMMaqCodFo ;
   private String edtOMMaqCodFo_Jsonclick ;
   private String edtOMDscMqPla_Internalname ;
   private String A13678OMDscMqPla ;
   private String edtOMDscMqPla_Jsonclick ;
   private String edtOMDuracion_Internalname ;
   private String edtOMDuracion_Jsonclick ;
   private String edtOMCosRea_Internalname ;
   private String edtOMCosRea_Jsonclick ;
   private String edtOMRRCosT_Internalname ;
   private String edtOMRRCosT_Jsonclick ;
   private String edtOMRCCosT_Internalname ;
   private String edtOMRCCosT_Jsonclick ;
   private String edtOMMRCosT_Internalname ;
   private String edtOMMRCosT_Jsonclick ;
   private String edtOMMCCosT_Internalname ;
   private String edtOMMCCosT_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV22Pgmname ;
   private String scmdbuf ;
   private String edtOMTxt_Internalname ;
   private String edtOMNot_Internalname ;
   private String hsh ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String AV19Emprcod ;
   private String GXv_char2[] ;
   private String AV20Emprnom ;
   private String GXv_char3[] ;
   private String AV21Usurcod ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblTransactiondetail_tabletextonota_Internalname ;
   private String divUnnamedtableomtxt_Internalname ;
   private String lblTextblockomtxt_Internalname ;
   private String lblTextblockomtxt_Jsonclick ;
   private String divUnnamedtableomnot_Internalname ;
   private String lblTextblockomnot_Internalname ;
   private String lblTextblockomnot_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA9425OMCod ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9438OMFchPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tabletextonota_Autowidth ;
   private boolean Dvpanel_transactiondetail_tabletextonota_Autoheight ;
   private boolean Dvpanel_transactiondetail_tabletextonota_Collapsible ;
   private boolean Dvpanel_transactiondetail_tabletextonota_Collapsed ;
   private boolean Dvpanel_transactiondetail_tabletextonota_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tabletextonota_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n9429PMCod ;
   private boolean n9428SMCod ;
   private boolean n13679OMMaqCodFo ;
   private boolean n9427OMMaqDsc ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String A13680OMDuracion ;
   private String A9464OMNot ;
   private String A9433OMTxt ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tabletextonota ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private IDataStoreProvider pr_default ;
   private String[] H012P5_A396EmprCod ;
   private int[] H012P5_A9425OMCod ;
   private String[] H012P5_A9426OMMaqCod ;
   private String[] H012P5_A407EmprNom ;
   private boolean[] H012P5_n407EmprNom ;
   private String[] H012P5_A9464OMNot ;
   private String[] H012P5_A9433OMTxt ;
   private int[] H012P5_A9429PMCod ;
   private boolean[] H012P5_n9429PMCod ;
   private int[] H012P5_A9428SMCod ;
   private boolean[] H012P5_n9428SMCod ;
   private java.util.Date[] H012P5_A9439OMFchCer ;
   private String[] H012P5_A9437OMUsuCre ;
   private java.util.Date[] H012P5_A9436OMFchCre ;
   private java.util.Date[] H012P5_A9438OMFchPre ;
   private String[] H012P5_A13679OMMaqCodFo ;
   private boolean[] H012P5_n13679OMMaqCodFo ;
   private String[] H012P5_A9427OMMaqDsc ;
   private boolean[] H012P5_n9427OMMaqDsc ;
   private java.math.BigDecimal[] H012P5_A9441OMMCCosT ;
   private java.math.BigDecimal[] H012P5_A9443OMRCCosT ;
   private String[] H012P5_A9445OMEst ;
   private java.math.BigDecimal[] H012P5_A9442OMMRCosT ;
   private java.math.BigDecimal[] H012P5_A9444OMRRCosT ;
   private String[] H012P6_A407EmprNom ;
   private boolean[] H012P6_n407EmprNom ;
   private java.math.BigDecimal[] H012P8_A9441OMMCCosT ;
   private java.math.BigDecimal[] H012P8_A9442OMMRCosT ;
   private java.math.BigDecimal[] H012P10_A9443OMRCCosT ;
   private java.math.BigDecimal[] H012P10_A9444OMRRCosT ;
   private String[] H012P12_A13679OMMaqCodFo ;
   private boolean[] H012P12_n13679OMMaqCodFo ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tmordmrtmordenconsumo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H012P5", "SELECT T1.EmprCod, T1.OMCod, T1.OMMaqCod AS OMMaqCod, T2.EmprNom, T1.OMNot, T1.OMTxt, T1.PMCod, T1.SMCod, T1.OMFchCer, T1.OMUsuCre, T1.OMFchCre, T1.OMFchPre, COALESCE( T6.OMMaqCodFo, '') AS OMMaqCodFo, T3.MaqDsc AS OMMaqDsc, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT, 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM (((((TXPMORDEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.OMMaqCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) LEFT JOIN (SELECT T7.MaqCodFor AS OMMaqCodFo, T7.EmprCod, T8.OMCod, T7.MaqCod, T8.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T7 INNER JOIN TXPMORDEN T8 ON T8.EmprCod = T7.EmprCod) WHERE T7.MaqCod = T8.OMMaqCod ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H012P6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H012P8", "SELECT COALESCE( T1.OMMCCosT, 0) AS OMMCCosT, COALESCE( T1.OMMRCosT, 0) AS OMMRCosT FROM (SELECT EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H012P10", "SELECT COALESCE( T1.OMRCCosT, 0) AS OMRCCosT, COALESCE( T1.OMRRCosT, 0) AS OMRRCosT FROM (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H012P12", "SELECT COALESCE( T1.OMMaqCodFo, '') AS OMMaqCodFo FROM (SELECT T2.MaqCodFor AS OMMaqCodFo, T2.EmprCod, T3.OMCod, T2.MaqCod, T3.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T2 INNER JOIN TXPMORDEN T3 ON T3.EmprCod = T2.EmprCod) WHERE T2.MaqCod = T3.OMMaqCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,3);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,3);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(18,3);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(19,3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

