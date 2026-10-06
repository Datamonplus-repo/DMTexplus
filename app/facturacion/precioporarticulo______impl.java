package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precioporarticulo______impl extends GXDataArea
{
   public precioporarticulo______impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precioporarticulo______impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporarticulo______impl.class ));
   }

   public precioporarticulo______impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavArtpredef = new HTMLChoice();
      cmbavGridactiongroup1 = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV5emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
               AV7ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ArtCod", AV7ArtCod);
               AV9CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9CliNom", AV9CliNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9CliNom, ""))));
               AV10ArtDsc = httpContext.GetPar( "ArtDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10ArtDsc", AV10ArtDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ArtDsc, ""))));
               AV26ArtPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "ArtPreKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26ArtPreKgm", GXutil.ltrimstr( AV26ArtPreKgm, 13, 5));
               AV27ArtPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "ArtPreMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27ArtPreMtr", GXutil.ltrimstr( AV27ArtPreMtr, 13, 5));
               AV28ArtPreDef = httpContext.GetPar( "ArtPreDef") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28ArtPreDef", AV28ArtPreDef);
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
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
      AV5emprcod = httpContext.GetPar( "emprcod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      A832TipColDsc = httpContext.GetPar( "TipColDsc") ;
      n832TipColDsc = false ;
      AV9CliNom = httpContext.GetPar( "CliNom") ;
      AV10ArtDsc = httpContext.GetPar( "ArtDsc") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV5emprcod, A396EmprCod, A831TipColCod, A832TipColDsc, AV9CliNom, AV10ArtDsc) ;
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
      pa23G2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start23G2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precioporarticulo_____", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV9CliNom)),GXutil.URLEncode(GXutil.rtrim(AV10ArtDsc)),GXutil.URLEncode(DecimalUtil.decToString(AV26ArtPreKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV27ArtPreMtr)),GXutil.URLEncode(GXutil.rtrim(AV28ArtPreDef))}, new String[] {"emprcod","CliCod","ArtCod","CliNom","ArtDsc","ArtPreKgm","ArtPreMtr","ArtPreDef"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ArtDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_68, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV19Grid1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLDSC", GXutil.rtrim( A832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
         we23G2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt23G2( ) ;
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
      return formatLink("app.facturacion.precioporarticulo_____", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV9CliNom)),GXutil.URLEncode(GXutil.rtrim(AV10ArtDsc)),GXutil.URLEncode(DecimalUtil.decToString(AV26ArtPreKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV27ArtPreMtr)),GXutil.URLEncode(GXutil.rtrim(AV28ArtPreDef))}, new String[] {"emprcod","CliCod","ArtCod","CliNom","ArtDsc","ArtPreKgm","ArtPreMtr","ArtPreDef"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.PrecioporArticulo_____" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precio por Articulo / Tipo Colorante", "") ;
   }

   public void wb23G0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV9CliNom), GXutil.rtrim( localUtil.format( AV9CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV7ArtCod), GXutil.rtrim( localUtil.format( AV7ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtdsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtdsc_Internalname, GXutil.rtrim( AV10ArtDsc), GXutil.rtrim( localUtil.format( AV10ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtprekgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtprekgm_Internalname, httpContext.getMessage( "Preço Kg", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtprekgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV26ArtPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavArtprekgm_Enabled!=0) ? localUtil.format( AV26ArtPreKgm, "ZZZZZZ9.999") : localUtil.format( AV26ArtPreKgm, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtprekgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtprekgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtpremtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtpremtr_Internalname, httpContext.getMessage( "Preço Mt", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtpremtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV27ArtPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavArtpremtr_Enabled!=0) ? localUtil.format( AV27ArtPreMtr, "ZZZZZZ9.999") : localUtil.format( AV27ArtPreMtr, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtpremtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtpremtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavArtpredef.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavArtpredef.getInternalname(), httpContext.getMessage( "D?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavArtpredef, cmbavArtpredef.getInternalname(), GXutil.rtrim( AV28ArtPreDef), 1, cmbavArtpredef.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavArtpredef.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Facturacion\\PrecioporArticulo_____.htm");
         cmbavArtpredef.setValue( GXutil.rtrim( AV28ArtPreDef) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Values", cmbavArtpredef.ToJavascriptSource(), true);
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
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol68( ) ;
      }
      if ( wbEnd == 68 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_68 = (int)(nGXsfl_68_idx-1) ;
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
         ucGrid1paginationbar.setProperty("CurrentPage", AV18Grid1CurrentPage);
         ucGrid1paginationbar.setProperty("PageCount", AV19Grid1PageCount);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo_____.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV31Pgmname), GXutil.rtrim( localUtil.format( AV31Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV18Grid1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_____.htm");
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 68 )
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

   public void start23G2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precio por Articulo / Tipo Colorante", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup23G0( ) ;
   }

   public void ws23G2( )
   {
      start23G2( ) ;
      evt23G2( ) ;
   }

   public void evt23G2( )
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
                           e1123G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1223G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1323G2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_68_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_682( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV20GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridActionGroup1), 4, 0));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD");
                              GX_FocusControl = edtavTipcolcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV8TipColCod = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavTipcolcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8TipColCod), 2, 0));
                           }
                           else
                           {
                              AV8TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavTipcolcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8TipColCod), 2, 0));
                           }
                           AV15TipColDsc = httpContext.cgiGet( edtavTipcoldsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTipcoldsc_Internalname, AV15TipColDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1423G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1523G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1623G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1723G2 ();
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

   public void we23G2( )
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

   public void pa23G2( )
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
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
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
      subsflControlProps_682( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         sendrow_682( ) ;
         nGXsfl_68_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV5emprcod ,
                                  String A396EmprCod ,
                                  byte A831TipColCod ,
                                  String A832TipColDsc ,
                                  String AV9CliNom ,
                                  String AV10ArtDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1523G2 ();
      GRID1_nCurrentRecord = 0 ;
      rf23G2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLDSC", GXutil.rtrim( AV15TipColDsc));
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
      if ( cmbavArtpredef.getItemCount() > 0 )
      {
         AV28ArtPreDef = cmbavArtpredef.getValidValue(AV28ArtPreDef) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ArtPreDef", AV28ArtPreDef);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavArtpredef.setValue( GXutil.rtrim( AV28ArtPreDef) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Values", cmbavArtpredef.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf23G2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV31Pgmname = "Facturacion.PrecioporArticulo_____" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      edtavArtprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprekgm_Enabled), 5, 0), true);
      edtavArtpremtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtpremtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtpremtr_Enabled), 5, 0), true);
      cmbavArtpredef.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavArtpredef.getEnabled(), 5, 0), true);
      edtavTipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf23G2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(68) ;
      /* Execute user event: Refresh */
      e1523G2 ();
      nGXsfl_68_idx = 1 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
      bGXsfl_68_Refreshing = true ;
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
         subsflControlProps_682( ) ;
         e1623G2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_68_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e1623G2 ();
         }
         wbEnd = (short)(68) ;
         wb23G0( ) ;
      }
      bGXsfl_68_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes23G2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
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
         gxgrgrid1_refresh( subGrid1_Rows, AV5emprcod, A396EmprCod, A831TipColCod, A832TipColDsc, AV9CliNom, AV10ArtDsc) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV5emprcod, A396EmprCod, A831TipColCod, A832TipColDsc, AV9CliNom, AV10ArtDsc) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV5emprcod, A396EmprCod, A831TipColCod, A832TipColDsc, AV9CliNom, AV10ArtDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV5emprcod, A396EmprCod, A831TipColCod, A832TipColDsc, AV9CliNom, AV10ArtDsc) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV5emprcod, A396EmprCod, A831TipColCod, A832TipColDsc, AV9CliNom, AV10ArtDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV31Pgmname = "Facturacion.PrecioporArticulo_____" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      edtavArtprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprekgm_Enabled), 5, 0), true);
      edtavArtpremtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtpremtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtpremtr_Enabled), 5, 0), true);
      cmbavArtpredef.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavArtpredef.getEnabled(), 5, 0), true);
      edtavTipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup23G0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1423G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19Grid1PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Grid1paginationbar_Selectedpage = httpContext.cgiGet( "GRID1PAGINATIONBAR_Selectedpage") ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         AV31Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID1CURRENTPAGE");
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18Grid1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), 10, 0));
         }
         else
         {
            AV18Grid1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), 10, 0));
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
      e1423G2 ();
      if (returnInSub) return;
   }

   public void e1423G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precioporarticulo______impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV5emprcod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      precioporarticulo______impl.this.AV5emprcod = GXv_char2[0] ;
      precioporarticulo______impl.this.AV24EmprNom = GXv_char3[0] ;
      precioporarticulo______impl.this.AV25UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV18Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), 10, 0));
      edtavGrid1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid1currentpage_Visible), 5, 0), true);
      AV19Grid1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Grid1PageCount), 10, 0));
      Grid1paginationbar_Rowsperpageselectedvalue = subGrid1_Rows ;
      ucGrid1paginationbar.sendProperty(context, "", false, Grid1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid1paginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1523G2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int5 = AV21NumeroRegistros ;
      GXv_int6[0] = GXt_int5 ;
      new app.facturacion.registrostipcol(remoteHandle, context).execute( AV5emprcod, GXv_int6) ;
      precioporarticulo______impl.this.GXt_int5 = GXv_int6[0] ;
      AV21NumeroRegistros = GXt_int5 ;
      AV22GridRows = (short)(((subGrid1_Rows==0) ? 1 : subGrid1_Rows)) ;
      AV19Grid1PageCount = (long)((AV21NumeroRegistros/ (double) (AV22GridRows))+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Grid1PageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e1623G2( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Intensidades", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      /* Using cursor H023G2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A832TipColDsc = H023G2_A832TipColDsc[0] ;
         n832TipColDsc = H023G2_n832TipColDsc[0] ;
         A831TipColCod = H023G2_A831TipColCod[0] ;
         A396EmprCod = H023G2_A396EmprCod[0] ;
         AV8TipColCod = A831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTipcolcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8TipColCod), 2, 0));
         AV15TipColDsc = A832TipColDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTipcoldsc_Internalname, AV15TipColDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( AV15TipColDsc, ""))));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(68) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) ) ) )
         {
            sendrow_682( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_68_Refreshing )
         {
            httpContext.doAjaxLoad(68, Grid1Row);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV20GridActionGroup1, 4, 0)) );
   }

   public void e1123G2( )
   {
      /* Grid1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV18Grid1CurrentPage = (long)(AV18Grid1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), 10, 0));
         subgrid1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV18Grid1CurrentPage = (long)(AV18Grid1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), 10, 0));
         subgrid1_nextpage( ) ;
      }
      else
      {
         AV17PageToGo = (int)(GXutil.lval( Grid1paginationbar_Selectedpage)) ;
         AV18Grid1CurrentPage = AV17PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), 10, 0));
         subgrid1_gotopage( AV17PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1223G2( )
   {
      /* Grid1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid1_Rows = Grid1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV18Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Grid1CurrentPage), 10, 0));
      subgrid1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1323G2( )
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

   public void e1723G2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV20GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO INTENSIDADES' */
         S112 ();
         if (returnInSub) return;
      }
      AV20GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV20GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void S112( )
   {
      /* 'DO INTENSIDADES' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV5emprcod ;
      GXv_int7[0] = AV6CliCod ;
      GXv_char3[0] = AV7ArtCod ;
      GXv_int8[0] = AV8TipColCod ;
      new app.facturacion.pcopinti(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int8) ;
      precioporarticulo______impl.this.AV5emprcod = GXv_char4[0] ;
      precioporarticulo______impl.this.AV6CliCod = GXv_int7[0] ;
      precioporarticulo______impl.this.AV7ArtCod = GXv_char3[0] ;
      precioporarticulo______impl.this.AV8TipColCod = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7ArtCod", AV7ArtCod);
      httpContext.ajax_rsp_assign_attri("", false, edtavTipcolcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8TipColCod), 2, 0));
      httpContext.popup(formatLink("app.facturacion.precioporarticulo_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9CliNom)),GXutil.URLEncode(GXutil.rtrim(AV7ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV10ArtDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV8TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV15TipColDsc))}, new String[] {"emprcod","CliCod","CliNom","ArtCod","ArtDsc","TipColCod","TipColDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      AV6CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
      AV7ArtCod = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ArtCod", AV7ArtCod);
      AV9CliNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9CliNom", AV9CliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9CliNom, ""))));
      AV10ArtDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10ArtDsc", AV10ArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ArtDsc, ""))));
      AV26ArtPreKgm = (java.math.BigDecimal)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ArtPreKgm", GXutil.ltrimstr( AV26ArtPreKgm, 13, 5));
      AV27ArtPreMtr = (java.math.BigDecimal)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ArtPreMtr", GXutil.ltrimstr( AV27ArtPreMtr, 13, 5));
      AV28ArtPreDef = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ArtPreDef", AV28ArtPreDef);
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
      pa23G2( ) ;
      ws23G2( ) ;
      we23G2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171420188", true, true);
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
         httpContext.AddJavascriptSource("facturacion/precioporarticulo_____.js", "?20268171420188", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_682( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_68_idx );
      edtavTipcolcod_Internalname = "vTIPCOLCOD_"+sGXsfl_68_idx ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_682( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_68_fel_idx );
      edtavTipcolcod_Internalname = "vTIPCOLCOD_"+sGXsfl_68_fel_idx ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC_"+sGXsfl_68_fel_idx ;
   }

   public void sendrow_682( )
   {
      subsflControlProps_682( ) ;
      wb23G0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_68_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_68_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_68_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV20GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV20GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV20GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_68_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV20GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_68_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTipcolcod_Enabled!=0)&&(edtavTipcolcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipcolcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV8TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV8TipColCod), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavTipcolcod_Enabled!=0)&&(edtavTipcolcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTipcolcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipcolcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTipcoldsc_Enabled!=0)&&(edtavTipcoldsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipcoldsc_Internalname,GXutil.rtrim( AV15TipColDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTipcoldsc_Enabled!=0)&&(edtavTipcoldsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTipcoldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipcoldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes23G2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_68_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      /* End function sendrow_682 */
   }

   public void startgridcontrol68( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"68\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Colorante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV20GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV8TipColCod, (byte)(2), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipcolcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV15TipColDsc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipcoldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavArtdsc_Internalname = "vARTDSC" ;
      edtavArtprekgm_Internalname = "vARTPREKGM" ;
      edtavArtpremtr_Internalname = "vARTPREMTR" ;
      cmbavArtpredef.setInternalname( "vARTPREDEF" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtavTipcolcod_Internalname = "vTIPCOLCOD" ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC" ;
      Grid1paginationbar_Internalname = "GRID1PAGINATIONBAR" ;
      divGrid1tablewithpaginationbar_Internalname = "GRID1TABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGrid1currentpage_Internalname = "vGRID1CURRENTPAGE" ;
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
      edtavTipcoldsc_Jsonclick = "" ;
      edtavTipcoldsc_Visible = -1 ;
      edtavTipcoldsc_Enabled = 1 ;
      edtavTipcolcod_Jsonclick = "" ;
      edtavTipcolcod_Visible = -1 ;
      edtavTipcolcod_Enabled = 1 ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid1_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavGrid1currentpage_Jsonclick = "" ;
      edtavGrid1currentpage_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavArtpredef.setJsonclick( "" );
      cmbavArtpredef.setEnabled( 0 );
      edtavArtpremtr_Jsonclick = "" ;
      edtavArtpremtr_Enabled = 0 ;
      edtavArtprekgm_Jsonclick = "" ;
      edtavArtprekgm_Enabled = 0 ;
      edtavArtdsc_Jsonclick = "" ;
      edtavArtdsc_Enabled = 0 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Precio por Articulo / Tipo Colorante", "") );
      subGrid1_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavArtpredef.setName( "vARTPREDEF" );
      cmbavArtpredef.setWebtags( "" );
      cmbavArtpredef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavArtpredef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavArtpredef.getItemCount() > 0 )
      {
         AV28ArtPreDef = cmbavArtpredef.getValidValue(AV28ArtPreDef) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ArtPreDef", AV28ArtPreDef);
      }
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_68_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV20GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV20GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV9CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV10ArtDsc',fld:'vARTDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV19Grid1PageCount',fld:'vGRID1PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e1623G2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV20GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV8TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE","{handler:'e1123G2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'AV9CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV10ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'Grid1paginationbar_Selectedpage',ctrl:'GRID1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV18Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV18Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19Grid1PageCount',fld:'vGRID1PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1223G2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'AV9CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV10ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'Grid1paginationbar_Rowsperpageselectedvalue',ctrl:'GRID1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV18Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1323G2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e1723G2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV20GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'AV9CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV10ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7ArtCod',fld:'vARTCOD',pic:''},{av:'AV8TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV15TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV20GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV8TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV7ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Grid1PageCount',fld:'vGRID1PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'validv_Tipcoldsc',iparms:[]");
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
      wcpOAV5emprcod = "" ;
      wcpOAV7ArtCod = "" ;
      wcpOAV9CliNom = "" ;
      wcpOAV10ArtDsc = "" ;
      wcpOAV26ArtPreKgm = DecimalUtil.ZERO ;
      wcpOAV27ArtPreMtr = DecimalUtil.ZERO ;
      wcpOAV28ArtPreDef = "" ;
      Grid1paginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5emprcod = "" ;
      AV7ArtCod = "" ;
      AV9CliNom = "" ;
      AV10ArtDsc = "" ;
      AV26ArtPreKgm = DecimalUtil.ZERO ;
      AV27ArtPreMtr = DecimalUtil.ZERO ;
      AV28ArtPreDef = "" ;
      A396EmprCod = "" ;
      A832TipColDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid1paginationbar = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV31Pgmname = "" ;
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15TipColDsc = "" ;
      AV23Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV24EmprNom = "" ;
      AV25UsurCod = "" ;
      GXv_int6 = new short[1] ;
      scmdbuf = "" ;
      H023G2_A832TipColDsc = new String[] {""} ;
      H023G2_n832TipColDsc = new boolean[] {false} ;
      H023G2_A831TipColCod = new byte[1] ;
      H023G2_A396EmprCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo_______default(),
         new Object[] {
             new Object[] {
            H023G2_A832TipColDsc, H023G2_n832TipColDsc, H023G2_A831TipColCod, H023G2_A396EmprCod
            }
         }
      );
      AV31Pgmname = "Facturacion.PrecioporArticulo_____" ;
      /* GeneXus formulas. */
      AV31Pgmname = "Facturacion.PrecioporArticulo_____" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavArtcod_Enabled = 0 ;
      edtavArtdsc_Enabled = 0 ;
      edtavArtprekgm_Enabled = 0 ;
      edtavArtpremtr_Enabled = 0 ;
      cmbavArtpredef.setEnabled( 0 );
      edtavTipcolcod_Enabled = 0 ;
      edtavTipcoldsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV8TipColCod ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte GXv_int8[] ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV20GridActionGroup1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV21NumeroRegistros ;
   private short GXt_int5 ;
   private short GXv_int6[] ;
   private short AV22GridRows ;
   private int wcpOAV6CliCod ;
   private int subGrid1_Rows ;
   private int Grid1paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_68 ;
   private int AV6CliCod ;
   private int nGXsfl_68_idx=1 ;
   private int Grid1paginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavArtdsc_Enabled ;
   private int edtavArtprekgm_Enabled ;
   private int edtavArtpremtr_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavGrid1currentpage_Visible ;
   private int subGrid1_Islastpage ;
   private int edtavTipcolcod_Enabled ;
   private int edtavTipcoldsc_Enabled ;
   private int GRID1_nGridOutOfScope ;
   private int subGrid1_Recordcount ;
   private int AV17PageToGo ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavTipcolcod_Visible ;
   private int edtavTipcoldsc_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV19Grid1PageCount ;
   private long AV18Grid1CurrentPage ;
   private long GRID1_nCurrentRecord ;
   private java.math.BigDecimal wcpOAV26ArtPreKgm ;
   private java.math.BigDecimal wcpOAV27ArtPreMtr ;
   private java.math.BigDecimal AV26ArtPreKgm ;
   private java.math.BigDecimal AV27ArtPreMtr ;
   private String wcpOAV5emprcod ;
   private String wcpOAV7ArtCod ;
   private String wcpOAV9CliNom ;
   private String wcpOAV10ArtDsc ;
   private String wcpOAV28ArtPreDef ;
   private String Grid1paginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5emprcod ;
   private String AV7ArtCod ;
   private String AV9CliNom ;
   private String AV10ArtDsc ;
   private String AV28ArtPreDef ;
   private String sGXsfl_68_idx="0001" ;
   private String A396EmprCod ;
   private String A832TipColDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavArtdsc_Internalname ;
   private String edtavArtdsc_Jsonclick ;
   private String edtavArtprekgm_Internalname ;
   private String edtavArtprekgm_Jsonclick ;
   private String edtavArtpremtr_Internalname ;
   private String edtavArtpremtr_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGrid1tablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String Grid1paginationbar_Internalname ;
   private String divTable_acciones_Internalname ;
   private String TempTags ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV31Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGrid1currentpage_Internalname ;
   private String edtavGrid1currentpage_Jsonclick ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTipcolcod_Internalname ;
   private String AV15TipColDsc ;
   private String edtavTipcoldsc_Internalname ;
   private String AV23Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV24EmprNom ;
   private String AV25UsurCod ;
   private String scmdbuf ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavTipcolcod_Jsonclick ;
   private String edtavTipcoldsc_Jsonclick ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n832TipColDsc ;
   private boolean Grid1paginationbar_Showfirst ;
   private boolean Grid1paginationbar_Showprevious ;
   private boolean Grid1paginationbar_Shownext ;
   private boolean Grid1paginationbar_Showlast ;
   private boolean Grid1paginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGrid1paginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private HTMLChoice cmbavArtpredef ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H023G2_A832TipColDsc ;
   private boolean[] H023G2_n832TipColDsc ;
   private byte[] H023G2_A831TipColCod ;
   private String[] H023G2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class precioporarticulo_______default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H023G2", "SELECT TipColDsc, TipColCod, EmprCod FROM TXPTIPCOL ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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

