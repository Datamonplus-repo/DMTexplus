package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentocomercialv01documentocomercialv02_impl extends GXWebComponent
{
   public documentocomercialv01documentocomercialv02_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentocomercialv01documentocomercialv02_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentocomercialv01documentocomercialv02_impl.class ));
   }

   public documentocomercialv01documentocomercialv02_impl( int remoteHandle ,
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
      cmbAlbComPri = new HTMLChoice();
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
               A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A14AlbComCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaclicod1AU0( A396EmprCod, A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatrncod1AU0( A396EmprCod, A13738TrnCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaclicod1AU0( A396EmprCod, A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h252CliCod = httpContext.GetPar( "h252CliCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaclicod1AU2( A396EmprCod, h252CliCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatrncod1AU0( A396EmprCod, A13738TrnCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcatrncod1AU2( A396EmprCod, h840TrnCod) ;
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
         pa1AU2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Documento Comercialv01 Documento Comercialv02", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentocomercialv01documentocomercialv02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"EmprCod","AlbComCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBCOMPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbComPri, "9"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentoComercialv01DocumentoComercialv02");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV14Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentocomercialv01documentocomercialv02:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA14AlbComCod", GXutil.ltrim( localUtil.ntoc( wcpOA14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBCOMPRI", GXutil.rtrim( AV11AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBCOMPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseForm1AU2( )
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
      return "DocumentoComercialv01DocumentoComercialv02" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Comercialv01 Documento Comercialv02", "") ;
   }

   public void wb1AU0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.documentocomercialv01documentocomercialv02");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComCod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFch_Internalname, localUtil.format(A17AlbComFch, "99/99/99"), localUtil.format( A17AlbComFch, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtAlbComFch_Link, "", "", "", edtAlbComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbComPri.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComPri, cmbAlbComPri.getInternalname(), GXutil.rtrim( A22AlbComPri), 1, cmbAlbComPri.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbComPri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, h252CliCod, GXutil.rtrim( localUtil.format( h252CliCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedalcdomenv_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalcdomenv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "", "", lblTextblockalcdomenv_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         wb_table1_45_1AU2( true) ;
      }
      else
      {
         wb_table1_45_1AU2( false) ;
      }
      return  ;
   }

   public void wb_table1_45_1AU2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComMat_Internalname, GXutil.rtrim( A4830AlbComMat), GXutil.rtrim( localUtil.format( A4830AlbComMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComHor_Internalname, httpContext.getMessage( "Fecha Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbComHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComHor_Internalname, localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComHor_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbComHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111au1_client"+"'", TempTags, "", 2, "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121au1_client"+"'", TempTags, "", 2, "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
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
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "Pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV14Pgmname), GXutil.rtrim( localUtil.format( AV14Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 30, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtfindDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13739findDomEnv), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfindDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtfindDomEnv_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbComFs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFs_Internalname, localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFs_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComFs_Visible, 0, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbComFs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtAlbComFs_Visible==0)||(0==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtAlbComFd_Internalname, GXutil.rtrim( A10014AlbComFd), "", "", (short)(0), edtAlbComFd_Visible, 0, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtAlbComFdD_Internalname, GXutil.rtrim( A10015AlbComFdD), "", "", (short)(0), edtAlbComFdD_Visible, 0, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCSec_Internalname, GXutil.rtrim( A3094AlbCSec), GXutil.rtrim( localUtil.format( A3094AlbCSec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCSec_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCSec_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComSt_Internalname, GXutil.rtrim( A10738AlbComSt), GXutil.rtrim( localUtil.format( A10738AlbComSt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComSt_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComSt_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEAT_Internalname, GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEAT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEAT_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComID_Internalname, GXutil.rtrim( A10740AlbComID), GXutil.rtrim( localUtil.format( A10740AlbComID, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComID_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComID_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComAT_Internalname, GXutil.rtrim( A10764AlbComAT), GXutil.rtrim( localUtil.format( A10764AlbComAT, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComAT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComAT_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcIvaCod_Internalname, GXutil.rtrim( A5143AlcIvaCod), GXutil.rtrim( localUtil.format( A5143AlcIvaCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcIvaCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcIvaCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrNm_Internalname, GXutil.rtrim( A11719AlbCTrNm), GXutil.rtrim( localUtil.format( A11719AlbCTrNm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrNm_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCTrNm_Visible, 0, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrDm_Internalname, GXutil.rtrim( A11720AlbCTrDm), GXutil.rtrim( localUtil.format( A11720AlbCTrDm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrDm_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCTrDm_Visible, 0, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrNc_Internalname, GXutil.rtrim( A11721AlbCTrNc), GXutil.rtrim( localUtil.format( A11721AlbCTrNc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrNc_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCTrNc_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDivTra_Internalname, GXutil.rtrim( A3091CliDivTra), GXutil.rtrim( localUtil.format( A3091CliDivTra, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDivTra_Jsonclick, 0, "Attribute", "", "", "", "", edtCliDivTra_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3140CliDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliDivCod_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComImp_Internalname, GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A18AlbComImp, "ZZZZZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComImp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComImp_Visible, 0, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEst_Internalname, GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEst_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEst_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComLiC_Internalname, GXutil.ltrim( localUtil.ntoc( A19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A19AlbComLiC), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComLiC_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComLiC_Visible, 0, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEso_Internalname, GXutil.ltrim( localUtil.ntoc( A1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEso_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEso_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDivTCod_Internalname, GXutil.rtrim( A3095AlcDivTCod), GXutil.rtrim( localUtil.format( A3095AlcDivTCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDivTCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcDivTCod_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3111AlcDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcDivCod_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDivAbr_Internalname, GXutil.rtrim( A3112AlcDivAbr), GXutil.rtrim( localUtil.format( A3112AlcDivAbr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDivAbr_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcDivAbr_Visible, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", edtCliNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1AU2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Documento Comercialv01 Documento Comercialv02", ""), (short)(0)) ;
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
            strup1AU0( ) ;
         }
      }
   }

   public void ws1AU2( )
   {
      start1AU2( ) ;
      evt1AU2( ) ;
   }

   public void evt1AU2( )
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
                              strup1AU0( ) ;
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
                              strup1AU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131AU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1AU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141AU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1AU0( ) ;
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
                              strup1AU0( ) ;
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

   public void we1AU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1AU2( ) ;
         }
      }
   }

   public void pa1AU2( )
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

   public void gxsgaclicod1AU0( String A396EmprCod ,
                                String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_data1AU0( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaclicod_data1AU0( String A396EmprCod ,
                                        String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H01AU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01AU2_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(H01AU2_A13735CliCNom[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgatrncod1AU0( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1AU0( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_data1AU0( String A396EmprCod ,
                                        String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor H01AU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H01AU3_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(H01AU3_A13738TrnCNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcaclicod1AU2( String A396EmprCod ,
                                String A13735CliCNom )
   {
      /* Using cursor H01AU4 */
      pr_default.execute(2, new Object[] {A13735CliCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = H01AU4_A13735CliCNom[0] ;
         A396EmprCod = H01AU4_A396EmprCod[0] ;
         A252CliCod = H01AU4_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcatrncod1AU2( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      /* Using cursor H01AU5 */
      pr_default.execute(3, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = H01AU5_A13738TrnCNom[0] ;
         A396EmprCod = H01AU5_A396EmprCod[0] ;
         A840TrnCod = H01AU5_A840TrnCod[0] ;
         n840TrnCod = H01AU5_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      if ( cmbAlbComPri.getItemCount() > 0 )
      {
         A22AlbComPri = cmbAlbComPri.getValidValue(A22AlbComPri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22AlbComPri", A22AlbComPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1AU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "DocumentoComercialv01DocumentoComercialv02" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1AU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01AU7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A279CliNom = H01AU7_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A841TrnNom = H01AU7_A841TrnNom[0] ;
            n841TrnNom = H01AU7_n841TrnNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
            A3112AlcDivAbr = H01AU7_A3112AlcDivAbr[0] ;
            n3112AlcDivAbr = H01AU7_n3112AlcDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3112AlcDivAbr", A3112AlcDivAbr);
            A3111AlcDivCod = H01AU7_A3111AlcDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
            A3095AlcDivTCod = H01AU7_A3095AlcDivTCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3095AlcDivTCod", A3095AlcDivTCod);
            A1783AlbComEso = H01AU7_A1783AlbComEso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
            A19AlbComLiC = H01AU7_A19AlbComLiC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
            A16AlbComEst = H01AU7_A16AlbComEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
            A3140CliDivCod = H01AU7_A3140CliDivCod[0] ;
            n3140CliDivCod = H01AU7_n3140CliDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
            A3091CliDivTra = H01AU7_A3091CliDivTra[0] ;
            n3091CliDivTra = H01AU7_n3091CliDivTra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3091CliDivTra", A3091CliDivTra);
            A11721AlbCTrNc = H01AU7_A11721AlbCTrNc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11721AlbCTrNc", A11721AlbCTrNc);
            A11720AlbCTrDm = H01AU7_A11720AlbCTrDm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11720AlbCTrDm", A11720AlbCTrDm);
            A11719AlbCTrNm = H01AU7_A11719AlbCTrNm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11719AlbCTrNm", A11719AlbCTrNm);
            A5143AlcIvaCod = H01AU7_A5143AlcIvaCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5143AlcIvaCod", A5143AlcIvaCod);
            A10764AlbComAT = H01AU7_A10764AlbComAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10764AlbComAT", A10764AlbComAT);
            A10740AlbComID = H01AU7_A10740AlbComID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10740AlbComID", A10740AlbComID);
            A10739AlbComEAT = H01AU7_A10739AlbComEAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            A10738AlbComSt = H01AU7_A10738AlbComSt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10738AlbComSt", A10738AlbComSt);
            A3094AlbCSec = H01AU7_A3094AlbCSec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3094AlbCSec", A3094AlbCSec);
            A10015AlbComFdD = H01AU7_A10015AlbComFdD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10015AlbComFdD", A10015AlbComFdD);
            A10014AlbComFd = H01AU7_A10014AlbComFd[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10014AlbComFd", A10014AlbComFd);
            A10013AlbComFs = H01AU7_A10013AlbComFs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A4829AlbComHor = H01AU7_A4829AlbComHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A4830AlbComMat = H01AU7_A4830AlbComMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4830AlbComMat", A4830AlbComMat);
            A840TrnCod = H01AU7_A840TrnCod[0] ;
            n840TrnCod = H01AU7_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A5142AlcDomEnv = H01AU7_A5142AlcDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
            A252CliCod = H01AU7_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A22AlbComPri = H01AU7_A22AlbComPri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22AlbComPri", A22AlbComPri);
            A17AlbComFch = H01AU7_A17AlbComFch[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            A18AlbComImp = H01AU7_A18AlbComImp[0] ;
            n18AlbComImp = H01AU7_n18AlbComImp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            A13739findDomEnv = H01AU7_A13739findDomEnv[0] ;
            n13739findDomEnv = H01AU7_n13739findDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
            A3112AlcDivAbr = H01AU7_A3112AlcDivAbr[0] ;
            n3112AlcDivAbr = H01AU7_n3112AlcDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3112AlcDivAbr", A3112AlcDivAbr);
            A279CliNom = H01AU7_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A3140CliDivCod = H01AU7_A3140CliDivCod[0] ;
            n3140CliDivCod = H01AU7_n3140CliDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
            A3091CliDivTra = H01AU7_A3091CliDivTra[0] ;
            n3091CliDivTra = H01AU7_n3091CliDivTra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3091CliDivTra", A3091CliDivTra);
            A841TrnNom = H01AU7_A841TrnNom[0] ;
            n841TrnNom = H01AU7_n841TrnNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
            A13739findDomEnv = H01AU7_A13739findDomEnv[0] ;
            n13739findDomEnv = H01AU7_n13739findDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
            A18AlbComImp = H01AU7_A18AlbComImp[0] ;
            n18AlbComImp = H01AU7_n18AlbComImp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            if ( (GXutil.strcmp("", h252CliCod)==0) )
            {
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A13735CliCNom = h252CliCod ;
               /* Using cursor H01AU8 */
               pr_default.execute(5, new Object[] {A13735CliCNom, A396EmprCod});
               A252CliCod = H01AU8_A252CliCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A252CliCod = H01AU8_A252CliCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  pr_default.readNext(5);
                  if ( ! ( (pr_default.getStatus(5) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
                  }
               }
               else
               {
               }
               pr_default.close(5);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h252CliCod", h252CliCod);
            if ( (GXutil.strcmp("", h840TrnCod)==0) )
            {
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A13738TrnCNom = h840TrnCod ;
               /* Using cursor H01AU9 */
               pr_default.execute(6, new Object[] {A13738TrnCNom, A396EmprCod});
               A840TrnCod = H01AU9_A840TrnCod[0] ;
               n840TrnCod = H01AU9_n840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               A840TrnCod = H01AU9_A840TrnCod[0] ;
               n840TrnCod = H01AU9_n840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               if ( ! ( (pr_default.getStatus(6) == 101) ) )
               {
                  pr_default.readNext(6);
                  if ( ! ( (pr_default.getStatus(6) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
                  }
               }
               else
               {
               }
               pr_default.close(6);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
            /* Execute user event: Load */
            e141AU2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         wb1AU0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1AU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBCOMPRI", GXutil.rtrim( AV11AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBCOMPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbComPri, "9"))));
   }

   public void before_start_formulas( )
   {
      AV14Pgmname = "DocumentoComercialv01DocumentoComercialv02" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H01AU11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A18AlbComImp = H01AU11_A18AlbComImp[0] ;
         n18AlbComImp = H01AU11_n18AlbComImp[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      else
      {
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      pr_default.close(7);
      pr_default.close(7);
      fix_multi_value_controls( ) ;
   }

   public void strup1AU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131AU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV11AlbComPri = httpContext.cgiGet( sPrefix+"vALBCOMPRI") ;
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
         /* Read variables values. */
         A17AlbComFch = localUtil.ctod( httpContext.cgiGet( edtAlbComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         cmbAlbComPri.setValue( httpContext.cgiGet( cmbAlbComPri.getInternalname()) );
         A22AlbComPri = httpContext.cgiGet( cmbAlbComPri.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22AlbComPri", A22AlbComPri);
         h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = h252CliCod ;
            /* Using cursor H01AU12 */
            pr_default.execute(8, new Object[] {A13735CliCNom, A396EmprCod});
            A252CliCod = H01AU12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = H01AU12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h252CliCod", h252CliCod);
         A5142AlcDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlcDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor H01AU13 */
            pr_default.execute(9, new Object[] {A13738TrnCNom, A396EmprCod});
            A840TrnCod = H01AU13_A840TrnCod[0] ;
            n840TrnCod = H01AU13_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = H01AU13_A840TrnCod[0] ;
            n840TrnCod = H01AU13_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
         A4830AlbComMat = httpContext.cgiGet( edtAlbComMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4830AlbComMat", A4830AlbComMat);
         A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV14Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
         A13739findDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtfindDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13739findDomEnv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10014AlbComFd = httpContext.cgiGet( edtAlbComFd_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10014AlbComFd", A10014AlbComFd);
         A10015AlbComFdD = httpContext.cgiGet( edtAlbComFdD_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10015AlbComFdD", A10015AlbComFdD);
         A3094AlbCSec = httpContext.cgiGet( edtAlbCSec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3094AlbCSec", A3094AlbCSec);
         A10738AlbComSt = httpContext.cgiGet( edtAlbComSt_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10738AlbComSt", A10738AlbComSt);
         A10739AlbComEAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10740AlbComID", A10740AlbComID);
         A10764AlbComAT = httpContext.cgiGet( edtAlbComAT_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10764AlbComAT", A10764AlbComAT);
         A5143AlcIvaCod = GXutil.upper( httpContext.cgiGet( edtAlcIvaCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5143AlcIvaCod", A5143AlcIvaCod);
         A11719AlbCTrNm = httpContext.cgiGet( edtAlbCTrNm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11719AlbCTrNm", A11719AlbCTrNm);
         A11720AlbCTrDm = httpContext.cgiGet( edtAlbCTrDm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11720AlbCTrDm", A11720AlbCTrDm);
         A11721AlbCTrNc = httpContext.cgiGet( edtAlbCTrNc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11721AlbCTrNc", A11721AlbCTrNc);
         A3091CliDivTra = httpContext.cgiGet( edtCliDivTra_Internalname) ;
         n3091CliDivTra = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3091CliDivTra", A3091CliDivTra);
         A3140CliDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3140CliDivCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
         A18AlbComImp = localUtil.ctond( httpContext.cgiGet( edtAlbComImp_Internalname)) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         A16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
         A19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLiC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
         A3095AlcDivTCod = httpContext.cgiGet( edtAlcDivTCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3095AlcDivTCod", A3095AlcDivTCod);
         A3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlcDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         A3112AlcDivAbr = httpContext.cgiGet( edtAlcDivAbr_Internalname) ;
         n3112AlcDivAbr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3112AlcDivAbr", A3112AlcDivAbr);
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentoComercialv01DocumentoComercialv02");
         AV14Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV14Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentocomercialv01documentocomercialv02:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131AU2 ();
      if (returnInSub) return;
   }

   public void e131AU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_SdtWWPContext1[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV6WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e141AU2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtAlbComFch_Link = formatLink("app.tdoctrnview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","AlbComCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComFch_Internalname, "Link", edtAlbComFch_Link, true);
      edtfindDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtfindDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfindDomEnv_Visible), 5, 0), true);
      edtAlbComFs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComFs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Visible), 5, 0), true);
      edtAlbComFd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComFd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFd_Visible), 5, 0), true);
      edtAlbComFdD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComFdD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFdD_Visible), 5, 0), true);
      edtAlbCSec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbCSec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCSec_Visible), 5, 0), true);
      edtAlbComSt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComSt_Visible), 5, 0), true);
      edtAlbComEAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComEAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEAT_Visible), 5, 0), true);
      edtAlbComID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Visible), 5, 0), true);
      edtAlbComAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComAT_Visible), 5, 0), true);
      edtAlcIvaCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlcIvaCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcIvaCod_Visible), 5, 0), true);
      edtAlbCTrNm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbCTrNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrNm_Visible), 5, 0), true);
      edtAlbCTrDm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbCTrDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrDm_Visible), 5, 0), true);
      edtAlbCTrNc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbCTrNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrNc_Visible), 5, 0), true);
      edtCliDivTra_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliDivTra_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDivTra_Visible), 5, 0), true);
      edtCliDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDivCod_Visible), 5, 0), true);
      edtAlbComImp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComImp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComImp_Visible), 5, 0), true);
      edtAlbComEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Visible), 5, 0), true);
      edtAlbComLiC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComLiC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Visible), 5, 0), true);
      edtAlbComEso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComEso_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEso_Visible), 5, 0), true);
      edtAlcDivTCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlcDivTCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivTCod_Visible), 5, 0), true);
      edtAlcDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlcDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivCod_Visible), 5, 0), true);
      edtAlcDivAbr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlcDivAbr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivAbr_Visible), 5, 0), true);
      edtTrnNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), true);
      edtCliNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV14Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoComercialv02" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_45_1AU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedalcdomenv_Internalname, tblTablemergedalcdomenv_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlcDomEnv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlcDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDomEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlcDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01DocumentoComercialv02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_45_1AU2e( true) ;
      }
      else
      {
         wb_table1_45_1AU2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A14AlbComCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
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
      pa1AU2( ) ;
      ws1AU2( ) ;
      we1AU2( ) ;
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
      sCtrlA14AlbComCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1AU2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "documentocomercialv01documentocomercialv02", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1AU2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A14AlbComCod != wcpOA14AlbComCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA14AlbComCod = A14AlbComCod ;
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
      sCtrlA14AlbComCod = httpContext.cgiGet( sPrefix+"A14AlbComCod_CTRL") ;
      if ( GXutil.len( sCtrlA14AlbComCod) > 0 )
      {
         A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA14AlbComCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      else
      {
         A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A14AlbComCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1AU2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1AU2( ) ;
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
      ws1AU2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14AlbComCod_PARM", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA14AlbComCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14AlbComCod_CTRL", GXutil.rtrim( sCtrlA14AlbComCod));
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
      we1AU2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211682617", true, true);
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
      httpContext.AddJavascriptSource("documentocomercialv01documentocomercialv02.js", "?20268211682617", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbComCod_Internalname = sPrefix+"ALBCOMCOD" ;
      edtAlbComFch_Internalname = sPrefix+"ALBCOMFCH" ;
      cmbAlbComPri.setInternalname( sPrefix+"ALBCOMPRI" );
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      lblTextblockalcdomenv_Internalname = sPrefix+"TEXTBLOCKALCDOMENV" ;
      edtAlcDomEnv_Internalname = sPrefix+"ALCDOMENV" ;
      tblTablemergedalcdomenv_Internalname = sPrefix+"TABLEMERGEDALCDOMENV" ;
      divTablesplittedalcdomenv_Internalname = sPrefix+"TABLESPLITTEDALCDOMENV" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD" ;
      edtAlbComMat_Internalname = sPrefix+"ALBCOMMAT" ;
      edtAlbComHor_Internalname = sPrefix+"ALBCOMHOR" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtfindDomEnv_Internalname = sPrefix+"FINDDOMENV" ;
      edtAlbComFs_Internalname = sPrefix+"ALBCOMFS" ;
      edtAlbComFd_Internalname = sPrefix+"ALBCOMFD" ;
      edtAlbComFdD_Internalname = sPrefix+"ALBCOMFDD" ;
      edtAlbCSec_Internalname = sPrefix+"ALBCSEC" ;
      edtAlbComSt_Internalname = sPrefix+"ALBCOMST" ;
      edtAlbComEAT_Internalname = sPrefix+"ALBCOMEAT" ;
      edtAlbComID_Internalname = sPrefix+"ALBCOMID" ;
      edtAlbComAT_Internalname = sPrefix+"ALBCOMAT" ;
      edtAlcIvaCod_Internalname = sPrefix+"ALCIVACOD" ;
      edtAlbCTrNm_Internalname = sPrefix+"ALBCTRNM" ;
      edtAlbCTrDm_Internalname = sPrefix+"ALBCTRDM" ;
      edtAlbCTrNc_Internalname = sPrefix+"ALBCTRNC" ;
      edtCliDivTra_Internalname = sPrefix+"CLIDIVTRA" ;
      edtCliDivCod_Internalname = sPrefix+"CLIDIVCOD" ;
      edtAlbComImp_Internalname = sPrefix+"ALBCOMIMP" ;
      edtAlbComEst_Internalname = sPrefix+"ALBCOMEST" ;
      edtAlbComLiC_Internalname = sPrefix+"ALBCOMLIC" ;
      edtAlbComEso_Internalname = sPrefix+"ALBCOMESO" ;
      edtAlcDivTCod_Internalname = sPrefix+"ALCDIVTCOD" ;
      edtAlcDivCod_Internalname = sPrefix+"ALCDIVCOD" ;
      edtAlcDivAbr_Internalname = sPrefix+"ALCDIVABR" ;
      edtTrnNom_Internalname = sPrefix+"TRNNOM" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
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
      edtAlcDomEnv_Jsonclick = "" ;
      edtAlcDomEnv_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Visible = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Visible = 1 ;
      edtAlcDivAbr_Jsonclick = "" ;
      edtAlcDivAbr_Visible = 1 ;
      edtAlcDivCod_Jsonclick = "" ;
      edtAlcDivCod_Visible = 1 ;
      edtAlcDivTCod_Jsonclick = "" ;
      edtAlcDivTCod_Visible = 1 ;
      edtAlbComEso_Jsonclick = "" ;
      edtAlbComEso_Visible = 1 ;
      edtAlbComLiC_Jsonclick = "" ;
      edtAlbComLiC_Visible = 1 ;
      edtAlbComEst_Jsonclick = "" ;
      edtAlbComEst_Visible = 1 ;
      edtAlbComImp_Jsonclick = "" ;
      edtAlbComImp_Visible = 1 ;
      edtCliDivCod_Jsonclick = "" ;
      edtCliDivCod_Visible = 1 ;
      edtCliDivTra_Jsonclick = "" ;
      edtCliDivTra_Visible = 1 ;
      edtAlbCTrNc_Jsonclick = "" ;
      edtAlbCTrNc_Visible = 1 ;
      edtAlbCTrDm_Jsonclick = "" ;
      edtAlbCTrDm_Visible = 1 ;
      edtAlbCTrNm_Jsonclick = "" ;
      edtAlbCTrNm_Visible = 1 ;
      edtAlcIvaCod_Jsonclick = "" ;
      edtAlcIvaCod_Visible = 1 ;
      edtAlbComAT_Jsonclick = "" ;
      edtAlbComAT_Visible = 1 ;
      edtAlbComID_Jsonclick = "" ;
      edtAlbComID_Visible = 1 ;
      edtAlbComEAT_Jsonclick = "" ;
      edtAlbComEAT_Visible = 1 ;
      edtAlbComSt_Jsonclick = "" ;
      edtAlbComSt_Visible = 1 ;
      edtAlbCSec_Jsonclick = "" ;
      edtAlbCSec_Visible = 1 ;
      edtAlbComFdD_Visible = 1 ;
      edtAlbComFd_Visible = 1 ;
      edtAlbComFs_Jsonclick = "" ;
      edtAlbComFs_Visible = 1 ;
      edtfindDomEnv_Jsonclick = "" ;
      edtfindDomEnv_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtAlbComHor_Jsonclick = "" ;
      edtAlbComHor_Enabled = 0 ;
      edtAlbComMat_Jsonclick = "" ;
      edtAlbComMat_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      cmbAlbComPri.setJsonclick( "" );
      cmbAlbComPri.setEnabled( 0 );
      edtAlbComFch_Jsonclick = "" ;
      edtAlbComFch_Link = "" ;
      edtAlbComFch_Enabled = 0 ;
      edtAlbComCod_Jsonclick = "" ;
      edtAlbComCod_Enabled = 0 ;
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
      cmbAlbComPri.setName( "ALBCOMPRI" );
      cmbAlbComPri.setWebtags( "" );
      cmbAlbComPri.addItem("1", "1", (short)(0));
      cmbAlbComPri.addItem("0", "0", (short)(0));
      if ( cmbAlbComPri.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV11AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true},{av:'AV14Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111AU1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV11AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121AU1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV11AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMCOD","{handler:'valid_Albcomcod',iparms:[]");
      setEventMetadata("VALID_ALBCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALCDOMENV","{handler:'valid_Alcdomenv',iparms:[]");
      setEventMetadata("VALID_ALCDOMENV",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALCDIVCOD","{handler:'valid_Alcdivcod',iparms:[]");
      setEventMetadata("VALID_ALCDIVCOD",",oparms:[]}");
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
      A13735CliCNom = "" ;
      A13738TrnCNom = "" ;
      h252CliCod = "" ;
      h840TrnCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11AlbComPri = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV14Pgmname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A17AlbComFch = GXutil.nullDate() ;
      A22AlbComPri = "" ;
      lblTextblockalcdomenv_Jsonclick = "" ;
      A4830AlbComMat = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      A3094AlbCSec = "" ;
      A10738AlbComSt = "" ;
      A10740AlbComID = "" ;
      A10764AlbComAT = "" ;
      A5143AlcIvaCod = "" ;
      A11719AlbCTrNm = "" ;
      A11720AlbCTrDm = "" ;
      A11721AlbCTrNc = "" ;
      A3091CliDivTra = "" ;
      A18AlbComImp = DecimalUtil.ZERO ;
      A3095AlcDivTCod = "" ;
      A3112AlcDivAbr = "" ;
      A841TrnNom = "" ;
      A279CliNom = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13735CliCNom = "" ;
      H01AU2_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      H01AU3_A13738TrnCNom = new String[] {""} ;
      H01AU4_A13735CliCNom = new String[] {""} ;
      H01AU4_A396EmprCod = new String[] {""} ;
      H01AU4_A252CliCod = new int[1] ;
      H01AU5_A13738TrnCNom = new String[] {""} ;
      H01AU5_A396EmprCod = new String[] {""} ;
      H01AU5_A840TrnCod = new short[1] ;
      H01AU5_n840TrnCod = new boolean[] {false} ;
      H01AU7_A266CliEnvLin = new byte[1] ;
      H01AU7_A396EmprCod = new String[] {""} ;
      H01AU7_A14AlbComCod = new int[1] ;
      H01AU7_A279CliNom = new String[] {""} ;
      H01AU7_A841TrnNom = new String[] {""} ;
      H01AU7_n841TrnNom = new boolean[] {false} ;
      H01AU7_A3112AlcDivAbr = new String[] {""} ;
      H01AU7_n3112AlcDivAbr = new boolean[] {false} ;
      H01AU7_A3111AlcDivCod = new byte[1] ;
      H01AU7_A3095AlcDivTCod = new String[] {""} ;
      H01AU7_A1783AlbComEso = new byte[1] ;
      H01AU7_A19AlbComLiC = new short[1] ;
      H01AU7_A16AlbComEst = new byte[1] ;
      H01AU7_A3140CliDivCod = new byte[1] ;
      H01AU7_n3140CliDivCod = new boolean[] {false} ;
      H01AU7_A3091CliDivTra = new String[] {""} ;
      H01AU7_n3091CliDivTra = new boolean[] {false} ;
      H01AU7_A11721AlbCTrNc = new String[] {""} ;
      H01AU7_A11720AlbCTrDm = new String[] {""} ;
      H01AU7_A11719AlbCTrNm = new String[] {""} ;
      H01AU7_A5143AlcIvaCod = new String[] {""} ;
      H01AU7_A10764AlbComAT = new String[] {""} ;
      H01AU7_A10740AlbComID = new String[] {""} ;
      H01AU7_A10739AlbComEAT = new byte[1] ;
      H01AU7_A10738AlbComSt = new String[] {""} ;
      H01AU7_A3094AlbCSec = new String[] {""} ;
      H01AU7_A10015AlbComFdD = new String[] {""} ;
      H01AU7_A10014AlbComFd = new String[] {""} ;
      H01AU7_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      H01AU7_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01AU7_A4830AlbComMat = new String[] {""} ;
      H01AU7_A840TrnCod = new short[1] ;
      H01AU7_n840TrnCod = new boolean[] {false} ;
      H01AU7_A5142AlcDomEnv = new byte[1] ;
      H01AU7_A252CliCod = new int[1] ;
      H01AU7_A22AlbComPri = new String[] {""} ;
      H01AU7_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01AU7_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01AU7_n18AlbComImp = new boolean[] {false} ;
      H01AU7_A13739findDomEnv = new byte[1] ;
      H01AU7_n13739findDomEnv = new boolean[] {false} ;
      H01AU8_A13735CliCNom = new String[] {""} ;
      H01AU8_A396EmprCod = new String[] {""} ;
      H01AU8_A252CliCod = new int[1] ;
      H01AU9_A13738TrnCNom = new String[] {""} ;
      H01AU9_A396EmprCod = new String[] {""} ;
      H01AU9_A840TrnCod = new short[1] ;
      H01AU9_n840TrnCod = new boolean[] {false} ;
      H01AU11_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01AU11_n18AlbComImp = new boolean[] {false} ;
      H01AU12_A13735CliCNom = new String[] {""} ;
      H01AU12_A396EmprCod = new String[] {""} ;
      H01AU12_A252CliCod = new int[1] ;
      H01AU13_A13738TrnCNom = new String[] {""} ;
      H01AU13_A396EmprCod = new String[] {""} ;
      H01AU13_A840TrnCod = new short[1] ;
      H01AU13_n840TrnCod = new boolean[] {false} ;
      hsh = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA14AlbComCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01documentocomercialv02__default(),
         new Object[] {
             new Object[] {
            H01AU2_A13735CliCNom
            }
            , new Object[] {
            H01AU3_A13738TrnCNom
            }
            , new Object[] {
            H01AU4_A13735CliCNom, H01AU4_A396EmprCod, H01AU4_A252CliCod
            }
            , new Object[] {
            H01AU5_A13738TrnCNom, H01AU5_A396EmprCod, H01AU5_A840TrnCod
            }
            , new Object[] {
            H01AU7_A266CliEnvLin, H01AU7_A396EmprCod, H01AU7_A14AlbComCod, H01AU7_A279CliNom, H01AU7_A841TrnNom, H01AU7_n841TrnNom, H01AU7_A3112AlcDivAbr, H01AU7_n3112AlcDivAbr, H01AU7_A3111AlcDivCod, H01AU7_A3095AlcDivTCod,
            H01AU7_A1783AlbComEso, H01AU7_A19AlbComLiC, H01AU7_A16AlbComEst, H01AU7_A3140CliDivCod, H01AU7_n3140CliDivCod, H01AU7_A3091CliDivTra, H01AU7_n3091CliDivTra, H01AU7_A11721AlbCTrNc, H01AU7_A11720AlbCTrDm, H01AU7_A11719AlbCTrNm,
            H01AU7_A5143AlcIvaCod, H01AU7_A10764AlbComAT, H01AU7_A10740AlbComID, H01AU7_A10739AlbComEAT, H01AU7_A10738AlbComSt, H01AU7_A3094AlbCSec, H01AU7_A10015AlbComFdD, H01AU7_A10014AlbComFd, H01AU7_A10013AlbComFs, H01AU7_A4829AlbComHor,
            H01AU7_A4830AlbComMat, H01AU7_A840TrnCod, H01AU7_n840TrnCod, H01AU7_A5142AlcDomEnv, H01AU7_A252CliCod, H01AU7_A22AlbComPri, H01AU7_A17AlbComFch, H01AU7_A18AlbComImp, H01AU7_n18AlbComImp, H01AU7_A13739findDomEnv,
            H01AU7_n13739findDomEnv
            }
            , new Object[] {
            H01AU8_A13735CliCNom, H01AU8_A396EmprCod, H01AU8_A252CliCod
            }
            , new Object[] {
            H01AU9_A13738TrnCNom, H01AU9_A396EmprCod, H01AU9_A840TrnCod
            }
            , new Object[] {
            H01AU11_A18AlbComImp, H01AU11_n18AlbComImp
            }
            , new Object[] {
            H01AU12_A13735CliCNom, H01AU12_A396EmprCod, H01AU12_A252CliCod
            }
            , new Object[] {
            H01AU13_A13738TrnCNom, H01AU13_A396EmprCod, H01AU13_A840TrnCod
            }
         }
      );
      AV14Pgmname = "DocumentoComercialv01DocumentoComercialv02" ;
      /* GeneXus formulas. */
      AV14Pgmname = "DocumentoComercialv01DocumentoComercialv02" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A13739findDomEnv ;
   private byte A10739AlbComEAT ;
   private byte A3140CliDivCod ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte A3111AlcDivCod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte A5142AlcDomEnv ;
   private byte nGXWrapped ;
   private short A840TrnCod ;
   private short wbEnd ;
   private short wbStart ;
   private short A19AlbComLiC ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA14AlbComCod ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int edtAlbComCod_Enabled ;
   private int edtAlbComFch_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbComMat_Enabled ;
   private int edtAlbComHor_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtfindDomEnv_Visible ;
   private int edtAlbComFs_Visible ;
   private int edtAlbComFd_Visible ;
   private int edtAlbComFdD_Visible ;
   private int edtAlbCSec_Visible ;
   private int edtAlbComSt_Visible ;
   private int edtAlbComEAT_Visible ;
   private int edtAlbComID_Visible ;
   private int edtAlbComAT_Visible ;
   private int edtAlcIvaCod_Visible ;
   private int edtAlbCTrNm_Visible ;
   private int edtAlbCTrDm_Visible ;
   private int edtAlbCTrNc_Visible ;
   private int edtCliDivTra_Visible ;
   private int edtCliDivCod_Visible ;
   private int edtAlbComImp_Visible ;
   private int edtAlbComEst_Visible ;
   private int edtAlbComLiC_Visible ;
   private int edtAlbComEso_Visible ;
   private int edtAlcDivTCod_Visible ;
   private int edtAlcDivCod_Visible ;
   private int edtAlcDivAbr_Visible ;
   private int edtTrnNom_Visible ;
   private int edtCliNom_Visible ;
   private int gxdynajaxindex ;
   private int edtAlcDomEnv_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A18AlbComImp ;
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
   private String AV11AlbComPri ;
   private String GXKey ;
   private String AV14Pgmname ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtAlbComCod_Internalname ;
   private String edtAlbComCod_Jsonclick ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComFch_Link ;
   private String edtAlbComFch_Jsonclick ;
   private String A22AlbComPri ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divTablesplittedalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbComMat_Internalname ;
   private String A4830AlbComMat ;
   private String edtAlbComMat_Jsonclick ;
   private String edtAlbComHor_Internalname ;
   private String edtAlbComHor_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtfindDomEnv_Internalname ;
   private String edtfindDomEnv_Jsonclick ;
   private String edtAlbComFs_Internalname ;
   private String edtAlbComFs_Jsonclick ;
   private String edtAlbComFd_Internalname ;
   private String A10014AlbComFd ;
   private String edtAlbComFdD_Internalname ;
   private String A10015AlbComFdD ;
   private String edtAlbCSec_Internalname ;
   private String A3094AlbCSec ;
   private String edtAlbCSec_Jsonclick ;
   private String edtAlbComSt_Internalname ;
   private String A10738AlbComSt ;
   private String edtAlbComSt_Jsonclick ;
   private String edtAlbComEAT_Internalname ;
   private String edtAlbComEAT_Jsonclick ;
   private String edtAlbComID_Internalname ;
   private String A10740AlbComID ;
   private String edtAlbComID_Jsonclick ;
   private String edtAlbComAT_Internalname ;
   private String A10764AlbComAT ;
   private String edtAlbComAT_Jsonclick ;
   private String edtAlcIvaCod_Internalname ;
   private String A5143AlcIvaCod ;
   private String edtAlcIvaCod_Jsonclick ;
   private String edtAlbCTrNm_Internalname ;
   private String A11719AlbCTrNm ;
   private String edtAlbCTrNm_Jsonclick ;
   private String edtAlbCTrDm_Internalname ;
   private String A11720AlbCTrDm ;
   private String edtAlbCTrDm_Jsonclick ;
   private String edtAlbCTrNc_Internalname ;
   private String A11721AlbCTrNc ;
   private String edtAlbCTrNc_Jsonclick ;
   private String edtCliDivTra_Internalname ;
   private String A3091CliDivTra ;
   private String edtCliDivTra_Jsonclick ;
   private String edtCliDivCod_Internalname ;
   private String edtCliDivCod_Jsonclick ;
   private String edtAlbComImp_Internalname ;
   private String edtAlbComImp_Jsonclick ;
   private String edtAlbComEst_Internalname ;
   private String edtAlbComEst_Jsonclick ;
   private String edtAlbComLiC_Internalname ;
   private String edtAlbComLiC_Jsonclick ;
   private String edtAlbComEso_Internalname ;
   private String edtAlbComEso_Jsonclick ;
   private String edtAlcDivTCod_Internalname ;
   private String A3095AlcDivTCod ;
   private String edtAlcDivTCod_Jsonclick ;
   private String edtAlcDivCod_Internalname ;
   private String edtAlcDivCod_Jsonclick ;
   private String edtAlcDivAbr_Internalname ;
   private String A3112AlcDivAbr ;
   private String edtAlcDivAbr_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtAlcDomEnv_Internalname ;
   private String hsh ;
   private String sStyleString ;
   private String tblTablemergedalcdomenv_Internalname ;
   private String edtAlcDomEnv_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA14AlbComCod ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date A17AlbComFch ;
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
   private boolean n840TrnCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n841TrnNom ;
   private boolean n3112AlcDivAbr ;
   private boolean n3140CliDivCod ;
   private boolean n3091CliDivTra ;
   private boolean n18AlbComImp ;
   private boolean n13739findDomEnv ;
   private boolean returnInSub ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h252CliCod ;
   private String h840TrnCod ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbComPri ;
   private IDataStoreProvider pr_default ;
   private String[] H01AU2_A13735CliCNom ;
   private String[] H01AU3_A13738TrnCNom ;
   private String[] H01AU4_A13735CliCNom ;
   private String[] H01AU4_A396EmprCod ;
   private int[] H01AU4_A252CliCod ;
   private String[] H01AU5_A13738TrnCNom ;
   private String[] H01AU5_A396EmprCod ;
   private short[] H01AU5_A840TrnCod ;
   private boolean[] H01AU5_n840TrnCod ;
   private byte[] H01AU7_A266CliEnvLin ;
   private String[] H01AU7_A396EmprCod ;
   private int[] H01AU7_A14AlbComCod ;
   private String[] H01AU7_A279CliNom ;
   private String[] H01AU7_A841TrnNom ;
   private boolean[] H01AU7_n841TrnNom ;
   private String[] H01AU7_A3112AlcDivAbr ;
   private boolean[] H01AU7_n3112AlcDivAbr ;
   private byte[] H01AU7_A3111AlcDivCod ;
   private String[] H01AU7_A3095AlcDivTCod ;
   private byte[] H01AU7_A1783AlbComEso ;
   private short[] H01AU7_A19AlbComLiC ;
   private byte[] H01AU7_A16AlbComEst ;
   private byte[] H01AU7_A3140CliDivCod ;
   private boolean[] H01AU7_n3140CliDivCod ;
   private String[] H01AU7_A3091CliDivTra ;
   private boolean[] H01AU7_n3091CliDivTra ;
   private String[] H01AU7_A11721AlbCTrNc ;
   private String[] H01AU7_A11720AlbCTrDm ;
   private String[] H01AU7_A11719AlbCTrNm ;
   private String[] H01AU7_A5143AlcIvaCod ;
   private String[] H01AU7_A10764AlbComAT ;
   private String[] H01AU7_A10740AlbComID ;
   private byte[] H01AU7_A10739AlbComEAT ;
   private String[] H01AU7_A10738AlbComSt ;
   private String[] H01AU7_A3094AlbCSec ;
   private String[] H01AU7_A10015AlbComFdD ;
   private String[] H01AU7_A10014AlbComFd ;
   private java.util.Date[] H01AU7_A10013AlbComFs ;
   private java.util.Date[] H01AU7_A4829AlbComHor ;
   private String[] H01AU7_A4830AlbComMat ;
   private short[] H01AU7_A840TrnCod ;
   private boolean[] H01AU7_n840TrnCod ;
   private byte[] H01AU7_A5142AlcDomEnv ;
   private int[] H01AU7_A252CliCod ;
   private String[] H01AU7_A22AlbComPri ;
   private java.util.Date[] H01AU7_A17AlbComFch ;
   private java.math.BigDecimal[] H01AU7_A18AlbComImp ;
   private boolean[] H01AU7_n18AlbComImp ;
   private byte[] H01AU7_A13739findDomEnv ;
   private boolean[] H01AU7_n13739findDomEnv ;
   private String[] H01AU8_A13735CliCNom ;
   private String[] H01AU8_A396EmprCod ;
   private int[] H01AU8_A252CliCod ;
   private String[] H01AU9_A13738TrnCNom ;
   private String[] H01AU9_A396EmprCod ;
   private short[] H01AU9_A840TrnCod ;
   private boolean[] H01AU9_n840TrnCod ;
   private java.math.BigDecimal[] H01AU11_A18AlbComImp ;
   private boolean[] H01AU11_n18AlbComImp ;
   private String[] H01AU12_A13735CliCNom ;
   private String[] H01AU12_A396EmprCod ;
   private int[] H01AU12_A252CliCod ;
   private String[] H01AU13_A13738TrnCNom ;
   private String[] H01AU13_A396EmprCod ;
   private short[] H01AU13_A840TrnCod ;
   private boolean[] H01AU13_n840TrnCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class documentocomercialv01documentocomercialv02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01AU2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AU3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AU4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AU5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AU7", "SELECT T5.CliEnvLin, T1.EmprCod, T1.AlbComCod, T3.CliNom, T4.TrnNom, T2.DivAbr AS AlcDivAbr, T1.AlcDivCod AS AlcDivCod, T1.AlcDivTCod, T1.AlbComEso, T1.AlbComLiC, T1.AlbComEst, T3.CliDivCod, T3.CliDivTra, T1.AlbCTrNc, T1.AlbCTrDm, T1.AlbCTrNm, T1.AlcIvaCod, T1.AlbComAT, T1.AlbComID, T1.AlbComEAT, T1.AlbComSt, T1.AlbCSec, T1.AlbComFdD, T1.AlbComFd, T1.AlbComFs, T1.AlbComHor, T1.AlbComMat, T1.TrnCod, T1.AlcDomEnv, T1.CliCod, T1.AlbComPri, T1.AlbComFch, COALESCE( T6.AlbComImp, 0) AS AlbComImp, COALESCE( T5.CliEnvLin, 0) AS findDomEnv FROM (((((TXPCALCOM T1 INNER JOIN TXPDIVISA T2 ON T2.DivCod = T1.AlcDivCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.CliEnvLin = T1.AlcDomEnv) LEFT JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T6 ON T6.EmprCod = T1.EmprCod AND T6.AlbComCod = T1.AlbComCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AU8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AU9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AU11", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AU12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AU13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 20);
               ((String[]) buf[18])[0] = rslt.getString(15, 60);
               ((String[]) buf[19])[0] = rslt.getString(16, 60);
               ((String[]) buf[20])[0] = rslt.getString(17, 3);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               ((String[]) buf[25])[0] = rslt.getString(22, 1);
               ((String[]) buf[26])[0] = rslt.getString(23, 200);
               ((String[]) buf[27])[0] = rslt.getString(24, 200);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(25);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 20);
               ((short[]) buf[31])[0] = rslt.getShort(28);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(29);
               ((int[]) buf[34])[0] = rslt.getInt(30);
               ((String[]) buf[35])[0] = rslt.getString(31, 1);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(32);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(34);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

