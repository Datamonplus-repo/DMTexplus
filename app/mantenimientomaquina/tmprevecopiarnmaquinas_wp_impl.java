package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmprevecopiarnmaquinas_wp_impl extends GXDataArea
{
   public tmprevecopiarnmaquinas_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmprevecopiarnmaquinas_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmprevecopiarnmaquinas_wp_impl.class ));
   }

   public tmprevecopiarnmaquinas_wp_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSdtgridmaquina__selected = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtgridmaquinas") == 0 )
         {
            gxnrgridsdtgridmaquinas_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtgridmaquinas") == 0 )
         {
            gxgrgridsdtgridmaquinas_refresh_invoke( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV7EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14PMCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14PMCod), "ZZZZZZZ9")));
               AV15PMDsc = httpContext.GetPar( "PMDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15PMDsc", AV15PMDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15PMDsc, ""))));
            }
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

   public void gxnrgridsdtgridmaquinas_newrow_invoke( )
   {
      nRC_GXsfl_69 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_69"))) ;
      nGXsfl_69_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_69_idx"))) ;
      sGXsfl_69_idx = httpContext.GetPar( "sGXsfl_69_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtgridmaquinas_newrow( ) ;
      /* End function gxnrGridsdtgridmaquinas_newrow_invoke */
   }

   public void gxgrgridsdtgridmaquinas_refresh_invoke( )
   {
      subGridsdtgridmaquinas_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtgridmaquinas_Rows"))) ;
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV14PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
      AV15PMDsc = httpContext.GetPar( "PMDsc") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtgridmaquinas_refresh_invoke */
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
      pa2462( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2462( ) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmprevecopiarnmaquinas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14PMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV15PMDsc))}, new String[] {"EmprCod","PMCod","PMDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14PMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15PMDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtgridmaquina", AV25SDTGridMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtgridmaquina", AV25SDTGridMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV6DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV6DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODIN_DATA", AV12MaqCodIN_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODIN_DATA", AV12MaqCodIN_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTGRIDMAQUINASCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridSDTGridMaquinasCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTGRIDMAQUINASPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridSDTGridMaquinasPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTGRIDMAQUINA", AV25SDTGridMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTGRIDMAQUINA", AV25SDTGridMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODIN_Cls", GXutil.rtrim( Combo_maqcodin_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODIN_Selectedvalue_set", GXutil.rtrim( Combo_maqcodin_Selectedvalue_set));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtgridmaquinaspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtgridmaquinaspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtgridmaquinaspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtgridmaquinaspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtgridmaquinaspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtgridmaquinaspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtgridmaquinas_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODIN_Selectedvalue_get", GXutil.rtrim( Combo_maqcodin_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtgridmaquinaspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODIN_Selectedvalue_get", GXutil.rtrim( Combo_maqcodin_Selectedvalue_get));
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
         we2462( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2462( ) ;
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
      return formatLink("app.mantenimientomaquina.tmprevecopiarnmaquinas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14PMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV15PMDsc))}, new String[] {"EmprCod","PMCod","PMDsc"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMPreveCopiarNMaquinas_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Copiar Preventivo a n Máquinas", "") ;
   }

   public void wb2460( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmcod_Internalname, httpContext.getMessage( "Cod de Preventivo de Mantto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV14PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14PMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14PMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveCopiarNMaquinas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdsc_Internalname, httpContext.getMessage( "Desc Preventivo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdsc_Internalname, GXutil.rtrim( AV15PMDsc), GXutil.rtrim( localUtil.format( AV15PMDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveCopiarNMaquinas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_combo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcodin_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcodin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveCopiarNMaquinas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcodin.setProperty("Caption", Combo_maqcodin_Caption);
         ucCombo_maqcodin.setProperty("Cls", Combo_maqcodin_Cls);
         ucCombo_maqcodin.setProperty("DropDownOptionsTitleSettingsIcons", AV6DDO_TitleSettingsIcons);
         ucCombo_maqcodin.setProperty("DropDownOptionsData", AV12MaqCodIN_Data);
         ucCombo_maqcodin.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodin_Internalname, "COMBO_MAQCODINContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableaction_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112461_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMPreveCopiarNMaquinas_WP.htm");
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Maquinas", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMPreveCopiarNMaquinas_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab01") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", divTableresultado1_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdtgridmaquinastablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtgridmaquinasContainer.SetWrapped(nGXWrapped);
         startgridcontrol69( ) ;
      }
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_69 = (int)(nGXsfl_69_idx-1) ;
         if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV33GXV1 = nGXsfl_69_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridsdtgridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsdtgridmaquinas", GridsdtgridmaquinasContainer, subGridsdtgridmaquinas_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtgridmaquinasContainerData", GridsdtgridmaquinasContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtgridmaquinasContainerData"+"V", GridsdtgridmaquinasContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtgridmaquinasContainerData"+"V"+"\" value='"+GridsdtgridmaquinasContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtgridmaquinaspaginationbar.setProperty("Class", Gridsdtgridmaquinaspaginationbar_Class);
         ucGridsdtgridmaquinaspaginationbar.setProperty("ShowFirst", Gridsdtgridmaquinaspaginationbar_Showfirst);
         ucGridsdtgridmaquinaspaginationbar.setProperty("ShowPrevious", Gridsdtgridmaquinaspaginationbar_Showprevious);
         ucGridsdtgridmaquinaspaginationbar.setProperty("ShowNext", Gridsdtgridmaquinaspaginationbar_Shownext);
         ucGridsdtgridmaquinaspaginationbar.setProperty("ShowLast", Gridsdtgridmaquinaspaginationbar_Showlast);
         ucGridsdtgridmaquinaspaginationbar.setProperty("PagesToShow", Gridsdtgridmaquinaspaginationbar_Pagestoshow);
         ucGridsdtgridmaquinaspaginationbar.setProperty("PagingButtonsPosition", Gridsdtgridmaquinaspaginationbar_Pagingbuttonsposition);
         ucGridsdtgridmaquinaspaginationbar.setProperty("PagingCaptionPosition", Gridsdtgridmaquinaspaginationbar_Pagingcaptionposition);
         ucGridsdtgridmaquinaspaginationbar.setProperty("EmptyGridClass", Gridsdtgridmaquinaspaginationbar_Emptygridclass);
         ucGridsdtgridmaquinaspaginationbar.setProperty("RowsPerPageSelector", Gridsdtgridmaquinaspaginationbar_Rowsperpageselector);
         ucGridsdtgridmaquinaspaginationbar.setProperty("RowsPerPageOptions", Gridsdtgridmaquinaspaginationbar_Rowsperpageoptions);
         ucGridsdtgridmaquinaspaginationbar.setProperty("Previous", Gridsdtgridmaquinaspaginationbar_Previous);
         ucGridsdtgridmaquinaspaginationbar.setProperty("Next", Gridsdtgridmaquinaspaginationbar_Next);
         ucGridsdtgridmaquinaspaginationbar.setProperty("Caption", Gridsdtgridmaquinaspaginationbar_Caption);
         ucGridsdtgridmaquinaspaginationbar.setProperty("EmptyGridCaption", Gridsdtgridmaquinaspaginationbar_Emptygridcaption);
         ucGridsdtgridmaquinaspaginationbar.setProperty("RowsPerPageCaption", Gridsdtgridmaquinaspaginationbar_Rowsperpagecaption);
         ucGridsdtgridmaquinaspaginationbar.setProperty("CurrentPage", AV26GridSDTGridMaquinasCurrentPage);
         ucGridsdtgridmaquinaspaginationbar.setProperty("PageCount", AV27GridSDTGridMaquinasPageCount);
         ucGridsdtgridmaquinaspaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtgridmaquinaspaginationbar_Internalname, "GRIDSDTGRIDMAQUINASPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV38Pgmname), GXutil.rtrim( localUtil.format( AV38Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveCopiarNMaquinas_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodin_Internalname, GXutil.rtrim( AV11MaqCodIN), GXutil.rtrim( localUtil.format( AV11MaqCodIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodin_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcodin_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveCopiarNMaquinas_WP.htm");
         wb_table1_85_2462( true) ;
      }
      else
      {
         wb_table1_85_2462( false) ;
      }
      return  ;
   }

   public void wb_table1_85_2462e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridsdtgridmaquinas_empowerer.render(context, "wwp.gridempowerer", Gridsdtgridmaquinas_empowerer_Internalname, "GRIDSDTGRIDMAQUINAS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV33GXV1 = nGXsfl_69_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridsdtgridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsdtgridmaquinas", GridsdtgridmaquinasContainer, subGridsdtgridmaquinas_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtgridmaquinasContainerData", GridsdtgridmaquinasContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtgridmaquinasContainerData"+"V", GridsdtgridmaquinasContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtgridmaquinasContainerData"+"V"+"\" value='"+GridsdtgridmaquinasContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2462( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Copiar Preventivo a n Máquinas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2460( ) ;
   }

   public void ws2462( )
   {
      start2462( ) ;
      evt2462( ) ;
   }

   public void evt2462( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCODIN.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122462 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTGRIDMAQUINASPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132462 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTGRIDMAQUINASPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142462 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152462 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 24), "GRIDSDTGRIDMAQUINAS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_69_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_692( ) ;
                           AV33GXV1 = (int)(nGXsfl_69_idx+GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage) ;
                           if ( ( AV25SDTGridMaquina.size() >= AV33GXV1 ) && ( AV33GXV1 > 0 ) )
                           {
                              AV25SDTGridMaquina.currentItem( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)) );
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
                                 e162462 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e172462 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTGRIDMAQUINAS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e182462 ();
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

   public void we2462( )
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

   public void pa2462( )
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
            GX_FocusControl = edtavMaqcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsdtgridmaquinas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_692( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         sendrow_692( ) ;
         nGXsfl_69_idx = ((subGridsdtgridmaquinas_Islastpage==1)&&(nGXsfl_69_idx+1>subgridsdtgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtgridmaquinasContainer)) ;
      /* End function gxnrGridsdtgridmaquinas_newrow */
   }

   public void gxgrgridsdtgridmaquinas_refresh( int subGridsdtgridmaquinas_Rows ,
                                                String AV7EmprCod ,
                                                int AV14PMCod ,
                                                String AV15PMDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172462 ();
      GRIDSDTGRIDMAQUINAS_nCurrentRecord = 0 ;
      rf2462( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtgridmaquinas_refresh */
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
      rf2462( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV38Pgmname = "MantenimientoMaquina.TMPreveCopiarNMaquinas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_err = (short)(0) ;
      edtavPmcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmcod_Enabled), 5, 0), true);
      edtavPmdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmdsc_Enabled), 5, 0), true);
      edtavSdtgridmaquina__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtgridmaquina__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtgridmaquina__maqcod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavSdtgridmaquina__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtgridmaquina__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtgridmaquina__maqdsc_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavSdtgridmaquina__tabla_mpreven_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtgridmaquina__tabla_mpreven_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtgridmaquina__tabla_mpreven_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2462( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtgridmaquinasContainer.ClearRows();
      }
      wbStart = (short)(69) ;
      /* Execute user event: Refresh */
      e172462 ();
      nGXsfl_69_idx = 1 ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
      bGXsfl_69_Refreshing = true ;
      GridsdtgridmaquinasContainer.AddObjectProperty("GridName", "Gridsdtgridmaquinas");
      GridsdtgridmaquinasContainer.AddObjectProperty("CmpContext", "");
      GridsdtgridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtgridmaquinasContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtgridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtgridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtgridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtgridmaquinasContainer.setPageSize( subgridsdtgridmaquinas_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_692( ) ;
         e182462 ();
         if ( ( GRIDSDTGRIDMAQUINAS_nCurrentRecord > 0 ) && ( GRIDSDTGRIDMAQUINAS_nGridOutOfScope == 0 ) && ( nGXsfl_69_idx == 1 ) )
         {
            GRIDSDTGRIDMAQUINAS_nCurrentRecord = 0 ;
            GRIDSDTGRIDMAQUINAS_nGridOutOfScope = 1 ;
            subgridsdtgridmaquinas_firstpage( ) ;
            e182462 ();
         }
         wbEnd = (short)(69) ;
         wb2460( ) ;
      }
      bGXsfl_69_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2462( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
   }

   public int subgridsdtgridmaquinas_fnc_pagecount( )
   {
      GRIDSDTGRIDMAQUINAS_nRecordCount = subgridsdtgridmaquinas_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTGRIDMAQUINAS_nRecordCount) % (subgridsdtgridmaquinas_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTGRIDMAQUINAS_nRecordCount/ (double) (subgridsdtgridmaquinas_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTGRIDMAQUINAS_nRecordCount/ (double) (subgridsdtgridmaquinas_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtgridmaquinas_fnc_recordcount( )
   {
      return AV25SDTGridMaquina.size() ;
   }

   public int subgridsdtgridmaquinas_fnc_recordsperpage( )
   {
      if ( subGridsdtgridmaquinas_Rows > 0 )
      {
         return subGridsdtgridmaquinas_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtgridmaquinas_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage/ (double) (subgridsdtgridmaquinas_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtgridmaquinas_firstpage( )
   {
      GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtgridmaquinas_nextpage( )
   {
      GRIDSDTGRIDMAQUINAS_nRecordCount = subgridsdtgridmaquinas_fnc_recordcount( ) ;
      if ( ( GRIDSDTGRIDMAQUINAS_nRecordCount >= subgridsdtgridmaquinas_fnc_recordsperpage( ) ) && ( GRIDSDTGRIDMAQUINAS_nEOF == 0 ) )
      {
         GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = (long)(GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage+subgridsdtgridmaquinas_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtgridmaquinasContainer.AddObjectProperty("GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage", GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTGRIDMAQUINAS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtgridmaquinas_previouspage( )
   {
      if ( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage >= subgridsdtgridmaquinas_fnc_recordsperpage( ) )
      {
         GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = (long)(GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage-subgridsdtgridmaquinas_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtgridmaquinas_lastpage( )
   {
      GRIDSDTGRIDMAQUINAS_nRecordCount = subgridsdtgridmaquinas_fnc_recordcount( ) ;
      if ( GRIDSDTGRIDMAQUINAS_nRecordCount > subgridsdtgridmaquinas_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTGRIDMAQUINAS_nRecordCount) % (subgridsdtgridmaquinas_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = (long)(GRIDSDTGRIDMAQUINAS_nRecordCount-subgridsdtgridmaquinas_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = (long)(GRIDSDTGRIDMAQUINAS_nRecordCount-((int)((GRIDSDTGRIDMAQUINAS_nRecordCount) % (subgridsdtgridmaquinas_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtgridmaquinas_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = (long)(subgridsdtgridmaquinas_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV38Pgmname = "MantenimientoMaquina.TMPreveCopiarNMaquinas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_err = (short)(0) ;
      edtavPmcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmcod_Enabled), 5, 0), true);
      edtavPmdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmdsc_Enabled), 5, 0), true);
      edtavSdtgridmaquina__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtgridmaquina__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtgridmaquina__maqcod_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavSdtgridmaquina__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtgridmaquina__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtgridmaquina__maqdsc_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavSdtgridmaquina__tabla_mpreven_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtgridmaquina__tabla_mpreven_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtgridmaquina__tabla_mpreven_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2460( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162462 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtgridmaquina"), AV25SDTGridMaquina);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV6DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODIN_DATA"), AV12MaqCodIN_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTGRIDMAQUINA"), AV25SDTGridMaquina);
         /* Read saved values. */
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridSDTGridMaquinasCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTGRIDMAQUINASCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridSDTGridMaquinasPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTGRIDMAQUINASPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTGRIDMAQUINAS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTGRIDMAQUINAS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtgridmaquinas_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTGRIDMAQUINAS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_maqcodin_Cls = httpContext.cgiGet( "COMBO_MAQCODIN_Cls") ;
         Combo_maqcodin_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODIN_Selectedvalue_set") ;
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
         Gridsdtgridmaquinaspaginationbar_Class = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Class") ;
         Gridsdtgridmaquinaspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Showfirst")) ;
         Gridsdtgridmaquinaspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Showprevious")) ;
         Gridsdtgridmaquinaspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Shownext")) ;
         Gridsdtgridmaquinaspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Showlast")) ;
         Gridsdtgridmaquinaspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtgridmaquinaspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtgridmaquinaspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtgridmaquinaspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Emptygridclass") ;
         Gridsdtgridmaquinaspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtgridmaquinaspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtgridmaquinaspaginationbar_Previous = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Previous") ;
         Gridsdtgridmaquinaspaginationbar_Next = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Next") ;
         Gridsdtgridmaquinaspaginationbar_Caption = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Caption") ;
         Gridsdtgridmaquinaspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtgridmaquinaspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpagecaption") ;
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Gridsdtgridmaquinas_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSDTGRIDMAQUINAS_EMPOWERER_Gridinternalname") ;
         Gridsdtgridmaquinaspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Selectedpage") ;
         Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTGRIDMAQUINASPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         Combo_maqcodin_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCODIN_Selectedvalue_get") ;
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_69_fel_idx = 0 ;
         while ( nGXsfl_69_fel_idx < nRC_GXsfl_69 )
         {
            nGXsfl_69_fel_idx = ((subGridsdtgridmaquinas_Islastpage==1)&&(nGXsfl_69_fel_idx+1>subgridsdtgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_69_fel_idx+1) ;
            sGXsfl_69_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_692( ) ;
            AV33GXV1 = (int)(nGXsfl_69_fel_idx+GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage) ;
            if ( ( AV25SDTGridMaquina.size() >= AV33GXV1 ) && ( AV33GXV1 > 0 ) )
            {
               AV25SDTGridMaquina.currentItem( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)) );
            }
         }
         if ( nGXsfl_69_fel_idx == 0 )
         {
            nGXsfl_69_idx = 1 ;
            sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_692( ) ;
         }
         nGXsfl_69_fel_idx = 1 ;
         /* Read variables values. */
         AV38Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
         AV11MaqCodIN = httpContext.cgiGet( edtavMaqcodin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodIN", AV11MaqCodIN);
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
      e162462 ();
      if (returnInSub) return;
   }

   public void e162462( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmprevecopiarnmaquinas_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV40Emprnom ;
      GXv_char4[0] = AV41Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmprevecopiarnmaquinas_wp_impl.this.AV7EmprCod = GXv_char2[0] ;
      tmprevecopiarnmaquinas_wp_impl.this.AV40Emprnom = GXv_char3[0] ;
      tmprevecopiarnmaquinas_wp_impl.this.AV41Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      divTableresultado1_Height = 300 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableresultado1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado1_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV6DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV6DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavMaqcodin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodin_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCODIN' */
      S112 ();
      if (returnInSub) return;
      Gridsdtgridmaquinas_empowerer_Gridinternalname = subGridsdtgridmaquinas_Internalname ;
      ucGridsdtgridmaquinas_empowerer.sendProperty(context, "", false, Gridsdtgridmaquinas_empowerer_Internalname, "GridInternalName", Gridsdtgridmaquinas_empowerer_Gridinternalname);
      subGridsdtgridmaquinas_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Rows, (byte)(6), (byte)(0), ".", "")));
      chkavSdtgridmaquina__selected.setTitleFormat( (short)(1) );
      chkavSdtgridmaquina__selected.setTitle( GXutil.format( "<input name=\"selectAllCheckboxGridSDTGridMaquinas\" type=\"checkbox\" value=\"Select All\" onClick=\"WWPSelectAll(this, %1);\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" class=\"AttributeCheckBox\" >", "'SDTGRIDMAQUINA__SELECTED'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtgridmaquina__selected.getInternalname(), "Title", chkavSdtgridmaquina__selected.getTitle(), !bGXsfl_69_Refreshing);
      Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue = subGridsdtgridmaquinas_Rows ;
      ucGridsdtgridmaquinaspaginationbar.sendProperty(context, "", false, Gridsdtgridmaquinaspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 = AV25SDTGridMaquina ;
      GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8[0] = GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 ;
      new app.dpgridmaquinas(remoteHandle, context).execute( AV7EmprCod, AV11MaqCodIN, AV15PMDsc, GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8) ;
      GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 = GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8[0] ;
      AV25SDTGridMaquina = GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 ;
      gx_BV69 = true ;
   }

   public void e172462( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV26GridSDTGridMaquinasCurrentPage = subgridsdtgridmaquinas_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridSDTGridMaquinasCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridSDTGridMaquinasCurrentPage), 10, 0));
      AV27GridSDTGridMaquinasPageCount = subgridsdtgridmaquinas_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27GridSDTGridMaquinasPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridSDTGridMaquinasPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e182462( )
   {
      /* Gridsdtgridmaquinas_Load Routine */
      returnInSub = false ;
      AV33GXV1 = 1 ;
      while ( AV33GXV1 <= AV25SDTGridMaquina.size() )
      {
         AV25SDTGridMaquina.currentItem( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(69) ;
         }
         if ( ( subGridsdtgridmaquinas_Islastpage == 1 ) || ( subGridsdtgridmaquinas_Rows == 0 ) || ( ( GRIDSDTGRIDMAQUINAS_nCurrentRecord >= GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage ) && ( GRIDSDTGRIDMAQUINAS_nCurrentRecord < GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage + subgridsdtgridmaquinas_fnc_recordsperpage( ) ) ) )
         {
            sendrow_692( ) ;
            GRIDSDTGRIDMAQUINAS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTGRIDMAQUINAS_nCurrentRecord + 1 >= subgridsdtgridmaquinas_fnc_recordcount( ) )
            {
               GRIDSDTGRIDMAQUINAS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTGRIDMAQUINAS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTGRIDMAQUINAS_nCurrentRecord = (long)(GRIDSDTGRIDMAQUINAS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
         {
            httpContext.doAjaxLoad(69, GridsdtgridmaquinasRow);
         }
         AV33GXV1 = (int)(AV33GXV1+1) ;
      }
   }

   public void e132462( )
   {
      /* Gridsdtgridmaquinaspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtgridmaquinaspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtgridmaquinas_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtgridmaquinaspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV13PageToGo = subgridsdtgridmaquinas_fnc_currentpage( ) ;
         AV13PageToGo = (int)(AV13PageToGo+1) ;
         subgridsdtgridmaquinas_gotopage( AV13PageToGo) ;
      }
      else
      {
         AV13PageToGo = (int)(GXutil.lval( Gridsdtgridmaquinaspaginationbar_Selectedpage)) ;
         subgridsdtgridmaquinas_gotopage( AV13PageToGo) ;
      }
   }

   public void e142462( )
   {
      /* Gridsdtgridmaquinaspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtgridmaquinas_Rows = Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTGRIDMAQUINAS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtgridmaquinas_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e152462( )
   {
      AV33GXV1 = (int)(nGXsfl_69_idx+GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage) ;
      if ( ( AV33GXV1 > 0 ) && ( AV25SDTGridMaquina.size() >= AV33GXV1 ) )
      {
         AV25SDTGridMaquina.currentItem( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)) );
      }
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         new app.pmprevduplicar(remoteHandle, context).execute( AV25SDTGridMaquina, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         AV42GXV6 = 1 ;
         while ( AV42GXV6 <= AV25SDTGridMaquina.size() )
         {
            AV30SDTGridMaquina_maquina = (app.SdtSDTGridMaquina_SDTGridMaquinaItem)((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV42GXV6));
            AV30SDTGridMaquina_maquina.setgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected( false );
            AV42GXV6 = (int)(AV42GXV6+1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SDTGridMaquina", AV25SDTGridMaquina);
      nGXsfl_69_bak_idx = nGXsfl_69_idx ;
      gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
      nGXsfl_69_idx = nGXsfl_69_bak_idx ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
   }

   public void e122462( )
   {
      AV33GXV1 = (int)(nGXsfl_69_idx+GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage) ;
      if ( ( AV33GXV1 > 0 ) && ( AV25SDTGridMaquina.size() >= AV33GXV1 ) )
      {
         AV25SDTGridMaquina.currentItem( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)) );
      }
      /* Combo_maqcodin_Onoptionclicked Routine */
      returnInSub = false ;
      AV11MaqCodIN = Combo_maqcodin_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodIN", AV11MaqCodIN);
      GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 = AV25SDTGridMaquina ;
      GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8[0] = GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 ;
      new app.dpgridmaquinas(remoteHandle, context).execute( AV7EmprCod, AV11MaqCodIN, AV15PMDsc, GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8) ;
      GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 = GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8[0] ;
      AV25SDTGridMaquina = GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 ;
      gx_BV69 = true ;
      /*  Sending Event outputs  */
      if ( gx_BV69 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SDTGridMaquina", AV25SDTGridMaquina);
         nGXsfl_69_bak_idx = nGXsfl_69_idx ;
         gxgrgridsdtgridmaquinas_refresh( subGridsdtgridmaquinas_Rows, AV7EmprCod, AV14PMCod, AV15PMDsc) ;
         nGXsfl_69_idx = nGXsfl_69_bak_idx ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCODIN' Routine */
      returnInSub = false ;
      AV12MaqCodIN_Data.clear();
      /* Using cursor H02462 */
      pr_default.execute(0, new Object[] {AV7EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A607MaqEst = H02462_A607MaqEst[0] ;
         n607MaqEst = H02462_n607MaqEst[0] ;
         A396EmprCod = H02462_A396EmprCod[0] ;
         A602MaqCod = H02462_A602MaqCod[0] ;
         A606MaqDsc = H02462_A606MaqDsc[0] ;
         n606MaqDsc = H02462_n606MaqDsc[0] ;
         AV5Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV5Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
         AV5Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV12MaqCodIN_Data.add(AV5Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV12MaqCodIN_Data.sort("Title");
      Combo_maqcodin_Selectedvalue_set = AV11MaqCodIN ;
      ucCombo_maqcodin.sendProperty(context, "", false, Combo_maqcodin_Internalname, "SelectedValue_set", Combo_maqcodin_Selectedvalue_set);
   }

   public void wb_table1_85_2462( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_85_2462e( true) ;
      }
      else
      {
         wb_table1_85_2462e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      AV14PMCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14PMCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14PMCod), "ZZZZZZZ9")));
      AV15PMDsc = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15PMDsc", AV15PMDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15PMDsc, ""))));
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
      pa2462( ) ;
      ws2462( ) ;
      we2462( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714201098", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmprevecopiarnmaquinas_wp.js", "?202681714201098", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_692( )
   {
      chkavSdtgridmaquina__selected.setInternalname( "SDTGRIDMAQUINA__SELECTED_"+sGXsfl_69_idx );
      edtavSdtgridmaquina__maqcod_Internalname = "SDTGRIDMAQUINA__MAQCOD_"+sGXsfl_69_idx ;
      edtavSdtgridmaquina__maqdsc_Internalname = "SDTGRIDMAQUINA__MAQDSC_"+sGXsfl_69_idx ;
      edtavSdtgridmaquina__tabla_mpreven_Internalname = "SDTGRIDMAQUINA__TABLA_MPREVEN_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_692( )
   {
      chkavSdtgridmaquina__selected.setInternalname( "SDTGRIDMAQUINA__SELECTED_"+sGXsfl_69_fel_idx );
      edtavSdtgridmaquina__maqcod_Internalname = "SDTGRIDMAQUINA__MAQCOD_"+sGXsfl_69_fel_idx ;
      edtavSdtgridmaquina__maqdsc_Internalname = "SDTGRIDMAQUINA__MAQDSC_"+sGXsfl_69_fel_idx ;
      edtavSdtgridmaquina__tabla_mpreven_Internalname = "SDTGRIDMAQUINA__TABLA_MPREVEN_"+sGXsfl_69_fel_idx ;
   }

   public void sendrow_692( )
   {
      subsflControlProps_692( ) ;
      wb2460( ) ;
      if ( ( subGridsdtgridmaquinas_Rows * 1 == 0 ) || ( nGXsfl_69_idx <= subgridsdtgridmaquinas_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtgridmaquinasRow = GXWebRow.GetNew(context,GridsdtgridmaquinasContainer) ;
         if ( subGridsdtgridmaquinas_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtgridmaquinas_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtgridmaquinas_Class, "") != 0 )
            {
               subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"Odd" ;
            }
         }
         else if ( subGridsdtgridmaquinas_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtgridmaquinas_Backstyle = (byte)(0) ;
            subGridsdtgridmaquinas_Backcolor = subGridsdtgridmaquinas_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtgridmaquinas_Class, "") != 0 )
            {
               subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtgridmaquinas_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtgridmaquinas_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtgridmaquinas_Class, "") != 0 )
            {
               subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"Odd" ;
            }
            subGridsdtgridmaquinas_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtgridmaquinas_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtgridmaquinas_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
            {
               subGridsdtgridmaquinas_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtgridmaquinas_Class, "") != 0 )
               {
                  subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtgridmaquinas_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtgridmaquinas_Class, "") != 0 )
               {
                  subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_69_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSdtgridmaquina__selected.getEnabled()!=0)&&(chkavSdtgridmaquina__selected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'',false,'"+sGXsfl_69_idx+"',69)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTGRIDMAQUINA__SELECTED_" + sGXsfl_69_idx ;
         chkavSdtgridmaquina__selected.setName( GXCCtl );
         chkavSdtgridmaquina__selected.setWebtags( "" );
         chkavSdtgridmaquina__selected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdtgridmaquina__selected.getInternalname(), "TitleCaption", chkavSdtgridmaquina__selected.getCaption(), !bGXsfl_69_Refreshing);
         chkavSdtgridmaquina__selected.setCheckedValue( "false" );
         GridsdtgridmaquinasRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtgridmaquina__selected.getInternalname(),GXutil.booltostr( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)).getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Selected()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(70, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtgridmaquina__selected.getEnabled()!=0)&&(chkavSdtgridmaquina__selected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " ")});
         /* Subfile cell */
         if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtgridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtgridmaquina__maqcod_Internalname,GXutil.rtrim( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)).getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtgridmaquina__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtgridmaquina__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtgridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtgridmaquina__maqdsc_Internalname,GXutil.rtrim( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)).getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Maqdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtgridmaquina__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtgridmaquina__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtgridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtgridmaquina__tabla_mpreven_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)).getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtgridmaquina__tabla_mpreven_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)).getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTGridMaquina_SDTGridMaquinaItem)AV25SDTGridMaquina.elementAt(-1+AV33GXV1)).getgxTv_SdtSDTGridMaquina_SDTGridMaquinaItem_Tabla_mpreven()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtgridmaquina__tabla_mpreven_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtgridmaquina__tabla_mpreven_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2462( ) ;
         GridsdtgridmaquinasContainer.AddRow(GridsdtgridmaquinasRow);
         nGXsfl_69_idx = ((subGridsdtgridmaquinas_Islastpage==1)&&(nGXsfl_69_idx+1>subgridsdtgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      /* End function sendrow_692 */
   }

   public void startgridcontrol69( )
   {
      if ( GridsdtgridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridsdtgridmaquinasContainer"+"DivS\" data-gxgridid=\"69\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtgridmaquinas_Internalname, subGridsdtgridmaquinas_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtgridmaquinas_Backcolorstyle == 0 )
         {
            subGridsdtgridmaquinas_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtgridmaquinas_Class) > 0 )
            {
               subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtgridmaquinas_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtgridmaquinas_Backcolorstyle == 1 )
            {
               subGridsdtgridmaquinas_Titlebackcolor = subGridsdtgridmaquinas_Allbackcolor ;
               if ( GXutil.len( subGridsdtgridmaquinas_Class) > 0 )
               {
                  subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtgridmaquinas_Class) > 0 )
               {
                  subGridsdtgridmaquinas_Linesclass = subGridsdtgridmaquinas_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavSdtgridmaquina__selected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavSdtgridmaquina__selected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavSdtgridmaquina__selected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prevension ? ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtgridmaquinasContainer.AddObjectProperty("GridName", "Gridsdtgridmaquinas");
      }
      else
      {
         GridsdtgridmaquinasContainer.AddObjectProperty("GridName", "Gridsdtgridmaquinas");
         GridsdtgridmaquinasContainer.AddObjectProperty("Header", subGridsdtgridmaquinas_Header);
         GridsdtgridmaquinasContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtgridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("CmpContext", "");
         GridsdtgridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtgridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtgridmaquinasColumn.AddObjectProperty("Title", GXutil.rtrim( chkavSdtgridmaquina__selected.getTitle()));
         GridsdtgridmaquinasColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSdtgridmaquina__selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddColumnProperties(GridsdtgridmaquinasColumn);
         GridsdtgridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtgridmaquinasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtgridmaquina__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddColumnProperties(GridsdtgridmaquinasColumn);
         GridsdtgridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtgridmaquinasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtgridmaquina__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddColumnProperties(GridsdtgridmaquinasColumn);
         GridsdtgridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtgridmaquinasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtgridmaquina__tabla_mpreven_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddColumnProperties(GridsdtgridmaquinasColumn);
         GridsdtgridmaquinasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtgridmaquinasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtgridmaquinas_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavPmcod_Internalname = "vPMCOD" ;
      edtavPmdsc_Internalname = "vPMDSC" ;
      lblTextblockcombo_maqcodin_Internalname = "TEXTBLOCKCOMBO_MAQCODIN" ;
      Combo_maqcodin_Internalname = "COMBO_MAQCODIN" ;
      divTablesplittedmaqcodin_Internalname = "TABLESPLITTEDMAQCODIN" ;
      divTable_combo_Internalname = "TABLE_COMBO" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divTableaction_Internalname = "TABLEACTION" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      chkavSdtgridmaquina__selected.setInternalname( "SDTGRIDMAQUINA__SELECTED" );
      edtavSdtgridmaquina__maqcod_Internalname = "SDTGRIDMAQUINA__MAQCOD" ;
      edtavSdtgridmaquina__maqdsc_Internalname = "SDTGRIDMAQUINA__MAQDSC" ;
      edtavSdtgridmaquina__tabla_mpreven_Internalname = "SDTGRIDMAQUINA__TABLA_MPREVEN" ;
      Gridsdtgridmaquinaspaginationbar_Internalname = "GRIDSDTGRIDMAQUINASPAGINATIONBAR" ;
      divGridsdtgridmaquinastablewithpaginationbar_Internalname = "GRIDSDTGRIDMAQUINASTABLEWITHPAGINATIONBAR" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcodin_Internalname = "vMAQCODIN" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      Gridsdtgridmaquinas_empowerer_Internalname = "GRIDSDTGRIDMAQUINAS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridsdtgridmaquinas_Internalname = "GRIDSDTGRIDMAQUINAS" ;
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
      subGridsdtgridmaquinas_Allowcollapsing = (byte)(0) ;
      subGridsdtgridmaquinas_Allowselection = (byte)(0) ;
      subGridsdtgridmaquinas_Header = "" ;
      chkavSdtgridmaquina__selected.setTitleFormat( (short)(0) );
      chkavSdtgridmaquina__selected.setTitle( httpContext.getMessage( "Selected", "") );
      edtavSdtgridmaquina__tabla_mpreven_Jsonclick = "" ;
      edtavSdtgridmaquina__tabla_mpreven_Enabled = 0 ;
      edtavSdtgridmaquina__maqdsc_Jsonclick = "" ;
      edtavSdtgridmaquina__maqdsc_Enabled = 0 ;
      edtavSdtgridmaquina__maqcod_Jsonclick = "" ;
      edtavSdtgridmaquina__maqcod_Enabled = 0 ;
      chkavSdtgridmaquina__selected.setCaption( "" );
      chkavSdtgridmaquina__selected.setVisible( -1 );
      chkavSdtgridmaquina__selected.setEnabled( 1 );
      subGridsdtgridmaquinas_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtgridmaquinas_Backcolorstyle = (byte)(0) ;
      chkavSdtgridmaquina__selected.setTitle( httpContext.getMessage( "Selected", "") );
      edtavSdtgridmaquina__tabla_mpreven_Enabled = -1 ;
      edtavSdtgridmaquina__maqdsc_Enabled = -1 ;
      edtavSdtgridmaquina__maqcod_Enabled = -1 ;
      edtavMaqcodin_Jsonclick = "" ;
      edtavMaqcodin_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divTableresultado1_Height = 0 ;
      Combo_maqcodin_Caption = "" ;
      edtavPmdsc_Jsonclick = "" ;
      edtavPmdsc_Enabled = 0 ;
      edtavPmcod_Jsonclick = "" ;
      edtavPmcod_Enabled = 0 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "Desea copiar ?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = httpContext.getMessage( "Aviso", "") ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 1 ;
      Gridsdtgridmaquinaspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtgridmaquinaspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtgridmaquinaspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtgridmaquinaspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtgridmaquinaspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtgridmaquinaspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtgridmaquinaspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtgridmaquinaspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtgridmaquinaspaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtgridmaquinaspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtgridmaquinaspaginationbar_Pagestoshow = 5 ;
      Gridsdtgridmaquinaspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtgridmaquinaspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtgridmaquinaspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtgridmaquinaspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtgridmaquinaspaginationbar_Class = "PaginationBar" ;
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
      Combo_maqcodin_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Copiar Preventivo a n Máquinas", "") );
      subGridsdtgridmaquinas_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "SDTGRIDMAQUINA__SELECTED_" + sGXsfl_69_idx ;
      chkavSdtgridmaquina__selected.setName( GXCCtl );
      chkavSdtgridmaquina__selected.setWebtags( "" );
      chkavSdtgridmaquina__selected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtgridmaquina__selected.getInternalname(), "TitleCaption", chkavSdtgridmaquina__selected.getCaption(), !bGXsfl_69_Refreshing);
      chkavSdtgridmaquina__selected.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDSDTGRIDMAQUINAS_nEOF'},{av:'AV25SDTGridMaquina',fld:'vSDTGRIDMAQUINA',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'GridRC',grid:69},{av:'subGridsdtgridmaquinas_Rows',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14PMCod',fld:'vPMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV15PMDsc',fld:'vPMDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV26GridSDTGridMaquinasCurrentPage',fld:'vGRIDSDTGRIDMAQUINASCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridSDTGridMaquinasPageCount',fld:'vGRIDSDTGRIDMAQUINASPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDTGRIDMAQUINAS.LOAD","{handler:'e182462',iparms:[]");
      setEventMetadata("GRIDSDTGRIDMAQUINAS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTGRIDMAQUINASPAGINATIONBAR.CHANGEPAGE","{handler:'e132462',iparms:[{av:'GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDSDTGRIDMAQUINAS_nEOF'},{av:'AV25SDTGridMaquina',fld:'vSDTGRIDMAQUINA',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'GridRC',grid:69},{av:'subGridsdtgridmaquinas_Rows',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14PMCod',fld:'vPMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV15PMDsc',fld:'vPMDSC',pic:'',hsh:true},{av:'Gridsdtgridmaquinaspaginationbar_Selectedpage',ctrl:'GRIDSDTGRIDMAQUINASPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTGRIDMAQUINASPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTGRIDMAQUINASPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142462',iparms:[{av:'GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDSDTGRIDMAQUINAS_nEOF'},{av:'AV25SDTGridMaquina',fld:'vSDTGRIDMAQUINA',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'GridRC',grid:69},{av:'subGridsdtgridmaquinas_Rows',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14PMCod',fld:'vPMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV15PMDsc',fld:'vPMDSC',pic:'',hsh:true},{av:'Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTGRIDMAQUINASPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTGRIDMAQUINASPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtgridmaquinas_Rows',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'Rows'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e112461',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e152462',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV25SDTGridMaquina',fld:'vSDTGRIDMAQUINA',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'GridRC',grid:69},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14PMCod',fld:'vPMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV15PMDsc',fld:'vPMDSC',pic:'',hsh:true},{av:'GRIDSDTGRIDMAQUINAS_nEOF'},{av:'subGridsdtgridmaquinas_Rows',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'Rows'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV25SDTGridMaquina',fld:'vSDTGRIDMAQUINA',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'GridRC',grid:69}]}");
      setEventMetadata("COMBO_MAQCODIN.ONOPTIONCLICKED","{handler:'e122462',iparms:[{av:'Combo_maqcodin_Selectedvalue_get',ctrl:'COMBO_MAQCODIN',prop:'SelectedValue_get'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV15PMDsc',fld:'vPMDSC',pic:'',hsh:true},{av:'AV25SDTGridMaquina',fld:'vSDTGRIDMAQUINA',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'GridRC',grid:69},{av:'GRIDSDTGRIDMAQUINAS_nEOF'},{av:'subGridsdtgridmaquinas_Rows',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'Rows'},{av:'AV14PMCod',fld:'vPMCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("COMBO_MAQCODIN.ONOPTIONCLICKED",",oparms:[{av:'AV11MaqCodIN',fld:'vMAQCODIN',pic:''},{av:'AV25SDTGridMaquina',fld:'vSDTGRIDMAQUINA',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage'},{av:'nRC_GXsfl_69',ctrl:'GRIDSDTGRIDMAQUINAS',prop:'GridRC',grid:69}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv5',iparms:[]");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV15PMDsc = "" ;
      Gridsdtgridmaquinaspaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      Combo_maqcodin_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV15PMDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV25SDTGridMaquina = new GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem>(app.SdtSDTGridMaquina_SDTGridMaquinaItem.class, "SDTGridMaquinaItem", "TexplusNET", remoteHandle);
      AV6DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV12MaqCodIN_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_maqcodin_Selectedvalue_set = "" ;
      Gridsdtgridmaquinas_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcodin_Jsonclick = "" ;
      ucCombo_maqcodin = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      GridsdtgridmaquinasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtgridmaquinaspaginationbar = new com.genexus.webpanels.GXUserControl();
      AV38Pgmname = "" ;
      AV11MaqCodIN = "" ;
      ucGridsdtgridmaquinas_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV39Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV40Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV41Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GridsdtgridmaquinasRow = new com.genexus.webpanels.GXWebRow();
      AV30SDTGridMaquina_maquina = new app.SdtSDTGridMaquina_SDTGridMaquinaItem(remoteHandle, context);
      GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 = new GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem>(app.SdtSDTGridMaquina_SDTGridMaquinaItem.class, "SDTGridMaquinaItem", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8 = new GXBaseCollection[1] ;
      scmdbuf = "" ;
      H02462_A607MaqEst = new String[] {""} ;
      H02462_n607MaqEst = new boolean[] {false} ;
      H02462_A396EmprCod = new String[] {""} ;
      H02462_A602MaqCod = new String[] {""} ;
      H02462_A606MaqDsc = new String[] {""} ;
      H02462_n606MaqDsc = new boolean[] {false} ;
      A607MaqEst = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV5Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridsdtgridmaquinas_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridsdtgridmaquinasColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmprevecopiarnmaquinas_wp__default(),
         new Object[] {
             new Object[] {
            H02462_A607MaqEst, H02462_n607MaqEst, H02462_A396EmprCod, H02462_A602MaqCod, H02462_A606MaqDsc, H02462_n606MaqDsc
            }
         }
      );
      AV38Pgmname = "MantenimientoMaquina.TMPreveCopiarNMaquinas_WP" ;
      /* GeneXus formulas. */
      AV38Pgmname = "MantenimientoMaquina.TMPreveCopiarNMaquinas_WP" ;
      Gx_err = (short)(0) ;
      edtavPmcod_Enabled = 0 ;
      edtavPmdsc_Enabled = 0 ;
      edtavSdtgridmaquina__maqcod_Enabled = 0 ;
      edtavSdtgridmaquina__maqdsc_Enabled = 0 ;
      edtavSdtgridmaquina__tabla_mpreven_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDSDTGRIDMAQUINAS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridsdtgridmaquinas_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridsdtgridmaquinas_Backstyle ;
   private byte subGridsdtgridmaquinas_Titlebackstyle ;
   private byte subGridsdtgridmaquinas_Allowselection ;
   private byte subGridsdtgridmaquinas_Allowhovering ;
   private byte subGridsdtgridmaquinas_Allowcollapsing ;
   private byte subGridsdtgridmaquinas_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV14PMCod ;
   private int Gridsdtgridmaquinaspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_69 ;
   private int subGridsdtgridmaquinas_Rows ;
   private int AV14PMCod ;
   private int nGXsfl_69_idx=1 ;
   private int Gridsdtgridmaquinaspaginationbar_Pagestoshow ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavPmcod_Enabled ;
   private int edtavPmdsc_Enabled ;
   private int divTableresultado1_Height ;
   private int AV33GXV1 ;
   private int edtavPgmname_Enabled ;
   private int edtavMaqcodin_Visible ;
   private int subGridsdtgridmaquinas_Islastpage ;
   private int edtavSdtgridmaquina__maqcod_Enabled ;
   private int edtavSdtgridmaquina__maqdsc_Enabled ;
   private int edtavSdtgridmaquina__tabla_mpreven_Enabled ;
   private int GRIDSDTGRIDMAQUINAS_nGridOutOfScope ;
   private int nGXsfl_69_fel_idx=1 ;
   private int AV13PageToGo ;
   private int AV42GXV6 ;
   private int nGXsfl_69_bak_idx=1 ;
   private int idxLst ;
   private int subGridsdtgridmaquinas_Backcolor ;
   private int subGridsdtgridmaquinas_Allbackcolor ;
   private int subGridsdtgridmaquinas_Titlebackcolor ;
   private int subGridsdtgridmaquinas_Selectedindex ;
   private int subGridsdtgridmaquinas_Selectioncolor ;
   private int subGridsdtgridmaquinas_Hoveringcolor ;
   private long GRIDSDTGRIDMAQUINAS_nFirstRecordOnPage ;
   private long AV26GridSDTGridMaquinasCurrentPage ;
   private long AV27GridSDTGridMaquinasPageCount ;
   private long GRIDSDTGRIDMAQUINAS_nCurrentRecord ;
   private long GRIDSDTGRIDMAQUINAS_nRecordCount ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV15PMDsc ;
   private String Gridsdtgridmaquinaspaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String Combo_maqcodin_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV15PMDsc ;
   private String sGXsfl_69_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_maqcodin_Cls ;
   private String Combo_maqcodin_Selectedvalue_set ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Gridsdtgridmaquinaspaginationbar_Class ;
   private String Gridsdtgridmaquinaspaginationbar_Pagingbuttonsposition ;
   private String Gridsdtgridmaquinaspaginationbar_Pagingcaptionposition ;
   private String Gridsdtgridmaquinaspaginationbar_Emptygridclass ;
   private String Gridsdtgridmaquinaspaginationbar_Rowsperpageoptions ;
   private String Gridsdtgridmaquinaspaginationbar_Previous ;
   private String Gridsdtgridmaquinaspaginationbar_Next ;
   private String Gridsdtgridmaquinaspaginationbar_Caption ;
   private String Gridsdtgridmaquinaspaginationbar_Emptygridcaption ;
   private String Gridsdtgridmaquinaspaginationbar_Rowsperpagecaption ;
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Gridsdtgridmaquinas_empowerer_Gridinternalname ;
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
   private String edtavPmcod_Internalname ;
   private String edtavPmcod_Jsonclick ;
   private String edtavPmdsc_Internalname ;
   private String edtavPmdsc_Jsonclick ;
   private String divTable_combo_Internalname ;
   private String divTablesplittedmaqcodin_Internalname ;
   private String lblTextblockcombo_maqcodin_Internalname ;
   private String lblTextblockcombo_maqcodin_Jsonclick ;
   private String Combo_maqcodin_Caption ;
   private String Combo_maqcodin_Internalname ;
   private String divTableaction_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String divGridsdtgridmaquinastablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdtgridmaquinas_Internalname ;
   private String Gridsdtgridmaquinaspaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV38Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcodin_Internalname ;
   private String AV11MaqCodIN ;
   private String edtavMaqcodin_Jsonclick ;
   private String Gridsdtgridmaquinas_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtgridmaquina__maqcod_Internalname ;
   private String edtavSdtgridmaquina__maqdsc_Internalname ;
   private String edtavSdtgridmaquina__tabla_mpreven_Internalname ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String AV39Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV40Emprnom ;
   private String GXv_char3[] ;
   private String AV41Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A607MaqEst ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String subGridsdtgridmaquinas_Class ;
   private String subGridsdtgridmaquinas_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSdtgridmaquina__maqcod_Jsonclick ;
   private String edtavSdtgridmaquina__maqdsc_Jsonclick ;
   private String edtavSdtgridmaquina__tabla_mpreven_Jsonclick ;
   private String subGridsdtgridmaquinas_Header ;
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
   private boolean Gridsdtgridmaquinaspaginationbar_Showfirst ;
   private boolean Gridsdtgridmaquinaspaginationbar_Showprevious ;
   private boolean Gridsdtgridmaquinaspaginationbar_Shownext ;
   private boolean Gridsdtgridmaquinaspaginationbar_Showlast ;
   private boolean Gridsdtgridmaquinaspaginationbar_Rowsperpageselector ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV69 ;
   private boolean gx_refresh_fired ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private com.genexus.webpanels.GXWebGrid GridsdtgridmaquinasContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtgridmaquinasRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtgridmaquinasColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodin ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucGridsdtgridmaquinaspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridsdtgridmaquinas_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private ICheckbox chkavSdtgridmaquina__selected ;
   private IDataStoreProvider pr_default ;
   private String[] H02462_A607MaqEst ;
   private boolean[] H02462_n607MaqEst ;
   private String[] H02462_A396EmprCod ;
   private String[] H02462_A602MaqCod ;
   private String[] H02462_A606MaqDsc ;
   private boolean[] H02462_n606MaqDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12MaqCodIN_Data ;
   private GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem> AV25SDTGridMaquina ;
   private GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem> GXt_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem7 ;
   private GXBaseCollection<app.SdtSDTGridMaquina_SDTGridMaquinaItem> GXv_objcol_SdtSDTGridMaquina_SDTGridMaquinaItem8[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV5Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV6DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.SdtSDTGridMaquina_SDTGridMaquinaItem AV30SDTGridMaquina_maquina ;
}

final  class tmprevecopiarnmaquinas_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02462", "SELECT MaqEst, EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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

