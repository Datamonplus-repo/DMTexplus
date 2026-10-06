package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwccpoln_impl extends GXDataArea
{
   public wwccpoln_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwccpoln_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwccpoln_impl.class ));
   }

   public wwccpoln_impl( int remoteHandle ,
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
      nRC_GXsfl_66 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_66"))) ;
      nGXsfl_66_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_66_idx"))) ;
      sGXsfl_66_idx = httpContext.GetPar( "sGXsfl_66_idx") ;
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
      AV27i = (int)(GXutil.lval( httpContext.GetPar( "i"))) ;
      AV89vIsError = (byte)(GXutil.lval( httpContext.GetPar( "vIsError"))) ;
      AV13CargaModelos = (byte)(GXutil.lval( httpContext.GetPar( "CargaModelos"))) ;
      AV54pathModelos = httpContext.GetPar( "pathModelos") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV19EmprCod = httpContext.GetPar( "EmprCod") ;
      A4041CCTArc = httpContext.GetPar( "CCTArc") ;
      AV88Clase = httpContext.GetPar( "Clase") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV27i, AV89vIsError, AV13CargaModelos, AV54pathModelos, A396EmprCod, AV19EmprCod, A4041CCTArc, AV88Clase) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,true);
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
      pa1UR2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1UR2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wwccpoln", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARGAMODELOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CargaModelos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHMODELOS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54pathModelos, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLASE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Clase, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_66", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_66, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV91Grid1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV27i, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVISERROR", GXutil.ltrim( localUtil.ntoc( AV89vIsError, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARGAMODELOS", GXutil.ltrim( localUtil.ntoc( AV13CargaModelos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARGAMODELOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CargaModelos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHMODELOS", AV54pathModelos);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHMODELOS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54pathModelos, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTARC", GXutil.rtrim( A4041CCTArc));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTARC", GXutil.rtrim( AV14CCtarc));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLASE", AV88Clase);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLASE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Clase, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVISVAL", GXutil.ltrim( localUtil.ntoc( AV102vIsVal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we1UR2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1UR2( ) ;
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
      return formatLink("app.controlcalidadhtd.wwccpoln", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.WWCCPOLN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AUDITORIA n Controles", "") ;
   }

   public void wb1UR0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablesearchparm_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Ordem Servico", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcadreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcadreo_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcadreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV70BarCadReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcadreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70BarCadReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV70BarCadReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcadreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcadreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 hidden-xs DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV8BarCodPar), GXutil.rtrim( localUtil.format( AV8BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableprompt1_Internalname, 1, 0, "px", 0, "px", "Prompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblPrompt1_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-1x\"></i>", ""), "", "", lblPrompt1_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPROMPT1.CLICK."+"'", "", "TextBlock", 5, "", 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablemodeloseleccionado_Internalname, 1, 0, "px", 0, "px", "AttributeFL", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 AttributeEmptyValue", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmodeloseleccionado_Internalname, lblTextblockmodeloseleccionado_Caption, "", "", lblTextblockmodeloseleccionado_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrid1tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol66( ) ;
      }
      if ( wbEnd == 66 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_66 = (int)(nGXsfl_66_idx-1) ;
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
         ucGrid1paginationbar.setProperty("CurrentPage", AV90Grid1CurrentPage);
         ucGrid1paginationbar.setProperty("PageCount", AV91Grid1PageCount);
         ucGrid1paginationbar.render(context, "dvelop.dvpaginationbar", Grid1paginationbar_Internalname, "GRID1PAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 66, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111ur1_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 66, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121ur1_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV90Grid1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPOLN.htm");
         wb_table1_85_1UR2( true) ;
      }
      else
      {
         wb_table1_85_1UR2( false) ;
      }
      return  ;
   }

   public void wb_table1_85_1UR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 66 )
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

   public void start1UR2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AUDITORIA n Controles", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1UR0( ) ;
   }

   public void ws1UR2( )
   {
      start1UR2( ) ;
      evt1UR2( ) ;
   }

   public void evt1UR2( )
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
                           e131UR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141UR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151UR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "PROMPT1.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161UR2 ();
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
                           nGXsfl_66_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_66_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_66_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_662( ) ;
                           AV80sCCTArc = GXutil.upper( httpContext.cgiGet( edtavScctarc_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavScctarc_Internalname, AV80sCCTArc);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSCCTARC"+"_"+sGXsfl_66_idx, getSecureSignedToken( sGXsfl_66_idx, GXutil.rtrim( localUtil.format( AV80sCCTArc, "@!"))));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e171UR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e181UR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191UR2 ();
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

   public void we1UR2( )
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

   public void pa1UR2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      subsflControlProps_662( ) ;
      while ( nGXsfl_66_idx <= nRC_GXsfl_66 )
      {
         sendrow_662( ) ;
         nGXsfl_66_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_66_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_66_idx+1) ;
         sGXsfl_66_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_66_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_662( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV27i ,
                                  byte AV89vIsError ,
                                  byte AV13CargaModelos ,
                                  String AV54pathModelos ,
                                  String A396EmprCod ,
                                  String AV19EmprCod ,
                                  String A4041CCTArc ,
                                  String AV88Clase )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181UR2 ();
      GRID1_nCurrentRecord = 0 ;
      rf1UR2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSCCTARC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80sCCTArc, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSCCTARC", GXutil.rtrim( AV80sCCTArc));
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
      rf1UR2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV109Pgmname = "ControlCalidadHTD.WWCCPOLN" ;
      Gx_err = (short)(0) ;
      edtavScctarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavScctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavScctarc_Enabled), 5, 0), !bGXsfl_66_Refreshing);
   }

   public void rf1UR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(66) ;
      /* Execute user event: Refresh */
      e181UR2 ();
      nGXsfl_66_idx = 1 ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_66_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_662( ) ;
      bGXsfl_66_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_662( ) ;
         e191UR2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_66_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e191UR2 ();
         }
         wbEnd = (short)(66) ;
         wb1UR0( ) ;
      }
      bGXsfl_66_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1UR2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV27i, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVISERROR", GXutil.ltrim( localUtil.ntoc( AV89vIsError, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARGAMODELOS", GXutil.ltrim( localUtil.ntoc( AV13CargaModelos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARGAMODELOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CargaModelos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHMODELOS", AV54pathModelos);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHMODELOS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54pathModelos, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSCCTARC"+"_"+sGXsfl_66_idx, getSecureSignedToken( sGXsfl_66_idx, GXutil.rtrim( localUtil.format( AV80sCCTArc, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLASE", AV88Clase);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLASE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Clase, ""))));
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return (int)(((subGrid1_Recordcount==0) ? GRID1_nFirstRecordOnPage+1 : subGrid1_Recordcount)) ;
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
      return (int)(((subGrid1_Islastpage==1) ? subgrid1_fnc_recordcount( )/ (double) (subgrid1_fnc_recordsperpage( ))+((((int)((subgrid1_fnc_recordcount( )) % (subgrid1_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV27i, AV89vIsError, AV13CargaModelos, AV54pathModelos, A396EmprCod, AV19EmprCod, A4041CCTArc, AV88Clase) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV27i, AV89vIsError, AV13CargaModelos, AV54pathModelos, A396EmprCod, AV19EmprCod, A4041CCTArc, AV88Clase) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV27i, AV89vIsError, AV13CargaModelos, AV54pathModelos, A396EmprCod, AV19EmprCod, A4041CCTArc, AV88Clase) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV27i, AV89vIsError, AV13CargaModelos, AV54pathModelos, A396EmprCod, AV19EmprCod, A4041CCTArc, AV88Clase) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV27i, AV89vIsError, AV13CargaModelos, AV54pathModelos, A396EmprCod, AV19EmprCod, A4041CCTArc, AV88Clase) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV109Pgmname = "ControlCalidadHTD.WWCCPOLN" ;
      Gx_err = (short)(0) ;
      edtavScctarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavScctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavScctarc_Enabled), 5, 0), !bGXsfl_66_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1UR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171UR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_66 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_66"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV91Grid1PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV88Clase = httpContext.cgiGet( "vCLASE") ;
         AV14CCtarc = httpContext.cgiGet( "vCCTARC") ;
         AV102vIsVal = (byte)(localUtil.ctol( httpContext.cgiGet( "vVISVAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Grid1paginationbar_Selectedpage = httpContext.cgiGet( "GRID1PAGINATIONBAR_Selectedpage") ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         }
         else
         {
            AV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCADREO");
            GX_FocusControl = edtavBarcadreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70BarCadReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70BarCadReo", GXutil.str( AV70BarCadReo, 1, 0));
         }
         else
         {
            AV70BarCadReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70BarCadReo", GXutil.str( AV70BarCadReo, 1, 0));
         }
         AV8BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID1CURRENTPAGE");
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90Grid1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), 10, 0));
         }
         else
         {
            AV90Grid1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), 10, 0));
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
      e171UR2 ();
      if (returnInSub) return;
   }

   public void e171UR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV59Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwccpoln_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwccpoln_impl.this.AV19EmprCod = GXv_char2[0] ;
      wwccpoln_impl.this.AV20EmprNom = GXv_char3[0] ;
      wwccpoln_impl.this.AV62UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV90Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), 10, 0));
      edtavGrid1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid1currentpage_Visible), 5, 0), true);
      AV91Grid1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91Grid1PageCount), 10, 0));
      Grid1paginationbar_Rowsperpageselectedvalue = subGrid1_Rows ;
      ucGrid1paginationbar.sendProperty(context, "", false, Grid1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid1paginationbar_Rowsperpageselectedvalue), 9, 0));
      AV89vIsError = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89vIsError", GXutil.str( AV89vIsError, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
      AV27i = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27i), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
      GXt_int5 = AV13CargaModelos ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, "LOADMD", GXv_int6) ;
      wwccpoln_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13CargaModelos = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CargaModelos", GXutil.str( AV13CargaModelos, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARGAMODELOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CargaModelos), "9")));
      GXt_int7 = AV103vPosDir ;
      GXv_int8[0] = (short)(0) ;
      new app.core.rat(remoteHandle, context).execute( "\\", AV98vCCTDIR, GXt_int7, GXv_int8) ;
      AV103vPosDir = (byte)(GXt_int7) ;
      GXt_char1 = AV54pathModelos ;
      GXv_char4[0] = AV19EmprCod ;
      GXv_char3[0] = "CCTDIR" ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexidsc2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      wwccpoln_impl.this.AV19EmprCod = GXv_char4[0] ;
      wwccpoln_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      AV54pathModelos = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54pathModelos", AV54pathModelos);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHMODELOS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54pathModelos, ""))));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "vPosDir:%1, pathModelos:%2", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103vPosDir), 2, 0), GXutil.trim( AV54pathModelos), "", "", "", "", "", "", ""), AV109Pgmname) ;
      /* Execute user subroutine: 'VERIFICA_DIRDEST' */
      S112 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV54pathModelos)==0) )
      {
         if ( ! (GXutil.strcmp("", AV100vDirDest)==0) )
         {
            AV89vIsError = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89vIsError", GXutil.str( AV89vIsError, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
            if ( AV13CargaModelos == 1 )
            {
               AV69directory.setSource( GXutil.trim( AV54pathModelos) );
               AV111GXV2 = 1 ;
               AV110GXV1 = (com.genexus.util.GXFileCollection)AV69directory.getFiles("");
               while ( AV111GXV2 <= AV110GXV1.getItemCount() )
               {
                  AV93auxFile = (com.genexus.util.GXFile)AV110GXV1.item(AV111GXV2);
                  AV95NameFile = AV93auxFile.getName() ;
                  if ( GXutil.endsWith( GXutil.lower( AV95NameFile), httpContext.getMessage( ".docx", "")) )
                  {
                     if ( ! GxRegex.IsMatch(AV95NameFile,httpContext.getMessage( "áéíóúÁÉÍÓÚñÑ", "")) )
                     {
                        AV27i = (int)(AV27i+1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV27i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27i), 6, 0));
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
                     }
                  }
                  AV111GXV2 = (int)(AV111GXV2+1) ;
               }
            }
            else
            {
               /* Execute user subroutine: 'VERIFICA_CCTARC' */
               S122 ();
               if (returnInSub) return;
               if ( ( AV27i == 0 ) && (GXutil.strcmp("", AV101vExistCCTARC)==0) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "No se encuentra Registrado El Archivo de Plantilla en la tabla CCDEF", ""));
                  AV89vIsError = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV89vIsError", GXutil.str( AV89vIsError, 1, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
               }
               else
               {
                  if ( ( AV27i == 0 ) && ! (GXutil.strcmp("", AV101vExistCCTARC)==0) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "El Archivo de Plantilla registrado no existe fisicamente...Por favor verificar", ""));
                     AV89vIsError = (byte)(1) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV89vIsError", GXutil.str( AV89vIsError, 1, 0));
                     app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
                  }
                  else
                  {
                     if ( ( AV27i == 1 ) && ! (GXutil.strcmp("", AV101vExistCCTARC)==0) )
                     {
                        if ( GXutil.strcmp(GXutil.upper( AV96PathCCTARC), GXutil.upper( AV54pathModelos)) != 0 )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "El directorio registrado en Archivo de Plantilla debe ser igual a: ", "")+AV54pathModelos+httpContext.getMessage( " registrado en el parámetro CCTDIR... Por favor verificar", ""));
                           AV89vIsError = (byte)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV89vIsError", GXutil.str( AV89vIsError, 1, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
                        }
                     }
                  }
               }
            }
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No se encuentra registrado el directorio Destino para el documento... Por favor verificar", ""));
            AV89vIsError = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89vIsError", GXutil.str( AV89vIsError, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se encuentra registrado directorio de Modelos... Por favor verificar", ""));
         AV89vIsError = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89vIsError", GXutil.str( AV89vIsError, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISERROR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89vIsError), "9")));
      }
      GXt_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem9 = AV76LstSelArchivo ;
      GXv_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem10[0] = GXt_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem9 ;
      new app.controlcalidadhtd.dp_cctarc(remoteHandle, context).execute( GXv_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem10) ;
      GXt_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem9 = GXv_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem10[0] ;
      AV76LstSelArchivo = GXt_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem9 ;
      AV88Clase = "<i class=\"fas fa-file-word\" style=\"color:#D60021; font-size:24px\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Clase", AV88Clase);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLASE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Clase, ""))));
   }

   public void e181UR2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV92RecordCount = (short)(AV27i) ;
      AV91Grid1PageCount = (long)(AV92RecordCount/ (double) (subGrid1_Rows)+((((int)((AV92RecordCount) % (subGrid1_Rows)))>0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91Grid1PageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e191UR2( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      if ( AV89vIsError == 0 )
      {
         if ( AV13CargaModelos == 1 )
         {
            AV69directory.setSource( GXutil.trim( AV54pathModelos) );
            AV27i = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27i), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
            AV113GXV4 = 1 ;
            AV112GXV3 = (com.genexus.util.GXFileCollection)AV69directory.getFiles("");
            while ( AV113GXV4 <= AV112GXV3.getItemCount() )
            {
               AV93auxFile = (com.genexus.util.GXFile)AV112GXV3.item(AV113GXV4);
               AV95NameFile = AV93auxFile.getName() ;
               if ( GXutil.endsWith( GXutil.lower( AV95NameFile), httpContext.getMessage( ".docx", "")) )
               {
                  AV80sCCTArc = AV93auxFile.getAbsoluteName() ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavScctarc_Internalname, AV80sCCTArc);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSCCTARC"+"_"+sGXsfl_66_idx, getSecureSignedToken( sGXsfl_66_idx, GXutil.rtrim( localUtil.format( AV80sCCTArc, "@!"))));
                  AV27i = (int)(AV27i+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27i), 6, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(66) ;
                  }
                  if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) ) ) )
                  {
                     sendrow_662( ) ;
                     GRID1_nEOF = (byte)(1) ;
                     app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_fnc_recordsperpage( )))) == 0 ) )
                     {
                        GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                     }
                  }
                  if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) )
                  {
                     GRID1_nEOF = (byte)(0) ;
                     app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_66_Refreshing )
                  {
                     httpContext.doAjaxLoad(66, Grid1Row);
                  }
               }
               AV113GXV4 = (int)(AV113GXV4+1) ;
            }
         }
         else
         {
            /* Using cursor H01UR2 */
            pr_default.execute(0, new Object[] {AV19EmprCod});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A396EmprCod = H01UR2_A396EmprCod[0] ;
               A4041CCTArc = H01UR2_A4041CCTArc[0] ;
               if ( ! (GXutil.strcmp("", A4041CCTArc)==0) || ( GXutil.len( GXutil.trim( A4041CCTArc)) > 0 ) )
               {
                  AV80sCCTArc = A4041CCTArc ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavScctarc_Internalname, AV80sCCTArc);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSCCTARC"+"_"+sGXsfl_66_idx, getSecureSignedToken( sGXsfl_66_idx, GXutil.rtrim( localUtil.format( AV80sCCTArc, "@!"))));
                  AV27i = (int)(AV27i+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27i), 6, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(66) ;
                  }
                  if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) ) ) )
                  {
                     sendrow_662( ) ;
                     GRID1_nEOF = (byte)(1) ;
                     app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_fnc_recordsperpage( )))) == 0 ) )
                     {
                        GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                     }
                  }
                  if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) )
                  {
                     GRID1_nEOF = (byte)(0) ;
                     app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_66_Refreshing )
                  {
                     httpContext.doAjaxLoad(66, Grid1Row);
                  }
               }
               pr_default.readNext(0);
            }
            pr_default.close(0);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e131UR2( )
   {
      /* Grid1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV90Grid1CurrentPage = (long)(AV90Grid1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), 10, 0));
         subgrid1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV90Grid1CurrentPage = (long)(AV90Grid1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), 10, 0));
         subgrid1_nextpage( ) ;
      }
      else
      {
         AV78PageToGo = (int)(GXutil.lval( Grid1paginationbar_Selectedpage)) ;
         AV90Grid1CurrentPage = AV78PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), 10, 0));
         subgrid1_gotopage( AV78PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e141UR2( )
   {
      /* Grid1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid1_Rows = Grid1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV90Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Grid1CurrentPage), 10, 0));
      subgrid1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151UR2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S132 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.controlcalidadhtd.wwccpoln2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70BarCadReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV14CCtarc))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodPar","CCTArc"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e161UR2( )
   {
      /* Prompt1_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV19EmprCod","AV6BarCod","AV9BarCodreo","AV8BarCodPar","",""});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'VERIFICA_CCTARC' Routine */
      returnInSub = false ;
      AV27i = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27i), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
      AV101vExistCCTARC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101vExistCCTARC", AV101vExistCCTARC);
      /* Using cursor H01UR3 */
      pr_default.execute(1, new Object[] {AV19EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H01UR3_A396EmprCod[0] ;
         A4041CCTArc = H01UR3_A4041CCTArc[0] ;
         if ( ! (GXutil.strcmp("", A4041CCTArc)==0) || ( GXutil.len( GXutil.trim( A4041CCTArc)) > 0 ) )
         {
            AV101vExistCCTARC = A4041CCTArc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101vExistCCTARC", AV101vExistCCTARC);
            AV97sFile.setSource( A4041CCTArc );
            if ( AV97sFile.exists() )
            {
               AV27i = (int)(AV27i+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27i), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27i), "ZZZZZ9")));
               AV96PathCCTARC = AV97sFile.getPath() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV96PathCCTARC", AV96PathCCTARC);
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S112( )
   {
      /* 'VERIFICA_DIRDEST' Routine */
      returnInSub = false ;
      AV100vDirDest = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100vDirDest", AV100vDirDest);
      /* Using cursor H01UR4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A313ContCod = H01UR4_A313ContCod[0] ;
         A7208ContDsc2 = H01UR4_A7208ContDsc2[0] ;
         A14173ContATCod = H01UR4_A14173ContATCod[0] ;
         n14173ContATCod = H01UR4_n14173ContATCod[0] ;
         if ( GXutil.strcmp(A313ContCod, httpContext.getMessage( "CCTDIR", "")) == 0 )
         {
            AV100vDirDest = A14173ContATCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100vDirDest", AV100vDirDest);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void wb_table1_85_1UR2( boolean wbgen )
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
         wb_table1_85_1UR2e( true) ;
      }
      else
      {
         wb_table1_85_1UR2e( false) ;
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
      pa1UR2( ) ;
      ws1UR2( ) ;
      we1UR2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026610164455", true, true);
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
         httpContext.AddJavascriptSource("controlcalidadhtd/wwccpoln.js", "?2026610164456", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_662( )
   {
      edtavScctarc_Internalname = "vSCCTARC_"+sGXsfl_66_idx ;
   }

   public void subsflControlProps_fel_662( )
   {
      edtavScctarc_Internalname = "vSCCTARC_"+sGXsfl_66_fel_idx ;
   }

   public void sendrow_662( )
   {
      subsflControlProps_662( ) ;
      wb1UR0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_66_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_66_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_66_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavScctarc_Internalname,GXutil.rtrim( AV80sCCTArc),GXutil.rtrim( localUtil.format( AV80sCCTArc, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavScctarc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavScctarc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(128),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(66),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1UR2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_66_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_66_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_66_idx+1) ;
         sGXsfl_66_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_66_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_662( ) ;
      }
      /* End function sendrow_662 */
   }

   public void startgridcontrol66( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"66\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV80sCCTArc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavScctarc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcadreo_Internalname = "vBARCADREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      lblPrompt1_Internalname = "PROMPT1" ;
      divTableprompt1_Internalname = "TABLEPROMPT1" ;
      divTablesearchparm_Internalname = "TABLESEARCHPARM" ;
      lblTextblockmodeloseleccionado_Internalname = "TEXTBLOCKMODELOSELECCIONADO" ;
      divTablemodeloseleccionado_Internalname = "TABLEMODELOSELECCIONADO" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      edtavScctarc_Internalname = "vSCCTARC" ;
      Grid1paginationbar_Internalname = "GRID1PAGINATIONBAR" ;
      divGrid1tablewithpaginationbar_Internalname = "GRID1TABLEWITHPAGINATIONBAR" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGrid1currentpage_Internalname = "vGRID1CURRENTPAGE" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavScctarc_Jsonclick = "" ;
      edtavScctarc_Enabled = 0 ;
      subGrid1_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavGrid1currentpage_Jsonclick = "" ;
      edtavGrid1currentpage_Visible = 1 ;
      lblTextblockmodeloseleccionado_Caption = "." ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcadreo_Jsonclick = "" ;
      edtavBarcadreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Modelos", "") ;
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
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelNoHeader" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "AUDITORIA n Controles", "") );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV27i',fld:'vI',pic:'ZZZZZ9',hsh:true},{av:'AV89vIsError',fld:'vVISERROR',pic:'9',hsh:true},{av:'AV13CargaModelos',fld:'vCARGAMODELOS',pic:'9',hsh:true},{av:'AV54pathModelos',fld:'vPATHMODELOS',pic:'',hsh:true},{av:'AV88Clase',fld:'vCLASE',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV91Grid1PageCount',fld:'vGRID1PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e191UR2',iparms:[{av:'AV89vIsError',fld:'vVISERROR',pic:'9',hsh:true},{av:'AV13CargaModelos',fld:'vCARGAMODELOS',pic:'9',hsh:true},{av:'AV54pathModelos',fld:'vPATHMODELOS',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'AV27i',fld:'vI',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV27i',fld:'vI',pic:'ZZZZZ9',hsh:true},{av:'AV80sCCTArc',fld:'vSCCTARC',pic:'@!',hsh:true}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE","{handler:'e131UR2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV27i',fld:'vI',pic:'ZZZZZ9',hsh:true},{av:'AV89vIsError',fld:'vVISERROR',pic:'9',hsh:true},{av:'AV13CargaModelos',fld:'vCARGAMODELOS',pic:'9',hsh:true},{av:'AV54pathModelos',fld:'vPATHMODELOS',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'AV88Clase',fld:'vCLASE',pic:'',hsh:true},{av:'Grid1paginationbar_Selectedpage',ctrl:'GRID1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV90Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV90Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV91Grid1PageCount',fld:'vGRID1PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141UR2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV27i',fld:'vI',pic:'ZZZZZ9',hsh:true},{av:'AV89vIsError',fld:'vVISERROR',pic:'9',hsh:true},{av:'AV13CargaModelos',fld:'vCARGAMODELOS',pic:'9',hsh:true},{av:'AV54pathModelos',fld:'vPATHMODELOS',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'AV88Clase',fld:'vCLASE',pic:'',hsh:true},{av:'Grid1paginationbar_Rowsperpageselectedvalue',ctrl:'GRID1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV90Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111UR1',iparms:[{av:'AV14CCtarc',fld:'vCCTARC',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e151UR2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70BarCadReo',fld:'vBARCADREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV14CCtarc',fld:'vCCTARC',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV14CCtarc',fld:'vCCTARC',pic:'@!'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV70BarCadReo',fld:'vBARCADREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e121UR1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("PROMPT1.CLICK","{handler:'e161UR2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV27i',fld:'vI',pic:'ZZZZZ9',hsh:true},{av:'AV89vIsError',fld:'vVISERROR',pic:'9',hsh:true},{av:'AV13CargaModelos',fld:'vCARGAMODELOS',pic:'9',hsh:true},{av:'AV54pathModelos',fld:'vPATHMODELOS',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'AV88Clase',fld:'vCLASE',pic:'',hsh:true},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("PROMPT1.CLICK",",oparms:[{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91Grid1PageCount',fld:'vGRID1PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'validv_Scctarc',iparms:[]");
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
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV54pathModelos = "" ;
      A396EmprCod = "" ;
      AV19EmprCod = "" ;
      A4041CCTArc = "" ;
      AV88Clase = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV14CCtarc = "" ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV8BarCodPar = "" ;
      lblPrompt1_Jsonclick = "" ;
      lblTextblockmodeloseleccionado_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid1paginationbar = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV80sCCTArc = "" ;
      AV109Pgmname = "" ;
      AV59Station = "" ;
      AV20EmprNom = "" ;
      AV62UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV98vCCTDIR = "" ;
      GXv_int8 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV100vDirDest = "" ;
      AV69directory = new com.genexus.util.GXDirectory();
      AV110GXV1 = new com.genexus.util.GXFileCollection();
      AV93auxFile = new com.genexus.util.GXFile();
      AV95NameFile = "" ;
      AV101vExistCCTARC = "" ;
      AV96PathCCTARC = "" ;
      AV76LstSelArchivo = new GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem>(app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem.class, "SDT_CCtarc_SeleccionaArchivoItem", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem9 = new GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem>(app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem.class, "SDT_CCtarc_SeleccionaArchivoItem", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem10 = new GXBaseCollection[1] ;
      AV112GXV3 = new com.genexus.util.GXFileCollection();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      scmdbuf = "" ;
      H01UR2_A4031CCTCod = new int[1] ;
      H01UR2_A396EmprCod = new String[] {""} ;
      H01UR2_A4041CCTArc = new String[] {""} ;
      H01UR3_A4031CCTCod = new int[1] ;
      H01UR3_A396EmprCod = new String[] {""} ;
      H01UR3_A4041CCTArc = new String[] {""} ;
      AV97sFile = new com.genexus.util.GXFile();
      H01UR4_A396EmprCod = new String[] {""} ;
      H01UR4_A313ContCod = new String[] {""} ;
      H01UR4_A7208ContDsc2 = new String[] {""} ;
      H01UR4_A14173ContATCod = new String[] {""} ;
      H01UR4_n14173ContATCod = new boolean[] {false} ;
      A313ContCod = "" ;
      A7208ContDsc2 = "" ;
      A14173ContATCod = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wwccpoln__default(),
         new Object[] {
             new Object[] {
            H01UR2_A4031CCTCod, H01UR2_A396EmprCod, H01UR2_A4041CCTArc
            }
            , new Object[] {
            H01UR3_A4031CCTCod, H01UR3_A396EmprCod, H01UR3_A4041CCTArc
            }
            , new Object[] {
            H01UR4_A396EmprCod, H01UR4_A313ContCod, H01UR4_A7208ContDsc2, H01UR4_A14173ContATCod, H01UR4_n14173ContATCod
            }
         }
      );
      AV109Pgmname = "ControlCalidadHTD.WWCCPOLN" ;
      /* GeneXus formulas. */
      AV109Pgmname = "ControlCalidadHTD.WWCCPOLN" ;
      Gx_err = (short)(0) ;
      edtavScctarc_Enabled = 0 ;
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV89vIsError ;
   private byte AV13CargaModelos ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV9BarCodreo ;
   private byte AV102vIsVal ;
   private byte AV70BarCadReo ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV103vPosDir ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
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
   private short GXt_int7 ;
   private short GXv_int8[] ;
   private short AV92RecordCount ;
   private int subGrid1_Rows ;
   private int Grid1paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_66 ;
   private int nGXsfl_66_idx=1 ;
   private int AV27i ;
   private int Grid1paginationbar_Pagestoshow ;
   private int AV6BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcadreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavGrid1currentpage_Visible ;
   private int subGrid1_Islastpage ;
   private int edtavScctarc_Enabled ;
   private int GRID1_nGridOutOfScope ;
   private int subGrid1_Recordcount ;
   private int AV111GXV2 ;
   private int AV113GXV4 ;
   private int AV78PageToGo ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV91Grid1PageCount ;
   private long AV90Grid1CurrentPage ;
   private long GRID1_nCurrentRecord ;
   private String Grid1paginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_66_idx="0001" ;
   private String A396EmprCod ;
   private String AV19EmprCod ;
   private String A4041CCTArc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV14CCtarc ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
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
   private String divTablesearchparm_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcadreo_Internalname ;
   private String edtavBarcadreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV8BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String divTableprompt1_Internalname ;
   private String lblPrompt1_Internalname ;
   private String lblPrompt1_Jsonclick ;
   private String divTablemodeloseleccionado_Internalname ;
   private String lblTextblockmodeloseleccionado_Internalname ;
   private String lblTextblockmodeloseleccionado_Caption ;
   private String lblTextblockmodeloseleccionado_Jsonclick ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divGrid1tablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String Grid1paginationbar_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGrid1currentpage_Internalname ;
   private String edtavGrid1currentpage_Jsonclick ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV80sCCTArc ;
   private String edtavScctarc_Internalname ;
   private String AV109Pgmname ;
   private String AV59Station ;
   private String AV20EmprNom ;
   private String AV62UsurCod ;
   private String AV98vCCTDIR ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV100vDirDest ;
   private String AV95NameFile ;
   private String AV101vExistCCTARC ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A7208ContDsc2 ;
   private String A14173ContATCod ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String sGXsfl_66_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavScctarc_Jsonclick ;
   private String subGrid1_Header ;
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
   private boolean bGXsfl_66_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n14173ContATCod ;
   private String AV54pathModelos ;
   private String AV88Clase ;
   private String AV96PathCCTARC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGrid1paginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXFile AV97sFile ;
   private com.genexus.util.GXDirectory AV69directory ;
   private IDataStoreProvider pr_default ;
   private int[] H01UR2_A4031CCTCod ;
   private String[] H01UR2_A396EmprCod ;
   private String[] H01UR2_A4041CCTArc ;
   private int[] H01UR3_A4031CCTCod ;
   private String[] H01UR3_A396EmprCod ;
   private String[] H01UR3_A4041CCTArc ;
   private String[] H01UR4_A396EmprCod ;
   private String[] H01UR4_A313ContCod ;
   private String[] H01UR4_A7208ContDsc2 ;
   private String[] H01UR4_A14173ContATCod ;
   private boolean[] H01UR4_n14173ContATCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.util.GXFile AV93auxFile ;
   private com.genexus.util.GXFileCollection AV110GXV1 ;
   private com.genexus.util.GXFileCollection AV112GXV3 ;
   private GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> AV76LstSelArchivo ;
   private GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> GXt_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem9 ;
   private GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> GXv_objcol_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem10[] ;
}

final  class wwccpoln__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01UR2", "SELECT CCTCod, EmprCod, CCTArc FROM TXPCCDef WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01UR3", "SELECT CCTCod, EmprCod, CCTArc FROM TXPCCDef WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01UR4", "SELECT EmprCod, ContCod, ContDsc2, ContATCod FROM TXPEMPLIN ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 128);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 128);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

