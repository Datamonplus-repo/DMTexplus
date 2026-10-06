package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmprevegeneral_impl extends GXWebComponent
{
   public tmprevegeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmprevegeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmprevegeneral_impl.class ));
   }

   public tmprevegeneral_impl( int remoteHandle ,
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
      cmbPMEst = new HTMLChoice();
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
               A9429PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A9429PMCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PMMAQCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgapmmaqcodRF0( A396EmprCod, A13734MaqCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PMMAQCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgapmmaqcodRF0( A396EmprCod, A13734MaqCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PMMAQCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h9476PMMaqCod = httpContext.GetPar( "h9476PMMaqCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcapmmaqcodRF2( A396EmprCod, h9476PMMaqCod) ;
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
         paRF2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TMPreve General", "")) ;
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
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmprevegeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9429PMCod,8,0))}, new String[] {"EmprCod","PMCod"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TMPreveGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmprevegeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA9429PMCod", GXutil.ltrim( localUtil.ntoc( wcpOA9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCPMMAQCOD", GXutil.rtrim( A9476PMMaqCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Width", GXutil.rtrim( Dvpanel_transactiondetail_tablefrecuencia_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tablefrecuencia_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tablefrecuencia_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tablefrecuencia_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Title", GXutil.rtrim( Dvpanel_transactiondetail_tablefrecuencia_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tablefrecuencia_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tablefrecuencia_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tablefrecuencia_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tablefrecuencia_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tablefrecuencia_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Width", GXutil.rtrim( Dvpanel_transactiondetail_tabletexto_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tabletexto_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tabletexto_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tabletexto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Title", GXutil.rtrim( Dvpanel_transactiondetail_tabletexto_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tabletexto_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tabletexto_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tabletexto_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tabletexto_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tabletexto_Autoscroll));
   }

   public void renderHtmlCloseFormRF2( )
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
      return "MantenimientoMaquina.TMPreveGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TMPreve General", "") ;
   }

   public void wbRF0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.mantenimientomaquina.tmprevegeneral");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMCod_Internalname, "#", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMDsc_Internalname, httpContext.getMessage( "Mantenimiento Preventivo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMDsc_Internalname, GXutil.rtrim( A9473PMDsc), GXutil.rtrim( localUtil.format( A9473PMDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMMaqCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMMaqCod_Internalname, httpContext.getMessage( "Máquina", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMMaqCod_Internalname, h9476PMMaqCod, GXutil.rtrim( localUtil.format( h9476PMMaqCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMMaqCod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPMEst.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPMEst.getInternalname(), httpContext.getMessage( "Estado", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPMEst, cmbPMEst.getInternalname(), GXutil.rtrim( A9478PMEst), 1, cmbPMEst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPMEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         cmbPMEst.setValue( GXutil.rtrim( A9478PMEst) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPMEst.getInternalname(), "Values", cmbPMEst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMFchCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMFchCre_Internalname, httpContext.getMessage( "Fecha Creación", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPMFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMFchCre_Internalname, localUtil.format(A9474PMFchCre, "99/99/99"), localUtil.format( A9474PMFchCre, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMFchCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPMFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMUsuCre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMUsuCre_Internalname, httpContext.getMessage( "Usuario Creación", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMUsuCre_Internalname, GXutil.rtrim( A9475PMUsuCre), GXutil.rtrim( localUtil.format( A9475PMUsuCre, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUsuCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
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
         /* User Defined Control */
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("Width", Dvpanel_transactiondetail_tablefrecuencia_Width);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("AutoWidth", Dvpanel_transactiondetail_tablefrecuencia_Autowidth);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("AutoHeight", Dvpanel_transactiondetail_tablefrecuencia_Autoheight);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("Cls", Dvpanel_transactiondetail_tablefrecuencia_Cls);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("Title", Dvpanel_transactiondetail_tablefrecuencia_Title);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("Collapsible", Dvpanel_transactiondetail_tablefrecuencia_Collapsible);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("Collapsed", Dvpanel_transactiondetail_tablefrecuencia_Collapsed);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tablefrecuencia_Showcollapseicon);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("IconPosition", Dvpanel_transactiondetail_tablefrecuencia_Iconposition);
         ucDvpanel_transactiondetail_tablefrecuencia.setProperty("AutoScroll", Dvpanel_transactiondetail_tablefrecuencia_Autoscroll);
         ucDvpanel_transactiondetail_tablefrecuencia.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tablefrecuencia_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIAContainer"+"TransactionDetail_TableFrecuencia"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablefrecuencia_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, httpContext.getMessage( "Frecuencia", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_frecuencia_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmdias_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmdias_Internalname, httpContext.getMessage( "Días", ""), "", "", lblTextblockpmdias_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMDias_Internalname, httpContext.getMessage( "Días", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMDias_Internalname, GXutil.ltrim( localUtil.ntoc( A9487PMDias, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9487PMDias), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9487PMDias), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDias_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDias_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmuso_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmuso_Internalname, httpContext.getMessage( "Uso del Equipo", ""), "", "", lblTextblockpmuso_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMUso_Internalname, httpContext.getMessage( "Uso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMUso_Internalname, GXutil.ltrim( localUtil.ntoc( A11454PMUso, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMUso_Enabled!=0) ? localUtil.format( A11454PMUso, "ZZZZ9.99") : localUtil.format( A11454PMUso, "ZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUso_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmusomts_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmusomts_Internalname, httpContext.getMessage( "Uso en Metros", ""), "", "", lblTextblockpmusomts_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMUsoMts_Internalname, httpContext.getMessage( "Uso en funcion Metros Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMUsoMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13013PMUsoMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMUsoMts_Enabled!=0) ? localUtil.format( A13013PMUsoMts, "ZZZZZZ9.99") : localUtil.format( A13013PMUsoMts, "ZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUsoMts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUsoMts_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "Planificación", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_planificacion_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmtie_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmtie_Internalname, httpContext.getMessage( "Minutos Previstos", ""), "", "", lblTextblockpmtie_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMTie_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMTie_Internalname, GXutil.ltrim( localUtil.ntoc( A11455PMTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMTie_Enabled!=0) ? localUtil.format( A11455PMTie, "ZZ9.99") : localUtil.format( A11455PMTie, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMTie_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmpla_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmpla_Internalname, httpContext.getMessage( "Planificar", ""), "", "", lblTextblockpmpla_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMPla_Internalname, httpContext.getMessage( "Planificar", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMPla_Internalname, GXutil.rtrim( A11456PMPla), GXutil.rtrim( localUtil.format( A11456PMPla, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMPla_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMPla_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Validez", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_validez_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmini_Internalname, httpContext.getMessage( "Inicio", ""), "", "", lblTextblockpmini_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMIni_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPMIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMIni_Internalname, localUtil.format(A9484PMIni, "99/99/99"), localUtil.format( A9484PMIni, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMIni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMIni_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPMIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmfin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmfin_Internalname, httpContext.getMessage( "Fin", ""), "", "", lblTextblockpmfin_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMFin_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPMFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMFin_Internalname, localUtil.format(A9485PMFin, "99/99/99"), localUtil.format( A9485PMFin, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMFin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMFin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPMFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, httpContext.getMessage( "Ultima Instancia", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_ultimainstancia_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmult_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmult_Internalname, httpContext.getMessage( "Ultima", ""), "", "", lblTextblockpmult_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMUlt_Internalname, httpContext.getMessage( "Ultima", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPMUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMUlt_Internalname, localUtil.format(A9486PMUlt, "99/99/99"), localUtil.format( A9486PMUlt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPMUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPMUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepmord_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpmord_Internalname, httpContext.getMessage( "Orden Actual", ""), "", "", lblTextblockpmord_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMOrd_Internalname, httpContext.getMessage( "Orden Actual", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9488PMOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9488PMOrd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9488PMOrd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMOrd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMOrd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         /* User Defined Control */
         ucDvpanel_transactiondetail_tabletexto.setProperty("Width", Dvpanel_transactiondetail_tabletexto_Width);
         ucDvpanel_transactiondetail_tabletexto.setProperty("AutoWidth", Dvpanel_transactiondetail_tabletexto_Autowidth);
         ucDvpanel_transactiondetail_tabletexto.setProperty("AutoHeight", Dvpanel_transactiondetail_tabletexto_Autoheight);
         ucDvpanel_transactiondetail_tabletexto.setProperty("Cls", Dvpanel_transactiondetail_tabletexto_Cls);
         ucDvpanel_transactiondetail_tabletexto.setProperty("Title", Dvpanel_transactiondetail_tabletexto_Title);
         ucDvpanel_transactiondetail_tabletexto.setProperty("Collapsible", Dvpanel_transactiondetail_tabletexto_Collapsible);
         ucDvpanel_transactiondetail_tabletexto.setProperty("Collapsed", Dvpanel_transactiondetail_tabletexto_Collapsed);
         ucDvpanel_transactiondetail_tabletexto.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tabletexto_Showcollapseicon);
         ucDvpanel_transactiondetail_tabletexto.setProperty("IconPosition", Dvpanel_transactiondetail_tabletexto_Iconposition);
         ucDvpanel_transactiondetail_tabletexto.setProperty("AutoScroll", Dvpanel_transactiondetail_tabletexto_Autoscroll);
         ucDvpanel_transactiondetail_tabletexto.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tabletexto_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTOContainer"+"TransactionDetail_TableTexto"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tabletexto_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMTxt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPMTxt_Internalname, httpContext.getMessage( "Texto del Preventivo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtPMTxt_Internalname, A9483PMTxt, "", "", (short)(0), 1, edtPMTxt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPMMaqDsc_Internalname, GXutil.rtrim( A9477PMMaqDsc), GXutil.rtrim( localUtil.format( A9477PMMaqDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtPMMaqDsc_Visible, 0, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startRF2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TMPreve General", ""), (short)(0)) ;
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
            strupRF0( ) ;
         }
      }
   }

   public void wsRF2( )
   {
      startRF2( ) ;
      evtRF2( ) ;
   }

   public void evtRF2( )
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
                              strupRF0( ) ;
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
                              strupRF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11RF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupRF0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e12RF2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupRF0( ) ;
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
                              strupRF0( ) ;
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

   public void weRF2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormRF2( ) ;
         }
      }
   }

   public void paRF2( )
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

   public void gxsgapmmaqcodRF0( String A396EmprCod ,
                                 String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgapmmaqcod_dataRF0( A396EmprCod, A13734MaqCDsc) ;
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

   protected void gxsgapmmaqcod_dataRF0( String A396EmprCod ,
                                         String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H00RF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00RF2_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H00RF2_A13734MaqCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcapmmaqcodRF2( String A396EmprCod ,
                                 String A13734MaqCDsc )
   {
      /* Using cursor H00RF3 */
      pr_default.execute(1, new Object[] {A13734MaqCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = H00RF3_A13734MaqCDsc[0] ;
         A396EmprCod = H00RF3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A602MaqCod = H00RF3_A602MaqCod[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
      if ( cmbPMEst.getItemCount() > 0 )
      {
         A9478PMEst = cmbPMEst.getValidValue(A9478PMEst) ;
         n9478PMEst = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9478PMEst", A9478PMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPMEst.setValue( GXutil.rtrim( A9478PMEst) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPMEst.getInternalname(), "Values", cmbPMEst.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfRF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "MantenimientoMaquina.TMPreveGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfRF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00RF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9477PMMaqDsc = H00RF4_A9477PMMaqDsc[0] ;
            n9477PMMaqDsc = H00RF4_n9477PMMaqDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9477PMMaqDsc", A9477PMMaqDsc);
            A9483PMTxt = H00RF4_A9483PMTxt[0] ;
            n9483PMTxt = H00RF4_n9483PMTxt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9483PMTxt", A9483PMTxt);
            A9488PMOrd = H00RF4_A9488PMOrd[0] ;
            n9488PMOrd = H00RF4_n9488PMOrd[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9488PMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9488PMOrd), 8, 0));
            A9486PMUlt = H00RF4_A9486PMUlt[0] ;
            n9486PMUlt = H00RF4_n9486PMUlt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
            A9485PMFin = H00RF4_A9485PMFin[0] ;
            n9485PMFin = H00RF4_n9485PMFin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9485PMFin", localUtil.format(A9485PMFin, "99/99/99"));
            A9484PMIni = H00RF4_A9484PMIni[0] ;
            n9484PMIni = H00RF4_n9484PMIni[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
            A11456PMPla = H00RF4_A11456PMPla[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11456PMPla", A11456PMPla);
            A11455PMTie = H00RF4_A11455PMTie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11455PMTie", GXutil.ltrimstr( A11455PMTie, 6, 2));
            A13013PMUsoMts = H00RF4_A13013PMUsoMts[0] ;
            n13013PMUsoMts = H00RF4_n13013PMUsoMts[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13013PMUsoMts", GXutil.ltrimstr( A13013PMUsoMts, 10, 2));
            A11454PMUso = H00RF4_A11454PMUso[0] ;
            n11454PMUso = H00RF4_n11454PMUso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11454PMUso", GXutil.ltrimstr( A11454PMUso, 8, 2));
            A9487PMDias = H00RF4_A9487PMDias[0] ;
            n9487PMDias = H00RF4_n9487PMDias[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9487PMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9487PMDias), 3, 0));
            A9475PMUsuCre = H00RF4_A9475PMUsuCre[0] ;
            n9475PMUsuCre = H00RF4_n9475PMUsuCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9475PMUsuCre", A9475PMUsuCre);
            A9474PMFchCre = H00RF4_A9474PMFchCre[0] ;
            n9474PMFchCre = H00RF4_n9474PMFchCre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
            A9478PMEst = H00RF4_A9478PMEst[0] ;
            n9478PMEst = H00RF4_n9478PMEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9478PMEst", A9478PMEst);
            A9476PMMaqCod = H00RF4_A9476PMMaqCod[0] ;
            n9476PMMaqCod = H00RF4_n9476PMMaqCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9476PMMaqCod", A9476PMMaqCod);
            A9473PMDsc = H00RF4_A9473PMDsc[0] ;
            n9473PMDsc = H00RF4_n9473PMDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9473PMDsc", A9473PMDsc);
            A9477PMMaqDsc = H00RF4_A9477PMMaqDsc[0] ;
            n9477PMMaqDsc = H00RF4_n9477PMMaqDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9477PMMaqDsc", A9477PMMaqDsc);
            /* Execute user event: Load */
            e12RF2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         wbRF0( ) ;
      }
   }

   public void send_integrity_lvl_hashesRF2( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "MantenimientoMaquina.TMPreveGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H00RF5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      A407EmprNom = H00RF5_A407EmprNom[0] ;
      n407EmprNom = H00RF5_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(3);
      pr_default.close(3);
      fix_multi_value_controls( ) ;
   }

   public void strupRF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11RF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_transactiondetail_tablefrecuencia_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Width") ;
         Dvpanel_transactiondetail_tablefrecuencia_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Autowidth")) ;
         Dvpanel_transactiondetail_tablefrecuencia_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Autoheight")) ;
         Dvpanel_transactiondetail_tablefrecuencia_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Cls") ;
         Dvpanel_transactiondetail_tablefrecuencia_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Title") ;
         Dvpanel_transactiondetail_tablefrecuencia_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Collapsible")) ;
         Dvpanel_transactiondetail_tablefrecuencia_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Collapsed")) ;
         Dvpanel_transactiondetail_tablefrecuencia_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tablefrecuencia_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Iconposition") ;
         Dvpanel_transactiondetail_tablefrecuencia_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA_Autoscroll")) ;
         Dvpanel_transactiondetail_tabletexto_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Width") ;
         Dvpanel_transactiondetail_tabletexto_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Autowidth")) ;
         Dvpanel_transactiondetail_tabletexto_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Autoheight")) ;
         Dvpanel_transactiondetail_tabletexto_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Cls") ;
         Dvpanel_transactiondetail_tabletexto_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Title") ;
         Dvpanel_transactiondetail_tabletexto_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Collapsible")) ;
         Dvpanel_transactiondetail_tabletexto_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Collapsed")) ;
         Dvpanel_transactiondetail_tabletexto_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tabletexto_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Iconposition") ;
         Dvpanel_transactiondetail_tabletexto_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO_Autoscroll")) ;
         /* Read variables values. */
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
         n9473PMDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9473PMDsc", A9473PMDsc);
         h9476PMMaqCod = httpContext.cgiGet( edtPMMaqCod_Internalname) ;
         if ( (GXutil.strcmp("", h9476PMMaqCod)==0) )
         {
            A9476PMMaqCod = "" ;
            n9476PMMaqCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9476PMMaqCod", A9476PMMaqCod);
         }
         else
         {
            A13734MaqCDsc = h9476PMMaqCod ;
            /* Using cursor H00RF6 */
            pr_default.execute(4, new Object[] {A13734MaqCDsc, A396EmprCod});
            A9476PMMaqCod = H00RF6_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "PMMAQCOD");
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h9476PMMaqCod", h9476PMMaqCod);
         cmbPMEst.setValue( httpContext.cgiGet( cmbPMEst.getInternalname()) );
         A9478PMEst = httpContext.cgiGet( cmbPMEst.getInternalname()) ;
         n9478PMEst = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9478PMEst", A9478PMEst);
         A9474PMFchCre = localUtil.ctod( httpContext.cgiGet( edtPMFchCre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n9474PMFchCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9474PMFchCre", localUtil.format(A9474PMFchCre, "99/99/99"));
         A9475PMUsuCre = GXutil.upper( httpContext.cgiGet( edtPMUsuCre_Internalname)) ;
         n9475PMUsuCre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9475PMUsuCre", A9475PMUsuCre);
         A9487PMDias = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9487PMDias = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9487PMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9487PMDias), 3, 0));
         A11454PMUso = localUtil.ctond( httpContext.cgiGet( edtPMUso_Internalname)) ;
         n11454PMUso = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11454PMUso", GXutil.ltrimstr( A11454PMUso, 8, 2));
         A13013PMUsoMts = localUtil.ctond( httpContext.cgiGet( edtPMUsoMts_Internalname)) ;
         n13013PMUsoMts = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13013PMUsoMts", GXutil.ltrimstr( A13013PMUsoMts, 10, 2));
         A11455PMTie = localUtil.ctond( httpContext.cgiGet( edtPMTie_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11455PMTie", GXutil.ltrimstr( A11455PMTie, 6, 2));
         A11456PMPla = httpContext.cgiGet( edtPMPla_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11456PMPla", A11456PMPla);
         A9484PMIni = localUtil.ctod( httpContext.cgiGet( edtPMIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n9484PMIni = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9484PMIni", localUtil.format(A9484PMIni, "99/99/99"));
         A9485PMFin = localUtil.ctod( httpContext.cgiGet( edtPMFin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n9485PMFin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9485PMFin", localUtil.format(A9485PMFin, "99/99/99"));
         A9486PMUlt = localUtil.ctod( httpContext.cgiGet( edtPMUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n9486PMUlt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9486PMUlt", localUtil.format(A9486PMUlt, "99/99/99"));
         A9488PMOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtPMOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9488PMOrd = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9488PMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9488PMOrd), 8, 0));
         A9483PMTxt = httpContext.cgiGet( edtPMTxt_Internalname) ;
         n9483PMTxt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9483PMTxt", A9483PMTxt);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A9477PMMaqDsc = httpContext.cgiGet( edtPMMaqDsc_Internalname) ;
         n9477PMMaqDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9477PMMaqDsc", A9477PMMaqDsc);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TMPreveGeneral");
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("mantenimientomaquina\\tmprevegeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e11RF2 ();
      if (returnInSub) return;
   }

   public void e11RF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmprevegeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmprevegeneral_impl.this.AV15Emprcod = GXv_char2[0] ;
      tmprevegeneral_impl.this.AV16Emprnom = GXv_char3[0] ;
      tmprevegeneral_impl.this.AV17Usurcod = GXv_char4[0] ;
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

   protected void e12RF2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtPMMaqDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPMMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqDsc_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoMaquina.TMPreve" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A9429PMCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
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
      paRF2( ) ;
      wsRF2( ) ;
      weRF2( ) ;
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
      sCtrlA9429PMCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paRF2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "mantenimientomaquina\\tmprevegeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paRF2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A9429PMCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A9429PMCod != wcpOA9429PMCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA9429PMCod = A9429PMCod ;
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
      sCtrlA9429PMCod = httpContext.cgiGet( sPrefix+"A9429PMCod_CTRL") ;
      if ( GXutil.len( sCtrlA9429PMCod) > 0 )
      {
         A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA9429PMCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      else
      {
         A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A9429PMCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paRF2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsRF2( ) ;
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
      wsRF2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9429PMCod_PARM", GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA9429PMCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A9429PMCod_CTRL", GXutil.rtrim( sCtrlA9429PMCod));
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
      weRF2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564889", true, true);
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
         httpContext.AddJavascriptSource("mantenimientomaquina/tmprevegeneral.js", "?202682115564890", false, true);
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
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtPMCod_Internalname = sPrefix+"PMCOD" ;
      edtPMDsc_Internalname = sPrefix+"PMDSC" ;
      edtPMMaqCod_Internalname = sPrefix+"PMMAQCOD" ;
      cmbPMEst.setInternalname( sPrefix+"PMEST" );
      edtPMFchCre_Internalname = sPrefix+"PMFCHCRE" ;
      edtPMUsuCre_Internalname = sPrefix+"PMUSUCRE" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      lblTextblockpmdias_Internalname = sPrefix+"TEXTBLOCKPMDIAS" ;
      edtPMDias_Internalname = sPrefix+"PMDIAS" ;
      divUnnamedtablepmdias_Internalname = sPrefix+"UNNAMEDTABLEPMDIAS" ;
      lblTextblockpmuso_Internalname = sPrefix+"TEXTBLOCKPMUSO" ;
      edtPMUso_Internalname = sPrefix+"PMUSO" ;
      divUnnamedtablepmuso_Internalname = sPrefix+"UNNAMEDTABLEPMUSO" ;
      lblTextblockpmusomts_Internalname = sPrefix+"TEXTBLOCKPMUSOMTS" ;
      edtPMUsoMts_Internalname = sPrefix+"PMUSOMTS" ;
      divUnnamedtablepmusomts_Internalname = sPrefix+"UNNAMEDTABLEPMUSOMTS" ;
      divTransactiondetail_frecuencia_Internalname = sPrefix+"TRANSACTIONDETAIL_FRECUENCIA" ;
      grpUnnamedgroup1_Internalname = sPrefix+"UNNAMEDGROUP1" ;
      lblTextblockpmtie_Internalname = sPrefix+"TEXTBLOCKPMTIE" ;
      edtPMTie_Internalname = sPrefix+"PMTIE" ;
      divUnnamedtablepmtie_Internalname = sPrefix+"UNNAMEDTABLEPMTIE" ;
      lblTextblockpmpla_Internalname = sPrefix+"TEXTBLOCKPMPLA" ;
      edtPMPla_Internalname = sPrefix+"PMPLA" ;
      divUnnamedtablepmpla_Internalname = sPrefix+"UNNAMEDTABLEPMPLA" ;
      divTransactiondetail_planificacion_Internalname = sPrefix+"TRANSACTIONDETAIL_PLANIFICACION" ;
      grpUnnamedgroup2_Internalname = sPrefix+"UNNAMEDGROUP2" ;
      lblTextblockpmini_Internalname = sPrefix+"TEXTBLOCKPMINI" ;
      edtPMIni_Internalname = sPrefix+"PMINI" ;
      divUnnamedtablepmini_Internalname = sPrefix+"UNNAMEDTABLEPMINI" ;
      lblTextblockpmfin_Internalname = sPrefix+"TEXTBLOCKPMFIN" ;
      edtPMFin_Internalname = sPrefix+"PMFIN" ;
      divUnnamedtablepmfin_Internalname = sPrefix+"UNNAMEDTABLEPMFIN" ;
      divTransactiondetail_validez_Internalname = sPrefix+"TRANSACTIONDETAIL_VALIDEZ" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      lblTextblockpmult_Internalname = sPrefix+"TEXTBLOCKPMULT" ;
      edtPMUlt_Internalname = sPrefix+"PMULT" ;
      divUnnamedtablepmult_Internalname = sPrefix+"UNNAMEDTABLEPMULT" ;
      lblTextblockpmord_Internalname = sPrefix+"TEXTBLOCKPMORD" ;
      edtPMOrd_Internalname = sPrefix+"PMORD" ;
      divUnnamedtablepmord_Internalname = sPrefix+"UNNAMEDTABLEPMORD" ;
      divTransactiondetail_ultimainstancia_Internalname = sPrefix+"TRANSACTIONDETAIL_ULTIMAINSTANCIA" ;
      grpUnnamedgroup4_Internalname = sPrefix+"UNNAMEDGROUP4" ;
      divTransactiondetail_tablefrecuencia_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEFRECUENCIA" ;
      Dvpanel_transactiondetail_tablefrecuencia_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEFRECUENCIA" ;
      edtPMTxt_Internalname = sPrefix+"PMTXT" ;
      divTransactiondetail_tabletexto_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLETEXTO" ;
      Dvpanel_transactiondetail_tabletexto_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLETEXTO" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtPMMaqDsc_Internalname = sPrefix+"PMMAQDSC" ;
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
      edtPMMaqDsc_Jsonclick = "" ;
      edtPMMaqDsc_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtPMTxt_Enabled = 0 ;
      edtPMOrd_Jsonclick = "" ;
      edtPMOrd_Enabled = 0 ;
      edtPMUlt_Jsonclick = "" ;
      edtPMUlt_Enabled = 0 ;
      edtPMFin_Jsonclick = "" ;
      edtPMFin_Enabled = 0 ;
      edtPMIni_Jsonclick = "" ;
      edtPMIni_Enabled = 0 ;
      edtPMPla_Jsonclick = "" ;
      edtPMPla_Enabled = 0 ;
      edtPMTie_Jsonclick = "" ;
      edtPMTie_Enabled = 0 ;
      edtPMUsoMts_Jsonclick = "" ;
      edtPMUsoMts_Enabled = 0 ;
      edtPMUso_Jsonclick = "" ;
      edtPMUso_Enabled = 0 ;
      edtPMDias_Jsonclick = "" ;
      edtPMDias_Enabled = 0 ;
      edtPMUsuCre_Jsonclick = "" ;
      edtPMUsuCre_Enabled = 0 ;
      edtPMFchCre_Jsonclick = "" ;
      edtPMFchCre_Enabled = 0 ;
      cmbPMEst.setJsonclick( "" );
      cmbPMEst.setEnabled( 0 );
      edtPMMaqCod_Jsonclick = "" ;
      edtPMMaqCod_Enabled = 0 ;
      edtPMDsc_Jsonclick = "" ;
      edtPMDsc_Enabled = 0 ;
      edtPMCod_Jsonclick = "" ;
      edtPMCod_Enabled = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Dvpanel_transactiondetail_tabletexto_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletexto_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tabletexto_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletexto_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletexto_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tabletexto_Title = httpContext.getMessage( "Texto", "") ;
      Dvpanel_transactiondetail_tabletexto_Cls = "CellMarginTop" ;
      Dvpanel_transactiondetail_tabletexto_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tabletexto_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tabletexto_Width = "100%" ;
      Dvpanel_transactiondetail_tablefrecuencia_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablefrecuencia_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tablefrecuencia_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablefrecuencia_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablefrecuencia_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablefrecuencia_Title = httpContext.getMessage( "Freccuencia", "") ;
      Dvpanel_transactiondetail_tablefrecuencia_Cls = "CellMarginTop" ;
      Dvpanel_transactiondetail_tablefrecuencia_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablefrecuencia_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablefrecuencia_Width = "100%" ;
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
      cmbPMEst.setName( "PMEST" );
      cmbPMEst.setWebtags( "" );
      cmbPMEst.addItem("A", httpContext.getMessage( "Activa", ""), (short)(0));
      cmbPMEst.addItem("I", httpContext.getMessage( "Inactiva", ""), (short)(0));
      if ( cmbPMEst.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV13Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[]");
      setEventMetadata("VALID_PMCOD",",oparms:[]}");
      setEventMetadata("VALID_PMMAQCOD","{handler:'valid_Pmmaqcod',iparms:[]");
      setEventMetadata("VALID_PMMAQCOD",",oparms:[]}");
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
      A13734MaqCDsc = "" ;
      h9476PMMaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13Pgmname = "" ;
      A9476PMMaqCod = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A9473PMDsc = "" ;
      A9478PMEst = "" ;
      A9474PMFchCre = GXutil.nullDate() ;
      A9475PMUsuCre = "" ;
      ucDvpanel_transactiondetail_tablefrecuencia = new com.genexus.webpanels.GXUserControl();
      lblTextblockpmdias_Jsonclick = "" ;
      lblTextblockpmuso_Jsonclick = "" ;
      A11454PMUso = DecimalUtil.ZERO ;
      lblTextblockpmusomts_Jsonclick = "" ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      lblTextblockpmtie_Jsonclick = "" ;
      A11455PMTie = DecimalUtil.ZERO ;
      lblTextblockpmpla_Jsonclick = "" ;
      A11456PMPla = "" ;
      lblTextblockpmini_Jsonclick = "" ;
      A9484PMIni = GXutil.nullDate() ;
      lblTextblockpmfin_Jsonclick = "" ;
      A9485PMFin = GXutil.nullDate() ;
      lblTextblockpmult_Jsonclick = "" ;
      A9486PMUlt = GXutil.nullDate() ;
      lblTextblockpmord_Jsonclick = "" ;
      ucDvpanel_transactiondetail_tabletexto = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      A9483PMTxt = "" ;
      A407EmprNom = "" ;
      A9477PMMaqDsc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H00RF2_A13734MaqCDsc = new String[] {""} ;
      H00RF3_A13734MaqCDsc = new String[] {""} ;
      H00RF3_A396EmprCod = new String[] {""} ;
      H00RF3_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      H00RF4_A396EmprCod = new String[] {""} ;
      H00RF4_A9429PMCod = new int[1] ;
      H00RF4_A9477PMMaqDsc = new String[] {""} ;
      H00RF4_n9477PMMaqDsc = new boolean[] {false} ;
      H00RF4_A407EmprNom = new String[] {""} ;
      H00RF4_n407EmprNom = new boolean[] {false} ;
      H00RF4_A9483PMTxt = new String[] {""} ;
      H00RF4_n9483PMTxt = new boolean[] {false} ;
      H00RF4_A9488PMOrd = new int[1] ;
      H00RF4_n9488PMOrd = new boolean[] {false} ;
      H00RF4_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H00RF4_n9486PMUlt = new boolean[] {false} ;
      H00RF4_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      H00RF4_n9485PMFin = new boolean[] {false} ;
      H00RF4_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      H00RF4_n9484PMIni = new boolean[] {false} ;
      H00RF4_A11456PMPla = new String[] {""} ;
      H00RF4_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RF4_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RF4_n13013PMUsoMts = new boolean[] {false} ;
      H00RF4_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RF4_n11454PMUso = new boolean[] {false} ;
      H00RF4_A9487PMDias = new short[1] ;
      H00RF4_n9487PMDias = new boolean[] {false} ;
      H00RF4_A9475PMUsuCre = new String[] {""} ;
      H00RF4_n9475PMUsuCre = new boolean[] {false} ;
      H00RF4_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00RF4_n9474PMFchCre = new boolean[] {false} ;
      H00RF4_A9478PMEst = new String[] {""} ;
      H00RF4_n9478PMEst = new boolean[] {false} ;
      H00RF4_A9476PMMaqCod = new String[] {""} ;
      H00RF4_n9476PMMaqCod = new boolean[] {false} ;
      H00RF4_A9473PMDsc = new String[] {""} ;
      H00RF4_n9473PMDsc = new boolean[] {false} ;
      H00RF5_A407EmprNom = new String[] {""} ;
      H00RF5_n407EmprNom = new boolean[] {false} ;
      H00RF6_A13734MaqCDsc = new String[] {""} ;
      H00RF6_A396EmprCod = new String[] {""} ;
      H00RF6_A602MaqCod = new String[] {""} ;
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
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA9429PMCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmprevegeneral__default(),
         new Object[] {
             new Object[] {
            H00RF2_A13734MaqCDsc
            }
            , new Object[] {
            H00RF3_A13734MaqCDsc, H00RF3_A396EmprCod, H00RF3_A602MaqCod
            }
            , new Object[] {
            H00RF4_A396EmprCod, H00RF4_A9429PMCod, H00RF4_A9477PMMaqDsc, H00RF4_n9477PMMaqDsc, H00RF4_A407EmprNom, H00RF4_n407EmprNom, H00RF4_A9483PMTxt, H00RF4_n9483PMTxt, H00RF4_A9488PMOrd, H00RF4_n9488PMOrd,
            H00RF4_A9486PMUlt, H00RF4_n9486PMUlt, H00RF4_A9485PMFin, H00RF4_n9485PMFin, H00RF4_A9484PMIni, H00RF4_n9484PMIni, H00RF4_A11456PMPla, H00RF4_A11455PMTie, H00RF4_A13013PMUsoMts, H00RF4_n13013PMUsoMts,
            H00RF4_A11454PMUso, H00RF4_n11454PMUso, H00RF4_A9487PMDias, H00RF4_n9487PMDias, H00RF4_A9475PMUsuCre, H00RF4_n9475PMUsuCre, H00RF4_A9474PMFchCre, H00RF4_n9474PMFchCre, H00RF4_A9478PMEst, H00RF4_n9478PMEst,
            H00RF4_A9476PMMaqCod, H00RF4_n9476PMMaqCod, H00RF4_A9473PMDsc, H00RF4_n9473PMDsc
            }
            , new Object[] {
            H00RF5_A407EmprNom, H00RF5_n407EmprNom
            }
            , new Object[] {
            H00RF6_A13734MaqCDsc, H00RF6_A396EmprCod, H00RF6_A602MaqCod
            }
         }
      );
      AV13Pgmname = "MantenimientoMaquina.TMPreveGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "MantenimientoMaquina.TMPreveGeneral" ;
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
   private short A9487PMDias ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA9429PMCod ;
   private int A9429PMCod ;
   private int edtavPgmname_Enabled ;
   private int edtPMCod_Enabled ;
   private int edtPMDsc_Enabled ;
   private int edtPMMaqCod_Enabled ;
   private int edtPMFchCre_Enabled ;
   private int edtPMUsuCre_Enabled ;
   private int edtPMDias_Enabled ;
   private int edtPMUso_Enabled ;
   private int edtPMUsoMts_Enabled ;
   private int edtPMTie_Enabled ;
   private int edtPMPla_Enabled ;
   private int edtPMIni_Enabled ;
   private int edtPMFin_Enabled ;
   private int edtPMUlt_Enabled ;
   private int A9488PMOrd ;
   private int edtPMOrd_Enabled ;
   private int edtPMTxt_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int edtPMMaqDsc_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal A11455PMTie ;
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
   private String A9476PMMaqCod ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String Dvpanel_transactiondetail_tablefrecuencia_Width ;
   private String Dvpanel_transactiondetail_tablefrecuencia_Cls ;
   private String Dvpanel_transactiondetail_tablefrecuencia_Title ;
   private String Dvpanel_transactiondetail_tablefrecuencia_Iconposition ;
   private String Dvpanel_transactiondetail_tabletexto_Width ;
   private String Dvpanel_transactiondetail_tabletexto_Cls ;
   private String Dvpanel_transactiondetail_tabletexto_Title ;
   private String Dvpanel_transactiondetail_tabletexto_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String edtPMCod_Internalname ;
   private String edtPMCod_Jsonclick ;
   private String edtPMDsc_Internalname ;
   private String A9473PMDsc ;
   private String edtPMDsc_Jsonclick ;
   private String edtPMMaqCod_Internalname ;
   private String edtPMMaqCod_Jsonclick ;
   private String A9478PMEst ;
   private String edtPMFchCre_Internalname ;
   private String edtPMFchCre_Jsonclick ;
   private String edtPMUsuCre_Internalname ;
   private String A9475PMUsuCre ;
   private String edtPMUsuCre_Jsonclick ;
   private String Dvpanel_transactiondetail_tablefrecuencia_Internalname ;
   private String divTransactiondetail_tablefrecuencia_Internalname ;
   private String grpUnnamedgroup1_Internalname ;
   private String divTransactiondetail_frecuencia_Internalname ;
   private String divUnnamedtablepmdias_Internalname ;
   private String lblTextblockpmdias_Internalname ;
   private String lblTextblockpmdias_Jsonclick ;
   private String edtPMDias_Internalname ;
   private String edtPMDias_Jsonclick ;
   private String divUnnamedtablepmuso_Internalname ;
   private String lblTextblockpmuso_Internalname ;
   private String lblTextblockpmuso_Jsonclick ;
   private String edtPMUso_Internalname ;
   private String edtPMUso_Jsonclick ;
   private String divUnnamedtablepmusomts_Internalname ;
   private String lblTextblockpmusomts_Internalname ;
   private String lblTextblockpmusomts_Jsonclick ;
   private String edtPMUsoMts_Internalname ;
   private String edtPMUsoMts_Jsonclick ;
   private String grpUnnamedgroup2_Internalname ;
   private String divTransactiondetail_planificacion_Internalname ;
   private String divUnnamedtablepmtie_Internalname ;
   private String lblTextblockpmtie_Internalname ;
   private String lblTextblockpmtie_Jsonclick ;
   private String edtPMTie_Internalname ;
   private String edtPMTie_Jsonclick ;
   private String divUnnamedtablepmpla_Internalname ;
   private String lblTextblockpmpla_Internalname ;
   private String lblTextblockpmpla_Jsonclick ;
   private String edtPMPla_Internalname ;
   private String A11456PMPla ;
   private String edtPMPla_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String divTransactiondetail_validez_Internalname ;
   private String divUnnamedtablepmini_Internalname ;
   private String lblTextblockpmini_Internalname ;
   private String lblTextblockpmini_Jsonclick ;
   private String edtPMIni_Internalname ;
   private String edtPMIni_Jsonclick ;
   private String divUnnamedtablepmfin_Internalname ;
   private String lblTextblockpmfin_Internalname ;
   private String lblTextblockpmfin_Jsonclick ;
   private String edtPMFin_Internalname ;
   private String edtPMFin_Jsonclick ;
   private String grpUnnamedgroup4_Internalname ;
   private String divTransactiondetail_ultimainstancia_Internalname ;
   private String divUnnamedtablepmult_Internalname ;
   private String lblTextblockpmult_Internalname ;
   private String lblTextblockpmult_Jsonclick ;
   private String edtPMUlt_Internalname ;
   private String edtPMUlt_Jsonclick ;
   private String divUnnamedtablepmord_Internalname ;
   private String lblTextblockpmord_Internalname ;
   private String lblTextblockpmord_Jsonclick ;
   private String edtPMOrd_Internalname ;
   private String edtPMOrd_Jsonclick ;
   private String Dvpanel_transactiondetail_tabletexto_Internalname ;
   private String divTransactiondetail_tabletexto_Internalname ;
   private String edtPMTxt_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPMMaqDsc_Internalname ;
   private String A9477PMMaqDsc ;
   private String edtPMMaqDsc_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String hsh ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15Emprcod ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA9429PMCod ;
   private java.util.Date A9474PMFchCre ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9485PMFin ;
   private java.util.Date A9486PMUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tablefrecuencia_Autowidth ;
   private boolean Dvpanel_transactiondetail_tablefrecuencia_Autoheight ;
   private boolean Dvpanel_transactiondetail_tablefrecuencia_Collapsible ;
   private boolean Dvpanel_transactiondetail_tablefrecuencia_Collapsed ;
   private boolean Dvpanel_transactiondetail_tablefrecuencia_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tablefrecuencia_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tabletexto_Autowidth ;
   private boolean Dvpanel_transactiondetail_tabletexto_Autoheight ;
   private boolean Dvpanel_transactiondetail_tabletexto_Collapsible ;
   private boolean Dvpanel_transactiondetail_tabletexto_Collapsed ;
   private boolean Dvpanel_transactiondetail_tabletexto_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tabletexto_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n9478PMEst ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n9477PMMaqDsc ;
   private boolean n9483PMTxt ;
   private boolean n9488PMOrd ;
   private boolean n9486PMUlt ;
   private boolean n9485PMFin ;
   private boolean n9484PMIni ;
   private boolean n13013PMUsoMts ;
   private boolean n11454PMUso ;
   private boolean n9487PMDias ;
   private boolean n9475PMUsuCre ;
   private boolean n9474PMFchCre ;
   private boolean n9476PMMaqCod ;
   private boolean n9473PMDsc ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String A13734MaqCDsc ;
   private String h9476PMMaqCod ;
   private String A9483PMTxt ;
   private String l13734MaqCDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tablefrecuencia ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tabletexto ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPMEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00RF2_A13734MaqCDsc ;
   private String[] H00RF3_A13734MaqCDsc ;
   private String[] H00RF3_A396EmprCod ;
   private String[] H00RF3_A602MaqCod ;
   private String[] H00RF4_A396EmprCod ;
   private int[] H00RF4_A9429PMCod ;
   private String[] H00RF4_A9477PMMaqDsc ;
   private boolean[] H00RF4_n9477PMMaqDsc ;
   private String[] H00RF4_A407EmprNom ;
   private boolean[] H00RF4_n407EmprNom ;
   private String[] H00RF4_A9483PMTxt ;
   private boolean[] H00RF4_n9483PMTxt ;
   private int[] H00RF4_A9488PMOrd ;
   private boolean[] H00RF4_n9488PMOrd ;
   private java.util.Date[] H00RF4_A9486PMUlt ;
   private boolean[] H00RF4_n9486PMUlt ;
   private java.util.Date[] H00RF4_A9485PMFin ;
   private boolean[] H00RF4_n9485PMFin ;
   private java.util.Date[] H00RF4_A9484PMIni ;
   private boolean[] H00RF4_n9484PMIni ;
   private String[] H00RF4_A11456PMPla ;
   private java.math.BigDecimal[] H00RF4_A11455PMTie ;
   private java.math.BigDecimal[] H00RF4_A13013PMUsoMts ;
   private boolean[] H00RF4_n13013PMUsoMts ;
   private java.math.BigDecimal[] H00RF4_A11454PMUso ;
   private boolean[] H00RF4_n11454PMUso ;
   private short[] H00RF4_A9487PMDias ;
   private boolean[] H00RF4_n9487PMDias ;
   private String[] H00RF4_A9475PMUsuCre ;
   private boolean[] H00RF4_n9475PMUsuCre ;
   private java.util.Date[] H00RF4_A9474PMFchCre ;
   private boolean[] H00RF4_n9474PMFchCre ;
   private String[] H00RF4_A9478PMEst ;
   private boolean[] H00RF4_n9478PMEst ;
   private String[] H00RF4_A9476PMMaqCod ;
   private boolean[] H00RF4_n9476PMMaqCod ;
   private String[] H00RF4_A9473PMDsc ;
   private boolean[] H00RF4_n9473PMDsc ;
   private String[] H00RF5_A407EmprNom ;
   private boolean[] H00RF5_n407EmprNom ;
   private String[] H00RF6_A13734MaqCDsc ;
   private String[] H00RF6_A396EmprCod ;
   private String[] H00RF6_A602MaqCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tmprevegeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00RF2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) ORDER BY MaqCDsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00RF3", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00RF4", "SELECT T1.EmprCod, T1.PMCod, T3.MaqDsc AS PMMaqDsc, T2.EmprNom, T1.PMTxt, T1.PMOrd, T1.PMUlt, T1.PMFin, T1.PMIni, T1.PMPla, T1.PMTie, T1.PMUsoMts, T1.PMUso, T1.PMDias, T1.PMUsuCre, T1.PMFchCre, T1.PMEst, T1.PMMaqCod AS PMMaqCod, T1.PMDsc FROM ((TXPMPREVE T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.PMMaqCod) WHERE T1.EmprCod = ? and T1.PMCod = ? ORDER BY T1.EmprCod, T1.PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00RF5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00RF6", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

