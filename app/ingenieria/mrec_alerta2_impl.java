package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_alerta2_impl extends GXDataArea
{
   public mrec_alerta2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_alerta2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alerta2_impl.class ));
   }

   public mrec_alerta2_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavSegundos = new HTMLChoice();
      chkavFuerarango = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmrec_alertasdts") == 0 )
         {
            gxnrgridmrec_alertasdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmrec_alertasdts") == 0 )
         {
            gxgrgridmrec_alertasdts_refresh_invoke( ) ;
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
            AV19EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9ContCod = httpContext.GetPar( "ContCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9ContCod", AV9ContCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
               AV81SegundosParm = (short)(GXutil.lval( httpContext.GetPar( "SegundosParm"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81SegundosParm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81SegundosParm), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEGUNDOSPARM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81SegundosParm), "ZZZ9")));
               AV64MaqCodJson = httpContext.GetPar( "MaqCodJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64MaqCodJson", AV64MaqCodJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", AV64MaqCodJson));
               AV22FasCodJSon = httpContext.GetPar( "FasCodJSon") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22FasCodJSon", AV22FasCodJSon);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", AV22FasCodJSon));
               AV75ParFasCodJSon = httpContext.GetPar( "ParFasCodJSon") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75ParFasCodJSon", AV75ParFasCodJSon);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", AV75ParFasCodJSon));
               AV25FueraRangoParm = GXutil.strtobool( httpContext.GetPar( "FueraRangoParm")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25FueraRangoParm", AV25FueraRangoParm);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFUERARANGOPARM", getSecureSignedToken( "", AV25FueraRangoParm));
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

   public void gxnrgridmrec_alertasdts_newrow_invoke( )
   {
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmrec_alertasdts_newrow( ) ;
      /* End function gxnrGridmrec_alertasdts_newrow_invoke */
   }

   public void gxgrgridmrec_alertasdts_refresh_invoke( )
   {
      subGridmrec_alertasdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmrec_alertasdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12Datos);
      AV24FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
      AV19EmprCod = httpContext.GetPar( "EmprCod") ;
      AV9ContCod = httpContext.GetPar( "ContCod") ;
      AV81SegundosParm = (short)(GXutil.lval( httpContext.GetPar( "SegundosParm"))) ;
      AV64MaqCodJson = httpContext.GetPar( "MaqCodJson") ;
      AV22FasCodJSon = httpContext.GetPar( "FasCodJSon") ;
      AV75ParFasCodJSon = httpContext.GetPar( "ParFasCodJSon") ;
      AV25FueraRangoParm = GXutil.strtobool( httpContext.GetPar( "FueraRangoParm")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmrec_alertasdts_refresh_invoke */
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
      pa1WC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WC2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_alerta2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ContCod)),GXutil.URLEncode(GXutil.ltrimstr(AV81SegundosParm,4,0)),GXutil.URLEncode(GXutil.rtrim(AV64MaqCodJson)),GXutil.URLEncode(GXutil.rtrim(AV22FasCodJSon)),GXutil.URLEncode(GXutil.rtrim(AV75ParFasCodJSon)),GXutil.URLEncode(GXutil.booltostr(AV25FueraRangoParm))}, new String[] {"EmprCod","ContCod","SegundosParm","MaqCodJson","FasCodJSon","ParFasCodJSon","FueraRangoParm"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEGUNDOSPARM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81SegundosParm), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", AV64MaqCodJson));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", AV22FasCodJSon));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", AV75ParFasCodJSon));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFUERARANGOPARM", getSecureSignedToken( "", AV25FueraRangoParm));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Datos", AV12Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Datos", AV12Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_73, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV63MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV63MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV21FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV21FasCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV74ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV74ParFasCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vELEMENTS", AV18Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vELEMENTS", AV18Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARAMETERS", AV72Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARAMETERS", AV72Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCLICKDATA", AV57ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCLICKDATA", AV57ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMDOUBLECLICKDATA", AV59ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMDOUBLECLICKDATA", AV59ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDRAGANDDROPDATA", AV16DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDRAGANDDROPDATA", AV16DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERCHANGEDDATA", AV23FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERCHANGEDDATA", AV23FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMEXPANDDATA", AV60ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMEXPANDDATA", AV60ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCOLLAPSEDATA", AV58ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCOLLAPSEDATA", AV58ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDMREC_ALERTASDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV51GridMRec_AlertaSDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDMREC_ALERTASDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV52GridMRec_AlertaSDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCRONOMETRO", GXutil.ltrim( localUtil.ntoc( AV10Cronometro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDATOS", AV12Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDATOS", AV12Datos);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vCRONOMETROSTART", AV92CronometroStart);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV9ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD", AV62MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD", AV62MaqCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD", AV20FasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD", AV20FasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD", AV73ParFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD", AV73ParFasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vSEGUNDOSPARM", GXutil.ltrim( localUtil.ntoc( AV81SegundosParm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEGUNDOSPARM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81SegundosParm), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODJSON", AV64MaqCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", AV64MaqCodJson));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCODJSON", AV22FasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", AV22FasCodJSon));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARFASCODJSON", AV75ParFasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", AV75ParFasCodJSon));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vFUERARANGOPARM", AV25FueraRangoParm);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFUERARANGOPARM", getSecureSignedToken( "", AV25FueraRangoParm));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Allowmultipleselection", GXutil.booltostr( Combo_maqcod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_maqcod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Multiplevaluestype", GXutil.rtrim( Combo_maqcod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitemtext", GXutil.rtrim( Combo_maqcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Allowmultipleselection", GXutil.booltostr( Combo_fascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_fascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Multiplevaluestype", GXutil.rtrim( Combo_fascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_set", GXutil.rtrim( Combo_parfascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Allowmultipleselection", GXutil.booltostr( Combo_parfascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_parfascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Multiplevaluestype", GXutil.rtrim( Combo_parfascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Width", GXutil.rtrim( Dvpanel_panelfiltros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autowidth", GXutil.booltostr( Dvpanel_panelfiltros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autoheight", GXutil.booltostr( Dvpanel_panelfiltros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Cls", GXutil.rtrim( Dvpanel_panelfiltros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Title", GXutil.rtrim( Dvpanel_panelfiltros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Collapsible", GXutil.booltostr( Dvpanel_panelfiltros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Collapsed", GXutil.booltostr( Dvpanel_panelfiltros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelfiltros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Iconposition", GXutil.rtrim( Dvpanel_panelfiltros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panelfiltros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "USERCONTROL1_Objectcall", GXutil.rtrim( Usercontrol1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "USERCONTROL1_Objectcall", GXutil.rtrim( Usercontrol1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "USERCONTROL1_Type", GXutil.rtrim( Usercontrol1_Type));
      app.GxWebStd.gx_hidden_field( httpContext, "USERCONTROL1_Charttype", GXutil.rtrim( Usercontrol1_Charttype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Enabled", GXutil.booltostr( Cronometro_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Tickinterval", GXutil.ltrim( localUtil.ntoc( Cronometro_Tickinterval, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Captionclass", GXutil.rtrim( Cronometro_Captionclass));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Captionstyle", GXutil.rtrim( Cronometro_Captionstyle));
      app.GxWebStd.gx_hidden_field( httpContext, "CRONOMETRO_Captionposition", GXutil.rtrim( Cronometro_Captionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridmrec_alertasdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_get", GXutil.rtrim( Combo_parfascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we1WC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WC2( ) ;
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
      return formatLink("app.ingenieria.mrec_alerta2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ContCod)),GXutil.URLEncode(GXutil.ltrimstr(AV81SegundosParm,4,0)),GXutil.URLEncode(GXutil.rtrim(AV64MaqCodJson)),GXutil.URLEncode(GXutil.rtrim(AV22FasCodJSon)),GXutil.URLEncode(GXutil.rtrim(AV75ParFasCodJSon)),GXutil.URLEncode(GXutil.booltostr(AV25FueraRangoParm))}, new String[] {"EmprCod","ContCod","SegundosParm","MaqCodJson","FasCodJSon","ParFasCodJSon","FueraRangoParm"})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRec_Alerta2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Alertas", "") ;
   }

   public void wb1WC0( )
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
         ucDvpanel_panelfiltros.setProperty("Width", Dvpanel_panelfiltros_Width);
         ucDvpanel_panelfiltros.setProperty("AutoWidth", Dvpanel_panelfiltros_Autowidth);
         ucDvpanel_panelfiltros.setProperty("AutoHeight", Dvpanel_panelfiltros_Autoheight);
         ucDvpanel_panelfiltros.setProperty("Cls", Dvpanel_panelfiltros_Cls);
         ucDvpanel_panelfiltros.setProperty("Title", Dvpanel_panelfiltros_Title);
         ucDvpanel_panelfiltros.setProperty("Collapsible", Dvpanel_panelfiltros_Collapsible);
         ucDvpanel_panelfiltros.setProperty("Collapsed", Dvpanel_panelfiltros_Collapsed);
         ucDvpanel_panelfiltros.setProperty("ShowCollapseIcon", Dvpanel_panelfiltros_Showcollapseicon);
         ucDvpanel_panelfiltros.setProperty("IconPosition", Dvpanel_panelfiltros_Iconposition);
         ucDvpanel_panelfiltros.setProperty("AutoScroll", Dvpanel_panelfiltros_Autoscroll);
         ucDvpanel_panelfiltros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelfiltros_Internalname, "DVPANEL_PANELFILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELFILTROSContainer"+"PanelFiltros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelfiltros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavSegundos.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavSegundos.getInternalname(), httpContext.getMessage( "Intervalo ", ""), " AttributeFLLabel BootstrapTooltipRightLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavSegundos, cmbavSegundos.getInternalname(), GXutil.trim( GXutil.str( AV80Segundos, 4, 0)), 1, cmbavSegundos.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", cmbavSegundos.getTooltip(), 1, cmbavSegundos.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL BootstrapTooltipRight", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "", true, (byte)(0), "HLP_Ingenieria\\MRec_Alerta2.htm");
         cmbavSegundos.setValue( GXutil.trim( GXutil.str( AV80Segundos, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos.getInternalname(), "Values", cmbavSegundos.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Máquina(s)", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("AllowMultipleSelection", Combo_maqcod_Allowmultipleselection);
         ucCombo_maqcod.setProperty("IncludeOnlySelectedOption", Combo_maqcod_Includeonlyselectedoption);
         ucCombo_maqcod.setProperty("MultipleValuesType", Combo_maqcod_Multiplevaluestype);
         ucCombo_maqcod.setProperty("EmptyItemText", Combo_maqcod_Emptyitemtext);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV63MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascod_Internalname, httpContext.getMessage( "Fase(s)", ""), "", "", lblTextblockcombo_fascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
         ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
         ucCombo_fascod.setProperty("AllowMultipleSelection", Combo_fascod_Allowmultipleselection);
         ucCombo_fascod.setProperty("IncludeOnlySelectedOption", Combo_fascod_Includeonlyselectedoption);
         ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
         ucCombo_fascod.setProperty("MultipleValuesType", Combo_fascod_Multiplevaluestype);
         ucCombo_fascod.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_fascod.setProperty("DropDownOptionsData", AV21FasCod_Data);
         ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedparfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_parfascod_Internalname, httpContext.getMessage( "Parámetro(s)", ""), "", "", lblTextblockcombo_parfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_parfascod.setProperty("Caption", Combo_parfascod_Caption);
         ucCombo_parfascod.setProperty("Cls", Combo_parfascod_Cls);
         ucCombo_parfascod.setProperty("AllowMultipleSelection", Combo_parfascod_Allowmultipleselection);
         ucCombo_parfascod.setProperty("IncludeOnlySelectedOption", Combo_parfascod_Includeonlyselectedoption);
         ucCombo_parfascod.setProperty("EmptyItem", Combo_parfascod_Emptyitem);
         ucCombo_parfascod.setProperty("MultipleValuesType", Combo_parfascod_Multiplevaluestype);
         ucCombo_parfascod.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_parfascod.setProperty("DropDownOptionsData", AV74ParFasCod_Data);
         ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFuerarango.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFuerarango.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFuerarango.getInternalname(), GXutil.booltostr( AV24FueraRango), "", httpContext.getMessage( "Error", ""), 1, chkavFuerarango.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(50, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,50);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblActualizar_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fas fa-search fa-3x\"></i>", ""), "", "", lblActualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOACTUALIZAR\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Actualizar resultados...", ""), 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Alerta2.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_55_1WC2( true) ;
      }
      else
      {
         wb_table1_55_1WC2( false) ;
      }
      return  ;
   }

   public void wb_table1_55_1WC2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUsercontrol1.setProperty("Elements", AV18Elements);
         ucUsercontrol1.setProperty("Parameters", AV72Parameters);
         ucUsercontrol1.setProperty("Type", Usercontrol1_Type);
         ucUsercontrol1.setProperty("Title", Usercontrol1_Title);
         ucUsercontrol1.setProperty("ChartType", Usercontrol1_Charttype);
         ucUsercontrol1.setProperty("ItemClickData", AV57ItemClickData);
         ucUsercontrol1.setProperty("ItemDoubleClickData", AV59ItemDoubleClickData);
         ucUsercontrol1.setProperty("DragAndDropData", AV16DragAndDropData);
         ucUsercontrol1.setProperty("FilterChangedData", AV23FilterChangedData);
         ucUsercontrol1.setProperty("ItemExpandData", AV60ItemExpandData);
         ucUsercontrol1.setProperty("ItemCollapseData", AV58ItemCollapseData);
         ucUsercontrol1.render(context, "queryviewer", Usercontrol1_Internalname, "USERCONTROL1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridmrec_alertasdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridmrec_alertasdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol73( ) ;
      }
      if ( wbEnd == 73 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_73 = (int)(nGXsfl_73_idx-1) ;
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV95GXV1 = nGXsfl_73_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridmrec_alertasdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridmrec_alertasdts", Gridmrec_alertasdtsContainer, subGridmrec_alertasdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData", Gridmrec_alertasdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData"+"V", Gridmrec_alertasdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridmrec_alertasdtsContainerData"+"V"+"\" value='"+Gridmrec_alertasdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridmrec_alertasdtspaginationbar.setProperty("Class", Gridmrec_alertasdtspaginationbar_Class);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowFirst", Gridmrec_alertasdtspaginationbar_Showfirst);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowPrevious", Gridmrec_alertasdtspaginationbar_Showprevious);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowNext", Gridmrec_alertasdtspaginationbar_Shownext);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowLast", Gridmrec_alertasdtspaginationbar_Showlast);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagesToShow", Gridmrec_alertasdtspaginationbar_Pagestoshow);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagingButtonsPosition", Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagingCaptionPosition", Gridmrec_alertasdtspaginationbar_Pagingcaptionposition);
         ucGridmrec_alertasdtspaginationbar.setProperty("EmptyGridClass", Gridmrec_alertasdtspaginationbar_Emptygridclass);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageSelector", Gridmrec_alertasdtspaginationbar_Rowsperpageselector);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageOptions", Gridmrec_alertasdtspaginationbar_Rowsperpageoptions);
         ucGridmrec_alertasdtspaginationbar.setProperty("Previous", Gridmrec_alertasdtspaginationbar_Previous);
         ucGridmrec_alertasdtspaginationbar.setProperty("Next", Gridmrec_alertasdtspaginationbar_Next);
         ucGridmrec_alertasdtspaginationbar.setProperty("Caption", Gridmrec_alertasdtspaginationbar_Caption);
         ucGridmrec_alertasdtspaginationbar.setProperty("EmptyGridCaption", Gridmrec_alertasdtspaginationbar_Emptygridcaption);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageCaption", Gridmrec_alertasdtspaginationbar_Rowsperpagecaption);
         ucGridmrec_alertasdtspaginationbar.setProperty("CurrentPage", AV51GridMRec_AlertaSDTsCurrentPage);
         ucGridmrec_alertasdtspaginationbar.setProperty("PageCount", AV52GridMRec_AlertaSDTsPageCount);
         ucGridmrec_alertasdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridmrec_alertasdtspaginationbar_Internalname, "GRIDMREC_ALERTASDTSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablemasdetalles_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnvolver_Internalname, "gx.evt.setGridEvt("+GXutil.str( 73, 2, 0)+","+"null"+");", httpContext.getMessage( "Volver", ""), bttBtnvolver_Jsonclick, 5, httpContext.getMessage( "Volver", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOVOLVER\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec_Alerta2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop30", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecronometro_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_105_1WC2( true) ;
      }
      else
      {
         wb_table2_105_1WC2( false) ;
      }
      return  ;
   }

   public void wb_table2_105_1WC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV114Pgmname), GXutil.rtrim( localUtil.format( AV114Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Alerta2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridmrec_alertasdts_empowerer.render(context, "wwp.gridempowerer", Gridmrec_alertasdts_empowerer_Internalname, "GRIDMREC_ALERTASDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 73 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV95GXV1 = nGXsfl_73_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridmrec_alertasdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridmrec_alertasdts", Gridmrec_alertasdtsContainer, subGridmrec_alertasdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData", Gridmrec_alertasdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData"+"V", Gridmrec_alertasdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridmrec_alertasdtsContainerData"+"V"+"\" value='"+Gridmrec_alertasdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1WC2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Alertas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WC0( ) ;
   }

   public void ws1WC2( )
   {
      start1WC2( ) ;
      evt1WC2( ) ;
   }

   public void evt1WC2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111WC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121WC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCRONOMETRO.TICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131WC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOVOLVER'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoVolver' */
                           e141WC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoActualizar' */
                           e151WC2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 24), "GRIDMREC_ALERTASDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_73_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_732( ) ;
                           AV95GXV1 = (int)(nGXsfl_73_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
                           if ( ( AV12Datos.size() >= AV95GXV1 ) && ( AV95GXV1 > 0 ) )
                           {
                              AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)) );
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
                                 e161WC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171WC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181WC2 ();
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

   public void we1WC2( )
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

   public void pa1WC2( )
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
            GX_FocusControl = cmbavSegundos.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridmrec_alertasdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_732( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         sendrow_732( ) ;
         nGXsfl_73_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_73_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmrec_alertasdtsContainer)) ;
      /* End function gxnrGridmrec_alertasdts_newrow */
   }

   public void gxgrgridmrec_alertasdts_refresh( int subGridmrec_alertasdts_Rows ,
                                                GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV12Datos ,
                                                boolean AV24FueraRango ,
                                                String AV19EmprCod ,
                                                String AV9ContCod ,
                                                short AV81SegundosParm ,
                                                String AV64MaqCodJson ,
                                                String AV22FasCodJSon ,
                                                String AV75ParFasCodJSon ,
                                                boolean AV25FueraRangoParm )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171WC2 ();
      GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
      rf1WC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridmrec_alertasdts_refresh */
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
      if ( cmbavSegundos.getItemCount() > 0 )
      {
         AV80Segundos = (short)(GXutil.lval( cmbavSegundos.getValidValue(GXutil.trim( GXutil.str( AV80Segundos, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Segundos), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavSegundos.setValue( GXutil.trim( GXutil.str( AV80Segundos, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos.getInternalname(), "Values", cmbavSegundos.ToJavascriptSource(), true);
      }
      AV24FueraRango = GXutil.strtobool( GXutil.booltostr( AV24FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FueraRango", AV24FueraRango);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1WC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV114Pgmname = "Ingenieria.MRec_Alerta2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecer_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridmrec_alertasdtsContainer.ClearRows();
      }
      wbStart = (short)(73) ;
      /* Execute user event: Refresh */
      e171WC2 ();
      nGXsfl_73_idx = 1 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_732( ) ;
      bGXsfl_73_Refreshing = true ;
      Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
      Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", "");
      Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.setPageSize( subgridmrec_alertasdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_732( ) ;
         e181WC2 ();
         if ( ( GRIDMREC_ALERTASDTS_nCurrentRecord > 0 ) && ( GRIDMREC_ALERTASDTS_nGridOutOfScope == 0 ) && ( nGXsfl_73_idx == 1 ) )
         {
            GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
            GRIDMREC_ALERTASDTS_nGridOutOfScope = 1 ;
            subgridmrec_alertasdts_firstpage( ) ;
            e181WC2 ();
         }
         wbEnd = (short)(73) ;
         wb1WC0( ) ;
      }
      bGXsfl_73_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WC2( )
   {
   }

   public int subgridmrec_alertasdts_fnc_pagecount( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nRecordCount/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nRecordCount/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridmrec_alertasdts_fnc_recordcount( )
   {
      return AV12Datos.size() ;
   }

   public int subgridmrec_alertasdts_fnc_recordsperpage( )
   {
      if ( subGridmrec_alertasdts_Rows > 0 )
      {
         return subGridmrec_alertasdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridmrec_alertasdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nFirstRecordOnPage/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridmrec_alertasdts_firstpage( )
   {
      GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_alertasdts_nextpage( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( ( GRIDMREC_ALERTASDTS_nRecordCount >= subgridmrec_alertasdts_fnc_recordsperpage( ) ) && ( GRIDMREC_ALERTASDTS_nEOF == 0 ) )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nFirstRecordOnPage+subgridmrec_alertasdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GRIDMREC_ALERTASDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDMREC_ALERTASDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridmrec_alertasdts_previouspage( )
   {
      if ( GRIDMREC_ALERTASDTS_nFirstRecordOnPage >= subgridmrec_alertasdts_fnc_recordsperpage( ) )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nFirstRecordOnPage-subgridmrec_alertasdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_alertasdts_lastpage( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( GRIDMREC_ALERTASDTS_nRecordCount > subgridmrec_alertasdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nRecordCount-subgridmrec_alertasdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nRecordCount-((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridmrec_alertasdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(subgridmrec_alertasdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV114Pgmname = "Ingenieria.MRec_Alerta2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavDatos__mprecer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecer_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161WC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Datos"), AV12Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV63MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV21FasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV74ParFasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vELEMENTS"), AV18Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARAMETERS"), AV72Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCLICKDATA"), AV57ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMDOUBLECLICKDATA"), AV59ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDRAGANDDROPDATA"), AV16DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILTERCHANGEDDATA"), AV23FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMEXPANDDATA"), AV60ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCOLLAPSEDATA"), AV58ItemCollapseData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDATOS"), AV12Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD"), AV62MaqCod);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD"), AV20FasCod);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD"), AV73ParFasCod);
         /* Read saved values. */
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51GridMRec_AlertaSDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDMREC_ALERTASDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV52GridMRec_AlertaSDTsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDMREC_ALERTASDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV10Cronometro = (short)(localUtil.ctol( httpContext.cgiGet( "vCRONOMETRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV92CronometroStart = GXutil.strtobool( httpContext.cgiGet( "vCRONOMETROSTART")) ;
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDMREC_ALERTASDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridmrec_alertasdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Allowmultipleselection")) ;
         Combo_maqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Includeonlyselectedoption")) ;
         Combo_maqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCOD_Multiplevaluestype") ;
         Combo_maqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD_Emptyitemtext") ;
         Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
         Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
         Combo_fascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Allowmultipleselection")) ;
         Combo_fascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeonlyselectedoption")) ;
         Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
         Combo_fascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluestype") ;
         Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
         Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
         Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
         Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
         Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
         Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
         Dvpanel_panelfiltros_Width = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Width") ;
         Dvpanel_panelfiltros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autowidth")) ;
         Dvpanel_panelfiltros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autoheight")) ;
         Dvpanel_panelfiltros_Cls = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Cls") ;
         Dvpanel_panelfiltros_Title = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Title") ;
         Dvpanel_panelfiltros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Collapsible")) ;
         Dvpanel_panelfiltros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Collapsed")) ;
         Dvpanel_panelfiltros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Showcollapseicon")) ;
         Dvpanel_panelfiltros_Iconposition = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Iconposition") ;
         Dvpanel_panelfiltros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autoscroll")) ;
         Usercontrol1_Objectcall = httpContext.cgiGet( "USERCONTROL1_Objectcall") ;
         Usercontrol1_Objectcall = httpContext.cgiGet( "USERCONTROL1_Objectcall") ;
         Usercontrol1_Type = httpContext.cgiGet( "USERCONTROL1_Type") ;
         Usercontrol1_Charttype = httpContext.cgiGet( "USERCONTROL1_Charttype") ;
         Gridmrec_alertasdtspaginationbar_Class = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Class") ;
         Gridmrec_alertasdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showfirst")) ;
         Gridmrec_alertasdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showprevious")) ;
         Gridmrec_alertasdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Shownext")) ;
         Gridmrec_alertasdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showlast")) ;
         Gridmrec_alertasdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridmrec_alertasdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridmrec_alertasdtspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridclass") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridmrec_alertasdtspaginationbar_Previous = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Previous") ;
         Gridmrec_alertasdtspaginationbar_Next = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Next") ;
         Gridmrec_alertasdtspaginationbar_Caption = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Caption") ;
         Gridmrec_alertasdtspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Cronometro_Enabled = GXutil.strtobool( httpContext.cgiGet( "CRONOMETRO_Enabled")) ;
         Cronometro_Tickinterval = (int)(localUtil.ctol( httpContext.cgiGet( "CRONOMETRO_Tickinterval"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Cronometro_Captionclass = httpContext.cgiGet( "CRONOMETRO_Captionclass") ;
         Cronometro_Captionstyle = httpContext.cgiGet( "CRONOMETRO_Captionstyle") ;
         Cronometro_Captionposition = httpContext.cgiGet( "CRONOMETRO_Captionposition") ;
         Gridmrec_alertasdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname") ;
         Gridmrec_alertasdtspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_73_fel_idx = 0 ;
         while ( nGXsfl_73_fel_idx < nRC_GXsfl_73 )
         {
            nGXsfl_73_fel_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_73_fel_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_73_fel_idx+1) ;
            sGXsfl_73_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_732( ) ;
            AV95GXV1 = (int)(nGXsfl_73_fel_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
            if ( ( AV12Datos.size() >= AV95GXV1 ) && ( AV95GXV1 > 0 ) )
            {
               AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)) );
            }
         }
         if ( nGXsfl_73_fel_idx == 0 )
         {
            nGXsfl_73_idx = 1 ;
            sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_732( ) ;
         }
         nGXsfl_73_fel_idx = 1 ;
         /* Read variables values. */
         cmbavSegundos.setName( cmbavSegundos.getInternalname() );
         cmbavSegundos.setValue( httpContext.cgiGet( cmbavSegundos.getInternalname()) );
         AV80Segundos = (short)(GXutil.lval( httpContext.cgiGet( cmbavSegundos.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Segundos), 4, 0));
         AV24FueraRango = GXutil.strtobool( httpContext.cgiGet( chkavFuerarango.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24FueraRango", AV24FueraRango);
         AV114Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
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
      e161WC2 ();
      if (returnInSub) return;
   }

   public void e161WC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV80Segundos = AV81SegundosParm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Segundos), 4, 0));
      AV62MaqCod.fromJSonString(AV64MaqCodJson, null);
      AV20FasCod.fromJSonString(AV22FasCodJSon, null);
      AV73ParFasCod.fromJSonString(AV75ParFasCodJSon, null);
      AV24FueraRango = AV25FueraRangoParm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FueraRango", AV24FueraRango);
      AV12Datos.fromJSonString(AV14DatosJson, null);
      gx_BV73 = true ;
      GXt_char1 = AV115Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mrec_alerta2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV115Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV116Emprnom ;
      GXv_char4[0] = AV117Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV115Station, GXv_char2, GXv_char3, GXv_char4) ;
      mrec_alerta2_impl.this.AV19EmprCod = GXv_char2[0] ;
      mrec_alerta2_impl.this.AV116Emprnom = GXv_char3[0] ;
      mrec_alerta2_impl.this.AV117Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      cmbavSegundos.setTooltip( httpContext.getMessage( "Intervalo de tiempo", "") );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSegundos.getInternalname(), "Tooltiptext", cmbavSegundos.getTooltip(), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S132 ();
      if (returnInSub) return;
      Gridmrec_alertasdts_empowerer_Gridinternalname = subGridmrec_alertasdts_Internalname ;
      ucGridmrec_alertasdts_empowerer.sendProperty(context, "", false, Gridmrec_alertasdts_empowerer_Internalname, "GridInternalName", Gridmrec_alertasdts_empowerer_Gridinternalname);
      subGridmrec_alertasdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_alertasdts_Rows ;
      ucGridmrec_alertasdtspaginationbar.sendProperty(context, "", false, Gridmrec_alertasdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      subGridmrec_alertasdts_Rows = 5 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S142 ();
      if (returnInSub) return;
      AV92CronometroStart = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92CronometroStart", AV92CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S152 ();
      if (returnInSub) return;
   }

   public void e171WC2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV51GridMRec_AlertaSDTsCurrentPage = subgridmrec_alertasdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51GridMRec_AlertaSDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridMRec_AlertaSDTsCurrentPage), 10, 0));
      AV52GridMRec_AlertaSDTsPageCount = subgridmrec_alertasdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GridMRec_AlertaSDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridMRec_AlertaSDTsPageCount), 10, 0));
      edtavDatos__parfascod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfascod_Internalname, "Columnheaderclass", edtavDatos__parfascod_Columnheaderclass, !bGXsfl_73_Refreshing);
      edtavDatos__parfasdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfasdsc_Internalname, "Columnheaderclass", edtavDatos__parfasdsc_Columnheaderclass, !bGXsfl_73_Refreshing);
      edtavDatos__mprecvalmn_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmn_Internalname, "Columnheaderclass", edtavDatos__mprecvalmn_Columnheaderclass, !bGXsfl_73_Refreshing);
      edtavDatos__mprecval_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecval_Internalname, "Columnheaderclass", edtavDatos__mprecval_Columnheaderclass, !bGXsfl_73_Refreshing);
      edtavDatos__mprecvalmx_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmx_Internalname, "Columnheaderclass", edtavDatos__mprecvalmx_Columnheaderclass, !bGXsfl_73_Refreshing);
      edtavDatos__mprecer_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecer_Internalname, "Columnheaderclass", edtavDatos__mprecer_Columnheaderclass, !bGXsfl_73_Refreshing);
      /*  Sending Event outputs  */
   }

   private void e181WC2( )
   {
      /* Gridmrec_alertasdts_Load Routine */
      returnInSub = false ;
      AV95GXV1 = 1 ;
      while ( AV95GXV1 <= AV12Datos.size() )
      {
         AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)) );
         edtavDatos__parfascod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()==(1)) ? "WWColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWColumn") ;
         edtavDatos__parfasdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()==(1)) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmn_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()==(1)) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecval_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()==(1)) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmx_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()==(1)) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecer_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()==(1)) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(73) ;
         }
         if ( ( subGridmrec_alertasdts_Islastpage == 1 ) || ( subGridmrec_alertasdts_Rows == 0 ) || ( ( GRIDMREC_ALERTASDTS_nCurrentRecord >= GRIDMREC_ALERTASDTS_nFirstRecordOnPage ) && ( GRIDMREC_ALERTASDTS_nCurrentRecord < GRIDMREC_ALERTASDTS_nFirstRecordOnPage + subgridmrec_alertasdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_732( ) ;
            GRIDMREC_ALERTASDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDMREC_ALERTASDTS_nCurrentRecord + 1 >= subgridmrec_alertasdts_fnc_recordcount( ) )
            {
               GRIDMREC_ALERTASDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDMREC_ALERTASDTS_nCurrentRecord = (long)(GRIDMREC_ALERTASDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_73_Refreshing )
         {
            httpContext.doAjaxLoad(73, Gridmrec_alertasdtsRow);
         }
         AV95GXV1 = (int)(AV95GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e111WC2( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridmrec_alertasdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV70PageToGo = subgridmrec_alertasdts_fnc_currentpage( ) ;
         AV70PageToGo = (int)(AV70PageToGo+1) ;
         subgridmrec_alertasdts_gotopage( AV70PageToGo) ;
      }
      else
      {
         AV70PageToGo = (int)(GXutil.lval( Gridmrec_alertasdtspaginationbar_Selectedpage)) ;
         subgridmrec_alertasdts_gotopage( AV70PageToGo) ;
      }
   }

   public void e121WC2( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridmrec_alertasdts_Rows = Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridmrec_alertasdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141WC2( )
   {
      /* 'DoVolver' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e151WC2( )
   {
      AV95GXV1 = (int)(nGXsfl_73_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
      if ( ( AV95GXV1 > 0 ) && ( AV12Datos.size() >= AV95GXV1 ) )
      {
         AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)) );
      }
      /* 'DoActualizar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S142 ();
      if (returnInSub) return;
      AV92CronometroStart = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92CronometroStart", AV92CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S152 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      /*  Sending Event outputs  */
      if ( gx_BV73 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12Datos", AV12Datos);
         nGXsfl_73_bak_idx = nGXsfl_73_idx ;
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
         nGXsfl_73_idx = nGXsfl_73_bak_idx ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      AV74ParFasCod_Data.clear();
      /* Using cursor H01WC2 */
      pr_default.execute(0, new Object[] {AV19EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01WC2_A396EmprCod[0] ;
         A1664ParFasCod = H01WC2_A1664ParFasCod[0] ;
         A1665ParFasDsc = H01WC2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = H01WC2_n1665ParFasDsc[0] ;
         AV86tmp_ParFasCod = A1664ParFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86tmp_ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86tmp_ParFasCod), 4, 0));
         AV87tmp_ParFasDsc = A1665ParFasDsc ;
         /* Using cursor H01WC3 */
         pr_default.execute(1, new Object[] {AV19EmprCod, Short.valueOf(AV86tmp_ParFasCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1664ParFasCod = H01WC3_A1664ParFasCod[0] ;
            A396EmprCod = H01WC3_A396EmprCod[0] ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( AV86tmp_ParFasCod, 4, 0) );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.str( AV86tmp_ParFasCod, 4, 0), AV87tmp_ParFasDsc, "", "", "", "", "", "", "") );
            AV74ParFasCod_Data.add(AV8Combo_DataItem, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV74ParFasCod_Data.sort("Title");
      Combo_parfascod_Selectedvalue_set = AV73ParFasCod.toJSonString(false) ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "SelectedValue_set", Combo_parfascod_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      AV21FasCod_Data.clear();
      /* Using cursor H01WC4 */
      pr_default.execute(2, new Object[] {AV19EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H01WC4_A396EmprCod[0] ;
         A457FasCod = H01WC4_A457FasCod[0] ;
         A460FasDsc = H01WC4_A460FasDsc[0] ;
         AV82tmp_FasCod = A457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82tmp_FasCod", AV82tmp_FasCod);
         AV83tmp_FasDsc = A460FasDsc ;
         /* Using cursor H01WC5 */
         pr_default.execute(3, new Object[] {AV19EmprCod, AV82tmp_FasCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A457FasCod = H01WC5_A457FasCod[0] ;
            A396EmprCod = H01WC5_A396EmprCod[0] ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( AV82tmp_FasCod );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( AV82tmp_FasCod );
            AV21FasCod_Data.add(AV8Combo_DataItem, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV21FasCod_Data.sort("Title");
      Combo_fascod_Selectedvalue_set = AV20FasCod.toJSonString(false) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV63MaqCod_Data.clear();
      /* Using cursor H01WC6 */
      pr_default.execute(4, new Object[] {AV19EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = H01WC6_A396EmprCod[0] ;
         A602MaqCod = H01WC6_A602MaqCod[0] ;
         A606MaqDsc = H01WC6_A606MaqDsc[0] ;
         n606MaqDsc = H01WC6_n606MaqDsc[0] ;
         AV84tmp_MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84tmp_MaqCod", AV84tmp_MaqCod);
         AV85tmp_MaqDsc = A606MaqDsc ;
         /* Using cursor H01WC7 */
         pr_default.execute(5, new Object[] {AV19EmprCod, AV84tmp_MaqCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A14154MEnvMaqCod = H01WC7_A14154MEnvMaqCod[0] ;
            A396EmprCod = H01WC7_A396EmprCod[0] ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( AV84tmp_MaqCod );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", AV84tmp_MaqCod, AV85tmp_MaqDsc, "", "", "", "", "", "", "") );
            AV63MaqCod_Data.add(AV8Combo_DataItem, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV63MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV62MaqCod.toJSonString(false) ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void e131WC2( )
   {
      AV95GXV1 = (int)(nGXsfl_73_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
      if ( ( AV95GXV1 > 0 ) && ( AV12Datos.size() >= AV95GXV1 ) )
      {
         AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)) );
      }
      /* Cronometro_Tick Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      if ( gx_BV73 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12Datos", AV12Datos);
         nGXsfl_73_bak_idx = nGXsfl_73_idx ;
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV24FueraRango, AV19EmprCod, AV9ContCod, AV81SegundosParm, AV64MaqCodJson, AV22FasCodJSon, AV75ParFasCodJSon, AV25FueraRangoParm) ;
         nGXsfl_73_idx = nGXsfl_73_bak_idx ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
   }

   public void S142( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      GXt_objcol_SdtMRec_AlertaSDT_Item7 = AV12Datos ;
      GXv_objcol_SdtMRec_AlertaSDT_Item8[0] = GXt_objcol_SdtMRec_AlertaSDT_Item7 ;
      new app.ingenieria.mrec_alertapr(remoteHandle, context).execute( AV19EmprCod, AV9ContCod, AV80Segundos, AV62MaqCod, AV20FasCod, AV73ParFasCod, AV24FueraRango, GXv_objcol_SdtMRec_AlertaSDT_Item8) ;
      GXt_objcol_SdtMRec_AlertaSDT_Item7 = GXv_objcol_SdtMRec_AlertaSDT_Item8[0] ;
      AV12Datos = GXt_objcol_SdtMRec_AlertaSDT_Item7 ;
      gx_BV73 = true ;
      AV90Now = GXutil.nowms( ) ;
      AV91SegundosMenos = (short)(AV80Segundos*-1) ;
      AV88Desde = GXutil.dtadd( AV90Now, AV91SegundosMenos) ;
      AV89Hasta = AV90Now ;
      Usercontrol1_Objectcall = "[ \""+"query"+"\", \""+GXutil.encodeJSON( "Ingenieria\\MRec_Alerta_TimeLine_QV")+"\", \""+GXutil.encodeJSON( AV19EmprCod)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV88Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV62MaqCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV20FasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( GXutil.booltostr( AV24FueraRango))+"\" ]" ;
      ucUsercontrol1.sendProperty(context, "", false, Usercontrol1_Internalname, "Object", Usercontrol1_Objectcall);
   }

   public void S152( )
   {
      /* 'INICIARPARARCRONOMETRO' Routine */
      returnInSub = false ;
      if ( AV92CronometroStart )
      {
         this.executeUsercontrolMethod("", false, "CRONOMETROContainer", "Start", "", new Object[] {});
         lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-play\"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblCronometrostartstop_Internalname, "Caption", lblCronometrostartstop_Caption, true);
         lblTbmensajeactualizar_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
      }
      else
      {
         this.executeUsercontrolMethod("", false, "CRONOMETROContainer", "Stop", "", new Object[] {});
         lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-pause\"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblCronometrostartstop_Internalname, "Caption", lblCronometrostartstop_Caption, true);
         lblTbmensajeactualizar_Caption = GXutil.format( httpContext.getMessage( "Cronómetro parado ó filtros cambiados, Activar cronometro %1 ó clic en actualizar %2 para activarlos...", ""), httpContext.getMessage( "<i class=\"fas fa-play\"></i>", ""), httpContext.getMessage( "<i class='fa fa-search' style='color:gray; '></i>", ""), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
      }
   }

   public void wb_table2_105_1WC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUtcronometro_Internalname, tblUtcronometro_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCronometro.setProperty("Attribute", AV10Cronometro);
         ucCronometro.setProperty("TickInterval", Cronometro_Tickinterval);
         ucCronometro.setProperty("CaptionClass", Cronometro_Captionclass);
         ucCronometro.setProperty("CaptionStyle", Cronometro_Captionstyle);
         ucCronometro.setProperty("CaptionPosition", Cronometro_Captionposition);
         ucCronometro.render(context, "sdchronometer", Cronometro_Internalname, "CRONOMETROContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_105_1WC2e( true) ;
      }
      else
      {
         wb_table2_105_1WC2e( false) ;
      }
   }

   public void wb_table1_55_1WC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcronometrostartstop_Internalname, tblTablemergedcronometrostartstop_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCronometrostartstop_Internalname, lblCronometrostartstop_Caption, "", "", lblCronometrostartstop_Jsonclick, "'"+""+"'"+",false,"+"'"+"e191wc1_client"+"'", "", "TextBlock", 7, httpContext.getMessage( "Iniciar / parar actualización automática de datos", ""), 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Alerta2.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmensajeactualizar_Internalname, lblTbmensajeactualizar_Caption, "", "", lblTbmensajeactualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Alerta2.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_55_1WC2e( true) ;
      }
      else
      {
         wb_table1_55_1WC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV19EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      AV9ContCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ContCod", AV9ContCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      AV81SegundosParm = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81SegundosParm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81SegundosParm), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEGUNDOSPARM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81SegundosParm), "ZZZ9")));
      AV64MaqCodJson = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64MaqCodJson", AV64MaqCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", AV64MaqCodJson));
      AV22FasCodJSon = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FasCodJSon", AV22FasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", AV22FasCodJSon));
      AV75ParFasCodJSon = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75ParFasCodJSon", AV75ParFasCodJSon);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", AV75ParFasCodJSon));
      AV25FueraRangoParm = ((Boolean) getParm(obj,6)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FueraRangoParm", AV25FueraRangoParm);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFUERARANGOPARM", getSecureSignedToken( "", AV25FueraRangoParm));
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
      pa1WC2( ) ;
      ws1WC2( ) ;
      we1WC2( ) ;
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
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101644269", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrec_alerta2.js", "?202661016442610", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_732( )
   {
      edtavDatos__emprcod_Internalname = "DATOS__EMPRCOD_"+sGXsfl_73_idx ;
      edtavDatos__menvord_Internalname = "DATOS__MENVORD_"+sGXsfl_73_idx ;
      edtavDatos__mreclin_Internalname = "DATOS__MRECLIN_"+sGXsfl_73_idx ;
      edtavDatos__mprecfec_Internalname = "DATOS__MPRECFEC_"+sGXsfl_73_idx ;
      edtavDatos__barcod_Internalname = "DATOS__BARCOD_"+sGXsfl_73_idx ;
      edtavDatos__barcodreo_Internalname = "DATOS__BARCODREO_"+sGXsfl_73_idx ;
      edtavDatos__barcodpar_Internalname = "DATOS__BARCODPAR_"+sGXsfl_73_idx ;
      edtavDatos__maqcod_Internalname = "DATOS__MAQCOD_"+sGXsfl_73_idx ;
      edtavDatos__maqdsc_Internalname = "DATOS__MAQDSC_"+sGXsfl_73_idx ;
      edtavDatos__mprecplc_Internalname = "DATOS__MPRECPLC_"+sGXsfl_73_idx ;
      edtavDatos__fascod_Internalname = "DATOS__FASCOD_"+sGXsfl_73_idx ;
      edtavDatos__fasdsc_Internalname = "DATOS__FASDSC_"+sGXsfl_73_idx ;
      edtavDatos__parfascod_Internalname = "DATOS__PARFASCOD_"+sGXsfl_73_idx ;
      edtavDatos__parfasdsc_Internalname = "DATOS__PARFASDSC_"+sGXsfl_73_idx ;
      edtavDatos__mprecvalmn_Internalname = "DATOS__MPRECVALMN_"+sGXsfl_73_idx ;
      edtavDatos__mprecval_Internalname = "DATOS__MPRECVAL_"+sGXsfl_73_idx ;
      edtavDatos__mprecvalmx_Internalname = "DATOS__MPRECVALMX_"+sGXsfl_73_idx ;
      edtavDatos__mprecer_Internalname = "DATOS__MPRECER_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_732( )
   {
      edtavDatos__emprcod_Internalname = "DATOS__EMPRCOD_"+sGXsfl_73_fel_idx ;
      edtavDatos__menvord_Internalname = "DATOS__MENVORD_"+sGXsfl_73_fel_idx ;
      edtavDatos__mreclin_Internalname = "DATOS__MRECLIN_"+sGXsfl_73_fel_idx ;
      edtavDatos__mprecfec_Internalname = "DATOS__MPRECFEC_"+sGXsfl_73_fel_idx ;
      edtavDatos__barcod_Internalname = "DATOS__BARCOD_"+sGXsfl_73_fel_idx ;
      edtavDatos__barcodreo_Internalname = "DATOS__BARCODREO_"+sGXsfl_73_fel_idx ;
      edtavDatos__barcodpar_Internalname = "DATOS__BARCODPAR_"+sGXsfl_73_fel_idx ;
      edtavDatos__maqcod_Internalname = "DATOS__MAQCOD_"+sGXsfl_73_fel_idx ;
      edtavDatos__maqdsc_Internalname = "DATOS__MAQDSC_"+sGXsfl_73_fel_idx ;
      edtavDatos__mprecplc_Internalname = "DATOS__MPRECPLC_"+sGXsfl_73_fel_idx ;
      edtavDatos__fascod_Internalname = "DATOS__FASCOD_"+sGXsfl_73_fel_idx ;
      edtavDatos__fasdsc_Internalname = "DATOS__FASDSC_"+sGXsfl_73_fel_idx ;
      edtavDatos__parfascod_Internalname = "DATOS__PARFASCOD_"+sGXsfl_73_fel_idx ;
      edtavDatos__parfasdsc_Internalname = "DATOS__PARFASDSC_"+sGXsfl_73_fel_idx ;
      edtavDatos__mprecvalmn_Internalname = "DATOS__MPRECVALMN_"+sGXsfl_73_fel_idx ;
      edtavDatos__mprecval_Internalname = "DATOS__MPRECVAL_"+sGXsfl_73_fel_idx ;
      edtavDatos__mprecvalmx_Internalname = "DATOS__MPRECVALMX_"+sGXsfl_73_fel_idx ;
      edtavDatos__mprecer_Internalname = "DATOS__MPRECER_"+sGXsfl_73_fel_idx ;
   }

   public void sendrow_732( )
   {
      subsflControlProps_732( ) ;
      wb1WC0( ) ;
      if ( ( subGridmrec_alertasdts_Rows * 1 == 0 ) || ( nGXsfl_73_idx <= subgridmrec_alertasdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridmrec_alertasdtsRow = GXWebRow.GetNew(context,Gridmrec_alertasdtsContainer) ;
         if ( subGridmrec_alertasdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
            }
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(0) ;
            subGridmrec_alertasdts_Backcolor = subGridmrec_alertasdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Uniform" ;
            }
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
            }
            subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
            {
               subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Even" ;
               }
            }
            else
            {
               subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_73_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__emprcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__menvord_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__menvord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__menvord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__menvord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mreclin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mreclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mreclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mreclin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecfec_Internalname,localUtil.ttoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mprecfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Maqcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Maqdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecplc_Internalname,((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecplc(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecplc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mprecplc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fascod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Fasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfascod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__parfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfascod_Columnclass,edtavDatos__parfascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Parfasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfasdsc_Columnclass,edtavDatos__parfasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmn_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmn_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmn_Columnclass,edtavDatos__mprecvalmn_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecval_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecval_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecval_Columnclass,edtavDatos__mprecval_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmx_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmx_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmx_Columnclass,edtavDatos__mprecvalmx_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecer_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecer_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV95GXV1)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecer_Columnclass,edtavDatos__mprecer_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecer_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1WC2( ) ;
         Gridmrec_alertasdtsContainer.AddRow(Gridmrec_alertasdtsRow);
         nGXsfl_73_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_73_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
      /* End function sendrow_732 */
   }

   public void startgridcontrol73( )
   {
      if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridmrec_alertasdtsContainer"+"DivS\" data-gxgridid=\"73\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmrec_alertasdts_Internalname, subGridmrec_alertasdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridmrec_alertasdts_Backcolorstyle == 0 )
         {
            subGridmrec_alertasdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Title" ;
            }
         }
         else
         {
            subGridmrec_alertasdts_Titlebackstyle = (byte)(1) ;
            if ( subGridmrec_alertasdts_Backcolorstyle == 1 )
            {
               subGridmrec_alertasdts_Titlebackcolor = subGridmrec_alertasdts_Allbackcolor ;
               if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Línea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Máq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PLC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Par.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Parámetro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mínimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máximo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
      }
      else
      {
         Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
         Gridmrec_alertasdtsContainer.AddObjectProperty("Header", subGridmrec_alertasdts_Header);
         Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", "");
         Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__menvord_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mreclin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecplc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfascod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfascod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmn_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecval_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecval_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmx_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecer_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecer_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecer_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      cmbavSegundos.setInternalname( "vSEGUNDOS" );
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblockcombo_fascod_Internalname = "TEXTBLOCKCOMBO_FASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      lblTextblockcombo_parfascod_Internalname = "TEXTBLOCKCOMBO_PARFASCOD" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      divTablesplittedparfascod_Internalname = "TABLESPLITTEDPARFASCOD" ;
      chkavFuerarango.setInternalname( "vFUERARANGO" );
      lblActualizar_Internalname = "ACTUALIZAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblCronometrostartstop_Internalname = "CRONOMETROSTARTSTOP" ;
      lblTbmensajeactualizar_Internalname = "TBMENSAJEACTUALIZAR" ;
      tblTablemergedcronometrostartstop_Internalname = "TABLEMERGEDCRONOMETROSTARTSTOP" ;
      divPanelfiltros_Internalname = "PANELFILTROS" ;
      Dvpanel_panelfiltros_Internalname = "DVPANEL_PANELFILTROS" ;
      Usercontrol1_Internalname = "USERCONTROL1" ;
      edtavDatos__emprcod_Internalname = "DATOS__EMPRCOD" ;
      edtavDatos__menvord_Internalname = "DATOS__MENVORD" ;
      edtavDatos__mreclin_Internalname = "DATOS__MRECLIN" ;
      edtavDatos__mprecfec_Internalname = "DATOS__MPRECFEC" ;
      edtavDatos__barcod_Internalname = "DATOS__BARCOD" ;
      edtavDatos__barcodreo_Internalname = "DATOS__BARCODREO" ;
      edtavDatos__barcodpar_Internalname = "DATOS__BARCODPAR" ;
      edtavDatos__maqcod_Internalname = "DATOS__MAQCOD" ;
      edtavDatos__maqdsc_Internalname = "DATOS__MAQDSC" ;
      edtavDatos__mprecplc_Internalname = "DATOS__MPRECPLC" ;
      edtavDatos__fascod_Internalname = "DATOS__FASCOD" ;
      edtavDatos__fasdsc_Internalname = "DATOS__FASDSC" ;
      edtavDatos__parfascod_Internalname = "DATOS__PARFASCOD" ;
      edtavDatos__parfasdsc_Internalname = "DATOS__PARFASDSC" ;
      edtavDatos__mprecvalmn_Internalname = "DATOS__MPRECVALMN" ;
      edtavDatos__mprecval_Internalname = "DATOS__MPRECVAL" ;
      edtavDatos__mprecvalmx_Internalname = "DATOS__MPRECVALMX" ;
      edtavDatos__mprecer_Internalname = "DATOS__MPRECER" ;
      Gridmrec_alertasdtspaginationbar_Internalname = "GRIDMREC_ALERTASDTSPAGINATIONBAR" ;
      divGridmrec_alertasdtstablewithpaginationbar_Internalname = "GRIDMREC_ALERTASDTSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnvolver_Internalname = "BTNVOLVER" ;
      Cronometro_Internalname = "CRONOMETRO" ;
      tblUtcronometro_Internalname = "UTCRONOMETRO" ;
      divTablecronometro_Internalname = "TABLECRONOMETRO" ;
      divTablemasdetalles_Internalname = "TABLEMASDETALLES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamon_Internalname = "DATAMON" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Gridmrec_alertasdts_empowerer_Internalname = "GRIDMREC_ALERTASDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridmrec_alertasdts_Internalname = "GRIDMREC_ALERTASDTS" ;
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
      subGridmrec_alertasdts_Allowcollapsing = (byte)(0) ;
      subGridmrec_alertasdts_Allowselection = (byte)(0) ;
      subGridmrec_alertasdts_Header = "" ;
      edtavDatos__mprecer_Jsonclick = "" ;
      edtavDatos__mprecer_Columnheaderclass = "" ;
      edtavDatos__mprecer_Columnclass = "WWColumn" ;
      edtavDatos__mprecer_Enabled = 0 ;
      edtavDatos__mprecvalmx_Jsonclick = "" ;
      edtavDatos__mprecvalmx_Columnheaderclass = "" ;
      edtavDatos__mprecvalmx_Columnclass = "WWColumn" ;
      edtavDatos__mprecvalmx_Enabled = 0 ;
      edtavDatos__mprecval_Jsonclick = "" ;
      edtavDatos__mprecval_Columnheaderclass = "" ;
      edtavDatos__mprecval_Columnclass = "WWColumn" ;
      edtavDatos__mprecval_Enabled = 0 ;
      edtavDatos__mprecvalmn_Jsonclick = "" ;
      edtavDatos__mprecvalmn_Columnheaderclass = "" ;
      edtavDatos__mprecvalmn_Columnclass = "WWColumn" ;
      edtavDatos__mprecvalmn_Enabled = 0 ;
      edtavDatos__parfasdsc_Jsonclick = "" ;
      edtavDatos__parfasdsc_Columnheaderclass = "" ;
      edtavDatos__parfasdsc_Columnclass = "WWColumn" ;
      edtavDatos__parfasdsc_Enabled = 0 ;
      edtavDatos__parfascod_Jsonclick = "" ;
      edtavDatos__parfascod_Columnheaderclass = "" ;
      edtavDatos__parfascod_Columnclass = "WWColumn" ;
      edtavDatos__parfascod_Enabled = 0 ;
      edtavDatos__fasdsc_Jsonclick = "" ;
      edtavDatos__fasdsc_Enabled = 0 ;
      edtavDatos__fascod_Jsonclick = "" ;
      edtavDatos__fascod_Enabled = 0 ;
      edtavDatos__mprecplc_Jsonclick = "" ;
      edtavDatos__mprecplc_Enabled = 0 ;
      edtavDatos__maqdsc_Jsonclick = "" ;
      edtavDatos__maqdsc_Enabled = 0 ;
      edtavDatos__maqcod_Jsonclick = "" ;
      edtavDatos__maqcod_Enabled = 0 ;
      edtavDatos__barcodpar_Jsonclick = "" ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__barcodreo_Jsonclick = "" ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcod_Jsonclick = "" ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__mprecfec_Jsonclick = "" ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__mreclin_Jsonclick = "" ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__menvord_Jsonclick = "" ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__emprcod_Jsonclick = "" ;
      edtavDatos__emprcod_Enabled = 0 ;
      subGridmrec_alertasdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridmrec_alertasdts_Backcolorstyle = (byte)(0) ;
      Cronometro_Enabled = GXutil.toBoolean( 1) ;
      lblTbmensajeactualizar_Caption = " " ;
      lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-pause\"></i>", "") ;
      edtavDatos__mprecer_Enabled = -1 ;
      edtavDatos__mprecvalmx_Enabled = -1 ;
      edtavDatos__mprecval_Enabled = -1 ;
      edtavDatos__mprecvalmn_Enabled = -1 ;
      edtavDatos__parfasdsc_Enabled = -1 ;
      edtavDatos__parfascod_Enabled = -1 ;
      edtavDatos__fasdsc_Enabled = -1 ;
      edtavDatos__fascod_Enabled = -1 ;
      edtavDatos__mprecplc_Enabled = -1 ;
      edtavDatos__maqdsc_Enabled = -1 ;
      edtavDatos__maqcod_Enabled = -1 ;
      edtavDatos__barcodpar_Enabled = -1 ;
      edtavDatos__barcodreo_Enabled = -1 ;
      edtavDatos__barcod_Enabled = -1 ;
      edtavDatos__mprecfec_Enabled = -1 ;
      edtavDatos__mreclin_Enabled = -1 ;
      edtavDatos__menvord_Enabled = -1 ;
      edtavDatos__emprcod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Usercontrol1_Title = "" ;
      chkavFuerarango.setEnabled( 1 );
      Combo_parfascod_Caption = "" ;
      Combo_fascod_Caption = "" ;
      Combo_maqcod_Caption = "" ;
      cmbavSegundos.setJsonclick( "" );
      cmbavSegundos.setTooltip( "" );
      cmbavSegundos.setEnabled( 1 );
      Cronometro_Captionposition = "None" ;
      Cronometro_Captionstyle = "width: 25%;" ;
      Cronometro_Captionclass = "gx-form-item AttributeLabel" ;
      Cronometro_Tickinterval = 15 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Recepción datos de máquinas", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridmrec_alertasdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridmrec_alertasdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridmrec_alertasdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridmrec_alertasdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridmrec_alertasdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridmrec_alertasdtspaginationbar_Pagestoshow = 5 ;
      Gridmrec_alertasdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridmrec_alertasdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridmrec_alertasdtspaginationbar_Class = "PaginationBar" ;
      Usercontrol1_Charttype = "SmoothTimeline" ;
      Usercontrol1_Type = "Chart" ;
      Usercontrol1_Objectcall = "" ;
      Dvpanel_panelfiltros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Iconposition = "Right" ;
      Dvpanel_panelfiltros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_panelfiltros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelfiltros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Width = "100%" ;
      Combo_parfascod_Multiplevaluestype = "Tags" ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_parfascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascod_Multiplevaluestype = "Tags" ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_fascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Emptyitemtext = "" ;
      Combo_maqcod_Multiplevaluestype = "Tags" ;
      Combo_maqcod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_maqcod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Alertas", "") );
      subGridmrec_alertasdts_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavSegundos.setName( "vSEGUNDOS" );
      cmbavSegundos.setWebtags( "" );
      cmbavSegundos.addItem("300", httpContext.getMessage( "5 m", ""), (short)(0));
      cmbavSegundos.addItem("600", httpContext.getMessage( "10 m", ""), (short)(0));
      cmbavSegundos.addItem("900", httpContext.getMessage( "15 m", ""), (short)(0));
      cmbavSegundos.addItem("1200", httpContext.getMessage( "20 m", ""), (short)(0));
      cmbavSegundos.addItem("1500", httpContext.getMessage( "25 m", ""), (short)(0));
      cmbavSegundos.addItem("1800", httpContext.getMessage( "30 m", ""), (short)(0));
      if ( cmbavSegundos.getItemCount() > 0 )
      {
         AV80Segundos = (short)(GXutil.lval( cmbavSegundos.getValidValue(GXutil.trim( GXutil.str( AV80Segundos, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Segundos), 4, 0));
      }
      chkavFuerarango.setName( "vFUERARANGO" );
      chkavFuerarango.setWebtags( "" );
      chkavFuerarango.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFuerarango.getInternalname(), "TitleCaption", chkavFuerarango.getCaption(), true);
      chkavFuerarango.setCheckedValue( "false" );
      AV24FueraRango = GXutil.strtobool( GXutil.booltostr( AV24FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FueraRango", AV24FueraRango);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73},{av:'AV24FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV81SegundosParm',fld:'vSEGUNDOSPARM',pic:'ZZZ9',hsh:true},{av:'AV64MaqCodJson',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV22FasCodJSon',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV75ParFasCodJSon',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV25FueraRangoParm',fld:'vFUERARANGOPARM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV51GridMRec_AlertaSDTsCurrentPage',fld:'vGRIDMREC_ALERTASDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridMRec_AlertaSDTsPageCount',fld:'vGRIDMREC_ALERTASDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'DATOS__PARFASCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECER',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD","{handler:'e181WC2',iparms:[{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73}]");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD",",oparms:[{ctrl:'DATOS__PARFASCOD',prop:'Columnclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnclass'},{ctrl:'DATOS__MPRECER',prop:'Columnclass'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e111WC2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73},{av:'AV24FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV81SegundosParm',fld:'vSEGUNDOSPARM',pic:'ZZZ9',hsh:true},{av:'AV64MaqCodJson',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV22FasCodJSon',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV75ParFasCodJSon',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV25FueraRangoParm',fld:'vFUERARANGOPARM',pic:'',hsh:true},{av:'Gridmrec_alertasdtspaginationbar_Selectedpage',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121WC2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73},{av:'AV24FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV81SegundosParm',fld:'vSEGUNDOSPARM',pic:'ZZZ9',hsh:true},{av:'AV64MaqCodJson',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV22FasCodJSon',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV75ParFasCodJSon',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV25FueraRangoParm',fld:'vFUERARANGOPARM',pic:'',hsh:true},{av:'Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'}]}");
      setEventMetadata("'DOVOLVER'","{handler:'e141WC2',iparms:[]");
      setEventMetadata("'DOVOLVER'",",oparms:[]}");
      setEventMetadata("'DOCRONOMETROSTARTSTOP'","{handler:'e191WC1',iparms:[{av:'AV92CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV10Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'}]");
      setEventMetadata("'DOCRONOMETROSTARTSTOP'",",oparms:[{av:'AV92CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV10Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'}]}");
      setEventMetadata("'DOACTUALIZAR'","{handler:'e151WC2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'cmbavSegundos'},{av:'AV80Segundos',fld:'vSEGUNDOS',pic:'ZZZ9'},{av:'AV62MaqCod',fld:'vMAQCOD',pic:''},{av:'AV20FasCod',fld:'vFASCOD',pic:''},{av:'AV73ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV24FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV92CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV10Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'},{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV81SegundosParm',fld:'vSEGUNDOSPARM',pic:'ZZZ9',hsh:true},{av:'AV64MaqCodJson',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV22FasCodJSon',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV75ParFasCodJSon',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV25FueraRangoParm',fld:'vFUERARANGOPARM',pic:'',hsh:true}]");
      setEventMetadata("'DOACTUALIZAR'",",oparms:[{av:'AV92CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73},{ctrl:'USERCONTROL1'},{av:'AV10Cronometro',fld:'vCRONOMETRO',pic:'ZZZ9'},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'}]}");
      setEventMetadata("VCRONOMETRO.TICK","{handler:'e131WC2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'cmbavSegundos'},{av:'AV80Segundos',fld:'vSEGUNDOS',pic:'ZZZ9'},{av:'AV62MaqCod',fld:'vMAQCOD',pic:''},{av:'AV20FasCod',fld:'vFASCOD',pic:''},{av:'AV73ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV24FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV81SegundosParm',fld:'vSEGUNDOSPARM',pic:'ZZZ9',hsh:true},{av:'AV64MaqCodJson',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV22FasCodJSon',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV75ParFasCodJSon',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV25FueraRangoParm',fld:'vFUERARANGOPARM',pic:'',hsh:true}]");
      setEventMetadata("VCRONOMETRO.TICK",",oparms:[{av:'AV12Datos',fld:'vDATOS',grid:73,pic:''},{av:'nGXsfl_73_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:73},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_73',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:73},{ctrl:'USERCONTROL1'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv19',iparms:[]");
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
      wcpOAV19EmprCod = "" ;
      wcpOAV9ContCod = "" ;
      wcpOAV64MaqCodJson = "" ;
      wcpOAV22FasCodJSon = "" ;
      wcpOAV75ParFasCodJSon = "" ;
      Gridmrec_alertasdtspaginationbar_Selectedpage = "" ;
      Combo_parfascod_Selectedvalue_get = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV19EmprCod = "" ;
      AV9ContCod = "" ;
      AV64MaqCodJson = "" ;
      AV22FasCodJSon = "" ;
      AV75ParFasCodJSon = "" ;
      AV12Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV63MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV21FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV74ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV72Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV57ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV59ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV16DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV23FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV60ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV58ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      AV62MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV73ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      Gridmrec_alertasdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelfiltros = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_parfascod_Jsonclick = "" ;
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      lblActualizar_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucUsercontrol1 = new com.genexus.webpanels.GXUserControl();
      Gridmrec_alertasdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridmrec_alertasdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      bttBtnvolver_Jsonclick = "" ;
      AV114Pgmname = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucGridmrec_alertasdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14DatosJson = "" ;
      AV115Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV116Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV117Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      Gridmrec_alertasdtsRow = new com.genexus.webpanels.GXWebRow();
      scmdbuf = "" ;
      H01WC2_A396EmprCod = new String[] {""} ;
      H01WC2_A1664ParFasCod = new short[1] ;
      H01WC2_A1665ParFasDsc = new String[] {""} ;
      H01WC2_n1665ParFasDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A1665ParFasDsc = "" ;
      AV87tmp_ParFasDsc = "" ;
      H01WC3_A129BarCod = new int[1] ;
      H01WC3_A132BarCodReo = new byte[1] ;
      H01WC3_A130BarCodPar = new String[] {""} ;
      H01WC3_A14152MEnvOrd = new short[1] ;
      H01WC3_A1664ParFasCod = new short[1] ;
      H01WC3_A396EmprCod = new String[] {""} ;
      AV8Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01WC4_A396EmprCod = new String[] {""} ;
      H01WC4_A457FasCod = new String[] {""} ;
      H01WC4_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV82tmp_FasCod = "" ;
      AV83tmp_FasDsc = "" ;
      H01WC5_A129BarCod = new int[1] ;
      H01WC5_A132BarCodReo = new byte[1] ;
      H01WC5_A130BarCodPar = new String[] {""} ;
      H01WC5_A14152MEnvOrd = new short[1] ;
      H01WC5_A457FasCod = new String[] {""} ;
      H01WC5_A396EmprCod = new String[] {""} ;
      H01WC6_A396EmprCod = new String[] {""} ;
      H01WC6_A602MaqCod = new String[] {""} ;
      H01WC6_A606MaqDsc = new String[] {""} ;
      H01WC6_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV84tmp_MaqCod = "" ;
      AV85tmp_MaqDsc = "" ;
      H01WC7_A129BarCod = new int[1] ;
      H01WC7_A132BarCodReo = new byte[1] ;
      H01WC7_A130BarCodPar = new String[] {""} ;
      H01WC7_A14152MEnvOrd = new short[1] ;
      H01WC7_A14154MEnvMaqCod = new String[] {""} ;
      H01WC7_A396EmprCod = new String[] {""} ;
      A14154MEnvMaqCod = "" ;
      GXt_objcol_SdtMRec_AlertaSDT_Item7 = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AlertaSDT_Item8 = new GXBaseCollection[1] ;
      AV90Now = GXutil.resetTime( GXutil.nullDate() );
      AV88Desde = GXutil.resetTime( GXutil.nullDate() );
      AV89Hasta = GXutil.resetTime( GXutil.nullDate() );
      ucCronometro = new com.genexus.webpanels.GXUserControl();
      lblCronometrostartstop_Jsonclick = "" ;
      lblTbmensajeactualizar_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridmrec_alertasdts_Linesclass = "" ;
      ROClassString = "" ;
      Gridmrec_alertasdtsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_alerta2__default(),
         new Object[] {
             new Object[] {
            H01WC2_A396EmprCod, H01WC2_A1664ParFasCod, H01WC2_A1665ParFasDsc, H01WC2_n1665ParFasDsc
            }
            , new Object[] {
            H01WC3_A129BarCod, H01WC3_A132BarCodReo, H01WC3_A130BarCodPar, H01WC3_A14152MEnvOrd, H01WC3_A1664ParFasCod, H01WC3_A396EmprCod
            }
            , new Object[] {
            H01WC4_A396EmprCod, H01WC4_A457FasCod, H01WC4_A460FasDsc
            }
            , new Object[] {
            H01WC5_A129BarCod, H01WC5_A132BarCodReo, H01WC5_A130BarCodPar, H01WC5_A14152MEnvOrd, H01WC5_A457FasCod, H01WC5_A396EmprCod
            }
            , new Object[] {
            H01WC6_A396EmprCod, H01WC6_A602MaqCod, H01WC6_A606MaqDsc, H01WC6_n606MaqDsc
            }
            , new Object[] {
            H01WC7_A129BarCod, H01WC7_A132BarCodReo, H01WC7_A130BarCodPar, H01WC7_A14152MEnvOrd, H01WC7_A14154MEnvMaqCod, H01WC7_A396EmprCod
            }
         }
      );
      AV114Pgmname = "Ingenieria.MRec_Alerta2" ;
      /* GeneXus formulas. */
      AV114Pgmname = "Ingenieria.MRec_Alerta2" ;
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__maqcod_Enabled = 0 ;
      edtavDatos__maqdsc_Enabled = 0 ;
      edtavDatos__mprecplc_Enabled = 0 ;
      edtavDatos__fascod_Enabled = 0 ;
      edtavDatos__fasdsc_Enabled = 0 ;
      edtavDatos__parfascod_Enabled = 0 ;
      edtavDatos__parfasdsc_Enabled = 0 ;
      edtavDatos__mprecvalmn_Enabled = 0 ;
      edtavDatos__mprecval_Enabled = 0 ;
      edtavDatos__mprecvalmx_Enabled = 0 ;
      edtavDatos__mprecer_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDMREC_ALERTASDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridmrec_alertasdts_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridmrec_alertasdts_Backstyle ;
   private byte subGridmrec_alertasdts_Titlebackstyle ;
   private byte subGridmrec_alertasdts_Allowselection ;
   private byte subGridmrec_alertasdts_Allowhovering ;
   private byte subGridmrec_alertasdts_Allowcollapsing ;
   private byte subGridmrec_alertasdts_Collapsed ;
   private short wcpOAV81SegundosParm ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short AV81SegundosParm ;
   private short AV10Cronometro ;
   private short wbEnd ;
   private short wbStart ;
   private short AV80Segundos ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A1664ParFasCod ;
   private short AV86tmp_ParFasCod ;
   private short AV91SegundosMenos ;
   private int Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_73 ;
   private int subGridmrec_alertasdts_Rows ;
   private int nGXsfl_73_idx=1 ;
   private int Gridmrec_alertasdtspaginationbar_Pagestoshow ;
   private int Cronometro_Tickinterval ;
   private int AV95GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridmrec_alertasdts_Islastpage ;
   private int edtavDatos__emprcod_Enabled ;
   private int edtavDatos__menvord_Enabled ;
   private int edtavDatos__mreclin_Enabled ;
   private int edtavDatos__mprecfec_Enabled ;
   private int edtavDatos__barcod_Enabled ;
   private int edtavDatos__barcodreo_Enabled ;
   private int edtavDatos__barcodpar_Enabled ;
   private int edtavDatos__maqcod_Enabled ;
   private int edtavDatos__maqdsc_Enabled ;
   private int edtavDatos__mprecplc_Enabled ;
   private int edtavDatos__fascod_Enabled ;
   private int edtavDatos__fasdsc_Enabled ;
   private int edtavDatos__parfascod_Enabled ;
   private int edtavDatos__parfasdsc_Enabled ;
   private int edtavDatos__mprecvalmn_Enabled ;
   private int edtavDatos__mprecval_Enabled ;
   private int edtavDatos__mprecvalmx_Enabled ;
   private int edtavDatos__mprecer_Enabled ;
   private int GRIDMREC_ALERTASDTS_nGridOutOfScope ;
   private int nGXsfl_73_fel_idx=1 ;
   private int AV70PageToGo ;
   private int nGXsfl_73_bak_idx=1 ;
   private int idxLst ;
   private int subGridmrec_alertasdts_Backcolor ;
   private int subGridmrec_alertasdts_Allbackcolor ;
   private int subGridmrec_alertasdts_Titlebackcolor ;
   private int subGridmrec_alertasdts_Selectedindex ;
   private int subGridmrec_alertasdts_Selectioncolor ;
   private int subGridmrec_alertasdts_Hoveringcolor ;
   private long GRIDMREC_ALERTASDTS_nFirstRecordOnPage ;
   private long AV51GridMRec_AlertaSDTsCurrentPage ;
   private long AV52GridMRec_AlertaSDTsPageCount ;
   private long GRIDMREC_ALERTASDTS_nCurrentRecord ;
   private long GRIDMREC_ALERTASDTS_nRecordCount ;
   private String wcpOAV19EmprCod ;
   private String wcpOAV9ContCod ;
   private String Gridmrec_alertasdtspaginationbar_Selectedpage ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_fascod_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV19EmprCod ;
   private String AV9ContCod ;
   private String sGXsfl_73_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_maqcod_Multiplevaluestype ;
   private String Combo_maqcod_Emptyitemtext ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Dvpanel_panelfiltros_Width ;
   private String Dvpanel_panelfiltros_Cls ;
   private String Dvpanel_panelfiltros_Title ;
   private String Dvpanel_panelfiltros_Iconposition ;
   private String Usercontrol1_Objectcall ;
   private String Usercontrol1_Type ;
   private String Usercontrol1_Charttype ;
   private String Gridmrec_alertasdtspaginationbar_Class ;
   private String Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition ;
   private String Gridmrec_alertasdtspaginationbar_Pagingcaptionposition ;
   private String Gridmrec_alertasdtspaginationbar_Emptygridclass ;
   private String Gridmrec_alertasdtspaginationbar_Rowsperpageoptions ;
   private String Gridmrec_alertasdtspaginationbar_Previous ;
   private String Gridmrec_alertasdtspaginationbar_Next ;
   private String Gridmrec_alertasdtspaginationbar_Caption ;
   private String Gridmrec_alertasdtspaginationbar_Emptygridcaption ;
   private String Gridmrec_alertasdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Cronometro_Captionclass ;
   private String Cronometro_Captionstyle ;
   private String Cronometro_Captionposition ;
   private String Gridmrec_alertasdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelfiltros_Internalname ;
   private String divPanelfiltros_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockcombo_fascod_Internalname ;
   private String lblTextblockcombo_fascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Internalname ;
   private String divTablesplittedparfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Jsonclick ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Internalname ;
   private String lblActualizar_Internalname ;
   private String lblActualizar_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Usercontrol1_Title ;
   private String Usercontrol1_Internalname ;
   private String divGridmrec_alertasdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridmrec_alertasdts_Internalname ;
   private String Gridmrec_alertasdtspaginationbar_Internalname ;
   private String divTablemasdetalles_Internalname ;
   private String bttBtnvolver_Internalname ;
   private String bttBtnvolver_Jsonclick ;
   private String divTablecronometro_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV114Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamon_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridmrec_alertasdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDatos__emprcod_Internalname ;
   private String edtavDatos__menvord_Internalname ;
   private String edtavDatos__mreclin_Internalname ;
   private String edtavDatos__mprecfec_Internalname ;
   private String edtavDatos__barcod_Internalname ;
   private String edtavDatos__barcodreo_Internalname ;
   private String edtavDatos__barcodpar_Internalname ;
   private String edtavDatos__maqcod_Internalname ;
   private String edtavDatos__maqdsc_Internalname ;
   private String edtavDatos__mprecplc_Internalname ;
   private String edtavDatos__fascod_Internalname ;
   private String edtavDatos__fasdsc_Internalname ;
   private String edtavDatos__parfascod_Internalname ;
   private String edtavDatos__parfasdsc_Internalname ;
   private String edtavDatos__mprecvalmn_Internalname ;
   private String edtavDatos__mprecval_Internalname ;
   private String edtavDatos__mprecvalmx_Internalname ;
   private String edtavDatos__mprecer_Internalname ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String AV115Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV116Emprnom ;
   private String GXv_char3[] ;
   private String AV117Usurcod ;
   private String GXv_char4[] ;
   private String edtavDatos__parfascod_Columnheaderclass ;
   private String edtavDatos__parfasdsc_Columnheaderclass ;
   private String edtavDatos__mprecvalmn_Columnheaderclass ;
   private String edtavDatos__mprecval_Columnheaderclass ;
   private String edtavDatos__mprecvalmx_Columnheaderclass ;
   private String edtavDatos__mprecer_Columnheaderclass ;
   private String edtavDatos__parfascod_Columnclass ;
   private String edtavDatos__parfasdsc_Columnclass ;
   private String edtavDatos__mprecvalmn_Columnclass ;
   private String edtavDatos__mprecval_Columnclass ;
   private String edtavDatos__mprecvalmx_Columnclass ;
   private String edtavDatos__mprecer_Columnclass ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1665ParFasDsc ;
   private String AV87tmp_ParFasDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV82tmp_FasCod ;
   private String AV83tmp_FasDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV84tmp_MaqCod ;
   private String AV85tmp_MaqDsc ;
   private String A14154MEnvMaqCod ;
   private String lblCronometrostartstop_Caption ;
   private String lblCronometrostartstop_Internalname ;
   private String lblTbmensajeactualizar_Caption ;
   private String lblTbmensajeactualizar_Internalname ;
   private String tblUtcronometro_Internalname ;
   private String Cronometro_Internalname ;
   private String tblTablemergedcronometrostartstop_Internalname ;
   private String lblCronometrostartstop_Jsonclick ;
   private String lblTbmensajeactualizar_Jsonclick ;
   private String subGridmrec_alertasdts_Class ;
   private String subGridmrec_alertasdts_Linesclass ;
   private String ROClassString ;
   private String edtavDatos__emprcod_Jsonclick ;
   private String edtavDatos__menvord_Jsonclick ;
   private String edtavDatos__mreclin_Jsonclick ;
   private String edtavDatos__mprecfec_Jsonclick ;
   private String edtavDatos__barcod_Jsonclick ;
   private String edtavDatos__barcodreo_Jsonclick ;
   private String edtavDatos__barcodpar_Jsonclick ;
   private String edtavDatos__maqcod_Jsonclick ;
   private String edtavDatos__maqdsc_Jsonclick ;
   private String edtavDatos__mprecplc_Jsonclick ;
   private String edtavDatos__fascod_Jsonclick ;
   private String edtavDatos__fasdsc_Jsonclick ;
   private String edtavDatos__parfascod_Jsonclick ;
   private String edtavDatos__parfasdsc_Jsonclick ;
   private String edtavDatos__mprecvalmn_Jsonclick ;
   private String edtavDatos__mprecval_Jsonclick ;
   private String edtavDatos__mprecvalmx_Jsonclick ;
   private String edtavDatos__mprecer_Jsonclick ;
   private String subGridmrec_alertasdts_Header ;
   private java.util.Date AV90Now ;
   private java.util.Date AV88Desde ;
   private java.util.Date AV89Hasta ;
   private boolean wcpOAV25FueraRangoParm ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV25FueraRangoParm ;
   private boolean AV24FueraRango ;
   private boolean AV92CronometroStart ;
   private boolean Combo_maqcod_Allowmultipleselection ;
   private boolean Combo_maqcod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean Dvpanel_panelfiltros_Autowidth ;
   private boolean Dvpanel_panelfiltros_Autoheight ;
   private boolean Dvpanel_panelfiltros_Collapsible ;
   private boolean Dvpanel_panelfiltros_Collapsed ;
   private boolean Dvpanel_panelfiltros_Showcollapseicon ;
   private boolean Dvpanel_panelfiltros_Autoscroll ;
   private boolean Gridmrec_alertasdtspaginationbar_Showfirst ;
   private boolean Gridmrec_alertasdtspaginationbar_Showprevious ;
   private boolean Gridmrec_alertasdtspaginationbar_Shownext ;
   private boolean Gridmrec_alertasdtspaginationbar_Showlast ;
   private boolean Gridmrec_alertasdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Cronometro_Enabled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV73 ;
   private boolean gx_refresh_fired ;
   private boolean n1665ParFasDsc ;
   private boolean n606MaqDsc ;
   private String wcpOAV64MaqCodJson ;
   private String wcpOAV22FasCodJSon ;
   private String wcpOAV75ParFasCodJSon ;
   private String AV64MaqCodJson ;
   private String AV22FasCodJSon ;
   private String AV75ParFasCodJSon ;
   private String AV14DatosJson ;
   private GXSimpleCollection<Short> AV73ParFasCod ;
   private com.genexus.webpanels.GXWebGrid Gridmrec_alertasdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridmrec_alertasdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridmrec_alertasdtsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfiltros ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucUsercontrol1 ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdts_empowerer ;
   private com.genexus.webpanels.GXUserControl ucCronometro ;
   private HTMLChoice cmbavSegundos ;
   private ICheckbox chkavFuerarango ;
   private IDataStoreProvider pr_default ;
   private String[] H01WC2_A396EmprCod ;
   private short[] H01WC2_A1664ParFasCod ;
   private String[] H01WC2_A1665ParFasDsc ;
   private boolean[] H01WC2_n1665ParFasDsc ;
   private int[] H01WC3_A129BarCod ;
   private byte[] H01WC3_A132BarCodReo ;
   private String[] H01WC3_A130BarCodPar ;
   private short[] H01WC3_A14152MEnvOrd ;
   private short[] H01WC3_A1664ParFasCod ;
   private String[] H01WC3_A396EmprCod ;
   private String[] H01WC4_A396EmprCod ;
   private String[] H01WC4_A457FasCod ;
   private String[] H01WC4_A460FasDsc ;
   private int[] H01WC5_A129BarCod ;
   private byte[] H01WC5_A132BarCodReo ;
   private String[] H01WC5_A130BarCodPar ;
   private short[] H01WC5_A14152MEnvOrd ;
   private String[] H01WC5_A457FasCod ;
   private String[] H01WC5_A396EmprCod ;
   private String[] H01WC6_A396EmprCod ;
   private String[] H01WC6_A602MaqCod ;
   private String[] H01WC6_A606MaqDsc ;
   private boolean[] H01WC6_n606MaqDsc ;
   private int[] H01WC7_A129BarCod ;
   private byte[] H01WC7_A132BarCodReo ;
   private String[] H01WC7_A130BarCodPar ;
   private short[] H01WC7_A14152MEnvOrd ;
   private String[] H01WC7_A14154MEnvMaqCod ;
   private String[] H01WC7_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV62MaqCod ;
   private GXSimpleCollection<String> AV20FasCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV63MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV21FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV74ParFasCod_Data ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV12Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXt_objcol_SdtMRec_AlertaSDT_Item7 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXv_objcol_SdtMRec_AlertaSDT_Item8[] ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV18Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV72Parameters ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV8Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.SdtQueryViewerDragAndDropData AV16DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV23FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV57ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV58ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV59ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV60ItemExpandData ;
}

final  class mrec_alerta2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WC2", "SELECT EmprCod, ParFasCod, ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WC3", "SELECT * FROM (SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod, EmprCod FROM TXPMPEnv WHERE EmprCod = ? and ParFasCod = ? ORDER BY EmprCod, ParFasCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01WC4", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WC5", "SELECT * FROM (SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, FasCod, EmprCod FROM TXPMEnv WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01WC6", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WC7", "SELECT * FROM (SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MEnvMaqCod, EmprCod FROM TXPMEnv WHERE EmprCod = ? and MEnvMaqCod = ? ORDER BY EmprCod, MEnvMaqCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

