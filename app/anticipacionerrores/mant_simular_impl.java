package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mant_simular_impl extends GXDataArea
{
   public mant_simular_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mant_simular_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_simular_impl.class ));
   }

   public mant_simular_impl( int remoteHandle ,
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
      pa2DP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2DP2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mant_simular", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDUPTIPMAQCOD", getSecureSignedToken( "", AV24DupTipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANT_ERRORESSDTCOLLECTION", getSecureSignedToken( "", AV39MAnt_ErroresSDTCollection));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MAnt_Simular");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant_simular:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV16CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV16CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTCOD_DATA", AV10ArtCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTCOD_DATA", AV10ArtCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLOR_DATA", AV20Color_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLOR_DATA", AV20Color_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPMAQCOD_DATA", AV50TipMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPMAQCOD_DATA", AV50TipMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPMAQCOD", AV49TipMaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPMAQCOD", AV49TipMaqCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vAYER", localUtil.dtoc( AV13Ayer, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTMFIL", AV48sdtMFil);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTMFIL", AV48sdtMFil);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDUPTIPMAQCOD", AV24DupTipMaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDUPTIPMAQCOD", AV24DupTipMaqCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDUPTIPMAQCOD", getSecureSignedToken( "", AV24DupTipMaqCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANT_ERRORESSDTCOLLECTION", AV39MAnt_ErroresSDTCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANT_ERRORESSDTCOLLECTION", AV39MAnt_ErroresSDTCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANT_ERRORESSDTCOLLECTION", getSecureSignedToken( "", AV39MAnt_ErroresSDTCollection));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALORRECIBIDOVARIABLE", AV58ValorRecibidoVariable);
      app.GxWebStd.gx_hidden_field( httpContext, "vVARIABLE", AV59Variable);
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Dropdownoptionstype", GXutil.rtrim( Combo_clicod_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Cls", GXutil.rtrim( Combo_artcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Selectedvalue_set", GXutil.rtrim( Combo_artcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Dropdownoptionstype", GXutil.rtrim( Combo_artcod_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Emptyitem", GXutil.booltostr( Combo_artcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COLOR_Cls", GXutil.rtrim( Combo_color_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COLOR_Selectedvalue_set", GXutil.rtrim( Combo_color_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COLOR_Dropdownoptionstype", GXutil.rtrim( Combo_color_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COLOR_Emptyitem", GXutil.booltostr( Combo_color_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Cls", GXutil.rtrim( Combo_tipmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Allowmultipleselection", GXutil.booltostr( Combo_tipmaqcod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_tipmaqcod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Emptyitem", GXutil.booltostr( Combo_tipmaqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Multiplevaluestype", GXutil.rtrim( Combo_tipmaqcod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABSCONTENT_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabscontent_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABSCONTENT_Class", GXutil.rtrim( Gxuitabspanel_tabscontent_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABSCONTENT_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabscontent_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Width", GXutil.rtrim( Dvpanel_pdatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Autowidth", GXutil.booltostr( Dvpanel_pdatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Autoheight", GXutil.booltostr( Dvpanel_pdatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Cls", GXutil.rtrim( Dvpanel_pdatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Title", GXutil.rtrim( Dvpanel_pdatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Collapsible", GXutil.booltostr( Dvpanel_pdatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Collapsed", GXutil.booltostr( Dvpanel_pdatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_pdatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Iconposition", GXutil.rtrim( Dvpanel_pdatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PDATOS_Autoscroll", GXutil.booltostr( Dvpanel_pdatos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Width", GXutil.rtrim( Dvpanel_pfiltros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Autowidth", GXutil.booltostr( Dvpanel_pfiltros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Autoheight", GXutil.booltostr( Dvpanel_pfiltros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Cls", GXutil.rtrim( Dvpanel_pfiltros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Title", GXutil.rtrim( Dvpanel_pfiltros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Collapsible", GXutil.booltostr( Dvpanel_pfiltros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Collapsed", GXutil.booltostr( Dvpanel_pfiltros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_pfiltros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Iconposition", GXutil.rtrim( Dvpanel_pfiltros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PFILTROS_Autoscroll", GXutil.booltostr( Dvpanel_pfiltros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_tipmaqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COLOR_Selectedvalue_get", GXutil.rtrim( Combo_color_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Selectedvalue_get", GXutil.rtrim( Combo_artcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_get", GXutil.rtrim( Combo_clicod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Selectedvalue_get", GXutil.rtrim( Combo_artcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_get", GXutil.rtrim( Combo_clicod_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcmant_filtrado == null ) )
      {
         WebComp_Wcmant_filtrado.componentjscripts();
      }
      if ( ! ( WebComp_Wcmant_defecto == null ) )
      {
         WebComp_Wcmant_defecto.componentjscripts();
      }
      if ( ! ( WebComp_Wcmant_detalle == null ) )
      {
         WebComp_Wcmant_detalle.componentjscripts();
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
         we2DP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2DP2( ) ;
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
      return formatLink("app.anticipacionerrores.mant_simular", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AnticipacionErrores.MAnt_Simular" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAnt_Simular", "") ;
   }

   public void wb2DP0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 select", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_pfiltros.setProperty("Width", Dvpanel_pfiltros_Width);
         ucDvpanel_pfiltros.setProperty("AutoWidth", Dvpanel_pfiltros_Autowidth);
         ucDvpanel_pfiltros.setProperty("AutoHeight", Dvpanel_pfiltros_Autoheight);
         ucDvpanel_pfiltros.setProperty("Cls", Dvpanel_pfiltros_Cls);
         ucDvpanel_pfiltros.setProperty("Title", Dvpanel_pfiltros_Title);
         ucDvpanel_pfiltros.setProperty("Collapsible", Dvpanel_pfiltros_Collapsible);
         ucDvpanel_pfiltros.setProperty("Collapsed", Dvpanel_pfiltros_Collapsed);
         ucDvpanel_pfiltros.setProperty("ShowCollapseIcon", Dvpanel_pfiltros_Showcollapseicon);
         ucDvpanel_pfiltros.setProperty("IconPosition", Dvpanel_pfiltros_Iconposition);
         ucDvpanel_pfiltros.setProperty("AutoScroll", Dvpanel_pfiltros_Autoscroll);
         ucDvpanel_pfiltros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pfiltros_Internalname, "DVPANEL_PFILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PFILTROSContainer"+"PFiltros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPfiltros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefiltros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockcombo_clicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
         ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
         ucCombo_clicod.setProperty("DropDownOptionsType", Combo_clicod_Dropdownoptionstype);
         ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
         ucCombo_clicod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucCombo_clicod.setProperty("DropDownOptionsData", AV16CliCod_Data);
         ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-5 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedartcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_artcod_Internalname, httpContext.getMessage( "Artículo", ""), "", "", lblTextblockcombo_artcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_artcod.setProperty("Caption", Combo_artcod_Caption);
         ucCombo_artcod.setProperty("Cls", Combo_artcod_Cls);
         ucCombo_artcod.setProperty("DropDownOptionsType", Combo_artcod_Dropdownoptionstype);
         ucCombo_artcod.setProperty("EmptyItem", Combo_artcod_Emptyitem);
         ucCombo_artcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucCombo_artcod.setProperty("DropDownOptionsData", AV10ArtCod_Data);
         ucCombo_artcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_artcod_Internalname, "COMBO_ARTCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcolor_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_color_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblockcombo_color_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_color.setProperty("Caption", Combo_color_Caption);
         ucCombo_color.setProperty("Cls", Combo_color_Cls);
         ucCombo_color.setProperty("DropDownOptionsType", Combo_color_Dropdownoptionstype);
         ucCombo_color.setProperty("EmptyItem", Combo_color_Emptyitem);
         ucCombo_color.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucCombo_color.setProperty("DropDownOptionsData", AV20Color_Data);
         ucCombo_color.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_color_Internalname, "COMBO_COLORContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipmaqcod_Internalname, httpContext.getMessage( "Tipo de Máquina", ""), "", "", lblTextblockcombo_tipmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipmaqcod.setProperty("Caption", Combo_tipmaqcod_Caption);
         ucCombo_tipmaqcod.setProperty("Cls", Combo_tipmaqcod_Cls);
         ucCombo_tipmaqcod.setProperty("AllowMultipleSelection", Combo_tipmaqcod_Allowmultipleselection);
         ucCombo_tipmaqcod.setProperty("IncludeOnlySelectedOption", Combo_tipmaqcod_Includeonlyselectedoption);
         ucCombo_tipmaqcod.setProperty("EmptyItem", Combo_tipmaqcod_Emptyitem);
         ucCombo_tipmaqcod.setProperty("MultipleValuesType", Combo_tipmaqcod_Multiplevaluestype);
         ucCombo_tipmaqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucCombo_tipmaqcod.setProperty("DropDownOptionsData", AV50TipMaqCod_Data);
         ucCombo_tipmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipmaqcod_Internalname, "COMBO_TIPMAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefiltrofecha_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechainicio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechainicio_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeDateLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechainicio_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechainicio_Internalname, localUtil.format(AV28FechaInicio, "99/99/99"), localUtil.format( AV28FechaInicio, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechainicio_Jsonclick, 0, "AttributeDate", "", "", "", "", 1, edtavFechainicio_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechainicio_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechainicio_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechafin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechafin_Internalname, httpContext.getMessage( "hasta", ""), " AttributeDateLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechafin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechafin_Internalname, localUtil.format(AV27FechaFin, "99/99/99"), localUtil.format( AV27FechaFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechafin_Jsonclick, 0, "AttributeDate", "", "", "", "", 1, edtavFechafin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechafin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechafin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 CellMarginTop30", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 100, "%", 0, "px", "", "left", "top", " "+"data-gx-smarttable"+" ", "grid-template-columns:33fr 33fr 34fr;grid-template-rows:auto;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop30", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblActualizar_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fas fa-search fa-3x\"></i>", ""), "", "", lblActualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOACTUALIZAR\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Actualizar resultados...", ""), 1, lblActualizar_Enabled, 1, (short)(1), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedsection1_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop30", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBorrar_Internalname, httpContext.getMessage( "<i class=\"fa fa-eraser fa fa-eraser  fa-3x\"></i>", ""), "", "", lblBorrar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOBORRAR\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Borrar filtros...", ""), 1, 1, 0, (short)(1), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarraprogreso.render(context, "gxprogressindicator", Barraprogreso_Internalname, "BARRAPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginLeft CellMarginBottom", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_pdatos.setProperty("Width", Dvpanel_pdatos_Width);
         ucDvpanel_pdatos.setProperty("AutoWidth", Dvpanel_pdatos_Autowidth);
         ucDvpanel_pdatos.setProperty("AutoHeight", Dvpanel_pdatos_Autoheight);
         ucDvpanel_pdatos.setProperty("Cls", Dvpanel_pdatos_Cls);
         ucDvpanel_pdatos.setProperty("Title", Dvpanel_pdatos_Title);
         ucDvpanel_pdatos.setProperty("Collapsible", Dvpanel_pdatos_Collapsible);
         ucDvpanel_pdatos.setProperty("Collapsed", Dvpanel_pdatos_Collapsed);
         ucDvpanel_pdatos.setProperty("ShowCollapseIcon", Dvpanel_pdatos_Showcollapseicon);
         ucDvpanel_pdatos.setProperty("IconPosition", Dvpanel_pdatos_Iconposition);
         ucDvpanel_pdatos.setProperty("AutoScroll", Dvpanel_pdatos_Autoscroll);
         ucDvpanel_pdatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pdatos_Internalname, "DVPANEL_PDATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PDATOSContainer"+"PDatos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPdatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabscontent.setProperty("PageCount", Gxuitabspanel_tabscontent_Pagecount);
         ucGxuitabspanel_tabscontent.setProperty("Class", Gxuitabspanel_tabscontent_Class);
         ucGxuitabspanel_tabscontent.setProperty("HistoryManagement", Gxuitabspanel_tabscontent_Historymanagement);
         ucGxuitabspanel_tabscontent.render(context, "tab", Gxuitabspanel_tabscontent_Internalname, "GXUITABSPANEL_TABSCONTENTContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSCONTENTContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabgeneral_title_Internalname, httpContext.getMessage( "General", ""), "", "", lblTabgeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabGeneral") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSCONTENTContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegeneral_Internalname, divTablegeneral_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0088"+"", GXutil.rtrim( WebComp_Wcmant_filtrado_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0088"+""+"\""+((WebComp_Wcmant_filtrado_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcmant_filtrado_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcmant_filtrado), GXutil.lower( WebComp_Wcmant_filtrado_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0088"+"");
               }
               WebComp_Wcmant_filtrado.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcmant_filtrado), GXutil.lower( WebComp_Wcmant_filtrado_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSCONTENTContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabdefectos_title_Internalname, httpContext.getMessage( "Defectos", ""), "", "", lblTabdefectos_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabDefectos") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSCONTENTContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledefectos_Internalname, divTabledefectos_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0096"+"", GXutil.rtrim( WebComp_Wcmant_defecto_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0096"+""+"\""+((WebComp_Wcmant_defecto_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcmant_defecto_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcmant_defecto), GXutil.lower( WebComp_Wcmant_defecto_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0096"+"");
               }
               WebComp_Wcmant_defecto.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcmant_defecto), GXutil.lower( WebComp_Wcmant_defecto_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSCONTENTContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabdetalle_title_Internalname, httpContext.getMessage( "Detalle", ""), "", "", lblTabdetalle_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabDetalle") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSCONTENTContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledetalle_Internalname, divTabledetalle_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0104"+"", GXutil.rtrim( WebComp_Wcmant_detalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0104"+""+"\""+((WebComp_Wcmant_detalle_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcmant_detalle_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcmant_detalle), GXutil.lower( WebComp_Wcmant_detalle_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0104"+"");
               }
               WebComp_Wcmant_detalle.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcmant_detalle), GXutil.lower( WebComp_Wcmant_detalle_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Simular.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV9ArtCod), GXutil.rtrim( localUtil.format( AV9ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavArtcod_Visible, 1, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColor_Internalname, GXutil.rtrim( AV19Color), GXutil.rtrim( localUtil.format( AV19Color, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColor_Jsonclick, 0, "Attribute", "", "", "", "", edtavColor_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2DP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAnt_Simular", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2DP0( ) ;
   }

   public void ws2DP2( )
   {
      start2DP2( ) ;
      evt2DP2( ) ;
   }

   public void evt2DP2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_ARTCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e132DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoActualizar' */
                           e142DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBORRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBorrar' */
                           e152DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESHGRID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e172DP2 ();
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
                     if ( nCmpId == 88 )
                     {
                        OldWcmant_filtrado = httpContext.cgiGet( "W0088") ;
                        if ( ( GXutil.len( OldWcmant_filtrado) == 0 ) || ( GXutil.strcmp(OldWcmant_filtrado, WebComp_Wcmant_filtrado_Component) != 0 ) )
                        {
                           WebComp_Wcmant_filtrado = WebUtils.getWebComponent(getClass(), "app." + OldWcmant_filtrado + "_impl", remoteHandle, context);
                           WebComp_Wcmant_filtrado_Component = OldWcmant_filtrado ;
                        }
                        if ( GXutil.len( WebComp_Wcmant_filtrado_Component) != 0 )
                        {
                           WebComp_Wcmant_filtrado.componentprocess("W0088", "", sEvt);
                        }
                        WebComp_Wcmant_filtrado_Component = OldWcmant_filtrado ;
                     }
                     else if ( nCmpId == 96 )
                     {
                        OldWcmant_defecto = httpContext.cgiGet( "W0096") ;
                        if ( ( GXutil.len( OldWcmant_defecto) == 0 ) || ( GXutil.strcmp(OldWcmant_defecto, WebComp_Wcmant_defecto_Component) != 0 ) )
                        {
                           WebComp_Wcmant_defecto = WebUtils.getWebComponent(getClass(), "app." + OldWcmant_defecto + "_impl", remoteHandle, context);
                           WebComp_Wcmant_defecto_Component = OldWcmant_defecto ;
                        }
                        if ( GXutil.len( WebComp_Wcmant_defecto_Component) != 0 )
                        {
                           WebComp_Wcmant_defecto.componentprocess("W0096", "", sEvt);
                        }
                        WebComp_Wcmant_defecto_Component = OldWcmant_defecto ;
                     }
                     else if ( nCmpId == 104 )
                     {
                        OldWcmant_detalle = httpContext.cgiGet( "W0104") ;
                        if ( ( GXutil.len( OldWcmant_detalle) == 0 ) || ( GXutil.strcmp(OldWcmant_detalle, WebComp_Wcmant_detalle_Component) != 0 ) )
                        {
                           WebComp_Wcmant_detalle = WebUtils.getWebComponent(getClass(), "app." + OldWcmant_detalle + "_impl", remoteHandle, context);
                           WebComp_Wcmant_detalle_Component = OldWcmant_detalle ;
                        }
                        if ( GXutil.len( WebComp_Wcmant_detalle_Component) != 0 )
                        {
                           WebComp_Wcmant_detalle.componentprocess("W0104", "", sEvt);
                        }
                        WebComp_Wcmant_detalle_Component = OldWcmant_detalle ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2DP2( )
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

   public void pa2DP2( )
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
            GX_FocusControl = edtavFechainicio_Internalname ;
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
      rf2DP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "AnticipacionErrores.MAnt_Simular" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcmant_filtrado_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcmant_filtrado_Component) != 0 )
            {
               WebComp_Wcmant_filtrado.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcmant_defecto_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcmant_defecto_Component) != 0 )
            {
               WebComp_Wcmant_defecto.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcmant_detalle_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcmant_detalle_Component) != 0 )
            {
               WebComp_Wcmant_detalle.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e172DP2 ();
         wb2DP0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2DP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDUPTIPMAQCOD", AV24DupTipMaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDUPTIPMAQCOD", AV24DupTipMaqCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDUPTIPMAQCOD", getSecureSignedToken( "", AV24DupTipMaqCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANT_ERRORESSDTCOLLECTION", AV39MAnt_ErroresSDTCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANT_ERRORESSDTCOLLECTION", AV39MAnt_ErroresSDTCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANT_ERRORESSDTCOLLECTION", getSecureSignedToken( "", AV39MAnt_ErroresSDTCollection));
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "AnticipacionErrores.MAnt_Simular" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132DP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV16CliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vARTCOD_DATA"), AV10ArtCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLOR_DATA"), AV20Color_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPMAQCOD_DATA"), AV50TipMaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPMAQCOD"), AV49TipMaqCod);
         /* Read saved values. */
         Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
         Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
         Combo_clicod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLICOD_Dropdownoptionstype") ;
         Combo_clicod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Emptyitem")) ;
         Combo_artcod_Cls = httpContext.cgiGet( "COMBO_ARTCOD_Cls") ;
         Combo_artcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_ARTCOD_Selectedvalue_set") ;
         Combo_artcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ARTCOD_Dropdownoptionstype") ;
         Combo_artcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Emptyitem")) ;
         Combo_color_Cls = httpContext.cgiGet( "COMBO_COLOR_Cls") ;
         Combo_color_Selectedvalue_set = httpContext.cgiGet( "COMBO_COLOR_Selectedvalue_set") ;
         Combo_color_Dropdownoptionstype = httpContext.cgiGet( "COMBO_COLOR_Dropdownoptionstype") ;
         Combo_color_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_COLOR_Emptyitem")) ;
         Combo_tipmaqcod_Cls = httpContext.cgiGet( "COMBO_TIPMAQCOD_Cls") ;
         Combo_tipmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPMAQCOD_Selectedvalue_set") ;
         Combo_tipmaqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Allowmultipleselection")) ;
         Combo_tipmaqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Includeonlyselectedoption")) ;
         Combo_tipmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Emptyitem")) ;
         Combo_tipmaqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TIPMAQCOD_Multiplevaluestype") ;
         Gxuitabspanel_tabscontent_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABSCONTENT_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabscontent_Class = httpContext.cgiGet( "GXUITABSPANEL_TABSCONTENT_Class") ;
         Gxuitabspanel_tabscontent_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABSCONTENT_Historymanagement")) ;
         Dvpanel_pdatos_Width = httpContext.cgiGet( "DVPANEL_PDATOS_Width") ;
         Dvpanel_pdatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PDATOS_Autowidth")) ;
         Dvpanel_pdatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PDATOS_Autoheight")) ;
         Dvpanel_pdatos_Cls = httpContext.cgiGet( "DVPANEL_PDATOS_Cls") ;
         Dvpanel_pdatos_Title = httpContext.cgiGet( "DVPANEL_PDATOS_Title") ;
         Dvpanel_pdatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PDATOS_Collapsible")) ;
         Dvpanel_pdatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PDATOS_Collapsed")) ;
         Dvpanel_pdatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PDATOS_Showcollapseicon")) ;
         Dvpanel_pdatos_Iconposition = httpContext.cgiGet( "DVPANEL_PDATOS_Iconposition") ;
         Dvpanel_pdatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PDATOS_Autoscroll")) ;
         Dvpanel_pfiltros_Width = httpContext.cgiGet( "DVPANEL_PFILTROS_Width") ;
         Dvpanel_pfiltros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PFILTROS_Autowidth")) ;
         Dvpanel_pfiltros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PFILTROS_Autoheight")) ;
         Dvpanel_pfiltros_Cls = httpContext.cgiGet( "DVPANEL_PFILTROS_Cls") ;
         Dvpanel_pfiltros_Title = httpContext.cgiGet( "DVPANEL_PFILTROS_Title") ;
         Dvpanel_pfiltros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PFILTROS_Collapsible")) ;
         Dvpanel_pfiltros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PFILTROS_Collapsed")) ;
         Dvpanel_pfiltros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PFILTROS_Showcollapseicon")) ;
         Dvpanel_pfiltros_Iconposition = httpContext.cgiGet( "DVPANEL_PFILTROS_Iconposition") ;
         Dvpanel_pfiltros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PFILTROS_Autoscroll")) ;
         Combo_artcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_ARTCOD_Selectedvalue_get") ;
         Combo_clicod_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechainicio_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAINICIO");
            GX_FocusControl = edtavFechainicio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28FechaInicio = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28FechaInicio", localUtil.format(AV28FechaInicio, "99/99/99"));
         }
         else
         {
            AV28FechaInicio = localUtil.ctod( httpContext.cgiGet( edtavFechainicio_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28FechaInicio", localUtil.format(AV28FechaInicio, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechafin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAFIN");
            GX_FocusControl = edtavFechafin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27FechaFin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27FechaFin", localUtil.format(AV27FechaFin, "99/99/99"));
         }
         else
         {
            AV27FechaFin = localUtil.ctod( httpContext.cgiGet( edtavFechafin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27FechaFin", localUtil.format(AV27FechaFin, "99/99/99"));
         }
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0));
         }
         else
         {
            AV15CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0));
         }
         AV9ArtCod = httpContext.cgiGet( edtavArtcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
         AV19Color = httpContext.cgiGet( edtavColor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Color", AV19Color);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MAnt_Simular");
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("anticipacionerrores\\mant_simular:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e132DP2 ();
      if (returnInSub) return;
   }

   public void e132DP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV25EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.vxparam_acaemp(remoteHandle, context).execute( GXv_char2) ;
      mant_simular_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      if ( (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se encontró el parametro ACAEMP en parametros de GAIA", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "El parametro ACAEMP es %1", ""), AV25EmprCod, "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      }
      AV47ProgressIndicator.hide();
      if ( 1 == 0 )
      {
         GXt_char1 = AV62Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         mant_simular_impl.this.GXt_char1 = GXv_char2[0] ;
         AV62Station = GXt_char1 ;
         GXv_char2[0] = AV25EmprCod ;
         GXv_char3[0] = AV63EmprNom ;
         GXv_char4[0] = AV64UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char2, GXv_char3, GXv_char4) ;
         mant_simular_impl.this.AV25EmprCod = GXv_char2[0] ;
         mant_simular_impl.this.AV63EmprNom = GXv_char3[0] ;
         mant_simular_impl.this.AV64UsurCod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV23DDO_TitleSettingsIcons;
         GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
         new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
         AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
         edtavColor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavColor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColor_Visible), 5, 0), true);
         edtavArtcod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Visible), 5, 0), true);
         edtavClicod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
         /* Execute user subroutine: 'LOADCOMBOCLICOD' */
         S112 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOARTCOD' */
         S122 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOCOLOR' */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOTIPMAQCOD' */
         S142 ();
         if (returnInSub) return;
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcmant_detalle = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmant_detalle_Component), GXutil.lower( "AnticipacionErrores.MAnt_Detalle")) != 0 )
         {
            WebComp_Wcmant_detalle = WebUtils.getWebComponent(getClass(), "app.anticipacionerrores.mant_detalle_impl", remoteHandle, context);
            WebComp_Wcmant_detalle_Component = "AnticipacionErrores.MAnt_Detalle" ;
         }
         if ( GXutil.len( WebComp_Wcmant_detalle_Component) != 0 )
         {
            WebComp_Wcmant_detalle.setjustcreated();
            WebComp_Wcmant_detalle.componentprepare(new Object[] {"W0104","",AV25EmprCod,Integer.valueOf(AV15CliCod),AV9ArtCod,Integer.valueOf(AV5ForColNum),AV8TipMaqCodJSON,AV28FechaInicio,AV27FechaFin});
            WebComp_Wcmant_detalle.componentbind(new Object[] {"","vCLICOD","vARTCOD","","","vFECHAINICIO","vFECHAFIN"});
         }
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcmant_defecto = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmant_defecto_Component), GXutil.lower( "AnticipacionErrores.MAnt_Defecto")) != 0 )
         {
            WebComp_Wcmant_defecto = WebUtils.getWebComponent(getClass(), "app.anticipacionerrores.mant_defecto_impl", remoteHandle, context);
            WebComp_Wcmant_defecto_Component = "AnticipacionErrores.MAnt_Defecto" ;
         }
         if ( GXutil.len( WebComp_Wcmant_defecto_Component) != 0 )
         {
            WebComp_Wcmant_defecto.setjustcreated();
            WebComp_Wcmant_defecto.componentprepare(new Object[] {"W0096","",AV25EmprCod,Integer.valueOf(AV15CliCod),AV9ArtCod,Integer.valueOf(AV5ForColNum),AV8TipMaqCodJSON,AV28FechaInicio,AV27FechaFin,AV41MaqCod,AV45MTknUsu,AV44MTkn});
            WebComp_Wcmant_defecto.componentbind(new Object[] {"","vCLICOD","vARTCOD","","","vFECHAINICIO","vFECHAFIN","","",""});
         }
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcmant_filtrado = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmant_filtrado_Component), GXutil.lower( "AnticipacionErrores.MAnt_Filtrado")) != 0 )
         {
            WebComp_Wcmant_filtrado = WebUtils.getWebComponent(getClass(), "app.anticipacionerrores.mant_filtrado_impl", remoteHandle, context);
            WebComp_Wcmant_filtrado_Component = "AnticipacionErrores.MAnt_Filtrado" ;
         }
         if ( GXutil.len( WebComp_Wcmant_filtrado_Component) != 0 )
         {
            WebComp_Wcmant_filtrado.setjustcreated();
            WebComp_Wcmant_filtrado.componentprepare(new Object[] {"W0088","",AV25EmprCod,Integer.valueOf(AV15CliCod),AV9ArtCod,Integer.valueOf(AV5ForColNum),AV8TipMaqCodJSON,AV28FechaInicio,AV27FechaFin});
            WebComp_Wcmant_filtrado.componentbind(new Object[] {"","vCLICOD","vARTCOD","","","vFECHAINICIO","vFECHAFIN"});
         }
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      AV13Ayer = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Ayer", localUtil.format(AV13Ayer, "99/99/99"));
      AV27FechaFin = AV13Ayer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FechaFin", localUtil.format(AV27FechaFin, "99/99/99"));
      AV28FechaInicio = GXutil.addyr( AV27FechaFin, (short)(-1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28FechaInicio", localUtil.format(AV28FechaInicio, "99/99/99"));
      WebComp_Wcmant_filtrado_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0088"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_filtrado_Visible), 5, 0), true);
      WebComp_Wcmant_defecto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0096"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_defecto_Visible), 5, 0), true);
      WebComp_Wcmant_detalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0104"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_detalle_Visible), 5, 0), true);
      edtavColor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColor_Visible), 5, 0), true);
      edtavArtcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Visible), 5, 0), true);
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPMAQCOD' */
      S142 ();
      if (returnInSub) return;
   }

   public void e142DP2( )
   {
      /* 'DoActualizar' Routine */
      returnInSub = false ;
      lblActualizar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblActualizar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblActualizar_Enabled), 5, 0), true);
      AV8TipMaqCodJSON = AV49TipMaqCod.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8TipMaqCodJSON", AV8TipMaqCodJSON);
      WebComp_Wcmant_filtrado_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0088"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_filtrado_Visible), 5, 0), true);
      WebComp_Wcmant_defecto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0096"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_defecto_Visible), 5, 0), true);
      WebComp_Wcmant_detalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0104"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_detalle_Visible), 5, 0), true);
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabledefectos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabledefectos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledefectos_Visible), 5, 0), true);
      divTabledetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Validando con: Cliente=%1, Articulo=%2, Color=%3, TipoMaquinas=%4, Fechas:%5-%6.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0), AV9ArtCod, AV19Color, AV8TipMaqCodJSON, localUtil.dtoc( AV28FechaInicio, 0, "-"), localUtil.dtoc( AV27FechaFin, 0, "-"), "", "", ""), AV67Pgmname) ;
      if ( (0==AV15CliCod) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar cliente", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = Combo_clicod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar Articulo", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = Combo_artcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( (GXutil.strcmp("", AV19Color)==0) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar Color: %1.", ""), AV19Color, "", "", "", "", "", "", "", ""));
         GX_FocusControl = Combo_color_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28FechaInicio)) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar Fecha Inicio", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = edtavFechainicio_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27FechaFin)) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar Fecha Fin", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = edtavFechafin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.resetTime(AV27FechaFin).after( GXutil.resetTime( AV13Ayer )) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "La fecha fin, su valor maximo, será el dia de ayer %2, se tiene:%1", ""), localUtil.dtoc( AV27FechaFin, 0, "-"), localUtil.dtoc( AV13Ayer, 0, "-"), "", "", "", "", "", "", ""));
         GX_FocusControl = edtavFechafin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.resetTime(AV27FechaFin).before( GXutil.resetTime( AV28FechaInicio )) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "La fecha fin %1, es inferior a la fecha de inicio %2", ""), localUtil.dtoc( AV27FechaFin, 0, "-"), localUtil.dtoc( AV28FechaInicio, 0, "-"), "", "", "", "", "", "", ""));
         GX_FocusControl = edtavFechafin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV5ForColNum = (int)(GXutil.lval( AV19Color)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ForColNum), 6, 0));
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Actualizar con: Cliente=%1, Articulo=%2, Color=%3, TipoMaquinas=%4, Fechas:%5-%6.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0), AV9ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ForColNum), 6, 0), AV8TipMaqCodJSON, localUtil.dtoc( AV28FechaInicio, 0, "-"), localUtil.dtoc( AV27FechaFin, 0, "-"), "", "", ""), AV67Pgmname) ;
         AV52Titulo = GXutil.format( httpContext.getMessage( "Consulta para cliente:%1, Articulo:%2, &Color:%3, fechas:%4-%5, Tipo Maquina:%6", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0), AV9ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ForColNum), 6, 0), localUtil.dtoc( AV28FechaInicio, 0, "-"), localUtil.dtoc( AV27FechaFin, 0, "-"), AV49TipMaqCod.toJSonString(false), "", "", "") ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 15, true, (byte)(1)) ;
         AV48sdtMFil.setgxTv_SdtsdtMFil_Mfilobj( GXutil.trim( AV67Pgmname) );
         AV48sdtMFil.setgxTv_SdtsdtMFil_Mfilfec01( AV28FechaInicio );
         AV48sdtMFil.setgxTv_SdtsdtMFil_Mfilfec02( AV27FechaFin );
         AV48sdtMFil.setgxTv_SdtsdtMFil_Mfilnum01( AV15CliCod );
         AV48sdtMFil.setgxTv_SdtsdtMFil_Mfiltxt( AV9ArtCod );
         AV48sdtMFil.setgxTv_SdtsdtMFil_Mfilnum02( AV5ForColNum );
         GXt_boolean7 = AV26ExisteFiltro ;
         GXv_char4[0] = AV45MTknUsu ;
         GXv_char3[0] = AV44MTkn ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new app.anticipacionerrores.crearfiltro(remoteHandle, context).execute( AV48sdtMFil, GXv_char4, GXv_char3, GXv_boolean8) ;
         mant_simular_impl.this.AV45MTknUsu = GXv_char4[0] ;
         mant_simular_impl.this.AV44MTkn = GXv_char3[0] ;
         mant_simular_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45MTknUsu", AV45MTknUsu);
         httpContext.ajax_rsp_assign_attri("", false, "AV44MTkn", AV44MTkn);
         AV26ExisteFiltro = GXt_boolean7 ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 40, true, (byte)(1)) ;
         WebComp_Wcmant_filtrado_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0088"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_filtrado_Visible), 5, 0), true);
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcmant_filtrado = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmant_filtrado_Component), GXutil.lower( "AnticipacionErrores.MAnt_Filtrado")) != 0 )
         {
            WebComp_Wcmant_filtrado = WebUtils.getWebComponent(getClass(), "app.anticipacionerrores.mant_filtrado_impl", remoteHandle, context);
            WebComp_Wcmant_filtrado_Component = "AnticipacionErrores.MAnt_Filtrado" ;
         }
         if ( GXutil.len( WebComp_Wcmant_filtrado_Component) != 0 )
         {
            WebComp_Wcmant_filtrado.setjustcreated();
            WebComp_Wcmant_filtrado.componentprepare(new Object[] {"W0088","",AV25EmprCod,Integer.valueOf(AV15CliCod),AV9ArtCod,Integer.valueOf(AV5ForColNum),AV8TipMaqCodJSON,AV28FechaInicio,AV27FechaFin});
            WebComp_Wcmant_filtrado.componentbind(new Object[] {"","vCLICOD","vARTCOD","","","vFECHAINICIO","vFECHAFIN"});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmant_filtrado )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0088"+"");
            WebComp_Wcmant_filtrado.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "llamando al Defecto con clicod=%1, ArtCod=%2, ForColNum=%3, TipoMaquina=%4, Fechas:%5-%6. &EmprCod:%7.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0), AV9ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ForColNum), 6, 0), AV8TipMaqCodJSON, localUtil.dtoc( AV28FechaInicio, 0, "-"), localUtil.dtoc( AV27FechaFin, 0, "-"), AV25EmprCod, "", ""), AV67Pgmname) ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 60, true, (byte)(1)) ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 100, false, (byte)(1)) ;
         WebComp_Wcmant_defecto_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0096"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_defecto_Visible), 5, 0), true);
         WebComp_Wcmant_detalle_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0104"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_detalle_Visible), 5, 0), true);
         divTablegeneral_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
         divTabledefectos_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabledefectos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledefectos_Visible), 5, 0), true);
         divTabledetalle_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
         this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSCONTENTContainer", "SelectTab", "", new Object[] {Integer.valueOf(1)});
      }
      lblActualizar_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblActualizar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblActualizar_Enabled), 5, 0), true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48sdtMFil", AV48sdtMFil);
   }

   public void e152DP2( )
   {
      /* 'DoBorrar' Routine */
      returnInSub = false ;
      AV15CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0));
      AV9ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
      AV19Color = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Color", AV19Color);
      AV49TipMaqCod = AV24DupTipMaqCod ;
      AV13Ayer = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Ayer", localUtil.format(AV13Ayer, "99/99/99"));
      AV27FechaFin = AV13Ayer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FechaFin", localUtil.format(AV27FechaFin, "99/99/99"));
      AV28FechaInicio = GXutil.addyr( AV27FechaFin, (short)(-1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28FechaInicio", localUtil.format(AV28FechaInicio, "99/99/99"));
      Combo_clicod_Selectedvalue_set = ((0==AV15CliCod) ? "" : GXutil.trim( GXutil.str( AV15CliCod, 6, 0))) ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      Combo_artcod_Selectedvalue_set = AV9ArtCod ;
      ucCombo_artcod.sendProperty(context, "", false, Combo_artcod_Internalname, "SelectedValue_set", Combo_artcod_Selectedvalue_set);
      Combo_color_Selectedvalue_set = ((GXutil.strcmp("", AV19Color)==0) ? "" : GXutil.trim( AV19Color)) ;
      ucCombo_color.sendProperty(context, "", false, Combo_color_Internalname, "SelectedValue_set", Combo_color_Selectedvalue_set);
      Combo_tipmaqcod_Selectedvalue_set = AV49TipMaqCod.toJSonString(false) ;
      ucCombo_tipmaqcod.sendProperty(context, "", false, Combo_tipmaqcod_Internalname, "SelectedValue_set", Combo_tipmaqcod_Selectedvalue_set);
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSCONTENTContainer", "SelectTab", "", new Object[] {Integer.valueOf(1)});
      GX_FocusControl = Combo_clicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabledefectos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabledefectos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledefectos_Visible), 5, 0), true);
      divTabledetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49TipMaqCod", AV49TipMaqCod);
   }

   public void e122DP2( )
   {
      /* Combo_artcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV9ArtCod = Combo_artcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
      AV19Color = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Color", AV19Color);
      Combo_color_Selectedvalue_set = ((GXutil.strcmp("", AV19Color)==0) ? "" : GXutil.trim( AV19Color)) ;
      ucCombo_color.sendProperty(context, "", false, Combo_color_Internalname, "SelectedValue_set", Combo_color_Selectedvalue_set);
      /* Execute user subroutine: 'LOADCOMBOCOLOR' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20Color_Data", AV20Color_Data);
   }

   public void e112DP2( )
   {
      /* Combo_clicod_Onoptionclicked Routine */
      returnInSub = false ;
      AV15CliCod = (int)(GXutil.lval( Combo_clicod_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Combo_CliCod.SelectedValue_get=%1.", ""), Combo_clicod_Selectedvalue_get, "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      AV9ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
      AV19Color = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Color", AV19Color);
      Combo_artcod_Selectedvalue_set = AV9ArtCod ;
      ucCombo_artcod.sendProperty(context, "", false, Combo_artcod_Internalname, "SelectedValue_set", Combo_artcod_Selectedvalue_set);
      Combo_color_Selectedvalue_set = ((GXutil.strcmp("", AV19Color)==0) ? "" : GXutil.trim( AV19Color)) ;
      ucCombo_color.sendProperty(context, "", false, Combo_color_Internalname, "SelectedValue_set", Combo_color_Selectedvalue_set);
      /* Execute user subroutine: 'LOADCOMBOARTCOD' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10ArtCod_Data", AV10ArtCod_Data);
   }

   public void S142( )
   {
      /* 'LOADCOMBOTIPMAQCOD' Routine */
      returnInSub = false ;
      AV50TipMaqCod_Data.clear();
      /* Using cursor H02DP2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1011TipMaqCod = H02DP2_A1011TipMaqCod[0] ;
         A1012TipMaqDsc = H02DP2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = H02DP2_n1012TipMaqDsc[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A1011TipMaqCod );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A1012TipMaqDsc), A1011TipMaqCod, "", "", "", "", "", "", "") );
         AV50TipMaqCod_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV50TipMaqCod_Data.sort("Title");
      Combo_tipmaqcod_Selectedvalue_set = AV49TipMaqCod.toJSonString(false) ;
      ucCombo_tipmaqcod.sendProperty(context, "", false, Combo_tipmaqcod_Internalname, "SelectedValue_set", Combo_tipmaqcod_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCOLOR' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Color para cliente %1-%2 y articulo=%2", ""), AV25EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0), AV9ArtCod, "", "", "", "", "", ""), AV67Pgmname) ;
      if ( ! ( (0==AV15CliCod) || (GXutil.strcmp("", AV9ArtCod)==0) ) )
      {
         GXt_objcol_SdtMAnt_ErroresClienteArticuloColorSDT9 = AV35MAnt_ErroresClienteArticuloColorSDTCollection ;
         GXv_objcol_SdtMAnt_ErroresClienteArticuloColorSDT10[0] = GXt_objcol_SdtMAnt_ErroresClienteArticuloColorSDT9 ;
         new app.anticipacionerrores.mant_erroresclientearticulocolordp(remoteHandle, context).execute( AV39MAnt_ErroresSDTCollection, AV25EmprCod, AV15CliCod, AV9ArtCod, GXv_objcol_SdtMAnt_ErroresClienteArticuloColorSDT10) ;
         GXt_objcol_SdtMAnt_ErroresClienteArticuloColorSDT9 = GXv_objcol_SdtMAnt_ErroresClienteArticuloColorSDT10[0] ;
         AV35MAnt_ErroresClienteArticuloColorSDTCollection = GXt_objcol_SdtMAnt_ErroresClienteArticuloColorSDT9 ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Color =%1.", ""), AV35MAnt_ErroresClienteArticuloColorSDTCollection.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
         AV20Color_Data.clear();
         AV69GXV1 = 1 ;
         while ( AV69GXV1 <= AV35MAnt_ErroresClienteArticuloColorSDTCollection.size() )
         {
            AV34MAnt_ErroresClienteArticuloColorSDT = (app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT)((app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT)AV35MAnt_ErroresClienteArticuloColorSDTCollection.elementAt(-1+AV69GXV1));
            AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( AV34MAnt_ErroresClienteArticuloColorSDT.getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum(), 6, 0) );
            AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( AV34MAnt_ErroresClienteArticuloColorSDT.getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum(), 6, 0)), GXutil.trim( AV34MAnt_ErroresClienteArticuloColorSDT.getgxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom()), "", "", "", "", "", "", "") );
            AV20Color_Data.add(AV21Combo_DataItem, 0);
            AV69GXV1 = (int)(AV69GXV1+1) ;
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "cargado combo Color: %1", ""), AV20Color_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
         AV20Color_Data.sort("Title");
         Combo_color_Selectedvalue_set = AV19Color ;
         ucCombo_color.sendProperty(context, "", false, Combo_color_Internalname, "SelectedValue_set", Combo_color_Selectedvalue_set);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Cargado combo color:%1.", ""), AV20Color_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente por seleccionar el Articulo", ""), "", "", "", "", "", "", "", "", ""));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOARTCOD' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Articulos para clientes=%1.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      if ( ! (0==AV15CliCod) )
      {
         GXt_objcol_SdtMAnt_ErroresClienteArticuloSDT11 = AV37MAnt_ErroresClienteArticuloSDTCollection ;
         GXv_objcol_SdtMAnt_ErroresClienteArticuloSDT12[0] = GXt_objcol_SdtMAnt_ErroresClienteArticuloSDT11 ;
         new app.anticipacionerrores.mant_erroresclientearticulodp(remoteHandle, context).execute( AV39MAnt_ErroresSDTCollection, AV25EmprCod, AV15CliCod, GXv_objcol_SdtMAnt_ErroresClienteArticuloSDT12) ;
         GXt_objcol_SdtMAnt_ErroresClienteArticuloSDT11 = GXv_objcol_SdtMAnt_ErroresClienteArticuloSDT12[0] ;
         AV37MAnt_ErroresClienteArticuloSDTCollection = GXt_objcol_SdtMAnt_ErroresClienteArticuloSDT11 ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Cliente=%1, Articulos =%2.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod), 6, 0), AV37MAnt_ErroresClienteArticuloSDTCollection.toJSonString(false), "", "", "", "", "", "", ""), AV67Pgmname) ;
         AV10ArtCod_Data.clear();
         AV70GXV2 = 1 ;
         while ( AV70GXV2 <= AV37MAnt_ErroresClienteArticuloSDTCollection.size() )
         {
            AV36MAnt_ErroresClienteArticuloSDT = (app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT)((app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT)AV37MAnt_ErroresClienteArticuloSDTCollection.elementAt(-1+AV70GXV2));
            AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( AV36MAnt_ErroresClienteArticuloSDT.getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod() );
            AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( AV36MAnt_ErroresClienteArticuloSDT.getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartcod()), GXutil.trim( AV36MAnt_ErroresClienteArticuloSDT.getgxTv_SdtMAnt_ErroresClienteArticuloSDT_Mantartdsc()), "", "", "", "", "", "", "") );
            AV10ArtCod_Data.add(AV21Combo_DataItem, 0);
            AV70GXV2 = (int)(AV70GXV2+1) ;
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "cargado combo Articulo: %1", ""), AV10ArtCod_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
         AV10ArtCod_Data.sort("Title");
         Combo_artcod_Selectedvalue_set = AV9ArtCod ;
         ucCombo_artcod.sendProperty(context, "", false, Combo_artcod_Internalname, "SelectedValue_set", Combo_artcod_Selectedvalue_set);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Cargado combo articulo:%1.", ""), AV10ArtCod_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      }
      else
      {
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtMAnt_ErroresClienteSDT13 = AV38MAnt_ErroresClienteSDTCollection ;
      GXv_objcol_SdtMAnt_ErroresClienteSDT14[0] = GXt_objcol_SdtMAnt_ErroresClienteSDT13 ;
      new app.anticipacionerrores.mant_erroresclientedp(remoteHandle, context).execute( AV25EmprCod, GXv_objcol_SdtMAnt_ErroresClienteSDT14) ;
      GXt_objcol_SdtMAnt_ErroresClienteSDT13 = GXv_objcol_SdtMAnt_ErroresClienteSDT14[0] ;
      AV38MAnt_ErroresClienteSDTCollection = GXt_objcol_SdtMAnt_ErroresClienteSDT13 ;
      AV16CliCod_Data.clear();
      AV71GXV3 = 1 ;
      while ( AV71GXV3 <= AV38MAnt_ErroresClienteSDTCollection.size() )
      {
         AV6MAnt_ErroresClienteSDT = (app.anticipacionerrores.SdtMAnt_ErroresClienteSDT)((app.anticipacionerrores.SdtMAnt_ErroresClienteSDT)AV38MAnt_ErroresClienteSDTCollection.elementAt(-1+AV71GXV3));
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( AV6MAnt_ErroresClienteSDT.getgxTv_SdtMAnt_ErroresClienteSDT_Mantclicod(), 6, 0) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( AV6MAnt_ErroresClienteSDT.getgxTv_SdtMAnt_ErroresClienteSDT_Mantclicod(), 6, 0)), GXutil.trim( AV6MAnt_ErroresClienteSDT.getgxTv_SdtMAnt_ErroresClienteSDT_Mantclinom()), "", "", "", "", "", "", "") );
         AV16CliCod_Data.add(AV21Combo_DataItem, 0);
         AV71GXV3 = (int)(AV71GXV3+1) ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "cargado combo cliente: %1", ""), AV16CliCod_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV67Pgmname) ;
      AV16CliCod_Data.sort("Title");
      Combo_clicod_Selectedvalue_set = ((0==AV15CliCod) ? "" : GXutil.trim( GXutil.str( AV15CliCod, 6, 0))) ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
   }

   public void e162DP2( )
   {
      /* GlobalEvents_Refreshgrid Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV59Variable, "MAnt_Filtrado_TabDefecto") == 0 ) || ( GXutil.strcmp(AV59Variable, "MAnt_Filtrado") == 0 ) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "filtrar a TabDefecto", AV58ValorRecibidoVariable, "", "", "", "", "", "", "", ""), AV67Pgmname) ;
         AV7sdtParametros.fromJSonString(AV58ValorRecibidoVariable, null);
         AV51TipMaqCodS.clear();
         AV51TipMaqCodS.add(AV7sdtParametros.getgxTv_SdtsdtParametros_Tipmaqcod(), 0);
         AV52Titulo = GXutil.format( httpContext.getMessage( "Consulta Defecto para cliente:%1, Articulo:%2, &Color:%3, Tipo Maquinas:%4, fechas:%5-%6, Maquina:%7", ""), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Clicod(), 6, 0), AV7sdtParametros.getgxTv_SdtsdtParametros_Artcod(), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Forcolnum(), 6, 0), AV51TipMaqCodS.toJSonString(false), localUtil.dtoc( AV7sdtParametros.getgxTv_SdtsdtParametros_Fechainicio(), 0, "-"), localUtil.dtoc( AV7sdtParametros.getgxTv_SdtsdtParametros_Fechafin(), 0, "-"), AV7sdtParametros.getgxTv_SdtsdtParametros_Maqcod(), "", "") ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 50, true, (byte)(1)) ;
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcmant_defecto = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmant_defecto_Component), GXutil.lower( "AnticipacionErrores.MAnt_Defecto")) != 0 )
         {
            WebComp_Wcmant_defecto = WebUtils.getWebComponent(getClass(), "app.anticipacionerrores.mant_defecto_impl", remoteHandle, context);
            WebComp_Wcmant_defecto_Component = "AnticipacionErrores.MAnt_Defecto" ;
         }
         if ( GXutil.len( WebComp_Wcmant_defecto_Component) != 0 )
         {
            WebComp_Wcmant_defecto.setjustcreated();
            WebComp_Wcmant_defecto.componentprepare(new Object[] {"W0096","",AV7sdtParametros.getgxTv_SdtsdtParametros_Emprcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Clicod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Artcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Forcolnum(),AV51TipMaqCodS.toJSonString(false),AV7sdtParametros.getgxTv_SdtsdtParametros_Fechainicio(),AV7sdtParametros.getgxTv_SdtsdtParametros_Fechafin(),AV7sdtParametros.getgxTv_SdtsdtParametros_Maqcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Mtknusu(),AV7sdtParametros.getgxTv_SdtsdtParametros_Mtkn()});
            WebComp_Wcmant_defecto.componentbind(new Object[] {"","","","",""+"","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmant_defecto )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0096"+"");
            WebComp_Wcmant_defecto.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         AV33i = GXutil.sleep( 1) ;
         this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSCONTENTContainer", "SelectTab", "", new Object[] {Integer.valueOf(2)});
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 100, false, (byte)(1)) ;
      }
      else if ( GXutil.strcmp(AV59Variable, "MAnt_Filtrado_RightButton") == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "filtrar a TabDetalle", AV58ValorRecibidoVariable, "", "", "", "", "", "", "", ""), AV67Pgmname) ;
         AV7sdtParametros.fromJSonString(AV58ValorRecibidoVariable, null);
         AV51TipMaqCodS.clear();
         AV51TipMaqCodS.add(AV7sdtParametros.getgxTv_SdtsdtParametros_Tipmaqcod(), 0);
         AV52Titulo = GXutil.format( httpContext.getMessage( "Consulta Detalle para cliente:%1, Articulo:%2, &Color:%3, Tipo Maquinas:%4, fechas:%5-%6, Maquina:%7, Defecto:%8, Categoria:%9.", ""), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Clicod(), 6, 0), AV7sdtParametros.getgxTv_SdtsdtParametros_Artcod(), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Forcolnum(), 6, 0), AV51TipMaqCodS.toJSonString(false), localUtil.dtoc( AV7sdtParametros.getgxTv_SdtsdtParametros_Fechainicio(), 0, "-"), localUtil.dtoc( AV7sdtParametros.getgxTv_SdtsdtParametros_Fechafin(), 0, "-"), AV7sdtParametros.getgxTv_SdtsdtParametros_Maqcod(), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Defcod(), 4, 0), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Catcod(), 4, 0)) ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 40, true, (byte)(1)) ;
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcmant_detalle = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmant_detalle_Component), GXutil.lower( "AnticipacionErrores.MAnt_Detalle")) != 0 )
         {
            WebComp_Wcmant_detalle = WebUtils.getWebComponent(getClass(), "app.anticipacionerrores.mant_detalle_impl", remoteHandle, context);
            WebComp_Wcmant_detalle_Component = "AnticipacionErrores.MAnt_Detalle" ;
         }
         if ( GXutil.len( WebComp_Wcmant_detalle_Component) != 0 )
         {
            WebComp_Wcmant_detalle.setjustcreated();
            WebComp_Wcmant_detalle.componentprepare(new Object[] {"W0104","",AV7sdtParametros.getgxTv_SdtsdtParametros_Emprcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Clicod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Artcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Forcolnum(),AV51TipMaqCodS.toJSonString(false),AV7sdtParametros.getgxTv_SdtsdtParametros_Fechainicio(),AV7sdtParametros.getgxTv_SdtsdtParametros_Fechafin(),AV7sdtParametros.getgxTv_SdtsdtParametros_Maqcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Defcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Catcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Mtknusu(),AV7sdtParametros.getgxTv_SdtsdtParametros_Mtkn()});
            WebComp_Wcmant_detalle.componentbind(new Object[] {"","","","",""+"","","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmant_detalle )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0104"+"");
            WebComp_Wcmant_detalle.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         AV33i = GXutil.sleep( 1) ;
         this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSCONTENTContainer", "SelectTab", "", new Object[] {Integer.valueOf(3)});
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 100, false, (byte)(1)) ;
      }
      else if ( GXutil.strcmp(AV59Variable, "MAnt_Defecto") == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "filtrar a TabDetalle desde MAnt_Defecto", AV58ValorRecibidoVariable, "", "", "", "", "", "", "", ""), AV67Pgmname) ;
         AV7sdtParametros.fromJSonString(AV58ValorRecibidoVariable, null);
         AV51TipMaqCodS.clear();
         AV51TipMaqCodS.add(AV7sdtParametros.getgxTv_SdtsdtParametros_Tipmaqcod(), 0);
         AV52Titulo = GXutil.format( httpContext.getMessage( "Consulta Detalle para cliente:%1, Articulo:%2, &Color:%3, Tipo Maquinas:%4 fechas:%5-%6, Maquina:%7, Defecto:%8, Categoria:%9.", ""), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Clicod(), 6, 0), AV7sdtParametros.getgxTv_SdtsdtParametros_Artcod(), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Forcolnum(), 6, 0), AV51TipMaqCodS.toJSonString(false), localUtil.dtoc( AV7sdtParametros.getgxTv_SdtsdtParametros_Fechainicio(), 0, "-"), localUtil.dtoc( AV7sdtParametros.getgxTv_SdtsdtParametros_Fechafin(), 0, "-"), AV7sdtParametros.getgxTv_SdtsdtParametros_Maqcod(), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Defcod(), 4, 0), GXutil.ltrimstr( AV7sdtParametros.getgxTv_SdtsdtParametros_Catcod(), 4, 0)) ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 50, true, (byte)(1)) ;
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcmant_detalle = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmant_detalle_Component), GXutil.lower( "AnticipacionErrores.MAnt_Detalle")) != 0 )
         {
            WebComp_Wcmant_detalle = WebUtils.getWebComponent(getClass(), "app.anticipacionerrores.mant_detalle_impl", remoteHandle, context);
            WebComp_Wcmant_detalle_Component = "AnticipacionErrores.MAnt_Detalle" ;
         }
         if ( GXutil.len( WebComp_Wcmant_detalle_Component) != 0 )
         {
            WebComp_Wcmant_detalle.setjustcreated();
            WebComp_Wcmant_detalle.componentprepare(new Object[] {"W0104","",AV7sdtParametros.getgxTv_SdtsdtParametros_Emprcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Clicod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Artcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Forcolnum(),AV51TipMaqCodS.toJSonString(false),AV7sdtParametros.getgxTv_SdtsdtParametros_Fechainicio(),AV7sdtParametros.getgxTv_SdtsdtParametros_Fechafin(),AV7sdtParametros.getgxTv_SdtsdtParametros_Maqcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Defcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Catcod(),AV7sdtParametros.getgxTv_SdtsdtParametros_Mtknusu(),AV7sdtParametros.getgxTv_SdtsdtParametros_Mtkn()});
            WebComp_Wcmant_detalle.componentbind(new Object[] {"","","","",""+"","","","","","","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmant_detalle )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0104"+"");
            WebComp_Wcmant_detalle.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         AV33i = GXutil.sleep( 1) ;
         this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSCONTENTContainer", "SelectTab", "", new Object[] {Integer.valueOf(3)});
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV52Titulo, 100, false, (byte)(1)) ;
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e172DP2( )
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
      pa2DP2( ) ;
      ws2DP2( ) ;
      we2DP2( ) ;
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
      if ( ! ( WebComp_Wcmant_filtrado == null ) )
      {
         if ( GXutil.len( WebComp_Wcmant_filtrado_Component) != 0 )
         {
            WebComp_Wcmant_filtrado.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcmant_defecto == null ) )
      {
         if ( GXutil.len( WebComp_Wcmant_defecto_Component) != 0 )
         {
            WebComp_Wcmant_defecto.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcmant_detalle == null ) )
      {
         if ( GXutil.len( WebComp_Wcmant_detalle_Component) != 0 )
         {
            WebComp_Wcmant_detalle.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171432297", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mant_simular.js", "?20268171432298", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicod_Internalname = "TEXTBLOCKCOMBO_CLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockcombo_artcod_Internalname = "TEXTBLOCKCOMBO_ARTCOD" ;
      Combo_artcod_Internalname = "COMBO_ARTCOD" ;
      divTablesplittedartcod_Internalname = "TABLESPLITTEDARTCOD" ;
      lblTextblockcombo_color_Internalname = "TEXTBLOCKCOMBO_COLOR" ;
      Combo_color_Internalname = "COMBO_COLOR" ;
      divTablesplittedcolor_Internalname = "TABLESPLITTEDCOLOR" ;
      lblTextblockcombo_tipmaqcod_Internalname = "TEXTBLOCKCOMBO_TIPMAQCOD" ;
      Combo_tipmaqcod_Internalname = "COMBO_TIPMAQCOD" ;
      divTablesplittedtipmaqcod_Internalname = "TABLESPLITTEDTIPMAQCOD" ;
      edtavFechainicio_Internalname = "vFECHAINICIO" ;
      edtavFechafin_Internalname = "vFECHAFIN" ;
      divTablefiltrofecha_Internalname = "TABLEFILTROFECHA" ;
      lblActualizar_Internalname = "ACTUALIZAR" ;
      divUnnamedsection1_Internalname = "UNNAMEDSECTION1" ;
      lblBorrar_Internalname = "BORRAR" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTablefiltros_Internalname = "TABLEFILTROS" ;
      Barraprogreso_Internalname = "BARRAPROGRESO" ;
      lblTabgeneral_title_Internalname = "TABGENERAL_TITLE" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      lblTabdefectos_title_Internalname = "TABDEFECTOS_TITLE" ;
      divTabledefectos_Internalname = "TABLEDEFECTOS" ;
      lblTabdetalle_title_Internalname = "TABDETALLE_TITLE" ;
      divTabledetalle_Internalname = "TABLEDETALLE" ;
      Gxuitabspanel_tabscontent_Internalname = "GXUITABSPANEL_TABSCONTENT" ;
      divPdatos_Internalname = "PDATOS" ;
      Dvpanel_pdatos_Internalname = "DVPANEL_PDATOS" ;
      divPfiltros_Internalname = "PFILTROS" ;
      Dvpanel_pfiltros_Internalname = "DVPANEL_PFILTROS" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavColor_Internalname = "vCOLOR" ;
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
      edtavColor_Jsonclick = "" ;
      edtavColor_Visible = 1 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Visible = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcmant_detalle_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0104"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_detalle_Visible), 5, 0), true);
      divTabledetalle_Visible = 1 ;
      WebComp_Wcmant_defecto_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0096"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_defecto_Visible), 5, 0), true);
      divTabledefectos_Visible = 1 ;
      WebComp_Wcmant_filtrado_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0088"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcmant_filtrado_Visible), 5, 0), true);
      divTablegeneral_Visible = 1 ;
      lblActualizar_Enabled = 1 ;
      edtavFechafin_Jsonclick = "" ;
      edtavFechafin_Enabled = 1 ;
      edtavFechainicio_Jsonclick = "" ;
      edtavFechainicio_Enabled = 1 ;
      Combo_tipmaqcod_Caption = "" ;
      Combo_color_Caption = "" ;
      Combo_artcod_Caption = "" ;
      Combo_clicod_Caption = "" ;
      Dvpanel_pfiltros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pfiltros_Iconposition = "Right" ;
      Dvpanel_pfiltros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pfiltros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pfiltros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pfiltros_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_pfiltros_Cls = "CellMarginTop8" ;
      Dvpanel_pfiltros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pfiltros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pfiltros_Width = "100%" ;
      Dvpanel_pdatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pdatos_Iconposition = "Right" ;
      Dvpanel_pdatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pdatos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pdatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pdatos_Title = "" ;
      Dvpanel_pdatos_Cls = "CellMarginTop8" ;
      Dvpanel_pdatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pdatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pdatos_Width = "100%" ;
      Gxuitabspanel_tabscontent_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabscontent_Class = "" ;
      Gxuitabspanel_tabscontent_Pagecount = 3 ;
      Combo_tipmaqcod_Multiplevaluestype = "Tags" ;
      Combo_tipmaqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tipmaqcod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_tipmaqcod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_tipmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_color_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_color_Dropdownoptionstype = "ExtendedSuggest" ;
      Combo_color_Cls = "ExtendedCombo AttributeFL" ;
      Combo_artcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_artcod_Dropdownoptionstype = "ExtendedSuggest" ;
      Combo_artcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Dropdownoptionstype = "ExtendedSuggest" ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MAnt_Simular", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24DupTipMaqCod',fld:'vDUPTIPMAQCOD',pic:'',hsh:true},{av:'AV39MAnt_ErroresSDTCollection',fld:'vMANT_ERRORESSDTCOLLECTION',pic:'',hsh:true},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOACTUALIZAR'","{handler:'e142DP2',iparms:[{av:'AV49TipMaqCod',fld:'vTIPMAQCOD',pic:''},{av:'AV15CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:''},{av:'AV19Color',fld:'vCOLOR',pic:''},{av:'AV28FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV27FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13Ayer',fld:'vAYER',pic:''},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV48sdtMFil',fld:'vSDTMFIL',pic:''}]");
      setEventMetadata("'DOACTUALIZAR'",",oparms:[{av:'lblActualizar_Enabled',ctrl:'ACTUALIZAR',prop:'Enabled'},{av:'AV8TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{ctrl:'WCMANT_FILTRADO',prop:'Visible'},{ctrl:'WCMANT_DEFECTO',prop:'Visible'},{ctrl:'WCMANT_DETALLE',prop:'Visible'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabledefectos_Visible',ctrl:'TABLEDEFECTOS',prop:'Visible'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'},{av:'AV5ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV48sdtMFil',fld:'vSDTMFIL',pic:''},{av:'AV44MTkn',fld:'vMTKN',pic:''},{av:'AV45MTknUsu',fld:'vMTKNUSU',pic:''},{ctrl:'WCMANT_FILTRADO'}]}");
      setEventMetadata("'DOBORRAR'","{handler:'e152DP2',iparms:[{av:'AV24DupTipMaqCod',fld:'vDUPTIPMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOBORRAR'",",oparms:[{av:'AV15CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:''},{av:'AV19Color',fld:'vCOLOR',pic:''},{av:'AV49TipMaqCod',fld:'vTIPMAQCOD',pic:''},{av:'AV13Ayer',fld:'vAYER',pic:''},{av:'AV27FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV28FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'Combo_clicod_Selectedvalue_set',ctrl:'COMBO_CLICOD',prop:'SelectedValue_set'},{av:'Combo_artcod_Selectedvalue_set',ctrl:'COMBO_ARTCOD',prop:'SelectedValue_set'},{av:'Combo_color_Selectedvalue_set',ctrl:'COMBO_COLOR',prop:'SelectedValue_set'},{av:'Combo_tipmaqcod_Selectedvalue_set',ctrl:'COMBO_TIPMAQCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabledefectos_Visible',ctrl:'TABLEDEFECTOS',prop:'Visible'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'}]}");
      setEventMetadata("COMBO_ARTCOD.ONOPTIONCLICKED","{handler:'e122DP2',iparms:[{av:'Combo_artcod_Selectedvalue_get',ctrl:'COMBO_ARTCOD',prop:'SelectedValue_get'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV15CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV39MAnt_ErroresSDTCollection',fld:'vMANT_ERRORESSDTCOLLECTION',pic:'',hsh:true},{av:'AV19Color',fld:'vCOLOR',pic:''}]");
      setEventMetadata("COMBO_ARTCOD.ONOPTIONCLICKED",",oparms:[{av:'AV9ArtCod',fld:'vARTCOD',pic:''},{av:'AV19Color',fld:'vCOLOR',pic:''},{av:'Combo_color_Selectedvalue_set',ctrl:'COMBO_COLOR',prop:'SelectedValue_set'},{av:'AV20Color_Data',fld:'vCOLOR_DATA',pic:''}]}");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED","{handler:'e112DP2',iparms:[{av:'Combo_clicod_Selectedvalue_get',ctrl:'COMBO_CLICOD',prop:'SelectedValue_get'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV39MAnt_ErroresSDTCollection',fld:'vMANT_ERRORESSDTCOLLECTION',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ArtCod',fld:'vARTCOD',pic:''}]");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED",",oparms:[{av:'AV15CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:''},{av:'AV19Color',fld:'vCOLOR',pic:''},{av:'Combo_artcod_Selectedvalue_set',ctrl:'COMBO_ARTCOD',prop:'SelectedValue_set'},{av:'Combo_color_Selectedvalue_set',ctrl:'COMBO_COLOR',prop:'SelectedValue_set'},{av:'AV10ArtCod_Data',fld:'vARTCOD_DATA',pic:''}]}");
      setEventMetadata("GLOBALEVENTS.REFRESHGRID","{handler:'e162DP2',iparms:[{av:'AV58ValorRecibidoVariable',fld:'vVALORRECIBIDOVARIABLE',pic:''},{av:'AV59Variable',fld:'vVARIABLE',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESHGRID",",oparms:[{ctrl:'WCMANT_DEFECTO'},{ctrl:'WCMANT_DETALLE'}]}");
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
      Combo_tipmaqcod_Selectedvalue_get = "" ;
      Combo_color_Selectedvalue_get = "" ;
      Combo_artcod_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV25EmprCod = "" ;
      AV24DupTipMaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39MAnt_ErroresSDTCollection = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT>(app.anticipacionerrores.SdtMAnt_ErroresSDT.class, "MAnt_ErroresSDT", "TexplusNET", remoteHandle);
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV67Pgmname = "" ;
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV16CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV10ArtCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV20Color_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV50TipMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49TipMaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV13Ayer = GXutil.nullDate() ;
      AV48sdtMFil = new app.anticipacionerrores.SdtsdtMFil(remoteHandle, context);
      AV58ValorRecibidoVariable = "" ;
      AV59Variable = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_artcod_Selectedvalue_set = "" ;
      Combo_color_Selectedvalue_set = "" ;
      Combo_tipmaqcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pfiltros = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_artcod_Jsonclick = "" ;
      ucCombo_artcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_color_Jsonclick = "" ;
      ucCombo_color = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_tipmaqcod_Jsonclick = "" ;
      ucCombo_tipmaqcod = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV28FechaInicio = GXutil.nullDate() ;
      AV27FechaFin = GXutil.nullDate() ;
      lblActualizar_Jsonclick = "" ;
      lblBorrar_Jsonclick = "" ;
      ucBarraprogreso = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pdatos = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabscontent = new com.genexus.webpanels.GXUserControl();
      lblTabgeneral_title_Jsonclick = "" ;
      WebComp_Wcmant_filtrado_Component = "" ;
      OldWcmant_filtrado = "" ;
      lblTabdefectos_title_Jsonclick = "" ;
      WebComp_Wcmant_defecto_Component = "" ;
      OldWcmant_defecto = "" ;
      lblTabdetalle_title_Jsonclick = "" ;
      WebComp_Wcmant_detalle_Component = "" ;
      OldWcmant_detalle = "" ;
      lblTextblock1_Jsonclick = "" ;
      AV9ArtCod = "" ;
      AV19Color = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV47ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV62Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV63EmprNom = "" ;
      AV64UsurCod = "" ;
      AV8TipMaqCodJSON = "" ;
      AV41MaqCod = "" ;
      AV45MTknUsu = "" ;
      AV44MTkn = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV52Titulo = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_boolean8 = new boolean[1] ;
      scmdbuf = "" ;
      H02DP2_A396EmprCod = new String[] {""} ;
      H02DP2_A1011TipMaqCod = new String[] {""} ;
      H02DP2_A1012TipMaqDsc = new String[] {""} ;
      H02DP2_n1012TipMaqDsc = new boolean[] {false} ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      AV21Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV35MAnt_ErroresClienteArticuloColorSDTCollection = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT.class, "MAnt_ErroresClienteArticuloColorSDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtMAnt_ErroresClienteArticuloColorSDT9 = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT.class, "MAnt_ErroresClienteArticuloColorSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMAnt_ErroresClienteArticuloColorSDT10 = new GXBaseCollection[1] ;
      AV34MAnt_ErroresClienteArticuloColorSDT = new app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT(remoteHandle, context);
      AV37MAnt_ErroresClienteArticuloSDTCollection = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT.class, "MAnt_ErroresClienteArticuloSDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtMAnt_ErroresClienteArticuloSDT11 = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT.class, "MAnt_ErroresClienteArticuloSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMAnt_ErroresClienteArticuloSDT12 = new GXBaseCollection[1] ;
      AV36MAnt_ErroresClienteArticuloSDT = new app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT(remoteHandle, context);
      AV38MAnt_ErroresClienteSDTCollection = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteSDT.class, "MAnt_ErroresClienteSDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtMAnt_ErroresClienteSDT13 = new GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT>(app.anticipacionerrores.SdtMAnt_ErroresClienteSDT.class, "MAnt_ErroresClienteSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMAnt_ErroresClienteSDT14 = new GXBaseCollection[1] ;
      AV6MAnt_ErroresClienteSDT = new app.anticipacionerrores.SdtMAnt_ErroresClienteSDT(remoteHandle, context);
      AV7sdtParametros = new app.anticipacionerrores.SdtsdtParametros(remoteHandle, context);
      AV51TipMaqCodS = new GXSimpleCollection<String>(String.class, "internal", "");
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_simular__default(),
         new Object[] {
             new Object[] {
            H02DP2_A396EmprCod, H02DP2_A1011TipMaqCod, H02DP2_A1012TipMaqDsc, H02DP2_n1012TipMaqDsc
            }
         }
      );
      AV67Pgmname = "AnticipacionErrores.MAnt_Simular" ;
      /* GeneXus formulas. */
      AV67Pgmname = "AnticipacionErrores.MAnt_Simular" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcmant_filtrado = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcmant_defecto = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcmant_detalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV33i ;
   private int Gxuitabspanel_tabscontent_Pagecount ;
   private int edtavFechainicio_Enabled ;
   private int edtavFechafin_Enabled ;
   private int lblActualizar_Enabled ;
   private int divTablegeneral_Visible ;
   private int WebComp_Wcmant_filtrado_Visible ;
   private int divTabledefectos_Visible ;
   private int WebComp_Wcmant_defecto_Visible ;
   private int divTabledetalle_Visible ;
   private int WebComp_Wcmant_detalle_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV15CliCod ;
   private int edtavClicod_Visible ;
   private int edtavArtcod_Visible ;
   private int edtavColor_Visible ;
   private int AV5ForColNum ;
   private int AV69GXV1 ;
   private int AV70GXV2 ;
   private int AV71GXV3 ;
   private int idxLst ;
   private String Combo_tipmaqcod_Selectedvalue_get ;
   private String Combo_color_Selectedvalue_get ;
   private String Combo_artcod_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV25EmprCod ;
   private String GXKey ;
   private String AV67Pgmname ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Dropdownoptionstype ;
   private String Combo_artcod_Cls ;
   private String Combo_artcod_Selectedvalue_set ;
   private String Combo_artcod_Dropdownoptionstype ;
   private String Combo_color_Cls ;
   private String Combo_color_Selectedvalue_set ;
   private String Combo_color_Dropdownoptionstype ;
   private String Combo_tipmaqcod_Cls ;
   private String Combo_tipmaqcod_Selectedvalue_set ;
   private String Combo_tipmaqcod_Multiplevaluestype ;
   private String Gxuitabspanel_tabscontent_Class ;
   private String Dvpanel_pdatos_Width ;
   private String Dvpanel_pdatos_Cls ;
   private String Dvpanel_pdatos_Title ;
   private String Dvpanel_pdatos_Iconposition ;
   private String Dvpanel_pfiltros_Width ;
   private String Dvpanel_pfiltros_Cls ;
   private String Dvpanel_pfiltros_Title ;
   private String Dvpanel_pfiltros_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_pfiltros_Internalname ;
   private String divPfiltros_Internalname ;
   private String divTablefiltros_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockcombo_clicod_Internalname ;
   private String lblTextblockcombo_clicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Internalname ;
   private String divTablesplittedartcod_Internalname ;
   private String lblTextblockcombo_artcod_Internalname ;
   private String lblTextblockcombo_artcod_Jsonclick ;
   private String Combo_artcod_Caption ;
   private String Combo_artcod_Internalname ;
   private String divTablesplittedcolor_Internalname ;
   private String lblTextblockcombo_color_Internalname ;
   private String lblTextblockcombo_color_Jsonclick ;
   private String Combo_color_Caption ;
   private String Combo_color_Internalname ;
   private String divTablesplittedtipmaqcod_Internalname ;
   private String lblTextblockcombo_tipmaqcod_Internalname ;
   private String lblTextblockcombo_tipmaqcod_Jsonclick ;
   private String Combo_tipmaqcod_Caption ;
   private String Combo_tipmaqcod_Internalname ;
   private String divTablefiltrofecha_Internalname ;
   private String edtavFechainicio_Internalname ;
   private String TempTags ;
   private String edtavFechainicio_Jsonclick ;
   private String edtavFechafin_Internalname ;
   private String edtavFechafin_Jsonclick ;
   private String divTableactions_Internalname ;
   private String lblActualizar_Internalname ;
   private String lblActualizar_Jsonclick ;
   private String divUnnamedsection1_Internalname ;
   private String lblBorrar_Internalname ;
   private String lblBorrar_Jsonclick ;
   private String Barraprogreso_Internalname ;
   private String Dvpanel_pdatos_Internalname ;
   private String divPdatos_Internalname ;
   private String Gxuitabspanel_tabscontent_Internalname ;
   private String lblTabgeneral_title_Internalname ;
   private String lblTabgeneral_title_Jsonclick ;
   private String divTablegeneral_Internalname ;
   private String WebComp_Wcmant_filtrado_Component ;
   private String OldWcmant_filtrado ;
   private String lblTabdefectos_title_Internalname ;
   private String lblTabdefectos_title_Jsonclick ;
   private String divTabledefectos_Internalname ;
   private String WebComp_Wcmant_defecto_Component ;
   private String OldWcmant_defecto ;
   private String lblTabdetalle_title_Internalname ;
   private String lblTabdetalle_title_Jsonclick ;
   private String divTabledetalle_Internalname ;
   private String WebComp_Wcmant_detalle_Component ;
   private String OldWcmant_detalle ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String AV9ArtCod ;
   private String edtavArtcod_Jsonclick ;
   private String edtavColor_Internalname ;
   private String AV19Color ;
   private String edtavColor_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV62Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV63EmprNom ;
   private String AV64UsurCod ;
   private String AV41MaqCod ;
   private String AV45MTknUsu ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private java.util.Date AV13Ayer ;
   private java.util.Date AV28FechaInicio ;
   private java.util.Date AV27FechaFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_clicod_Emptyitem ;
   private boolean Combo_artcod_Emptyitem ;
   private boolean Combo_color_Emptyitem ;
   private boolean Combo_tipmaqcod_Allowmultipleselection ;
   private boolean Combo_tipmaqcod_Includeonlyselectedoption ;
   private boolean Combo_tipmaqcod_Emptyitem ;
   private boolean Gxuitabspanel_tabscontent_Historymanagement ;
   private boolean Dvpanel_pdatos_Autowidth ;
   private boolean Dvpanel_pdatos_Autoheight ;
   private boolean Dvpanel_pdatos_Collapsible ;
   private boolean Dvpanel_pdatos_Collapsed ;
   private boolean Dvpanel_pdatos_Showcollapseicon ;
   private boolean Dvpanel_pdatos_Autoscroll ;
   private boolean Dvpanel_pfiltros_Autowidth ;
   private boolean Dvpanel_pfiltros_Autoheight ;
   private boolean Dvpanel_pfiltros_Collapsible ;
   private boolean Dvpanel_pfiltros_Collapsed ;
   private boolean Dvpanel_pfiltros_Showcollapseicon ;
   private boolean Dvpanel_pfiltros_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcmant_detalle ;
   private boolean bDynCreated_Wcmant_defecto ;
   private boolean bDynCreated_Wcmant_filtrado ;
   private boolean AV26ExisteFiltro ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private boolean n1012TipMaqDsc ;
   private String AV58ValorRecibidoVariable ;
   private String AV59Variable ;
   private String AV8TipMaqCodJSON ;
   private String AV44MTkn ;
   private String AV52Titulo ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcmant_filtrado ;
   private GXWebComponent WebComp_Wcmant_defecto ;
   private GXWebComponent WebComp_Wcmant_detalle ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pfiltros ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_artcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_color ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipmaqcod ;
   private com.genexus.webpanels.GXUserControl ucBarraprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pdatos ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabscontent ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02DP2_A396EmprCod ;
   private String[] H02DP2_A1011TipMaqCod ;
   private String[] H02DP2_A1012TipMaqDsc ;
   private boolean[] H02DP2_n1012TipMaqDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV24DupTipMaqCod ;
   private GXSimpleCollection<String> AV49TipMaqCod ;
   private GXSimpleCollection<String> AV51TipMaqCodS ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT> AV38MAnt_ErroresClienteSDTCollection ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT> GXt_objcol_SdtMAnt_ErroresClienteSDT13 ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteSDT> GXv_objcol_SdtMAnt_ErroresClienteSDT14[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10ArtCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20Color_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV50TipMaqCod_Data ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT> AV35MAnt_ErroresClienteArticuloColorSDTCollection ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT> GXt_objcol_SdtMAnt_ErroresClienteArticuloColorSDT9 ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT> GXv_objcol_SdtMAnt_ErroresClienteArticuloColorSDT10[] ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT> AV37MAnt_ErroresClienteArticuloSDTCollection ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT> GXt_objcol_SdtMAnt_ErroresClienteArticuloSDT11 ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT> GXv_objcol_SdtMAnt_ErroresClienteArticuloSDT12[] ;
   private GXBaseCollection<app.anticipacionerrores.SdtMAnt_ErroresSDT> AV39MAnt_ErroresSDTCollection ;
   private app.anticipacionerrores.SdtMAnt_ErroresClienteSDT AV6MAnt_ErroresClienteSDT ;
   private app.anticipacionerrores.SdtsdtParametros AV7sdtParametros ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV21Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloColorSDT AV34MAnt_ErroresClienteArticuloColorSDT ;
   private app.anticipacionerrores.SdtMAnt_ErroresClienteArticuloSDT AV36MAnt_ErroresClienteArticuloSDT ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV47ProgressIndicator ;
   private app.anticipacionerrores.SdtsdtMFil AV48sdtMFil ;
}

final  class mant_simular__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DP2", "SELECT EmprCod, TipMaqCod, TipMaqDsc FROM TXPTIPMAQ ORDER BY EmprCod, TipMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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

