package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class modificacionloteproducto_wc_impl extends GXWebComponent
{
   public modificacionloteproducto_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public modificacionloteproducto_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( modificacionloteproducto_wc_impl.class ));
   }

   public modificacionloteproducto_wc_impl( int remoteHandle ,
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
               AV6PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
               AV7PrdNom = httpContext.GetPar( "PrdNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNom", AV7PrdNom);
               AV8PrdLotein = httpContext.GetPar( "PrdLotein") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdLotein", AV8PrdLotein);
               AV9PrdLoteFchin = localUtil.parseDateParm( httpContext.GetPar( "PrdLoteFchin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrdLoteFchin", localUtil.format(AV9PrdLoteFchin, "99/99/99"));
               AV10AlmPrdIdIn = (short)(GXutil.lval( httpContext.GetPar( "AlmPrdIdIn"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlmPrdIdIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlmPrdIdIn), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV6PrdNum,AV7PrdNom,AV8PrdLotein,AV9PrdLoteFchin,Short.valueOf(AV10AlmPrdIdIn)});
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
         pa1RM2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Modificacion Lote Producto", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.modificacionloteproducto_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV7PrdNom)),GXutil.URLEncode(GXutil.rtrim(AV8PrdLotein)),GXutil.URLEncode(GXutil.formatDateParm(AV9PrdLoteFchin)),GXutil.URLEncode(GXutil.ltrimstr(AV10AlmPrdIdIn,4,0))}, new String[] {"Emprcod","PrdNum","PrdNom","PrdLotein","PrdLoteFchin","AlmPrdIdIn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21almacenes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV23Lotes), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vALMPRDID_DATA", AV14AlmPrdId_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vALMPRDID_DATA", AV14AlmPrdId_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6PrdNum", GXutil.rtrim( wcpOAV6PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7PrdNom", GXutil.rtrim( wcpOAV7PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8PrdLotein", GXutil.rtrim( wcpOAV8PrdLotein));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9PrdLoteFchin", localUtil.dtoc( wcpOAV9PrdLoteFchin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10AlmPrdIdIn", GXutil.ltrim( localUtil.ntoc( wcpOAV10AlmPrdIdIn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENES", GXutil.ltrim( localUtil.ntoc( AV21almacenes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21almacenes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDLOTEIN", GXutil.rtrim( AV8PrdLotein));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV6PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV20UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV18Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMPRDIDIN", GXutil.ltrim( localUtil.ntoc( AV10AlmPrdIdIn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDLOTEFCHIN", localUtil.dtoc( AV9PrdLoteFchin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNOM", GXutil.rtrim( AV7PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTES", GXutil.ltrim( localUtil.ntoc( AV23Lotes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV23Lotes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_ALMPRDID_Cls", GXutil.rtrim( Combo_almprdid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_ALMPRDID_Selectedvalue_set", GXutil.rtrim( Combo_almprdid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_ALMPRDID_Visible", GXutil.booltostr( Combo_almprdid_Visible));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Title", GXutil.rtrim( Dvelop_confirmpanel_modificar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_modificar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_modificar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_modificar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_modificar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_ALMPRDID_Selectedvalue_get", GXutil.rtrim( Combo_almprdid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_modificar_Result));
   }

   public void renderHtmlCloseForm1RM2( )
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
      return "StocksQuimicos.ModificacionLoteProducto_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Modificacion Lote Producto", "") ;
   }

   public void wb1RM0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.modificacionloteproducto_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         wb_table1_14_1RM2( true) ;
      }
      else
      {
         wb_table1_14_1RM2( false) ;
      }
      return  ;
   }

   public void wb_table1_14_1RM2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmodificar_Internalname, "", httpContext.getMessage( "Modificar", ""), bttBtnmodificar_Jsonclick, 5, httpContext.getMessage( "Modificar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMODIFICAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV26Pgmname), GXutil.rtrim( localUtil.format( AV26Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlmprdid_Internalname, GXutil.ltrim( localUtil.ntoc( AV13AlmPrdId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13AlmPrdId), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlmprdid_Jsonclick, 0, "Attribute", "", "", "", "", edtavAlmprdid_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         wb_table2_67_1RM2( true) ;
      }
      else
      {
         wb_table2_67_1RM2( false) ;
      }
      return  ;
   }

   public void wb_table2_67_1RM2e( boolean wbgen )
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

   public void start1RM2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Modificacion Lote Producto", ""), (short)(0)) ;
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
            strup1RM0( ) ;
         }
      }
   }

   public void ws1RM2( )
   {
      start1RM2( ) ;
      evt1RM2( ) ;
   }

   public void evt1RM2( )
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
                              strup1RM0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111RM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e121RM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMODIFICAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoModificar' */
                                 e131RM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e141RM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e151RM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RM0( ) ;
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
                              strup1RM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavPrdlote_Internalname ;
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

   public void we1RM2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1RM2( ) ;
         }
      }
   }

   public void pa1RM2( )
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
            GX_FocusControl = edtavPrdlote_Internalname ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1RM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV26Pgmname = "StocksQuimicos.ModificacionLoteProducto_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Pgmname", AV26Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1RM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151RM2 ();
         wb1RM0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1RM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENES", GXutil.ltrim( localUtil.ntoc( AV21almacenes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21almacenes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTES", GXutil.ltrim( localUtil.ntoc( AV23Lotes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV23Lotes), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV26Pgmname = "StocksQuimicos.ModificacionLoteProducto_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Pgmname", AV26Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1RM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121RM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vALMPRDID_DATA"), AV14AlmPrdId_Data);
         /* Read saved values. */
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV6PrdNum") ;
         wcpOAV7PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV7PrdNom") ;
         wcpOAV8PrdLotein = httpContext.cgiGet( sPrefix+"wcpOAV8PrdLotein") ;
         wcpOAV9PrdLoteFchin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9PrdLoteFchin"), 0) ;
         wcpOAV10AlmPrdIdIn = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10AlmPrdIdIn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV6PrdNum = httpContext.cgiGet( sPrefix+"vPRDNUM") ;
         AV5Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         AV23Lotes = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vLOTES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV7PrdNom = httpContext.cgiGet( sPrefix+"vPRDNOM") ;
         Combo_almprdid_Cls = httpContext.cgiGet( sPrefix+"COMBO_ALMPRDID_Cls") ;
         Combo_almprdid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"COMBO_ALMPRDID_Selectedvalue_set") ;
         Combo_almprdid_Visible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"COMBO_ALMPRDID_Visible")) ;
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
         Dvelop_confirmpanel_modificar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Title") ;
         Dvelop_confirmpanel_modificar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Confirmationtext") ;
         Dvelop_confirmpanel_modificar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_modificar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_modificar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_modificar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_modificar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Confirmtype") ;
         Dvelop_confirmpanel_modificar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR_Result") ;
         /* Read variables values. */
         AV11Prdlote = httpContext.cgiGet( edtavPrdlote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Prdlote", AV11Prdlote);
         AV22producto_prompt = httpContext.cgiGet( imgavProducto_prompt_Internalname) ;
         if ( localUtil.vcdate( httpContext.cgiGet( edtavPrdlotefch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vPRDLOTEFCH");
            GX_FocusControl = edtavPrdlotefch_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12PrdLoteFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PrdLoteFch", localUtil.format(AV12PrdLoteFch, "99/99/99"));
         }
         else
         {
            AV12PrdLoteFch = localUtil.ctod( httpContext.cgiGet( edtavPrdlotefch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PrdLoteFch", localUtil.format(AV12PrdLoteFch, "99/99/99"));
         }
         AV26Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Pgmname", AV26Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlmprdid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlmprdid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALMPRDID");
            GX_FocusControl = edtavAlmprdid_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13AlmPrdId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AlmPrdId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlmPrdId), 4, 0));
         }
         else
         {
            AV13AlmPrdId = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlmprdid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AlmPrdId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlmPrdId), 4, 0));
         }
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
      e121RM2 ();
      if (returnInSub) return;
   }

   public void e121RM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      modificacionloteproducto_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Station", AV18Station);
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      modificacionloteproducto_wc_impl.this.AV5Emprcod = GXv_char2[0] ;
      modificacionloteproducto_wc_impl.this.AV19EmprNom = GXv_char3[0] ;
      modificacionloteproducto_wc_impl.this.AV20UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20UsurCod", AV20UsurCod);
      GXt_int5 = (byte)(AV21almacenes) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "ARLOTE", ""), GXv_int6) ;
      modificacionloteproducto_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21almacenes = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21almacenes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21almacenes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21almacenes), "ZZZ9")));
      GXt_int5 = (byte)(AV23Lotes) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "00LOTE", ""), GXv_int6) ;
      modificacionloteproducto_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23Lotes = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lotes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Lotes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV23Lotes), "ZZZ9")));
      AV11Prdlote = AV8PrdLotein ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Prdlote", AV11Prdlote);
      AV12PrdLoteFch = AV9PrdLoteFchin ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PrdLoteFch", localUtil.format(AV12PrdLoteFch, "99/99/99"));
      AV13AlmPrdId = AV10AlmPrdIdIn ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AlmPrdId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlmPrdId), 4, 0));
      imgavProducto_prompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, imgavProducto_prompt_Internalname, "gximage", imgavProducto_prompt_gximage, true);
      AV22producto_prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, imgavProducto_prompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV22producto_prompt)==0) ? AV27Producto_prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV22producto_prompt))), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, imgavProducto_prompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV22producto_prompt), true);
      AV27Producto_prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, imgavProducto_prompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV22producto_prompt)==0) ? AV27Producto_prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV22producto_prompt))), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, imgavProducto_prompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV22producto_prompt), true);
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      modificacionloteproducto_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Station", AV18Station);
      GXv_char4[0] = AV5Emprcod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char2[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      modificacionloteproducto_wc_impl.this.AV5Emprcod = GXv_char4[0] ;
      modificacionloteproducto_wc_impl.this.AV19EmprNom = GXv_char3[0] ;
      modificacionloteproducto_wc_impl.this.AV20UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20UsurCod", AV20UsurCod);
      edtavAlmprdid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmprdid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmprdid_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOALMPRDID' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e131RM2( )
   {
      /* 'DoModificar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV5Emprcod ;
      GXv_int7[0] = AV13AlmPrdId ;
      GXv_char3[0] = AV16almprddsc ;
      new app.palmprd(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
      modificacionloteproducto_wc_impl.this.AV5Emprcod = GXv_char4[0] ;
      modificacionloteproducto_wc_impl.this.AV13AlmPrdId = GXv_int7[0] ;
      modificacionloteproducto_wc_impl.this.AV16almprddsc = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AlmPrdId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlmPrdId), 4, 0));
      if ( ( AV21almacenes == 1 ) && ( GXutil.strcmp(AV16almprddsc, httpContext.getMessage( "Error.NO existe almacen", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV16almprddsc);
      }
      else
      {
         Dvelop_confirmpanel_modificar_Confirmationtext = httpContext.getMessage( "Lote actual ", "")+GXutil.trim( AV8PrdLotein)+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_modificar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_modificar_Internalname, "ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
         Dvelop_confirmpanel_modificar_Confirmationtext = Dvelop_confirmpanel_modificar_Confirmationtext+httpContext.getMessage( "Lote nuevo ", "")+GXutil.trim( AV11Prdlote)+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_modificar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_modificar_Internalname, "ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
         Dvelop_confirmpanel_modificar_Confirmationtext = Dvelop_confirmpanel_modificar_Confirmationtext+httpContext.getMessage( "Confirma el cambio?", "") ;
         ucDvelop_confirmpanel_modificar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_modificar_Internalname, "ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
         this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_MODIFICARContainer", "Confirm", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e111RM2( )
   {
      /* Dvelop_confirmpanel_modificar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_modificar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION MODIFICAR' */
         S132 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141RM2( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5Emprcod,AV6PrdNum,AV7PrdNom,AV8PrdLotein,localUtil.format( AV9PrdLoteFchin, "99/99/99"),Short.valueOf(AV10AlmPrdIdIn)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6PrdNum","AV7PrdNom","AV8PrdLotein","AV9PrdLoteFchin","AV10AlmPrdIdIn"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'DO ACTION MODIFICAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV5Emprcod ;
      GXv_char3[0] = AV6PrdNum ;
      GXv_char2[0] = AV11Prdlote ;
      GXv_date8[0] = AV12PrdLoteFch ;
      GXv_char9[0] = httpContext.getMessage( "N", "") ;
      GXv_int7[0] = AV13AlmPrdId ;
      GXv_char10[0] = AV20UsurCod ;
      GXv_char11[0] = AV18Station ;
      new app.preclot5(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_date8, GXv_char9, GXv_int7, GXv_char10, GXv_char11) ;
      modificacionloteproducto_wc_impl.this.AV5Emprcod = GXv_char4[0] ;
      modificacionloteproducto_wc_impl.this.AV6PrdNum = GXv_char3[0] ;
      modificacionloteproducto_wc_impl.this.AV11Prdlote = GXv_char2[0] ;
      modificacionloteproducto_wc_impl.this.AV12PrdLoteFch = GXv_date8[0] ;
      modificacionloteproducto_wc_impl.this.AV13AlmPrdId = GXv_int7[0] ;
      modificacionloteproducto_wc_impl.this.AV20UsurCod = GXv_char10[0] ;
      modificacionloteproducto_wc_impl.this.AV18Station = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Prdlote", AV11Prdlote);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PrdLoteFch", localUtil.format(AV12PrdLoteFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AlmPrdId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlmPrdId), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20UsurCod", AV20UsurCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Station", AV18Station);
      new app.pcommit(remoteHandle, context).execute( ) ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado¡", ""));
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      GXv_char11[0] = AV5Emprcod ;
      GXv_char10[0] = httpContext.getMessage( "01LOTE", "") ;
      if ( ! ( ( new app.pvalcon(remoteHandle, context).executeUdp( GXv_char11, GXv_char10) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      modificacionloteproducto_wc_impl.this.AV5Emprcod = GXv_char11[0] ;
      if ( Cond_result )
      {
         edtavPrdlotefch_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdlotefch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdlotefch_Visible), 5, 0), true);
         divPrdlotefch_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdlotefch_cell_Internalname, "Class", divPrdlotefch_cell_Class, true);
      }
      else
      {
         edtavPrdlotefch_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdlotefch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdlotefch_Visible), 5, 0), true);
         divPrdlotefch_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divPrdlotefch_cell_Internalname, "Class", divPrdlotefch_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5Emprcod, httpContext.getMessage( "ARLOTE", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         Combo_almprdid_Visible = false ;
         ucCombo_almprdid.sendProperty(context, sPrefix, false, Combo_almprdid_Internalname, "Visible", GXutil.booltostr( Combo_almprdid_Visible));
         divCombo_almprdid_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divCombo_almprdid_cell_Internalname, "Class", divCombo_almprdid_cell_Class, true);
      }
      else
      {
         Combo_almprdid_Visible = true ;
         ucCombo_almprdid.sendProperty(context, sPrefix, false, Combo_almprdid_Internalname, "Visible", GXutil.booltostr( Combo_almprdid_Visible));
         divCombo_almprdid_cell_Class = "col-xs-12 col-sm-6 DscTop ExtendedComboCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divCombo_almprdid_cell_Internalname, "Class", divCombo_almprdid_cell_Class, true);
      }
      if ( ( edtavPrdlotefch_Visible == ( 0 )) && ! Combo_almprdid_Visible )
      {
         divUnnamedtable4_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable4_Visible), 5, 0), true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOALMPRDID' Routine */
      returnInSub = false ;
      /* Using cursor H01RM2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14019ID_AlmPrdD = H01RM2_A14019ID_AlmPrdD[0] ;
         A13927AlmPrdID = H01RM2_A13927AlmPrdID[0] ;
         A13928AlmPrdDsc = H01RM2_A13928AlmPrdDsc[0] ;
         AV15Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A13927AlmPrdID, 4, 0)) );
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14019ID_AlmPrdD );
         AV14AlmPrdId_Data.add(AV15Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_almprdid_Selectedvalue_set = ((0==AV13AlmPrdId) ? "" : GXutil.trim( GXutil.str( AV13AlmPrdId, 4, 0))) ;
      ucCombo_almprdid.sendProperty(context, sPrefix, false, Combo_almprdid_Internalname, "SelectedValue_set", Combo_almprdid_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e151RM2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_67_1RM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_modificar_Internalname, tblTabledvelop_confirmpanel_modificar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_modificar.setProperty("Title", Dvelop_confirmpanel_modificar_Title);
         ucDvelop_confirmpanel_modificar.setProperty("ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
         ucDvelop_confirmpanel_modificar.setProperty("YesButtonCaption", Dvelop_confirmpanel_modificar_Yesbuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("NoButtonCaption", Dvelop_confirmpanel_modificar_Nobuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_modificar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("YesButtonPosition", Dvelop_confirmpanel_modificar_Yesbuttonposition);
         ucDvelop_confirmpanel_modificar.setProperty("ConfirmType", Dvelop_confirmpanel_modificar_Confirmtype);
         ucDvelop_confirmpanel_modificar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_modificar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_67_1RM2e( true) ;
      }
      else
      {
         wb_table2_67_1RM2e( false) ;
      }
   }

   public void wb_table1_14_1RM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdlote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdlote_Internalname, httpContext.getMessage( "Lote", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdlote_Internalname, GXutil.rtrim( AV11Prdlote), GXutil.rtrim( localUtil.format( AV11Prdlote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdlote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdlote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavProducto_prompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavProducto_prompt_gximage, "")==0) ? "" : "GX_Image_"+imgavProducto_prompt_gximage+"_Class") ;
         StyleString = "" ;
         AV22producto_prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV22producto_prompt)==0)&&(GXutil.strcmp("", AV27Producto_prompt_GXI)==0))||!(GXutil.strcmp("", AV22producto_prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV22producto_prompt)==0) ? AV27Producto_prompt_GXI : httpContext.getResourceRelative(AV22producto_prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavProducto_prompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavProducto_prompt_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+"e161rm1_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV22producto_prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirrotulo_Internalname, "", httpContext.getMessage( "Imprimir Rotulo", ""), bttBtnimprimirrotulo_Jsonclick, 7, httpContext.getMessage( "Imprimir Rotulo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e171rm1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellMarginTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, divUnnamedtable4_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPrdlotefch_cell_Internalname, 1, 0, "px", 0, "px", divPrdlotefch_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavPrdlotefch_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdlotefch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdlotefch_Internalname, httpContext.getMessage( "Fecha Caducidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavPrdlotefch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdlotefch_Internalname, localUtil.format(AV12PrdLoteFch, "99/99/99"), localUtil.format( AV12PrdLoteFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdlotefch_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavPrdlotefch_Visible, edtavPrdlotefch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavPrdlotefch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavPrdlotefch_Visible==0)||(edtavPrdlotefch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCombo_almprdid_cell_Internalname, 1, 0, "px", 0, "px", divCombo_almprdid_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedalmprdid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_almprdid_Internalname, httpContext.getMessage( "Almacen", ""), "", "", lblTextblockcombo_almprdid_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\ModificacionLoteProducto_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_almprdid.setProperty("Caption", Combo_almprdid_Caption);
         ucCombo_almprdid.setProperty("Cls", Combo_almprdid_Cls);
         ucCombo_almprdid.setProperty("DropDownOptionsData", AV14AlmPrdId_Data);
         ucCombo_almprdid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_almprdid_Internalname, sPrefix+"COMBO_ALMPRDIDContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_1RM2e( true) ;
      }
      else
      {
         wb_table1_14_1RM2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
      AV7PrdNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNom", AV7PrdNom);
      AV8PrdLotein = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdLotein", AV8PrdLotein);
      AV9PrdLoteFchin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrdLoteFchin", localUtil.format(AV9PrdLoteFchin, "99/99/99"));
      AV10AlmPrdIdIn = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlmPrdIdIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlmPrdIdIn), 4, 0));
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
      pa1RM2( ) ;
      ws1RM2( ) ;
      we1RM2( ) ;
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
      sCtrlAV6PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7PrdNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8PrdLotein = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9PrdLoteFchin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10AlmPrdIdIn = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1RM2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\modificacionloteproducto_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1RM2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6PrdNum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
         AV7PrdNom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNom", AV7PrdNom);
         AV8PrdLotein = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdLotein", AV8PrdLotein);
         AV9PrdLoteFchin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrdLoteFchin", localUtil.format(AV9PrdLoteFchin, "99/99/99"));
         AV10AlmPrdIdIn = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlmPrdIdIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlmPrdIdIn), 4, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV6PrdNum") ;
      wcpOAV7PrdNom = httpContext.cgiGet( sPrefix+"wcpOAV7PrdNom") ;
      wcpOAV8PrdLotein = httpContext.cgiGet( sPrefix+"wcpOAV8PrdLotein") ;
      wcpOAV9PrdLoteFchin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9PrdLoteFchin"), 0) ;
      wcpOAV10AlmPrdIdIn = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10AlmPrdIdIn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV6PrdNum, wcpOAV6PrdNum) != 0 ) || ( GXutil.strcmp(AV7PrdNom, wcpOAV7PrdNom) != 0 ) || ( GXutil.strcmp(AV8PrdLotein, wcpOAV8PrdLotein) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV9PrdLoteFchin), GXutil.resetTime(wcpOAV9PrdLoteFchin)) ) || ( AV10AlmPrdIdIn != wcpOAV10AlmPrdIdIn ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6PrdNum = AV6PrdNum ;
      wcpOAV7PrdNom = AV7PrdNom ;
      wcpOAV8PrdLotein = AV8PrdLotein ;
      wcpOAV9PrdLoteFchin = AV9PrdLoteFchin ;
      wcpOAV10AlmPrdIdIn = AV10AlmPrdIdIn ;
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
      sCtrlAV6PrdNum = httpContext.cgiGet( sPrefix+"AV6PrdNum_CTRL") ;
      if ( GXutil.len( sCtrlAV6PrdNum) > 0 )
      {
         AV6PrdNum = httpContext.cgiGet( sCtrlAV6PrdNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
      }
      else
      {
         AV6PrdNum = httpContext.cgiGet( sPrefix+"AV6PrdNum_PARM") ;
      }
      sCtrlAV7PrdNom = httpContext.cgiGet( sPrefix+"AV7PrdNom_CTRL") ;
      if ( GXutil.len( sCtrlAV7PrdNom) > 0 )
      {
         AV7PrdNom = httpContext.cgiGet( sCtrlAV7PrdNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNom", AV7PrdNom);
      }
      else
      {
         AV7PrdNom = httpContext.cgiGet( sPrefix+"AV7PrdNom_PARM") ;
      }
      sCtrlAV8PrdLotein = httpContext.cgiGet( sPrefix+"AV8PrdLotein_CTRL") ;
      if ( GXutil.len( sCtrlAV8PrdLotein) > 0 )
      {
         AV8PrdLotein = httpContext.cgiGet( sCtrlAV8PrdLotein) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdLotein", AV8PrdLotein);
      }
      else
      {
         AV8PrdLotein = httpContext.cgiGet( sPrefix+"AV8PrdLotein_PARM") ;
      }
      sCtrlAV9PrdLoteFchin = httpContext.cgiGet( sPrefix+"AV9PrdLoteFchin_CTRL") ;
      if ( GXutil.len( sCtrlAV9PrdLoteFchin) > 0 )
      {
         AV9PrdLoteFchin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9PrdLoteFchin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrdLoteFchin", localUtil.format(AV9PrdLoteFchin, "99/99/99"));
      }
      else
      {
         AV9PrdLoteFchin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9PrdLoteFchin_PARM"), 0) ;
      }
      sCtrlAV10AlmPrdIdIn = httpContext.cgiGet( sPrefix+"AV10AlmPrdIdIn_CTRL") ;
      if ( GXutil.len( sCtrlAV10AlmPrdIdIn) > 0 )
      {
         AV10AlmPrdIdIn = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10AlmPrdIdIn), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlmPrdIdIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlmPrdIdIn), 4, 0));
      }
      else
      {
         AV10AlmPrdIdIn = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10AlmPrdIdIn_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1RM2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1RM2( ) ;
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
      ws1RM2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6PrdNum_PARM", GXutil.rtrim( AV6PrdNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6PrdNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6PrdNum_CTRL", GXutil.rtrim( sCtrlAV6PrdNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdNom_PARM", GXutil.rtrim( AV7PrdNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7PrdNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdNom_CTRL", GXutil.rtrim( sCtrlAV7PrdNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdLotein_PARM", GXutil.rtrim( AV8PrdLotein));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8PrdLotein)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdLotein_CTRL", GXutil.rtrim( sCtrlAV8PrdLotein));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrdLoteFchin_PARM", localUtil.dtoc( AV9PrdLoteFchin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9PrdLoteFchin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrdLoteFchin_CTRL", GXutil.rtrim( sCtrlAV9PrdLoteFchin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10AlmPrdIdIn_PARM", GXutil.ltrim( localUtil.ntoc( AV10AlmPrdIdIn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10AlmPrdIdIn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10AlmPrdIdIn_CTRL", GXutil.rtrim( sCtrlAV10AlmPrdIdIn));
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
      we1RM2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714145982", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/modificacionloteproducto_wc.js", "?202681714145982", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      edtavPrdlote_Internalname = sPrefix+"vPRDLOTE" ;
      imgavProducto_prompt_Internalname = sPrefix+"vPRODUCTO_PROMPT" ;
      bttBtnimprimirrotulo_Internalname = sPrefix+"BTNIMPRIMIRROTULO" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtavPrdlotefch_Internalname = sPrefix+"vPRDLOTEFCH" ;
      divPrdlotefch_cell_Internalname = sPrefix+"PRDLOTEFCH_CELL" ;
      lblTextblockcombo_almprdid_Internalname = sPrefix+"TEXTBLOCKCOMBO_ALMPRDID" ;
      Combo_almprdid_Internalname = sPrefix+"COMBO_ALMPRDID" ;
      divTablesplittedalmprdid_Internalname = sPrefix+"TABLESPLITTEDALMPRDID" ;
      divCombo_almprdid_cell_Internalname = sPrefix+"COMBO_ALMPRDID_CELL" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      tblUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnmodificar_Internalname = sPrefix+"BTNMODIFICAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavAlmprdid_Internalname = sPrefix+"vALMPRDID" ;
      Dvelop_confirmpanel_modificar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_MODIFICAR" ;
      tblTabledvelop_confirmpanel_modificar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_MODIFICAR" ;
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
      edtavPrdlotefch_Jsonclick = "" ;
      edtavPrdlotefch_Enabled = 1 ;
      divUnnamedtable4_Visible = 1 ;
      imgavProducto_prompt_Jsonclick = "" ;
      edtavPrdlote_Jsonclick = "" ;
      edtavPrdlote_Enabled = 1 ;
      divCombo_almprdid_cell_Class = "col-xs-12 col-sm-6" ;
      divPrdlotefch_cell_Class = "col-xs-12 col-sm-6" ;
      edtavPrdlotefch_Visible = 1 ;
      imgavProducto_prompt_gximage = "" ;
      edtavAlmprdid_Jsonclick = "" ;
      edtavAlmprdid_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Dvelop_confirmpanel_modificar_Confirmtype = "1" ;
      Dvelop_confirmpanel_modificar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_modificar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_modificar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_modificar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_modificar_Confirmationtext = "¿Confirma la modificacion?" ;
      Dvelop_confirmpanel_modificar_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Lote", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Combo_almprdid_Visible = GXutil.toBoolean( -1) ;
      Combo_almprdid_Cls = "ExtendedCombo AttributeFL" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV21almacenes',fld:'vALMACENES',pic:'ZZZ9',hsh:true},{av:'AV23Lotes',fld:'vLOTES',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOMODIFICAR'","{handler:'e131RM2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13AlmPrdId',fld:'vALMPRDID',pic:'ZZZ9'},{av:'AV21almacenes',fld:'vALMACENES',pic:'ZZZ9',hsh:true},{av:'AV8PrdLotein',fld:'vPRDLOTEIN',pic:''},{av:'AV11Prdlote',fld:'vPRDLOTE',pic:''}]");
      setEventMetadata("'DOMODIFICAR'",",oparms:[{av:'AV13AlmPrdId',fld:'vALMPRDID',pic:'ZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_modificar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_MODIFICAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE","{handler:'e111RM2',iparms:[{av:'Dvelop_confirmpanel_modificar_Result',ctrl:'DVELOP_CONFIRMPANEL_MODIFICAR',prop:'Result'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11Prdlote',fld:'vPRDLOTE',pic:''},{av:'AV12PrdLoteFch',fld:'vPRDLOTEFCH',pic:''},{av:'AV13AlmPrdId',fld:'vALMPRDID',pic:'ZZZ9'},{av:'AV20UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE",",oparms:[{av:'AV18Station',fld:'vSTATION',pic:''},{av:'AV20UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV13AlmPrdId',fld:'vALMPRDID',pic:'ZZZ9'},{av:'AV12PrdLoteFch',fld:'vPRDLOTEFCH',pic:''},{av:'AV11Prdlote',fld:'vPRDLOTE',pic:''},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e141RM2',iparms:[{av:'AV10AlmPrdIdIn',fld:'vALMPRDIDIN',pic:'ZZZ9'},{av:'AV9PrdLoteFchin',fld:'vPRDLOTEFCHIN',pic:''},{av:'AV8PrdLotein',fld:'vPRDLOTEIN',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:''},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOIMPRIMIRROTULO'","{handler:'e171RM1',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:''},{av:'AV11Prdlote',fld:'vPRDLOTE',pic:''}]");
      setEventMetadata("'DOIMPRIMIRROTULO'",",oparms:[{av:'AV11Prdlote',fld:'vPRDLOTE',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:''},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VPRODUCTO_PROMPT.CLICK","{handler:'e161RM1',iparms:[{av:'AV23Lotes',fld:'vLOTES',pic:'ZZZ9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''}]");
      setEventMetadata("VPRODUCTO_PROMPT.CLICK",",oparms:[{av:'AV11Prdlote',fld:'vPRDLOTE',pic:''}]}");
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
      wcpOAV6PrdNum = "" ;
      wcpOAV7PrdNom = "" ;
      wcpOAV8PrdLotein = "" ;
      wcpOAV9PrdLoteFchin = GXutil.nullDate() ;
      Dvelop_confirmpanel_modificar_Result = "" ;
      Combo_almprdid_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV6PrdNum = "" ;
      AV7PrdNom = "" ;
      AV8PrdLotein = "" ;
      AV9PrdLoteFchin = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV14AlmPrdId_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV20UsurCod = "" ;
      AV18Station = "" ;
      Combo_almprdid_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnmodificar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      AV26Pgmname = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV11Prdlote = "" ;
      AV22producto_prompt = "" ;
      AV12PrdLoteFch = GXutil.nullDate() ;
      AV19EmprNom = "" ;
      GXv_int6 = new byte[1] ;
      AV27Producto_prompt_GXI = "" ;
      GXt_char1 = "" ;
      AV16almprddsc = "" ;
      ucDvelop_confirmpanel_modificar = new com.genexus.webpanels.GXUserControl();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_char9 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      ucCombo_almprdid = new com.genexus.webpanels.GXUserControl();
      scmdbuf = "" ;
      H01RM2_A396EmprCod = new String[] {""} ;
      H01RM2_A14019ID_AlmPrdD = new String[] {""} ;
      H01RM2_A13927AlmPrdID = new short[1] ;
      H01RM2_A13928AlmPrdDsc = new String[] {""} ;
      A14019ID_AlmPrdD = "" ;
      A13928AlmPrdDsc = "" ;
      AV15Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      sStyleString = "" ;
      sImgUrl = "" ;
      bttBtnimprimirrotulo_Jsonclick = "" ;
      lblTextblockcombo_almprdid_Jsonclick = "" ;
      Combo_almprdid_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6PrdNum = "" ;
      sCtrlAV7PrdNom = "" ;
      sCtrlAV8PrdLotein = "" ;
      sCtrlAV9PrdLoteFchin = "" ;
      sCtrlAV10AlmPrdIdIn = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.modificacionloteproducto_wc__default(),
         new Object[] {
             new Object[] {
            H01RM2_A396EmprCod, H01RM2_A14019ID_AlmPrdD, H01RM2_A13927AlmPrdID, H01RM2_A13928AlmPrdDsc
            }
         }
      );
      AV26Pgmname = "StocksQuimicos.ModificacionLoteProducto_WC" ;
      /* GeneXus formulas. */
      AV26Pgmname = "StocksQuimicos.ModificacionLoteProducto_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short wcpOAV10AlmPrdIdIn ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV10AlmPrdIdIn ;
   private short AV21almacenes ;
   private short AV23Lotes ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13AlmPrdId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int7[] ;
   private short A13927AlmPrdID ;
   private int edtavPgmname_Enabled ;
   private int edtavAlmprdid_Visible ;
   private int edtavPrdlotefch_Visible ;
   private int divUnnamedtable4_Visible ;
   private int edtavPrdlote_Enabled ;
   private int edtavPrdlotefch_Enabled ;
   private int idxLst ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6PrdNum ;
   private String wcpOAV7PrdNom ;
   private String wcpOAV8PrdLotein ;
   private String Dvelop_confirmpanel_modificar_Result ;
   private String Combo_almprdid_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV6PrdNum ;
   private String AV7PrdNom ;
   private String AV8PrdLotein ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV20UsurCod ;
   private String AV18Station ;
   private String Combo_almprdid_Cls ;
   private String Combo_almprdid_Selectedvalue_set ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_modificar_Title ;
   private String Dvelop_confirmpanel_modificar_Confirmationtext ;
   private String Dvelop_confirmpanel_modificar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_modificar_Confirmtype ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnmodificar_Internalname ;
   private String bttBtnmodificar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV26Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavAlmprdid_Internalname ;
   private String edtavAlmprdid_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavPrdlote_Internalname ;
   private String AV11Prdlote ;
   private String imgavProducto_prompt_Internalname ;
   private String edtavPrdlotefch_Internalname ;
   private String AV19EmprNom ;
   private String imgavProducto_prompt_gximage ;
   private String GXt_char1 ;
   private String AV16almprddsc ;
   private String Dvelop_confirmpanel_modificar_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String divPrdlotefch_cell_Class ;
   private String divPrdlotefch_cell_Internalname ;
   private String Combo_almprdid_Internalname ;
   private String divCombo_almprdid_cell_Class ;
   private String divCombo_almprdid_cell_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String scmdbuf ;
   private String A14019ID_AlmPrdD ;
   private String A13928AlmPrdDsc ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_modificar_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavPrdlote_Jsonclick ;
   private String sImgUrl ;
   private String imgavProducto_prompt_Jsonclick ;
   private String bttBtnimprimirrotulo_Internalname ;
   private String bttBtnimprimirrotulo_Jsonclick ;
   private String edtavPrdlotefch_Jsonclick ;
   private String divTablesplittedalmprdid_Internalname ;
   private String lblTextblockcombo_almprdid_Internalname ;
   private String lblTextblockcombo_almprdid_Jsonclick ;
   private String Combo_almprdid_Caption ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6PrdNum ;
   private String sCtrlAV7PrdNom ;
   private String sCtrlAV8PrdLotein ;
   private String sCtrlAV9PrdLoteFchin ;
   private String sCtrlAV10AlmPrdIdIn ;
   private java.util.Date wcpOAV9PrdLoteFchin ;
   private java.util.Date AV9PrdLoteFchin ;
   private java.util.Date AV12PrdLoteFch ;
   private java.util.Date GXv_date8[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_almprdid_Visible ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean AV22producto_prompt_IsBlob ;
   private String AV27Producto_prompt_GXI ;
   private String AV22producto_prompt ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_modificar ;
   private com.genexus.webpanels.GXUserControl ucCombo_almprdid ;
   private IDataStoreProvider pr_default ;
   private String[] H01RM2_A396EmprCod ;
   private String[] H01RM2_A14019ID_AlmPrdD ;
   private short[] H01RM2_A13927AlmPrdID ;
   private String[] H01RM2_A13928AlmPrdDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV14AlmPrdId_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV15Combo_DataItem ;
}

final  class modificacionloteproducto_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01RM2", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmPrdID,'9990'), 2))) || '-' || RTRIM(LTRIM(AlmPrdDsc)) AS ID_AlmPrdD, AlmPrdID, AlmPrdDsc FROM TXPALMPRD ORDER BY ID_AlmPrdD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

