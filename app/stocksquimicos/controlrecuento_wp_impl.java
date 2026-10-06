package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlrecuento_wp_impl extends GXDataArea
{
   public controlrecuento_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlrecuento_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlrecuento_wp_impl.class ));
   }

   public controlrecuento_wp_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavValact = UIFactory.getCheckbox(this);
      cmbavFlagstk = new HTMLChoice();
      cmbavOrder = new HTMLChoice();
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
      pa1SM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1SM2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.controlrecuento_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV42Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22FlagM), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SiAuditoria), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Informe), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPPRODUC_DATA", AV64PProduc_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPPRODUC_DATA", AV64PProduc_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPRODUC_DATA", AV65UProduc_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPRODUC_DATA", AV65UProduc_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPPROV_DATA", AV61PProv_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPPROV_DATA", AV61PProv_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPROV_DATA", AV63UProv_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPROV_DATA", AV63UProv_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECREC", localUtil.dtoc( AV18FecRec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFEC", localUtil.dtoc( AV42Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV42Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV22FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22FlagM), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIAUDITORIA", GXutil.ltrim( localUtil.ntoc( AV45SiAuditoria, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SiAuditoria), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV7UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV6Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIACUMULAR", GXutil.rtrim( AV44Siacumular));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINFORME", GXutil.ltrim( localUtil.ntoc( AV29Informe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Informe), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPRODUC_Cls", GXutil.rtrim( Combo_pproduc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPRODUC_Selectedvalue_set", GXutil.rtrim( Combo_pproduc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPRODUC_Emptyitemtext", GXutil.rtrim( Combo_pproduc_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPRODUC_Cls", GXutil.rtrim( Combo_uproduc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPRODUC_Selectedvalue_set", GXutil.rtrim( Combo_uproduc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPRODUC_Emptyitemtext", GXutil.rtrim( Combo_uproduc_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPROV_Cls", GXutil.rtrim( Combo_pprov_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPROV_Selectedvalue_set", GXutil.rtrim( Combo_pprov_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPROV_Emptyitemtext", GXutil.rtrim( Combo_pprov_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPROV_Cls", GXutil.rtrim( Combo_uprov_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPROV_Selectedvalue_set", GXutil.rtrim( Combo_uprov_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPROV_Emptyitemtext", GXutil.rtrim( Combo_uprov_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Width", GXutil.rtrim( Dvpanel_table_acciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Autowidth", GXutil.booltostr( Dvpanel_table_acciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Autoheight", GXutil.booltostr( Dvpanel_table_acciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Cls", GXutil.rtrim( Dvpanel_table_acciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Title", GXutil.rtrim( Dvpanel_table_acciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Collapsible", GXutil.booltostr( Dvpanel_table_acciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Collapsed", GXutil.booltostr( Dvpanel_table_acciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_table_acciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Iconposition", GXutil.rtrim( Dvpanel_table_acciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_ACCIONES_Autoscroll", GXutil.booltostr( Dvpanel_table_acciones_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Title", GXutil.rtrim( Advertencia_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Confirmationtext", GXutil.rtrim( Advertencia_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Yesbuttoncaption", GXutil.rtrim( Advertencia_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Nobuttoncaption", GXutil.rtrim( Advertencia_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Yesbuttonposition", GXutil.rtrim( Advertencia_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Texttype", GXutil.rtrim( Advertencia_Texttype));
      app.GxWebStd.gx_hidden_field( httpContext, "RESULTADOS_MODAL_Width", GXutil.rtrim( Resultados_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "RESULTADOS_MODAL_Title", GXutil.rtrim( Resultados_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "RESULTADOS_MODAL_Confirmtype", GXutil.rtrim( Resultados_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "RESULTADOS_MODAL_Bodytype", GXutil.rtrim( Resultados_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "RESULTADOS_MODAL_Result", GXutil.rtrim( Resultados_modal_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPROV_Selectedvalue_get", GXutil.rtrim( Combo_uprov_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPROV_Selectedvalue_get", GXutil.rtrim( Combo_pprov_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UPRODUC_Selectedvalue_get", GXutil.rtrim( Combo_uproduc_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPRODUC_Selectedvalue_get", GXutil.rtrim( Combo_pproduc_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Result", GXutil.rtrim( Advertencia_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "RESULTADOS_MODAL_Result", GXutil.rtrim( Resultados_modal_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "ADVERTENCIA_Result", GXutil.rtrim( Advertencia_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PPRODUC_Selectedvalue_get", GXutil.rtrim( Combo_pproduc_Selectedvalue_get));
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
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
         we1SM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1SM2( ) ;
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
      return formatLink("app.stocksquimicos.controlrecuento_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.ControlRecuento_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control Recuento (Inventario)", "") ;
   }

   public void wb1SM0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavValact.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavValact.getInternalname(), httpContext.getMessage( "Imprimir Valores Actuales?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavValact.getInternalname(), AV55ValAct, "", httpContext.getMessage( "Imprimir Valores Actuales?", ""), 1, chkavValact.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(30, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,30);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavFlagstk.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFlagstk, cmbavFlagstk.getInternalname(), GXutil.trim( GXutil.str( AV24FlagStk, 1, 0)), 1, cmbavFlagstk.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavFlagstk.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         cmbavFlagstk.setValue( GXutil.trim( GXutil.str( AV24FlagStk, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFlagstk.getInternalname(), "Values", cmbavFlagstk.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedpproduc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_pproduc_Internalname, httpContext.getMessage( "Producto Inicial", ""), "", "", lblTextblockcombo_pproduc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_pproduc.setProperty("Caption", Combo_pproduc_Caption);
         ucCombo_pproduc.setProperty("Cls", Combo_pproduc_Cls);
         ucCombo_pproduc.setProperty("EmptyItemText", Combo_pproduc_Emptyitemtext);
         ucCombo_pproduc.setProperty("DropDownOptionsData", AV64PProduc_Data);
         ucCombo_pproduc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pproduc_Internalname, "COMBO_PPRODUCContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplitteduproduc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_uproduc_Internalname, httpContext.getMessage( "Producto Final", ""), "", "", lblTextblockcombo_uproduc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_uproduc.setProperty("Caption", Combo_uproduc_Caption);
         ucCombo_uproduc.setProperty("Cls", Combo_uproduc_Cls);
         ucCombo_uproduc.setProperty("EmptyItemText", Combo_uproduc_Emptyitemtext);
         ucCombo_uproduc.setProperty("DropDownOptionsData", AV65UProduc_Data);
         ucCombo_uproduc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_uproduc_Internalname, "COMBO_UPRODUCContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedpprov_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_pprov_Internalname, httpContext.getMessage( "Proveedor Inicial", ""), "", "", lblTextblockcombo_pprov_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_pprov.setProperty("Caption", Combo_pprov_Caption);
         ucCombo_pprov.setProperty("Cls", Combo_pprov_Cls);
         ucCombo_pprov.setProperty("EmptyItemText", Combo_pprov_Emptyitemtext);
         ucCombo_pprov.setProperty("DropDownOptionsData", AV61PProv_Data);
         ucCombo_pprov.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pprov_Internalname, "COMBO_PPROVContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplitteduprov_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_uprov_Internalname, httpContext.getMessage( "Proveedor Final", ""), "", "", lblTextblockcombo_uprov_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_uprov.setProperty("Caption", Combo_uprov_Caption);
         ucCombo_uprov.setProperty("Cls", Combo_uprov_Cls);
         ucCombo_uprov.setProperty("EmptyItemText", Combo_uprov_Emptyitemtext);
         ucCombo_uprov.setProperty("DropDownOptionsData", AV63UProv_Data);
         ucCombo_uprov.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_uprov_Internalname, "COMBO_UPROVContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOrder.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOrder.getInternalname(), httpContext.getMessage( "Ordenacion Informe", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOrder, cmbavOrder.getInternalname(), GXutil.trim( GXutil.str( AV32Order, 1, 0)), 1, cmbavOrder.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOrder.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         cmbavOrder.setValue( GXutil.trim( GXutil.str( AV32Order, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOrder.getInternalname(), "Values", cmbavOrder.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfechr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfechr_Internalname, httpContext.getMessage( "Fecha-Hora Recuento", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavRecfechr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfechr_Internalname, localUtil.ttoc( AV43Recfechr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV43Recfechr, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfechr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfechr_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRecfechr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRecfechr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_table_acciones.setProperty("Width", Dvpanel_table_acciones_Width);
         ucDvpanel_table_acciones.setProperty("AutoWidth", Dvpanel_table_acciones_Autowidth);
         ucDvpanel_table_acciones.setProperty("AutoHeight", Dvpanel_table_acciones_Autoheight);
         ucDvpanel_table_acciones.setProperty("Cls", Dvpanel_table_acciones_Cls);
         ucDvpanel_table_acciones.setProperty("Title", Dvpanel_table_acciones_Title);
         ucDvpanel_table_acciones.setProperty("Collapsible", Dvpanel_table_acciones_Collapsible);
         ucDvpanel_table_acciones.setProperty("Collapsed", Dvpanel_table_acciones_Collapsed);
         ucDvpanel_table_acciones.setProperty("ShowCollapseIcon", Dvpanel_table_acciones_Showcollapseicon);
         ucDvpanel_table_acciones.setProperty("IconPosition", Dvpanel_table_acciones_Iconposition);
         ucDvpanel_table_acciones.setProperty("AutoScroll", Dvpanel_table_acciones_Autoscroll);
         ucDvpanel_table_acciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_table_acciones_Internalname, "DVPANEL_TABLE_ACCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLE_ACCIONESContainer"+"Table_Acciones"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 7, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111sm1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableusercontrol_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucAdvertencia.setProperty("Title", Advertencia_Title);
         ucAdvertencia.setProperty("ConfirmationText", Advertencia_Confirmationtext);
         ucAdvertencia.setProperty("YesButtonCaption", Advertencia_Yesbuttoncaption);
         ucAdvertencia.setProperty("NoButtonCaption", Advertencia_Nobuttoncaption);
         ucAdvertencia.setProperty("YesButtonPosition", Advertencia_Yesbuttonposition);
         ucAdvertencia.setProperty("TextType", Advertencia_Texttype);
         ucAdvertencia.render(context, "dvelop.gxbootstrap.confirmpanel", Advertencia_Internalname, "ADVERTENCIAContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV68Pgmname), GXutil.rtrim( localUtil.format( AV68Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPproduc_Internalname, GXutil.rtrim( AV36PProduc), GXutil.rtrim( localUtil.format( AV36PProduc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPproduc_Jsonclick, 0, "Attribute", "", "", "", "", edtavPproduc_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUproduc_Internalname, GXutil.rtrim( AV52UProduc), GXutil.rtrim( localUtil.format( AV52UProduc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUproduc_Jsonclick, 0, "Attribute", "", "", "", "", edtavUproduc_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPprov_Internalname, GXutil.ltrim( localUtil.ntoc( AV37PProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37PProv), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPprov_Jsonclick, 0, "Attribute", "", "", "", "", edtavPprov_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUprov_Internalname, GXutil.ltrim( localUtil.ntoc( AV53UProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53UProv), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUprov_Jsonclick, 0, "Attribute", "", "", "", "", edtavUprov_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ControlRecuento_WP.htm");
         wb_table1_117_1SM2( true) ;
      }
      else
      {
         wb_table1_117_1SM2( false) ;
      }
      return  ;
   }

   public void wb_table1_117_1SM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0123"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0123"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0123"+"");
               }
               WebComp_Wwpaux_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1SM2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control Recuento (Inventario)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1SM0( ) ;
   }

   public void ws1SM2( )
   {
      start1SM2( ) ;
      evt1SM2( ) ;
   }

   public void evt1SM2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_PPRODUC.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121SM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ADVERTENCIA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131SM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "RESULTADOS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141SM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e151SM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e161SM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171SM2 ();
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
                     if ( nCmpId == 123 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0123") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0123", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1SM2( )
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

   public void pa1SM2( )
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
            GX_FocusControl = chkavValact.getInternalname() ;
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
      AV55ValAct = ((GXutil.strcmp(GXutil.rtrim( AV55ValAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55ValAct", AV55ValAct);
      if ( cmbavFlagstk.getItemCount() > 0 )
      {
         AV24FlagStk = (byte)(GXutil.lval( cmbavFlagstk.getValidValue(GXutil.trim( GXutil.str( AV24FlagStk, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24FlagStk", GXutil.str( AV24FlagStk, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFlagstk.setValue( GXutil.trim( GXutil.str( AV24FlagStk, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFlagstk.getInternalname(), "Values", cmbavFlagstk.ToJavascriptSource(), true);
      }
      if ( cmbavOrder.getItemCount() > 0 )
      {
         AV32Order = (byte)(GXutil.lval( cmbavOrder.getValidValue(GXutil.trim( GXutil.str( AV32Order, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Order", GXutil.str( AV32Order, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOrder.setValue( GXutil.trim( GXutil.str( AV32Order, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOrder.getInternalname(), "Values", cmbavOrder.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1SM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV68Pgmname = "StocksQuimicos.ControlRecuento_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfechr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfechr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1SM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171SM2 ();
         wb1SM0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1SM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFEC", localUtil.dtoc( AV42Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV42Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV22FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22FlagM), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIAUDITORIA", GXutil.ltrim( localUtil.ntoc( AV45SiAuditoria, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SiAuditoria), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV7UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV6Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINFORME", GXutil.ltrim( localUtil.ntoc( AV29Informe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Informe), "9")));
   }

   public void before_start_formulas( )
   {
      AV68Pgmname = "StocksQuimicos.ControlRecuento_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfechr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfechr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1SM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151SM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPPRODUC_DATA"), AV64PProduc_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPRODUC_DATA"), AV65UProduc_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPPROV_DATA"), AV61PProv_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPROV_DATA"), AV63UProv_Data);
         /* Read saved values. */
         Combo_pproduc_Cls = httpContext.cgiGet( "COMBO_PPRODUC_Cls") ;
         Combo_pproduc_Selectedvalue_set = httpContext.cgiGet( "COMBO_PPRODUC_Selectedvalue_set") ;
         Combo_pproduc_Emptyitemtext = httpContext.cgiGet( "COMBO_PPRODUC_Emptyitemtext") ;
         Combo_uproduc_Cls = httpContext.cgiGet( "COMBO_UPRODUC_Cls") ;
         Combo_uproduc_Selectedvalue_set = httpContext.cgiGet( "COMBO_UPRODUC_Selectedvalue_set") ;
         Combo_uproduc_Emptyitemtext = httpContext.cgiGet( "COMBO_UPRODUC_Emptyitemtext") ;
         Combo_pprov_Cls = httpContext.cgiGet( "COMBO_PPROV_Cls") ;
         Combo_pprov_Selectedvalue_set = httpContext.cgiGet( "COMBO_PPROV_Selectedvalue_set") ;
         Combo_pprov_Emptyitemtext = httpContext.cgiGet( "COMBO_PPROV_Emptyitemtext") ;
         Combo_uprov_Cls = httpContext.cgiGet( "COMBO_UPROV_Cls") ;
         Combo_uprov_Selectedvalue_set = httpContext.cgiGet( "COMBO_UPROV_Selectedvalue_set") ;
         Combo_uprov_Emptyitemtext = httpContext.cgiGet( "COMBO_UPROV_Emptyitemtext") ;
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
         Dvpanel_table_acciones_Width = httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Width") ;
         Dvpanel_table_acciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Autowidth")) ;
         Dvpanel_table_acciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Autoheight")) ;
         Dvpanel_table_acciones_Cls = httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Cls") ;
         Dvpanel_table_acciones_Title = httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Title") ;
         Dvpanel_table_acciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Collapsible")) ;
         Dvpanel_table_acciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Collapsed")) ;
         Dvpanel_table_acciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Showcollapseicon")) ;
         Dvpanel_table_acciones_Iconposition = httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Iconposition") ;
         Dvpanel_table_acciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_ACCIONES_Autoscroll")) ;
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
         Advertencia_Title = httpContext.cgiGet( "ADVERTENCIA_Title") ;
         Advertencia_Confirmationtext = httpContext.cgiGet( "ADVERTENCIA_Confirmationtext") ;
         Advertencia_Yesbuttoncaption = httpContext.cgiGet( "ADVERTENCIA_Yesbuttoncaption") ;
         Advertencia_Nobuttoncaption = httpContext.cgiGet( "ADVERTENCIA_Nobuttoncaption") ;
         Advertencia_Yesbuttonposition = httpContext.cgiGet( "ADVERTENCIA_Yesbuttonposition") ;
         Advertencia_Texttype = httpContext.cgiGet( "ADVERTENCIA_Texttype") ;
         Resultados_modal_Width = httpContext.cgiGet( "RESULTADOS_MODAL_Width") ;
         Resultados_modal_Title = httpContext.cgiGet( "RESULTADOS_MODAL_Title") ;
         Resultados_modal_Confirmtype = httpContext.cgiGet( "RESULTADOS_MODAL_Confirmtype") ;
         Resultados_modal_Bodytype = httpContext.cgiGet( "RESULTADOS_MODAL_Bodytype") ;
         Resultados_modal_Result = httpContext.cgiGet( "RESULTADOS_MODAL_Result") ;
         Advertencia_Result = httpContext.cgiGet( "ADVERTENCIA_Result") ;
         Combo_pproduc_Selectedvalue_get = httpContext.cgiGet( "COMBO_PPRODUC_Selectedvalue_get") ;
         /* Read variables values. */
         AV55ValAct = ((GXutil.strcmp(httpContext.cgiGet( chkavValact.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ValAct", AV55ValAct);
         cmbavFlagstk.setValue( httpContext.cgiGet( cmbavFlagstk.getInternalname()) );
         AV24FlagStk = (byte)(GXutil.lval( httpContext.cgiGet( cmbavFlagstk.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24FlagStk", GXutil.str( AV24FlagStk, 1, 0));
         cmbavOrder.setValue( httpContext.cgiGet( cmbavOrder.getInternalname()) );
         AV32Order = (byte)(GXutil.lval( httpContext.cgiGet( cmbavOrder.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Order", GXutil.str( AV32Order, 1, 0));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavRecfechr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vRECFECHR");
            GX_FocusControl = edtavRecfechr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43Recfechr = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV43Recfechr", localUtil.ttoc( AV43Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV43Recfechr = localUtil.ctot( httpContext.cgiGet( edtavRecfechr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Recfechr", localUtil.ttoc( AV43Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68Pgmname", AV68Pgmname);
         AV36PProduc = httpContext.cgiGet( edtavPproduc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36PProduc", AV36PProduc);
         AV52UProduc = httpContext.cgiGet( edtavUproduc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52UProduc", AV52UProduc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPprov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPprov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPPROV");
            GX_FocusControl = edtavPprov_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37PProv = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37PProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37PProv), 6, 0));
         }
         else
         {
            AV37PProv = (int)(localUtil.ctol( httpContext.cgiGet( edtavPprov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37PProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37PProv), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUprov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUprov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUPROV");
            GX_FocusControl = edtavUprov_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53UProv = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53UProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53UProv), 6, 0));
         }
         else
         {
            AV53UProv = (int)(localUtil.ctol( httpContext.cgiGet( edtavUprov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53UProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53UProv), 6, 0));
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
      e151SM2 ();
      if (returnInSub) return;
   }

   public void e151SM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV6Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlrecuento_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Station", AV6Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      GXv_char2[0] = AV16EmprCod ;
      GXv_char3[0] = AV5EmprNom ;
      GXv_char4[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlrecuento_wp_impl.this.AV16EmprCod = GXv_char2[0] ;
      controlrecuento_wp_impl.this.AV5EmprNom = GXv_char3[0] ;
      controlrecuento_wp_impl.this.AV7UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7UsurCod", AV7UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      GXt_int5 = AV13DelRec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "DELREC", ""), GXv_int6) ;
      controlrecuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13DelRec = GXt_int5 ;
      GXt_int5 = AV28Infec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "INFEHH", ""), GXv_int6) ;
      controlrecuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28Infec = GXt_int5 ;
      GXt_int5 = AV50tintutex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      controlrecuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV50tintutex = GXt_int5 ;
      GXt_int5 = AV12Cotexsur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      controlrecuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12Cotexsur = GXt_int5 ;
      AV44Siacumular = ((AV12Cotexsur==0) ? httpContext.getMessage( "N", "") : httpContext.getMessage( "S", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Siacumular", AV44Siacumular);
      GXt_int5 = AV45SiAuditoria ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "SIAUPQ", ""), GXv_int6) ;
      controlrecuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV45SiAuditoria = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45SiAuditoria", GXutil.str( AV45SiAuditoria, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SiAuditoria), "9")));
      GXt_char1 = AV9ContDsc2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "VERSEM", ""), GXv_char4) ;
      controlrecuento_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9ContDsc2 = GXt_char1 ;
      AV57Version = GXutil.substring( AV9ContDsc2, 1, 20) ;
      AV57Version = ((GXutil.strcmp("", AV57Version)==0) ? httpContext.getMessage( "Version 1.0", "") : AV57Version) ;
      GXt_int5 = AV17ExiCont ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "PWDREC", ""), GXv_int6) ;
      controlrecuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17ExiCont = GXt_int5 ;
      GXt_int7 = AV10ContrasenaValidar ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "PWDREC", ""), GXv_int8) ;
      controlrecuento_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV10ContrasenaValidar = GXt_int7 ;
      AV33PasswordContexto = "ValidarWebWPwdGrl" ;
      AV58WebSession.setValue(AV33PasswordContexto, GXutil.str( AV10ContrasenaValidar, 8, 0));
      AV32Order = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Order", GXutil.str( AV32Order, 1, 0));
      if ( AV17ExiCont == 0 )
      {
         Gx_msg = httpContext.getMessage( "En la version, ", "") + GXutil.trim( AV49TextoVers) + httpContext.getMessage( " es necesario", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "tener creado el contador PWDREC", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "y asignado un PASSWORD", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      AV18FecRec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18FecRec", localUtil.format(AV18FecRec, "99/99/99"));
      AV56VarAux0 = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV25HhMm = localUtil.ttoc( AV56VarAux0, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV26HhMmchar = localUtil.dtoc( AV18FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + AV25HhMm ;
      AV43Recfechr = localUtil.ctot( AV26HhMmchar, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Recfechr", localUtil.ttoc( AV43Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV47Texto = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      if ( AV29Informe == 1 )
      {
         AV47Texto += httpContext.getMessage( "ATENCION. Informamos que con Fecha ", "") + localUtil.dtoc( AV18FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " ,ya se hizo un INVENTARIO.", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
         AV47Texto += httpContext.getMessage( "SI confirma el INVENTARIO, se eliminara la informacion con Fecha ", "") + localUtil.dtoc( AV18FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( ",dentro del intervalo seleccionado.", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
         AV47Texto += " " + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      }
      if ( GXutil.strcmp(AV47Texto, " ") == 0 )
      {
         AV47Texto += httpContext.getMessage( "Importante. Es obligatorio que se compruebe que NO haya nadie, trabajando en: ", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      }
      else
      {
         AV47Texto += httpContext.getMessage( "Importante. Es obligatorio que se compruebe que NO haya nadie, trabajando en: ", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      }
      AV47Texto += httpContext.getMessage( "Compras de Quimicos, Recetas de Tinte, Recetas Acabado", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      AV47Texto += httpContext.getMessage( "Recetas estampación, Recetas Lavados, Consumos Manuales", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      AV47Texto += httpContext.getMessage( "Cierre de Recetas de Tinte, Acabados, Estampación, Lavados ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      AV47Texto += httpContext.getMessage( "Porque si fuera que sí, esto afectaría al inventario que deseamos realizar.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      AV47Texto += httpContext.getMessage( "Confirma, entonces, la creación del INVENTARIO, con fecha ", "") + localUtil.ttoc( AV43Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " ?" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Texto", AV47Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Texto, ""))));
      AV22FlagM = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FlagM", GXutil.str( AV22FlagM, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22FlagM), "9")));
      /* Execute user subroutine: 'LASTRECUEN' */
      S112 ();
      if (returnInSub) return;
      if ( AV13DelRec == 1 )
      {
         GXv_char4[0] = AV16EmprCod ;
         GXv_int6[0] = AV22FlagM ;
         new app.pctrrec(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
         controlrecuento_wp_impl.this.AV16EmprCod = GXv_char4[0] ;
         controlrecuento_wp_impl.this.AV22FlagM = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV22FlagM", GXutil.str( AV22FlagM, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22FlagM), "9")));
      }
      AV55ValAct = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55ValAct", AV55ValAct);
      GXt_char1 = AV6Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      controlrecuento_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV6Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Station", AV6Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV5EmprNom ;
      GXv_char2[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char4, GXv_char3, GXv_char2) ;
      controlrecuento_wp_impl.this.AV16EmprCod = GXv_char4[0] ;
      controlrecuento_wp_impl.this.AV5EmprNom = GXv_char3[0] ;
      controlrecuento_wp_impl.this.AV7UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7UsurCod", AV7UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      edtavUprov_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUprov_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUprov_Visible), 5, 0), true);
      edtavPprov_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPprov_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPprov_Visible), 5, 0), true);
      edtavUproduc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUproduc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUproduc_Visible), 5, 0), true);
      edtavPproduc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPproduc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPproduc_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPPRODUC' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOUPRODUC' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPPROV' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOUPROV' */
      S152 ();
      if (returnInSub) return;
   }

   public void e141SM2( )
   {
      /* Resultados_modal_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Resultados_modal_Result, httpContext.getMessage( "SI", "")) == 0 )
      {
         Advertencia_Title = httpContext.getMessage( "ADVERTENCIA", "") ;
         ucAdvertencia.sendProperty(context, "", false, Advertencia_Internalname, "Title", Advertencia_Title);
         Advertencia_Confirmationtext = AV47Texto ;
         ucAdvertencia.sendProperty(context, "", false, Advertencia_Internalname, "ConfirmationText", Advertencia_Confirmationtext);
         this.executeUsercontrolMethod("", false, "ADVERTENCIAContainer", "Confirm", "", new Object[] {});
      }
      if ( 1 == 0 )
      {
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e161SM2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e121SM2( )
   {
      /* Combo_pproduc_Onoptionclicked Routine */
      returnInSub = false ;
      AV36PProduc = Combo_pproduc_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36PProduc", AV36PProduc);
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'LOADCOMBOUPROV' Routine */
      returnInSub = false ;
      /* Using cursor H01SM2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14216PrvAct = H01SM2_A14216PrvAct[0] ;
         A13719PrvNNom = H01SM2_A13719PrvNNom[0] ;
         A795PrvNum = H01SM2_A795PrvNum[0] ;
         A794PrvNom = H01SM2_A794PrvNom[0] ;
         n794PrvNom = H01SM2_n794PrvNom[0] ;
         AV62Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) );
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13719PrvNNom );
         AV63UProv_Data.add(AV62Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_uprov_Selectedvalue_set = ((0==AV53UProv) ? "" : GXutil.trim( GXutil.str( AV53UProv, 6, 0))) ;
      ucCombo_uprov.sendProperty(context, "", false, Combo_uprov_Internalname, "SelectedValue_set", Combo_uprov_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOPPROV' Routine */
      returnInSub = false ;
      /* Using cursor H01SM3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14216PrvAct = H01SM3_A14216PrvAct[0] ;
         A13719PrvNNom = H01SM3_A13719PrvNNom[0] ;
         A795PrvNum = H01SM3_A795PrvNum[0] ;
         A794PrvNom = H01SM3_A794PrvNom[0] ;
         n794PrvNom = H01SM3_n794PrvNom[0] ;
         AV62Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) );
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13719PrvNNom );
         AV61PProv_Data.add(AV62Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_pprov_Selectedvalue_set = ((0==AV37PProv) ? "" : GXutil.trim( GXutil.str( AV37PProv, 6, 0))) ;
      ucCombo_pprov.sendProperty(context, "", false, Combo_pprov_Internalname, "SelectedValue_set", Combo_pprov_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOUPRODUC' Routine */
      returnInSub = false ;
      /* Using cursor H01SM4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A856ValCod = H01SM4_A856ValCod[0] ;
         A13747PrdCDsc = H01SM4_A13747PrdCDsc[0] ;
         A719PrdNum = H01SM4_A719PrdNum[0] ;
         A718PrdNom = H01SM4_A718PrdNom[0] ;
         AV62Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV65UProduc_Data.add(AV62Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_uproduc_Selectedvalue_set = AV52UProduc ;
      ucCombo_uproduc.sendProperty(context, "", false, Combo_uproduc_Internalname, "SelectedValue_set", Combo_uproduc_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOPPRODUC' Routine */
      returnInSub = false ;
      /* Using cursor H01SM5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A856ValCod = H01SM5_A856ValCod[0] ;
         A13747PrdCDsc = H01SM5_A13747PrdCDsc[0] ;
         A719PrdNum = H01SM5_A719PrdNum[0] ;
         A718PrdNom = H01SM5_A718PrdNom[0] ;
         AV62Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV62Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV64PProduc_Data.add(AV62Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_pproduc_Selectedvalue_set = AV36PProduc ;
      ucCombo_pproduc.sendProperty(context, "", false, Combo_pproduc_Internalname, "SelectedValue_set", Combo_pproduc_Selectedvalue_set);
   }

   public void e131SM2( )
   {
      /* Advertencia_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Advertencia_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RESULTADOS' */
         S162 ();
         if (returnInSub) return;
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ProgressIndicator", AV40ProgressIndicator);
      cmbavFlagstk.setValue( GXutil.trim( GXutil.str( AV24FlagStk, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavFlagstk.getInternalname(), "Values", cmbavFlagstk.ToJavascriptSource(), true);
   }

   public void S162( )
   {
      /* 'DO ACTION RESULTADOS' Routine */
      returnInSub = false ;
      AV51UProd2 = ((GXutil.strcmp("", AV52UProduc)==0) ? "999999" : AV52UProduc) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51UProd2", AV51UProd2);
      AV54UProv2 = ((0==AV53UProv) ? 999999 : AV53UProv) ;
      if ( GXutil.resetTime(AV18FecRec).before( GXutil.resetTime( AV42Recfec )) )
      {
         Gx_msg = httpContext.getMessage( "Error. Fecha Ultimo recuento ", "") + localUtil.dtoc( AV42Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "es INFERIOR a la Fecha introducida ", "") + localUtil.dtoc( AV18FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( AV22FlagM == 1 )
         {
            Gx_msg = httpContext.getMessage( "ATENCION. Falta Terminar Inventario Anterior, Fecha = ", "") + localUtil.dtoc( AV42Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( AV45SiAuditoria == 1 )
            {
               AV48Texto_i = httpContext.getMessage( "Wrecuen. Inicio.Ajustes RESERVAS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV36PProduc + "-" + AV51UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV37PProv, 6, 0) + "-" + GXutil.str( AV54UProv2, 6, 0) ;
               new app.pctrinc(remoteHandle, context).execute( AV16EmprCod, AV68Pgmname, AV7UsurCod, AV6Station, AV48Texto_i, 99999999, (byte)(0), "@") ;
               AV40ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
               AV40ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
               AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Reservas Productos...", ""));
               AV40ProgressIndicator.setgxTv_SdtProgress_Value( 20 );
               GXv_char4[0] = AV16EmprCod ;
               GXv_char3[0] = AV36PProduc ;
               GXv_char2[0] = AV51UProd2 ;
               new app.preserv1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
               controlrecuento_wp_impl.this.AV16EmprCod = GXv_char4[0] ;
               controlrecuento_wp_impl.this.AV36PProduc = GXv_char3[0] ;
               controlrecuento_wp_impl.this.AV51UProd2 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV36PProduc", AV36PProduc);
               httpContext.ajax_rsp_assign_attri("", false, "AV51UProd2", AV51UProd2);
               new app.pcommit(remoteHandle, context).execute( ) ;
               GXv_char4[0] = AV16EmprCod ;
               GXv_char3[0] = AV36PProduc ;
               GXv_char2[0] = AV51UProd2 ;
               new app.preserv2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
               controlrecuento_wp_impl.this.AV16EmprCod = GXv_char4[0] ;
               controlrecuento_wp_impl.this.AV36PProduc = GXv_char3[0] ;
               controlrecuento_wp_impl.this.AV51UProd2 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV36PProduc", AV36PProduc);
               httpContext.ajax_rsp_assign_attri("", false, "AV51UProd2", AV51UProd2);
               new app.pcommit(remoteHandle, context).execute( ) ;
               AV48Texto_i = httpContext.getMessage( "Wrecuen. Fin.Ajustes RESERVAS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV36PProduc + "-" + AV51UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV37PProv, 6, 0) + "-" + GXutil.str( AV54UProv2, 6, 0) ;
               new app.pctrinc(remoteHandle, context).execute( AV16EmprCod, AV68Pgmname, AV7UsurCod, AV6Station, AV48Texto_i, 99999999, (byte)(0), "@") ;
               AV8ActDatos = httpContext.getMessage( "S", "") ;
               AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias..........", ""));
               AV40ProgressIndicator.setgxTv_SdtProgress_Value( 40 );
               AV19File = "" ;
               callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36PProduc)),GXutil.URLEncode(GXutil.rtrim(AV51UProd2)),GXutil.URLEncode(GXutil.rtrim(AV44Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV8ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV19File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV68Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
               httpContext.wjLocDisableFrm = (byte)(2) ;
               AV48Texto_i = httpContext.getMessage( "Wrecuen. Inicio.Auditoria PRODUCTOS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV36PProduc + "-" + AV51UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV37PProv, 6, 0) + "-" + GXutil.str( AV54UProv2, 6, 0) ;
               new app.pctrinc(remoteHandle, context).execute( AV16EmprCod, AV68Pgmname, AV7UsurCod, AV6Station, AV48Texto_i, 99999999, (byte)(0), "@") ;
               GX_I = 1 ;
               while ( GX_I <= 10000 )
               {
                  AV46Tab_upq[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               AV27i = 1 ;
               /* Using cursor H01SM6 */
               pr_default.execute(4, new Object[] {AV16EmprCod, AV36PProduc, AV51UProd2});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A856ValCod = H01SM6_A856ValCod[0] ;
                  A719PrdNum = H01SM6_A719PrdNum[0] ;
                  A396EmprCod = H01SM6_A396EmprCod[0] ;
                  if ( AV27i > 10000 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 10000 productos quimicos", ""));
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV46Tab_upq[AV27i-1] = A719PrdNum ;
                  AV27i = (int)(AV27i+1) ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias (1)..........", ""));
               AV40ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
               AV27i = 1 ;
               while ( AV27i <= 10000 )
               {
                  if ( GXutil.strcmp(AV46Tab_upq[AV27i-1], " ") == 0 )
                  {
                     if (true) break;
                  }
                  AV39Prdnum = AV46Tab_upq[AV27i-1] ;
                  GXv_char4[0] = AV16EmprCod ;
                  GXv_char3[0] = AV39Prdnum ;
                  GXv_char2[0] = AV44Siacumular ;
                  GXv_decimal9[0] = AV14Dif ;
                  GXv_decimal10[0] = AV15Dif2 ;
                  GXv_char11[0] = AV30Obs ;
                  new app.pupq003(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal9, GXv_decimal10, GXv_char11) ;
                  controlrecuento_wp_impl.this.AV16EmprCod = GXv_char4[0] ;
                  controlrecuento_wp_impl.this.AV39Prdnum = GXv_char3[0] ;
                  controlrecuento_wp_impl.this.AV44Siacumular = GXv_char2[0] ;
                  controlrecuento_wp_impl.this.AV14Dif = GXv_decimal9[0] ;
                  controlrecuento_wp_impl.this.AV15Dif2 = GXv_decimal10[0] ;
                  controlrecuento_wp_impl.this.AV30Obs = GXv_char11[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV44Siacumular", AV44Siacumular);
                  GXv_char11[0] = AV16EmprCod ;
                  GXv_char4[0] = AV39Prdnum ;
                  GXv_decimal10[0] = AV14Dif ;
                  GXv_decimal9[0] = AV15Dif2 ;
                  GXv_char3[0] = AV30Obs ;
                  new app.pupq002(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_decimal10, GXv_decimal9, GXv_char3) ;
                  controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
                  controlrecuento_wp_impl.this.AV39Prdnum = GXv_char4[0] ;
                  controlrecuento_wp_impl.this.AV14Dif = GXv_decimal10[0] ;
                  controlrecuento_wp_impl.this.AV15Dif2 = GXv_decimal9[0] ;
                  controlrecuento_wp_impl.this.AV30Obs = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
                  new app.pcommit(remoteHandle, context).execute( ) ;
                  GXv_char11[0] = AV16EmprCod ;
                  GXv_char4[0] = AV39Prdnum ;
                  new app.core.upq004(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
                  controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
                  controlrecuento_wp_impl.this.AV39Prdnum = GXv_char4[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
                  GXt_char1 = AV38Prdnom ;
                  GXv_char11[0] = AV16EmprCod ;
                  GXv_char4[0] = AV39Prdnum ;
                  GXv_char3[0] = GXt_char1 ;
                  new app.pprddsc(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3) ;
                  controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
                  controlrecuento_wp_impl.this.AV39Prdnum = GXv_char4[0] ;
                  controlrecuento_wp_impl.this.GXt_char1 = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
                  AV38Prdnom = GXt_char1 ;
                  AV40ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(1) Producto ", "")+GXutil.trim( AV39Prdnum)+" "+GXutil.trim( AV38Prdnom) );
                  GXv_char11[0] = AV16EmprCod ;
                  GXv_char4[0] = AV39Prdnum ;
                  GXv_char3[0] = AV44Siacumular ;
                  GXv_decimal10[0] = AV14Dif ;
                  GXv_decimal9[0] = AV15Dif2 ;
                  GXv_char2[0] = AV30Obs ;
                  new app.pupq003(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3, GXv_decimal10, GXv_decimal9, GXv_char2) ;
                  controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
                  controlrecuento_wp_impl.this.AV39Prdnum = GXv_char4[0] ;
                  controlrecuento_wp_impl.this.AV44Siacumular = GXv_char3[0] ;
                  controlrecuento_wp_impl.this.AV14Dif = GXv_decimal10[0] ;
                  controlrecuento_wp_impl.this.AV15Dif2 = GXv_decimal9[0] ;
                  controlrecuento_wp_impl.this.AV30Obs = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV44Siacumular", AV44Siacumular);
                  GXv_char11[0] = AV16EmprCod ;
                  GXv_char4[0] = AV39Prdnum ;
                  GXv_decimal10[0] = AV14Dif ;
                  GXv_decimal9[0] = AV15Dif2 ;
                  GXv_char3[0] = AV30Obs ;
                  new app.pupq002(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_decimal10, GXv_decimal9, GXv_char3) ;
                  controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
                  controlrecuento_wp_impl.this.AV39Prdnum = GXv_char4[0] ;
                  controlrecuento_wp_impl.this.AV14Dif = GXv_decimal10[0] ;
                  controlrecuento_wp_impl.this.AV15Dif2 = GXv_decimal9[0] ;
                  controlrecuento_wp_impl.this.AV30Obs = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
                  new app.pcommit(remoteHandle, context).execute( ) ;
                  GXv_char11[0] = AV16EmprCod ;
                  GXv_char4[0] = AV39Prdnum ;
                  new app.core.upq004(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
                  controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
                  controlrecuento_wp_impl.this.AV39Prdnum = GXv_char4[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
                  AV40ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(2) Producto ", "")+GXutil.trim( AV39Prdnum)+" "+GXutil.trim( AV38Prdnom) );
                  AV27i = (int)(AV27i+1) ;
               }
               AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias (2)..........", ""));
               AV40ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Auditoria Productos Existencias ", "") );
               AV40ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
               callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36PProduc)),GXutil.URLEncode(GXutil.rtrim(AV51UProd2)),GXutil.URLEncode(GXutil.rtrim(AV44Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV8ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV19File)),GXutil.URLEncode(GXutil.rtrim(AV68Pgmname))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
               httpContext.wjLocDisableFrm = (byte)(2) ;
               AV48Texto_i = httpContext.getMessage( "Wrecuen. Fin.Auditoria PRODUCTOS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV36PProduc + "-" + AV51UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV37PProv, 6, 0) + "-" + GXutil.str( AV54UProv2, 6, 0) ;
               new app.pctrinc(remoteHandle, context).execute( AV16EmprCod, AV68Pgmname, AV7UsurCod, AV6Station, AV48Texto_i, 99999999, (byte)(0), "@") ;
            }
            if ( AV29Informe == 1 )
            {
               AV48Texto_i = httpContext.getMessage( "ATENCION. Informamos que con Fecha ", "") + localUtil.dtoc( AV18FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " ,ya se hizo un INVENTARIO.", "") + GXutil.newLine( ) ;
               AV48Texto_i += httpContext.getMessage( "SI confirma el INVENTARIO, se eliminara la informacion con Fecha ", "") + localUtil.dtoc( AV18FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( ",dentro del intervalo seleccionado.", "") + GXutil.newLine( ) ;
               AV48Texto_i += httpContext.getMessage( "->Se confirmo el INVENTARIO", "") + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( AV16EmprCod, AV68Pgmname, AV7UsurCod, AV6Station, AV48Texto_i, 99999999, (byte)(0), "@") ;
            }
            AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Eliminación Tablas INVPRD, RECALM, INVALM...", ""));
            AV40ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Eliminación/depuración ", "") );
            AV40ProgressIndicator.setgxTv_SdtProgress_Value( 80 );
            GXv_char11[0] = AV16EmprCod ;
            GXv_char4[0] = AV36PProduc ;
            GXv_char3[0] = AV51UProd2 ;
            GXv_int8[0] = AV37PProv ;
            GXv_int12[0] = AV54UProv2 ;
            GXv_int6[0] = AV24FlagStk ;
            new app.pinvprdd(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3, GXv_int8, GXv_int12, GXv_int6) ;
            controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
            controlrecuento_wp_impl.this.AV36PProduc = GXv_char4[0] ;
            controlrecuento_wp_impl.this.AV51UProd2 = GXv_char3[0] ;
            controlrecuento_wp_impl.this.AV37PProv = GXv_int8[0] ;
            controlrecuento_wp_impl.this.AV54UProv2 = GXv_int12[0] ;
            controlrecuento_wp_impl.this.AV24FlagStk = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV36PProduc", AV36PProduc);
            httpContext.ajax_rsp_assign_attri("", false, "AV51UProd2", AV51UProd2);
            httpContext.ajax_rsp_assign_attri("", false, "AV37PProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37PProv), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV24FlagStk", GXutil.str( AV24FlagStk, 1, 0));
            AV48Texto_i = httpContext.getMessage( "WRecuen.Inicio.Actualizo tablas RECUEN,INVPRD", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV36PProduc + "-" + AV51UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV37PProv, 6, 0) + "-" + GXutil.str( AV54UProv2, 6, 0) ;
            new app.pctrinc(remoteHandle, context).execute( AV16EmprCod, AV68Pgmname, AV7UsurCod, AV6Station, AV48Texto_i, 99999999, (byte)(0), "@") ;
            AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Actualizando Tablas de Inventario:INVPRD, RECALM, INVALM...", ""));
            AV40ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Actualizando de Inventario ", "") );
            AV40ProgressIndicator.setgxTv_SdtProgress_Value( 90 );
            GXv_char11[0] = AV16EmprCod ;
            GXv_char4[0] = AV36PProduc ;
            GXv_char3[0] = AV51UProd2 ;
            GXv_int12[0] = AV37PProv ;
            GXv_int8[0] = AV54UProv2 ;
            GXv_int6[0] = AV24FlagStk ;
            GXv_date13[0] = AV18FecRec ;
            GXv_dtime14[0] = AV43Recfechr ;
            new app.precuen(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3, GXv_int12, GXv_int8, GXv_int6, GXv_date13, GXv_dtime14) ;
            controlrecuento_wp_impl.this.AV16EmprCod = GXv_char11[0] ;
            controlrecuento_wp_impl.this.AV36PProduc = GXv_char4[0] ;
            controlrecuento_wp_impl.this.AV51UProd2 = GXv_char3[0] ;
            controlrecuento_wp_impl.this.AV37PProv = GXv_int12[0] ;
            controlrecuento_wp_impl.this.AV54UProv2 = GXv_int8[0] ;
            controlrecuento_wp_impl.this.AV24FlagStk = GXv_int6[0] ;
            controlrecuento_wp_impl.this.AV18FecRec = GXv_date13[0] ;
            controlrecuento_wp_impl.this.AV43Recfechr = GXv_dtime14[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV36PProduc", AV36PProduc);
            httpContext.ajax_rsp_assign_attri("", false, "AV51UProd2", AV51UProd2);
            httpContext.ajax_rsp_assign_attri("", false, "AV37PProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37PProv), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV24FlagStk", GXutil.str( AV24FlagStk, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV18FecRec", localUtil.format(AV18FecRec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV43Recfechr", localUtil.ttoc( AV43Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV48Texto_i = httpContext.getMessage( "WRecuen.Fin.Actualizo tablas RECUEN,INVPRD", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV36PProduc + "-" + AV51UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV37PProv, 6, 0) + "-" + GXutil.str( AV54UProv2, 6, 0) ;
            new app.pctrinc(remoteHandle, context).execute( AV16EmprCod, AV68Pgmname, AV7UsurCod, AV6Station, AV48Texto_i, 99999999, (byte)(0), "@") ;
            AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
            AV40ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Proceso finalizado ", "") );
            AV40ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
            AV40ProgressIndicator.hide();
            if ( AV32Order == 1 )
            {
               httpContext.popup(formatLink("app.rst0019", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36PProduc)),GXutil.URLEncode(GXutil.rtrim(AV51UProd2)),GXutil.URLEncode(GXutil.ltrimstr(AV37PProv,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV54UProv2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV55ValAct)),GXutil.URLEncode(GXutil.ltrimstr(AV24FlagStk,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV18FecRec))}, new String[] {"EmprCod","PProduc","UProd2","PProv","UProv2","ValAct","Flag","Recfec"}) , new Object[] {"AV16EmprCod","AV36PProduc","AV51UProd2","AV37PProv","AV54UProv2","AV55ValAct","AV24FlagStk","AV18FecRec"});
            }
            else if ( AV32Order == 2 )
            {
               httpContext.popup(formatLink("app.rst0019n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36PProduc)),GXutil.URLEncode(GXutil.rtrim(AV51UProd2)),GXutil.URLEncode(GXutil.ltrimstr(AV37PProv,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV54UProv2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV55ValAct)),GXutil.URLEncode(GXutil.ltrimstr(AV24FlagStk,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV18FecRec))}, new String[] {"EmprCod","PProduc","UProd2","PProv","UProv2","ValAct","Flag","recfec"}) , new Object[] {"AV16EmprCod","AV36PProduc","AV51UProd2","AV37PProv","AV54UProv2","AV55ValAct","AV24FlagStk","AV18FecRec"});
            }
            else if ( AV32Order == 3 )
            {
               httpContext.popup(formatLink("app.rst0019u", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36PProduc)),GXutil.URLEncode(GXutil.rtrim(AV51UProd2)),GXutil.URLEncode(GXutil.ltrimstr(AV37PProv,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV54UProv2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV55ValAct)),GXutil.URLEncode(GXutil.ltrimstr(AV24FlagStk,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV18FecRec))}, new String[] {"EmprCod","PProduc","UProd2","PProv","UProv2","ValAct","Flag","RECFEC"}) , new Object[] {"AV16EmprCod","AV36PProduc","AV51UProd2","AV37PProv","AV54UProv2","AV55ValAct","AV24FlagStk","AV18FecRec"});
            }
            else
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden indicado no corresponde.", ""));
            }
         }
      }
   }

   public void S112( )
   {
      /* 'LASTRECUEN' Routine */
      returnInSub = false ;
      AV42Recfec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Recfec", localUtil.format(AV42Recfec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV42Recfec));
      /* Using cursor H01SM7 */
      pr_default.execute(5, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = H01SM7_A396EmprCod[0] ;
         A810RecFec = H01SM7_A810RecFec[0] ;
         AV42Recfec = A810RecFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Recfec", localUtil.format(AV42Recfec, "99/99/99"));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV42Recfec));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV29Informe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Informe", GXutil.str( AV29Informe, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Informe), "9")));
      /* Using cursor H01SM8 */
      pr_default.execute(6, new Object[] {AV16EmprCod, AV18FecRec});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13416RecEstInv = H01SM8_A13416RecEstInv[0] ;
         A810RecFec = H01SM8_A810RecFec[0] ;
         A396EmprCod = H01SM8_A396EmprCod[0] ;
         AV29Informe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Informe", GXutil.str( AV29Informe, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Informe), "9")));
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void nextLoad( )
   {
   }

   protected void e171SM2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_117_1SM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableresultados_modal_Internalname, tblTableresultados_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucResultados_modal.setProperty("Width", Resultados_modal_Width);
         ucResultados_modal.setProperty("Title", Resultados_modal_Title);
         ucResultados_modal.setProperty("ConfirmType", Resultados_modal_Confirmtype);
         ucResultados_modal.setProperty("BodyType", Resultados_modal_Bodytype);
         ucResultados_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Resultados_modal_Internalname, "RESULTADOS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"RESULTADOS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_117_1SM2e( true) ;
      }
      else
      {
         wb_table1_117_1SM2e( false) ;
      }
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
      pa1SM2( ) ;
      ws1SM2( ) ;
      we1SM2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714194032", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/controlrecuento_wp.js", "?202681714194032", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      chkavValact.setInternalname( "vVALACT" );
      cmbavFlagstk.setInternalname( "vFLAGSTK" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockcombo_pproduc_Internalname = "TEXTBLOCKCOMBO_PPRODUC" ;
      Combo_pproduc_Internalname = "COMBO_PPRODUC" ;
      divTablesplittedpproduc_Internalname = "TABLESPLITTEDPPRODUC" ;
      lblTextblockcombo_uproduc_Internalname = "TEXTBLOCKCOMBO_UPRODUC" ;
      Combo_uproduc_Internalname = "COMBO_UPRODUC" ;
      divTablesplitteduproduc_Internalname = "TABLESPLITTEDUPRODUC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockcombo_pprov_Internalname = "TEXTBLOCKCOMBO_PPROV" ;
      Combo_pprov_Internalname = "COMBO_PPROV" ;
      divTablesplittedpprov_Internalname = "TABLESPLITTEDPPROV" ;
      lblTextblockcombo_uprov_Internalname = "TEXTBLOCKCOMBO_UPROV" ;
      Combo_uprov_Internalname = "COMBO_UPROV" ;
      divTablesplitteduprov_Internalname = "TABLESPLITTEDUPROV" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      cmbavOrder.setInternalname( "vORDER" );
      edtavRecfechr_Internalname = "vRECFECHR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      Dvpanel_table_acciones_Internalname = "DVPANEL_TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Advertencia_Internalname = "ADVERTENCIA" ;
      divTableusercontrol_Internalname = "TABLEUSERCONTROL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPproduc_Internalname = "vPPRODUC" ;
      edtavUproduc_Internalname = "vUPRODUC" ;
      edtavPprov_Internalname = "vPPROV" ;
      edtavUprov_Internalname = "vUPROV" ;
      Resultados_modal_Internalname = "RESULTADOS_MODAL" ;
      tblTableresultados_modal_Internalname = "TABLERESULTADOS_MODAL" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
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
      edtavUprov_Jsonclick = "" ;
      edtavUprov_Visible = 1 ;
      edtavPprov_Jsonclick = "" ;
      edtavPprov_Visible = 1 ;
      edtavUproduc_Jsonclick = "" ;
      edtavUproduc_Visible = 1 ;
      edtavPproduc_Jsonclick = "" ;
      edtavPproduc_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavRecfechr_Jsonclick = "" ;
      edtavRecfechr_Enabled = 1 ;
      cmbavOrder.setJsonclick( "" );
      cmbavOrder.setEnabled( 1 );
      cmbavFlagstk.setJsonclick( "" );
      cmbavFlagstk.setEnabled( 1 );
      chkavValact.setEnabled( 1 );
      Resultados_modal_Bodytype = "WebComponent" ;
      Resultados_modal_Confirmtype = "" ;
      Resultados_modal_Title = httpContext.getMessage( "Control Recuento (Password)", "") ;
      Resultados_modal_Width = "1000" ;
      Advertencia_Texttype = "2" ;
      Advertencia_Yesbuttonposition = "left" ;
      Advertencia_Nobuttoncaption = "No" ;
      Advertencia_Yesbuttoncaption = "Sí" ;
      Advertencia_Confirmationtext = "Confirmar" ;
      Advertencia_Title = httpContext.getMessage( "ADVERTENCIA", "") ;
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
      Dvpanel_table_acciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_table_acciones_Iconposition = "Right" ;
      Dvpanel_table_acciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_table_acciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_table_acciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_table_acciones_Title = "" ;
      Dvpanel_table_acciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_table_acciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_table_acciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_table_acciones_Width = "100%" ;
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
      Combo_uprov_Emptyitemtext = "Todos" ;
      Combo_uprov_Cls = "ExtendedCombo AttributeFL" ;
      Combo_pprov_Emptyitemtext = "Todos" ;
      Combo_pprov_Cls = "ExtendedCombo AttributeFL" ;
      Combo_uproduc_Emptyitemtext = "Todos" ;
      Combo_uproduc_Cls = "ExtendedCombo AttributeFL" ;
      Combo_pproduc_Emptyitemtext = "Todos" ;
      Combo_pproduc_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Control Recuento (Inventario)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavValact.setName( "vVALACT" );
      chkavValact.setWebtags( "" );
      chkavValact.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavValact.getInternalname(), "TitleCaption", chkavValact.getCaption(), true);
      chkavValact.setCheckedValue( "N" );
      AV55ValAct = ((GXutil.strcmp(GXutil.rtrim( AV55ValAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55ValAct", AV55ValAct);
      cmbavFlagstk.setName( "vFLAGSTK" );
      cmbavFlagstk.setWebtags( "" );
      cmbavFlagstk.addItem("0", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavFlagstk.addItem("1", httpContext.getMessage( "Con Stock", ""), (short)(0));
      if ( cmbavFlagstk.getItemCount() > 0 )
      {
         AV24FlagStk = (byte)(GXutil.lval( cmbavFlagstk.getValidValue(GXutil.trim( GXutil.str( AV24FlagStk, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24FlagStk", GXutil.str( AV24FlagStk, 1, 0));
      }
      cmbavOrder.setName( "vORDER" );
      cmbavOrder.setWebtags( "" );
      cmbavOrder.addItem("1", httpContext.getMessage( "Codigo", ""), (short)(0));
      cmbavOrder.addItem("2", httpContext.getMessage( "Descripcion", ""), (short)(0));
      cmbavOrder.addItem("3", httpContext.getMessage( "Ubicacion", ""), (short)(0));
      if ( cmbavOrder.getItemCount() > 0 )
      {
         AV32Order = (byte)(GXutil.lval( cmbavOrder.getValidValue(GXutil.trim( GXutil.str( AV32Order, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Order", GXutil.str( AV32Order, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV55ValAct',fld:'vVALACT',pic:'@!'},{av:'AV47Texto',fld:'vTEXTO',pic:'',hsh:true},{av:'AV42Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV22FlagM',fld:'vFLAGM',pic:'9',hsh:true},{av:'AV45SiAuditoria',fld:'vSIAUDITORIA',pic:'9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29Informe',fld:'vINFORME',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e111SM1',iparms:[]");
      setEventMetadata("'DORESULTADOS'",",oparms:[]}");
      setEventMetadata("RESULTADOS_MODAL.CLOSE","{handler:'e141SM2',iparms:[{av:'Resultados_modal_Result',ctrl:'RESULTADOS_MODAL',prop:'Result'},{av:'AV47Texto',fld:'vTEXTO',pic:'',hsh:true}]");
      setEventMetadata("RESULTADOS_MODAL.CLOSE",",oparms:[{av:'Advertencia_Title',ctrl:'ADVERTENCIA',prop:'Title'},{av:'Advertencia_Confirmationtext',ctrl:'ADVERTENCIA',prop:'ConfirmationText'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e161SM2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_PPRODUC.ONOPTIONCLICKED","{handler:'e121SM2',iparms:[{av:'Combo_pproduc_Selectedvalue_get',ctrl:'COMBO_PPRODUC',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_PPRODUC.ONOPTIONCLICKED",",oparms:[{av:'AV36PProduc',fld:'vPPRODUC',pic:''}]}");
      setEventMetadata("ADVERTENCIA.CLOSE","{handler:'e131SM2',iparms:[{av:'Advertencia_Result',ctrl:'ADVERTENCIA',prop:'Result'},{av:'AV52UProduc',fld:'vUPRODUC',pic:''},{av:'AV53UProv',fld:'vUPROV',pic:'ZZZZZ9'},{av:'AV18FecRec',fld:'vFECREC',pic:''},{av:'AV42Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV22FlagM',fld:'vFLAGM',pic:'9',hsh:true},{av:'AV45SiAuditoria',fld:'vSIAUDITORIA',pic:'9',hsh:true},{av:'AV36PProduc',fld:'vPPRODUC',pic:''},{av:'AV37PProv',fld:'vPPROV',pic:'ZZZZZ9'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV44Siacumular',fld:'vSIACUMULAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'AV29Informe',fld:'vINFORME',pic:'9',hsh:true},{av:'cmbavFlagstk'},{av:'AV24FlagStk',fld:'vFLAGSTK',pic:'9'},{av:'AV43Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'cmbavOrder'},{av:'AV32Order',fld:'vORDER',pic:'9'},{av:'AV55ValAct',fld:'vVALACT',pic:'@!'}]");
      setEventMetadata("ADVERTENCIA.CLOSE",",oparms:[{av:'AV51UProd2',fld:'vUPROD2',pic:''},{av:'AV36PProduc',fld:'vPPRODUC',pic:''},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44Siacumular',fld:'vSIACUMULAR',pic:''},{av:'cmbavFlagstk'},{av:'AV24FlagStk',fld:'vFLAGSTK',pic:'9'},{av:'AV37PProv',fld:'vPPROV',pic:'ZZZZZ9'},{av:'AV43Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV18FecRec',fld:'vFECREC',pic:''},{av:'AV55ValAct',fld:'vVALACT',pic:'@!'}]}");
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
      Resultados_modal_Result = "" ;
      Combo_uprov_Selectedvalue_get = "" ;
      Combo_pprov_Selectedvalue_get = "" ;
      Combo_uproduc_Selectedvalue_get = "" ;
      Combo_pproduc_Selectedvalue_get = "" ;
      Advertencia_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV47Texto = "" ;
      AV42Recfec = GXutil.nullDate() ;
      AV7UsurCod = "" ;
      AV6Station = "" ;
      GXKey = "" ;
      AV64PProduc_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV65UProduc_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV61PProv_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV63UProv_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18FecRec = GXutil.nullDate() ;
      AV16EmprCod = "" ;
      AV44Siacumular = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      Combo_pproduc_Selectedvalue_set = "" ;
      Combo_uproduc_Selectedvalue_set = "" ;
      Combo_pprov_Selectedvalue_set = "" ;
      Combo_uprov_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV55ValAct = "" ;
      lblTextblockcombo_pproduc_Jsonclick = "" ;
      ucCombo_pproduc = new com.genexus.webpanels.GXUserControl();
      Combo_pproduc_Caption = "" ;
      lblTextblockcombo_uproduc_Jsonclick = "" ;
      ucCombo_uproduc = new com.genexus.webpanels.GXUserControl();
      Combo_uproduc_Caption = "" ;
      lblTextblockcombo_pprov_Jsonclick = "" ;
      ucCombo_pprov = new com.genexus.webpanels.GXUserControl();
      Combo_pprov_Caption = "" ;
      lblTextblockcombo_uprov_Jsonclick = "" ;
      ucCombo_uprov = new com.genexus.webpanels.GXUserControl();
      Combo_uprov_Caption = "" ;
      AV43Recfechr = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_table_acciones = new com.genexus.webpanels.GXUserControl();
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucAdvertencia = new com.genexus.webpanels.GXUserControl();
      AV68Pgmname = "" ;
      AV36PProduc = "" ;
      AV52UProduc = "" ;
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV5EmprNom = "" ;
      AV9ContDsc2 = "" ;
      AV57Version = "" ;
      AV33PasswordContexto = "" ;
      AV58WebSession = httpContext.getWebSession();
      Gx_msg = "" ;
      AV49TextoVers = "" ;
      AV56VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV25HhMm = "" ;
      AV26HhMmchar = "" ;
      scmdbuf = "" ;
      H01SM2_A396EmprCod = new String[] {""} ;
      H01SM2_A14216PrvAct = new String[] {""} ;
      H01SM2_A13719PrvNNom = new String[] {""} ;
      H01SM2_A795PrvNum = new int[1] ;
      H01SM2_A794PrvNom = new String[] {""} ;
      H01SM2_n794PrvNom = new boolean[] {false} ;
      A14216PrvAct = "" ;
      A13719PrvNNom = "" ;
      A794PrvNom = "" ;
      AV62Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01SM3_A396EmprCod = new String[] {""} ;
      H01SM3_A14216PrvAct = new String[] {""} ;
      H01SM3_A13719PrvNNom = new String[] {""} ;
      H01SM3_A795PrvNum = new int[1] ;
      H01SM3_A794PrvNom = new String[] {""} ;
      H01SM3_n794PrvNom = new boolean[] {false} ;
      H01SM4_A396EmprCod = new String[] {""} ;
      H01SM4_A856ValCod = new byte[1] ;
      H01SM4_A13747PrdCDsc = new String[] {""} ;
      H01SM4_A719PrdNum = new String[] {""} ;
      H01SM4_A718PrdNom = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A718PrdNom = "" ;
      H01SM5_A396EmprCod = new String[] {""} ;
      H01SM5_A856ValCod = new byte[1] ;
      H01SM5_A13747PrdCDsc = new String[] {""} ;
      H01SM5_A719PrdNum = new String[] {""} ;
      H01SM5_A718PrdNom = new String[] {""} ;
      AV40ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV51UProd2 = "" ;
      AV48Texto_i = "" ;
      AV8ActDatos = "" ;
      AV19File = "" ;
      AV46Tab_upq = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV46Tab_upq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      H01SM6_A856ValCod = new byte[1] ;
      H01SM6_A719PrdNum = new String[] {""} ;
      H01SM6_A396EmprCod = new String[] {""} ;
      AV39Prdnum = "" ;
      AV14Dif = DecimalUtil.ZERO ;
      AV15Dif2 = DecimalUtil.ZERO ;
      AV30Obs = "" ;
      AV38Prdnom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char11 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      H01SM7_A719PrdNum = new String[] {""} ;
      H01SM7_A396EmprCod = new String[] {""} ;
      H01SM7_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A810RecFec = GXutil.nullDate() ;
      H01SM8_A719PrdNum = new String[] {""} ;
      H01SM8_A13416RecEstInv = new byte[1] ;
      H01SM8_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01SM8_A396EmprCod = new String[] {""} ;
      sStyleString = "" ;
      ucResultados_modal = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.controlrecuento_wp__default(),
         new Object[] {
             new Object[] {
            H01SM2_A396EmprCod, H01SM2_A14216PrvAct, H01SM2_A13719PrvNNom, H01SM2_A795PrvNum, H01SM2_A794PrvNom, H01SM2_n794PrvNom
            }
            , new Object[] {
            H01SM3_A396EmprCod, H01SM3_A14216PrvAct, H01SM3_A13719PrvNNom, H01SM3_A795PrvNum, H01SM3_A794PrvNom, H01SM3_n794PrvNom
            }
            , new Object[] {
            H01SM4_A396EmprCod, H01SM4_A856ValCod, H01SM4_A13747PrdCDsc, H01SM4_A719PrdNum, H01SM4_A718PrdNom
            }
            , new Object[] {
            H01SM5_A396EmprCod, H01SM5_A856ValCod, H01SM5_A13747PrdCDsc, H01SM5_A719PrdNum, H01SM5_A718PrdNom
            }
            , new Object[] {
            H01SM6_A856ValCod, H01SM6_A719PrdNum, H01SM6_A396EmprCod
            }
            , new Object[] {
            H01SM7_A719PrdNum, H01SM7_A396EmprCod, H01SM7_A810RecFec
            }
            , new Object[] {
            H01SM8_A719PrdNum, H01SM8_A13416RecEstInv, H01SM8_A810RecFec, H01SM8_A396EmprCod
            }
         }
      );
      AV68Pgmname = "StocksQuimicos.ControlRecuento_WP" ;
      /* GeneXus formulas. */
      AV68Pgmname = "StocksQuimicos.ControlRecuento_WP" ;
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV22FlagM ;
   private byte AV45SiAuditoria ;
   private byte AV29Informe ;
   private byte A856ValCod ;
   private byte AV24FlagStk ;
   private byte AV32Order ;
   private byte nDonePA ;
   private byte AV13DelRec ;
   private byte AV28Infec ;
   private byte AV50tintutex ;
   private byte AV12Cotexsur ;
   private byte AV17ExiCont ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A13416RecEstInv ;
   private byte nGXWrapped ;
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
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavRecfechr_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPproduc_Visible ;
   private int edtavUproduc_Visible ;
   private int AV37PProv ;
   private int edtavPprov_Visible ;
   private int AV53UProv ;
   private int edtavUprov_Visible ;
   private int AV10ContrasenaValidar ;
   private int GXt_int7 ;
   private int A795PrvNum ;
   private int AV54UProv2 ;
   private int GX_I ;
   private int AV27i ;
   private int GXv_int12[] ;
   private int GXv_int8[] ;
   private int idxLst ;
   private java.math.BigDecimal AV14Dif ;
   private java.math.BigDecimal AV15Dif2 ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String Resultados_modal_Result ;
   private String Combo_uprov_Selectedvalue_get ;
   private String Combo_pprov_Selectedvalue_get ;
   private String Combo_uproduc_Selectedvalue_get ;
   private String Combo_pproduc_Selectedvalue_get ;
   private String Advertencia_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV7UsurCod ;
   private String AV6Station ;
   private String GXKey ;
   private String AV16EmprCod ;
   private String AV44Siacumular ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Combo_pproduc_Cls ;
   private String Combo_pproduc_Selectedvalue_set ;
   private String Combo_pproduc_Emptyitemtext ;
   private String Combo_uproduc_Cls ;
   private String Combo_uproduc_Selectedvalue_set ;
   private String Combo_uproduc_Emptyitemtext ;
   private String Combo_pprov_Cls ;
   private String Combo_pprov_Selectedvalue_set ;
   private String Combo_pprov_Emptyitemtext ;
   private String Combo_uprov_Cls ;
   private String Combo_uprov_Selectedvalue_set ;
   private String Combo_uprov_Emptyitemtext ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_table_acciones_Width ;
   private String Dvpanel_table_acciones_Cls ;
   private String Dvpanel_table_acciones_Title ;
   private String Dvpanel_table_acciones_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Advertencia_Title ;
   private String Advertencia_Confirmationtext ;
   private String Advertencia_Yesbuttoncaption ;
   private String Advertencia_Nobuttoncaption ;
   private String Advertencia_Yesbuttonposition ;
   private String Advertencia_Texttype ;
   private String Resultados_modal_Width ;
   private String Resultados_modal_Title ;
   private String Resultados_modal_Confirmtype ;
   private String Resultados_modal_Bodytype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String AV55ValAct ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedpproduc_Internalname ;
   private String lblTextblockcombo_pproduc_Internalname ;
   private String lblTextblockcombo_pproduc_Jsonclick ;
   private String Combo_pproduc_Caption ;
   private String Combo_pproduc_Internalname ;
   private String divTablesplitteduproduc_Internalname ;
   private String lblTextblockcombo_uproduc_Internalname ;
   private String lblTextblockcombo_uproduc_Jsonclick ;
   private String Combo_uproduc_Caption ;
   private String Combo_uproduc_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedpprov_Internalname ;
   private String lblTextblockcombo_pprov_Internalname ;
   private String lblTextblockcombo_pprov_Jsonclick ;
   private String Combo_pprov_Caption ;
   private String Combo_pprov_Internalname ;
   private String divTablesplitteduprov_Internalname ;
   private String lblTextblockcombo_uprov_Internalname ;
   private String lblTextblockcombo_uprov_Jsonclick ;
   private String Combo_uprov_Caption ;
   private String Combo_uprov_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavRecfechr_Internalname ;
   private String edtavRecfechr_Jsonclick ;
   private String Dvpanel_table_acciones_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String Progressbar_Internalname ;
   private String divTableusercontrol_Internalname ;
   private String Advertencia_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV68Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPproduc_Internalname ;
   private String AV36PProduc ;
   private String edtavPproduc_Jsonclick ;
   private String edtavUproduc_Internalname ;
   private String AV52UProduc ;
   private String edtavUproduc_Jsonclick ;
   private String edtavPprov_Internalname ;
   private String edtavPprov_Jsonclick ;
   private String edtavUprov_Internalname ;
   private String edtavUprov_Jsonclick ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV5EmprNom ;
   private String AV9ContDsc2 ;
   private String AV57Version ;
   private String Gx_msg ;
   private String AV49TextoVers ;
   private String AV25HhMm ;
   private String AV26HhMmchar ;
   private String scmdbuf ;
   private String A14216PrvAct ;
   private String A794PrvNom ;
   private String A718PrdNom ;
   private String AV51UProd2 ;
   private String AV8ActDatos ;
   private String AV46Tab_upq[] ;
   private String AV39Prdnum ;
   private String AV30Obs ;
   private String AV38Prdnom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblTableresultados_modal_Internalname ;
   private String Resultados_modal_Internalname ;
   private java.util.Date AV43Recfechr ;
   private java.util.Date AV56VarAux0 ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date AV42Recfec ;
   private java.util.Date AV18FecRec ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date A810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_table_acciones_Autowidth ;
   private boolean Dvpanel_table_acciones_Autoheight ;
   private boolean Dvpanel_table_acciones_Collapsible ;
   private boolean Dvpanel_table_acciones_Collapsed ;
   private boolean Dvpanel_table_acciones_Showcollapseicon ;
   private boolean Dvpanel_table_acciones_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private String AV48Texto_i ;
   private String AV47Texto ;
   private String AV33PasswordContexto ;
   private String A13719PrvNNom ;
   private String A13747PrdCDsc ;
   private String AV19File ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_pproduc ;
   private com.genexus.webpanels.GXUserControl ucCombo_uproduc ;
   private com.genexus.webpanels.GXUserControl ucCombo_pprov ;
   private com.genexus.webpanels.GXUserControl ucCombo_uprov ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_table_acciones ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucAdvertencia ;
   private com.genexus.webpanels.GXUserControl ucResultados_modal ;
   private ICheckbox chkavValact ;
   private HTMLChoice cmbavFlagstk ;
   private HTMLChoice cmbavOrder ;
   private IDataStoreProvider pr_default ;
   private String[] H01SM2_A396EmprCod ;
   private String[] H01SM2_A14216PrvAct ;
   private String[] H01SM2_A13719PrvNNom ;
   private int[] H01SM2_A795PrvNum ;
   private String[] H01SM2_A794PrvNom ;
   private boolean[] H01SM2_n794PrvNom ;
   private String[] H01SM3_A396EmprCod ;
   private String[] H01SM3_A14216PrvAct ;
   private String[] H01SM3_A13719PrvNNom ;
   private int[] H01SM3_A795PrvNum ;
   private String[] H01SM3_A794PrvNom ;
   private boolean[] H01SM3_n794PrvNom ;
   private String[] H01SM4_A396EmprCod ;
   private byte[] H01SM4_A856ValCod ;
   private String[] H01SM4_A13747PrdCDsc ;
   private String[] H01SM4_A719PrdNum ;
   private String[] H01SM4_A718PrdNom ;
   private String[] H01SM5_A396EmprCod ;
   private byte[] H01SM5_A856ValCod ;
   private String[] H01SM5_A13747PrdCDsc ;
   private String[] H01SM5_A719PrdNum ;
   private String[] H01SM5_A718PrdNom ;
   private byte[] H01SM6_A856ValCod ;
   private String[] H01SM6_A719PrdNum ;
   private String[] H01SM6_A396EmprCod ;
   private String[] H01SM7_A719PrdNum ;
   private String[] H01SM7_A396EmprCod ;
   private java.util.Date[] H01SM7_A810RecFec ;
   private String[] H01SM8_A719PrdNum ;
   private byte[] H01SM8_A13416RecEstInv ;
   private java.util.Date[] H01SM8_A810RecFec ;
   private String[] H01SM8_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV58WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV64PProduc_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV65UProduc_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV61PProv_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV63UProv_Data ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV40ProgressIndicator ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV62Combo_DataItem ;
}

final  class controlrecuento_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01SM2", "SELECT EmprCod, PrvAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, PrvNum, PrvNom FROM TXPPRVGEN WHERE PrvAct = 'S' ORDER BY PrvNNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SM3", "SELECT EmprCod, PrvAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, PrvNum, PrvNom FROM TXPPRVGEN WHERE PrvAct = 'S' ORDER BY PrvNNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SM4", "SELECT EmprCod, ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom FROM TXPPRODUC WHERE ValCod <= 2 ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SM5", "SELECT EmprCod, ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom FROM TXPPRODUC WHERE ValCod <= 2 ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SM6", "SELECT ValCod, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) AND (ValCod <= 2) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SM7", "SELECT * FROM (SELECT PrdNum, EmprCod, RecFec FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01SM8", "SELECT PrdNum, RecEstInv, RecFec, EmprCod FROM TXPRECUEN WHERE (EmprCod = ? and RecFec = ?) AND (RecEstInv = 1) ORDER BY EmprCod, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

