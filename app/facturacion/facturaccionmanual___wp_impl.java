package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class facturaccionmanual___wp_impl extends GXDataArea
{
   public facturaccionmanual___wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public facturaccionmanual___wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturaccionmanual___wp_impl.class ));
   }

   public facturaccionmanual___wp_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipalb = new HTMLChoice();
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
      pa20C2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start20C2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.facturaccionmanual___wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT", getSecureSignedToken( "", AV37Documentos_Produccion_Comercial_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMFAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29numFac), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"FacturaccionManual___WP");
      forbiddenHiddens.add("PRIO", GXutil.rtrim( localUtil.format( AV11PRIO, "9")));
      forbiddenHiddens.add("FacFchlast", localUtil.format(AV15FacFchlast, "99/99/99"));
      forbiddenHiddens.add("FacHor", localUtil.format( AV13FacHor, "99/99/99 99:99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\facturaccionmanual___wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV20CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV20CliCodfrom_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPRI", GXutil.rtrim( A297CliPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV9FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCIF", GXutil.rtrim( A395EmprCif));
      app.GxWebStd.gx_hidden_field( httpContext, "SER1", GXutil.rtrim( A963Ser1));
      app.GxWebStd.gx_hidden_field( httpContext, "SER0", GXutil.rtrim( A964Ser0));
      app.GxWebStd.gx_hidden_field( httpContext, "vJSON_COMERCIALES", AV25Json_comerciales);
      app.GxWebStd.gx_hidden_field( httpContext, "vJSON_DOCUMENTOS", AV23Json_Documentos);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT", AV37Documentos_Produccion_Comercial_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT", AV37Documentos_Produccion_Comercial_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT", getSecureSignedToken( "", AV37Documentos_Produccion_Comercial_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV22CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACSERNUM", GXutil.rtrim( AV28FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMFAC", GXutil.ltrim( localUtil.ntoc( AV29numFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMFAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29numFac), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
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
         we20C2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt20C2( ) ;
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
      return formatLink("app.facturacion.facturaccionmanual___wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.FacturaccionManual___WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Facturaccion Manual (SDT)", "") ;
   }

   public void wb20C0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-11 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV20CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrio_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrio_Internalname, GXutil.rtrim( AV11PRIO), GXutil.rtrim( localUtil.format( AV11PRIO, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrio_Jsonclick, 0, "WWActionColumn", "", "", "", "", 1, edtavPrio_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipalb.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipalb.getInternalname(), httpContext.getMessage( "Tipo Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipalb, cmbavTipalb.getInternalname(), GXutil.rtrim( AV10TipAlb), 1, cmbavTipalb.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTipalb.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "", true, (byte)(0), "HLP_Facturacion\\FacturaccionManual___WP.htm");
         cmbavTipalb.setValue( GXutil.rtrim( AV10TipAlb) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipalb.getInternalname(), "Values", cmbavTipalb.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfch_Internalname, httpContext.getMessage( "Fecha Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfch_Internalname, localUtil.format(AV12FacFch, "99/99/99"), localUtil.format( AV12FacFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfch1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfch1_Internalname, httpContext.getMessage( "Fecha Ultima Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfch1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfch1_Internalname, localUtil.format(AV18FacFch1, "99/99/99"), localUtil.format( AV18FacFch1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfch1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfch1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfch1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfch1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfchlast_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfchlast_Internalname, httpContext.getMessage( "(InvoiceDate)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfchlast_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfchlast_Internalname, localUtil.format(AV15FacFchlast, "99/99/99"), localUtil.format( AV15FacFchlast, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfchlast_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfchlast_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfchlast_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfchlast_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccodlast_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccodlast_Internalname, httpContext.getMessage( "Ultima Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccodlast_Internalname, GXutil.ltrim( localUtil.ntoc( AV14FacCodlast, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccodlast_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14FacCodlast), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14FacCodlast), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccodlast_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccodlast_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFachor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFachor_Internalname, httpContext.getMessage( "(SystemEntryDate)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFachor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFachor_Internalname, localUtil.ttoc( AV13FacHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV13FacHor, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFachor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFachor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFachor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFachor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTexto_fd_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTexto_fd_Internalname, AV17Texto_fd, GXutil.rtrim( localUtil.format( AV17Texto_fd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTexto_fd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTexto_fd_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavJson_messages_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavJson_messages_Internalname, httpContext.getMessage( "Json_messages", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavJson_messages_Internalname, AV47Json_messages, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", (short)(0), 1, edtavJson_messages_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\FacturaccionManual___WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV19CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\FacturaccionManual___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start20C2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Facturaccion Manual (SDT)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup20C0( ) ;
   }

   public void ws20C2( )
   {
      start20C2( ) ;
      evt20C2( ) ;
   }

   public void evt20C2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODFROM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1120C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1220C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1320C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e1420C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e1520C2 ();
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
                                 e1620C2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1720C2 ();
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

   public void we20C2( )
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

   public void pa20C2( )
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
            GX_FocusControl = edtavPrio_Internalname ;
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
      if ( cmbavTipalb.getItemCount() > 0 )
      {
         AV10TipAlb = cmbavTipalb.getValidValue(AV10TipAlb) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10TipAlb", AV10TipAlb);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipalb.setValue( GXutil.rtrim( AV10TipAlb) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipalb.getInternalname(), "Values", cmbavTipalb.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf20C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV51Pgmname = "Facturacion.FacturaccionManual___WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPrio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrio_Enabled), 5, 0), true);
      edtavFacfch1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacfch1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacfch1_Enabled), 5, 0), true);
      edtavFacfchlast_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacfchlast_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacfchlast_Enabled), 5, 0), true);
      edtavFaccodlast_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaccodlast_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaccodlast_Enabled), 5, 0), true);
      edtavFachor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFachor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFachor_Enabled), 5, 0), true);
      edtavTexto_fd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto_fd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_fd_Enabled), 5, 0), true);
      edtavJson_messages_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJson_messages_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJson_messages_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf20C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1520C2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H020C2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e1720C2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb20C0( ) ;
      }
   }

   public void send_integrity_lvl_hashes20C2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV9FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9FirmaD), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT", AV37Documentos_Produccion_Comercial_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT", AV37Documentos_Produccion_Comercial_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT", getSecureSignedToken( "", AV37Documentos_Produccion_Comercial_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMFAC", GXutil.ltrim( localUtil.ntoc( AV29numFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMFAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29numFac), "ZZZZZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV51Pgmname = "Facturacion.FacturaccionManual___WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPrio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrio_Enabled), 5, 0), true);
      edtavFacfch1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacfch1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacfch1_Enabled), 5, 0), true);
      edtavFacfchlast_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacfchlast_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacfchlast_Enabled), 5, 0), true);
      edtavFaccodlast_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaccodlast_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaccodlast_Enabled), 5, 0), true);
      edtavFachor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFachor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFachor_Enabled), 5, 0), true);
      edtavTexto_fd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto_fd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_fd_Enabled), 5, 0), true);
      edtavJson_messages_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJson_messages_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJson_messages_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup20C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1220C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV20CliCodfrom_Data);
         /* Read saved values. */
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
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
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         AV11PRIO = httpContext.cgiGet( edtavPrio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PRIO", AV11PRIO);
         cmbavTipalb.setValue( httpContext.cgiGet( cmbavTipalb.getInternalname()) );
         AV10TipAlb = httpContext.cgiGet( cmbavTipalb.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10TipAlb", AV10TipAlb);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCH");
            GX_FocusControl = edtavFacfch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12FacFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12FacFch", localUtil.format(AV12FacFch, "99/99/99"));
         }
         else
         {
            AV12FacFch = localUtil.ctod( httpContext.cgiGet( edtavFacfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12FacFch", localUtil.format(AV12FacFch, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfch1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCH1");
            GX_FocusControl = edtavFacfch1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18FacFch1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18FacFch1", localUtil.format(AV18FacFch1, "99/99/99"));
         }
         else
         {
            AV18FacFch1 = localUtil.ctod( httpContext.cgiGet( edtavFacfch1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18FacFch1", localUtil.format(AV18FacFch1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfchlast_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCHLAST");
            GX_FocusControl = edtavFacfchlast_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15FacFchlast = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FacFchlast", localUtil.format(AV15FacFchlast, "99/99/99"));
         }
         else
         {
            AV15FacFchlast = localUtil.ctod( httpContext.cgiGet( edtavFacfchlast_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FacFchlast", localUtil.format(AV15FacFchlast, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodlast_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodlast_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCODLAST");
            GX_FocusControl = edtavFaccodlast_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14FacCodlast = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FacCodlast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FacCodlast), 8, 0));
         }
         else
         {
            AV14FacCodlast = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccodlast_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FacCodlast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FacCodlast), 8, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFachor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFACHOR");
            GX_FocusControl = edtavFachor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13FacHor = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV13FacHor", localUtil.ttoc( AV13FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV13FacHor = localUtil.ctot( httpContext.cgiGet( edtavFachor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13FacHor", localUtil.ttoc( AV13FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV17Texto_fd = httpContext.cgiGet( edtavTexto_fd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Texto_fd", AV17Texto_fd);
         AV47Json_messages = httpContext.cgiGet( edtavJson_messages_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Json_messages", AV47Json_messages);
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCodfrom), 6, 0));
         }
         else
         {
            AV19CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCodfrom), 6, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"FacturaccionManual___WP");
         AV11PRIO = httpContext.cgiGet( edtavPrio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PRIO", AV11PRIO);
         forbiddenHiddens.add("PRIO", GXutil.rtrim( localUtil.format( AV11PRIO, "9")));
         AV15FacFchlast = localUtil.ctod( httpContext.cgiGet( edtavFacfchlast_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FacFchlast", localUtil.format(AV15FacFchlast, "99/99/99"));
         forbiddenHiddens.add("FacFchlast", localUtil.format(AV15FacFchlast, "99/99/99"));
         AV13FacHor = localUtil.ctot( httpContext.cgiGet( edtavFachor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13FacHor", localUtil.ttoc( AV13FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         forbiddenHiddens.add("FacHor", localUtil.format( AV13FacHor, "99/99/99 99:99"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\facturaccionmanual___wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1220C2 ();
      if (returnInSub) return;
   }

   public void e1220C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      facturaccionmanual___wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      facturaccionmanual___wp_impl.this.A396EmprCod = GXv_char2[0] ;
      facturaccionmanual___wp_impl.this.AV6EmprNom = GXv_char3[0] ;
      facturaccionmanual___wp_impl.this.AV7UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXt_int5 = (byte)(AV8F_moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      facturaccionmanual___wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8F_moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8F_moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8F_moda21), 4, 0));
      GXt_int5 = (byte)(AV9FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int6) ;
      facturaccionmanual___wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV9FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9FirmaD), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9FirmaD), "ZZZ9")));
      AV10TipAlb = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10TipAlb", AV10TipAlb);
      AV11PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11PRIO", AV11PRIO);
      AV12FacFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FacFch", localUtil.format(AV12FacFch, "99/99/99"));
      /* Execute user subroutine: 'CFAVEN' */
      S112 ();
      if (returnInSub) return;
      AV13FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13FacHor", localUtil.ttoc( AV13FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV31Inicio_proceso_facturacion = (short)(0) ;
      AV17Texto_fd = ((AV9FirmaD==1) ? httpContext.getMessage( "Assinatura digital é ativada.", "") : " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Texto_fd", AV17Texto_fd);
      GXt_char1 = AV5Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      facturaccionmanual___wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV5Station = GXt_char1 ;
      GXv_char4[0] = AV48EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char2[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char4, GXv_char3, GXv_char2) ;
      facturaccionmanual___wp_impl.this.AV48EmprCod = GXv_char4[0] ;
      facturaccionmanual___wp_impl.this.AV6EmprNom = GXv_char3[0] ;
      facturaccionmanual___wp_impl.this.AV7UsurCod = GXv_char2[0] ;
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S122 ();
      if (returnInSub) return;
   }

   public void e1320C2( )
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

   public void e1120C2( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV19CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H020C3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H020C3_A10045CliAct[0] ;
         A13735CliCNom = H020C3_A13735CliCNom[0] ;
         A252CliCod = H020C3_A252CliCod[0] ;
         A279CliNom = H020C3_A279CliNom[0] ;
         AV21Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV21Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV20CliCodfrom_Data.add(AV21Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV19CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV19CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void e1420C2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV25Json_comerciales = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Json_comerciales", AV25Json_comerciales);
      AV23Json_Documentos = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Json_Documentos", AV23Json_Documentos);
      AV24ExisteFP = (short)(0) ;
      /* Using cursor H020C4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV19CliCodfrom), AV11PRIO});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A297CliPri = H020C4_A297CliPri[0] ;
         A252CliCod = H020C4_A252CliCod[0] ;
         AV24ExisteFP = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Execute user subroutine: 'EMPRESAS' */
      S132 ();
      if (returnInSub) return;
      if ( (0==AV19CliCodfrom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Cliente", ""));
         GX_FocusControl = edtavClicodfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.resetTime(AV12FacFch).before( GXutil.resetTime( AV15FacFchlast )) && ( AV9FirmaD == 1 ) )
         {
            Gx_msg = httpContext.getMessage( "A data da fatura ", "") + localUtil.dtoc( AV12FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " não pode ser menor", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( " do que a data da factura passada ", "") + localUtil.dtoc( AV15FacFchlast, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( GXutil.resetTime(AV12FacFch).after( GXutil.resetTime( GXutil.today( ) )) && ( AV9FirmaD == 1 ) )
            {
               Gx_msg = httpContext.getMessage( "La fecha de la factura ", "") + localUtil.dtoc( AV12FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " NO puede ser SUPERIOR", "") + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "a la fecha del SISTEMA ", "") + localUtil.dtoc( GXutil.today( ), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               if ( (0==AV24ExisteFP) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente sin F.Pago. No se puede facturar", ""));
               }
               else
               {
                  GXt_char1 = AV22CliNom ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.pclinom(remoteHandle, context).execute( A396EmprCod, AV19CliCodfrom, GXv_char4) ;
                  facturaccionmanual___wp_impl.this.GXt_char1 = GXv_char4[0] ;
                  AV22CliNom = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV22CliNom", AV22CliNom);
                  if ( ( GXutil.strcmp(AV10TipAlb, "1") == 0 ) || ( GXutil.strcmp(AV10TipAlb, "0") == 0 ) )
                  {
                     AV23Json_Documentos = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV23Json_Documentos", AV23Json_Documentos);
                     httpContext.popup(formatLink("app.facturacion.facturacionmanual_producciones___wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCodfrom,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22CliNom)),GXutil.URLEncode(GXutil.rtrim(AV11PRIO)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","CliCod","CliNom","Prior","Json_Documentos"}) , new Object[] {"AV23Json_Documentos"});
                     httpContext.doAjaxRefresh();
                  }
                  if ( ( GXutil.strcmp(AV10TipAlb, "2") == 0 ) || ( GXutil.strcmp(AV10TipAlb, "0") == 0 ) )
                  {
                     AV25Json_comerciales = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25Json_comerciales", AV25Json_comerciales);
                     httpContext.popup(formatLink("app.facturacion.facturacionmanualcomerciales___wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCodfrom,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22CliNom)),GXutil.URLEncode(GXutil.rtrim(AV11PRIO)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","CliCod","CliNom","Prior","Json_Documentos"}) , new Object[] {"AV25Json_comerciales"});
                     httpContext.doAjaxRefresh();
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1520C2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      AV33FacturacionManual_Comerciales__SDT.fromJSonString(AV25Json_comerciales, null);
      AV34FacturacionManual_Producciones__SDT.fromJSonString(AV23Json_Documentos, null);
      if ( ( ( GXutil.strcmp(AV10TipAlb, "0") == 0 ) && ( AV33FacturacionManual_Comerciales__SDT.size() > 0 ) && ( AV34FacturacionManual_Producciones__SDT.size() > 0 ) ) || ( ( GXutil.strcmp(AV10TipAlb, "1") == 0 ) && ( AV34FacturacionManual_Producciones__SDT.size() > 0 ) ) || ( ( GXutil.strcmp(AV10TipAlb, "2") == 0 ) && ( AV33FacturacionManual_Comerciales__SDT.size() > 0 ) ) )
      {
         AV40Cantidadc = (short)(0) ;
         AV35i = (short)(1) ;
         while ( AV35i <= AV33FacturacionManual_Comerciales__SDT.size() )
         {
            if ( ((app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem)AV33FacturacionManual_Comerciales__SDT.elementAt(-1+AV35i)).getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar() )
            {
               AV40Cantidadc = (short)(AV40Cantidadc+1) ;
               AV38Documentos_Produccion_Comercial_SDTItem = (app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item)new app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item(remoteHandle, context);
               AV38Documentos_Produccion_Comercial_SDTItem.setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo( httpContext.getMessage( "Comercial", "") );
               AV38Documentos_Produccion_Comercial_SDTItem.setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento( ((app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem)AV33FacturacionManual_Comerciales__SDT.elementAt(-1+AV35i)).getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod() );
               AV37Documentos_Produccion_Comercial_SDT.add(AV38Documentos_Produccion_Comercial_SDTItem, 0);
            }
            AV35i = (short)(AV35i+1) ;
         }
         AV41Cantidadp = (short)(0) ;
         AV35i = (short)(1) ;
         while ( AV35i <= AV34FacturacionManual_Producciones__SDT.size() )
         {
            if ( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV34FacturacionManual_Producciones__SDT.elementAt(-1+AV35i)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar() )
            {
               AV41Cantidadp = (short)(AV41Cantidadp+1) ;
               AV38Documentos_Produccion_Comercial_SDTItem = (app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item)new app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item(remoteHandle, context);
               AV38Documentos_Produccion_Comercial_SDTItem.setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo( httpContext.getMessage( "Produccion", "") );
               AV38Documentos_Produccion_Comercial_SDTItem.setgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV34FacturacionManual_Producciones__SDT.elementAt(-1+AV35i)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod() );
               AV37Documentos_Produccion_Comercial_SDT.add(AV38Documentos_Produccion_Comercial_SDTItem, 0);
            }
            AV35i = (short)(AV35i+1) ;
         }
         AV43Json_produccion_comercial = AV37Documentos_Produccion_Comercial_SDT.toJSonString(false) ;
         httpContext.popup(formatLink("app.facturacion.facturacionmanual_produccion_comercial__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCodfrom,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22CliNom)),GXutil.URLEncode(GXutil.rtrim(AV11PRIO)),GXutil.URLEncode(GXutil.formatDateParm(AV12FacFch)),GXutil.URLEncode(GXutil.rtrim(AV28FacSerNum)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCodfrom,6,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV13FacHor)),GXutil.URLEncode(GXutil.ltrimstr(AV29numFac,8,0)),GXutil.URLEncode(GXutil.rtrim(AV43Json_produccion_comercial)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","CliCod","CliNom","PRIO","FacFch","Facsernum","Clifac","FacHor","numFac","Json_produccion_comercial","Json_messages","error"}) , new Object[] {"AV47Json_messages","AV45error"});
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37Documentos_Produccion_Comercial_SDT", AV37Documentos_Produccion_Comercial_SDT);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1620C2 ();
      if (returnInSub) return;
   }

   public void e1620C2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV25Json_comerciales = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Json_comerciales", AV25Json_comerciales);
      AV23Json_Documentos = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Json_Documentos", AV23Json_Documentos);
      AV24ExisteFP = (short)(0) ;
      /* Using cursor H020C5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV19CliCodfrom), AV11PRIO});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A297CliPri = H020C5_A297CliPri[0] ;
         A252CliCod = H020C5_A252CliCod[0] ;
         AV24ExisteFP = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Execute user subroutine: 'EMPRESAS' */
      S132 ();
      if (returnInSub) return;
      if ( (0==AV19CliCodfrom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Cliente", ""));
         GX_FocusControl = edtavClicodfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.resetTime(AV12FacFch).before( GXutil.resetTime( AV15FacFchlast )) && ( AV9FirmaD == 1 ) )
         {
            Gx_msg = httpContext.getMessage( "A data da fatura ", "") + localUtil.dtoc( AV12FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " não pode ser menor", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( " do que a data da factura passada ", "") + localUtil.dtoc( AV15FacFchlast, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( GXutil.resetTime(AV12FacFch).after( GXutil.resetTime( GXutil.today( ) )) && ( AV9FirmaD == 1 ) )
            {
               Gx_msg = httpContext.getMessage( "La fecha de la factura ", "") + localUtil.dtoc( AV12FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " NO puede ser SUPERIOR", "") + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "a la fecha del SISTEMA ", "") + localUtil.dtoc( GXutil.today( ), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               if ( (0==AV24ExisteFP) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente sin F.Pago. No se puede facturar", ""));
               }
               else
               {
                  GXt_char1 = AV22CliNom ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.pclinom(remoteHandle, context).execute( A396EmprCod, AV19CliCodfrom, GXv_char4) ;
                  facturaccionmanual___wp_impl.this.GXt_char1 = GXv_char4[0] ;
                  AV22CliNom = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV22CliNom", AV22CliNom);
                  if ( ( GXutil.strcmp(AV10TipAlb, "1") == 0 ) || ( GXutil.strcmp(AV10TipAlb, "0") == 0 ) )
                  {
                     AV23Json_Documentos = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV23Json_Documentos", AV23Json_Documentos);
                     httpContext.popup(formatLink("app.facturacion.facturacionmanual_producciones___wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCodfrom,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22CliNom)),GXutil.URLEncode(GXutil.rtrim(AV11PRIO)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","CliCod","CliNom","Prior","Json_Documentos"}) , new Object[] {"AV23Json_Documentos"});
                     httpContext.doAjaxRefresh();
                  }
                  if ( ( GXutil.strcmp(AV10TipAlb, "2") == 0 ) || ( GXutil.strcmp(AV10TipAlb, "0") == 0 ) )
                  {
                     AV25Json_comerciales = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25Json_comerciales", AV25Json_comerciales);
                     httpContext.popup(formatLink("app.facturacion.facturacionmanualcomerciales___wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCodfrom,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22CliNom)),GXutil.URLEncode(GXutil.rtrim(AV11PRIO)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","CliCod","CliNom","Prior","Json_Documentos"}) , new Object[] {"AV25Json_comerciales"});
                     httpContext.doAjaxRefresh();
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CFAVEN' Routine */
      returnInSub = false ;
      AV14FacCodlast = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FacCodlast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FacCodlast), 8, 0));
      AV15FacFchlast = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FacFchlast", localUtil.format(AV15FacFchlast, "99/99/99"));
      /* Using cursor H020C6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV11PRIO});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A450FacPri = H020C6_A450FacPri[0] ;
         A1153FacTipFac = H020C6_A1153FacTipFac[0] ;
         A436FacFch = H020C6_A436FacFch[0] ;
         A430FacCod = H020C6_A430FacCod[0] ;
         AV14FacCodlast = A430FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FacCodlast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FacCodlast), 8, 0));
         AV15FacFchlast = A436FacFch ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FacFchlast", localUtil.format(AV15FacFchlast, "99/99/99"));
         if ( AV8F_moda21 == 1 )
         {
            AV12FacFch = A436FacFch ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12FacFch", localUtil.format(AV12FacFch, "99/99/99"));
            AV16FacFchi = A436FacFch ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S132( )
   {
      /* 'EMPRESAS' Routine */
      returnInSub = false ;
      /* Using cursor H020C7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A395EmprCif = H020C7_A395EmprCif[0] ;
         n395EmprCif = H020C7_n395EmprCif[0] ;
         A963Ser1 = H020C7_A963Ser1[0] ;
         n963Ser1 = H020C7_n963Ser1[0] ;
         A964Ser0 = H020C7_A964Ser0[0] ;
         n964Ser0 = H020C7_n964Ser0[0] ;
         AV28FacSerNum = A963Ser1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28FacSerNum", AV28FacSerNum);
         if ( GXutil.strcmp(AV11PRIO, "0") == 0 )
         {
            AV28FacSerNum = A964Ser0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28FacSerNum", AV28FacSerNum);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void nextLoad( )
   {
   }

   protected void e1720C2( )
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
      pa20C2( ) ;
      ws20C2( ) ;
      we20C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415131746", true, true);
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
      httpContext.AddJavascriptSource("facturacion/facturaccionmanual___wp.js", "?202682415131746", false, true);
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
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      edtavPrio_Internalname = "vPRIO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavTipalb.setInternalname( "vTIPALB" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavFacfch_Internalname = "vFACFCH" ;
      edtavFacfch1_Internalname = "vFACFCH1" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavFacfchlast_Internalname = "vFACFCHLAST" ;
      edtavFaccodlast_Internalname = "vFACCODLAST" ;
      edtavFachor_Internalname = "vFACHOR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      edtavTexto_fd_Internalname = "vTEXTO_FD" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      Datamon_Internalname = "DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      edtavJson_messages_Internalname = "vJSON_MESSAGES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
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
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavJson_messages_Enabled = 1 ;
      edtavTexto_fd_Jsonclick = "" ;
      edtavTexto_fd_Enabled = 1 ;
      edtavFachor_Jsonclick = "" ;
      edtavFachor_Enabled = 1 ;
      edtavFaccodlast_Jsonclick = "" ;
      edtavFaccodlast_Enabled = 1 ;
      edtavFacfchlast_Jsonclick = "" ;
      edtavFacfchlast_Enabled = 1 ;
      edtavFacfch1_Jsonclick = "" ;
      edtavFacfch1_Enabled = 1 ;
      edtavFacfch_Jsonclick = "" ;
      edtavFacfch_Enabled = 1 ;
      cmbavTipalb.setJsonclick( "" );
      cmbavTipalb.setEnabled( 1 );
      edtavPrio_Jsonclick = "" ;
      edtavPrio_Enabled = 1 ;
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
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Facturaccion Manual (SDT)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTipalb.setName( "vTIPALB" );
      cmbavTipalb.setWebtags( "" );
      cmbavTipalb.addItem("0", httpContext.getMessage( "Todo (Produccion y Comercial)", ""), (short)(0));
      cmbavTipalb.addItem("1", httpContext.getMessage( "Produccion", ""), (short)(0));
      cmbavTipalb.addItem("2", httpContext.getMessage( "Comercial", ""), (short)(0));
      if ( cmbavTipalb.getItemCount() > 0 )
      {
         AV10TipAlb = cmbavTipalb.getValidValue(AV10TipAlb) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10TipAlb", AV10TipAlb);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV25Json_comerciales',fld:'vJSON_COMERCIALES',pic:''},{av:'AV23Json_Documentos',fld:'vJSON_DOCUMENTOS',pic:''},{av:'cmbavTipalb'},{av:'AV10TipAlb',fld:'vTIPALB',pic:''},{av:'AV22CliNom',fld:'vCLINOM',pic:''},{av:'AV12FacFch',fld:'vFACFCH',pic:''},{av:'AV28FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV19CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV9FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV37Documentos_Produccion_Comercial_SDT',fld:'vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT',pic:'',hsh:true},{av:'AV29numFac',fld:'vNUMFAC',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV11PRIO',fld:'vPRIO',pic:'9'},{av:'AV15FacFchlast',fld:'vFACFCHLAST',pic:''},{av:'AV13FacHor',fld:'vFACHOR',pic:'99/99/99 99:99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV37Documentos_Produccion_Comercial_SDT',fld:'vDOCUMENTOS_PRODUCCION_COMERCIAL_SDT',pic:'',hsh:true},{av:'AV47Json_messages',fld:'vJSON_MESSAGES',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1320C2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e1120C2',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV19CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1420C2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV19CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'A297CliPri',fld:'CLIPRI',pic:''},{av:'AV11PRIO',fld:'vPRIO',pic:'9'},{av:'AV12FacFch',fld:'vFACFCH',pic:''},{av:'AV15FacFchlast',fld:'vFACFCHLAST',pic:''},{av:'AV9FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'cmbavTipalb'},{av:'AV10TipAlb',fld:'vTIPALB',pic:''},{av:'A395EmprCif',fld:'EMPRCIF',pic:''},{av:'A963Ser1',fld:'SER1',pic:''},{av:'A964Ser0',fld:'SER0',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV25Json_comerciales',fld:'vJSON_COMERCIALES',pic:''},{av:'AV23Json_Documentos',fld:'vJSON_DOCUMENTOS',pic:''},{av:'AV22CliNom',fld:'vCLINOM',pic:''},{av:'AV28FacSerNum',fld:'vFACSERNUM',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e1620C2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV19CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'A297CliPri',fld:'CLIPRI',pic:''},{av:'AV11PRIO',fld:'vPRIO',pic:'9'},{av:'AV12FacFch',fld:'vFACFCH',pic:''},{av:'AV15FacFchlast',fld:'vFACFCHLAST',pic:''},{av:'AV9FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'cmbavTipalb'},{av:'AV10TipAlb',fld:'vTIPALB',pic:''},{av:'A395EmprCif',fld:'EMPRCIF',pic:''},{av:'A963Ser1',fld:'SER1',pic:''},{av:'A964Ser0',fld:'SER0',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV25Json_comerciales',fld:'vJSON_COMERCIALES',pic:''},{av:'AV23Json_Documentos',fld:'vJSON_DOCUMENTOS',pic:''},{av:'AV22CliNom',fld:'vCLINOM',pic:''},{av:'AV28FacSerNum',fld:'vFACSERNUM',pic:''}]}");
      setEventMetadata("VALIDV_PRIO","{handler:'validv_Prio',iparms:[]");
      setEventMetadata("VALIDV_PRIO",",oparms:[]}");
      setEventMetadata("VALIDV_CLICODFROM","{handler:'validv_Clicodfrom',iparms:[]");
      setEventMetadata("VALIDV_CLICODFROM",",oparms:[]}");
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
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A396EmprCod = "" ;
      AV37Documentos_Produccion_Comercial_SDT = new GXBaseCollection<app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item>(app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV11PRIO = "" ;
      AV15FacFchlast = GXutil.nullDate() ;
      AV13FacHor = GXutil.resetTime( GXutil.nullDate() );
      AV20CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A297CliPri = "" ;
      A395EmprCif = "" ;
      A963Ser1 = "" ;
      A964Ser0 = "" ;
      AV25Json_comerciales = "" ;
      AV23Json_Documentos = "" ;
      AV22CliNom = "" ;
      AV28FacSerNum = "" ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      TempTags = "" ;
      AV10TipAlb = "" ;
      AV12FacFch = GXutil.nullDate() ;
      AV18FacFch1 = GXutil.nullDate() ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV17Texto_fd = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV47Json_messages = "" ;
      AV51Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H020C2_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV5Station = "" ;
      AV6EmprNom = "" ;
      AV7UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV48EmprCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      H020C3_A396EmprCod = new String[] {""} ;
      H020C3_A10045CliAct = new String[] {""} ;
      H020C3_A13735CliCNom = new String[] {""} ;
      H020C3_A252CliCod = new int[1] ;
      H020C3_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      AV21Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H020C4_A396EmprCod = new String[] {""} ;
      H020C4_A297CliPri = new String[] {""} ;
      H020C4_A252CliCod = new int[1] ;
      Gx_msg = "" ;
      AV33FacturacionManual_Comerciales__SDT = new GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem>(app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem.class, "FacturacionManual_Comerciales__SDTItem", "TexplusNET", remoteHandle);
      AV34FacturacionManual_Producciones__SDT = new GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>(app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem.class, "FacturacionManual_Producciones__SDTItem", "TexplusNET", remoteHandle);
      AV38Documentos_Produccion_Comercial_SDTItem = new app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item(remoteHandle, context);
      AV43Json_produccion_comercial = "" ;
      H020C5_A396EmprCod = new String[] {""} ;
      H020C5_A297CliPri = new String[] {""} ;
      H020C5_A252CliCod = new int[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      H020C6_A396EmprCod = new String[] {""} ;
      H020C6_A450FacPri = new String[] {""} ;
      H020C6_A1153FacTipFac = new byte[1] ;
      H020C6_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H020C6_A430FacCod = new int[1] ;
      A450FacPri = "" ;
      A436FacFch = GXutil.nullDate() ;
      AV16FacFchi = GXutil.nullDate() ;
      H020C7_A396EmprCod = new String[] {""} ;
      H020C7_A395EmprCif = new String[] {""} ;
      H020C7_n395EmprCif = new boolean[] {false} ;
      H020C7_A963Ser1 = new String[] {""} ;
      H020C7_n963Ser1 = new boolean[] {false} ;
      H020C7_A964Ser0 = new String[] {""} ;
      H020C7_n964Ser0 = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturaccionmanual___wp__default(),
         new Object[] {
             new Object[] {
            H020C2_A396EmprCod
            }
            , new Object[] {
            H020C3_A396EmprCod, H020C3_A10045CliAct, H020C3_A13735CliCNom, H020C3_A252CliCod, H020C3_A279CliNom
            }
            , new Object[] {
            H020C4_A396EmprCod, H020C4_A297CliPri, H020C4_A252CliCod
            }
            , new Object[] {
            H020C5_A396EmprCod, H020C5_A297CliPri, H020C5_A252CliCod
            }
            , new Object[] {
            H020C6_A396EmprCod, H020C6_A450FacPri, H020C6_A1153FacTipFac, H020C6_A436FacFch, H020C6_A430FacCod
            }
            , new Object[] {
            H020C7_A396EmprCod, H020C7_A395EmprCif, H020C7_n395EmprCif, H020C7_A963Ser1, H020C7_n963Ser1, H020C7_A964Ser0, H020C7_n964Ser0
            }
         }
      );
      AV51Pgmname = "Facturacion.FacturaccionManual___WP" ;
      /* GeneXus formulas. */
      AV51Pgmname = "Facturacion.FacturaccionManual___WP" ;
      Gx_err = (short)(0) ;
      edtavPrio_Enabled = 0 ;
      edtavFacfch1_Enabled = 0 ;
      edtavFacfchlast_Enabled = 0 ;
      edtavFaccodlast_Enabled = 0 ;
      edtavFachor_Enabled = 0 ;
      edtavTexto_fd_Enabled = 0 ;
      edtavJson_messages_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A1153FacTipFac ;
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
   private short AV9FirmaD ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV8F_moda21 ;
   private short AV31Inicio_proceso_facturacion ;
   private short AV24ExisteFP ;
   private short AV40Cantidadc ;
   private short AV35i ;
   private short AV41Cantidadp ;
   private int AV29numFac ;
   private int A252CliCod ;
   private int edtavPrio_Enabled ;
   private int edtavFacfch_Enabled ;
   private int edtavFacfch1_Enabled ;
   private int edtavFacfchlast_Enabled ;
   private int AV14FacCodlast ;
   private int edtavFaccodlast_Enabled ;
   private int edtavFachor_Enabled ;
   private int edtavTexto_fd_Enabled ;
   private int edtavJson_messages_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV19CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int A430FacCod ;
   private int idxLst ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A396EmprCod ;
   private String GXKey ;
   private String AV11PRIO ;
   private String A297CliPri ;
   private String A395EmprCif ;
   private String A963Ser1 ;
   private String A964Ser0 ;
   private String AV22CliNom ;
   private String AV28FacSerNum ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
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
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedclicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Jsonclick ;
   private String Combo_clicodfrom_Caption ;
   private String Combo_clicodfrom_Internalname ;
   private String edtavPrio_Internalname ;
   private String TempTags ;
   private String edtavPrio_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String AV10TipAlb ;
   private String divUnnamedtable4_Internalname ;
   private String edtavFacfch_Internalname ;
   private String edtavFacfch_Jsonclick ;
   private String edtavFacfch1_Internalname ;
   private String edtavFacfch1_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavFacfchlast_Internalname ;
   private String edtavFacfchlast_Jsonclick ;
   private String edtavFaccodlast_Internalname ;
   private String edtavFaccodlast_Jsonclick ;
   private String edtavFachor_Internalname ;
   private String edtavFachor_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavTexto_fd_Internalname ;
   private String edtavTexto_fd_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String Datamon_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavJson_messages_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV51Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String hsh ;
   private String AV5Station ;
   private String AV6EmprNom ;
   private String AV7UsurCod ;
   private String AV48EmprCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String Gx_msg ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String A450FacPri ;
   private java.util.Date AV13FacHor ;
   private java.util.Date AV15FacFchlast ;
   private java.util.Date AV12FacFch ;
   private java.util.Date AV18FacFch1 ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV16FacFchi ;
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
   private boolean n395EmprCif ;
   private boolean n963Ser1 ;
   private boolean n964Ser0 ;
   private String AV25Json_comerciales ;
   private String AV23Json_Documentos ;
   private String AV47Json_messages ;
   private String AV43Json_produccion_comercial ;
   private String AV17Texto_fd ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavTipalb ;
   private IDataStoreProvider pr_default ;
   private String[] H020C2_A396EmprCod ;
   private String[] H020C3_A396EmprCod ;
   private String[] H020C3_A10045CliAct ;
   private String[] H020C3_A13735CliCNom ;
   private int[] H020C3_A252CliCod ;
   private String[] H020C3_A279CliNom ;
   private String[] H020C4_A396EmprCod ;
   private String[] H020C4_A297CliPri ;
   private int[] H020C4_A252CliCod ;
   private String[] H020C5_A396EmprCod ;
   private String[] H020C5_A297CliPri ;
   private int[] H020C5_A252CliCod ;
   private String[] H020C6_A396EmprCod ;
   private String[] H020C6_A450FacPri ;
   private byte[] H020C6_A1153FacTipFac ;
   private java.util.Date[] H020C6_A436FacFch ;
   private int[] H020C6_A430FacCod ;
   private String[] H020C7_A396EmprCod ;
   private String[] H020C7_A395EmprCif ;
   private boolean[] H020C7_n395EmprCif ;
   private String[] H020C7_A963Ser1 ;
   private boolean[] H020C7_n963Ser1 ;
   private String[] H020C7_A964Ser0 ;
   private boolean[] H020C7_n964Ser0 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem> AV33FacturacionManual_Comerciales__SDT ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> AV34FacturacionManual_Producciones__SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20CliCodfrom_Data ;
   private GXBaseCollection<app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item> AV37Documentos_Produccion_Comercial_SDT ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV21Combo_DataItem ;
   private app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item AV38Documentos_Produccion_Comercial_SDTItem ;
}

final  class facturaccionmanual___wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H020C2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H020C3", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H020C4", "SELECT EmprCod, CliPri, CliCod FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H020C5", "SELECT EmprCod, CliPri, CliCod FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H020C6", "SELECT * FROM (SELECT EmprCod, FacPri, FacTipFac, FacFch, FacCod FROM TXPCFAVEN WHERE (EmprCod = ?) AND (FacTipFac = 0) AND (FacPri = ?) ORDER BY EmprCod, FacCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H020C7", "SELECT EmprCod, EmprCif, Ser1, Ser0 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

