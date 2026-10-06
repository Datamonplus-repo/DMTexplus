package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasprogeneral_impl extends GXWebComponent
{
   public tfasprogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfasprogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasprogeneral_impl.class ));
   }

   public tfasprogeneral_impl( int remoteHandle ,
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
      cmbFasActTin = new HTMLChoice();
      cmbFasCon = new HTMLChoice();
      cmbFasAcab = new HTMLChoice();
      cmbFasForMul = new HTMLChoice();
      cmbFasConPla = new HTMLChoice();
      cmbFasObl = new HTMLChoice();
      cmbFasTip = new HTMLChoice();
      cmbFasGral = new HTMLChoice();
      cmbFasPesInt = new HTMLChoice();
      cmbFasPesExp = new HTMLChoice();
      chkFasOpeIns = UIFactory.getCheckbox(this);
      chkFasCarda = UIFactory.getCheckbox(this);
      cmbFasH2OReh = new HTMLChoice();
      cmbFasEstamp = new HTMLChoice();
      chkFasPreObl = UIFactory.getCheckbox(this);
      chkFasNorma = UIFactory.getCheckbox(this);
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
               A457FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A457FasCod", A457FasCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,A457FasCod});
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
         pa7P2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TFASPROGeneral", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tfasprogeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","FasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TFASPROGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfasprogeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA457FasCod", GXutil.rtrim( wcpOA457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Width", GXutil.rtrim( Dvpanel_unnamedtable10_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable10_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable10_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Cls", GXutil.rtrim( Dvpanel_unnamedtable10_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Title", GXutil.rtrim( Dvpanel_unnamedtable10_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable10_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable10_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable10_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Width", GXutil.rtrim( Dvpanel_unnamedtable11_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable11_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable11_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Cls", GXutil.rtrim( Dvpanel_unnamedtable11_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Title", GXutil.rtrim( Dvpanel_unnamedtable11_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable11_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable11_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE11_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable11_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
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
   }

   public void renderHtmlCloseForm7P2( )
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
      return "TFASPROGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TFASPROGeneral", "") ;
   }

   public void wb7P0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tfasprogeneral");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtFasDsc_Link, "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Maquina", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasSigla_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasSigla_Internalname, httpContext.getMessage( "Siglas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasSigla_Internalname, GXutil.rtrim( A7070FasSigla), GXutil.rtrim( localUtil.format( A7070FasSigla, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasSigla_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasSigla_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable10.setProperty("Width", Dvpanel_unnamedtable10_Width);
         ucDvpanel_unnamedtable10.setProperty("AutoWidth", Dvpanel_unnamedtable10_Autowidth);
         ucDvpanel_unnamedtable10.setProperty("AutoHeight", Dvpanel_unnamedtable10_Autoheight);
         ucDvpanel_unnamedtable10.setProperty("Cls", Dvpanel_unnamedtable10_Cls);
         ucDvpanel_unnamedtable10.setProperty("Title", Dvpanel_unnamedtable10_Title);
         ucDvpanel_unnamedtable10.setProperty("Collapsible", Dvpanel_unnamedtable10_Collapsible);
         ucDvpanel_unnamedtable10.setProperty("Collapsed", Dvpanel_unnamedtable10_Collapsed);
         ucDvpanel_unnamedtable10.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable10_Showcollapseicon);
         ucDvpanel_unnamedtable10.setProperty("IconPosition", Dvpanel_unnamedtable10_Iconposition);
         ucDvpanel_unnamedtable10.setProperty("AutoScroll", Dvpanel_unnamedtable10_Autoscroll);
         ucDvpanel_unnamedtable10.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable10_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE10Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE10Container"+"UnnamedTable10"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasDec_Internalname, httpContext.getMessage( "Decalage", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDec_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDec2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasDec2_Internalname, httpContext.getMessage( "Decalage (Formato decimal)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasDec2_Internalname, GXutil.ltrim( localUtil.ntoc( A5990FasDec2, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasDec2_Enabled!=0) ? localUtil.format( A5990FasDec2, "ZZZ9.99") : localUtil.format( A5990FasDec2, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDec2_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreSal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasPreSal_Internalname, httpContext.getMessage( "Tiempo preparacion y salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasPreSal_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPrePie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasPrePie_Internalname, httpContext.getMessage( "Tiempo preparacion p/pieza", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPrePie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasPrePie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasVelPro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasVelPro_Internalname, httpContext.getMessage( "Velocidad (mts/m)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasVelPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasVelPro_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasNumPas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasNumPas_Internalname, httpContext.getMessage( "Nº Pases", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasNumPas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasNumPas_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
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
         ucDvpanel_unnamedtable11.setProperty("Width", Dvpanel_unnamedtable11_Width);
         ucDvpanel_unnamedtable11.setProperty("AutoWidth", Dvpanel_unnamedtable11_Autowidth);
         ucDvpanel_unnamedtable11.setProperty("AutoHeight", Dvpanel_unnamedtable11_Autoheight);
         ucDvpanel_unnamedtable11.setProperty("Cls", Dvpanel_unnamedtable11_Cls);
         ucDvpanel_unnamedtable11.setProperty("Title", Dvpanel_unnamedtable11_Title);
         ucDvpanel_unnamedtable11.setProperty("Collapsible", Dvpanel_unnamedtable11_Collapsible);
         ucDvpanel_unnamedtable11.setProperty("Collapsed", Dvpanel_unnamedtable11_Collapsed);
         ucDvpanel_unnamedtable11.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable11_Showcollapseicon);
         ucDvpanel_unnamedtable11.setProperty("IconPosition", Dvpanel_unnamedtable11_Iconposition);
         ucDvpanel_unnamedtable11.setProperty("AutoScroll", Dvpanel_unnamedtable11_Autoscroll);
         ucDvpanel_unnamedtable11.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable11_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE11Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE11Container"+"UnnamedTable11"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasActTin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasActTin.getInternalname(), httpContext.getMessage( "Actualizacion Tinte", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasActTin, cmbFasActTin.getInternalname(), GXutil.rtrim( A456FasActTin), 1, cmbFasActTin.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasActTin.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasActTin.setValue( GXutil.rtrim( A456FasActTin) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasActTin.getInternalname(), "Values", cmbFasActTin.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasCon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasCon.getInternalname(), httpContext.getMessage( "Control?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasCon, cmbFasCon.getInternalname(), GXutil.rtrim( A458FasCon), 1, cmbFasCon.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasCon.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasCon.setValue( GXutil.rtrim( A458FasCon) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasCon.getInternalname(), "Values", cmbFasCon.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasAcab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasAcab.getInternalname(), httpContext.getMessage( "Acabado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasAcab, cmbFasAcab.getInternalname(), GXutil.rtrim( A4903FasAcab), 1, cmbFasAcab.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasAcab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasAcab.setValue( GXutil.rtrim( A4903FasAcab) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasAcab.getInternalname(), "Values", cmbFasAcab.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasForMul.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasForMul.getInternalname(), httpContext.getMessage( "Formula?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasForMul, cmbFasForMul.getInternalname(), GXutil.rtrim( A4286FasForMul), 1, cmbFasForMul.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasForMul.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasForMul.setValue( GXutil.rtrim( A4286FasForMul) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasForMul.getInternalname(), "Values", cmbFasForMul.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasConPla.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasConPla.getInternalname(), httpContext.getMessage( "Planning?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasConPla, cmbFasConPla.getInternalname(), GXutil.rtrim( A4299FasConPla), 1, cmbFasConPla.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasConPla.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasConPla.setValue( GXutil.rtrim( A4299FasConPla) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasConPla.getInternalname(), "Values", cmbFasConPla.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFasobl_cell_Internalname, 1, 0, "px", 0, "px", divFasobl_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbFasObl.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasObl.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasObl.getInternalname(), httpContext.getMessage( "Oblig?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasObl, cmbFasObl.getInternalname(), GXutil.rtrim( A7105FasObl), 1, cmbFasObl.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", cmbFasObl.getVisible(), cmbFasObl.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasObl.setValue( GXutil.rtrim( A7105FasObl) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasObl.getInternalname(), "Values", cmbFasObl.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         wb_table1_113_7P2( true) ;
      }
      else
      {
         wb_table1_113_7P2( false) ;
      }
      return  ;
   }

   public void wb_table1_113_7P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable4_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable4_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasEstamp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasEstamp.getInternalname(), httpContext.getMessage( "Estampacion?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasEstamp, cmbFasEstamp.getInternalname(), GXutil.rtrim( A4343FasEstamp), 1, cmbFasEstamp.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasEstamp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasEstamp.setValue( GXutil.rtrim( A4343FasEstamp) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasEstamp.getInternalname(), "Values", cmbFasEstamp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasPreMC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasPreMC_Internalname, httpContext.getMessage( "Tiempo prep Mol_Cil", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasPreMC_Internalname, GXutil.ltrim( localUtil.ntoc( A5168FasPreMC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasPreMC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5168FasPreMC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5168FasPreMC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasPreMC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasPreMC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFaspreobl_cell_Internalname, 1, 0, "px", 0, "px", divFaspreobl_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkFasPreObl.getInternalname(), httpContext.getMessage( "Precio Obligatorio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasPreObl.getInternalname(), GXutil.str( A7744FasPreObl, 1, 0), "", httpContext.getMessage( "Precio Obligatorio", ""), chkFasPreObl.getVisible(), chkFasPreObl.getEnabled(), "1", httpContext.getMessage( "Precio Obligatorio", ""), StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divFasnorma_cell_Internalname, 1, 0, "px", 0, "px", divFasnorma_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkFasNorma.getInternalname(), httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasNorma.getInternalname(), A13808FasNorma, "", httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", ""), chkFasNorma.getVisible(), chkFasNorma.getEnabled(), "S", httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", ""), StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e117p1_client"+"'", TempTags, "", 2, "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e127p1_client"+"'", TempTags, "", 2, "HLP_TFASPROGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasActiva_Internalname, GXutil.rtrim( A14042FasActiva), GXutil.rtrim( localUtil.format( A14042FasActiva, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasActiva_Jsonclick, 0, "Attribute", "", "", "", "", edtFasActiva_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start7P2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TFASPROGeneral", ""), (short)(0)) ;
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
            strup7P0( ) ;
         }
      }
   }

   public void ws7P2( )
   {
      start7P2( ) ;
      evt7P2( ) ;
   }

   public void evt7P2( )
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
                              strup7P0( ) ;
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
                              strup7P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e137P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup7P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e147P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup7P0( ) ;
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
                              strup7P0( ) ;
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

   public void we7P2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm7P2( ) ;
         }
      }
   }

   public void pa7P2( )
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
      if ( cmbFasActTin.getItemCount() > 0 )
      {
         A456FasActTin = cmbFasActTin.getValidValue(A456FasActTin) ;
         n456FasActTin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A456FasActTin", A456FasActTin);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasActTin.setValue( GXutil.rtrim( A456FasActTin) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasActTin.getInternalname(), "Values", cmbFasActTin.ToJavascriptSource(), true);
      }
      if ( cmbFasCon.getItemCount() > 0 )
      {
         A458FasCon = cmbFasCon.getValidValue(A458FasCon) ;
         n458FasCon = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A458FasCon", A458FasCon);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasCon.setValue( GXutil.rtrim( A458FasCon) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasCon.getInternalname(), "Values", cmbFasCon.ToJavascriptSource(), true);
      }
      if ( cmbFasAcab.getItemCount() > 0 )
      {
         A4903FasAcab = cmbFasAcab.getValidValue(A4903FasAcab) ;
         n4903FasAcab = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4903FasAcab", A4903FasAcab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasAcab.setValue( GXutil.rtrim( A4903FasAcab) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasAcab.getInternalname(), "Values", cmbFasAcab.ToJavascriptSource(), true);
      }
      if ( cmbFasForMul.getItemCount() > 0 )
      {
         A4286FasForMul = cmbFasForMul.getValidValue(A4286FasForMul) ;
         n4286FasForMul = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4286FasForMul", A4286FasForMul);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasForMul.setValue( GXutil.rtrim( A4286FasForMul) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasForMul.getInternalname(), "Values", cmbFasForMul.ToJavascriptSource(), true);
      }
      if ( cmbFasConPla.getItemCount() > 0 )
      {
         A4299FasConPla = cmbFasConPla.getValidValue(A4299FasConPla) ;
         n4299FasConPla = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4299FasConPla", A4299FasConPla);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasConPla.setValue( GXutil.rtrim( A4299FasConPla) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasConPla.getInternalname(), "Values", cmbFasConPla.ToJavascriptSource(), true);
      }
      if ( cmbFasObl.getItemCount() > 0 )
      {
         A7105FasObl = cmbFasObl.getValidValue(A7105FasObl) ;
         n7105FasObl = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7105FasObl", A7105FasObl);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasObl.setValue( GXutil.rtrim( A7105FasObl) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasObl.getInternalname(), "Values", cmbFasObl.ToJavascriptSource(), true);
      }
      if ( cmbFasTip.getItemCount() > 0 )
      {
         A6011FasTip = cmbFasTip.getValidValue(A6011FasTip) ;
         n6011FasTip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6011FasTip", A6011FasTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasTip.setValue( GXutil.rtrim( A6011FasTip) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasTip.getInternalname(), "Values", cmbFasTip.ToJavascriptSource(), true);
      }
      if ( cmbFasGral.getItemCount() > 0 )
      {
         A5368FasGral = cmbFasGral.getValidValue(A5368FasGral) ;
         n5368FasGral = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5368FasGral", A5368FasGral);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasGral.setValue( GXutil.rtrim( A5368FasGral) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasGral.getInternalname(), "Values", cmbFasGral.ToJavascriptSource(), true);
      }
      if ( cmbFasPesInt.getItemCount() > 0 )
      {
         A7059FasPesInt = cmbFasPesInt.getValidValue(A7059FasPesInt) ;
         n7059FasPesInt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7059FasPesInt", A7059FasPesInt);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasPesInt.setValue( GXutil.rtrim( A7059FasPesInt) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasPesInt.getInternalname(), "Values", cmbFasPesInt.ToJavascriptSource(), true);
      }
      if ( cmbFasPesExp.getItemCount() > 0 )
      {
         A8888FasPesExp = cmbFasPesExp.getValidValue(A8888FasPesExp) ;
         n8888FasPesExp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8888FasPesExp", A8888FasPesExp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasPesExp.setValue( GXutil.rtrim( A8888FasPesExp) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasPesExp.getInternalname(), "Values", cmbFasPesExp.ToJavascriptSource(), true);
      }
      A7057FasOpeIns = ((GXutil.strcmp(GXutil.rtrim( A7057FasOpeIns), "S")==0) ? "S" : "N") ;
      n7057FasOpeIns = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7057FasOpeIns", A7057FasOpeIns);
      A13809FasCarda = ((GXutil.strcmp(GXutil.rtrim( A13809FasCarda), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13809FasCarda", A13809FasCarda);
      if ( cmbFasH2OReh.getItemCount() > 0 )
      {
         A7600FasH2OReh = cmbFasH2OReh.getValidValue(A7600FasH2OReh) ;
         n7600FasH2OReh = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7600FasH2OReh", A7600FasH2OReh);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasH2OReh.setValue( GXutil.rtrim( A7600FasH2OReh) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasH2OReh.getInternalname(), "Values", cmbFasH2OReh.ToJavascriptSource(), true);
      }
      if ( cmbFasEstamp.getItemCount() > 0 )
      {
         A4343FasEstamp = cmbFasEstamp.getValidValue(A4343FasEstamp) ;
         n4343FasEstamp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4343FasEstamp", A4343FasEstamp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFasEstamp.setValue( GXutil.rtrim( A4343FasEstamp) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasEstamp.getInternalname(), "Values", cmbFasEstamp.ToJavascriptSource(), true);
      }
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      A13808FasNorma = ((GXutil.strcmp(GXutil.rtrim( A13808FasNorma), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13808FasNorma", A13808FasNorma);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf7P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "TFASPROGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf7P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H007P2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14042FasActiva = H007P2_A14042FasActiva[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14042FasActiva", A14042FasActiva);
            A13808FasNorma = H007P2_A13808FasNorma[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13808FasNorma", A13808FasNorma);
            A7744FasPreObl = H007P2_A7744FasPreObl[0] ;
            n7744FasPreObl = H007P2_n7744FasPreObl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
            A5168FasPreMC = H007P2_A5168FasPreMC[0] ;
            n5168FasPreMC = H007P2_n5168FasPreMC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5168FasPreMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5168FasPreMC), 4, 0));
            A4343FasEstamp = H007P2_A4343FasEstamp[0] ;
            n4343FasEstamp = H007P2_n4343FasEstamp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4343FasEstamp", A4343FasEstamp);
            A9838FasObsF = H007P2_A9838FasObsF[0] ;
            n9838FasObsF = H007P2_n9838FasObsF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9838FasObsF", A9838FasObsF);
            A4791FasValMtr = H007P2_A4791FasValMtr[0] ;
            n4791FasValMtr = H007P2_n4791FasValMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4791FasValMtr", GXutil.ltrimstr( A4791FasValMtr, 12, 5));
            A7600FasH2OReh = H007P2_A7600FasH2OReh[0] ;
            n7600FasH2OReh = H007P2_n7600FasH2OReh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7600FasH2OReh", A7600FasH2OReh);
            A13809FasCarda = H007P2_A13809FasCarda[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13809FasCarda", A13809FasCarda);
            A7057FasOpeIns = H007P2_A7057FasOpeIns[0] ;
            n7057FasOpeIns = H007P2_n7057FasOpeIns[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7057FasOpeIns", A7057FasOpeIns);
            A6162SecCodF = H007P2_A6162SecCodF[0] ;
            n6162SecCodF = H007P2_n6162SecCodF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6162SecCodF", A6162SecCodF);
            A8888FasPesExp = H007P2_A8888FasPesExp[0] ;
            n8888FasPesExp = H007P2_n8888FasPesExp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8888FasPesExp", A8888FasPesExp);
            A7059FasPesInt = H007P2_A7059FasPesInt[0] ;
            n7059FasPesInt = H007P2_n7059FasPesInt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7059FasPesInt", A7059FasPesInt);
            A5368FasGral = H007P2_A5368FasGral[0] ;
            n5368FasGral = H007P2_n5368FasGral[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5368FasGral", A5368FasGral);
            A6011FasTip = H007P2_A6011FasTip[0] ;
            n6011FasTip = H007P2_n6011FasTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6011FasTip", A6011FasTip);
            A7105FasObl = H007P2_A7105FasObl[0] ;
            n7105FasObl = H007P2_n7105FasObl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7105FasObl", A7105FasObl);
            A4299FasConPla = H007P2_A4299FasConPla[0] ;
            n4299FasConPla = H007P2_n4299FasConPla[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4299FasConPla", A4299FasConPla);
            A4286FasForMul = H007P2_A4286FasForMul[0] ;
            n4286FasForMul = H007P2_n4286FasForMul[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4286FasForMul", A4286FasForMul);
            A4903FasAcab = H007P2_A4903FasAcab[0] ;
            n4903FasAcab = H007P2_n4903FasAcab[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4903FasAcab", A4903FasAcab);
            A458FasCon = H007P2_A458FasCon[0] ;
            n458FasCon = H007P2_n458FasCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A458FasCon", A458FasCon);
            A456FasActTin = H007P2_A456FasActTin[0] ;
            n456FasActTin = H007P2_n456FasActTin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A456FasActTin", A456FasActTin);
            A464FasNumPas = H007P2_A464FasNumPas[0] ;
            n464FasNumPas = H007P2_n464FasNumPas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
            A472FasVelPro = H007P2_A472FasVelPro[0] ;
            n472FasVelPro = H007P2_n472FasVelPro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
            A468FasPrePie = H007P2_A468FasPrePie[0] ;
            n468FasPrePie = H007P2_n468FasPrePie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
            A469FasPreSal = H007P2_A469FasPreSal[0] ;
            n469FasPreSal = H007P2_n469FasPreSal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
            A5990FasDec2 = H007P2_A5990FasDec2[0] ;
            n5990FasDec2 = H007P2_n5990FasDec2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5990FasDec2", GXutil.ltrimstr( A5990FasDec2, 7, 2));
            A459FasDec = H007P2_A459FasDec[0] ;
            n459FasDec = H007P2_n459FasDec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
            A7070FasSigla = H007P2_A7070FasSigla[0] ;
            n7070FasSigla = H007P2_n7070FasSigla[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7070FasSigla", A7070FasSigla);
            A602MaqCod = H007P2_A602MaqCod[0] ;
            n602MaqCod = H007P2_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
            A460FasDsc = H007P2_A460FasDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A460FasDsc", A460FasDsc);
            /* Execute user event: Load */
            e147P2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb7P0( ) ;
      }
   }

   public void send_integrity_lvl_hashes7P2( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "TFASPROGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup7P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e137P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA457FasCod = httpContext.cgiGet( sPrefix+"wcpOA457FasCod") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         Dvpanel_unnamedtable10_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Width") ;
         Dvpanel_unnamedtable10_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Autowidth")) ;
         Dvpanel_unnamedtable10_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoheight")) ;
         Dvpanel_unnamedtable10_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Cls") ;
         Dvpanel_unnamedtable10_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Title") ;
         Dvpanel_unnamedtable10_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsible")) ;
         Dvpanel_unnamedtable10_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Collapsed")) ;
         Dvpanel_unnamedtable10_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Showcollapseicon")) ;
         Dvpanel_unnamedtable10_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Iconposition") ;
         Dvpanel_unnamedtable10_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE10_Autoscroll")) ;
         Dvpanel_unnamedtable11_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Width") ;
         Dvpanel_unnamedtable11_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Autowidth")) ;
         Dvpanel_unnamedtable11_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Autoheight")) ;
         Dvpanel_unnamedtable11_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Cls") ;
         Dvpanel_unnamedtable11_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Title") ;
         Dvpanel_unnamedtable11_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Collapsible")) ;
         Dvpanel_unnamedtable11_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Collapsed")) ;
         Dvpanel_unnamedtable11_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Showcollapseicon")) ;
         Dvpanel_unnamedtable11_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Iconposition") ;
         Dvpanel_unnamedtable11_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE11_Autoscroll")) ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
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
         /* Read variables values. */
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A460FasDsc", A460FasDsc);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
         A7070FasSigla = httpContext.cgiGet( edtFasSigla_Internalname) ;
         n7070FasSigla = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7070FasSigla", A7070FasSigla);
         A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
         n459FasDec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
         A5990FasDec2 = localUtil.ctond( httpContext.cgiGet( edtFasDec2_Internalname)) ;
         n5990FasDec2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5990FasDec2", GXutil.ltrimstr( A5990FasDec2, 7, 2));
         A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n469FasPreSal = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
         A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n468FasPrePie = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
         A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
         n472FasVelPro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
         A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n464FasNumPas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
         cmbFasActTin.setValue( httpContext.cgiGet( cmbFasActTin.getInternalname()) );
         A456FasActTin = httpContext.cgiGet( cmbFasActTin.getInternalname()) ;
         n456FasActTin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A456FasActTin", A456FasActTin);
         cmbFasCon.setValue( httpContext.cgiGet( cmbFasCon.getInternalname()) );
         A458FasCon = httpContext.cgiGet( cmbFasCon.getInternalname()) ;
         n458FasCon = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A458FasCon", A458FasCon);
         cmbFasAcab.setValue( httpContext.cgiGet( cmbFasAcab.getInternalname()) );
         A4903FasAcab = httpContext.cgiGet( cmbFasAcab.getInternalname()) ;
         n4903FasAcab = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4903FasAcab", A4903FasAcab);
         cmbFasForMul.setValue( httpContext.cgiGet( cmbFasForMul.getInternalname()) );
         A4286FasForMul = httpContext.cgiGet( cmbFasForMul.getInternalname()) ;
         n4286FasForMul = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4286FasForMul", A4286FasForMul);
         cmbFasConPla.setValue( httpContext.cgiGet( cmbFasConPla.getInternalname()) );
         A4299FasConPla = httpContext.cgiGet( cmbFasConPla.getInternalname()) ;
         n4299FasConPla = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4299FasConPla", A4299FasConPla);
         cmbFasObl.setValue( httpContext.cgiGet( cmbFasObl.getInternalname()) );
         A7105FasObl = httpContext.cgiGet( cmbFasObl.getInternalname()) ;
         n7105FasObl = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7105FasObl", A7105FasObl);
         cmbFasTip.setValue( httpContext.cgiGet( cmbFasTip.getInternalname()) );
         A6011FasTip = httpContext.cgiGet( cmbFasTip.getInternalname()) ;
         n6011FasTip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6011FasTip", A6011FasTip);
         cmbFasGral.setValue( httpContext.cgiGet( cmbFasGral.getInternalname()) );
         A5368FasGral = httpContext.cgiGet( cmbFasGral.getInternalname()) ;
         n5368FasGral = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5368FasGral", A5368FasGral);
         cmbFasPesInt.setValue( httpContext.cgiGet( cmbFasPesInt.getInternalname()) );
         A7059FasPesInt = httpContext.cgiGet( cmbFasPesInt.getInternalname()) ;
         n7059FasPesInt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7059FasPesInt", A7059FasPesInt);
         cmbFasPesExp.setValue( httpContext.cgiGet( cmbFasPesExp.getInternalname()) );
         A8888FasPesExp = httpContext.cgiGet( cmbFasPesExp.getInternalname()) ;
         n8888FasPesExp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8888FasPesExp", A8888FasPesExp);
         A6162SecCodF = httpContext.cgiGet( edtSecCodF_Internalname) ;
         n6162SecCodF = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6162SecCodF", A6162SecCodF);
         A7057FasOpeIns = ((GXutil.strcmp(httpContext.cgiGet( chkFasOpeIns.getInternalname()), "S")==0) ? "S" : "N") ;
         n7057FasOpeIns = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7057FasOpeIns", A7057FasOpeIns);
         A13809FasCarda = ((GXutil.strcmp(httpContext.cgiGet( chkFasCarda.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13809FasCarda", A13809FasCarda);
         cmbFasH2OReh.setValue( httpContext.cgiGet( cmbFasH2OReh.getInternalname()) );
         A7600FasH2OReh = httpContext.cgiGet( cmbFasH2OReh.getInternalname()) ;
         n7600FasH2OReh = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7600FasH2OReh", A7600FasH2OReh);
         A4791FasValMtr = localUtil.ctond( httpContext.cgiGet( edtFasValMtr_Internalname)) ;
         n4791FasValMtr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4791FasValMtr", GXutil.ltrimstr( A4791FasValMtr, 12, 5));
         A9838FasObsF = httpContext.cgiGet( edtFasObsF_Internalname) ;
         n9838FasObsF = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9838FasObsF", A9838FasObsF);
         cmbFasEstamp.setValue( httpContext.cgiGet( cmbFasEstamp.getInternalname()) );
         A4343FasEstamp = httpContext.cgiGet( cmbFasEstamp.getInternalname()) ;
         n4343FasEstamp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4343FasEstamp", A4343FasEstamp);
         A5168FasPreMC = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5168FasPreMC = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5168FasPreMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5168FasPreMC), 4, 0));
         A7744FasPreObl = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkFasPreObl.getInternalname()), "1")==0) ? 1 : 0)) ;
         n7744FasPreObl = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
         A13808FasNorma = ((GXutil.strcmp(httpContext.cgiGet( chkFasNorma.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13808FasNorma", A13808FasNorma);
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         A14042FasActiva = httpContext.cgiGet( edtFasActiva_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14042FasActiva", A14042FasActiva);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TFASPROGeneral");
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tfasprogeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e137P2 ();
      if (returnInSub) return;
   }

   public void e137P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfasprogeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfasprogeneral_impl.this.AV15Emprcod = GXv_char2[0] ;
      tfasprogeneral_impl.this.AV16Emprnom = GXv_char3[0] ;
      tfasprogeneral_impl.this.AV17Usurcod = GXv_char4[0] ;
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

   protected void e147P2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtFasDsc_Link = formatLink("app.tparfssview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","FasCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Link", edtFasDsc_Link, true);
      edtFasActiva_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasActiva_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActiva_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "CARVIT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkFasNorma.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasNorma.getInternalname(), "Visible", GXutil.ltrimstr( chkFasNorma.getVisible(), 5, 0), true);
         divFasnorma_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasnorma_cell_Internalname, "Class", divFasnorma_cell_Class, true);
      }
      else
      {
         chkFasNorma.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasNorma.getInternalname(), "Visible", GXutil.ltrimstr( chkFasNorma.getVisible(), 5, 0), true);
         divFasnorma_cell_Class = "col-xs-12 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasnorma_cell_Internalname, "Class", divFasnorma_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ARTEXT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkFasPreObl.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasPreObl.getInternalname(), "Visible", GXutil.ltrimstr( chkFasPreObl.getVisible(), 5, 0), true);
         divFaspreobl_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFaspreobl_cell_Internalname, "Class", divFaspreobl_cell_Class, true);
      }
      else
      {
         chkFasPreObl.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasPreObl.getInternalname(), "Visible", GXutil.ltrimstr( chkFasPreObl.getVisible(), 5, 0), true);
         divFaspreobl_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFaspreobl_cell_Internalname, "Class", divFaspreobl_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "JPF", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbFasH2OReh.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasH2OReh.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasH2OReh.getVisible(), 5, 0), true);
         divFash2oreh_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFash2oreh_cell_Internalname, "Class", divFash2oreh_cell_Class, true);
      }
      else
      {
         cmbFasH2OReh.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasH2OReh.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasH2OReh.getVisible(), 5, 0), true);
         divFash2oreh_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFash2oreh_cell_Internalname, "Class", divFash2oreh_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TINTTO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtFasValMtr_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasValMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasValMtr_Visible), 5, 0), true);
         divFasvalmtr_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasvalmtr_cell_Internalname, "Class", divFasvalmtr_cell_Class, true);
      }
      else
      {
         edtFasValMtr_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasValMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasValMtr_Visible), 5, 0), true);
         divFasvalmtr_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasvalmtr_cell_Internalname, "Class", divFasvalmtr_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkFasOpeIns.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasOpeIns.getInternalname(), "Visible", GXutil.ltrimstr( chkFasOpeIns.getVisible(), 5, 0), true);
         divFasopeins_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasopeins_cell_Internalname, "Class", divFasopeins_cell_Class, true);
      }
      else
      {
         chkFasOpeIns.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasOpeIns.getInternalname(), "Visible", GXutil.ltrimstr( chkFasOpeIns.getVisible(), 5, 0), true);
         divFasopeins_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasopeins_cell_Internalname, "Class", divFasopeins_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkFasCarda.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasCarda.getInternalname(), "Visible", GXutil.ltrimstr( chkFasCarda.getVisible(), 5, 0), true);
         divFascarda_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFascarda_cell_Internalname, "Class", divFascarda_cell_Class, true);
      }
      else
      {
         chkFasCarda.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasCarda.getInternalname(), "Visible", GXutil.ltrimstr( chkFasCarda.getVisible(), 5, 0), true);
         divFascarda_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFascarda_cell_Internalname, "Class", divFascarda_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TSECCI", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtSecCodF_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSecCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Visible), 5, 0), true);
         divSeccodf_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divSeccodf_cell_Internalname, "Class", divSeccodf_cell_Class, true);
      }
      else
      {
         edtSecCodF_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSecCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Visible), 5, 0), true);
         divSeccodf_cell_Class = "col-xs-12 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divSeccodf_cell_Internalname, "Class", divSeccodf_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "KGMTLC", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "MTSLEC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbFasGral.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasGral.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasGral.getVisible(), 5, 0), true);
         divFasgral_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasgral_cell_Internalname, "Class", divFasgral_cell_Class, true);
      }
      else
      {
         cmbFasGral.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasGral.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasGral.getVisible(), 5, 0), true);
         divFasgral_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasgral_cell_Internalname, "Class", divFasgral_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "FASOPC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbFasObl.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasObl.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasObl.getVisible(), 5, 0), true);
         divFasobl_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasobl_cell_Internalname, "Class", divFasobl_cell_Class, true);
      }
      else
      {
         cmbFasObl.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasObl.getInternalname(), "Visible", GXutil.ltrimstr( cmbFasObl.getVisible(), 5, 0), true);
         divFasobl_cell_Class = "col-xs-12 col-sm-1 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFasobl_cell_Internalname, "Class", divFasobl_cell_Class, true);
      }
      if ( ( edtSecCodF_Visible == ( 0 )) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divUnnamedtable6_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
      }
      if ( ( chkFasOpeIns.getVisible() == ( 0 )) && ( chkFasCarda.getVisible() == ( 0 )) )
      {
         divUnnamedtable7_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable7_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable7_Visible), 5, 0), true);
      }
      if ( ( cmbFasH2OReh.getVisible() == ( 0 )) && ( edtFasValMtr_Visible == ( 0 )) )
      {
         divUnnamedtable8_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable8_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable8_Visible), 5, 0), true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TINEST", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable4_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable4_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable4_cell_Internalname, "Class", divDvpanel_unnamedtable4_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TFASPRO" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_113_7P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasTip.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasTip.getInternalname(), httpContext.getMessage( "Salidas Rame/Sanfor?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasTip, cmbFasTip.getInternalname(), GXutil.rtrim( A6011FasTip), 1, cmbFasTip.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasTip.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasTip.setValue( GXutil.rtrim( A6011FasTip) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasTip.getInternalname(), "Values", cmbFasTip.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFasgral_cell_Internalname, 1, 0, "px", 0, "px", divFasgral_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbFasGral.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasGral.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasGral.getInternalname(), httpContext.getMessage( "Solicitar Unidades Lector?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasGral, cmbFasGral.getInternalname(), GXutil.rtrim( A5368FasGral), 1, cmbFasGral.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", cmbFasGral.getVisible(), cmbFasGral.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasGral.setValue( GXutil.rtrim( A5368FasGral) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasGral.getInternalname(), "Values", cmbFasGral.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasPesInt.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasPesInt.getInternalname(), httpContext.getMessage( "Solicitar Peso?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasPesInt, cmbFasPesInt.getInternalname(), GXutil.rtrim( A7059FasPesInt), 1, cmbFasPesInt.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasPesInt.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasPesInt.setValue( GXutil.rtrim( A7059FasPesInt) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasPesInt.getInternalname(), "Values", cmbFasPesInt.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasPesExp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasPesExp.getInternalname(), httpContext.getMessage( "Solicito Peso Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasPesExp, cmbFasPesExp.getInternalname(), GXutil.rtrim( A8888FasPesExp), 1, cmbFasPesExp.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFasPesExp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasPesExp.setValue( GXutil.rtrim( A8888FasPesExp) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasPesExp.getInternalname(), "Values", cmbFasPesExp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, divUnnamedtable6_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divSeccodf_cell_Internalname, 1, 0, "px", 0, "px", divSeccodf_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtSecCodF_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecCodF_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSecCodF_Internalname, httpContext.getMessage( "Seccion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSecCodF_Internalname, GXutil.rtrim( A6162SecCodF), GXutil.rtrim( localUtil.format( A6162SecCodF, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecCodF_Jsonclick, 0, "AttributeFL", "", "", "", "", edtSecCodF_Visible, edtSecCodF_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, divUnnamedtable7_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFasopeins_cell_Internalname, 1, 0, "px", 0, "px", divFasopeins_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkFasOpeIns.getInternalname(), httpContext.getMessage( "Imprimir Rgto Calidad?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasOpeIns.getInternalname(), A7057FasOpeIns, "", httpContext.getMessage( "Imprimir Rgto Calidad?", ""), chkFasOpeIns.getVisible(), chkFasOpeIns.getEnabled(), "S", httpContext.getMessage( "Imprimir Rgto Calidad?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFascarda_cell_Internalname, 1, 0, "px", 0, "px", divFascarda_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkFasCarda.getInternalname(), httpContext.getMessage( "Imprimir Registro Carda/E/L?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFasCarda.getInternalname(), A13809FasCarda, "", httpContext.getMessage( "Imprimir Registro Carda/E/L?", ""), chkFasCarda.getVisible(), chkFasCarda.getEnabled(), "S", httpContext.getMessage( "Imprimir Registro Carda/E/L?", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, divUnnamedtable8_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFash2oreh_cell_Internalname, 1, 0, "px", 0, "px", divFash2oreh_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbFasH2OReh.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFasH2OReh.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFasH2OReh.getInternalname(), httpContext.getMessage( "Utliza Agua Rehuso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFasH2OReh, cmbFasH2OReh.getInternalname(), GXutil.rtrim( A7600FasH2OReh), 1, cmbFasH2OReh.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", cmbFasH2OReh.getVisible(), cmbFasH2OReh.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TFASPROGeneral.htm");
         cmbFasH2OReh.setValue( GXutil.rtrim( A7600FasH2OReh) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFasH2OReh.getInternalname(), "Values", cmbFasH2OReh.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFasvalmtr_cell_Internalname, 1, 0, "px", 0, "px", divFasvalmtr_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtFasValMtr_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasValMtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasValMtr_Internalname, httpContext.getMessage( "Coste Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFasValMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4791FasValMtr, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasValMtr_Enabled!=0) ? localUtil.format( A4791FasValMtr, "ZZZZZ9.99999") : localUtil.format( A4791FasValMtr, "ZZZZZ9.99999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasValMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", edtFasValMtr_Visible, edtFasValMtr_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasObsF_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFasObsF_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtFasObsF_Internalname, A9838FasObsF, "", "", (short)(0), 1, edtFasObsF_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TFASPROGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_113_7P2e( true) ;
      }
      else
      {
         wb_table1_113_7P2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A457FasCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A457FasCod", A457FasCod);
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
      pa7P2( ) ;
      ws7P2( ) ;
      we7P2( ) ;
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
      sCtrlA457FasCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa7P2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tfasprogeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa7P2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A457FasCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A457FasCod", A457FasCod);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA457FasCod = httpContext.cgiGet( sPrefix+"wcpOA457FasCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, wcpOA457FasCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA457FasCod = A457FasCod ;
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
      sCtrlA457FasCod = httpContext.cgiGet( sPrefix+"A457FasCod_CTRL") ;
      if ( GXutil.len( sCtrlA457FasCod) > 0 )
      {
         A457FasCod = httpContext.cgiGet( sCtrlA457FasCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A457FasCod", A457FasCod);
      }
      else
      {
         A457FasCod = httpContext.cgiGet( sPrefix+"A457FasCod_PARM") ;
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
      pa7P2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws7P2( ) ;
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
      ws7P2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A457FasCod_PARM", GXutil.rtrim( A457FasCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA457FasCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A457FasCod_CTRL", GXutil.rtrim( sCtrlA457FasCod));
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
      we7P2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165842", true, true);
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
      httpContext.AddJavascriptSource("tfasprogeneral.js", "?2026821165842", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtFasSigla_Internalname = sPrefix+"FASSIGLA" ;
      divUnnamedtable13_Internalname = sPrefix+"UNNAMEDTABLE13" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      edtFasDec_Internalname = sPrefix+"FASDEC" ;
      edtFasDec2_Internalname = sPrefix+"FASDEC2" ;
      edtFasPreSal_Internalname = sPrefix+"FASPRESAL" ;
      edtFasPrePie_Internalname = sPrefix+"FASPREPIE" ;
      edtFasVelPro_Internalname = sPrefix+"FASVELPRO" ;
      edtFasNumPas_Internalname = sPrefix+"FASNUMPAS" ;
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE10" ;
      cmbFasActTin.setInternalname( sPrefix+"FASACTTIN" );
      cmbFasCon.setInternalname( sPrefix+"FASCON" );
      cmbFasAcab.setInternalname( sPrefix+"FASACAB" );
      cmbFasForMul.setInternalname( sPrefix+"FASFORMUL" );
      cmbFasConPla.setInternalname( sPrefix+"FASCONPLA" );
      cmbFasObl.setInternalname( sPrefix+"FASOBL" );
      divFasobl_cell_Internalname = sPrefix+"FASOBL_CELL" ;
      divUnnamedtable12_Internalname = sPrefix+"UNNAMEDTABLE12" ;
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      Dvpanel_unnamedtable11_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE11" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      cmbFasTip.setInternalname( sPrefix+"FASTIP" );
      cmbFasGral.setInternalname( sPrefix+"FASGRAL" );
      divFasgral_cell_Internalname = sPrefix+"FASGRAL_CELL" ;
      cmbFasPesInt.setInternalname( sPrefix+"FASPESINT" );
      cmbFasPesExp.setInternalname( sPrefix+"FASPESEXP" );
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      edtSecCodF_Internalname = sPrefix+"SECCODF" ;
      divSeccodf_cell_Internalname = sPrefix+"SECCODF_CELL" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      chkFasOpeIns.setInternalname( sPrefix+"FASOPEINS" );
      divFasopeins_cell_Internalname = sPrefix+"FASOPEINS_CELL" ;
      chkFasCarda.setInternalname( sPrefix+"FASCARDA" );
      divFascarda_cell_Internalname = sPrefix+"FASCARDA_CELL" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      cmbFasH2OReh.setInternalname( sPrefix+"FASH2OREH" );
      divFash2oreh_cell_Internalname = sPrefix+"FASH2OREH_CELL" ;
      edtFasValMtr_Internalname = sPrefix+"FASVALMTR" ;
      divFasvalmtr_cell_Internalname = sPrefix+"FASVALMTR_CELL" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      edtFasObsF_Internalname = sPrefix+"FASOBSF" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      tblUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE3" ;
      cmbFasEstamp.setInternalname( sPrefix+"FASESTAMP" );
      edtFasPreMC_Internalname = sPrefix+"FASPREMC" ;
      chkFasPreObl.setInternalname( sPrefix+"FASPREOBL" );
      divFaspreobl_cell_Internalname = sPrefix+"FASPREOBL_CELL" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      divDvpanel_unnamedtable4_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4_CELL" ;
      chkFasNorma.setInternalname( sPrefix+"FASNORMA" );
      divFasnorma_cell_Internalname = sPrefix+"FASNORMA_CELL" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtFasActiva_Internalname = sPrefix+"FASACTIVA" ;
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
      edtFasObsF_Enabled = 0 ;
      edtFasValMtr_Jsonclick = "" ;
      edtFasValMtr_Enabled = 0 ;
      cmbFasH2OReh.setJsonclick( "" );
      cmbFasH2OReh.setEnabled( 0 );
      divUnnamedtable8_Visible = 1 ;
      chkFasCarda.setEnabled( 0 );
      chkFasOpeIns.setEnabled( 0 );
      divUnnamedtable7_Visible = 1 ;
      edtSecCodF_Jsonclick = "" ;
      edtSecCodF_Enabled = 0 ;
      divUnnamedtable6_Visible = 1 ;
      cmbFasPesExp.setJsonclick( "" );
      cmbFasPesExp.setEnabled( 0 );
      cmbFasPesInt.setJsonclick( "" );
      cmbFasPesInt.setEnabled( 0 );
      cmbFasGral.setJsonclick( "" );
      cmbFasGral.setEnabled( 0 );
      cmbFasTip.setJsonclick( "" );
      cmbFasTip.setEnabled( 0 );
      divFasgral_cell_Class = "col-xs-12 col-sm-3" ;
      cmbFasGral.setVisible( 1 );
      divSeccodf_cell_Class = "col-xs-12" ;
      edtSecCodF_Visible = 1 ;
      divFascarda_cell_Class = "col-xs-12 col-sm-6" ;
      chkFasCarda.setVisible( 1 );
      divFasopeins_cell_Class = "col-xs-12 col-sm-6" ;
      chkFasOpeIns.setVisible( 1 );
      divFasvalmtr_cell_Class = "col-xs-12 col-sm-6" ;
      edtFasValMtr_Visible = 1 ;
      divFash2oreh_cell_Class = "col-xs-12 col-sm-6" ;
      cmbFasH2OReh.setVisible( 1 );
      edtFasActiva_Jsonclick = "" ;
      edtFasActiva_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      chkFasNorma.setEnabled( 0 );
      chkFasNorma.setVisible( 1 );
      divFasnorma_cell_Class = "col-xs-12" ;
      chkFasPreObl.setEnabled( 0 );
      chkFasPreObl.setVisible( 1 );
      divFaspreobl_cell_Class = "col-xs-12 col-sm-4" ;
      edtFasPreMC_Jsonclick = "" ;
      edtFasPreMC_Enabled = 0 ;
      cmbFasEstamp.setJsonclick( "" );
      cmbFasEstamp.setEnabled( 0 );
      divDvpanel_unnamedtable4_cell_Class = "col-xs-12" ;
      cmbFasObl.setJsonclick( "" );
      cmbFasObl.setEnabled( 0 );
      cmbFasObl.setVisible( 1 );
      divFasobl_cell_Class = "col-xs-12 col-sm-1" ;
      cmbFasConPla.setJsonclick( "" );
      cmbFasConPla.setEnabled( 0 );
      cmbFasForMul.setJsonclick( "" );
      cmbFasForMul.setEnabled( 0 );
      cmbFasAcab.setJsonclick( "" );
      cmbFasAcab.setEnabled( 0 );
      cmbFasCon.setJsonclick( "" );
      cmbFasCon.setEnabled( 0 );
      cmbFasActTin.setJsonclick( "" );
      cmbFasActTin.setEnabled( 0 );
      edtFasNumPas_Jsonclick = "" ;
      edtFasNumPas_Enabled = 0 ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasVelPro_Enabled = 0 ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPrePie_Enabled = 0 ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasPreSal_Enabled = 0 ;
      edtFasDec2_Jsonclick = "" ;
      edtFasDec2_Enabled = 0 ;
      edtFasDec_Jsonclick = "" ;
      edtFasDec_Enabled = 0 ;
      edtFasSigla_Jsonclick = "" ;
      edtFasSigla_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Link = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 0 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Estampacion", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Otros datos", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable11_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Iconposition = "Right" ;
      Dvpanel_unnamedtable11_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable11_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Title = httpContext.getMessage( "Mas datos", "") ;
      Dvpanel_unnamedtable11_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable11_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Width = "100%" ;
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = httpContext.getMessage( "Parametros  Calculo Tiempo Teorico", "") ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      Dvpanel_transactiondetail_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
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
      cmbFasActTin.setName( "FASACTTIN" );
      cmbFasActTin.setWebtags( "" );
      cmbFasActTin.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasActTin.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasActTin.getItemCount() > 0 )
      {
      }
      cmbFasCon.setName( "FASCON" );
      cmbFasCon.setWebtags( "" );
      cmbFasCon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasCon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasCon.getItemCount() > 0 )
      {
      }
      cmbFasAcab.setName( "FASACAB" );
      cmbFasAcab.setWebtags( "" );
      cmbFasAcab.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasAcab.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasAcab.getItemCount() > 0 )
      {
      }
      cmbFasForMul.setName( "FASFORMUL" );
      cmbFasForMul.setWebtags( "" );
      cmbFasForMul.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasForMul.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasForMul.getItemCount() > 0 )
      {
      }
      cmbFasConPla.setName( "FASCONPLA" );
      cmbFasConPla.setWebtags( "" );
      cmbFasConPla.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasConPla.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasConPla.getItemCount() > 0 )
      {
      }
      cmbFasObl.setName( "FASOBL" );
      cmbFasObl.setWebtags( "" );
      cmbFasObl.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFasObl.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFasObl.getItemCount() > 0 )
      {
      }
      cmbFasTip.setName( "FASTIP" );
      cmbFasTip.setWebtags( "" );
      cmbFasTip.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasTip.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasTip.getItemCount() > 0 )
      {
      }
      cmbFasGral.setName( "FASGRAL" );
      cmbFasGral.setWebtags( "" );
      cmbFasGral.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasGral.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasGral.getItemCount() > 0 )
      {
      }
      cmbFasPesInt.setName( "FASPESINT" );
      cmbFasPesInt.setWebtags( "" );
      cmbFasPesInt.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasPesInt.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasPesInt.getItemCount() > 0 )
      {
      }
      cmbFasPesExp.setName( "FASPESEXP" );
      cmbFasPesExp.setWebtags( "" );
      cmbFasPesExp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasPesExp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasPesExp.getItemCount() > 0 )
      {
      }
      chkFasOpeIns.setName( "FASOPEINS" );
      chkFasOpeIns.setWebtags( "" );
      chkFasOpeIns.setCaption( httpContext.getMessage( "Imprimir Rgto Calidad?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasOpeIns.getInternalname(), "TitleCaption", chkFasOpeIns.getCaption(), true);
      chkFasOpeIns.setCheckedValue( "N" );
      chkFasCarda.setName( "FASCARDA" );
      chkFasCarda.setWebtags( "" );
      chkFasCarda.setCaption( httpContext.getMessage( "Imprimir Registro Carda/E/L?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasCarda.getInternalname(), "TitleCaption", chkFasCarda.getCaption(), true);
      chkFasCarda.setCheckedValue( "N" );
      cmbFasH2OReh.setName( "FASH2OREH" );
      cmbFasH2OReh.setWebtags( "" );
      cmbFasH2OReh.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasH2OReh.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasH2OReh.getItemCount() > 0 )
      {
      }
      cmbFasEstamp.setName( "FASESTAMP" );
      cmbFasEstamp.setWebtags( "" );
      cmbFasEstamp.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbFasEstamp.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbFasEstamp.getItemCount() > 0 )
      {
      }
      chkFasPreObl.setName( "FASPREOBL" );
      chkFasPreObl.setWebtags( "" );
      chkFasPreObl.setCaption( httpContext.getMessage( "Precio Obligatorio", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasPreObl.getInternalname(), "TitleCaption", chkFasPreObl.getCaption(), true);
      chkFasPreObl.setCheckedValue( "0" );
      chkFasNorma.setName( "FASNORMA" );
      chkFasNorma.setWebtags( "" );
      chkFasNorma.setCaption( httpContext.getMessage( "Control Normas: GOTS/GRS/OCS ?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkFasNorma.getInternalname(), "TitleCaption", chkFasNorma.getCaption(), true);
      chkFasNorma.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A13808FasNorma',fld:'FASNORMA',pic:''},{av:'AV13Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e117P1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e127P1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
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
      wcpOA457FasCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13Pgmname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A7070FasSigla = "" ;
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      A459FasDec = DecimalUtil.ZERO ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable11 = new com.genexus.webpanels.GXUserControl();
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A7105FasObl = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A4343FasEstamp = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A13808FasNorma = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A14042FasActiva = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A6011FasTip = "" ;
      A5368FasGral = "" ;
      A7059FasPesInt = "" ;
      A8888FasPesExp = "" ;
      A7057FasOpeIns = "" ;
      A13809FasCarda = "" ;
      A7600FasH2OReh = "" ;
      scmdbuf = "" ;
      H007P2_A396EmprCod = new String[] {""} ;
      H007P2_A457FasCod = new String[] {""} ;
      H007P2_A14042FasActiva = new String[] {""} ;
      H007P2_A13808FasNorma = new String[] {""} ;
      H007P2_A7744FasPreObl = new byte[1] ;
      H007P2_n7744FasPreObl = new boolean[] {false} ;
      H007P2_A5168FasPreMC = new short[1] ;
      H007P2_n5168FasPreMC = new boolean[] {false} ;
      H007P2_A4343FasEstamp = new String[] {""} ;
      H007P2_n4343FasEstamp = new boolean[] {false} ;
      H007P2_A9838FasObsF = new String[] {""} ;
      H007P2_n9838FasObsF = new boolean[] {false} ;
      H007P2_A4791FasValMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007P2_n4791FasValMtr = new boolean[] {false} ;
      H007P2_A7600FasH2OReh = new String[] {""} ;
      H007P2_n7600FasH2OReh = new boolean[] {false} ;
      H007P2_A13809FasCarda = new String[] {""} ;
      H007P2_A7057FasOpeIns = new String[] {""} ;
      H007P2_n7057FasOpeIns = new boolean[] {false} ;
      H007P2_A6162SecCodF = new String[] {""} ;
      H007P2_n6162SecCodF = new boolean[] {false} ;
      H007P2_A8888FasPesExp = new String[] {""} ;
      H007P2_n8888FasPesExp = new boolean[] {false} ;
      H007P2_A7059FasPesInt = new String[] {""} ;
      H007P2_n7059FasPesInt = new boolean[] {false} ;
      H007P2_A5368FasGral = new String[] {""} ;
      H007P2_n5368FasGral = new boolean[] {false} ;
      H007P2_A6011FasTip = new String[] {""} ;
      H007P2_n6011FasTip = new boolean[] {false} ;
      H007P2_A7105FasObl = new String[] {""} ;
      H007P2_n7105FasObl = new boolean[] {false} ;
      H007P2_A4299FasConPla = new String[] {""} ;
      H007P2_n4299FasConPla = new boolean[] {false} ;
      H007P2_A4286FasForMul = new String[] {""} ;
      H007P2_n4286FasForMul = new boolean[] {false} ;
      H007P2_A4903FasAcab = new String[] {""} ;
      H007P2_n4903FasAcab = new boolean[] {false} ;
      H007P2_A458FasCon = new String[] {""} ;
      H007P2_n458FasCon = new boolean[] {false} ;
      H007P2_A456FasActTin = new String[] {""} ;
      H007P2_n456FasActTin = new boolean[] {false} ;
      H007P2_A464FasNumPas = new short[1] ;
      H007P2_n464FasNumPas = new boolean[] {false} ;
      H007P2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007P2_n472FasVelPro = new boolean[] {false} ;
      H007P2_A468FasPrePie = new short[1] ;
      H007P2_n468FasPrePie = new boolean[] {false} ;
      H007P2_A469FasPreSal = new short[1] ;
      H007P2_n469FasPreSal = new boolean[] {false} ;
      H007P2_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007P2_n5990FasDec2 = new boolean[] {false} ;
      H007P2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007P2_n459FasDec = new boolean[] {false} ;
      H007P2_A7070FasSigla = new String[] {""} ;
      H007P2_n7070FasSigla = new boolean[] {false} ;
      H007P2_A602MaqCod = new String[] {""} ;
      H007P2_n602MaqCod = new boolean[] {false} ;
      H007P2_A460FasDsc = new String[] {""} ;
      A9838FasObsF = "" ;
      A4791FasValMtr = DecimalUtil.ZERO ;
      A6162SecCodF = "" ;
      hsh = "" ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      AV15Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV16Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV17Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasprogeneral__default(),
         new Object[] {
             new Object[] {
            H007P2_A396EmprCod, H007P2_A457FasCod, H007P2_A14042FasActiva, H007P2_A13808FasNorma, H007P2_A7744FasPreObl, H007P2_n7744FasPreObl, H007P2_A5168FasPreMC, H007P2_n5168FasPreMC, H007P2_A4343FasEstamp, H007P2_n4343FasEstamp,
            H007P2_A9838FasObsF, H007P2_n9838FasObsF, H007P2_A4791FasValMtr, H007P2_n4791FasValMtr, H007P2_A7600FasH2OReh, H007P2_n7600FasH2OReh, H007P2_A13809FasCarda, H007P2_A7057FasOpeIns, H007P2_n7057FasOpeIns, H007P2_A6162SecCodF,
            H007P2_n6162SecCodF, H007P2_A8888FasPesExp, H007P2_n8888FasPesExp, H007P2_A7059FasPesInt, H007P2_n7059FasPesInt, H007P2_A5368FasGral, H007P2_n5368FasGral, H007P2_A6011FasTip, H007P2_n6011FasTip, H007P2_A7105FasObl,
            H007P2_n7105FasObl, H007P2_A4299FasConPla, H007P2_n4299FasConPla, H007P2_A4286FasForMul, H007P2_n4286FasForMul, H007P2_A4903FasAcab, H007P2_n4903FasAcab, H007P2_A458FasCon, H007P2_n458FasCon, H007P2_A456FasActTin,
            H007P2_n456FasActTin, H007P2_A464FasNumPas, H007P2_n464FasNumPas, H007P2_A472FasVelPro, H007P2_n472FasVelPro, H007P2_A468FasPrePie, H007P2_n468FasPrePie, H007P2_A469FasPreSal, H007P2_n469FasPreSal, H007P2_A5990FasDec2,
            H007P2_n5990FasDec2, H007P2_A459FasDec, H007P2_n459FasDec, H007P2_A7070FasSigla, H007P2_n7070FasSigla, H007P2_A602MaqCod, H007P2_n602MaqCod, H007P2_A460FasDsc
            }
         }
      );
      AV13Pgmname = "TFASPROGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "TFASPROGeneral" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A7744FasPreObl ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short A5168FasPreMC ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtFasSigla_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtFasDec2_Enabled ;
   private int edtFasPreSal_Enabled ;
   private int edtFasPrePie_Enabled ;
   private int edtFasVelPro_Enabled ;
   private int edtFasNumPas_Enabled ;
   private int edtFasPreMC_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtFasActiva_Visible ;
   private int edtFasValMtr_Visible ;
   private int edtSecCodF_Visible ;
   private int divUnnamedtable6_Visible ;
   private int divUnnamedtable7_Visible ;
   private int divUnnamedtable8_Visible ;
   private int edtSecCodF_Enabled ;
   private int edtFasValMtr_Enabled ;
   private int edtFasObsF_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A4791FasValMtr ;
   private String wcpOA396EmprCod ;
   private String wcpOA457FasCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV13Pgmname ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String Dvpanel_unnamedtable10_Width ;
   private String Dvpanel_unnamedtable10_Cls ;
   private String Dvpanel_unnamedtable10_Title ;
   private String Dvpanel_unnamedtable10_Iconposition ;
   private String Dvpanel_unnamedtable11_Width ;
   private String Dvpanel_unnamedtable11_Cls ;
   private String Dvpanel_unnamedtable11_Title ;
   private String Dvpanel_unnamedtable11_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Link ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasSigla_Internalname ;
   private String A7070FasSigla ;
   private String edtFasSigla_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtFasDec_Jsonclick ;
   private String edtFasDec2_Internalname ;
   private String edtFasDec2_Jsonclick ;
   private String edtFasPreSal_Internalname ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Internalname ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Internalname ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Internalname ;
   private String edtFasNumPas_Jsonclick ;
   private String Dvpanel_unnamedtable11_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String divFasobl_cell_Internalname ;
   private String divFasobl_cell_Class ;
   private String A7105FasObl ;
   private String divUnnamedtable2_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divDvpanel_unnamedtable4_cell_Internalname ;
   private String divDvpanel_unnamedtable4_cell_Class ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String A4343FasEstamp ;
   private String edtFasPreMC_Internalname ;
   private String edtFasPreMC_Jsonclick ;
   private String divFaspreobl_cell_Internalname ;
   private String divFaspreobl_cell_Class ;
   private String ClassString ;
   private String StyleString ;
   private String divFasnorma_cell_Internalname ;
   private String divFasnorma_cell_Class ;
   private String A13808FasNorma ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtFasActiva_Internalname ;
   private String A14042FasActiva ;
   private String edtFasActiva_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A6011FasTip ;
   private String A5368FasGral ;
   private String A7059FasPesInt ;
   private String A8888FasPesExp ;
   private String A7057FasOpeIns ;
   private String A13809FasCarda ;
   private String A7600FasH2OReh ;
   private String scmdbuf ;
   private String A6162SecCodF ;
   private String edtSecCodF_Internalname ;
   private String edtFasValMtr_Internalname ;
   private String edtFasObsF_Internalname ;
   private String hsh ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15Emprcod ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String divFash2oreh_cell_Class ;
   private String divFash2oreh_cell_Internalname ;
   private String divFasvalmtr_cell_Class ;
   private String divFasvalmtr_cell_Internalname ;
   private String divFasopeins_cell_Class ;
   private String divFasopeins_cell_Internalname ;
   private String divFascarda_cell_Class ;
   private String divFascarda_cell_Internalname ;
   private String divSeccodf_cell_Class ;
   private String divSeccodf_cell_Internalname ;
   private String divFasgral_cell_Class ;
   private String divFasgral_cell_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable3_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtSecCodF_Jsonclick ;
   private String edtFasValMtr_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA457FasCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable10_Autowidth ;
   private boolean Dvpanel_unnamedtable10_Autoheight ;
   private boolean Dvpanel_unnamedtable10_Collapsible ;
   private boolean Dvpanel_unnamedtable10_Collapsed ;
   private boolean Dvpanel_unnamedtable10_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable10_Autoscroll ;
   private boolean Dvpanel_unnamedtable11_Autowidth ;
   private boolean Dvpanel_unnamedtable11_Autoheight ;
   private boolean Dvpanel_unnamedtable11_Collapsible ;
   private boolean Dvpanel_unnamedtable11_Collapsed ;
   private boolean Dvpanel_unnamedtable11_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable11_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean n4299FasConPla ;
   private boolean n7105FasObl ;
   private boolean n6011FasTip ;
   private boolean n5368FasGral ;
   private boolean n7059FasPesInt ;
   private boolean n8888FasPesExp ;
   private boolean n7057FasOpeIns ;
   private boolean n7600FasH2OReh ;
   private boolean n4343FasEstamp ;
   private boolean n7744FasPreObl ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n5168FasPreMC ;
   private boolean n9838FasObsF ;
   private boolean n4791FasValMtr ;
   private boolean n6162SecCodF ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n5990FasDec2 ;
   private boolean n459FasDec ;
   private boolean n7070FasSigla ;
   private boolean n602MaqCod ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A9838FasObsF ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable11 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbFasActTin ;
   private HTMLChoice cmbFasCon ;
   private HTMLChoice cmbFasAcab ;
   private HTMLChoice cmbFasForMul ;
   private HTMLChoice cmbFasConPla ;
   private HTMLChoice cmbFasObl ;
   private HTMLChoice cmbFasTip ;
   private HTMLChoice cmbFasGral ;
   private HTMLChoice cmbFasPesInt ;
   private HTMLChoice cmbFasPesExp ;
   private ICheckbox chkFasOpeIns ;
   private ICheckbox chkFasCarda ;
   private HTMLChoice cmbFasH2OReh ;
   private HTMLChoice cmbFasEstamp ;
   private ICheckbox chkFasPreObl ;
   private ICheckbox chkFasNorma ;
   private IDataStoreProvider pr_default ;
   private String[] H007P2_A396EmprCod ;
   private String[] H007P2_A457FasCod ;
   private String[] H007P2_A14042FasActiva ;
   private String[] H007P2_A13808FasNorma ;
   private byte[] H007P2_A7744FasPreObl ;
   private boolean[] H007P2_n7744FasPreObl ;
   private short[] H007P2_A5168FasPreMC ;
   private boolean[] H007P2_n5168FasPreMC ;
   private String[] H007P2_A4343FasEstamp ;
   private boolean[] H007P2_n4343FasEstamp ;
   private String[] H007P2_A9838FasObsF ;
   private boolean[] H007P2_n9838FasObsF ;
   private java.math.BigDecimal[] H007P2_A4791FasValMtr ;
   private boolean[] H007P2_n4791FasValMtr ;
   private String[] H007P2_A7600FasH2OReh ;
   private boolean[] H007P2_n7600FasH2OReh ;
   private String[] H007P2_A13809FasCarda ;
   private String[] H007P2_A7057FasOpeIns ;
   private boolean[] H007P2_n7057FasOpeIns ;
   private String[] H007P2_A6162SecCodF ;
   private boolean[] H007P2_n6162SecCodF ;
   private String[] H007P2_A8888FasPesExp ;
   private boolean[] H007P2_n8888FasPesExp ;
   private String[] H007P2_A7059FasPesInt ;
   private boolean[] H007P2_n7059FasPesInt ;
   private String[] H007P2_A5368FasGral ;
   private boolean[] H007P2_n5368FasGral ;
   private String[] H007P2_A6011FasTip ;
   private boolean[] H007P2_n6011FasTip ;
   private String[] H007P2_A7105FasObl ;
   private boolean[] H007P2_n7105FasObl ;
   private String[] H007P2_A4299FasConPla ;
   private boolean[] H007P2_n4299FasConPla ;
   private String[] H007P2_A4286FasForMul ;
   private boolean[] H007P2_n4286FasForMul ;
   private String[] H007P2_A4903FasAcab ;
   private boolean[] H007P2_n4903FasAcab ;
   private String[] H007P2_A458FasCon ;
   private boolean[] H007P2_n458FasCon ;
   private String[] H007P2_A456FasActTin ;
   private boolean[] H007P2_n456FasActTin ;
   private short[] H007P2_A464FasNumPas ;
   private boolean[] H007P2_n464FasNumPas ;
   private java.math.BigDecimal[] H007P2_A472FasVelPro ;
   private boolean[] H007P2_n472FasVelPro ;
   private short[] H007P2_A468FasPrePie ;
   private boolean[] H007P2_n468FasPrePie ;
   private short[] H007P2_A469FasPreSal ;
   private boolean[] H007P2_n469FasPreSal ;
   private java.math.BigDecimal[] H007P2_A5990FasDec2 ;
   private boolean[] H007P2_n5990FasDec2 ;
   private java.math.BigDecimal[] H007P2_A459FasDec ;
   private boolean[] H007P2_n459FasDec ;
   private String[] H007P2_A7070FasSigla ;
   private boolean[] H007P2_n7070FasSigla ;
   private String[] H007P2_A602MaqCod ;
   private boolean[] H007P2_n602MaqCod ;
   private String[] H007P2_A460FasDsc ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tfasprogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007P2", "SELECT EmprCod, FasCod, FasActiva, FasNorma, FasPreObl, FasPreMC, FasEstamp, FasObsF, FasValMtr, FasH2OReh, FasCarda, FasOpeIns, SecCodF, FasPesExp, FasPesInt, FasGral, FasTip, FasObl, FasConPla, FasForMul, FasAcab, FasCon, FasActTin, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec2, FasDec, FasSigla, MaqCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(25,1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(29,1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(30, 4);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 28);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

