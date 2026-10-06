package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidogeneral_impl extends GXWebComponent
{
   public almacentejidogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidogeneral_impl.class ));
   }

   public almacentejidogeneral_impl( int remoteHandle ,
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
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A44AlbRecCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBREF") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaalbref1PJ0( A396EmprCod, A13751ArtCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPENTCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13821TipEntNomI = httpContext.GetPar( "TipEntNomI") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipentcod1PJ0( A396EmprCod, A13821TipEntNomI) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBREF") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaalbref1PJ0( A396EmprCod, A13751ArtCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"ALBREF") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h45AlbRef = httpContext.GetPar( "h45AlbRef") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaalbref1PJ2( A396EmprCod, h45AlbRef) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPENTCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13821TipEntNomI = httpContext.GetPar( "TipEntNomI") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatipentcod1PJ0( A396EmprCod, A13821TipEntNomI) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPENTCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h1211TipEntCod = httpContext.GetPar( "h1211TipEntCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcatipentcod1PJ2( A396EmprCod, h1211TipEntCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"ALMCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h4792AlmCod = httpContext.GetPar( "h4792AlmCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaalmcod1PJ2( A396EmprCod, h4792AlmCod) ;
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
         pa1PJ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Almacen Tejido General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.almacentejidogeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","AlbRecCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoGeneral");
      forbiddenHiddens.add("AlbRTartC", localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\almacentejidogeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA44AlbRecCod", GXutil.ltrim( localUtil.ntoc( wcpOA44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCALBREF", GXutil.rtrim( A45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTIPENTCOD", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCALMCOD", GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Width", GXutil.rtrim( Dvpanel_unnamedtable12_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable12_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable12_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Cls", GXutil.rtrim( Dvpanel_unnamedtable12_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Title", GXutil.rtrim( Dvpanel_unnamedtable12_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable12_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable12_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable12_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable12_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE12_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable12_Autoscroll));
   }

   public void renderHtmlCloseForm1PJ2( )
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
      return "AlmacenSinDetalle.AlmacenTejidoGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido General", "") ;
   }

   public void wb1PJ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.almacensindetalle.almacentejidogeneral");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRFen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbrHor_Internalname, httpContext.getMessage( "Hora entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbrHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrHor_Internalname, localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6179AlbrHor, "99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbrHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbrHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUsu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbrUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUsu_Internalname, GXutil.rtrim( A6178AlbrUsu), GXutil.rtrim( localUtil.format( A6178AlbrUsu, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUsu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRef_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, h45AlbRef, GXutil.rtrim( localUtil.format( h45AlbRef, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRefDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRefDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTartC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRTartC_Internalname, httpContext.getMessage( "Tipo Articulo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartC_Internalname, GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRTartC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTartC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTartC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTartD_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRTartD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartD_Internalname, GXutil.rtrim( A6264AlbRTartD), GXutil.rtrim( localUtil.format( A6264AlbRTartD, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtAlbRTartD_Link, "", "", "", edtAlbRTartD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTartD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtComposicio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtComposicio_Internalname, httpContext.getMessage( "Composicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtComposicio_Internalname, GXutil.rtrim( A13981Composicio), GXutil.rtrim( localUtil.format( A13981Composicio, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtComposicio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtComposicio_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbrent_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbREnt_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtAlbREnt_Link, "", "", "", edtAlbREnt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt_Visible, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbrent2_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbREnt2_Internalname, httpContext.getMessage( "Nº Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt2_Visible, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDisCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRDisCli_Internalname, httpContext.getMessage( "Disp. Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDisCli_Internalname, GXutil.rtrim( A3359AlbRDisCli), GXutil.rtrim( localUtil.format( A3359AlbRDisCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDisCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDisCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNumB_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbNumB_Internalname, httpContext.getMessage( "Analisis Composicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumB_Internalname, GXutil.rtrim( A8028AlbNumB), GXutil.rtrim( localUtil.format( A8028AlbNumB, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumB_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNumB_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Transportista", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProceCod_Internalname, httpContext.getMessage( "Tejedor_Hilador", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable23_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRMdlCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRMdlCod_Internalname, httpContext.getMessage( "Juego", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRMdlCod_Internalname, GXutil.rtrim( A4602AlbRMdlCod), GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRMdlCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRLu_Internalname, httpContext.getMessage( "Pulgadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLu_Internalname, GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRLu_Enabled!=0) ? localUtil.format( A6465AlbRLu, "ZZ9.99") : localUtil.format( A6465AlbRLu, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLu_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTelar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRTelar_Internalname, httpContext.getMessage( "Hilo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTelar_Internalname, GXutil.rtrim( A6464AlbRTelar), GXutil.rtrim( localUtil.format( A6464AlbRTelar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTelar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTelar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMaqTej_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbMaqTej_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMaqTej_Internalname, GXutil.rtrim( A8035AlbMaqTej), GXutil.rtrim( localUtil.format( A8035AlbMaqTej, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMaqTej_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMaqTej_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTara_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRTara_Internalname, httpContext.getMessage( "LFA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTara_Internalname, GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRTara_Enabled!=0) ? localUtil.format( A6470AlbRTara, "ZZ9.99") : localUtil.format( A6470AlbRTara, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTara_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRTara_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipEntCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipEntCod_Internalname, httpContext.getMessage( "Tipo Entrada", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, h1211TipEntCod, GXutil.rtrim( localUtil.format( h1211TipEntCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipEntCod_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRDes_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup15_Internalname, httpContext.getMessage( "Entradas", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable21_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrPieC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbrPieC_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable22_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUniC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbrUniC_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup17_Internalname, httpContext.getMessage( "Stock", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable18_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieUti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable19_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniUti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable20_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFecUlt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRFecUlt_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbREst.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlmCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlmCod_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlmCod_Internalname, h4792AlmCod, GXutil.rtrim( localUtil.format( h4792AlmCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlmCod_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLoc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRReo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "Reclamacion?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable12_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable12_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable12.setProperty("Width", Dvpanel_unnamedtable12_Width);
         ucDvpanel_unnamedtable12.setProperty("AutoWidth", Dvpanel_unnamedtable12_Autowidth);
         ucDvpanel_unnamedtable12.setProperty("AutoHeight", Dvpanel_unnamedtable12_Autoheight);
         ucDvpanel_unnamedtable12.setProperty("Cls", Dvpanel_unnamedtable12_Cls);
         ucDvpanel_unnamedtable12.setProperty("Title", Dvpanel_unnamedtable12_Title);
         ucDvpanel_unnamedtable12.setProperty("Collapsible", Dvpanel_unnamedtable12_Collapsible);
         ucDvpanel_unnamedtable12.setProperty("Collapsed", Dvpanel_unnamedtable12_Collapsed);
         ucDvpanel_unnamedtable12.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable12_Showcollapseicon);
         ucDvpanel_unnamedtable12.setProperty("IconPosition", Dvpanel_unnamedtable12_Iconposition);
         ucDvpanel_unnamedtable12.setProperty("AutoScroll", Dvpanel_unnamedtable12_Autoscroll);
         ucDvpanel_unnamedtable12.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable12_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE12Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE12Container"+"UnnamedTable12"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRGrm2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRAnc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPml_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111pj1_client"+"'", TempTags, "", 2, "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121pj1_client"+"'", TempTags, "", 2, "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1PJ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido General", ""), (short)(0)) ;
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
            strup1PJ0( ) ;
         }
      }
   }

   public void ws1PJ2( )
   {
      start1PJ2( ) ;
      evt1PJ2( ) ;
   }

   public void evt1PJ2( )
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
                              strup1PJ0( ) ;
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
                              strup1PJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131PJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141PJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PJ0( ) ;
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
                              strup1PJ0( ) ;
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

   public void we1PJ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1PJ2( ) ;
         }
      }
   }

   public void pa1PJ2( )
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

   public void gxsgaalbref1PJ0( String A396EmprCod ,
                                String A13751ArtCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaalbref_data1PJ0( A396EmprCod, A13751ArtCDsc) ;
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

   protected void gxsgaalbref_data1PJ0( String A396EmprCod ,
                                        String A13751ArtCDsc )
   {
      l13751ArtCDsc = GXutil.concat( GXutil.rtrim( A13751ArtCDsc), "%", "") ;
      /* Using cursor H01PJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13751ArtCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01PJ2_A13751ArtCDsc[0]);
         gxdynajaxctrldescr.add(H01PJ2_A13751ArtCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgatipentcod1PJ0( String A396EmprCod ,
                                   String A13821TipEntNomI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipentcod_data1PJ0( A396EmprCod, A13821TipEntNomI) ;
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

   protected void gxsgatipentcod_data1PJ0( String A396EmprCod ,
                                           String A13821TipEntNomI )
   {
      l13821TipEntNomI = GXutil.concat( GXutil.rtrim( A13821TipEntNomI), "%", "") ;
      /* Using cursor H01PJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13821TipEntNomI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H01PJ3_A13821TipEntNomI[0]);
         gxdynajaxctrldescr.add(H01PJ3_A13821TipEntNomI[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcaalbref1PJ2( String A396EmprCod ,
                                String A13751ArtCDsc )
   {
      /* Using cursor H01PJ4 */
      pr_default.execute(2, new Object[] {A13751ArtCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13751ArtCDsc = H01PJ4_A13751ArtCDsc[0] ;
         A396EmprCod = H01PJ4_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A252CliCod = H01PJ4_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = H01PJ4_A65ArtCod[0] ;
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\"") ;
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
      pr_default.close(2);
   }

   public void gxhcatipentcod1PJ2( String A396EmprCod ,
                                   String A13821TipEntNomI )
   {
      /* Using cursor H01PJ5 */
      pr_default.execute(3, new Object[] {A13821TipEntNomI, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13821TipEntNomI = H01PJ5_A13821TipEntNomI[0] ;
         A396EmprCod = H01PJ5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = H01PJ5_A1211TipEntCod[0] ;
         n1211TipEntCod = H01PJ5_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(3);
   }

   public void gxhcaalmcod1PJ2( String A396EmprCod ,
                                String A13822AlmNomID )
   {
      /* Using cursor H01PJ6 */
      pr_default.execute(4, new Object[] {A13822AlmNomID, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13822AlmNomID = H01PJ6_A13822AlmNomID[0] ;
         A396EmprCod = H01PJ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A4792AlmCod = H01PJ6_A4792AlmCod[0] ;
         n4792AlmCod = H01PJ6_n4792AlmCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         pr_default.readNext(4);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(4);
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1PJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "AlmacenSinDetalle.AlmacenTejidoGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf1PJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01PJ7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A4922AlbPml = H01PJ7_A4922AlbPml[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            A4921AlbRAnc = H01PJ7_A4921AlbRAnc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            A4920AlbRGrm2 = H01PJ7_A4920AlbRGrm2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            A55AlbRReo = H01PJ7_A55AlbRReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55AlbRReo", A55AlbRReo);
            A50AlbRLoc = H01PJ7_A50AlbRLoc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A50AlbRLoc", A50AlbRLoc);
            A4792AlmCod = H01PJ7_A4792AlmCod[0] ;
            n4792AlmCod = H01PJ7_n4792AlmCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            A47AlbREst = H01PJ7_A47AlbREst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            A48AlbRFecUlt = H01PJ7_A48AlbRFecUlt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            A6180AlbrUniC = H01PJ7_A6180AlbrUniC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            A56AlbRUni = H01PJ7_A56AlbRUni[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56AlbRUni", A56AlbRUni);
            A6181AlbrPieC = H01PJ7_A6181AlbrPieC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            A1291AlbRDes = H01PJ7_A1291AlbRDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1291AlbRDes", A1291AlbRDes);
            A1211TipEntCod = H01PJ7_A1211TipEntCod[0] ;
            n1211TipEntCod = H01PJ7_n1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A6470AlbRTara = H01PJ7_A6470AlbRTara[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
            A8035AlbMaqTej = H01PJ7_A8035AlbMaqTej[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8035AlbMaqTej", A8035AlbMaqTej);
            A6464AlbRTelar = H01PJ7_A6464AlbRTelar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6464AlbRTelar", A6464AlbRTelar);
            A6465AlbRLu = H01PJ7_A6465AlbRLu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
            A4602AlbRMdlCod = H01PJ7_A4602AlbRMdlCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
            A6463AlbRLote = H01PJ7_A6463AlbRLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6463AlbRLote", A6463AlbRLote);
            A970ProceCod = H01PJ7_A970ProceCod[0] ;
            n970ProceCod = H01PJ7_n970ProceCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            A840TrnCod = H01PJ7_A840TrnCod[0] ;
            n840TrnCod = H01PJ7_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A8028AlbNumB = H01PJ7_A8028AlbNumB[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8028AlbNumB", A8028AlbNumB);
            A3359AlbRDisCli = H01PJ7_A3359AlbRDisCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3359AlbRDisCli", A3359AlbRDisCli);
            A5806AlbREnt2 = H01PJ7_A5806AlbREnt2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5806AlbREnt2", A5806AlbREnt2);
            A46AlbREnt = H01PJ7_A46AlbREnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46AlbREnt", A46AlbREnt);
            A6264AlbRTartD = H01PJ7_A6264AlbRTartD[0] ;
            n6264AlbRTartD = H01PJ7_n6264AlbRTartD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6264AlbRTartD", A6264AlbRTartD);
            A6263AlbRTartC = H01PJ7_A6263AlbRTartC[0] ;
            n6263AlbRTartC = H01PJ7_n6263AlbRTartC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
            A3613AlbRefDsc = H01PJ7_A3613AlbRefDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3613AlbRefDsc", A3613AlbRefDsc);
            A6178AlbrUsu = H01PJ7_A6178AlbrUsu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6178AlbrUsu", A6178AlbrUsu);
            A6179AlbrHor = H01PJ7_A6179AlbrHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A49AlbRFen = H01PJ7_A49AlbRFen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            A45AlbRef = H01PJ7_A45AlbRef[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", A45AlbRef);
            A252CliCod = H01PJ7_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A54AlbRPieUti = H01PJ7_A54AlbRPieUti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            A52AlbRPieEnt = H01PJ7_A52AlbRPieEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            A60AlbRUniUti = H01PJ7_A60AlbRUniUti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            A58AlbRUniEnt = H01PJ7_A58AlbRUniEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            A6264AlbRTartD = H01PJ7_A6264AlbRTartD[0] ;
            n6264AlbRTartD = H01PJ7_n6264AlbRTartD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6264AlbRTartD", A6264AlbRTartD);
            if ( (GXutil.strcmp("", h1211TipEntCod)==0) )
            {
               A1211TipEntCod = (short)(0) ;
               n1211TipEntCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            }
            else
            {
               A13821TipEntNomI = h1211TipEntCod ;
               /* Using cursor H01PJ8 */
               pr_default.execute(6, new Object[] {A13821TipEntNomI, A396EmprCod});
               A1211TipEntCod = H01PJ8_A1211TipEntCod[0] ;
               n1211TipEntCod = H01PJ8_n1211TipEntCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
               A1211TipEntCod = H01PJ8_A1211TipEntCod[0] ;
               n1211TipEntCod = H01PJ8_n1211TipEntCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
               if ( ! ( (pr_default.getStatus(6) == 101) ) )
               {
                  pr_default.readNext(6);
                  if ( ! ( (pr_default.getStatus(6) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPENTCOD");
                  }
               }
               else
               {
               }
               pr_default.close(6);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h1211TipEntCod", h1211TipEntCod);
            if ( (GXutil.strcmp("", h4792AlmCod)==0) )
            {
               A4792AlmCod = (byte)(0) ;
               n4792AlmCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            }
            else
            {
               A13822AlmNomID = h4792AlmCod ;
               /* Using cursor H01PJ9 */
               pr_default.execute(7, new Object[] {A13822AlmNomID, A396EmprCod});
               A4792AlmCod = H01PJ9_A4792AlmCod[0] ;
               n4792AlmCod = H01PJ9_n4792AlmCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
               A4792AlmCod = H01PJ9_A4792AlmCod[0] ;
               n4792AlmCod = H01PJ9_n4792AlmCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
               if ( ! ( (pr_default.getStatus(7) == 101) ) )
               {
                  pr_default.readNext(7);
                  if ( ! ( (pr_default.getStatus(7) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion (Codigo)", "")}), 1, "ALMCOD");
                  }
               }
               else
               {
               }
               pr_default.close(7);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h4792AlmCod", h4792AlmCod);
            GXt_char1 = A13981Composicio ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_char4[0] = A45AlbRef ;
            GXv_char5[0] = GXt_char1 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5) ;
            almacentejidogeneral_impl.this.A396EmprCod = GXv_char2[0] ;
            almacentejidogeneral_impl.this.A252CliCod = GXv_int3[0] ;
            almacentejidogeneral_impl.this.A45AlbRef = GXv_char4[0] ;
            almacentejidogeneral_impl.this.GXt_char1 = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", A45AlbRef);
            A13981Composicio = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13981Composicio", A13981Composicio);
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
               }
            }
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            /* Execute user event: Load */
            e141PJ2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         wb1PJ0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1PJ2( )
   {
   }

   public void before_start_formulas( )
   {
      AV15Pgmname = "AlmacenSinDetalle.AlmacenTejidoGeneral" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1PJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131PJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable12_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Width") ;
         Dvpanel_unnamedtable12_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Autowidth")) ;
         Dvpanel_unnamedtable12_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Autoheight")) ;
         Dvpanel_unnamedtable12_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Cls") ;
         Dvpanel_unnamedtable12_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Title") ;
         Dvpanel_unnamedtable12_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Collapsible")) ;
         Dvpanel_unnamedtable12_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Collapsed")) ;
         Dvpanel_unnamedtable12_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Showcollapseicon")) ;
         Dvpanel_unnamedtable12_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Iconposition") ;
         Dvpanel_unnamedtable12_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE12_Autoscroll")) ;
         /* Read variables values. */
         A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtAlbrHor_Internalname))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6178AlbrUsu = httpContext.cgiGet( edtAlbrUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6178AlbrUsu", A6178AlbrUsu);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         h45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         if ( (GXutil.strcmp("", h45AlbRef)==0) )
         {
            A45AlbRef = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", A45AlbRef);
         }
         else
         {
            A13751ArtCDsc = h45AlbRef ;
            /* Using cursor H01PJ10 */
            pr_default.execute(8, new Object[] {A13751ArtCDsc, A396EmprCod});
            A45AlbRef = H01PJ10_A65ArtCod[0] ;
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "ALBREF");
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h45AlbRef", h45AlbRef);
         A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A6264AlbRTartD = httpContext.cgiGet( edtAlbRTartD_Internalname) ;
         n6264AlbRTartD = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6264AlbRTartD", A6264AlbRTartD);
         A13981Composicio = httpContext.cgiGet( edtComposicio_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13981Composicio", A13981Composicio);
         A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5806AlbREnt2", A5806AlbREnt2);
         A3359AlbRDisCli = httpContext.cgiGet( edtAlbRDisCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3359AlbRDisCli", A3359AlbRDisCli);
         A8028AlbNumB = httpContext.cgiGet( edtAlbNumB_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8028AlbNumB", A8028AlbNumB);
         A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6463AlbRLote", A6463AlbRLote);
         A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6464AlbRTelar", A6464AlbRTelar);
         A8035AlbMaqTej = httpContext.cgiGet( edtAlbMaqTej_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8035AlbMaqTej", A8035AlbMaqTej);
         A6470AlbRTara = localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         h1211TipEntCod = httpContext.cgiGet( edtTipEntCod_Internalname) ;
         if ( (GXutil.strcmp("", h1211TipEntCod)==0) )
         {
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         else
         {
            A13821TipEntNomI = h1211TipEntCod ;
            /* Using cursor H01PJ11 */
            pr_default.execute(9, new Object[] {A13821TipEntNomI, A396EmprCod});
            A1211TipEntCod = H01PJ11_A1211TipEntCod[0] ;
            n1211TipEntCod = H01PJ11_n1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A1211TipEntCod = H01PJ11_A1211TipEntCod[0] ;
            n1211TipEntCod = H01PJ11_n1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPENTCOD");
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h1211TipEntCod", h1211TipEntCod);
         A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1291AlbRDes", A1291AlbRDes);
         A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56AlbRUni", A56AlbRUni);
         A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
         A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         h4792AlmCod = httpContext.cgiGet( edtAlmCod_Internalname) ;
         if ( (GXutil.strcmp("", h4792AlmCod)==0) )
         {
            A4792AlmCod = (byte)(0) ;
            n4792AlmCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         }
         else
         {
            A13822AlmNomID = h4792AlmCod ;
            /* Using cursor H01PJ12 */
            pr_default.execute(10, new Object[] {A13822AlmNomID, A396EmprCod});
            A4792AlmCod = H01PJ12_A4792AlmCod[0] ;
            n4792AlmCod = H01PJ12_n4792AlmCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            A4792AlmCod = H01PJ12_A4792AlmCod[0] ;
            n4792AlmCod = H01PJ12_n4792AlmCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               pr_default.readNext(10);
               if ( ! ( (pr_default.getStatus(10) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion (Codigo)", "")}), 1, "ALMCOD");
               }
            }
            else
            {
            }
            pr_default.close(10);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h4792AlmCod", h4792AlmCod);
         A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A50AlbRLoc", A50AlbRLoc);
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55AlbRReo", A55AlbRReo);
         A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoGeneral");
         A6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         forbiddenHiddens.add("AlbRTartC", localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9"));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacensindetalle\\almacentejidogeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131PJ2 ();
      if (returnInSub) return;
   }

   public void e131PJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_SdtWWPContext6[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext6) ;
      AV6WWPContext = GXv_SdtWWPContext6[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e141PJ2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtAlbREnt_Link = formatLink("app.talbdetview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","AlbRecCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt_Internalname, "Link", edtAlbREnt_Link, true);
      edtAlbRTartD_Link = formatLink("app.ttipartview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6263AlbRTartC,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TipArtCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRTartD_Internalname, "Link", edtAlbRTartD_Link, true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      if ( ! ( ( AV13Enccli_20.doubleValue() == 0 ) ) )
      {
         edtAlbREnt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
         divAlbrent_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      else
      {
         edtAlbREnt_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
         divAlbrent_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      if ( ! ( ( AV13Enccli_20.doubleValue() == 1 ) ) )
      {
         edtAlbREnt2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
         divAlbrent2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
      else
      {
         edtAlbREnt2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
         divAlbrent2_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV14Emprcod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
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
         divDvpanel_unnamedtable8_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable8_cell_Internalname, "Class", divDvpanel_unnamedtable8_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV14Emprcod, httpContext.getMessage( "SICRU0", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable12_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable12_cell_Internalname, "Class", divDvpanel_unnamedtable12_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable12_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable12_cell_Internalname, "Class", divDvpanel_unnamedtable12_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV15Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AlmacenSinDetalle.AlmacenTejido" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A44AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
      pa1PJ2( ) ;
      ws1PJ2( ) ;
      we1PJ2( ) ;
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
      sCtrlA44AlbRecCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1PJ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "almacensindetalle\\almacentejidogeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1PJ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A44AlbRecCod != wcpOA44AlbRecCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA44AlbRecCod = A44AlbRecCod ;
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
      sCtrlA44AlbRecCod = httpContext.cgiGet( sPrefix+"A44AlbRecCod_CTRL") ;
      if ( GXutil.len( sCtrlA44AlbRecCod) > 0 )
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA44AlbRecCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      else
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A44AlbRecCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1PJ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1PJ2( ) ;
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
      ws1PJ2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A44AlbRecCod_PARM", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA44AlbRecCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A44AlbRecCod_CTRL", GXutil.rtrim( sCtrlA44AlbRecCod));
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
      we1PJ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211692774", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/almacentejidogeneral.js", "?20268211692774", false, true);
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
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtAlbRFen_Internalname = sPrefix+"ALBRFEN" ;
      edtAlbrHor_Internalname = sPrefix+"ALBRHOR" ;
      edtAlbrUsu_Internalname = sPrefix+"ALBRUSU" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtAlbRef_Internalname = sPrefix+"ALBREF" ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtAlbRTartC_Internalname = sPrefix+"ALBRTARTC" ;
      edtAlbRTartD_Internalname = sPrefix+"ALBRTARTD" ;
      edtComposicio_Internalname = sPrefix+"COMPOSICIO" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT" ;
      divAlbrent_cell_Internalname = sPrefix+"ALBRENT_CELL" ;
      edtAlbREnt2_Internalname = sPrefix+"ALBRENT2" ;
      divAlbrent2_cell_Internalname = sPrefix+"ALBRENT2_CELL" ;
      edtAlbRDisCli_Internalname = sPrefix+"ALBRDISCLI" ;
      edtAlbNumB_Internalname = sPrefix+"ALBNUMB" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD" ;
      edtProceCod_Internalname = sPrefix+"PROCECOD" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE" ;
      edtAlbRMdlCod_Internalname = sPrefix+"ALBRMDLCOD" ;
      edtAlbRLu_Internalname = sPrefix+"ALBRLU" ;
      edtAlbRTelar_Internalname = sPrefix+"ALBRTELAR" ;
      edtAlbMaqTej_Internalname = sPrefix+"ALBMAQTEJ" ;
      edtAlbRTara_Internalname = sPrefix+"ALBRTARA" ;
      divUnnamedtable23_Internalname = sPrefix+"UNNAMEDTABLE23" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE8" ;
      divDvpanel_unnamedtable8_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE8_CELL" ;
      edtTipEntCod_Internalname = sPrefix+"TIPENTCOD" ;
      edtAlbRDes_Internalname = sPrefix+"ALBRDES" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT" ;
      edtAlbrPieC_Internalname = sPrefix+"ALBRPIEC" ;
      divUnnamedtable21_Internalname = sPrefix+"UNNAMEDTABLE21" ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI" );
      edtAlbrUniC_Internalname = sPrefix+"ALBRUNIC" ;
      divUnnamedtable22_Internalname = sPrefix+"UNNAMEDTABLE22" ;
      divUnnamedtable14_Internalname = sPrefix+"UNNAMEDTABLE14" ;
      grpUnnamedgroup15_Internalname = sPrefix+"UNNAMEDGROUP15" ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI" ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS" ;
      divUnnamedtable18_Internalname = sPrefix+"UNNAMEDTABLE18" ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI" ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS" ;
      divUnnamedtable19_Internalname = sPrefix+"UNNAMEDTABLE19" ;
      edtAlbRFecUlt_Internalname = sPrefix+"ALBRFECULT" ;
      cmbAlbREst.setInternalname( sPrefix+"ALBREST" );
      divUnnamedtable20_Internalname = sPrefix+"UNNAMEDTABLE20" ;
      divUnnamedtable16_Internalname = sPrefix+"UNNAMEDTABLE16" ;
      grpUnnamedgroup17_Internalname = sPrefix+"UNNAMEDGROUP17" ;
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE10" ;
      edtAlmCod_Internalname = sPrefix+"ALMCOD" ;
      edtAlbRLoc_Internalname = sPrefix+"ALBRLOC" ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO" );
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2" ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC" ;
      edtAlbPml_Internalname = sPrefix+"ALBPML" ;
      divUnnamedtable13_Internalname = sPrefix+"UNNAMEDTABLE13" ;
      divUnnamedtable12_Internalname = sPrefix+"UNNAMEDTABLE12" ;
      Dvpanel_unnamedtable12_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE12" ;
      divDvpanel_unnamedtable12_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE12_CELL" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
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
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Enabled = 0 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 0 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 0 ;
      divDvpanel_unnamedtable12_cell_Class = "col-xs-12" ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 0 );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Enabled = 0 ;
      edtAlmCod_Jsonclick = "" ;
      edtAlmCod_Enabled = 0 ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 0 );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Enabled = 0 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Enabled = 0 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Enabled = 0 ;
      edtAlbRTara_Jsonclick = "" ;
      edtAlbRTara_Enabled = 0 ;
      edtAlbMaqTej_Jsonclick = "" ;
      edtAlbMaqTej_Enabled = 0 ;
      edtAlbRTelar_Jsonclick = "" ;
      edtAlbRTelar_Enabled = 0 ;
      edtAlbRLu_Jsonclick = "" ;
      edtAlbRLu_Enabled = 0 ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRMdlCod_Enabled = 0 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 0 ;
      divDvpanel_unnamedtable8_cell_Class = "col-xs-12" ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 0 ;
      edtAlbNumB_Jsonclick = "" ;
      edtAlbNumB_Enabled = 0 ;
      edtAlbRDisCli_Jsonclick = "" ;
      edtAlbRDisCli_Enabled = 0 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Enabled = 0 ;
      edtAlbREnt2_Visible = 1 ;
      divAlbrent2_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Link = "" ;
      edtAlbREnt_Enabled = 0 ;
      edtAlbREnt_Visible = 1 ;
      divAlbrent_cell_Class = "col-xs-12 col-sm-3" ;
      edtComposicio_Jsonclick = "" ;
      edtComposicio_Enabled = 0 ;
      edtAlbRTartD_Jsonclick = "" ;
      edtAlbRTartD_Link = "" ;
      edtAlbRTartD_Enabled = 0 ;
      edtAlbRTartC_Jsonclick = "" ;
      edtAlbRTartC_Enabled = 0 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtAlbrUsu_Jsonclick = "" ;
      edtAlbrUsu_Enabled = 0 ;
      edtAlbrHor_Jsonclick = "" ;
      edtAlbrHor_Enabled = 0 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 0 ;
      Dvpanel_unnamedtable12_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable12_Iconposition = "Right" ;
      Dvpanel_unnamedtable12_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable12_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable12_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable12_Title = httpContext.getMessage( "Datos Crudo", "") ;
      Dvpanel_unnamedtable12_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable12_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable12_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable12_Width = "100%" ;
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = httpContext.getMessage( "Entradas (Piezas, Unidades)", "") ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = httpContext.getMessage( "Datos Tejedor", "") ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
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
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111PJ1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121PJ1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_ALBRTARTC","{handler:'valid_Albrtartc',iparms:[]");
      setEventMetadata("VALID_ALBRTARTC",",oparms:[]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALMCOD","{handler:'valid_Almcod',iparms:[]");
      setEventMetadata("VALID_ALMCOD",",oparms:[]}");
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
      A13751ArtCDsc = "" ;
      A13821TipEntNomI = "" ;
      h45AlbRef = "" ;
      h1211TipEntCod = "" ;
      h4792AlmCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      A45AlbRef = "" ;
      GX_FocusControl = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A6178AlbrUsu = "" ;
      A3613AlbRefDsc = "" ;
      A6264AlbRTartD = "" ;
      A13981Composicio = "" ;
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A3359AlbRDisCli = "" ;
      A8028AlbNumB = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      A6463AlbRLote = "" ;
      A4602AlbRMdlCod = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A1291AlbRDes = "" ;
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A50AlbRLoc = "" ;
      A55AlbRReo = "" ;
      ucDvpanel_unnamedtable12 = new com.genexus.webpanels.GXUserControl();
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
      l13751ArtCDsc = "" ;
      H01PJ2_A13751ArtCDsc = new String[] {""} ;
      l13821TipEntNomI = "" ;
      H01PJ3_A13821TipEntNomI = new String[] {""} ;
      H01PJ4_A13751ArtCDsc = new String[] {""} ;
      H01PJ4_A396EmprCod = new String[] {""} ;
      H01PJ4_A252CliCod = new int[1] ;
      H01PJ4_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      H01PJ5_A13821TipEntNomI = new String[] {""} ;
      H01PJ5_A396EmprCod = new String[] {""} ;
      H01PJ5_A1211TipEntCod = new short[1] ;
      H01PJ5_n1211TipEntCod = new boolean[] {false} ;
      A13822AlmNomID = "" ;
      H01PJ6_A13822AlmNomID = new String[] {""} ;
      H01PJ6_A396EmprCod = new String[] {""} ;
      H01PJ6_A4792AlmCod = new byte[1] ;
      H01PJ6_n4792AlmCod = new boolean[] {false} ;
      AV15Pgmname = "" ;
      H01PJ7_A44AlbRecCod = new int[1] ;
      H01PJ7_A4922AlbPml = new short[1] ;
      H01PJ7_A4921AlbRAnc = new short[1] ;
      H01PJ7_A4920AlbRGrm2 = new short[1] ;
      H01PJ7_A55AlbRReo = new String[] {""} ;
      H01PJ7_A50AlbRLoc = new String[] {""} ;
      H01PJ7_A4792AlmCod = new byte[1] ;
      H01PJ7_n4792AlmCod = new boolean[] {false} ;
      H01PJ7_A47AlbREst = new byte[1] ;
      H01PJ7_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H01PJ7_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PJ7_A56AlbRUni = new String[] {""} ;
      H01PJ7_A6181AlbrPieC = new int[1] ;
      H01PJ7_A1291AlbRDes = new String[] {""} ;
      H01PJ7_A1211TipEntCod = new short[1] ;
      H01PJ7_n1211TipEntCod = new boolean[] {false} ;
      H01PJ7_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PJ7_A8035AlbMaqTej = new String[] {""} ;
      H01PJ7_A6464AlbRTelar = new String[] {""} ;
      H01PJ7_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PJ7_A4602AlbRMdlCod = new String[] {""} ;
      H01PJ7_A6463AlbRLote = new String[] {""} ;
      H01PJ7_A970ProceCod = new short[1] ;
      H01PJ7_n970ProceCod = new boolean[] {false} ;
      H01PJ7_A840TrnCod = new short[1] ;
      H01PJ7_n840TrnCod = new boolean[] {false} ;
      H01PJ7_A8028AlbNumB = new String[] {""} ;
      H01PJ7_A3359AlbRDisCli = new String[] {""} ;
      H01PJ7_A5806AlbREnt2 = new String[] {""} ;
      H01PJ7_A46AlbREnt = new String[] {""} ;
      H01PJ7_A6264AlbRTartD = new String[] {""} ;
      H01PJ7_n6264AlbRTartD = new boolean[] {false} ;
      H01PJ7_A6263AlbRTartC = new short[1] ;
      H01PJ7_n6263AlbRTartC = new boolean[] {false} ;
      H01PJ7_A3613AlbRefDsc = new String[] {""} ;
      H01PJ7_A6178AlbrUsu = new String[] {""} ;
      H01PJ7_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01PJ7_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H01PJ7_A396EmprCod = new String[] {""} ;
      H01PJ7_A45AlbRef = new String[] {""} ;
      H01PJ7_A252CliCod = new int[1] ;
      H01PJ7_A54AlbRPieUti = new int[1] ;
      H01PJ7_A52AlbRPieEnt = new int[1] ;
      H01PJ7_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PJ7_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PJ8_A13821TipEntNomI = new String[] {""} ;
      H01PJ8_A396EmprCod = new String[] {""} ;
      H01PJ8_A1211TipEntCod = new short[1] ;
      H01PJ8_n1211TipEntCod = new boolean[] {false} ;
      H01PJ9_A13822AlmNomID = new String[] {""} ;
      H01PJ9_A396EmprCod = new String[] {""} ;
      H01PJ9_A4792AlmCod = new byte[1] ;
      H01PJ9_n4792AlmCod = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      H01PJ10_A13751ArtCDsc = new String[] {""} ;
      H01PJ10_A396EmprCod = new String[] {""} ;
      H01PJ10_A252CliCod = new int[1] ;
      H01PJ10_A65ArtCod = new String[] {""} ;
      H01PJ11_A13821TipEntNomI = new String[] {""} ;
      H01PJ11_A396EmprCod = new String[] {""} ;
      H01PJ11_A1211TipEntCod = new short[1] ;
      H01PJ11_n1211TipEntCod = new boolean[] {false} ;
      H01PJ12_A13822AlmNomID = new String[] {""} ;
      H01PJ12_A396EmprCod = new String[] {""} ;
      H01PJ12_A4792AlmCod = new byte[1] ;
      H01PJ12_n4792AlmCod = new boolean[] {false} ;
      hsh = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext6 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV13Enccli_20 = DecimalUtil.ZERO ;
      AV14Emprcod = "" ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA44AlbRecCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidogeneral__default(),
         new Object[] {
             new Object[] {
            H01PJ2_A13751ArtCDsc
            }
            , new Object[] {
            H01PJ3_A13821TipEntNomI
            }
            , new Object[] {
            H01PJ4_A13751ArtCDsc, H01PJ4_A396EmprCod, H01PJ4_A252CliCod, H01PJ4_A65ArtCod
            }
            , new Object[] {
            H01PJ5_A13821TipEntNomI, H01PJ5_A396EmprCod, H01PJ5_A1211TipEntCod
            }
            , new Object[] {
            H01PJ6_A13822AlmNomID, H01PJ6_A396EmprCod, H01PJ6_A4792AlmCod
            }
            , new Object[] {
            H01PJ7_A44AlbRecCod, H01PJ7_A4922AlbPml, H01PJ7_A4921AlbRAnc, H01PJ7_A4920AlbRGrm2, H01PJ7_A55AlbRReo, H01PJ7_A50AlbRLoc, H01PJ7_A4792AlmCod, H01PJ7_n4792AlmCod, H01PJ7_A47AlbREst, H01PJ7_A48AlbRFecUlt,
            H01PJ7_A6180AlbrUniC, H01PJ7_A56AlbRUni, H01PJ7_A6181AlbrPieC, H01PJ7_A1291AlbRDes, H01PJ7_A1211TipEntCod, H01PJ7_n1211TipEntCod, H01PJ7_A6470AlbRTara, H01PJ7_A8035AlbMaqTej, H01PJ7_A6464AlbRTelar, H01PJ7_A6465AlbRLu,
            H01PJ7_A4602AlbRMdlCod, H01PJ7_A6463AlbRLote, H01PJ7_A970ProceCod, H01PJ7_n970ProceCod, H01PJ7_A840TrnCod, H01PJ7_n840TrnCod, H01PJ7_A8028AlbNumB, H01PJ7_A3359AlbRDisCli, H01PJ7_A5806AlbREnt2, H01PJ7_A46AlbREnt,
            H01PJ7_A6264AlbRTartD, H01PJ7_n6264AlbRTartD, H01PJ7_A6263AlbRTartC, H01PJ7_n6263AlbRTartC, H01PJ7_A3613AlbRefDsc, H01PJ7_A6178AlbrUsu, H01PJ7_A6179AlbrHor, H01PJ7_A49AlbRFen, H01PJ7_A396EmprCod, H01PJ7_A45AlbRef,
            H01PJ7_A252CliCod, H01PJ7_A54AlbRPieUti, H01PJ7_A52AlbRPieEnt, H01PJ7_A60AlbRUniUti, H01PJ7_A58AlbRUniEnt
            }
            , new Object[] {
            H01PJ8_A13821TipEntNomI, H01PJ8_A396EmprCod, H01PJ8_A1211TipEntCod
            }
            , new Object[] {
            H01PJ9_A13822AlmNomID, H01PJ9_A396EmprCod, H01PJ9_A4792AlmCod
            }
            , new Object[] {
            H01PJ10_A13751ArtCDsc, H01PJ10_A396EmprCod, H01PJ10_A252CliCod, H01PJ10_A65ArtCod
            }
            , new Object[] {
            H01PJ11_A13821TipEntNomI, H01PJ11_A396EmprCod, H01PJ11_A1211TipEntCod
            }
            , new Object[] {
            H01PJ12_A13822AlmNomID, H01PJ12_A396EmprCod, H01PJ12_A4792AlmCod
            }
         }
      );
      AV15Pgmname = "AlmacenSinDetalle.AlmacenTejidoGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "AlmacenSinDetalle.AlmacenTejidoGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A4792AlmCod ;
   private byte A47AlbREst ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short wbEnd ;
   private short wbStart ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A4922AlbPml ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA44AlbRecCod ;
   private int A44AlbRecCod ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbrHor_Enabled ;
   private int edtAlbrUsu_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtAlbRTartC_Enabled ;
   private int edtAlbRTartD_Enabled ;
   private int edtComposicio_Enabled ;
   private int edtAlbREnt_Visible ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbREnt2_Visible ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbRDisCli_Enabled ;
   private int edtAlbNumB_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRMdlCod_Enabled ;
   private int edtAlbRLu_Enabled ;
   private int edtAlbRTelar_Enabled ;
   private int edtAlbMaqTej_Enabled ;
   private int edtAlbRTara_Enabled ;
   private int edtTipEntCod_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int A6181AlbrPieC ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtAlmCod_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int edtEmprCod_Visible ;
   private int gxdynajaxindex ;
   private int GXv_int3[] ;
   private int idxLst ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV13Enccli_20 ;
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
   private String A45AlbRef ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable10_Width ;
   private String Dvpanel_unnamedtable10_Cls ;
   private String Dvpanel_unnamedtable10_Title ;
   private String Dvpanel_unnamedtable10_Iconposition ;
   private String Dvpanel_unnamedtable12_Width ;
   private String Dvpanel_unnamedtable12_Cls ;
   private String Dvpanel_unnamedtable12_Title ;
   private String Dvpanel_unnamedtable12_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbrHor_Internalname ;
   private String edtAlbrHor_Jsonclick ;
   private String edtAlbrUsu_Internalname ;
   private String A6178AlbrUsu ;
   private String edtAlbrUsu_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtAlbRTartC_Internalname ;
   private String edtAlbRTartC_Jsonclick ;
   private String edtAlbRTartD_Internalname ;
   private String A6264AlbRTartD ;
   private String edtAlbRTartD_Link ;
   private String edtAlbRTartD_Jsonclick ;
   private String edtComposicio_Internalname ;
   private String A13981Composicio ;
   private String edtComposicio_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divAlbrent_cell_Internalname ;
   private String divAlbrent_cell_Class ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Link ;
   private String edtAlbREnt_Jsonclick ;
   private String divAlbrent2_cell_Internalname ;
   private String divAlbrent2_cell_Class ;
   private String edtAlbREnt2_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Jsonclick ;
   private String edtAlbRDisCli_Internalname ;
   private String A3359AlbRDisCli ;
   private String edtAlbRDisCli_Jsonclick ;
   private String edtAlbNumB_Internalname ;
   private String A8028AlbNumB ;
   private String edtAlbNumB_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String divDvpanel_unnamedtable8_cell_Internalname ;
   private String divDvpanel_unnamedtable8_cell_Class ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String divUnnamedtable23_Internalname ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRMdlCod_Internalname ;
   private String A4602AlbRMdlCod ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String edtAlbRLu_Internalname ;
   private String edtAlbRLu_Jsonclick ;
   private String edtAlbRTelar_Internalname ;
   private String A6464AlbRTelar ;
   private String edtAlbRTelar_Jsonclick ;
   private String edtAlbMaqTej_Internalname ;
   private String A8035AlbMaqTej ;
   private String edtAlbMaqTej_Jsonclick ;
   private String edtAlbRTara_Internalname ;
   private String edtAlbRTara_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtTipEntCod_Internalname ;
   private String edtTipEntCod_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String grpUnnamedgroup15_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String divUnnamedtable21_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbrPieC_Jsonclick ;
   private String divUnnamedtable22_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String A56AlbRUni ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrUniC_Jsonclick ;
   private String grpUnnamedgroup17_Internalname ;
   private String divUnnamedtable16_Internalname ;
   private String divUnnamedtable18_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String divUnnamedtable19_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String divUnnamedtable20_Internalname ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtAlmCod_Internalname ;
   private String edtAlmCod_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String A55AlbRReo ;
   private String divDvpanel_unnamedtable12_cell_Internalname ;
   private String divDvpanel_unnamedtable12_cell_Class ;
   private String Dvpanel_unnamedtable12_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
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
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String AV15Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String hsh ;
   private String AV14Emprcod ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA44AlbRecCod ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable8_Autowidth ;
   private boolean Dvpanel_unnamedtable8_Autoheight ;
   private boolean Dvpanel_unnamedtable8_Collapsible ;
   private boolean Dvpanel_unnamedtable8_Collapsed ;
   private boolean Dvpanel_unnamedtable8_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable8_Autoscroll ;
   private boolean Dvpanel_unnamedtable10_Autowidth ;
   private boolean Dvpanel_unnamedtable10_Autoheight ;
   private boolean Dvpanel_unnamedtable10_Collapsible ;
   private boolean Dvpanel_unnamedtable10_Collapsed ;
   private boolean Dvpanel_unnamedtable10_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable10_Autoscroll ;
   private boolean Dvpanel_unnamedtable12_Autowidth ;
   private boolean Dvpanel_unnamedtable12_Autoheight ;
   private boolean Dvpanel_unnamedtable12_Collapsible ;
   private boolean Dvpanel_unnamedtable12_Collapsed ;
   private boolean Dvpanel_unnamedtable12_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable12_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1211TipEntCod ;
   private boolean n4792AlmCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n970ProceCod ;
   private boolean n840TrnCod ;
   private boolean n6264AlbRTartD ;
   private boolean n6263AlbRTartC ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13751ArtCDsc ;
   private String A13821TipEntNomI ;
   private String h45AlbRef ;
   private String h1211TipEntCod ;
   private String h4792AlmCod ;
   private String l13751ArtCDsc ;
   private String l13821TipEntNomI ;
   private String A13822AlmNomID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable12 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private String[] H01PJ2_A13751ArtCDsc ;
   private String[] H01PJ3_A13821TipEntNomI ;
   private String[] H01PJ4_A13751ArtCDsc ;
   private String[] H01PJ4_A396EmprCod ;
   private int[] H01PJ4_A252CliCod ;
   private String[] H01PJ4_A65ArtCod ;
   private String[] H01PJ5_A13821TipEntNomI ;
   private String[] H01PJ5_A396EmprCod ;
   private short[] H01PJ5_A1211TipEntCod ;
   private boolean[] H01PJ5_n1211TipEntCod ;
   private String[] H01PJ6_A13822AlmNomID ;
   private String[] H01PJ6_A396EmprCod ;
   private byte[] H01PJ6_A4792AlmCod ;
   private boolean[] H01PJ6_n4792AlmCod ;
   private int[] H01PJ7_A44AlbRecCod ;
   private short[] H01PJ7_A4922AlbPml ;
   private short[] H01PJ7_A4921AlbRAnc ;
   private short[] H01PJ7_A4920AlbRGrm2 ;
   private String[] H01PJ7_A55AlbRReo ;
   private String[] H01PJ7_A50AlbRLoc ;
   private byte[] H01PJ7_A4792AlmCod ;
   private boolean[] H01PJ7_n4792AlmCod ;
   private byte[] H01PJ7_A47AlbREst ;
   private java.util.Date[] H01PJ7_A48AlbRFecUlt ;
   private java.math.BigDecimal[] H01PJ7_A6180AlbrUniC ;
   private String[] H01PJ7_A56AlbRUni ;
   private int[] H01PJ7_A6181AlbrPieC ;
   private String[] H01PJ7_A1291AlbRDes ;
   private short[] H01PJ7_A1211TipEntCod ;
   private boolean[] H01PJ7_n1211TipEntCod ;
   private java.math.BigDecimal[] H01PJ7_A6470AlbRTara ;
   private String[] H01PJ7_A8035AlbMaqTej ;
   private String[] H01PJ7_A6464AlbRTelar ;
   private java.math.BigDecimal[] H01PJ7_A6465AlbRLu ;
   private String[] H01PJ7_A4602AlbRMdlCod ;
   private String[] H01PJ7_A6463AlbRLote ;
   private short[] H01PJ7_A970ProceCod ;
   private boolean[] H01PJ7_n970ProceCod ;
   private short[] H01PJ7_A840TrnCod ;
   private boolean[] H01PJ7_n840TrnCod ;
   private String[] H01PJ7_A8028AlbNumB ;
   private String[] H01PJ7_A3359AlbRDisCli ;
   private String[] H01PJ7_A5806AlbREnt2 ;
   private String[] H01PJ7_A46AlbREnt ;
   private String[] H01PJ7_A6264AlbRTartD ;
   private boolean[] H01PJ7_n6264AlbRTartD ;
   private short[] H01PJ7_A6263AlbRTartC ;
   private boolean[] H01PJ7_n6263AlbRTartC ;
   private String[] H01PJ7_A3613AlbRefDsc ;
   private String[] H01PJ7_A6178AlbrUsu ;
   private java.util.Date[] H01PJ7_A6179AlbrHor ;
   private java.util.Date[] H01PJ7_A49AlbRFen ;
   private String[] H01PJ7_A396EmprCod ;
   private String[] H01PJ7_A45AlbRef ;
   private int[] H01PJ7_A252CliCod ;
   private int[] H01PJ7_A54AlbRPieUti ;
   private int[] H01PJ7_A52AlbRPieEnt ;
   private java.math.BigDecimal[] H01PJ7_A60AlbRUniUti ;
   private java.math.BigDecimal[] H01PJ7_A58AlbRUniEnt ;
   private String[] H01PJ8_A13821TipEntNomI ;
   private String[] H01PJ8_A396EmprCod ;
   private short[] H01PJ8_A1211TipEntCod ;
   private boolean[] H01PJ8_n1211TipEntCod ;
   private String[] H01PJ9_A13822AlmNomID ;
   private String[] H01PJ9_A396EmprCod ;
   private byte[] H01PJ9_A4792AlmCod ;
   private boolean[] H01PJ9_n4792AlmCod ;
   private String[] H01PJ10_A13751ArtCDsc ;
   private String[] H01PJ10_A396EmprCod ;
   private int[] H01PJ10_A252CliCod ;
   private String[] H01PJ10_A65ArtCod ;
   private String[] H01PJ11_A13821TipEntNomI ;
   private String[] H01PJ11_A396EmprCod ;
   private short[] H01PJ11_A1211TipEntCod ;
   private boolean[] H01PJ11_n1211TipEntCod ;
   private String[] H01PJ12_A13822AlmNomID ;
   private String[] H01PJ12_A396EmprCod ;
   private byte[] H01PJ12_A4792AlmCod ;
   private boolean[] H01PJ12_n4792AlmCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext6[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class almacentejidogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01PJ2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc FROM TXPARTICU WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, '')))) like '%' || UPPER(?)) ORDER BY ArtCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PJ3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) AS TipEntNomI FROM TXPENTRAD WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, '')))) like '%' || UPPER(?)) ORDER BY TipEntNomI) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PJ4", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PJ5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) AS TipEntNomI, EmprCod, TipEntCod FROM TXPENTRAD WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PJ6", "SELECT RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' AS AlmNomID, EmprCod, AlmCod FROM TXPAlmace WHERE (RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PJ7", "SELECT T1.AlbRecCod, T1.AlbPml, T1.AlbRAnc, T1.AlbRGrm2, T1.AlbRReo, T1.AlbRLoc, T1.AlmCod, T1.AlbREst, T1.AlbRFecUlt, T1.AlbrUniC, T1.AlbRUni, T1.AlbrPieC, T1.AlbRDes, T1.TipEntCod, T1.AlbRTara, T1.AlbMaqTej, T1.AlbRTelar, T1.AlbRLu, T1.AlbRMdlCod, T1.AlbRLote, T1.ProceCod, T1.TrnCod, T1.AlbNumB, T1.AlbRDisCli, T1.AlbREnt2, T1.AlbREnt, T2.TipArtDsc AS AlbRTartD, T1.AlbRTartC AS AlbRTartC, T1.AlbRefDsc, T1.AlbrUsu, T1.AlbrHor, T1.AlbRFen, T1.EmprCod, T1.AlbRef, T1.CliCod, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (TXPALBREC T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.AlbRTartC) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01PJ8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) AS TipEntNomI, EmprCod, TipEntCod FROM TXPENTRAD WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01PJ9", "SELECT RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' AS AlmNomID, EmprCod, AlmCod FROM TXPAlmace WHERE (RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01PJ10", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01PJ11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) AS TipEntNomI, EmprCod, TipEntCod FROM TXPENTRAD WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01PJ12", "SELECT RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' AS AlmNomID, EmprCod, AlmCod FROM TXPAlmace WHERE (RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[17])[0] = rslt.getString(16, 12);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[20])[0] = rslt.getString(19, 13);
               ((String[]) buf[21])[0] = rslt.getString(20, 20);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 20);
               ((String[]) buf[27])[0] = rslt.getString(24, 20);
               ((String[]) buf[28])[0] = rslt.getString(25, 20);
               ((String[]) buf[29])[0] = rslt.getString(26, 8);
               ((String[]) buf[30])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(28);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(29, 26);
               ((String[]) buf[35])[0] = rslt.getString(30, 10);
               ((java.util.Date[]) buf[36])[0] = GXutil.resetDate(rslt.getGXDateTime(31));
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 3);
               ((String[]) buf[39])[0] = rslt.getString(34, 16);
               ((int[]) buf[40])[0] = rslt.getInt(35);
               ((int[]) buf[41])[0] = rslt.getInt(36);
               ((int[]) buf[42])[0] = rslt.getInt(37);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(38,2);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(39,2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 35);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

