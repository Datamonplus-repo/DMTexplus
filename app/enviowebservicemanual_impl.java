package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class enviowebservicemanual_impl extends GXDataArea
{
   public enviowebservicemanual_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public enviowebservicemanual_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviowebservicemanual_impl.class ));
   }

   public enviowebservicemanual_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipoguia = new HTMLChoice();
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
      pa2AM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2AM2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.enviowebservicemanual", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Nows), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRI", GXutil.rtrim( A39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV8AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFMD", A10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFECSAL", localUtil.dtoc( A4023AlbFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCOD", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMHOR", localUtil.ttoc( A4829AlbComHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMID", GXutil.rtrim( A10740AlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEAT", GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENCOD", GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVATCODEI", GXutil.rtrim( A10737DevATCodeI));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVENVAT", GXutil.ltrim( localUtil.ntoc( A10736DevEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALCODEID", GXutil.rtrim( A10742SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "SALENVAT", GXutil.ltrim( localUtil.ntoc( A10741SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROID", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROIDAT", GXutil.rtrim( A13436AlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSTAT", GXutil.ltrim( localUtil.ntoc( A13438AlbProStAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD", GXutil.ltrim( localUtil.ntoc( AV10Calprd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCOM", GXutil.ltrim( localUtil.ntoc( AV26Calcom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVGEN", GXutil.ltrim( localUtil.ntoc( AV11DevGen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCESTSA", GXutil.ltrim( localUtil.ntoc( AV12Cestsa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRO", GXutil.ltrim( localUtil.ntoc( AV13calpro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLIC", GXutil.rtrim( AV7ALbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAGE", AV9Mensage);
      app.GxWebStd.gx_hidden_field( httpContext, "vNOWS", GXutil.ltrim( localUtil.ntoc( AV22Nows, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Nows), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV18ALbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBFECSAL", localUtil.dtoc( AV20AlbFecSal, 0, "/"));
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
         we2AM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2AM2( ) ;
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
      return formatLink("app.enviowebservicemanual", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "EnvioWebserviceManual" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envio Webservice Manual", "") ;
   }

   public void wb2AM0( )
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
         app.GxWebStd.gx_div_start( httpContext, divDivheader_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "header");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableform_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipoguia.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipoguia.getInternalname(), httpContext.getMessage( "Guia Remessa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipoguia, cmbavTipoguia.getInternalname(), GXutil.trim( GXutil.str( AV5TipoGuia, 1, 0)), 1, cmbavTipoguia.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTipoguia.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "", true, (byte)(0), "HLP_EnvioWebserviceManual.htm");
         cmbavTipoguia.setValue( GXutil.trim( GXutil.str( AV5TipoGuia, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoguia.getInternalname(), "Values", cmbavTipoguia.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nmr ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EnvioWebserviceManual.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "CellPaddingTop10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviowebservice_Internalname, "", httpContext.getMessage( "Envio WEBSERVICE", ""), bttBtnenviowebservice_Jsonclick, 5, httpContext.getMessage( "Envio WEBSERVICE", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOENVIOWEBSERVICE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EnvioWebserviceManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "header");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnvioWebserviceManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2AM2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Envio Webservice Manual", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2AM0( ) ;
   }

   public void ws2AM2( )
   {
      start2AM2( ) ;
      evt2AM2( ) ;
   }

   public void evt2AM2( )
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
                           e112AM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOENVIOWEBSERVICE'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEnvioWebService' */
                           e122AM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e132AM2 ();
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

   public void we2AM2( )
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

   public void pa2AM2( )
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
            GX_FocusControl = cmbavTipoguia.getInternalname() ;
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
      if ( cmbavTipoguia.getItemCount() > 0 )
      {
         AV5TipoGuia = (byte)(GXutil.lval( cmbavTipoguia.getValidValue(GXutil.trim( GXutil.str( AV5TipoGuia, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5TipoGuia", GXutil.str( AV5TipoGuia, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipoguia.setValue( GXutil.trim( GXutil.str( AV5TipoGuia, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoguia.getInternalname(), "Values", cmbavTipoguia.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2AM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV29Pgmname = "EnvioWebserviceManual" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2AM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e132AM2 ();
         wb2AM0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2AM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vNOWS", GXutil.ltrim( localUtil.ntoc( AV22Nows, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Nows), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV29Pgmname = "EnvioWebserviceManual" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2AM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112AM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         cmbavTipoguia.setValue( httpContext.cgiGet( cmbavTipoguia.getInternalname()) );
         AV5TipoGuia = (byte)(GXutil.lval( httpContext.cgiGet( cmbavTipoguia.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5TipoGuia", GXutil.str( AV5TipoGuia, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCOD");
            GX_FocusControl = edtavAlbprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6AlbProCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProCod), 10, 0));
         }
         else
         {
            AV6AlbProCod = localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProCod), 10, 0));
         }
         AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
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
      e112AM2 ();
      if (returnInSub) return;
   }

   public void e112AM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      enviowebservicemanual_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      enviowebservicemanual_impl.this.AV15EmprCod = GXv_char2[0] ;
      enviowebservicemanual_impl.this.AV16EmprNom = GXv_char3[0] ;
      enviowebservicemanual_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      AV5TipoGuia = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5TipoGuia", GXutil.str( AV5TipoGuia, 1, 0));
      GXt_int5 = (byte)(AV22Nows) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NOWS0", ""), GXv_int6) ;
      enviowebservicemanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV22Nows = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Nows", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Nows), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Nows), "ZZZ9")));
      cmbavTipoguia.removeAllItems();
      GXt_int5 = (byte)(AV23FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      enviowebservicemanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23FirmaD = GXt_int5 ;
      GXt_char1 = AV24ddmmaa ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      enviowebservicemanual_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24ddmmaa = GXt_char1 ;
      AV25Facfch = localUtil.ctod( AV24ddmmaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
   }

   public void e122AM2( )
   {
      /* 'DoEnvioWebService' Routine */
      returnInSub = false ;
      if ( AV5TipoGuia == 1 )
      {
         AV10Calprd = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Calprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Calprd), 4, 0));
         /* Using cursor H02AM2 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV6AlbProCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A30AlbProCod = H02AM2_A30AlbProCod[0] ;
            A7101AlbLic = H02AM2_A7101AlbLic[0] ;
            A39AlbProPri = H02AM2_A39AlbProPri[0] ;
            A10017AlbFmd = H02AM2_A10017AlbFmd[0] ;
            n10017AlbFmd = H02AM2_n10017AlbFmd[0] ;
            A4023AlbFecSal = H02AM2_A4023AlbFecSal[0] ;
            A396EmprCod = H02AM2_A396EmprCod[0] ;
            AV7ALbLic = A7101AlbLic ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ALbLic", AV7ALbLic);
            AV10Calprd = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Calprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Calprd), 4, 0));
            AV18ALbProPri = A39AlbProPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ALbProPri", AV18ALbProPri);
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbEnvFtp", GXutil.str( AV8AlbEnvFtp, 1, 0));
            AV19Albfmd = A10017AlbFmd ;
            AV20AlbFecSal = A4023AlbFecSal ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbFecSal", localUtil.format(AV20AlbFecSal, "99/99/99"));
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else if ( AV5TipoGuia == 2 )
      {
         AV26Calcom = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Calcom", GXutil.str( AV26Calcom, 1, 0));
         /* Using cursor H02AM3 */
         pr_default.execute(1, new Object[] {Long.valueOf(AV6AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14AlbComCod = H02AM3_A14AlbComCod[0] ;
            A4829AlbComHor = H02AM3_A4829AlbComHor[0] ;
            A10740AlbComID = H02AM3_A10740AlbComID[0] ;
            A10739AlbComEAT = H02AM3_A10739AlbComEAT[0] ;
            A396EmprCod = H02AM3_A396EmprCod[0] ;
            AV21AlbComHor = A4829AlbComHor ;
            AV7ALbLic = A10740AlbComID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ALbLic", AV7ALbLic);
            AV8AlbEnvFtp = A10739AlbComEAT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbEnvFtp", GXutil.str( AV8AlbEnvFtp, 1, 0));
            AV26Calcom = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Calcom", GXutil.str( AV26Calcom, 1, 0));
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else if ( AV5TipoGuia == 3 )
      {
         AV11DevGen = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11DevGen", GXutil.str( AV11DevGen, 1, 0));
         /* Using cursor H02AM4 */
         pr_default.execute(2, new Object[] {Long.valueOf(AV6AlbProCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A323DevGenCod = H02AM4_A323DevGenCod[0] ;
            A10737DevATCodeI = H02AM4_A10737DevATCodeI[0] ;
            n10737DevATCodeI = H02AM4_n10737DevATCodeI[0] ;
            A10736DevEnvAT = H02AM4_A10736DevEnvAT[0] ;
            n10736DevEnvAT = H02AM4_n10736DevEnvAT[0] ;
            A396EmprCod = H02AM4_A396EmprCod[0] ;
            AV7ALbLic = A10737DevATCodeI ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ALbLic", AV7ALbLic);
            AV8AlbEnvFtp = A10736DevEnvAT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbEnvFtp", GXutil.str( AV8AlbEnvFtp, 1, 0));
            AV11DevGen = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11DevGen", GXutil.str( AV11DevGen, 1, 0));
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      else if ( AV5TipoGuia == 4 )
      {
         AV12Cestsa = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Cestsa", GXutil.str( AV12Cestsa, 1, 0));
         /* Using cursor H02AM5 */
         pr_default.execute(3, new Object[] {Long.valueOf(AV6AlbProCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2253SalExtAlb = H02AM5_A2253SalExtAlb[0] ;
            A10742SalCodeID = H02AM5_A10742SalCodeID[0] ;
            A10741SalEnvAT = H02AM5_A10741SalEnvAT[0] ;
            A396EmprCod = H02AM5_A396EmprCod[0] ;
            AV7ALbLic = A10742SalCodeID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ALbLic", AV7ALbLic);
            AV8AlbEnvFtp = A10741SalEnvAT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbEnvFtp", GXutil.str( AV8AlbEnvFtp, 1, 0));
            AV12Cestsa = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Cestsa", GXutil.str( AV12Cestsa, 1, 0));
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      else if ( AV5TipoGuia == 5 )
      {
         AV13calpro = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13calpro", GXutil.str( AV13calpro, 1, 0));
         /* Using cursor H02AM6 */
         pr_default.execute(4, new Object[] {Long.valueOf(AV6AlbProCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A13418AlbProID = H02AM6_A13418AlbProID[0] ;
            A13436AlbProIDAT = H02AM6_A13436AlbProIDAT[0] ;
            A13438AlbProStAT = H02AM6_A13438AlbProStAT[0] ;
            A396EmprCod = H02AM6_A396EmprCod[0] ;
            AV7ALbLic = A13436AlbProIDAT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ALbLic", AV7ALbLic);
            AV8AlbEnvFtp = A13438AlbProStAT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbEnvFtp", GXutil.str( AV8AlbEnvFtp, 1, 0));
            AV13calpro = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13calpro", GXutil.str( AV13calpro, 1, 0));
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else
      {
      }
      if ( ( ( AV5TipoGuia == 1 ) && ( AV10Calprd == 0 ) ) || ( ( AV5TipoGuia == 2 ) && ( AV26Calcom == 0 ) ) || ( ( AV5TipoGuia == 3 ) && ( AV11DevGen == 0 ) ) || ( ( AV5TipoGuia == 4 ) && ( AV12Cestsa == 0 ) ) || ( ( AV5TipoGuia == 5 ) && ( AV13calpro == 0 ) ) )
      {
         AV9Mensage = httpContext.getMessage( "Nao Existe N Guia¡¡¡ ", "") + GXutil.str( AV5TipoGuia, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Mensage", AV9Mensage);
         httpContext.GX_msglist.addItem(AV9Mensage);
         GX_FocusControl = edtavAlbprocod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( GXutil.strcmp(AV7ALbLic, " ") != 0 ) || ( AV8AlbEnvFtp == 3 ) )
         {
            if ( GXutil.strcmp(AV7ALbLic, " ") != 0 )
            {
               AV9Mensage = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + AV7ALbLic ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Mensage", AV9Mensage);
            }
            if ( ( AV8AlbEnvFtp == 3 ) && ( GXutil.strcmp(AV7ALbLic, " ") == 0 ) )
            {
               AV9Mensage = httpContext.getMessage( "Código -100 de AT,Guia marcada como comunicada AT", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Mensage", AV9Mensage);
            }
            httpContext.GX_msglist.addItem(AV9Mensage);
            GX_FocusControl = edtavAlbprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( AV22Nows == 1 ) && ( GXutil.strcmp(AV18ALbProPri, "0") == 0 ) )
            {
               AV9Mensage = httpContext.getMessage( "Atenção, Este guia não podem ser enviados manualmente", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Mensage", AV9Mensage);
               httpContext.GX_msglist.addItem(AV9Mensage);
               GX_FocusControl = edtavAlbprocod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( AV5TipoGuia == 1 )
               {
                  httpContext.popup(formatLink("app.horasalidadocumento", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateParm(AV20AlbFecSal)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"AuxEmprCod","AlbProCod","AlbFecSal","TipoDoc"}) , new Object[] {});
                  httpContext.popup(formatLink("app.enviodocumentodesdetalbnop", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0))}, new String[] {"AuxEmprCod","AlbProcod"}) , new Object[] {});
               }
               else if ( AV5TipoGuia == 2 )
               {
               }
               else if ( AV5TipoGuia == 3 )
               {
               }
               else if ( AV5TipoGuia == 4 )
               {
               }
               else if ( AV5TipoGuia == 5 )
               {
               }
               else
               {
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e132AM2( )
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
      pa2AM2( ) ;
      ws2AM2( ) ;
      we2AM2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016454838", true, true);
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
      httpContext.AddJavascriptSource("enviowebservicemanual.js", "?202661016454838", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavTipoguia.setInternalname( "vTIPOGUIA" );
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      divTableform_Internalname = "TABLEFORM" ;
      bttBtnenviowebservice_Internalname = "BTNENVIOWEBSERVICE" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divDivheader_Internalname = "DIVHEADER" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 1 ;
      cmbavTipoguia.setJsonclick( "" );
      cmbavTipoguia.setEnabled( 1 );
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-network-wired\"></i> Envio Webservice Manual", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Envio Webservice Manual", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTipoguia.setName( "vTIPOGUIA" );
      cmbavTipoguia.setWebtags( "" );
      cmbavTipoguia.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavTipoguia.addItem("2", httpContext.getMessage( "Guias Diversas (Comerciais)", ""), (short)(0));
      cmbavTipoguia.addItem("3", httpContext.getMessage( "Devoluçoes Malha em Cru", ""), (short)(0));
      cmbavTipoguia.addItem("4", httpContext.getMessage( "Trabalhos Externos", ""), (short)(0));
      if ( cmbavTipoguia.getItemCount() > 0 )
      {
         AV5TipoGuia = (byte)(GXutil.lval( cmbavTipoguia.getValidValue(GXutil.trim( GXutil.str( AV5TipoGuia, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5TipoGuia", GXutil.str( AV5TipoGuia, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV22Nows',fld:'vNOWS',pic:'ZZZ9',hsh:true},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOENVIOWEBSERVICE'","{handler:'e122AM2',iparms:[{av:'cmbavTipoguia'},{av:'AV5TipoGuia',fld:'vTIPOGUIA',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV8AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'A10017AlbFmd',fld:'ALBFMD',pic:''},{av:'A4023AlbFecSal',fld:'ALBFECSAL',pic:''},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'A10739AlbComEAT',fld:'ALBCOMEAT',pic:'9'},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9'},{av:'A10737DevATCodeI',fld:'DEVATCODEI',pic:''},{av:'A10736DevEnvAT',fld:'DEVENVAT',pic:'9'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A10742SalCodeID',fld:'SALCODEID',pic:''},{av:'A10741SalEnvAT',fld:'SALENVAT',pic:'9'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A13436AlbProIDAT',fld:'ALBPROIDAT',pic:''},{av:'A13438AlbProStAT',fld:'ALBPROSTAT',pic:'9'},{av:'AV10Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV26Calcom',fld:'vCALCOM',pic:'9'},{av:'AV11DevGen',fld:'vDEVGEN',pic:'9'},{av:'AV12Cestsa',fld:'vCESTSA',pic:'9'},{av:'AV13calpro',fld:'vCALPRO',pic:'9'},{av:'AV7ALbLic',fld:'vALBLIC',pic:''},{av:'AV9Mensage',fld:'vMENSAGE',pic:''},{av:'AV22Nows',fld:'vNOWS',pic:'ZZZ9',hsh:true},{av:'AV18ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV20AlbFecSal',fld:'vALBFECSAL',pic:''}]");
      setEventMetadata("'DOENVIOWEBSERVICE'",",oparms:[{av:'AV10Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV7ALbLic',fld:'vALBLIC',pic:''},{av:'AV18ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV8AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV20AlbFecSal',fld:'vALBFECSAL',pic:''},{av:'AV26Calcom',fld:'vCALCOM',pic:'9'},{av:'AV11DevGen',fld:'vDEVGEN',pic:'9'},{av:'AV12Cestsa',fld:'vCESTSA',pic:'9'},{av:'AV13calpro',fld:'vCALPRO',pic:'9'},{av:'AV9Mensage',fld:'vMENSAGE',pic:''}]}");
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
      AV15EmprCod = "" ;
      GXKey = "" ;
      A396EmprCod = "" ;
      A7101AlbLic = "" ;
      A39AlbProPri = "" ;
      A10017AlbFmd = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10740AlbComID = "" ;
      A10737DevATCodeI = "" ;
      A10742SalCodeID = "" ;
      A13436AlbProIDAT = "" ;
      AV7ALbLic = "" ;
      AV9Mensage = "" ;
      AV18ALbProPri = "" ;
      AV20AlbFecSal = GXutil.nullDate() ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenviowebservice_Jsonclick = "" ;
      AV29Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV24ddmmaa = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV25Facfch = GXutil.nullDate() ;
      scmdbuf = "" ;
      H02AM2_A30AlbProCod = new long[1] ;
      H02AM2_A7101AlbLic = new String[] {""} ;
      H02AM2_A39AlbProPri = new String[] {""} ;
      H02AM2_A10017AlbFmd = new String[] {""} ;
      H02AM2_n10017AlbFmd = new boolean[] {false} ;
      H02AM2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H02AM2_A396EmprCod = new String[] {""} ;
      AV19Albfmd = "" ;
      H02AM3_A14AlbComCod = new int[1] ;
      H02AM3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      H02AM3_A10740AlbComID = new String[] {""} ;
      H02AM3_A10739AlbComEAT = new byte[1] ;
      H02AM3_A396EmprCod = new String[] {""} ;
      AV21AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      H02AM4_A323DevGenCod = new int[1] ;
      H02AM4_A10737DevATCodeI = new String[] {""} ;
      H02AM4_n10737DevATCodeI = new boolean[] {false} ;
      H02AM4_A10736DevEnvAT = new byte[1] ;
      H02AM4_n10736DevEnvAT = new boolean[] {false} ;
      H02AM4_A396EmprCod = new String[] {""} ;
      H02AM5_A2253SalExtAlb = new int[1] ;
      H02AM5_A10742SalCodeID = new String[] {""} ;
      H02AM5_A10741SalEnvAT = new byte[1] ;
      H02AM5_A396EmprCod = new String[] {""} ;
      H02AM6_A13418AlbProID = new int[1] ;
      H02AM6_A13436AlbProIDAT = new String[] {""} ;
      H02AM6_A13438AlbProStAT = new byte[1] ;
      H02AM6_A396EmprCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.enviowebservicemanual__default(),
         new Object[] {
             new Object[] {
            H02AM2_A30AlbProCod, H02AM2_A7101AlbLic, H02AM2_A39AlbProPri, H02AM2_A10017AlbFmd, H02AM2_n10017AlbFmd, H02AM2_A4023AlbFecSal, H02AM2_A396EmprCod
            }
            , new Object[] {
            H02AM3_A14AlbComCod, H02AM3_A4829AlbComHor, H02AM3_A10740AlbComID, H02AM3_A10739AlbComEAT, H02AM3_A396EmprCod
            }
            , new Object[] {
            H02AM4_A323DevGenCod, H02AM4_A10737DevATCodeI, H02AM4_n10737DevATCodeI, H02AM4_A10736DevEnvAT, H02AM4_n10736DevEnvAT, H02AM4_A396EmprCod
            }
            , new Object[] {
            H02AM5_A2253SalExtAlb, H02AM5_A10742SalCodeID, H02AM5_A10741SalEnvAT, H02AM5_A396EmprCod
            }
            , new Object[] {
            H02AM6_A13418AlbProID, H02AM6_A13436AlbProIDAT, H02AM6_A13438AlbProStAT, H02AM6_A396EmprCod
            }
         }
      );
      AV29Pgmname = "EnvioWebserviceManual" ;
      /* GeneXus formulas. */
      AV29Pgmname = "EnvioWebserviceManual" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV8AlbEnvFtp ;
   private byte A10739AlbComEAT ;
   private byte A10736DevEnvAT ;
   private byte A10741SalEnvAT ;
   private byte A13438AlbProStAT ;
   private byte AV26Calcom ;
   private byte AV11DevGen ;
   private byte AV12Cestsa ;
   private byte AV13calpro ;
   private byte AV5TipoGuia ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
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
   private short AV22Nows ;
   private short AV10Calprd ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV23FirmaD ;
   private int A14AlbComCod ;
   private int A323DevGenCod ;
   private int A2253SalExtAlb ;
   private int A13418AlbProID ;
   private int edtavAlbprocod_Enabled ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private long A30AlbProCod ;
   private long AV6AlbProCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV15EmprCod ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A7101AlbLic ;
   private String A39AlbProPri ;
   private String A10740AlbComID ;
   private String A10737DevATCodeI ;
   private String A10742SalCodeID ;
   private String A13436AlbProIDAT ;
   private String AV7ALbLic ;
   private String AV18ALbProPri ;
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
   private String divDivheader_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String divTableform_Internalname ;
   private String TempTags ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String divTableactions_Internalname ;
   private String bttBtnenviowebservice_Internalname ;
   private String bttBtnenviowebservice_Jsonclick ;
   private String divTablecontent_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date AV21AlbComHor ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV20AlbFecSal ;
   private java.util.Date AV25Facfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean n10017AlbFmd ;
   private boolean n10737DevATCodeI ;
   private boolean n10736DevEnvAT ;
   private String A10017AlbFmd ;
   private String AV9Mensage ;
   private String AV24ddmmaa ;
   private String AV19Albfmd ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private HTMLChoice cmbavTipoguia ;
   private IDataStoreProvider pr_default ;
   private long[] H02AM2_A30AlbProCod ;
   private String[] H02AM2_A7101AlbLic ;
   private String[] H02AM2_A39AlbProPri ;
   private String[] H02AM2_A10017AlbFmd ;
   private boolean[] H02AM2_n10017AlbFmd ;
   private java.util.Date[] H02AM2_A4023AlbFecSal ;
   private String[] H02AM2_A396EmprCod ;
   private int[] H02AM3_A14AlbComCod ;
   private java.util.Date[] H02AM3_A4829AlbComHor ;
   private String[] H02AM3_A10740AlbComID ;
   private byte[] H02AM3_A10739AlbComEAT ;
   private String[] H02AM3_A396EmprCod ;
   private int[] H02AM4_A323DevGenCod ;
   private String[] H02AM4_A10737DevATCodeI ;
   private boolean[] H02AM4_n10737DevATCodeI ;
   private byte[] H02AM4_A10736DevEnvAT ;
   private boolean[] H02AM4_n10736DevEnvAT ;
   private String[] H02AM4_A396EmprCod ;
   private int[] H02AM5_A2253SalExtAlb ;
   private String[] H02AM5_A10742SalCodeID ;
   private byte[] H02AM5_A10741SalEnvAT ;
   private String[] H02AM5_A396EmprCod ;
   private int[] H02AM6_A13418AlbProID ;
   private String[] H02AM6_A13436AlbProIDAT ;
   private byte[] H02AM6_A13438AlbProStAT ;
   private String[] H02AM6_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class enviowebservicemanual__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02AM2", "SELECT AlbProCod, AlbLic, AlbProPri, AlbFmd, AlbFecSal, EmprCod FROM TXPCALPRD WHERE AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AM3", "SELECT AlbComCod, AlbComHor, AlbComID, AlbComEAT, EmprCod FROM TXPCALCOM WHERE AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AM4", "SELECT DevGenCod, DevATCodeI, DevEnvAT, EmprCod FROM TXPDEVGEN WHERE DevGenCod = ? ORDER BY EmprCod, DevGenCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AM5", "SELECT SalExtAlb, SalCodeID, SalEnvAT, EmprCod FROM TXPCEXTSA WHERE SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AM6", "SELECT AlbProID, AlbProIDAT, AlbProStAT, EmprCod FROM TXPCALPRO WHERE AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

