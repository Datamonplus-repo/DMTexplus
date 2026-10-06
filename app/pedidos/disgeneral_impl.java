package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disgeneral_impl extends GXWebComponent
{
   public disgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disgeneral_impl.class ));
   }

   public disgeneral_impl( int remoteHandle ,
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
      cmbPriCod = new HTMLChoice();
      chkDisEstTip = UIFactory.getCheckbox(this);
      chkDisExp = UIFactory.getCheckbox(this);
      chkDisTin = UIFactory.getCheckbox(this);
      chkDisAcaBak = UIFactory.getCheckbox(this);
      chkDisArtEnc = UIFactory.getCheckbox(this);
      chkDisArtCor = UIFactory.getCheckbox(this);
      cmbDisAntpT = new HTMLChoice();
      cmbDisCruEnr = new HTMLChoice();
      chkDisDes = UIFactory.getCheckbox(this);
      cmbDisUniMed = new HTMLChoice();
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               AV12VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12VisualizarAcciones", AV12VisualizarAcciones);
               AV13AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AccionesEnPopup", AV13AccionesEnPopup);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A361DisCod),Boolean.valueOf(AV12VisualizarAcciones),Boolean.valueOf(AV13AccionesEnPopup)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DISARTACA") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A766ProForDsc = httpContext.GetPar( "ProForDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgadisartaca1Y30( A396EmprCod, A766ProForDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DISARTACA") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A766ProForDsc = httpContext.GetPar( "ProForDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgadisartaca1Y30( A396EmprCod, A766ProForDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"DISARTACA") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h333DisArtAca = httpContext.GetPar( "h333DisArtAca") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcadisartaca1Y32( A396EmprCod, h333DisArtAca) ;
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
         pa1Y32( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Dis General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.booltostr(AV12VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV13AccionesEnPopup))}, new String[] {"EmprCod","DisCod","VisualizarAcciones","AccionesEnPopup"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DisGeneral");
      forbiddenHiddens.add("MarcaId", GXutil.rtrim( localUtil.format( A11659MarcaId, "@!")));
      forbiddenHiddens.add("RevenID", GXutil.rtrim( localUtil.format( A12328RevenID, "")));
      forbiddenHiddens.add("CpteId", localUtil.format( DecimalUtil.doubleToDec(A11860CpteId), "ZZZ9"));
      forbiddenHiddens.add("DesaID", localUtil.format( DecimalUtil.doubleToDec(A11862DesaID), "ZZZ9"));
      forbiddenHiddens.add("DptoID", localUtil.format( DecimalUtil.doubleToDec(A11863DptoID), "ZZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV18Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disgeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA361DisCod", GXutil.ltrim( localUtil.ntoc( wcpOA361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV12VisualizarAcciones", wcpOAV12VisualizarAcciones);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV13AccionesEnPopup", wcpOAV13AccionesEnPopup);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVISUALIZARACCIONES", AV12VisualizarAcciones);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vACCIONESENPOPUP", AV13AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCDISARTACA", GXutil.rtrim( A333DisArtAca));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Width", GXutil.rtrim( Dvpanel_transactiondetail_tablecliente_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tablecliente_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tablecliente_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tablecliente_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Title", GXutil.rtrim( Dvpanel_transactiondetail_tablecliente_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tablecliente_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tablecliente_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tablecliente_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tablecliente_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tablecliente_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Width", GXutil.rtrim( Dvpanel_transactiondetail_tablearticulotipo_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tablearticulotipo_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tablearticulotipo_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tablearticulotipo_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Title", GXutil.rtrim( Dvpanel_transactiondetail_tablearticulotipo_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tablearticulotipo_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tablearticulotipo_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tablearticulotipo_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tablearticulotipo_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tablearticulotipo_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Width", GXutil.rtrim( Dvpanel_transactiondetail_tablecolores_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tablecolores_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tablecolores_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tablecolores_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Title", GXutil.rtrim( Dvpanel_transactiondetail_tablecolores_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tablecolores_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tablecolores_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tablecolores_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tablecolores_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tablecolores_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Width", GXutil.rtrim( Dvpanel_transactiondetail_tablenext_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tablenext_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tablenext_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tablenext_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Title", GXutil.rtrim( Dvpanel_transactiondetail_tablenext_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tablenext_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tablenext_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tablenext_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tablenext_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tablenext_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Width", GXutil.rtrim( Dvpanel_transactiondetail_tableprecio_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tableprecio_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tableprecio_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tableprecio_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Title", GXutil.rtrim( Dvpanel_transactiondetail_tableprecio_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tableprecio_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tableprecio_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tableprecio_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tableprecio_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tableprecio_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Width", GXutil.rtrim( Dvpanel_transactiondetail_tableacabado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tableacabado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tableacabado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tableacabado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Title", GXutil.rtrim( Dvpanel_transactiondetail_tableacabado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tableacabado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tableacabado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tableacabado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tableacabado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tableacabado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Width", GXutil.rtrim( Dvpanel_transactiondetail_tableinditex_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tableinditex_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tableinditex_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tableinditex_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Title", GXutil.rtrim( Dvpanel_transactiondetail_tableinditex_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tableinditex_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tableinditex_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tableinditex_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tableinditex_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tableinditex_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Width", GXutil.rtrim( Dvpanel_transactiondetail_tableotrosdatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tableotrosdatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tableotrosdatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tableotrosdatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Title", GXutil.rtrim( Dvpanel_transactiondetail_tableotrosdatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tableotrosdatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tableotrosdatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tableotrosdatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tableotrosdatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tableotrosdatos_Autoscroll));
   }

   public void renderHtmlCloseForm1Y32( )
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
      return "Pedidos.DisGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Dis General", "") ;
   }

   public void wb1Y30( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidos.disgeneral");
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
         ucDvpanel_transactiondetail_tablecliente.setProperty("Width", Dvpanel_transactiondetail_tablecliente_Width);
         ucDvpanel_transactiondetail_tablecliente.setProperty("AutoWidth", Dvpanel_transactiondetail_tablecliente_Autowidth);
         ucDvpanel_transactiondetail_tablecliente.setProperty("AutoHeight", Dvpanel_transactiondetail_tablecliente_Autoheight);
         ucDvpanel_transactiondetail_tablecliente.setProperty("Cls", Dvpanel_transactiondetail_tablecliente_Cls);
         ucDvpanel_transactiondetail_tablecliente.setProperty("Title", Dvpanel_transactiondetail_tablecliente_Title);
         ucDvpanel_transactiondetail_tablecliente.setProperty("Collapsible", Dvpanel_transactiondetail_tablecliente_Collapsible);
         ucDvpanel_transactiondetail_tablecliente.setProperty("Collapsed", Dvpanel_transactiondetail_tablecliente_Collapsed);
         ucDvpanel_transactiondetail_tablecliente.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tablecliente_Showcollapseicon);
         ucDvpanel_transactiondetail_tablecliente.setProperty("IconPosition", Dvpanel_transactiondetail_tablecliente_Iconposition);
         ucDvpanel_transactiondetail_tablecliente.setProperty("AutoScroll", Dvpanel_transactiondetail_tablecliente_Autoscroll);
         ucDvpanel_transactiondetail_tablecliente.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tablecliente_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTEContainer"+"TransactionDetail_TableCliente"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablecliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable23_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Nr.Enc", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-5 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPriCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPriCod.getInternalname(), ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPriCod, cmbPriCod.getInternalname(), GXutil.rtrim( A757PriCod), 1, cmbPriCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPriCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisGeneral.htm");
         cmbPriCod.setValue( GXutil.rtrim( A757PriCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPriCod.getInternalname(), "Values", cmbPriCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable24_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDisenccli_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEncCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisEncCli_Internalname, httpContext.getMessage( "Enc.Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncCli_Internalname, GXutil.rtrim( A4813DisEncCli), GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDisclinum_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCliNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCliNum_Internalname, httpContext.getMessage( "Enc.Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliNum_Internalname, GXutil.rtrim( A360DisCliNum), GXutil.rtrim( localUtil.format( A360DisCliNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable25_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDistipdis_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTipDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisTipDis_Internalname, httpContext.getMessage( "Tipo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipDis_Internalname, GXutil.rtrim( A2009DisTipDis), GXutil.rtrim( localUtil.format( A2009DisTipDis, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable26_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFecCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFecCli_Internalname, httpContext.getMessage( "Data ped.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecCli_Internalname, localUtil.format(A370DisFecCli, "99/99/99"), localUtil.format( A370DisFecCli, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFec_Internalname, httpContext.getMessage( "Data reg.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisFecEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFecEnt_Internalname, httpContext.getMessage( "Data entr.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecEnt_Internalname, localUtil.format(A371DisFecEnt, "99/99/99"), localUtil.format( A371DisFecEnt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable27_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisEstTip.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisEstTip.getInternalname(), httpContext.getMessage( "Débito condicionado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisEstTip.getInternalname(), A5032DisEstTip, "", httpContext.getMessage( "Débito condicionado?", ""), 1, chkDisEstTip.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisExp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisExp.getInternalname(), httpContext.getMessage( "Exportação", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisExp.getInternalname(), A7739DisExp, "", httpContext.getMessage( "Exportação", ""), 1, chkDisExp.getEnabled(), "E", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisTin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisTin.getInternalname(), httpContext.getMessage( "Tinturaria", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisTin.getInternalname(), A4014DisTin, "", httpContext.getMessage( "Tinturaria", ""), 1, chkDisTin.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable28_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCliDes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCliDes_Internalname, httpContext.getMessage( "Cliente destino", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliDes_Internalname, GXutil.ltrim( localUtil.ntoc( A2310DisCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCliDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2310DisCliDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2310DisCliDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Código Cliente Destino", ""), "", edtDisCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCliDesN_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCliDesN_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliDesN_Internalname, GXutil.rtrim( A4197DisCliDesN), GXutil.rtrim( localUtil.format( A4197DisCliDesN, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliDesN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliDesN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("Width", Dvpanel_transactiondetail_tablearticulotipo_Width);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("AutoWidth", Dvpanel_transactiondetail_tablearticulotipo_Autowidth);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("AutoHeight", Dvpanel_transactiondetail_tablearticulotipo_Autoheight);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("Cls", Dvpanel_transactiondetail_tablearticulotipo_Cls);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("Title", Dvpanel_transactiondetail_tablearticulotipo_Title);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("Collapsible", Dvpanel_transactiondetail_tablearticulotipo_Collapsible);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("Collapsed", Dvpanel_transactiondetail_tablearticulotipo_Collapsed);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tablearticulotipo_Showcollapseicon);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("IconPosition", Dvpanel_transactiondetail_tablearticulotipo_Iconposition);
         ucDvpanel_transactiondetail_tablearticulotipo.setProperty("AutoScroll", Dvpanel_transactiondetail_tablearticulotipo_Autoscroll);
         ucDvpanel_transactiondetail_tablearticulotipo.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tablearticulotipo_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPOContainer"+"TransactionDetail_TableArticuloTipo"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablearticulotipo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtCod_Internalname, httpContext.getMessage( "Artigo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtDsc_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtMat_Internalname, httpContext.getMessage( "Tipo fib.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtMat_Internalname, GXutil.rtrim( A340DisArtMat), GXutil.rtrim( localUtil.format( A340DisArtMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAca_Internalname, httpContext.getMessage( "Acabado Quimico", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAca_Internalname, GXutil.rtrim( h333DisArtAca), GXutil.rtrim( localUtil.format( h333DisArtAca, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable18_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable21_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTip_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTip_Internalname, httpContext.getMessage( "T.Artigo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTip_Internalname, GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTipD_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTipD_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTipD_Internalname, GXutil.rtrim( A12115DisArtTipD), GXutil.rtrim( localUtil.format( A12115DisArtTipD, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTipD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTipD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable22_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTr1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTr1_Internalname, httpContext.getMessage( "Comp.1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr1_Internalname, GXutil.rtrim( A353DisArtTr1), GXutil.rtrim( localUtil.format( A353DisArtTr1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPt1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPt1_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt1_Internalname, GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTr2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTr2_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr2_Internalname, GXutil.rtrim( A354DisArtTr2), GXutil.rtrim( localUtil.format( A354DisArtTr2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPt2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPt2_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt2_Internalname, GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtTr3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtTr3_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr3_Internalname, GXutil.rtrim( A355DisArtTr3), GXutil.rtrim( localUtil.format( A355DisArtTr3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtTr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPt3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPt3_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt3_Internalname, GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPt3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtUr1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtUr1_Internalname, httpContext.getMessage( "Comp.2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr1_Internalname, GXutil.rtrim( A356DisArtUr1), GXutil.rtrim( localUtil.format( A356DisArtUr1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPu1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPu1_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu1_Internalname, GXutil.ltrim( localUtil.ntoc( A347DisArtPu1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtUr2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtUr2_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr2_Internalname, GXutil.rtrim( A357DisArtUr2), GXutil.rtrim( localUtil.format( A357DisArtUr2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPu2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPu2_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu2_Internalname, GXutil.ltrim( localUtil.ntoc( A348DisArtPu2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtUr3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtUr3_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr3_Internalname, GXutil.rtrim( A358DisArtUr3), GXutil.rtrim( localUtil.format( A358DisArtUr3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtUr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPu3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPu3_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu3_Internalname, GXutil.ltrim( localUtil.ntoc( A349DisArtPu3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPu3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable19_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMarcaid_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMarcaId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMarcaId_Internalname, httpContext.getMessage( "Marca", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMarcaId_Internalname, GXutil.rtrim( A11659MarcaId), GXutil.rtrim( localUtil.format( A11659MarcaId, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMarcaId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMarcaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMarcaDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMarcaDsc_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMarcaDsc_Internalname, GXutil.rtrim( A11660MarcaDsc), GXutil.rtrim( localUtil.format( A11660MarcaDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtMarcaDsc_Link, "", "", "", edtMarcaDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMarcaDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divRevenid_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRevenID_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtRevenID_Internalname, httpContext.getMessage( "Revendedor", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtRevenID_Internalname, GXutil.rtrim( A12328RevenID), GXutil.rtrim( localUtil.format( A12328RevenID, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRevenID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRevenID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRevenNm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtRevenNm_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtRevenNm_Internalname, GXutil.rtrim( A12327RevenNm), GXutil.rtrim( localUtil.format( A12327RevenNm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtRevenNm_Link, "", "", "", edtRevenNm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRevenNm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         ucDvpanel_transactiondetail_tablecolores.setProperty("Width", Dvpanel_transactiondetail_tablecolores_Width);
         ucDvpanel_transactiondetail_tablecolores.setProperty("AutoWidth", Dvpanel_transactiondetail_tablecolores_Autowidth);
         ucDvpanel_transactiondetail_tablecolores.setProperty("AutoHeight", Dvpanel_transactiondetail_tablecolores_Autoheight);
         ucDvpanel_transactiondetail_tablecolores.setProperty("Cls", Dvpanel_transactiondetail_tablecolores_Cls);
         ucDvpanel_transactiondetail_tablecolores.setProperty("Title", Dvpanel_transactiondetail_tablecolores_Title);
         ucDvpanel_transactiondetail_tablecolores.setProperty("Collapsible", Dvpanel_transactiondetail_tablecolores_Collapsible);
         ucDvpanel_transactiondetail_tablecolores.setProperty("Collapsed", Dvpanel_transactiondetail_tablecolores_Collapsed);
         ucDvpanel_transactiondetail_tablecolores.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tablecolores_Showcollapseicon);
         ucDvpanel_transactiondetail_tablecolores.setProperty("IconPosition", Dvpanel_transactiondetail_tablecolores_Iconposition);
         ucDvpanel_transactiondetail_tablecolores.setProperty("AutoScroll", Dvpanel_transactiondetail_tablecolores_Autoscroll);
         ucDvpanel_transactiondetail_tablecolores.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tablecolores_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORESContainer"+"TransactionDetail_TableColores"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablecolores_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplitteddiscolnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdiscolnom_Internalname, httpContext.getMessage( "Cor", ""), "", "", lblTextblockdiscolnom_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_228_1Y32( true) ;
      }
      else
      {
         wb_table1_228_1Y32( false) ;
      }
      return  ;
   }

   public void wb_table1_228_1Y32e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisColNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisColNum_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTipCor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisTipCor_Internalname, httpContext.getMessage( "E", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCor_Internalname, GXutil.rtrim( A5290DisTipCor), GXutil.rtrim( localUtil.format( A5290DisTipCor, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTipCor_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTipCol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisTipCol_Internalname, ".", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNomCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNomCli_Internalname, httpContext.getMessage( "Cor Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNomCli_Internalname, GXutil.rtrim( A1195DisNomCli), GXutil.rtrim( localUtil.format( A1195DisNomCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumCli_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisObs_Internalname, httpContext.getMessage( "Cartaz", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisObs_Internalname, GXutil.rtrim( A1052DisObs), GXutil.rtrim( localUtil.format( A1052DisObs, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisObs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablecolormoda21_Internalname, divTransactiondetail_tablecolormoda21_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplitteddismancod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdismancod1_Internalname, httpContext.getMessage( "Programa", ""), "", "", lblTextblockdismancod1_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_268_1Y32( true) ;
      }
      else
      {
         wb_table2_268_1Y32( false) ;
      }
      return  ;
   }

   public void wb_table2_268_1Y32e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNroCor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNroCor_Internalname, ".", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNroCor_Internalname, GXutil.ltrim( localUtil.ntoc( A4785DisNroCor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNroCor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4785DisNroCor), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4785DisNroCor), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNroCor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNroCor_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrgtinmd21_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrgtinmd21_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 282,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrgtinmd21_Internalname, GXutil.rtrim( AV14PrgTinMd21), GXutil.rtrim( localUtil.format( AV14PrgTinMd21, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,282);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrgtinmd21_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrgtinmd21_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         ucDvpanel_transactiondetail_tablenext.setProperty("Width", Dvpanel_transactiondetail_tablenext_Width);
         ucDvpanel_transactiondetail_tablenext.setProperty("AutoWidth", Dvpanel_transactiondetail_tablenext_Autowidth);
         ucDvpanel_transactiondetail_tablenext.setProperty("AutoHeight", Dvpanel_transactiondetail_tablenext_Autoheight);
         ucDvpanel_transactiondetail_tablenext.setProperty("Cls", Dvpanel_transactiondetail_tablenext_Cls);
         ucDvpanel_transactiondetail_tablenext.setProperty("Title", Dvpanel_transactiondetail_tablenext_Title);
         ucDvpanel_transactiondetail_tablenext.setProperty("Collapsible", Dvpanel_transactiondetail_tablenext_Collapsible);
         ucDvpanel_transactiondetail_tablenext.setProperty("Collapsed", Dvpanel_transactiondetail_tablenext_Collapsed);
         ucDvpanel_transactiondetail_tablenext.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tablenext_Showcollapseicon);
         ucDvpanel_transactiondetail_tablenext.setProperty("IconPosition", Dvpanel_transactiondetail_tablenext_Iconposition);
         ucDvpanel_transactiondetail_tablenext.setProperty("AutoScroll", Dvpanel_transactiondetail_tablenext_Autoscroll);
         ucDvpanel_transactiondetail_tablenext.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tablenext_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXTContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXTContainer"+"TransactionDetail_TableNext"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablenext_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNxt_modelo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNxt_modelo_Internalname, httpContext.getMessage( "Modelo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNxt_modelo_Internalname, GXutil.rtrim( A11859Nxt_modelo), GXutil.rtrim( localUtil.format( A11859Nxt_modelo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNxt_modelo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNxt_modelo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCpteId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCpteId_Internalname, httpContext.getMessage( "Componente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCpteId_Internalname, GXutil.ltrim( localUtil.ntoc( A11860CpteId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCpteId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11860CpteId), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11860CpteId), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCpteId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCpteId_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCpteDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCpteDsc_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCpteDsc_Internalname, GXutil.rtrim( A11865CpteDsc), GXutil.rtrim( localUtil.format( A11865CpteDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCpteDsc_Link, "", "", "", edtCpteDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCpteDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNxt_statio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNxt_statio_Internalname, httpContext.getMessage( "Estação", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNxt_statio_Internalname, GXutil.rtrim( A11861Nxt_statio), GXutil.rtrim( localUtil.format( A11861Nxt_statio, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNxt_statio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNxt_statio_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDesaID_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDesaID_Internalname, httpContext.getMessage( "Desenvolvimento", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDesaID_Internalname, GXutil.ltrim( localUtil.ntoc( A11862DesaID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDesaID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11862DesaID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11862DesaID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDesaID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDesaID_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDesaDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDesaDsc_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDesaDsc_Internalname, GXutil.rtrim( A11866DesaDsc), GXutil.rtrim( localUtil.format( A11866DesaDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtDesaDsc_Link, "", "", "", edtDesaDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDesaDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDptoID_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDptoID_Internalname, httpContext.getMessage( "Departamento", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDptoID_Internalname, GXutil.ltrim( localUtil.ntoc( A11863DptoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDptoID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11863DptoID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11863DptoID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDptoID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDptoID_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDptoDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDptoDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDptoDsc_Internalname, GXutil.rtrim( A11867DptoDsc), GXutil.rtrim( localUtil.format( A11867DptoDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtDptoDsc_Link, "", "", "", edtDptoDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDptoDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNxt_artcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtNxt_artcli_Internalname, httpContext.getMessage( "Artigo Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtNxt_artcli_Internalname, GXutil.rtrim( A11864Nxt_artcli), GXutil.rtrim( localUtil.format( A11864Nxt_artcli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNxt_artcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNxt_artcli_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         ucDvpanel_transactiondetail_tableprecio.setProperty("Width", Dvpanel_transactiondetail_tableprecio_Width);
         ucDvpanel_transactiondetail_tableprecio.setProperty("AutoWidth", Dvpanel_transactiondetail_tableprecio_Autowidth);
         ucDvpanel_transactiondetail_tableprecio.setProperty("AutoHeight", Dvpanel_transactiondetail_tableprecio_Autoheight);
         ucDvpanel_transactiondetail_tableprecio.setProperty("Cls", Dvpanel_transactiondetail_tableprecio_Cls);
         ucDvpanel_transactiondetail_tableprecio.setProperty("Title", Dvpanel_transactiondetail_tableprecio_Title);
         ucDvpanel_transactiondetail_tableprecio.setProperty("Collapsible", Dvpanel_transactiondetail_tableprecio_Collapsible);
         ucDvpanel_transactiondetail_tableprecio.setProperty("Collapsed", Dvpanel_transactiondetail_tableprecio_Collapsed);
         ucDvpanel_transactiondetail_tableprecio.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tableprecio_Showcollapseicon);
         ucDvpanel_transactiondetail_tableprecio.setProperty("IconPosition", Dvpanel_transactiondetail_tableprecio_Iconposition);
         ucDvpanel_transactiondetail_tableprecio.setProperty("AutoScroll", Dvpanel_transactiondetail_tableprecio_Autoscroll);
         ucDvpanel_transactiondetail_tableprecio.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tableprecio_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIOContainer"+"TransactionDetail_TablePrecio"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableprecio_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisAcaBak.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisAcaBak.getInternalname(), httpContext.getMessage( "Preço único", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisAcaBak.getInternalname(), A4477DisAcaBak, "", httpContext.getMessage( "Preço único", ""), 1, chkDisAcaBak.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPreKgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPreKgm_Internalname, httpContext.getMessage( "Preço Quilo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreKgm_Enabled!=0) ? localUtil.format( A388DisPreKgm, "ZZZZZZ9.99") : localUtil.format( A388DisPreKgm, "ZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPreKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPreMtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPreMtr_Internalname, httpContext.getMessage( "Preço Metro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreMtr_Enabled!=0) ? localUtil.format( A389DisPreMtr, "ZZZZZZ9.99") : localUtil.format( A389DisPreMtr, "ZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPreMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
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
         ucDvpanel_transactiondetail_tableacabado.setProperty("Width", Dvpanel_transactiondetail_tableacabado_Width);
         ucDvpanel_transactiondetail_tableacabado.setProperty("AutoWidth", Dvpanel_transactiondetail_tableacabado_Autowidth);
         ucDvpanel_transactiondetail_tableacabado.setProperty("AutoHeight", Dvpanel_transactiondetail_tableacabado_Autoheight);
         ucDvpanel_transactiondetail_tableacabado.setProperty("Cls", Dvpanel_transactiondetail_tableacabado_Cls);
         ucDvpanel_transactiondetail_tableacabado.setProperty("Title", Dvpanel_transactiondetail_tableacabado_Title);
         ucDvpanel_transactiondetail_tableacabado.setProperty("Collapsible", Dvpanel_transactiondetail_tableacabado_Collapsible);
         ucDvpanel_transactiondetail_tableacabado.setProperty("Collapsed", Dvpanel_transactiondetail_tableacabado_Collapsed);
         ucDvpanel_transactiondetail_tableacabado.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tableacabado_Showcollapseicon);
         ucDvpanel_transactiondetail_tableacabado.setProperty("IconPosition", Dvpanel_transactiondetail_tableacabado_Iconposition);
         ucDvpanel_transactiondetail_tableacabado.setProperty("AutoScroll", Dvpanel_transactiondetail_tableacabado_Autoscroll);
         ucDvpanel_transactiondetail_tableacabado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tableacabado_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADOContainer"+"TransactionDetail_TableAcabado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableacabado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraAca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraAca_Internalname, httpContext.getMessage( "Grm2 acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1906DisGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1906DisGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1906DisGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraAca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraAca2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraAca2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3131DisGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3131DisGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3131DisGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraAca2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisObsGrm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisObsGrm_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisObsGrm_Internalname, GXutil.rtrim( A5349DisObsGrm), GXutil.rtrim( localUtil.format( A5349DisObsGrm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObsGrm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisObsGrm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAnh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAnh_Internalname, httpContext.getMessage( "Larg. acab.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAnh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAnh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAn1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAn1_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAn1_Internalname, GXutil.ltrim( localUtil.ntoc( A1231DisArtAn1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAn1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1231DisArtAn1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1231DisArtAn1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAn1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAn1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisObsAnc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisObsAnc_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisObsAnc_Internalname, GXutil.rtrim( A5350DisObsAnc), GXutil.rtrim( localUtil.format( A5350DisObsAnc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObsAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisObsAnc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPes_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPes_Internalname, GXutil.ltrim( localUtil.ntoc( A342DisArtPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisArtEnc.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisArtEnc.getInternalname(), httpContext.getMessage( "Res. our.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisArtEnc.getInternalname(), A338DisArtEnc, "", httpContext.getMessage( "Res. our.", ""), 1, chkDisArtEnc.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisArtCor.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisArtCor.getInternalname(), httpContext.getMessage( "Cor. our.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisArtCor.getInternalname(), A336DisArtCor, "", httpContext.getMessage( "Cor. our.", ""), 1, chkDisArtCor.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEncAnh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisEncAnh_Internalname, httpContext.getMessage( "Encog. ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1198DisEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEncAnh_Enabled!=0) ? localUtil.format( A1198DisEncAnh, "ZZ9.99") : localUtil.format( A1198DisEncAnh, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncAnh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEncAnh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEncCom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisEncCom_Internalname, httpContext.getMessage( "Encog. largo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1197DisEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEncCom_Enabled!=0) ? localUtil.format( A1197DisEncCom, "ZZ9.99") : localUtil.format( A1197DisEncCom, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncCom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEncCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisRdoA_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisRdoA_Internalname, httpContext.getMessage( "Torção", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1908DisRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisRdoA_Enabled!=0) ? localUtil.format( A1908DisRdoA, "ZZ9.99") : localUtil.format( A1908DisRdoA, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRdoA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbDisAntpT.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbDisAntpT.getInternalname(), ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisAntpT, cmbDisAntpT.getInternalname(), GXutil.rtrim( A5405DisAntpT), 1, cmbDisAntpT.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbDisAntpT.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisGeneral.htm");
         cmbDisAntpT.setValue( GXutil.rtrim( A5405DisAntpT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisAntpT.getInternalname(), "Values", cmbDisAntpT.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtPle_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtPle_Internalname, httpContext.getMessage( "Presentación ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPle_Internalname, GXutil.rtrim( A343DisArtPle), GXutil.rtrim( localUtil.format( A343DisArtPle, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPle_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtPle_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbDisCruEnr.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbDisCruEnr.getInternalname(), ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisCruEnr, cmbDisCruEnr.getInternalname(), GXutil.rtrim( A4471DisCruEnr), 1, cmbDisCruEnr.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbDisCruEnr.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisGeneral.htm");
         cmbDisCruEnr.setValue( GXutil.rtrim( A4471DisCruEnr) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisCruEnr.getInternalname(), "Values", cmbDisCruEnr.ToJavascriptSource(), true);
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
         ucDvpanel_transactiondetail_tableinditex.setProperty("Width", Dvpanel_transactiondetail_tableinditex_Width);
         ucDvpanel_transactiondetail_tableinditex.setProperty("AutoWidth", Dvpanel_transactiondetail_tableinditex_Autowidth);
         ucDvpanel_transactiondetail_tableinditex.setProperty("AutoHeight", Dvpanel_transactiondetail_tableinditex_Autoheight);
         ucDvpanel_transactiondetail_tableinditex.setProperty("Cls", Dvpanel_transactiondetail_tableinditex_Cls);
         ucDvpanel_transactiondetail_tableinditex.setProperty("Title", Dvpanel_transactiondetail_tableinditex_Title);
         ucDvpanel_transactiondetail_tableinditex.setProperty("Collapsible", Dvpanel_transactiondetail_tableinditex_Collapsible);
         ucDvpanel_transactiondetail_tableinditex.setProperty("Collapsed", Dvpanel_transactiondetail_tableinditex_Collapsed);
         ucDvpanel_transactiondetail_tableinditex.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tableinditex_Showcollapseicon);
         ucDvpanel_transactiondetail_tableinditex.setProperty("IconPosition", Dvpanel_transactiondetail_tableinditex_Iconposition);
         ucDvpanel_transactiondetail_tableinditex.setProperty("AutoScroll", Dvpanel_transactiondetail_tableinditex_Autoscroll);
         ucDvpanel_transactiondetail_tableinditex.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tableinditex_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEXContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEXContainer"+"TransactionDetail_TableInditex"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableinditex_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDisacaanh_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisAcaAnh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisAcaAnh_Internalname, httpContext.getMessage( "Cuaderno", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisAcaAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A4478DisAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisAcaAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4478DisAcaAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4478DisAcaAnh), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAcaAnh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisAcaAnh_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTb1_Dscf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTb1_Dscf_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTb1_Dscf_Internalname, GXutil.rtrim( A9717Tb1_Dscf), GXutil.rtrim( localUtil.format( A9717Tb1_Dscf, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTb1_Dscf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTb1_Dscf_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisItem3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisItem3_Internalname, httpContext.getMessage( "N° Enc. Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisItem3_Internalname, GXutil.rtrim( A9773DisItem3), GXutil.rtrim( localUtil.format( A9773DisItem3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisItem3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisItem3_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divCod_idtx_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCod_Idtx_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCod_Idtx_Internalname, httpContext.getMessage( "CTW", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCod_Idtx_Internalname, GXutil.rtrim( A10887Cod_Idtx), GXutil.rtrim( localUtil.format( A10887Cod_Idtx, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCod_Idtx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCod_Idtx_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-md-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisOrdComp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisOrdComp_Internalname, httpContext.getMessage( "P.O.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisOrdComp_Internalname, A11661DisOrdComp, GXutil.rtrim( localUtil.format( A11661DisOrdComp, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisOrdComp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisOrdComp_Enabled, 0, "text", "", 100, "%", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divDisidtx2_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisIdtx2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisIdtx2_Internalname, httpContext.getMessage( "Cert. processo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisIdtx2_Internalname, GXutil.rtrim( A13986DisIdtx2), GXutil.rtrim( localUtil.format( A13986DisIdtx2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisIdtx2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisIdtx2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("Width", Dvpanel_transactiondetail_tableotrosdatos_Width);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("AutoWidth", Dvpanel_transactiondetail_tableotrosdatos_Autowidth);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("AutoHeight", Dvpanel_transactiondetail_tableotrosdatos_Autoheight);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("Cls", Dvpanel_transactiondetail_tableotrosdatos_Cls);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("Title", Dvpanel_transactiondetail_tableotrosdatos_Title);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("Collapsible", Dvpanel_transactiondetail_tableotrosdatos_Collapsible);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("Collapsed", Dvpanel_transactiondetail_tableotrosdatos_Collapsed);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tableotrosdatos_Showcollapseicon);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("IconPosition", Dvpanel_transactiondetail_tableotrosdatos_Iconposition);
         ucDvpanel_transactiondetail_tableotrosdatos.setProperty("AutoScroll", Dvpanel_transactiondetail_tableotrosdatos_Autoscroll);
         ucDvpanel_transactiondetail_tableotrosdatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tableotrosdatos_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOSContainer"+"TransactionDetail_TableOtrosDatos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableotrosdatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisLoc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisLoc_Internalname, httpContext.getMessage( "Local. actual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisLoc_Internalname, GXutil.rtrim( A1430DisLoc), GXutil.rtrim( localUtil.format( A1430DisLoc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisPart_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisPart_Internalname, httpContext.getMessage( "Partida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisPart_Internalname, GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPart_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisPart_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisDes.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkDisDes.getInternalname(), httpContext.getMessage( "¿Detalle?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", httpContext.getMessage( "¿Detalle?", ""), 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumPie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumPie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisNumUni_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisNumUni_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumUni_Enabled!=0) ? localUtil.format( A375DisNumUni, "ZZZZZ9.99") : localUtil.format( A375DisNumUni, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbDisUniMed.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbDisUniMed.getInternalname(), ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisUniMed, cmbDisUniMed.getInternalname(), GXutil.rtrim( A392DisUniMed), 1, cmbDisUniMed.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbDisUniMed.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisGeneral.htm");
         cmbDisUniMed.setValue( GXutil.rtrim( A392DisUniMed) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisUniMed.getInternalname(), "Values", cmbDisUniMed.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCodDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMaqCodDis_Internalname, httpContext.getMessage( "Máquina", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodDis_Internalname, GXutil.rtrim( A1122MaqCodDis), GXutil.rtrim( localUtil.format( A1122MaqCodDis, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCodDis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAcb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAcb_Internalname, httpContext.getMessage( "Largura cru", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAcb_Internalname, GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAcb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAcb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAcb_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtAc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtAc2_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAc2_Internalname, GXutil.ltrim( localUtil.ntoc( A1233DisArtAc2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAc2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1233DisArtAc2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1233DisArtAc2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtAc2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraCru_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraCru_Internalname, httpContext.getMessage( "Grm2 cru", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraCru_Internalname, GXutil.ltrim( localUtil.ntoc( A1225DisGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraCru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1225DisGraCru), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1225DisGraCru), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraCru_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraCru_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisGraCru2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisGraCru2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraCru2_Internalname, GXutil.ltrim( localUtil.ntoc( A3132DisGraCru2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraCru2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3132DisGraCru2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3132DisGraCru2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraCru2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisGraCru2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableinvisible_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 554,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, bttBtnupdate_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111y31_client"+"'", TempTags, "", 2, "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 556,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtndelete_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121y31_client"+"'", TempTags, "", 2, "HLP_Pedidos\\DisGeneral.htm");
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
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV18Pgmname), GXutil.rtrim( localUtil.format( AV18Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 564,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV11EmprCod), GXutil.rtrim( localUtil.format( AV11EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,564);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprcod_Visible, 1, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCD_Internalname, GXutil.rtrim( A12116DisTipCD), GXutil.rtrim( localUtil.format( A12116DisTipCD, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCD_Jsonclick, 0, "Attribute", "", "", "", "", edtDisTipCD_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1Y32( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Dis General", ""), (short)(0)) ;
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
            strup1Y30( ) ;
         }
      }
   }

   public void ws1Y32( )
   {
      start1Y32( ) ;
      evt1Y32( ) ;
   }

   public void evt1Y32( )
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
                              strup1Y30( ) ;
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
                              strup1Y30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131Y32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141Y32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y30( ) ;
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
                              strup1Y30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavPrgtinmd21_Internalname ;
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

   public void we1Y32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1Y32( ) ;
         }
      }
   }

   public void pa1Y32( )
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
            GX_FocusControl = edtavPrgtinmd21_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgadisartaca1Y30( String A396EmprCod ,
                                   String A766ProForDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgadisartaca_data1Y30( A396EmprCod, A766ProForDsc) ;
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

   protected void gxsgadisartaca_data1Y30( String A396EmprCod ,
                                           String A766ProForDsc )
   {
      l766ProForDsc = GXutil.padr( GXutil.rtrim( A766ProForDsc), 30, "%") ;
      /* Using cursor H01Y32 */
      pr_default.execute(0, new Object[] {A396EmprCod, l766ProForDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01Y32_A766ProForDsc[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01Y32_A766ProForDsc[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcadisartaca1Y32( String A396EmprCod ,
                                   String A766ProForDsc )
   {
      /* Using cursor H01Y33 */
      pr_default.execute(1, new Object[] {A766ProForDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A766ProForDsc = H01Y33_A766ProForDsc[0] ;
         A13133ProForAct = H01Y33_A13133ProForAct[0] ;
         A396EmprCod = H01Y33_A396EmprCod[0] ;
         A764ProForCod = H01Y33_A764ProForCod[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A764ProForCod))+"\"") ;
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
      if ( cmbPriCod.getItemCount() > 0 )
      {
         A757PriCod = cmbPriCod.getValidValue(A757PriCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A757PriCod", A757PriCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPriCod.setValue( GXutil.rtrim( A757PriCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPriCod.getInternalname(), "Values", cmbPriCod.ToJavascriptSource(), true);
      }
      A5032DisEstTip = ((GXutil.strcmp(GXutil.rtrim( A5032DisEstTip), "S")==0) ? "S" : "*") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5032DisEstTip", A5032DisEstTip);
      A7739DisExp = ((GXutil.strcmp(GXutil.rtrim( A7739DisExp), "E")==0) ? "E" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
      A4014DisTin = ((GXutil.strcmp(GXutil.rtrim( A4014DisTin), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4014DisTin", A4014DisTin);
      A4477DisAcaBak = ((GXutil.strcmp(GXutil.rtrim( A4477DisAcaBak), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4477DisAcaBak", A4477DisAcaBak);
      A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
      A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
      if ( cmbDisAntpT.getItemCount() > 0 )
      {
         A5405DisAntpT = cmbDisAntpT.getValidValue(A5405DisAntpT) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5405DisAntpT", A5405DisAntpT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisAntpT.setValue( GXutil.rtrim( A5405DisAntpT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisAntpT.getInternalname(), "Values", cmbDisAntpT.ToJavascriptSource(), true);
      }
      if ( cmbDisCruEnr.getItemCount() > 0 )
      {
         A4471DisCruEnr = cmbDisCruEnr.getValidValue(A4471DisCruEnr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4471DisCruEnr", A4471DisCruEnr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisCruEnr.setValue( GXutil.rtrim( A4471DisCruEnr) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisCruEnr.getInternalname(), "Values", cmbDisCruEnr.ToJavascriptSource(), true);
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
      if ( cmbDisUniMed.getItemCount() > 0 )
      {
         A392DisUniMed = cmbDisUniMed.getValidValue(A392DisUniMed) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisUniMed.setValue( GXutil.rtrim( A392DisUniMed) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDisUniMed.getInternalname(), "Values", cmbDisUniMed.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1Y32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV18Pgmname = "Pedidos.DisGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Pgmname", AV18Pgmname);
      Gx_err = (short)(0) ;
      edtavPrgtinmd21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrgtinmd21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrgtinmd21_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1Y32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01Y34 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A3132DisGraCru2 = H01Y34_A3132DisGraCru2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
            A1225DisGraCru = H01Y34_A1225DisGraCru[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
            A1233DisArtAc2 = H01Y34_A1233DisArtAc2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
            A1232DisArtAcb = H01Y34_A1232DisArtAcb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
            A1122MaqCodDis = H01Y34_A1122MaqCodDis[0] ;
            n1122MaqCodDis = H01Y34_n1122MaqCodDis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1122MaqCodDis", A1122MaqCodDis);
            A392DisUniMed = H01Y34_A392DisUniMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
            A375DisNumUni = H01Y34_A375DisNumUni[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
            A374DisNumPie = H01Y34_A374DisNumPie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
            A365DisDes = H01Y34_A365DisDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
            A1502DisPart = H01Y34_A1502DisPart[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
            A1430DisLoc = H01Y34_A1430DisLoc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
            A13986DisIdtx2 = H01Y34_A13986DisIdtx2[0] ;
            n13986DisIdtx2 = H01Y34_n13986DisIdtx2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13986DisIdtx2", A13986DisIdtx2);
            A11661DisOrdComp = H01Y34_A11661DisOrdComp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11661DisOrdComp", A11661DisOrdComp);
            A10887Cod_Idtx = H01Y34_A10887Cod_Idtx[0] ;
            n10887Cod_Idtx = H01Y34_n10887Cod_Idtx[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10887Cod_Idtx", A10887Cod_Idtx);
            A9773DisItem3 = H01Y34_A9773DisItem3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9773DisItem3", A9773DisItem3);
            A4471DisCruEnr = H01Y34_A4471DisCruEnr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4471DisCruEnr", A4471DisCruEnr);
            A343DisArtPle = H01Y34_A343DisArtPle[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A343DisArtPle", A343DisArtPle);
            A5405DisAntpT = H01Y34_A5405DisAntpT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5405DisAntpT", A5405DisAntpT);
            A1908DisRdoA = H01Y34_A1908DisRdoA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
            A1197DisEncCom = H01Y34_A1197DisEncCom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
            A1198DisEncAnh = H01Y34_A1198DisEncAnh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
            A336DisArtCor = H01Y34_A336DisArtCor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
            A338DisArtEnc = H01Y34_A338DisArtEnc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
            A342DisArtPes = H01Y34_A342DisArtPes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
            A5350DisObsAnc = H01Y34_A5350DisObsAnc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5350DisObsAnc", A5350DisObsAnc);
            A1231DisArtAn1 = H01Y34_A1231DisArtAn1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
            A334DisArtAnh = H01Y34_A334DisArtAnh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
            A5349DisObsGrm = H01Y34_A5349DisObsGrm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5349DisObsGrm", A5349DisObsGrm);
            A3131DisGraAca2 = H01Y34_A3131DisGraAca2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
            A1906DisGraAca = H01Y34_A1906DisGraAca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
            A389DisPreMtr = H01Y34_A389DisPreMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
            A388DisPreKgm = H01Y34_A388DisPreKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            A4477DisAcaBak = H01Y34_A4477DisAcaBak[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4477DisAcaBak", A4477DisAcaBak);
            A11864Nxt_artcli = H01Y34_A11864Nxt_artcli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11864Nxt_artcli", A11864Nxt_artcli);
            A11867DptoDsc = H01Y34_A11867DptoDsc[0] ;
            n11867DptoDsc = H01Y34_n11867DptoDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11867DptoDsc", A11867DptoDsc);
            A11863DptoID = H01Y34_A11863DptoID[0] ;
            n11863DptoID = H01Y34_n11863DptoID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11863DptoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11863DptoID), 4, 0));
            A11866DesaDsc = H01Y34_A11866DesaDsc[0] ;
            n11866DesaDsc = H01Y34_n11866DesaDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11866DesaDsc", A11866DesaDsc);
            A11862DesaID = H01Y34_A11862DesaID[0] ;
            n11862DesaID = H01Y34_n11862DesaID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11862DesaID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11862DesaID), 4, 0));
            A11861Nxt_statio = H01Y34_A11861Nxt_statio[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11861Nxt_statio", A11861Nxt_statio);
            A11865CpteDsc = H01Y34_A11865CpteDsc[0] ;
            n11865CpteDsc = H01Y34_n11865CpteDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11865CpteDsc", A11865CpteDsc);
            A11860CpteId = H01Y34_A11860CpteId[0] ;
            n11860CpteId = H01Y34_n11860CpteId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11860CpteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11860CpteId), 4, 0));
            A11859Nxt_modelo = H01Y34_A11859Nxt_modelo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11859Nxt_modelo", A11859Nxt_modelo);
            A4785DisNroCor = H01Y34_A4785DisNroCor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4785DisNroCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4785DisNroCor), 6, 0));
            A3307DisManCod1 = H01Y34_A3307DisManCod1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
            A1052DisObs = H01Y34_A1052DisObs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1052DisObs", A1052DisObs);
            A1196DisNumCli = H01Y34_A1196DisNumCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
            A1195DisNomCli = H01Y34_A1195DisNomCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1195DisNomCli", A1195DisNomCli);
            A5290DisTipCor = H01Y34_A5290DisTipCor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5290DisTipCor", A5290DisTipCor);
            A363DisColNum = H01Y34_A363DisColNum[0] ;
            n363DisColNum = H01Y34_n363DisColNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
            A362DisColNom = H01Y34_A362DisColNom[0] ;
            n362DisColNom = H01Y34_n362DisColNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A362DisColNom", A362DisColNom);
            A12327RevenNm = H01Y34_A12327RevenNm[0] ;
            n12327RevenNm = H01Y34_n12327RevenNm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12327RevenNm", A12327RevenNm);
            A12328RevenID = H01Y34_A12328RevenID[0] ;
            n12328RevenID = H01Y34_n12328RevenID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12328RevenID", A12328RevenID);
            A11660MarcaDsc = H01Y34_A11660MarcaDsc[0] ;
            n11660MarcaDsc = H01Y34_n11660MarcaDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11660MarcaDsc", A11660MarcaDsc);
            A11659MarcaId = H01Y34_A11659MarcaId[0] ;
            n11659MarcaId = H01Y34_n11659MarcaId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11659MarcaId", A11659MarcaId);
            A349DisArtPu3 = H01Y34_A349DisArtPu3[0] ;
            n349DisArtPu3 = H01Y34_n349DisArtPu3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
            A358DisArtUr3 = H01Y34_A358DisArtUr3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A358DisArtUr3", A358DisArtUr3);
            A348DisArtPu2 = H01Y34_A348DisArtPu2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
            A357DisArtUr2 = H01Y34_A357DisArtUr2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A357DisArtUr2", A357DisArtUr2);
            A347DisArtPu1 = H01Y34_A347DisArtPu1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
            A356DisArtUr1 = H01Y34_A356DisArtUr1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A356DisArtUr1", A356DisArtUr1);
            A346DisArtPt3 = H01Y34_A346DisArtPt3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
            A355DisArtTr3 = H01Y34_A355DisArtTr3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A355DisArtTr3", A355DisArtTr3);
            A345DisArtPt2 = H01Y34_A345DisArtPt2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
            A354DisArtTr2 = H01Y34_A354DisArtTr2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A354DisArtTr2", A354DisArtTr2);
            A344DisArtPt1 = H01Y34_A344DisArtPt1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
            A353DisArtTr1 = H01Y34_A353DisArtTr1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A353DisArtTr1", A353DisArtTr1);
            A333DisArtAca = H01Y34_A333DisArtAca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333DisArtAca", A333DisArtAca);
            A340DisArtMat = H01Y34_A340DisArtMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340DisArtMat", A340DisArtMat);
            A337DisArtDsc = H01Y34_A337DisArtDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337DisArtDsc", A337DisArtDsc);
            A335DisArtCod = H01Y34_A335DisArtCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
            A2310DisCliDes = H01Y34_A2310DisCliDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2310DisCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2310DisCliDes), 6, 0));
            A279CliNom = H01Y34_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A252CliCod = H01Y34_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4014DisTin = H01Y34_A4014DisTin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4014DisTin", A4014DisTin);
            A7739DisExp = H01Y34_A7739DisExp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
            A5032DisEstTip = H01Y34_A5032DisEstTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5032DisEstTip", A5032DisEstTip);
            A371DisFecEnt = H01Y34_A371DisFecEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
            A369DisFec = H01Y34_A369DisFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
            A370DisFecCli = H01Y34_A370DisFecCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
            A2009DisTipDis = H01Y34_A2009DisTipDis[0] ;
            n2009DisTipDis = H01Y34_n2009DisTipDis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2009DisTipDis", A2009DisTipDis);
            A360DisCliNum = H01Y34_A360DisCliNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
            A4813DisEncCli = H01Y34_A4813DisEncCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4813DisEncCli", A4813DisEncCli);
            A757PriCod = H01Y34_A757PriCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A757PriCod", A757PriCod);
            A4197DisCliDesN = H01Y34_A4197DisCliDesN[0] ;
            n4197DisCliDesN = H01Y34_n4197DisCliDesN[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4197DisCliDesN", A4197DisCliDesN);
            A352DisArtTip = H01Y34_A352DisArtTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
            A4478DisAcaAnh = H01Y34_A4478DisAcaAnh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4478DisAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4478DisAcaAnh), 4, 0));
            A390DisTipCol = H01Y34_A390DisTipCol[0] ;
            n390DisTipCol = H01Y34_n390DisTipCol[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
            A279CliNom = H01Y34_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A11660MarcaDsc = H01Y34_A11660MarcaDsc[0] ;
            n11660MarcaDsc = H01Y34_n11660MarcaDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11660MarcaDsc", A11660MarcaDsc);
            A11867DptoDsc = H01Y34_A11867DptoDsc[0] ;
            n11867DptoDsc = H01Y34_n11867DptoDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11867DptoDsc", A11867DptoDsc);
            A11865CpteDsc = H01Y34_A11865CpteDsc[0] ;
            n11865CpteDsc = H01Y34_n11865CpteDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11865CpteDsc", A11865CpteDsc);
            A11866DesaDsc = H01Y34_A11866DesaDsc[0] ;
            n11866DesaDsc = H01Y34_n11866DesaDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11866DesaDsc", A11866DesaDsc);
            A12327RevenNm = H01Y34_A12327RevenNm[0] ;
            n12327RevenNm = H01Y34_n12327RevenNm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12327RevenNm", A12327RevenNm);
            A4197DisCliDesN = H01Y34_A4197DisCliDesN[0] ;
            n4197DisCliDesN = H01Y34_n4197DisCliDesN[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4197DisCliDesN", A4197DisCliDesN);
            GXt_char1 = A12115DisArtTipD ;
            GXv_char2[0] = GXt_char1 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char2) ;
            disgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
            A12115DisArtTipD = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12115DisArtTipD", A12115DisArtTipD);
            GXt_char1 = A9717Tb1_Dscf ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A4478DisAcaAnh ;
            GXv_char4[0] = GXt_char1 ;
            new app.pptable1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            disgeneral_impl.this.A396EmprCod = GXv_char2[0] ;
            disgeneral_impl.this.A4478DisAcaAnh = GXv_int3[0] ;
            disgeneral_impl.this.GXt_char1 = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4478DisAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4478DisAcaAnh), 4, 0));
            A9717Tb1_Dscf = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9717Tb1_Dscf", A9717Tb1_Dscf);
            GXt_char1 = A12116DisTipCD ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A390DisTipCol ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char2) ;
            disgeneral_impl.this.A396EmprCod = GXv_char4[0] ;
            disgeneral_impl.this.A390DisTipCol = GXv_int5[0] ;
            disgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
            A12116DisTipCD = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12116DisTipCD", A12116DisTipCD);
            /* Execute user event: Load */
            e141Y32 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         wb1Y30( ) ;
      }
   }

   public void send_integrity_lvl_hashes1Y32( )
   {
   }

   public void before_start_formulas( )
   {
      AV18Pgmname = "Pedidos.DisGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Pgmname", AV18Pgmname);
      Gx_err = (short)(0) ;
      edtavPrgtinmd21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrgtinmd21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrgtinmd21_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1Y30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131Y32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV12VisualizarAcciones")) ;
         wcpOAV13AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV13AccionesEnPopup")) ;
         AV13AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"vACCIONESENPOPUP")) ;
         AV12VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"vVISUALIZARACCIONES")) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         Dvpanel_transactiondetail_tablecliente_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Width") ;
         Dvpanel_transactiondetail_tablecliente_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Autowidth")) ;
         Dvpanel_transactiondetail_tablecliente_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Autoheight")) ;
         Dvpanel_transactiondetail_tablecliente_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Cls") ;
         Dvpanel_transactiondetail_tablecliente_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Title") ;
         Dvpanel_transactiondetail_tablecliente_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Collapsible")) ;
         Dvpanel_transactiondetail_tablecliente_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Collapsed")) ;
         Dvpanel_transactiondetail_tablecliente_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tablecliente_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Iconposition") ;
         Dvpanel_transactiondetail_tablecliente_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE_Autoscroll")) ;
         Dvpanel_transactiondetail_tablearticulotipo_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Width") ;
         Dvpanel_transactiondetail_tablearticulotipo_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Autowidth")) ;
         Dvpanel_transactiondetail_tablearticulotipo_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Autoheight")) ;
         Dvpanel_transactiondetail_tablearticulotipo_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Cls") ;
         Dvpanel_transactiondetail_tablearticulotipo_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Title") ;
         Dvpanel_transactiondetail_tablearticulotipo_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Collapsible")) ;
         Dvpanel_transactiondetail_tablearticulotipo_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Collapsed")) ;
         Dvpanel_transactiondetail_tablearticulotipo_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tablearticulotipo_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Iconposition") ;
         Dvpanel_transactiondetail_tablearticulotipo_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO_Autoscroll")) ;
         Dvpanel_transactiondetail_tablecolores_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Width") ;
         Dvpanel_transactiondetail_tablecolores_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Autowidth")) ;
         Dvpanel_transactiondetail_tablecolores_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Autoheight")) ;
         Dvpanel_transactiondetail_tablecolores_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Cls") ;
         Dvpanel_transactiondetail_tablecolores_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Title") ;
         Dvpanel_transactiondetail_tablecolores_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Collapsible")) ;
         Dvpanel_transactiondetail_tablecolores_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Collapsed")) ;
         Dvpanel_transactiondetail_tablecolores_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tablecolores_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Iconposition") ;
         Dvpanel_transactiondetail_tablecolores_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES_Autoscroll")) ;
         Dvpanel_transactiondetail_tablenext_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Width") ;
         Dvpanel_transactiondetail_tablenext_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Autowidth")) ;
         Dvpanel_transactiondetail_tablenext_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Autoheight")) ;
         Dvpanel_transactiondetail_tablenext_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Cls") ;
         Dvpanel_transactiondetail_tablenext_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Title") ;
         Dvpanel_transactiondetail_tablenext_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Collapsible")) ;
         Dvpanel_transactiondetail_tablenext_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Collapsed")) ;
         Dvpanel_transactiondetail_tablenext_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tablenext_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Iconposition") ;
         Dvpanel_transactiondetail_tablenext_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT_Autoscroll")) ;
         Dvpanel_transactiondetail_tableprecio_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Width") ;
         Dvpanel_transactiondetail_tableprecio_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Autowidth")) ;
         Dvpanel_transactiondetail_tableprecio_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Autoheight")) ;
         Dvpanel_transactiondetail_tableprecio_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Cls") ;
         Dvpanel_transactiondetail_tableprecio_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Title") ;
         Dvpanel_transactiondetail_tableprecio_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Collapsible")) ;
         Dvpanel_transactiondetail_tableprecio_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Collapsed")) ;
         Dvpanel_transactiondetail_tableprecio_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tableprecio_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Iconposition") ;
         Dvpanel_transactiondetail_tableprecio_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO_Autoscroll")) ;
         Dvpanel_transactiondetail_tableacabado_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Width") ;
         Dvpanel_transactiondetail_tableacabado_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Autowidth")) ;
         Dvpanel_transactiondetail_tableacabado_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Autoheight")) ;
         Dvpanel_transactiondetail_tableacabado_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Cls") ;
         Dvpanel_transactiondetail_tableacabado_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Title") ;
         Dvpanel_transactiondetail_tableacabado_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Collapsible")) ;
         Dvpanel_transactiondetail_tableacabado_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Collapsed")) ;
         Dvpanel_transactiondetail_tableacabado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tableacabado_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Iconposition") ;
         Dvpanel_transactiondetail_tableacabado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO_Autoscroll")) ;
         Dvpanel_transactiondetail_tableinditex_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Width") ;
         Dvpanel_transactiondetail_tableinditex_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Autowidth")) ;
         Dvpanel_transactiondetail_tableinditex_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Autoheight")) ;
         Dvpanel_transactiondetail_tableinditex_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Cls") ;
         Dvpanel_transactiondetail_tableinditex_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Title") ;
         Dvpanel_transactiondetail_tableinditex_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Collapsible")) ;
         Dvpanel_transactiondetail_tableinditex_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Collapsed")) ;
         Dvpanel_transactiondetail_tableinditex_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tableinditex_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Iconposition") ;
         Dvpanel_transactiondetail_tableinditex_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX_Autoscroll")) ;
         Dvpanel_transactiondetail_tableotrosdatos_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Width") ;
         Dvpanel_transactiondetail_tableotrosdatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Autowidth")) ;
         Dvpanel_transactiondetail_tableotrosdatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Autoheight")) ;
         Dvpanel_transactiondetail_tableotrosdatos_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Cls") ;
         Dvpanel_transactiondetail_tableotrosdatos_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Title") ;
         Dvpanel_transactiondetail_tableotrosdatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Collapsible")) ;
         Dvpanel_transactiondetail_tableotrosdatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Collapsed")) ;
         Dvpanel_transactiondetail_tableotrosdatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tableotrosdatos_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Iconposition") ;
         Dvpanel_transactiondetail_tableotrosdatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS_Autoscroll")) ;
         /* Read variables values. */
         cmbPriCod.setValue( httpContext.cgiGet( cmbPriCod.getInternalname()) );
         A757PriCod = httpContext.cgiGet( cmbPriCod.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A757PriCod", A757PriCod);
         A4813DisEncCli = httpContext.cgiGet( edtDisEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4813DisEncCli", A4813DisEncCli);
         A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
         A2009DisTipDis = GXutil.upper( httpContext.cgiGet( edtDisTipDis_Internalname)) ;
         n2009DisTipDis = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2009DisTipDis", A2009DisTipDis);
         A370DisFecCli = localUtil.ctod( httpContext.cgiGet( edtDisFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = localUtil.ctod( httpContext.cgiGet( edtDisFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A5032DisEstTip = ((GXutil.strcmp(httpContext.cgiGet( chkDisEstTip.getInternalname()), "S")==0) ? "S" : "*") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5032DisEstTip", A5032DisEstTip);
         A7739DisExp = ((GXutil.strcmp(httpContext.cgiGet( chkDisExp.getInternalname()), "E")==0) ? "E" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7739DisExp", A7739DisExp);
         A4014DisTin = ((GXutil.strcmp(httpContext.cgiGet( chkDisTin.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4014DisTin", A4014DisTin);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         A2310DisCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2310DisCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2310DisCliDes), 6, 0));
         A4197DisCliDesN = httpContext.cgiGet( edtDisCliDesN_Internalname) ;
         n4197DisCliDesN = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4197DisCliDesN", A4197DisCliDesN);
         A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337DisArtDsc", A337DisArtDsc);
         A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340DisArtMat", A340DisArtMat);
         h333DisArtAca = httpContext.cgiGet( edtDisArtAca_Internalname) ;
         if ( (GXutil.strcmp("", h333DisArtAca)==0) )
         {
            A333DisArtAca = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333DisArtAca", A333DisArtAca);
         }
         else
         {
            A766ProForDsc = h333DisArtAca ;
            /* Using cursor H01Y35 */
            pr_default.execute(3, new Object[] {A766ProForDsc, A396EmprCod});
            A333DisArtAca = H01Y35_A764ProForCod[0] ;
            if ( ! ( (pr_default.getStatus(3) == 101) ) )
            {
               pr_default.readNext(3);
               if ( ! ( (pr_default.getStatus(3) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Proceso Quimico", "")}), 1, "DISARTACA");
               }
            }
            else
            {
            }
            pr_default.close(3);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h333DisArtAca", h333DisArtAca);
         A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A12115DisArtTipD = httpContext.cgiGet( edtDisArtTipD_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12115DisArtTipD", A12115DisArtTipD);
         A353DisArtTr1 = httpContext.cgiGet( edtDisArtTr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A353DisArtTr1", A353DisArtTr1);
         A344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         A354DisArtTr2 = httpContext.cgiGet( edtDisArtTr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A354DisArtTr2", A354DisArtTr2);
         A345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         A355DisArtTr3 = httpContext.cgiGet( edtDisArtTr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A355DisArtTr3", A355DisArtTr3);
         A346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         A356DisArtUr1 = httpContext.cgiGet( edtDisArtUr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A356DisArtUr1", A356DisArtUr1);
         A347DisArtPu1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
         A357DisArtUr2 = httpContext.cgiGet( edtDisArtUr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A357DisArtUr2", A357DisArtUr2);
         A348DisArtPu2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
         A358DisArtUr3 = httpContext.cgiGet( edtDisArtUr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A358DisArtUr3", A358DisArtUr3);
         A349DisArtPu3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n349DisArtPu3 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
         A11659MarcaId = GXutil.upper( httpContext.cgiGet( edtMarcaId_Internalname)) ;
         n11659MarcaId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11659MarcaId", A11659MarcaId);
         A11660MarcaDsc = httpContext.cgiGet( edtMarcaDsc_Internalname) ;
         n11660MarcaDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11660MarcaDsc", A11660MarcaDsc);
         A12328RevenID = httpContext.cgiGet( edtRevenID_Internalname) ;
         n12328RevenID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12328RevenID", A12328RevenID);
         A12327RevenNm = httpContext.cgiGet( edtRevenNm_Internalname) ;
         n12327RevenNm = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12327RevenNm", A12327RevenNm);
         A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
         n362DisColNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A362DisColNom", A362DisColNom);
         A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n363DisColNum = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A5290DisTipCor = httpContext.cgiGet( edtDisTipCor_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5290DisTipCor", A5290DisTipCor);
         A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n390DisTipCol = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1195DisNomCli", A1195DisNomCli);
         A1196DisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
         A1052DisObs = httpContext.cgiGet( edtDisObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1052DisObs", A1052DisObs);
         A3307DisManCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
         A4785DisNroCor = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNroCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4785DisNroCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4785DisNroCor), 6, 0));
         AV14PrgTinMd21 = httpContext.cgiGet( edtavPrgtinmd21_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14PrgTinMd21", AV14PrgTinMd21);
         A11859Nxt_modelo = httpContext.cgiGet( edtNxt_modelo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11859Nxt_modelo", A11859Nxt_modelo);
         A11860CpteId = (short)(localUtil.ctol( httpContext.cgiGet( edtCpteId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11860CpteId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11860CpteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11860CpteId), 4, 0));
         A11865CpteDsc = httpContext.cgiGet( edtCpteDsc_Internalname) ;
         n11865CpteDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11865CpteDsc", A11865CpteDsc);
         A11861Nxt_statio = httpContext.cgiGet( edtNxt_statio_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11861Nxt_statio", A11861Nxt_statio);
         A11862DesaID = (short)(localUtil.ctol( httpContext.cgiGet( edtDesaID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11862DesaID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11862DesaID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11862DesaID), 4, 0));
         A11866DesaDsc = httpContext.cgiGet( edtDesaDsc_Internalname) ;
         n11866DesaDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11866DesaDsc", A11866DesaDsc);
         A11863DptoID = (short)(localUtil.ctol( httpContext.cgiGet( edtDptoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11863DptoID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11863DptoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11863DptoID), 4, 0));
         A11867DptoDsc = httpContext.cgiGet( edtDptoDsc_Internalname) ;
         n11867DptoDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11867DptoDsc", A11867DptoDsc);
         A11864Nxt_artcli = httpContext.cgiGet( edtNxt_artcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11864Nxt_artcli", A11864Nxt_artcli);
         A4477DisAcaBak = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcaBak.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4477DisAcaBak", A4477DisAcaBak);
         A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A1906DisGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
         A3131DisGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
         A5349DisObsGrm = httpContext.cgiGet( edtDisObsGrm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5349DisObsGrm", A5349DisObsGrm);
         A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A1231DisArtAn1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
         A5350DisObsAnc = httpContext.cgiGet( edtDisObsAnc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5350DisObsAnc", A5350DisObsAnc);
         A342DisArtPes = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
         A338DisArtEnc = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtEnc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338DisArtEnc", A338DisArtEnc);
         A336DisArtCor = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtCor.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336DisArtCor", A336DisArtCor);
         A1198DisEncAnh = localUtil.ctond( httpContext.cgiGet( edtDisEncAnh_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
         A1197DisEncCom = localUtil.ctond( httpContext.cgiGet( edtDisEncCom_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
         A1908DisRdoA = localUtil.ctond( httpContext.cgiGet( edtDisRdoA_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
         cmbDisAntpT.setValue( httpContext.cgiGet( cmbDisAntpT.getInternalname()) );
         A5405DisAntpT = httpContext.cgiGet( cmbDisAntpT.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5405DisAntpT", A5405DisAntpT);
         A343DisArtPle = httpContext.cgiGet( edtDisArtPle_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A343DisArtPle", A343DisArtPle);
         cmbDisCruEnr.setValue( httpContext.cgiGet( cmbDisCruEnr.getInternalname()) );
         A4471DisCruEnr = httpContext.cgiGet( cmbDisCruEnr.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4471DisCruEnr", A4471DisCruEnr);
         A4478DisAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4478DisAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4478DisAcaAnh), 4, 0));
         A9717Tb1_Dscf = httpContext.cgiGet( edtTb1_Dscf_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9717Tb1_Dscf", A9717Tb1_Dscf);
         A9773DisItem3 = httpContext.cgiGet( edtDisItem3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9773DisItem3", A9773DisItem3);
         A10887Cod_Idtx = httpContext.cgiGet( edtCod_Idtx_Internalname) ;
         n10887Cod_Idtx = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10887Cod_Idtx", A10887Cod_Idtx);
         A11661DisOrdComp = httpContext.cgiGet( edtDisOrdComp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11661DisOrdComp", A11661DisOrdComp);
         A13986DisIdtx2 = httpContext.cgiGet( edtDisIdtx2_Internalname) ;
         n13986DisIdtx2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13986DisIdtx2", A13986DisIdtx2);
         A1430DisLoc = httpContext.cgiGet( edtDisLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
         A1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
         A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
         A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         cmbDisUniMed.setValue( httpContext.cgiGet( cmbDisUniMed.getInternalname()) );
         A392DisUniMed = httpContext.cgiGet( cmbDisUniMed.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
         A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
         n1122MaqCodDis = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1122MaqCodDis", A1122MaqCodDis);
         A1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         A1233DisArtAc2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
         A1225DisGraCru = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
         A3132DisGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
         AV18Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Pgmname", AV18Pgmname);
         AV11EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
         A12116DisTipCD = httpContext.cgiGet( edtDisTipCD_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12116DisTipCD", A12116DisTipCD);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DisGeneral");
         A11659MarcaId = httpContext.cgiGet( edtMarcaId_Internalname) ;
         n11659MarcaId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11659MarcaId", A11659MarcaId);
         forbiddenHiddens.add("MarcaId", GXutil.rtrim( localUtil.format( A11659MarcaId, "@!")));
         A12328RevenID = httpContext.cgiGet( edtRevenID_Internalname) ;
         n12328RevenID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12328RevenID", A12328RevenID);
         forbiddenHiddens.add("RevenID", GXutil.rtrim( localUtil.format( A12328RevenID, "")));
         A11860CpteId = (short)(localUtil.ctol( httpContext.cgiGet( edtCpteId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11860CpteId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11860CpteId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11860CpteId), 4, 0));
         forbiddenHiddens.add("CpteId", localUtil.format( DecimalUtil.doubleToDec(A11860CpteId), "ZZZ9"));
         A11862DesaID = (short)(localUtil.ctol( httpContext.cgiGet( edtDesaID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11862DesaID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11862DesaID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11862DesaID), 4, 0));
         forbiddenHiddens.add("DesaID", localUtil.format( DecimalUtil.doubleToDec(A11862DesaID), "ZZZ9"));
         A11863DptoID = (short)(localUtil.ctol( httpContext.cgiGet( edtDptoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11863DptoID = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11863DptoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11863DptoID), 4, 0));
         forbiddenHiddens.add("DptoID", localUtil.format( DecimalUtil.doubleToDec(A11863DptoID), "ZZZ9"));
         AV18Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Pgmname", AV18Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV18Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\disgeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131Y32 ();
      if (returnInSub) return;
   }

   public void e131Y32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      disgeneral_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19Station = GXt_char1 ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char2[0] = AV20Emprnom ;
      GXv_char6[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char4, GXv_char2, GXv_char6) ;
      disgeneral_impl.this.AV11EmprCod = GXv_char4[0] ;
      disgeneral_impl.this.AV20Emprnom = GXv_char2[0] ;
      disgeneral_impl.this.AV21Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
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

   protected void e141Y32( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtDptoDsc_Link = formatLink("app.ficherosbasicos.tnxt002view", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11863DptoID,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","DptoID","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDptoDsc_Internalname, "Link", edtDptoDsc_Link, true);
      edtDesaDsc_Link = formatLink("app.ficherosbasicos.tnxt001view", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11862DesaID,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","DesaID","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDesaDsc_Internalname, "Link", edtDesaDsc_Link, true);
      edtCpteDsc_Link = formatLink("app.ficherosbasicos.tnxt000view", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11860CpteId,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","CpteId","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCpteDsc_Internalname, "Link", edtCpteDsc_Link, true);
      edtRevenNm_Link = formatLink("app.ficherosbasicos.trevendview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A12328RevenID)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","RevenID","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRevenNm_Internalname, "Link", edtRevenNm_Link, true);
      edtMarcaDsc_Link = formatLink("app.ficherosbasicos.tmarcasview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A11659MarcaId)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MarcaId","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMarcaDsc_Internalname, "Link", edtMarcaDsc_Link, true);
      edtavEmprcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Visible), 5, 0), true);
      edtDisTipCD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisTipCD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCD_Visible), 5, 0), true);
      if ( ! ( AV12VisualizarAcciones ) )
      {
         bttBtnupdate_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtnupdate_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnupdate_Visible), 5, 0), true);
      }
      if ( ! ( AV12VisualizarAcciones ) )
      {
         bttBtndelete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtndelete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtndelete_Visible), 5, 0), true);
      }
      divTransactiondetail_tablecolormoda21_Visible = ((((AV15Moda21==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTransactiondetail_tablecolormoda21_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTransactiondetail_tablecolormoda21_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV18Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.Dis" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_268_1Y32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddismancod1_Internalname, tblTablemergeddismancod1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisManCod1_Internalname, httpContext.getMessage( "Manufacturador 1 (Bobinador)", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisManCod1_Internalname, GXutil.ltrim( localUtil.ntoc( A3307DisManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisManCod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3307DisManCod1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3307DisManCod1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisManCod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisManCod1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablesearch_dismancod1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_268_1Y32e( true) ;
      }
      else
      {
         wb_table2_268_1Y32e( false) ;
      }
   }

   public void wb_table1_228_1Y32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddiscolnom_Internalname, tblTablemergeddiscolnom_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablesearch_discolnom_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_228_1Y32e( true) ;
      }
      else
      {
         wb_table1_228_1Y32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV12VisualizarAcciones = ((Boolean) getParm(obj,2,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12VisualizarAcciones", AV12VisualizarAcciones);
      AV13AccionesEnPopup = ((Boolean) getParm(obj,3,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AccionesEnPopup", AV13AccionesEnPopup);
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
      pa1Y32( ) ;
      ws1Y32( ) ;
      we1Y32( ) ;
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
      sCtrlA361DisCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV12VisualizarAcciones = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV13AccionesEnPopup = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1Y32( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidos\\disgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1Y32( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV12VisualizarAcciones = ((Boolean) getParm(obj,4,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12VisualizarAcciones", AV12VisualizarAcciones);
         AV13AccionesEnPopup = ((Boolean) getParm(obj,5,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AccionesEnPopup", AV13AccionesEnPopup);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV12VisualizarAcciones")) ;
      wcpOAV13AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV13AccionesEnPopup")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A361DisCod != wcpOA361DisCod ) || ( AV12VisualizarAcciones != wcpOAV12VisualizarAcciones ) || ( AV13AccionesEnPopup != wcpOAV13AccionesEnPopup ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA361DisCod = A361DisCod ;
      wcpOAV12VisualizarAcciones = AV12VisualizarAcciones ;
      wcpOAV13AccionesEnPopup = AV13AccionesEnPopup ;
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
      sCtrlA361DisCod = httpContext.cgiGet( sPrefix+"A361DisCod_CTRL") ;
      if ( GXutil.len( sCtrlA361DisCod) > 0 )
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA361DisCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      else
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A361DisCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV12VisualizarAcciones = httpContext.cgiGet( sPrefix+"AV12VisualizarAcciones_CTRL") ;
      if ( GXutil.len( sCtrlAV12VisualizarAcciones) > 0 )
      {
         AV12VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sCtrlAV12VisualizarAcciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12VisualizarAcciones", AV12VisualizarAcciones);
      }
      else
      {
         AV12VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV12VisualizarAcciones_PARM")) ;
      }
      sCtrlAV13AccionesEnPopup = httpContext.cgiGet( sPrefix+"AV13AccionesEnPopup_CTRL") ;
      if ( GXutil.len( sCtrlAV13AccionesEnPopup) > 0 )
      {
         AV13AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sCtrlAV13AccionesEnPopup)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13AccionesEnPopup", AV13AccionesEnPopup);
      }
      else
      {
         AV13AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV13AccionesEnPopup_PARM")) ;
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
      pa1Y32( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1Y32( ) ;
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
      ws1Y32( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_PARM", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA361DisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_CTRL", GXutil.rtrim( sCtrlA361DisCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12VisualizarAcciones_PARM", GXutil.booltostr( AV12VisualizarAcciones));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12VisualizarAcciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12VisualizarAcciones_CTRL", GXutil.rtrim( sCtrlAV12VisualizarAcciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13AccionesEnPopup_PARM", GXutil.booltostr( AV13AccionesEnPopup));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13AccionesEnPopup)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13AccionesEnPopup_CTRL", GXutil.rtrim( sCtrlAV13AccionesEnPopup));
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
      we1Y32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211684768", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disgeneral.js", "?20268211684768", false, true);
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
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      cmbPriCod.setInternalname( sPrefix+"PRICOD" );
      divUnnamedtable23_Internalname = sPrefix+"UNNAMEDTABLE23" ;
      edtDisEncCli_Internalname = sPrefix+"DISENCCLI" ;
      divDisenccli_cell_Internalname = sPrefix+"DISENCCLI_CELL" ;
      edtDisCliNum_Internalname = sPrefix+"DISCLINUM" ;
      divDisclinum_cell_Internalname = sPrefix+"DISCLINUM_CELL" ;
      divUnnamedtable24_Internalname = sPrefix+"UNNAMEDTABLE24" ;
      edtDisTipDis_Internalname = sPrefix+"DISTIPDIS" ;
      divDistipdis_cell_Internalname = sPrefix+"DISTIPDIS_CELL" ;
      divUnnamedtable25_Internalname = sPrefix+"UNNAMEDTABLE25" ;
      edtDisFecCli_Internalname = sPrefix+"DISFECCLI" ;
      edtDisFec_Internalname = sPrefix+"DISFEC" ;
      edtDisFecEnt_Internalname = sPrefix+"DISFECENT" ;
      divUnnamedtable26_Internalname = sPrefix+"UNNAMEDTABLE26" ;
      chkDisEstTip.setInternalname( sPrefix+"DISESTTIP" );
      chkDisExp.setInternalname( sPrefix+"DISEXP" );
      chkDisTin.setInternalname( sPrefix+"DISTIN" );
      divUnnamedtable27_Internalname = sPrefix+"UNNAMEDTABLE27" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtDisCliDes_Internalname = sPrefix+"DISCLIDES" ;
      edtDisCliDesN_Internalname = sPrefix+"DISCLIDESN" ;
      divUnnamedtable28_Internalname = sPrefix+"UNNAMEDTABLE28" ;
      divTransactiondetail_tablecliente_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECLIENTE" ;
      Dvpanel_transactiondetail_tablecliente_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECLIENTE" ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD" ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC" ;
      edtDisArtMat_Internalname = sPrefix+"DISARTMAT" ;
      edtDisArtAca_Internalname = sPrefix+"DISARTACA" ;
      divUnnamedtable17_Internalname = sPrefix+"UNNAMEDTABLE17" ;
      edtDisArtTip_Internalname = sPrefix+"DISARTTIP" ;
      edtDisArtTipD_Internalname = sPrefix+"DISARTTIPD" ;
      divUnnamedtable21_Internalname = sPrefix+"UNNAMEDTABLE21" ;
      edtDisArtTr1_Internalname = sPrefix+"DISARTTR1" ;
      edtDisArtPt1_Internalname = sPrefix+"DISARTPT1" ;
      edtDisArtTr2_Internalname = sPrefix+"DISARTTR2" ;
      edtDisArtPt2_Internalname = sPrefix+"DISARTPT2" ;
      edtDisArtTr3_Internalname = sPrefix+"DISARTTR3" ;
      edtDisArtPt3_Internalname = sPrefix+"DISARTPT3" ;
      edtDisArtUr1_Internalname = sPrefix+"DISARTUR1" ;
      edtDisArtPu1_Internalname = sPrefix+"DISARTPU1" ;
      edtDisArtUr2_Internalname = sPrefix+"DISARTUR2" ;
      edtDisArtPu2_Internalname = sPrefix+"DISARTPU2" ;
      edtDisArtUr3_Internalname = sPrefix+"DISARTUR3" ;
      edtDisArtPu3_Internalname = sPrefix+"DISARTPU3" ;
      divUnnamedtable22_Internalname = sPrefix+"UNNAMEDTABLE22" ;
      divUnnamedtable18_Internalname = sPrefix+"UNNAMEDTABLE18" ;
      edtMarcaId_Internalname = sPrefix+"MARCAID" ;
      divMarcaid_cell_Internalname = sPrefix+"MARCAID_CELL" ;
      edtMarcaDsc_Internalname = sPrefix+"MARCADSC" ;
      divUnnamedtable19_Internalname = sPrefix+"UNNAMEDTABLE19" ;
      edtRevenID_Internalname = sPrefix+"REVENID" ;
      divRevenid_cell_Internalname = sPrefix+"REVENID_CELL" ;
      edtRevenNm_Internalname = sPrefix+"REVENNM" ;
      divUnnamedtable20_Internalname = sPrefix+"UNNAMEDTABLE20" ;
      divTransactiondetail_tablearticulotipo_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEARTICULOTIPO" ;
      Dvpanel_transactiondetail_tablearticulotipo_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEARTICULOTIPO" ;
      lblTextblockdiscolnom_Internalname = sPrefix+"TEXTBLOCKDISCOLNOM" ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM" ;
      divTransactiondetail_tablesearch_discolnom_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLESEARCH_DISCOLNOM" ;
      tblTablemergeddiscolnom_Internalname = sPrefix+"TABLEMERGEDDISCOLNOM" ;
      divTablesplitteddiscolnom_Internalname = sPrefix+"TABLESPLITTEDDISCOLNOM" ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM" ;
      edtDisTipCor_Internalname = sPrefix+"DISTIPCOR" ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL" ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI" ;
      edtDisNumCli_Internalname = sPrefix+"DISNUMCLI" ;
      edtDisObs_Internalname = sPrefix+"DISOBS" ;
      divUnnamedtable16_Internalname = sPrefix+"UNNAMEDTABLE16" ;
      lblTextblockdismancod1_Internalname = sPrefix+"TEXTBLOCKDISMANCOD1" ;
      edtDisManCod1_Internalname = sPrefix+"DISMANCOD1" ;
      divTransactiondetail_tablesearch_dismancod1_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLESEARCH_DISMANCOD1" ;
      tblTablemergeddismancod1_Internalname = sPrefix+"TABLEMERGEDDISMANCOD1" ;
      divTablesplitteddismancod1_Internalname = sPrefix+"TABLESPLITTEDDISMANCOD1" ;
      edtDisNroCor_Internalname = sPrefix+"DISNROCOR" ;
      edtavPrgtinmd21_Internalname = sPrefix+"vPRGTINMD21" ;
      divTransactiondetail_tablecolormoda21_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECOLORMODA21" ;
      divTransactiondetail_tablecolores_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECOLORES" ;
      Dvpanel_transactiondetail_tablecolores_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLECOLORES" ;
      edtNxt_modelo_Internalname = sPrefix+"NXT_MODELO" ;
      edtCpteId_Internalname = sPrefix+"CPTEID" ;
      edtCpteDsc_Internalname = sPrefix+"CPTEDSC" ;
      divUnnamedtable13_Internalname = sPrefix+"UNNAMEDTABLE13" ;
      edtNxt_statio_Internalname = sPrefix+"NXT_STATIO" ;
      edtDesaID_Internalname = sPrefix+"DESAID" ;
      edtDesaDsc_Internalname = sPrefix+"DESADSC" ;
      divUnnamedtable14_Internalname = sPrefix+"UNNAMEDTABLE14" ;
      edtDptoID_Internalname = sPrefix+"DPTOID" ;
      edtDptoDsc_Internalname = sPrefix+"DPTODSC" ;
      divUnnamedtable15_Internalname = sPrefix+"UNNAMEDTABLE15" ;
      edtNxt_artcli_Internalname = sPrefix+"NXT_ARTCLI" ;
      divUnnamedtable12_Internalname = sPrefix+"UNNAMEDTABLE12" ;
      divTransactiondetail_tablenext_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLENEXT" ;
      Dvpanel_transactiondetail_tablenext_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLENEXT" ;
      chkDisAcaBak.setInternalname( sPrefix+"DISACABAK" );
      edtDisPreKgm_Internalname = sPrefix+"DISPREKGM" ;
      edtDisPreMtr_Internalname = sPrefix+"DISPREMTR" ;
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      divTransactiondetail_tableprecio_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEPRECIO" ;
      Dvpanel_transactiondetail_tableprecio_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEPRECIO" ;
      edtDisGraAca_Internalname = sPrefix+"DISGRAACA" ;
      edtDisGraAca2_Internalname = sPrefix+"DISGRAACA2" ;
      edtDisObsGrm_Internalname = sPrefix+"DISOBSGRM" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      edtDisArtAnh_Internalname = sPrefix+"DISARTANH" ;
      edtDisArtAn1_Internalname = sPrefix+"DISARTAN1" ;
      edtDisObsAnc_Internalname = sPrefix+"DISOBSANC" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      edtDisArtPes_Internalname = sPrefix+"DISARTPES" ;
      chkDisArtEnc.setInternalname( sPrefix+"DISARTENC" );
      chkDisArtCor.setInternalname( sPrefix+"DISARTCOR" );
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      edtDisEncAnh_Internalname = sPrefix+"DISENCANH" ;
      edtDisEncCom_Internalname = sPrefix+"DISENCCOM" ;
      edtDisRdoA_Internalname = sPrefix+"DISRDOA" ;
      cmbDisAntpT.setInternalname( sPrefix+"DISANTPT" );
      edtDisArtPle_Internalname = sPrefix+"DISARTPLE" ;
      cmbDisCruEnr.setInternalname( sPrefix+"DISCRUENR" );
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      divTransactiondetail_tableacabado_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEACABADO" ;
      Dvpanel_transactiondetail_tableacabado_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEACABADO" ;
      edtDisAcaAnh_Internalname = sPrefix+"DISACAANH" ;
      divDisacaanh_cell_Internalname = sPrefix+"DISACAANH_CELL" ;
      edtTb1_Dscf_Internalname = sPrefix+"TB1_DSCF" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtDisItem3_Internalname = sPrefix+"DISITEM3" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      edtCod_Idtx_Internalname = sPrefix+"COD_IDTX" ;
      divCod_idtx_cell_Internalname = sPrefix+"COD_IDTX_CELL" ;
      edtDisOrdComp_Internalname = sPrefix+"DISORDCOMP" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      edtDisIdtx2_Internalname = sPrefix+"DISIDTX2" ;
      divDisidtx2_cell_Internalname = sPrefix+"DISIDTX2_CELL" ;
      divTransactiondetail_tableinditex_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEINDITEX" ;
      Dvpanel_transactiondetail_tableinditex_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEINDITEX" ;
      edtDisLoc_Internalname = sPrefix+"DISLOC" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtDisPart_Internalname = sPrefix+"DISPART" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkDisDes.setInternalname( sPrefix+"DISDES" );
      edtDisNumPie_Internalname = sPrefix+"DISNUMPIE" ;
      edtDisNumUni_Internalname = sPrefix+"DISNUMUNI" ;
      cmbDisUniMed.setInternalname( sPrefix+"DISUNIMED" );
      edtMaqCodDis_Internalname = sPrefix+"MAQCODDIS" ;
      edtDisArtAcb_Internalname = sPrefix+"DISARTACB" ;
      edtDisArtAc2_Internalname = sPrefix+"DISARTAC2" ;
      edtDisGraCru_Internalname = sPrefix+"DISGRACRU" ;
      edtDisGraCru2_Internalname = sPrefix+"DISGRACRU2" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divTransactiondetail_tableotrosdatos_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEOTROSDATOS" ;
      Dvpanel_transactiondetail_tableotrosdatos_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEOTROSDATOS" ;
      divTransactiondetail_tableinvisible_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEINVISIBLE" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTransactiondetail_tablemain_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEMAIN" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD" ;
      edtDisTipCD_Internalname = sPrefix+"DISTIPCD" ;
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
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Enabled = 0 ;
      edtDisManCod1_Jsonclick = "" ;
      edtDisManCod1_Enabled = 0 ;
      edtDisTipCD_Jsonclick = "" ;
      edtDisTipCD_Visible = 1 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtndelete_Visible = 1 ;
      bttBtnupdate_Visible = 1 ;
      edtDisGraCru2_Jsonclick = "" ;
      edtDisGraCru2_Enabled = 0 ;
      edtDisGraCru_Jsonclick = "" ;
      edtDisGraCru_Enabled = 0 ;
      edtDisArtAc2_Jsonclick = "" ;
      edtDisArtAc2_Enabled = 0 ;
      edtDisArtAcb_Jsonclick = "" ;
      edtDisArtAcb_Enabled = 0 ;
      edtMaqCodDis_Jsonclick = "" ;
      edtMaqCodDis_Enabled = 0 ;
      cmbDisUniMed.setJsonclick( "" );
      cmbDisUniMed.setEnabled( 0 );
      edtDisNumUni_Jsonclick = "" ;
      edtDisNumUni_Enabled = 0 ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumPie_Enabled = 0 ;
      chkDisDes.setEnabled( 0 );
      edtDisPart_Jsonclick = "" ;
      edtDisPart_Enabled = 0 ;
      edtDisLoc_Jsonclick = "" ;
      edtDisLoc_Enabled = 0 ;
      edtDisIdtx2_Jsonclick = "" ;
      edtDisIdtx2_Enabled = 0 ;
      edtDisOrdComp_Jsonclick = "" ;
      edtDisOrdComp_Enabled = 0 ;
      edtCod_Idtx_Jsonclick = "" ;
      edtCod_Idtx_Enabled = 0 ;
      edtDisItem3_Jsonclick = "" ;
      edtDisItem3_Enabled = 0 ;
      edtTb1_Dscf_Jsonclick = "" ;
      edtTb1_Dscf_Enabled = 0 ;
      edtDisAcaAnh_Jsonclick = "" ;
      edtDisAcaAnh_Enabled = 0 ;
      cmbDisCruEnr.setJsonclick( "" );
      cmbDisCruEnr.setEnabled( 0 );
      edtDisArtPle_Jsonclick = "" ;
      edtDisArtPle_Enabled = 0 ;
      cmbDisAntpT.setJsonclick( "" );
      cmbDisAntpT.setEnabled( 0 );
      edtDisRdoA_Jsonclick = "" ;
      edtDisRdoA_Enabled = 0 ;
      edtDisEncCom_Jsonclick = "" ;
      edtDisEncCom_Enabled = 0 ;
      edtDisEncAnh_Jsonclick = "" ;
      edtDisEncAnh_Enabled = 0 ;
      chkDisArtCor.setEnabled( 0 );
      chkDisArtEnc.setEnabled( 0 );
      edtDisArtPes_Jsonclick = "" ;
      edtDisArtPes_Enabled = 0 ;
      edtDisObsAnc_Jsonclick = "" ;
      edtDisObsAnc_Enabled = 0 ;
      edtDisArtAn1_Jsonclick = "" ;
      edtDisArtAn1_Enabled = 0 ;
      edtDisArtAnh_Jsonclick = "" ;
      edtDisArtAnh_Enabled = 0 ;
      edtDisObsGrm_Jsonclick = "" ;
      edtDisObsGrm_Enabled = 0 ;
      edtDisGraAca2_Jsonclick = "" ;
      edtDisGraAca2_Enabled = 0 ;
      edtDisGraAca_Jsonclick = "" ;
      edtDisGraAca_Enabled = 0 ;
      edtDisPreMtr_Jsonclick = "" ;
      edtDisPreMtr_Enabled = 0 ;
      edtDisPreKgm_Jsonclick = "" ;
      edtDisPreKgm_Enabled = 0 ;
      chkDisAcaBak.setEnabled( 0 );
      edtNxt_artcli_Jsonclick = "" ;
      edtNxt_artcli_Enabled = 0 ;
      edtDptoDsc_Jsonclick = "" ;
      edtDptoDsc_Link = "" ;
      edtDptoDsc_Enabled = 0 ;
      edtDptoID_Jsonclick = "" ;
      edtDptoID_Enabled = 0 ;
      edtDesaDsc_Jsonclick = "" ;
      edtDesaDsc_Link = "" ;
      edtDesaDsc_Enabled = 0 ;
      edtDesaID_Jsonclick = "" ;
      edtDesaID_Enabled = 0 ;
      edtNxt_statio_Jsonclick = "" ;
      edtNxt_statio_Enabled = 0 ;
      edtCpteDsc_Jsonclick = "" ;
      edtCpteDsc_Link = "" ;
      edtCpteDsc_Enabled = 0 ;
      edtCpteId_Jsonclick = "" ;
      edtCpteId_Enabled = 0 ;
      edtNxt_modelo_Jsonclick = "" ;
      edtNxt_modelo_Enabled = 0 ;
      edtavPrgtinmd21_Jsonclick = "" ;
      edtavPrgtinmd21_Enabled = 1 ;
      edtDisNroCor_Jsonclick = "" ;
      edtDisNroCor_Enabled = 0 ;
      divTransactiondetail_tablecolormoda21_Visible = 1 ;
      edtDisObs_Jsonclick = "" ;
      edtDisObs_Enabled = 0 ;
      edtDisNumCli_Jsonclick = "" ;
      edtDisNumCli_Enabled = 0 ;
      edtDisNomCli_Jsonclick = "" ;
      edtDisNomCli_Enabled = 0 ;
      edtDisTipCol_Jsonclick = "" ;
      edtDisTipCol_Enabled = 0 ;
      edtDisTipCor_Jsonclick = "" ;
      edtDisTipCor_Enabled = 0 ;
      edtDisColNum_Jsonclick = "" ;
      edtDisColNum_Enabled = 0 ;
      edtRevenNm_Jsonclick = "" ;
      edtRevenNm_Link = "" ;
      edtRevenNm_Enabled = 0 ;
      edtRevenID_Jsonclick = "" ;
      edtRevenID_Enabled = 0 ;
      edtMarcaDsc_Jsonclick = "" ;
      edtMarcaDsc_Link = "" ;
      edtMarcaDsc_Enabled = 0 ;
      edtMarcaId_Jsonclick = "" ;
      edtMarcaId_Enabled = 0 ;
      edtDisArtPu3_Jsonclick = "" ;
      edtDisArtPu3_Enabled = 0 ;
      edtDisArtUr3_Jsonclick = "" ;
      edtDisArtUr3_Enabled = 0 ;
      edtDisArtPu2_Jsonclick = "" ;
      edtDisArtPu2_Enabled = 0 ;
      edtDisArtUr2_Jsonclick = "" ;
      edtDisArtUr2_Enabled = 0 ;
      edtDisArtPu1_Jsonclick = "" ;
      edtDisArtPu1_Enabled = 0 ;
      edtDisArtUr1_Jsonclick = "" ;
      edtDisArtUr1_Enabled = 0 ;
      edtDisArtPt3_Jsonclick = "" ;
      edtDisArtPt3_Enabled = 0 ;
      edtDisArtTr3_Jsonclick = "" ;
      edtDisArtTr3_Enabled = 0 ;
      edtDisArtPt2_Jsonclick = "" ;
      edtDisArtPt2_Enabled = 0 ;
      edtDisArtTr2_Jsonclick = "" ;
      edtDisArtTr2_Enabled = 0 ;
      edtDisArtPt1_Jsonclick = "" ;
      edtDisArtPt1_Enabled = 0 ;
      edtDisArtTr1_Jsonclick = "" ;
      edtDisArtTr1_Enabled = 0 ;
      edtDisArtTipD_Jsonclick = "" ;
      edtDisArtTipD_Enabled = 0 ;
      edtDisArtTip_Jsonclick = "" ;
      edtDisArtTip_Enabled = 0 ;
      edtDisArtAca_Jsonclick = "" ;
      edtDisArtAca_Enabled = 0 ;
      edtDisArtMat_Jsonclick = "" ;
      edtDisArtMat_Enabled = 0 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Enabled = 0 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Enabled = 0 ;
      edtDisCliDesN_Jsonclick = "" ;
      edtDisCliDesN_Enabled = 0 ;
      edtDisCliDes_Jsonclick = "" ;
      edtDisCliDes_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      chkDisTin.setEnabled( 0 );
      chkDisExp.setEnabled( 0 );
      chkDisEstTip.setEnabled( 0 );
      edtDisFecEnt_Jsonclick = "" ;
      edtDisFecEnt_Enabled = 0 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Enabled = 0 ;
      edtDisFecCli_Jsonclick = "" ;
      edtDisFecCli_Enabled = 0 ;
      edtDisTipDis_Jsonclick = "" ;
      edtDisTipDis_Enabled = 0 ;
      edtDisCliNum_Jsonclick = "" ;
      edtDisCliNum_Enabled = 0 ;
      edtDisEncCli_Jsonclick = "" ;
      edtDisEncCli_Enabled = 0 ;
      cmbPriCod.setJsonclick( "" );
      cmbPriCod.setEnabled( 0 );
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      Dvpanel_transactiondetail_tableotrosdatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableotrosdatos_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableotrosdatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableotrosdatos_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_tableotrosdatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableotrosdatos_Title = httpContext.getMessage( "Otros datos", "") ;
      Dvpanel_transactiondetail_tableotrosdatos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tableotrosdatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableotrosdatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableotrosdatos_Width = "100%" ;
      Dvpanel_transactiondetail_tableinditex_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableinditex_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableinditex_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableinditex_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_tableinditex_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableinditex_Title = httpContext.getMessage( "Inditex", "") ;
      Dvpanel_transactiondetail_tableinditex_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tableinditex_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableinditex_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableinditex_Width = "100%" ;
      Dvpanel_transactiondetail_tableacabado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableacabado_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableacabado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableacabado_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_tableacabado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableacabado_Title = httpContext.getMessage( "Datos acabado", "") ;
      Dvpanel_transactiondetail_tableacabado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tableacabado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableacabado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableacabado_Width = "100%" ;
      Dvpanel_transactiondetail_tableprecio_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableprecio_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableprecio_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableprecio_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_tableprecio_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableprecio_Title = httpContext.getMessage( "Precio", "") ;
      Dvpanel_transactiondetail_tableprecio_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tableprecio_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableprecio_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableprecio_Width = "100%" ;
      Dvpanel_transactiondetail_tablenext_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablenext_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tablenext_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablenext_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_tablenext_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablenext_Title = httpContext.getMessage( "Next", "") ;
      Dvpanel_transactiondetail_tablenext_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tablenext_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablenext_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablenext_Width = "100%" ;
      Dvpanel_transactiondetail_tablecolores_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablecolores_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tablecolores_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablecolores_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_tablecolores_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablecolores_Title = httpContext.getMessage( "Color", "") ;
      Dvpanel_transactiondetail_tablecolores_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tablecolores_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablecolores_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablecolores_Width = "100%" ;
      Dvpanel_transactiondetail_tablearticulotipo_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablearticulotipo_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tablearticulotipo_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablearticulotipo_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_tablearticulotipo_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablearticulotipo_Title = httpContext.getMessage( "Artigo", "") ;
      Dvpanel_transactiondetail_tablearticulotipo_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tablearticulotipo_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablearticulotipo_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablearticulotipo_Width = "100%" ;
      Dvpanel_transactiondetail_tablecliente_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablecliente_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tablecliente_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablecliente_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablecliente_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablecliente_Title = httpContext.getMessage( "Pedido", "") ;
      Dvpanel_transactiondetail_tablecliente_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tablecliente_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tablecliente_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tablecliente_Width = "100%" ;
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
      cmbPriCod.setName( "PRICOD" );
      cmbPriCod.setWebtags( "" );
      cmbPriCod.addItem("0", "0", (short)(0));
      cmbPriCod.addItem("1", "1", (short)(0));
      if ( cmbPriCod.getItemCount() > 0 )
      {
      }
      chkDisEstTip.setName( "DISESTTIP" );
      chkDisEstTip.setWebtags( "" );
      chkDisEstTip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisEstTip.getInternalname(), "TitleCaption", chkDisEstTip.getCaption(), true);
      chkDisEstTip.setCheckedValue( "*" );
      chkDisExp.setName( "DISEXP" );
      chkDisExp.setWebtags( "" );
      chkDisExp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisExp.getInternalname(), "TitleCaption", chkDisExp.getCaption(), true);
      chkDisExp.setCheckedValue( "N" );
      chkDisTin.setName( "DISTIN" );
      chkDisTin.setWebtags( "" );
      chkDisTin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisTin.getInternalname(), "TitleCaption", chkDisTin.getCaption(), true);
      chkDisTin.setCheckedValue( "N" );
      chkDisAcaBak.setName( "DISACABAK" );
      chkDisAcaBak.setWebtags( "" );
      chkDisAcaBak.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisAcaBak.getInternalname(), "TitleCaption", chkDisAcaBak.getCaption(), true);
      chkDisAcaBak.setCheckedValue( "N" );
      chkDisArtEnc.setName( "DISARTENC" );
      chkDisArtEnc.setWebtags( "" );
      chkDisArtEnc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisArtEnc.getInternalname(), "TitleCaption", chkDisArtEnc.getCaption(), true);
      chkDisArtEnc.setCheckedValue( "N" );
      chkDisArtCor.setName( "DISARTCOR" );
      chkDisArtCor.setWebtags( "" );
      chkDisArtCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisArtCor.getInternalname(), "TitleCaption", chkDisArtCor.getCaption(), true);
      chkDisArtCor.setCheckedValue( "N" );
      cmbDisAntpT.setName( "DISANTPT" );
      cmbDisAntpT.setWebtags( "" );
      cmbDisAntpT.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbDisAntpT.addItem("1", httpContext.getMessage( "Secagem em Tumbler", ""), (short)(0));
      cmbDisAntpT.addItem("2", httpContext.getMessage( "Secagem em Plano", ""), (short)(0));
      cmbDisAntpT.addItem("5", httpContext.getMessage( "Secagem em Suspensão.", ""), (short)(0));
      cmbDisAntpT.addItem("6", httpContext.getMessage( "Suspensão e Pilling", ""), (short)(0));
      if ( cmbDisAntpT.getItemCount() > 0 )
      {
      }
      cmbDisCruEnr.setName( "DISCRUENR" );
      cmbDisCruEnr.setWebtags( "" );
      cmbDisCruEnr.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbDisCruEnr.addItem("X", httpContext.getMessage( "malha Aberta o Fechada?", ""), (short)(0));
      cmbDisCruEnr.addItem("A", httpContext.getMessage( "malha Aberta ", ""), (short)(0));
      cmbDisCruEnr.addItem("F", httpContext.getMessage( "malha Fechada", ""), (short)(0));
      if ( cmbDisCruEnr.getItemCount() > 0 )
      {
      }
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      cmbDisUniMed.setName( "DISUNIMED" );
      cmbDisUniMed.setWebtags( "" );
      cmbDisUniMed.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbDisUniMed.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbDisUniMed.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A7739DisExp',fld:'DISEXP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A11659MarcaId',fld:'MARCAID',pic:'@!'},{av:'A12328RevenID',fld:'REVENID',pic:''},{av:'A11860CpteId',fld:'CPTEID',pic:'ZZZ9'},{av:'A11862DesaID',fld:'DESAID',pic:'ZZZ9'},{av:'A11863DptoID',fld:'DPTOID',pic:'ZZZ9'},{av:'AV18Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111Y31',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV12VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV13AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121Y31',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV12VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV13AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DISCLIDES","{handler:'valid_Disclides',iparms:[]");
      setEventMetadata("VALID_DISCLIDES",",oparms:[]}");
      setEventMetadata("VALID_DISARTACA","{handler:'valid_Disartaca',iparms:[]");
      setEventMetadata("VALID_DISARTACA",",oparms:[]}");
      setEventMetadata("VALID_DISARTTIP","{handler:'valid_Disarttip',iparms:[]");
      setEventMetadata("VALID_DISARTTIP",",oparms:[]}");
      setEventMetadata("VALID_MARCAID","{handler:'valid_Marcaid',iparms:[]");
      setEventMetadata("VALID_MARCAID",",oparms:[]}");
      setEventMetadata("VALID_REVENID","{handler:'valid_Revenid',iparms:[]");
      setEventMetadata("VALID_REVENID",",oparms:[]}");
      setEventMetadata("VALID_DISTIPCOL","{handler:'valid_Distipcol',iparms:[]");
      setEventMetadata("VALID_DISTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_CPTEID","{handler:'valid_Cpteid',iparms:[]");
      setEventMetadata("VALID_CPTEID",",oparms:[]}");
      setEventMetadata("VALID_DESAID","{handler:'valid_Desaid',iparms:[]");
      setEventMetadata("VALID_DESAID",",oparms:[]}");
      setEventMetadata("VALID_DPTOID","{handler:'valid_Dptoid',iparms:[]");
      setEventMetadata("VALID_DPTOID",",oparms:[]}");
      setEventMetadata("VALID_DISACAANH","{handler:'valid_Disacaanh',iparms:[]");
      setEventMetadata("VALID_DISACAANH",",oparms:[]}");
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
      A766ProForDsc = "" ;
      h333DisArtAca = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      A11659MarcaId = "" ;
      A12328RevenID = "" ;
      AV18Pgmname = "" ;
      A333DisArtAca = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tablecliente = new com.genexus.webpanels.GXUserControl();
      A757PriCod = "" ;
      A4813DisEncCli = "" ;
      A360DisCliNum = "" ;
      A2009DisTipDis = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      ClassString = "" ;
      StyleString = "" ;
      A5032DisEstTip = "" ;
      A7739DisExp = "" ;
      A4014DisTin = "" ;
      A279CliNom = "" ;
      A4197DisCliDesN = "" ;
      ucDvpanel_transactiondetail_tablearticulotipo = new com.genexus.webpanels.GXUserControl();
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A340DisArtMat = "" ;
      A12115DisArtTipD = "" ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A11660MarcaDsc = "" ;
      A12327RevenNm = "" ;
      ucDvpanel_transactiondetail_tablecolores = new com.genexus.webpanels.GXUserControl();
      lblTextblockdiscolnom_Jsonclick = "" ;
      A5290DisTipCor = "" ;
      A1195DisNomCli = "" ;
      A1052DisObs = "" ;
      lblTextblockdismancod1_Jsonclick = "" ;
      TempTags = "" ;
      AV14PrgTinMd21 = "" ;
      ucDvpanel_transactiondetail_tablenext = new com.genexus.webpanels.GXUserControl();
      A11859Nxt_modelo = "" ;
      A11865CpteDsc = "" ;
      A11861Nxt_statio = "" ;
      A11866DesaDsc = "" ;
      A11867DptoDsc = "" ;
      A11864Nxt_artcli = "" ;
      ucDvpanel_transactiondetail_tableprecio = new com.genexus.webpanels.GXUserControl();
      A4477DisAcaBak = "" ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      ucDvpanel_transactiondetail_tableacabado = new com.genexus.webpanels.GXUserControl();
      A5349DisObsGrm = "" ;
      A5350DisObsAnc = "" ;
      A338DisArtEnc = "" ;
      A336DisArtCor = "" ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A5405DisAntpT = "" ;
      A343DisArtPle = "" ;
      A4471DisCruEnr = "" ;
      ucDvpanel_transactiondetail_tableinditex = new com.genexus.webpanels.GXUserControl();
      A9717Tb1_Dscf = "" ;
      A9773DisItem3 = "" ;
      A10887Cod_Idtx = "" ;
      A11661DisOrdComp = "" ;
      A13986DisIdtx2 = "" ;
      ucDvpanel_transactiondetail_tableotrosdatos = new com.genexus.webpanels.GXUserControl();
      A1430DisLoc = "" ;
      A365DisDes = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A1122MaqCodDis = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      AV11EmprCod = "" ;
      A12116DisTipCD = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l766ProForDsc = "" ;
      H01Y32_A766ProForDsc = new String[] {""} ;
      H01Y33_A766ProForDsc = new String[] {""} ;
      H01Y33_A13133ProForAct = new String[] {""} ;
      H01Y33_A396EmprCod = new String[] {""} ;
      H01Y33_A764ProForCod = new String[] {""} ;
      A13133ProForAct = "" ;
      A764ProForCod = "" ;
      H01Y34_A361DisCod = new int[1] ;
      H01Y34_A3132DisGraCru2 = new short[1] ;
      H01Y34_A1225DisGraCru = new short[1] ;
      H01Y34_A1233DisArtAc2 = new short[1] ;
      H01Y34_A1232DisArtAcb = new short[1] ;
      H01Y34_A1122MaqCodDis = new String[] {""} ;
      H01Y34_n1122MaqCodDis = new boolean[] {false} ;
      H01Y34_A392DisUniMed = new String[] {""} ;
      H01Y34_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Y34_A374DisNumPie = new short[1] ;
      H01Y34_A365DisDes = new String[] {""} ;
      H01Y34_A1502DisPart = new short[1] ;
      H01Y34_A1430DisLoc = new String[] {""} ;
      H01Y34_A13986DisIdtx2 = new String[] {""} ;
      H01Y34_n13986DisIdtx2 = new boolean[] {false} ;
      H01Y34_A11661DisOrdComp = new String[] {""} ;
      H01Y34_A10887Cod_Idtx = new String[] {""} ;
      H01Y34_n10887Cod_Idtx = new boolean[] {false} ;
      H01Y34_A9773DisItem3 = new String[] {""} ;
      H01Y34_A4471DisCruEnr = new String[] {""} ;
      H01Y34_A343DisArtPle = new String[] {""} ;
      H01Y34_A5405DisAntpT = new String[] {""} ;
      H01Y34_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Y34_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Y34_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Y34_A336DisArtCor = new String[] {""} ;
      H01Y34_A338DisArtEnc = new String[] {""} ;
      H01Y34_A342DisArtPes = new short[1] ;
      H01Y34_A5350DisObsAnc = new String[] {""} ;
      H01Y34_A1231DisArtAn1 = new short[1] ;
      H01Y34_A334DisArtAnh = new short[1] ;
      H01Y34_A5349DisObsGrm = new String[] {""} ;
      H01Y34_A3131DisGraAca2 = new short[1] ;
      H01Y34_A1906DisGraAca = new short[1] ;
      H01Y34_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Y34_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Y34_A4477DisAcaBak = new String[] {""} ;
      H01Y34_A11864Nxt_artcli = new String[] {""} ;
      H01Y34_A11867DptoDsc = new String[] {""} ;
      H01Y34_n11867DptoDsc = new boolean[] {false} ;
      H01Y34_A11863DptoID = new short[1] ;
      H01Y34_n11863DptoID = new boolean[] {false} ;
      H01Y34_A11866DesaDsc = new String[] {""} ;
      H01Y34_n11866DesaDsc = new boolean[] {false} ;
      H01Y34_A11862DesaID = new short[1] ;
      H01Y34_n11862DesaID = new boolean[] {false} ;
      H01Y34_A11861Nxt_statio = new String[] {""} ;
      H01Y34_A11865CpteDsc = new String[] {""} ;
      H01Y34_n11865CpteDsc = new boolean[] {false} ;
      H01Y34_A11860CpteId = new short[1] ;
      H01Y34_n11860CpteId = new boolean[] {false} ;
      H01Y34_A11859Nxt_modelo = new String[] {""} ;
      H01Y34_A4785DisNroCor = new int[1] ;
      H01Y34_A3307DisManCod1 = new short[1] ;
      H01Y34_A1052DisObs = new String[] {""} ;
      H01Y34_A1196DisNumCli = new int[1] ;
      H01Y34_A1195DisNomCli = new String[] {""} ;
      H01Y34_A5290DisTipCor = new String[] {""} ;
      H01Y34_A363DisColNum = new int[1] ;
      H01Y34_n363DisColNum = new boolean[] {false} ;
      H01Y34_A362DisColNom = new String[] {""} ;
      H01Y34_n362DisColNom = new boolean[] {false} ;
      H01Y34_A12327RevenNm = new String[] {""} ;
      H01Y34_n12327RevenNm = new boolean[] {false} ;
      H01Y34_A12328RevenID = new String[] {""} ;
      H01Y34_n12328RevenID = new boolean[] {false} ;
      H01Y34_A11660MarcaDsc = new String[] {""} ;
      H01Y34_n11660MarcaDsc = new boolean[] {false} ;
      H01Y34_A11659MarcaId = new String[] {""} ;
      H01Y34_n11659MarcaId = new boolean[] {false} ;
      H01Y34_A349DisArtPu3 = new short[1] ;
      H01Y34_n349DisArtPu3 = new boolean[] {false} ;
      H01Y34_A358DisArtUr3 = new String[] {""} ;
      H01Y34_A348DisArtPu2 = new short[1] ;
      H01Y34_A357DisArtUr2 = new String[] {""} ;
      H01Y34_A347DisArtPu1 = new short[1] ;
      H01Y34_A356DisArtUr1 = new String[] {""} ;
      H01Y34_A346DisArtPt3 = new short[1] ;
      H01Y34_A355DisArtTr3 = new String[] {""} ;
      H01Y34_A345DisArtPt2 = new short[1] ;
      H01Y34_A354DisArtTr2 = new String[] {""} ;
      H01Y34_A344DisArtPt1 = new short[1] ;
      H01Y34_A353DisArtTr1 = new String[] {""} ;
      H01Y34_A333DisArtAca = new String[] {""} ;
      H01Y34_A340DisArtMat = new String[] {""} ;
      H01Y34_A337DisArtDsc = new String[] {""} ;
      H01Y34_A335DisArtCod = new String[] {""} ;
      H01Y34_A2310DisCliDes = new int[1] ;
      H01Y34_A279CliNom = new String[] {""} ;
      H01Y34_A252CliCod = new int[1] ;
      H01Y34_A4014DisTin = new String[] {""} ;
      H01Y34_A7739DisExp = new String[] {""} ;
      H01Y34_A5032DisEstTip = new String[] {""} ;
      H01Y34_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y34_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y34_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y34_A2009DisTipDis = new String[] {""} ;
      H01Y34_n2009DisTipDis = new boolean[] {false} ;
      H01Y34_A360DisCliNum = new String[] {""} ;
      H01Y34_A4813DisEncCli = new String[] {""} ;
      H01Y34_A757PriCod = new String[] {""} ;
      H01Y34_A396EmprCod = new String[] {""} ;
      H01Y34_A4197DisCliDesN = new String[] {""} ;
      H01Y34_n4197DisCliDesN = new boolean[] {false} ;
      H01Y34_A352DisArtTip = new short[1] ;
      H01Y34_A4478DisAcaAnh = new short[1] ;
      H01Y34_A390DisTipCol = new byte[1] ;
      H01Y34_n390DisTipCol = new boolean[] {false} ;
      A362DisColNom = "" ;
      GXv_int3 = new short[1] ;
      GXv_int5 = new byte[1] ;
      H01Y35_A766ProForDsc = new String[] {""} ;
      H01Y35_A13133ProForAct = new String[] {""} ;
      H01Y35_A396EmprCod = new String[] {""} ;
      H01Y35_A764ProForCod = new String[] {""} ;
      hsh = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char2 = new String[1] ;
      AV21Usurcod = "" ;
      GXv_char6 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA361DisCod = "" ;
      sCtrlAV12VisualizarAcciones = "" ;
      sCtrlAV13AccionesEnPopup = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disgeneral__default(),
         new Object[] {
             new Object[] {
            H01Y32_A766ProForDsc
            }
            , new Object[] {
            H01Y33_A766ProForDsc, H01Y33_A13133ProForAct, H01Y33_A396EmprCod, H01Y33_A764ProForCod
            }
            , new Object[] {
            H01Y34_A361DisCod, H01Y34_A3132DisGraCru2, H01Y34_A1225DisGraCru, H01Y34_A1233DisArtAc2, H01Y34_A1232DisArtAcb, H01Y34_A1122MaqCodDis, H01Y34_n1122MaqCodDis, H01Y34_A392DisUniMed, H01Y34_A375DisNumUni, H01Y34_A374DisNumPie,
            H01Y34_A365DisDes, H01Y34_A1502DisPart, H01Y34_A1430DisLoc, H01Y34_A13986DisIdtx2, H01Y34_n13986DisIdtx2, H01Y34_A11661DisOrdComp, H01Y34_A10887Cod_Idtx, H01Y34_n10887Cod_Idtx, H01Y34_A9773DisItem3, H01Y34_A4471DisCruEnr,
            H01Y34_A343DisArtPle, H01Y34_A5405DisAntpT, H01Y34_A1908DisRdoA, H01Y34_A1197DisEncCom, H01Y34_A1198DisEncAnh, H01Y34_A336DisArtCor, H01Y34_A338DisArtEnc, H01Y34_A342DisArtPes, H01Y34_A5350DisObsAnc, H01Y34_A1231DisArtAn1,
            H01Y34_A334DisArtAnh, H01Y34_A5349DisObsGrm, H01Y34_A3131DisGraAca2, H01Y34_A1906DisGraAca, H01Y34_A389DisPreMtr, H01Y34_A388DisPreKgm, H01Y34_A4477DisAcaBak, H01Y34_A11864Nxt_artcli, H01Y34_A11867DptoDsc, H01Y34_n11867DptoDsc,
            H01Y34_A11863DptoID, H01Y34_n11863DptoID, H01Y34_A11866DesaDsc, H01Y34_n11866DesaDsc, H01Y34_A11862DesaID, H01Y34_n11862DesaID, H01Y34_A11861Nxt_statio, H01Y34_A11865CpteDsc, H01Y34_n11865CpteDsc, H01Y34_A11860CpteId,
            H01Y34_n11860CpteId, H01Y34_A11859Nxt_modelo, H01Y34_A4785DisNroCor, H01Y34_A3307DisManCod1, H01Y34_A1052DisObs, H01Y34_A1196DisNumCli, H01Y34_A1195DisNomCli, H01Y34_A5290DisTipCor, H01Y34_A363DisColNum, H01Y34_n363DisColNum,
            H01Y34_A362DisColNom, H01Y34_n362DisColNom, H01Y34_A12327RevenNm, H01Y34_n12327RevenNm, H01Y34_A12328RevenID, H01Y34_n12328RevenID, H01Y34_A11660MarcaDsc, H01Y34_n11660MarcaDsc, H01Y34_A11659MarcaId, H01Y34_n11659MarcaId,
            H01Y34_A349DisArtPu3, H01Y34_n349DisArtPu3, H01Y34_A358DisArtUr3, H01Y34_A348DisArtPu2, H01Y34_A357DisArtUr2, H01Y34_A347DisArtPu1, H01Y34_A356DisArtUr1, H01Y34_A346DisArtPt3, H01Y34_A355DisArtTr3, H01Y34_A345DisArtPt2,
            H01Y34_A354DisArtTr2, H01Y34_A344DisArtPt1, H01Y34_A353DisArtTr1, H01Y34_A333DisArtAca, H01Y34_A340DisArtMat, H01Y34_A337DisArtDsc, H01Y34_A335DisArtCod, H01Y34_A2310DisCliDes, H01Y34_A279CliNom, H01Y34_A252CliCod,
            H01Y34_A4014DisTin, H01Y34_A7739DisExp, H01Y34_A5032DisEstTip, H01Y34_A371DisFecEnt, H01Y34_A369DisFec, H01Y34_A370DisFecCli, H01Y34_A2009DisTipDis, H01Y34_n2009DisTipDis, H01Y34_A360DisCliNum, H01Y34_A4813DisEncCli,
            H01Y34_A757PriCod, H01Y34_A396EmprCod, H01Y34_A4197DisCliDesN, H01Y34_n4197DisCliDesN, H01Y34_A352DisArtTip, H01Y34_A4478DisAcaAnh, H01Y34_A390DisTipCol, H01Y34_n390DisTipCol
            }
            , new Object[] {
            H01Y35_A766ProForDsc, H01Y35_A13133ProForAct, H01Y35_A396EmprCod, H01Y35_A764ProForCod
            }
         }
      );
      AV18Pgmname = "Pedidos.DisGeneral" ;
      /* GeneXus formulas. */
      AV18Pgmname = "Pedidos.DisGeneral" ;
      Gx_err = (short)(0) ;
      edtavPrgtinmd21_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A390DisTipCol ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXv_int5[] ;
   private byte AV15Moda21 ;
   private byte nGXWrapped ;
   private short A11860CpteId ;
   private short A11862DesaID ;
   private short A11863DptoID ;
   private short wbEnd ;
   private short wbStart ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A1906DisGraAca ;
   private short A3131DisGraAca2 ;
   private short A334DisArtAnh ;
   private short A1231DisArtAn1 ;
   private short A342DisArtPes ;
   private short A4478DisAcaAnh ;
   private short A1502DisPart ;
   private short A374DisNumPie ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A1225DisGraCru ;
   private short A3132DisGraCru2 ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short A3307DisManCod1 ;
   private short GXv_int3[] ;
   private int wcpOA361DisCod ;
   private int A361DisCod ;
   private int edtDisCod_Enabled ;
   private int edtDisEncCli_Enabled ;
   private int edtDisCliNum_Enabled ;
   private int edtDisTipDis_Enabled ;
   private int edtDisFecCli_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtDisFecEnt_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int A2310DisCliDes ;
   private int edtDisCliDes_Enabled ;
   private int edtDisCliDesN_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtDisArtMat_Enabled ;
   private int edtDisArtAca_Enabled ;
   private int edtDisArtTip_Enabled ;
   private int edtDisArtTipD_Enabled ;
   private int edtDisArtTr1_Enabled ;
   private int edtDisArtPt1_Enabled ;
   private int edtDisArtTr2_Enabled ;
   private int edtDisArtPt2_Enabled ;
   private int edtDisArtTr3_Enabled ;
   private int edtDisArtPt3_Enabled ;
   private int edtDisArtUr1_Enabled ;
   private int edtDisArtPu1_Enabled ;
   private int edtDisArtUr2_Enabled ;
   private int edtDisArtPu2_Enabled ;
   private int edtDisArtUr3_Enabled ;
   private int edtDisArtPu3_Enabled ;
   private int edtMarcaId_Enabled ;
   private int edtMarcaDsc_Enabled ;
   private int edtRevenID_Enabled ;
   private int edtRevenNm_Enabled ;
   private int A363DisColNum ;
   private int edtDisColNum_Enabled ;
   private int edtDisTipCor_Enabled ;
   private int edtDisTipCol_Enabled ;
   private int edtDisNomCli_Enabled ;
   private int A1196DisNumCli ;
   private int edtDisNumCli_Enabled ;
   private int edtDisObs_Enabled ;
   private int divTransactiondetail_tablecolormoda21_Visible ;
   private int A4785DisNroCor ;
   private int edtDisNroCor_Enabled ;
   private int edtavPrgtinmd21_Enabled ;
   private int edtNxt_modelo_Enabled ;
   private int edtCpteId_Enabled ;
   private int edtCpteDsc_Enabled ;
   private int edtNxt_statio_Enabled ;
   private int edtDesaID_Enabled ;
   private int edtDesaDsc_Enabled ;
   private int edtDptoID_Enabled ;
   private int edtDptoDsc_Enabled ;
   private int edtNxt_artcli_Enabled ;
   private int edtDisPreKgm_Enabled ;
   private int edtDisPreMtr_Enabled ;
   private int edtDisGraAca_Enabled ;
   private int edtDisGraAca2_Enabled ;
   private int edtDisObsGrm_Enabled ;
   private int edtDisArtAnh_Enabled ;
   private int edtDisArtAn1_Enabled ;
   private int edtDisObsAnc_Enabled ;
   private int edtDisArtPes_Enabled ;
   private int edtDisEncAnh_Enabled ;
   private int edtDisEncCom_Enabled ;
   private int edtDisRdoA_Enabled ;
   private int edtDisArtPle_Enabled ;
   private int edtDisAcaAnh_Enabled ;
   private int edtTb1_Dscf_Enabled ;
   private int edtDisItem3_Enabled ;
   private int edtCod_Idtx_Enabled ;
   private int edtDisOrdComp_Enabled ;
   private int edtDisIdtx2_Enabled ;
   private int edtDisLoc_Enabled ;
   private int edtDisPart_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtDisNumUni_Enabled ;
   private int edtMaqCodDis_Enabled ;
   private int edtDisArtAcb_Enabled ;
   private int edtDisArtAc2_Enabled ;
   private int edtDisGraCru_Enabled ;
   private int edtDisGraCru2_Enabled ;
   private int bttBtnupdate_Visible ;
   private int bttBtndelete_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavEmprcod_Visible ;
   private int edtDisTipCD_Visible ;
   private int gxdynajaxindex ;
   private int edtDisManCod1_Enabled ;
   private int edtDisColNom_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A375DisNumUni ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A766ProForDsc ;
   private String h333DisArtAca ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A11659MarcaId ;
   private String A12328RevenID ;
   private String AV18Pgmname ;
   private String A333DisArtAca ;
   private String Dvpanel_transactiondetail_tablecliente_Width ;
   private String Dvpanel_transactiondetail_tablecliente_Cls ;
   private String Dvpanel_transactiondetail_tablecliente_Title ;
   private String Dvpanel_transactiondetail_tablecliente_Iconposition ;
   private String Dvpanel_transactiondetail_tablearticulotipo_Width ;
   private String Dvpanel_transactiondetail_tablearticulotipo_Cls ;
   private String Dvpanel_transactiondetail_tablearticulotipo_Title ;
   private String Dvpanel_transactiondetail_tablearticulotipo_Iconposition ;
   private String Dvpanel_transactiondetail_tablecolores_Width ;
   private String Dvpanel_transactiondetail_tablecolores_Cls ;
   private String Dvpanel_transactiondetail_tablecolores_Title ;
   private String Dvpanel_transactiondetail_tablecolores_Iconposition ;
   private String Dvpanel_transactiondetail_tablenext_Width ;
   private String Dvpanel_transactiondetail_tablenext_Cls ;
   private String Dvpanel_transactiondetail_tablenext_Title ;
   private String Dvpanel_transactiondetail_tablenext_Iconposition ;
   private String Dvpanel_transactiondetail_tableprecio_Width ;
   private String Dvpanel_transactiondetail_tableprecio_Cls ;
   private String Dvpanel_transactiondetail_tableprecio_Title ;
   private String Dvpanel_transactiondetail_tableprecio_Iconposition ;
   private String Dvpanel_transactiondetail_tableacabado_Width ;
   private String Dvpanel_transactiondetail_tableacabado_Cls ;
   private String Dvpanel_transactiondetail_tableacabado_Title ;
   private String Dvpanel_transactiondetail_tableacabado_Iconposition ;
   private String Dvpanel_transactiondetail_tableinditex_Width ;
   private String Dvpanel_transactiondetail_tableinditex_Cls ;
   private String Dvpanel_transactiondetail_tableinditex_Title ;
   private String Dvpanel_transactiondetail_tableinditex_Iconposition ;
   private String Dvpanel_transactiondetail_tableotrosdatos_Width ;
   private String Dvpanel_transactiondetail_tableotrosdatos_Cls ;
   private String Dvpanel_transactiondetail_tableotrosdatos_Title ;
   private String Dvpanel_transactiondetail_tableotrosdatos_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablemain_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tablecliente_Internalname ;
   private String divTransactiondetail_tablecliente_Internalname ;
   private String divUnnamedtable23_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String A757PriCod ;
   private String divUnnamedtable24_Internalname ;
   private String divDisenccli_cell_Internalname ;
   private String edtDisEncCli_Internalname ;
   private String A4813DisEncCli ;
   private String edtDisEncCli_Jsonclick ;
   private String divDisclinum_cell_Internalname ;
   private String edtDisCliNum_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Jsonclick ;
   private String divUnnamedtable25_Internalname ;
   private String divDistipdis_cell_Internalname ;
   private String edtDisTipDis_Internalname ;
   private String A2009DisTipDis ;
   private String edtDisTipDis_Jsonclick ;
   private String divUnnamedtable26_Internalname ;
   private String edtDisFecCli_Internalname ;
   private String edtDisFecCli_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String edtDisFecEnt_Internalname ;
   private String edtDisFecEnt_Jsonclick ;
   private String divUnnamedtable27_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String A5032DisEstTip ;
   private String A7739DisExp ;
   private String A4014DisTin ;
   private String divUnnamedtable28_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDisCliDes_Internalname ;
   private String edtDisCliDes_Jsonclick ;
   private String edtDisCliDesN_Internalname ;
   private String A4197DisCliDesN ;
   private String edtDisCliDesN_Jsonclick ;
   private String Dvpanel_transactiondetail_tablearticulotipo_Internalname ;
   private String divTransactiondetail_tablearticulotipo_Internalname ;
   private String divUnnamedtable17_Internalname ;
   private String edtDisArtCod_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String edtDisArtMat_Internalname ;
   private String A340DisArtMat ;
   private String edtDisArtMat_Jsonclick ;
   private String edtDisArtAca_Internalname ;
   private String edtDisArtAca_Jsonclick ;
   private String divUnnamedtable18_Internalname ;
   private String divUnnamedtable21_Internalname ;
   private String edtDisArtTip_Internalname ;
   private String edtDisArtTip_Jsonclick ;
   private String edtDisArtTipD_Internalname ;
   private String A12115DisArtTipD ;
   private String edtDisArtTipD_Jsonclick ;
   private String divUnnamedtable22_Internalname ;
   private String edtDisArtTr1_Internalname ;
   private String A353DisArtTr1 ;
   private String edtDisArtTr1_Jsonclick ;
   private String edtDisArtPt1_Internalname ;
   private String edtDisArtPt1_Jsonclick ;
   private String edtDisArtTr2_Internalname ;
   private String A354DisArtTr2 ;
   private String edtDisArtTr2_Jsonclick ;
   private String edtDisArtPt2_Internalname ;
   private String edtDisArtPt2_Jsonclick ;
   private String edtDisArtTr3_Internalname ;
   private String A355DisArtTr3 ;
   private String edtDisArtTr3_Jsonclick ;
   private String edtDisArtPt3_Internalname ;
   private String edtDisArtPt3_Jsonclick ;
   private String edtDisArtUr1_Internalname ;
   private String A356DisArtUr1 ;
   private String edtDisArtUr1_Jsonclick ;
   private String edtDisArtPu1_Internalname ;
   private String edtDisArtPu1_Jsonclick ;
   private String edtDisArtUr2_Internalname ;
   private String A357DisArtUr2 ;
   private String edtDisArtUr2_Jsonclick ;
   private String edtDisArtPu2_Internalname ;
   private String edtDisArtPu2_Jsonclick ;
   private String edtDisArtUr3_Internalname ;
   private String A358DisArtUr3 ;
   private String edtDisArtUr3_Jsonclick ;
   private String edtDisArtPu3_Internalname ;
   private String edtDisArtPu3_Jsonclick ;
   private String divUnnamedtable19_Internalname ;
   private String divMarcaid_cell_Internalname ;
   private String edtMarcaId_Internalname ;
   private String edtMarcaId_Jsonclick ;
   private String edtMarcaDsc_Internalname ;
   private String A11660MarcaDsc ;
   private String edtMarcaDsc_Link ;
   private String edtMarcaDsc_Jsonclick ;
   private String divUnnamedtable20_Internalname ;
   private String divRevenid_cell_Internalname ;
   private String edtRevenID_Internalname ;
   private String edtRevenID_Jsonclick ;
   private String edtRevenNm_Internalname ;
   private String A12327RevenNm ;
   private String edtRevenNm_Link ;
   private String edtRevenNm_Jsonclick ;
   private String Dvpanel_transactiondetail_tablecolores_Internalname ;
   private String divTransactiondetail_tablecolores_Internalname ;
   private String divUnnamedtable16_Internalname ;
   private String divTablesplitteddiscolnom_Internalname ;
   private String lblTextblockdiscolnom_Internalname ;
   private String lblTextblockdiscolnom_Jsonclick ;
   private String edtDisColNum_Internalname ;
   private String edtDisColNum_Jsonclick ;
   private String edtDisTipCor_Internalname ;
   private String A5290DisTipCor ;
   private String edtDisTipCor_Jsonclick ;
   private String edtDisTipCol_Internalname ;
   private String edtDisTipCol_Jsonclick ;
   private String edtDisNomCli_Internalname ;
   private String A1195DisNomCli ;
   private String edtDisNomCli_Jsonclick ;
   private String edtDisNumCli_Internalname ;
   private String edtDisNumCli_Jsonclick ;
   private String edtDisObs_Internalname ;
   private String A1052DisObs ;
   private String edtDisObs_Jsonclick ;
   private String divTransactiondetail_tablecolormoda21_Internalname ;
   private String divTablesplitteddismancod1_Internalname ;
   private String lblTextblockdismancod1_Internalname ;
   private String lblTextblockdismancod1_Jsonclick ;
   private String edtDisNroCor_Internalname ;
   private String edtDisNroCor_Jsonclick ;
   private String edtavPrgtinmd21_Internalname ;
   private String TempTags ;
   private String AV14PrgTinMd21 ;
   private String edtavPrgtinmd21_Jsonclick ;
   private String Dvpanel_transactiondetail_tablenext_Internalname ;
   private String divTransactiondetail_tablenext_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String edtNxt_modelo_Internalname ;
   private String A11859Nxt_modelo ;
   private String edtNxt_modelo_Jsonclick ;
   private String divUnnamedtable13_Internalname ;
   private String edtCpteId_Internalname ;
   private String edtCpteId_Jsonclick ;
   private String edtCpteDsc_Internalname ;
   private String A11865CpteDsc ;
   private String edtCpteDsc_Link ;
   private String edtCpteDsc_Jsonclick ;
   private String edtNxt_statio_Internalname ;
   private String A11861Nxt_statio ;
   private String edtNxt_statio_Jsonclick ;
   private String divUnnamedtable14_Internalname ;
   private String edtDesaID_Internalname ;
   private String edtDesaID_Jsonclick ;
   private String edtDesaDsc_Internalname ;
   private String A11866DesaDsc ;
   private String edtDesaDsc_Link ;
   private String edtDesaDsc_Jsonclick ;
   private String divUnnamedtable15_Internalname ;
   private String edtDptoID_Internalname ;
   private String edtDptoID_Jsonclick ;
   private String edtDptoDsc_Internalname ;
   private String A11867DptoDsc ;
   private String edtDptoDsc_Link ;
   private String edtDptoDsc_Jsonclick ;
   private String edtNxt_artcli_Internalname ;
   private String A11864Nxt_artcli ;
   private String edtNxt_artcli_Jsonclick ;
   private String Dvpanel_transactiondetail_tableprecio_Internalname ;
   private String divTransactiondetail_tableprecio_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String A4477DisAcaBak ;
   private String edtDisPreKgm_Internalname ;
   private String edtDisPreKgm_Jsonclick ;
   private String edtDisPreMtr_Internalname ;
   private String edtDisPreMtr_Jsonclick ;
   private String Dvpanel_transactiondetail_tableacabado_Internalname ;
   private String divTransactiondetail_tableacabado_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtDisGraAca_Internalname ;
   private String edtDisGraAca_Jsonclick ;
   private String edtDisGraAca2_Internalname ;
   private String edtDisGraAca2_Jsonclick ;
   private String edtDisObsGrm_Internalname ;
   private String A5349DisObsGrm ;
   private String edtDisObsGrm_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtDisArtAnh_Internalname ;
   private String edtDisArtAnh_Jsonclick ;
   private String edtDisArtAn1_Internalname ;
   private String edtDisArtAn1_Jsonclick ;
   private String edtDisObsAnc_Internalname ;
   private String A5350DisObsAnc ;
   private String edtDisObsAnc_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtDisArtPes_Internalname ;
   private String edtDisArtPes_Jsonclick ;
   private String A338DisArtEnc ;
   private String A336DisArtCor ;
   private String divUnnamedtable10_Internalname ;
   private String edtDisEncAnh_Internalname ;
   private String edtDisEncAnh_Jsonclick ;
   private String edtDisEncCom_Internalname ;
   private String edtDisEncCom_Jsonclick ;
   private String edtDisRdoA_Internalname ;
   private String edtDisRdoA_Jsonclick ;
   private String A5405DisAntpT ;
   private String edtDisArtPle_Internalname ;
   private String A343DisArtPle ;
   private String edtDisArtPle_Jsonclick ;
   private String A4471DisCruEnr ;
   private String Dvpanel_transactiondetail_tableinditex_Internalname ;
   private String divTransactiondetail_tableinditex_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divDisacaanh_cell_Internalname ;
   private String edtDisAcaAnh_Internalname ;
   private String edtDisAcaAnh_Jsonclick ;
   private String edtTb1_Dscf_Internalname ;
   private String A9717Tb1_Dscf ;
   private String edtTb1_Dscf_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtDisItem3_Internalname ;
   private String A9773DisItem3 ;
   private String edtDisItem3_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divCod_idtx_cell_Internalname ;
   private String edtCod_Idtx_Internalname ;
   private String A10887Cod_Idtx ;
   private String edtCod_Idtx_Jsonclick ;
   private String edtDisOrdComp_Internalname ;
   private String edtDisOrdComp_Jsonclick ;
   private String divDisidtx2_cell_Internalname ;
   private String edtDisIdtx2_Internalname ;
   private String A13986DisIdtx2 ;
   private String edtDisIdtx2_Jsonclick ;
   private String Dvpanel_transactiondetail_tableotrosdatos_Internalname ;
   private String divTransactiondetail_tableotrosdatos_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtDisLoc_Internalname ;
   private String A1430DisLoc ;
   private String edtDisLoc_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtDisPart_Internalname ;
   private String edtDisPart_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String A365DisDes ;
   private String edtDisNumPie_Internalname ;
   private String edtDisNumPie_Jsonclick ;
   private String edtDisNumUni_Internalname ;
   private String edtDisNumUni_Jsonclick ;
   private String A392DisUniMed ;
   private String edtMaqCodDis_Internalname ;
   private String A1122MaqCodDis ;
   private String edtMaqCodDis_Jsonclick ;
   private String edtDisArtAcb_Internalname ;
   private String edtDisArtAcb_Jsonclick ;
   private String edtDisArtAc2_Internalname ;
   private String edtDisArtAc2_Jsonclick ;
   private String edtDisGraCru_Internalname ;
   private String edtDisGraCru_Jsonclick ;
   private String edtDisGraCru2_Internalname ;
   private String edtDisGraCru2_Jsonclick ;
   private String divTransactiondetail_tableinvisible_Internalname ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavEmprcod_Internalname ;
   private String AV11EmprCod ;
   private String edtavEmprcod_Jsonclick ;
   private String edtDisTipCD_Internalname ;
   private String A12116DisTipCD ;
   private String edtDisTipCD_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l766ProForDsc ;
   private String A13133ProForAct ;
   private String A764ProForCod ;
   private String A362DisColNom ;
   private String edtDisColNom_Internalname ;
   private String edtDisManCod1_Internalname ;
   private String hsh ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV20Emprnom ;
   private String GXv_char2[] ;
   private String AV21Usurcod ;
   private String GXv_char6[] ;
   private String sStyleString ;
   private String tblTablemergeddismancod1_Internalname ;
   private String edtDisManCod1_Jsonclick ;
   private String divTransactiondetail_tablesearch_dismancod1_Internalname ;
   private String tblTablemergeddiscolnom_Internalname ;
   private String edtDisColNom_Jsonclick ;
   private String divTransactiondetail_tablesearch_discolnom_Internalname ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA361DisCod ;
   private String sCtrlAV12VisualizarAcciones ;
   private String sCtrlAV13AccionesEnPopup ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private boolean wcpOAV12VisualizarAcciones ;
   private boolean wcpOAV13AccionesEnPopup ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12VisualizarAcciones ;
   private boolean AV13AccionesEnPopup ;
   private boolean Dvpanel_transactiondetail_tablecliente_Autowidth ;
   private boolean Dvpanel_transactiondetail_tablecliente_Autoheight ;
   private boolean Dvpanel_transactiondetail_tablecliente_Collapsible ;
   private boolean Dvpanel_transactiondetail_tablecliente_Collapsed ;
   private boolean Dvpanel_transactiondetail_tablecliente_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tablecliente_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tablearticulotipo_Autowidth ;
   private boolean Dvpanel_transactiondetail_tablearticulotipo_Autoheight ;
   private boolean Dvpanel_transactiondetail_tablearticulotipo_Collapsible ;
   private boolean Dvpanel_transactiondetail_tablearticulotipo_Collapsed ;
   private boolean Dvpanel_transactiondetail_tablearticulotipo_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tablearticulotipo_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tablecolores_Autowidth ;
   private boolean Dvpanel_transactiondetail_tablecolores_Autoheight ;
   private boolean Dvpanel_transactiondetail_tablecolores_Collapsible ;
   private boolean Dvpanel_transactiondetail_tablecolores_Collapsed ;
   private boolean Dvpanel_transactiondetail_tablecolores_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tablecolores_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tablenext_Autowidth ;
   private boolean Dvpanel_transactiondetail_tablenext_Autoheight ;
   private boolean Dvpanel_transactiondetail_tablenext_Collapsible ;
   private boolean Dvpanel_transactiondetail_tablenext_Collapsed ;
   private boolean Dvpanel_transactiondetail_tablenext_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tablenext_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tableprecio_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableprecio_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableprecio_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableprecio_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableprecio_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableprecio_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tableacabado_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableacabado_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableacabado_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableacabado_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableacabado_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableacabado_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tableinditex_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableinditex_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableinditex_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableinditex_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableinditex_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableinditex_Autoscroll ;
   private boolean Dvpanel_transactiondetail_tableotrosdatos_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableotrosdatos_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableotrosdatos_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableotrosdatos_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableotrosdatos_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableotrosdatos_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n1122MaqCodDis ;
   private boolean n13986DisIdtx2 ;
   private boolean n10887Cod_Idtx ;
   private boolean n11867DptoDsc ;
   private boolean n11863DptoID ;
   private boolean n11866DesaDsc ;
   private boolean n11862DesaID ;
   private boolean n11865CpteDsc ;
   private boolean n11860CpteId ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n12327RevenNm ;
   private boolean n12328RevenID ;
   private boolean n11660MarcaDsc ;
   private boolean n11659MarcaId ;
   private boolean n349DisArtPu3 ;
   private boolean n2009DisTipDis ;
   private boolean n4197DisCliDesN ;
   private boolean n390DisTipCol ;
   private boolean returnInSub ;
   private String A11661DisOrdComp ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tablecliente ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tablearticulotipo ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tablecolores ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tablenext ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableprecio ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableacabado ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableinditex ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableotrosdatos ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPriCod ;
   private ICheckbox chkDisEstTip ;
   private ICheckbox chkDisExp ;
   private ICheckbox chkDisTin ;
   private ICheckbox chkDisAcaBak ;
   private ICheckbox chkDisArtEnc ;
   private ICheckbox chkDisArtCor ;
   private HTMLChoice cmbDisAntpT ;
   private HTMLChoice cmbDisCruEnr ;
   private ICheckbox chkDisDes ;
   private HTMLChoice cmbDisUniMed ;
   private IDataStoreProvider pr_default ;
   private String[] H01Y32_A766ProForDsc ;
   private String[] H01Y33_A766ProForDsc ;
   private String[] H01Y33_A13133ProForAct ;
   private String[] H01Y33_A396EmprCod ;
   private String[] H01Y33_A764ProForCod ;
   private int[] H01Y34_A361DisCod ;
   private short[] H01Y34_A3132DisGraCru2 ;
   private short[] H01Y34_A1225DisGraCru ;
   private short[] H01Y34_A1233DisArtAc2 ;
   private short[] H01Y34_A1232DisArtAcb ;
   private String[] H01Y34_A1122MaqCodDis ;
   private boolean[] H01Y34_n1122MaqCodDis ;
   private String[] H01Y34_A392DisUniMed ;
   private java.math.BigDecimal[] H01Y34_A375DisNumUni ;
   private short[] H01Y34_A374DisNumPie ;
   private String[] H01Y34_A365DisDes ;
   private short[] H01Y34_A1502DisPart ;
   private String[] H01Y34_A1430DisLoc ;
   private String[] H01Y34_A13986DisIdtx2 ;
   private boolean[] H01Y34_n13986DisIdtx2 ;
   private String[] H01Y34_A11661DisOrdComp ;
   private String[] H01Y34_A10887Cod_Idtx ;
   private boolean[] H01Y34_n10887Cod_Idtx ;
   private String[] H01Y34_A9773DisItem3 ;
   private String[] H01Y34_A4471DisCruEnr ;
   private String[] H01Y34_A343DisArtPle ;
   private String[] H01Y34_A5405DisAntpT ;
   private java.math.BigDecimal[] H01Y34_A1908DisRdoA ;
   private java.math.BigDecimal[] H01Y34_A1197DisEncCom ;
   private java.math.BigDecimal[] H01Y34_A1198DisEncAnh ;
   private String[] H01Y34_A336DisArtCor ;
   private String[] H01Y34_A338DisArtEnc ;
   private short[] H01Y34_A342DisArtPes ;
   private String[] H01Y34_A5350DisObsAnc ;
   private short[] H01Y34_A1231DisArtAn1 ;
   private short[] H01Y34_A334DisArtAnh ;
   private String[] H01Y34_A5349DisObsGrm ;
   private short[] H01Y34_A3131DisGraAca2 ;
   private short[] H01Y34_A1906DisGraAca ;
   private java.math.BigDecimal[] H01Y34_A389DisPreMtr ;
   private java.math.BigDecimal[] H01Y34_A388DisPreKgm ;
   private String[] H01Y34_A4477DisAcaBak ;
   private String[] H01Y34_A11864Nxt_artcli ;
   private String[] H01Y34_A11867DptoDsc ;
   private boolean[] H01Y34_n11867DptoDsc ;
   private short[] H01Y34_A11863DptoID ;
   private boolean[] H01Y34_n11863DptoID ;
   private String[] H01Y34_A11866DesaDsc ;
   private boolean[] H01Y34_n11866DesaDsc ;
   private short[] H01Y34_A11862DesaID ;
   private boolean[] H01Y34_n11862DesaID ;
   private String[] H01Y34_A11861Nxt_statio ;
   private String[] H01Y34_A11865CpteDsc ;
   private boolean[] H01Y34_n11865CpteDsc ;
   private short[] H01Y34_A11860CpteId ;
   private boolean[] H01Y34_n11860CpteId ;
   private String[] H01Y34_A11859Nxt_modelo ;
   private int[] H01Y34_A4785DisNroCor ;
   private short[] H01Y34_A3307DisManCod1 ;
   private String[] H01Y34_A1052DisObs ;
   private int[] H01Y34_A1196DisNumCli ;
   private String[] H01Y34_A1195DisNomCli ;
   private String[] H01Y34_A5290DisTipCor ;
   private int[] H01Y34_A363DisColNum ;
   private boolean[] H01Y34_n363DisColNum ;
   private String[] H01Y34_A362DisColNom ;
   private boolean[] H01Y34_n362DisColNom ;
   private String[] H01Y34_A12327RevenNm ;
   private boolean[] H01Y34_n12327RevenNm ;
   private String[] H01Y34_A12328RevenID ;
   private boolean[] H01Y34_n12328RevenID ;
   private String[] H01Y34_A11660MarcaDsc ;
   private boolean[] H01Y34_n11660MarcaDsc ;
   private String[] H01Y34_A11659MarcaId ;
   private boolean[] H01Y34_n11659MarcaId ;
   private short[] H01Y34_A349DisArtPu3 ;
   private boolean[] H01Y34_n349DisArtPu3 ;
   private String[] H01Y34_A358DisArtUr3 ;
   private short[] H01Y34_A348DisArtPu2 ;
   private String[] H01Y34_A357DisArtUr2 ;
   private short[] H01Y34_A347DisArtPu1 ;
   private String[] H01Y34_A356DisArtUr1 ;
   private short[] H01Y34_A346DisArtPt3 ;
   private String[] H01Y34_A355DisArtTr3 ;
   private short[] H01Y34_A345DisArtPt2 ;
   private String[] H01Y34_A354DisArtTr2 ;
   private short[] H01Y34_A344DisArtPt1 ;
   private String[] H01Y34_A353DisArtTr1 ;
   private String[] H01Y34_A333DisArtAca ;
   private String[] H01Y34_A340DisArtMat ;
   private String[] H01Y34_A337DisArtDsc ;
   private String[] H01Y34_A335DisArtCod ;
   private int[] H01Y34_A2310DisCliDes ;
   private String[] H01Y34_A279CliNom ;
   private int[] H01Y34_A252CliCod ;
   private String[] H01Y34_A4014DisTin ;
   private String[] H01Y34_A7739DisExp ;
   private String[] H01Y34_A5032DisEstTip ;
   private java.util.Date[] H01Y34_A371DisFecEnt ;
   private java.util.Date[] H01Y34_A369DisFec ;
   private java.util.Date[] H01Y34_A370DisFecCli ;
   private String[] H01Y34_A2009DisTipDis ;
   private boolean[] H01Y34_n2009DisTipDis ;
   private String[] H01Y34_A360DisCliNum ;
   private String[] H01Y34_A4813DisEncCli ;
   private String[] H01Y34_A757PriCod ;
   private String[] H01Y34_A396EmprCod ;
   private String[] H01Y34_A4197DisCliDesN ;
   private boolean[] H01Y34_n4197DisCliDesN ;
   private short[] H01Y34_A352DisArtTip ;
   private short[] H01Y34_A4478DisAcaAnh ;
   private byte[] H01Y34_A390DisTipCol ;
   private boolean[] H01Y34_n390DisTipCol ;
   private String[] H01Y35_A766ProForDsc ;
   private String[] H01Y35_A13133ProForAct ;
   private String[] H01Y35_A396EmprCod ;
   private String[] H01Y35_A764ProForCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class disgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01Y32", "SELECT * FROM (SELECT DISTINCT ProForDsc FROM TXPCPROFO WHERE (EmprCod = ?) AND (UPPER(ProForDsc) like '%' || UPPER(?)) ORDER BY ProForDsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01Y33", "SELECT ProForDsc, ProForAct, EmprCod, ProForCod FROM TXPCPROFO WHERE (ProForDsc = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01Y34", "SELECT T1.DisCod, T1.DisGraCru2, T1.DisGraCru, T1.DisArtAc2, T1.DisArtAcb, T1.MaqCodDis, T1.DisUniMed, T1.DisNumUni, T1.DisNumPie, T1.DisDes, T1.DisPart, T1.DisLoc, T1.DisIdtx2, T1.DisOrdComp, T1.Cod_Idtx, T1.DisItem3, T1.DisCruEnr, T1.DisArtPle, T1.DisAntpT, T1.DisRdoA, T1.DisEncCom, T1.DisEncAnh, T1.DisArtCor, T1.DisArtEnc, T1.DisArtPes, T1.DisObsAnc, T1.DisArtAn1, T1.DisArtAnh, T1.DisObsGrm, T1.DisGraAca2, T1.DisGraAca, T1.DisPreMtr, T1.DisPreKgm, T1.DisAcaBak, T1.Nxt_artcli, T4.DptoDsc, T1.DptoID, T6.DesaDsc, T1.DesaID, T1.Nxt_statio, T5.CpteDsc, T1.CpteId, T1.Nxt_modelo, T1.DisNroCor, T1.DisManCod1, T1.DisObs, T1.DisNumCli, T1.DisNomCli, T1.DisTipCor, T1.DisColNum, T1.DisColNom, T7.RevenNm, T1.RevenID, T3.MarcaDsc, T1.MarcaId, T1.DisArtPu3, T1.DisArtUr3, T1.DisArtPu2, T1.DisArtUr2, T1.DisArtPu1, T1.DisArtUr1, T1.DisArtPt3, T1.DisArtTr3, T1.DisArtPt2, T1.DisArtTr2, T1.DisArtPt1, T1.DisArtTr1, T1.DisArtAca, T1.DisArtMat, T1.DisArtDsc, T1.DisArtCod, T1.DisCliDes, T2.CliNom, T1.CliCod, T1.DisTin, T1.DisExp, T1.DisEstTip, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisTipDis, T1.DisCliNum, T1.DisEncCli, T1.PriCod, T1.EmprCod, COALESCE( T8.CliNom, '') AS DisCliDesN, T1.DisArtTip, T1.DisAcaAnh, T1.DisTipCol FROM (((((((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPMARCAS T3 ON T3.EmprCod = T1.EmprCod AND T3.MarcaId = T1.MarcaId) LEFT JOIN TXPNXT002 T4 ON T4.EmprCod = T1.EmprCod AND T4.DptoID = T1.DptoID) LEFT JOIN TXPNXT000 T5 ON T5.EmprCod = T1.EmprCod AND T5.CpteId = T1.CpteId) LEFT JOIN TXPNXT001 T6 ON T6.EmprCod = T1.EmprCod AND T6.DesaID = T1.DesaID) LEFT JOIN TXPREVEND T7 ON T7.EmprCod = T1.EmprCod AND T7.RevenID = T1.RevenID) LEFT JOIN TXPCLIENT T8 ON T8.EmprCod = T1.EmprCod AND T8.CliCod = T1.DisCliDes) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01Y35", "SELECT ProForDsc, ProForAct, EmprCod, ProForCod FROM TXPCPROFO WHERE (ProForDsc = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((String[]) buf[13])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((String[]) buf[20])[0] = rslt.getString(18, 10);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[25])[0] = rslt.getString(23, 1);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 20);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((short[]) buf[33])[0] = rslt.getShort(31);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(33,2);
               ((String[]) buf[36])[0] = rslt.getString(34, 1);
               ((String[]) buf[37])[0] = rslt.getString(35, 30);
               ((String[]) buf[38])[0] = rslt.getString(36, 30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(37);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(38, 30);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(39);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(40, 4);
               ((String[]) buf[47])[0] = rslt.getString(41, 30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(42);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(43, 30);
               ((int[]) buf[52])[0] = rslt.getInt(44);
               ((short[]) buf[53])[0] = rslt.getShort(45);
               ((String[]) buf[54])[0] = rslt.getString(46, 30);
               ((int[]) buf[55])[0] = rslt.getInt(47);
               ((String[]) buf[56])[0] = rslt.getString(48, 13);
               ((String[]) buf[57])[0] = rslt.getString(49, 2);
               ((int[]) buf[58])[0] = rslt.getInt(50);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(51, 13);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(52, 40);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(53, 10);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(54, 60);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(55, 6);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(56);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(57, 4);
               ((short[]) buf[73])[0] = rslt.getShort(58);
               ((String[]) buf[74])[0] = rslt.getString(59, 4);
               ((short[]) buf[75])[0] = rslt.getShort(60);
               ((String[]) buf[76])[0] = rslt.getString(61, 4);
               ((short[]) buf[77])[0] = rslt.getShort(62);
               ((String[]) buf[78])[0] = rslt.getString(63, 4);
               ((short[]) buf[79])[0] = rslt.getShort(64);
               ((String[]) buf[80])[0] = rslt.getString(65, 4);
               ((short[]) buf[81])[0] = rslt.getShort(66);
               ((String[]) buf[82])[0] = rslt.getString(67, 4);
               ((String[]) buf[83])[0] = rslt.getString(68, 6);
               ((String[]) buf[84])[0] = rslt.getString(69, 16);
               ((String[]) buf[85])[0] = rslt.getString(70, 26);
               ((String[]) buf[86])[0] = rslt.getString(71, 16);
               ((int[]) buf[87])[0] = rslt.getInt(72);
               ((String[]) buf[88])[0] = rslt.getString(73, 30);
               ((int[]) buf[89])[0] = rslt.getInt(74);
               ((String[]) buf[90])[0] = rslt.getString(75, 1);
               ((String[]) buf[91])[0] = rslt.getString(76, 1);
               ((String[]) buf[92])[0] = rslt.getString(77, 1);
               ((java.util.Date[]) buf[93])[0] = rslt.getGXDate(78);
               ((java.util.Date[]) buf[94])[0] = rslt.getGXDate(79);
               ((java.util.Date[]) buf[95])[0] = rslt.getGXDate(80);
               ((String[]) buf[96])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(82, 8);
               ((String[]) buf[99])[0] = rslt.getString(83, 20);
               ((String[]) buf[100])[0] = rslt.getString(84, 1);
               ((String[]) buf[101])[0] = rslt.getString(85, 3);
               ((String[]) buf[102])[0] = rslt.getString(86, 30);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((short[]) buf[104])[0] = rslt.getShort(87);
               ((short[]) buf[105])[0] = rslt.getShort(88);
               ((byte[]) buf[106])[0] = rslt.getByte(89);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

