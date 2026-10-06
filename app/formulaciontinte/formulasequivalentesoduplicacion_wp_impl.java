package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class formulasequivalentesoduplicacion_wp_impl extends GXDataArea
{
   public formulasequivalentesoduplicacion_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public formulasequivalentesoduplicacion_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( formulasequivalentesoduplicacion_wp_impl.class ));
   }

   public formulasequivalentesoduplicacion_wp_impl( int remoteHandle ,
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
      pa1LA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1LA2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.formulasequivalentesoduplicacion_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTEARTICU", GXutil.ltrim( localUtil.ntoc( AV28ExisteArticu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Title", GXutil.rtrim( Dvelop_confirmpanel_resultados_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_resultados_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultados_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultados_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultados_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_resultados_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_resultados_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Result", GXutil.rtrim( Dvelop_confirmpanel_resultados_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Result", GXutil.rtrim( Dvelop_confirmpanel_resultados_Result));
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
         we1LA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1LA2( ) ;
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
      return formatLink("app.formulaciontinte.formulasequivalentesoduplicacion_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.FormulasEquivalentesoDuplicacion_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Formulas Equivalentes o Duplicacion", "") ;
   }

   public void wb1LA0( )
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
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Color Origen", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divColororigen_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodfrom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV11CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11CliCodfrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11CliCodfrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodfrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForserfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForserfrom_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForserfrom_Internalname, GXutil.rtrim( AV12ForSerfrom), GXutil.rtrim( localUtil.format( AV12ForSerfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForserfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForserfrom_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnomfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnomfrom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnomfrom_Internalname, GXutil.rtrim( AV13ForColNomfrom), GXutil.rtrim( localUtil.format( AV13ForColNomfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnomfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnomfrom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnumfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnumfrom_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnumfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV14ForColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnumfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14ForColNumfrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14ForColNumfrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnumfrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcodfrom_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV15TipColCodfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15TipColCodfrom), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV15TipColCodfrom), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcodfrom_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFornomclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFornomclifrom_Internalname, httpContext.getMessage( "Color Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFornomclifrom_Internalname, GXutil.rtrim( AV23ForNomClifrom), GXutil.rtrim( localUtil.format( AV23ForNomClifrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFornomclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFornomclifrom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFornumclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFornumclifrom_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFornumclifrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV24ForNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFornumclifrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24ForNumClifrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24ForNumClifrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFornumclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFornumclifrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV25prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV25prompt)==0)&&(GXutil.strcmp("", AV31Prompt_GXI)==0))||!(GXutil.strcmp("", AV25prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV25prompt)==0) ? AV31Prompt_GXI : httpContext.getResourceRelative(AV25prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV25prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOpcion.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOpcion, cmbavOpcion.getInternalname(), GXutil.trim( GXutil.str( AV5Opcion, 1, 0)), 1, cmbavOpcion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOpcion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV5Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, httpContext.getMessage( "Color Destino", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divColordestino_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodto_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6CliCodto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6CliCodto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForserto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForserto_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForserto_Internalname, GXutil.rtrim( AV7ForSerto), GXutil.rtrim( localUtil.format( AV7ForSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnomto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnomto_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnomto_Internalname, GXutil.rtrim( AV8ForColNomto), GXutil.rtrim( localUtil.format( AV8ForColNomto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnomto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnomto_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnumto_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnumto_Internalname, GXutil.ltrim( localUtil.ntoc( AV9ForColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnumto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9ForColNumto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9ForColNumto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnumto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcodto_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV10TipColCodto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10TipColCodto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV10TipColCodto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcodto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFornomclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFornomclito_Internalname, httpContext.getMessage( "Color Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFornomclito_Internalname, GXutil.rtrim( AV21ForNomClito), GXutil.rtrim( localUtil.format( AV21ForNomClito, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFornomclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFornomclito_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFornumclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFornumclito_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFornumclito_Internalname, GXutil.ltrim( localUtil.ntoc( AV22ForNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFornumclito_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22ForNumClito), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22ForNumClito), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFornumclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFornumclito_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\FormulasEquivalentesoDuplicacion_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table1_122_1LA2( true) ;
      }
      else
      {
         wb_table1_122_1LA2( false) ;
      }
      return  ;
   }

   public void wb_table1_122_1LA2e( boolean wbgen )
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

   public void start1LA2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Formulas Equivalentes o Duplicacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1LA0( ) ;
   }

   public void ws1LA2( )
   {
      start1LA2( ) ;
      evt1LA2( ) ;
   }

   public void evt1LA2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111LA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e121LA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e131LA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141LA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e151LA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161LA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171LA2 ();
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

   public void we1LA2( )
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

   public void pa1LA2( )
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
            GX_FocusControl = edtavClicodfrom_Internalname ;
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
         AV5Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV5Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Opcion", GXutil.str( AV5Opcion, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV5Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1LA2( ) ;
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

   public void rf1LA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e151LA2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171LA2 ();
         wb1LA0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1LA2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1LA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121LA2 ();
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
         Dvelop_confirmpanel_resultados_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Title") ;
         Dvelop_confirmpanel_resultados_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmationtext") ;
         Dvelop_confirmpanel_resultados_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_resultados_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_resultados_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_resultados_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_resultados_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmtype") ;
         Dvelop_confirmpanel_resultados_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodfrom), 6, 0));
         }
         else
         {
            AV11CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodfrom), 6, 0));
         }
         AV12ForSerfrom = httpContext.cgiGet( edtavForserfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12ForSerfrom", AV12ForSerfrom);
         AV13ForColNomfrom = httpContext.cgiGet( edtavForcolnomfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ForColNomfrom", AV13ForColNomfrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUMFROM");
            GX_FocusControl = edtavForcolnumfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14ForColNumfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ForColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForColNumfrom), 6, 0));
         }
         else
         {
            AV14ForColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ForColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForColNumfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCODFROM");
            GX_FocusControl = edtavTipcolcodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15TipColCodfrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TipColCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipColCodfrom), 2, 0));
         }
         else
         {
            AV15TipColCodfrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TipColCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipColCodfrom), 2, 0));
         }
         AV23ForNomClifrom = httpContext.cgiGet( edtavFornomclifrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ForNomClifrom", AV23ForNomClifrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORNUMCLIFROM");
            GX_FocusControl = edtavFornumclifrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24ForNumClifrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ForNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ForNumClifrom), 6, 0));
         }
         else
         {
            AV24ForNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavFornumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ForNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ForNumClifrom), 6, 0));
         }
         AV25prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         cmbavOpcion.setValue( httpContext.cgiGet( cmbavOpcion.getInternalname()) );
         AV5Opcion = (byte)(GXutil.lval( httpContext.cgiGet( cmbavOpcion.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Opcion", GXutil.str( AV5Opcion, 1, 0));
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
         AV7ForSerto = httpContext.cgiGet( edtavForserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ForSerto", AV7ForSerto);
         AV8ForColNomto = httpContext.cgiGet( edtavForcolnomto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8ForColNomto", AV8ForColNomto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUMTO");
            GX_FocusControl = edtavForcolnumto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9ForColNumto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNumto), 6, 0));
         }
         else
         {
            AV9ForColNumto = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNumto), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCODTO");
            GX_FocusControl = edtavTipcolcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10TipColCodto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCodto), 2, 0));
         }
         else
         {
            AV10TipColCodto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCodto), 2, 0));
         }
         AV21ForNomClito = httpContext.cgiGet( edtavFornomclito_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ForNomClito", AV21ForNomClito);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORNUMCLITO");
            GX_FocusControl = edtavFornumclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22ForNumClito = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ForNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ForNumClito), 6, 0));
         }
         else
         {
            AV22ForNumClito = (int)(localUtil.ctol( httpContext.cgiGet( edtavFornumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ForNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ForNumClito), 6, 0));
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
      e121LA2 ();
      if (returnInSub) return;
   }

   public void e121LA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      formulasequivalentesoduplicacion_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = AV17EmprCod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      formulasequivalentesoduplicacion_wp_impl.this.AV17EmprCod = GXv_char2[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV18EmprNom = GXv_char3[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      GXt_char1 = AV16Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      formulasequivalentesoduplicacion_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16Station = GXt_char1 ;
      GXv_char4[0] = AV17EmprCod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char2[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char4, GXv_char3, GXv_char2) ;
      formulasequivalentesoduplicacion_wp_impl.this.AV17EmprCod = GXv_char4[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV18EmprNom = GXv_char3[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV19UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV25prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV25prompt)==0) ? AV31Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV25prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV25prompt), true);
      AV31Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV25prompt)==0) ? AV31Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV25prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV25prompt), true);
   }

   public void e131LA2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      if ( (0==AV11CliCodfrom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Origen sin valor", ""));
         GX_FocusControl = edtavClicodfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXt_char1 = AV27var_clinom ;
         GXv_char4[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( AV17EmprCod, AV11CliCodfrom, GXv_char4) ;
         formulasequivalentesoduplicacion_wp_impl.this.GXt_char1 = GXv_char4[0] ;
         AV27var_clinom = GXt_char1 ;
         if ( GXutil.strcmp(AV27var_clinom, httpContext.getMessage( "Error", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Origen Inexistente", ""));
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char4[0] = AV17EmprCod ;
            GXv_int5[0] = AV11CliCodfrom ;
            GXv_char3[0] = AV12ForSerfrom ;
            GXv_char2[0] = " " ;
            GXv_int6[0] = (byte)(AV28ExisteArticu) ;
            new app.pbusard(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6) ;
            formulasequivalentesoduplicacion_wp_impl.this.AV17EmprCod = GXv_char4[0] ;
            formulasequivalentesoduplicacion_wp_impl.this.AV11CliCodfrom = GXv_int5[0] ;
            formulasequivalentesoduplicacion_wp_impl.this.AV12ForSerfrom = GXv_char3[0] ;
            formulasequivalentesoduplicacion_wp_impl.this.AV28ExisteArticu = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodfrom), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV12ForSerfrom", AV12ForSerfrom);
            httpContext.ajax_rsp_assign_attri("", false, "AV28ExisteArticu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ExisteArticu), 4, 0));
            if ( (0==AV28ExisteArticu) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente-Articulo Origen, NO existe", ""));
            }
            else
            {
               if ( (0==AV6CliCodto) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Destino sin valor", ""));
                  GX_FocusControl = edtavClicodto_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  GXt_char1 = AV27var_clinom ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.pclinom(remoteHandle, context).execute( AV17EmprCod, AV6CliCodto, GXv_char4) ;
                  formulasequivalentesoduplicacion_wp_impl.this.GXt_char1 = GXv_char4[0] ;
                  AV27var_clinom = GXt_char1 ;
                  if ( GXutil.strcmp(AV27var_clinom, httpContext.getMessage( "Error", "")) == 0 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Destino Inexistente", ""));
                     GX_FocusControl = edtavClicodto_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     GXv_char4[0] = AV17EmprCod ;
                     GXv_int5[0] = AV6CliCodto ;
                     GXv_char3[0] = AV7ForSerto ;
                     GXv_char2[0] = " " ;
                     GXv_int6[0] = (byte)(AV28ExisteArticu) ;
                     new app.pbusard(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6) ;
                     formulasequivalentesoduplicacion_wp_impl.this.AV17EmprCod = GXv_char4[0] ;
                     formulasequivalentesoduplicacion_wp_impl.this.AV6CliCodto = GXv_int5[0] ;
                     formulasequivalentesoduplicacion_wp_impl.this.AV7ForSerto = GXv_char3[0] ;
                     formulasequivalentesoduplicacion_wp_impl.this.AV28ExisteArticu = GXv_int6[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV6CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCodto), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV7ForSerto", AV7ForSerto);
                     httpContext.ajax_rsp_assign_attri("", false, "AV28ExisteArticu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ExisteArticu), 4, 0));
                     if ( (0==AV28ExisteArticu) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente-Articulo Destino, NO existe", ""));
                     }
                     else
                     {
                        GXv_int6[0] = AV20Flag ;
                        new app.formulaciontinte.pbufori(remoteHandle, context).execute( AV17EmprCod, AV11CliCodfrom, AV12ForSerfrom, AV13ForColNomfrom, AV14ForColNumfrom, AV15TipColCodfrom, GXv_int6) ;
                        formulasequivalentesoduplicacion_wp_impl.this.AV20Flag = GXv_int6[0] ;
                        if ( (0==AV20Flag) )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe color origen ¡", ""));
                           GX_FocusControl = edtavClicodfrom_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           GXv_int6[0] = AV20Flag ;
                           new app.formulaciontinte.pbufori(remoteHandle, context).execute( AV17EmprCod, AV6CliCodto, AV7ForSerto, AV8ForColNomto, AV9ForColNumto, AV10TipColCodto, GXv_int6) ;
                           formulasequivalentesoduplicacion_wp_impl.this.AV20Flag = GXv_int6[0] ;
                           if ( AV20Flag == 1 )
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "Existe color destino ¡", ""));
                              GX_FocusControl = edtavClicodto_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                           }
                           else
                           {
                              Dvelop_confirmpanel_resultados_Confirmationtext = httpContext.getMessage( "Has seleccionado la opcion ", "")+((AV5Opcion==0) ? httpContext.getMessage( "DUPLICAR", "") : httpContext.getMessage( "EQUIVALENTE", ""))+GXutil.newLine( ) ;
                              ucDvelop_confirmpanel_resultados.sendProperty(context, "", false, Dvelop_confirmpanel_resultados_Internalname, "ConfirmationText", Dvelop_confirmpanel_resultados_Confirmationtext);
                              Dvelop_confirmpanel_resultados_Confirmationtext = Dvelop_confirmpanel_resultados_Confirmationtext+httpContext.getMessage( "Confirma el Proceso?", "") ;
                              ucDvelop_confirmpanel_resultados.sendProperty(context, "", false, Dvelop_confirmpanel_resultados_Internalname, "ConfirmationText", Dvelop_confirmpanel_resultados_Confirmationtext);
                              this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_RESULTADOSContainer", "Confirm", "", new Object[] {});
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e111LA2( )
   {
      /* Dvelop_confirmpanel_resultados_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_resultados_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RESULTADOS' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV5Opcion, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
   }

   public void e141LA2( )
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

   public void S112( )
   {
      /* 'DO ACTION RESULTADOS' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV17EmprCod ;
      GXv_int5[0] = AV11CliCodfrom ;
      GXv_char3[0] = AV12ForSerfrom ;
      GXv_char2[0] = AV13ForColNomfrom ;
      GXv_int7[0] = AV14ForColNumfrom ;
      GXv_int6[0] = AV15TipColCodfrom ;
      GXv_int8[0] = AV6CliCodto ;
      GXv_char9[0] = AV7ForSerto ;
      GXv_char10[0] = AV8ForColNomto ;
      GXv_int11[0] = AV9ForColNumto ;
      GXv_int12[0] = AV10TipColCodto ;
      GXv_char13[0] = AV21ForNomClito ;
      GXv_int14[0] = AV22ForNumClito ;
      GXv_int15[0] = AV5Opcion ;
      new app.pdupfork(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int7, GXv_int6, GXv_int8, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_char13, GXv_int14, GXv_int15) ;
      formulasequivalentesoduplicacion_wp_impl.this.AV17EmprCod = GXv_char4[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV11CliCodfrom = GXv_int5[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV12ForSerfrom = GXv_char3[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV13ForColNomfrom = GXv_char2[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV14ForColNumfrom = GXv_int7[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV15TipColCodfrom = GXv_int6[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV6CliCodto = GXv_int8[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV7ForSerto = GXv_char9[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV8ForColNomto = GXv_char10[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV9ForColNumto = GXv_int11[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV10TipColCodto = GXv_int12[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV21ForNomClito = GXv_char13[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV22ForNumClito = GXv_int14[0] ;
      formulasequivalentesoduplicacion_wp_impl.this.AV5Opcion = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodfrom), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForSerfrom", AV12ForSerfrom);
      httpContext.ajax_rsp_assign_attri("", false, "AV13ForColNomfrom", AV13ForColNomfrom);
      httpContext.ajax_rsp_assign_attri("", false, "AV14ForColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForColNumfrom), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15TipColCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipColCodfrom), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCodto), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForSerto", AV7ForSerto);
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForColNomto", AV8ForColNomto);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNumto), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCodto), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV21ForNomClito", AV21ForNomClito);
      httpContext.ajax_rsp_assign_attri("", false, "AV22ForNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ForNumClito), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5Opcion", GXutil.str( AV5Opcion, 1, 0));
      Gx_msg = ((AV5Opcion==0) ? httpContext.getMessage( "Color Duplicado creado", "") : httpContext.getMessage( "Color Equivalente creado", "")) ;
      httpContext.GX_msglist.addItem(Gx_msg);
      /* Execute user subroutine: 'LIMPIARVARIABLES' */
      S122 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e151LA2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
   }

   public void e161LA2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      AV26window.setAutoresize( 0 );
      AV26window.setWidth( 1600 );
      AV26window.setHeight( 900 );
      /* Window Datatype Object Property */
      AV26window.setUrl( formatLink("app.formulaciontinte.mtoformulastinteprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11CliCodfrom,6,0)),GXutil.URLEncode(GXutil.rtrim(AV12ForSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV13ForColNomfrom)),GXutil.URLEncode(GXutil.ltrimstr(AV14ForColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15TipColCodfrom,2,0)),GXutil.URLEncode(GXutil.rtrim(AV23ForNomClifrom)),GXutil.URLEncode(GXutil.ltrimstr(AV24ForNumClifrom,6,0))}, new String[] {"EmprCod","Clicod","Forser","Forcolnom","Forcolnum","TipColCod","ForNomcli","ForNumCli"})  );
      AV26window.setReturnParms(new Object[] {"AV11CliCodfrom","AV12ForSerfrom","AV13ForColNomfrom","AV14ForColNumfrom","AV15TipColCodfrom","AV23ForNomClifrom","AV24ForNumClifrom",});
      httpContext.newWindow(AV26window);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LIMPIARVARIABLES' Routine */
      returnInSub = false ;
      AV11CliCodfrom = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodfrom), 6, 0));
      AV12ForSerfrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForSerfrom", AV12ForSerfrom);
      AV13ForColNomfrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ForColNomfrom", AV13ForColNomfrom);
      AV14ForColNumfrom = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14ForColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForColNumfrom), 6, 0));
      AV15TipColCodfrom = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15TipColCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipColCodfrom), 2, 0));
      AV23ForNomClifrom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ForNomClifrom", AV23ForNomClifrom);
      AV24ForNumClifrom = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ForNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ForNumClifrom), 6, 0));
      AV6CliCodto = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCodto), 6, 0));
      AV7ForSerto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForSerto", AV7ForSerto);
      AV8ForColNomto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForColNomto", AV8ForColNomto);
      AV9ForColNumto = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNumto), 6, 0));
      AV10TipColCodto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCodto), 2, 0));
      AV21ForNomClito = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ForNomClito", AV21ForNomClito);
      AV22ForNumClito = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ForNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ForNumClito), 6, 0));
   }

   protected void nextLoad( )
   {
   }

   protected void e171LA2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_122_1LA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_resultados_Internalname, tblTabledvelop_confirmpanel_resultados_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_resultados.setProperty("Title", Dvelop_confirmpanel_resultados_Title);
         ucDvelop_confirmpanel_resultados.setProperty("ConfirmationText", Dvelop_confirmpanel_resultados_Confirmationtext);
         ucDvelop_confirmpanel_resultados.setProperty("YesButtonCaption", Dvelop_confirmpanel_resultados_Yesbuttoncaption);
         ucDvelop_confirmpanel_resultados.setProperty("NoButtonCaption", Dvelop_confirmpanel_resultados_Nobuttoncaption);
         ucDvelop_confirmpanel_resultados.setProperty("CancelButtonCaption", Dvelop_confirmpanel_resultados_Cancelbuttoncaption);
         ucDvelop_confirmpanel_resultados.setProperty("YesButtonPosition", Dvelop_confirmpanel_resultados_Yesbuttonposition);
         ucDvelop_confirmpanel_resultados.setProperty("ConfirmType", Dvelop_confirmpanel_resultados_Confirmtype);
         ucDvelop_confirmpanel_resultados.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_resultados_Internalname, "DVELOP_CONFIRMPANEL_RESULTADOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_RESULTADOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_122_1LA2e( true) ;
      }
      else
      {
         wb_table1_122_1LA2e( false) ;
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
      pa1LA2( ) ;
      ws1LA2( ) ;
      we1LA2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266212161430", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/formulasequivalentesoduplicacion_wp.js", "?20266212161430", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavForserfrom_Internalname = "vFORSERFROM" ;
      edtavForcolnomfrom_Internalname = "vFORCOLNOMFROM" ;
      edtavForcolnumfrom_Internalname = "vFORCOLNUMFROM" ;
      edtavTipcolcodfrom_Internalname = "vTIPCOLCODFROM" ;
      edtavFornomclifrom_Internalname = "vFORNOMCLIFROM" ;
      edtavFornumclifrom_Internalname = "vFORNUMCLIFROM" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      divColororigen_Internalname = "COLORORIGEN" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      cmbavOpcion.setInternalname( "vOPCION" );
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavForserto_Internalname = "vFORSERTO" ;
      edtavForcolnomto_Internalname = "vFORCOLNOMTO" ;
      edtavForcolnumto_Internalname = "vFORCOLNUMTO" ;
      edtavTipcolcodto_Internalname = "vTIPCOLCODTO" ;
      edtavFornomclito_Internalname = "vFORNOMCLITO" ;
      edtavFornumclito_Internalname = "vFORNUMCLITO" ;
      divColordestino_Internalname = "COLORDESTINO" ;
      grpUnnamedgroup4_Internalname = "UNNAMEDGROUP4" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_resultados_Internalname = "DVELOP_CONFIRMPANEL_RESULTADOS" ;
      tblTabledvelop_confirmpanel_resultados_Internalname = "TABLEDVELOP_CONFIRMPANEL_RESULTADOS" ;
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
      edtavFornumclito_Jsonclick = "" ;
      edtavFornumclito_Enabled = 1 ;
      edtavFornomclito_Jsonclick = "" ;
      edtavFornomclito_Enabled = 1 ;
      edtavTipcolcodto_Jsonclick = "" ;
      edtavTipcolcodto_Enabled = 1 ;
      edtavForcolnumto_Jsonclick = "" ;
      edtavForcolnumto_Enabled = 1 ;
      edtavForcolnomto_Jsonclick = "" ;
      edtavForcolnomto_Enabled = 1 ;
      edtavForserto_Jsonclick = "" ;
      edtavForserto_Enabled = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Enabled = 1 ;
      cmbavOpcion.setJsonclick( "" );
      cmbavOpcion.setEnabled( 1 );
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavFornumclifrom_Jsonclick = "" ;
      edtavFornumclifrom_Enabled = 1 ;
      edtavFornomclifrom_Jsonclick = "" ;
      edtavFornomclifrom_Enabled = 1 ;
      edtavTipcolcodfrom_Jsonclick = "" ;
      edtavTipcolcodfrom_Enabled = 1 ;
      edtavForcolnumfrom_Jsonclick = "" ;
      edtavForcolnumfrom_Enabled = 1 ;
      edtavForcolnomfrom_Jsonclick = "" ;
      edtavForcolnomfrom_Enabled = 1 ;
      edtavForserfrom_Jsonclick = "" ;
      edtavForserfrom_Enabled = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Enabled = 1 ;
      Dvelop_confirmpanel_resultados_Confirmtype = "1" ;
      Dvelop_confirmpanel_resultados_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_resultados_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_resultados_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_resultados_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_resultados_Confirmationtext = "¿Desea Duplicaro Equivalente?" ;
      Dvelop_confirmpanel_resultados_Title = "" ;
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
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Formulas Equivalentes o Duplicacion", "") );
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
      cmbavOpcion.addItem("0", httpContext.getMessage( "Duplicar", ""), (short)(0));
      cmbavOpcion.addItem("1", httpContext.getMessage( "Equivalente", ""), (short)(0));
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV5Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV5Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Opcion", GXutil.str( AV5Opcion, 1, 0));
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
      setEventMetadata("'DORESULTADOS'","{handler:'e131LA2',iparms:[{av:'AV11CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12ForSerfrom',fld:'vFORSERFROM',pic:''},{av:'AV28ExisteArticu',fld:'vEXISTEARTICU',pic:'ZZZ9'},{av:'AV6CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV7ForSerto',fld:'vFORSERTO',pic:''},{av:'AV13ForColNomfrom',fld:'vFORCOLNOMFROM',pic:''},{av:'AV14ForColNumfrom',fld:'vFORCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15TipColCodfrom',fld:'vTIPCOLCODFROM',pic:'Z9'},{av:'AV8ForColNomto',fld:'vFORCOLNOMTO',pic:''},{av:'AV9ForColNumto',fld:'vFORCOLNUMTO',pic:'ZZZZZ9'},{av:'AV10TipColCodto',fld:'vTIPCOLCODTO',pic:'Z9'},{av:'cmbavOpcion'},{av:'AV5Opcion',fld:'vOPCION',pic:'9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV28ExisteArticu',fld:'vEXISTEARTICU',pic:'ZZZ9'},{av:'AV12ForSerfrom',fld:'vFORSERFROM',pic:''},{av:'AV11CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7ForSerto',fld:'vFORSERTO',pic:''},{av:'AV6CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'Dvelop_confirmpanel_resultados_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_RESULTADOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE","{handler:'e111LA2',iparms:[{av:'Dvelop_confirmpanel_resultados_Result',ctrl:'DVELOP_CONFIRMPANEL_RESULTADOS',prop:'Result'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV12ForSerfrom',fld:'vFORSERFROM',pic:''},{av:'AV13ForColNomfrom',fld:'vFORCOLNOMFROM',pic:''},{av:'AV14ForColNumfrom',fld:'vFORCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15TipColCodfrom',fld:'vTIPCOLCODFROM',pic:'Z9'},{av:'AV6CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV7ForSerto',fld:'vFORSERTO',pic:''},{av:'AV8ForColNomto',fld:'vFORCOLNOMTO',pic:''},{av:'AV9ForColNumto',fld:'vFORCOLNUMTO',pic:'ZZZZZ9'},{av:'AV10TipColCodto',fld:'vTIPCOLCODTO',pic:'Z9'},{av:'AV21ForNomClito',fld:'vFORNOMCLITO',pic:''},{av:'AV22ForNumClito',fld:'vFORNUMCLITO',pic:'ZZZZZ9'},{av:'cmbavOpcion'},{av:'AV5Opcion',fld:'vOPCION',pic:'9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE",",oparms:[{av:'cmbavOpcion'},{av:'AV5Opcion',fld:'vOPCION',pic:'9'},{av:'AV22ForNumClito',fld:'vFORNUMCLITO',pic:'ZZZZZ9'},{av:'AV21ForNomClito',fld:'vFORNOMCLITO',pic:''},{av:'AV10TipColCodto',fld:'vTIPCOLCODTO',pic:'Z9'},{av:'AV9ForColNumto',fld:'vFORCOLNUMTO',pic:'ZZZZZ9'},{av:'AV8ForColNomto',fld:'vFORCOLNOMTO',pic:''},{av:'AV7ForSerto',fld:'vFORSERTO',pic:''},{av:'AV6CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV15TipColCodfrom',fld:'vTIPCOLCODFROM',pic:'Z9'},{av:'AV14ForColNumfrom',fld:'vFORCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV13ForColNomfrom',fld:'vFORCOLNOMFROM',pic:''},{av:'AV12ForSerfrom',fld:'vFORSERFROM',pic:''},{av:'AV11CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23ForNomClifrom',fld:'vFORNOMCLIFROM',pic:''},{av:'AV24ForNumClifrom',fld:'vFORNUMCLIFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141LA2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e161LA2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV12ForSerfrom',fld:'vFORSERFROM',pic:''},{av:'AV13ForColNomfrom',fld:'vFORCOLNOMFROM',pic:''},{av:'AV14ForColNumfrom',fld:'vFORCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15TipColCodfrom',fld:'vTIPCOLCODFROM',pic:'Z9'},{av:'AV23ForNomClifrom',fld:'vFORNOMCLIFROM',pic:''},{av:'AV24ForNumClifrom',fld:'vFORNUMCLIFROM',pic:'ZZZZZ9'}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[]}");
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
      Dvelop_confirmpanel_resultados_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV17EmprCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV12ForSerfrom = "" ;
      AV13ForColNomfrom = "" ;
      AV23ForNomClifrom = "" ;
      AV25prompt = "" ;
      AV31Prompt_GXI = "" ;
      sImgUrl = "" ;
      AV7ForSerto = "" ;
      AV8ForColNomto = "" ;
      AV21ForNomClito = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Station = "" ;
      AV18EmprNom = "" ;
      AV19UsurCod = "" ;
      AV27var_clinom = "" ;
      GXt_char1 = "" ;
      ucDvelop_confirmpanel_resultados = new com.genexus.webpanels.GXUserControl();
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int8 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int15 = new byte[1] ;
      Gx_msg = "" ;
      AV26window = new com.genexus.webpanels.GXWindow();
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV15TipColCodfrom ;
   private byte AV5Opcion ;
   private byte AV10TipColCodto ;
   private byte nDonePA ;
   private byte AV20Flag ;
   private byte GXv_int6[] ;
   private byte GXv_int12[] ;
   private byte GXv_int15[] ;
   private byte nGXWrapped ;
   private short AV28ExisteArticu ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV11CliCodfrom ;
   private int edtavClicodfrom_Enabled ;
   private int edtavForserfrom_Enabled ;
   private int edtavForcolnomfrom_Enabled ;
   private int AV14ForColNumfrom ;
   private int edtavForcolnumfrom_Enabled ;
   private int edtavTipcolcodfrom_Enabled ;
   private int edtavFornomclifrom_Enabled ;
   private int AV24ForNumClifrom ;
   private int edtavFornumclifrom_Enabled ;
   private int AV6CliCodto ;
   private int edtavClicodto_Enabled ;
   private int edtavForserto_Enabled ;
   private int edtavForcolnomto_Enabled ;
   private int AV9ForColNumto ;
   private int edtavForcolnumto_Enabled ;
   private int edtavTipcolcodto_Enabled ;
   private int edtavFornomclito_Enabled ;
   private int AV22ForNumClito ;
   private int edtavFornumclito_Enabled ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int14[] ;
   private int idxLst ;
   private String Dvelop_confirmpanel_resultados_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV17EmprCod ;
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
   private String Dvelop_confirmpanel_resultados_Title ;
   private String Dvelop_confirmpanel_resultados_Confirmationtext ;
   private String Dvelop_confirmpanel_resultados_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_resultados_Nobuttoncaption ;
   private String Dvelop_confirmpanel_resultados_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_resultados_Yesbuttonposition ;
   private String Dvelop_confirmpanel_resultados_Confirmtype ;
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
   private String grpUnnamedgroup3_Internalname ;
   private String divColororigen_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String TempTags ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavForserfrom_Internalname ;
   private String AV12ForSerfrom ;
   private String edtavForserfrom_Jsonclick ;
   private String edtavForcolnomfrom_Internalname ;
   private String AV13ForColNomfrom ;
   private String edtavForcolnomfrom_Jsonclick ;
   private String edtavForcolnumfrom_Internalname ;
   private String edtavForcolnumfrom_Jsonclick ;
   private String edtavTipcolcodfrom_Internalname ;
   private String edtavTipcolcodfrom_Jsonclick ;
   private String edtavFornomclifrom_Internalname ;
   private String AV23ForNomClifrom ;
   private String edtavFornomclifrom_Jsonclick ;
   private String edtavFornumclifrom_Internalname ;
   private String edtavFornumclifrom_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String grpUnnamedgroup4_Internalname ;
   private String divColordestino_Internalname ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavForserto_Internalname ;
   private String AV7ForSerto ;
   private String edtavForserto_Jsonclick ;
   private String edtavForcolnomto_Internalname ;
   private String AV8ForColNomto ;
   private String edtavForcolnomto_Jsonclick ;
   private String edtavForcolnumto_Internalname ;
   private String edtavForcolnumto_Jsonclick ;
   private String edtavTipcolcodto_Internalname ;
   private String edtavTipcolcodto_Jsonclick ;
   private String edtavFornomclito_Internalname ;
   private String AV21ForNomClito ;
   private String edtavFornomclito_Jsonclick ;
   private String edtavFornumclito_Internalname ;
   private String edtavFornumclito_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV16Station ;
   private String AV18EmprNom ;
   private String AV19UsurCod ;
   private String AV27var_clinom ;
   private String GXt_char1 ;
   private String Dvelop_confirmpanel_resultados_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char13[] ;
   private String Gx_msg ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_resultados_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean AV25prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV31Prompt_GXI ;
   private String AV25prompt ;
   private com.genexus.webpanels.GXWindow AV26window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_resultados ;
   private HTMLChoice cmbavOpcion ;
   private com.genexus.webpanels.GXWebForm Form ;
}

