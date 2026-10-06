package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnotrecgeneral_impl extends GXWebComponent
{
   public tnotrecgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnotrecgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnotrecgeneral_impl.class ));
   }

   public tnotrecgeneral_impl( int remoteHandle ,
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
      cmbNr_unidad = new HTMLChoice();
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
               A5198Nr_codigo = (int)(GXutil.lval( httpContext.GetPar( "Nr_codigo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A5198Nr_codigo)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDISCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13845TipDisDscI = httpContext.GetPar( "TipDisDscI") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipdiscodAA0( A396EmprCod, A13845TipDisDscI) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDISCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13845TipDisDscI = httpContext.GetPar( "TipDisDscI") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipdiscodAA0( A396EmprCod, A13845TipDisDscI) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPDISCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h5098TipDisCod = httpContext.GetPar( "h5098TipDisCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcatipdiscodAA2( A396EmprCod, h5098TipDisCod) ;
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
         paAA2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TNOTRECGeneral", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tnotrecgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5198Nr_codigo,8,0))}, new String[] {"EmprCod","Nr_codigo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA5198Nr_codigo", GXutil.ltrim( localUtil.ntoc( wcpOA5198Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTIPDISCOD", GXutil.rtrim( A5098TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
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

   public void renderHtmlCloseFormAA2( )
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
      return "TNOTRECGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TNOTRECGeneral", "") ;
   }

   public void wbAA0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tnotrecgeneral");
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
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_codigo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_codigo_Internalname, httpContext.getMessage( "N Reclamacion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5198Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_codigo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_codigo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_codigo_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_albrecc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_albrecc_Internalname, httpContext.getMessage( "N Recepcion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_albrecc_Internalname, GXutil.ltrim( localUtil.ntoc( A5206Nr_albrecc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_albrecc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5206Nr_albrecc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5206Nr_albrecc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_albrecc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_albrecc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTipdiscod_cell_Internalname, 1, 0, "px", 0, "px", divTipdiscod_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtTipDisCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDisCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipDisCod_Internalname, httpContext.getMessage( "Tipo Disposicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipDisCod_Internalname, h5098TipDisCod, GXutil.rtrim( localUtil.format( h5098TipDisCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTipDisCod_Visible, edtTipDisCod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_CliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_CliCod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_CliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_CliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5340Nr_CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5340Nr_CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_CliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_CliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_CliNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_CliNom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_CliNom_Internalname, GXutil.rtrim( A5341Nr_CliNom), GXutil.rtrim( localUtil.format( A5341Nr_CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_CliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_CliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_albent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_albent_Internalname, httpContext.getMessage( "Pedido Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_albent_Internalname, GXutil.rtrim( A5199Nr_albent), GXutil.rtrim( localUtil.format( A5199Nr_albent, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_albent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_albent_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_refcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_refcli_Internalname, httpContext.getMessage( "V/Referencia", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_refcli_Internalname, GXutil.rtrim( A5200Nr_refcli), GXutil.rtrim( localUtil.format( A5200Nr_refcli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_refcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_refcli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_artcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_artcod_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_artcod_Internalname, GXutil.rtrim( A5201Nr_artcod), GXutil.rtrim( localUtil.format( A5201Nr_artcod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_artcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_artcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_artdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_artdsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_artdsc_Internalname, GXutil.rtrim( A5202Nr_artdsc), GXutil.rtrim( localUtil.format( A5202Nr_artdsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_artdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_artdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_colnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_colnom_Internalname, httpContext.getMessage( "Color", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_colnom_Internalname, GXutil.rtrim( A5203Nr_colnom), GXutil.rtrim( localUtil.format( A5203Nr_colnom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_colnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_colnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_colnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_colnum_Internalname, httpContext.getMessage( "Numero", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_colnum_Internalname, GXutil.ltrim( localUtil.ntoc( A5204Nr_colnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_colnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5204Nr_colnum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5204Nr_colnum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_colnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_colnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_partida_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_partida_Internalname, httpContext.getMessage( "Partida", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_partida_Internalname, GXutil.ltrim( localUtil.ntoc( A5205Nr_partida, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_partida_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5205Nr_partida), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5205Nr_partida), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_partida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_partida_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_piezas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_piezas_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_piezas_Internalname, GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_piezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5207Nr_piezas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5207Nr_piezas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_piezas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_piezas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_unidade_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_unidade_Internalname, httpContext.getMessage( "Unidades", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_unidade_Internalname, GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_unidade_Enabled!=0) ? localUtil.format( A5208Nr_unidade, "ZZZZZ9.99") : localUtil.format( A5208Nr_unidade, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_unidade_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_unidade_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbNr_unidad.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbNr_unidad.getInternalname(), httpContext.getMessage( "Unidad", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNr_unidad, cmbNr_unidad.getInternalname(), GXutil.rtrim( A5209Nr_unidad), 1, cmbNr_unidad.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNr_unidad.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TNOTRECGeneral.htm");
         cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbNr_unidad.getInternalname(), "Values", cmbNr_unidad.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barcoda_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_barcoda_Internalname, httpContext.getMessage( "N Hdr Ant", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barcoda_Internalname, GXutil.ltrim( localUtil.ntoc( A5222Nr_barcoda, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barcoda_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barcoda_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barcoda_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barreoa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_barreoa_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barreoa_Internalname, GXutil.ltrim( localUtil.ntoc( A5223Nr_barreoa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barreoa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9") : localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barreoa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barreoa_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barpara_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_barpara_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barpara_Internalname, GXutil.rtrim( A5224Nr_barpara), GXutil.rtrim( localUtil.format( A5224Nr_barpara, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barpara_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barpara_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_NAlb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_NAlb_Internalname, httpContext.getMessage( "Nº Albaran", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_NAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A12235Nr_NAlb, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_NAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12235Nr_NAlb), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12235Nr_NAlb), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_NAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_NAlb_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_local_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_local_Internalname, httpContext.getMessage( "Localizacion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_local_Internalname, GXutil.rtrim( A5214Nr_local), GXutil.rtrim( localUtil.format( A5214Nr_local, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_local_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_local_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_fecent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_fecent_Internalname, httpContext.getMessage( "Fecha entrega", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtNr_fecent_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_fecent_Internalname, localUtil.format(A5217Nr_fecent, "99/99/99"), localUtil.format( A5217Nr_fecent, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_fecent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_fecent_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtNr_fecent_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNr_fecent_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TNOTRECGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_fecreg_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_fecreg_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtNr_fecreg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_fecreg_Internalname, localUtil.ttoc( A5216Nr_fecreg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_fecreg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_fecreg_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtNr_fecreg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNr_fecreg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TNOTRECGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_user_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_user_Internalname, httpContext.getMessage( "Usuario", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_user_Internalname, GXutil.rtrim( A5215Nr_user), GXutil.rtrim( localUtil.format( A5215Nr_user, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_user_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_user_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_barcod_Internalname, httpContext.getMessage( "Hdr", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A5210Nr_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_barreo_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barreo_Internalname, GXutil.ltrim( localUtil.ntoc( A5211Nr_barreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5211Nr_barreo), "9") : localUtil.format( DecimalUtil.doubleToDec(A5211Nr_barreo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_barpar_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barpar_Internalname, GXutil.rtrim( A5212Nr_barpar), GXutil.rtrim( localUtil.format( A5212Nr_barpar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_discod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNr_discod_Internalname, httpContext.getMessage( "N Disp", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNr_discod_Internalname, GXutil.ltrim( localUtil.ntoc( A5213Nr_discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5213Nr_discod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5213Nr_discod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_discod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_discod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11aa1_client"+"'", TempTags, "", 2, "HLP_TNOTRECGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12aa1_client"+"'", TempTags, "", 2, "HLP_TNOTRECGeneral.htm");
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

   public void startAA2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TNOTRECGeneral", ""), (short)(0)) ;
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
            strupAA0( ) ;
         }
      }
   }

   public void wsAA2( )
   {
      startAA2( ) ;
      evtAA2( ) ;
   }

   public void evtAA2( )
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
                              strupAA0( ) ;
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
                              strupAA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13AA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupAA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14AA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupAA0( ) ;
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
                              strupAA0( ) ;
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

   public void weAA2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormAA2( ) ;
         }
      }
   }

   public void paAA2( )
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

   public void gxsgatipdiscodAA0( String A396EmprCod ,
                                  String A13845TipDisDscI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipdiscod_dataAA0( A396EmprCod, A13845TipDisDscI) ;
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

   protected void gxsgatipdiscod_dataAA0( String A396EmprCod ,
                                          String A13845TipDisDscI )
   {
      l13845TipDisDscI = GXutil.concat( GXutil.rtrim( A13845TipDisDscI), "%", "") ;
      /* Using cursor H00AA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13845TipDisDscI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00AA2_A13845TipDisDscI[0]);
         gxdynajaxctrldescr.add(H00AA2_A13845TipDisDscI[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcatipdiscodAA2( String A396EmprCod ,
                                  String A13845TipDisDscI )
   {
      /* Using cursor H00AA3 */
      pr_default.execute(1, new Object[] {A13845TipDisDscI, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13845TipDisDscI = H00AA3_A13845TipDisDscI[0] ;
         A396EmprCod = H00AA3_A396EmprCod[0] ;
         A5098TipDisCod = H00AA3_A5098TipDisCod[0] ;
         n5098TipDisCod = H00AA3_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5098TipDisCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(1);
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
      if ( cmbNr_unidad.getItemCount() > 0 )
      {
         A5209Nr_unidad = cmbNr_unidad.getValidValue(A5209Nr_unidad) ;
         n5209Nr_unidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5209Nr_unidad", A5209Nr_unidad);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbNr_unidad.getInternalname(), "Values", cmbNr_unidad.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfAA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "TNOTRECGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rfAA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00AA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5213Nr_discod = H00AA4_A5213Nr_discod[0] ;
            n5213Nr_discod = H00AA4_n5213Nr_discod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5213Nr_discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5213Nr_discod), 8, 0));
            A5212Nr_barpar = H00AA4_A5212Nr_barpar[0] ;
            n5212Nr_barpar = H00AA4_n5212Nr_barpar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5212Nr_barpar", A5212Nr_barpar);
            A5211Nr_barreo = H00AA4_A5211Nr_barreo[0] ;
            n5211Nr_barreo = H00AA4_n5211Nr_barreo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5211Nr_barreo", GXutil.str( A5211Nr_barreo, 1, 0));
            A5210Nr_barcod = H00AA4_A5210Nr_barcod[0] ;
            n5210Nr_barcod = H00AA4_n5210Nr_barcod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5210Nr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5210Nr_barcod), 8, 0));
            A5215Nr_user = H00AA4_A5215Nr_user[0] ;
            n5215Nr_user = H00AA4_n5215Nr_user[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5215Nr_user", A5215Nr_user);
            A5216Nr_fecreg = H00AA4_A5216Nr_fecreg[0] ;
            n5216Nr_fecreg = H00AA4_n5216Nr_fecreg[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A5217Nr_fecent = H00AA4_A5217Nr_fecent[0] ;
            n5217Nr_fecent = H00AA4_n5217Nr_fecent[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5217Nr_fecent", localUtil.format(A5217Nr_fecent, "99/99/99"));
            A5214Nr_local = H00AA4_A5214Nr_local[0] ;
            n5214Nr_local = H00AA4_n5214Nr_local[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5214Nr_local", A5214Nr_local);
            A12235Nr_NAlb = H00AA4_A12235Nr_NAlb[0] ;
            n12235Nr_NAlb = H00AA4_n12235Nr_NAlb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12235Nr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12235Nr_NAlb), 10, 0));
            A5224Nr_barpara = H00AA4_A5224Nr_barpara[0] ;
            n5224Nr_barpara = H00AA4_n5224Nr_barpara[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5224Nr_barpara", A5224Nr_barpara);
            A5223Nr_barreoa = H00AA4_A5223Nr_barreoa[0] ;
            n5223Nr_barreoa = H00AA4_n5223Nr_barreoa[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5223Nr_barreoa", GXutil.str( A5223Nr_barreoa, 1, 0));
            A5222Nr_barcoda = H00AA4_A5222Nr_barcoda[0] ;
            n5222Nr_barcoda = H00AA4_n5222Nr_barcoda[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5222Nr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5222Nr_barcoda), 8, 0));
            A5209Nr_unidad = H00AA4_A5209Nr_unidad[0] ;
            n5209Nr_unidad = H00AA4_n5209Nr_unidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5209Nr_unidad", A5209Nr_unidad);
            A5208Nr_unidade = H00AA4_A5208Nr_unidade[0] ;
            n5208Nr_unidade = H00AA4_n5208Nr_unidade[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
            A5207Nr_piezas = H00AA4_A5207Nr_piezas[0] ;
            n5207Nr_piezas = H00AA4_n5207Nr_piezas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
            A5205Nr_partida = H00AA4_A5205Nr_partida[0] ;
            n5205Nr_partida = H00AA4_n5205Nr_partida[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5205Nr_partida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5205Nr_partida), 8, 0));
            A5204Nr_colnum = H00AA4_A5204Nr_colnum[0] ;
            n5204Nr_colnum = H00AA4_n5204Nr_colnum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5204Nr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5204Nr_colnum), 6, 0));
            A5203Nr_colnom = H00AA4_A5203Nr_colnom[0] ;
            n5203Nr_colnom = H00AA4_n5203Nr_colnom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5203Nr_colnom", A5203Nr_colnom);
            A5202Nr_artdsc = H00AA4_A5202Nr_artdsc[0] ;
            n5202Nr_artdsc = H00AA4_n5202Nr_artdsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5202Nr_artdsc", A5202Nr_artdsc);
            A5201Nr_artcod = H00AA4_A5201Nr_artcod[0] ;
            n5201Nr_artcod = H00AA4_n5201Nr_artcod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5201Nr_artcod", A5201Nr_artcod);
            A5200Nr_refcli = H00AA4_A5200Nr_refcli[0] ;
            n5200Nr_refcli = H00AA4_n5200Nr_refcli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5200Nr_refcli", A5200Nr_refcli);
            A5199Nr_albent = H00AA4_A5199Nr_albent[0] ;
            n5199Nr_albent = H00AA4_n5199Nr_albent[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5199Nr_albent", A5199Nr_albent);
            A5341Nr_CliNom = H00AA4_A5341Nr_CliNom[0] ;
            n5341Nr_CliNom = H00AA4_n5341Nr_CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5341Nr_CliNom", A5341Nr_CliNom);
            A5340Nr_CliCod = H00AA4_A5340Nr_CliCod[0] ;
            n5340Nr_CliCod = H00AA4_n5340Nr_CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
            A5098TipDisCod = H00AA4_A5098TipDisCod[0] ;
            n5098TipDisCod = H00AA4_n5098TipDisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
            A5206Nr_albrecc = H00AA4_A5206Nr_albrecc[0] ;
            n5206Nr_albrecc = H00AA4_n5206Nr_albrecc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
            if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
            {
               A5098TipDisCod = "" ;
               n5098TipDisCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
            }
            else
            {
               A13845TipDisDscI = h5098TipDisCod ;
               /* Using cursor H00AA5 */
               pr_default.execute(3, new Object[] {A13845TipDisDscI, A396EmprCod});
               A5098TipDisCod = H00AA5_A5098TipDisCod[0] ;
               n5098TipDisCod = H00AA5_n5098TipDisCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
               A5098TipDisCod = H00AA5_A5098TipDisCod[0] ;
               n5098TipDisCod = H00AA5_n5098TipDisCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
               if ( ! ( (pr_default.getStatus(3) == 101) ) )
               {
                  pr_default.readNext(3);
                  if ( ! ( (pr_default.getStatus(3) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDISCOD");
                  }
               }
               else
               {
               }
               pr_default.close(3);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h5098TipDisCod", h5098TipDisCod);
            /* Execute user event: Load */
            e14AA2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         wbAA0( ) ;
      }
   }

   public void send_integrity_lvl_hashesAA2( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "TNOTRECGeneral" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupAA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13AA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA5198Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA5198Nr_codigo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         A5206Nr_albrecc = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_albrecc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5206Nr_albrecc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
         h5098TipDisCod = httpContext.cgiGet( edtTipDisCod_Internalname) ;
         if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
         {
            A5098TipDisCod = "" ;
            n5098TipDisCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
         }
         else
         {
            A13845TipDisDscI = h5098TipDisCod ;
            /* Using cursor H00AA6 */
            pr_default.execute(4, new Object[] {A13845TipDisDscI, A396EmprCod});
            A5098TipDisCod = H00AA6_A5098TipDisCod[0] ;
            n5098TipDisCod = H00AA6_n5098TipDisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
            A5098TipDisCod = H00AA6_A5098TipDisCod[0] ;
            n5098TipDisCod = H00AA6_n5098TipDisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5098TipDisCod", A5098TipDisCod);
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDISCOD");
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h5098TipDisCod", h5098TipDisCod);
         A5340Nr_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_CliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5340Nr_CliCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         A5341Nr_CliNom = httpContext.cgiGet( edtNr_CliNom_Internalname) ;
         n5341Nr_CliNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5341Nr_CliNom", A5341Nr_CliNom);
         A5199Nr_albent = httpContext.cgiGet( edtNr_albent_Internalname) ;
         n5199Nr_albent = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5199Nr_albent", A5199Nr_albent);
         A5200Nr_refcli = httpContext.cgiGet( edtNr_refcli_Internalname) ;
         n5200Nr_refcli = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5200Nr_refcli", A5200Nr_refcli);
         A5201Nr_artcod = httpContext.cgiGet( edtNr_artcod_Internalname) ;
         n5201Nr_artcod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5201Nr_artcod", A5201Nr_artcod);
         A5202Nr_artdsc = httpContext.cgiGet( edtNr_artdsc_Internalname) ;
         n5202Nr_artdsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5202Nr_artdsc", A5202Nr_artdsc);
         A5203Nr_colnom = httpContext.cgiGet( edtNr_colnom_Internalname) ;
         n5203Nr_colnom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5203Nr_colnom", A5203Nr_colnom);
         A5204Nr_colnum = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_colnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5204Nr_colnum = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5204Nr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5204Nr_colnum), 6, 0));
         A5205Nr_partida = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_partida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5205Nr_partida = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5205Nr_partida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5205Nr_partida), 8, 0));
         A5207Nr_piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_piezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5207Nr_piezas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         A5208Nr_unidade = localUtil.ctond( httpContext.cgiGet( edtNr_unidade_Internalname)) ;
         n5208Nr_unidade = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         cmbNr_unidad.setValue( httpContext.cgiGet( cmbNr_unidad.getInternalname()) );
         A5209Nr_unidad = httpContext.cgiGet( cmbNr_unidad.getInternalname()) ;
         n5209Nr_unidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5209Nr_unidad", A5209Nr_unidad);
         A5222Nr_barcoda = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_barcoda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5222Nr_barcoda = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5222Nr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5222Nr_barcoda), 8, 0));
         A5223Nr_barreoa = (byte)(localUtil.ctol( httpContext.cgiGet( edtNr_barreoa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5223Nr_barreoa = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5223Nr_barreoa", GXutil.str( A5223Nr_barreoa, 1, 0));
         A5224Nr_barpara = httpContext.cgiGet( edtNr_barpara_Internalname) ;
         n5224Nr_barpara = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5224Nr_barpara", A5224Nr_barpara);
         A12235Nr_NAlb = localUtil.ctol( httpContext.cgiGet( edtNr_NAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n12235Nr_NAlb = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12235Nr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12235Nr_NAlb), 10, 0));
         A5214Nr_local = httpContext.cgiGet( edtNr_local_Internalname) ;
         n5214Nr_local = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5214Nr_local", A5214Nr_local);
         A5217Nr_fecent = localUtil.ctod( httpContext.cgiGet( edtNr_fecent_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n5217Nr_fecent = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5217Nr_fecent", localUtil.format(A5217Nr_fecent, "99/99/99"));
         A5216Nr_fecreg = localUtil.ctot( httpContext.cgiGet( edtNr_fecreg_Internalname)) ;
         n5216Nr_fecreg = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5215Nr_user = GXutil.upper( httpContext.cgiGet( edtNr_user_Internalname)) ;
         n5215Nr_user = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5215Nr_user", A5215Nr_user);
         A5210Nr_barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5210Nr_barcod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5210Nr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5210Nr_barcod), 8, 0));
         A5211Nr_barreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtNr_barreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5211Nr_barreo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5211Nr_barreo", GXutil.str( A5211Nr_barreo, 1, 0));
         A5212Nr_barpar = httpContext.cgiGet( edtNr_barpar_Internalname) ;
         n5212Nr_barpar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5212Nr_barpar", A5212Nr_barpar);
         A5213Nr_discod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_discod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5213Nr_discod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5213Nr_discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5213Nr_discod), 8, 0));
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
      e13AA2 ();
      if (returnInSub) return;
   }

   public void e13AA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tnotrecgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnotrecgeneral_impl.this.AV14Emprcod = GXv_char2[0] ;
      tnotrecgeneral_impl.this.AV15Emprnom = GXv_char3[0] ;
      tnotrecgeneral_impl.this.AV16Usurcod = GXv_char4[0] ;
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

   protected void e14AA2( )
   {
      /* Load Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TIPDIS", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtTipDisCod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Visible), 5, 0), true);
         divTipdiscod_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divTipdiscod_cell_Internalname, "Class", divTipdiscod_cell_Class, true);
      }
      else
      {
         edtTipDisCod_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Visible), 5, 0), true);
         divTipdiscod_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divTipdiscod_cell_Internalname, "Class", divTipdiscod_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV17Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TNOTREC" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A5198Nr_codigo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
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
      paAA2( ) ;
      wsAA2( ) ;
      weAA2( ) ;
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
      sCtrlA5198Nr_codigo = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paAA2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tnotrecgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paAA2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A5198Nr_codigo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA5198Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA5198Nr_codigo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A5198Nr_codigo != wcpOA5198Nr_codigo ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA5198Nr_codigo = A5198Nr_codigo ;
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
      sCtrlA5198Nr_codigo = httpContext.cgiGet( sPrefix+"A5198Nr_codigo_CTRL") ;
      if ( GXutil.len( sCtrlA5198Nr_codigo) > 0 )
      {
         A5198Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA5198Nr_codigo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
      }
      else
      {
         A5198Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A5198Nr_codigo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paAA2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsAA2( ) ;
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
      wsAA2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A5198Nr_codigo_PARM", GXutil.ltrim( localUtil.ntoc( A5198Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA5198Nr_codigo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A5198Nr_codigo_CTRL", GXutil.rtrim( sCtrlA5198Nr_codigo));
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
      weAA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655472", true, true);
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
      httpContext.AddJavascriptSource("tnotrecgeneral.js", "?20268211655473", false, true);
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
      edtNr_codigo_Internalname = sPrefix+"NR_CODIGO" ;
      edtNr_albrecc_Internalname = sPrefix+"NR_ALBRECC" ;
      edtTipDisCod_Internalname = sPrefix+"TIPDISCOD" ;
      divTipdiscod_cell_Internalname = sPrefix+"TIPDISCOD_CELL" ;
      divUnnamedtable15_Internalname = sPrefix+"UNNAMEDTABLE15" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtNr_CliCod_Internalname = sPrefix+"NR_CLICOD" ;
      edtNr_CliNom_Internalname = sPrefix+"NR_CLINOM" ;
      edtNr_albent_Internalname = sPrefix+"NR_ALBENT" ;
      edtNr_refcli_Internalname = sPrefix+"NR_REFCLI" ;
      divUnnamedtable14_Internalname = sPrefix+"UNNAMEDTABLE14" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      edtNr_artcod_Internalname = sPrefix+"NR_ARTCOD" ;
      edtNr_artdsc_Internalname = sPrefix+"NR_ARTDSC" ;
      edtNr_colnom_Internalname = sPrefix+"NR_COLNOM" ;
      edtNr_colnum_Internalname = sPrefix+"NR_COLNUM" ;
      edtNr_partida_Internalname = sPrefix+"NR_PARTIDA" ;
      divUnnamedtable13_Internalname = sPrefix+"UNNAMEDTABLE13" ;
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE10" ;
      edtNr_piezas_Internalname = sPrefix+"NR_PIEZAS" ;
      edtNr_unidade_Internalname = sPrefix+"NR_UNIDADE" ;
      cmbNr_unidad.setInternalname( sPrefix+"NR_UNIDAD" );
      divUnnamedtable12_Internalname = sPrefix+"UNNAMEDTABLE12" ;
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      Dvpanel_unnamedtable11_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE11" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE3" ;
      edtNr_barcoda_Internalname = sPrefix+"NR_BARCODA" ;
      edtNr_barreoa_Internalname = sPrefix+"NR_BARREOA" ;
      edtNr_barpara_Internalname = sPrefix+"NR_BARPARA" ;
      edtNr_NAlb_Internalname = sPrefix+"NR_NALB" ;
      edtNr_local_Internalname = sPrefix+"NR_LOCAL" ;
      edtNr_fecent_Internalname = sPrefix+"NR_FECENT" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE5" ;
      edtNr_fecreg_Internalname = sPrefix+"NR_FECREG" ;
      edtNr_user_Internalname = sPrefix+"NR_USER" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      edtNr_barcod_Internalname = sPrefix+"NR_BARCOD" ;
      edtNr_barreo_Internalname = sPrefix+"NR_BARREO" ;
      edtNr_barpar_Internalname = sPrefix+"NR_BARPAR" ;
      edtNr_discod_Internalname = sPrefix+"NR_DISCOD" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE6" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
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
      edtNr_discod_Jsonclick = "" ;
      edtNr_discod_Enabled = 0 ;
      edtNr_barpar_Jsonclick = "" ;
      edtNr_barpar_Enabled = 0 ;
      edtNr_barreo_Jsonclick = "" ;
      edtNr_barreo_Enabled = 0 ;
      edtNr_barcod_Jsonclick = "" ;
      edtNr_barcod_Enabled = 0 ;
      edtNr_user_Jsonclick = "" ;
      edtNr_user_Enabled = 0 ;
      edtNr_fecreg_Jsonclick = "" ;
      edtNr_fecreg_Enabled = 0 ;
      edtNr_fecent_Jsonclick = "" ;
      edtNr_fecent_Enabled = 0 ;
      edtNr_local_Jsonclick = "" ;
      edtNr_local_Enabled = 0 ;
      edtNr_NAlb_Jsonclick = "" ;
      edtNr_NAlb_Enabled = 0 ;
      edtNr_barpara_Jsonclick = "" ;
      edtNr_barpara_Enabled = 0 ;
      edtNr_barreoa_Jsonclick = "" ;
      edtNr_barreoa_Enabled = 0 ;
      edtNr_barcoda_Jsonclick = "" ;
      edtNr_barcoda_Enabled = 0 ;
      cmbNr_unidad.setJsonclick( "" );
      cmbNr_unidad.setEnabled( 0 );
      edtNr_unidade_Jsonclick = "" ;
      edtNr_unidade_Enabled = 0 ;
      edtNr_piezas_Jsonclick = "" ;
      edtNr_piezas_Enabled = 0 ;
      edtNr_partida_Jsonclick = "" ;
      edtNr_partida_Enabled = 0 ;
      edtNr_colnum_Jsonclick = "" ;
      edtNr_colnum_Enabled = 0 ;
      edtNr_colnom_Jsonclick = "" ;
      edtNr_colnom_Enabled = 0 ;
      edtNr_artdsc_Jsonclick = "" ;
      edtNr_artdsc_Enabled = 0 ;
      edtNr_artcod_Jsonclick = "" ;
      edtNr_artcod_Enabled = 0 ;
      edtNr_refcli_Jsonclick = "" ;
      edtNr_refcli_Enabled = 0 ;
      edtNr_albent_Jsonclick = "" ;
      edtNr_albent_Enabled = 0 ;
      edtNr_CliNom_Jsonclick = "" ;
      edtNr_CliNom_Enabled = 0 ;
      edtNr_CliCod_Jsonclick = "" ;
      edtNr_CliCod_Enabled = 0 ;
      edtTipDisCod_Jsonclick = "" ;
      edtTipDisCod_Enabled = 0 ;
      edtTipDisCod_Visible = 1 ;
      divTipdiscod_cell_Class = "col-xs-12 col-sm-4" ;
      edtNr_albrecc_Jsonclick = "" ;
      edtNr_albrecc_Enabled = 0 ;
      edtNr_codigo_Jsonclick = "" ;
      edtNr_codigo_Enabled = 0 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Datos (3)", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = "" ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = "" ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Datos (2)", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable11_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Iconposition = "Right" ;
      Dvpanel_unnamedtable11_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Title = "" ;
      Dvpanel_unnamedtable11_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable11_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Width = "100%" ;
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = "" ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos (1)", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      cmbNr_unidad.setName( "NR_UNIDAD" );
      cmbNr_unidad.setWebtags( "" );
      cmbNr_unidad.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbNr_unidad.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbNr_unidad.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5198Nr_codigo',fld:'NR_CODIGO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11AA1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5198Nr_codigo',fld:'NR_CODIGO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12AA1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5198Nr_codigo',fld:'NR_CODIGO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_NR_CODIGO","{handler:'valid_Nr_codigo',iparms:[]");
      setEventMetadata("VALID_NR_CODIGO",",oparms:[]}");
      setEventMetadata("VALID_TIPDISCOD","{handler:'valid_Tipdiscod',iparms:[]");
      setEventMetadata("VALID_TIPDISCOD",",oparms:[]}");
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
      A13845TipDisDscI = "" ;
      h5098TipDisCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A5098TipDisCod = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      A5341Nr_CliNom = "" ;
      A5199Nr_albent = "" ;
      A5200Nr_refcli = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      A5201Nr_artcod = "" ;
      A5202Nr_artdsc = "" ;
      A5203Nr_colnom = "" ;
      ucDvpanel_unnamedtable11 = new com.genexus.webpanels.GXUserControl();
      A5208Nr_unidade = DecimalUtil.ZERO ;
      A5209Nr_unidad = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      A5224Nr_barpara = "" ;
      A5214Nr_local = "" ;
      A5217Nr_fecent = GXutil.nullDate() ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      A5215Nr_user = "" ;
      A5212Nr_barpar = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
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
      l13845TipDisDscI = "" ;
      H00AA2_A13845TipDisDscI = new String[] {""} ;
      H00AA3_A13845TipDisDscI = new String[] {""} ;
      H00AA3_A396EmprCod = new String[] {""} ;
      H00AA3_A5098TipDisCod = new String[] {""} ;
      H00AA3_n5098TipDisCod = new boolean[] {false} ;
      AV17Pgmname = "" ;
      H00AA4_A396EmprCod = new String[] {""} ;
      H00AA4_A5198Nr_codigo = new int[1] ;
      H00AA4_A5213Nr_discod = new int[1] ;
      H00AA4_n5213Nr_discod = new boolean[] {false} ;
      H00AA4_A5212Nr_barpar = new String[] {""} ;
      H00AA4_n5212Nr_barpar = new boolean[] {false} ;
      H00AA4_A5211Nr_barreo = new byte[1] ;
      H00AA4_n5211Nr_barreo = new boolean[] {false} ;
      H00AA4_A5210Nr_barcod = new int[1] ;
      H00AA4_n5210Nr_barcod = new boolean[] {false} ;
      H00AA4_A5215Nr_user = new String[] {""} ;
      H00AA4_n5215Nr_user = new boolean[] {false} ;
      H00AA4_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      H00AA4_n5216Nr_fecreg = new boolean[] {false} ;
      H00AA4_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      H00AA4_n5217Nr_fecent = new boolean[] {false} ;
      H00AA4_A5214Nr_local = new String[] {""} ;
      H00AA4_n5214Nr_local = new boolean[] {false} ;
      H00AA4_A12235Nr_NAlb = new long[1] ;
      H00AA4_n12235Nr_NAlb = new boolean[] {false} ;
      H00AA4_A5224Nr_barpara = new String[] {""} ;
      H00AA4_n5224Nr_barpara = new boolean[] {false} ;
      H00AA4_A5223Nr_barreoa = new byte[1] ;
      H00AA4_n5223Nr_barreoa = new boolean[] {false} ;
      H00AA4_A5222Nr_barcoda = new int[1] ;
      H00AA4_n5222Nr_barcoda = new boolean[] {false} ;
      H00AA4_A5209Nr_unidad = new String[] {""} ;
      H00AA4_n5209Nr_unidad = new boolean[] {false} ;
      H00AA4_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00AA4_n5208Nr_unidade = new boolean[] {false} ;
      H00AA4_A5207Nr_piezas = new int[1] ;
      H00AA4_n5207Nr_piezas = new boolean[] {false} ;
      H00AA4_A5205Nr_partida = new int[1] ;
      H00AA4_n5205Nr_partida = new boolean[] {false} ;
      H00AA4_A5204Nr_colnum = new int[1] ;
      H00AA4_n5204Nr_colnum = new boolean[] {false} ;
      H00AA4_A5203Nr_colnom = new String[] {""} ;
      H00AA4_n5203Nr_colnom = new boolean[] {false} ;
      H00AA4_A5202Nr_artdsc = new String[] {""} ;
      H00AA4_n5202Nr_artdsc = new boolean[] {false} ;
      H00AA4_A5201Nr_artcod = new String[] {""} ;
      H00AA4_n5201Nr_artcod = new boolean[] {false} ;
      H00AA4_A5200Nr_refcli = new String[] {""} ;
      H00AA4_n5200Nr_refcli = new boolean[] {false} ;
      H00AA4_A5199Nr_albent = new String[] {""} ;
      H00AA4_n5199Nr_albent = new boolean[] {false} ;
      H00AA4_A5341Nr_CliNom = new String[] {""} ;
      H00AA4_n5341Nr_CliNom = new boolean[] {false} ;
      H00AA4_A5340Nr_CliCod = new int[1] ;
      H00AA4_n5340Nr_CliCod = new boolean[] {false} ;
      H00AA4_A5098TipDisCod = new String[] {""} ;
      H00AA4_n5098TipDisCod = new boolean[] {false} ;
      H00AA4_A5206Nr_albrecc = new int[1] ;
      H00AA4_n5206Nr_albrecc = new boolean[] {false} ;
      H00AA5_A13845TipDisDscI = new String[] {""} ;
      H00AA5_A396EmprCod = new String[] {""} ;
      H00AA5_A5098TipDisCod = new String[] {""} ;
      H00AA5_n5098TipDisCod = new boolean[] {false} ;
      H00AA6_A13845TipDisDscI = new String[] {""} ;
      H00AA6_A396EmprCod = new String[] {""} ;
      H00AA6_A5098TipDisCod = new String[] {""} ;
      H00AA6_n5098TipDisCod = new boolean[] {false} ;
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
      sCtrlA5198Nr_codigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotrecgeneral__default(),
         new Object[] {
             new Object[] {
            H00AA2_A13845TipDisDscI
            }
            , new Object[] {
            H00AA3_A13845TipDisDscI, H00AA3_A396EmprCod, H00AA3_A5098TipDisCod
            }
            , new Object[] {
            H00AA4_A396EmprCod, H00AA4_A5198Nr_codigo, H00AA4_A5213Nr_discod, H00AA4_n5213Nr_discod, H00AA4_A5212Nr_barpar, H00AA4_n5212Nr_barpar, H00AA4_A5211Nr_barreo, H00AA4_n5211Nr_barreo, H00AA4_A5210Nr_barcod, H00AA4_n5210Nr_barcod,
            H00AA4_A5215Nr_user, H00AA4_n5215Nr_user, H00AA4_A5216Nr_fecreg, H00AA4_n5216Nr_fecreg, H00AA4_A5217Nr_fecent, H00AA4_n5217Nr_fecent, H00AA4_A5214Nr_local, H00AA4_n5214Nr_local, H00AA4_A12235Nr_NAlb, H00AA4_n12235Nr_NAlb,
            H00AA4_A5224Nr_barpara, H00AA4_n5224Nr_barpara, H00AA4_A5223Nr_barreoa, H00AA4_n5223Nr_barreoa, H00AA4_A5222Nr_barcoda, H00AA4_n5222Nr_barcoda, H00AA4_A5209Nr_unidad, H00AA4_n5209Nr_unidad, H00AA4_A5208Nr_unidade, H00AA4_n5208Nr_unidade,
            H00AA4_A5207Nr_piezas, H00AA4_n5207Nr_piezas, H00AA4_A5205Nr_partida, H00AA4_n5205Nr_partida, H00AA4_A5204Nr_colnum, H00AA4_n5204Nr_colnum, H00AA4_A5203Nr_colnom, H00AA4_n5203Nr_colnom, H00AA4_A5202Nr_artdsc, H00AA4_n5202Nr_artdsc,
            H00AA4_A5201Nr_artcod, H00AA4_n5201Nr_artcod, H00AA4_A5200Nr_refcli, H00AA4_n5200Nr_refcli, H00AA4_A5199Nr_albent, H00AA4_n5199Nr_albent, H00AA4_A5341Nr_CliNom, H00AA4_n5341Nr_CliNom, H00AA4_A5340Nr_CliCod, H00AA4_n5340Nr_CliCod,
            H00AA4_A5098TipDisCod, H00AA4_n5098TipDisCod, H00AA4_A5206Nr_albrecc, H00AA4_n5206Nr_albrecc
            }
            , new Object[] {
            H00AA5_A13845TipDisDscI, H00AA5_A396EmprCod, H00AA5_A5098TipDisCod
            }
            , new Object[] {
            H00AA6_A13845TipDisDscI, H00AA6_A396EmprCod, H00AA6_A5098TipDisCod
            }
         }
      );
      AV17Pgmname = "TNOTRECGeneral" ;
      /* GeneXus formulas. */
      AV17Pgmname = "TNOTRECGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A5223Nr_barreoa ;
   private byte A5211Nr_barreo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA5198Nr_codigo ;
   private int A5198Nr_codigo ;
   private int edtNr_codigo_Enabled ;
   private int A5206Nr_albrecc ;
   private int edtNr_albrecc_Enabled ;
   private int edtTipDisCod_Visible ;
   private int edtTipDisCod_Enabled ;
   private int A5340Nr_CliCod ;
   private int edtNr_CliCod_Enabled ;
   private int edtNr_CliNom_Enabled ;
   private int edtNr_albent_Enabled ;
   private int edtNr_refcli_Enabled ;
   private int edtNr_artcod_Enabled ;
   private int edtNr_artdsc_Enabled ;
   private int edtNr_colnom_Enabled ;
   private int A5204Nr_colnum ;
   private int edtNr_colnum_Enabled ;
   private int A5205Nr_partida ;
   private int edtNr_partida_Enabled ;
   private int A5207Nr_piezas ;
   private int edtNr_piezas_Enabled ;
   private int edtNr_unidade_Enabled ;
   private int A5222Nr_barcoda ;
   private int edtNr_barcoda_Enabled ;
   private int edtNr_barreoa_Enabled ;
   private int edtNr_barpara_Enabled ;
   private int edtNr_NAlb_Enabled ;
   private int edtNr_local_Enabled ;
   private int edtNr_fecent_Enabled ;
   private int edtNr_fecreg_Enabled ;
   private int edtNr_user_Enabled ;
   private int A5210Nr_barcod ;
   private int edtNr_barcod_Enabled ;
   private int edtNr_barreo_Enabled ;
   private int edtNr_barpar_Enabled ;
   private int A5213Nr_discod ;
   private int edtNr_discod_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private long A12235Nr_NAlb ;
   private java.math.BigDecimal A5208Nr_unidade ;
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
   private String A5098TipDisCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable15_Internalname ;
   private String edtNr_codigo_Internalname ;
   private String edtNr_codigo_Jsonclick ;
   private String edtNr_albrecc_Internalname ;
   private String edtNr_albrecc_Jsonclick ;
   private String divTipdiscod_cell_Internalname ;
   private String divTipdiscod_cell_Class ;
   private String edtTipDisCod_Internalname ;
   private String edtTipDisCod_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String edtNr_CliCod_Internalname ;
   private String edtNr_CliCod_Jsonclick ;
   private String edtNr_CliNom_Internalname ;
   private String A5341Nr_CliNom ;
   private String edtNr_CliNom_Jsonclick ;
   private String edtNr_albent_Internalname ;
   private String A5199Nr_albent ;
   private String edtNr_albent_Jsonclick ;
   private String edtNr_refcli_Internalname ;
   private String A5200Nr_refcli ;
   private String edtNr_refcli_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String edtNr_artcod_Internalname ;
   private String A5201Nr_artcod ;
   private String edtNr_artcod_Jsonclick ;
   private String edtNr_artdsc_Internalname ;
   private String A5202Nr_artdsc ;
   private String edtNr_artdsc_Jsonclick ;
   private String edtNr_colnom_Internalname ;
   private String A5203Nr_colnom ;
   private String edtNr_colnom_Jsonclick ;
   private String edtNr_colnum_Internalname ;
   private String edtNr_colnum_Jsonclick ;
   private String edtNr_partida_Internalname ;
   private String edtNr_partida_Jsonclick ;
   private String Dvpanel_unnamedtable11_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String edtNr_piezas_Internalname ;
   private String edtNr_piezas_Jsonclick ;
   private String edtNr_unidade_Internalname ;
   private String edtNr_unidade_Jsonclick ;
   private String A5209Nr_unidad ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtNr_barcoda_Internalname ;
   private String edtNr_barcoda_Jsonclick ;
   private String edtNr_barreoa_Internalname ;
   private String edtNr_barreoa_Jsonclick ;
   private String edtNr_barpara_Internalname ;
   private String A5224Nr_barpara ;
   private String edtNr_barpara_Jsonclick ;
   private String edtNr_NAlb_Internalname ;
   private String edtNr_NAlb_Jsonclick ;
   private String edtNr_local_Internalname ;
   private String A5214Nr_local ;
   private String edtNr_local_Jsonclick ;
   private String edtNr_fecent_Internalname ;
   private String edtNr_fecent_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtNr_fecreg_Internalname ;
   private String edtNr_fecreg_Jsonclick ;
   private String edtNr_user_Internalname ;
   private String A5215Nr_user ;
   private String edtNr_user_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtNr_barcod_Internalname ;
   private String edtNr_barcod_Jsonclick ;
   private String edtNr_barreo_Internalname ;
   private String edtNr_barreo_Jsonclick ;
   private String edtNr_barpar_Internalname ;
   private String A5212Nr_barpar ;
   private String edtNr_barpar_Jsonclick ;
   private String edtNr_discod_Internalname ;
   private String edtNr_discod_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV17Pgmname ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV14Emprcod ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA5198Nr_codigo ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date A5217Nr_fecent ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5098TipDisCod ;
   private boolean n5209Nr_unidad ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n5213Nr_discod ;
   private boolean n5212Nr_barpar ;
   private boolean n5211Nr_barreo ;
   private boolean n5210Nr_barcod ;
   private boolean n5215Nr_user ;
   private boolean n5216Nr_fecreg ;
   private boolean n5217Nr_fecent ;
   private boolean n5214Nr_local ;
   private boolean n12235Nr_NAlb ;
   private boolean n5224Nr_barpara ;
   private boolean n5223Nr_barreoa ;
   private boolean n5222Nr_barcoda ;
   private boolean n5208Nr_unidade ;
   private boolean n5207Nr_piezas ;
   private boolean n5205Nr_partida ;
   private boolean n5204Nr_colnum ;
   private boolean n5203Nr_colnom ;
   private boolean n5202Nr_artdsc ;
   private boolean n5201Nr_artcod ;
   private boolean n5200Nr_refcli ;
   private boolean n5199Nr_albent ;
   private boolean n5341Nr_CliNom ;
   private boolean n5340Nr_CliCod ;
   private boolean n5206Nr_albrecc ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13845TipDisDscI ;
   private String h5098TipDisCod ;
   private String l13845TipDisDscI ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable11 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private HTMLChoice cmbNr_unidad ;
   private IDataStoreProvider pr_default ;
   private String[] H00AA2_A13845TipDisDscI ;
   private String[] H00AA3_A13845TipDisDscI ;
   private String[] H00AA3_A396EmprCod ;
   private String[] H00AA3_A5098TipDisCod ;
   private boolean[] H00AA3_n5098TipDisCod ;
   private String[] H00AA4_A396EmprCod ;
   private int[] H00AA4_A5198Nr_codigo ;
   private int[] H00AA4_A5213Nr_discod ;
   private boolean[] H00AA4_n5213Nr_discod ;
   private String[] H00AA4_A5212Nr_barpar ;
   private boolean[] H00AA4_n5212Nr_barpar ;
   private byte[] H00AA4_A5211Nr_barreo ;
   private boolean[] H00AA4_n5211Nr_barreo ;
   private int[] H00AA4_A5210Nr_barcod ;
   private boolean[] H00AA4_n5210Nr_barcod ;
   private String[] H00AA4_A5215Nr_user ;
   private boolean[] H00AA4_n5215Nr_user ;
   private java.util.Date[] H00AA4_A5216Nr_fecreg ;
   private boolean[] H00AA4_n5216Nr_fecreg ;
   private java.util.Date[] H00AA4_A5217Nr_fecent ;
   private boolean[] H00AA4_n5217Nr_fecent ;
   private String[] H00AA4_A5214Nr_local ;
   private boolean[] H00AA4_n5214Nr_local ;
   private long[] H00AA4_A12235Nr_NAlb ;
   private boolean[] H00AA4_n12235Nr_NAlb ;
   private String[] H00AA4_A5224Nr_barpara ;
   private boolean[] H00AA4_n5224Nr_barpara ;
   private byte[] H00AA4_A5223Nr_barreoa ;
   private boolean[] H00AA4_n5223Nr_barreoa ;
   private int[] H00AA4_A5222Nr_barcoda ;
   private boolean[] H00AA4_n5222Nr_barcoda ;
   private String[] H00AA4_A5209Nr_unidad ;
   private boolean[] H00AA4_n5209Nr_unidad ;
   private java.math.BigDecimal[] H00AA4_A5208Nr_unidade ;
   private boolean[] H00AA4_n5208Nr_unidade ;
   private int[] H00AA4_A5207Nr_piezas ;
   private boolean[] H00AA4_n5207Nr_piezas ;
   private int[] H00AA4_A5205Nr_partida ;
   private boolean[] H00AA4_n5205Nr_partida ;
   private int[] H00AA4_A5204Nr_colnum ;
   private boolean[] H00AA4_n5204Nr_colnum ;
   private String[] H00AA4_A5203Nr_colnom ;
   private boolean[] H00AA4_n5203Nr_colnom ;
   private String[] H00AA4_A5202Nr_artdsc ;
   private boolean[] H00AA4_n5202Nr_artdsc ;
   private String[] H00AA4_A5201Nr_artcod ;
   private boolean[] H00AA4_n5201Nr_artcod ;
   private String[] H00AA4_A5200Nr_refcli ;
   private boolean[] H00AA4_n5200Nr_refcli ;
   private String[] H00AA4_A5199Nr_albent ;
   private boolean[] H00AA4_n5199Nr_albent ;
   private String[] H00AA4_A5341Nr_CliNom ;
   private boolean[] H00AA4_n5341Nr_CliNom ;
   private int[] H00AA4_A5340Nr_CliCod ;
   private boolean[] H00AA4_n5340Nr_CliCod ;
   private String[] H00AA4_A5098TipDisCod ;
   private boolean[] H00AA4_n5098TipDisCod ;
   private int[] H00AA4_A5206Nr_albrecc ;
   private boolean[] H00AA4_n5206Nr_albrecc ;
   private String[] H00AA5_A13845TipDisDscI ;
   private String[] H00AA5_A396EmprCod ;
   private String[] H00AA5_A5098TipDisCod ;
   private boolean[] H00AA5_n5098TipDisCod ;
   private String[] H00AA6_A13845TipDisDscI ;
   private String[] H00AA6_A396EmprCod ;
   private String[] H00AA6_A5098TipDisCod ;
   private boolean[] H00AA6_n5098TipDisCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tnotrecgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00AA2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI FROM TXPTIPDIS WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, '')))) like '%' || UPPER(?)) ORDER BY TipDisDscI) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00AA3", "SELECT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00AA4", "SELECT EmprCod, Nr_codigo, Nr_discod, Nr_barpar, Nr_barreo, Nr_barcod, Nr_user, Nr_fecreg, Nr_fecent, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_partida, Nr_colnum, Nr_colnom, Nr_artdsc, Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, TipDisCod, Nr_albrecc FROM TXPNOTREC WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00AA5", "SELECT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00AA6", "SELECT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 13);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((int[]) buf[48])[0] = rslt.getInt(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((int[]) buf[52])[0] = rslt.getInt(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

