package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informestrabajosexternos_impl extends GXDataArea
{
   public informestrabajosexternos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informestrabajosexternos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informestrabajosexternos_impl.class ));
   }

   public informestrabajosexternos_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavOpcion = new HTMLChoice();
      cmbavTrab = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMANCOD") == 0 )
         {
            A13847ManNomID = httpContext.GetPar( "ManNomID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmancod18B0( A13847ManNomID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMANCOD_TO") == 0 )
         {
            A13847ManNomID = httpContext.GetPar( "ManNomID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmancod_to18B0( A13847ManNomID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFASCOD") == 0 )
         {
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfascod18B0( A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFASCOD_TO") == 0 )
         {
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfascod_to18B0( A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMANCOD") == 0 )
         {
            A13847ManNomID = httpContext.GetPar( "ManNomID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmancod18B0( A13847ManNomID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMANCOD") == 0 )
         {
            hV5ManCod = httpContext.GetPar( "hV5ManCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmancod18B2( hV5ManCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMANCOD_TO") == 0 )
         {
            A13847ManNomID = httpContext.GetPar( "ManNomID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmancod_to18B0( A13847ManNomID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMANCOD_TO") == 0 )
         {
            hV6ManCod_to = httpContext.GetPar( "hV6ManCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmancod_to18B2( hV6ManCod_to) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFASCOD") == 0 )
         {
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfascod18B0( A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vFASCOD") == 0 )
         {
            hV9FasCod = httpContext.GetPar( "hV9FasCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvfascod18B2( hV9FasCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFASCOD_TO") == 0 )
         {
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfascod_to18B0( A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vFASCOD_TO") == 0 )
         {
            hV10FasCod_to = httpContext.GetPar( "hV10FasCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvfascod_to18B2( hV10FasCod_to) ;
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
      pa18B2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start18B2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informestrabajosexternos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV14Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANCOD_TO2", GXutil.ltrim( localUtil.ntoc( AV20ManCod_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA_TO2", localUtil.dtoc( AV22Fecha_to2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD_TO2", GXutil.rtrim( AV21FasCod_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMANCOD", GXutil.ltrim( localUtil.ntoc( AV5ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMANCOD_TO", GXutil.ltrim( localUtil.ntoc( AV6ManCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvFASCOD", GXutil.rtrim( AV9FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvFASCOD_TO", GXutil.rtrim( AV10FasCod_to));
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
         we18B2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt18B2( ) ;
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
      return formatLink("app.informestrabajosexternos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "InformesTrabajosExternos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informes Trabajos Externos", "") ;
   }

   public void wb18B0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMancod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMancod_Internalname, httpContext.getMessage( "Manufacturador Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancod_Internalname, hV5ManCod, GXutil.rtrim( localUtil.format( hV5ManCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMancod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMancod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMancod_to_Internalname, httpContext.getMessage( "Manufacturador Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancod_to_Internalname, hV6ManCod_to, GXutil.rtrim( localUtil.format( hV6ManCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMancod_to_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFecha_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFecha_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_Internalname, localUtil.format(AV7Fecha, "99/99/99"), localUtil.format( AV7Fecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_InformesTrabajosExternos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFecha_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFecha_to_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_to_Internalname, localUtil.format(AV8Fecha_to, "99/99/99"), localUtil.format( AV8Fecha_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_InformesTrabajosExternos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_Internalname, httpContext.getMessage( "Fase Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, hV9FasCod, GXutil.rtrim( localUtil.format( hV9FasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_to_Internalname, httpContext.getMessage( "Fase Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_to_Internalname, hV10FasCod_to, GXutil.rtrim( localUtil.format( hV10FasCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_to_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOpcion.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOpcion, cmbavOpcion.getInternalname(), GXutil.trim( GXutil.str( AV11Opcion, 1, 0)), 1, cmbavOpcion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOpcion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "", true, (byte)(0), "HLP_InformesTrabajosExternos.htm");
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV11Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTrab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTrab.getInternalname(), httpContext.getMessage( "Estado Trabajos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTrab, cmbavTrab.getInternalname(), GXutil.rtrim( AV12Trab), 1, cmbavTrab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTrab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, (byte)(0), "HLP_InformesTrabajosExternos.htm");
         cmbavTrab.setValue( GXutil.rtrim( AV12Trab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTrab.getInternalname(), "Values", cmbavTrab.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", httpContext.getMessage( "Pdf", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "Pdf", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformesTrabajosExternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformesTrabajosExternos.htm");
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
         ucBarradeprogresos.render(context, "gxprogressindicator", Barradeprogresos_Internalname, "BARRADEPROGRESOSContainer");
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

   public void start18B2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informes Trabajos Externos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup18B0( ) ;
   }

   public void ws18B2( )
   {
      start18B2( ) ;
      evt18B2( ) ;
   }

   public void evt18B2( )
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
                           e1118B2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExcel' */
                           e1218B2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPdf' */
                           e1318B2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1418B2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1518B2 ();
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

   public void we18B2( )
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

   public void pa18B2( )
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
            GX_FocusControl = edtavMancod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmancod18B0( String A13847ManNomID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmancod_data18B0( A13847ManNomID) ;
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

   protected void gxsgvvmancod_data18B0( String A13847ManNomID )
   {
      l13847ManNomID = GXutil.concat( GXutil.rtrim( A13847ManNomID), "%", "") ;
      /* Using cursor H018B2 */
      pr_default.execute(0, new Object[] {l13847ManNomID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H018B2_A13847ManNomID[0]) , GXutil.padr( "%" + GXutil.upper( A13847ManNomID) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H018B2_A13847ManNomID[0]);
            gxdynajaxctrldescr.add(H018B2_A13847ManNomID[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmancod_to18B0( String A13847ManNomID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmancod_to_data18B0( A13847ManNomID) ;
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

   protected void gxsgvvmancod_to_data18B0( String A13847ManNomID )
   {
      l13847ManNomID = GXutil.concat( GXutil.rtrim( A13847ManNomID), "%", "") ;
      /* Using cursor H018B3 */
      pr_default.execute(1, new Object[] {l13847ManNomID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H018B3_A13847ManNomID[0]) , GXutil.padr( "%" + GXutil.upper( A13847ManNomID) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H018B3_A13847ManNomID[0]);
            gxdynajaxctrldescr.add(H018B3_A13847ManNomID[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvfascod18B0( String A13781FasCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvfascod_data18B0( A13781FasCDsc) ;
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

   protected void gxsgvvfascod_data18B0( String A13781FasCDsc )
   {
      l13781FasCDsc = GXutil.concat( GXutil.rtrim( A13781FasCDsc), "%", "") ;
      /* Using cursor H018B4 */
      pr_default.execute(2, new Object[] {l13781FasCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H018B4_A13781FasCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13781FasCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H018B4_A13781FasCDsc[0]);
            gxdynajaxctrldescr.add(H018B4_A13781FasCDsc[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvfascod_to18B0( String A13781FasCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvfascod_to_data18B0( A13781FasCDsc) ;
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

   protected void gxsgvvfascod_to_data18B0( String A13781FasCDsc )
   {
      l13781FasCDsc = GXutil.concat( GXutil.rtrim( A13781FasCDsc), "%", "") ;
      /* Using cursor H018B5 */
      pr_default.execute(3, new Object[] {l13781FasCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H018B5_A13781FasCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13781FasCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H018B5_A13781FasCDsc[0]);
            gxdynajaxctrldescr.add(H018B5_A13781FasCDsc[0]);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxhcvvmancod18B2( String A13847ManNomID )
   {
      /* Using cursor H018B6 */
      pr_default.execute(4, new Object[] {A13847ManNomID});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( GXutil.strcmp(H018B6_A13847ManNomID[0], A13847ManNomID) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13847ManNomID = H018B6_A13847ManNomID[0] ;
            A396EmprCod = H018B6_A396EmprCod[0] ;
            A2248ManCod = H018B6_A2248ManCod[0] ;
         }
         pr_default.readNext(4);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void gxhcvvmancod_to18B2( String A13847ManNomID )
   {
      /* Using cursor H018B7 */
      pr_default.execute(5, new Object[] {A13847ManNomID});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.strcmp(H018B7_A13847ManNomID[0], A13847ManNomID) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13847ManNomID = H018B7_A13847ManNomID[0] ;
            A396EmprCod = H018B7_A396EmprCod[0] ;
            A2248ManCod = H018B7_A2248ManCod[0] ;
         }
         pr_default.readNext(5);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxhcvvfascod18B2( String A13781FasCDsc )
   {
      /* Using cursor H018B8 */
      pr_default.execute(6, new Object[] {A13781FasCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( GXutil.strcmp(H018B8_A13781FasCDsc[0], A13781FasCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13781FasCDsc = H018B8_A13781FasCDsc[0] ;
            A396EmprCod = H018B8_A396EmprCod[0] ;
            A457FasCod = H018B8_A457FasCod[0] ;
         }
         pr_default.readNext(6);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxhcvvfascod_to18B2( String A13781FasCDsc )
   {
      /* Using cursor H018B9 */
      pr_default.execute(7, new Object[] {A13781FasCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         if ( GXutil.strcmp(H018B9_A13781FasCDsc[0], A13781FasCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13781FasCDsc = H018B9_A13781FasCDsc[0] ;
            A396EmprCod = H018B9_A396EmprCod[0] ;
            A457FasCod = H018B9_A457FasCod[0] ;
         }
         pr_default.readNext(7);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
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
         AV11Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV11Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Opcion", GXutil.str( AV11Opcion, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV11Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
      }
      if ( cmbavTrab.getItemCount() > 0 )
      {
         AV12Trab = cmbavTrab.getValidValue(AV12Trab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Trab", AV12Trab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTrab.setValue( GXutil.rtrim( AV12Trab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTrab.getInternalname(), "Values", cmbavTrab.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf18B2( ) ;
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

   public void rf18B2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1518B2 ();
         wb18B0( ) ;
      }
   }

   public void send_integrity_lvl_hashes18B2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup18B0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1118B2 ();
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
         hV5ManCod = httpContext.cgiGet( edtavMancod_Internalname) ;
         if ( (GXutil.strcmp("", hV5ManCod)==0) )
         {
            AV5ManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ManCod), 4, 0));
         }
         else
         {
            A13847ManNomID = hV5ManCod ;
            /* Using cursor H018B10 */
            pr_default.execute(8, new Object[] {A13847ManNomID});
            AV5ManCod = H018B10_A2248ManCod[0] ;
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "vMANCOD");
                  GX_FocusControl = edtavMancod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV5ManCod", hV5ManCod);
         hV6ManCod_to = httpContext.cgiGet( edtavMancod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV6ManCod_to)==0) )
         {
            AV6ManCod_to = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6ManCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ManCod_to), 4, 0));
         }
         else
         {
            A13847ManNomID = hV6ManCod_to ;
            /* Using cursor H018B11 */
            pr_default.execute(9, new Object[] {A13847ManNomID});
            AV6ManCod_to = H018B11_A2248ManCod[0] ;
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "vMANCOD_TO");
                  GX_FocusControl = edtavMancod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV6ManCod_to", hV6ManCod_to);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA");
            GX_FocusControl = edtavFecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Fecha = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Fecha", localUtil.format(AV7Fecha, "99/99/99"));
         }
         else
         {
            AV7Fecha = localUtil.ctod( httpContext.cgiGet( edtavFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Fecha", localUtil.format(AV7Fecha, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA_TO");
            GX_FocusControl = edtavFecha_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Fecha_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Fecha_to", localUtil.format(AV8Fecha_to, "99/99/99"));
         }
         else
         {
            AV8Fecha_to = localUtil.ctod( httpContext.cgiGet( edtavFecha_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Fecha_to", localUtil.format(AV8Fecha_to, "99/99/99"));
         }
         hV9FasCod = httpContext.cgiGet( edtavFascod_Internalname) ;
         if ( (GXutil.strcmp("", hV9FasCod)==0) )
         {
            AV9FasCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9FasCod", AV9FasCod);
         }
         else
         {
            A13781FasCDsc = hV9FasCod ;
            /* Using cursor H018B12 */
            pr_default.execute(10, new Object[] {A13781FasCDsc});
            AV9FasCod = H018B12_A457FasCod[0] ;
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               pr_default.readNext(10);
               if ( ! ( (pr_default.getStatus(10) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "vFASCOD");
                  GX_FocusControl = edtavFascod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(10);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV9FasCod", hV9FasCod);
         hV10FasCod_to = httpContext.cgiGet( edtavFascod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV10FasCod_to)==0) )
         {
            AV10FasCod_to = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10FasCod_to", AV10FasCod_to);
         }
         else
         {
            A13781FasCDsc = hV10FasCod_to ;
            /* Using cursor H018B13 */
            pr_default.execute(11, new Object[] {A13781FasCDsc});
            AV10FasCod_to = H018B13_A457FasCod[0] ;
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               pr_default.readNext(11);
               if ( ! ( (pr_default.getStatus(11) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "vFASCOD_TO");
                  GX_FocusControl = edtavFascod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(11);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV10FasCod_to", hV10FasCod_to);
         cmbavOpcion.setValue( httpContext.cgiGet( cmbavOpcion.getInternalname()) );
         AV11Opcion = (byte)(GXutil.lval( httpContext.cgiGet( cmbavOpcion.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Opcion", GXutil.str( AV11Opcion, 1, 0));
         cmbavTrab.setValue( httpContext.cgiGet( cmbavTrab.getInternalname()) );
         AV12Trab = httpContext.cgiGet( cmbavTrab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Trab", AV12Trab);
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
      e1118B2 ();
      if (returnInSub) return;
   }

   public void e1118B2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informestrabajosexternos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char2, GXv_char3, GXv_char4) ;
      informestrabajosexternos_impl.this.AV14Emprcod = GXv_char2[0] ;
      informestrabajosexternos_impl.this.AV18EmprNom = GXv_char3[0] ;
      informestrabajosexternos_impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Emprcod", AV14Emprcod);
      GXt_char1 = AV17Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      informestrabajosexternos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17Station = GXt_char1 ;
      GXv_char4[0] = AV14Emprcod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char2[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char4, GXv_char3, GXv_char2) ;
      informestrabajosexternos_impl.this.AV14Emprcod = GXv_char4[0] ;
      informestrabajosexternos_impl.this.AV18EmprNom = GXv_char3[0] ;
      informestrabajosexternos_impl.this.AV19UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Emprcod", AV14Emprcod);
   }

   public void e1218B2( )
   {
      /* 'DoExcel' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARDATOS' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INICIOBARRADEPROGRESOS' */
      S122 ();
      if (returnInSub) return;
      if ( AV11Opcion == 2 )
      {
         GXv_char4[0] = AV14Emprcod ;
         GXv_int5[0] = AV5ManCod ;
         GXv_int6[0] = AV20ManCod_to2 ;
         GXv_date7[0] = AV7Fecha ;
         GXv_date8[0] = AV22Fecha_to2 ;
         GXv_char3[0] = AV9FasCod ;
         GXv_char2[0] = AV21FasCod_to2 ;
         GXv_char9[0] = AV12Trab ;
         GXv_char10[0] = AV16ExcelFilename ;
         GXv_char11[0] = AV15ErrorMessage ;
         new app.phtmlex2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_date7, GXv_date8, GXv_char3, GXv_char2, GXv_char9, GXv_char10, GXv_char11) ;
         informestrabajosexternos_impl.this.AV14Emprcod = GXv_char4[0] ;
         informestrabajosexternos_impl.this.AV5ManCod = GXv_int5[0] ;
         informestrabajosexternos_impl.this.AV20ManCod_to2 = GXv_int6[0] ;
         informestrabajosexternos_impl.this.AV7Fecha = GXv_date7[0] ;
         informestrabajosexternos_impl.this.AV22Fecha_to2 = GXv_date8[0] ;
         informestrabajosexternos_impl.this.AV9FasCod = GXv_char3[0] ;
         informestrabajosexternos_impl.this.AV21FasCod_to2 = GXv_char2[0] ;
         informestrabajosexternos_impl.this.AV12Trab = GXv_char9[0] ;
         informestrabajosexternos_impl.this.AV16ExcelFilename = GXv_char10[0] ;
         informestrabajosexternos_impl.this.AV15ErrorMessage = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Emprcod", AV14Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20ManCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ManCod_to2), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7Fecha", localUtil.format(AV7Fecha, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Fecha_to2", localUtil.format(AV22Fecha_to2, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV9FasCod", AV9FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV21FasCod_to2", AV21FasCod_to2);
         httpContext.ajax_rsp_assign_attri("", false, "AV12Trab", AV12Trab);
      }
      else
      {
         GXv_char11[0] = AV14Emprcod ;
         GXv_int6[0] = AV5ManCod ;
         GXv_int5[0] = AV20ManCod_to2 ;
         GXv_date8[0] = AV7Fecha ;
         GXv_date7[0] = AV22Fecha_to2 ;
         GXv_char10[0] = AV9FasCod ;
         GXv_char9[0] = AV21FasCod_to2 ;
         GXv_char4[0] = AV12Trab ;
         GXv_char3[0] = AV16ExcelFilename ;
         GXv_char2[0] = AV15ErrorMessage ;
         new app.phtmlext1(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_int5, GXv_date8, GXv_date7, GXv_char10, GXv_char9, GXv_char4, GXv_char3, GXv_char2) ;
         informestrabajosexternos_impl.this.AV14Emprcod = GXv_char11[0] ;
         informestrabajosexternos_impl.this.AV5ManCod = GXv_int6[0] ;
         informestrabajosexternos_impl.this.AV20ManCod_to2 = GXv_int5[0] ;
         informestrabajosexternos_impl.this.AV7Fecha = GXv_date8[0] ;
         informestrabajosexternos_impl.this.AV22Fecha_to2 = GXv_date7[0] ;
         informestrabajosexternos_impl.this.AV9FasCod = GXv_char10[0] ;
         informestrabajosexternos_impl.this.AV21FasCod_to2 = GXv_char9[0] ;
         informestrabajosexternos_impl.this.AV12Trab = GXv_char4[0] ;
         informestrabajosexternos_impl.this.AV16ExcelFilename = GXv_char3[0] ;
         informestrabajosexternos_impl.this.AV15ErrorMessage = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Emprcod", AV14Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20ManCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ManCod_to2), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7Fecha", localUtil.format(AV7Fecha, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV22Fecha_to2", localUtil.format(AV22Fecha_to2, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV9FasCod", AV9FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV21FasCod_to2", AV21FasCod_to2);
         httpContext.ajax_rsp_assign_attri("", false, "AV12Trab", AV12Trab);
      }
      /* Execute user subroutine: 'FINBARRADEPROGRESOS' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
      /*  Sending Event outputs  */
      cmbavTrab.setValue( GXutil.rtrim( AV12Trab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTrab.getInternalname(), "Values", cmbavTrab.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ProgressIndicator", AV23ProgressIndicator);
   }

   public void e1318B2( )
   {
      /* 'DoPdf' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARDATOS' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INICIOBARRADEPROGRESOS' */
      S122 ();
      if (returnInSub) return;
      if ( AV11Opcion == 2 )
      {
         httpContext.popup(formatLink("app.trabajosexternos.pwkrp00", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5ManCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20ManCod_to2,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV7Fecha)),GXutil.URLEncode(GXutil.formatDateParm(AV22Fecha_to2)),GXutil.URLEncode(GXutil.rtrim(AV9FasCod)),GXutil.URLEncode(GXutil.rtrim(AV21FasCod_to2)),GXutil.URLEncode(GXutil.rtrim(AV12Trab))}, new String[] {"EmprCod","Pman","Uman2","PAlbFch","UFecha2","POpe","UOpe2","TipPapel","Fuente","Trab","ImpCod"}) , new Object[] {"AV14Emprcod","AV5ManCod","AV20ManCod_to2","AV7Fecha","AV22Fecha_to2","AV9FasCod","AV21FasCod_to2","AV12Trab"});
      }
      else
      {
         httpContext.popup(formatLink("app.trabajosexternos.rexp100", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5ManCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20ManCod_to2,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV7Fecha)),GXutil.URLEncode(GXutil.formatDateParm(AV22Fecha_to2)),GXutil.URLEncode(GXutil.rtrim(AV9FasCod)),GXutil.URLEncode(GXutil.rtrim(AV21FasCod_to2)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV12Trab)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0)),GXutil.URLEncode(GXutil.ltrimstr(999999,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","Pman","Uman2","PAlbFch","UFecha2","POpe","UOpe2","TipPapel","Fuente","Trab","Clicod1","Clicod2","ImpCod"}) , new Object[] {"AV14Emprcod","AV5ManCod","AV20ManCod_to2","AV7Fecha","AV22Fecha_to2","AV9FasCod","AV21FasCod_to2","","","AV12Trab","","",""});
      }
      /* Execute user subroutine: 'FINBARRADEPROGRESOS' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavTrab.setValue( GXutil.rtrim( AV12Trab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTrab.getInternalname(), "Values", cmbavTrab.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ProgressIndicator", AV23ProgressIndicator);
   }

   public void e1418B2( )
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
      /* 'CARGARDATOS' Routine */
      returnInSub = false ;
      AV20ManCod_to2 = (short)(((0==AV6ManCod_to) ? 9999 : AV5ManCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ManCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ManCod_to2), 4, 0));
      AV21FasCod_to2 = ((GXutil.strcmp("", AV10FasCod_to)==0) ? httpContext.getMessage( "zzzzzzzz", "") : AV10FasCod_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FasCod_to2", AV21FasCod_to2);
      AV22Fecha_to2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Fecha_to)) ? GXutil.today( ) : AV8Fecha_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Fecha_to2", localUtil.format(AV22Fecha_to2, "99/99/99"));
   }

   public void S122( )
   {
      /* 'INICIOBARRADEPROGRESOS' Routine */
      returnInSub = false ;
      AV23ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV23ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV23ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
      AV23ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
      AV23ProgressIndicator.show();
      AV23ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
   }

   public void S132( )
   {
      /* 'FINBARRADEPROGRESOS' Routine */
      returnInSub = false ;
      AV23ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV23ProgressIndicator.hide();
   }

   protected void nextLoad( )
   {
   }

   protected void e1518B2( )
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
      pa18B2( ) ;
      ws18B2( ) ;
      we18B2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016425468", true, true);
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
      httpContext.AddJavascriptSource("informestrabajosexternos.js", "?202661016425468", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavMancod_Internalname = "vMANCOD" ;
      edtavMancod_to_Internalname = "vMANCOD_TO" ;
      edtavFecha_Internalname = "vFECHA" ;
      edtavFecha_to_Internalname = "vFECHA_TO" ;
      edtavFascod_Internalname = "vFASCOD" ;
      edtavFascod_to_Internalname = "vFASCOD_TO" ;
      cmbavOpcion.setInternalname( "vOPCION" );
      cmbavTrab.setInternalname( "vTRAB" );
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnexcel_Internalname = "BTNEXCEL" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogresos_Internalname = "BARRADEPROGRESOS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
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
      cmbavTrab.setJsonclick( "" );
      cmbavTrab.setEnabled( 1 );
      cmbavOpcion.setJsonclick( "" );
      cmbavOpcion.setEnabled( 1 );
      edtavFascod_to_Jsonclick = "" ;
      edtavFascod_to_Enabled = 1 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 1 ;
      edtavFecha_to_Jsonclick = "" ;
      edtavFecha_to_Enabled = 1 ;
      edtavFecha_Jsonclick = "" ;
      edtavFecha_Enabled = 1 ;
      edtavMancod_to_Jsonclick = "" ;
      edtavMancod_to_Enabled = 1 ;
      edtavMancod_Jsonclick = "" ;
      edtavMancod_Enabled = 1 ;
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
      Form.setCaption( httpContext.getMessage( "Informes Trabajos Externos", "") );
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
      cmbavOpcion.addItem("1", httpContext.getMessage( "Envio", ""), (short)(0));
      cmbavOpcion.addItem("2", httpContext.getMessage( "Recepcion", ""), (short)(0));
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV11Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV11Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Opcion", GXutil.str( AV11Opcion, 1, 0));
      }
      cmbavTrab.setName( "vTRAB" );
      cmbavTrab.setWebtags( "" );
      cmbavTrab.addItem("T", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavTrab.addItem("A", httpContext.getMessage( "Abiertos", ""), (short)(0));
      cmbavTrab.addItem("C", httpContext.getMessage( "Cerrados", ""), (short)(0));
      if ( cmbavTrab.getItemCount() > 0 )
      {
         AV12Trab = cmbavTrab.getValidValue(AV12Trab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Trab", AV12Trab);
      }
      /* End function init_web_controls */
   }

   public void validv_Mancod( )
   {
      if ( (GXutil.strcmp("", hV5ManCod)==0) )
      {
         AV5ManCod = (short)(0) ;
      }
      else
      {
         A13847ManNomID = hV5ManCod ;
         /* Using cursor H018B14 */
         pr_default.execute(12, new Object[] {A13847ManNomID});
         AV5ManCod = H018B14_A2248ManCod[0] ;
         if ( ! ( (pr_default.getStatus(12) == 101) ) )
         {
            pr_default.readNext(12);
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "vMANCOD");
               GX_FocusControl = edtavMancod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(12);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV5ManCod", hV5ManCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV5ManCod", GXutil.ltrim( localUtil.ntoc( AV5ManCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV5ManCod", hV5ManCod);
   }

   public void validv_Mancod_to( )
   {
      if ( (GXutil.strcmp("", hV6ManCod_to)==0) )
      {
         AV6ManCod_to = (short)(0) ;
      }
      else
      {
         A13847ManNomID = hV6ManCod_to ;
         /* Using cursor H018B15 */
         pr_default.execute(13, new Object[] {A13847ManNomID});
         AV6ManCod_to = H018B15_A2248ManCod[0] ;
         if ( ! ( (pr_default.getStatus(13) == 101) ) )
         {
            pr_default.readNext(13);
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "vMANCOD_TO");
               GX_FocusControl = edtavMancod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(13);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV6ManCod_to", hV6ManCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV6ManCod_to", GXutil.ltrim( localUtil.ntoc( AV6ManCod_to, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV6ManCod_to", hV6ManCod_to);
   }

   public void validv_Fascod( )
   {
      if ( (GXutil.strcmp("", hV9FasCod)==0) )
      {
         AV9FasCod = "" ;
      }
      else
      {
         A13781FasCDsc = hV9FasCod ;
         /* Using cursor H018B16 */
         pr_default.execute(14, new Object[] {A13781FasCDsc});
         AV9FasCod = H018B16_A457FasCod[0] ;
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "vFASCOD");
               GX_FocusControl = edtavFascod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV9FasCod", hV9FasCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9FasCod", GXutil.rtrim( AV9FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV9FasCod", hV9FasCod);
   }

   public void validv_Fascod_to( )
   {
      if ( (GXutil.strcmp("", hV10FasCod_to)==0) )
      {
         AV10FasCod_to = "" ;
      }
      else
      {
         A13781FasCDsc = hV10FasCod_to ;
         /* Using cursor H018B17 */
         pr_default.execute(15, new Object[] {A13781FasCDsc});
         AV10FasCod_to = H018B17_A457FasCod[0] ;
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "vFASCOD_TO");
               GX_FocusControl = edtavFascod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV10FasCod_to", hV10FasCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV10FasCod_to", GXutil.rtrim( AV10FasCod_to));
      httpContext.ajax_rsp_assign_attri("", false, "hV10FasCod_to", hV10FasCod_to);
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
      setEventMetadata("'DOEXCEL'","{handler:'e1218B2',iparms:[{av:'cmbavOpcion'},{av:'AV11Opcion',fld:'vOPCION',pic:'9'},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV20ManCod_to2',fld:'vMANCOD_TO2',pic:'ZZZ9'},{av:'AV7Fecha',fld:'vFECHA',pic:''},{av:'AV22Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV9FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV21FasCod_to2',fld:'vFASCOD_TO2',pic:'@!'},{av:'cmbavTrab'},{av:'AV12Trab',fld:'vTRAB',pic:''},{av:'AV6ManCod_to',fld:'vMANCOD_TO',pic:'ZZZ9'},{av:'AV10FasCod_to',fld:'vFASCOD_TO',pic:'@!'},{av:'AV8Fecha_to',fld:'vFECHA_TO',pic:''}]");
      setEventMetadata("'DOEXCEL'",",oparms:[{av:'cmbavTrab'},{av:'AV12Trab',fld:'vTRAB',pic:''},{av:'AV21FasCod_to2',fld:'vFASCOD_TO2',pic:'@!'},{av:'AV9FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV22Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV7Fecha',fld:'vFECHA',pic:''},{av:'AV20ManCod_to2',fld:'vMANCOD_TO2',pic:'ZZZ9'},{av:'AV5ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPDF'","{handler:'e1318B2',iparms:[{av:'cmbavOpcion'},{av:'AV11Opcion',fld:'vOPCION',pic:'9'},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV20ManCod_to2',fld:'vMANCOD_TO2',pic:'ZZZ9'},{av:'AV7Fecha',fld:'vFECHA',pic:''},{av:'AV22Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV9FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV21FasCod_to2',fld:'vFASCOD_TO2',pic:'@!'},{av:'cmbavTrab'},{av:'AV12Trab',fld:'vTRAB',pic:''},{av:'AV6ManCod_to',fld:'vMANCOD_TO',pic:'ZZZ9'},{av:'AV10FasCod_to',fld:'vFASCOD_TO',pic:'@!'},{av:'AV8Fecha_to',fld:'vFECHA_TO',pic:''}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'cmbavTrab'},{av:'AV12Trab',fld:'vTRAB',pic:''},{av:'AV21FasCod_to2',fld:'vFASCOD_TO2',pic:'@!'},{av:'AV9FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV22Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV7Fecha',fld:'vFECHA',pic:''},{av:'AV20ManCod_to2',fld:'vMANCOD_TO2',pic:'ZZZ9'},{av:'AV5ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1418B2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_MANCOD","{handler:'validv_Mancod',iparms:[{av:'hV5ManCod'},{av:'AV5ManCod',fld:'vMANCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_MANCOD",",oparms:[{av:'AV5ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'hV5ManCod'}]}");
      setEventMetadata("VALIDV_MANCOD_TO","{handler:'validv_Mancod_to',iparms:[{av:'hV6ManCod_to'},{av:'AV6ManCod_to',fld:'vMANCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_MANCOD_TO",",oparms:[{av:'AV6ManCod_to',fld:'vMANCOD_TO',pic:'ZZZ9'},{av:'hV6ManCod_to'}]}");
      setEventMetadata("VALIDV_FASCOD","{handler:'validv_Fascod',iparms:[{av:'hV9FasCod'},{av:'AV9FasCod',fld:'vFASCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_FASCOD",",oparms:[{av:'AV9FasCod',fld:'vFASCOD',pic:'@!'},{av:'hV9FasCod'}]}");
      setEventMetadata("VALIDV_FASCOD_TO","{handler:'validv_Fascod_to',iparms:[{av:'hV10FasCod_to'},{av:'AV10FasCod_to',fld:'vFASCOD_TO',pic:'@!'}]");
      setEventMetadata("VALIDV_FASCOD_TO",",oparms:[{av:'AV10FasCod_to',fld:'vFASCOD_TO',pic:'@!'},{av:'hV10FasCod_to'}]}");
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
      A13847ManNomID = "" ;
      A13781FasCDsc = "" ;
      hV5ManCod = "" ;
      hV6ManCod_to = "" ;
      hV9FasCod = "" ;
      hV10FasCod_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV14Emprcod = "" ;
      AV22Fecha_to2 = GXutil.nullDate() ;
      AV21FasCod_to2 = "" ;
      AV9FasCod = "" ;
      AV10FasCod_to = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7Fecha = GXutil.nullDate() ;
      AV8Fecha_to = GXutil.nullDate() ;
      AV12Trab = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogresos = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13847ManNomID = "" ;
      H018B2_A13847ManNomID = new String[] {""} ;
      H018B3_A13847ManNomID = new String[] {""} ;
      l13781FasCDsc = "" ;
      H018B4_A13781FasCDsc = new String[] {""} ;
      H018B5_A13781FasCDsc = new String[] {""} ;
      H018B6_A13847ManNomID = new String[] {""} ;
      H018B6_A396EmprCod = new String[] {""} ;
      H018B6_A2248ManCod = new short[1] ;
      A396EmprCod = "" ;
      H018B7_A13847ManNomID = new String[] {""} ;
      H018B7_A396EmprCod = new String[] {""} ;
      H018B7_A2248ManCod = new short[1] ;
      H018B8_A13781FasCDsc = new String[] {""} ;
      H018B8_A396EmprCod = new String[] {""} ;
      H018B8_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      H018B9_A13781FasCDsc = new String[] {""} ;
      H018B9_A396EmprCod = new String[] {""} ;
      H018B9_A457FasCod = new String[] {""} ;
      H018B10_A13847ManNomID = new String[] {""} ;
      H018B10_A396EmprCod = new String[] {""} ;
      H018B10_A2248ManCod = new short[1] ;
      H018B11_A13847ManNomID = new String[] {""} ;
      H018B11_A396EmprCod = new String[] {""} ;
      H018B11_A2248ManCod = new short[1] ;
      H018B12_A13781FasCDsc = new String[] {""} ;
      H018B12_A396EmprCod = new String[] {""} ;
      H018B12_A457FasCod = new String[] {""} ;
      H018B13_A13781FasCDsc = new String[] {""} ;
      H018B13_A396EmprCod = new String[] {""} ;
      H018B13_A457FasCod = new String[] {""} ;
      AV17Station = "" ;
      AV18EmprNom = "" ;
      AV19UsurCod = "" ;
      GXt_char1 = "" ;
      AV16ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char11 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int5 = new short[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV23ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H018B14_A13847ManNomID = new String[] {""} ;
      H018B14_A396EmprCod = new String[] {""} ;
      H018B14_A2248ManCod = new short[1] ;
      ZhV5ManCod = "" ;
      H018B15_A13847ManNomID = new String[] {""} ;
      H018B15_A396EmprCod = new String[] {""} ;
      H018B15_A2248ManCod = new short[1] ;
      ZhV6ManCod_to = "" ;
      H018B16_A13781FasCDsc = new String[] {""} ;
      H018B16_A396EmprCod = new String[] {""} ;
      H018B16_A457FasCod = new String[] {""} ;
      ZV9FasCod = "" ;
      ZhV9FasCod = "" ;
      H018B17_A13781FasCDsc = new String[] {""} ;
      H018B17_A396EmprCod = new String[] {""} ;
      H018B17_A457FasCod = new String[] {""} ;
      ZV10FasCod_to = "" ;
      ZhV10FasCod_to = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informestrabajosexternos__default(),
         new Object[] {
             new Object[] {
            H018B2_A13847ManNomID
            }
            , new Object[] {
            H018B3_A13847ManNomID
            }
            , new Object[] {
            H018B4_A13781FasCDsc
            }
            , new Object[] {
            H018B5_A13781FasCDsc
            }
            , new Object[] {
            H018B6_A13847ManNomID, H018B6_A396EmprCod, H018B6_A2248ManCod
            }
            , new Object[] {
            H018B7_A13847ManNomID, H018B7_A396EmprCod, H018B7_A2248ManCod
            }
            , new Object[] {
            H018B8_A13781FasCDsc, H018B8_A396EmprCod, H018B8_A457FasCod
            }
            , new Object[] {
            H018B9_A13781FasCDsc, H018B9_A396EmprCod, H018B9_A457FasCod
            }
            , new Object[] {
            H018B10_A13847ManNomID, H018B10_A396EmprCod, H018B10_A2248ManCod
            }
            , new Object[] {
            H018B11_A13847ManNomID, H018B11_A396EmprCod, H018B11_A2248ManCod
            }
            , new Object[] {
            H018B12_A13781FasCDsc, H018B12_A396EmprCod, H018B12_A457FasCod
            }
            , new Object[] {
            H018B13_A13781FasCDsc, H018B13_A396EmprCod, H018B13_A457FasCod
            }
            , new Object[] {
            H018B14_A13847ManNomID, H018B14_A396EmprCod, H018B14_A2248ManCod
            }
            , new Object[] {
            H018B15_A13847ManNomID, H018B15_A396EmprCod, H018B15_A2248ManCod
            }
            , new Object[] {
            H018B16_A13781FasCDsc, H018B16_A396EmprCod, H018B16_A457FasCod
            }
            , new Object[] {
            H018B17_A13781FasCDsc, H018B17_A396EmprCod, H018B17_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV11Opcion ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short AV20ManCod_to2 ;
   private short AV5ManCod ;
   private short AV6ManCod_to ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short A2248ManCod ;
   private short Gx_err ;
   private short GXv_int6[] ;
   private short GXv_int5[] ;
   private short ZV5ManCod ;
   private short ZV6ManCod_to ;
   private int edtavMancod_Enabled ;
   private int edtavMancod_to_Enabled ;
   private int edtavFecha_Enabled ;
   private int edtavFecha_to_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavFascod_to_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV14Emprcod ;
   private String AV21FasCod_to2 ;
   private String AV9FasCod ;
   private String AV10FasCod_to ;
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
   private String edtavMancod_Internalname ;
   private String TempTags ;
   private String edtavMancod_Jsonclick ;
   private String edtavMancod_to_Internalname ;
   private String edtavMancod_to_Jsonclick ;
   private String edtavFecha_Internalname ;
   private String edtavFecha_Jsonclick ;
   private String edtavFecha_to_Internalname ;
   private String edtavFecha_to_Jsonclick ;
   private String edtavFascod_Internalname ;
   private String edtavFascod_Jsonclick ;
   private String edtavFascod_to_Internalname ;
   private String edtavFascod_to_Jsonclick ;
   private String AV12Trab ;
   private String divTable_acciones_Internalname ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Barradeprogresos_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV17Station ;
   private String AV18EmprNom ;
   private String AV19UsurCod ;
   private String GXt_char1 ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV9FasCod ;
   private String ZV10FasCod_to ;
   private java.util.Date AV22Fecha_to2 ;
   private java.util.Date AV7Fecha ;
   private java.util.Date AV8Fecha_to ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date GXv_date7[] ;
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
   private String A13847ManNomID ;
   private String A13781FasCDsc ;
   private String hV5ManCod ;
   private String hV6ManCod_to ;
   private String hV9FasCod ;
   private String hV10FasCod_to ;
   private String l13847ManNomID ;
   private String l13781FasCDsc ;
   private String AV16ExcelFilename ;
   private String AV15ErrorMessage ;
   private String ZhV5ManCod ;
   private String ZhV6ManCod_to ;
   private String ZhV9FasCod ;
   private String ZhV10FasCod_to ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogresos ;
   private HTMLChoice cmbavOpcion ;
   private HTMLChoice cmbavTrab ;
   private IDataStoreProvider pr_default ;
   private String[] H018B2_A13847ManNomID ;
   private String[] H018B3_A13847ManNomID ;
   private String[] H018B4_A13781FasCDsc ;
   private String[] H018B5_A13781FasCDsc ;
   private String[] H018B6_A13847ManNomID ;
   private String[] H018B6_A396EmprCod ;
   private short[] H018B6_A2248ManCod ;
   private String[] H018B7_A13847ManNomID ;
   private String[] H018B7_A396EmprCod ;
   private short[] H018B7_A2248ManCod ;
   private String[] H018B8_A13781FasCDsc ;
   private String[] H018B8_A396EmprCod ;
   private String[] H018B8_A457FasCod ;
   private String[] H018B9_A13781FasCDsc ;
   private String[] H018B9_A396EmprCod ;
   private String[] H018B9_A457FasCod ;
   private String[] H018B10_A13847ManNomID ;
   private String[] H018B10_A396EmprCod ;
   private short[] H018B10_A2248ManCod ;
   private String[] H018B11_A13847ManNomID ;
   private String[] H018B11_A396EmprCod ;
   private short[] H018B11_A2248ManCod ;
   private String[] H018B12_A13781FasCDsc ;
   private String[] H018B12_A396EmprCod ;
   private String[] H018B12_A457FasCod ;
   private String[] H018B13_A13781FasCDsc ;
   private String[] H018B13_A396EmprCod ;
   private String[] H018B13_A457FasCod ;
   private String[] H018B14_A13847ManNomID ;
   private String[] H018B14_A396EmprCod ;
   private short[] H018B14_A2248ManCod ;
   private String[] H018B15_A13847ManNomID ;
   private String[] H018B15_A396EmprCod ;
   private short[] H018B15_A2248ManCod ;
   private String[] H018B16_A13781FasCDsc ;
   private String[] H018B16_A396EmprCod ;
   private String[] H018B16_A457FasCod ;
   private String[] H018B17_A13781FasCDsc ;
   private String[] H018B17_A396EmprCod ;
   private String[] H018B17_A457FasCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV23ProgressIndicator ;
}

final  class informestrabajosexternos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H018B2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID FROM TXPMANUFA WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, '')))) like '%' || UPPER(?) ORDER BY ManNomID) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID FROM TXPMANUFA WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, '')))) like '%' || UPPER(?) ORDER BY ManNomID) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc FROM TXPFASPRO WHERE UPPER(RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc))) like '%' || UPPER(?) ORDER BY FasCDsc) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B5", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc FROM TXPFASPRO WHERE UPPER(RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc))) like '%' || UPPER(?) ORDER BY FasCDsc) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B6", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B8", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B9", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B12", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B13", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B14", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B15", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B16", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018B17", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
      }
   }

}

