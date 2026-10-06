package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwimprimirrcnc_impl extends GXDataArea
{
   public wwimprimirrcnc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwimprimirrcnc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwimprimirrcnc_impl.class ));
   }

   public wwimprimirrcnc_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHisestreo = new HTMLChoice();
      chkavGrid1selected = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            gxnrgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            gxgrgrid1_refresh_invoke( ) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_102 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_102"))) ;
      nGXsfl_102_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_102_idx"))) ;
      sGXsfl_102_idx = httpContext.GetPar( "sGXsfl_102_idx") ;
      chkavGrid1selected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
      chkavGrid1selected.setTitle( httpContext.GetNextPar( ) );
      httpContext.ajax_rsp_assign_prop("", false, chkavGrid1selected.getInternalname(), "Title", chkavGrid1selected.getTitle(), !bGXsfl_102_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      AV14Numero_Hasta = (short)(GXutil.lval( httpContext.GetPar( "Numero_Hasta"))) ;
      AV7Fecha_Desde = localUtil.parseDateParm( httpContext.GetPar( "Fecha_Desde")) ;
      AV8Fecha_Hasta = localUtil.parseDateParm( httpContext.GetPar( "Fecha_Hasta")) ;
      cmbavHisestreo.fromJSonString( httpContext.GetNextPar( ));
      AV11HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      chkavGrid1selected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
      chkavGrid1selected.setTitle( httpContext.GetNextPar( ) );
      httpContext.ajax_rsp_assign_prop("", false, chkavGrid1selected.getInternalname(), "Title", chkavGrid1selected.getTitle(), !bGXsfl_102_Refreshing);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24Grid1SelectedRows);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV14Numero_Hasta, AV7Fecha_Desde, AV8Fecha_Hasta, AV11HisEstReo, AV24Grid1SelectedRows) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
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
      pa2572( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2572( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.calidad.wwimprimirrcnc", new String[] {}, new String[] {}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID1SELECTEDROWS", getSecureSignedToken( "", AV24Grid1SelectedRows));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vNUMERO_HASTA", GXutil.ltrim( localUtil.ntoc( AV14Numero_Hasta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFECHA_DESDE", localUtil.format(AV7Fecha_Desde, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFECHA_HASTA", localUtil.format(AV8Fecha_Hasta, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV11HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_102", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_102, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV10Grid1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRID1SELECTEDROWS", AV24Grid1SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRID1SELECTEDROWS", AV24Grid1SelectedRows);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID1SELECTEDROWS", getSecureSignedToken( "", AV24Grid1SelectedRows));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Width", GXutil.rtrim( Dvpanel_panel_filtrosmas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Cls", GXutil.rtrim( Dvpanel_panel_filtrosmas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Title", GXutil.rtrim( Dvpanel_panel_filtrosmas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosmas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosmas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosmas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosmas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Class", GXutil.rtrim( Grid1paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showfirst", GXutil.booltostr( Grid1paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showprevious", GXutil.booltostr( Grid1paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Shownext", GXutil.booltostr( Grid1paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showlast", GXutil.booltostr( Grid1paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Grid1paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Grid1paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Grid1paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Grid1paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Grid1paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Previous", GXutil.rtrim( Grid1paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Next", GXutil.rtrim( Grid1paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Caption", GXutil.rtrim( Grid1paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Grid1paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Grid1paginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1SELECTED_Titleformat", GXutil.ltrim( localUtil.ntoc( chkavGrid1selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1SELECTED_Title", GXutil.rtrim( chkavGrid1selected.getTitle()));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         we2572( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2572( ) ;
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
      return formatLink("app.calidad.wwimprimirrcnc", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Calidad.wwImprimirRCNC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Imprimir RC e NC", "") ;
   }

   public void wb2570( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNumero_desde_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNumero_desde_Internalname, httpContext.getMessage( "Número Ficha  Desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNumero_desde_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Numero_Desde, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNumero_desde_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13Numero_Desde), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13Numero_Desde), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNumero_desde_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNumero_desde_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNumero_hasta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNumero_hasta_Internalname, httpContext.getMessage( "Número Ficha  Hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNumero_hasta_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Numero_Hasta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNumero_hasta_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14Numero_Hasta), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14Numero_Hasta), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNumero_hasta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNumero_hasta_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFecha_desde_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFecha_desde_Internalname, httpContext.getMessage( "Desde Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_desde_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_desde_Internalname, localUtil.format(AV7Fecha_Desde, "99/99/99"), localUtil.format( AV7Fecha_Desde, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_desde_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_desde_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_desde_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_desde_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFecha_hasta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFecha_hasta_Internalname, httpContext.getMessage( "Hasta Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_hasta_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_hasta_Internalname, localUtil.format(AV8Fecha_Hasta, "99/99/99"), localUtil.format( AV8Fecha_Hasta, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_hasta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_hasta_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_hasta_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_hasta_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHisestreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHisestreo.getInternalname(), httpContext.getMessage( "Estado Reoperado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisestreo, cmbavHisestreo.getInternalname(), GXutil.trim( GXutil.str( AV11HisEstReo, 1, 0)), 1, cmbavHisestreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavHisestreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "", true, (byte)(0), "HLP_Calidad\\wwImprimirRCNC.htm");
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV11HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
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
         /* User Defined Control */
         ucDvpanel_panel_filtrosmas.setProperty("Width", Dvpanel_panel_filtrosmas_Width);
         ucDvpanel_panel_filtrosmas.setProperty("AutoWidth", Dvpanel_panel_filtrosmas_Autowidth);
         ucDvpanel_panel_filtrosmas.setProperty("AutoHeight", Dvpanel_panel_filtrosmas_Autoheight);
         ucDvpanel_panel_filtrosmas.setProperty("Cls", Dvpanel_panel_filtrosmas_Cls);
         ucDvpanel_panel_filtrosmas.setProperty("Title", Dvpanel_panel_filtrosmas_Title);
         ucDvpanel_panel_filtrosmas.setProperty("Collapsible", Dvpanel_panel_filtrosmas_Collapsible);
         ucDvpanel_panel_filtrosmas.setProperty("Collapsed", Dvpanel_panel_filtrosmas_Collapsed);
         ucDvpanel_panel_filtrosmas.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosmas_Showcollapseicon);
         ucDvpanel_panel_filtrosmas.setProperty("IconPosition", Dvpanel_panel_filtrosmas_Iconposition);
         ucDvpanel_panel_filtrosmas.setProperty("AutoScroll", Dvpanel_panel_filtrosmas_Autoscroll);
         ucDvpanel_panel_filtrosmas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosmas_Internalname, "DVPANEL_PANEL_FILTROSMASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSMASContainer"+"Panel_FiltrosMas"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosmas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_masopciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTexto_desde_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTexto_desde_Internalname, httpContext.getMessage( "Desde Texto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTexto_desde_Internalname, AV16Texto_Desde, GXutil.rtrim( localUtil.format( AV16Texto_Desde, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTexto_desde_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTexto_desde_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTexto_hasta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTexto_hasta_Internalname, httpContext.getMessage( "Hasta Texto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTexto_hasta_Internalname, AV17Texto_Hasta, GXutil.rtrim( localUtil.format( AV17Texto_Hasta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTexto_hasta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTexto_hasta_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabletexto_Internalname, 1, 0, "px", 0, "px", "WizardStepsCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_comentarios_Internalname, httpContext.getMessage( "Colocar aqui otros filtros si se requiere", ""), "", "", lblTextblock_comentarios_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 102, 3, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 7, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112571_client"+"'", TempTags, "", 2, "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 102, 3, 0)+","+"null"+");", httpContext.getMessage( "PDF", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e122571_client"+"'", TempTags, "", 2, "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 102, 3, 0)+","+"null"+");", httpContext.getMessage( "CSV", ""), bttBtncsv_Jsonclick, 7, httpContext.getMessage( "CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e132571_client"+"'", TempTags, "", 2, "HLP_Calidad\\wwImprimirRCNC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 102, 3, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calidad\\wwImprimirRCNC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divGrid1tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol102( ) ;
      }
      if ( wbEnd == 102 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_102 = (int)(nGXsfl_102_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGrid1paginationbar.setProperty("Class", Grid1paginationbar_Class);
         ucGrid1paginationbar.setProperty("ShowFirst", Grid1paginationbar_Showfirst);
         ucGrid1paginationbar.setProperty("ShowPrevious", Grid1paginationbar_Showprevious);
         ucGrid1paginationbar.setProperty("ShowNext", Grid1paginationbar_Shownext);
         ucGrid1paginationbar.setProperty("ShowLast", Grid1paginationbar_Showlast);
         ucGrid1paginationbar.setProperty("PagesToShow", Grid1paginationbar_Pagestoshow);
         ucGrid1paginationbar.setProperty("PagingButtonsPosition", Grid1paginationbar_Pagingbuttonsposition);
         ucGrid1paginationbar.setProperty("PagingCaptionPosition", Grid1paginationbar_Pagingcaptionposition);
         ucGrid1paginationbar.setProperty("EmptyGridClass", Grid1paginationbar_Emptygridclass);
         ucGrid1paginationbar.setProperty("RowsPerPageSelector", Grid1paginationbar_Rowsperpageselector);
         ucGrid1paginationbar.setProperty("RowsPerPageOptions", Grid1paginationbar_Rowsperpageoptions);
         ucGrid1paginationbar.setProperty("Previous", Grid1paginationbar_Previous);
         ucGrid1paginationbar.setProperty("Next", Grid1paginationbar_Next);
         ucGrid1paginationbar.setProperty("Caption", Grid1paginationbar_Caption);
         ucGrid1paginationbar.setProperty("EmptyGridCaption", Grid1paginationbar_Emptygridcaption);
         ucGrid1paginationbar.setProperty("RowsPerPageCaption", Grid1paginationbar_Rowsperpagecaption);
         ucGrid1paginationbar.setProperty("CurrentPage", AV9Grid1CurrentPage);
         ucGrid1paginationbar.setProperty("PageCount", AV10Grid1PageCount);
         ucGrid1paginationbar.render(context, "dvelop.dvpaginationbar", Grid1paginationbar_Internalname, "GRID1PAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calidad\\wwImprimirRCNC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV9Grid1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPt_Internalname, GXutil.ltrim( localUtil.ntoc( AV25PT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25PT), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPt_Jsonclick, 0, "Attribute", "", "", "", "", edtavPt_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTintex_Internalname, GXutil.ltrim( localUtil.ntoc( AV26Tintex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26Tintex), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTintex_Jsonclick, 0, "Attribute", "", "", "", "", edtavTintex_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calidad\\wwImprimirRCNC.htm");
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 102 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2572( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Imprimir RC e NC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2570( ) ;
   }

   public void ws2572( )
   {
      start2572( ) ;
      evt2572( ) ;
   }

   public void evt2572( )
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
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e162572 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_102_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1022( ) ;
                           AV22Grid1Selected = GXutil.strtobool( httpContext.cgiGet( chkavGrid1selected.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavGrid1selected.getInternalname(), AV22Grid1Selected);
                           A2297HisReoTn = (int)(localUtil.ctol( httpContext.cgiGet( edtHisReoTn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2297HisReoTn = false ;
                           A569HisReoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisReoFec_Internalname), 0)) ;
                           n569HisReoFec = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A539HisBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A545HisCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A544HisCodPar = httpContext.cgiGet( edtHisCodPar_Internalname) ;
                           A542HisBarSer = httpContext.cgiGet( edtHisBarSer_Internalname) ;
                           n542HisBarSer = false ;
                           AV6Est_r = httpContext.cgiGet( edtavEst_r_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavEst_r_Internalname, AV6Est_r);
                           A546HisColNom = httpContext.cgiGet( edtHisColNom_Internalname) ;
                           n546HisColNom = false ;
                           A547HisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtHisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n547HisColNum = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e172572 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e182572 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192572 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Numero_hasta Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vNUMERO_HASTA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV14Numero_Hasta )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Fecha_desde Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vFECHA_DESDE"), 0), AV7Fecha_Desde) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Fecha_hasta Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vFECHA_HASTA"), 0), AV8Fecha_Hasta) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Hisestreo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vHISESTREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV11HisEstReo )
                                    {
                                       Rfr0gs = true ;
                                    }
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

   public void we2572( )
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

   public void pa2572( )
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
            GX_FocusControl = edtavNumero_desde_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1022( ) ;
      while ( nGXsfl_102_idx <= nRC_GXsfl_102 )
      {
         sendrow_1022( ) ;
         nGXsfl_102_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_102_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_102_idx+1) ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1022( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  short AV14Numero_Hasta ,
                                  java.util.Date AV7Fecha_Desde ,
                                  java.util.Date AV8Fecha_Hasta ,
                                  byte AV11HisEstReo ,
                                  GXBaseCollection<app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem> AV24Grid1SelectedRows )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182572 ();
      GRID1_nCurrentRecord = 0 ;
      rf2572( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
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
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV11HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV11HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.str( AV11HisEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV11HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2572( ) ;
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
      AV29Pgmname = "Calidad.wwImprimirRCNC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavEst_r_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEst_r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEst_r_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2572( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(102) ;
      /* Execute user event: Refresh */
      e182572 ();
      nGXsfl_102_idx = 1 ;
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1022( ) ;
      bGXsfl_102_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1022( ) ;
         GXPagingFrom2 = (int)(((subGrid1_Rows==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid1_Rows==0) ? 10000 : subgrid1_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV11HisEstReo) ,
                                              Byte.valueOf(A548HisEstReo) ,
                                              A569HisReoFec ,
                                              AV7Fecha_Desde ,
                                              AV8Fecha_Hasta ,
                                              Integer.valueOf(A2297HisReoTn) ,
                                              Short.valueOf(AV14Numero_Hasta) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                              }
         });
         /* Using cursor H02572 */
         pr_default.execute(0, new Object[] {AV7Fecha_Desde, AV8Fecha_Hasta, Short.valueOf(AV14Numero_Hasta), Short.valueOf(AV14Numero_Hasta), Byte.valueOf(AV11HisEstReo), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_102_idx = 1 ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1022( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid1_Rows == 0 ) || ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) ) )
         {
            A548HisEstReo = H02572_A548HisEstReo[0] ;
            n548HisEstReo = H02572_n548HisEstReo[0] ;
            A547HisColNum = H02572_A547HisColNum[0] ;
            n547HisColNum = H02572_n547HisColNum[0] ;
            A546HisColNom = H02572_A546HisColNom[0] ;
            n546HisColNom = H02572_n546HisColNom[0] ;
            A542HisBarSer = H02572_A542HisBarSer[0] ;
            n542HisBarSer = H02572_n542HisBarSer[0] ;
            A544HisCodPar = H02572_A544HisCodPar[0] ;
            A545HisCodReo = H02572_A545HisCodReo[0] ;
            A539HisBarCod = H02572_A539HisBarCod[0] ;
            A252CliCod = H02572_A252CliCod[0] ;
            n252CliCod = H02572_n252CliCod[0] ;
            A569HisReoFec = H02572_A569HisReoFec[0] ;
            n569HisReoFec = H02572_n569HisReoFec[0] ;
            A2297HisReoTn = H02572_A2297HisReoTn[0] ;
            n2297HisReoTn = H02572_n2297HisReoTn[0] ;
            e192572 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(102) ;
         wb2570( ) ;
      }
      bGXsfl_102_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2572( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRID1SELECTEDROWS", AV24Grid1SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRID1SELECTEDROWS", AV24Grid1SelectedRows);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID1SELECTEDROWS", getSecureSignedToken( "", AV24Grid1SelectedRows));
   }

   public int subgrid1_fnc_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV11HisEstReo) ,
                                           Byte.valueOf(A548HisEstReo) ,
                                           A569HisReoFec ,
                                           AV7Fecha_Desde ,
                                           AV8Fecha_Hasta ,
                                           Integer.valueOf(A2297HisReoTn) ,
                                           Short.valueOf(AV14Numero_Hasta) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                           }
      });
      /* Using cursor H02573 */
      pr_default.execute(1, new Object[] {AV7Fecha_Desde, AV8Fecha_Hasta, Short.valueOf(AV14Numero_Hasta), Short.valueOf(AV14Numero_Hasta), Byte.valueOf(AV11HisEstReo)});
      GRID1_nRecordCount = H02573_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV14Numero_Hasta, AV7Fecha_Desde, AV8Fecha_Hasta, AV11HisEstReo, AV24Grid1SelectedRows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_fnc_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV14Numero_Hasta, AV7Fecha_Desde, AV8Fecha_Hasta, AV11HisEstReo, AV24Grid1SelectedRows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV14Numero_Hasta, AV7Fecha_Desde, AV8Fecha_Hasta, AV11HisEstReo, AV24Grid1SelectedRows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV14Numero_Hasta, AV7Fecha_Desde, AV8Fecha_Hasta, AV11HisEstReo, AV24Grid1SelectedRows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV14Numero_Hasta, AV7Fecha_Desde, AV8Fecha_Hasta, AV11HisEstReo, AV24Grid1SelectedRows) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV29Pgmname = "Calidad.wwImprimirRCNC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavEst_r_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEst_r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEst_r_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2570( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172572 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_102 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_102"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10Grid1PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvpanel_panel_filtrosmas_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Width") ;
         Dvpanel_panel_filtrosmas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autowidth")) ;
         Dvpanel_panel_filtrosmas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autoheight")) ;
         Dvpanel_panel_filtrosmas_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Cls") ;
         Dvpanel_panel_filtrosmas_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Title") ;
         Dvpanel_panel_filtrosmas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Collapsible")) ;
         Dvpanel_panel_filtrosmas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Collapsed")) ;
         Dvpanel_panel_filtrosmas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Showcollapseicon")) ;
         Dvpanel_panel_filtrosmas_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Iconposition") ;
         Dvpanel_panel_filtrosmas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autoscroll")) ;
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
         Grid1paginationbar_Class = httpContext.cgiGet( "GRID1PAGINATIONBAR_Class") ;
         Grid1paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showfirst")) ;
         Grid1paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showprevious")) ;
         Grid1paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Shownext")) ;
         Grid1paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showlast")) ;
         Grid1paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingbuttonsposition") ;
         Grid1paginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingcaptionposition") ;
         Grid1paginationbar_Emptygridclass = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridclass") ;
         Grid1paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselector")) ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageoptions") ;
         Grid1paginationbar_Previous = httpContext.cgiGet( "GRID1PAGINATIONBAR_Previous") ;
         Grid1paginationbar_Next = httpContext.cgiGet( "GRID1PAGINATIONBAR_Next") ;
         Grid1paginationbar_Caption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Caption") ;
         Grid1paginationbar_Emptygridcaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridcaption") ;
         Grid1paginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpagecaption") ;
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
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         Grid1paginationbar_Selectedpage = httpContext.cgiGet( "GRID1PAGINATIONBAR_Selectedpage") ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumero_desde_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumero_desde_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERO_DESDE");
            GX_FocusControl = edtavNumero_desde_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Numero_Desde = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Numero_Desde", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Numero_Desde), 4, 0));
         }
         else
         {
            AV13Numero_Desde = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumero_desde_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Numero_Desde", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Numero_Desde), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumero_hasta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumero_hasta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERO_HASTA");
            GX_FocusControl = edtavNumero_hasta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Numero_Hasta = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Numero_Hasta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Numero_Hasta), 4, 0));
         }
         else
         {
            AV14Numero_Hasta = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumero_hasta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Numero_Hasta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Numero_Hasta), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_desde_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA_DESDE");
            GX_FocusControl = edtavFecha_desde_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Fecha_Desde = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Fecha_Desde", localUtil.format(AV7Fecha_Desde, "99/99/99"));
         }
         else
         {
            AV7Fecha_Desde = localUtil.ctod( httpContext.cgiGet( edtavFecha_desde_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Fecha_Desde", localUtil.format(AV7Fecha_Desde, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_hasta_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA_HASTA");
            GX_FocusControl = edtavFecha_hasta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Fecha_Hasta = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Fecha_Hasta", localUtil.format(AV8Fecha_Hasta, "99/99/99"));
         }
         else
         {
            AV8Fecha_Hasta = localUtil.ctod( httpContext.cgiGet( edtavFecha_hasta_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Fecha_Hasta", localUtil.format(AV8Fecha_Hasta, "99/99/99"));
         }
         cmbavHisestreo.setName( cmbavHisestreo.getInternalname() );
         cmbavHisestreo.setValue( httpContext.cgiGet( cmbavHisestreo.getInternalname()) );
         AV11HisEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavHisestreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.str( AV11HisEstReo, 1, 0));
         AV16Texto_Desde = httpContext.cgiGet( edtavTexto_desde_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Texto_Desde", AV16Texto_Desde);
         AV17Texto_Hasta = httpContext.cgiGet( edtavTexto_hasta_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Texto_Hasta", AV17Texto_Hasta);
         AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID1CURRENTPAGE");
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9Grid1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), 10, 0));
         }
         else
         {
            AV9Grid1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPT");
            GX_FocusControl = edtavPt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25PT = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25PT", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PT), 4, 0));
         }
         else
         {
            AV25PT = (short)(localUtil.ctol( httpContext.cgiGet( edtavPt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25PT", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PT), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTintex_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTintex_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTINTEX");
            GX_FocusControl = edtavTintex_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26Tintex = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Tintex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tintex), 4, 0));
         }
         else
         {
            AV26Tintex = (short)(localUtil.ctol( httpContext.cgiGet( edtavTintex_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Tintex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tintex), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vNUMERO_HASTA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV14Numero_Hasta )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vFECHA_DESDE"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV7Fecha_Desde)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vFECHA_HASTA"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV8Fecha_Hasta)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vHISESTREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV11HisEstReo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e172572 ();
      if (returnInSub) return;
   }

   public void e172572( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwimprimirrcnc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwimprimirrcnc_impl.this.AV5EmprCod = GXv_char2[0] ;
      wwimprimirrcnc_impl.this.AV20EmprNom = GXv_char3[0] ;
      wwimprimirrcnc_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      edtavPt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPt_Visible), 5, 0), true);
      edtavTintex_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTintex_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTintex_Visible), 5, 0), true);
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV9Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), 10, 0));
      edtavGrid1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid1currentpage_Visible), 5, 0), true);
      AV10Grid1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Grid1PageCount), 10, 0));
      chkavGrid1selected.setTitleFormat( (short)(1) );
      chkavGrid1selected.setTitle( GXutil.format( "<input name=\"selectAllCheckboxGrid1\" type=\"checkbox\" value=\"Select All\" onClick=\"WWPSelectAll(this, %1);\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" class=\"AttributeCheckBox\" >", "'GRID1SELECTED'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavGrid1selected.getInternalname(), "Title", chkavGrid1selected.getTitle(), !bGXsfl_102_Refreshing);
      Grid1paginationbar_Rowsperpageselectedvalue = subGrid1_Rows ;
      ucGrid1paginationbar.sendProperty(context, "", false, Grid1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid1paginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int5 = (byte)(AV25PT) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, "100001", GXv_int6) ;
      wwimprimirrcnc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25PT = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25PT", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PT), 4, 0));
      GXt_int5 = (byte)(AV26Tintex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int6) ;
      wwimprimirrcnc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV26Tintex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Tintex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Tintex), 4, 0));
      AV7Fecha_Desde = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Fecha_Desde", localUtil.format(AV7Fecha_Desde, "99/99/99"));
      AV18UNumFic = (short)(999999) ;
      AV11HisEstReo = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.str( AV11HisEstReo, 1, 0));
      /* Execute user subroutine: 'LOADGRID1SELECTEDROWS' */
      S112 ();
      if (returnInSub) return;
   }

   public void e182572( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e192572( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV22Grid1Selected = false ;
      httpContext.ajax_rsp_assign_attri("", false, chkavGrid1selected.getInternalname(), AV22Grid1Selected);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(102) ;
      }
      sendrow_1022( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_102_Refreshing )
      {
         httpContext.doAjaxLoad(102, Grid1Row);
      }
      /*  Sending Event outputs  */
   }

   public void e142572( )
   {
      /* Grid1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV9Grid1CurrentPage = (long)(AV9Grid1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), 10, 0));
         subgrid1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV9Grid1CurrentPage = (long)(AV9Grid1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), 10, 0));
         subgrid1_nextpage( ) ;
      }
      else
      {
         AV15PageToGo = (int)(GXutil.lval( Grid1paginationbar_Selectedpage)) ;
         AV9Grid1CurrentPage = AV15PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), 10, 0));
         subgrid1_gotopage( AV15PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e152572( )
   {
      /* Grid1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid1_Rows = Grid1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV9Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Grid1CurrentPage), 10, 0));
      subgrid1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e162572( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      AV31GXV1 = 1 ;
      while ( AV31GXV1 <= AV24Grid1SelectedRows.size() )
      {
         AV23Grid1SelectedRow = (app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem)((app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem)AV24Grid1SelectedRows.elementAt(-1+AV31GXV1));
         if ( AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo() == 1 )
         {
            if ( AV25PT == 1 )
            {
               GXv_char4[0] = AV5EmprCod ;
               GXv_int7[0] = A2297HisReoTn ;
               GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
               new app.rnci000(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
               wwimprimirrcnc_impl.this.AV5EmprCod = GXv_char4[0] ;
               wwimprimirrcnc_impl.this.A2297HisReoTn = GXv_int7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            }
            else
            {
               GXv_char4[0] = AV5EmprCod ;
               GXv_int7[0] = A2297HisReoTn ;
               GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
               new app.rncic00(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
               wwimprimirrcnc_impl.this.AV5EmprCod = GXv_char4[0] ;
               wwimprimirrcnc_impl.this.A2297HisReoTn = GXv_int7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            }
         }
         if ( AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo() == 2 )
         {
            if ( AV25PT == 1 )
            {
               if ( AV26Tintex == 0 )
               {
                  GXv_char4[0] = AV5EmprCod ;
                  GXv_int7[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod() ;
                  GXv_int6[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo() ;
                  GXv_char3[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar() ;
                  GXv_int8[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn() ;
                  GXv_char2[0] = httpContext.getMessage( "SCR", "") ;
                  new app.rnce000(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8, GXv_char2) ;
                  wwimprimirrcnc_impl.this.AV5EmprCod = GXv_char4[0] ;
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod( GXv_int7[0] );
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo( GXv_int6[0] );
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar( GXv_char3[0] );
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn( GXv_int8[0] );
                  httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
               }
               else
               {
                  GXv_char4[0] = AV5EmprCod ;
                  GXv_int8[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod() ;
                  GXv_int6[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo() ;
                  GXv_char3[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar() ;
                  GXv_int7[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn() ;
                  GXv_char2[0] = httpContext.getMessage( "SCR", "") ;
                  new app.rnce100(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_int7, GXv_char2) ;
                  wwimprimirrcnc_impl.this.AV5EmprCod = GXv_char4[0] ;
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod( GXv_int8[0] );
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo( GXv_int6[0] );
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar( GXv_char3[0] );
                  AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn( GXv_int7[0] );
                  httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
               }
            }
            else
            {
               GXv_char4[0] = AV5EmprCod ;
               GXv_int8[0] = AV23Grid1SelectedRow.getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn() ;
               GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
               new app.rncec00(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
               wwimprimirrcnc_impl.this.AV5EmprCod = GXv_char4[0] ;
               AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn( GXv_int8[0] );
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            }
         }
         AV31GXV1 = (int)(AV31GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADGRID1SELECTEDROWS' Routine */
      returnInSub = false ;
      AV24Grid1SelectedRows = new GXBaseCollection<app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem>(app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem.class, "wwImprimirRCNCGrid1SDTItem", "TexplusNET", remoteHandle) ;
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_102 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_102"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_102_fel_idx = 0 ;
      while ( nGXsfl_102_fel_idx < nRC_GXsfl_102 )
      {
         nGXsfl_102_fel_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_102_fel_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_102_fel_idx+1) ;
         sGXsfl_102_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1022( ) ;
         AV22Grid1Selected = GXutil.strtobool( httpContext.cgiGet( chkavGrid1selected.getInternalname())) ;
         A2297HisReoTn = (int)(localUtil.ctol( httpContext.cgiGet( edtHisReoTn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2297HisReoTn = false ;
         A569HisReoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisReoFec_Internalname), 0)) ;
         n569HisReoFec = false ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         A539HisBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A545HisCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A544HisCodPar = httpContext.cgiGet( edtHisCodPar_Internalname) ;
         A542HisBarSer = httpContext.cgiGet( edtHisBarSer_Internalname) ;
         n542HisBarSer = false ;
         AV6Est_r = httpContext.cgiGet( edtavEst_r_Internalname) ;
         A546HisColNom = httpContext.cgiGet( edtHisColNom_Internalname) ;
         n546HisColNom = false ;
         A547HisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtHisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n547HisColNum = false ;
         if ( AV22Grid1Selected )
         {
            AV23Grid1SelectedRow = (app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem)new app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem(remoteHandle, context);
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn( A2297HisReoTn );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec( A569HisReoFec );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod( A252CliCod );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod( A539HisBarCod );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo( A545HisCodReo );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar( A544HisCodPar );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser( A542HisBarSer );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r( AV6Est_r );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom( A546HisColNom );
            AV23Grid1SelectedRow.setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum( A547HisColNum );
            AV24Grid1SelectedRows.add(AV23Grid1SelectedRow, 0);
         }
         /* End For Each Line */
      }
      if ( nGXsfl_102_fel_idx == 0 )
      {
         nGXsfl_102_idx = 1 ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1022( ) ;
      }
      nGXsfl_102_fel_idx = 1 ;
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
      pa2572( ) ;
      ws2572( ) ;
      we2572( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101645529", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("calidad/wwimprimirrcnc.js", "?20266101645530", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1022( )
   {
      chkavGrid1selected.setInternalname( "vGRID1SELECTED_"+sGXsfl_102_idx );
      edtHisReoTn_Internalname = "HISREOTN_"+sGXsfl_102_idx ;
      edtHisReoFec_Internalname = "HISREOFEC_"+sGXsfl_102_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_102_idx ;
      edtHisBarCod_Internalname = "HISBARCOD_"+sGXsfl_102_idx ;
      edtHisCodReo_Internalname = "HISCODREO_"+sGXsfl_102_idx ;
      edtHisCodPar_Internalname = "HISCODPAR_"+sGXsfl_102_idx ;
      edtHisBarSer_Internalname = "HISBARSER_"+sGXsfl_102_idx ;
      edtavEst_r_Internalname = "vEST_R_"+sGXsfl_102_idx ;
      edtHisColNom_Internalname = "HISCOLNOM_"+sGXsfl_102_idx ;
      edtHisColNum_Internalname = "HISCOLNUM_"+sGXsfl_102_idx ;
   }

   public void subsflControlProps_fel_1022( )
   {
      chkavGrid1selected.setInternalname( "vGRID1SELECTED_"+sGXsfl_102_fel_idx );
      edtHisReoTn_Internalname = "HISREOTN_"+sGXsfl_102_fel_idx ;
      edtHisReoFec_Internalname = "HISREOFEC_"+sGXsfl_102_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_102_fel_idx ;
      edtHisBarCod_Internalname = "HISBARCOD_"+sGXsfl_102_fel_idx ;
      edtHisCodReo_Internalname = "HISCODREO_"+sGXsfl_102_fel_idx ;
      edtHisCodPar_Internalname = "HISCODPAR_"+sGXsfl_102_fel_idx ;
      edtHisBarSer_Internalname = "HISBARSER_"+sGXsfl_102_fel_idx ;
      edtavEst_r_Internalname = "vEST_R_"+sGXsfl_102_fel_idx ;
      edtHisColNom_Internalname = "HISCOLNOM_"+sGXsfl_102_fel_idx ;
      edtHisColNum_Internalname = "HISCOLNUM_"+sGXsfl_102_fel_idx ;
   }

   public void sendrow_1022( )
   {
      subsflControlProps_1022( ) ;
      wb2570( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_102_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_102_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_102_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavGrid1selected.getEnabled()!=0)&&(chkavGrid1selected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'"+sGXsfl_102_idx+"',102)\"" : " ") ;
         ClassString = "AttributeCheckBox" ;
         StyleString = "" ;
         GXCCtl = "vGRID1SELECTED_" + sGXsfl_102_idx ;
         chkavGrid1selected.setName( GXCCtl );
         chkavGrid1selected.setWebtags( "" );
         chkavGrid1selected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavGrid1selected.getInternalname(), "TitleCaption", chkavGrid1selected.getCaption(), !bGXsfl_102_Refreshing);
         chkavGrid1selected.setCheckedValue( "false" );
         AV22Grid1Selected = GXutil.strtobool( GXutil.booltostr( AV22Grid1Selected)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavGrid1selected.getInternalname(), AV22Grid1Selected);
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavGrid1selected.getInternalname(),GXutil.booltostr( AV22Grid1Selected),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(103, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavGrid1selected.getEnabled()!=0)&&(chkavGrid1selected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,103);\"" : " ")});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoTn_Internalname,GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisReoTn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoFec_Internalname,localUtil.format(A569HisReoFec, "99/99/99"),localUtil.format( A569HisReoFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisReoFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisCodPar_Internalname,GXutil.rtrim( A544HisCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarSer_Internalname,GXutil.rtrim( A542HisBarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEst_r_Enabled!=0)&&(edtavEst_r_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_102_idx+"',102)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEst_r_Internalname,GXutil.rtrim( AV6Est_r),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEst_r_Enabled!=0)&&(edtavEst_r_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,111);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavEst_r_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEst_r_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisColNom_Internalname,GXutil.rtrim( A546HisColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A547HisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A547HisColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2572( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_102_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_102_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_102_idx+1) ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1022( ) ;
      }
      /* End function sendrow_1022 */
   }

   public void startgridcontrol102( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"102\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeCheckBox"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavGrid1selected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavGrid1selected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavGrid1selected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo TN", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "O.S", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ST", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod.Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            Grid1Container.Clear();
         }
         Grid1Container.SetWrapped(nGXWrapped);
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV22Grid1Selected));
         Grid1Column.AddObjectProperty("Title", GXutil.rtrim( chkavGrid1selected.getTitle()));
         Grid1Column.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavGrid1selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", localUtil.format(A569HisReoFec, "99/99/99"));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A544HisCodPar));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A542HisBarSer));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV6Est_r));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEst_r_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A546HisColNom));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A547HisColNum, (byte)(6), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavNumero_desde_Internalname = "vNUMERO_DESDE" ;
      edtavNumero_hasta_Internalname = "vNUMERO_HASTA" ;
      edtavFecha_desde_Internalname = "vFECHA_DESDE" ;
      edtavFecha_hasta_Internalname = "vFECHA_HASTA" ;
      cmbavHisestreo.setInternalname( "vHISESTREO" );
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      edtavTexto_desde_Internalname = "vTEXTO_DESDE" ;
      edtavTexto_hasta_Internalname = "vTEXTO_HASTA" ;
      lblTextblock_comentarios_Internalname = "TEXTBLOCK_COMENTARIOS" ;
      divTabletexto_Internalname = "TABLETEXTO" ;
      divTable_masopciones_Internalname = "TABLE_MASOPCIONES" ;
      divPanel_filtrosmas_Internalname = "PANEL_FILTROSMAS" ;
      Dvpanel_panel_filtrosmas_Internalname = "DVPANEL_PANEL_FILTROSMAS" ;
      bttBtnexcel_Internalname = "BTNEXCEL" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtncsv_Internalname = "BTNCSV" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      chkavGrid1selected.setInternalname( "vGRID1SELECTED" );
      edtHisReoTn_Internalname = "HISREOTN" ;
      edtHisReoFec_Internalname = "HISREOFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtHisBarCod_Internalname = "HISBARCOD" ;
      edtHisCodReo_Internalname = "HISCODREO" ;
      edtHisCodPar_Internalname = "HISCODPAR" ;
      edtHisBarSer_Internalname = "HISBARSER" ;
      edtavEst_r_Internalname = "vEST_R" ;
      edtHisColNom_Internalname = "HISCOLNOM" ;
      edtHisColNum_Internalname = "HISCOLNUM" ;
      Grid1paginationbar_Internalname = "GRID1PAGINATIONBAR" ;
      divGrid1tablewithpaginationbar_Internalname = "GRID1TABLEWITHPAGINATIONBAR" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGrid1currentpage_Internalname = "vGRID1CURRENTPAGE" ;
      edtavPt_Internalname = "vPT" ;
      edtavTintex_Internalname = "vTINTEX" ;
      Grid1_empowerer_Internalname = "GRID1_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      edtHisColNum_Jsonclick = "" ;
      edtHisColNom_Jsonclick = "" ;
      edtavEst_r_Jsonclick = "" ;
      edtavEst_r_Visible = -1 ;
      edtavEst_r_Enabled = 1 ;
      edtHisBarSer_Jsonclick = "" ;
      edtHisCodPar_Jsonclick = "" ;
      edtHisCodReo_Jsonclick = "" ;
      edtHisBarCod_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtHisReoFec_Jsonclick = "" ;
      edtHisReoTn_Jsonclick = "" ;
      chkavGrid1selected.setCaption( "" );
      chkavGrid1selected.setVisible( -1 );
      chkavGrid1selected.setEnabled( 1 );
      subGrid1_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavTintex_Jsonclick = "" ;
      edtavTintex_Visible = 1 ;
      edtavPt_Jsonclick = "" ;
      edtavPt_Visible = 1 ;
      edtavGrid1currentpage_Jsonclick = "" ;
      edtavGrid1currentpage_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavTexto_hasta_Jsonclick = "" ;
      edtavTexto_hasta_Enabled = 1 ;
      edtavTexto_desde_Jsonclick = "" ;
      edtavTexto_desde_Enabled = 1 ;
      cmbavHisestreo.setJsonclick( "" );
      cmbavHisestreo.setEnabled( 1 );
      edtavFecha_hasta_Jsonclick = "" ;
      edtavFecha_hasta_Enabled = 1 ;
      edtavFecha_desde_Jsonclick = "" ;
      edtavFecha_desde_Enabled = 1 ;
      edtavNumero_hasta_Jsonclick = "" ;
      edtavNumero_hasta_Enabled = 1 ;
      edtavNumero_desde_Jsonclick = "" ;
      edtavNumero_desde_Enabled = 1 ;
      chkavGrid1selected.setTitleFormat( (short)(0) );
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
      Grid1paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Grid1paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Grid1paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Grid1paginationbar_Next = "WWP_PagingNextCaption" ;
      Grid1paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Grid1paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Grid1paginationbar_Rowsperpageselectedvalue = 10 ;
      Grid1paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Grid1paginationbar_Pagingcaptionposition = "Left" ;
      Grid1paginationbar_Pagingbuttonsposition = "Right" ;
      Grid1paginationbar_Pagestoshow = 5 ;
      Grid1paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Class = "PaginationBar" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Imprimir RC e NC", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosmas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Iconposition = "Right" ;
      Dvpanel_panel_filtrosmas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panel_filtrosmas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Title = httpContext.getMessage( "Más opciones", "") ;
      Dvpanel_panel_filtrosmas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosmas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Imprimir RC e NC", "") );
      chkavGrid1selected.setTitle( "" );
      subGrid1_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHisestreo.setName( "vHISESTREO" );
      cmbavHisestreo.setWebtags( "" );
      cmbavHisestreo.addItem(GXutil.trim( GXutil.str( 0, 1, 0)), httpContext.getMessage( "GX_EmptyItemText", ""), (short)(0));
      cmbavHisestreo.addItem("1", httpContext.getMessage( "NC", ""), (short)(0));
      cmbavHisestreo.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV11HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV11HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.str( AV11HisEstReo, 1, 0));
      }
      GXCCtl = "vGRID1SELECTED_" + sGXsfl_102_idx ;
      chkavGrid1selected.setName( GXCCtl );
      chkavGrid1selected.setWebtags( "" );
      chkavGrid1selected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavGrid1selected.getInternalname(), "TitleCaption", chkavGrid1selected.getCaption(), !bGXsfl_102_Refreshing);
      chkavGrid1selected.setCheckedValue( "false" );
      AV22Grid1Selected = GXutil.strtobool( GXutil.booltostr( AV22Grid1Selected)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavGrid1selected.getInternalname(), AV22Grid1Selected);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV14Numero_Hasta',fld:'vNUMERO_HASTA',pic:'ZZZ9'},{av:'AV7Fecha_Desde',fld:'vFECHA_DESDE',pic:''},{av:'AV8Fecha_Hasta',fld:'vFECHA_HASTA',pic:''},{av:'cmbavHisestreo'},{av:'AV11HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'chkavGrid1selected.getTitleFormat()',ctrl:'vGRID1SELECTED',prop:'Titleformat'},{av:'chkavGrid1selected.getTitle()',ctrl:'vGRID1SELECTED',prop:'Title'},{av:'AV24Grid1SelectedRows',fld:'vGRID1SELECTEDROWS',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e192572',iparms:[]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV22Grid1Selected',fld:'vGRID1SELECTED',pic:''}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE","{handler:'e142572',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV14Numero_Hasta',fld:'vNUMERO_HASTA',pic:'ZZZ9'},{av:'AV7Fecha_Desde',fld:'vFECHA_DESDE',pic:''},{av:'AV8Fecha_Hasta',fld:'vFECHA_HASTA',pic:''},{av:'cmbavHisestreo'},{av:'AV11HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'chkavGrid1selected.getTitleFormat()',ctrl:'vGRID1SELECTED',prop:'Titleformat'},{av:'chkavGrid1selected.getTitle()',ctrl:'vGRID1SELECTED',prop:'Title'},{av:'AV24Grid1SelectedRows',fld:'vGRID1SELECTEDROWS',pic:'',hsh:true},{av:'Grid1paginationbar_Selectedpage',ctrl:'GRID1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV9Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV9Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e152572',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV14Numero_Hasta',fld:'vNUMERO_HASTA',pic:'ZZZ9'},{av:'AV7Fecha_Desde',fld:'vFECHA_DESDE',pic:''},{av:'AV8Fecha_Hasta',fld:'vFECHA_HASTA',pic:''},{av:'cmbavHisestreo'},{av:'AV11HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'chkavGrid1selected.getTitleFormat()',ctrl:'vGRID1SELECTED',prop:'Titleformat'},{av:'chkavGrid1selected.getTitle()',ctrl:'vGRID1SELECTED',prop:'Title'},{av:'AV24Grid1SelectedRows',fld:'vGRID1SELECTEDROWS',pic:'',hsh:true},{av:'Grid1paginationbar_Rowsperpageselectedvalue',ctrl:'GRID1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV9Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXCEL'","{handler:'e112571',iparms:[]");
      setEventMetadata("'DOEXCEL'",",oparms:[]}");
      setEventMetadata("'DOPDF'","{handler:'e122571',iparms:[]");
      setEventMetadata("'DOPDF'",",oparms:[]}");
      setEventMetadata("'DOCSV'","{handler:'e132571',iparms:[]");
      setEventMetadata("'DOCSV'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e162572',iparms:[{av:'AV24Grid1SelectedRows',fld:'vGRID1SELECTEDROWS',pic:'',hsh:true},{av:'AV25PT',fld:'vPT',pic:'ZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A2297HisReoTn',fld:'HISREOTN',pic:'ZZZZZ9'},{av:'AV26Tintex',fld:'vTINTEX',pic:'ZZZ9'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'A2297HisReoTn',fld:'HISREOTN',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Hiscolnum',iparms:[]");
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
      Grid1paginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7Fecha_Desde = GXutil.nullDate() ;
      AV8Fecha_Hasta = GXutil.nullDate() ;
      AV24Grid1SelectedRows = new GXBaseCollection<app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem>(app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem.class, "wwImprimirRCNCGrid1SDTItem", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV5EmprCod = "" ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_panel_filtrosmas = new com.genexus.webpanels.GXUserControl();
      AV16Texto_Desde = "" ;
      AV17Texto_Hasta = "" ;
      lblTextblock_comentarios_Jsonclick = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncsv_Jsonclick = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid1paginationbar = new com.genexus.webpanels.GXUserControl();
      AV29Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A544HisCodPar = "" ;
      A542HisBarSer = "" ;
      AV6Est_r = "" ;
      A546HisColNom = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      H02572_A396EmprCod = new String[] {""} ;
      H02572_A833TipDefCod = new short[1] ;
      H02572_A548HisEstReo = new byte[1] ;
      H02572_n548HisEstReo = new boolean[] {false} ;
      H02572_A547HisColNum = new int[1] ;
      H02572_n547HisColNum = new boolean[] {false} ;
      H02572_A546HisColNom = new String[] {""} ;
      H02572_n546HisColNom = new boolean[] {false} ;
      H02572_A542HisBarSer = new String[] {""} ;
      H02572_n542HisBarSer = new boolean[] {false} ;
      H02572_A544HisCodPar = new String[] {""} ;
      H02572_A545HisCodReo = new byte[1] ;
      H02572_A539HisBarCod = new int[1] ;
      H02572_A252CliCod = new int[1] ;
      H02572_n252CliCod = new boolean[] {false} ;
      H02572_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02572_n569HisReoFec = new boolean[] {false} ;
      H02572_A2297HisReoTn = new int[1] ;
      H02572_n2297HisReoTn = new boolean[] {false} ;
      H02573_AGRID1_nRecordCount = new long[1] ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      AV20EmprNom = "" ;
      AV21UsurCod = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV23Grid1SelectedRow = new app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem(remoteHandle, context);
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calidad.wwimprimirrcnc__default(),
         new Object[] {
             new Object[] {
            H02572_A396EmprCod, H02572_A833TipDefCod, H02572_A548HisEstReo, H02572_n548HisEstReo, H02572_A547HisColNum, H02572_n547HisColNum, H02572_A546HisColNom, H02572_n546HisColNom, H02572_A542HisBarSer, H02572_n542HisBarSer,
            H02572_A544HisCodPar, H02572_A545HisCodReo, H02572_A539HisBarCod, H02572_A252CliCod, H02572_n252CliCod, H02572_A569HisReoFec, H02572_n569HisReoFec, H02572_A2297HisReoTn, H02572_n2297HisReoTn
            }
            , new Object[] {
            H02573_AGRID1_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV29Pgmname = "Calidad.wwImprimirRCNC" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV29Pgmname = "Calidad.wwImprimirRCNC" ;
      Gx_err = (short)(0) ;
      edtavEst_r_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11HisEstReo ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A545HisCodReo ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte A548HisEstReo ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short AV14Numero_Hasta ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13Numero_Desde ;
   private short AV25PT ;
   private short AV26Tintex ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV18UNumFic ;
   private int Grid1paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_102 ;
   private int subGrid1_Rows ;
   private int nGXsfl_102_idx=1 ;
   private int Grid1paginationbar_Pagestoshow ;
   private int edtavNumero_desde_Enabled ;
   private int edtavNumero_hasta_Enabled ;
   private int edtavFecha_desde_Enabled ;
   private int edtavFecha_hasta_Enabled ;
   private int edtavTexto_desde_Enabled ;
   private int edtavTexto_hasta_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavGrid1currentpage_Visible ;
   private int edtavPt_Visible ;
   private int edtavTintex_Visible ;
   private int A2297HisReoTn ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int subGrid1_Islastpage ;
   private int edtavEst_r_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV15PageToGo ;
   private int AV31GXV1 ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int nGXsfl_102_fel_idx=1 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavEst_r_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV10Grid1PageCount ;
   private long AV9Grid1CurrentPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String Grid1paginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_102_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV5EmprCod ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtrosmas_Width ;
   private String Dvpanel_panel_filtrosmas_Cls ;
   private String Dvpanel_panel_filtrosmas_Title ;
   private String Dvpanel_panel_filtrosmas_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Grid1paginationbar_Class ;
   private String Grid1paginationbar_Pagingbuttonsposition ;
   private String Grid1paginationbar_Pagingcaptionposition ;
   private String Grid1paginationbar_Emptygridclass ;
   private String Grid1paginationbar_Rowsperpageoptions ;
   private String Grid1paginationbar_Previous ;
   private String Grid1paginationbar_Next ;
   private String Grid1paginationbar_Caption ;
   private String Grid1paginationbar_Emptygridcaption ;
   private String Grid1paginationbar_Rowsperpagecaption ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Grid1_empowerer_Gridinternalname ;
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
   private String edtavNumero_desde_Internalname ;
   private String TempTags ;
   private String edtavNumero_desde_Jsonclick ;
   private String edtavNumero_hasta_Internalname ;
   private String edtavNumero_hasta_Jsonclick ;
   private String edtavFecha_desde_Internalname ;
   private String edtavFecha_desde_Jsonclick ;
   private String edtavFecha_hasta_Internalname ;
   private String edtavFecha_hasta_Jsonclick ;
   private String Dvpanel_panel_filtrosmas_Internalname ;
   private String divPanel_filtrosmas_Internalname ;
   private String divTable_masopciones_Internalname ;
   private String edtavTexto_desde_Internalname ;
   private String edtavTexto_desde_Jsonclick ;
   private String edtavTexto_hasta_Internalname ;
   private String edtavTexto_hasta_Jsonclick ;
   private String divTabletexto_Internalname ;
   private String lblTextblock_comentarios_Internalname ;
   private String lblTextblock_comentarios_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtncsv_Internalname ;
   private String bttBtncsv_Jsonclick ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divGrid1tablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String Grid1paginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGrid1currentpage_Internalname ;
   private String edtavGrid1currentpage_Jsonclick ;
   private String edtavPt_Internalname ;
   private String edtavPt_Jsonclick ;
   private String edtavTintex_Internalname ;
   private String edtavTintex_Jsonclick ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtHisReoTn_Internalname ;
   private String edtHisReoFec_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtHisBarCod_Internalname ;
   private String edtHisCodReo_Internalname ;
   private String A544HisCodPar ;
   private String edtHisCodPar_Internalname ;
   private String A542HisBarSer ;
   private String edtHisBarSer_Internalname ;
   private String AV6Est_r ;
   private String edtavEst_r_Internalname ;
   private String A546HisColNom ;
   private String edtHisColNom_Internalname ;
   private String edtHisColNum_Internalname ;
   private String scmdbuf ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String AV20EmprNom ;
   private String AV21UsurCod ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_102_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtHisReoTn_Jsonclick ;
   private String edtHisReoFec_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtHisBarCod_Jsonclick ;
   private String edtHisCodReo_Jsonclick ;
   private String edtHisCodPar_Jsonclick ;
   private String edtHisBarSer_Jsonclick ;
   private String edtavEst_r_Jsonclick ;
   private String edtHisColNom_Jsonclick ;
   private String edtHisColNum_Jsonclick ;
   private String subGrid1_Header ;
   private java.util.Date AV7Fecha_Desde ;
   private java.util.Date AV8Fecha_Hasta ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_102_Refreshing=false ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtrosmas_Autowidth ;
   private boolean Dvpanel_panel_filtrosmas_Autoheight ;
   private boolean Dvpanel_panel_filtrosmas_Collapsible ;
   private boolean Dvpanel_panel_filtrosmas_Collapsed ;
   private boolean Dvpanel_panel_filtrosmas_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosmas_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Grid1paginationbar_Showfirst ;
   private boolean Grid1paginationbar_Showprevious ;
   private boolean Grid1paginationbar_Shownext ;
   private boolean Grid1paginationbar_Showlast ;
   private boolean Grid1paginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV22Grid1Selected ;
   private boolean n2297HisReoTn ;
   private boolean n569HisReoFec ;
   private boolean n252CliCod ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n548HisEstReo ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV16Texto_Desde ;
   private String AV17Texto_Hasta ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosmas ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGrid1paginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private HTMLChoice cmbavHisestreo ;
   private ICheckbox chkavGrid1selected ;
   private IDataStoreProvider pr_default ;
   private String[] H02572_A396EmprCod ;
   private short[] H02572_A833TipDefCod ;
   private byte[] H02572_A548HisEstReo ;
   private boolean[] H02572_n548HisEstReo ;
   private int[] H02572_A547HisColNum ;
   private boolean[] H02572_n547HisColNum ;
   private String[] H02572_A546HisColNom ;
   private boolean[] H02572_n546HisColNom ;
   private String[] H02572_A542HisBarSer ;
   private boolean[] H02572_n542HisBarSer ;
   private String[] H02572_A544HisCodPar ;
   private byte[] H02572_A545HisCodReo ;
   private int[] H02572_A539HisBarCod ;
   private int[] H02572_A252CliCod ;
   private boolean[] H02572_n252CliCod ;
   private java.util.Date[] H02572_A569HisReoFec ;
   private boolean[] H02572_n569HisReoFec ;
   private int[] H02572_A2297HisReoTn ;
   private boolean[] H02572_n2297HisReoTn ;
   private long[] H02573_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem> AV24Grid1SelectedRows ;
   private app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem AV23Grid1SelectedRow ;
}

final  class wwimprimirrcnc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02572( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV11HisEstReo ,
                                          byte A548HisEstReo ,
                                          java.util.Date A569HisReoFec ,
                                          java.util.Date AV7Fecha_Desde ,
                                          java.util.Date AV8Fecha_Hasta ,
                                          int A2297HisReoTn ,
                                          short AV14Numero_Hasta )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[8];
      Object[] GXv_Object10 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, TipDefCod, HisEstReo, HisColNum, HisColNom, HisBarSer, HisCodPar, HisCodReo, HisBarCod, CliCod, HisReoFec, HisReoTn" ;
      sFromString = " FROM TXPHISREO" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(HisReoFec >= ? and HisReoFec <= ?)");
      addWhere(sWhereString, "(HisReoTn >= ? and HisReoTn <= ?)");
      addWhere(sWhereString, "(HisReoTn > 0)");
      if ( ! (0==AV11HisEstReo) )
      {
         addWhere(sWhereString, "(HisEstReo = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H02573( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV11HisEstReo ,
                                          byte A548HisEstReo ,
                                          java.util.Date A569HisReoFec ,
                                          java.util.Date AV7Fecha_Desde ,
                                          java.util.Date AV8Fecha_Hasta ,
                                          int A2297HisReoTn ,
                                          short AV14Numero_Hasta )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[5];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHISREO" ;
      addWhere(sWhereString, "(HisReoFec >= ? and HisReoFec <= ?)");
      addWhere(sWhereString, "(HisReoTn >= ? and HisReoTn <= ?)");
      addWhere(sWhereString, "(HisReoTn > 0)");
      if ( ! (0==AV11HisEstReo) )
      {
         addWhere(sWhereString, "(HisEstReo = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H02572(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() );
            case 1 :
                  return conditional_H02573(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02572", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02573", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               return;
      }
   }

}

