package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class desagruparfacturas_impl extends GXDataArea
{
   public desagruparfacturas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public desagruparfacturas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( desagruparfacturas_impl.class ));
   }

   public desagruparfacturas_impl( int remoteHandle ,
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
      pa1ZF2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1ZF2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.desagruparfacturas", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOD", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPRI", GXutil.rtrim( A450FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPFAC", GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACSERNUM", GXutil.rtrim( A2739FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFCH", localUtil.dtoc( A436FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "FACANULADA", GXutil.rtrim( A14226FacAnulada));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACSERNUM", GXutil.rtrim( AV8FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FACEST", GXutil.ltrim( localUtil.ntoc( A435FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV10Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
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
         we1ZF2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1ZF2( ) ;
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
      return formatLink("app.facturacion.desagruparfacturas", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.DesAgruparFacturas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Des Agrupar Facturas", "") ;
   }

   public void wb1ZF0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNumfac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNumfac_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNumfac_Internalname, GXutil.ltrim( localUtil.ntoc( AV5NumFac, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNumfac_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5NumFac), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5NumFac), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNumfac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNumfac_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\DesAgruparFacturas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSerief_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSerief_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSerief_Internalname, GXutil.ltrim( localUtil.ntoc( AV6SerieF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSerief_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6SerieF), "9") : localUtil.format( DecimalUtil.doubleToDec(AV6SerieF), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSerief_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSerief_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\DesAgruparFacturas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrio_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrio_Internalname, GXutil.rtrim( AV7PRIO), GXutil.rtrim( localUtil.format( AV7PRIO, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrio_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DesAgruparFacturas.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DesAgruparFacturas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnprioridad_Internalname, "", httpContext.getMessage( "P", ""), bttBtnprioridad_Jsonclick, 5, httpContext.getMessage( "P", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPRIORIDAD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DesAgruparFacturas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnseries_Internalname, "", httpContext.getMessage( "Series", ""), bttBtnseries_Jsonclick, 7, httpContext.getMessage( "Series", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111zf1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\DesAgruparFacturas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DesAgruparFacturas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV24Pgmname), GXutil.rtrim( localUtil.format( AV24Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DesAgruparFacturas.htm");
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
         wb_table1_63_1ZF2( true) ;
      }
      else
      {
         wb_table1_63_1ZF2( false) ;
      }
      return  ;
   }

   public void wb_table1_63_1ZF2e( boolean wbgen )
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

   public void start1ZF2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Des Agrupar Facturas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1ZF0( ) ;
   }

   public void ws1ZF2( )
   {
      start1ZF2( ) ;
      evt1ZF2( ) ;
   }

   public void evt1ZF2( )
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
                           e121ZF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131ZF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e141ZF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e151ZF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e161ZF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPRIORIDAD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPrioridad' */
                           e171ZF2 ();
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

   public void we1ZF2( )
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

   public void pa1ZF2( )
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
            GX_FocusControl = edtavNumfac_Internalname ;
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
      rf1ZF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV24Pgmname = "Facturacion.DesAgruparFacturas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
      Gx_err = (short)(0) ;
      edtavSerief_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerief_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSerief_Enabled), 5, 0), true);
      edtavPrio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrio_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1ZF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01ZF2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e161ZF2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1ZF0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1ZF2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACSERNUM", GXutil.rtrim( AV8FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
   }

   public void before_start_formulas( )
   {
      AV24Pgmname = "Facturacion.DesAgruparFacturas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
      Gx_err = (short)(0) ;
      edtavSerief_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerief_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSerief_Enabled), 5, 0), true);
      edtavPrio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrio_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1ZF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131ZF2 ();
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
         Dvelop_confirmpanel_resultados_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Title") ;
         Dvelop_confirmpanel_resultados_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmationtext") ;
         Dvelop_confirmpanel_resultados_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_resultados_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_resultados_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_resultados_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_resultados_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmtype") ;
         Dvelop_confirmpanel_resultados_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumfac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumfac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMFAC");
            GX_FocusControl = edtavNumfac_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5NumFac = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5NumFac", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5NumFac), 8, 0));
         }
         else
         {
            AV5NumFac = (int)(localUtil.ctol( httpContext.cgiGet( edtavNumfac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5NumFac", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5NumFac), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSerief_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSerief_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSERIEF");
            GX_FocusControl = edtavSerief_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6SerieF = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6SerieF", GXutil.str( AV6SerieF, 1, 0));
         }
         else
         {
            AV6SerieF = (byte)(localUtil.ctol( httpContext.cgiGet( edtavSerief_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6SerieF", GXutil.str( AV6SerieF, 1, 0));
         }
         AV7PRIO = httpContext.cgiGet( edtavPrio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7PRIO", AV7PRIO);
         AV24Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
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
      e131ZF2 ();
      if (returnInSub) return;
   }

   public void e131ZF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      desagruparfacturas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      desagruparfacturas_impl.this.A396EmprCod = GXv_char2[0] ;
      desagruparfacturas_impl.this.AV15EmprNom = GXv_char3[0] ;
      desagruparfacturas_impl.this.AV16UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV17EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      AV6SerieF = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6SerieF", GXutil.str( AV6SerieF, 1, 0));
      AV7PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7PRIO", AV7PRIO);
      /* Execute user subroutine: 'SERIES' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV14Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      desagruparfacturas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14Station = GXt_char1 ;
      GXv_char4[0] = AV17EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char2[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char4, GXv_char3, GXv_char2) ;
      desagruparfacturas_impl.this.AV17EmprCod = GXv_char4[0] ;
      desagruparfacturas_impl.this.AV15EmprNom = GXv_char3[0] ;
      desagruparfacturas_impl.this.AV16UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
   }

   public void e141ZF2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV9FlagFac = (short)(0) ;
      /* Using cursor H01ZF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV5NumFac), AV7PRIO});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2739FacSerNum = H01ZF3_A2739FacSerNum[0] ;
         A1153FacTipFac = H01ZF3_A1153FacTipFac[0] ;
         A450FacPri = H01ZF3_A450FacPri[0] ;
         A430FacCod = H01ZF3_A430FacCod[0] ;
         A436FacFch = H01ZF3_A436FacFch[0] ;
         A14226FacAnulada = H01ZF3_A14226FacAnulada[0] ;
         AV10Fecha = A436FacFch ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Fecha", localUtil.format(AV10Fecha, "99/99/99"));
         AV11FacAnulada = A14226FacAnulada ;
         AV9FlagFac = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV9FlagFac == 1 )
      {
         if ( GXutil.strcmp(AV11FacAnulada, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Fatura ANULADA!", ""));
            GX_FocusControl = edtavNumfac_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV12Flag = (byte)(0) ;
            Gx_msg = "" ;
            /* Using cursor H01ZF4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV5NumFac), AV7PRIO, AV8FacSerNum});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2739FacSerNum = H01ZF4_A2739FacSerNum[0] ;
               A1153FacTipFac = H01ZF4_A1153FacTipFac[0] ;
               A450FacPri = H01ZF4_A450FacPri[0] ;
               A430FacCod = H01ZF4_A430FacCod[0] ;
               A436FacFch = H01ZF4_A436FacFch[0] ;
               A435FacEst = H01ZF4_A435FacEst[0] ;
               A14226FacAnulada = H01ZF4_A14226FacAnulada[0] ;
               if ( ( A435FacEst > 1 ) && (( GXutil.resetTime(A436FacFch).after( GXutil.resetTime( AV10Fecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV10Fecha)) )) )
               {
                  Gx_msg = httpContext.getMessage( "Hay facturas con Estado superior a 1!", "") ;
                  AV12Flag = (byte)(1) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               if ( GXutil.strcmp(A14226FacAnulada, httpContext.getMessage( "S", "")) == 0 )
               {
                  Gx_msg = httpContext.getMessage( "Hay facturas con Estado ANULADA!", "") ;
                  AV12Flag = (byte)(1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV12Flag == 1 )
            {
               httpContext.GX_msglist.addItem(Gx_msg);
               GX_FocusControl = edtavNumfac_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_RESULTADOSContainer", "Confirm", "", new Object[] {});
            }
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo de Factura inexistente", ""));
         GX_FocusControl = edtavNumfac_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e121ZF2( )
   {
      /* Dvelop_confirmpanel_resultados_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_resultados_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RESULTADOS' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ProgressIndicator", AV20ProgressIndicator);
   }

   public void e171ZF2( )
   {
      /* 'DoPrioridad' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV7PRIO, "1") == 0 )
      {
         AV7PRIO = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7PRIO", AV7PRIO);
      }
      else
      {
         AV7PRIO = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7PRIO", AV7PRIO);
      }
      /*  Sending Event outputs  */
   }

   public void e151ZF2( )
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

   public void S122( )
   {
      /* 'DO ACTION RESULTADOS' Routine */
      returnInSub = false ;
      AV20ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV20ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV20ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV20ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV20ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV20ProgressIndicator.show();
      AV18CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      /* Using cursor H01ZF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV5NumFac), AV10Fecha, AV7PRIO, AV8FacSerNum});
      cV18CantidadRegistrosAProcesar = H01ZF5_AV18CantidadRegistrosAProcesar[0] ;
      pr_default.close(3);
      AV18CantidadRegistrosAProcesar = (short)(AV18CantidadRegistrosAProcesar+cV18CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV18CantidadRegistrosAProcesar == 0 )
      {
         AV18CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV19CantidadRegistrosProcesados = (short)(0) ;
      /* Using cursor H01ZF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV5NumFac), AV10Fecha, AV7PRIO, AV8FacSerNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A436FacFch = H01ZF6_A436FacFch[0] ;
         A2739FacSerNum = H01ZF6_A2739FacSerNum[0] ;
         A1153FacTipFac = H01ZF6_A1153FacTipFac[0] ;
         A450FacPri = H01ZF6_A450FacPri[0] ;
         A430FacCod = H01ZF6_A430FacCod[0] ;
         A279CliNom = H01ZF6_A279CliNom[0] ;
         A252CliCod = H01ZF6_A252CliCod[0] ;
         A279CliNom = H01ZF6_A279CliNom[0] ;
         new app.facturacion.pdesfac(remoteHandle, context).execute( A396EmprCod, A430FacCod, AV7PRIO) ;
         AV13OK = httpContext.getMessage( "S", "") ;
         AV19CantidadRegistrosProcesados = (short)(AV19CantidadRegistrosProcesados+1) ;
         AV21Porcentaje = (short)((AV19CantidadRegistrosProcesados/ (double) (AV18CantidadRegistrosAProcesar))*100) ;
         AV20ProgressIndicator.setgxTv_SdtProgress_Value( AV21Porcentaje );
         AV20ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV19CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV18CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A279CliNom), "", "", "", "", ""));
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV20ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV20ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV20ProgressIndicator.hide();
   }

   public void S112( )
   {
      /* 'SERIES' Routine */
      returnInSub = false ;
      /* Using cursor H01ZF7 */
      pr_default.execute(5, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A407EmprNom = H01ZF7_A407EmprNom[0] ;
         n407EmprNom = H01ZF7_n407EmprNom[0] ;
         A963Ser1 = H01ZF7_A963Ser1[0] ;
         n963Ser1 = H01ZF7_n963Ser1[0] ;
         A2387Ser2 = H01ZF7_A2387Ser2[0] ;
         n2387Ser2 = H01ZF7_n2387Ser2[0] ;
         A2389Ser3 = H01ZF7_A2389Ser3[0] ;
         n2389Ser3 = H01ZF7_n2389Ser3[0] ;
         A4215Ser4 = H01ZF7_A4215Ser4[0] ;
         n4215Ser4 = H01ZF7_n4215Ser4[0] ;
         A4217Ser5 = H01ZF7_A4217Ser5[0] ;
         n4217Ser5 = H01ZF7_n4217Ser5[0] ;
         A4219Ser6 = H01ZF7_A4219Ser6[0] ;
         n4219Ser6 = H01ZF7_n4219Ser6[0] ;
         A4221Ser7 = H01ZF7_A4221Ser7[0] ;
         n4221Ser7 = H01ZF7_n4221Ser7[0] ;
         A964Ser0 = H01ZF7_A964Ser0[0] ;
         n964Ser0 = H01ZF7_n964Ser0[0] ;
         A2388Ser20 = H01ZF7_A2388Ser20[0] ;
         n2388Ser20 = H01ZF7_n2388Ser20[0] ;
         A2390Ser30 = H01ZF7_A2390Ser30[0] ;
         n2390Ser30 = H01ZF7_n2390Ser30[0] ;
         A4216Ser40 = H01ZF7_A4216Ser40[0] ;
         n4216Ser40 = H01ZF7_n4216Ser40[0] ;
         A4218Ser50 = H01ZF7_A4218Ser50[0] ;
         n4218Ser50 = H01ZF7_n4218Ser50[0] ;
         A4220Ser60 = H01ZF7_A4220Ser60[0] ;
         n4220Ser60 = H01ZF7_n4220Ser60[0] ;
         A4222Ser70 = H01ZF7_A4222Ser70[0] ;
         n4222Ser70 = H01ZF7_n4222Ser70[0] ;
         if ( GXutil.strcmp(AV7PRIO, "1") == 0 )
         {
            if ( AV6SerieF == 1 )
            {
               AV8FacSerNum = A963Ser1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
            }
            else
            {
               if ( AV6SerieF == 2 )
               {
                  AV8FacSerNum = A2387Ser2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
               }
               else
               {
                  if ( AV6SerieF == 3 )
                  {
                     AV8FacSerNum = A2389Ser3 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                     app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                  }
                  else
                  {
                     if ( AV6SerieF == 4 )
                     {
                        AV8FacSerNum = A4215Ser4 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                     }
                     else
                     {
                        if ( AV6SerieF == 5 )
                        {
                           AV8FacSerNum = A4217Ser5 ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                        }
                        else
                        {
                           if ( AV6SerieF == 6 )
                           {
                              AV8FacSerNum = A4219Ser6 ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                           }
                           else
                           {
                              if ( AV6SerieF == 7 )
                              {
                                 AV8FacSerNum = A4221Ser7 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                                 app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         else
         {
            if ( AV6SerieF == 1 )
            {
               AV8FacSerNum = A964Ser0 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
            }
            else
            {
               if ( AV6SerieF == 2 )
               {
                  AV8FacSerNum = A2388Ser20 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
               }
               else
               {
                  if ( AV6SerieF == 3 )
                  {
                     AV8FacSerNum = A2390Ser30 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                     app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                  }
                  else
                  {
                     if ( AV6SerieF == 4 )
                     {
                        AV8FacSerNum = A4216Ser40 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                     }
                     else
                     {
                        if ( AV6SerieF == 5 )
                        {
                           AV8FacSerNum = A4218Ser50 ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                        }
                        else
                        {
                           if ( AV6SerieF == 6 )
                           {
                              AV8FacSerNum = A4220Ser60 ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                           }
                           else
                           {
                              if ( AV6SerieF == 7 )
                              {
                                 AV8FacSerNum = A4222Ser70 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV8FacSerNum", AV8FacSerNum);
                                 app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACSERNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FacSerNum, ""))));
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void nextLoad( )
   {
   }

   protected void e161ZF2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_63_1ZF2( boolean wbgen )
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
         wb_table1_63_1ZF2e( true) ;
      }
      else
      {
         wb_table1_63_1ZF2e( false) ;
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
      pa1ZF2( ) ;
      ws1ZF2( ) ;
      we1ZF2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415131410", true, true);
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
      httpContext.AddJavascriptSource("facturacion/desagruparfacturas.js", "?202682415131410", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavNumfac_Internalname = "vNUMFAC" ;
      edtavSerief_Internalname = "vSERIEF" ;
      edtavPrio_Internalname = "vPRIO" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnprioridad_Internalname = "BTNPRIORIDAD" ;
      bttBtnseries_Internalname = "BTNSERIES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPrio_Jsonclick = "" ;
      edtavPrio_Enabled = 1 ;
      edtavSerief_Jsonclick = "" ;
      edtavSerief_Enabled = 1 ;
      edtavNumfac_Jsonclick = "" ;
      edtavNumfac_Enabled = 1 ;
      Dvelop_confirmpanel_resultados_Confirmtype = "1" ;
      Dvelop_confirmpanel_resultados_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_resultados_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_resultados_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_resultados_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_resultados_Confirmationtext = "¿Confirma el Proceso?" ;
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
      Form.setCaption( httpContext.getMessage( "Des Agrupar Facturas", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8FacSerNum',fld:'vFACSERNUM',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e141ZF2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV5NumFac',fld:'vNUMFAC',pic:'ZZZZZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'AV7PRIO',fld:'vPRIO',pic:'9'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A2739FacSerNum',fld:'FACSERNUM',pic:''},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A14226FacAnulada',fld:'FACANULADA',pic:''},{av:'AV8FacSerNum',fld:'vFACSERNUM',pic:'',hsh:true},{av:'A435FacEst',fld:'FACEST',pic:'9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV10Fecha',fld:'vFECHA',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE","{handler:'e121ZF2',iparms:[{av:'Dvelop_confirmpanel_resultados_Result',ctrl:'DVELOP_CONFIRMPANEL_RESULTADOS',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV5NumFac',fld:'vNUMFAC',pic:'ZZZZZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'AV7PRIO',fld:'vPRIO',pic:'9'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A2739FacSerNum',fld:'FACSERNUM',pic:''},{av:'AV8FacSerNum',fld:'vFACSERNUM',pic:'',hsh:true},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'AV10Fecha',fld:'vFECHA',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE",",oparms:[]}");
      setEventMetadata("'DOPRIORIDAD'","{handler:'e171ZF2',iparms:[{av:'AV7PRIO',fld:'vPRIO',pic:'9'}]");
      setEventMetadata("'DOPRIORIDAD'",",oparms:[{av:'AV7PRIO',fld:'vPRIO',pic:'9'}]}");
      setEventMetadata("'DOSERIES'","{handler:'e111ZF1',iparms:[{av:'AV6SerieF',fld:'vSERIEF',pic:'9'}]");
      setEventMetadata("'DOSERIES'",",oparms:[{av:'AV6SerieF',fld:'vSERIEF',pic:'9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e151ZF2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_NUMFAC","{handler:'validv_Numfac',iparms:[]");
      setEventMetadata("VALIDV_NUMFAC",",oparms:[]}");
      setEventMetadata("VALIDV_PRIO","{handler:'validv_Prio',iparms:[]");
      setEventMetadata("VALIDV_PRIO",",oparms:[]}");
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
      A396EmprCod = "" ;
      AV8FacSerNum = "" ;
      GXKey = "" ;
      A450FacPri = "" ;
      A2739FacSerNum = "" ;
      A436FacFch = GXutil.nullDate() ;
      A14226FacAnulada = "" ;
      AV10Fecha = GXutil.nullDate() ;
      A279CliNom = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7PRIO = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnprioridad_Jsonclick = "" ;
      bttBtnseries_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      AV24Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01ZF2_A396EmprCod = new String[] {""} ;
      AV14Station = "" ;
      AV15EmprNom = "" ;
      AV16UsurCod = "" ;
      AV17EmprCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      H01ZF3_A396EmprCod = new String[] {""} ;
      H01ZF3_A2739FacSerNum = new String[] {""} ;
      H01ZF3_A1153FacTipFac = new byte[1] ;
      H01ZF3_A450FacPri = new String[] {""} ;
      H01ZF3_A430FacCod = new int[1] ;
      H01ZF3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZF3_A14226FacAnulada = new String[] {""} ;
      AV11FacAnulada = "" ;
      Gx_msg = "" ;
      H01ZF4_A396EmprCod = new String[] {""} ;
      H01ZF4_A2739FacSerNum = new String[] {""} ;
      H01ZF4_A1153FacTipFac = new byte[1] ;
      H01ZF4_A450FacPri = new String[] {""} ;
      H01ZF4_A430FacCod = new int[1] ;
      H01ZF4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZF4_A435FacEst = new byte[1] ;
      H01ZF4_A14226FacAnulada = new String[] {""} ;
      AV20ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      H01ZF5_AV18CantidadRegistrosAProcesar = new short[1] ;
      H01ZF6_A396EmprCod = new String[] {""} ;
      H01ZF6_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZF6_A2739FacSerNum = new String[] {""} ;
      H01ZF6_A1153FacTipFac = new byte[1] ;
      H01ZF6_A450FacPri = new String[] {""} ;
      H01ZF6_A430FacCod = new int[1] ;
      H01ZF6_A279CliNom = new String[] {""} ;
      H01ZF6_A252CliCod = new int[1] ;
      AV13OK = "" ;
      H01ZF7_A396EmprCod = new String[] {""} ;
      H01ZF7_A407EmprNom = new String[] {""} ;
      H01ZF7_n407EmprNom = new boolean[] {false} ;
      H01ZF7_A963Ser1 = new String[] {""} ;
      H01ZF7_n963Ser1 = new boolean[] {false} ;
      H01ZF7_A2387Ser2 = new String[] {""} ;
      H01ZF7_n2387Ser2 = new boolean[] {false} ;
      H01ZF7_A2389Ser3 = new String[] {""} ;
      H01ZF7_n2389Ser3 = new boolean[] {false} ;
      H01ZF7_A4215Ser4 = new String[] {""} ;
      H01ZF7_n4215Ser4 = new boolean[] {false} ;
      H01ZF7_A4217Ser5 = new String[] {""} ;
      H01ZF7_n4217Ser5 = new boolean[] {false} ;
      H01ZF7_A4219Ser6 = new String[] {""} ;
      H01ZF7_n4219Ser6 = new boolean[] {false} ;
      H01ZF7_A4221Ser7 = new String[] {""} ;
      H01ZF7_n4221Ser7 = new boolean[] {false} ;
      H01ZF7_A964Ser0 = new String[] {""} ;
      H01ZF7_n964Ser0 = new boolean[] {false} ;
      H01ZF7_A2388Ser20 = new String[] {""} ;
      H01ZF7_n2388Ser20 = new boolean[] {false} ;
      H01ZF7_A2390Ser30 = new String[] {""} ;
      H01ZF7_n2390Ser30 = new boolean[] {false} ;
      H01ZF7_A4216Ser40 = new String[] {""} ;
      H01ZF7_n4216Ser40 = new boolean[] {false} ;
      H01ZF7_A4218Ser50 = new String[] {""} ;
      H01ZF7_n4218Ser50 = new boolean[] {false} ;
      H01ZF7_A4220Ser60 = new String[] {""} ;
      H01ZF7_n4220Ser60 = new boolean[] {false} ;
      H01ZF7_A4222Ser70 = new String[] {""} ;
      H01ZF7_n4222Ser70 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A4215Ser4 = "" ;
      A4217Ser5 = "" ;
      A4219Ser6 = "" ;
      A4221Ser7 = "" ;
      A964Ser0 = "" ;
      A2388Ser20 = "" ;
      A2390Ser30 = "" ;
      A4216Ser40 = "" ;
      A4218Ser50 = "" ;
      A4220Ser60 = "" ;
      A4222Ser70 = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_resultados = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.desagruparfacturas__default(),
         new Object[] {
             new Object[] {
            H01ZF2_A396EmprCod
            }
            , new Object[] {
            H01ZF3_A396EmprCod, H01ZF3_A2739FacSerNum, H01ZF3_A1153FacTipFac, H01ZF3_A450FacPri, H01ZF3_A430FacCod, H01ZF3_A436FacFch, H01ZF3_A14226FacAnulada
            }
            , new Object[] {
            H01ZF4_A396EmprCod, H01ZF4_A2739FacSerNum, H01ZF4_A1153FacTipFac, H01ZF4_A450FacPri, H01ZF4_A430FacCod, H01ZF4_A436FacFch, H01ZF4_A435FacEst, H01ZF4_A14226FacAnulada
            }
            , new Object[] {
            H01ZF5_AV18CantidadRegistrosAProcesar
            }
            , new Object[] {
            H01ZF6_A396EmprCod, H01ZF6_A436FacFch, H01ZF6_A2739FacSerNum, H01ZF6_A1153FacTipFac, H01ZF6_A450FacPri, H01ZF6_A430FacCod, H01ZF6_A279CliNom, H01ZF6_A252CliCod
            }
            , new Object[] {
            H01ZF7_A396EmprCod, H01ZF7_A407EmprNom, H01ZF7_n407EmprNom, H01ZF7_A963Ser1, H01ZF7_n963Ser1, H01ZF7_A2387Ser2, H01ZF7_n2387Ser2, H01ZF7_A2389Ser3, H01ZF7_n2389Ser3, H01ZF7_A4215Ser4,
            H01ZF7_n4215Ser4, H01ZF7_A4217Ser5, H01ZF7_n4217Ser5, H01ZF7_A4219Ser6, H01ZF7_n4219Ser6, H01ZF7_A4221Ser7, H01ZF7_n4221Ser7, H01ZF7_A964Ser0, H01ZF7_n964Ser0, H01ZF7_A2388Ser20,
            H01ZF7_n2388Ser20, H01ZF7_A2390Ser30, H01ZF7_n2390Ser30, H01ZF7_A4216Ser40, H01ZF7_n4216Ser40, H01ZF7_A4218Ser50, H01ZF7_n4218Ser50, H01ZF7_A4220Ser60, H01ZF7_n4220Ser60, H01ZF7_A4222Ser70,
            H01ZF7_n4222Ser70
            }
         }
      );
      AV24Pgmname = "Facturacion.DesAgruparFacturas" ;
      /* GeneXus formulas. */
      AV24Pgmname = "Facturacion.DesAgruparFacturas" ;
      Gx_err = (short)(0) ;
      edtavSerief_Enabled = 0 ;
      edtavPrio_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A1153FacTipFac ;
   private byte A435FacEst ;
   private byte AV6SerieF ;
   private byte nDonePA ;
   private byte AV12Flag ;
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
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV9FlagFac ;
   private short AV18CantidadRegistrosAProcesar ;
   private short cV18CantidadRegistrosAProcesar ;
   private short AV19CantidadRegistrosProcesados ;
   private short AV21Porcentaje ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV5NumFac ;
   private int edtavNumfac_Enabled ;
   private int edtavSerief_Enabled ;
   private int edtavPrio_Enabled ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private String Dvelop_confirmpanel_resultados_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A396EmprCod ;
   private String AV8FacSerNum ;
   private String GXKey ;
   private String A450FacPri ;
   private String A2739FacSerNum ;
   private String A14226FacAnulada ;
   private String A279CliNom ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
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
   private String edtavNumfac_Internalname ;
   private String TempTags ;
   private String edtavNumfac_Jsonclick ;
   private String edtavSerief_Internalname ;
   private String edtavSerief_Jsonclick ;
   private String edtavPrio_Internalname ;
   private String AV7PRIO ;
   private String edtavPrio_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnprioridad_Internalname ;
   private String bttBtnprioridad_Jsonclick ;
   private String bttBtnseries_Internalname ;
   private String bttBtnseries_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV24Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV14Station ;
   private String AV15EmprNom ;
   private String AV16UsurCod ;
   private String AV17EmprCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV11FacAnulada ;
   private String Gx_msg ;
   private String AV13OK ;
   private String A407EmprNom ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String A4215Ser4 ;
   private String A4217Ser5 ;
   private String A4219Ser6 ;
   private String A4221Ser7 ;
   private String A964Ser0 ;
   private String A2388Ser20 ;
   private String A2390Ser30 ;
   private String A4216Ser40 ;
   private String A4218Ser50 ;
   private String A4220Ser60 ;
   private String A4222Ser70 ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_resultados_Internalname ;
   private String Dvelop_confirmpanel_resultados_Internalname ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV10Fecha ;
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
   private boolean n407EmprNom ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n4215Ser4 ;
   private boolean n4217Ser5 ;
   private boolean n4219Ser6 ;
   private boolean n4221Ser7 ;
   private boolean n964Ser0 ;
   private boolean n2388Ser20 ;
   private boolean n2390Ser30 ;
   private boolean n4216Ser40 ;
   private boolean n4218Ser50 ;
   private boolean n4220Ser60 ;
   private boolean n4222Ser70 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_resultados ;
   private IDataStoreProvider pr_default ;
   private String[] H01ZF2_A396EmprCod ;
   private String[] H01ZF3_A396EmprCod ;
   private String[] H01ZF3_A2739FacSerNum ;
   private byte[] H01ZF3_A1153FacTipFac ;
   private String[] H01ZF3_A450FacPri ;
   private int[] H01ZF3_A430FacCod ;
   private java.util.Date[] H01ZF3_A436FacFch ;
   private String[] H01ZF3_A14226FacAnulada ;
   private String[] H01ZF4_A396EmprCod ;
   private String[] H01ZF4_A2739FacSerNum ;
   private byte[] H01ZF4_A1153FacTipFac ;
   private String[] H01ZF4_A450FacPri ;
   private int[] H01ZF4_A430FacCod ;
   private java.util.Date[] H01ZF4_A436FacFch ;
   private byte[] H01ZF4_A435FacEst ;
   private String[] H01ZF4_A14226FacAnulada ;
   private short[] H01ZF5_AV18CantidadRegistrosAProcesar ;
   private String[] H01ZF6_A396EmprCod ;
   private java.util.Date[] H01ZF6_A436FacFch ;
   private String[] H01ZF6_A2739FacSerNum ;
   private byte[] H01ZF6_A1153FacTipFac ;
   private String[] H01ZF6_A450FacPri ;
   private int[] H01ZF6_A430FacCod ;
   private String[] H01ZF6_A279CliNom ;
   private int[] H01ZF6_A252CliCod ;
   private String[] H01ZF7_A396EmprCod ;
   private String[] H01ZF7_A407EmprNom ;
   private boolean[] H01ZF7_n407EmprNom ;
   private String[] H01ZF7_A963Ser1 ;
   private boolean[] H01ZF7_n963Ser1 ;
   private String[] H01ZF7_A2387Ser2 ;
   private boolean[] H01ZF7_n2387Ser2 ;
   private String[] H01ZF7_A2389Ser3 ;
   private boolean[] H01ZF7_n2389Ser3 ;
   private String[] H01ZF7_A4215Ser4 ;
   private boolean[] H01ZF7_n4215Ser4 ;
   private String[] H01ZF7_A4217Ser5 ;
   private boolean[] H01ZF7_n4217Ser5 ;
   private String[] H01ZF7_A4219Ser6 ;
   private boolean[] H01ZF7_n4219Ser6 ;
   private String[] H01ZF7_A4221Ser7 ;
   private boolean[] H01ZF7_n4221Ser7 ;
   private String[] H01ZF7_A964Ser0 ;
   private boolean[] H01ZF7_n964Ser0 ;
   private String[] H01ZF7_A2388Ser20 ;
   private boolean[] H01ZF7_n2388Ser20 ;
   private String[] H01ZF7_A2390Ser30 ;
   private boolean[] H01ZF7_n2390Ser30 ;
   private String[] H01ZF7_A4216Ser40 ;
   private boolean[] H01ZF7_n4216Ser40 ;
   private String[] H01ZF7_A4218Ser50 ;
   private boolean[] H01ZF7_n4218Ser50 ;
   private String[] H01ZF7_A4220Ser60 ;
   private boolean[] H01ZF7_n4220Ser60 ;
   private String[] H01ZF7_A4222Ser70 ;
   private boolean[] H01ZF7_n4222Ser70 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV20ProgressIndicator ;
}

final  class desagruparfacturas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01ZF2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01ZF3", "SELECT EmprCod, FacSerNum, FacTipFac, FacPri, FacCod, FacFch, FacAnulada FROM TXPCFAVEN WHERE (EmprCod = ? and FacCod = ?) AND ((FacTipFac = 0)) AND (FacSerNum <> 'VD') AND (FacPri = ?) ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01ZF4", "SELECT EmprCod, FacSerNum, FacTipFac, FacPri, FacCod, FacFch, FacEst, FacAnulada FROM TXPCFAVEN WHERE (EmprCod = ? and FacCod >= ?) AND ((FacTipFac = 0)) AND (FacPri = ?) AND (FacSerNum = ?) ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZF5", "SELECT COUNT(*) FROM TXPCFAVEN WHERE (EmprCod = ? and FacCod >= ?) AND ((FacTipFac = 0)) AND (FacFch >= ?) AND (FacPri = ?) AND (FacSerNum = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZF6", "SELECT T1.EmprCod, T1.FacFch, T1.FacSerNum, T1.FacTipFac, T1.FacPri, T1.FacCod, T2.CliNom, T1.CliCod FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.FacCod >= ?) AND ((T1.FacTipFac = 0)) AND (T1.FacFch >= ?) AND (T1.FacPri = ?) AND (T1.FacSerNum = ?) ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZF7", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3, Ser4, Ser5, Ser6, Ser7, Ser0, Ser20, Ser30, Ser40, Ser50, Ser60, Ser70 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

