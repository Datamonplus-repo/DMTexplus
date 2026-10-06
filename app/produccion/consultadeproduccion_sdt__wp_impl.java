package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_sdt__wp_impl extends GXDataArea
{
   public consultadeproduccion_sdt__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_sdt__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_sdt__wp_impl.class ));
   }

   public consultadeproduccion_sdt__wp_impl( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavMuestras = new HTMLChoice();
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
      pa24R2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start24R2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultadeproduccion_sdt__wp", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV38CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV38CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV40CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV40CliCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPARTFROM_DATA", AV34BarTipArtfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPARTFROM_DATA", AV34BarTipArtfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPARTTO_DATA", AV36BarTipArtto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPARTTO_DATA", AV36BarTipArtto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOD_IDTX_DATA", AV42Cod_Idtx_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOD_IDTX_DATA", AV42Cod_Idtx_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV48EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Cls", GXutil.rtrim( Combo_bartipartfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Selectedvalue_set", GXutil.rtrim( Combo_bartipartfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Emptyitemtext", GXutil.rtrim( Combo_bartipartfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Cls", GXutil.rtrim( Combo_bartipartto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_set", GXutil.rtrim( Combo_bartipartto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Emptyitemtext", GXutil.rtrim( Combo_bartipartto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Cls", GXutil.rtrim( Combo_cod_idtx_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_set", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Visible", GXutil.booltostr( Combo_cod_idtx_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Emptyitemtext", GXutil.rtrim( Combo_cod_idtx_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_get", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_get", GXutil.rtrim( Combo_bartipartto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Selectedvalue_get", GXutil.rtrim( Combo_bartipartfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcconsultaproduccion_tabla_materializada == null ) )
      {
         WebComp_Wcconsultaproduccion_tabla_materializada.componentjscripts();
      }
      if ( ! ( WebComp_Consultadeproduccion_test == null ) )
      {
         WebComp_Consultadeproduccion_test.componentjscripts();
      }
      if ( ! ( WebComp_Wcconsultadeproduccion_sdt_wc == null ) )
      {
         WebComp_Wcconsultadeproduccion_sdt_wc.componentjscripts();
      }
      if ( ! ( WebComp_Wcconsultadeproduccion_eo_wc == null ) )
      {
         WebComp_Wcconsultadeproduccion_eo_wc.componentjscripts();
      }
      if ( ! ( WebComp_Containerconsultalista == null ) )
      {
         WebComp_Containerconsultalista.componentjscripts();
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
         we24R2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt24R2( ) ;
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
      return formatLink("app.produccion.consultadeproduccion_sdt__wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.ConsultadeProduccion_SDT__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta de Produccion", "") ;
   }

   public void wb24R0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV38CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV40CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnumfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnumfrom_Internalname, httpContext.getMessage( "Ped. Cli. Ini.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumfrom_Internalname, GXutil.rtrim( AV15BarDisNumfrom), GXutil.rtrim( localUtil.format( AV15BarDisNumfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnumto_Internalname, httpContext.getMessage( "Ped. Cli. Fin.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumto_Internalname, GXutil.rtrim( AV16BarDisNumto), GXutil.rtrim( localUtil.format( AV16BarDisNumto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitfrom_Internalname, httpContext.getMessage( "Sit. Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV31BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31BarSitfrom), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV31BarSitfrom), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitfrom_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitto_Internalname, httpContext.getMessage( "Sit. Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitto_Internalname, GXutil.ltrim( localUtil.ntoc( AV32BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32BarSitto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV32BarSitto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodfrom_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCodfrom), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCodfrom), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodfrom_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreofrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreofrom_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreofrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreofrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8BarCodReofrom), "9") : localUtil.format( DecimalUtil.doubleToDec(AV8BarCodReofrom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreofrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreofrom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparfrom_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparfrom_Internalname, GXutil.rtrim( AV6BarCodParfrom), GXutil.rtrim( localUtil.format( AV6BarCodParfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparfrom_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodto_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarCodto), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarCodto), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodto_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreoto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoto_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoto_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReoto), "9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReoto), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoto_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparto_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparto_Internalname, GXutil.rtrim( AV7BarCodParto), GXutil.rtrim( localUtil.format( AV7BarCodParto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparto_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserfrom_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserfrom_Internalname, GXutil.rtrim( AV29BarSerfrom), GXutil.rtrim( localUtil.format( AV29BarSerfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserfrom_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserto_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserto_Internalname, GXutil.rtrim( AV30BarSerto), GXutil.rtrim( localUtil.format( AV30BarSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbartipartfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipartfrom_Internalname, httpContext.getMessage( "Tipo Art. Inicial", ""), "", "", lblTextblockcombo_bartipartfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipartfrom.setProperty("Caption", Combo_bartipartfrom_Caption);
         ucCombo_bartipartfrom.setProperty("Cls", Combo_bartipartfrom_Cls);
         ucCombo_bartipartfrom.setProperty("EmptyItemText", Combo_bartipartfrom_Emptyitemtext);
         ucCombo_bartipartfrom.setProperty("DropDownOptionsData", AV34BarTipArtfrom_Data);
         ucCombo_bartipartfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_bartipartfrom_Internalname, "COMBO_BARTIPARTFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbartipartto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipartto_Internalname, httpContext.getMessage( "Tipo Art. Final", ""), "", "", lblTextblockcombo_bartipartto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipartto.setProperty("Caption", Combo_bartipartto_Caption);
         ucCombo_bartipartto.setProperty("Cls", Combo_bartipartto_Cls);
         ucCombo_bartipartto.setProperty("EmptyItemText", Combo_bartipartto_Emptyitemtext);
         ucCombo_bartipartto.setProperty("DropDownOptionsData", AV36BarTipArtto_Data);
         ucCombo_bartipartto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_bartipartto_Internalname, "COMBO_BARTIPARTTOContainer");
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
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_134_24R2( true) ;
      }
      else
      {
         wb_table1_134_24R2( false) ;
      }
      return  ;
   }

   public void wb_table1_134_24R2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
         ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
         ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
         ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
         ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
         ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
         ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
         ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
         ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
         ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecclifrom_Internalname, httpContext.getMessage( "Fecha Disp. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecclifrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclifrom_Internalname, localUtil.format(AV17BarFecClifrom, "99/99/99"), localUtil.format( AV17BarFecClifrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclifrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclifrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclifrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecclito_Internalname, httpContext.getMessage( "Fecha Disp. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecclito_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclito_Internalname, localUtil.format(AV18BarFecClito, "99/99/99"), localUtil.format( AV18BarFecClito, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclito_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclito_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgenfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgenfrom_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgenfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgenfrom_Internalname, localUtil.format(AV21BarFecGenfrom, "99/99/99"), localUtil.format( AV21BarFecGenfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,197);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgenfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgenfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgenfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgenfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgento_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgento_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgento_Internalname, localUtil.format(AV22BarFecGento, "99/99/99"), localUtil.format( AV22BarFecGento, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgento_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecfprfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfprfrom_Internalname, httpContext.getMessage( "Fecha Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfprfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfprfrom_Internalname, localUtil.format(AV19BarFecFprfrom, "99/99/99"), localUtil.format( AV19BarFecFprfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfprfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfprfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfprfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfprfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecfprto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfprto_Internalname, httpContext.getMessage( "Fecha Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfprto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfprto_Internalname, localUtil.format(AV20BarFecFprto, "99/99/99"), localUtil.format( AV20BarFecFprto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfprto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfprto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfprto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfprto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsalfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsalfrom_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 220,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsalfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsalfrom_Internalname, localUtil.format(AV23BarFecSalfrom, "99/99/99"), localUtil.format( AV23BarFecSalfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,220);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsalfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsalfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsalfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsalfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsalto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsalto_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsalto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsalto_Internalname, localUtil.format(AV24BarFecSalto, "99/99/99"), localUtil.format( AV24BarFecSalto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsalto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsalto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsalto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsalto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCombo_cod_idtx_cell_Internalname, 1, 0, "px", 0, "px", divCombo_cod_idtx_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcod_idtx_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cod_idtx_Internalname, lblTextblockcombo_cod_idtx_Caption, "", "", lblTextblockcombo_cod_idtx_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cod_idtx.setProperty("Caption", Combo_cod_idtx_Caption);
         ucCombo_cod_idtx.setProperty("Cls", Combo_cod_idtx_Cls);
         ucCombo_cod_idtx.setProperty("EmptyItemText", Combo_cod_idtx_Emptyitemtext);
         ucCombo_cod_idtx.setProperty("DropDownOptionsData", AV42Cod_Idtx_Data);
         ucCombo_cod_idtx.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cod_idtx_Internalname, "COMBO_COD_IDTXContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBargirar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBargirar_Internalname, httpContext.getMessage( "Coleccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 242,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBargirar_Internalname, GXutil.rtrim( AV52BarGirar), GXutil.rtrim( localUtil.format( AV52BarGirar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,242);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBargirar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBargirar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMuestras_cell_Internalname, 1, 0, "px", 0, "px", divMuestras_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavMuestras.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavMuestras.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavMuestras.getInternalname(), httpContext.getMessage( "Amostras?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMuestras, cmbavMuestras.getInternalname(), GXutil.rtrim( AV45Muestras), 1, cmbavMuestras.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavMuestras.getVisible(), cmbavMuestras.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "", true, (byte)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         cmbavMuestras.setValue( GXutil.rtrim( AV45Muestras) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar (Consulta)", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction2_Internalname, "", httpContext.getMessage( "Limpiar Variables Pantalla", ""), bttBtnuseraction2_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables Pantalla", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION2\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 258,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultado2_Internalname, "", httpContext.getMessage( "Consulta (atributos)", ""), bttBtnresultado2_Jsonclick, 5, httpContext.getMessage( "Consulta (atributos)", ""), "", StyleString, ClassString, bttBtnresultado2_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADO2\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 260,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultado3_Internalname, "", httpContext.getMessage( "Consulta", ""), bttBtnresultado3_Jsonclick, 7, httpContext.getMessage( "Consulta", ""), "", StyleString, ClassString, bttBtnresultado3_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1124r1_client"+"'", TempTags, "", 2, "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 262,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Consulta (sdt)", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Consulta (sdt)", ""), "", StyleString, ClassString, bttBtnresultados_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultado4_Internalname, "", httpContext.getMessage( "Consulta", ""), bttBtnresultado4_Jsonclick, 5, httpContext.getMessage( "Consulta", ""), "", StyleString, ClassString, bttBtnresultado4_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADO4\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab03_title_Internalname, httpContext.getMessage( "Consulta", ""), "", "", lblTab03_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab03") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0291"+"", GXutil.rtrim( WebComp_Wcconsultaproduccion_tabla_materializada_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0291"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.strcmp(GXutil.lower( OldWcconsultaproduccion_tabla_materializada), GXutil.lower( WebComp_Wcconsultaproduccion_tabla_materializada_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0291"+"");
            }
            WebComp_Wcconsultaproduccion_tabla_materializada.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcconsultaproduccion_tabla_materializada), GXutil.lower( WebComp_Wcconsultaproduccion_tabla_materializada_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Consulta (atributos)", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0299"+"", GXutil.rtrim( WebComp_Consultadeproduccion_test_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0299"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Consultadeproduccion_test_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldConsultadeproduccion_test), GXutil.lower( WebComp_Consultadeproduccion_test_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0299"+"");
               }
               WebComp_Consultadeproduccion_test.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldConsultadeproduccion_test), GXutil.lower( WebComp_Consultadeproduccion_test_Component)) != 0 )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Consulta (sdt)", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab01") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0307"+"", GXutil.rtrim( WebComp_Wcconsultadeproduccion_sdt_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0307"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcconsultadeproduccion_sdt_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcconsultadeproduccion_sdt_wc), GXutil.lower( WebComp_Wcconsultadeproduccion_sdt_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0307"+"");
               }
               WebComp_Wcconsultadeproduccion_sdt_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcconsultadeproduccion_sdt_wc), GXutil.lower( WebComp_Wcconsultadeproduccion_sdt_wc_Component)) != 0 )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab04_title_Internalname, httpContext.getMessage( "Consulta ( EO )", ""), "", "", lblTab04_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab04") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0315"+"", GXutil.rtrim( WebComp_Wcconsultadeproduccion_eo_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0315"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcconsultadeproduccion_eo_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcconsultadeproduccion_eo_wc), GXutil.lower( WebComp_Wcconsultadeproduccion_eo_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0315"+"");
               }
               WebComp_Wcconsultadeproduccion_eo_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcconsultadeproduccion_eo_wc), GXutil.lower( WebComp_Wcconsultadeproduccion_eo_wc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title5"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTablist4_title_Internalname, httpContext.getMessage( "Consulta ( List )", ""), "", "", lblTablist4_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabList4") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0323"+"", GXutil.rtrim( WebComp_Containerconsultalista_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0323"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Containerconsultalista_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldContainerconsultalista), GXutil.lower( WebComp_Containerconsultalista_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0323"+"");
               }
               WebComp_Containerconsultalista.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldContainerconsultalista), GXutil.lower( WebComp_Containerconsultalista_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 334,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV37CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,334);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 335,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV39CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,335);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipartfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV33BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33BarTipArtfrom), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipartfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipartfrom_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 337,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipartto_Internalname, GXutil.ltrim( localUtil.ntoc( AV35BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35BarTipArtto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,337);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipartto_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipartto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 338,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCod_idtx_Internalname, GXutil.rtrim( AV41Cod_Idtx), GXutil.rtrim( localUtil.format( AV41Cod_Idtx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,338);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCod_idtx_Jsonclick, 0, "Attribute", "", "", "", "", edtavCod_idtx_Visible, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start24R2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup24R0( ) ;
   }

   public void ws24R2( )
   {
      start24R2( ) ;
      evt24R2( ) ;
   }

   public void evt24R2( )
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
                           e1224R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction2' */
                           e1324R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADO2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultado2' */
                           e1424R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e1524R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADO4'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultado4' */
                           e1624R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1724R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e1824R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODFROM.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1924R2 ();
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
                                 e2024R2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e2124R2 ();
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
                     if ( nCmpId == 291 )
                     {
                        OldWcconsultaproduccion_tabla_materializada = httpContext.cgiGet( "W0291") ;
                        if ( ( GXutil.len( OldWcconsultaproduccion_tabla_materializada) == 0 ) || ( GXutil.strcmp(OldWcconsultaproduccion_tabla_materializada, WebComp_Wcconsultaproduccion_tabla_materializada_Component) != 0 ) )
                        {
                           WebComp_Wcconsultaproduccion_tabla_materializada = WebUtils.getWebComponent(getClass(), "app." + OldWcconsultaproduccion_tabla_materializada + "_impl", remoteHandle, context);
                           WebComp_Wcconsultaproduccion_tabla_materializada_Component = OldWcconsultaproduccion_tabla_materializada ;
                        }
                        WebComp_Wcconsultaproduccion_tabla_materializada.componentprocess("W0291", "", sEvt);
                        WebComp_Wcconsultaproduccion_tabla_materializada_Component = OldWcconsultaproduccion_tabla_materializada ;
                     }
                     else if ( nCmpId == 299 )
                     {
                        OldConsultadeproduccion_test = httpContext.cgiGet( "W0299") ;
                        if ( ( GXutil.len( OldConsultadeproduccion_test) == 0 ) || ( GXutil.strcmp(OldConsultadeproduccion_test, WebComp_Consultadeproduccion_test_Component) != 0 ) )
                        {
                           WebComp_Consultadeproduccion_test = WebUtils.getWebComponent(getClass(), "app." + OldConsultadeproduccion_test + "_impl", remoteHandle, context);
                           WebComp_Consultadeproduccion_test_Component = OldConsultadeproduccion_test ;
                        }
                        if ( GXutil.len( WebComp_Consultadeproduccion_test_Component) != 0 )
                        {
                           WebComp_Consultadeproduccion_test.componentprocess("W0299", "", sEvt);
                        }
                        WebComp_Consultadeproduccion_test_Component = OldConsultadeproduccion_test ;
                     }
                     else if ( nCmpId == 307 )
                     {
                        OldWcconsultadeproduccion_sdt_wc = httpContext.cgiGet( "W0307") ;
                        if ( ( GXutil.len( OldWcconsultadeproduccion_sdt_wc) == 0 ) || ( GXutil.strcmp(OldWcconsultadeproduccion_sdt_wc, WebComp_Wcconsultadeproduccion_sdt_wc_Component) != 0 ) )
                        {
                           WebComp_Wcconsultadeproduccion_sdt_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcconsultadeproduccion_sdt_wc + "_impl", remoteHandle, context);
                           WebComp_Wcconsultadeproduccion_sdt_wc_Component = OldWcconsultadeproduccion_sdt_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcconsultadeproduccion_sdt_wc_Component) != 0 )
                        {
                           WebComp_Wcconsultadeproduccion_sdt_wc.componentprocess("W0307", "", sEvt);
                        }
                        WebComp_Wcconsultadeproduccion_sdt_wc_Component = OldWcconsultadeproduccion_sdt_wc ;
                     }
                     else if ( nCmpId == 315 )
                     {
                        OldWcconsultadeproduccion_eo_wc = httpContext.cgiGet( "W0315") ;
                        if ( ( GXutil.len( OldWcconsultadeproduccion_eo_wc) == 0 ) || ( GXutil.strcmp(OldWcconsultadeproduccion_eo_wc, WebComp_Wcconsultadeproduccion_eo_wc_Component) != 0 ) )
                        {
                           WebComp_Wcconsultadeproduccion_eo_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcconsultadeproduccion_eo_wc + "_impl", remoteHandle, context);
                           WebComp_Wcconsultadeproduccion_eo_wc_Component = OldWcconsultadeproduccion_eo_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcconsultadeproduccion_eo_wc_Component) != 0 )
                        {
                           WebComp_Wcconsultadeproduccion_eo_wc.componentprocess("W0315", "", sEvt);
                        }
                        WebComp_Wcconsultadeproduccion_eo_wc_Component = OldWcconsultadeproduccion_eo_wc ;
                     }
                     else if ( nCmpId == 323 )
                     {
                        OldContainerconsultalista = httpContext.cgiGet( "W0323") ;
                        if ( ( GXutil.len( OldContainerconsultalista) == 0 ) || ( GXutil.strcmp(OldContainerconsultalista, WebComp_Containerconsultalista_Component) != 0 ) )
                        {
                           WebComp_Containerconsultalista = WebUtils.getWebComponent(getClass(), "app." + OldContainerconsultalista + "_impl", remoteHandle, context);
                           WebComp_Containerconsultalista_Component = OldContainerconsultalista ;
                        }
                        if ( GXutil.len( WebComp_Containerconsultalista_Component) != 0 )
                        {
                           WebComp_Containerconsultalista.componentprocess("W0323", "", sEvt);
                        }
                        WebComp_Containerconsultalista_Component = OldContainerconsultalista ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we24R2( )
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

   public void pa24R2( )
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
            GX_FocusControl = edtavBardisnumfrom_Internalname ;
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
      if ( cmbavMuestras.getItemCount() > 0 )
      {
         AV45Muestras = cmbavMuestras.getValidValue(AV45Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Muestras", AV45Muestras);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavMuestras.setValue( GXutil.rtrim( AV45Muestras) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf24R2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV56Pgmname = "Produccion.ConsultadeProduccion_SDT__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            WebComp_Wcconsultaproduccion_tabla_materializada.componentstart();
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Consultadeproduccion_test_Component) != 0 )
            {
               WebComp_Consultadeproduccion_test.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcconsultadeproduccion_sdt_wc_Component) != 0 )
            {
               WebComp_Wcconsultadeproduccion_sdt_wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcconsultadeproduccion_eo_wc_Component) != 0 )
            {
               WebComp_Wcconsultadeproduccion_eo_wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Containerconsultalista_Component) != 0 )
            {
               WebComp_Containerconsultalista.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e2124R2 ();
         wb24R0( ) ;
      }
   }

   public void send_integrity_lvl_hashes24R2( )
   {
   }

   public void before_start_formulas( )
   {
      AV56Pgmname = "Produccion.ConsultadeProduccion_SDT__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1224R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV38CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV40CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPARTFROM_DATA"), AV34BarTipArtfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPARTTO_DATA"), AV36BarTipArtto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOD_IDTX_DATA"), AV42Cod_Idtx_Data);
         /* Read saved values. */
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Combo_bartipartfrom_Cls = httpContext.cgiGet( "COMBO_BARTIPARTFROM_Cls") ;
         Combo_bartipartfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPARTFROM_Selectedvalue_set") ;
         Combo_bartipartfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPARTFROM_Emptyitemtext") ;
         Combo_bartipartto_Cls = httpContext.cgiGet( "COMBO_BARTIPARTTO_Cls") ;
         Combo_bartipartto_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPARTTO_Selectedvalue_set") ;
         Combo_bartipartto_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPARTTO_Emptyitemtext") ;
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
         Combo_cod_idtx_Cls = httpContext.cgiGet( "COMBO_COD_IDTX_Cls") ;
         Combo_cod_idtx_Selectedvalue_set = httpContext.cgiGet( "COMBO_COD_IDTX_Selectedvalue_set") ;
         Combo_cod_idtx_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_IDTX_Visible")) ;
         Combo_cod_idtx_Emptyitemtext = httpContext.cgiGet( "COMBO_COD_IDTX_Emptyitemtext") ;
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
         AV15BarDisNumfrom = httpContext.cgiGet( edtavBardisnumfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarDisNumfrom", AV15BarDisNumfrom);
         AV16BarDisNumto = httpContext.cgiGet( edtavBardisnumto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarDisNumto", AV16BarDisNumto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITFROM");
            GX_FocusControl = edtavBarsitfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31BarSitfrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarSitfrom), 2, 0));
         }
         else
         {
            AV31BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarSitfrom), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITTO");
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32BarSitto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitto), 2, 0));
         }
         else
         {
            AV32BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitto), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODFROM");
            GX_FocusControl = edtavBarcodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BarCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodfrom), 8, 0));
         }
         else
         {
            AV5BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodfrom), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOFROM");
            GX_FocusControl = edtavBarcodreofrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8BarCodReofrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReofrom", GXutil.str( AV8BarCodReofrom, 1, 0));
         }
         else
         {
            AV8BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReofrom", GXutil.str( AV8BarCodReofrom, 1, 0));
         }
         AV6BarCodParfrom = httpContext.cgiGet( edtavBarcodparfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodParfrom", AV6BarCodParfrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODTO");
            GX_FocusControl = edtavBarcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
         }
         else
         {
            AV10BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOTO");
            GX_FocusControl = edtavBarcodreoto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarCodReoto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReoto", GXutil.str( AV9BarCodReoto, 1, 0));
         }
         else
         {
            AV9BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReoto", GXutil.str( AV9BarCodReoto, 1, 0));
         }
         AV7BarCodParto = httpContext.cgiGet( edtavBarcodparto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodParto", AV7BarCodParto);
         AV29BarSerfrom = httpContext.cgiGet( edtavBarserfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarSerfrom", AV29BarSerfrom);
         AV30BarSerto = httpContext.cgiGet( edtavBarserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarSerto", AV30BarSerto);
         AV11BarColNomfrom = httpContext.cgiGet( edtavBarcolnomfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomfrom", AV11BarColNomfrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMFROM");
            GX_FocusControl = edtavBarcolnumfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarColNumfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNumfrom), 6, 0));
         }
         else
         {
            AV13BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNumfrom), 6, 0));
         }
         AV12BarColNomto = httpContext.cgiGet( edtavBarcolnomto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNomto", AV12BarColNomto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMTO");
            GX_FocusControl = edtavBarcolnumto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BarColNumto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumto), 6, 0));
         }
         else
         {
            AV14BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumto), 6, 0));
         }
         AV25BarNomClifrom = httpContext.cgiGet( edtavBarnomclifrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarNomClifrom", AV25BarNomClifrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLIFROM");
            GX_FocusControl = edtavBarnumclifrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27BarNumClifrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarNumClifrom), 6, 0));
         }
         else
         {
            AV27BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarNumClifrom), 6, 0));
         }
         AV26BarNomClito = httpContext.cgiGet( edtavBarnomclito_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarNomClito", AV26BarNomClito);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLITO");
            GX_FocusControl = edtavBarnumclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28BarNumClito = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarNumClito), 6, 0));
         }
         else
         {
            AV28BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarNumClito), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclifrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLIFROM");
            GX_FocusControl = edtavBarfecclifrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17BarFecClifrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarFecClifrom", localUtil.format(AV17BarFecClifrom, "99/99/99"));
         }
         else
         {
            AV17BarFecClifrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecclifrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarFecClifrom", localUtil.format(AV17BarFecClifrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclito_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLITO");
            GX_FocusControl = edtavBarfecclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18BarFecClito = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarFecClito", localUtil.format(AV18BarFecClito, "99/99/99"));
         }
         else
         {
            AV18BarFecClito = localUtil.ctod( httpContext.cgiGet( edtavBarfecclito_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarFecClito", localUtil.format(AV18BarFecClito, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENFROM");
            GX_FocusControl = edtavBarfecgenfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21BarFecGenfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarFecGenfrom", localUtil.format(AV21BarFecGenfrom, "99/99/99"));
         }
         else
         {
            AV21BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarFecGenfrom", localUtil.format(AV21BarFecGenfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENTO");
            GX_FocusControl = edtavBarfecgento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22BarFecGento = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22BarFecGento", localUtil.format(AV22BarFecGento, "99/99/99"));
         }
         else
         {
            AV22BarFecGento = localUtil.ctod( httpContext.cgiGet( edtavBarfecgento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22BarFecGento", localUtil.format(AV22BarFecGento, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfprfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPRFROM");
            GX_FocusControl = edtavBarfecfprfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarFecFprfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarFecFprfrom", localUtil.format(AV19BarFecFprfrom, "99/99/99"));
         }
         else
         {
            AV19BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecfprfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarFecFprfrom", localUtil.format(AV19BarFecFprfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfprto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPRTO");
            GX_FocusControl = edtavBarfecfprto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20BarFecFprto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarFecFprto", localUtil.format(AV20BarFecFprto, "99/99/99"));
         }
         else
         {
            AV20BarFecFprto = localUtil.ctod( httpContext.cgiGet( edtavBarfecfprto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarFecFprto", localUtil.format(AV20BarFecFprto, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsalfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSALFROM");
            GX_FocusControl = edtavBarfecsalfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23BarFecSalfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecSalfrom", localUtil.format(AV23BarFecSalfrom, "99/99/99"));
         }
         else
         {
            AV23BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecsalfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecSalfrom", localUtil.format(AV23BarFecSalfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsalto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSALTO");
            GX_FocusControl = edtavBarfecsalto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24BarFecSalto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarFecSalto", localUtil.format(AV24BarFecSalto, "99/99/99"));
         }
         else
         {
            AV24BarFecSalto = localUtil.ctod( httpContext.cgiGet( edtavBarfecsalto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarFecSalto", localUtil.format(AV24BarFecSalto, "99/99/99"));
         }
         AV52BarGirar = httpContext.cgiGet( edtavBargirar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52BarGirar", AV52BarGirar);
         cmbavMuestras.setValue( httpContext.cgiGet( cmbavMuestras.getInternalname()) );
         AV45Muestras = httpContext.cgiGet( cmbavMuestras.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Muestras", AV45Muestras);
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliCodfrom), 6, 0));
         }
         else
         {
            AV37CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39CliCodto), 6, 0));
         }
         else
         {
            AV39CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39CliCodto), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPARTFROM");
            GX_FocusControl = edtavBartipartfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33BarTipArtfrom = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarTipArtfrom), 4, 0));
         }
         else
         {
            AV33BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipartfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarTipArtfrom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPARTTO");
            GX_FocusControl = edtavBartipartto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35BarTipArtto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
         }
         else
         {
            AV35BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
         }
         AV41Cod_Idtx = httpContext.cgiGet( edtavCod_idtx_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Cod_Idtx", AV41Cod_Idtx);
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
      e1224R2 ();
      if (returnInSub) return;
   }

   public void e1224R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV47Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_sdt__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV47Station = GXt_char1 ;
      GXv_char2[0] = AV48EmprCod ;
      GXv_char3[0] = AV49EmprNom ;
      GXv_char4[0] = AV50UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_sdt__wp_impl.this.AV48EmprCod = GXv_char2[0] ;
      consultadeproduccion_sdt__wp_impl.this.AV49EmprNom = GXv_char3[0] ;
      consultadeproduccion_sdt__wp_impl.this.AV50UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48EmprCod", AV48EmprCod);
      edtavCod_idtx_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCod_idtx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCod_idtx_Visible), 5, 0), true);
      edtavBartipartto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipartto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipartto_Visible), 5, 0), true);
      edtavBartipartfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipartfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipartfrom_Visible), 5, 0), true);
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOBARTIPARTFROM' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOBARTIPARTTO' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCOD_IDTX' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S162 ();
      if (returnInSub) return;
      AV21BarFecGenfrom = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(180)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarFecGenfrom", localUtil.format(AV21BarFecGenfrom, "99/99/99"));
      AV22BarFecGento = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarFecGento", localUtil.format(AV22BarFecGento, "99/99/99"));
      AV31BarSitfrom = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarSitfrom), 2, 0));
      AV32BarSitto = (byte)(11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitto), 2, 0));
      GXt_int5 = (byte)(AV44Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV48EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      consultadeproduccion_sdt__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV44Moda21 = GXt_int5 ;
      lblTextblockcombo_cod_idtx_Caption = ((AV44Moda21==1) ? httpContext.getMessage( "Certificação", "") : httpContext.getMessage( "Clear to Wear", "")) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblockcombo_cod_idtx_Internalname, "Caption", lblTextblockcombo_cod_idtx_Caption, true);
      bttBtnresultado2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnresultado2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnresultado2_Visible), 5, 0), true);
      bttBtnresultado3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnresultado3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnresultado3_Visible), 5, 0), true);
      bttBtnresultados_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnresultados_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnresultados_Visible), 5, 0), true);
      bttBtnresultado4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnresultado4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnresultado4_Visible), 5, 0), true);
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(2)});
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(3)});
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(4)});
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(5)});
   }

   public void e1324R2( )
   {
      /* 'DoUserAction2' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LIMPARFILTROS' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavMuestras.setValue( GXutil.rtrim( AV45Muestras) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
   }

   public void e1424R2( )
   {
      /* 'DoResultado2' Routine */
      returnInSub = false ;
      AV46ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV46ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV46ProgressIndicator.show();
      AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Consultadeproduccion_test = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Consultadeproduccion_test_Component), GXutil.lower( "Produccion.ConsultadeProduccion_Test")) != 0 )
      {
         WebComp_Consultadeproduccion_test = WebUtils.getWebComponent(getClass(), "app.produccion.consultadeproduccion_test_impl", remoteHandle, context);
         WebComp_Consultadeproduccion_test_Component = "Produccion.ConsultadeProduccion_Test" ;
      }
      if ( GXutil.len( WebComp_Consultadeproduccion_test_Component) != 0 )
      {
         WebComp_Consultadeproduccion_test.setjustcreated();
         WebComp_Consultadeproduccion_test.componentprepare(new Object[] {"W0299","",AV48EmprCod,Integer.valueOf(AV37CliCodfrom),Integer.valueOf(AV39CliCodto),AV15BarDisNumfrom,AV16BarDisNumto,AV21BarFecGenfrom,AV22BarFecGento,Byte.valueOf(AV31BarSitfrom),Byte.valueOf(AV32BarSitto),AV17BarFecClifrom,AV18BarFecClito,AV19BarFecFprfrom,AV20BarFecFprto,AV23BarFecSalfrom,AV24BarFecSalto,AV29BarSerfrom,AV30BarSerto,Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV11BarColNomfrom,AV12BarColNomto,Integer.valueOf(AV13BarColNumfrom),Integer.valueOf(AV14BarColNumto),AV25BarNomClifrom,AV26BarNomClito,Integer.valueOf(AV27BarNumClifrom),Integer.valueOf(AV28BarNumClito),Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV45Muestras,Integer.valueOf(AV5BarCodfrom),Integer.valueOf(AV10BarCodto),Byte.valueOf(AV8BarCodReofrom),Byte.valueOf(AV9BarCodReoto),AV6BarCodParfrom,AV7BarCodParto,AV41Cod_Idtx,AV52BarGirar});
         WebComp_Consultadeproduccion_test.componentbind(new Object[] {"","vCLICODFROM","vCLICODTO","vBARDISNUMFROM","vBARDISNUMTO","vBARFECGENFROM","vBARFECGENTO","vBARSITFROM","vBARSITTO","vBARFECCLIFROM","vBARFECCLITO","vBARFECFPRFROM","vBARFECFPRTO","vBARFECSALFROM","vBARFECSALTO","vBARSERFROM","vBARSERTO","vBARTIPARTFROM","vBARTIPARTTO","vBARCOLNOMFROM","vBARCOLNOMTO","vBARCOLNUMFROM","vBARCOLNUMTO","vBARNOMCLIFROM","vBARNOMCLITO","vBARNUMCLIFROM","vBARNUMCLITO","vBARTIPARTFROM","vBARTIPARTTO","vMUESTRAS","vBARCODFROM","vBARCODTO","vBARCODREOFROM","vBARCODREOTO","vBARCODPARFROM","vBARCODPARTO","vCOD_IDTX","vBARGIRAR"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Consultadeproduccion_test )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0299"+"");
         WebComp_Consultadeproduccion_test.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV46ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ProgressIndicator", AV46ProgressIndicator);
   }

   public void e1524R2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      if ( (0==AV31BarSitfrom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Situacion no valida¡", ""));
         GX_FocusControl = edtavBarsitfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV32BarSitto) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "SItuacion no valida¡", ""));
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV46ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
            AV46ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
            AV46ProgressIndicator.show();
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
            /* Object Property */
            if ( true )
            {
               bDynCreated_Wcconsultadeproduccion_sdt_wc = true ;
            }
            if ( GXutil.strcmp(GXutil.lower( WebComp_Wcconsultadeproduccion_sdt_wc_Component), GXutil.lower( "Produccion.ConsultadeProduccion_SDT_WC")) != 0 )
            {
               WebComp_Wcconsultadeproduccion_sdt_wc = WebUtils.getWebComponent(getClass(), "app.produccion.consultadeproduccion_sdt_wc_impl", remoteHandle, context);
               WebComp_Wcconsultadeproduccion_sdt_wc_Component = "Produccion.ConsultadeProduccion_SDT_WC" ;
            }
            if ( GXutil.len( WebComp_Wcconsultadeproduccion_sdt_wc_Component) != 0 )
            {
               WebComp_Wcconsultadeproduccion_sdt_wc.setjustcreated();
               WebComp_Wcconsultadeproduccion_sdt_wc.componentprepare(new Object[] {"W0307","",AV48EmprCod,Integer.valueOf(AV37CliCodfrom),Integer.valueOf(AV39CliCodto),AV15BarDisNumfrom,AV16BarDisNumto,AV21BarFecGenfrom,AV22BarFecGento,Byte.valueOf(AV31BarSitfrom),Byte.valueOf(AV32BarSitto),AV17BarFecClifrom,AV18BarFecClito,AV19BarFecFprfrom,AV20BarFecFprto,AV23BarFecSalfrom,AV24BarFecSalto,AV29BarSerfrom,AV30BarSerto,Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV11BarColNomfrom,AV12BarColNomto,Integer.valueOf(AV13BarColNumfrom),Integer.valueOf(AV14BarColNumto),AV25BarNomClifrom,AV26BarNomClito,Integer.valueOf(AV27BarNumClifrom),Integer.valueOf(AV28BarNumClito),Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV45Muestras,Integer.valueOf(AV5BarCodfrom),Integer.valueOf(AV10BarCodto),Byte.valueOf(AV8BarCodReofrom),Byte.valueOf(AV9BarCodReoto),AV6BarCodParfrom,AV7BarCodParto,AV41Cod_Idtx,AV52BarGirar});
               WebComp_Wcconsultadeproduccion_sdt_wc.componentbind(new Object[] {"","vCLICODFROM","vCLICODTO","vBARDISNUMFROM","vBARDISNUMTO","vBARFECGENFROM","vBARFECGENTO","vBARSITFROM","vBARSITTO","vBARFECCLIFROM","vBARFECCLITO","vBARFECFPRFROM","vBARFECFPRTO","vBARFECSALFROM","vBARFECSALTO","vBARSERFROM","vBARSERTO","vBARTIPARTFROM","vBARTIPARTTO","vBARCOLNOMFROM","vBARCOLNOMTO","vBARCOLNUMFROM","vBARCOLNUMTO","vBARNOMCLIFROM","vBARNOMCLITO","vBARNUMCLIFROM","vBARNUMCLITO","vBARTIPARTFROM","vBARTIPARTTO","vMUESTRAS","vBARCODFROM","vBARCODTO","vBARCODREOFROM","vBARCODREOTO","vBARCODPARFROM","vBARCODPARTO","vCOD_IDTX","vBARGIRAR"});
            }
            if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcconsultadeproduccion_sdt_wc )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0307"+"");
               WebComp_Wcconsultadeproduccion_sdt_wc.componentdraw();
               httpContext.ajax_rspEndCmp();
            }
            this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
            AV46ProgressIndicator.hide();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ProgressIndicator", AV46ProgressIndicator);
   }

   public void e1624R2( )
   {
      /* 'DoResultado4' Routine */
      returnInSub = false ;
      if ( (0==AV31BarSitfrom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Situacion no valida¡", ""));
         GX_FocusControl = edtavBarsitfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV32BarSitto) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "SItuacion no valida¡", ""));
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "SelectTab", "", new Object[] {Integer.valueOf(4)});
            AV46ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
            AV46ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
            AV46ProgressIndicator.show();
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
            /* Object Property */
            if ( true )
            {
               bDynCreated_Wcconsultadeproduccion_eo_wc = true ;
            }
            if ( GXutil.strcmp(GXutil.lower( WebComp_Wcconsultadeproduccion_eo_wc_Component), GXutil.lower( "Produccion.ConsultaProduccionEO")) != 0 )
            {
               WebComp_Wcconsultadeproduccion_eo_wc = WebUtils.getWebComponent(getClass(), "app.produccion.consultaproduccioneo_impl", remoteHandle, context);
               WebComp_Wcconsultadeproduccion_eo_wc_Component = "Produccion.ConsultaProduccionEO" ;
            }
            if ( GXutil.len( WebComp_Wcconsultadeproduccion_eo_wc_Component) != 0 )
            {
               WebComp_Wcconsultadeproduccion_eo_wc.setjustcreated();
               WebComp_Wcconsultadeproduccion_eo_wc.componentprepare(new Object[] {"W0315","",AV48EmprCod,Integer.valueOf(AV37CliCodfrom),Integer.valueOf(AV39CliCodto),AV15BarDisNumfrom,AV16BarDisNumto,AV21BarFecGenfrom,AV22BarFecGento,Byte.valueOf(AV31BarSitfrom),Byte.valueOf(AV32BarSitto),AV17BarFecClifrom,AV18BarFecClito,AV19BarFecFprfrom,AV20BarFecFprto,AV23BarFecSalfrom,AV24BarFecSalto,AV29BarSerfrom,AV30BarSerto,Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV11BarColNomfrom,AV12BarColNomto,Integer.valueOf(AV13BarColNumfrom),Integer.valueOf(AV14BarColNumto),AV25BarNomClifrom,AV26BarNomClito,Integer.valueOf(AV27BarNumClifrom),Integer.valueOf(AV28BarNumClito),Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV45Muestras,Integer.valueOf(AV5BarCodfrom),Integer.valueOf(AV10BarCodto),Byte.valueOf(AV8BarCodReofrom),Byte.valueOf(AV9BarCodReoto),AV6BarCodParfrom,AV7BarCodParto,AV41Cod_Idtx,AV52BarGirar});
               WebComp_Wcconsultadeproduccion_eo_wc.componentbind(new Object[] {"","vCLICODFROM","vCLICODTO","vBARDISNUMFROM","vBARDISNUMTO","vBARFECGENFROM","vBARFECGENTO","vBARSITFROM","vBARSITTO","vBARFECCLIFROM","vBARFECCLITO","vBARFECFPRFROM","vBARFECFPRTO","vBARFECSALFROM","vBARFECSALTO","vBARSERFROM","vBARSERTO","vBARTIPARTFROM","vBARTIPARTTO","vBARCOLNOMFROM","vBARCOLNOMTO","vBARCOLNUMFROM","vBARCOLNUMTO","vBARNOMCLIFROM","vBARNOMCLITO","vBARNUMCLIFROM","vBARNUMCLITO","vBARTIPARTFROM","vBARTIPARTTO","vMUESTRAS","vBARCODFROM","vBARCODTO","vBARCODREOFROM","vBARCODREOTO","vBARCODPARFROM","vBARCODPARTO","vCOD_IDTX","vBARGIRAR"});
            }
            if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcconsultadeproduccion_eo_wc )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0315"+"");
               WebComp_Wcconsultadeproduccion_eo_wc.componentdraw();
               httpContext.ajax_rspEndCmp();
            }
            this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
            AV46ProgressIndicator.hide();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ProgressIndicator", AV46ProgressIndicator);
   }

   public void e1724R2( )
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

   public void S162( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV48EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV48EmprCod, httpContext.getMessage( "STDNOR", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV48EmprCod, httpContext.getMessage( "STNORM", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV48EmprCod, httpContext.getMessage( "CTWEAR", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         Combo_cod_idtx_Visible = false ;
         ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "Visible", GXutil.booltostr( Combo_cod_idtx_Visible));
         divCombo_cod_idtx_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_cod_idtx_cell_Internalname, "Class", divCombo_cod_idtx_cell_Class, true);
      }
      else
      {
         Combo_cod_idtx_Visible = true ;
         ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "Visible", GXutil.booltostr( Combo_cod_idtx_Visible));
         divCombo_cod_idtx_cell_Class = "col-xs-12 col-sm-5 DscTop ExtendedComboCell" ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_cod_idtx_cell_Internalname, "Class", divCombo_cod_idtx_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV48EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbavMuestras.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Visible", GXutil.ltrimstr( cmbavMuestras.getVisible(), 5, 0), true);
         divMuestras_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divMuestras_cell_Internalname, "Class", divMuestras_cell_Class, true);
      }
      else
      {
         cmbavMuestras.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Visible", GXutil.ltrimstr( cmbavMuestras.getVisible(), 5, 0), true);
         divMuestras_cell_Class = "col-xs-12 col-sm-3 DscTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divMuestras_cell_Internalname, "Class", divMuestras_cell_Class, true);
      }
   }

   public void S152( )
   {
      /* 'LOADCOMBOCOD_IDTX' Routine */
      returnInSub = false ;
      /* Using cursor H024R2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13810Dsc_IdtxID = H024R2_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = H024R2_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = H024R2_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = H024R2_n10888Dsc_Idtx[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV42Cod_Idtx_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_cod_idtx_Selectedvalue_set = AV41Cod_Idtx ;
      ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "SelectedValue_set", Combo_cod_idtx_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOBARTIPARTTO' Routine */
      returnInSub = false ;
      /* Using cursor H024R3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13788TipArtCodD = H024R3_A13788TipArtCodD[0] ;
         A829TipArtCod = H024R3_A829TipArtCod[0] ;
         A830TipArtDsc = H024R3_A830TipArtDsc[0] ;
         n830TipArtDsc = H024R3_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H024R3_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H024R3_n6014TipArtDsc2[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV36BarTipArtto_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_bartipartto_Selectedvalue_set = ((0==AV35BarTipArtto) ? "" : GXutil.trim( GXutil.str( AV35BarTipArtto, 4, 0))) ;
      ucCombo_bartipartto.sendProperty(context, "", false, Combo_bartipartto_Internalname, "SelectedValue_set", Combo_bartipartto_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOBARTIPARTFROM' Routine */
      returnInSub = false ;
      /* Using cursor H024R4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13788TipArtCodD = H024R4_A13788TipArtCodD[0] ;
         A829TipArtCod = H024R4_A829TipArtCod[0] ;
         A830TipArtDsc = H024R4_A830TipArtDsc[0] ;
         n830TipArtDsc = H024R4_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H024R4_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H024R4_n6014TipArtDsc2[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV34BarTipArtfrom_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_bartipartfrom_Selectedvalue_set = ((0==AV33BarTipArtfrom) ? "" : GXutil.trim( GXutil.str( AV33BarTipArtfrom, 4, 0))) ;
      ucCombo_bartipartfrom.sendProperty(context, "", false, Combo_bartipartfrom_Internalname, "SelectedValue_set", Combo_bartipartfrom_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H024R5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10045CliAct = H024R5_A10045CliAct[0] ;
         A13735CliCNom = H024R5_A13735CliCNom[0] ;
         A252CliCod = H024R5_A252CliCod[0] ;
         A279CliNom = H024R5_A279CliNom[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV40CliCodto_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_clicodto_Selectedvalue_set = ((0==AV39CliCodto) ? "" : GXutil.trim( GXutil.str( AV39CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H024R6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10045CliAct = H024R6_A10045CliAct[0] ;
         A13735CliCNom = H024R6_A13735CliCNom[0] ;
         A252CliCod = H024R6_A252CliCod[0] ;
         A279CliNom = H024R6_A279CliNom[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV38CliCodfrom_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV37CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV37CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void e1824R2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      if ( (0==AV31BarSitfrom) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Situacion no valida¡", ""));
         GX_FocusControl = edtavBarsitfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV32BarSitto) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "SItuacion no valida¡", ""));
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "SelectTab", "", new Object[] {Integer.valueOf(5)});
            AV46ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
            AV46ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
            AV46ProgressIndicator.show();
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
            /* Object Property */
            if ( true )
            {
               bDynCreated_Containerconsultalista = true ;
            }
            if ( GXutil.strcmp(GXutil.lower( WebComp_Containerconsultalista_Component), GXutil.lower( "ListConsultaProd")) != 0 )
            {
               WebComp_Containerconsultalista = WebUtils.getWebComponent(getClass(), "app.listconsultaprod_impl", remoteHandle, context);
               WebComp_Containerconsultalista_Component = "ListConsultaProd" ;
            }
            if ( GXutil.len( WebComp_Containerconsultalista_Component) != 0 )
            {
               WebComp_Containerconsultalista.setjustcreated();
               WebComp_Containerconsultalista.componentprepare(new Object[] {"W0323","",AV48EmprCod,Integer.valueOf(AV37CliCodfrom),Integer.valueOf(AV39CliCodto),AV15BarDisNumfrom,AV16BarDisNumto,AV21BarFecGenfrom,AV22BarFecGento,Byte.valueOf(AV31BarSitfrom),Byte.valueOf(AV32BarSitto),AV17BarFecClifrom,AV18BarFecClito,AV19BarFecFprfrom,AV20BarFecFprto,AV23BarFecSalfrom,AV24BarFecSalto,AV29BarSerfrom,AV30BarSerto,Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV11BarColNomfrom,AV12BarColNomto,Integer.valueOf(AV13BarColNumfrom),Integer.valueOf(AV14BarColNumto),AV25BarNomClifrom,AV26BarNomClito,Integer.valueOf(AV27BarNumClifrom),Integer.valueOf(AV28BarNumClito),Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV45Muestras,Integer.valueOf(AV5BarCodfrom),Integer.valueOf(AV10BarCodto),Byte.valueOf(AV8BarCodReofrom),Byte.valueOf(AV9BarCodReoto),AV6BarCodParfrom,AV7BarCodParto,AV41Cod_Idtx,AV52BarGirar});
               WebComp_Containerconsultalista.componentbind(new Object[] {"","vCLICODFROM","vCLICODTO","vBARDISNUMFROM","vBARDISNUMTO","vBARFECGENFROM","vBARFECGENTO","vBARSITFROM","vBARSITTO","vBARFECCLIFROM","vBARFECCLITO","vBARFECFPRFROM","vBARFECFPRTO","vBARFECSALFROM","vBARFECSALTO","vBARSERFROM","vBARSERTO","vBARTIPARTFROM","vBARTIPARTTO","vBARCOLNOMFROM","vBARCOLNOMTO","vBARCOLNUMFROM","vBARCOLNUMTO","vBARNOMCLIFROM","vBARNOMCLITO","vBARNUMCLIFROM","vBARNUMCLITO","vBARTIPARTFROM","vBARTIPARTTO","vMUESTRAS","vBARCODFROM","vBARCODTO","vBARCODREOFROM","vBARCODREOTO","vBARCODPARFROM","vBARCODPARTO","vCOD_IDTX","vBARGIRAR"});
            }
            if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Containerconsultalista )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0323"+"");
               WebComp_Containerconsultalista.componentdraw();
               httpContext.ajax_rspEndCmp();
            }
            this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
            AV46ProgressIndicator.hide();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ProgressIndicator", AV46ProgressIndicator);
   }

   public void e1924R2( )
   {
      /* Barcodfrom_Isvalid Routine */
      returnInSub = false ;
      AV10BarCodto = AV5BarCodfrom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
      if ( AV5BarCodfrom > 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV17BarFecClifrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarFecClifrom", localUtil.format(AV17BarFecClifrom, "99/99/99"));
         AV21BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarFecGenfrom", localUtil.format(AV21BarFecGenfrom, "99/99/99"));
         AV23BarFecSalfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecSalfrom", localUtil.format(AV23BarFecSalfrom, "99/99/99"));
      }
      else
      {
         AV21BarFecGenfrom = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(180)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarFecGenfrom", localUtil.format(AV21BarFecGenfrom, "99/99/99"));
         AV22BarFecGento = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarFecGento", localUtil.format(AV22BarFecGento, "99/99/99"));
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e2024R2 ();
      if (returnInSub) return;
   }

   public void e2024R2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV31BarSitfrom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Situacion no valida¡", ""));
         GX_FocusControl = edtavBarsitfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV32BarSitto) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "SItuacion no valida¡", ""));
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "SelectTab", "", new Object[] {Integer.valueOf(5)});
            AV46ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
            AV46ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
            AV46ProgressIndicator.show();
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
            /* Object Property */
            if ( true )
            {
               bDynCreated_Containerconsultalista = true ;
            }
            if ( GXutil.strcmp(GXutil.lower( WebComp_Containerconsultalista_Component), GXutil.lower( "ListConsultaProd")) != 0 )
            {
               WebComp_Containerconsultalista = WebUtils.getWebComponent(getClass(), "app.listconsultaprod_impl", remoteHandle, context);
               WebComp_Containerconsultalista_Component = "ListConsultaProd" ;
            }
            if ( GXutil.len( WebComp_Containerconsultalista_Component) != 0 )
            {
               WebComp_Containerconsultalista.setjustcreated();
               WebComp_Containerconsultalista.componentprepare(new Object[] {"W0323","",AV48EmprCod,Integer.valueOf(AV37CliCodfrom),Integer.valueOf(AV39CliCodto),AV15BarDisNumfrom,AV16BarDisNumto,AV21BarFecGenfrom,AV22BarFecGento,Byte.valueOf(AV31BarSitfrom),Byte.valueOf(AV32BarSitto),AV17BarFecClifrom,AV18BarFecClito,AV19BarFecFprfrom,AV20BarFecFprto,AV23BarFecSalfrom,AV24BarFecSalto,AV29BarSerfrom,AV30BarSerto,Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV11BarColNomfrom,AV12BarColNomto,Integer.valueOf(AV13BarColNumfrom),Integer.valueOf(AV14BarColNumto),AV25BarNomClifrom,AV26BarNomClito,Integer.valueOf(AV27BarNumClifrom),Integer.valueOf(AV28BarNumClito),Short.valueOf(AV33BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV45Muestras,Integer.valueOf(AV5BarCodfrom),Integer.valueOf(AV10BarCodto),Byte.valueOf(AV8BarCodReofrom),Byte.valueOf(AV9BarCodReoto),AV6BarCodParfrom,AV7BarCodParto,AV41Cod_Idtx,AV52BarGirar});
               WebComp_Containerconsultalista.componentbind(new Object[] {"","vCLICODFROM","vCLICODTO","vBARDISNUMFROM","vBARDISNUMTO","vBARFECGENFROM","vBARFECGENTO","vBARSITFROM","vBARSITTO","vBARFECCLIFROM","vBARFECCLITO","vBARFECFPRFROM","vBARFECFPRTO","vBARFECSALFROM","vBARFECSALTO","vBARSERFROM","vBARSERTO","vBARTIPARTFROM","vBARTIPARTTO","vBARCOLNOMFROM","vBARCOLNOMTO","vBARCOLNUMFROM","vBARCOLNUMTO","vBARNOMCLIFROM","vBARNOMCLITO","vBARNUMCLIFROM","vBARNUMCLITO","vBARTIPARTFROM","vBARTIPARTTO","vMUESTRAS","vBARCODFROM","vBARCODTO","vBARCODREOFROM","vBARCODREOTO","vBARCODPARFROM","vBARCODPARTO","vCOD_IDTX","vBARGIRAR"});
            }
            if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Containerconsultalista )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0323"+"");
               WebComp_Containerconsultalista.componentdraw();
               httpContext.ajax_rspEndCmp();
            }
            this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
            AV46ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
            AV46ProgressIndicator.hide();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ProgressIndicator", AV46ProgressIndicator);
   }

   public void S172( )
   {
      /* 'LIMPARFILTROS' Routine */
      returnInSub = false ;
      AV48EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48EmprCod", AV48EmprCod);
      AV15BarDisNumfrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarDisNumfrom", AV15BarDisNumfrom);
      AV16BarDisNumto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarDisNumto", AV16BarDisNumto);
      AV21BarFecGenfrom = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarFecGenfrom", localUtil.format(AV21BarFecGenfrom, "99/99/99"));
      AV22BarFecGento = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarFecGento", localUtil.format(AV22BarFecGento, "99/99/99"));
      AV31BarSitfrom = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarSitfrom), 2, 0));
      AV32BarSitto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitto), 2, 0));
      AV17BarFecClifrom = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarFecClifrom", localUtil.format(AV17BarFecClifrom, "99/99/99"));
      AV18BarFecClito = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarFecClito", localUtil.format(AV18BarFecClito, "99/99/99"));
      AV19BarFecFprfrom = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarFecFprfrom", localUtil.format(AV19BarFecFprfrom, "99/99/99"));
      AV20BarFecFprto = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarFecFprto", localUtil.format(AV20BarFecFprto, "99/99/99"));
      AV23BarFecSalfrom = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecSalfrom", localUtil.format(AV23BarFecSalfrom, "99/99/99"));
      AV24BarFecSalto = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarFecSalto", localUtil.format(AV24BarFecSalto, "99/99/99"));
      AV29BarSerfrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarSerfrom", AV29BarSerfrom);
      AV30BarSerto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarSerto", AV30BarSerto);
      AV33BarTipArtfrom = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarTipArtfrom), 4, 0));
      AV35BarTipArtto = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
      AV41Cod_Idtx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Cod_Idtx", AV41Cod_Idtx);
      AV37CliCodfrom = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliCodfrom), 6, 0));
      AV39CliCodto = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39CliCodto), 6, 0));
      Combo_bartipartfrom_Selectedvalue_set = ((0==AV33BarTipArtfrom) ? "" : GXutil.trim( GXutil.str( AV33BarTipArtfrom, 4, 0))) ;
      ucCombo_bartipartfrom.sendProperty(context, "", false, Combo_bartipartfrom_Internalname, "SelectedValue_set", Combo_bartipartfrom_Selectedvalue_set);
      Combo_bartipartto_Selectedvalue_set = ((0==AV35BarTipArtto) ? "" : GXutil.trim( GXutil.str( AV35BarTipArtto, 4, 0))) ;
      ucCombo_bartipartto.sendProperty(context, "", false, Combo_bartipartto_Internalname, "SelectedValue_set", Combo_bartipartto_Selectedvalue_set);
      Combo_cod_idtx_Selectedvalue_set = AV41Cod_Idtx ;
      ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "SelectedValue_set", Combo_cod_idtx_Selectedvalue_set);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV37CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV37CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
      Combo_clicodto_Selectedvalue_set = ((0==AV39CliCodto) ? "" : GXutil.trim( GXutil.str( AV39CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
      AV11BarColNomfrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomfrom", AV11BarColNomfrom);
      AV12BarColNomto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNomto", AV12BarColNomto);
      AV13BarColNumfrom = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNumfrom), 6, 0));
      AV14BarColNumto = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumto), 6, 0));
      AV25BarNomClifrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarNomClifrom", AV25BarNomClifrom);
      AV26BarNomClito = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarNomClito", AV26BarNomClito);
      AV27BarNumClifrom = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarNumClifrom), 6, 0));
      AV28BarNumClito = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarNumClito), 6, 0));
      AV45Muestras = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Muestras", AV45Muestras);
      AV5BarCodfrom = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodfrom), 8, 0));
      AV10BarCodto = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
      AV8BarCodReofrom = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReofrom", GXutil.str( AV8BarCodReofrom, 1, 0));
      AV9BarCodReoto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReoto", GXutil.str( AV9BarCodReoto, 1, 0));
      AV6BarCodParfrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodParfrom", AV6BarCodParfrom);
      AV7BarCodParto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodParto", AV7BarCodParto);
      AV52BarGirar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52BarGirar", AV52BarGirar);
      AV21BarFecGenfrom = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(180)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarFecGenfrom", localUtil.format(AV21BarFecGenfrom, "99/99/99"));
      AV22BarFecGento = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarFecGento", localUtil.format(AV22BarFecGento, "99/99/99"));
      AV31BarSitfrom = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarSitfrom), 2, 0));
      AV32BarSitto = (byte)(11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitto), 2, 0));
   }

   protected void nextLoad( )
   {
   }

   protected void e2124R2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_134_24R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable14_Internalname, tblTablemergedunnamedtable14_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomfrom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomfrom_Internalname, GXutil.rtrim( AV11BarColNomfrom), GXutil.rtrim( localUtil.format( AV11BarColNomfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomfrom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumfrom_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarColNumfrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarColNumfrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumfrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomto_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomto_Internalname, GXutil.rtrim( AV12BarColNomto), GXutil.rtrim( localUtil.format( AV12BarColNomto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomto_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumto_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumto_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarColNumto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarColNumto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclifrom_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclifrom_Internalname, GXutil.rtrim( AV25BarNomClifrom), GXutil.rtrim( localUtil.format( AV25BarNomClifrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclifrom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumclifrom_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclifrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV27BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclifrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27BarNumClifrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27BarNumClifrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclifrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclito_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclito_Internalname, GXutil.rtrim( AV26BarNomClito), GXutil.rtrim( localUtil.format( AV26BarNomClito, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclito_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumclito_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclito_Internalname, GXutil.ltrim( localUtil.ntoc( AV28BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclito_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28BarNumClito), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28BarNumClito), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclito_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_SDT__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_134_24R2e( true) ;
      }
      else
      {
         wb_table1_134_24R2e( false) ;
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
      pa24R2( ) ;
      ws24R2( ) ;
      we24R2( ) ;
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
      if ( ! ( WebComp_Wcconsultaproduccion_tabla_materializada == null ) )
      {
         WebComp_Wcconsultaproduccion_tabla_materializada.componentthemes();
      }
      if ( ! ( WebComp_Consultadeproduccion_test == null ) )
      {
         if ( GXutil.len( WebComp_Consultadeproduccion_test_Component) != 0 )
         {
            WebComp_Consultadeproduccion_test.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcconsultadeproduccion_sdt_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcconsultadeproduccion_sdt_wc_Component) != 0 )
         {
            WebComp_Wcconsultadeproduccion_sdt_wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcconsultadeproduccion_eo_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcconsultadeproduccion_eo_wc_Component) != 0 )
         {
            WebComp_Wcconsultadeproduccion_eo_wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Containerconsultalista == null ) )
      {
         if ( GXutil.len( WebComp_Containerconsultalista_Component) != 0 )
         {
            WebComp_Containerconsultalista.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269178552917", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultadeproduccion_sdt__wp.js", "?20269178552917", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      edtavBardisnumfrom_Internalname = "vBARDISNUMFROM" ;
      edtavBardisnumto_Internalname = "vBARDISNUMTO" ;
      edtavBarsitfrom_Internalname = "vBARSITFROM" ;
      edtavBarsitto_Internalname = "vBARSITTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavBarcodfrom_Internalname = "vBARCODFROM" ;
      edtavBarcodreofrom_Internalname = "vBARCODREOFROM" ;
      edtavBarcodparfrom_Internalname = "vBARCODPARFROM" ;
      edtavBarcodto_Internalname = "vBARCODTO" ;
      edtavBarcodreoto_Internalname = "vBARCODREOTO" ;
      edtavBarcodparto_Internalname = "vBARCODPARTO" ;
      divUnnamedtable18_Internalname = "UNNAMEDTABLE18" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      edtavBarserfrom_Internalname = "vBARSERFROM" ;
      edtavBarserto_Internalname = "vBARSERTO" ;
      divUnnamedtable16_Internalname = "UNNAMEDTABLE16" ;
      lblTextblockcombo_bartipartfrom_Internalname = "TEXTBLOCKCOMBO_BARTIPARTFROM" ;
      Combo_bartipartfrom_Internalname = "COMBO_BARTIPARTFROM" ;
      divTablesplittedbartipartfrom_Internalname = "TABLESPLITTEDBARTIPARTFROM" ;
      lblTextblockcombo_bartipartto_Internalname = "TEXTBLOCKCOMBO_BARTIPARTTO" ;
      Combo_bartipartto_Internalname = "COMBO_BARTIPARTTO" ;
      divTablesplittedbartipartto_Internalname = "TABLESPLITTEDBARTIPARTTO" ;
      divUnnamedtable17_Internalname = "UNNAMEDTABLE17" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      edtavBarcolnomfrom_Internalname = "vBARCOLNOMFROM" ;
      edtavBarcolnumfrom_Internalname = "vBARCOLNUMFROM" ;
      edtavBarcolnomto_Internalname = "vBARCOLNOMTO" ;
      edtavBarcolnumto_Internalname = "vBARCOLNUMTO" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      edtavBarnomclifrom_Internalname = "vBARNOMCLIFROM" ;
      edtavBarnumclifrom_Internalname = "vBARNUMCLIFROM" ;
      edtavBarnomclito_Internalname = "vBARNOMCLITO" ;
      edtavBarnumclito_Internalname = "vBARNUMCLITO" ;
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      tblTablemergedunnamedtable14_Internalname = "TABLEMERGEDUNNAMEDTABLE14" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      edtavBarfecclifrom_Internalname = "vBARFECCLIFROM" ;
      edtavBarfecclito_Internalname = "vBARFECCLITO" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavBarfecgenfrom_Internalname = "vBARFECGENFROM" ;
      edtavBarfecgento_Internalname = "vBARFECGENTO" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      edtavBarfecfprfrom_Internalname = "vBARFECFPRFROM" ;
      edtavBarfecfprto_Internalname = "vBARFECFPRTO" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      edtavBarfecsalfrom_Internalname = "vBARFECSALFROM" ;
      edtavBarfecsalto_Internalname = "vBARFECSALTO" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      lblTextblockcombo_cod_idtx_Internalname = "TEXTBLOCKCOMBO_COD_IDTX" ;
      Combo_cod_idtx_Internalname = "COMBO_COD_IDTX" ;
      divTablesplittedcod_idtx_Internalname = "TABLESPLITTEDCOD_IDTX" ;
      divCombo_cod_idtx_cell_Internalname = "COMBO_COD_IDTX_CELL" ;
      edtavBargirar_Internalname = "vBARGIRAR" ;
      cmbavMuestras.setInternalname( "vMUESTRAS" );
      divMuestras_cell_Internalname = "MUESTRAS_CELL" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnuseraction2_Internalname = "BTNUSERACTION2" ;
      bttBtnresultado2_Internalname = "BTNRESULTADO2" ;
      bttBtnresultado3_Internalname = "BTNRESULTADO3" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnresultado4_Internalname = "BTNRESULTADO4" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Datamon_Internalname = "DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab03_title_Internalname = "TAB03_TITLE" ;
      divTableresultado3_Internalname = "TABLERESULTADO3" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      divTableresultado2_Internalname = "TABLERESULTADO2" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      lblTab04_title_Internalname = "TAB04_TITLE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTablist4_title_Internalname = "TABLIST4_TITLE" ;
      divTableresultado4_Internalname = "TABLERESULTADO4" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavBartipartfrom_Internalname = "vBARTIPARTFROM" ;
      edtavBartipartto_Internalname = "vBARTIPARTTO" ;
      edtavCod_idtx_Internalname = "vCOD_IDTX" ;
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
      edtavBarnumclito_Jsonclick = "" ;
      edtavBarnumclito_Enabled = 1 ;
      edtavBarnomclito_Jsonclick = "" ;
      edtavBarnomclito_Enabled = 1 ;
      edtavBarnumclifrom_Jsonclick = "" ;
      edtavBarnumclifrom_Enabled = 1 ;
      edtavBarnomclifrom_Jsonclick = "" ;
      edtavBarnomclifrom_Enabled = 1 ;
      edtavBarcolnumto_Jsonclick = "" ;
      edtavBarcolnumto_Enabled = 1 ;
      edtavBarcolnomto_Jsonclick = "" ;
      edtavBarcolnomto_Enabled = 1 ;
      edtavBarcolnumfrom_Jsonclick = "" ;
      edtavBarcolnumfrom_Enabled = 1 ;
      edtavBarcolnomfrom_Jsonclick = "" ;
      edtavBarcolnomfrom_Enabled = 1 ;
      edtavCod_idtx_Jsonclick = "" ;
      edtavCod_idtx_Visible = 1 ;
      edtavBartipartto_Jsonclick = "" ;
      edtavBartipartto_Visible = 1 ;
      edtavBartipartfrom_Jsonclick = "" ;
      edtavBartipartfrom_Visible = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnresultado4_Visible = 1 ;
      bttBtnresultados_Visible = 1 ;
      bttBtnresultado3_Visible = 1 ;
      bttBtnresultado2_Visible = 1 ;
      cmbavMuestras.setJsonclick( "" );
      cmbavMuestras.setEnabled( 1 );
      cmbavMuestras.setVisible( 1 );
      divMuestras_cell_Class = "col-xs-12 col-sm-3" ;
      edtavBargirar_Jsonclick = "" ;
      edtavBargirar_Enabled = 1 ;
      lblTextblockcombo_cod_idtx_Caption = httpContext.getMessage( "Clear To Wear", "") ;
      divCombo_cod_idtx_cell_Class = "col-xs-12 col-sm-5" ;
      edtavBarfecsalto_Jsonclick = "" ;
      edtavBarfecsalto_Enabled = 1 ;
      edtavBarfecsalfrom_Jsonclick = "" ;
      edtavBarfecsalfrom_Enabled = 1 ;
      edtavBarfecfprto_Jsonclick = "" ;
      edtavBarfecfprto_Enabled = 1 ;
      edtavBarfecfprfrom_Jsonclick = "" ;
      edtavBarfecfprfrom_Enabled = 1 ;
      edtavBarfecgento_Jsonclick = "" ;
      edtavBarfecgento_Enabled = 1 ;
      edtavBarfecgenfrom_Jsonclick = "" ;
      edtavBarfecgenfrom_Enabled = 1 ;
      edtavBarfecclito_Jsonclick = "" ;
      edtavBarfecclito_Enabled = 1 ;
      edtavBarfecclifrom_Jsonclick = "" ;
      edtavBarfecclifrom_Enabled = 1 ;
      edtavBarserto_Jsonclick = "" ;
      edtavBarserto_Enabled = 1 ;
      edtavBarserfrom_Jsonclick = "" ;
      edtavBarserfrom_Enabled = 1 ;
      edtavBarcodparto_Jsonclick = "" ;
      edtavBarcodparto_Enabled = 1 ;
      edtavBarcodreoto_Jsonclick = "" ;
      edtavBarcodreoto_Enabled = 1 ;
      edtavBarcodto_Jsonclick = "" ;
      edtavBarcodto_Enabled = 1 ;
      edtavBarcodparfrom_Jsonclick = "" ;
      edtavBarcodparfrom_Enabled = 1 ;
      edtavBarcodreofrom_Jsonclick = "" ;
      edtavBarcodreofrom_Enabled = 1 ;
      edtavBarcodfrom_Jsonclick = "" ;
      edtavBarcodfrom_Enabled = 1 ;
      edtavBarsitto_Jsonclick = "" ;
      edtavBarsitto_Enabled = 1 ;
      edtavBarsitfrom_Jsonclick = "" ;
      edtavBarsitfrom_Enabled = 1 ;
      edtavBardisnumto_Jsonclick = "" ;
      edtavBardisnumto_Enabled = 1 ;
      edtavBardisnumfrom_Jsonclick = "" ;
      edtavBardisnumfrom_Enabled = 1 ;
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
      Gxuitabspanel_tabs_Pagecount = 5 ;
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
      Combo_cod_idtx_Emptyitemtext = "Todas" ;
      Combo_cod_idtx_Visible = GXutil.toBoolean( -1) ;
      Combo_cod_idtx_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Fechas", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Color", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Articulo", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Combo_bartipartto_Emptyitemtext = "Todos" ;
      Combo_bartipartto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_bartipartfrom_Emptyitemtext = "Todos" ;
      Combo_bartipartfrom_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Nº HDR", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta de Produccion", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavMuestras.setName( "vMUESTRAS" );
      cmbavMuestras.setWebtags( "" );
      cmbavMuestras.addItem(" ", httpContext.getMessage( "Todo", ""), (short)(0));
      cmbavMuestras.addItem("N", httpContext.getMessage( "Sem Amostras", ""), (short)(0));
      cmbavMuestras.addItem("S", httpContext.getMessage( "Com Amostras", ""), (short)(0));
      if ( cmbavMuestras.getItemCount() > 0 )
      {
         AV45Muestras = cmbavMuestras.getValidValue(AV45Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Muestras", AV45Muestras);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUSERACTION2'","{handler:'e1324R2',iparms:[]");
      setEventMetadata("'DOUSERACTION2'",",oparms:[{av:'AV48EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV16BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV21BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV22BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV31BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV32BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV17BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV18BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV19BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV20BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV23BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV24BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV29BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV30BarSerto',fld:'vBARSERTO',pic:''},{av:'AV33BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV41Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV37CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV39CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'Combo_bartipartfrom_Selectedvalue_set',ctrl:'COMBO_BARTIPARTFROM',prop:'SelectedValue_set'},{av:'Combo_bartipartto_Selectedvalue_set',ctrl:'COMBO_BARTIPARTTO',prop:'SelectedValue_set'},{av:'Combo_cod_idtx_Selectedvalue_set',ctrl:'COMBO_COD_IDTX',prop:'SelectedValue_set'},{av:'Combo_clicodfrom_Selectedvalue_set',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_set'},{av:'Combo_clicodto_Selectedvalue_set',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_set'},{av:'AV11BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV12BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV13BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV14BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV27BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV28BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'cmbavMuestras'},{av:'AV45Muestras',fld:'vMUESTRAS',pic:''},{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV8BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV9BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV6BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV7BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV52BarGirar',fld:'vBARGIRAR',pic:''}]}");
      setEventMetadata("'DORESULTADO2'","{handler:'e1424R2',iparms:[{av:'AV48EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV39CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV15BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV16BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV21BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV22BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV31BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV32BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV17BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV18BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV19BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV20BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV23BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV24BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV29BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV30BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV12BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV13BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV14BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV27BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV28BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV33BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'cmbavMuestras'},{av:'AV45Muestras',fld:'vMUESTRAS',pic:''},{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV8BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV9BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV6BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV7BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV41Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV52BarGirar',fld:'vBARGIRAR',pic:''}]");
      setEventMetadata("'DORESULTADO2'",",oparms:[{ctrl:'CONSULTADEPRODUCCION_TEST'}]}");
      setEventMetadata("'DORESULTADO3'","{handler:'e1124R1',iparms:[]");
      setEventMetadata("'DORESULTADO3'",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1524R2',iparms:[{av:'AV31BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV32BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV48EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV39CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV15BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV16BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV21BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV22BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV17BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV18BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV19BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV20BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV23BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV24BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV29BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV30BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV12BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV13BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV14BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV27BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV28BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV33BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'cmbavMuestras'},{av:'AV45Muestras',fld:'vMUESTRAS',pic:''},{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV8BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV9BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV6BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV7BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV41Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV52BarGirar',fld:'vBARGIRAR',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{ctrl:'WCCONSULTADEPRODUCCION_SDT_WC'}]}");
      setEventMetadata("'DORESULTADO4'","{handler:'e1624R2',iparms:[{av:'AV31BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV32BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV48EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV39CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV15BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV16BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV21BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV22BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV17BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV18BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV19BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV20BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV23BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV24BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV29BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV30BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV12BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV13BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV14BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV27BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV28BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV33BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'cmbavMuestras'},{av:'AV45Muestras',fld:'vMUESTRAS',pic:''},{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV8BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV9BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV6BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV7BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV41Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV52BarGirar',fld:'vBARGIRAR',pic:''}]");
      setEventMetadata("'DORESULTADO4'",",oparms:[{ctrl:'WCCONSULTADEPRODUCCION_EO_WC'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1724R2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e1824R2',iparms:[{av:'AV31BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV32BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV48EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV39CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV15BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV16BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV21BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV22BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV17BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV18BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV19BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV20BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV23BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV24BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV29BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV30BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV12BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV13BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV14BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV27BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV28BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV33BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'cmbavMuestras'},{av:'AV45Muestras',fld:'vMUESTRAS',pic:''},{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV8BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV9BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV6BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV7BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV41Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV52BarGirar',fld:'vBARGIRAR',pic:''}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{ctrl:'CONTAINERCONSULTALISTA'}]}");
      setEventMetadata("VBARCODFROM.ISVALID","{handler:'e1924R2',iparms:[{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VBARCODFROM.ISVALID",",oparms:[{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV17BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV23BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV22BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV21BarFecGenfrom',fld:'vBARFECGENFROM',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e2024R2',iparms:[{av:'AV31BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV32BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV48EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV39CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV15BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV16BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV21BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV22BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV17BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV18BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV19BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV20BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV23BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV24BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV29BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV30BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV12BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV13BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV14BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV27BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV28BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV33BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'cmbavMuestras'},{av:'AV45Muestras',fld:'vMUESTRAS',pic:''},{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV8BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV9BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV6BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV7BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV41Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV52BarGirar',fld:'vBARGIRAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{ctrl:'CONTAINERCONSULTALISTA'}]}");
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
      Combo_cod_idtx_Selectedvalue_get = "" ;
      Combo_bartipartto_Selectedvalue_get = "" ;
      Combo_bartipartfrom_Selectedvalue_get = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV38CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV40CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV34BarTipArtfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV36BarTipArtto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV42Cod_Idtx_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV48EmprCod = "" ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Combo_bartipartfrom_Selectedvalue_set = "" ;
      Combo_bartipartto_Selectedvalue_set = "" ;
      Combo_cod_idtx_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      TempTags = "" ;
      AV15BarDisNumfrom = "" ;
      AV16BarDisNumto = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      AV6BarCodParfrom = "" ;
      AV7BarCodParto = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      AV29BarSerfrom = "" ;
      AV30BarSerto = "" ;
      lblTextblockcombo_bartipartfrom_Jsonclick = "" ;
      ucCombo_bartipartfrom = new com.genexus.webpanels.GXUserControl();
      Combo_bartipartfrom_Caption = "" ;
      lblTextblockcombo_bartipartto_Jsonclick = "" ;
      ucCombo_bartipartto = new com.genexus.webpanels.GXUserControl();
      Combo_bartipartto_Caption = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      AV17BarFecClifrom = GXutil.nullDate() ;
      AV18BarFecClito = GXutil.nullDate() ;
      AV21BarFecGenfrom = GXutil.nullDate() ;
      AV22BarFecGento = GXutil.nullDate() ;
      AV19BarFecFprfrom = GXutil.nullDate() ;
      AV20BarFecFprto = GXutil.nullDate() ;
      AV23BarFecSalfrom = GXutil.nullDate() ;
      AV24BarFecSalto = GXutil.nullDate() ;
      lblTextblockcombo_cod_idtx_Jsonclick = "" ;
      ucCombo_cod_idtx = new com.genexus.webpanels.GXUserControl();
      Combo_cod_idtx_Caption = "" ;
      AV52BarGirar = "" ;
      AV45Muestras = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnuseraction2_Jsonclick = "" ;
      bttBtnresultado2_Jsonclick = "" ;
      bttBtnresultado3_Jsonclick = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnresultado4_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab03_title_Jsonclick = "" ;
      WebComp_Wcconsultaproduccion_tabla_materializada_Component = "" ;
      OldWcconsultaproduccion_tabla_materializada = "" ;
      lblTab02_title_Jsonclick = "" ;
      WebComp_Consultadeproduccion_test_Component = "" ;
      OldConsultadeproduccion_test = "" ;
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcconsultadeproduccion_sdt_wc_Component = "" ;
      OldWcconsultadeproduccion_sdt_wc = "" ;
      lblTab04_title_Jsonclick = "" ;
      WebComp_Wcconsultadeproduccion_eo_wc_Component = "" ;
      OldWcconsultadeproduccion_eo_wc = "" ;
      lblTablist4_title_Jsonclick = "" ;
      WebComp_Containerconsultalista_Component = "" ;
      OldContainerconsultalista = "" ;
      AV56Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV41Cod_Idtx = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV11BarColNomfrom = "" ;
      AV12BarColNomto = "" ;
      AV25BarNomClifrom = "" ;
      AV26BarNomClito = "" ;
      AV47Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV49EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV50UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV46ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H024R2_A396EmprCod = new String[] {""} ;
      H024R2_A13810Dsc_IdtxID = new String[] {""} ;
      H024R2_A10887Cod_Idtx = new String[] {""} ;
      H024R2_A10888Dsc_Idtx = new String[] {""} ;
      H024R2_n10888Dsc_Idtx = new boolean[] {false} ;
      A13810Dsc_IdtxID = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV43Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H024R3_A396EmprCod = new String[] {""} ;
      H024R3_A13788TipArtCodD = new String[] {""} ;
      H024R3_A829TipArtCod = new short[1] ;
      H024R3_A830TipArtDsc = new String[] {""} ;
      H024R3_n830TipArtDsc = new boolean[] {false} ;
      H024R3_A6014TipArtDsc2 = new String[] {""} ;
      H024R3_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      H024R4_A396EmprCod = new String[] {""} ;
      H024R4_A13788TipArtCodD = new String[] {""} ;
      H024R4_A829TipArtCod = new short[1] ;
      H024R4_A830TipArtDsc = new String[] {""} ;
      H024R4_n830TipArtDsc = new boolean[] {false} ;
      H024R4_A6014TipArtDsc2 = new String[] {""} ;
      H024R4_n6014TipArtDsc2 = new boolean[] {false} ;
      H024R5_A396EmprCod = new String[] {""} ;
      H024R5_A10045CliAct = new String[] {""} ;
      H024R5_A13735CliCNom = new String[] {""} ;
      H024R5_A252CliCod = new int[1] ;
      H024R5_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H024R6_A396EmprCod = new String[] {""} ;
      H024R6_A10045CliAct = new String[] {""} ;
      H024R6_A13735CliCNom = new String[] {""} ;
      H024R6_A252CliCod = new int[1] ;
      H024R6_A279CliNom = new String[] {""} ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_sdt__wp__default(),
         new Object[] {
             new Object[] {
            H024R2_A396EmprCod, H024R2_A13810Dsc_IdtxID, H024R2_A10887Cod_Idtx, H024R2_A10888Dsc_Idtx, H024R2_n10888Dsc_Idtx
            }
            , new Object[] {
            H024R3_A396EmprCod, H024R3_A13788TipArtCodD, H024R3_A829TipArtCod, H024R3_A830TipArtDsc, H024R3_n830TipArtDsc, H024R3_A6014TipArtDsc2, H024R3_n6014TipArtDsc2
            }
            , new Object[] {
            H024R4_A396EmprCod, H024R4_A13788TipArtCodD, H024R4_A829TipArtCod, H024R4_A830TipArtDsc, H024R4_n830TipArtDsc, H024R4_A6014TipArtDsc2, H024R4_n6014TipArtDsc2
            }
            , new Object[] {
            H024R5_A396EmprCod, H024R5_A10045CliAct, H024R5_A13735CliCNom, H024R5_A252CliCod, H024R5_A279CliNom
            }
            , new Object[] {
            H024R6_A396EmprCod, H024R6_A10045CliAct, H024R6_A13735CliCNom, H024R6_A252CliCod, H024R6_A279CliNom
            }
         }
      );
      AV56Pgmname = "Produccion.ConsultadeProduccion_SDT__WP" ;
      /* GeneXus formulas. */
      AV56Pgmname = "Produccion.ConsultadeProduccion_SDT__WP" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcconsultaproduccion_tabla_materializada = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Consultadeproduccion_test = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcconsultadeproduccion_sdt_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcconsultadeproduccion_eo_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Containerconsultalista = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV31BarSitfrom ;
   private byte AV32BarSitto ;
   private byte AV8BarCodReofrom ;
   private byte AV9BarCodReoto ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
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
   private short AV33BarTipArtfrom ;
   private short AV35BarTipArtto ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV44Moda21 ;
   private short A829TipArtCod ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavBardisnumfrom_Enabled ;
   private int edtavBardisnumto_Enabled ;
   private int edtavBarsitfrom_Enabled ;
   private int edtavBarsitto_Enabled ;
   private int AV5BarCodfrom ;
   private int edtavBarcodfrom_Enabled ;
   private int edtavBarcodreofrom_Enabled ;
   private int edtavBarcodparfrom_Enabled ;
   private int AV10BarCodto ;
   private int edtavBarcodto_Enabled ;
   private int edtavBarcodreoto_Enabled ;
   private int edtavBarcodparto_Enabled ;
   private int edtavBarserfrom_Enabled ;
   private int edtavBarserto_Enabled ;
   private int edtavBarfecclifrom_Enabled ;
   private int edtavBarfecclito_Enabled ;
   private int edtavBarfecgenfrom_Enabled ;
   private int edtavBarfecgento_Enabled ;
   private int edtavBarfecfprfrom_Enabled ;
   private int edtavBarfecfprto_Enabled ;
   private int edtavBarfecsalfrom_Enabled ;
   private int edtavBarfecsalto_Enabled ;
   private int edtavBargirar_Enabled ;
   private int bttBtnresultado2_Visible ;
   private int bttBtnresultado3_Visible ;
   private int bttBtnresultados_Visible ;
   private int bttBtnresultado4_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV37CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV39CliCodto ;
   private int edtavClicodto_Visible ;
   private int edtavBartipartfrom_Visible ;
   private int edtavBartipartto_Visible ;
   private int edtavCod_idtx_Visible ;
   private int AV13BarColNumfrom ;
   private int AV14BarColNumto ;
   private int AV27BarNumClifrom ;
   private int AV28BarNumClito ;
   private int A252CliCod ;
   private int edtavBarcolnomfrom_Enabled ;
   private int edtavBarcolnumfrom_Enabled ;
   private int edtavBarcolnomto_Enabled ;
   private int edtavBarcolnumto_Enabled ;
   private int edtavBarnomclifrom_Enabled ;
   private int edtavBarnumclifrom_Enabled ;
   private int edtavBarnomclito_Enabled ;
   private int edtavBarnumclito_Enabled ;
   private int idxLst ;
   private String Combo_cod_idtx_Selectedvalue_get ;
   private String Combo_bartipartto_Selectedvalue_get ;
   private String Combo_bartipartfrom_Selectedvalue_get ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV48EmprCod ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Combo_bartipartfrom_Cls ;
   private String Combo_bartipartfrom_Selectedvalue_set ;
   private String Combo_bartipartfrom_Emptyitemtext ;
   private String Combo_bartipartto_Cls ;
   private String Combo_bartipartto_Selectedvalue_set ;
   private String Combo_bartipartto_Emptyitemtext ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Combo_cod_idtx_Cls ;
   private String Combo_cod_idtx_Selectedvalue_set ;
   private String Combo_cod_idtx_Emptyitemtext ;
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
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedclicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Jsonclick ;
   private String Combo_clicodfrom_Caption ;
   private String Combo_clicodfrom_Internalname ;
   private String divTablesplittedclicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Jsonclick ;
   private String Combo_clicodto_Caption ;
   private String Combo_clicodto_Internalname ;
   private String edtavBardisnumfrom_Internalname ;
   private String TempTags ;
   private String AV15BarDisNumfrom ;
   private String edtavBardisnumfrom_Jsonclick ;
   private String edtavBardisnumto_Internalname ;
   private String AV16BarDisNumto ;
   private String edtavBardisnumto_Jsonclick ;
   private String edtavBarsitfrom_Internalname ;
   private String edtavBarsitfrom_Jsonclick ;
   private String edtavBarsitto_Internalname ;
   private String edtavBarsitto_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable18_Internalname ;
   private String edtavBarcodfrom_Internalname ;
   private String edtavBarcodfrom_Jsonclick ;
   private String edtavBarcodreofrom_Internalname ;
   private String edtavBarcodreofrom_Jsonclick ;
   private String edtavBarcodparfrom_Internalname ;
   private String AV6BarCodParfrom ;
   private String edtavBarcodparfrom_Jsonclick ;
   private String edtavBarcodto_Internalname ;
   private String edtavBarcodto_Jsonclick ;
   private String edtavBarcodreoto_Internalname ;
   private String edtavBarcodreoto_Jsonclick ;
   private String edtavBarcodparto_Internalname ;
   private String AV7BarCodParto ;
   private String edtavBarcodparto_Jsonclick ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable16_Internalname ;
   private String edtavBarserfrom_Internalname ;
   private String AV29BarSerfrom ;
   private String edtavBarserfrom_Jsonclick ;
   private String edtavBarserto_Internalname ;
   private String AV30BarSerto ;
   private String edtavBarserto_Jsonclick ;
   private String divUnnamedtable17_Internalname ;
   private String divTablesplittedbartipartfrom_Internalname ;
   private String lblTextblockcombo_bartipartfrom_Internalname ;
   private String lblTextblockcombo_bartipartfrom_Jsonclick ;
   private String Combo_bartipartfrom_Caption ;
   private String Combo_bartipartfrom_Internalname ;
   private String divTablesplittedbartipartto_Internalname ;
   private String lblTextblockcombo_bartipartto_Internalname ;
   private String lblTextblockcombo_bartipartto_Jsonclick ;
   private String Combo_bartipartto_Caption ;
   private String Combo_bartipartto_Internalname ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String edtavBarfecclifrom_Internalname ;
   private String edtavBarfecclifrom_Jsonclick ;
   private String edtavBarfecclito_Internalname ;
   private String edtavBarfecclito_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtavBarfecgenfrom_Internalname ;
   private String edtavBarfecgenfrom_Jsonclick ;
   private String edtavBarfecgento_Internalname ;
   private String edtavBarfecgento_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String edtavBarfecfprfrom_Internalname ;
   private String edtavBarfecfprfrom_Jsonclick ;
   private String edtavBarfecfprto_Internalname ;
   private String edtavBarfecfprto_Jsonclick ;
   private String divUnnamedtable13_Internalname ;
   private String edtavBarfecsalfrom_Internalname ;
   private String edtavBarfecsalfrom_Jsonclick ;
   private String edtavBarfecsalto_Internalname ;
   private String edtavBarfecsalto_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String divCombo_cod_idtx_cell_Internalname ;
   private String divCombo_cod_idtx_cell_Class ;
   private String divTablesplittedcod_idtx_Internalname ;
   private String lblTextblockcombo_cod_idtx_Internalname ;
   private String lblTextblockcombo_cod_idtx_Caption ;
   private String lblTextblockcombo_cod_idtx_Jsonclick ;
   private String Combo_cod_idtx_Caption ;
   private String Combo_cod_idtx_Internalname ;
   private String edtavBargirar_Internalname ;
   private String AV52BarGirar ;
   private String edtavBargirar_Jsonclick ;
   private String divMuestras_cell_Internalname ;
   private String divMuestras_cell_Class ;
   private String AV45Muestras ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnuseraction2_Internalname ;
   private String bttBtnuseraction2_Jsonclick ;
   private String bttBtnresultado2_Internalname ;
   private String bttBtnresultado2_Jsonclick ;
   private String bttBtnresultado3_Internalname ;
   private String bttBtnresultado3_Jsonclick ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnresultado4_Internalname ;
   private String bttBtnresultado4_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String Datamon_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab03_title_Internalname ;
   private String lblTab03_title_Jsonclick ;
   private String divTableresultado3_Internalname ;
   private String WebComp_Wcconsultaproduccion_tabla_materializada_Component ;
   private String OldWcconsultaproduccion_tabla_materializada ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divTableresultado2_Internalname ;
   private String WebComp_Consultadeproduccion_test_Component ;
   private String OldConsultadeproduccion_test ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcconsultadeproduccion_sdt_wc_Component ;
   private String OldWcconsultadeproduccion_sdt_wc ;
   private String lblTab04_title_Internalname ;
   private String lblTab04_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcconsultadeproduccion_eo_wc_Component ;
   private String OldWcconsultadeproduccion_eo_wc ;
   private String lblTablist4_title_Internalname ;
   private String lblTablist4_title_Jsonclick ;
   private String divTableresultado4_Internalname ;
   private String WebComp_Containerconsultalista_Component ;
   private String OldContainerconsultalista ;
   private String edtavPgmname_Internalname ;
   private String AV56Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavBartipartfrom_Internalname ;
   private String edtavBartipartfrom_Jsonclick ;
   private String edtavBartipartto_Internalname ;
   private String edtavBartipartto_Jsonclick ;
   private String edtavCod_idtx_Internalname ;
   private String AV41Cod_Idtx ;
   private String edtavCod_idtx_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV11BarColNomfrom ;
   private String edtavBarcolnomfrom_Internalname ;
   private String edtavBarcolnumfrom_Internalname ;
   private String AV12BarColNomto ;
   private String edtavBarcolnomto_Internalname ;
   private String edtavBarcolnumto_Internalname ;
   private String AV25BarNomClifrom ;
   private String edtavBarnomclifrom_Internalname ;
   private String edtavBarnumclifrom_Internalname ;
   private String AV26BarNomClito ;
   private String edtavBarnomclito_Internalname ;
   private String edtavBarnumclito_Internalname ;
   private String AV47Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV49EmprNom ;
   private String GXv_char3[] ;
   private String AV50UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String sStyleString ;
   private String tblTablemergedunnamedtable14_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String edtavBarcolnomfrom_Jsonclick ;
   private String edtavBarcolnumfrom_Jsonclick ;
   private String edtavBarcolnomto_Jsonclick ;
   private String edtavBarcolnumto_Jsonclick ;
   private String divUnnamedtable15_Internalname ;
   private String edtavBarnomclifrom_Jsonclick ;
   private String edtavBarnumclifrom_Jsonclick ;
   private String edtavBarnomclito_Jsonclick ;
   private String edtavBarnumclito_Jsonclick ;
   private java.util.Date AV17BarFecClifrom ;
   private java.util.Date AV18BarFecClito ;
   private java.util.Date AV21BarFecGenfrom ;
   private java.util.Date AV22BarFecGento ;
   private java.util.Date AV19BarFecFprfrom ;
   private java.util.Date AV20BarFecFprto ;
   private java.util.Date AV23BarFecSalfrom ;
   private java.util.Date AV24BarFecSalto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Combo_cod_idtx_Visible ;
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
   private boolean bDynCreated_Consultadeproduccion_test ;
   private boolean bDynCreated_Wcconsultadeproduccion_sdt_wc ;
   private boolean bDynCreated_Wcconsultadeproduccion_eo_wc ;
   private boolean Cond_result ;
   private boolean n10888Dsc_Idtx ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private boolean bDynCreated_Containerconsultalista ;
   private String A13810Dsc_IdtxID ;
   private String A13788TipArtCodD ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcconsultaproduccion_tabla_materializada ;
   private GXWebComponent WebComp_Consultadeproduccion_test ;
   private GXWebComponent WebComp_Wcconsultadeproduccion_sdt_wc ;
   private GXWebComponent WebComp_Wcconsultadeproduccion_eo_wc ;
   private GXWebComponent WebComp_Containerconsultalista ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipartfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipartto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucCombo_cod_idtx ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV46ProgressIndicator ;
   private HTMLChoice cmbavMuestras ;
   private IDataStoreProvider pr_default ;
   private String[] H024R2_A396EmprCod ;
   private String[] H024R2_A13810Dsc_IdtxID ;
   private String[] H024R2_A10887Cod_Idtx ;
   private String[] H024R2_A10888Dsc_Idtx ;
   private boolean[] H024R2_n10888Dsc_Idtx ;
   private String[] H024R3_A396EmprCod ;
   private String[] H024R3_A13788TipArtCodD ;
   private short[] H024R3_A829TipArtCod ;
   private String[] H024R3_A830TipArtDsc ;
   private boolean[] H024R3_n830TipArtDsc ;
   private String[] H024R3_A6014TipArtDsc2 ;
   private boolean[] H024R3_n6014TipArtDsc2 ;
   private String[] H024R4_A396EmprCod ;
   private String[] H024R4_A13788TipArtCodD ;
   private short[] H024R4_A829TipArtCod ;
   private String[] H024R4_A830TipArtDsc ;
   private boolean[] H024R4_n830TipArtDsc ;
   private String[] H024R4_A6014TipArtDsc2 ;
   private boolean[] H024R4_n6014TipArtDsc2 ;
   private String[] H024R5_A396EmprCod ;
   private String[] H024R5_A10045CliAct ;
   private String[] H024R5_A13735CliCNom ;
   private int[] H024R5_A252CliCod ;
   private String[] H024R5_A279CliNom ;
   private String[] H024R6_A396EmprCod ;
   private String[] H024R6_A10045CliAct ;
   private String[] H024R6_A13735CliCNom ;
   private int[] H024R6_A252CliCod ;
   private String[] H024R6_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV38CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40CliCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV34BarTipArtfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV36BarTipArtto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV42Cod_Idtx_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV43Combo_DataItem ;
}

final  class consultadeproduccion_sdt__wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H024R2", "SELECT EmprCod, RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024R3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024R4", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024R5", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024R6", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 4 :
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

