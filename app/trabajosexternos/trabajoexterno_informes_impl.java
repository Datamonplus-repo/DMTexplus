package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_informes_impl extends GXDataArea
{
   public trabajoexterno_informes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_informes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_informes_impl.class ));
   }

   public trabajoexterno_informes_impl( int remoteHandle ,
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
      pa27I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27I2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_informes", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWKRP00", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22WkRp00), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANCODFROM_DATA", AV12ManCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANCODFROM_DATA", AV12ManCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANCODTO_DATA", AV13ManCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANCODTO_DATA", AV13ManCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCODFROM_DATA", AV10FasCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCODFROM_DATA", AV10FasCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCODTO_DATA", AV17FasCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCODTO_DATA", AV17FasCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vWKRP00", GXutil.ltrim( localUtil.ntoc( AV22WkRp00, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWKRP00", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22WkRp00), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODFROM_Cls", GXutil.rtrim( Combo_mancodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODFROM_Selectedvalue_set", GXutil.rtrim( Combo_mancodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODFROM_Emptyitemtext", GXutil.rtrim( Combo_mancodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODTO_Cls", GXutil.rtrim( Combo_mancodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODTO_Selectedvalue_set", GXutil.rtrim( Combo_mancodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODTO_Emptyitemtext", GXutil.rtrim( Combo_mancodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODFROM_Cls", GXutil.rtrim( Combo_fascodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODFROM_Selectedvalue_set", GXutil.rtrim( Combo_fascodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODFROM_Emptyitemtext", GXutil.rtrim( Combo_fascodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODTO_Cls", GXutil.rtrim( Combo_fascodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODTO_Selectedvalue_set", GXutil.rtrim( Combo_fascodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODTO_Emptyitemtext", GXutil.rtrim( Combo_fascodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODTO_Selectedvalue_get", GXutil.rtrim( Combo_fascodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODFROM_Selectedvalue_get", GXutil.rtrim( Combo_fascodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODTO_Selectedvalue_get", GXutil.rtrim( Combo_mancodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCODFROM_Selectedvalue_get", GXutil.rtrim( Combo_mancodfrom_Selectedvalue_get));
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
         we27I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27I2( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_informes", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Informes" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajo Externo (Informes)", "") ;
   }

   public void wb27I0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmancodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_mancodfrom_Internalname, httpContext.getMessage( "Manufacturador Inicial", ""), "", "", lblTextblockcombo_mancodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_mancodfrom.setProperty("Caption", Combo_mancodfrom_Caption);
         ucCombo_mancodfrom.setProperty("Cls", Combo_mancodfrom_Cls);
         ucCombo_mancodfrom.setProperty("EmptyItemText", Combo_mancodfrom_Emptyitemtext);
         ucCombo_mancodfrom.setProperty("DropDownOptionsData", AV12ManCodfrom_Data);
         ucCombo_mancodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_mancodfrom_Internalname, "COMBO_MANCODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmancodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_mancodto_Internalname, httpContext.getMessage( "Manufacturador Final", ""), "", "", lblTextblockcombo_mancodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_mancodto.setProperty("Caption", Combo_mancodto_Caption);
         ucCombo_mancodto.setProperty("Cls", Combo_mancodto_Cls);
         ucCombo_mancodto.setProperty("EmptyItemText", Combo_mancodto_Emptyitemtext);
         ucCombo_mancodto.setProperty("DropDownOptionsData", AV13ManCodto_Data);
         ucCombo_mancodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_mancodto_Internalname, "COMBO_MANCODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextfecfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextfecfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavSalextfecfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextfecfrom_Internalname, localUtil.format(AV6SalExtFecfrom, "99/99/99"), localUtil.format( AV6SalExtFecfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextfecfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextfecfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavSalextfecfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavSalextfecfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextfecto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextfecto_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavSalextfecto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextfecto_Internalname, localUtil.format(AV7SalExtFecto, "99/99/99"), localUtil.format( AV7SalExtFecto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextfecto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextfecto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavSalextfecto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavSalextfecto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascodfrom_Internalname, httpContext.getMessage( "Fase Inicial", ""), "", "", lblTextblockcombo_fascodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascodfrom.setProperty("Caption", Combo_fascodfrom_Caption);
         ucCombo_fascodfrom.setProperty("Cls", Combo_fascodfrom_Cls);
         ucCombo_fascodfrom.setProperty("EmptyItemText", Combo_fascodfrom_Emptyitemtext);
         ucCombo_fascodfrom.setProperty("DropDownOptionsData", AV10FasCodfrom_Data);
         ucCombo_fascodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascodfrom_Internalname, "COMBO_FASCODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascodto_Internalname, httpContext.getMessage( "Fase Final", ""), "", "", lblTextblockcombo_fascodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascodto.setProperty("Caption", Combo_fascodto_Caption);
         ucCombo_fascodto.setProperty("Cls", Combo_fascodto_Cls);
         ucCombo_fascodto.setProperty("EmptyItemText", Combo_fascodto_Emptyitemtext);
         ucCombo_fascodto.setProperty("DropDownOptionsData", AV17FasCodto_Data);
         ucCombo_fascodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascodto_Internalname, "COMBO_FASCODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOpcion.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOpcion.getInternalname(), httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOpcion, cmbavOpcion.getInternalname(), GXutil.trim( GXutil.str( AV14Opcion, 1, 0)), 1, cmbavOpcion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOpcion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "", true, (byte)(0), "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV14Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTrab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTrab.getInternalname(), httpContext.getMessage( "Trabajo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTrab, cmbavTrab.getInternalname(), GXutil.rtrim( AV15Trab), 1, cmbavTrab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTrab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "", true, (byte)(0), "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         cmbavTrab.setValue( GXutil.rtrim( AV15Trab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTrab.getInternalname(), "Values", cmbavTrab.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Pdf", ""), bttBtnresultados_Jsonclick, 7, httpContext.getMessage( "Pdf", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1127i1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1227i1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV8ManCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8ManCodfrom), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavMancodfrom_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV9ManCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9ManCodto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavMancodto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascodfrom_Internalname, GXutil.rtrim( AV5FasCodfrom), GXutil.rtrim( localUtil.format( AV5FasCodfrom, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavFascodfrom_Visible, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascodto_Internalname, GXutil.rtrim( AV16FasCodto), GXutil.rtrim( localUtil.format( AV16FasCodto, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavFascodto_Visible, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Informes.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start27I2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Trabajo Externo (Informes)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27I0( ) ;
   }

   public void ws27I2( )
   {
      start27I2( ) ;
      evt27I2( ) ;
   }

   public void evt27I2( )
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
                           e1327I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExcel' */
                           e1427I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1527I2 ();
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

   public void we27I2( )
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

   public void pa27I2( )
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
            GX_FocusControl = edtavSalextfecfrom_Internalname ;
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
         AV14Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV14Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Opcion", GXutil.str( AV14Opcion, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV14Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
      }
      if ( cmbavTrab.getItemCount() > 0 )
      {
         AV15Trab = cmbavTrab.getValidValue(AV15Trab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Trab", AV15Trab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTrab.setValue( GXutil.rtrim( AV15Trab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTrab.getInternalname(), "Values", cmbavTrab.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf27I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV27Pgmname = "TrabajosExternos.TrabajoExterno_Informes" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1527I2 ();
         wb27I0( ) ;
      }
   }

   public void send_integrity_lvl_hashes27I2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vWKRP00", GXutil.ltrim( localUtil.ntoc( AV22WkRp00, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWKRP00", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22WkRp00), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV27Pgmname = "TrabajosExternos.TrabajoExterno_Informes" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1327I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANCODFROM_DATA"), AV12ManCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANCODTO_DATA"), AV13ManCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCODFROM_DATA"), AV10FasCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCODTO_DATA"), AV17FasCodto_Data);
         /* Read saved values. */
         AV22WkRp00 = (short)(localUtil.ctol( httpContext.cgiGet( "vWKRP00"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         Combo_mancodfrom_Cls = httpContext.cgiGet( "COMBO_MANCODFROM_Cls") ;
         Combo_mancodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_MANCODFROM_Selectedvalue_set") ;
         Combo_mancodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_MANCODFROM_Emptyitemtext") ;
         Combo_mancodto_Cls = httpContext.cgiGet( "COMBO_MANCODTO_Cls") ;
         Combo_mancodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_MANCODTO_Selectedvalue_set") ;
         Combo_mancodto_Emptyitemtext = httpContext.cgiGet( "COMBO_MANCODTO_Emptyitemtext") ;
         Combo_fascodfrom_Cls = httpContext.cgiGet( "COMBO_FASCODFROM_Cls") ;
         Combo_fascodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCODFROM_Selectedvalue_set") ;
         Combo_fascodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_FASCODFROM_Emptyitemtext") ;
         Combo_fascodto_Cls = httpContext.cgiGet( "COMBO_FASCODTO_Cls") ;
         Combo_fascodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCODTO_Selectedvalue_set") ;
         Combo_fascodto_Emptyitemtext = httpContext.cgiGet( "COMBO_FASCODTO_Emptyitemtext") ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavSalextfecfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vSALEXTFECFROM");
            GX_FocusControl = edtavSalextfecfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6SalExtFecfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6SalExtFecfrom", localUtil.format(AV6SalExtFecfrom, "99/99/99"));
         }
         else
         {
            AV6SalExtFecfrom = localUtil.ctod( httpContext.cgiGet( edtavSalextfecfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6SalExtFecfrom", localUtil.format(AV6SalExtFecfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavSalextfecto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vSALEXTFECTO");
            GX_FocusControl = edtavSalextfecto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7SalExtFecto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7SalExtFecto", localUtil.format(AV7SalExtFecto, "99/99/99"));
         }
         else
         {
            AV7SalExtFecto = localUtil.ctod( httpContext.cgiGet( edtavSalextfecto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7SalExtFecto", localUtil.format(AV7SalExtFecto, "99/99/99"));
         }
         cmbavOpcion.setValue( httpContext.cgiGet( cmbavOpcion.getInternalname()) );
         AV14Opcion = (byte)(GXutil.lval( httpContext.cgiGet( cmbavOpcion.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Opcion", GXutil.str( AV14Opcion, 1, 0));
         cmbavTrab.setValue( httpContext.cgiGet( cmbavTrab.getInternalname()) );
         AV15Trab = httpContext.cgiGet( cmbavTrab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Trab", AV15Trab);
         AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMancodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMancodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMANCODFROM");
            GX_FocusControl = edtavMancodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8ManCodfrom = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ManCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ManCodfrom), 4, 0));
         }
         else
         {
            AV8ManCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( edtavMancodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ManCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ManCodfrom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMancodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMancodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMANCODTO");
            GX_FocusControl = edtavMancodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9ManCodto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ManCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ManCodto), 4, 0));
         }
         else
         {
            AV9ManCodto = (short)(localUtil.ctol( httpContext.cgiGet( edtavMancodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ManCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ManCodto), 4, 0));
         }
         AV5FasCodfrom = GXutil.upper( httpContext.cgiGet( edtavFascodfrom_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5FasCodfrom", AV5FasCodfrom);
         AV16FasCodto = GXutil.upper( httpContext.cgiGet( edtavFascodto_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16FasCodto", AV16FasCodto);
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
      e1327I2 ();
      if (returnInSub) return;
   }

   public void e1327I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_informes_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_informes_impl.this.AV19EmprCod = GXv_char2[0] ;
      trabajoexterno_informes_impl.this.AV20EmprNom = GXv_char3[0] ;
      trabajoexterno_informes_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      edtavFascodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascodto_Visible), 5, 0), true);
      edtavFascodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascodfrom_Visible), 5, 0), true);
      edtavMancodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancodto_Visible), 5, 0), true);
      edtavMancodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMANCODFROM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMANCODTO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASCODFROM' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASCODTO' */
      S142 ();
      if (returnInSub) return;
      GXt_int5 = (byte)(AV22WkRp00) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "WKRP00", ""), GXv_int6) ;
      trabajoexterno_informes_impl.this.GXt_int5 = GXv_int6[0] ;
      AV22WkRp00 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22WkRp00", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22WkRp00), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWKRP00", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22WkRp00), "ZZZ9")));
      AV6SalExtFecfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6SalExtFecfrom", localUtil.format(AV6SalExtFecfrom, "99/99/99"));
      AV7SalExtFecto = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7SalExtFecto", localUtil.format(AV7SalExtFecto, "99/99/99"));
   }

   public void e1427I2( )
   {
      /* 'DoExcel' Routine */
      returnInSub = false ;
      if ( AV14Opcion == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_char4[0] = AV23ExcelFilename ;
         GXv_char3[0] = AV24ErrorMessage ;
         new app.trabajosexternos.trabajoexterno_enviados(remoteHandle, context).execute( AV19EmprCod, AV8ManCodfrom, AV9ManCodto, AV6SalExtFecfrom, AV7SalExtFecto, AV5FasCodfrom, AV16FasCodto, "", (byte)(0), AV15Trab, "", GXv_char4, GXv_char3) ;
         trabajoexterno_informes_impl.this.AV23ExcelFilename = GXv_char4[0] ;
         trabajoexterno_informes_impl.this.AV24ErrorMessage = GXv_char3[0] ;
         if ( GXutil.strcmp(AV23ExcelFilename, "") != 0 )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            callWebObject(formatLink(AV23ExcelFilename, new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV24ErrorMessage);
         }
      }
      else
      {
         System.out.println( httpContext.getMessage( "TrabajoExterno_Informes, opcion 2", "") );
         GXv_char4[0] = AV19EmprCod ;
         GXv_int7[0] = AV8ManCodfrom ;
         GXv_int8[0] = AV9ManCodto ;
         GXv_date9[0] = AV6SalExtFecfrom ;
         GXv_date10[0] = AV7SalExtFecto ;
         GXv_char3[0] = AV5FasCodfrom ;
         GXv_char2[0] = AV16FasCodto ;
         GXv_char11[0] = AV15Trab ;
         GXv_char12[0] = AV23ExcelFilename ;
         GXv_char13[0] = AV24ErrorMessage ;
         new app.trabajosexternos.trabajoexterno_recepcionados(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_date9, GXv_date10, GXv_char3, GXv_char2, GXv_char11, GXv_char12, GXv_char13) ;
         trabajoexterno_informes_impl.this.AV19EmprCod = GXv_char4[0] ;
         trabajoexterno_informes_impl.this.AV8ManCodfrom = GXv_int7[0] ;
         trabajoexterno_informes_impl.this.AV9ManCodto = GXv_int8[0] ;
         trabajoexterno_informes_impl.this.AV6SalExtFecfrom = GXv_date9[0] ;
         trabajoexterno_informes_impl.this.AV7SalExtFecto = GXv_date10[0] ;
         trabajoexterno_informes_impl.this.AV5FasCodfrom = GXv_char3[0] ;
         trabajoexterno_informes_impl.this.AV16FasCodto = GXv_char2[0] ;
         trabajoexterno_informes_impl.this.AV15Trab = GXv_char11[0] ;
         trabajoexterno_informes_impl.this.AV23ExcelFilename = GXv_char12[0] ;
         trabajoexterno_informes_impl.this.AV24ErrorMessage = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8ManCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ManCodfrom), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9ManCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ManCodto), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6SalExtFecfrom", localUtil.format(AV6SalExtFecfrom, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV7SalExtFecto", localUtil.format(AV7SalExtFecto, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV5FasCodfrom", AV5FasCodfrom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16FasCodto", AV16FasCodto);
         httpContext.ajax_rsp_assign_attri("", false, "AV15Trab", AV15Trab);
         if ( GXutil.strcmp(AV23ExcelFilename, "") != 0 )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            callWebObject(formatLink(AV23ExcelFilename, new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV24ErrorMessage);
         }
      }
      /*  Sending Event outputs  */
      cmbavTrab.setValue( GXutil.rtrim( AV15Trab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTrab.getInternalname(), "Values", cmbavTrab.ToJavascriptSource(), true);
   }

   public void S142( )
   {
      /* 'LOADCOMBOFASCODTO' Routine */
      returnInSub = false ;
      /* Using cursor H027I2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14042FasActiva = H027I2_A14042FasActiva[0] ;
         A13781FasCDsc = H027I2_A13781FasCDsc[0] ;
         A457FasCod = H027I2_A457FasCod[0] ;
         A460FasDsc = H027I2_A460FasDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV17FasCodto_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_fascodto_Selectedvalue_set = AV16FasCodto ;
      ucCombo_fascodto.sendProperty(context, "", false, Combo_fascodto_Internalname, "SelectedValue_set", Combo_fascodto_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOFASCODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H027I3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14042FasActiva = H027I3_A14042FasActiva[0] ;
         A13781FasCDsc = H027I3_A13781FasCDsc[0] ;
         A457FasCod = H027I3_A457FasCod[0] ;
         A460FasDsc = H027I3_A460FasDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV10FasCodfrom_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_fascodfrom_Selectedvalue_set = AV5FasCodfrom ;
      ucCombo_fascodfrom.sendProperty(context, "", false, Combo_fascodfrom_Internalname, "SelectedValue_set", Combo_fascodfrom_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOMANCODTO' Routine */
      returnInSub = false ;
      /* Using cursor H027I4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13847ManNomID = H027I4_A13847ManNomID[0] ;
         A2248ManCod = H027I4_A2248ManCod[0] ;
         A2249ManNom = H027I4_A2249ManNom[0] ;
         n2249ManNom = H027I4_n2249ManNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A2248ManCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13847ManNomID );
         AV13ManCodto_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_mancodto_Selectedvalue_set = ((0==AV9ManCodto) ? "" : GXutil.trim( GXutil.str( AV9ManCodto, 4, 0))) ;
      ucCombo_mancodto.sendProperty(context, "", false, Combo_mancodto_Internalname, "SelectedValue_set", Combo_mancodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOMANCODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H027I5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13847ManNomID = H027I5_A13847ManNomID[0] ;
         A2248ManCod = H027I5_A2248ManCod[0] ;
         A2249ManNom = H027I5_A2249ManNom[0] ;
         n2249ManNom = H027I5_n2249ManNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A2248ManCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13847ManNomID );
         AV12ManCodfrom_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_mancodfrom_Selectedvalue_set = ((0==AV8ManCodfrom) ? "" : GXutil.trim( GXutil.str( AV8ManCodfrom, 4, 0))) ;
      ucCombo_mancodfrom.sendProperty(context, "", false, Combo_mancodfrom_Internalname, "SelectedValue_set", Combo_mancodfrom_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e1527I2( )
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
      pa27I2( ) ;
      ws27I2( ) ;
      we27I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714351449", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_informes.js", "?202681714351449", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_mancodfrom_Internalname = "TEXTBLOCKCOMBO_MANCODFROM" ;
      Combo_mancodfrom_Internalname = "COMBO_MANCODFROM" ;
      divTablesplittedmancodfrom_Internalname = "TABLESPLITTEDMANCODFROM" ;
      lblTextblockcombo_mancodto_Internalname = "TEXTBLOCKCOMBO_MANCODTO" ;
      Combo_mancodto_Internalname = "COMBO_MANCODTO" ;
      divTablesplittedmancodto_Internalname = "TABLESPLITTEDMANCODTO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavSalextfecfrom_Internalname = "vSALEXTFECFROM" ;
      edtavSalextfecto_Internalname = "vSALEXTFECTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockcombo_fascodfrom_Internalname = "TEXTBLOCKCOMBO_FASCODFROM" ;
      Combo_fascodfrom_Internalname = "COMBO_FASCODFROM" ;
      divTablesplittedfascodfrom_Internalname = "TABLESPLITTEDFASCODFROM" ;
      lblTextblockcombo_fascodto_Internalname = "TEXTBLOCKCOMBO_FASCODTO" ;
      Combo_fascodto_Internalname = "COMBO_FASCODTO" ;
      divTablesplittedfascodto_Internalname = "TABLESPLITTEDFASCODTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbavOpcion.setInternalname( "vOPCION" );
      cmbavTrab.setInternalname( "vTRAB" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnexcel_Internalname = "BTNEXCEL" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMancodfrom_Internalname = "vMANCODFROM" ;
      edtavMancodto_Internalname = "vMANCODTO" ;
      edtavFascodfrom_Internalname = "vFASCODFROM" ;
      edtavFascodto_Internalname = "vFASCODTO" ;
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
      edtavFascodto_Jsonclick = "" ;
      edtavFascodto_Visible = 1 ;
      edtavFascodfrom_Jsonclick = "" ;
      edtavFascodfrom_Visible = 1 ;
      edtavMancodto_Jsonclick = "" ;
      edtavMancodto_Visible = 1 ;
      edtavMancodfrom_Jsonclick = "" ;
      edtavMancodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavTrab.setJsonclick( "" );
      cmbavTrab.setEnabled( 1 );
      cmbavOpcion.setJsonclick( "" );
      cmbavOpcion.setEnabled( 1 );
      edtavSalextfecto_Jsonclick = "" ;
      edtavSalextfecto_Enabled = 1 ;
      edtavSalextfecfrom_Jsonclick = "" ;
      edtavSalextfecfrom_Enabled = 1 ;
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
      Combo_fascodto_Emptyitemtext = "Todas" ;
      Combo_fascodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascodfrom_Emptyitemtext = "Todas" ;
      Combo_fascodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Combo_mancodto_Emptyitemtext = "Todos" ;
      Combo_mancodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_mancodfrom_Emptyitemtext = "Todos" ;
      Combo_mancodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Trabajo Externo (Informes)", "") );
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
      cmbavOpcion.addItem("1", httpContext.getMessage( "Envios", ""), (short)(0));
      cmbavOpcion.addItem("2", httpContext.getMessage( "Recepcion", ""), (short)(0));
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV14Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV14Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Opcion", GXutil.str( AV14Opcion, 1, 0));
      }
      cmbavTrab.setName( "vTRAB" );
      cmbavTrab.setWebtags( "" );
      cmbavTrab.addItem("T", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavTrab.addItem("A", httpContext.getMessage( "Abiertos", ""), (short)(0));
      cmbavTrab.addItem("C", httpContext.getMessage( "Cerrados", ""), (short)(0));
      if ( cmbavTrab.getItemCount() > 0 )
      {
         AV15Trab = cmbavTrab.getValidValue(AV15Trab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Trab", AV15Trab);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV22WkRp00',fld:'vWKRP00',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1127I1',iparms:[{av:'cmbavOpcion'},{av:'AV14Opcion',fld:'vOPCION',pic:'9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ManCodfrom',fld:'vMANCODFROM',pic:'ZZZ9'},{av:'AV9ManCodto',fld:'vMANCODTO',pic:'ZZZ9'},{av:'AV6SalExtFecfrom',fld:'vSALEXTFECFROM',pic:''},{av:'AV7SalExtFecto',fld:'vSALEXTFECTO',pic:''},{av:'AV5FasCodfrom',fld:'vFASCODFROM',pic:'@!'},{av:'AV16FasCodto',fld:'vFASCODTO',pic:'@!'},{av:'cmbavTrab'},{av:'AV15Trab',fld:'vTRAB',pic:''},{av:'AV22WkRp00',fld:'vWKRP00',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'cmbavTrab'},{av:'AV15Trab',fld:'vTRAB',pic:''},{av:'AV16FasCodto',fld:'vFASCODTO',pic:'@!'},{av:'AV5FasCodfrom',fld:'vFASCODFROM',pic:'@!'},{av:'AV7SalExtFecto',fld:'vSALEXTFECTO',pic:''},{av:'AV6SalExtFecfrom',fld:'vSALEXTFECFROM',pic:''},{av:'AV9ManCodto',fld:'vMANCODTO',pic:'ZZZ9'},{av:'AV8ManCodfrom',fld:'vMANCODFROM',pic:'ZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXCEL'","{handler:'e1427I2',iparms:[{av:'cmbavOpcion'},{av:'AV14Opcion',fld:'vOPCION',pic:'9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8ManCodfrom',fld:'vMANCODFROM',pic:'ZZZ9'},{av:'AV9ManCodto',fld:'vMANCODTO',pic:'ZZZ9'},{av:'AV6SalExtFecfrom',fld:'vSALEXTFECFROM',pic:''},{av:'AV7SalExtFecto',fld:'vSALEXTFECTO',pic:''},{av:'AV5FasCodfrom',fld:'vFASCODFROM',pic:'@!'},{av:'AV16FasCodto',fld:'vFASCODTO',pic:'@!'},{av:'cmbavTrab'},{av:'AV15Trab',fld:'vTRAB',pic:''}]");
      setEventMetadata("'DOEXCEL'",",oparms:[{av:'cmbavTrab'},{av:'AV15Trab',fld:'vTRAB',pic:''},{av:'AV16FasCodto',fld:'vFASCODTO',pic:'@!'},{av:'AV5FasCodfrom',fld:'vFASCODFROM',pic:'@!'},{av:'AV7SalExtFecto',fld:'vSALEXTFECTO',pic:''},{av:'AV6SalExtFecfrom',fld:'vSALEXTFECFROM',pic:''},{av:'AV9ManCodto',fld:'vMANCODTO',pic:'ZZZ9'},{av:'AV8ManCodfrom',fld:'vMANCODFROM',pic:'ZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1227I1',iparms:[]");
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
      Combo_fascodto_Selectedvalue_get = "" ;
      Combo_fascodfrom_Selectedvalue_get = "" ;
      Combo_mancodto_Selectedvalue_get = "" ;
      Combo_mancodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV12ManCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV13ManCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV10FasCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV17FasCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV19EmprCod = "" ;
      Combo_mancodfrom_Selectedvalue_set = "" ;
      Combo_mancodto_Selectedvalue_set = "" ;
      Combo_fascodfrom_Selectedvalue_set = "" ;
      Combo_fascodto_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_mancodfrom_Jsonclick = "" ;
      ucCombo_mancodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_mancodfrom_Caption = "" ;
      lblTextblockcombo_mancodto_Jsonclick = "" ;
      ucCombo_mancodto = new com.genexus.webpanels.GXUserControl();
      Combo_mancodto_Caption = "" ;
      TempTags = "" ;
      AV6SalExtFecfrom = GXutil.nullDate() ;
      AV7SalExtFecto = GXutil.nullDate() ;
      lblTextblockcombo_fascodfrom_Jsonclick = "" ;
      ucCombo_fascodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_fascodfrom_Caption = "" ;
      lblTextblockcombo_fascodto_Jsonclick = "" ;
      ucCombo_fascodto = new com.genexus.webpanels.GXUserControl();
      Combo_fascodto_Caption = "" ;
      AV15Trab = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      AV27Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV5FasCodfrom = "" ;
      AV16FasCodto = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Station = "" ;
      GXt_char1 = "" ;
      AV20EmprNom = "" ;
      AV21UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV23ExcelFilename = "" ;
      AV24ErrorMessage = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      scmdbuf = "" ;
      H027I2_A396EmprCod = new String[] {""} ;
      H027I2_A14042FasActiva = new String[] {""} ;
      H027I2_A13781FasCDsc = new String[] {""} ;
      H027I2_A457FasCod = new String[] {""} ;
      H027I2_A460FasDsc = new String[] {""} ;
      A14042FasActiva = "" ;
      A13781FasCDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H027I3_A396EmprCod = new String[] {""} ;
      H027I3_A14042FasActiva = new String[] {""} ;
      H027I3_A13781FasCDsc = new String[] {""} ;
      H027I3_A457FasCod = new String[] {""} ;
      H027I3_A460FasDsc = new String[] {""} ;
      H027I4_A396EmprCod = new String[] {""} ;
      H027I4_A13847ManNomID = new String[] {""} ;
      H027I4_A2248ManCod = new short[1] ;
      H027I4_A2249ManNom = new String[] {""} ;
      H027I4_n2249ManNom = new boolean[] {false} ;
      A13847ManNomID = "" ;
      A2249ManNom = "" ;
      H027I5_A396EmprCod = new String[] {""} ;
      H027I5_A13847ManNomID = new String[] {""} ;
      H027I5_A2248ManCod = new short[1] ;
      H027I5_A2249ManNom = new String[] {""} ;
      H027I5_n2249ManNom = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_informes__default(),
         new Object[] {
             new Object[] {
            H027I2_A396EmprCod, H027I2_A14042FasActiva, H027I2_A13781FasCDsc, H027I2_A457FasCod, H027I2_A460FasDsc
            }
            , new Object[] {
            H027I3_A396EmprCod, H027I3_A14042FasActiva, H027I3_A13781FasCDsc, H027I3_A457FasCod, H027I3_A460FasDsc
            }
            , new Object[] {
            H027I4_A396EmprCod, H027I4_A13847ManNomID, H027I4_A2248ManCod, H027I4_A2249ManNom, H027I4_n2249ManNom
            }
            , new Object[] {
            H027I5_A396EmprCod, H027I5_A13847ManNomID, H027I5_A2248ManCod, H027I5_A2249ManNom, H027I5_n2249ManNom
            }
         }
      );
      AV27Pgmname = "TrabajosExternos.TrabajoExterno_Informes" ;
      /* GeneXus formulas. */
      AV27Pgmname = "TrabajosExternos.TrabajoExterno_Informes" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV14Opcion ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV22WkRp00 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV8ManCodfrom ;
   private short AV9ManCodto ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int7[] ;
   private short GXv_int8[] ;
   private short A2248ManCod ;
   private int edtavSalextfecfrom_Enabled ;
   private int edtavSalextfecto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavMancodfrom_Visible ;
   private int edtavMancodto_Visible ;
   private int edtavFascodfrom_Visible ;
   private int edtavFascodto_Visible ;
   private int idxLst ;
   private String Combo_fascodto_Selectedvalue_get ;
   private String Combo_fascodfrom_Selectedvalue_get ;
   private String Combo_mancodto_Selectedvalue_get ;
   private String Combo_mancodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV19EmprCod ;
   private String Combo_mancodfrom_Cls ;
   private String Combo_mancodfrom_Selectedvalue_set ;
   private String Combo_mancodfrom_Emptyitemtext ;
   private String Combo_mancodto_Cls ;
   private String Combo_mancodto_Selectedvalue_set ;
   private String Combo_mancodto_Emptyitemtext ;
   private String Combo_fascodfrom_Cls ;
   private String Combo_fascodfrom_Selectedvalue_set ;
   private String Combo_fascodfrom_Emptyitemtext ;
   private String Combo_fascodto_Cls ;
   private String Combo_fascodto_Selectedvalue_set ;
   private String Combo_fascodto_Emptyitemtext ;
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
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedmancodfrom_Internalname ;
   private String lblTextblockcombo_mancodfrom_Internalname ;
   private String lblTextblockcombo_mancodfrom_Jsonclick ;
   private String Combo_mancodfrom_Caption ;
   private String Combo_mancodfrom_Internalname ;
   private String divTablesplittedmancodto_Internalname ;
   private String lblTextblockcombo_mancodto_Internalname ;
   private String lblTextblockcombo_mancodto_Jsonclick ;
   private String Combo_mancodto_Caption ;
   private String Combo_mancodto_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavSalextfecfrom_Internalname ;
   private String TempTags ;
   private String edtavSalextfecfrom_Jsonclick ;
   private String edtavSalextfecto_Internalname ;
   private String edtavSalextfecto_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedfascodfrom_Internalname ;
   private String lblTextblockcombo_fascodfrom_Internalname ;
   private String lblTextblockcombo_fascodfrom_Jsonclick ;
   private String Combo_fascodfrom_Caption ;
   private String Combo_fascodfrom_Internalname ;
   private String divTablesplittedfascodto_Internalname ;
   private String lblTextblockcombo_fascodto_Internalname ;
   private String lblTextblockcombo_fascodto_Jsonclick ;
   private String Combo_fascodto_Caption ;
   private String Combo_fascodto_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String AV15Trab ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV27Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMancodfrom_Internalname ;
   private String edtavMancodfrom_Jsonclick ;
   private String edtavMancodto_Internalname ;
   private String edtavMancodto_Jsonclick ;
   private String edtavFascodfrom_Internalname ;
   private String AV5FasCodfrom ;
   private String edtavFascodfrom_Jsonclick ;
   private String edtavFascodto_Internalname ;
   private String AV16FasCodto ;
   private String edtavFascodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String AV20EmprNom ;
   private String AV21UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String scmdbuf ;
   private String A14042FasActiva ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A2249ManNom ;
   private java.util.Date AV6SalExtFecfrom ;
   private java.util.Date AV7SalExtFecto ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
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
   private boolean Cond_result ;
   private boolean n2249ManNom ;
   private String AV23ExcelFilename ;
   private String AV24ErrorMessage ;
   private String A13781FasCDsc ;
   private String A13847ManNomID ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_mancodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_mancodto ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascodto ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private HTMLChoice cmbavOpcion ;
   private HTMLChoice cmbavTrab ;
   private IDataStoreProvider pr_default ;
   private String[] H027I2_A396EmprCod ;
   private String[] H027I2_A14042FasActiva ;
   private String[] H027I2_A13781FasCDsc ;
   private String[] H027I2_A457FasCod ;
   private String[] H027I2_A460FasDsc ;
   private String[] H027I3_A396EmprCod ;
   private String[] H027I3_A14042FasActiva ;
   private String[] H027I3_A13781FasCDsc ;
   private String[] H027I3_A457FasCod ;
   private String[] H027I3_A460FasDsc ;
   private String[] H027I4_A396EmprCod ;
   private String[] H027I4_A13847ManNomID ;
   private short[] H027I4_A2248ManCod ;
   private String[] H027I4_A2249ManNom ;
   private boolean[] H027I4_n2249ManNom ;
   private String[] H027I5_A396EmprCod ;
   private String[] H027I5_A13847ManNomID ;
   private short[] H027I5_A2248ManCod ;
   private String[] H027I5_A2249ManNom ;
   private boolean[] H027I5_n2249ManNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12ManCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13ManCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10FasCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV17FasCodto_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class trabajoexterno_informes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H027I2", "SELECT EmprCod, FasActiva, RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc FROM TXPFASPRO WHERE FasActiva = 'S' ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027I3", "SELECT EmprCod, FasActiva, RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc FROM TXPFASPRO WHERE FasActiva = 'S' ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027I4", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, ManCod, ManNom FROM TXPMANUFA ORDER BY ManNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027I5", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, ManCod, ManNom FROM TXPMANUFA ORDER BY ManNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

