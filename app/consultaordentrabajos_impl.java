package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultaordentrabajos_impl extends GXDataArea
{
   public consultaordentrabajos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultaordentrabajos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaordentrabajos_impl.class ));
   }

   public consultaordentrabajos_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavDetalle = new HTMLChoice();
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
      paYN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startYN2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultaordentrabajos", new String[] {}, new String[] {}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMMAQCODI_DATA", AV24OMMaqCodI_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMMAQCODI_DATA", AV24OMMaqCodI_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMMAQCODF_DATA", AV27OMMaqCodF_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMMAQCODF_DATA", AV27OMMaqCodF_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMOPECODI_DATA", AV28OMOpeCodi_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMOPECODI_DATA", AV28OMOpeCodi_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMOPECODF_DATA", AV29OMOpeCodf_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMOPECODF_DATA", AV29OMOpeCodf_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODI_Cls", GXutil.rtrim( Combo_ommaqcodi_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODI_Selectedvalue_set", GXutil.rtrim( Combo_ommaqcodi_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODI_Emptyitemtext", GXutil.rtrim( Combo_ommaqcodi_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODF_Cls", GXutil.rtrim( Combo_ommaqcodf_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODF_Selectedvalue_set", GXutil.rtrim( Combo_ommaqcodf_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODF_Emptyitemtext", GXutil.rtrim( Combo_ommaqcodf_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODI_Cls", GXutil.rtrim( Combo_omopecodi_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODI_Selectedvalue_set", GXutil.rtrim( Combo_omopecodi_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODI_Emptyitemtext", GXutil.rtrim( Combo_omopecodi_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODF_Cls", GXutil.rtrim( Combo_omopecodf_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODF_Selectedvalue_set", GXutil.rtrim( Combo_omopecodf_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODF_Emptyitemtext", GXutil.rtrim( Combo_omopecodf_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Width", GXutil.rtrim( Dvpanel_paneldatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Autowidth", GXutil.booltostr( Dvpanel_paneldatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Autoheight", GXutil.booltostr( Dvpanel_paneldatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Cls", GXutil.rtrim( Dvpanel_paneldatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Title", GXutil.rtrim( Dvpanel_paneldatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Collapsible", GXutil.booltostr( Dvpanel_paneldatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Collapsed", GXutil.booltostr( Dvpanel_paneldatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_paneldatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Iconposition", GXutil.rtrim( Dvpanel_paneldatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELDATOS_Autoscroll", GXutil.booltostr( Dvpanel_paneldatos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODF_Selectedvalue_get", GXutil.rtrim( Combo_omopecodf_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECODI_Selectedvalue_get", GXutil.rtrim( Combo_omopecodi_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODF_Selectedvalue_get", GXutil.rtrim( Combo_ommaqcodf_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMMAQCODI_Selectedvalue_get", GXutil.rtrim( Combo_ommaqcodi_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
         weYN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtYN2( ) ;
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
      return formatLink("app.consultaordentrabajos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ConsultaOrdenTrabajos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Orden de Trabajos", "") ;
   }

   public void wbYN0( )
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
         /* User Defined Control */
         ucDvpanel_paneldatos.setProperty("Width", Dvpanel_paneldatos_Width);
         ucDvpanel_paneldatos.setProperty("AutoWidth", Dvpanel_paneldatos_Autowidth);
         ucDvpanel_paneldatos.setProperty("AutoHeight", Dvpanel_paneldatos_Autoheight);
         ucDvpanel_paneldatos.setProperty("Cls", Dvpanel_paneldatos_Cls);
         ucDvpanel_paneldatos.setProperty("Title", Dvpanel_paneldatos_Title);
         ucDvpanel_paneldatos.setProperty("Collapsible", Dvpanel_paneldatos_Collapsible);
         ucDvpanel_paneldatos.setProperty("Collapsed", Dvpanel_paneldatos_Collapsed);
         ucDvpanel_paneldatos.setProperty("ShowCollapseIcon", Dvpanel_paneldatos_Showcollapseicon);
         ucDvpanel_paneldatos.setProperty("IconPosition", Dvpanel_paneldatos_Iconposition);
         ucDvpanel_paneldatos.setProperty("AutoScroll", Dvpanel_paneldatos_Autoscroll);
         ucDvpanel_paneldatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_paneldatos_Internalname, "DVPANEL_PANELDATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELDATOSContainer"+"PanelDatos"+"\" style=\"display:none;\">") ;
         wb_table1_14_YN2( true) ;
      }
      else
      {
         wb_table1_14_YN2( false) ;
      }
      return  ;
   }

   public void wb_table1_14_YN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmmaqcodi_Internalname, GXutil.rtrim( AV8OMMaqCodI), GXutil.rtrim( localUtil.format( AV8OMMaqCodI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmmaqcodi_Jsonclick, 0, "Attribute", "", "", "", "", edtavOmmaqcodi_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultaOrdenTrabajos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmmaqcodf_Internalname, GXutil.rtrim( AV7OMMaqCodF), GXutil.rtrim( localUtil.format( AV7OMMaqCodF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmmaqcodf_Jsonclick, 0, "Attribute", "", "", "", "", edtavOmmaqcodf_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultaOrdenTrabajos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmopecodi_Internalname, GXutil.ltrim( localUtil.ntoc( AV12OMOpeCodi, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12OMOpeCodi), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmopecodi_Jsonclick, 0, "Attribute", "", "", "", "", edtavOmopecodi_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaOrdenTrabajos.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmopecodf_Internalname, GXutil.ltrim( localUtil.ntoc( AV11OMOpeCodf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11OMOpeCodf), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmopecodf_Jsonclick, 0, "Attribute", "", "", "", "", edtavOmopecodf_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaOrdenTrabajos.htm");
         wb_table2_92_YN2( true) ;
      }
      else
      {
         wb_table2_92_YN2( false) ;
      }
      return  ;
   }

   public void wb_table2_92_YN2e( boolean wbgen )
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

   public void startYN2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Orden de Trabajos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupYN0( ) ;
   }

   public void wsYN2( )
   {
      startYN2( ) ;
      evtYN2( ) ;
   }

   public void evtYN2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11YN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e12YN2 ();
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
                                 e13YN2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e14YN2 ();
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

   public void weYN2( )
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

   public void paYN2( )
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
            GX_FocusControl = edtavOmcodi_Internalname ;
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
      if ( cmbavDetalle.getItemCount() > 0 )
      {
         AV15Detalle = cmbavDetalle.getValidValue(AV15Detalle) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Detalle", AV15Detalle);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDetalle.setValue( GXutil.rtrim( AV15Detalle) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDetalle.getInternalname(), "Values", cmbavDetalle.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfYN2( ) ;
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

   public void rfYN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e14YN2 ();
         wbYN0( ) ;
      }
   }

   public void send_integrity_lvl_hashesYN2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupYN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12YN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV25DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMMAQCODI_DATA"), AV24OMMaqCodI_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMMAQCODF_DATA"), AV27OMMaqCodF_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMOPECODI_DATA"), AV28OMOpeCodi_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMOPECODF_DATA"), AV29OMOpeCodf_Data);
         /* Read saved values. */
         Combo_ommaqcodi_Cls = httpContext.cgiGet( "COMBO_OMMAQCODI_Cls") ;
         Combo_ommaqcodi_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMMAQCODI_Selectedvalue_set") ;
         Combo_ommaqcodi_Emptyitemtext = httpContext.cgiGet( "COMBO_OMMAQCODI_Emptyitemtext") ;
         Combo_ommaqcodf_Cls = httpContext.cgiGet( "COMBO_OMMAQCODF_Cls") ;
         Combo_ommaqcodf_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMMAQCODF_Selectedvalue_set") ;
         Combo_ommaqcodf_Emptyitemtext = httpContext.cgiGet( "COMBO_OMMAQCODF_Emptyitemtext") ;
         Combo_omopecodi_Cls = httpContext.cgiGet( "COMBO_OMOPECODI_Cls") ;
         Combo_omopecodi_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMOPECODI_Selectedvalue_set") ;
         Combo_omopecodi_Emptyitemtext = httpContext.cgiGet( "COMBO_OMOPECODI_Emptyitemtext") ;
         Combo_omopecodf_Cls = httpContext.cgiGet( "COMBO_OMOPECODF_Cls") ;
         Combo_omopecodf_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMOPECODF_Selectedvalue_set") ;
         Combo_omopecodf_Emptyitemtext = httpContext.cgiGet( "COMBO_OMOPECODF_Emptyitemtext") ;
         Dvpanel_paneldatos_Width = httpContext.cgiGet( "DVPANEL_PANELDATOS_Width") ;
         Dvpanel_paneldatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Autowidth")) ;
         Dvpanel_paneldatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Autoheight")) ;
         Dvpanel_paneldatos_Cls = httpContext.cgiGet( "DVPANEL_PANELDATOS_Cls") ;
         Dvpanel_paneldatos_Title = httpContext.cgiGet( "DVPANEL_PANELDATOS_Title") ;
         Dvpanel_paneldatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Collapsible")) ;
         Dvpanel_paneldatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Collapsed")) ;
         Dvpanel_paneldatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Showcollapseicon")) ;
         Dvpanel_paneldatos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELDATOS_Iconposition") ;
         Dvpanel_paneldatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELDATOS_Autoscroll")) ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMCODI");
            GX_FocusControl = edtavOmcodi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6OMCodi = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6OMCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6OMCodi), 8, 0));
         }
         else
         {
            AV6OMCodi = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmcodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6OMCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6OMCodi), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMCODF");
            GX_FocusControl = edtavOmcodf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5OMCodf = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5OMCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5OMCodf), 8, 0));
         }
         else
         {
            AV5OMCodf = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmcodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5OMCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5OMCodf), 8, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmmcini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMMCINI");
            GX_FocusControl = edtavOmmcini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10OMMCIni = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10OMMCIni", localUtil.ttoc( AV10OMMCIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV10OMMCIni = localUtil.ctot( httpContext.cgiGet( edtavOmmcini_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10OMMCIni", localUtil.ttoc( AV10OMMCIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmmcfin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMMCFIN");
            GX_FocusControl = edtavOmmcfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9OMMCFin = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9OMMCFin", localUtil.ttoc( AV9OMMCFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV9OMMCFin = localUtil.ctot( httpContext.cgiGet( edtavOmmcfin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9OMMCFin", localUtil.ttoc( AV9OMMCFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         cmbavDetalle.setValue( httpContext.cgiGet( cmbavDetalle.getInternalname()) );
         AV15Detalle = httpContext.cgiGet( cmbavDetalle.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Detalle", AV15Detalle);
         AV8OMMaqCodI = httpContext.cgiGet( edtavOmmaqcodi_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8OMMaqCodI", AV8OMMaqCodI);
         AV7OMMaqCodF = httpContext.cgiGet( edtavOmmaqcodf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7OMMaqCodF", AV7OMMaqCodF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmopecodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmopecodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMOPECODI");
            GX_FocusControl = edtavOmopecodi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12OMOpeCodi = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OMOpeCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OMOpeCodi), 6, 0));
         }
         else
         {
            AV12OMOpeCodi = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmopecodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OMOpeCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OMOpeCodi), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmopecodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmopecodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMOPECODF");
            GX_FocusControl = edtavOmopecodf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11OMOpeCodf = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11OMOpeCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11OMOpeCodf), 6, 0));
         }
         else
         {
            AV11OMOpeCodf = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmopecodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11OMOpeCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11OMOpeCodf), 6, 0));
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
      e12YN2 ();
      if (returnInSub) return;
   }

   public void e12YN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultaordentrabajos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV16EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultaordentrabajos_impl.this.AV16EmprCod = GXv_char2[0] ;
      consultaordentrabajos_impl.this.AV17EmprNom = GXv_char3[0] ;
      consultaordentrabajos_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV25DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV25DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavOmopecodf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOmopecodf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmopecodf_Visible), 5, 0), true);
      edtavOmopecodi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOmopecodi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmopecodi_Visible), 5, 0), true);
      edtavOmmaqcodf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOmmaqcodf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmaqcodf_Visible), 5, 0), true);
      edtavOmmaqcodi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOmmaqcodi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmaqcodi_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOOMMAQCODI' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOOMMAQCODF' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOOMOPECODI' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOOMOPECODF' */
      S142 ();
      if (returnInSub) return;
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultaordentrabajos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char2[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultaordentrabajos_impl.this.AV16EmprCod = GXv_char4[0] ;
      consultaordentrabajos_impl.this.AV17EmprNom = GXv_char3[0] ;
      consultaordentrabajos_impl.this.AV14UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e13YN2 ();
      if (returnInSub) return;
   }

   public void e13YN2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
   }

   public void e11YN2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavDetalle.setValue( GXutil.rtrim( AV15Detalle) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDetalle.getInternalname(), "Values", cmbavDetalle.ToJavascriptSource(), true);
   }

   public void S152( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CONFIRMAR' */
      S162 ();
      if (returnInSub) return;
   }

   public void S142( )
   {
      /* 'LOADCOMBOOMOPECODF' Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultaordentrabajos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char2[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultaordentrabajos_impl.this.AV16EmprCod = GXv_char4[0] ;
      consultaordentrabajos_impl.this.AV17EmprNom = GXv_char3[0] ;
      consultaordentrabajos_impl.this.AV14UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      AV29OMOpeCodf_Data.clear();
      /* Using cursor H00YN2 */
      pr_default.execute(0, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8482OpeAct = H00YN2_A8482OpeAct[0] ;
         n8482OpeAct = H00YN2_n8482OpeAct[0] ;
         A396EmprCod = H00YN2_A396EmprCod[0] ;
         A653OpeNom = H00YN2_A653OpeNom[0] ;
         n653OpeNom = H00YN2_n653OpeNom[0] ;
         A652OpeCod = H00YN2_A652OpeCod[0] ;
         if ( GXutil.strcmp(A8482OpeAct, httpContext.getMessage( "A", "")) == 0 )
         {
            A13748OpeCNom = GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) + " - " + GXutil.trim( A653OpeNom) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13748OpeCNom", A13748OpeCNom);
            AV26Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A652OpeCod, 6, 0)), A13748OpeCNom, "", "", "", "", "", "", "") );
            AV29OMOpeCodf_Data.add(AV26Combo_DataItem, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV29OMOpeCodf_Data.sort("Title");
      Combo_omopecodf_Selectedvalue_set = ((0==AV11OMOpeCodf) ? "" : GXutil.trim( GXutil.str( AV11OMOpeCodf, 6, 0))) ;
      ucCombo_omopecodf.sendProperty(context, "", false, Combo_omopecodf_Internalname, "SelectedValue_set", Combo_omopecodf_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOOMOPECODI' Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultaordentrabajos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char2[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultaordentrabajos_impl.this.AV16EmprCod = GXv_char4[0] ;
      consultaordentrabajos_impl.this.AV17EmprNom = GXv_char3[0] ;
      consultaordentrabajos_impl.this.AV14UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      AV28OMOpeCodi_Data.clear();
      /* Using cursor H00YN3 */
      pr_default.execute(1, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A8482OpeAct = H00YN3_A8482OpeAct[0] ;
         n8482OpeAct = H00YN3_n8482OpeAct[0] ;
         A396EmprCod = H00YN3_A396EmprCod[0] ;
         A653OpeNom = H00YN3_A653OpeNom[0] ;
         n653OpeNom = H00YN3_n653OpeNom[0] ;
         A652OpeCod = H00YN3_A652OpeCod[0] ;
         if ( GXutil.strcmp(A8482OpeAct, httpContext.getMessage( "A", "")) == 0 )
         {
            A13748OpeCNom = GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) + " - " + GXutil.trim( A653OpeNom) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13748OpeCNom", A13748OpeCNom);
            AV26Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A652OpeCod, 6, 0)), A13748OpeCNom, "", "", "", "", "", "", "") );
            AV28OMOpeCodi_Data.add(AV26Combo_DataItem, 0);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV28OMOpeCodi_Data.sort("Title");
      Combo_omopecodi_Selectedvalue_set = ((0==AV12OMOpeCodi) ? "" : GXutil.trim( GXutil.str( AV12OMOpeCodi, 6, 0))) ;
      ucCombo_omopecodi.sendProperty(context, "", false, Combo_omopecodi_Internalname, "SelectedValue_set", Combo_omopecodi_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOOMMAQCODF' Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultaordentrabajos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char2[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultaordentrabajos_impl.this.AV16EmprCod = GXv_char4[0] ;
      consultaordentrabajos_impl.this.AV17EmprNom = GXv_char3[0] ;
      consultaordentrabajos_impl.this.AV14UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      AV27OMMaqCodF_Data.clear();
      /* Using cursor H00YN4 */
      pr_default.execute(2, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A607MaqEst = H00YN4_A607MaqEst[0] ;
         n607MaqEst = H00YN4_n607MaqEst[0] ;
         A396EmprCod = H00YN4_A396EmprCod[0] ;
         A606MaqDsc = H00YN4_A606MaqDsc[0] ;
         n606MaqDsc = H00YN4_n606MaqDsc[0] ;
         A602MaqCod = H00YN4_A602MaqCod[0] ;
         if ( GXutil.strcmp(A607MaqEst, httpContext.getMessage( "A", "")) == 0 )
         {
            A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
            AV26Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A13734MaqCDsc, "", "", "", "", "", "", "") );
            AV27OMMaqCodF_Data.add(AV26Combo_DataItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV27OMMaqCodF_Data.sort("Title");
      Combo_ommaqcodf_Selectedvalue_set = AV7OMMaqCodF ;
      ucCombo_ommaqcodf.sendProperty(context, "", false, Combo_ommaqcodf_Internalname, "SelectedValue_set", Combo_ommaqcodf_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOOMMAQCODI' Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultaordentrabajos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char2[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultaordentrabajos_impl.this.AV16EmprCod = GXv_char4[0] ;
      consultaordentrabajos_impl.this.AV17EmprNom = GXv_char3[0] ;
      consultaordentrabajos_impl.this.AV14UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      AV24OMMaqCodI_Data.clear();
      /* Using cursor H00YN5 */
      pr_default.execute(3, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A607MaqEst = H00YN5_A607MaqEst[0] ;
         n607MaqEst = H00YN5_n607MaqEst[0] ;
         A396EmprCod = H00YN5_A396EmprCod[0] ;
         A606MaqDsc = H00YN5_A606MaqDsc[0] ;
         n606MaqDsc = H00YN5_n606MaqDsc[0] ;
         A602MaqCod = H00YN5_A602MaqCod[0] ;
         if ( GXutil.strcmp(A607MaqEst, httpContext.getMessage( "A", "")) == 0 )
         {
            A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
            AV26Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
            AV26Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A13734MaqCDsc, "", "", "", "", "", "", "") );
            AV24OMMaqCodI_Data.add(AV26Combo_DataItem, 0);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV24OMMaqCodI_Data.sort("Title");
      Combo_ommaqcodi_Selectedvalue_set = AV8OMMaqCodI ;
      ucCombo_ommaqcodi.sendProperty(context, "", false, Combo_ommaqcodi_Internalname, "SelectedValue_set", Combo_ommaqcodi_Selectedvalue_set);
   }

   public void S162( )
   {
      /* 'CONFIRMAR' Routine */
      returnInSub = false ;
      if ( ( AV5OMCodf < AV6OMCodi ) && ! (0==AV5OMCodf) )
      {
         httpContext.GX_msglist.addItem("Ajustando rango de Orden");
         GX_FocusControl = edtavOmcodi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV20TemporalOMCod = AV6OMCodi ;
         AV6OMCodi = AV5OMCodf ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6OMCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6OMCodi), 8, 0));
         AV5OMCodf = AV20TemporalOMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5OMCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5OMCodf), 8, 0));
      }
      if ( GXutil.strcmp(AV7OMMaqCodF, AV8OMMaqCodI) < 0 )
      {
         httpContext.GX_msglist.addItem("Ajustando rango de Maquina");
         GX_FocusControl = edtavOmmaqcodi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV21TemporalOMMaqCod = AV8OMMaqCodI ;
         AV8OMMaqCodI = AV7OMMaqCodF ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8OMMaqCodI", AV8OMMaqCodI);
         AV7OMMaqCodF = AV21TemporalOMMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7OMMaqCodF", AV7OMMaqCodF);
      }
      if ( AV9OMMCFin.before( AV10OMMCIni ) )
      {
         httpContext.GX_msglist.addItem("Ajustando rango de Fecha");
         GX_FocusControl = edtavOmmcini_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV22TemporalOMMCIni = AV10OMMCIni ;
         AV10OMMCIni = AV9OMMCFin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10OMMCIni", localUtil.ttoc( AV10OMMCIni, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV9OMMCFin = AV22TemporalOMMCIni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9OMMCFin", localUtil.ttoc( AV9OMMCFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( AV11OMOpeCodf < AV12OMOpeCodi )
      {
         httpContext.GX_msglist.addItem("Ajustando rango de Operador");
         GX_FocusControl = edtavOmopecodi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV23TemporalOMOpeCod = AV12OMOpeCodi ;
         AV12OMOpeCodi = AV11OMOpeCodf ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OMOpeCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OMOpeCodi), 6, 0));
         AV11OMOpeCodf = AV23TemporalOMOpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11OMOpeCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11OMOpeCodf), 6, 0));
      }
      callWebObject(formatLink("app.ptrafin", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6OMCodi,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5OMCodf,8,0)),GXutil.URLEncode(GXutil.rtrim(AV8OMMaqCodI)),GXutil.URLEncode(GXutil.rtrim(AV7OMMaqCodF)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV10OMMCIni)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV9OMMCFin)),GXutil.URLEncode(GXutil.ltrimstr(AV12OMOpeCodi,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11OMOpeCodf,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15Detalle))}, new String[] {"EmprCod","OMCodi","OMCodf","OMMaqCodi","OMMaqCodf","OMMCIni","OMMCFin","OMOpeCodi","OMOpeCodf","Detalle"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   protected void nextLoad( )
   {
   }

   protected void e14YN2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_92_YN2( boolean wbgen )
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
         wb_table2_92_YN2e( true) ;
      }
      else
      {
         wb_table2_92_YN2e( false) ;
      }
   }

   public void wb_table1_14_YN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPaneldatos_Internalname, tblPaneldatos_Internalname, "", "TableHeader", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_ConsultaOrdenTrabajos.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOmcodi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOmcodi_Internalname, httpContext.getMessage( "Orden inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmcodi_Internalname, GXutil.ltrim( localUtil.ntoc( AV6OMCodi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOmcodi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6OMCodi), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6OMCodi), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmcodi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOmcodi_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOmcodf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOmcodf_Internalname, httpContext.getMessage( "final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmcodf_Internalname, GXutil.ltrim( localUtil.ntoc( AV5OMCodf, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOmcodf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5OMCodf), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5OMCodf), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmcodf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOmcodf_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedommaqcodi_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_ommaqcodi_Internalname, httpContext.getMessage( "Máquina inicial", ""), "", "", lblTextblockcombo_ommaqcodi_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_ommaqcodi.setProperty("Caption", Combo_ommaqcodi_Caption);
         ucCombo_ommaqcodi.setProperty("Cls", Combo_ommaqcodi_Cls);
         ucCombo_ommaqcodi.setProperty("EmptyItemText", Combo_ommaqcodi_Emptyitemtext);
         ucCombo_ommaqcodi.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucCombo_ommaqcodi.setProperty("DropDownOptionsData", AV24OMMaqCodI_Data);
         ucCombo_ommaqcodi.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_ommaqcodi_Internalname, "COMBO_OMMAQCODIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedommaqcodf_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_ommaqcodf_Internalname, httpContext.getMessage( "final", ""), "", "", lblTextblockcombo_ommaqcodf_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_ommaqcodf.setProperty("Caption", Combo_ommaqcodf_Caption);
         ucCombo_ommaqcodf.setProperty("Cls", Combo_ommaqcodf_Cls);
         ucCombo_ommaqcodf.setProperty("EmptyItemText", Combo_ommaqcodf_Emptyitemtext);
         ucCombo_ommaqcodf.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucCombo_ommaqcodf.setProperty("DropDownOptionsData", AV27OMMaqCodF_Data);
         ucCombo_ommaqcodf.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_ommaqcodf_Internalname, "COMBO_OMMAQCODFContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOmmcini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOmmcini_Internalname, httpContext.getMessage( "Fecha inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavOmmcini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmmcini_Internalname, localUtil.ttoc( AV10OMMCIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV10OMMCIni, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmmcini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOmmcini_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavOmmcini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavOmmcini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultaOrdenTrabajos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOmmcfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOmmcfin_Internalname, httpContext.getMessage( "final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavOmmcfin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmmcfin_Internalname, localUtil.ttoc( AV9OMMCFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV9OMMCFin, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmmcfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOmmcfin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavOmmcfin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavOmmcfin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultaOrdenTrabajos.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedomopecodi_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_omopecodi_Internalname, httpContext.getMessage( "Operario inicial", ""), "", "", lblTextblockcombo_omopecodi_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_omopecodi.setProperty("Caption", Combo_omopecodi_Caption);
         ucCombo_omopecodi.setProperty("Cls", Combo_omopecodi_Cls);
         ucCombo_omopecodi.setProperty("EmptyItemText", Combo_omopecodi_Emptyitemtext);
         ucCombo_omopecodi.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucCombo_omopecodi.setProperty("DropDownOptionsData", AV28OMOpeCodi_Data);
         ucCombo_omopecodi.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_omopecodi_Internalname, "COMBO_OMOPECODIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedomopecodf_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_omopecodf_Internalname, httpContext.getMessage( "final", ""), "", "", lblTextblockcombo_omopecodf_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_omopecodf.setProperty("Caption", Combo_omopecodf_Caption);
         ucCombo_omopecodf.setProperty("Cls", Combo_omopecodf_Cls);
         ucCombo_omopecodf.setProperty("EmptyItemText", Combo_omopecodf_Emptyitemtext);
         ucCombo_omopecodf.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucCombo_omopecodf.setProperty("DropDownOptionsData", AV29OMOpeCodf_Data);
         ucCombo_omopecodf.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_omopecodf_Internalname, "COMBO_OMOPECODFContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavDetalle.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDetalle.getInternalname(), httpContext.getMessage( "Detalle", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDetalle, cmbavDetalle.getInternalname(), GXutil.rtrim( AV15Detalle), 1, cmbavDetalle.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavDetalle.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_ConsultaOrdenTrabajos.htm");
         cmbavDetalle.setValue( GXutil.rtrim( AV15Detalle) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDetalle.getInternalname(), "Values", cmbavDetalle.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTab_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaOrdenTrabajos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_YN2e( true) ;
      }
      else
      {
         wb_table1_14_YN2e( false) ;
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
      paYN2( ) ;
      wsYN2( ) ;
      weYN2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263622121832", true, true);
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
      httpContext.AddJavascriptSource("consultaordentrabajos.js", "?20263622121832", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavOmcodi_Internalname = "vOMCODI" ;
      edtavOmcodf_Internalname = "vOMCODF" ;
      lblTextblockcombo_ommaqcodi_Internalname = "TEXTBLOCKCOMBO_OMMAQCODI" ;
      Combo_ommaqcodi_Internalname = "COMBO_OMMAQCODI" ;
      divTablesplittedommaqcodi_Internalname = "TABLESPLITTEDOMMAQCODI" ;
      lblTextblockcombo_ommaqcodf_Internalname = "TEXTBLOCKCOMBO_OMMAQCODF" ;
      Combo_ommaqcodf_Internalname = "COMBO_OMMAQCODF" ;
      divTablesplittedommaqcodf_Internalname = "TABLESPLITTEDOMMAQCODF" ;
      edtavOmmcini_Internalname = "vOMMCINI" ;
      edtavOmmcfin_Internalname = "vOMMCFIN" ;
      lblTextblockcombo_omopecodi_Internalname = "TEXTBLOCKCOMBO_OMOPECODI" ;
      Combo_omopecodi_Internalname = "COMBO_OMOPECODI" ;
      divTablesplittedomopecodi_Internalname = "TABLESPLITTEDOMOPECODI" ;
      lblTextblockcombo_omopecodf_Internalname = "TEXTBLOCKCOMBO_OMOPECODF" ;
      Combo_omopecodf_Internalname = "COMBO_OMOPECODF" ;
      divTablesplittedomopecodf_Internalname = "TABLESPLITTEDOMOPECODF" ;
      cmbavDetalle.setInternalname( "vDETALLE" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTab_Internalname = "TAB" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      grpUnnamedgroup1_Internalname = "UNNAMEDGROUP1" ;
      tblPaneldatos_Internalname = "PANELDATOS" ;
      Dvpanel_paneldatos_Internalname = "DVPANEL_PANELDATOS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavOmmaqcodi_Internalname = "vOMMAQCODI" ;
      edtavOmmaqcodf_Internalname = "vOMMAQCODF" ;
      edtavOmopecodi_Internalname = "vOMOPECODI" ;
      edtavOmopecodf_Internalname = "vOMOPECODF" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      cmbavDetalle.setJsonclick( "" );
      cmbavDetalle.setEnabled( 1 );
      Combo_omopecodf_Caption = "" ;
      Combo_omopecodi_Caption = "" ;
      edtavOmmcfin_Jsonclick = "" ;
      edtavOmmcfin_Enabled = 1 ;
      edtavOmmcini_Jsonclick = "" ;
      edtavOmmcini_Enabled = 1 ;
      Combo_ommaqcodf_Caption = "" ;
      Combo_ommaqcodi_Caption = "" ;
      edtavOmcodf_Jsonclick = "" ;
      edtavOmcodf_Enabled = 1 ;
      edtavOmcodi_Jsonclick = "" ;
      edtavOmcodi_Enabled = 1 ;
      edtavOmopecodf_Jsonclick = "" ;
      edtavOmopecodf_Visible = 1 ;
      edtavOmopecodi_Jsonclick = "" ;
      edtavOmopecodi_Visible = 1 ;
      edtavOmmaqcodf_Jsonclick = "" ;
      edtavOmmaqcodf_Visible = 1 ;
      edtavOmmaqcodi_Jsonclick = "" ;
      edtavOmmaqcodi_Visible = 1 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "Esta seguro?" ;
      Dvelop_confirmpanel_enter_Title = httpContext.getMessage( "Confirmar", "") ;
      Dvpanel_paneldatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Iconposition = "Right" ;
      Dvpanel_paneldatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_paneldatos_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_paneldatos_Cls = "PanelNoHeader" ;
      Dvpanel_paneldatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_paneldatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_paneldatos_Width = "100%" ;
      Combo_omopecodf_Emptyitemtext = "Todos" ;
      Combo_omopecodf_Cls = "ExtendedCombo AttributeFL" ;
      Combo_omopecodi_Emptyitemtext = "Todos" ;
      Combo_omopecodi_Cls = "ExtendedCombo AttributeFL" ;
      Combo_ommaqcodf_Emptyitemtext = "Todas" ;
      Combo_ommaqcodf_Cls = "ExtendedCombo AttributeFL" ;
      Combo_ommaqcodi_Emptyitemtext = "Todas" ;
      Combo_ommaqcodi_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta Orden de Trabajos", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDetalle.setName( "vDETALLE" );
      cmbavDetalle.setWebtags( "" );
      cmbavDetalle.addItem("", httpContext.getMessage( "GX_EmptyItemText", ""), (short)(0));
      cmbavDetalle.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbavDetalle.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbavDetalle.getItemCount() > 0 )
      {
         AV15Detalle = cmbavDetalle.getValidValue(AV15Detalle) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Detalle", AV15Detalle);
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
      setEventMetadata("ENTER","{handler:'e13YN2',iparms:[]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e11YN2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV6OMCodi',fld:'vOMCODI',pic:'ZZZZZZZ9'},{av:'AV5OMCodf',fld:'vOMCODF',pic:'ZZZZZZZ9'},{av:'AV7OMMaqCodF',fld:'vOMMAQCODF',pic:''},{av:'AV8OMMaqCodI',fld:'vOMMAQCODI',pic:''},{av:'AV9OMMCFin',fld:'vOMMCFIN',pic:'99/99/99 99:99'},{av:'AV10OMMCIni',fld:'vOMMCINI',pic:'99/99/99 99:99'},{av:'AV11OMOpeCodf',fld:'vOMOPECODF',pic:'ZZZZZ9'},{av:'AV12OMOpeCodi',fld:'vOMOPECODI',pic:'ZZZZZ9'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavDetalle'},{av:'AV15Detalle',fld:'vDETALLE',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV6OMCodi',fld:'vOMCODI',pic:'ZZZZZZZ9'},{av:'AV5OMCodf',fld:'vOMCODF',pic:'ZZZZZZZ9'},{av:'AV8OMMaqCodI',fld:'vOMMAQCODI',pic:''},{av:'AV7OMMaqCodF',fld:'vOMMAQCODF',pic:''},{av:'AV10OMMCIni',fld:'vOMMCINI',pic:'99/99/99 99:99'},{av:'AV9OMMCFin',fld:'vOMMCFIN',pic:'99/99/99 99:99'},{av:'AV12OMOpeCodi',fld:'vOMOPECODI',pic:'ZZZZZ9'},{av:'AV11OMOpeCodf',fld:'vOMOPECODF',pic:'ZZZZZ9'},{av:'cmbavDetalle'},{av:'AV15Detalle',fld:'vDETALLE',pic:''},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_omopecodf_Selectedvalue_get = "" ;
      Combo_omopecodi_Selectedvalue_get = "" ;
      Combo_ommaqcodf_Selectedvalue_get = "" ;
      Combo_ommaqcodi_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV25DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV24OMMaqCodI_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV27OMMaqCodF_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV28OMOpeCodi_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV29OMOpeCodf_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16EmprCod = "" ;
      Combo_ommaqcodi_Selectedvalue_set = "" ;
      Combo_ommaqcodf_Selectedvalue_set = "" ;
      Combo_omopecodi_Selectedvalue_set = "" ;
      Combo_omopecodf_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_paneldatos = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV8OMMaqCodI = "" ;
      AV7OMMaqCodF = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Detalle = "" ;
      AV10OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      AV9OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      AV13Station = "" ;
      AV17EmprNom = "" ;
      AV14UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      scmdbuf = "" ;
      H00YN2_A8482OpeAct = new String[] {""} ;
      H00YN2_n8482OpeAct = new boolean[] {false} ;
      H00YN2_A396EmprCod = new String[] {""} ;
      H00YN2_A653OpeNom = new String[] {""} ;
      H00YN2_n653OpeNom = new boolean[] {false} ;
      H00YN2_A652OpeCod = new int[1] ;
      A8482OpeAct = "" ;
      A396EmprCod = "" ;
      A653OpeNom = "" ;
      A13748OpeCNom = "" ;
      AV26Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      ucCombo_omopecodf = new com.genexus.webpanels.GXUserControl();
      H00YN3_A8482OpeAct = new String[] {""} ;
      H00YN3_n8482OpeAct = new boolean[] {false} ;
      H00YN3_A396EmprCod = new String[] {""} ;
      H00YN3_A653OpeNom = new String[] {""} ;
      H00YN3_n653OpeNom = new boolean[] {false} ;
      H00YN3_A652OpeCod = new int[1] ;
      ucCombo_omopecodi = new com.genexus.webpanels.GXUserControl();
      H00YN4_A607MaqEst = new String[] {""} ;
      H00YN4_n607MaqEst = new boolean[] {false} ;
      H00YN4_A396EmprCod = new String[] {""} ;
      H00YN4_A606MaqDsc = new String[] {""} ;
      H00YN4_n606MaqDsc = new boolean[] {false} ;
      H00YN4_A602MaqCod = new String[] {""} ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A13734MaqCDsc = "" ;
      ucCombo_ommaqcodf = new com.genexus.webpanels.GXUserControl();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      H00YN5_A607MaqEst = new String[] {""} ;
      H00YN5_n607MaqEst = new boolean[] {false} ;
      H00YN5_A396EmprCod = new String[] {""} ;
      H00YN5_A606MaqDsc = new String[] {""} ;
      H00YN5_n606MaqDsc = new boolean[] {false} ;
      H00YN5_A602MaqCod = new String[] {""} ;
      ucCombo_ommaqcodi = new com.genexus.webpanels.GXUserControl();
      AV21TemporalOMMaqCod = "" ;
      AV22TemporalOMMCIni = GXutil.resetTime( GXutil.nullDate() );
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_ommaqcodi_Jsonclick = "" ;
      lblTextblockcombo_ommaqcodf_Jsonclick = "" ;
      lblTextblockcombo_omopecodi_Jsonclick = "" ;
      lblTextblockcombo_omopecodf_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultaordentrabajos__default(),
         new Object[] {
             new Object[] {
            H00YN2_A8482OpeAct, H00YN2_n8482OpeAct, H00YN2_A396EmprCod, H00YN2_A653OpeNom, H00YN2_n653OpeNom, H00YN2_A652OpeCod
            }
            , new Object[] {
            H00YN3_A8482OpeAct, H00YN3_n8482OpeAct, H00YN3_A396EmprCod, H00YN3_A653OpeNom, H00YN3_n653OpeNom, H00YN3_A652OpeCod
            }
            , new Object[] {
            H00YN4_A607MaqEst, H00YN4_n607MaqEst, H00YN4_A396EmprCod, H00YN4_A606MaqDsc, H00YN4_n606MaqDsc, H00YN4_A602MaqCod
            }
            , new Object[] {
            H00YN5_A607MaqEst, H00YN5_n607MaqEst, H00YN5_A396EmprCod, H00YN5_A606MaqDsc, H00YN5_n606MaqDsc, H00YN5_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
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
   private int edtavOmmaqcodi_Visible ;
   private int edtavOmmaqcodf_Visible ;
   private int AV12OMOpeCodi ;
   private int edtavOmopecodi_Visible ;
   private int AV11OMOpeCodf ;
   private int edtavOmopecodf_Visible ;
   private int AV6OMCodi ;
   private int AV5OMCodf ;
   private int A652OpeCod ;
   private int AV20TemporalOMCod ;
   private int AV23TemporalOMOpeCod ;
   private int edtavOmcodi_Enabled ;
   private int edtavOmcodf_Enabled ;
   private int edtavOmmcini_Enabled ;
   private int edtavOmmcfin_Enabled ;
   private int idxLst ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_omopecodf_Selectedvalue_get ;
   private String Combo_omopecodi_Selectedvalue_get ;
   private String Combo_ommaqcodf_Selectedvalue_get ;
   private String Combo_ommaqcodi_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV16EmprCod ;
   private String Combo_ommaqcodi_Cls ;
   private String Combo_ommaqcodi_Selectedvalue_set ;
   private String Combo_ommaqcodi_Emptyitemtext ;
   private String Combo_ommaqcodf_Cls ;
   private String Combo_ommaqcodf_Selectedvalue_set ;
   private String Combo_ommaqcodf_Emptyitemtext ;
   private String Combo_omopecodi_Cls ;
   private String Combo_omopecodi_Selectedvalue_set ;
   private String Combo_omopecodi_Emptyitemtext ;
   private String Combo_omopecodf_Cls ;
   private String Combo_omopecodf_Selectedvalue_set ;
   private String Combo_omopecodf_Emptyitemtext ;
   private String Dvpanel_paneldatos_Width ;
   private String Dvpanel_paneldatos_Cls ;
   private String Dvpanel_paneldatos_Title ;
   private String Dvpanel_paneldatos_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_paneldatos_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String TempTags ;
   private String edtavOmmaqcodi_Internalname ;
   private String AV8OMMaqCodI ;
   private String edtavOmmaqcodi_Jsonclick ;
   private String edtavOmmaqcodf_Internalname ;
   private String AV7OMMaqCodF ;
   private String edtavOmmaqcodf_Jsonclick ;
   private String edtavOmopecodi_Internalname ;
   private String edtavOmopecodi_Jsonclick ;
   private String edtavOmopecodf_Internalname ;
   private String edtavOmopecodf_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavOmcodi_Internalname ;
   private String AV15Detalle ;
   private String edtavOmcodf_Internalname ;
   private String edtavOmmcini_Internalname ;
   private String edtavOmmcfin_Internalname ;
   private String AV13Station ;
   private String AV17EmprNom ;
   private String AV14UsurCod ;
   private String scmdbuf ;
   private String A8482OpeAct ;
   private String A396EmprCod ;
   private String A653OpeNom ;
   private String Combo_omopecodf_Internalname ;
   private String Combo_omopecodi_Internalname ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String Combo_ommaqcodf_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Combo_ommaqcodi_Internalname ;
   private String AV21TemporalOMMaqCod ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblPaneldatos_Internalname ;
   private String grpUnnamedgroup1_Internalname ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavOmcodi_Jsonclick ;
   private String edtavOmcodf_Jsonclick ;
   private String divTablesplittedommaqcodi_Internalname ;
   private String lblTextblockcombo_ommaqcodi_Internalname ;
   private String lblTextblockcombo_ommaqcodi_Jsonclick ;
   private String Combo_ommaqcodi_Caption ;
   private String divTablesplittedommaqcodf_Internalname ;
   private String lblTextblockcombo_ommaqcodf_Internalname ;
   private String lblTextblockcombo_ommaqcodf_Jsonclick ;
   private String Combo_ommaqcodf_Caption ;
   private String edtavOmmcini_Jsonclick ;
   private String edtavOmmcfin_Jsonclick ;
   private String divTablesplittedomopecodi_Internalname ;
   private String lblTextblockcombo_omopecodi_Internalname ;
   private String lblTextblockcombo_omopecodi_Jsonclick ;
   private String Combo_omopecodi_Caption ;
   private String divTablesplittedomopecodf_Internalname ;
   private String lblTextblockcombo_omopecodf_Internalname ;
   private String lblTextblockcombo_omopecodf_Jsonclick ;
   private String Combo_omopecodf_Caption ;
   private String divTab_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private java.util.Date AV10OMMCIni ;
   private java.util.Date AV9OMMCFin ;
   private java.util.Date AV22TemporalOMMCIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_paneldatos_Autowidth ;
   private boolean Dvpanel_paneldatos_Autoheight ;
   private boolean Dvpanel_paneldatos_Collapsible ;
   private boolean Dvpanel_paneldatos_Collapsed ;
   private boolean Dvpanel_paneldatos_Showcollapseicon ;
   private boolean Dvpanel_paneldatos_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String A13748OpeCNom ;
   private String A13734MaqCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_paneldatos ;
   private com.genexus.webpanels.GXUserControl ucCombo_omopecodf ;
   private com.genexus.webpanels.GXUserControl ucCombo_omopecodi ;
   private com.genexus.webpanels.GXUserControl ucCombo_ommaqcodf ;
   private com.genexus.webpanels.GXUserControl ucCombo_ommaqcodi ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private HTMLChoice cmbavDetalle ;
   private IDataStoreProvider pr_default ;
   private String[] H00YN2_A8482OpeAct ;
   private boolean[] H00YN2_n8482OpeAct ;
   private String[] H00YN2_A396EmprCod ;
   private String[] H00YN2_A653OpeNom ;
   private boolean[] H00YN2_n653OpeNom ;
   private int[] H00YN2_A652OpeCod ;
   private String[] H00YN3_A8482OpeAct ;
   private boolean[] H00YN3_n8482OpeAct ;
   private String[] H00YN3_A396EmprCod ;
   private String[] H00YN3_A653OpeNom ;
   private boolean[] H00YN3_n653OpeNom ;
   private int[] H00YN3_A652OpeCod ;
   private String[] H00YN4_A607MaqEst ;
   private boolean[] H00YN4_n607MaqEst ;
   private String[] H00YN4_A396EmprCod ;
   private String[] H00YN4_A606MaqDsc ;
   private boolean[] H00YN4_n606MaqDsc ;
   private String[] H00YN4_A602MaqCod ;
   private String[] H00YN5_A607MaqEst ;
   private boolean[] H00YN5_n607MaqEst ;
   private String[] H00YN5_A396EmprCod ;
   private String[] H00YN5_A606MaqDsc ;
   private boolean[] H00YN5_n606MaqDsc ;
   private String[] H00YN5_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24OMMaqCodI_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27OMMaqCodF_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV28OMOpeCodi_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV29OMOpeCodf_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV26Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV25DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultaordentrabajos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00YN2", "SELECT OpeAct, EmprCod, OpeNom, OpeCod FROM TXPOPERAR WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YN3", "SELECT OpeAct, EmprCod, OpeNom, OpeCod FROM TXPOPERAR WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YN4", "SELECT MaqEst, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YN5", "SELECT MaqEst, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

