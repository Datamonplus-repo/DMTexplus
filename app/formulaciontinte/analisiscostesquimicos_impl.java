package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscostesquimicos_impl extends GXDataArea
{
   public analisiscostesquimicos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public analisiscostesquimicos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscostesquimicos_impl.class ));
   }

   public analisiscostesquimicos_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHreracab = new HTMLChoice();
      chkavConsmanuales = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      pa15V2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start15V2( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.analisiscostesquimicos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Maqcod2, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD1_DATA", AV44Clicod1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD1_DATA", AV44Clicod1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD2_DATA", AV46Clicod2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD2_DATA", AV46Clicod2_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTCOD1_DATA", AV47TipArtCod1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTCOD1_DATA", AV47TipArtCod1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTCOD2_DATA", AV48TipArtCod2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTCOD2_DATA", AV48TipArtCod2_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPCOLCOD1_DATA", AV49Tipcolcod1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPCOLCOD1_DATA", AV49Tipcolcod1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPCOLCOD2_DATA", AV50Tipcolcod2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPCOLCOD2_DATA", AV50Tipcolcod2_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINTCOD1_DATA", AV51Intcod1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINTCOD1_DATA", AV51Intcod1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINTCOD2_DATA", AV52Intcod2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINTCOD2_DATA", AV52Intcod2_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV31EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV42Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD3", GXutil.rtrim( AV22Artcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM3", GXutil.rtrim( AV23Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM3", GXutil.ltrim( localUtil.ntoc( AV24Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD3", GXutil.ltrim( localUtil.ntoc( AV25Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD3", GXutil.ltrim( localUtil.ntoc( AV34Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD3", GXutil.ltrim( localUtil.ntoc( AV28Tipartcod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD3", GXutil.ltrim( localUtil.ntoc( AV29Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC3", localUtil.dtoc( AV26Fec3, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Cls", GXutil.rtrim( Combo_clicod1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Selectedvalue_set", GXutil.rtrim( Combo_clicod1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Emptyitemtext", GXutil.rtrim( Combo_clicod1_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Cls", GXutil.rtrim( Combo_clicod2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Selectedvalue_set", GXutil.rtrim( Combo_clicod2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Emptyitemtext", GXutil.rtrim( Combo_clicod2_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD1_Cls", GXutil.rtrim( Combo_tipartcod1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD1_Selectedvalue_set", GXutil.rtrim( Combo_tipartcod1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD1_Emptyitemtext", GXutil.rtrim( Combo_tipartcod1_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD2_Cls", GXutil.rtrim( Combo_tipartcod2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD2_Selectedvalue_set", GXutil.rtrim( Combo_tipartcod2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD2_Emptyitemtext", GXutil.rtrim( Combo_tipartcod2_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD1_Cls", GXutil.rtrim( Combo_tipcolcod1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD1_Selectedvalue_set", GXutil.rtrim( Combo_tipcolcod1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD1_Emptyitemtext", GXutil.rtrim( Combo_tipcolcod1_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD2_Cls", GXutil.rtrim( Combo_tipcolcod2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD2_Selectedvalue_set", GXutil.rtrim( Combo_tipcolcod2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD2_Emptyitemtext", GXutil.rtrim( Combo_tipcolcod2_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD1_Cls", GXutil.rtrim( Combo_intcod1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD1_Selectedvalue_set", GXutil.rtrim( Combo_intcod1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD1_Emptyitemtext", GXutil.rtrim( Combo_intcod1_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD2_Cls", GXutil.rtrim( Combo_intcod2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD2_Selectedvalue_set", GXutil.rtrim( Combo_intcod2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD2_Emptyitemtext", GXutil.rtrim( Combo_intcod2_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Width", GXutil.rtrim( Dvpanel_panel_resultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panel_resultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panel_resultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Cls", GXutil.rtrim( Dvpanel_panel_resultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Title", GXutil.rtrim( Dvpanel_panel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panel_resultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panel_resultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panel_resultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD2_Selectedvalue_get", GXutil.rtrim( Combo_intcod2_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD1_Selectedvalue_get", GXutil.rtrim( Combo_intcod1_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD2_Selectedvalue_get", GXutil.rtrim( Combo_tipcolcod2_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD1_Selectedvalue_get", GXutil.rtrim( Combo_tipcolcod1_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD2_Selectedvalue_get", GXutil.rtrim( Combo_tipartcod2_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD1_Selectedvalue_get", GXutil.rtrim( Combo_tipartcod1_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Selectedvalue_get", GXutil.rtrim( Combo_clicod2_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Selectedvalue_get", GXutil.rtrim( Combo_clicod1_Selectedvalue_get));
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
      if ( ! ( WebComp_Webcomponent1 == null ) )
      {
         WebComp_Webcomponent1.componentjscripts();
      }
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
         we15V2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt15V2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.formulaciontinte.analisiscostesquimicos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.AnalisisCostesQuimicos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analisis Costes Quimicos", "") ;
   }

   public void wb15V0( )
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
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec1_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec1_Internalname, localUtil.format(AV5Fec1, "99/99/99"), localUtil.format( AV5Fec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec2_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec2_Internalname, localUtil.format(AV6Fec2, "99/99/99"), localUtil.format( AV6Fec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod1_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod1.setProperty("Caption", Combo_clicod1_Caption);
         ucCombo_clicod1.setProperty("Cls", Combo_clicod1_Cls);
         ucCombo_clicod1.setProperty("EmptyItemText", Combo_clicod1_Emptyitemtext);
         ucCombo_clicod1.setProperty("DropDownOptionsData", AV44Clicod1_Data);
         ucCombo_clicod1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod1_Internalname, "COMBO_CLICOD1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod2_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicod2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod2.setProperty("Caption", Combo_clicod2_Caption);
         ucCombo_clicod2.setProperty("Cls", Combo_clicod2_Cls);
         ucCombo_clicod2.setProperty("EmptyItemText", Combo_clicod2_Emptyitemtext);
         ucCombo_clicod2.setProperty("DropDownOptionsData", AV46Clicod2_Data);
         ucCombo_clicod2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod2_Internalname, "COMBO_CLICOD2Container");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod1_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod1_Internalname, GXutil.rtrim( AV9ARtcod1), GXutil.rtrim( localUtil.format( AV9ARtcod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod1_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod2_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod2_Internalname, GXutil.rtrim( AV10Artcod2), GXutil.rtrim( localUtil.format( AV10Artcod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod2_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipartcod1_Internalname, httpContext.getMessage( "Tipo Artículo Inicial", ""), "", "", lblTextblockcombo_tipartcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipartcod1.setProperty("Caption", Combo_tipartcod1_Caption);
         ucCombo_tipartcod1.setProperty("Cls", Combo_tipartcod1_Cls);
         ucCombo_tipartcod1.setProperty("EmptyItemText", Combo_tipartcod1_Emptyitemtext);
         ucCombo_tipartcod1.setProperty("DropDownOptionsData", AV47TipArtCod1_Data);
         ucCombo_tipartcod1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartcod1_Internalname, "COMBO_TIPARTCOD1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartcod2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipartcod2_Internalname, httpContext.getMessage( "Tipo Artículo Final", ""), "", "", lblTextblockcombo_tipartcod2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipartcod2.setProperty("Caption", Combo_tipartcod2_Caption);
         ucCombo_tipartcod2.setProperty("Cls", Combo_tipartcod2_Cls);
         ucCombo_tipartcod2.setProperty("EmptyItemText", Combo_tipartcod2_Emptyitemtext);
         ucCombo_tipartcod2.setProperty("DropDownOptionsData", AV48TipArtCod2_Data);
         ucCombo_tipartcod2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartcod2_Internalname, "COMBO_TIPARTCOD2Container");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom1_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom1_Internalname, GXutil.rtrim( AV13Barcolnom1), GXutil.rtrim( localUtil.format( AV13Barcolnom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom1_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum1_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum1_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14Barcolnum1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14Barcolnum1), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum1_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom2_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom2_Internalname, GXutil.rtrim( AV15barcolnom2), GXutil.rtrim( localUtil.format( AV15barcolnom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom2_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum2_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum2_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Barcolnum2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16Barcolnum2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16Barcolnum2), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum2_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipcolcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipcolcod1_Internalname, httpContext.getMessage( "Tc Inicial", ""), "", "", lblTextblockcombo_tipcolcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipcolcod1.setProperty("Caption", Combo_tipcolcod1_Caption);
         ucCombo_tipcolcod1.setProperty("Cls", Combo_tipcolcod1_Cls);
         ucCombo_tipcolcod1.setProperty("EmptyItemText", Combo_tipcolcod1_Emptyitemtext);
         ucCombo_tipcolcod1.setProperty("DropDownOptionsData", AV49Tipcolcod1_Data);
         ucCombo_tipcolcod1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipcolcod1_Internalname, "COMBO_TIPCOLCOD1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipcolcod2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipcolcod2_Internalname, httpContext.getMessage( "Tc Final", ""), "", "", lblTextblockcombo_tipcolcod2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipcolcod2.setProperty("Caption", Combo_tipcolcod2_Caption);
         ucCombo_tipcolcod2.setProperty("Cls", Combo_tipcolcod2_Cls);
         ucCombo_tipcolcod2.setProperty("EmptyItemText", Combo_tipcolcod2_Emptyitemtext);
         ucCombo_tipcolcod2.setProperty("DropDownOptionsData", AV50Tipcolcod2_Data);
         ucCombo_tipcolcod2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipcolcod2_Internalname, "COMBO_TIPCOLCOD2Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedintcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_intcod1_Internalname, httpContext.getMessage( "Intensidad Inicial", ""), "", "", lblTextblockcombo_intcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_intcod1.setProperty("Caption", Combo_intcod1_Caption);
         ucCombo_intcod1.setProperty("Cls", Combo_intcod1_Cls);
         ucCombo_intcod1.setProperty("EmptyItemText", Combo_intcod1_Emptyitemtext);
         ucCombo_intcod1.setProperty("DropDownOptionsData", AV51Intcod1_Data);
         ucCombo_intcod1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_intcod1_Internalname, "COMBO_INTCOD1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedintcod2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_intcod2_Internalname, httpContext.getMessage( "Intensidad Final", ""), "", "", lblTextblockcombo_intcod2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_intcod2.setProperty("Caption", Combo_intcod2_Caption);
         ucCombo_intcod2.setProperty("Cls", Combo_intcod2_Cls);
         ucCombo_intcod2.setProperty("EmptyItemText", Combo_intcod2_Emptyitemtext);
         ucCombo_intcod2.setProperty("DropDownOptionsData", AV52Intcod2_Data);
         ucCombo_intcod2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_intcod2_Internalname, "COMBO_INTCOD2Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHreracab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHreracab.getInternalname(), httpContext.getMessage( "Tipo Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHreracab, cmbavHreracab.getInternalname(), GXutil.rtrim( AV21HreRacab), 1, cmbavHreracab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavHreracab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         cmbavHreracab.setValue( GXutil.rtrim( AV21HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavConsmanuales.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavConsmanuales.getInternalname(), httpContext.getMessage( "Consumos Manuales?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavConsmanuales.getInternalname(), GXutil.str( AV43ConsManuales, 1, 0), "", httpContext.getMessage( "Consumos Manuales?", ""), 1, chkavConsmanuales.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(134, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV36barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV37barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37barcodreo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV37barcodreo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV38barcodpar), GXutil.rtrim( localUtil.format( AV38barcodpar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1115v1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_barradeprogreso_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
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
         ucDvpanel_panel_resultado.setProperty("Width", Dvpanel_panel_resultado_Width);
         ucDvpanel_panel_resultado.setProperty("AutoWidth", Dvpanel_panel_resultado_Autowidth);
         ucDvpanel_panel_resultado.setProperty("AutoHeight", Dvpanel_panel_resultado_Autoheight);
         ucDvpanel_panel_resultado.setProperty("Cls", Dvpanel_panel_resultado_Cls);
         ucDvpanel_panel_resultado.setProperty("Title", Dvpanel_panel_resultado_Title);
         ucDvpanel_panel_resultado.setProperty("Collapsible", Dvpanel_panel_resultado_Collapsible);
         ucDvpanel_panel_resultado.setProperty("Collapsed", Dvpanel_panel_resultado_Collapsed);
         ucDvpanel_panel_resultado.setProperty("ShowCollapseIcon", Dvpanel_panel_resultado_Showcollapseicon);
         ucDvpanel_panel_resultado.setProperty("IconPosition", Dvpanel_panel_resultado_Iconposition);
         ucDvpanel_panel_resultado.setProperty("AutoScroll", Dvpanel_panel_resultado_Autoscroll);
         ucDvpanel_panel_resultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultado_Internalname, "DVPANEL_PANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_RESULTADOContainer"+"Panel_Resultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Consulta (SDT)", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab02") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0185"+"", GXutil.rtrim( WebComp_Webcomponent1_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0185"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWebcomponent1), GXutil.lower( WebComp_Webcomponent1_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0185"+"");
               }
               WebComp_Webcomponent1.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWebcomponent1), GXutil.lower( WebComp_Webcomponent1_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV7Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7Clicod1), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod1_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod1_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV8Clicod2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Clicod2), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod2_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod2_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV11TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11TipArtCod1), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod1_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipartcod1_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV12TipArtCod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12TipArtCod2), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,192);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod2_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipartcod2_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV17Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17Tipcolcod1), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod1_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipcolcod1_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV18Tipcolcod2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Tipcolcod2), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod2_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipcolcod2_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV19Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19Intcod1), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,195);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod1_Jsonclick, 0, "Attribute", "", "", "", "", edtavIntcod1_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV20Intcod2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20Intcod2), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod2_Jsonclick, 0, "Attribute", "", "", "", "", edtavIntcod2_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesQuimicos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start15V2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Analisis Costes Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup15V0( ) ;
   }

   public void ws15V2( )
   {
      start15V2( ) ;
      evt15V2( ) ;
   }

   public void evt15V2( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1215V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e1315V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExcel' */
                           e1415V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCSV' */
                           e1515V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1615V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 185 )
                     {
                        OldWebcomponent1 = httpContext.cgiGet( "W0185") ;
                        if ( ( GXutil.len( OldWebcomponent1) == 0 ) || ( GXutil.strcmp(OldWebcomponent1, WebComp_Webcomponent1_Component) != 0 ) )
                        {
                           WebComp_Webcomponent1 = WebUtils.getWebComponent(getClass(), "app." + OldWebcomponent1 + "_impl", remoteHandle, context);
                           WebComp_Webcomponent1_Component = OldWebcomponent1 ;
                        }
                        if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
                        {
                           WebComp_Webcomponent1.componentprocess("W0185", "", sEvt);
                        }
                        WebComp_Webcomponent1_Component = OldWebcomponent1 ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we15V2( )
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

   public void pa15V2( )
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
            GX_FocusControl = edtavFec1_Internalname ;
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
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV21HreRacab = cmbavHreracab.getValidValue(AV21HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21HreRacab", AV21HreRacab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHreracab.setValue( GXutil.rtrim( AV21HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
      }
      AV43ConsManuales = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV43ConsManuales, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ConsManuales", GXutil.str( AV43ConsManuales, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf15V2( ) ;
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
   }

   public void rf15V2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
            {
               WebComp_Webcomponent1.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1615V2 ();
         wb15V0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15V2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV42Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Maqcod2, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup15V0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1215V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD1_DATA"), AV44Clicod1_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD2_DATA"), AV46Clicod2_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTCOD1_DATA"), AV47TipArtCod1_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTCOD2_DATA"), AV48TipArtCod2_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPCOLCOD1_DATA"), AV49Tipcolcod1_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPCOLCOD2_DATA"), AV50Tipcolcod2_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vINTCOD1_DATA"), AV51Intcod1_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vINTCOD2_DATA"), AV52Intcod2_Data);
         /* Read saved values. */
         Combo_clicod1_Cls = httpContext.cgiGet( "COMBO_CLICOD1_Cls") ;
         Combo_clicod1_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD1_Selectedvalue_set") ;
         Combo_clicod1_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD1_Emptyitemtext") ;
         Combo_clicod2_Cls = httpContext.cgiGet( "COMBO_CLICOD2_Cls") ;
         Combo_clicod2_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD2_Selectedvalue_set") ;
         Combo_clicod2_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD2_Emptyitemtext") ;
         Combo_tipartcod1_Cls = httpContext.cgiGet( "COMBO_TIPARTCOD1_Cls") ;
         Combo_tipartcod1_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTCOD1_Selectedvalue_set") ;
         Combo_tipartcod1_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTCOD1_Emptyitemtext") ;
         Combo_tipartcod2_Cls = httpContext.cgiGet( "COMBO_TIPARTCOD2_Cls") ;
         Combo_tipartcod2_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTCOD2_Selectedvalue_set") ;
         Combo_tipartcod2_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTCOD2_Emptyitemtext") ;
         Combo_tipcolcod1_Cls = httpContext.cgiGet( "COMBO_TIPCOLCOD1_Cls") ;
         Combo_tipcolcod1_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPCOLCOD1_Selectedvalue_set") ;
         Combo_tipcolcod1_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPCOLCOD1_Emptyitemtext") ;
         Combo_tipcolcod2_Cls = httpContext.cgiGet( "COMBO_TIPCOLCOD2_Cls") ;
         Combo_tipcolcod2_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPCOLCOD2_Selectedvalue_set") ;
         Combo_tipcolcod2_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPCOLCOD2_Emptyitemtext") ;
         Combo_intcod1_Cls = httpContext.cgiGet( "COMBO_INTCOD1_Cls") ;
         Combo_intcod1_Selectedvalue_set = httpContext.cgiGet( "COMBO_INTCOD1_Selectedvalue_set") ;
         Combo_intcod1_Emptyitemtext = httpContext.cgiGet( "COMBO_INTCOD1_Emptyitemtext") ;
         Combo_intcod2_Cls = httpContext.cgiGet( "COMBO_INTCOD2_Cls") ;
         Combo_intcod2_Selectedvalue_set = httpContext.cgiGet( "COMBO_INTCOD2_Selectedvalue_set") ;
         Combo_intcod2_Emptyitemtext = httpContext.cgiGet( "COMBO_INTCOD2_Emptyitemtext") ;
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
         Dvpanel_panel_resultado_Width = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Width") ;
         Dvpanel_panel_resultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autowidth")) ;
         Dvpanel_panel_resultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoheight")) ;
         Dvpanel_panel_resultado_Cls = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Cls") ;
         Dvpanel_panel_resultado_Title = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Title") ;
         Dvpanel_panel_resultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsible")) ;
         Dvpanel_panel_resultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsed")) ;
         Dvpanel_panel_resultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Showcollapseicon")) ;
         Dvpanel_panel_resultado_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Iconposition") ;
         Dvpanel_panel_resultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoscroll")) ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC1");
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5Fec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Fec1", localUtil.format(AV5Fec1, "99/99/99"));
         }
         else
         {
            AV5Fec1 = localUtil.ctod( httpContext.cgiGet( edtavFec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Fec1", localUtil.format(AV5Fec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC2");
            GX_FocusControl = edtavFec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6Fec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Fec2", localUtil.format(AV6Fec2, "99/99/99"));
         }
         else
         {
            AV6Fec2 = localUtil.ctod( httpContext.cgiGet( edtavFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Fec2", localUtil.format(AV6Fec2, "99/99/99"));
         }
         AV9ARtcod1 = httpContext.cgiGet( edtavArtcod1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ARtcod1", AV9ARtcod1);
         AV10Artcod2 = httpContext.cgiGet( edtavArtcod2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Artcod2", AV10Artcod2);
         AV13Barcolnom1 = httpContext.cgiGet( edtavBarcolnom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnom1", AV13Barcolnom1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM1");
            GX_FocusControl = edtavBarcolnum1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Barcolnum1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum1), 6, 0));
         }
         else
         {
            AV14Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum1), 6, 0));
         }
         AV15barcolnom2 = httpContext.cgiGet( edtavBarcolnom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15barcolnom2", AV15barcolnom2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM2");
            GX_FocusControl = edtavBarcolnum2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Barcolnum2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Barcolnum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barcolnum2), 6, 0));
         }
         else
         {
            AV16Barcolnum2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Barcolnum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barcolnum2), 6, 0));
         }
         cmbavHreracab.setValue( httpContext.cgiGet( cmbavHreracab.getInternalname()) );
         AV21HreRacab = httpContext.cgiGet( cmbavHreracab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21HreRacab", AV21HreRacab);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONSMANUALES");
            GX_FocusControl = chkavConsmanuales.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43ConsManuales = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ConsManuales", GXutil.str( AV43ConsManuales, 1, 0));
         }
         else
         {
            AV43ConsManuales = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ConsManuales", GXutil.str( AV43ConsManuales, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36barcod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
         }
         else
         {
            AV36barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37barcodreo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
         }
         else
         {
            AV37barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
         }
         AV38barcodpar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38barcodpar", AV38barcodpar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD1");
            GX_FocusControl = edtavClicod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Clicod1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod1), 6, 0));
         }
         else
         {
            AV7Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod1), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD2");
            GX_FocusControl = edtavClicod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Clicod2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod2), 6, 0));
         }
         else
         {
            AV8Clicod2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod2), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD1");
            GX_FocusControl = edtavTipartcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11TipArtCod1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipArtCod1), 4, 0));
         }
         else
         {
            AV11TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipArtCod1), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD2");
            GX_FocusControl = edtavTipartcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12TipArtCod2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12TipArtCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipArtCod2), 4, 0));
         }
         else
         {
            AV12TipArtCod2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12TipArtCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipArtCod2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD1");
            GX_FocusControl = edtavTipcolcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17Tipcolcod1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Tipcolcod1), 2, 0));
         }
         else
         {
            AV17Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Tipcolcod1), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD2");
            GX_FocusControl = edtavTipcolcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18Tipcolcod2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Tipcolcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Tipcolcod2), 2, 0));
         }
         else
         {
            AV18Tipcolcod2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Tipcolcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Tipcolcod2), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD1");
            GX_FocusControl = edtavIntcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19Intcod1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Intcod1), 2, 0));
         }
         else
         {
            AV19Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Intcod1), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD2");
            GX_FocusControl = edtavIntcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20Intcod2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Intcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Intcod2), 2, 0));
         }
         else
         {
            AV20Intcod2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Intcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Intcod2), 2, 0));
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
      e1215V2 ();
      if (returnInSub) return;
   }

   public void e1215V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV30Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      analisiscostesquimicos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Station = GXt_char1 ;
      GXv_char2[0] = AV31EmprCod ;
      GXv_char3[0] = AV32EmprNom ;
      GXv_char4[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      analisiscostesquimicos_impl.this.AV31EmprCod = GXv_char2[0] ;
      analisiscostesquimicos_impl.this.AV32EmprNom = GXv_char3[0] ;
      analisiscostesquimicos_impl.this.AV33UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      AV5Fec1 = GXutil.dadd(GXutil.today( ),-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Fec1", localUtil.format(AV5Fec1, "99/99/99"));
      AV6Fec2 = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Fec2", localUtil.format(AV6Fec2, "99/99/99"));
      AV21HreRacab = httpContext.getMessage( "T", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21HreRacab", AV21HreRacab);
      GXt_char1 = AV30Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      analisiscostesquimicos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30Station = GXt_char1 ;
      GXv_char4[0] = AV31EmprCod ;
      GXv_char3[0] = AV32EmprNom ;
      GXv_char2[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char4, GXv_char3, GXv_char2) ;
      analisiscostesquimicos_impl.this.AV31EmprCod = GXv_char4[0] ;
      analisiscostesquimicos_impl.this.AV32EmprNom = GXv_char3[0] ;
      analisiscostesquimicos_impl.this.AV33UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      edtavIntcod2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntcod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntcod2_Visible), 5, 0), true);
      edtavIntcod1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntcod1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntcod1_Visible), 5, 0), true);
      edtavTipcolcod2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod2_Visible), 5, 0), true);
      edtavTipcolcod1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod1_Visible), 5, 0), true);
      edtavTipartcod2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartcod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartcod2_Visible), 5, 0), true);
      edtavTipartcod1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartcod1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartcod1_Visible), 5, 0), true);
      edtavClicod2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod2_Visible), 5, 0), true);
      edtavClicod1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod1_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD1' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICOD2' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPARTCOD1' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPARTCOD2' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPCOLCOD1' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPCOLCOD2' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOINTCOD1' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOINTCOD2' */
      S182 ();
      if (returnInSub) return;
   }

   public void e1315V2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARVARIABLES' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INICIOBARRADEPROGRESOS' */
      S202 ();
      if (returnInSub) return;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Webcomponent1 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Webcomponent1_Component), GXutil.lower( "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WC")) != 0 )
      {
         WebComp_Webcomponent1 = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wc_impl", remoteHandle, context);
         WebComp_Webcomponent1_Component = "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WC" ;
      }
      if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
      {
         WebComp_Webcomponent1.setjustcreated();
         WebComp_Webcomponent1.componentprepare(new Object[] {"W0185","",AV31EmprCod,AV21HreRacab,AV5Fec1,AV6Fec2,Byte.valueOf(AV42Calculo),Integer.valueOf(AV36barcod),Byte.valueOf(AV37barcodreo),AV38barcodpar,AV9ARtcod1,AV22Artcod3,AV13Barcolnom1,AV23Barcolnom3,Integer.valueOf(AV14Barcolnum1),Integer.valueOf(AV24Barcolnum3),Integer.valueOf(AV7Clicod1),Integer.valueOf(AV25Clicod3),Byte.valueOf(AV19Intcod1),Byte.valueOf(AV34Intcod3),Short.valueOf(AV11TipArtCod1),Short.valueOf(AV28Tipartcod3),Byte.valueOf(AV17Tipcolcod1),Byte.valueOf(AV29Tipcolcod3),Byte.valueOf(AV43ConsManuales)});
         WebComp_Webcomponent1.componentbind(new Object[] {"","vHRERACAB","vFEC1","vFEC2","","vBARCOD","vBARCODREO","vBARCODPAR","vARTCOD1","","vBARCOLNOM1","","vBARCOLNUM1","","vCLICOD1","","vINTCOD1","","vTIPARTCOD1","","vTIPCOLCOD1","","vCONSMANUALES"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Webcomponent1 )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0185"+"");
         WebComp_Webcomponent1.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      /* Execute user subroutine: 'FINBARRADEPROGRESOS' */
      S212 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ProgressIndicator", AV39ProgressIndicator);
   }

   public void S182( )
   {
      /* 'LOADCOMBOINTCOD2' Routine */
      returnInSub = false ;
      /* Using cursor H015V2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13744IntCDsc = H015V2_A13744IntCDsc[0] ;
         A583IntCod = H015V2_A583IntCod[0] ;
         A584IntDsc = H015V2_A584IntDsc[0] ;
         n584IntDsc = H015V2_n584IntDsc[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13744IntCDsc );
         AV52Intcod2_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_intcod2_Selectedvalue_set = ((0==AV20Intcod2) ? "" : GXutil.trim( GXutil.str( AV20Intcod2, 2, 0))) ;
      ucCombo_intcod2.sendProperty(context, "", false, Combo_intcod2_Internalname, "SelectedValue_set", Combo_intcod2_Selectedvalue_set);
   }

   public void S172( )
   {
      /* 'LOADCOMBOINTCOD1' Routine */
      returnInSub = false ;
      /* Using cursor H015V3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13744IntCDsc = H015V3_A13744IntCDsc[0] ;
         A583IntCod = H015V3_A583IntCod[0] ;
         A584IntDsc = H015V3_A584IntDsc[0] ;
         n584IntDsc = H015V3_n584IntDsc[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13744IntCDsc );
         AV51Intcod1_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_intcod1_Selectedvalue_set = ((0==AV19Intcod1) ? "" : GXutil.trim( GXutil.str( AV19Intcod1, 2, 0))) ;
      ucCombo_intcod1.sendProperty(context, "", false, Combo_intcod1_Internalname, "SelectedValue_set", Combo_intcod1_Selectedvalue_set);
   }

   public void S162( )
   {
      /* 'LOADCOMBOTIPCOLCOD2' Routine */
      returnInSub = false ;
      /* Using cursor H015V4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13731TipColCDsc = H015V4_A13731TipColCDsc[0] ;
         A831TipColCod = H015V4_A831TipColCod[0] ;
         A832TipColDsc = H015V4_A832TipColDsc[0] ;
         n832TipColDsc = H015V4_n832TipColDsc[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13731TipColCDsc );
         AV50Tipcolcod2_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_tipcolcod2_Selectedvalue_set = ((0==AV18Tipcolcod2) ? "" : GXutil.trim( GXutil.str( AV18Tipcolcod2, 2, 0))) ;
      ucCombo_tipcolcod2.sendProperty(context, "", false, Combo_tipcolcod2_Internalname, "SelectedValue_set", Combo_tipcolcod2_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'LOADCOMBOTIPCOLCOD1' Routine */
      returnInSub = false ;
      /* Using cursor H015V5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13731TipColCDsc = H015V5_A13731TipColCDsc[0] ;
         A831TipColCod = H015V5_A831TipColCod[0] ;
         A832TipColDsc = H015V5_A832TipColDsc[0] ;
         n832TipColDsc = H015V5_n832TipColDsc[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13731TipColCDsc );
         AV49Tipcolcod1_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_tipcolcod1_Selectedvalue_set = ((0==AV17Tipcolcod1) ? "" : GXutil.trim( GXutil.str( AV17Tipcolcod1, 2, 0))) ;
      ucCombo_tipcolcod1.sendProperty(context, "", false, Combo_tipcolcod1_Internalname, "SelectedValue_set", Combo_tipcolcod1_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOTIPARTCOD2' Routine */
      returnInSub = false ;
      /* Using cursor H015V6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13788TipArtCodD = H015V6_A13788TipArtCodD[0] ;
         A829TipArtCod = H015V6_A829TipArtCod[0] ;
         A830TipArtDsc = H015V6_A830TipArtDsc[0] ;
         n830TipArtDsc = H015V6_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H015V6_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H015V6_n6014TipArtDsc2[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV48TipArtCod2_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_tipartcod2_Selectedvalue_set = ((0==AV12TipArtCod2) ? "" : GXutil.trim( GXutil.str( AV12TipArtCod2, 4, 0))) ;
      ucCombo_tipartcod2.sendProperty(context, "", false, Combo_tipartcod2_Internalname, "SelectedValue_set", Combo_tipartcod2_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOTIPARTCOD1' Routine */
      returnInSub = false ;
      /* Using cursor H015V7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A13788TipArtCodD = H015V7_A13788TipArtCodD[0] ;
         A829TipArtCod = H015V7_A829TipArtCod[0] ;
         A830TipArtDsc = H015V7_A830TipArtDsc[0] ;
         n830TipArtDsc = H015V7_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H015V7_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H015V7_n6014TipArtDsc2[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV47TipArtCod1_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_tipartcod1_Selectedvalue_set = ((0==AV11TipArtCod1) ? "" : GXutil.trim( GXutil.str( AV11TipArtCod1, 4, 0))) ;
      ucCombo_tipartcod1.sendProperty(context, "", false, Combo_tipartcod1_Internalname, "SelectedValue_set", Combo_tipartcod1_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICOD2' Routine */
      returnInSub = false ;
      /* Using cursor H015V8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10045CliAct = H015V8_A10045CliAct[0] ;
         A13735CliCNom = H015V8_A13735CliCNom[0] ;
         A252CliCod = H015V8_A252CliCod[0] ;
         A279CliNom = H015V8_A279CliNom[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV46Clicod2_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_clicod2_Selectedvalue_set = ((0==AV8Clicod2) ? "" : GXutil.trim( GXutil.str( AV8Clicod2, 6, 0))) ;
      ucCombo_clicod2.sendProperty(context, "", false, Combo_clicod2_Internalname, "SelectedValue_set", Combo_clicod2_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD1' Routine */
      returnInSub = false ;
      /* Using cursor H015V9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         A10045CliAct = H015V9_A10045CliAct[0] ;
         A13735CliCNom = H015V9_A13735CliCNom[0] ;
         A252CliCod = H015V9_A252CliCod[0] ;
         A279CliNom = H015V9_A279CliNom[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV44Clicod1_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      Combo_clicod1_Selectedvalue_set = ((0==AV7Clicod1) ? "" : GXutil.trim( GXutil.str( AV7Clicod1, 6, 0))) ;
      ucCombo_clicod1.sendProperty(context, "", false, Combo_clicod1_Internalname, "SelectedValue_set", Combo_clicod1_Selectedvalue_set);
   }

   public void e1415V2( )
   {
      /* 'DoExcel' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARVARIABLES' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INICIOBARRADEPROGRESOS' */
      S202 ();
      if (returnInSub) return;
      GXv_char4[0] = AV31EmprCod ;
      GXv_char3[0] = AV21HreRacab ;
      GXv_date5[0] = AV5Fec1 ;
      GXv_date6[0] = AV26Fec3 ;
      GXv_char2[0] = AV9ARtcod1 ;
      GXv_char7[0] = AV22Artcod3 ;
      GXv_char8[0] = AV13Barcolnom1 ;
      GXv_char9[0] = AV23Barcolnom3 ;
      GXv_int10[0] = AV14Barcolnum1 ;
      GXv_int11[0] = AV24Barcolnum3 ;
      GXv_int12[0] = AV7Clicod1 ;
      GXv_int13[0] = AV25Clicod3 ;
      GXv_int14[0] = AV19Intcod1 ;
      GXv_int15[0] = AV34Intcod3 ;
      GXv_int16[0] = AV11TipArtCod1 ;
      GXv_int17[0] = AV28Tipartcod3 ;
      GXv_int18[0] = AV17Tipcolcod1 ;
      GXv_int19[0] = AV29Tipcolcod3 ;
      GXv_int20[0] = AV36barcod ;
      GXv_int21[0] = AV37barcodreo ;
      GXv_char22[0] = AV38barcodpar ;
      GXv_int23[0] = AV43ConsManuales ;
      GXv_char24[0] = AV40ExcelFilename ;
      GXv_char25[0] = AV41ErrorMessage ;
      new app.informeproductosconsumos(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date5, GXv_date6, GXv_char2, GXv_char7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_char22, GXv_int23, GXv_char24, GXv_char25) ;
      analisiscostesquimicos_impl.this.AV31EmprCod = GXv_char4[0] ;
      analisiscostesquimicos_impl.this.AV21HreRacab = GXv_char3[0] ;
      analisiscostesquimicos_impl.this.AV5Fec1 = GXv_date5[0] ;
      analisiscostesquimicos_impl.this.AV26Fec3 = GXv_date6[0] ;
      analisiscostesquimicos_impl.this.AV9ARtcod1 = GXv_char2[0] ;
      analisiscostesquimicos_impl.this.AV22Artcod3 = GXv_char7[0] ;
      analisiscostesquimicos_impl.this.AV13Barcolnom1 = GXv_char8[0] ;
      analisiscostesquimicos_impl.this.AV23Barcolnom3 = GXv_char9[0] ;
      analisiscostesquimicos_impl.this.AV14Barcolnum1 = GXv_int10[0] ;
      analisiscostesquimicos_impl.this.AV24Barcolnum3 = GXv_int11[0] ;
      analisiscostesquimicos_impl.this.AV7Clicod1 = GXv_int12[0] ;
      analisiscostesquimicos_impl.this.AV25Clicod3 = GXv_int13[0] ;
      analisiscostesquimicos_impl.this.AV19Intcod1 = GXv_int14[0] ;
      analisiscostesquimicos_impl.this.AV34Intcod3 = GXv_int15[0] ;
      analisiscostesquimicos_impl.this.AV11TipArtCod1 = GXv_int16[0] ;
      analisiscostesquimicos_impl.this.AV28Tipartcod3 = GXv_int17[0] ;
      analisiscostesquimicos_impl.this.AV17Tipcolcod1 = GXv_int18[0] ;
      analisiscostesquimicos_impl.this.AV29Tipcolcod3 = GXv_int19[0] ;
      analisiscostesquimicos_impl.this.AV36barcod = GXv_int20[0] ;
      analisiscostesquimicos_impl.this.AV37barcodreo = GXv_int21[0] ;
      analisiscostesquimicos_impl.this.AV38barcodpar = GXv_char22[0] ;
      analisiscostesquimicos_impl.this.AV43ConsManuales = GXv_int23[0] ;
      analisiscostesquimicos_impl.this.AV40ExcelFilename = GXv_char24[0] ;
      analisiscostesquimicos_impl.this.AV41ErrorMessage = GXv_char25[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21HreRacab", AV21HreRacab);
      httpContext.ajax_rsp_assign_attri("", false, "AV5Fec1", localUtil.format(AV5Fec1, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Fec3", localUtil.format(AV26Fec3, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV9ARtcod1", AV9ARtcod1);
      httpContext.ajax_rsp_assign_attri("", false, "AV22Artcod3", AV22Artcod3);
      httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnom1", AV13Barcolnom1);
      httpContext.ajax_rsp_assign_attri("", false, "AV23Barcolnom3", AV23Barcolnom3);
      httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum1), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV24Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Barcolnum3), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod1), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV25Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod3), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV19Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Intcod1), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Intcod3), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipArtCod1), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Tipartcod3), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Tipcolcod1), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Tipcolcod3), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38barcodpar", AV38barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV43ConsManuales", GXutil.str( AV43ConsManuales, 1, 0));
      if ( GXutil.strcmp(AV40ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV40ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV41ErrorMessage);
      }
      /* Execute user subroutine: 'FINBARRADEPROGRESOS' */
      S212 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavHreracab.setValue( GXutil.rtrim( AV21HreRacab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ProgressIndicator", AV39ProgressIndicator);
   }

   public void e1515V2( )
   {
      /* 'DoCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARVARIABLES' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INICIOBARRADEPROGRESOS' */
      S202 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.wc_analisiscostesquimicosexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV21HreRacab)),GXutil.URLEncode(GXutil.formatDateParm(AV5Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV26Fec3)),GXutil.URLEncode(GXutil.ltrimstr(AV42Calculo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV38barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV9ARtcod1)),GXutil.URLEncode(GXutil.rtrim(AV22Artcod3)),GXutil.URLEncode(GXutil.rtrim(AV13Barcolnom1)),GXutil.URLEncode(GXutil.rtrim(AV23Barcolnom3)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barcolnum1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24Barcolnum3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Clicod1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Clicod3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19Intcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34Intcod3,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipArtCod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28Tipartcod3,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17Tipcolcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29Tipcolcod3,2,0))}, new String[] {"Emprcod","HreRacab","Fec1","Fec2","Calculo","barcod","barcodreo","barcodpar","ARtcod1","ARtcod3","Barcolnom1","Barcolnom3","Barcolnum1","Barcolnum3","Clicod1","Clicod3","Intcod1","Intcod3","TipArtCod1","TipArtCod3","Tipcolcod1","Tipcolcod3"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /* Execute user subroutine: 'FINBARRADEPROGRESOS' */
      S212 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ProgressIndicator", AV39ProgressIndicator);
   }

   public void S192( )
   {
      /* 'CARGARVARIABLES' Routine */
      returnInSub = false ;
      AV26Fec3 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6Fec2)) ? GXutil.today( ) : AV6Fec2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Fec3", localUtil.format(AV26Fec3, "99/99/99"));
      AV25Clicod3 = ((0==AV8Clicod2) ? 999999 : AV8Clicod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod3), 6, 0));
      AV22Artcod3 = ((GXutil.strcmp("", AV10Artcod2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV10Artcod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Artcod3", AV22Artcod3);
      AV28Tipartcod3 = (short)(((0==AV12TipArtCod2) ? 9999 : AV12TipArtCod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Tipartcod3), 4, 0));
      AV23Barcolnom3 = ((GXutil.strcmp("", AV15barcolnom2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV15barcolnom2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Barcolnom3", AV23Barcolnom3);
      AV24Barcolnum3 = ((0==AV16Barcolnum2) ? 999999 : AV16Barcolnum2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Barcolnum3), 6, 0));
      AV29Tipcolcod3 = (byte)(((0==AV18Tipcolcod2) ? 99 : AV18Tipcolcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Tipcolcod3), 2, 0));
      AV34Intcod3 = (byte)(((0==AV20Intcod2) ? 99 : AV20Intcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Intcod3), 2, 0));
      AV27Maqcod3 = ((GXutil.strcmp("", AV35Maqcod2)==0) ? httpContext.getMessage( "ZZZZZZ", "") : AV35Maqcod2) ;
   }

   public void S202( )
   {
      /* 'INICIOBARRADEPROGRESOS' Routine */
      returnInSub = false ;
      AV39ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV39ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV39ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV39ProgressIndicator.show();
      AV39ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
   }

   public void S212( )
   {
      /* 'FINBARRADEPROGRESOS' Routine */
      returnInSub = false ;
      AV39ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV39ProgressIndicator.hide();
   }

   protected void nextLoad( )
   {
   }

   protected void e1615V2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa15V2( ) ;
      ws15V2( ) ;
      we15V2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Webcomponent1 == null ) )
      {
         if ( GXutil.len( WebComp_Webcomponent1_Component) != 0 )
         {
            WebComp_Webcomponent1.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171419229", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/analisiscostesquimicos.js", "?20268171419229", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavFec1_Internalname = "vFEC1" ;
      edtavFec2_Internalname = "vFEC2" ;
      lblTextblockcombo_clicod1_Internalname = "TEXTBLOCKCOMBO_CLICOD1" ;
      Combo_clicod1_Internalname = "COMBO_CLICOD1" ;
      divTablesplittedclicod1_Internalname = "TABLESPLITTEDCLICOD1" ;
      lblTextblockcombo_clicod2_Internalname = "TEXTBLOCKCOMBO_CLICOD2" ;
      Combo_clicod2_Internalname = "COMBO_CLICOD2" ;
      divTablesplittedclicod2_Internalname = "TABLESPLITTEDCLICOD2" ;
      edtavArtcod1_Internalname = "vARTCOD1" ;
      edtavArtcod2_Internalname = "vARTCOD2" ;
      lblTextblockcombo_tipartcod1_Internalname = "TEXTBLOCKCOMBO_TIPARTCOD1" ;
      Combo_tipartcod1_Internalname = "COMBO_TIPARTCOD1" ;
      divTablesplittedtipartcod1_Internalname = "TABLESPLITTEDTIPARTCOD1" ;
      lblTextblockcombo_tipartcod2_Internalname = "TEXTBLOCKCOMBO_TIPARTCOD2" ;
      Combo_tipartcod2_Internalname = "COMBO_TIPARTCOD2" ;
      divTablesplittedtipartcod2_Internalname = "TABLESPLITTEDTIPARTCOD2" ;
      edtavBarcolnom1_Internalname = "vBARCOLNOM1" ;
      edtavBarcolnum1_Internalname = "vBARCOLNUM1" ;
      edtavBarcolnom2_Internalname = "vBARCOLNOM2" ;
      edtavBarcolnum2_Internalname = "vBARCOLNUM2" ;
      lblTextblockcombo_tipcolcod1_Internalname = "TEXTBLOCKCOMBO_TIPCOLCOD1" ;
      Combo_tipcolcod1_Internalname = "COMBO_TIPCOLCOD1" ;
      divTablesplittedtipcolcod1_Internalname = "TABLESPLITTEDTIPCOLCOD1" ;
      lblTextblockcombo_tipcolcod2_Internalname = "TEXTBLOCKCOMBO_TIPCOLCOD2" ;
      Combo_tipcolcod2_Internalname = "COMBO_TIPCOLCOD2" ;
      divTablesplittedtipcolcod2_Internalname = "TABLESPLITTEDTIPCOLCOD2" ;
      lblTextblockcombo_intcod1_Internalname = "TEXTBLOCKCOMBO_INTCOD1" ;
      Combo_intcod1_Internalname = "COMBO_INTCOD1" ;
      divTablesplittedintcod1_Internalname = "TABLESPLITTEDINTCOD1" ;
      lblTextblockcombo_intcod2_Internalname = "TEXTBLOCKCOMBO_INTCOD2" ;
      Combo_intcod2_Internalname = "COMBO_INTCOD2" ;
      divTablesplittedintcod2_Internalname = "TABLESPLITTEDINTCOD2" ;
      cmbavHreracab.setInternalname( "vHRERACAB" );
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      chkavConsmanuales.setInternalname( "vCONSMANUALES" );
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divTable_barradeprogreso_Internalname = "TABLE_BARRADEPROGRESO" ;
      Datamon_Internalname = "DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      divTableresultado2_Internalname = "TABLERESULTADO2" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod1_Internalname = "vCLICOD1" ;
      edtavClicod2_Internalname = "vCLICOD2" ;
      edtavTipartcod1_Internalname = "vTIPARTCOD1" ;
      edtavTipartcod2_Internalname = "vTIPARTCOD2" ;
      edtavTipcolcod1_Internalname = "vTIPCOLCOD1" ;
      edtavTipcolcod2_Internalname = "vTIPCOLCOD2" ;
      edtavIntcod1_Internalname = "vINTCOD1" ;
      edtavIntcod2_Internalname = "vINTCOD2" ;
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
      edtavIntcod2_Jsonclick = "" ;
      edtavIntcod2_Visible = 1 ;
      edtavIntcod1_Jsonclick = "" ;
      edtavIntcod1_Visible = 1 ;
      edtavTipcolcod2_Jsonclick = "" ;
      edtavTipcolcod2_Visible = 1 ;
      edtavTipcolcod1_Jsonclick = "" ;
      edtavTipcolcod1_Visible = 1 ;
      edtavTipartcod2_Jsonclick = "" ;
      edtavTipartcod2_Visible = 1 ;
      edtavTipartcod1_Jsonclick = "" ;
      edtavTipartcod1_Visible = 1 ;
      edtavClicod2_Jsonclick = "" ;
      edtavClicod2_Visible = 1 ;
      edtavClicod1_Jsonclick = "" ;
      edtavClicod1_Visible = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      chkavConsmanuales.setEnabled( 1 );
      cmbavHreracab.setJsonclick( "" );
      cmbavHreracab.setEnabled( 1 );
      edtavBarcolnum2_Jsonclick = "" ;
      edtavBarcolnum2_Enabled = 1 ;
      edtavBarcolnom2_Jsonclick = "" ;
      edtavBarcolnom2_Enabled = 1 ;
      edtavBarcolnum1_Jsonclick = "" ;
      edtavBarcolnum1_Enabled = 1 ;
      edtavBarcolnom1_Jsonclick = "" ;
      edtavBarcolnom1_Enabled = 1 ;
      edtavArtcod2_Jsonclick = "" ;
      edtavArtcod2_Enabled = 1 ;
      edtavArtcod1_Jsonclick = "" ;
      edtavArtcod1_Enabled = 1 ;
      edtavFec2_Jsonclick = "" ;
      edtavFec2_Enabled = 1 ;
      edtavFec1_Jsonclick = "" ;
      edtavFec1_Enabled = 1 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 1 ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Combo_intcod2_Emptyitemtext = "Todas" ;
      Combo_intcod2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_intcod1_Emptyitemtext = "Todas" ;
      Combo_intcod1_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipcolcod2_Emptyitemtext = "Todos" ;
      Combo_tipcolcod2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipcolcod1_Emptyitemtext = "Todos" ;
      Combo_tipcolcod1_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipartcod2_Emptyitemtext = "Todos" ;
      Combo_tipartcod2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipartcod1_Emptyitemtext = "Todos" ;
      Combo_tipartcod1_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod2_Emptyitemtext = "Todos" ;
      Combo_clicod2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod1_Emptyitemtext = "Todos" ;
      Combo_clicod1_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Analisis Costes Quimicos", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHreracab.setName( "vHRERACAB" );
      cmbavHreracab.setWebtags( "" );
      cmbavHreracab.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavHreracab.addItem("", httpContext.getMessage( "Tinte", ""), (short)(0));
      cmbavHreracab.addItem("S", httpContext.getMessage( "Acabados", ""), (short)(0));
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV21HreRacab = cmbavHreracab.getValidValue(AV21HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21HreRacab", AV21HreRacab);
      }
      chkavConsmanuales.setName( "vCONSMANUALES" );
      chkavConsmanuales.setWebtags( "" );
      chkavConsmanuales.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavConsmanuales.getInternalname(), "TitleCaption", chkavConsmanuales.getCaption(), true);
      chkavConsmanuales.setCheckedValue( "0" );
      AV43ConsManuales = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV43ConsManuales, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ConsManuales", GXutil.str( AV43ConsManuales, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV43ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV42Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1315V2',iparms:[{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV21HreRacab',fld:'vHRERACAB',pic:''},{av:'AV5Fec1',fld:'vFEC1',pic:''},{av:'AV6Fec2',fld:'vFEC2',pic:''},{av:'AV42Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV22Artcod3',fld:'vARTCOD3',pic:''},{av:'AV13Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV23Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV14Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV24Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV7Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV25Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV19Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV34Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV11TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV28Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV17Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV29Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV43ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV8Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Artcod2',fld:'vARTCOD2',pic:''},{av:'AV12TipArtCod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV15barcolnom2',fld:'vBARCOLNOM2',pic:''},{av:'AV16Barcolnum2',fld:'vBARCOLNUM2',pic:'ZZZZZ9'},{av:'AV18Tipcolcod2',fld:'vTIPCOLCOD2',pic:'Z9'},{av:'AV20Intcod2',fld:'vINTCOD2',pic:'Z9'},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{ctrl:'WEBCOMPONENT1'},{av:'AV26Fec3',fld:'vFEC3',pic:''},{av:'AV25Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV22Artcod3',fld:'vARTCOD3',pic:''},{av:'AV28Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV23Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV24Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV29Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV34Intcod3',fld:'vINTCOD3',pic:'Z9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1115V1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXCEL'","{handler:'e1415V2',iparms:[{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV21HreRacab',fld:'vHRERACAB',pic:''},{av:'AV5Fec1',fld:'vFEC1',pic:''},{av:'AV26Fec3',fld:'vFEC3',pic:''},{av:'AV9ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV22Artcod3',fld:'vARTCOD3',pic:''},{av:'AV13Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV23Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV14Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV24Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV7Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV25Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV19Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV34Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV11TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV28Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV17Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV29Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV43ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV6Fec2',fld:'vFEC2',pic:''},{av:'AV8Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Artcod2',fld:'vARTCOD2',pic:''},{av:'AV12TipArtCod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV15barcolnom2',fld:'vBARCOLNOM2',pic:''},{av:'AV16Barcolnum2',fld:'vBARCOLNUM2',pic:'ZZZZZ9'},{av:'AV18Tipcolcod2',fld:'vTIPCOLCOD2',pic:'Z9'},{av:'AV20Intcod2',fld:'vINTCOD2',pic:'Z9'},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true}]");
      setEventMetadata("'DOEXCEL'",",oparms:[{av:'AV43ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV29Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV17Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV28Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV11TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV34Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV19Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV25Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV7Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV24Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV14Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV23Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV13Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV22Artcod3',fld:'vARTCOD3',pic:''},{av:'AV9ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV26Fec3',fld:'vFEC3',pic:''},{av:'AV5Fec1',fld:'vFEC1',pic:''},{av:'cmbavHreracab'},{av:'AV21HreRacab',fld:'vHRERACAB',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCSV'","{handler:'e1515V2',iparms:[{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV21HreRacab',fld:'vHRERACAB',pic:''},{av:'AV5Fec1',fld:'vFEC1',pic:''},{av:'AV26Fec3',fld:'vFEC3',pic:''},{av:'AV42Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV22Artcod3',fld:'vARTCOD3',pic:''},{av:'AV13Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV23Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV14Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV24Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV7Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV25Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV19Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV34Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV11TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV28Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV17Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV29Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV6Fec2',fld:'vFEC2',pic:''},{av:'AV8Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Artcod2',fld:'vARTCOD2',pic:''},{av:'AV12TipArtCod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV15barcolnom2',fld:'vBARCOLNOM2',pic:''},{av:'AV16Barcolnum2',fld:'vBARCOLNUM2',pic:'ZZZZZ9'},{av:'AV18Tipcolcod2',fld:'vTIPCOLCOD2',pic:'Z9'},{av:'AV20Intcod2',fld:'vINTCOD2',pic:'Z9'},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true}]");
      setEventMetadata("'DOCSV'",",oparms:[{av:'AV26Fec3',fld:'vFEC3',pic:''},{av:'AV25Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV22Artcod3',fld:'vARTCOD3',pic:''},{av:'AV28Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV23Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV24Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV29Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV34Intcod3',fld:'vINTCOD3',pic:'Z9'}]}");
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
      Combo_intcod2_Selectedvalue_get = "" ;
      Combo_intcod1_Selectedvalue_get = "" ;
      Combo_tipcolcod2_Selectedvalue_get = "" ;
      Combo_tipcolcod1_Selectedvalue_get = "" ;
      Combo_tipartcod2_Selectedvalue_get = "" ;
      Combo_tipartcod1_Selectedvalue_get = "" ;
      Combo_clicod2_Selectedvalue_get = "" ;
      Combo_clicod1_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV35Maqcod2 = "" ;
      GXKey = "" ;
      AV44Clicod1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV46Clicod2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV47TipArtCod1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV48TipArtCod2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49Tipcolcod1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV50Tipcolcod2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV51Intcod1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV52Intcod2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV31EmprCod = "" ;
      AV22Artcod3 = "" ;
      AV23Barcolnom3 = "" ;
      AV26Fec3 = GXutil.nullDate() ;
      Combo_clicod1_Selectedvalue_set = "" ;
      Combo_clicod2_Selectedvalue_set = "" ;
      Combo_tipartcod1_Selectedvalue_set = "" ;
      Combo_tipartcod2_Selectedvalue_set = "" ;
      Combo_tipcolcod1_Selectedvalue_set = "" ;
      Combo_tipcolcod2_Selectedvalue_set = "" ;
      Combo_intcod1_Selectedvalue_set = "" ;
      Combo_intcod2_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV5Fec1 = GXutil.nullDate() ;
      AV6Fec2 = GXutil.nullDate() ;
      lblTextblockcombo_clicod1_Jsonclick = "" ;
      ucCombo_clicod1 = new com.genexus.webpanels.GXUserControl();
      Combo_clicod1_Caption = "" ;
      lblTextblockcombo_clicod2_Jsonclick = "" ;
      ucCombo_clicod2 = new com.genexus.webpanels.GXUserControl();
      Combo_clicod2_Caption = "" ;
      AV9ARtcod1 = "" ;
      AV10Artcod2 = "" ;
      lblTextblockcombo_tipartcod1_Jsonclick = "" ;
      ucCombo_tipartcod1 = new com.genexus.webpanels.GXUserControl();
      Combo_tipartcod1_Caption = "" ;
      lblTextblockcombo_tipartcod2_Jsonclick = "" ;
      ucCombo_tipartcod2 = new com.genexus.webpanels.GXUserControl();
      Combo_tipartcod2_Caption = "" ;
      AV13Barcolnom1 = "" ;
      AV15barcolnom2 = "" ;
      lblTextblockcombo_tipcolcod1_Jsonclick = "" ;
      ucCombo_tipcolcod1 = new com.genexus.webpanels.GXUserControl();
      Combo_tipcolcod1_Caption = "" ;
      lblTextblockcombo_tipcolcod2_Jsonclick = "" ;
      ucCombo_tipcolcod2 = new com.genexus.webpanels.GXUserControl();
      Combo_tipcolcod2_Caption = "" ;
      lblTextblockcombo_intcod1_Jsonclick = "" ;
      ucCombo_intcod1 = new com.genexus.webpanels.GXUserControl();
      Combo_intcod1_Caption = "" ;
      lblTextblockcombo_intcod2_Jsonclick = "" ;
      ucCombo_intcod2 = new com.genexus.webpanels.GXUserControl();
      Combo_intcod2_Caption = "" ;
      AV21HreRacab = "" ;
      AV38barcodpar = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab02_title_Jsonclick = "" ;
      WebComp_Webcomponent1_Component = "" ;
      OldWebcomponent1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV30Station = "" ;
      AV32EmprNom = "" ;
      AV33UsurCod = "" ;
      GXt_char1 = "" ;
      AV39ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H015V2_A396EmprCod = new String[] {""} ;
      H015V2_A13744IntCDsc = new String[] {""} ;
      H015V2_A583IntCod = new byte[1] ;
      H015V2_A584IntDsc = new String[] {""} ;
      H015V2_n584IntDsc = new boolean[] {false} ;
      A13744IntCDsc = "" ;
      A584IntDsc = "" ;
      AV45Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H015V3_A396EmprCod = new String[] {""} ;
      H015V3_A13744IntCDsc = new String[] {""} ;
      H015V3_A583IntCod = new byte[1] ;
      H015V3_A584IntDsc = new String[] {""} ;
      H015V3_n584IntDsc = new boolean[] {false} ;
      H015V4_A396EmprCod = new String[] {""} ;
      H015V4_A13731TipColCDsc = new String[] {""} ;
      H015V4_A831TipColCod = new byte[1] ;
      H015V4_A832TipColDsc = new String[] {""} ;
      H015V4_n832TipColDsc = new boolean[] {false} ;
      A13731TipColCDsc = "" ;
      A832TipColDsc = "" ;
      H015V5_A396EmprCod = new String[] {""} ;
      H015V5_A13731TipColCDsc = new String[] {""} ;
      H015V5_A831TipColCod = new byte[1] ;
      H015V5_A832TipColDsc = new String[] {""} ;
      H015V5_n832TipColDsc = new boolean[] {false} ;
      H015V6_A396EmprCod = new String[] {""} ;
      H015V6_A13788TipArtCodD = new String[] {""} ;
      H015V6_A829TipArtCod = new short[1] ;
      H015V6_A830TipArtDsc = new String[] {""} ;
      H015V6_n830TipArtDsc = new boolean[] {false} ;
      H015V6_A6014TipArtDsc2 = new String[] {""} ;
      H015V6_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      H015V7_A396EmprCod = new String[] {""} ;
      H015V7_A13788TipArtCodD = new String[] {""} ;
      H015V7_A829TipArtCod = new short[1] ;
      H015V7_A830TipArtDsc = new String[] {""} ;
      H015V7_n830TipArtDsc = new boolean[] {false} ;
      H015V7_A6014TipArtDsc2 = new String[] {""} ;
      H015V7_n6014TipArtDsc2 = new boolean[] {false} ;
      H015V8_A396EmprCod = new String[] {""} ;
      H015V8_A10045CliAct = new String[] {""} ;
      H015V8_A13735CliCNom = new String[] {""} ;
      H015V8_A252CliCod = new int[1] ;
      H015V8_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H015V9_A396EmprCod = new String[] {""} ;
      H015V9_A10045CliAct = new String[] {""} ;
      H015V9_A13735CliCNom = new String[] {""} ;
      H015V9_A252CliCod = new int[1] ;
      H015V9_A279CliNom = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new byte[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int20 = new int[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char22 = new String[1] ;
      GXv_int23 = new byte[1] ;
      AV40ExcelFilename = "" ;
      GXv_char24 = new String[1] ;
      AV41ErrorMessage = "" ;
      GXv_char25 = new String[1] ;
      AV27Maqcod3 = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.analisiscostesquimicos__default(),
         new Object[] {
             new Object[] {
            H015V2_A396EmprCod, H015V2_A13744IntCDsc, H015V2_A583IntCod, H015V2_A584IntDsc, H015V2_n584IntDsc
            }
            , new Object[] {
            H015V3_A396EmprCod, H015V3_A13744IntCDsc, H015V3_A583IntCod, H015V3_A584IntDsc, H015V3_n584IntDsc
            }
            , new Object[] {
            H015V4_A396EmprCod, H015V4_A13731TipColCDsc, H015V4_A831TipColCod, H015V4_A832TipColDsc, H015V4_n832TipColDsc
            }
            , new Object[] {
            H015V5_A396EmprCod, H015V5_A13731TipColCDsc, H015V5_A831TipColCod, H015V5_A832TipColDsc, H015V5_n832TipColDsc
            }
            , new Object[] {
            H015V6_A396EmprCod, H015V6_A13788TipArtCodD, H015V6_A829TipArtCod, H015V6_A830TipArtDsc, H015V6_n830TipArtDsc, H015V6_A6014TipArtDsc2, H015V6_n6014TipArtDsc2
            }
            , new Object[] {
            H015V7_A396EmprCod, H015V7_A13788TipArtCodD, H015V7_A829TipArtCod, H015V7_A830TipArtDsc, H015V7_n830TipArtDsc, H015V7_A6014TipArtDsc2, H015V7_n6014TipArtDsc2
            }
            , new Object[] {
            H015V8_A396EmprCod, H015V8_A10045CliAct, H015V8_A13735CliCNom, H015V8_A252CliCod, H015V8_A279CliNom
            }
            , new Object[] {
            H015V9_A396EmprCod, H015V9_A10045CliAct, H015V9_A13735CliCNom, H015V9_A252CliCod, H015V9_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Webcomponent1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV42Calculo ;
   private byte AV34Intcod3 ;
   private byte AV29Tipcolcod3 ;
   private byte AV43ConsManuales ;
   private byte AV37barcodreo ;
   private byte AV17Tipcolcod1 ;
   private byte AV18Tipcolcod2 ;
   private byte AV19Intcod1 ;
   private byte AV20Intcod2 ;
   private byte nDonePA ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte GXv_int14[] ;
   private byte GXv_int15[] ;
   private byte GXv_int18[] ;
   private byte GXv_int19[] ;
   private byte GXv_int21[] ;
   private byte GXv_int23[] ;
   private byte nGXWrapped ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV28Tipartcod3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV11TipArtCod1 ;
   private short AV12TipArtCod2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A829TipArtCod ;
   private short GXv_int16[] ;
   private short GXv_int17[] ;
   private int AV24Barcolnum3 ;
   private int AV25Clicod3 ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavFec1_Enabled ;
   private int edtavFec2_Enabled ;
   private int edtavArtcod1_Enabled ;
   private int edtavArtcod2_Enabled ;
   private int edtavBarcolnom1_Enabled ;
   private int AV14Barcolnum1 ;
   private int edtavBarcolnum1_Enabled ;
   private int edtavBarcolnom2_Enabled ;
   private int AV16Barcolnum2 ;
   private int edtavBarcolnum2_Enabled ;
   private int AV36barcod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int AV7Clicod1 ;
   private int edtavClicod1_Visible ;
   private int AV8Clicod2 ;
   private int edtavClicod2_Visible ;
   private int edtavTipartcod1_Visible ;
   private int edtavTipartcod2_Visible ;
   private int edtavTipcolcod1_Visible ;
   private int edtavTipcolcod2_Visible ;
   private int edtavIntcod1_Visible ;
   private int edtavIntcod2_Visible ;
   private int A252CliCod ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int GXv_int20[] ;
   private int idxLst ;
   private String Combo_intcod2_Selectedvalue_get ;
   private String Combo_intcod1_Selectedvalue_get ;
   private String Combo_tipcolcod2_Selectedvalue_get ;
   private String Combo_tipcolcod1_Selectedvalue_get ;
   private String Combo_tipartcod2_Selectedvalue_get ;
   private String Combo_tipartcod1_Selectedvalue_get ;
   private String Combo_clicod2_Selectedvalue_get ;
   private String Combo_clicod1_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV35Maqcod2 ;
   private String GXKey ;
   private String AV31EmprCod ;
   private String AV22Artcod3 ;
   private String AV23Barcolnom3 ;
   private String Combo_clicod1_Cls ;
   private String Combo_clicod1_Selectedvalue_set ;
   private String Combo_clicod1_Emptyitemtext ;
   private String Combo_clicod2_Cls ;
   private String Combo_clicod2_Selectedvalue_set ;
   private String Combo_clicod2_Emptyitemtext ;
   private String Combo_tipartcod1_Cls ;
   private String Combo_tipartcod1_Selectedvalue_set ;
   private String Combo_tipartcod1_Emptyitemtext ;
   private String Combo_tipartcod2_Cls ;
   private String Combo_tipartcod2_Selectedvalue_set ;
   private String Combo_tipartcod2_Emptyitemtext ;
   private String Combo_tipcolcod1_Cls ;
   private String Combo_tipcolcod1_Selectedvalue_set ;
   private String Combo_tipcolcod1_Emptyitemtext ;
   private String Combo_tipcolcod2_Cls ;
   private String Combo_tipcolcod2_Selectedvalue_set ;
   private String Combo_tipcolcod2_Emptyitemtext ;
   private String Combo_intcod1_Cls ;
   private String Combo_intcod1_Selectedvalue_set ;
   private String Combo_intcod1_Emptyitemtext ;
   private String Combo_intcod2_Cls ;
   private String Combo_intcod2_Selectedvalue_set ;
   private String Combo_intcod2_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String edtavFec1_Internalname ;
   private String TempTags ;
   private String edtavFec1_Jsonclick ;
   private String edtavFec2_Internalname ;
   private String edtavFec2_Jsonclick ;
   private String divTablesplittedclicod1_Internalname ;
   private String lblTextblockcombo_clicod1_Internalname ;
   private String lblTextblockcombo_clicod1_Jsonclick ;
   private String Combo_clicod1_Caption ;
   private String Combo_clicod1_Internalname ;
   private String divTablesplittedclicod2_Internalname ;
   private String lblTextblockcombo_clicod2_Internalname ;
   private String lblTextblockcombo_clicod2_Jsonclick ;
   private String Combo_clicod2_Caption ;
   private String Combo_clicod2_Internalname ;
   private String edtavArtcod1_Internalname ;
   private String AV9ARtcod1 ;
   private String edtavArtcod1_Jsonclick ;
   private String edtavArtcod2_Internalname ;
   private String AV10Artcod2 ;
   private String edtavArtcod2_Jsonclick ;
   private String divTablesplittedtipartcod1_Internalname ;
   private String lblTextblockcombo_tipartcod1_Internalname ;
   private String lblTextblockcombo_tipartcod1_Jsonclick ;
   private String Combo_tipartcod1_Caption ;
   private String Combo_tipartcod1_Internalname ;
   private String divTablesplittedtipartcod2_Internalname ;
   private String lblTextblockcombo_tipartcod2_Internalname ;
   private String lblTextblockcombo_tipartcod2_Jsonclick ;
   private String Combo_tipartcod2_Caption ;
   private String Combo_tipartcod2_Internalname ;
   private String edtavBarcolnom1_Internalname ;
   private String AV13Barcolnom1 ;
   private String edtavBarcolnom1_Jsonclick ;
   private String edtavBarcolnum1_Internalname ;
   private String edtavBarcolnum1_Jsonclick ;
   private String edtavBarcolnom2_Internalname ;
   private String AV15barcolnom2 ;
   private String edtavBarcolnom2_Jsonclick ;
   private String edtavBarcolnum2_Internalname ;
   private String edtavBarcolnum2_Jsonclick ;
   private String divTablesplittedtipcolcod1_Internalname ;
   private String lblTextblockcombo_tipcolcod1_Internalname ;
   private String lblTextblockcombo_tipcolcod1_Jsonclick ;
   private String Combo_tipcolcod1_Caption ;
   private String Combo_tipcolcod1_Internalname ;
   private String divTablesplittedtipcolcod2_Internalname ;
   private String lblTextblockcombo_tipcolcod2_Internalname ;
   private String lblTextblockcombo_tipcolcod2_Jsonclick ;
   private String Combo_tipcolcod2_Caption ;
   private String Combo_tipcolcod2_Internalname ;
   private String divTablesplittedintcod1_Internalname ;
   private String lblTextblockcombo_intcod1_Internalname ;
   private String lblTextblockcombo_intcod1_Jsonclick ;
   private String Combo_intcod1_Caption ;
   private String Combo_intcod1_Internalname ;
   private String divTablesplittedintcod2_Internalname ;
   private String lblTextblockcombo_intcod2_Internalname ;
   private String lblTextblockcombo_intcod2_Jsonclick ;
   private String Combo_intcod2_Caption ;
   private String Combo_intcod2_Internalname ;
   private String AV21HreRacab ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV38barcodpar ;
   private String edtavBarcodpar_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_barradeprogreso_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String Datamon_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divTableresultado2_Internalname ;
   private String WebComp_Webcomponent1_Component ;
   private String OldWebcomponent1 ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod1_Internalname ;
   private String edtavClicod1_Jsonclick ;
   private String edtavClicod2_Internalname ;
   private String edtavClicod2_Jsonclick ;
   private String edtavTipartcod1_Internalname ;
   private String edtavTipartcod1_Jsonclick ;
   private String edtavTipartcod2_Internalname ;
   private String edtavTipartcod2_Jsonclick ;
   private String edtavTipcolcod1_Internalname ;
   private String edtavTipcolcod1_Jsonclick ;
   private String edtavTipcolcod2_Internalname ;
   private String edtavTipcolcod2_Jsonclick ;
   private String edtavIntcod1_Internalname ;
   private String edtavIntcod1_Jsonclick ;
   private String edtavIntcod2_Internalname ;
   private String edtavIntcod2_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV30Station ;
   private String AV32EmprNom ;
   private String AV33UsurCod ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A584IntDsc ;
   private String A832TipColDsc ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char22[] ;
   private String GXv_char24[] ;
   private String GXv_char25[] ;
   private String AV27Maqcod3 ;
   private java.util.Date AV26Fec3 ;
   private java.util.Date AV5Fec1 ;
   private java.util.Date AV6Fec2 ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date GXv_date6[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Webcomponent1 ;
   private boolean n584IntDsc ;
   private boolean n832TipColDsc ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private String A13744IntCDsc ;
   private String A13731TipColCDsc ;
   private String A13788TipArtCodD ;
   private String A13735CliCNom ;
   private String AV40ExcelFilename ;
   private String AV41ErrorMessage ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomponent1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartcod1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartcod2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipcolcod1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipcolcod2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_intcod1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_intcod2 ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private HTMLChoice cmbavHreracab ;
   private ICheckbox chkavConsmanuales ;
   private IDataStoreProvider pr_default ;
   private String[] H015V2_A396EmprCod ;
   private String[] H015V2_A13744IntCDsc ;
   private byte[] H015V2_A583IntCod ;
   private String[] H015V2_A584IntDsc ;
   private boolean[] H015V2_n584IntDsc ;
   private String[] H015V3_A396EmprCod ;
   private String[] H015V3_A13744IntCDsc ;
   private byte[] H015V3_A583IntCod ;
   private String[] H015V3_A584IntDsc ;
   private boolean[] H015V3_n584IntDsc ;
   private String[] H015V4_A396EmprCod ;
   private String[] H015V4_A13731TipColCDsc ;
   private byte[] H015V4_A831TipColCod ;
   private String[] H015V4_A832TipColDsc ;
   private boolean[] H015V4_n832TipColDsc ;
   private String[] H015V5_A396EmprCod ;
   private String[] H015V5_A13731TipColCDsc ;
   private byte[] H015V5_A831TipColCod ;
   private String[] H015V5_A832TipColDsc ;
   private boolean[] H015V5_n832TipColDsc ;
   private String[] H015V6_A396EmprCod ;
   private String[] H015V6_A13788TipArtCodD ;
   private short[] H015V6_A829TipArtCod ;
   private String[] H015V6_A830TipArtDsc ;
   private boolean[] H015V6_n830TipArtDsc ;
   private String[] H015V6_A6014TipArtDsc2 ;
   private boolean[] H015V6_n6014TipArtDsc2 ;
   private String[] H015V7_A396EmprCod ;
   private String[] H015V7_A13788TipArtCodD ;
   private short[] H015V7_A829TipArtCod ;
   private String[] H015V7_A830TipArtDsc ;
   private boolean[] H015V7_n830TipArtDsc ;
   private String[] H015V7_A6014TipArtDsc2 ;
   private boolean[] H015V7_n6014TipArtDsc2 ;
   private String[] H015V8_A396EmprCod ;
   private String[] H015V8_A10045CliAct ;
   private String[] H015V8_A13735CliCNom ;
   private int[] H015V8_A252CliCod ;
   private String[] H015V8_A279CliNom ;
   private String[] H015V9_A396EmprCod ;
   private String[] H015V9_A10045CliAct ;
   private String[] H015V9_A13735CliCNom ;
   private int[] H015V9_A252CliCod ;
   private String[] H015V9_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV44Clicod1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46Clicod2_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47TipArtCod1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48TipArtCod2_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV49Tipcolcod1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV50Tipcolcod2_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV51Intcod1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV52Intcod2_Data ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV39ProgressIndicator ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV45Combo_DataItem ;
}

final  class analisiscostesquimicos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015V2", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, IntCod, IntDsc FROM TXPINTENS ORDER BY IntCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015V3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, IntCod, IntDsc FROM TXPINTENS ORDER BY IntCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015V4", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, TipColCod, TipColDsc FROM TXPTIPCOL ORDER BY TipColCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015V5", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, TipColCod, TipColDsc FROM TXPTIPCOL ORDER BY TipColCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015V6", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015V7", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015V8", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015V9", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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

