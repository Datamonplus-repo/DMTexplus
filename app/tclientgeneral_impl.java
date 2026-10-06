package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclientgeneral_impl extends GXWebComponent
{
   public tclientgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclientgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclientgeneral_impl.class ));
   }

   public tclientgeneral_impl( int remoteHandle ,
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
      cmbCliPerFac = new HTMLChoice();
      chkCliAlbAgr = UIFactory.getCheckbox(this);
      chkCliValA = UIFactory.getCheckbox(this);
      chkCliTub = UIFactory.getCheckbox(this);
      chkCliMailGrE = UIFactory.getCheckbox(this);
      chkCliMailPkE = UIFactory.getCheckbox(this);
      cmbCliPort = new HTMLChoice();
      cmbCliTipo = new HTMLChoice();
      chkCliCtrl = UIFactory.getCheckbox(this);
      chkCliAct = UIFactory.getCheckbox(this);
      chkCliEEm = UIFactory.getCheckbox(this);
      chkCliEFx = UIFactory.getCheckbox(this);
      chkCliFacFm = UIFactory.getCheckbox(this);
      chkCliFacMtsP = UIFactory.getCheckbox(this);
      chkCliImpReop = UIFactory.getCheckbox(this);
      chkCliImpMerm = UIFactory.getCheckbox(this);
      chkCliEt1 = UIFactory.getCheckbox(this);
      chkCliEt2 = UIFactory.getCheckbox(this);
      chkCliEt3 = UIFactory.getCheckbox(this);
      cmbCliEti = new HTMLChoice();
      chkCliEtiEN = UIFactory.getCheckbox(this);
      chkCliEtiCN = UIFactory.getCheckbox(this);
      chkCliEtiCC = UIFactory.getCheckbox(this);
      dynSEGId = new HTMLChoice();
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A252CliCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"SEGID") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlasegid8B2( A396EmprCod) ;
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
         pa8B2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TCLIENTGeneral", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tclientgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"EmprCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TCLIENTGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tclientgeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA252CliCod", GXutil.ltrim( localUtil.ntoc( wcpOA252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Width", GXutil.rtrim( Dvpanel_unnamedtable8_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable8_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable8_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Cls", GXutil.rtrim( Dvpanel_unnamedtable8_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Title", GXutil.rtrim( Dvpanel_unnamedtable8_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable8_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable8_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable8_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
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
   }

   public void renderHtmlCloseForm8B2( )
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
      return "TCLIENTGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TCLIENTGeneral", "") ;
   }

   public void wb8B0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tclientgeneral");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliTop25_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliTop25_Internalname, httpContext.getMessage( "Top 25", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliTop25_Internalname, GXutil.ltrim( localUtil.ntoc( A14243CliTop25, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliTop25_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14243CliTop25), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14243CliTop25), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTop25_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliTop25_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNif_Internalname, httpContext.getMessage( "Nif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNif_Internalname, GXutil.rtrim( A278CliNif), GXutil.rtrim( localUtil.format( A278CliNif, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliIe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliIe_Internalname, httpContext.getMessage( "Incripcion Estatal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliIe_Internalname, GXutil.rtrim( A6185CliIe), GXutil.rtrim( localUtil.format( A6185CliIe, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliIe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliIe_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom1_Internalname, httpContext.getMessage( "(Cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom1_Internalname, GXutil.rtrim( A3644CliNom1), GXutil.rtrim( localUtil.format( A3644CliNom1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliDom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliDom_Internalname, httpContext.getMessage( "Domicilio ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDom_Internalname, GXutil.rtrim( A260CliDom), GXutil.rtrim( localUtil.format( A260CliDom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliDom_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliDom2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliDom2_Internalname, httpContext.getMessage( "(Cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDom2_Internalname, GXutil.rtrim( A5649CliDom2), GXutil.rtrim( localUtil.format( A5649CliDom2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliDom2_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliPob_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliPob_Internalname, httpContext.getMessage( "Poblacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliPob_Internalname, GXutil.rtrim( A295CliPob), GXutil.rtrim( localUtil.format( A295CliPob, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCp_Internalname, httpContext.getMessage( "C. Postal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCp_Internalname, GXutil.rtrim( A256CliCp), GXutil.rtrim( localUtil.format( A256CliCp, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCp_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCp2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCp2_Internalname, httpContext.getMessage( "Codigo Postal (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCp2_Internalname, GXutil.rtrim( A4828CliCp2), GXutil.rtrim( localUtil.format( A4828CliCp2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCp2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvCod_Internalname, httpContext.getMessage( "Provincia", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCod_Internalname, GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
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
         wb_table1_80_8B2( true) ;
      }
      else
      {
         wb_table1_80_8B2( false) ;
      }
      return  ;
   }

   public void wb_table1_80_8B2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliTel1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliTel1_Internalname, httpContext.getMessage( "Telefono(1)", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliTel1_Internalname, GXutil.rtrim( A303CliTel1), GXutil.rtrim( localUtil.format( A303CliTel1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTel1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliTel1_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliTel2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliTel2_Internalname, httpContext.getMessage( "Telefono(2)", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliTel2_Internalname, GXutil.rtrim( A304CliTel2), GXutil.rtrim( localUtil.format( A304CliTel2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTel2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliTel2_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliTelex_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliTelex_Internalname, httpContext.getMessage( "Telex", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliTelex_Internalname, GXutil.rtrim( A305CliTelex), GXutil.rtrim( localUtil.format( A305CliTelex, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTelex_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliTelex_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliFax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliFax_Internalname, httpContext.getMessage( "Fax", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliFax_Internalname, GXutil.rtrim( A274CliFax), GXutil.rtrim( localUtil.format( A274CliFax, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliFax_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable2_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable2_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliValFijo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliValFijo_Internalname, httpContext.getMessage( "Valor Fijo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliValFijo_Internalname, GXutil.ltrim( localUtil.ntoc( A13245CliValFijo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliValFijo_Enabled!=0) ? localUtil.format( A13245CliValFijo, "ZZ9.99") : localUtil.format( A13245CliValFijo, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliValFijo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliValFijo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliFactor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliFactor_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliFactor_Internalname, GXutil.ltrim( localUtil.ntoc( A13246CliFactor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliFactor_Enabled!=0) ? localUtil.format( A13246CliFactor, "ZZ9.99") : localUtil.format( A13246CliFactor, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFactor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliFactor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliIniVac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliIniVac_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliIniVac_Internalname, GXutil.rtrim( A277CliIniVac), GXutil.rtrim( localUtil.format( A277CliIniVac, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliIniVac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliIniVac_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliFinVac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliFinVac_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliFinVac_Internalname, GXutil.rtrim( A276CliFinVac), GXutil.rtrim( localUtil.format( A276CliFinVac, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFinVac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliFinVac_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliDes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliDes_Internalname, httpContext.getMessage( "Desp", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDes_Internalname, GXutil.rtrim( A258CliDes), GXutil.rtrim( localUtil.format( A258CliDes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliDes_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCliPerFac.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbCliPerFac.getInternalname(), httpContext.getMessage( "Factur", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCliPerFac, cmbCliPerFac.getInternalname(), GXutil.trim( GXutil.str( A294CliPerFac, 1, 0)), 1, cmbCliPerFac.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbCliPerFac.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TCLIENTGeneral.htm");
         cmbCliPerFac.setValue( GXutil.trim( GXutil.str( A294CliPerFac, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliPerFac.getInternalname(), "Values", cmbCliPerFac.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliFacCop_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliFacCop_Internalname, httpContext.getMessage( "Copias Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliFacCop_Internalname, GXutil.ltrim( localUtil.ntoc( A273CliFacCop, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliFacCop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A273CliFacCop), "9") : localUtil.format( DecimalUtil.doubleToDec(A273CliFacCop), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFacCop_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliFacCop_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliP0_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliP0_Internalname, httpContext.getMessage( "Porcentaje", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliP0_Internalname, GXutil.ltrim( localUtil.ntoc( A9853CliP0, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliP0_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9853CliP0), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9853CliP0), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliP0_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliP0_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCopAlb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCopAlb_Internalname, httpContext.getMessage( "Copias Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCopAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A3632CliCopAlb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCopAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3632CliCopAlb), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3632CliCopAlb), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCopAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCopAlb_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliAlbAgr.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliAlbAgr.getInternalname(), httpContext.getMessage( "Agrupacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliAlbAgr.getInternalname(), A250CliAlbAgr, "", httpContext.getMessage( "Agrupacion", ""), 1, chkCliAlbAgr.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliValA.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliValA.getInternalname(), httpContext.getMessage( "Imprimir Albaran Valorado ?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliValA.getInternalname(), A1902CliValA, "", httpContext.getMessage( "Imprimir Albaran Valorado ?", ""), 1, chkCliValA.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliTub.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliTub.getInternalname(), httpContext.getMessage( "Facturar Tubos?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliTub.getInternalname(), A1466CliTub, "", httpContext.getMessage( "Facturar Tubos?", ""), 1, chkCliTub.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEmail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliEmail_Internalname, httpContext.getMessage( "Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliEmail_Internalname, GXutil.rtrim( A3633CliEmail), GXutil.rtrim( localUtil.format( A3633CliEmail, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEmail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEmail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClimailAlb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtClimailAlb_Internalname, httpContext.getMessage( "larger", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtClimailAlb_Internalname, A13802ClimailAlb, GXutil.rtrim( localUtil.format( A13802ClimailAlb, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClimailAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtClimailAlb_Enabled, 0, "text", "", 100, "%", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliemf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliemf_Internalname, httpContext.getMessage( "Facturacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliemf_Internalname, GXutil.rtrim( A10050Cliemf), GXutil.rtrim( localUtil.format( A10050Cliemf, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliemf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliemf_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClimailFac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtClimailFac_Internalname, httpContext.getMessage( "larger", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtClimailFac_Internalname, A13803ClimailFac, GXutil.rtrim( localUtil.format( A13803ClimailFac, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClimailFac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtClimailFac_Enabled, 0, "text", "", 100, "%", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divClimailgre_cell_Internalname, 1, 0, "px", 0, "px", divClimailgre_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkCliMailGrE.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliMailGrE.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliMailGrE.getInternalname(), httpContext.getMessage( "Envio Guia?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliMailGrE.getInternalname(), A11622CliMailGrE, "", httpContext.getMessage( "Envio Guia?", ""), chkCliMailGrE.getVisible(), chkCliMailGrE.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divClimailpke_cell_Internalname, 1, 0, "px", 0, "px", divClimailpke_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkCliMailPkE.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliMailPkE.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliMailPkE.getInternalname(), httpContext.getMessage( "Envio Packing?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliMailPkE.getInternalname(), A11623CliMailPkE, "", httpContext.getMessage( "Envio Packing?", ""), chkCliMailPkE.getVisible(), chkCliMailPkE.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divClimailgr_cell_Internalname, 1, 0, "px", 0, "px", divClimailgr_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtCliMailGr_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliMailGr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliMailGr_Internalname, httpContext.getMessage( "Guia ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliMailGr_Internalname, GXutil.rtrim( A11620CliMailGr), GXutil.rtrim( localUtil.format( A11620CliMailGr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliMailGr_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCliMailGr_Visible, edtCliMailGr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCliperpr_cell_Internalname, 1, 0, "px", 0, "px", divCliperpr_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtCliPerPr_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliPerPr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliPerPr_Internalname, httpContext.getMessage( "Persona (Precios)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliPerPr_Internalname, GXutil.rtrim( A11702CliPerPr), GXutil.rtrim( localUtil.format( A11702CliPerPr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPerPr_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCliPerPr_Visible, edtCliPerPr_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClimailPr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtClimailPr_Internalname, httpContext.getMessage( "Mail Precios", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtClimailPr_Internalname, GXutil.rtrim( A11701ClimailPr), GXutil.rtrim( localUtil.format( A11701ClimailPr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClimailPr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtClimailPr_Enabled, 0, "text", "", 100, "%", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divClimailpk_cell_Internalname, 1, 0, "px", 0, "px", divClimailpk_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtCliMailPk_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliMailPk_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliMailPk_Internalname, httpContext.getMessage( "Packing", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliMailPk_Internalname, GXutil.rtrim( A11621CliMailPk), GXutil.rtrim( localUtil.format( A11621CliMailPk, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliMailPk_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCliMailPk_Visible, edtCliMailPk_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
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
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtCliObs_Internalname, A3629CliObs, "", "", (short)(0), 1, edtCliObs_Enabled, 0, 100, "%", 2, "row", (byte)(0), StyleString, ClassString, "", "", "400", 1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliObsF_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliObsF_Internalname, httpContext.getMessage( "Observaciones Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtCliObsF_Internalname, GXutil.rtrim( A10059CliObsF), "", "", (short)(0), 1, edtCliObsF_Enabled, 0, 100, "%", 2, "row", (byte)(0), StyleString, ClassString, "", "", "100", 1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCEE_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCEE_Internalname, httpContext.getMessage( "Observaciones CEE", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtCliCEE_Internalname, GXutil.rtrim( A10414CliCEE), "", "", (short)(0), 1, edtCliCEE_Enabled, 0, 100, "%", 2, "row", (byte)(0), StyleString, ClassString, "", "", "200", 1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TCLIENTGeneral.htm");
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
         ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
         ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
         ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
         ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
         ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
         ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
         ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
         ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
         ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
         ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliAlias_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliAlias_Internalname, httpContext.getMessage( "Alias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliAlias_Internalname, GXutil.rtrim( A2748CliAlias), GXutil.rtrim( localUtil.format( A2748CliAlias, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliAlias_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliAlias_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliPer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliPer_Internalname, httpContext.getMessage( "Persona", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliPer_Internalname, GXutil.rtrim( A293CliPer), GXutil.rtrim( localUtil.format( A293CliPer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliPer_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliRef_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliRef_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliRef_Internalname, GXutil.rtrim( A298CliRef), GXutil.rtrim( localUtil.format( A298CliRef, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliRef_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCue_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCue_Internalname, httpContext.getMessage( "Cuenta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCue_Internalname, GXutil.rtrim( A257CliCue), GXutil.rtrim( localUtil.format( A257CliCue, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCue_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCue_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliTrnCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliTrnCod_Internalname, httpContext.getMessage( "Transportista", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3631CliTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3631CliTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3631CliTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCliPort.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbCliPort.getInternalname(), httpContext.getMessage( "Portes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCliPort, cmbCliPort.getInternalname(), GXutil.rtrim( A3630CliPort), 1, cmbCliPort.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCliPort.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TCLIENTGeneral.htm");
         cmbCliPort.setValue( GXutil.rtrim( A3630CliPort) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliPort.getInternalname(), "Values", cmbCliPort.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliUrg_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliUrg_Internalname, httpContext.getMessage( "Urgencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUrg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCliTipo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbCliTipo.getInternalname(), httpContext.getMessage( "Tipo Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCliTipo, cmbCliTipo.getInternalname(), GXutil.rtrim( A5648CliTipo), 1, cmbCliTipo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCliTipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TCLIENTGeneral.htm");
         cmbCliTipo.setValue( GXutil.rtrim( A5648CliTipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliTipo.getInternalname(), "Values", cmbCliTipo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliCtrl.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliCtrl.getInternalname(), httpContext.getMessage( "Controlar?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliCtrl.getInternalname(), A1901CliCtrl, "", httpContext.getMessage( "Controlar?", ""), 1, chkCliCtrl.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliAct.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliAct.getInternalname(), httpContext.getMessage( "Activo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliAct.getInternalname(), A10045CliAct, "", httpContext.getMessage( "Activo?", ""), 1, chkCliAct.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEEm.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEEm.getInternalname(), httpContext.getMessage( "Enviar Mail?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEEm.getInternalname(), A9855CliEEm, "", httpContext.getMessage( "Enviar Mail?", ""), 1, chkCliEEm.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEFx.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEFx.getInternalname(), httpContext.getMessage( "Enviar Fax?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEFx.getInternalname(), A9854CliEFx, "", httpContext.getMessage( "Enviar Fax?", ""), 1, chkCliEFx.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTpopc_cell_Internalname, 1, 0, "px", 0, "px", divTpopc_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtTpOpC_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTpOpC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTpOpC_Internalname, httpContext.getMessage( "Tipo Operacion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTpOpC_Internalname, GXutil.ltrim( localUtil.ntoc( A11180TpOpC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTpOpC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11180TpOpC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11180TpOpC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpOpC_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTpOpC_Visible, edtTpOpC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCliultnpz_cell_Internalname, 1, 0, "px", 0, "px", divCliultnpz_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtCliUltNPz_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliUltNPz_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliUltNPz_Internalname, httpContext.getMessage( "Nº Ult Pza", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliUltNPz_Internalname, GXutil.ltrim( localUtil.ntoc( A11761CliUltNPz, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUltNPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11761CliUltNPz), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11761CliUltNPz), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUltNPz_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCliUltNPz_Visible, edtCliUltNPz_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable8_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable8_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable8.setProperty("Width", Dvpanel_unnamedtable8_Width);
         ucDvpanel_unnamedtable8.setProperty("AutoWidth", Dvpanel_unnamedtable8_Autowidth);
         ucDvpanel_unnamedtable8.setProperty("AutoHeight", Dvpanel_unnamedtable8_Autoheight);
         ucDvpanel_unnamedtable8.setProperty("Cls", Dvpanel_unnamedtable8_Cls);
         ucDvpanel_unnamedtable8.setProperty("Title", Dvpanel_unnamedtable8_Title);
         ucDvpanel_unnamedtable8.setProperty("Collapsible", Dvpanel_unnamedtable8_Collapsible);
         ucDvpanel_unnamedtable8.setProperty("Collapsed", Dvpanel_unnamedtable8_Collapsed);
         ucDvpanel_unnamedtable8.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable8_Showcollapseicon);
         ucDvpanel_unnamedtable8.setProperty("IconPosition", Dvpanel_unnamedtable8_Iconposition);
         ucDvpanel_unnamedtable8.setProperty("AutoScroll", Dvpanel_unnamedtable8_Autoscroll);
         ucDvpanel_unnamedtable8.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable8_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE8Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE8Container"+"UnnamedTable8"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliFacFm.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliFacFm.getInternalname(), httpContext.getMessage( "Facturar fase Metro?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliFacFm.getInternalname(), A13291CliFacFm, "", httpContext.getMessage( "Facturar fase Metro?", ""), 1, chkCliFacFm.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliFacFmt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliFacFmt_Internalname, httpContext.getMessage( "Valor Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliFacFmt_Internalname, GXutil.ltrim( localUtil.ntoc( A13292CliFacFmt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliFacFmt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13292CliFacFmt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13292CliFacFmt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFacFmt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliFacFmt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliFacMtsP.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliFacMtsP.getInternalname(), httpContext.getMessage( "Facturar Metros Packing List?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliFacMtsP.getInternalname(), A13236CliFacMtsP, "", httpContext.getMessage( "Facturar Metros Packing List?", ""), 1, chkCliFacMtsP.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliImpReop.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliImpReop.getInternalname(), httpContext.getMessage( "Impressão de reprocessados?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliImpReop.getInternalname(), A13012CliImpReop, "", httpContext.getMessage( "Impressão de reprocessados?", ""), 1, chkCliImpReop.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliImpMerm.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliImpMerm.getInternalname(), httpContext.getMessage( "Imprimir Merma (Quebra)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliImpMerm.getInternalname(), A12909CliImpMerm, "", httpContext.getMessage( "Imprimir Merma (Quebra)", ""), 1, chkCliImpMerm.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable9_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable9_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
         ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
         ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
         ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
         ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
         ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
         ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
         ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
         ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
         ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
         ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE9Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEst_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliEst_Internalname, httpContext.getMessage( "Membrete Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliEst_Internalname, GXutil.rtrim( A8723CliEst), GXutil.rtrim( localUtil.format( A8723CliEst, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEst_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEt1.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEt1.getInternalname(), httpContext.getMessage( "Etiqueta Neutra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEt1.getInternalname(), A10046CliEt1, "", httpContext.getMessage( "Etiqueta Neutra", ""), 1, chkCliEt1.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEt2.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEt2.getInternalname(), httpContext.getMessage( "Salir Ancho?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEt2.getInternalname(), A10047CliEt2, "", httpContext.getMessage( "Salir Ancho?", ""), 1, chkCliEt2.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEt3.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEt3.getInternalname(), httpContext.getMessage( "Salir Color?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEt3.getInternalname(), A10048CliEt3, "", httpContext.getMessage( "Salir Color?", ""), 1, chkCliEt3.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable10_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable10_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCliEti.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbCliEti.getInternalname(), httpContext.getMessage( "Etiqueta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCliEti, cmbCliEti.getInternalname(), GXutil.rtrim( A272CliEti), 1, cmbCliEti.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCliEti.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TCLIENTGeneral.htm");
         cmbCliEti.setValue( GXutil.rtrim( A272CliEti) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliEti.getInternalname(), "Values", cmbCliEti.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEtiEN.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEtiEN.getInternalname(), httpContext.getMessage( "Imprimir Empresa?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEtiEN.getInternalname(), A2843CliEtiEN, "", httpContext.getMessage( "Imprimir Empresa?", ""), 1, chkCliEtiEN.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEtiCN.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEtiCN.getInternalname(), httpContext.getMessage( "Imprimir Nombre?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEtiCN.getInternalname(), A2842CliEtiCN, "", httpContext.getMessage( "Imprimir Nombre?", ""), 1, chkCliEtiCN.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCliEtiCC.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkCliEtiCC.getInternalname(), httpContext.getMessage( "Imprimir Codigo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEtiCC.getInternalname(), A2841CliEtiCC, "", httpContext.getMessage( "Imprimir Codigo?", ""), 1, chkCliEtiCC.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable11_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable11_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynSEGId.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynSEGId.getInternalname(), httpContext.getMessage( "Segmentacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynSEGId, dynSEGId.getInternalname(), GXutil.rtrim( A12753SEGId), 1, dynSEGId.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, dynSEGId.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TCLIENTGeneral.htm");
         dynSEGId.setValue( GXutil.rtrim( A12753SEGId) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynSEGId.getInternalname(), "Values", dynSEGId.ToJavascriptSource(), true);
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
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 412,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e118b1_client"+"'", TempTags, "", 2, "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 414,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e128b1_client"+"'", TempTags, "", 2, "HLP_TCLIENTGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3140CliDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliDivCod_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start8B2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TCLIENTGeneral", ""), (short)(0)) ;
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
            strup8B0( ) ;
         }
      }
   }

   public void ws8B2( )
   {
      start8B2( ) ;
      evt8B2( ) ;
   }

   public void evt8B2( )
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
                              strup8B0( ) ;
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
                              strup8B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e138B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup8B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e148B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup8B0( ) ;
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
                              strup8B0( ) ;
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

   public void we8B2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm8B2( ) ;
         }
      }
   }

   public void pa8B2( )
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

   public void gxdlasegid8B2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlasegid_data8B2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxasegid_html8B2( String A396EmprCod )
   {
      String gxdynajaxvalue;
      gxdlasegid_data8B2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynSEGId.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynSEGId.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlasegid_data8B2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add(httpContext.getMessage( "{{segmentacion}}", ""));
      /* Using cursor H008B2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H008B2_A12753SEGId[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H008B2_A12754SEGDs[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxasegid_html8B2( A396EmprCod) ;
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbCliPerFac.getItemCount() > 0 )
      {
         A294CliPerFac = (byte)(GXutil.lval( cmbCliPerFac.getValidValue(GXutil.trim( GXutil.str( A294CliPerFac, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliPerFac.setValue( GXutil.trim( GXutil.str( A294CliPerFac, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliPerFac.getInternalname(), "Values", cmbCliPerFac.ToJavascriptSource(), true);
      }
      A250CliAlbAgr = ((GXutil.strcmp(GXutil.rtrim( A250CliAlbAgr), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A250CliAlbAgr", A250CliAlbAgr);
      A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1902CliValA", A1902CliValA);
      A1466CliTub = ((GXutil.strcmp(GXutil.rtrim( A1466CliTub), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1466CliTub", A1466CliTub);
      A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11622CliMailGrE", A11622CliMailGrE);
      A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11623CliMailPkE", A11623CliMailPkE);
      if ( cmbCliPort.getItemCount() > 0 )
      {
         A3630CliPort = cmbCliPort.getValidValue(A3630CliPort) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3630CliPort", A3630CliPort);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliPort.setValue( GXutil.rtrim( A3630CliPort) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliPort.getInternalname(), "Values", cmbCliPort.ToJavascriptSource(), true);
      }
      if ( cmbCliTipo.getItemCount() > 0 )
      {
         A5648CliTipo = cmbCliTipo.getValidValue(A5648CliTipo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5648CliTipo", A5648CliTipo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliTipo.setValue( GXutil.rtrim( A5648CliTipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliTipo.getInternalname(), "Values", cmbCliTipo.ToJavascriptSource(), true);
      }
      A1901CliCtrl = ((GXutil.strcmp(GXutil.rtrim( A1901CliCtrl), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1901CliCtrl", A1901CliCtrl);
      A10045CliAct = ((GXutil.strcmp(GXutil.rtrim( A10045CliAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10045CliAct", A10045CliAct);
      A9855CliEEm = ((GXutil.strcmp(GXutil.rtrim( A9855CliEEm), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9855CliEEm", A9855CliEEm);
      A9854CliEFx = ((GXutil.strcmp(GXutil.rtrim( A9854CliEFx), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9854CliEFx", A9854CliEFx);
      A13291CliFacFm = ((GXutil.strcmp(GXutil.rtrim( A13291CliFacFm), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13291CliFacFm", A13291CliFacFm);
      A13236CliFacMtsP = ((GXutil.strcmp(GXutil.rtrim( A13236CliFacMtsP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13236CliFacMtsP", A13236CliFacMtsP);
      A13012CliImpReop = ((GXutil.strcmp(GXutil.rtrim( A13012CliImpReop), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13012CliImpReop", A13012CliImpReop);
      A12909CliImpMerm = ((GXutil.strcmp(GXutil.rtrim( A12909CliImpMerm), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12909CliImpMerm", A12909CliImpMerm);
      A10046CliEt1 = ((GXutil.strcmp(GXutil.rtrim( A10046CliEt1), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10046CliEt1", A10046CliEt1);
      A10047CliEt2 = ((GXutil.strcmp(GXutil.rtrim( A10047CliEt2), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10047CliEt2", A10047CliEt2);
      A10048CliEt3 = ((GXutil.strcmp(GXutil.rtrim( A10048CliEt3), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10048CliEt3", A10048CliEt3);
      if ( cmbCliEti.getItemCount() > 0 )
      {
         A272CliEti = cmbCliEti.getValidValue(A272CliEti) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272CliEti", A272CliEti);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliEti.setValue( GXutil.rtrim( A272CliEti) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCliEti.getInternalname(), "Values", cmbCliEti.ToJavascriptSource(), true);
      }
      A2843CliEtiEN = ((GXutil.strcmp(GXutil.rtrim( A2843CliEtiEN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2843CliEtiEN", A2843CliEtiEN);
      A2842CliEtiCN = ((GXutil.strcmp(GXutil.rtrim( A2842CliEtiCN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2842CliEtiCN", A2842CliEtiCN);
      A2841CliEtiCC = ((GXutil.strcmp(GXutil.rtrim( A2841CliEtiCC), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2841CliEtiCC", A2841CliEtiCC);
      if ( dynSEGId.getItemCount() > 0 )
      {
         A12753SEGId = dynSEGId.getValidValue(A12753SEGId) ;
         n12753SEGId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12753SEGId", A12753SEGId);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynSEGId.setValue( GXutil.rtrim( A12753SEGId) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynSEGId.getInternalname(), "Values", dynSEGId.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8B2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "TCLIENTGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf8B2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H008B3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3140CliDivCod = H008B3_A3140CliDivCod[0] ;
            n3140CliDivCod = H008B3_n3140CliDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
            A12753SEGId = H008B3_A12753SEGId[0] ;
            n12753SEGId = H008B3_n12753SEGId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12753SEGId", A12753SEGId);
            A2841CliEtiCC = H008B3_A2841CliEtiCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2841CliEtiCC", A2841CliEtiCC);
            A2842CliEtiCN = H008B3_A2842CliEtiCN[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2842CliEtiCN", A2842CliEtiCN);
            A2843CliEtiEN = H008B3_A2843CliEtiEN[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2843CliEtiEN", A2843CliEtiEN);
            A272CliEti = H008B3_A272CliEti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272CliEti", A272CliEti);
            A10048CliEt3 = H008B3_A10048CliEt3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10048CliEt3", A10048CliEt3);
            A10047CliEt2 = H008B3_A10047CliEt2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10047CliEt2", A10047CliEt2);
            A10046CliEt1 = H008B3_A10046CliEt1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10046CliEt1", A10046CliEt1);
            A8723CliEst = H008B3_A8723CliEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8723CliEst", A8723CliEst);
            A12909CliImpMerm = H008B3_A12909CliImpMerm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12909CliImpMerm", A12909CliImpMerm);
            A13012CliImpReop = H008B3_A13012CliImpReop[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13012CliImpReop", A13012CliImpReop);
            A13236CliFacMtsP = H008B3_A13236CliFacMtsP[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13236CliFacMtsP", A13236CliFacMtsP);
            A13292CliFacFmt = H008B3_A13292CliFacFmt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13292CliFacFmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13292CliFacFmt), 4, 0));
            A13291CliFacFm = H008B3_A13291CliFacFm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13291CliFacFm", A13291CliFacFm);
            A11761CliUltNPz = H008B3_A11761CliUltNPz[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11761CliUltNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11761CliUltNPz), 8, 0));
            A11180TpOpC = H008B3_A11180TpOpC[0] ;
            n11180TpOpC = H008B3_n11180TpOpC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
            A9854CliEFx = H008B3_A9854CliEFx[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9854CliEFx", A9854CliEFx);
            A9855CliEEm = H008B3_A9855CliEEm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9855CliEEm", A9855CliEEm);
            A10045CliAct = H008B3_A10045CliAct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10045CliAct", A10045CliAct);
            A1901CliCtrl = H008B3_A1901CliCtrl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1901CliCtrl", A1901CliCtrl);
            A5648CliTipo = H008B3_A5648CliTipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5648CliTipo", A5648CliTipo);
            A306CliUrg = H008B3_A306CliUrg[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
            A3630CliPort = H008B3_A3630CliPort[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3630CliPort", A3630CliPort);
            A3631CliTrnCod = H008B3_A3631CliTrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3631CliTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3631CliTrnCod), 4, 0));
            A257CliCue = H008B3_A257CliCue[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A257CliCue", A257CliCue);
            A298CliRef = H008B3_A298CliRef[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298CliRef", A298CliRef);
            A293CliPer = H008B3_A293CliPer[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A293CliPer", A293CliPer);
            A2748CliAlias = H008B3_A2748CliAlias[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2748CliAlias", A2748CliAlias);
            A10414CliCEE = H008B3_A10414CliCEE[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10414CliCEE", A10414CliCEE);
            A10059CliObsF = H008B3_A10059CliObsF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10059CliObsF", A10059CliObsF);
            A3629CliObs = H008B3_A3629CliObs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3629CliObs", A3629CliObs);
            A11621CliMailPk = H008B3_A11621CliMailPk[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11621CliMailPk", A11621CliMailPk);
            A11701ClimailPr = H008B3_A11701ClimailPr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11701ClimailPr", A11701ClimailPr);
            A11702CliPerPr = H008B3_A11702CliPerPr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11702CliPerPr", A11702CliPerPr);
            A11620CliMailGr = H008B3_A11620CliMailGr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11620CliMailGr", A11620CliMailGr);
            A11623CliMailPkE = H008B3_A11623CliMailPkE[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11623CliMailPkE", A11623CliMailPkE);
            A11622CliMailGrE = H008B3_A11622CliMailGrE[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11622CliMailGrE", A11622CliMailGrE);
            A13803ClimailFac = H008B3_A13803ClimailFac[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13803ClimailFac", A13803ClimailFac);
            A10050Cliemf = H008B3_A10050Cliemf[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10050Cliemf", A10050Cliemf);
            A13802ClimailAlb = H008B3_A13802ClimailAlb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13802ClimailAlb", A13802ClimailAlb);
            A3633CliEmail = H008B3_A3633CliEmail[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3633CliEmail", A3633CliEmail);
            A1466CliTub = H008B3_A1466CliTub[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1466CliTub", A1466CliTub);
            A1902CliValA = H008B3_A1902CliValA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1902CliValA", A1902CliValA);
            A250CliAlbAgr = H008B3_A250CliAlbAgr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A250CliAlbAgr", A250CliAlbAgr);
            A3632CliCopAlb = H008B3_A3632CliCopAlb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3632CliCopAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3632CliCopAlb), 2, 0));
            A9853CliP0 = H008B3_A9853CliP0[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9853CliP0", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9853CliP0), 3, 0));
            A273CliFacCop = H008B3_A273CliFacCop[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A273CliFacCop", GXutil.str( A273CliFacCop, 1, 0));
            A294CliPerFac = H008B3_A294CliPerFac[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
            A258CliDes = H008B3_A258CliDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A258CliDes", A258CliDes);
            A276CliFinVac = H008B3_A276CliFinVac[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A276CliFinVac", A276CliFinVac);
            A277CliIniVac = H008B3_A277CliIniVac[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A277CliIniVac", A277CliIniVac);
            A13246CliFactor = H008B3_A13246CliFactor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13246CliFactor", GXutil.ltrimstr( A13246CliFactor, 6, 2));
            A13245CliValFijo = H008B3_A13245CliValFijo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13245CliValFijo", GXutil.ltrimstr( A13245CliValFijo, 6, 2));
            A274CliFax = H008B3_A274CliFax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A274CliFax", A274CliFax);
            A305CliTelex = H008B3_A305CliTelex[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A305CliTelex", A305CliTelex);
            A304CliTel2 = H008B3_A304CliTel2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A304CliTel2", A304CliTel2);
            A303CliTel1 = H008B3_A303CliTel1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A303CliTel1", A303CliTel1);
            A858ZonGeoCod = H008B3_A858ZonGeoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
            A10301Cod_pais = H008B3_A10301Cod_pais[0] ;
            n10301Cod_pais = H008B3_n10301Cod_pais[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
            A781PrvCod = H008B3_A781PrvCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
            A4828CliCp2 = H008B3_A4828CliCp2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4828CliCp2", A4828CliCp2);
            A256CliCp = H008B3_A256CliCp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A256CliCp", A256CliCp);
            A295CliPob = H008B3_A295CliPob[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A295CliPob", A295CliPob);
            A5649CliDom2 = H008B3_A5649CliDom2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5649CliDom2", A5649CliDom2);
            A260CliDom = H008B3_A260CliDom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A260CliDom", A260CliDom);
            A3644CliNom1 = H008B3_A3644CliNom1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3644CliNom1", A3644CliNom1);
            A279CliNom = H008B3_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A6185CliIe = H008B3_A6185CliIe[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6185CliIe", A6185CliIe);
            A278CliNif = H008B3_A278CliNif[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A278CliNif", A278CliNif);
            A14243CliTop25 = H008B3_A14243CliTop25[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14243CliTop25", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14243CliTop25), 4, 0));
            gxasegid_html8B2( A396EmprCod) ;
            /* Execute user event: Load */
            e148B2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         wb8B0( ) ;
      }
   }

   public void send_integrity_lvl_hashes8B2( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "TCLIENTGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      gxasegid_html8B2( A396EmprCod) ;
      fix_multi_value_controls( ) ;
   }

   public void strup8B0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e138B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
         Dvpanel_unnamedtable8_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Width") ;
         Dvpanel_unnamedtable8_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Autowidth")) ;
         Dvpanel_unnamedtable8_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoheight")) ;
         Dvpanel_unnamedtable8_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Cls") ;
         Dvpanel_unnamedtable8_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Title") ;
         Dvpanel_unnamedtable8_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsible")) ;
         Dvpanel_unnamedtable8_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Collapsed")) ;
         Dvpanel_unnamedtable8_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Showcollapseicon")) ;
         Dvpanel_unnamedtable8_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Iconposition") ;
         Dvpanel_unnamedtable8_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE8_Autoscroll")) ;
         Dvpanel_unnamedtable9_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Width") ;
         Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
         Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
         Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Cls") ;
         Dvpanel_unnamedtable9_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Title") ;
         Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
         Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
         Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
         Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Iconposition") ;
         Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
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
         /* Read variables values. */
         A14243CliTop25 = (short)(localUtil.ctol( httpContext.cgiGet( edtCliTop25_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14243CliTop25", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14243CliTop25), 4, 0));
         A278CliNif = GXutil.upper( httpContext.cgiGet( edtCliNif_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A278CliNif", A278CliNif);
         A6185CliIe = GXutil.upper( httpContext.cgiGet( edtCliIe_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6185CliIe", A6185CliIe);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         A3644CliNom1 = httpContext.cgiGet( edtCliNom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3644CliNom1", A3644CliNom1);
         A260CliDom = httpContext.cgiGet( edtCliDom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A260CliDom", A260CliDom);
         A5649CliDom2 = httpContext.cgiGet( edtCliDom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5649CliDom2", A5649CliDom2);
         A295CliPob = httpContext.cgiGet( edtCliPob_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A295CliPob", A295CliPob);
         A256CliCp = httpContext.cgiGet( edtCliCp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A256CliCp", A256CliCp);
         A4828CliCp2 = httpContext.cgiGet( edtCliCp2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4828CliCp2", A4828CliCp2);
         A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         A10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10301Cod_pais = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
         A858ZonGeoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtZonGeoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         A303CliTel1 = httpContext.cgiGet( edtCliTel1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A303CliTel1", A303CliTel1);
         A304CliTel2 = httpContext.cgiGet( edtCliTel2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A304CliTel2", A304CliTel2);
         A305CliTelex = httpContext.cgiGet( edtCliTelex_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A305CliTelex", A305CliTelex);
         A274CliFax = httpContext.cgiGet( edtCliFax_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A274CliFax", A274CliFax);
         A13245CliValFijo = localUtil.ctond( httpContext.cgiGet( edtCliValFijo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13245CliValFijo", GXutil.ltrimstr( A13245CliValFijo, 6, 2));
         A13246CliFactor = localUtil.ctond( httpContext.cgiGet( edtCliFactor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13246CliFactor", GXutil.ltrimstr( A13246CliFactor, 6, 2));
         A277CliIniVac = httpContext.cgiGet( edtCliIniVac_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A277CliIniVac", A277CliIniVac);
         A276CliFinVac = httpContext.cgiGet( edtCliFinVac_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A276CliFinVac", A276CliFinVac);
         A258CliDes = httpContext.cgiGet( edtCliDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A258CliDes", A258CliDes);
         cmbCliPerFac.setValue( httpContext.cgiGet( cmbCliPerFac.getInternalname()) );
         A294CliPerFac = (byte)(GXutil.lval( httpContext.cgiGet( cmbCliPerFac.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
         A273CliFacCop = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliFacCop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A273CliFacCop", GXutil.str( A273CliFacCop, 1, 0));
         A9853CliP0 = (short)(localUtil.ctol( httpContext.cgiGet( edtCliP0_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9853CliP0", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9853CliP0), 3, 0));
         A3632CliCopAlb = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliCopAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3632CliCopAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3632CliCopAlb), 2, 0));
         A250CliAlbAgr = ((GXutil.strcmp(httpContext.cgiGet( chkCliAlbAgr.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A250CliAlbAgr", A250CliAlbAgr);
         A1902CliValA = ((GXutil.strcmp(httpContext.cgiGet( chkCliValA.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1902CliValA", A1902CliValA);
         A1466CliTub = ((GXutil.strcmp(httpContext.cgiGet( chkCliTub.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1466CliTub", A1466CliTub);
         A3633CliEmail = httpContext.cgiGet( edtCliEmail_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3633CliEmail", A3633CliEmail);
         A13802ClimailAlb = httpContext.cgiGet( edtClimailAlb_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13802ClimailAlb", A13802ClimailAlb);
         A10050Cliemf = httpContext.cgiGet( edtCliemf_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10050Cliemf", A10050Cliemf);
         A13803ClimailFac = httpContext.cgiGet( edtClimailFac_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13803ClimailFac", A13803ClimailFac);
         A11622CliMailGrE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailGrE.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11622CliMailGrE", A11622CliMailGrE);
         A11623CliMailPkE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailPkE.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11623CliMailPkE", A11623CliMailPkE);
         A11620CliMailGr = httpContext.cgiGet( edtCliMailGr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11620CliMailGr", A11620CliMailGr);
         A11702CliPerPr = httpContext.cgiGet( edtCliPerPr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11702CliPerPr", A11702CliPerPr);
         A11701ClimailPr = httpContext.cgiGet( edtClimailPr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11701ClimailPr", A11701ClimailPr);
         A11621CliMailPk = httpContext.cgiGet( edtCliMailPk_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11621CliMailPk", A11621CliMailPk);
         A3629CliObs = httpContext.cgiGet( edtCliObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3629CliObs", A3629CliObs);
         A10059CliObsF = httpContext.cgiGet( edtCliObsF_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10059CliObsF", A10059CliObsF);
         A10414CliCEE = httpContext.cgiGet( edtCliCEE_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10414CliCEE", A10414CliCEE);
         A2748CliAlias = httpContext.cgiGet( edtCliAlias_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2748CliAlias", A2748CliAlias);
         A293CliPer = httpContext.cgiGet( edtCliPer_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A293CliPer", A293CliPer);
         A298CliRef = httpContext.cgiGet( edtCliRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298CliRef", A298CliRef);
         A257CliCue = httpContext.cgiGet( edtCliCue_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A257CliCue", A257CliCue);
         A3631CliTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCliTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3631CliTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3631CliTrnCod), 4, 0));
         cmbCliPort.setValue( httpContext.cgiGet( cmbCliPort.getInternalname()) );
         A3630CliPort = httpContext.cgiGet( cmbCliPort.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3630CliPort", A3630CliPort);
         A306CliUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         cmbCliTipo.setValue( httpContext.cgiGet( cmbCliTipo.getInternalname()) );
         A5648CliTipo = httpContext.cgiGet( cmbCliTipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5648CliTipo", A5648CliTipo);
         A1901CliCtrl = ((GXutil.strcmp(httpContext.cgiGet( chkCliCtrl.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1901CliCtrl", A1901CliCtrl);
         A10045CliAct = ((GXutil.strcmp(httpContext.cgiGet( chkCliAct.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10045CliAct", A10045CliAct);
         A9855CliEEm = ((GXutil.strcmp(httpContext.cgiGet( chkCliEEm.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9855CliEEm", A9855CliEEm);
         A9854CliEFx = ((GXutil.strcmp(httpContext.cgiGet( chkCliEFx.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9854CliEFx", A9854CliEFx);
         A11180TpOpC = (short)(localUtil.ctol( httpContext.cgiGet( edtTpOpC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11180TpOpC = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
         A11761CliUltNPz = (int)(localUtil.ctol( httpContext.cgiGet( edtCliUltNPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11761CliUltNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11761CliUltNPz), 8, 0));
         A13291CliFacFm = ((GXutil.strcmp(httpContext.cgiGet( chkCliFacFm.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13291CliFacFm", A13291CliFacFm);
         A13292CliFacFmt = (short)(localUtil.ctol( httpContext.cgiGet( edtCliFacFmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13292CliFacFmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13292CliFacFmt), 4, 0));
         A13236CliFacMtsP = ((GXutil.strcmp(httpContext.cgiGet( chkCliFacMtsP.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13236CliFacMtsP", A13236CliFacMtsP);
         A13012CliImpReop = ((GXutil.strcmp(httpContext.cgiGet( chkCliImpReop.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13012CliImpReop", A13012CliImpReop);
         A12909CliImpMerm = ((GXutil.strcmp(httpContext.cgiGet( chkCliImpMerm.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12909CliImpMerm", A12909CliImpMerm);
         A8723CliEst = httpContext.cgiGet( edtCliEst_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8723CliEst", A8723CliEst);
         A10046CliEt1 = ((GXutil.strcmp(httpContext.cgiGet( chkCliEt1.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10046CliEt1", A10046CliEt1);
         A10047CliEt2 = ((GXutil.strcmp(httpContext.cgiGet( chkCliEt2.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10047CliEt2", A10047CliEt2);
         A10048CliEt3 = ((GXutil.strcmp(httpContext.cgiGet( chkCliEt3.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10048CliEt3", A10048CliEt3);
         cmbCliEti.setValue( httpContext.cgiGet( cmbCliEti.getInternalname()) );
         A272CliEti = httpContext.cgiGet( cmbCliEti.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272CliEti", A272CliEti);
         A2843CliEtiEN = ((GXutil.strcmp(httpContext.cgiGet( chkCliEtiEN.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2843CliEtiEN", A2843CliEtiEN);
         A2842CliEtiCN = ((GXutil.strcmp(httpContext.cgiGet( chkCliEtiCN.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2842CliEtiCN", A2842CliEtiCN);
         A2841CliEtiCC = ((GXutil.strcmp(httpContext.cgiGet( chkCliEtiCC.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2841CliEtiCC", A2841CliEtiCC);
         dynSEGId.setValue( httpContext.cgiGet( dynSEGId.getInternalname()) );
         A12753SEGId = httpContext.cgiGet( dynSEGId.getInternalname()) ;
         n12753SEGId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12753SEGId", A12753SEGId);
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         A3140CliDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3140CliDivCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TCLIENTGeneral");
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tclientgeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         gxasegid_html8B2( A396EmprCod) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e138B2 ();
      if (returnInSub) return;
   }

   public void e138B2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tclientgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclientgeneral_impl.this.AV15Emprcod = GXv_char2[0] ;
      tclientgeneral_impl.this.AV16Emprnom = GXv_char3[0] ;
      tclientgeneral_impl.this.AV17Usurcod = GXv_char4[0] ;
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

   protected void e148B2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtCliDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDivCod_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "VELLUT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtTpOpC_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTpOpC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTpOpC_Visible), 5, 0), true);
         divTpopc_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divTpopc_cell_Internalname, "Class", divTpopc_cell_Class, true);
      }
      else
      {
         edtTpOpC_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTpOpC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTpOpC_Visible), 5, 0), true);
         divTpopc_cell_Class = "col-xs-12 col-sm-6 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divTpopc_cell_Internalname, "Class", divTpopc_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "NUPZCL", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtCliUltNPz_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliUltNPz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltNPz_Visible), 5, 0), true);
         divCliultnpz_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divCliultnpz_cell_Internalname, "Class", divCliultnpz_cell_Class, true);
      }
      else
      {
         edtCliUltNPz_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliUltNPz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltNPz_Visible), 5, 0), true);
         divCliultnpz_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divCliultnpz_cell_Internalname, "Class", divCliultnpz_cell_Class, true);
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
         chkCliMailGrE.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliMailGrE.getInternalname(), "Visible", GXutil.ltrimstr( chkCliMailGrE.getVisible(), 5, 0), true);
         divClimailgre_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailgre_cell_Internalname, "Class", divClimailgre_cell_Class, true);
      }
      else
      {
         chkCliMailGrE.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliMailGrE.getInternalname(), "Visible", GXutil.ltrimstr( chkCliMailGrE.getVisible(), 5, 0), true);
         divClimailgre_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailgre_cell_Internalname, "Class", divClimailgre_cell_Class, true);
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
         chkCliMailPkE.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliMailPkE.getInternalname(), "Visible", GXutil.ltrimstr( chkCliMailPkE.getVisible(), 5, 0), true);
         divClimailpke_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailpke_cell_Internalname, "Class", divClimailpke_cell_Class, true);
      }
      else
      {
         chkCliMailPkE.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliMailPkE.getInternalname(), "Visible", GXutil.ltrimstr( chkCliMailPkE.getVisible(), 5, 0), true);
         divClimailpke_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailpke_cell_Internalname, "Class", divClimailpke_cell_Class, true);
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
         edtCliMailGr_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliMailGr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMailGr_Visible), 5, 0), true);
         divClimailgr_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailgr_cell_Internalname, "Class", divClimailgr_cell_Class, true);
      }
      else
      {
         edtCliMailGr_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliMailGr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMailGr_Visible), 5, 0), true);
         divClimailgr_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailgr_cell_Internalname, "Class", divClimailgr_cell_Class, true);
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
         edtCliPerPr_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliPerPr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPerPr_Visible), 5, 0), true);
         divCliperpr_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divCliperpr_cell_Internalname, "Class", divCliperpr_cell_Class, true);
      }
      else
      {
         edtCliPerPr_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliPerPr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPerPr_Visible), 5, 0), true);
         divCliperpr_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divCliperpr_cell_Internalname, "Class", divCliperpr_cell_Class, true);
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
         edtCliMailPk_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliMailPk_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMailPk_Visible), 5, 0), true);
         divClimailpk_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailpk_cell_Internalname, "Class", divClimailpk_cell_Class, true);
      }
      else
      {
         edtCliMailPk_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliMailPk_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMailPk_Visible), 5, 0), true);
         divClimailpk_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divClimailpk_cell_Internalname, "Class", divClimailpk_cell_Class, true);
      }
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
         divDvpanel_unnamedtable2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable2_cell_Internalname, "Class", divDvpanel_unnamedtable2_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable2_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable2_cell_Internalname, "Class", divDvpanel_unnamedtable2_cell_Class, true);
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
         divDvpanel_unnamedtable8_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable8_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TORIEN", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable9_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable9_cell_Internalname, "Class", divDvpanel_unnamedtable9_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable9_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable9_cell_Internalname, "Class", divDvpanel_unnamedtable9_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ETIG16", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable10_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable10_cell_Internalname, "Class", divDvpanel_unnamedtable10_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable10_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable10_cell_Internalname, "Class", divDvpanel_unnamedtable10_cell_Class, true);
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
         divDvpanel_unnamedtable11_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable11_cell_Internalname, "Class", divDvpanel_unnamedtable11_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable11_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable11_cell_Internalname, "Class", divDvpanel_unnamedtable11_cell_Class, true);
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
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCLIENT" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_80_8B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable14_Internalname, tblTablemergedunnamedtable14_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCod_pais_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCod_pais_Internalname, httpContext.getMessage( "Pais", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCod_pais_Internalname, GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCod_pais_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCod_pais_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCod_pais_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtZonGeoCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtZonGeoCod_Internalname, httpContext.getMessage( "Zona Geográfica", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtZonGeoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtZonGeoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A858ZonGeoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A858ZonGeoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtZonGeoCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtZonGeoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENTGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_80_8B2e( true) ;
      }
      else
      {
         wb_table1_80_8B2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A252CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
      pa8B2( ) ;
      ws8B2( ) ;
      we8B2( ) ;
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
      sCtrlA252CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa8B2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tclientgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa8B2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A252CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A252CliCod != wcpOA252CliCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA252CliCod = A252CliCod ;
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
      sCtrlA252CliCod = httpContext.cgiGet( sPrefix+"A252CliCod_CTRL") ;
      if ( GXutil.len( sCtrlA252CliCod) > 0 )
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA252CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A252CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa8B2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws8B2( ) ;
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
      ws8B2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A252CliCod_PARM", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA252CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A252CliCod_CTRL", GXutil.rtrim( sCtrlA252CliCod));
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
      we8B2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165812", true, true);
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
      httpContext.AddJavascriptSource("tclientgeneral.js", "?2026821165813", false, true);
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
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliTop25_Internalname = sPrefix+"CLITOP25" ;
      edtCliNif_Internalname = sPrefix+"CLINIF" ;
      edtCliIe_Internalname = sPrefix+"CLIIE" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtCliNom1_Internalname = sPrefix+"CLINOM1" ;
      edtCliDom_Internalname = sPrefix+"CLIDOM" ;
      edtCliDom2_Internalname = sPrefix+"CLIDOM2" ;
      edtCliPob_Internalname = sPrefix+"CLIPOB" ;
      divUnnamedtable12_Internalname = sPrefix+"UNNAMEDTABLE12" ;
      edtCliCp_Internalname = sPrefix+"CLICP" ;
      edtCliCp2_Internalname = sPrefix+"CLICP2" ;
      edtPrvCod_Internalname = sPrefix+"PRVCOD" ;
      divUnnamedtable13_Internalname = sPrefix+"UNNAMEDTABLE13" ;
      edtCod_pais_Internalname = sPrefix+"COD_PAIS" ;
      edtZonGeoCod_Internalname = sPrefix+"ZONGEOCOD" ;
      divUnnamedtable14_Internalname = sPrefix+"UNNAMEDTABLE14" ;
      divUnnamedtable15_Internalname = sPrefix+"UNNAMEDTABLE15" ;
      tblTablemergedunnamedtable14_Internalname = sPrefix+"TABLEMERGEDUNNAMEDTABLE14" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      edtCliTel1_Internalname = sPrefix+"CLITEL1" ;
      edtCliTel2_Internalname = sPrefix+"CLITEL2" ;
      edtCliTelex_Internalname = sPrefix+"CLITELEX" ;
      edtCliFax_Internalname = sPrefix+"CLIFAX" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtCliValFijo_Internalname = sPrefix+"CLIVALFIJO" ;
      edtCliFactor_Internalname = sPrefix+"CLIFACTOR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divDvpanel_unnamedtable2_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2_CELL" ;
      edtCliIniVac_Internalname = sPrefix+"CLIINIVAC" ;
      edtCliFinVac_Internalname = sPrefix+"CLIFINVAC" ;
      edtCliDes_Internalname = sPrefix+"CLIDES" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE3" ;
      cmbCliPerFac.setInternalname( sPrefix+"CLIPERFAC" );
      edtCliFacCop_Internalname = sPrefix+"CLIFACCOP" ;
      edtCliP0_Internalname = sPrefix+"CLIP0" ;
      edtCliCopAlb_Internalname = sPrefix+"CLICOPALB" ;
      chkCliAlbAgr.setInternalname( sPrefix+"CLIALBAGR" );
      chkCliValA.setInternalname( sPrefix+"CLIVALA" );
      chkCliTub.setInternalname( sPrefix+"CLITUB" );
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      edtCliEmail_Internalname = sPrefix+"CLIEMAIL" ;
      edtClimailAlb_Internalname = sPrefix+"CLIMAILALB" ;
      edtCliemf_Internalname = sPrefix+"CLIEMF" ;
      edtClimailFac_Internalname = sPrefix+"CLIMAILFAC" ;
      chkCliMailGrE.setInternalname( sPrefix+"CLIMAILGRE" );
      divClimailgre_cell_Internalname = sPrefix+"CLIMAILGRE_CELL" ;
      chkCliMailPkE.setInternalname( sPrefix+"CLIMAILPKE" );
      divClimailpke_cell_Internalname = sPrefix+"CLIMAILPKE_CELL" ;
      edtCliMailGr_Internalname = sPrefix+"CLIMAILGR" ;
      divClimailgr_cell_Internalname = sPrefix+"CLIMAILGR_CELL" ;
      edtCliPerPr_Internalname = sPrefix+"CLIPERPR" ;
      divCliperpr_cell_Internalname = sPrefix+"CLIPERPR_CELL" ;
      edtClimailPr_Internalname = sPrefix+"CLIMAILPR" ;
      edtCliMailPk_Internalname = sPrefix+"CLIMAILPK" ;
      divClimailpk_cell_Internalname = sPrefix+"CLIMAILPK_CELL" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE5" ;
      edtCliObs_Internalname = sPrefix+"CLIOBS" ;
      edtCliObsF_Internalname = sPrefix+"CLIOBSF" ;
      edtCliCEE_Internalname = sPrefix+"CLICEE" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE6" ;
      edtCliAlias_Internalname = sPrefix+"CLIALIAS" ;
      edtCliPer_Internalname = sPrefix+"CLIPER" ;
      edtCliRef_Internalname = sPrefix+"CLIREF" ;
      edtCliCue_Internalname = sPrefix+"CLICUE" ;
      edtCliTrnCod_Internalname = sPrefix+"CLITRNCOD" ;
      cmbCliPort.setInternalname( sPrefix+"CLIPORT" );
      edtCliUrg_Internalname = sPrefix+"CLIURG" ;
      cmbCliTipo.setInternalname( sPrefix+"CLITIPO" );
      chkCliCtrl.setInternalname( sPrefix+"CLICTRL" );
      chkCliAct.setInternalname( sPrefix+"CLIACT" );
      chkCliEEm.setInternalname( sPrefix+"CLIEEM" );
      chkCliEFx.setInternalname( sPrefix+"CLIEFX" );
      edtTpOpC_Internalname = sPrefix+"TPOPC" ;
      divTpopc_cell_Internalname = sPrefix+"TPOPC_CELL" ;
      edtCliUltNPz_Internalname = sPrefix+"CLIULTNPZ" ;
      divCliultnpz_cell_Internalname = sPrefix+"CLIULTNPZ_CELL" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE7" ;
      chkCliFacFm.setInternalname( sPrefix+"CLIFACFM" );
      edtCliFacFmt_Internalname = sPrefix+"CLIFACFMT" ;
      chkCliFacMtsP.setInternalname( sPrefix+"CLIFACMTSP" );
      chkCliImpReop.setInternalname( sPrefix+"CLIIMPREOP" );
      chkCliImpMerm.setInternalname( sPrefix+"CLIIMPMERM" );
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE8" ;
      divDvpanel_unnamedtable8_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE8_CELL" ;
      edtCliEst_Internalname = sPrefix+"CLIEST" ;
      chkCliEt1.setInternalname( sPrefix+"CLIET1" );
      chkCliEt2.setInternalname( sPrefix+"CLIET2" );
      chkCliEt3.setInternalname( sPrefix+"CLIET3" );
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE9" ;
      divDvpanel_unnamedtable9_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE9_CELL" ;
      cmbCliEti.setInternalname( sPrefix+"CLIETI" );
      chkCliEtiEN.setInternalname( sPrefix+"CLIETIEN" );
      chkCliEtiCN.setInternalname( sPrefix+"CLIETICN" );
      chkCliEtiCC.setInternalname( sPrefix+"CLIETICC" );
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE10" ;
      divDvpanel_unnamedtable10_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE10_CELL" ;
      dynSEGId.setInternalname( sPrefix+"SEGID" );
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      Dvpanel_unnamedtable11_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE11" ;
      divDvpanel_unnamedtable11_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE11_CELL" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtCliDivCod_Internalname = sPrefix+"CLIDIVCOD" ;
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
      edtZonGeoCod_Jsonclick = "" ;
      edtZonGeoCod_Enabled = 0 ;
      edtCod_pais_Jsonclick = "" ;
      edtCod_pais_Enabled = 0 ;
      edtCliDivCod_Jsonclick = "" ;
      edtCliDivCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      dynSEGId.setJsonclick( "" );
      dynSEGId.setEnabled( 0 );
      divDvpanel_unnamedtable11_cell_Class = "col-xs-12" ;
      chkCliEtiCC.setEnabled( 0 );
      chkCliEtiCN.setEnabled( 0 );
      chkCliEtiEN.setEnabled( 0 );
      cmbCliEti.setJsonclick( "" );
      cmbCliEti.setEnabled( 0 );
      divDvpanel_unnamedtable10_cell_Class = "col-xs-12" ;
      chkCliEt3.setEnabled( 0 );
      chkCliEt2.setEnabled( 0 );
      chkCliEt1.setEnabled( 0 );
      edtCliEst_Jsonclick = "" ;
      edtCliEst_Enabled = 0 ;
      divDvpanel_unnamedtable9_cell_Class = "col-xs-12" ;
      chkCliImpMerm.setEnabled( 0 );
      chkCliImpReop.setEnabled( 0 );
      chkCliFacMtsP.setEnabled( 0 );
      edtCliFacFmt_Jsonclick = "" ;
      edtCliFacFmt_Enabled = 0 ;
      chkCliFacFm.setEnabled( 0 );
      divDvpanel_unnamedtable8_cell_Class = "col-xs-12" ;
      edtCliUltNPz_Jsonclick = "" ;
      edtCliUltNPz_Enabled = 0 ;
      edtCliUltNPz_Visible = 1 ;
      divCliultnpz_cell_Class = "col-xs-12 col-sm-6" ;
      edtTpOpC_Jsonclick = "" ;
      edtTpOpC_Enabled = 0 ;
      edtTpOpC_Visible = 1 ;
      divTpopc_cell_Class = "col-xs-12 col-sm-6" ;
      chkCliEFx.setEnabled( 0 );
      chkCliEEm.setEnabled( 0 );
      chkCliAct.setEnabled( 0 );
      chkCliCtrl.setEnabled( 0 );
      cmbCliTipo.setJsonclick( "" );
      cmbCliTipo.setEnabled( 0 );
      edtCliUrg_Jsonclick = "" ;
      edtCliUrg_Enabled = 0 ;
      cmbCliPort.setJsonclick( "" );
      cmbCliPort.setEnabled( 0 );
      edtCliTrnCod_Jsonclick = "" ;
      edtCliTrnCod_Enabled = 0 ;
      edtCliCue_Jsonclick = "" ;
      edtCliCue_Enabled = 0 ;
      edtCliRef_Jsonclick = "" ;
      edtCliRef_Enabled = 0 ;
      edtCliPer_Jsonclick = "" ;
      edtCliPer_Enabled = 0 ;
      edtCliAlias_Jsonclick = "" ;
      edtCliAlias_Enabled = 0 ;
      edtCliCEE_Enabled = 0 ;
      edtCliObsF_Enabled = 0 ;
      edtCliObs_Enabled = 0 ;
      edtCliMailPk_Jsonclick = "" ;
      edtCliMailPk_Enabled = 0 ;
      edtCliMailPk_Visible = 1 ;
      divClimailpk_cell_Class = "col-xs-12 col-sm-6" ;
      edtClimailPr_Jsonclick = "" ;
      edtClimailPr_Enabled = 0 ;
      edtCliPerPr_Jsonclick = "" ;
      edtCliPerPr_Enabled = 0 ;
      edtCliPerPr_Visible = 1 ;
      divCliperpr_cell_Class = "col-xs-12 col-sm-6" ;
      edtCliMailGr_Jsonclick = "" ;
      edtCliMailGr_Enabled = 0 ;
      edtCliMailGr_Visible = 1 ;
      divClimailgr_cell_Class = "col-xs-12 col-sm-6" ;
      chkCliMailPkE.setEnabled( 0 );
      chkCliMailPkE.setVisible( 1 );
      divClimailpke_cell_Class = "col-xs-12 col-sm-6" ;
      chkCliMailGrE.setEnabled( 0 );
      chkCliMailGrE.setVisible( 1 );
      divClimailgre_cell_Class = "col-xs-12 col-sm-6" ;
      edtClimailFac_Jsonclick = "" ;
      edtClimailFac_Enabled = 0 ;
      edtCliemf_Jsonclick = "" ;
      edtCliemf_Enabled = 0 ;
      edtClimailAlb_Jsonclick = "" ;
      edtClimailAlb_Enabled = 0 ;
      edtCliEmail_Jsonclick = "" ;
      edtCliEmail_Enabled = 0 ;
      chkCliTub.setEnabled( 0 );
      chkCliValA.setEnabled( 0 );
      chkCliAlbAgr.setEnabled( 0 );
      edtCliCopAlb_Jsonclick = "" ;
      edtCliCopAlb_Enabled = 0 ;
      edtCliP0_Jsonclick = "" ;
      edtCliP0_Enabled = 0 ;
      edtCliFacCop_Jsonclick = "" ;
      edtCliFacCop_Enabled = 0 ;
      cmbCliPerFac.setJsonclick( "" );
      cmbCliPerFac.setEnabled( 0 );
      edtCliDes_Jsonclick = "" ;
      edtCliDes_Enabled = 0 ;
      edtCliFinVac_Jsonclick = "" ;
      edtCliFinVac_Enabled = 0 ;
      edtCliIniVac_Jsonclick = "" ;
      edtCliIniVac_Enabled = 0 ;
      edtCliFactor_Jsonclick = "" ;
      edtCliFactor_Enabled = 0 ;
      edtCliValFijo_Jsonclick = "" ;
      edtCliValFijo_Enabled = 0 ;
      divDvpanel_unnamedtable2_cell_Class = "col-xs-12" ;
      edtCliFax_Jsonclick = "" ;
      edtCliFax_Enabled = 0 ;
      edtCliTelex_Jsonclick = "" ;
      edtCliTelex_Enabled = 0 ;
      edtCliTel2_Jsonclick = "" ;
      edtCliTel2_Enabled = 0 ;
      edtCliTel1_Jsonclick = "" ;
      edtCliTel1_Enabled = 0 ;
      edtPrvCod_Jsonclick = "" ;
      edtPrvCod_Enabled = 0 ;
      edtCliCp2_Jsonclick = "" ;
      edtCliCp2_Enabled = 0 ;
      edtCliCp_Jsonclick = "" ;
      edtCliCp_Enabled = 0 ;
      edtCliPob_Jsonclick = "" ;
      edtCliPob_Enabled = 0 ;
      edtCliDom2_Jsonclick = "" ;
      edtCliDom2_Enabled = 0 ;
      edtCliDom_Jsonclick = "" ;
      edtCliDom_Enabled = 0 ;
      edtCliNom1_Jsonclick = "" ;
      edtCliNom1_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliIe_Jsonclick = "" ;
      edtCliIe_Enabled = 0 ;
      edtCliNif_Jsonclick = "" ;
      edtCliNif_Enabled = 0 ;
      edtCliTop25_Jsonclick = "" ;
      edtCliTop25_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      Dvpanel_unnamedtable11_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Iconposition = "Right" ;
      Dvpanel_unnamedtable11_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable11_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Title = "" ;
      Dvpanel_unnamedtable11_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable11_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Width = "100%" ;
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Title = httpContext.getMessage( "Etiquetas", "") ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "Tints Orient", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = httpContext.getMessage( "Parametros Moda 21", "") ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Otros Datos", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Observaciones", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Emails", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Datos Facturacion", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Vacaciones", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Precios (Factores)", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Telefonos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      cmbCliPerFac.setName( "CLIPERFAC" );
      cmbCliPerFac.setWebtags( "" );
      cmbCliPerFac.addItem("0", httpContext.getMessage( "Cualquier momento", ""), (short)(0));
      cmbCliPerFac.addItem("1", httpContext.getMessage( "Semanal", ""), (short)(0));
      cmbCliPerFac.addItem("2", httpContext.getMessage( "Quincenal", ""), (short)(0));
      cmbCliPerFac.addItem("3", httpContext.getMessage( "Mensual", ""), (short)(0));
      if ( cmbCliPerFac.getItemCount() > 0 )
      {
      }
      chkCliAlbAgr.setName( "CLIALBAGR" );
      chkCliAlbAgr.setWebtags( "" );
      chkCliAlbAgr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliAlbAgr.getInternalname(), "TitleCaption", chkCliAlbAgr.getCaption(), true);
      chkCliAlbAgr.setCheckedValue( "N" );
      chkCliValA.setName( "CLIVALA" );
      chkCliValA.setWebtags( "" );
      chkCliValA.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliValA.getInternalname(), "TitleCaption", chkCliValA.getCaption(), true);
      chkCliValA.setCheckedValue( "N" );
      chkCliTub.setName( "CLITUB" );
      chkCliTub.setWebtags( "" );
      chkCliTub.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliTub.getInternalname(), "TitleCaption", chkCliTub.getCaption(), true);
      chkCliTub.setCheckedValue( "N" );
      chkCliMailGrE.setName( "CLIMAILGRE" );
      chkCliMailGrE.setWebtags( "" );
      chkCliMailGrE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliMailGrE.getInternalname(), "TitleCaption", chkCliMailGrE.getCaption(), true);
      chkCliMailGrE.setCheckedValue( "N" );
      chkCliMailPkE.setName( "CLIMAILPKE" );
      chkCliMailPkE.setWebtags( "" );
      chkCliMailPkE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliMailPkE.getInternalname(), "TitleCaption", chkCliMailPkE.getCaption(), true);
      chkCliMailPkE.setCheckedValue( "N" );
      cmbCliPort.setName( "CLIPORT" );
      cmbCliPort.setWebtags( "" );
      cmbCliPort.addItem("D", httpContext.getMessage( "Debidos", ""), (short)(0));
      cmbCliPort.addItem("P", httpContext.getMessage( "Pagados", ""), (short)(0));
      if ( cmbCliPort.getItemCount() > 0 )
      {
      }
      cmbCliTipo.setName( "CLITIPO" );
      cmbCliTipo.setWebtags( "" );
      cmbCliTipo.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbCliTipo.addItem("E", httpContext.getMessage( "Externo", ""), (short)(0));
      if ( cmbCliTipo.getItemCount() > 0 )
      {
      }
      chkCliCtrl.setName( "CLICTRL" );
      chkCliCtrl.setWebtags( "" );
      chkCliCtrl.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliCtrl.getInternalname(), "TitleCaption", chkCliCtrl.getCaption(), true);
      chkCliCtrl.setCheckedValue( "N" );
      chkCliAct.setName( "CLIACT" );
      chkCliAct.setWebtags( "" );
      chkCliAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliAct.getInternalname(), "TitleCaption", chkCliAct.getCaption(), true);
      chkCliAct.setCheckedValue( "N" );
      chkCliEEm.setName( "CLIEEM" );
      chkCliEEm.setWebtags( "" );
      chkCliEEm.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEEm.getInternalname(), "TitleCaption", chkCliEEm.getCaption(), true);
      chkCliEEm.setCheckedValue( "N" );
      chkCliEFx.setName( "CLIEFX" );
      chkCliEFx.setWebtags( "" );
      chkCliEFx.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEFx.getInternalname(), "TitleCaption", chkCliEFx.getCaption(), true);
      chkCliEFx.setCheckedValue( "N" );
      chkCliFacFm.setName( "CLIFACFM" );
      chkCliFacFm.setWebtags( "" );
      chkCliFacFm.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliFacFm.getInternalname(), "TitleCaption", chkCliFacFm.getCaption(), true);
      chkCliFacFm.setCheckedValue( "N" );
      chkCliFacMtsP.setName( "CLIFACMTSP" );
      chkCliFacMtsP.setWebtags( "" );
      chkCliFacMtsP.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliFacMtsP.getInternalname(), "TitleCaption", chkCliFacMtsP.getCaption(), true);
      chkCliFacMtsP.setCheckedValue( "N" );
      chkCliImpReop.setName( "CLIIMPREOP" );
      chkCliImpReop.setWebtags( "" );
      chkCliImpReop.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliImpReop.getInternalname(), "TitleCaption", chkCliImpReop.getCaption(), true);
      chkCliImpReop.setCheckedValue( "N" );
      chkCliImpMerm.setName( "CLIIMPMERM" );
      chkCliImpMerm.setWebtags( "" );
      chkCliImpMerm.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliImpMerm.getInternalname(), "TitleCaption", chkCliImpMerm.getCaption(), true);
      chkCliImpMerm.setCheckedValue( "N" );
      chkCliEt1.setName( "CLIET1" );
      chkCliEt1.setWebtags( "" );
      chkCliEt1.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEt1.getInternalname(), "TitleCaption", chkCliEt1.getCaption(), true);
      chkCliEt1.setCheckedValue( "N" );
      chkCliEt2.setName( "CLIET2" );
      chkCliEt2.setWebtags( "" );
      chkCliEt2.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEt2.getInternalname(), "TitleCaption", chkCliEt2.getCaption(), true);
      chkCliEt2.setCheckedValue( "N" );
      chkCliEt3.setName( "CLIET3" );
      chkCliEt3.setWebtags( "" );
      chkCliEt3.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEt3.getInternalname(), "TitleCaption", chkCliEt3.getCaption(), true);
      chkCliEt3.setCheckedValue( "N" );
      cmbCliEti.setName( "CLIETI" );
      cmbCliEti.setWebtags( "" );
      cmbCliEti.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbCliEti.addItem("N", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbCliEti.getItemCount() > 0 )
      {
      }
      chkCliEtiEN.setName( "CLIETIEN" );
      chkCliEtiEN.setWebtags( "" );
      chkCliEtiEN.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEtiEN.getInternalname(), "TitleCaption", chkCliEtiEN.getCaption(), true);
      chkCliEtiEN.setCheckedValue( "N" );
      chkCliEtiCN.setName( "CLIETICN" );
      chkCliEtiCN.setWebtags( "" );
      chkCliEtiCN.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEtiCN.getInternalname(), "TitleCaption", chkCliEtiCN.getCaption(), true);
      chkCliEtiCN.setCheckedValue( "N" );
      chkCliEtiCC.setName( "CLIETICC" );
      chkCliEtiCC.setWebtags( "" );
      chkCliEtiCC.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkCliEtiCC.getInternalname(), "TitleCaption", chkCliEtiCC.getCaption(), true);
      chkCliEtiCC.setCheckedValue( "N" );
      dynSEGId.setName( "SEGID" );
      dynSEGId.setWebtags( "" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSEGId'},{av:'A12753SEGId',fld:'SEGID',pic:''},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A13291CliFacFm',fld:'CLIFACFM',pic:''},{av:'A13236CliFacMtsP',fld:'CLIFACMTSP',pic:''},{av:'A13012CliImpReop',fld:'CLIIMPREOP',pic:''},{av:'A12909CliImpMerm',fld:'CLIIMPMERM',pic:''},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'AV13Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e118B1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e128B1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
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
      AV13Pgmname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A278CliNif = "" ;
      A6185CliIe = "" ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A260CliDom = "" ;
      A5649CliDom2 = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A4828CliCp2 = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A303CliTel1 = "" ;
      A304CliTel2 = "" ;
      A305CliTelex = "" ;
      A274CliFax = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      A13245CliValFijo = DecimalUtil.ZERO ;
      A13246CliFactor = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      A277CliIniVac = "" ;
      A276CliFinVac = "" ;
      A258CliDes = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      A250CliAlbAgr = "" ;
      A1902CliValA = "" ;
      A1466CliTub = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      A3633CliEmail = "" ;
      A13802ClimailAlb = "" ;
      A10050Cliemf = "" ;
      A13803ClimailFac = "" ;
      A11622CliMailGrE = "" ;
      A11623CliMailPkE = "" ;
      A11620CliMailGr = "" ;
      A11702CliPerPr = "" ;
      A11701ClimailPr = "" ;
      A11621CliMailPk = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A3629CliObs = "" ;
      A10059CliObsF = "" ;
      A10414CliCEE = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      A2748CliAlias = "" ;
      A293CliPer = "" ;
      A298CliRef = "" ;
      A257CliCue = "" ;
      A3630CliPort = "" ;
      A5648CliTipo = "" ;
      A1901CliCtrl = "" ;
      A10045CliAct = "" ;
      A9855CliEEm = "" ;
      A9854CliEFx = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      A13291CliFacFm = "" ;
      A13236CliFacMtsP = "" ;
      A13012CliImpReop = "" ;
      A12909CliImpMerm = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      A8723CliEst = "" ;
      A10046CliEt1 = "" ;
      A10047CliEt2 = "" ;
      A10048CliEt3 = "" ;
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      A272CliEti = "" ;
      A2843CliEtiEN = "" ;
      A2842CliEtiCN = "" ;
      A2841CliEtiCC = "" ;
      ucDvpanel_unnamedtable11 = new com.genexus.webpanels.GXUserControl();
      A12753SEGId = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H008B2_A396EmprCod = new String[] {""} ;
      H008B2_A12753SEGId = new String[] {""} ;
      H008B2_n12753SEGId = new boolean[] {false} ;
      H008B2_A12754SEGDs = new String[] {""} ;
      H008B2_n12754SEGDs = new boolean[] {false} ;
      H008B3_A396EmprCod = new String[] {""} ;
      H008B3_A252CliCod = new int[1] ;
      H008B3_A3140CliDivCod = new byte[1] ;
      H008B3_n3140CliDivCod = new boolean[] {false} ;
      H008B3_A12753SEGId = new String[] {""} ;
      H008B3_n12753SEGId = new boolean[] {false} ;
      H008B3_A2841CliEtiCC = new String[] {""} ;
      H008B3_A2842CliEtiCN = new String[] {""} ;
      H008B3_A2843CliEtiEN = new String[] {""} ;
      H008B3_A272CliEti = new String[] {""} ;
      H008B3_A10048CliEt3 = new String[] {""} ;
      H008B3_A10047CliEt2 = new String[] {""} ;
      H008B3_A10046CliEt1 = new String[] {""} ;
      H008B3_A8723CliEst = new String[] {""} ;
      H008B3_A12909CliImpMerm = new String[] {""} ;
      H008B3_A13012CliImpReop = new String[] {""} ;
      H008B3_A13236CliFacMtsP = new String[] {""} ;
      H008B3_A13292CliFacFmt = new short[1] ;
      H008B3_A13291CliFacFm = new String[] {""} ;
      H008B3_A11761CliUltNPz = new int[1] ;
      H008B3_A11180TpOpC = new short[1] ;
      H008B3_n11180TpOpC = new boolean[] {false} ;
      H008B3_A9854CliEFx = new String[] {""} ;
      H008B3_A9855CliEEm = new String[] {""} ;
      H008B3_A10045CliAct = new String[] {""} ;
      H008B3_A1901CliCtrl = new String[] {""} ;
      H008B3_A5648CliTipo = new String[] {""} ;
      H008B3_A306CliUrg = new byte[1] ;
      H008B3_A3630CliPort = new String[] {""} ;
      H008B3_A3631CliTrnCod = new short[1] ;
      H008B3_A257CliCue = new String[] {""} ;
      H008B3_A298CliRef = new String[] {""} ;
      H008B3_A293CliPer = new String[] {""} ;
      H008B3_A2748CliAlias = new String[] {""} ;
      H008B3_A10414CliCEE = new String[] {""} ;
      H008B3_A10059CliObsF = new String[] {""} ;
      H008B3_A3629CliObs = new String[] {""} ;
      H008B3_A11621CliMailPk = new String[] {""} ;
      H008B3_A11701ClimailPr = new String[] {""} ;
      H008B3_A11702CliPerPr = new String[] {""} ;
      H008B3_A11620CliMailGr = new String[] {""} ;
      H008B3_A11623CliMailPkE = new String[] {""} ;
      H008B3_A11622CliMailGrE = new String[] {""} ;
      H008B3_A13803ClimailFac = new String[] {""} ;
      H008B3_A10050Cliemf = new String[] {""} ;
      H008B3_A13802ClimailAlb = new String[] {""} ;
      H008B3_A3633CliEmail = new String[] {""} ;
      H008B3_A1466CliTub = new String[] {""} ;
      H008B3_A1902CliValA = new String[] {""} ;
      H008B3_A250CliAlbAgr = new String[] {""} ;
      H008B3_A3632CliCopAlb = new byte[1] ;
      H008B3_A9853CliP0 = new short[1] ;
      H008B3_A273CliFacCop = new byte[1] ;
      H008B3_A294CliPerFac = new byte[1] ;
      H008B3_A258CliDes = new String[] {""} ;
      H008B3_A276CliFinVac = new String[] {""} ;
      H008B3_A277CliIniVac = new String[] {""} ;
      H008B3_A13246CliFactor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H008B3_A13245CliValFijo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H008B3_A274CliFax = new String[] {""} ;
      H008B3_A305CliTelex = new String[] {""} ;
      H008B3_A304CliTel2 = new String[] {""} ;
      H008B3_A303CliTel1 = new String[] {""} ;
      H008B3_A858ZonGeoCod = new short[1] ;
      H008B3_A10301Cod_pais = new short[1] ;
      H008B3_n10301Cod_pais = new boolean[] {false} ;
      H008B3_A781PrvCod = new short[1] ;
      H008B3_A4828CliCp2 = new String[] {""} ;
      H008B3_A256CliCp = new String[] {""} ;
      H008B3_A295CliPob = new String[] {""} ;
      H008B3_A5649CliDom2 = new String[] {""} ;
      H008B3_A260CliDom = new String[] {""} ;
      H008B3_A3644CliNom1 = new String[] {""} ;
      H008B3_A279CliNom = new String[] {""} ;
      H008B3_A6185CliIe = new String[] {""} ;
      H008B3_A278CliNif = new String[] {""} ;
      H008B3_A14243CliTop25 = new short[1] ;
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
      sCtrlA252CliCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclientgeneral__default(),
         new Object[] {
             new Object[] {
            H008B2_A396EmprCod, H008B2_A12753SEGId, H008B2_A12754SEGDs, H008B2_n12754SEGDs
            }
            , new Object[] {
            H008B3_A396EmprCod, H008B3_A252CliCod, H008B3_A3140CliDivCod, H008B3_n3140CliDivCod, H008B3_A12753SEGId, H008B3_n12753SEGId, H008B3_A2841CliEtiCC, H008B3_A2842CliEtiCN, H008B3_A2843CliEtiEN, H008B3_A272CliEti,
            H008B3_A10048CliEt3, H008B3_A10047CliEt2, H008B3_A10046CliEt1, H008B3_A8723CliEst, H008B3_A12909CliImpMerm, H008B3_A13012CliImpReop, H008B3_A13236CliFacMtsP, H008B3_A13292CliFacFmt, H008B3_A13291CliFacFm, H008B3_A11761CliUltNPz,
            H008B3_A11180TpOpC, H008B3_n11180TpOpC, H008B3_A9854CliEFx, H008B3_A9855CliEEm, H008B3_A10045CliAct, H008B3_A1901CliCtrl, H008B3_A5648CliTipo, H008B3_A306CliUrg, H008B3_A3630CliPort, H008B3_A3631CliTrnCod,
            H008B3_A257CliCue, H008B3_A298CliRef, H008B3_A293CliPer, H008B3_A2748CliAlias, H008B3_A10414CliCEE, H008B3_A10059CliObsF, H008B3_A3629CliObs, H008B3_A11621CliMailPk, H008B3_A11701ClimailPr, H008B3_A11702CliPerPr,
            H008B3_A11620CliMailGr, H008B3_A11623CliMailPkE, H008B3_A11622CliMailGrE, H008B3_A13803ClimailFac, H008B3_A10050Cliemf, H008B3_A13802ClimailAlb, H008B3_A3633CliEmail, H008B3_A1466CliTub, H008B3_A1902CliValA, H008B3_A250CliAlbAgr,
            H008B3_A3632CliCopAlb, H008B3_A9853CliP0, H008B3_A273CliFacCop, H008B3_A294CliPerFac, H008B3_A258CliDes, H008B3_A276CliFinVac, H008B3_A277CliIniVac, H008B3_A13246CliFactor, H008B3_A13245CliValFijo, H008B3_A274CliFax,
            H008B3_A305CliTelex, H008B3_A304CliTel2, H008B3_A303CliTel1, H008B3_A858ZonGeoCod, H008B3_A10301Cod_pais, H008B3_n10301Cod_pais, H008B3_A781PrvCod, H008B3_A4828CliCp2, H008B3_A256CliCp, H008B3_A295CliPob,
            H008B3_A5649CliDom2, H008B3_A260CliDom, H008B3_A3644CliNom1, H008B3_A279CliNom, H008B3_A6185CliIe, H008B3_A278CliNif, H008B3_A14243CliTop25
            }
         }
      );
      AV13Pgmname = "TCLIENTGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "TCLIENTGeneral" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A294CliPerFac ;
   private byte A273CliFacCop ;
   private byte A3632CliCopAlb ;
   private byte A306CliUrg ;
   private byte A3140CliDivCod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A14243CliTop25 ;
   private short A781PrvCod ;
   private short A9853CliP0 ;
   private short A3631CliTrnCod ;
   private short A11180TpOpC ;
   private short A13292CliFacFmt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A858ZonGeoCod ;
   private short A10301Cod_pais ;
   private int wcpOA252CliCod ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliTop25_Enabled ;
   private int edtCliNif_Enabled ;
   private int edtCliIe_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtCliNom1_Enabled ;
   private int edtCliDom_Enabled ;
   private int edtCliDom2_Enabled ;
   private int edtCliPob_Enabled ;
   private int edtCliCp_Enabled ;
   private int edtCliCp2_Enabled ;
   private int edtPrvCod_Enabled ;
   private int edtCliTel1_Enabled ;
   private int edtCliTel2_Enabled ;
   private int edtCliTelex_Enabled ;
   private int edtCliFax_Enabled ;
   private int edtCliValFijo_Enabled ;
   private int edtCliFactor_Enabled ;
   private int edtCliIniVac_Enabled ;
   private int edtCliFinVac_Enabled ;
   private int edtCliDes_Enabled ;
   private int edtCliFacCop_Enabled ;
   private int edtCliP0_Enabled ;
   private int edtCliCopAlb_Enabled ;
   private int edtCliEmail_Enabled ;
   private int edtClimailAlb_Enabled ;
   private int edtCliemf_Enabled ;
   private int edtClimailFac_Enabled ;
   private int edtCliMailGr_Visible ;
   private int edtCliMailGr_Enabled ;
   private int edtCliPerPr_Visible ;
   private int edtCliPerPr_Enabled ;
   private int edtClimailPr_Enabled ;
   private int edtCliMailPk_Visible ;
   private int edtCliMailPk_Enabled ;
   private int edtCliObs_Enabled ;
   private int edtCliObsF_Enabled ;
   private int edtCliCEE_Enabled ;
   private int edtCliAlias_Enabled ;
   private int edtCliPer_Enabled ;
   private int edtCliRef_Enabled ;
   private int edtCliCue_Enabled ;
   private int edtCliTrnCod_Enabled ;
   private int edtCliUrg_Enabled ;
   private int edtTpOpC_Visible ;
   private int edtTpOpC_Enabled ;
   private int edtCliUltNPz_Visible ;
   private int A11761CliUltNPz ;
   private int edtCliUltNPz_Enabled ;
   private int edtCliFacFmt_Enabled ;
   private int edtCliEst_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtCliDivCod_Visible ;
   private int gxdynajaxindex ;
   private int edtCod_pais_Enabled ;
   private int edtZonGeoCod_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A13245CliValFijo ;
   private java.math.BigDecimal A13246CliFactor ;
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
   private String AV13Pgmname ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_unnamedtable10_Width ;
   private String Dvpanel_unnamedtable10_Cls ;
   private String Dvpanel_unnamedtable10_Title ;
   private String Dvpanel_unnamedtable10_Iconposition ;
   private String Dvpanel_unnamedtable11_Width ;
   private String Dvpanel_unnamedtable11_Cls ;
   private String Dvpanel_unnamedtable11_Title ;
   private String Dvpanel_unnamedtable11_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliTop25_Internalname ;
   private String edtCliTop25_Jsonclick ;
   private String edtCliNif_Internalname ;
   private String A278CliNif ;
   private String edtCliNif_Jsonclick ;
   private String edtCliIe_Internalname ;
   private String A6185CliIe ;
   private String edtCliIe_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtCliNom1_Internalname ;
   private String A3644CliNom1 ;
   private String edtCliNom1_Jsonclick ;
   private String edtCliDom_Internalname ;
   private String A260CliDom ;
   private String edtCliDom_Jsonclick ;
   private String edtCliDom2_Internalname ;
   private String A5649CliDom2 ;
   private String edtCliDom2_Jsonclick ;
   private String edtCliPob_Internalname ;
   private String A295CliPob ;
   private String edtCliPob_Jsonclick ;
   private String divUnnamedtable13_Internalname ;
   private String edtCliCp_Internalname ;
   private String A256CliCp ;
   private String edtCliCp_Jsonclick ;
   private String edtCliCp2_Internalname ;
   private String A4828CliCp2 ;
   private String edtCliCp2_Jsonclick ;
   private String edtPrvCod_Internalname ;
   private String edtPrvCod_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtCliTel1_Internalname ;
   private String A303CliTel1 ;
   private String edtCliTel1_Jsonclick ;
   private String edtCliTel2_Internalname ;
   private String A304CliTel2 ;
   private String edtCliTel2_Jsonclick ;
   private String edtCliTelex_Internalname ;
   private String A305CliTelex ;
   private String edtCliTelex_Jsonclick ;
   private String edtCliFax_Internalname ;
   private String A274CliFax ;
   private String edtCliFax_Jsonclick ;
   private String divDvpanel_unnamedtable2_cell_Internalname ;
   private String divDvpanel_unnamedtable2_cell_Class ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliValFijo_Internalname ;
   private String edtCliValFijo_Jsonclick ;
   private String edtCliFactor_Internalname ;
   private String edtCliFactor_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtCliIniVac_Internalname ;
   private String A277CliIniVac ;
   private String edtCliIniVac_Jsonclick ;
   private String edtCliFinVac_Internalname ;
   private String A276CliFinVac ;
   private String edtCliFinVac_Jsonclick ;
   private String edtCliDes_Internalname ;
   private String A258CliDes ;
   private String edtCliDes_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtCliFacCop_Internalname ;
   private String edtCliFacCop_Jsonclick ;
   private String edtCliP0_Internalname ;
   private String edtCliP0_Jsonclick ;
   private String edtCliCopAlb_Internalname ;
   private String edtCliCopAlb_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String A250CliAlbAgr ;
   private String A1902CliValA ;
   private String A1466CliTub ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtCliEmail_Internalname ;
   private String A3633CliEmail ;
   private String edtCliEmail_Jsonclick ;
   private String edtClimailAlb_Internalname ;
   private String edtClimailAlb_Jsonclick ;
   private String edtCliemf_Internalname ;
   private String A10050Cliemf ;
   private String edtCliemf_Jsonclick ;
   private String edtClimailFac_Internalname ;
   private String edtClimailFac_Jsonclick ;
   private String divClimailgre_cell_Internalname ;
   private String divClimailgre_cell_Class ;
   private String A11622CliMailGrE ;
   private String divClimailpke_cell_Internalname ;
   private String divClimailpke_cell_Class ;
   private String A11623CliMailPkE ;
   private String divClimailgr_cell_Internalname ;
   private String divClimailgr_cell_Class ;
   private String edtCliMailGr_Internalname ;
   private String A11620CliMailGr ;
   private String edtCliMailGr_Jsonclick ;
   private String divCliperpr_cell_Internalname ;
   private String divCliperpr_cell_Class ;
   private String edtCliPerPr_Internalname ;
   private String A11702CliPerPr ;
   private String edtCliPerPr_Jsonclick ;
   private String edtClimailPr_Internalname ;
   private String A11701ClimailPr ;
   private String edtClimailPr_Jsonclick ;
   private String divClimailpk_cell_Internalname ;
   private String divClimailpk_cell_Class ;
   private String edtCliMailPk_Internalname ;
   private String A11621CliMailPk ;
   private String edtCliMailPk_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtCliObs_Internalname ;
   private String edtCliObsF_Internalname ;
   private String A10059CliObsF ;
   private String edtCliCEE_Internalname ;
   private String A10414CliCEE ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtCliAlias_Internalname ;
   private String A2748CliAlias ;
   private String edtCliAlias_Jsonclick ;
   private String edtCliPer_Internalname ;
   private String A293CliPer ;
   private String edtCliPer_Jsonclick ;
   private String edtCliRef_Internalname ;
   private String A298CliRef ;
   private String edtCliRef_Jsonclick ;
   private String edtCliCue_Internalname ;
   private String A257CliCue ;
   private String edtCliCue_Jsonclick ;
   private String edtCliTrnCod_Internalname ;
   private String edtCliTrnCod_Jsonclick ;
   private String A3630CliPort ;
   private String edtCliUrg_Internalname ;
   private String edtCliUrg_Jsonclick ;
   private String A5648CliTipo ;
   private String A1901CliCtrl ;
   private String A10045CliAct ;
   private String A9855CliEEm ;
   private String A9854CliEFx ;
   private String divTpopc_cell_Internalname ;
   private String divTpopc_cell_Class ;
   private String edtTpOpC_Internalname ;
   private String edtTpOpC_Jsonclick ;
   private String divCliultnpz_cell_Internalname ;
   private String divCliultnpz_cell_Class ;
   private String edtCliUltNPz_Internalname ;
   private String edtCliUltNPz_Jsonclick ;
   private String divDvpanel_unnamedtable8_cell_Internalname ;
   private String divDvpanel_unnamedtable8_cell_Class ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String A13291CliFacFm ;
   private String edtCliFacFmt_Internalname ;
   private String edtCliFacFmt_Jsonclick ;
   private String A13236CliFacMtsP ;
   private String A13012CliImpReop ;
   private String A12909CliImpMerm ;
   private String divDvpanel_unnamedtable9_cell_Internalname ;
   private String divDvpanel_unnamedtable9_cell_Class ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtCliEst_Internalname ;
   private String A8723CliEst ;
   private String edtCliEst_Jsonclick ;
   private String A10046CliEt1 ;
   private String A10047CliEt2 ;
   private String A10048CliEt3 ;
   private String divDvpanel_unnamedtable10_cell_Internalname ;
   private String divDvpanel_unnamedtable10_cell_Class ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String A272CliEti ;
   private String A2843CliEtiEN ;
   private String A2842CliEtiCN ;
   private String A2841CliEtiCC ;
   private String divDvpanel_unnamedtable11_cell_Internalname ;
   private String divDvpanel_unnamedtable11_cell_Class ;
   private String Dvpanel_unnamedtable11_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String A12753SEGId ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtCliDivCod_Internalname ;
   private String edtCliDivCod_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtCod_pais_Internalname ;
   private String edtZonGeoCod_Internalname ;
   private String hsh ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15Emprcod ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblTablemergedunnamedtable14_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String edtCod_pais_Jsonclick ;
   private String edtZonGeoCod_Jsonclick ;
   private String divUnnamedtable15_Internalname ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA252CliCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Dvpanel_unnamedtable8_Autowidth ;
   private boolean Dvpanel_unnamedtable8_Autoheight ;
   private boolean Dvpanel_unnamedtable8_Collapsible ;
   private boolean Dvpanel_unnamedtable8_Collapsed ;
   private boolean Dvpanel_unnamedtable8_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable8_Autoscroll ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n12753SEGId ;
   private boolean n3140CliDivCod ;
   private boolean n11180TpOpC ;
   private boolean n10301Cod_pais ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13802ClimailAlb ;
   private String A13803ClimailFac ;
   private String A3629CliObs ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable11 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCliPerFac ;
   private ICheckbox chkCliAlbAgr ;
   private ICheckbox chkCliValA ;
   private ICheckbox chkCliTub ;
   private ICheckbox chkCliMailGrE ;
   private ICheckbox chkCliMailPkE ;
   private HTMLChoice cmbCliPort ;
   private HTMLChoice cmbCliTipo ;
   private ICheckbox chkCliCtrl ;
   private ICheckbox chkCliAct ;
   private ICheckbox chkCliEEm ;
   private ICheckbox chkCliEFx ;
   private ICheckbox chkCliFacFm ;
   private ICheckbox chkCliFacMtsP ;
   private ICheckbox chkCliImpReop ;
   private ICheckbox chkCliImpMerm ;
   private ICheckbox chkCliEt1 ;
   private ICheckbox chkCliEt2 ;
   private ICheckbox chkCliEt3 ;
   private HTMLChoice cmbCliEti ;
   private ICheckbox chkCliEtiEN ;
   private ICheckbox chkCliEtiCN ;
   private ICheckbox chkCliEtiCC ;
   private HTMLChoice dynSEGId ;
   private IDataStoreProvider pr_default ;
   private String[] H008B2_A396EmprCod ;
   private String[] H008B2_A12753SEGId ;
   private boolean[] H008B2_n12753SEGId ;
   private String[] H008B2_A12754SEGDs ;
   private boolean[] H008B2_n12754SEGDs ;
   private String[] H008B3_A396EmprCod ;
   private int[] H008B3_A252CliCod ;
   private byte[] H008B3_A3140CliDivCod ;
   private boolean[] H008B3_n3140CliDivCod ;
   private String[] H008B3_A12753SEGId ;
   private boolean[] H008B3_n12753SEGId ;
   private String[] H008B3_A2841CliEtiCC ;
   private String[] H008B3_A2842CliEtiCN ;
   private String[] H008B3_A2843CliEtiEN ;
   private String[] H008B3_A272CliEti ;
   private String[] H008B3_A10048CliEt3 ;
   private String[] H008B3_A10047CliEt2 ;
   private String[] H008B3_A10046CliEt1 ;
   private String[] H008B3_A8723CliEst ;
   private String[] H008B3_A12909CliImpMerm ;
   private String[] H008B3_A13012CliImpReop ;
   private String[] H008B3_A13236CliFacMtsP ;
   private short[] H008B3_A13292CliFacFmt ;
   private String[] H008B3_A13291CliFacFm ;
   private int[] H008B3_A11761CliUltNPz ;
   private short[] H008B3_A11180TpOpC ;
   private boolean[] H008B3_n11180TpOpC ;
   private String[] H008B3_A9854CliEFx ;
   private String[] H008B3_A9855CliEEm ;
   private String[] H008B3_A10045CliAct ;
   private String[] H008B3_A1901CliCtrl ;
   private String[] H008B3_A5648CliTipo ;
   private byte[] H008B3_A306CliUrg ;
   private String[] H008B3_A3630CliPort ;
   private short[] H008B3_A3631CliTrnCod ;
   private String[] H008B3_A257CliCue ;
   private String[] H008B3_A298CliRef ;
   private String[] H008B3_A293CliPer ;
   private String[] H008B3_A2748CliAlias ;
   private String[] H008B3_A10414CliCEE ;
   private String[] H008B3_A10059CliObsF ;
   private String[] H008B3_A3629CliObs ;
   private String[] H008B3_A11621CliMailPk ;
   private String[] H008B3_A11701ClimailPr ;
   private String[] H008B3_A11702CliPerPr ;
   private String[] H008B3_A11620CliMailGr ;
   private String[] H008B3_A11623CliMailPkE ;
   private String[] H008B3_A11622CliMailGrE ;
   private String[] H008B3_A13803ClimailFac ;
   private String[] H008B3_A10050Cliemf ;
   private String[] H008B3_A13802ClimailAlb ;
   private String[] H008B3_A3633CliEmail ;
   private String[] H008B3_A1466CliTub ;
   private String[] H008B3_A1902CliValA ;
   private String[] H008B3_A250CliAlbAgr ;
   private byte[] H008B3_A3632CliCopAlb ;
   private short[] H008B3_A9853CliP0 ;
   private byte[] H008B3_A273CliFacCop ;
   private byte[] H008B3_A294CliPerFac ;
   private String[] H008B3_A258CliDes ;
   private String[] H008B3_A276CliFinVac ;
   private String[] H008B3_A277CliIniVac ;
   private java.math.BigDecimal[] H008B3_A13246CliFactor ;
   private java.math.BigDecimal[] H008B3_A13245CliValFijo ;
   private String[] H008B3_A274CliFax ;
   private String[] H008B3_A305CliTelex ;
   private String[] H008B3_A304CliTel2 ;
   private String[] H008B3_A303CliTel1 ;
   private short[] H008B3_A858ZonGeoCod ;
   private short[] H008B3_A10301Cod_pais ;
   private boolean[] H008B3_n10301Cod_pais ;
   private short[] H008B3_A781PrvCod ;
   private String[] H008B3_A4828CliCp2 ;
   private String[] H008B3_A256CliCp ;
   private String[] H008B3_A295CliPob ;
   private String[] H008B3_A5649CliDom2 ;
   private String[] H008B3_A260CliDom ;
   private String[] H008B3_A3644CliNom1 ;
   private String[] H008B3_A279CliNom ;
   private String[] H008B3_A6185CliIe ;
   private String[] H008B3_A278CliNif ;
   private short[] H008B3_A14243CliTop25 ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tclientgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008B2", "SELECT EmprCod, SEGId, SEGDs FROM TXPSEGMTN WHERE EmprCod = ? ORDER BY SEGDs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H008B3", "SELECT EmprCod, CliCod, CliDivCod, SEGId, CliEtiCC, CliEtiCN, CliEtiEN, CliEti, CliEt3, CliEt2, CliEt1, CliEst, CliImpMerm, CliImpReop, CliFacMtsP, CliFacFmt, CliFacFm, CliUltNPz, TpOpC, CliEFx, CliEEm, CliAct, CliCtrl, CliTipo, CliUrg, CliPort, CliTrnCod, CliCue, CliRef, CliPer, CliAlias, CliCEE, CliObsF, CliObs, CliMailPk, ClimailPr, CliPerPr, CliMailGr, CliMailPkE, CliMailGrE, ClimailFac, Cliemf, ClimailAlb, CliEmail, CliTub, CliValA, CliAlbAgr, CliCopAlb, CliP0, CliFacCop, CliPerFac, CliDes, CliFinVac, CliIniVac, CliFactor, CliValFijo, CliFax, CliTelex, CliTel2, CliTel1, ZonGeoCod, Cod_pais, PrvCod, CliCp2, CliCp, CliPob, CliDom2, CliDom, CliNom1, CliNom, CliIe, CliNif, CliTop25 FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((short[]) buf[20])[0] = rslt.getShort(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((String[]) buf[25])[0] = rslt.getString(23, 1);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 1);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 8);
               ((String[]) buf[31])[0] = rslt.getString(29, 12);
               ((String[]) buf[32])[0] = rslt.getString(30, 20);
               ((String[]) buf[33])[0] = rslt.getString(31, 16);
               ((String[]) buf[34])[0] = rslt.getString(32, 200);
               ((String[]) buf[35])[0] = rslt.getString(33, 100);
               ((String[]) buf[36])[0] = rslt.getVarchar(34);
               ((String[]) buf[37])[0] = rslt.getString(35, 100);
               ((String[]) buf[38])[0] = rslt.getString(36, 200);
               ((String[]) buf[39])[0] = rslt.getString(37, 60);
               ((String[]) buf[40])[0] = rslt.getString(38, 100);
               ((String[]) buf[41])[0] = rslt.getString(39, 1);
               ((String[]) buf[42])[0] = rslt.getString(40, 1);
               ((String[]) buf[43])[0] = rslt.getVarchar(41);
               ((String[]) buf[44])[0] = rslt.getString(42, 40);
               ((String[]) buf[45])[0] = rslt.getVarchar(43);
               ((String[]) buf[46])[0] = rslt.getString(44, 40);
               ((String[]) buf[47])[0] = rslt.getString(45, 1);
               ((String[]) buf[48])[0] = rslt.getString(46, 1);
               ((String[]) buf[49])[0] = rslt.getString(47, 1);
               ((byte[]) buf[50])[0] = rslt.getByte(48);
               ((short[]) buf[51])[0] = rslt.getShort(49);
               ((byte[]) buf[52])[0] = rslt.getByte(50);
               ((byte[]) buf[53])[0] = rslt.getByte(51);
               ((String[]) buf[54])[0] = rslt.getString(52, 4);
               ((String[]) buf[55])[0] = rslt.getString(53, 4);
               ((String[]) buf[56])[0] = rslt.getString(54, 4);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(55,2);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(56,2);
               ((String[]) buf[59])[0] = rslt.getString(57, 10);
               ((String[]) buf[60])[0] = rslt.getString(58, 14);
               ((String[]) buf[61])[0] = rslt.getString(59, 15);
               ((String[]) buf[62])[0] = rslt.getString(60, 15);
               ((short[]) buf[63])[0] = rslt.getShort(61);
               ((short[]) buf[64])[0] = rslt.getShort(62);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(63);
               ((String[]) buf[67])[0] = rslt.getString(64, 6);
               ((String[]) buf[68])[0] = rslt.getString(65, 6);
               ((String[]) buf[69])[0] = rslt.getString(66, 30);
               ((String[]) buf[70])[0] = rslt.getString(67, 34);
               ((String[]) buf[71])[0] = rslt.getString(68, 34);
               ((String[]) buf[72])[0] = rslt.getString(69, 30);
               ((String[]) buf[73])[0] = rslt.getString(70, 30);
               ((String[]) buf[74])[0] = rslt.getString(71, 20);
               ((String[]) buf[75])[0] = rslt.getString(72, 20);
               ((short[]) buf[76])[0] = rslt.getShort(73);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

