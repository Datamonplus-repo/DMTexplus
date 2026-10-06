package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class programacionmaquinasdrop_impl extends GXDataArea
{
   public programacionmaquinasdrop_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public programacionmaquinasdrop_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( programacionmaquinasdrop_impl.class ));
   }

   public programacionmaquinasdrop_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
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
      paMZ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startMZ2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.programacionmaquinasdrop", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Emprcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV11DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV11DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODVISIBLE_DATA", AV19MaqCodVisible_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODVISIBLE_DATA", AV19MaqCodVisible_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODVISIBLE", AV18MaqCodVisible);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODVISIBLE", AV18MaqCodVisible);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Emprcod, "@!"))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCAR", AV31Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV30ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV30ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODVISIBLEJSON", AV20MaqCodVisibleJSon);
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Width", GXutil.rtrim( Dvpanel_panelasignacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Autowidth", GXutil.booltostr( Dvpanel_panelasignacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Autoheight", GXutil.booltostr( Dvpanel_panelasignacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Cls", GXutil.rtrim( Dvpanel_panelasignacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Title", GXutil.rtrim( Dvpanel_panelasignacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Collapsible", GXutil.booltostr( Dvpanel_panelasignacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Collapsed", GXutil.booltostr( Dvpanel_panelasignacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Showcollapseicon", GXutil.booltostr( Dvpanel_panelasignacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Iconposition", GXutil.rtrim( Dvpanel_panelasignacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELASIGNACION_Autoscroll", GXutil.booltostr( Dvpanel_panelasignacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Caption", GXutil.rtrim( Combo_maqcodvisible_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Cls", GXutil.rtrim( Combo_maqcodvisible_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Selectedvalue_set", GXutil.rtrim( Combo_maqcodvisible_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Allowmultipleselection", GXutil.booltostr( Combo_maqcodvisible_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Includeonlyselectedoption", GXutil.booltostr( Combo_maqcodvisible_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Multiplevaluestype", GXutil.rtrim( Combo_maqcodvisible_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Emptyitemtext", GXutil.rtrim( Combo_maqcodvisible_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Width", GXutil.rtrim( Dvpanel_panelprogramacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Autowidth", GXutil.booltostr( Dvpanel_panelprogramacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Autoheight", GXutil.booltostr( Dvpanel_panelprogramacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Cls", GXutil.rtrim( Dvpanel_panelprogramacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Title", GXutil.rtrim( Dvpanel_panelprogramacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Collapsible", GXutil.booltostr( Dvpanel_panelprogramacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Collapsed", GXutil.booltostr( Dvpanel_panelprogramacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Showcollapseicon", GXutil.booltostr( Dvpanel_panelprogramacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Iconposition", GXutil.rtrim( Dvpanel_panelprogramacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELPROGRAMACION_Autoscroll", GXutil.booltostr( Dvpanel_panelprogramacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODVISIBLE_Selectedvalue_get", GXutil.rtrim( Combo_maqcodvisible_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcwcprogramarhdrdrop == null ) )
      {
         WebComp_Wcwcprogramarhdrdrop.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcprogramacionmaquinas == null ) )
      {
         WebComp_Wcwcprogramacionmaquinas.componentjscripts();
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
         weMZ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtMZ2( ) ;
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
      return formatLink("app.programacionmaquinasdrop", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProgramacionMaquinasDrop" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programacion Maquinas Drop", "") ;
   }

   public void wbMZ0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", divTablemain_Class, "left", "top", "", "", "div");
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
         ucDvpanel_panelasignacion.setProperty("Width", Dvpanel_panelasignacion_Width);
         ucDvpanel_panelasignacion.setProperty("AutoWidth", Dvpanel_panelasignacion_Autowidth);
         ucDvpanel_panelasignacion.setProperty("AutoHeight", Dvpanel_panelasignacion_Autoheight);
         ucDvpanel_panelasignacion.setProperty("Cls", Dvpanel_panelasignacion_Cls);
         ucDvpanel_panelasignacion.setProperty("Title", Dvpanel_panelasignacion_Title);
         ucDvpanel_panelasignacion.setProperty("Collapsible", Dvpanel_panelasignacion_Collapsible);
         ucDvpanel_panelasignacion.setProperty("Collapsed", Dvpanel_panelasignacion_Collapsed);
         ucDvpanel_panelasignacion.setProperty("ShowCollapseIcon", Dvpanel_panelasignacion_Showcollapseicon);
         ucDvpanel_panelasignacion.setProperty("IconPosition", Dvpanel_panelasignacion_Iconposition);
         ucDvpanel_panelasignacion.setProperty("AutoScroll", Dvpanel_panelasignacion_Autoscroll);
         ucDvpanel_panelasignacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelasignacion_Internalname, "DVPANEL_PANELASIGNACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELASIGNACIONContainer"+"PanelAsignacion"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelasignacion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0020"+"", GXutil.rtrim( WebComp_Wcwcprogramarhdrdrop_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0020"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcprogramarhdrdrop_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcprogramarhdrdrop), GXutil.lower( WebComp_Wcwcprogramarhdrdrop_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0020"+"");
               }
               WebComp_Wcwcprogramarhdrdrop.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcprogramarhdrdrop), GXutil.lower( WebComp_Wcwcprogramarhdrdrop_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelprogramacion.setProperty("Width", Dvpanel_panelprogramacion_Width);
         ucDvpanel_panelprogramacion.setProperty("AutoWidth", Dvpanel_panelprogramacion_Autowidth);
         ucDvpanel_panelprogramacion.setProperty("AutoHeight", Dvpanel_panelprogramacion_Autoheight);
         ucDvpanel_panelprogramacion.setProperty("Cls", Dvpanel_panelprogramacion_Cls);
         ucDvpanel_panelprogramacion.setProperty("Title", Dvpanel_panelprogramacion_Title);
         ucDvpanel_panelprogramacion.setProperty("Collapsible", Dvpanel_panelprogramacion_Collapsible);
         ucDvpanel_panelprogramacion.setProperty("Collapsed", Dvpanel_panelprogramacion_Collapsed);
         ucDvpanel_panelprogramacion.setProperty("ShowCollapseIcon", Dvpanel_panelprogramacion_Showcollapseicon);
         ucDvpanel_panelprogramacion.setProperty("IconPosition", Dvpanel_panelprogramacion_Iconposition);
         ucDvpanel_panelprogramacion.setProperty("AutoScroll", Dvpanel_panelprogramacion_Autoscroll);
         ucDvpanel_panelprogramacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelprogramacion_Internalname, "DVPANEL_PANELPROGRAMACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELPROGRAMACIONContainer"+"PanelProgramacion"+"\" style=\"display:none;\">") ;
         wb_table1_25_MZ2( true) ;
      }
      else
      {
         wb_table1_25_MZ2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_MZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
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

   public void startMZ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Programacion Maquinas Drop", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupMZ0( ) ;
   }

   public void wsMZ2( )
   {
      startMZ2( ) ;
      evtMZ2( ) ;
   }

   public void evtMZ2( )
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
                           e11MZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPdf' */
                           e12MZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e13MZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14MZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e15MZ2 ();
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
                     if ( nCmpId == 20 )
                     {
                        OldWcwcprogramarhdrdrop = httpContext.cgiGet( "W0020") ;
                        if ( ( GXutil.len( OldWcwcprogramarhdrdrop) == 0 ) || ( GXutil.strcmp(OldWcwcprogramarhdrdrop, WebComp_Wcwcprogramarhdrdrop_Component) != 0 ) )
                        {
                           WebComp_Wcwcprogramarhdrdrop = WebUtils.getWebComponent(getClass(), "app." + OldWcwcprogramarhdrdrop + "_impl", remoteHandle, context);
                           WebComp_Wcwcprogramarhdrdrop_Component = OldWcwcprogramarhdrdrop ;
                        }
                        if ( GXutil.len( WebComp_Wcwcprogramarhdrdrop_Component) != 0 )
                        {
                           WebComp_Wcwcprogramarhdrdrop.componentprocess("W0020", "", sEvt);
                        }
                        WebComp_Wcwcprogramarhdrdrop_Component = OldWcwcprogramarhdrdrop ;
                     }
                     else if ( nCmpId == 45 )
                     {
                        OldWcwcprogramacionmaquinas = httpContext.cgiGet( "W0045") ;
                        if ( ( GXutil.len( OldWcwcprogramacionmaquinas) == 0 ) || ( GXutil.strcmp(OldWcwcprogramacionmaquinas, WebComp_Wcwcprogramacionmaquinas_Component) != 0 ) )
                        {
                           WebComp_Wcwcprogramacionmaquinas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcprogramacionmaquinas + "_impl", remoteHandle, context);
                           WebComp_Wcwcprogramacionmaquinas_Component = OldWcwcprogramacionmaquinas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcprogramacionmaquinas_Component) != 0 )
                        {
                           WebComp_Wcwcprogramacionmaquinas.componentprocess("W0045", "", sEvt);
                        }
                        WebComp_Wcwcprogramacionmaquinas_Component = OldWcwcprogramacionmaquinas ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weMZ2( )
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

   public void paMZ2( )
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
      rfMZ2( ) ;
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

   public void rfMZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e13MZ2 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcprogramarhdrdrop_Component) != 0 )
            {
               WebComp_Wcwcprogramarhdrdrop.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcprogramacionmaquinas_Component) != 0 )
            {
               WebComp_Wcwcprogramacionmaquinas.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e15MZ2 ();
         wbMZ0( ) ;
      }
   }

   public void send_integrity_lvl_hashesMZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Emprcod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupMZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11MZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV11DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODVISIBLE_DATA"), AV19MaqCodVisible_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODVISIBLE"), AV18MaqCodVisible);
         /* Read saved values. */
         AV20MaqCodVisibleJSon = httpContext.cgiGet( "vMAQCODVISIBLEJSON") ;
         Dvpanel_panelasignacion_Width = httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Width") ;
         Dvpanel_panelasignacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Autowidth")) ;
         Dvpanel_panelasignacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Autoheight")) ;
         Dvpanel_panelasignacion_Cls = httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Cls") ;
         Dvpanel_panelasignacion_Title = httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Title") ;
         Dvpanel_panelasignacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Collapsible")) ;
         Dvpanel_panelasignacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Collapsed")) ;
         Dvpanel_panelasignacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Showcollapseicon")) ;
         Dvpanel_panelasignacion_Iconposition = httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Iconposition") ;
         Dvpanel_panelasignacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELASIGNACION_Autoscroll")) ;
         Combo_maqcodvisible_Caption = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Caption") ;
         Combo_maqcodvisible_Cls = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Cls") ;
         Combo_maqcodvisible_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Selectedvalue_set") ;
         Combo_maqcodvisible_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Allowmultipleselection")) ;
         Combo_maqcodvisible_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Includeonlyselectedoption")) ;
         Combo_maqcodvisible_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Multiplevaluestype") ;
         Combo_maqcodvisible_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCODVISIBLE_Emptyitemtext") ;
         Dvpanel_panelprogramacion_Width = httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Width") ;
         Dvpanel_panelprogramacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Autowidth")) ;
         Dvpanel_panelprogramacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Autoheight")) ;
         Dvpanel_panelprogramacion_Cls = httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Cls") ;
         Dvpanel_panelprogramacion_Title = httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Title") ;
         Dvpanel_panelprogramacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Collapsible")) ;
         Dvpanel_panelprogramacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Collapsed")) ;
         Dvpanel_panelprogramacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Showcollapseicon")) ;
         Dvpanel_panelprogramacion_Iconposition = httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Iconposition") ;
         Dvpanel_panelprogramacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELPROGRAMACION_Autoscroll")) ;
         /* Read variables values. */
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
      e11MZ2 ();
      if (returnInSub) return;
   }

   public void e11MZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Emprcod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      programacionmaquinasdrop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Emprcod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Emprcod", AV12Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Emprcod, "@!"))));
      GXt_char1 = AV24PrefijoMaqCod ;
      GXv_char2[0] = AV12Emprcod ;
      GXv_char3[0] = "MQPLTI" ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      programacionmaquinasdrop_impl.this.AV12Emprcod = GXv_char2[0] ;
      programacionmaquinasdrop_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Emprcod", AV12Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Emprcod, "@!"))));
      AV24PrefijoMaqCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24PrefijoMaqCod", AV24PrefijoMaqCod);
      if ( (GXutil.strcmp("", AV24PrefijoMaqCod)==0) )
      {
         AV24PrefijoMaqCod = "TN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24PrefijoMaqCod", AV24PrefijoMaqCod);
      }
      Combo_maqcodvisible_Caption = "Maquinas con Prefijo: "+AV24PrefijoMaqCod ;
      ucCombo_maqcodvisible.sendProperty(context, "", false, Combo_maqcodvisible_Internalname, "Caption", Combo_maqcodvisible_Caption);
      AV24PrefijoMaqCod += "%" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24PrefijoMaqCod", AV24PrefijoMaqCod);
      GXt_char1 = AV34Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      programacionmaquinasdrop_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34Station = GXt_char1 ;
      GXv_char4[0] = AV12Emprcod ;
      GXv_char3[0] = AV35Emprnom ;
      GXv_char2[0] = AV36Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char4, GXv_char3, GXv_char2) ;
      programacionmaquinasdrop_impl.this.AV12Emprcod = GXv_char4[0] ;
      programacionmaquinasdrop_impl.this.AV35Emprnom = GXv_char3[0] ;
      programacionmaquinasdrop_impl.this.AV36Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Emprcod", AV12Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Emprcod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV11DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV11DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      /* Execute user subroutine: 'LOADCOMBOMAQCODVISIBLE' */
      S112 ();
      if (returnInSub) return;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcprogramacionmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcprogramacionmaquinas_Component), GXutil.lower( "WCProgramacionMaquinas")) != 0 )
      {
         WebComp_Wcwcprogramacionmaquinas = WebUtils.getWebComponent(getClass(), "app.wcprogramacionmaquinas_impl", remoteHandle, context);
         WebComp_Wcwcprogramacionmaquinas_Component = "WCProgramacionMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wcwcprogramacionmaquinas_Component) != 0 )
      {
         WebComp_Wcwcprogramacionmaquinas.setjustcreated();
         WebComp_Wcwcprogramacionmaquinas.componentprepare(new Object[] {"W0045","",AV20MaqCodVisibleJSon});
         WebComp_Wcwcprogramacionmaquinas.componentbind(new Object[] {""});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcprogramarhdrdrop = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcprogramarhdrdrop_Component), GXutil.lower( "WCProgramarHdrDrop")) != 0 )
      {
         WebComp_Wcwcprogramarhdrdrop = WebUtils.getWebComponent(getClass(), "app.wcprogramarhdrdrop_impl", remoteHandle, context);
         WebComp_Wcwcprogramarhdrdrop_Component = "WCProgramarHdrDrop" ;
      }
      if ( GXutil.len( WebComp_Wcwcprogramarhdrdrop_Component) != 0 )
      {
         WebComp_Wcwcprogramarhdrdrop.setjustcreated();
         WebComp_Wcwcprogramarhdrdrop.componentprepare(new Object[] {"W0020",""});
         WebComp_Wcwcprogramarhdrdrop.componentbind(new Object[] {});
      }
      bttBtnpdf_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnpdf_Internalname, "Caption", bttBtnpdf_Caption, true);
      divTablemain_Class = "TableContent" ;
      httpContext.ajax_rsp_assign_prop("", false, divTablemain_Internalname, "Class", divTablemain_Class, true);
   }

   public void e12MZ2( )
   {
      /* 'DoPdf' Routine */
      returnInSub = false ;
      AV28WebSession.setValue(httpContext.getMessage( "ProgramacionMaquinas_MaquinasVisibles", ""), AV18MaqCodVisible.toJSonString(false));
      /* Window Datatype Object Property */
      AV29window.setUrl( formatLink("app.programacionmaquinaspdf", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12Emprcod))}, new String[] {"EmprCod"})  );
      AV29window.setReturnParms(new Object[] {"AV12Emprcod",});
      AV29window.setHeight( 600 );
      AV29window.setWidth( 800 );
      httpContext.newWindow(AV29window);
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCODVISIBLE' Routine */
      returnInSub = false ;
      lV24PrefijoMaqCod = GXutil.padr( GXutil.rtrim( AV24PrefijoMaqCod), 6, "%") ;
      /* Using cursor H00MZ2 */
      pr_default.execute(0, new Object[] {lV24PrefijoMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H00MZ2_A396EmprCod[0] ;
         A620MaqTip = H00MZ2_A620MaqTip[0] ;
         n620MaqTip = H00MZ2_n620MaqTip[0] ;
         A6432MaqPln = H00MZ2_A6432MaqPln[0] ;
         n6432MaqPln = H00MZ2_n6432MaqPln[0] ;
         A607MaqEst = H00MZ2_A607MaqEst[0] ;
         n607MaqEst = H00MZ2_n607MaqEst[0] ;
         A606MaqDsc = H00MZ2_A606MaqDsc[0] ;
         n606MaqDsc = H00MZ2_n606MaqDsc[0] ;
         A602MaqCod = H00MZ2_A602MaqCod[0] ;
         if ( new app.maquinaconhdr(remoteHandle, context).executeUdp( A396EmprCod, A602MaqCod) )
         {
            A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
            AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
            AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
            AV19MaqCodVisible_Data.add(AV9Combo_DataItem, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_maqcodvisible_Selectedvalue_set = AV18MaqCodVisible.toJSonString(false) ;
      ucCombo_maqcodvisible.sendProperty(context, "", false, Combo_maqcodvisible_Internalname, "SelectedValue_set", Combo_maqcodvisible_Selectedvalue_set);
      AV20MaqCodVisibleJSon = AV18MaqCodVisible.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20MaqCodVisibleJSon", AV20MaqCodVisibleJSon);
   }

   public void e13MZ2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      AV20MaqCodVisibleJSon = AV18MaqCodVisible.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20MaqCodVisibleJSon", AV20MaqCodVisibleJSon);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcprogramacionmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcprogramacionmaquinas_Component), GXutil.lower( "WCProgramacionMaquinas")) != 0 )
      {
         WebComp_Wcwcprogramacionmaquinas = WebUtils.getWebComponent(getClass(), "app.wcprogramacionmaquinas_impl", remoteHandle, context);
         WebComp_Wcwcprogramacionmaquinas_Component = "WCProgramacionMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wcwcprogramacionmaquinas_Component) != 0 )
      {
         WebComp_Wcwcprogramacionmaquinas.setjustcreated();
         WebComp_Wcwcprogramacionmaquinas.componentprepare(new Object[] {"W0045","",AV20MaqCodVisibleJSon});
         WebComp_Wcwcprogramacionmaquinas.componentbind(new Object[] {""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcprogramacionmaquinas )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0045"+"");
         WebComp_Wcwcprogramacionmaquinas.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e14MZ2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV30ObjetoRefrescar.indexof("WCProgramacionMaquinas") > 0 ) && AV31Refrescar )
      {
         AV20MaqCodVisibleJSon = AV18MaqCodVisible.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20MaqCodVisibleJSon", AV20MaqCodVisibleJSon);
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcwcprogramacionmaquinas = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcprogramacionmaquinas_Component), GXutil.lower( "WCProgramacionMaquinas")) != 0 )
         {
            WebComp_Wcwcprogramacionmaquinas = WebUtils.getWebComponent(getClass(), "app.wcprogramacionmaquinas_impl", remoteHandle, context);
            WebComp_Wcwcprogramacionmaquinas_Component = "WCProgramacionMaquinas" ;
         }
         if ( GXutil.len( WebComp_Wcwcprogramacionmaquinas_Component) != 0 )
         {
            WebComp_Wcwcprogramacionmaquinas.setjustcreated();
            WebComp_Wcwcprogramacionmaquinas.componentprepare(new Object[] {"W0045","",AV20MaqCodVisibleJSon});
            WebComp_Wcwcprogramacionmaquinas.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcprogramacionmaquinas )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0045"+"");
            WebComp_Wcwcprogramacionmaquinas.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e15MZ2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_25_MZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPanelprogramacion_Internalname, tblPanelprogramacion_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablafiltro_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodvisible_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcodvisible_Internalname, httpContext.getMessage( "Máquinas", ""), "", "", lblTextblockcombo_maqcodvisible_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProgramacionMaquinasDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcodvisible.setProperty("Caption", Combo_maqcodvisible_Caption);
         ucCombo_maqcodvisible.setProperty("Cls", Combo_maqcodvisible_Cls);
         ucCombo_maqcodvisible.setProperty("AllowMultipleSelection", Combo_maqcodvisible_Allowmultipleselection);
         ucCombo_maqcodvisible.setProperty("IncludeOnlySelectedOption", Combo_maqcodvisible_Includeonlyselectedoption);
         ucCombo_maqcodvisible.setProperty("MultipleValuesType", Combo_maqcodvisible_Multiplevaluestype);
         ucCombo_maqcodvisible.setProperty("EmptyItemText", Combo_maqcodvisible_Emptyitemtext);
         ucCombo_maqcodvisible.setProperty("DropDownOptionsTitleSettingsIcons", AV11DDO_TitleSettingsIcons);
         ucCombo_maqcodvisible.setProperty("DropDownOptionsData", AV19MaqCodVisible_Data);
         ucCombo_maqcodvisible.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodvisible_Internalname, "COMBO_MAQCODVISIBLEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         ClassString = "BtnExportReport" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", bttBtnpdf_Caption, bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProgramacionMaquinasDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablawc_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0045"+"", GXutil.rtrim( WebComp_Wcwcprogramacionmaquinas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0045"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcprogramacionmaquinas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcprogramacionmaquinas), GXutil.lower( WebComp_Wcwcprogramacionmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0045"+"");
               }
               WebComp_Wcwcprogramacionmaquinas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcprogramacionmaquinas), GXutil.lower( WebComp_Wcwcprogramacionmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_MZ2e( true) ;
      }
      else
      {
         wb_table1_25_MZ2e( false) ;
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
      paMZ2( ) ;
      wsMZ2( ) ;
      weMZ2( ) ;
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
      if ( ! ( WebComp_Wcwcprogramarhdrdrop == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcprogramarhdrdrop_Component) != 0 )
         {
            WebComp_Wcwcprogramarhdrdrop.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcprogramacionmaquinas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcprogramacionmaquinas_Component) != 0 )
         {
            WebComp_Wcwcprogramacionmaquinas.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171419447", true, true);
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
      httpContext.AddJavascriptSource("programacionmaquinasdrop.js", "?20268171419447", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      divPanelasignacion_Internalname = "PANELASIGNACION" ;
      Dvpanel_panelasignacion_Internalname = "DVPANEL_PANELASIGNACION" ;
      lblTextblockcombo_maqcodvisible_Internalname = "TEXTBLOCKCOMBO_MAQCODVISIBLE" ;
      Combo_maqcodvisible_Internalname = "COMBO_MAQCODVISIBLE" ;
      divTablesplittedmaqcodvisible_Internalname = "TABLESPLITTEDMAQCODVISIBLE" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      divTablafiltro_Internalname = "TABLAFILTRO" ;
      divTablawc_Internalname = "TABLAWC" ;
      tblPanelprogramacion_Internalname = "PANELPROGRAMACION" ;
      Dvpanel_panelprogramacion_Internalname = "DVPANEL_PANELPROGRAMACION" ;
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
      bttBtnpdf_Caption = httpContext.getMessage( "PDF", "") ;
      divTablemain_Class = "TableMain" ;
      Dvpanel_panelprogramacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelprogramacion_Iconposition = "Right" ;
      Dvpanel_panelprogramacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelprogramacion_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelprogramacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelprogramacion_Title = httpContext.getMessage( "Visualizar", "") ;
      Dvpanel_panelprogramacion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelprogramacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelprogramacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelprogramacion_Width = "100%" ;
      Combo_maqcodvisible_Emptyitemtext = "(todas)" ;
      Combo_maqcodvisible_Multiplevaluestype = "Tags" ;
      Combo_maqcodvisible_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_maqcodvisible_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_maqcodvisible_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcodvisible_Caption = "" ;
      Dvpanel_panelasignacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelasignacion_Iconposition = "Right" ;
      Dvpanel_panelasignacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelasignacion_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelasignacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelasignacion_Title = httpContext.getMessage( "Asignación", "") ;
      Dvpanel_panelasignacion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelasignacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelasignacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelasignacion_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Programacion Maquinas Drop", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV18MaqCodVisible',fld:'vMAQCODVISIBLE',pic:''},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20MaqCodVisibleJSon',fld:'vMAQCODVISIBLEJSON',pic:''},{ctrl:'WCWCPROGRAMACIONMAQUINAS'}]}");
      setEventMetadata("'DOPDF'","{handler:'e12MZ2',iparms:[{av:'AV18MaqCodVisible',fld:'vMAQCODVISIBLE',pic:''},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'DOPDF'",",oparms:[]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e14MZ2',iparms:[{av:'AV31Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV30ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV18MaqCodVisible',fld:'vMAQCODVISIBLE',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[{av:'AV20MaqCodVisibleJSon',fld:'vMAQCODVISIBLEJSON',pic:''},{ctrl:'WCWCPROGRAMACIONMAQUINAS'}]}");
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
      Combo_maqcodvisible_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV12Emprcod = "" ;
      GXKey = "" ;
      AV11DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV19MaqCodVisible_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18MaqCodVisible = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20MaqCodVisibleJSon = "" ;
      Combo_maqcodvisible_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelasignacion = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcprogramarhdrdrop_Component = "" ;
      OldWcwcprogramarhdrdrop = "" ;
      ucDvpanel_panelprogramacion = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      OldWcwcprogramacionmaquinas = "" ;
      WebComp_Wcwcprogramacionmaquinas_Component = "" ;
      AV24PrefijoMaqCod = "" ;
      ucCombo_maqcodvisible = new com.genexus.webpanels.GXUserControl();
      AV34Station = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV35Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV36Usurcod = "" ;
      GXv_char2 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV28WebSession = httpContext.getWebSession();
      AV29window = new com.genexus.webpanels.GXWindow();
      lV24PrefijoMaqCod = "" ;
      scmdbuf = "" ;
      H00MZ2_A396EmprCod = new String[] {""} ;
      H00MZ2_A620MaqTip = new String[] {""} ;
      H00MZ2_n620MaqTip = new boolean[] {false} ;
      H00MZ2_A6432MaqPln = new byte[1] ;
      H00MZ2_n6432MaqPln = new boolean[] {false} ;
      H00MZ2_A607MaqEst = new String[] {""} ;
      H00MZ2_n607MaqEst = new boolean[] {false} ;
      H00MZ2_A606MaqDsc = new String[] {""} ;
      H00MZ2_n606MaqDsc = new boolean[] {false} ;
      H00MZ2_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A620MaqTip = "" ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A13734MaqCDsc = "" ;
      AV9Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      sStyleString = "" ;
      lblTextblockcombo_maqcodvisible_Jsonclick = "" ;
      TempTags = "" ;
      bttBtnpdf_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.programacionmaquinasdrop__default(),
         new Object[] {
             new Object[] {
            H00MZ2_A396EmprCod, H00MZ2_A620MaqTip, H00MZ2_n620MaqTip, H00MZ2_A6432MaqPln, H00MZ2_n6432MaqPln, H00MZ2_A607MaqEst, H00MZ2_n607MaqEst, H00MZ2_A606MaqDsc, H00MZ2_n606MaqDsc, H00MZ2_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcprogramarhdrdrop = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcprogramacionmaquinas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte A6432MaqPln ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int idxLst ;
   private String Combo_maqcodvisible_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV12Emprcod ;
   private String GXKey ;
   private String Dvpanel_panelasignacion_Width ;
   private String Dvpanel_panelasignacion_Cls ;
   private String Dvpanel_panelasignacion_Title ;
   private String Dvpanel_panelasignacion_Iconposition ;
   private String Combo_maqcodvisible_Caption ;
   private String Combo_maqcodvisible_Cls ;
   private String Combo_maqcodvisible_Selectedvalue_set ;
   private String Combo_maqcodvisible_Multiplevaluestype ;
   private String Combo_maqcodvisible_Emptyitemtext ;
   private String Dvpanel_panelprogramacion_Width ;
   private String Dvpanel_panelprogramacion_Cls ;
   private String Dvpanel_panelprogramacion_Title ;
   private String Dvpanel_panelprogramacion_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablemain_Class ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelasignacion_Internalname ;
   private String divPanelasignacion_Internalname ;
   private String WebComp_Wcwcprogramarhdrdrop_Component ;
   private String OldWcwcprogramarhdrdrop ;
   private String Dvpanel_panelprogramacion_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String OldWcwcprogramacionmaquinas ;
   private String WebComp_Wcwcprogramacionmaquinas_Component ;
   private String AV24PrefijoMaqCod ;
   private String Combo_maqcodvisible_Internalname ;
   private String AV34Station ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV35Emprnom ;
   private String GXv_char3[] ;
   private String AV36Usurcod ;
   private String GXv_char2[] ;
   private String bttBtnpdf_Caption ;
   private String bttBtnpdf_Internalname ;
   private String lV24PrefijoMaqCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A620MaqTip ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String sStyleString ;
   private String tblPanelprogramacion_Internalname ;
   private String divTablafiltro_Internalname ;
   private String divTablesplittedmaqcodvisible_Internalname ;
   private String lblTextblockcombo_maqcodvisible_Internalname ;
   private String lblTextblockcombo_maqcodvisible_Jsonclick ;
   private String TempTags ;
   private String bttBtnpdf_Jsonclick ;
   private String divTablawc_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV31Refrescar ;
   private boolean Dvpanel_panelasignacion_Autowidth ;
   private boolean Dvpanel_panelasignacion_Autoheight ;
   private boolean Dvpanel_panelasignacion_Collapsible ;
   private boolean Dvpanel_panelasignacion_Collapsed ;
   private boolean Dvpanel_panelasignacion_Showcollapseicon ;
   private boolean Dvpanel_panelasignacion_Autoscroll ;
   private boolean Combo_maqcodvisible_Allowmultipleselection ;
   private boolean Combo_maqcodvisible_Includeonlyselectedoption ;
   private boolean Dvpanel_panelprogramacion_Autowidth ;
   private boolean Dvpanel_panelprogramacion_Autoheight ;
   private boolean Dvpanel_panelprogramacion_Collapsible ;
   private boolean Dvpanel_panelprogramacion_Collapsed ;
   private boolean Dvpanel_panelprogramacion_Showcollapseicon ;
   private boolean Dvpanel_panelprogramacion_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcprogramacionmaquinas ;
   private boolean bDynCreated_Wcwcprogramarhdrdrop ;
   private boolean n620MaqTip ;
   private boolean n6432MaqPln ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV20MaqCodVisibleJSon ;
   private String A13734MaqCDsc ;
   private com.genexus.webpanels.GXWindow AV29window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcprogramarhdrdrop ;
   private GXWebComponent WebComp_Wcwcprogramacionmaquinas ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelasignacion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelprogramacion ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodvisible ;
   private IDataStoreProvider pr_default ;
   private String[] H00MZ2_A396EmprCod ;
   private String[] H00MZ2_A620MaqTip ;
   private boolean[] H00MZ2_n620MaqTip ;
   private byte[] H00MZ2_A6432MaqPln ;
   private boolean[] H00MZ2_n6432MaqPln ;
   private String[] H00MZ2_A607MaqEst ;
   private boolean[] H00MZ2_n607MaqEst ;
   private String[] H00MZ2_A606MaqDsc ;
   private boolean[] H00MZ2_n606MaqDsc ;
   private String[] H00MZ2_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV28WebSession ;
   private GXSimpleCollection<String> AV18MaqCodVisible ;
   private GXSimpleCollection<String> AV30ObjetoRefrescar ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19MaqCodVisible_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV9Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV11DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class programacionmaquinasdrop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00MZ2", "SELECT EmprCod, MaqTip, MaqPln, MaqEst, MaqDsc, MaqCod FROM TXPMAQUIN WHERE (MaqCod like ?) AND (MaqEst = 'A') AND (MaqPln = 1) AND (MaqTip = 'E') ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
      }
   }

}

