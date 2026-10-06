package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class produccionencurso_impl extends GXDataArea
{
   public produccionencurso_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public produccionencurso_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produccionencurso_impl.class ));
   }

   public produccionencurso_impl( int remoteHandle ,
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
      pa1YP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1YP2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccionencurso", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV17CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV17CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV18CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV18CliCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTCODFROM_DATA", AV14TipArtCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTCODFROM_DATA", AV14TipArtCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTCODTO_DATA", AV16TipArtCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTCODTO_DATA", AV16TipArtCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Cls", GXutil.rtrim( Combo_tipartcodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Selectedvalue_set", GXutil.rtrim( Combo_tipartcodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Emptyitemtext", GXutil.rtrim( Combo_tipartcodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Cls", GXutil.rtrim( Combo_tipartcodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Selectedvalue_set", GXutil.rtrim( Combo_tipartcodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Emptyitemtext", GXutil.rtrim( Combo_tipartcodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Selectedvalue_get", GXutil.rtrim( Combo_tipartcodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Selectedvalue_get", GXutil.rtrim( Combo_tipartcodfrom_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcrmod008_consulta == null ) )
      {
         WebComp_Wcrmod008_consulta.componentjscripts();
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
         we1YP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1YP2( ) ;
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
      return formatLink("app.produccionencurso", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProduccionenCurso" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Produccion en Curso", "") ;
   }

   public void wb1YP0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV17CliCodfrom_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV18CliCodto_Data);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecclifrom_Internalname, httpContext.getMessage( "Fech. Ped. Cli. Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecclifrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclifrom_Internalname, localUtil.format(AV10BarFecClifrom, "99/99/99"), localUtil.format( AV10BarFecClifrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclifrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclifrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclifrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionenCurso.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecclito_Internalname, httpContext.getMessage( "Fech. Ped. Cli. Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecclito_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclito_Internalname, localUtil.format(AV11BarFecClito, "99/99/99"), localUtil.format( AV11BarFecClito, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclito_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclito_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionenCurso.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitfrom_Internalname, httpContext.getMessage( "Sit. Ini.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8BarSitfrom), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV8BarSitfrom), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitfrom_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitto_Internalname, httpContext.getMessage( "Sit. Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitto_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarSitto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarSitto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartcodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipartcodfrom_Internalname, httpContext.getMessage( "Tip. Art. Ini.", ""), "", "", lblTextblockcombo_tipartcodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipartcodfrom.setProperty("Caption", Combo_tipartcodfrom_Caption);
         ucCombo_tipartcodfrom.setProperty("Cls", Combo_tipartcodfrom_Cls);
         ucCombo_tipartcodfrom.setProperty("EmptyItemText", Combo_tipartcodfrom_Emptyitemtext);
         ucCombo_tipartcodfrom.setProperty("DropDownOptionsData", AV14TipArtCodfrom_Data);
         ucCombo_tipartcodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartcodfrom_Internalname, "COMBO_TIPARTCODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartcodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipartcodto_Internalname, httpContext.getMessage( "Tip. Art. Fin.", ""), "", "", lblTextblockcombo_tipartcodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipartcodto.setProperty("Caption", Combo_tipartcodto_Caption);
         ucCombo_tipartcodto.setProperty("Cls", Combo_tipartcodto_Cls);
         ucCombo_tipartcodto.setProperty("EmptyItemText", Combo_tipartcodto_Emptyitemtext);
         ucCombo_tipartcodto.setProperty("DropDownOptionsData", AV16TipArtCodto_Data);
         ucCombo_tipartcodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartcodto_Internalname, "COMBO_TIPARTCODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserfrom_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserfrom_Internalname, GXutil.rtrim( AV36BarSerfrom), GXutil.rtrim( localUtil.format( AV36BarSerfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserfrom_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserto_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserto_Internalname, GXutil.rtrim( AV37BarSerto), GXutil.rtrim( localUtil.format( AV37BarSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ProduccionenCurso.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProduccionenCurso.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabladatajson_Internalname, divTabladatajson_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavData_json_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavData_json_Internalname, httpContext.getMessage( "Data_json", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavData_json_Internalname, AV38Data_json, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", (short)(0), 1, edtavData_json_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ProduccionenCurso.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Produccion en Curso", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionenCurso.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0134"+"", GXutil.rtrim( WebComp_Wcrmod008_consulta_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0134"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcrmod008_consulta_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcrmod008_consulta), GXutil.lower( WebComp_Wcrmod008_consulta_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0134"+"");
               }
               WebComp_Wcrmod008_consulta.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcrmod008_consulta), GXutil.lower( WebComp_Wcrmod008_consulta_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV41Pgmname), GXutil.rtrim( localUtil.format( AV41Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ProduccionenCurso.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV12CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV13CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV6TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6TipArtCodfrom), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipartcodfrom_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV7TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7TipArtCodto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipartcodto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionenCurso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1YP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Produccion en Curso", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1YP0( ) ;
   }

   public void ws1YP2( )
   {
      start1YP2( ) ;
      evt1YP2( ) ;
   }

   public void evt1YP2( )
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
                           e111YP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e121YP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e131YP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e141YP2 ();
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
                     if ( nCmpId == 134 )
                     {
                        OldWcrmod008_consulta = httpContext.cgiGet( "W0134") ;
                        if ( ( GXutil.len( OldWcrmod008_consulta) == 0 ) || ( GXutil.strcmp(OldWcrmod008_consulta, WebComp_Wcrmod008_consulta_Component) != 0 ) )
                        {
                           WebComp_Wcrmod008_consulta = WebUtils.getWebComponent(getClass(), "app." + OldWcrmod008_consulta + "_impl", remoteHandle, context);
                           WebComp_Wcrmod008_consulta_Component = OldWcrmod008_consulta ;
                        }
                        if ( GXutil.len( WebComp_Wcrmod008_consulta_Component) != 0 )
                        {
                           WebComp_Wcrmod008_consulta.componentprocess("W0134", "", sEvt);
                        }
                        WebComp_Wcrmod008_consulta_Component = OldWcrmod008_consulta ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1YP2( )
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

   public void pa1YP2( )
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
            GX_FocusControl = edtavBarfecclifrom_Internalname ;
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
      rf1YP2( ) ;
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
      AV41Pgmname = "ProduccionenCurso" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_err = (short)(0) ;
      edtavData_json_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavData_json_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavData_json_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1YP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcrmod008_consulta_Component) != 0 )
            {
               WebComp_Wcrmod008_consulta.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e141YP2 ();
         wb1YP0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1YP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV41Pgmname = "ProduccionenCurso" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_err = (short)(0) ;
      edtavData_json_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavData_json_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavData_json_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111YP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV17CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV18CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTCODFROM_DATA"), AV14TipArtCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTCODTO_DATA"), AV16TipArtCodto_Data);
         /* Read saved values. */
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
         Combo_tipartcodfrom_Cls = httpContext.cgiGet( "COMBO_TIPARTCODFROM_Cls") ;
         Combo_tipartcodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTCODFROM_Selectedvalue_set") ;
         Combo_tipartcodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTCODFROM_Emptyitemtext") ;
         Combo_tipartcodto_Cls = httpContext.cgiGet( "COMBO_TIPARTCODTO_Cls") ;
         Combo_tipartcodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTCODTO_Selectedvalue_set") ;
         Combo_tipartcodto_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTCODTO_Emptyitemtext") ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclifrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLIFROM");
            GX_FocusControl = edtavBarfecclifrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarFecClifrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarFecClifrom", localUtil.format(AV10BarFecClifrom, "99/99/99"));
         }
         else
         {
            AV10BarFecClifrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecclifrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarFecClifrom", localUtil.format(AV10BarFecClifrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclito_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLITO");
            GX_FocusControl = edtavBarfecclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11BarFecClito = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarFecClito", localUtil.format(AV11BarFecClito, "99/99/99"));
         }
         else
         {
            AV11BarFecClito = localUtil.ctod( httpContext.cgiGet( edtavBarfecclito_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarFecClito", localUtil.format(AV11BarFecClito, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITFROM");
            GX_FocusControl = edtavBarsitfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8BarSitfrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarSitfrom), 2, 0));
         }
         else
         {
            AV8BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarSitfrom), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITTO");
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarSitto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarSitto), 2, 0));
         }
         else
         {
            AV9BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarSitto), 2, 0));
         }
         AV36BarSerfrom = httpContext.cgiGet( edtavBarserfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarSerfrom", AV36BarSerfrom);
         AV37BarSerto = httpContext.cgiGet( edtavBarserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarSerto", AV37BarSerto);
         AV38Data_json = httpContext.cgiGet( edtavData_json_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Data_json", AV38Data_json);
         AV41Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodfrom), 6, 0));
         }
         else
         {
            AV12CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCodto), 6, 0));
         }
         else
         {
            AV13CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCodto), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCODFROM");
            GX_FocusControl = edtavTipartcodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6TipArtCodfrom = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6TipArtCodfrom), 4, 0));
         }
         else
         {
            AV6TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6TipArtCodfrom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCODTO");
            GX_FocusControl = edtavTipartcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7TipArtCodto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7TipArtCodto), 4, 0));
         }
         else
         {
            AV7TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7TipArtCodto), 4, 0));
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
      e111YP2 ();
      if (returnInSub) return;
   }

   public void e111YP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      produccionencurso_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = AV33EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      produccionencurso_impl.this.AV33EmprCod = GXv_char2[0] ;
      produccionencurso_impl.this.AV21EmprNom = GXv_char3[0] ;
      produccionencurso_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      AV8BarSitfrom = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarSitfrom), 2, 0));
      AV9BarSitto = (byte)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarSitto), 2, 0));
      AV10BarFecClifrom = GXutil.dadd(Gx_date,-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarFecClifrom", localUtil.format(AV10BarFecClifrom, "99/99/99"));
      AV11BarFecClito = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarFecClito", localUtil.format(AV11BarFecClito, "99/99/99"));
      GXt_char1 = AV20Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      produccionencurso_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20Station = GXt_char1 ;
      GXv_char4[0] = AV33EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char2[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char4, GXv_char3, GXv_char2) ;
      produccionencurso_impl.this.AV33EmprCod = GXv_char4[0] ;
      produccionencurso_impl.this.AV21EmprNom = GXv_char3[0] ;
      produccionencurso_impl.this.AV22UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      edtavTipartcodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartcodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartcodto_Visible), 5, 0), true);
      edtavTipartcodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartcodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartcodfrom_Visible), 5, 0), true);
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
      /* Execute user subroutine: 'LOADCOMBOTIPARTCODFROM' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPARTCODTO' */
      S142 ();
      if (returnInSub) return;
      divTabladatajson_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabladatajson_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabladatajson_Visible), 5, 0), true);
   }

   public void e121YP2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      GXt_char1 = AV38Data_json ;
      GXv_int5[0] = AV7TipArtCodto ;
      GXv_char4[0] = GXt_char1 ;
      new app.pedidosclientesindetalle.rmod008_carga_sdt(remoteHandle, context).execute( AV33EmprCod, AV12CliCodfrom, AV13CliCodto, AV10BarFecClifrom, AV11BarFecClito, AV8BarSitfrom, AV9BarSitto, AV6TipArtCodfrom, GXv_int5, AV36BarSerfrom, AV37BarSerto, GXv_char4) ;
      produccionencurso_impl.this.AV7TipArtCodto = GXv_int5[0] ;
      produccionencurso_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7TipArtCodto), 4, 0));
      AV38Data_json = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Data_json", AV38Data_json);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcrmod008_consulta = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcrmod008_consulta_Component), GXutil.lower( "PedidosClienteSinDetalle.RMOD008_Consulta")) != 0 )
      {
         WebComp_Wcrmod008_consulta = WebUtils.getWebComponent(getClass(), "app.pedidosclientesindetalle.rmod008_consulta_impl", remoteHandle, context);
         WebComp_Wcrmod008_consulta_Component = "PedidosClienteSinDetalle.RMOD008_Consulta" ;
      }
      if ( GXutil.len( WebComp_Wcrmod008_consulta_Component) != 0 )
      {
         WebComp_Wcrmod008_consulta.setjustcreated();
         WebComp_Wcrmod008_consulta.componentprepare(new Object[] {"W0134","",AV33EmprCod,AV38Data_json,Integer.valueOf(AV12CliCodfrom),Integer.valueOf(AV13CliCodto),AV10BarFecClifrom,AV11BarFecClito,Byte.valueOf(AV8BarSitfrom),Byte.valueOf(AV9BarSitto),Short.valueOf(AV6TipArtCodfrom),Short.valueOf(AV7TipArtCodto),AV36BarSerfrom,AV37BarSerto});
         WebComp_Wcrmod008_consulta.componentbind(new Object[] {"","vDATA_JSON","vCLICODFROM","vCLICODTO","vBARFECCLIFROM","vBARFECCLITO","vBARSITFROM","vBARSITTO","vTIPARTCODFROM","vTIPARTCODTO","vBARSERFROM","vBARSERTO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcrmod008_consulta )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0134"+"");
         WebComp_Wcrmod008_consulta.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      /*  Sending Event outputs  */
   }

   public void e131YP2( )
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

   public void S142( )
   {
      /* 'LOADCOMBOTIPARTCODTO' Routine */
      returnInSub = false ;
      /* Using cursor H01YP2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13788TipArtCodD = H01YP2_A13788TipArtCodD[0] ;
         A829TipArtCod = H01YP2_A829TipArtCod[0] ;
         A830TipArtDsc = H01YP2_A830TipArtDsc[0] ;
         n830TipArtDsc = H01YP2_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H01YP2_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H01YP2_n6014TipArtDsc2[0] ;
         AV15Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV16TipArtCodto_Data.add(AV15Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_tipartcodto_Selectedvalue_set = ((0==AV7TipArtCodto) ? "" : GXutil.trim( GXutil.str( AV7TipArtCodto, 4, 0))) ;
      ucCombo_tipartcodto.sendProperty(context, "", false, Combo_tipartcodto_Internalname, "SelectedValue_set", Combo_tipartcodto_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOTIPARTCODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H01YP3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13788TipArtCodD = H01YP3_A13788TipArtCodD[0] ;
         A829TipArtCod = H01YP3_A829TipArtCod[0] ;
         A830TipArtDsc = H01YP3_A830TipArtDsc[0] ;
         n830TipArtDsc = H01YP3_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H01YP3_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H01YP3_n6014TipArtDsc2[0] ;
         AV15Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV14TipArtCodfrom_Data.add(AV15Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_tipartcodfrom_Selectedvalue_set = ((0==AV6TipArtCodfrom) ? "" : GXutil.trim( GXutil.str( AV6TipArtCodfrom, 4, 0))) ;
      ucCombo_tipartcodfrom.sendProperty(context, "", false, Combo_tipartcodfrom_Internalname, "SelectedValue_set", Combo_tipartcodfrom_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H01YP4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H01YP4_A10045CliAct[0] ;
         A13735CliCNom = H01YP4_A13735CliCNom[0] ;
         A252CliCod = H01YP4_A252CliCod[0] ;
         A279CliNom = H01YP4_A279CliNom[0] ;
         AV15Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV18CliCodto_Data.add(AV15Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clicodto_Selectedvalue_set = ((0==AV13CliCodto) ? "" : GXutil.trim( GXutil.str( AV13CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H01YP5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10045CliAct = H01YP5_A10045CliAct[0] ;
         A13735CliCNom = H01YP5_A13735CliCNom[0] ;
         A252CliCod = H01YP5_A252CliCod[0] ;
         A279CliNom = H01YP5_A279CliNom[0] ;
         AV15Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV15Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV17CliCodfrom_Data.add(AV15Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV12CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV12CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e141YP2( )
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
      pa1YP2( ) ;
      ws1YP2( ) ;
      we1YP2( ) ;
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
      if ( ! ( WebComp_Wcrmod008_consulta == null ) )
      {
         if ( GXutil.len( WebComp_Wcrmod008_consulta_Component) != 0 )
         {
            WebComp_Wcrmod008_consulta.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714195272", true, true);
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
      httpContext.AddJavascriptSource("produccionencurso.js", "?202681714195272", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavBarfecclifrom_Internalname = "vBARFECCLIFROM" ;
      edtavBarfecclito_Internalname = "vBARFECCLITO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavBarsitfrom_Internalname = "vBARSITFROM" ;
      edtavBarsitto_Internalname = "vBARSITTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockcombo_tipartcodfrom_Internalname = "TEXTBLOCKCOMBO_TIPARTCODFROM" ;
      Combo_tipartcodfrom_Internalname = "COMBO_TIPARTCODFROM" ;
      divTablesplittedtipartcodfrom_Internalname = "TABLESPLITTEDTIPARTCODFROM" ;
      lblTextblockcombo_tipartcodto_Internalname = "TEXTBLOCKCOMBO_TIPARTCODTO" ;
      Combo_tipartcodto_Internalname = "COMBO_TIPARTCODTO" ;
      divTablesplittedtipartcodto_Internalname = "TABLESPLITTEDTIPARTCODTO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarserfrom_Internalname = "vBARSERFROM" ;
      edtavBarserto_Internalname = "vBARSERTO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      edtavData_json_Internalname = "vDATA_JSON" ;
      divTabladatajson_Internalname = "TABLADATAJSON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      Datamon_Internalname = "DATAMON" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavTipartcodfrom_Internalname = "vTIPARTCODFROM" ;
      edtavTipartcodto_Internalname = "vTIPARTCODTO" ;
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
      edtavTipartcodto_Jsonclick = "" ;
      edtavTipartcodto_Visible = 1 ;
      edtavTipartcodfrom_Jsonclick = "" ;
      edtavTipartcodfrom_Visible = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavData_json_Enabled = 1 ;
      divTabladatajson_Visible = 1 ;
      edtavBarserto_Jsonclick = "" ;
      edtavBarserto_Enabled = 1 ;
      edtavBarserfrom_Jsonclick = "" ;
      edtavBarserfrom_Enabled = 1 ;
      edtavBarsitto_Jsonclick = "" ;
      edtavBarsitto_Enabled = 1 ;
      edtavBarsitfrom_Jsonclick = "" ;
      edtavBarsitfrom_Enabled = 1 ;
      edtavBarfecclito_Jsonclick = "" ;
      edtavBarfecclito_Enabled = 1 ;
      edtavBarfecclifrom_Jsonclick = "" ;
      edtavBarfecclifrom_Enabled = 1 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultado", "") ;
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
      Combo_tipartcodto_Emptyitemtext = "Todos" ;
      Combo_tipartcodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipartcodfrom_Emptyitemtext = "Todos" ;
      Combo_tipartcodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Produccion en Curso", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e121YP2',iparms:[{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV13CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV10BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV11BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV8BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV9BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV6TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV7TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV36BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV37BarSerto',fld:'vBARSERTO',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV38Data_json',fld:'vDATA_JSON',pic:''},{av:'AV7TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{ctrl:'WCRMOD008_CONSULTA'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e131YP2',iparms:[]");
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
      Combo_tipartcodto_Selectedvalue_get = "" ;
      Combo_tipartcodfrom_Selectedvalue_get = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV33EmprCod = "" ;
      GXKey = "" ;
      AV17CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV14TipArtCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16TipArtCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Combo_tipartcodfrom_Selectedvalue_set = "" ;
      Combo_tipartcodto_Selectedvalue_set = "" ;
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
      AV10BarFecClifrom = GXutil.nullDate() ;
      AV11BarFecClito = GXutil.nullDate() ;
      lblTextblockcombo_tipartcodfrom_Jsonclick = "" ;
      ucCombo_tipartcodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_tipartcodfrom_Caption = "" ;
      lblTextblockcombo_tipartcodto_Jsonclick = "" ;
      ucCombo_tipartcodto = new com.genexus.webpanels.GXUserControl();
      Combo_tipartcodto_Caption = "" ;
      AV36BarSerfrom = "" ;
      AV37BarSerto = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      AV38Data_json = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcrmod008_consulta_Component = "" ;
      OldWcrmod008_consulta = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV41Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      AV20Station = "" ;
      AV21EmprNom = "" ;
      AV22UsurCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char1 = "" ;
      GXv_int5 = new short[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      H01YP2_A396EmprCod = new String[] {""} ;
      H01YP2_A13788TipArtCodD = new String[] {""} ;
      H01YP2_A829TipArtCod = new short[1] ;
      H01YP2_A830TipArtDsc = new String[] {""} ;
      H01YP2_n830TipArtDsc = new boolean[] {false} ;
      H01YP2_A6014TipArtDsc2 = new String[] {""} ;
      H01YP2_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      AV15Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01YP3_A396EmprCod = new String[] {""} ;
      H01YP3_A13788TipArtCodD = new String[] {""} ;
      H01YP3_A829TipArtCod = new short[1] ;
      H01YP3_A830TipArtDsc = new String[] {""} ;
      H01YP3_n830TipArtDsc = new boolean[] {false} ;
      H01YP3_A6014TipArtDsc2 = new String[] {""} ;
      H01YP3_n6014TipArtDsc2 = new boolean[] {false} ;
      H01YP4_A396EmprCod = new String[] {""} ;
      H01YP4_A10045CliAct = new String[] {""} ;
      H01YP4_A13735CliCNom = new String[] {""} ;
      H01YP4_A252CliCod = new int[1] ;
      H01YP4_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H01YP5_A396EmprCod = new String[] {""} ;
      H01YP5_A10045CliAct = new String[] {""} ;
      H01YP5_A13735CliCNom = new String[] {""} ;
      H01YP5_A252CliCod = new int[1] ;
      H01YP5_A279CliNom = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccionencurso__default(),
         new Object[] {
             new Object[] {
            H01YP2_A396EmprCod, H01YP2_A13788TipArtCodD, H01YP2_A829TipArtCod, H01YP2_A830TipArtDsc, H01YP2_n830TipArtDsc, H01YP2_A6014TipArtDsc2, H01YP2_n6014TipArtDsc2
            }
            , new Object[] {
            H01YP3_A396EmprCod, H01YP3_A13788TipArtCodD, H01YP3_A829TipArtCod, H01YP3_A830TipArtDsc, H01YP3_n830TipArtDsc, H01YP3_A6014TipArtDsc2, H01YP3_n6014TipArtDsc2
            }
            , new Object[] {
            H01YP4_A396EmprCod, H01YP4_A10045CliAct, H01YP4_A13735CliCNom, H01YP4_A252CliCod, H01YP4_A279CliNom
            }
            , new Object[] {
            H01YP5_A396EmprCod, H01YP5_A10045CliAct, H01YP5_A13735CliCNom, H01YP5_A252CliCod, H01YP5_A279CliNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV41Pgmname = "ProduccionenCurso" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV41Pgmname = "ProduccionenCurso" ;
      Gx_err = (short)(0) ;
      edtavData_json_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcrmod008_consulta = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV8BarSitfrom ;
   private byte AV9BarSitto ;
   private byte nDonePA ;
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
   private short AV6TipArtCodfrom ;
   private short AV7TipArtCodto ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private short A829TipArtCod ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavBarfecclifrom_Enabled ;
   private int edtavBarfecclito_Enabled ;
   private int edtavBarsitfrom_Enabled ;
   private int edtavBarsitto_Enabled ;
   private int edtavBarserfrom_Enabled ;
   private int edtavBarserto_Enabled ;
   private int divTabladatajson_Visible ;
   private int edtavData_json_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV12CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV13CliCodto ;
   private int edtavClicodto_Visible ;
   private int edtavTipartcodfrom_Visible ;
   private int edtavTipartcodto_Visible ;
   private int A252CliCod ;
   private int idxLst ;
   private String Combo_tipartcodto_Selectedvalue_get ;
   private String Combo_tipartcodfrom_Selectedvalue_get ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV33EmprCod ;
   private String GXKey ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Combo_tipartcodfrom_Cls ;
   private String Combo_tipartcodfrom_Selectedvalue_set ;
   private String Combo_tipartcodfrom_Emptyitemtext ;
   private String Combo_tipartcodto_Cls ;
   private String Combo_tipartcodto_Selectedvalue_set ;
   private String Combo_tipartcodto_Emptyitemtext ;
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
   private String divUnnamedtable1_Internalname ;
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
   private String divUnnamedtable2_Internalname ;
   private String edtavBarfecclifrom_Internalname ;
   private String TempTags ;
   private String edtavBarfecclifrom_Jsonclick ;
   private String edtavBarfecclito_Internalname ;
   private String edtavBarfecclito_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarsitfrom_Internalname ;
   private String edtavBarsitfrom_Jsonclick ;
   private String edtavBarsitto_Internalname ;
   private String edtavBarsitto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedtipartcodfrom_Internalname ;
   private String lblTextblockcombo_tipartcodfrom_Internalname ;
   private String lblTextblockcombo_tipartcodfrom_Jsonclick ;
   private String Combo_tipartcodfrom_Caption ;
   private String Combo_tipartcodfrom_Internalname ;
   private String divTablesplittedtipartcodto_Internalname ;
   private String lblTextblockcombo_tipartcodto_Internalname ;
   private String lblTextblockcombo_tipartcodto_Jsonclick ;
   private String Combo_tipartcodto_Caption ;
   private String Combo_tipartcodto_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarserfrom_Internalname ;
   private String AV36BarSerfrom ;
   private String edtavBarserfrom_Jsonclick ;
   private String edtavBarserto_Internalname ;
   private String AV37BarSerto ;
   private String edtavBarserto_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divTabladatajson_Internalname ;
   private String edtavData_json_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcrmod008_consulta_Component ;
   private String OldWcrmod008_consulta ;
   private String Datamon_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV41Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavTipartcodfrom_Internalname ;
   private String edtavTipartcodfrom_Jsonclick ;
   private String edtavTipartcodto_Internalname ;
   private String edtavTipartcodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV20Station ;
   private String AV21EmprNom ;
   private String AV22UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private java.util.Date AV10BarFecClifrom ;
   private java.util.Date AV11BarFecClito ;
   private java.util.Date Gx_date ;
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
   private boolean bDynCreated_Wcrmod008_consulta ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private String AV38Data_json ;
   private String A13788TipArtCodD ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcrmod008_consulta ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartcodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartcodto ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private IDataStoreProvider pr_default ;
   private String[] H01YP2_A396EmprCod ;
   private String[] H01YP2_A13788TipArtCodD ;
   private short[] H01YP2_A829TipArtCod ;
   private String[] H01YP2_A830TipArtDsc ;
   private boolean[] H01YP2_n830TipArtDsc ;
   private String[] H01YP2_A6014TipArtDsc2 ;
   private boolean[] H01YP2_n6014TipArtDsc2 ;
   private String[] H01YP3_A396EmprCod ;
   private String[] H01YP3_A13788TipArtCodD ;
   private short[] H01YP3_A829TipArtCod ;
   private String[] H01YP3_A830TipArtDsc ;
   private boolean[] H01YP3_n830TipArtDsc ;
   private String[] H01YP3_A6014TipArtDsc2 ;
   private boolean[] H01YP3_n6014TipArtDsc2 ;
   private String[] H01YP4_A396EmprCod ;
   private String[] H01YP4_A10045CliAct ;
   private String[] H01YP4_A13735CliCNom ;
   private int[] H01YP4_A252CliCod ;
   private String[] H01YP4_A279CliNom ;
   private String[] H01YP5_A396EmprCod ;
   private String[] H01YP5_A10045CliAct ;
   private String[] H01YP5_A13735CliCNom ;
   private int[] H01YP5_A252CliCod ;
   private String[] H01YP5_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV17CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18CliCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV14TipArtCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16TipArtCodto_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV15Combo_DataItem ;
}

final  class produccionencurso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YP2", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YP3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YP4", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YP5", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 3 :
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

