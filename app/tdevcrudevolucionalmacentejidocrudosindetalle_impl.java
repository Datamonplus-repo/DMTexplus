package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevcrudevolucionalmacentejidocrudosindetalle_impl extends GXWebComponent
{
   public tdevcrudevolucionalmacentejidocrudosindetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevcrudevolucionalmacentejidocrudosindetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevcrudevolucionalmacentejidocrudosindetalle_impl.class ));
   }

   public tdevcrudevolucionalmacentejidocrudosindetalle_impl( int remoteHandle ,
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
               A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A11669DevCruId)});
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
               gxsgaclicod1AI0( A396EmprCod, A13735CliCNom) ;
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
               gxsgatrncod1AI0( A396EmprCod, A13738TrnCNom) ;
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
               gxsgaclicod1AI0( A396EmprCod, A13735CliCNom) ;
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
               gxhcaclicod1AI2( A396EmprCod, h252CliCod) ;
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
               gxsgatrncod1AI0( A396EmprCod, A13738TrnCNom) ;
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
               gxhcatrncod1AI2( A396EmprCod, h840TrnCod) ;
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
         pa1AI2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TDEVCRUDevolucion Almacen Tejido Crudosindetalle", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdevcrudevolucionalmacentejidocrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"EmprCod","DevCruId"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA11669DevCruId", GXutil.ltrim( localUtil.ntoc( wcpOA11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseForm1AI2( )
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
      return "TDEVCRUDevolucionAlmacenTejidoCrudosindetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TDEVCRUDevolucion Almacen Tejido Crudosindetalle", "") ;
   }

   public void wb1AI0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tdevcrudevolucionalmacentejidocrudosindetalle");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDevCruId_Internalname, httpContext.getMessage( "Devolucion Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruId_Internalname, GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruId_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDevCruFec_Internalname, httpContext.getMessage( "Fecha Devolucion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDevCruFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFec_Internalname, localUtil.format(A11670DevCruFec, "99/99/99"), localUtil.format( A11670DevCruFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDevCruFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruSal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDevCruSal_Internalname, httpContext.getMessage( "Fecha-Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDevCruSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruSal_Internalname, localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11673DevCruSal, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDevCruSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, h252CliCod, GXutil.rtrim( localUtil.format( h252CliCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDevCruMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruMat_Internalname, GXutil.rtrim( A11672DevCruMat), GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDevCruObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtDevCruObs_Internalname, A11682DevCruObs, "", "", (short)(0), 1, edtDevCruObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableinvisible_Internalname, divTransactiondetail_tableinvisible_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavError_confirmacion_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavError_confirmacion_Internalname, GXutil.ltrim( localUtil.ntoc( AV11Error_confirmacion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavError_confirmacion_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11Error_confirmacion), "9") : localUtil.format( DecimalUtil.doubleToDec(AV11Error_confirmacion), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavError_confirmacion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavError_confirmacion_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111ai1_client"+"'", TempTags, "", 2, "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121ai1_client"+"'", TempTags, "", 2, "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEst_Internalname, GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEst_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruEst_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtDevCruHash_Internalname, GXutil.rtrim( A11674DevCruHash), "", "", (short)(0), edtDevCruHash_Visible, 0, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtDevCruDesc_Internalname, GXutil.rtrim( A11675DevCruDesc), "", "", (short)(0), edtDevCruDesc_Visible, 0, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDevCruDtSy_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruDtSy_Internalname, localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruDtSy_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruDtSy_Visible, 0, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDevCruDtSy_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtDevCruDtSy_Visible==0)||(0==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruGros_Internalname, GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruGros_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruGros_Visible, 0, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruStt_Internalname, GXutil.rtrim( A11678DevCruStt), GXutil.rtrim( localUtil.format( A11678DevCruStt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruStt_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruStt_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEnvA_Internalname, GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEnvA_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruEnvA_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAtId_Internalname, GXutil.rtrim( A11680DevCruAtId), GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAtId_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruAtId_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAT_Internalname, GXutil.rtrim( A11681DevCruAT), GXutil.rtrim( localUtil.format( A11681DevCruAT, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAT_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruAT_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCRUDevolucionAlmacenTejidoCrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1AI2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TDEVCRUDevolucion Almacen Tejido Crudosindetalle", ""), (short)(0)) ;
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
            strup1AI0( ) ;
         }
      }
   }

   public void ws1AI2( )
   {
      start1AI2( ) ;
      evt1AI2( ) ;
   }

   public void evt1AI2( )
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
                              strup1AI0( ) ;
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
                              strup1AI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131AI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1AI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141AI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1AI0( ) ;
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
                              strup1AI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavError_confirmacion_Internalname ;
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

   public void we1AI2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1AI2( ) ;
         }
      }
   }

   public void pa1AI2( )
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
            GX_FocusControl = edtavError_confirmacion_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgaclicod1AI0( String A396EmprCod ,
                                String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_data1AI0( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaclicod_data1AI0( String A396EmprCod ,
                                        String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H01AI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01AI2_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(H01AI2_A13735CliCNom[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgatrncod1AI0( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1AI0( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_data1AI0( String A396EmprCod ,
                                        String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor H01AI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H01AI3_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(H01AI3_A13738TrnCNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcaclicod1AI2( String A396EmprCod ,
                                String A13735CliCNom )
   {
      /* Using cursor H01AI4 */
      pr_default.execute(2, new Object[] {A13735CliCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = H01AI4_A13735CliCNom[0] ;
         A396EmprCod = H01AI4_A396EmprCod[0] ;
         A252CliCod = H01AI4_A252CliCod[0] ;
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

   public void gxhcatrncod1AI2( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      /* Using cursor H01AI5 */
      pr_default.execute(3, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = H01AI5_A13738TrnCNom[0] ;
         A396EmprCod = H01AI5_A396EmprCod[0] ;
         A840TrnCod = H01AI5_A840TrnCod[0] ;
         n840TrnCod = H01AI5_n840TrnCod[0] ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1AI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV18Pgmname = "TDEVCRUDevolucionAlmacenTejidoCrudosindetalle" ;
      Gx_err = (short)(0) ;
      edtavError_confirmacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavError_confirmacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavError_confirmacion_Enabled), 5, 0), true);
   }

   public void rf1AI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01AI6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A11681DevCruAT = H01AI6_A11681DevCruAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11681DevCruAT", A11681DevCruAT);
            A11680DevCruAtId = H01AI6_A11680DevCruAtId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11680DevCruAtId", A11680DevCruAtId);
            A11679DevCruEnvA = H01AI6_A11679DevCruEnvA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
            A11678DevCruStt = H01AI6_A11678DevCruStt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11678DevCruStt", A11678DevCruStt);
            A11677DevCruGros = H01AI6_A11677DevCruGros[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
            A11676DevCruDtSy = H01AI6_A11676DevCruDtSy[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A11675DevCruDesc = H01AI6_A11675DevCruDesc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11675DevCruDesc", A11675DevCruDesc);
            A11674DevCruHash = H01AI6_A11674DevCruHash[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11674DevCruHash", A11674DevCruHash);
            A11671DevCruEst = H01AI6_A11671DevCruEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
            A11682DevCruObs = H01AI6_A11682DevCruObs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11682DevCruObs", A11682DevCruObs);
            A11672DevCruMat = H01AI6_A11672DevCruMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11672DevCruMat", A11672DevCruMat);
            A840TrnCod = H01AI6_A840TrnCod[0] ;
            n840TrnCod = H01AI6_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A252CliCod = H01AI6_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A11673DevCruSal = H01AI6_A11673DevCruSal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A11670DevCruFec = H01AI6_A11670DevCruFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            if ( (GXutil.strcmp("", h252CliCod)==0) )
            {
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A13735CliCNom = h252CliCod ;
               /* Using cursor H01AI7 */
               pr_default.execute(5, new Object[] {A13735CliCNom, A396EmprCod});
               A252CliCod = H01AI7_A252CliCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A252CliCod = H01AI7_A252CliCod[0] ;
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
               /* Using cursor H01AI8 */
               pr_default.execute(6, new Object[] {A13738TrnCNom, A396EmprCod});
               A840TrnCod = H01AI8_A840TrnCod[0] ;
               n840TrnCod = H01AI8_n840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               A840TrnCod = H01AI8_A840TrnCod[0] ;
               n840TrnCod = H01AI8_n840TrnCod[0] ;
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
            e141AI2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         wb1AI0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1AI2( )
   {
   }

   public void before_start_formulas( )
   {
      AV18Pgmname = "TDEVCRUDevolucionAlmacenTejidoCrudosindetalle" ;
      Gx_err = (short)(0) ;
      edtavError_confirmacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavError_confirmacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavError_confirmacion_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1AI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131AI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A11670DevCruFec = localUtil.ctod( httpContext.cgiGet( edtDevCruFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = h252CliCod ;
            /* Using cursor H01AI9 */
            pr_default.execute(7, new Object[] {A13735CliCNom, A396EmprCod});
            A252CliCod = H01AI9_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = H01AI9_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               pr_default.readNext(7);
               if ( ! ( (pr_default.getStatus(7) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               }
            }
            else
            {
            }
            pr_default.close(7);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h252CliCod", h252CliCod);
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
            /* Using cursor H01AI10 */
            pr_default.execute(8, new Object[] {A13738TrnCNom, A396EmprCod});
            A840TrnCod = H01AI10_A840TrnCod[0] ;
            n840TrnCod = H01AI10_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = H01AI10_A840TrnCod[0] ;
            n840TrnCod = H01AI10_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
         A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11672DevCruMat", A11672DevCruMat);
         A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11682DevCruObs", A11682DevCruObs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavError_confirmacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavError_confirmacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vERROR_CONFIRMACION");
            GX_FocusControl = edtavError_confirmacion_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11Error_confirmacion = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Error_confirmacion", GXutil.str( AV11Error_confirmacion, 1, 0));
         }
         else
         {
            AV11Error_confirmacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtavError_confirmacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Error_confirmacion", GXutil.str( AV11Error_confirmacion, 1, 0));
         }
         A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11674DevCruHash = httpContext.cgiGet( edtDevCruHash_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = httpContext.cgiGet( edtDevCruDesc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = httpContext.cgiGet( edtDevCruStt_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEnvA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = httpContext.cgiGet( edtDevCruAT_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11681DevCruAT", A11681DevCruAT);
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
      e131AI2 ();
      if (returnInSub) return;
   }

   public void e131AI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevcrudevolucionalmacentejidocrudosindetalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevcrudevolucionalmacentejidocrudosindetalle_impl.this.AV15Emprcod = GXv_char2[0] ;
      tdevcrudevolucionalmacentejidocrudosindetalle_impl.this.AV16Emprnom = GXv_char3[0] ;
      tdevcrudevolucionalmacentejidocrudosindetalle_impl.this.AV17Usurcod = GXv_char4[0] ;
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

   protected void e141AI2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtDevCruEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEst_Visible), 5, 0), true);
      edtDevCruHash_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruHash_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruHash_Visible), 5, 0), true);
      edtDevCruDesc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruDesc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDesc_Visible), 5, 0), true);
      edtDevCruDtSy_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruDtSy_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Visible), 5, 0), true);
      edtDevCruGros_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruGros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruGros_Visible), 5, 0), true);
      edtDevCruStt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruStt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruStt_Visible), 5, 0), true);
      edtDevCruEnvA_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruEnvA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEnvA_Visible), 5, 0), true);
      edtDevCruAtId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruAtId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Visible), 5, 0), true);
      edtDevCruAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAT_Visible), 5, 0), true);
      divTransactiondetail_tableinvisible_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTransactiondetail_tableinvisible_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTransactiondetail_tableinvisible_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV18Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DevolucionAlmacenTejidoCrudosindetalle" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A11669DevCruId = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
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
      pa1AI2( ) ;
      ws1AI2( ) ;
      we1AI2( ) ;
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
      sCtrlA11669DevCruId = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1AI2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tdevcrudevolucionalmacentejidocrudosindetalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1AI2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A11669DevCruId != wcpOA11669DevCruId ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA11669DevCruId = A11669DevCruId ;
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
      sCtrlA11669DevCruId = httpContext.cgiGet( sPrefix+"A11669DevCruId_CTRL") ;
      if ( GXutil.len( sCtrlA11669DevCruId) > 0 )
      {
         A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA11669DevCruId), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      else
      {
         A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A11669DevCruId_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1AI2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1AI2( ) ;
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
      ws1AI2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A11669DevCruId_PARM", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA11669DevCruId)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A11669DevCruId_CTRL", GXutil.rtrim( sCtrlA11669DevCruId));
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
      we1AI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211681095", true, true);
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
      httpContext.AddJavascriptSource("tdevcrudevolucionalmacentejidocrudosindetalle.js", "?20268211681095", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtDevCruId_Internalname = sPrefix+"DEVCRUID" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtDevCruFec_Internalname = sPrefix+"DEVCRUFEC" ;
      edtDevCruSal_Internalname = sPrefix+"DEVCRUSAL" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD" ;
      edtDevCruMat_Internalname = sPrefix+"DEVCRUMAT" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtDevCruObs_Internalname = sPrefix+"DEVCRUOBS" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTransactiondetail_tableleaflevel_level1_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLELEAFLEVEL_LEVEL1" ;
      edtavError_confirmacion_Internalname = sPrefix+"vERROR_CONFIRMACION" ;
      divTransactiondetail_tableinvisible_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEINVISIBLE" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtDevCruEst_Internalname = sPrefix+"DEVCRUEST" ;
      edtDevCruHash_Internalname = sPrefix+"DEVCRUHASH" ;
      edtDevCruDesc_Internalname = sPrefix+"DEVCRUDESC" ;
      edtDevCruDtSy_Internalname = sPrefix+"DEVCRUDTSY" ;
      edtDevCruGros_Internalname = sPrefix+"DEVCRUGROS" ;
      edtDevCruStt_Internalname = sPrefix+"DEVCRUSTT" ;
      edtDevCruEnvA_Internalname = sPrefix+"DEVCRUENVA" ;
      edtDevCruAtId_Internalname = sPrefix+"DEVCRUATID" ;
      edtDevCruAT_Internalname = sPrefix+"DEVCRUAT" ;
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
      edtDevCruAT_Jsonclick = "" ;
      edtDevCruAT_Visible = 1 ;
      edtDevCruAtId_Jsonclick = "" ;
      edtDevCruAtId_Visible = 1 ;
      edtDevCruEnvA_Jsonclick = "" ;
      edtDevCruEnvA_Visible = 1 ;
      edtDevCruStt_Jsonclick = "" ;
      edtDevCruStt_Visible = 1 ;
      edtDevCruGros_Jsonclick = "" ;
      edtDevCruGros_Visible = 1 ;
      edtDevCruDtSy_Jsonclick = "" ;
      edtDevCruDtSy_Visible = 1 ;
      edtDevCruDesc_Visible = 1 ;
      edtDevCruHash_Visible = 1 ;
      edtDevCruEst_Jsonclick = "" ;
      edtDevCruEst_Visible = 1 ;
      edtavError_confirmacion_Jsonclick = "" ;
      edtavError_confirmacion_Enabled = 1 ;
      divTransactiondetail_tableinvisible_Visible = 1 ;
      edtDevCruObs_Enabled = 0 ;
      edtDevCruMat_Jsonclick = "" ;
      edtDevCruMat_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDevCruSal_Jsonclick = "" ;
      edtDevCruSal_Enabled = 0 ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruFec_Enabled = 0 ;
      edtDevCruId_Jsonclick = "" ;
      edtDevCruId_Enabled = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111AI1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121AI1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
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
      GXKey = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11672DevCruMat = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A11682DevCruObs = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11678DevCruStt = "" ;
      A11680DevCruAtId = "" ;
      A11681DevCruAT = "" ;
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
      H01AI2_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      H01AI3_A13738TrnCNom = new String[] {""} ;
      H01AI4_A13735CliCNom = new String[] {""} ;
      H01AI4_A396EmprCod = new String[] {""} ;
      H01AI4_A252CliCod = new int[1] ;
      H01AI5_A13738TrnCNom = new String[] {""} ;
      H01AI5_A396EmprCod = new String[] {""} ;
      H01AI5_A840TrnCod = new short[1] ;
      H01AI5_n840TrnCod = new boolean[] {false} ;
      AV18Pgmname = "" ;
      H01AI6_A396EmprCod = new String[] {""} ;
      H01AI6_A11669DevCruId = new int[1] ;
      H01AI6_A11681DevCruAT = new String[] {""} ;
      H01AI6_A11680DevCruAtId = new String[] {""} ;
      H01AI6_A11679DevCruEnvA = new byte[1] ;
      H01AI6_A11678DevCruStt = new String[] {""} ;
      H01AI6_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01AI6_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      H01AI6_A11675DevCruDesc = new String[] {""} ;
      H01AI6_A11674DevCruHash = new String[] {""} ;
      H01AI6_A11671DevCruEst = new byte[1] ;
      H01AI6_A11682DevCruObs = new String[] {""} ;
      H01AI6_A11672DevCruMat = new String[] {""} ;
      H01AI6_A840TrnCod = new short[1] ;
      H01AI6_n840TrnCod = new boolean[] {false} ;
      H01AI6_A252CliCod = new int[1] ;
      H01AI6_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01AI6_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01AI7_A13735CliCNom = new String[] {""} ;
      H01AI7_A396EmprCod = new String[] {""} ;
      H01AI7_A252CliCod = new int[1] ;
      H01AI8_A13738TrnCNom = new String[] {""} ;
      H01AI8_A396EmprCod = new String[] {""} ;
      H01AI8_A840TrnCod = new short[1] ;
      H01AI8_n840TrnCod = new boolean[] {false} ;
      H01AI9_A13735CliCNom = new String[] {""} ;
      H01AI9_A396EmprCod = new String[] {""} ;
      H01AI9_A252CliCod = new int[1] ;
      H01AI10_A13738TrnCNom = new String[] {""} ;
      H01AI10_A396EmprCod = new String[] {""} ;
      H01AI10_A840TrnCod = new short[1] ;
      H01AI10_n840TrnCod = new boolean[] {false} ;
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
      sCtrlA11669DevCruId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevcrudevolucionalmacentejidocrudosindetalle__default(),
         new Object[] {
             new Object[] {
            H01AI2_A13735CliCNom
            }
            , new Object[] {
            H01AI3_A13738TrnCNom
            }
            , new Object[] {
            H01AI4_A13735CliCNom, H01AI4_A396EmprCod, H01AI4_A252CliCod
            }
            , new Object[] {
            H01AI5_A13738TrnCNom, H01AI5_A396EmprCod, H01AI5_A840TrnCod
            }
            , new Object[] {
            H01AI6_A396EmprCod, H01AI6_A11669DevCruId, H01AI6_A11681DevCruAT, H01AI6_A11680DevCruAtId, H01AI6_A11679DevCruEnvA, H01AI6_A11678DevCruStt, H01AI6_A11677DevCruGros, H01AI6_A11676DevCruDtSy, H01AI6_A11675DevCruDesc, H01AI6_A11674DevCruHash,
            H01AI6_A11671DevCruEst, H01AI6_A11682DevCruObs, H01AI6_A11672DevCruMat, H01AI6_A840TrnCod, H01AI6_n840TrnCod, H01AI6_A252CliCod, H01AI6_A11673DevCruSal, H01AI6_A11670DevCruFec
            }
            , new Object[] {
            H01AI7_A13735CliCNom, H01AI7_A396EmprCod, H01AI7_A252CliCod
            }
            , new Object[] {
            H01AI8_A13738TrnCNom, H01AI8_A396EmprCod, H01AI8_A840TrnCod
            }
            , new Object[] {
            H01AI9_A13735CliCNom, H01AI9_A396EmprCod, H01AI9_A252CliCod
            }
            , new Object[] {
            H01AI10_A13738TrnCNom, H01AI10_A396EmprCod, H01AI10_A840TrnCod
            }
         }
      );
      AV18Pgmname = "TDEVCRUDevolucionAlmacenTejidoCrudosindetalle" ;
      /* GeneXus formulas. */
      AV18Pgmname = "TDEVCRUDevolucionAlmacenTejidoCrudosindetalle" ;
      Gx_err = (short)(0) ;
      edtavError_confirmacion_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV11Error_confirmacion ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A840TrnCod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA11669DevCruId ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int edtDevCruId_Enabled ;
   private int edtDevCruFec_Enabled ;
   private int edtDevCruSal_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtDevCruMat_Enabled ;
   private int edtDevCruObs_Enabled ;
   private int divTransactiondetail_tableinvisible_Visible ;
   private int edtavError_confirmacion_Enabled ;
   private int edtDevCruEst_Visible ;
   private int edtDevCruHash_Visible ;
   private int edtDevCruDesc_Visible ;
   private int edtDevCruDtSy_Visible ;
   private int edtDevCruGros_Visible ;
   private int edtDevCruStt_Visible ;
   private int edtDevCruEnvA_Visible ;
   private int edtDevCruAtId_Visible ;
   private int edtDevCruAT_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal A11677DevCruGros ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtDevCruId_Internalname ;
   private String edtDevCruId_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruFec_Jsonclick ;
   private String edtDevCruSal_Internalname ;
   private String edtDevCruSal_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtDevCruMat_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruObs_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTransactiondetail_tableleaflevel_level1_Internalname ;
   private String divTransactiondetail_tableinvisible_Internalname ;
   private String edtavError_confirmacion_Internalname ;
   private String TempTags ;
   private String edtavError_confirmacion_Jsonclick ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtDevCruEst_Internalname ;
   private String edtDevCruEst_Jsonclick ;
   private String edtDevCruHash_Internalname ;
   private String A11674DevCruHash ;
   private String edtDevCruDesc_Internalname ;
   private String A11675DevCruDesc ;
   private String edtDevCruDtSy_Internalname ;
   private String edtDevCruDtSy_Jsonclick ;
   private String edtDevCruGros_Internalname ;
   private String edtDevCruGros_Jsonclick ;
   private String edtDevCruStt_Internalname ;
   private String A11678DevCruStt ;
   private String edtDevCruStt_Jsonclick ;
   private String edtDevCruEnvA_Internalname ;
   private String edtDevCruEnvA_Jsonclick ;
   private String edtDevCruAtId_Internalname ;
   private String A11680DevCruAtId ;
   private String edtDevCruAtId_Jsonclick ;
   private String edtDevCruAT_Internalname ;
   private String A11681DevCruAT ;
   private String edtDevCruAT_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV18Pgmname ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15Emprcod ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA11669DevCruId ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date A11670DevCruFec ;
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
   private boolean returnInSub ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h252CliCod ;
   private String h840TrnCod ;
   private String A11682DevCruObs ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private IDataStoreProvider pr_default ;
   private String[] H01AI2_A13735CliCNom ;
   private String[] H01AI3_A13738TrnCNom ;
   private String[] H01AI4_A13735CliCNom ;
   private String[] H01AI4_A396EmprCod ;
   private int[] H01AI4_A252CliCod ;
   private String[] H01AI5_A13738TrnCNom ;
   private String[] H01AI5_A396EmprCod ;
   private short[] H01AI5_A840TrnCod ;
   private boolean[] H01AI5_n840TrnCod ;
   private String[] H01AI6_A396EmprCod ;
   private int[] H01AI6_A11669DevCruId ;
   private String[] H01AI6_A11681DevCruAT ;
   private String[] H01AI6_A11680DevCruAtId ;
   private byte[] H01AI6_A11679DevCruEnvA ;
   private String[] H01AI6_A11678DevCruStt ;
   private java.math.BigDecimal[] H01AI6_A11677DevCruGros ;
   private java.util.Date[] H01AI6_A11676DevCruDtSy ;
   private String[] H01AI6_A11675DevCruDesc ;
   private String[] H01AI6_A11674DevCruHash ;
   private byte[] H01AI6_A11671DevCruEst ;
   private String[] H01AI6_A11682DevCruObs ;
   private String[] H01AI6_A11672DevCruMat ;
   private short[] H01AI6_A840TrnCod ;
   private boolean[] H01AI6_n840TrnCod ;
   private int[] H01AI6_A252CliCod ;
   private java.util.Date[] H01AI6_A11673DevCruSal ;
   private java.util.Date[] H01AI6_A11670DevCruFec ;
   private String[] H01AI7_A13735CliCNom ;
   private String[] H01AI7_A396EmprCod ;
   private int[] H01AI7_A252CliCod ;
   private String[] H01AI8_A13738TrnCNom ;
   private String[] H01AI8_A396EmprCod ;
   private short[] H01AI8_A840TrnCod ;
   private boolean[] H01AI8_n840TrnCod ;
   private String[] H01AI9_A13735CliCNom ;
   private String[] H01AI9_A396EmprCod ;
   private int[] H01AI9_A252CliCod ;
   private String[] H01AI10_A13738TrnCNom ;
   private String[] H01AI10_A396EmprCod ;
   private short[] H01AI10_A840TrnCod ;
   private boolean[] H01AI10_n840TrnCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tdevcrudevolucionalmacentejidocrudosindetalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01AI2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AI3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AI4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AI5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01AI6", "SELECT EmprCod, DevCruId, DevCruAT, DevCruAtId, DevCruEnvA, DevCruStt, DevCruGros, DevCruDtSy, DevCruDesc, DevCruHash, DevCruEst, DevCruObs, DevCruMat, TrnCod, CliCod, DevCruSal, DevCruFec FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AI7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AI8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AI9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01AI10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 300);
               ((String[]) buf[9])[0] = rslt.getString(10, 200);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

