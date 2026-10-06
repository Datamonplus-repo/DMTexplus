package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class particiondehdrs_wp_impl extends GXDataArea
{
   public particiondehdrs_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public particiondehdrs_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( particiondehdrs_wp_impl.class ));
   }

   public particiondehdrs_wp_impl( int remoteHandle ,
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
      pa1LU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1LU2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.particiondehdrs_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV24EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPES", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSANY", GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSPRO", GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNIMED", GXutil.rtrim( A228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "RECACAB", GXutil.rtrim( A6039RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV45Rectotkgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV46Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACAQUI", GXutil.rtrim( A118BarAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARVOLMAQ", GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we1LU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1LU2( ) ;
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
      return formatLink("app.formulaciontinte.particiondehdrs_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ParticiondeHDRs_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Particion de HDRs", "") ;
   }

   public void wb1LU0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV20BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV20BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV21BarCodPar), GXutil.rtrim( localUtil.format( AV21BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV47Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV47Prompt)==0)&&(GXutil.strcmp("", AV57Prompt_GXI)==0))||!(GXutil.strcmp("", AV47Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV47Prompt)==0) ? AV57Prompt_GXI : httpContext.getResourceRelative(AV47Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV47Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ParticiondeHDRs_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "", httpContext.getMessage( "Agrupar", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Agrupar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ParticiondeHDRs_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ParticiondeHDRs_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ParticiondeHDRs_WP.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1LU2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Particion de HDRs", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1LU0( ) ;
   }

   public void ws1LU2( )
   {
      start1LU2( ) ;
      evt1LU2( ) ;
   }

   public void evt1LU2( )
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
                           e111LU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e121LU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e131LU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e141LU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151LU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161LU2 ();
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

   public void we1LU2( )
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

   public void pa1LU2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      rf1LU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf1LU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151LU2 ();
         wb1LU0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1LU2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1LU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111LU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarCod), 8, 0));
         }
         else
         {
            AV19BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarCodReo", GXutil.str( AV20BarCodReo, 1, 0));
         }
         else
         {
            AV20BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarCodReo", GXutil.str( AV20BarCodReo, 1, 0));
         }
         AV21BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarCodPar", AV21BarCodPar);
         AV47Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
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
      e111LU2 ();
      if (returnInSub) return;
   }

   public void e111LU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      particiondehdrs_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      particiondehdrs_wp_impl.this.AV24EmprCod = GXv_char2[0] ;
      particiondehdrs_wp_impl.this.AV25EmprNom = GXv_char3[0] ;
      particiondehdrs_wp_impl.this.AV26UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV47Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV47Prompt)==0) ? AV57Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV47Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV47Prompt), true);
      AV57Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV47Prompt)==0) ? AV57Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV47Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV47Prompt), true);
      GXt_char1 = AV23Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      particiondehdrs_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23Station = GXt_char1 ;
      GXv_char4[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char4, GXv_char3, GXv_char2) ;
      particiondehdrs_wp_impl.this.AV24EmprCod = GXv_char4[0] ;
      particiondehdrs_wp_impl.this.AV25EmprNom = GXv_char3[0] ;
      particiondehdrs_wp_impl.this.AV26UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
   }

   public void e121LU2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV22DisDes = " " ;
      AV27Flag = (byte)(0) ;
      AV28FlagRec = (short)(0) ;
      AV29FlagAgr = (short)(0) ;
      AV30FlagRecacb = (short)(0) ;
      /* Using cursor H01LU3 */
      pr_default.execute(0, new Object[] {AV24EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = H01LU3_A130BarCodPar[0] ;
         A132BarCodReo = H01LU3_A132BarCodReo[0] ;
         A129BarCod = H01LU3_A129BarCod[0] ;
         A396EmprCod = H01LU3_A396EmprCod[0] ;
         A213BarSit = H01LU3_A213BarSit[0] ;
         A212BarSer = H01LU3_A212BarSer[0] ;
         A1652BarSerDsc = H01LU3_A1652BarSerDsc[0] ;
         A135BarColNom = H01LU3_A135BarColNom[0] ;
         A136BarColNum = H01LU3_A136BarColNum[0] ;
         A864BarPes = H01LU3_A864BarPes[0] ;
         A140BarCosAny = H01LU3_A140BarCosAny[0] ;
         A141BarCosPro = H01LU3_A141BarCosPro[0] ;
         A120BarAgrEst = H01LU3_A120BarAgrEst[0] ;
         A228BarUniMed = H01LU3_A228BarUniMed[0] ;
         A166BarKgm = H01LU3_A166BarKgm[0] ;
         A184BarMtr = H01LU3_A184BarMtr[0] ;
         A199BarPie1 = H01LU3_A199BarPie1[0] ;
         A365DisDes = H01LU3_A365DisDes[0] ;
         A898BarPieNDes = H01LU3_A898BarPieNDes[0] ;
         A166BarKgm = H01LU3_A166BarKgm[0] ;
         A184BarMtr = H01LU3_A184BarMtr[0] ;
         A199BarPie1 = H01LU3_A199BarPie1[0] ;
         A898BarPieNDes = H01LU3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         AV31BarSit = A213BarSit ;
         AV32Barser = A212BarSer ;
         AV33Barserdsc = A1652BarSerDsc ;
         AV34Barcolnom = A135BarColNom ;
         AV35Barcolnum = A136BarColNum ;
         AV36Barkgm = A166BarKgm ;
         AV37BarMtr = A184BarMtr ;
         AV38BarPiepie = A198BarPie ;
         AV39Barpes = A864BarPes ;
         AV40BarCosAny = A140BarCosAny ;
         AV41BarCosPro = A141BarCosPro ;
         AV27Flag = (byte)(1) ;
         AV22DisDes = A365DisDes ;
         AV29FlagAgr = (short)(((GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", ""))==0) ? 1 : 0)) ;
         AV51Barunimed = A228BarUniMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV42BarCodM = AV19BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42BarCodM), 8, 0));
      AV43BarReoM = AV20BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43BarReoM", GXutil.str( AV43BarReoM, 1, 0));
      AV44BarParM = AV21BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44BarParM", AV44BarParM);
      if ( AV29FlagAgr == 1 )
      {
         new app.pminagr(remoteHandle, context).execute( AV24EmprCod, AV42BarCodM, AV43BarReoM, AV44BarParM) ;
      }
      /* Using cursor H01LU4 */
      pr_default.execute(1, new Object[] {AV24EmprCod, Integer.valueOf(AV42BarCodM), Byte.valueOf(AV43BarReoM), AV44BarParM});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = H01LU4_A130BarCodPar[0] ;
         A132BarCodReo = H01LU4_A132BarCodReo[0] ;
         A129BarCod = H01LU4_A129BarCod[0] ;
         A396EmprCod = H01LU4_A396EmprCod[0] ;
         A6039RecAcab = H01LU4_A6039RecAcab[0] ;
         n6039RecAcab = H01LU4_n6039RecAcab[0] ;
         AV28FlagRec = (short)(((GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", ""))!=0) ? 1 : AV28FlagRec)) ;
         AV30FlagRecacb = (short)(((GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", ""))==0) ? 1 : AV30FlagRecacb)) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( (0==AV27Flag) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe registro¡", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV29FlagAgr == 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Hdr AGRUPADA, eliminar la agrupacion", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV31BarSit > 6 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta Cerrada o Traspasada al Histórico", ""));
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( AV28FlagRec == 1 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Hay Receta de Tinte. Cerrar primero", ""));
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( AV30FlagRecacb == 1 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Hay Receta de Acabados. Cerrar primero", ""));
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV22DisDes, httpContext.getMessage( "S", "")) == 0 )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Opcion con detalle de rollos, NO programada", ""));
                        GX_FocusControl = edtavBarcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        httpContext.popup(formatLink("app.formulaciontinte.particiondehdrs_2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV32Barser)),GXutil.URLEncode(GXutil.rtrim(AV33Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV34Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV35Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV36Barkgm)),GXutil.URLEncode(DecimalUtil.decToString(AV37BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(DecimalUtil.decToString(AV45Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV39Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV40BarCosAny)),GXutil.URLEncode(DecimalUtil.decToString(AV41BarCosPro)),GXutil.URLEncode(GXutil.rtrim(AV51Barunimed)),GXutil.URLEncode(GXutil.rtrim(AV46Ok))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","Barunimed","OK"}) , new Object[] {"AV24EmprCod","AV19BarCod","AV20BarCodReo","AV21BarCodPar","AV32Barser","AV33Barserdsc","AV34Barcolnom","AV35Barcolnum","AV36Barkgm","AV37BarMtr","AV38BarPiepie","","","","AV45Rectotkgm","AV39Barpes","AV40BarCosAny","AV41BarCosPro","AV51Barunimed","AV46Ok"});
                        GX_FocusControl = edtavBarcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e131LU2( )
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

   public void e141LU2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      AV48Tabla_Barcad = (short)(0) ;
      /* Using cursor H01LU5 */
      pr_default.execute(2, new Object[] {AV24EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = H01LU5_A130BarCodPar[0] ;
         A132BarCodReo = H01LU5_A132BarCodReo[0] ;
         A129BarCod = H01LU5_A129BarCod[0] ;
         A396EmprCod = H01LU5_A396EmprCod[0] ;
         A118BarAcaQui = H01LU5_A118BarAcaQui[0] ;
         A252CliCod = H01LU5_A252CliCod[0] ;
         n252CliCod = H01LU5_n252CliCod[0] ;
         A212BarSer = H01LU5_A212BarSer[0] ;
         A180BarMaqCod = H01LU5_A180BarMaqCod[0] ;
         A236BarVolMaq = H01LU5_A236BarVolMaq[0] ;
         A279CliNom = H01LU5_A279CliNom[0] ;
         A135BarColNom = H01LU5_A135BarColNom[0] ;
         A136BarColNum = H01LU5_A136BarColNum[0] ;
         A279CliNom = H01LU5_A279CliNom[0] ;
         AV48Tabla_Barcad = (short)(1) ;
         AV49BarAcaqui = A118BarAcaQui ;
         AV50CliCod = A252CliCod ;
         AV32Barser = A212BarSer ;
         AV52Barmaqcod = A180BarMaqCod ;
         AV53Barvolmaq = A236BarVolMaq ;
         AV54clinom = A279CliNom ;
         AV34Barcolnom = A135BarColNom ;
         AV35Barcolnum = A136BarColNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( (0==AV48Tabla_Barcad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe el Nº HDR", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_int5[0] = (byte)(AV28FlagRec) ;
         new app.phayrec(remoteHandle, context).execute( AV24EmprCod, AV19BarCod, AV20BarCodReo, AV21BarCodPar, GXv_int5) ;
         particiondehdrs_wp_impl.this.AV28FlagRec = GXv_int5[0] ;
         callWebObject(formatLink("app.recetasdetinte_agrupacion_ww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV52Barmaqcod)),GXutil.URLEncode(GXutil.ltrimstr(AV53Barvolmaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV54clinom)),GXutil.URLEncode(GXutil.rtrim(AV32Barser)),GXutil.URLEncode(GXutil.rtrim(AV34Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV35Barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28FlagRec,4,0))}, new String[] {"Emprcod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarVolMaq","CliCod","CliNom","BarSer","BarColNom","BarColNum","FlagRec"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e161LU2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(6,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV24EmprCod","AV19BarCod","AV20BarCodReo","AV21BarCodPar","",""});
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e151LU2( )
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
      pa1LU2( ) ;
      ws1LU2( ) ;
      we1LU2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267101113372", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/particiondehdrs_wp.js", "?20267101113372", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Particion de HDRs", "") );
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
      setEventMetadata("'DORESULTADOS'","{handler:'e121LU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV21BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'AV45Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV46Ok',fld:'vOK',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV42BarCodM',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV43BarReoM',fld:'vBARREOM',pic:'9'},{av:'AV44BarParM',fld:'vBARPARM',pic:''},{av:'AV46Ok',fld:'vOK',pic:''},{av:'AV45Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV21BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV19BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e131LU2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e141LU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV21BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A236BarVolMaq',fld:'BARVOLMAQ',pic:'ZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV21BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV19BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e161LU2',iparms:[{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV21BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV21BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV19BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV24EmprCod = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A228BarUniMed = "" ;
      A6039RecAcab = "" ;
      AV45Rectotkgm = DecimalUtil.ZERO ;
      AV46Ok = "" ;
      A118BarAcaQui = "" ;
      A180BarMaqCod = "" ;
      A279CliNom = "" ;
      A365DisDes = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV21BarCodPar = "" ;
      AV47Prompt = "" ;
      AV57Prompt_GXI = "" ;
      sImgUrl = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Station = "" ;
      AV25EmprNom = "" ;
      AV26UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV22DisDes = "" ;
      scmdbuf = "" ;
      H01LU3_A130BarCodPar = new String[] {""} ;
      H01LU3_A132BarCodReo = new byte[1] ;
      H01LU3_A129BarCod = new int[1] ;
      H01LU3_A396EmprCod = new String[] {""} ;
      H01LU3_A213BarSit = new byte[1] ;
      H01LU3_A212BarSer = new String[] {""} ;
      H01LU3_A1652BarSerDsc = new String[] {""} ;
      H01LU3_A135BarColNom = new String[] {""} ;
      H01LU3_A136BarColNum = new int[1] ;
      H01LU3_A864BarPes = new short[1] ;
      H01LU3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LU3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LU3_A120BarAgrEst = new String[] {""} ;
      H01LU3_A228BarUniMed = new String[] {""} ;
      H01LU3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LU3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LU3_A199BarPie1 = new short[1] ;
      H01LU3_A365DisDes = new String[] {""} ;
      H01LU3_A898BarPieNDes = new int[1] ;
      AV32Barser = "" ;
      AV33Barserdsc = "" ;
      AV34Barcolnom = "" ;
      AV36Barkgm = DecimalUtil.ZERO ;
      AV37BarMtr = DecimalUtil.ZERO ;
      AV40BarCosAny = DecimalUtil.ZERO ;
      AV41BarCosPro = DecimalUtil.ZERO ;
      AV51Barunimed = "" ;
      AV44BarParM = "" ;
      H01LU4_A2804RecLinMaq = new short[1] ;
      H01LU4_A130BarCodPar = new String[] {""} ;
      H01LU4_A132BarCodReo = new byte[1] ;
      H01LU4_A129BarCod = new int[1] ;
      H01LU4_A396EmprCod = new String[] {""} ;
      H01LU4_A6039RecAcab = new String[] {""} ;
      H01LU4_n6039RecAcab = new boolean[] {false} ;
      H01LU5_A130BarCodPar = new String[] {""} ;
      H01LU5_A132BarCodReo = new byte[1] ;
      H01LU5_A129BarCod = new int[1] ;
      H01LU5_A396EmprCod = new String[] {""} ;
      H01LU5_A118BarAcaQui = new String[] {""} ;
      H01LU5_A252CliCod = new int[1] ;
      H01LU5_n252CliCod = new boolean[] {false} ;
      H01LU5_A212BarSer = new String[] {""} ;
      H01LU5_A180BarMaqCod = new String[] {""} ;
      H01LU5_A236BarVolMaq = new int[1] ;
      H01LU5_A279CliNom = new String[] {""} ;
      H01LU5_A135BarColNom = new String[] {""} ;
      H01LU5_A136BarColNum = new int[1] ;
      AV49BarAcaqui = "" ;
      AV52Barmaqcod = "" ;
      AV54clinom = "" ;
      GXv_int5 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.particiondehdrs_wp__default(),
         new Object[] {
             new Object[] {
            H01LU3_A130BarCodPar, H01LU3_A132BarCodReo, H01LU3_A129BarCod, H01LU3_A396EmprCod, H01LU3_A213BarSit, H01LU3_A212BarSer, H01LU3_A1652BarSerDsc, H01LU3_A135BarColNom, H01LU3_A136BarColNum, H01LU3_A864BarPes,
            H01LU3_A140BarCosAny, H01LU3_A141BarCosPro, H01LU3_A120BarAgrEst, H01LU3_A228BarUniMed, H01LU3_A166BarKgm, H01LU3_A184BarMtr, H01LU3_A199BarPie1, H01LU3_A365DisDes, H01LU3_A898BarPieNDes
            }
            , new Object[] {
            H01LU4_A2804RecLinMaq, H01LU4_A130BarCodPar, H01LU4_A132BarCodReo, H01LU4_A129BarCod, H01LU4_A396EmprCod, H01LU4_A6039RecAcab, H01LU4_n6039RecAcab
            }
            , new Object[] {
            H01LU5_A130BarCodPar, H01LU5_A132BarCodReo, H01LU5_A129BarCod, H01LU5_A396EmprCod, H01LU5_A118BarAcaQui, H01LU5_A252CliCod, H01LU5_n252CliCod, H01LU5_A212BarSer, H01LU5_A180BarMaqCod, H01LU5_A236BarVolMaq,
            H01LU5_A279CliNom, H01LU5_A135BarColNom, H01LU5_A136BarColNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV20BarCodReo ;
   private byte nDonePA ;
   private byte AV27Flag ;
   private byte AV31BarSit ;
   private byte AV43BarReoM ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A864BarPes ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV28FlagRec ;
   private short AV29FlagAgr ;
   private short AV30FlagRecacb ;
   private short AV39Barpes ;
   private short AV48Tabla_Barcad ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A236BarVolMaq ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV19BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int AV35Barcolnum ;
   private int AV38BarPiepie ;
   private int AV42BarCodM ;
   private int AV50CliCod ;
   private int AV53Barvolmaq ;
   private int idxLst ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal AV45Rectotkgm ;
   private java.math.BigDecimal AV36Barkgm ;
   private java.math.BigDecimal AV37BarMtr ;
   private java.math.BigDecimal AV40BarCosAny ;
   private java.math.BigDecimal AV41BarCosPro ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV24EmprCod ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A120BarAgrEst ;
   private String A228BarUniMed ;
   private String A6039RecAcab ;
   private String AV46Ok ;
   private String A118BarAcaQui ;
   private String A180BarMaqCod ;
   private String A279CliNom ;
   private String A365DisDes ;
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
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV21BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV23Station ;
   private String AV25EmprNom ;
   private String AV26UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV22DisDes ;
   private String scmdbuf ;
   private String AV32Barser ;
   private String AV33Barserdsc ;
   private String AV34Barcolnom ;
   private String AV51Barunimed ;
   private String AV44BarParM ;
   private String AV49BarAcaqui ;
   private String AV52Barmaqcod ;
   private String AV54clinom ;
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
   private boolean AV47Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n252CliCod ;
   private String AV57Prompt_GXI ;
   private String AV47Prompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private IDataStoreProvider pr_default ;
   private String[] H01LU3_A130BarCodPar ;
   private byte[] H01LU3_A132BarCodReo ;
   private int[] H01LU3_A129BarCod ;
   private String[] H01LU3_A396EmprCod ;
   private byte[] H01LU3_A213BarSit ;
   private String[] H01LU3_A212BarSer ;
   private String[] H01LU3_A1652BarSerDsc ;
   private String[] H01LU3_A135BarColNom ;
   private int[] H01LU3_A136BarColNum ;
   private short[] H01LU3_A864BarPes ;
   private java.math.BigDecimal[] H01LU3_A140BarCosAny ;
   private java.math.BigDecimal[] H01LU3_A141BarCosPro ;
   private String[] H01LU3_A120BarAgrEst ;
   private String[] H01LU3_A228BarUniMed ;
   private java.math.BigDecimal[] H01LU3_A166BarKgm ;
   private java.math.BigDecimal[] H01LU3_A184BarMtr ;
   private short[] H01LU3_A199BarPie1 ;
   private String[] H01LU3_A365DisDes ;
   private int[] H01LU3_A898BarPieNDes ;
   private short[] H01LU4_A2804RecLinMaq ;
   private String[] H01LU4_A130BarCodPar ;
   private byte[] H01LU4_A132BarCodReo ;
   private int[] H01LU4_A129BarCod ;
   private String[] H01LU4_A396EmprCod ;
   private String[] H01LU4_A6039RecAcab ;
   private boolean[] H01LU4_n6039RecAcab ;
   private String[] H01LU5_A130BarCodPar ;
   private byte[] H01LU5_A132BarCodReo ;
   private int[] H01LU5_A129BarCod ;
   private String[] H01LU5_A396EmprCod ;
   private String[] H01LU5_A118BarAcaQui ;
   private int[] H01LU5_A252CliCod ;
   private boolean[] H01LU5_n252CliCod ;
   private String[] H01LU5_A212BarSer ;
   private String[] H01LU5_A180BarMaqCod ;
   private int[] H01LU5_A236BarVolMaq ;
   private String[] H01LU5_A279CliNom ;
   private String[] H01LU5_A135BarColNom ;
   private int[] H01LU5_A136BarColNum ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class particiondehdrs_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LU3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarSit, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarPes, T1.BarCosAny, T1.BarCosPro, T1.BarAgrEst, T1.BarUniMed, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01LU4", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecAcab FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01LU5", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarAcaQui, T1.CliCod, T1.BarSer, T1.BarMaqCod, T1.BarVolMaq, T2.CliNom, T1.BarColNom, T1.BarColNum FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

