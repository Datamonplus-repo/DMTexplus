package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcalenda_impl extends GXDataArea
{
   public wcalenda_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcalenda_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcalenda_impl.class ));
   }

   public wcalenda_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      try
      {
         AV57RecibirMaqCod = (String) args[0];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      cmbavMaqmes = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "RecibirMaqCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "RecibirMaqCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "RecibirMaqCod") ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV57RecibirMaqCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57RecibirMaqCod", AV57RecibirMaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57RecibirMaqCod, ""))));
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
      pa20H2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start20H2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXScheduler/dhtmlxscheduler.js", "", false, true);
      httpContext.AddJavascriptSource("GXScheduler/GXSchedulerRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.wcalenda", new String[] {GXutil.URLEncode(GXutil.rtrim(AV57RecibirMaqCod))}, new String[] {"RecibirMaqCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57RecibirMaqCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV66MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV66MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCURRENTEVENT", AV48currentEvent);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCURRENTEVENT", AV48currentEvent);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vINITIALDATE", localUtil.dtoc( AV49initialDate, 0, "/"));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vCHECKREQUIREDFIELDSRESULT", AV61CheckRequiredFieldsResult);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV23EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECIBIRMAQCOD", GXutil.rtrim( AV57RecibirMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57RecibirMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Autoload", GXutil.rtrim( Uccalendar_Autoload));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Loadeventsobject", GXutil.rtrim( Uccalendar_Loadeventsobject));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_View", GXutil.rtrim( Uccalendar_View));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Defaultsteptime", GXutil.ltrim( localUtil.ntoc( Uccalendar_Defaultsteptime, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Hoursize", GXutil.rtrim( Uccalendar_Hoursize));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Theme", GXutil.rtrim( Uccalendar_Theme));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Displayweektab", GXutil.rtrim( Uccalendar_Displayweektab));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Displaydaytab", GXutil.rtrim( Uccalendar_Displaydaytab));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Montheventsview", GXutil.rtrim( Uccalendar_Montheventsview));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Readonly", GXutil.rtrim( Uccalendar_Readonly));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Detailsoncreate", GXutil.rtrim( Uccalendar_Detailsoncreate));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Detailsondblclick", GXutil.rtrim( Uccalendar_Detailsondblclick));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Openlinknewwindow", GXutil.rtrim( Uccalendar_Openlinknewwindow));
      app.GxWebStd.gx_hidden_field( httpContext, "UCCALENDAR_Allowdragndrop", GXutil.rtrim( Uccalendar_Allowdragndrop));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Ddointernalname", GXutil.rtrim( Combo_maqcod_Ddointernalname));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Ddointernalname", GXutil.rtrim( Combo_maqcod_Ddointernalname));
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
         we20H2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt20H2( ) ;
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
      return formatLink("app.ficherosbasicos.wcalenda", new String[] {GXutil.URLEncode(GXutil.rtrim(AV57RecibirMaqCod))}, new String[] {"RecibirMaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.wcalenda" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Calendario Maquinas", "") ;
   }

   public void wb20H0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableforminputs_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactionlist_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebody_Internalname, 1, 0, "px", divTablebody_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebodyaction_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilter_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV67DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV66MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavMaqmes.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavMaqmes.getInternalname(), httpContext.getMessage( "Mes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMaqmes, cmbavMaqmes.getInternalname(), GXutil.trim( GXutil.str( AV52MaqMes, 2, 0)), 1, cmbavMaqmes.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavMaqmes.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, (byte)(0), "HLP_FicherosBasicos\\wcalenda.htm");
         cmbavMaqmes.setValue( GXutil.trim( GXutil.str( AV52MaqMes, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMaqmes.getInternalname(), "Values", cmbavMaqmes.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqany_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqany_Internalname, httpContext.getMessage( "Año", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqany_Internalname, GXutil.ltrim( localUtil.ntoc( AV53MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqany_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV53MaqAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV53MaqAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqany_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqany_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable23_Internalname, 1, 0, "px", divTable23_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable24_Internalname, 1, 0, "px", divTable24_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "dhx_button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuscar_Internalname, "", httpContext.getMessage( "Buscar", ""), bttBtnbuscar_Jsonclick, 5, httpContext.getMessage( "Buscar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBUSCAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableform_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinputhour_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinputhours_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "dhx_button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtt_entdat_Internalname, "", httpContext.getMessage( "ENTRAR DATOS", ""), bttBtnbtt_entdat_Jsonclick, 5, httpContext.getMessage( "ENTRAR DATOS", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBTT_ENTDAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "dhx_button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtt_cophor_Internalname, "", httpContext.getMessage( "COPIAR HORAS", ""), bttBtnbtt_cophor_Jsonclick, 5, httpContext.getMessage( "COPIAR HORAS", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBTT_COPHOR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         ClassString = "dhx_button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtt_borres_Internalname, "", httpContext.getMessage( "BORRAR MES", ""), bttBtnbtt_borres_Jsonclick, 5, httpContext.getMessage( "BORRAR MES", ""), "", StyleString, ClassString, bttBtnbtt_borres_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBTT_BORRES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecalendar_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUccalendar.setProperty("AutoLoad", Uccalendar_Autoload);
         ucUccalendar.setProperty("LoadEventsObject", Uccalendar_Loadeventsobject);
         ucUccalendar.setProperty("View", Uccalendar_View);
         ucUccalendar.setProperty("DefaultStepTime", Uccalendar_Defaultsteptime);
         ucUccalendar.setProperty("HourSize", Uccalendar_Hoursize);
         ucUccalendar.setProperty("Theme", Uccalendar_Theme);
         ucUccalendar.setProperty("DisplayWeekTab", Uccalendar_Displayweektab);
         ucUccalendar.setProperty("DisplayDayTab", Uccalendar_Displaydaytab);
         ucUccalendar.setProperty("MonthEventsView", Uccalendar_Montheventsview);
         ucUccalendar.setProperty("ReadOnly", Uccalendar_Readonly);
         ucUccalendar.setProperty("DetailsOnCreate", Uccalendar_Detailsoncreate);
         ucUccalendar.setProperty("DetailsOnDblClick", Uccalendar_Detailsondblclick);
         ucUccalendar.setProperty("OpenLinkNewWindow", Uccalendar_Openlinknewwindow);
         ucUccalendar.setProperty("AllowDragNDrop", Uccalendar_Allowdragndrop);
         ucUccalendar.setProperty("CurrentEvent", AV48currentEvent);
         ucUccalendar.setProperty("InitialDate", AV49initialDate);
         ucUccalendar.render(context, "gxscheduler", Uccalendar_Internalname, "UCCALENDARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV75Pgmname), GXutil.rtrim( localUtil.format( AV75Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV54MaqCod), GXutil.rtrim( localUtil.format( AV54MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, edtavMaqcod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\wcalenda.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start20H2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Calendario Maquinas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup20H0( ) ;
   }

   public void ws20H2( )
   {
      start20H2( ) ;
      evt20H2( ) ;
   }

   public void evt20H2( )
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
                           e1120H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e1220H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBTT_ENTDAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dobtt_entdat' */
                           e1320H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBTT_COPHOR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dobtt_cophor' */
                           e1420H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBTT_BORRES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dobtt_borres' */
                           e1520H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBUSCAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBuscar' */
                           e1620H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1720H2 ();
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

   public void we20H2( )
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

   public void pa20H2( )
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
            GX_FocusControl = cmbavMaqmes.getInternalname() ;
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
      if ( cmbavMaqmes.getItemCount() > 0 )
      {
         AV52MaqMes = (byte)(GXutil.lval( cmbavMaqmes.getValidValue(GXutil.trim( GXutil.str( AV52MaqMes, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqMes), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavMaqmes.setValue( GXutil.trim( GXutil.str( AV52MaqMes, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMaqmes.getInternalname(), "Values", cmbavMaqmes.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf20H2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "FicherosBasicos.wcalenda" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf20H2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1220H2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1720H2 ();
         wb20H0( ) ;
      }
   }

   public void send_integrity_lvl_hashes20H2( )
   {
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "FicherosBasicos.wcalenda" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup20H0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1120H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV67DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV66MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCURRENTEVENT"), AV48currentEvent);
         /* Read saved values. */
         AV49initialDate = localUtil.ctod( httpContext.cgiGet( "vINITIALDATE"), 0) ;
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Uccalendar_Autoload = httpContext.cgiGet( "UCCALENDAR_Autoload") ;
         Uccalendar_Loadeventsobject = httpContext.cgiGet( "UCCALENDAR_Loadeventsobject") ;
         Uccalendar_View = httpContext.cgiGet( "UCCALENDAR_View") ;
         Uccalendar_Defaultsteptime = (int)(localUtil.ctol( httpContext.cgiGet( "UCCALENDAR_Defaultsteptime"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Uccalendar_Hoursize = httpContext.cgiGet( "UCCALENDAR_Hoursize") ;
         Uccalendar_Theme = httpContext.cgiGet( "UCCALENDAR_Theme") ;
         Uccalendar_Displayweektab = httpContext.cgiGet( "UCCALENDAR_Displayweektab") ;
         Uccalendar_Displaydaytab = httpContext.cgiGet( "UCCALENDAR_Displaydaytab") ;
         Uccalendar_Montheventsview = httpContext.cgiGet( "UCCALENDAR_Montheventsview") ;
         Uccalendar_Readonly = httpContext.cgiGet( "UCCALENDAR_Readonly") ;
         Uccalendar_Detailsoncreate = httpContext.cgiGet( "UCCALENDAR_Detailsoncreate") ;
         Uccalendar_Detailsondblclick = httpContext.cgiGet( "UCCALENDAR_Detailsondblclick") ;
         Uccalendar_Openlinknewwindow = httpContext.cgiGet( "UCCALENDAR_Openlinknewwindow") ;
         Uccalendar_Allowdragndrop = httpContext.cgiGet( "UCCALENDAR_Allowdragndrop") ;
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
         Combo_maqcod_Ddointernalname = httpContext.cgiGet( "COMBO_MAQCOD_Ddointernalname") ;
         /* Read variables values. */
         cmbavMaqmes.setValue( httpContext.cgiGet( cmbavMaqmes.getInternalname()) );
         AV52MaqMes = (byte)(GXutil.lval( httpContext.cgiGet( cmbavMaqmes.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqMes), 2, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqany_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqany_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQANY");
            GX_FocusControl = edtavMaqany_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53MaqAny = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqAny), 4, 0));
         }
         else
         {
            AV53MaqAny = (short)(localUtil.ctol( httpContext.cgiGet( edtavMaqany_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqAny), 4, 0));
         }
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
         AV54MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54MaqCod", AV54MaqCod);
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
      e1120H2 ();
      if (returnInSub) return;
   }

   public void e1120H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV43Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcalenda_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Station = GXt_char1 ;
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV47UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcalenda_impl.this.AV23EmprCod = GXv_char2[0] ;
      wcalenda_impl.this.AV24EmprNom = GXv_char3[0] ;
      wcalenda_impl.this.AV47UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      divTable24_Height = 40 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable24_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTable24_Height), 9, 0), true);
      divTable23_Height = 40 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable23_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTable23_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV67DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV67DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if (returnInSub) return;
      divTablebody_Height = 40 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablebody_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablebody_Height), 9, 0), true);
      GXt_char1 = AV43Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wcalenda_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43Station = GXt_char1 ;
      GXv_char4[0] = AV23EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char2[0] = AV47UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char4, GXv_char3, GXv_char2) ;
      wcalenda_impl.this.AV23EmprCod = GXv_char4[0] ;
      wcalenda_impl.this.AV24EmprNom = GXv_char3[0] ;
      wcalenda_impl.this.AV47UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      GXt_char1 = AV39msg2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG152_", ""), (byte)(99), GXv_char4) ;
      wcalenda_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39msg2 = GXt_char1 ;
      AV54MaqCod = AV57RecibirMaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54MaqCod", AV54MaqCod);
      edtavMaqcod_Enabled = (((GXutil.strcmp("", AV57RecibirMaqCod)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      AV56FechaActual = GXutil.resetTime( GXutil.serverDate( context, remoteHandle, pr_default) );
      AV53MaqAny = (short)(GXutil.year( AV56FechaActual)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqAny), 4, 0));
      AV52MaqMes = (byte)(GXutil.month( AV56FechaActual)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqMes), 2, 0));
      AV64MaqDay = (byte)(GXutil.day( AV56FechaActual)) ;
      if ( ! (GXutil.strcmp("", AV57RecibirMaqCod)==0) )
      {
         AV54MaqCod = AV57RecibirMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54MaqCod", AV54MaqCod);
      }
   }

   public void e1220H2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S122 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod("", false, "UCCALENDARContainer", "Refresh", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e1320H2( )
   {
      /* 'Dobtt_entdat' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CHECKREQUIREDFIELDS' */
      S132 ();
      if (returnInSub) return;
      if ( AV61CheckRequiredFieldsResult )
      {
         new app.ficherosbasicos.registrarmaqhnp(remoteHandle, context).execute( AV23EmprCod, AV54MaqCod, AV53MaqAny, AV52MaqMes) ;
         httpContext.popup(formatLink("app.webwcal002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV54MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52MaqMes,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53MaqAny,4,0))}, new String[] {"EmprCod","MAQUINA","MM","AA"}) , new Object[] {});
         this.executeUsercontrolMethod("", false, "UCCALENDARContainer", "Refresh", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e1420H2( )
   {
      /* 'Dobtt_cophor' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CHECKREQUIREDFIELDS' */
      S132 ();
      if (returnInSub) return;
      if ( AV61CheckRequiredFieldsResult )
      {
         GXv_char4[0] = AV23EmprCod ;
         GXv_char3[0] = AV54MaqCod ;
         GXv_int7[0] = AV52MaqMes ;
         GXv_int8[0] = AV53MaqAny ;
         new app.pcalen03(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int8) ;
         wcalenda_impl.this.AV23EmprCod = GXv_char4[0] ;
         wcalenda_impl.this.AV54MaqCod = GXv_char3[0] ;
         wcalenda_impl.this.AV52MaqMes = GXv_int7[0] ;
         wcalenda_impl.this.AV53MaqAny = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV54MaqCod", AV54MaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV52MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqMes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV53MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqAny), 4, 0));
         this.executeUsercontrolMethod("", false, "UCCALENDARContainer", "Refresh", "", new Object[] {});
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se han copiado los horarios para todas las máquinas. Proceso finalizado.", ""));
      }
      /*  Sending Event outputs  */
      cmbavMaqmes.setValue( GXutil.trim( GXutil.str( AV52MaqMes, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMaqmes.getInternalname(), "Values", cmbavMaqmes.ToJavascriptSource(), true);
   }

   public void e1520H2( )
   {
      /* 'Dobtt_borres' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CHECKREQUIREDFIELDS' */
      S132 ();
      if (returnInSub) return;
      if ( AV61CheckRequiredFieldsResult )
      {
         GXv_char4[0] = AV23EmprCod ;
         GXv_char3[0] = AV54MaqCod ;
         GXv_int7[0] = AV52MaqMes ;
         GXv_int8[0] = AV53MaqAny ;
         new app.pbormmes(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int8) ;
         wcalenda_impl.this.AV23EmprCod = GXv_char4[0] ;
         wcalenda_impl.this.AV54MaqCod = GXv_char3[0] ;
         wcalenda_impl.this.AV52MaqMes = GXv_int7[0] ;
         wcalenda_impl.this.AV53MaqAny = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV54MaqCod", AV54MaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV52MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqMes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV53MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqAny), 4, 0));
         this.executeUsercontrolMethod("", false, "UCCALENDARContainer", "Refresh", "", new Object[] {});
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Registros borrardos. Proceso finalizado.", ""));
      }
      /*  Sending Event outputs  */
      cmbavMaqmes.setValue( GXutil.trim( GXutil.str( AV52MaqMes, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavMaqmes.getInternalname(), "Values", cmbavMaqmes.ToJavascriptSource(), true);
   }

   public void e1620H2( )
   {
      /* 'DoBuscar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DO SETSESSION' */
      S142 ();
      if (returnInSub) return;
      if ( ! (0==AV52MaqMes) && ! (0==AV53MaqAny) )
      {
         AV70DateTimeSearch = localUtil.ymdhmsToT( AV53MaqAny, AV52MaqMes, (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ;
         this.executeUsercontrolMethod("", false, "UCCALENDARContainer", "SetCurrentView", "", new Object[] {localUtil.format( AV70DateTimeSearch, "99/99/9999 99:99:99"),httpContext.getMessage( "month", "")});
      }
      this.executeUsercontrolMethod("", false, "UCCALENDARContainer", "Refresh", "", new Object[] {});
   }

   public void S122( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( ! (0==AV52MaqMes) && ! (0==AV53MaqAny) ) )
      {
         bttBtnbtt_borres_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnbtt_borres_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnbtt_borres_Visible), 5, 0), true);
      }
   }

   public void S132( )
   {
      /* 'CHECKREQUIREDFIELDS' Routine */
      returnInSub = false ;
      AV61CheckRequiredFieldsResult = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61CheckRequiredFieldsResult", AV61CheckRequiredFieldsResult);
      if ( (GXutil.strcmp("", AV54MaqCod)==0) )
      {
         httpContext.GX_msglist.addItem(new app.wwpbaseobjects.dvmessagegetbasicnotificationmsg(remoteHandle, context).executeUdp( "", httpContext.getMessage( "Máquina es requerido.", ""), "error", Combo_maqcod_Ddointernalname, "true", ""));
         AV61CheckRequiredFieldsResult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61CheckRequiredFieldsResult", AV61CheckRequiredFieldsResult);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV66MaqCod_Data.clear();
      /* Using cursor H020H2 */
      pr_default.execute(0, new Object[] {AV23EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H020H2_A396EmprCod[0] ;
         A602MaqCod = H020H2_A602MaqCod[0] ;
         GXt_char1 = AV71MaqDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pobtmaq(remoteHandle, context).execute( AV23EmprCod, A602MaqCod, GXv_char4) ;
         wcalenda_impl.this.GXt_char1 = GXv_char4[0] ;
         AV71MaqDsc = GXt_char1 ;
         GXt_char1 = AV72MaqEst ;
         GXv_char4[0] = GXt_char1 ;
         new app.produccion.maquinaestado_pr(remoteHandle, context).execute( AV23EmprCod, A602MaqCod, GXv_char4) ;
         wcalenda_impl.this.GXt_char1 = GXv_char4[0] ;
         AV72MaqEst = GXt_char1 ;
         if ( GXutil.strcmp(AV72MaqEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV68Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV68Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
            AV68Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), AV71MaqDsc, "", "", "", "", "", "", "") );
            AV66MaqCod_Data.add(AV68Combo_DataItem, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV66MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV54MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'DO SETSESSION' Routine */
      returnInSub = false ;
      AV50websession.setValue(httpContext.getMessage( "MaqCod", ""), AV54MaqCod);
      AV50websession.setValue(httpContext.getMessage( "MaqAny", ""), GXutil.str( AV53MaqAny, 4, 0));
      AV50websession.setValue(httpContext.getMessage( "MaqMes", ""), GXutil.str( AV52MaqMes, 2, 0));
   }

   protected void nextLoad( )
   {
   }

   protected void e1720H2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV57RecibirMaqCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57RecibirMaqCod", AV57RecibirMaqCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57RecibirMaqCod, ""))));
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
      pa20H2( ) ;
      ws20H2( ) ;
      we20H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714195410", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/wcalenda.js", "?202681714195410", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXScheduler/dhtmlxscheduler.js", "", false, true);
      httpContext.AddJavascriptSource("GXScheduler/GXSchedulerRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      divTablebody_Internalname = "TABLEBODY" ;
      divTablebodyaction_Internalname = "TABLEBODYACTION" ;
      divTableactionlist_Internalname = "TABLEACTIONLIST" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbavMaqmes.setInternalname( "vMAQMES" );
      edtavMaqany_Internalname = "vMAQANY" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTable23_Internalname = "TABLE23" ;
      bttBtnbuscar_Internalname = "BTNBUSCAR" ;
      divTable24_Internalname = "TABLE24" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablefilter_Internalname = "TABLEFILTER" ;
      divTableforminputs_Internalname = "TABLEFORMINPUTS" ;
      divTableinputhour_Internalname = "TABLEINPUTHOUR" ;
      bttBtnbtt_entdat_Internalname = "BTNBTT_ENTDAT" ;
      bttBtnbtt_cophor_Internalname = "BTNBTT_COPHOR" ;
      bttBtnbtt_borres_Internalname = "BTNBTT_BORRES" ;
      divTableinputhours_Internalname = "TABLEINPUTHOURS" ;
      divTableform_Internalname = "TABLEFORM" ;
      Uccalendar_Internalname = "UCCALENDAR" ;
      divTablecalendar_Internalname = "TABLECALENDAR" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
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
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavMaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnbtt_borres_Visible = 1 ;
      divTable24_Height = 0 ;
      divTable23_Height = 0 ;
      edtavMaqany_Jsonclick = "" ;
      edtavMaqany_Enabled = 1 ;
      cmbavMaqmes.setJsonclick( "" );
      cmbavMaqmes.setEnabled( 1 );
      Combo_maqcod_Caption = "" ;
      divTablebody_Height = 0 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  CALENDARIO DE PRODUCCION", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Uccalendar_Allowdragndrop = "false" ;
      Uccalendar_Openlinknewwindow = "false" ;
      Uccalendar_Detailsondblclick = "false" ;
      Uccalendar_Detailsoncreate = "false" ;
      Uccalendar_Readonly = "true" ;
      Uccalendar_Montheventsview = "multiline" ;
      Uccalendar_Displaydaytab = "false" ;
      Uccalendar_Displayweektab = "false" ;
      Uccalendar_Theme = "flat" ;
      Uccalendar_Hoursize = "2" ;
      Uccalendar_Defaultsteptime = 5 ;
      Uccalendar_View = "month" ;
      Uccalendar_Loadeventsobject = "ficherosbasicos.pget_calendariomaquina" ;
      Uccalendar_Autoload = "month" ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Calendario Maquinas", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavMaqmes.setName( "vMAQMES" );
      cmbavMaqmes.setWebtags( "" );
      cmbavMaqmes.addItem(GXutil.trim( GXutil.str( 0, 2, 0)), httpContext.getMessage( "GX_EmptyItemText", ""), (short)(0));
      cmbavMaqmes.addItem("1", "01", (short)(0));
      cmbavMaqmes.addItem("2", "02", (short)(0));
      cmbavMaqmes.addItem("3", "03", (short)(0));
      cmbavMaqmes.addItem("4", "04", (short)(0));
      cmbavMaqmes.addItem("5", "05", (short)(0));
      cmbavMaqmes.addItem("6", "06", (short)(0));
      cmbavMaqmes.addItem("7", "07", (short)(0));
      cmbavMaqmes.addItem("8", "08", (short)(0));
      cmbavMaqmes.addItem("9", "09", (short)(0));
      cmbavMaqmes.addItem("10", "10", (short)(0));
      cmbavMaqmes.addItem("11", "11", (short)(0));
      cmbavMaqmes.addItem("12", "12", (short)(0));
      if ( cmbavMaqmes.getItemCount() > 0 )
      {
         AV52MaqMes = (byte)(GXutil.lval( cmbavMaqmes.getValidValue(GXutil.trim( GXutil.str( AV52MaqMes, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqMes), 2, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavMaqmes'},{av:'AV52MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV53MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV57RecibirMaqCod',fld:'vRECIBIRMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'BTNBTT_BORRES',prop:'Visible'}]}");
      setEventMetadata("'DOBTT_ENTDAT'","{handler:'e1320H2',iparms:[{av:'AV61CheckRequiredFieldsResult',fld:'vCHECKREQUIREDFIELDSRESULT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54MaqCod',fld:'vMAQCOD',pic:''},{av:'AV53MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'cmbavMaqmes'},{av:'AV52MaqMes',fld:'vMAQMES',pic:'99'},{av:'Combo_maqcod_Ddointernalname',ctrl:'COMBO_MAQCOD',prop:'DDOInternalName'}]");
      setEventMetadata("'DOBTT_ENTDAT'",",oparms:[{av:'AV61CheckRequiredFieldsResult',fld:'vCHECKREQUIREDFIELDSRESULT',pic:''}]}");
      setEventMetadata("'DOBTT_COPHOR'","{handler:'e1420H2',iparms:[{av:'AV61CheckRequiredFieldsResult',fld:'vCHECKREQUIREDFIELDSRESULT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54MaqCod',fld:'vMAQCOD',pic:''},{av:'cmbavMaqmes'},{av:'AV52MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV53MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'Combo_maqcod_Ddointernalname',ctrl:'COMBO_MAQCOD',prop:'DDOInternalName'}]");
      setEventMetadata("'DOBTT_COPHOR'",",oparms:[{av:'AV53MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'cmbavMaqmes'},{av:'AV52MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV54MaqCod',fld:'vMAQCOD',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61CheckRequiredFieldsResult',fld:'vCHECKREQUIREDFIELDSRESULT',pic:''}]}");
      setEventMetadata("'DOBTT_BORRES'","{handler:'e1520H2',iparms:[{av:'AV61CheckRequiredFieldsResult',fld:'vCHECKREQUIREDFIELDSRESULT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54MaqCod',fld:'vMAQCOD',pic:''},{av:'cmbavMaqmes'},{av:'AV52MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV53MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'Combo_maqcod_Ddointernalname',ctrl:'COMBO_MAQCOD',prop:'DDOInternalName'}]");
      setEventMetadata("'DOBTT_BORRES'",",oparms:[{av:'AV53MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'cmbavMaqmes'},{av:'AV52MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV54MaqCod',fld:'vMAQCOD',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61CheckRequiredFieldsResult',fld:'vCHECKREQUIREDFIELDSRESULT',pic:''}]}");
      setEventMetadata("'DOBUSCAR'","{handler:'e1620H2',iparms:[{av:'cmbavMaqmes'},{av:'AV52MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV53MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV54MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("'DOBUSCAR'",",oparms:[]}");
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
      wcpOAV57RecibirMaqCod = "" ;
      Combo_maqcod_Ddointernalname = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV57RecibirMaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV67DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV66MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV48currentEvent = new app.ficherosbasicos.SdtSchedulerEvents_event(remoteHandle, context);
      AV49initialDate = GXutil.nullDate() ;
      AV23EmprCod = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnbuscar_Jsonclick = "" ;
      bttBtnbtt_entdat_Jsonclick = "" ;
      bttBtnbtt_cophor_Jsonclick = "" ;
      bttBtnbtt_borres_Jsonclick = "" ;
      ucUccalendar = new com.genexus.webpanels.GXUserControl();
      AV75Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV54MaqCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV43Station = "" ;
      AV24EmprNom = "" ;
      AV47UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_char2 = new String[1] ;
      AV39msg2 = "" ;
      AV56FechaActual = GXutil.resetTime( GXutil.nullDate() );
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      AV70DateTimeSearch = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      H020H2_A396EmprCod = new String[] {""} ;
      H020H2_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      AV71MaqDsc = "" ;
      AV72MaqEst = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV68Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV50websession = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.wcalenda__default(),
         new Object[] {
             new Object[] {
            H020H2_A396EmprCod, H020H2_A602MaqCod
            }
         }
      );
      AV75Pgmname = "FicherosBasicos.wcalenda" ;
      /* GeneXus formulas. */
      AV75Pgmname = "FicherosBasicos.wcalenda" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV52MaqMes ;
   private byte nDonePA ;
   private byte AV64MaqDay ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV53MaqAny ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int8[] ;
   private int Uccalendar_Defaultsteptime ;
   private int divTablebody_Height ;
   private int edtavMaqany_Enabled ;
   private int divTable23_Height ;
   private int divTable24_Height ;
   private int bttBtnbtt_borres_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavMaqcod_Visible ;
   private int edtavMaqcod_Enabled ;
   private int idxLst ;
   private String wcpOAV57RecibirMaqCod ;
   private String Combo_maqcod_Ddointernalname ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV57RecibirMaqCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV23EmprCod ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Uccalendar_Autoload ;
   private String Uccalendar_Loadeventsobject ;
   private String Uccalendar_View ;
   private String Uccalendar_Hoursize ;
   private String Uccalendar_Theme ;
   private String Uccalendar_Displayweektab ;
   private String Uccalendar_Displaydaytab ;
   private String Uccalendar_Montheventsview ;
   private String Uccalendar_Readonly ;
   private String Uccalendar_Detailsoncreate ;
   private String Uccalendar_Detailsondblclick ;
   private String Uccalendar_Openlinknewwindow ;
   private String Uccalendar_Allowdragndrop ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divTableforminputs_Internalname ;
   private String divTableactionlist_Internalname ;
   private String divTablebody_Internalname ;
   private String divTablebodyaction_Internalname ;
   private String divTablefilter_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtavMaqany_Internalname ;
   private String edtavMaqany_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTable23_Internalname ;
   private String divTable24_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnbuscar_Internalname ;
   private String bttBtnbuscar_Jsonclick ;
   private String divTableform_Internalname ;
   private String divTableinputhour_Internalname ;
   private String divTableinputhours_Internalname ;
   private String bttBtnbtt_entdat_Internalname ;
   private String bttBtnbtt_entdat_Jsonclick ;
   private String bttBtnbtt_cophor_Internalname ;
   private String bttBtnbtt_cophor_Jsonclick ;
   private String bttBtnbtt_borres_Internalname ;
   private String bttBtnbtt_borres_Jsonclick ;
   private String divTablecalendar_Internalname ;
   private String Uccalendar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV75Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String AV54MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV43Station ;
   private String AV24EmprNom ;
   private String AV47UsurCod ;
   private String GXv_char2[] ;
   private String AV39msg2 ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV71MaqDsc ;
   private String AV72MaqEst ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV56FechaActual ;
   private java.util.Date AV70DateTimeSearch ;
   private java.util.Date AV49initialDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV61CheckRequiredFieldsResult ;
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
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucUccalendar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private HTMLChoice cmbavMaqmes ;
   private IDataStoreProvider pr_default ;
   private String[] H020H2_A396EmprCod ;
   private String[] H020H2_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV50websession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV66MaqCod_Data ;
   private app.ficherosbasicos.SdtSchedulerEvents_event AV48currentEvent ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV68Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV67DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcalenda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H020H2", "SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
      }
   }

}

