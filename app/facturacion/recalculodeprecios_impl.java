package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recalculodeprecios_impl extends GXDataArea
{
   public recalculodeprecios_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recalculodeprecios_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recalculodeprecios_impl.class ));
   }

   public recalculodeprecios_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavOpcion = new HTMLChoice();
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
      pa2292( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2292( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.recalculodeprecios", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV11CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV11CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV13CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV13CliCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV22EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitem", GXutil.booltostr( Combo_clicodfrom_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitem", GXutil.booltostr( Combo_clicodto_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
         we2292( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2292( ) ;
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
      return formatLink("app.facturacion.recalculodeprecios", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.ReCalculodePrecios" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Re Calculo de Precios", "") ;
   }

   public void wb2290( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofecfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofecfrom_Internalname, httpContext.getMessage( "Data Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofecfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofecfrom_Internalname, localUtil.format(AV9AlbProFecfrom, "99/99/99"), localUtil.format( AV9AlbProFecfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofecfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofecfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofecfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofecfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofecto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofecto_Internalname, httpContext.getMessage( "Data Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofecto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofecto_Internalname, localUtil.format(AV10AlbProFecto, "99/99/99"), localUtil.format( AV10AlbProFecto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofecto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofecto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofecto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofecto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodfrom_Internalname, httpContext.getMessage( "Guia Remessa Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV7AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCodfrom), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCodfrom), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodfrom_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodto_Internalname, httpContext.getMessage( "Guia Remessa Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV8AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCodto), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCodto), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodto_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItem", Combo_clicodfrom_Emptyitem);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV11CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItem", Combo_clicodto_Emptyitem);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV13CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOpcion.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOpcion.getInternalname(), httpContext.getMessage( "Opção", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOpcion, cmbavOpcion.getInternalname(), GXutil.rtrim( AV14Opcion), 1, cmbavOpcion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavOpcion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "", true, (byte)(0), "HLP_Facturacion\\ReCalculodePrecios.htm");
         cmbavOpcion.setValue( GXutil.rtrim( AV14Opcion) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "El campo Opcion indicara al sistema si deseamos eliminar o no las fases que tiene asociada un albaran de Salida", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\ReCalculodePrecios.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112291_client"+"'", TempTags, "", 2, "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavJson_messages_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavJson_messages_Internalname, AV20json_messages, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", (short)(0), 1, edtavJson_messages_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\ReCalculodePrecios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavJson_messages2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavJson_messages2_Internalname, httpContext.getMessage( "Informacion para el listado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavJson_messages2_Internalname, AV21json_messages2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", (short)(0), 1, edtavJson_messages2_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\ReCalculodePrecios.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV26Pgmname), GXutil.rtrim( localUtil.format( AV26Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV5CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ReCalculodePrecios.htm");
         wb_table1_119_2292( true) ;
      }
      else
      {
         wb_table1_119_2292( false) ;
      }
      return  ;
   }

   public void wb_table1_119_2292e( boolean wbgen )
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

   public void start2292( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Re Calculo de Precios", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2290( ) ;
   }

   public void ws2292( )
   {
      start2292( ) ;
      evt2292( ) ;
   }

   public void evt2292( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122292 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e132292 ();
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
                                 e142292 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e152292 ();
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

   public void we2292( )
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

   public void pa2292( )
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
            GX_FocusControl = edtavAlbprofecfrom_Internalname ;
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
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV14Opcion = cmbavOpcion.getValidValue(AV14Opcion) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Opcion", AV14Opcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOpcion.setValue( GXutil.rtrim( AV14Opcion) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2292( ) ;
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
      AV26Pgmname = "Facturacion.ReCalculodePrecios" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Pgmname", AV26Pgmname);
      Gx_err = (short)(0) ;
      edtavJson_messages_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJson_messages_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJson_messages_Enabled), 5, 0), true);
      edtavJson_messages2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJson_messages2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJson_messages2_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2292( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H02292 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = H02292_A396EmprCod[0] ;
            /* Execute user event: Load */
            e152292 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb2290( ) ;
      }
   }

   public void send_integrity_lvl_hashes2292( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV22EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV26Pgmname = "Facturacion.ReCalculodePrecios" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Pgmname", AV26Pgmname);
      Gx_err = (short)(0) ;
      edtavJson_messages_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJson_messages_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJson_messages_Enabled), 5, 0), true);
      edtavJson_messages2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJson_messages2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJson_messages2_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2290( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132292 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV11CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV13CliCodto_Data);
         /* Read saved values. */
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitem")) ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODTO_Emptyitem")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofecfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFECFROM");
            GX_FocusControl = edtavAlbprofecfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9AlbProFecfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProFecfrom", localUtil.format(AV9AlbProFecfrom, "99/99/99"));
         }
         else
         {
            AV9AlbProFecfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprofecfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProFecfrom", localUtil.format(AV9AlbProFecfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofecto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFECTO");
            GX_FocusControl = edtavAlbprofecto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10AlbProFecto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProFecto", localUtil.format(AV10AlbProFecto, "99/99/99"));
         }
         else
         {
            AV10AlbProFecto = localUtil.ctod( httpContext.cgiGet( edtavAlbprofecto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProFecto", localUtil.format(AV10AlbProFecto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODFROM");
            GX_FocusControl = edtavAlbprocodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7AlbProCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbProCodfrom), 10, 0));
         }
         else
         {
            AV7AlbProCodfrom = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbProCodfrom), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODTO");
            GX_FocusControl = edtavAlbprocodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8AlbProCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCodto), 10, 0));
         }
         else
         {
            AV8AlbProCodto = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCodto), 10, 0));
         }
         cmbavOpcion.setValue( httpContext.cgiGet( cmbavOpcion.getInternalname()) );
         AV14Opcion = httpContext.cgiGet( cmbavOpcion.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Opcion", AV14Opcion);
         AV20json_messages = httpContext.cgiGet( edtavJson_messages_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20json_messages", AV20json_messages);
         AV21json_messages2 = httpContext.cgiGet( edtavJson_messages2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21json_messages2", AV21json_messages2);
         AV26Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Pgmname", AV26Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCodfrom), 6, 0));
         }
         else
         {
            AV5CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCodto), 6, 0));
         }
         else
         {
            AV6CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCodto), 6, 0));
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
      e132292 ();
      if (returnInSub) return;
   }

   public void e132292( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV10AlbProFecto = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProFecto", localUtil.format(AV10AlbProFecto, "99/99/99"));
      AV14Opcion = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Opcion", AV14Opcion);
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recalculodeprecios_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = AV22EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      recalculodeprecios_impl.this.AV22EmprCod = GXv_char2[0] ;
      recalculodeprecios_impl.this.AV17EmprNom = GXv_char3[0] ;
      recalculodeprecios_impl.this.AV18UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22EmprCod, "@!"))));
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
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142292 ();
      if (returnInSub) return;
   }

   public void e142292( )
   {
      /* Enter Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
   }

   public void e122292( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S132 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV20json_messages = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20json_messages", AV20json_messages);
      if ( GXutil.strcmp(AV14Opcion, "S") == 0 )
      {
         GXt_objcol_SdtMessages_Message5 = AV19messages ;
         GXv_objcol_SdtMessages_Message6[0] = GXt_objcol_SdtMessages_Message5 ;
         new app.pretar2(remoteHandle, context).execute( AV22EmprCod, AV9AlbProFecfrom, AV10AlbProFecto, AV7AlbProCodfrom, AV8AlbProCodto, AV5CliCodfrom, AV6CliCodto, AV14Opcion, GXv_objcol_SdtMessages_Message6) ;
         GXt_objcol_SdtMessages_Message5 = GXv_objcol_SdtMessages_Message6[0] ;
         AV19messages = GXt_objcol_SdtMessages_Message5 ;
         AV20json_messages = AV19messages.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20json_messages", AV20json_messages);
      }
      GXt_objcol_SdtMessages_Message5 = AV19messages ;
      GXv_objcol_SdtMessages_Message6[0] = GXt_objcol_SdtMessages_Message5 ;
      new app.facturacion.pretar(remoteHandle, context).execute( AV22EmprCod, AV9AlbProFecfrom, AV10AlbProFecto, AV7AlbProCodfrom, AV8AlbProCodto, AV5CliCodfrom, AV6CliCodto, AV14Opcion, GXv_objcol_SdtMessages_Message6) ;
      GXt_objcol_SdtMessages_Message5 = GXv_objcol_SdtMessages_Message6[0] ;
      AV19messages = GXt_objcol_SdtMessages_Message5 ;
      if ( AV19messages.size() > 0 )
      {
         AV21json_messages2 = AV19messages.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21json_messages2", AV21json_messages2);
         AV23WebSession.setValue(httpContext.getMessage( "ReCalculodePreciosToPRETAR1_json", ""), AV21json_messages2);
         httpContext.popup(formatLink("app.facturacion.pretar1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod))}, new String[] {"EmprCod"}) , new Object[] {});
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H02293 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H02293_A10045CliAct[0] ;
         A396EmprCod = H02293_A396EmprCod[0] ;
         A279CliNom = H02293_A279CliNom[0] ;
         A252CliCod = H02293_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV13CliCodto_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clicodto_Selectedvalue_set = ((0==AV6CliCodto) ? "" : GXutil.trim( GXutil.str( AV6CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H02294 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H02294_A10045CliAct[0] ;
         A396EmprCod = H02294_A396EmprCod[0] ;
         A279CliNom = H02294_A279CliNom[0] ;
         A252CliCod = H02294_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV11CliCodfrom_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV5CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV5CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e152292( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_119_2292( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_119_2292e( true) ;
      }
      else
      {
         wb_table1_119_2292e( false) ;
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
      pa2292( ) ;
      ws2292( ) ;
      we2292( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415131628", true, true);
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
      httpContext.AddJavascriptSource("facturacion/recalculodeprecios.js", "?202682415131629", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      edtavAlbprofecfrom_Internalname = "vALBPROFECFROM" ;
      edtavAlbprofecto_Internalname = "vALBPROFECTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavAlbprocodfrom_Internalname = "vALBPROCODFROM" ;
      edtavAlbprocodto_Internalname = "vALBPROCODTO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      cmbavOpcion.setInternalname( "vOPCION" );
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      edtavJson_messages_Internalname = "vJSON_MESSAGES" ;
      edtavJson_messages2_Internalname = "vJSON_MESSAGES2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavJson_messages2_Enabled = 1 ;
      edtavJson_messages_Enabled = 1 ;
      cmbavOpcion.setJsonclick( "" );
      cmbavOpcion.setEnabled( 1 );
      edtavAlbprocodto_Jsonclick = "" ;
      edtavAlbprocodto_Enabled = 1 ;
      edtavAlbprocodfrom_Jsonclick = "" ;
      edtavAlbprocodfrom_Enabled = 1 ;
      edtavAlbprofecto_Jsonclick = "" ;
      edtavAlbprofecto_Enabled = 1 ;
      edtavAlbprofecfrom_Jsonclick = "" ;
      edtavAlbprofecfrom_Enabled = 1 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Desea Re-Calcular los Precios?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Mensaje, Opcion=S", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Combo_clicodto_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Re Calculo de Precios", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavOpcion.setName( "vOPCION" );
      cmbavOpcion.setWebtags( "" );
      cmbavOpcion.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavOpcion.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV14Opcion = cmbavOpcion.getValidValue(AV14Opcion) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Opcion", AV14Opcion);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e142292',iparms:[]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e122292',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'cmbavOpcion'},{av:'AV14Opcion',fld:'vOPCION',pic:''},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9AlbProFecfrom',fld:'vALBPROFECFROM',pic:''},{av:'AV10AlbProFecto',fld:'vALBPROFECTO',pic:''},{av:'AV7AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV8AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'AV5CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV20json_messages',fld:'vJSON_MESSAGES',pic:''},{av:'AV21json_messages2',fld:'vJSON_MESSAGES2',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e112291',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
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
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV22EmprCod = "" ;
      GXKey = "" ;
      AV11CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV13CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A396EmprCod = "" ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV9AlbProFecfrom = GXutil.nullDate() ;
      AV10AlbProFecto = GXutil.nullDate() ;
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      AV14Opcion = "" ;
      lblTextblock1_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV20json_messages = "" ;
      AV21json_messages2 = "" ;
      AV26Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      H02292_A396EmprCod = new String[] {""} ;
      AV16Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV18UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV19messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXt_objcol_SdtMessages_Message5 = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message6 = new GXBaseCollection[1] ;
      AV23WebSession = httpContext.getWebSession();
      H02293_A10045CliAct = new String[] {""} ;
      H02293_A396EmprCod = new String[] {""} ;
      H02293_A279CliNom = new String[] {""} ;
      H02293_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      A279CliNom = "" ;
      A13735CliCNom = "" ;
      AV12Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02294_A10045CliAct = new String[] {""} ;
      H02294_A396EmprCod = new String[] {""} ;
      H02294_A279CliNom = new String[] {""} ;
      H02294_A252CliCod = new int[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.recalculodeprecios__default(),
         new Object[] {
             new Object[] {
            H02292_A396EmprCod
            }
            , new Object[] {
            H02293_A10045CliAct, H02293_A396EmprCod, H02293_A279CliNom, H02293_A252CliCod
            }
            , new Object[] {
            H02294_A10045CliAct, H02294_A396EmprCod, H02294_A279CliNom, H02294_A252CliCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV26Pgmname = "Facturacion.ReCalculodePrecios" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV26Pgmname = "Facturacion.ReCalculodePrecios" ;
      Gx_err = (short)(0) ;
      edtavJson_messages_Enabled = 0 ;
      edtavJson_messages2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavAlbprofecfrom_Enabled ;
   private int edtavAlbprofecto_Enabled ;
   private int edtavAlbprocodfrom_Enabled ;
   private int edtavAlbprocodto_Enabled ;
   private int edtavJson_messages_Enabled ;
   private int edtavJson_messages2_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV5CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV6CliCodto ;
   private int edtavClicodto_Visible ;
   private int A252CliCod ;
   private int idxLst ;
   private long AV7AlbProCodfrom ;
   private long AV8AlbProCodto ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV22EmprCod ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
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
   private String edtavAlbprofecfrom_Internalname ;
   private String TempTags ;
   private String edtavAlbprofecfrom_Jsonclick ;
   private String edtavAlbprofecto_Internalname ;
   private String edtavAlbprofecto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavAlbprocodfrom_Internalname ;
   private String edtavAlbprocodfrom_Jsonclick ;
   private String edtavAlbprocodto_Internalname ;
   private String edtavAlbprocodto_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
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
   private String divUnnamedtable6_Internalname ;
   private String AV14Opcion ;
   private String divUnnamedtable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavJson_messages_Internalname ;
   private String edtavJson_messages2_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV26Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17EmprNom ;
   private String GXv_char3[] ;
   private String AV18UsurCod ;
   private String GXv_char4[] ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private java.util.Date AV9AlbProFecfrom ;
   private java.util.Date AV10AlbProFecto ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_clicodfrom_Emptyitem ;
   private boolean Combo_clicodto_Emptyitem ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private String AV20json_messages ;
   private String AV21json_messages2 ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private HTMLChoice cmbavOpcion ;
   private IDataStoreProvider pr_default ;
   private String[] H02292_A396EmprCod ;
   private String[] H02293_A10045CliAct ;
   private String[] H02293_A396EmprCod ;
   private String[] H02293_A279CliNom ;
   private int[] H02293_A252CliCod ;
   private String[] H02294_A10045CliAct ;
   private String[] H02294_A396EmprCod ;
   private String[] H02294_A279CliNom ;
   private int[] H02294_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV11CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13CliCodto_Data ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV19messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXt_objcol_SdtMessages_Message5 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV12Combo_DataItem ;
}

final  class recalculodeprecios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02292", "SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02293", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02294", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

