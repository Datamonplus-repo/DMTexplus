package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwco0003_impl extends GXDataArea
{
   public webwco0003_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwco0003_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwco0003_impl.class ));
   }

   public webwco0003_impl( int remoteHandle ,
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
      paZ52( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startZ52( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.comprasquimicos.webwco0003", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg0, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNPROV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Nprov), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV47PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV47PrdNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_TO_DATA", AV48PrdNum_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_TO_DATA", AV48PrdNum_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRVNUM_DATA", AV44PrvNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRVNUM_DATA", AV44PrvNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRVNUM_TO_DATA", AV46PrvNum_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRVNUM_TO_DATA", AV46PrvNum_to_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG0", GXutil.rtrim( AV13msg0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg0, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV14msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vQUEMOSTRAR", AV42QueMostrar);
      app.GxWebStd.gx_hidden_field( httpContext, "vNPROV", GXutil.ltrim( localUtil.ntoc( AV20Nprov, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNPROV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Nprov), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV31ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFONT", GXutil.ltrim( localUtil.ntoc( AV38Font, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitemtext", GXutil.rtrim( Combo_prdnum_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_TO_Cls", GXutil.rtrim( Combo_prdnum_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_TO_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_TO_Emptyitemtext", GXutil.rtrim( Combo_prdnum_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Cls", GXutil.rtrim( Combo_prvnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Selectedvalue_set", GXutil.rtrim( Combo_prvnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_TO_Cls", GXutil.rtrim( Combo_prvnum_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_TO_Selectedvalue_set", GXutil.rtrim( Combo_prvnum_to_Selectedvalue_set));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_TO_Selectedvalue_get", GXutil.rtrim( Combo_prvnum_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Selectedvalue_get", GXutil.rtrim( Combo_prvnum_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_TO_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
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
         weZ52( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtZ52( ) ;
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
      return formatLink("app.comprasquimicos.webwco0003", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ComprasQuimicos.WebWCO0003" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Compres Mes y Acumulados", "") ;
   }

   public void wbZ50( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prdnum_Internalname, httpContext.getMessage( "Producto Inicial", ""), "", "", lblTextblockcombo_prdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
         ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
         ucCombo_prdnum.setProperty("EmptyItemText", Combo_prdnum_Emptyitemtext);
         ucCombo_prdnum.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucCombo_prdnum.setProperty("DropDownOptionsData", AV47PrdNum_Data);
         ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prdnum_to_Internalname, httpContext.getMessage( "Producto Final", ""), "", "", lblTextblockcombo_prdnum_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prdnum_to.setProperty("Caption", Combo_prdnum_to_Caption);
         ucCombo_prdnum_to.setProperty("Cls", Combo_prdnum_to_Cls);
         ucCombo_prdnum_to.setProperty("EmptyItemText", Combo_prdnum_to_Emptyitemtext);
         ucCombo_prdnum_to.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucCombo_prdnum_to.setProperty("DropDownOptionsData", AV48PrdNum_to_Data);
         ucCombo_prdnum_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_to_Internalname, "COMBO_PRDNUM_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprvnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prvnum_Internalname, httpContext.getMessage( "Proveedor Inicial", ""), "", "", lblTextblockcombo_prvnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prvnum.setProperty("Caption", Combo_prvnum_Caption);
         ucCombo_prvnum.setProperty("Cls", Combo_prvnum_Cls);
         ucCombo_prvnum.setProperty("DropDownOptionsData", AV44PrvNum_Data);
         ucCombo_prvnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prvnum_Internalname, "COMBO_PRVNUMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprvnum_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prvnum_to_Internalname, httpContext.getMessage( "Proveedor Final", ""), "", "", lblTextblockcombo_prvnum_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prvnum_to.setProperty("Caption", Combo_prvnum_to_Caption);
         ucCombo_prvnum_to.setProperty("Cls", Combo_prvnum_to_Cls);
         ucCombo_prvnum_to.setProperty("DropDownOptionsData", AV46PrvNum_to_Data);
         ucCombo_prvnum_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prvnum_to_Internalname, "COMBO_PRVNUM_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMes_Internalname, httpContext.getMessage( "Mes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMes_Internalname, GXutil.ltrim( localUtil.ntoc( AV12Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12Mes), "99") : localUtil.format( DecimalUtil.doubleToDec(AV12Mes), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAny_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAny_Internalname, httpContext.getMessage( "Año", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAny_Internalname, GXutil.ltrim( localUtil.ntoc( AV5Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5Any), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5Any), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAny_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ComprasQuimicos\\WebWCO0003.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportar_Internalname, "", httpContext.getMessage( "Exportar", ""), bttBtnexportar_Jsonclick, 5, httpContext.getMessage( "Exportar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", httpContext.getMessage( "PDF", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ComprasQuimicos\\WebWCO0003.htm");
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
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV32PrdNum), GXutil.rtrim( localUtil.format( AV32PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrdnum_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ComprasQuimicos\\WebWCO0003.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_to_Internalname, GXutil.rtrim( AV33PrdNum_to), GXutil.rtrim( localUtil.format( AV33PrdNum_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrdnum_to_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ComprasQuimicos\\WebWCO0003.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV34PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34PrvNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrvnum_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ComprasQuimicos\\WebWCO0003.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV35PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35PrvNum_to), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrvnum_to_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ComprasQuimicos\\WebWCO0003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startZ52( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe Compres Mes y Acumulados", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupZ50( ) ;
   }

   public void wsZ52( )
   {
      startZ52( ) ;
      evtZ52( ) ;
   }

   public void evtZ52( )
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
                           e11Z52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportar' */
                           e12Z52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPDF' */
                           e13Z52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e14Z52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e15Z52 ();
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

   public void weZ52( )
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

   public void paZ52( )
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
            GX_FocusControl = edtavMes_Internalname ;
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
      rfZ52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   public void rfZ52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e15Z52 ();
         wbZ50( ) ;
      }
   }

   public void send_integrity_lvl_hashesZ52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG0", GXutil.rtrim( AV13msg0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg0, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV14msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNPROV", GXutil.ltrim( localUtil.ntoc( AV20Nprov, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNPROV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Nprov), "9")));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupZ50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11Z52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV51DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV47PrdNum_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_TO_DATA"), AV48PrdNum_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRVNUM_DATA"), AV44PrvNum_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRVNUM_TO_DATA"), AV46PrvNum_to_Data);
         /* Read saved values. */
         Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
         Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
         Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
         Combo_prdnum_to_Cls = httpContext.cgiGet( "COMBO_PRDNUM_TO_Cls") ;
         Combo_prdnum_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_TO_Selectedvalue_set") ;
         Combo_prdnum_to_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_TO_Emptyitemtext") ;
         Combo_prvnum_Cls = httpContext.cgiGet( "COMBO_PRVNUM_Cls") ;
         Combo_prvnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRVNUM_Selectedvalue_set") ;
         Combo_prvnum_to_Cls = httpContext.cgiGet( "COMBO_PRVNUM_TO_Cls") ;
         Combo_prvnum_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRVNUM_TO_Selectedvalue_set") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMES");
            GX_FocusControl = edtavMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12Mes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Mes), 2, 0));
         }
         else
         {
            AV12Mes = (byte)(localUtil.ctol( httpContext.cgiGet( edtavMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Mes), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vANY");
            GX_FocusControl = edtavAny_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5Any = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Any), 4, 0));
         }
         else
         {
            AV5Any = (short)(localUtil.ctol( httpContext.cgiGet( edtavAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Any), 4, 0));
         }
         AV32PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32PrdNum", AV32PrdNum);
         AV33PrdNum_to = httpContext.cgiGet( edtavPrdnum_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33PrdNum_to", AV33PrdNum_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRVNUM");
            GX_FocusControl = edtavPrvnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34PrvNum), 6, 0));
         }
         else
         {
            AV34PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavPrvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34PrvNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrvnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrvnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRVNUM_TO");
            GX_FocusControl = edtavPrvnum_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35PrvNum_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PrvNum_to), 6, 0));
         }
         else
         {
            AV35PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavPrvnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PrvNum_to), 6, 0));
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
      e11Z52 ();
      if (returnInSub) return;
   }

   public void e11Z52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwco0003_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV28EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwco0003_impl.this.AV28EmprCod = GXv_char2[0] ;
      webwco0003_impl.this.AV29EmprNom = GXv_char3[0] ;
      webwco0003_impl.this.AV30UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      GXt_int5 = AV20Nprov ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV28EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int6) ;
      webwco0003_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20Nprov = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Nprov", GXutil.str( AV20Nprov, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNPROV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Nprov), "9")));
      GXt_char1 = AV13msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG122_", ""), (byte)(99), GXv_char4) ;
      webwco0003_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13msg0", AV13msg0);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg0, ""))));
      GXt_char1 = AV14msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG006_", ""), (byte)(99), GXv_char4) ;
      webwco0003_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14msg1", AV14msg1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14msg1, ""))));
      GXt_char1 = AV15msg2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG172_", ""), (byte)(99), GXv_char4) ;
      webwco0003_impl.this.GXt_char1 = GXv_char4[0] ;
      AV15msg2 = GXt_char1 ;
      GXt_char1 = AV16msg3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG030_", ""), (byte)(99), GXv_char4) ;
      webwco0003_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16msg3 = GXt_char1 ;
      GXt_char1 = AV17msg4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG103_", ""), (byte)(99), GXv_char4) ;
      webwco0003_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17msg4 = GXt_char1 ;
      GXt_char1 = AV18msg5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG102_", ""), (byte)(99), GXv_char4) ;
      webwco0003_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18msg5 = GXt_char1 ;
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwco0003_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      GXv_char4[0] = AV28EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char2[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwco0003_impl.this.AV28EmprCod = GXv_char4[0] ;
      webwco0003_impl.this.AV29EmprNom = GXv_char3[0] ;
      webwco0003_impl.this.AV30UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      edtavPrvnum_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrvnum_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_to_Visible), 5, 0), true);
      edtavPrvnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrvnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV51DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV51DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      edtavPrdnum_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_to_Visible), 5, 0), true);
      edtavPrdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPRDNUM_TO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPRVNUM' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPRVNUM_TO' */
      S142 ();
      if (returnInSub) return;
      AV12Mes = (byte)(GXutil.month( Gx_date)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Mes), 2, 0));
      AV5Any = (short)(GXutil.year( Gx_date)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Any), 4, 0));
   }

   public void e12Z52( )
   {
      /* 'DoExportar' Routine */
      returnInSub = false ;
      AV42QueMostrar = httpContext.getMessage( "XLS", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42QueMostrar", AV42QueMostrar);
      AV43ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV43ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV43ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
      AV43ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operación", ""));
      AV43ProgressIndicator.show();
      AV43ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
      /* Execute user subroutine: 'MOSTRAR' */
      S152 ();
      if (returnInSub) return;
      AV43ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV43ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43ProgressIndicator", AV43ProgressIndicator);
   }

   public void e13Z52( )
   {
      /* 'DoPDF' Routine */
      returnInSub = false ;
      AV42QueMostrar = httpContext.getMessage( "PDF", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42QueMostrar", AV42QueMostrar);
      AV43ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV43ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV43ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
      AV43ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operación", ""));
      AV43ProgressIndicator.show();
      AV43ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
      /* Execute user subroutine: 'MOSTRAR' */
      S152 ();
      if (returnInSub) return;
      AV43ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV43ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43ProgressIndicator", AV43ProgressIndicator);
   }

   public void e14Z52( )
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

   public void S142( )
   {
      /* 'LOADCOMBOPRVNUM_TO' Routine */
      returnInSub = false ;
      /* Using cursor H00Z52 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14216PrvAct = H00Z52_A14216PrvAct[0] ;
         A13719PrvNNom = H00Z52_A13719PrvNNom[0] ;
         A795PrvNum = H00Z52_A795PrvNum[0] ;
         A794PrvNom = H00Z52_A794PrvNom[0] ;
         n794PrvNom = H00Z52_n794PrvNom[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13719PrvNNom );
         AV46PrvNum_to_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_prvnum_to_Selectedvalue_set = ((0==AV35PrvNum_to) ? "" : GXutil.trim( GXutil.str( AV35PrvNum_to, 6, 0))) ;
      ucCombo_prvnum_to.sendProperty(context, "", false, Combo_prvnum_to_Internalname, "SelectedValue_set", Combo_prvnum_to_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOPRVNUM' Routine */
      returnInSub = false ;
      /* Using cursor H00Z53 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14216PrvAct = H00Z53_A14216PrvAct[0] ;
         A13719PrvNNom = H00Z53_A13719PrvNNom[0] ;
         A795PrvNum = H00Z53_A795PrvNum[0] ;
         A794PrvNom = H00Z53_A794PrvNom[0] ;
         n794PrvNom = H00Z53_n794PrvNom[0] ;
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13719PrvNNom );
         AV44PrvNum_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_prvnum_Selectedvalue_set = ((0==AV34PrvNum) ? "" : GXutil.trim( GXutil.str( AV34PrvNum, 6, 0))) ;
      ucCombo_prvnum.sendProperty(context, "", false, Combo_prvnum_Internalname, "SelectedValue_set", Combo_prvnum_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOPRDNUM_TO' Routine */
      returnInSub = false ;
      AV48PrdNum_to_Data.clear();
      /* Using cursor H00Z54 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A856ValCod = H00Z54_A856ValCod[0] ;
         A718PrdNom = H00Z54_A718PrdNom[0] ;
         A719PrdNum = H00Z54_A719PrdNum[0] ;
         A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV48PrdNum_to_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV48PrdNum_to_Data.sort("Title");
      Combo_prdnum_to_Selectedvalue_set = AV33PrdNum_to ;
      ucCombo_prdnum_to.sendProperty(context, "", false, Combo_prdnum_to_Internalname, "SelectedValue_set", Combo_prdnum_to_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      AV47PrdNum_Data.clear();
      /* Using cursor H00Z55 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A856ValCod = H00Z55_A856ValCod[0] ;
         A718PrdNom = H00Z55_A718PrdNom[0] ;
         A719PrdNum = H00Z55_A719PrdNum[0] ;
         A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
         AV45Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV45Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV47PrdNum_Data.add(AV45Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV47PrdNum_Data.sort("Title");
      Combo_prdnum_Selectedvalue_set = AV32PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'MOSTRAR' Routine */
      returnInSub = false ;
      if ( (0==AV12Mes) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Valor Nulo", ""));
         GX_FocusControl = edtavMes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV12Mes < 1 ) && ( AV12Mes > 12 ) )
         {
            httpContext.GX_msglist.addItem(AV13msg0);
         }
         else
         {
            if ( (0==AV5Any) )
            {
               httpContext.GX_msglist.addItem(AV14msg1);
            }
            else
            {
               AV24UProd1 = ((GXutil.strcmp("", AV33PrdNum_to)==0) ? "999999" : AV33PrdNum_to) ;
               AV26UProv1 = ((0==AV35PrvNum_to) ? 999999 : AV35PrvNum_to) ;
               if ( GXutil.strcmp(AV42QueMostrar, httpContext.getMessage( "PDF", "")) == 0 )
               {
                  if ( AV20Nprov == 0 )
                  {
                     httpContext.popup(formatLink("app.rco0003", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV31ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV32PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV24UProd1)),GXutil.URLEncode(GXutil.ltrimstr(AV34PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26UProv1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5Any,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12Mes,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38Font,2,0))}, new String[] {"EmprCod","ImpCod","PProd","UProd","PProv","UProv","Any","Mes","Font"}) , new Object[] {"AV28EmprCod","AV31ImpCod","AV32PrdNum","AV24UProd1","AV34PrvNum","AV26UProv1","AV5Any","AV12Mes","AV38Font"});
                  }
                  else
                  {
                     httpContext.popup(formatLink("app.rco0003n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV31ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV32PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV24UProd1)),GXutil.URLEncode(GXutil.ltrimstr(AV34PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26UProv1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5Any,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12Mes,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38Font,2,0))}, new String[] {"EmprCod","ImpCod","PProd","UProd","PProv","UProv","Any","Mes","Font"}) , new Object[] {"AV28EmprCod","AV31ImpCod","AV32PrdNum","AV24UProd1","AV34PrvNum","AV26UProv1","AV5Any","AV12Mes","AV38Font"});
                  }
               }
               else if ( GXutil.strcmp(AV42QueMostrar, httpContext.getMessage( "XLS", "")) == 0 )
               {
                  if ( AV20Nprov == 0 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta objeto", ""));
                  }
                  else
                  {
                     GXv_char4[0] = AV49ExcelFilename ;
                     GXv_char3[0] = AV50ErrorMessage ;
                     new app.comprasquimicos.informecomprasmes_export(remoteHandle, context).execute( AV28EmprCod, AV32PrdNum, AV24UProd1, AV34PrvNum, AV26UProv1, AV5Any, AV12Mes, GXv_char4, GXv_char3) ;
                     webwco0003_impl.this.AV49ExcelFilename = GXv_char4[0] ;
                     webwco0003_impl.this.AV50ErrorMessage = GXv_char3[0] ;
                     if ( GXutil.strcmp(AV49ExcelFilename, "") != 0 )
                     {
                        callWebObject(formatLink(AV49ExcelFilename, new String[] {}, new String[] {}) );
                        httpContext.wjLocDisableFrm = (byte)(0) ;
                     }
                     else
                     {
                        httpContext.GX_msglist.addItem(AV50ErrorMessage);
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Opción no configurada", ""));
               }
            }
         }
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e15Z52( )
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
      paZ52( ) ;
      wsZ52( ) ;
      weZ52( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714191130", true, true);
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
      httpContext.AddJavascriptSource("comprasquimicos/webwco0003.js", "?202681714191130", false, true);
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
      lblTextblockcombo_prdnum_Internalname = "TEXTBLOCKCOMBO_PRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      lblTextblockcombo_prdnum_to_Internalname = "TEXTBLOCKCOMBO_PRDNUM_TO" ;
      Combo_prdnum_to_Internalname = "COMBO_PRDNUM_TO" ;
      divTablesplittedprdnum_to_Internalname = "TABLESPLITTEDPRDNUM_TO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockcombo_prvnum_Internalname = "TEXTBLOCKCOMBO_PRVNUM" ;
      Combo_prvnum_Internalname = "COMBO_PRVNUM" ;
      divTablesplittedprvnum_Internalname = "TABLESPLITTEDPRVNUM" ;
      lblTextblockcombo_prvnum_to_Internalname = "TEXTBLOCKCOMBO_PRVNUM_TO" ;
      Combo_prvnum_to_Internalname = "COMBO_PRVNUM_TO" ;
      divTablesplittedprvnum_to_Internalname = "TABLESPLITTEDPRVNUM_TO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavMes_Internalname = "vMES" ;
      edtavAny_Internalname = "vANY" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnexportar_Internalname = "BTNEXPORTAR" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Datamon_Internalname = "DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      edtavPrdnum_to_Internalname = "vPRDNUM_TO" ;
      edtavPrvnum_Internalname = "vPRVNUM" ;
      edtavPrvnum_to_Internalname = "vPRVNUM_TO" ;
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
      edtavPrvnum_to_Jsonclick = "" ;
      edtavPrvnum_to_Visible = 1 ;
      edtavPrvnum_Jsonclick = "" ;
      edtavPrvnum_Visible = 1 ;
      edtavPrdnum_to_Jsonclick = "" ;
      edtavPrdnum_to_Visible = 1 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Visible = 1 ;
      edtavAny_Jsonclick = "" ;
      edtavAny_Enabled = 1 ;
      edtavMes_Jsonclick = "" ;
      edtavMes_Enabled = 1 ;
      Combo_prdnum_to_Caption = "" ;
      Combo_prdnum_Caption = "" ;
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
      Combo_prvnum_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prvnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prdnum_to_Emptyitemtext = "Todos" ;
      Combo_prdnum_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prdnum_Emptyitemtext = "Todos" ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe Compres Mes y Acumulados", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV13msg0',fld:'vMSG0',pic:'',hsh:true},{av:'AV14msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV20Nprov',fld:'vNPROV',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOEXPORTAR'","{handler:'e12Z52',iparms:[{av:'AV12Mes',fld:'vMES',pic:'99'},{av:'AV13msg0',fld:'vMSG0',pic:'',hsh:true},{av:'AV5Any',fld:'vANY',pic:'ZZZ9'},{av:'AV14msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV33PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV35PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV42QueMostrar',fld:'vQUEMOSTRAR',pic:''},{av:'AV20Nprov',fld:'vNPROV',pic:'9',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31ImpCod',fld:'vIMPCOD',pic:''},{av:'AV32PrdNum',fld:'vPRDNUM',pic:''},{av:'AV34PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV38Font',fld:'vFONT',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTAR'",",oparms:[{av:'AV42QueMostrar',fld:'vQUEMOSTRAR',pic:''},{av:'AV38Font',fld:'vFONT',pic:'Z9'},{av:'AV12Mes',fld:'vMES',pic:'99'},{av:'AV5Any',fld:'vANY',pic:'ZZZ9'},{av:'AV34PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV32PrdNum',fld:'vPRDNUM',pic:''},{av:'AV31ImpCod',fld:'vIMPCOD',pic:''},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPDF'","{handler:'e13Z52',iparms:[{av:'AV12Mes',fld:'vMES',pic:'99'},{av:'AV13msg0',fld:'vMSG0',pic:'',hsh:true},{av:'AV5Any',fld:'vANY',pic:'ZZZ9'},{av:'AV14msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV33PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV35PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV42QueMostrar',fld:'vQUEMOSTRAR',pic:''},{av:'AV20Nprov',fld:'vNPROV',pic:'9',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31ImpCod',fld:'vIMPCOD',pic:''},{av:'AV32PrdNum',fld:'vPRDNUM',pic:''},{av:'AV34PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV38Font',fld:'vFONT',pic:'Z9'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV42QueMostrar',fld:'vQUEMOSTRAR',pic:''},{av:'AV38Font',fld:'vFONT',pic:'Z9'},{av:'AV12Mes',fld:'vMES',pic:'99'},{av:'AV5Any',fld:'vANY',pic:'ZZZ9'},{av:'AV34PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV32PrdNum',fld:'vPRDNUM',pic:''},{av:'AV31ImpCod',fld:'vIMPCOD',pic:''},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e14Z52',iparms:[]");
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
      Combo_prvnum_to_Selectedvalue_get = "" ;
      Combo_prvnum_Selectedvalue_get = "" ;
      Combo_prdnum_to_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV13msg0 = "" ;
      AV14msg1 = "" ;
      GXKey = "" ;
      AV51DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV47PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV48PrdNum_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV44PrvNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV46PrvNum_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV42QueMostrar = "" ;
      AV28EmprCod = "" ;
      AV31ImpCod = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_to_Selectedvalue_set = "" ;
      Combo_prvnum_Selectedvalue_set = "" ;
      Combo_prvnum_to_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_prdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_prdnum_to_Jsonclick = "" ;
      ucCombo_prdnum_to = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_prvnum_Jsonclick = "" ;
      ucCombo_prvnum = new com.genexus.webpanels.GXUserControl();
      Combo_prvnum_Caption = "" ;
      lblTextblockcombo_prvnum_to_Jsonclick = "" ;
      ucCombo_prvnum_to = new com.genexus.webpanels.GXUserControl();
      Combo_prvnum_to_Caption = "" ;
      TempTags = "" ;
      bttBtnexportar_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV32PrdNum = "" ;
      AV33PrdNum_to = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      AV27Station = "" ;
      AV29EmprNom = "" ;
      AV30UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV15msg2 = "" ;
      AV16msg3 = "" ;
      AV17msg4 = "" ;
      AV18msg5 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV43ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H00Z52_A396EmprCod = new String[] {""} ;
      H00Z52_A14216PrvAct = new String[] {""} ;
      H00Z52_A13719PrvNNom = new String[] {""} ;
      H00Z52_A795PrvNum = new int[1] ;
      H00Z52_A794PrvNom = new String[] {""} ;
      H00Z52_n794PrvNom = new boolean[] {false} ;
      A14216PrvAct = "" ;
      A13719PrvNNom = "" ;
      A794PrvNom = "" ;
      AV45Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H00Z53_A396EmprCod = new String[] {""} ;
      H00Z53_A14216PrvAct = new String[] {""} ;
      H00Z53_A13719PrvNNom = new String[] {""} ;
      H00Z53_A795PrvNum = new int[1] ;
      H00Z53_A794PrvNom = new String[] {""} ;
      H00Z53_n794PrvNom = new boolean[] {false} ;
      H00Z54_A396EmprCod = new String[] {""} ;
      H00Z54_A856ValCod = new byte[1] ;
      H00Z54_A718PrdNom = new String[] {""} ;
      H00Z54_A719PrdNum = new String[] {""} ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A13747PrdCDsc = "" ;
      H00Z55_A396EmprCod = new String[] {""} ;
      H00Z55_A856ValCod = new byte[1] ;
      H00Z55_A718PrdNom = new String[] {""} ;
      H00Z55_A719PrdNum = new String[] {""} ;
      AV24UProd1 = "" ;
      AV49ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      AV50ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.webwco0003__default(),
         new Object[] {
             new Object[] {
            H00Z52_A396EmprCod, H00Z52_A14216PrvAct, H00Z52_A13719PrvNNom, H00Z52_A795PrvNum, H00Z52_A794PrvNom, H00Z52_n794PrvNom
            }
            , new Object[] {
            H00Z53_A396EmprCod, H00Z53_A14216PrvAct, H00Z53_A13719PrvNNom, H00Z53_A795PrvNum, H00Z53_A794PrvNom, H00Z53_n794PrvNom
            }
            , new Object[] {
            H00Z54_A396EmprCod, H00Z54_A856ValCod, H00Z54_A718PrdNom, H00Z54_A719PrdNum
            }
            , new Object[] {
            H00Z55_A396EmprCod, H00Z55_A856ValCod, H00Z55_A718PrdNom, H00Z55_A719PrdNum
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV20Nprov ;
   private byte AV38Font ;
   private byte AV12Mes ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A856ValCod ;
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
   private short AV5Any ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavMes_Enabled ;
   private int edtavAny_Enabled ;
   private int edtavPrdnum_Visible ;
   private int edtavPrdnum_to_Visible ;
   private int AV34PrvNum ;
   private int edtavPrvnum_Visible ;
   private int AV35PrvNum_to ;
   private int edtavPrvnum_to_Visible ;
   private int A795PrvNum ;
   private int AV26UProv1 ;
   private int idxLst ;
   private String Combo_prvnum_to_Selectedvalue_get ;
   private String Combo_prvnum_Selectedvalue_get ;
   private String Combo_prdnum_to_Selectedvalue_get ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV13msg0 ;
   private String AV14msg1 ;
   private String GXKey ;
   private String AV28EmprCod ;
   private String AV31ImpCod ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_to_Cls ;
   private String Combo_prdnum_to_Selectedvalue_set ;
   private String Combo_prdnum_to_Emptyitemtext ;
   private String Combo_prvnum_Cls ;
   private String Combo_prvnum_Selectedvalue_set ;
   private String Combo_prvnum_to_Cls ;
   private String Combo_prvnum_to_Selectedvalue_set ;
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
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Internalname ;
   private String divTablesplittedprdnum_to_Internalname ;
   private String lblTextblockcombo_prdnum_to_Internalname ;
   private String lblTextblockcombo_prdnum_to_Jsonclick ;
   private String Combo_prdnum_to_Caption ;
   private String Combo_prdnum_to_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedprvnum_Internalname ;
   private String lblTextblockcombo_prvnum_Internalname ;
   private String lblTextblockcombo_prvnum_Jsonclick ;
   private String Combo_prvnum_Caption ;
   private String Combo_prvnum_Internalname ;
   private String divTablesplittedprvnum_to_Internalname ;
   private String lblTextblockcombo_prvnum_to_Internalname ;
   private String lblTextblockcombo_prvnum_to_Jsonclick ;
   private String Combo_prvnum_to_Caption ;
   private String Combo_prvnum_to_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavMes_Internalname ;
   private String TempTags ;
   private String edtavMes_Jsonclick ;
   private String edtavAny_Internalname ;
   private String edtavAny_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnexportar_Internalname ;
   private String bttBtnexportar_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String Datamon_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPrdnum_Internalname ;
   private String AV32PrdNum ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdnum_to_Internalname ;
   private String AV33PrdNum_to ;
   private String edtavPrdnum_to_Jsonclick ;
   private String edtavPrvnum_Internalname ;
   private String edtavPrvnum_Jsonclick ;
   private String edtavPrvnum_to_Internalname ;
   private String edtavPrvnum_to_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV27Station ;
   private String AV29EmprNom ;
   private String AV30UsurCod ;
   private String AV15msg2 ;
   private String AV16msg3 ;
   private String AV17msg4 ;
   private String AV18msg5 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A14216PrvAct ;
   private String A794PrvNom ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV24UProd1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Gx_date ;
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
   private boolean n794PrvNom ;
   private String AV42QueMostrar ;
   private String A13719PrvNNom ;
   private String A13747PrdCDsc ;
   private String AV49ExcelFilename ;
   private String AV50ErrorMessage ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_prvnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_prvnum_to ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV43ProgressIndicator ;
   private IDataStoreProvider pr_default ;
   private String[] H00Z52_A396EmprCod ;
   private String[] H00Z52_A14216PrvAct ;
   private String[] H00Z52_A13719PrvNNom ;
   private int[] H00Z52_A795PrvNum ;
   private String[] H00Z52_A794PrvNom ;
   private boolean[] H00Z52_n794PrvNom ;
   private String[] H00Z53_A396EmprCod ;
   private String[] H00Z53_A14216PrvAct ;
   private String[] H00Z53_A13719PrvNNom ;
   private int[] H00Z53_A795PrvNum ;
   private String[] H00Z53_A794PrvNom ;
   private boolean[] H00Z53_n794PrvNom ;
   private String[] H00Z54_A396EmprCod ;
   private byte[] H00Z54_A856ValCod ;
   private String[] H00Z54_A718PrdNom ;
   private String[] H00Z54_A719PrdNum ;
   private String[] H00Z55_A396EmprCod ;
   private byte[] H00Z55_A856ValCod ;
   private String[] H00Z55_A718PrdNom ;
   private String[] H00Z55_A719PrdNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48PrdNum_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV44PrvNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46PrvNum_to_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV45Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV51DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class webwco0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00Z52", "SELECT EmprCod, PrvAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, PrvNum, PrvNom FROM TXPPRVGEN WHERE PrvAct = 'S' ORDER BY PrvNNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00Z53", "SELECT EmprCod, PrvAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, PrvNum, PrvNom FROM TXPPRVGEN WHERE PrvAct = 'S' ORDER BY PrvNNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00Z54", "SELECT EmprCod, ValCod, PrdNom, PrdNum FROM TXPPRODUC WHERE (PrdNum >= '100000') AND (PrdNum <= '999999') AND (SUBSTR(PrdNum, 1, 1) <> '#') AND (ValCod >= 1) AND (ValCod <= 2) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00Z55", "SELECT EmprCod, ValCod, PrdNom, PrdNum FROM TXPPRODUC WHERE (PrdNum >= '100000') AND (PrdNum <= '999999') AND (SUBSTR(PrdNum, 1, 1) <> '#') AND (ValCod >= 1) AND (ValCod <= 2) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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

