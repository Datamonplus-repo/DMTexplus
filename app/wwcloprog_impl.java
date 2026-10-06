package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwcloprog_impl extends GXDataArea
{
   public wwcloprog_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwcloprog_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwcloprog_impl.class ));
   }

   public wwcloprog_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSdt_proces__selected = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdt_process") == 0 )
         {
            gxnrgridsdt_process_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdt_process") == 0 )
         {
            gxgrgridsdt_process_refresh_invoke( ) ;
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
            AV6EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV7EmprDes = httpContext.GetPar( "EmprDes") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7EmprDes", AV7EmprDes);
               AV9EmprNom2 = httpContext.GetPar( "EmprNom2") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom2", AV9EmprNom2);
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

   public void gxnrgridsdt_process_newrow_invoke( )
   {
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdt_process_newrow( ) ;
      /* End function gxnrGridsdt_process_newrow_invoke */
   }

   public void gxgrgridsdt_process_refresh_invoke( )
   {
      subGridsdt_process_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdt_process_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV45SDT_PROCES);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdt_process_refresh( subGridsdt_process_Rows, AV45SDT_PROCES) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdt_process_refresh_invoke */
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
      pa24A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start24A2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wwcloprog", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV7EmprDes)),GXutil.URLEncode(GXutil.rtrim(AV9EmprNom2))}, new String[] {"EmprCod","EmprDes","EmprNom2"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDT_PROCES", getSecureSignedToken( "", AV45SDT_PROCES));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdt_proces", AV45SDT_PROCES);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdt_proces", AV45SDT_PROCES);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Sdt_proces", getSecureSignedToken( "", AV45SDT_PROCES));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDT_PROCESSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridSDT_PROCESsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDT_PROCESSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridSDT_PROCESsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDT_PROCES", AV45SDT_PROCES);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDT_PROCES", AV45SDT_PROCES);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDT_PROCES", getSecureSignedToken( "", AV45SDT_PROCES));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV34ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRNOM2", GXutil.rtrim( AV9EmprNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Class", GXutil.rtrim( Gridsdt_processpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdt_processpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdt_processpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdt_processpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdt_processpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdt_processpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdt_processpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdt_processpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdt_processpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdt_processpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdt_processpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdt_processpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdt_processpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Next", GXutil.rtrim( Gridsdt_processpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdt_processpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdt_processpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdt_processpaginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdt_process_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdt_processpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdt_processpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdt_processpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdt_processpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we24A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt24A2( ) ;
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
      return formatLink("app.wwcloprog", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV7EmprDes)),GXutil.URLEncode(GXutil.rtrim(AV9EmprNom2))}, new String[] {"EmprCod","EmprDes","EmprNom2"})  ;
   }

   public String getPgmname( )
   {
      return "WWCLOPROG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DUPLICAR PROCESOS PROD. GENERAL", "") ;
   }

   public void wb24A0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEmprdes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprdes_Internalname, httpContext.getMessage( "Código Empresa", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprdes_Internalname, GXutil.rtrim( AV7EmprDes), GXutil.rtrim( localUtil.format( AV7EmprDes, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprdes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprdes_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WWCLOPROG.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1124a1_client"+"'", TempTags, "", 2, "HLP_WWCLOPROG.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdt_processtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridsdt_processContainer.SetWrapped(nGXWrapped);
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
         if ( Gridsdt_processContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV52GXV1 = nGXsfl_52_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridsdt_processContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsdt_process", Gridsdt_processContainer, subGridsdt_process_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_processContainerData", Gridsdt_processContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_processContainerData"+"V", Gridsdt_processContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridsdt_processContainerData"+"V"+"\" value='"+Gridsdt_processContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdt_processpaginationbar.setProperty("Class", Gridsdt_processpaginationbar_Class);
         ucGridsdt_processpaginationbar.setProperty("ShowFirst", Gridsdt_processpaginationbar_Showfirst);
         ucGridsdt_processpaginationbar.setProperty("ShowPrevious", Gridsdt_processpaginationbar_Showprevious);
         ucGridsdt_processpaginationbar.setProperty("ShowNext", Gridsdt_processpaginationbar_Shownext);
         ucGridsdt_processpaginationbar.setProperty("ShowLast", Gridsdt_processpaginationbar_Showlast);
         ucGridsdt_processpaginationbar.setProperty("PagesToShow", Gridsdt_processpaginationbar_Pagestoshow);
         ucGridsdt_processpaginationbar.setProperty("PagingButtonsPosition", Gridsdt_processpaginationbar_Pagingbuttonsposition);
         ucGridsdt_processpaginationbar.setProperty("PagingCaptionPosition", Gridsdt_processpaginationbar_Pagingcaptionposition);
         ucGridsdt_processpaginationbar.setProperty("EmptyGridClass", Gridsdt_processpaginationbar_Emptygridclass);
         ucGridsdt_processpaginationbar.setProperty("RowsPerPageSelector", Gridsdt_processpaginationbar_Rowsperpageselector);
         ucGridsdt_processpaginationbar.setProperty("RowsPerPageOptions", Gridsdt_processpaginationbar_Rowsperpageoptions);
         ucGridsdt_processpaginationbar.setProperty("Previous", Gridsdt_processpaginationbar_Previous);
         ucGridsdt_processpaginationbar.setProperty("Next", Gridsdt_processpaginationbar_Next);
         ucGridsdt_processpaginationbar.setProperty("Caption", Gridsdt_processpaginationbar_Caption);
         ucGridsdt_processpaginationbar.setProperty("EmptyGridCaption", Gridsdt_processpaginationbar_Emptygridcaption);
         ucGridsdt_processpaginationbar.setProperty("RowsPerPageCaption", Gridsdt_processpaginationbar_Rowsperpagecaption);
         ucGridsdt_processpaginationbar.setProperty("CurrentPage", AV46GridSDT_PROCESsCurrentPage);
         ucGridsdt_processpaginationbar.setProperty("PageCount", AV47GridSDT_PROCESsPageCount);
         ucGridsdt_processpaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdt_processpaginationbar_Internalname, "GRIDSDT_PROCESSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WWCLOPROG.htm");
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
         wb_table1_69_24A2( true) ;
      }
      else
      {
         wb_table1_69_24A2( false) ;
      }
      return  ;
   }

   public void wb_table1_69_24A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridsdt_process_empowerer.render(context, "wwp.gridempowerer", Gridsdt_process_empowerer_Internalname, "GRIDSDT_PROCESS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridsdt_processContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV52GXV1 = nGXsfl_52_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridsdt_processContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsdt_process", Gridsdt_processContainer, subGridsdt_process_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_processContainerData", Gridsdt_processContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_processContainerData"+"V", Gridsdt_processContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridsdt_processContainerData"+"V"+"\" value='"+Gridsdt_processContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start24A2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DUPLICAR PROCESOS PROD. GENERAL", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup24A0( ) ;
   }

   public void ws24A2( )
   {
      start24A2( ) ;
      evt24A2( ) ;
   }

   public void evt24A2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDT_PROCESSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1224A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDT_PROCESSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1324A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1424A2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "GRIDSDT_PROCESS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           AV52GXV1 = (int)(nGXsfl_52_idx+GRIDSDT_PROCESS_nFirstRecordOnPage) ;
                           if ( ( AV45SDT_PROCES.size() >= AV52GXV1 ) && ( AV52GXV1 > 0 ) )
                           {
                              AV45SDT_PROCES.currentItem( ((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV52GXV1)) );
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
                                 e1524A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1624A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDT_PROCESS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1724A2 ();
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

   public void we24A2( )
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

   public void pa24A2( )
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

   public void gxnrgridsdt_process_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGridsdt_process_Islastpage==1)&&(nGXsfl_52_idx+1>subgridsdt_process_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridsdt_processContainer)) ;
      /* End function gxnrGridsdt_process_newrow */
   }

   public void gxgrgridsdt_process_refresh( int subGridsdt_process_Rows ,
                                            GXBaseCollection<app.SdtSDT_PROCES_PROCESSO> AV45SDT_PROCES )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1624A2 ();
      GRIDSDT_PROCESS_nCurrentRecord = 0 ;
      rf24A2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdt_process_refresh */
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
      rf24A2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV56Pgmname = "WWCLOPROG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprdes_Enabled), 5, 0), true);
      chkavSdt_proces__selected.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdt_proces__selected.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdt_proces__selected.getEnabled(), 5, 0), !bGXsfl_52_Refreshing);
      edtavSdt_proces__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_proces__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_proces__procod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavSdt_proces__prodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_proces__prodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_proces__prodsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24A2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridsdt_processContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e1624A2 ();
      nGXsfl_52_idx = 1 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
      Gridsdt_processContainer.AddObjectProperty("GridName", "Gridsdt_process");
      Gridsdt_processContainer.AddObjectProperty("CmpContext", "");
      Gridsdt_processContainer.AddObjectProperty("InMasterPage", "false");
      Gridsdt_processContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridsdt_processContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridsdt_processContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridsdt_processContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridsdt_processContainer.setPageSize( subgridsdt_process_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_522( ) ;
         e1724A2 ();
         if ( ( GRIDSDT_PROCESS_nCurrentRecord > 0 ) && ( GRIDSDT_PROCESS_nGridOutOfScope == 0 ) && ( nGXsfl_52_idx == 1 ) )
         {
            GRIDSDT_PROCESS_nCurrentRecord = 0 ;
            GRIDSDT_PROCESS_nGridOutOfScope = 1 ;
            subgridsdt_process_firstpage( ) ;
            e1724A2 ();
         }
         wbEnd = (short)(52) ;
         wb24A0( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24A2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDT_PROCES", AV45SDT_PROCES);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDT_PROCES", AV45SDT_PROCES);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDT_PROCES", getSecureSignedToken( "", AV45SDT_PROCES));
   }

   public int subgridsdt_process_fnc_pagecount( )
   {
      GRIDSDT_PROCESS_nRecordCount = subgridsdt_process_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDT_PROCESS_nRecordCount) % (subgridsdt_process_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDT_PROCESS_nRecordCount/ (double) (subgridsdt_process_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDT_PROCESS_nRecordCount/ (double) (subgridsdt_process_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdt_process_fnc_recordcount( )
   {
      return AV45SDT_PROCES.size() ;
   }

   public int subgridsdt_process_fnc_recordsperpage( )
   {
      if ( subGridsdt_process_Rows > 0 )
      {
         return subGridsdt_process_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdt_process_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDT_PROCESS_nFirstRecordOnPage/ (double) (subgridsdt_process_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdt_process_firstpage( )
   {
      GRIDSDT_PROCESS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_process_refresh( subGridsdt_process_Rows, AV45SDT_PROCES) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdt_process_nextpage( )
   {
      GRIDSDT_PROCESS_nRecordCount = subgridsdt_process_fnc_recordcount( ) ;
      if ( ( GRIDSDT_PROCESS_nRecordCount >= subgridsdt_process_fnc_recordsperpage( ) ) && ( GRIDSDT_PROCESS_nEOF == 0 ) )
      {
         GRIDSDT_PROCESS_nFirstRecordOnPage = (long)(GRIDSDT_PROCESS_nFirstRecordOnPage+subgridsdt_process_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridsdt_processContainer.AddObjectProperty("GRIDSDT_PROCESS_nFirstRecordOnPage", GRIDSDT_PROCESS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_process_refresh( subGridsdt_process_Rows, AV45SDT_PROCES) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDT_PROCESS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdt_process_previouspage( )
   {
      if ( GRIDSDT_PROCESS_nFirstRecordOnPage >= subgridsdt_process_fnc_recordsperpage( ) )
      {
         GRIDSDT_PROCESS_nFirstRecordOnPage = (long)(GRIDSDT_PROCESS_nFirstRecordOnPage-subgridsdt_process_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_process_refresh( subGridsdt_process_Rows, AV45SDT_PROCES) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdt_process_lastpage( )
   {
      GRIDSDT_PROCESS_nRecordCount = subgridsdt_process_fnc_recordcount( ) ;
      if ( GRIDSDT_PROCESS_nRecordCount > subgridsdt_process_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDT_PROCESS_nRecordCount) % (subgridsdt_process_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDT_PROCESS_nFirstRecordOnPage = (long)(GRIDSDT_PROCESS_nRecordCount-subgridsdt_process_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDT_PROCESS_nFirstRecordOnPage = (long)(GRIDSDT_PROCESS_nRecordCount-((int)((GRIDSDT_PROCESS_nRecordCount) % (subgridsdt_process_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDT_PROCESS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_process_refresh( subGridsdt_process_Rows, AV45SDT_PROCES) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdt_process_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDT_PROCESS_nFirstRecordOnPage = (long)(subgridsdt_process_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDT_PROCESS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_process_refresh( subGridsdt_process_Rows, AV45SDT_PROCES) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV56Pgmname = "WWCLOPROG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprdes_Enabled), 5, 0), true);
      chkavSdt_proces__selected.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdt_proces__selected.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdt_proces__selected.getEnabled(), 5, 0), !bGXsfl_52_Refreshing);
      edtavSdt_proces__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_proces__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_proces__procod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavSdt_proces__prodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_proces__prodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_proces__prodsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1524A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdt_proces"), AV45SDT_PROCES);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDT_PROCES"), AV45SDT_PROCES);
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridSDT_PROCESsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDSDT_PROCESSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridSDT_PROCESsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDSDT_PROCESSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDT_PROCESS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSDT_PROCESS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDT_PROCESS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSDT_PROCESS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdt_process_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDT_PROCESS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Gridsdt_processpaginationbar_Class = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Class") ;
         Gridsdt_processpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Showfirst")) ;
         Gridsdt_processpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Showprevious")) ;
         Gridsdt_processpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Shownext")) ;
         Gridsdt_processpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Showlast")) ;
         Gridsdt_processpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdt_processpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdt_processpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdt_processpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Emptygridclass") ;
         Gridsdt_processpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdt_processpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdt_processpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdt_processpaginationbar_Previous = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Previous") ;
         Gridsdt_processpaginationbar_Next = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Next") ;
         Gridsdt_processpaginationbar_Caption = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Caption") ;
         Gridsdt_processpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Emptygridcaption") ;
         Gridsdt_processpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpagecaption") ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Gridsdt_process_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSDT_PROCESS_EMPOWERER_Gridinternalname") ;
         Gridsdt_processpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Selectedpage") ;
         Gridsdt_processpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDT_PROCESSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_52_fel_idx = 0 ;
         while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
         {
            nGXsfl_52_fel_idx = ((subGridsdt_process_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgridsdt_process_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
            sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_522( ) ;
            AV52GXV1 = (int)(nGXsfl_52_fel_idx+GRIDSDT_PROCESS_nFirstRecordOnPage) ;
            if ( ( AV45SDT_PROCES.size() >= AV52GXV1 ) && ( AV52GXV1 > 0 ) )
            {
               AV45SDT_PROCES.currentItem( ((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV52GXV1)) );
            }
         }
         if ( nGXsfl_52_fel_idx == 0 )
         {
            nGXsfl_52_idx = 1 ;
            sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_522( ) ;
         }
         nGXsfl_52_fel_idx = 1 ;
         /* Read variables values. */
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
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
      e1524A2 ();
      if (returnInSub) return;
   }

   public void e1524A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwcloprog_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwcloprog_impl.this.AV6EmprCod = GXv_char2[0] ;
      wwcloprog_impl.this.AV8EmprNom = GXv_char3[0] ;
      wwcloprog_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      Gridsdt_process_empowerer_Gridinternalname = subGridsdt_process_Internalname ;
      ucGridsdt_process_empowerer.sendProperty(context, "", false, Gridsdt_process_empowerer_Internalname, "GridInternalName", Gridsdt_process_empowerer_Gridinternalname);
      subGridsdt_process_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Rows, (byte)(6), (byte)(0), ".", "")));
      chkavSdt_proces__selected.setTitleFormat( (short)(1) );
      chkavSdt_proces__selected.setTitle( GXutil.format( "<input name=\"selectAllCheckboxGridSDT_PROCESs\" type=\"checkbox\" value=\"Select All\" onClick=\"WWPSelectAll(this, %1);\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" class=\"AttributeCheckBox\" >", "'SDT_PROCES__SELECTED'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdt_proces__selected.getInternalname(), "Title", chkavSdt_proces__selected.getTitle(), !bGXsfl_52_Refreshing);
      Gridsdt_processpaginationbar_Rowsperpageselectedvalue = subGridsdt_process_Rows ;
      ucGridsdt_processpaginationbar.sendProperty(context, "", false, Gridsdt_processpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdt_processpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtSDT_PROCES_PROCESSO5 = AV45SDT_PROCES ;
      GXv_objcol_SdtSDT_PROCES_PROCESSO6[0] = GXt_objcol_SdtSDT_PROCES_PROCESSO5 ;
      new app.dp_process(remoteHandle, context).execute( AV6EmprCod, GXv_objcol_SdtSDT_PROCES_PROCESSO6) ;
      GXt_objcol_SdtSDT_PROCES_PROCESSO5 = GXv_objcol_SdtSDT_PROCES_PROCESSO6[0] ;
      AV45SDT_PROCES = GXt_objcol_SdtSDT_PROCES_PROCESSO5 ;
      gx_BV52 = true ;
      AV48TotalProcesso = (short)(AV45SDT_PROCES.size()) ;
   }

   public void e1624A2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV46GridSDT_PROCESsCurrentPage = subgridsdt_process_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridSDT_PROCESsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridSDT_PROCESsCurrentPage), 10, 0));
      AV47GridSDT_PROCESsPageCount = subgridsdt_process_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridSDT_PROCESsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridSDT_PROCESsPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e1724A2( )
   {
      /* Gridsdt_process_Load Routine */
      returnInSub = false ;
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV45SDT_PROCES.size() )
      {
         AV45SDT_PROCES.currentItem( ((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV52GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(52) ;
         }
         if ( ( subGridsdt_process_Islastpage == 1 ) || ( subGridsdt_process_Rows == 0 ) || ( ( GRIDSDT_PROCESS_nCurrentRecord >= GRIDSDT_PROCESS_nFirstRecordOnPage ) && ( GRIDSDT_PROCESS_nCurrentRecord < GRIDSDT_PROCESS_nFirstRecordOnPage + subgridsdt_process_fnc_recordsperpage( ) ) ) )
         {
            sendrow_522( ) ;
            GRIDSDT_PROCESS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDT_PROCESS_nCurrentRecord + 1 >= subgridsdt_process_fnc_recordcount( ) )
            {
               GRIDSDT_PROCESS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDT_PROCESS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDT_PROCESS_nCurrentRecord = (long)(GRIDSDT_PROCESS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
         {
            httpContext.doAjaxLoad(52, Gridsdt_processRow);
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void e1224A2( )
   {
      /* Gridsdt_processpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdt_processpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdt_process_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdt_processpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV42PageToGo = subgridsdt_process_fnc_currentpage( ) ;
         AV42PageToGo = (int)(AV42PageToGo+1) ;
         subgridsdt_process_gotopage( AV42PageToGo) ;
      }
      else
      {
         AV42PageToGo = (int)(GXutil.lval( Gridsdt_processpaginationbar_Selectedpage)) ;
         subgridsdt_process_gotopage( AV42PageToGo) ;
      }
   }

   public void e1324A2( )
   {
      /* Gridsdt_processpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdt_process_Rows = Gridsdt_processpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_PROCESS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdt_process_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1424A2( )
   {
      AV52GXV1 = (int)(nGXsfl_52_idx+GRIDSDT_PROCESS_nFirstRecordOnPage) ;
      if ( ( AV52GXV1 > 0 ) && ( AV45SDT_PROCES.size() >= AV52GXV1 ) )
      {
         AV45SDT_PROCES.currentItem( ((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV52GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV57GXV5 = 1 ;
      while ( AV57GXV5 <= AV45SDT_PROCES.size() )
      {
         AV49SDT_PROCES_PROCESSO = (app.SdtSDT_PROCES_PROCESSO)((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV57GXV5));
         if ( AV49SDT_PROCES_PROCESSO.getgxTv_SdtSDT_PROCES_PROCESSO_Selected() )
         {
            AV35ProCodDes = AV49SDT_PROCES_PROCESSO.getgxTv_SdtSDT_PROCES_PROCESSO_Procod() ;
            GXv_char4[0] = AV6EmprCod ;
            GXv_char3[0] = AV34ProCod ;
            GXv_char2[0] = AV7EmprDes ;
            GXv_char7[0] = AV35ProCodDes ;
            new app.pnewppr(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char7) ;
            wwcloprog_impl.this.AV6EmprCod = GXv_char4[0] ;
            wwcloprog_impl.this.AV34ProCod = GXv_char3[0] ;
            wwcloprog_impl.this.AV7EmprDes = GXv_char2[0] ;
            wwcloprog_impl.this.AV35ProCodDes = GXv_char7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV34ProCod", AV34ProCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprDes", AV7EmprDes);
         }
         AV57GXV5 = (int)(AV57GXV5+1) ;
      }
   }

   public void wb_table1_69_24A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_69_24A2e( true) ;
      }
      else
      {
         wb_table1_69_24A2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      AV7EmprDes = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprDes", AV7EmprDes);
      AV9EmprNom2 = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom2", AV9EmprNom2);
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
      pa24A2( ) ;
      ws24A2( ) ;
      we24A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016445674", true, true);
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
      httpContext.AddJavascriptSource("wwcloprog.js", "?202661016445674", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      chkavSdt_proces__selected.setInternalname( "SDT_PROCES__SELECTED_"+sGXsfl_52_idx );
      edtavSdt_proces__procod_Internalname = "SDT_PROCES__PROCOD_"+sGXsfl_52_idx ;
      edtavSdt_proces__prodsc_Internalname = "SDT_PROCES__PRODSC_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      chkavSdt_proces__selected.setInternalname( "SDT_PROCES__SELECTED_"+sGXsfl_52_fel_idx );
      edtavSdt_proces__procod_Internalname = "SDT_PROCES__PROCOD_"+sGXsfl_52_fel_idx ;
      edtavSdt_proces__prodsc_Internalname = "SDT_PROCES__PRODSC_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wb24A0( ) ;
      if ( ( subGridsdt_process_Rows * 1 == 0 ) || ( nGXsfl_52_idx <= subgridsdt_process_fnc_recordsperpage( ) * 1 ) )
      {
         Gridsdt_processRow = GXWebRow.GetNew(context,Gridsdt_processContainer) ;
         if ( subGridsdt_process_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdt_process_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdt_process_Class, "") != 0 )
            {
               subGridsdt_process_Linesclass = subGridsdt_process_Class+"Odd" ;
            }
         }
         else if ( subGridsdt_process_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdt_process_Backstyle = (byte)(0) ;
            subGridsdt_process_Backcolor = subGridsdt_process_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdt_process_Class, "") != 0 )
            {
               subGridsdt_process_Linesclass = subGridsdt_process_Class+"Uniform" ;
            }
         }
         else if ( subGridsdt_process_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdt_process_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdt_process_Class, "") != 0 )
            {
               subGridsdt_process_Linesclass = subGridsdt_process_Class+"Odd" ;
            }
            subGridsdt_process_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdt_process_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdt_process_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
            {
               subGridsdt_process_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdt_process_Class, "") != 0 )
               {
                  subGridsdt_process_Linesclass = subGridsdt_process_Class+"Even" ;
               }
            }
            else
            {
               subGridsdt_process_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdt_process_Class, "") != 0 )
               {
                  subGridsdt_process_Linesclass = subGridsdt_process_Class+"Odd" ;
               }
            }
         }
         if ( Gridsdt_processContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridsdt_processContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDT_PROCES__SELECTED_" + sGXsfl_52_idx ;
         chkavSdt_proces__selected.setName( GXCCtl );
         chkavSdt_proces__selected.setWebtags( "" );
         chkavSdt_proces__selected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdt_proces__selected.getInternalname(), "TitleCaption", chkavSdt_proces__selected.getCaption(), !bGXsfl_52_Refreshing);
         chkavSdt_proces__selected.setCheckedValue( "false" );
         Gridsdt_processRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdt_proces__selected.getInternalname(),GXutil.booltostr( ((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV52GXV1)).getgxTv_SdtSDT_PROCES_PROCESSO_Selected()),"","",Integer.valueOf(-1),Integer.valueOf(chkavSdt_proces__selected.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( Gridsdt_processContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_processRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_proces__procod_Internalname,GXutil.rtrim( ((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV52GXV1)).getgxTv_SdtSDT_PROCES_PROCESSO_Procod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_proces__procod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdt_proces__procod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_processContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_processRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_proces__prodsc_Internalname,GXutil.rtrim( ((app.SdtSDT_PROCES_PROCESSO)AV45SDT_PROCES.elementAt(-1+AV52GXV1)).getgxTv_SdtSDT_PROCES_PROCESSO_Prodsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_proces__prodsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdt_proces__prodsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes24A2( ) ;
         Gridsdt_processContainer.AddRow(Gridsdt_processRow);
         nGXsfl_52_idx = ((subGridsdt_process_Islastpage==1)&&(nGXsfl_52_idx+1>subgridsdt_process_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( Gridsdt_processContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridsdt_processContainer"+"DivS\" data-gxgridid=\"52\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdt_process_Internalname, subGridsdt_process_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdt_process_Backcolorstyle == 0 )
         {
            subGridsdt_process_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdt_process_Class) > 0 )
            {
               subGridsdt_process_Linesclass = subGridsdt_process_Class+"Title" ;
            }
         }
         else
         {
            subGridsdt_process_Titlebackstyle = (byte)(1) ;
            if ( subGridsdt_process_Backcolorstyle == 1 )
            {
               subGridsdt_process_Titlebackcolor = subGridsdt_process_Allbackcolor ;
               if ( GXutil.len( subGridsdt_process_Class) > 0 )
               {
                  subGridsdt_process_Linesclass = subGridsdt_process_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdt_process_Class) > 0 )
               {
                  subGridsdt_process_Linesclass = subGridsdt_process_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavSdt_proces__selected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavSdt_proces__selected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavSdt_proces__selected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridsdt_processContainer.AddObjectProperty("GridName", "Gridsdt_process");
      }
      else
      {
         Gridsdt_processContainer.AddObjectProperty("GridName", "Gridsdt_process");
         Gridsdt_processContainer.AddObjectProperty("Header", subGridsdt_process_Header);
         Gridsdt_processContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridsdt_processContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("CmpContext", "");
         Gridsdt_processContainer.AddObjectProperty("InMasterPage", "false");
         Gridsdt_processColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_processColumn.AddObjectProperty("Title", GXutil.rtrim( chkavSdt_proces__selected.getTitle()));
         Gridsdt_processColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSdt_proces__selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         Gridsdt_processColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdt_proces__selected.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddColumnProperties(Gridsdt_processColumn);
         Gridsdt_processColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_processColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_proces__procod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddColumnProperties(Gridsdt_processColumn);
         Gridsdt_processColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_processColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_proces__prodsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddColumnProperties(Gridsdt_processColumn);
         Gridsdt_processContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_processContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdt_process_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavEmprdes_Internalname = "vEMPRDES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      chkavSdt_proces__selected.setInternalname( "SDT_PROCES__SELECTED" );
      edtavSdt_proces__procod_Internalname = "SDT_PROCES__PROCOD" ;
      edtavSdt_proces__prodsc_Internalname = "SDT_PROCES__PRODSC" ;
      Gridsdt_processpaginationbar_Internalname = "GRIDSDT_PROCESSPAGINATIONBAR" ;
      divGridsdt_processtablewithpaginationbar_Internalname = "GRIDSDT_PROCESSTABLEWITHPAGINATIONBAR" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Gridsdt_process_empowerer_Internalname = "GRIDSDT_PROCESS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridsdt_process_Internalname = "GRIDSDT_PROCESS" ;
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
      subGridsdt_process_Allowcollapsing = (byte)(0) ;
      subGridsdt_process_Allowselection = (byte)(0) ;
      subGridsdt_process_Header = "" ;
      chkavSdt_proces__selected.setTitleFormat( (short)(0) );
      chkavSdt_proces__selected.setTitle( httpContext.getMessage( "Selected", "") );
      edtavSdt_proces__prodsc_Jsonclick = "" ;
      edtavSdt_proces__prodsc_Enabled = 0 ;
      edtavSdt_proces__procod_Jsonclick = "" ;
      edtavSdt_proces__procod_Enabled = 0 ;
      chkavSdt_proces__selected.setCaption( "" );
      chkavSdt_proces__selected.setEnabled( 0 );
      subGridsdt_process_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdt_process_Backcolorstyle = (byte)(0) ;
      chkavSdt_proces__selected.setTitle( httpContext.getMessage( "Selected", "") );
      edtavSdt_proces__prodsc_Enabled = -1 ;
      edtavSdt_proces__procod_Enabled = -1 ;
      chkavSdt_proces__selected.setEnabled( -1 );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavEmprdes_Jsonclick = "" ;
      edtavEmprdes_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "Confirmar ? " ;
      Dvelop_confirmpanel_confirmar_Title = httpContext.getMessage( "Aviso", "") ;
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
      Gridsdt_processpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdt_processpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdt_processpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdt_processpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdt_processpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdt_processpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdt_processpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdt_processpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdt_processpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdt_processpaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdt_processpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdt_processpaginationbar_Pagestoshow = 5 ;
      Gridsdt_processpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdt_processpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdt_processpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdt_processpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdt_processpaginationbar_Class = "PaginationBar" ;
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
      Form.setCaption( httpContext.getMessage( "DUPLICAR PROCESOS PROD. GENERAL", "") );
      subGridsdt_process_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "SDT_PROCES__SELECTED_" + sGXsfl_52_idx ;
      chkavSdt_proces__selected.setName( GXCCtl );
      chkavSdt_proces__selected.setWebtags( "" );
      chkavSdt_proces__selected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdt_proces__selected.getInternalname(), "TitleCaption", chkavSdt_proces__selected.getCaption(), !bGXsfl_52_Refreshing);
      chkavSdt_proces__selected.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDT_PROCESS_nFirstRecordOnPage'},{av:'GRIDSDT_PROCESS_nEOF'},{av:'subGridsdt_process_Rows',ctrl:'GRIDSDT_PROCESS',prop:'Rows'},{av:'AV45SDT_PROCES',fld:'vSDT_PROCES',grid:52,pic:'',hsh:true},{av:'nGXsfl_52_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:52},{av:'nRC_GXsfl_52',ctrl:'GRIDSDT_PROCESS',prop:'GridRC',grid:52}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV46GridSDT_PROCESsCurrentPage',fld:'vGRIDSDT_PROCESSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridSDT_PROCESsPageCount',fld:'vGRIDSDT_PROCESSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDT_PROCESS.LOAD","{handler:'e1724A2',iparms:[]");
      setEventMetadata("GRIDSDT_PROCESS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDT_PROCESSPAGINATIONBAR.CHANGEPAGE","{handler:'e1224A2',iparms:[{av:'GRIDSDT_PROCESS_nFirstRecordOnPage'},{av:'GRIDSDT_PROCESS_nEOF'},{av:'subGridsdt_process_Rows',ctrl:'GRIDSDT_PROCESS',prop:'Rows'},{av:'AV45SDT_PROCES',fld:'vSDT_PROCES',grid:52,pic:'',hsh:true},{av:'nGXsfl_52_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:52},{av:'nRC_GXsfl_52',ctrl:'GRIDSDT_PROCESS',prop:'GridRC',grid:52},{av:'Gridsdt_processpaginationbar_Selectedpage',ctrl:'GRIDSDT_PROCESSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDT_PROCESSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDT_PROCESSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1324A2',iparms:[{av:'GRIDSDT_PROCESS_nFirstRecordOnPage'},{av:'GRIDSDT_PROCESS_nEOF'},{av:'subGridsdt_process_Rows',ctrl:'GRIDSDT_PROCESS',prop:'Rows'},{av:'AV45SDT_PROCES',fld:'vSDT_PROCES',grid:52,pic:'',hsh:true},{av:'nGXsfl_52_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:52},{av:'nRC_GXsfl_52',ctrl:'GRIDSDT_PROCESS',prop:'GridRC',grid:52},{av:'Gridsdt_processpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDT_PROCESSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDT_PROCESSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdt_process_Rows',ctrl:'GRIDSDT_PROCESS',prop:'Rows'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1124A1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1424A2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV45SDT_PROCES',fld:'vSDT_PROCES',grid:52,pic:'',hsh:true},{av:'nGXsfl_52_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:52},{av:'GRIDSDT_PROCESS_nFirstRecordOnPage'},{av:'nRC_GXsfl_52',ctrl:'GRIDSDT_PROCESS',prop:'GridRC',grid:52},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34ProCod',fld:'vPROCOD',pic:''},{av:'AV7EmprDes',fld:'vEMPRDES',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV7EmprDes',fld:'vEMPRDES',pic:'@!'},{av:'AV34ProCod',fld:'vPROCOD',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv4',iparms:[]");
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
      wcpOAV6EmprCod = "" ;
      wcpOAV7EmprDes = "" ;
      wcpOAV9EmprNom2 = "" ;
      Gridsdt_processpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6EmprCod = "" ;
      AV7EmprDes = "" ;
      AV9EmprNom2 = "" ;
      AV45SDT_PROCES = new GXBaseCollection<app.SdtSDT_PROCES_PROCESSO>(app.SdtSDT_PROCES_PROCESSO.class, "PROCESSO", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV34ProCod = "" ;
      Gridsdt_process_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      Gridsdt_processContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdt_processpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV56Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGridsdt_process_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV38Station = "" ;
      GXt_char1 = "" ;
      AV8EmprNom = "" ;
      AV39UsurCod = "" ;
      GXt_objcol_SdtSDT_PROCES_PROCESSO5 = new GXBaseCollection<app.SdtSDT_PROCES_PROCESSO>(app.SdtSDT_PROCES_PROCESSO.class, "PROCESSO", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDT_PROCES_PROCESSO6 = new GXBaseCollection[1] ;
      Gridsdt_processRow = new com.genexus.webpanels.GXWebRow();
      AV49SDT_PROCES_PROCESSO = new app.SdtSDT_PROCES_PROCESSO(remoteHandle, context);
      AV35ProCodDes = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridsdt_process_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      Gridsdt_processColumn = new com.genexus.webpanels.GXWebColumn();
      AV56Pgmname = "WWCLOPROG" ;
      /* GeneXus formulas. */
      AV56Pgmname = "WWCLOPROG" ;
      Gx_err = (short)(0) ;
      edtavEmprdes_Enabled = 0 ;
      chkavSdt_proces__selected.setEnabled( 0 );
      edtavSdt_proces__procod_Enabled = 0 ;
      edtavSdt_proces__prodsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDSDT_PROCESS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridsdt_process_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridsdt_process_Backstyle ;
   private byte subGridsdt_process_Titlebackstyle ;
   private byte subGridsdt_process_Allowselection ;
   private byte subGridsdt_process_Allowhovering ;
   private byte subGridsdt_process_Allowcollapsing ;
   private byte subGridsdt_process_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV48TotalProcesso ;
   private int Gridsdt_processpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_52 ;
   private int subGridsdt_process_Rows ;
   private int nGXsfl_52_idx=1 ;
   private int Gridsdt_processpaginationbar_Pagestoshow ;
   private int edtavEmprdes_Enabled ;
   private int AV52GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridsdt_process_Islastpage ;
   private int edtavSdt_proces__procod_Enabled ;
   private int edtavSdt_proces__prodsc_Enabled ;
   private int GRIDSDT_PROCESS_nGridOutOfScope ;
   private int nGXsfl_52_fel_idx=1 ;
   private int AV42PageToGo ;
   private int AV57GXV5 ;
   private int idxLst ;
   private int subGridsdt_process_Backcolor ;
   private int subGridsdt_process_Allbackcolor ;
   private int subGridsdt_process_Titlebackcolor ;
   private int subGridsdt_process_Selectedindex ;
   private int subGridsdt_process_Selectioncolor ;
   private int subGridsdt_process_Hoveringcolor ;
   private long GRIDSDT_PROCESS_nFirstRecordOnPage ;
   private long AV46GridSDT_PROCESsCurrentPage ;
   private long AV47GridSDT_PROCESsPageCount ;
   private long GRIDSDT_PROCESS_nCurrentRecord ;
   private long GRIDSDT_PROCESS_nRecordCount ;
   private String wcpOAV6EmprCod ;
   private String wcpOAV7EmprDes ;
   private String wcpOAV9EmprNom2 ;
   private String Gridsdt_processpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV6EmprCod ;
   private String AV7EmprDes ;
   private String AV9EmprNom2 ;
   private String sGXsfl_52_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV34ProCod ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Gridsdt_processpaginationbar_Class ;
   private String Gridsdt_processpaginationbar_Pagingbuttonsposition ;
   private String Gridsdt_processpaginationbar_Pagingcaptionposition ;
   private String Gridsdt_processpaginationbar_Emptygridclass ;
   private String Gridsdt_processpaginationbar_Rowsperpageoptions ;
   private String Gridsdt_processpaginationbar_Previous ;
   private String Gridsdt_processpaginationbar_Next ;
   private String Gridsdt_processpaginationbar_Caption ;
   private String Gridsdt_processpaginationbar_Emptygridcaption ;
   private String Gridsdt_processpaginationbar_Rowsperpagecaption ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Gridsdt_process_empowerer_Gridinternalname ;
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
   private String edtavEmprdes_Internalname ;
   private String edtavEmprdes_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divGridsdt_processtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdt_process_Internalname ;
   private String Gridsdt_processpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV56Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsdt_process_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdt_proces__procod_Internalname ;
   private String edtavSdt_proces__prodsc_Internalname ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String AV38Station ;
   private String GXt_char1 ;
   private String AV8EmprNom ;
   private String AV39UsurCod ;
   private String AV35ProCodDes ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String subGridsdt_process_Class ;
   private String subGridsdt_process_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSdt_proces__procod_Jsonclick ;
   private String edtavSdt_proces__prodsc_Jsonclick ;
   private String subGridsdt_process_Header ;
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
   private boolean Gridsdt_processpaginationbar_Showfirst ;
   private boolean Gridsdt_processpaginationbar_Showprevious ;
   private boolean Gridsdt_processpaginationbar_Shownext ;
   private boolean Gridsdt_processpaginationbar_Showlast ;
   private boolean Gridsdt_processpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV52 ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid Gridsdt_processContainer ;
   private com.genexus.webpanels.GXWebRow Gridsdt_processRow ;
   private com.genexus.webpanels.GXWebColumn Gridsdt_processColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGridsdt_processpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridsdt_process_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private ICheckbox chkavSdt_proces__selected ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSDT_PROCES_PROCESSO> AV45SDT_PROCES ;
   private GXBaseCollection<app.SdtSDT_PROCES_PROCESSO> GXt_objcol_SdtSDT_PROCES_PROCESSO5 ;
   private GXBaseCollection<app.SdtSDT_PROCES_PROCESSO> GXv_objcol_SdtSDT_PROCES_PROCESSO6[] ;
   private app.SdtSDT_PROCES_PROCESSO AV49SDT_PROCES_PROCESSO ;
}

