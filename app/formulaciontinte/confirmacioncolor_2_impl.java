package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class confirmacioncolor_2_impl extends GXDataArea
{
   public confirmacioncolor_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public confirmacioncolor_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( confirmacioncolor_2_impl.class ));
   }

   public confirmacioncolor_2_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV8emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8emprcod", AV8emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
               AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
               AV6BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa1LT2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1LT2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.confirmacioncolor_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar))}, new String[] {"emprcod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15barsit), "Z9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV15barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15barsit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV6BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV11barser));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNOMCLI", GXutil.rtrim( AV16BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV17BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV18BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vSITUACIONHDR", GXutil.rtrim( AV20SituacionHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vRESULTADO", GXutil.ltrim( localUtil.ntoc( AV19resultado, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Title", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Title", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Title", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Title", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Result", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Result", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Result", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Result", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LABORATORIO_Result", GXutil.rtrim( Dvelop_confirmpanel_laboratorio_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SINTINTE_Result", GXutil.rtrim( Dvelop_confirmpanel_sintinte_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Result", GXutil.rtrim( Dvelop_confirmpanel_salidalaboratorio_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Result", GXutil.rtrim( Dvelop_confirmpanel_cambiarcolor_Result));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1LT2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1LT2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.formulaciontinte.confirmacioncolor_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar))}, new String[] {"emprcod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ConfirmacionColor_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Confirmacion Color", "") ;
   }

   public void wb1LT0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV9clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV10clinom), GXutil.rtrim( localUtil.format( AV10clinom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV12barcolnom), GXutil.rtrim( localUtil.format( AV12barcolnom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV13barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13barcolnum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13barcolnum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV14bartipcol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14bartipcol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV14bartipcol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
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
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlaboratorio_Internalname, "", httpContext.getMessage( "Laboratorio", ""), bttBtnlaboratorio_Jsonclick, 7, httpContext.getMessage( "Laboratorio", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111lt1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsintinte_Internalname, "", httpContext.getMessage( "Sin Tinte", ""), bttBtnsintinte_Jsonclick, 7, httpContext.getMessage( "Sin Tinte", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121lt1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalidalaboratorio_Internalname, "", httpContext.getMessage( "Salida Laboratorio", ""), bttBtnsalidalaboratorio_Jsonclick, 7, httpContext.getMessage( "Salida Laboratorio", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e131lt1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncambiarcolor_Internalname, "", httpContext.getMessage( "Cambiar Color", ""), bttBtncambiarcolor_Jsonclick, 7, httpContext.getMessage( "Cambiar Color", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e141lt1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConfirmacionColor_2.htm");
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
         wb_table1_67_1LT2( true) ;
      }
      else
      {
         wb_table1_67_1LT2( false) ;
      }
      return  ;
   }

   public void wb_table1_67_1LT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_72_1LT2( true) ;
      }
      else
      {
         wb_table2_72_1LT2( false) ;
      }
      return  ;
   }

   public void wb_table2_72_1LT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_77_1LT2( true) ;
      }
      else
      {
         wb_table3_77_1LT2( false) ;
      }
      return  ;
   }

   public void wb_table3_77_1LT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_82_1LT2( true) ;
      }
      else
      {
         wb_table4_82_1LT2( false) ;
      }
      return  ;
   }

   public void wb_table4_82_1LT2e( boolean wbgen )
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

   public void start1LT2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Confirmacion Color", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1LT0( ) ;
   }

   public void ws1LT2( )
   {
      start1LT2( ) ;
      evt1LT2( ) ;
   }

   public void evt1LT2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_LABORATORIO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151LT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_SINTINTE.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161LT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_SALIDALABORATORIO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171LT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CAMBIARCOLOR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181LT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e191LT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e201LT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e211LT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e221LT2 ();
                              }
                              dynload_actions( ) ;
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
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

   public void we1LT2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1LT2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      rf1LT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
   }

   public void rf1LT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e211LT2 ();
         wb1LT0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1LT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV15barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15barsit), "Z9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1LT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191LT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV15barsit = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Dvelop_confirmpanel_laboratorio_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Title") ;
         Dvelop_confirmpanel_laboratorio_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Confirmationtext") ;
         Dvelop_confirmpanel_laboratorio_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_laboratorio_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Nobuttoncaption") ;
         Dvelop_confirmpanel_laboratorio_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_laboratorio_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Yesbuttonposition") ;
         Dvelop_confirmpanel_laboratorio_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Confirmtype") ;
         Dvelop_confirmpanel_sintinte_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Title") ;
         Dvelop_confirmpanel_sintinte_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Confirmationtext") ;
         Dvelop_confirmpanel_sintinte_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Yesbuttoncaption") ;
         Dvelop_confirmpanel_sintinte_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Nobuttoncaption") ;
         Dvelop_confirmpanel_sintinte_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_sintinte_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Yesbuttonposition") ;
         Dvelop_confirmpanel_sintinte_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Confirmtype") ;
         Dvelop_confirmpanel_salidalaboratorio_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Title") ;
         Dvelop_confirmpanel_salidalaboratorio_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Confirmationtext") ;
         Dvelop_confirmpanel_salidalaboratorio_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_salidalaboratorio_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Nobuttoncaption") ;
         Dvelop_confirmpanel_salidalaboratorio_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_salidalaboratorio_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Yesbuttonposition") ;
         Dvelop_confirmpanel_salidalaboratorio_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Confirmtype") ;
         Dvelop_confirmpanel_cambiarcolor_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Title") ;
         Dvelop_confirmpanel_cambiarcolor_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Confirmationtext") ;
         Dvelop_confirmpanel_cambiarcolor_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cambiarcolor_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Nobuttoncaption") ;
         Dvelop_confirmpanel_cambiarcolor_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cambiarcolor_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Yesbuttonposition") ;
         Dvelop_confirmpanel_cambiarcolor_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Confirmtype") ;
         Dvelop_confirmpanel_laboratorio_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LABORATORIO_Result") ;
         Dvelop_confirmpanel_sintinte_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SINTINTE_Result") ;
         Dvelop_confirmpanel_salidalaboratorio_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_SALIDALABORATORIO_Result") ;
         Dvelop_confirmpanel_cambiarcolor_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CAMBIARCOLOR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9clicod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9clicod), 6, 0));
         }
         else
         {
            AV9clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9clicod), 6, 0));
         }
         AV10clinom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10clinom", AV10clinom);
         AV12barcolnom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12barcolnom", AV12barcolnom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13barcolnum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13barcolnum), 6, 0));
         }
         else
         {
            AV13barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13barcolnum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14bartipcol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14bartipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14bartipcol), 2, 0));
         }
         else
         {
            AV14bartipcol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14bartipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14bartipcol), 2, 0));
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
      e191LT2 ();
      if (returnInSub) return;
   }

   public void e191LT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      confirmacioncolor_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV8emprcod ;
      GXv_char3[0] = AV24Emprnom ;
      GXv_char4[0] = AV25Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      confirmacioncolor_2_impl.this.AV8emprcod = GXv_char2[0] ;
      confirmacioncolor_2_impl.this.AV24Emprnom = GXv_char3[0] ;
      confirmacioncolor_2_impl.this.AV25Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8emprcod", AV8emprcod);
   }

   public void e151LT2( )
   {
      /* Dvelop_confirmpanel_laboratorio_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_laboratorio_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION LABORATORIO' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e161LT2( )
   {
      /* Dvelop_confirmpanel_sintinte_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_sintinte_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION SINTINTE' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e171LT2( )
   {
      /* Dvelop_confirmpanel_salidalaboratorio_Close Routine */
      returnInSub = false ;
      if ( AV15barsit == 3 )
      {
         if ( GXutil.strcmp(Dvelop_confirmpanel_salidalaboratorio_Result, "Yes") == 0 )
         {
            /* Execute user subroutine: 'DO ACTION SALIDALABORATORIO' */
            S132 ();
            if (returnInSub) return;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de estar en situacion=2 ¡", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e181LT2( )
   {
      /* Dvelop_confirmpanel_cambiarcolor_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cambiarcolor_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CAMBIARCOLOR' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e201LT2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV8emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION LABORATORIO' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV8emprcod ;
      GXv_int5[0] = AV5BarCod ;
      GXv_int6[0] = AV7BarCodReo ;
      GXv_char3[0] = AV6BarCodPar ;
      GXv_int7[0] = (byte)(3) ;
      new app.pconfor(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7) ;
      confirmacioncolor_2_impl.this.AV8emprcod = GXv_char4[0] ;
      confirmacioncolor_2_impl.this.AV5BarCod = GXv_int5[0] ;
      confirmacioncolor_2_impl.this.AV7BarCodReo = GXv_int6[0] ;
      confirmacioncolor_2_impl.this.AV6BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8emprcod", AV8emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
      httpContext.setWebReturnParms(new Object[] {AV8emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'DO ACTION SINTINTE' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV8emprcod ;
      GXv_int5[0] = AV5BarCod ;
      GXv_int7[0] = AV7BarCodReo ;
      GXv_char3[0] = AV6BarCodPar ;
      GXv_int6[0] = (byte)(5) ;
      new app.pconfor(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int7, GXv_char3, GXv_int6) ;
      confirmacioncolor_2_impl.this.AV8emprcod = GXv_char4[0] ;
      confirmacioncolor_2_impl.this.AV5BarCod = GXv_int5[0] ;
      confirmacioncolor_2_impl.this.AV7BarCodReo = GXv_int7[0] ;
      confirmacioncolor_2_impl.this.AV6BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8emprcod", AV8emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
      httpContext.setWebReturnParms(new Object[] {AV8emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'DO ACTION SALIDALABORATORIO' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV8emprcod ;
      GXv_int5[0] = AV5BarCod ;
      GXv_int7[0] = AV7BarCodReo ;
      GXv_char3[0] = AV6BarCodPar ;
      GXv_int6[0] = (byte)(2) ;
      new app.pconfor(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int7, GXv_char3, GXv_int6) ;
      confirmacioncolor_2_impl.this.AV8emprcod = GXv_char4[0] ;
      confirmacioncolor_2_impl.this.AV5BarCod = GXv_int5[0] ;
      confirmacioncolor_2_impl.this.AV7BarCodReo = GXv_int7[0] ;
      confirmacioncolor_2_impl.this.AV6BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8emprcod", AV8emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
      httpContext.popup(formatLink("app.formulaciontinte.cambiodecolorenhojaderuta_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10clinom)),GXutil.URLEncode(GXutil.rtrim(AV11barser)),GXutil.URLEncode(GXutil.rtrim(AV12barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV13barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14bartipcol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarAgrEst)),GXutil.URLEncode(GXutil.rtrim(AV20SituacionHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV19resultado,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli","BarAgrest","SituacionHdr","resultado"}) , new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar","AV9clicod","AV10clinom","AV11barser","AV12barcolnom","AV13barcolnum","AV14bartipcol","AV16BarNomCli","AV17BarNumCli","AV18BarAgrEst","AV20SituacionHdr","AV19resultado"});
      httpContext.setWebReturnParms(new Object[] {AV8emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S142( )
   {
      /* 'DO ACTION CAMBIARCOLOR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.cambiodecolorenhojaderuta_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10clinom)),GXutil.URLEncode(GXutil.rtrim(AV11barser)),GXutil.URLEncode(GXutil.rtrim(AV12barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV13barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14bartipcol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarAgrEst)),GXutil.URLEncode(GXutil.rtrim(AV20SituacionHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV19resultado,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli","BarAgrest","SituacionHdr","resultado"}) , new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar","AV9clicod","AV10clinom","AV11barser","AV12barcolnom","AV13barcolnum","AV14bartipcol","AV16BarNomCli","AV17BarNumCli","AV18BarAgrEst","AV20SituacionHdr","AV19resultado"});
      httpContext.setWebReturnParms(new Object[] {AV8emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e211LT2( )
   {
      /* Load Routine */
      returnInSub = false ;
      /* Using cursor H01LT2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV7BarCodReo), AV6BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = H01LT2_A130BarCodPar[0] ;
         A132BarCodReo = H01LT2_A132BarCodReo[0] ;
         A129BarCod = H01LT2_A129BarCod[0] ;
         A396EmprCod = H01LT2_A396EmprCod[0] ;
         A252CliCod = H01LT2_A252CliCod[0] ;
         n252CliCod = H01LT2_n252CliCod[0] ;
         A279CliNom = H01LT2_A279CliNom[0] ;
         A212BarSer = H01LT2_A212BarSer[0] ;
         A135BarColNom = H01LT2_A135BarColNom[0] ;
         A136BarColNum = H01LT2_A136BarColNum[0] ;
         A218BarTipCol = H01LT2_A218BarTipCol[0] ;
         A213BarSit = H01LT2_A213BarSit[0] ;
         A1234BarNomCli = H01LT2_A1234BarNomCli[0] ;
         A1235BarNumCli = H01LT2_A1235BarNumCli[0] ;
         A120BarAgrEst = H01LT2_A120BarAgrEst[0] ;
         A279CliNom = H01LT2_A279CliNom[0] ;
         AV9clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9clicod), 6, 0));
         AV10clinom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10clinom", AV10clinom);
         AV11barser = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11barser", AV11barser);
         AV12barcolnom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12barcolnom", AV12barcolnom);
         AV13barcolnum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13barcolnum), 6, 0));
         AV14bartipcol = A218BarTipCol ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14bartipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14bartipcol), 2, 0));
         AV15barsit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15barsit), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15barsit), "Z9")));
         AV16BarNomCli = A1234BarNomCli ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarNomCli", AV16BarNomCli);
         AV17BarNumCli = A1235BarNumCli ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarNumCli), 6, 0));
         AV18BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarAgrEst", AV18BarAgrEst);
         AV20SituacionHdr = httpContext.getMessage( "Situacion actual ", "") + GXutil.trim( GXutil.str( AV15barsit, 2, 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20SituacionHdr", AV20SituacionHdr);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e221LT2 ();
      if (returnInSub) return;
   }

   public void e221LT2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.cambiodecolorenhojaderuta_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10clinom)),GXutil.URLEncode(GXutil.rtrim(AV11barser)),GXutil.URLEncode(GXutil.rtrim(AV12barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV13barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14bartipcol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarAgrEst)),GXutil.URLEncode(GXutil.rtrim(AV20SituacionHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV19resultado,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli","BarAgrest","SituacionHdr","resultado"}) , new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar","AV9clicod","AV10clinom","AV11barser","AV12barcolnom","AV13barcolnum","AV14bartipcol","AV16BarNomCli","AV17BarNumCli","AV18BarAgrEst","AV20SituacionHdr","AV19resultado"});
      httpContext.setWebReturnParms(new Object[] {AV8emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void wb_table4_82_1LT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cambiarcolor_Internalname, tblTabledvelop_confirmpanel_cambiarcolor_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cambiarcolor.setProperty("Title", Dvelop_confirmpanel_cambiarcolor_Title);
         ucDvelop_confirmpanel_cambiarcolor.setProperty("ConfirmationText", Dvelop_confirmpanel_cambiarcolor_Confirmationtext);
         ucDvelop_confirmpanel_cambiarcolor.setProperty("YesButtonCaption", Dvelop_confirmpanel_cambiarcolor_Yesbuttoncaption);
         ucDvelop_confirmpanel_cambiarcolor.setProperty("NoButtonCaption", Dvelop_confirmpanel_cambiarcolor_Nobuttoncaption);
         ucDvelop_confirmpanel_cambiarcolor.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cambiarcolor_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cambiarcolor.setProperty("YesButtonPosition", Dvelop_confirmpanel_cambiarcolor_Yesbuttonposition);
         ucDvelop_confirmpanel_cambiarcolor.setProperty("ConfirmType", Dvelop_confirmpanel_cambiarcolor_Confirmtype);
         ucDvelop_confirmpanel_cambiarcolor.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cambiarcolor_Internalname, "DVELOP_CONFIRMPANEL_CAMBIARCOLORContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CAMBIARCOLORContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_82_1LT2e( true) ;
      }
      else
      {
         wb_table4_82_1LT2e( false) ;
      }
   }

   public void wb_table3_77_1LT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_salidalaboratorio_Internalname, tblTabledvelop_confirmpanel_salidalaboratorio_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_salidalaboratorio.setProperty("Title", Dvelop_confirmpanel_salidalaboratorio_Title);
         ucDvelop_confirmpanel_salidalaboratorio.setProperty("ConfirmationText", Dvelop_confirmpanel_salidalaboratorio_Confirmationtext);
         ucDvelop_confirmpanel_salidalaboratorio.setProperty("YesButtonCaption", Dvelop_confirmpanel_salidalaboratorio_Yesbuttoncaption);
         ucDvelop_confirmpanel_salidalaboratorio.setProperty("NoButtonCaption", Dvelop_confirmpanel_salidalaboratorio_Nobuttoncaption);
         ucDvelop_confirmpanel_salidalaboratorio.setProperty("CancelButtonCaption", Dvelop_confirmpanel_salidalaboratorio_Cancelbuttoncaption);
         ucDvelop_confirmpanel_salidalaboratorio.setProperty("YesButtonPosition", Dvelop_confirmpanel_salidalaboratorio_Yesbuttonposition);
         ucDvelop_confirmpanel_salidalaboratorio.setProperty("ConfirmType", Dvelop_confirmpanel_salidalaboratorio_Confirmtype);
         ucDvelop_confirmpanel_salidalaboratorio.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_salidalaboratorio_Internalname, "DVELOP_CONFIRMPANEL_SALIDALABORATORIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_SALIDALABORATORIOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_77_1LT2e( true) ;
      }
      else
      {
         wb_table3_77_1LT2e( false) ;
      }
   }

   public void wb_table2_72_1LT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_sintinte_Internalname, tblTabledvelop_confirmpanel_sintinte_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_sintinte.setProperty("Title", Dvelop_confirmpanel_sintinte_Title);
         ucDvelop_confirmpanel_sintinte.setProperty("ConfirmationText", Dvelop_confirmpanel_sintinte_Confirmationtext);
         ucDvelop_confirmpanel_sintinte.setProperty("YesButtonCaption", Dvelop_confirmpanel_sintinte_Yesbuttoncaption);
         ucDvelop_confirmpanel_sintinte.setProperty("NoButtonCaption", Dvelop_confirmpanel_sintinte_Nobuttoncaption);
         ucDvelop_confirmpanel_sintinte.setProperty("CancelButtonCaption", Dvelop_confirmpanel_sintinte_Cancelbuttoncaption);
         ucDvelop_confirmpanel_sintinte.setProperty("YesButtonPosition", Dvelop_confirmpanel_sintinte_Yesbuttonposition);
         ucDvelop_confirmpanel_sintinte.setProperty("ConfirmType", Dvelop_confirmpanel_sintinte_Confirmtype);
         ucDvelop_confirmpanel_sintinte.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_sintinte_Internalname, "DVELOP_CONFIRMPANEL_SINTINTEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_SINTINTEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_72_1LT2e( true) ;
      }
      else
      {
         wb_table2_72_1LT2e( false) ;
      }
   }

   public void wb_table1_67_1LT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_laboratorio_Internalname, tblTabledvelop_confirmpanel_laboratorio_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_laboratorio.setProperty("Title", Dvelop_confirmpanel_laboratorio_Title);
         ucDvelop_confirmpanel_laboratorio.setProperty("ConfirmationText", Dvelop_confirmpanel_laboratorio_Confirmationtext);
         ucDvelop_confirmpanel_laboratorio.setProperty("YesButtonCaption", Dvelop_confirmpanel_laboratorio_Yesbuttoncaption);
         ucDvelop_confirmpanel_laboratorio.setProperty("NoButtonCaption", Dvelop_confirmpanel_laboratorio_Nobuttoncaption);
         ucDvelop_confirmpanel_laboratorio.setProperty("CancelButtonCaption", Dvelop_confirmpanel_laboratorio_Cancelbuttoncaption);
         ucDvelop_confirmpanel_laboratorio.setProperty("YesButtonPosition", Dvelop_confirmpanel_laboratorio_Yesbuttonposition);
         ucDvelop_confirmpanel_laboratorio.setProperty("ConfirmType", Dvelop_confirmpanel_laboratorio_Confirmtype);
         ucDvelop_confirmpanel_laboratorio.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_laboratorio_Internalname, "DVELOP_CONFIRMPANEL_LABORATORIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_LABORATORIOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_67_1LT2e( true) ;
      }
      else
      {
         wb_table1_67_1LT2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV8emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8emprcod", AV8emprcod);
      AV5BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV6BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
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
      pa1LT2( ) ;
      ws1LT2( ) ;
      we1LT2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016434145", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("formulaciontinte/confirmacioncolor_2.js", "?202661016434145", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnlaboratorio_Internalname = "BTNLABORATORIO" ;
      bttBtnsintinte_Internalname = "BTNSINTINTE" ;
      bttBtnsalidalaboratorio_Internalname = "BTNSALIDALABORATORIO" ;
      bttBtncambiarcolor_Internalname = "BTNCAMBIARCOLOR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_laboratorio_Internalname = "DVELOP_CONFIRMPANEL_LABORATORIO" ;
      tblTabledvelop_confirmpanel_laboratorio_Internalname = "TABLEDVELOP_CONFIRMPANEL_LABORATORIO" ;
      Dvelop_confirmpanel_sintinte_Internalname = "DVELOP_CONFIRMPANEL_SINTINTE" ;
      tblTabledvelop_confirmpanel_sintinte_Internalname = "TABLEDVELOP_CONFIRMPANEL_SINTINTE" ;
      Dvelop_confirmpanel_salidalaboratorio_Internalname = "DVELOP_CONFIRMPANEL_SALIDALABORATORIO" ;
      tblTabledvelop_confirmpanel_salidalaboratorio_Internalname = "TABLEDVELOP_CONFIRMPANEL_SALIDALABORATORIO" ;
      Dvelop_confirmpanel_cambiarcolor_Internalname = "DVELOP_CONFIRMPANEL_CAMBIARCOLOR" ;
      tblTabledvelop_confirmpanel_cambiarcolor_Internalname = "TABLEDVELOP_CONFIRMPANEL_CAMBIARCOLOR" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      Dvelop_confirmpanel_cambiarcolor_Confirmtype = "1" ;
      Dvelop_confirmpanel_cambiarcolor_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cambiarcolor_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cambiarcolor_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cambiarcolor_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cambiarcolor_Confirmationtext = "¿Confirma Cambio de Color?" ;
      Dvelop_confirmpanel_cambiarcolor_Title = "" ;
      Dvelop_confirmpanel_salidalaboratorio_Confirmtype = "1" ;
      Dvelop_confirmpanel_salidalaboratorio_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_salidalaboratorio_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_salidalaboratorio_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_salidalaboratorio_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_salidalaboratorio_Confirmationtext = "¿Desea salir de Laboratorio?" ;
      Dvelop_confirmpanel_salidalaboratorio_Title = "" ;
      Dvelop_confirmpanel_sintinte_Confirmtype = "1" ;
      Dvelop_confirmpanel_sintinte_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_sintinte_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_sintinte_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_sintinte_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_sintinte_Confirmationtext = "¿Confirma el cambio?" ;
      Dvelop_confirmpanel_sintinte_Title = "" ;
      Dvelop_confirmpanel_laboratorio_Confirmtype = "1" ;
      Dvelop_confirmpanel_laboratorio_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_laboratorio_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_laboratorio_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_laboratorio_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_laboratorio_Confirmationtext = "¿Desea enviar a Laboratorio?" ;
      Dvelop_confirmpanel_laboratorio_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Confirmacion Color", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV15barsit',fld:'vBARSIT',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOLABORATORIO'","{handler:'e111LT1',iparms:[{av:'AV15barsit',fld:'vBARSIT',pic:'Z9',hsh:true}]");
      setEventMetadata("'DOLABORATORIO'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_LABORATORIO.CLOSE","{handler:'e151LT2',iparms:[{av:'Dvelop_confirmpanel_laboratorio_Result',ctrl:'DVELOP_CONFIRMPANEL_LABORATORIO',prop:'Result'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_LABORATORIO.CLOSE",",oparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOSINTINTE'","{handler:'e121LT1',iparms:[{av:'AV15barsit',fld:'vBARSIT',pic:'Z9',hsh:true}]");
      setEventMetadata("'DOSINTINTE'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_SINTINTE.CLOSE","{handler:'e161LT2',iparms:[{av:'Dvelop_confirmpanel_sintinte_Result',ctrl:'DVELOP_CONFIRMPANEL_SINTINTE',prop:'Result'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_SINTINTE.CLOSE",",oparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOSALIDALABORATORIO'","{handler:'e131LT1',iparms:[]");
      setEventMetadata("'DOSALIDALABORATORIO'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_SALIDALABORATORIO.CLOSE","{handler:'e171LT2',iparms:[{av:'AV15barsit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'Dvelop_confirmpanel_salidalaboratorio_Result',ctrl:'DVELOP_CONFIRMPANEL_SALIDALABORATORIO',prop:'Result'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10clinom',fld:'vCLINOM',pic:''},{av:'AV11barser',fld:'vBARSER',pic:''},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV14bartipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV16BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV17BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV18BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV20SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV19resultado',fld:'vRESULTADO',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_SALIDALABORATORIO.CLOSE",",oparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19resultado',fld:'vRESULTADO',pic:'ZZZ9'},{av:'AV20SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV18BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV17BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV16BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV14bartipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV11barser',fld:'vBARSER',pic:''},{av:'AV10clinom',fld:'vCLINOM',pic:''},{av:'AV9clicod',fld:'vCLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOCAMBIARCOLOR'","{handler:'e141LT1',iparms:[]");
      setEventMetadata("'DOCAMBIARCOLOR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CAMBIARCOLOR.CLOSE","{handler:'e181LT2',iparms:[{av:'Dvelop_confirmpanel_cambiarcolor_Result',ctrl:'DVELOP_CONFIRMPANEL_CAMBIARCOLOR',prop:'Result'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10clinom',fld:'vCLINOM',pic:''},{av:'AV11barser',fld:'vBARSER',pic:''},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV14bartipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV16BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV17BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV18BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV20SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV19resultado',fld:'vRESULTADO',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CAMBIARCOLOR.CLOSE",",oparms:[{av:'AV19resultado',fld:'vRESULTADO',pic:'ZZZ9'},{av:'AV20SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV18BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV17BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV16BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV14bartipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV11barser',fld:'vBARSER',pic:''},{av:'AV10clinom',fld:'vCLINOM',pic:''},{av:'AV9clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e201LT2',iparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e221LT2',iparms:[{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10clinom',fld:'vCLINOM',pic:''},{av:'AV11barser',fld:'vBARSER',pic:''},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV14bartipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV16BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV17BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV18BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV20SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV19resultado',fld:'vRESULTADO',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV19resultado',fld:'vRESULTADO',pic:'ZZZ9'},{av:'AV20SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV18BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV17BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV16BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV14bartipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV13barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV12barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV11barser',fld:'vBARSER',pic:''},{av:'AV10clinom',fld:'vCLINOM',pic:''},{av:'AV9clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOAV8emprcod = "" ;
      wcpOAV6BarCodPar = "" ;
      Dvelop_confirmpanel_laboratorio_Result = "" ;
      Dvelop_confirmpanel_sintinte_Result = "" ;
      Dvelop_confirmpanel_salidalaboratorio_Result = "" ;
      Dvelop_confirmpanel_cambiarcolor_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV8emprcod = "" ;
      AV6BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV11barser = "" ;
      AV16BarNomCli = "" ;
      AV18BarAgrEst = "" ;
      AV20SituacionHdr = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV10clinom = "" ;
      AV12barcolnom = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnlaboratorio_Jsonclick = "" ;
      bttBtnsintinte_Jsonclick = "" ;
      bttBtnsalidalaboratorio_Jsonclick = "" ;
      bttBtncambiarcolor_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV24Emprnom = "" ;
      AV25Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      H01LT2_A130BarCodPar = new String[] {""} ;
      H01LT2_A132BarCodReo = new byte[1] ;
      H01LT2_A129BarCod = new int[1] ;
      H01LT2_A396EmprCod = new String[] {""} ;
      H01LT2_A252CliCod = new int[1] ;
      H01LT2_n252CliCod = new boolean[] {false} ;
      H01LT2_A279CliNom = new String[] {""} ;
      H01LT2_A212BarSer = new String[] {""} ;
      H01LT2_A135BarColNom = new String[] {""} ;
      H01LT2_A136BarColNum = new int[1] ;
      H01LT2_A218BarTipCol = new byte[1] ;
      H01LT2_A213BarSit = new byte[1] ;
      H01LT2_A1234BarNomCli = new String[] {""} ;
      H01LT2_A1235BarNumCli = new int[1] ;
      H01LT2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A120BarAgrEst = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_cambiarcolor = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_salidalaboratorio = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_sintinte = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_laboratorio = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.confirmacioncolor_2__default(),
         new Object[] {
             new Object[] {
            H01LT2_A130BarCodPar, H01LT2_A132BarCodReo, H01LT2_A129BarCod, H01LT2_A396EmprCod, H01LT2_A252CliCod, H01LT2_n252CliCod, H01LT2_A279CliNom, H01LT2_A212BarSer, H01LT2_A135BarColNom, H01LT2_A136BarColNum,
            H01LT2_A218BarTipCol, H01LT2_A213BarSit, H01LT2_A1234BarNomCli, H01LT2_A1235BarNumCli, H01LT2_A120BarAgrEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
   }

   private byte wcpOAV7BarCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7BarCodReo ;
   private byte gxajaxcallmode ;
   private byte AV15barsit ;
   private byte AV14bartipcol ;
   private byte nDonePA ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV19resultado ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV5BarCod ;
   private int AV5BarCod ;
   private int AV17BarNumCli ;
   private int AV9clicod ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV13barcolnum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int GXv_int5[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int idxLst ;
   private String wcpOAV8emprcod ;
   private String wcpOAV6BarCodPar ;
   private String Dvelop_confirmpanel_laboratorio_Result ;
   private String Dvelop_confirmpanel_sintinte_Result ;
   private String Dvelop_confirmpanel_salidalaboratorio_Result ;
   private String Dvelop_confirmpanel_cambiarcolor_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV8emprcod ;
   private String AV6BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV11barser ;
   private String AV16BarNomCli ;
   private String AV18BarAgrEst ;
   private String AV20SituacionHdr ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_laboratorio_Title ;
   private String Dvelop_confirmpanel_laboratorio_Confirmationtext ;
   private String Dvelop_confirmpanel_laboratorio_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_laboratorio_Nobuttoncaption ;
   private String Dvelop_confirmpanel_laboratorio_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_laboratorio_Yesbuttonposition ;
   private String Dvelop_confirmpanel_laboratorio_Confirmtype ;
   private String Dvelop_confirmpanel_sintinte_Title ;
   private String Dvelop_confirmpanel_sintinte_Confirmationtext ;
   private String Dvelop_confirmpanel_sintinte_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_sintinte_Nobuttoncaption ;
   private String Dvelop_confirmpanel_sintinte_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_sintinte_Yesbuttonposition ;
   private String Dvelop_confirmpanel_sintinte_Confirmtype ;
   private String Dvelop_confirmpanel_salidalaboratorio_Title ;
   private String Dvelop_confirmpanel_salidalaboratorio_Confirmationtext ;
   private String Dvelop_confirmpanel_salidalaboratorio_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_salidalaboratorio_Nobuttoncaption ;
   private String Dvelop_confirmpanel_salidalaboratorio_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_salidalaboratorio_Yesbuttonposition ;
   private String Dvelop_confirmpanel_salidalaboratorio_Confirmtype ;
   private String Dvelop_confirmpanel_cambiarcolor_Title ;
   private String Dvelop_confirmpanel_cambiarcolor_Confirmationtext ;
   private String Dvelop_confirmpanel_cambiarcolor_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cambiarcolor_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cambiarcolor_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cambiarcolor_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cambiarcolor_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavClicod_Internalname ;
   private String TempTags ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String AV10clinom ;
   private String edtavClinom_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String AV12barcolnom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnlaboratorio_Internalname ;
   private String bttBtnlaboratorio_Jsonclick ;
   private String bttBtnsintinte_Internalname ;
   private String bttBtnsintinte_Jsonclick ;
   private String bttBtnsalidalaboratorio_Internalname ;
   private String bttBtnsalidalaboratorio_Jsonclick ;
   private String bttBtncambiarcolor_Internalname ;
   private String bttBtncambiarcolor_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV23Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV24Emprnom ;
   private String AV25Usurcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A120BarAgrEst ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_cambiarcolor_Internalname ;
   private String Dvelop_confirmpanel_cambiarcolor_Internalname ;
   private String tblTabledvelop_confirmpanel_salidalaboratorio_Internalname ;
   private String Dvelop_confirmpanel_salidalaboratorio_Internalname ;
   private String tblTabledvelop_confirmpanel_sintinte_Internalname ;
   private String Dvelop_confirmpanel_sintinte_Internalname ;
   private String tblTabledvelop_confirmpanel_laboratorio_Internalname ;
   private String Dvelop_confirmpanel_laboratorio_Internalname ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cambiarcolor ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_salidalaboratorio ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_sintinte ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_laboratorio ;
   private IDataStoreProvider pr_default ;
   private String[] H01LT2_A130BarCodPar ;
   private byte[] H01LT2_A132BarCodReo ;
   private int[] H01LT2_A129BarCod ;
   private String[] H01LT2_A396EmprCod ;
   private int[] H01LT2_A252CliCod ;
   private boolean[] H01LT2_n252CliCod ;
   private String[] H01LT2_A279CliNom ;
   private String[] H01LT2_A212BarSer ;
   private String[] H01LT2_A135BarColNom ;
   private int[] H01LT2_A136BarColNum ;
   private byte[] H01LT2_A218BarTipCol ;
   private byte[] H01LT2_A213BarSit ;
   private String[] H01LT2_A1234BarNomCli ;
   private int[] H01LT2_A1235BarNumCli ;
   private String[] H01LT2_A120BarAgrEst ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class confirmacioncolor_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LT2", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarSit, T1.BarNomCli, T1.BarNumCli, T1.BarAgrEst FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

