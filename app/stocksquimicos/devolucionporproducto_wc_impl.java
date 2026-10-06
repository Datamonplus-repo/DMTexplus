package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devolucionporproducto_wc_impl extends GXWebComponent
{
   public devolucionporproducto_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devolucionporproducto_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devolucionporproducto_wc_impl.class ));
   }

   public devolucionporproducto_wc_impl( int remoteHandle ,
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
      cmbavTipmovcc = new HTMLChoice();
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
               AV6Prdnum = httpContext.GetPar( "Prdnum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
               AV8PrdNom = httpContext.GetPar( "PrdNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNom", AV8PrdNom);
               AV7PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
               AV9PrvNom = httpContext.GetPar( "PrvNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNom", AV9PrvNom);
               AV10PrdExiALm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiALm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrdExiALm", GXutil.ltrimstr( AV10PrdExiALm, 12, 4));
               AV11PrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreAct"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdPreAct", GXutil.ltrimstr( AV11PrdPreAct, 14, 5));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV6Prdnum,AV8PrdNom,Integer.valueOf(AV7PrvNum),AV9PrvNom,AV10PrdExiALm,AV11PrdPreAct});
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
         pa1RQ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Devolucion por Producto", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.devolucionporproducto_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Prdnum)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(AV7PrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9PrvNom)),GXutil.URLEncode(DecimalUtil.decToString(AV10PrdExiALm)),GXutil.URLEncode(DecimalUtil.decToString(AV11PrdPreAct))}, new String[] {"Emprcod","Prdnum","PrdNom","PrvNum","PrvNom","PrdExiALm","PrdPreAct"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV26moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21Val_stk), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Prdnum", GXutil.rtrim( wcpOAV6Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8PrdNom", GXutil.rtrim( wcpOAV8PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOAV7PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9PrvNom", GXutil.rtrim( wcpOAV9PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10PrdExiALm", GXutil.ltrim( localUtil.ntoc( wcpOAV10PrdExiALm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11PrdPreAct", GXutil.ltrim( localUtil.ntoc( wcpOAV11PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV26moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV26moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV20UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV21Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21Val_stk), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV11PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm1RQ2( )
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
      return "StocksQuimicos.DevolucionporProducto_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion por Producto", "") ;
   }

   public void wb1RQ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.devolucionporproducto_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV6Prdnum), GXutil.rtrim( localUtil.format( AV6Prdnum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnom_Internalname, GXutil.rtrim( AV8PrdNom), GXutil.rtrim( localUtil.format( AV8PrdNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdexialm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdexialm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV10PrdExiALm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV10PrdExiALm, "ZZZZZZ9.9999") : localUtil.format( AV10PrdExiALm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnum_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV7PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrvnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnom_Internalname, GXutil.rtrim( AV9PrvNom), GXutil.rtrim( localUtil.format( AV9PrvNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipmovcc.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipmovcc, cmbavTipmovcc.getInternalname(), GXutil.rtrim( AV12TipMovCc), 1, cmbavTipmovcc.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTipmovcc.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         cmbavTipmovcc.setValue( GXutil.rtrim( AV12TipMovCc) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavTipmovcc.getInternalname(), "Values", cmbavTipmovcc.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCantidad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantidad_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Cantidad, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantidad_Enabled!=0) ? localUtil.format( AV13Cantidad, "ZZZZZZ9.9999") : localUtil.format( AV13Cantidad, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantidad_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrecio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrecio_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Precio, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrecio_Enabled!=0) ? localUtil.format( AV14Precio, "ZZZZZZZ9.999") : localUtil.format( AV14Precio, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,67);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrecio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrecio_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdlote_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdlote_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblockprdlote_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_74_1RQ2( true) ;
      }
      else
      {
         wb_table1_74_1RQ2( false) ;
      }
      return  ;
   }

   public void wb_table1_74_1RQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         wb_table2_94_1RQ2( true) ;
      }
      else
      {
         wb_table2_94_1RQ2( false) ;
      }
      return  ;
   }

   public void wb_table2_94_1RQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1RQ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion por Producto", ""), (short)(0)) ;
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
            strup1RQ0( ) ;
         }
      }
   }

   public void ws1RQ2( )
   {
      start1RQ2( ) ;
      evt1RQ2( ) ;
   }

   public void evt1RQ2( )
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
                              strup1RQ0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111RQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e121RQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoConfirmar' */
                                 e131RQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e141RQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e151RQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RQ0( ) ;
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
                              strup1RQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavTipmovcc.getInternalname() ;
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

   public void we1RQ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1RQ2( ) ;
         }
      }
   }

   public void pa1RQ2( )
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
            GX_FocusControl = cmbavTipmovcc.getInternalname() ;
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
      if ( cmbavTipmovcc.getItemCount() > 0 )
      {
         AV12TipMovCc = cmbavTipmovcc.getValidValue(AV12TipMovCc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipMovCc", AV12TipMovCc);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipmovcc.setValue( GXutil.rtrim( AV12TipMovCc) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavTipmovcc.getInternalname(), "Values", cmbavTipmovcc.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1RQ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV29Pgmname = "StocksQuimicos.DevolucionporProducto_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1RQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151RQ2 ();
         wb1RQ0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1RQ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV26moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV26moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV21Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21Val_stk), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV29Pgmname = "StocksQuimicos.DevolucionporProducto_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1RQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121RQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV6Prdnum") ;
         wcpOAV8PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV8PrdNom") ;
         wcpOAV7PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9PrvNom = httpContext.cgiGet( sPrefix+"wcpOAV9PrvNom") ;
         wcpOAV10PrdExiALm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV10PrdExiALm")) ;
         wcpOAV11PrdPreAct = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV11PrdPreAct")) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Pgmname", AV29Pgmname);
         if ( GXutil.len( sPrefix) == 0 )
         {
            AV6Prdnum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            AV8PrdNom = httpContext.cgiGet( edtavPrdnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNom", AV8PrdNom);
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            AV7PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavPrvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
         }
         cmbavTipmovcc.setValue( httpContext.cgiGet( cmbavTipmovcc.getInternalname()) );
         AV12TipMovCc = httpContext.cgiGet( cmbavTipmovcc.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipMovCc", AV12TipMovCc);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
            GX_FocusControl = edtavCantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Cantidad = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
         }
         else
         {
            AV13Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrecio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrecio_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRECIO");
            GX_FocusControl = edtavPrecio_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Precio = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
         }
         else
         {
            AV14Precio = localUtil.ctond( httpContext.cgiGet( edtavPrecio_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
         }
         AV24PrdLote = httpContext.cgiGet( edtavPrdlote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24PrdLote", AV24PrdLote);
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
      e121RQ2 ();
      if (returnInSub) return;
   }

   public void e121RQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV21Val_stk) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "VALSTK", ""), GXv_int2) ;
      devolucionporproducto_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV21Val_stk = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Val_stk), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21Val_stk), "ZZZ9")));
      GXt_int3 = AV22Precio_stk ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "VALSTK", ""), GXv_int4) ;
      devolucionporproducto_wc_impl.this.GXt_int3 = GXv_int4[0] ;
      AV22Precio_stk = (short)(GXt_int3) ;
      GXt_int1 = (byte)(AV23FlagCcs) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "CCSTKS", ""), GXv_int2) ;
      devolucionporproducto_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV23FlagCcs = GXt_int1 ;
      GXt_int1 = (byte)(AV26moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      devolucionporproducto_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV26moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV26moda21), "ZZZ9")));
      AV12TipMovCc = httpContext.getMessage( "SD", "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipMovCc", AV12TipMovCc);
      AV14Precio = AV11PrdPreAct ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
      /* Using cursor H01RQ2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = H01RQ2_A719PrdNum[0] ;
         A396EmprCod = H01RQ2_A396EmprCod[0] ;
         A10881PrdLote = H01RQ2_A10881PrdLote[0] ;
         AV24PrdLote = A10881PrdLote ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24PrdLote", AV24PrdLote);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_char5 = AV31Station ;
      GXv_char6[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      devolucionporproducto_wc_impl.this.GXt_char5 = GXv_char6[0] ;
      AV31Station = GXt_char5 ;
      GXv_char6[0] = AV5Emprcod ;
      GXv_char7[0] = AV32Emprnom ;
      GXv_char8[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char6, GXv_char7, GXv_char8) ;
      devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char6[0] ;
      devolucionporproducto_wc_impl.this.AV32Emprnom = GXv_char7[0] ;
      devolucionporproducto_wc_impl.this.AV20UsurCod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20UsurCod", AV20UsurCod);
   }

   public void e131RQ2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV13Cantidad)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad NO Valida", ""));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14Precio)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay Precio¡", ""));
         }
         else
         {
            if ( DecimalUtil.compareTo(AV13Cantidad, AV10PrdExiALm) > 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad ", "")+GXutil.trim( GXutil.str( AV13Cantidad, 12, 4))+httpContext.getMessage( " superior Existencias ", "")+GXutil.trim( GXutil.str( AV10PrdExiALm, 12, 4)));
            }
            else
            {
               GXv_char8[0] = AV25var_Ok ;
               new app.plotectrl(remoteHandle, context).execute( AV5Emprcod, AV6Prdnum, AV24PrdLote, GXv_char8) ;
               devolucionporproducto_wc_impl.this.AV25var_Ok = GXv_char8[0] ;
               if ( ( AV26moda21 == 1 ) && ! (GXutil.strcmp("", AV24PrdLote)==0) && ( GXutil.strcmp(AV25var_Ok, "N") == 0 ) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe LOTE ¡¡¡", ""));
                  GX_FocusControl = edtavPrdlote_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
               }
            }
         }
      }
   }

   public void e111RQ2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavTipmovcc.setValue( GXutil.rtrim( AV12TipMovCc) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavTipmovcc.getInternalname(), "Values", cmbavTipmovcc.ToJavascriptSource(), true);
   }

   public void e141RQ2( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5Emprcod,AV6Prdnum,AV8PrdNom,Integer.valueOf(AV7PrvNum),AV9PrvNom,AV10PrdExiALm,AV11PrdPreAct});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6Prdnum","AV8PrdNom","AV7PrvNum","AV9PrvNom","AV10PrdExiALm","AV11PrdPreAct"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      GXv_int4[0] = AV15NumDev ;
      new app.pnumdoc(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "DEVALM", ""), GXv_int4) ;
      devolucionporproducto_wc_impl.this.AV15NumDev = (short)((short)(GXv_int4[0])) ;
      AV16AlbDev = GXutil.ltrim( GXutil.str( AV15NumDev, 8, 0)) ;
      AV17Fecha = GXutil.today( ) ;
      AV18ExiReaAlm = AV10PrdExiALm.subtract(AV13Cantidad) ;
      GXv_char8[0] = AV5Emprcod ;
      GXv_char7[0] = AV6Prdnum ;
      GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal10[0] = AV18ExiReaAlm ;
      GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
      GXv_int12[0] = (short)(0) ;
      new app.pmodex3(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_int12) ;
      devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char8[0] ;
      devolucionporproducto_wc_impl.this.AV6Prdnum = GXv_char7[0] ;
      devolucionporproducto_wc_impl.this.AV18ExiReaAlm = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      GXv_char8[0] = AV5Emprcod ;
      GXv_char7[0] = AV6Prdnum ;
      GXv_decimal11[0] = AV13Cantidad ;
      GXv_date13[0] = AV17Fecha ;
      new app.pmodrem(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal11, GXv_date13) ;
      devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char8[0] ;
      devolucionporproducto_wc_impl.this.AV6Prdnum = GXv_char7[0] ;
      devolucionporproducto_wc_impl.this.AV13Cantidad = GXv_decimal11[0] ;
      devolucionporproducto_wc_impl.this.AV17Fecha = GXv_date13[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
      AV19Texto_dv = ((GXutil.strcmp(AV12TipMovCc, "SD")==0) ? httpContext.getMessage( "Devolucion Almacen", "") : httpContext.getMessage( "Devolucion Prestamo", "")) ;
      GXv_char8[0] = AV5Emprcod ;
      GXv_char7[0] = AV6Prdnum ;
      GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal10[0] = AV13Cantidad ;
      GXv_char6[0] = AV12TipMovCc ;
      GXv_char14[0] = "1" ;
      GXv_decimal9[0] = AV14Precio ;
      GXv_int4[0] = 0 ;
      GXv_int2[0] = (byte)(0) ;
      GXv_char15[0] = " " ;
      GXv_int16[0] = 0 ;
      GXv_char17[0] = AV16AlbDev ;
      GXv_char18[0] = AV20UsurCod ;
      GXv_char19[0] = AV19Texto_dv ;
      GXv_int12[0] = (short)(0) ;
      GXv_decimal20[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
      GXv_date13[0] = AV17Fecha ;
      GXv_int22[0] = AV7PrvNum ;
      GXv_char23[0] = AV24PrdLote ;
      new app.devolucionconlote(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal11, GXv_decimal10, GXv_char6, GXv_char14, GXv_decimal9, GXv_int4, GXv_int2, GXv_char15, GXv_int16, GXv_char17, GXv_char18, GXv_char19, GXv_int12, GXv_decimal20, GXv_decimal21, GXv_date13, GXv_int22, GXv_char23) ;
      devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char8[0] ;
      devolucionporproducto_wc_impl.this.AV6Prdnum = GXv_char7[0] ;
      devolucionporproducto_wc_impl.this.AV13Cantidad = GXv_decimal10[0] ;
      devolucionporproducto_wc_impl.this.AV12TipMovCc = GXv_char6[0] ;
      devolucionporproducto_wc_impl.this.AV14Precio = GXv_decimal9[0] ;
      devolucionporproducto_wc_impl.this.AV16AlbDev = GXv_char17[0] ;
      devolucionporproducto_wc_impl.this.AV20UsurCod = GXv_char18[0] ;
      devolucionporproducto_wc_impl.this.AV19Texto_dv = GXv_char19[0] ;
      devolucionporproducto_wc_impl.this.AV17Fecha = GXv_date13[0] ;
      devolucionporproducto_wc_impl.this.AV7PrvNum = GXv_int22[0] ;
      devolucionporproducto_wc_impl.this.AV24PrdLote = GXv_char23[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12TipMovCc", AV12TipMovCc);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20UsurCod", AV20UsurCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24PrdLote", AV24PrdLote);
      GXv_char23[0] = AV5Emprcod ;
      GXv_int22[0] = AV7PrvNum ;
      GXv_date13[0] = AV17Fecha ;
      GXv_int16[0] = 0 ;
      GXv_decimal21[0] = AV13Cantidad ;
      GXv_decimal20[0] = AV14Precio ;
      GXv_char19[0] = "1" ;
      new app.pacespr(remoteHandle, context).execute( GXv_char23, GXv_int22, GXv_date13, GXv_int16, GXv_decimal21, GXv_decimal20, GXv_char19) ;
      devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char23[0] ;
      devolucionporproducto_wc_impl.this.AV7PrvNum = GXv_int22[0] ;
      devolucionporproducto_wc_impl.this.AV17Fecha = GXv_date13[0] ;
      devolucionporproducto_wc_impl.this.AV13Cantidad = GXv_decimal21[0] ;
      devolucionporproducto_wc_impl.this.AV14Precio = GXv_decimal20[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
      GXv_char23[0] = AV5Emprcod ;
      GXv_int22[0] = AV7PrvNum ;
      GXv_char19[0] = AV6Prdnum ;
      GXv_char18[0] = AV8PrdNom ;
      GXv_date13[0] = AV17Fecha ;
      GXv_int16[0] = 0 ;
      GXv_decimal21[0] = AV13Cantidad ;
      GXv_decimal20[0] = AV14Precio ;
      GXv_char17[0] = "1" ;
      new app.pacesprx(remoteHandle, context).execute( GXv_char23, GXv_int22, GXv_char19, GXv_char18, GXv_date13, GXv_int16, GXv_decimal21, GXv_decimal20, GXv_char17) ;
      devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char23[0] ;
      devolucionporproducto_wc_impl.this.AV7PrvNum = GXv_int22[0] ;
      devolucionporproducto_wc_impl.this.AV6Prdnum = GXv_char19[0] ;
      devolucionporproducto_wc_impl.this.AV8PrdNom = GXv_char18[0] ;
      devolucionporproducto_wc_impl.this.AV17Fecha = GXv_date13[0] ;
      devolucionporproducto_wc_impl.this.AV13Cantidad = GXv_decimal21[0] ;
      devolucionporproducto_wc_impl.this.AV14Precio = GXv_decimal20[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNom", AV8PrdNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
      GXv_char23[0] = AV5Emprcod ;
      GXv_char19[0] = AV6Prdnum ;
      GXv_date13[0] = AV17Fecha ;
      GXv_decimal21[0] = AV13Cantidad ;
      GXv_decimal20[0] = AV14Precio ;
      new app.pacespd(remoteHandle, context).execute( GXv_char23, GXv_char19, GXv_date13, GXv_decimal21, GXv_decimal20) ;
      devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char23[0] ;
      devolucionporproducto_wc_impl.this.AV6Prdnum = GXv_char19[0] ;
      devolucionporproducto_wc_impl.this.AV17Fecha = GXv_date13[0] ;
      devolucionporproducto_wc_impl.this.AV13Cantidad = GXv_decimal21[0] ;
      devolucionporproducto_wc_impl.this.AV14Precio = GXv_decimal20[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
      if ( AV21Val_stk == 0 )
      {
         GXv_char23[0] = AV5Emprcod ;
         GXv_char19[0] = AV6Prdnum ;
         new app.pstm017(remoteHandle, context).execute( GXv_char23, GXv_char19) ;
         devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char23[0] ;
         devolucionporproducto_wc_impl.this.AV6Prdnum = GXv_char19[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      }
      else
      {
         GXv_char23[0] = AV5Emprcod ;
         GXv_char19[0] = AV6Prdnum ;
         GXv_decimal21[0] = AV13Cantidad ;
         GXv_decimal20[0] = AV14Precio ;
         new app.pvalstk(remoteHandle, context).execute( GXv_char23, GXv_char19, GXv_decimal21, GXv_decimal20) ;
         devolucionporproducto_wc_impl.this.AV5Emprcod = GXv_char23[0] ;
         devolucionporproducto_wc_impl.this.AV6Prdnum = GXv_char19[0] ;
         devolucionporproducto_wc_impl.this.AV13Cantidad = GXv_decimal21[0] ;
         devolucionporproducto_wc_impl.this.AV14Precio = GXv_decimal20[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cantidad", GXutil.ltrimstr( AV13Cantidad, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Precio", GXutil.ltrimstr( AV14Precio, 14, 5));
      }
      httpContext.popup(formatLink("app.webwprndev", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV16AlbDev))}, new String[] {"EmprCod","AlbCod"}) , new Object[] {"AV5Emprcod","AV16AlbDev"});
      httpContext.setWebReturnParms(new Object[] {AV5Emprcod,AV6Prdnum,AV8PrdNom,Integer.valueOf(AV7PrvNum),AV9PrvNom,AV10PrdExiALm,AV11PrdPreAct});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6Prdnum","AV8PrdNom","AV7PrvNum","AV9PrvNom","AV10PrdExiALm","AV11PrdPreAct"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e151RQ2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_94_1RQ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_94_1RQ2e( true) ;
      }
      else
      {
         wb_table2_94_1RQ2e( false) ;
      }
   }

   public void wb_table1_74_1RQ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedprdlote_Internalname, tblTablemergedprdlote_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdlote_Internalname, httpContext.getMessage( "Lote", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdlote_Internalname, GXutil.rtrim( AV24PrdLote), GXutil.rtrim( localUtil.format( AV24PrdLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdlote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdlote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_prdlote_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_prdlote_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_prdlote_Internalname, sImgUrl, imgPrompt_prdlote_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_StocksQuimicos\\DevolucionporProducto_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_74_1RQ2e( true) ;
      }
      else
      {
         wb_table1_74_1RQ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      AV8PrdNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNom", AV8PrdNom);
      AV7PrvNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
      AV9PrvNom = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNom", AV9PrvNom);
      AV10PrdExiALm = (java.math.BigDecimal)getParm(obj,5,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrdExiALm", GXutil.ltrimstr( AV10PrdExiALm, 12, 4));
      AV11PrdPreAct = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdPreAct", GXutil.ltrimstr( AV11PrdPreAct, 14, 5));
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
      pa1RQ2( ) ;
      ws1RQ2( ) ;
      we1RQ2( ) ;
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
      sCtrlAV6Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8PrdNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7PrvNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9PrvNom = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10PrdExiALm = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11PrdPreAct = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1RQ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\devolucionporproducto_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1RQ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Prdnum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
         AV8PrdNom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNom", AV8PrdNom);
         AV7PrvNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
         AV9PrvNom = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNom", AV9PrvNom);
         AV10PrdExiALm = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrdExiALm", GXutil.ltrimstr( AV10PrdExiALm, 12, 4));
         AV11PrdPreAct = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdPreAct", GXutil.ltrimstr( AV11PrdPreAct, 14, 5));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV6Prdnum") ;
      wcpOAV8PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV8PrdNom") ;
      wcpOAV7PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9PrvNom = httpContext.cgiGet( sPrefix+"wcpOAV9PrvNom") ;
      wcpOAV10PrdExiALm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV10PrdExiALm")) ;
      wcpOAV11PrdPreAct = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV11PrdPreAct")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV6Prdnum, wcpOAV6Prdnum) != 0 ) || ( GXutil.strcmp(AV8PrdNom, wcpOAV8PrdNom) != 0 ) || ( AV7PrvNum != wcpOAV7PrvNum ) || ( GXutil.strcmp(AV9PrvNom, wcpOAV9PrvNom) != 0 ) || ( DecimalUtil.compareTo(AV10PrdExiALm, wcpOAV10PrdExiALm) != 0 ) || ( DecimalUtil.compareTo(AV11PrdPreAct, wcpOAV11PrdPreAct) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Prdnum = AV6Prdnum ;
      wcpOAV8PrdNom = AV8PrdNom ;
      wcpOAV7PrvNum = AV7PrvNum ;
      wcpOAV9PrvNom = AV9PrvNom ;
      wcpOAV10PrdExiALm = AV10PrdExiALm ;
      wcpOAV11PrdPreAct = AV11PrdPreAct ;
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
      sCtrlAV6Prdnum = httpContext.cgiGet( sPrefix+"AV6Prdnum_CTRL") ;
      if ( GXutil.len( sCtrlAV6Prdnum) > 0 )
      {
         AV6Prdnum = httpContext.cgiGet( sCtrlAV6Prdnum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      }
      else
      {
         AV6Prdnum = httpContext.cgiGet( sPrefix+"AV6Prdnum_PARM") ;
      }
      sCtrlAV8PrdNom = httpContext.cgiGet( sPrefix+"AV8PrdNom_CTRL") ;
      if ( GXutil.len( sCtrlAV8PrdNom) > 0 )
      {
         AV8PrdNom = httpContext.cgiGet( sCtrlAV8PrdNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNom", AV8PrdNom);
      }
      else
      {
         AV8PrdNom = httpContext.cgiGet( sPrefix+"AV8PrdNom_PARM") ;
      }
      sCtrlAV7PrvNum = httpContext.cgiGet( sPrefix+"AV7PrvNum_CTRL") ;
      if ( GXutil.len( sCtrlAV7PrvNum) > 0 )
      {
         AV7PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7PrvNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PrvNum), 6, 0));
      }
      else
      {
         AV7PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7PrvNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9PrvNom = httpContext.cgiGet( sPrefix+"AV9PrvNom_CTRL") ;
      if ( GXutil.len( sCtrlAV9PrvNom) > 0 )
      {
         AV9PrvNom = httpContext.cgiGet( sCtrlAV9PrvNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNom", AV9PrvNom);
      }
      else
      {
         AV9PrvNom = httpContext.cgiGet( sPrefix+"AV9PrvNom_PARM") ;
      }
      sCtrlAV10PrdExiALm = httpContext.cgiGet( sPrefix+"AV10PrdExiALm_CTRL") ;
      if ( GXutil.len( sCtrlAV10PrdExiALm) > 0 )
      {
         AV10PrdExiALm = localUtil.ctond( httpContext.cgiGet( sCtrlAV10PrdExiALm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrdExiALm", GXutil.ltrimstr( AV10PrdExiALm, 12, 4));
      }
      else
      {
         AV10PrdExiALm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV10PrdExiALm_PARM")) ;
      }
      sCtrlAV11PrdPreAct = httpContext.cgiGet( sPrefix+"AV11PrdPreAct_CTRL") ;
      if ( GXutil.len( sCtrlAV11PrdPreAct) > 0 )
      {
         AV11PrdPreAct = localUtil.ctond( httpContext.cgiGet( sCtrlAV11PrdPreAct)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdPreAct", GXutil.ltrimstr( AV11PrdPreAct, 14, 5));
      }
      else
      {
         AV11PrdPreAct = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV11PrdPreAct_PARM")) ;
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
      pa1RQ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1RQ2( ) ;
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
      ws1RQ2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Prdnum_PARM", GXutil.rtrim( AV6Prdnum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Prdnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Prdnum_CTRL", GXutil.rtrim( sCtrlAV6Prdnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdNom_PARM", GXutil.rtrim( AV8PrdNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8PrdNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdNom_CTRL", GXutil.rtrim( sCtrlAV8PrdNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( AV7PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrvNum_CTRL", GXutil.rtrim( sCtrlAV7PrvNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrvNom_PARM", GXutil.rtrim( AV9PrvNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9PrvNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrvNom_CTRL", GXutil.rtrim( sCtrlAV9PrvNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10PrdExiALm_PARM", GXutil.ltrim( localUtil.ntoc( AV10PrdExiALm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10PrdExiALm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10PrdExiALm_CTRL", GXutil.rtrim( sCtrlAV10PrdExiALm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11PrdPreAct_PARM", GXutil.ltrim( localUtil.ntoc( AV11PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11PrdPreAct)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11PrdPreAct_CTRL", GXutil.rtrim( sCtrlAV11PrdPreAct));
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
      we1RQ2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266302053340", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/devolucionporproducto_wc.js", "?20266302053340", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM" ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM" ;
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM" ;
      edtavPrvnum_Internalname = sPrefix+"vPRVNUM" ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      cmbavTipmovcc.setInternalname( sPrefix+"vTIPMOVCC" );
      edtavCantidad_Internalname = sPrefix+"vCANTIDAD" ;
      edtavPrecio_Internalname = sPrefix+"vPRECIO" ;
      lblTextblockprdlote_Internalname = sPrefix+"TEXTBLOCKPRDLOTE" ;
      edtavPrdlote_Internalname = sPrefix+"vPRDLOTE" ;
      imgPrompt_prdlote_Internalname = sPrefix+"PROMPT_PRDLOTE" ;
      tblTablemergedprdlote_Internalname = sPrefix+"TABLEMERGEDPRDLOTE" ;
      divTablesplittedprdlote_Internalname = sPrefix+"TABLESPLITTEDPRDLOTE" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      imgPrompt_prdlote_Link = "" ;
      edtavPrdlote_Jsonclick = "" ;
      edtavPrdlote_Enabled = 1 ;
      edtavPrecio_Jsonclick = "" ;
      edtavPrecio_Enabled = 1 ;
      edtavCantidad_Jsonclick = "" ;
      edtavCantidad_Enabled = 1 ;
      cmbavTipmovcc.setJsonclick( "" );
      cmbavTipmovcc.setEnabled( 1 );
      edtavPrvnom_Jsonclick = "" ;
      edtavPrvnom_Enabled = 0 ;
      edtavPrvnum_Jsonclick = "" ;
      edtavPrvnum_Enabled = 0 ;
      edtavPrdexialm_Jsonclick = "" ;
      edtavPrdexialm_Enabled = 0 ;
      edtavPrdnom_Jsonclick = "" ;
      edtavPrdnom_Enabled = 0 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = "" ;
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
      cmbavTipmovcc.setName( "vTIPMOVCC" );
      cmbavTipmovcc.setWebtags( "" );
      cmbavTipmovcc.addItem("SD", httpContext.getMessage( "Devolucion Proveedor", ""), (short)(0));
      cmbavTipmovcc.addItem("SP", httpContext.getMessage( "Devolucion Prestamo", ""), (short)(0));
      if ( cmbavTipmovcc.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV26moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV21Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e131RQ2',iparms:[{av:'AV13Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZ9.9999'},{av:'AV14Precio',fld:'vPRECIO',pic:'ZZZZZZZ9.999'},{av:'AV10PrdExiALm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV24PrdLote',fld:'vPRDLOTE',pic:''},{av:'AV26moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e111RQ2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10PrdExiALm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV13Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZ9.9999'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'cmbavTipmovcc'},{av:'AV12TipMovCc',fld:'vTIPMOVCC',pic:''},{av:'AV14Precio',fld:'vPRECIO',pic:'ZZZZZZZ9.999'},{av:'AV20UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV7PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV24PrdLote',fld:'vPRDLOTE',pic:''},{av:'AV8PrdNom',fld:'vPRDNOM',pic:''},{av:'AV21Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'AV11PrdPreAct',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV9PrvNom',fld:'vPRVNOM',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZ9.9999'},{av:'AV24PrdLote',fld:'vPRDLOTE',pic:''},{av:'AV7PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV20UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV14Precio',fld:'vPRECIO',pic:'ZZZZZZZ9.999'},{av:'cmbavTipmovcc'},{av:'AV12TipMovCc',fld:'vTIPMOVCC',pic:''},{av:'AV8PrdNom',fld:'vPRDNOM',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e141RQ2',iparms:[{av:'AV11PrdPreAct',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV10PrdExiALm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV9PrvNom',fld:'vPRVNOM',pic:''},{av:'AV7PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV8PrdNom',fld:'vPRDNOM',pic:''},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[]}");
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
      wcpOAV6Prdnum = "" ;
      wcpOAV8PrdNom = "" ;
      wcpOAV9PrvNom = "" ;
      wcpOAV10PrdExiALm = DecimalUtil.ZERO ;
      wcpOAV11PrdPreAct = DecimalUtil.ZERO ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV6Prdnum = "" ;
      AV8PrdNom = "" ;
      AV9PrvNom = "" ;
      AV10PrdExiALm = DecimalUtil.ZERO ;
      AV11PrdPreAct = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV20UsurCod = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV29Pgmname = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV12TipMovCc = "" ;
      AV13Cantidad = DecimalUtil.ZERO ;
      AV14Precio = DecimalUtil.ZERO ;
      lblTextblockprdlote_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV24PrdLote = "" ;
      scmdbuf = "" ;
      H01RQ2_A719PrdNum = new String[] {""} ;
      H01RQ2_A396EmprCod = new String[] {""} ;
      H01RQ2_A10881PrdLote = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A10881PrdLote = "" ;
      AV31Station = "" ;
      GXt_char5 = "" ;
      AV32Emprnom = "" ;
      AV25var_Ok = "" ;
      AV16AlbDev = "" ;
      AV17Fecha = GXutil.nullDate() ;
      AV18ExiReaAlm = DecimalUtil.ZERO ;
      AV19Texto_dv = "" ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char6 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_int22 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_char17 = new String[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_char23 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      imgPrompt_prdlote_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Prdnum = "" ;
      sCtrlAV8PrdNom = "" ;
      sCtrlAV7PrvNum = "" ;
      sCtrlAV9PrvNom = "" ;
      sCtrlAV10PrdExiALm = "" ;
      sCtrlAV11PrdPreAct = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.devolucionporproducto_wc__default(),
         new Object[] {
             new Object[] {
            H01RQ2_A719PrdNum, H01RQ2_A396EmprCod, H01RQ2_A10881PrdLote
            }
         }
      );
      AV29Pgmname = "StocksQuimicos.DevolucionporProducto_WC" ;
      /* GeneXus formulas. */
      AV29Pgmname = "StocksQuimicos.DevolucionporProducto_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV26moda21 ;
   private short AV21Val_stk ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV22Precio_stk ;
   private short AV23FlagCcs ;
   private short AV15NumDev ;
   private short GXv_int12[] ;
   private int wcpOAV7PrvNum ;
   private int AV7PrvNum ;
   private int edtavPgmname_Enabled ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdnom_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavPrvnum_Enabled ;
   private int edtavPrvnom_Enabled ;
   private int edtavCantidad_Enabled ;
   private int edtavPrecio_Enabled ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int GXv_int22[] ;
   private int GXv_int16[] ;
   private int edtavPrdlote_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV10PrdExiALm ;
   private java.math.BigDecimal wcpOAV11PrdPreAct ;
   private java.math.BigDecimal AV10PrdExiALm ;
   private java.math.BigDecimal AV11PrdPreAct ;
   private java.math.BigDecimal AV13Cantidad ;
   private java.math.BigDecimal AV14Precio ;
   private java.math.BigDecimal AV18ExiReaAlm ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6Prdnum ;
   private String wcpOAV8PrdNom ;
   private String wcpOAV9PrvNom ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV6Prdnum ;
   private String AV8PrdNom ;
   private String AV9PrvNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV20UsurCod ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavPrdnum_Internalname ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdnom_Internalname ;
   private String edtavPrdnom_Jsonclick ;
   private String edtavPrdexialm_Internalname ;
   private String edtavPrdexialm_Jsonclick ;
   private String edtavPrvnum_Internalname ;
   private String edtavPrvnum_Jsonclick ;
   private String edtavPrvnom_Internalname ;
   private String edtavPrvnom_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String TempTags ;
   private String AV12TipMovCc ;
   private String edtavCantidad_Internalname ;
   private String edtavCantidad_Jsonclick ;
   private String edtavPrecio_Internalname ;
   private String edtavPrecio_Jsonclick ;
   private String divTablesplittedprdlote_Internalname ;
   private String lblTextblockprdlote_Internalname ;
   private String lblTextblockprdlote_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV24PrdLote ;
   private String edtavPrdlote_Internalname ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A10881PrdLote ;
   private String AV31Station ;
   private String GXt_char5 ;
   private String AV32Emprnom ;
   private String AV25var_Ok ;
   private String AV16AlbDev ;
   private String AV19Texto_dv ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char23[] ;
   private String GXv_char19[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablemergedprdlote_Internalname ;
   private String edtavPrdlote_Jsonclick ;
   private String imgPrompt_prdlote_gximage ;
   private String sImgUrl ;
   private String imgPrompt_prdlote_Internalname ;
   private String imgPrompt_prdlote_Link ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Prdnum ;
   private String sCtrlAV8PrdNom ;
   private String sCtrlAV7PrvNum ;
   private String sCtrlAV9PrvNom ;
   private String sCtrlAV10PrdExiALm ;
   private String sCtrlAV11PrdPreAct ;
   private java.util.Date AV17Fecha ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
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
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private HTMLChoice cmbavTipmovcc ;
   private IDataStoreProvider pr_default ;
   private String[] H01RQ2_A719PrdNum ;
   private String[] H01RQ2_A396EmprCod ;
   private String[] H01RQ2_A10881PrdLote ;
}

final  class devolucionporproducto_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01RQ2", "SELECT PrdNum, EmprCod, PrdLote FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
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

