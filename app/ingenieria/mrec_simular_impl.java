package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_simular_impl extends GXDataArea
{
   public mrec_simular_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_simular_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_simular_impl.class ));
   }

   public mrec_simular_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavSegundos1 = new HTMLChoice();
      cmbavSegundos3 = new HTMLChoice();
      cmbavSegundos2 = new HTMLChoice();
      cmbavPorcerror = new HTMLChoice();
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
      pa1W92( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1W92( ) ;
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
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_simular", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vCRONOMETRO", GXutil.ltrim( localUtil.ntoc( AV9Cronometro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV7ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTCOD", GXutil.rtrim( A313ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Enabled", GXutil.booltostr( Cronometro_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Tickinterval", GXutil.ltrim( localUtil.ntoc( Cronometro_Tickinterval, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Captionclass", GXutil.rtrim( Cronometro_Captionclass));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Captionstyle", GXutil.rtrim( Cronometro_Captionstyle));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Captionposition", GXutil.rtrim( Cronometro_Captionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Visible", GXutil.booltostr( Cronometro_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Width", GXutil.rtrim( Dvpanel_panelestadisticas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Autowidth", GXutil.booltostr( Dvpanel_panelestadisticas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Autoheight", GXutil.booltostr( Dvpanel_panelestadisticas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Cls", GXutil.rtrim( Dvpanel_panelestadisticas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Title", GXutil.rtrim( Dvpanel_panelestadisticas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Collapsible", GXutil.booltostr( Dvpanel_panelestadisticas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Collapsed", GXutil.booltostr( Dvpanel_panelestadisticas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelestadisticas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Iconposition", GXutil.rtrim( Dvpanel_panelestadisticas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELESTADISTICAS_Autoscroll", GXutil.booltostr( Dvpanel_panelestadisticas_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Title", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
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
         we1W92( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1W92( ) ;
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
      return formatLink("app.ingenieria.mrec_simular", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRec_Simular" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Simular recepción de datos de las máquinas", "") ;
   }

   public void wb1W90( )
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
         app.GxWebStd.gx_div_start( httpContext, divTabledatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavSegundos1.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavSegundos1.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavSegundos1.getInternalname(), httpContext.getMessage( "Iniciar simulación...", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavSegundos1, cmbavSegundos1.getInternalname(), GXutil.trim( GXutil.str( AV18Segundos1, 4, 0)), 1, cmbavSegundos1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavSegundos1.getVisible(), cmbavSegundos1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "", true, (byte)(0), "HLP_Ingenieria\\MRec_Simular.htm");
         cmbavSegundos1.setValue( GXutil.trim( GXutil.str( AV18Segundos1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos1.getInternalname(), "Values", cmbavSegundos1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavSegundos3.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavSegundos3.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavSegundos3.getInternalname(), httpContext.getMessage( "Finalizar automáticamente la simulación...", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavSegundos3, cmbavSegundos3.getInternalname(), GXutil.trim( GXutil.str( AV20Segundos3, 4, 0)), 1, cmbavSegundos3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavSegundos3.getVisible(), cmbavSegundos3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "", true, (byte)(0), "HLP_Ingenieria\\MRec_Simular.htm");
         cmbavSegundos3.setValue( GXutil.trim( GXutil.str( AV20Segundos3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos3.getInternalname(), "Values", cmbavSegundos3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavSegundos2.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavSegundos2.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavSegundos2.getInternalname(), httpContext.getMessage( "Tiempo para grabar datos", ""), "col-sm-3 AttributeFLLabel BootstrapTooltipRightLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavSegundos2, cmbavSegundos2.getInternalname(), GXutil.trim( GXutil.str( AV19Segundos2, 4, 0)), 1, cmbavSegundos2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", cmbavSegundos2.getTooltip(), cmbavSegundos2.getVisible(), cmbavSegundos2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL BootstrapTooltipRight", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "", true, (byte)(0), "HLP_Ingenieria\\MRec_Simular.htm");
         cmbavSegundos2.setValue( GXutil.trim( GXutil.str( AV19Segundos2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos2.getInternalname(), "Values", cmbavSegundos2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavPorcerror.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPorcerror.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPorcerror.getInternalname(), httpContext.getMessage( "Error  s/los mín/max. de c/parámetro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPorcerror, cmbavPorcerror.getInternalname(), GXutil.trim( GXutil.str( AV25PorcError, 2, 0)), 1, cmbavPorcerror.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavPorcerror.getVisible(), cmbavPorcerror.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "", true, (byte)(0), "HLP_Ingenieria\\MRec_Simular.htm");
         cmbavPorcerror.setValue( GXutil.trim( GXutil.str( AV25PorcError, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPorcerror.getInternalname(), "Values", cmbavPorcerror.ToJavascriptSource(), true);
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
         /* User Defined Control */
         ucDvpanel_panelestadisticas.setProperty("Width", Dvpanel_panelestadisticas_Width);
         ucDvpanel_panelestadisticas.setProperty("AutoWidth", Dvpanel_panelestadisticas_Autowidth);
         ucDvpanel_panelestadisticas.setProperty("AutoHeight", Dvpanel_panelestadisticas_Autoheight);
         ucDvpanel_panelestadisticas.setProperty("Cls", Dvpanel_panelestadisticas_Cls);
         ucDvpanel_panelestadisticas.setProperty("Title", Dvpanel_panelestadisticas_Title);
         ucDvpanel_panelestadisticas.setProperty("Collapsible", Dvpanel_panelestadisticas_Collapsible);
         ucDvpanel_panelestadisticas.setProperty("Collapsed", Dvpanel_panelestadisticas_Collapsed);
         ucDvpanel_panelestadisticas.setProperty("ShowCollapseIcon", Dvpanel_panelestadisticas_Showcollapseicon);
         ucDvpanel_panelestadisticas.setProperty("IconPosition", Dvpanel_panelestadisticas_Iconposition);
         ucDvpanel_panelestadisticas.setProperty("AutoScroll", Dvpanel_panelestadisticas_Autoscroll);
         ucDvpanel_panelestadisticas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelestadisticas_Internalname, "DVPANEL_PANELESTADISTICASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELESTADISTICASContainer"+"PanelEstadisticas"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelestadisticas_Internalname, 1, 0, "px", 0, "px", "CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIniciado_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIniciado_Internalname, httpContext.getMessage( "Iniciado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIniciado_Internalname, AV17Iniciado, GXutil.rtrim( localUtil.format( AV17Iniciado, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIniciado_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIniciado_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFinalizado_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalizado_Internalname, httpContext.getMessage( "Finalizado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalizado_Internalname, AV15Finalizado, GXutil.rtrim( localUtil.format( AV15Finalizado, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalizado_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalizado_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTiempo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTiempo_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTiempo_Internalname, AV22Tiempo, GXutil.rtrim( localUtil.format( AV22Tiempo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTiempo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTiempo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Simular.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCiclos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCiclos_Internalname, httpContext.getMessage( "Ciclos", ""), "col-sm-3 AttributeFLLabel BootstrapTooltipRightLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCiclos_Internalname, AV5Ciclos, GXutil.rtrim( localUtil.format( AV5Ciclos, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", edtavCiclos_Tooltiptext, "", edtavCiclos_Jsonclick, 0, "AttributeFL BootstrapTooltipRight", "", "", "", "", 1, edtavCiclos_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDatosgenerados_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDatosgenerados_Internalname, httpContext.getMessage( "Datos generados", ""), "col-sm-3 AttributeFLLabel BootstrapTooltipRightLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDatosgenerados_Internalname, AV10DatosGenerados, GXutil.rtrim( localUtil.format( AV10DatosGenerados, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", edtavDatosgenerados_Tooltiptext, "", edtavDatosgenerados_Jsonclick, 0, "AttributeFL BootstrapTooltipRight", "", "", "", "", 1, edtavDatosgenerados_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEvaluar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEvaluar_Internalname, httpContext.getMessage( "Estado proceso evaluación datos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEvaluar_Internalname, AV24Evaluar, GXutil.rtrim( localUtil.format( AV24Evaluar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEvaluar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEvaluar_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Simular.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemensaje_Internalname, 1, 0, "px", 0, "px", divTablemensaje_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockestado_Internalname, lblTextblockestado_Caption, "", "", lblTextblockestado_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecronometro_Internalname, divTablecronometro_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_87_1W92( true) ;
      }
      else
      {
         wb_table1_87_1W92( false) ;
      }
      return  ;
   }

   public void wb_table1_87_1W92e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Iniciar simulación", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtnenter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault btn btn-default" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Parar simulación", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Parar simulación", ""), "", StyleString, ClassString, bttBtncerrar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111w91_client"+"'", TempTags, "", 2, "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "Salir", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec_Simular.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault btn btn-default" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecepciondata_Internalname, "", httpContext.getMessage( "Recepcion Data", ""), bttBtnrecepciondata_Jsonclick, 7, httpContext.getMessage( "Recepcion Data", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121w91_client"+"'", TempTags, "", 2, "HLP_Ingenieria\\MRec_Simular.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV28Pgmname), GXutil.rtrim( localUtil.format( AV28Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Simular.htm");
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
         wb_table2_110_1W92( true) ;
      }
      else
      {
         wb_table2_110_1W92( false) ;
      }
      return  ;
   }

   public void wb_table2_110_1W92e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_115_1W92( true) ;
      }
      else
      {
         wb_table3_115_1W92( false) ;
      }
      return  ;
   }

   public void wb_table3_115_1W92e( boolean wbgen )
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

   public void start1W92( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Simular recepción de datos de las máquinas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1W90( ) ;
   }

   public void ws1W92( )
   {
      start1W92( ) ;
      evt1W92( ) ;
   }

   public void evt1W92( )
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
                        else if ( GXutil.strcmp(sEvt, "VCRONOMETRO.TICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131W92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141W92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CERRAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151W92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e161W92 ();
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
                                 e171W92 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e181W92 ();
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

   public void we1W92( )
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

   public void pa1W92( )
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
            GX_FocusControl = cmbavSegundos1.getInternalname() ;
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
      if ( cmbavSegundos1.getItemCount() > 0 )
      {
         AV18Segundos1 = (short)(GXutil.lval( cmbavSegundos1.getValidValue(GXutil.trim( GXutil.str( AV18Segundos1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Segundos1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Segundos1), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavSegundos1.setValue( GXutil.trim( GXutil.str( AV18Segundos1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos1.getInternalname(), "Values", cmbavSegundos1.ToJavascriptSource(), true);
      }
      if ( cmbavSegundos3.getItemCount() > 0 )
      {
         AV20Segundos3 = (short)(GXutil.lval( cmbavSegundos3.getValidValue(GXutil.trim( GXutil.str( AV20Segundos3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Segundos3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Segundos3), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavSegundos3.setValue( GXutil.trim( GXutil.str( AV20Segundos3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos3.getInternalname(), "Values", cmbavSegundos3.ToJavascriptSource(), true);
      }
      if ( cmbavSegundos2.getItemCount() > 0 )
      {
         AV19Segundos2 = (short)(GXutil.lval( cmbavSegundos2.getValidValue(GXutil.trim( GXutil.str( AV19Segundos2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Segundos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Segundos2), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavSegundos2.setValue( GXutil.trim( GXutil.str( AV19Segundos2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos2.getInternalname(), "Values", cmbavSegundos2.ToJavascriptSource(), true);
      }
      if ( cmbavPorcerror.getItemCount() > 0 )
      {
         AV25PorcError = (byte)(GXutil.lval( cmbavPorcerror.getValidValue(GXutil.trim( GXutil.str( AV25PorcError, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25PorcError", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PorcError), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPorcerror.setValue( GXutil.trim( GXutil.str( AV25PorcError, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPorcerror.getInternalname(), "Values", cmbavPorcerror.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1W92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV28Pgmname = "Ingenieria.MRec_Simular" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
      Gx_err = (short)(0) ;
      edtavIniciado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIniciado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIniciado_Enabled), 5, 0), true);
      edtavFinalizado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFinalizado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFinalizado_Enabled), 5, 0), true);
      edtavTiempo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTiempo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempo_Enabled), 5, 0), true);
      edtavCiclos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCiclos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCiclos_Enabled), 5, 0), true);
      edtavDatosgenerados_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatosgenerados_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatosgenerados_Enabled), 5, 0), true);
      edtavEvaluar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEvaluar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEvaluar_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1W92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e181W92 ();
         wb1W90( ) ;
      }
   }

   public void send_integrity_lvl_hashes1W92( )
   {
   }

   public void before_start_formulas( )
   {
      AV28Pgmname = "Ingenieria.MRec_Simular" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
      Gx_err = (short)(0) ;
      edtavIniciado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIniciado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIniciado_Enabled), 5, 0), true);
      edtavFinalizado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFinalizado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFinalizado_Enabled), 5, 0), true);
      edtavTiempo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTiempo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempo_Enabled), 5, 0), true);
      edtavCiclos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCiclos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCiclos_Enabled), 5, 0), true);
      edtavDatosgenerados_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatosgenerados_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatosgenerados_Enabled), 5, 0), true);
      edtavEvaluar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEvaluar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEvaluar_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1W90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161W92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV9Cronometro = (short)(localUtil.ctol( httpContext.cgiGet( "vCRONOMETRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Cronometro_Enabled = GXutil.strtobool( httpContext.cgiGet( "CRONOMETRO_Enabled")) ;
         Cronometro_Tickinterval = (int)(localUtil.ctol( httpContext.cgiGet( "CRONOMETRO_Tickinterval"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Cronometro_Captionclass = httpContext.cgiGet( "CRONOMETRO_Captionclass") ;
         Cronometro_Captionstyle = httpContext.cgiGet( "CRONOMETRO_Captionstyle") ;
         Cronometro_Captionposition = httpContext.cgiGet( "CRONOMETRO_Captionposition") ;
         Cronometro_Visible = GXutil.strtobool( httpContext.cgiGet( "CRONOMETRO_Visible")) ;
         Dvpanel_panelestadisticas_Width = httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Width") ;
         Dvpanel_panelestadisticas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Autowidth")) ;
         Dvpanel_panelestadisticas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Autoheight")) ;
         Dvpanel_panelestadisticas_Cls = httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Cls") ;
         Dvpanel_panelestadisticas_Title = httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Title") ;
         Dvpanel_panelestadisticas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Collapsible")) ;
         Dvpanel_panelestadisticas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Collapsed")) ;
         Dvpanel_panelestadisticas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Showcollapseicon")) ;
         Dvpanel_panelestadisticas_Iconposition = httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Iconposition") ;
         Dvpanel_panelestadisticas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELESTADISTICAS_Autoscroll")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_cerrar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Title") ;
         Dvelop_confirmpanel_cerrar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext") ;
         Dvelop_confirmpanel_cerrar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_cerrar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Dvelop_confirmpanel_cerrar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Result") ;
         /* Read variables values. */
         cmbavSegundos1.setValue( httpContext.cgiGet( cmbavSegundos1.getInternalname()) );
         AV18Segundos1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavSegundos1.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Segundos1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Segundos1), 4, 0));
         cmbavSegundos3.setValue( httpContext.cgiGet( cmbavSegundos3.getInternalname()) );
         AV20Segundos3 = (short)(GXutil.lval( httpContext.cgiGet( cmbavSegundos3.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Segundos3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Segundos3), 4, 0));
         cmbavSegundos2.setValue( httpContext.cgiGet( cmbavSegundos2.getInternalname()) );
         AV19Segundos2 = (short)(GXutil.lval( httpContext.cgiGet( cmbavSegundos2.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Segundos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Segundos2), 4, 0));
         cmbavPorcerror.setValue( httpContext.cgiGet( cmbavPorcerror.getInternalname()) );
         AV25PorcError = (byte)(GXutil.lval( httpContext.cgiGet( cmbavPorcerror.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25PorcError", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PorcError), 2, 0));
         AV17Iniciado = httpContext.cgiGet( edtavIniciado_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Iniciado", AV17Iniciado);
         AV15Finalizado = httpContext.cgiGet( edtavFinalizado_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Finalizado", AV15Finalizado);
         AV22Tiempo = httpContext.cgiGet( edtavTiempo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Tiempo", AV22Tiempo);
         AV5Ciclos = httpContext.cgiGet( edtavCiclos_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Ciclos", AV5Ciclos);
         AV10DatosGenerados = httpContext.cgiGet( edtavDatosgenerados_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10DatosGenerados", AV10DatosGenerados);
         AV24Evaluar = httpContext.cgiGet( edtavEvaluar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Evaluar", AV24Evaluar);
         AV28Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
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
      e161W92 ();
      if (returnInSub) return;
   }

   public void e161W92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mrec_simular_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Station = GXt_char1 ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char4[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
      mrec_simular_impl.this.AV11EmprCod = GXv_char2[0] ;
      mrec_simular_impl.this.AV12EmprNom = GXv_char3[0] ;
      mrec_simular_impl.this.AV23UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      GXt_char1 = AV21Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      mrec_simular_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21Station = GXt_char1 ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char2[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char4, GXv_char3, GXv_char2) ;
      mrec_simular_impl.this.AV11EmprCod = GXv_char4[0] ;
      mrec_simular_impl.this.AV12EmprNom = GXv_char3[0] ;
      mrec_simular_impl.this.AV23UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      edtavDatosgenerados_Tooltiptext = httpContext.getMessage( "Indica la cantidad de datos simulados que han sido generados", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatosgenerados_Internalname, "Tooltiptext", edtavDatosgenerados_Tooltiptext, true);
      edtavCiclos_Tooltiptext = httpContext.getMessage( "cantidad de ciclos recorridos de los datos enviados (HDR abiertas en tabla MENV) ", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCiclos_Internalname, "Tooltiptext", edtavCiclos_Tooltiptext, true);
      cmbavSegundos2.setTooltip( httpContext.getMessage( "Indica el tiempo estimado por cada dato que envía la máquinas (PLC)", "") );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos2.getInternalname(), "Tooltiptext", cmbavSegundos2.getTooltip(), true);
      AV7ContCod = httpContext.getMessage( "INGSIM", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
      divTablecronometro_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablecronometro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablecronometro_Visible), 5, 0), true);
      Cronometro_Visible = false ;
      httpContext.ajax_rsp_assign_prop("", false, Cronometro_Internalname, "Visible", GXutil.booltostr( Cronometro_Visible), true);
      AV25PorcError = (byte)(10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25PorcError", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PorcError), 2, 0));
      GXt_int5 = AV8ContVal ;
      GXv_int6[0] = GXt_int5 ;
      new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "DSP", AV11EmprCod, AV7ContCod, GXv_int6) ;
      mrec_simular_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8ContVal = GXt_int5 ;
      if ( AV8ContVal == 1 )
      {
         this.executeUsercontrolMethod("", false, "CRONOMETROContainer", "Start", "", new Object[] {});
      }
      /* Execute user subroutine: 'PARAR SIMULACION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S122 ();
      if (returnInSub) return;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e171W92 ();
      if (returnInSub) return;
   }

   public void e171W92( )
   {
      /* Enter Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
   }

   public void e141W92( )
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
      cmbavSegundos3.setValue( GXutil.trim( GXutil.str( AV20Segundos3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos3.getInternalname(), "Values", cmbavSegundos3.ToJavascriptSource(), true);
      cmbavSegundos2.setValue( GXutil.trim( GXutil.str( AV19Segundos2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos2.getInternalname(), "Values", cmbavSegundos2.ToJavascriptSource(), true);
      cmbavPorcerror.setValue( GXutil.trim( GXutil.str( AV25PorcError, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPorcerror.getInternalname(), "Values", cmbavPorcerror.ToJavascriptSource(), true);
   }

   public void e151W92( )
   {
      /* Dvelop_confirmpanel_cerrar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CERRAR' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      GXt_int5 = AV8ContVal ;
      GXv_int6[0] = GXt_int5 ;
      new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "DSP", AV11EmprCod, AV7ContCod, GXv_int6) ;
      mrec_simular_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8ContVal = GXt_int5 ;
      if ( AV8ContVal == 0 )
      {
         AV8ContVal = 1 ;
         GXv_int6[0] = AV8ContVal ;
         new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "UPD", AV11EmprCod, AV7ContCod, GXv_int6) ;
         mrec_simular_impl.this.AV8ContVal = GXv_int6[0] ;
         AV16i = GXutil.sleep( AV18Segundos1) ;
         /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
         S122 ();
         if (returnInSub) return;
         AV5Ciclos = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Ciclos", AV5Ciclos);
         AV17Iniciado = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Iniciado", AV17Iniciado);
         AV15Finalizado = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Finalizado", AV15Finalizado);
         AV22Tiempo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Tiempo", AV22Tiempo);
         AV10DatosGenerados = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10DatosGenerados", AV10DatosGenerados);
         callSubmit( 1 , new Object[]{ AV11EmprCod,AV7ContCod,Byte.valueOf(AV25PorcError),Short.valueOf(AV19Segundos2),Short.valueOf(AV20Segundos3) });
         this.executeUsercontrolMethod("", false, "CRONOMETROContainer", "Start", "", new Object[] {});
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Simulación iniciada.", ""));
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El proceso de simulación se encuentra activo.", ""));
      }
   }

   public void S142( )
   {
      /* 'DO ACTION CERRAR' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'PARAR SIMULACION' */
      S112 ();
      if (returnInSub) return;
   }

   public void e131W92( )
   {
      /* Cronometro_Tick Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      GXt_int5 = AV8ContVal ;
      GXv_int6[0] = GXt_int5 ;
      new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "DSP", AV11EmprCod, AV7ContCod, GXv_int6) ;
      mrec_simular_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8ContVal = GXt_int5 ;
      if ( AV8ContVal == 1 )
      {
         divTablemensaje_Class = "TableCardDashboardAdminSuccess" ;
         httpContext.ajax_rsp_assign_prop("", false, divTablemensaje_Internalname, "Class", divTablemensaje_Class, true);
         lblTextblockestado_Caption = httpContext.getMessage( "<h3 style=\"color:white;\" > <b>Proceso de simulación iniciado..</b></h3>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblockestado_Internalname, "Caption", lblTextblockestado_Caption, true);
         cmbavSegundos1.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSegundos1.getVisible(), 5, 0), true);
         cmbavSegundos2.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSegundos2.getVisible(), 5, 0), true);
         cmbavSegundos3.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSegundos3.getVisible(), 5, 0), true);
         cmbavPorcerror.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPorcerror.getInternalname(), "Visible", GXutil.ltrimstr( cmbavPorcerror.getVisible(), 5, 0), true);
         bttBtnenter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Visible), 5, 0), true);
         bttBtncerrar_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtncerrar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtncerrar_Visible), 5, 0), true);
      }
      else
      {
         divTablemensaje_Class = "TableCardDashboardAdminDanger" ;
         httpContext.ajax_rsp_assign_prop("", false, divTablemensaje_Internalname, "Class", divTablemensaje_Class, true);
         lblTextblockestado_Caption = httpContext.getMessage( "<h3 style=\"color:white;\"><b>Proceso de simulación no iniciado..</b></h3>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblockestado_Internalname, "Caption", lblTextblockestado_Caption, true);
         cmbavSegundos1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSegundos1.getVisible(), 5, 0), true);
         cmbavSegundos2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSegundos2.getVisible(), 5, 0), true);
         cmbavSegundos3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSegundos3.getVisible(), 5, 0), true);
         cmbavPorcerror.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPorcerror.getInternalname(), "Visible", GXutil.ltrimstr( cmbavPorcerror.getVisible(), 5, 0), true);
         bttBtnenter_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Visible), 5, 0), true);
         bttBtncerrar_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtncerrar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtncerrar_Visible), 5, 0), true);
      }
      AV5Ciclos = httpContext.getMessage( "No registra datos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Ciclos", AV5Ciclos);
      AV17Iniciado = httpContext.getMessage( "No registra datos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Iniciado", AV17Iniciado);
      AV15Finalizado = httpContext.getMessage( "No registra datos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Finalizado", AV15Finalizado);
      AV22Tiempo = httpContext.getMessage( "No registra datos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Tiempo", AV22Tiempo);
      AV10DatosGenerados = httpContext.getMessage( "No registra datos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10DatosGenerados", AV10DatosGenerados);
      AV24Evaluar = httpContext.getMessage( "No iniciado", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Evaluar", AV24Evaluar);
      /* Using cursor H01W92 */
      pr_default.execute(0, new Object[] {AV11EmprCod, AV7ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = H01W92_A313ContCod[0] ;
         A396EmprCod = H01W92_A396EmprCod[0] ;
         A7208ContDsc2 = H01W92_A7208ContDsc2[0] ;
         AV6Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(A7208ContDsc2,"\\|")) ;
         if ( AV6Col_ContDsc2.size() == 5 )
         {
            AV17Iniciado = (String)AV6Col_ContDsc2.elementAt(-1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Iniciado", AV17Iniciado);
            AV15Finalizado = (String)AV6Col_ContDsc2.elementAt(-1+2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Finalizado", AV15Finalizado);
            AV5Ciclos = (String)AV6Col_ContDsc2.elementAt(-1+3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Ciclos", AV5Ciclos);
            AV10DatosGenerados = (String)AV6Col_ContDsc2.elementAt(-1+4) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DatosGenerados", AV10DatosGenerados);
            AV24Evaluar = (String)AV6Col_ContDsc2.elementAt(-1+5) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Evaluar", AV24Evaluar);
            if ( (GXutil.strcmp("", AV24Evaluar)==0) )
            {
               AV24Evaluar = httpContext.getMessage( "No iniciado", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Evaluar", AV24Evaluar);
            }
         }
         AV13FechaHoraDesde = localUtil.ctot( AV17Iniciado, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV14FechaHoraHasta = localUtil.ctot( AV15Finalizado, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), AV13FechaHoraDesde) )
         {
            if ( GXutil.dateCompare(GXutil.nullDate(), AV14FechaHoraHasta) )
            {
               AV14FechaHoraHasta = GXutil.now( ) ;
            }
            GXt_char1 = AV22Tiempo ;
            GXv_char4[0] = GXt_char1 ;
            new app.core.tiempotranscurrido(remoteHandle, context).execute( AV13FechaHoraDesde, AV14FechaHoraHasta, GXv_char4) ;
            mrec_simular_impl.this.GXt_char1 = GXv_char4[0] ;
            AV22Tiempo = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Tiempo", AV22Tiempo);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S112( )
   {
      /* 'PARAR SIMULACION' Routine */
      returnInSub = false ;
      AV8ContVal = 0 ;
      GXv_int6[0] = AV8ContVal ;
      new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "UPD", AV11EmprCod, AV7ContCod, GXv_int6) ;
      mrec_simular_impl.this.AV8ContVal = GXv_int6[0] ;
      if ( AV8ContVal == 0 )
      {
         AV16i = GXutil.sleep( AV19Segundos2) ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso de simulación ha finalizado.", ""));
         this.executeUsercontrolMethod("", false, "CRONOMETROContainer", "Stop", "", new Object[] {});
         AV9Cronometro = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Cronometro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Cronometro), 4, 0));
         /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
         S122 ();
         if (returnInSub) return;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e181W92( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table3_115_1W92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cerrar_Internalname, tblTabledvelop_confirmpanel_cerrar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cerrar.setProperty("Title", Dvelop_confirmpanel_cerrar_Title);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonCaption", Dvelop_confirmpanel_cerrar_Yesbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("NoButtonCaption", Dvelop_confirmpanel_cerrar_Nobuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cerrar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonPosition", Dvelop_confirmpanel_cerrar_Yesbuttonposition);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmType", Dvelop_confirmpanel_cerrar_Confirmtype);
         ucDvelop_confirmpanel_cerrar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cerrar_Internalname, "DVELOP_CONFIRMPANEL_CERRARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CERRARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_115_1W92e( true) ;
      }
      else
      {
         wb_table3_115_1W92e( false) ;
      }
   }

   public void wb_table2_110_1W92( boolean wbgen )
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
         wb_table2_110_1W92e( true) ;
      }
      else
      {
         wb_table2_110_1W92e( false) ;
      }
   }

   public void wb_table1_87_1W92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUtcronometro_Internalname, tblUtcronometro_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCronometro.setProperty("Attribute", AV9Cronometro);
         ucCronometro.setProperty("TickInterval", Cronometro_Tickinterval);
         ucCronometro.setProperty("CaptionClass", Cronometro_Captionclass);
         ucCronometro.setProperty("CaptionStyle", Cronometro_Captionstyle);
         ucCronometro.setProperty("CaptionPosition", Cronometro_Captionposition);
         ucCronometro.render(context, "sdchronometer", Cronometro_Internalname, "CRONOMETROContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_87_1W92e( true) ;
      }
      else
      {
         wb_table1_87_1W92e( false) ;
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
      pa1W92( ) ;
      ws1W92( ) ;
      we1W92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011132521", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrec_simular.js", "?202671011132522", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavSegundos1.setInternalname( "vSEGUNDOS1" );
      cmbavSegundos3.setInternalname( "vSEGUNDOS3" );
      cmbavSegundos2.setInternalname( "vSEGUNDOS2" );
      cmbavPorcerror.setInternalname( "vPORCERROR" );
      divTabledatos_Internalname = "TABLEDATOS" ;
      edtavIniciado_Internalname = "vINICIADO" ;
      edtavFinalizado_Internalname = "vFINALIZADO" ;
      edtavTiempo_Internalname = "vTIEMPO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavCiclos_Internalname = "vCICLOS" ;
      edtavDatosgenerados_Internalname = "vDATOSGENERADOS" ;
      edtavEvaluar_Internalname = "vEVALUAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockestado_Internalname = "TEXTBLOCKESTADO" ;
      divTablemensaje_Internalname = "TABLEMENSAJE" ;
      Cronometro_Internalname = "CRONOMETRO" ;
      tblUtcronometro_Internalname = "UTCRONOMETRO" ;
      divTablecronometro_Internalname = "TABLECRONOMETRO" ;
      divPanelestadisticas_Internalname = "PANELESTADISTICAS" ;
      Dvpanel_panelestadisticas_Internalname = "DVPANEL_PANELESTADISTICAS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      bttBtnrecepciondata_Internalname = "BTNRECEPCIONDATA" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Dvelop_confirmpanel_cerrar_Internalname = "DVELOP_CONFIRMPANEL_CERRAR" ;
      tblTabledvelop_confirmpanel_cerrar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CERRAR" ;
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
      Cronometro_Enabled = GXutil.toBoolean( 1) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtncerrar_Visible = 1 ;
      bttBtnenter_Visible = 1 ;
      divTablecronometro_Visible = 1 ;
      lblTextblockestado_Caption = "." ;
      divTablemensaje_Class = "TableCardDashboardAdminDanger" ;
      edtavEvaluar_Jsonclick = "" ;
      edtavEvaluar_Enabled = 1 ;
      edtavDatosgenerados_Jsonclick = "" ;
      edtavDatosgenerados_Tooltiptext = "" ;
      edtavDatosgenerados_Enabled = 1 ;
      edtavCiclos_Jsonclick = "" ;
      edtavCiclos_Tooltiptext = "" ;
      edtavCiclos_Enabled = 1 ;
      edtavTiempo_Jsonclick = "" ;
      edtavTiempo_Enabled = 1 ;
      edtavFinalizado_Jsonclick = "" ;
      edtavFinalizado_Enabled = 1 ;
      edtavIniciado_Jsonclick = "" ;
      edtavIniciado_Enabled = 1 ;
      cmbavPorcerror.setJsonclick( "" );
      cmbavPorcerror.setEnabled( 1 );
      cmbavPorcerror.setVisible( 1 );
      cmbavSegundos2.setJsonclick( "" );
      cmbavSegundos2.setTooltip( "" );
      cmbavSegundos2.setEnabled( 1 );
      cmbavSegundos2.setVisible( 1 );
      cmbavSegundos3.setJsonclick( "" );
      cmbavSegundos3.setEnabled( 1 );
      cmbavSegundos3.setVisible( 1 );
      cmbavSegundos1.setJsonclick( "" );
      cmbavSegundos1.setEnabled( 1 );
      cmbavSegundos1.setVisible( 1 );
      Dvelop_confirmpanel_cerrar_Confirmtype = "1" ;
      Dvelop_confirmpanel_cerrar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cerrar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cerrar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cerrar_Confirmationtext = "¿Finaliza el proceso de simulación?" ;
      Dvelop_confirmpanel_cerrar_Title = httpContext.getMessage( "CONFIRMACIÓN", "") ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Inicia el proceso de simulación?" ;
      Dvelop_confirmpanel_enter_Title = httpContext.getMessage( "CONFIRMAR", "") ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_panelestadisticas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelestadisticas_Iconposition = "Right" ;
      Dvpanel_panelestadisticas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelestadisticas_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelestadisticas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelestadisticas_Title = httpContext.getMessage( "Datos última simulación...", "") ;
      Dvpanel_panelestadisticas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelestadisticas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelestadisticas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelestadisticas_Width = "100%" ;
      Cronometro_Visible = GXutil.toBoolean( -1) ;
      Cronometro_Captionposition = "None" ;
      Cronometro_Captionstyle = "width: 25%;" ;
      Cronometro_Captionclass = "gx-form-item AttributeLabel" ;
      Cronometro_Tickinterval = 5 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Simular recepción de datos de las máquinas", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavSegundos1.setName( "vSEGUNDOS1" );
      cmbavSegundos1.setWebtags( "" );
      cmbavSegundos1.addItem("0", httpContext.getMessage( "Inmediato", ""), (short)(0));
      cmbavSegundos1.addItem("60", httpContext.getMessage( "En 1 minuto", ""), (short)(0));
      cmbavSegundos1.addItem("120", httpContext.getMessage( "En 2 minutos", ""), (short)(0));
      cmbavSegundos1.addItem("180", httpContext.getMessage( "En 3 minutos", ""), (short)(0));
      cmbavSegundos1.addItem("300", httpContext.getMessage( "En 5 minutos", ""), (short)(0));
      cmbavSegundos1.addItem("600", httpContext.getMessage( "En 10 minutos", ""), (short)(0));
      cmbavSegundos1.addItem("1800", httpContext.getMessage( "En 30 minutos", ""), (short)(0));
      cmbavSegundos1.addItem("3600", httpContext.getMessage( "En 1 hora", ""), (short)(0));
      if ( cmbavSegundos1.getItemCount() > 0 )
      {
         AV18Segundos1 = (short)(GXutil.lval( cmbavSegundos1.getValidValue(GXutil.trim( GXutil.str( AV18Segundos1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Segundos1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Segundos1), 4, 0));
      }
      cmbavSegundos3.setName( "vSEGUNDOS3" );
      cmbavSegundos3.setWebtags( "" );
      cmbavSegundos3.addItem("0", httpContext.getMessage( "Nunca", ""), (short)(0));
      cmbavSegundos3.addItem("180", httpContext.getMessage( "A los 3 minutos ", ""), (short)(0));
      cmbavSegundos3.addItem("300", httpContext.getMessage( "A los 5 minutos", ""), (short)(0));
      cmbavSegundos3.addItem("600", httpContext.getMessage( "A los 10 minutos", ""), (short)(0));
      cmbavSegundos3.addItem("1800", httpContext.getMessage( "A los 30 minutos", ""), (short)(0));
      cmbavSegundos3.addItem("3600", httpContext.getMessage( "A cumplir 1 hora", ""), (short)(0));
      if ( cmbavSegundos3.getItemCount() > 0 )
      {
         AV20Segundos3 = (short)(GXutil.lval( cmbavSegundos3.getValidValue(GXutil.trim( GXutil.str( AV20Segundos3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Segundos3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Segundos3), 4, 0));
      }
      cmbavSegundos2.setName( "vSEGUNDOS2" );
      cmbavSegundos2.setWebtags( "" );
      cmbavSegundos2.addItem("1", httpContext.getMessage( "Cada Segundo", ""), (short)(0));
      cmbavSegundos2.addItem("3", httpContext.getMessage( "Cada 3 segundos", ""), (short)(0));
      cmbavSegundos2.addItem("5", httpContext.getMessage( "Cada 5 segundos", ""), (short)(0));
      cmbavSegundos2.addItem("10", httpContext.getMessage( "Cada 10 segundos", ""), (short)(0));
      cmbavSegundos2.addItem("15", httpContext.getMessage( "Cada 15 segundos", ""), (short)(0));
      if ( cmbavSegundos2.getItemCount() > 0 )
      {
         AV19Segundos2 = (short)(GXutil.lval( cmbavSegundos2.getValidValue(GXutil.trim( GXutil.str( AV19Segundos2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Segundos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Segundos2), 4, 0));
      }
      cmbavPorcerror.setName( "vPORCERROR" );
      cmbavPorcerror.setWebtags( "" );
      cmbavPorcerror.addItem("5", "5%", (short)(0));
      cmbavPorcerror.addItem("10", "10%", (short)(0));
      cmbavPorcerror.addItem("15", "15%", (short)(0));
      cmbavPorcerror.addItem("20", "20%", (short)(0));
      cmbavPorcerror.addItem("25", "25%", (short)(0));
      cmbavPorcerror.addItem("30", "30%", (short)(0));
      if ( cmbavPorcerror.getItemCount() > 0 )
      {
         AV25PorcError = (byte)(GXutil.lval( cmbavPorcerror.getValidValue(GXutil.trim( GXutil.str( AV25PorcError, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25PorcError", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PorcError), 2, 0));
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
      setEventMetadata("ENTER","{handler:'e171W92',iparms:[]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e141W92',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7ContCod',fld:'vCONTCOD',pic:'@!'},{av:'cmbavSegundos1'},{av:'AV18Segundos1',fld:'vSEGUNDOS1',pic:'ZZZ9'},{av:'cmbavPorcerror'},{av:'AV25PorcError',fld:'vPORCERROR',pic:'Z9'},{av:'cmbavSegundos2'},{av:'AV19Segundos2',fld:'vSEGUNDOS2',pic:'ZZZ9'},{av:'cmbavSegundos3'},{av:'AV20Segundos3',fld:'vSEGUNDOS3',pic:'ZZZ9'},{av:'AV9Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A313ContCod',fld:'CONTCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV5Ciclos',fld:'vCICLOS',pic:''},{av:'AV17Iniciado',fld:'vINICIADO',pic:''},{av:'AV15Finalizado',fld:'vFINALIZADO',pic:''},{av:'AV22Tiempo',fld:'vTIEMPO',pic:''},{av:'AV10DatosGenerados',fld:'vDATOSGENERADOS',pic:''},{av:'cmbavSegundos3'},{av:'AV20Segundos3',fld:'vSEGUNDOS3',pic:'ZZZ9'},{av:'cmbavSegundos2'},{av:'AV19Segundos2',fld:'vSEGUNDOS2',pic:'ZZZ9'},{av:'cmbavPorcerror'},{av:'AV25PorcError',fld:'vPORCERROR',pic:'Z9'},{av:'AV7ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'},{av:'divTablemensaje_Class',ctrl:'TABLEMENSAJE',prop:'Class'},{av:'lblTextblockestado_Caption',ctrl:'TEXTBLOCKESTADO',prop:'Caption'},{av:'cmbavSegundos1'},{ctrl:'BTNENTER',prop:'Visible'},{ctrl:'BTNCERRAR',prop:'Visible'},{av:'AV24Evaluar',fld:'vEVALUAR',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e111W91',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE","{handler:'e151W92',iparms:[{av:'Dvelop_confirmpanel_cerrar_Result',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'Result'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7ContCod',fld:'vCONTCOD',pic:'@!'},{av:'cmbavSegundos2'},{av:'AV19Segundos2',fld:'vSEGUNDOS2',pic:'ZZZ9'},{av:'AV9Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A313ContCod',fld:'CONTCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE",",oparms:[{av:'AV9Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'},{av:'divTablemensaje_Class',ctrl:'TABLEMENSAJE',prop:'Class'},{av:'lblTextblockestado_Caption',ctrl:'TEXTBLOCKESTADO',prop:'Caption'},{av:'cmbavSegundos1'},{av:'cmbavSegundos2'},{av:'cmbavSegundos3'},{av:'cmbavPorcerror'},{ctrl:'BTNENTER',prop:'Visible'},{ctrl:'BTNCERRAR',prop:'Visible'},{av:'AV5Ciclos',fld:'vCICLOS',pic:''},{av:'AV17Iniciado',fld:'vINICIADO',pic:''},{av:'AV15Finalizado',fld:'vFINALIZADO',pic:''},{av:'AV22Tiempo',fld:'vTIEMPO',pic:''},{av:'AV10DatosGenerados',fld:'vDATOSGENERADOS',pic:''},{av:'AV24Evaluar',fld:'vEVALUAR',pic:''}]}");
      setEventMetadata("'DORECEPCIONDATA'","{handler:'e121W91',iparms:[]");
      setEventMetadata("'DORECEPCIONDATA'",",oparms:[]}");
      setEventMetadata("VCRONOMETRO.TICK","{handler:'e131W92',iparms:[{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7ContCod',fld:'vCONTCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A313ContCod',fld:'CONTCOD',pic:'@!'}]");
      setEventMetadata("VCRONOMETRO.TICK",",oparms:[{av:'divTablemensaje_Class',ctrl:'TABLEMENSAJE',prop:'Class'},{av:'lblTextblockestado_Caption',ctrl:'TEXTBLOCKESTADO',prop:'Caption'},{av:'cmbavSegundos1'},{av:'cmbavSegundos2'},{av:'cmbavSegundos3'},{av:'cmbavPorcerror'},{ctrl:'BTNENTER',prop:'Visible'},{ctrl:'BTNCERRAR',prop:'Visible'},{av:'AV5Ciclos',fld:'vCICLOS',pic:''},{av:'AV17Iniciado',fld:'vINICIADO',pic:''},{av:'AV15Finalizado',fld:'vFINALIZADO',pic:''},{av:'AV22Tiempo',fld:'vTIEMPO',pic:''},{av:'AV10DatosGenerados',fld:'vDATOSGENERADOS',pic:''},{av:'AV24Evaluar',fld:'vEVALUAR',pic:''}]}");
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
   public void submit( int submitId ,
                       Object [] submitParms ,
                       ModelContext submitContext )
   {
      UserInformation submitUI = (UserInformation) GXObjectHelper.getUserInformation(context, -1);
      int remoteHandle = submitUI.getHandle();
      try
      {
         switch ( submitId )
         {
               case 1 :
                  new app.ingenieria.mrec_simularpr(remoteHandle, submitContext).execute( (String)submitParms[0], (String)submitParms[1], DecimalUtil.doubleToDec(((Number) submitParms[2]).byteValue()), ((Number) submitParms[3]).shortValue(), ((Number) submitParms[4]).shortValue()) ;
                  try { Application.getConnectionManager().disconnect(remoteHandle); } catch(Exception submitExc) { ; }
                  break;
         }
      }
      catch ( Exception e )
      {
         Application.cleanupConnection(remoteHandle);
         e.printStackTrace();
      }
   }

   public void initialize( )
   {
      Dvelop_confirmpanel_enter_Result = "" ;
      Dvelop_confirmpanel_cerrar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV11EmprCod = "" ;
      AV7ContCod = "" ;
      A396EmprCod = "" ;
      A313ContCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_panelestadisticas = new com.genexus.webpanels.GXUserControl();
      AV17Iniciado = "" ;
      AV15Finalizado = "" ;
      AV22Tiempo = "" ;
      AV5Ciclos = "" ;
      AV10DatosGenerados = "" ;
      AV24Evaluar = "" ;
      lblTextblockestado_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      bttBtnrecepciondata_Jsonclick = "" ;
      AV28Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Station = "" ;
      AV12EmprNom = "" ;
      AV23UsurCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      H01W92_A313ContCod = new String[] {""} ;
      H01W92_A396EmprCod = new String[] {""} ;
      H01W92_A7208ContDsc2 = new String[] {""} ;
      A7208ContDsc2 = "" ;
      AV6Col_ContDsc2 = new GXSimpleCollection<String>(String.class, "internal", "");
      AV13FechaHoraDesde = GXutil.resetTime( GXutil.nullDate() );
      AV14FechaHoraHasta = GXutil.resetTime( GXutil.nullDate() );
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_cerrar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      ucCronometro = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_simular__default(),
         new Object[] {
             new Object[] {
            H01W92_A313ContCod, H01W92_A396EmprCod, H01W92_A7208ContDsc2
            }
         }
      );
      AV28Pgmname = "Ingenieria.MRec_Simular" ;
      /* GeneXus formulas. */
      AV28Pgmname = "Ingenieria.MRec_Simular" ;
      Gx_err = (short)(0) ;
      edtavIniciado_Enabled = 0 ;
      edtavFinalizado_Enabled = 0 ;
      edtavTiempo_Enabled = 0 ;
      edtavCiclos_Enabled = 0 ;
      edtavDatosgenerados_Enabled = 0 ;
      edtavEvaluar_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV25PorcError ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV9Cronometro ;
   private short wbEnd ;
   private short wbStart ;
   private short AV18Segundos1 ;
   private short AV20Segundos3 ;
   private short AV19Segundos2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV16i ;
   private int Cronometro_Tickinterval ;
   private int edtavIniciado_Enabled ;
   private int edtavFinalizado_Enabled ;
   private int edtavTiempo_Enabled ;
   private int edtavCiclos_Enabled ;
   private int edtavDatosgenerados_Enabled ;
   private int edtavEvaluar_Enabled ;
   private int divTablecronometro_Visible ;
   private int bttBtnenter_Visible ;
   private int bttBtncerrar_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV8ContVal ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int idxLst ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Dvelop_confirmpanel_cerrar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV11EmprCod ;
   private String AV7ContCod ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String Cronometro_Captionclass ;
   private String Cronometro_Captionstyle ;
   private String Cronometro_Captionposition ;
   private String Dvpanel_panelestadisticas_Width ;
   private String Dvpanel_panelestadisticas_Cls ;
   private String Dvpanel_panelestadisticas_Title ;
   private String Dvpanel_panelestadisticas_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Dvelop_confirmpanel_cerrar_Title ;
   private String Dvelop_confirmpanel_cerrar_Confirmationtext ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cerrar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTabledatos_Internalname ;
   private String TempTags ;
   private String Dvpanel_panelestadisticas_Internalname ;
   private String divPanelestadisticas_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavIniciado_Internalname ;
   private String edtavIniciado_Jsonclick ;
   private String edtavFinalizado_Internalname ;
   private String edtavFinalizado_Jsonclick ;
   private String edtavTiempo_Internalname ;
   private String edtavTiempo_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavCiclos_Internalname ;
   private String edtavCiclos_Tooltiptext ;
   private String edtavCiclos_Jsonclick ;
   private String edtavDatosgenerados_Internalname ;
   private String edtavDatosgenerados_Tooltiptext ;
   private String edtavDatosgenerados_Jsonclick ;
   private String edtavEvaluar_Internalname ;
   private String edtavEvaluar_Jsonclick ;
   private String divTablemensaje_Internalname ;
   private String divTablemensaje_Class ;
   private String lblTextblockestado_Internalname ;
   private String lblTextblockestado_Caption ;
   private String lblTextblockestado_Jsonclick ;
   private String divTablecronometro_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String bttBtnrecepciondata_Internalname ;
   private String bttBtnrecepciondata_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV28Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV21Station ;
   private String AV12EmprNom ;
   private String AV23UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Cronometro_Internalname ;
   private String scmdbuf ;
   private String A7208ContDsc2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_cerrar_Internalname ;
   private String Dvelop_confirmpanel_cerrar_Internalname ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblUtcronometro_Internalname ;
   private java.util.Date AV13FechaHoraDesde ;
   private java.util.Date AV14FechaHoraHasta ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Cronometro_Enabled ;
   private boolean Cronometro_Visible ;
   private boolean Dvpanel_panelestadisticas_Autowidth ;
   private boolean Dvpanel_panelestadisticas_Autoheight ;
   private boolean Dvpanel_panelestadisticas_Collapsible ;
   private boolean Dvpanel_panelestadisticas_Collapsed ;
   private boolean Dvpanel_panelestadisticas_Showcollapseicon ;
   private boolean Dvpanel_panelestadisticas_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV17Iniciado ;
   private String AV15Finalizado ;
   private String AV22Tiempo ;
   private String AV5Ciclos ;
   private String AV10DatosGenerados ;
   private String AV24Evaluar ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelestadisticas ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cerrar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucCronometro ;
   private HTMLChoice cmbavSegundos1 ;
   private HTMLChoice cmbavSegundos3 ;
   private HTMLChoice cmbavSegundos2 ;
   private HTMLChoice cmbavPorcerror ;
   private IDataStoreProvider pr_default ;
   private String[] H01W92_A313ContCod ;
   private String[] H01W92_A396EmprCod ;
   private String[] H01W92_A7208ContDsc2 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV6Col_ContDsc2 ;
}

final  class mrec_simular__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01W92", "SELECT ContCod, EmprCod, ContDsc2 FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

