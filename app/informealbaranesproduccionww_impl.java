package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informealbaranesproduccionww_impl extends GXDataArea
{
   public informealbaranesproduccionww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informealbaranesproduccionww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealbaranesproduccionww_impl.class ));
   }

   public informealbaranesproduccionww_impl( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPrio = new HTMLChoice();
      cmbavReo = new HTMLChoice();
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
      pa1B92( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1B92( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informealbaranesproduccionww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM_TO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarColNom_To, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV41CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV41CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_TO_DATA", AV44CliCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_TO_DATA", AV44CliCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPDISCOD_DATA", AV49Tipdiscod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPDISCOD_DATA", AV49Tipdiscod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV54ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_TO2", GXutil.ltrim( localUtil.ntoc( AV15CliCod_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH_TO2", localUtil.dtoc( AV16AlbProfch_to2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER_TO2", GXutil.rtrim( AV17BarSer_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBENCCLI_TO2", GXutil.rtrim( AV33AlbEncCli_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vFUENTE", GXutil.ltrim( localUtil.ntoc( AV58Fuente, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODI", GXutil.ltrim( localUtil.ntoc( AV59Barcodi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREOF", GXutil.ltrim( localUtil.ntoc( AV60Barcodreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPARF", GXutil.rtrim( AV61Barcodparf));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM_TO2", GXutil.rtrim( AV40BarColNom_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM_TO2", GXutil.ltrim( localUtil.ntoc( AV34BarColNum_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQEST1", GXutil.rtrim( AV62BarMaqEst1));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQEST2", GXutil.rtrim( AV63BarMaqEst2));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIE", GXutil.rtrim( AV55Serie));
      app.GxWebStd.gx_hidden_field( httpContext, "vNFI", GXutil.ltrim( localUtil.ntoc( AV64Nfi, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNFF", GXutil.ltrim( localUtil.ntoc( AV65Nff, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARLAR", GXutil.rtrim( AV56Barlar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDISCODIN", GXutil.rtrim( AV50tipdiscodIN));
      app.GxWebStd.gx_hidden_field( httpContext, "vDETALLEROLLOS", GXutil.ltrim( localUtil.ntoc( AV66DetalleRollos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM_TO", GXutil.rtrim( AV20BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM_TO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarColNom_To, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitemtext", GXutil.rtrim( Combo_clicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Cls", GXutil.rtrim( Combo_clicod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_clicod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Emptyitemtext", GXutil.rtrim( Combo_clicod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDISCOD_Cls", GXutil.rtrim( Combo_tipdiscod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDISCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipdiscod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDISCOD_Emptyitemtext", GXutil.rtrim( Combo_tipdiscod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDISCOD_Selectedvalue_get", GXutil.rtrim( Combo_tipdiscod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_clicod_to_Selectedvalue_get));
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
         we1B92( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1B92( ) ;
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
      return formatLink("app.informealbaranesproduccionww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "InformeAlbaranesProduccionWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Albaranes Producción", "") ;
   }

   public void wb1B90( )
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
         app.GxWebStd.gx_div_start( httpContext, divFiltrocliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_Internalname, httpContext.getMessage( "Codigo Cliente Inicial", ""), "", "", lblTextblockcombo_clicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
         ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
         ucCombo_clicod.setProperty("EmptyItemText", Combo_clicod_Emptyitemtext);
         ucCombo_clicod.setProperty("DropDownOptionsTitleSettingsIcons", AV42DDO_TitleSettingsIcons);
         ucCombo_clicod.setProperty("DropDownOptionsData", AV41CliCod_Data);
         ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_to_Internalname, httpContext.getMessage( "Codigo Cliente Final", ""), "", "", lblTextblockcombo_clicod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod_to.setProperty("Caption", Combo_clicod_to_Caption);
         ucCombo_clicod_to.setProperty("Cls", Combo_clicod_to_Cls);
         ucCombo_clicod_to.setProperty("EmptyItemText", Combo_clicod_to_Emptyitemtext);
         ucCombo_clicod_to.setProperty("DropDownOptionsTitleSettingsIcons", AV42DDO_TitleSettingsIcons);
         ucCombo_clicod_to.setProperty("DropDownOptionsData", AV44CliCod_to_Data);
         ucCombo_clicod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_to_Internalname, "COMBO_CLICOD_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltroalbaran_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_Internalname, localUtil.format(AV8AlbProfch, "99/99/99"), localUtil.format( AV8AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_InformeAlbaranesProduccionWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofch_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_to_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofch_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_to_Internalname, localUtil.format(AV9AlbProfch_to, "99/99/99"), localUtil.format( AV9AlbProfch_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofch_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofch_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofch_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofch_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_InformeAlbaranesProduccionWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltrobarser_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV6BarSer), GXutil.rtrim( localUtil.format( AV6BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_to_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_to_Internalname, GXutil.rtrim( AV7BarSer_to), GXutil.rtrim( localUtil.format( AV7BarSer_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltropedidocliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbenccli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbenccli_Internalname, httpContext.getMessage( "Pedido Cliente Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbenccli_Internalname, GXutil.rtrim( AV35AlbEncCli), GXutil.rtrim( localUtil.format( AV35AlbEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbenccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbenccli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbenccli_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbenccli_to_Internalname, httpContext.getMessage( "Pedido Cliente Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbenccli_to_Internalname, GXutil.rtrim( AV32AlbEncCli_to), GXutil.rtrim( localUtil.format( AV32AlbEncCli_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbenccli_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbenccli_to_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltrocolor_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV18BarColNom), GXutil.rtrim( localUtil.format( AV18BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV19BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBalcolnom_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBalcolnom_to_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBalcolnom_to_Internalname, GXutil.rtrim( AV39BalColNom_to), GXutil.rtrim( localUtil.format( AV39BalColNom_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBalcolnom_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBalcolnom_to_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV21BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21BarColNum_to), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21BarColNum_to), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeAlbaranesProduccionWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divFiltro_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPrio.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPrio.getInternalname(), httpContext.getMessage( "Tipo Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrio, cmbavPrio.getInternalname(), GXutil.rtrim( AV36Prio), 1, cmbavPrio.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrio.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "", true, (byte)(0), "HLP_InformeAlbaranesProduccionWW.htm");
         cmbavPrio.setValue( GXutil.rtrim( AV36Prio) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavReo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavReo.getInternalname(), httpContext.getMessage( "Tipo Produccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavReo, cmbavReo.getInternalname(), GXutil.trim( GXutil.str( AV45Reo, 1, 0)), 1, cmbavReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "", true, (byte)(0), "HLP_InformeAlbaranesProduccionWW.htm");
         cmbavReo.setValue( GXutil.trim( GXutil.str( AV45Reo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavReo.getInternalname(), "Values", cmbavReo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipdiscod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipdiscod_Internalname, httpContext.getMessage( "Tipo Disposicion", ""), "", "", lblTextblockcombo_tipdiscod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipdiscod.setProperty("Caption", Combo_tipdiscod_Caption);
         ucCombo_tipdiscod.setProperty("Cls", Combo_tipdiscod_Cls);
         ucCombo_tipdiscod.setProperty("EmptyItemText", Combo_tipdiscod_Emptyitemtext);
         ucCombo_tipdiscod.setProperty("DropDownOptionsData", AV49Tipdiscod_Data);
         ucCombo_tipdiscod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipdiscod_Internalname, "COMBO_TIPDISCODContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdfwin_Internalname, "", httpContext.getMessage( "Informe Detalle PDF (Win)", ""), bttBtnpdfwin_Jsonclick, 5, httpContext.getMessage( "Informe Detalle PDF (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDFWIN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportardetalle_Internalname, "", httpContext.getMessage( "Exportar (detalle)", ""), bttBtnexportardetalle_Jsonclick, 5, httpContext.getMessage( "Exportar (detalle)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTARDETALLE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdfresumen_Internalname, "", httpContext.getMessage( "Informe Resumen PDF (Win)", ""), bttBtnpdfresumen_Jsonclick, 5, httpContext.getMessage( "Informe Resumen PDF (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDFRESUMEN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionWW.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableuc_datamon_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV71Pgmname), GXutil.rtrim( localUtil.format( AV71Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeAlbaranesProduccionWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV10CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10CliCod_to), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_to_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeAlbaranesProduccionWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdiscod_Internalname, GXutil.rtrim( AV48Tipdiscod), GXutil.rtrim( localUtil.format( AV48Tipdiscod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdiscod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipdiscod_Visible, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1B92( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe Albaranes Producción", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1B90( ) ;
   }

   public void ws1B92( )
   {
      start1B92( ) ;
      evt1B92( ) ;
   }

   public void evt1B92( )
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
                           e111B92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDFWIN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPdfWin' */
                           e121B92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTARDETALLE'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportardetalle' */
                           e131B92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDFRESUMEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPdfResumen' */
                           e141B92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e151B92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e161B92 ();
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

   public void we1B92( )
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

   public void pa1B92( )
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
            GX_FocusControl = edtavAlbprofch_Internalname ;
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
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV36Prio = cmbavPrio.getValidValue(AV36Prio) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Prio", AV36Prio);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrio.setValue( GXutil.rtrim( AV36Prio) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
      }
      if ( cmbavReo.getItemCount() > 0 )
      {
         AV45Reo = (byte)(GXutil.lval( cmbavReo.getValidValue(GXutil.trim( GXutil.str( AV45Reo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Reo", GXutil.str( AV45Reo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavReo.setValue( GXutil.trim( GXutil.str( AV45Reo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavReo.getInternalname(), "Values", cmbavReo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1B92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV71Pgmname = "InformeAlbaranesProduccionWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Pgmname", AV71Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1B92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e161B92 ();
         wb1B90( ) ;
      }
   }

   public void send_integrity_lvl_hashes1B92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM_TO", GXutil.rtrim( AV20BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM_TO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarColNom_To, ""))));
   }

   public void before_start_formulas( )
   {
      AV71Pgmname = "InformeAlbaranesProduccionWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Pgmname", AV71Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1B90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111B92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV42DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV41CliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_TO_DATA"), AV44CliCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPDISCOD_DATA"), AV49Tipdiscod_Data);
         /* Read saved values. */
         Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
         Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
         Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
         Combo_clicod_to_Cls = httpContext.cgiGet( "COMBO_CLICOD_TO_Cls") ;
         Combo_clicod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_TO_Selectedvalue_set") ;
         Combo_clicod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_TO_Emptyitemtext") ;
         Combo_tipdiscod_Cls = httpContext.cgiGet( "COMBO_TIPDISCOD_Cls") ;
         Combo_tipdiscod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPDISCOD_Selectedvalue_set") ;
         Combo_tipdiscod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPDISCOD_Emptyitemtext") ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCH");
            GX_FocusControl = edtavAlbprofch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8AlbProfch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProfch", localUtil.format(AV8AlbProfch, "99/99/99"));
         }
         else
         {
            AV8AlbProfch = localUtil.ctod( httpContext.cgiGet( edtavAlbprofch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProfch", localUtil.format(AV8AlbProfch, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofch_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCH_TO");
            GX_FocusControl = edtavAlbprofch_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9AlbProfch_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProfch_to", localUtil.format(AV9AlbProfch_to, "99/99/99"));
         }
         else
         {
            AV9AlbProfch_to = localUtil.ctod( httpContext.cgiGet( edtavAlbprofch_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProfch_to", localUtil.format(AV9AlbProfch_to, "99/99/99"));
         }
         AV6BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarSer", AV6BarSer);
         AV7BarSer_to = httpContext.cgiGet( edtavBarser_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarSer_to", AV7BarSer_to);
         AV35AlbEncCli = httpContext.cgiGet( edtavAlbenccli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlbEncCli", AV35AlbEncCli);
         AV32AlbEncCli_to = httpContext.cgiGet( edtavAlbenccli_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32AlbEncCli_to", AV32AlbEncCli_to);
         AV18BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarColNom", AV18BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarColNum), 6, 0));
         }
         else
         {
            AV19BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarColNum), 6, 0));
         }
         AV39BalColNom_to = httpContext.cgiGet( edtavBalcolnom_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39BalColNom_to", AV39BalColNom_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM_TO");
            GX_FocusControl = edtavBarcolnum_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21BarColNum_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarColNum_to), 6, 0));
         }
         else
         {
            AV21BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarColNum_to), 6, 0));
         }
         cmbavPrio.setValue( httpContext.cgiGet( cmbavPrio.getInternalname()) );
         AV36Prio = httpContext.cgiGet( cmbavPrio.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Prio", AV36Prio);
         cmbavReo.setValue( httpContext.cgiGet( cmbavReo.getInternalname()) );
         AV45Reo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavReo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Reo", GXutil.str( AV45Reo, 1, 0));
         AV71Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Pgmname", AV71Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
         }
         else
         {
            AV5CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD_TO");
            GX_FocusControl = edtavClicod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10CliCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliCod_to), 6, 0));
         }
         else
         {
            AV10CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliCod_to), 6, 0));
         }
         AV48Tipdiscod = httpContext.cgiGet( edtavTipdiscod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Tipdiscod", AV48Tipdiscod);
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
      e111B92 ();
      if (returnInSub) return;
   }

   public void e111B92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informealbaranesproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      informealbaranesproduccionww_impl.this.AV12EmprCod = GXv_char2[0] ;
      informealbaranesproduccionww_impl.this.AV13EmprNom = GXv_char3[0] ;
      informealbaranesproduccionww_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      edtavTipdiscod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipdiscod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdiscod_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV42DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV42DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
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
      /* Execute user subroutine: 'LOADCOMBOTIPDISCOD' */
      S132 ();
      if (returnInSub) return;
      AV9AlbProfch_to = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProfch_to", localUtil.format(AV9AlbProfch_to, "99/99/99"));
      AV8AlbProfch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProfch", localUtil.format(AV8AlbProfch, "99/99/99"));
      AV45Reo = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Reo", GXutil.str( AV45Reo, 1, 0));
   }

   public void e121B92( )
   {
      /* 'DoPdfWin' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'INICIALIZA VARIABLES' */
      S142 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("app.documentotransporteproduccion.palb003", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV54ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV36Prio)),GXutil.URLEncode(GXutil.ltrimstr(AV5CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliCod_to2,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV8AlbProfch)),GXutil.URLEncode(GXutil.formatDateParm(AV16AlbProfch_to2)),GXutil.URLEncode(GXutil.rtrim(AV6BarSer)),GXutil.URLEncode(GXutil.rtrim(AV17BarSer_to2)),GXutil.URLEncode(GXutil.rtrim(AV35AlbEncCli)),GXutil.URLEncode(GXutil.rtrim(AV33AlbEncCli_to2)),GXutil.URLEncode(GXutil.ltrimstr(AV58Fuente,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59Barcodi,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV60Barcodreof,1,0)),GXutil.URLEncode(GXutil.rtrim(AV61Barcodparf)),GXutil.URLEncode(GXutil.rtrim(AV18BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV40BarColNom_to2)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarColNum_to2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV62BarMaqEst1)),GXutil.URLEncode(GXutil.rtrim(AV63BarMaqEst2)),GXutil.URLEncode(GXutil.rtrim(AV55Serie)),GXutil.URLEncode(GXutil.ltrimstr(AV64Nfi,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV65Nff,6,0)),GXutil.URLEncode(GXutil.rtrim(AV56Barlar)),GXutil.URLEncode(GXutil.rtrim(AV50tipdiscodIN)),GXutil.URLEncode(GXutil.ltrimstr(AV45Reo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66DetalleRollos,4,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(99999999,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(9999,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzz", "")))}, new String[] {"EmprCod","ImpCod","Prio","PCliCod","UCliCod","PFecha","UFecha","PBarSer","UBarSer","PDisNum","UDisNum","Fuente","Barcodi","Barcodreof","Barcodparf","Barcolnomi","Barcolnomf","Barcolnumi","Barcolnumf","BarMaqEst1","BarMaqEst2","Serie","Nfi","Nff","Barlar","Tipdiscod","Barestreo","DetalleRollos","AlbProCod1","Albprocod_to","Bartipart","Bartipart_to","BarAcaQuifrom","BarAcaQuito"}) , new Object[] {"AV12EmprCod","AV54ImpCod","AV36Prio","AV5CliCod","AV15CliCod_to2","AV8AlbProfch","AV16AlbProfch_to2","AV6BarSer","AV17BarSer_to2","AV35AlbEncCli","AV33AlbEncCli_to2","AV58Fuente","AV59Barcodi","AV60Barcodreof","AV61Barcodparf","AV18BarColNom","AV40BarColNom_to2","AV19BarColNum","AV34BarColNum_to2","AV62BarMaqEst1","AV63BarMaqEst2","AV55Serie","AV64Nfi","AV65Nff","AV56Barlar","AV50tipdiscodIN","AV45Reo","AV66DetalleRollos","","","","","",""});
      /*  Sending Event outputs  */
      cmbavReo.setValue( GXutil.trim( GXutil.str( AV45Reo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavReo.getInternalname(), "Values", cmbavReo.ToJavascriptSource(), true);
      cmbavPrio.setValue( GXutil.rtrim( AV36Prio) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
   }

   public void e131B92( )
   {
      /* 'DoExportardetalle' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'INICIALIZA VARIABLES' */
      S142 ();
      if (returnInSub) return;
      GXv_char4[0] = AV12EmprCod ;
      GXv_char3[0] = AV54ImpCod ;
      GXv_char2[0] = AV36Prio ;
      GXv_int7[0] = AV5CliCod ;
      GXv_int8[0] = AV15CliCod_to2 ;
      GXv_date9[0] = AV8AlbProfch ;
      GXv_date10[0] = AV16AlbProfch_to2 ;
      GXv_char11[0] = AV6BarSer ;
      GXv_char12[0] = AV17BarSer_to2 ;
      GXv_char13[0] = AV35AlbEncCli ;
      GXv_char14[0] = AV33AlbEncCli_to2 ;
      GXv_int15[0] = (byte)(AV58Fuente) ;
      GXv_int16[0] = AV59Barcodi ;
      GXv_int17[0] = AV60Barcodreof ;
      GXv_char18[0] = AV61Barcodparf ;
      GXv_char19[0] = AV18BarColNom ;
      GXv_char20[0] = AV40BarColNom_to2 ;
      GXv_int21[0] = AV19BarColNum ;
      GXv_int22[0] = AV34BarColNum_to2 ;
      GXv_char23[0] = AV62BarMaqEst1 ;
      GXv_char24[0] = AV63BarMaqEst2 ;
      GXv_char25[0] = AV55Serie ;
      GXv_int26[0] = AV64Nfi ;
      GXv_int27[0] = AV65Nff ;
      GXv_char28[0] = AV56Barlar ;
      GXv_char29[0] = AV50tipdiscodIN ;
      GXv_int30[0] = AV45Reo ;
      GXv_int31[0] = (byte)(AV66DetalleRollos) ;
      GXv_int32[0] = 0 ;
      GXv_int33[0] = 99999999 ;
      GXv_int34[0] = (short)(0) ;
      GXv_int35[0] = (short)(9999) ;
      GXv_char36[0] = " " ;
      GXv_char37[0] = httpContext.getMessage( "zzzzzz", "") ;
      GXv_char38[0] = AV67ExcelFilename ;
      GXv_char39[0] = AV68ErrorMessage ;
      new app.documentotransporteproduccion.export_palb003(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int7, GXv_int8, GXv_date9, GXv_date10, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_int16, GXv_int17, GXv_char18, GXv_char19, GXv_char20, GXv_int21, GXv_int22, GXv_char23, GXv_char24, GXv_char25, GXv_int26, GXv_int27, GXv_char28, GXv_char29, GXv_int30, GXv_int31, GXv_int32, GXv_int33, GXv_int34, GXv_int35, GXv_char36, GXv_char37, GXv_char38, GXv_char39) ;
      informealbaranesproduccionww_impl.this.AV12EmprCod = GXv_char4[0] ;
      informealbaranesproduccionww_impl.this.AV54ImpCod = GXv_char3[0] ;
      informealbaranesproduccionww_impl.this.AV36Prio = GXv_char2[0] ;
      informealbaranesproduccionww_impl.this.AV5CliCod = GXv_int7[0] ;
      informealbaranesproduccionww_impl.this.AV15CliCod_to2 = GXv_int8[0] ;
      informealbaranesproduccionww_impl.this.AV8AlbProfch = GXv_date9[0] ;
      informealbaranesproduccionww_impl.this.AV16AlbProfch_to2 = GXv_date10[0] ;
      informealbaranesproduccionww_impl.this.AV6BarSer = GXv_char11[0] ;
      informealbaranesproduccionww_impl.this.AV17BarSer_to2 = GXv_char12[0] ;
      informealbaranesproduccionww_impl.this.AV35AlbEncCli = GXv_char13[0] ;
      informealbaranesproduccionww_impl.this.AV33AlbEncCli_to2 = GXv_char14[0] ;
      informealbaranesproduccionww_impl.this.AV58Fuente = GXv_int15[0] ;
      informealbaranesproduccionww_impl.this.AV59Barcodi = GXv_int16[0] ;
      informealbaranesproduccionww_impl.this.AV60Barcodreof = GXv_int17[0] ;
      informealbaranesproduccionww_impl.this.AV61Barcodparf = GXv_char18[0] ;
      informealbaranesproduccionww_impl.this.AV18BarColNom = GXv_char19[0] ;
      informealbaranesproduccionww_impl.this.AV40BarColNom_to2 = GXv_char20[0] ;
      informealbaranesproduccionww_impl.this.AV19BarColNum = GXv_int21[0] ;
      informealbaranesproduccionww_impl.this.AV34BarColNum_to2 = GXv_int22[0] ;
      informealbaranesproduccionww_impl.this.AV62BarMaqEst1 = GXv_char23[0] ;
      informealbaranesproduccionww_impl.this.AV63BarMaqEst2 = GXv_char24[0] ;
      informealbaranesproduccionww_impl.this.AV55Serie = GXv_char25[0] ;
      informealbaranesproduccionww_impl.this.AV64Nfi = GXv_int26[0] ;
      informealbaranesproduccionww_impl.this.AV65Nff = GXv_int27[0] ;
      informealbaranesproduccionww_impl.this.AV56Barlar = GXv_char28[0] ;
      informealbaranesproduccionww_impl.this.AV50tipdiscodIN = GXv_char29[0] ;
      informealbaranesproduccionww_impl.this.AV45Reo = GXv_int30[0] ;
      informealbaranesproduccionww_impl.this.AV66DetalleRollos = GXv_int31[0] ;
      informealbaranesproduccionww_impl.this.AV67ExcelFilename = GXv_char38[0] ;
      informealbaranesproduccionww_impl.this.AV68ErrorMessage = GXv_char39[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV54ImpCod", AV54ImpCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV36Prio", AV36Prio);
      httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15CliCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod_to2), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProfch", localUtil.format(AV8AlbProfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV16AlbProfch_to2", localUtil.format(AV16AlbProfch_to2, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarSer", AV6BarSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarSer_to2", AV17BarSer_to2);
      httpContext.ajax_rsp_assign_attri("", false, "AV35AlbEncCli", AV35AlbEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "AV33AlbEncCli_to2", AV33AlbEncCli_to2);
      httpContext.ajax_rsp_assign_attri("", false, "AV58Fuente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Fuente), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV59Barcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Barcodi), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV60Barcodreof", GXutil.str( AV60Barcodreof, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV61Barcodparf", AV61Barcodparf);
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarColNom", AV18BarColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarColNom_to2", AV40BarColNom_to2);
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarColNum_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarColNum_to2), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV62BarMaqEst1", AV62BarMaqEst1);
      httpContext.ajax_rsp_assign_attri("", false, "AV63BarMaqEst2", AV63BarMaqEst2);
      httpContext.ajax_rsp_assign_attri("", false, "AV55Serie", AV55Serie);
      httpContext.ajax_rsp_assign_attri("", false, "AV64Nfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Nfi), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV65Nff", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Nff), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV56Barlar", AV56Barlar);
      httpContext.ajax_rsp_assign_attri("", false, "AV50tipdiscodIN", AV50tipdiscodIN);
      httpContext.ajax_rsp_assign_attri("", false, "AV45Reo", GXutil.str( AV45Reo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV66DetalleRollos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66DetalleRollos), 4, 0));
      if ( GXutil.strcmp(AV67ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV67ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV68ErrorMessage);
      }
      /*  Sending Event outputs  */
      cmbavReo.setValue( GXutil.trim( GXutil.str( AV45Reo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavReo.getInternalname(), "Values", cmbavReo.ToJavascriptSource(), true);
      cmbavPrio.setValue( GXutil.rtrim( AV36Prio) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
   }

   public void e141B92( )
   {
      /* 'DoPdfResumen' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'INICIALIZA VARIABLES' */
      S142 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("app.palb005", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV54ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV36Prio)),GXutil.URLEncode(GXutil.ltrimstr(AV5CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliCod_to2,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV8AlbProfch)),GXutil.URLEncode(GXutil.formatDateParm(AV16AlbProfch_to2)),GXutil.URLEncode(GXutil.rtrim(AV6BarSer)),GXutil.URLEncode(GXutil.rtrim(AV17BarSer_to2)),GXutil.URLEncode(GXutil.rtrim(AV35AlbEncCli)),GXutil.URLEncode(GXutil.rtrim(AV33AlbEncCli_to2)),GXutil.URLEncode(GXutil.ltrimstr(AV58Fuente,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59Barcodi,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV60Barcodreof,1,0)),GXutil.URLEncode(GXutil.rtrim(AV61Barcodparf)),GXutil.URLEncode(GXutil.rtrim(AV18BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV40BarColNom_to2)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarColNum_to2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV62BarMaqEst1)),GXutil.URLEncode(GXutil.rtrim(AV63BarMaqEst2)),GXutil.URLEncode(GXutil.rtrim(AV55Serie)),GXutil.URLEncode(GXutil.ltrimstr(AV64Nfi,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV65Nff,6,0)),GXutil.URLEncode(GXutil.rtrim(AV56Barlar)),GXutil.URLEncode(GXutil.rtrim(AV50tipdiscodIN)),GXutil.URLEncode(GXutil.ltrimstr(AV45Reo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66DetalleRollos,4,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(99999999,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(9999,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzz", "")))}, new String[] {"EmprCod","ImpCod","Prio","PCliCod","UCliCod","PFecha","UFecha","PBarSer","UBarSer","PDisNum","UDisNum","Fuente","Barcodi","Barcodreof","Barcodparf","Barcolnomi","Barcolnomf","Barcolnumi","Barcolnumf","BarMaqEst1","BarMaqEst2","Serie","Nfi","Nff","Barlar","Tipdiscod","Barestreo","DetalleRollos","AlbProCod1","Albprocod_to","Bartipart","Bartipart_to","BarAcaQuifrom","BarAcaQuito"}) , new Object[] {"AV12EmprCod","AV54ImpCod","AV36Prio","AV5CliCod","AV15CliCod_to2","AV8AlbProfch","AV16AlbProfch_to2","AV6BarSer","AV17BarSer_to2","AV35AlbEncCli","AV33AlbEncCli_to2","AV58Fuente","AV59Barcodi","AV60Barcodreof","AV61Barcodparf","AV18BarColNom","AV40BarColNom_to2","AV19BarColNum","AV34BarColNum_to2","AV62BarMaqEst1","AV63BarMaqEst2","AV55Serie","AV64Nfi","AV65Nff","AV56Barlar","AV50tipdiscodIN","AV45Reo","AV66DetalleRollos","","","","","",""});
      /*  Sending Event outputs  */
      cmbavReo.setValue( GXutil.trim( GXutil.str( AV45Reo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavReo.getInternalname(), "Values", cmbavReo.ToJavascriptSource(), true);
      cmbavPrio.setValue( GXutil.rtrim( AV36Prio) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
   }

   public void e151B92( )
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

   public void S132( )
   {
      /* 'LOADCOMBOTIPDISCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01B92 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13845TipDisDscI = H01B92_A13845TipDisDscI[0] ;
         A5098TipDisCod = H01B92_A5098TipDisCod[0] ;
         A5097TipDisDsc = H01B92_A5097TipDisDsc[0] ;
         n5097TipDisDsc = H01B92_n5097TipDisDsc[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A5098TipDisCod );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13845TipDisDscI );
         AV49Tipdiscod_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_tipdiscod_Selectedvalue_set = AV48Tipdiscod ;
      ucCombo_tipdiscod.sendProperty(context, "", false, Combo_tipdiscod_Internalname, "SelectedValue_set", Combo_tipdiscod_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICOD_TO' Routine */
      returnInSub = false ;
      AV44CliCod_to_Data.clear();
      /* Using cursor H01B93 */
      pr_default.execute(1, new Object[] {AV12EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H01B93_A10045CliAct[0] ;
         A396EmprCod = H01B93_A396EmprCod[0] ;
         A252CliCod = H01B93_A252CliCod[0] ;
         A279CliNom = H01B93_A279CliNom[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
         AV44CliCod_to_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV44CliCod_to_Data.sort("Title");
      Combo_clicod_to_Selectedvalue_set = ((0==AV10CliCod_to) ? "" : GXutil.trim( GXutil.str( AV10CliCod_to, 6, 0))) ;
      ucCombo_clicod_to.sendProperty(context, "", false, Combo_clicod_to_Internalname, "SelectedValue_set", Combo_clicod_to_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      AV41CliCod_Data.clear();
      /* Using cursor H01B94 */
      pr_default.execute(2, new Object[] {AV12EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H01B94_A10045CliAct[0] ;
         A396EmprCod = H01B94_A396EmprCod[0] ;
         A252CliCod = H01B94_A252CliCod[0] ;
         A279CliNom = H01B94_A279CliNom[0] ;
         AV43Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV43Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
         AV41CliCod_Data.add(AV43Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV41CliCod_Data.sort("Title");
      Combo_clicod_Selectedvalue_set = ((0==AV5CliCod) ? "" : GXutil.trim( GXutil.str( AV5CliCod, 6, 0))) ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'INICIALIZA VARIABLES' Routine */
      returnInSub = false ;
      AV15CliCod_to2 = ((0==AV10CliCod_to) ? 999999 : AV10CliCod_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CliCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod_to2), 6, 0));
      AV16AlbProfch_to2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9AlbProfch_to)) ? GXutil.serverDate( context, remoteHandle, pr_default) : AV9AlbProfch_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16AlbProfch_to2", localUtil.format(AV16AlbProfch_to2, "99/99/99"));
      AV17BarSer_to2 = ((GXutil.strcmp("", AV7BarSer_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV7BarSer_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarSer_to2", AV17BarSer_to2);
      AV33AlbEncCli_to2 = ((GXutil.strcmp("", AV32AlbEncCli_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzzzzzz", "") : AV32AlbEncCli_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33AlbEncCli_to2", AV33AlbEncCli_to2);
      AV40BarColNom_to2 = ((GXutil.strcmp("", AV20BarColNom_To)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV20BarColNom_To) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarColNom_to2", AV40BarColNom_to2);
      AV34BarColNum_to2 = ((0==AV21BarColNum_to) ? 999999 : AV21BarColNum_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarColNum_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarColNum_to2), 6, 0));
      AV46Barestreoi = (byte)(0) ;
      AV47BarEstreof = (byte)(2) ;
      if ( AV45Reo == 2 )
      {
         AV46Barestreoi = (byte)(2) ;
         AV47BarEstreof = (byte)(2) ;
      }
      if ( AV45Reo == 0 )
      {
         AV46Barestreoi = (byte)(0) ;
         AV47BarEstreof = (byte)(1) ;
      }
      AV50tipdiscodIN = ((GXutil.strcmp("", AV48Tipdiscod)==0) ? "*" : AV48Tipdiscod) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50tipdiscodIN", AV50tipdiscodIN);
   }

   protected void nextLoad( )
   {
   }

   protected void e161B92( )
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
      pa1B92( ) ;
      ws1B92( ) ;
      we1B92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714191972", true, true);
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
      httpContext.AddJavascriptSource("informealbaranesproduccionww.js", "?202681714191973", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      divFiltrocliente_Internalname = "FILTROCLIENTE" ;
      edtavAlbprofch_Internalname = "vALBPROFCH" ;
      edtavAlbprofch_to_Internalname = "vALBPROFCH_TO" ;
      divFiltroalbaran_Internalname = "FILTROALBARAN" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarser_to_Internalname = "vBARSER_TO" ;
      divFiltrobarser_Internalname = "FILTROBARSER" ;
      edtavAlbenccli_Internalname = "vALBENCCLI" ;
      edtavAlbenccli_to_Internalname = "vALBENCCLI_TO" ;
      divFiltropedidocliente_Internalname = "FILTROPEDIDOCLIENTE" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBalcolnom_to_Internalname = "vBALCOLNOM_TO" ;
      edtavBarcolnum_to_Internalname = "vBARCOLNUM_TO" ;
      divFiltrocolor_Internalname = "FILTROCOLOR" ;
      cmbavPrio.setInternalname( "vPRIO" );
      cmbavReo.setInternalname( "vREO" );
      lblTextblockcombo_tipdiscod_Internalname = "TEXTBLOCKCOMBO_TIPDISCOD" ;
      Combo_tipdiscod_Internalname = "COMBO_TIPDISCOD" ;
      divTablesplittedtipdiscod_Internalname = "TABLESPLITTEDTIPDISCOD" ;
      divFiltro_Internalname = "FILTRO" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnpdfwin_Internalname = "BTNPDFWIN" ;
      bttBtnexportardetalle_Internalname = "BTNEXPORTARDETALLE" ;
      bttBtnpdfresumen_Internalname = "BTNPDFRESUMEN" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Datamon_Internalname = "DATAMON" ;
      divTableuc_datamon_Internalname = "TABLEUC_DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClicod_to_Internalname = "vCLICOD_TO" ;
      edtavTipdiscod_Internalname = "vTIPDISCOD" ;
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
      edtavTipdiscod_Jsonclick = "" ;
      edtavTipdiscod_Visible = 1 ;
      edtavClicod_to_Jsonclick = "" ;
      edtavClicod_to_Visible = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavReo.setJsonclick( "" );
      cmbavReo.setEnabled( 1 );
      cmbavPrio.setJsonclick( "" );
      cmbavPrio.setEnabled( 1 );
      edtavBarcolnum_to_Jsonclick = "" ;
      edtavBarcolnum_to_Enabled = 1 ;
      edtavBalcolnom_to_Jsonclick = "" ;
      edtavBalcolnom_to_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavAlbenccli_to_Jsonclick = "" ;
      edtavAlbenccli_to_Enabled = 1 ;
      edtavAlbenccli_Jsonclick = "" ;
      edtavAlbenccli_Enabled = 1 ;
      edtavBarser_to_Jsonclick = "" ;
      edtavBarser_to_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavAlbprofch_to_Jsonclick = "" ;
      edtavAlbprofch_to_Enabled = 1 ;
      edtavAlbprofch_Jsonclick = "" ;
      edtavAlbprofch_Enabled = 1 ;
      Combo_clicod_to_Caption = "" ;
      Combo_clicod_Caption = "" ;
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
      Combo_tipdiscod_Emptyitemtext = "Todos" ;
      Combo_tipdiscod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_to_Emptyitemtext = "Todos" ;
      Combo_clicod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Emptyitemtext = "Todos" ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe Albaranes Producción", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPrio.setName( "vPRIO" );
      cmbavPrio.setWebtags( "" );
      cmbavPrio.addItem("1", httpContext.getMessage( "Guias Remessa", ""), (short)(0));
      cmbavPrio.addItem("2", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavPrio.addItem("0", httpContext.getMessage( "Guias Transporte sem encargos", ""), (short)(0));
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV36Prio = cmbavPrio.getValidValue(AV36Prio) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Prio", AV36Prio);
      }
      cmbavReo.setName( "vREO" );
      cmbavReo.setWebtags( "" );
      cmbavReo.addItem("9", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavReo.addItem("2", httpContext.getMessage( "Reclamaciones", ""), (short)(0));
      cmbavReo.addItem("0", httpContext.getMessage( "Produccion Normal", ""), (short)(0));
      if ( cmbavReo.getItemCount() > 0 )
      {
         AV45Reo = (byte)(GXutil.lval( cmbavReo.getValidValue(GXutil.trim( GXutil.str( AV45Reo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Reo", GXutil.str( AV45Reo, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV20BarColNom_To',fld:'vBARCOLNOM_TO',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOPDFWIN'","{handler:'e121B92',iparms:[{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54ImpCod',fld:'vIMPCOD',pic:''},{av:'cmbavPrio'},{av:'AV36Prio',fld:'vPRIO',pic:''},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV8AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV16AlbProfch_to2',fld:'vALBPROFCH_TO2',pic:''},{av:'AV6BarSer',fld:'vBARSER',pic:''},{av:'AV17BarSer_to2',fld:'vBARSER_TO2',pic:''},{av:'AV35AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV33AlbEncCli_to2',fld:'vALBENCCLI_TO2',pic:''},{av:'AV58Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV59Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV60Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV61Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV18BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV40BarColNom_to2',fld:'vBARCOLNOM_TO2',pic:''},{av:'AV19BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34BarColNum_to2',fld:'vBARCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV62BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV63BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV55Serie',fld:'vSERIE',pic:''},{av:'AV64Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV65Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV56Barlar',fld:'vBARLAR',pic:''},{av:'AV50tipdiscodIN',fld:'vTIPDISCODIN',pic:''},{av:'cmbavReo'},{av:'AV45Reo',fld:'vREO',pic:'9'},{av:'AV66DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'},{av:'AV10CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV9AlbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV7BarSer_to',fld:'vBARSER_TO',pic:''},{av:'AV32AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV20BarColNom_To',fld:'vBARCOLNOM_TO',pic:'',hsh:true},{av:'AV21BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV48Tipdiscod',fld:'vTIPDISCOD',pic:''}]");
      setEventMetadata("'DOPDFWIN'",",oparms:[{av:'AV66DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'},{av:'cmbavReo'},{av:'AV45Reo',fld:'vREO',pic:'9'},{av:'AV50tipdiscodIN',fld:'vTIPDISCODIN',pic:''},{av:'AV56Barlar',fld:'vBARLAR',pic:''},{av:'AV65Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV64Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV55Serie',fld:'vSERIE',pic:''},{av:'AV63BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV62BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV34BarColNum_to2',fld:'vBARCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV19BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarColNom_to2',fld:'vBARCOLNOM_TO2',pic:''},{av:'AV18BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV61Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV60Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV59Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV58Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV33AlbEncCli_to2',fld:'vALBENCCLI_TO2',pic:''},{av:'AV35AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV17BarSer_to2',fld:'vBARSER_TO2',pic:''},{av:'AV6BarSer',fld:'vBARSER',pic:''},{av:'AV16AlbProfch_to2',fld:'vALBPROFCH_TO2',pic:''},{av:'AV8AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV15CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'cmbavPrio'},{av:'AV36Prio',fld:'vPRIO',pic:''},{av:'AV54ImpCod',fld:'vIMPCOD',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORTARDETALLE'","{handler:'e131B92',iparms:[{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54ImpCod',fld:'vIMPCOD',pic:''},{av:'cmbavPrio'},{av:'AV36Prio',fld:'vPRIO',pic:''},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV8AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV16AlbProfch_to2',fld:'vALBPROFCH_TO2',pic:''},{av:'AV6BarSer',fld:'vBARSER',pic:''},{av:'AV17BarSer_to2',fld:'vBARSER_TO2',pic:''},{av:'AV35AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV33AlbEncCli_to2',fld:'vALBENCCLI_TO2',pic:''},{av:'AV58Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV59Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV60Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV61Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV18BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV40BarColNom_to2',fld:'vBARCOLNOM_TO2',pic:''},{av:'AV19BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34BarColNum_to2',fld:'vBARCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV62BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV63BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV55Serie',fld:'vSERIE',pic:''},{av:'AV64Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV65Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV56Barlar',fld:'vBARLAR',pic:''},{av:'AV50tipdiscodIN',fld:'vTIPDISCODIN',pic:''},{av:'cmbavReo'},{av:'AV45Reo',fld:'vREO',pic:'9'},{av:'AV66DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'},{av:'AV10CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV9AlbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV7BarSer_to',fld:'vBARSER_TO',pic:''},{av:'AV32AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV20BarColNom_To',fld:'vBARCOLNOM_TO',pic:'',hsh:true},{av:'AV21BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV48Tipdiscod',fld:'vTIPDISCOD',pic:''}]");
      setEventMetadata("'DOEXPORTARDETALLE'",",oparms:[{av:'AV66DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'},{av:'cmbavReo'},{av:'AV45Reo',fld:'vREO',pic:'9'},{av:'AV50tipdiscodIN',fld:'vTIPDISCODIN',pic:''},{av:'AV56Barlar',fld:'vBARLAR',pic:''},{av:'AV65Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV64Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV55Serie',fld:'vSERIE',pic:''},{av:'AV63BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV62BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV34BarColNum_to2',fld:'vBARCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV19BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarColNom_to2',fld:'vBARCOLNOM_TO2',pic:''},{av:'AV18BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV61Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV60Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV59Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV58Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV33AlbEncCli_to2',fld:'vALBENCCLI_TO2',pic:''},{av:'AV35AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV17BarSer_to2',fld:'vBARSER_TO2',pic:''},{av:'AV6BarSer',fld:'vBARSER',pic:''},{av:'AV16AlbProfch_to2',fld:'vALBPROFCH_TO2',pic:''},{av:'AV8AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV15CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'cmbavPrio'},{av:'AV36Prio',fld:'vPRIO',pic:''},{av:'AV54ImpCod',fld:'vIMPCOD',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPDFRESUMEN'","{handler:'e141B92',iparms:[{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54ImpCod',fld:'vIMPCOD',pic:''},{av:'cmbavPrio'},{av:'AV36Prio',fld:'vPRIO',pic:''},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV8AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV16AlbProfch_to2',fld:'vALBPROFCH_TO2',pic:''},{av:'AV6BarSer',fld:'vBARSER',pic:''},{av:'AV17BarSer_to2',fld:'vBARSER_TO2',pic:''},{av:'AV35AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV33AlbEncCli_to2',fld:'vALBENCCLI_TO2',pic:''},{av:'AV58Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV59Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV60Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV61Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV18BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV40BarColNom_to2',fld:'vBARCOLNOM_TO2',pic:''},{av:'AV19BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34BarColNum_to2',fld:'vBARCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV62BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV63BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV55Serie',fld:'vSERIE',pic:''},{av:'AV64Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV65Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV56Barlar',fld:'vBARLAR',pic:''},{av:'AV50tipdiscodIN',fld:'vTIPDISCODIN',pic:''},{av:'cmbavReo'},{av:'AV45Reo',fld:'vREO',pic:'9'},{av:'AV66DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'},{av:'AV10CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV9AlbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV7BarSer_to',fld:'vBARSER_TO',pic:''},{av:'AV32AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV20BarColNom_To',fld:'vBARCOLNOM_TO',pic:'',hsh:true},{av:'AV21BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV48Tipdiscod',fld:'vTIPDISCOD',pic:''}]");
      setEventMetadata("'DOPDFRESUMEN'",",oparms:[{av:'AV66DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'},{av:'cmbavReo'},{av:'AV45Reo',fld:'vREO',pic:'9'},{av:'AV50tipdiscodIN',fld:'vTIPDISCODIN',pic:''},{av:'AV56Barlar',fld:'vBARLAR',pic:''},{av:'AV65Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV64Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV55Serie',fld:'vSERIE',pic:''},{av:'AV63BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV62BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV34BarColNum_to2',fld:'vBARCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV19BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40BarColNom_to2',fld:'vBARCOLNOM_TO2',pic:''},{av:'AV18BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV61Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV60Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV59Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV58Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV33AlbEncCli_to2',fld:'vALBENCCLI_TO2',pic:''},{av:'AV35AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV17BarSer_to2',fld:'vBARSER_TO2',pic:''},{av:'AV6BarSer',fld:'vBARSER',pic:''},{av:'AV16AlbProfch_to2',fld:'vALBPROFCH_TO2',pic:''},{av:'AV8AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV15CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'cmbavPrio'},{av:'AV36Prio',fld:'vPRIO',pic:''},{av:'AV54ImpCod',fld:'vIMPCOD',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e151B92',iparms:[]");
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
      Combo_tipdiscod_Selectedvalue_get = "" ;
      Combo_clicod_to_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV20BarColNom_To = "" ;
      GXKey = "" ;
      AV42DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV41CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV44CliCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49Tipdiscod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV12EmprCod = "" ;
      AV54ImpCod = "" ;
      AV16AlbProfch_to2 = GXutil.nullDate() ;
      AV17BarSer_to2 = "" ;
      AV33AlbEncCli_to2 = "" ;
      AV61Barcodparf = "" ;
      AV40BarColNom_to2 = "" ;
      AV62BarMaqEst1 = "" ;
      AV63BarMaqEst2 = "" ;
      AV55Serie = "" ;
      AV56Barlar = "" ;
      AV50tipdiscodIN = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_to_Selectedvalue_set = "" ;
      Combo_tipdiscod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_to_Jsonclick = "" ;
      ucCombo_clicod_to = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV8AlbProfch = GXutil.nullDate() ;
      AV9AlbProfch_to = GXutil.nullDate() ;
      AV6BarSer = "" ;
      AV7BarSer_to = "" ;
      AV35AlbEncCli = "" ;
      AV32AlbEncCli_to = "" ;
      AV18BarColNom = "" ;
      AV39BalColNom_to = "" ;
      AV36Prio = "" ;
      lblTextblockcombo_tipdiscod_Jsonclick = "" ;
      ucCombo_tipdiscod = new com.genexus.webpanels.GXUserControl();
      Combo_tipdiscod_Caption = "" ;
      bttBtnpdfwin_Jsonclick = "" ;
      bttBtnexportardetalle_Jsonclick = "" ;
      bttBtnpdfresumen_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV71Pgmname = "" ;
      AV48Tipdiscod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV11Station = "" ;
      GXt_char1 = "" ;
      AV13EmprNom = "" ;
      AV14UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int16 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_int22 = new int[1] ;
      GXv_char23 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_char25 = new String[1] ;
      GXv_int26 = new int[1] ;
      GXv_int27 = new int[1] ;
      GXv_char28 = new String[1] ;
      GXv_char29 = new String[1] ;
      GXv_int30 = new byte[1] ;
      GXv_int31 = new byte[1] ;
      GXv_int32 = new long[1] ;
      GXv_int33 = new long[1] ;
      GXv_int34 = new short[1] ;
      GXv_int35 = new short[1] ;
      GXv_char36 = new String[1] ;
      GXv_char37 = new String[1] ;
      AV67ExcelFilename = "" ;
      GXv_char38 = new String[1] ;
      AV68ErrorMessage = "" ;
      GXv_char39 = new String[1] ;
      scmdbuf = "" ;
      H01B92_A396EmprCod = new String[] {""} ;
      H01B92_A13845TipDisDscI = new String[] {""} ;
      H01B92_A5098TipDisCod = new String[] {""} ;
      H01B92_A5097TipDisDsc = new String[] {""} ;
      H01B92_n5097TipDisDsc = new boolean[] {false} ;
      A13845TipDisDscI = "" ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      AV43Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01B93_A10045CliAct = new String[] {""} ;
      H01B93_A396EmprCod = new String[] {""} ;
      H01B93_A252CliCod = new int[1] ;
      H01B93_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      H01B94_A10045CliAct = new String[] {""} ;
      H01B94_A396EmprCod = new String[] {""} ;
      H01B94_A252CliCod = new int[1] ;
      H01B94_A279CliNom = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informealbaranesproduccionww__default(),
         new Object[] {
             new Object[] {
            H01B92_A396EmprCod, H01B92_A13845TipDisDscI, H01B92_A5098TipDisCod, H01B92_A5097TipDisDsc, H01B92_n5097TipDisDsc
            }
            , new Object[] {
            H01B93_A10045CliAct, H01B93_A396EmprCod, H01B93_A252CliCod, H01B93_A279CliNom
            }
            , new Object[] {
            H01B94_A10045CliAct, H01B94_A396EmprCod, H01B94_A252CliCod, H01B94_A279CliNom
            }
         }
      );
      AV71Pgmname = "InformeAlbaranesProduccionWW" ;
      /* GeneXus formulas. */
      AV71Pgmname = "InformeAlbaranesProduccionWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV60Barcodreof ;
   private byte AV45Reo ;
   private byte nDonePA ;
   private byte GXv_int15[] ;
   private byte GXv_int17[] ;
   private byte GXv_int30[] ;
   private byte GXv_int31[] ;
   private byte AV46Barestreoi ;
   private byte AV47BarEstreof ;
   private byte nGXWrapped ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV58Fuente ;
   private short AV66DetalleRollos ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int34[] ;
   private short GXv_int35[] ;
   private int AV15CliCod_to2 ;
   private int AV59Barcodi ;
   private int AV34BarColNum_to2 ;
   private int AV64Nfi ;
   private int AV65Nff ;
   private int edtavAlbprofch_Enabled ;
   private int edtavAlbprofch_to_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarser_to_Enabled ;
   private int edtavAlbenccli_Enabled ;
   private int edtavAlbenccli_to_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV19BarColNum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBalcolnom_to_Enabled ;
   private int AV21BarColNum_to ;
   private int edtavBarcolnum_to_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV5CliCod ;
   private int edtavClicod_Visible ;
   private int AV10CliCod_to ;
   private int edtavClicod_to_Visible ;
   private int edtavTipdiscod_Visible ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int16[] ;
   private int GXv_int21[] ;
   private int GXv_int22[] ;
   private int GXv_int26[] ;
   private int GXv_int27[] ;
   private int A252CliCod ;
   private int idxLst ;
   private long GXv_int32[] ;
   private long GXv_int33[] ;
   private String Combo_tipdiscod_Selectedvalue_get ;
   private String Combo_clicod_to_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV20BarColNom_To ;
   private String GXKey ;
   private String AV12EmprCod ;
   private String AV54ImpCod ;
   private String AV17BarSer_to2 ;
   private String AV33AlbEncCli_to2 ;
   private String AV61Barcodparf ;
   private String AV40BarColNom_to2 ;
   private String AV62BarMaqEst1 ;
   private String AV63BarMaqEst2 ;
   private String AV55Serie ;
   private String AV56Barlar ;
   private String AV50tipdiscodIN ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_to_Cls ;
   private String Combo_clicod_to_Selectedvalue_set ;
   private String Combo_clicod_to_Emptyitemtext ;
   private String Combo_tipdiscod_Cls ;
   private String Combo_tipdiscod_Selectedvalue_set ;
   private String Combo_tipdiscod_Emptyitemtext ;
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
   private String divFiltrocliente_Internalname ;
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
   private String divFiltroalbaran_Internalname ;
   private String edtavAlbprofch_Internalname ;
   private String TempTags ;
   private String edtavAlbprofch_Jsonclick ;
   private String edtavAlbprofch_to_Internalname ;
   private String edtavAlbprofch_to_Jsonclick ;
   private String divFiltrobarser_Internalname ;
   private String edtavBarser_Internalname ;
   private String AV6BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarser_to_Internalname ;
   private String AV7BarSer_to ;
   private String edtavBarser_to_Jsonclick ;
   private String divFiltropedidocliente_Internalname ;
   private String edtavAlbenccli_Internalname ;
   private String AV35AlbEncCli ;
   private String edtavAlbenccli_Jsonclick ;
   private String edtavAlbenccli_to_Internalname ;
   private String AV32AlbEncCli_to ;
   private String edtavAlbenccli_to_Jsonclick ;
   private String divFiltrocolor_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String AV18BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBalcolnom_to_Internalname ;
   private String AV39BalColNom_to ;
   private String edtavBalcolnom_to_Jsonclick ;
   private String edtavBarcolnum_to_Internalname ;
   private String edtavBarcolnum_to_Jsonclick ;
   private String divFiltro_Internalname ;
   private String AV36Prio ;
   private String divTablesplittedtipdiscod_Internalname ;
   private String lblTextblockcombo_tipdiscod_Internalname ;
   private String lblTextblockcombo_tipdiscod_Jsonclick ;
   private String Combo_tipdiscod_Caption ;
   private String Combo_tipdiscod_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnpdfwin_Internalname ;
   private String bttBtnpdfwin_Jsonclick ;
   private String bttBtnexportardetalle_Internalname ;
   private String bttBtnexportardetalle_Jsonclick ;
   private String bttBtnpdfresumen_Internalname ;
   private String bttBtnpdfresumen_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String divTableuc_datamon_Internalname ;
   private String Datamon_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV71Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClicod_to_Internalname ;
   private String edtavClicod_to_Jsonclick ;
   private String edtavTipdiscod_Internalname ;
   private String AV48Tipdiscod ;
   private String edtavTipdiscod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV11Station ;
   private String GXt_char1 ;
   private String AV13EmprNom ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char23[] ;
   private String GXv_char24[] ;
   private String GXv_char25[] ;
   private String GXv_char28[] ;
   private String GXv_char29[] ;
   private String GXv_char36[] ;
   private String GXv_char37[] ;
   private String GXv_char38[] ;
   private String GXv_char39[] ;
   private String scmdbuf ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private java.util.Date AV16AlbProfch_to2 ;
   private java.util.Date AV8AlbProfch ;
   private java.util.Date AV9AlbProfch_to ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
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
   private boolean n5097TipDisDsc ;
   private String AV67ExcelFilename ;
   private String AV68ErrorMessage ;
   private String A13845TipDisDscI ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipdiscod ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private HTMLChoice cmbavPrio ;
   private HTMLChoice cmbavReo ;
   private IDataStoreProvider pr_default ;
   private String[] H01B92_A396EmprCod ;
   private String[] H01B92_A13845TipDisDscI ;
   private String[] H01B92_A5098TipDisCod ;
   private String[] H01B92_A5097TipDisDsc ;
   private boolean[] H01B92_n5097TipDisDsc ;
   private String[] H01B93_A10045CliAct ;
   private String[] H01B93_A396EmprCod ;
   private int[] H01B93_A252CliCod ;
   private String[] H01B93_A279CliNom ;
   private String[] H01B94_A10045CliAct ;
   private String[] H01B94_A396EmprCod ;
   private int[] H01B94_A252CliCod ;
   private String[] H01B94_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV41CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV44CliCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV49Tipdiscod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV43Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV42DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class informealbaranesproduccionww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01B92", "SELECT EmprCod, RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, TipDisCod, TipDisDsc FROM TXPTIPDIS ORDER BY TipDisDscI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01B93", "SELECT CliAct, EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01B94", "SELECT CliAct, EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

