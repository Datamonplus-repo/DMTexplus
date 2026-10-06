package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wtn0003_wp_impl extends GXDataArea
{
   public wtn0003_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wtn0003_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wtn0003_wp_impl.class ));
   }

   public wtn0003_wp_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavControlesdecalidad_sdt__seleccionar = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridcontrolesdecalidad_sdts") == 0 )
         {
            gxnrgridcontrolesdecalidad_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridcontrolesdecalidad_sdts") == 0 )
         {
            gxgrgridcontrolesdecalidad_sdts_refresh_invoke( ) ;
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

   public void gxnrgridcontrolesdecalidad_sdts_newrow_invoke( )
   {
      nRC_GXsfl_168 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_168"))) ;
      nGXsfl_168_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_168_idx"))) ;
      sGXsfl_168_idx = httpContext.GetPar( "sGXsfl_168_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridcontrolesdecalidad_sdts_newrow( ) ;
      /* End function gxnrGridcontrolesdecalidad_sdts_newrow_invoke */
   }

   public void gxgrgridcontrolesdecalidad_sdts_refresh_invoke( )
   {
      subGridcontrolesdecalidad_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolesdecalidad_sdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV29ControlesdeCalidad_SDT);
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridcontrolesdecalidad_sdts_refresh( subGridcontrolesdecalidad_sdts_Rows, AV29ControlesdeCalidad_SDT, Gx_date) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridcontrolesdecalidad_sdts_refresh_invoke */
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
      pa2BR2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BR2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wtn0003_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTROLESDECALIDAD_SDT", getSecureSignedToken( "", AV29ControlesdeCalidad_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Controlesdecalidad_sdt", AV29ControlesdeCalidad_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Controlesdecalidad_sdt", AV29ControlesdeCalidad_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Controlesdecalidad_sdt", getSecureSignedToken( "", AV29ControlesdeCalidad_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_168", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_168, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV26DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV26DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIINI_DATA", AV25CliIni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIINI_DATA", AV25CliIni_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIFIN_DATA", AV28CliFin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIFIN_DATA", AV28CliFin_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCONTROLESDECALIDAD_SDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV32GridControlesdeCalidad_SDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCONTROLESDECALIDAD_SDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV33GridControlesdeCalidad_SDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLESDECALIDAD_SDT", AV29ControlesdeCalidad_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLESDECALIDAD_SDT", AV29ControlesdeCalidad_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTROLESDECALIDAD_SDT", getSecureSignedToken( "", AV29ControlesdeCalidad_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV34EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFIN2", GXutil.ltrim( localUtil.ntoc( AV40Barfin2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vREOFIN2", GXutil.ltrim( localUtil.ntoc( AV41Reofin2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARFIN2", GXutil.rtrim( AV42parfin2));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARDISNUMTO2", GXutil.rtrim( AV44BarDisNumto2));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIFIN2", GXutil.ltrim( localUtil.ntoc( AV45CliFin2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCHFIN2", localUtil.dtoc( AV46FchFin2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERTO2", GXutil.rtrim( AV47barserto2));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOMTO2", GXutil.rtrim( AV48BarColNomto2));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUMTO2", GXutil.ltrim( localUtil.ntoc( AV49BarColNumto2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENCCLI3", GXutil.rtrim( AV55Enccli3));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTROLESDECALIDAD_JSON", AV43ControlesdeCalidad_json);
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Cls", GXutil.rtrim( Combo_cliini_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Selectedvalue_set", GXutil.rtrim( Combo_cliini_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Emptyitemtext", GXutil.rtrim( Combo_cliini_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Cls", GXutil.rtrim( Combo_clifin_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Selectedvalue_set", GXutil.rtrim( Combo_clifin_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Emptyitemtext", GXutil.rtrim( Combo_clifin_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridcontrolesdecalidad_sdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridcontrolesdecalidad_sdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridcontrolesdecalidad_sdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridcontrolesdecalidad_sdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridcontrolesdecalidad_sdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridcontrolesdecalidad_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Selectedvalue_get", GXutil.rtrim( Combo_clifin_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Selectedvalue_get", GXutil.rtrim( Combo_cliini_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we2BR2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BR2( ) ;
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
      return formatLink("app.controlcalidadhtd.wtn0003_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.Wtn0003_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Datos CC", "") ;
   }

   public void wb2BR0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarini_Internalname, httpContext.getMessage( "Nº Hdr Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarini_Internalname, GXutil.ltrim( localUtil.ntoc( AV19BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19BarIni), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19BarIni), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarini_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReoini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReoini_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReoini_Internalname, GXutil.ltrim( localUtil.ntoc( AV20ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReoini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20ReoIni), "9") : localUtil.format( DecimalUtil.doubleToDec(AV20ReoIni), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "R", ""), edtavReoini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReoini_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavParini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavParini_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavParini_Internalname, GXutil.rtrim( AV21ParIni), GXutil.rtrim( localUtil.format( AV21ParIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "P", ""), edtavParini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavParini_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfin_Internalname, httpContext.getMessage( "Nº Hdr Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV22BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22BarFin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22BarFin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReofin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReofin_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReofin_Internalname, GXutil.ltrim( localUtil.ntoc( AV23ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReofin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23ReoFin), "9") : localUtil.format( DecimalUtil.doubleToDec(AV23ReoFin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "R", ""), edtavReofin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReofin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavParfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavParfin_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavParfin_Internalname, GXutil.rtrim( AV24ParFin), GXutil.rtrim( localUtil.format( AV24ParFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "P", ""), edtavParfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavParfin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserfrom_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserfrom_Internalname, GXutil.rtrim( AV38BarSerfrom), GXutil.rtrim( localUtil.format( AV38BarSerfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserfrom_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserto_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserto_Internalname, GXutil.rtrim( AV39BarSerto), GXutil.rtrim( localUtil.format( AV39BarSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcliini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cliini_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_cliini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cliini.setProperty("Caption", Combo_cliini_Caption);
         ucCombo_cliini.setProperty("Cls", Combo_cliini_Cls);
         ucCombo_cliini.setProperty("EmptyItemText", Combo_cliini_Emptyitemtext);
         ucCombo_cliini.setProperty("DropDownOptionsTitleSettingsIcons", AV26DDO_TitleSettingsIcons);
         ucCombo_cliini.setProperty("DropDownOptionsData", AV25CliIni_Data);
         ucCombo_cliini.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cliini_Internalname, "COMBO_CLIINIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclifin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clifin_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clifin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clifin.setProperty("Caption", Combo_clifin_Caption);
         ucCombo_clifin.setProperty("Cls", Combo_clifin_Cls);
         ucCombo_clifin.setProperty("EmptyItemText", Combo_clifin_Emptyitemtext);
         ucCombo_clifin.setProperty("DropDownOptionsTitleSettingsIcons", AV26DDO_TitleSettingsIcons);
         ucCombo_clifin.setProperty("DropDownOptionsData", AV28CliFin_Data);
         ucCombo_clifin.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clifin_Internalname, "COMBO_CLIFINContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFchini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFchini_Internalname, httpContext.getMessage( "Fecha Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFchini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFchini_Internalname, localUtil.format(AV15FchIni, "99/99/99"), localUtil.format( AV15FchIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFchini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFchini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFchini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFchini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFchfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFchfin_Internalname, httpContext.getMessage( "Fecha Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFchfin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFchfin_Internalname, localUtil.format(AV16FchFin, "99/99/99"), localUtil.format( AV16FchFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFchfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFchfin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFchfin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFchfin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, divUnnamedtable5_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarencclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarencclifrom_Internalname, httpContext.getMessage( "Pedido Cliente Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarencclifrom_Internalname, GXutil.rtrim( AV56BarEncClifrom), GXutil.rtrim( localUtil.format( AV56BarEncClifrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarencclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarencclifrom_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarencclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarencclito_Internalname, httpContext.getMessage( "Pedido Cliente Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarencclito_Internalname, GXutil.rtrim( AV57BarEncClito), GXutil.rtrim( localUtil.format( AV57BarEncClito, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarencclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarencclito_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, divUnnamedtable6_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnumfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnumfrom_Internalname, httpContext.getMessage( "Pedido Cliente Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumfrom_Internalname, GXutil.rtrim( AV13BarDisNumfrom), GXutil.rtrim( localUtil.format( AV13BarDisNumfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnumto_Internalname, httpContext.getMessage( "Pedido Cliente Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumto_Internalname, GXutil.rtrim( AV14BarDisNumto), GXutil.rtrim( localUtil.format( AV14BarDisNumto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomfrom_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomfrom_Internalname, GXutil.rtrim( AV9BarColNomfrom), GXutil.rtrim( localUtil.format( AV9BarColNomfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomfrom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumfrom_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarColNumfrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarColNumfrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumfrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomto_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomto_Internalname, GXutil.rtrim( AV11BarColNomto), GXutil.rtrim( localUtil.format( AV11BarColNomto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomto_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumto_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumto_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarColNumto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarColNumto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 168, 3, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 168, 3, 0)+","+"null"+");", httpContext.getMessage( "PDF", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 168, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
         ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
         ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
         ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
         ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
         ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
         ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
         ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
         ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
         ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
         ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, "DVPANEL_UNNAMEDTABLE9Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridcontrolesdecalidad_sdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridcontrolesdecalidad_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol168( ) ;
      }
      if ( wbEnd == 168 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_168 = (int)(nGXsfl_168_idx-1) ;
         if ( Gridcontrolesdecalidad_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV60GXV1 = nGXsfl_168_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridcontrolesdecalidad_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolesdecalidad_sdts", Gridcontrolesdecalidad_sdtsContainer, subGridcontrolesdecalidad_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolesdecalidad_sdtsContainerData", Gridcontrolesdecalidad_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolesdecalidad_sdtsContainerData"+"V", Gridcontrolesdecalidad_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolesdecalidad_sdtsContainerData"+"V"+"\" value='"+Gridcontrolesdecalidad_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("Class", Gridcontrolesdecalidad_sdtspaginationbar_Class);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("ShowFirst", Gridcontrolesdecalidad_sdtspaginationbar_Showfirst);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("ShowPrevious", Gridcontrolesdecalidad_sdtspaginationbar_Showprevious);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("ShowNext", Gridcontrolesdecalidad_sdtspaginationbar_Shownext);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("ShowLast", Gridcontrolesdecalidad_sdtspaginationbar_Showlast);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("PagesToShow", Gridcontrolesdecalidad_sdtspaginationbar_Pagestoshow);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("PagingButtonsPosition", Gridcontrolesdecalidad_sdtspaginationbar_Pagingbuttonsposition);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("PagingCaptionPosition", Gridcontrolesdecalidad_sdtspaginationbar_Pagingcaptionposition);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("EmptyGridClass", Gridcontrolesdecalidad_sdtspaginationbar_Emptygridclass);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("RowsPerPageSelector", Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselector);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("RowsPerPageOptions", Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageoptions);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("Previous", Gridcontrolesdecalidad_sdtspaginationbar_Previous);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("Next", Gridcontrolesdecalidad_sdtspaginationbar_Next);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("Caption", Gridcontrolesdecalidad_sdtspaginationbar_Caption);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("EmptyGridCaption", Gridcontrolesdecalidad_sdtspaginationbar_Emptygridcaption);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("RowsPerPageCaption", Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpagecaption);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("CurrentPage", AV32GridControlesdeCalidad_SDTsCurrentPage);
         ucGridcontrolesdecalidad_sdtspaginationbar.setProperty("PageCount", AV33GridControlesdeCalidad_SDTsPageCount);
         ucGridcontrolesdecalidad_sdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridcontrolesdecalidad_sdtspaginationbar_Internalname, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV64Pgmname), GXutil.rtrim( localUtil.format( AV64Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCliini_Internalname, GXutil.ltrim( localUtil.ntoc( AV17CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17CliIni), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCliini_Jsonclick, 0, "Attribute", "", "", "", "", edtavCliini_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClifin_Internalname, GXutil.ltrim( localUtil.ntoc( AV18CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18CliFin), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,192);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClifin_Jsonclick, 0, "Attribute", "", "", "", "", edtavClifin_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wtn0003_WP.htm");
         /* User Defined Control */
         ucGridcontrolesdecalidad_sdts_empowerer.render(context, "wwp.gridempowerer", Gridcontrolesdecalidad_sdts_empowerer_Internalname, "GRIDCONTROLESDECALIDAD_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 168 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridcontrolesdecalidad_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV60GXV1 = nGXsfl_168_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridcontrolesdecalidad_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolesdecalidad_sdts", Gridcontrolesdecalidad_sdtsContainer, subGridcontrolesdecalidad_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolesdecalidad_sdtsContainerData", Gridcontrolesdecalidad_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolesdecalidad_sdtsContainerData"+"V", Gridcontrolesdecalidad_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolesdecalidad_sdtsContainerData"+"V"+"\" value='"+Gridcontrolesdecalidad_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2BR2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Datos CC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BR0( ) ;
   }

   public void ws2BR2( )
   {
      start2BR2( ) ;
      evt2BR2( ) ;
   }

   public void evt2BR2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112BR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122BR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExcel' */
                           e132BR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e142BR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPDF' */
                           e152BR2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 32), "GRIDCONTROLESDECALIDAD_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_168_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_168_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_168_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1682( ) ;
                           AV60GXV1 = (int)(nGXsfl_168_idx+GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage) ;
                           if ( ( AV29ControlesdeCalidad_SDT.size() >= AV60GXV1 ) && ( AV60GXV1 > 0 ) )
                           {
                              AV29ControlesdeCalidad_SDT.currentItem( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)) );
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
                                 e162BR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e172BR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDCONTROLESDECALIDAD_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e182BR2 ();
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

   public void we2BR2( )
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

   public void pa2BR2( )
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
            GX_FocusControl = edtavBarini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridcontrolesdecalidad_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1682( ) ;
      while ( nGXsfl_168_idx <= nRC_GXsfl_168 )
      {
         sendrow_1682( ) ;
         nGXsfl_168_idx = ((subGridcontrolesdecalidad_sdts_Islastpage==1)&&(nGXsfl_168_idx+1>subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_168_idx+1) ;
         sGXsfl_168_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_168_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1682( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridcontrolesdecalidad_sdtsContainer)) ;
      /* End function gxnrGridcontrolesdecalidad_sdts_newrow */
   }

   public void gxgrgridcontrolesdecalidad_sdts_refresh( int subGridcontrolesdecalidad_sdts_Rows ,
                                                        GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> AV29ControlesdeCalidad_SDT ,
                                                        java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172BR2 ();
      GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord = 0 ;
      rf2BR2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridcontrolesdecalidad_sdts_refresh */
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
      rf2BR2( ) ;
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
      AV64Pgmname = "ControlCalidadHTD.Wtn0003_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavControlesdecalidad_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlesdecalidad_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlesdecalidad_sdt__cctcod_Enabled), 5, 0), !bGXsfl_168_Refreshing);
      edtavControlesdecalidad_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlesdecalidad_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlesdecalidad_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_168_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridcontrolesdecalidad_sdtsContainer.ClearRows();
      }
      wbStart = (short)(168) ;
      /* Execute user event: Refresh */
      e172BR2 ();
      nGXsfl_168_idx = 1 ;
      sGXsfl_168_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_168_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1682( ) ;
      bGXsfl_168_Refreshing = true ;
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolesdecalidad_sdts");
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridcontrolesdecalidad_sdtsContainer.setPageSize( subgridcontrolesdecalidad_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1682( ) ;
         e182BR2 ();
         if ( ( GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord > 0 ) && ( GRIDCONTROLESDECALIDAD_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_168_idx == 1 ) )
         {
            GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord = 0 ;
            GRIDCONTROLESDECALIDAD_SDTS_nGridOutOfScope = 1 ;
            subgridcontrolesdecalidad_sdts_firstpage( ) ;
            e182BR2 ();
         }
         wbEnd = (short)(168) ;
         wb2BR0( ) ;
      }
      bGXsfl_168_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BR2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLESDECALIDAD_SDT", AV29ControlesdeCalidad_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLESDECALIDAD_SDT", AV29ControlesdeCalidad_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTROLESDECALIDAD_SDT", getSecureSignedToken( "", AV29ControlesdeCalidad_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
   }

   public int subgridcontrolesdecalidad_sdts_fnc_pagecount( )
   {
      GRIDCONTROLESDECALIDAD_SDTS_nRecordCount = subgridcontrolesdecalidad_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDCONTROLESDECALIDAD_SDTS_nRecordCount) % (subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDCONTROLESDECALIDAD_SDTS_nRecordCount/ (double) (subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDCONTROLESDECALIDAD_SDTS_nRecordCount/ (double) (subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridcontrolesdecalidad_sdts_fnc_recordcount( )
   {
      return AV29ControlesdeCalidad_SDT.size() ;
   }

   public int subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )
   {
      if ( subGridcontrolesdecalidad_sdts_Rows > 0 )
      {
         return subGridcontrolesdecalidad_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridcontrolesdecalidad_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage/ (double) (subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridcontrolesdecalidad_sdts_firstpage( )
   {
      GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolesdecalidad_sdts_refresh( subGridcontrolesdecalidad_sdts_Rows, AV29ControlesdeCalidad_SDT, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolesdecalidad_sdts_nextpage( )
   {
      GRIDCONTROLESDECALIDAD_SDTS_nRecordCount = subgridcontrolesdecalidad_sdts_fnc_recordcount( ) ;
      if ( ( GRIDCONTROLESDECALIDAD_SDTS_nRecordCount >= subgridcontrolesdecalidad_sdts_fnc_recordsperpage( ) ) && ( GRIDCONTROLESDECALIDAD_SDTS_nEOF == 0 ) )
      {
         GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage+subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage", GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolesdecalidad_sdts_refresh( subGridcontrolesdecalidad_sdts_Rows, AV29ControlesdeCalidad_SDT, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDCONTROLESDECALIDAD_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridcontrolesdecalidad_sdts_previouspage( )
   {
      if ( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage >= subgridcontrolesdecalidad_sdts_fnc_recordsperpage( ) )
      {
         GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage-subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolesdecalidad_sdts_refresh( subGridcontrolesdecalidad_sdts_Rows, AV29ControlesdeCalidad_SDT, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolesdecalidad_sdts_lastpage( )
   {
      GRIDCONTROLESDECALIDAD_SDTS_nRecordCount = subgridcontrolesdecalidad_sdts_fnc_recordcount( ) ;
      if ( GRIDCONTROLESDECALIDAD_SDTS_nRecordCount > subgridcontrolesdecalidad_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDCONTROLESDECALIDAD_SDTS_nRecordCount) % (subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLESDECALIDAD_SDTS_nRecordCount-subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLESDECALIDAD_SDTS_nRecordCount-((int)((GRIDCONTROLESDECALIDAD_SDTS_nRecordCount) % (subgridcontrolesdecalidad_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolesdecalidad_sdts_refresh( subGridcontrolesdecalidad_sdts_Rows, AV29ControlesdeCalidad_SDT, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridcontrolesdecalidad_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = (long)(subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolesdecalidad_sdts_refresh( subGridcontrolesdecalidad_sdts_Rows, AV29ControlesdeCalidad_SDT, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV64Pgmname = "ControlCalidadHTD.Wtn0003_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavControlesdecalidad_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlesdecalidad_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlesdecalidad_sdt__cctcod_Enabled), 5, 0), !bGXsfl_168_Refreshing);
      edtavControlesdecalidad_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlesdecalidad_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlesdecalidad_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_168_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162BR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Controlesdecalidad_sdt"), AV29ControlesdeCalidad_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV26DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIINI_DATA"), AV25CliIni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIFIN_DATA"), AV28CliFin_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCONTROLESDECALIDAD_SDT"), AV29ControlesdeCalidad_SDT);
         /* Read saved values. */
         nRC_GXsfl_168 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_168"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32GridControlesdeCalidad_SDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCONTROLESDECALIDAD_SDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV33GridControlesdeCalidad_SDTsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDCONTROLESDECALIDAD_SDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLESDECALIDAD_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridcontrolesdecalidad_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_cliini_Cls = httpContext.cgiGet( "COMBO_CLIINI_Cls") ;
         Combo_cliini_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIINI_Selectedvalue_set") ;
         Combo_cliini_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIINI_Emptyitemtext") ;
         Combo_clifin_Cls = httpContext.cgiGet( "COMBO_CLIFIN_Cls") ;
         Combo_clifin_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIFIN_Selectedvalue_set") ;
         Combo_clifin_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIFIN_Emptyitemtext") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Class = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Class") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Showfirst")) ;
         Gridcontrolesdecalidad_sdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Showprevious")) ;
         Gridcontrolesdecalidad_sdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Shownext")) ;
         Gridcontrolesdecalidad_sdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Showlast")) ;
         Gridcontrolesdecalidad_sdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridcontrolesdecalidad_sdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Emptygridclass") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Previous = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Previous") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Next = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Next") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Caption = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Caption") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_unnamedtable9_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Width") ;
         Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
         Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
         Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Cls") ;
         Dvpanel_unnamedtable9_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Title") ;
         Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
         Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
         Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
         Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Iconposition") ;
         Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
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
         Gridcontrolesdecalidad_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTS_EMPOWERER_Gridinternalname") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Selectedpage") ;
         Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_168 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_168"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_168_fel_idx = 0 ;
         while ( nGXsfl_168_fel_idx < nRC_GXsfl_168 )
         {
            nGXsfl_168_fel_idx = ((subGridcontrolesdecalidad_sdts_Islastpage==1)&&(nGXsfl_168_fel_idx+1>subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_168_fel_idx+1) ;
            sGXsfl_168_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_168_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1682( ) ;
            AV60GXV1 = (int)(nGXsfl_168_fel_idx+GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage) ;
            if ( ( AV29ControlesdeCalidad_SDT.size() >= AV60GXV1 ) && ( AV60GXV1 > 0 ) )
            {
               AV29ControlesdeCalidad_SDT.currentItem( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)) );
            }
         }
         if ( nGXsfl_168_fel_idx == 0 )
         {
            nGXsfl_168_idx = 1 ;
            sGXsfl_168_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_168_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1682( ) ;
         }
         nGXsfl_168_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARINI");
            GX_FocusControl = edtavBarini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarIni), 8, 0));
         }
         else
         {
            AV19BarIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarIni), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReoini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReoini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREOINI");
            GX_FocusControl = edtavReoini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20ReoIni = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20ReoIni", GXutil.str( AV20ReoIni, 1, 0));
         }
         else
         {
            AV20ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( edtavReoini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20ReoIni", GXutil.str( AV20ReoIni, 1, 0));
         }
         AV21ParIni = httpContext.cgiGet( edtavParini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ParIni", AV21ParIni);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFIN");
            GX_FocusControl = edtavBarfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22BarFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22BarFin), 8, 0));
         }
         else
         {
            AV22BarFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22BarFin), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReofin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReofin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREOFIN");
            GX_FocusControl = edtavReofin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23ReoFin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23ReoFin", GXutil.str( AV23ReoFin, 1, 0));
         }
         else
         {
            AV23ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavReofin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23ReoFin", GXutil.str( AV23ReoFin, 1, 0));
         }
         AV24ParFin = httpContext.cgiGet( edtavParfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ParFin", AV24ParFin);
         AV38BarSerfrom = httpContext.cgiGet( edtavBarserfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarSerfrom", AV38BarSerfrom);
         AV39BarSerto = httpContext.cgiGet( edtavBarserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39BarSerto", AV39BarSerto);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFchini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFCHINI");
            GX_FocusControl = edtavFchini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15FchIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FchIni", localUtil.format(AV15FchIni, "99/99/99"));
         }
         else
         {
            AV15FchIni = localUtil.ctod( httpContext.cgiGet( edtavFchini_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FchIni", localUtil.format(AV15FchIni, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFchfin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFCHFIN");
            GX_FocusControl = edtavFchfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16FchFin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FchFin", localUtil.format(AV16FchFin, "99/99/99"));
         }
         else
         {
            AV16FchFin = localUtil.ctod( httpContext.cgiGet( edtavFchfin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FchFin", localUtil.format(AV16FchFin, "99/99/99"));
         }
         AV56BarEncClifrom = httpContext.cgiGet( edtavBarencclifrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56BarEncClifrom", AV56BarEncClifrom);
         AV57BarEncClito = httpContext.cgiGet( edtavBarencclito_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57BarEncClito", AV57BarEncClito);
         AV13BarDisNumfrom = httpContext.cgiGet( edtavBardisnumfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarDisNumfrom", AV13BarDisNumfrom);
         AV14BarDisNumto = httpContext.cgiGet( edtavBardisnumto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarDisNumto", AV14BarDisNumto);
         AV9BarColNomfrom = httpContext.cgiGet( edtavBarcolnomfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarColNomfrom", AV9BarColNomfrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMFROM");
            GX_FocusControl = edtavBarcolnumfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarColNumfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNumfrom), 6, 0));
         }
         else
         {
            AV10BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNumfrom), 6, 0));
         }
         AV11BarColNomto = httpContext.cgiGet( edtavBarcolnomto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomto", AV11BarColNomto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMTO");
            GX_FocusControl = edtavBarcolnumto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12BarColNumto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumto), 6, 0));
         }
         else
         {
            AV12BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumto), 6, 0));
         }
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIINI");
            GX_FocusControl = edtavCliini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17CliIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliIni), 6, 0));
         }
         else
         {
            AV17CliIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliIni), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIFIN");
            GX_FocusControl = edtavClifin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18CliFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliFin), 6, 0));
         }
         else
         {
            AV18CliFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliFin), 6, 0));
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
      e162BR2 ();
      if (returnInSub) return;
   }

   public void e162BR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wtn0003_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV34EmprCod ;
      GXv_char3[0] = AV35EmprNom ;
      GXv_char4[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      wtn0003_wp_impl.this.AV34EmprCod = GXv_char2[0] ;
      wtn0003_wp_impl.this.AV35EmprNom = GXv_char3[0] ;
      wtn0003_wp_impl.this.AV36UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34EmprCod", AV34EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV26DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV26DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavClifin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClifin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClifin_Visible), 5, 0), true);
      edtavCliini_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCliini_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCliini_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLIINI' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLIFIN' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S132 ();
      if (returnInSub) return;
      Gridcontrolesdecalidad_sdts_empowerer_Gridinternalname = subGridcontrolesdecalidad_sdts_Internalname ;
      ucGridcontrolesdecalidad_sdts_empowerer.sendProperty(context, "", false, Gridcontrolesdecalidad_sdts_empowerer_Internalname, "GridInternalName", Gridcontrolesdecalidad_sdts_empowerer_Gridinternalname);
      subGridcontrolesdecalidad_sdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue = subGridcontrolesdecalidad_sdts_Rows ;
      ucGridcontrolesdecalidad_sdtspaginationbar.sendProperty(context, "", false, Gridcontrolesdecalidad_sdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtControlesdeCalidad_SDT_Item7 = AV29ControlesdeCalidad_SDT ;
      GXv_objcol_SdtControlesdeCalidad_SDT_Item8[0] = GXt_objcol_SdtControlesdeCalidad_SDT_Item7 ;
      new app.controlcalidadhtd.controlesdecalidad_dp(remoteHandle, context).execute( AV34EmprCod, GXv_objcol_SdtControlesdeCalidad_SDT_Item8) ;
      GXt_objcol_SdtControlesdeCalidad_SDT_Item7 = GXv_objcol_SdtControlesdeCalidad_SDT_Item8[0] ;
      AV29ControlesdeCalidad_SDT = GXt_objcol_SdtControlesdeCalidad_SDT_Item7 ;
      gx_BV168 = true ;
      AV15FchIni = GXutil.dadd(GXutil.today( ),-(7)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FchIni", localUtil.format(AV15FchIni, "99/99/99"));
      AV16FchFin = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FchFin", localUtil.format(AV16FchFin, "99/99/99"));
      GXt_int9 = (byte)(AV54Enc20c) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV34EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int10) ;
      wtn0003_wp_impl.this.GXt_int9 = GXv_int10[0] ;
      AV54Enc20c = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Enc20c", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Enc20c), 4, 0));
   }

   public void e172BR2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV32GridControlesdeCalidad_SDTsCurrentPage = subgridcontrolesdecalidad_sdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32GridControlesdeCalidad_SDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridControlesdeCalidad_SDTsCurrentPage), 10, 0));
      AV33GridControlesdeCalidad_SDTsPageCount = subgridcontrolesdecalidad_sdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33GridControlesdeCalidad_SDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridControlesdeCalidad_SDTsPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e182BR2( )
   {
      /* Gridcontrolesdecalidad_sdts_Load Routine */
      returnInSub = false ;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV29ControlesdeCalidad_SDT.size() )
      {
         AV29ControlesdeCalidad_SDT.currentItem( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(168) ;
         }
         if ( ( subGridcontrolesdecalidad_sdts_Islastpage == 1 ) || ( subGridcontrolesdecalidad_sdts_Rows == 0 ) || ( ( GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord >= GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage ) && ( GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord < GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage + subgridcontrolesdecalidad_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1682( ) ;
            GRIDCONTROLESDECALIDAD_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord + 1 >= subgridcontrolesdecalidad_sdts_fnc_recordcount( ) )
            {
               GRIDCONTROLESDECALIDAD_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLESDECALIDAD_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord = (long)(GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_168_Refreshing )
         {
            httpContext.doAjaxLoad(168, Gridcontrolesdecalidad_sdtsRow);
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void e112BR2( )
   {
      /* Gridcontrolesdecalidad_sdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridcontrolesdecalidad_sdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV31PageToGo = subgridcontrolesdecalidad_sdts_fnc_currentpage( ) ;
         AV31PageToGo = (int)(AV31PageToGo+1) ;
         subgridcontrolesdecalidad_sdts_gotopage( AV31PageToGo) ;
      }
      else
      {
         AV31PageToGo = (int)(GXutil.lval( Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage)) ;
         subgridcontrolesdecalidad_sdts_gotopage( AV31PageToGo) ;
      }
   }

   public void e122BR2( )
   {
      /* Gridcontrolesdecalidad_sdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridcontrolesdecalidad_sdts_Rows = Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLESDECALIDAD_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridcontrolesdecalidad_sdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132BR2( )
   {
      AV60GXV1 = (int)(nGXsfl_168_idx+GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage) ;
      if ( ( AV60GXV1 > 0 ) && ( AV29ControlesdeCalidad_SDT.size() >= AV60GXV1 ) )
      {
         AV29ControlesdeCalidad_SDT.currentItem( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)) );
      }
      /* 'DoExcel' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV51lineas = (short)(0) ;
      AV65GXV5 = 1 ;
      while ( AV65GXV5 <= AV29ControlesdeCalidad_SDT.size() )
      {
         AV50ControlesdeCalidad_SDTItem = (app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV65GXV5));
         if ( AV50ControlesdeCalidad_SDTItem.getgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar() )
         {
            AV51lineas = (short)(AV51lineas+1) ;
         }
         AV65GXV5 = (int)(AV65GXV5+1) ;
      }
      if ( AV51lineas == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO ha seleccionado control", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         /* Execute user subroutine: 'CARGARVARIABLES' */
         S142 ();
         if (returnInSub) return;
         if ( AV51lineas > 1 )
         {
            GXv_char4[0] = AV52ExcelFilename ;
            GXv_char3[0] = AV53ErrorMessage ;
            new app.controlcalidadhtd.wtn0003_export_v1(remoteHandle, context).execute( AV34EmprCod, AV19BarIni, AV20ReoIni, AV21ParIni, AV40Barfin2, AV41Reofin2, AV42parfin2, AV13BarDisNumfrom, AV44BarDisNumto2, AV17CliIni, AV45CliFin2, AV15FchIni, AV46FchFin2, AV38BarSerfrom, AV47barserto2, " ", AV9BarColNomfrom, AV48BarColNomto2, AV10BarColNumfrom, AV49BarColNumto2, AV56BarEncClifrom, AV55Enccli3, AV43ControlesdeCalidad_json, GXv_char4, GXv_char3) ;
            wtn0003_wp_impl.this.AV52ExcelFilename = GXv_char4[0] ;
            wtn0003_wp_impl.this.AV53ErrorMessage = GXv_char3[0] ;
         }
         else
         {
            GXv_char4[0] = AV52ExcelFilename ;
            GXv_char3[0] = AV53ErrorMessage ;
            new app.controlcalidadhtd.wtn0003_export_v2(remoteHandle, context).execute( AV34EmprCod, AV19BarIni, AV20ReoIni, AV21ParIni, AV40Barfin2, AV41Reofin2, AV42parfin2, AV13BarDisNumfrom, AV44BarDisNumto2, AV17CliIni, AV45CliFin2, AV15FchIni, AV46FchFin2, AV38BarSerfrom, AV47barserto2, " ", AV9BarColNomfrom, AV48BarColNomto2, AV10BarColNumfrom, AV49BarColNumto2, AV56BarEncClifrom, AV55Enccli3, AV43ControlesdeCalidad_json, GXv_char4, GXv_char3) ;
            wtn0003_wp_impl.this.AV52ExcelFilename = GXv_char4[0] ;
            wtn0003_wp_impl.this.AV53ErrorMessage = GXv_char3[0] ;
         }
         if ( GXutil.strcmp(AV52ExcelFilename, "") != 0 )
         {
            callWebObject(formatLink(AV52ExcelFilename, new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV53ErrorMessage);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e152BR2( )
   {
      AV60GXV1 = (int)(nGXsfl_168_idx+GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage) ;
      if ( ( AV60GXV1 > 0 ) && ( AV29ControlesdeCalidad_SDT.size() >= AV60GXV1 ) )
      {
         AV29ControlesdeCalidad_SDT.currentItem( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)) );
      }
      /* 'DoPDF' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV51lineas = (short)(0) ;
      AV66GXV6 = 1 ;
      while ( AV66GXV6 <= AV29ControlesdeCalidad_SDT.size() )
      {
         AV50ControlesdeCalidad_SDTItem = (app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV66GXV6));
         if ( AV50ControlesdeCalidad_SDTItem.getgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar() )
         {
            AV51lineas = (short)(AV51lineas+1) ;
         }
         AV66GXV6 = (int)(AV66GXV6+1) ;
      }
      if ( AV51lineas == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO ha seleccionado control", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         /* Execute user subroutine: 'CARGARVARIABLES' */
         S142 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.controlcalidadhtd.rtn0003", new String[] {GXutil.URLEncode(GXutil.rtrim(AV34EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20ReoIni,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21ParIni)),GXutil.URLEncode(GXutil.ltrimstr(AV40Barfin2,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Reofin2,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42parfin2)),GXutil.URLEncode(GXutil.rtrim(AV13BarDisNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV44BarDisNumto2)),GXutil.URLEncode(GXutil.ltrimstr(AV17CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45CliFin2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV43ControlesdeCalidad_json)),GXutil.URLEncode(GXutil.formatDateParm(AV15FchIni)),GXutil.URLEncode(GXutil.formatDateParm(AV46FchFin2)),GXutil.URLEncode(GXutil.rtrim(AV38BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV47barserto2)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(AV9BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV48BarColNomto2)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarColNumto2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV56BarEncClifrom)),GXutil.URLEncode(GXutil.rtrim(AV55Enccli3))}, new String[] {"EmprCod","BarCodi","CodReoi","CodPari","BarCodf","CodReof","CodParf","DisNumi","DisNumf","CliCodi","CliCodf","ControlesdeCalidad_json","CCFCHi","CCFCHf","BarSeri","BarSerf","Barmdlcod","Barcolnom","Barcolnomf","Barcolnum","barcolnumf","Enccli1","Enccli2"}) , new Object[] {"AV34EmprCod","AV19BarIni","AV20ReoIni","AV21ParIni","AV40Barfin2","AV41Reofin2","AV42parfin2","AV13BarDisNumfrom","AV44BarDisNumto2","AV17CliIni","AV45CliFin2","AV43ControlesdeCalidad_json","AV15FchIni","AV46FchFin2","AV38BarSerfrom","AV47barserto2","","AV9BarColNomfrom","AV48BarColNomto2","AV10BarColNumfrom","AV49BarColNumto2","AV56BarEncClifrom","AV55Enccli3"});
      }
      /*  Sending Event outputs  */
   }

   public void e142BR2( )
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

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divUnnamedtable5_Visible = (((AV54Enc20c==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable5_Visible), 5, 0), true);
      divUnnamedtable6_Visible = (((AV54Enc20c==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLIFIN' Routine */
      returnInSub = false ;
      AV28CliFin_Data.clear();
      /* Using cursor H02BR2 */
      pr_default.execute(0, new Object[] {AV34EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = H02BR2_A10045CliAct[0] ;
         A396EmprCod = H02BR2_A396EmprCod[0] ;
         A279CliNom = H02BR2_A279CliNom[0] ;
         A252CliCod = H02BR2_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV27Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV27Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV27Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV28CliFin_Data.add(AV27Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV28CliFin_Data.sort("Title");
      Combo_clifin_Selectedvalue_set = ((0==AV18CliFin) ? "" : GXutil.trim( GXutil.str( AV18CliFin, 6, 0))) ;
      ucCombo_clifin.sendProperty(context, "", false, Combo_clifin_Internalname, "SelectedValue_set", Combo_clifin_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLIINI' Routine */
      returnInSub = false ;
      AV25CliIni_Data.clear();
      /* Using cursor H02BR3 */
      pr_default.execute(1, new Object[] {AV34EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H02BR3_A10045CliAct[0] ;
         A396EmprCod = H02BR3_A396EmprCod[0] ;
         A279CliNom = H02BR3_A279CliNom[0] ;
         A252CliCod = H02BR3_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV27Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV27Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV27Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV25CliIni_Data.add(AV27Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV25CliIni_Data.sort("Title");
      Combo_cliini_Selectedvalue_set = ((0==AV17CliIni) ? "" : GXutil.trim( GXutil.str( AV17CliIni, 6, 0))) ;
      ucCombo_cliini.sendProperty(context, "", false, Combo_cliini_Internalname, "SelectedValue_set", Combo_cliini_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'CARGARVARIABLES' Routine */
      returnInSub = false ;
      AV40Barfin2 = ((0==AV22BarFin) ? 99999999 : AV22BarFin) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Barfin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barfin2), 8, 0));
      AV41Reofin2 = (byte)(((0==AV23ReoFin) ? 9 : AV23ReoFin)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Reofin2", GXutil.str( AV41Reofin2, 1, 0));
      AV42parfin2 = ((GXutil.strcmp("", AV24ParFin)==0) ? httpContext.getMessage( "Z", "") : AV24ParFin) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42parfin2", AV42parfin2);
      AV44BarDisNumto2 = ((GXutil.strcmp("", AV14BarDisNumto)==0) ? httpContext.getMessage( "ZZZZZZZZ", "") : AV14BarDisNumto) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44BarDisNumto2", AV44BarDisNumto2);
      AV45CliFin2 = ((0==AV18CliFin) ? 999999 : AV18CliFin) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45CliFin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliFin2), 6, 0));
      AV46FchFin2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16FchFin)) ? Gx_date : AV16FchFin) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46FchFin2", localUtil.format(AV46FchFin2, "99/99/99"));
      AV47barserto2 = ((GXutil.strcmp("", AV39BarSerto)==0) ? httpContext.getMessage( "ZZZZZZZZZZZZZZZZ", "") : AV39BarSerto) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47barserto2", AV47barserto2);
      AV48BarColNomto2 = ((GXutil.strcmp("", AV11BarColNomto)==0) ? httpContext.getMessage( "ZZZZZZZZZZZZZ", "") : AV11BarColNomto) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarColNomto2", AV48BarColNomto2);
      AV49BarColNumto2 = ((0==AV12BarColNumto) ? 999999 : AV12BarColNumto) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarColNumto2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarColNumto2), 6, 0));
      AV55Enccli3 = ((GXutil.strcmp("", AV57BarEncClito)==0) ? httpContext.getMessage( "ZZZZZZZZZZZZZZZZZZZZ", "") : AV57BarEncClito) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Enccli3", AV55Enccli3);
      AV43ControlesdeCalidad_json = AV29ControlesdeCalidad_SDT.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ControlesdeCalidad_json", AV43ControlesdeCalidad_json);
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
      pa2BR2( ) ;
      ws2BR2( ) ;
      we2BR2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714353146", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wtn0003_wp.js", "?202681714353146", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1682( )
   {
      chkavControlesdecalidad_sdt__seleccionar.setInternalname( "CONTROLESDECALIDAD_SDT__SELECCIONAR_"+sGXsfl_168_idx );
      edtavControlesdecalidad_sdt__cctcod_Internalname = "CONTROLESDECALIDAD_SDT__CCTCOD_"+sGXsfl_168_idx ;
      edtavControlesdecalidad_sdt__cctdsc_Internalname = "CONTROLESDECALIDAD_SDT__CCTDSC_"+sGXsfl_168_idx ;
   }

   public void subsflControlProps_fel_1682( )
   {
      chkavControlesdecalidad_sdt__seleccionar.setInternalname( "CONTROLESDECALIDAD_SDT__SELECCIONAR_"+sGXsfl_168_fel_idx );
      edtavControlesdecalidad_sdt__cctcod_Internalname = "CONTROLESDECALIDAD_SDT__CCTCOD_"+sGXsfl_168_fel_idx ;
      edtavControlesdecalidad_sdt__cctdsc_Internalname = "CONTROLESDECALIDAD_SDT__CCTDSC_"+sGXsfl_168_fel_idx ;
   }

   public void sendrow_1682( )
   {
      subsflControlProps_1682( ) ;
      wb2BR0( ) ;
      if ( ( subGridcontrolesdecalidad_sdts_Rows * 1 == 0 ) || ( nGXsfl_168_idx <= subgridcontrolesdecalidad_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridcontrolesdecalidad_sdtsRow = GXWebRow.GetNew(context,Gridcontrolesdecalidad_sdtsContainer) ;
         if ( subGridcontrolesdecalidad_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridcontrolesdecalidad_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridcontrolesdecalidad_sdts_Class, "") != 0 )
            {
               subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridcontrolesdecalidad_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridcontrolesdecalidad_sdts_Backstyle = (byte)(0) ;
            subGridcontrolesdecalidad_sdts_Backcolor = subGridcontrolesdecalidad_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridcontrolesdecalidad_sdts_Class, "") != 0 )
            {
               subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridcontrolesdecalidad_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridcontrolesdecalidad_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridcontrolesdecalidad_sdts_Class, "") != 0 )
            {
               subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"Odd" ;
            }
            subGridcontrolesdecalidad_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridcontrolesdecalidad_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridcontrolesdecalidad_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_168_idx) % (2))) == 0 )
            {
               subGridcontrolesdecalidad_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolesdecalidad_sdts_Class, "") != 0 )
               {
                  subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridcontrolesdecalidad_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolesdecalidad_sdts_Class, "") != 0 )
               {
                  subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridcontrolesdecalidad_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_168_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridcontrolesdecalidad_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavControlesdecalidad_sdt__seleccionar.getEnabled()!=0)&&(chkavControlesdecalidad_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 169,'',false,'"+sGXsfl_168_idx+"',168)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CONTROLESDECALIDAD_SDT__SELECCIONAR_" + sGXsfl_168_idx ;
         chkavControlesdecalidad_sdt__seleccionar.setName( GXCCtl );
         chkavControlesdecalidad_sdt__seleccionar.setWebtags( "" );
         chkavControlesdecalidad_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavControlesdecalidad_sdt__seleccionar.getInternalname(), "TitleCaption", chkavControlesdecalidad_sdt__seleccionar.getCaption(), !bGXsfl_168_Refreshing);
         chkavControlesdecalidad_sdt__seleccionar.setCheckedValue( "false" );
         Gridcontrolesdecalidad_sdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavControlesdecalidad_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)).getgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(169, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavControlesdecalidad_sdt__seleccionar.getEnabled()!=0)&&(chkavControlesdecalidad_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,169);\"" : " ")});
         /* Subfile cell */
         if ( Gridcontrolesdecalidad_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolesdecalidad_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlesdecalidad_sdt__cctcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)).getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlesdecalidad_sdt__cctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)).getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)).getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlesdecalidad_sdt__cctcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlesdecalidad_sdt__cctcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(168),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridcontrolesdecalidad_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolesdecalidad_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlesdecalidad_sdt__cctdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV29ControlesdeCalidad_SDT.elementAt(-1+AV60GXV1)).getgxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlesdecalidad_sdt__cctdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlesdecalidad_sdt__cctdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(168),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2BR2( ) ;
         Gridcontrolesdecalidad_sdtsContainer.AddRow(Gridcontrolesdecalidad_sdtsRow);
         nGXsfl_168_idx = ((subGridcontrolesdecalidad_sdts_Islastpage==1)&&(nGXsfl_168_idx+1>subgridcontrolesdecalidad_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_168_idx+1) ;
         sGXsfl_168_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_168_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1682( ) ;
      }
      /* End function sendrow_1682 */
   }

   public void startgridcontrol168( )
   {
      if ( Gridcontrolesdecalidad_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridcontrolesdecalidad_sdtsContainer"+"DivS\" data-gxgridid=\"168\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridcontrolesdecalidad_sdts_Internalname, subGridcontrolesdecalidad_sdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridcontrolesdecalidad_sdts_Backcolorstyle == 0 )
         {
            subGridcontrolesdecalidad_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridcontrolesdecalidad_sdts_Class) > 0 )
            {
               subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridcontrolesdecalidad_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridcontrolesdecalidad_sdts_Backcolorstyle == 1 )
            {
               subGridcontrolesdecalidad_sdts_Titlebackcolor = subGridcontrolesdecalidad_sdts_Allbackcolor ;
               if ( GXutil.len( subGridcontrolesdecalidad_sdts_Class) > 0 )
               {
                  subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridcontrolesdecalidad_sdts_Class) > 0 )
               {
                  subGridcontrolesdecalidad_sdts_Linesclass = subGridcontrolesdecalidad_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OP", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolesdecalidad_sdts");
      }
      else
      {
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolesdecalidad_sdts");
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Header", subGridcontrolesdecalidad_sdts_Header);
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridcontrolesdecalidad_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolesdecalidad_sdtsContainer.AddColumnProperties(Gridcontrolesdecalidad_sdtsColumn);
         Gridcontrolesdecalidad_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolesdecalidad_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlesdecalidad_sdt__cctcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddColumnProperties(Gridcontrolesdecalidad_sdtsColumn);
         Gridcontrolesdecalidad_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolesdecalidad_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlesdecalidad_sdt__cctdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddColumnProperties(Gridcontrolesdecalidad_sdtsColumn);
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolesdecalidad_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridcontrolesdecalidad_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavBarini_Internalname = "vBARINI" ;
      edtavReoini_Internalname = "vREOINI" ;
      edtavParini_Internalname = "vPARINI" ;
      edtavBarfin_Internalname = "vBARFIN" ;
      edtavReofin_Internalname = "vREOFIN" ;
      edtavParfin_Internalname = "vPARFIN" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavBarserfrom_Internalname = "vBARSERFROM" ;
      edtavBarserto_Internalname = "vBARSERTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockcombo_cliini_Internalname = "TEXTBLOCKCOMBO_CLIINI" ;
      Combo_cliini_Internalname = "COMBO_CLIINI" ;
      divTablesplittedcliini_Internalname = "TABLESPLITTEDCLIINI" ;
      lblTextblockcombo_clifin_Internalname = "TEXTBLOCKCOMBO_CLIFIN" ;
      Combo_clifin_Internalname = "COMBO_CLIFIN" ;
      divTablesplittedclifin_Internalname = "TABLESPLITTEDCLIFIN" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavFchini_Internalname = "vFCHINI" ;
      edtavFchfin_Internalname = "vFCHFIN" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarencclifrom_Internalname = "vBARENCCLIFROM" ;
      edtavBarencclito_Internalname = "vBARENCCLITO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBardisnumfrom_Internalname = "vBARDISNUMFROM" ;
      edtavBardisnumto_Internalname = "vBARDISNUMTO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarcolnomfrom_Internalname = "vBARCOLNOMFROM" ;
      edtavBarcolnumfrom_Internalname = "vBARCOLNUMFROM" ;
      edtavBarcolnomto_Internalname = "vBARCOLNOMTO" ;
      edtavBarcolnumto_Internalname = "vBARCOLNUMTO" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      bttBtnexcel_Internalname = "BTNEXCEL" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      chkavControlesdecalidad_sdt__seleccionar.setInternalname( "CONTROLESDECALIDAD_SDT__SELECCIONAR" );
      edtavControlesdecalidad_sdt__cctcod_Internalname = "CONTROLESDECALIDAD_SDT__CCTCOD" ;
      edtavControlesdecalidad_sdt__cctdsc_Internalname = "CONTROLESDECALIDAD_SDT__CCTDSC" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Internalname = "GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR" ;
      divGridcontrolesdecalidad_sdtstablewithpaginationbar_Internalname = "GRIDCONTROLESDECALIDAD_SDTSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = "DVPANEL_UNNAMEDTABLE9" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCliini_Internalname = "vCLIINI" ;
      edtavClifin_Internalname = "vCLIFIN" ;
      Gridcontrolesdecalidad_sdts_empowerer_Internalname = "GRIDCONTROLESDECALIDAD_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridcontrolesdecalidad_sdts_Internalname = "GRIDCONTROLESDECALIDAD_SDTS" ;
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
      subGridcontrolesdecalidad_sdts_Allowcollapsing = (byte)(0) ;
      subGridcontrolesdecalidad_sdts_Allowselection = (byte)(0) ;
      subGridcontrolesdecalidad_sdts_Header = "" ;
      edtavControlesdecalidad_sdt__cctdsc_Jsonclick = "" ;
      edtavControlesdecalidad_sdt__cctdsc_Enabled = 0 ;
      edtavControlesdecalidad_sdt__cctcod_Jsonclick = "" ;
      edtavControlesdecalidad_sdt__cctcod_Enabled = 0 ;
      chkavControlesdecalidad_sdt__seleccionar.setCaption( "" );
      chkavControlesdecalidad_sdt__seleccionar.setVisible( -1 );
      chkavControlesdecalidad_sdt__seleccionar.setEnabled( 1 );
      subGridcontrolesdecalidad_sdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridcontrolesdecalidad_sdts_Backcolorstyle = (byte)(0) ;
      edtavControlesdecalidad_sdt__cctdsc_Enabled = -1 ;
      edtavControlesdecalidad_sdt__cctcod_Enabled = -1 ;
      edtavClifin_Jsonclick = "" ;
      edtavClifin_Visible = 1 ;
      edtavCliini_Jsonclick = "" ;
      edtavCliini_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "" ;
      edtavBarcolnumto_Jsonclick = "" ;
      edtavBarcolnumto_Enabled = 1 ;
      edtavBarcolnomto_Jsonclick = "" ;
      edtavBarcolnomto_Enabled = 1 ;
      edtavBarcolnumfrom_Jsonclick = "" ;
      edtavBarcolnumfrom_Enabled = 1 ;
      edtavBarcolnomfrom_Jsonclick = "" ;
      edtavBarcolnomfrom_Enabled = 1 ;
      edtavBardisnumto_Jsonclick = "" ;
      edtavBardisnumto_Enabled = 1 ;
      edtavBardisnumfrom_Jsonclick = "" ;
      edtavBardisnumfrom_Enabled = 1 ;
      divUnnamedtable6_Visible = 1 ;
      edtavBarencclito_Jsonclick = "" ;
      edtavBarencclito_Enabled = 1 ;
      edtavBarencclifrom_Jsonclick = "" ;
      edtavBarencclifrom_Enabled = 1 ;
      divUnnamedtable5_Visible = 1 ;
      edtavFchfin_Jsonclick = "" ;
      edtavFchfin_Enabled = 1 ;
      edtavFchini_Jsonclick = "" ;
      edtavFchini_Enabled = 1 ;
      Combo_clifin_Caption = "" ;
      Combo_cliini_Caption = "" ;
      edtavBarserto_Jsonclick = "" ;
      edtavBarserto_Enabled = 1 ;
      edtavBarserfrom_Jsonclick = "" ;
      edtavBarserfrom_Enabled = 1 ;
      edtavParfin_Jsonclick = "" ;
      edtavParfin_Enabled = 1 ;
      edtavReofin_Jsonclick = "" ;
      edtavReofin_Enabled = 1 ;
      edtavBarfin_Jsonclick = "" ;
      edtavBarfin_Enabled = 1 ;
      edtavParini_Jsonclick = "" ;
      edtavParini_Enabled = 1 ;
      edtavReoini_Jsonclick = "" ;
      edtavReoini_Enabled = 1 ;
      edtavBarini_Jsonclick = "" ;
      edtavBarini_Enabled = 1 ;
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
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "Controles de Calidad", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridcontrolesdecalidad_sdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridcontrolesdecalidad_sdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridcontrolesdecalidad_sdtspaginationbar_Pagestoshow = 5 ;
      Gridcontrolesdecalidad_sdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridcontrolesdecalidad_sdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridcontrolesdecalidad_sdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridcontrolesdecalidad_sdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridcontrolesdecalidad_sdtspaginationbar_Class = "PaginationBar" ;
      Combo_clifin_Emptyitemtext = "Todos" ;
      Combo_clifin_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cliini_Emptyitemtext = "Todos" ;
      Combo_cliini_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta Datos CC", "") );
      subGridcontrolesdecalidad_sdts_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "CONTROLESDECALIDAD_SDT__SELECCIONAR_" + sGXsfl_168_idx ;
      chkavControlesdecalidad_sdt__seleccionar.setName( GXCCtl );
      chkavControlesdecalidad_sdt__seleccionar.setWebtags( "" );
      chkavControlesdecalidad_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavControlesdecalidad_sdt__seleccionar.getInternalname(), "TitleCaption", chkavControlesdecalidad_sdt__seleccionar.getCaption(), !bGXsfl_168_Refreshing);
      chkavControlesdecalidad_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLESDECALIDAD_SDTS_nEOF'},{av:'subGridcontrolesdecalidad_sdts_Rows',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'Rows'},{av:'AV29ControlesdeCalidad_SDT',fld:'vCONTROLESDECALIDAD_SDT',grid:168,pic:'',hsh:true},{av:'nGXsfl_168_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:168},{av:'nRC_GXsfl_168',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'GridRC',grid:168},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV32GridControlesdeCalidad_SDTsCurrentPage',fld:'vGRIDCONTROLESDECALIDAD_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridControlesdeCalidad_SDTsPageCount',fld:'vGRIDCONTROLESDECALIDAD_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDCONTROLESDECALIDAD_SDTS.LOAD","{handler:'e182BR2',iparms:[]");
      setEventMetadata("GRIDCONTROLESDECALIDAD_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e112BR2',iparms:[{av:'GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLESDECALIDAD_SDTS_nEOF'},{av:'subGridcontrolesdecalidad_sdts_Rows',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'Rows'},{av:'AV29ControlesdeCalidad_SDT',fld:'vCONTROLESDECALIDAD_SDT',grid:168,pic:'',hsh:true},{av:'nGXsfl_168_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:168},{av:'nRC_GXsfl_168',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'GridRC',grid:168},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage',ctrl:'GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122BR2',iparms:[{av:'GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLESDECALIDAD_SDTS_nEOF'},{av:'subGridcontrolesdecalidad_sdts_Rows',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'Rows'},{av:'AV29ControlesdeCalidad_SDT',fld:'vCONTROLESDECALIDAD_SDT',grid:168,pic:'',hsh:true},{av:'nGXsfl_168_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:168},{av:'nRC_GXsfl_168',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'GridRC',grid:168},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDCONTROLESDECALIDAD_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridcontrolesdecalidad_sdts_Rows',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'Rows'}]}");
      setEventMetadata("'DOEXCEL'","{handler:'e132BR2',iparms:[{av:'AV29ControlesdeCalidad_SDT',fld:'vCONTROLESDECALIDAD_SDT',grid:168,pic:'',hsh:true},{av:'nGXsfl_168_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:168},{av:'GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_168',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'GridRC',grid:168},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV20ReoIni',fld:'vREOINI',pic:'9'},{av:'AV21ParIni',fld:'vPARINI',pic:''},{av:'AV40Barfin2',fld:'vBARFIN2',pic:'ZZZZZZZ9'},{av:'AV41Reofin2',fld:'vREOFIN2',pic:'9'},{av:'AV42parfin2',fld:'vPARFIN2',pic:''},{av:'AV13BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV44BarDisNumto2',fld:'vBARDISNUMTO2',pic:''},{av:'AV17CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV45CliFin2',fld:'vCLIFIN2',pic:'ZZZZZ9'},{av:'AV15FchIni',fld:'vFCHINI',pic:''},{av:'AV46FchFin2',fld:'vFCHFIN2',pic:''},{av:'AV38BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV47barserto2',fld:'vBARSERTO2',pic:''},{av:'AV9BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV48BarColNomto2',fld:'vBARCOLNOMTO2',pic:''},{av:'AV10BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV49BarColNumto2',fld:'vBARCOLNUMTO2',pic:'ZZZZZ9'},{av:'AV56BarEncClifrom',fld:'vBARENCCLIFROM',pic:''},{av:'AV55Enccli3',fld:'vENCCLI3',pic:''},{av:'AV43ControlesdeCalidad_json',fld:'vCONTROLESDECALIDAD_JSON',pic:''},{av:'AV22BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV23ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV24ParFin',fld:'vPARFIN',pic:''},{av:'AV14BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV18CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV16FchFin',fld:'vFCHFIN',pic:''},{av:'AV39BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV12BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV57BarEncClito',fld:'vBARENCCLITO',pic:''}]");
      setEventMetadata("'DOEXCEL'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV40Barfin2',fld:'vBARFIN2',pic:'ZZZZZZZ9'},{av:'AV41Reofin2',fld:'vREOFIN2',pic:'9'},{av:'AV42parfin2',fld:'vPARFIN2',pic:''},{av:'AV44BarDisNumto2',fld:'vBARDISNUMTO2',pic:''},{av:'AV45CliFin2',fld:'vCLIFIN2',pic:'ZZZZZ9'},{av:'AV46FchFin2',fld:'vFCHFIN2',pic:''},{av:'AV47barserto2',fld:'vBARSERTO2',pic:''},{av:'AV48BarColNomto2',fld:'vBARCOLNOMTO2',pic:''},{av:'AV49BarColNumto2',fld:'vBARCOLNUMTO2',pic:'ZZZZZ9'},{av:'AV55Enccli3',fld:'vENCCLI3',pic:''},{av:'AV43ControlesdeCalidad_json',fld:'vCONTROLESDECALIDAD_JSON',pic:''}]}");
      setEventMetadata("'DOPDF'","{handler:'e152BR2',iparms:[{av:'AV29ControlesdeCalidad_SDT',fld:'vCONTROLESDECALIDAD_SDT',grid:168,pic:'',hsh:true},{av:'nGXsfl_168_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:168},{av:'GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_168',ctrl:'GRIDCONTROLESDECALIDAD_SDTS',prop:'GridRC',grid:168},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV20ReoIni',fld:'vREOINI',pic:'9'},{av:'AV21ParIni',fld:'vPARINI',pic:''},{av:'AV40Barfin2',fld:'vBARFIN2',pic:'ZZZZZZZ9'},{av:'AV41Reofin2',fld:'vREOFIN2',pic:'9'},{av:'AV42parfin2',fld:'vPARFIN2',pic:''},{av:'AV13BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV44BarDisNumto2',fld:'vBARDISNUMTO2',pic:''},{av:'AV17CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV45CliFin2',fld:'vCLIFIN2',pic:'ZZZZZ9'},{av:'AV43ControlesdeCalidad_json',fld:'vCONTROLESDECALIDAD_JSON',pic:''},{av:'AV15FchIni',fld:'vFCHINI',pic:''},{av:'AV46FchFin2',fld:'vFCHFIN2',pic:''},{av:'AV38BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV47barserto2',fld:'vBARSERTO2',pic:''},{av:'AV9BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV48BarColNomto2',fld:'vBARCOLNOMTO2',pic:''},{av:'AV10BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV49BarColNumto2',fld:'vBARCOLNUMTO2',pic:'ZZZZZ9'},{av:'AV56BarEncClifrom',fld:'vBARENCCLIFROM',pic:''},{av:'AV55Enccli3',fld:'vENCCLI3',pic:''},{av:'AV22BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV23ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV24ParFin',fld:'vPARFIN',pic:''},{av:'AV14BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV18CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV16FchFin',fld:'vFCHFIN',pic:''},{av:'AV39BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV12BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV57BarEncClito',fld:'vBARENCCLITO',pic:''}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV55Enccli3',fld:'vENCCLI3',pic:''},{av:'AV56BarEncClifrom',fld:'vBARENCCLIFROM',pic:''},{av:'AV49BarColNumto2',fld:'vBARCOLNUMTO2',pic:'ZZZZZ9'},{av:'AV10BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV48BarColNomto2',fld:'vBARCOLNOMTO2',pic:''},{av:'AV9BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV47barserto2',fld:'vBARSERTO2',pic:''},{av:'AV38BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV46FchFin2',fld:'vFCHFIN2',pic:''},{av:'AV15FchIni',fld:'vFCHINI',pic:''},{av:'AV43ControlesdeCalidad_json',fld:'vCONTROLESDECALIDAD_JSON',pic:''},{av:'AV45CliFin2',fld:'vCLIFIN2',pic:'ZZZZZ9'},{av:'AV17CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV44BarDisNumto2',fld:'vBARDISNUMTO2',pic:''},{av:'AV13BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV42parfin2',fld:'vPARFIN2',pic:''},{av:'AV41Reofin2',fld:'vREOFIN2',pic:'9'},{av:'AV40Barfin2',fld:'vBARFIN2',pic:'ZZZZZZZ9'},{av:'AV21ParIni',fld:'vPARINI',pic:''},{av:'AV20ReoIni',fld:'vREOINI',pic:'9'},{av:'AV19BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV34EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e142BR2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
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
      Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage = "" ;
      Combo_clifin_Selectedvalue_get = "" ;
      Combo_cliini_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV29ControlesdeCalidad_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>(app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV26DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV25CliIni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV28CliFin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV34EmprCod = "" ;
      AV42parfin2 = "" ;
      AV44BarDisNumto2 = "" ;
      AV46FchFin2 = GXutil.nullDate() ;
      AV47barserto2 = "" ;
      AV48BarColNomto2 = "" ;
      AV55Enccli3 = "" ;
      AV43ControlesdeCalidad_json = "" ;
      Combo_cliini_Selectedvalue_set = "" ;
      Combo_clifin_Selectedvalue_set = "" ;
      Gridcontrolesdecalidad_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV21ParIni = "" ;
      AV24ParFin = "" ;
      AV38BarSerfrom = "" ;
      AV39BarSerto = "" ;
      lblTextblockcombo_cliini_Jsonclick = "" ;
      ucCombo_cliini = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clifin_Jsonclick = "" ;
      ucCombo_clifin = new com.genexus.webpanels.GXUserControl();
      AV15FchIni = GXutil.nullDate() ;
      AV16FchFin = GXutil.nullDate() ;
      AV56BarEncClifrom = "" ;
      AV57BarEncClito = "" ;
      AV13BarDisNumfrom = "" ;
      AV14BarDisNumto = "" ;
      AV9BarColNomfrom = "" ;
      AV11BarColNomto = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      Gridcontrolesdecalidad_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridcontrolesdecalidad_sdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      AV64Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGridcontrolesdecalidad_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV37Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV35EmprNom = "" ;
      AV36UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtControlesdeCalidad_SDT_Item7 = new GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>(app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtControlesdeCalidad_SDT_Item8 = new GXBaseCollection[1] ;
      GXv_int10 = new byte[1] ;
      Gridcontrolesdecalidad_sdtsRow = new com.genexus.webpanels.GXWebRow();
      AV50ControlesdeCalidad_SDTItem = new app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item(remoteHandle, context);
      AV52ExcelFilename = "" ;
      AV53ErrorMessage = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      H02BR2_A10045CliAct = new String[] {""} ;
      H02BR2_A396EmprCod = new String[] {""} ;
      H02BR2_A279CliNom = new String[] {""} ;
      H02BR2_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A13735CliCNom = "" ;
      AV27Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02BR3_A10045CliAct = new String[] {""} ;
      H02BR3_A396EmprCod = new String[] {""} ;
      H02BR3_A279CliNom = new String[] {""} ;
      H02BR3_A252CliCod = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridcontrolesdecalidad_sdts_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      Gridcontrolesdecalidad_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wtn0003_wp__default(),
         new Object[] {
             new Object[] {
            H02BR2_A10045CliAct, H02BR2_A396EmprCod, H02BR2_A279CliNom, H02BR2_A252CliCod
            }
            , new Object[] {
            H02BR3_A10045CliAct, H02BR3_A396EmprCod, H02BR3_A279CliNom, H02BR3_A252CliCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV64Pgmname = "ControlCalidadHTD.Wtn0003_WP" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV64Pgmname = "ControlCalidadHTD.Wtn0003_WP" ;
      Gx_err = (short)(0) ;
      edtavControlesdecalidad_sdt__cctcod_Enabled = 0 ;
      edtavControlesdecalidad_sdt__cctdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDCONTROLESDECALIDAD_SDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV41Reofin2 ;
   private byte AV20ReoIni ;
   private byte AV23ReoFin ;
   private byte nDonePA ;
   private byte subGridcontrolesdecalidad_sdts_Backcolorstyle ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte subGridcontrolesdecalidad_sdts_Backstyle ;
   private byte subGridcontrolesdecalidad_sdts_Titlebackstyle ;
   private byte subGridcontrolesdecalidad_sdts_Allowselection ;
   private byte subGridcontrolesdecalidad_sdts_Allowhovering ;
   private byte subGridcontrolesdecalidad_sdts_Allowcollapsing ;
   private byte subGridcontrolesdecalidad_sdts_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV54Enc20c ;
   private short AV51lineas ;
   private int Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_168 ;
   private int subGridcontrolesdecalidad_sdts_Rows ;
   private int nGXsfl_168_idx=1 ;
   private int AV40Barfin2 ;
   private int AV45CliFin2 ;
   private int AV49BarColNumto2 ;
   private int Gridcontrolesdecalidad_sdtspaginationbar_Pagestoshow ;
   private int AV19BarIni ;
   private int edtavBarini_Enabled ;
   private int edtavReoini_Enabled ;
   private int edtavParini_Enabled ;
   private int AV22BarFin ;
   private int edtavBarfin_Enabled ;
   private int edtavReofin_Enabled ;
   private int edtavParfin_Enabled ;
   private int edtavBarserfrom_Enabled ;
   private int edtavBarserto_Enabled ;
   private int edtavFchini_Enabled ;
   private int edtavFchfin_Enabled ;
   private int divUnnamedtable5_Visible ;
   private int edtavBarencclifrom_Enabled ;
   private int edtavBarencclito_Enabled ;
   private int divUnnamedtable6_Visible ;
   private int edtavBardisnumfrom_Enabled ;
   private int edtavBardisnumto_Enabled ;
   private int edtavBarcolnomfrom_Enabled ;
   private int AV10BarColNumfrom ;
   private int edtavBarcolnumfrom_Enabled ;
   private int edtavBarcolnomto_Enabled ;
   private int AV12BarColNumto ;
   private int edtavBarcolnumto_Enabled ;
   private int AV60GXV1 ;
   private int edtavPgmname_Enabled ;
   private int AV17CliIni ;
   private int edtavCliini_Visible ;
   private int AV18CliFin ;
   private int edtavClifin_Visible ;
   private int subGridcontrolesdecalidad_sdts_Islastpage ;
   private int edtavControlesdecalidad_sdt__cctcod_Enabled ;
   private int edtavControlesdecalidad_sdt__cctdsc_Enabled ;
   private int GRIDCONTROLESDECALIDAD_SDTS_nGridOutOfScope ;
   private int nGXsfl_168_fel_idx=1 ;
   private int AV31PageToGo ;
   private int AV65GXV5 ;
   private int AV66GXV6 ;
   private int A252CliCod ;
   private int idxLst ;
   private int subGridcontrolesdecalidad_sdts_Backcolor ;
   private int subGridcontrolesdecalidad_sdts_Allbackcolor ;
   private int subGridcontrolesdecalidad_sdts_Titlebackcolor ;
   private int subGridcontrolesdecalidad_sdts_Selectedindex ;
   private int subGridcontrolesdecalidad_sdts_Selectioncolor ;
   private int subGridcontrolesdecalidad_sdts_Hoveringcolor ;
   private long GRIDCONTROLESDECALIDAD_SDTS_nFirstRecordOnPage ;
   private long AV32GridControlesdeCalidad_SDTsCurrentPage ;
   private long AV33GridControlesdeCalidad_SDTsPageCount ;
   private long GRIDCONTROLESDECALIDAD_SDTS_nCurrentRecord ;
   private long GRIDCONTROLESDECALIDAD_SDTS_nRecordCount ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Selectedpage ;
   private String Combo_clifin_Selectedvalue_get ;
   private String Combo_cliini_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_168_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV34EmprCod ;
   private String AV42parfin2 ;
   private String AV44BarDisNumto2 ;
   private String AV47barserto2 ;
   private String AV48BarColNomto2 ;
   private String AV55Enccli3 ;
   private String Combo_cliini_Cls ;
   private String Combo_cliini_Selectedvalue_set ;
   private String Combo_cliini_Emptyitemtext ;
   private String Combo_clifin_Cls ;
   private String Combo_clifin_Selectedvalue_set ;
   private String Combo_clifin_Emptyitemtext ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Class ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Pagingbuttonsposition ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Pagingcaptionposition ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Emptygridclass ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageoptions ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Previous ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Next ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Caption ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Emptygridcaption ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Gridcontrolesdecalidad_sdts_empowerer_Gridinternalname ;
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
   private String edtavBarini_Internalname ;
   private String TempTags ;
   private String edtavBarini_Jsonclick ;
   private String edtavReoini_Internalname ;
   private String edtavReoini_Jsonclick ;
   private String edtavParini_Internalname ;
   private String AV21ParIni ;
   private String edtavParini_Jsonclick ;
   private String edtavBarfin_Internalname ;
   private String edtavBarfin_Jsonclick ;
   private String edtavReofin_Internalname ;
   private String edtavReofin_Jsonclick ;
   private String edtavParfin_Internalname ;
   private String AV24ParFin ;
   private String edtavParfin_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavBarserfrom_Internalname ;
   private String AV38BarSerfrom ;
   private String edtavBarserfrom_Jsonclick ;
   private String edtavBarserto_Internalname ;
   private String AV39BarSerto ;
   private String edtavBarserto_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedcliini_Internalname ;
   private String lblTextblockcombo_cliini_Internalname ;
   private String lblTextblockcombo_cliini_Jsonclick ;
   private String Combo_cliini_Caption ;
   private String Combo_cliini_Internalname ;
   private String divTablesplittedclifin_Internalname ;
   private String lblTextblockcombo_clifin_Internalname ;
   private String lblTextblockcombo_clifin_Jsonclick ;
   private String Combo_clifin_Caption ;
   private String Combo_clifin_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavFchini_Internalname ;
   private String edtavFchini_Jsonclick ;
   private String edtavFchfin_Internalname ;
   private String edtavFchfin_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarencclifrom_Internalname ;
   private String AV56BarEncClifrom ;
   private String edtavBarencclifrom_Jsonclick ;
   private String edtavBarencclito_Internalname ;
   private String AV57BarEncClito ;
   private String edtavBarencclito_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBardisnumfrom_Internalname ;
   private String AV13BarDisNumfrom ;
   private String edtavBardisnumfrom_Jsonclick ;
   private String edtavBardisnumto_Internalname ;
   private String AV14BarDisNumto ;
   private String edtavBardisnumto_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarcolnomfrom_Internalname ;
   private String AV9BarColNomfrom ;
   private String edtavBarcolnomfrom_Jsonclick ;
   private String edtavBarcolnumfrom_Internalname ;
   private String edtavBarcolnumfrom_Jsonclick ;
   private String edtavBarcolnomto_Internalname ;
   private String AV11BarColNomto ;
   private String edtavBarcolnomto_Jsonclick ;
   private String edtavBarcolnumto_Internalname ;
   private String edtavBarcolnumto_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String divGridcontrolesdecalidad_sdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridcontrolesdecalidad_sdts_Internalname ;
   private String Gridcontrolesdecalidad_sdtspaginationbar_Internalname ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV64Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavCliini_Internalname ;
   private String edtavCliini_Jsonclick ;
   private String edtavClifin_Internalname ;
   private String edtavClifin_Jsonclick ;
   private String Gridcontrolesdecalidad_sdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavControlesdecalidad_sdt__cctcod_Internalname ;
   private String edtavControlesdecalidad_sdt__cctdsc_Internalname ;
   private String sGXsfl_168_fel_idx="0001" ;
   private String AV37Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV35EmprNom ;
   private String AV36UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String subGridcontrolesdecalidad_sdts_Class ;
   private String subGridcontrolesdecalidad_sdts_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavControlesdecalidad_sdt__cctcod_Jsonclick ;
   private String edtavControlesdecalidad_sdt__cctdsc_Jsonclick ;
   private String subGridcontrolesdecalidad_sdts_Header ;
   private java.util.Date Gx_date ;
   private java.util.Date AV46FchFin2 ;
   private java.util.Date AV15FchIni ;
   private java.util.Date AV16FchFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Gridcontrolesdecalidad_sdtspaginationbar_Showfirst ;
   private boolean Gridcontrolesdecalidad_sdtspaginationbar_Showprevious ;
   private boolean Gridcontrolesdecalidad_sdtspaginationbar_Shownext ;
   private boolean Gridcontrolesdecalidad_sdtspaginationbar_Showlast ;
   private boolean Gridcontrolesdecalidad_sdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
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
   private boolean bGXsfl_168_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV168 ;
   private boolean gx_refresh_fired ;
   private String AV43ControlesdeCalidad_json ;
   private String AV52ExcelFilename ;
   private String AV53ErrorMessage ;
   private String A13735CliCNom ;
   private com.genexus.webpanels.GXWebGrid Gridcontrolesdecalidad_sdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridcontrolesdecalidad_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridcontrolesdecalidad_sdtsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_cliini ;
   private com.genexus.webpanels.GXUserControl ucCombo_clifin ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolesdecalidad_sdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolesdecalidad_sdts_empowerer ;
   private ICheckbox chkavControlesdecalidad_sdt__seleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H02BR2_A10045CliAct ;
   private String[] H02BR2_A396EmprCod ;
   private String[] H02BR2_A279CliNom ;
   private int[] H02BR2_A252CliCod ;
   private String[] H02BR3_A10045CliAct ;
   private String[] H02BR3_A396EmprCod ;
   private String[] H02BR3_A279CliNom ;
   private int[] H02BR3_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV25CliIni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV28CliFin_Data ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> AV29ControlesdeCalidad_SDT ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> GXt_objcol_SdtControlesdeCalidad_SDT_Item7 ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> GXv_objcol_SdtControlesdeCalidad_SDT_Item8[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV27Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV26DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item AV50ControlesdeCalidad_SDTItem ;
}

final  class wtn0003_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BR2", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BR3", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

