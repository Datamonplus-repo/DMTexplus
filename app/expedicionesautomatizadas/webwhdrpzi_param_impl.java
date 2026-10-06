package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwhdrpzi_param_impl extends GXDataArea
{
   public webwhdrpzi_param_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwhdrpzi_param_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwhdrpzi_param_impl.class ));
   }

   public webwhdrpzi_param_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynavEmprcod = new HTMLChoice();
      dynavOpecod = new HTMLChoice();
      dynavMaqcod = new HTMLChoice();
      dynavFascod = new HTMLChoice();
      dynavBarcod = new HTMLChoice();
      dynavBarcodreo = new HTMLChoice();
      dynavBarcodpar = new HTMLChoice();
      dynavBarordlin = new HTMLChoice();
      dynavBarancaca1 = new HTMLChoice();
      dynavLecfec = new HTMLChoice();
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
      pa1IP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1IP2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webwhdrpzi_param", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_I", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Msg_i, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vOPENOM", GXutil.rtrim( AV20OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQNOM", GXutil.rtrim( AV22MaqNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASDSC", GXutil.rtrim( AV24FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_I", GXutil.rtrim( AV30Msg_i));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_I", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Msg_i, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPENOM", GXutil.rtrim( A653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
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
      if ( ! ( WebComp_Wc_objetowhdrpzi == null ) )
      {
         WebComp_Wc_objetowhdrpzi.componentjscripts();
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
         we1IP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1IP2( ) ;
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
      return formatLink("app.expedicionesautomatizadas.webwhdrpzi_param", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebWHDRPZI_param" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web WHDRPZI_param", "") ;
   }

   public void wb1IP0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavEmprcod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavEmprcod.getInternalname(), httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavEmprcod, dynavEmprcod.getInternalname(), GXutil.rtrim( AV32EmprCod), 1, dynavEmprcod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynavEmprcod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavEmprcod.setValue( GXutil.rtrim( AV32EmprCod) );
         httpContext.ajax_rsp_assign_prop("", false, dynavEmprcod.getInternalname(), "Values", dynavEmprcod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavOpecod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavOpecod.getInternalname(), httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavOpecod, dynavOpecod.getInternalname(), GXutil.trim( GXutil.str( AV19OpeCod, 6, 0)), 1, dynavOpecod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavOpecod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavOpecod.setValue( GXutil.trim( GXutil.str( AV19OpeCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavOpecod.getInternalname(), "Values", dynavOpecod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavMaqcod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavMaqcod.getInternalname(), httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavMaqcod, dynavMaqcod.getInternalname(), GXutil.rtrim( AV21MaqCod), 1, dynavMaqcod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynavMaqcod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavMaqcod.setValue( GXutil.rtrim( AV21MaqCod) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMaqcod.getInternalname(), "Values", dynavMaqcod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavFascod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavFascod.getInternalname(), httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavFascod, dynavFascod.getInternalname(), GXutil.rtrim( AV23FasCod), 1, dynavFascod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynavFascod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavFascod.setValue( GXutil.rtrim( AV23FasCod) );
         httpContext.ajax_rsp_assign_prop("", false, dynavFascod.getInternalname(), "Values", dynavFascod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavBarcod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavBarcod.getInternalname(), httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavBarcod, dynavBarcod.getInternalname(), GXutil.trim( GXutil.str( AV25BarCod, 8, 0)), 1, dynavBarcod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavBarcod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavBarcod.setValue( GXutil.trim( GXutil.str( AV25BarCod, 8, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarcod.getInternalname(), "Values", dynavBarcod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavBarcodreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavBarcodreo.getInternalname(), httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavBarcodreo, dynavBarcodreo.getInternalname(), GXutil.trim( GXutil.str( AV26BarCodReo, 1, 0)), 1, dynavBarcodreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavBarcodreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavBarcodreo.setValue( GXutil.trim( GXutil.str( AV26BarCodReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarcodreo.getInternalname(), "Values", dynavBarcodreo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavBarcodpar.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavBarcodpar.getInternalname(), httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavBarcodpar, dynavBarcodpar.getInternalname(), GXutil.rtrim( AV27BarCodPar), 1, dynavBarcodpar.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynavBarcodpar.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavBarcodpar.setValue( GXutil.rtrim( AV27BarCodPar) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarcodpar.getInternalname(), "Values", dynavBarcodpar.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavBarordlin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavBarordlin.getInternalname(), httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavBarordlin, dynavBarordlin.getInternalname(), GXutil.trim( GXutil.str( AV28BarOrdLin, 4, 0)), 1, dynavBarordlin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavBarordlin.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavBarordlin.setValue( GXutil.trim( GXutil.str( AV28BarOrdLin, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarordlin.getInternalname(), "Values", dynavBarordlin.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavBarancaca1.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavBarancaca1.getInternalname(), httpContext.getMessage( "Ancho Acabado 1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavBarancaca1, dynavBarancaca1.getInternalname(), GXutil.trim( GXutil.str( AV29BarAncAca1, 3, 0)), 1, dynavBarancaca1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavBarancaca1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavBarancaca1.setValue( GXutil.trim( GXutil.str( AV29BarAncAca1, 3, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarancaca1.getInternalname(), "Values", dynavBarancaca1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynavLecfec.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavLecfec.getInternalname(), httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavLecfec, dynavLecfec.getInternalname(), localUtil.dtoc( AV31LecFec, 0, "/"), 1, dynavLecfec.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "date", "", 1, dynavLecfec.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         dynavLecfec.setValue( localUtil.dtoc( AV31LecFec, 0, "/") );
         httpContext.ajax_rsp_assign_prop("", false, dynavLecfec.getInternalname(), "Values", dynavLecfec.ToJavascriptSource(), true);
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
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0073"+"", GXutil.rtrim( WebComp_Wc_objetowhdrpzi_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0073"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.strcmp(GXutil.lower( OldWc_objetowhdrpzi), GXutil.lower( WebComp_Wc_objetowhdrpzi_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0073"+"");
            }
            WebComp_Wc_objetowhdrpzi.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWc_objetowhdrpzi), GXutil.lower( WebComp_Wc_objetowhdrpzi_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
            httpContext.writeText( "</div>") ;
         }
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 7, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111ip1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", httpContext.getMessage( "PDF", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121ip1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncsv_Internalname, "", httpContext.getMessage( "CSV", ""), bttBtncsv_Jsonclick, 7, httpContext.getMessage( "CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e131ip1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e141ip1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI_param.htm");
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

   public void start1IP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web WHDRPZI_param", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1IP0( ) ;
   }

   public void ws1IP2( )
   {
      start1IP2( ) ;
      evt1IP2( ) ;
   }

   public void evt1IP2( )
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
                           e151IP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e161IP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171IP2 ();
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
                     if ( nCmpId == 73 )
                     {
                        OldWc_objetowhdrpzi = httpContext.cgiGet( "W0073") ;
                        if ( ( GXutil.len( OldWc_objetowhdrpzi) == 0 ) || ( GXutil.strcmp(OldWc_objetowhdrpzi, WebComp_Wc_objetowhdrpzi_Component) != 0 ) )
                        {
                           WebComp_Wc_objetowhdrpzi = WebUtils.getWebComponent(getClass(), "app." + OldWc_objetowhdrpzi + "_impl", remoteHandle, context);
                           WebComp_Wc_objetowhdrpzi_Component = OldWc_objetowhdrpzi ;
                        }
                        WebComp_Wc_objetowhdrpzi.componentprocess("W0073", "", sEvt);
                        WebComp_Wc_objetowhdrpzi_Component = OldWc_objetowhdrpzi ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1IP2( )
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

   public void pa1IP2( )
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
            GX_FocusControl = dynavEmprcod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvvlecfec1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvlecfec_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvlecfec_html1IP1( )
   {
      java.util.Date gxdynajaxvalue;
      gxdlvvlecfec_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavLecfec.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = localUtil.ctod( gxdynajaxctrlcodr.item(gxdynajaxindex), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         dynavLecfec.addItem(localUtil.dtoc( gxdynajaxvalue, 0, "/"), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavLecfec.getItemCount() > 0 )
      {
         AV31LecFec = localUtil.ctod( dynavLecfec.getValidValue(localUtil.dtoc( AV31LecFec, 0, "/")), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31LecFec", localUtil.format(AV31LecFec, "99/99/99"));
      }
   }

   protected void gxdlvvlecfec_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(localUtil.format(H01IP2_A1174LecFec[0], "99/99/99"));
         gxdynajaxctrldescr.add(localUtil.format(H01IP2_A1174LecFec[0], "99/99/99"));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlvvbarancaca11IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvbarancaca1_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvbarancaca1_html1IP1( )
   {
      short gxdynajaxvalue;
      gxdlvvbarancaca1_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavBarancaca1.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavBarancaca1.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 3, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavBarancaca1.getItemCount() > 0 )
      {
         AV29BarAncAca1 = (short)(GXutil.lval( dynavBarancaca1.getValidValue(GXutil.trim( GXutil.str( AV29BarAncAca1, 3, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarAncAca1), 3, 0));
      }
   }

   protected void gxdlvvbarancaca1_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H01IP3_A125BarAncAca1[0], (byte)(3), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.ltrim( localUtil.ntoc( H01IP3_A125BarAncAca1[0], (byte)(3), (byte)(0), ".", "")));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxdlvvbarordlin1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvbarordlin_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvbarordlin_html1IP1( )
   {
      short gxdynajaxvalue;
      gxdlvvbarordlin_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavBarordlin.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavBarordlin.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavBarordlin.getItemCount() > 0 )
      {
         AV28BarOrdLin = (short)(GXutil.lval( dynavBarordlin.getValidValue(GXutil.trim( GXutil.str( AV28BarOrdLin, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarOrdLin), 4, 0));
      }
   }

   protected void gxdlvvbarordlin_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H01IP4_A194BarOrdLin[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.ltrim( localUtil.ntoc( H01IP4_A194BarOrdLin[0], (byte)(4), (byte)(0), ".", "")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxdlvvbarcodpar1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvbarcodpar_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvbarcodpar_html1IP1( )
   {
      String gxdynajaxvalue;
      gxdlvvbarcodpar_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavBarcodpar.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavBarcodpar.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavBarcodpar.getItemCount() > 0 )
      {
         AV27BarCodPar = dynavBarcodpar.getValidValue(AV27BarCodPar) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
      }
   }

   protected void gxdlvvbarcodpar_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01IP5_A130BarCodPar[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01IP5_A130BarCodPar[0]));
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxdlvvbarcodreo1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvbarcodreo_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvbarcodreo_html1IP1( )
   {
      byte gxdynajaxvalue;
      gxdlvvbarcodreo_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavBarcodreo.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavBarcodreo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 1, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavBarcodreo.getItemCount() > 0 )
      {
         AV26BarCodReo = (byte)(GXutil.lval( dynavBarcodreo.getValidValue(GXutil.trim( GXutil.str( AV26BarCodReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
      }
   }

   protected void gxdlvvbarcodreo_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H01IP6_A132BarCodReo[0], (byte)(1), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.ltrim( localUtil.ntoc( H01IP6_A132BarCodReo[0], (byte)(1), (byte)(0), ".", "")));
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxdlvvbarcod1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvbarcod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvbarcod_html1IP1( )
   {
      int gxdynajaxvalue;
      gxdlvvbarcod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavBarcod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavBarcod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 8, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavBarcod.getItemCount() > 0 )
      {
         AV25BarCod = (int)(GXutil.lval( dynavBarcod.getValidValue(GXutil.trim( GXutil.str( AV25BarCod, 8, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      }
   }

   protected void gxdlvvbarcod_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H01IP7_A129BarCod[0], (byte)(8), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.ltrim( localUtil.ntoc( H01IP7_A129BarCod[0], (byte)(8), (byte)(0), ".", "")));
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void gxdlvvfascod1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvfascod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvfascod_html1IP1( )
   {
      String gxdynajaxvalue;
      gxdlvvfascod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavFascod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavFascod.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavFascod.getItemCount() > 0 )
      {
         AV23FasCod = dynavFascod.getValidValue(AV23FasCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23FasCod", AV23FasCod);
      }
   }

   protected void gxdlvvfascod_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01IP8_A457FasCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01IP8_A457FasCod[0]));
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void gxdlvvmaqcod1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvmaqcod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvmaqcod_html1IP1( )
   {
      String gxdynajaxvalue;
      gxdlvvmaqcod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavMaqcod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavMaqcod.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavMaqcod.getItemCount() > 0 )
      {
         AV21MaqCod = dynavMaqcod.getValidValue(AV21MaqCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21MaqCod", AV21MaqCod);
      }
   }

   protected void gxdlvvmaqcod_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01IP9_A602MaqCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01IP9_A602MaqCod[0]));
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void gxdlvvopecod1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvopecod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvopecod_html1IP1( )
   {
      int gxdynajaxvalue;
      gxdlvvopecod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavOpecod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavOpecod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 6, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavOpecod.getItemCount() > 0 )
      {
         AV19OpeCod = (int)(GXutil.lval( dynavOpecod.getValidValue(GXutil.trim( GXutil.str( AV19OpeCod, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OpeCod), 6, 0));
      }
   }

   protected void gxdlvvopecod_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H01IP10_A652OpeCod[0], (byte)(6), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.ltrim( localUtil.ntoc( H01IP10_A652OpeCod[0], (byte)(6), (byte)(0), ".", "")));
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void gxdlvvemprcod1IP1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvemprcod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxvvemprcod_html1IP1( )
   {
      String gxdynajaxvalue;
      gxdlvvemprcod_data1IP1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavEmprcod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavEmprcod.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavEmprcod.getItemCount() > 0 )
      {
         AV32EmprCod = dynavEmprcod.getValidValue(AV32EmprCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      }
   }

   protected void gxdlvvemprcod_data1IP1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IP11 */
      pr_default.execute(9);
      while ( (pr_default.getStatus(9) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01IP11_A396EmprCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01IP11_A407EmprNom[0]));
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavLecfec.setName( "vLECFEC" );
         dynavLecfec.setWebtags( "" );
         dynavLecfec.removeAllItems();
         /* Using cursor H01IP12 */
         pr_default.execute(10);
         while ( (pr_default.getStatus(10) != 101) )
         {
            dynavLecfec.addItem(localUtil.dtoc( H01IP12_A1174LecFec[0], 0, "/"), localUtil.format(H01IP12_A1174LecFec[0], "99/99/99"), (short)(0));
            pr_default.readNext(10);
         }
         pr_default.close(10);
         if ( dynavLecfec.getItemCount() > 0 )
         {
            AV31LecFec = localUtil.ctod( dynavLecfec.getValidValue(localUtil.dtoc( AV31LecFec, 0, "/")), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31LecFec", localUtil.format(AV31LecFec, "99/99/99"));
         }
         dynavBarancaca1.setName( "vBARANCACA1" );
         dynavBarancaca1.setWebtags( "" );
         dynavBarancaca1.removeAllItems();
         /* Using cursor H01IP13 */
         pr_default.execute(11);
         while ( (pr_default.getStatus(11) != 101) )
         {
            dynavBarancaca1.addItem(GXutil.trim( GXutil.str( H01IP13_A125BarAncAca1[0], 3, 0)), GXutil.str( H01IP13_A125BarAncAca1[0], 3, 0), (short)(0));
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( dynavBarancaca1.getItemCount() > 0 )
         {
            AV29BarAncAca1 = (short)(GXutil.lval( dynavBarancaca1.getValidValue(GXutil.trim( GXutil.str( AV29BarAncAca1, 3, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarAncAca1), 3, 0));
         }
         dynavBarordlin.setName( "vBARORDLIN" );
         dynavBarordlin.setWebtags( "" );
         dynavBarordlin.removeAllItems();
         /* Using cursor H01IP14 */
         pr_default.execute(12);
         while ( (pr_default.getStatus(12) != 101) )
         {
            dynavBarordlin.addItem(GXutil.trim( GXutil.str( H01IP14_A194BarOrdLin[0], 4, 0)), GXutil.str( H01IP14_A194BarOrdLin[0], 4, 0), (short)(0));
            pr_default.readNext(12);
         }
         pr_default.close(12);
         if ( dynavBarordlin.getItemCount() > 0 )
         {
            AV28BarOrdLin = (short)(GXutil.lval( dynavBarordlin.getValidValue(GXutil.trim( GXutil.str( AV28BarOrdLin, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarOrdLin), 4, 0));
         }
         dynavBarcodpar.setName( "vBARCODPAR" );
         dynavBarcodpar.setWebtags( "" );
         dynavBarcodpar.removeAllItems();
         /* Using cursor H01IP15 */
         pr_default.execute(13);
         while ( (pr_default.getStatus(13) != 101) )
         {
            dynavBarcodpar.addItem(H01IP15_A130BarCodPar[0], H01IP15_A130BarCodPar[0], (short)(0));
            pr_default.readNext(13);
         }
         pr_default.close(13);
         if ( dynavBarcodpar.getItemCount() > 0 )
         {
            AV27BarCodPar = dynavBarcodpar.getValidValue(AV27BarCodPar) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
         }
         dynavBarcodreo.setName( "vBARCODREO" );
         dynavBarcodreo.setWebtags( "" );
         dynavBarcodreo.removeAllItems();
         /* Using cursor H01IP16 */
         pr_default.execute(14);
         while ( (pr_default.getStatus(14) != 101) )
         {
            dynavBarcodreo.addItem(GXutil.trim( GXutil.str( H01IP16_A132BarCodReo[0], 1, 0)), GXutil.str( H01IP16_A132BarCodReo[0], 1, 0), (short)(0));
            pr_default.readNext(14);
         }
         pr_default.close(14);
         if ( dynavBarcodreo.getItemCount() > 0 )
         {
            AV26BarCodReo = (byte)(GXutil.lval( dynavBarcodreo.getValidValue(GXutil.trim( GXutil.str( AV26BarCodReo, 1, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
         }
         dynavBarcod.setName( "vBARCOD" );
         dynavBarcod.setWebtags( "" );
         dynavBarcod.removeAllItems();
         /* Using cursor H01IP17 */
         pr_default.execute(15);
         while ( (pr_default.getStatus(15) != 101) )
         {
            dynavBarcod.addItem(GXutil.trim( GXutil.str( H01IP17_A129BarCod[0], 8, 0)), GXutil.str( H01IP17_A129BarCod[0], 8, 0), (short)(0));
            pr_default.readNext(15);
         }
         pr_default.close(15);
         if ( dynavBarcod.getItemCount() > 0 )
         {
            AV25BarCod = (int)(GXutil.lval( dynavBarcod.getValidValue(GXutil.trim( GXutil.str( AV25BarCod, 8, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
         }
         dynavFascod.setName( "vFASCOD" );
         dynavFascod.setWebtags( "" );
         dynavFascod.removeAllItems();
         /* Using cursor H01IP18 */
         pr_default.execute(16);
         while ( (pr_default.getStatus(16) != 101) )
         {
            dynavFascod.addItem(H01IP18_A457FasCod[0], H01IP18_A457FasCod[0], (short)(0));
            pr_default.readNext(16);
         }
         pr_default.close(16);
         if ( dynavFascod.getItemCount() > 0 )
         {
            AV23FasCod = dynavFascod.getValidValue(AV23FasCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FasCod", AV23FasCod);
         }
         dynavMaqcod.setName( "vMAQCOD" );
         dynavMaqcod.setWebtags( "" );
         dynavMaqcod.removeAllItems();
         /* Using cursor H01IP19 */
         pr_default.execute(17);
         while ( (pr_default.getStatus(17) != 101) )
         {
            dynavMaqcod.addItem(H01IP19_A602MaqCod[0], H01IP19_A602MaqCod[0], (short)(0));
            pr_default.readNext(17);
         }
         pr_default.close(17);
         if ( dynavMaqcod.getItemCount() > 0 )
         {
            AV21MaqCod = dynavMaqcod.getValidValue(AV21MaqCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21MaqCod", AV21MaqCod);
         }
         dynavOpecod.setName( "vOPECOD" );
         dynavOpecod.setWebtags( "" );
         dynavOpecod.removeAllItems();
         /* Using cursor H01IP20 */
         pr_default.execute(18);
         while ( (pr_default.getStatus(18) != 101) )
         {
            dynavOpecod.addItem(GXutil.trim( GXutil.str( H01IP20_A652OpeCod[0], 6, 0)), GXutil.str( H01IP20_A652OpeCod[0], 6, 0), (short)(0));
            pr_default.readNext(18);
         }
         pr_default.close(18);
         if ( dynavOpecod.getItemCount() > 0 )
         {
            AV19OpeCod = (int)(GXutil.lval( dynavOpecod.getValidValue(GXutil.trim( GXutil.str( AV19OpeCod, 6, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OpeCod), 6, 0));
         }
         dynavEmprcod.setName( "vEMPRCOD" );
         dynavEmprcod.setWebtags( "" );
         dynavEmprcod.removeAllItems();
         /* Using cursor H01IP21 */
         pr_default.execute(19);
         while ( (pr_default.getStatus(19) != 101) )
         {
            dynavEmprcod.addItem(H01IP21_A396EmprCod[0], H01IP21_A407EmprNom[0], (short)(0));
            pr_default.readNext(19);
         }
         pr_default.close(19);
         if ( dynavEmprcod.getItemCount() > 0 )
         {
            AV32EmprCod = dynavEmprcod.getValidValue(AV32EmprCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
         }
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( dynavEmprcod.getItemCount() > 0 )
      {
         AV32EmprCod = dynavEmprcod.getValidValue(AV32EmprCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavEmprcod.setValue( GXutil.rtrim( AV32EmprCod) );
         httpContext.ajax_rsp_assign_prop("", false, dynavEmprcod.getInternalname(), "Values", dynavEmprcod.ToJavascriptSource(), true);
      }
      if ( dynavOpecod.getItemCount() > 0 )
      {
         AV19OpeCod = (int)(GXutil.lval( dynavOpecod.getValidValue(GXutil.trim( GXutil.str( AV19OpeCod, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OpeCod), 6, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavOpecod.setValue( GXutil.trim( GXutil.str( AV19OpeCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavOpecod.getInternalname(), "Values", dynavOpecod.ToJavascriptSource(), true);
      }
      if ( dynavMaqcod.getItemCount() > 0 )
      {
         AV21MaqCod = dynavMaqcod.getValidValue(AV21MaqCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21MaqCod", AV21MaqCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavMaqcod.setValue( GXutil.rtrim( AV21MaqCod) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMaqcod.getInternalname(), "Values", dynavMaqcod.ToJavascriptSource(), true);
      }
      if ( dynavFascod.getItemCount() > 0 )
      {
         AV23FasCod = dynavFascod.getValidValue(AV23FasCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23FasCod", AV23FasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavFascod.setValue( GXutil.rtrim( AV23FasCod) );
         httpContext.ajax_rsp_assign_prop("", false, dynavFascod.getInternalname(), "Values", dynavFascod.ToJavascriptSource(), true);
      }
      if ( dynavBarcod.getItemCount() > 0 )
      {
         AV25BarCod = (int)(GXutil.lval( dynavBarcod.getValidValue(GXutil.trim( GXutil.str( AV25BarCod, 8, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavBarcod.setValue( GXutil.trim( GXutil.str( AV25BarCod, 8, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarcod.getInternalname(), "Values", dynavBarcod.ToJavascriptSource(), true);
      }
      if ( dynavBarcodreo.getItemCount() > 0 )
      {
         AV26BarCodReo = (byte)(GXutil.lval( dynavBarcodreo.getValidValue(GXutil.trim( GXutil.str( AV26BarCodReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavBarcodreo.setValue( GXutil.trim( GXutil.str( AV26BarCodReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarcodreo.getInternalname(), "Values", dynavBarcodreo.ToJavascriptSource(), true);
      }
      if ( dynavBarcodpar.getItemCount() > 0 )
      {
         AV27BarCodPar = dynavBarcodpar.getValidValue(AV27BarCodPar) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavBarcodpar.setValue( GXutil.rtrim( AV27BarCodPar) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarcodpar.getInternalname(), "Values", dynavBarcodpar.ToJavascriptSource(), true);
      }
      if ( dynavBarordlin.getItemCount() > 0 )
      {
         AV28BarOrdLin = (short)(GXutil.lval( dynavBarordlin.getValidValue(GXutil.trim( GXutil.str( AV28BarOrdLin, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarOrdLin), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavBarordlin.setValue( GXutil.trim( GXutil.str( AV28BarOrdLin, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarordlin.getInternalname(), "Values", dynavBarordlin.ToJavascriptSource(), true);
      }
      if ( dynavBarancaca1.getItemCount() > 0 )
      {
         AV29BarAncAca1 = (short)(GXutil.lval( dynavBarancaca1.getValidValue(GXutil.trim( GXutil.str( AV29BarAncAca1, 3, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarAncAca1), 3, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavBarancaca1.setValue( GXutil.trim( GXutil.str( AV29BarAncAca1, 3, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarancaca1.getInternalname(), "Values", dynavBarancaca1.ToJavascriptSource(), true);
      }
      if ( dynavLecfec.getItemCount() > 0 )
      {
         AV31LecFec = localUtil.ctod( dynavLecfec.getValidValue(localUtil.dtoc( AV31LecFec, 0, "/")), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31LecFec", localUtil.format(AV31LecFec, "99/99/99"));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavLecfec.setValue( localUtil.dtoc( AV31LecFec, 0, "/") );
         httpContext.ajax_rsp_assign_prop("", false, dynavLecfec.getInternalname(), "Values", dynavLecfec.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1IP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV35Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI_param" ;
      Gx_err = (short)(0) ;
   }

   public void rf1IP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            WebComp_Wc_objetowhdrpzi.componentstart();
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171IP2 ();
         wb1IP0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1IP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_I", GXutil.rtrim( AV30Msg_i));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_I", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Msg_i, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Pgmname, ""))));
   }

   public void before_start_formulas( )
   {
      AV35Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI_param" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1IP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151IP2 ();
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
         dynavEmprcod.setValue( httpContext.cgiGet( dynavEmprcod.getInternalname()) );
         AV32EmprCod = httpContext.cgiGet( dynavEmprcod.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
         dynavOpecod.setValue( httpContext.cgiGet( dynavOpecod.getInternalname()) );
         AV19OpeCod = (int)(GXutil.lval( httpContext.cgiGet( dynavOpecod.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OpeCod), 6, 0));
         dynavMaqcod.setValue( httpContext.cgiGet( dynavMaqcod.getInternalname()) );
         AV21MaqCod = httpContext.cgiGet( dynavMaqcod.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21MaqCod", AV21MaqCod);
         dynavFascod.setValue( httpContext.cgiGet( dynavFascod.getInternalname()) );
         AV23FasCod = httpContext.cgiGet( dynavFascod.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23FasCod", AV23FasCod);
         dynavBarcod.setValue( httpContext.cgiGet( dynavBarcod.getInternalname()) );
         AV25BarCod = (int)(GXutil.lval( httpContext.cgiGet( dynavBarcod.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
         dynavBarcodreo.setValue( httpContext.cgiGet( dynavBarcodreo.getInternalname()) );
         AV26BarCodReo = (byte)(GXutil.lval( httpContext.cgiGet( dynavBarcodreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
         dynavBarcodpar.setValue( httpContext.cgiGet( dynavBarcodpar.getInternalname()) );
         AV27BarCodPar = httpContext.cgiGet( dynavBarcodpar.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
         dynavBarordlin.setValue( httpContext.cgiGet( dynavBarordlin.getInternalname()) );
         AV28BarOrdLin = (short)(GXutil.lval( httpContext.cgiGet( dynavBarordlin.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarOrdLin), 4, 0));
         dynavBarancaca1.setValue( httpContext.cgiGet( dynavBarancaca1.getInternalname()) );
         AV29BarAncAca1 = (short)(GXutil.lval( httpContext.cgiGet( dynavBarancaca1.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarAncAca1), 3, 0));
         dynavLecfec.setValue( httpContext.cgiGet( dynavLecfec.getInternalname()) );
         AV31LecFec = localUtil.ctod( httpContext.cgiGet( dynavLecfec.getInternalname()), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31LecFec", localUtil.format(AV31LecFec, "99/99/99"));
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
      e151IP2 ();
      if (returnInSub) return;
   }

   public void e151IP2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void e161IP2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOCALIZARNOMBREOPERADOR' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOCALIZARDSCFASE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOCALIZARDSCMAQUINA' */
      S132 ();
      if (returnInSub) return;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Datos de enviados: EmprCod=%1, OpeCod=%2,OpeNom=%3,&MaqCod=%4,&MaqNom=%5,&FasCod=%6,&FasDsc=%7,&BarCod=%8,&BarCodReo=%9,&BarCodPar=%10,&BarOrdlin=%11,&BarAncAca1=%12,&Msg_i=%13,&Lecfec=%14", AV32EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OpeCod), 6, 0), AV20OpeNom, AV21MaqCod, AV22MaqNom, AV23FasCod, AV24FasDsc, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0), GXutil.str( AV26BarCodReo, 1, 0)), AV35Pgmname) ;
      callWebObject(formatLink("app.expedicionesautomatizadas.webwhdrpzi", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV20OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV21MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV22MaqNom)),GXutil.URLEncode(GXutil.rtrim(AV23FasCod)),GXutil.URLEncode(GXutil.rtrim(AV24FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV27BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV28BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29BarAncAca1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV30Msg_i)),GXutil.URLEncode(GXutil.formatDateParm(AV31LecFec))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqNom","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","BarOrdlin","BarAncAca1","Msg_i","Lecfec"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOCALIZARNOMBREOPERADOR' Routine */
      returnInSub = false ;
      /* Using cursor H01IP22 */
      pr_default.execute(20, new Object[] {Integer.valueOf(AV19OpeCod)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A652OpeCod = H01IP22_A652OpeCod[0] ;
         A653OpeNom = H01IP22_A653OpeNom[0] ;
         n653OpeNom = H01IP22_n653OpeNom[0] ;
         AV20OpeNom = A653OpeNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OpeNom", AV20OpeNom);
         pr_default.readNext(20);
      }
      pr_default.close(20);
   }

   public void S122( )
   {
      /* 'LOCALIZARDSCFASE' Routine */
      returnInSub = false ;
      /* Using cursor H01IP23 */
      pr_default.execute(21, new Object[] {AV23FasCod});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A457FasCod = H01IP23_A457FasCod[0] ;
         A460FasDsc = H01IP23_A460FasDsc[0] ;
         AV24FasDsc = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24FasDsc", AV24FasDsc);
         pr_default.readNext(21);
      }
      pr_default.close(21);
   }

   public void S132( )
   {
      /* 'LOCALIZARDSCMAQUINA' Routine */
      returnInSub = false ;
      /* Using cursor H01IP24 */
      pr_default.execute(22, new Object[] {AV21MaqCod});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A602MaqCod = H01IP24_A602MaqCod[0] ;
         A606MaqDsc = H01IP24_A606MaqDsc[0] ;
         n606MaqDsc = H01IP24_n606MaqDsc[0] ;
         AV22MaqNom = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22MaqNom", AV22MaqNom);
         pr_default.readNext(22);
      }
      pr_default.close(22);
   }

   protected void nextLoad( )
   {
   }

   protected void e171IP2( )
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
      pa1IP2( ) ;
      ws1IP2( ) ;
      we1IP2( ) ;
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
      if ( ! ( WebComp_Wc_objetowhdrpzi == null ) )
      {
         WebComp_Wc_objetowhdrpzi.componentthemes();
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513993", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webwhdrpzi_param.js", "?20268241513993", false, true);
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
      dynavEmprcod.setInternalname( "vEMPRCOD" );
      dynavOpecod.setInternalname( "vOPECOD" );
      dynavMaqcod.setInternalname( "vMAQCOD" );
      dynavFascod.setInternalname( "vFASCOD" );
      dynavBarcod.setInternalname( "vBARCOD" );
      dynavBarcodreo.setInternalname( "vBARCODREO" );
      dynavBarcodpar.setInternalname( "vBARCODPAR" );
      dynavBarordlin.setInternalname( "vBARORDLIN" );
      dynavBarancaca1.setInternalname( "vBARANCACA1" );
      dynavLecfec.setInternalname( "vLECFEC" );
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnexcel_Internalname = "BTNEXCEL" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtncsv_Internalname = "BTNCSV" ;
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
      dynavLecfec.setJsonclick( "" );
      dynavLecfec.setEnabled( 1 );
      dynavBarancaca1.setJsonclick( "" );
      dynavBarancaca1.setEnabled( 1 );
      dynavBarordlin.setJsonclick( "" );
      dynavBarordlin.setEnabled( 1 );
      dynavBarcodpar.setJsonclick( "" );
      dynavBarcodpar.setEnabled( 1 );
      dynavBarcodreo.setJsonclick( "" );
      dynavBarcodreo.setEnabled( 1 );
      dynavBarcod.setJsonclick( "" );
      dynavBarcod.setEnabled( 1 );
      dynavFascod.setJsonclick( "" );
      dynavFascod.setEnabled( 1 );
      dynavMaqcod.setJsonclick( "" );
      dynavMaqcod.setEnabled( 1 );
      dynavOpecod.setJsonclick( "" );
      dynavOpecod.setEnabled( 1 );
      dynavEmprcod.setJsonclick( "" );
      dynavEmprcod.setEnabled( 1 );
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
      Form.setCaption( httpContext.getMessage( "Web WHDRPZI_param", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      dynavEmprcod.setName( "vEMPRCOD" );
      dynavEmprcod.setWebtags( "" );
      dynavEmprcod.removeAllItems();
      /* Using cursor H01IP25 */
      pr_default.execute(23);
      while ( (pr_default.getStatus(23) != 101) )
      {
         dynavEmprcod.addItem(H01IP25_A396EmprCod[0], H01IP25_A407EmprNom[0], (short)(0));
         pr_default.readNext(23);
      }
      pr_default.close(23);
      if ( dynavEmprcod.getItemCount() > 0 )
      {
         AV32EmprCod = dynavEmprcod.getValidValue(AV32EmprCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      }
      dynavOpecod.setName( "vOPECOD" );
      dynavOpecod.setWebtags( "" );
      dynavOpecod.removeAllItems();
      /* Using cursor H01IP26 */
      pr_default.execute(24);
      while ( (pr_default.getStatus(24) != 101) )
      {
         dynavOpecod.addItem(GXutil.trim( GXutil.str( H01IP26_A652OpeCod[0], 6, 0)), GXutil.str( H01IP26_A652OpeCod[0], 6, 0), (short)(0));
         pr_default.readNext(24);
      }
      pr_default.close(24);
      if ( dynavOpecod.getItemCount() > 0 )
      {
         AV19OpeCod = (int)(GXutil.lval( dynavOpecod.getValidValue(GXutil.trim( GXutil.str( AV19OpeCod, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OpeCod), 6, 0));
      }
      dynavMaqcod.setName( "vMAQCOD" );
      dynavMaqcod.setWebtags( "" );
      dynavMaqcod.removeAllItems();
      /* Using cursor H01IP27 */
      pr_default.execute(25);
      while ( (pr_default.getStatus(25) != 101) )
      {
         dynavMaqcod.addItem(H01IP27_A602MaqCod[0], H01IP27_A602MaqCod[0], (short)(0));
         pr_default.readNext(25);
      }
      pr_default.close(25);
      if ( dynavMaqcod.getItemCount() > 0 )
      {
         AV21MaqCod = dynavMaqcod.getValidValue(AV21MaqCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21MaqCod", AV21MaqCod);
      }
      dynavFascod.setName( "vFASCOD" );
      dynavFascod.setWebtags( "" );
      dynavFascod.removeAllItems();
      /* Using cursor H01IP28 */
      pr_default.execute(26);
      while ( (pr_default.getStatus(26) != 101) )
      {
         dynavFascod.addItem(H01IP28_A457FasCod[0], H01IP28_A457FasCod[0], (short)(0));
         pr_default.readNext(26);
      }
      pr_default.close(26);
      if ( dynavFascod.getItemCount() > 0 )
      {
         AV23FasCod = dynavFascod.getValidValue(AV23FasCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23FasCod", AV23FasCod);
      }
      dynavBarcod.setName( "vBARCOD" );
      dynavBarcod.setWebtags( "" );
      dynavBarcod.removeAllItems();
      /* Using cursor H01IP29 */
      pr_default.execute(27);
      while ( (pr_default.getStatus(27) != 101) )
      {
         dynavBarcod.addItem(GXutil.trim( GXutil.str( H01IP29_A129BarCod[0], 8, 0)), GXutil.str( H01IP29_A129BarCod[0], 8, 0), (short)(0));
         pr_default.readNext(27);
      }
      pr_default.close(27);
      if ( dynavBarcod.getItemCount() > 0 )
      {
         AV25BarCod = (int)(GXutil.lval( dynavBarcod.getValidValue(GXutil.trim( GXutil.str( AV25BarCod, 8, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      }
      dynavBarcodreo.setName( "vBARCODREO" );
      dynavBarcodreo.setWebtags( "" );
      dynavBarcodreo.removeAllItems();
      /* Using cursor H01IP30 */
      pr_default.execute(28);
      while ( (pr_default.getStatus(28) != 101) )
      {
         dynavBarcodreo.addItem(GXutil.trim( GXutil.str( H01IP30_A132BarCodReo[0], 1, 0)), GXutil.str( H01IP30_A132BarCodReo[0], 1, 0), (short)(0));
         pr_default.readNext(28);
      }
      pr_default.close(28);
      if ( dynavBarcodreo.getItemCount() > 0 )
      {
         AV26BarCodReo = (byte)(GXutil.lval( dynavBarcodreo.getValidValue(GXutil.trim( GXutil.str( AV26BarCodReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
      }
      dynavBarcodpar.setName( "vBARCODPAR" );
      dynavBarcodpar.setWebtags( "" );
      dynavBarcodpar.removeAllItems();
      /* Using cursor H01IP31 */
      pr_default.execute(29);
      while ( (pr_default.getStatus(29) != 101) )
      {
         dynavBarcodpar.addItem(H01IP31_A130BarCodPar[0], H01IP31_A130BarCodPar[0], (short)(0));
         pr_default.readNext(29);
      }
      pr_default.close(29);
      if ( dynavBarcodpar.getItemCount() > 0 )
      {
         AV27BarCodPar = dynavBarcodpar.getValidValue(AV27BarCodPar) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
      }
      dynavBarordlin.setName( "vBARORDLIN" );
      dynavBarordlin.setWebtags( "" );
      dynavBarordlin.removeAllItems();
      /* Using cursor H01IP32 */
      pr_default.execute(30);
      while ( (pr_default.getStatus(30) != 101) )
      {
         dynavBarordlin.addItem(GXutil.trim( GXutil.str( H01IP32_A194BarOrdLin[0], 4, 0)), GXutil.str( H01IP32_A194BarOrdLin[0], 4, 0), (short)(0));
         pr_default.readNext(30);
      }
      pr_default.close(30);
      if ( dynavBarordlin.getItemCount() > 0 )
      {
         AV28BarOrdLin = (short)(GXutil.lval( dynavBarordlin.getValidValue(GXutil.trim( GXutil.str( AV28BarOrdLin, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarOrdLin), 4, 0));
      }
      dynavBarancaca1.setName( "vBARANCACA1" );
      dynavBarancaca1.setWebtags( "" );
      dynavBarancaca1.removeAllItems();
      /* Using cursor H01IP33 */
      pr_default.execute(31);
      while ( (pr_default.getStatus(31) != 101) )
      {
         dynavBarancaca1.addItem(GXutil.trim( GXutil.str( H01IP33_A125BarAncAca1[0], 3, 0)), GXutil.str( H01IP33_A125BarAncAca1[0], 3, 0), (short)(0));
         pr_default.readNext(31);
      }
      pr_default.close(31);
      if ( dynavBarancaca1.getItemCount() > 0 )
      {
         AV29BarAncAca1 = (short)(GXutil.lval( dynavBarancaca1.getValidValue(GXutil.trim( GXutil.str( AV29BarAncAca1, 3, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarAncAca1), 3, 0));
      }
      dynavLecfec.setName( "vLECFEC" );
      dynavLecfec.setWebtags( "" );
      dynavLecfec.removeAllItems();
      /* Using cursor H01IP34 */
      pr_default.execute(32);
      while ( (pr_default.getStatus(32) != 101) )
      {
         dynavLecfec.addItem(localUtil.dtoc( H01IP34_A1174LecFec[0], 0, "/"), localUtil.format(H01IP34_A1174LecFec[0], "99/99/99"), (short)(0));
         pr_default.readNext(32);
      }
      pr_default.close(32);
      if ( dynavLecfec.getItemCount() > 0 )
      {
         AV31LecFec = localUtil.ctod( dynavLecfec.getValidValue(localUtil.dtoc( AV31LecFec, 0, "/")), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31LecFec", localUtil.format(AV31LecFec, "99/99/99"));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'dynavLecfec'},{av:'AV31LecFec',fld:'vLECFEC',pic:''},{av:'dynavBarancaca1'},{av:'AV29BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'dynavBarordlin'},{av:'AV28BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'dynavBarcodpar'},{av:'AV27BarCodPar',fld:'vBARCODPAR',pic:''},{av:'dynavBarcodreo'},{av:'AV26BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'dynavBarcod'},{av:'AV25BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'dynavFascod'},{av:'AV23FasCod',fld:'vFASCOD',pic:'@!'},{av:'dynavMaqcod'},{av:'AV21MaqCod',fld:'vMAQCOD',pic:''},{av:'dynavOpecod'},{av:'AV19OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'dynavEmprcod'},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30Msg_i',fld:'vMSG_I',pic:'',hsh:true},{av:'AV35Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e161IP2',iparms:[{av:'dynavEmprcod'},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'dynavOpecod'},{av:'AV19OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV20OpeNom',fld:'vOPENOM',pic:''},{av:'dynavMaqcod'},{av:'AV21MaqCod',fld:'vMAQCOD',pic:''},{av:'AV22MaqNom',fld:'vMAQNOM',pic:''},{av:'dynavFascod'},{av:'AV23FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV24FasDsc',fld:'vFASDSC',pic:''},{av:'dynavBarcod'},{av:'AV25BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'dynavBarcodreo'},{av:'AV26BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'dynavBarcodpar'},{av:'AV27BarCodPar',fld:'vBARCODPAR',pic:''},{av:'dynavBarordlin'},{av:'AV28BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'dynavBarancaca1'},{av:'AV29BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV30Msg_i',fld:'vMSG_I',pic:'',hsh:true},{av:'dynavLecfec'},{av:'AV31LecFec',fld:'vLECFEC',pic:''},{av:'AV35Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV20OpeNom',fld:'vOPENOM',pic:''},{av:'AV24FasDsc',fld:'vFASDSC',pic:''},{av:'AV22MaqNom',fld:'vMAQNOM',pic:''}]}");
      setEventMetadata("'DOEXCEL'","{handler:'e111IP1',iparms:[]");
      setEventMetadata("'DOEXCEL'",",oparms:[]}");
      setEventMetadata("'DOPDF'","{handler:'e121IP1',iparms:[]");
      setEventMetadata("'DOPDF'",",oparms:[]}");
      setEventMetadata("'DOCSV'","{handler:'e131IP1',iparms:[]");
      setEventMetadata("'DOCSV'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141IP1',iparms:[]");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV30Msg_i = "" ;
      AV35Pgmname = "" ;
      GXKey = "" ;
      AV20OpeNom = "" ;
      AV22MaqNom = "" ;
      AV24FasDsc = "" ;
      A653OpeNom = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV32EmprCod = "" ;
      AV21MaqCod = "" ;
      AV23FasCod = "" ;
      AV27BarCodPar = "" ;
      AV31LecFec = GXutil.nullDate() ;
      WebComp_Wc_objetowhdrpzi_Component = "" ;
      OldWc_objetowhdrpzi = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncsv_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H01IP2_A396EmprCod = new String[] {""} ;
      H01IP2_A1166LecMaqCod = new String[] {""} ;
      H01IP2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01IP2_n1174LecFec = new boolean[] {false} ;
      H01IP3_A396EmprCod = new String[] {""} ;
      H01IP3_A129BarCod = new int[1] ;
      H01IP3_A132BarCodReo = new byte[1] ;
      H01IP3_A130BarCodPar = new String[] {""} ;
      H01IP3_A125BarAncAca1 = new short[1] ;
      H01IP4_A396EmprCod = new String[] {""} ;
      H01IP4_A129BarCod = new int[1] ;
      H01IP4_A132BarCodReo = new byte[1] ;
      H01IP4_A130BarCodPar = new String[] {""} ;
      H01IP4_A758ProCod = new String[] {""} ;
      H01IP4_A194BarOrdLin = new short[1] ;
      H01IP5_A396EmprCod = new String[] {""} ;
      H01IP5_A129BarCod = new int[1] ;
      H01IP5_A132BarCodReo = new byte[1] ;
      H01IP5_A130BarCodPar = new String[] {""} ;
      H01IP6_A396EmprCod = new String[] {""} ;
      H01IP6_A129BarCod = new int[1] ;
      H01IP6_A130BarCodPar = new String[] {""} ;
      H01IP6_A132BarCodReo = new byte[1] ;
      H01IP7_A396EmprCod = new String[] {""} ;
      H01IP7_A132BarCodReo = new byte[1] ;
      H01IP7_A130BarCodPar = new String[] {""} ;
      H01IP7_A129BarCod = new int[1] ;
      H01IP8_A396EmprCod = new String[] {""} ;
      H01IP8_A457FasCod = new String[] {""} ;
      H01IP9_A396EmprCod = new String[] {""} ;
      H01IP9_A602MaqCod = new String[] {""} ;
      H01IP10_A396EmprCod = new String[] {""} ;
      H01IP10_A652OpeCod = new int[1] ;
      H01IP11_A396EmprCod = new String[] {""} ;
      H01IP11_A407EmprNom = new String[] {""} ;
      H01IP11_n407EmprNom = new boolean[] {false} ;
      H01IP12_A396EmprCod = new String[] {""} ;
      H01IP12_A1166LecMaqCod = new String[] {""} ;
      H01IP12_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01IP12_n1174LecFec = new boolean[] {false} ;
      H01IP13_A396EmprCod = new String[] {""} ;
      H01IP13_A129BarCod = new int[1] ;
      H01IP13_A132BarCodReo = new byte[1] ;
      H01IP13_A130BarCodPar = new String[] {""} ;
      H01IP13_A125BarAncAca1 = new short[1] ;
      H01IP14_A396EmprCod = new String[] {""} ;
      H01IP14_A129BarCod = new int[1] ;
      H01IP14_A132BarCodReo = new byte[1] ;
      H01IP14_A130BarCodPar = new String[] {""} ;
      H01IP14_A758ProCod = new String[] {""} ;
      H01IP14_A194BarOrdLin = new short[1] ;
      H01IP15_A396EmprCod = new String[] {""} ;
      H01IP15_A129BarCod = new int[1] ;
      H01IP15_A132BarCodReo = new byte[1] ;
      H01IP15_A130BarCodPar = new String[] {""} ;
      H01IP16_A396EmprCod = new String[] {""} ;
      H01IP16_A129BarCod = new int[1] ;
      H01IP16_A130BarCodPar = new String[] {""} ;
      H01IP16_A132BarCodReo = new byte[1] ;
      H01IP17_A396EmprCod = new String[] {""} ;
      H01IP17_A132BarCodReo = new byte[1] ;
      H01IP17_A130BarCodPar = new String[] {""} ;
      H01IP17_A129BarCod = new int[1] ;
      H01IP18_A396EmprCod = new String[] {""} ;
      H01IP18_A457FasCod = new String[] {""} ;
      H01IP19_A396EmprCod = new String[] {""} ;
      H01IP19_A602MaqCod = new String[] {""} ;
      H01IP20_A396EmprCod = new String[] {""} ;
      H01IP20_A652OpeCod = new int[1] ;
      H01IP21_A396EmprCod = new String[] {""} ;
      H01IP21_A407EmprNom = new String[] {""} ;
      H01IP21_n407EmprNom = new boolean[] {false} ;
      H01IP22_A396EmprCod = new String[] {""} ;
      H01IP22_A652OpeCod = new int[1] ;
      H01IP22_A653OpeNom = new String[] {""} ;
      H01IP22_n653OpeNom = new boolean[] {false} ;
      H01IP23_A396EmprCod = new String[] {""} ;
      H01IP23_A457FasCod = new String[] {""} ;
      H01IP23_A460FasDsc = new String[] {""} ;
      H01IP24_A396EmprCod = new String[] {""} ;
      H01IP24_A602MaqCod = new String[] {""} ;
      H01IP24_A606MaqDsc = new String[] {""} ;
      H01IP24_n606MaqDsc = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01IP25_A396EmprCod = new String[] {""} ;
      H01IP25_A407EmprNom = new String[] {""} ;
      H01IP25_n407EmprNom = new boolean[] {false} ;
      H01IP26_A396EmprCod = new String[] {""} ;
      H01IP26_A652OpeCod = new int[1] ;
      H01IP27_A396EmprCod = new String[] {""} ;
      H01IP27_A602MaqCod = new String[] {""} ;
      H01IP28_A396EmprCod = new String[] {""} ;
      H01IP28_A457FasCod = new String[] {""} ;
      H01IP29_A396EmprCod = new String[] {""} ;
      H01IP29_A132BarCodReo = new byte[1] ;
      H01IP29_A130BarCodPar = new String[] {""} ;
      H01IP29_A129BarCod = new int[1] ;
      H01IP30_A396EmprCod = new String[] {""} ;
      H01IP30_A129BarCod = new int[1] ;
      H01IP30_A130BarCodPar = new String[] {""} ;
      H01IP30_A132BarCodReo = new byte[1] ;
      H01IP31_A396EmprCod = new String[] {""} ;
      H01IP31_A129BarCod = new int[1] ;
      H01IP31_A132BarCodReo = new byte[1] ;
      H01IP31_A130BarCodPar = new String[] {""} ;
      H01IP32_A396EmprCod = new String[] {""} ;
      H01IP32_A129BarCod = new int[1] ;
      H01IP32_A132BarCodReo = new byte[1] ;
      H01IP32_A130BarCodPar = new String[] {""} ;
      H01IP32_A758ProCod = new String[] {""} ;
      H01IP32_A194BarOrdLin = new short[1] ;
      H01IP33_A396EmprCod = new String[] {""} ;
      H01IP33_A129BarCod = new int[1] ;
      H01IP33_A132BarCodReo = new byte[1] ;
      H01IP33_A130BarCodPar = new String[] {""} ;
      H01IP33_A125BarAncAca1 = new short[1] ;
      H01IP34_A396EmprCod = new String[] {""} ;
      H01IP34_A1166LecMaqCod = new String[] {""} ;
      H01IP34_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01IP34_n1174LecFec = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwhdrpzi_param__default(),
         new Object[] {
             new Object[] {
            H01IP2_A396EmprCod, H01IP2_A1166LecMaqCod, H01IP2_A1174LecFec, H01IP2_n1174LecFec
            }
            , new Object[] {
            H01IP3_A396EmprCod, H01IP3_A129BarCod, H01IP3_A132BarCodReo, H01IP3_A130BarCodPar, H01IP3_A125BarAncAca1
            }
            , new Object[] {
            H01IP4_A396EmprCod, H01IP4_A129BarCod, H01IP4_A132BarCodReo, H01IP4_A130BarCodPar, H01IP4_A758ProCod, H01IP4_A194BarOrdLin
            }
            , new Object[] {
            H01IP5_A396EmprCod, H01IP5_A129BarCod, H01IP5_A132BarCodReo, H01IP5_A130BarCodPar
            }
            , new Object[] {
            H01IP6_A396EmprCod, H01IP6_A129BarCod, H01IP6_A130BarCodPar, H01IP6_A132BarCodReo
            }
            , new Object[] {
            H01IP7_A396EmprCod, H01IP7_A132BarCodReo, H01IP7_A130BarCodPar, H01IP7_A129BarCod
            }
            , new Object[] {
            H01IP8_A396EmprCod, H01IP8_A457FasCod
            }
            , new Object[] {
            H01IP9_A396EmprCod, H01IP9_A602MaqCod
            }
            , new Object[] {
            H01IP10_A396EmprCod, H01IP10_A652OpeCod
            }
            , new Object[] {
            H01IP11_A396EmprCod, H01IP11_A407EmprNom, H01IP11_n407EmprNom
            }
            , new Object[] {
            H01IP12_A396EmprCod, H01IP12_A1166LecMaqCod, H01IP12_A1174LecFec, H01IP12_n1174LecFec
            }
            , new Object[] {
            H01IP13_A396EmprCod, H01IP13_A129BarCod, H01IP13_A132BarCodReo, H01IP13_A130BarCodPar, H01IP13_A125BarAncAca1
            }
            , new Object[] {
            H01IP14_A396EmprCod, H01IP14_A129BarCod, H01IP14_A132BarCodReo, H01IP14_A130BarCodPar, H01IP14_A758ProCod, H01IP14_A194BarOrdLin
            }
            , new Object[] {
            H01IP15_A396EmprCod, H01IP15_A129BarCod, H01IP15_A132BarCodReo, H01IP15_A130BarCodPar
            }
            , new Object[] {
            H01IP16_A396EmprCod, H01IP16_A129BarCod, H01IP16_A130BarCodPar, H01IP16_A132BarCodReo
            }
            , new Object[] {
            H01IP17_A396EmprCod, H01IP17_A132BarCodReo, H01IP17_A130BarCodPar, H01IP17_A129BarCod
            }
            , new Object[] {
            H01IP18_A396EmprCod, H01IP18_A457FasCod
            }
            , new Object[] {
            H01IP19_A396EmprCod, H01IP19_A602MaqCod
            }
            , new Object[] {
            H01IP20_A396EmprCod, H01IP20_A652OpeCod
            }
            , new Object[] {
            H01IP21_A396EmprCod, H01IP21_A407EmprNom, H01IP21_n407EmprNom
            }
            , new Object[] {
            H01IP22_A396EmprCod, H01IP22_A652OpeCod, H01IP22_A653OpeNom, H01IP22_n653OpeNom
            }
            , new Object[] {
            H01IP23_A396EmprCod, H01IP23_A457FasCod, H01IP23_A460FasDsc
            }
            , new Object[] {
            H01IP24_A396EmprCod, H01IP24_A602MaqCod, H01IP24_A606MaqDsc, H01IP24_n606MaqDsc
            }
            , new Object[] {
            H01IP25_A396EmprCod, H01IP25_A407EmprNom, H01IP25_n407EmprNom
            }
            , new Object[] {
            H01IP26_A396EmprCod, H01IP26_A652OpeCod
            }
            , new Object[] {
            H01IP27_A396EmprCod, H01IP27_A602MaqCod
            }
            , new Object[] {
            H01IP28_A396EmprCod, H01IP28_A457FasCod
            }
            , new Object[] {
            H01IP29_A396EmprCod, H01IP29_A132BarCodReo, H01IP29_A130BarCodPar, H01IP29_A129BarCod
            }
            , new Object[] {
            H01IP30_A396EmprCod, H01IP30_A129BarCod, H01IP30_A130BarCodPar, H01IP30_A132BarCodReo
            }
            , new Object[] {
            H01IP31_A396EmprCod, H01IP31_A129BarCod, H01IP31_A132BarCodReo, H01IP31_A130BarCodPar
            }
            , new Object[] {
            H01IP32_A396EmprCod, H01IP32_A129BarCod, H01IP32_A132BarCodReo, H01IP32_A130BarCodPar, H01IP32_A758ProCod, H01IP32_A194BarOrdLin
            }
            , new Object[] {
            H01IP33_A396EmprCod, H01IP33_A129BarCod, H01IP33_A132BarCodReo, H01IP33_A130BarCodPar, H01IP33_A125BarAncAca1
            }
            , new Object[] {
            H01IP34_A396EmprCod, H01IP34_A1166LecMaqCod, H01IP34_A1174LecFec, H01IP34_n1174LecFec
            }
         }
      );
      AV35Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI_param" ;
      /* GeneXus formulas. */
      AV35Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI_param" ;
      Gx_err = (short)(0) ;
      WebComp_Wc_objetowhdrpzi = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV26BarCodReo ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV28BarOrdLin ;
   private short AV29BarAncAca1 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A652OpeCod ;
   private int AV19OpeCod ;
   private int AV25BarCod ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV30Msg_i ;
   private String AV35Pgmname ;
   private String GXKey ;
   private String AV20OpeNom ;
   private String AV22MaqNom ;
   private String AV24FasDsc ;
   private String A653OpeNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
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
   private String TempTags ;
   private String AV32EmprCod ;
   private String AV21MaqCod ;
   private String AV23FasCod ;
   private String AV27BarCodPar ;
   private String WebComp_Wc_objetowhdrpzi_Component ;
   private String OldWc_objetowhdrpzi ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtncsv_Internalname ;
   private String bttBtncsv_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private java.util.Date AV31LecFec ;
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
   private boolean n653OpeNom ;
   private boolean n606MaqDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wc_objetowhdrpzi ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private HTMLChoice dynavEmprcod ;
   private HTMLChoice dynavOpecod ;
   private HTMLChoice dynavMaqcod ;
   private HTMLChoice dynavFascod ;
   private HTMLChoice dynavBarcod ;
   private HTMLChoice dynavBarcodreo ;
   private HTMLChoice dynavBarcodpar ;
   private HTMLChoice dynavBarordlin ;
   private HTMLChoice dynavBarancaca1 ;
   private HTMLChoice dynavLecfec ;
   private IDataStoreProvider pr_default ;
   private String[] H01IP2_A396EmprCod ;
   private String[] H01IP2_A1166LecMaqCod ;
   private java.util.Date[] H01IP2_A1174LecFec ;
   private boolean[] H01IP2_n1174LecFec ;
   private String[] H01IP3_A396EmprCod ;
   private int[] H01IP3_A129BarCod ;
   private byte[] H01IP3_A132BarCodReo ;
   private String[] H01IP3_A130BarCodPar ;
   private short[] H01IP3_A125BarAncAca1 ;
   private String[] H01IP4_A396EmprCod ;
   private int[] H01IP4_A129BarCod ;
   private byte[] H01IP4_A132BarCodReo ;
   private String[] H01IP4_A130BarCodPar ;
   private String[] H01IP4_A758ProCod ;
   private short[] H01IP4_A194BarOrdLin ;
   private String[] H01IP5_A396EmprCod ;
   private int[] H01IP5_A129BarCod ;
   private byte[] H01IP5_A132BarCodReo ;
   private String[] H01IP5_A130BarCodPar ;
   private String[] H01IP6_A396EmprCod ;
   private int[] H01IP6_A129BarCod ;
   private String[] H01IP6_A130BarCodPar ;
   private byte[] H01IP6_A132BarCodReo ;
   private String[] H01IP7_A396EmprCod ;
   private byte[] H01IP7_A132BarCodReo ;
   private String[] H01IP7_A130BarCodPar ;
   private int[] H01IP7_A129BarCod ;
   private String[] H01IP8_A396EmprCod ;
   private String[] H01IP8_A457FasCod ;
   private String[] H01IP9_A396EmprCod ;
   private String[] H01IP9_A602MaqCod ;
   private String[] H01IP10_A396EmprCod ;
   private int[] H01IP10_A652OpeCod ;
   private String[] H01IP11_A396EmprCod ;
   private String[] H01IP11_A407EmprNom ;
   private boolean[] H01IP11_n407EmprNom ;
   private String[] H01IP12_A396EmprCod ;
   private String[] H01IP12_A1166LecMaqCod ;
   private java.util.Date[] H01IP12_A1174LecFec ;
   private boolean[] H01IP12_n1174LecFec ;
   private String[] H01IP13_A396EmprCod ;
   private int[] H01IP13_A129BarCod ;
   private byte[] H01IP13_A132BarCodReo ;
   private String[] H01IP13_A130BarCodPar ;
   private short[] H01IP13_A125BarAncAca1 ;
   private String[] H01IP14_A396EmprCod ;
   private int[] H01IP14_A129BarCod ;
   private byte[] H01IP14_A132BarCodReo ;
   private String[] H01IP14_A130BarCodPar ;
   private String[] H01IP14_A758ProCod ;
   private short[] H01IP14_A194BarOrdLin ;
   private String[] H01IP15_A396EmprCod ;
   private int[] H01IP15_A129BarCod ;
   private byte[] H01IP15_A132BarCodReo ;
   private String[] H01IP15_A130BarCodPar ;
   private String[] H01IP16_A396EmprCod ;
   private int[] H01IP16_A129BarCod ;
   private String[] H01IP16_A130BarCodPar ;
   private byte[] H01IP16_A132BarCodReo ;
   private String[] H01IP17_A396EmprCod ;
   private byte[] H01IP17_A132BarCodReo ;
   private String[] H01IP17_A130BarCodPar ;
   private int[] H01IP17_A129BarCod ;
   private String[] H01IP18_A396EmprCod ;
   private String[] H01IP18_A457FasCod ;
   private String[] H01IP19_A396EmprCod ;
   private String[] H01IP19_A602MaqCod ;
   private String[] H01IP20_A396EmprCod ;
   private int[] H01IP20_A652OpeCod ;
   private String[] H01IP21_A396EmprCod ;
   private String[] H01IP21_A407EmprNom ;
   private boolean[] H01IP21_n407EmprNom ;
   private String[] H01IP22_A396EmprCod ;
   private int[] H01IP22_A652OpeCod ;
   private String[] H01IP22_A653OpeNom ;
   private boolean[] H01IP22_n653OpeNom ;
   private String[] H01IP23_A396EmprCod ;
   private String[] H01IP23_A457FasCod ;
   private String[] H01IP23_A460FasDsc ;
   private String[] H01IP24_A396EmprCod ;
   private String[] H01IP24_A602MaqCod ;
   private String[] H01IP24_A606MaqDsc ;
   private boolean[] H01IP24_n606MaqDsc ;
   private String[] H01IP25_A396EmprCod ;
   private String[] H01IP25_A407EmprNom ;
   private boolean[] H01IP25_n407EmprNom ;
   private String[] H01IP26_A396EmprCod ;
   private int[] H01IP26_A652OpeCod ;
   private String[] H01IP27_A396EmprCod ;
   private String[] H01IP27_A602MaqCod ;
   private String[] H01IP28_A396EmprCod ;
   private String[] H01IP28_A457FasCod ;
   private String[] H01IP29_A396EmprCod ;
   private byte[] H01IP29_A132BarCodReo ;
   private String[] H01IP29_A130BarCodPar ;
   private int[] H01IP29_A129BarCod ;
   private String[] H01IP30_A396EmprCod ;
   private int[] H01IP30_A129BarCod ;
   private String[] H01IP30_A130BarCodPar ;
   private byte[] H01IP30_A132BarCodReo ;
   private String[] H01IP31_A396EmprCod ;
   private int[] H01IP31_A129BarCod ;
   private byte[] H01IP31_A132BarCodReo ;
   private String[] H01IP31_A130BarCodPar ;
   private String[] H01IP32_A396EmprCod ;
   private int[] H01IP32_A129BarCod ;
   private byte[] H01IP32_A132BarCodReo ;
   private String[] H01IP32_A130BarCodPar ;
   private String[] H01IP32_A758ProCod ;
   private short[] H01IP32_A194BarOrdLin ;
   private String[] H01IP33_A396EmprCod ;
   private int[] H01IP33_A129BarCod ;
   private byte[] H01IP33_A132BarCodReo ;
   private String[] H01IP33_A130BarCodPar ;
   private short[] H01IP33_A125BarAncAca1 ;
   private String[] H01IP34_A396EmprCod ;
   private String[] H01IP34_A1166LecMaqCod ;
   private java.util.Date[] H01IP34_A1174LecFec ;
   private boolean[] H01IP34_n1174LecFec ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwhdrpzi_param__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01IP2", "SELECT EmprCod, LecMaqCod, LecFec FROM TXPLECTOR ORDER BY LecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAncAca1 FROM TXPBARCAD ORDER BY BarAncAca1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS ORDER BY BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP6", "SELECT EmprCod, BarCod, BarCodPar, BarCodReo FROM TXPBARCAD ORDER BY BarCodReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP7", "SELECT EmprCod, BarCodReo, BarCodPar, BarCod FROM TXPBARCAD ORDER BY BarCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP8", "SELECT EmprCod, FasCod FROM TXPFASPRO ORDER BY FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP9", "SELECT EmprCod, MaqCod FROM TXPMAQUIN ORDER BY MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP10", "SELECT EmprCod, OpeCod FROM TXPOPERAR ORDER BY OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP11", "SELECT EmprCod, EmprNom FROM TXPEMPRES ORDER BY EmprNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP12", "SELECT EmprCod, LecMaqCod, LecFec FROM TXPLECTOR ORDER BY LecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP13", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAncAca1 FROM TXPBARCAD ORDER BY BarAncAca1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS ORDER BY BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP15", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP16", "SELECT EmprCod, BarCod, BarCodPar, BarCodReo FROM TXPBARCAD ORDER BY BarCodReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP17", "SELECT EmprCod, BarCodReo, BarCodPar, BarCod FROM TXPBARCAD ORDER BY BarCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP18", "SELECT EmprCod, FasCod FROM TXPFASPRO ORDER BY FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP19", "SELECT EmprCod, MaqCod FROM TXPMAQUIN ORDER BY MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP20", "SELECT EmprCod, OpeCod FROM TXPOPERAR ORDER BY OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP21", "SELECT EmprCod, EmprNom FROM TXPEMPRES ORDER BY EmprNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP22", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP23", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP24", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP25", "SELECT EmprCod, EmprNom FROM TXPEMPRES ORDER BY EmprNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP26", "SELECT EmprCod, OpeCod FROM TXPOPERAR ORDER BY OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP27", "SELECT EmprCod, MaqCod FROM TXPMAQUIN ORDER BY MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP28", "SELECT EmprCod, FasCod FROM TXPFASPRO ORDER BY FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP29", "SELECT EmprCod, BarCodReo, BarCodPar, BarCod FROM TXPBARCAD ORDER BY BarCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP30", "SELECT EmprCod, BarCod, BarCodPar, BarCodReo FROM TXPBARCAD ORDER BY BarCodReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP31", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP32", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS ORDER BY BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP33", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAncAca1 FROM TXPBARCAD ORDER BY BarAncAca1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IP34", "SELECT EmprCod, LecMaqCod, LecFec FROM TXPLECTOR ORDER BY LecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 6);
               return;
      }
   }

}

