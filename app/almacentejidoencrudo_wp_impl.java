package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidoencrudo_wp_impl extends GXDataArea
{
   public almacentejidoencrudo_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidoencrudo_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudo_wp_impl.class ));
   }

   public almacentejidoencrudo_wp_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbrestin = new HTMLChoice();
      cmbavTipo = new HTMLChoice();
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
      pa2DK2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2DK2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacentejidoencrudo_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV18CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV18CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_TO_DATA", AV20CliCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_TO_DATA", AV20CliCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBRTARTC_DATA", AV14AlbRTartC_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBRTARTC_DATA", AV14AlbRTartC_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBRTARTC_TO_DATA", AV16AlbRTartC_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBRTARTC_TO_DATA", AV16AlbRTartC_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPENTCOD_DATA", AV27TipEntCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPENTCOD_DATA", AV27TipEntCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROCECODFROM_DATA", AV23ProceCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROCECODFROM_DATA", AV23ProceCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROCECODTO_DATA", AV25ProceCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROCECODTO_DATA", AV25ProceCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCODFROM_DATA", AV30TrnCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCODFROM_DATA", AV30TrnCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCODTO_DATA", AV32TrnCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCODTO_DATA", AV32TrnCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_TO2", GXutil.ltrim( localUtil.ntoc( AV41CliCod_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFEN_TO2", localUtil.dtoc( AV39AlbRFen_to2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBREF_TO2", GXutil.rtrim( AV38AlbRef_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRTARTC_TO2", GXutil.ltrim( localUtil.ntoc( AV40AlbRTartC_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitemtext", GXutil.rtrim( Combo_clicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Cls", GXutil.rtrim( Combo_clicod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_clicod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Emptyitemtext", GXutil.rtrim( Combo_clicod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_Cls", GXutil.rtrim( Combo_albrtartc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_Selectedvalue_set", GXutil.rtrim( Combo_albrtartc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_Emptyitemtext", GXutil.rtrim( Combo_albrtartc_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_TO_Cls", GXutil.rtrim( Combo_albrtartc_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_TO_Selectedvalue_set", GXutil.rtrim( Combo_albrtartc_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_TO_Emptyitemtext", GXutil.rtrim( Combo_albrtartc_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Cls", GXutil.rtrim( Combo_tipentcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipentcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Emptyitemtext", GXutil.rtrim( Combo_tipentcod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODFROM_Cls", GXutil.rtrim( Combo_procecodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODFROM_Selectedvalue_set", GXutil.rtrim( Combo_procecodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODFROM_Emptyitemtext", GXutil.rtrim( Combo_procecodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODTO_Cls", GXutil.rtrim( Combo_procecodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODTO_Selectedvalue_set", GXutil.rtrim( Combo_procecodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODTO_Emptyitemtext", GXutil.rtrim( Combo_procecodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODFROM_Cls", GXutil.rtrim( Combo_trncodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODFROM_Selectedvalue_set", GXutil.rtrim( Combo_trncodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODFROM_Emptyitemtext", GXutil.rtrim( Combo_trncodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODTO_Cls", GXutil.rtrim( Combo_trncodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODTO_Selectedvalue_set", GXutil.rtrim( Combo_trncodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODTO_Emptyitemtext", GXutil.rtrim( Combo_trncodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Width", GXutil.rtrim( Dvpanel_nrecepcion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Autowidth", GXutil.booltostr( Dvpanel_nrecepcion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Autoheight", GXutil.booltostr( Dvpanel_nrecepcion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Cls", GXutil.rtrim( Dvpanel_nrecepcion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Title", GXutil.rtrim( Dvpanel_nrecepcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Collapsible", GXutil.booltostr( Dvpanel_nrecepcion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Collapsed", GXutil.booltostr( Dvpanel_nrecepcion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Showcollapseicon", GXutil.booltostr( Dvpanel_nrecepcion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Iconposition", GXutil.rtrim( Dvpanel_nrecepcion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_NRECEPCION_Autoscroll", GXutil.booltostr( Dvpanel_nrecepcion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Width", GXutil.rtrim( Dvpanel_panel_filtrosmas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Cls", GXutil.rtrim( Dvpanel_panel_filtrosmas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Title", GXutil.rtrim( Dvpanel_panel_filtrosmas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosmas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosmas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosmas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosmas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODTO_Selectedvalue_get", GXutil.rtrim( Combo_trncodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCODFROM_Selectedvalue_get", GXutil.rtrim( Combo_trncodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODTO_Selectedvalue_get", GXutil.rtrim( Combo_procecodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCECODFROM_Selectedvalue_get", GXutil.rtrim( Combo_procecodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPENTCOD_Selectedvalue_get", GXutil.rtrim( Combo_tipentcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_TO_Selectedvalue_get", GXutil.rtrim( Combo_albrtartc_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBRTARTC_Selectedvalue_get", GXutil.rtrim( Combo_albrtartc_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_clicod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_get", GXutil.rtrim( Combo_clicod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Activepage", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Activepage, (byte)(9), (byte)(0), ".", "")));
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
      if ( ! ( WebComp_Wcalmacentejidoencrudoclientereferencia_wc == null ) )
      {
         WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentjscripts();
      }
      if ( ! ( WebComp_Wcalmacentejidoencrudocliente_wc == null ) )
      {
         WebComp_Wcalmacentejidoencrudocliente_wc.componentjscripts();
      }
      if ( ! ( WebComp_Wcalmacentejidoencrudodetalle_wc == null ) )
      {
         WebComp_Wcalmacentejidoencrudodetalle_wc.componentjscripts();
      }
      if ( ! ( WebComp_Wcalmacentejidoencrudodistribucion_wc == null ) )
      {
         WebComp_Wcalmacentejidoencrudodistribucion_wc.componentjscripts();
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
         we2DK2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2DK2( ) ;
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
      return formatLink("app.almacentejidoencrudo_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenTejidoencrudo_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido en Crudo", "") ;
   }

   public void wb2DK0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
         ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
         ucCombo_clicod.setProperty("EmptyItemText", Combo_clicod_Emptyitemtext);
         ucCombo_clicod.setProperty("DropDownOptionsData", AV18CliCod_Data);
         ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_to_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod_to.setProperty("Caption", Combo_clicod_to_Caption);
         ucCombo_clicod_to.setProperty("Cls", Combo_clicod_to_Cls);
         ucCombo_clicod_to.setProperty("EmptyItemText", Combo_clicod_to_Emptyitemtext);
         ucCombo_clicod_to.setProperty("DropDownOptionsData", AV20CliCod_to_Data);
         ucCombo_clicod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_to_Internalname, "COMBO_CLICOD_TOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrfen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfen_Internalname, httpContext.getMessage( "Fecha Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfen_Internalname, localUtil.format(AV11AlbRFen, "99/99/99"), localUtil.format( AV11AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrfen_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfen_to_Internalname, httpContext.getMessage( "Fecha Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfen_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfen_to_Internalname, localUtil.format(AV12AlbRFen_to, "99/99/99"), localUtil.format( AV12AlbRFen_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfen_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfen_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfen_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfen_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbref_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbref_Internalname, httpContext.getMessage( "Referencia Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbref_Internalname, GXutil.rtrim( AV6AlbRef), GXutil.rtrim( localUtil.format( AV6AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbref_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbref_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbref_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbref_to_Internalname, httpContext.getMessage( "Referencia Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbref_to_Internalname, GXutil.rtrim( AV7AlbRef_to), GXutil.rtrim( localUtil.format( AV7AlbRef_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbref_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbref_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudo_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrentfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrentfrom_Internalname, httpContext.getMessage( "Doc. Entrega Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrentfrom_Internalname, GXutil.rtrim( AV8AlbREntfrom), GXutil.rtrim( localUtil.format( AV8AlbREntfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrentfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrentfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrentto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrentto_Internalname, httpContext.getMessage( "Doc. Entrega Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrentto_Internalname, GXutil.rtrim( AV9AlbREntto), GXutil.rtrim( localUtil.format( AV9AlbREntto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrentto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrentto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudo_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbrtartc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_albrtartc_Internalname, httpContext.getMessage( "Tipo Art. Inicial", ""), "", "", lblTextblockcombo_albrtartc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_albrtartc.setProperty("Caption", Combo_albrtartc_Caption);
         ucCombo_albrtartc.setProperty("Cls", Combo_albrtartc_Cls);
         ucCombo_albrtartc.setProperty("EmptyItemText", Combo_albrtartc_Emptyitemtext);
         ucCombo_albrtartc.setProperty("DropDownOptionsData", AV14AlbRTartC_Data);
         ucCombo_albrtartc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albrtartc_Internalname, "COMBO_ALBRTARTCContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbrtartc_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_albrtartc_to_Internalname, httpContext.getMessage( "Tipo Art. Final", ""), "", "", lblTextblockcombo_albrtartc_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_albrtartc_to.setProperty("Caption", Combo_albrtartc_to_Caption);
         ucCombo_albrtartc_to.setProperty("Cls", Combo_albrtartc_to_Cls);
         ucCombo_albrtartc_to.setProperty("EmptyItemText", Combo_albrtartc_to_Emptyitemtext);
         ucCombo_albrtartc_to.setProperty("DropDownOptionsData", AV16AlbRTartC_to_Data);
         ucCombo_albrtartc_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albrtartc_to_Internalname, "COMBO_ALBRTARTC_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipentcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipentcod_Internalname, httpContext.getMessage( "Tipo Entrada", ""), "", "", lblTextblockcombo_tipentcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipentcod.setProperty("Caption", Combo_tipentcod_Caption);
         ucCombo_tipentcod.setProperty("Cls", Combo_tipentcod_Cls);
         ucCombo_tipentcod.setProperty("EmptyItemText", Combo_tipentcod_Emptyitemtext);
         ucCombo_tipentcod.setProperty("DropDownOptionsData", AV27TipEntCod_Data);
         ucCombo_tipentcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipentcod_Internalname, "COMBO_TIPENTCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbrestin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbrestin.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbrestin, cmbavAlbrestin.getInternalname(), GXutil.trim( GXutil.str( AV10AlbrestIN, 1, 0)), 1, cmbavAlbrestin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAlbrestin.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "", true, (byte)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         cmbavAlbrestin.setValue( GXutil.trim( GXutil.str( AV10AlbrestIN, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrestin.getInternalname(), "Values", cmbavAlbrestin.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipo.getInternalname(), httpContext.getMessage( "Tipo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipo, cmbavTipo.getInternalname(), GXutil.rtrim( AV28Tipo), 1, cmbavTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "", true, (byte)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         cmbavTipo.setValue( GXutil.rtrim( AV28Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
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
         /* User Defined Control */
         ucDvpanel_panel_filtrosmas.setProperty("Width", Dvpanel_panel_filtrosmas_Width);
         ucDvpanel_panel_filtrosmas.setProperty("AutoWidth", Dvpanel_panel_filtrosmas_Autowidth);
         ucDvpanel_panel_filtrosmas.setProperty("AutoHeight", Dvpanel_panel_filtrosmas_Autoheight);
         ucDvpanel_panel_filtrosmas.setProperty("Cls", Dvpanel_panel_filtrosmas_Cls);
         ucDvpanel_panel_filtrosmas.setProperty("Title", Dvpanel_panel_filtrosmas_Title);
         ucDvpanel_panel_filtrosmas.setProperty("Collapsible", Dvpanel_panel_filtrosmas_Collapsible);
         ucDvpanel_panel_filtrosmas.setProperty("Collapsed", Dvpanel_panel_filtrosmas_Collapsed);
         ucDvpanel_panel_filtrosmas.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosmas_Showcollapseicon);
         ucDvpanel_panel_filtrosmas.setProperty("IconPosition", Dvpanel_panel_filtrosmas_Iconposition);
         ucDvpanel_panel_filtrosmas.setProperty("AutoScroll", Dvpanel_panel_filtrosmas_Autoscroll);
         ucDvpanel_panel_filtrosmas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosmas_Internalname, "DVPANEL_PANEL_FILTROSMASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSMASContainer"+"Panel_FiltrosMas"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosmas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProcedenciastransportistas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprocecodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_procecodfrom_Internalname, httpContext.getMessage( "Procedencia Inicial", ""), "", "", lblTextblockcombo_procecodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_procecodfrom.setProperty("Caption", Combo_procecodfrom_Caption);
         ucCombo_procecodfrom.setProperty("Cls", Combo_procecodfrom_Cls);
         ucCombo_procecodfrom.setProperty("EmptyItemText", Combo_procecodfrom_Emptyitemtext);
         ucCombo_procecodfrom.setProperty("DropDownOptionsData", AV23ProceCodfrom_Data);
         ucCombo_procecodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_procecodfrom_Internalname, "COMBO_PROCECODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprocecodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_procecodto_Internalname, httpContext.getMessage( "Procedencia Final", ""), "", "", lblTextblockcombo_procecodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_procecodto.setProperty("Caption", Combo_procecodto_Caption);
         ucCombo_procecodto.setProperty("Cls", Combo_procecodto_Cls);
         ucCombo_procecodto.setProperty("EmptyItemText", Combo_procecodto_Emptyitemtext);
         ucCombo_procecodto.setProperty("DropDownOptionsData", AV25ProceCodto_Data);
         ucCombo_procecodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_procecodto_Internalname, "COMBO_PROCECODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_trncodfrom_Internalname, httpContext.getMessage( "Transportista Inicial", ""), "", "", lblTextblockcombo_trncodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_trncodfrom.setProperty("Caption", Combo_trncodfrom_Caption);
         ucCombo_trncodfrom.setProperty("Cls", Combo_trncodfrom_Cls);
         ucCombo_trncodfrom.setProperty("EmptyItemText", Combo_trncodfrom_Emptyitemtext);
         ucCombo_trncodfrom.setProperty("DropDownOptionsData", AV30TrnCodfrom_Data);
         ucCombo_trncodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncodfrom_Internalname, "COMBO_TRNCODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_trncodto_Internalname, httpContext.getMessage( "Transportista Final", ""), "", "", lblTextblockcombo_trncodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_trncodto.setProperty("Caption", Combo_trncodto_Caption);
         ucCombo_trncodto.setProperty("Cls", Combo_trncodto_Cls);
         ucCombo_trncodto.setProperty("EmptyItemText", Combo_trncodto_Emptyitemtext);
         ucCombo_trncodto.setProperty("DropDownOptionsData", AV32TrnCodto_Data);
         ucCombo_trncodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncodto_Internalname, "COMBO_TRNCODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_nrecepcion.setProperty("Width", Dvpanel_nrecepcion_Width);
         ucDvpanel_nrecepcion.setProperty("AutoWidth", Dvpanel_nrecepcion_Autowidth);
         ucDvpanel_nrecepcion.setProperty("AutoHeight", Dvpanel_nrecepcion_Autoheight);
         ucDvpanel_nrecepcion.setProperty("Cls", Dvpanel_nrecepcion_Cls);
         ucDvpanel_nrecepcion.setProperty("Title", Dvpanel_nrecepcion_Title);
         ucDvpanel_nrecepcion.setProperty("Collapsible", Dvpanel_nrecepcion_Collapsible);
         ucDvpanel_nrecepcion.setProperty("Collapsed", Dvpanel_nrecepcion_Collapsed);
         ucDvpanel_nrecepcion.setProperty("ShowCollapseIcon", Dvpanel_nrecepcion_Showcollapseicon);
         ucDvpanel_nrecepcion.setProperty("IconPosition", Dvpanel_nrecepcion_Iconposition);
         ucDvpanel_nrecepcion.setProperty("AutoScroll", Dvpanel_nrecepcion_Autoscroll);
         ucDvpanel_nrecepcion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_nrecepcion_Internalname, "DVPANEL_NRECEPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_NRECEPCIONContainer"+"NRecepcion"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divNrecepcion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbreccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbreccod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar(Resultados)", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resumen Cliente/Referencia", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab01") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0190"+"", GXutil.rtrim( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0190"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudoclientereferencia_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0190"+"");
               }
               WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudoclientereferencia_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Resumen Cliente", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab02") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0198"+"", GXutil.rtrim( WebComp_Wcalmacentejidoencrudocliente_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0198"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudocliente_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudocliente_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudocliente_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0198"+"");
               }
               WebComp_Wcalmacentejidoencrudocliente_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudocliente_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudocliente_wc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab03_title_Internalname, httpContext.getMessage( "Informe Detallado", ""), "", "", lblTab03_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab03") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0206"+"", GXutil.rtrim( WebComp_Wcalmacentejidoencrudodetalle_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0206"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudodetalle_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudodetalle_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudodetalle_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0206"+"");
               }
               WebComp_Wcalmacentejidoencrudodetalle_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudodetalle_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudodetalle_wc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab04_title_Internalname, httpContext.getMessage( "Informe Distribucion por Hdr(s)", ""), "", "", lblTab04_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab04") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0214"+"", GXutil.rtrim( WebComp_Wcalmacentejidoencrudodistribucion_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0214"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudodistribucion_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudodistribucion_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudodistribucion_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0214"+"");
               }
               WebComp_Wcalmacentejidoencrudodistribucion_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcalmacentejidoencrudodistribucion_wc), GXutil.lower( WebComp_Wcalmacentejidoencrudodistribucion_wc_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV44Pgmname), GXutil.rtrim( localUtil.format( AV44Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV17CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,228);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV19CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19CliCod_to), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_to_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 230,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrtartc_Internalname, GXutil.ltrim( localUtil.ntoc( AV13AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13AlbRTartC), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,230);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrtartc_Jsonclick, 0, "Attribute", "", "", "", "", edtavAlbrtartc_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrtartc_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV15AlbRTartC_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15AlbRTartC_to), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrtartc_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavAlbrtartc_to_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipentcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV26TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TipEntCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,232);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipentcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipentcod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcecodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV22ProceCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22ProceCodfrom), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,233);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcecodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavProcecodfrom_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcecodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV24ProceCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24ProceCodto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcecodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavProcecodto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTrncodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV29TrnCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TrnCodfrom), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavTrncodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavTrncodfrom_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTrncodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV31TrnCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TrnCodto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavTrncodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavTrncodto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenTejidoencrudo_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2DK2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido en Crudo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2DK0( ) ;
   }

   public void ws2DK2( )
   {
      start2DK2( ) ;
      evt2DK2( ) ;
   }

   public void evt2DK2( )
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
                           e112DK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e122DK2 ();
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
                                 e132DK2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e142DK2 ();
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
                     if ( nCmpId == 190 )
                     {
                        OldWcalmacentejidoencrudoclientereferencia_wc = httpContext.cgiGet( "W0190") ;
                        if ( ( GXutil.len( OldWcalmacentejidoencrudoclientereferencia_wc) == 0 ) || ( GXutil.strcmp(OldWcalmacentejidoencrudoclientereferencia_wc, WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component) != 0 ) )
                        {
                           WebComp_Wcalmacentejidoencrudoclientereferencia_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcalmacentejidoencrudoclientereferencia_wc + "_impl", remoteHandle, context);
                           WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component = OldWcalmacentejidoencrudoclientereferencia_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component) != 0 )
                        {
                           WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentprocess("W0190", "", sEvt);
                        }
                        WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component = OldWcalmacentejidoencrudoclientereferencia_wc ;
                     }
                     else if ( nCmpId == 198 )
                     {
                        OldWcalmacentejidoencrudocliente_wc = httpContext.cgiGet( "W0198") ;
                        if ( ( GXutil.len( OldWcalmacentejidoencrudocliente_wc) == 0 ) || ( GXutil.strcmp(OldWcalmacentejidoencrudocliente_wc, WebComp_Wcalmacentejidoencrudocliente_wc_Component) != 0 ) )
                        {
                           WebComp_Wcalmacentejidoencrudocliente_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcalmacentejidoencrudocliente_wc + "_impl", remoteHandle, context);
                           WebComp_Wcalmacentejidoencrudocliente_wc_Component = OldWcalmacentejidoencrudocliente_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcalmacentejidoencrudocliente_wc_Component) != 0 )
                        {
                           WebComp_Wcalmacentejidoencrudocliente_wc.componentprocess("W0198", "", sEvt);
                        }
                        WebComp_Wcalmacentejidoencrudocliente_wc_Component = OldWcalmacentejidoencrudocliente_wc ;
                     }
                     else if ( nCmpId == 206 )
                     {
                        OldWcalmacentejidoencrudodetalle_wc = httpContext.cgiGet( "W0206") ;
                        if ( ( GXutil.len( OldWcalmacentejidoencrudodetalle_wc) == 0 ) || ( GXutil.strcmp(OldWcalmacentejidoencrudodetalle_wc, WebComp_Wcalmacentejidoencrudodetalle_wc_Component) != 0 ) )
                        {
                           WebComp_Wcalmacentejidoencrudodetalle_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcalmacentejidoencrudodetalle_wc + "_impl", remoteHandle, context);
                           WebComp_Wcalmacentejidoencrudodetalle_wc_Component = OldWcalmacentejidoencrudodetalle_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcalmacentejidoencrudodetalle_wc_Component) != 0 )
                        {
                           WebComp_Wcalmacentejidoencrudodetalle_wc.componentprocess("W0206", "", sEvt);
                        }
                        WebComp_Wcalmacentejidoencrudodetalle_wc_Component = OldWcalmacentejidoencrudodetalle_wc ;
                     }
                     else if ( nCmpId == 214 )
                     {
                        OldWcalmacentejidoencrudodistribucion_wc = httpContext.cgiGet( "W0214") ;
                        if ( ( GXutil.len( OldWcalmacentejidoencrudodistribucion_wc) == 0 ) || ( GXutil.strcmp(OldWcalmacentejidoencrudodistribucion_wc, WebComp_Wcalmacentejidoencrudodistribucion_wc_Component) != 0 ) )
                        {
                           WebComp_Wcalmacentejidoencrudodistribucion_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcalmacentejidoencrudodistribucion_wc + "_impl", remoteHandle, context);
                           WebComp_Wcalmacentejidoencrudodistribucion_wc_Component = OldWcalmacentejidoencrudodistribucion_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcalmacentejidoencrudodistribucion_wc_Component) != 0 )
                        {
                           WebComp_Wcalmacentejidoencrudodistribucion_wc.componentprocess("W0214", "", sEvt);
                        }
                        WebComp_Wcalmacentejidoencrudodistribucion_wc_Component = OldWcalmacentejidoencrudodistribucion_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2DK2( )
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

   public void pa2DK2( )
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
            GX_FocusControl = edtavAlbrfen_Internalname ;
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
      if ( cmbavAlbrestin.getItemCount() > 0 )
      {
         AV10AlbrestIN = (byte)(GXutil.lval( cmbavAlbrestin.getValidValue(GXutil.trim( GXutil.str( AV10AlbrestIN, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrestIN", GXutil.str( AV10AlbrestIN, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbrestin.setValue( GXutil.trim( GXutil.str( AV10AlbrestIN, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrestin.getInternalname(), "Values", cmbavAlbrestin.ToJavascriptSource(), true);
      }
      if ( cmbavTipo.getItemCount() > 0 )
      {
         AV28Tipo = cmbavTipo.getValidValue(AV28Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tipo", AV28Tipo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipo.setValue( GXutil.rtrim( AV28Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2DK2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV44Pgmname = "AlmacenTejidoencrudo_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DK2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component) != 0 )
            {
               WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudocliente_wc_Component) != 0 )
            {
               WebComp_Wcalmacentejidoencrudocliente_wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudodetalle_wc_Component) != 0 )
            {
               WebComp_Wcalmacentejidoencrudodetalle_wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcalmacentejidoencrudodistribucion_wc_Component) != 0 )
            {
               WebComp_Wcalmacentejidoencrudodistribucion_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e142DK2 ();
         wb2DK0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2DK2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV44Pgmname = "AlmacenTejidoencrudo_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DK0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112DK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV18CliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_TO_DATA"), AV20CliCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBRTARTC_DATA"), AV14AlbRTartC_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBRTARTC_TO_DATA"), AV16AlbRTartC_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPENTCOD_DATA"), AV27TipEntCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROCECODFROM_DATA"), AV23ProceCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROCECODTO_DATA"), AV25ProceCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCODFROM_DATA"), AV30TrnCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCODTO_DATA"), AV32TrnCodto_Data);
         /* Read saved values. */
         AV40AlbRTartC_to2 = (short)(localUtil.ctol( httpContext.cgiGet( "vALBRTARTC_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38AlbRef_to2 = httpContext.cgiGet( "vALBREF_TO2") ;
         AV39AlbRFen_to2 = localUtil.ctod( httpContext.cgiGet( "vALBRFEN_TO2"), 0) ;
         AV41CliCod_to2 = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV35EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
         Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
         Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
         Combo_clicod_to_Cls = httpContext.cgiGet( "COMBO_CLICOD_TO_Cls") ;
         Combo_clicod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_TO_Selectedvalue_set") ;
         Combo_clicod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_TO_Emptyitemtext") ;
         Combo_albrtartc_Cls = httpContext.cgiGet( "COMBO_ALBRTARTC_Cls") ;
         Combo_albrtartc_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBRTARTC_Selectedvalue_set") ;
         Combo_albrtartc_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBRTARTC_Emptyitemtext") ;
         Combo_albrtartc_to_Cls = httpContext.cgiGet( "COMBO_ALBRTARTC_TO_Cls") ;
         Combo_albrtartc_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBRTARTC_TO_Selectedvalue_set") ;
         Combo_albrtartc_to_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBRTARTC_TO_Emptyitemtext") ;
         Combo_tipentcod_Cls = httpContext.cgiGet( "COMBO_TIPENTCOD_Cls") ;
         Combo_tipentcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPENTCOD_Selectedvalue_set") ;
         Combo_tipentcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPENTCOD_Emptyitemtext") ;
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
         Combo_procecodfrom_Cls = httpContext.cgiGet( "COMBO_PROCECODFROM_Cls") ;
         Combo_procecodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROCECODFROM_Selectedvalue_set") ;
         Combo_procecodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_PROCECODFROM_Emptyitemtext") ;
         Combo_procecodto_Cls = httpContext.cgiGet( "COMBO_PROCECODTO_Cls") ;
         Combo_procecodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROCECODTO_Selectedvalue_set") ;
         Combo_procecodto_Emptyitemtext = httpContext.cgiGet( "COMBO_PROCECODTO_Emptyitemtext") ;
         Combo_trncodfrom_Cls = httpContext.cgiGet( "COMBO_TRNCODFROM_Cls") ;
         Combo_trncodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRNCODFROM_Selectedvalue_set") ;
         Combo_trncodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_TRNCODFROM_Emptyitemtext") ;
         Combo_trncodto_Cls = httpContext.cgiGet( "COMBO_TRNCODTO_Cls") ;
         Combo_trncodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRNCODTO_Selectedvalue_set") ;
         Combo_trncodto_Emptyitemtext = httpContext.cgiGet( "COMBO_TRNCODTO_Emptyitemtext") ;
         Dvpanel_nrecepcion_Width = httpContext.cgiGet( "DVPANEL_NRECEPCION_Width") ;
         Dvpanel_nrecepcion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_NRECEPCION_Autowidth")) ;
         Dvpanel_nrecepcion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_NRECEPCION_Autoheight")) ;
         Dvpanel_nrecepcion_Cls = httpContext.cgiGet( "DVPANEL_NRECEPCION_Cls") ;
         Dvpanel_nrecepcion_Title = httpContext.cgiGet( "DVPANEL_NRECEPCION_Title") ;
         Dvpanel_nrecepcion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_NRECEPCION_Collapsible")) ;
         Dvpanel_nrecepcion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_NRECEPCION_Collapsed")) ;
         Dvpanel_nrecepcion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_NRECEPCION_Showcollapseicon")) ;
         Dvpanel_nrecepcion_Iconposition = httpContext.cgiGet( "DVPANEL_NRECEPCION_Iconposition") ;
         Dvpanel_nrecepcion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_NRECEPCION_Autoscroll")) ;
         Dvpanel_panel_filtrosmas_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Width") ;
         Dvpanel_panel_filtrosmas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autowidth")) ;
         Dvpanel_panel_filtrosmas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autoheight")) ;
         Dvpanel_panel_filtrosmas_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Cls") ;
         Dvpanel_panel_filtrosmas_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Title") ;
         Dvpanel_panel_filtrosmas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Collapsible")) ;
         Dvpanel_panel_filtrosmas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Collapsed")) ;
         Dvpanel_panel_filtrosmas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Showcollapseicon")) ;
         Dvpanel_panel_filtrosmas_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Iconposition") ;
         Dvpanel_panel_filtrosmas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autoscroll")) ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN");
            GX_FocusControl = edtavAlbrfen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11AlbRFen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRFen", localUtil.format(AV11AlbRFen, "99/99/99"));
         }
         else
         {
            AV11AlbRFen = localUtil.ctod( httpContext.cgiGet( edtavAlbrfen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRFen", localUtil.format(AV11AlbRFen, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfen_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN_TO");
            GX_FocusControl = edtavAlbrfen_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12AlbRFen_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRFen_to", localUtil.format(AV12AlbRFen_to, "99/99/99"));
         }
         else
         {
            AV12AlbRFen_to = localUtil.ctod( httpContext.cgiGet( edtavAlbrfen_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRFen_to", localUtil.format(AV12AlbRFen_to, "99/99/99"));
         }
         AV6AlbRef = httpContext.cgiGet( edtavAlbref_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6AlbRef", AV6AlbRef);
         AV7AlbRef_to = httpContext.cgiGet( edtavAlbref_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRef_to", AV7AlbRef_to);
         AV8AlbREntfrom = httpContext.cgiGet( edtavAlbrentfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlbREntfrom", AV8AlbREntfrom);
         AV9AlbREntto = httpContext.cgiGet( edtavAlbrentto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbREntto", AV9AlbREntto);
         cmbavAlbrestin.setValue( httpContext.cgiGet( cmbavAlbrestin.getInternalname()) );
         AV10AlbrestIN = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAlbrestin.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrestIN", GXutil.str( AV10AlbrestIN, 1, 0));
         cmbavTipo.setValue( httpContext.cgiGet( cmbavTipo.getInternalname()) );
         AV28Tipo = httpContext.cgiGet( cmbavTipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tipo", AV28Tipo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRECCOD");
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbRecCod), 8, 0));
         }
         else
         {
            AV5AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AlbRecCod), 8, 0));
         }
         AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCod), 6, 0));
         }
         else
         {
            AV17CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD_TO");
            GX_FocusControl = edtavClicod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19CliCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCod_to), 6, 0));
         }
         else
         {
            AV19CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCod_to), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrtartc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrtartc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRTARTC");
            GX_FocusControl = edtavAlbrtartc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13AlbRTartC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlbRTartC), 4, 0));
         }
         else
         {
            AV13AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbrtartc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13AlbRTartC), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrtartc_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrtartc_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRTARTC_TO");
            GX_FocusControl = edtavAlbrtartc_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15AlbRTartC_to = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbRTartC_to), 4, 0));
         }
         else
         {
            AV15AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbrtartc_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbRTartC_to), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipentcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipentcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPENTCOD");
            GX_FocusControl = edtavTipentcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26TipEntCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TipEntCod), 4, 0));
         }
         else
         {
            AV26TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipentcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TipEntCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProcecodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProcecodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROCECODFROM");
            GX_FocusControl = edtavProcecodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22ProceCodfrom = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ProceCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ProceCodfrom), 4, 0));
         }
         else
         {
            AV22ProceCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( edtavProcecodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ProceCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ProceCodfrom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProcecodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProcecodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROCECODTO");
            GX_FocusControl = edtavProcecodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24ProceCodto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ProceCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ProceCodto), 4, 0));
         }
         else
         {
            AV24ProceCodto = (short)(localUtil.ctol( httpContext.cgiGet( edtavProcecodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ProceCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ProceCodto), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTrncodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTrncodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRNCODFROM");
            GX_FocusControl = edtavTrncodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29TrnCodfrom = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TrnCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TrnCodfrom), 4, 0));
         }
         else
         {
            AV29TrnCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( edtavTrncodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TrnCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TrnCodfrom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTrncodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTrncodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRNCODTO");
            GX_FocusControl = edtavTrncodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31TrnCodto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TrnCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TrnCodto), 4, 0));
         }
         else
         {
            AV31TrnCodto = (short)(localUtil.ctol( httpContext.cgiGet( edtavTrncodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TrnCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TrnCodto), 4, 0));
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
      e112DK2 ();
      if (returnInSub) return;
   }

   public void e112DK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV34Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejidoencrudo_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Station = GXt_char1 ;
      GXv_char2[0] = AV35EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char4[0] = AV37UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejidoencrudo_wp_impl.this.AV35EmprCod = GXv_char2[0] ;
      almacentejidoencrudo_wp_impl.this.AV36EmprNom = GXv_char3[0] ;
      almacentejidoencrudo_wp_impl.this.AV37UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      edtavTrncodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrncodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrncodto_Visible), 5, 0), true);
      edtavTrncodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrncodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrncodfrom_Visible), 5, 0), true);
      edtavProcecodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcecodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcecodto_Visible), 5, 0), true);
      edtavProcecodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcecodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcecodfrom_Visible), 5, 0), true);
      edtavTipentcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipentcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipentcod_Visible), 5, 0), true);
      edtavAlbrtartc_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrtartc_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrtartc_to_Visible), 5, 0), true);
      edtavAlbrtartc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrtartc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrtartc_Visible), 5, 0), true);
      edtavClicod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_to_Visible), 5, 0), true);
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICOD_TO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOALBRTARTC' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOALBRTARTC_TO' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPENTCOD' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPROCECODFROM' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPROCECODTO' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTRNCODFROM' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTRNCODTO' */
      S192 ();
      if (returnInSub) return;
      AV10AlbrestIN = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrestIN", GXutil.str( AV10AlbrestIN, 1, 0));
      AV11AlbRFen = GXutil.dadd(Gx_date,-(180)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRFen", localUtil.format(AV11AlbRFen, "99/99/99"));
      AV12AlbRFen_to = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRFen_to", localUtil.format(AV12AlbRFen_to, "99/99/99"));
   }

   public void e122DK2( )
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

   public void S192( )
   {
      /* 'LOADCOMBOTRNCODTO' Routine */
      returnInSub = false ;
      /* Using cursor H02DK2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13738TrnCNom = H02DK2_A13738TrnCNom[0] ;
         A840TrnCod = H02DK2_A840TrnCod[0] ;
         A841TrnNom = H02DK2_A841TrnNom[0] ;
         n841TrnNom = H02DK2_n841TrnNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13738TrnCNom );
         AV32TrnCodto_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_trncodto_Selectedvalue_set = ((0==AV31TrnCodto) ? "" : GXutil.trim( GXutil.str( AV31TrnCodto, 4, 0))) ;
      ucCombo_trncodto.sendProperty(context, "", false, Combo_trncodto_Internalname, "SelectedValue_set", Combo_trncodto_Selectedvalue_set);
   }

   public void S182( )
   {
      /* 'LOADCOMBOTRNCODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H02DK3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13738TrnCNom = H02DK3_A13738TrnCNom[0] ;
         A840TrnCod = H02DK3_A840TrnCod[0] ;
         A841TrnNom = H02DK3_A841TrnNom[0] ;
         n841TrnNom = H02DK3_n841TrnNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13738TrnCNom );
         AV30TrnCodfrom_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_trncodfrom_Selectedvalue_set = ((0==AV29TrnCodfrom) ? "" : GXutil.trim( GXutil.str( AV29TrnCodfrom, 4, 0))) ;
      ucCombo_trncodfrom.sendProperty(context, "", false, Combo_trncodfrom_Internalname, "SelectedValue_set", Combo_trncodfrom_Selectedvalue_set);
   }

   public void S172( )
   {
      /* 'LOADCOMBOPROCECODTO' Routine */
      returnInSub = false ;
      /* Using cursor H02DK4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13820ProceNomID = H02DK4_A13820ProceNomID[0] ;
         A970ProceCod = H02DK4_A970ProceCod[0] ;
         A971ProceNom = H02DK4_A971ProceNom[0] ;
         n971ProceNom = H02DK4_n971ProceNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13820ProceNomID );
         AV25ProceCodto_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_procecodto_Selectedvalue_set = ((0==AV24ProceCodto) ? "" : GXutil.trim( GXutil.str( AV24ProceCodto, 4, 0))) ;
      ucCombo_procecodto.sendProperty(context, "", false, Combo_procecodto_Internalname, "SelectedValue_set", Combo_procecodto_Selectedvalue_set);
   }

   public void S162( )
   {
      /* 'LOADCOMBOPROCECODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H02DK5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13820ProceNomID = H02DK5_A13820ProceNomID[0] ;
         A970ProceCod = H02DK5_A970ProceCod[0] ;
         A971ProceNom = H02DK5_A971ProceNom[0] ;
         n971ProceNom = H02DK5_n971ProceNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13820ProceNomID );
         AV23ProceCodfrom_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_procecodfrom_Selectedvalue_set = ((0==AV22ProceCodfrom) ? "" : GXutil.trim( GXutil.str( AV22ProceCodfrom, 4, 0))) ;
      ucCombo_procecodfrom.sendProperty(context, "", false, Combo_procecodfrom_Internalname, "SelectedValue_set", Combo_procecodfrom_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'LOADCOMBOTIPENTCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02DK6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13821TipEntNomI = H02DK6_A13821TipEntNomI[0] ;
         A1211TipEntCod = H02DK6_A1211TipEntCod[0] ;
         A1212TipEntNom = H02DK6_A1212TipEntNom[0] ;
         n1212TipEntNom = H02DK6_n1212TipEntNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13821TipEntNomI );
         AV27TipEntCod_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_tipentcod_Selectedvalue_set = ((0==AV26TipEntCod) ? "" : GXutil.trim( GXutil.str( AV26TipEntCod, 4, 0))) ;
      ucCombo_tipentcod.sendProperty(context, "", false, Combo_tipentcod_Internalname, "SelectedValue_set", Combo_tipentcod_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOALBRTARTC_TO' Routine */
      returnInSub = false ;
      /* Using cursor H02DK7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A13788TipArtCodD = H02DK7_A13788TipArtCodD[0] ;
         A829TipArtCod = H02DK7_A829TipArtCod[0] ;
         A830TipArtDsc = H02DK7_A830TipArtDsc[0] ;
         n830TipArtDsc = H02DK7_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H02DK7_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H02DK7_n6014TipArtDsc2[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV16AlbRTartC_to_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_albrtartc_to_Selectedvalue_set = ((0==AV15AlbRTartC_to) ? "" : GXutil.trim( GXutil.str( AV15AlbRTartC_to, 4, 0))) ;
      ucCombo_albrtartc_to.sendProperty(context, "", false, Combo_albrtartc_to_Internalname, "SelectedValue_set", Combo_albrtartc_to_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOALBRTARTC' Routine */
      returnInSub = false ;
      /* Using cursor H02DK8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13788TipArtCodD = H02DK8_A13788TipArtCodD[0] ;
         A829TipArtCod = H02DK8_A829TipArtCod[0] ;
         A830TipArtDsc = H02DK8_A830TipArtDsc[0] ;
         n830TipArtDsc = H02DK8_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H02DK8_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H02DK8_n6014TipArtDsc2[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV14AlbRTartC_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_albrtartc_Selectedvalue_set = ((0==AV13AlbRTartC) ? "" : GXutil.trim( GXutil.str( AV13AlbRTartC, 4, 0))) ;
      ucCombo_albrtartc.sendProperty(context, "", false, Combo_albrtartc_Internalname, "SelectedValue_set", Combo_albrtartc_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICOD_TO' Routine */
      returnInSub = false ;
      /* Using cursor H02DK9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         A10045CliAct = H02DK9_A10045CliAct[0] ;
         A13735CliCNom = H02DK9_A13735CliCNom[0] ;
         A252CliCod = H02DK9_A252CliCod[0] ;
         A279CliNom = H02DK9_A279CliNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV20CliCod_to_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      Combo_clicod_to_Selectedvalue_set = ((0==AV19CliCod_to) ? "" : GXutil.trim( GXutil.str( AV19CliCod_to, 6, 0))) ;
      ucCombo_clicod_to.sendProperty(context, "", false, Combo_clicod_to_Internalname, "SelectedValue_set", Combo_clicod_to_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      /* Using cursor H02DK10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A10045CliAct = H02DK10_A10045CliAct[0] ;
         A13735CliCNom = H02DK10_A13735CliCNom[0] ;
         A252CliCod = H02DK10_A252CliCod[0] ;
         A279CliNom = H02DK10_A279CliNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV18CliCod_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      Combo_clicod_Selectedvalue_set = ((0==AV17CliCod) ? "" : GXutil.trim( GXutil.str( AV17CliCod, 6, 0))) ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e132DK2 ();
      if (returnInSub) return;
   }

   public void e132DK2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV38AlbRef_to2 = ((GXutil.strcmp("", AV7AlbRef_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV7AlbRef_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38AlbRef_to2", AV38AlbRef_to2);
      AV39AlbRFen_to2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12AlbRFen_to)) ? GXutil.today( ) : AV12AlbRFen_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39AlbRFen_to2", localUtil.format(AV39AlbRFen_to2, "99/99/99"));
      AV40AlbRTartC_to2 = (short)(((0==AV15AlbRTartC_to) ? 9999 : AV15AlbRTartC_to)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbRTartC_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40AlbRTartC_to2), 4, 0));
      AV41CliCod_to2 = ((0==AV19CliCod_to) ? 999999 : AV19CliCod_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41CliCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41CliCod_to2), 6, 0));
      AV33ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV33ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV33ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
      AV33ProgressIndicator.show();
      AV33ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "SelectTab", "", new Object[] {Integer.valueOf(1)});
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcalmacentejidoencrudoclientereferencia_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component), GXutil.lower( "AlmacenTejidoencrudoClienteReferencia_WC")) != 0 )
      {
         WebComp_Wcalmacentejidoencrudoclientereferencia_wc = WebUtils.getWebComponent(getClass(), "app.almacentejidoencrudoclientereferencia_wc_impl", remoteHandle, context);
         WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component = "AlmacenTejidoencrudoClienteReferencia_WC" ;
      }
      if ( GXutil.len( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component) != 0 )
      {
         WebComp_Wcalmacentejidoencrudoclientereferencia_wc.setjustcreated();
         WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentprepare(new Object[] {"W0190","",AV35EmprCod,Integer.valueOf(AV17CliCod),Integer.valueOf(AV41CliCod_to2),AV11AlbRFen,AV39AlbRFen_to2,AV6AlbRef,AV38AlbRef_to2,AV8AlbREntfrom,AV9AlbREntto,Short.valueOf(AV26TipEntCod),Short.valueOf(AV13AlbRTartC),Short.valueOf(AV40AlbRTartC_to2),AV28Tipo});
         WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentbind(new Object[] {"","vCLICOD","","vALBRFEN","","vALBREF","","vALBRENTFROM","vALBRENTTO","vTIPENTCOD","vALBRTARTC","","vTIPO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcalmacentejidoencrudoclientereferencia_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0190"+"");
         WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      AV33ProgressIndicator.setgxTv_SdtProgress_Value( 65 );
      AV33ProgressIndicator.setgxTv_SdtProgress_Value( 75 );
      AV33ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
      AV33ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV33ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ProgressIndicator", AV33ProgressIndicator);
   }

   protected void nextLoad( )
   {
   }

   protected void e142DK2( )
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
      pa2DK2( ) ;
      ws2DK2( ) ;
      we2DK2( ) ;
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
      if ( ! ( WebComp_Wcalmacentejidoencrudoclientereferencia_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component) != 0 )
         {
            WebComp_Wcalmacentejidoencrudoclientereferencia_wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcalmacentejidoencrudocliente_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcalmacentejidoencrudocliente_wc_Component) != 0 )
         {
            WebComp_Wcalmacentejidoencrudocliente_wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcalmacentejidoencrudodetalle_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcalmacentejidoencrudodetalle_wc_Component) != 0 )
         {
            WebComp_Wcalmacentejidoencrudodetalle_wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcalmacentejidoencrudodistribucion_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcalmacentejidoencrudodistribucion_wc_Component) != 0 )
         {
            WebComp_Wcalmacentejidoencrudodistribucion_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171425958", true, true);
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
      httpContext.AddJavascriptSource("almacentejidoencrudo_wp.js", "?20268171425959", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicod_Internalname = "TEXTBLOCKCOMBO_CLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockcombo_clicod_to_Internalname = "TEXTBLOCKCOMBO_CLICOD_TO" ;
      Combo_clicod_to_Internalname = "COMBO_CLICOD_TO" ;
      divTablesplittedclicod_to_Internalname = "TABLESPLITTEDCLICOD_TO" ;
      edtavAlbrfen_Internalname = "vALBRFEN" ;
      edtavAlbrfen_to_Internalname = "vALBRFEN_TO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavAlbref_Internalname = "vALBREF" ;
      edtavAlbref_to_Internalname = "vALBREF_TO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavAlbrentfrom_Internalname = "vALBRENTFROM" ;
      edtavAlbrentto_Internalname = "vALBRENTTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockcombo_albrtartc_Internalname = "TEXTBLOCKCOMBO_ALBRTARTC" ;
      Combo_albrtartc_Internalname = "COMBO_ALBRTARTC" ;
      divTablesplittedalbrtartc_Internalname = "TABLESPLITTEDALBRTARTC" ;
      lblTextblockcombo_albrtartc_to_Internalname = "TEXTBLOCKCOMBO_ALBRTARTC_TO" ;
      Combo_albrtartc_to_Internalname = "COMBO_ALBRTARTC_TO" ;
      divTablesplittedalbrtartc_to_Internalname = "TABLESPLITTEDALBRTARTC_TO" ;
      lblTextblockcombo_tipentcod_Internalname = "TEXTBLOCKCOMBO_TIPENTCOD" ;
      Combo_tipentcod_Internalname = "COMBO_TIPENTCOD" ;
      divTablesplittedtipentcod_Internalname = "TABLESPLITTEDTIPENTCOD" ;
      cmbavAlbrestin.setInternalname( "vALBRESTIN" );
      cmbavTipo.setInternalname( "vTIPO" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      lblTextblockcombo_procecodfrom_Internalname = "TEXTBLOCKCOMBO_PROCECODFROM" ;
      Combo_procecodfrom_Internalname = "COMBO_PROCECODFROM" ;
      divTablesplittedprocecodfrom_Internalname = "TABLESPLITTEDPROCECODFROM" ;
      lblTextblockcombo_procecodto_Internalname = "TEXTBLOCKCOMBO_PROCECODTO" ;
      Combo_procecodto_Internalname = "COMBO_PROCECODTO" ;
      divTablesplittedprocecodto_Internalname = "TABLESPLITTEDPROCECODTO" ;
      lblTextblockcombo_trncodfrom_Internalname = "TEXTBLOCKCOMBO_TRNCODFROM" ;
      Combo_trncodfrom_Internalname = "COMBO_TRNCODFROM" ;
      divTablesplittedtrncodfrom_Internalname = "TABLESPLITTEDTRNCODFROM" ;
      lblTextblockcombo_trncodto_Internalname = "TEXTBLOCKCOMBO_TRNCODTO" ;
      Combo_trncodto_Internalname = "COMBO_TRNCODTO" ;
      divTablesplittedtrncodto_Internalname = "TABLESPLITTEDTRNCODTO" ;
      divProcedenciastransportistas_Internalname = "PROCEDENCIASTRANSPORTISTAS" ;
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      divNrecepcion_Internalname = "NRECEPCION" ;
      Dvpanel_nrecepcion_Internalname = "DVPANEL_NRECEPCION" ;
      divPanel_filtrosmas_Internalname = "PANEL_FILTROSMAS" ;
      Dvpanel_panel_filtrosmas_Internalname = "DVPANEL_PANEL_FILTROSMAS" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      divTableresultado2_Internalname = "TABLERESULTADO2" ;
      lblTab03_title_Internalname = "TAB03_TITLE" ;
      divTableresultado3_Internalname = "TABLERESULTADO3" ;
      lblTab04_title_Internalname = "TAB04_TITLE" ;
      divTableresultado4_Internalname = "TABLERESULTADO4" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      Datamon_Internalname = "DATAMON" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClicod_to_Internalname = "vCLICOD_TO" ;
      edtavAlbrtartc_Internalname = "vALBRTARTC" ;
      edtavAlbrtartc_to_Internalname = "vALBRTARTC_TO" ;
      edtavTipentcod_Internalname = "vTIPENTCOD" ;
      edtavProcecodfrom_Internalname = "vPROCECODFROM" ;
      edtavProcecodto_Internalname = "vPROCECODTO" ;
      edtavTrncodfrom_Internalname = "vTRNCODFROM" ;
      edtavTrncodto_Internalname = "vTRNCODTO" ;
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
      edtavTrncodto_Jsonclick = "" ;
      edtavTrncodto_Visible = 1 ;
      edtavTrncodfrom_Jsonclick = "" ;
      edtavTrncodfrom_Visible = 1 ;
      edtavProcecodto_Jsonclick = "" ;
      edtavProcecodto_Visible = 1 ;
      edtavProcecodfrom_Jsonclick = "" ;
      edtavProcecodfrom_Visible = 1 ;
      edtavTipentcod_Jsonclick = "" ;
      edtavTipentcod_Visible = 1 ;
      edtavAlbrtartc_to_Jsonclick = "" ;
      edtavAlbrtartc_to_Visible = 1 ;
      edtavAlbrtartc_Jsonclick = "" ;
      edtavAlbrtartc_Visible = 1 ;
      edtavClicod_to_Jsonclick = "" ;
      edtavClicod_to_Visible = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavAlbreccod_Jsonclick = "" ;
      edtavAlbreccod_Enabled = 1 ;
      cmbavTipo.setJsonclick( "" );
      cmbavTipo.setEnabled( 1 );
      cmbavAlbrestin.setJsonclick( "" );
      cmbavAlbrestin.setEnabled( 1 );
      edtavAlbrentto_Jsonclick = "" ;
      edtavAlbrentto_Enabled = 1 ;
      edtavAlbrentfrom_Jsonclick = "" ;
      edtavAlbrentfrom_Enabled = 1 ;
      edtavAlbref_to_Jsonclick = "" ;
      edtavAlbref_to_Enabled = 1 ;
      edtavAlbref_Jsonclick = "" ;
      edtavAlbref_Enabled = 1 ;
      edtavAlbrfen_to_Jsonclick = "" ;
      edtavAlbrfen_to_Enabled = 1 ;
      edtavAlbrfen_Jsonclick = "" ;
      edtavAlbrfen_Enabled = 1 ;
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
      Gxuitabspanel_tabs_Pagecount = 4 ;
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
      Dvpanel_panel_filtrosmas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Iconposition = "Right" ;
      Dvpanel_panel_filtrosmas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Title = httpContext.getMessage( "Informe Detallado", "") ;
      Dvpanel_panel_filtrosmas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosmas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Width = "100%" ;
      Dvpanel_nrecepcion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_nrecepcion_Iconposition = "Right" ;
      Dvpanel_nrecepcion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_nrecepcion_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_nrecepcion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_nrecepcion_Title = httpContext.getMessage( "Informe Distribucion por Hdr(s)", "") ;
      Dvpanel_nrecepcion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_nrecepcion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_nrecepcion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_nrecepcion_Width = "100%" ;
      Combo_trncodto_Emptyitemtext = "Todos" ;
      Combo_trncodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncodfrom_Emptyitemtext = "Todos" ;
      Combo_trncodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Combo_procecodto_Emptyitemtext = "Todas" ;
      Combo_procecodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_procecodfrom_Emptyitemtext = "Todas" ;
      Combo_procecodfrom_Cls = "ExtendedCombo AttributeFL" ;
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
      Combo_tipentcod_Emptyitemtext = "Todas" ;
      Combo_tipentcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albrtartc_to_Emptyitemtext = "Todos" ;
      Combo_albrtartc_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albrtartc_Emptyitemtext = "Todos" ;
      Combo_albrtartc_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_to_Emptyitemtext = "Todos" ;
      Combo_clicod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Emptyitemtext = "Todos" ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Almacen Tejido en Crudo", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbrestin.setName( "vALBRESTIN" );
      cmbavAlbrestin.setWebtags( "" );
      cmbavAlbrestin.addItem("9", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavAlbrestin.addItem("0", httpContext.getMessage( "Abiertas", ""), (short)(0));
      cmbavAlbrestin.addItem("1", httpContext.getMessage( "Cerradas", ""), (short)(0));
      if ( cmbavAlbrestin.getItemCount() > 0 )
      {
         AV10AlbrestIN = (byte)(GXutil.lval( cmbavAlbrestin.getValidValue(GXutil.trim( GXutil.str( AV10AlbrestIN, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrestIN", GXutil.str( AV10AlbrestIN, 1, 0));
      }
      cmbavTipo.setName( "vTIPO" );
      cmbavTipo.setWebtags( "" );
      cmbavTipo.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavTipo.addItem("SI", httpContext.getMessage( "Reclamaciones", ""), (short)(0));
      cmbavTipo.addItem("NO", httpContext.getMessage( "No Reclamaciones", ""), (short)(0));
      if ( cmbavTipo.getItemCount() > 0 )
      {
         AV28Tipo = cmbavTipo.getValidValue(AV28Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tipo", AV28Tipo);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e122DK2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e132DK2',iparms:[{av:'AV7AlbRef_to',fld:'vALBREF_TO',pic:''},{av:'AV12AlbRFen_to',fld:'vALBRFEN_TO',pic:''},{av:'AV15AlbRTartC_to',fld:'vALBRTARTC_TO',pic:'ZZZ9'},{av:'AV19CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV17CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV11AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV6AlbRef',fld:'vALBREF',pic:''},{av:'AV8AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV9AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV26TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV13AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'cmbavTipo'},{av:'AV28Tipo',fld:'vTIPO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV38AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV39AlbRFen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV40AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV41CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{ctrl:'WCALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_WC'}]}");
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
      Combo_trncodto_Selectedvalue_get = "" ;
      Combo_trncodfrom_Selectedvalue_get = "" ;
      Combo_procecodto_Selectedvalue_get = "" ;
      Combo_procecodfrom_Selectedvalue_get = "" ;
      Combo_tipentcod_Selectedvalue_get = "" ;
      Combo_albrtartc_to_Selectedvalue_get = "" ;
      Combo_albrtartc_Selectedvalue_get = "" ;
      Combo_clicod_to_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV35EmprCod = "" ;
      GXKey = "" ;
      AV18CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV20CliCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV14AlbRTartC_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16AlbRTartC_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV27TipEntCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV23ProceCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV25ProceCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV30TrnCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV32TrnCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV39AlbRFen_to2 = GXutil.nullDate() ;
      AV38AlbRef_to2 = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_to_Selectedvalue_set = "" ;
      Combo_albrtartc_Selectedvalue_set = "" ;
      Combo_albrtartc_to_Selectedvalue_set = "" ;
      Combo_tipentcod_Selectedvalue_set = "" ;
      Combo_procecodfrom_Selectedvalue_set = "" ;
      Combo_procecodto_Selectedvalue_set = "" ;
      Combo_trncodfrom_Selectedvalue_set = "" ;
      Combo_trncodto_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      lblTextblockcombo_clicod_to_Jsonclick = "" ;
      ucCombo_clicod_to = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_to_Caption = "" ;
      TempTags = "" ;
      AV11AlbRFen = GXutil.nullDate() ;
      AV12AlbRFen_to = GXutil.nullDate() ;
      AV6AlbRef = "" ;
      AV7AlbRef_to = "" ;
      AV8AlbREntfrom = "" ;
      AV9AlbREntto = "" ;
      lblTextblockcombo_albrtartc_Jsonclick = "" ;
      ucCombo_albrtartc = new com.genexus.webpanels.GXUserControl();
      Combo_albrtartc_Caption = "" ;
      lblTextblockcombo_albrtartc_to_Jsonclick = "" ;
      ucCombo_albrtartc_to = new com.genexus.webpanels.GXUserControl();
      Combo_albrtartc_to_Caption = "" ;
      lblTextblockcombo_tipentcod_Jsonclick = "" ;
      ucCombo_tipentcod = new com.genexus.webpanels.GXUserControl();
      Combo_tipentcod_Caption = "" ;
      AV28Tipo = "" ;
      ucDvpanel_panel_filtrosmas = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_procecodfrom_Jsonclick = "" ;
      ucCombo_procecodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_procecodfrom_Caption = "" ;
      lblTextblockcombo_procecodto_Jsonclick = "" ;
      ucCombo_procecodto = new com.genexus.webpanels.GXUserControl();
      Combo_procecodto_Caption = "" ;
      lblTextblockcombo_trncodfrom_Jsonclick = "" ;
      ucCombo_trncodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_trncodfrom_Caption = "" ;
      lblTextblockcombo_trncodto_Jsonclick = "" ;
      ucCombo_trncodto = new com.genexus.webpanels.GXUserControl();
      Combo_trncodto_Caption = "" ;
      ucDvpanel_nrecepcion = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component = "" ;
      OldWcalmacentejidoencrudoclientereferencia_wc = "" ;
      lblTab02_title_Jsonclick = "" ;
      WebComp_Wcalmacentejidoencrudocliente_wc_Component = "" ;
      OldWcalmacentejidoencrudocliente_wc = "" ;
      lblTab03_title_Jsonclick = "" ;
      WebComp_Wcalmacentejidoencrudodetalle_wc_Component = "" ;
      OldWcalmacentejidoencrudodetalle_wc = "" ;
      lblTab04_title_Jsonclick = "" ;
      WebComp_Wcalmacentejidoencrudodistribucion_wc_Component = "" ;
      OldWcalmacentejidoencrudodistribucion_wc = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV44Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      AV34Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV36EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV37UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      H02DK2_A396EmprCod = new String[] {""} ;
      H02DK2_A13738TrnCNom = new String[] {""} ;
      H02DK2_A840TrnCod = new short[1] ;
      H02DK2_A841TrnNom = new String[] {""} ;
      H02DK2_n841TrnNom = new boolean[] {false} ;
      A13738TrnCNom = "" ;
      A841TrnNom = "" ;
      AV21Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02DK3_A396EmprCod = new String[] {""} ;
      H02DK3_A13738TrnCNom = new String[] {""} ;
      H02DK3_A840TrnCod = new short[1] ;
      H02DK3_A841TrnNom = new String[] {""} ;
      H02DK3_n841TrnNom = new boolean[] {false} ;
      H02DK4_A396EmprCod = new String[] {""} ;
      H02DK4_A13820ProceNomID = new String[] {""} ;
      H02DK4_A970ProceCod = new short[1] ;
      H02DK4_A971ProceNom = new String[] {""} ;
      H02DK4_n971ProceNom = new boolean[] {false} ;
      A13820ProceNomID = "" ;
      A971ProceNom = "" ;
      H02DK5_A396EmprCod = new String[] {""} ;
      H02DK5_A13820ProceNomID = new String[] {""} ;
      H02DK5_A970ProceCod = new short[1] ;
      H02DK5_A971ProceNom = new String[] {""} ;
      H02DK5_n971ProceNom = new boolean[] {false} ;
      H02DK6_A396EmprCod = new String[] {""} ;
      H02DK6_A13821TipEntNomI = new String[] {""} ;
      H02DK6_A1211TipEntCod = new short[1] ;
      H02DK6_A1212TipEntNom = new String[] {""} ;
      H02DK6_n1212TipEntNom = new boolean[] {false} ;
      A13821TipEntNomI = "" ;
      A1212TipEntNom = "" ;
      H02DK7_A396EmprCod = new String[] {""} ;
      H02DK7_A13788TipArtCodD = new String[] {""} ;
      H02DK7_A829TipArtCod = new short[1] ;
      H02DK7_A830TipArtDsc = new String[] {""} ;
      H02DK7_n830TipArtDsc = new boolean[] {false} ;
      H02DK7_A6014TipArtDsc2 = new String[] {""} ;
      H02DK7_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      H02DK8_A396EmprCod = new String[] {""} ;
      H02DK8_A13788TipArtCodD = new String[] {""} ;
      H02DK8_A829TipArtCod = new short[1] ;
      H02DK8_A830TipArtDsc = new String[] {""} ;
      H02DK8_n830TipArtDsc = new boolean[] {false} ;
      H02DK8_A6014TipArtDsc2 = new String[] {""} ;
      H02DK8_n6014TipArtDsc2 = new boolean[] {false} ;
      H02DK9_A396EmprCod = new String[] {""} ;
      H02DK9_A10045CliAct = new String[] {""} ;
      H02DK9_A13735CliCNom = new String[] {""} ;
      H02DK9_A252CliCod = new int[1] ;
      H02DK9_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H02DK10_A396EmprCod = new String[] {""} ;
      H02DK10_A10045CliAct = new String[] {""} ;
      H02DK10_A13735CliCNom = new String[] {""} ;
      H02DK10_A252CliCod = new int[1] ;
      H02DK10_A279CliNom = new String[] {""} ;
      AV33ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacentejidoencrudo_wp__default(),
         new Object[] {
             new Object[] {
            H02DK2_A396EmprCod, H02DK2_A13738TrnCNom, H02DK2_A840TrnCod, H02DK2_A841TrnNom, H02DK2_n841TrnNom
            }
            , new Object[] {
            H02DK3_A396EmprCod, H02DK3_A13738TrnCNom, H02DK3_A840TrnCod, H02DK3_A841TrnNom, H02DK3_n841TrnNom
            }
            , new Object[] {
            H02DK4_A396EmprCod, H02DK4_A13820ProceNomID, H02DK4_A970ProceCod, H02DK4_A971ProceNom, H02DK4_n971ProceNom
            }
            , new Object[] {
            H02DK5_A396EmprCod, H02DK5_A13820ProceNomID, H02DK5_A970ProceCod, H02DK5_A971ProceNom, H02DK5_n971ProceNom
            }
            , new Object[] {
            H02DK6_A396EmprCod, H02DK6_A13821TipEntNomI, H02DK6_A1211TipEntCod, H02DK6_A1212TipEntNom, H02DK6_n1212TipEntNom
            }
            , new Object[] {
            H02DK7_A396EmprCod, H02DK7_A13788TipArtCodD, H02DK7_A829TipArtCod, H02DK7_A830TipArtDsc, H02DK7_n830TipArtDsc, H02DK7_A6014TipArtDsc2, H02DK7_n6014TipArtDsc2
            }
            , new Object[] {
            H02DK8_A396EmprCod, H02DK8_A13788TipArtCodD, H02DK8_A829TipArtCod, H02DK8_A830TipArtDsc, H02DK8_n830TipArtDsc, H02DK8_A6014TipArtDsc2, H02DK8_n6014TipArtDsc2
            }
            , new Object[] {
            H02DK9_A396EmprCod, H02DK9_A10045CliAct, H02DK9_A13735CliCNom, H02DK9_A252CliCod, H02DK9_A279CliNom
            }
            , new Object[] {
            H02DK10_A396EmprCod, H02DK10_A10045CliAct, H02DK10_A13735CliCNom, H02DK10_A252CliCod, H02DK10_A279CliNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV44Pgmname = "AlmacenTejidoencrudo_WP" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV44Pgmname = "AlmacenTejidoencrudo_WP" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcalmacentejidoencrudoclientereferencia_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcalmacentejidoencrudocliente_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcalmacentejidoencrudodetalle_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcalmacentejidoencrudodistribucion_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV10AlbrestIN ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
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
   private short AV40AlbRTartC_to2 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13AlbRTartC ;
   private short AV15AlbRTartC_to ;
   private short AV26TipEntCod ;
   private short AV22ProceCodfrom ;
   private short AV24ProceCodto ;
   private short AV29TrnCodfrom ;
   private short AV31TrnCodto ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short A829TipArtCod ;
   private int Gxuitabspanel_tabs_Activepage ;
   private int AV41CliCod_to2 ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavAlbrfen_Enabled ;
   private int edtavAlbrfen_to_Enabled ;
   private int edtavAlbref_Enabled ;
   private int edtavAlbref_to_Enabled ;
   private int edtavAlbrentfrom_Enabled ;
   private int edtavAlbrentto_Enabled ;
   private int AV5AlbRecCod ;
   private int edtavAlbreccod_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV17CliCod ;
   private int edtavClicod_Visible ;
   private int AV19CliCod_to ;
   private int edtavClicod_to_Visible ;
   private int edtavAlbrtartc_Visible ;
   private int edtavAlbrtartc_to_Visible ;
   private int edtavTipentcod_Visible ;
   private int edtavProcecodfrom_Visible ;
   private int edtavProcecodto_Visible ;
   private int edtavTrncodfrom_Visible ;
   private int edtavTrncodto_Visible ;
   private int A252CliCod ;
   private int idxLst ;
   private String Combo_trncodto_Selectedvalue_get ;
   private String Combo_trncodfrom_Selectedvalue_get ;
   private String Combo_procecodto_Selectedvalue_get ;
   private String Combo_procecodfrom_Selectedvalue_get ;
   private String Combo_tipentcod_Selectedvalue_get ;
   private String Combo_albrtartc_to_Selectedvalue_get ;
   private String Combo_albrtartc_Selectedvalue_get ;
   private String Combo_clicod_to_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV35EmprCod ;
   private String GXKey ;
   private String AV38AlbRef_to2 ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_to_Cls ;
   private String Combo_clicod_to_Selectedvalue_set ;
   private String Combo_clicod_to_Emptyitemtext ;
   private String Combo_albrtartc_Cls ;
   private String Combo_albrtartc_Selectedvalue_set ;
   private String Combo_albrtartc_Emptyitemtext ;
   private String Combo_albrtartc_to_Cls ;
   private String Combo_albrtartc_to_Selectedvalue_set ;
   private String Combo_albrtartc_to_Emptyitemtext ;
   private String Combo_tipentcod_Cls ;
   private String Combo_tipentcod_Selectedvalue_set ;
   private String Combo_tipentcod_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Combo_procecodfrom_Cls ;
   private String Combo_procecodfrom_Selectedvalue_set ;
   private String Combo_procecodfrom_Emptyitemtext ;
   private String Combo_procecodto_Cls ;
   private String Combo_procecodto_Selectedvalue_set ;
   private String Combo_procecodto_Emptyitemtext ;
   private String Combo_trncodfrom_Cls ;
   private String Combo_trncodfrom_Selectedvalue_set ;
   private String Combo_trncodfrom_Emptyitemtext ;
   private String Combo_trncodto_Cls ;
   private String Combo_trncodto_Selectedvalue_set ;
   private String Combo_trncodto_Emptyitemtext ;
   private String Dvpanel_nrecepcion_Width ;
   private String Dvpanel_nrecepcion_Cls ;
   private String Dvpanel_nrecepcion_Title ;
   private String Dvpanel_nrecepcion_Iconposition ;
   private String Dvpanel_panel_filtrosmas_Width ;
   private String Dvpanel_panel_filtrosmas_Cls ;
   private String Dvpanel_panel_filtrosmas_Title ;
   private String Dvpanel_panel_filtrosmas_Iconposition ;
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
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockcombo_clicod_Internalname ;
   private String lblTextblockcombo_clicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Internalname ;
   private String divTablesplittedclicod_to_Internalname ;
   private String lblTextblockcombo_clicod_to_Internalname ;
   private String lblTextblockcombo_clicod_to_Jsonclick ;
   private String Combo_clicod_to_Caption ;
   private String Combo_clicod_to_Internalname ;
   private String edtavAlbrfen_Internalname ;
   private String TempTags ;
   private String edtavAlbrfen_Jsonclick ;
   private String edtavAlbrfen_to_Internalname ;
   private String edtavAlbrfen_to_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavAlbref_Internalname ;
   private String AV6AlbRef ;
   private String edtavAlbref_Jsonclick ;
   private String edtavAlbref_to_Internalname ;
   private String AV7AlbRef_to ;
   private String edtavAlbref_to_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbrentfrom_Internalname ;
   private String AV8AlbREntfrom ;
   private String edtavAlbrentfrom_Jsonclick ;
   private String edtavAlbrentto_Internalname ;
   private String AV9AlbREntto ;
   private String edtavAlbrentto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedalbrtartc_Internalname ;
   private String lblTextblockcombo_albrtartc_Internalname ;
   private String lblTextblockcombo_albrtartc_Jsonclick ;
   private String Combo_albrtartc_Caption ;
   private String Combo_albrtartc_Internalname ;
   private String divTablesplittedalbrtartc_to_Internalname ;
   private String lblTextblockcombo_albrtartc_to_Internalname ;
   private String lblTextblockcombo_albrtartc_to_Jsonclick ;
   private String Combo_albrtartc_to_Caption ;
   private String Combo_albrtartc_to_Internalname ;
   private String divTablesplittedtipentcod_Internalname ;
   private String lblTextblockcombo_tipentcod_Internalname ;
   private String lblTextblockcombo_tipentcod_Jsonclick ;
   private String Combo_tipentcod_Caption ;
   private String Combo_tipentcod_Internalname ;
   private String AV28Tipo ;
   private String Dvpanel_panel_filtrosmas_Internalname ;
   private String divPanel_filtrosmas_Internalname ;
   private String divProcedenciastransportistas_Internalname ;
   private String divTablesplittedprocecodfrom_Internalname ;
   private String lblTextblockcombo_procecodfrom_Internalname ;
   private String lblTextblockcombo_procecodfrom_Jsonclick ;
   private String Combo_procecodfrom_Caption ;
   private String Combo_procecodfrom_Internalname ;
   private String divTablesplittedprocecodto_Internalname ;
   private String lblTextblockcombo_procecodto_Internalname ;
   private String lblTextblockcombo_procecodto_Jsonclick ;
   private String Combo_procecodto_Caption ;
   private String Combo_procecodto_Internalname ;
   private String divTablesplittedtrncodfrom_Internalname ;
   private String lblTextblockcombo_trncodfrom_Internalname ;
   private String lblTextblockcombo_trncodfrom_Jsonclick ;
   private String Combo_trncodfrom_Caption ;
   private String Combo_trncodfrom_Internalname ;
   private String divTablesplittedtrncodto_Internalname ;
   private String lblTextblockcombo_trncodto_Internalname ;
   private String lblTextblockcombo_trncodto_Jsonclick ;
   private String Combo_trncodto_Caption ;
   private String Combo_trncodto_Internalname ;
   private String Dvpanel_nrecepcion_Internalname ;
   private String divNrecepcion_Internalname ;
   private String edtavAlbreccod_Internalname ;
   private String edtavAlbreccod_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcalmacentejidoencrudoclientereferencia_wc_Component ;
   private String OldWcalmacentejidoencrudoclientereferencia_wc ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divTableresultado2_Internalname ;
   private String WebComp_Wcalmacentejidoencrudocliente_wc_Component ;
   private String OldWcalmacentejidoencrudocliente_wc ;
   private String lblTab03_title_Internalname ;
   private String lblTab03_title_Jsonclick ;
   private String divTableresultado3_Internalname ;
   private String WebComp_Wcalmacentejidoencrudodetalle_wc_Component ;
   private String OldWcalmacentejidoencrudodetalle_wc ;
   private String lblTab04_title_Internalname ;
   private String lblTab04_title_Jsonclick ;
   private String divTableresultado4_Internalname ;
   private String WebComp_Wcalmacentejidoencrudodistribucion_wc_Component ;
   private String OldWcalmacentejidoencrudodistribucion_wc ;
   private String Datamon_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV44Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClicod_to_Internalname ;
   private String edtavClicod_to_Jsonclick ;
   private String edtavAlbrtartc_Internalname ;
   private String edtavAlbrtartc_Jsonclick ;
   private String edtavAlbrtartc_to_Internalname ;
   private String edtavAlbrtartc_to_Jsonclick ;
   private String edtavTipentcod_Internalname ;
   private String edtavTipentcod_Jsonclick ;
   private String edtavProcecodfrom_Internalname ;
   private String edtavProcecodfrom_Jsonclick ;
   private String edtavProcecodto_Internalname ;
   private String edtavProcecodto_Jsonclick ;
   private String edtavTrncodfrom_Internalname ;
   private String edtavTrncodfrom_Jsonclick ;
   private String edtavTrncodto_Internalname ;
   private String edtavTrncodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV34Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV36EmprNom ;
   private String GXv_char3[] ;
   private String AV37UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A1212TipEntNom ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private java.util.Date AV39AlbRFen_to2 ;
   private java.util.Date AV11AlbRFen ;
   private java.util.Date AV12AlbRFen_to ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_nrecepcion_Autowidth ;
   private boolean Dvpanel_nrecepcion_Autoheight ;
   private boolean Dvpanel_nrecepcion_Collapsible ;
   private boolean Dvpanel_nrecepcion_Collapsed ;
   private boolean Dvpanel_nrecepcion_Showcollapseicon ;
   private boolean Dvpanel_nrecepcion_Autoscroll ;
   private boolean Dvpanel_panel_filtrosmas_Autowidth ;
   private boolean Dvpanel_panel_filtrosmas_Autoheight ;
   private boolean Dvpanel_panel_filtrosmas_Collapsible ;
   private boolean Dvpanel_panel_filtrosmas_Collapsed ;
   private boolean Dvpanel_panel_filtrosmas_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosmas_Autoscroll ;
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
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n1212TipEntNom ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private boolean bDynCreated_Wcalmacentejidoencrudoclientereferencia_wc ;
   private String A13738TrnCNom ;
   private String A13820ProceNomID ;
   private String A13821TipEntNomI ;
   private String A13788TipArtCodD ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcalmacentejidoencrudoclientereferencia_wc ;
   private GXWebComponent WebComp_Wcalmacentejidoencrudocliente_wc ;
   private GXWebComponent WebComp_Wcalmacentejidoencrudodetalle_wc ;
   private GXWebComponent WebComp_Wcalmacentejidoencrudodistribucion_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_albrtartc ;
   private com.genexus.webpanels.GXUserControl ucCombo_albrtartc_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipentcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosmas ;
   private com.genexus.webpanels.GXUserControl ucCombo_procecodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_procecodto ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncodto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_nrecepcion ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV33ProgressIndicator ;
   private HTMLChoice cmbavAlbrestin ;
   private HTMLChoice cmbavTipo ;
   private IDataStoreProvider pr_default ;
   private String[] H02DK2_A396EmprCod ;
   private String[] H02DK2_A13738TrnCNom ;
   private short[] H02DK2_A840TrnCod ;
   private String[] H02DK2_A841TrnNom ;
   private boolean[] H02DK2_n841TrnNom ;
   private String[] H02DK3_A396EmprCod ;
   private String[] H02DK3_A13738TrnCNom ;
   private short[] H02DK3_A840TrnCod ;
   private String[] H02DK3_A841TrnNom ;
   private boolean[] H02DK3_n841TrnNom ;
   private String[] H02DK4_A396EmprCod ;
   private String[] H02DK4_A13820ProceNomID ;
   private short[] H02DK4_A970ProceCod ;
   private String[] H02DK4_A971ProceNom ;
   private boolean[] H02DK4_n971ProceNom ;
   private String[] H02DK5_A396EmprCod ;
   private String[] H02DK5_A13820ProceNomID ;
   private short[] H02DK5_A970ProceCod ;
   private String[] H02DK5_A971ProceNom ;
   private boolean[] H02DK5_n971ProceNom ;
   private String[] H02DK6_A396EmprCod ;
   private String[] H02DK6_A13821TipEntNomI ;
   private short[] H02DK6_A1211TipEntCod ;
   private String[] H02DK6_A1212TipEntNom ;
   private boolean[] H02DK6_n1212TipEntNom ;
   private String[] H02DK7_A396EmprCod ;
   private String[] H02DK7_A13788TipArtCodD ;
   private short[] H02DK7_A829TipArtCod ;
   private String[] H02DK7_A830TipArtDsc ;
   private boolean[] H02DK7_n830TipArtDsc ;
   private String[] H02DK7_A6014TipArtDsc2 ;
   private boolean[] H02DK7_n6014TipArtDsc2 ;
   private String[] H02DK8_A396EmprCod ;
   private String[] H02DK8_A13788TipArtCodD ;
   private short[] H02DK8_A829TipArtCod ;
   private String[] H02DK8_A830TipArtDsc ;
   private boolean[] H02DK8_n830TipArtDsc ;
   private String[] H02DK8_A6014TipArtDsc2 ;
   private boolean[] H02DK8_n6014TipArtDsc2 ;
   private String[] H02DK9_A396EmprCod ;
   private String[] H02DK9_A10045CliAct ;
   private String[] H02DK9_A13735CliCNom ;
   private int[] H02DK9_A252CliCod ;
   private String[] H02DK9_A279CliNom ;
   private String[] H02DK10_A396EmprCod ;
   private String[] H02DK10_A10045CliAct ;
   private String[] H02DK10_A13735CliCNom ;
   private int[] H02DK10_A252CliCod ;
   private String[] H02DK10_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20CliCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV14AlbRTartC_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16AlbRTartC_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27TipEntCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV23ProceCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV25ProceCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV30TrnCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV32TrnCodto_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV21Combo_DataItem ;
}

final  class almacentejidoencrudo_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DK2", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, TrnCod, TrnNom FROM TXPTRANSP ORDER BY TrnCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, TrnCod, TrnNom FROM TXPTRANSP ORDER BY TrnCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK4", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(ProceCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ProceNom, ''))) AS ProceNomID, ProceCod, ProceNom FROM TXPPROCED ORDER BY ProceNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK5", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(ProceCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ProceNom, ''))) AS ProceNomID, ProceCod, ProceNom FROM TXPPROCED ORDER BY ProceNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK6", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipEntCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipEntNom, ''))) AS TipEntNomI, TipEntCod, TipEntNom FROM TXPENTRAD ORDER BY TipEntNomI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK7", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK8", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK9", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DK10", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 25);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 8 :
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

