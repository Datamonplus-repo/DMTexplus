package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informe_de_mermas_wp_impl extends GXDataArea
{
   public informe_de_mermas_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informe_de_mermas_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informe_de_mermas_wp_impl.class ));
   }

   public informe_de_mermas_wp_impl( int remoteHandle ,
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
      pa29M2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29M2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informe_de_mermas_wp", new String[] {}, new String[] {}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPART_DATA", AV23BarTipArt_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPART_DATA", AV23BarTipArt_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPART_TO_DATA", AV24BarTipArt_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPART_TO_DATA", AV24BarTipArt_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV43CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV43CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV44CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV44CliCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Cls", GXutil.rtrim( Combo_bartipart_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Selectedvalue_set", GXutil.rtrim( Combo_bartipart_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Emptyitemtext", GXutil.rtrim( Combo_bartipart_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_TO_Cls", GXutil.rtrim( Combo_bartipart_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_TO_Selectedvalue_set", GXutil.rtrim( Combo_bartipart_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_TO_Emptyitemtext", GXutil.rtrim( Combo_bartipart_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_TO_Selectedvalue_get", GXutil.rtrim( Combo_bartipart_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Selectedvalue_get", GXutil.rtrim( Combo_bartipart_Selectedvalue_get));
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
         we29M2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29M2( ) ;
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
      return formatLink("app.informe_de_mermas_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Informe_de_Mermas_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe de Mermas", "") ;
   }

   public void wb29M0( )
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
         app.GxWebStd.gx_div_start( httpContext, divFiltro_tipoarticulo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbartipart_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipart_Internalname, httpContext.getMessage( "Tipo Artículo inicial", ""), "", "", lblTextblockcombo_bartipart_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipart.setProperty("Caption", Combo_bartipart_Caption);
         ucCombo_bartipart.setProperty("Cls", Combo_bartipart_Cls);
         ucCombo_bartipart.setProperty("EmptyItemText", Combo_bartipart_Emptyitemtext);
         ucCombo_bartipart.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucCombo_bartipart.setProperty("DropDownOptionsData", AV23BarTipArt_Data);
         ucCombo_bartipart.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_bartipart_Internalname, "COMBO_BARTIPARTContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbartipart_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipart_to_Internalname, httpContext.getMessage( "Tipo Artículo Final", ""), "", "", lblTextblockcombo_bartipart_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipart_to.setProperty("Caption", Combo_bartipart_to_Caption);
         ucCombo_bartipart_to.setProperty("Cls", Combo_bartipart_to_Cls);
         ucCombo_bartipart_to.setProperty("EmptyItemText", Combo_bartipart_to_Emptyitemtext);
         ucCombo_bartipart_to.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucCombo_bartipart_to.setProperty("DropDownOptionsData", AV24BarTipArt_to_Data);
         ucCombo_bartipart_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_bartipart_to_Internalname, "COMBO_BARTIPART_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltro_codigocliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV43CliCodfrom_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV44CliCodto_Data);
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
         app.GxWebStd.gx_div_start( httpContext, divFiltro_articulo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Artículo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV13BarSer), GXutil.rtrim( localUtil.format( AV13BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_to_Internalname, httpContext.getMessage( "Artículo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_to_Internalname, GXutil.rtrim( AV14BarSer_to), GXutil.rtrim( localUtil.format( AV14BarSer_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltro_color_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV9BarColNom), GXutil.rtrim( localUtil.format( AV9BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Número Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_to_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_to_Internalname, GXutil.rtrim( AV11BarColNom_to), GXutil.rtrim( localUtil.format( AV11BarColNom_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_to_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_to_Internalname, httpContext.getMessage( "Número Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarColNum_to), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarColNum_to), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltro_pedidocliente_Internalname, divFiltro_pedidocliente_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBardisnum_cell_Internalname, 1, 0, "px", 0, "px", divBardisnum_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBardisnum_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnum_Internalname, httpContext.getMessage( "Pedido Cliente Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnum_Internalname, GXutil.rtrim( AV35BarDisNum), GXutil.rtrim( localUtil.format( AV35BarDisNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnum_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBardisnum_Visible, edtavBardisnum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBarenccli_cell_Internalname, 1, 0, "px", 0, "px", divBarenccli_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarenccli_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarenccli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarenccli_Internalname, httpContext.getMessage( "Pedido Cliente Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarenccli_Internalname, GXutil.rtrim( AV7BarEncCli), GXutil.rtrim( localUtil.format( AV7BarEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarenccli_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarenccli_Visible, edtavBarenccli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBarenccli_to_cell_Internalname, 1, 0, "px", 0, "px", divBarenccli_to_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarenccli_to_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarenccli_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarenccli_to_Internalname, httpContext.getMessage( "Pedido Cliente Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarenccli_to_Internalname, GXutil.rtrim( AV8BarEncCli_to), GXutil.rtrim( localUtil.format( AV8BarEncCli_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarenccli_to_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarenccli_to_Visible, edtavBarenccli_to_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBardisnum_to_cell_Internalname, 1, 0, "px", 0, "px", divBardisnum_to_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBardisnum_to_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnum_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnum_to_Internalname, httpContext.getMessage( "Pedido Cliente Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnum_to_Internalname, GXutil.rtrim( AV36BarDisNum_to), GXutil.rtrim( localUtil.format( AV36BarDisNum_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBardisnum_to_Visible, edtavBardisnum_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltro_fechasalida_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsal_Internalname, httpContext.getMessage( "Fecha Salida Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsal_Internalname, localUtil.format(AV5BarFecSal, "99/99/99"), localUtil.format( AV5BarFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Informe_de_Mermas_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsal_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsal_to_Internalname, httpContext.getMessage( "Fecha Salida Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsal_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsal_to_Internalname, localUtil.format(AV6BarFecSal_to, "99/99/99"), localUtil.format( AV6BarFecSal_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsal_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsal_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsal_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsal_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Informe_de_Mermas_WP.htm");
         httpContext.writeTextNL( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", httpContext.getMessage( "PDF", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportar_Internalname, "", httpContext.getMessage( "Exportar", ""), bttBtnexportar_Jsonclick, 5, httpContext.getMessage( "Exportar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Informe_de_Mermas_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV49Pgmname), GXutil.rtrim( localUtil.format( AV49Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Informe_de_Mermas_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipart_Internalname, GXutil.ltrim( localUtil.ntoc( AV17BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17BarTipArt), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipart_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipart_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipart_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV18BarTipArt_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18BarTipArt_to), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipart_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipart_to_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV41CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV42CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Informe_de_Mermas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start29M2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe de Mermas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29M0( ) ;
   }

   public void ws29M2( )
   {
      start29M2( ) ;
      evt29M2( ) ;
   }

   public void evt29M2( )
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
                           e1129M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPDF' */
                           e1229M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportar' */
                           e1329M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1429M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1529M2 ();
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we29M2( )
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

   public void pa29M2( )
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
            GX_FocusControl = edtavBarser_Internalname ;
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
      rf29M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV49Pgmname = "Informe_de_Mermas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29M2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1529M2 ();
         wb29M0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29M2( )
   {
   }

   public void before_start_formulas( )
   {
      AV49Pgmname = "Informe_de_Mermas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29M0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1129M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV20DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPART_DATA"), AV23BarTipArt_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPART_TO_DATA"), AV24BarTipArt_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV43CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV44CliCodto_Data);
         /* Read saved values. */
         Combo_bartipart_Cls = httpContext.cgiGet( "COMBO_BARTIPART_Cls") ;
         Combo_bartipart_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPART_Selectedvalue_set") ;
         Combo_bartipart_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPART_Emptyitemtext") ;
         Combo_bartipart_to_Cls = httpContext.cgiGet( "COMBO_BARTIPART_TO_Cls") ;
         Combo_bartipart_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPART_TO_Selectedvalue_set") ;
         Combo_bartipart_to_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPART_TO_Emptyitemtext") ;
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
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
         /* Read variables values. */
         AV13BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarSer", AV13BarSer);
         AV14BarSer_to = httpContext.cgiGet( edtavBarser_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarSer_to", AV14BarSer_to);
         AV9BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarColNom", AV9BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
         }
         else
         {
            AV10BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
         }
         AV11BarColNom_to = httpContext.cgiGet( edtavBarcolnom_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNom_to", AV11BarColNom_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM_TO");
            GX_FocusControl = edtavBarcolnum_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12BarColNum_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNum_to), 6, 0));
         }
         else
         {
            AV12BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNum_to), 6, 0));
         }
         AV35BarDisNum = httpContext.cgiGet( edtavBardisnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35BarDisNum", AV35BarDisNum);
         AV7BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarEncCli", AV7BarEncCli);
         AV8BarEncCli_to = httpContext.cgiGet( edtavBarenccli_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarEncCli_to", AV8BarEncCli_to);
         AV36BarDisNum_to = httpContext.cgiGet( edtavBardisnum_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarDisNum_to", AV36BarDisNum_to);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSAL");
            GX_FocusControl = edtavBarfecsal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BarFecSal = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarFecSal", localUtil.format(AV5BarFecSal, "99/99/99"));
         }
         else
         {
            AV5BarFecSal = localUtil.ctod( httpContext.cgiGet( edtavBarfecsal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarFecSal", localUtil.format(AV5BarFecSal, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsal_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSAL_TO");
            GX_FocusControl = edtavBarfecsal_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BarFecSal_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarFecSal_to", localUtil.format(AV6BarFecSal_to, "99/99/99"));
         }
         else
         {
            AV6BarFecSal_to = localUtil.ctod( httpContext.cgiGet( edtavBarfecsal_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarFecSal_to", localUtil.format(AV6BarFecSal_to, "99/99/99"));
         }
         AV49Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPART");
            GX_FocusControl = edtavBartipart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17BarTipArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarTipArt), 4, 0));
         }
         else
         {
            AV17BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarTipArt), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPART_TO");
            GX_FocusControl = edtavBartipart_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18BarTipArt_to = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipArt_to), 4, 0));
         }
         else
         {
            AV18BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipart_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipArt_to), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41CliCodfrom), 6, 0));
         }
         else
         {
            AV41CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCodto), 6, 0));
         }
         else
         {
            AV42CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCodto), 6, 0));
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
      e1129M2 ();
      if (returnInSub) return;
   }

   public void e1129M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informe_de_mermas_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      GXv_char2[0] = AV26EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      informe_de_mermas_wp_impl.this.AV26EmprCod = GXv_char2[0] ;
      informe_de_mermas_wp_impl.this.AV27EmprNom = GXv_char3[0] ;
      informe_de_mermas_wp_impl.this.AV28UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV20DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV20DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavBartipart_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipart_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipart_to_Visible), 5, 0), true);
      edtavBartipart_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipart_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOBARTIPART' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOBARTIPART_TO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S152 ();
      if (returnInSub) return;
      GXt_int7 = (byte)(AV39Enc20c) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV26EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int8) ;
      informe_de_mermas_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV39Enc20c = GXt_int7 ;
      AV6BarFecSal_to = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarFecSal_to", localUtil.format(AV6BarFecSal_to, "99/99/99"));
      AV5BarFecSal = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarFecSal", localUtil.format(AV5BarFecSal, "99/99/99"));
   }

   public void e1229M2( )
   {
      /* 'DoPDF' Routine */
      returnInSub = false ;
      AV29Enccli3 = ((GXutil.strcmp("", AV8BarEncCli_to)==0) ? httpContext.getMessage( "ZZZZZZZZZZZZZZZZZZZZ", "") : AV8BarEncCli_to) ;
      AV30UTipArt2 = (short)(((0==AV18BarTipArt_to) ? 9999 : AV18BarTipArt_to)) ;
      AV31UCliCod2 = ((0==AV42CliCodto) ? 999999 : AV42CliCodto) ;
      AV32USerCod2 = ((GXutil.strcmp("", AV14BarSer_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV14BarSer_to) ;
      AV33UColor2 = ((GXutil.strcmp("", AV11BarColNom_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV11BarColNom_to) ;
      AV34UColNum2 = ((0==AV12BarColNum_to) ? 999999 : AV12BarColNum_to) ;
      AV38UDisCli2 = ((GXutil.strcmp("", AV35BarDisNum)==0) ? httpContext.getMessage( "zzzzzzzz", "") : AV36BarDisNum_to) ;
      AV37UFecha2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6BarFecSal_to)) ? GXutil.today( ) : AV6BarFecSal_to) ;
      AV40ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV40ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV40ProgressIndicator.show();
      AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
      httpContext.popup(formatLink("app.ral0002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(AV17BarTipArt,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30UTipArt2,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31UCliCod2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarSer)),GXutil.URLEncode(GXutil.rtrim(AV32USerCod2)),GXutil.URLEncode(GXutil.rtrim(AV9BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV33UColor2)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34UColNum2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarDisNum)),GXutil.URLEncode(GXutil.rtrim(AV38UDisCli2)),GXutil.URLEncode(GXutil.formatDateParm(AV5BarFecSal)),GXutil.URLEncode(GXutil.formatDateParm(AV37UFecha2)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(AV7BarEncCli)),GXutil.URLEncode(GXutil.rtrim(AV29Enccli3)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" "))}, new String[] {"EmprCod","ImpCod","PTipArt","UTipArt","PCliCod","UCliCod","PSerCod","USerCod","PColor","UColor","PColNum","UColNum","PDisCli","UDisCli","PFecha","UFecha","SOloTotal","BarItem1","BarItem3","Enccli1","Enccli2","Barmdlcod","BarItem5"}) , new Object[] {});
      AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV40ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ProgressIndicator", AV40ProgressIndicator);
   }

   public void e1329M2( )
   {
      /* 'DoExportar' Routine */
      returnInSub = false ;
      AV29Enccli3 = ((GXutil.strcmp("", AV8BarEncCli_to)==0) ? httpContext.getMessage( "ZZZZZZZZZZZZZZZZZZZZ", "") : AV8BarEncCli_to) ;
      AV30UTipArt2 = (short)(((0==AV18BarTipArt_to) ? 9999 : AV18BarTipArt_to)) ;
      AV31UCliCod2 = ((0==AV42CliCodto) ? 999999 : AV42CliCodto) ;
      AV32USerCod2 = ((GXutil.strcmp("", AV14BarSer_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV14BarSer_to) ;
      AV33UColor2 = ((GXutil.strcmp("", AV11BarColNom_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV11BarColNom_to) ;
      AV34UColNum2 = ((0==AV12BarColNum_to) ? 999999 : AV12BarColNum_to) ;
      AV38UDisCli2 = ((GXutil.strcmp("", AV35BarDisNum)==0) ? httpContext.getMessage( "zzzzzzzz", "") : AV36BarDisNum_to) ;
      AV37UFecha2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6BarFecSal_to)) ? GXutil.today( ) : AV6BarFecSal_to) ;
      AV40ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV40ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV40ProgressIndicator.show();
      AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
      GXv_char4[0] = AV26EmprCod ;
      GXv_char3[0] = "" ;
      GXv_int9[0] = AV17BarTipArt ;
      GXv_int10[0] = AV30UTipArt2 ;
      GXv_int11[0] = AV41CliCodfrom ;
      GXv_int12[0] = AV31UCliCod2 ;
      GXv_char2[0] = AV13BarSer ;
      GXv_char13[0] = AV32USerCod2 ;
      GXv_char14[0] = AV9BarColNom ;
      GXv_char15[0] = AV33UColor2 ;
      GXv_int16[0] = AV10BarColNum ;
      GXv_int17[0] = AV34UColNum2 ;
      GXv_char18[0] = AV35BarDisNum ;
      GXv_char19[0] = AV38UDisCli2 ;
      GXv_date20[0] = AV5BarFecSal ;
      GXv_date21[0] = AV37UFecha2 ;
      GXv_char22[0] = " " ;
      GXv_char23[0] = " " ;
      GXv_char24[0] = " " ;
      GXv_int25[0] = (short)(0) ;
      GXv_char26[0] = AV7BarEncCli ;
      GXv_char27[0] = AV29Enccli3 ;
      GXv_char28[0] = " " ;
      GXv_char29[0] = AV45ExcelFilename ;
      GXv_char30[0] = AV46ErrorMessage ;
      new app.informe_de_mermas_export(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9, GXv_int10, GXv_int11, GXv_int12, GXv_char2, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_int17, GXv_char18, GXv_char19, GXv_date20, GXv_date21, GXv_char22, GXv_char23, GXv_char24, GXv_int25, GXv_char26, GXv_char27, GXv_char28, GXv_char29, GXv_char30) ;
      informe_de_mermas_wp_impl.this.AV26EmprCod = GXv_char4[0] ;
      informe_de_mermas_wp_impl.this.AV17BarTipArt = GXv_int9[0] ;
      informe_de_mermas_wp_impl.this.AV30UTipArt2 = GXv_int10[0] ;
      informe_de_mermas_wp_impl.this.AV41CliCodfrom = GXv_int11[0] ;
      informe_de_mermas_wp_impl.this.AV31UCliCod2 = GXv_int12[0] ;
      informe_de_mermas_wp_impl.this.AV13BarSer = GXv_char2[0] ;
      informe_de_mermas_wp_impl.this.AV32USerCod2 = GXv_char13[0] ;
      informe_de_mermas_wp_impl.this.AV9BarColNom = GXv_char14[0] ;
      informe_de_mermas_wp_impl.this.AV33UColor2 = GXv_char15[0] ;
      informe_de_mermas_wp_impl.this.AV10BarColNum = GXv_int16[0] ;
      informe_de_mermas_wp_impl.this.AV34UColNum2 = GXv_int17[0] ;
      informe_de_mermas_wp_impl.this.AV35BarDisNum = GXv_char18[0] ;
      informe_de_mermas_wp_impl.this.AV38UDisCli2 = GXv_char19[0] ;
      informe_de_mermas_wp_impl.this.AV5BarFecSal = GXv_date20[0] ;
      informe_de_mermas_wp_impl.this.AV37UFecha2 = GXv_date21[0] ;
      informe_de_mermas_wp_impl.this.AV7BarEncCli = GXv_char26[0] ;
      informe_de_mermas_wp_impl.this.AV29Enccli3 = GXv_char27[0] ;
      informe_de_mermas_wp_impl.this.AV45ExcelFilename = GXv_char29[0] ;
      informe_de_mermas_wp_impl.this.AV46ErrorMessage = GXv_char30[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarTipArt), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV41CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41CliCodfrom), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarSer", AV13BarSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarColNom", AV9BarColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV35BarDisNum", AV35BarDisNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarFecSal", localUtil.format(AV5BarFecSal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarEncCli", AV7BarEncCli);
      if ( GXutil.strcmp(AV45ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV45ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV46ErrorMessage);
      }
      AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV40ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ProgressIndicator", AV40ProgressIndicator);
   }

   public void e1429M2( )
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

   public void S152( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV26EmprCod, httpContext.getMessage( "20ENCO", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavBardisnum_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBardisnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBardisnum_Visible), 5, 0), true);
         divBardisnum_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divBardisnum_cell_Internalname, "Class", divBardisnum_cell_Class, true);
      }
      else
      {
         edtavBardisnum_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBardisnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBardisnum_Visible), 5, 0), true);
         divBardisnum_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop("", false, divBardisnum_cell_Internalname, "Class", divBardisnum_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV26EmprCod, httpContext.getMessage( "20ENCO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavBarenccli_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), true);
         divBarenccli_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divBarenccli_cell_Internalname, "Class", divBarenccli_cell_Class, true);
      }
      else
      {
         edtavBarenccli_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), true);
         divBarenccli_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop("", false, divBarenccli_cell_Internalname, "Class", divBarenccli_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV26EmprCod, httpContext.getMessage( "20ENCO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavBarenccli_to_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_to_Visible), 5, 0), true);
         divBarenccli_to_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divBarenccli_to_cell_Internalname, "Class", divBarenccli_to_cell_Class, true);
      }
      else
      {
         edtavBarenccli_to_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_to_Visible), 5, 0), true);
         divBarenccli_to_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop("", false, divBarenccli_to_cell_Internalname, "Class", divBarenccli_to_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV26EmprCod, httpContext.getMessage( "20ENCO", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavBardisnum_to_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBardisnum_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBardisnum_to_Visible), 5, 0), true);
         divBardisnum_to_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divBardisnum_to_cell_Internalname, "Class", divBardisnum_to_cell_Class, true);
      }
      else
      {
         edtavBardisnum_to_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBardisnum_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBardisnum_to_Visible), 5, 0), true);
         divBardisnum_to_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop("", false, divBardisnum_to_cell_Internalname, "Class", divBardisnum_to_cell_Class, true);
      }
      if ( ( edtavBardisnum_Visible == ( 0 )) && ( edtavBarenccli_Visible == ( 0 )) && ( edtavBarenccli_to_Visible == ( 0 )) && ( edtavBardisnum_to_Visible == ( 0 )) )
      {
         divFiltro_pedidocliente_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divFiltro_pedidocliente_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divFiltro_pedidocliente_Visible), 5, 0), true);
      }
   }

   public void S142( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H029M2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = H029M2_A10045CliAct[0] ;
         A13735CliCNom = H029M2_A13735CliCNom[0] ;
         A252CliCod = H029M2_A252CliCod[0] ;
         A279CliNom = H029M2_A279CliNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV44CliCodto_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_clicodto_Selectedvalue_set = ((0==AV42CliCodto) ? "" : GXutil.trim( GXutil.str( AV42CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H029M3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H029M3_A10045CliAct[0] ;
         A13735CliCNom = H029M3_A13735CliCNom[0] ;
         A252CliCod = H029M3_A252CliCod[0] ;
         A279CliNom = H029M3_A279CliNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV43CliCodfrom_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV41CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV41CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOBARTIPART_TO' Routine */
      returnInSub = false ;
      AV24BarTipArt_to_Data.clear();
      /* Using cursor H029M4 */
      pr_default.execute(2, new Object[] {AV26EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14361TipArtAct = H029M4_A14361TipArtAct[0] ;
         A396EmprCod = H029M4_A396EmprCod[0] ;
         A829TipArtCod = H029M4_A829TipArtCod[0] ;
         A830TipArtDsc = H029M4_A830TipArtDsc[0] ;
         n830TipArtDsc = H029M4_n830TipArtDsc[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)), A830TipArtDsc, "", "", "", "", "", "", "") );
         AV24BarTipArt_to_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV24BarTipArt_to_Data.sort("Title");
      Combo_bartipart_to_Selectedvalue_set = ((0==AV18BarTipArt_to) ? "" : GXutil.trim( GXutil.str( AV18BarTipArt_to, 4, 0))) ;
      ucCombo_bartipart_to.sendProperty(context, "", false, Combo_bartipart_to_Internalname, "SelectedValue_set", Combo_bartipart_to_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOBARTIPART' Routine */
      returnInSub = false ;
      AV23BarTipArt_Data.clear();
      /* Using cursor H029M5 */
      pr_default.execute(3, new Object[] {AV26EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14361TipArtAct = H029M5_A14361TipArtAct[0] ;
         A396EmprCod = H029M5_A396EmprCod[0] ;
         A829TipArtCod = H029M5_A829TipArtCod[0] ;
         A830TipArtDsc = H029M5_A830TipArtDsc[0] ;
         n830TipArtDsc = H029M5_n830TipArtDsc[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)), A830TipArtDsc, "", "", "", "", "", "", "") );
         AV23BarTipArt_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV23BarTipArt_Data.sort("Title");
      Combo_bartipart_Selectedvalue_set = ((0==AV17BarTipArt) ? "" : GXutil.trim( GXutil.str( AV17BarTipArt, 4, 0))) ;
      ucCombo_bartipart.sendProperty(context, "", false, Combo_bartipart_Internalname, "SelectedValue_set", Combo_bartipart_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e1529M2( )
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
      pa29M2( ) ;
      ws29M2( ) ;
      we29M2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714314311", true, true);
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
      httpContext.AddJavascriptSource("informe_de_mermas_wp.js", "?202681714314311", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_bartipart_Internalname = "TEXTBLOCKCOMBO_BARTIPART" ;
      Combo_bartipart_Internalname = "COMBO_BARTIPART" ;
      divTablesplittedbartipart_Internalname = "TABLESPLITTEDBARTIPART" ;
      lblTextblockcombo_bartipart_to_Internalname = "TEXTBLOCKCOMBO_BARTIPART_TO" ;
      Combo_bartipart_to_Internalname = "COMBO_BARTIPART_TO" ;
      divTablesplittedbartipart_to_Internalname = "TABLESPLITTEDBARTIPART_TO" ;
      divFiltro_tipoarticulo_Internalname = "FILTRO_TIPOARTICULO" ;
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      divFiltro_codigocliente_Internalname = "FILTRO_CODIGOCLIENTE" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarser_to_Internalname = "vBARSER_TO" ;
      divFiltro_articulo_Internalname = "FILTRO_ARTICULO" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBarcolnom_to_Internalname = "vBARCOLNOM_TO" ;
      edtavBarcolnum_to_Internalname = "vBARCOLNUM_TO" ;
      divFiltro_color_Internalname = "FILTRO_COLOR" ;
      edtavBardisnum_Internalname = "vBARDISNUM" ;
      divBardisnum_cell_Internalname = "BARDISNUM_CELL" ;
      edtavBarenccli_Internalname = "vBARENCCLI" ;
      divBarenccli_cell_Internalname = "BARENCCLI_CELL" ;
      edtavBarenccli_to_Internalname = "vBARENCCLI_TO" ;
      divBarenccli_to_cell_Internalname = "BARENCCLI_TO_CELL" ;
      edtavBardisnum_to_Internalname = "vBARDISNUM_TO" ;
      divBardisnum_to_cell_Internalname = "BARDISNUM_TO_CELL" ;
      divFiltro_pedidocliente_Internalname = "FILTRO_PEDIDOCLIENTE" ;
      edtavBarfecsal_Internalname = "vBARFECSAL" ;
      edtavBarfecsal_to_Internalname = "vBARFECSAL_TO" ;
      divFiltro_fechasalida_Internalname = "FILTRO_FECHASALIDA" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtnexportar_Internalname = "BTNEXPORTAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavBartipart_Internalname = "vBARTIPART" ;
      edtavBartipart_to_Internalname = "vBARTIPART_TO" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
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
      edtavBartipart_to_Jsonclick = "" ;
      edtavBartipart_to_Visible = 1 ;
      edtavBartipart_Jsonclick = "" ;
      edtavBartipart_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarfecsal_to_Jsonclick = "" ;
      edtavBarfecsal_to_Enabled = 1 ;
      edtavBarfecsal_Jsonclick = "" ;
      edtavBarfecsal_Enabled = 1 ;
      edtavBardisnum_to_Jsonclick = "" ;
      edtavBardisnum_to_Enabled = 1 ;
      edtavBardisnum_to_Visible = 1 ;
      divBardisnum_to_cell_Class = "col-xs-12 col-sm-6" ;
      edtavBarenccli_to_Jsonclick = "" ;
      edtavBarenccli_to_Enabled = 1 ;
      edtavBarenccli_to_Visible = 1 ;
      divBarenccli_to_cell_Class = "col-xs-12 col-sm-6" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      edtavBarenccli_Visible = 1 ;
      divBarenccli_cell_Class = "col-xs-12 col-sm-6" ;
      edtavBardisnum_Jsonclick = "" ;
      edtavBardisnum_Enabled = 1 ;
      edtavBardisnum_Visible = 1 ;
      divBardisnum_cell_Class = "col-xs-12 col-sm-6" ;
      divFiltro_pedidocliente_Visible = 1 ;
      edtavBarcolnum_to_Jsonclick = "" ;
      edtavBarcolnum_to_Enabled = 1 ;
      edtavBarcolnom_to_Jsonclick = "" ;
      edtavBarcolnom_to_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarser_to_Jsonclick = "" ;
      edtavBarser_to_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      Combo_bartipart_to_Caption = "" ;
      Combo_bartipart_Caption = "" ;
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
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Combo_bartipart_to_Emptyitemtext = "Todos" ;
      Combo_bartipart_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_bartipart_Emptyitemtext = "Todos" ;
      Combo_bartipart_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe de Mermas", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOPDF'","{handler:'e1229M2',iparms:[{av:'AV8BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV18BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV42CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV14BarSer_to',fld:'vBARSER_TO',pic:''},{av:'AV11BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV12BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV36BarDisNum_to',fld:'vBARDISNUM_TO',pic:''},{av:'AV6BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV41CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV13BarSer',fld:'vBARSER',pic:''},{av:'AV9BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV5BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV7BarEncCli',fld:'vBARENCCLI',pic:''}]");
      setEventMetadata("'DOPDF'",",oparms:[]}");
      setEventMetadata("'DOEXPORTAR'","{handler:'e1329M2',iparms:[{av:'AV8BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV18BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV42CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV14BarSer_to',fld:'vBARSER_TO',pic:''},{av:'AV11BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV12BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV36BarDisNum_to',fld:'vBARDISNUM_TO',pic:''},{av:'AV6BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV41CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV13BarSer',fld:'vBARSER',pic:''},{av:'AV9BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV5BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV7BarEncCli',fld:'vBARENCCLI',pic:''}]");
      setEventMetadata("'DOEXPORTAR'",",oparms:[{av:'AV7BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV5BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV35BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV9BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV13BarSer',fld:'vBARSER',pic:''},{av:'AV41CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV17BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1429M2',iparms:[]");
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
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      Combo_bartipart_to_Selectedvalue_get = "" ;
      Combo_bartipart_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV20DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV23BarTipArt_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV24BarTipArt_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV43CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV44CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV26EmprCod = "" ;
      Combo_bartipart_Selectedvalue_set = "" ;
      Combo_bartipart_to_Selectedvalue_set = "" ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_bartipart_Jsonclick = "" ;
      ucCombo_bartipart = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_bartipart_to_Jsonclick = "" ;
      ucCombo_bartipart_to = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      TempTags = "" ;
      AV13BarSer = "" ;
      AV14BarSer_to = "" ;
      AV9BarColNom = "" ;
      AV11BarColNom_to = "" ;
      AV35BarDisNum = "" ;
      AV7BarEncCli = "" ;
      AV8BarEncCli_to = "" ;
      AV36BarDisNum_to = "" ;
      AV5BarFecSal = GXutil.nullDate() ;
      AV6BarFecSal_to = GXutil.nullDate() ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtnexportar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      AV49Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25Station = "" ;
      GXt_char1 = "" ;
      AV27EmprNom = "" ;
      AV28UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV29Enccli3 = "" ;
      AV32USerCod2 = "" ;
      AV33UColor2 = "" ;
      AV38UDisCli2 = "" ;
      AV37UFecha2 = GXutil.nullDate() ;
      AV40ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int17 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_date20 = new java.util.Date[1] ;
      GXv_date21 = new java.util.Date[1] ;
      GXv_char22 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_int25 = new short[1] ;
      GXv_char26 = new String[1] ;
      GXv_char27 = new String[1] ;
      GXv_char28 = new String[1] ;
      AV45ExcelFilename = "" ;
      GXv_char29 = new String[1] ;
      AV46ErrorMessage = "" ;
      GXv_char30 = new String[1] ;
      scmdbuf = "" ;
      H029M2_A396EmprCod = new String[] {""} ;
      H029M2_A10045CliAct = new String[] {""} ;
      H029M2_A13735CliCNom = new String[] {""} ;
      H029M2_A252CliCod = new int[1] ;
      H029M2_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      AV21Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H029M3_A396EmprCod = new String[] {""} ;
      H029M3_A10045CliAct = new String[] {""} ;
      H029M3_A13735CliCNom = new String[] {""} ;
      H029M3_A252CliCod = new int[1] ;
      H029M3_A279CliNom = new String[] {""} ;
      H029M4_A14361TipArtAct = new String[] {""} ;
      H029M4_A396EmprCod = new String[] {""} ;
      H029M4_A829TipArtCod = new short[1] ;
      H029M4_A830TipArtDsc = new String[] {""} ;
      H029M4_n830TipArtDsc = new boolean[] {false} ;
      A14361TipArtAct = "" ;
      A396EmprCod = "" ;
      A830TipArtDsc = "" ;
      H029M5_A14361TipArtAct = new String[] {""} ;
      H029M5_A396EmprCod = new String[] {""} ;
      H029M5_A829TipArtCod = new short[1] ;
      H029M5_A830TipArtDsc = new String[] {""} ;
      H029M5_n830TipArtDsc = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informe_de_mermas_wp__default(),
         new Object[] {
             new Object[] {
            H029M2_A396EmprCod, H029M2_A10045CliAct, H029M2_A13735CliCNom, H029M2_A252CliCod, H029M2_A279CliNom
            }
            , new Object[] {
            H029M3_A396EmprCod, H029M3_A10045CliAct, H029M3_A13735CliCNom, H029M3_A252CliCod, H029M3_A279CliNom
            }
            , new Object[] {
            H029M4_A14361TipArtAct, H029M4_A396EmprCod, H029M4_A829TipArtCod, H029M4_A830TipArtDsc, H029M4_n830TipArtDsc
            }
            , new Object[] {
            H029M5_A14361TipArtAct, H029M5_A396EmprCod, H029M5_A829TipArtCod, H029M5_A830TipArtDsc, H029M5_n830TipArtDsc
            }
         }
      );
      AV49Pgmname = "Informe_de_Mermas_WP" ;
      /* GeneXus formulas. */
      AV49Pgmname = "Informe_de_Mermas_WP" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
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
   private short AV17BarTipArt ;
   private short AV18BarTipArt_to ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV39Enc20c ;
   private short AV30UTipArt2 ;
   private short GXv_int9[] ;
   private short GXv_int10[] ;
   private short GXv_int25[] ;
   private short A829TipArtCod ;
   private int edtavBarser_Enabled ;
   private int edtavBarser_to_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV10BarColNum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarcolnom_to_Enabled ;
   private int AV12BarColNum_to ;
   private int edtavBarcolnum_to_Enabled ;
   private int divFiltro_pedidocliente_Visible ;
   private int edtavBardisnum_Visible ;
   private int edtavBardisnum_Enabled ;
   private int edtavBarenccli_Visible ;
   private int edtavBarenccli_Enabled ;
   private int edtavBarenccli_to_Visible ;
   private int edtavBarenccli_to_Enabled ;
   private int edtavBardisnum_to_Visible ;
   private int edtavBardisnum_to_Enabled ;
   private int edtavBarfecsal_Enabled ;
   private int edtavBarfecsal_to_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavBartipart_Visible ;
   private int edtavBartipart_to_Visible ;
   private int AV41CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV42CliCodto ;
   private int edtavClicodto_Visible ;
   private int AV31UCliCod2 ;
   private int AV34UColNum2 ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int GXv_int16[] ;
   private int GXv_int17[] ;
   private int A252CliCod ;
   private int idxLst ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String Combo_bartipart_to_Selectedvalue_get ;
   private String Combo_bartipart_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV26EmprCod ;
   private String Combo_bartipart_Cls ;
   private String Combo_bartipart_Selectedvalue_set ;
   private String Combo_bartipart_Emptyitemtext ;
   private String Combo_bartipart_to_Cls ;
   private String Combo_bartipart_to_Selectedvalue_set ;
   private String Combo_bartipart_to_Emptyitemtext ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String divFiltro_tipoarticulo_Internalname ;
   private String divTablesplittedbartipart_Internalname ;
   private String lblTextblockcombo_bartipart_Internalname ;
   private String lblTextblockcombo_bartipart_Jsonclick ;
   private String Combo_bartipart_Caption ;
   private String Combo_bartipart_Internalname ;
   private String divTablesplittedbartipart_to_Internalname ;
   private String lblTextblockcombo_bartipart_to_Internalname ;
   private String lblTextblockcombo_bartipart_to_Jsonclick ;
   private String Combo_bartipart_to_Caption ;
   private String Combo_bartipart_to_Internalname ;
   private String divFiltro_codigocliente_Internalname ;
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
   private String divFiltro_articulo_Internalname ;
   private String edtavBarser_Internalname ;
   private String TempTags ;
   private String AV13BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarser_to_Internalname ;
   private String AV14BarSer_to ;
   private String edtavBarser_to_Jsonclick ;
   private String divFiltro_color_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String AV9BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBarcolnom_to_Internalname ;
   private String AV11BarColNom_to ;
   private String edtavBarcolnom_to_Jsonclick ;
   private String edtavBarcolnum_to_Internalname ;
   private String edtavBarcolnum_to_Jsonclick ;
   private String divFiltro_pedidocliente_Internalname ;
   private String divBardisnum_cell_Internalname ;
   private String divBardisnum_cell_Class ;
   private String edtavBardisnum_Internalname ;
   private String AV35BarDisNum ;
   private String edtavBardisnum_Jsonclick ;
   private String divBarenccli_cell_Internalname ;
   private String divBarenccli_cell_Class ;
   private String edtavBarenccli_Internalname ;
   private String AV7BarEncCli ;
   private String edtavBarenccli_Jsonclick ;
   private String divBarenccli_to_cell_Internalname ;
   private String divBarenccli_to_cell_Class ;
   private String edtavBarenccli_to_Internalname ;
   private String AV8BarEncCli_to ;
   private String edtavBarenccli_to_Jsonclick ;
   private String divBardisnum_to_cell_Internalname ;
   private String divBardisnum_to_cell_Class ;
   private String edtavBardisnum_to_Internalname ;
   private String AV36BarDisNum_to ;
   private String edtavBardisnum_to_Jsonclick ;
   private String divFiltro_fechasalida_Internalname ;
   private String edtavBarfecsal_Internalname ;
   private String edtavBarfecsal_Jsonclick ;
   private String edtavBarfecsal_to_Internalname ;
   private String edtavBarfecsal_to_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtnexportar_Internalname ;
   private String bttBtnexportar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV49Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavBartipart_Internalname ;
   private String edtavBartipart_Jsonclick ;
   private String edtavBartipart_to_Internalname ;
   private String edtavBartipart_to_Jsonclick ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV25Station ;
   private String GXt_char1 ;
   private String AV27EmprNom ;
   private String AV28UsurCod ;
   private String AV29Enccli3 ;
   private String AV32USerCod2 ;
   private String AV33UColor2 ;
   private String AV38UDisCli2 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char22[] ;
   private String GXv_char23[] ;
   private String GXv_char24[] ;
   private String GXv_char26[] ;
   private String GXv_char27[] ;
   private String GXv_char28[] ;
   private String GXv_char29[] ;
   private String GXv_char30[] ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A14361TipArtAct ;
   private String A396EmprCod ;
   private String A830TipArtDsc ;
   private java.util.Date AV5BarFecSal ;
   private java.util.Date AV6BarFecSal_to ;
   private java.util.Date AV37UFecha2 ;
   private java.util.Date GXv_date20[] ;
   private java.util.Date GXv_date21[] ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean n830TipArtDsc ;
   private String AV45ExcelFilename ;
   private String AV46ErrorMessage ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipart ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipart_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV40ProgressIndicator ;
   private IDataStoreProvider pr_default ;
   private String[] H029M2_A396EmprCod ;
   private String[] H029M2_A10045CliAct ;
   private String[] H029M2_A13735CliCNom ;
   private int[] H029M2_A252CliCod ;
   private String[] H029M2_A279CliNom ;
   private String[] H029M3_A396EmprCod ;
   private String[] H029M3_A10045CliAct ;
   private String[] H029M3_A13735CliCNom ;
   private int[] H029M3_A252CliCod ;
   private String[] H029M3_A279CliNom ;
   private String[] H029M4_A14361TipArtAct ;
   private String[] H029M4_A396EmprCod ;
   private short[] H029M4_A829TipArtCod ;
   private String[] H029M4_A830TipArtDsc ;
   private boolean[] H029M4_n830TipArtDsc ;
   private String[] H029M5_A14361TipArtAct ;
   private String[] H029M5_A396EmprCod ;
   private short[] H029M5_A829TipArtCod ;
   private String[] H029M5_A830TipArtDsc ;
   private boolean[] H029M5_n830TipArtDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV23BarTipArt_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24BarTipArt_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV43CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV44CliCodto_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV21Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV20DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class informe_de_mermas_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029M2", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029M3", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029M4", "SELECT TipArtAct, EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE (EmprCod = ?) AND (TipArtAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029M5", "SELECT TipArtAct, EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE (EmprCod = ?) AND (TipArtAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

