package app.albaranesproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionguiamoda21_impl extends GXDataArea
{
   public impresionguiamoda21_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impresionguiamoda21_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionguiamoda21_impl.class ));
   }

   public impresionguiamoda21_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPrio = new HTMLChoice();
      cmbavManaut = new HTMLChoice();
      chkavVermail = UIFactory.getCheckbox(this);
      chkavSdtimpressionguia__clivala = UIFactory.getCheckbox(this);
      chkavSdtimpressionguia__climailgre = UIFactory.getCheckbox(this);
      chkavSdtimpressionguia__climailpke = UIFactory.getCheckbox(this);
      chkavSdtimpressionguia__bartipcor = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtimpressionguias") == 0 )
         {
            gxnrgridsdtimpressionguias_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtimpressionguias") == 0 )
         {
            gxgrgridsdtimpressionguias_refresh_invoke( ) ;
            return  ;
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

   public void gxnrgridsdtimpressionguias_newrow_invoke( )
   {
      nRC_GXsfl_127 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_127"))) ;
      nGXsfl_127_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_127_idx"))) ;
      sGXsfl_127_idx = httpContext.GetPar( "sGXsfl_127_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtimpressionguias_newrow( ) ;
      /* End function gxnrGridsdtimpressionguias_newrow_invoke */
   }

   public void gxgrgridsdtimpressionguias_refresh_invoke( )
   {
      subGridsdtimpressionguias_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtimpressionguias_Rows"))) ;
      AV40VerMail = GXutil.strtobool( httpContext.GetPar( "VerMail")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtimpressionguias_refresh( subGridsdtimpressionguias_Rows, AV40VerMail) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtimpressionguias_refresh_invoke */
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
      pa1ZY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1ZY2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranesproduccion.impresionguiamoda21", new String[] {}, new String[] {}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtimpressionguia", AV46SDTImpressionGuia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtimpressionguia", AV46SDTImpressionGuia);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_127", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV6CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV6CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV15CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV15CliCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTIMPRESSIONGUIASCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV49GridSDTImpressionGuiasCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTIMPRESSIONGUIASPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV50GridSDTImpressionGuiasPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTIMPRESSIONGUIA", AV46SDTImpressionGuia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTIMPRESSIONGUIA", AV46SDTImpressionGuia);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtimpressionguiaspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtimpressionguiaspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtimpressionguiaspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtimpressionguiaspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtimpressionguiaspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtimpressionguiaspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Width", GXutil.rtrim( Dvpanel_tablegrid_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Autowidth", GXutil.booltostr( Dvpanel_tablegrid_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Autoheight", GXutil.booltostr( Dvpanel_tablegrid_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Cls", GXutil.rtrim( Dvpanel_tablegrid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Title", GXutil.rtrim( Dvpanel_tablegrid_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Collapsible", GXutil.booltostr( Dvpanel_tablegrid_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Collapsed", GXutil.booltostr( Dvpanel_tablegrid_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Showcollapseicon", GXutil.booltostr( Dvpanel_tablegrid_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Iconposition", GXutil.rtrim( Dvpanel_tablegrid_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGRID_Autoscroll", GXutil.booltostr( Dvpanel_tablegrid_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtimpressionguias_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtimpressionguiaspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we1ZY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1ZY2( ) ;
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
      return formatLink("app.albaranesproduccion.impresionguiamoda21", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AlbaranesProduccion.ImpresionGuiaModa21" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impresion Guia", "") ;
   }

   public void wb1ZY0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV6CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV15CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchfrom_Internalname, localUtil.format(AV12AlbProfchfrom, "99/99/99"), localUtil.format( AV12AlbProfchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchto_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchto_Internalname, localUtil.format(AV13AlbProfchto, "99/99/99"), localUtil.format( AV13AlbProfchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodfrom_Internalname, httpContext.getMessage( "Nº Documento Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV10AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10AlbProCodfrom), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10AlbProCodfrom), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodfrom_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodto_Internalname, httpContext.getMessage( "Nº Documento Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV11AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11AlbProCodto), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11AlbProCodto), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodto_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPrio.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrio, cmbavPrio.getInternalname(), GXutil.rtrim( AV17PRIO), 1, cmbavPrio.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrio.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         cmbavPrio.setValue( GXutil.rtrim( AV17PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopias2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopias2_Internalname, httpContext.getMessage( "Copias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV8Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCopias2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8Copias2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8Copias2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopias2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavManaut.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavManaut.getInternalname(), httpContext.getMessage( "Tipo de Impresion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavManaut, cmbavManaut.getInternalname(), GXutil.rtrim( AV9ManAut), 1, cmbavManaut.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavManaut.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "", true, (byte)(0), "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         cmbavManaut.setValue( GXutil.rtrim( AV9ManAut) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavManaut.getInternalname(), "Values", cmbavManaut.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divMail_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavVermail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVermail.getInternalname(), httpContext.getMessage( "Veja a ecran de envio de correio?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV40VerMail), "", httpContext.getMessage( "Veja a ecran de envio de correio?", ""), 1, chkavVermail.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(90, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,90);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPathpdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPathpdf_Internalname, httpContext.getMessage( "Path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV38PATHPDF), GXutil.rtrim( localUtil.format( AV38PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPathpdf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "gx.evt.setGridEvt("+GXutil.str( 127, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 127, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
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
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinfo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableresultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablegrid.setProperty("Width", Dvpanel_tablegrid_Width);
         ucDvpanel_tablegrid.setProperty("AutoWidth", Dvpanel_tablegrid_Autowidth);
         ucDvpanel_tablegrid.setProperty("AutoHeight", Dvpanel_tablegrid_Autoheight);
         ucDvpanel_tablegrid.setProperty("Cls", Dvpanel_tablegrid_Cls);
         ucDvpanel_tablegrid.setProperty("Title", Dvpanel_tablegrid_Title);
         ucDvpanel_tablegrid.setProperty("Collapsible", Dvpanel_tablegrid_Collapsible);
         ucDvpanel_tablegrid.setProperty("Collapsed", Dvpanel_tablegrid_Collapsed);
         ucDvpanel_tablegrid.setProperty("ShowCollapseIcon", Dvpanel_tablegrid_Showcollapseicon);
         ucDvpanel_tablegrid.setProperty("IconPosition", Dvpanel_tablegrid_Iconposition);
         ucDvpanel_tablegrid.setProperty("AutoScroll", Dvpanel_tablegrid_Autoscroll);
         ucDvpanel_tablegrid.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablegrid_Internalname, "DVPANEL_TABLEGRIDContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEGRIDContainer"+"TableGrid"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegrid_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdtimpressionguiastablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtimpressionguiasContainer.SetWrapped(nGXWrapped);
         startgridcontrol127( ) ;
      }
      if ( wbEnd == 127 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_127 = (int)(nGXsfl_127_idx-1) ;
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV53GXV1 = nGXsfl_127_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridsdtimpressionguiasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsdtimpressionguias", GridsdtimpressionguiasContainer, subGridsdtimpressionguias_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtimpressionguiasContainerData", GridsdtimpressionguiasContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtimpressionguiasContainerData"+"V", GridsdtimpressionguiasContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtimpressionguiasContainerData"+"V"+"\" value='"+GridsdtimpressionguiasContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtimpressionguiaspaginationbar.setProperty("Class", Gridsdtimpressionguiaspaginationbar_Class);
         ucGridsdtimpressionguiaspaginationbar.setProperty("ShowFirst", Gridsdtimpressionguiaspaginationbar_Showfirst);
         ucGridsdtimpressionguiaspaginationbar.setProperty("ShowPrevious", Gridsdtimpressionguiaspaginationbar_Showprevious);
         ucGridsdtimpressionguiaspaginationbar.setProperty("ShowNext", Gridsdtimpressionguiaspaginationbar_Shownext);
         ucGridsdtimpressionguiaspaginationbar.setProperty("ShowLast", Gridsdtimpressionguiaspaginationbar_Showlast);
         ucGridsdtimpressionguiaspaginationbar.setProperty("PagesToShow", Gridsdtimpressionguiaspaginationbar_Pagestoshow);
         ucGridsdtimpressionguiaspaginationbar.setProperty("PagingButtonsPosition", Gridsdtimpressionguiaspaginationbar_Pagingbuttonsposition);
         ucGridsdtimpressionguiaspaginationbar.setProperty("PagingCaptionPosition", Gridsdtimpressionguiaspaginationbar_Pagingcaptionposition);
         ucGridsdtimpressionguiaspaginationbar.setProperty("EmptyGridClass", Gridsdtimpressionguiaspaginationbar_Emptygridclass);
         ucGridsdtimpressionguiaspaginationbar.setProperty("RowsPerPageSelector", Gridsdtimpressionguiaspaginationbar_Rowsperpageselector);
         ucGridsdtimpressionguiaspaginationbar.setProperty("RowsPerPageOptions", Gridsdtimpressionguiaspaginationbar_Rowsperpageoptions);
         ucGridsdtimpressionguiaspaginationbar.setProperty("Previous", Gridsdtimpressionguiaspaginationbar_Previous);
         ucGridsdtimpressionguiaspaginationbar.setProperty("Next", Gridsdtimpressionguiaspaginationbar_Next);
         ucGridsdtimpressionguiaspaginationbar.setProperty("Caption", Gridsdtimpressionguiaspaginationbar_Caption);
         ucGridsdtimpressionguiaspaginationbar.setProperty("EmptyGridCaption", Gridsdtimpressionguiaspaginationbar_Emptygridcaption);
         ucGridsdtimpressionguiaspaginationbar.setProperty("RowsPerPageCaption", Gridsdtimpressionguiaspaginationbar_Rowsperpagecaption);
         ucGridsdtimpressionguiaspaginationbar.setProperty("CurrentPage", AV49GridSDTImpressionGuiasCurrentPage);
         ucGridsdtimpressionguiaspaginationbar.setProperty("PageCount", AV50GridSDTImpressionGuiasPageCount);
         ucGridsdtimpressionguiaspaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtimpressionguiaspaginationbar_Internalname, "GRIDSDTIMPRESSIONGUIASPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV66Pgmname), GXutil.rtrim( localUtil.format( AV66Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV5CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_127_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlbaranesProduccion\\ImpresionGuiaModa21.htm");
         /* User Defined Control */
         ucGridsdtimpressionguias_empowerer.render(context, "wwp.gridempowerer", Gridsdtimpressionguias_empowerer_Internalname, "GRIDSDTIMPRESSIONGUIAS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 127 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV53GXV1 = nGXsfl_127_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridsdtimpressionguiasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsdtimpressionguias", GridsdtimpressionguiasContainer, subGridsdtimpressionguias_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtimpressionguiasContainerData", GridsdtimpressionguiasContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtimpressionguiasContainerData"+"V", GridsdtimpressionguiasContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtimpressionguiasContainerData"+"V"+"\" value='"+GridsdtimpressionguiasContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1ZY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Impresion Guia", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1ZY0( ) ;
   }

   public void ws1ZY2( )
   {
      start1ZY2( ) ;
      evt1ZY2( ) ;
   }

   public void evt1ZY2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e131ZY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141ZY2 ();
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
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 27), "GRIDSDTIMPRESSIONGUIAS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_127_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1272( ) ;
                           AV53GXV1 = (int)(nGXsfl_127_idx+GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage) ;
                           if ( ( AV46SDTImpressionGuia.size() >= AV53GXV1 ) && ( AV53GXV1 > 0 ) )
                           {
                              AV46SDTImpressionGuia.currentItem( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151ZY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e161ZY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTIMPRESSIONGUIAS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171ZY2 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1ZY2( )
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

   public void pa1ZY2( )
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
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsdtimpressionguias_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1272( ) ;
      while ( nGXsfl_127_idx <= nRC_GXsfl_127 )
      {
         sendrow_1272( ) ;
         nGXsfl_127_idx = ((subGridsdtimpressionguias_Islastpage==1)&&(nGXsfl_127_idx+1>subgridsdtimpressionguias_fnc_recordsperpage( )) ? 1 : nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1272( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtimpressionguiasContainer)) ;
      /* End function gxnrGridsdtimpressionguias_newrow */
   }

   public void gxgrgridsdtimpressionguias_refresh( int subGridsdtimpressionguias_Rows ,
                                                   boolean AV40VerMail )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161ZY2 ();
      GRIDSDTIMPRESSIONGUIAS_nCurrentRecord = 0 ;
      rf1ZY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtimpressionguias_refresh */
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
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV17PRIO = cmbavPrio.getValidValue(AV17PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PRIO", AV17PRIO);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrio.setValue( GXutil.rtrim( AV17PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
      }
      if ( cmbavManaut.getItemCount() > 0 )
      {
         AV9ManAut = cmbavManaut.getValidValue(AV9ManAut) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ManAut", AV9ManAut);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavManaut.setValue( GXutil.rtrim( AV9ManAut) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavManaut.getInternalname(), "Values", cmbavManaut.ToJavascriptSource(), true);
      }
      AV40VerMail = GXutil.strtobool( GXutil.booltostr( AV40VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40VerMail", AV40VerMail);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1ZY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "AlbaranesProduccion.ImpresionGuiaModa21" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      chkavVermail.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "Enabled", GXutil.ltrimstr( chkavVermail.getEnabled(), 5, 0), true);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavSdtimpressionguia__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__albprocod_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__clivala.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__clivala.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__clivala.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__climailgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__climailgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__climailgr_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__climailpk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__climailpk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__climailpk_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__guiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__guiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__guiremcli_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__climailgre.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailgre.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__climailgre.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__climailpke.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailpke.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__climailpke.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__albprofch_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__bartipcor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__bartipcor.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__bartipcor.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__cod_pais_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__cod_pais_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__cod_pais_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__pdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__pdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__pdf_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__excel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__excel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__excel_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1ZY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtimpressionguiasContainer.ClearRows();
      }
      wbStart = (short)(127) ;
      /* Execute user event: Refresh */
      e161ZY2 ();
      nGXsfl_127_idx = 1 ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1272( ) ;
      bGXsfl_127_Refreshing = true ;
      GridsdtimpressionguiasContainer.AddObjectProperty("GridName", "Gridsdtimpressionguias");
      GridsdtimpressionguiasContainer.AddObjectProperty("CmpContext", "");
      GridsdtimpressionguiasContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtimpressionguiasContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtimpressionguiasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtimpressionguiasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtimpressionguiasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtimpressionguiasContainer.setPageSize( subgridsdtimpressionguias_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1272( ) ;
         e171ZY2 ();
         if ( ( GRIDSDTIMPRESSIONGUIAS_nCurrentRecord > 0 ) && ( GRIDSDTIMPRESSIONGUIAS_nGridOutOfScope == 0 ) && ( nGXsfl_127_idx == 1 ) )
         {
            GRIDSDTIMPRESSIONGUIAS_nCurrentRecord = 0 ;
            GRIDSDTIMPRESSIONGUIAS_nGridOutOfScope = 1 ;
            subgridsdtimpressionguias_firstpage( ) ;
            e171ZY2 ();
         }
         wbEnd = (short)(127) ;
         wb1ZY0( ) ;
      }
      bGXsfl_127_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1ZY2( )
   {
   }

   public int subgridsdtimpressionguias_fnc_pagecount( )
   {
      GRIDSDTIMPRESSIONGUIAS_nRecordCount = subgridsdtimpressionguias_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTIMPRESSIONGUIAS_nRecordCount) % (subgridsdtimpressionguias_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTIMPRESSIONGUIAS_nRecordCount/ (double) (subgridsdtimpressionguias_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTIMPRESSIONGUIAS_nRecordCount/ (double) (subgridsdtimpressionguias_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtimpressionguias_fnc_recordcount( )
   {
      return AV46SDTImpressionGuia.size() ;
   }

   public int subgridsdtimpressionguias_fnc_recordsperpage( )
   {
      if ( subGridsdtimpressionguias_Rows > 0 )
      {
         return subGridsdtimpressionguias_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtimpressionguias_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage/ (double) (subgridsdtimpressionguias_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtimpressionguias_firstpage( )
   {
      GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtimpressionguias_refresh( subGridsdtimpressionguias_Rows, AV40VerMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtimpressionguias_nextpage( )
   {
      GRIDSDTIMPRESSIONGUIAS_nRecordCount = subgridsdtimpressionguias_fnc_recordcount( ) ;
      if ( ( GRIDSDTIMPRESSIONGUIAS_nRecordCount >= subgridsdtimpressionguias_fnc_recordsperpage( ) ) && ( GRIDSDTIMPRESSIONGUIAS_nEOF == 0 ) )
      {
         GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = (long)(GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage+subgridsdtimpressionguias_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtimpressionguiasContainer.AddObjectProperty("GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage", GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtimpressionguias_refresh( subGridsdtimpressionguias_Rows, AV40VerMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTIMPRESSIONGUIAS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtimpressionguias_previouspage( )
   {
      if ( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage >= subgridsdtimpressionguias_fnc_recordsperpage( ) )
      {
         GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = (long)(GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage-subgridsdtimpressionguias_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtimpressionguias_refresh( subGridsdtimpressionguias_Rows, AV40VerMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtimpressionguias_lastpage( )
   {
      GRIDSDTIMPRESSIONGUIAS_nRecordCount = subgridsdtimpressionguias_fnc_recordcount( ) ;
      if ( GRIDSDTIMPRESSIONGUIAS_nRecordCount > subgridsdtimpressionguias_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTIMPRESSIONGUIAS_nRecordCount) % (subgridsdtimpressionguias_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = (long)(GRIDSDTIMPRESSIONGUIAS_nRecordCount-subgridsdtimpressionguias_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = (long)(GRIDSDTIMPRESSIONGUIAS_nRecordCount-((int)((GRIDSDTIMPRESSIONGUIAS_nRecordCount) % (subgridsdtimpressionguias_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtimpressionguias_refresh( subGridsdtimpressionguias_Rows, AV40VerMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtimpressionguias_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = (long)(subgridsdtimpressionguias_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtimpressionguias_refresh( subGridsdtimpressionguias_Rows, AV40VerMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "AlbaranesProduccion.ImpresionGuiaModa21" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      chkavVermail.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "Enabled", GXutil.ltrimstr( chkavVermail.getEnabled(), 5, 0), true);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavSdtimpressionguia__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__albprocod_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__clivala.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__clivala.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__clivala.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__climailgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__climailgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__climailgr_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__climailpk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__climailpk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__climailpk_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__guiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__guiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__guiremcli_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__climailgre.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailgre.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__climailgre.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__climailpke.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailpke.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__climailpke.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__albprofch_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__bartipcor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__bartipcor.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtimpressionguia__bartipcor.getEnabled(), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__cod_pais_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__cod_pais_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__cod_pais_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__pdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__pdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__pdf_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavSdtimpressionguia__excel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtimpressionguia__excel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtimpressionguia__excel_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1ZY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151ZY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtimpressionguia"), AV46SDTImpressionGuia);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV6CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV15CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTIMPRESSIONGUIA"), AV46SDTImpressionGuia);
         /* Read saved values. */
         nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_127"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV49GridSDTImpressionGuiasCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTIMPRESSIONGUIASCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV50GridSDTImpressionGuiasPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTIMPRESSIONGUIASPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTIMPRESSIONGUIAS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIAS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtimpressionguias_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIAS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
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
         Gridsdtimpressionguiaspaginationbar_Class = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Class") ;
         Gridsdtimpressionguiaspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Showfirst")) ;
         Gridsdtimpressionguiaspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Showprevious")) ;
         Gridsdtimpressionguiaspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Shownext")) ;
         Gridsdtimpressionguiaspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Showlast")) ;
         Gridsdtimpressionguiaspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtimpressionguiaspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtimpressionguiaspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtimpressionguiaspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Emptygridclass") ;
         Gridsdtimpressionguiaspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtimpressionguiaspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtimpressionguiaspaginationbar_Previous = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Previous") ;
         Gridsdtimpressionguiaspaginationbar_Next = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Next") ;
         Gridsdtimpressionguiaspaginationbar_Caption = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Caption") ;
         Gridsdtimpressionguiaspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtimpressionguiaspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_tablegrid_Width = httpContext.cgiGet( "DVPANEL_TABLEGRID_Width") ;
         Dvpanel_tablegrid_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGRID_Autowidth")) ;
         Dvpanel_tablegrid_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGRID_Autoheight")) ;
         Dvpanel_tablegrid_Cls = httpContext.cgiGet( "DVPANEL_TABLEGRID_Cls") ;
         Dvpanel_tablegrid_Title = httpContext.cgiGet( "DVPANEL_TABLEGRID_Title") ;
         Dvpanel_tablegrid_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGRID_Collapsible")) ;
         Dvpanel_tablegrid_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGRID_Collapsed")) ;
         Dvpanel_tablegrid_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGRID_Showcollapseicon")) ;
         Dvpanel_tablegrid_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEGRID_Iconposition") ;
         Dvpanel_tablegrid_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGRID_Autoscroll")) ;
         Gridsdtimpressionguias_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIAS_EMPOWERER_Gridinternalname") ;
         Gridsdtimpressionguiaspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Selectedpage") ;
         Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_127"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_127_fel_idx = 0 ;
         while ( nGXsfl_127_fel_idx < nRC_GXsfl_127 )
         {
            nGXsfl_127_fel_idx = ((subGridsdtimpressionguias_Islastpage==1)&&(nGXsfl_127_fel_idx+1>subgridsdtimpressionguias_fnc_recordsperpage( )) ? 1 : nGXsfl_127_fel_idx+1) ;
            sGXsfl_127_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1272( ) ;
            AV53GXV1 = (int)(nGXsfl_127_fel_idx+GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage) ;
            if ( ( AV46SDTImpressionGuia.size() >= AV53GXV1 ) && ( AV53GXV1 > 0 ) )
            {
               AV46SDTImpressionGuia.currentItem( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)) );
            }
         }
         if ( nGXsfl_127_fel_idx == 0 )
         {
            nGXsfl_127_idx = 1 ;
            sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1272( ) ;
         }
         nGXsfl_127_fel_idx = 1 ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHFROM");
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12AlbProfchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbProfchfrom", localUtil.format(AV12AlbProfchfrom, "99/99/99"));
         }
         else
         {
            AV12AlbProfchfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbProfchfrom", localUtil.format(AV12AlbProfchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHTO");
            GX_FocusControl = edtavAlbprofchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13AlbProfchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13AlbProfchto", localUtil.format(AV13AlbProfchto, "99/99/99"));
         }
         else
         {
            AV13AlbProfchto = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13AlbProfchto", localUtil.format(AV13AlbProfchto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODFROM");
            GX_FocusControl = edtavAlbprocodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10AlbProCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbProCodfrom), 10, 0));
         }
         else
         {
            AV10AlbProCodfrom = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbProCodfrom), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODTO");
            GX_FocusControl = edtavAlbprocodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11AlbProCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbProCodto), 10, 0));
         }
         else
         {
            AV11AlbProCodto = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbProCodto), 10, 0));
         }
         cmbavPrio.setName( cmbavPrio.getInternalname() );
         cmbavPrio.setValue( httpContext.cgiGet( cmbavPrio.getInternalname()) );
         AV17PRIO = httpContext.cgiGet( cmbavPrio.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PRIO", AV17PRIO);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Copias2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Copias2), 4, 0));
         }
         else
         {
            AV8Copias2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Copias2), 4, 0));
         }
         cmbavManaut.setName( cmbavManaut.getInternalname() );
         cmbavManaut.setValue( httpContext.cgiGet( cmbavManaut.getInternalname()) );
         AV9ManAut = httpContext.cgiGet( cmbavManaut.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ManAut", AV9ManAut);
         AV40VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40VerMail", AV40VerMail);
         AV38PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38PATHPDF", AV38PATHPDF);
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCodfrom), 6, 0));
         }
         else
         {
            AV5CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodto), 6, 0));
         }
         else
         {
            AV14CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodto), 6, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e151ZY2 ();
      if (returnInSub) return;
   }

   public void e151ZY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      impresionguiamoda21_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = AV16EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      impresionguiamoda21_impl.this.AV16EmprCod = GXv_char2[0] ;
      impresionguiamoda21_impl.this.AV21EmprNom = GXv_char3[0] ;
      impresionguiamoda21_impl.this.AV22UsurCod = GXv_char4[0] ;
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S122 ();
      if (returnInSub) return;
      Gridsdtimpressionguias_empowerer_Gridinternalname = subGridsdtimpressionguias_Internalname ;
      ucGridsdtimpressionguias_empowerer.sendProperty(context, "", false, Gridsdtimpressionguias_empowerer_Internalname, "GridInternalName", Gridsdtimpressionguias_empowerer_Gridinternalname);
      subGridsdtimpressionguias_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue = subGridsdtimpressionguias_Rows ;
      ucGridsdtimpressionguiaspaginationbar.sendProperty(context, "", false, Gridsdtimpressionguiaspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV17PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17PRIO", AV17PRIO);
      AV18Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV18Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV18Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV18Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      GXv_int5[0] = AV19Copias ;
      new app.pbuscon(remoteHandle, context).execute( AV16EmprCod, "100005", GXv_int5) ;
      impresionguiamoda21_impl.this.AV19Copias = (short)((short)(GXv_int5[0])) ;
      if ( AV19Copias == 0 )
      {
         AV19Copias = (short)(1) ;
      }
      AV8Copias2 = AV19Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Copias2), 4, 0));
      AV9ManAut = "M" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ManAut", AV9ManAut);
      GXt_char1 = AV38PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      impresionguiamoda21_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38PATHPDF", AV38PATHPDF);
      AV38PATHPDF = GXutil.trim( AV38PATHPDF) + httpContext.getMessage( "Guia.pdf", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38PATHPDF", AV38PATHPDF);
      AV40VerMail = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40VerMail", AV40VerMail);
   }

   public void e161ZY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV49GridSDTImpressionGuiasCurrentPage = subgridsdtimpressionguias_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49GridSDTImpressionGuiasCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridSDTImpressionGuiasCurrentPage), 10, 0));
      AV50GridSDTImpressionGuiasPageCount = subgridsdtimpressionguias_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50GridSDTImpressionGuiasPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridSDTImpressionGuiasPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e171ZY2( )
   {
      /* Gridsdtimpressionguias_Load Routine */
      returnInSub = false ;
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV46SDTImpressionGuia.size() )
      {
         AV46SDTImpressionGuia.currentItem( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(127) ;
         }
         if ( ( subGridsdtimpressionguias_Islastpage == 1 ) || ( subGridsdtimpressionguias_Rows == 0 ) || ( ( GRIDSDTIMPRESSIONGUIAS_nCurrentRecord >= GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage ) && ( GRIDSDTIMPRESSIONGUIAS_nCurrentRecord < GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage + subgridsdtimpressionguias_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1272( ) ;
            GRIDSDTIMPRESSIONGUIAS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTIMPRESSIONGUIAS_nCurrentRecord + 1 >= subgridsdtimpressionguias_fnc_recordcount( ) )
            {
               GRIDSDTIMPRESSIONGUIAS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTIMPRESSIONGUIAS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTIMPRESSIONGUIAS_nCurrentRecord = (long)(GRIDSDTIMPRESSIONGUIAS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_127_Refreshing )
         {
            httpContext.doAjaxLoad(127, GridsdtimpressionguiasRow);
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void e111ZY2( )
   {
      /* Gridsdtimpressionguiaspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtimpressionguiaspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtimpressionguias_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtimpressionguiaspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV48PageToGo = subgridsdtimpressionguias_fnc_currentpage( ) ;
         AV48PageToGo = (int)(AV48PageToGo+1) ;
         subgridsdtimpressionguias_gotopage( AV48PageToGo) ;
      }
      else
      {
         AV48PageToGo = (int)(GXutil.lval( Gridsdtimpressionguiaspaginationbar_Selectedpage)) ;
         subgridsdtimpressionguias_gotopage( AV48PageToGo) ;
      }
   }

   public void e121ZY2( )
   {
      /* Gridsdtimpressionguiaspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtimpressionguias_Rows = Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTIMPRESSIONGUIAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtimpressionguias_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131ZY2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV41ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV41ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV41ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV41ProgressIndicator.show();
      AV41ProgressIndicator.showwithtitle(httpContext.getMessage( "Gerando relatorios..", ""));
      AV41ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV41ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41ProgressIndicator", AV41ProgressIndicator);
   }

   public void e141ZY2( )
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
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H01ZY2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = H01ZY2_A10045CliAct[0] ;
         A13735CliCNom = H01ZY2_A13735CliCNom[0] ;
         A252CliCod = H01ZY2_A252CliCod[0] ;
         A279CliNom = H01ZY2_A279CliNom[0] ;
         AV7Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV7Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV7Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV15CliCodto_Data.add(AV7Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_clicodto_Selectedvalue_set = ((0==AV14CliCodto) ? "" : GXutil.trim( GXutil.str( AV14CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H01ZY3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H01ZY3_A10045CliAct[0] ;
         A13735CliCNom = H01ZY3_A13735CliCNom[0] ;
         A252CliCod = H01ZY3_A252CliCod[0] ;
         A279CliNom = H01ZY3_A279CliNom[0] ;
         AV7Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV7Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV7Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV6CliCodfrom_Data.add(AV7Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV5CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV5CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
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
      pa1ZY2( ) ;
      ws1ZY2( ) ;
      we1ZY2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714195547", true, true);
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
      httpContext.AddJavascriptSource("albaranesproduccion/impresionguiamoda21.js", "?202681714195547", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1272( )
   {
      edtavSdtimpressionguia__albprocod_Internalname = "SDTIMPRESSIONGUIA__ALBPROCOD_"+sGXsfl_127_idx ;
      chkavSdtimpressionguia__clivala.setInternalname( "SDTIMPRESSIONGUIA__CLIVALA_"+sGXsfl_127_idx );
      edtavSdtimpressionguia__climailgr_Internalname = "SDTIMPRESSIONGUIA__CLIMAILGR_"+sGXsfl_127_idx ;
      edtavSdtimpressionguia__climailpk_Internalname = "SDTIMPRESSIONGUIA__CLIMAILPK_"+sGXsfl_127_idx ;
      edtavSdtimpressionguia__guiremcli_Internalname = "SDTIMPRESSIONGUIA__GUIREMCLI_"+sGXsfl_127_idx ;
      chkavSdtimpressionguia__climailgre.setInternalname( "SDTIMPRESSIONGUIA__CLIMAILGRE_"+sGXsfl_127_idx );
      chkavSdtimpressionguia__climailpke.setInternalname( "SDTIMPRESSIONGUIA__CLIMAILPKE_"+sGXsfl_127_idx );
      edtavSdtimpressionguia__albprofch_Internalname = "SDTIMPRESSIONGUIA__ALBPROFCH_"+sGXsfl_127_idx ;
      chkavSdtimpressionguia__bartipcor.setInternalname( "SDTIMPRESSIONGUIA__BARTIPCOR_"+sGXsfl_127_idx );
      edtavSdtimpressionguia__cod_pais_Internalname = "SDTIMPRESSIONGUIA__COD_PAIS_"+sGXsfl_127_idx ;
      edtavSdtimpressionguia__pdf_Internalname = "SDTIMPRESSIONGUIA__PDF_"+sGXsfl_127_idx ;
      edtavSdtimpressionguia__excel_Internalname = "SDTIMPRESSIONGUIA__EXCEL_"+sGXsfl_127_idx ;
   }

   public void subsflControlProps_fel_1272( )
   {
      edtavSdtimpressionguia__albprocod_Internalname = "SDTIMPRESSIONGUIA__ALBPROCOD_"+sGXsfl_127_fel_idx ;
      chkavSdtimpressionguia__clivala.setInternalname( "SDTIMPRESSIONGUIA__CLIVALA_"+sGXsfl_127_fel_idx );
      edtavSdtimpressionguia__climailgr_Internalname = "SDTIMPRESSIONGUIA__CLIMAILGR_"+sGXsfl_127_fel_idx ;
      edtavSdtimpressionguia__climailpk_Internalname = "SDTIMPRESSIONGUIA__CLIMAILPK_"+sGXsfl_127_fel_idx ;
      edtavSdtimpressionguia__guiremcli_Internalname = "SDTIMPRESSIONGUIA__GUIREMCLI_"+sGXsfl_127_fel_idx ;
      chkavSdtimpressionguia__climailgre.setInternalname( "SDTIMPRESSIONGUIA__CLIMAILGRE_"+sGXsfl_127_fel_idx );
      chkavSdtimpressionguia__climailpke.setInternalname( "SDTIMPRESSIONGUIA__CLIMAILPKE_"+sGXsfl_127_fel_idx );
      edtavSdtimpressionguia__albprofch_Internalname = "SDTIMPRESSIONGUIA__ALBPROFCH_"+sGXsfl_127_fel_idx ;
      chkavSdtimpressionguia__bartipcor.setInternalname( "SDTIMPRESSIONGUIA__BARTIPCOR_"+sGXsfl_127_fel_idx );
      edtavSdtimpressionguia__cod_pais_Internalname = "SDTIMPRESSIONGUIA__COD_PAIS_"+sGXsfl_127_fel_idx ;
      edtavSdtimpressionguia__pdf_Internalname = "SDTIMPRESSIONGUIA__PDF_"+sGXsfl_127_fel_idx ;
      edtavSdtimpressionguia__excel_Internalname = "SDTIMPRESSIONGUIA__EXCEL_"+sGXsfl_127_fel_idx ;
   }

   public void sendrow_1272( )
   {
      subsflControlProps_1272( ) ;
      wb1ZY0( ) ;
      if ( ( subGridsdtimpressionguias_Rows * 1 == 0 ) || ( nGXsfl_127_idx <= subgridsdtimpressionguias_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtimpressionguiasRow = GXWebRow.GetNew(context,GridsdtimpressionguiasContainer) ;
         if ( subGridsdtimpressionguias_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtimpressionguias_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtimpressionguias_Class, "") != 0 )
            {
               subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"Odd" ;
            }
         }
         else if ( subGridsdtimpressionguias_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtimpressionguias_Backstyle = (byte)(0) ;
            subGridsdtimpressionguias_Backcolor = subGridsdtimpressionguias_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtimpressionguias_Class, "") != 0 )
            {
               subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtimpressionguias_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtimpressionguias_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtimpressionguias_Class, "") != 0 )
            {
               subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"Odd" ;
            }
            subGridsdtimpressionguias_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtimpressionguias_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtimpressionguias_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_127_idx) % (2))) == 0 )
            {
               subGridsdtimpressionguias_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtimpressionguias_Class, "") != 0 )
               {
                  subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtimpressionguias_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtimpressionguias_Class, "") != 0 )
               {
                  subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_127_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__albprocod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Albprocod(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtimpressionguia__albprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Albprocod()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Albprocod()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__albprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__albprocod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTIMPRESSIONGUIA__CLIVALA_" + sGXsfl_127_idx ;
         chkavSdtimpressionguia__clivala.setName( GXCCtl );
         chkavSdtimpressionguia__clivala.setWebtags( "" );
         chkavSdtimpressionguia__clivala.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__clivala.getInternalname(), "TitleCaption", chkavSdtimpressionguia__clivala.getCaption(), !bGXsfl_127_Refreshing);
         chkavSdtimpressionguia__clivala.setCheckedValue( "N" );
         GridsdtimpressionguiasRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtimpressionguia__clivala.getInternalname(),((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Clivala(),"","",Integer.valueOf(-1),Integer.valueOf(chkavSdtimpressionguia__clivala.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__climailgr_Internalname,GXutil.rtrim( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Climailgr()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__climailgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__climailgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__climailpk_Internalname,GXutil.rtrim( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Climailpk()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__climailpk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__climailpk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__guiremcli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Guiremcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtimpressionguia__guiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Guiremcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Guiremcli()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__guiremcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__guiremcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTIMPRESSIONGUIA__CLIMAILGRE_" + sGXsfl_127_idx ;
         chkavSdtimpressionguia__climailgre.setName( GXCCtl );
         chkavSdtimpressionguia__climailgre.setWebtags( "" );
         chkavSdtimpressionguia__climailgre.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailgre.getInternalname(), "TitleCaption", chkavSdtimpressionguia__climailgre.getCaption(), !bGXsfl_127_Refreshing);
         chkavSdtimpressionguia__climailgre.setCheckedValue( "N" );
         GridsdtimpressionguiasRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtimpressionguia__climailgre.getInternalname(),((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Climailgre(),"","",Integer.valueOf(-1),Integer.valueOf(chkavSdtimpressionguia__climailgre.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTIMPRESSIONGUIA__CLIMAILPKE_" + sGXsfl_127_idx ;
         chkavSdtimpressionguia__climailpke.setName( GXCCtl );
         chkavSdtimpressionguia__climailpke.setWebtags( "" );
         chkavSdtimpressionguia__climailpke.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailpke.getInternalname(), "TitleCaption", chkavSdtimpressionguia__climailpke.getCaption(), !bGXsfl_127_Refreshing);
         chkavSdtimpressionguia__climailpke.setCheckedValue( "N" );
         GridsdtimpressionguiasRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtimpressionguia__climailpke.getInternalname(),((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Climailpke(),"","",Integer.valueOf(-1),Integer.valueOf(chkavSdtimpressionguia__climailpke.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__albprofch_Internalname,localUtil.format(((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Albprofch(), "99/99/99"),localUtil.format( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Albprofch(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__albprofch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__albprofch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTIMPRESSIONGUIA__BARTIPCOR_" + sGXsfl_127_idx ;
         chkavSdtimpressionguia__bartipcor.setName( GXCCtl );
         chkavSdtimpressionguia__bartipcor.setWebtags( "" );
         chkavSdtimpressionguia__bartipcor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__bartipcor.getInternalname(), "TitleCaption", chkavSdtimpressionguia__bartipcor.getCaption(), !bGXsfl_127_Refreshing);
         chkavSdtimpressionguia__bartipcor.setCheckedValue( "NO" );
         GridsdtimpressionguiasRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtimpressionguia__bartipcor.getInternalname(),((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Bartipcor(),"","",Integer.valueOf(-1),Integer.valueOf(chkavSdtimpressionguia__bartipcor.getEnabled()),"SI","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__cod_pais_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Cod_pais(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtimpressionguia__cod_pais_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Cod_pais()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Cod_pais()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__cod_pais_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__cod_pais_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__pdf_Internalname,((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Pdf(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__pdf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__pdf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtimpressionguiasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtimpressionguia__excel_Internalname,((app.SdtSDTImpressionGuia_Guia)AV46SDTImpressionGuia.elementAt(-1+AV53GXV1)).getgxTv_SdtSDTImpressionGuia_Guia_Excel(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtimpressionguia__excel_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtimpressionguia__excel_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1ZY2( ) ;
         GridsdtimpressionguiasContainer.AddRow(GridsdtimpressionguiasRow);
         nGXsfl_127_idx = ((subGridsdtimpressionguias_Islastpage==1)&&(nGXsfl_127_idx+1>subgridsdtimpressionguias_fnc_recordsperpage( )) ? 1 : nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1272( ) ;
      }
      /* End function sendrow_1272 */
   }

   public void startgridcontrol127( )
   {
      if ( GridsdtimpressionguiasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridsdtimpressionguiasContainer"+"DivS\" data-gxgridid=\"127\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtimpressionguias_Internalname, subGridsdtimpressionguias_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtimpressionguias_Backcolorstyle == 0 )
         {
            subGridsdtimpressionguias_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtimpressionguias_Class) > 0 )
            {
               subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtimpressionguias_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtimpressionguias_Backcolorstyle == 1 )
            {
               subGridsdtimpressionguias_Titlebackcolor = subGridsdtimpressionguias_Allbackcolor ;
               if ( GXutil.len( subGridsdtimpressionguias_Class) > 0 )
               {
                  subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtimpressionguias_Class) > 0 )
               {
                  subGridsdtimpressionguias_Linesclass = subGridsdtimpressionguias_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Albaran Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imprimir Albaran Valorado ?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E-mail Guia Remessa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E-mail Packing List", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo del Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envia Guia Email S/N", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envia Packing Email S/N", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha creacion del Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CL,RL,CO", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pais", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PDF", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Excel", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtimpressionguiasContainer.AddObjectProperty("GridName", "Gridsdtimpressionguias");
      }
      else
      {
         GridsdtimpressionguiasContainer.AddObjectProperty("GridName", "Gridsdtimpressionguias");
         GridsdtimpressionguiasContainer.AddObjectProperty("Header", subGridsdtimpressionguias_Header);
         GridsdtimpressionguiasContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtimpressionguiasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("CmpContext", "");
         GridsdtimpressionguiasContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__albprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdtimpressionguia__clivala.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__climailgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__climailpk_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__guiremcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdtimpressionguia__climailgre.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdtimpressionguia__climailpke.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__albprofch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdtimpressionguia__bartipcor.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__cod_pais_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__pdf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtimpressionguiasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtimpressionguia__excel_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddColumnProperties(GridsdtimpressionguiasColumn);
         GridsdtimpressionguiasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtimpressionguiasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtimpressionguias_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavAlbprofchfrom_Internalname = "vALBPROFCHFROM" ;
      edtavAlbprofchto_Internalname = "vALBPROFCHTO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavAlbprocodfrom_Internalname = "vALBPROCODFROM" ;
      edtavAlbprocodto_Internalname = "vALBPROCODTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavPrio.setInternalname( "vPRIO" );
      edtavCopias2_Internalname = "vCOPIAS2" ;
      cmbavManaut.setInternalname( "vMANAUT" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      chkavVermail.setInternalname( "vVERMAIL" );
      edtavPathpdf_Internalname = "vPATHPDF" ;
      divMail_Internalname = "MAIL" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTableinfo_Internalname = "TABLEINFO" ;
      edtavSdtimpressionguia__albprocod_Internalname = "SDTIMPRESSIONGUIA__ALBPROCOD" ;
      chkavSdtimpressionguia__clivala.setInternalname( "SDTIMPRESSIONGUIA__CLIVALA" );
      edtavSdtimpressionguia__climailgr_Internalname = "SDTIMPRESSIONGUIA__CLIMAILGR" ;
      edtavSdtimpressionguia__climailpk_Internalname = "SDTIMPRESSIONGUIA__CLIMAILPK" ;
      edtavSdtimpressionguia__guiremcli_Internalname = "SDTIMPRESSIONGUIA__GUIREMCLI" ;
      chkavSdtimpressionguia__climailgre.setInternalname( "SDTIMPRESSIONGUIA__CLIMAILGRE" );
      chkavSdtimpressionguia__climailpke.setInternalname( "SDTIMPRESSIONGUIA__CLIMAILPKE" );
      edtavSdtimpressionguia__albprofch_Internalname = "SDTIMPRESSIONGUIA__ALBPROFCH" ;
      chkavSdtimpressionguia__bartipcor.setInternalname( "SDTIMPRESSIONGUIA__BARTIPCOR" );
      edtavSdtimpressionguia__cod_pais_Internalname = "SDTIMPRESSIONGUIA__COD_PAIS" ;
      edtavSdtimpressionguia__pdf_Internalname = "SDTIMPRESSIONGUIA__PDF" ;
      edtavSdtimpressionguia__excel_Internalname = "SDTIMPRESSIONGUIA__EXCEL" ;
      Gridsdtimpressionguiaspaginationbar_Internalname = "GRIDSDTIMPRESSIONGUIASPAGINATIONBAR" ;
      divGridsdtimpressionguiastablewithpaginationbar_Internalname = "GRIDSDTIMPRESSIONGUIASTABLEWITHPAGINATIONBAR" ;
      divTablegrid_Internalname = "TABLEGRID" ;
      Dvpanel_tablegrid_Internalname = "DVPANEL_TABLEGRID" ;
      divTableresultado_Internalname = "TABLERESULTADO" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      Gridsdtimpressionguias_empowerer_Internalname = "GRIDSDTIMPRESSIONGUIAS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridsdtimpressionguias_Internalname = "GRIDSDTIMPRESSIONGUIAS" ;
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
      subGridsdtimpressionguias_Allowcollapsing = (byte)(0) ;
      subGridsdtimpressionguias_Allowselection = (byte)(0) ;
      subGridsdtimpressionguias_Header = "" ;
      edtavSdtimpressionguia__excel_Jsonclick = "" ;
      edtavSdtimpressionguia__excel_Enabled = 0 ;
      edtavSdtimpressionguia__pdf_Jsonclick = "" ;
      edtavSdtimpressionguia__pdf_Enabled = 0 ;
      edtavSdtimpressionguia__cod_pais_Jsonclick = "" ;
      edtavSdtimpressionguia__cod_pais_Enabled = 0 ;
      chkavSdtimpressionguia__bartipcor.setCaption( "" );
      chkavSdtimpressionguia__bartipcor.setEnabled( 0 );
      edtavSdtimpressionguia__albprofch_Jsonclick = "" ;
      edtavSdtimpressionguia__albprofch_Enabled = 0 ;
      chkavSdtimpressionguia__climailpke.setCaption( "" );
      chkavSdtimpressionguia__climailpke.setEnabled( 0 );
      chkavSdtimpressionguia__climailgre.setCaption( "" );
      chkavSdtimpressionguia__climailgre.setEnabled( 0 );
      edtavSdtimpressionguia__guiremcli_Jsonclick = "" ;
      edtavSdtimpressionguia__guiremcli_Enabled = 0 ;
      edtavSdtimpressionguia__climailpk_Jsonclick = "" ;
      edtavSdtimpressionguia__climailpk_Enabled = 0 ;
      edtavSdtimpressionguia__climailgr_Jsonclick = "" ;
      edtavSdtimpressionguia__climailgr_Enabled = 0 ;
      chkavSdtimpressionguia__clivala.setCaption( "" );
      chkavSdtimpressionguia__clivala.setEnabled( 0 );
      edtavSdtimpressionguia__albprocod_Jsonclick = "" ;
      edtavSdtimpressionguia__albprocod_Enabled = 0 ;
      subGridsdtimpressionguias_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtimpressionguias_Backcolorstyle = (byte)(0) ;
      edtavSdtimpressionguia__excel_Enabled = -1 ;
      edtavSdtimpressionguia__pdf_Enabled = -1 ;
      edtavSdtimpressionguia__cod_pais_Enabled = -1 ;
      chkavSdtimpressionguia__bartipcor.setEnabled( -1 );
      edtavSdtimpressionguia__albprofch_Enabled = -1 ;
      chkavSdtimpressionguia__climailpke.setEnabled( -1 );
      chkavSdtimpressionguia__climailgre.setEnabled( -1 );
      edtavSdtimpressionguia__guiremcli_Enabled = -1 ;
      edtavSdtimpressionguia__climailpk_Enabled = -1 ;
      edtavSdtimpressionguia__climailgr_Enabled = -1 ;
      chkavSdtimpressionguia__clivala.setEnabled( -1 );
      edtavSdtimpressionguia__albprocod_Enabled = -1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Enabled = 1 ;
      chkavVermail.setEnabled( 1 );
      cmbavManaut.setJsonclick( "" );
      cmbavManaut.setEnabled( 1 );
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Enabled = 1 ;
      cmbavPrio.setJsonclick( "" );
      cmbavPrio.setEnabled( 1 );
      edtavAlbprocodto_Jsonclick = "" ;
      edtavAlbprocodto_Enabled = 1 ;
      edtavAlbprocodfrom_Jsonclick = "" ;
      edtavAlbprocodfrom_Enabled = 1 ;
      edtavAlbprofchto_Jsonclick = "" ;
      edtavAlbprofchto_Enabled = 1 ;
      edtavAlbprofchfrom_Jsonclick = "" ;
      edtavAlbprofchfrom_Enabled = 1 ;
      Dvpanel_tablegrid_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablegrid_Iconposition = "Right" ;
      Dvpanel_tablegrid_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablegrid_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablegrid_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablegrid_Title = httpContext.getMessage( "Resultado", "") ;
      Dvpanel_tablegrid_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablegrid_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablegrid_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablegrid_Width = "100%" ;
      Gridsdtimpressionguiaspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtimpressionguiaspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtimpressionguiaspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtimpressionguiaspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtimpressionguiaspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtimpressionguiaspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtimpressionguiaspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtimpressionguiaspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtimpressionguiaspaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtimpressionguiaspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtimpressionguiaspaginationbar_Pagestoshow = 5 ;
      Gridsdtimpressionguiaspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtimpressionguiaspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtimpressionguiaspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtimpressionguiaspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtimpressionguiaspaginationbar_Class = "PaginationBar" ;
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
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Impresion Guia", "") );
      subGridsdtimpressionguias_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPrio.setName( "vPRIO" );
      cmbavPrio.setWebtags( "" );
      cmbavPrio.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavPrio.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV17PRIO = cmbavPrio.getValidValue(AV17PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PRIO", AV17PRIO);
      }
      cmbavManaut.setName( "vMANAUT" );
      cmbavManaut.setWebtags( "" );
      cmbavManaut.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      cmbavManaut.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbavManaut.getItemCount() > 0 )
      {
         AV9ManAut = cmbavManaut.getValidValue(AV9ManAut) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ManAut", AV9ManAut);
      }
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      AV40VerMail = GXutil.strtobool( GXutil.booltostr( AV40VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40VerMail", AV40VerMail);
      GXCCtl = "SDTIMPRESSIONGUIA__CLIVALA_" + sGXsfl_127_idx ;
      chkavSdtimpressionguia__clivala.setName( GXCCtl );
      chkavSdtimpressionguia__clivala.setWebtags( "" );
      chkavSdtimpressionguia__clivala.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__clivala.getInternalname(), "TitleCaption", chkavSdtimpressionguia__clivala.getCaption(), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__clivala.setCheckedValue( "N" );
      GXCCtl = "SDTIMPRESSIONGUIA__CLIMAILGRE_" + sGXsfl_127_idx ;
      chkavSdtimpressionguia__climailgre.setName( GXCCtl );
      chkavSdtimpressionguia__climailgre.setWebtags( "" );
      chkavSdtimpressionguia__climailgre.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailgre.getInternalname(), "TitleCaption", chkavSdtimpressionguia__climailgre.getCaption(), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__climailgre.setCheckedValue( "N" );
      GXCCtl = "SDTIMPRESSIONGUIA__CLIMAILPKE_" + sGXsfl_127_idx ;
      chkavSdtimpressionguia__climailpke.setName( GXCCtl );
      chkavSdtimpressionguia__climailpke.setWebtags( "" );
      chkavSdtimpressionguia__climailpke.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__climailpke.getInternalname(), "TitleCaption", chkavSdtimpressionguia__climailpke.getCaption(), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__climailpke.setCheckedValue( "N" );
      GXCCtl = "SDTIMPRESSIONGUIA__BARTIPCOR_" + sGXsfl_127_idx ;
      chkavSdtimpressionguia__bartipcor.setName( GXCCtl );
      chkavSdtimpressionguia__bartipcor.setWebtags( "" );
      chkavSdtimpressionguia__bartipcor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtimpressionguia__bartipcor.getInternalname(), "TitleCaption", chkavSdtimpressionguia__bartipcor.getCaption(), !bGXsfl_127_Refreshing);
      chkavSdtimpressionguia__bartipcor.setCheckedValue( "NO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage'},{av:'GRIDSDTIMPRESSIONGUIAS_nEOF'},{av:'AV46SDTImpressionGuia',fld:'vSDTIMPRESSIONGUIA',grid:127,pic:''},{av:'nGXsfl_127_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:127},{av:'nRC_GXsfl_127',ctrl:'GRIDSDTIMPRESSIONGUIAS',prop:'GridRC',grid:127},{av:'subGridsdtimpressionguias_Rows',ctrl:'GRIDSDTIMPRESSIONGUIAS',prop:'Rows'},{av:'AV40VerMail',fld:'vVERMAIL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV49GridSDTImpressionGuiasCurrentPage',fld:'vGRIDSDTIMPRESSIONGUIASCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV50GridSDTImpressionGuiasPageCount',fld:'vGRIDSDTIMPRESSIONGUIASPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDTIMPRESSIONGUIAS.LOAD","{handler:'e171ZY2',iparms:[]");
      setEventMetadata("GRIDSDTIMPRESSIONGUIAS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTIMPRESSIONGUIASPAGINATIONBAR.CHANGEPAGE","{handler:'e111ZY2',iparms:[{av:'GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage'},{av:'GRIDSDTIMPRESSIONGUIAS_nEOF'},{av:'AV46SDTImpressionGuia',fld:'vSDTIMPRESSIONGUIA',grid:127,pic:''},{av:'nGXsfl_127_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:127},{av:'nRC_GXsfl_127',ctrl:'GRIDSDTIMPRESSIONGUIAS',prop:'GridRC',grid:127},{av:'subGridsdtimpressionguias_Rows',ctrl:'GRIDSDTIMPRESSIONGUIAS',prop:'Rows'},{av:'AV40VerMail',fld:'vVERMAIL',pic:''},{av:'Gridsdtimpressionguiaspaginationbar_Selectedpage',ctrl:'GRIDSDTIMPRESSIONGUIASPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTIMPRESSIONGUIASPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTIMPRESSIONGUIASPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121ZY2',iparms:[{av:'GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage'},{av:'GRIDSDTIMPRESSIONGUIAS_nEOF'},{av:'AV46SDTImpressionGuia',fld:'vSDTIMPRESSIONGUIA',grid:127,pic:''},{av:'nGXsfl_127_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:127},{av:'nRC_GXsfl_127',ctrl:'GRIDSDTIMPRESSIONGUIAS',prop:'GridRC',grid:127},{av:'subGridsdtimpressionguias_Rows',ctrl:'GRIDSDTIMPRESSIONGUIAS',prop:'Rows'},{av:'AV40VerMail',fld:'vVERMAIL',pic:''},{av:'Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTIMPRESSIONGUIASPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTIMPRESSIONGUIASPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtimpressionguias_Rows',ctrl:'GRIDSDTIMPRESSIONGUIAS',prop:'Rows'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e131ZY2',iparms:[]");
      setEventMetadata("'DORESULTADOS'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141ZY2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_PRIO","{handler:'validv_Prio',iparms:[]");
      setEventMetadata("VALIDV_PRIO",",oparms:[]}");
      setEventMetadata("VALIDV_GXV3","{handler:'validv_Gxv3',iparms:[]");
      setEventMetadata("VALIDV_GXV3",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv13',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      Gridsdtimpressionguiaspaginationbar_Selectedpage = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV46SDTImpressionGuia = new GXBaseCollection<app.SdtSDTImpressionGuia_Guia>(app.SdtSDTImpressionGuia_Guia.class, "Guia", "TexplusNET", remoteHandle);
      AV6CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV15CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Gridsdtimpressionguias_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      TempTags = "" ;
      AV12AlbProfchfrom = GXutil.nullDate() ;
      AV13AlbProfchto = GXutil.nullDate() ;
      AV17PRIO = "" ;
      AV9ManAut = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV38PATHPDF = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tablegrid = new com.genexus.webpanels.GXUserControl();
      GridsdtimpressionguiasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtimpressionguiaspaginationbar = new com.genexus.webpanels.GXUserControl();
      AV66Pgmname = "" ;
      ucGridsdtimpressionguias_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20Station = "" ;
      AV16EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV22UsurCod = "" ;
      AV18Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV18Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int5 = new int[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GridsdtimpressionguiasRow = new com.genexus.webpanels.GXWebRow();
      AV41ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H01ZY2_A396EmprCod = new String[] {""} ;
      H01ZY2_A10045CliAct = new String[] {""} ;
      H01ZY2_A13735CliCNom = new String[] {""} ;
      H01ZY2_A252CliCod = new int[1] ;
      H01ZY2_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      AV7Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01ZY3_A396EmprCod = new String[] {""} ;
      H01ZY3_A10045CliAct = new String[] {""} ;
      H01ZY3_A13735CliCNom = new String[] {""} ;
      H01ZY3_A252CliCod = new int[1] ;
      H01ZY3_A279CliNom = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridsdtimpressionguias_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridsdtimpressionguiasColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranesproduccion.impresionguiamoda21__default(),
         new Object[] {
             new Object[] {
            H01ZY2_A396EmprCod, H01ZY2_A10045CliAct, H01ZY2_A13735CliCNom, H01ZY2_A252CliCod, H01ZY2_A279CliNom
            }
            , new Object[] {
            H01ZY3_A396EmprCod, H01ZY3_A10045CliAct, H01ZY3_A13735CliCNom, H01ZY3_A252CliCod, H01ZY3_A279CliNom
            }
         }
      );
      AV66Pgmname = "AlbaranesProduccion.ImpresionGuiaModa21" ;
      /* GeneXus formulas. */
      AV66Pgmname = "AlbaranesProduccion.ImpresionGuiaModa21" ;
      Gx_err = (short)(0) ;
      chkavVermail.setEnabled( 0 );
      edtavPathpdf_Enabled = 0 ;
      edtavSdtimpressionguia__albprocod_Enabled = 0 ;
      chkavSdtimpressionguia__clivala.setEnabled( 0 );
      edtavSdtimpressionguia__climailgr_Enabled = 0 ;
      edtavSdtimpressionguia__climailpk_Enabled = 0 ;
      edtavSdtimpressionguia__guiremcli_Enabled = 0 ;
      chkavSdtimpressionguia__climailgre.setEnabled( 0 );
      chkavSdtimpressionguia__climailpke.setEnabled( 0 );
      edtavSdtimpressionguia__albprofch_Enabled = 0 ;
      chkavSdtimpressionguia__bartipcor.setEnabled( 0 );
      edtavSdtimpressionguia__cod_pais_Enabled = 0 ;
      edtavSdtimpressionguia__pdf_Enabled = 0 ;
      edtavSdtimpressionguia__excel_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDSDTIMPRESSIONGUIAS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridsdtimpressionguias_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridsdtimpressionguias_Backstyle ;
   private byte subGridsdtimpressionguias_Titlebackstyle ;
   private byte subGridsdtimpressionguias_Allowselection ;
   private byte subGridsdtimpressionguias_Allowhovering ;
   private byte subGridsdtimpressionguias_Allowcollapsing ;
   private byte subGridsdtimpressionguias_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV8Copias2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV19Copias ;
   private int Gridsdtimpressionguiaspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_127 ;
   private int subGridsdtimpressionguias_Rows ;
   private int nGXsfl_127_idx=1 ;
   private int Gridsdtimpressionguiaspaginationbar_Pagestoshow ;
   private int edtavAlbprofchfrom_Enabled ;
   private int edtavAlbprofchto_Enabled ;
   private int edtavAlbprocodfrom_Enabled ;
   private int edtavAlbprocodto_Enabled ;
   private int edtavCopias2_Enabled ;
   private int edtavPathpdf_Enabled ;
   private int AV53GXV1 ;
   private int edtavPgmname_Enabled ;
   private int AV5CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV14CliCodto ;
   private int edtavClicodto_Visible ;
   private int subGridsdtimpressionguias_Islastpage ;
   private int edtavSdtimpressionguia__albprocod_Enabled ;
   private int edtavSdtimpressionguia__climailgr_Enabled ;
   private int edtavSdtimpressionguia__climailpk_Enabled ;
   private int edtavSdtimpressionguia__guiremcli_Enabled ;
   private int edtavSdtimpressionguia__albprofch_Enabled ;
   private int edtavSdtimpressionguia__cod_pais_Enabled ;
   private int edtavSdtimpressionguia__pdf_Enabled ;
   private int edtavSdtimpressionguia__excel_Enabled ;
   private int GRIDSDTIMPRESSIONGUIAS_nGridOutOfScope ;
   private int nGXsfl_127_fel_idx=1 ;
   private int GXv_int5[] ;
   private int AV48PageToGo ;
   private int A252CliCod ;
   private int idxLst ;
   private int subGridsdtimpressionguias_Backcolor ;
   private int subGridsdtimpressionguias_Allbackcolor ;
   private int subGridsdtimpressionguias_Titlebackcolor ;
   private int subGridsdtimpressionguias_Selectedindex ;
   private int subGridsdtimpressionguias_Selectioncolor ;
   private int subGridsdtimpressionguias_Hoveringcolor ;
   private int GX_I ;
   private long GRIDSDTIMPRESSIONGUIAS_nFirstRecordOnPage ;
   private long AV49GridSDTImpressionGuiasCurrentPage ;
   private long AV50GridSDTImpressionGuiasPageCount ;
   private long AV10AlbProCodfrom ;
   private long AV11AlbProCodto ;
   private long GRIDSDTIMPRESSIONGUIAS_nCurrentRecord ;
   private long GRIDSDTIMPRESSIONGUIAS_nRecordCount ;
   private String Gridsdtimpressionguiaspaginationbar_Selectedpage ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_127_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Gridsdtimpressionguiaspaginationbar_Class ;
   private String Gridsdtimpressionguiaspaginationbar_Pagingbuttonsposition ;
   private String Gridsdtimpressionguiaspaginationbar_Pagingcaptionposition ;
   private String Gridsdtimpressionguiaspaginationbar_Emptygridclass ;
   private String Gridsdtimpressionguiaspaginationbar_Rowsperpageoptions ;
   private String Gridsdtimpressionguiaspaginationbar_Previous ;
   private String Gridsdtimpressionguiaspaginationbar_Next ;
   private String Gridsdtimpressionguiaspaginationbar_Caption ;
   private String Gridsdtimpressionguiaspaginationbar_Emptygridcaption ;
   private String Gridsdtimpressionguiaspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_tablegrid_Width ;
   private String Dvpanel_tablegrid_Cls ;
   private String Dvpanel_tablegrid_Title ;
   private String Dvpanel_tablegrid_Iconposition ;
   private String Gridsdtimpressionguias_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedclicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Jsonclick ;
   private String Combo_clicodfrom_Caption ;
   private String Combo_clicodfrom_Internalname ;
   private String divTablesplittedclicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Jsonclick ;
   private String Combo_clicodto_Caption ;
   private String Combo_clicodto_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavAlbprofchfrom_Internalname ;
   private String TempTags ;
   private String edtavAlbprofchfrom_Jsonclick ;
   private String edtavAlbprofchto_Internalname ;
   private String edtavAlbprofchto_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavAlbprocodfrom_Internalname ;
   private String edtavAlbprocodfrom_Jsonclick ;
   private String edtavAlbprocodto_Internalname ;
   private String edtavAlbprocodto_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String AV17PRIO ;
   private String edtavCopias2_Internalname ;
   private String edtavCopias2_Jsonclick ;
   private String AV9ManAut ;
   private String divMail_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String edtavPathpdf_Internalname ;
   private String AV38PATHPDF ;
   private String edtavPathpdf_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divTableinfo_Internalname ;
   private String divTableresultado_Internalname ;
   private String Dvpanel_tablegrid_Internalname ;
   private String divTablegrid_Internalname ;
   private String divGridsdtimpressionguiastablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdtimpressionguias_Internalname ;
   private String Gridsdtimpressionguiaspaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV66Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String Gridsdtimpressionguias_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtimpressionguia__albprocod_Internalname ;
   private String edtavSdtimpressionguia__climailgr_Internalname ;
   private String edtavSdtimpressionguia__climailpk_Internalname ;
   private String edtavSdtimpressionguia__guiremcli_Internalname ;
   private String edtavSdtimpressionguia__albprofch_Internalname ;
   private String edtavSdtimpressionguia__cod_pais_Internalname ;
   private String edtavSdtimpressionguia__pdf_Internalname ;
   private String edtavSdtimpressionguia__excel_Internalname ;
   private String sGXsfl_127_fel_idx="0001" ;
   private String AV20Station ;
   private String AV16EmprCod ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String GXv_char3[] ;
   private String AV22UsurCod ;
   private String AV18Copia[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String subGridsdtimpressionguias_Class ;
   private String subGridsdtimpressionguias_Linesclass ;
   private String ROClassString ;
   private String edtavSdtimpressionguia__albprocod_Jsonclick ;
   private String GXCCtl ;
   private String edtavSdtimpressionguia__climailgr_Jsonclick ;
   private String edtavSdtimpressionguia__climailpk_Jsonclick ;
   private String edtavSdtimpressionguia__guiremcli_Jsonclick ;
   private String edtavSdtimpressionguia__albprofch_Jsonclick ;
   private String edtavSdtimpressionguia__cod_pais_Jsonclick ;
   private String edtavSdtimpressionguia__pdf_Jsonclick ;
   private String edtavSdtimpressionguia__excel_Jsonclick ;
   private String subGridsdtimpressionguias_Header ;
   private java.util.Date AV12AlbProfchfrom ;
   private java.util.Date AV13AlbProfchto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV40VerMail ;
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
   private boolean Gridsdtimpressionguiaspaginationbar_Showfirst ;
   private boolean Gridsdtimpressionguiaspaginationbar_Showprevious ;
   private boolean Gridsdtimpressionguiaspaginationbar_Shownext ;
   private boolean Gridsdtimpressionguiaspaginationbar_Showlast ;
   private boolean Gridsdtimpressionguiaspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_tablegrid_Autowidth ;
   private boolean Dvpanel_tablegrid_Autoheight ;
   private boolean Dvpanel_tablegrid_Collapsible ;
   private boolean Dvpanel_tablegrid_Collapsed ;
   private boolean Dvpanel_tablegrid_Showcollapseicon ;
   private boolean Dvpanel_tablegrid_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_127_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String A13735CliCNom ;
   private com.genexus.webpanels.GXWebGrid GridsdtimpressionguiasContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtimpressionguiasRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtimpressionguiasColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablegrid ;
   private com.genexus.webpanels.GXUserControl ucGridsdtimpressionguiaspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridsdtimpressionguias_empowerer ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV41ProgressIndicator ;
   private HTMLChoice cmbavPrio ;
   private HTMLChoice cmbavManaut ;
   private ICheckbox chkavVermail ;
   private ICheckbox chkavSdtimpressionguia__clivala ;
   private ICheckbox chkavSdtimpressionguia__climailgre ;
   private ICheckbox chkavSdtimpressionguia__climailpke ;
   private ICheckbox chkavSdtimpressionguia__bartipcor ;
   private IDataStoreProvider pr_default ;
   private String[] H01ZY2_A396EmprCod ;
   private String[] H01ZY2_A10045CliAct ;
   private String[] H01ZY2_A13735CliCNom ;
   private int[] H01ZY2_A252CliCod ;
   private String[] H01ZY2_A279CliNom ;
   private String[] H01ZY3_A396EmprCod ;
   private String[] H01ZY3_A10045CliAct ;
   private String[] H01ZY3_A13735CliCNom ;
   private int[] H01ZY3_A252CliCod ;
   private String[] H01ZY3_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV6CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15CliCodto_Data ;
   private GXBaseCollection<app.SdtSDTImpressionGuia_Guia> AV46SDTImpressionGuia ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV7Combo_DataItem ;
}

final  class impresionguiamoda21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01ZY2", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZY3", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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

