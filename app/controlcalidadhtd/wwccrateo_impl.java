package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwccrateo_impl extends GXDataArea
{
   public wwccrateo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwccrateo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwccrateo_impl.class ));
   }

   public wwccrateo_impl( int remoteHandle ,
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
      pa1X82( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1X82( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wwccrateo", new String[] {}, new String[] {}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIINI_DATA", AV55CliIni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIINI_DATA", AV55CliIni_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIFIN_DATA", AV57CliFin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIFIN_DATA", AV57CliFin_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vNIVINI_DATA", AV58NivIni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vNIVINI_DATA", AV58NivIni_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vNIVFIN_DATA", AV60NivFin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vNIVFIN_DATA", AV60NivFin_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vREOINI", GXutil.ltrim( localUtil.ntoc( AV51ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vREOFIN", GXutil.ltrim( localUtil.ntoc( AV50ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARINI", GXutil.rtrim( AV49ParIni));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARFIN", GXutil.rtrim( AV48ParFin));
      app.GxWebStd.gx_hidden_field( httpContext, "vDET", GXutil.rtrim( AV20Det));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTDSC", GXutil.rtrim( A4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTTPOCTR", GXutil.rtrim( A4037CCTTpoCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Cls", GXutil.rtrim( Combo_cliini_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Selectedvalue_set", GXutil.rtrim( Combo_cliini_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Emptyitemtext", GXutil.rtrim( Combo_cliini_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Cls", GXutil.rtrim( Combo_clifin_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Selectedvalue_set", GXutil.rtrim( Combo_clifin_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Emptyitemtext", GXutil.rtrim( Combo_clifin_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVINI_Cls", GXutil.rtrim( Combo_nivini_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVINI_Selectedvalue_set", GXutil.rtrim( Combo_nivini_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVINI_Datalisttype", GXutil.rtrim( Combo_nivini_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVINI_Datalistfixedvalues", GXutil.rtrim( Combo_nivini_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVINI_Emptyitemtext", GXutil.rtrim( Combo_nivini_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVFIN_Cls", GXutil.rtrim( Combo_nivfin_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVFIN_Selectedvalue_set", GXutil.rtrim( Combo_nivfin_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVFIN_Datalisttype", GXutil.rtrim( Combo_nivfin_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVFIN_Datalistfixedvalues", GXutil.rtrim( Combo_nivfin_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVFIN_Emptyitemtext", GXutil.rtrim( Combo_nivfin_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVFIN_Selectedvalue_get", GXutil.rtrim( Combo_nivfin_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_NIVINI_Selectedvalue_get", GXutil.rtrim( Combo_nivini_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Selectedvalue_get", GXutil.rtrim( Combo_clifin_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Selectedvalue_get", GXutil.rtrim( Combo_cliini_Selectedvalue_get));
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
         we1X82( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1X82( ) ;
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
      return formatLink("app.controlcalidadhtd.wwccrateo", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.wwccrateo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Comparaçion Real / Teórico", "") ;
   }

   public void wb1X80( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarini_Internalname, httpContext.getMessage( "HDR", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarini_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarIni), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarIni), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarini_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfin_Internalname, httpContext.getMessage( "FIN", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarFin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarFin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcliini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cliini_Internalname, httpContext.getMessage( "CLIENTE", ""), "", "", lblTextblockcombo_cliini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cliini.setProperty("Caption", Combo_cliini_Caption);
         ucCombo_cliini.setProperty("Cls", Combo_cliini_Cls);
         ucCombo_cliini.setProperty("EmptyItemText", Combo_cliini_Emptyitemtext);
         ucCombo_cliini.setProperty("DropDownOptionsData", AV55CliIni_Data);
         ucCombo_cliini.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cliini_Internalname, "COMBO_CLIINIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclifin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clifin_Internalname, httpContext.getMessage( "FIN", ""), "", "", lblTextblockcombo_clifin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clifin.setProperty("Caption", Combo_clifin_Caption);
         ucCombo_clifin.setProperty("Cls", Combo_clifin_Cls);
         ucCombo_clifin.setProperty("EmptyItemText", Combo_clifin_Emptyitemtext);
         ucCombo_clifin.setProperty("DropDownOptionsData", AV57CliFin_Data);
         ucCombo_clifin.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clifin_Internalname, "COMBO_CLIFINContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctini_Internalname, httpContext.getMessage( "CÓDIGO", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctini_Internalname, GXutil.ltrim( localUtil.ntoc( AV13CCTIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13CCTIni), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13CCTIni), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctini_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctfin_Internalname, httpContext.getMessage( "FIN", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV11CCTFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11CCTFin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11CCTFin), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctfin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFchini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFchini_Internalname, httpContext.getMessage( "FECHA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFchini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFchini_Internalname, localUtil.format(AV24FchIni, "99/99/99"), localUtil.format( AV24FchIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFchini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFchini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFchini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFchini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFchfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFchfin_Internalname, httpContext.getMessage( "FIN", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFchfin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFchfin_Internalname, localUtil.format(AV23FchFin, "99/99/99"), localUtil.format( AV23FchFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFchfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFchfin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFchfin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFchfin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittednivini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_nivini_Internalname, httpContext.getMessage( "NIVEL", ""), "", "", lblTextblockcombo_nivini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_nivini.setProperty("Caption", Combo_nivini_Caption);
         ucCombo_nivini.setProperty("Cls", Combo_nivini_Cls);
         ucCombo_nivini.setProperty("DataListType", Combo_nivini_Datalisttype);
         ucCombo_nivini.setProperty("DataListFixedValues", Combo_nivini_Datalistfixedvalues);
         ucCombo_nivini.setProperty("EmptyItemText", Combo_nivini_Emptyitemtext);
         ucCombo_nivini.setProperty("DropDownOptionsTitleSettingsIcons", AV59DDO_TitleSettingsIcons);
         ucCombo_nivini.setProperty("DropDownOptionsData", AV58NivIni_Data);
         ucCombo_nivini.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_nivini_Internalname, "COMBO_NIVINIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittednivfin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_nivfin_Internalname, httpContext.getMessage( "FIN", ""), "", "", lblTextblockcombo_nivfin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_nivfin.setProperty("Caption", Combo_nivfin_Caption);
         ucCombo_nivfin.setProperty("Cls", Combo_nivfin_Cls);
         ucCombo_nivfin.setProperty("DataListType", Combo_nivfin_Datalisttype);
         ucCombo_nivfin.setProperty("DataListFixedValues", Combo_nivfin_Datalistfixedvalues);
         ucCombo_nivfin.setProperty("EmptyItemText", Combo_nivfin_Emptyitemtext);
         ucCombo_nivfin.setProperty("DropDownOptionsTitleSettingsIcons", AV59DDO_TitleSettingsIcons);
         ucCombo_nivfin.setProperty("DropDownOptionsData", AV60NivFin_Data);
         ucCombo_nivfin.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_nivfin_Internalname, "COMBO_NIVFINContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Imprimir", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\wwccrateo.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV63Pgmname), GXutil.rtrim( localUtil.format( AV63Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCliini_Internalname, GXutil.ltrim( localUtil.ntoc( AV18CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18CliIni), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCliini_Jsonclick, 0, "Attribute", "", "", "", "", edtavCliini_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClifin_Internalname, GXutil.ltrim( localUtil.ntoc( AV16CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16CliFin), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClifin_Jsonclick, 0, "Attribute", "", "", "", "", edtavClifin_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNivini_Internalname, GXutil.rtrim( AV47NivIni), GXutil.rtrim( localUtil.format( AV47NivIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNivini_Jsonclick, 0, "Attribute", "", "", "", "", edtavNivini_Visible, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNivfin_Internalname, GXutil.rtrim( AV46NivFin), GXutil.rtrim( localUtil.format( AV46NivFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNivfin_Jsonclick, 0, "Attribute", "", "", "", "", edtavNivfin_Visible, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wwccrateo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1X82( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Comparaçion Real / Teórico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1X80( ) ;
   }

   public void ws1X82( )
   {
      start1X82( ) ;
      evt1X82( ) ;
   }

   public void evt1X82( )
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
                           e111X82 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e121X82 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCTINI.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131X82 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCTFIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141X82 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151X82 ();
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

   public void we1X82( )
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

   public void pa1X82( )
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
            GX_FocusControl = edtavBarini_Internalname ;
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
      rf1X82( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV64Pgmdesc = httpContext.getMessage( "Comparaçion Real / Teórico", "") ;
      AV63Pgmname = "ControlCalidadHTD.wwccrateo" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1X82( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151X82 ();
         wb1X80( ) ;
      }
   }

   public void send_integrity_lvl_hashes1X82( )
   {
   }

   public void before_start_formulas( )
   {
      AV64Pgmdesc = httpContext.getMessage( "Comparaçion Real / Teórico", "") ;
      AV63Pgmname = "ControlCalidadHTD.wwccrateo" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1X80( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111X82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIINI_DATA"), AV55CliIni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIFIN_DATA"), AV57CliFin_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV59DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vNIVINI_DATA"), AV58NivIni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vNIVFIN_DATA"), AV60NivFin_Data);
         /* Read saved values. */
         Combo_cliini_Cls = httpContext.cgiGet( "COMBO_CLIINI_Cls") ;
         Combo_cliini_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIINI_Selectedvalue_set") ;
         Combo_cliini_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIINI_Emptyitemtext") ;
         Combo_clifin_Cls = httpContext.cgiGet( "COMBO_CLIFIN_Cls") ;
         Combo_clifin_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIFIN_Selectedvalue_set") ;
         Combo_clifin_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIFIN_Emptyitemtext") ;
         Combo_nivini_Cls = httpContext.cgiGet( "COMBO_NIVINI_Cls") ;
         Combo_nivini_Selectedvalue_set = httpContext.cgiGet( "COMBO_NIVINI_Selectedvalue_set") ;
         Combo_nivini_Datalisttype = httpContext.cgiGet( "COMBO_NIVINI_Datalisttype") ;
         Combo_nivini_Datalistfixedvalues = httpContext.cgiGet( "COMBO_NIVINI_Datalistfixedvalues") ;
         Combo_nivini_Emptyitemtext = httpContext.cgiGet( "COMBO_NIVINI_Emptyitemtext") ;
         Combo_nivfin_Cls = httpContext.cgiGet( "COMBO_NIVFIN_Cls") ;
         Combo_nivfin_Selectedvalue_set = httpContext.cgiGet( "COMBO_NIVFIN_Selectedvalue_set") ;
         Combo_nivfin_Datalisttype = httpContext.cgiGet( "COMBO_NIVFIN_Datalisttype") ;
         Combo_nivfin_Datalistfixedvalues = httpContext.cgiGet( "COMBO_NIVFIN_Datalistfixedvalues") ;
         Combo_nivfin_Emptyitemtext = httpContext.cgiGet( "COMBO_NIVFIN_Emptyitemtext") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARINI");
            GX_FocusControl = edtavBarini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarIni), 8, 0));
         }
         else
         {
            AV10BarIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarIni), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFIN");
            GX_FocusControl = edtavBarfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarFin), 8, 0));
         }
         else
         {
            AV9BarFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarFin), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTINI");
            GX_FocusControl = edtavCctini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13CCTIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCTIni), 6, 0));
         }
         else
         {
            AV13CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCTIni), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTFIN");
            GX_FocusControl = edtavCctfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11CCTFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CCTFin), 6, 0));
         }
         else
         {
            AV11CCTFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CCTFin), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFchini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFCHINI");
            GX_FocusControl = edtavFchini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24FchIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FchIni", localUtil.format(AV24FchIni, "99/99/99"));
         }
         else
         {
            AV24FchIni = localUtil.ctod( httpContext.cgiGet( edtavFchini_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FchIni", localUtil.format(AV24FchIni, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFchfin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFCHFIN");
            GX_FocusControl = edtavFchfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23FchFin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FchFin", localUtil.format(AV23FchFin, "99/99/99"));
         }
         else
         {
            AV23FchFin = localUtil.ctod( httpContext.cgiGet( edtavFchfin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FchFin", localUtil.format(AV23FchFin, "99/99/99"));
         }
         AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIINI");
            GX_FocusControl = edtavCliini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18CliIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliIni), 6, 0));
         }
         else
         {
            AV18CliIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliIni), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIFIN");
            GX_FocusControl = edtavClifin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16CliFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliFin), 6, 0));
         }
         else
         {
            AV16CliFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliFin), 6, 0));
         }
         AV47NivIni = httpContext.cgiGet( edtavNivini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47NivIni", AV47NivIni);
         AV46NivFin = httpContext.cgiGet( edtavNivfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46NivFin", AV46NivFin);
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
      e111X82 ();
      if (returnInSub) return;
   }

   public void e111X82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV52Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwccrateo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Station = GXt_char1 ;
      GXv_char2[0] = AV21EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV54UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwccrateo_impl.this.AV21EmprCod = GXv_char2[0] ;
      wwccrateo_impl.this.AV22EmprNom = GXv_char3[0] ;
      wwccrateo_impl.this.AV54UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV59DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV59DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavNivfin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNivfin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNivfin_Visible), 5, 0), true);
      edtavNivini_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNivini_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNivini_Visible), 5, 0), true);
      edtavClifin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClifin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClifin_Visible), 5, 0), true);
      edtavCliini_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCliini_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCliini_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLIINI' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLIFIN' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBONIVINI' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBONIVFIN' */
      S142 ();
      if (returnInSub) return;
      GXt_char1 = AV36Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV64Pgmdesc, (byte)(99), GXv_char4) ;
      wwccrateo_impl.this.GXt_char1 = GXv_char4[0] ;
      AV36Lit2 = GXutil.trim( GXt_char1) ;
      GXt_char1 = AV45LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
      wwccrateo_impl.this.GXt_char1 = GXv_char4[0] ;
      AV45LitFe = GXt_char1 ;
      GXt_char1 = AV25Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char4) ;
      wwccrateo_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Lit0 = GXt_char1 ;
      GXt_char1 = AV52Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wwccrateo_impl.this.GXt_char1 = GXv_char4[0] ;
      AV52Station = GXt_char1 ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char2[0] = AV54UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char4, GXv_char3, GXv_char2) ;
      wwccrateo_impl.this.AV21EmprCod = GXv_char4[0] ;
      wwccrateo_impl.this.AV22EmprNom = GXv_char3[0] ;
      wwccrateo_impl.this.AV54UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV20Det = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Det", AV20Det);
      AV47NivIni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47NivIni", AV47NivIni);
      AV46NivFin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46NivFin", AV46NivFin);
      AV15CCTipctr = (byte)(0) ;
   }

   public void e121X82( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.rccreateo", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarFin,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51ReoIni,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50ReoFin,1,0)),GXutil.URLEncode(GXutil.rtrim(AV49ParIni)),GXutil.URLEncode(GXutil.rtrim(AV48ParFin)),GXutil.URLEncode(GXutil.ltrimstr(AV18CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13CCTIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11CCTFin,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV24FchIni)),GXutil.URLEncode(GXutil.formatDateParm(AV23FchFin)),GXutil.URLEncode(GXutil.rtrim(AV47NivIni)),GXutil.URLEncode(GXutil.rtrim(AV46NivFin)),GXutil.URLEncode(GXutil.rtrim(AV20Det))}, new String[] {"EmprCod","BarIni","BarFin","ReoIni","ReoFin","ParIni","ParFin","CliIni","CliFin","CCTIni","CCTFin","FchIni","FchFin","NivIni","NivFin","Det"}) , new Object[] {"AV21EmprCod","AV10BarIni","AV9BarFin","AV51ReoIni","AV50ReoFin","AV49ParIni","AV48ParFin","AV18CliIni","AV16CliFin","AV13CCTIni","AV11CCTFin","AV24FchIni","AV23FchFin","AV47NivIni","AV46NivFin","AV20Det"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'LOADCOMBONIVFIN' Routine */
      returnInSub = false ;
      Combo_nivfin_Selectedvalue_set = AV46NivFin ;
      ucCombo_nivfin.sendProperty(context, "", false, Combo_nivfin_Internalname, "SelectedValue_set", Combo_nivfin_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBONIVINI' Routine */
      returnInSub = false ;
      Combo_nivini_Selectedvalue_set = AV47NivIni ;
      ucCombo_nivini.sendProperty(context, "", false, Combo_nivini_Internalname, "SelectedValue_set", Combo_nivini_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLIFIN' Routine */
      returnInSub = false ;
      /* Using cursor H01X82 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = H01X82_A252CliCod[0] ;
         A279CliNom = H01X82_A279CliNom[0] ;
         AV56Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV56Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV56Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A279CliNom );
         AV57CliFin_Data.add(AV56Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_clifin_Selectedvalue_set = ((0==AV16CliFin) ? "" : GXutil.trim( GXutil.str( AV16CliFin, 6, 0))) ;
      ucCombo_clifin.sendProperty(context, "", false, Combo_clifin_Internalname, "SelectedValue_set", Combo_clifin_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLIINI' Routine */
      returnInSub = false ;
      /* Using cursor H01X83 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = H01X83_A252CliCod[0] ;
         A279CliNom = H01X83_A279CliNom[0] ;
         AV56Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV56Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV56Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A279CliNom );
         AV55CliIni_Data.add(AV56Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_cliini_Selectedvalue_set = ((0==AV18CliIni) ? "" : GXutil.trim( GXutil.str( AV18CliIni, 6, 0))) ;
      ucCombo_cliini.sendProperty(context, "", false, Combo_cliini_Internalname, "SelectedValue_set", Combo_cliini_Selectedvalue_set);
   }

   public void e131X82( )
   {
      /* Cctini_Isvalid Routine */
      returnInSub = false ;
      AV14CCTIniDsc = "" ;
      if ( ! (0==AV13CCTIni) )
      {
         AV67GXLvl149 = (byte)(0) ;
         /* Using cursor H01X84 */
         pr_default.execute(2, new Object[] {AV21EmprCod, Integer.valueOf(AV13CCTIni)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4031CCTCod = H01X84_A4031CCTCod[0] ;
            A396EmprCod = H01X84_A396EmprCod[0] ;
            A4036CCTDsc = H01X84_A4036CCTDsc[0] ;
            A4037CCTTpoCtr = H01X84_A4037CCTTpoCtr[0] ;
            AV67GXLvl149 = (byte)(1) ;
            AV14CCTIniDsc = A4036CCTDsc ;
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 )
            {
               AV15CCTipctr = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV67GXLvl149 == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso : No existe el CC Tipo.", ""));
         }
      }
   }

   public void e141X82( )
   {
      /* Cctfin_Isvalid Routine */
      returnInSub = false ;
      AV12CCTFinDsc = "" ;
      if ( ! (0==AV11CCTFin) )
      {
         AV68GXLvl167 = (byte)(0) ;
         /* Using cursor H01X85 */
         pr_default.execute(3, new Object[] {AV21EmprCod, Integer.valueOf(AV11CCTFin)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4031CCTCod = H01X85_A4031CCTCod[0] ;
            A396EmprCod = H01X85_A396EmprCod[0] ;
            A4036CCTDsc = H01X85_A4036CCTDsc[0] ;
            A4037CCTTpoCtr = H01X85_A4037CCTTpoCtr[0] ;
            AV68GXLvl167 = (byte)(1) ;
            AV12CCTFinDsc = A4036CCTDsc ;
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 )
            {
               AV15CCTipctr = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV68GXLvl167 == 0 )
         {
            AV12CCTFinDsc = "" ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso : No existe el CC Tipo.", ""));
         }
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e151X82( )
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
      pa1X82( ) ;
      ws1X82( ) ;
      we1X82( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714194442", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wwccrateo.js", "?202681714194442", false, true);
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
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarini_Internalname = "vBARINI" ;
      edtavBarfin_Internalname = "vBARFIN" ;
      lblTextblockcombo_cliini_Internalname = "TEXTBLOCKCOMBO_CLIINI" ;
      Combo_cliini_Internalname = "COMBO_CLIINI" ;
      divTablesplittedcliini_Internalname = "TABLESPLITTEDCLIINI" ;
      lblTextblockcombo_clifin_Internalname = "TEXTBLOCKCOMBO_CLIFIN" ;
      Combo_clifin_Internalname = "COMBO_CLIFIN" ;
      divTablesplittedclifin_Internalname = "TABLESPLITTEDCLIFIN" ;
      edtavCctini_Internalname = "vCCTINI" ;
      edtavCctfin_Internalname = "vCCTFIN" ;
      edtavFchini_Internalname = "vFCHINI" ;
      edtavFchfin_Internalname = "vFCHFIN" ;
      lblTextblockcombo_nivini_Internalname = "TEXTBLOCKCOMBO_NIVINI" ;
      Combo_nivini_Internalname = "COMBO_NIVINI" ;
      divTablesplittednivini_Internalname = "TABLESPLITTEDNIVINI" ;
      lblTextblockcombo_nivfin_Internalname = "TEXTBLOCKCOMBO_NIVFIN" ;
      Combo_nivfin_Internalname = "COMBO_NIVFIN" ;
      divTablesplittednivfin_Internalname = "TABLESPLITTEDNIVFIN" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCliini_Internalname = "vCLIINI" ;
      edtavClifin_Internalname = "vCLIFIN" ;
      edtavNivini_Internalname = "vNIVINI" ;
      edtavNivfin_Internalname = "vNIVFIN" ;
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
      edtavNivfin_Jsonclick = "" ;
      edtavNivfin_Visible = 1 ;
      edtavNivini_Jsonclick = "" ;
      edtavNivini_Visible = 1 ;
      edtavClifin_Jsonclick = "" ;
      edtavClifin_Visible = 1 ;
      edtavCliini_Jsonclick = "" ;
      edtavCliini_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Combo_nivfin_Caption = "" ;
      Combo_nivini_Caption = "" ;
      edtavFchfin_Jsonclick = "" ;
      edtavFchfin_Enabled = 1 ;
      edtavFchini_Jsonclick = "" ;
      edtavFchini_Enabled = 1 ;
      edtavCctfin_Jsonclick = "" ;
      edtavCctfin_Enabled = 1 ;
      edtavCctini_Jsonclick = "" ;
      edtavCctini_Enabled = 1 ;
      edtavBarfin_Jsonclick = "" ;
      edtavBarfin_Enabled = 1 ;
      edtavBarini_Jsonclick = "" ;
      edtavBarini_Enabled = 1 ;
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
      Combo_nivfin_Emptyitemtext = "TODOS" ;
      Combo_nivfin_Datalistfixedvalues = "Excelente:0,Coorecto:1,Pesado Control:2,Limite de calidad:3,Incorrecto:4,Retrocedido en el control:5" ;
      Combo_nivfin_Datalisttype = "FixedValues" ;
      Combo_nivfin_Cls = "ExtendedCombo AttributeFL" ;
      Combo_nivini_Emptyitemtext = "TODOS" ;
      Combo_nivini_Datalistfixedvalues = "Excelente:0,Coorecto:1,Pesado Control:2,Limite de calidad:3,Incorrecto:4,Retrocedido en el control:5" ;
      Combo_nivini_Datalisttype = "FixedValues" ;
      Combo_nivini_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clifin_Emptyitemtext = "TODOS" ;
      Combo_clifin_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cliini_Emptyitemtext = "TODOS" ;
      Combo_cliini_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Comparaçion Real / Teórico", "") );
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
      setEventMetadata("'DORESULTADOS'","{handler:'e121X82',iparms:[{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV9BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV51ReoIni',fld:'vREOINI',pic:'9'},{av:'AV50ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV49ParIni',fld:'vPARINI',pic:''},{av:'AV48ParFin',fld:'vPARFIN',pic:''},{av:'AV18CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV16CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV13CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV11CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV24FchIni',fld:'vFCHINI',pic:''},{av:'AV23FchFin',fld:'vFCHFIN',pic:''},{av:'AV47NivIni',fld:'vNIVINI',pic:''},{av:'AV46NivFin',fld:'vNIVFIN',pic:''},{av:'AV20Det',fld:'vDET',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV20Det',fld:'vDET',pic:''},{av:'AV46NivFin',fld:'vNIVFIN',pic:''},{av:'AV47NivIni',fld:'vNIVINI',pic:''},{av:'AV23FchFin',fld:'vFCHFIN',pic:''},{av:'AV24FchIni',fld:'vFCHINI',pic:''},{av:'AV11CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV13CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV16CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV18CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV48ParFin',fld:'vPARFIN',pic:''},{av:'AV49ParIni',fld:'vPARINI',pic:''},{av:'AV50ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV51ReoIni',fld:'vREOINI',pic:'9'},{av:'AV9BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV10BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VCCTINI.ISVALID","{handler:'e131X82',iparms:[{av:'AV13CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''}]");
      setEventMetadata("VCCTINI.ISVALID",",oparms:[]}");
      setEventMetadata("VCCTFIN.ISVALID","{handler:'e141X82',iparms:[{av:'AV11CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''}]");
      setEventMetadata("VCCTFIN.ISVALID",",oparms:[]}");
      setEventMetadata("VALIDV_CCTINI","{handler:'validv_Cctini',iparms:[]");
      setEventMetadata("VALIDV_CCTINI",",oparms:[]}");
      setEventMetadata("VALIDV_CCTFIN","{handler:'validv_Cctfin',iparms:[]");
      setEventMetadata("VALIDV_CCTFIN",",oparms:[]}");
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
      Combo_nivfin_Selectedvalue_get = "" ;
      Combo_nivini_Selectedvalue_get = "" ;
      Combo_clifin_Selectedvalue_get = "" ;
      Combo_cliini_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV55CliIni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV57CliFin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV59DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV58NivIni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV60NivFin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV21EmprCod = "" ;
      AV49ParIni = "" ;
      AV48ParFin = "" ;
      AV20Det = "" ;
      A396EmprCod = "" ;
      A4036CCTDsc = "" ;
      A4037CCTTpoCtr = "" ;
      Combo_cliini_Selectedvalue_set = "" ;
      Combo_clifin_Selectedvalue_set = "" ;
      Combo_nivini_Selectedvalue_set = "" ;
      Combo_nivfin_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_cliini_Jsonclick = "" ;
      ucCombo_cliini = new com.genexus.webpanels.GXUserControl();
      Combo_cliini_Caption = "" ;
      lblTextblockcombo_clifin_Jsonclick = "" ;
      ucCombo_clifin = new com.genexus.webpanels.GXUserControl();
      Combo_clifin_Caption = "" ;
      AV24FchIni = GXutil.nullDate() ;
      AV23FchFin = GXutil.nullDate() ;
      lblTextblockcombo_nivini_Jsonclick = "" ;
      ucCombo_nivini = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_nivfin_Jsonclick = "" ;
      ucCombo_nivfin = new com.genexus.webpanels.GXUserControl();
      bttBtnresultados_Jsonclick = "" ;
      AV63Pgmname = "" ;
      AV47NivIni = "" ;
      AV46NivFin = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV64Pgmdesc = "" ;
      AV52Station = "" ;
      AV22EmprNom = "" ;
      AV54UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV36Lit2 = "" ;
      AV45LitFe = "" ;
      AV25Lit0 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      H01X82_A396EmprCod = new String[] {""} ;
      H01X82_A252CliCod = new int[1] ;
      H01X82_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV56Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01X83_A396EmprCod = new String[] {""} ;
      H01X83_A252CliCod = new int[1] ;
      H01X83_A279CliNom = new String[] {""} ;
      AV14CCTIniDsc = "" ;
      H01X84_A4031CCTCod = new int[1] ;
      H01X84_A396EmprCod = new String[] {""} ;
      H01X84_A4036CCTDsc = new String[] {""} ;
      H01X84_A4037CCTTpoCtr = new String[] {""} ;
      AV12CCTFinDsc = "" ;
      H01X85_A4031CCTCod = new int[1] ;
      H01X85_A396EmprCod = new String[] {""} ;
      H01X85_A4036CCTDsc = new String[] {""} ;
      H01X85_A4037CCTTpoCtr = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wwccrateo__default(),
         new Object[] {
             new Object[] {
            H01X82_A396EmprCod, H01X82_A252CliCod, H01X82_A279CliNom
            }
            , new Object[] {
            H01X83_A396EmprCod, H01X83_A252CliCod, H01X83_A279CliNom
            }
            , new Object[] {
            H01X84_A4031CCTCod, H01X84_A396EmprCod, H01X84_A4036CCTDsc, H01X84_A4037CCTTpoCtr
            }
            , new Object[] {
            H01X85_A4031CCTCod, H01X85_A396EmprCod, H01X85_A4036CCTDsc, H01X85_A4037CCTTpoCtr
            }
         }
      );
      AV64Pgmdesc = httpContext.getMessage( "Comparaçion Real / Teórico", "") ;
      AV63Pgmname = "ControlCalidadHTD.wwccrateo" ;
      /* GeneXus formulas. */
      AV64Pgmdesc = httpContext.getMessage( "Comparaçion Real / Teórico", "") ;
      AV63Pgmname = "ControlCalidadHTD.wwccrateo" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV51ReoIni ;
   private byte AV50ReoFin ;
   private byte nDonePA ;
   private byte AV15CCTipctr ;
   private byte AV67GXLvl149 ;
   private byte AV68GXLvl167 ;
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
   private short gxcookieaux ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private int AV10BarIni ;
   private int edtavBarini_Enabled ;
   private int AV9BarFin ;
   private int edtavBarfin_Enabled ;
   private int AV13CCTIni ;
   private int edtavCctini_Enabled ;
   private int AV11CCTFin ;
   private int edtavCctfin_Enabled ;
   private int edtavFchini_Enabled ;
   private int edtavFchfin_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV18CliIni ;
   private int edtavCliini_Visible ;
   private int AV16CliFin ;
   private int edtavClifin_Visible ;
   private int edtavNivini_Visible ;
   private int edtavNivfin_Visible ;
   private int A252CliCod ;
   private int idxLst ;
   private String Combo_nivfin_Selectedvalue_get ;
   private String Combo_nivini_Selectedvalue_get ;
   private String Combo_clifin_Selectedvalue_get ;
   private String Combo_cliini_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV21EmprCod ;
   private String AV49ParIni ;
   private String AV48ParFin ;
   private String AV20Det ;
   private String A396EmprCod ;
   private String A4036CCTDsc ;
   private String A4037CCTTpoCtr ;
   private String Combo_cliini_Cls ;
   private String Combo_cliini_Selectedvalue_set ;
   private String Combo_cliini_Emptyitemtext ;
   private String Combo_clifin_Cls ;
   private String Combo_clifin_Selectedvalue_set ;
   private String Combo_clifin_Emptyitemtext ;
   private String Combo_nivini_Cls ;
   private String Combo_nivini_Selectedvalue_set ;
   private String Combo_nivini_Datalisttype ;
   private String Combo_nivini_Datalistfixedvalues ;
   private String Combo_nivini_Emptyitemtext ;
   private String Combo_nivfin_Cls ;
   private String Combo_nivfin_Selectedvalue_set ;
   private String Combo_nivfin_Datalisttype ;
   private String Combo_nivfin_Datalistfixedvalues ;
   private String Combo_nivfin_Emptyitemtext ;
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
   private String edtavBarini_Internalname ;
   private String TempTags ;
   private String edtavBarini_Jsonclick ;
   private String edtavBarfin_Internalname ;
   private String edtavBarfin_Jsonclick ;
   private String divTablesplittedcliini_Internalname ;
   private String lblTextblockcombo_cliini_Internalname ;
   private String lblTextblockcombo_cliini_Jsonclick ;
   private String Combo_cliini_Caption ;
   private String Combo_cliini_Internalname ;
   private String divTablesplittedclifin_Internalname ;
   private String lblTextblockcombo_clifin_Internalname ;
   private String lblTextblockcombo_clifin_Jsonclick ;
   private String Combo_clifin_Caption ;
   private String Combo_clifin_Internalname ;
   private String edtavCctini_Internalname ;
   private String edtavCctini_Jsonclick ;
   private String edtavCctfin_Internalname ;
   private String edtavCctfin_Jsonclick ;
   private String edtavFchini_Internalname ;
   private String edtavFchini_Jsonclick ;
   private String edtavFchfin_Internalname ;
   private String edtavFchfin_Jsonclick ;
   private String divTablesplittednivini_Internalname ;
   private String lblTextblockcombo_nivini_Internalname ;
   private String lblTextblockcombo_nivini_Jsonclick ;
   private String Combo_nivini_Caption ;
   private String Combo_nivini_Internalname ;
   private String divTablesplittednivfin_Internalname ;
   private String lblTextblockcombo_nivfin_Internalname ;
   private String lblTextblockcombo_nivfin_Jsonclick ;
   private String Combo_nivfin_Caption ;
   private String Combo_nivfin_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV63Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavCliini_Internalname ;
   private String edtavCliini_Jsonclick ;
   private String edtavClifin_Internalname ;
   private String edtavClifin_Jsonclick ;
   private String edtavNivini_Internalname ;
   private String AV47NivIni ;
   private String edtavNivini_Jsonclick ;
   private String edtavNivfin_Internalname ;
   private String AV46NivFin ;
   private String edtavNivfin_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV64Pgmdesc ;
   private String AV52Station ;
   private String AV22EmprNom ;
   private String AV54UsurCod ;
   private String AV36Lit2 ;
   private String AV45LitFe ;
   private String AV25Lit0 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String AV14CCTIniDsc ;
   private String AV12CCTFinDsc ;
   private java.util.Date AV24FchIni ;
   private java.util.Date AV23FchFin ;
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
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_cliini ;
   private com.genexus.webpanels.GXUserControl ucCombo_clifin ;
   private com.genexus.webpanels.GXUserControl ucCombo_nivini ;
   private com.genexus.webpanels.GXUserControl ucCombo_nivfin ;
   private IDataStoreProvider pr_default ;
   private String[] H01X82_A396EmprCod ;
   private int[] H01X82_A252CliCod ;
   private String[] H01X82_A279CliNom ;
   private String[] H01X83_A396EmprCod ;
   private int[] H01X83_A252CliCod ;
   private String[] H01X83_A279CliNom ;
   private int[] H01X84_A4031CCTCod ;
   private String[] H01X84_A396EmprCod ;
   private String[] H01X84_A4036CCTDsc ;
   private String[] H01X84_A4037CCTTpoCtr ;
   private int[] H01X85_A4031CCTCod ;
   private String[] H01X85_A396EmprCod ;
   private String[] H01X85_A4036CCTDsc ;
   private String[] H01X85_A4037CCTTpoCtr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV55CliIni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV57CliFin_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV58NivIni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV60NivFin_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV56Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV59DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wwccrateo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01X82", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X83", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X84", "SELECT CCTCod, EmprCod, CCTDsc, CCTTpoCtr FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01X85", "SELECT CCTCod, EmprCod, CCTDsc, CCTTpoCtr FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

