package app.ponteway ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testintegration_impl extends GXDataArea
{
   public testintegration_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public testintegration_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testintegration_impl.class ));
   }

   public testintegration_impl( int remoteHandle ,
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
      cmbavGuiaremessalinhaitemdto__unidade = new HTMLChoice();
      cmbavGuiaremessalinhaitemdto__reclamacion = new HTMLChoice();
      cmbavGuiaremessalinhaitemdto__afn = new HTMLChoice();
      chkavGuiaremessalinhaitemdto__selected = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridguiaremessalinhaitemdtos") == 0 )
         {
            gxnrgridguiaremessalinhaitemdtos_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridguiaremessalinhaitemdtos") == 0 )
         {
            gxgrgridguiaremessalinhaitemdtos_refresh_invoke( ) ;
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

   public void gxnrgridguiaremessalinhaitemdtos_newrow_invoke( )
   {
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridguiaremessalinhaitemdtos_newrow( ) ;
      /* End function gxnrGridguiaremessalinhaitemdtos_newrow_invoke */
   }

   public void gxgrgridguiaremessalinhaitemdtos_refresh_invoke( )
   {
      subGridguiaremessalinhaitemdtos_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridguiaremessalinhaitemdtos_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26GuiaRemessaLinhaItemDTO);
      AV17Bearer = httpContext.GetPar( "Bearer") ;
      AV30EmprCod = httpContext.GetPar( "EmprCod") ;
      AV74ArtCod = httpContext.GetPar( "ArtCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridguiaremessalinhaitemdtos_refresh_invoke */
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
      pa2D32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2D32( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ponteway.testintegration", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBEARER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Bearer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74ArtCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Guiaremessalinhaitemdto", AV26GuiaRemessaLinhaItemDTO);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Guiaremessalinhaitemdto", AV26GuiaRemessaLinhaItemDTO);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_70, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDGUIAREMESSALINHAITEMDTOSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV41GridGuiaRemessaLinhaItemDTOsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDGUIAREMESSALINHAITEMDTOSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV42GridGuiaRemessaLinhaItemDTOsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV55DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV55DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGUIAREMESSALINHAITEMDTO__REFERENCIA_DATA", AV54GuiaRemessaLinhaItemDTO__referencia_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGUIAREMESSALINHAITEMDTO__REFERENCIA_DATA", AV54GuiaRemessaLinhaItemDTO__referencia_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGUIAREMESSALINHAITEMDTO", AV26GuiaRemessaLinhaItemDTO);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGUIAREMESSALINHAITEMDTO", AV26GuiaRemessaLinhaItemDTO);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBEARER", AV17Bearer);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBEARER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Bearer, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGUIAREMESSALINHADTO", AV18GuiaRemessaLinhaDTO);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGUIAREMESSALINHADTO", AV18GuiaRemessaLinhaDTO);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV30EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV74ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Class", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridguiaremessalinhaitemdtospaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridguiaremessalinhaitemdtospaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridguiaremessalinhaitemdtospaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridguiaremessalinhaitemdtospaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridguiaremessalinhaitemdtospaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Previous", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Next", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Caption", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIA_Cls", GXutil.rtrim( Combo_guiaremessalinhaitemdto__referencia_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIA_Titlecontrolidtoreplace", GXutil.rtrim( Combo_guiaremessalinhaitemdto__referencia_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIA_Isgriditem", GXutil.booltostr( Combo_guiaremessalinhaitemdto__referencia_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridguiaremessalinhaitemdtos_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridguiaremessalinhaitemdtos_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridguiaremessalinhaitemdtos_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_EMPOWERER_Hascategories", GXutil.booltostr( Gridguiaremessalinhaitemdtos_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridguiaremessalinhaitemdtospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we2D32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2D32( ) ;
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
      return formatLink("app.ponteway.testintegration", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "PonteWay.TestIntegration" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Automática de Malha Armazém", "") ;
   }

   public void wb2D30( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSerie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSerie_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSerie_Internalname, GXutil.ltrim( localUtil.ntoc( AV47serie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSerie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV47serie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV47serie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSerie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSerie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\TestIntegration.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNmrguia_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNmrguia_Internalname, httpContext.getMessage( "Doc Fornecedor", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNmrguia_Internalname, GXutil.ltrim( localUtil.ntoc( AV20NmrGuia, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNmrguia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20NmrGuia), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20NmrGuia), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNmrguia_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNmrguia_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\TestIntegration.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDesde_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDesde_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDesde_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDesde_Internalname, localUtil.format(AV19Desde, "99/99/9999"), localUtil.format( AV19Desde, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDesde_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDesde_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\TestIntegration.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDesde_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDesde_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PonteWay\\TestIntegration.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHasta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHasta_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHasta_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHasta_Internalname, localUtil.format(AV21Hasta, "99/99/9999"), localUtil.format( AV21Hasta, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHasta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHasta_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PonteWay\\TestIntegration.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHasta_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHasta_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PonteWay\\TestIntegration.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\TestIntegration.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimportar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "Importar", ""), bttBtnimportar_Jsonclick, 5, httpContext.getMessage( "Importar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PonteWay\\TestIntegration.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_result_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridguiaremessalinhaitemdtostablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridguiaremessalinhaitemdtosContainer.SetWrapped(nGXWrapped);
         startgridcontrol70( ) ;
      }
      if ( wbEnd == 70 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_70 = (int)(nGXsfl_70_idx-1) ;
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV85GXV1 = nGXsfl_70_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridguiaremessalinhaitemdtosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridguiaremessalinhaitemdtos", GridguiaremessalinhaitemdtosContainer, subGridguiaremessalinhaitemdtos_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridguiaremessalinhaitemdtosContainerData", GridguiaremessalinhaitemdtosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridguiaremessalinhaitemdtosContainerData"+"V", GridguiaremessalinhaitemdtosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridguiaremessalinhaitemdtosContainerData"+"V"+"\" value='"+GridguiaremessalinhaitemdtosContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("Class", Gridguiaremessalinhaitemdtospaginationbar_Class);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("ShowFirst", Gridguiaremessalinhaitemdtospaginationbar_Showfirst);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("ShowPrevious", Gridguiaremessalinhaitemdtospaginationbar_Showprevious);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("ShowNext", Gridguiaremessalinhaitemdtospaginationbar_Shownext);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("ShowLast", Gridguiaremessalinhaitemdtospaginationbar_Showlast);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("PagesToShow", Gridguiaremessalinhaitemdtospaginationbar_Pagestoshow);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("PagingButtonsPosition", Gridguiaremessalinhaitemdtospaginationbar_Pagingbuttonsposition);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("PagingCaptionPosition", Gridguiaremessalinhaitemdtospaginationbar_Pagingcaptionposition);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("EmptyGridClass", Gridguiaremessalinhaitemdtospaginationbar_Emptygridclass);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("RowsPerPageSelector", Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselector);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("RowsPerPageOptions", Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageoptions);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("Previous", Gridguiaremessalinhaitemdtospaginationbar_Previous);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("Next", Gridguiaremessalinhaitemdtospaginationbar_Next);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("Caption", Gridguiaremessalinhaitemdtospaginationbar_Caption);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("EmptyGridCaption", Gridguiaremessalinhaitemdtospaginationbar_Emptygridcaption);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("RowsPerPageCaption", Gridguiaremessalinhaitemdtospaginationbar_Rowsperpagecaption);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("CurrentPage", AV41GridGuiaRemessaLinhaItemDTOsCurrentPage);
         ucGridguiaremessalinhaitemdtospaginationbar.setProperty("PageCount", AV42GridGuiaRemessaLinhaItemDTOsPageCount);
         ucGridguiaremessalinhaitemdtospaginationbar.render(context, "dvelop.dvpaginationbar", Gridguiaremessalinhaitemdtospaginationbar_Internalname, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV111Pgmname), GXutil.rtrim( localUtil.format( AV111Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PonteWay\\TestIntegration.htm");
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
         /* User Defined Control */
         ucCombo_guiaremessalinhaitemdto__referencia.setProperty("Caption", Combo_guiaremessalinhaitemdto__referencia_Caption);
         ucCombo_guiaremessalinhaitemdto__referencia.setProperty("Cls", Combo_guiaremessalinhaitemdto__referencia_Cls);
         ucCombo_guiaremessalinhaitemdto__referencia.setProperty("IsGridItem", Combo_guiaremessalinhaitemdto__referencia_Isgriditem);
         ucCombo_guiaremessalinhaitemdto__referencia.setProperty("DropDownOptionsTitleSettingsIcons", AV55DDO_TitleSettingsIcons);
         ucCombo_guiaremessalinhaitemdto__referencia.setProperty("DropDownOptionsData", AV54GuiaRemessaLinhaItemDTO__referencia_Data);
         ucCombo_guiaremessalinhaitemdto__referencia.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_guiaremessalinhaitemdto__referencia_Internalname, "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIAContainer");
         /* User Defined Control */
         ucGridguiaremessalinhaitemdtos_titlescategories.setProperty("GridTitlesCategories", Gridguiaremessalinhaitemdtos_titlescategories_Gridtitlescategories);
         ucGridguiaremessalinhaitemdtos_titlescategories.render(context, "dvelop.gridtitlescategories", Gridguiaremessalinhaitemdtos_titlescategories_Internalname, "GRIDGUIAREMESSALINHAITEMDTOS_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGridguiaremessalinhaitemdtos_empowerer.setProperty("HasCategories", Gridguiaremessalinhaitemdtos_empowerer_Hascategories);
         ucGridguiaremessalinhaitemdtos_empowerer.render(context, "wwp.gridempowerer", Gridguiaremessalinhaitemdtos_empowerer_Internalname, "GRIDGUIAREMESSALINHAITEMDTOS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 70 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV85GXV1 = nGXsfl_70_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridguiaremessalinhaitemdtosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridguiaremessalinhaitemdtos", GridguiaremessalinhaitemdtosContainer, subGridguiaremessalinhaitemdtos_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridguiaremessalinhaitemdtosContainerData", GridguiaremessalinhaitemdtosContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridguiaremessalinhaitemdtosContainerData"+"V", GridguiaremessalinhaitemdtosContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridguiaremessalinhaitemdtosContainerData"+"V"+"\" value='"+GridguiaremessalinhaitemdtosContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2D32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Automática de Malha Armazém", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2D30( ) ;
   }

   public void ws2D32( )
   {
      start2D32( ) ;
      evt2D32( ) ;
   }

   public void evt2D32( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112D32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122D32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e132D32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPORTAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImportar' */
                           e142D32 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 33), "GRIDGUIAREMESSALINHAITEMDTOS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 38), "GUIAREMESSALINHAITEMDTO__ENTRADA.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 38), "GUIAREMESSALINHAITEMDTO__ENTRADA.CLICK") == 0 ) )
                        {
                           nGXsfl_70_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_702( ) ;
                           AV85GXV1 = (int)(nGXsfl_70_idx+GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage) ;
                           if ( ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && ( AV85GXV1 > 0 ) )
                           {
                              AV26GuiaRemessaLinhaItemDTO.currentItem( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)) );
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
                                 e152D32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e162D32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDGUIAREMESSALINHAITEMDTOS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e172D32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GUIAREMESSALINHAITEMDTO__ENTRADA.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e182D32 ();
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

   public void we2D32( )
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

   public void pa2D32( )
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
            GX_FocusControl = edtavSerie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridguiaremessalinhaitemdtos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_702( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         sendrow_702( ) ;
         nGXsfl_70_idx = ((subGridguiaremessalinhaitemdtos_Islastpage==1)&&(nGXsfl_70_idx+1>subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridguiaremessalinhaitemdtosContainer)) ;
      /* End function gxnrGridguiaremessalinhaitemdtos_newrow */
   }

   public void gxgrgridguiaremessalinhaitemdtos_refresh( int subGridguiaremessalinhaitemdtos_Rows ,
                                                         GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> AV26GuiaRemessaLinhaItemDTO ,
                                                         String AV17Bearer ,
                                                         String AV30EmprCod ,
                                                         String AV74ArtCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e162D32 ();
      GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord = 0 ;
      rf2D32( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridguiaremessalinhaitemdtos_refresh */
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
      rf2D32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV111Pgmname = "PonteWay.TestIntegration" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavGuiaremessalinhaitemdto__linha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__linha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__linha_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__serienmrguia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__serienmrguia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__serienmrguia_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__fecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__fecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__fecha_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codfornecedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codfornecedor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codfornecedor_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__ordemtingimento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codartigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codartigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codartigo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__artigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__artigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__artigo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__lu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__lu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__lu_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__entrada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__entrada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__entrada_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codartigoclientecr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codartigoclienteac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2D32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridguiaremessalinhaitemdtosContainer.ClearRows();
      }
      wbStart = (short)(70) ;
      /* Execute user event: Refresh */
      e162D32 ();
      nGXsfl_70_idx = 1 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_702( ) ;
      bGXsfl_70_Refreshing = true ;
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("GridName", "Gridguiaremessalinhaitemdtos");
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("CmpContext", "");
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("InMasterPage", "false");
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridguiaremessalinhaitemdtosContainer.setPageSize( subgridguiaremessalinhaitemdtos_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_702( ) ;
         e172D32 ();
         if ( ( GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord > 0 ) && ( GRIDGUIAREMESSALINHAITEMDTOS_nGridOutOfScope == 0 ) && ( nGXsfl_70_idx == 1 ) )
         {
            GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord = 0 ;
            GRIDGUIAREMESSALINHAITEMDTOS_nGridOutOfScope = 1 ;
            subgridguiaremessalinhaitemdtos_firstpage( ) ;
            e172D32 ();
         }
         wbEnd = (short)(70) ;
         wb2D30( ) ;
      }
      bGXsfl_70_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2D32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBEARER", AV17Bearer);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBEARER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Bearer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV30EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV74ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74ArtCod, ""))));
   }

   public int subgridguiaremessalinhaitemdtos_fnc_pagecount( )
   {
      GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount = subgridguiaremessalinhaitemdtos_fnc_recordcount( ) ;
      if ( ((int)((GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount) % (subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount/ (double) (subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount/ (double) (subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )))+1) ;
   }

   public int subgridguiaremessalinhaitemdtos_fnc_recordcount( )
   {
      return AV26GuiaRemessaLinhaItemDTO.size() ;
   }

   public int subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )
   {
      if ( subGridguiaremessalinhaitemdtos_Rows > 0 )
      {
         return subGridguiaremessalinhaitemdtos_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridguiaremessalinhaitemdtos_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage/ (double) (subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )))+1) ;
   }

   public short subgridguiaremessalinhaitemdtos_firstpage( )
   {
      GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridguiaremessalinhaitemdtos_nextpage( )
   {
      GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount = subgridguiaremessalinhaitemdtos_fnc_recordcount( ) ;
      if ( ( GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount >= subgridguiaremessalinhaitemdtos_fnc_recordsperpage( ) ) && ( GRIDGUIAREMESSALINHAITEMDTOS_nEOF == 0 ) )
      {
         GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = (long)(GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage+subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridguiaremessalinhaitemdtosContainer.AddObjectProperty("GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage", GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDGUIAREMESSALINHAITEMDTOS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridguiaremessalinhaitemdtos_previouspage( )
   {
      if ( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage >= subgridguiaremessalinhaitemdtos_fnc_recordsperpage( ) )
      {
         GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = (long)(GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage-subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridguiaremessalinhaitemdtos_lastpage( )
   {
      GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount = subgridguiaremessalinhaitemdtos_fnc_recordcount( ) ;
      if ( GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount > subgridguiaremessalinhaitemdtos_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount) % (subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )))) == 0 )
         {
            GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = (long)(GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount-subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = (long)(GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount-((int)((GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount) % (subgridguiaremessalinhaitemdtos_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridguiaremessalinhaitemdtos_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = (long)(subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV111Pgmname = "PonteWay.TestIntegration" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavGuiaremessalinhaitemdto__linha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__linha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__linha_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__serienmrguia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__serienmrguia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__serienmrguia_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__fecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__fecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__fecha_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codfornecedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codfornecedor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codfornecedor_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__ordemtingimento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codartigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codartigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codartigo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__artigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__artigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__artigo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__lu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__lu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__lu_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__entrada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__entrada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__entrada_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codartigoclientecr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiaremessalinhaitemdto__codartigoclienteac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2D30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e152D32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Guiaremessalinhaitemdto"), AV26GuiaRemessaLinhaItemDTO);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV55DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGUIAREMESSALINHAITEMDTO__REFERENCIA_DATA"), AV54GuiaRemessaLinhaItemDTO__referencia_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGUIAREMESSALINHAITEMDTO"), AV26GuiaRemessaLinhaItemDTO);
         /* Read saved values. */
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41GridGuiaRemessaLinhaItemDTOsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDGUIAREMESSALINHAITEMDTOSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV42GridGuiaRemessaLinhaItemDTOsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDGUIAREMESSALINHAITEMDTOSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDGUIAREMESSALINHAITEMDTOS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridguiaremessalinhaitemdtos_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Gridguiaremessalinhaitemdtospaginationbar_Class = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Class") ;
         Gridguiaremessalinhaitemdtospaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Showfirst")) ;
         Gridguiaremessalinhaitemdtospaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Showprevious")) ;
         Gridguiaremessalinhaitemdtospaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Shownext")) ;
         Gridguiaremessalinhaitemdtospaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Showlast")) ;
         Gridguiaremessalinhaitemdtospaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridguiaremessalinhaitemdtospaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridguiaremessalinhaitemdtospaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridguiaremessalinhaitemdtospaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Emptygridclass") ;
         Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridguiaremessalinhaitemdtospaginationbar_Previous = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Previous") ;
         Gridguiaremessalinhaitemdtospaginationbar_Next = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Next") ;
         Gridguiaremessalinhaitemdtospaginationbar_Caption = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Caption") ;
         Gridguiaremessalinhaitemdtospaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Emptygridcaption") ;
         Gridguiaremessalinhaitemdtospaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpagecaption") ;
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
         Combo_guiaremessalinhaitemdto__referencia_Cls = httpContext.cgiGet( "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIA_Cls") ;
         Combo_guiaremessalinhaitemdto__referencia_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIA_Titlecontrolidtoreplace") ;
         Combo_guiaremessalinhaitemdto__referencia_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIA_Isgriditem")) ;
         Gridguiaremessalinhaitemdtos_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOS_TITLESCATEGORIES_Gridinternalname") ;
         Gridguiaremessalinhaitemdtos_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOS_TITLESCATEGORIES_Gridtitlescategories") ;
         Gridguiaremessalinhaitemdtos_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOS_EMPOWERER_Gridinternalname") ;
         Gridguiaremessalinhaitemdtos_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOS_EMPOWERER_Hascategories")) ;
         Gridguiaremessalinhaitemdtospaginationbar_Selectedpage = httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Selectedpage") ;
         Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_70_fel_idx = 0 ;
         while ( nGXsfl_70_fel_idx < nRC_GXsfl_70 )
         {
            nGXsfl_70_fel_idx = ((subGridguiaremessalinhaitemdtos_Islastpage==1)&&(nGXsfl_70_fel_idx+1>subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )) ? 1 : nGXsfl_70_fel_idx+1) ;
            sGXsfl_70_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_702( ) ;
            AV85GXV1 = (int)(nGXsfl_70_fel_idx+GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage) ;
            if ( ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && ( AV85GXV1 > 0 ) )
            {
               AV26GuiaRemessaLinhaItemDTO.currentItem( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)) );
            }
         }
         if ( nGXsfl_70_fel_idx == 0 )
         {
            nGXsfl_70_idx = 1 ;
            sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_702( ) ;
         }
         nGXsfl_70_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSerie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSerie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSERIE");
            GX_FocusControl = edtavSerie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47serie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47serie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47serie), 4, 0));
         }
         else
         {
            AV47serie = (short)(localUtil.ctol( httpContext.cgiGet( edtavSerie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47serie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47serie), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNmrguia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNmrguia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNMRGUIA");
            GX_FocusControl = edtavNmrguia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20NmrGuia = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20NmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20NmrGuia), 10, 0));
         }
         else
         {
            AV20NmrGuia = localUtil.ctol( httpContext.cgiGet( edtavNmrguia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20NmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20NmrGuia), 10, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDesde_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDESDE");
            GX_FocusControl = edtavDesde_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19Desde = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Desde", localUtil.format(AV19Desde, "99/99/9999"));
         }
         else
         {
            AV19Desde = localUtil.ctod( httpContext.cgiGet( edtavDesde_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Desde", localUtil.format(AV19Desde, "99/99/9999"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHasta_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHASTA");
            GX_FocusControl = edtavHasta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Hasta = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Hasta", localUtil.format(AV21Hasta, "99/99/9999"));
         }
         else
         {
            AV21Hasta = localUtil.ctod( httpContext.cgiGet( edtavHasta_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Hasta", localUtil.format(AV21Hasta, "99/99/9999"));
         }
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
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
      e152D32 ();
      if (returnInSub) return;
   }

   public void e152D32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      testintegration_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      GXv_char2[0] = AV30EmprCod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char4[0] = AV32UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      testintegration_impl.this.AV30EmprCod = GXv_char2[0] ;
      testintegration_impl.this.AV31EmprNom = GXv_char3[0] ;
      testintegration_impl.this.AV32UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprCod", AV30EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30EmprCod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV55DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV55DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Combo_guiaremessalinhaitemdto__referencia_Titlecontrolidtoreplace = edtavGuiaremessalinhaitemdto__referencia_Internalname ;
      ucCombo_guiaremessalinhaitemdto__referencia.sendProperty(context, "", false, Combo_guiaremessalinhaitemdto__referencia_Internalname, "TitleControlIdToReplace", Combo_guiaremessalinhaitemdto__referencia_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOGUIAREMESSALINHAITEMDTO__REFERENCIA' */
      S112 ();
      if (returnInSub) return;
      Gridguiaremessalinhaitemdtos_empowerer_Gridinternalname = subGridguiaremessalinhaitemdtos_Internalname ;
      ucGridguiaremessalinhaitemdtos_empowerer.sendProperty(context, "", false, Gridguiaremessalinhaitemdtos_empowerer_Internalname, "GridInternalName", Gridguiaremessalinhaitemdtos_empowerer_Gridinternalname);
      subGridguiaremessalinhaitemdtos_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridguiaremessalinhaitemdtos_titlescategories_Gridinternalname = subGridguiaremessalinhaitemdtos_Internalname ;
      ucGridguiaremessalinhaitemdtos_titlescategories.sendProperty(context, "", false, Gridguiaremessalinhaitemdtos_titlescategories_Internalname, "GridInternalName", Gridguiaremessalinhaitemdtos_titlescategories_Gridinternalname);
      chkavGuiaremessalinhaitemdto__selected.setTitleFormat( (short)(1) );
      chkavGuiaremessalinhaitemdto__selected.setTitle( GXutil.format( "<input name=\"selectAllCheckboxGridGuiaRemessaLinhaItemDTOs\" type=\"checkbox\" value=\"Select All\" onClick=\"WWPSelectAll(this, %1);\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" class=\"AttributeCheckBox\" >", "'GUIAREMESSALINHAITEMDTO__SELECTED'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavGuiaremessalinhaitemdto__selected.getInternalname(), "Title", chkavGuiaremessalinhaitemdto__selected.getTitle(), !bGXsfl_70_Refreshing);
      Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue = subGridguiaremessalinhaitemdtos_Rows ;
      ucGridguiaremessalinhaitemdtospaginationbar.sendProperty(context, "", false, Gridguiaremessalinhaitemdtospaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue), 9, 0));
      /* Execute user subroutine: 'AUTHENTICAROG' */
      S122 ();
      if (returnInSub) return;
      AV17Bearer = AV16WebSession.getValue("t7Lo7sxMP3o=") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Bearer", AV17Bearer);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBEARER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Bearer, ""))));
   }

   public void e162D32( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV41GridGuiaRemessaLinhaItemDTOsCurrentPage = subgridguiaremessalinhaitemdtos_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41GridGuiaRemessaLinhaItemDTOsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridGuiaRemessaLinhaItemDTOsCurrentPage), 10, 0));
      AV42GridGuiaRemessaLinhaItemDTOsPageCount = subgridguiaremessalinhaitemdtos_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42GridGuiaRemessaLinhaItemDTOsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridGuiaRemessaLinhaItemDTOsPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e172D32( )
   {
      /* Gridguiaremessalinhaitemdtos_Load Routine */
      returnInSub = false ;
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV26GuiaRemessaLinhaItemDTO.size() )
      {
         AV26GuiaRemessaLinhaItemDTO.currentItem( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)) );
         AV53grid_CodClient = (int)(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)(AV26GuiaRemessaLinhaItemDTO.currentItem())).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53grid_CodClient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53grid_CodClient), 6, 0));
         AV64grid_Entrada = ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)(AV26GuiaRemessaLinhaItemDTO.currentItem())).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada() ;
         edtavGuiaremessalinhaitemdto__rolos_Titleforecolor = GXutil.getColor( 0, 0, 255) ;
         if ( GXutil.len( AV64grid_Entrada) > 1 )
         {
            chkavGuiaremessalinhaitemdto__selected.setEnabled( 0 );
            edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__fecha_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__codfornecedor_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__linha_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__codartigo_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__artigo_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__rolos_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__quantidade_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__referencia_Enabled = 0 ;
            cmbavGuiaremessalinhaitemdto__unidade.setEnabled( 0 );
            cmbavGuiaremessalinhaitemdto__reclamacion.setEnabled( 0 );
            edtavGuiaremessalinhaitemdto__lote_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__jogo_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__polegadas_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__fio_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__entrada_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled = 0 ;
            cmbavGuiaremessalinhaitemdto__afn.setEnabled( 0 );
            edtavGuiaremessalinhaitemdto__lu_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__tear_Enabled = 0 ;
            edtavGuiaremessalinhaitemdto__localizacao_Enabled = 0 ;
         }
         else
         {
            cmbavGuiaremessalinhaitemdto__afn.setEnabled( 1 );
            cmbavGuiaremessalinhaitemdto__unidade.setEnabled( 1 );
            chkavGuiaremessalinhaitemdto__selected.setEnabled( 1 );
            edtavGuiaremessalinhaitemdto__rolos_Enabled = 1 ;
            cmbavGuiaremessalinhaitemdto__reclamacion.setEnabled( 1 );
            edtavGuiaremessalinhaitemdto__lote_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__jogo_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__polegadas_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__lu_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__fio_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__quantidade_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__referencia_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__tear_Enabled = 1 ;
            edtavGuiaremessalinhaitemdto__localizacao_Enabled = 1 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(70) ;
         }
         if ( ( subGridguiaremessalinhaitemdtos_Islastpage == 1 ) || ( subGridguiaremessalinhaitemdtos_Rows == 0 ) || ( ( GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord >= GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage ) && ( GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord < GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage + subgridguiaremessalinhaitemdtos_fnc_recordsperpage( ) ) ) )
         {
            sendrow_702( ) ;
            GRIDGUIAREMESSALINHAITEMDTOS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord + 1 >= subgridguiaremessalinhaitemdtos_fnc_recordcount( ) )
            {
               GRIDGUIAREMESSALINHAITEMDTOS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDGUIAREMESSALINHAITEMDTOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord = (long)(GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_70_Refreshing )
         {
            httpContext.doAjaxLoad(70, GridguiaremessalinhaitemdtosRow);
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e112D32( )
   {
      /* Gridguiaremessalinhaitemdtospaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridguiaremessalinhaitemdtospaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridguiaremessalinhaitemdtos_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridguiaremessalinhaitemdtospaginationbar_Selectedpage, "Next") == 0 )
      {
         AV23PageToGo = subgridguiaremessalinhaitemdtos_fnc_currentpage( ) ;
         AV23PageToGo = (int)(AV23PageToGo+1) ;
         subgridguiaremessalinhaitemdtos_gotopage( AV23PageToGo) ;
      }
      else
      {
         AV23PageToGo = (int)(GXutil.lval( Gridguiaremessalinhaitemdtospaginationbar_Selectedpage)) ;
         subgridguiaremessalinhaitemdtos_gotopage( AV23PageToGo) ;
      }
   }

   public void e122D32( )
   {
      /* Gridguiaremessalinhaitemdtospaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridguiaremessalinhaitemdtos_Rows = Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDGUIAREMESSALINHAITEMDTOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridguiaremessalinhaitemdtos_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132D32( )
   {
      AV85GXV1 = (int)(nGXsfl_70_idx+GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage) ;
      if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) )
      {
         AV26GuiaRemessaLinhaItemDTO.currentItem( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)) );
      }
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV26GuiaRemessaLinhaItemDTO.clear();
      gx_BV70 = true ;
      AV72isFilter = true ;
      if ( ( ! (0==AV47serie) && (0==AV20NmrGuia) ) || ( (0==AV47serie) && ! (0==AV20NmrGuia) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Para pesquisar por Série, é obrigatório informar também o Número, e vice-versa.", ""));
         AV72isFilter = false ;
      }
      if ( ( ! (0==AV47serie) || ! (0==AV20NmrGuia) ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19Desde)) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Hasta)) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "A pesquisa deve ser efetuada por Série/Número ou por Datas, não podendo combinar ambos os critérios.", ""));
         AV72isFilter = false ;
      }
      if ( ! (0==AV47serie) && ! (0==AV20NmrGuia) && ( AV72isFilter ) )
      {
         /* Execute user subroutine: 'LOADFILTERNMRDOCUMENT' */
         S132 ();
         if (returnInSub) return;
      }
      else
      {
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19Desde)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Hasta)) )
         {
            /* Execute user subroutine: 'LOADFILTERDATE' */
            S142 ();
            if (returnInSub) return;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Informe Série e Número ou Data Início e Data Fim.", ""));
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GuiaRemessaLinhaItemDTO", AV26GuiaRemessaLinhaItemDTO);
      nGXsfl_70_bak_idx = nGXsfl_70_idx ;
      gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      nGXsfl_70_idx = nGXsfl_70_bak_idx ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_702( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18GuiaRemessaLinhaDTO", AV18GuiaRemessaLinhaDTO);
   }

   public void e142D32( )
   {
      AV85GXV1 = (int)(nGXsfl_70_idx+GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage) ;
      if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) )
      {
         AV26GuiaRemessaLinhaItemDTO.currentItem( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)) );
      }
      /* 'DoImportar' Routine */
      returnInSub = false ;
      AV65isOk = false ;
      AV112GXV27 = 1 ;
      while ( AV112GXV27 <= AV26GuiaRemessaLinhaItemDTO.size() )
      {
         AV46GuiaRemessaLinhaItemDTO_Item = (app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV112GXV27));
         if ( AV46GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected() )
         {
            if ( (GXutil.strcmp("", AV46GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade())==0) || (0==AV46GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos()) || (GXutil.strcmp("", AV46GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion())==0) || (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade())==0) || (GXutil.strcmp("", AV46GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia())==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Los campos unidad, reclamación, rollos, cantidad y referencia no pueden estar vacíos.", ""));
               AV65isOk = false ;
            }
            else
            {
               AV65isOk = true ;
            }
         }
         AV112GXV27 = (int)(AV112GXV27+1) ;
      }
      if ( AV65isOk )
      {
         GXv_SdtMessages_Message7[0] = AV12Message;
         new app.ponteway.v1.set_importpontwayintegration(remoteHandle, context).execute( AV26GuiaRemessaLinhaItemDTO, GXv_SdtMessages_Message7) ;
         AV12Message = GXv_SdtMessages_Message7[0] ;
         if ( GXutil.strcmp(AV12Message.getgxTv_SdtMessages_Message_Id(), "200") == 0 )
         {
            httpContext.GX_msglist.addItem(GXutil.format( "%1-%2", AV12Message.getgxTv_SdtMessages_Message_Id(), AV12Message.getgxTv_SdtMessages_Message_Description(), "", "", "", "", "", "", ""));
            AV26GuiaRemessaLinhaItemDTO.clear();
            gx_BV70 = true ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19Desde)) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Hasta)) )
            {
               /* Execute user subroutine: 'LOADFILTERDATE' */
               S142 ();
               if (returnInSub) return;
            }
            else
            {
               /* Execute user subroutine: 'LOADFILTERNMRDOCUMENT' */
               S132 ();
               if (returnInSub) return;
            }
         }
         else
         {
            httpContext.GX_msglist.addItem(GXutil.format( "%1-%2", AV12Message.getgxTv_SdtMessages_Message_Id(), AV12Message.getgxTv_SdtMessages_Message_Description(), "", "", "", "", "", "", ""));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Seleciona al menos una linea para importacion!", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GuiaRemessaLinhaItemDTO", AV26GuiaRemessaLinhaItemDTO);
      nGXsfl_70_bak_idx = nGXsfl_70_idx ;
      gxgrgridguiaremessalinhaitemdtos_refresh( subGridguiaremessalinhaitemdtos_Rows, AV26GuiaRemessaLinhaItemDTO, AV17Bearer, AV30EmprCod, AV74ArtCod) ;
      nGXsfl_70_idx = nGXsfl_70_bak_idx ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_702( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18GuiaRemessaLinhaDTO", AV18GuiaRemessaLinhaDTO);
   }

   public void S112( )
   {
      /* 'LOADCOMBOGUIAREMESSALINHAITEMDTO__REFERENCIA' Routine */
      returnInSub = false ;
      if ( (0==AV53grid_CodClient) )
      {
         AV53grid_CodClient = 320 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53grid_CodClient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53grid_CodClient), 6, 0));
      }
      AV114GXV29 = 1 ;
      GXt_objcol_SdtListValues_Item8 = AV113GXV28 ;
      GXv_objcol_SdtListValues_Item9[0] = GXt_objcol_SdtListValues_Item8 ;
      new app.ponteway.dplistartico(remoteHandle, context).execute( AV30EmprCod, AV53grid_CodClient, AV74ArtCod, GXv_objcol_SdtListValues_Item9) ;
      GXt_objcol_SdtListValues_Item8 = GXv_objcol_SdtListValues_Item9[0] ;
      AV113GXV28 = GXt_objcol_SdtListValues_Item8 ;
      while ( AV114GXV29 <= AV113GXV28.size() )
      {
         AV57GuiaRemessaLinhaItemDTO__referencia_DPItem = (app.ponteway.v1.SdtListValues_Item)((app.ponteway.v1.SdtListValues_Item)AV113GXV28.elementAt(-1+AV114GXV29));
         AV56Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV56Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( AV57GuiaRemessaLinhaItemDTO__referencia_DPItem.getgxTv_SdtListValues_Item_Key() );
         AV56Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( AV57GuiaRemessaLinhaItemDTO__referencia_DPItem.getgxTv_SdtListValues_Item_Value() );
         AV54GuiaRemessaLinhaItemDTO__referencia_Data.add(AV56Combo_DataItem, 0);
         AV114GXV29 = (int)(AV114GXV29+1) ;
      }
      AV54GuiaRemessaLinhaItemDTO__referencia_Data.sort("Title");
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "---------LoadComboGuiaRemessaLinhaItemDTO__referencia-----------", "")) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info("----------------------------------------------------------------") ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV54GuiaRemessaLinhaItemDTO__referencia_Data.toJSonString(false)) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "Grid_CodClient : ", "")+GXutil.trim( GXutil.str( AV53grid_CodClient, 6, 0))) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "OgSerie        : ", "")+GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68ogSerie), "ZZZ9"))) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info("----------------------------------------------------------------") ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "---------LoadComboGuiaRemessaLinhaItemDTO__referencia-----------", "")) ;
   }

   public void e182D32( )
   {
      AV85GXV1 = (int)(nGXsfl_70_idx+GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage) ;
      if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) )
      {
         AV26GuiaRemessaLinhaItemDTO.currentItem( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)) );
      }
      /* Guiaremessalinhaitemdto__entrada_Click Routine */
      returnInSub = false ;
      AV69AlbRecCod = ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)(AV26GuiaRemessaLinhaItemDTO.currentItem())).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada() ;
      AV73link = formatLink("app.almacensindetalle.almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV30EmprCod)),GXutil.URLEncode(DecimalUtil.decToString(CommonUtil.decimalVal( AV69AlbRecCod, ".")))}, new String[] {"Mode","EmprCod","AlbRecCod"})  ;
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV73link,httpContext.getMessage( "_blank", "")});
   }

   public void S132( )
   {
      /* 'LOADFILTERNMRDOCUMENT' Routine */
      returnInSub = false ;
      GXv_SdtMessages_Message7[0] = AV12Message;
      GXv_SdtGuiaRemessaLinhaDTO10[0] = AV18GuiaRemessaLinhaDTO;
      GXv_boolean11[0] = AV10isSuccess ;
      new app.ponteway.v1.getapiv1guiasremessaogserieserienumeroguianumeroguia(remoteHandle, context).execute( AV11ServerUrlTemplatingVar, AV47serie, AV20NmrGuia, AV17Bearer, GXv_SdtMessages_Message7, GXv_SdtGuiaRemessaLinhaDTO10, GXv_boolean11) ;
      AV12Message = GXv_SdtMessages_Message7[0] ;
      AV18GuiaRemessaLinhaDTO = GXv_SdtGuiaRemessaLinhaDTO10[0] ;
      testintegration_impl.this.AV10isSuccess = GXv_boolean11[0] ;
      if ( AV10isSuccess )
      {
         /* Execute user subroutine: 'PROCESSDATA' */
         S152 ();
         if (returnInSub) return;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "%1 - %2", AV12Message.getgxTv_SdtMessages_Message_Id(), AV12Message.getgxTv_SdtMessages_Message_Description(), "", "", "", "", "", "", ""));
      }
   }

   public void S142( )
   {
      /* 'LOADFILTERDATE' Routine */
      returnInSub = false ;
      GXv_SdtMessages_Message7[0] = AV12Message;
      GXv_SdtGuiaRemessaLinhaDTO10[0] = AV18GuiaRemessaLinhaDTO;
      GXv_boolean11[0] = AV10isSuccess ;
      new app.ponteway.v1.getapiv1guiasremessaogdedeateate(remoteHandle, context).execute( AV11ServerUrlTemplatingVar, AV19Desde, AV21Hasta, AV17Bearer, GXv_SdtMessages_Message7, GXv_SdtGuiaRemessaLinhaDTO10, GXv_boolean11) ;
      AV12Message = GXv_SdtMessages_Message7[0] ;
      AV18GuiaRemessaLinhaDTO = GXv_SdtGuiaRemessaLinhaDTO10[0] ;
      testintegration_impl.this.AV10isSuccess = GXv_boolean11[0] ;
      if ( AV10isSuccess )
      {
         /* Execute user subroutine: 'PROCESSDATA' */
         S152 ();
         if (returnInSub) return;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "%1 - %2", AV12Message.getgxTv_SdtMessages_Message_Id(), AV12Message.getgxTv_SdtMessages_Message_Description(), "", "", "", "", "", "", ""));
      }
   }

   public void S152( )
   {
      /* 'PROCESSDATA' Routine */
      returnInSub = false ;
      AV115GXV30 = 1 ;
      while ( AV115GXV30 <= AV18GuiaRemessaLinhaDTO.getgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa().size() )
      {
         AV44GuiaRemessaLinhaDTO_Item = (app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem)((app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem)AV18GuiaRemessaLinhaDTO.getgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa().elementAt(-1+AV115GXV30));
         AV49codCliente = AV44GuiaRemessaLinhaDTO_Item.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Codclienteintegracao() ;
         AV48dataDocumento = GXutil.resetTime( AV44GuiaRemessaLinhaDTO_Item.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Datadocumento()) ;
         AV53grid_CodClient = (int)(GXutil.lval( AV49codCliente)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53grid_CodClient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53grid_CodClient), 6, 0));
         AV67ogNmrGuia = (long)(DecimalUtil.decToDouble(AV44GuiaRemessaLinhaDTO_Item.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Numeroguia())) ;
         AV68ogSerie = (short)(GXutil.lval( AV44GuiaRemessaLinhaDTO_Item.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Serie())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68ogSerie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ogSerie), 4, 0));
         AV66ogLocalDes = AV44GuiaRemessaLinhaDTO_Item.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Localdescarga() ;
         AV63Entrada = "" ;
         AV116GXV31 = 1 ;
         while ( AV116GXV31 <= AV44GuiaRemessaLinhaDTO_Item.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas().size() )
         {
            AV45GuiaRemessaLinhaDTO_Item_linhas = (app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem)((app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem)AV44GuiaRemessaLinhaDTO_Item.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_Linhas().elementAt(-1+AV116GXV31));
            AV46GuiaRemessaLinhaItemDTO_Item = (app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)new app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas(remoteHandle, context);
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia( GXutil.format( "%1/%2", GXutil.trim( GXutil.str( AV68ogSerie, 4, 0)), GXutil.trim( GXutil.str( AV67ogNmrGuia, 10, 0)), "", "", "", "", "", "", "") );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Emprcod( AV30EmprCod );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha( (long)(DecimalUtil.decToDouble(AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Linha())) );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigo() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor( GXutil.lval( AV49codCliente) );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio_anterior( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos_anterior( (short)(DecimalUtil.decToDouble(AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos())) );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade_anterior( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade_anterior( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codunidade() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao_anterior( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Localizacao() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha( AV48dataDocumento );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo( ((GXutil.strcmp("", AV74ArtCod)==0) ? AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Artigo() : AV74ArtCod) );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lote() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Jogo() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Polegadas() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Ordemtingimento() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Vossarequisicao( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Vossarequisicao() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclientecr() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codartigoclienteac() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina( GXutil.trim( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Maquina()) );
            AV80OGLOCALIZAC = "" ;
            AV75ogReferen = "" ;
            AV79ogUniDad = "" ;
            AV78OGQUANT = DecimalUtil.ZERO ;
            AV77OGROLOS = (short)(0) ;
            AV81OGFIO = "" ;
            GXt_char1 = "" ;
            GXv_char4[0] = AV79ogUniDad ;
            GXv_decimal12[0] = AV78OGQUANT ;
            GXv_int13[0] = AV77OGROLOS ;
            GXv_char3[0] = AV80OGLOCALIZAC ;
            GXv_char2[0] = AV81OGFIO ;
            GXv_char14[0] = AV75ogReferen ;
            GXv_char15[0] = GXt_char1 ;
            new app.ponteway.v1.get_importstatus(remoteHandle, context).execute( AV46GuiaRemessaLinhaItemDTO_Item, GXv_char4, GXv_decimal12, GXv_int13, GXv_char3, GXv_char2, GXv_char14, GXv_char15) ;
            testintegration_impl.this.AV79ogUniDad = GXv_char4[0] ;
            testintegration_impl.this.AV78OGQUANT = GXv_decimal12[0] ;
            testintegration_impl.this.AV77OGROLOS = GXv_int13[0] ;
            testintegration_impl.this.AV80OGLOCALIZAC = GXv_char3[0] ;
            testintegration_impl.this.AV81OGFIO = GXv_char2[0] ;
            testintegration_impl.this.AV75ogReferen = GXv_char14[0] ;
            testintegration_impl.this.GXt_char1 = GXv_char15[0] ;
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada( GXt_char1 );
            if ( ! (GXutil.strcmp("", AV75ogReferen)==0) )
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia( AV75ogReferen );
            }
            if ( ! (GXutil.strcmp("", AV79ogUniDad)==0) )
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade( AV79ogUniDad );
            }
            else
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Codunidade() );
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78OGQUANT)==0) )
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade( AV78OGQUANT );
            }
            else
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Quantidade() );
            }
            if ( ! (0==AV77OGROLOS) )
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos( AV77OGROLOS );
            }
            else
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos( (short)(DecimalUtil.decToDouble(AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Rolos())) );
            }
            if ( ! (GXutil.strcmp("", AV80OGLOCALIZAC)==0) )
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao( AV80OGLOCALIZAC );
            }
            else
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Localizacao() );
            }
            if ( ! (GXutil.strcmp("", AV81OGFIO)==0) )
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio( AV81OGFIO );
            }
            else
            {
               AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Fio() );
            }
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Tear() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lfa( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lfa() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Lu() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Relatoriocomposicao() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Nmrgui( AV67ogNmrGuia );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Aberta() );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serie( AV68ogSerie );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localdes( AV66ogLocalDes );
            AV46GuiaRemessaLinhaItemDTO_Item.setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Observacoes( AV45GuiaRemessaLinhaDTO_Item_linhas.getgxTv_SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem_Observacoes() );
            AV26GuiaRemessaLinhaItemDTO.add(AV46GuiaRemessaLinhaItemDTO_Item, 0);
            gx_BV70 = true ;
            AV116GXV31 = (int)(AV116GXV31+1) ;
         }
         AV115GXV30 = (int)(AV115GXV30+1) ;
      }
      AV26GuiaRemessaLinhaItemDTO.sort(httpContext.getMessage( "[SerieNmrGuia],[codFornecedor],linha", ""));
      gx_BV70 = true ;
   }

   public void S122( )
   {
      /* 'AUTHENTICAROG' Routine */
      returnInSub = false ;
      AV7LoginRequest.setgxTv_SdtLoginRequest_Username( "datamon" );
      AV7LoginRequest.setgxTv_SdtLoginRequest_Password( "Datamon#21!" );
      GXv_SdtMessages_Message7[0] = AV12Message;
      GXv_boolean11[0] = AV10isSuccess ;
      new app.ponteway.v1.postapiauthlogin(remoteHandle, context).execute( AV11ServerUrlTemplatingVar, AV7LoginRequest, "", GXv_SdtMessages_Message7, GXv_boolean11) ;
      AV12Message = GXv_SdtMessages_Message7[0] ;
      testintegration_impl.this.AV10isSuccess = GXv_boolean11[0] ;
      if ( AV10isSuccess )
      {
         AV5Log = AV12Message.toJSonString(false, true) ;
      }
      else
      {
         AV5Log = httpContext.getMessage( "Error", "") ;
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
      pa2D32( ) ;
      ws2D32( ) ;
      we2D32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714343388", true, true);
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
      httpContext.AddJavascriptSource("ponteway/testintegration.js", "?202681714343389", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_702( )
   {
      edtavGuiaremessalinhaitemdto__linha_Internalname = "GUIAREMESSALINHAITEMDTO__LINHA_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__serienmrguia_Internalname = "GUIAREMESSALINHAITEMDTO__SERIENMRGUIA_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__fecha_Internalname = "GUIAREMESSALINHAITEMDTO__FECHA_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Internalname = "GUIAREMESSALINHAITEMDTO__CODFORNECEDOR_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Internalname = "GUIAREMESSALINHAITEMDTO__ORDEMTINGIMENTO_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__codartigo_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGO_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__artigo_Internalname = "GUIAREMESSALINHAITEMDTO__ARTIGO_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__referencia_Internalname = "GUIAREMESSALINHAITEMDTO__REFERENCIA_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__rolos_Internalname = "GUIAREMESSALINHAITEMDTO__ROLOS_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__quantidade_Internalname = "GUIAREMESSALINHAITEMDTO__QUANTIDADE_"+sGXsfl_70_idx ;
      cmbavGuiaremessalinhaitemdto__unidade.setInternalname( "GUIAREMESSALINHAITEMDTO__UNIDADE_"+sGXsfl_70_idx );
      cmbavGuiaremessalinhaitemdto__reclamacion.setInternalname( "GUIAREMESSALINHAITEMDTO__RECLAMACION_"+sGXsfl_70_idx );
      edtavGuiaremessalinhaitemdto__lote_Internalname = "GUIAREMESSALINHAITEMDTO__LOTE_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__relatoriocomposicao_Internalname = "GUIAREMESSALINHAITEMDTO__RELATORIOCOMPOSICAO_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__jogo_Internalname = "GUIAREMESSALINHAITEMDTO__JOGO_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__polegadas_Internalname = "GUIAREMESSALINHAITEMDTO__POLEGADAS_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__lu_Internalname = "GUIAREMESSALINHAITEMDTO__LU_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__fio_Internalname = "GUIAREMESSALINHAITEMDTO__FIO_"+sGXsfl_70_idx ;
      cmbavGuiaremessalinhaitemdto__afn.setInternalname( "GUIAREMESSALINHAITEMDTO__AFN_"+sGXsfl_70_idx );
      edtavGuiaremessalinhaitemdto__tear_Internalname = "GUIAREMESSALINHAITEMDTO__TEAR_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__localizacao_Internalname = "GUIAREMESSALINHAITEMDTO__LOCALIZACAO_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__entrada_Internalname = "GUIAREMESSALINHAITEMDTO__ENTRADA_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTECR_"+sGXsfl_70_idx ;
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTEAC_"+sGXsfl_70_idx ;
      chkavGuiaremessalinhaitemdto__selected.setInternalname( "GUIAREMESSALINHAITEMDTO__SELECTED_"+sGXsfl_70_idx );
   }

   public void subsflControlProps_fel_702( )
   {
      edtavGuiaremessalinhaitemdto__linha_Internalname = "GUIAREMESSALINHAITEMDTO__LINHA_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__serienmrguia_Internalname = "GUIAREMESSALINHAITEMDTO__SERIENMRGUIA_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__fecha_Internalname = "GUIAREMESSALINHAITEMDTO__FECHA_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Internalname = "GUIAREMESSALINHAITEMDTO__CODFORNECEDOR_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Internalname = "GUIAREMESSALINHAITEMDTO__ORDEMTINGIMENTO_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__codartigo_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGO_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__artigo_Internalname = "GUIAREMESSALINHAITEMDTO__ARTIGO_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__referencia_Internalname = "GUIAREMESSALINHAITEMDTO__REFERENCIA_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__rolos_Internalname = "GUIAREMESSALINHAITEMDTO__ROLOS_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__quantidade_Internalname = "GUIAREMESSALINHAITEMDTO__QUANTIDADE_"+sGXsfl_70_fel_idx ;
      cmbavGuiaremessalinhaitemdto__unidade.setInternalname( "GUIAREMESSALINHAITEMDTO__UNIDADE_"+sGXsfl_70_fel_idx );
      cmbavGuiaremessalinhaitemdto__reclamacion.setInternalname( "GUIAREMESSALINHAITEMDTO__RECLAMACION_"+sGXsfl_70_fel_idx );
      edtavGuiaremessalinhaitemdto__lote_Internalname = "GUIAREMESSALINHAITEMDTO__LOTE_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__relatoriocomposicao_Internalname = "GUIAREMESSALINHAITEMDTO__RELATORIOCOMPOSICAO_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__jogo_Internalname = "GUIAREMESSALINHAITEMDTO__JOGO_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__polegadas_Internalname = "GUIAREMESSALINHAITEMDTO__POLEGADAS_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__lu_Internalname = "GUIAREMESSALINHAITEMDTO__LU_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__fio_Internalname = "GUIAREMESSALINHAITEMDTO__FIO_"+sGXsfl_70_fel_idx ;
      cmbavGuiaremessalinhaitemdto__afn.setInternalname( "GUIAREMESSALINHAITEMDTO__AFN_"+sGXsfl_70_fel_idx );
      edtavGuiaremessalinhaitemdto__tear_Internalname = "GUIAREMESSALINHAITEMDTO__TEAR_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__localizacao_Internalname = "GUIAREMESSALINHAITEMDTO__LOCALIZACAO_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__entrada_Internalname = "GUIAREMESSALINHAITEMDTO__ENTRADA_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTECR_"+sGXsfl_70_fel_idx ;
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTEAC_"+sGXsfl_70_fel_idx ;
      chkavGuiaremessalinhaitemdto__selected.setInternalname( "GUIAREMESSALINHAITEMDTO__SELECTED_"+sGXsfl_70_fel_idx );
   }

   public void sendrow_702( )
   {
      subsflControlProps_702( ) ;
      wb2D30( ) ;
      if ( ( subGridguiaremessalinhaitemdtos_Rows * 1 == 0 ) || ( nGXsfl_70_idx <= subgridguiaremessalinhaitemdtos_fnc_recordsperpage( ) * 1 ) )
      {
         GridguiaremessalinhaitemdtosRow = GXWebRow.GetNew(context,GridguiaremessalinhaitemdtosContainer) ;
         if ( subGridguiaremessalinhaitemdtos_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridguiaremessalinhaitemdtos_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridguiaremessalinhaitemdtos_Class, "") != 0 )
            {
               subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"Odd" ;
            }
         }
         else if ( subGridguiaremessalinhaitemdtos_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridguiaremessalinhaitemdtos_Backstyle = (byte)(0) ;
            subGridguiaremessalinhaitemdtos_Backcolor = subGridguiaremessalinhaitemdtos_Allbackcolor ;
            if ( GXutil.strcmp(subGridguiaremessalinhaitemdtos_Class, "") != 0 )
            {
               subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"Uniform" ;
            }
         }
         else if ( subGridguiaremessalinhaitemdtos_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridguiaremessalinhaitemdtos_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridguiaremessalinhaitemdtos_Class, "") != 0 )
            {
               subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"Odd" ;
            }
            subGridguiaremessalinhaitemdtos_Backcolor = (int)(0x0) ;
         }
         else if ( subGridguiaremessalinhaitemdtos_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridguiaremessalinhaitemdtos_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
            {
               subGridguiaremessalinhaitemdtos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridguiaremessalinhaitemdtos_Class, "") != 0 )
               {
                  subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"Even" ;
               }
            }
            else
            {
               subGridguiaremessalinhaitemdtos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridguiaremessalinhaitemdtos_Class, "") != 0 )
               {
                  subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"Odd" ;
               }
            }
         }
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_70_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__linha_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__linha_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__linha_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Linha()), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__linha_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__linha_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__linha_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGuiaremessalinhaitemdto__linha_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "AttributeRed" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__serienmrguia_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Serienmrguia(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__serienmrguia_Jsonclick,Integer.valueOf(0),"AttributeRed","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__serienmrguia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__fecha_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__fecha_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__fecha_Internalname,localUtil.format(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha(), "99/99/99"),localUtil.format( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fecha(), "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__fecha_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__fecha_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__fecha_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__fecha_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__codfornecedor_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codfornecedor_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeRed" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__codfornecedor_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codfornecedor()), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__codfornecedor_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codfornecedor_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__codfornecedor_Jsonclick,Integer.valueOf(0),"AttributeRed","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGuiaremessalinhaitemdto__codfornecedor_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__ordemtingimento_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 75,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeRed" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__ordemtingimento_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Ordemtingimento(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__ordemtingimento_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,75);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__ordemtingimento_Jsonclick,Integer.valueOf(0),"AttributeRed","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__codartigo_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codartigo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeRed" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__codartigo_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigo(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__codartigo_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codartigo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,76);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__codartigo_Jsonclick,Integer.valueOf(0),"AttributeRed","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGuiaremessalinhaitemdto__codartigo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__artigo_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__artigo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 77,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeRed" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__artigo_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Artigo(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__artigo_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__artigo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,77);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__artigo_Jsonclick,Integer.valueOf(0),"AttributeRed","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__artigo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__referencia_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__referencia_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__referencia_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__referencia_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__referencia_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,78);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__referencia_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__referencia_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__rolos_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__rolos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__rolos_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos(), (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos()), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__rolos_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__rolos_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__rolos_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__rolos_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__quantidade_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__quantidade_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__quantidade_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade(), "ZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__quantidade_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__quantidade_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__quantidade_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__quantidade_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGuiaremessalinhaitemdto__unidade.getEnabled()!=0)&&(cmbavGuiaremessalinhaitemdto__unidade.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         GXCCtl = "GUIAREMESSALINHAITEMDTO__UNIDADE_" + sGXsfl_70_idx ;
         cmbavGuiaremessalinhaitemdto__unidade.setName( GXCCtl );
         cmbavGuiaremessalinhaitemdto__unidade.setWebtags( "" );
         cmbavGuiaremessalinhaitemdto__unidade.addItem("KG", httpContext.getMessage( "KG", ""), (short)(0));
         cmbavGuiaremessalinhaitemdto__unidade.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
         if ( cmbavGuiaremessalinhaitemdto__unidade.getItemCount() > 0 )
         {
            if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && (GXutil.strcmp("", ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade())==0) )
            {
               ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade( cmbavGuiaremessalinhaitemdto__unidade.getValidValue(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade()) );
            }
         }
         /* ComboBox */
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGuiaremessalinhaitemdto__unidade,cmbavGuiaremessalinhaitemdto__unidade.getInternalname(),GXutil.rtrim( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade()),Integer.valueOf(1),cmbavGuiaremessalinhaitemdto__unidade.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",Integer.valueOf(-1),Integer.valueOf(cmbavGuiaremessalinhaitemdto__unidade.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","AttributeBlue","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGuiaremessalinhaitemdto__unidade.getEnabled()!=0)&&(cmbavGuiaremessalinhaitemdto__unidade.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,81);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGuiaremessalinhaitemdto__unidade.setValue( GXutil.rtrim( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGuiaremessalinhaitemdto__unidade.getInternalname(), "Values", cmbavGuiaremessalinhaitemdto__unidade.ToJavascriptSource(), !bGXsfl_70_Refreshing);
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGuiaremessalinhaitemdto__reclamacion.getEnabled()!=0)&&(cmbavGuiaremessalinhaitemdto__reclamacion.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         GXCCtl = "GUIAREMESSALINHAITEMDTO__RECLAMACION_" + sGXsfl_70_idx ;
         cmbavGuiaremessalinhaitemdto__reclamacion.setName( GXCCtl );
         cmbavGuiaremessalinhaitemdto__reclamacion.setWebtags( "" );
         cmbavGuiaremessalinhaitemdto__reclamacion.addItem("NO", httpContext.getMessage( "No", ""), (short)(0));
         cmbavGuiaremessalinhaitemdto__reclamacion.addItem("SI", httpContext.getMessage( "Si", ""), (short)(0));
         if ( cmbavGuiaremessalinhaitemdto__reclamacion.getItemCount() > 0 )
         {
            if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && (GXutil.strcmp("", ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion())==0) )
            {
               ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion( cmbavGuiaremessalinhaitemdto__reclamacion.getValidValue(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion()) );
            }
         }
         /* ComboBox */
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGuiaremessalinhaitemdto__reclamacion,cmbavGuiaremessalinhaitemdto__reclamacion.getInternalname(),GXutil.rtrim( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion()),Integer.valueOf(1),cmbavGuiaremessalinhaitemdto__reclamacion.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",Integer.valueOf(-1),Integer.valueOf(cmbavGuiaremessalinhaitemdto__reclamacion.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","AttributeBlue","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGuiaremessalinhaitemdto__reclamacion.getEnabled()!=0)&&(cmbavGuiaremessalinhaitemdto__reclamacion.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,82);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGuiaremessalinhaitemdto__reclamacion.setValue( GXutil.rtrim( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGuiaremessalinhaitemdto__reclamacion.getInternalname(), "Values", cmbavGuiaremessalinhaitemdto__reclamacion.ToJavascriptSource(), !bGXsfl_70_Refreshing);
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__lote_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__lote_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__lote_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__lote_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__lote_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,83);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__lote_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__lote_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__relatoriocomposicao_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__relatoriocomposicao_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Relatoriocomposicao(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__relatoriocomposicao_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,84);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__relatoriocomposicao_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__jogo_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__jogo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__jogo_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__jogo_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__jogo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,85);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__jogo_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__jogo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__polegadas_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__polegadas_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 86,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__polegadas_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__polegadas_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__polegadas_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,86);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__polegadas_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__polegadas_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__lu_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__lu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 87,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__lu_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lu(), "ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__lu_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__lu_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__lu_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGuiaremessalinhaitemdto__lu_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__fio_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__fio_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 88,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__fio_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__fio_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__fio_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,88);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__fio_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__fio_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGuiaremessalinhaitemdto__afn.getEnabled()!=0)&&(cmbavGuiaremessalinhaitemdto__afn.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         GXCCtl = "GUIAREMESSALINHAITEMDTO__AFN_" + sGXsfl_70_idx ;
         cmbavGuiaremessalinhaitemdto__afn.setName( GXCCtl );
         cmbavGuiaremessalinhaitemdto__afn.setWebtags( "" );
         cmbavGuiaremessalinhaitemdto__afn.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
         cmbavGuiaremessalinhaitemdto__afn.addItem("A", httpContext.getMessage( "A", ""), (short)(0));
         cmbavGuiaremessalinhaitemdto__afn.addItem("F", httpContext.getMessage( "F", ""), (short)(0));
         if ( cmbavGuiaremessalinhaitemdto__afn.getItemCount() > 0 )
         {
            if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && (GXutil.strcmp("", ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn())==0) )
            {
               ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn( cmbavGuiaremessalinhaitemdto__afn.getValidValue(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn()) );
            }
         }
         /* ComboBox */
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGuiaremessalinhaitemdto__afn,cmbavGuiaremessalinhaitemdto__afn.getInternalname(),GXutil.rtrim( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn()),Integer.valueOf(1),cmbavGuiaremessalinhaitemdto__afn.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbavGuiaremessalinhaitemdto__afn.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","AttributeBlue","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGuiaremessalinhaitemdto__afn.getEnabled()!=0)&&(cmbavGuiaremessalinhaitemdto__afn.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGuiaremessalinhaitemdto__afn.setValue( GXutil.rtrim( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGuiaremessalinhaitemdto__afn.getInternalname(), "Values", cmbavGuiaremessalinhaitemdto__afn.ToJavascriptSource(), !bGXsfl_70_Refreshing);
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__tear_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__tear_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__tear_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Tear(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__tear_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__tear_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,90);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__tear_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__tear_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__localizacao_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__localizacao_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 91,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "AttributeBlue" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__localizacao_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Localizacao(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__localizacao_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__localizacao_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,91);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__localizacao_Jsonclick,Integer.valueOf(0),"AttributeBlue","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__localizacao_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__entrada_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__entrada_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 92,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "Attributeorange" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__entrada_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Entrada(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__entrada_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__entrada_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,92);\"" : " "),"'"+""+"'"+",false,"+"'"+"EGUIAREMESSALINHAITEMDTO__ENTRADA.CLICK."+sGXsfl_70_idx+"'","","","","",edtavGuiaremessalinhaitemdto__entrada_Jsonclick,Integer.valueOf(5),"Attributeorange","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGuiaremessalinhaitemdto__entrada_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codartigoclientecr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__codartigoclientecr_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclientecr(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codartigoclientecr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,93);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__codartigoclientecr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codartigoclienteac_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGuiaremessalinhaitemdto__codartigoclienteac_Internalname,((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Codartigoclienteac(),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled!=0)&&(edtavGuiaremessalinhaitemdto__codartigoclienteac_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,94);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGuiaremessalinhaitemdto__codartigoclienteac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavGuiaremessalinhaitemdto__selected.getEnabled()!=0)&&(chkavGuiaremessalinhaitemdto__selected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "GUIAREMESSALINHAITEMDTO__SELECTED_" + sGXsfl_70_idx ;
         chkavGuiaremessalinhaitemdto__selected.setName( GXCCtl );
         chkavGuiaremessalinhaitemdto__selected.setWebtags( "" );
         chkavGuiaremessalinhaitemdto__selected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavGuiaremessalinhaitemdto__selected.getInternalname(), "TitleCaption", chkavGuiaremessalinhaitemdto__selected.getCaption(), !bGXsfl_70_Refreshing);
         chkavGuiaremessalinhaitemdto__selected.setCheckedValue( "false" );
         GridguiaremessalinhaitemdtosRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavGuiaremessalinhaitemdto__selected.getInternalname(),GXutil.booltostr( ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected()),"","",Integer.valueOf(-1),Integer.valueOf(chkavGuiaremessalinhaitemdto__selected.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(95, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavGuiaremessalinhaitemdto__selected.getEnabled()!=0)&&(chkavGuiaremessalinhaitemdto__selected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,95);\"" : " ")});
         send_integrity_lvl_hashes2D32( ) ;
         GridguiaremessalinhaitemdtosContainer.AddRow(GridguiaremessalinhaitemdtosRow);
         nGXsfl_70_idx = ((subGridguiaremessalinhaitemdtos_Islastpage==1)&&(nGXsfl_70_idx+1>subgridguiaremessalinhaitemdtos_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      /* End function sendrow_702 */
   }

   public void startgridcontrol70( )
   {
      if ( GridguiaremessalinhaitemdtosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridguiaremessalinhaitemdtosContainer"+"DivS\" data-gxgridid=\"70\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridguiaremessalinhaitemdtos_Internalname, subGridguiaremessalinhaitemdtos_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridguiaremessalinhaitemdtos_Backcolorstyle == 0 )
         {
            subGridguiaremessalinhaitemdtos_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridguiaremessalinhaitemdtos_Class) > 0 )
            {
               subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"Title" ;
            }
         }
         else
         {
            subGridguiaremessalinhaitemdtos_Titlebackstyle = (byte)(1) ;
            if ( subGridguiaremessalinhaitemdtos_Backcolorstyle == 1 )
            {
               subGridguiaremessalinhaitemdtos_Titlebackcolor = subGridguiaremessalinhaitemdtos_Allbackcolor ;
               if ( GXutil.len( subGridguiaremessalinhaitemdtos_Class) > 0 )
               {
                  subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridguiaremessalinhaitemdtos_Class) > 0 )
               {
                  subGridguiaremessalinhaitemdtos_Linesclass = subGridguiaremessalinhaitemdtos_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeRed"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Doc. For", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeRed"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prov.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeRed"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enc.Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeRed"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Malla Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeRed"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Moda21", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+"color:"+WebUtils.getHTMLColor( edtavGuiaremessalinhaitemdto__rolos_Titleforecolor)+";"+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rolos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quant", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unid.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Recla.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rel. Comp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Juego", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pol", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lu", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Abr.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeBlue"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Loc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attributeorange"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "cod Artigo Cliente CR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "cod Artigo Cliente AC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavGuiaremessalinhaitemdto__selected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavGuiaremessalinhaitemdto__selected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavGuiaremessalinhaitemdto__selected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("GridName", "Gridguiaremessalinhaitemdtos");
      }
      else
      {
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("GridName", "Gridguiaremessalinhaitemdtos");
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Header", subGridguiaremessalinhaitemdtos_Header);
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("CmpContext", "");
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("InMasterPage", "false");
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__linha_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__serienmrguia_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__fecha_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__codfornecedor_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__codartigo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__artigo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__referencia_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Titleforecolor", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__rolos_Titleforecolor, (byte)(9), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__rolos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__quantidade_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavGuiaremessalinhaitemdto__unidade.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavGuiaremessalinhaitemdto__reclamacion.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__lote_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__jogo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__polegadas_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__lu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__fio_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavGuiaremessalinhaitemdto__afn.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__tear_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__localizacao_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__entrada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Title", GXutil.rtrim( chkavGuiaremessalinhaitemdto__selected.getTitle()));
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavGuiaremessalinhaitemdto__selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavGuiaremessalinhaitemdto__selected.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddColumnProperties(GridguiaremessalinhaitemdtosColumn);
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridguiaremessalinhaitemdtosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridguiaremessalinhaitemdtos_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavSerie_Internalname = "vSERIE" ;
      edtavNmrguia_Internalname = "vNMRGUIA" ;
      edtavDesde_Internalname = "vDESDE" ;
      edtavHasta_Internalname = "vHASTA" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTable_filters_Internalname = "TABLE_FILTERS" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnimportar_Internalname = "BTNIMPORTAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      edtavGuiaremessalinhaitemdto__linha_Internalname = "GUIAREMESSALINHAITEMDTO__LINHA" ;
      edtavGuiaremessalinhaitemdto__serienmrguia_Internalname = "GUIAREMESSALINHAITEMDTO__SERIENMRGUIA" ;
      edtavGuiaremessalinhaitemdto__fecha_Internalname = "GUIAREMESSALINHAITEMDTO__FECHA" ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Internalname = "GUIAREMESSALINHAITEMDTO__CODFORNECEDOR" ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Internalname = "GUIAREMESSALINHAITEMDTO__ORDEMTINGIMENTO" ;
      edtavGuiaremessalinhaitemdto__codartigo_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGO" ;
      edtavGuiaremessalinhaitemdto__artigo_Internalname = "GUIAREMESSALINHAITEMDTO__ARTIGO" ;
      edtavGuiaremessalinhaitemdto__referencia_Internalname = "GUIAREMESSALINHAITEMDTO__REFERENCIA" ;
      edtavGuiaremessalinhaitemdto__rolos_Internalname = "GUIAREMESSALINHAITEMDTO__ROLOS" ;
      edtavGuiaremessalinhaitemdto__quantidade_Internalname = "GUIAREMESSALINHAITEMDTO__QUANTIDADE" ;
      cmbavGuiaremessalinhaitemdto__unidade.setInternalname( "GUIAREMESSALINHAITEMDTO__UNIDADE" );
      cmbavGuiaremessalinhaitemdto__reclamacion.setInternalname( "GUIAREMESSALINHAITEMDTO__RECLAMACION" );
      edtavGuiaremessalinhaitemdto__lote_Internalname = "GUIAREMESSALINHAITEMDTO__LOTE" ;
      edtavGuiaremessalinhaitemdto__relatoriocomposicao_Internalname = "GUIAREMESSALINHAITEMDTO__RELATORIOCOMPOSICAO" ;
      edtavGuiaremessalinhaitemdto__jogo_Internalname = "GUIAREMESSALINHAITEMDTO__JOGO" ;
      edtavGuiaremessalinhaitemdto__polegadas_Internalname = "GUIAREMESSALINHAITEMDTO__POLEGADAS" ;
      edtavGuiaremessalinhaitemdto__lu_Internalname = "GUIAREMESSALINHAITEMDTO__LU" ;
      edtavGuiaremessalinhaitemdto__fio_Internalname = "GUIAREMESSALINHAITEMDTO__FIO" ;
      cmbavGuiaremessalinhaitemdto__afn.setInternalname( "GUIAREMESSALINHAITEMDTO__AFN" );
      edtavGuiaremessalinhaitemdto__tear_Internalname = "GUIAREMESSALINHAITEMDTO__TEAR" ;
      edtavGuiaremessalinhaitemdto__localizacao_Internalname = "GUIAREMESSALINHAITEMDTO__LOCALIZACAO" ;
      edtavGuiaremessalinhaitemdto__entrada_Internalname = "GUIAREMESSALINHAITEMDTO__ENTRADA" ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTECR" ;
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Internalname = "GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTEAC" ;
      chkavGuiaremessalinhaitemdto__selected.setInternalname( "GUIAREMESSALINHAITEMDTO__SELECTED" );
      Gridguiaremessalinhaitemdtospaginationbar_Internalname = "GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR" ;
      divGridguiaremessalinhaitemdtostablewithpaginationbar_Internalname = "GRIDGUIAREMESSALINHAITEMDTOSTABLEWITHPAGINATIONBAR" ;
      divTable_result_Internalname = "TABLE_RESULT" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_guiaremessalinhaitemdto__referencia_Internalname = "COMBO_GUIAREMESSALINHAITEMDTO__REFERENCIA" ;
      Gridguiaremessalinhaitemdtos_titlescategories_Internalname = "GRIDGUIAREMESSALINHAITEMDTOS_TITLESCATEGORIES" ;
      Gridguiaremessalinhaitemdtos_empowerer_Internalname = "GRIDGUIAREMESSALINHAITEMDTOS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridguiaremessalinhaitemdtos_Internalname = "GRIDGUIAREMESSALINHAITEMDTOS" ;
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
      subGridguiaremessalinhaitemdtos_Allowcollapsing = (byte)(0) ;
      subGridguiaremessalinhaitemdtos_Allowselection = (byte)(0) ;
      subGridguiaremessalinhaitemdtos_Header = "" ;
      chkavGuiaremessalinhaitemdto__selected.setTitleFormat( (short)(0) );
      chkavGuiaremessalinhaitemdto__selected.setTitle( httpContext.getMessage( "Imp", "") );
      edtavGuiaremessalinhaitemdto__rolos_Titleforecolor = (int)(0x000000) ;
      chkavGuiaremessalinhaitemdto__selected.setCaption( "" );
      chkavGuiaremessalinhaitemdto__selected.setVisible( -1 );
      chkavGuiaremessalinhaitemdto__selected.setEnabled( 1 );
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Visible = 0 ;
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Visible = 0 ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__entrada_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__entrada_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__entrada_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__localizacao_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__localizacao_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__localizacao_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__tear_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__tear_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__tear_Enabled = 1 ;
      cmbavGuiaremessalinhaitemdto__afn.setJsonclick( "" );
      cmbavGuiaremessalinhaitemdto__afn.setVisible( -1 );
      cmbavGuiaremessalinhaitemdto__afn.setEnabled( 1 );
      edtavGuiaremessalinhaitemdto__fio_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__fio_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__fio_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__lu_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__lu_Visible = 0 ;
      edtavGuiaremessalinhaitemdto__lu_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__polegadas_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__polegadas_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__polegadas_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__jogo_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__jogo_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__jogo_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__relatoriocomposicao_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__relatoriocomposicao_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__lote_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__lote_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__lote_Enabled = 1 ;
      cmbavGuiaremessalinhaitemdto__reclamacion.setJsonclick( "" );
      cmbavGuiaremessalinhaitemdto__reclamacion.setVisible( -1 );
      cmbavGuiaremessalinhaitemdto__reclamacion.setEnabled( 1 );
      cmbavGuiaremessalinhaitemdto__unidade.setJsonclick( "" );
      cmbavGuiaremessalinhaitemdto__unidade.setVisible( -1 );
      cmbavGuiaremessalinhaitemdto__unidade.setEnabled( 1 );
      edtavGuiaremessalinhaitemdto__quantidade_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__quantidade_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__quantidade_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__rolos_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__rolos_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__rolos_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__referencia_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__referencia_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__referencia_Enabled = 1 ;
      edtavGuiaremessalinhaitemdto__artigo_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__artigo_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__artigo_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__codartigo_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__codartigo_Visible = 0 ;
      edtavGuiaremessalinhaitemdto__codartigo_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Visible = 0 ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__fecha_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__fecha_Visible = -1 ;
      edtavGuiaremessalinhaitemdto__fecha_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__serienmrguia_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__serienmrguia_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__linha_Jsonclick = "" ;
      edtavGuiaremessalinhaitemdto__linha_Visible = 0 ;
      edtavGuiaremessalinhaitemdto__linha_Enabled = 0 ;
      subGridguiaremessalinhaitemdtos_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridguiaremessalinhaitemdtos_Backcolorstyle = (byte)(0) ;
      chkavGuiaremessalinhaitemdto__selected.setTitle( httpContext.getMessage( "Imp", "") );
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__entrada_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__lu_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__artigo_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__codartigo_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__fecha_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__serienmrguia_Enabled = -1 ;
      edtavGuiaremessalinhaitemdto__linha_Enabled = -1 ;
      Combo_guiaremessalinhaitemdto__referencia_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavHasta_Jsonclick = "" ;
      edtavHasta_Enabled = 1 ;
      edtavDesde_Jsonclick = "" ;
      edtavDesde_Enabled = 1 ;
      edtavNmrguia_Jsonclick = "" ;
      edtavNmrguia_Enabled = 1 ;
      edtavSerie_Jsonclick = "" ;
      edtavSerie_Enabled = 1 ;
      Gridguiaremessalinhaitemdtos_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Gridguiaremessalinhaitemdtos_titlescategories_Gridtitlescategories = ";;;;Referencia;Referencia;Referencia;Referencia;;;;;;Referencia;;;;;;;;;;;" ;
      Combo_guiaremessalinhaitemdto__referencia_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_guiaremessalinhaitemdto__referencia_Titlecontrolidtoreplace = "" ;
      Combo_guiaremessalinhaitemdto__referencia_Cls = "ExtendedCombo" ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Gridguiaremessalinhaitemdtospaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridguiaremessalinhaitemdtospaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridguiaremessalinhaitemdtospaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridguiaremessalinhaitemdtospaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridguiaremessalinhaitemdtospaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridguiaremessalinhaitemdtospaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridguiaremessalinhaitemdtospaginationbar_Pagingcaptionposition = "Left" ;
      Gridguiaremessalinhaitemdtospaginationbar_Pagingbuttonsposition = "Right" ;
      Gridguiaremessalinhaitemdtospaginationbar_Pagestoshow = 5 ;
      Gridguiaremessalinhaitemdtospaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridguiaremessalinhaitemdtospaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridguiaremessalinhaitemdtospaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridguiaremessalinhaitemdtospaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridguiaremessalinhaitemdtospaginationbar_Class = "PaginationBar" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Entrada Automática de Malha Armazém", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entrada Automática de Malha Armazém", "") );
      subGridguiaremessalinhaitemdtos_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "GUIAREMESSALINHAITEMDTO__UNIDADE_" + sGXsfl_70_idx ;
      cmbavGuiaremessalinhaitemdto__unidade.setName( GXCCtl );
      cmbavGuiaremessalinhaitemdto__unidade.setWebtags( "" );
      cmbavGuiaremessalinhaitemdto__unidade.addItem("KG", httpContext.getMessage( "KG", ""), (short)(0));
      cmbavGuiaremessalinhaitemdto__unidade.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbavGuiaremessalinhaitemdto__unidade.getItemCount() > 0 )
      {
         if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && (GXutil.strcmp("", ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade())==0) )
         {
            ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade( cmbavGuiaremessalinhaitemdto__unidade.getValidValue(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade()) );
         }
      }
      GXCCtl = "GUIAREMESSALINHAITEMDTO__RECLAMACION_" + sGXsfl_70_idx ;
      cmbavGuiaremessalinhaitemdto__reclamacion.setName( GXCCtl );
      cmbavGuiaremessalinhaitemdto__reclamacion.setWebtags( "" );
      cmbavGuiaremessalinhaitemdto__reclamacion.addItem("NO", httpContext.getMessage( "No", ""), (short)(0));
      cmbavGuiaremessalinhaitemdto__reclamacion.addItem("SI", httpContext.getMessage( "Si", ""), (short)(0));
      if ( cmbavGuiaremessalinhaitemdto__reclamacion.getItemCount() > 0 )
      {
         if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && (GXutil.strcmp("", ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion())==0) )
         {
            ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion( cmbavGuiaremessalinhaitemdto__reclamacion.getValidValue(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion()) );
         }
      }
      GXCCtl = "GUIAREMESSALINHAITEMDTO__AFN_" + sGXsfl_70_idx ;
      cmbavGuiaremessalinhaitemdto__afn.setName( GXCCtl );
      cmbavGuiaremessalinhaitemdto__afn.setWebtags( "" );
      cmbavGuiaremessalinhaitemdto__afn.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavGuiaremessalinhaitemdto__afn.addItem("A", httpContext.getMessage( "A", ""), (short)(0));
      cmbavGuiaremessalinhaitemdto__afn.addItem("F", httpContext.getMessage( "F", ""), (short)(0));
      if ( cmbavGuiaremessalinhaitemdto__afn.getItemCount() > 0 )
      {
         if ( ( AV85GXV1 > 0 ) && ( AV26GuiaRemessaLinhaItemDTO.size() >= AV85GXV1 ) && (GXutil.strcmp("", ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn())==0) )
         {
            ((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).setgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn( cmbavGuiaremessalinhaitemdto__afn.getValidValue(((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV26GuiaRemessaLinhaItemDTO.elementAt(-1+AV85GXV1)).getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Afn()) );
         }
      }
      GXCCtl = "GUIAREMESSALINHAITEMDTO__SELECTED_" + sGXsfl_70_idx ;
      chkavGuiaremessalinhaitemdto__selected.setName( GXCCtl );
      chkavGuiaremessalinhaitemdto__selected.setWebtags( "" );
      chkavGuiaremessalinhaitemdto__selected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavGuiaremessalinhaitemdto__selected.getInternalname(), "TitleCaption", chkavGuiaremessalinhaitemdto__selected.getCaption(), !bGXsfl_70_Refreshing);
      chkavGuiaremessalinhaitemdto__selected.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nEOF'},{av:'subGridguiaremessalinhaitemdtos_Rows',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'Rows'},{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'AV17Bearer',fld:'vBEARER',pic:'',hsh:true},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV74ArtCod',fld:'vARTCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41GridGuiaRemessaLinhaItemDTOsCurrentPage',fld:'vGRIDGUIAREMESSALINHAITEMDTOSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridGuiaRemessaLinhaItemDTOsPageCount',fld:'vGRIDGUIAREMESSALINHAITEMDTOSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDGUIAREMESSALINHAITEMDTOS.LOAD","{handler:'e172D32',iparms:[{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70}]");
      setEventMetadata("GRIDGUIAREMESSALINHAITEMDTOS.LOAD",",oparms:[{av:'AV53grid_CodClient',fld:'vGRID_CODCLIENT',pic:'ZZZZZ9'},{ctrl:'GUIAREMESSALINHAITEMDTO__ROLOS',prop:'Titleforecolor'},{ctrl:'GUIAREMESSALINHAITEMDTO__ORDEMTINGIMENTO',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__FECHA',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__CODFORNECEDOR',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__LINHA',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__CODARTIGO',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__ARTIGO',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__ENTRADA',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTECR',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__CODARTIGOCLIENTEAC',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__SELECTED',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__ROLOS',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__QUANTIDADE',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__REFERENCIA',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__UNIDADE',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__RECLAMACION',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__LOTE',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__JOGO',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__POLEGADAS',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__FIO',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__AFN',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__LU',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__RELATORIOCOMPOSICAO',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__TEAR',prop:'Enabled'},{ctrl:'GUIAREMESSALINHAITEMDTO__LOCALIZACAO',prop:'Enabled'}]}");
      setEventMetadata("GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR.CHANGEPAGE","{handler:'e112D32',iparms:[{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nEOF'},{av:'subGridguiaremessalinhaitemdtos_Rows',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'Rows'},{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'AV17Bearer',fld:'vBEARER',pic:'',hsh:true},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV74ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'Gridguiaremessalinhaitemdtospaginationbar_Selectedpage',ctrl:'GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122D32',iparms:[{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nEOF'},{av:'subGridguiaremessalinhaitemdtos_Rows',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'Rows'},{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'AV17Bearer',fld:'vBEARER',pic:'',hsh:true},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV74ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDGUIAREMESSALINHAITEMDTOSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridguiaremessalinhaitemdtos_Rows',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'Rows'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e132D32',iparms:[{av:'AV47serie',fld:'vSERIE',pic:'ZZZ9'},{av:'AV20NmrGuia',fld:'vNMRGUIA',pic:'ZZZZZZZZZ9'},{av:'AV19Desde',fld:'vDESDE',pic:''},{av:'AV21Hasta',fld:'vHASTA',pic:''},{av:'AV17Bearer',fld:'vBEARER',pic:'',hsh:true},{av:'AV18GuiaRemessaLinhaDTO',fld:'vGUIAREMESSALINHADTO',pic:''},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV74ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nEOF'},{av:'subGridguiaremessalinhaitemdtos_Rows',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'Rows'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'AV18GuiaRemessaLinhaDTO',fld:'vGUIAREMESSALINHADTO',pic:''},{av:'AV53grid_CodClient',fld:'vGRID_CODCLIENT',pic:'ZZZZZ9'},{av:'AV68ogSerie',fld:'vOGSERIE',pic:'ZZZ9'}]}");
      setEventMetadata("'DOIMPORTAR'","{handler:'e142D32',iparms:[{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'AV19Desde',fld:'vDESDE',pic:''},{av:'AV21Hasta',fld:'vHASTA',pic:''},{av:'AV17Bearer',fld:'vBEARER',pic:'',hsh:true},{av:'AV47serie',fld:'vSERIE',pic:'ZZZ9'},{av:'AV20NmrGuia',fld:'vNMRGUIA',pic:'ZZZZZZZZZ9'},{av:'AV18GuiaRemessaLinhaDTO',fld:'vGUIAREMESSALINHADTO',pic:''},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV74ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nEOF'},{av:'subGridguiaremessalinhaitemdtos_Rows',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'Rows'}]");
      setEventMetadata("'DOIMPORTAR'",",oparms:[{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'AV18GuiaRemessaLinhaDTO',fld:'vGUIAREMESSALINHADTO',pic:''},{av:'AV53grid_CodClient',fld:'vGRID_CODCLIENT',pic:'ZZZZZ9'},{av:'AV68ogSerie',fld:'vOGSERIE',pic:'ZZZ9'}]}");
      setEventMetadata("GUIAREMESSALINHAITEMDTO__ENTRADA.CLICK","{handler:'e182D32',iparms:[{av:'AV26GuiaRemessaLinhaItemDTO',fld:'vGUIAREMESSALINHAITEMDTO',grid:70,pic:''},{av:'nGXsfl_70_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:70},{av:'GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage'},{av:'nRC_GXsfl_70',ctrl:'GRIDGUIAREMESSALINHAITEMDTOS',prop:'GridRC',grid:70},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GUIAREMESSALINHAITEMDTO__ENTRADA.CLICK",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv26',iparms:[]");
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
      Gridguiaremessalinhaitemdtospaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV26GuiaRemessaLinhaItemDTO = new GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas>(app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas.class, "linhas", "TexplusNET", remoteHandle);
      AV17Bearer = "" ;
      AV30EmprCod = "" ;
      AV74ArtCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV55DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV54GuiaRemessaLinhaItemDTO__referencia_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18GuiaRemessaLinhaDTO = new app.ponteway.v1.SdtGuiaRemessaLinhaDTO(remoteHandle, context);
      Gridguiaremessalinhaitemdtos_titlescategories_Gridinternalname = "" ;
      Gridguiaremessalinhaitemdtos_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV19Desde = GXutil.nullDate() ;
      AV21Hasta = GXutil.nullDate() ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnimportar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      GridguiaremessalinhaitemdtosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridguiaremessalinhaitemdtospaginationbar = new com.genexus.webpanels.GXUserControl();
      AV111Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_guiaremessalinhaitemdto__referencia = new com.genexus.webpanels.GXUserControl();
      ucGridguiaremessalinhaitemdtos_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGridguiaremessalinhaitemdtos_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV29Station = "" ;
      AV31EmprNom = "" ;
      AV32UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV16WebSession = httpContext.getWebSession();
      AV64grid_Entrada = "" ;
      GridguiaremessalinhaitemdtosRow = new com.genexus.webpanels.GXWebRow();
      AV46GuiaRemessaLinhaItemDTO_Item = new app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas(remoteHandle, context);
      AV12Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV113GXV28 = new GXBaseCollection<app.ponteway.v1.SdtListValues_Item>(app.ponteway.v1.SdtListValues_Item.class, "Item", "TexplusNET", remoteHandle);
      GXt_objcol_SdtListValues_Item8 = new GXBaseCollection<app.ponteway.v1.SdtListValues_Item>(app.ponteway.v1.SdtListValues_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtListValues_Item9 = new GXBaseCollection[1] ;
      AV57GuiaRemessaLinhaItemDTO__referencia_DPItem = new app.ponteway.v1.SdtListValues_Item(remoteHandle, context);
      AV56Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV69AlbRecCod = "" ;
      AV73link = "" ;
      AV11ServerUrlTemplatingVar = new com.genexus.util.GXProperties();
      GXv_SdtGuiaRemessaLinhaDTO10 = new app.ponteway.v1.SdtGuiaRemessaLinhaDTO[1] ;
      AV44GuiaRemessaLinhaDTO_Item = new app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem(remoteHandle, context);
      AV49codCliente = "" ;
      AV48dataDocumento = GXutil.nullDate() ;
      AV66ogLocalDes = "" ;
      AV63Entrada = "" ;
      AV45GuiaRemessaLinhaDTO_Item_linhas = new app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem(remoteHandle, context);
      AV80OGLOCALIZAC = "" ;
      AV75ogReferen = "" ;
      AV79ogUniDad = "" ;
      AV78OGQUANT = DecimalUtil.ZERO ;
      AV81OGFIO = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      AV7LoginRequest = new app.ponteway.v1.SdtLoginRequest(remoteHandle, context);
      GXv_SdtMessages_Message7 = new com.genexus.SdtMessages_Message[1] ;
      GXv_boolean11 = new boolean[1] ;
      AV5Log = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridguiaremessalinhaitemdtos_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridguiaremessalinhaitemdtosColumn = new com.genexus.webpanels.GXWebColumn();
      AV111Pgmname = "PonteWay.TestIntegration" ;
      /* GeneXus formulas. */
      AV111Pgmname = "PonteWay.TestIntegration" ;
      Gx_err = (short)(0) ;
      edtavGuiaremessalinhaitemdto__linha_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__serienmrguia_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__fecha_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__codfornecedor_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__codartigo_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__artigo_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__lu_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__entrada_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled = 0 ;
      edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRIDGUIAREMESSALINHAITEMDTOS_nEOF ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridguiaremessalinhaitemdtos_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridguiaremessalinhaitemdtos_Backstyle ;
   private byte subGridguiaremessalinhaitemdtos_Titlebackstyle ;
   private byte subGridguiaremessalinhaitemdtos_Allowselection ;
   private byte subGridguiaremessalinhaitemdtos_Allowhovering ;
   private byte subGridguiaremessalinhaitemdtos_Allowcollapsing ;
   private byte subGridguiaremessalinhaitemdtos_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short AV47serie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68ogSerie ;
   private short AV77OGROLOS ;
   private short GXv_int13[] ;
   private int Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_70 ;
   private int subGridguiaremessalinhaitemdtos_Rows ;
   private int nGXsfl_70_idx=1 ;
   private int Gridguiaremessalinhaitemdtospaginationbar_Pagestoshow ;
   private int edtavSerie_Enabled ;
   private int edtavNmrguia_Enabled ;
   private int edtavDesde_Enabled ;
   private int edtavHasta_Enabled ;
   private int AV85GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridguiaremessalinhaitemdtos_Islastpage ;
   private int edtavGuiaremessalinhaitemdto__linha_Enabled ;
   private int edtavGuiaremessalinhaitemdto__serienmrguia_Enabled ;
   private int edtavGuiaremessalinhaitemdto__fecha_Enabled ;
   private int edtavGuiaremessalinhaitemdto__codfornecedor_Enabled ;
   private int edtavGuiaremessalinhaitemdto__ordemtingimento_Enabled ;
   private int edtavGuiaremessalinhaitemdto__codartigo_Enabled ;
   private int edtavGuiaremessalinhaitemdto__artigo_Enabled ;
   private int edtavGuiaremessalinhaitemdto__lu_Enabled ;
   private int edtavGuiaremessalinhaitemdto__entrada_Enabled ;
   private int edtavGuiaremessalinhaitemdto__codartigoclientecr_Enabled ;
   private int edtavGuiaremessalinhaitemdto__codartigoclienteac_Enabled ;
   private int GRIDGUIAREMESSALINHAITEMDTOS_nGridOutOfScope ;
   private int nGXsfl_70_fel_idx=1 ;
   private int AV53grid_CodClient ;
   private int edtavGuiaremessalinhaitemdto__rolos_Titleforecolor ;
   private int edtavGuiaremessalinhaitemdto__rolos_Enabled ;
   private int edtavGuiaremessalinhaitemdto__quantidade_Enabled ;
   private int edtavGuiaremessalinhaitemdto__referencia_Enabled ;
   private int edtavGuiaremessalinhaitemdto__lote_Enabled ;
   private int edtavGuiaremessalinhaitemdto__jogo_Enabled ;
   private int edtavGuiaremessalinhaitemdto__polegadas_Enabled ;
   private int edtavGuiaremessalinhaitemdto__fio_Enabled ;
   private int edtavGuiaremessalinhaitemdto__relatoriocomposicao_Enabled ;
   private int edtavGuiaremessalinhaitemdto__tear_Enabled ;
   private int edtavGuiaremessalinhaitemdto__localizacao_Enabled ;
   private int AV23PageToGo ;
   private int nGXsfl_70_bak_idx=1 ;
   private int AV112GXV27 ;
   private int AV114GXV29 ;
   private int AV115GXV30 ;
   private int AV116GXV31 ;
   private int idxLst ;
   private int subGridguiaremessalinhaitemdtos_Backcolor ;
   private int subGridguiaremessalinhaitemdtos_Allbackcolor ;
   private int edtavGuiaremessalinhaitemdto__linha_Visible ;
   private int edtavGuiaremessalinhaitemdto__fecha_Visible ;
   private int edtavGuiaremessalinhaitemdto__codfornecedor_Visible ;
   private int edtavGuiaremessalinhaitemdto__ordemtingimento_Visible ;
   private int edtavGuiaremessalinhaitemdto__codartigo_Visible ;
   private int edtavGuiaremessalinhaitemdto__artigo_Visible ;
   private int edtavGuiaremessalinhaitemdto__referencia_Visible ;
   private int edtavGuiaremessalinhaitemdto__rolos_Visible ;
   private int edtavGuiaremessalinhaitemdto__quantidade_Visible ;
   private int edtavGuiaremessalinhaitemdto__lote_Visible ;
   private int edtavGuiaremessalinhaitemdto__relatoriocomposicao_Visible ;
   private int edtavGuiaremessalinhaitemdto__jogo_Visible ;
   private int edtavGuiaremessalinhaitemdto__polegadas_Visible ;
   private int edtavGuiaremessalinhaitemdto__lu_Visible ;
   private int edtavGuiaremessalinhaitemdto__fio_Visible ;
   private int edtavGuiaremessalinhaitemdto__tear_Visible ;
   private int edtavGuiaremessalinhaitemdto__localizacao_Visible ;
   private int edtavGuiaremessalinhaitemdto__entrada_Visible ;
   private int edtavGuiaremessalinhaitemdto__codartigoclientecr_Visible ;
   private int edtavGuiaremessalinhaitemdto__codartigoclienteac_Visible ;
   private int subGridguiaremessalinhaitemdtos_Titlebackcolor ;
   private int subGridguiaremessalinhaitemdtos_Selectedindex ;
   private int subGridguiaremessalinhaitemdtos_Selectioncolor ;
   private int subGridguiaremessalinhaitemdtos_Hoveringcolor ;
   private long GRIDGUIAREMESSALINHAITEMDTOS_nFirstRecordOnPage ;
   private long AV41GridGuiaRemessaLinhaItemDTOsCurrentPage ;
   private long AV42GridGuiaRemessaLinhaItemDTOsPageCount ;
   private long AV20NmrGuia ;
   private long GRIDGUIAREMESSALINHAITEMDTOS_nCurrentRecord ;
   private long GRIDGUIAREMESSALINHAITEMDTOS_nRecordCount ;
   private long AV67ogNmrGuia ;
   private java.math.BigDecimal AV78OGQUANT ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_70_idx="0001" ;
   private String AV30EmprCod ;
   private String AV74ArtCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Class ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Pagingbuttonsposition ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Pagingcaptionposition ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Emptygridclass ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageoptions ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Previous ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Next ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Caption ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Emptygridcaption ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Rowsperpagecaption ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Combo_guiaremessalinhaitemdto__referencia_Cls ;
   private String Combo_guiaremessalinhaitemdto__referencia_Titlecontrolidtoreplace ;
   private String Gridguiaremessalinhaitemdtos_titlescategories_Gridinternalname ;
   private String Gridguiaremessalinhaitemdtos_titlescategories_Gridtitlescategories ;
   private String Gridguiaremessalinhaitemdtos_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String divTable_filters_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavSerie_Internalname ;
   private String TempTags ;
   private String edtavSerie_Jsonclick ;
   private String edtavNmrguia_Internalname ;
   private String edtavNmrguia_Jsonclick ;
   private String edtavDesde_Internalname ;
   private String edtavDesde_Jsonclick ;
   private String edtavHasta_Internalname ;
   private String edtavHasta_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnimportar_Internalname ;
   private String bttBtnimportar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divTable_result_Internalname ;
   private String divGridguiaremessalinhaitemdtostablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridguiaremessalinhaitemdtos_Internalname ;
   private String Gridguiaremessalinhaitemdtospaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV111Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_guiaremessalinhaitemdto__referencia_Caption ;
   private String Combo_guiaremessalinhaitemdto__referencia_Internalname ;
   private String Gridguiaremessalinhaitemdtos_titlescategories_Internalname ;
   private String Gridguiaremessalinhaitemdtos_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavGuiaremessalinhaitemdto__linha_Internalname ;
   private String edtavGuiaremessalinhaitemdto__serienmrguia_Internalname ;
   private String edtavGuiaremessalinhaitemdto__fecha_Internalname ;
   private String edtavGuiaremessalinhaitemdto__codfornecedor_Internalname ;
   private String edtavGuiaremessalinhaitemdto__ordemtingimento_Internalname ;
   private String edtavGuiaremessalinhaitemdto__codartigo_Internalname ;
   private String edtavGuiaremessalinhaitemdto__artigo_Internalname ;
   private String edtavGuiaremessalinhaitemdto__lu_Internalname ;
   private String edtavGuiaremessalinhaitemdto__entrada_Internalname ;
   private String edtavGuiaremessalinhaitemdto__codartigoclientecr_Internalname ;
   private String edtavGuiaremessalinhaitemdto__codartigoclienteac_Internalname ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String AV29Station ;
   private String AV31EmprNom ;
   private String AV32UsurCod ;
   private String edtavGuiaremessalinhaitemdto__referencia_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String edtavGuiaremessalinhaitemdto__rolos_Internalname ;
   private String edtavGuiaremessalinhaitemdto__quantidade_Internalname ;
   private String edtavGuiaremessalinhaitemdto__lote_Internalname ;
   private String edtavGuiaremessalinhaitemdto__relatoriocomposicao_Internalname ;
   private String edtavGuiaremessalinhaitemdto__jogo_Internalname ;
   private String edtavGuiaremessalinhaitemdto__polegadas_Internalname ;
   private String edtavGuiaremessalinhaitemdto__fio_Internalname ;
   private String edtavGuiaremessalinhaitemdto__tear_Internalname ;
   private String edtavGuiaremessalinhaitemdto__localizacao_Internalname ;
   private String subGridguiaremessalinhaitemdtos_Class ;
   private String subGridguiaremessalinhaitemdtos_Linesclass ;
   private String ROClassString ;
   private String edtavGuiaremessalinhaitemdto__linha_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__serienmrguia_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__fecha_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__codfornecedor_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__ordemtingimento_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__codartigo_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__artigo_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__referencia_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__rolos_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__quantidade_Jsonclick ;
   private String GXCCtl ;
   private String edtavGuiaremessalinhaitemdto__lote_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__relatoriocomposicao_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__jogo_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__polegadas_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__lu_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__fio_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__tear_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__localizacao_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__entrada_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__codartigoclientecr_Jsonclick ;
   private String edtavGuiaremessalinhaitemdto__codartigoclienteac_Jsonclick ;
   private String subGridguiaremessalinhaitemdtos_Header ;
   private java.util.Date AV19Desde ;
   private java.util.Date AV21Hasta ;
   private java.util.Date AV48dataDocumento ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Gridguiaremessalinhaitemdtospaginationbar_Showfirst ;
   private boolean Gridguiaremessalinhaitemdtospaginationbar_Showprevious ;
   private boolean Gridguiaremessalinhaitemdtospaginationbar_Shownext ;
   private boolean Gridguiaremessalinhaitemdtospaginationbar_Showlast ;
   private boolean Gridguiaremessalinhaitemdtospaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean Combo_guiaremessalinhaitemdto__referencia_Isgriditem ;
   private boolean Gridguiaremessalinhaitemdtos_empowerer_Hascategories ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV70 ;
   private boolean AV72isFilter ;
   private boolean AV65isOk ;
   private boolean AV10isSuccess ;
   private boolean GXv_boolean11[] ;
   private String AV5Log ;
   private String AV17Bearer ;
   private String AV64grid_Entrada ;
   private String AV69AlbRecCod ;
   private String AV73link ;
   private String AV49codCliente ;
   private String AV66ogLocalDes ;
   private String AV63Entrada ;
   private String AV80OGLOCALIZAC ;
   private String AV75ogReferen ;
   private String AV79ogUniDad ;
   private String AV81OGFIO ;
   private com.genexus.webpanels.GXWebGrid GridguiaremessalinhaitemdtosContainer ;
   private com.genexus.webpanels.GXWebRow GridguiaremessalinhaitemdtosRow ;
   private com.genexus.webpanels.GXWebColumn GridguiaremessalinhaitemdtosColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGridguiaremessalinhaitemdtospaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_guiaremessalinhaitemdto__referencia ;
   private com.genexus.webpanels.GXUserControl ucGridguiaremessalinhaitemdtos_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGridguiaremessalinhaitemdtos_empowerer ;
   private app.ponteway.v1.SdtLoginRequest AV7LoginRequest ;
   private HTMLChoice cmbavGuiaremessalinhaitemdto__unidade ;
   private HTMLChoice cmbavGuiaremessalinhaitemdto__reclamacion ;
   private HTMLChoice cmbavGuiaremessalinhaitemdto__afn ;
   private ICheckbox chkavGuiaremessalinhaitemdto__selected ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.util.GXProperties AV11ServerUrlTemplatingVar ;
   private GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> AV26GuiaRemessaLinhaItemDTO ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV54GuiaRemessaLinhaItemDTO__referencia_Data ;
   private GXBaseCollection<app.ponteway.v1.SdtListValues_Item> AV113GXV28 ;
   private GXBaseCollection<app.ponteway.v1.SdtListValues_Item> GXt_objcol_SdtListValues_Item8 ;
   private GXBaseCollection<app.ponteway.v1.SdtListValues_Item> GXv_objcol_SdtListValues_Item9[] ;
   private com.genexus.SdtMessages_Message AV12Message ;
   private com.genexus.SdtMessages_Message GXv_SdtMessages_Message7[] ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaDTO AV18GuiaRemessaLinhaDTO ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaDTO GXv_SdtGuiaRemessaLinhaDTO10[] ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem AV44GuiaRemessaLinhaDTO_Item ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem_linhasItem AV45GuiaRemessaLinhaDTO_Item_linhas ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas AV46GuiaRemessaLinhaItemDTO_Item ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV56Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV55DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.ponteway.v1.SdtListValues_Item AV57GuiaRemessaLinhaItemDTO__referencia_DPItem ;
}

