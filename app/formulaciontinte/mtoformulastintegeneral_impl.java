package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mtoformulastintegeneral_impl extends GXWebComponent
{
   public mtoformulastintegeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mtoformulastintegeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastintegeneral_impl.class ));
   }

   public mtoformulastintegeneral_impl( int remoteHandle ,
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
      dynForCon = new HTMLChoice();
      cmbForBlo = new HTMLChoice();
      chkForPro = UIFactory.getCheckbox(this);
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
               A494ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A252CliCod),A494ForSer,A482ForColNom,Integer.valueOf(A483ForColNum),Byte.valueOf(A831TipColCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MACPROCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A1514MacProCod = httpContext.GetPar( "MacProCod") ;
               n1514MacProCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgamacprocod1BD0( A396EmprCod, A1514MacProCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"FORCON") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlaforcon1BD2( A396EmprCod) ;
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
         pa1BD2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Mto Formulas Tinte General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.mtoformulastintegeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MtoFormulasTinteGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV20Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\mtoformulastintegeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA252CliCod", GXutil.ltrim( localUtil.ntoc( wcpOA252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA494ForSer", GXutil.rtrim( wcpOA494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA482ForColNom", GXutil.rtrim( wcpOA482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA483ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOA483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA831TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOA831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORRGB", GXutil.ltrim( localUtil.ntoc( AV17ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
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

   public void renderHtmlCloseForm1BD2( )
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
      return "FormulacionTinte.MtoFormulasTinteGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mto Formulas Tinte General", "") ;
   }

   public void wb1BD0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.mtoformulastintegeneral");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForSer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForSer_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForColNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForColNum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipColCod_Internalname, httpContext.getMessage( "Tip. Colorante", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColores_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColores_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColores_Internalname, AV11Colores, GXutil.rtrim( localUtil.format( AV11Colores, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColores_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColores_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForRGB_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForRGB_Internalname, httpContext.getMessage( "RGB", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForRGB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForRGB_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForRGB_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPanto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForPanto_Internalname, httpContext.getMessage( "Pantone", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForPanto_Internalname, GXutil.rtrim( A12130ForPanto), GXutil.rtrim( localUtil.format( A12130ForPanto, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPanto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPanto_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNomCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNomCli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli_Internalname, GXutil.rtrim( A1191ForNomCli), GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNumCli_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTonal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTonal_Internalname, httpContext.getMessage( "Coleccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTonal_Internalname, GXutil.rtrim( A995ForTonal), GXutil.rtrim( localUtil.format( A995ForTonal, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTonal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTonal_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTipArt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTipArt_Internalname, httpContext.getMessage( "Tipo Art.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4384ForTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4384ForTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4384ForTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTipArt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTipArtD_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTipArtD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTipArtD_Internalname, GXutil.rtrim( A13929ForTipArtD), GXutil.rtrim( localUtil.format( A13929ForTipArtD, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTipArtD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTipArtD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTra1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTra1_Internalname, httpContext.getMessage( "Comp. 1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTra1_Internalname, GXutil.rtrim( A13914ForTra1), GXutil.rtrim( localUtil.format( A13914ForTra1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTra1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTra1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTraP1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTraP1_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTraP1_Internalname, GXutil.ltrim( localUtil.ntoc( A13915ForTraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForTraP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13915ForTraP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13915ForTraP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTraP1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTraP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTra2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTra2_Internalname, httpContext.getMessage( "Comp. 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTra2_Internalname, GXutil.rtrim( A13916ForTra2), GXutil.rtrim( localUtil.format( A13916ForTra2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTra2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTra2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTraP2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTraP2_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTraP2_Internalname, GXutil.ltrim( localUtil.ntoc( A13917ForTraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForTraP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13917ForTraP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13917ForTraP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTraP2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTraP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTra3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTra3_Internalname, httpContext.getMessage( "Comp. 3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTra3_Internalname, GXutil.rtrim( A13918ForTra3), GXutil.rtrim( localUtil.format( A13918ForTra3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTra3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTra3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTraP3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTraP3_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTraP3_Internalname, GXutil.ltrim( localUtil.ntoc( A13919ForTraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForTraP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13919ForTraP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13919ForTraP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTraP3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTraP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUrd1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUrd1_Internalname, httpContext.getMessage( "Comp. 1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUrd1_Internalname, GXutil.rtrim( A13920ForUrd1), GXutil.rtrim( localUtil.format( A13920ForUrd1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUrd1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUrd1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUrdP1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUrdP1_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUrdP1_Internalname, GXutil.ltrim( localUtil.ntoc( A13921ForUrdP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForUrdP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13921ForUrdP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13921ForUrdP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUrdP1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUrdP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUrd2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUrd2_Internalname, httpContext.getMessage( "Comp. 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUrd2_Internalname, GXutil.rtrim( A13922ForUrd2), GXutil.rtrim( localUtil.format( A13922ForUrd2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUrd2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUrd2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUrdP2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUrdP2_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUrdP2_Internalname, GXutil.ltrim( localUtil.ntoc( A13923ForUrdP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForUrdP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13923ForUrdP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13923ForUrdP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUrdP2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUrdP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUrd3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUrd3_Internalname, httpContext.getMessage( "Comp. 3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUrd3_Internalname, GXutil.rtrim( A13924ForUrd3), GXutil.rtrim( localUtil.format( A13924ForUrd3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUrd3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUrd3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUrdP3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUrdP3_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUrdP3_Internalname, GXutil.ltrim( localUtil.ntoc( A13925ForUrdP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForUrdP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13925ForUrdP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13925ForUrdP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUrdP3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUrdP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumArc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNumArc_Internalname, httpContext.getMessage( "Nº Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNumArc_Internalname, GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumArc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumArc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumArc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForopccli_cell_Internalname, 1, 0, "px", 0, "px", divForopccli_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForOpcCli_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForOpcCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForOpcCli_Internalname, httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForOpcCli_Internalname, GXutil.rtrim( A3560ForOpcCli), GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForOpcCli_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForOpcCli_Visible, edtForOpcCli_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForopnum_cell_Internalname, 1, 0, "px", 0, "px", divForopnum_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForOpNum_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForOpNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForOpNum_Internalname, httpContext.getMessage( "Opcion (#)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForOpNum_Internalname, GXutil.ltrim( localUtil.ntoc( A7537ForOpNum, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForOpNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7537ForOpNum), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7537ForOpNum), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForOpNum_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForOpNum_Visible, edtForOpNum_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForfecapr_cell_Internalname, 1, 0, "px", 0, "px", divForfecapr_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForFecApr_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFecApr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFecApr_Internalname, httpContext.getMessage( "Fecha Aprobacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecApr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecApr_Internalname, localUtil.format(A3558ForFecApr, "99/99/99"), localUtil.format( A3558ForFecApr, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecApr_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForFecApr_Visible, edtForFecApr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecApr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtForFecApr_Visible==0)||(edtForFecApr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForRelBan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForRelBan_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForRelBan_Internalname, GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForRelBan_Enabled!=0) ? localUtil.format( A2838ForRelBan, "ZZZ9.99") : localUtil.format( A2838ForRelBan, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForRelBan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForRelBan_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtIntCod_Internalname, httpContext.getMessage( "Intensidad", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForTotCol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForTotCol_Internalname, httpContext.getMessage( "Total Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForTotCol_Internalname, GXutil.ltrim( localUtil.ntoc( A14393ForTotCol, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForTotCol_Enabled!=0) ? localUtil.format( A14393ForTotCol, "ZZZZ9.99999") : localUtil.format( A14393ForTotCol, "ZZZZ9.99999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTotCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForTotCol_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMatCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMatCod_Internalname, httpContext.getMessage( "Matiz", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMatCod_Internalname, GXutil.ltrim( localUtil.ntoc( A626MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMatCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A626MatCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A626MatCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMatCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCodSol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCodSol_Internalname, httpContext.getMessage( "Solidez", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCodSol_Internalname, GXutil.ltrim( localUtil.ntoc( A3316CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCodSol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3316CodSol), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3316CodSol), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodSol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCodSol_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynForCon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynForCon.getInternalname(), httpContext.getMessage( "Control", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynForCon, dynForCon.getInternalname(), GXutil.trim( GXutil.str( A484ForCon, 1, 0)), 1, dynForCon.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynForCon.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         dynForCon.setValue( GXutil.trim( GXutil.str( A484ForCon, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynForCon.getInternalname(), "Values", dynForCon.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divIntcodf_cell_Internalname, 1, 0, "px", 0, "px", divIntcodf_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtIntCodF_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntCodF_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtIntCodF_Internalname, httpContext.getMessage( "Int Fact", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtIntCodF_Internalname, GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCodF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5362IntCodF), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5362IntCodF), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCodF_Jsonclick, 0, "AttributeFL", "", "", "", "", edtIntCodF_Visible, edtIntCodF_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForblo_cell_Internalname, 1, 0, "px", 0, "px", divForblo_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbForBlo.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbForBlo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbForBlo.getInternalname(), httpContext.getMessage( "Bloquear?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbForBlo, cmbForBlo.getInternalname(), GXutil.rtrim( A7781ForBlo), 1, cmbForBlo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", cmbForBlo.getVisible(), cmbForBlo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFam_cod_cell_Internalname, 1, 0, "px", 0, "px", divFam_cod_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtFam_Cod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFam_Cod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFam_Cod_Internalname, httpContext.getMessage( "Famila", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFam_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A8561Fam_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFam_Cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8561Fam_Cod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8561Fam_Cod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFam_Cod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtFam_Cod_Visible, edtFam_Cod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkForPro.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkForPro.getInternalname(), httpContext.getMessage( "Provisional", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkForPro.getInternalname(), A2749ForPro, "", httpContext.getMessage( "Provisional", ""), 1, chkForPro.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable7_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable7_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divFornomcli2_cell_Internalname, 1, 0, "px", 0, "px", divFornomcli2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForNomCli2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNomCli2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNomCli2_Internalname, httpContext.getMessage( "Hilaza", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli2_Internalname, GXutil.rtrim( A6379ForNomCli2), GXutil.rtrim( localUtil.format( A6379ForNomCli2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForNomCli2_Visible, edtForNomCli2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFornomcli3_cell_Internalname, 1, 0, "px", 0, "px", divFornomcli3_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForNomCli3_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNomCli3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli3_Internalname, GXutil.rtrim( A7029ForNomCli3), GXutil.rtrim( localUtil.format( A7029ForNomCli3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli3_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForNomCli3_Visible, edtForNomCli3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForlothil2_cell_Internalname, 1, 0, "px", 0, "px", divForlothil2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForLotHil2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForLotHil2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForLotHil2_Internalname, GXutil.rtrim( A12403ForLotHil2), GXutil.rtrim( localUtil.format( A12403ForLotHil2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForLotHil2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForLotHil2_Visible, edtForLotHil2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divForlothil3_cell_Internalname, 1, 0, "px", 0, "px", divForlothil3_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtForLotHil3_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForLotHil3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForLotHil3_Internalname, GXutil.rtrim( A12404ForLotHil3), GXutil.rtrim( localUtil.format( A12404ForLotHil3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForLotHil3_Jsonclick, 0, "AttributeFL", "", "", "", "", edtForLotHil3_Visible, edtForLotHil3_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForNumCol_Internalname, httpContext.getMessage( "Nº Interno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumCol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFec_Internalname, localUtil.format(A485ForFec, "99/99/99"), localUtil.format( A485ForFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUltMod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUltMod_Internalname, httpContext.getMessage( "Fec Ult Mod", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForUltMod_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUltMod_Internalname, localUtil.format(A495ForUltMod, "99/99/99"), localUtil.format( A495ForUltMod, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltMod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUltMod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForUltMod_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForUltMod_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacProCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMacProCod_Internalname, httpContext.getMessage( "Nº Programa", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMacProCod_Internalname, GXutil.rtrim( A1514MacProCod), GXutil.rtrim( localUtil.format( A1514MacProCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacProCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFecHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFecHor_Internalname, httpContext.getMessage( "Ultimo Acceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecHor_Internalname, localUtil.ttoc( A5625ForFecHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5625ForFecHor, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForFecHor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUsrCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUsrCod_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUsrCod_Internalname, GXutil.rtrim( A5624ForUsrCod), GXutil.rtrim( localUtil.format( A5624ForUsrCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUsrCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForFecCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForFecCre_Internalname, httpContext.getMessage( "Fecha Creacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtForFecCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtForFecCre_Internalname, localUtil.ttoc( A6609ForFecCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6609ForFecCre, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForFecCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtForFecCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForUsrCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtForUsrCre_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForUsrCre_Internalname, GXutil.rtrim( A6608ForUsrCre), GXutil.rtrim( localUtil.format( A6608ForUsrCre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUsrCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForUsrCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV20Pgmname), GXutil.rtrim( localUtil.format( AV20Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 307,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111bd1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121bd1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV20Pgmname), GXutil.rtrim( localUtil.format( AV20Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc2_Internalname, A13911ForSerDsc2, GXutil.rtrim( localUtil.format( A13911ForSerDsc2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc2_Jsonclick, 0, "Attribute", "", "", "", "", edtForSerDsc2_Visible, 0, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForAlterna_Internalname, GXutil.rtrim( A13912ForAlterna), GXutil.rtrim( localUtil.format( A13912ForAlterna, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForAlterna_Jsonclick, 0, "Attribute", "", "", "", "", edtForAlterna_Visible, 0, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtForPlanta_Internalname, GXutil.ltrim( localUtil.ntoc( A13913ForPlanta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13913ForPlanta), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPlanta_Jsonclick, 0, "Attribute", "", "", "", "", edtForPlanta_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 320,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDecimal_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Decimal, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13Decimal), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,320);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDecimal_Jsonclick, 0, "Attribute", "", "", "", "", edtavDecimal_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHex_Internalname, AV15Hex, GXutil.rtrim( localUtil.format( AV15Hex, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,321);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHex_Jsonclick, 0, "Attribute", "", "", "", "", edtavHex_Visible, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 322,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColores1_Internalname, AV14Colores1, GXutil.rtrim( localUtil.format( AV14Colores1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,322);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColores1_Jsonclick, 0, "Attribute", "", "", "", "", edtavColores1_Visible, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 323,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavLongvarchar_Internalname, AV16Longvarchar, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,323);\"", (short)(0), edtavLongvarchar_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_FormulacionTinte\\MtoFormulasTinteGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1BD2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Mto Formulas Tinte General", ""), (short)(0)) ;
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
            strup1BD0( ) ;
         }
      }
   }

   public void ws1BD2( )
   {
      start1BD2( ) ;
      evt1BD2( ) ;
   }

   public void evt1BD2( )
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
                              strup1BD0( ) ;
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
                              strup1BD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131BD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141BD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BD0( ) ;
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
                              strup1BD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavColores_Internalname ;
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

   public void we1BD2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1BD2( ) ;
         }
      }
   }

   public void pa1BD2( )
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
            GX_FocusControl = edtavColores_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgamacprocod1BD0( String A396EmprCod ,
                                   String A1514MacProCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgamacprocod_data1BD0( A396EmprCod, A1514MacProCod) ;
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

   protected void gxsgamacprocod_data1BD0( String A396EmprCod ,
                                           String A1514MacProCod )
   {
      l1514MacProCod = GXutil.padr( GXutil.rtrim( A1514MacProCod), 6, "%") ;
      n1514MacProCod = false ;
      /* Using cursor H01BD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l1514MacProCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01BD2_A1514MacProCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01BD2_A1514MacProCod[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlaforcon1BD2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaforcon_data1BD2( A396EmprCod) ;
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

   public void gxaforcon_html1BD2( String A396EmprCod )
   {
      byte gxdynajaxvalue;
      gxdlaforcon_data1BD2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynForCon.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynForCon.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 1, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynForCon.getItemCount() > 0 )
      {
         A484ForCon = (byte)(GXutil.lval( dynForCon.getValidValue(GXutil.trim( GXutil.str( A484ForCon, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
      }
   }

   protected void gxdlaforcon_data1BD2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01BD3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H01BD3_A484ForCon[0], (byte)(1), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01BD3_A14038ID_ForConD[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxaforcon_html1BD2( A396EmprCod) ;
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( dynForCon.getItemCount() > 0 )
      {
         A484ForCon = (byte)(GXutil.lval( dynForCon.getValidValue(GXutil.trim( GXutil.str( A484ForCon, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynForCon.setValue( GXutil.trim( GXutil.str( A484ForCon, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynForCon.getInternalname(), "Values", dynForCon.ToJavascriptSource(), true);
      }
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7781ForBlo", A7781ForBlo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), true);
      }
      A2749ForPro = ((GXutil.strcmp(GXutil.rtrim( A2749ForPro), "S")==0) ? "S" : "N") ;
      n2749ForPro = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2749ForPro", A2749ForPro);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1BD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV20Pgmname = "FormulacionTinte.MtoFormulasTinteGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Pgmname", AV20Pgmname);
      Gx_err = (short)(0) ;
      edtavColores_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavColores_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColores_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1BD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01BD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13913ForPlanta = H01BD4_A13913ForPlanta[0] ;
            n13913ForPlanta = H01BD4_n13913ForPlanta[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13913ForPlanta", GXutil.str( A13913ForPlanta, 1, 0));
            A13912ForAlterna = H01BD4_A13912ForAlterna[0] ;
            n13912ForAlterna = H01BD4_n13912ForAlterna[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13912ForAlterna", A13912ForAlterna);
            A13911ForSerDsc2 = H01BD4_A13911ForSerDsc2[0] ;
            n13911ForSerDsc2 = H01BD4_n13911ForSerDsc2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13911ForSerDsc2", A13911ForSerDsc2);
            A6608ForUsrCre = H01BD4_A6608ForUsrCre[0] ;
            n6608ForUsrCre = H01BD4_n6608ForUsrCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6608ForUsrCre", A6608ForUsrCre);
            A6609ForFecCre = H01BD4_A6609ForFecCre[0] ;
            n6609ForFecCre = H01BD4_n6609ForFecCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A5624ForUsrCod = H01BD4_A5624ForUsrCod[0] ;
            n5624ForUsrCod = H01BD4_n5624ForUsrCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5624ForUsrCod", A5624ForUsrCod);
            A5625ForFecHor = H01BD4_A5625ForFecHor[0] ;
            n5625ForFecHor = H01BD4_n5625ForFecHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A1514MacProCod = H01BD4_A1514MacProCod[0] ;
            n1514MacProCod = H01BD4_n1514MacProCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
            A495ForUltMod = H01BD4_A495ForUltMod[0] ;
            n495ForUltMod = H01BD4_n495ForUltMod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
            A485ForFec = H01BD4_A485ForFec[0] ;
            n485ForFec = H01BD4_n485ForFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
            A12404ForLotHil3 = H01BD4_A12404ForLotHil3[0] ;
            n12404ForLotHil3 = H01BD4_n12404ForLotHil3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12404ForLotHil3", A12404ForLotHil3);
            A12403ForLotHil2 = H01BD4_A12403ForLotHil2[0] ;
            n12403ForLotHil2 = H01BD4_n12403ForLotHil2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12403ForLotHil2", A12403ForLotHil2);
            A7029ForNomCli3 = H01BD4_A7029ForNomCli3[0] ;
            n7029ForNomCli3 = H01BD4_n7029ForNomCli3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7029ForNomCli3", A7029ForNomCli3);
            A6379ForNomCli2 = H01BD4_A6379ForNomCli2[0] ;
            n6379ForNomCli2 = H01BD4_n6379ForNomCli2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6379ForNomCli2", A6379ForNomCli2);
            A2749ForPro = H01BD4_A2749ForPro[0] ;
            n2749ForPro = H01BD4_n2749ForPro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2749ForPro", A2749ForPro);
            A8561Fam_Cod = H01BD4_A8561Fam_Cod[0] ;
            n8561Fam_Cod = H01BD4_n8561Fam_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
            A7781ForBlo = H01BD4_A7781ForBlo[0] ;
            n7781ForBlo = H01BD4_n7781ForBlo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7781ForBlo", A7781ForBlo);
            A5362IntCodF = H01BD4_A5362IntCodF[0] ;
            n5362IntCodF = H01BD4_n5362IntCodF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
            A484ForCon = H01BD4_A484ForCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
            A3316CodSol = H01BD4_A3316CodSol[0] ;
            n3316CodSol = H01BD4_n3316CodSol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
            A626MatCod = H01BD4_A626MatCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
            A583IntCod = H01BD4_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A2838ForRelBan = H01BD4_A2838ForRelBan[0] ;
            n2838ForRelBan = H01BD4_n2838ForRelBan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
            A3558ForFecApr = H01BD4_A3558ForFecApr[0] ;
            n3558ForFecApr = H01BD4_n3558ForFecApr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
            A7537ForOpNum = H01BD4_A7537ForOpNum[0] ;
            n7537ForOpNum = H01BD4_n7537ForOpNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
            A3560ForOpcCli = H01BD4_A3560ForOpcCli[0] ;
            n3560ForOpcCli = H01BD4_n3560ForOpcCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3560ForOpcCli", A3560ForOpcCli);
            A3315ForNumArc = H01BD4_A3315ForNumArc[0] ;
            n3315ForNumArc = H01BD4_n3315ForNumArc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
            A4384ForTipArt = H01BD4_A4384ForTipArt[0] ;
            n4384ForTipArt = H01BD4_n4384ForTipArt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
            A995ForTonal = H01BD4_A995ForTonal[0] ;
            n995ForTonal = H01BD4_n995ForTonal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A995ForTonal", A995ForTonal);
            A1192ForNumCli = H01BD4_A1192ForNumCli[0] ;
            n1192ForNumCli = H01BD4_n1192ForNumCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
            A1191ForNomCli = H01BD4_A1191ForNomCli[0] ;
            n1191ForNomCli = H01BD4_n1191ForNomCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1191ForNomCli", A1191ForNomCli);
            A12130ForPanto = H01BD4_A12130ForPanto[0] ;
            n12130ForPanto = H01BD4_n12130ForPanto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12130ForPanto", A12130ForPanto);
            A4339ForRGB = H01BD4_A4339ForRGB[0] ;
            n4339ForRGB = H01BD4_n4339ForRGB[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
            A13929ForTipArtD = H01BD4_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01BD4_n13929ForTipArtD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13929ForTipArtD", A13929ForTipArtD);
            A486ForNumCol = H01BD4_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A13929ForTipArtD = H01BD4_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01BD4_n13929ForTipArtD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13929ForTipArtD", A13929ForTipArtD);
            gxaforcon_html1BD2( A396EmprCod) ;
            GXt_decimal1 = A14393ForTotCol ;
            GXv_decimal2[0] = GXt_decimal1 ;
            new app.formulaciontinte.totalcolorante(remoteHandle, context).execute( A396EmprCod, A486ForNumCol, GXv_decimal2) ;
            mtoformulastintegeneral_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
            A14393ForTotCol = GXt_decimal1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14393ForTotCol", GXutil.ltrimstr( A14393ForTotCol, 11, 5));
            /* Execute user event: Load */
            e141BD2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         wb1BD0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1BD2( )
   {
   }

   public void before_start_formulas( )
   {
      AV20Pgmname = "FormulacionTinte.MtoFormulasTinteGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Pgmname", AV20Pgmname);
      Gx_err = (short)(0) ;
      edtavColores_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavColores_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColores_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      gxaforcon_html1BD2( A396EmprCod) ;
      /* Using cursor H01BD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13925ForUrdP3 = H01BD5_A13925ForUrdP3[0] ;
         n13925ForUrdP3 = H01BD5_n13925ForUrdP3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13925ForUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13925ForUrdP3), 3, 0));
         A13924ForUrd3 = H01BD5_A13924ForUrd3[0] ;
         n13924ForUrd3 = H01BD5_n13924ForUrd3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13924ForUrd3", A13924ForUrd3);
         A13923ForUrdP2 = H01BD5_A13923ForUrdP2[0] ;
         n13923ForUrdP2 = H01BD5_n13923ForUrdP2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13923ForUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13923ForUrdP2), 3, 0));
         A13922ForUrd2 = H01BD5_A13922ForUrd2[0] ;
         n13922ForUrd2 = H01BD5_n13922ForUrd2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13922ForUrd2", A13922ForUrd2);
         A13921ForUrdP1 = H01BD5_A13921ForUrdP1[0] ;
         n13921ForUrdP1 = H01BD5_n13921ForUrdP1[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13921ForUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13921ForUrdP1), 3, 0));
         A13920ForUrd1 = H01BD5_A13920ForUrd1[0] ;
         n13920ForUrd1 = H01BD5_n13920ForUrd1[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13920ForUrd1", A13920ForUrd1);
         A13919ForTraP3 = H01BD5_A13919ForTraP3[0] ;
         n13919ForTraP3 = H01BD5_n13919ForTraP3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13919ForTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13919ForTraP3), 3, 0));
         A13918ForTra3 = H01BD5_A13918ForTra3[0] ;
         n13918ForTra3 = H01BD5_n13918ForTra3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13918ForTra3", A13918ForTra3);
         A13917ForTraP2 = H01BD5_A13917ForTraP2[0] ;
         n13917ForTraP2 = H01BD5_n13917ForTraP2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13917ForTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13917ForTraP2), 3, 0));
         A13916ForTra2 = H01BD5_A13916ForTra2[0] ;
         n13916ForTra2 = H01BD5_n13916ForTra2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13916ForTra2", A13916ForTra2);
         A13915ForTraP1 = H01BD5_A13915ForTraP1[0] ;
         n13915ForTraP1 = H01BD5_n13915ForTraP1[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13915ForTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13915ForTraP1), 3, 0));
         A13914ForTra1 = H01BD5_A13914ForTra1[0] ;
         n13914ForTra1 = H01BD5_n13914ForTra1[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13914ForTra1", A13914ForTra1);
      }
      else
      {
         A13914ForTra1 = " " ;
         n13914ForTra1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13914ForTra1", A13914ForTra1);
         A13915ForTraP1 = (short)(0) ;
         n13915ForTraP1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13915ForTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13915ForTraP1), 3, 0));
         A13916ForTra2 = " " ;
         n13916ForTra2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13916ForTra2", A13916ForTra2);
         A13917ForTraP2 = (short)(0) ;
         n13917ForTraP2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13917ForTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13917ForTraP2), 3, 0));
         A13918ForTra3 = " " ;
         n13918ForTra3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13918ForTra3", A13918ForTra3);
         A13919ForTraP3 = (short)(0) ;
         n13919ForTraP3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13919ForTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13919ForTraP3), 3, 0));
         A13920ForUrd1 = " " ;
         n13920ForUrd1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13920ForUrd1", A13920ForUrd1);
         A13921ForUrdP1 = (short)(0) ;
         n13921ForUrdP1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13921ForUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13921ForUrdP1), 3, 0));
         A13922ForUrd2 = " " ;
         n13922ForUrd2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13922ForUrd2", A13922ForUrd2);
         A13923ForUrdP2 = (short)(0) ;
         n13923ForUrdP2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13923ForUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13923ForUrdP2), 3, 0));
         A13924ForUrd3 = " " ;
         n13924ForUrd3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13924ForUrd3", A13924ForUrd3);
         A13925ForUrdP3 = (short)(0) ;
         n13925ForUrdP3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13925ForUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13925ForUrdP3), 3, 0));
      }
      pr_default.close(3);
      pr_default.close(3);
      fix_multi_value_controls( ) ;
   }

   public void strup1BD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131BD2 ();
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
         wcpOA494ForSer = httpContext.cgiGet( sPrefix+"wcpOA494ForSer") ;
         wcpOA482ForColNom = httpContext.cgiGet( sPrefix+"wcpOA482ForColNom") ;
         wcpOA483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17ForRGB = localUtil.ctol( httpContext.cgiGet( sPrefix+"vFORRGB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         AV11Colores = httpContext.cgiGet( edtavColores_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Colores", AV11Colores);
         A4339ForRGB = localUtil.ctol( httpContext.cgiGet( edtForRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n4339ForRGB = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
         A12130ForPanto = httpContext.cgiGet( edtForPanto_Internalname) ;
         n12130ForPanto = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12130ForPanto", A12130ForPanto);
         A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
         n1191ForNomCli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1191ForNomCli", A1191ForNomCli);
         A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1192ForNumCli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
         A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
         n995ForTonal = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A995ForTonal", A995ForTonal);
         A4384ForTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtForTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4384ForTipArt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
         A13929ForTipArtD = httpContext.cgiGet( edtForTipArtD_Internalname) ;
         n13929ForTipArtD = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13929ForTipArtD", A13929ForTipArtD);
         A13914ForTra1 = httpContext.cgiGet( edtForTra1_Internalname) ;
         n13914ForTra1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13914ForTra1", A13914ForTra1);
         A13915ForTraP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtForTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13915ForTraP1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13915ForTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13915ForTraP1), 3, 0));
         A13916ForTra2 = httpContext.cgiGet( edtForTra2_Internalname) ;
         n13916ForTra2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13916ForTra2", A13916ForTra2);
         A13917ForTraP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtForTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13917ForTraP2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13917ForTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13917ForTraP2), 3, 0));
         A13918ForTra3 = httpContext.cgiGet( edtForTra3_Internalname) ;
         n13918ForTra3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13918ForTra3", A13918ForTra3);
         A13919ForTraP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtForTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13919ForTraP3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13919ForTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13919ForTraP3), 3, 0));
         A13920ForUrd1 = httpContext.cgiGet( edtForUrd1_Internalname) ;
         n13920ForUrd1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13920ForUrd1", A13920ForUrd1);
         A13921ForUrdP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtForUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13921ForUrdP1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13921ForUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13921ForUrdP1), 3, 0));
         A13922ForUrd2 = httpContext.cgiGet( edtForUrd2_Internalname) ;
         n13922ForUrd2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13922ForUrd2", A13922ForUrd2);
         A13923ForUrdP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtForUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13923ForUrdP2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13923ForUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13923ForUrdP2), 3, 0));
         A13924ForUrd3 = httpContext.cgiGet( edtForUrd3_Internalname) ;
         n13924ForUrd3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13924ForUrd3", A13924ForUrd3);
         A13925ForUrdP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtForUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13925ForUrdP3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13925ForUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13925ForUrdP3), 3, 0));
         A3315ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3315ForNumArc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
         A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
         n3560ForOpcCli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3560ForOpcCli", A3560ForOpcCli);
         A7537ForOpNum = (byte)(localUtil.ctol( httpContext.cgiGet( edtForOpNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7537ForOpNum = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
         A3558ForFecApr = localUtil.ctod( httpContext.cgiGet( edtForFecApr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n3558ForFecApr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
         A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)) ;
         n2838ForRelBan = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
         A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A14393ForTotCol = localUtil.ctond( httpContext.cgiGet( edtForTotCol_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14393ForTotCol", GXutil.ltrimstr( A14393ForTotCol, 11, 5));
         A626MatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         A3316CodSol = (short)(localUtil.ctol( httpContext.cgiGet( edtCodSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3316CodSol = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         dynForCon.setValue( httpContext.cgiGet( dynForCon.getInternalname()) );
         A484ForCon = (byte)(GXutil.lval( httpContext.cgiGet( dynForCon.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
         A5362IntCodF = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5362IntCodF = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
         A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
         n7781ForBlo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7781ForBlo", A7781ForBlo);
         A8561Fam_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtFam_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8561Fam_Cod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
         A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
         n2749ForPro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2749ForPro", A2749ForPro);
         A6379ForNomCli2 = httpContext.cgiGet( edtForNomCli2_Internalname) ;
         n6379ForNomCli2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6379ForNomCli2", A6379ForNomCli2);
         A7029ForNomCli3 = httpContext.cgiGet( edtForNomCli3_Internalname) ;
         n7029ForNomCli3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7029ForNomCli3", A7029ForNomCli3);
         A12403ForLotHil2 = httpContext.cgiGet( edtForLotHil2_Internalname) ;
         n12403ForLotHil2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12403ForLotHil2", A12403ForLotHil2);
         A12404ForLotHil3 = httpContext.cgiGet( edtForLotHil3_Internalname) ;
         n12404ForLotHil3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12404ForLotHil3", A12404ForLotHil3);
         A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A485ForFec = localUtil.ctod( httpContext.cgiGet( edtForFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n485ForFec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
         A495ForUltMod = localUtil.ctod( httpContext.cgiGet( edtForUltMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n495ForUltMod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
         A1514MacProCod = httpContext.cgiGet( edtMacProCod_Internalname) ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1514MacProCod", A1514MacProCod);
         A5625ForFecHor = localUtil.ctot( httpContext.cgiGet( edtForFecHor_Internalname)) ;
         n5625ForFecHor = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5624ForUsrCod = GXutil.upper( httpContext.cgiGet( edtForUsrCod_Internalname)) ;
         n5624ForUsrCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5624ForUsrCod", A5624ForUsrCod);
         A6609ForFecCre = localUtil.ctot( httpContext.cgiGet( edtForFecCre_Internalname)) ;
         n6609ForFecCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6608ForUsrCre = httpContext.cgiGet( edtForUsrCre_Internalname) ;
         n6608ForUsrCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6608ForUsrCre", A6608ForUsrCre);
         AV20Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Pgmname", AV20Pgmname);
         AV20Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Pgmname", AV20Pgmname);
         A13911ForSerDsc2 = httpContext.cgiGet( edtForSerDsc2_Internalname) ;
         n13911ForSerDsc2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13911ForSerDsc2", A13911ForSerDsc2);
         A13912ForAlterna = httpContext.cgiGet( edtForAlterna_Internalname) ;
         n13912ForAlterna = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13912ForAlterna", A13912ForAlterna);
         A13913ForPlanta = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPlanta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13913ForPlanta = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13913ForPlanta", GXutil.str( A13913ForPlanta, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDecimal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDecimal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDECIMAL");
            GX_FocusControl = edtavDecimal_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Decimal = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Decimal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Decimal), 10, 0));
         }
         else
         {
            AV13Decimal = localUtil.ctol( httpContext.cgiGet( edtavDecimal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Decimal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Decimal), 10, 0));
         }
         AV15Hex = httpContext.cgiGet( edtavHex_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Hex", AV15Hex);
         AV14Colores1 = httpContext.cgiGet( edtavColores1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Colores1", AV14Colores1);
         AV16Longvarchar = httpContext.cgiGet( edtavLongvarchar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Longvarchar", AV16Longvarchar);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MtoFormulasTinteGeneral");
         AV20Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Pgmname", AV20Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV20Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\mtoformulastintegeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         gxaforcon_html1BD2( A396EmprCod) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e131BD2 ();
      if (returnInSub) return;
   }

   public void e131BD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char3 = AV21Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      mtoformulastintegeneral_impl.this.GXt_char3 = GXv_char4[0] ;
      AV21Station = GXt_char3 ;
      GXv_char4[0] = AV22Emprcod ;
      GXv_char5[0] = AV23Emprnom ;
      GXv_char6[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char4, GXv_char5, GXv_char6) ;
      mtoformulastintegeneral_impl.this.AV22Emprcod = GXv_char4[0] ;
      mtoformulastintegeneral_impl.this.AV23Emprnom = GXv_char5[0] ;
      mtoformulastintegeneral_impl.this.AV24Usurcod = GXv_char6[0] ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e141BD2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtForSerDsc2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSerDsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc2_Visible), 5, 0), true);
      edtForAlterna_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForAlterna_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForAlterna_Visible), 5, 0), true);
      edtForPlanta_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForPlanta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPlanta_Visible), 5, 0), true);
      edtavDecimal_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDecimal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimal_Visible), 5, 0), true);
      edtavHex_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHex_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHex_Visible), 5, 0), true);
      edtavColores1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavColores1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColores1_Visible), 5, 0), true);
      edtavLongvarchar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLongvarchar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLongvarchar_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "HILLOT", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ERFOC", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForNomCli2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli2_Visible), 5, 0), true);
         divFornomcli2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli2_cell_Internalname, "Class", divFornomcli2_cell_Class, true);
      }
      else
      {
         edtForNomCli2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli2_Visible), 5, 0), true);
         divFornomcli2_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli2_cell_Internalname, "Class", divFornomcli2_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "KIMEX", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForNomCli3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli3_Visible), 5, 0), true);
         divFornomcli3_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli3_cell_Internalname, "Class", divFornomcli3_cell_Class, true);
      }
      else
      {
         edtForNomCli3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForNomCli3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli3_Visible), 5, 0), true);
         divFornomcli3_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFornomcli3_cell_Internalname, "Class", divFornomcli3_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "KIMEX", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForLotHil2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil2_Visible), 5, 0), true);
         divForlothil2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil2_cell_Internalname, "Class", divForlothil2_cell_Class, true);
      }
      else
      {
         edtForLotHil2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil2_Visible), 5, 0), true);
         divForlothil2_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil2_cell_Internalname, "Class", divForlothil2_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "KIMEX", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForLotHil3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil3_Visible), 5, 0), true);
         divForlothil3_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil3_cell_Internalname, "Class", divForlothil3_cell_Class, true);
      }
      else
      {
         edtForLotHil3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForLotHil3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLotHil3_Visible), 5, 0), true);
         divForlothil3_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForlothil3_cell_Internalname, "Class", divForlothil3_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "FRAINT", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "LAVAND", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtIntCodF_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Visible), 5, 0), true);
         divIntcodf_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divIntcodf_cell_Internalname, "Class", divIntcodf_cell_Class, true);
      }
      else
      {
         edtIntCodF_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtIntCodF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Visible), 5, 0), true);
         divIntcodf_cell_Class = "col-xs-12 col-sm-4 DataContentCell DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divIntcodf_cell_Internalname, "Class", divIntcodf_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "COLBLO", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "LINDAL", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbForBlo.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Visible", GXutil.ltrimstr( cmbForBlo.getVisible(), 5, 0), true);
         divForblo_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForblo_cell_Internalname, "Class", divForblo_cell_Class, true);
      }
      else
      {
         cmbForBlo.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbForBlo.getInternalname(), "Visible", GXutil.ltrimstr( cmbForBlo.getVisible(), 5, 0), true);
         divForblo_cell_Class = "col-xs-12 col-sm-2 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForblo_cell_Internalname, "Class", divForblo_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ELIOT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtFam_Cod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFam_Cod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFam_Cod_Visible), 5, 0), true);
         divFam_cod_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFam_cod_cell_Internalname, "Class", divFam_cod_cell_Class, true);
      }
      else
      {
         edtFam_Cod_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFam_Cod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFam_Cod_Visible), 5, 0), true);
         divFam_cod_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFam_cod_cell_Internalname, "Class", divFam_cod_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENSAIO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForOpcCli_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpcCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpcCli_Visible), 5, 0), true);
         divForopccli_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopccli_cell_Internalname, "Class", divForopccli_cell_Class, true);
      }
      else
      {
         edtForOpcCli_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpcCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpcCli_Visible), 5, 0), true);
         divForopccli_cell_Class = "col-xs-12 col-sm-1 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopccli_cell_Internalname, "Class", divForopccli_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENSAIO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForOpNum_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpNum_Visible), 5, 0), true);
         divForopnum_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopnum_cell_Internalname, "Class", divForopnum_cell_Class, true);
      }
      else
      {
         edtForOpNum_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForOpNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpNum_Visible), 5, 0), true);
         divForopnum_cell_Class = "col-xs-12 col-sm-1 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForopnum_cell_Internalname, "Class", divForopnum_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENSAIO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtForFecApr_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForFecApr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecApr_Visible), 5, 0), true);
         divForfecapr_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForfecapr_cell_Internalname, "Class", divForfecapr_cell_Class, true);
      }
      else
      {
         edtForFecApr_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForFecApr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecApr_Visible), 5, 0), true);
         divForfecapr_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divForfecapr_cell_Internalname, "Class", divForfecapr_cell_Class, true);
      }
      if ( ( edtForNomCli2_Visible == ( 0 )) && ( edtForNomCli3_Visible == ( 0 )) && ( edtForLotHil2_Visible == ( 0 )) && ( edtForLotHil3_Visible == ( 0 )) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable7_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable7_cell_Internalname, "Class", divDvpanel_unnamedtable7_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable7_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable7_cell_Internalname, "Class", divDvpanel_unnamedtable7_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV20Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.MtoFormulasTinte" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A252CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A494ForSer = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
      A482ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
      A483ForColNum = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      A831TipColCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
      pa1BD2( ) ;
      ws1BD2( ) ;
      we1BD2( ) ;
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
      sCtrlA494ForSer = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA482ForColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlA483ForColNum = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlA831TipColCod = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1BD2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\mtoformulastintegeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1BD2( ) ;
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
         A494ForSer = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
         A482ForColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
         A483ForColNum = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA494ForSer = httpContext.cgiGet( sPrefix+"wcpOA494ForSer") ;
      wcpOA482ForColNom = httpContext.cgiGet( sPrefix+"wcpOA482ForColNom") ;
      wcpOA483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A252CliCod != wcpOA252CliCod ) || ( GXutil.strcmp(A494ForSer, wcpOA494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, wcpOA482ForColNom) != 0 ) || ( A483ForColNum != wcpOA483ForColNum ) || ( A831TipColCod != wcpOA831TipColCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA252CliCod = A252CliCod ;
      wcpOA494ForSer = A494ForSer ;
      wcpOA482ForColNom = A482ForColNom ;
      wcpOA483ForColNum = A483ForColNum ;
      wcpOA831TipColCod = A831TipColCod ;
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
      sCtrlA494ForSer = httpContext.cgiGet( sPrefix+"A494ForSer_CTRL") ;
      if ( GXutil.len( sCtrlA494ForSer) > 0 )
      {
         A494ForSer = httpContext.cgiGet( sCtrlA494ForSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A494ForSer", A494ForSer);
      }
      else
      {
         A494ForSer = httpContext.cgiGet( sPrefix+"A494ForSer_PARM") ;
      }
      sCtrlA482ForColNom = httpContext.cgiGet( sPrefix+"A482ForColNom_CTRL") ;
      if ( GXutil.len( sCtrlA482ForColNom) > 0 )
      {
         A482ForColNom = httpContext.cgiGet( sCtrlA482ForColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A482ForColNom", A482ForColNom);
      }
      else
      {
         A482ForColNom = httpContext.cgiGet( sPrefix+"A482ForColNom_PARM") ;
      }
      sCtrlA483ForColNum = httpContext.cgiGet( sPrefix+"A483ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlA483ForColNum) > 0 )
      {
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA483ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      }
      else
      {
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A483ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA831TipColCod = httpContext.cgiGet( sPrefix+"A831TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlA831TipColCod) > 0 )
      {
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlA831TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      else
      {
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A831TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1BD2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1BD2( ) ;
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
      ws1BD2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A494ForSer_PARM", GXutil.rtrim( A494ForSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlA494ForSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A494ForSer_CTRL", GXutil.rtrim( sCtrlA494ForSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A482ForColNom_PARM", GXutil.rtrim( A482ForColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlA482ForColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A482ForColNom_CTRL", GXutil.rtrim( sCtrlA482ForColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A483ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA483ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A483ForColNum_CTRL", GXutil.rtrim( sCtrlA483ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A831TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA831TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A831TipColCod_CTRL", GXutil.rtrim( sCtrlA831TipColCod));
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
      we1BD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105972", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/mtoformulastintegeneral.js", "?202682116105972", false, true);
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
      edtForSer_Internalname = sPrefix+"FORSER" ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM" ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtavColores_Internalname = sPrefix+"vCOLORES" ;
      edtForRGB_Internalname = sPrefix+"FORRGB" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      edtForPanto_Internalname = sPrefix+"FORPANTO" ;
      edtForNomCli_Internalname = sPrefix+"FORNOMCLI" ;
      edtForNumCli_Internalname = sPrefix+"FORNUMCLI" ;
      edtForTonal_Internalname = sPrefix+"FORTONAL" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE3" ;
      edtForTipArt_Internalname = sPrefix+"FORTIPART" ;
      edtForTipArtD_Internalname = sPrefix+"FORTIPARTD" ;
      divUnnamedtable13_Internalname = sPrefix+"UNNAMEDTABLE13" ;
      edtForTra1_Internalname = sPrefix+"FORTRA1" ;
      edtForTraP1_Internalname = sPrefix+"FORTRAP1" ;
      edtForTra2_Internalname = sPrefix+"FORTRA2" ;
      edtForTraP2_Internalname = sPrefix+"FORTRAP2" ;
      edtForTra3_Internalname = sPrefix+"FORTRA3" ;
      edtForTraP3_Internalname = sPrefix+"FORTRAP3" ;
      divUnnamedtable14_Internalname = sPrefix+"UNNAMEDTABLE14" ;
      edtForUrd1_Internalname = sPrefix+"FORURD1" ;
      edtForUrdP1_Internalname = sPrefix+"FORURDP1" ;
      edtForUrd2_Internalname = sPrefix+"FORURD2" ;
      edtForUrdP2_Internalname = sPrefix+"FORURDP2" ;
      edtForUrd3_Internalname = sPrefix+"FORURD3" ;
      edtForUrdP3_Internalname = sPrefix+"FORURDP3" ;
      divUnnamedtable15_Internalname = sPrefix+"UNNAMEDTABLE15" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      edtForNumArc_Internalname = sPrefix+"FORNUMARC" ;
      edtForOpcCli_Internalname = sPrefix+"FOROPCCLI" ;
      divForopccli_cell_Internalname = sPrefix+"FOROPCCLI_CELL" ;
      edtForOpNum_Internalname = sPrefix+"FOROPNUM" ;
      divForopnum_cell_Internalname = sPrefix+"FOROPNUM_CELL" ;
      edtForFecApr_Internalname = sPrefix+"FORFECAPR" ;
      divForfecapr_cell_Internalname = sPrefix+"FORFECAPR_CELL" ;
      edtForRelBan_Internalname = sPrefix+"FORRELBAN" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE5" ;
      edtIntCod_Internalname = sPrefix+"INTCOD" ;
      edtForTotCol_Internalname = sPrefix+"FORTOTCOL" ;
      edtMatCod_Internalname = sPrefix+"MATCOD" ;
      edtCodSol_Internalname = sPrefix+"CODSOL" ;
      dynForCon.setInternalname( sPrefix+"FORCON" );
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      edtIntCodF_Internalname = sPrefix+"INTCODF" ;
      divIntcodf_cell_Internalname = sPrefix+"INTCODF_CELL" ;
      cmbForBlo.setInternalname( sPrefix+"FORBLO" );
      divForblo_cell_Internalname = sPrefix+"FORBLO_CELL" ;
      edtFam_Cod_Internalname = sPrefix+"FAM_COD" ;
      divFam_cod_cell_Internalname = sPrefix+"FAM_COD_CELL" ;
      chkForPro.setInternalname( sPrefix+"FORPRO" );
      divUnnamedtable12_Internalname = sPrefix+"UNNAMEDTABLE12" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE6" ;
      edtForNomCli2_Internalname = sPrefix+"FORNOMCLI2" ;
      divFornomcli2_cell_Internalname = sPrefix+"FORNOMCLI2_CELL" ;
      edtForNomCli3_Internalname = sPrefix+"FORNOMCLI3" ;
      divFornomcli3_cell_Internalname = sPrefix+"FORNOMCLI3_CELL" ;
      edtForLotHil2_Internalname = sPrefix+"FORLOTHIL2" ;
      divForlothil2_cell_Internalname = sPrefix+"FORLOTHIL2_CELL" ;
      edtForLotHil3_Internalname = sPrefix+"FORLOTHIL3" ;
      divForlothil3_cell_Internalname = sPrefix+"FORLOTHIL3_CELL" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE7" ;
      divDvpanel_unnamedtable7_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE7_CELL" ;
      edtForNumCol_Internalname = sPrefix+"FORNUMCOL" ;
      edtForFec_Internalname = sPrefix+"FORFEC" ;
      edtForUltMod_Internalname = sPrefix+"FORULTMOD" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE8" ;
      edtMacProCod_Internalname = sPrefix+"MACPROCOD" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE9" ;
      edtForFecHor_Internalname = sPrefix+"FORFECHOR" ;
      edtForUsrCod_Internalname = sPrefix+"FORUSRCOD" ;
      edtForFecCre_Internalname = sPrefix+"FORFECCRE" ;
      edtForUsrCre_Internalname = sPrefix+"FORUSRCRE" ;
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE10" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtForSerDsc2_Internalname = sPrefix+"FORSERDSC2" ;
      edtForAlterna_Internalname = sPrefix+"FORALTERNA" ;
      edtForPlanta_Internalname = sPrefix+"FORPLANTA" ;
      edtavDecimal_Internalname = sPrefix+"vDECIMAL" ;
      edtavHex_Internalname = sPrefix+"vHEX" ;
      edtavColores1_Internalname = sPrefix+"vCOLORES1" ;
      edtavLongvarchar_Internalname = sPrefix+"vLONGVARCHAR" ;
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
      edtavLongvarchar_Visible = 1 ;
      edtavColores1_Jsonclick = "" ;
      edtavColores1_Visible = 1 ;
      edtavHex_Jsonclick = "" ;
      edtavHex_Visible = 1 ;
      edtavDecimal_Jsonclick = "" ;
      edtavDecimal_Visible = 1 ;
      edtForPlanta_Jsonclick = "" ;
      edtForPlanta_Visible = 1 ;
      edtForAlterna_Jsonclick = "" ;
      edtForAlterna_Visible = 1 ;
      edtForSerDsc2_Jsonclick = "" ;
      edtForSerDsc2_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtForUsrCre_Jsonclick = "" ;
      edtForUsrCre_Enabled = 0 ;
      edtForFecCre_Jsonclick = "" ;
      edtForFecCre_Enabled = 0 ;
      edtForUsrCod_Jsonclick = "" ;
      edtForUsrCod_Enabled = 0 ;
      edtForFecHor_Jsonclick = "" ;
      edtForFecHor_Enabled = 0 ;
      edtMacProCod_Jsonclick = "" ;
      edtMacProCod_Enabled = 0 ;
      edtForUltMod_Jsonclick = "" ;
      edtForUltMod_Enabled = 0 ;
      edtForFec_Jsonclick = "" ;
      edtForFec_Enabled = 0 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Enabled = 0 ;
      edtForLotHil3_Jsonclick = "" ;
      edtForLotHil3_Enabled = 0 ;
      edtForLotHil3_Visible = 1 ;
      divForlothil3_cell_Class = "col-xs-12 col-sm-6" ;
      edtForLotHil2_Jsonclick = "" ;
      edtForLotHil2_Enabled = 0 ;
      edtForLotHil2_Visible = 1 ;
      divForlothil2_cell_Class = "col-xs-12 col-sm-6" ;
      edtForNomCli3_Jsonclick = "" ;
      edtForNomCli3_Enabled = 0 ;
      edtForNomCli3_Visible = 1 ;
      divFornomcli3_cell_Class = "col-xs-12 col-sm-6" ;
      edtForNomCli2_Jsonclick = "" ;
      edtForNomCli2_Enabled = 0 ;
      edtForNomCli2_Visible = 1 ;
      divFornomcli2_cell_Class = "col-xs-12 col-sm-6" ;
      divDvpanel_unnamedtable7_cell_Class = "col-xs-12" ;
      chkForPro.setEnabled( 0 );
      edtFam_Cod_Jsonclick = "" ;
      edtFam_Cod_Enabled = 0 ;
      edtFam_Cod_Visible = 1 ;
      divFam_cod_cell_Class = "col-xs-12 col-sm-3" ;
      cmbForBlo.setJsonclick( "" );
      cmbForBlo.setEnabled( 0 );
      cmbForBlo.setVisible( 1 );
      divForblo_cell_Class = "col-xs-12 col-sm-2" ;
      edtIntCodF_Jsonclick = "" ;
      edtIntCodF_Enabled = 0 ;
      edtIntCodF_Visible = 1 ;
      divIntcodf_cell_Class = "col-xs-12 col-sm-4" ;
      dynForCon.setJsonclick( "" );
      dynForCon.setEnabled( 0 );
      edtCodSol_Jsonclick = "" ;
      edtCodSol_Enabled = 0 ;
      edtMatCod_Jsonclick = "" ;
      edtMatCod_Enabled = 0 ;
      edtForTotCol_Jsonclick = "" ;
      edtForTotCol_Enabled = 0 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Enabled = 0 ;
      edtForRelBan_Jsonclick = "" ;
      edtForRelBan_Enabled = 0 ;
      edtForFecApr_Jsonclick = "" ;
      edtForFecApr_Enabled = 0 ;
      edtForFecApr_Visible = 1 ;
      divForfecapr_cell_Class = "col-xs-12 col-sm-6" ;
      edtForOpNum_Jsonclick = "" ;
      edtForOpNum_Enabled = 0 ;
      edtForOpNum_Visible = 1 ;
      divForopnum_cell_Class = "col-xs-12 col-sm-1" ;
      edtForOpcCli_Jsonclick = "" ;
      edtForOpcCli_Enabled = 0 ;
      edtForOpcCli_Visible = 1 ;
      divForopccli_cell_Class = "col-xs-12 col-sm-1" ;
      edtForNumArc_Jsonclick = "" ;
      edtForNumArc_Enabled = 0 ;
      edtForUrdP3_Jsonclick = "" ;
      edtForUrdP3_Enabled = 0 ;
      edtForUrd3_Jsonclick = "" ;
      edtForUrd3_Enabled = 0 ;
      edtForUrdP2_Jsonclick = "" ;
      edtForUrdP2_Enabled = 0 ;
      edtForUrd2_Jsonclick = "" ;
      edtForUrd2_Enabled = 0 ;
      edtForUrdP1_Jsonclick = "" ;
      edtForUrdP1_Enabled = 0 ;
      edtForUrd1_Jsonclick = "" ;
      edtForUrd1_Enabled = 0 ;
      edtForTraP3_Jsonclick = "" ;
      edtForTraP3_Enabled = 0 ;
      edtForTra3_Jsonclick = "" ;
      edtForTra3_Enabled = 0 ;
      edtForTraP2_Jsonclick = "" ;
      edtForTraP2_Enabled = 0 ;
      edtForTra2_Jsonclick = "" ;
      edtForTra2_Enabled = 0 ;
      edtForTraP1_Jsonclick = "" ;
      edtForTraP1_Enabled = 0 ;
      edtForTra1_Jsonclick = "" ;
      edtForTra1_Enabled = 0 ;
      edtForTipArtD_Jsonclick = "" ;
      edtForTipArtD_Enabled = 0 ;
      edtForTipArt_Jsonclick = "" ;
      edtForTipArt_Enabled = 0 ;
      edtForTonal_Jsonclick = "" ;
      edtForTonal_Enabled = 0 ;
      edtForNumCli_Jsonclick = "" ;
      edtForNumCli_Enabled = 0 ;
      edtForNomCli_Jsonclick = "" ;
      edtForNomCli_Enabled = 0 ;
      edtForPanto_Jsonclick = "" ;
      edtForPanto_Enabled = 0 ;
      edtForRGB_Jsonclick = "" ;
      edtForRGB_Enabled = 0 ;
      edtavColores_Jsonclick = "" ;
      edtavColores_Enabled = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Enabled = 0 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Enabled = 0 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Enabled = 0 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
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
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = httpContext.getMessage( "Control Accesos", "") ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "Programa", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = httpContext.getMessage( "Fecha Alta, Modificacion", "") ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Hilaza", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Intensidad, Matiz", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Laboratorio", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Tipo Articulo, Composicion", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Color Cliente, Pantone, Coleccion", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "RGB", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      dynForCon.setName( "FORCON" );
      dynForCon.setWebtags( "" );
      cmbForBlo.setName( "FORBLO" );
      cmbForBlo.setWebtags( "" );
      cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbForBlo.getItemCount() > 0 )
      {
      }
      chkForPro.setName( "FORPRO" );
      chkForPro.setWebtags( "" );
      chkForPro.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkForPro.getInternalname(), "TitleCaption", chkForPro.getCaption(), true);
      chkForPro.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForCon'},{av:'A484ForCon',fld:'FORCON',pic:'9'},{av:'A2749ForPro',fld:'FORPRO',pic:''},{av:'AV20Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111BD1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV17ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[{av:'AV17ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DODELETE'","{handler:'e121BD1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV17ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[{av:'AV17ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_FORTIPART","{handler:'valid_Fortipart',iparms:[]");
      setEventMetadata("VALID_FORTIPART",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[]}");
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
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A1514MacProCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV20Pgmname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV11Colores = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      A12130ForPanto = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A13929ForTipArtD = "" ;
      A13914ForTra1 = "" ;
      A13916ForTra2 = "" ;
      A13918ForTra3 = "" ;
      A13920ForUrd1 = "" ;
      A13922ForUrd2 = "" ;
      A13924ForUrd3 = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      A3560ForOpcCli = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A14393ForTotCol = DecimalUtil.ZERO ;
      A7781ForBlo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A2749ForPro = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      A6379ForNomCli2 = "" ;
      A7029ForNomCli3 = "" ;
      A12403ForLotHil2 = "" ;
      A12404ForLotHil3 = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      A5624ForUsrCod = "" ;
      A6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      A6608ForUsrCre = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A13911ForSerDsc2 = "" ;
      A13912ForAlterna = "" ;
      AV15Hex = "" ;
      AV14Colores1 = "" ;
      AV16Longvarchar = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l1514MacProCod = "" ;
      H01BD2_A396EmprCod = new String[] {""} ;
      H01BD2_A1514MacProCod = new String[] {""} ;
      H01BD2_n1514MacProCod = new boolean[] {false} ;
      H01BD3_A396EmprCod = new String[] {""} ;
      H01BD3_A484ForCon = new byte[1] ;
      H01BD3_A14038ID_ForConD = new String[] {""} ;
      H01BD4_A65ArtCod = new String[] {""} ;
      H01BD4_A829TipArtCod = new short[1] ;
      H01BD4_A252CliCod = new int[1] ;
      H01BD4_A494ForSer = new String[] {""} ;
      H01BD4_A482ForColNom = new String[] {""} ;
      H01BD4_A483ForColNum = new int[1] ;
      H01BD4_A831TipColCod = new byte[1] ;
      H01BD4_A13913ForPlanta = new byte[1] ;
      H01BD4_n13913ForPlanta = new boolean[] {false} ;
      H01BD4_A13912ForAlterna = new String[] {""} ;
      H01BD4_n13912ForAlterna = new boolean[] {false} ;
      H01BD4_A13911ForSerDsc2 = new String[] {""} ;
      H01BD4_n13911ForSerDsc2 = new boolean[] {false} ;
      H01BD4_A6608ForUsrCre = new String[] {""} ;
      H01BD4_n6608ForUsrCre = new boolean[] {false} ;
      H01BD4_A6609ForFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      H01BD4_n6609ForFecCre = new boolean[] {false} ;
      H01BD4_A5624ForUsrCod = new String[] {""} ;
      H01BD4_n5624ForUsrCod = new boolean[] {false} ;
      H01BD4_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01BD4_n5625ForFecHor = new boolean[] {false} ;
      H01BD4_A1514MacProCod = new String[] {""} ;
      H01BD4_n1514MacProCod = new boolean[] {false} ;
      H01BD4_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      H01BD4_n495ForUltMod = new boolean[] {false} ;
      H01BD4_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01BD4_n485ForFec = new boolean[] {false} ;
      H01BD4_A12404ForLotHil3 = new String[] {""} ;
      H01BD4_n12404ForLotHil3 = new boolean[] {false} ;
      H01BD4_A12403ForLotHil2 = new String[] {""} ;
      H01BD4_n12403ForLotHil2 = new boolean[] {false} ;
      H01BD4_A7029ForNomCli3 = new String[] {""} ;
      H01BD4_n7029ForNomCli3 = new boolean[] {false} ;
      H01BD4_A6379ForNomCli2 = new String[] {""} ;
      H01BD4_n6379ForNomCli2 = new boolean[] {false} ;
      H01BD4_A2749ForPro = new String[] {""} ;
      H01BD4_n2749ForPro = new boolean[] {false} ;
      H01BD4_A8561Fam_Cod = new short[1] ;
      H01BD4_n8561Fam_Cod = new boolean[] {false} ;
      H01BD4_A7781ForBlo = new String[] {""} ;
      H01BD4_n7781ForBlo = new boolean[] {false} ;
      H01BD4_A5362IntCodF = new byte[1] ;
      H01BD4_n5362IntCodF = new boolean[] {false} ;
      H01BD4_A484ForCon = new byte[1] ;
      H01BD4_A3316CodSol = new short[1] ;
      H01BD4_n3316CodSol = new boolean[] {false} ;
      H01BD4_A626MatCod = new short[1] ;
      H01BD4_A583IntCod = new byte[1] ;
      H01BD4_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BD4_n2838ForRelBan = new boolean[] {false} ;
      H01BD4_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      H01BD4_n3558ForFecApr = new boolean[] {false} ;
      H01BD4_A7537ForOpNum = new byte[1] ;
      H01BD4_n7537ForOpNum = new boolean[] {false} ;
      H01BD4_A3560ForOpcCli = new String[] {""} ;
      H01BD4_n3560ForOpcCli = new boolean[] {false} ;
      H01BD4_A3315ForNumArc = new int[1] ;
      H01BD4_n3315ForNumArc = new boolean[] {false} ;
      H01BD4_A4384ForTipArt = new short[1] ;
      H01BD4_n4384ForTipArt = new boolean[] {false} ;
      H01BD4_A995ForTonal = new String[] {""} ;
      H01BD4_n995ForTonal = new boolean[] {false} ;
      H01BD4_A1192ForNumCli = new int[1] ;
      H01BD4_n1192ForNumCli = new boolean[] {false} ;
      H01BD4_A1191ForNomCli = new String[] {""} ;
      H01BD4_n1191ForNomCli = new boolean[] {false} ;
      H01BD4_A12130ForPanto = new String[] {""} ;
      H01BD4_n12130ForPanto = new boolean[] {false} ;
      H01BD4_A4339ForRGB = new long[1] ;
      H01BD4_n4339ForRGB = new boolean[] {false} ;
      H01BD4_A396EmprCod = new String[] {""} ;
      H01BD4_A13925ForUrdP3 = new short[1] ;
      H01BD4_n13925ForUrdP3 = new boolean[] {false} ;
      H01BD4_A13924ForUrd3 = new String[] {""} ;
      H01BD4_n13924ForUrd3 = new boolean[] {false} ;
      H01BD4_A13923ForUrdP2 = new short[1] ;
      H01BD4_n13923ForUrdP2 = new boolean[] {false} ;
      H01BD4_A13922ForUrd2 = new String[] {""} ;
      H01BD4_n13922ForUrd2 = new boolean[] {false} ;
      H01BD4_A13921ForUrdP1 = new short[1] ;
      H01BD4_n13921ForUrdP1 = new boolean[] {false} ;
      H01BD4_A13920ForUrd1 = new String[] {""} ;
      H01BD4_n13920ForUrd1 = new boolean[] {false} ;
      H01BD4_A13919ForTraP3 = new short[1] ;
      H01BD4_n13919ForTraP3 = new boolean[] {false} ;
      H01BD4_A13918ForTra3 = new String[] {""} ;
      H01BD4_n13918ForTra3 = new boolean[] {false} ;
      H01BD4_A13917ForTraP2 = new short[1] ;
      H01BD4_n13917ForTraP2 = new boolean[] {false} ;
      H01BD4_A13916ForTra2 = new String[] {""} ;
      H01BD4_n13916ForTra2 = new boolean[] {false} ;
      H01BD4_A13915ForTraP1 = new short[1] ;
      H01BD4_n13915ForTraP1 = new boolean[] {false} ;
      H01BD4_A13914ForTra1 = new String[] {""} ;
      H01BD4_n13914ForTra1 = new boolean[] {false} ;
      H01BD4_A13929ForTipArtD = new String[] {""} ;
      H01BD4_n13929ForTipArtD = new boolean[] {false} ;
      H01BD4_A486ForNumCol = new int[1] ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      H01BD5_A13925ForUrdP3 = new short[1] ;
      H01BD5_n13925ForUrdP3 = new boolean[] {false} ;
      H01BD5_A13924ForUrd3 = new String[] {""} ;
      H01BD5_n13924ForUrd3 = new boolean[] {false} ;
      H01BD5_A13923ForUrdP2 = new short[1] ;
      H01BD5_n13923ForUrdP2 = new boolean[] {false} ;
      H01BD5_A13922ForUrd2 = new String[] {""} ;
      H01BD5_n13922ForUrd2 = new boolean[] {false} ;
      H01BD5_A13921ForUrdP1 = new short[1] ;
      H01BD5_n13921ForUrdP1 = new boolean[] {false} ;
      H01BD5_A13920ForUrd1 = new String[] {""} ;
      H01BD5_n13920ForUrd1 = new boolean[] {false} ;
      H01BD5_A13919ForTraP3 = new short[1] ;
      H01BD5_n13919ForTraP3 = new boolean[] {false} ;
      H01BD5_A13918ForTra3 = new String[] {""} ;
      H01BD5_n13918ForTra3 = new boolean[] {false} ;
      H01BD5_A13917ForTraP2 = new short[1] ;
      H01BD5_n13917ForTraP2 = new boolean[] {false} ;
      H01BD5_A13916ForTra2 = new String[] {""} ;
      H01BD5_n13916ForTra2 = new boolean[] {false} ;
      H01BD5_A13915ForTraP1 = new short[1] ;
      H01BD5_n13915ForTraP1 = new boolean[] {false} ;
      H01BD5_A13914ForTra1 = new String[] {""} ;
      H01BD5_n13914ForTra1 = new boolean[] {false} ;
      hsh = "" ;
      AV21Station = "" ;
      GXt_char3 = "" ;
      AV22Emprcod = "" ;
      GXv_char4 = new String[1] ;
      AV23Emprnom = "" ;
      GXv_char5 = new String[1] ;
      AV24Usurcod = "" ;
      GXv_char6 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA252CliCod = "" ;
      sCtrlA494ForSer = "" ;
      sCtrlA482ForColNom = "" ;
      sCtrlA483ForColNum = "" ;
      sCtrlA831TipColCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastintegeneral__default(),
         new Object[] {
             new Object[] {
            H01BD2_A396EmprCod, H01BD2_A1514MacProCod
            }
            , new Object[] {
            H01BD3_A396EmprCod, H01BD3_A484ForCon, H01BD3_A14038ID_ForConD
            }
            , new Object[] {
            H01BD4_A65ArtCod, H01BD4_A829TipArtCod, H01BD4_A252CliCod, H01BD4_A494ForSer, H01BD4_A482ForColNom, H01BD4_A483ForColNum, H01BD4_A831TipColCod, H01BD4_A13913ForPlanta, H01BD4_n13913ForPlanta, H01BD4_A13912ForAlterna,
            H01BD4_n13912ForAlterna, H01BD4_A13911ForSerDsc2, H01BD4_n13911ForSerDsc2, H01BD4_A6608ForUsrCre, H01BD4_n6608ForUsrCre, H01BD4_A6609ForFecCre, H01BD4_n6609ForFecCre, H01BD4_A5624ForUsrCod, H01BD4_n5624ForUsrCod, H01BD4_A5625ForFecHor,
            H01BD4_n5625ForFecHor, H01BD4_A1514MacProCod, H01BD4_n1514MacProCod, H01BD4_A495ForUltMod, H01BD4_n495ForUltMod, H01BD4_A485ForFec, H01BD4_n485ForFec, H01BD4_A12404ForLotHil3, H01BD4_n12404ForLotHil3, H01BD4_A12403ForLotHil2,
            H01BD4_n12403ForLotHil2, H01BD4_A7029ForNomCli3, H01BD4_n7029ForNomCli3, H01BD4_A6379ForNomCli2, H01BD4_n6379ForNomCli2, H01BD4_A2749ForPro, H01BD4_n2749ForPro, H01BD4_A8561Fam_Cod, H01BD4_n8561Fam_Cod, H01BD4_A7781ForBlo,
            H01BD4_n7781ForBlo, H01BD4_A5362IntCodF, H01BD4_n5362IntCodF, H01BD4_A484ForCon, H01BD4_A3316CodSol, H01BD4_n3316CodSol, H01BD4_A626MatCod, H01BD4_A583IntCod, H01BD4_A2838ForRelBan, H01BD4_n2838ForRelBan,
            H01BD4_A3558ForFecApr, H01BD4_n3558ForFecApr, H01BD4_A7537ForOpNum, H01BD4_n7537ForOpNum, H01BD4_A3560ForOpcCli, H01BD4_n3560ForOpcCli, H01BD4_A3315ForNumArc, H01BD4_n3315ForNumArc, H01BD4_A4384ForTipArt, H01BD4_n4384ForTipArt,
            H01BD4_A995ForTonal, H01BD4_n995ForTonal, H01BD4_A1192ForNumCli, H01BD4_n1192ForNumCli, H01BD4_A1191ForNomCli, H01BD4_n1191ForNomCli, H01BD4_A12130ForPanto, H01BD4_n12130ForPanto, H01BD4_A4339ForRGB, H01BD4_n4339ForRGB,
            H01BD4_A396EmprCod, H01BD4_A13925ForUrdP3, H01BD4_n13925ForUrdP3, H01BD4_A13924ForUrd3, H01BD4_n13924ForUrd3, H01BD4_A13923ForUrdP2, H01BD4_n13923ForUrdP2, H01BD4_A13922ForUrd2, H01BD4_n13922ForUrd2, H01BD4_A13921ForUrdP1,
            H01BD4_n13921ForUrdP1, H01BD4_A13920ForUrd1, H01BD4_n13920ForUrd1, H01BD4_A13919ForTraP3, H01BD4_n13919ForTraP3, H01BD4_A13918ForTra3, H01BD4_n13918ForTra3, H01BD4_A13917ForTraP2, H01BD4_n13917ForTraP2, H01BD4_A13916ForTra2,
            H01BD4_n13916ForTra2, H01BD4_A13915ForTraP1, H01BD4_n13915ForTraP1, H01BD4_A13914ForTra1, H01BD4_n13914ForTra1, H01BD4_A13929ForTipArtD, H01BD4_n13929ForTipArtD, H01BD4_A486ForNumCol
            }
            , new Object[] {
            H01BD5_A13925ForUrdP3, H01BD5_n13925ForUrdP3, H01BD5_A13924ForUrd3, H01BD5_n13924ForUrd3, H01BD5_A13923ForUrdP2, H01BD5_n13923ForUrdP2, H01BD5_A13922ForUrd2, H01BD5_n13922ForUrd2, H01BD5_A13921ForUrdP1, H01BD5_n13921ForUrdP1,
            H01BD5_A13920ForUrd1, H01BD5_n13920ForUrd1, H01BD5_A13919ForTraP3, H01BD5_n13919ForTraP3, H01BD5_A13918ForTra3, H01BD5_n13918ForTra3, H01BD5_A13917ForTraP2, H01BD5_n13917ForTraP2, H01BD5_A13916ForTra2, H01BD5_n13916ForTra2,
            H01BD5_A13915ForTraP1, H01BD5_n13915ForTraP1, H01BD5_A13914ForTra1, H01BD5_n13914ForTra1
            }
         }
      );
      AV20Pgmname = "FormulacionTinte.MtoFormulasTinteGeneral" ;
      /* GeneXus formulas. */
      AV20Pgmname = "FormulacionTinte.MtoFormulasTinteGeneral" ;
      Gx_err = (short)(0) ;
      edtavColores_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOA831TipColCod ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A831TipColCod ;
   private byte A7537ForOpNum ;
   private byte A583IntCod ;
   private byte A484ForCon ;
   private byte A5362IntCodF ;
   private byte A13913ForPlanta ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A4384ForTipArt ;
   private short A13915ForTraP1 ;
   private short A13917ForTraP2 ;
   private short A13919ForTraP3 ;
   private short A13921ForUrdP1 ;
   private short A13923ForUrdP2 ;
   private short A13925ForUrdP3 ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short A8561Fam_Cod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtavColores_Enabled ;
   private int edtForRGB_Enabled ;
   private int edtForPanto_Enabled ;
   private int edtForNomCli_Enabled ;
   private int A1192ForNumCli ;
   private int edtForNumCli_Enabled ;
   private int edtForTonal_Enabled ;
   private int edtForTipArt_Enabled ;
   private int edtForTipArtD_Enabled ;
   private int edtForTra1_Enabled ;
   private int edtForTraP1_Enabled ;
   private int edtForTra2_Enabled ;
   private int edtForTraP2_Enabled ;
   private int edtForTra3_Enabled ;
   private int edtForTraP3_Enabled ;
   private int edtForUrd1_Enabled ;
   private int edtForUrdP1_Enabled ;
   private int edtForUrd2_Enabled ;
   private int edtForUrdP2_Enabled ;
   private int edtForUrd3_Enabled ;
   private int edtForUrdP3_Enabled ;
   private int A3315ForNumArc ;
   private int edtForNumArc_Enabled ;
   private int edtForOpcCli_Visible ;
   private int edtForOpcCli_Enabled ;
   private int edtForOpNum_Visible ;
   private int edtForOpNum_Enabled ;
   private int edtForFecApr_Visible ;
   private int edtForFecApr_Enabled ;
   private int edtForRelBan_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtForTotCol_Enabled ;
   private int edtMatCod_Enabled ;
   private int edtCodSol_Enabled ;
   private int edtIntCodF_Visible ;
   private int edtIntCodF_Enabled ;
   private int edtFam_Cod_Visible ;
   private int edtFam_Cod_Enabled ;
   private int edtForNomCli2_Visible ;
   private int edtForNomCli2_Enabled ;
   private int edtForNomCli3_Visible ;
   private int edtForNomCli3_Enabled ;
   private int edtForLotHil2_Visible ;
   private int edtForLotHil2_Enabled ;
   private int edtForLotHil3_Visible ;
   private int edtForLotHil3_Enabled ;
   private int A486ForNumCol ;
   private int edtForNumCol_Enabled ;
   private int edtForFec_Enabled ;
   private int edtForUltMod_Enabled ;
   private int edtMacProCod_Enabled ;
   private int edtForFecHor_Enabled ;
   private int edtForUsrCod_Enabled ;
   private int edtForFecCre_Enabled ;
   private int edtForUsrCre_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtForSerDsc2_Visible ;
   private int edtForAlterna_Visible ;
   private int edtForPlanta_Visible ;
   private int edtavDecimal_Visible ;
   private int edtavHex_Visible ;
   private int edtavColores1_Visible ;
   private int edtavLongvarchar_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private long AV17ForRGB ;
   private long A4339ForRGB ;
   private long AV13Decimal ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A14393ForTotCol ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A1514MacProCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV20Pgmname ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavColores_Internalname ;
   private String TempTags ;
   private String edtavColores_Jsonclick ;
   private String edtForRGB_Internalname ;
   private String edtForRGB_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtForPanto_Internalname ;
   private String A12130ForPanto ;
   private String edtForPanto_Jsonclick ;
   private String edtForNomCli_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Jsonclick ;
   private String edtForNumCli_Internalname ;
   private String edtForNumCli_Jsonclick ;
   private String edtForTonal_Internalname ;
   private String A995ForTonal ;
   private String edtForTonal_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String edtForTipArt_Internalname ;
   private String edtForTipArt_Jsonclick ;
   private String edtForTipArtD_Internalname ;
   private String A13929ForTipArtD ;
   private String edtForTipArtD_Jsonclick ;
   private String divUnnamedtable14_Internalname ;
   private String edtForTra1_Internalname ;
   private String A13914ForTra1 ;
   private String edtForTra1_Jsonclick ;
   private String edtForTraP1_Internalname ;
   private String edtForTraP1_Jsonclick ;
   private String edtForTra2_Internalname ;
   private String A13916ForTra2 ;
   private String edtForTra2_Jsonclick ;
   private String edtForTraP2_Internalname ;
   private String edtForTraP2_Jsonclick ;
   private String edtForTra3_Internalname ;
   private String A13918ForTra3 ;
   private String edtForTra3_Jsonclick ;
   private String edtForTraP3_Internalname ;
   private String edtForTraP3_Jsonclick ;
   private String divUnnamedtable15_Internalname ;
   private String edtForUrd1_Internalname ;
   private String A13920ForUrd1 ;
   private String edtForUrd1_Jsonclick ;
   private String edtForUrdP1_Internalname ;
   private String edtForUrdP1_Jsonclick ;
   private String edtForUrd2_Internalname ;
   private String A13922ForUrd2 ;
   private String edtForUrd2_Jsonclick ;
   private String edtForUrdP2_Internalname ;
   private String edtForUrdP2_Jsonclick ;
   private String edtForUrd3_Internalname ;
   private String A13924ForUrd3 ;
   private String edtForUrd3_Jsonclick ;
   private String edtForUrdP3_Internalname ;
   private String edtForUrdP3_Jsonclick ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtForNumArc_Internalname ;
   private String edtForNumArc_Jsonclick ;
   private String divForopccli_cell_Internalname ;
   private String divForopccli_cell_Class ;
   private String edtForOpcCli_Internalname ;
   private String A3560ForOpcCli ;
   private String edtForOpcCli_Jsonclick ;
   private String divForopnum_cell_Internalname ;
   private String divForopnum_cell_Class ;
   private String edtForOpNum_Internalname ;
   private String edtForOpNum_Jsonclick ;
   private String divForfecapr_cell_Internalname ;
   private String divForfecapr_cell_Class ;
   private String edtForFecApr_Internalname ;
   private String edtForFecApr_Jsonclick ;
   private String edtForRelBan_Internalname ;
   private String edtForRelBan_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String edtForTotCol_Internalname ;
   private String edtForTotCol_Jsonclick ;
   private String edtMatCod_Internalname ;
   private String edtMatCod_Jsonclick ;
   private String edtCodSol_Internalname ;
   private String edtCodSol_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String divIntcodf_cell_Internalname ;
   private String divIntcodf_cell_Class ;
   private String edtIntCodF_Internalname ;
   private String edtIntCodF_Jsonclick ;
   private String divForblo_cell_Internalname ;
   private String divForblo_cell_Class ;
   private String A7781ForBlo ;
   private String divFam_cod_cell_Internalname ;
   private String divFam_cod_cell_Class ;
   private String edtFam_Cod_Internalname ;
   private String edtFam_Cod_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String A2749ForPro ;
   private String divDvpanel_unnamedtable7_cell_Internalname ;
   private String divDvpanel_unnamedtable7_cell_Class ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divFornomcli2_cell_Internalname ;
   private String divFornomcli2_cell_Class ;
   private String edtForNomCli2_Internalname ;
   private String A6379ForNomCli2 ;
   private String edtForNomCli2_Jsonclick ;
   private String divFornomcli3_cell_Internalname ;
   private String divFornomcli3_cell_Class ;
   private String edtForNomCli3_Internalname ;
   private String A7029ForNomCli3 ;
   private String edtForNomCli3_Jsonclick ;
   private String divForlothil2_cell_Internalname ;
   private String divForlothil2_cell_Class ;
   private String edtForLotHil2_Internalname ;
   private String A12403ForLotHil2 ;
   private String edtForLotHil2_Jsonclick ;
   private String divForlothil3_cell_Internalname ;
   private String divForlothil3_cell_Class ;
   private String edtForLotHil3_Internalname ;
   private String A12404ForLotHil3 ;
   private String edtForLotHil3_Jsonclick ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtForNumCol_Internalname ;
   private String edtForNumCol_Jsonclick ;
   private String edtForFec_Internalname ;
   private String edtForFec_Jsonclick ;
   private String edtForUltMod_Internalname ;
   private String edtForUltMod_Jsonclick ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtMacProCod_Internalname ;
   private String edtMacProCod_Jsonclick ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String edtForFecHor_Internalname ;
   private String edtForFecHor_Jsonclick ;
   private String edtForUsrCod_Internalname ;
   private String A5624ForUsrCod ;
   private String edtForUsrCod_Jsonclick ;
   private String edtForFecCre_Internalname ;
   private String edtForFecCre_Jsonclick ;
   private String edtForUsrCre_Internalname ;
   private String A6608ForUsrCre ;
   private String edtForUsrCre_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtForSerDsc2_Internalname ;
   private String edtForSerDsc2_Jsonclick ;
   private String edtForAlterna_Internalname ;
   private String A13912ForAlterna ;
   private String edtForAlterna_Jsonclick ;
   private String edtForPlanta_Internalname ;
   private String edtForPlanta_Jsonclick ;
   private String edtavDecimal_Internalname ;
   private String edtavDecimal_Jsonclick ;
   private String edtavHex_Internalname ;
   private String edtavHex_Jsonclick ;
   private String edtavColores1_Internalname ;
   private String edtavColores1_Jsonclick ;
   private String edtavLongvarchar_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l1514MacProCod ;
   private String hsh ;
   private String AV21Station ;
   private String GXt_char3 ;
   private String AV22Emprcod ;
   private String GXv_char4[] ;
   private String AV23Emprnom ;
   private String GXv_char5[] ;
   private String AV24Usurcod ;
   private String GXv_char6[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA252CliCod ;
   private String sCtrlA494ForSer ;
   private String sCtrlA482ForColNom ;
   private String sCtrlA483ForColNum ;
   private String sCtrlA831TipColCod ;
   private java.util.Date A5625ForFecHor ;
   private java.util.Date A6609ForFecCre ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1514MacProCod ;
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
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n7781ForBlo ;
   private boolean n2749ForPro ;
   private boolean n13913ForPlanta ;
   private boolean n13912ForAlterna ;
   private boolean n13911ForSerDsc2 ;
   private boolean n6608ForUsrCre ;
   private boolean n6609ForFecCre ;
   private boolean n5624ForUsrCod ;
   private boolean n5625ForFecHor ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n12404ForLotHil3 ;
   private boolean n12403ForLotHil2 ;
   private boolean n7029ForNomCli3 ;
   private boolean n6379ForNomCli2 ;
   private boolean n8561Fam_Cod ;
   private boolean n5362IntCodF ;
   private boolean n3316CodSol ;
   private boolean n2838ForRelBan ;
   private boolean n3558ForFecApr ;
   private boolean n7537ForOpNum ;
   private boolean n3560ForOpcCli ;
   private boolean n3315ForNumArc ;
   private boolean n4384ForTipArt ;
   private boolean n995ForTonal ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n12130ForPanto ;
   private boolean n4339ForRGB ;
   private boolean n13929ForTipArtD ;
   private boolean n13925ForUrdP3 ;
   private boolean n13924ForUrd3 ;
   private boolean n13923ForUrdP2 ;
   private boolean n13922ForUrd2 ;
   private boolean n13921ForUrdP1 ;
   private boolean n13920ForUrd1 ;
   private boolean n13919ForTraP3 ;
   private boolean n13918ForTra3 ;
   private boolean n13917ForTraP2 ;
   private boolean n13916ForTra2 ;
   private boolean n13915ForTraP1 ;
   private boolean n13914ForTra1 ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String AV16Longvarchar ;
   private String AV11Colores ;
   private String A13911ForSerDsc2 ;
   private String AV15Hex ;
   private String AV14Colores1 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice dynForCon ;
   private HTMLChoice cmbForBlo ;
   private ICheckbox chkForPro ;
   private IDataStoreProvider pr_default ;
   private String[] H01BD2_A396EmprCod ;
   private String[] H01BD2_A1514MacProCod ;
   private boolean[] H01BD2_n1514MacProCod ;
   private String[] H01BD3_A396EmprCod ;
   private byte[] H01BD3_A484ForCon ;
   private String[] H01BD3_A14038ID_ForConD ;
   private String[] H01BD4_A65ArtCod ;
   private short[] H01BD4_A829TipArtCod ;
   private int[] H01BD4_A252CliCod ;
   private String[] H01BD4_A494ForSer ;
   private String[] H01BD4_A482ForColNom ;
   private int[] H01BD4_A483ForColNum ;
   private byte[] H01BD4_A831TipColCod ;
   private byte[] H01BD4_A13913ForPlanta ;
   private boolean[] H01BD4_n13913ForPlanta ;
   private String[] H01BD4_A13912ForAlterna ;
   private boolean[] H01BD4_n13912ForAlterna ;
   private String[] H01BD4_A13911ForSerDsc2 ;
   private boolean[] H01BD4_n13911ForSerDsc2 ;
   private String[] H01BD4_A6608ForUsrCre ;
   private boolean[] H01BD4_n6608ForUsrCre ;
   private java.util.Date[] H01BD4_A6609ForFecCre ;
   private boolean[] H01BD4_n6609ForFecCre ;
   private String[] H01BD4_A5624ForUsrCod ;
   private boolean[] H01BD4_n5624ForUsrCod ;
   private java.util.Date[] H01BD4_A5625ForFecHor ;
   private boolean[] H01BD4_n5625ForFecHor ;
   private String[] H01BD4_A1514MacProCod ;
   private boolean[] H01BD4_n1514MacProCod ;
   private java.util.Date[] H01BD4_A495ForUltMod ;
   private boolean[] H01BD4_n495ForUltMod ;
   private java.util.Date[] H01BD4_A485ForFec ;
   private boolean[] H01BD4_n485ForFec ;
   private String[] H01BD4_A12404ForLotHil3 ;
   private boolean[] H01BD4_n12404ForLotHil3 ;
   private String[] H01BD4_A12403ForLotHil2 ;
   private boolean[] H01BD4_n12403ForLotHil2 ;
   private String[] H01BD4_A7029ForNomCli3 ;
   private boolean[] H01BD4_n7029ForNomCli3 ;
   private String[] H01BD4_A6379ForNomCli2 ;
   private boolean[] H01BD4_n6379ForNomCli2 ;
   private String[] H01BD4_A2749ForPro ;
   private boolean[] H01BD4_n2749ForPro ;
   private short[] H01BD4_A8561Fam_Cod ;
   private boolean[] H01BD4_n8561Fam_Cod ;
   private String[] H01BD4_A7781ForBlo ;
   private boolean[] H01BD4_n7781ForBlo ;
   private byte[] H01BD4_A5362IntCodF ;
   private boolean[] H01BD4_n5362IntCodF ;
   private byte[] H01BD4_A484ForCon ;
   private short[] H01BD4_A3316CodSol ;
   private boolean[] H01BD4_n3316CodSol ;
   private short[] H01BD4_A626MatCod ;
   private byte[] H01BD4_A583IntCod ;
   private java.math.BigDecimal[] H01BD4_A2838ForRelBan ;
   private boolean[] H01BD4_n2838ForRelBan ;
   private java.util.Date[] H01BD4_A3558ForFecApr ;
   private boolean[] H01BD4_n3558ForFecApr ;
   private byte[] H01BD4_A7537ForOpNum ;
   private boolean[] H01BD4_n7537ForOpNum ;
   private String[] H01BD4_A3560ForOpcCli ;
   private boolean[] H01BD4_n3560ForOpcCli ;
   private int[] H01BD4_A3315ForNumArc ;
   private boolean[] H01BD4_n3315ForNumArc ;
   private short[] H01BD4_A4384ForTipArt ;
   private boolean[] H01BD4_n4384ForTipArt ;
   private String[] H01BD4_A995ForTonal ;
   private boolean[] H01BD4_n995ForTonal ;
   private int[] H01BD4_A1192ForNumCli ;
   private boolean[] H01BD4_n1192ForNumCli ;
   private String[] H01BD4_A1191ForNomCli ;
   private boolean[] H01BD4_n1191ForNomCli ;
   private String[] H01BD4_A12130ForPanto ;
   private boolean[] H01BD4_n12130ForPanto ;
   private long[] H01BD4_A4339ForRGB ;
   private boolean[] H01BD4_n4339ForRGB ;
   private String[] H01BD4_A396EmprCod ;
   private short[] H01BD4_A13925ForUrdP3 ;
   private boolean[] H01BD4_n13925ForUrdP3 ;
   private String[] H01BD4_A13924ForUrd3 ;
   private boolean[] H01BD4_n13924ForUrd3 ;
   private short[] H01BD4_A13923ForUrdP2 ;
   private boolean[] H01BD4_n13923ForUrdP2 ;
   private String[] H01BD4_A13922ForUrd2 ;
   private boolean[] H01BD4_n13922ForUrd2 ;
   private short[] H01BD4_A13921ForUrdP1 ;
   private boolean[] H01BD4_n13921ForUrdP1 ;
   private String[] H01BD4_A13920ForUrd1 ;
   private boolean[] H01BD4_n13920ForUrd1 ;
   private short[] H01BD4_A13919ForTraP3 ;
   private boolean[] H01BD4_n13919ForTraP3 ;
   private String[] H01BD4_A13918ForTra3 ;
   private boolean[] H01BD4_n13918ForTra3 ;
   private short[] H01BD4_A13917ForTraP2 ;
   private boolean[] H01BD4_n13917ForTraP2 ;
   private String[] H01BD4_A13916ForTra2 ;
   private boolean[] H01BD4_n13916ForTra2 ;
   private short[] H01BD4_A13915ForTraP1 ;
   private boolean[] H01BD4_n13915ForTraP1 ;
   private String[] H01BD4_A13914ForTra1 ;
   private boolean[] H01BD4_n13914ForTra1 ;
   private String[] H01BD4_A13929ForTipArtD ;
   private boolean[] H01BD4_n13929ForTipArtD ;
   private int[] H01BD4_A486ForNumCol ;
   private short[] H01BD5_A13925ForUrdP3 ;
   private boolean[] H01BD5_n13925ForUrdP3 ;
   private String[] H01BD5_A13924ForUrd3 ;
   private boolean[] H01BD5_n13924ForUrd3 ;
   private short[] H01BD5_A13923ForUrdP2 ;
   private boolean[] H01BD5_n13923ForUrdP2 ;
   private String[] H01BD5_A13922ForUrd2 ;
   private boolean[] H01BD5_n13922ForUrd2 ;
   private short[] H01BD5_A13921ForUrdP1 ;
   private boolean[] H01BD5_n13921ForUrdP1 ;
   private String[] H01BD5_A13920ForUrd1 ;
   private boolean[] H01BD5_n13920ForUrd1 ;
   private short[] H01BD5_A13919ForTraP3 ;
   private boolean[] H01BD5_n13919ForTraP3 ;
   private String[] H01BD5_A13918ForTra3 ;
   private boolean[] H01BD5_n13918ForTra3 ;
   private short[] H01BD5_A13917ForTraP2 ;
   private boolean[] H01BD5_n13917ForTraP2 ;
   private String[] H01BD5_A13916ForTra2 ;
   private boolean[] H01BD5_n13916ForTra2 ;
   private short[] H01BD5_A13915ForTraP1 ;
   private boolean[] H01BD5_n13915ForTraP1 ;
   private String[] H01BD5_A13914ForTra1 ;
   private boolean[] H01BD5_n13914ForTra1 ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class mtoformulastintegeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01BD2", "SELECT * FROM (SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE (EmprCod = ?) AND (UPPER(MacProCod) like UPPER(?)) ORDER BY MacProCod) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BD3", "SELECT EmprCod, ForCon, RTRIM(LTRIM(SUBSTR(TO_CHAR(ForCon,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForConDsc, ''))) AS ID_ForConD FROM TXPFORCTR WHERE EmprCod = ? ORDER BY ID_ForConD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BD4", "SELECT T3.ArtCod, T2.TipArtCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForPlanta, T1.ForAlterna, T1.ForSerDsc2, T1.ForUsrCre, T1.ForFecCre, T1.ForUsrCod, T1.ForFecHor, T1.MacProCod, T1.ForUltMod, T1.ForFec, T1.ForLotHil3, T1.ForLotHil2, T1.ForNomCli3, T1.ForNomCli2, T1.ForPro, T1.Fam_Cod, T1.ForBlo, T1.IntCodF, T1.ForCon, T1.CodSol, T1.MatCod, T1.IntCod, T1.ForRelBan, T1.ForFecApr, T1.ForOpNum, T1.ForOpcCli, T1.ForNumArc, T1.ForTipArt, T1.ForTonal, T1.ForNumCli, T1.ForNomCli, T1.ForPanto, T1.ForRGB, T1.EmprCod, COALESCE( T3.ArtUrdP3, 0) AS ForUrdP3, COALESCE( T3.ArtUrd3, ' ') AS ForUrd3, COALESCE( T3.ArtUrdP2, 0) AS ForUrdP2, COALESCE( T3.ArtUrd2, ' ') AS ForUrd2, COALESCE( T3.ArtUrdP1, 0) AS ForUrdP1, COALESCE( T3.ArtUrd1, ' ') AS ForUrd1, COALESCE( T3.ArtTraP3, 0) AS ForTraP3, COALESCE( T3.ArtTra3, ' ') AS ForTra3, COALESCE( T3.ArtTraP2, 0) AS ForTraP2, COALESCE( T3.ArtTra2, ' ') AS ForTra2, COALESCE( T3.ArtTraP1, 0) AS ForTraP1, COALESCE( T3.ArtTra1, ' ') AS ForTra1, COALESCE( T2.TipArtDsc, ' ') AS ForTipArtD, T1.ForNumCol FROM ((TXPCFORMU T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.ForTipArt) LEFT JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ForSer) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01BD5", "SELECT COALESCE( ArtUrdP3, 0) AS ForUrdP3, COALESCE( ArtUrd3, ' ') AS ForUrd3, COALESCE( ArtUrdP2, 0) AS ForUrdP2, COALESCE( ArtUrd2, ' ') AS ForUrd2, COALESCE( ArtUrdP1, 0) AS ForUrdP1, COALESCE( ArtUrd1, ' ') AS ForUrd1, COALESCE( ArtTraP3, 0) AS ForTraP3, COALESCE( ArtTra3, ' ') AS ForTra3, COALESCE( ArtTraP2, 0) AS ForTraP2, COALESCE( ArtTra2, ' ') AS ForTra2, COALESCE( ArtTraP1, 0) AS ForTraP1, COALESCE( ArtTra1, ' ') AS ForTra1 FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 35);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(23);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(25);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               ((short[]) buf[44])[0] = rslt.getShort(27);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(28);
               ((byte[]) buf[47])[0] = rslt.getByte(29);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDate(31);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((byte[]) buf[52])[0] = rslt.getByte(32);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((int[]) buf[56])[0] = rslt.getInt(34);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(35);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(36, 20);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(37);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(38, 13);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(39, 100);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((long[]) buf[68])[0] = rslt.getLong(40);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(41, 3);
               ((short[]) buf[71])[0] = rslt.getShort(42);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(43, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(44);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(45, 4);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(46);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(47, 4);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(48);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(49, 4);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(50);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(51, 4);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(52);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(53, 4);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(54, 30);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((int[]) buf[97])[0] = rslt.getInt(55);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

